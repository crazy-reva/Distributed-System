package FrontEnd.MovieTicketBooking;

/**
 * MovieTicketBooking/MovieTicketBookingInterfaceHelper.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from ./idl
 * Sunday, April 9, 2023 5:21:16 o'clock PM EDT
 */

public abstract class MovieTicketBookingInterfaceHelper {

  private static String _id =
    "IDL:MovieTicketBooking/MovieTicketBookingInterface:1.0";

  public static void insert(
    org.omg.CORBA.Any a,
    MovieTicketBookingInterface that
  ) {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
    a.type(type());
    write(out, that);
    a.read_value(out.create_input_stream(), type());
  }

  public static MovieTicketBookingInterface extract(org.omg.CORBA.Any a) {
    return read(a.create_input_stream());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;

  public static synchronized org.omg.CORBA.TypeCode type() {
    if (__typeCode == null) {
      __typeCode =
        org.omg.CORBA.ORB
          .init()
          .create_interface_tc(
            MovieTicketBookingInterfaceHelper.id(),
            "MovieTicketBookingInterface"
          );
    }
    return __typeCode;
  }

  public static String id() {
    return _id;
  }

  public static MovieTicketBookingInterface read(
    org.omg.CORBA.portable.InputStream istream
  ) {
    return narrow(istream.read_Object(_MovieTicketBookingInterfaceStub.class));
  }

  public static void write(
    org.omg.CORBA.portable.OutputStream ostream,
    MovieTicketBookingInterface value
  ) {
    ostream.write_Object((org.omg.CORBA.Object) value);
  }

  public static MovieTicketBookingInterface narrow(org.omg.CORBA.Object obj) {
    if (obj == null) return null; else if (
      obj instanceof MovieTicketBookingInterface
    ) return (MovieTicketBookingInterface) obj; else if (
      !obj._is_a(id())
    ) throw new org.omg.CORBA.BAD_PARAM(); else {
      org.omg.CORBA.portable.Delegate delegate =
        ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate();
      _MovieTicketBookingInterfaceStub stub = new _MovieTicketBookingInterfaceStub();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static MovieTicketBookingInterface unchecked_narrow(
    org.omg.CORBA.Object obj
  ) {
    if (obj == null) return null; else if (
      obj instanceof MovieTicketBookingInterface
    ) return (MovieTicketBookingInterface) obj; else {
      org.omg.CORBA.portable.Delegate delegate =
        ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate();
      _MovieTicketBookingInterfaceStub stub = new _MovieTicketBookingInterfaceStub();
      stub._set_delegate(delegate);
      return stub;
    }
  }
}
