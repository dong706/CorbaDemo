package org.omg.hw.CosNotification;

/**
 *	Generated from IDL interface "QoSAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface QoSAdminOperations
{
	/* constants */
	/* operations  */
	org.omg.hw.CosNotification.Property[] get_qos();
	void set_qos(org.omg.hw.CosNotification.Property[] qos) throws org.omg.hw.CosNotification.UnsupportedQoS;
	void validate_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS;
}
