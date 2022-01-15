package org.omg.zx.managedElement;
/**
 *	Generated from IDL definition of enum "MEModel_T"
 *	@author JacORB IDL compiler 
 */

public final class MEModel_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public MEModel_T value;

	public MEModel_THolder ()
	{
	}
	public MEModel_THolder (final MEModel_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MEModel_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MEModel_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MEModel_THelper.write (out,value);
	}
}
