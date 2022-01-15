package org.omg.zx.callSNC;

/**
 *	Generated from IDL interface "CallAndTopLevelConnectionsIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface CallAndTopLevelConnectionsIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.zx.callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.zx.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException;
}
