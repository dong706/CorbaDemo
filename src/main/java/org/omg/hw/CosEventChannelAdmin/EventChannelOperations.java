package org.omg.hw.CosEventChannelAdmin;

/**
 *	Generated from IDL interface "EventChannel"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EventChannelOperations
{
	/* constants */
	/* operations  */
	org.omg.hw.CosEventChannelAdmin.ConsumerAdmin for_consumers();
	org.omg.hw.CosEventChannelAdmin.SupplierAdmin for_suppliers();
	void destroy();
}
