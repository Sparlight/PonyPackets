package me.corriekay.packets.client;

import me.corriekay.packets.PoniPacket;

public class FileRequestPacket implements PoniPacket {

	public String fileDirectory;
	public String fileName;
	public String clientDirectory;
}
