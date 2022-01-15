package org.omg.zx.fileTransfer;
/**
 *	Generated from IDL definition of enum "FTPFileType_T"
 *	@author JacORB IDL compiler 
 */

public final class FTPFileType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public FTPFileType_T value;

	public FTPFileType_THolder ()
	{
	}
	public FTPFileType_THolder (final FTPFileType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FTPFileType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FTPFileType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FTPFileType_THelper.write (out,value);
	}
}
