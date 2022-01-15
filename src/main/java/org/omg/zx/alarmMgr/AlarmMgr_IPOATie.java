package org.omg.zx.alarmMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "AlarmMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class AlarmMgr_IPOATie
	extends AlarmMgr_IPOA
{
	private AlarmMgr_IOperations _delegate;

	private POA _poa;
	public AlarmMgr_IPOATie(AlarmMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public AlarmMgr_IPOATie(AlarmMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.alarmMgr.AlarmMgr_I _this()
	{
		return org.omg.zx.alarmMgr.AlarmMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.alarmMgr.AlarmMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.alarmMgr.AlarmMgr_IHelper.narrow(_this_object(orb));
	}
	public AlarmMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AlarmMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void setLocation(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

	public void setNativeEMSName(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getPerceivedSeverities(org.omg.zx.alarmMgr.SeverityAssignmentList_THolder severityAssignmentList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getPerceivedSeverities(severityAssignmentList);
	}

	public void setAlarmReportingOff(org.omg.zx.alarmMgr.ObjectAndRate_T[] objectAndRateList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOff(objectAndRateList);
	}

	public void setAlarmReportingOn(org.omg.zx.alarmMgr.ObjectAndRate_T[] objectAndRateList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOn(objectAndRateList);
	}

	public void setUserLabel(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setAdditionalInfo(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setPerceivedSeverities(org.omg.zx.alarmMgr.SeverityAssignment_T[] severityAssignmentList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setPerceivedSeverities(severityAssignmentList);
	}

	public void getCapabilities(org.omg.zx.common.CapabilityList_THolder capabilities) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

}
