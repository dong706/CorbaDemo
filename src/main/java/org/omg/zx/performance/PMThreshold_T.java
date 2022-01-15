package org.omg.zx.performance;

/**
 *	Generated from IDL definition of struct "PMThreshold_T"
 *	@author JacORB IDL compiler 
 */

public final class PMThreshold_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMThreshold_T(){}
	public org.omg.zx.performance.PMThresholdType_T thresholdType;
	public boolean triggerFlag;
	public float value;
	public java.lang.String unit = "";
	public PMThreshold_T(org.omg.zx.performance.PMThresholdType_T thresholdType, boolean triggerFlag, float value, java.lang.String unit)
	{
		this.thresholdType = thresholdType;
		this.triggerFlag = triggerFlag;
		this.value = value;
		this.unit = unit;
	}
}
