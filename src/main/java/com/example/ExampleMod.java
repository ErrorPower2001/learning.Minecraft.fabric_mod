package com.example;

// fabric mod 基础初始化包
import net.fabricmc.api.ModInitializer;

// java 日志功能包
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Mod 入口 Initializer，
// 必须要实现 ModInitializer、ClientInitializer 和 ServerInitializer 这三个接口中的一个
public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}