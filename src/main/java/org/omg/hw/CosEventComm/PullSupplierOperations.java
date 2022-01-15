package org.omg.hw.CosEventComm;

/**
 *	Generated from IDL interface "PullSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface PullSupplierOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Any pull() throws org.omg.hw.CosEventComm.Disconnected;
	org.omg.CORBA.Any try_pull(org.omg.CORBA.BooleanHolder has_event) throws org.omg.hw.CosEventComm.Disconnected;
	void disconnect_pull_supplier();
}
