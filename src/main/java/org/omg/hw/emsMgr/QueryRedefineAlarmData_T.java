package org.omg.hw.emsMgr;

/**
 *	Generated from IDL definition of struct "QueryRedefineAlarmData_T"
 *	@author JacORB IDL compiler 
 */

public final class QueryRedefineAlarmData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public QueryRedefineAlarmData_T(){}
	public int ruleID;
	public int groupID;
	public int alarmID;
	public QueryRedefineAlarmData_T(int ruleID, int groupID, int alarmID)
	{
		this.ruleID = ruleID;
		this.groupID = groupID;
		this.alarmID = alarmID;
	}
}
