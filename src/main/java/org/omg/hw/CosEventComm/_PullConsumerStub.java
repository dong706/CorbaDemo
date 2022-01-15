package org.omg.hw.CosEventComm;


/**
 *	Generated from IDL interface "PullConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _PullConsumerStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.CosEventComm.PullConsumer
{
	private String[] ids = {"IDL:omg.org/CosEventComm/PullConsumer:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.CosEventComm.PullConsumerOperations.class;
	public void disconnect_pull_consumer()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "disconnect_pull_consumer", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "disconnect_pull_consumer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PullConsumerOperations _localServant = (PullConsumerOperations)_so.servant;
			try
			{
			_localServant.disconnect_pull_consumer();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

}
