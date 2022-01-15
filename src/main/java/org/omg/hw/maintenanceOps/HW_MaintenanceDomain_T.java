package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_MaintenanceDomain_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenanceDomain_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_MaintenanceDomain_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] mdParameters;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_MaintenanceDomain_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.globaldefs.NameAndStringValue_T[] mdParameters, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.mdParameters = mdParameters;
		this.additionalInfo = additionalInfo;
	}
}
