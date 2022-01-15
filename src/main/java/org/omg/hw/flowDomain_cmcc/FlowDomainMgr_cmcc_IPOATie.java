package org.omg.hw.flowDomain_cmcc;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "FlowDomainMgr_cmcc_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class FlowDomainMgr_cmcc_IPOATie
	extends FlowDomainMgr_cmcc_IPOA
{
	private FlowDomainMgr_cmcc_IOperations _delegate;

	private POA _poa;
	public FlowDomainMgr_cmcc_IPOATie(FlowDomainMgr_cmcc_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FlowDomainMgr_cmcc_IPOATie(FlowDomainMgr_cmcc_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.flowDomain_cmcc.FlowDomainMgr_cmcc_I _this()
	{
		return org.omg.hw.flowDomain_cmcc.FlowDomainMgr_cmcc_IHelper.narrow(_this_object());
	}
	public org.omg.hw.flowDomain_cmcc.FlowDomainMgr_cmcc_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.flowDomain_cmcc.FlowDomainMgr_cmcc_IHelper.narrow(_this_object(orb));
	}
	public FlowDomainMgr_cmcc_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FlowDomainMgr_cmcc_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void createAndActivateFDFr(org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_T createData, org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_T connectivityRequirement, org.omg.hw.globaldefs.NameAndStringValue_T[][] aEnd, org.omg.hw.globaldefs.NameAndStringValue_T[][] zEnd, org.omg.hw.globaldefs.NamingAttributesList_THolder internalTPs, org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder mfdfrs, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder theFDFr, org.omg.hw.globaldefs.NamingAttributesList_THolder notConnectableCPTPList, org.omg.hw.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createAndActivateFDFr(createData,connectivityRequirement,aEnd,zEnd,internalTPs,mfdfrs,tpsToModify,theFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
	}

	public void modifyFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment_cmcc.FDFrModifyData_T fdfrModifyData, org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_T connectivityRequirement, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.globaldefs.NamingAttributesList_THolder failedTPList, org.omg.hw.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyFDFr(fdfrName,fdfrModifyData,connectivityRequirement,tpsToModify,failedTPList,parameterProblemsTPList,newFDFr,errorReason);
	}

	public void getFDFrRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment_cmcc.FDFrRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrRoute(fdfrName,route);
	}

	public void getAllAssociatedMFDs(org.omg.hw.globaldefs.NameAndStringValue_T[] tmdOrFdName, int how_many, org.omg.hw.flowDomain_cmcc.MFDList_THolder mfds, org.omg.hw.flowDomain_cmcc.MFDIterator_IHolder mfdIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllAssociatedMFDs(tmdOrFdName,how_many,mfds,mfdIt);
	}

	public void createFlowDomain(org.omg.hw.flowDomain_cmcc.FDCreateData_T createData, org.omg.hw.globaldefs.NamingAttributesList_THolder assignedCPTPs, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.flowDomain_cmcc.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createFlowDomain(createData,assignedCPTPs,tpsToModify,theFD,errorReason);
	}

	public void getFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFr(fdfrName,fdfr);
	}

	public void getAllCPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.flowDomain_cmcc.CPTP_Role_T cptpRole, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder cptpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllCPTPs(fdName,cptpRole,how_many,cptpList,cptpIt);
	}

	public void deactivateFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deactivateFDFr(fdfrName,fdfr);
	}

	public void unassignCPTPsFromMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.unassignCPTPsFromMFD(mfdName,tpNames,tpsToModify,errorReason);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder mfd) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getMFD(mfdName,mfd);
	}

	public void modifyFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.flowDomain_cmcc.FDModifyData_T fdModifyData, org.omg.hw.flowDomain_cmcc.FlowDomain_THolder modifiedFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyFlowDomain(fdName,fdModifyData,modifiedFD,failedAttributes,errorReason);
	}

	public void getAssociatingFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.flowDomain_cmcc.FlowDomain_THolder flowDomain) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAssociatingFD(mfdName,flowDomain);
	}

	public void getFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.flowDomain_cmcc.FlowDomain_THolder flowDomain) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomain(fdName,flowDomain);
	}

	public void getAllFDFrs(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, org.omg.hw.flowDomainFragment_cmcc.FDFrList_THolder fdfrList, org.omg.hw.flowDomainFragment_cmcc.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrs(fdName,how_many,connectivityRateList,fdfrList,fdfrIt);
	}

	public void activateFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.activateFDFr(fdfrName,fdfr);
	}

	public void getAllAssignableCPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder cptpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllAssignableCPTPs(mfdName,how_many,cptpList,cptpIt);
	}

	public void createFTP(org.omg.hw.flowDomain_cmcc.FTPCreateData_T createData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.terminationPoint.TerminationPoint_THolder theFTP, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createFTP(createData,tpsToModify,theFTP,errorReason);
	}

	public void getAllSupportedMFDs(org.omg.hw.globaldefs.NameAndStringValue_T[] holderName, int how_many, org.omg.hw.flowDomain_cmcc.MFDList_THolder mfds, org.omg.hw.flowDomain_cmcc.MFDIterator_IHolder mfdIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportedMFDs(holderName,how_many,mfds,mfdIt);
	}

	public void createFDFr(org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_T createData, org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_T connectivityRequirement, org.omg.hw.subnetworkConnection.TPData_T[] aEnd, org.omg.hw.subnetworkConnection.TPData_T[] zEnd, org.omg.hw.globaldefs.NamingAttributesList_THolder internalTPs, org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder mfdfrs, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createFDFr(createData,connectivityRequirement,aEnd,zEnd,internalTPs,mfdfrs,tpsToModify,theFDFr,errorReason);
	}

	public void getFlowDomainsByUserLabel(java.lang.String userLabel, org.omg.hw.flowDomain_cmcc.FDList_THolder flowDomains) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomainsByUserLabel(userLabel,flowDomains);
	}

	public void getAllAssignedCPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder cptpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllAssignedCPTPs(mfdName,how_many,cptpList,cptpIt);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void deleteFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteFDFr(fdfrName);
	}

	public void deleteMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteMFD(mfdName,tpsToModify,errorReason);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void associateCPTPsWithFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] cptpNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.associateCPTPsWithFlowDomain(fdName,cptpNames,tpsToModify,errorReason);
	}

	public void modifyMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.flowDomain_cmcc.MFDModifyData_T mfdModifyData, org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyMFD(mfdName,mfdModifyData,newMFD,failedAttributes,errorReason);
	}

	public void getFDFrsByUserLabel(java.lang.String userLabel, org.omg.hw.flowDomainFragment_cmcc.FDFrList_THolder fdfrs) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsByUserLabel(userLabel,fdfrs);
	}

	public void getAssigningMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] cptpName, org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder mfd) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAssigningMFD(cptpName,mfd);
	}

	public void deleteFTP(org.omg.hw.globaldefs.NameAndStringValue_T[] ftpName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteFTP(ftpName,tpsToModify,errorReason);
	}

	public void getAllTopologicalLinksOfFD(org.omg.hw.globaldefs.NameAndStringValue_T[] flowDomainName, int how_many, org.omg.hw.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinksOfFD(flowDomainName,how_many,topoList,topoIt);
	}

	public void deactivateAndDeleteFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deactivateAndDeleteFDFr(fdfrName,tpsToModify,theFDFr,errorReason);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllFlowDomains(int how_many, org.omg.hw.flowDomain_cmcc.FDList_THolder flowDomains, org.omg.hw.flowDomain_cmcc.FDIterator_IHolder fdIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllFlowDomains(how_many,flowDomains,fdIt);
	}

	public void createMFD(org.omg.hw.flowDomain_cmcc.MFDCreateData_T createData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder theMFD, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createMFD(createData,tpsToModify,theMFD,errorReason);
	}

	public void associateMFDsWithFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] mfdNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.associateMFDsWithFlowDomain(fdName,mfdNames,tpsToModify,errorReason);
	}

	public void deAssociateMFDsFromFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] mfdNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deAssociateMFDsFromFlowDomain(fdName,mfdNames,tpsToModify,errorReason);
	}

	public void deAssociateCPTPsFromFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deAssociateCPTPsFromFlowDomain(fdName,tpNames,tpsToModify,errorReason);
	}

	public void getFDFrsWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] cptpName, int how_many, org.omg.hw.flowDomainFragment_cmcc.FDFrList_THolder fdfrList, org.omg.hw.flowDomainFragment_cmcc.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsWithTP(cptpName,how_many,fdfrList,fdfrIt);
	}

	public void getTransmissionParams(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, org.omg.hw.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionParams(name,filter,transmissionParams);
	}

	public void deleteFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteFlowDomain(fdName,tpsToModify,errorReason);
	}

	public void assignCPTPsToMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.assignCPTPsToMFD(mfdName,tpNames,tpsToModify,errorReason);
	}

}
