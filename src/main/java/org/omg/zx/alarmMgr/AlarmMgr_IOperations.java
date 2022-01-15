package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL interface "AlarmMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface AlarmMgr_IOperations
	extends org.omg.zx.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getPerceivedSeverities(org.omg.zx.alarmMgr.SeverityAssignmentList_THolder severityAssignmentList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void setPerceivedSeverities(org.omg.zx.alarmMgr.SeverityAssignment_T[] severityAssignmentList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void setAlarmReportingOn(org.omg.zx.alarmMgr.ObjectAndRate_T[] objectAndRateList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void setAlarmReportingOff(org.omg.zx.alarmMgr.ObjectAndRate_T[] objectAndRateList) throws org.omg.zx.globaldefs.ProcessingFailureException;
}
