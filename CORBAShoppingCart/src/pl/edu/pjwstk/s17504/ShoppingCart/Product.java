package pl.edu.pjwstk.s17504.ShoppingCart;


/**
* pl/edu/pjwstk/s17504/ShoppingCart/Product.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ShoppingCart.idl
* pi�tek, 29 czerwca 2018 21:56:28 CEST
*/

public final class Product implements org.omg.CORBA.portable.IDLEntity
{
  public int id = (int)0;
  public String name = null;
  public int amountOfStock = (int)0;

  public Product ()
  {
  } // ctor

  public Product (int _id, String _name, int _amountOfStock)
  {
    id = _id;
    name = _name;
    amountOfStock = _amountOfStock;
  } // ctor

} // class Product
