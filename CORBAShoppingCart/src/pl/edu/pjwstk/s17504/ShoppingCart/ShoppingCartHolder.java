package pl.edu.pjwstk.s17504.ShoppingCart;

/**
* pl/edu/pjwstk/s17504/ShoppingCart/ShoppingCartHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ShoppingCart.idl
* pi�tek, 29 czerwca 2018 21:56:28 CEST
*/

public final class ShoppingCartHolder implements org.omg.CORBA.portable.Streamable
{
  public pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCart value = null;

  public ShoppingCartHolder ()
  {
  }

  public ShoppingCartHolder (pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCart initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartHelper.type ();
  }

}
