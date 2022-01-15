package org.omg.zx.mLSNPPLink;

/**
 *	Generated from IDL interface "MLSNPPLinkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class MLSNPPLinkMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.zx.mLSNPPLink.MLSNPPLinkMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getAvailableCapacity", new java.lang.Integer(0));
		m_opsHash.put ( "modifySignallingProtocolParameters", new java.lang.Integer(1));
		m_opsHash.put ( "setLocation", new java.lang.Integer(2));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(3));
		m_opsHash.put ( "assignSignallingController", new java.lang.Integer(4));
		m_opsHash.put ( "setTNANameForMLSNPPLinkEnd", new java.lang.Integer(5));
		m_opsHash.put ( "enableSignalling", new java.lang.Integer(6));
		m_opsHash.put ( "setSignallingProtocolAndParameters", new java.lang.Integer(7));
		m_opsHash.put ( "deassignSignallingController", new java.lang.Integer(8));
		m_opsHash.put ( "disableSignalling", new java.lang.Integer(9));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(10));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(11));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(12));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/mLSNPPLink/MLSNPPLinkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.zx.mLSNPPLink.MLSNPPLinkMgr_I _this()
	{
		return org.omg.zx.mLSNPPLink.MLSNPPLinkMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.mLSNPPLink.MLSNPPLinkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.mLSNPPLink.MLSNPPLinkMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getAvailableCapacity
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				org.omg.zx.mLSNPPLink.AvailableCapacity_THolder _arg2= new org.omg.zx.mLSNPPLink.AvailableCapacity_THolder();
				_out = handler.createReply();
				getAvailableCapacity(_arg0,_arg1,_arg2);
				org.omg.zx.mLSNPPLink.AvailableCapacity_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // modifySignallingProtocolParameters
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.globaldefs.NVSList_THolder _arg1= new org.omg.zx.globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				modifySignallingProtocolParameters(_arg0,_arg1);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setLocation
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setLocation(_arg0,_arg1);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setNativeEMSName
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // assignSignallingController
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				assignSignallingController(_arg0,_arg1);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setTNANameForMLSNPPLinkEnd
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.mLSNPP.SNPTNAData_T[] _arg1=org.omg.zx.mLSNPP.SNPTNADataList_THelper.read(_input);
				org.omg.zx.mLSNPP.SNPPTNAPair_T[] _arg2=org.omg.zx.mLSNPP.SNPPTNAPairList_THelper.read(_input);
				java.lang.String _arg3=_input.read_string();
				java.lang.String _arg4=_input.read_string();
				java.lang.String _arg5=_input.read_string();
				java.lang.String _arg6=_input.read_string();
				org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_THolder _arg7= new org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_THolder();
				_out = handler.createReply();
				setTNANameForMLSNPPLinkEnd(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_THelper.write(_out,_arg7.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // enableSignalling
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				enableSignalling(_arg0);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // setSignallingProtocolAndParameters
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg2=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setSignallingProtocolAndParameters(_arg0,_arg1,_arg2);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // deassignSignallingController
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deassignSignallingController(_arg0);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // disableSignalling
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				disableSignalling(_arg0);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // setUserLabel
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // setAdditionalInfo
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.globaldefs.NVSList_THolder _arg1= new org.omg.zx.globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getCapabilities
			{
			try
			{
				org.omg.zx.common.CapabilityList_THolder _arg0= new org.omg.zx.common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				org.omg.zx.common.CapabilityList_THelper.write(_out,_arg0.value);
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
