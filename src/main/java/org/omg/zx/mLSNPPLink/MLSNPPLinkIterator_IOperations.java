package org.omg.zx.mLSNPPLink;

/**
 *	Generated from IDL interface "MLSNPPLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface MLSNPPLinkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.zx.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException;
}
