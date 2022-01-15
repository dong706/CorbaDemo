package org.omg.zx.performance;

/**
 *	Generated from IDL definition of struct "PMCollectionPlan_T"
 *	@author JacORB IDL compiler 
 */

public final class PMCollectionPlan_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMCollectionPlan_T(){}
	public org.omg.zx.performance.PMTPSelect_T name;
	public java.lang.String beginTime;
	public java.lang.String endTime;
	public java.lang.String reportInterval;
	public java.lang.String[] pMParameterList;
	public org.omg.zx.performance.PMMonitorOrReportStatus_T pmMonitorStatus;
	public org.omg.zx.performance.PMMonitorOrReportStatus_T pmReportStatus;
	public PMCollectionPlan_T(org.omg.zx.performance.PMTPSelect_T name, java.lang.String beginTime, java.lang.String endTime, java.lang.String reportInterval, java.lang.String[] pMParameterList, org.omg.zx.performance.PMMonitorOrReportStatus_T pmMonitorStatus, org.omg.zx.performance.PMMonitorOrReportStatus_T pmReportStatus)
	{
		this.name = name;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.reportInterval = reportInterval;
		this.pMParameterList = pMParameterList;
		this.pmMonitorStatus = pmMonitorStatus;
		this.pmReportStatus = pmReportStatus;
	}
}
