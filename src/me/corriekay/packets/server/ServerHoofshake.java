package me.corriekay.packets.server;

import me.corriekay.packets.PoniPacket;

public class ServerHoofshake  implements PoniPacket{
	String msg = "HELLO? IS THIS PONY?";
	public String ver;
	public byte[] pubMod, pubExp;
}
