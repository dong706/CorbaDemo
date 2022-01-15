package org.omg.hw.trailNtwProtection;

/**
 *	Generated from IDL interface "TrailNtwProtectionIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface TrailNtwProtectionIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.hw.trailNtwProtection.TrailNtwProtectionList_THolder tnpList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException;
}
