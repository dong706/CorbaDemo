package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL definition of struct "CurrentMaintenanceOperation_T"
 *	@author JacORB IDL compiler 
 */

public final class CurrentMaintenanceOperation_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CurrentMaintenanceOperation_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] tpName;
	public java.lang.String maintenanceOperation;
	public short layerRate;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public CurrentMaintenanceOperation_T(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, java.lang.String maintenanceOperation, short layerRate, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.tpName = tpName;
		this.maintenanceOperation = maintenanceOperation;
		this.layerRate = layerRate;
		this.additionalInfo = additionalInfo;
	}
}
