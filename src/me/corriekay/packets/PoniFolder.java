package me.corriekay.packets;

public class PoniFolder implements PoniPacket {

	public String name;
	public String directory;
	public PoniFolder[] subfolders;
	public PoniFile[] files;
	
	public String toString(){
		return name;
	}
}
