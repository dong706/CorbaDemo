package org.omg.hw.trafficDescriptor;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TrafficDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TrafficDescriptorMgr_IPOATie
	extends TrafficDescriptorMgr_IPOA
{
	private TrafficDescriptorMgr_IOperations _delegate;

	private POA _poa;
	public TrafficDescriptorMgr_IPOATie(TrafficDescriptorMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TrafficDescriptorMgr_IPOATie(TrafficDescriptorMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.trafficDescriptor.TrafficDescriptorMgr_I _this()
	{
		return org.omg.hw.trafficDescriptor.TrafficDescriptorMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.trafficDescriptor.TrafficDescriptorMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.trafficDescriptor.TrafficDescriptorMgr_IHelper.narrow(_this_object(orb));
	}
	public TrafficDescriptorMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TrafficDescriptorMgr_IOperations delegate)
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
	public void getAssociatedCTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficDescriptorName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAssociatedCTPs(trafficDescriptorName,how_many,tpList,tpIt);
	}

	public void createTrafficDescriptor(org.omg.hw.trafficDescriptor.TDCreateData_T newTDCreateData, org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createTrafficDescriptor(newTDCreateData,newTrafficDescriptor);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void deleteTrafficDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] descriptorName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteTrafficDescriptor(descriptorName);
	}

	public void HW_getAllTrafficDescriptors(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, org.omg.hw.trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllTrafficDescriptors(meName,how_many,trafficDescList,trafficDescIt);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void deactivateTrafficDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] tdName, org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder td) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deactivateTrafficDescriptor(tdName,td);
	}

	public void getAllTrafficDescriptors(int how_many, org.omg.hw.trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, org.omg.hw.trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficDescriptors(how_many,trafficDescList,trafficDescIt);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getTrafficDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] tdName, org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder td) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTrafficDescriptor(tdName,td);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void activateTrafficDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] tdName, org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder td) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.activateTrafficDescriptor(tdName,td);
	}

	public void HW_getAllTrafficDescriptorNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllTrafficDescriptorNames(meName,how_many,nameList,nameIt);
	}

	public void getAllTrafficDescriptorNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficDescriptorNames(how_many,nameList,nameIt);
	}

	public void HW_createTrafficDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.trafficDescriptor.TDCreateData_T newTDCreateData, org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_createTrafficDescriptor(meName,newTDCreateData,newTrafficDescriptor);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

}
