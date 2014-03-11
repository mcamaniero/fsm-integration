package com.ec.tvcable.fsm_integration.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.component.test.mixins.http.HTTPMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;

/**
 * 
 */

/**
 * @author pablo
 * 
 */
@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = {
		CDIMixIn.class, HTTPMixIn.class })
public class FSMEndpointTest extends BaseTest {

	private static final String FETCH_SUCCESS_REQUEST = "fetchSuccessRequest.xml";
	private static final String FETCH_SUCCESS_RESPONSE = "fetchSuccessResponse.xml";
	private static final String FETCH_FAULT_REQUEST = "fetchFaultRequest.xml";
	private static final String FETCH_FAULT_RESPONSE = "fetchFaultResponse.xml";
	private static final String CREATE_SUCCESS_REQUEST = "createSuccessRequest.xml";
	private static final String CREATE_SUCCESS_RESPONSE = "createSuccessResponse.xml";
	private static final String CREATE_FAULT_REQUEST = "createFaultRequest.xml";
	private static final String CREATE_FAULT_RESPONSE = "createFaultResponse.xml";
	private static String URL = "http://localhost:8080/fsm-integration/FSMEndpointService";

	private HTTPMixIn httpMixIn;

	@ServiceOperation("FSMEndpoint")
	private Invoker service;

	@Test
	public void successFetchAvailableAppointmentSlots() throws Exception {
		httpMixIn.postStringAndTestXML(URL, loadStringXML(FETCH_SUCCESS_REQUEST), loadStringXML(FETCH_SUCCESS_RESPONSE));
	}

	@Test
	public void faultFetchAvailableAppointmentSlots() throws Exception {
		httpMixIn.postStringAndTestXML(URL, loadStringXML(FETCH_FAULT_REQUEST), loadStringXML(FETCH_FAULT_RESPONSE));
	}
	
	@Test
	public void successCreateWorkOrder() throws Exception {
		httpMixIn.postStringAndTestXML(URL, loadStringXML(CREATE_SUCCESS_REQUEST), loadStringXML(CREATE_SUCCESS_RESPONSE));
	}

	@Test
	public void failCreateWorkOrder() throws Exception {
		httpMixIn.postStringAndTestXML(URL, loadStringXML(CREATE_FAULT_REQUEST), loadStringXML(CREATE_FAULT_RESPONSE));
	}

}