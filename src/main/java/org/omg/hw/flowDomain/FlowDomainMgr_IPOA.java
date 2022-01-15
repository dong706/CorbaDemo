package org.omg.hw.flowDomain;

/**
 *	Generated from IDL interface "FlowDomainMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class FlowDomainMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.flowDomain.FlowDomainMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(0));
		m_opsHash.put ( "createFlowDomain", new java.lang.Integer(1));
		m_opsHash.put ( "activateFDFr", new java.lang.Integer(2));
		m_opsHash.put ( "deAssociateMFDsFromFlowDomain", new java.lang.Integer(3));
		m_opsHash.put ( "associateMFDsWithFlowDomain", new java.lang.Integer(4));
		m_opsHash.put ( "unassignCPTPsFromMFD", new java.lang.Integer(5));
		m_opsHash.put ( "getFlowDomain", new java.lang.Integer(6));
		m_opsHash.put ( "getAllMFDs", new java.lang.Integer(7));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(8));
		m_opsHash.put ( "assignCPTPsToMFD", new java.lang.Integer(9));
		m_opsHash.put ( "getAllEthernetOAMPoint", new java.lang.Integer(10));
		m_opsHash.put ( "getFDFr", new java.lang.Integer(11));
		m_opsHash.put ( "modifyMFD", new java.lang.Integer(12));
		m_opsHash.put ( "modifyFDFr", new java.lang.Integer(13));
		m_opsHash.put ( "createFTP", new java.lang.Integer(14));
		m_opsHash.put ( "associateCPTPsWithFlowDomain", new java.lang.Integer(15));
		m_opsHash.put ( "getAllFDFrNames", new java.lang.Integer(16));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(17));
		m_opsHash.put ( "deAssociateCPTPsFromFlowDomain", new java.lang.Integer(18));
		m_opsHash.put ( "getAllCPTPs", new java.lang.Integer(19));
		m_opsHash.put ( "deleteFDFr", new java.lang.Integer(20));
		m_opsHash.put ( "performEthernetOAMCommand", new java.lang.Integer(21));
		m_opsHash.put ( "getFDFrsByUserLabel", new java.lang.Integer(22));
		m_opsHash.put ( "getAllFDFrs", new java.lang.Integer(23));
		m_opsHash.put ( "addFPsToFDFr", new java.lang.Integer(24));
		m_opsHash.put ( "deleteMFD", new java.lang.Integer(25));
		m_opsHash.put ( "getAllFlowDomains", new java.lang.Integer(26));
		m_opsHash.put ( "removeFPsFromFDFr", new java.lang.Integer(27));
		m_opsHash.put ( "deleteFlowDomain", new java.lang.Integer(28));
		m_opsHash.put ( "setOwner", new java.lang.Integer(29));
		m_opsHash.put ( "getAllFlowDomainNames", new java.lang.Integer(30));
		m_opsHash.put ( "validateTMDAssignmentToMFD", new java.lang.Integer(31));
		m_opsHash.put ( "getFlowDomainsByUserLabel", new java.lang.Integer(32));
		m_opsHash.put ( "getFDFrServerTrail", new java.lang.Integer(33));
		m_opsHash.put ( "createMFD", new java.lang.Integer(34));
		m_opsHash.put ( "getFDfromMFD", new java.lang.Integer(35));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(36));
		m_opsHash.put ( "getFDFrsWithTP", new java.lang.Integer(37));
		m_opsHash.put ( "getAssignableCPTPs", new java.lang.Integer(38));
		m_opsHash.put ( "createFDFr", new java.lang.Integer(39));
		m_opsHash.put ( "deactivateFDFr", new java.lang.Integer(40));
		m_opsHash.put ( "deleteFTP", new java.lang.Integer(41));
		m_opsHash.put ( "getMFD", new java.lang.Integer(42));
		m_opsHash.put ( "modifyFlowDomain", new java.lang.Integer(43));
		m_opsHash.put ( "getTransmissionParams", new java.lang.Integer(44));
		m_opsHash.put ( "getAllMFDNames", new java.lang.Integer(45));
		m_opsHash.put ( "getAssigningMFD", new java.lang.Integer(46));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/flowDomain/FlowDomainMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.hw.flowDomain.FlowDomainMgr_I _this()
	{
		return org.omg.hw.flowDomain.FlowDomainMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.flowDomain.FlowDomainMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.flowDomain.FlowDomainMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getCapabilities
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
			case 1: // createFlowDomain
			{
			try
			{
				org.omg.hw.flowDomain.FDCreateData_T _arg0=org.omg.hw.flowDomain.FDCreateData_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_arg1._read (_input);
				org.omg.hw.flowDomain.FlowDomain_THolder _arg2= new org.omg.hw.flowDomain.FlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFlowDomain(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.omg.hw.flowDomain.FlowDomain_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // activateFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder _arg1= new org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder();
				_out = handler.createReply();
				activateFDFr(_arg0,_arg1);
				org.omg.hw.flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // deAssociateMFDsFromFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				deAssociateMFDsFromFlowDomain(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // associateMFDsWithFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				associateMFDsWithFlowDomain(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // unassignCPTPsFromMFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				unassignCPTPsFromMFD(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain.FlowDomain_THolder _arg1= new org.omg.hw.flowDomain.FlowDomain_THolder();
				_out = handler.createReply();
				getFlowDomain(_arg0,_arg1);
				org.omg.hw.flowDomain.FlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllMFDs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.flowDomain.MFDList_THolder _arg2= new org.omg.hw.flowDomain.MFDList_THolder();
				org.omg.hw.flowDomain.MFDIterator_IHolder _arg3= new org.omg.hw.flowDomain.MFDIterator_IHolder();
				_out = handler.createReply();
				getAllMFDs(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.flowDomain.MFDList_THelper.write(_out,_arg2.value);
				org.omg.hw.flowDomain.MFDIterator_IHelper.write(_out,_arg3.value);
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
			case 9: // assignCPTPsToMFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				assignCPTPsToMFD(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getAllEthernetOAMPoint
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain.EthernetOAMPointList_THolder _arg1= new org.omg.hw.flowDomain.EthernetOAMPointList_THolder();
				_out = handler.createReply();
				getAllEthernetOAMPoint(_arg0,_arg1);
				org.omg.hw.flowDomain.EthernetOAMPointList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder _arg1= new org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder();
				_out = handler.createReply();
				getFDFr(_arg0,_arg1);
				org.omg.hw.flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // modifyMFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain.MFDModifyData_T _arg1=org.omg.hw.flowDomain.MFDModifyData_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg2=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.transmissionParameters.LayeredParameterList_THolder _arg3= new org.omg.hw.transmissionParameters.LayeredParameterList_THolder();
				_arg3._read (_input);
				org.omg.hw.globaldefs.NVSList_THolder _arg4= new org.omg.hw.globaldefs.NVSList_THolder();
				_arg4._read (_input);
				org.omg.hw.flowDomain.MatrixFlowDomain_THolder _arg5= new org.omg.hw.flowDomain.MatrixFlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyMFD(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				org.omg.hw.transmissionParameters.LayeredParameterList_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NVSList_THelper.write(_out,_arg4.value);
				org.omg.hw.flowDomain.MatrixFlowDomain_THelper.write(_out,_arg5.value);
				_out.write_string(_arg6.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // modifyFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomainFragment.FDFrModifyData_T _arg1=org.omg.hw.flowDomainFragment.FDFrModifyData_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg2= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.hw.subnetworkConnection.GradesOfImpact_T _arg3=org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder _arg4= new org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				org.omg.hw.flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // createFTP
			{
			try
			{
				org.omg.hw.flowDomain.FTPCreateData_T _arg0=org.omg.hw.flowDomain.FTPCreateData_THelper.read(_input);
				org.omg.hw.terminationPoint.TerminationPoint_THolder _arg1= new org.omg.hw.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				createFTP(_arg0,_arg1);
				org.omg.hw.terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // associateCPTPsWithFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				associateCPTPsWithFlowDomain(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getAllFDFrNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFDFrNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // setUserLabel
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
			case 18: // deAssociateCPTPsFromFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				deAssociateCPTPsFromFlowDomain(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getAllCPTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg2= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				org.omg.hw.terminationPoint.TerminationPointIterator_IHolder _arg3= new org.omg.hw.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllCPTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 20: // deleteFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				deleteFDFr(_arg0,_arg1);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // performEthernetOAMCommand
			{
			try
			{
				org.omg.hw.flowDomain.EthernetOAMOperation_T _arg0=org.omg.hw.flowDomain.EthernetOAMOperation_THelper.read(_input);
				org.omg.hw.flowDomain.EthernetLTTestResultList_THolder _arg1= new org.omg.hw.flowDomain.EthernetLTTestResultList_THolder();
				_out = handler.createReply();
				performEthernetOAMCommand(_arg0,_arg1);
				org.omg.hw.flowDomain.EthernetLTTestResultList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getFDFrsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.hw.flowDomainFragment.FDFrList_THolder _arg1= new org.omg.hw.flowDomainFragment.FDFrList_THolder();
				_out = handler.createReply();
				getFDFrsByUserLabel(_arg0,_arg1);
				org.omg.hw.flowDomainFragment.FDFrList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getAllFDFrs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				org.omg.hw.flowDomainFragment.FDFrList_THolder _arg3= new org.omg.hw.flowDomainFragment.FDFrList_THolder();
				org.omg.hw.flowDomainFragment.FDFrIterator_IHolder _arg4= new org.omg.hw.flowDomainFragment.FDFrIterator_IHolder();
				_out = handler.createReply();
				getAllFDFrs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.flowDomainFragment.FDFrList_THelper.write(_out,_arg3.value);
				org.omg.hw.flowDomainFragment.FDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // addFPsToFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain.ConnectivityRequirement_T _arg1=org.omg.hw.flowDomain.ConnectivityRequirement_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_arg2._read (_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_arg3._read (_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg4= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				addFPsToFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // deleteMFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteMFD(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getAllFlowDomains
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.flowDomain.FDList_THolder _arg1= new org.omg.hw.flowDomain.FDList_THolder();
				org.omg.hw.flowDomain.FDIterator_IHolder _arg2= new org.omg.hw.flowDomain.FDIterator_IHolder();
				_out = handler.createReply();
				getAllFlowDomains(_arg0,_arg1,_arg2);
				org.omg.hw.flowDomain.FDList_THelper.write(_out,_arg1.value);
				org.omg.hw.flowDomain.FDIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // removeFPsFromFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_arg1._read (_input);
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				removeFPsFromFDFr(_arg0,_arg1,_arg2);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // deleteFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteFlowDomain(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // setOwner
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
			case 30: // getAllFlowDomainNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg2= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFlowDomainNames(_arg0,_arg1,_arg2);
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
			case 31: // validateTMDAssignmentToMFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.CORBA.StringHolder _arg1= new org.omg.CORBA.StringHolder();
				org.omg.hw.transmissionParameters.LayeredParameterList_THolder _arg2= new org.omg.hw.transmissionParameters.LayeredParameterList_THolder();
				org.omg.hw.globaldefs.NVSList_THolder _arg3= new org.omg.hw.globaldefs.NVSList_THolder();
				_out = handler.createReply();
				validateTMDAssignmentToMFD(_arg0,_arg1,_arg2,_arg3);
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
			case 32: // getFlowDomainsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.hw.flowDomain.FDList_THolder _arg1= new org.omg.hw.flowDomain.FDList_THolder();
				_out = handler.createReply();
				getFlowDomainsByUserLabel(_arg0,_arg1);
				org.omg.hw.flowDomain.FDList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getFDFrServerTrail
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getFDFrServerTrail(_arg0,_arg1);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // createMFD
			{
			try
			{
				org.omg.hw.flowDomain.MFDCreateData_T _arg0=org.omg.hw.flowDomain.MFDCreateData_THelper.read(_input);
				org.omg.hw.flowDomain.MatrixFlowDomain_THolder _arg1= new org.omg.hw.flowDomain.MatrixFlowDomain_THolder();
				_out = handler.createReply();
				createMFD(_arg0,_arg1);
				org.omg.hw.flowDomain.MatrixFlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // getFDfromMFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain.FlowDomain_THolder _arg1= new org.omg.hw.flowDomain.FlowDomain_THolder();
				_out = handler.createReply();
				getFDfromMFD(_arg0,_arg1);
				org.omg.hw.flowDomain.FlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // setNativeEMSName
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
			case 37: // getFDFrsWithTP
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.flowDomainFragment.FDFrList_THolder _arg2= new org.omg.hw.flowDomainFragment.FDFrList_THolder();
				org.omg.hw.flowDomainFragment.FDFrIterator_IHolder _arg3= new org.omg.hw.flowDomainFragment.FDFrIterator_IHolder();
				_out = handler.createReply();
				getFDFrsWithTP(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.flowDomainFragment.FDFrList_THelper.write(_out,_arg2.value);
				org.omg.hw.flowDomainFragment.FDFrIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // getAssignableCPTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg2= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				org.omg.hw.terminationPoint.TerminationPointIterator_IHolder _arg3= new org.omg.hw.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAssignableCPTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 39: // createFDFr
			{
			try
			{
				org.omg.hw.flowDomainFragment.FDFrCreateData_T _arg0=org.omg.hw.flowDomainFragment.FDFrCreateData_THelper.read(_input);
				org.omg.hw.flowDomain.ConnectivityRequirement_T _arg1=org.omg.hw.flowDomain.ConnectivityRequirement_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_arg2._read (_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_arg3._read (_input);
				org.omg.hw.flowDomainFragment.MatrixFlowDomainFragmentList_THolder _arg4= new org.omg.hw.flowDomainFragment.MatrixFlowDomainFragmentList_THolder();
				_arg4._read (_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg5= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg5._read (_input);
				org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder _arg6= new org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.omg.hw.flowDomainFragment.MatrixFlowDomainFragmentList_THelper.write(_out,_arg4.value);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg5.value);
				org.omg.hw.flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg6.value);
				_out.write_string(_arg7.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // deactivateFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder _arg1= new org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder();
				_out = handler.createReply();
				deactivateFDFr(_arg0,_arg1);
				org.omg.hw.flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // deleteFTP
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteFTP(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // getMFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain.MatrixFlowDomain_THolder _arg1= new org.omg.hw.flowDomain.MatrixFlowDomain_THolder();
				_out = handler.createReply();
				getMFD(_arg0,_arg1);
				org.omg.hw.flowDomain.MatrixFlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 43: // modifyFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain.FDModifyData_T _arg1=org.omg.hw.flowDomain.FDModifyData_THelper.read(_input);
				org.omg.hw.flowDomain.FlowDomain_THolder _arg2= new org.omg.hw.flowDomain.FlowDomain_THolder();
				_out = handler.createReply();
				modifyFlowDomain(_arg0,_arg1,_arg2);
				org.omg.hw.flowDomain.FlowDomain_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // getTransmissionParams
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.hw.flowDomain.ParameterGroupsList_THelper.read(_input);
				org.omg.hw.transmissionParameters.LayeredParameterList_THolder _arg2= new org.omg.hw.transmissionParameters.LayeredParameterList_THolder();
				_out = handler.createReply();
				getTransmissionParams(_arg0,_arg1,_arg2);
				org.omg.hw.transmissionParameters.LayeredParameterList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // getAllMFDNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllMFDNames(_arg0,_arg1,_arg2,_arg3);
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
			case 46: // getAssigningMFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain.MatrixFlowDomain_THolder _arg1= new org.omg.hw.flowDomain.MatrixFlowDomain_THolder();
				_out = handler.createReply();
				getAssigningMFD(_arg0,_arg1);
				org.omg.hw.flowDomain.MatrixFlowDomain_THelper.write(_out,_arg1.value);
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
