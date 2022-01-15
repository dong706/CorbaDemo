package org.omg.zx.globaldefs;

/**
 *	Generated from IDL definition of exception "ProcessingFailureException"
 *	@author JacORB IDL compiler 
 */

public final class ProcessingFailureExceptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.globaldefs.ProcessingFailureException value;

	public ProcessingFailureExceptionHolder ()
	{
	}
	public ProcessingFailureExceptionHolder(final org.omg.zx.globaldefs.ProcessingFailureException initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, value);
	}
}
