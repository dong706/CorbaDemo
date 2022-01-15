package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "ServerTrailType_T"
 *	@author JacORB IDL compiler 
 */

public final class ServerTrailType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ServerTrailType_T(){}
	public org.omg.hw.HW_vpnManager.ServerConnectionType_T[] serverConnectionList;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public ServerTrailType_T(org.omg.hw.HW_vpnManager.ServerConnectionType_T[] serverConnectionList, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams)
	{
		this.serverConnectionList = serverConnectionList;
		this.transmissionParams = transmissionParams;
	}
}
