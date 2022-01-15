package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of struct "VB_T"
 *	@author JacORB IDL compiler 
 */

public final class VB_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public VB_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String vbID = "";
	public java.lang.String cID = "";
	public java.lang.String userLabel = "";
	public org.omg.zx.emsMgr.LogicalPort_T[] lps;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public VB_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String vbID, java.lang.String cID, java.lang.String userLabel, org.omg.zx.emsMgr.LogicalPort_T[] lps, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.vbID = vbID;
		this.cID = cID;
		this.userLabel = userLabel;
		this.lps = lps;
		this.additionalInfo = additionalInfo;
	}
}
