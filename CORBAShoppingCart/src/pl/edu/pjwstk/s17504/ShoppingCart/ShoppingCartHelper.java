package pl.edu.pjwstk.s17504.ShoppingCart;


/**
* pl/edu/pjwstk/s17504/ShoppingCart/ShoppingCartHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ShoppingCart.idl
* pi�tek, 29 czerwca 2018 21:56:28 CEST
*/

abstract public class ShoppingCartHelper
{
  private static String  _id = "IDL:pl/edu/pjwstk/s17504/ShoppingCart/ShoppingCart:1.0";

  public static void insert (org.omg.CORBA.Any a, pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCart that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCart extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartHelper.id (), "ShoppingCart");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCart read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ShoppingCartStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCart value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCart narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCart)
      return (pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCart)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      pl.edu.pjwstk.s17504.ShoppingCart._ShoppingCartStub stub = new pl.edu.pjwstk.s17504.ShoppingCart._ShoppingCartStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCart unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCart)
      return (pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCart)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      pl.edu.pjwstk.s17504.ShoppingCart._ShoppingCartStub stub = new pl.edu.pjwstk.s17504.ShoppingCart._ShoppingCartStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
