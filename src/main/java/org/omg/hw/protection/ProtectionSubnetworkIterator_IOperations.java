package org.omg.hw.protection;

/**
 *	Generated from IDL interface "ProtectionSubnetworkIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ProtectionSubnetworkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.hw.protection.ProtectionSubnetworkList_THolder PGPList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException;
}
