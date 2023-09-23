package pers.errorpower;


// fabric mod 基础初始化包
import net.fabricmc.api.ModInitializer;

// Fabric 物品设置
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
// Minecraft 物品功能
import net.minecraft.item.Item;
// Minecraft 注册表功能
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
// Minecraft 标识符
import net.minecraft.util.Identifier;


// Mod 入口 Initializer，
// 必须要实现 ModInitializer、ClientInitializer 和 ServerInitializer 这三个接口中的一个
// 并且需要将该类写入 fabric.mod.json: entrypoints 的 main、client、server
public class Initializer__tutorial_add_item implements ModInitializer {
    // 新物品的实例
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());

    // Minecraft 加载期执行
    @Override
    public void onInitialize() {
        // 注册物品
        Registry.register(Registries.ITEM, new Identifier("tutorial", "custom_item"), CUSTOM_ITEM);
    }
}
