package com.hotmart.capi.adapters.inbound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotmart.capi.application.core.domain.Event;
import com.hotmart.capi.application.core.domain.EventResponse;
import com.hotmart.capi.application.ports.in.EventInputPort;

@RestController
@RequestMapping(value = {"/sendEvent"})
public class ReceiptEventRestAdapter {
	
	@Autowired
	private  EventInputPort sendEventInputPort;

    @PostMapping()
    public EventResponse sendEvent(@RequestBody Event event){
    	EventResponse returnEvent = sendEventInputPort.sendEvent(event);
        return returnEvent;
    }

}
// adicionando comentário
