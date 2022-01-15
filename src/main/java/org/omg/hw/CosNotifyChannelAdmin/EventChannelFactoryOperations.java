package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "EventChannelFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EventChannelFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.hw.CosNotifyChannelAdmin.EventChannel create_channel(org.omg.hw.CosNotification.Property[] initial_qos, org.omg.hw.CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws org.omg.hw.CosNotification.UnsupportedAdmin,org.omg.hw.CosNotification.UnsupportedQoS;
	int[] get_all_channels();
	org.omg.hw.CosNotifyChannelAdmin.EventChannel get_event_channel(int id) throws org.omg.hw.CosNotifyChannelAdmin.ChannelNotFound;
}
