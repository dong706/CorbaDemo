package org.omg.hw.protection;

/**
 *	Generated from IDL definition of struct "PGPModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class PGPModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PGPModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public org.omg.hw.protection.ReversionMode_T reversionMode;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] pgpTPList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] pgpParameters;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public PGPModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.omg.hw.protection.ReversionMode_T reversionMode, org.omg.hw.globaldefs.NameAndStringValue_T[][] pgpTPList, org.omg.hw.globaldefs.NameAndStringValue_T[] pgpParameters, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.reversionMode = reversionMode;
		this.pgpTPList = pgpTPList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
