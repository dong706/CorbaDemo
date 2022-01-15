package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of struct "TransmissionSystem_T"
 *	@author JacORB IDL compiler 
 */

public final class TransmissionSystem_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TransmissionSystem_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String vendorName = "";
	public java.lang.String protectionType = "";
	public org.omg.zx.emsMgr.TransmissionRoute_T[] workReceiveRouteList;
	public org.omg.zx.emsMgr.TransmissionRoute_T[] workSendRouteList;
	public org.omg.zx.emsMgr.TransmissionRoute_T[] protectionReceiveRouteList;
	public org.omg.zx.emsMgr.TransmissionRoute_T[] protectionworkSendRouteList;
	public java.lang.String capacity = "";
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] includingTSList;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TransmissionSystem_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String vendorName, java.lang.String protectionType, org.omg.zx.emsMgr.TransmissionRoute_T[] workReceiveRouteList, org.omg.zx.emsMgr.TransmissionRoute_T[] workSendRouteList, org.omg.zx.emsMgr.TransmissionRoute_T[] protectionReceiveRouteList, org.omg.zx.emsMgr.TransmissionRoute_T[] protectionworkSendRouteList, java.lang.String capacity, org.omg.zx.globaldefs.NameAndStringValue_T[][] includingTSList, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.vendorName = vendorName;
		this.protectionType = protectionType;
		this.workReceiveRouteList = workReceiveRouteList;
		this.workSendRouteList = workSendRouteList;
		this.protectionReceiveRouteList = protectionReceiveRouteList;
		this.protectionworkSendRouteList = protectionworkSendRouteList;
		this.capacity = capacity;
		this.includingTSList = includingTSList;
		this.additionalInfo = additionalInfo;
	}
}
