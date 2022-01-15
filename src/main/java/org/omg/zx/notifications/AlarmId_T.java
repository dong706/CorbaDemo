package org.omg.zx.notifications;

/**
 *	Generated from IDL definition of struct "AlarmId_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmId_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public AlarmId_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] objectName;
	public short layerRate;
	public java.lang.String probableCause = "";
	public java.lang.String probableCauseQualifier = "";
	public AlarmId_T(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, short layerRate, java.lang.String probableCause, java.lang.String probableCauseQualifier)
	{
		this.objectName = objectName;
		this.layerRate = layerRate;
		this.probableCause = probableCause;
		this.probableCauseQualifier = probableCauseQualifier;
	}
}
