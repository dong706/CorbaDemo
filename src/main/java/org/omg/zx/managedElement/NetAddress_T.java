package org.omg.zx.managedElement;

/**
 *	Generated from IDL definition of struct "NetAddress_T"
 *	@author JacORB IDL compiler 
 */

public final class NetAddress_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public NetAddress_T(){}
	public org.omg.zx.managedElement.IPAddr_T ipAddr;
	public int portNumber;
	public NetAddress_T(org.omg.zx.managedElement.IPAddr_T ipAddr, int portNumber)
	{
		this.ipAddr = ipAddr;
		this.portNumber = portNumber;
	}
}
