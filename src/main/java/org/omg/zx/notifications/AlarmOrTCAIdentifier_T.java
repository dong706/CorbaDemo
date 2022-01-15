package org.omg.zx.notifications;

/**
 *	Generated from IDL definition of union "AlarmOrTCAIdentifier_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmOrTCAIdentifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private org.omg.zx.notifications.AlarmTypeQualifier_T discriminator;
	private org.omg.zx.notifications.AlarmId_T alarmId;
	private org.omg.zx.notifications.TCAId_T tcaId;

	public AlarmOrTCAIdentifier_T ()
	{
	}

	public org.omg.zx.notifications.AlarmTypeQualifier_T discriminator ()
	{
		return discriminator;
	}

	public org.omg.zx.notifications.AlarmId_T alarmId ()
	{
		if (discriminator != org.omg.zx.notifications.AlarmTypeQualifier_T.ALARM)
			throw new org.omg.CORBA.BAD_OPERATION();
		return alarmId;
	}

	public void alarmId (org.omg.zx.notifications.AlarmId_T _x)
	{
		discriminator = org.omg.zx.notifications.AlarmTypeQualifier_T.ALARM;
		alarmId = _x;
	}

	public org.omg.zx.notifications.TCAId_T tcaId ()
	{
		if (discriminator != org.omg.zx.notifications.AlarmTypeQualifier_T.TCA)
			throw new org.omg.CORBA.BAD_OPERATION();
		return tcaId;
	}

	public void tcaId (org.omg.zx.notifications.TCAId_T _x)
	{
		discriminator = org.omg.zx.notifications.AlarmTypeQualifier_T.TCA;
		tcaId = _x;
	}

}
