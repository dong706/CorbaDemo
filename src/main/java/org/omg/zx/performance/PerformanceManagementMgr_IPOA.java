package org.omg.zx.performance;

/**
 *	Generated from IDL interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class PerformanceManagementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.zx.performance.PerformanceManagementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "clearPMData", new java.lang.Integer(0));
		m_opsHash.put ( "disablePMData", new java.lang.Integer(1));
		m_opsHash.put ( "getAllCurrentPMDataByCond", new java.lang.Integer(2));
		m_opsHash.put ( "queryPMCollectionPlan", new java.lang.Integer(3));
		m_opsHash.put ( "setTCATPParameter", new java.lang.Integer(4));
		m_opsHash.put ( "changePMCollectionPlan", new java.lang.Integer(5));
		m_opsHash.put ( "getAllPMPs", new java.lang.Integer(6));
		m_opsHash.put ( "getTCATPParameter", new java.lang.Integer(7));
		m_opsHash.put ( "getHistoryPMData", new java.lang.Integer(8));
		m_opsHash.put ( "getTPHistoryPMData", new java.lang.Integer(9));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(10));
		m_opsHash.put ( "clearPMCollectionPlan", new java.lang.Integer(11));
		m_opsHash.put ( "getAllCurrentPMData", new java.lang.Integer(12));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(13));
		m_opsHash.put ( "enablePMData", new java.lang.Integer(14));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(15));
		m_opsHash.put ( "getAllPMCollectionPlan", new java.lang.Integer(16));
		m_opsHash.put ( "setPMCollectionPlan", new java.lang.Integer(17));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(18));
		m_opsHash.put ( "clearSpecificPMData", new java.lang.Integer(19));
		m_opsHash.put ( "setLocation", new java.lang.Integer(20));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/performance/PerformanceManagementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.zx.performance.PerformanceManagementMgr_I _this()
	{
		return org.omg.zx.performance.PerformanceManagementMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.performance.PerformanceManagementMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // clearPMData
			{
			try
			{
				org.omg.zx.performance.PMTPSelect_T[] _arg0=org.omg.zx.performance.PMTPSelectList_THelper.read(_input);
				org.omg.zx.performance.PMTPSelectList_THolder _arg1= new org.omg.zx.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				clearPMData(_arg0,_arg1);
				org.omg.zx.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // disablePMData
			{
			try
			{
				org.omg.zx.performance.PMTPSelect_T[] _arg0=org.omg.zx.performance.PMTPSelectList_THelper.read(_input);
				org.omg.zx.performance.PMTPSelectList_THolder _arg1= new org.omg.zx.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				disablePMData(_arg0,_arg1);
				org.omg.zx.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getAllCurrentPMDataByCond
			{
			try
			{
				org.omg.zx.performance.PMTPParamSelect_T[] _arg0=org.omg.zx.performance.PMTPParamSelectList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.zx.performance.PMData_THolder _arg2= new org.omg.zx.performance.PMData_THolder();
				org.omg.zx.performance.PMDataIterator_IHolder _arg3= new org.omg.zx.performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getAllCurrentPMDataByCond(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.performance.PMData_THelper.write(_out,_arg2.value);
				org.omg.zx.performance.PMDataIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // queryPMCollectionPlan
			{
			try
			{
				int _arg0=_input.read_long();
				org.omg.zx.performance.PMCollectionPlanList_THolder _arg1= new org.omg.zx.performance.PMCollectionPlanList_THolder();
				_out = handler.createReply();
				queryPMCollectionPlan(_arg0,_arg1);
				org.omg.zx.performance.PMCollectionPlanList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setTCATPParameter
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.performance.TCAParameters_THolder _arg1= new org.omg.zx.performance.TCAParameters_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setTCATPParameter(_arg0,_arg1);
				org.omg.zx.performance.TCAParameters_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // changePMCollectionPlan
			{
			try
			{
				int _arg0=_input.read_long();
				org.omg.zx.performance.PMCollectionPlan_T[] _arg1=org.omg.zx.performance.PMCollectionPlanList_THelper.read(_input);
				_out = handler.createReply();
				changePMCollectionPlan(_arg0,_arg1);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getAllPMPs
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.zx.performance.PMPList_THolder _arg2= new org.omg.zx.performance.PMPList_THolder();
				org.omg.zx.performance.PMPIterator_IHolder _arg3= new org.omg.zx.performance.PMPIterator_IHolder();
				_out = handler.createReply();
				getAllPMPs(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.performance.PMPList_THelper.write(_out,_arg2.value);
				org.omg.zx.performance.PMPIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getTCATPParameter
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				java.lang.String _arg2=_input.read_string();
				org.omg.zx.performance.TCAParameters_THolder _arg3= new org.omg.zx.performance.TCAParameters_THolder();
				_out = handler.createReply();
				getTCATPParameter(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.performance.TCAParameters_THelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getHistoryPMData
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.zx.performance.PMTPParamSelect_T[] _arg3=org.omg.zx.performance.PMTPParamSelectList_THelper.read(_input);
				java.lang.String _arg4=_input.read_string();
				java.lang.String _arg5=_input.read_string();
				boolean _arg6=_input.read_boolean();
				_out = handler.createReply();
				getHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getTPHistoryPMData
			{
			try
			{
				org.omg.zx.performance.PMTPSelect_T[] _arg0=org.omg.zx.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.zx.performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				int _arg4=_input.read_ulong();
				org.omg.zx.performance.PMDataList_THolder _arg5= new org.omg.zx.performance.PMDataList_THolder();
				org.omg.zx.performance.PMDataIterator_IHolder _arg6= new org.omg.zx.performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getTPHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				org.omg.zx.performance.PMDataList_THelper.write(_out,_arg5.value);
				org.omg.zx.performance.PMDataIterator_IHelper.write(_out,_arg6.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // setAdditionalInfo
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
			case 11: // clearPMCollectionPlan
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				clearPMCollectionPlan(_arg0);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllCurrentPMData
			{
			try
			{
				org.omg.zx.performance.PMTPSelect_T[] _arg0=org.omg.zx.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.zx.performance.PMParameterNameList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.zx.performance.PMDataList_THolder _arg3= new org.omg.zx.performance.PMDataList_THolder();
				org.omg.zx.performance.PMDataIterator_IHolder _arg4= new org.omg.zx.performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getAllCurrentPMData(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.performance.PMDataList_THelper.write(_out,_arg3.value);
				org.omg.zx.performance.PMDataIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getCapabilities
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
			case 14: // enablePMData
			{
			try
			{
				org.omg.zx.performance.PMTPSelect_T[] _arg0=org.omg.zx.performance.PMTPSelectList_THelper.read(_input);
				org.omg.zx.performance.PMTPSelectList_THolder _arg1= new org.omg.zx.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				enablePMData(_arg0,_arg1);
				org.omg.zx.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // setUserLabel
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
			case 16: // getAllPMCollectionPlan
			{
			try
			{
				org.omg.zx.performance.PMTaskList_THolder _arg0= new org.omg.zx.performance.PMTaskList_THolder();
				_out = handler.createReply();
				getAllPMCollectionPlan(_arg0);
				org.omg.zx.performance.PMTaskList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // setPMCollectionPlan
			{
			try
			{
				org.omg.zx.performance.PMCollectionPlan_T[] _arg0=org.omg.zx.performance.PMCollectionPlanList_THelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				setPMCollectionPlan(_arg0,_arg1);
				_out.write_long(_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // setNativeEMSName
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
			case 19: // clearSpecificPMData
			{
			try
			{
				org.omg.zx.performance.PMTPParamSelect_T[] _arg0=org.omg.zx.performance.PMTPParamSelectList_THelper.read(_input);
				org.omg.zx.performance.PMTPParamSelectList_THolder _arg1= new org.omg.zx.performance.PMTPParamSelectList_THolder();
				_out = handler.createReply();
				clearSpecificPMData(_arg0,_arg1);
				org.omg.zx.performance.PMTPParamSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // setLocation
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
