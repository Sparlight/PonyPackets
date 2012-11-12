package me.corriekay.packets.client;

import me.corriekay.packets.PoniPacket;

public class ClientHoofshake implements PoniPacket{
	public String name;
	public byte[] pw;
	public boolean requestData;
}
