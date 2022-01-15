package org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage;

/**
 *	Generated from IDL definition of struct "OAMParametersData_T"
 *	@author JacORB IDL compiler 
 */

public final class OAMParametersData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public OAMParametersData_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] objectName;
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public OAMParametersData_T(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams)
	{
		this.objectName = objectName;
		this.transmissionParams = transmissionParams;
	}
}
