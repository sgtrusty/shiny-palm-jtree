package mserver;


/**
* mserver/recollectorHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/thisi/Desktop/tareas/Java/corba-interfc/src/main/java/Recollector.idl
* Monday, October 28, 2019 2:33:09 PM PDT
*/

abstract public class recollectorHelper
{
  private static String  _id = "IDL:mserver/recollector:1.0";

  public static void insert (org.omg.CORBA.Any a, mserver.recollector that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static mserver.recollector extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (mserver.recollectorHelper.id (), "recollector");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static mserver.recollector read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_recollectorStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, mserver.recollector value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static mserver.recollector narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof mserver.recollector)
      return (mserver.recollector)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      mserver._recollectorStub stub = new mserver._recollectorStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static mserver.recollector unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof mserver.recollector)
      return (mserver.recollector)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      mserver._recollectorStub stub = new mserver._recollectorStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
