package pl.edu.pjwstk.s17504.ShoppingCart.service;

import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import pl.edu.pjwstk.s17504.ShoppingCart.*;
import pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartPackage.ProductUnavailable;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) throws ProductUnavailable {
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);

		try {
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContext ncRef = NamingContextHelper.narrow(objRef);
			NameComponent nc = new NameComponent("ShoppingCart", "");
			NameComponent path[] = { nc };
			ShoppingCart proxy = ShoppingCartHelper.narrow(ncRef.resolve(path));

			System.out.println("Welcome to CORBA Shopping Center");
			System.out.println("<---------------------------------------->");
			System.out.println("Available products:");
			Product[] products = proxy.getProducts();
			for (int i = 0; i < products.length; i++) {
				System.out.println("Product(id: " + products[i].id + ", name: " + products[i].name + ", amountOfStock: "
						+ products[i].amountOfStock + ")");
			}
			;
			System.out.println("<---------------------------------------->");
			Product prod = proxy.find_product(1);
			System.out.println("Your searched product is: " + proxy.find_product(1).name);
			System.out.println("<---------------------------------------->");
			Product prod2 = proxy.find_product(2);
			System.out.println("Your searched product is: " + proxy.find_product(2).name);
			System.out.println("<---------------------------------------->");
			Product prod3 = proxy.newProduct(5, "water", 10);
			System.out.println(prod2.amountOfStock);
			proxy.changeProductAmount(prod2, 20);
			System.out.println("<---------------------------------------->");
			proxy.addProductToCart(new ShoppingCartItem(3, prod));
			System.out.println("You've added product to the Shopping Cart: " + prod.name);
			proxy.addProductToCart(new ShoppingCartItem(5, prod2));
			System.out.println("You've added product to the Shopping Cart: " + prod2.name);
			proxy.addProductToCart(new ShoppingCartItem(2, prod3));
			System.out.println("You've added product to the Shopping Cart: " + prod3.name);
			System.out.println("<---------------------------------------->");

			System.out.println("ShoppingCart:");
			List<ShoppingCartItem> shoppingCart = new ArrayList<>();
			ShoppingCartItem[] cart_items = proxy.cart_items();
			for (int i = 0; i < cart_items.length; i++) {
				System.out.println("ShoppingCartItem(amount: " + cart_items[i].amount + ", Product(id: "
						+ cart_items[i].product.id + ", name: " + cart_items[i].product.name + "))");
				shoppingCart.add(cart_items[i]);
			}

			System.out.println("<---------------------------------------->");
			System.out.println("Shoping Cart size: " + proxy.cart_items().length);
			System.out.println("<---------------------------------------->");

			proxy.removeProduct(1);
			System.out.println("You've removed product from the Shopping Cart: " + proxy.find_product(1).name);
			System.out.println("<---------------------------------------->");
			System.out.println("ShoppingCart:");
			cart_items = proxy.cart_items();
			for (int i = 0; i < cart_items.length; i++) {				
				System.out.println("ShoppingCartItem(amount: " + cart_items[i].amount + ", Product(id: "
						+ cart_items[i].product.id + ", name: " + cart_items[i].product.name + "))");
			}
			
			System.out.println("Shoping Cart size: " + proxy.cart_items().length);
			System.out.println("<---------------------------------------->");

			System.out.println("Checkout");
			proxy.checkOut();

			System.out.println("<---------------------------------------->");
			System.out.println("Shoping Cart size: " + proxy.cart_items().length);

		} catch (InvalidName | NotFound | org.omg.CosNaming.NamingContextPackage.InvalidName
				| CannotProceed invalidName) {
			invalidName.printStackTrace();
		}

	}
}
