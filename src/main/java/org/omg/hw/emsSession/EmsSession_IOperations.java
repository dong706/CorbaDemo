package org.omg.hw.emsSession;

/**
 *	Generated from IDL interface "EmsSession_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EmsSession_IOperations
	extends org.omg.hw.session.Session_IOperations
{
	/* constants */
	/* operations  */
	void getSupportedManagers(org.omg.hw.emsSession.EmsSession_IPackage.managerNames_THolder supportedManagerList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getManager(java.lang.String managerName, org.omg.hw.common.Common_IHolder managerInterface) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getEventChannel(org.omg.hw.CosNotifyChannelAdmin.EventChannelHolder eventChannel) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
