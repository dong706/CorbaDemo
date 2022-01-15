package org.omg.hw.trafficConditioningProfile;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TCProfileMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TCProfileMgr_IPOATie
	extends TCProfileMgr_IPOA
{
	private TCProfileMgr_IOperations _delegate;

	private POA _poa;
	public TCProfileMgr_IPOATie(TCProfileMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TCProfileMgr_IPOATie(TCProfileMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.trafficConditioningProfile.TCProfileMgr_I _this()
	{
		return org.omg.hw.trafficConditioningProfile.TCProfileMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.trafficConditioningProfile.TCProfileMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.trafficConditioningProfile.TCProfileMgr_IHelper.narrow(_this_object(orb));
	}
	public TCProfileMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TCProfileMgr_IOperations delegate)
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
	public void HW_createTCProfile(org.omg.hw.trafficConditioningProfile.HW_TCProfileCreateData_T newTCProfileCreateData, org.omg.hw.trafficConditioningProfile.HW_TCProfile_THolder newTCProfile) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_createTCProfile(newTCProfileCreateData,newTCProfile);
	}

	public void modifyTCProfile(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName, org.omg.hw.trafficConditioningProfile.TCProfileCreateData_T tcProfileModifyData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.trafficConditioningProfile.TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyTCProfile(tcProfileName,tcProfileModifyData,tpsToModify,modifiedTCProfile,errorReason);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void deleteTCProfile(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteTCProfile(tcProfileName);
	}

	public void getTCProfileAssociatedTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTCProfileAssociatedTPs(tcProfileName,how_many,tpList,tpIt);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void HW_modifyTCProfile(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName, org.omg.hw.trafficConditioningProfile.HW_TCProfileCreateData_T tcProfileModifyData, org.omg.hw.trafficConditioningProfile.HW_TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_modifyTCProfile(tcProfileName,tcProfileModifyData,modifiedTCProfile,errorReason);
	}

	public void assignTrafficConditioningProfile(org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssign_T[] resourceList, org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder failedResourceList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.assignTrafficConditioningProfile(resourceList,failedResourceList);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getTCProfile(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName, org.omg.hw.trafficConditioningProfile.TCProfile_THolder tcProfile) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTCProfile(tcProfileName,tcProfile);
	}

	public void HW_getAllTCProfileNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllTCProfileNames(how_many,nameList,nameIt);
	}

	public void HW_getTCProfile(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName, org.omg.hw.trafficConditioningProfile.HW_TCProfile_THolder tcProfile) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_getTCProfile(tcProfileName,tcProfile);
	}

	public void getTCProfileAssociatedResouces(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName, org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder resourceList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTCProfileAssociatedResouces(tcProfileName,resourceList);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void createTCProfile(org.omg.hw.trafficConditioningProfile.TCProfileCreateData_T newTCProfileCreateData, org.omg.hw.trafficConditioningProfile.TCProfile_THolder newTCProfile) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createTCProfile(newTCProfileCreateData,newTCProfile);
	}

	public void deassignTrafficConditioningProfile(org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] resourceList, org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassignList_THolder failedResourceList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deassignTrafficConditioningProfile(resourceList,failedResourceList);
	}

	public void getAllTCProfiles(int how_many, org.omg.hw.trafficConditioningProfile.TCProfileList_THolder tcProfileList, org.omg.hw.trafficConditioningProfile.TCProfileIterator_IHolder tcProfileIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTCProfiles(how_many,tcProfileList,tcProfileIt);
	}

	public void HW_getAllTCProfiles(int how_many, org.omg.hw.trafficConditioningProfile.HW_TCProfileList_THolder tcProfileList, org.omg.hw.trafficConditioningProfile.HW_TCProfileIterator_IHolder tcProfileIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllTCProfiles(how_many,tcProfileList,tcProfileIt);
	}

}
