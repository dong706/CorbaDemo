package org.omg.zx.notifications;

/**
 *	Generated from IDL interface "EventIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EventIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.zx.notifications.EventList_THolder eventList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.zx.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException;
}
