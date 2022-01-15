package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL definition of struct "ObjectAndRate_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectAndRate_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ObjectAndRate_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] objectName;
	public short[] rateList;
	public ObjectAndRate_T(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, short[] rateList)
	{
		this.objectName = objectName;
		this.rateList = rateList;
	}
}
