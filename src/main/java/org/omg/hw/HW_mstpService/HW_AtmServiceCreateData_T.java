package org.omg.hw.HW_mstpService;

/**
 *	Generated from IDL definition of struct "HW_AtmServiceCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmServiceCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_AtmServiceCreateData_T(){}
	public org.omg.hw.HW_mstpProtection.HW_AtmProtectType_T protectType;
	public org.omg.hw.HW_mstpService.HW_AtmServiceType_T serviceType;
	public org.omg.hw.HW_mstpService.HW_AtmServiceSpreadType_T spreadType;
	public org.omg.hw.HW_mstpService.HW_AtmProtectRole_T protectRole;
	public org.omg.hw.HW_mstpService.HW_AtmServiceTP_T aEndPoint;
	public org.omg.hw.HW_mstpService.HW_AtmServiceTP_T zEndPoint;
	public boolean active;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmServiceCreateData_T(org.omg.hw.HW_mstpProtection.HW_AtmProtectType_T protectType, org.omg.hw.HW_mstpService.HW_AtmServiceType_T serviceType, org.omg.hw.HW_mstpService.HW_AtmServiceSpreadType_T spreadType, org.omg.hw.HW_mstpService.HW_AtmProtectRole_T protectRole, org.omg.hw.HW_mstpService.HW_AtmServiceTP_T aEndPoint, org.omg.hw.HW_mstpService.HW_AtmServiceTP_T zEndPoint, boolean active, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectType = protectType;
		this.serviceType = serviceType;
		this.spreadType = spreadType;
		this.protectRole = protectRole;
		this.aEndPoint = aEndPoint;
		this.zEndPoint = zEndPoint;
		this.active = active;
		this.additionalInfo = additionalInfo;
	}
}
