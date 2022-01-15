package org.omg.hw.multiLayerSubnetwork;

/**
 *	Generated from IDL interface "RouteAndTopologicalLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface RouteAndTopologicalLinkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkList_THolder routeAndTlList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException;
	void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException;
}
