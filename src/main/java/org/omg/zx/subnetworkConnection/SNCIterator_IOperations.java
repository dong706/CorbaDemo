package org.omg.zx.subnetworkConnection;

/**
 *	Generated from IDL interface "SNCIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface SNCIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.zx.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException;
}
