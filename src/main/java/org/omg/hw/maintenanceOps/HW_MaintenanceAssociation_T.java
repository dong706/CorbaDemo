package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_MaintenanceAssociation_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenanceAssociation_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_MaintenanceAssociation_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] associatedService;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] maParameters;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_MaintenanceAssociation_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.globaldefs.NameAndStringValue_T[] associatedService, org.omg.hw.globaldefs.NameAndStringValue_T[] maParameters, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.associatedService = associatedService;
		this.maParameters = maParameters;
		this.additionalInfo = additionalInfo;
	}
}
