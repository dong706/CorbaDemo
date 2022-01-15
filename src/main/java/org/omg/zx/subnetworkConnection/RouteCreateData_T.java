package org.omg.zx.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteCreateData_T(){}
	public java.lang.String intended = "";
	public java.lang.String exclusive = "";
	public org.omg.zx.subnetworkConnection.CrossConnect_T[] ccInclusions;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public RouteCreateData_T(java.lang.String intended, java.lang.String exclusive, org.omg.zx.subnetworkConnection.CrossConnect_T[] ccInclusions, org.omg.zx.globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, org.omg.zx.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.intended = intended;
		this.exclusive = exclusive;
		this.ccInclusions = ccInclusions;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
