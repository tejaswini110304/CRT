package com.aits.Traveldemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("busservice")
@Scope("prototype")
public class BusService implements TransportService {

	@Override
	public void bookTicket(String source, String destination) {
		// TODO Auto-generated method stub
		System.out.println("Ticket has been booked through busservice from"+source+"to"+destination);
	}

}
