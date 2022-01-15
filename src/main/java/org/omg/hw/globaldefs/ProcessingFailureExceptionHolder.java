package org.omg.hw.globaldefs;

/**
 *	Generated from IDL definition of exception "ProcessingFailureException"
 *	@author JacORB IDL compiler 
 */

public final class ProcessingFailureExceptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.globaldefs.ProcessingFailureException value;

	public ProcessingFailureExceptionHolder ()
	{
	}
	public ProcessingFailureExceptionHolder(final org.omg.hw.globaldefs.ProcessingFailureException initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, value);
	}
}
