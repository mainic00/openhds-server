package org.openhds.web.service;

import org.springframework.binding.message.MessageContext;

public interface WebFlowService {
	
	void createMessage(MessageContext messageContext, String message);
}

