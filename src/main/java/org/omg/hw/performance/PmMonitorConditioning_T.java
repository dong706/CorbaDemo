package org.omg.hw.performance;

/**
 *	Generated from IDL definition of struct "PmMonitorConditioning_T"
 *	@author JacORB IDL compiler 
 */

public final class PmMonitorConditioning_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PmMonitorConditioning_T(){}
	public java.lang.String granularity;
	public java.lang.String startTime;
	public java.lang.String endTime;
	public java.lang.String pmScheduleName = "";
	public java.lang.String templateID = "";
	public java.lang.String templateName = "";
	public org.omg.hw.performance.PerformanceTemplate_T template;
	public org.omg.hw.performance.InstanceEnum_T intanceType;
	public PmMonitorConditioning_T(java.lang.String granularity, java.lang.String startTime, java.lang.String endTime, java.lang.String pmScheduleName, java.lang.String templateID, java.lang.String templateName, org.omg.hw.performance.PerformanceTemplate_T template, org.omg.hw.performance.InstanceEnum_T intanceType)
	{
		this.granularity = granularity;
		this.startTime = startTime;
		this.endTime = endTime;
		this.pmScheduleName = pmScheduleName;
		this.templateID = templateID;
		this.templateName = templateName;
		this.template = template;
		this.intanceType = intanceType;
	}
}
