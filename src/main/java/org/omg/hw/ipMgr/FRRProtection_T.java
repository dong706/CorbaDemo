package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of struct "FRRProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class FRRProtection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FRRProtection_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String protectionType = "";
	public short rate;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] tpList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] frrParameters;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] bindingObject;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public FRRProtection_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String protectionType, short rate, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpList, org.omg.hw.globaldefs.NameAndStringValue_T[] frrParameters, org.omg.hw.globaldefs.NameAndStringValue_T[] bindingObject, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionType = protectionType;
		this.rate = rate;
		this.tpList = tpList;
		this.frrParameters = frrParameters;
		this.bindingObject = bindingObject;
		this.additionalInfo = additionalInfo;
	}
}
