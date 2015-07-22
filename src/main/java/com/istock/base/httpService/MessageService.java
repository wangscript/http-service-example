package com.istock.base.httpService;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.istock.base.httpService.model.MessageInfo;

@Path("message")
public interface MessageService {

	public int sendMessage(MessageInfo message);
	
	@Consumes("application/json;charset=utf-8")
	public int sendMessage2(MessageInfo message);
	
	@Consumes("application/json;charset=utf-8")
	public int sendMessage3(MessageInfo message,@QueryParam("name")String name);
	
	public List<MessageInfo> queryMessage();
	
	public int testList(@QueryParam("list") String[] list);
}
