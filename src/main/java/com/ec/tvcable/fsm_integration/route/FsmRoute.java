/**
 * 
 */
package com.ec.tvcable.fsm_integration.route;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.switchyard.HandlerException;

/**
 * @author pablo
 * 
 */
public class FsmRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method. The from endpoint is
	 * required to be a SwitchYard service.
	 */
	public void configure() {
		from("switchyard://FSMEndpoint")
			.doTry()
				.to("switchyard://FSMEndpointTarget")
				.doCatch(HandlerException.class).process(new Processor() {
				    public void process(Exchange exchange) throws Exception {
				        Message out = exchange.getOut();
				        out.setBody(this.getClass().getResourceAsStream("SoapFaultMessage.xml"));
				        out.setHeader(org.apache.cxf.message.Message.RESPONSE_CODE, new Integer(500));
				    }
				})
			.end();
		
	}

}
