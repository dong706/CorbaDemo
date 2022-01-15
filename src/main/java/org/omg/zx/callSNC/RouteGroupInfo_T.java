package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of struct "RouteGroupInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteGroupInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteGroupInfo_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] sNCname;
	public java.lang.String routeGroupLabel = "";
	public RouteGroupInfo_T(org.omg.zx.globaldefs.NameAndStringValue_T[] sNCname, java.lang.String routeGroupLabel)
	{
		this.sNCname = sNCname;
		this.routeGroupLabel = routeGroupLabel;
	}
}
