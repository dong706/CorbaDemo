package org.omg.hw.performance;

/**
 *	Generated from IDL definition of struct "PerformanceCreateInstance_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceCreateInstance_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PerformanceCreateInstance_T(){}
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public org.omg.CORBA.Any vendorExtensions;
	public int resType;
	public java.lang.String scheduleName = "";
	public java.lang.String startTime;
	public java.lang.String endTime;
	public org.omg.hw.performance.PerformanceCreateResource_T[] resource;
	public org.omg.hw.performance.PerformanceTemplate_T[] template;
	public PerformanceCreateInstance_T(java.lang.String userLabel, java.lang.String nativeEMSName, org.omg.CORBA.Any vendorExtensions, int resType, java.lang.String scheduleName, java.lang.String startTime, java.lang.String endTime, org.omg.hw.performance.PerformanceCreateResource_T[] resource, org.omg.hw.performance.PerformanceTemplate_T[] template)
	{
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.vendorExtensions = vendorExtensions;
		this.resType = resType;
		this.scheduleName = scheduleName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.resource = resource;
		this.template = template;
	}
}
