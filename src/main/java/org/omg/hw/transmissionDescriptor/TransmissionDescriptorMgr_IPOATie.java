package org.omg.hw.transmissionDescriptor;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TransmissionDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TransmissionDescriptorMgr_IPOATie
	extends TransmissionDescriptorMgr_IPOA
{
	private TransmissionDescriptorMgr_IOperations _delegate;

	private POA _poa;
	public TransmissionDescriptorMgr_IPOATie(TransmissionDescriptorMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TransmissionDescriptorMgr_IPOATie(TransmissionDescriptorMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.transmissionDescriptor.TransmissionDescriptorMgr_I _this()
	{
		return org.omg.hw.transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.transmissionDescriptor.TransmissionDescriptorMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(_this_object(orb));
	}
	public TransmissionDescriptorMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransmissionDescriptorMgr_IOperations delegate)
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
	public void getTransmissionDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] tmdName, org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THolder tmd) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionDescriptor(tmdName,tmd);
	}

	public void createTransmissionDescriptor(org.omg.hw.transmissionDescriptor.TMDCreateData_T newTMDCreateData, org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THolder newTransmissionDescriptor) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createTransmissionDescriptor(newTMDCreateData,newTransmissionDescriptor);
	}

	public void getAllTransmissionDescriptorNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTransmissionDescriptorNames(how_many,nameList,nameIt);
	}

	public void modifyTransmissionDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] tmdName, org.omg.hw.transmissionDescriptor.TMDModifyData_T tmdModifyData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THolder modifiedTransmissionDescriptor, org.omg.hw.globaldefs.NamingAttributesList_THolder failedMEList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedTPsMFDsList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyTransmissionDescriptor(tmdName,tmdModifyData,tpsToModify,modifiedTransmissionDescriptor,failedMEList,failedTPsMFDsList,errorReason);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllTransmissionDescriptors(int how_many, org.omg.hw.transmissionDescriptor.TransmissionDescriptorList_THolder transmissionDescList, org.omg.hw.transmissionDescriptor.TransmissionDescriptorIterator_IHolder transmissionDescIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTransmissionDescriptors(how_many,transmissionDescList,transmissionDescIt);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setTMDAssociation(org.omg.hw.globaldefs.NameAndStringValue_T[] tmdName, org.omg.hw.transmissionDescriptor.TPorMFDorFDFr_THolder tPorMFDorFDFr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setTMDAssociation(tmdName,tPorMFDorFDFr);
	}

	public void deleteTransmissionDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] transmissionDescriptorName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteTransmissionDescriptor(transmissionDescriptorName);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void validateTMDAssignmentToObject(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.CORBA.StringHolder objectAssignmentState, org.omg.hw.transmissionParameters.LayeredParameterList_THolder transmissionParams, org.omg.hw.globaldefs.NVSList_THolder additionalTPInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.validateTMDAssignmentToObject(objectName,objectAssignmentState,transmissionParams,additionalTPInfo);
	}

	public void getAssociatedTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] transmissionDescriptorName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAssociatedTPs(transmissionDescriptorName,how_many,tpList,tpIt);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

}
