package org.omg.zx.emsSession;

/**
 *	Generated from IDL interface "EmsSession_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EmsSession_IOperations
	extends org.omg.zx.session.Session_IOperations
{
	/* constants */
	/* operations  */
	void getSupportedManagers(org.omg.zx.emsSession.EmsSession_IPackage.managerNames_THolder supportedManagerList) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getManager(java.lang.String managerName, org.omg.zx.common.Common_IHolder managerInterface) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void getEventChannel(org.omg.CosNotifyChannelAdmin.EventChannelHolder channel) throws org.omg.zx.globaldefs.ProcessingFailureException;
}
