package com.pig.client.websocket;

public class ClientMsg {
static public final String   EVENT_ONLINE = "online";
static public final String   EVENT_RFID = "rfid";
static public final String   EVENT_ZIGBEE = "zigbee";
//	rfid
// 	
public String eventType = "online";
public String msg = "";
public int no  = 0;

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
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}

}
