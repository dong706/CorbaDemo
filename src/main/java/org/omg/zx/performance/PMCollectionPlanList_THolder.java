package org.omg.zx.performance;

/**
 *	Generated from IDL definition of alias "PMCollectionPlanList_T"
 *	@author JacORB IDL compiler 
 */

public final class PMCollectionPlanList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.performance.PMCollectionPlan_T[] value;

	public PMCollectionPlanList_THolder ()
	{
	}
	public PMCollectionPlanList_THolder (final org.omg.zx.performance.PMCollectionPlan_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMCollectionPlanList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMCollectionPlanList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMCollectionPlanList_THelper.write (out,value);
	}
}
