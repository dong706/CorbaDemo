package org.omg.hw.emsSessionFactory;

/**
 *	Generated from IDL interface "EmsSessionFactory_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EmsSessionFactory_IOperations
	extends org.omg.hw.mtnmVersion.Version_IOperations
{
	/* constants */
	/* operations  */
	void getEmsSession(java.lang.String user, java.lang.String password, org.omg.hw.nmsSession.NmsSession_I client, org.omg.hw.emsSession.EmsSession_IHolder emsSessionInterface) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
