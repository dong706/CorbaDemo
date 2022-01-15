package org.omg.hw.encapsulationLayerLink;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EncapsulationLayerLinkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EncapsulationLayerLinkMgr_IPOATie
	extends EncapsulationLayerLinkMgr_IPOA
{
	private EncapsulationLayerLinkMgr_IOperations _delegate;

	private POA _poa;
	public EncapsulationLayerLinkMgr_IPOATie(EncapsulationLayerLinkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EncapsulationLayerLinkMgr_IPOATie(EncapsulationLayerLinkMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.encapsulationLayerLink.EncapsulationLayerLinkMgr_I _this()
	{
		return org.omg.hw.encapsulationLayerLink.EncapsulationLayerLinkMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.encapsulationLayerLink.EncapsulationLayerLinkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.encapsulationLayerLink.EncapsulationLayerLinkMgr_IHelper.narrow(_this_object(orb));
	}
	public EncapsulationLayerLinkMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EncapsulationLayerLinkMgr_IOperations delegate)
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
	public void increaseBandwidthOfELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, boolean automatic, org.omg.hw.subnetworkConnection.SNCCreateData_T[] additionalSNCs, short numberOfSNCs, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalModificationInfo, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.increaseBandwidthOfELLink(ellName,automatic,additionalSNCs,numberOfSNCs,transmissionParams,additionalModificationInfo,newELL);
	}

	public void setELLinkLCASState(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, boolean enableState) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setELLinkLCASState(ellName,enableState);
	}

	public void deactivateELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deactivateELLink(ellName,theELL,errorReason);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getConnectingELL(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getConnectingELL(tpName,ell);
	}

	public void modifyELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.encapsulationLayerLink.ELLinkModifyData_T ellModifyData, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyELLink(ellName,ellModifyData,newELL,errorReason);
	}

	public void getTransmissionParams(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, org.omg.hw.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionParams(name,filter,transmissionParams);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getELLink(ellName,ell);
	}

	public void deleteELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteELLink(ellName);
	}

	public void activateELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.activateELLink(ellName,theELL,errorReason);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getELLinkWithSncOrTl(org.omg.hw.globaldefs.NameAndStringValue_T[] sncOrTlName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getELLinkWithSncOrTl(sncOrTlName,ell);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getServerSNCsAndTLs(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.omg.hw.topologicalLink.TopologicalLinkList_THolder tlList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getServerSNCsAndTLs(ellName,sncList,tlList);
	}

	public void getAllELLinksWithMeOrFd(org.omg.hw.globaldefs.NameAndStringValue_T[] meOrFdName, int how_many, org.omg.hw.encapsulationLayerLink.ELLinkList_THolder ells, org.omg.hw.encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllELLinksWithMeOrFd(meOrFdName,how_many,ells,ellIt);
	}

	public void getAllELLinks(int how_many, org.omg.hw.encapsulationLayerLink.ELLinkList_THolder ells, org.omg.hw.encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllELLinks(how_many,ells,ellIt);
	}

	public void createELLink(org.omg.hw.encapsulationLayerLink.ELLinkCreateData_T createData, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createELLink(createData,theELL,errorReason);
	}

	public void getAllELLinkNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllELLinkNames(how_many,nameList,nameIt);
	}

	public void getELLinkWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getELLinkWithTP(tpName,ell);
	}

	public void decreaseBandwidthOfELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.globaldefs.NameAndStringValue_T[][] sncNames, short numberOfSNCs, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalModificationInfo, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.decreaseBandwidthOfELLink(ellName,sncNames,numberOfSNCs,additionalModificationInfo,newELL);
	}

}
