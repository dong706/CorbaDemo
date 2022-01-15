package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of struct "SeverityAssignment_T"
 *	@author JacORB IDL compiler 
 */

public final class SeverityAssignment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SeverityAssignment_T(){}
	public java.lang.String probableCause;
	public org.omg.zx.alarmMgr.PerceivedSeverity_T currentSeverity;
	public org.omg.zx.alarmMgr.PerceivedSeverity_T defaultSeverity;
	public SeverityAssignment_T(java.lang.String probableCause, org.omg.zx.alarmMgr.PerceivedSeverity_T currentSeverity, org.omg.zx.alarmMgr.PerceivedSeverity_T defaultSeverity)
	{
		this.probableCause = probableCause;
		this.currentSeverity = currentSeverity;
		this.defaultSeverity = defaultSeverity;
	}
}
