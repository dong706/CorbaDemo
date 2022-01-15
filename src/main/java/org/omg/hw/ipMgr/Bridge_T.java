package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of struct "Bridge_T"
 *	@author JacORB IDL compiler 
 */

public final class Bridge_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public Bridge_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] aEnd;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] zEnd;
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public Bridge_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.globaldefs.NameAndStringValue_T[][] aEnd, org.omg.hw.globaldefs.NameAndStringValue_T[][] zEnd, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
}
