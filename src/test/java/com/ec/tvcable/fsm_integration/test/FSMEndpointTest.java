package com.ec.tvcable.fsm_integration.test;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.component.test.mixins.http.HTTPMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.SwitchYardTestKit;

import com.ec.tvcable.fsm_integration.service.FetchAvailableAppointmentSlots;
import com.ec.tvcable.fsm_integration.service.FetchAvailableAppointmentSlotsResponse;

/**
 * 
 */

/**
 * @author pablo
 *
 */
@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = { CDIMixIn.class, HTTPMixIn.class })
public class FSMEndpointTest extends BaseTest {

	private static final String FETCH_AVAILABLE_APPOINTMENT_SLOTS_REQUEST = "fetchAvailableAppointmentSlotsRequest.xml";
	private SwitchYardTestKit testKit;
	private CDIMixIn cdiMixIn;
	private HTTPMixIn httpMixIn;
	
	@ServiceOperation("FSMEndpoint")
	private Invoker service;

	@Test
	public void testFetchAvailableAppointmentSlots() throws Exception {
		
		FetchAvailableAppointmentSlots faaSlots = new FetchAvailableAppointmentSlots();
		
		FetchAvailableAppointmentSlotsResponse result = service.operation("fetchAvailableAppointmentSlots")
				.sendInOut(faaSlots).getContent(FetchAvailableAppointmentSlotsResponse.class);
		
		System.out.println(result);

		// validate the results
		Assert.assertTrue("Implement me", false);
	}

	@Test
	@Ignore
	public void testFetchWorkOrder() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Object message = null;
		Object result = service.operation("fetchWorkOrder")
				.sendInOut(message).getContent(Object.class);

		// validate the results
		Assert.assertTrue("Implement me", false);
	}

	@Test
	@Ignore
	public void testModifyWorkOrder() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Object message = null;
		Object result = service.operation("modifyWorkOrder").sendInOut(message)
				.getContent(Object.class);

		// validate the results
		Assert.assertTrue("Implement me", false);
	}

	@Test
	@Ignore
	public void testCancelTask() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Object message = null;
		Object result = service.operation("cancelTask").sendInOut(message)
				.getContent(Object.class);

		// validate the results
		Assert.assertTrue("Implement me", false);
	}

	@Test
	@Ignore
	public void testCancelWorkOrder() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Object message = null;
		Object result = service.operation("cancelWorkOrder").sendInOut(message)
				.getContent(Object.class);

		// validate the results
		Assert.assertTrue("Implement me", false);
	}

	@Test
	@Ignore
	public void testRescheduleTask() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Object message = null;
		Object result = service.operation("rescheduleTask").sendInOut(message)
				.getContent(Object.class);

		// validate the results
		Assert.assertTrue("Implement me", false);
	}

	@Test
	@Ignore
	public void testCloseWorkOrder() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Object message = null;
		Object result = service.operation("closeWorkOrder").sendInOut(message)
				.getContent(Object.class);

		// validate the results
		Assert.assertTrue("Implement me", false);
	}

	@Test
	@Ignore
	public void testCreateWorkOrder() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Object message = null;
		Object result = service.operation("createWorkOrder").sendInOut(message)
				.getContent(Object.class);

		// validate the results
		Assert.assertTrue("Implement me", false);
	}

	@Test
	@Ignore
	public void testCreateTask() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Object message = null;
		Object result = service.operation("createTask").sendInOut(message)
				.getContent(Object.class);

		// validate the results
		Assert.assertTrue("Implement me", false);
	}

}
