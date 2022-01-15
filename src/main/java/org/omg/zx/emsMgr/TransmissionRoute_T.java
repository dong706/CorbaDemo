package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of struct "TransmissionRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class TransmissionRoute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TransmissionRoute_T(){}
	public int routeNo;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String channelNo = "";
	public TransmissionRoute_T(int routeNo, org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String channelNo)
	{
		this.routeNo = routeNo;
		this.name = name;
		this.channelNo = channelNo;
	}
}
