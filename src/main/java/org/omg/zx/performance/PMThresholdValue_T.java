package org.omg.zx.performance;

/**
 *	Generated from IDL definition of struct "PMThresholdValue_T"
 *	@author JacORB IDL compiler 
 */

public final class PMThresholdValue_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMThresholdValue_T(){}
	public java.lang.String pmParameter;
	public org.omg.zx.performance.PMThresholdType_T thresholdType;
	public boolean triggerFlag;
	public float value;
	public java.lang.String unit = "";
	public PMThresholdValue_T(java.lang.String pmParameter, org.omg.zx.performance.PMThresholdType_T thresholdType, boolean triggerFlag, float value, java.lang.String unit)
	{
		this.pmParameter = pmParameter;
		this.thresholdType = thresholdType;
		this.triggerFlag = triggerFlag;
		this.value = value;
		this.unit = unit;
	}
}
