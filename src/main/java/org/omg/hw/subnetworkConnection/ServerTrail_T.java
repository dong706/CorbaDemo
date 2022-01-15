package org.omg.hw.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "ServerTrail_T"
 *	@author JacORB IDL compiler 
 */

public final class ServerTrail_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ServerTrail_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] sncName;
	public boolean isASON;
	public ServerTrail_T(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, boolean isASON)
	{
		this.sncName = sncName;
		this.isASON = isASON;
	}
}
