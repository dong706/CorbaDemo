package org.omg.hw.CosEventChannelAdmin;


/**
 *	Generated from IDL interface "ProxyPullSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _ProxyPullSupplierStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.CosEventChannelAdmin.ProxyPullSupplier
{
	private String[] ids = {"IDL:omg.org/CosEventChannelAdmin/ProxyPullSupplier:1.0","IDL:omg.org/CosEventComm/PullSupplier:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.CosEventChannelAdmin.ProxyPullSupplierOperations.class;
	public void disconnect_pull_supplier()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "disconnect_pull_supplier", true);
				_is = _invoke(_os);
				return;
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "disconnect_pull_supplier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProxyPullSupplierOperations _localServant = (ProxyPullSupplierOperations)_so.servant;
			try
			{
			_localServant.disconnect_pull_supplier();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CORBA.Any pull() throws org.omg.hw.CosEventComm.Disconnected
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "pull", true);
				_is = _invoke(_os);
				org.omg.CORBA.Any _result = _is.read_any();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosEventComm/Disconnected:1.0"))
				{
					throw org.omg.hw.CosEventComm.DisconnectedHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "pull", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProxyPullSupplierOperations _localServant = (ProxyPullSupplierOperations)_so.servant;
			org.omg.CORBA.Any _result;			try
			{
			_result = _localServant.pull();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void connect_pull_consumer(org.omg.hw.CosEventComm.PullConsumer pull_consumer) throws org.omg.hw.CosEventChannelAdmin.AlreadyConnected
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "connect_pull_consumer", true);
				org.omg.hw.CosEventComm.PullConsumerHelper.write(_os,pull_consumer);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosEventChannelAdmin/AlreadyConnected:1.0"))
				{
					throw org.omg.hw.CosEventChannelAdmin.AlreadyConnectedHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "connect_pull_consumer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProxyPullSupplierOperations _localServant = (ProxyPullSupplierOperations)_so.servant;
			try
			{
			_localServant.connect_pull_consumer(pull_consumer);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.CORBA.Any try_pull(org.omg.CORBA.BooleanHolder has_event) throws org.omg.hw.CosEventComm.Disconnected
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "try_pull", true);
				_is = _invoke(_os);
				org.omg.CORBA.Any _result = _is.read_any();
				has_event.value = _is.read_boolean();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosEventComm/Disconnected:1.0"))
				{
					throw org.omg.hw.CosEventComm.DisconnectedHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "try_pull", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProxyPullSupplierOperations _localServant = (ProxyPullSupplierOperations)_so.servant;
			org.omg.CORBA.Any _result;			try
			{
			_result = _localServant.try_pull(has_event);
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
