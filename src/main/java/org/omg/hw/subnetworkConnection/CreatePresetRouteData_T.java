package org.omg.hw.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "CreatePresetRouteData_T"
 *	@author JacORB IDL compiler 
 */

public final class CreatePresetRouteData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CreatePresetRouteData_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] sncName;
	public int presetRouteID;
	public int priority;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public CreatePresetRouteData_T(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, int presetRouteID, int priority, org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpInclusions, org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.sncName = sncName;
		this.presetRouteID = presetRouteID;
		this.priority = priority;
		this.neTpInclusions = neTpInclusions;
		this.neTpSncExclusions = neTpSncExclusions;
		this.additionalInfo = additionalInfo;
	}
}
