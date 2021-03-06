package com.theundertaker11.geneticsreborn.packets;

import com.theundertaker11.geneticsreborn.packets.ClientGeneChange.Handler3;
import com.theundertaker11.geneticsreborn.packets.GuiMessage.GuiMessageHandler;
import com.theundertaker11.geneticsreborn.packets.SendShootDragonBreath.Handler2;
import com.theundertaker11.geneticsreborn.packets.SendTeleportPlayer.Handler;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class GeneticsRebornPacketHandler {

	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("GeneticsReborn");

	public static void init(Side side) {
		INSTANCE.registerMessage(Handler.class, SendTeleportPlayer.class, 0, Side.SERVER);
		INSTANCE.registerMessage(Handler2.class, SendShootDragonBreath.class, 1, Side.SERVER);
		INSTANCE.registerMessage(Handler3.class, ClientGeneChange.class, 3, Side.CLIENT);
		INSTANCE.registerMessage(GuiMessageHandler.class, GuiMessage.class, 4, Side.SERVER);
	}
}
