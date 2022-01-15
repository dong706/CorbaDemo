package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "SelfLearningMACAddress_T"
 *	@author JacORB IDL compiler 
 */

public final class SelfLearningMACAddress_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SelfLearningMACAddress_T(){}
	public java.lang.String macType = "";
	public java.lang.String macAddress = "";
	public java.lang.String peVID = "";
	public java.lang.String ceVID = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] tpName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public SelfLearningMACAddress_T(java.lang.String macType, java.lang.String macAddress, java.lang.String peVID, java.lang.String ceVID, org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.macType = macType;
		this.macAddress = macAddress;
		this.peVID = peVID;
		this.ceVID = ceVID;
		this.tpName = tpName;
		this.additionalInfo = additionalInfo;
	}
}
