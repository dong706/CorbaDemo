package org.omg.hw.HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_RPRSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_RPRSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_RPRSwitchData_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName;
	public org.omg.hw.protection.SwitchReason_T switchReason;
	public org.omg.hw.HW_mstpProtection.HW_SwitchState_T switchState;
	public org.omg.hw.HW_mstpProtection.HW_SwitchPosition_T switchPosition;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] switchParameters;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_RPRSwitchData_T(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.protection.SwitchReason_T switchReason, org.omg.hw.HW_mstpProtection.HW_SwitchState_T switchState, org.omg.hw.HW_mstpProtection.HW_SwitchPosition_T switchPosition, org.omg.hw.globaldefs.NameAndStringValue_T[] switchParameters, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.nodeName = nodeName;
		this.switchReason = switchReason;
		this.switchState = switchState;
		this.switchPosition = switchPosition;
		this.switchParameters = switchParameters;
		this.additionalInfo = additionalInfo;
	}
}
