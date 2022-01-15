package org.omg.hw.trafficDescriptor;

/**
 *	Generated from IDL interface "TrafficDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class TrafficDescriptorMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.trafficDescriptor.TrafficDescriptorMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getAssociatedCTPs", new java.lang.Integer(0));
		m_opsHash.put ( "createTrafficDescriptor", new java.lang.Integer(1));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(2));
		m_opsHash.put ( "deleteTrafficDescriptor", new java.lang.Integer(3));
		m_opsHash.put ( "HW_getAllTrafficDescriptors", new java.lang.Integer(4));
		m_opsHash.put ( "setOwner", new java.lang.Integer(5));
		m_opsHash.put ( "deactivateTrafficDescriptor", new java.lang.Integer(6));
		m_opsHash.put ( "getAllTrafficDescriptors", new java.lang.Integer(7));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(8));
		m_opsHash.put ( "getTrafficDescriptor", new java.lang.Integer(9));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(10));
		m_opsHash.put ( "activateTrafficDescriptor", new java.lang.Integer(11));
		m_opsHash.put ( "HW_getAllTrafficDescriptorNames", new java.lang.Integer(12));
		m_opsHash.put ( "getAllTrafficDescriptorNames", new java.lang.Integer(13));
		m_opsHash.put ( "HW_createTrafficDescriptor", new java.lang.Integer(14));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(15));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/trafficDescriptor/TrafficDescriptorMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.hw.trafficDescriptor.TrafficDescriptorMgr_I _this()
	{
		return org.omg.hw.trafficDescriptor.TrafficDescriptorMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.trafficDescriptor.TrafficDescriptorMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.trafficDescriptor.TrafficDescriptorMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getAssociatedCTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg2= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				org.omg.hw.terminationPoint.TerminationPointIterator_IHolder _arg3= new org.omg.hw.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAssociatedCTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 1: // createTrafficDescriptor
			{
			try
			{
				org.omg.hw.trafficDescriptor.TDCreateData_T _arg0=org.omg.hw.trafficDescriptor.TDCreateData_THelper.read(_input);
				org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder _arg1= new org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder();
				_out = handler.createReply();
				createTrafficDescriptor(_arg0,_arg1);
				org.omg.hw.trafficDescriptor.TrafficDescriptor_THelper.write(_out,_arg1.value);
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
			case 3: // deleteTrafficDescriptor
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteTrafficDescriptor(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // HW_getAllTrafficDescriptors
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.trafficDescriptor.TrafficDescriptorList_THolder _arg2= new org.omg.hw.trafficDescriptor.TrafficDescriptorList_THolder();
				org.omg.hw.trafficDescriptor.TrafficDescriptorIterator_IHolder _arg3= new org.omg.hw.trafficDescriptor.TrafficDescriptorIterator_IHolder();
				_out = handler.createReply();
				HW_getAllTrafficDescriptors(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.trafficDescriptor.TrafficDescriptorList_THelper.write(_out,_arg2.value);
				org.omg.hw.trafficDescriptor.TrafficDescriptorIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setOwner
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
			case 6: // deactivateTrafficDescriptor
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder _arg1= new org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder();
				_out = handler.createReply();
				deactivateTrafficDescriptor(_arg0,_arg1);
				org.omg.hw.trafficDescriptor.TrafficDescriptor_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllTrafficDescriptors
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.trafficDescriptor.TrafficDescriptorList_THolder _arg1= new org.omg.hw.trafficDescriptor.TrafficDescriptorList_THolder();
				org.omg.hw.trafficDescriptor.TrafficDescriptorIterator_IHolder _arg2= new org.omg.hw.trafficDescriptor.TrafficDescriptorIterator_IHolder();
				_out = handler.createReply();
				getAllTrafficDescriptors(_arg0,_arg1,_arg2);
				org.omg.hw.trafficDescriptor.TrafficDescriptorList_THelper.write(_out,_arg1.value);
				org.omg.hw.trafficDescriptor.TrafficDescriptorIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setAdditionalInfo
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
			case 9: // getTrafficDescriptor
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder _arg1= new org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder();
				_out = handler.createReply();
				getTrafficDescriptor(_arg0,_arg1);
				org.omg.hw.trafficDescriptor.TrafficDescriptor_THelper.write(_out,_arg1.value);
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
			case 11: // activateTrafficDescriptor
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder _arg1= new org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder();
				_out = handler.createReply();
				activateTrafficDescriptor(_arg0,_arg1);
				org.omg.hw.trafficDescriptor.TrafficDescriptor_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // HW_getAllTrafficDescriptorNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				HW_getAllTrafficDescriptorNames(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getAllTrafficDescriptorNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg2= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTrafficDescriptorNames(_arg0,_arg1,_arg2);
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
			case 14: // HW_createTrafficDescriptor
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.trafficDescriptor.TDCreateData_T _arg1=org.omg.hw.trafficDescriptor.TDCreateData_THelper.read(_input);
				org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder _arg2= new org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder();
				_out = handler.createReply();
				HW_createTrafficDescriptor(_arg0,_arg1,_arg2);
				org.omg.hw.trafficDescriptor.TrafficDescriptor_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // setNativeEMSName
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
