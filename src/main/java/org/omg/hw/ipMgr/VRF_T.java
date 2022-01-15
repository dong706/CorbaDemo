package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of struct "VRF_T"
 *	@author JacORB IDL compiler 
 */

public final class VRF_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public VRF_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String vrfType = "";
	public java.lang.String vrfLabel = "";
	public org.omg.hw.subnetworkConnection.TPData_T[] aEnd;
	public org.omg.hw.subnetworkConnection.TPData_T[] zEnd;
	public java.lang.String rdFormat = "";
	public java.lang.String rdAttr = "";
	public java.lang.String[] importRTList;
	public java.lang.String[] exportRTList;
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public VRF_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String vrfType, java.lang.String vrfLabel, org.omg.hw.subnetworkConnection.TPData_T[] aEnd, org.omg.hw.subnetworkConnection.TPData_T[] zEnd, java.lang.String rdFormat, java.lang.String rdAttr, java.lang.String[] importRTList, java.lang.String[] exportRTList, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.vrfType = vrfType;
		this.vrfLabel = vrfLabel;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.rdFormat = rdFormat;
		this.rdAttr = rdAttr;
		this.importRTList = importRTList;
		this.exportRTList = exportRTList;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
}
