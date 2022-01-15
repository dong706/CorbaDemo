package org.omg.hw.transmissionDescriptor;

/**
 *	Generated from IDL interface "TransmissionDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class TransmissionDescriptorMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.transmissionDescriptor.TransmissionDescriptorMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getTransmissionDescriptor", new java.lang.Integer(0));
		m_opsHash.put ( "createTransmissionDescriptor", new java.lang.Integer(1));
		m_opsHash.put ( "getAllTransmissionDescriptorNames", new java.lang.Integer(2));
		m_opsHash.put ( "modifyTransmissionDescriptor", new java.lang.Integer(3));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(4));
		m_opsHash.put ( "getAllTransmissionDescriptors", new java.lang.Integer(5));
		m_opsHash.put ( "setOwner", new java.lang.Integer(6));
		m_opsHash.put ( "setTMDAssociation", new java.lang.Integer(7));
		m_opsHash.put ( "deleteTransmissionDescriptor", new java.lang.Integer(8));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(9));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(10));
		m_opsHash.put ( "validateTMDAssignmentToObject", new java.lang.Integer(11));
		m_opsHash.put ( "getAssociatedTPs", new java.lang.Integer(12));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(13));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/transmissionDescriptor/TransmissionDescriptorMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.hw.transmissionDescriptor.TransmissionDescriptorMgr_I _this()
	{
		return org.omg.hw.transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.transmissionDescriptor.TransmissionDescriptorMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getTransmissionDescriptor
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THolder _arg1= new org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THolder();
				_out = handler.createReply();
				getTransmissionDescriptor(_arg0,_arg1);
				org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // createTransmissionDescriptor
			{
			try
			{
				org.omg.hw.transmissionDescriptor.TMDCreateData_T _arg0=org.omg.hw.transmissionDescriptor.TMDCreateData_THelper.read(_input);
				org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THolder _arg1= new org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THolder();
				_out = handler.createReply();
				createTransmissionDescriptor(_arg0,_arg1);
				org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getAllTransmissionDescriptorNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg2= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTransmissionDescriptorNames(_arg0,_arg1,_arg2);
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
			case 3: // modifyTransmissionDescriptor
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.transmissionDescriptor.TMDModifyData_T _arg1=org.omg.hw.transmissionDescriptor.TMDModifyData_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg2= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THolder _arg3= new org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THolder();
				_arg3._read (_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg4= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg5= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyTransmissionDescriptor(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg5.value);
				_out.write_string(_arg6.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getCapabilities
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
			case 5: // getAllTransmissionDescriptors
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.transmissionDescriptor.TransmissionDescriptorList_THolder _arg1= new org.omg.hw.transmissionDescriptor.TransmissionDescriptorList_THolder();
				org.omg.hw.transmissionDescriptor.TransmissionDescriptorIterator_IHolder _arg2= new org.omg.hw.transmissionDescriptor.TransmissionDescriptorIterator_IHolder();
				_out = handler.createReply();
				getAllTransmissionDescriptors(_arg0,_arg1,_arg2);
				org.omg.hw.transmissionDescriptor.TransmissionDescriptorList_THelper.write(_out,_arg1.value);
				org.omg.hw.transmissionDescriptor.TransmissionDescriptorIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // setOwner
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
			case 7: // setTMDAssociation
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.transmissionDescriptor.TPorMFDorFDFr_THolder _arg1= new org.omg.hw.transmissionDescriptor.TPorMFDorFDFr_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setTMDAssociation(_arg0,_arg1);
				org.omg.hw.transmissionDescriptor.TPorMFDorFDFr_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // deleteTransmissionDescriptor
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteTransmissionDescriptor(_arg0);
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
			case 11: // validateTMDAssignmentToObject
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.CORBA.StringHolder _arg1= new org.omg.CORBA.StringHolder();
				org.omg.hw.transmissionParameters.LayeredParameterList_THolder _arg2= new org.omg.hw.transmissionParameters.LayeredParameterList_THolder();
				org.omg.hw.globaldefs.NVSList_THolder _arg3= new org.omg.hw.globaldefs.NVSList_THolder();
				_out = handler.createReply();
				validateTMDAssignmentToObject(_arg0,_arg1,_arg2,_arg3);
				_out.write_string(_arg1.value);
				org.omg.hw.transmissionParameters.LayeredParameterList_THelper.write(_out,_arg2.value);
				org.omg.hw.globaldefs.NVSList_THelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAssociatedTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg2= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				org.omg.hw.terminationPoint.TerminationPointIterator_IHolder _arg3= new org.omg.hw.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAssociatedTPs(_arg0,_arg1,_arg2,_arg3);
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
