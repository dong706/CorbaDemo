package org.omg.hw.trafficDescriptor;

/**
 *	Generated from IDL interface "TrafficDescriptorIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface TrafficDescriptorIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.hw.trafficDescriptor.TrafficDescriptorList_THolder trafficDescList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException;
}
