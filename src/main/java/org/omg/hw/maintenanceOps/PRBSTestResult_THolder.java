package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL definition of struct "PRBSTestResult_T"
 *	@author JacORB IDL compiler 
 */

public final class PRBSTestResult_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.maintenanceOps.PRBSTestResult_T value;

	public PRBSTestResult_THolder ()
	{
	}
	public PRBSTestResult_THolder(final org.omg.hw.maintenanceOps.PRBSTestResult_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.maintenanceOps.PRBSTestResult_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.maintenanceOps.PRBSTestResult_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.maintenanceOps.PRBSTestResult_THelper.write(_out, value);
	}
}
