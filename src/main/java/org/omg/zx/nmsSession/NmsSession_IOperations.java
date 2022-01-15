package org.omg.zx.nmsSession;

/**
 *	Generated from IDL interface "NmsSession_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface NmsSession_IOperations
	extends org.omg.zx.session.Session_IOperations
{
	/* constants */
	/* operations  */
	void eventLossOccurred(java.lang.String startTime, java.lang.String notificationId);
	void eventLossCleared(java.lang.String endTime);
}
