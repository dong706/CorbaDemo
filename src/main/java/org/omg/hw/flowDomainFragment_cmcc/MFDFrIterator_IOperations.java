package org.omg.hw.flowDomainFragment_cmcc;

/**
 *	Generated from IDL interface "MFDFrIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface MFDFrIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder mfdfrList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException;
}
