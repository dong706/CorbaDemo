package org.omg.zx.fileTransfer;
/**
 *	Generated from IDL definition of enum "FTPFileType_T"
 *	@author JacORB IDL compiler 
 */

public final class FTPFileType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _FT_HISTORYALARM = 0;
	public static final FTPFileType_T FT_HISTORYALARM = new FTPFileType_T(_FT_HISTORYALARM);
	public static final int _FT_HISTORYPERFOMANCE = 1;
	public static final FTPFileType_T FT_HISTORYPERFOMANCE = new FTPFileType_T(_FT_HISTORYPERFOMANCE);
	public static final int _FT_LOG = 2;
	public static final FTPFileType_T FT_LOG = new FTPFileType_T(_FT_LOG);
	public static final int _FT_PSE = 3;
	public static final FTPFileType_T FT_PSE = new FTPFileType_T(_FT_PSE);
	public int value()
	{
		return value;
	}
	public static FTPFileType_T from_int(int value)
	{
		switch (value) {
			case _FT_HISTORYALARM: return FT_HISTORYALARM;
			case _FT_HISTORYPERFOMANCE: return FT_HISTORYPERFOMANCE;
			case _FT_LOG: return FT_LOG;
			case _FT_PSE: return FT_PSE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _FT_HISTORYALARM: return "FT_HISTORYALARM";
			case _FT_HISTORYPERFOMANCE: return "FT_HISTORYPERFOMANCE";
			case _FT_LOG: return "FT_LOG";
			case _FT_PSE: return "FT_PSE";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected FTPFileType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
