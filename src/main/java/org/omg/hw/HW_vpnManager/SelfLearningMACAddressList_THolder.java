package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of alias "SelfLearningMACAddressList_T"
 *	@author JacORB IDL compiler 
 */

public final class SelfLearningMACAddressList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_vpnManager.SelfLearningMACAddress_T[] value;

	public SelfLearningMACAddressList_THolder ()
	{
	}
	public SelfLearningMACAddressList_THolder (final org.omg.hw.HW_vpnManager.SelfLearningMACAddress_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SelfLearningMACAddressList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SelfLearningMACAddressList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SelfLearningMACAddressList_THelper.write (out,value);
	}
}
