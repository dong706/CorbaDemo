package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "MultipointServiceAttr_T"
 *	@author JacORB IDL compiler 
 */

public final class MultipointServiceAttr_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MultipointServiceAttr_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] paraList;
	public org.omg.hw.HW_vpnManager.StaticMacAddress_T[] staticMacList;
	public org.omg.hw.HW_vpnManager.SplitHorizonGroup_T[] shgList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public MultipointServiceAttr_T(org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.HW_vpnManager.StaticMacAddress_T[] staticMacList, org.omg.hw.HW_vpnManager.SplitHorizonGroup_T[] shgList, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.paraList = paraList;
		this.staticMacList = staticMacList;
		this.shgList = shgList;
		this.additionalInfo = additionalInfo;
	}
}
