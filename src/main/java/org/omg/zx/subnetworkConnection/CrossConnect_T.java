package org.omg.zx.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "CrossConnect_T"
 *	@author JacORB IDL compiler 
 */

public final class CrossConnect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CrossConnect_T(){}
	public boolean active;
	public org.omg.zx.globaldefs.ConnectionDirection_T direction;
	public org.omg.zx.subnetworkConnection.SNCType_T ccType;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] aEndNameList;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] zEndNameList;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public CrossConnect_T(boolean active, org.omg.zx.globaldefs.ConnectionDirection_T direction, org.omg.zx.subnetworkConnection.SNCType_T ccType, org.omg.zx.globaldefs.NameAndStringValue_T[][] aEndNameList, org.omg.zx.globaldefs.NameAndStringValue_T[][] zEndNameList, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.active = active;
		this.direction = direction;
		this.ccType = ccType;
		this.aEndNameList = aEndNameList;
		this.zEndNameList = zEndNameList;
		this.additionalInfo = additionalInfo;
	}
}
