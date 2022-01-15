package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of struct "QueryAlarmFilter_T"
 *	@author JacORB IDL compiler 
 */

public final class QueryAlarmFilter_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public QueryAlarmFilter_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] alarmSourceSelect;
	public org.omg.zx.alarmMgr.AlarmType_T[] alarmTypeSelect;
	public org.omg.zx.alarmMgr.PerceivedSeverity_T[] perceivedSeveritySelect;
	public java.lang.String[] probableCauseSelect;
	public org.omg.zx.globaldefs.Duration_T raiseTimeDuration;
	public org.omg.zx.globaldefs.Duration_T clearTimeDuration;
	public QueryAlarmFilter_T(org.omg.zx.globaldefs.NameAndStringValue_T[][] alarmSourceSelect, org.omg.zx.alarmMgr.AlarmType_T[] alarmTypeSelect, org.omg.zx.alarmMgr.PerceivedSeverity_T[] perceivedSeveritySelect, java.lang.String[] probableCauseSelect, org.omg.zx.globaldefs.Duration_T raiseTimeDuration, org.omg.zx.globaldefs.Duration_T clearTimeDuration)
	{
		this.alarmSourceSelect = alarmSourceSelect;
		this.alarmTypeSelect = alarmTypeSelect;
		this.perceivedSeveritySelect = perceivedSeveritySelect;
		this.probableCauseSelect = probableCauseSelect;
		this.raiseTimeDuration = raiseTimeDuration;
		this.clearTimeDuration = clearTimeDuration;
	}
}
