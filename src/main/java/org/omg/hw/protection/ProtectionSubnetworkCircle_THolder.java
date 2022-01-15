package org.omg.hw.protection;

/**
 *	Generated from IDL definition of alias "ProtectionSubnetworkCircle_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionSubnetworkCircle_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.protection.ProtectionSubnetworkLink_T[][] value;

	public ProtectionSubnetworkCircle_THolder ()
	{
	}
	public ProtectionSubnetworkCircle_THolder (final org.omg.hw.protection.ProtectionSubnetworkLink_T[][] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProtectionSubnetworkCircle_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionSubnetworkCircle_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProtectionSubnetworkCircle_THelper.write (out,value);
	}
}
