package org.omg.hw.HW_mstpService;

/**
 *	Generated from IDL interface "HW_MSTPServiceMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class HW_MSTPServiceMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.HW_mstpService.HW_MSTPServiceMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getAtmService", new java.lang.Integer(0));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(1));
		m_opsHash.put ( "getAllAtmService", new java.lang.Integer(2));
		m_opsHash.put ( "deactivateAtmService", new java.lang.Integer(3));
		m_opsHash.put ( "getAllEthService", new java.lang.Integer(4));
		m_opsHash.put ( "createEthService", new java.lang.Integer(5));
		m_opsHash.put ( "activateAtmService", new java.lang.Integer(6));
		m_opsHash.put ( "deleteAtmService", new java.lang.Integer(7));
		m_opsHash.put ( "setOwner", new java.lang.Integer(8));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(9));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(10));
		m_opsHash.put ( "deleteEthService", new java.lang.Integer(11));
		m_opsHash.put ( "createAtmService", new java.lang.Integer(12));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(13));
		m_opsHash.put ( "getEthService", new java.lang.Integer(14));
	}
	private String[] ids = {"IDL:mtnm.huawei.com/HW_mstpService/HW_MSTPServiceMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.hw.HW_mstpService.HW_MSTPServiceMgr_I _this()
	{
		return org.omg.hw.HW_mstpService.HW_MSTPServiceMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.HW_mstpService.HW_MSTPServiceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.HW_mstpService.HW_MSTPServiceMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getAtmService
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_mstpService.HW_AtmService_THolder _arg1= new org.omg.hw.HW_mstpService.HW_AtmService_THolder();
				_out = handler.createReply();
				getAtmService(_arg0,_arg1);
				org.omg.hw.HW_mstpService.HW_AtmService_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getCapabilities
			{
			try
			{
				org.omg.hw.common.CapabilityList_THolder _arg0= new org.omg.hw.common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				org.omg.hw.common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getAllAtmService
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_mstpService.HW_AtmServiceType_T[] _arg1=org.omg.hw.HW_mstpService.HW_AtmServiceTypeList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.HW_mstpService.HW_AtmServiceList_THolder _arg3= new org.omg.hw.HW_mstpService.HW_AtmServiceList_THolder();
				org.omg.hw.HW_mstpService.HW_AtmServiceIterator_IHolder _arg4= new org.omg.hw.HW_mstpService.HW_AtmServiceIterator_IHolder();
				_out = handler.createReply();
				getAllAtmService(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.HW_mstpService.HW_AtmServiceList_THelper.write(_out,_arg3.value);
				org.omg.hw.HW_mstpService.HW_AtmServiceIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // deactivateAtmService
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_mstpService.HW_AtmService_THolder _arg1= new org.omg.hw.HW_mstpService.HW_AtmService_THolder();
				_out = handler.createReply();
				deactivateAtmService(_arg0,_arg1);
				org.omg.hw.HW_mstpService.HW_AtmService_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getAllEthService
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_mstpService.HW_EthServiceType_T[] _arg1=org.omg.hw.HW_mstpService.HW_EthServiceTypeList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.HW_mstpService.HW_EthServiceList_THolder _arg3= new org.omg.hw.HW_mstpService.HW_EthServiceList_THolder();
				org.omg.hw.HW_mstpService.HW_EthServiceIterator_IHolder _arg4= new org.omg.hw.HW_mstpService.HW_EthServiceIterator_IHolder();
				_out = handler.createReply();
				getAllEthService(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.HW_mstpService.HW_EthServiceList_THelper.write(_out,_arg3.value);
				org.omg.hw.HW_mstpService.HW_EthServiceIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // createEthService
			{
			try
			{
				org.omg.hw.HW_mstpService.HW_EthServiceCreateData_T _arg0=org.omg.hw.HW_mstpService.HW_EthServiceCreateData_THelper.read(_input);
				org.omg.hw.HW_mstpService.HW_EthServiceList_THolder _arg1= new org.omg.hw.HW_mstpService.HW_EthServiceList_THolder();
				_out = handler.createReply();
				createEthService(_arg0,_arg1);
				org.omg.hw.HW_mstpService.HW_EthServiceList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // activateAtmService
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_mstpService.HW_AtmService_THolder _arg1= new org.omg.hw.HW_mstpService.HW_AtmService_THolder();
				_out = handler.createReply();
				activateAtmService(_arg0,_arg1);
				org.omg.hw.HW_mstpService.HW_AtmService_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // deleteAtmService
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteAtmService(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setOwner
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setOwner(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // setAdditionalInfo
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NVSList_THolder _arg1= new org.omg.hw.globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				org.omg.hw.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // setUserLabel
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // deleteEthService
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteEthService(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // createAtmService
			{
			try
			{
				org.omg.hw.HW_mstpService.HW_AtmServiceCreateData_T _arg0=org.omg.hw.HW_mstpService.HW_AtmServiceCreateData_THelper.read(_input);
				org.omg.hw.HW_mstpService.HW_AtmService_THolder _arg1= new org.omg.hw.HW_mstpService.HW_AtmService_THolder();
				_out = handler.createReply();
				createAtmService(_arg0,_arg1);
				org.omg.hw.HW_mstpService.HW_AtmService_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // setNativeEMSName
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getEthService
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_mstpService.HW_EthService_THolder _arg1= new org.omg.hw.HW_mstpService.HW_EthService_THolder();
				_out = handler.createReply();
				getEthService(_arg0,_arg1);
				org.omg.hw.HW_mstpService.HW_EthService_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
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
