package org.omg.hw.CosNotification;
/**
 *	Generated from IDL definition of enum "QoSError_code"
 *	@author JacORB IDL compiler 
 */

public final class QoSError_codeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public QoSError_code value;

	public QoSError_codeHolder ()
	{
	}
	public QoSError_codeHolder (final QoSError_code initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return QoSError_codeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QoSError_codeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		QoSError_codeHelper.write (out,value);
	}
}
