package com.annotation.CustomAnnotation.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.annotation.CustomAnnotation.EnableRestCallLogs;
import com.annotation.CustomAnnotation.dto.InputRequestInfo;
import com.annotation.CustomAnnotation.dto.OutputResponseInfo;

@RestController
@RequestMapping("/api")
public class DemoRestController {

	@GetMapping("/testGet/{name}")
	@ResponseStatus(HttpStatus.OK)
	@EnableRestCallLogs
	public OutputResponseInfo testGetEndPoint(@PathVariable String name) {
		
		OutputResponseInfo result=new OutputResponseInfo();
		result.setResponse_state(HttpStatus.OK);
		 Map<String, Object> hm= new HashMap<>();
		 hm.put("Id", Integer.valueOf(1));
		 hm.put("Input_Name", String.valueOf(name));
		result.setPayload(hm);
		return result;
	}
	
	
	  @PostMapping("/testPost")
	  @ResponseStatus(HttpStatus.CREATED) 
	  @EnableRestCallLogs
	  public OutputResponseInfo testPostEndPoint(@RequestBody InputRequestInfo inputRequestInfo) { 
		  OutputResponseInfo result=new OutputResponseInfo();
			result.setResponse_state(HttpStatus.CREATED);
			 Map<String, Object> hm= new HashMap<>();
			 hm.put("Payload", inputRequestInfo);
			result.setPayload(hm);
		  return result; 
		  }
	 
}
