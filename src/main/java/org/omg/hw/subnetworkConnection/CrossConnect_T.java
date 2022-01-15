package org.omg.hw.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "CrossConnect_T"
 *	@author JacORB IDL compiler 
 */

public final class CrossConnect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CrossConnect_T(){}
	public boolean active;
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public org.omg.hw.subnetworkConnection.SNCType_T ccType;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] aEndNameList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] zEndNameList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public CrossConnect_T(boolean active, org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.subnetworkConnection.SNCType_T ccType, org.omg.hw.globaldefs.NameAndStringValue_T[][] aEndNameList, org.omg.hw.globaldefs.NameAndStringValue_T[][] zEndNameList, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.active = active;
		this.direction = direction;
		this.ccType = ccType;
		this.aEndNameList = aEndNameList;
		this.zEndNameList = zEndNameList;
		this.additionalInfo = additionalInfo;
	}
}
