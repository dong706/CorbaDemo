package org.omg.hw.trafficConditioningProfile;

/**
 *	Generated from IDL interface "TCProfileMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class TCProfileMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.trafficConditioningProfile.TCProfileMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "HW_createTCProfile", new java.lang.Integer(0));
		m_opsHash.put ( "modifyTCProfile", new java.lang.Integer(1));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(2));
		m_opsHash.put ( "deleteTCProfile", new java.lang.Integer(3));
		m_opsHash.put ( "getTCProfileAssociatedTPs", new java.lang.Integer(4));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(5));
		m_opsHash.put ( "HW_modifyTCProfile", new java.lang.Integer(6));
		m_opsHash.put ( "assignTrafficConditioningProfile", new java.lang.Integer(7));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(8));
		m_opsHash.put ( "getTCProfile", new java.lang.Integer(9));
		m_opsHash.put ( "HW_getAllTCProfileNames", new java.lang.Integer(10));
		m_opsHash.put ( "HW_getTCProfile", new java.lang.Integer(11));
		m_opsHash.put ( "getTCProfileAssociatedResouces", new java.lang.Integer(12));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(13));
		m_opsHash.put ( "setOwner", new java.lang.Integer(14));
		m_opsHash.put ( "createTCProfile", new java.lang.Integer(15));
		m_opsHash.put ( "deassignTrafficConditioningProfile", new java.lang.Integer(16));
		m_opsHash.put ( "getAllTCProfiles", new java.lang.Integer(17));
		m_opsHash.put ( "HW_getAllTCProfiles", new java.lang.Integer(18));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/trafficConditioningProfile/TCProfileMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.hw.trafficConditioningProfile.TCProfileMgr_I _this()
	{
		return org.omg.hw.trafficConditioningProfile.TCProfileMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.trafficConditioningProfile.TCProfileMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.trafficConditioningProfile.TCProfileMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // HW_createTCProfile
			{
			try
			{
				org.omg.hw.trafficConditioningProfile.HW_TCProfileCreateData_T _arg0=org.omg.hw.trafficConditioningProfile.HW_TCProfileCreateData_THelper.read(_input);
				org.omg.hw.trafficConditioningProfile.HW_TCProfile_THolder _arg1= new org.omg.hw.trafficConditioningProfile.HW_TCProfile_THolder();
				_out = handler.createReply();
				HW_createTCProfile(_arg0,_arg1);
				org.omg.hw.trafficConditioningProfile.HW_TCProfile_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // modifyTCProfile
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.trafficConditioningProfile.TCProfileCreateData_T _arg1=org.omg.hw.trafficConditioningProfile.TCProfileCreateData_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg2= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.hw.trafficConditioningProfile.TCProfile_THolder _arg3= new org.omg.hw.trafficConditioningProfile.TCProfile_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyTCProfile(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				org.omg.hw.trafficConditioningProfile.TCProfile_THelper.write(_out,_arg3.value);
				_out.write_string(_arg4.value);
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
			case 3: // deleteTCProfile
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteTCProfile(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getTCProfileAssociatedTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg2= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				org.omg.hw.terminationPoint.TerminationPointIterator_IHolder _arg3= new org.omg.hw.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getTCProfileAssociatedTPs(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.terminationPoint.TerminationPointList_THelper.write(_out,_arg2.value);
				org.omg.hw.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setUserLabel
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
			case 6: // HW_modifyTCProfile
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.trafficConditioningProfile.HW_TCProfileCreateData_T _arg1=org.omg.hw.trafficConditioningProfile.HW_TCProfileCreateData_THelper.read(_input);
				org.omg.hw.trafficConditioningProfile.HW_TCProfile_THolder _arg2= new org.omg.hw.trafficConditioningProfile.HW_TCProfile_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				HW_modifyTCProfile(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.trafficConditioningProfile.HW_TCProfile_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // assignTrafficConditioningProfile
			{
			try
			{
				org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssign_T[] _arg0=org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssignList_THelper.read(_input);
				org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder _arg1= new org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder();
				_out = handler.createReply();
				assignTrafficConditioningProfile(_arg0,_arg1);
				org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssignList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setNativeEMSName
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
			case 9: // getTCProfile
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.trafficConditioningProfile.TCProfile_THolder _arg1= new org.omg.hw.trafficConditioningProfile.TCProfile_THolder();
				_out = handler.createReply();
				getTCProfile(_arg0,_arg1);
				org.omg.hw.trafficConditioningProfile.TCProfile_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // HW_getAllTCProfileNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg2= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				HW_getAllTCProfileNames(_arg0,_arg1,_arg2);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // HW_getTCProfile
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.trafficConditioningProfile.HW_TCProfile_THolder _arg1= new org.omg.hw.trafficConditioningProfile.HW_TCProfile_THolder();
				_out = handler.createReply();
				HW_getTCProfile(_arg0,_arg1);
				org.omg.hw.trafficConditioningProfile.HW_TCProfile_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getTCProfileAssociatedResouces
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder _arg1= new org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder();
				_out = handler.createReply();
				getTCProfileAssociatedResouces(_arg0,_arg1);
				org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssignList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // setAdditionalInfo
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
			case 14: // setOwner
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
			case 15: // createTCProfile
			{
			try
			{
				org.omg.hw.trafficConditioningProfile.TCProfileCreateData_T _arg0=org.omg.hw.trafficConditioningProfile.TCProfileCreateData_THelper.read(_input);
				org.omg.hw.trafficConditioningProfile.TCProfile_THolder _arg1= new org.omg.hw.trafficConditioningProfile.TCProfile_THolder();
				_out = handler.createReply();
				createTCProfile(_arg0,_arg1);
				org.omg.hw.trafficConditioningProfile.TCProfile_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // deassignTrafficConditioningProfile
			{
			try
			{
				org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] _arg0=org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassignList_THelper.read(_input);
				org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassignList_THolder _arg1= new org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassignList_THolder();
				_out = handler.createReply();
				deassignTrafficConditioningProfile(_arg0,_arg1);
				org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassignList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getAllTCProfiles
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.trafficConditioningProfile.TCProfileList_THolder _arg1= new org.omg.hw.trafficConditioningProfile.TCProfileList_THolder();
				org.omg.hw.trafficConditioningProfile.TCProfileIterator_IHolder _arg2= new org.omg.hw.trafficConditioningProfile.TCProfileIterator_IHolder();
				_out = handler.createReply();
				getAllTCProfiles(_arg0,_arg1,_arg2);
				org.omg.hw.trafficConditioningProfile.TCProfileList_THelper.write(_out,_arg1.value);
				org.omg.hw.trafficConditioningProfile.TCProfileIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // HW_getAllTCProfiles
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.trafficConditioningProfile.HW_TCProfileList_THolder _arg1= new org.omg.hw.trafficConditioningProfile.HW_TCProfileList_THolder();
				org.omg.hw.trafficConditioningProfile.HW_TCProfileIterator_IHolder _arg2= new org.omg.hw.trafficConditioningProfile.HW_TCProfileIterator_IHolder();
				_out = handler.createReply();
				HW_getAllTCProfiles(_arg0,_arg1,_arg2);
				org.omg.hw.trafficConditioningProfile.HW_TCProfileList_THelper.write(_out,_arg1.value);
				org.omg.hw.trafficConditioningProfile.HW_TCProfileIterator_IHelper.write(_out,_arg2.value);
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
