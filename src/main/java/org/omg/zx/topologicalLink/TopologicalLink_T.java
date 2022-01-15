package org.omg.zx.topologicalLink;

/**
 *	Generated from IDL definition of struct "TopologicalLink_T"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TopologicalLink_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public org.omg.zx.globaldefs.ConnectionDirection_T direction;
	public short rate;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] aEndTP;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] zEndTP;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TopologicalLink_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, org.omg.zx.globaldefs.ConnectionDirection_T direction, short rate, org.omg.zx.globaldefs.NameAndStringValue_T[] aEndTP, org.omg.zx.globaldefs.NameAndStringValue_T[] zEndTP, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.direction = direction;
		this.rate = rate;
		this.aEndTP = aEndTP;
		this.zEndTP = zEndTP;
		this.additionalInfo = additionalInfo;
	}
}
