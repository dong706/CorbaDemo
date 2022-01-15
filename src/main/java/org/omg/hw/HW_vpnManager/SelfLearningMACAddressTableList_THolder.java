package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of alias "SelfLearningMACAddressTableList_T"
 *	@author JacORB IDL compiler 
 */

public final class SelfLearningMACAddressTableList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_vpnManager.SelfLearningMACAddressTable_T[] value;

	public SelfLearningMACAddressTableList_THolder ()
	{
	}
	public SelfLearningMACAddressTableList_THolder (final org.omg.hw.HW_vpnManager.SelfLearningMACAddressTable_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SelfLearningMACAddressTableList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SelfLearningMACAddressTableList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SelfLearningMACAddressTableList_THelper.write (out,value);
	}
}
