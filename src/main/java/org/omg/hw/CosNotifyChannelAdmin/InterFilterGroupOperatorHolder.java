package org.omg.hw.CosNotifyChannelAdmin;
/**
 *	Generated from IDL definition of enum "InterFilterGroupOperator"
 *	@author JacORB IDL compiler 
 */

public final class InterFilterGroupOperatorHolder
	implements org.omg.CORBA.portable.Streamable
{
	public InterFilterGroupOperator value;

	public InterFilterGroupOperatorHolder ()
	{
	}
	public InterFilterGroupOperatorHolder (final InterFilterGroupOperator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return InterFilterGroupOperatorHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InterFilterGroupOperatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		InterFilterGroupOperatorHelper.write (out,value);
	}
}
