package org.omg.zx.performance;
/**
 *	Generated from IDL definition of enum "PMMonitorOrReportStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class PMMonitorOrReportStatus_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public PMMonitorOrReportStatus_T value;

	public PMMonitorOrReportStatus_THolder ()
	{
	}
	public PMMonitorOrReportStatus_THolder (final PMMonitorOrReportStatus_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMMonitorOrReportStatus_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMMonitorOrReportStatus_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMMonitorOrReportStatus_THelper.write (out,value);
	}
}
