package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of alias "TransmissionRouteList_T"
 *	@author JacORB IDL compiler 
 */

public final class TransmissionRouteList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.emsMgr.TransmissionRoute_T[] value;

	public TransmissionRouteList_THolder ()
	{
	}
	public TransmissionRouteList_THolder (final org.omg.zx.emsMgr.TransmissionRoute_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TransmissionRouteList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransmissionRouteList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TransmissionRouteList_THelper.write (out,value);
	}
}
