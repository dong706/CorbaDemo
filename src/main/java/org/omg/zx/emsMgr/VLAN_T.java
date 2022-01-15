package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of struct "VLAN_T"
 *	@author JacORB IDL compiler 
 */

public final class VLAN_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public VLAN_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String vlanID = "";
	public org.omg.zx.emsMgr.LogicalPort_T[] lps;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public VLAN_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String vlanID, org.omg.zx.emsMgr.LogicalPort_T[] lps, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.vlanID = vlanID;
		this.lps = lps;
		this.additionalInfo = additionalInfo;
	}
}
