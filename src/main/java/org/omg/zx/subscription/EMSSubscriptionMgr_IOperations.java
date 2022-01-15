package org.omg.zx.subscription;

/**
 *	Generated from IDL interface "EMSSubscriptionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EMSSubscriptionMgr_IOperations
	extends org.omg.zx.common.Common_IOperations
{
	/* constants */
	/* operations  */
	boolean subscribe(org.omg.CosNotifyComm.StructuredPushConsumer subscriber, org.omg.CosNotifyFilter.ConstraintExp[] filterList, org.omg.CORBA.IntHolder subscriptionId, org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHolder supplierRef) throws org.omg.zx.globaldefs.ProcessingFailureException;
	boolean unsubscribe(int subscriptionId) throws org.omg.zx.globaldefs.ProcessingFailureException;
	boolean suspendSubscription(int subscriptionId) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getSubscriptionStatus(int subscriptionId, org.omg.CosNotifyFilter.ConstraintExpSeqHolder filterList, org.omg.zx.subscription.SubscriptionState_THolder status) throws org.omg.zx.globaldefs.ProcessingFailureException;
	boolean synchronizeEvent(org.omg.CosNotifyComm.StructuredPushConsumer pushConsumer, org.omg.CosNotifyFilter.ConstraintExp[] constraintList, org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHolder supplier) throws org.omg.zx.globaldefs.ProcessingFailureException;
	boolean resumeSubscription(int subscriptionId) throws org.omg.zx.globaldefs.ProcessingFailureException;
	boolean setSubscriptionFilter(int subscriptionId, org.omg.CosNotifyFilter.ConstraintExp[] filterList) throws org.omg.zx.globaldefs.ProcessingFailureException;
}
