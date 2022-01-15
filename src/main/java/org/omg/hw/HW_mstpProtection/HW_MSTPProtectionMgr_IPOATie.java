package org.omg.hw.HW_mstpProtection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_MSTPProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class HW_MSTPProtectionMgr_IPOATie
	extends HW_MSTPProtectionMgr_IPOA
{
	private HW_MSTPProtectionMgr_IOperations _delegate;

	private POA _poa;
	public HW_MSTPProtectionMgr_IPOATie(HW_MSTPProtectionMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_MSTPProtectionMgr_IPOATie(HW_MSTPProtectionMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.HW_mstpProtection.HW_MSTPProtectionMgr_I _this()
	{
		return org.omg.hw.HW_mstpProtection.HW_MSTPProtectionMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.HW_mstpProtection.HW_MSTPProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.HW_mstpProtection.HW_MSTPProtectionMgr_IHelper.narrow(_this_object(orb));
	}
	public HW_MSTPProtectionMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_MSTPProtectionMgr_IOperations delegate)
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
	public void performAtmPGProtectionCommand(org.omg.hw.globaldefs.NameAndStringValue_T[] atmpgName, org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchAction_T switchAction, org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchDirect_T switchDirect, org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.performAtmPGProtectionCommand(atmpgName,protectionCommand,switchAction,switchDirect,switchData);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllRPRNode(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpProtection.HW_RPRNodeList_THolder nodeList, org.omg.hw.HW_mstpProtection.HW_RPRNodeIterator_IHolder nodeIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllRPRNode(meName,how_many,nodeList,nodeIt);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void modifyAtmProtectGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] atmPgName, org.omg.hw.globaldefs.NameAndStringValue_T[] atmPGParameters, org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyAtmProtectGroup(atmPgName,atmPGParameters,atmPG);
	}

	public void getRPRTopoPara(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.HW_mstpProtection.HW_RPRTopoInfo_THolder topoInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getRPRTopoPara(nodeName,topoInfo);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void retrieveRPRSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.retrieveRPRSwitchData(nodeName,switchData);
	}

	public void getAtmProtectGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] atmpgName, org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAtmProtectGroup(atmpgName,atmPG);
	}

	public void getRPRNode(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.HW_mstpProtection.HW_RPRNode_THolder node) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getRPRNode(nodeName,node);
	}

	public void performRPRProtectionCommand(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.HW_mstpProtection.HW_SwitchPosition_T switchPosition, org.omg.hw.HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.performRPRProtectionCommand(nodeName,protectionCommand,switchPosition,switchData);
	}

	public void getAllRPRLinkInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpProtection.HW_RPRLinkInfoList_THolder linkList, org.omg.hw.HW_mstpProtection.HW_RPRLinkIterator_IHolder rprLinkIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllRPRLinkInfo(meName,how_many,linkList,rprLinkIt);
	}

	public void retrieveAtmPGSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] atmpgName, org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.retrieveAtmPGSwitchData(atmpgName,switchData);
	}

	public void modifyRPRLinkPara(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.globaldefs.NameAndStringValue_T[] rprLinkParameters, org.omg.hw.HW_mstpProtection.HW_RPRLinkInfo_THolder linkInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyRPRLinkPara(nodeName,rprLinkParameters,linkInfo);
	}

	public void modifyRPRNodePara(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.globaldefs.NameAndStringValue_T[] rprNodeParameters, org.omg.hw.HW_mstpProtection.HW_RPRNode_THolder node) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyRPRNodePara(nodeName,rprNodeParameters,node);
	}

	public void getAllAtmProtectGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpProtection.HW_AtmProtectGroupList_THolder atmPGList, org.omg.hw.HW_mstpProtection.HW_AtmProtectGroupIterator_IHolder pgIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllAtmProtectGroup(meName,how_many,atmPGList,pgIt);
	}

}
