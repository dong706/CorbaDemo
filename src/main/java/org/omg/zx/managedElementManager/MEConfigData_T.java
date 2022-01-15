package org.omg.zx.managedElementManager;

/**
 *	Generated from IDL definition of struct "MEConfigData_T"
 *	@author JacORB IDL compiler 
 */

public final class MEConfigData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MEConfigData_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public org.omg.zx.notifications.NameAndAnyValue_T[] configDatas;
	public MEConfigData_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, org.omg.zx.notifications.NameAndAnyValue_T[] configDatas)
	{
		this.name = name;
		this.configDatas = configDatas;
	}
}
