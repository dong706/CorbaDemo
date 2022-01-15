package org.omg.hw.HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_RPRNode_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_RPRNode_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_RPRNode_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public short nodeNo;
	public boolean protocolEnabled;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] nodeParameters;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_RPRNode_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, short nodeNo, boolean protocolEnabled, org.omg.hw.globaldefs.NameAndStringValue_T[] nodeParameters, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.nodeNo = nodeNo;
		this.protocolEnabled = protocolEnabled;
		this.nodeParameters = nodeParameters;
		this.additionalInfo = additionalInfo;
	}
}
