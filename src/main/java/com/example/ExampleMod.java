package com.example;

// fabric mod 基础初始化包
import net.fabricmc.api.ModInitializer;

// java 日志功能包
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Fabric 物品设置
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
// Minecraft 物品功能
import net.minecraft.item.Item;
// Minecraft 注册表
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
// Minecraft 命名空间
import net.minecraft.util.Identifier;

// Mod 入口
public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

    // 新物品的实例
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());

	// Minecraft 加载期执行
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		
		// 注册物品
        Registry.register(Registries.ITEM, new Identifier("tutorial", "custom_item"), CUSTOM_ITEM);
	}
}