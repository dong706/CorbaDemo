package org.omg.hw.trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "TrafficConditioningProfileDeassign_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficConditioningProfileDeassign_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassign_T value;

	public TrafficConditioningProfileDeassign_THolder ()
	{
	}
	public TrafficConditioningProfileDeassign_THolder(final org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassign_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassign_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassign_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassign_THelper.write(_out, value);
	}
}
