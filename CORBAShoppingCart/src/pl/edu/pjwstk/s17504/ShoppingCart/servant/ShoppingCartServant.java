package pl.edu.pjwstk.s17504.ShoppingCart.servant;

import java.util.ArrayList;
import java.util.List;

import pl.edu.pjwstk.s17504.ShoppingCart.Product;
import pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartItem;
import pl.edu.pjwstk.s17504.ShoppingCart._ShoppingCartImplBase;
import pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartPackage.ProductUnavailable;

public class ShoppingCartServant extends _ShoppingCartImplBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<ShoppingCartItem> shoppingCartList = new ArrayList<>();
	List<Product> productList = new ArrayList<>();

	@Override
	public ShoppingCartItem[] cart_items() {
		ShoppingCartItem[] cartItems = new ShoppingCartItem[this.shoppingCartList.size()];
		return this.shoppingCartList.toArray(cartItems);
	}

	@Override
	public void checkOut() {
		this.shoppingCartList.clear();
	}

	@Override
	public Product newProduct(int id, String name, int amountOfStock) {
		Product product = new Product();
		product.id = id;
		product.name = name;
		product.amountOfStock = amountOfStock;
		return product;

	}

	@Override
	public Product[] getProducts() {
		addOrder();
		Product[] products = new Product[this.productList.size()];
		return productList.toArray(products);
	}

	private void addOrder() {
		this.productList.add(new Product(1, "bread", 200));
		this.productList.add(new Product(2, "butter", 150));
		this.productList.add(new Product(3, "peanuts", 100));
		this.productList.add(new Product(4, "milk", 200));
	}

	@Override
	public void changeProductAmount(Product product, int amountOfStock) {
		product.amountOfStock = amountOfStock;
		System.out.println("New stock amount for product " + product.name + ": " + amountOfStock);

	}

	@Override
	public Product find_product(int id) throws ProductUnavailable {
		for (Product product : productList) {
			if (product.id == id) {
				return product;
			}
		}
		throw new ProductUnavailable("Product not found, try again...");
	}

	@Override
	public void removeProduct(int id) {
		int prodId = id -1;
		this.shoppingCartList.remove(prodId);
	}

	@Override
	public void addProductToCart(ShoppingCartItem cart_items) {
		// TODO Auto-generated method stub
		this.shoppingCartList.add(cart_items);
	}

}
