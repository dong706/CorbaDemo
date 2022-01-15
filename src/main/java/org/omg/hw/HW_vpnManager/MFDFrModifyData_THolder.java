package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "MFDFrModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class MFDFrModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.HW_vpnManager.MFDFrModifyData_T value;

	public MFDFrModifyData_THolder ()
	{
	}
	public MFDFrModifyData_THolder(final org.omg.hw.HW_vpnManager.MFDFrModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.HW_vpnManager.MFDFrModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.HW_vpnManager.MFDFrModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.HW_vpnManager.MFDFrModifyData_THelper.write(_out, value);
	}
}
