package org.omg.hw.HW_mstpService;

/**
 *	Generated from IDL interface "HW_MSTPServiceMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface HW_MSTPServiceMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void createEthService(org.omg.hw.HW_mstpService.HW_EthServiceCreateData_T createData, org.omg.hw.HW_mstpService.HW_EthServiceList_THolder ethServiceList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteEthService(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllEthService(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.HW_mstpService.HW_EthServiceType_T[] typeList, int how_many, org.omg.hw.HW_mstpService.HW_EthServiceList_THolder serviceList, org.omg.hw.HW_mstpService.HW_EthServiceIterator_IHolder serviceIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getEthService(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, org.omg.hw.HW_mstpService.HW_EthService_THolder ethService) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createAtmService(org.omg.hw.HW_mstpService.HW_AtmServiceCreateData_T createData, org.omg.hw.HW_mstpService.HW_AtmService_THolder atmService) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteAtmService(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllAtmService(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.HW_mstpService.HW_AtmServiceType_T[] typeList, int how_many, org.omg.hw.HW_mstpService.HW_AtmServiceList_THolder serviceList, org.omg.hw.HW_mstpService.HW_AtmServiceIterator_IHolder serviceIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAtmService(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, org.omg.hw.HW_mstpService.HW_AtmService_THolder atmService) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void activateAtmService(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, org.omg.hw.HW_mstpService.HW_AtmService_THolder atmService) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deactivateAtmService(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, org.omg.hw.HW_mstpService.HW_AtmService_THolder atmService) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
