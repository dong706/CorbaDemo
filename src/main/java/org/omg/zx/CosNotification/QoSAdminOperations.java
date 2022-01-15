package org.omg.zx.CosNotification;

/**
 *	Generated from IDL interface "QoSAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface QoSAdminOperations
{
	/* constants */
	/* operations  */
	org.omg.zx.CosNotification.Property[] get_qos();
	void set_qos(org.omg.zx.CosNotification.Property[] qos) throws org.omg.zx.CosNotification.UnsupportedQoS;
	void validate_qos(org.omg.zx.CosNotification.Property[] required_qos, org.omg.zx.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.zx.CosNotification.UnsupportedQoS;
}
