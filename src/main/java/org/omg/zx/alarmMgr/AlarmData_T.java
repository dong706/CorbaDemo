package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of struct "AlarmData_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public AlarmData_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] alarmSource;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] alarmDetectInfo;
	public java.lang.String probableCause;
	public org.omg.zx.alarmMgr.AlarmType_T alarmType;
	public org.omg.zx.alarmMgr.PerceivedSeverity_T perceivedSeverity;
	public short layerRate;
	public java.lang.String raiseTime;
	public java.lang.String clearTime;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] additionalInfo;
	public AlarmData_T(org.omg.zx.globaldefs.NameAndStringValue_T[] alarmSource, org.omg.zx.globaldefs.NameAndStringValue_T[] alarmDetectInfo, java.lang.String probableCause, org.omg.zx.alarmMgr.AlarmType_T alarmType, org.omg.zx.alarmMgr.PerceivedSeverity_T perceivedSeverity, short layerRate, java.lang.String raiseTime, java.lang.String clearTime, org.omg.zx.globaldefs.NameAndStringValue_T[][] additionalInfo)
	{
		this.alarmSource = alarmSource;
		this.alarmDetectInfo = alarmDetectInfo;
		this.probableCause = probableCause;
		this.alarmType = alarmType;
		this.perceivedSeverity = perceivedSeverity;
		this.layerRate = layerRate;
		this.raiseTime = raiseTime;
		this.clearTime = clearTime;
		this.additionalInfo = additionalInfo;
	}
}
