package org.omg.hw.ipMgr;

/**
 *	Generated from IDL interface "BridgeIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface BridgeIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.hw.ipMgr.BridgeList_THolder bridgeList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException;
}
