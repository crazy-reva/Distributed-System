package MovieTicketBooking;


/**
* MovieTicketBooking/_MovieTicketBookingInterfaceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./MovieTicketBooking.idl
* Monday, 3 April, 2023 3:39:14 PM EDT
*/

public class _MovieTicketBookingInterfaceStub extends org.omg.CORBA.portable.ObjectImpl implements MovieTicketBooking.MovieTicketBookingInterface
{

  public String addMovieSlots (String movieID, String movieName, int bookingCapacity)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("addMovieSlots", true);
                $out.write_string (movieID);
                $out.write_string (movieName);
                $out.write_long (bookingCapacity);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return addMovieSlots (movieID, movieName, bookingCapacity        );
            } finally {
                _releaseReply ($in);
            }
  } // addMovieSlots

  public String removeMovieSlots (String movieID, String movieName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("removeMovieSlots", true);
                $out.write_string (movieID);
                $out.write_string (movieName);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return removeMovieSlots (movieID, movieName        );
            } finally {
                _releaseReply ($in);
            }
  } // removeMovieSlots

  public String listMovieShowsAvailability (String movieName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("listMovieShowsAvailability", true);
                $out.write_string (movieName);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return listMovieShowsAvailability (movieName        );
            } finally {
                _releaseReply ($in);
            }
  } // listMovieShowsAvailability


  //customer & admin
  public String bookMovieTickets (String customerID, String movieID, String movieName, int numberOfTickets)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("bookMovieTickets", true);
                $out.write_string (customerID);
                $out.write_string (movieID);
                $out.write_string (movieName);
                $out.write_long (numberOfTickets);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return bookMovieTickets (customerID, movieID, movieName, numberOfTickets        );
            } finally {
                _releaseReply ($in);
            }
  } // bookMovieTickets

  public String getBookingSchedule (String customerID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getBookingSchedule", true);
                $out.write_string (customerID);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getBookingSchedule (customerID        );
            } finally {
                _releaseReply ($in);
            }
  } // getBookingSchedule

  public String cancelMovieTickets (String customerID, String movieID, String movieName, int numberOfTickets)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("cancelMovieTickets", true);
                $out.write_string (customerID);
                $out.write_string (movieID);
                $out.write_string (movieName);
                $out.write_long (numberOfTickets);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return cancelMovieTickets (customerID, movieID, movieName, numberOfTickets        );
            } finally {
                _releaseReply ($in);
            }
  } // cancelMovieTickets

  public boolean validateUser (String username, String password)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("validateUser", true);
                $out.write_string (username);
                $out.write_string (password);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return validateUser (username, password        );
            } finally {
                _releaseReply ($in);
            }
  } // validateUser

  public void setPortAndHost (String hostname, String port)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setPortAndHost", false);
                $out.write_string (hostname);
                $out.write_string (port);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setPortAndHost (hostname, port        );
            } finally {
                _releaseReply ($in);
            }
  } // setPortAndHost


  //                movieIdsList getAllMovieIds(in string movieName);
  public String getAllMovieNames ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getAllMovieNames", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getAllMovieNames (        );
            } finally {
                _releaseReply ($in);
            }
  } // getAllMovieNames

  public String getAllMovieIds (String movieName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getAllMovieIds", true);
                $out.write_string (movieName);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getAllMovieIds (movieName        );
            } finally {
                _releaseReply ($in);
            }
  } // getAllMovieIds

  public String exchangeTickets (String customerID, String old_movieName, String old_movieID, String new_movieID, String new_movieName, int numberOfTickets)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("exchangeTickets", true);
                $out.write_string (customerID);
                $out.write_string (old_movieName);
                $out.write_string (old_movieID);
                $out.write_string (new_movieID);
                $out.write_string (new_movieName);
                $out.write_long (numberOfTickets);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return exchangeTickets (customerID, old_movieName, old_movieID, new_movieID, new_movieName, numberOfTickets        );
            } finally {
                _releaseReply ($in);
            }
  } // exchangeTickets

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:MovieTicketBooking/MovieTicketBookingInterface:1.0"};

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
} // class _MovieTicketBookingInterfaceStub
