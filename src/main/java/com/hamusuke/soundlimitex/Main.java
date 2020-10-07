package com.hamusuke.soundlimitex;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import paulscode.sound.SoundSystemConfig;

@Mod(modid = "soundlimitex", version = "1.0", name = "SoundLimitExtends")
public class Main {
	@EventHandler
	public void func_234012_a_(FMLPreInitializationEvent p_i182911_1_) {
		SoundSystemConfig.setNumberNormalChannels(1024);
		SoundSystemConfig.setNumberStreamingChannels(32);
	}
}
