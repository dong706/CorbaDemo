package org.omg.zx.CosNotification;

/**
 *	Generated from IDL interface "AdminPropertiesAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class AdminPropertiesAdminPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.zx.CosNotification.AdminPropertiesAdminOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "set_admin", new java.lang.Integer(0));
		m_opsHash.put ( "get_admin", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0"};
	public org.omg.zx.CosNotification.AdminPropertiesAdmin _this()
	{
		return org.omg.zx.CosNotification.AdminPropertiesAdminHelper.narrow(_this_object());
	}
	public org.omg.zx.CosNotification.AdminPropertiesAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.CosNotification.AdminPropertiesAdminHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // set_admin
			{
			try
			{
				org.omg.zx.CosNotification.Property[] _arg0=org.omg.zx.CosNotification.PropertySeqHelper.read(_input);
				_out = handler.createReply();
				set_admin(_arg0);
			}
			catch(org.omg.zx.CosNotification.UnsupportedAdmin _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.CosNotification.UnsupportedAdminHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // get_admin
			{
				_out = handler.createReply();
				org.omg.zx.CosNotification.PropertySeqHelper.write(_out,get_admin());
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
