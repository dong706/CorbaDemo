package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL interface "HW_VPNMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class HW_VPNMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_VPNMgr_I value;
	public HW_VPNMgr_IHolder()
	{
	}
	public HW_VPNMgr_IHolder (final HW_VPNMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_VPNMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_VPNMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_VPNMgr_IHelper.write (_out,value);
	}
}
