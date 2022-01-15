package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL interface "MLSNPPIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface MLSNPPIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.zx.mLSNPP.MLSNPPList_THolder mLSNPPList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.zx.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException;
}
