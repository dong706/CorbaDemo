package org.omg.hw.emsMgr;

/**
 *	Generated from IDL interface "AlarmStaticInfoIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface AlarmStaticInfoIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.hw.emsMgr.AlarmStaticInfoList_THolder alarmStaticInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException;
}
