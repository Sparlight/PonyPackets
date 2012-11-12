package me.corriekay.packets.server;

import java.util.ArrayList;
import java.util.HashMap;

import me.corriekay.packets.PoniPacket;

public class SendAlerts implements PoniPacket{

	public ArrayList<Integer> ids = new ArrayList<Integer>();
	public HashMap<Integer,String> whosents = new HashMap<Integer,String>();
	public HashMap<Integer,Long> timestamps = new HashMap<Integer,Long>();
	public HashMap<Integer,String> responders = new HashMap<Integer,String>();
	
}
