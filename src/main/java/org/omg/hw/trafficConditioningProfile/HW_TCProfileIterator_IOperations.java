package org.omg.hw.trafficConditioningProfile;

/**
 *	Generated from IDL interface "HW_TCProfileIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface HW_TCProfileIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.hw.trafficConditioningProfile.HW_TCProfileList_THolder tcProfileList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException;
}
