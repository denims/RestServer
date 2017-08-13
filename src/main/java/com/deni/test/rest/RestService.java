package com.deni.test.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deni.test.message.Messages;
import com.deni.test.messageservice.MessageService;

@RestController
public class RestService {
	

	
@Autowired
MessageService service;

@RequestMapping("/message")
public Messages respMessage(@RequestParam(value="no",defaultValue="9") String no) {
	Messages message = service.getMessage(Integer.parseInt(no));
	return message;
	
	
	
}



}
