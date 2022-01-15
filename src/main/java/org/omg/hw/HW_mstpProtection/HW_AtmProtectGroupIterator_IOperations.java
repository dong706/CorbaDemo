package org.omg.hw.HW_mstpProtection;

/**
 *	Generated from IDL interface "HW_AtmProtectGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface HW_AtmProtectGroupIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.hw.HW_mstpProtection.HW_AtmProtectGroupList_THolder atmPGList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException;
}
