package org.omg.zx.fileTransfer;

/**
 *	Generated from IDL interface "FileTransferMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class FileTransferMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public FileTransferMgr_I value;
	public FileTransferMgr_IHolder()
	{
	}
	public FileTransferMgr_IHolder (final FileTransferMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FileTransferMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FileTransferMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FileTransferMgr_IHelper.write (_out,value);
	}
}
