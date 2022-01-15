package org.omg.hw.topologicalLink;

/**
 *	Generated from IDL definition of struct "TopologicalLink_T"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TopologicalLink_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public short rate;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] aEndTP;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] zEndTP;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TopologicalLink_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.globaldefs.ConnectionDirection_T direction, short rate, org.omg.hw.globaldefs.NameAndStringValue_T[] aEndTP, org.omg.hw.globaldefs.NameAndStringValue_T[] zEndTP, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.rate = rate;
		this.aEndTP = aEndTP;
		this.zEndTP = zEndTP;
		this.additionalInfo = additionalInfo;
	}
}
