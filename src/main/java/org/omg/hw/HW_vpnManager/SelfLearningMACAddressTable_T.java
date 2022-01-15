package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "SelfLearningMACAddressTable_T"
 *	@author JacORB IDL compiler 
 */

public final class SelfLearningMACAddressTable_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SelfLearningMACAddressTable_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public org.omg.hw.HW_vpnManager.SelfLearningMACAddress_T[] macAddressList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public SelfLearningMACAddressTable_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, org.omg.hw.HW_vpnManager.SelfLearningMACAddress_T[] macAddressList, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.macAddressList = macAddressList;
		this.additionalInfo = additionalInfo;
	}
}
