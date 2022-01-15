package org.omg.hw.emsMgr;

/**
 *	Generated from IDL definition of struct "AlarmStaticInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmStaticInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public AlarmStaticInfo_T(){}
	public int groupID;
	public int alarmID;
	public java.lang.String nativeProbableCause = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public AlarmStaticInfo_T(int groupID, int alarmID, java.lang.String nativeProbableCause, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.groupID = groupID;
		this.alarmID = alarmID;
		this.nativeProbableCause = nativeProbableCause;
		this.additionalInfo = additionalInfo;
	}
}
