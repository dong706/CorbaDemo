package org.omg.hw.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "PresetRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class PresetRoute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PresetRoute_T(){}
	public int presetRouteID;
	public int priority;
	public org.omg.hw.subnetworkConnection.CrossConnect_T[] route;
	public PresetRoute_T(int presetRouteID, int priority, org.omg.hw.subnetworkConnection.CrossConnect_T[] route)
	{
		this.presetRouteID = presetRouteID;
		this.priority = priority;
		this.route = route;
	}
}
