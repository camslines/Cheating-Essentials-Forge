package com.kodehawa.module.classes;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.network.packet.Packet13PlayerLookMove;

import org.lwjgl.input.Keyboard;

import com.kodehawa.CheatingEssentials;
import com.kodehawa.module.ModuleBase;
import com.kodehawa.module.annotations.ModuleLoader;
import com.kodehawa.module.enums.EnumGuiCategory;

public class Fly extends ModuleBase {

	@ModuleLoader(type = "Module")
	public Fly( ) {
		super("Fly", "Fly like a bird!", "1.6.2", Keyboard.KEY_R,
				EnumGuiCategory.PLAYER, true);
        super.setTick(true);
	}


	@Override
    public void onEnableModule(){
		CheatingEssentials.getMinecraftInstance().thePlayer.capabilities.isFlying = true;
	}
	
	@Override
	public void onDisableModule(){
		CheatingEssentials.getMinecraftInstance().thePlayer.capabilities.isFlying = false;
	}
	
	@Override
	public void tick() {
		  if(getMinecraft().theWorld != null ){
		if(!CheatingEssentials.getMinecraftInstance().thePlayer.capabilities.isFlying){
			CheatingEssentials.getMinecraftInstance().thePlayer.capabilities.isFlying = true;
		}
		
	    EntityClientPlayerMP ep = CheatingEssentials.getCheatingEssentials().getMinecraftInstance().thePlayer;
        ep.sendQueue.addToSendQueue(new Packet13PlayerLookMove(ep.motionX, -999.0D, -999.0D, ep.motionZ,
                ep.rotationYaw, ep.rotationPitch, !ep.onGround));
	}
	}

}