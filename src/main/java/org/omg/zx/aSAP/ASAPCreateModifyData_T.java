package org.omg.zx.aSAP;

/**
 *	Generated from IDL definition of struct "ASAPCreateModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class ASAPCreateModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ASAPCreateModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public org.omg.zx.aSAP.AlarmSeverityAssignment_T[] alarmSeverityAssignmentList;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ASAPCreateModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.omg.zx.aSAP.AlarmSeverityAssignment_T[] alarmSeverityAssignmentList, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.alarmSeverityAssignmentList = alarmSeverityAssignmentList;
		this.additionalInfo = additionalInfo;
	}
}
