package org.omg.zx.subscription;

/**
 *	Generated from IDL interface "EMSSubscriptionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class EMSSubscriptionMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public EMSSubscriptionMgr_I value;
	public EMSSubscriptionMgr_IHolder()
	{
	}
	public EMSSubscriptionMgr_IHolder (final EMSSubscriptionMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EMSSubscriptionMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EMSSubscriptionMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EMSSubscriptionMgr_IHelper.write (_out,value);
	}
}
