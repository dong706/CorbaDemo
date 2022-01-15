package org.omg.zx.terminationPoint;

/**
 *	Generated from IDL definition of struct "BrdPortSFPInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class BrdPortSFPInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public BrdPortSFPInfo_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] brdPortName;
	public java.lang.String optiModuleType = "";
	public java.lang.String optiModuleTypeValue = "";
	public java.lang.String productTime;
	public int productNo;
	public java.lang.String optiModuleDetailInfo = "";
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public BrdPortSFPInfo_T(org.omg.zx.globaldefs.NameAndStringValue_T[] brdPortName, java.lang.String optiModuleType, java.lang.String optiModuleTypeValue, java.lang.String productTime, int productNo, java.lang.String optiModuleDetailInfo, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.brdPortName = brdPortName;
		this.optiModuleType = optiModuleType;
		this.optiModuleTypeValue = optiModuleTypeValue;
		this.productTime = productTime;
		this.productNo = productNo;
		this.optiModuleDetailInfo = optiModuleDetailInfo;
		this.additionalInfo = additionalInfo;
	}
}
