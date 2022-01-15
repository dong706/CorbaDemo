package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL interface "HW_MaintenanceAssociationIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface HW_MaintenanceAssociationIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.hw.maintenanceOps.HW_MaintenanceAssociationList_THolder maList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException;
}
