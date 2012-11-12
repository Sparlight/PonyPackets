package me.corriekay.packets.server;

import java.util.LinkedHashMap;

import me.corriekay.packets.PoniPacket;

public class PlayerInfoResponsePacket implements PoniPacket{

	public boolean configExists;
	public String playername;
	public LinkedHashMap<String, String> playerInfo = new LinkedHashMap<String, String>();
}
