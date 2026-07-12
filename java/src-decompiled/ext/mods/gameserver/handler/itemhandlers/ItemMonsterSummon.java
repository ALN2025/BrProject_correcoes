// Bytecode for: ext.mods.gameserver.handler.itemhandlers.ItemMonsterSummon
// File: ext\mods\gameserver\handler\itemhandlers\ItemMonsterSummon.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon.class
  Last modified 9 de jul de 2026; size 10271 bytes
  MD5 checksum 2e9375ccb2593d04a46fcfa47c3d2e9a
  Compiled from "ItemMonsterSummon.java"
public class ext.mods.gameserver.handler.itemhandlers.ItemMonsterSummon implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #208                        // ext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #10.#11       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #10 = Class              #12           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #11 = NameAndType        #13:#14       // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #12 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #13 = Utf8               getInstance
   #14 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #15 = Methodref          #10.#16       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
   #16 = NameAndType        #17:#18       // isStarted:()Z
   #17 = Utf8               isStarted
   #18 = Utf8               ()Z
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/actor/Playable.getObjectId:()I
   #20 = Class              #22           // ext/mods/gameserver/model/actor/Playable
   #21 = NameAndType        #23:#24       // getObjectId:()I
   #22 = Utf8               ext/mods/gameserver/model/actor/Playable
   #23 = Utf8               getObjectId
   #24 = Utf8               ()I
   #25 = Methodref          #10.#26       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onItemSummon:(I)Z
   #26 = NameAndType        #27:#28       // onItemSummon:(I)Z
   #27 = Utf8               onItemSummon
   #28 = Utf8               (I)Z
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #30 = Class              #32           // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #31 = NameAndType        #13:#33       // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #32 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #33 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #34 = Methodref          #30.#16       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
   #35 = Methodref          #30.#26       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onItemSummon:(I)Z
   #36 = Methodref          #37.#38       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #37 = Class              #39           // ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #38 = NameAndType        #13:#40       // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #39 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #40 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #41 = Methodref          #37.#16       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
   #42 = Methodref          #37.#26       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onItemSummon:(I)Z
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #44 = Class              #46           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #45 = NameAndType        #13:#47       // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #46 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #47 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #48 = Methodref          #44.#16       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
   #49 = Methodref          #44.#26       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onItemSummon:(I)Z
   #50 = String             #51           // You cannot use this item during PvP events.
   #51 = Utf8               You cannot use this item during PvP events.
   #52 = Methodref          #7.#53        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #53 = NameAndType        #54:#55       // sendMessage:(Ljava/lang/String;)V
   #54 = Utf8               sendMessage
   #55 = Utf8               (Ljava/lang/String;)V
   #56 = Methodref          #7.#57        // ext/mods/gameserver/model/actor/Player.isSitting:()Z
   #57 = NameAndType        #58:#18       // isSitting:()Z
   #58 = Utf8               isSitting
   #59 = Fieldref           #60.#61       // ext/mods/gameserver/network/SystemMessageId.CANT_MOVE_SITTING:Lext/mods/gameserver/network/SystemMessageId;
   #60 = Class              #62           // ext/mods/gameserver/network/SystemMessageId
   #61 = NameAndType        #63:#64       // CANT_MOVE_SITTING:Lext/mods/gameserver/network/SystemMessageId;
   #62 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #63 = Utf8               CANT_MOVE_SITTING
   #64 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #65 = Methodref          #7.#66        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #66 = NameAndType        #67:#68       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #67 = Utf8               sendPacket
   #68 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #69 = Methodref          #7.#70        // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
   #70 = NameAndType        #71:#18       // isInObserverMode:()Z
   #71 = Utf8               isInObserverMode
   #72 = String             #73           // You cannot use this item in observer mode.
   #73 = Utf8               You cannot use this item in observer mode.
   #74 = Methodref          #7.#75        // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #75 = NameAndType        #76:#18       // isInOlympiadMode:()Z
   #76 = Utf8               isInOlympiadMode
   #77 = String             #78           // This item cannot be used in Olympiad.
   #78 = Utf8               This item cannot be used in Olympiad.
   #79 = Methodref          #7.#80        // ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
   #80 = NameAndType        #81:#82       // getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
   #81 = Utf8               getAttack
   #82 = Utf8               ()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/actor/attack/PlayerAttack.isAttackingNow:()Z
   #84 = Class              #86           // ext/mods/gameserver/model/actor/attack/PlayerAttack
   #85 = NameAndType        #87:#18       // isAttackingNow:()Z
   #86 = Utf8               ext/mods/gameserver/model/actor/attack/PlayerAttack
   #87 = Utf8               isAttackingNow
   #88 = Methodref          #7.#89        // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
   #89 = NameAndType        #90:#18       // isInCombat:()Z
   #90 = Utf8               isInCombat
   #91 = Fieldref           #60.#92       // ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_SUMMON_IN_COMBAT:Lext/mods/gameserver/network/SystemMessageId;
   #92 = NameAndType        #93:#64       // YOU_CANNOT_SUMMON_IN_COMBAT:Lext/mods/gameserver/network/SystemMessageId;
   #93 = Utf8               YOU_CANNOT_SUMMON_IN_COMBAT
   #94 = Methodref          #7.#95        // ext/mods/gameserver/model/actor/Player.isInBoat:()Z
   #95 = NameAndType        #96:#18       // isInBoat:()Z
   #96 = Utf8               isInBoat
   #97 = String             #98           // You cannot use this item while in a boat.
   #98 = Utf8               You cannot use this item while in a boat.
   #99 = Methodref          #100.#101     // ext/mods/InstanceMap/InstanceManager.getInstance:()Lext/mods/InstanceMap/InstanceManager;
  #100 = Class              #102          // ext/mods/InstanceMap/InstanceManager
  #101 = NameAndType        #13:#103      // getInstance:()Lext/mods/InstanceMap/InstanceManager;
  #102 = Utf8               ext/mods/InstanceMap/InstanceManager
  #103 = Utf8               ()Lext/mods/InstanceMap/InstanceManager;
  #104 = Methodref          #7.#21        // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #105 = Methodref          #100.#106     // ext/mods/InstanceMap/InstanceManager.getInstance:(I)Lext/mods/InstanceMap/MapInstance;
  #106 = NameAndType        #13:#107      // getInstance:(I)Lext/mods/InstanceMap/MapInstance;
  #107 = Utf8               (I)Lext/mods/InstanceMap/MapInstance;
  #108 = String             #109          // You cannot use this item inside instances.
  #109 = Utf8               You cannot use this item inside instances.
  #110 = Methodref          #111.#112     // ext/mods/summonmobitem/SummonMobItemData.getInstance:()Lext/mods/summonmobitem/SummonMobItemData;
  #111 = Class              #113          // ext/mods/summonmobitem/SummonMobItemData
  #112 = NameAndType        #13:#114      // getInstance:()Lext/mods/summonmobitem/SummonMobItemData;
  #113 = Utf8               ext/mods/summonmobitem/SummonMobItemData
  #114 = Utf8               ()Lext/mods/summonmobitem/SummonMobItemData;
  #115 = Methodref          #116.#117     // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #116 = Class              #118          // ext/mods/gameserver/model/item/instance/ItemInstance
  #117 = NameAndType        #119:#24      // getItemId:()I
  #118 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #119 = Utf8               getItemId
  #120 = Methodref          #111.#121     // ext/mods/summonmobitem/SummonMobItemData.getSummonItem:(I)Lext/mods/summonmobitem/SummonMobItemHolder;
  #121 = NameAndType        #122:#123     // getSummonItem:(I)Lext/mods/summonmobitem/SummonMobItemHolder;
  #122 = Utf8               getSummonItem
  #123 = Utf8               (I)Lext/mods/summonmobitem/SummonMobItemHolder;
  #124 = String             #125          // This item is not configured for monster summoning.
  #125 = Utf8               This item is not configured for monster summoning.
  #126 = Methodref          #127.#128     // ext/mods/summonmobitem/SummonMobItemHolder.isEnabled:()Z
  #127 = Class              #129          // ext/mods/summonmobitem/SummonMobItemHolder
  #128 = NameAndType        #130:#18      // isEnabled:()Z
  #129 = Utf8               ext/mods/summonmobitem/SummonMobItemHolder
  #130 = Utf8               isEnabled
  #131 = String             #132          // This summon item is currently disabled.
  #132 = Utf8               This summon item is currently disabled.
  #133 = Methodref          #111.#134     // ext/mods/summonmobitem/SummonMobItemData.canPlayerUseItem:(II)Z
  #134 = NameAndType        #135:#136     // canPlayerUseItem:(II)Z
  #135 = Utf8               canPlayerUseItem
  #136 = Utf8               (II)Z
  #137 = Methodref          #111.#138     // ext/mods/summonmobitem/SummonMobItemData.getRemainingCooldown:(II)I
  #138 = NameAndType        #139:#140     // getRemainingCooldown:(II)I
  #139 = Utf8               getRemainingCooldown
  #140 = Utf8               (II)I
  #141 = InvokeDynamic      #0:#142       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #142 = NameAndType        #143:#144     // makeConcatWithConstants:(I)Ljava/lang/String;
  #143 = Utf8               makeConcatWithConstants
  #144 = Utf8               (I)Ljava/lang/String;
  #145 = Methodref          #111.#146     // ext/mods/summonmobitem/SummonMobItemData.getRemainingDailyUses:(II)I
  #146 = NameAndType        #147:#140     // getRemainingDailyUses:(II)I
  #147 = Utf8               getRemainingDailyUses
  #148 = String             #149          // You have reached the daily limit for this summon item.
  #149 = Utf8               You have reached the daily limit for this summon item.
  #150 = String             #151          // You cannot use this item at the moment.
  #151 = Utf8               You cannot use this item at the moment.
  #152 = Methodref          #7.#153       // ext/mods/gameserver/model/actor/Player.getBaseClass:()I
  #153 = NameAndType        #154:#24      // getBaseClass:()I
  #154 = Utf8               getBaseClass
  #155 = Methodref          #156.#157     // java/lang/String.valueOf:(I)Ljava/lang/String;
  #156 = Class              #158          // java/lang/String
  #157 = NameAndType        #159:#144     // valueOf:(I)Ljava/lang/String;
  #158 = Utf8               java/lang/String
  #159 = Utf8               valueOf
  #160 = Methodref          #127.#161     // ext/mods/summonmobitem/SummonMobItemHolder.canUseByClass:(Ljava/lang/String;)Z
  #161 = NameAndType        #162:#163     // canUseByClass:(Ljava/lang/String;)Z
  #162 = Utf8               canUseByClass
  #163 = Utf8               (Ljava/lang/String;)Z
  #164 = String             #165          // Your class cannot use this summon item.
  #165 = Utf8               Your class cannot use this summon item.
  #166 = Methodref          #127.#167     // ext/mods/summonmobitem/SummonMobItemHolder.getMonsterId:()I
  #167 = NameAndType        #168:#24      // getMonsterId:()I
  #168 = Utf8               getMonsterId
  #169 = Methodref          #170.#171     // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #170 = Class              #172          // ext/mods/gameserver/data/xml/NpcData
  #171 = NameAndType        #13:#173      // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #172 = Utf8               ext/mods/gameserver/data/xml/NpcData
  #173 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
  #174 = Methodref          #170.#175     // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #175 = NameAndType        #176:#177     // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #176 = Utf8               getTemplate
  #177 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #178 = String             #179          // Monster template not found.
  #179 = Utf8               Monster template not found.
  #180 = String             #181          // Monster
  #181 = Utf8               Monster
  #182 = Methodref          #183.#184     // ext/mods/gameserver/model/actor/template/NpcTemplate.isType:(Ljava/lang/String;)Z
  #183 = Class              #185          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #184 = NameAndType        #186:#163     // isType:(Ljava/lang/String;)Z
  #185 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #186 = Utf8               isType
  #187 = String             #188          // RaidBoss
  #188 = Utf8               RaidBoss
  #189 = String             #190          // GrandBoss
  #190 = Utf8               GrandBoss
  #191 = String             #192          // This item can only summon monsters.
  #192 = Utf8               This item can only summon monsters.
  #193 = Methodref          #183.#194     // ext/mods/gameserver/model/actor/template/NpcTemplate.isNoRespawn:()Z
  #194 = NameAndType        #195:#18      // isNoRespawn:()Z
  #195 = Utf8               isNoRespawn
  #196 = String             #197          // This monster template is not configured for single spawn.
  #197 = Utf8               This monster template is not configured for single spawn.
  #198 = Methodref          #7.#199       // ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #199 = NameAndType        #200:#201     // getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #200 = Utf8               getMove
  #201 = Utf8               ()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #202 = Methodref          #203.#204     // ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
  #203 = Class              #205          // ext/mods/gameserver/model/actor/move/PlayerMove
  #204 = NameAndType        #206:#6       // stop:()V
  #205 = Utf8               ext/mods/gameserver/model/actor/move/PlayerMove
  #206 = Utf8               stop
  #207 = Methodref          #208.#209     // ext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon.executeSummonAnimation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/summonmobitem/SummonMobItemHolder;)V
  #208 = Class              #210          // ext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon
  #209 = NameAndType        #211:#212     // executeSummonAnimation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/summonmobitem/SummonMobItemHolder;)V
  #210 = Utf8               ext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon
  #211 = Utf8               executeSummonAnimation
  #212 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/summonmobitem/SummonMobItemHolder;)V
  #213 = InvokeDynamic      #1:#214       // #1:run:(Lext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/summonmobitem/SummonMobItemHolder;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Ljava/lang/Runnable;
  #214 = NameAndType        #215:#216     // run:(Lext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/summonmobitem/SummonMobItemHolder;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Ljava/lang/Runnable;
  #215 = Utf8               run
  #216 = Utf8               (Lext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/summonmobitem/SummonMobItemHolder;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Ljava/lang/Runnable;
  #217 = Long               15000l
  #219 = Methodref          #220.#221     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #220 = Class              #222          // ext/mods/commons/pool/ThreadPool
  #221 = NameAndType        #223:#224     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #222 = Utf8               ext/mods/commons/pool/ThreadPool
  #223 = Utf8               schedule
  #224 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #225 = Class              #226          // ext/mods/gameserver/network/serverpackets/SetupGauge
  #226 = Utf8               ext/mods/gameserver/network/serverpackets/SetupGauge
  #227 = Fieldref           #228.#229     // ext/mods/gameserver/enums/GaugeColor.BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #228 = Class              #230          // ext/mods/gameserver/enums/GaugeColor
  #229 = NameAndType        #231:#232     // BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #230 = Utf8               ext/mods/gameserver/enums/GaugeColor
  #231 = Utf8               BLUE
  #232 = Utf8               Lext/mods/gameserver/enums/GaugeColor;
  #233 = Methodref          #225.#234     // ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #234 = NameAndType        #5:#235       // "<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #235 = Utf8               (Lext/mods/gameserver/enums/GaugeColor;I)V
  #236 = Methodref          #7.#237       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #237 = NameAndType        #67:#238      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #238 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #239 = Class              #240          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #240 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #241 = Methodref          #239.#242     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
  #242 = NameAndType        #5:#243       // "<init>":(Lext/mods/gameserver/model/actor/Creature;IIII)V
  #243 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIII)V
  #244 = Methodref          #7.#245       // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #245 = NameAndType        #246:#238     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #246 = Utf8               broadcastPacket
  #247 = Methodref          #127.#248     // ext/mods/summonmobitem/SummonMobItemHolder.getMonsterName:()Ljava/lang/String;
  #248 = NameAndType        #249:#250     // getMonsterName:()Ljava/lang/String;
  #249 = Utf8               getMonsterName
  #250 = Utf8               ()Ljava/lang/String;
  #251 = InvokeDynamic      #2:#252       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #252 = NameAndType        #143:#253     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #253 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #254 = Methodref          #7.#255       // ext/mods/gameserver/model/actor/Player.getHeading:()I
  #255 = NameAndType        #256:#24      // getHeading:()I
  #256 = Utf8               getHeading
  #257 = Double             182.044444444d
  #259 = Methodref          #260.#261     // java/lang/Math.toRadians:(D)D
  #260 = Class              #262          // java/lang/Math
  #261 = NameAndType        #263:#264     // toRadians:(D)D
  #262 = Utf8               java/lang/Math
  #263 = Utf8               toRadians
  #264 = Utf8               (D)D
  #265 = Methodref          #7.#266       // ext/mods/gameserver/model/actor/Player.getX:()I
  #266 = NameAndType        #267:#24      // getX:()I
  #267 = Utf8               getX
  #268 = Double             400.0d
  #270 = Methodref          #260.#271     // java/lang/Math.cos:(D)D
  #271 = NameAndType        #272:#264     // cos:(D)D
  #272 = Utf8               cos
  #273 = Methodref          #7.#274       // ext/mods/gameserver/model/actor/Player.getY:()I
  #274 = NameAndType        #275:#24      // getY:()I
  #275 = Utf8               getY
  #276 = Methodref          #260.#277     // java/lang/Math.sin:(D)D
  #277 = NameAndType        #278:#264     // sin:(D)D
  #278 = Utf8               sin
  #279 = Methodref          #7.#280       // ext/mods/gameserver/model/actor/Player.getZ:()I
  #280 = NameAndType        #281:#24      // getZ:()I
  #281 = Utf8               getZ
  #282 = Class              #283          // ext/mods/gameserver/model/spawn/Spawn
  #283 = Utf8               ext/mods/gameserver/model/spawn/Spawn
  #284 = Methodref          #282.#285     // ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;Z)V
  #285 = NameAndType        #5:#286       // "<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;Z)V
  #286 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;Z)V
  #287 = Methodref          #282.#288     // ext/mods/gameserver/model/spawn/Spawn.setLoc:(IIII)V
  #288 = NameAndType        #289:#290     // setLoc:(IIII)V
  #289 = Utf8               setLoc
  #290 = Utf8               (IIII)V
  #291 = Methodref          #282.#292     // ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #292 = NameAndType        #293:#294     // doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #293 = Utf8               doSpawn
  #294 = Utf8               (Z)Lext/mods/gameserver/model/actor/Npc;
  #295 = Methodref          #296.#297     // ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #296 = Class              #298          // ext/mods/gameserver/model/actor/Npc
  #297 = NameAndType        #299:#300     // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #298 = Utf8               ext/mods/gameserver/model/actor/Npc
  #299 = Utf8               getAI
  #300 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #301 = Methodref          #302.#303     // ext/mods/gameserver/model/actor/ai/type/NpcAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #302 = Class              #304          // ext/mods/gameserver/model/actor/ai/type/NpcAI
  #303 = NameAndType        #305:#306     // getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #304 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
  #305 = Utf8               getAggroList
  #306 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #307 = Double             999999.0d
  #309 = Methodref          #310.#311     // ext/mods/gameserver/model/actor/container/attackable/AggroList.addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
  #310 = Class              #312          // ext/mods/gameserver/model/actor/container/attackable/AggroList
  #311 = NameAndType        #313:#314     // addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
  #312 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
  #313 = Utf8               addDamageHate
  #314 = Utf8               (Lext/mods/gameserver/model/actor/Creature;DD)V
  #315 = Methodref          #296.#316     // ext/mods/gameserver/model/actor/Npc.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #316 = NameAndType        #317:#318     // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #317 = Utf8               setTarget
  #318 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #319 = Methodref          #296.#320     // ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
  #320 = NameAndType        #321:#250     // getName:()Ljava/lang/String;
  #321 = Utf8               getName
  #322 = InvokeDynamic      #3:#252       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #323 = Methodref          #7.#324       // ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
  #324 = NameAndType        #325:#326     // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
  #325 = Utf8               destroyItem
  #326 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
  #327 = String             #328          // Failed to consume the summon item.
  #328 = Utf8               Failed to consume the summon item.
  #329 = Methodref          #296.#330     // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #330 = NameAndType        #331:#6       // deleteMe:()V
  #331 = Utf8               deleteMe
  #332 = Methodref          #111.#333     // ext/mods/summonmobitem/SummonMobItemData.registerItemUse:(II)V
  #333 = NameAndType        #334:#335     // registerItemUse:(II)V
  #334 = Utf8               registerItemUse
  #335 = Utf8               (II)V
  #336 = Methodref          #127.#337     // ext/mods/summonmobitem/SummonMobItemHolder.getMaxUsesPerDay:()I
  #337 = NameAndType        #338:#24      // getMaxUsesPerDay:()I
  #338 = Utf8               getMaxUsesPerDay
  #339 = InvokeDynamic      #4:#142       // #4:makeConcatWithConstants:(I)Ljava/lang/String;
  #340 = Methodref          #127.#341     // ext/mods/summonmobitem/SummonMobItemHolder.getCooldownMinutes:()I
  #341 = NameAndType        #342:#24      // getCooldownMinutes:()I
  #342 = Utf8               getCooldownMinutes
  #343 = InvokeDynamic      #5:#142       // #5:makeConcatWithConstants:(I)Ljava/lang/String;
  #344 = String             #345          // Failed to summon the monster.
  #345 = Utf8               Failed to summon the monster.
  #346 = Class              #347          // java/lang/Exception
  #347 = Utf8               java/lang/Exception
  #348 = String             #349          // An error occurred while summoning the monster.
  #349 = Utf8               An error occurred while summoning the monster.
  #350 = Fieldref           #351.#352     // java/lang/System.err:Ljava/io/PrintStream;
  #351 = Class              #353          // java/lang/System
  #352 = NameAndType        #354:#355     // err:Ljava/io/PrintStream;
  #353 = Utf8               java/lang/System
  #354 = Utf8               err
  #355 = Utf8               Ljava/io/PrintStream;
  #356 = Methodref          #346.#357     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #357 = NameAndType        #358:#250     // getMessage:()Ljava/lang/String;
  #358 = Utf8               getMessage
  #359 = InvokeDynamic      #6:#252       // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #360 = Methodref          #361.#362     // java/io/PrintStream.println:(Ljava/lang/String;)V
  #361 = Class              #363          // java/io/PrintStream
  #362 = NameAndType        #364:#55      // println:(Ljava/lang/String;)V
  #363 = Utf8               java/io/PrintStream
  #364 = Utf8               println
  #365 = Methodref          #346.#366     // java/lang/Exception.printStackTrace:()V
  #366 = NameAndType        #367:#6       // printStackTrace:()V
  #367 = Utf8               printStackTrace
  #368 = Methodref          #208.#369     // ext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon.performMonsterSpawn:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/summonmobitem/SummonMobItemHolder;Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #369 = NameAndType        #370:#371     // performMonsterSpawn:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/summonmobitem/SummonMobItemHolder;Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #370 = Utf8               performMonsterSpawn
  #371 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/summonmobitem/SummonMobItemHolder;Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #372 = InvokeDynamic      #7:#252       // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #373 = Class              #374          // ext/mods/gameserver/handler/IItemHandler
  #374 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #375 = Utf8               Code
  #376 = Utf8               LineNumberTable
  #377 = Utf8               LocalVariableTable
  #378 = Utf8               this
  #379 = Utf8               Lext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon;
  #380 = Utf8               useItem
  #381 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #382 = Utf8               player
  #383 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #384 = Utf8               remainingCooldown
  #385 = Utf8               I
  #386 = Utf8               remainingUses
  #387 = Utf8               playable
  #388 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #389 = Utf8               item
  #390 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #391 = Utf8               forceUse
  #392 = Utf8               Z
  #393 = Utf8               itemConfig
  #394 = Utf8               Lext/mods/summonmobitem/SummonMobItemHolder;
  #395 = Utf8               monsterId
  #396 = Utf8               npcTemplate
  #397 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #398 = Utf8               StackMapTable
  #399 = Utf8               skillId
  #400 = Utf8               skillLevel
  #401 = Utf8               castTime
  #402 = Utf8               distance
  #403 = Utf8               angle
  #404 = Utf8               D
  #405 = Utf8               spawnX
  #406 = Utf8               spawnY
  #407 = Utf8               spawnZ
  #408 = Utf8               spawn
  #409 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #410 = Utf8               monster
  #411 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #412 = Utf8               e
  #413 = Utf8               Ljava/lang/Exception;
  #414 = Utf8               lambda$useItem$0
  #415 = Utf8               SourceFile
  #416 = Utf8               ItemMonsterSummon.java
  #417 = Utf8               BootstrapMethods
  #418 = String             #419          // You must wait \u0001 more minutes before using this item again.
  #419 = Utf8               You must wait \u0001 more minutes before using this item again.
  #420 = MethodType         #6            //  ()V
  #421 = MethodHandle       5:#422        // REF_invokeVirtual ext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon.lambda$useItem$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/summonmobitem/SummonMobItemHolder;Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #422 = Methodref          #208.#423     // ext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon.lambda$useItem$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/summonmobitem/SummonMobItemHolder;Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #423 = NameAndType        #414:#371     // lambda$useItem$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/summonmobitem/SummonMobItemHolder;Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #424 = String             #425          // You begin to summon \u0001...
  #425 = Utf8               You begin to summon \u0001...
  #426 = String             #427          // You have successfully summoned \u0001!
  #427 = Utf8               You have successfully summoned \u0001!
  #428 = String             #429          // You have \u0001 uses remaining today.
  #429 = Utf8               You have \u0001 uses remaining today.
  #430 = String             #431          // This item has a \u0001 minute cooldown.
  #431 = Utf8               This item has a \u0001 minute cooldown.
  #432 = String             #433          // Error in ItemMonsterSummon: \u0001
  #433 = Utf8               Error in ItemMonsterSummon: \u0001
  #434 = String             #435          // Error in ItemMonsterSummon delayed spawn: \u0001
  #435 = Utf8               Error in ItemMonsterSummon delayed spawn: \u0001
  #436 = MethodHandle       6:#437        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #437 = Methodref          #438.#439     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #438 = Class              #440          // java/lang/invoke/StringConcatFactory
  #439 = NameAndType        #143:#441     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #440 = Utf8               java/lang/invoke/StringConcatFactory
  #441 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #442 = MethodHandle       6:#443        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #443 = Methodref          #444.#445     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #444 = Class              #446          // java/lang/invoke/LambdaMetafactory
  #445 = NameAndType        #447:#448     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #446 = Utf8               java/lang/invoke/LambdaMetafactory
  #447 = Utf8               metafactory
  #448 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #449 = Utf8               InnerClasses
  #450 = Class              #451          // java/lang/invoke/MethodHandles$Lookup
  #451 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #452 = Class              #453          // java/lang/invoke/MethodHandles
  #453 = Utf8               java/lang/invoke/MethodHandles
  #454 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.itemhandlers.ItemMonsterSummon();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: invokestatic  #9                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        20: invokevirtual #15                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
        23: ifeq          39
        26: invokestatic  #9                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        29: aload_1
        30: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
        33: invokevirtual #25                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onItemSummon:(I)Z
        36: ifne          105
        39: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        42: invokevirtual #34                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
        45: ifeq          61
        48: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        51: aload_1
        52: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
        55: invokevirtual #35                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onItemSummon:(I)Z
        58: ifne          105
        61: invokestatic  #36                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        64: invokevirtual #41                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
        67: ifeq          83
        70: invokestatic  #36                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        73: aload_1
        74: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
        77: invokevirtual #42                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onItemSummon:(I)Z
        80: ifne          105
        83: invokestatic  #43                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        86: invokevirtual #48                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
        89: ifeq          113
        92: invokestatic  #43                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        95: aload_1
        96: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
        99: invokevirtual #49                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onItemSummon:(I)Z
       102: ifeq          113
       105: aload         4
       107: ldc           #50                 // String You cannot use this item during PvP events.
       109: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       112: return
       113: aload         4
       115: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
       118: ifeq          130
       121: aload         4
       123: getstatic     #59                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_MOVE_SITTING:Lext/mods/gameserver/network/SystemMessageId;
       126: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       129: return
       130: aload         4
       132: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
       135: ifeq          146
       138: aload         4
       140: ldc           #72                 // String You cannot use this item in observer mode.
       142: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       145: return
       146: aload         4
       148: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
       151: ifeq          162
       154: aload         4
       156: ldc           #77                 // String This item cannot be used in Olympiad.
       158: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       161: return
       162: aload         4
       164: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
       167: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/attack/PlayerAttack.isAttackingNow:()Z
       170: ifne          181
       173: aload         4
       175: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.isInCombat:()Z
       178: ifeq          190
       181: aload         4
       183: getstatic     #91                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_SUMMON_IN_COMBAT:Lext/mods/gameserver/network/SystemMessageId;
       186: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       189: return
       190: aload         4
       192: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Player.isInBoat:()Z
       195: ifeq          206
       198: aload         4
       200: ldc           #97                 // String You cannot use this item while in a boat.
       202: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       205: return
       206: invokestatic  #99                 // Method ext/mods/InstanceMap/InstanceManager.getInstance:()Lext/mods/InstanceMap/InstanceManager;
       209: aload         4
       211: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       214: invokevirtual #105                // Method ext/mods/InstanceMap/InstanceManager.getInstance:(I)Lext/mods/InstanceMap/MapInstance;
       217: ifnull        228
       220: aload         4
       222: ldc           #108                // String You cannot use this item inside instances.
       224: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       227: return
       228: invokestatic  #110                // Method ext/mods/summonmobitem/SummonMobItemData.getInstance:()Lext/mods/summonmobitem/SummonMobItemData;
       231: aload_2
       232: invokevirtual #115                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       235: invokevirtual #120                // Method ext/mods/summonmobitem/SummonMobItemData.getSummonItem:(I)Lext/mods/summonmobitem/SummonMobItemHolder;
       238: astore        5
       240: aload         5
       242: ifnonnull     253
       245: aload         4
       247: ldc           #124                // String This item is not configured for monster summoning.
       249: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       252: return
       253: aload         5
       255: invokevirtual #126                // Method ext/mods/summonmobitem/SummonMobItemHolder.isEnabled:()Z
       258: ifne          269
       261: aload         4
       263: ldc           #131                // String This summon item is currently disabled.
       265: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       268: return
       269: invokestatic  #110                // Method ext/mods/summonmobitem/SummonMobItemData.getInstance:()Lext/mods/summonmobitem/SummonMobItemData;
       272: aload         4
       274: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       277: aload_2
       278: invokevirtual #115                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       281: invokevirtual #133                // Method ext/mods/summonmobitem/SummonMobItemData.canPlayerUseItem:(II)Z
       284: ifne          360
       287: invokestatic  #110                // Method ext/mods/summonmobitem/SummonMobItemData.getInstance:()Lext/mods/summonmobitem/SummonMobItemData;
       290: aload         4
       292: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       295: aload_2
       296: invokevirtual #115                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       299: invokevirtual #137                // Method ext/mods/summonmobitem/SummonMobItemData.getRemainingCooldown:(II)I
       302: istore        6
       304: iload         6
       306: ifle          322
       309: aload         4
       311: iload         6
       313: invokedynamic #141,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       318: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       321: return
       322: invokestatic  #110                // Method ext/mods/summonmobitem/SummonMobItemData.getInstance:()Lext/mods/summonmobitem/SummonMobItemData;
       325: aload         4
       327: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       330: aload_2
       331: invokevirtual #115                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       334: invokevirtual #145                // Method ext/mods/summonmobitem/SummonMobItemData.getRemainingDailyUses:(II)I
       337: istore        7
       339: iload         7
       341: ifne          352
       344: aload         4
       346: ldc           #148                // String You have reached the daily limit for this summon item.
       348: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       351: return
       352: aload         4
       354: ldc           #150                // String You cannot use this item at the moment.
       356: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       359: return
       360: aload         5
       362: aload         4
       364: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.getBaseClass:()I
       367: invokestatic  #155                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       370: invokevirtual #160                // Method ext/mods/summonmobitem/SummonMobItemHolder.canUseByClass:(Ljava/lang/String;)Z
       373: ifne          384
       376: aload         4
       378: ldc           #164                // String Your class cannot use this summon item.
       380: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       383: return
       384: aload         5
       386: invokevirtual #166                // Method ext/mods/summonmobitem/SummonMobItemHolder.getMonsterId:()I
       389: istore        6
       391: invokestatic  #169                // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
       394: iload         6
       396: invokevirtual #174                // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
       399: astore        7
       401: aload         7
       403: ifnonnull     414
       406: aload         4
       408: ldc           #178                // String Monster template not found.
       410: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       413: return
       414: aload         7
       416: ldc           #180                // String Monster
       418: invokevirtual #182                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isType:(Ljava/lang/String;)Z
       421: ifne          452
       424: aload         7
       426: ldc           #187                // String RaidBoss
       428: invokevirtual #182                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isType:(Ljava/lang/String;)Z
       431: ifne          452
       434: aload         7
       436: ldc           #189                // String GrandBoss
       438: invokevirtual #182                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isType:(Ljava/lang/String;)Z
       441: ifne          452
       444: aload         4
       446: ldc           #191                // String This item can only summon monsters.
       448: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       451: return
       452: aload         7
       454: invokevirtual #193                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isNoRespawn:()Z
       457: ifne          468
       460: aload         4
       462: ldc           #196                // String This monster template is not configured for single spawn.
       464: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       467: return
       468: aload         4
       470: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       473: invokevirtual #202                // Method ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
       476: aload_0
       477: aload         4
       479: aload         5
       481: invokevirtual #207                // Method executeSummonAnimation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/summonmobitem/SummonMobItemHolder;)V
       484: aload_0
       485: aload         4
       487: aload_2
       488: aload         5
       490: aload         7
       492: invokedynamic #213,  0            // InvokeDynamic #1:run:(Lext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/summonmobitem/SummonMobItemHolder;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Ljava/lang/Runnable;
       497: ldc2_w        #217                // long 15000l
       500: invokestatic  #219                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       503: pop
       504: return
      LineNumberTable:
        line 52: 0
        line 53: 16
        line 55: 17
        line 56: 39
        line 57: 61
        line 58: 83
        line 60: 105
        line 61: 112
        line 64: 113
        line 66: 121
        line 67: 129
        line 70: 130
        line 72: 138
        line 73: 145
        line 76: 146
        line 78: 154
        line 79: 161
        line 82: 162
        line 84: 181
        line 85: 189
        line 88: 190
        line 90: 198
        line 91: 205
        line 94: 206
        line 96: 220
        line 97: 227
        line 102: 228
        line 104: 240
        line 106: 245
        line 107: 252
        line 110: 253
        line 112: 261
        line 113: 268
        line 117: 269
        line 119: 287
        line 120: 304
        line 122: 309
        line 123: 321
        line 126: 322
        line 127: 339
        line 129: 344
        line 130: 351
        line 133: 352
        line 134: 359
        line 137: 360
        line 139: 376
        line 140: 383
        line 143: 384
        line 146: 391
        line 147: 401
        line 149: 406
        line 150: 413
        line 154: 414
        line 156: 444
        line 157: 451
        line 160: 452
        line 162: 460
        line 163: 467
        line 166: 468
        line 168: 476
        line 170: 484
        line 182: 504
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
          304      56     6 remainingCooldown   I
          339      21     7 remainingUses   I
            0     505     0  this   Lext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon;
            0     505     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     505     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     505     3 forceUse   Z
           17     488     4 player   Lext/mods/gameserver/model/actor/Player;
          240     265     5 itemConfig   Lext/mods/summonmobitem/SummonMobItemHolder;
          391     114     6 monsterId   I
          401     104     7 npcTemplate   Lext/mods/gameserver/model/actor/template/NpcTemplate;
      StackMapTable: number_of_entries = 23
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 7 /* same */
        frame_type = 16 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 18 /* same */
        frame_type = 8 /* same */
        frame_type = 15 /* same */
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/summonmobitem/SummonMobItemHolder ]
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 52
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 7
        frame_type = 23 /* same */
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ int, class ext/mods/gameserver/model/actor/template/NpcTemplate ]
        frame_type = 37 /* same */
        frame_type = 15 /* same */
}
SourceFile: "ItemMonsterSummon.java"
BootstrapMethods:
  0: #436 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #418 You must wait \u0001 more minutes before using this item again.
  1: #442 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #420 ()V
      #421 REF_invokeVirtual ext/mods/gameserver/handler/itemhandlers/ItemMonsterSummon.lambda$useItem$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/summonmobitem/SummonMobItemHolder;Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
      #420 ()V
  2: #436 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #424 You begin to summon \u0001...
  3: #436 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #426 You have successfully summoned \u0001!
  4: #436 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #428 You have \u0001 uses remaining today.
  5: #436 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #430 This item has a \u0001 minute cooldown.
  6: #436 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #432 Error in ItemMonsterSummon: \u0001
  7: #436 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #434 Error in ItemMonsterSummon delayed spawn: \u0001
InnerClasses:
  public static final #454= #450 of #452; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
