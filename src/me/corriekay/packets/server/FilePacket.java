package me.corriekay.packets.server;

import me.corriekay.packets.PoniPacket;

public class FilePacket implements PoniPacket {
	public byte[] bytes;
	public String directory;
	public String name;
}
