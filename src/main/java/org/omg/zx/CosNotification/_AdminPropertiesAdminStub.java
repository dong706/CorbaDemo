package org.omg.zx.CosNotification;


/**
 *	Generated from IDL interface "AdminPropertiesAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _AdminPropertiesAdminStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.zx.CosNotification.AdminPropertiesAdmin
{
	private String[] ids = {"IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.zx.CosNotification.AdminPropertiesAdminOperations.class;
	public void set_admin(org.omg.zx.CosNotification.Property[] admin) throws org.omg.zx.CosNotification.UnsupportedAdmin
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_admin", true);
				org.omg.zx.CosNotification.PropertySeqHelper.write(_os,admin);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotification/UnsupportedAdmin:1.0"))
				{
					throw org.omg.zx.CosNotification.UnsupportedAdminHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_admin", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			AdminPropertiesAdminOperations _localServant = (AdminPropertiesAdminOperations)_so.servant;
			try
			{
			_localServant.set_admin(admin);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.zx.CosNotification.Property[] get_admin()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_admin", true);
				_is = _invoke(_os);
				org.omg.zx.CosNotification.Property[] _result = org.omg.zx.CosNotification.PropertySeqHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_admin", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			AdminPropertiesAdminOperations _localServant = (AdminPropertiesAdminOperations)_so.servant;
			org.omg.zx.CosNotification.Property[] _result;			try
			{
			_result = _localServant.get_admin();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

}
