package org.omg.hw.flowDomain;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "FlowDomainMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class FlowDomainMgr_IPOATie
	extends FlowDomainMgr_IPOA
{
	private FlowDomainMgr_IOperations _delegate;

	private POA _poa;
	public FlowDomainMgr_IPOATie(FlowDomainMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FlowDomainMgr_IPOATie(FlowDomainMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.flowDomain.FlowDomainMgr_I _this()
	{
		return org.omg.hw.flowDomain.FlowDomainMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.flowDomain.FlowDomainMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.flowDomain.FlowDomainMgr_IHelper.narrow(_this_object(orb));
	}
	public FlowDomainMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FlowDomainMgr_IOperations delegate)
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

	public void createFlowDomain(org.omg.hw.flowDomain.FDCreateData_T createData, org.omg.hw.globaldefs.NamingAttributesList_THolder fdEdgeCPTPs, org.omg.hw.flowDomain.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createFlowDomain(createData,fdEdgeCPTPs,theFD,errorReason);
	}

	public void activateFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.activateFDFr(fdfrName,fdfr);
	}

	public void deAssociateMFDsFromFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] mfdNames) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deAssociateMFDsFromFlowDomain(fdName,mfdNames);
	}

	public void associateMFDsWithFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] mfdNames) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.associateMFDsWithFlowDomain(fdName,mfdNames);
	}

	public void unassignCPTPsFromMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.unassignCPTPsFromMFD(mfdName,tpNames);
	}

	public void getFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.flowDomain.FlowDomain_THolder flowDomain) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomain(fdName,flowDomain);
	}

	public void getAllMFDs(org.omg.hw.globaldefs.NameAndStringValue_T[] holderName, int how_many, org.omg.hw.flowDomain.MFDList_THolder mfds, org.omg.hw.flowDomain.MFDIterator_IHolder mfdIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllMFDs(holderName,how_many,mfds,mfdIt);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void assignCPTPsToMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.assignCPTPsToMFD(mfdName,tpNames);
	}

	public void getAllEthernetOAMPoint(org.omg.hw.globaldefs.NameAndStringValue_T[] Fdfrname, org.omg.hw.flowDomain.EthernetOAMPointList_THolder oamPointList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllEthernetOAMPoint(Fdfrname,oamPointList);
	}

	public void getFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFr(fdfrName,fdfr);
	}

	public void modifyMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.flowDomain.MFDModifyData_T mfdModifyData, org.omg.hw.globaldefs.NameAndStringValue_T[] transmissionDescriptorName, org.omg.hw.transmissionParameters.LayeredParameterList_THolder transmissionParams, org.omg.hw.globaldefs.NVSList_THolder additionalModificationInfo, org.omg.hw.flowDomain.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyMFD(mfdName,mfdModifyData,transmissionDescriptorName,transmissionParams,additionalModificationInfo,newMFD,errorReason);
	}

	public void modifyFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment.FDFrModifyData_T fdfrModifyData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyFDFr(fdfrName,fdfrModifyData,tpsToModify,tolerableImpact,newFDFr,errorReason);
	}

	public void createFTP(org.omg.hw.flowDomain.FTPCreateData_T createData, org.omg.hw.terminationPoint.TerminationPoint_THolder theFTP) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createFTP(createData,theFTP);
	}

	public void associateCPTPsWithFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.associateCPTPsWithFlowDomain(fdName,tpNames);
	}

	public void getAllFDFrNames(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrNames(fdName,how_many,connectivityRateList,nameList,nameIt);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void deAssociateCPTPsFromFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deAssociateCPTPsFromFlowDomain(fdName,tpNames);
	}

	public void getAllCPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] fdOrMfdName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllCPTPs(fdOrMfdName,how_many,tpList,tpIt);
	}

	public void deleteFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteFDFr(fdfrName,tpsToModify);
	}

	public void performEthernetOAMCommand(org.omg.hw.flowDomain.EthernetOAMOperation_T operation, org.omg.hw.flowDomain.EthernetLTTestResultList_THolder ltTestResult) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.performEthernetOAMCommand(operation,ltTestResult);
	}

	public void getFDFrsByUserLabel(java.lang.String userLabel, org.omg.hw.flowDomainFragment.FDFrList_THolder fdfrs) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsByUserLabel(userLabel,fdfrs);
	}

	public void getAllFDFrs(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, org.omg.hw.flowDomainFragment.FDFrList_THolder fdfrList, org.omg.hw.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrs(fdName,how_many,connectivityRateList,fdfrList,fdfrIt);
	}

	public void addFPsToFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomain.ConnectivityRequirement_T connectivityRequirement, org.omg.hw.globaldefs.NamingAttributesList_THolder tpNames, org.omg.hw.globaldefs.NamingAttributesList_THolder internalTpNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.addFPsToFDFr(fdfrName,connectivityRequirement,tpNames,internalTpNames,tpsToModify,errorReason);
	}

	public void deleteMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteMFD(mfdName);
	}

	public void getAllFlowDomains(int how_many, org.omg.hw.flowDomain.FDList_THolder flowDomains, org.omg.hw.flowDomain.FDIterator_IHolder fdIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllFlowDomains(how_many,flowDomains,fdIt);
	}

	public void removeFPsFromFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.globaldefs.NamingAttributesList_THolder tpNames, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.removeFPsFromFDFr(fdfrName,tpNames,errorReason);
	}

	public void deleteFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteFlowDomain(fdName);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllFlowDomainNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllFlowDomainNames(how_many,nameList,nameIt);
	}

	public void validateTMDAssignmentToMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.CORBA.StringHolder tmdAssignmentState, org.omg.hw.transmissionParameters.LayeredParameterList_THolder transmissionParams, org.omg.hw.globaldefs.NVSList_THolder additionalTPInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.validateTMDAssignmentToMFD(mfdName,tmdAssignmentState,transmissionParams,additionalTPInfo);
	}

	public void getFlowDomainsByUserLabel(java.lang.String userLabel, org.omg.hw.flowDomain.FDList_THolder flowDomains) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomainsByUserLabel(userLabel,flowDomains);
	}

	public void getFDFrServerTrail(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.globaldefs.NamingAttributesList_THolder serverNameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrServerTrail(fdfrName,serverNameList);
	}

	public void createMFD(org.omg.hw.flowDomain.MFDCreateData_T createData, org.omg.hw.flowDomain.MatrixFlowDomain_THolder theMFD) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createMFD(createData,theMFD);
	}

	public void getFDfromMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.flowDomain.FlowDomain_THolder flowDomain) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDfromMFD(mfdName,flowDomain);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getFDFrsWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, int how_many, org.omg.hw.flowDomainFragment.FDFrList_THolder fdfrList, org.omg.hw.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsWithTP(tpName,how_many,fdfrList,fdfrIt);
	}

	public void getAssignableCPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAssignableCPTPs(mfdName,how_many,tpList,tpIt);
	}

	public void createFDFr(org.omg.hw.flowDomainFragment.FDFrCreateData_T createData, org.omg.hw.flowDomain.ConnectivityRequirement_T connectivityRequirement, org.omg.hw.globaldefs.NamingAttributesList_THolder endTPs, org.omg.hw.globaldefs.NamingAttributesList_THolder internalTPs, org.omg.hw.flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrs, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createFDFr(createData,connectivityRequirement,endTPs,internalTPs,mfdfrs,tpsToModify,theFDFr,errorReason);
	}

	public void deactivateFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deactivateFDFr(fdfrName,fdfr);
	}

	public void deleteFTP(org.omg.hw.globaldefs.NameAndStringValue_T[] ftpName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteFTP(ftpName);
	}

	public void getMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.flowDomain.MatrixFlowDomain_THolder mfd) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getMFD(mfdName,mfd);
	}

	public void modifyFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.flowDomain.FDModifyData_T fdModifyData, org.omg.hw.flowDomain.FlowDomain_THolder newFD) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyFlowDomain(fdName,fdModifyData,newFD);
	}

	public void getTransmissionParams(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, org.omg.hw.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionParams(name,filter,transmissionParams);
	}

	public void getAllMFDNames(org.omg.hw.globaldefs.NameAndStringValue_T[] holderName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllMFDNames(holderName,how_many,nameList,nameIt);
	}

	public void getAssigningMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] cptpName, org.omg.hw.flowDomain.MatrixFlowDomain_THolder mfd) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAssigningMFD(cptpName,mfd);
	}

}
