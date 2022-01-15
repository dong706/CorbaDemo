package org.omg.hw.performance;

/**
 *	Generated from IDL definition of struct "PerformanceMonitoringInstance_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceMonitoringInstance_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PerformanceMonitoringInstance_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public org.omg.CORBA.Any vendorExtensions;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] resourceRef;
	public org.omg.hw.performance.PmMonitorConditioning_T pmmc;
	public org.omg.hw.performance.ActivityStatusEnum_T status;
	public PerformanceMonitoringInstance_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, org.omg.CORBA.Any vendorExtensions, org.omg.hw.globaldefs.NameAndStringValue_T[] resourceRef, org.omg.hw.performance.PmMonitorConditioning_T pmmc, org.omg.hw.performance.ActivityStatusEnum_T status)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.vendorExtensions = vendorExtensions;
		this.resourceRef = resourceRef;
		this.pmmc = pmmc;
		this.status = status;
	}
}
