# 执行
#	执行实体	玩家
#	执行位置	执行实体
#	运行
#		执行
#			执行实体	实体[类型：物品，距离执行位置：小于等于 32，标签={}]
#			执行位置	执行实体
#			运行
#				数据	修改
#					实体	执行实体
#						发光	设置	值	True
execute as @a at @s run execute as @e[type=minecraft:item, distance=..32, nbt={}] at @s run data modify entity @s Glowing set value true
# 执行
#	执行实体	玩家
#	执行位置	执行实体
#	运行
#		执行
#			执行实体	实体[类型：物品，距离执行位置：大于等于 32，标签={发光：True}]
#			执行位置	执行实体
#			运行
#				数据	修改
#					实体	执行实体
#						发光	设置	值	False
execute as @a at @s run execute as @e[type=minecraft:item, distance=32.., nbt={Glowing:true}] at @s run data modify entity @s Glowing set value false