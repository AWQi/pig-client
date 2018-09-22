package com.pig.client.websocket;

public class ZigbeeDate {
public String address;
public String type;
public float df;
public int  di;
public ZigbeeDate(String address, String type, float df, int di) {
	super();
	this.address = address;
	this.type = type;
	this.df = df;
	this.di = di;
}

	@Override
	public String toString() {
		return "ZigbeeDate{" +
				"address='" + address + '\'' +
				", type='" + type + '\'' +
				", df=" + df +
				", di=" + di +
				'}';
	}
}
