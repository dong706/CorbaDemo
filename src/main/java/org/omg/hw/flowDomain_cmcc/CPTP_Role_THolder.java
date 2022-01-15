package org.omg.hw.flowDomain_cmcc;
/**
 *	Generated from IDL definition of enum "CPTP_Role_T"
 *	@author JacORB IDL compiler 
 */

public final class CPTP_Role_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public CPTP_Role_T value;

	public CPTP_Role_THolder ()
	{
	}
	public CPTP_Role_THolder (final CPTP_Role_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CPTP_Role_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CPTP_Role_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CPTP_Role_THelper.write (out,value);
	}
}
