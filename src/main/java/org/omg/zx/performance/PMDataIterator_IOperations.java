package org.omg.zx.performance;

/**
 *	Generated from IDL interface "PMDataIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface PMDataIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.zx.performance.PMDataList_THolder pmDataList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.zx.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException;
}
