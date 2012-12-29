package me.corriekay.packets;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import me.corriekay.packets.client.ClientChatPacket;
import me.corriekay.packets.client.ClientHoofshake;
import me.corriekay.packets.client.DirectoryRequestPacket;
import me.corriekay.packets.client.FileRequestPacket;
import me.corriekay.packets.client.OPonyResponsePacket;
import me.corriekay.packets.client.PlayerInfoPacket;
import me.corriekay.packets.server.AssassinateClient;
import me.corriekay.packets.server.BroadcastMessage;
import me.corriekay.packets.server.ChanNamesPacket;
import me.corriekay.packets.server.ChatPacket;
import me.corriekay.packets.server.DirectoryResponsePacket;
import me.corriekay.packets.server.FilePacket;
import me.corriekay.packets.server.OPonyAlertPacket;
import me.corriekay.packets.server.PlayerInfoResponsePacket;
import me.corriekay.packets.server.PonyList;
import me.corriekay.packets.server.SendAlerts;
import me.corriekay.packets.server.ServerHoofshake;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Server;

public class PacketUtils {

	public static String version = "1.6";
	
	public static void registerServerPackets(Server s){
		registerClasses(s.getKryo());
	}
	public static void registerClientPackets(Client c){
		registerClasses(c.getKryo());
	}
	private static void registerClasses(Kryo k){
		HashMap<String,String> derp1 = new HashMap<String,String>();
		ArrayList<Integer> derp2 = new ArrayList<Integer>();
		HashMap<Integer,String> derp3 = new HashMap<Integer,String>();
		HashMap<Integer,Long> derp4 = new HashMap<Integer,Long>();
		LinkedHashMap<String,String> derp5 = new LinkedHashMap<String,String>();
		PoniFile[] file = new PoniFile[1];
		PoniFolder[] folder = new PoniFolder[1];
		byte[] bytes = new byte[1];
		k.register(derp1.getClass());
		k.register(derp2.getClass());
		k.register(derp3.getClass());
		k.register(derp4.getClass());
		k.register(derp5.getClass());
		k.register(String[].class);
		k.register(byte[].class);
		k.register(PoniPacket.class);
		k.register(ClientHoofshake.class);
		k.register(ClientChatPacket.class);
		k.register(ServerHoofshake.class);
		k.register(PonyList.class);
		k.register(ChanNamesPacket.class);
		k.register(ChatPacket.class);
		k.register(OPonyAlertPacket.class);
		k.register(OPonyResponsePacket.class);
		k.register(Key.class);
		k.register(AssassinateClient.class);
		k.register(SendAlerts.class);
		k.register(PlayerInfoPacket.class);
		k.register(PlayerInfoResponsePacket.class);
		k.register(BroadcastMessage.class);
		k.register(PoniFile.class);
		k.register(PoniFolder.class);
		k.register(FileRequestPacket.class);
		k.register(FilePacket.class);
		k.register(DirectoryRequestPacket.class);
		k.register(DirectoryResponsePacket.class);
		k.register(file.getClass());
		k.register(folder.getClass());
		k.register(bytes.getClass());
	}
	public static byte[] rsaEncrypt(byte[] data,Key publicKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException
    {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] cipherData = cipher.doFinal(data);
            return cipherData;
    }
   
    public static byte[] rsaDecrypt(byte[] data, Key privateKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException
    {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] cipherData = cipher.doFinal(data);
            return cipherData;
    }
   
    public static KeyPair keyPairGen() throws NoSuchAlgorithmException, NoSuchPaddingException
    {
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
            kpg.initialize(2048);
            KeyPair kp = kpg.genKeyPair();
            return kp;
    }
}
