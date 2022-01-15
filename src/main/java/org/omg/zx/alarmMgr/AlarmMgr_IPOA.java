package org.omg.zx.alarmMgr;

/**
 *	Generated from IDL interface "AlarmMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class AlarmMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.zx.alarmMgr.AlarmMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setLocation", new java.lang.Integer(0));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(1));
		m_opsHash.put ( "getPerceivedSeverities", new java.lang.Integer(2));
		m_opsHash.put ( "setAlarmReportingOff", new java.lang.Integer(3));
		m_opsHash.put ( "setAlarmReportingOn", new java.lang.Integer(4));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(5));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(6));
		m_opsHash.put ( "setPerceivedSeverities", new java.lang.Integer(7));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(8));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/alarmMgr/AlarmMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.zx.alarmMgr.AlarmMgr_I _this()
	{
		return org.omg.zx.alarmMgr.AlarmMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.alarmMgr.AlarmMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.alarmMgr.AlarmMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // setLocation
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
			case 1: // setNativeEMSName
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
			case 2: // getPerceivedSeverities
			{
			try
			{
				org.omg.zx.alarmMgr.SeverityAssignmentList_THolder _arg0= new org.omg.zx.alarmMgr.SeverityAssignmentList_THolder();
				_out = handler.createReply();
				getPerceivedSeverities(_arg0);
				org.omg.zx.alarmMgr.SeverityAssignmentList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setAlarmReportingOff
			{
			try
			{
				org.omg.zx.alarmMgr.ObjectAndRate_T[] _arg0=org.omg.zx.alarmMgr.ObjectAndRateList_THelper.read(_input);
				_out = handler.createReply();
				setAlarmReportingOff(_arg0);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setAlarmReportingOn
			{
			try
			{
				org.omg.zx.alarmMgr.ObjectAndRate_T[] _arg0=org.omg.zx.alarmMgr.ObjectAndRateList_THelper.read(_input);
				_out = handler.createReply();
				setAlarmReportingOn(_arg0);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setUserLabel
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
			case 6: // setAdditionalInfo
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
			case 7: // setPerceivedSeverities
			{
			try
			{
				org.omg.zx.alarmMgr.SeverityAssignment_T[] _arg0=org.omg.zx.alarmMgr.SeverityAssignmentList_THelper.read(_input);
				_out = handler.createReply();
				setPerceivedSeverities(_arg0);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getCapabilities
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
