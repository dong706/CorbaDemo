package org.omg.hw.equipment;

/**
 *	Generated from IDL definition of struct "ObjectAdditionalInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectAdditionalInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ObjectAdditionalInfo_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] objectName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ObjectAdditionalInfo_T(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.objectName = objectName;
		this.additionalInfo = additionalInfo;
	}
}
