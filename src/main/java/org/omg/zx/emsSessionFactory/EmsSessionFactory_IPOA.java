package org.omg.zx.emsSessionFactory;

/**
 *	Generated from IDL interface "EmsSessionFactory_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class EmsSessionFactory_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.zx.emsSessionFactory.EmsSessionFactory_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getEmsSession", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/emsSessionFactory/EmsSessionFactory_I:1.0"};
	public org.omg.zx.emsSessionFactory.EmsSessionFactory_I _this()
	{
		return org.omg.zx.emsSessionFactory.EmsSessionFactory_IHelper.narrow(_this_object());
	}
	public org.omg.zx.emsSessionFactory.EmsSessionFactory_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.emsSessionFactory.EmsSessionFactory_IHelper.narrow(_this_object(orb));
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
			case 0: // getEmsSession
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				org.omg.zx.nmsSession.NmsSession_I _arg2=org.omg.zx.nmsSession.NmsSession_IHelper.read(_input);
				org.omg.zx.emsSession.EmsSession_IHolder _arg3= new org.omg.zx.emsSession.EmsSession_IHolder();
				_out = handler.createReply();
				getEmsSession(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.emsSession.EmsSession_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
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
