package org.omg.hw.HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_AtmPGSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmPGSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_AtmPGSwitchData_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] pgName;
	public org.omg.hw.HW_mstpProtection.HW_AtmProtectType_T protectType;
	public org.omg.hw.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_T srcEndSwitchPara;
	public org.omg.hw.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_T snkEndSwitchPara;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmPGSwitchData_T(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.HW_mstpProtection.HW_AtmProtectType_T protectType, org.omg.hw.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_T srcEndSwitchPara, org.omg.hw.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_T snkEndSwitchPara, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.pgName = pgName;
		this.protectType = protectType;
		this.srcEndSwitchPara = srcEndSwitchPara;
		this.snkEndSwitchPara = snkEndSwitchPara;
		this.additionalInfo = additionalInfo;
	}
}
