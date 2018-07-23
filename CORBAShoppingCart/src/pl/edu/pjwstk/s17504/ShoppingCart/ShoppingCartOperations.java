package pl.edu.pjwstk.s17504.ShoppingCart;


/**
* pl/edu/pjwstk/s17504/ShoppingCart/ShoppingCartOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ShoppingCart.idl
* pi�tek, 29 czerwca 2018 21:56:28 CEST
*/

public interface ShoppingCartOperations 
{
  pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartItem[] cart_items ();
  pl.edu.pjwstk.s17504.ShoppingCart.Product[] getProducts ();
  void addProductToCart (pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartItem cart_items);
  pl.edu.pjwstk.s17504.ShoppingCart.Product newProduct (int id, String name, int amountOfStock);
  void removeProduct (int id);
  void changeProductAmount (pl.edu.pjwstk.s17504.ShoppingCart.Product product, int amountOfStock);
  void checkOut ();
  pl.edu.pjwstk.s17504.ShoppingCart.Product find_product (int id) throws pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartPackage.ProductUnavailable;
} // interface ShoppingCartOperations