package org.omg.zx.performance;

/**
 *	Generated from IDL definition of struct "PMTask_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTask_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMTask_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] taskName;
	public org.omg.zx.performance.PMCollectionPlan_T[] pmCollectionPlanList;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public PMTask_T(org.omg.zx.globaldefs.NameAndStringValue_T[] taskName, org.omg.zx.performance.PMCollectionPlan_T[] pmCollectionPlanList, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.taskName = taskName;
		this.pmCollectionPlanList = pmCollectionPlanList;
		this.additionalInfo = additionalInfo;
	}
}
