package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "ProtectionSubnetwork_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionSubnetwork_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ProtectionSubnetwork_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public short layerRate;
	public org.omg.hw.protection.ProtectionSubnetworkType_T psnType;
	public int[] neIDList;
	public org.omg.hw.protection.ProtectionSubnetworkLink_T[][] psnLinks;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ProtectionSubnetwork_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, short layerRate, org.omg.hw.protection.ProtectionSubnetworkType_T psnType, int[] neIDList, org.omg.hw.protection.ProtectionSubnetworkLink_T[][] psnLinks, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.layerRate = layerRate;
		this.psnType = psnType;
		this.neIDList = neIDList;
		this.psnLinks = psnLinks;
		this.additionalInfo = additionalInfo;
	}
}
