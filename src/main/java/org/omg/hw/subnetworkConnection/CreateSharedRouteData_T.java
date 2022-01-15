package org.omg.hw.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "CreateSharedRouteData_T"
 *	@author JacORB IDL compiler 
 */

public final class CreateSharedRouteData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CreateSharedRouteData_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] sncName;
	public int sharedRouteID;
	public int priority;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public CreateSharedRouteData_T(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, int sharedRouteID, int priority, org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpInclusions, org.omg.hw.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.sncName = sncName;
		this.sharedRouteID = sharedRouteID;
		this.priority = priority;
		this.neTpInclusions = neTpInclusions;
		this.neTpSncExclusions = neTpSncExclusions;
		this.additionalInfo = additionalInfo;
	}
}
