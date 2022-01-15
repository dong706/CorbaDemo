package org.omg.hw.CosEventChannelAdmin;


/**
 *	Generated from IDL interface "ConsumerAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _ConsumerAdminStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.CosEventChannelAdmin.ConsumerAdmin
{
	private String[] ids = {"IDL:omg.org/CosEventChannelAdmin/ConsumerAdmin:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.CosEventChannelAdmin.ConsumerAdminOperations.class;
	public org.omg.hw.CosEventChannelAdmin.ProxyPullSupplier obtain_pull_supplier()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "obtain_pull_supplier", true);
				_is = _invoke(_os);
				org.omg.hw.CosEventChannelAdmin.ProxyPullSupplier _result = org.omg.hw.CosEventChannelAdmin.ProxyPullSupplierHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "obtain_pull_supplier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			org.omg.hw.CosEventChannelAdmin.ProxyPullSupplier _result;			try
			{
			_result = _localServant.obtain_pull_supplier();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.hw.CosEventChannelAdmin.ProxyPushSupplier obtain_push_supplier()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "obtain_push_supplier", true);
				_is = _invoke(_os);
				org.omg.hw.CosEventChannelAdmin.ProxyPushSupplier _result = org.omg.hw.CosEventChannelAdmin.ProxyPushSupplierHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "obtain_push_supplier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			org.omg.hw.CosEventChannelAdmin.ProxyPushSupplier _result;			try
			{
			_result = _localServant.obtain_push_supplier();
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
