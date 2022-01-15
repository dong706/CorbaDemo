package org.omg.zx.managedElement;

/**
 *	Generated from IDL definition of struct "MECoordinates_T"
 *	@author JacORB IDL compiler 
 */

public final class MECoordinates_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MECoordinates_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String coordinate = "";
	public java.lang.String relativeCoordinate = "";
	public MECoordinates_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String coordinate, java.lang.String relativeCoordinate)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.coordinate = coordinate;
		this.relativeCoordinate = relativeCoordinate;
	}
}
