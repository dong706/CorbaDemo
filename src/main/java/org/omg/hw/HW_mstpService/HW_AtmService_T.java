package org.omg.hw.HW_mstpService;

/**
 *	Generated from IDL definition of struct "HW_AtmService_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmService_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_AtmService_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.HW_mstpProtection.HW_AtmProtectType_T protectType;
	public org.omg.hw.HW_mstpService.HW_AtmServiceType_T serviceType;
	public org.omg.hw.HW_mstpService.HW_AtmServiceSpreadType_T spreadType;
	public org.omg.hw.HW_mstpService.HW_AtmProtectRole_T protectRole;
	public boolean activeState;
	public org.omg.hw.HW_mstpService.HW_AtmServiceTP_T aEndPoint;
	public org.omg.hw.HW_mstpService.HW_AtmServiceTP_T zEndPoint;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmService_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.HW_mstpProtection.HW_AtmProtectType_T protectType, org.omg.hw.HW_mstpService.HW_AtmServiceType_T serviceType, org.omg.hw.HW_mstpService.HW_AtmServiceSpreadType_T spreadType, org.omg.hw.HW_mstpService.HW_AtmProtectRole_T protectRole, boolean activeState, org.omg.hw.HW_mstpService.HW_AtmServiceTP_T aEndPoint, org.omg.hw.HW_mstpService.HW_AtmServiceTP_T zEndPoint, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectType = protectType;
		this.serviceType = serviceType;
		this.spreadType = spreadType;
		this.protectRole = protectRole;
		this.activeState = activeState;
		this.aEndPoint = aEndPoint;
		this.zEndPoint = zEndPoint;
		this.additionalInfo = additionalInfo;
	}
}
