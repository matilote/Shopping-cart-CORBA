package pl.edu.pjwstk.s17504.ShoppingCart;

/**
* pl/edu/pjwstk/s17504/ShoppingCart/ShoppingCartItemHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ShoppingCart.idl
* pi�tek, 29 czerwca 2018 21:56:28 CEST
*/

public final class ShoppingCartItemHolder implements org.omg.CORBA.portable.Streamable
{
  public pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartItem value = null;

  public ShoppingCartItemHolder ()
  {
  }

  public ShoppingCartItemHolder (pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartItem initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartItemHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartItemHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartItemHelper.type ();
  }

}
