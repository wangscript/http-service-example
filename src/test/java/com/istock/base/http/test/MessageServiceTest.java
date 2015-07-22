package com.istock.base.http.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import com.istock.base.httpService.MessageService;
import com.istock.base.httpService.model.MessageInfo;
import com.istock.base.httpService.model.TypeEnum;

@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-http-test.xml"})
public class MessageServiceTest {

	@Resource(name="messageService3")
	private MessageService messageService;
	
	@Test
	public void test1() throws Exception{
		List<MessageInfo> messageList = messageService.queryMessage();
		Assert.assertTrue(messageList != null);
		Assert.assertTrue(messageList.size() == 4);
		
		MessageInfo message = new MessageInfo();
		message.setContent("senvon");
		message.setId(1);
		message.setReceiver("aaa");
		message.setSender("bbb");
		message.setType(TypeEnum.FAIL);
		int i = messageService.sendMessage(message);
		Assert.assertTrue(i ==1);
		int n = messageService.sendMessage2(message);
		Assert.assertTrue(n == 2);
		
		int j = messageService.sendMessage3(message,"senvon");
		Assert.assertTrue(j == 3);
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		int a = messageService.testList(new String[]{"1","2"});
		Assert.assertTrue(a == 1);
	}
}
