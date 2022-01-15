package org.omg.hw.trafficConditioningProfile;

/**
 *	Generated from IDL definition of alias "TCProfileList_T"
 *	@author JacORB IDL compiler 
 */

public final class TCProfileList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.trafficConditioningProfile.TCProfile_T[] value;

	public TCProfileList_THolder ()
	{
	}
	public TCProfileList_THolder (final org.omg.hw.trafficConditioningProfile.TCProfile_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TCProfileList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TCProfileList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TCProfileList_THelper.write (out,value);
	}
}
