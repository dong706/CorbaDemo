package org.omg.hw.guiCutThrough;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "GuiCutThroughMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class GuiCutThroughMgr_IPOATie
	extends GuiCutThroughMgr_IPOA
{
	private GuiCutThroughMgr_IOperations _delegate;

	private POA _poa;
	public GuiCutThroughMgr_IPOATie(GuiCutThroughMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public GuiCutThroughMgr_IPOATie(GuiCutThroughMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.guiCutThrough.GuiCutThroughMgr_I _this()
	{
		return org.omg.hw.guiCutThrough.GuiCutThroughMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.guiCutThrough.GuiCutThroughMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.guiCutThrough.GuiCutThroughMgr_IHelper.narrow(_this_object(orb));
	}
	public GuiCutThroughMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(GuiCutThroughMgr_IOperations delegate)
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
	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void launchGCT(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String gctContext, org.omg.hw.globaldefs.NameAndStringValue_T[] userInfo, java.lang.String displayAddress, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInputInfo, org.omg.CORBA.BooleanHolder closingEnabled, org.omg.hw.globaldefs.NVSList_THolder additionalOutputInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.launchGCT(objectName,gctContext,userInfo,displayAddress,additionalInputInfo,closingEnabled,additionalOutputInfo);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void destroyGCT(java.lang.String displayAddress) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroyGCT(displayAddress);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getGCTProfileInfo(org.omg.hw.guiCutThrough.GCTProfileInfo_THolder gctProfileInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getGCTProfileInfo(gctProfileInfo);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

}
