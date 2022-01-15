package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_MaintenancePoint_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenancePoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_MaintenancePoint_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] tpName;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_MaintenancePoint_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.tpName = tpName;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
}
