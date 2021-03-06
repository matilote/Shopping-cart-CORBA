package pl.edu.pjwstk.s17504.ShoppingCart;


/**
* pl/edu/pjwstk/s17504/ShoppingCart/_ShoppingCartStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ShoppingCart.idl
* pi�tek, 29 czerwca 2018 21:56:28 CEST
*/

public class _ShoppingCartStub extends org.omg.CORBA.portable.ObjectImpl implements pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCart
{

  public pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartItem[] cart_items ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_cart_items", true);
                $in = _invoke ($out);
                pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartItem $result[] = pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartItemsHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return cart_items (        );
            } finally {
                _releaseReply ($in);
            }
  } // cart_items

  public pl.edu.pjwstk.s17504.ShoppingCart.Product[] getProducts ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_getProducts", true);
                $in = _invoke ($out);
                pl.edu.pjwstk.s17504.ShoppingCart.Product $result[] = pl.edu.pjwstk.s17504.ShoppingCart.ProductsHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getProducts (        );
            } finally {
                _releaseReply ($in);
            }
  } // getProducts

  public void addProductToCart (pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartItem cart_items)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("addProductToCart", true);
                pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartItemHelper.write ($out, cart_items);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                addProductToCart (cart_items        );
            } finally {
                _releaseReply ($in);
            }
  } // addProductToCart

  public pl.edu.pjwstk.s17504.ShoppingCart.Product newProduct (int id, String name, int amountOfStock)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("newProduct", true);
                $out.write_long (id);
                $out.write_string (name);
                $out.write_long (amountOfStock);
                $in = _invoke ($out);
                pl.edu.pjwstk.s17504.ShoppingCart.Product $result = pl.edu.pjwstk.s17504.ShoppingCart.ProductHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return newProduct (id, name, amountOfStock        );
            } finally {
                _releaseReply ($in);
            }
  } // newProduct

  public void removeProduct (int id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("removeProduct", true);
                $out.write_long (id);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                removeProduct (id        );
            } finally {
                _releaseReply ($in);
            }
  } // removeProduct

  public void changeProductAmount (pl.edu.pjwstk.s17504.ShoppingCart.Product product, int amountOfStock)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("changeProductAmount", true);
                pl.edu.pjwstk.s17504.ShoppingCart.ProductHelper.write ($out, product);
                $out.write_long (amountOfStock);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                changeProductAmount (product, amountOfStock        );
            } finally {
                _releaseReply ($in);
            }
  } // changeProductAmount

  public void checkOut ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("checkOut", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                checkOut (        );
            } finally {
                _releaseReply ($in);
            }
  } // checkOut

  public pl.edu.pjwstk.s17504.ShoppingCart.Product find_product (int id) throws pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartPackage.ProductUnavailable
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("find_product", true);
                $out.write_long (id);
                $in = _invoke ($out);
                pl.edu.pjwstk.s17504.ShoppingCart.Product $result = pl.edu.pjwstk.s17504.ShoppingCart.ProductHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:pl/edu/pjwstk/s17504/ShoppingCart/ShoppingCart/ProductUnavailable:1.0"))
                    throw pl.edu.pjwstk.s17504.ShoppingCart.ShoppingCartPackage.ProductUnavailableHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return find_product (id        );
            } finally {
                _releaseReply ($in);
            }
  } // find_product

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:pl/edu/pjwstk/s17504/ShoppingCart/ShoppingCart:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ShoppingCartStub
