package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of struct "ConnectionAndSupportingSNCs_T"
 *	@author JacORB IDL compiler 
 */

public final class ConnectionAndSupportingSNCs_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ConnectionAndSupportingSNCs_T(){}
	public org.omg.zx.subnetworkConnection.SubnetworkConnection_T topLevelConnection;
	public org.omg.zx.subnetworkConnection.SubnetworkConnection_T[] sNCList;
	public ConnectionAndSupportingSNCs_T(org.omg.zx.subnetworkConnection.SubnetworkConnection_T topLevelConnection, org.omg.zx.subnetworkConnection.SubnetworkConnection_T[] sNCList)
	{
		this.topLevelConnection = topLevelConnection;
		this.sNCList = sNCList;
	}
}
