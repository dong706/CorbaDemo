package org.omg.zx.fileTransfer;
/**
 *	Generated from IDL definition of enum "FTPFileType_T"
 *	@author JacORB IDL compiler 
 */

public final class FTPFileType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.zx.fileTransfer.FTPFileType_THelper.id(),"FTPFileType_T",new String[]{"FT_HISTORYALARM","FT_HISTORYPERFOMANCE","FT_LOG","FT_PSE"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.fileTransfer.FTPFileType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.fileTransfer.FTPFileType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/fileTransfer/FTPFileType_T:1.0";
	}
	public static FTPFileType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return FTPFileType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final FTPFileType_T s)
	{
		out.write_long(s.value());
	}
}
