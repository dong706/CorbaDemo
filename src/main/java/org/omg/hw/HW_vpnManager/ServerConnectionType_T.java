package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "ServerConnectionType_T"
 *	@author JacORB IDL compiler 
 */

public final class ServerConnectionType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ServerConnectionType_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] nameList;
	public java.lang.String channel = "";
	public org.omg.hw.HW_vpnManager.UsedAsType_T usedAs;
	public ServerConnectionType_T(org.omg.hw.globaldefs.NameAndStringValue_T[][] nameList, java.lang.String channel, org.omg.hw.HW_vpnManager.UsedAsType_T usedAs)
	{
		this.nameList = nameList;
		this.channel = channel;
		this.usedAs = usedAs;
	}
}
