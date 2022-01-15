package org.omg.zx.managedElement;
/**
 *	Generated from IDL definition of enum "TCCapability_T"
 *	@author JacORB IDL compiler 
 */

public final class TCCapability_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public TCCapability_T value;

	public TCCapability_THolder ()
	{
	}
	public TCCapability_THolder (final TCCapability_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TCCapability_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TCCapability_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TCCapability_THelper.write (out,value);
	}
}
