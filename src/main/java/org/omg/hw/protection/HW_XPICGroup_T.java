package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "HW_XPICGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_XPICGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_XPICGroup_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String vLinkID = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] vTPName;
	public java.lang.String hLinkID = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] hTPName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_XPICGroup_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String vLinkID, org.omg.hw.globaldefs.NameAndStringValue_T[] vTPName, java.lang.String hLinkID, org.omg.hw.globaldefs.NameAndStringValue_T[] hTPName, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.vLinkID = vLinkID;
		this.vTPName = vTPName;
		this.hLinkID = hLinkID;
		this.hTPName = hTPName;
		this.additionalInfo = additionalInfo;
	}
}
