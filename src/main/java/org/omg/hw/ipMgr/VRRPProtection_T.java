package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of struct "VRRPProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class VRRPProtection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public VRRPProtection_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public short rate;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] tpList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] vrrpParameters;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public VRRPProtection_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, short rate, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpList, org.omg.hw.globaldefs.NameAndStringValue_T[] vrrpParameters, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.rate = rate;
		this.tpList = tpList;
		this.vrrpParameters = vrrpParameters;
		this.additionalInfo = additionalInfo;
	}
}
