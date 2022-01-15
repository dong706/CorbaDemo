package org.omg.hw.HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_AtmPGSingleEndSwitchPara_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmPGSingleEndSwitchPara_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_AtmPGSingleEndSwitchPara_T(){}
	public org.omg.hw.protection.SwitchReason_T switchReason;
	public org.omg.hw.HW_mstpProtection.HW_SwitchState_T switchState;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmPGSingleEndSwitchPara_T(org.omg.hw.protection.SwitchReason_T switchReason, org.omg.hw.HW_mstpProtection.HW_SwitchState_T switchState, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.switchReason = switchReason;
		this.switchState = switchState;
		this.additionalInfo = additionalInfo;
	}
}
