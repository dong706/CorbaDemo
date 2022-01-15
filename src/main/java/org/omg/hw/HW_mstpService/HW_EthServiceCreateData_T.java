package org.omg.hw.HW_mstpService;

/**
 *	Generated from IDL definition of struct "HW_EthServiceCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_EthServiceCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_EthServiceCreateData_T(){}
	public org.omg.hw.HW_mstpService.HW_EthServiceType_T serviceType;
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public org.omg.hw.HW_mstpService.HW_EthServiceTP_T aEndPoint;
	public org.omg.hw.HW_mstpService.HW_EthServiceTP_T zEndPoint;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_EthServiceCreateData_T(org.omg.hw.HW_mstpService.HW_EthServiceType_T serviceType, org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.HW_mstpService.HW_EthServiceTP_T aEndPoint, org.omg.hw.HW_mstpService.HW_EthServiceTP_T zEndPoint, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.serviceType = serviceType;
		this.direction = direction;
		this.aEndPoint = aEndPoint;
		this.zEndPoint = zEndPoint;
		this.additionalInfo = additionalInfo;
	}
}
