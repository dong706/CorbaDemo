package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of struct "TCAData_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCAData_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] alarmSource;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] alarmDetectInfo;
	public java.lang.String granularity;
	public java.lang.String pmParameter;
	public org.omg.zx.performance.PMMeasurement_T performanceValue;
	public org.omg.zx.performance.PMMeasurement_T thresholdValue;
	public org.omg.zx.performance.PMThresholdType_T thresholdType;
	public org.omg.zx.alarmMgr.PerceivedSeverity_T perceivedSeverity;
	public short layerRate;
	public java.lang.String raiseTime;
	public java.lang.String clearTime;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] additionalInfo;
	public TCAData_T(org.omg.zx.globaldefs.NameAndStringValue_T[] alarmSource, org.omg.zx.globaldefs.NameAndStringValue_T[] alarmDetectInfo, java.lang.String granularity, java.lang.String pmParameter, org.omg.zx.performance.PMMeasurement_T performanceValue, org.omg.zx.performance.PMMeasurement_T thresholdValue, org.omg.zx.performance.PMThresholdType_T thresholdType, org.omg.zx.alarmMgr.PerceivedSeverity_T perceivedSeverity, short layerRate, java.lang.String raiseTime, java.lang.String clearTime, org.omg.zx.globaldefs.NameAndStringValue_T[][] additionalInfo)
	{
		this.alarmSource = alarmSource;
		this.alarmDetectInfo = alarmDetectInfo;
		this.granularity = granularity;
		this.pmParameter = pmParameter;
		this.performanceValue = performanceValue;
		this.thresholdValue = thresholdValue;
		this.thresholdType = thresholdType;
		this.perceivedSeverity = perceivedSeverity;
		this.layerRate = layerRate;
		this.raiseTime = raiseTime;
		this.clearTime = clearTime;
		this.additionalInfo = additionalInfo;
	}
}
