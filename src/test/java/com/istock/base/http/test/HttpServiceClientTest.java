package com.istock.base.http.test;

import org.junit.Test;

public class HttpServiceClientTest {

	@Test
	public void test1() throws Exception{
		/*MessageService messageService = HttpServiceClient.createClient(MessageService.class, "http://localhost:8081/sampleService", null, false, null, null, null);
		
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
		Assert.assertTrue(a == 1);*/
	}
}
