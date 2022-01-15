package org.omg.hw.emsMgr;

/**
 *	Generated from IDL definition of struct "RedefineAlarmData_T"
 *	@author JacORB IDL compiler 
 */

public final class RedefineAlarmData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RedefineAlarmData_T(){}
	public int ruleID;
	public int groupID;
	public int alarmID;
	public org.omg.hw.notifications.PerceivedSeverity_T redefinedSeverity;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] objectList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] redefineInfo;
	public RedefineAlarmData_T(int ruleID, int groupID, int alarmID, org.omg.hw.notifications.PerceivedSeverity_T redefinedSeverity, org.omg.hw.globaldefs.NameAndStringValue_T[][] objectList, org.omg.hw.globaldefs.NameAndStringValue_T[] redefineInfo)
	{
		this.ruleID = ruleID;
		this.groupID = groupID;
		this.alarmID = alarmID;
		this.redefinedSeverity = redefinedSeverity;
		this.objectList = objectList;
		this.redefineInfo = redefineInfo;
	}
}
