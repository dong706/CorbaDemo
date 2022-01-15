package org.omg.hw.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "SharedRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class SharedRoute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SharedRoute_T(){}
	public int sharedRouteID;
	public int priority;
	public org.omg.hw.subnetworkConnection.CrossConnect_T[] route;
	public SharedRoute_T(int sharedRouteID, int priority, org.omg.hw.subnetworkConnection.CrossConnect_T[] route)
	{
		this.sharedRouteID = sharedRouteID;
		this.priority = priority;
		this.route = route;
	}
}
