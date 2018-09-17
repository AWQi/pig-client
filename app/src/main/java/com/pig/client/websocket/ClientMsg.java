package com.pig.client.websocket;

public class ClientMsg {
public String eventType = "online";
public String msg = "";
public String getEventType() {
	return eventType;
}
public void setEventType(String eventType) {
	this.eventType = eventType;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}

}
