package org.omg.hw.performance;

/**
 *	Generated from IDL interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class PerformanceManagementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.performance.PerformanceManagementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "selectPMCollectionTask", new java.lang.Integer(0));
		m_opsHash.put ( "clearPMData", new java.lang.Integer(1));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(2));
		m_opsHash.put ( "getPMState", new java.lang.Integer(3));
		m_opsHash.put ( "createPMCollectionTask", new java.lang.Integer(4));
		m_opsHash.put ( "createPerformanceMonitoringData", new java.lang.Integer(5));
		m_opsHash.put ( "disablePMData", new java.lang.Integer(6));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(7));
		m_opsHash.put ( "getTPHistoryPMData", new java.lang.Integer(8));
		m_opsHash.put ( "setTCATPParameter", new java.lang.Integer(9));
		m_opsHash.put ( "ModifyPMCollectionTask", new java.lang.Integer(10));
		m_opsHash.put ( "getHoldingTime", new java.lang.Integer(11));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(12));
		m_opsHash.put ( "getHistoryPMData", new java.lang.Integer(13));
		m_opsHash.put ( "disableTCA", new java.lang.Integer(14));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(15));
		m_opsHash.put ( "getTCATPParameter", new java.lang.Integer(16));
		m_opsHash.put ( "setOwner", new java.lang.Integer(17));
		m_opsHash.put ( "getPfmInstanceByResource", new java.lang.Integer(18));
		m_opsHash.put ( "setTCANotifySwitch", new java.lang.Integer(19));
		m_opsHash.put ( "SuspendPMCollectionTask", new java.lang.Integer(20));
		m_opsHash.put ( "getAllCurrentPMData", new java.lang.Integer(21));
		m_opsHash.put ( "enableTCA", new java.lang.Integer(22));
		m_opsHash.put ( "enablePMData", new java.lang.Integer(23));
		m_opsHash.put ( "ResumePMCollectionTask", new java.lang.Integer(24));
		m_opsHash.put ( "getMEPMcapabilities", new java.lang.Integer(25));
		m_opsHash.put ( "deletePerformanceMonitoringData", new java.lang.Integer(26));
		m_opsHash.put ( "getHistoryPMDataByPull", new java.lang.Integer(27));
		m_opsHash.put ( "deletePMCollectionTask", new java.lang.Integer(28));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/performance/PerformanceManagementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.hw.performance.PerformanceManagementMgr_I _this()
	{
		return org.omg.hw.performance.PerformanceManagementMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.performance.PerformanceManagementMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // selectPMCollectionTask
			{
			try
			{
				java.lang.String[] _arg0=org.omg.hw.performance.CollectTaskNameList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				org.omg.hw.performance.CollectTaskInfoList_THolder _arg2= new org.omg.hw.performance.CollectTaskInfoList_THolder();
				_out = handler.createReply();
				selectPMCollectionTask(_arg0,_arg1,_arg2);
				org.omg.hw.performance.CollectTaskInfoList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // clearPMData
			{
			try
			{
				org.omg.hw.performance.PMTPSelect_T[] _arg0=org.omg.hw.performance.PMTPSelectList_THelper.read(_input);
				org.omg.hw.performance.PMTPSelectList_THolder _arg1= new org.omg.hw.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				clearPMData(_arg0,_arg1);
				org.omg.hw.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getCapabilities
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
			case 3: // getPMState
			{
			try
			{
				org.omg.hw.performance.PMTPSelect_T[] _arg0=org.omg.hw.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.hw.performance.PMParameterNameList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.performance.PMStateList_THolder _arg3= new org.omg.hw.performance.PMStateList_THolder();
				org.omg.hw.performance.PMStateIterator_IHolder _arg4= new org.omg.hw.performance.PMStateIterator_IHolder();
				_out = handler.createReply();
				getPMState(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.performance.PMStateList_THelper.write(_out,_arg3.value);
				org.omg.hw.performance.PMStateIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // createPMCollectionTask
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				java.lang.String _arg4=_input.read_string();
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg5=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String _arg6=_input.read_string();
				java.lang.String _arg7=_input.read_string();
				java.lang.String _arg8=_input.read_string();
				boolean _arg9=_input.read_boolean();
				_out = handler.createReply();
				createPMCollectionTask(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8,_arg9);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // createPerformanceMonitoringData
			{
			try
			{
				org.omg.hw.performance.PerformanceCreateInstance_T _arg0=org.omg.hw.performance.PerformanceCreateInstance_THelper.read(_input);
				org.omg.hw.performance.PerformanceCreateInstanceList_THolder _arg1= new org.omg.hw.performance.PerformanceCreateInstanceList_THolder();
				_out = handler.createReply();
				createPerformanceMonitoringData(_arg0,_arg1);
				org.omg.hw.performance.PerformanceCreateInstanceList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // disablePMData
			{
			try
			{
				org.omg.hw.performance.PMTPSelect_T[] _arg0=org.omg.hw.performance.PMTPSelectList_THelper.read(_input);
				org.omg.hw.performance.PMTPSelectList_THolder _arg1= new org.omg.hw.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				disablePMData(_arg0,_arg1);
				org.omg.hw.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // setUserLabel
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
			case 8: // getTPHistoryPMData
			{
			try
			{
				org.omg.hw.performance.PMTPSelect_T[] _arg0=org.omg.hw.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.hw.performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				int _arg4=_input.read_ulong();
				org.omg.hw.performance.PMDataList_THolder _arg5= new org.omg.hw.performance.PMDataList_THolder();
				org.omg.hw.performance.PMDataIterator_IHolder _arg6= new org.omg.hw.performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getTPHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				org.omg.hw.performance.PMDataList_THelper.write(_out,_arg5.value);
				org.omg.hw.performance.PMDataIterator_IHelper.write(_out,_arg6.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // setTCATPParameter
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.performance.TCAParameters_THolder _arg1= new org.omg.hw.performance.TCAParameters_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setTCATPParameter(_arg0,_arg1);
				org.omg.hw.performance.TCAParameters_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // ModifyPMCollectionTask
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				ModifyPMCollectionTask(_arg0,_arg1,_arg2);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getHoldingTime
			{
			try
			{
				org.omg.hw.performance.HoldingTime_THolder _arg0= new org.omg.hw.performance.HoldingTime_THolder();
				_out = handler.createReply();
				getHoldingTime(_arg0);
				org.omg.hw.performance.HoldingTime_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // setNativeEMSName
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
			case 13: // getHistoryPMData
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.hw.performance.PMTPSelect_T[] _arg3=org.omg.hw.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg4=org.omg.hw.performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg5=_input.read_string();
				java.lang.String _arg6=_input.read_string();
				boolean _arg7=_input.read_boolean();
				_out = handler.createReply();
				getHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // disableTCA
			{
			try
			{
				org.omg.hw.performance.PMTPSelect_T[] _arg0=org.omg.hw.performance.PMTPSelectList_THelper.read(_input);
				org.omg.hw.performance.PMTPSelectList_THolder _arg1= new org.omg.hw.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				disableTCA(_arg0,_arg1);
				org.omg.hw.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // setAdditionalInfo
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
			case 16: // getTCATPParameter
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				java.lang.String _arg2=_input.read_string();
				org.omg.hw.performance.TCAParameters_THolder _arg3= new org.omg.hw.performance.TCAParameters_THolder();
				_out = handler.createReply();
				getTCATPParameter(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.performance.TCAParameters_THelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // setOwner
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
			case 18: // getPfmInstanceByResource
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				org.omg.hw.performance.PerformanceMonitoringInstanceList_THolder _arg2= new org.omg.hw.performance.PerformanceMonitoringInstanceList_THolder();
				_out = handler.createReply();
				getPfmInstanceByResource(_arg0,_arg1,_arg2);
				org.omg.hw.performance.PerformanceMonitoringInstanceList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // setTCANotifySwitch
			{
			try
			{
				boolean _arg0=_input.read_boolean();
				_out = handler.createReply();
				setTCANotifySwitch(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // SuspendPMCollectionTask
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				SuspendPMCollectionTask(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getAllCurrentPMData
			{
			try
			{
				org.omg.hw.performance.PMTPSelect_T[] _arg0=org.omg.hw.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.hw.performance.PMParameterNameList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.performance.PMDataList_THolder _arg3= new org.omg.hw.performance.PMDataList_THolder();
				org.omg.hw.performance.PMDataIterator_IHolder _arg4= new org.omg.hw.performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getAllCurrentPMData(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.performance.PMDataList_THelper.write(_out,_arg3.value);
				org.omg.hw.performance.PMDataIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // enableTCA
			{
			try
			{
				org.omg.hw.performance.PMTPSelect_T[] _arg0=org.omg.hw.performance.PMTPSelectList_THelper.read(_input);
				org.omg.hw.performance.PMTPSelectList_THolder _arg1= new org.omg.hw.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				enableTCA(_arg0,_arg1);
				org.omg.hw.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // enablePMData
			{
			try
			{
				org.omg.hw.performance.PMTPSelect_T[] _arg0=org.omg.hw.performance.PMTPSelectList_THelper.read(_input);
				org.omg.hw.performance.PMTPSelectList_THolder _arg1= new org.omg.hw.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				enablePMData(_arg0,_arg1);
				org.omg.hw.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // ResumePMCollectionTask
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				ResumePMCollectionTask(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getMEPMcapabilities
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				org.omg.hw.performance.PMParameterList_THolder _arg2= new org.omg.hw.performance.PMParameterList_THolder();
				_out = handler.createReply();
				getMEPMcapabilities(_arg0,_arg1,_arg2);
				org.omg.hw.performance.PMParameterList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // deletePerformanceMonitoringData
			{
			try
			{
				org.omg.hw.performance.PMTPSelect_T[] _arg0=org.omg.hw.performance.PMTPSelectList_THelper.read(_input);
				org.omg.hw.performance.PMTPSelectList_THolder _arg1= new org.omg.hw.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				deletePerformanceMonitoringData(_arg0,_arg1);
				org.omg.hw.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getHistoryPMDataByPull
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.hw.performance.PMTPSelect_T[] _arg3=org.omg.hw.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg4=org.omg.hw.performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg5=_input.read_string();
				java.lang.String _arg6=_input.read_string();
				_out = handler.createReply();
				getHistoryPMDataByPull(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // deletePMCollectionTask
			{
			try
			{
				java.lang.String[] _arg0=org.omg.hw.performance.CollectTaskNameList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				deletePMCollectionTask(_arg0,_arg1);
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
