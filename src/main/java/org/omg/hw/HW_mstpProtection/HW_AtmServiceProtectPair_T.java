package org.omg.hw.HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_AtmServiceProtectPair_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceProtectPair_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_AtmServiceProtectPair_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] workServiceName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] protectServiceName;
	public org.omg.hw.HW_mstpProtection.HW_AtmMonitorFlag_T monitorFlag;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmServiceProtectPair_T(org.omg.hw.globaldefs.NameAndStringValue_T[] workServiceName, org.omg.hw.globaldefs.NameAndStringValue_T[] protectServiceName, org.omg.hw.HW_mstpProtection.HW_AtmMonitorFlag_T monitorFlag, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.workServiceName = workServiceName;
		this.protectServiceName = protectServiceName;
		this.monitorFlag = monitorFlag;
		this.additionalInfo = additionalInfo;
	}
}
