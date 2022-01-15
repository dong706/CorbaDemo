package org.omg.hw.trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "HW_TCProfile_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_TCProfile_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.trafficConditioningProfile.HW_TCProfile_T value;

	public HW_TCProfile_THolder ()
	{
	}
	public HW_TCProfile_THolder(final org.omg.hw.trafficConditioningProfile.HW_TCProfile_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.trafficConditioningProfile.HW_TCProfile_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.trafficConditioningProfile.HW_TCProfile_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.trafficConditioningProfile.HW_TCProfile_THelper.write(_out, value);
	}
}
