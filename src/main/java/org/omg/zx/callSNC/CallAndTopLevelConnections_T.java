package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of struct "CallAndTopLevelConnections_T"
 *	@author JacORB IDL compiler 
 */

public final class CallAndTopLevelConnections_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CallAndTopLevelConnections_T(){}
	public org.omg.zx.callSNC.Call_T theCall;
	public org.omg.zx.subnetworkConnection.SubnetworkConnection_T[] topLevelConnectionsList;
	public CallAndTopLevelConnections_T(org.omg.zx.callSNC.Call_T theCall, org.omg.zx.subnetworkConnection.SubnetworkConnection_T[] topLevelConnectionsList)
	{
		this.theCall = theCall;
		this.topLevelConnectionsList = topLevelConnectionsList;
	}
}
