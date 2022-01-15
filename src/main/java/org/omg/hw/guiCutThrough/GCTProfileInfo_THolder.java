package org.omg.hw.guiCutThrough;

/**
 *	Generated from IDL definition of struct "GCTProfileInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class GCTProfileInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.guiCutThrough.GCTProfileInfo_T value;

	public GCTProfileInfo_THolder ()
	{
	}
	public GCTProfileInfo_THolder(final org.omg.hw.guiCutThrough.GCTProfileInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.guiCutThrough.GCTProfileInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.guiCutThrough.GCTProfileInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.guiCutThrough.GCTProfileInfo_THelper.write(_out, value);
	}
}
