package com.mod.sunwhy.Overlay;

import cpw.mods.fml.relauncher.Side;

public @interface EventBusSubscriber {

	String modid();

	Side[] value();

}
