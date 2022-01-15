package org.omg.hw.HW_mstpInventory;

/**
 *	Generated from IDL interface "HW_VirtualLANIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface HW_VirtualLANIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.hw.HW_mstpInventory.HW_VirtualLANList_THolder vlanList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException;
}
