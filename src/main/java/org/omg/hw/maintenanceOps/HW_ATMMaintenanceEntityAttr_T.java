package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_ATMMaintenanceEntityAttr_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ATMMaintenanceEntityAttr_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_ATMMaintenanceEntityAttr_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] aEndName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] zEndName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_ATMMaintenanceEntityAttr_T(org.omg.hw.globaldefs.NameAndStringValue_T[] aEndName, org.omg.hw.globaldefs.NameAndStringValue_T[] zEndName, org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.aEndName = aEndName;
		this.zEndName = zEndName;
		this.serviceName = serviceName;
		this.additionalInfo = additionalInfo;
	}
}
