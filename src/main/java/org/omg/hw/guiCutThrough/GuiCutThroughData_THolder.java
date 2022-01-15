package org.omg.hw.guiCutThrough;

/**
 *	Generated from IDL definition of struct "GuiCutThroughData_T"
 *	@author JacORB IDL compiler 
 */

public final class GuiCutThroughData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.guiCutThrough.GuiCutThroughData_T value;

	public GuiCutThroughData_THolder ()
	{
	}
	public GuiCutThroughData_THolder(final org.omg.hw.guiCutThrough.GuiCutThroughData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.guiCutThrough.GuiCutThroughData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.guiCutThrough.GuiCutThroughData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.guiCutThrough.GuiCutThroughData_THelper.write(_out, value);
	}
}
