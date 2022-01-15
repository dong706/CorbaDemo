package org.omg.zx.subscription;
/**
 *	Generated from IDL definition of enum "SubscriptionState_T"
 *	@author JacORB IDL compiler 
 */

public final class SubscriptionState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public SubscriptionState_T value;

	public SubscriptionState_THolder ()
	{
	}
	public SubscriptionState_THolder (final SubscriptionState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SubscriptionState_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SubscriptionState_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SubscriptionState_THelper.write (out,value);
	}
}
