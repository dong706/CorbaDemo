package org.omg.hw.HW_mstpService;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_MSTPServiceMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class HW_MSTPServiceMgr_IPOATie
	extends HW_MSTPServiceMgr_IPOA
{
	private HW_MSTPServiceMgr_IOperations _delegate;

	private POA _poa;
	public HW_MSTPServiceMgr_IPOATie(HW_MSTPServiceMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_MSTPServiceMgr_IPOATie(HW_MSTPServiceMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.HW_mstpService.HW_MSTPServiceMgr_I _this()
	{
		return org.omg.hw.HW_mstpService.HW_MSTPServiceMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.HW_mstpService.HW_MSTPServiceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.HW_mstpService.HW_MSTPServiceMgr_IHelper.narrow(_this_object(orb));
	}
	public HW_MSTPServiceMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_MSTPServiceMgr_IOperations delegate)
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
	public void getAtmService(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, org.omg.hw.HW_mstpService.HW_AtmService_THolder atmService) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAtmService(serviceName,atmService);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllAtmService(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.HW_mstpService.HW_AtmServiceType_T[] typeList, int how_many, org.omg.hw.HW_mstpService.HW_AtmServiceList_THolder serviceList, org.omg.hw.HW_mstpService.HW_AtmServiceIterator_IHolder serviceIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllAtmService(meName,typeList,how_many,serviceList,serviceIt);
	}

	public void deactivateAtmService(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, org.omg.hw.HW_mstpService.HW_AtmService_THolder atmService) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deactivateAtmService(serviceName,atmService);
	}

	public void getAllEthService(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.HW_mstpService.HW_EthServiceType_T[] typeList, int how_many, org.omg.hw.HW_mstpService.HW_EthServiceList_THolder serviceList, org.omg.hw.HW_mstpService.HW_EthServiceIterator_IHolder serviceIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllEthService(meName,typeList,how_many,serviceList,serviceIt);
	}

	public void createEthService(org.omg.hw.HW_mstpService.HW_EthServiceCreateData_T createData, org.omg.hw.HW_mstpService.HW_EthServiceList_THolder ethServiceList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createEthService(createData,ethServiceList);
	}

	public void activateAtmService(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, org.omg.hw.HW_mstpService.HW_AtmService_THolder atmService) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.activateAtmService(serviceName,atmService);
	}

	public void deleteAtmService(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteAtmService(serviceName);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void deleteEthService(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteEthService(serviceName);
	}

	public void createAtmService(org.omg.hw.HW_mstpService.HW_AtmServiceCreateData_T createData, org.omg.hw.HW_mstpService.HW_AtmService_THolder atmService) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createAtmService(createData,atmService);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getEthService(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, org.omg.hw.HW_mstpService.HW_EthService_THolder ethService) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getEthService(serviceName,ethService);
	}

}
