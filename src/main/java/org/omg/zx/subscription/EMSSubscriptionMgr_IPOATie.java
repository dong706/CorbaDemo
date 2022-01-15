package org.omg.zx.subscription;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EMSSubscriptionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EMSSubscriptionMgr_IPOATie
	extends EMSSubscriptionMgr_IPOA
{
	private EMSSubscriptionMgr_IOperations _delegate;

	private POA _poa;
	public EMSSubscriptionMgr_IPOATie(EMSSubscriptionMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EMSSubscriptionMgr_IPOATie(EMSSubscriptionMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.subscription.EMSSubscriptionMgr_I _this()
	{
		return org.omg.zx.subscription.EMSSubscriptionMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.subscription.EMSSubscriptionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.subscription.EMSSubscriptionMgr_IHelper.narrow(_this_object(orb));
	}
	public EMSSubscriptionMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EMSSubscriptionMgr_IOperations delegate)
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
	public boolean synchronizeEvent(org.omg.CosNotifyComm.StructuredPushConsumer pushConsumer, org.omg.CosNotifyFilter.ConstraintExp[] constraintList, org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHolder supplier) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.synchronizeEvent(pushConsumer,constraintList,supplier);
	}

	public boolean suspendSubscription(int subscriptionId) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.suspendSubscription(subscriptionId);
	}

	public void setLocation(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

	public void setNativeEMSName(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public boolean setSubscriptionFilter(int subscriptionId, org.omg.CosNotifyFilter.ConstraintExp[] filterList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.setSubscriptionFilter(subscriptionId,filterList);
	}

	public void setUserLabel(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public boolean resumeSubscription(int subscriptionId) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.resumeSubscription(subscriptionId);
	}

	public boolean subscribe(org.omg.CosNotifyComm.StructuredPushConsumer subscriber, org.omg.CosNotifyFilter.ConstraintExp[] filterList, org.omg.CORBA.IntHolder subscriptionId, org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHolder supplierRef) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.subscribe(subscriber,filterList,subscriptionId,supplierRef);
	}

	public void getSubscriptionStatus(int subscriptionId, org.omg.CosNotifyFilter.ConstraintExpSeqHolder filterList, org.omg.zx.subscription.SubscriptionState_THolder status) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getSubscriptionStatus(subscriptionId,filterList,status);
	}

	public void setAdditionalInfo(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(org.omg.zx.common.CapabilityList_THolder capabilities) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public boolean unsubscribe(int subscriptionId) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.unsubscribe(subscriptionId);
	}

}
