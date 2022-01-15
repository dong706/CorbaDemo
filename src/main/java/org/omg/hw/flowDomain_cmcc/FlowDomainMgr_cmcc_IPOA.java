package org.omg.hw.flowDomain_cmcc;

/**
 *	Generated from IDL interface "FlowDomainMgr_cmcc_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class FlowDomainMgr_cmcc_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.flowDomain_cmcc.FlowDomainMgr_cmcc_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(0));
		m_opsHash.put ( "createAndActivateFDFr", new java.lang.Integer(1));
		m_opsHash.put ( "modifyFDFr", new java.lang.Integer(2));
		m_opsHash.put ( "getFDFrRoute", new java.lang.Integer(3));
		m_opsHash.put ( "getAllAssociatedMFDs", new java.lang.Integer(4));
		m_opsHash.put ( "createFlowDomain", new java.lang.Integer(5));
		m_opsHash.put ( "getFDFr", new java.lang.Integer(6));
		m_opsHash.put ( "getAllCPTPs", new java.lang.Integer(7));
		m_opsHash.put ( "deactivateFDFr", new java.lang.Integer(8));
		m_opsHash.put ( "unassignCPTPsFromMFD", new java.lang.Integer(9));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(10));
		m_opsHash.put ( "getMFD", new java.lang.Integer(11));
		m_opsHash.put ( "modifyFlowDomain", new java.lang.Integer(12));
		m_opsHash.put ( "getAssociatingFD", new java.lang.Integer(13));
		m_opsHash.put ( "getFlowDomain", new java.lang.Integer(14));
		m_opsHash.put ( "getAllFDFrs", new java.lang.Integer(15));
		m_opsHash.put ( "activateFDFr", new java.lang.Integer(16));
		m_opsHash.put ( "getAllAssignableCPTPs", new java.lang.Integer(17));
		m_opsHash.put ( "createFTP", new java.lang.Integer(18));
		m_opsHash.put ( "getAllSupportedMFDs", new java.lang.Integer(19));
		m_opsHash.put ( "createFDFr", new java.lang.Integer(20));
		m_opsHash.put ( "getFlowDomainsByUserLabel", new java.lang.Integer(21));
		m_opsHash.put ( "getAllAssignedCPTPs", new java.lang.Integer(22));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(23));
		m_opsHash.put ( "deleteFDFr", new java.lang.Integer(24));
		m_opsHash.put ( "deleteMFD", new java.lang.Integer(25));
		m_opsHash.put ( "setOwner", new java.lang.Integer(26));
		m_opsHash.put ( "associateCPTPsWithFlowDomain", new java.lang.Integer(27));
		m_opsHash.put ( "modifyMFD", new java.lang.Integer(28));
		m_opsHash.put ( "getFDFrsByUserLabel", new java.lang.Integer(29));
		m_opsHash.put ( "getAssigningMFD", new java.lang.Integer(30));
		m_opsHash.put ( "deleteFTP", new java.lang.Integer(31));
		m_opsHash.put ( "getAllTopologicalLinksOfFD", new java.lang.Integer(32));
		m_opsHash.put ( "deactivateAndDeleteFDFr", new java.lang.Integer(33));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(34));
		m_opsHash.put ( "getAllFlowDomains", new java.lang.Integer(35));
		m_opsHash.put ( "createMFD", new java.lang.Integer(36));
		m_opsHash.put ( "associateMFDsWithFlowDomain", new java.lang.Integer(37));
		m_opsHash.put ( "deAssociateMFDsFromFlowDomain", new java.lang.Integer(38));
		m_opsHash.put ( "deAssociateCPTPsFromFlowDomain", new java.lang.Integer(39));
		m_opsHash.put ( "getFDFrsWithTP", new java.lang.Integer(40));
		m_opsHash.put ( "getTransmissionParams", new java.lang.Integer(41));
		m_opsHash.put ( "deleteFlowDomain", new java.lang.Integer(42));
		m_opsHash.put ( "assignCPTPsToMFD", new java.lang.Integer(43));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/flowDomain_cmcc/FlowDomainMgr_cmcc_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.hw.flowDomain_cmcc.FlowDomainMgr_cmcc_I _this()
	{
		return org.omg.hw.flowDomain_cmcc.FlowDomainMgr_cmcc_IHelper.narrow(_this_object());
	}
	public org.omg.hw.flowDomain_cmcc.FlowDomainMgr_cmcc_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.flowDomain_cmcc.FlowDomainMgr_cmcc_IHelper.narrow(_this_object(orb));
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
			case 1: // createAndActivateFDFr
			{
			try
			{
				org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_T _arg0=org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_THelper.read(_input);
				org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_T _arg1=org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg2=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg3=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg4= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_arg4._read (_input);
				org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder _arg5= new org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder();
				_arg5._read (_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg6= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg6._read (_input);
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg7= new org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg8= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg9= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg10= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createAndActivateFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8,_arg9,_arg10);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THelper.write(_out,_arg5.value);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg6.value);
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg7.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg8.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg9.value);
				_out.write_string(_arg10.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // modifyFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomainFragment_cmcc.FDFrModifyData_T _arg1=org.omg.hw.flowDomainFragment_cmcc.FDFrModifyData_THelper.read(_input);
				org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_T _arg2=org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg3= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg4= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg5= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg6= new org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg5.value);
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg6.value);
				_out.write_string(_arg7.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getFDFrRoute
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomainFragment_cmcc.FDFrRoute_THolder _arg1= new org.omg.hw.flowDomainFragment_cmcc.FDFrRoute_THolder();
				_out = handler.createReply();
				getFDFrRoute(_arg0,_arg1);
				org.omg.hw.flowDomainFragment_cmcc.FDFrRoute_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getAllAssociatedMFDs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.flowDomain_cmcc.MFDList_THolder _arg2= new org.omg.hw.flowDomain_cmcc.MFDList_THolder();
				org.omg.hw.flowDomain_cmcc.MFDIterator_IHolder _arg3= new org.omg.hw.flowDomain_cmcc.MFDIterator_IHolder();
				_out = handler.createReply();
				getAllAssociatedMFDs(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.flowDomain_cmcc.MFDList_THelper.write(_out,_arg2.value);
				org.omg.hw.flowDomain_cmcc.MFDIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // createFlowDomain
			{
			try
			{
				org.omg.hw.flowDomain_cmcc.FDCreateData_T _arg0=org.omg.hw.flowDomain_cmcc.FDCreateData_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_arg1._read (_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg2= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.hw.flowDomain_cmcc.FlowDomain_THolder _arg3= new org.omg.hw.flowDomain_cmcc.FlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFlowDomain(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				org.omg.hw.flowDomain_cmcc.FlowDomain_THelper.write(_out,_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg1= new org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				_out = handler.createReply();
				getFDFr(_arg0,_arg1);
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllCPTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain_cmcc.CPTP_Role_T _arg1=org.omg.hw.flowDomain_cmcc.CPTP_Role_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg3= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				org.omg.hw.terminationPoint.TerminationPointIterator_IHolder _arg4= new org.omg.hw.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllCPTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				org.omg.hw.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // deactivateFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg1= new org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				_out = handler.createReply();
				deactivateFDFr(_arg0,_arg1);
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // unassignCPTPsFromMFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg2= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				unassignCPTPsFromMFD(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // setAdditionalInfo
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
			case 11: // getMFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder _arg1= new org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder();
				_out = handler.createReply();
				getMFD(_arg0,_arg1);
				org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // modifyFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain_cmcc.FDModifyData_T _arg1=org.omg.hw.flowDomain_cmcc.FDModifyData_THelper.read(_input);
				org.omg.hw.flowDomain_cmcc.FlowDomain_THolder _arg2= new org.omg.hw.flowDomain_cmcc.FlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyFlowDomain(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.flowDomain_cmcc.FlowDomain_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getAssociatingFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain_cmcc.FlowDomain_THolder _arg1= new org.omg.hw.flowDomain_cmcc.FlowDomain_THolder();
				_out = handler.createReply();
				getAssociatingFD(_arg0,_arg1);
				org.omg.hw.flowDomain_cmcc.FlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain_cmcc.FlowDomain_THolder _arg1= new org.omg.hw.flowDomain_cmcc.FlowDomain_THolder();
				_out = handler.createReply();
				getFlowDomain(_arg0,_arg1);
				org.omg.hw.flowDomain_cmcc.FlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getAllFDFrs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				org.omg.hw.flowDomainFragment_cmcc.FDFrList_THolder _arg3= new org.omg.hw.flowDomainFragment_cmcc.FDFrList_THolder();
				org.omg.hw.flowDomainFragment_cmcc.FDFrIterator_IHolder _arg4= new org.omg.hw.flowDomainFragment_cmcc.FDFrIterator_IHolder();
				_out = handler.createReply();
				getAllFDFrs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.flowDomainFragment_cmcc.FDFrList_THelper.write(_out,_arg3.value);
				org.omg.hw.flowDomainFragment_cmcc.FDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // activateFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg1= new org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				_out = handler.createReply();
				activateFDFr(_arg0,_arg1);
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getAllAssignableCPTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg2= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				org.omg.hw.terminationPoint.TerminationPointIterator_IHolder _arg3= new org.omg.hw.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllAssignableCPTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 18: // createFTP
			{
			try
			{
				org.omg.hw.flowDomain_cmcc.FTPCreateData_T _arg0=org.omg.hw.flowDomain_cmcc.FTPCreateData_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.hw.terminationPoint.TerminationPoint_THolder _arg2= new org.omg.hw.terminationPoint.TerminationPoint_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFTP(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				org.omg.hw.terminationPoint.TerminationPoint_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getAllSupportedMFDs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.flowDomain_cmcc.MFDList_THolder _arg2= new org.omg.hw.flowDomain_cmcc.MFDList_THolder();
				org.omg.hw.flowDomain_cmcc.MFDIterator_IHolder _arg3= new org.omg.hw.flowDomain_cmcc.MFDIterator_IHolder();
				_out = handler.createReply();
				getAllSupportedMFDs(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.flowDomain_cmcc.MFDList_THelper.write(_out,_arg2.value);
				org.omg.hw.flowDomain_cmcc.MFDIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // createFDFr
			{
			try
			{
				org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_T _arg0=org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_THelper.read(_input);
				org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_T _arg1=org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPData_T[] _arg2=org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPData_T[] _arg3=org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg4= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_arg4._read (_input);
				org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder _arg5= new org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder();
				_arg5._read (_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg6= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg6._read (_input);
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg7= new org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg8= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THelper.write(_out,_arg5.value);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg6.value);
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg7.value);
				_out.write_string(_arg8.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getFlowDomainsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.hw.flowDomain_cmcc.FDList_THolder _arg1= new org.omg.hw.flowDomain_cmcc.FDList_THolder();
				_out = handler.createReply();
				getFlowDomainsByUserLabel(_arg0,_arg1);
				org.omg.hw.flowDomain_cmcc.FDList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getAllAssignedCPTPs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.terminationPoint.TerminationPointList_THolder _arg2= new org.omg.hw.terminationPoint.TerminationPointList_THolder();
				org.omg.hw.terminationPoint.TerminationPointIterator_IHolder _arg3= new org.omg.hw.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllAssignedCPTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 23: // setUserLabel
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
			case 24: // deleteFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteFDFr(_arg0);
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
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deleteMFD(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // setOwner
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
			case 27: // associateCPTPsWithFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg2= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				associateCPTPsWithFlowDomain(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // modifyMFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain_cmcc.MFDModifyData_T _arg1=org.omg.hw.flowDomain_cmcc.MFDModifyData_THelper.read(_input);
				org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder _arg2= new org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyMFD(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // getFDFrsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.hw.flowDomainFragment_cmcc.FDFrList_THolder _arg1= new org.omg.hw.flowDomainFragment_cmcc.FDFrList_THolder();
				_out = handler.createReply();
				getFDFrsByUserLabel(_arg0,_arg1);
				org.omg.hw.flowDomainFragment_cmcc.FDFrList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getAssigningMFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder _arg1= new org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder();
				_out = handler.createReply();
				getAssigningMFD(_arg0,_arg1);
				org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // deleteFTP
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deleteFTP(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // getAllTopologicalLinksOfFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.topologicalLink.TopologicalLinkList_THolder _arg2= new org.omg.hw.topologicalLink.TopologicalLinkList_THolder();
				org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder _arg3= new org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllTopologicalLinksOfFD(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
				org.omg.hw.topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // deactivateAndDeleteFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg2= new org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateAndDeleteFDFr(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // setNativeEMSName
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
			case 35: // getAllFlowDomains
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.flowDomain_cmcc.FDList_THolder _arg1= new org.omg.hw.flowDomain_cmcc.FDList_THolder();
				org.omg.hw.flowDomain_cmcc.FDIterator_IHolder _arg2= new org.omg.hw.flowDomain_cmcc.FDIterator_IHolder();
				_out = handler.createReply();
				getAllFlowDomains(_arg0,_arg1,_arg2);
				org.omg.hw.flowDomain_cmcc.FDList_THelper.write(_out,_arg1.value);
				org.omg.hw.flowDomain_cmcc.FDIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // createMFD
			{
			try
			{
				org.omg.hw.flowDomain_cmcc.MFDCreateData_T _arg0=org.omg.hw.flowDomain_cmcc.MFDCreateData_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder _arg2= new org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createMFD(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // associateMFDsWithFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg2= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				associateMFDsWithFlowDomain(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // deAssociateMFDsFromFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg2= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deAssociateMFDsFromFlowDomain(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // deAssociateCPTPsFromFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg2= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deAssociateCPTPsFromFlowDomain(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // getFDFrsWithTP
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.flowDomainFragment_cmcc.FDFrList_THolder _arg2= new org.omg.hw.flowDomainFragment_cmcc.FDFrList_THolder();
				org.omg.hw.flowDomainFragment_cmcc.FDFrIterator_IHolder _arg3= new org.omg.hw.flowDomainFragment_cmcc.FDFrIterator_IHolder();
				_out = handler.createReply();
				getFDFrsWithTP(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.flowDomainFragment_cmcc.FDFrList_THelper.write(_out,_arg2.value);
				org.omg.hw.flowDomainFragment_cmcc.FDFrIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // getTransmissionParams
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.hw.flowDomain_cmcc.ParameterGroupsList_THelper.read(_input);
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
			case 42: // deleteFlowDomain
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deleteFlowDomain(_arg0,_arg1,_arg2);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 43: // assignCPTPsToMFD
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg2= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				assignCPTPsToMFD(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
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
