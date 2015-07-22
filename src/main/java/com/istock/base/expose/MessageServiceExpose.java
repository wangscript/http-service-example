package com.istock.base.expose;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.istock.base.httpService.MessageService;
import com.istock.base.httpService.model.MessageInfo;
import com.istock.base.httpService.model.TypeEnum;

@Controller
@RequestMapping("message")
public class MessageServiceExpose implements MessageService {

	
	@RequestMapping("sendMessage")
	public @ResponseBody int sendMessage(MessageInfo message) {
		return 1;
	}

	@RequestMapping("queryMessage")
	public @ResponseBody List<MessageInfo> queryMessage() {
		List<MessageInfo> result = new ArrayList<MessageInfo>();
		MessageInfo m1 = new MessageInfo();
		m1.setContent("this is m1");
		m1.setId(1);
		m1.setReceiver("来点中文1");
		m1.setSender("就是要中文2");
		m1.setType(TypeEnum.SUCCESS);
		result.add(m1);
		
		MessageInfo m2 = new MessageInfo();
		m2.setContent("this is m2");
		m2.setId(2);
		m2.setReceiver("senvon s2");
		m2.setSender("senvon r2");
		m2.setType(TypeEnum.FAIL);
		result.add(m2);
		
		MessageInfo m3 = new MessageInfo();
		m3.setContent("this is m3");
		m3.setId(3);
		m3.setReceiver("senvon s3");
		m3.setSender("senvon r3");
		m3.setType(TypeEnum.SUCCESS);
		result.add(m3);
		
		MessageInfo m4 = new MessageInfo();
		m4.setContent("this is m4");
		m4.setId(4);
		m4.setReceiver("senvon s4");
		m4.setSender("senvon r4");
		m4.setType(TypeEnum.SUCCESS);
		result.add(m4);
		return result;
	}

	@RequestMapping("sendMessage2")
	public @ResponseBody int sendMessage2(@RequestBody MessageInfo message) {
		System.out.println(message.getType());
		return 2;
	}

	@RequestMapping("sendMessage3")
	public @ResponseBody int sendMessage3(@RequestBody MessageInfo message, @RequestParam String name) {
		// TODO Auto-generated method stub
		System.out.println("====================="+name);
		return 3;
	}

	@RequestMapping("testList")
	public @ResponseBody int testList(String[] list) {
		System.out.println(ToStringBuilder.reflectionToString(list));
		return 1;
	}

}
