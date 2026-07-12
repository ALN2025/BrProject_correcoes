// Bytecode for: ext.mods.gameserver.network.clientpackets.EnterWorld
// File: ext\mods\gameserver\network\clientpackets\EnterWorld.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/EnterWorld.class
  Last modified 9 de jul de 2026; size 25365 bytes
  MD5 checksum 386071fe320e0a5e8ecbc52ae7ffe392
  Compiled from "EnterWorld.java"
public class ext.mods.gameserver.network.clientpackets.EnterWorld extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #17                         // ext/mods/gameserver/network/clientpackets/EnterWorld
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 0, methods: 7, attributes: 3
Constant pool:
     #1 = Methodref          #2.#3        // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
     #2 = Class              #4           // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Methodref          #8.#9        // ext/mods/gameserver/GameServer.getInstance:()Lext/mods/gameserver/GameServer;
     #8 = Class              #10          // ext/mods/gameserver/GameServer
     #9 = NameAndType        #11:#12      // getInstance:()Lext/mods/gameserver/GameServer;
    #10 = Utf8               ext/mods/gameserver/GameServer
    #11 = Utf8               getInstance
    #12 = Utf8               ()Lext/mods/gameserver/GameServer;
    #13 = Methodref          #8.#14       // ext/mods/gameserver/GameServer.awaitNpcsSpawnsReady:()V
    #14 = NameAndType        #15:#6       // awaitNpcsSpawnsReady:()V
    #15 = Utf8               awaitNpcsSpawnsReady
    #16 = Methodref          #17.#18      // ext/mods/gameserver/network/clientpackets/EnterWorld.getClient:()Lext/mods/commons/mmocore/MMOClient;
    #17 = Class              #19          // ext/mods/gameserver/network/clientpackets/EnterWorld
    #18 = NameAndType        #20:#21      // getClient:()Lext/mods/commons/mmocore/MMOClient;
    #19 = Utf8               ext/mods/gameserver/network/clientpackets/EnterWorld
    #20 = Utf8               getClient
    #21 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
    #22 = Class              #23          // ext/mods/gameserver/network/GameClient
    #23 = Utf8               ext/mods/gameserver/network/GameClient
    #24 = Methodref          #22.#25      // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
    #25 = NameAndType        #26:#27      // getPlayer:()Lext/mods/gameserver/model/actor/Player;
    #26 = Utf8               getPlayer
    #27 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
    #28 = Methodref          #22.#29      // ext/mods/gameserver/network/GameClient.closeNow:()V
    #29 = NameAndType        #30:#6       // closeNow:()V
    #30 = Utf8               closeNow
    #31 = Fieldref           #32.#33      // ext/mods/gameserver/network/GameClient$GameClientState.IN_GAME:Lext/mods/gameserver/network/GameClient$GameClientState;
    #32 = Class              #34          // ext/mods/gameserver/network/GameClient$GameClientState
    #33 = NameAndType        #35:#36      // IN_GAME:Lext/mods/gameserver/network/GameClient$GameClientState;
    #34 = Utf8               ext/mods/gameserver/network/GameClient$GameClientState
    #35 = Utf8               IN_GAME
    #36 = Utf8               Lext/mods/gameserver/network/GameClient$GameClientState;
    #37 = Methodref          #22.#38      // ext/mods/gameserver/network/GameClient.setState:(Lext/mods/gameserver/network/GameClient$GameClientState;)V
    #38 = NameAndType        #39:#40      // setState:(Lext/mods/gameserver/network/GameClient$GameClientState;)V
    #39 = Utf8               setState
    #40 = Utf8               (Lext/mods/gameserver/network/GameClient$GameClientState;)V
    #41 = Methodref          #42.#43      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
    #42 = Class              #44          // ext/mods/gameserver/model/actor/Player
    #43 = NameAndType        #45:#46      // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
    #44 = Utf8               ext/mods/gameserver/model/actor/Player
    #45 = Utf8               getInventory
    #46 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
    #47 = Methodref          #48.#49      // ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
    #48 = Class              #50          // ext/mods/gameserver/model/itemcontainer/PcInventory
    #49 = NameAndType        #51:#52      // getPaperdollItems:()Ljava/util/List;
    #50 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
    #51 = Utf8               getPaperdollItems
    #52 = Utf8               ()Ljava/util/List;
    #53 = InterfaceMethodref #54.#55      // java/util/List.iterator:()Ljava/util/Iterator;
    #54 = Class              #56          // java/util/List
    #55 = NameAndType        #57:#58      // iterator:()Ljava/util/Iterator;
    #56 = Utf8               java/util/List
    #57 = Utf8               iterator
    #58 = Utf8               ()Ljava/util/Iterator;
    #59 = InterfaceMethodref #60.#61      // java/util/Iterator.hasNext:()Z
    #60 = Class              #62          // java/util/Iterator
    #61 = NameAndType        #63:#64      // hasNext:()Z
    #62 = Utf8               java/util/Iterator
    #63 = Utf8               hasNext
    #64 = Utf8               ()Z
    #65 = InterfaceMethodref #60.#66      // java/util/Iterator.next:()Ljava/lang/Object;
    #66 = NameAndType        #67:#68      // next:()Ljava/lang/Object;
    #67 = Utf8               next
    #68 = Utf8               ()Ljava/lang/Object;
    #69 = Class              #70          // ext/mods/gameserver/model/item/instance/ItemInstance
    #70 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
    #71 = Methodref          #69.#72      // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
    #72 = NameAndType        #73:#64      // isEquipable:()Z
    #73 = Utf8               isEquipable
    #74 = Methodref          #69.#75      // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
    #75 = NameAndType        #76:#77      // getItem:()Lext/mods/gameserver/model/item/kind/Item;
    #76 = Utf8               getItem
    #77 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
    #78 = Methodref          #79.#80      // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
    #79 = Class              #81          // ext/mods/gameserver/model/item/kind/Item
    #80 = NameAndType        #82:#83      // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
    #81 = Utf8               ext/mods/gameserver/model/item/kind/Item
    #82 = Utf8               getCrystalType
    #83 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
    #84 = Methodref          #85.#86      // ext/mods/gameserver/custom/data/EquipGradeRestrictionData.getInstance:()Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
    #85 = Class              #87          // ext/mods/gameserver/custom/data/EquipGradeRestrictionData
    #86 = NameAndType        #11:#88      // getInstance:()Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
    #87 = Utf8               ext/mods/gameserver/custom/data/EquipGradeRestrictionData
    #88 = Utf8               ()Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
    #89 = Methodref          #85.#90      // ext/mods/gameserver/custom/data/EquipGradeRestrictionData.isEquipAllowed:(Lext/mods/gameserver/enums/items/CrystalType;)Z
    #90 = NameAndType        #91:#92      // isEquipAllowed:(Lext/mods/gameserver/enums/items/CrystalType;)Z
    #91 = Utf8               isEquipAllowed
    #92 = Utf8               (Lext/mods/gameserver/enums/items/CrystalType;)Z
    #93 = Methodref          #69.#94      // ext/mods/gameserver/model/item/instance/ItemInstance.getLocationSlot:()I
    #94 = NameAndType        #95:#96      // getLocationSlot:()I
    #95 = Utf8               getLocationSlot
    #96 = Utf8               ()I
    #97 = Methodref          #48.#98      // ext/mods/gameserver/model/itemcontainer/PcInventory.unequipItemInSlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
    #98 = NameAndType        #99:#100     // unequipItemInSlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
    #99 = Utf8               unequipItemInSlot
   #100 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #101 = Methodref          #85.#102     // ext/mods/gameserver/custom/data/EquipGradeRestrictionData.getBlockMessage:(Lext/mods/gameserver/enums/items/CrystalType;)Ljava/lang/String;
   #102 = NameAndType        #103:#104    // getBlockMessage:(Lext/mods/gameserver/enums/items/CrystalType;)Ljava/lang/String;
   #103 = Utf8               getBlockMessage
   #104 = Utf8               (Lext/mods/gameserver/enums/items/CrystalType;)Ljava/lang/String;
   #105 = Methodref          #69.#106     // ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
   #106 = NameAndType        #107:#108    // getName:()Ljava/lang/String;
   #107 = Utf8               getName
   #108 = Utf8               ()Ljava/lang/String;
   #109 = InvokeDynamic      #0:#110      // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #110 = NameAndType        #111:#112    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #111 = Utf8               makeConcatWithConstants
   #112 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #113 = Methodref          #42.#114     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #114 = NameAndType        #115:#116    // sendMessage:(Ljava/lang/String;)V
   #115 = Utf8               sendMessage
   #116 = Utf8               (Ljava/lang/String;)V
   #117 = Methodref          #42.#118     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #118 = NameAndType        #119:#96     // getObjectId:()I
   #119 = Utf8               getObjectId
   #120 = Methodref          #121.#122    // ext/mods/gameserver/data/manager/DropSkipManager.getInstance:()Lext/mods/gameserver/data/manager/DropSkipManager;
   #121 = Class              #123         // ext/mods/gameserver/data/manager/DropSkipManager
   #122 = NameAndType        #11:#124     // getInstance:()Lext/mods/gameserver/data/manager/DropSkipManager;
   #123 = Utf8               ext/mods/gameserver/data/manager/DropSkipManager
   #124 = Utf8               ()Lext/mods/gameserver/data/manager/DropSkipManager;
   #125 = Methodref          #121.#126    // ext/mods/gameserver/data/manager/DropSkipManager.loadPlayer:(I)V
   #126 = NameAndType        #127:#128    // loadPlayer:(I)V
   #127 = Utf8               loadPlayer
   #128 = Utf8               (I)V
   #129 = Methodref          #42.#130     // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #130 = NameAndType        #131:#64     // isGM:()Z
   #131 = Utf8               isGM
   #132 = Fieldref           #133.#134    // ext/mods/Config.SUPER_HASTE:Z
   #133 = Class              #135         // ext/mods/Config
   #134 = NameAndType        #136:#137    // SUPER_HASTE:Z
   #135 = Utf8               ext/mods/Config
   #136 = Utf8               SUPER_HASTE
   #137 = Utf8               Z
   #138 = Methodref          #139.#140    // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #139 = Class              #141         // ext/mods/gameserver/data/SkillTable
   #140 = NameAndType        #11:#142     // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #141 = Utf8               ext/mods/gameserver/data/SkillTable
   #142 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #143 = Methodref          #139.#144    // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #144 = NameAndType        #145:#146    // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #145 = Utf8               getInfo
   #146 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #147 = Methodref          #148.#149    // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #148 = Class              #150         // ext/mods/gameserver/skills/L2Skill
   #149 = NameAndType        #151:#152    // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #150 = Utf8               ext/mods/gameserver/skills/L2Skill
   #151 = Utf8               getEffects
   #152 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #153 = Fieldref           #133.#154    // ext/mods/Config.GM_STARTUP_INVULNERABLE:Z
   #154 = NameAndType        #155:#137    // GM_STARTUP_INVULNERABLE:Z
   #155 = Utf8               GM_STARTUP_INVULNERABLE
   #156 = Methodref          #157.#158    // ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
   #157 = Class              #159         // ext/mods/gameserver/data/xml/AdminData
   #158 = NameAndType        #11:#160     // getInstance:()Lext/mods/gameserver/data/xml/AdminData;
   #159 = Utf8               ext/mods/gameserver/data/xml/AdminData
   #160 = Utf8               ()Lext/mods/gameserver/data/xml/AdminData;
   #161 = String             #162         // admin_invul
   #162 = Utf8               admin_invul
   #163 = Methodref          #42.#164     // ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
   #164 = NameAndType        #165:#166    // getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
   #165 = Utf8               getAccessLevel
   #166 = Utf8               ()Lext/mods/gameserver/model/AccessLevel;
   #167 = Methodref          #157.#168    // ext/mods/gameserver/data/xml/AdminData.hasAccess:(Ljava/lang/String;Lext/mods/gameserver/model/AccessLevel;)Z
   #168 = NameAndType        #169:#170    // hasAccess:(Ljava/lang/String;Lext/mods/gameserver/model/AccessLevel;)Z
   #169 = Utf8               hasAccess
   #170 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/AccessLevel;)Z
   #171 = Methodref          #42.#172     // ext/mods/gameserver/model/actor/Player.setInvul:(Z)V
   #172 = NameAndType        #173:#174    // setInvul:(Z)V
   #173 = Utf8               setInvul
   #174 = Utf8               (Z)V
   #175 = Fieldref           #133.#176    // ext/mods/Config.GM_STARTUP_INVISIBLE:Z
   #176 = NameAndType        #177:#137    // GM_STARTUP_INVISIBLE:Z
   #177 = Utf8               GM_STARTUP_INVISIBLE
   #178 = String             #179         // admin_hide
   #179 = Utf8               admin_hide
   #180 = Methodref          #42.#181     // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #181 = NameAndType        #182:#183    // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #182 = Utf8               getAppearance
   #183 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #184 = Methodref          #185.#186    // ext/mods/gameserver/model/actor/container/player/Appearance.setVisible:(Z)V
   #185 = Class              #187         // ext/mods/gameserver/model/actor/container/player/Appearance
   #186 = NameAndType        #188:#174    // setVisible:(Z)V
   #187 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
   #188 = Utf8               setVisible
   #189 = Fieldref           #133.#190    // ext/mods/Config.GM_STARTUP_BLOCK_ALL:Z
   #190 = NameAndType        #191:#137    // GM_STARTUP_BLOCK_ALL:Z
   #191 = Utf8               GM_STARTUP_BLOCK_ALL
   #192 = Methodref          #42.#193     // ext/mods/gameserver/model/actor/Player.setInBlockingAll:(Z)V
   #193 = NameAndType        #194:#174    // setInBlockingAll:(Z)V
   #194 = Utf8               setInBlockingAll
   #195 = Fieldref           #133.#196    // ext/mods/Config.GM_STARTUP_AUTO_LIST:Z
   #196 = NameAndType        #197:#137    // GM_STARTUP_AUTO_LIST:Z
   #197 = Utf8               GM_STARTUP_AUTO_LIST
   #198 = String             #199         // admin_gmlist
   #199 = Utf8               admin_gmlist
   #200 = Methodref          #157.#201    // ext/mods/gameserver/data/xml/AdminData.addGm:(Lext/mods/gameserver/model/actor/Player;Z)V
   #201 = NameAndType        #202:#203    // addGm:(Lext/mods/gameserver/model/actor/Player;Z)V
   #202 = Utf8               addGm
   #203 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
   #204 = Methodref          #42.#205     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #205 = NameAndType        #206:#207    // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #206 = Utf8               getStatus
   #207 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #208 = Methodref          #209.#210    // ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
   #209 = Class              #211         // ext/mods/gameserver/model/actor/status/PlayerStatus
   #210 = NameAndType        #212:#213    // getHp:()D
   #211 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #212 = Utf8               getHp
   #213 = Utf8               ()D
   #214 = Double             0.5d
   #216 = Methodref          #42.#217     // ext/mods/gameserver/model/actor/Player.isMortal:()Z
   #217 = NameAndType        #218:#64     // isMortal:()Z
   #218 = Utf8               isMortal
   #219 = Methodref          #42.#220     // ext/mods/gameserver/model/actor/Player.setIsDead:(Z)V
   #220 = NameAndType        #221:#174    // setIsDead:(Z)V
   #221 = Utf8               setIsDead
   #222 = Methodref          #42.#223     // ext/mods/gameserver/model/actor/Player.getNameColor:()I
   #223 = NameAndType        #224:#96     // getNameColor:()I
   #224 = Utf8               getNameColor
   #225 = Methodref          #185.#226    // ext/mods/gameserver/model/actor/container/player/Appearance.setNameColor:(I)V
   #226 = NameAndType        #227:#128    // setNameColor:(I)V
   #227 = Utf8               setNameColor
   #228 = Methodref          #42.#229     // ext/mods/gameserver/model/actor/Player.getTitleColor:()I
   #229 = NameAndType        #230:#96     // getTitleColor:()I
   #230 = Utf8               getTitleColor
   #231 = Methodref          #185.#232    // ext/mods/gameserver/model/actor/container/player/Appearance.setTitleColor:(I)V
   #232 = NameAndType        #233:#128    // setTitleColor:(I)V
   #233 = Utf8               setTitleColor
   #234 = Methodref          #42.#235     // ext/mods/gameserver/model/actor/Player.getMacroList:()Lext/mods/gameserver/model/actor/container/player/MacroList;
   #235 = NameAndType        #236:#237    // getMacroList:()Lext/mods/gameserver/model/actor/container/player/MacroList;
   #236 = Utf8               getMacroList
   #237 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MacroList;
   #238 = Methodref          #239.#240    // ext/mods/gameserver/model/actor/container/player/MacroList.sendUpdate:()V
   #239 = Class              #241         // ext/mods/gameserver/model/actor/container/player/MacroList
   #240 = NameAndType        #242:#6      // sendUpdate:()V
   #241 = Utf8               ext/mods/gameserver/model/actor/container/player/MacroList
   #242 = Utf8               sendUpdate
   #243 = Class              #244         // ext/mods/gameserver/network/serverpackets/ExStorageMaxCount
   #244 = Utf8               ext/mods/gameserver/network/serverpackets/ExStorageMaxCount
   #245 = Methodref          #243.#246    // ext/mods/gameserver/network/serverpackets/ExStorageMaxCount."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #246 = NameAndType        #5:#247      // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #247 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #248 = Methodref          #42.#249     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #249 = NameAndType        #250:#251    // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #250 = Utf8               sendPacket
   #251 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #252 = Class              #253         // ext/mods/gameserver/network/serverpackets/HennaInfo
   #253 = Utf8               ext/mods/gameserver/network/serverpackets/HennaInfo
   #254 = Methodref          #252.#246    // ext/mods/gameserver/network/serverpackets/HennaInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #255 = Methodref          #42.#256     // ext/mods/gameserver/model/actor/Player.updateEffectIcons:()V
   #256 = NameAndType        #257:#6      // updateEffectIcons:()V
   #257 = Utf8               updateEffectIcons
   #258 = Class              #259         // ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
   #259 = Utf8               ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
   #260 = Methodref          #258.#246    // ext/mods/gameserver/network/serverpackets/EtcStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #261 = Methodref          #42.#262     // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #262 = NameAndType        #263:#264    // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #263 = Utf8               getClan
   #264 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #265 = Class              #266         // ext/mods/gameserver/network/serverpackets/PledgeSkillList
   #266 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeSkillList
   #267 = Methodref          #265.#268    // ext/mods/gameserver/network/serverpackets/PledgeSkillList."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
   #268 = NameAndType        #5:#269      // "<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
   #269 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
   #270 = Fieldref           #271.#272    // ext/mods/gameserver/network/SystemMessageId.CLAN_MEMBER_S1_LOGGED_IN:Lext/mods/gameserver/network/SystemMessageId;
   #271 = Class              #273         // ext/mods/gameserver/network/SystemMessageId
   #272 = NameAndType        #274:#275    // CLAN_MEMBER_S1_LOGGED_IN:Lext/mods/gameserver/network/SystemMessageId;
   #273 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #274 = Utf8               CLAN_MEMBER_S1_LOGGED_IN
   #275 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #276 = Methodref          #277.#278    // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #277 = Class              #279         // ext/mods/gameserver/network/serverpackets/SystemMessage
   #278 = NameAndType        #280:#281    // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #279 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #280 = Utf8               getSystemMessage
   #281 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #282 = Methodref          #277.#283    // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #283 = NameAndType        #284:#285    // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #284 = Utf8               addCharName
   #285 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #286 = Class              #287         // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate
   #287 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate
   #288 = Methodref          #286.#246    // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #289 = Methodref          #290.#291    // ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
   #290 = Class              #292         // ext/mods/gameserver/model/pledge/Clan
   #291 = NameAndType        #293:#294    // getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
   #292 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #293 = Utf8               getOnlineMembers
   #294 = Utf8               ()[Lext/mods/gameserver/model/actor/Player;
   #295 = Methodref          #42.#296     // ext/mods/gameserver/model/actor/Player.getSponsor:()I
   #296 = NameAndType        #297:#96     // getSponsor:()I
   #297 = Utf8               getSponsor
   #298 = Methodref          #299.#300    // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #299 = Class              #301         // ext/mods/gameserver/model/World
   #300 = NameAndType        #11:#302     // getInstance:()Lext/mods/gameserver/model/World;
   #301 = Utf8               ext/mods/gameserver/model/World
   #302 = Utf8               ()Lext/mods/gameserver/model/World;
   #303 = Methodref          #299.#304    // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #304 = NameAndType        #26:#305     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #305 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
   #306 = Fieldref           #271.#307    // ext/mods/gameserver/network/SystemMessageId.YOUR_APPRENTICE_S1_HAS_LOGGED_IN:Lext/mods/gameserver/network/SystemMessageId;
   #307 = NameAndType        #308:#275    // YOUR_APPRENTICE_S1_HAS_LOGGED_IN:Lext/mods/gameserver/network/SystemMessageId;
   #308 = Utf8               YOUR_APPRENTICE_S1_HAS_LOGGED_IN
   #309 = Methodref          #42.#310     // ext/mods/gameserver/model/actor/Player.getApprentice:()I
   #310 = NameAndType        #311:#96     // getApprentice:()I
   #311 = Utf8               getApprentice
   #312 = Fieldref           #271.#313    // ext/mods/gameserver/network/SystemMessageId.YOUR_SPONSOR_S1_HAS_LOGGED_IN:Lext/mods/gameserver/network/SystemMessageId;
   #313 = NameAndType        #314:#275    // YOUR_SPONSOR_S1_HAS_LOGGED_IN:Lext/mods/gameserver/network/SystemMessageId;
   #314 = Utf8               YOUR_SPONSOR_S1_HAS_LOGGED_IN
   #315 = Methodref          #316.#317    // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #316 = Class              #318         // ext/mods/gameserver/data/manager/ClanHallManager
   #317 = NameAndType        #11:#319     // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #318 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
   #319 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
   #320 = Methodref          #316.#321    // ext/mods/gameserver/data/manager/ClanHallManager.getClanHallByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #321 = NameAndType        #322:#323    // getClanHallByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #322 = Utf8               getClanHallByOwner
   #323 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #324 = Methodref          #325.#326    // ext/mods/gameserver/model/residence/clanhall/ClanHall.getPaid:()Z
   #325 = Class              #327         // ext/mods/gameserver/model/residence/clanhall/ClanHall
   #326 = NameAndType        #328:#64     // getPaid:()Z
   #327 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
   #328 = Utf8               getPaid
   #329 = Fieldref           #271.#330    // ext/mods/gameserver/network/SystemMessageId.PAYMENT_FOR_YOUR_CLAN_HALL_HAS_NOT_BEEN_MADE_PLEASE_MAKE_PAYMENT_TO_YOUR_CLAN_WAREHOUSE_BY_S1_TOMORROW:Lext/mods/gameserver/network/SystemMessageId;
   #330 = NameAndType        #331:#275    // PAYMENT_FOR_YOUR_CLAN_HALL_HAS_NOT_BEEN_MADE_PLEASE_MAKE_PAYMENT_TO_YOUR_CLAN_WAREHOUSE_BY_S1_TOMORROW:Lext/mods/gameserver/network/SystemMessageId;
   #331 = Utf8               PAYMENT_FOR_YOUR_CLAN_HALL_HAS_NOT_BEEN_MADE_PLEASE_MAKE_PAYMENT_TO_YOUR_CLAN_WAREHOUSE_BY_S1_TOMORROW
   #332 = Methodref          #42.#333     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #333 = NameAndType        #250:#334    // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #334 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #335 = Methodref          #336.#337    // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #336 = Class              #338         // ext/mods/gameserver/data/manager/CastleManager
   #337 = NameAndType        #11:#339     // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #338 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #339 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #340 = Methodref          #336.#341    // ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
   #341 = NameAndType        #342:#343    // getCastles:()Ljava/util/Collection;
   #342 = Utf8               getCastles
   #343 = Utf8               ()Ljava/util/Collection;
   #344 = InterfaceMethodref #345.#55     // java/util/Collection.iterator:()Ljava/util/Iterator;
   #345 = Class              #346         // java/util/Collection
   #346 = Utf8               java/util/Collection
   #347 = Class              #348         // ext/mods/gameserver/model/residence/castle/Castle
   #348 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #349 = Methodref          #42.#350     // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
   #350 = NameAndType        #351:#64     // isClanLeader:()Z
   #351 = Utf8               isClanLeader
   #352 = Methodref          #347.#353    // ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
   #353 = NameAndType        #354:#355    // getSkillsLeader:()Ljava/util/Map;
   #354 = Utf8               getSkillsLeader
   #355 = Utf8               ()Ljava/util/Map;
   #356 = Methodref          #347.#357    // ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
   #357 = NameAndType        #358:#355    // getSkillsMember:()Ljava/util/Map;
   #358 = Utf8               getSkillsMember
   #359 = InvokeDynamic      #1:#360      // #1:accept:(Lext/mods/gameserver/model/residence/castle/Castle;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #360 = NameAndType        #361:#362    // accept:(Lext/mods/gameserver/model/residence/castle/Castle;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #361 = Utf8               accept
   #362 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #363 = InterfaceMethodref #364.#365    // java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
   #364 = Class              #366         // java/util/Map
   #365 = NameAndType        #367:#368    // forEach:(Ljava/util/function/BiConsumer;)V
   #366 = Utf8               java/util/Map
   #367 = Utf8               forEach
   #368 = Utf8               (Ljava/util/function/BiConsumer;)V
   #369 = Methodref          #347.#370    // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #370 = NameAndType        #371:#372    // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #371 = Utf8               getSiege
   #372 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #373 = Methodref          #374.#375    // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #374 = Class              #376         // ext/mods/gameserver/model/residence/castle/Siege
   #375 = NameAndType        #377:#64     // isInProgress:()Z
   #376 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #377 = Utf8               isInProgress
   #378 = Methodref          #374.#379    // ext/mods/gameserver/model/residence/castle/Siege.getSide:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/enums/SiegeSide;
   #379 = NameAndType        #380:#381    // getSide:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/enums/SiegeSide;
   #380 = Utf8               getSide
   #381 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/enums/SiegeSide;
   #382 = Fieldref           #383.#384    // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #383 = Class              #385         // ext/mods/gameserver/enums/SiegeSide
   #384 = NameAndType        #386:#387    // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #385 = Utf8               ext/mods/gameserver/enums/SiegeSide
   #386 = Utf8               ATTACKER
   #387 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
   #388 = Methodref          #42.#389     // ext/mods/gameserver/model/actor/Player.setSiegeState:(I)V
   #389 = NameAndType        #390:#128    // setSiegeState:(I)V
   #390 = Utf8               setSiegeState
   #391 = Fieldref           #383.#392    // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #392 = NameAndType        #393:#387    // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #393 = Utf8               DEFENDER
   #394 = Fieldref           #383.#395    // ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
   #395 = NameAndType        #396:#387    // OWNER:Lext/mods/gameserver/enums/SiegeSide;
   #396 = Utf8               OWNER
   #397 = Methodref          #316.#398    // ext/mods/gameserver/data/manager/ClanHallManager.getSiegableHalls:()Ljava/util/List;
   #398 = NameAndType        #399:#52     // getSiegableHalls:()Ljava/util/List;
   #399 = Utf8               getSiegableHalls
   #400 = Class              #401         // ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #401 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #402 = Methodref          #400.#403    // ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
   #403 = NameAndType        #404:#64     // isInSiege:()Z
   #404 = Utf8               isInSiege
   #405 = Methodref          #400.#406    // ext/mods/gameserver/model/residence/clanhall/SiegableHall.isRegistered:(Lext/mods/gameserver/model/pledge/Clan;)Z
   #406 = NameAndType        #407:#408    // isRegistered:(Lext/mods/gameserver/model/pledge/Clan;)Z
   #407 = Utf8               isRegistered
   #408 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Z
   #409 = Class              #410         // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
   #410 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
   #411 = Methodref          #409.#412    // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll."<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
   #412 = NameAndType        #5:#413      // "<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
   #413 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;I)V
   #414 = Methodref          #290.#415    // ext/mods/gameserver/model/pledge/Clan.getAllSubPledges:()[Lext/mods/gameserver/model/pledge/SubPledge;
   #415 = NameAndType        #416:#417    // getAllSubPledges:()[Lext/mods/gameserver/model/pledge/SubPledge;
   #416 = Utf8               getAllSubPledges
   #417 = Utf8               ()[Lext/mods/gameserver/model/pledge/SubPledge;
   #418 = Methodref          #419.#420    // ext/mods/gameserver/model/pledge/SubPledge.getId:()I
   #419 = Class              #421         // ext/mods/gameserver/model/pledge/SubPledge
   #420 = NameAndType        #422:#96     // getId:()I
   #421 = Utf8               ext/mods/gameserver/model/pledge/SubPledge
   #422 = Utf8               getId
   #423 = Methodref          #424.#425    // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #424 = Class              #426         // ext/mods/gameserver/data/manager/SevenSignsManager
   #425 = NameAndType        #11:#427     // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #426 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
   #427 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #428 = Methodref          #424.#429    // ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
   #429 = NameAndType        #430:#64     // isSealValidationPeriod:()Z
   #430 = Utf8               isSealValidationPeriod
   #431 = Fieldref           #432.#433    // ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
   #432 = Class              #434         // ext/mods/gameserver/enums/SealType
   #433 = NameAndType        #435:#436    // STRIFE:Lext/mods/gameserver/enums/SealType;
   #434 = Utf8               ext/mods/gameserver/enums/SealType
   #435 = Utf8               STRIFE
   #436 = Utf8               Lext/mods/gameserver/enums/SealType;
   #437 = Methodref          #424.#438    // ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #438 = NameAndType        #439:#440    // getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #439 = Utf8               getSealOwner
   #440 = Utf8               (Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #441 = Fieldref           #442.#443    // ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
   #442 = Class              #444         // ext/mods/gameserver/enums/CabalType
   #443 = NameAndType        #445:#446    // NORMAL:Lext/mods/gameserver/enums/CabalType;
   #444 = Utf8               ext/mods/gameserver/enums/CabalType
   #445 = Utf8               NORMAL
   #446 = Utf8               Lext/mods/gameserver/enums/CabalType;
   #447 = Methodref          #424.#448    // ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
   #448 = NameAndType        #449:#450    // getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
   #449 = Utf8               getPlayerCabal
   #450 = Utf8               (I)Lext/mods/gameserver/enums/CabalType;
   #451 = Fieldref           #452.#453    // ext/mods/gameserver/data/SkillTable$FrequentSkill.THE_VICTOR_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #452 = Class              #454         // ext/mods/gameserver/data/SkillTable$FrequentSkill
   #453 = NameAndType        #455:#456    // THE_VICTOR_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #454 = Utf8               ext/mods/gameserver/data/SkillTable$FrequentSkill
   #455 = Utf8               THE_VICTOR_OF_WAR
   #456 = Utf8               Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #457 = Methodref          #452.#458    // ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #458 = NameAndType        #459:#460    // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #459 = Utf8               getSkill
   #460 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #461 = Methodref          #42.#462     // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #462 = NameAndType        #463:#464    // addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
   #463 = Utf8               addSkill
   #464 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
   #465 = Fieldref           #452.#466    // ext/mods/gameserver/data/SkillTable$FrequentSkill.THE_VANQUISHED_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #466 = NameAndType        #467:#456    // THE_VANQUISHED_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #467 = Utf8               THE_VANQUISHED_OF_WAR
   #468 = Methodref          #148.#420    // ext/mods/gameserver/skills/L2Skill.getId:()I
   #469 = Methodref          #42.#470     // ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
   #470 = NameAndType        #471:#472    // removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
   #471 = Utf8               removeSkill
   #472 = Utf8               (IZ)Lext/mods/gameserver/skills/L2Skill;
   #473 = Fieldref           #133.#474    // ext/mods/Config.PLAYER_SPAWN_PROTECTION:I
   #474 = NameAndType        #475:#476    // PLAYER_SPAWN_PROTECTION:I
   #475 = Utf8               PLAYER_SPAWN_PROTECTION
   #476 = Utf8               I
   #477 = Methodref          #42.#478     // ext/mods/gameserver/model/actor/Player.setSpawnProtection:(Z)V
   #478 = NameAndType        #479:#174    // setSpawnProtection:(Z)V
   #479 = Utf8               setSpawnProtection
   #480 = Methodref          #42.#481     // ext/mods/gameserver/model/actor/Player.spawnMe:()V
   #481 = NameAndType        #482:#6      // spawnMe:()V
   #482 = Utf8               spawnMe
   #483 = Methodref          #42.#484     // ext/mods/gameserver/model/actor/Player.getX:()I
   #484 = NameAndType        #485:#96     // getX:()I
   #485 = Utf8               getX
   #486 = Methodref          #42.#487     // ext/mods/gameserver/model/actor/Player.getY:()I
   #487 = NameAndType        #488:#96     // getY:()I
   #488 = Utf8               getY
   #489 = Methodref          #42.#490     // ext/mods/gameserver/model/actor/Player.setEnterWorldLoc:(III)V
   #490 = NameAndType        #491:#492    // setEnterWorldLoc:(III)V
   #491 = Utf8               setEnterWorldLoc
   #492 = Utf8               (III)V
   #493 = Methodref          #494.#495    // ext/mods/gameserver/data/manager/CoupleManager.getInstance:()Lext/mods/gameserver/data/manager/CoupleManager;
   #494 = Class              #496         // ext/mods/gameserver/data/manager/CoupleManager
   #495 = NameAndType        #11:#497     // getInstance:()Lext/mods/gameserver/data/manager/CoupleManager;
   #496 = Utf8               ext/mods/gameserver/data/manager/CoupleManager
   #497 = Utf8               ()Lext/mods/gameserver/data/manager/CoupleManager;
   #498 = Methodref          #494.#499    // ext/mods/gameserver/data/manager/CoupleManager.getCouples:()Ljava/util/Map;
   #499 = NameAndType        #500:#355    // getCouples:()Ljava/util/Map;
   #500 = Utf8               getCouples
   #501 = InterfaceMethodref #364.#502    // java/util/Map.entrySet:()Ljava/util/Set;
   #502 = NameAndType        #503:#504    // entrySet:()Ljava/util/Set;
   #503 = Utf8               entrySet
   #504 = Utf8               ()Ljava/util/Set;
   #505 = InterfaceMethodref #506.#55     // java/util/Set.iterator:()Ljava/util/Iterator;
   #506 = Class              #507         // java/util/Set
   #507 = Utf8               java/util/Set
   #508 = Class              #509         // java/util/Map$Entry
   #509 = Utf8               java/util/Map$Entry
   #510 = InterfaceMethodref #508.#511    // java/util/Map$Entry.getValue:()Ljava/lang/Object;
   #511 = NameAndType        #512:#68     // getValue:()Ljava/lang/Object;
   #512 = Utf8               getValue
   #513 = Class              #514         // ext/mods/gameserver/model/holder/IntIntHolder
   #514 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #515 = Methodref          #513.#420    // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
   #516 = Methodref          #513.#517    // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
   #517 = NameAndType        #512:#96     // getValue:()I
   #518 = InterfaceMethodref #508.#519    // java/util/Map$Entry.getKey:()Ljava/lang/Object;
   #519 = NameAndType        #520:#68     // getKey:()Ljava/lang/Object;
   #520 = Utf8               getKey
   #521 = Class              #522         // java/lang/Integer
   #522 = Utf8               java/lang/Integer
   #523 = Methodref          #521.#524    // java/lang/Integer.intValue:()I
   #524 = NameAndType        #525:#96     // intValue:()I
   #525 = Utf8               intValue
   #526 = Methodref          #42.#527     // ext/mods/gameserver/model/actor/Player.setCoupleId:(I)V
   #527 = NameAndType        #528:#128    // setCoupleId:(I)V
   #528 = Utf8               setCoupleId
   #529 = Methodref          #42.#530     // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
   #530 = NameAndType        #531:#64     // isCursedWeaponEquipped:()Z
   #531 = Utf8               isCursedWeaponEquipped
   #532 = Methodref          #48.#533     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #533 = NameAndType        #534:#100    // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #534 = Utf8               getItemByItemId
   #535 = Methodref          #42.#536     // ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
   #536 = NameAndType        #537:#538    // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
   #537 = Utf8               destroyItem
   #538 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
   #539 = Fieldref           #271.#540    // ext/mods/gameserver/network/SystemMessageId.WELCOME_TO_LINEAGE:Lext/mods/gameserver/network/SystemMessageId;
   #540 = NameAndType        #541:#275    // WELCOME_TO_LINEAGE:Lext/mods/gameserver/network/SystemMessageId;
   #541 = Utf8               WELCOME_TO_LINEAGE
   #542 = Methodref          #424.#543    // ext/mods/gameserver/data/manager/SevenSignsManager.getCurrentPeriod:()Lext/mods/gameserver/enums/PeriodType;
   #543 = NameAndType        #544:#545    // getCurrentPeriod:()Lext/mods/gameserver/enums/PeriodType;
   #544 = Utf8               getCurrentPeriod
   #545 = Utf8               ()Lext/mods/gameserver/enums/PeriodType;
   #546 = Methodref          #547.#548    // ext/mods/gameserver/enums/PeriodType.getMessageId:()Lext/mods/gameserver/network/SystemMessageId;
   #547 = Class              #549         // ext/mods/gameserver/enums/PeriodType
   #548 = NameAndType        #550:#551    // getMessageId:()Lext/mods/gameserver/network/SystemMessageId;
   #549 = Utf8               ext/mods/gameserver/enums/PeriodType
   #550 = Utf8               getMessageId
   #551 = Utf8               ()Lext/mods/gameserver/network/SystemMessageId;
   #552 = Methodref          #553.#554    // ext/mods/gameserver/data/xml/AnnouncementData.getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
   #553 = Class              #555         // ext/mods/gameserver/data/xml/AnnouncementData
   #554 = NameAndType        #11:#556     // getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
   #555 = Utf8               ext/mods/gameserver/data/xml/AnnouncementData
   #556 = Utf8               ()Lext/mods/gameserver/data/xml/AnnouncementData;
   #557 = Methodref          #553.#558    // ext/mods/gameserver/data/xml/AnnouncementData.showAnnouncements:(Lext/mods/gameserver/model/actor/Player;Z)V
   #558 = NameAndType        #559:#203    // showAnnouncements:(Lext/mods/gameserver/model/actor/Player;Z)V
   #559 = Utf8               showAnnouncements
   #560 = Methodref          #561.#562    // ext/mods/gameserver/data/manager/PcCafeManager.getInstance:()Lext/mods/gameserver/data/manager/PcCafeManager;
   #561 = Class              #563         // ext/mods/gameserver/data/manager/PcCafeManager
   #562 = NameAndType        #11:#564     // getInstance:()Lext/mods/gameserver/data/manager/PcCafeManager;
   #563 = Utf8               ext/mods/gameserver/data/manager/PcCafeManager
   #564 = Utf8               ()Lext/mods/gameserver/data/manager/PcCafeManager;
   #565 = Methodref          #561.#566    // ext/mods/gameserver/data/manager/PcCafeManager.onPlayerLogin:(Lext/mods/gameserver/model/actor/Player;)V
   #566 = NameAndType        #567:#247    // onPlayerLogin:(Lext/mods/gameserver/model/actor/Player;)V
   #567 = Utf8               onPlayerLogin
   #568 = Methodref          #569.#570    // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #569 = Class              #571         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #570 = NameAndType        #11:#572     // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #571 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #572 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #573 = Methodref          #569.#574    // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onLogin:(Lext/mods/gameserver/model/actor/Player;)V
   #574 = NameAndType        #575:#247    // onLogin:(Lext/mods/gameserver/model/actor/Player;)V
   #575 = Utf8               onLogin
   #576 = Methodref          #577.#578    // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #577 = Class              #579         // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #578 = NameAndType        #11:#580     // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #579 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #580 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #581 = Methodref          #577.#574    // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onLogin:(Lext/mods/gameserver/model/actor/Player;)V
   #582 = Methodref          #583.#584    // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #583 = Class              #585         // ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #584 = NameAndType        #11:#586     // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #585 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #586 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #587 = Methodref          #583.#574    // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onLogin:(Lext/mods/gameserver/model/actor/Player;)V
   #588 = Methodref          #589.#590    // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #589 = Class              #591         // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #590 = NameAndType        #11:#592     // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #591 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #592 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #593 = Methodref          #589.#574    // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onLogin:(Lext/mods/gameserver/model/actor/Player;)V
   #594 = Methodref          #42.#595     // ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
   #595 = NameAndType        #596:#597    // getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
   #596 = Utf8               getRace
   #597 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassRace;
   #598 = Fieldref           #599.#600    // ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
   #599 = Class              #601         // ext/mods/gameserver/enums/actors/ClassRace
   #600 = NameAndType        #602:#603    // DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
   #601 = Utf8               ext/mods/gameserver/enums/actors/ClassRace
   #602 = Utf8               DARK_ELF
   #603 = Utf8               Lext/mods/gameserver/enums/actors/ClassRace;
   #604 = Methodref          #42.#605     // ext/mods/gameserver/model/actor/Player.hasSkill:(I)Z
   #605 = NameAndType        #606:#607    // hasSkill:(I)Z
   #606 = Utf8               hasSkill
   #607 = Utf8               (I)Z
   #608 = Methodref          #609.#610    // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #609 = Class              #611         // ext/mods/gameserver/taskmanager/GameTimeTaskManager
   #610 = NameAndType        #11:#612     // getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #611 = Utf8               ext/mods/gameserver/taskmanager/GameTimeTaskManager
   #612 = Utf8               ()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #613 = Methodref          #609.#614    // ext/mods/gameserver/taskmanager/GameTimeTaskManager.isNight:()Z
   #614 = NameAndType        #615:#64     // isNight:()Z
   #615 = Utf8               isNight
   #616 = Fieldref           #271.#617    // ext/mods/gameserver/network/SystemMessageId.NIGHT_S1_EFFECT_APPLIES:Lext/mods/gameserver/network/SystemMessageId;
   #617 = NameAndType        #618:#275    // NIGHT_S1_EFFECT_APPLIES:Lext/mods/gameserver/network/SystemMessageId;
   #618 = Utf8               NIGHT_S1_EFFECT_APPLIES
   #619 = Fieldref           #271.#620    // ext/mods/gameserver/network/SystemMessageId.DAY_S1_EFFECT_DISAPPEARS:Lext/mods/gameserver/network/SystemMessageId;
   #620 = NameAndType        #621:#275    // DAY_S1_EFFECT_DISAPPEARS:Lext/mods/gameserver/network/SystemMessageId;
   #621 = Utf8               DAY_S1_EFFECT_DISAPPEARS
   #622 = Methodref          #277.#623    // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #623 = NameAndType        #624:#625    // addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #624 = Utf8               addSkillName
   #625 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #626 = Methodref          #42.#627     // ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #627 = NameAndType        #628:#629    // getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #628 = Utf8               getQuestList
   #629 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #630 = InvokeDynamic      #2:#631      // #2:test:()Ljava/util/function/Predicate;
   #631 = NameAndType        #632:#633    // test:()Ljava/util/function/Predicate;
   #632 = Utf8               test
   #633 = Utf8               ()Ljava/util/function/Predicate;
   #634 = Methodref          #635.#636    // ext/mods/gameserver/model/actor/container/player/QuestList.getQuests:(Ljava/util/function/Predicate;)Ljava/util/List;
   #635 = Class              #637         // ext/mods/gameserver/model/actor/container/player/QuestList
   #636 = NameAndType        #638:#639    // getQuests:(Ljava/util/function/Predicate;)Ljava/util/List;
   #637 = Utf8               ext/mods/gameserver/model/actor/container/player/QuestList
   #638 = Utf8               getQuests
   #639 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/List;
   #640 = InvokeDynamic      #3:#641      // #3:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
   #641 = NameAndType        #361:#642    // accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
   #642 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
   #643 = InterfaceMethodref #54.#644     // java/util/List.forEach:(Ljava/util/function/Consumer;)V
   #644 = NameAndType        #367:#645    // forEach:(Ljava/util/function/Consumer;)V
   #645 = Utf8               (Ljava/util/function/Consumer;)V
   #646 = Methodref          #48.#647     // ext/mods/gameserver/model/itemcontainer/PcInventory.updateWeight:()Z
   #647 = NameAndType        #648:#64     // updateWeight:()Z
   #648 = Utf8               updateWeight
   #649 = Class              #650         // ext/mods/gameserver/network/serverpackets/QuestList
   #650 = Utf8               ext/mods/gameserver/network/serverpackets/QuestList
   #651 = Methodref          #649.#246    // ext/mods/gameserver/network/serverpackets/QuestList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #652 = Class              #653         // ext/mods/gameserver/network/serverpackets/SkillList
   #653 = Utf8               ext/mods/gameserver/network/serverpackets/SkillList
   #654 = Methodref          #652.#246    // ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #655 = Class              #656         // ext/mods/gameserver/network/serverpackets/FriendList
   #656 = Utf8               ext/mods/gameserver/network/serverpackets/FriendList
   #657 = Methodref          #655.#246    // ext/mods/gameserver/network/serverpackets/FriendList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #658 = Class              #659         // ext/mods/gameserver/network/serverpackets/UserInfo
   #659 = Utf8               ext/mods/gameserver/network/serverpackets/UserInfo
   #660 = Methodref          #658.#246    // ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #661 = Class              #662         // ext/mods/gameserver/network/serverpackets/ItemList
   #662 = Utf8               ext/mods/gameserver/network/serverpackets/ItemList
   #663 = Methodref          #661.#664    // ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
   #664 = NameAndType        #5:#203      // "<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
   #665 = Class              #666         // ext/mods/gameserver/network/serverpackets/ShortCutInit
   #666 = Utf8               ext/mods/gameserver/network/serverpackets/ShortCutInit
   #667 = Methodref          #665.#246    // ext/mods/gameserver/network/serverpackets/ShortCutInit."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #668 = Methodref          #209.#669    // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
   #669 = NameAndType        #670:#96     // getMaxHp:()I
   #670 = Utf8               getMaxHp
   #671 = Methodref          #42.#672     // ext/mods/gameserver/model/actor/Player.checkCondition:(DD)V
   #672 = NameAndType        #673:#674    // checkCondition:(DD)V
   #673 = Utf8               checkCondition
   #674 = Utf8               (DD)V
   #675 = Methodref          #42.#676     // ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
   #676 = NameAndType        #677:#64     // isAlikeDead:()Z
   #677 = Utf8               isAlikeDead
   #678 = Class              #679         // ext/mods/gameserver/network/serverpackets/Die
   #679 = Utf8               ext/mods/gameserver/network/serverpackets/Die
   #680 = Methodref          #678.#681    // ext/mods/gameserver/network/serverpackets/Die."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #681 = NameAndType        #5:#682      // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #682 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #683 = Fieldref           #133.#684    // ext/mods/Config.ENABLE_COMMUNITY_BOARD:Z
   #684 = NameAndType        #685:#137    // ENABLE_COMMUNITY_BOARD:Z
   #685 = Utf8               ENABLE_COMMUNITY_BOARD
   #686 = Methodref          #687.#688    // ext/mods/gameserver/communitybbs/manager/MailBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
   #687 = Class              #689         // ext/mods/gameserver/communitybbs/manager/MailBBSManager
   #688 = NameAndType        #11:#690     // getInstance:()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
   #689 = Utf8               ext/mods/gameserver/communitybbs/manager/MailBBSManager
   #690 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
   #691 = Methodref          #687.#692    // ext/mods/gameserver/communitybbs/manager/MailBBSManager.checkIfUnreadMail:(Lext/mods/gameserver/model/actor/Player;)Z
   #692 = NameAndType        #693:#694    // checkIfUnreadMail:(Lext/mods/gameserver/model/actor/Player;)Z
   #693 = Utf8               checkIfUnreadMail
   #694 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #695 = Fieldref           #271.#696    // ext/mods/gameserver/network/SystemMessageId.NEW_MAIL:Lext/mods/gameserver/network/SystemMessageId;
   #696 = NameAndType        #697:#275    // NEW_MAIL:Lext/mods/gameserver/network/SystemMessageId;
   #697 = Utf8               NEW_MAIL
   #698 = Class              #699         // ext/mods/gameserver/network/serverpackets/PlaySound
   #699 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
   #700 = String             #701         // systemmsg_e.1233
   #701 = Utf8               systemmsg_e.1233
   #702 = Methodref          #698.#703    // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
   #703 = NameAndType        #5:#116      // "<init>":(Ljava/lang/String;)V
   #704 = Fieldref           #705.#706    // ext/mods/gameserver/network/serverpackets/ExMailArrived.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExMailArrived;
   #705 = Class              #707         // ext/mods/gameserver/network/serverpackets/ExMailArrived
   #706 = NameAndType        #708:#709    // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExMailArrived;
   #707 = Utf8               ext/mods/gameserver/network/serverpackets/ExMailArrived
   #708 = Utf8               STATIC_PACKET
   #709 = Utf8               Lext/mods/gameserver/network/serverpackets/ExMailArrived;
   #710 = Methodref          #290.#711    // ext/mods/gameserver/model/pledge/Clan.isNoticeEnabled:()Z
   #711 = NameAndType        #712:#64     // isNoticeEnabled:()Z
   #712 = Utf8               isNoticeEnabled
   #713 = Class              #714         // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #714 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #715 = Methodref          #713.#716    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #716 = NameAndType        #5:#128      // "<init>":(I)V
   #717 = Methodref          #42.#718     // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #718 = NameAndType        #719:#720    // getLocale:()Ljava/util/Locale;
   #719 = Utf8               getLocale
   #720 = Utf8               ()Ljava/util/Locale;
   #721 = String             #722         // html/clan_notice.htm
   #722 = Utf8               html/clan_notice.htm
   #723 = Methodref          #713.#724    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #724 = NameAndType        #725:#726    // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #725 = Utf8               setFile
   #726 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #727 = String             #728         // %clan_name%
   #728 = Utf8               %clan_name%
   #729 = Methodref          #290.#106    // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
   #730 = Methodref          #713.#731    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #731 = NameAndType        #732:#733    // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #732 = Utf8               replace
   #733 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #734 = String             #735         // %notice_text%
   #735 = Utf8               %notice_text%
   #736 = Methodref          #290.#737    // ext/mods/gameserver/model/pledge/Clan.getNotice:()Ljava/lang/String;
   #737 = NameAndType        #738:#108    // getNotice:()Ljava/lang/String;
   #738 = Utf8               getNotice
   #739 = String             #740         // \r\n
   #740 = Utf8               \r\n
   #741 = String             #742         // <br>
   #742 = Utf8               <br>
   #743 = Methodref          #744.#745    // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #744 = Class              #746         // java/lang/String
   #745 = NameAndType        #747:#112    // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #746 = Utf8               java/lang/String
   #747 = Utf8               replaceAll
   #748 = String             #749         // action
   #749 = Utf8               action
   #750 = String             #751         //
   #751 = Utf8
   #752 = Methodref          #744.#753    // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #753 = NameAndType        #732:#754    // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #754 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #755 = String             #756         // bypass
   #756 = Utf8               bypass
   #757 = Methodref          #17.#249     // ext/mods/gameserver/network/clientpackets/EnterWorld.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #758 = Fieldref           #133.#759    // ext/mods/Config.SERVER_NEWS:Z
   #759 = NameAndType        #760:#137    // SERVER_NEWS:Z
   #760 = Utf8               SERVER_NEWS
   #761 = String             #762         // html/servnews.htm
   #762 = Utf8               html/servnews.htm
   #763 = Methodref          #42.#764     // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
   #764 = NameAndType        #765:#96     // getPremiumService:()I
   #765 = Utf8               getPremiumService
   #766 = Methodref          #17.#767     // ext/mods/gameserver/network/clientpackets/EnterWorld.onEnterPremium:(Lext/mods/gameserver/model/actor/Player;)V
   #767 = NameAndType        #768:#247    // onEnterPremium:(Lext/mods/gameserver/model/actor/Player;)V
   #768 = Utf8               onEnterPremium
   #769 = Methodref          #770.#771    // ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
   #770 = Class              #772         // ext/mods/gameserver/data/manager/PetitionManager
   #771 = NameAndType        #11:#773     // getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
   #772 = Utf8               ext/mods/gameserver/data/manager/PetitionManager
   #773 = Utf8               ()Lext/mods/gameserver/data/manager/PetitionManager;
   #774 = Methodref          #770.#775    // ext/mods/gameserver/data/manager/PetitionManager.checkActivePetition:(Lext/mods/gameserver/model/actor/Player;)V
   #775 = NameAndType        #776:#247    // checkActivePetition:(Lext/mods/gameserver/model/actor/Player;)V
   #776 = Utf8               checkActivePetition
   #777 = Methodref          #42.#778     // ext/mods/gameserver/model/actor/Player.onPlayerEnter:()V
   #778 = NameAndType        #779:#6      // onPlayerEnter:()V
   #779 = Utf8               onPlayerEnter
   #780 = Methodref          #781.#782    // ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
   #781 = Class              #783         // ext/mods/Safedisconect/SafeDisconnectManager
   #782 = NameAndType        #11:#784     // getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
   #783 = Utf8               ext/mods/Safedisconect/SafeDisconnectManager
   #784 = Utf8               ()Lext/mods/Safedisconect/SafeDisconnectManager;
   #785 = Methodref          #781.#786    // ext/mods/Safedisconect/SafeDisconnectManager.onEnterWorld:(Lext/mods/gameserver/model/actor/Player;)V
   #786 = NameAndType        #787:#247    // onEnterWorld:(Lext/mods/gameserver/model/actor/Player;)V
   #787 = Utf8               onEnterWorld
   #788 = Methodref          #789.#790    // ext/mods/gameserver/data/manager/CountryLocaleManager.getInstance:()Lext/mods/gameserver/data/manager/CountryLocaleManager;
   #789 = Class              #791         // ext/mods/gameserver/data/manager/CountryLocaleManager
   #790 = NameAndType        #11:#792     // getInstance:()Lext/mods/gameserver/data/manager/CountryLocaleManager;
   #791 = Utf8               ext/mods/gameserver/data/manager/CountryLocaleManager
   #792 = Utf8               ()Lext/mods/gameserver/data/manager/CountryLocaleManager;
   #793 = Methodref          #789.#794    // ext/mods/gameserver/data/manager/CountryLocaleManager.onEnterWorld:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/GameClient;)V
   #794 = NameAndType        #787:#795    // onEnterWorld:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/GameClient;)V
   #795 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/GameClient;)V
   #796 = Fieldref           #133.#797    // ext/mods/Config.ENABLE_PIX_MOD:Z
   #797 = NameAndType        #798:#137    // ENABLE_PIX_MOD:Z
   #798 = Utf8               ENABLE_PIX_MOD
   #799 = Fieldref           #133.#800    // ext/mods/Config.DONATION_ENABLED:Z
   #800 = NameAndType        #801:#137    // DONATION_ENABLED:Z
   #801 = Utf8               DONATION_ENABLED
   #802 = Methodref          #803.#804    // net/sf/donationmanager/DonationManager.getInstance:()Lnet/sf/donationmanager/DonationManager;
   #803 = Class              #805         // net/sf/donationmanager/DonationManager
   #804 = NameAndType        #11:#806     // getInstance:()Lnet/sf/donationmanager/DonationManager;
   #805 = Utf8               net/sf/donationmanager/DonationManager
   #806 = Utf8               ()Lnet/sf/donationmanager/DonationManager;
   #807 = Methodref          #803.#808    // net/sf/donationmanager/DonationManager.offlinePlayer:(Lext/mods/gameserver/model/actor/Player;)V
   #808 = NameAndType        #809:#247    // offlinePlayer:(Lext/mods/gameserver/model/actor/Player;)V
   #809 = Utf8               offlinePlayer
   #810 = Methodref          #42.#811     // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
   #811 = NameAndType        #812:#6      // broadcastUserInfo:()V
   #812 = Utf8               broadcastUserInfo
   #813 = Class              #814         // ext/mods/gameserver/network/serverpackets/SkillCoolTime
   #814 = Utf8               ext/mods/gameserver/network/serverpackets/SkillCoolTime
   #815 = Methodref          #813.#246    // ext/mods/gameserver/network/serverpackets/SkillCoolTime."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #816 = Methodref          #817.#818    // ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
   #817 = Class              #819         // ext/mods/gameserver/model/olympiad/Olympiad
   #818 = NameAndType        #11:#820     // getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
   #819 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad
   #820 = Utf8               ()Lext/mods/gameserver/model/olympiad/Olympiad;
   #821 = Methodref          #817.#822    // ext/mods/gameserver/model/olympiad/Olympiad.playerInStadia:(Lext/mods/gameserver/model/actor/Player;)Z
   #822 = NameAndType        #823:#694    // playerInStadia:(Lext/mods/gameserver/model/actor/Player;)Z
   #823 = Utf8               playerInStadia
   #824 = Fieldref           #825.#826    // ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
   #825 = Class              #827         // ext/mods/gameserver/enums/RestartType
   #826 = NameAndType        #828:#829    // TOWN:Lext/mods/gameserver/enums/RestartType;
   #827 = Utf8               ext/mods/gameserver/enums/RestartType
   #828 = Utf8               TOWN
   #829 = Utf8               Lext/mods/gameserver/enums/RestartType;
   #830 = Methodref          #42.#831     // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
   #831 = NameAndType        #832:#833    // teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
   #832 = Utf8               teleportTo
   #833 = Utf8               (Lext/mods/gameserver/enums/RestartType;)V
   #834 = Methodref          #42.#835     // ext/mods/gameserver/model/actor/Player.getClanJoinExpiryTime:()J
   #835 = NameAndType        #836:#837    // getClanJoinExpiryTime:()J
   #836 = Utf8               getClanJoinExpiryTime
   #837 = Utf8               ()J
   #838 = Methodref          #839.#840    // java/lang/System.currentTimeMillis:()J
   #839 = Class              #841         // java/lang/System
   #840 = NameAndType        #842:#837    // currentTimeMillis:()J
   #841 = Utf8               java/lang/System
   #842 = Utf8               currentTimeMillis
   #843 = Fieldref           #271.#844    // ext/mods/gameserver/network/SystemMessageId.CLAN_MEMBERSHIP_TERMINATED:Lext/mods/gameserver/network/SystemMessageId;
   #844 = NameAndType        #845:#275    // CLAN_MEMBERSHIP_TERMINATED:Lext/mods/gameserver/network/SystemMessageId;
   #845 = Utf8               CLAN_MEMBERSHIP_TERMINATED
   #846 = Fieldref           #847.#848    // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #847 = Class              #849         // ext/mods/gameserver/enums/ZoneId
   #848 = NameAndType        #850:#851    // SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #849 = Utf8               ext/mods/gameserver/enums/ZoneId
   #850 = Utf8               SIEGE
   #851 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #852 = Methodref          #42.#853     // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #853 = NameAndType        #854:#855    // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #854 = Utf8               isInsideZone
   #855 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #856 = Methodref          #42.#857     // ext/mods/gameserver/model/actor/Player.getSiegeState:()I
   #857 = NameAndType        #858:#96     // getSiegeState:()I
   #858 = Utf8               getSiegeState
   #859 = Fieldref           #847.#860    // ext/mods/gameserver/enums/ZoneId.BOSS:Lext/mods/gameserver/enums/ZoneId;
   #860 = NameAndType        #861:#851    // BOSS:Lext/mods/gameserver/enums/ZoneId;
   #861 = Utf8               BOSS
   #862 = Methodref          #42.#863     // ext/mods/gameserver/model/actor/Player.getLastAccess:()J
   #863 = NameAndType        #864:#837    // getLastAccess:()J
   #864 = Utf8               getLastAccess
   #865 = Long               300000l
   #867 = Methodref          #868.#869    // ext/mods/gameserver/model/actor/instance/ClassMaster.showQuestionMark:(Lext/mods/gameserver/model/actor/Player;)V
   #868 = Class              #870         // ext/mods/gameserver/model/actor/instance/ClassMaster
   #869 = NameAndType        #871:#247    // showQuestionMark:(Lext/mods/gameserver/model/actor/Player;)V
   #870 = Utf8               ext/mods/gameserver/model/actor/instance/ClassMaster
   #871 = Utf8               showQuestionMark
   #872 = String             #873         // Tutorial
   #873 = Utf8               Tutorial
   #874 = Methodref          #635.#875    // ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
   #875 = NameAndType        #876:#877    // getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
   #876 = Utf8               getQuestState
   #877 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
   #878 = Methodref          #879.#880    // ext/mods/gameserver/scripting/QuestState.getQuest:()Lext/mods/gameserver/scripting/Quest;
   #879 = Class              #881         // ext/mods/gameserver/scripting/QuestState
   #880 = NameAndType        #882:#883    // getQuest:()Lext/mods/gameserver/scripting/Quest;
   #881 = Utf8               ext/mods/gameserver/scripting/QuestState
   #882 = Utf8               getQuest
   #883 = Utf8               ()Lext/mods/gameserver/scripting/Quest;
   #884 = String             #885         // UC
   #885 = Utf8               UC
   #886 = Methodref          #887.#888    // ext/mods/gameserver/scripting/Quest.notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #887 = Class              #889         // ext/mods/gameserver/scripting/Quest
   #888 = NameAndType        #890:#891    // notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #889 = Utf8               ext/mods/gameserver/scripting/Quest
   #890 = Utf8               notifyEvent
   #891 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #892 = Methodref          #893.#894    // ext/mods/playergod/PlayerGodManager.getInstance:()Lext/mods/playergod/PlayerGodManager;
   #893 = Class              #895         // ext/mods/playergod/PlayerGodManager
   #894 = NameAndType        #11:#896     // getInstance:()Lext/mods/playergod/PlayerGodManager;
   #895 = Utf8               ext/mods/playergod/PlayerGodManager
   #896 = Utf8               ()Lext/mods/playergod/PlayerGodManager;
   #897 = Methodref          #893.#786    // ext/mods/playergod/PlayerGodManager.onEnterWorld:(Lext/mods/gameserver/model/actor/Player;)V
   #898 = Methodref          #42.#899     // ext/mods/gameserver/model/actor/Player.restoreDressMe:()V
   #899 = NameAndType        #900:#6      // restoreDressMe:()V
   #900 = Utf8               restoreDressMe
   #901 = Methodref          #902.#903    // ext/mods/tour/TournamentEvent.isRunning:()Z
   #902 = Class              #904         // ext/mods/tour/TournamentEvent
   #903 = NameAndType        #905:#64     // isRunning:()Z
   #904 = Utf8               ext/mods/tour/TournamentEvent
   #905 = Utf8               isRunning
   #906 = Class              #907         // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
   #907 = Utf8               ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
   #908 = Methodref          #906.#716    // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
   #909 = Methodref          #902.#910    // ext/mods/tour/TournamentEvent.lastEvent:()Ljava/lang/String;
   #910 = NameAndType        #911:#108    // lastEvent:()Ljava/lang/String;
   #911 = Utf8               lastEvent
   #912 = Methodref          #744.#913    // java/lang/String.isEmpty:()Z
   #913 = NameAndType        #914:#64     // isEmpty:()Z
   #914 = Utf8               isEmpty
   #915 = String             #916         // HH:mm
   #916 = Utf8               HH:mm
   #917 = Methodref          #918.#919    // java/time/format/DateTimeFormatter.ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
   #918 = Class              #920         // java/time/format/DateTimeFormatter
   #919 = NameAndType        #921:#922    // ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
   #920 = Utf8               java/time/format/DateTimeFormatter
   #921 = Utf8               ofPattern
   #922 = Utf8               (Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
   #923 = Methodref          #924.#925    // java/time/LocalTime.parse:(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalTime;
   #924 = Class              #926         // java/time/LocalTime
   #925 = NameAndType        #927:#928    // parse:(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalTime;
   #926 = Utf8               java/time/LocalTime
   #927 = Utf8               parse
   #928 = Utf8               (Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalTime;
   #929 = Methodref          #924.#930    // java/time/LocalTime.now:()Ljava/time/LocalTime;
   #930 = NameAndType        #931:#932    // now:()Ljava/time/LocalTime;
   #931 = Utf8               now
   #932 = Utf8               ()Ljava/time/LocalTime;
   #933 = Methodref          #934.#935    // ext/mods/tour/TourData.getInstance:()Lext/mods/tour/TourData;
   #934 = Class              #936         // ext/mods/tour/TourData
   #935 = NameAndType        #11:#937     // getInstance:()Lext/mods/tour/TourData;
   #936 = Utf8               ext/mods/tour/TourData
   #937 = Utf8               ()Lext/mods/tour/TourData;
   #938 = Methodref          #934.#939    // ext/mods/tour/TourData.getConfig:()Lext/mods/tour/holder/TourConfig;
   #939 = NameAndType        #940:#941    // getConfig:()Lext/mods/tour/holder/TourConfig;
   #940 = Utf8               getConfig
   #941 = Utf8               ()Lext/mods/tour/holder/TourConfig;
   #942 = Methodref          #943.#944    // ext/mods/tour/holder/TourConfig.getDuration:()I
   #943 = Class              #945         // ext/mods/tour/holder/TourConfig
   #944 = NameAndType        #946:#96     // getDuration:()I
   #945 = Utf8               ext/mods/tour/holder/TourConfig
   #946 = Utf8               getDuration
   #947 = Methodref          #924.#948    // java/time/LocalTime.plusMinutes:(J)Ljava/time/LocalTime;
   #948 = NameAndType        #949:#950    // plusMinutes:(J)Ljava/time/LocalTime;
   #949 = Utf8               plusMinutes
   #950 = Utf8               (J)Ljava/time/LocalTime;
   #951 = Methodref          #952.#953    // java/time/Duration.between:(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
   #952 = Class              #954         // java/time/Duration
   #953 = NameAndType        #955:#956    // between:(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
   #954 = Utf8               java/time/Duration
   #955 = Utf8               between
   #956 = Utf8               (Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
   #957 = Methodref          #952.#958    // java/time/Duration.isNegative:()Z
   #958 = NameAndType        #959:#64     // isNegative:()Z
   #959 = Utf8               isNegative
   #960 = Methodref          #952.#961    // java/time/Duration.toMinutes:()J
   #961 = NameAndType        #962:#837    // toMinutes:()J
   #962 = Utf8               toMinutes
   #963 = InvokeDynamic      #4:#964      // #4:makeConcatWithConstants:(Ljava/lang/String;J)Ljava/lang/String;
   #964 = NameAndType        #111:#965    // makeConcatWithConstants:(Ljava/lang/String;J)Ljava/lang/String;
   #965 = Utf8               (Ljava/lang/String;J)Ljava/lang/String;
   #966 = Fieldref           #133.#967    // ext/mods/Config.CTF_EVENT_ENABLED:Z
   #967 = NameAndType        #968:#137    // CTF_EVENT_ENABLED:Z
   #968 = Utf8               CTF_EVENT_ENABLED
   #969 = Methodref          #569.#970    // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isParticipating:()Z
   #970 = NameAndType        #971:#64     // isParticipating:()Z
   #971 = Utf8               isParticipating
   #972 = Methodref          #569.#973    // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
   #973 = NameAndType        #974:#64     // isStarted:()Z
   #974 = Utf8               isStarted
   #975 = Class              #976         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
   #976 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
   #977 = Fieldref           #133.#978    // ext/mods/Config.DM_EVENT_ENABLED:Z
   #978 = NameAndType        #979:#137    // DM_EVENT_ENABLED:Z
   #979 = Utf8               DM_EVENT_ENABLED
   #980 = Methodref          #577.#970    // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isParticipating:()Z
   #981 = Methodref          #577.#973    // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
   #982 = Class              #983         // ext/mods/gameserver/model/entity/events/deathmatch/DMManager
   #983 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMManager
   #984 = Fieldref           #133.#985    // ext/mods/Config.LM_EVENT_ENABLED:Z
   #985 = NameAndType        #986:#137    // LM_EVENT_ENABLED:Z
   #986 = Utf8               LM_EVENT_ENABLED
   #987 = Methodref          #583.#970    // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isParticipating:()Z
   #988 = Methodref          #583.#973    // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
   #989 = Class              #990         // ext/mods/gameserver/model/entity/events/lastman/LMManager
   #990 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMManager
   #991 = Fieldref           #133.#992    // ext/mods/Config.TVT_EVENT_ENABLED:Z
   #992 = NameAndType        #993:#137    // TVT_EVENT_ENABLED:Z
   #993 = Utf8               TVT_EVENT_ENABLED
   #994 = Methodref          #589.#970    // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isParticipating:()Z
   #995 = Methodref          #589.#973    // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
   #996 = Class              #997         // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager
   #997 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager
   #998 = Methodref          #999.#1000   // ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
   #999 = Class              #1001        // ext/mods/Crypta/RandomManager
  #1000 = NameAndType        #11:#1002    // getInstance:()Lext/mods/Crypta/RandomManager;
  #1001 = Utf8               ext/mods/Crypta/RandomManager
  #1002 = Utf8               ()Lext/mods/Crypta/RandomManager;
  #1003 = Methodref          #999.#1004   // ext/mods/Crypta/RandomManager.getActiveZones:()Ljava/util/List;
  #1004 = NameAndType        #1005:#52    // getActiveZones:()Ljava/util/List;
  #1005 = Utf8               getActiveZones
  #1006 = Class              #1007        // ext/mods/gameserver/model/zone/type/RandomZone
  #1007 = Utf8               ext/mods/gameserver/model/zone/type/RandomZone
  #1008 = Methodref          #1006.#1009  // ext/mods/gameserver/model/zone/type/RandomZone.isActive:()Z
  #1009 = NameAndType        #1010:#64    // isActive:()Z
  #1010 = Utf8               isActive
  #1011 = Methodref          #521.#1012   // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #1012 = NameAndType        #1013:#1014  // valueOf:(I)Ljava/lang/Integer;
  #1013 = Utf8               valueOf
  #1014 = Utf8               (I)Ljava/lang/Integer;
  #1015 = Methodref          #1016.#1017  // ext/mods/levelupmaker/LevelUpMakerManager.getInstance:()Lext/mods/levelupmaker/LevelUpMakerManager;
  #1016 = Class              #1018        // ext/mods/levelupmaker/LevelUpMakerManager
  #1017 = NameAndType        #11:#1019    // getInstance:()Lext/mods/levelupmaker/LevelUpMakerManager;
  #1018 = Utf8               ext/mods/levelupmaker/LevelUpMakerManager
  #1019 = Utf8               ()Lext/mods/levelupmaker/LevelUpMakerManager;
  #1020 = Methodref          #1016.#1021  // ext/mods/levelupmaker/LevelUpMakerManager.sendQuestionMark:(Lext/mods/gameserver/model/actor/Player;)V
  #1021 = NameAndType        #1022:#247   // sendQuestionMark:(Lext/mods/gameserver/model/actor/Player;)V
  #1022 = Utf8               sendQuestionMark
  #1023 = Methodref          #1024.#1025  // ext/mods/protection/hwid/hwid.isProtectionOn:()Z
  #1024 = Class              #1026        // ext/mods/protection/hwid/hwid
  #1025 = NameAndType        #1027:#64    // isProtectionOn:()Z
  #1026 = Utf8               ext/mods/protection/hwid/hwid
  #1027 = Utf8               isProtectionOn
  #1028 = Methodref          #1024.#1029  // ext/mods/protection/hwid/hwid.enterlog:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/GameClient;)V
  #1029 = NameAndType        #1030:#795   // enterlog:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/GameClient;)V
  #1030 = Utf8               enterlog
  #1031 = Fieldref           #1032.#1033  // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #1032 = Class              #1034        // ext/mods/gameserver/network/serverpackets/ActionFailed
  #1033 = NameAndType        #708:#1035   // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #1034 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #1035 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #1036 = Class              #1037        // java/text/SimpleDateFormat
  #1037 = Utf8               java/text/SimpleDateFormat
  #1038 = String             #1039        // dd/MM/yyyy HH:mm:ss
  #1039 = Utf8               dd/MM/yyyy HH:mm:ss
  #1040 = Methodref          #1036.#703   // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #1041 = Class              #1042        // java/util/Date
  #1042 = Utf8               java/util/Date
  #1043 = Methodref          #42.#1044    // ext/mods/gameserver/model/actor/Player.getPremServiceData:()J
  #1044 = NameAndType        #1045:#837   // getPremServiceData:()J
  #1045 = Utf8               getPremServiceData
  #1046 = Methodref          #1041.#1047  // java/util/Date."<init>":(J)V
  #1047 = NameAndType        #5:#1048     // "<init>":(J)V
  #1048 = Utf8               (J)V
  #1049 = Class              #1050        // java/lang/Object
  #1050 = Utf8               java/lang/Object
  #1051 = Methodref          #1036.#1052  // java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
  #1052 = NameAndType        #1053:#1054  // format:(Ljava/util/Date;)Ljava/lang/String;
  #1053 = Utf8               format
  #1054 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
  #1055 = Methodref          #42.#1056    // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #1056 = NameAndType        #1057:#1058  // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #1057 = Utf8               getSysString
  #1058 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #1059 = Methodref          #42.#1060    // ext/mods/gameserver/model/actor/Player.getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
  #1060 = NameAndType        #1061:#1062  // getMemos:()Lext/mods/gameserver/model/memo/PlayerMemo;
  #1061 = Utf8               getMemos
  #1062 = Utf8               ()Lext/mods/gameserver/model/memo/PlayerMemo;
  #1063 = String             #1064        // PlayerColorName
  #1064 = Utf8               PlayerColorName
  #1065 = Methodref          #1066.#1067  // ext/mods/gameserver/model/memo/PlayerMemo.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #1066 = Class              #1068        // ext/mods/gameserver/model/memo/PlayerMemo
  #1067 = NameAndType        #1069:#1070  // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #1068 = Utf8               ext/mods/gameserver/model/memo/PlayerMemo
  #1069 = Utf8               get
  #1070 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #1071 = String             #1072        // PlayerColorTitle
  #1072 = Utf8               PlayerColorTitle
  #1073 = InvokeDynamic      #5:#1074     // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1074 = NameAndType        #111:#1075   // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1075 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #1076 = Methodref          #521.#1077   // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #1077 = NameAndType        #1078:#1079  // decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #1078 = Utf8               decode
  #1079 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #1080 = Methodref          #42.#1081    // ext/mods/gameserver/model/actor/Player.setNameColor:(I)I
  #1081 = NameAndType        #227:#1082   // setNameColor:(I)I
  #1082 = Utf8               (I)I
  #1083 = Methodref          #42.#1084    // ext/mods/gameserver/model/actor/Player.setTitleColor:(I)I
  #1084 = NameAndType        #233:#1082   // setTitleColor:(I)I
  #1085 = Methodref          #887.#786    // ext/mods/gameserver/scripting/Quest.onEnterWorld:(Lext/mods/gameserver/model/actor/Player;)V
  #1086 = Methodref          #347.#420    // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
  #1087 = Methodref          #290.#1088   // ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
  #1088 = NameAndType        #1089:#96    // getCastleId:()I
  #1089 = Utf8               getCastleId
  #1090 = Utf8               Code
  #1091 = Utf8               LineNumberTable
  #1092 = Utf8               LocalVariableTable
  #1093 = Utf8               this
  #1094 = Utf8               Lext/mods/gameserver/network/clientpackets/EnterWorld;
  #1095 = Utf8               readImpl
  #1096 = Utf8               runImpl
  #1097 = Utf8               message
  #1098 = Utf8               Ljava/lang/String;
  #1099 = Utf8               grade
  #1100 = Utf8               Lext/mods/gameserver/enums/items/CrystalType;
  #1101 = Utf8               item
  #1102 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1103 = Utf8               member
  #1104 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #1105 = Utf8               sponsor
  #1106 = Utf8               apprentice
  #1107 = Utf8               skills
  #1108 = Utf8               Ljava/util/Map;
  #1109 = Utf8               siege
  #1110 = Utf8               Lext/mods/gameserver/model/residence/castle/Siege;
  #1111 = Utf8               type
  #1112 = Utf8               castle
  #1113 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #1114 = Utf8               hall
  #1115 = Utf8               Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #1116 = Utf8               sp
  #1117 = Utf8               Lext/mods/gameserver/model/pledge/SubPledge;
  #1118 = Utf8               sm
  #1119 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #1120 = Utf8               psmlu
  #1121 = Utf8               Lext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate;
  #1122 = Utf8               ch
  #1123 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #1124 = Utf8               cabal
  #1125 = Utf8               couple
  #1126 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #1127 = Utf8               coupleEntry
  #1128 = Utf8               Ljava/util/Map$Entry;
  #1129 = Utf8               itemId
  #1130 = Utf8               itemIds
  #1131 = Utf8               [I
  #1132 = Utf8               html
  #1133 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #1134 = Utf8               startTime
  #1135 = Utf8               Ljava/time/LocalTime;
  #1136 = Utf8               durationMinutes
  #1137 = Utf8               remaining
  #1138 = Utf8               Ljava/time/Duration;
  #1139 = Utf8               minutes
  #1140 = Utf8               J
  #1141 = Utf8               lastStart
  #1142 = Utf8               qmId
  #1143 = Utf8               Ljava/lang/Integer;
  #1144 = Utf8               zone
  #1145 = Utf8               Lext/mods/gameserver/model/zone/type/RandomZone;
  #1146 = Utf8               gs
  #1147 = Utf8               Lext/mods/gameserver/GameServer;
  #1148 = Utf8               player
  #1149 = Utf8               objectId
  #1150 = Utf8               clan
  #1151 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #1152 = Utf8               qs
  #1153 = Utf8               Lext/mods/gameserver/scripting/QuestState;
  #1154 = Utf8               LocalVariableTypeTable
  #1155 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #1156 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #1157 = Utf8               StackMapTable
  #1158 = Class              #1159        // "[Lext/mods/gameserver/model/actor/Player;"
  #1159 = Utf8               [Lext/mods/gameserver/model/actor/Player;
  #1160 = Class              #1161        // "[Lext/mods/gameserver/model/pledge/SubPledge;"
  #1161 = Utf8               [Lext/mods/gameserver/model/pledge/SubPledge;
  #1162 = Class              #1131        // "[I"
  #1163 = Utf8               df
  #1164 = Utf8               Ljava/text/SimpleDateFormat;
  #1165 = Utf8               dt
  #1166 = Utf8               Ljava/util/Date;
  #1167 = Utf8               color
  #1168 = Utf8               title
  #1169 = Utf8               triggersOnActionRequest
  #1170 = Utf8               lambda$runImpl$1
  #1171 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
  #1172 = Utf8               q
  #1173 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #1174 = Utf8               lambda$runImpl$0
  #1175 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1176 = Utf8               skillId
  #1177 = Utf8               skillLvl
  #1178 = Utf8               SourceFile
  #1179 = Utf8               EnterWorld.java
  #1180 = Utf8               BootstrapMethods
  #1181 = String             #1182        // Item \u0001 was removed: \u0001
  #1182 = Utf8               Item \u0001 was removed: \u0001
  #1183 = MethodType         #1184        //  (Ljava/lang/Object;Ljava/lang/Object;)V
  #1184 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #1185 = MethodHandle       6:#1186      // REF_invokeStatic ext/mods/gameserver/network/clientpackets/EnterWorld.lambda$runImpl$0:(Lext/mods/gameserver/model/residence/castle/Castle;Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1186 = Methodref          #17.#1187    // ext/mods/gameserver/network/clientpackets/EnterWorld.lambda$runImpl$0:(Lext/mods/gameserver/model/residence/castle/Castle;Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1187 = NameAndType        #1174:#1175  // lambda$runImpl$0:(Lext/mods/gameserver/model/residence/castle/Castle;Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1188 = MethodType         #1189        //  (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1189 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #1190 = MethodType         #1191        //  (Ljava/lang/Object;)Z
  #1191 = Utf8               (Ljava/lang/Object;)Z
  #1192 = MethodHandle       5:#1193      // REF_invokeVirtual ext/mods/gameserver/scripting/Quest.isTriggeredOnEnterWorld:()Z
  #1193 = Methodref          #887.#1194   // ext/mods/gameserver/scripting/Quest.isTriggeredOnEnterWorld:()Z
  #1194 = NameAndType        #1195:#64    // isTriggeredOnEnterWorld:()Z
  #1195 = Utf8               isTriggeredOnEnterWorld
  #1196 = MethodType         #1197        //  (Lext/mods/gameserver/scripting/Quest;)Z
  #1197 = Utf8               (Lext/mods/gameserver/scripting/Quest;)Z
  #1198 = MethodType         #1199        //  (Ljava/lang/Object;)V
  #1199 = Utf8               (Ljava/lang/Object;)V
  #1200 = MethodHandle       6:#1201      // REF_invokeStatic ext/mods/gameserver/network/clientpackets/EnterWorld.lambda$runImpl$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
  #1201 = Methodref          #17.#1202    // ext/mods/gameserver/network/clientpackets/EnterWorld.lambda$runImpl$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
  #1202 = NameAndType        #1170:#1171  // lambda$runImpl$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
  #1203 = MethodType         #1204        //  (Lext/mods/gameserver/scripting/Quest;)V
  #1204 = Utf8               (Lext/mods/gameserver/scripting/Quest;)V
  #1205 = String             #1206        // Tournament is live! Started at \u0001h. Remaining time: \u0001 minute(s).
  #1206 = Utf8               Tournament is live! Started at \u0001h. Remaining time: \u0001 minute(s).
  #1207 = String             #1208        // 0x\u0001
  #1208 = Utf8               0x\u0001
  #1209 = MethodHandle       6:#1210      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1210 = Methodref          #1211.#1212  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1211 = Class              #1213        // java/lang/invoke/StringConcatFactory
  #1212 = NameAndType        #111:#1214   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1213 = Utf8               java/lang/invoke/StringConcatFactory
  #1214 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1215 = MethodHandle       6:#1216      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1216 = Methodref          #1217.#1218  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1217 = Class              #1219        // java/lang/invoke/LambdaMetafactory
  #1218 = NameAndType        #1220:#1221  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1219 = Utf8               java/lang/invoke/LambdaMetafactory
  #1220 = Utf8               metafactory
  #1221 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1222 = Utf8               InnerClasses
  #1223 = Utf8               GameClientState
  #1224 = Utf8               FrequentSkill
  #1225 = Utf8               Entry
  #1226 = Class              #1227        // java/lang/invoke/MethodHandles$Lookup
  #1227 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1228 = Class              #1229        // java/lang/invoke/MethodHandles
  #1229 = Utf8               java/lang/invoke/MethodHandles
  #1230 = Utf8               Lookup
{
  public ext.mods.gameserver.network.clientpackets.EnterWorld();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/EnterWorld;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/network/clientpackets/EnterWorld;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=13, args_size=1
         0: invokestatic  #7                  // Method ext/mods/gameserver/GameServer.getInstance:()Lext/mods/gameserver/GameServer;
         3: astore_1
         4: aload_1
         5: ifnull        12
         8: aload_1
         9: invokevirtual #13                 // Method ext/mods/gameserver/GameServer.awaitNpcsSpawnsReady:()V
        12: aload_0
        13: invokevirtual #16                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        16: checkcast     #22                 // class ext/mods/gameserver/network/GameClient
        19: invokevirtual #24                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        22: astore_2
        23: aload_2
        24: ifnonnull     38
        27: aload_0
        28: invokevirtual #16                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        31: checkcast     #22                 // class ext/mods/gameserver/network/GameClient
        34: invokevirtual #28                 // Method ext/mods/gameserver/network/GameClient.closeNow:()V
        37: return
        38: aload_0
        39: invokevirtual #16                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        42: checkcast     #22                 // class ext/mods/gameserver/network/GameClient
        45: getstatic     #31                 // Field ext/mods/gameserver/network/GameClient$GameClientState.IN_GAME:Lext/mods/gameserver/network/GameClient$GameClientState;
        48: invokevirtual #37                 // Method ext/mods/gameserver/network/GameClient.setState:(Lext/mods/gameserver/network/GameClient$GameClientState;)V
        51: aload_2
        52: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        55: invokevirtual #47                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
        58: invokeinterface #53,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        63: astore_3
        64: aload_3
        65: invokeinterface #59,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        70: ifeq          163
        73: aload_3
        74: invokeinterface #65,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        79: checkcast     #69                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        82: astore        4
        84: aload         4
        86: ifnull        64
        89: aload         4
        91: invokevirtual #71                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
        94: ifne          100
        97: goto          64
       100: aload         4
       102: invokevirtual #74                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       105: invokevirtual #78                 // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
       108: astore        5
       110: invokestatic  #84                 // Method ext/mods/gameserver/custom/data/EquipGradeRestrictionData.getInstance:()Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
       113: aload         5
       115: invokevirtual #89                 // Method ext/mods/gameserver/custom/data/EquipGradeRestrictionData.isEquipAllowed:(Lext/mods/gameserver/enums/items/CrystalType;)Z
       118: ifne          160
       121: aload_2
       122: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       125: aload         4
       127: invokevirtual #93                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocationSlot:()I
       130: invokevirtual #97                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.unequipItemInSlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       133: pop
       134: invokestatic  #84                 // Method ext/mods/gameserver/custom/data/EquipGradeRestrictionData.getInstance:()Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
       137: aload         5
       139: invokevirtual #101                // Method ext/mods/gameserver/custom/data/EquipGradeRestrictionData.getBlockMessage:(Lext/mods/gameserver/enums/items/CrystalType;)Ljava/lang/String;
       142: astore        6
       144: aload_2
       145: aload         4
       147: invokevirtual #105                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
       150: aload         6
       152: invokedynamic #109,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       157: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       160: goto          64
       163: aload_2
       164: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       167: istore_3
       168: invokestatic  #120                // Method ext/mods/gameserver/data/manager/DropSkipManager.getInstance:()Lext/mods/gameserver/data/manager/DropSkipManager;
       171: iload_3
       172: invokevirtual #125                // Method ext/mods/gameserver/data/manager/DropSkipManager.loadPlayer:(I)V
       175: aload_2
       176: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       179: ifeq          310
       182: getstatic     #132                // Field ext/mods/Config.SUPER_HASTE:Z
       185: ifeq          204
       188: invokestatic  #138                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       191: sipush        7029
       194: iconst_4
       195: invokevirtual #143                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       198: aload_2
       199: aload_2
       200: invokevirtual #147                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       203: pop
       204: getstatic     #153                // Field ext/mods/Config.GM_STARTUP_INVULNERABLE:Z
       207: ifeq          230
       210: invokestatic  #156                // Method ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
       213: ldc           #161                // String admin_invul
       215: aload_2
       216: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
       219: invokevirtual #167                // Method ext/mods/gameserver/data/xml/AdminData.hasAccess:(Ljava/lang/String;Lext/mods/gameserver/model/AccessLevel;)Z
       222: ifeq          230
       225: aload_2
       226: iconst_1
       227: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.setInvul:(Z)V
       230: getstatic     #175                // Field ext/mods/Config.GM_STARTUP_INVISIBLE:Z
       233: ifeq          259
       236: invokestatic  #156                // Method ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
       239: ldc           #178                // String admin_hide
       241: aload_2
       242: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
       245: invokevirtual #167                // Method ext/mods/gameserver/data/xml/AdminData.hasAccess:(Ljava/lang/String;Lext/mods/gameserver/model/AccessLevel;)Z
       248: ifeq          259
       251: aload_2
       252: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
       255: iconst_0
       256: invokevirtual #184                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setVisible:(Z)V
       259: getstatic     #189                // Field ext/mods/Config.GM_STARTUP_BLOCK_ALL:Z
       262: ifeq          270
       265: aload_2
       266: iconst_1
       267: invokevirtual #192                // Method ext/mods/gameserver/model/actor/Player.setInBlockingAll:(Z)V
       270: getstatic     #195                // Field ext/mods/Config.GM_STARTUP_AUTO_LIST:Z
       273: ifeq          302
       276: invokestatic  #156                // Method ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
       279: ldc           #198                // String admin_gmlist
       281: aload_2
       282: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
       285: invokevirtual #167                // Method ext/mods/gameserver/data/xml/AdminData.hasAccess:(Ljava/lang/String;Lext/mods/gameserver/model/AccessLevel;)Z
       288: ifeq          302
       291: invokestatic  #156                // Method ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
       294: aload_2
       295: iconst_0
       296: invokevirtual #200                // Method ext/mods/gameserver/data/xml/AdminData.addGm:(Lext/mods/gameserver/model/actor/Player;Z)V
       299: goto          310
       302: invokestatic  #156                // Method ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
       305: aload_2
       306: iconst_1
       307: invokevirtual #200                // Method ext/mods/gameserver/data/xml/AdminData.addGm:(Lext/mods/gameserver/model/actor/Player;Z)V
       310: aload_2
       311: invokevirtual #204                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       314: invokevirtual #208                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
       317: ldc2_w        #214                // double 0.5d
       320: dcmpg
       321: ifge          336
       324: aload_2
       325: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.isMortal:()Z
       328: ifeq          336
       331: aload_2
       332: iconst_1
       333: invokevirtual #219                // Method ext/mods/gameserver/model/actor/Player.setIsDead:(Z)V
       336: aload_2
       337: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.getNameColor:()I
       340: ifeq          354
       343: aload_2
       344: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
       347: aload_2
       348: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.getNameColor:()I
       351: invokevirtual #225                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setNameColor:(I)V
       354: aload_2
       355: invokevirtual #228                // Method ext/mods/gameserver/model/actor/Player.getTitleColor:()I
       358: ifeq          372
       361: aload_2
       362: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
       365: aload_2
       366: invokevirtual #228                // Method ext/mods/gameserver/model/actor/Player.getTitleColor:()I
       369: invokevirtual #231                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setTitleColor:(I)V
       372: aload_2
       373: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getMacroList:()Lext/mods/gameserver/model/actor/container/player/MacroList;
       376: invokevirtual #238                // Method ext/mods/gameserver/model/actor/container/player/MacroList.sendUpdate:()V
       379: aload_2
       380: new           #243                // class ext/mods/gameserver/network/serverpackets/ExStorageMaxCount
       383: dup
       384: aload_2
       385: invokespecial #245                // Method ext/mods/gameserver/network/serverpackets/ExStorageMaxCount."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       388: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       391: aload_2
       392: new           #252                // class ext/mods/gameserver/network/serverpackets/HennaInfo
       395: dup
       396: aload_2
       397: invokespecial #254                // Method ext/mods/gameserver/network/serverpackets/HennaInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       400: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       403: aload_2
       404: invokevirtual #255                // Method ext/mods/gameserver/model/actor/Player.updateEffectIcons:()V
       407: aload_2
       408: new           #258                // class ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
       411: dup
       412: aload_2
       413: invokespecial #260                // Method ext/mods/gameserver/network/serverpackets/EtcStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       416: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       419: aload_2
       420: invokevirtual #261                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       423: astore        4
       425: aload         4
       427: ifnull        913
       430: aload_2
       431: new           #265                // class ext/mods/gameserver/network/serverpackets/PledgeSkillList
       434: dup
       435: aload         4
       437: invokespecial #267                // Method ext/mods/gameserver/network/serverpackets/PledgeSkillList."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
       440: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       443: getstatic     #270                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_MEMBER_S1_LOGGED_IN:Lext/mods/gameserver/network/SystemMessageId;
       446: invokestatic  #276                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       449: aload_2
       450: invokevirtual #282                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       453: astore        5
       455: new           #286                // class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate
       458: dup
       459: aload_2
       460: invokespecial #288                // Method ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       463: astore        6
       465: aload         4
       467: invokevirtual #289                // Method ext/mods/gameserver/model/pledge/Clan.getOnlineMembers:()[Lext/mods/gameserver/model/actor/Player;
       470: astore        7
       472: aload         7
       474: arraylength
       475: istore        8
       477: iconst_0
       478: istore        9
       480: iload         9
       482: iload         8
       484: if_icmpge     523
       487: aload         7
       489: iload         9
       491: aaload
       492: astore        10
       494: aload         10
       496: aload_2
       497: if_acmpne     503
       500: goto          517
       503: aload         10
       505: aload         5
       507: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       510: aload         10
       512: aload         6
       514: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       517: iinc          9, 1
       520: goto          480
       523: aload_2
       524: invokevirtual #295                // Method ext/mods/gameserver/model/actor/Player.getSponsor:()I
       527: ifeq          565
       530: invokestatic  #298                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       533: aload_2
       534: invokevirtual #295                // Method ext/mods/gameserver/model/actor/Player.getSponsor:()I
       537: invokevirtual #303                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
       540: astore        7
       542: aload         7
       544: ifnull        562
       547: aload         7
       549: getstatic     #306                // Field ext/mods/gameserver/network/SystemMessageId.YOUR_APPRENTICE_S1_HAS_LOGGED_IN:Lext/mods/gameserver/network/SystemMessageId;
       552: invokestatic  #276                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       555: aload_2
       556: invokevirtual #282                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       559: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       562: goto          604
       565: aload_2
       566: invokevirtual #309                // Method ext/mods/gameserver/model/actor/Player.getApprentice:()I
       569: ifeq          604
       572: invokestatic  #298                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       575: aload_2
       576: invokevirtual #309                // Method ext/mods/gameserver/model/actor/Player.getApprentice:()I
       579: invokevirtual #303                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
       582: astore        7
       584: aload         7
       586: ifnull        604
       589: aload         7
       591: getstatic     #312                // Field ext/mods/gameserver/network/SystemMessageId.YOUR_SPONSOR_S1_HAS_LOGGED_IN:Lext/mods/gameserver/network/SystemMessageId;
       594: invokestatic  #276                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       597: aload_2
       598: invokevirtual #282                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       601: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       604: invokestatic  #315                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       607: aload         4
       609: invokevirtual #320                // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHallByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       612: astore        7
       614: aload         7
       616: ifnull        634
       619: aload         7
       621: invokevirtual #324                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getPaid:()Z
       624: ifne          634
       627: aload_2
       628: getstatic     #329                // Field ext/mods/gameserver/network/SystemMessageId.PAYMENT_FOR_YOUR_CLAN_HALL_HAS_NOT_BEEN_MADE_PLEASE_MAKE_PAYMENT_TO_YOUR_CLAN_WAREHOUSE_BY_S1_TOMORROW:Lext/mods/gameserver/network/SystemMessageId;
       631: invokevirtual #332                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       634: invokestatic  #335                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       637: invokevirtual #340                // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
       640: invokeinterface #344,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       645: astore        8
       647: aload         8
       649: invokeinterface #59,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       654: ifeq          773
       657: aload         8
       659: invokeinterface #65,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       664: checkcast     #347                // class ext/mods/gameserver/model/residence/castle/Castle
       667: astore        9
       669: aload_2
       670: invokevirtual #349                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
       673: ifeq          684
       676: aload         9
       678: invokevirtual #352                // Method ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
       681: goto          689
       684: aload         9
       686: invokevirtual #356                // Method ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
       689: astore        10
       691: aload         10
       693: aload         9
       695: aload_2
       696: invokedynamic #359,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/residence/castle/Castle;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
       701: invokeinterface #363,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
       706: aload         9
       708: invokevirtual #369                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       711: astore        11
       713: aload         11
       715: invokevirtual #373                // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
       718: ifne          724
       721: goto          647
       724: aload         11
       726: aload         4
       728: invokevirtual #378                // Method ext/mods/gameserver/model/residence/castle/Siege.getSide:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/enums/SiegeSide;
       731: astore        12
       733: aload         12
       735: getstatic     #382                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
       738: if_acmpne     749
       741: aload_2
       742: iconst_1
       743: invokevirtual #388                // Method ext/mods/gameserver/model/actor/Player.setSiegeState:(I)V
       746: goto          770
       749: aload         12
       751: getstatic     #391                // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
       754: if_acmpeq     765
       757: aload         12
       759: getstatic     #394                // Field ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
       762: if_acmpne     770
       765: aload_2
       766: iconst_2
       767: invokevirtual #388                // Method ext/mods/gameserver/model/actor/Player.setSiegeState:(I)V
       770: goto          647
       773: invokestatic  #315                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       776: invokevirtual #397                // Method ext/mods/gameserver/data/manager/ClanHallManager.getSiegableHalls:()Ljava/util/List;
       779: invokeinterface #53,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       784: astore        8
       786: aload         8
       788: invokeinterface #59,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       793: ifeq          834
       796: aload         8
       798: invokeinterface #65,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       803: checkcast     #400                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
       806: astore        9
       808: aload         9
       810: invokevirtual #402                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
       813: ifeq          831
       816: aload         9
       818: aload         4
       820: invokevirtual #405                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.isRegistered:(Lext/mods/gameserver/model/pledge/Clan;)Z
       823: ifeq          831
       826: aload_2
       827: iconst_1
       828: invokevirtual #388                // Method ext/mods/gameserver/model/actor/Player.setSiegeState:(I)V
       831: goto          786
       834: aload_2
       835: new           #286                // class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate
       838: dup
       839: aload_2
       840: invokespecial #288                // Method ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       843: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       846: aload_2
       847: new           #409                // class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
       850: dup
       851: aload         4
       853: iconst_0
       854: invokespecial #411                // Method ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll."<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
       857: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       860: aload         4
       862: invokevirtual #414                // Method ext/mods/gameserver/model/pledge/Clan.getAllSubPledges:()[Lext/mods/gameserver/model/pledge/SubPledge;
       865: astore        8
       867: aload         8
       869: arraylength
       870: istore        9
       872: iconst_0
       873: istore        10
       875: iload         10
       877: iload         9
       879: if_icmpge     913
       882: aload         8
       884: iload         10
       886: aaload
       887: astore        11
       889: aload_2
       890: new           #409                // class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
       893: dup
       894: aload         4
       896: aload         11
       898: invokevirtual #418                // Method ext/mods/gameserver/model/pledge/SubPledge.getId:()I
       901: invokespecial #411                // Method ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll."<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
       904: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       907: iinc          10, 1
       910: goto          875
       913: invokestatic  #423                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       916: invokevirtual #428                // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
       919: ifeq          998
       922: invokestatic  #423                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       925: getstatic     #431                // Field ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
       928: invokevirtual #437                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
       931: getstatic     #441                // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
       934: if_acmpeq     998
       937: invokestatic  #423                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       940: iload_3
       941: invokevirtual #447                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
       944: astore        5
       946: aload         5
       948: getstatic     #441                // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
       951: if_acmpeq     995
       954: aload         5
       956: invokestatic  #423                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       959: getstatic     #431                // Field ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
       962: invokevirtual #437                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
       965: if_acmpne     983
       968: aload_2
       969: getstatic     #451                // Field ext/mods/gameserver/data/SkillTable$FrequentSkill.THE_VICTOR_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       972: invokevirtual #457                // Method ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       975: iconst_0
       976: invokevirtual #461                // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       979: pop
       980: goto          995
       983: aload_2
       984: getstatic     #465                // Field ext/mods/gameserver/data/SkillTable$FrequentSkill.THE_VANQUISHED_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       987: invokevirtual #457                // Method ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       990: iconst_0
       991: invokevirtual #461                // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       994: pop
       995: goto          1028
       998: aload_2
       999: getstatic     #451                // Field ext/mods/gameserver/data/SkillTable$FrequentSkill.THE_VICTOR_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
      1002: invokevirtual #457                // Method ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
      1005: invokevirtual #468                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
      1008: iconst_0
      1009: invokevirtual #469                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
      1012: pop
      1013: aload_2
      1014: getstatic     #465                // Field ext/mods/gameserver/data/SkillTable$FrequentSkill.THE_VANQUISHED_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
      1017: invokevirtual #457                // Method ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
      1020: invokevirtual #468                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
      1023: iconst_0
      1024: invokevirtual #469                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
      1027: pop
      1028: getstatic     #473                // Field ext/mods/Config.PLAYER_SPAWN_PROTECTION:I
      1031: ifle          1039
      1034: aload_2
      1035: iconst_1
      1036: invokevirtual #477                // Method ext/mods/gameserver/model/actor/Player.setSpawnProtection:(Z)V
      1039: aload_2
      1040: invokevirtual #480                // Method ext/mods/gameserver/model/actor/Player.spawnMe:()V
      1043: aload_2
      1044: aload_2
      1045: invokevirtual #483                // Method ext/mods/gameserver/model/actor/Player.getX:()I
      1048: aload_2
      1049: invokevirtual #486                // Method ext/mods/gameserver/model/actor/Player.getY:()I
      1052: sipush        -16000
      1055: invokevirtual #489                // Method ext/mods/gameserver/model/actor/Player.setEnterWorldLoc:(III)V
      1058: invokestatic  #493                // Method ext/mods/gameserver/data/manager/CoupleManager.getInstance:()Lext/mods/gameserver/data/manager/CoupleManager;
      1061: invokevirtual #498                // Method ext/mods/gameserver/data/manager/CoupleManager.getCouples:()Ljava/util/Map;
      1064: invokeinterface #501,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
      1069: invokeinterface #505,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      1074: astore        5
      1076: aload         5
      1078: invokeinterface #59,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      1083: ifeq          1151
      1086: aload         5
      1088: invokeinterface #65,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1093: checkcast     #508                // class java/util/Map$Entry
      1096: astore        6
      1098: aload         6
      1100: invokeinterface #510,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      1105: checkcast     #513                // class ext/mods/gameserver/model/holder/IntIntHolder
      1108: astore        7
      1110: aload         7
      1112: invokevirtual #515                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
      1115: iload_3
      1116: if_icmpeq     1128
      1119: aload         7
      1121: invokevirtual #516                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
      1124: iload_3
      1125: if_icmpne     1148
      1128: aload_2
      1129: aload         6
      1131: invokeinterface #518,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      1136: checkcast     #521                // class java/lang/Integer
      1139: invokevirtual #523                // Method java/lang/Integer.intValue:()I
      1142: invokevirtual #526                // Method ext/mods/gameserver/model/actor/Player.setCoupleId:(I)V
      1145: goto          1151
      1148: goto          1076
      1151: aload_2
      1152: invokevirtual #529                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
      1155: ifne          1252
      1158: iconst_2
      1159: newarray       int
      1161: dup
      1162: iconst_0
      1163: sipush        8190
      1166: iastore
      1167: dup
      1168: iconst_1
      1169: sipush        8689
      1172: iastore
      1173: astore        5
      1175: aload         5
      1177: astore        6
      1179: aload         6
      1181: arraylength
      1182: istore        7
      1184: iconst_0
      1185: istore        8
      1187: iload         8
      1189: iload         7
      1191: if_icmpge     1234
      1194: aload         6
      1196: iload         8
      1198: iaload
      1199: istore        9
      1201: aload_2
      1202: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
      1205: iload         9
      1207: invokevirtual #532                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
      1210: ifnull        1228
      1213: aload_2
      1214: aload_2
      1215: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
      1218: iload         9
      1220: invokevirtual #532                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
      1223: iconst_1
      1224: invokevirtual #535                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
      1227: pop
      1228: iinc          8, 1
      1231: goto          1187
      1234: aload_2
      1235: sipush        3630
      1238: iconst_1
      1239: invokevirtual #469                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
      1242: pop
      1243: aload_2
      1244: sipush        3631
      1247: iconst_1
      1248: invokevirtual #469                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
      1251: pop
      1252: aload_2
      1253: getstatic     #539                // Field ext/mods/gameserver/network/SystemMessageId.WELCOME_TO_LINEAGE:Lext/mods/gameserver/network/SystemMessageId;
      1256: invokevirtual #332                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1259: aload_2
      1260: invokestatic  #423                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
      1263: invokevirtual #542                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getCurrentPeriod:()Lext/mods/gameserver/enums/PeriodType;
      1266: invokevirtual #546                // Method ext/mods/gameserver/enums/PeriodType.getMessageId:()Lext/mods/gameserver/network/SystemMessageId;
      1269: invokevirtual #332                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1272: invokestatic  #552                // Method ext/mods/gameserver/data/xml/AnnouncementData.getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
      1275: aload_2
      1276: iconst_0
      1277: invokevirtual #557                // Method ext/mods/gameserver/data/xml/AnnouncementData.showAnnouncements:(Lext/mods/gameserver/model/actor/Player;Z)V
      1280: invokestatic  #560                // Method ext/mods/gameserver/data/manager/PcCafeManager.getInstance:()Lext/mods/gameserver/data/manager/PcCafeManager;
      1283: aload_2
      1284: invokevirtual #565                // Method ext/mods/gameserver/data/manager/PcCafeManager.onPlayerLogin:(Lext/mods/gameserver/model/actor/Player;)V
      1287: invokestatic  #568                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
      1290: aload_2
      1291: invokevirtual #573                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onLogin:(Lext/mods/gameserver/model/actor/Player;)V
      1294: invokestatic  #576                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
      1297: aload_2
      1298: invokevirtual #581                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onLogin:(Lext/mods/gameserver/model/actor/Player;)V
      1301: invokestatic  #582                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
      1304: aload_2
      1305: invokevirtual #587                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onLogin:(Lext/mods/gameserver/model/actor/Player;)V
      1308: invokestatic  #588                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
      1311: aload_2
      1312: invokevirtual #593                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onLogin:(Lext/mods/gameserver/model/actor/Player;)V
      1315: aload_2
      1316: invokevirtual #594                // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
      1319: getstatic     #598                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      1322: if_acmpne     1366
      1325: aload_2
      1326: sipush        294
      1329: invokevirtual #604                // Method ext/mods/gameserver/model/actor/Player.hasSkill:(I)Z
      1332: ifeq          1366
      1335: aload_2
      1336: invokestatic  #608                // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
      1339: invokevirtual #613                // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.isNight:()Z
      1342: ifeq          1351
      1345: getstatic     #616                // Field ext/mods/gameserver/network/SystemMessageId.NIGHT_S1_EFFECT_APPLIES:Lext/mods/gameserver/network/SystemMessageId;
      1348: goto          1354
      1351: getstatic     #619                // Field ext/mods/gameserver/network/SystemMessageId.DAY_S1_EFFECT_DISAPPEARS:Lext/mods/gameserver/network/SystemMessageId;
      1354: invokestatic  #276                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1357: sipush        294
      1360: invokevirtual #622                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1363: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1366: aload_2
      1367: invokevirtual #626                // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
      1370: invokedynamic #630,  0            // InvokeDynamic #2:test:()Ljava/util/function/Predicate;
      1375: invokevirtual #634                // Method ext/mods/gameserver/model/actor/container/player/QuestList.getQuests:(Ljava/util/function/Predicate;)Ljava/util/List;
      1378: aload_2
      1379: invokedynamic #640,  0            // InvokeDynamic #3:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
      1384: invokeinterface #643,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
      1389: aload_2
      1390: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
      1393: invokevirtual #646                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.updateWeight:()Z
      1396: pop
      1397: aload_2
      1398: new           #649                // class ext/mods/gameserver/network/serverpackets/QuestList
      1401: dup
      1402: aload_2
      1403: invokespecial #651                // Method ext/mods/gameserver/network/serverpackets/QuestList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
      1406: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1409: aload_2
      1410: new           #652                // class ext/mods/gameserver/network/serverpackets/SkillList
      1413: dup
      1414: aload_2
      1415: invokespecial #654                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
      1418: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1421: aload_2
      1422: new           #655                // class ext/mods/gameserver/network/serverpackets/FriendList
      1425: dup
      1426: aload_2
      1427: invokespecial #657                // Method ext/mods/gameserver/network/serverpackets/FriendList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
      1430: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1433: aload_2
      1434: new           #658                // class ext/mods/gameserver/network/serverpackets/UserInfo
      1437: dup
      1438: aload_2
      1439: invokespecial #660                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
      1442: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1445: aload_2
      1446: new           #661                // class ext/mods/gameserver/network/serverpackets/ItemList
      1449: dup
      1450: aload_2
      1451: iconst_0
      1452: invokespecial #663                // Method ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
      1455: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1458: aload_2
      1459: new           #665                // class ext/mods/gameserver/network/serverpackets/ShortCutInit
      1462: dup
      1463: aload_2
      1464: invokespecial #667                // Method ext/mods/gameserver/network/serverpackets/ShortCutInit."<init>":(Lext/mods/gameserver/model/actor/Player;)V
      1467: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1470: aload_2
      1471: aload_2
      1472: invokevirtual #204                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1475: invokevirtual #668                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
      1478: i2d
      1479: aload_2
      1480: invokevirtual #204                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1483: invokevirtual #208                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
      1486: invokevirtual #671                // Method ext/mods/gameserver/model/actor/Player.checkCondition:(DD)V
      1489: aload_2
      1490: invokevirtual #675                // Method ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
      1493: ifeq          1508
      1496: aload_2
      1497: new           #678                // class ext/mods/gameserver/network/serverpackets/Die
      1500: dup
      1501: aload_2
      1502: invokespecial #680                // Method ext/mods/gameserver/network/serverpackets/Die."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
      1505: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1508: getstatic     #683                // Field ext/mods/Config.ENABLE_COMMUNITY_BOARD:Z
      1511: ifeq          1552
      1514: invokestatic  #686                // Method ext/mods/gameserver/communitybbs/manager/MailBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/manager/MailBBSManager;
      1517: aload_2
      1518: invokevirtual #691                // Method ext/mods/gameserver/communitybbs/manager/MailBBSManager.checkIfUnreadMail:(Lext/mods/gameserver/model/actor/Player;)Z
      1521: ifeq          1552
      1524: aload_2
      1525: getstatic     #695                // Field ext/mods/gameserver/network/SystemMessageId.NEW_MAIL:Lext/mods/gameserver/network/SystemMessageId;
      1528: invokevirtual #332                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1531: aload_2
      1532: new           #698                // class ext/mods/gameserver/network/serverpackets/PlaySound
      1535: dup
      1536: ldc_w         #700                // String systemmsg_e.1233
      1539: invokespecial #702                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
      1542: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1545: aload_2
      1546: getstatic     #704                // Field ext/mods/gameserver/network/serverpackets/ExMailArrived.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExMailArrived;
      1549: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1552: getstatic     #683                // Field ext/mods/Config.ENABLE_COMMUNITY_BOARD:Z
      1555: ifeq          1655
      1558: aload         4
      1560: ifnull        1655
      1563: aload         4
      1565: invokevirtual #710                // Method ext/mods/gameserver/model/pledge/Clan.isNoticeEnabled:()Z
      1568: ifeq          1655
      1571: new           #713                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1574: dup
      1575: iconst_0
      1576: invokespecial #715                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1579: astore        5
      1581: aload         5
      1583: aload_2
      1584: invokevirtual #717                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1587: ldc_w         #721                // String html/clan_notice.htm
      1590: invokevirtual #723                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1593: aload         5
      1595: ldc_w         #727                // String %clan_name%
      1598: aload         4
      1600: invokevirtual #729                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
      1603: invokevirtual #730                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1606: aload         5
      1608: ldc_w         #734                // String %notice_text%
      1611: aload         4
      1613: invokevirtual #736                // Method ext/mods/gameserver/model/pledge/Clan.getNotice:()Ljava/lang/String;
      1616: ldc_w         #739                // String \r\n
      1619: ldc_w         #741                // String <br>
      1622: invokevirtual #743                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      1625: ldc_w         #748                // String action
      1628: ldc_w         #750                // String
      1631: invokevirtual #752                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1634: ldc_w         #755                // String bypass
      1637: ldc_w         #750                // String
      1640: invokevirtual #752                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1643: invokevirtual #730                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1646: aload_0
      1647: aload         5
      1649: invokevirtual #757                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1652: goto          1689
      1655: getstatic     #758                // Field ext/mods/Config.SERVER_NEWS:Z
      1658: ifeq          1689
      1661: new           #713                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1664: dup
      1665: iconst_0
      1666: invokespecial #715                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1669: astore        5
      1671: aload         5
      1673: aload_2
      1674: invokevirtual #717                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1677: ldc_w         #761                // String html/servnews.htm
      1680: invokevirtual #723                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1683: aload_0
      1684: aload         5
      1686: invokevirtual #757                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1689: aload_2
      1690: invokevirtual #763                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
      1693: iconst_1
      1694: if_icmpne     1702
      1697: aload_0
      1698: aload_2
      1699: invokevirtual #766                // Method onEnterPremium:(Lext/mods/gameserver/model/actor/Player;)V
      1702: invokestatic  #769                // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
      1705: aload_2
      1706: invokevirtual #774                // Method ext/mods/gameserver/data/manager/PetitionManager.checkActivePetition:(Lext/mods/gameserver/model/actor/Player;)V
      1709: aload_2
      1710: invokevirtual #777                // Method ext/mods/gameserver/model/actor/Player.onPlayerEnter:()V
      1713: invokestatic  #780                // Method ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
      1716: aload_2
      1717: invokevirtual #785                // Method ext/mods/Safedisconect/SafeDisconnectManager.onEnterWorld:(Lext/mods/gameserver/model/actor/Player;)V
      1720: invokestatic  #788                // Method ext/mods/gameserver/data/manager/CountryLocaleManager.getInstance:()Lext/mods/gameserver/data/manager/CountryLocaleManager;
      1723: aload_2
      1724: aload_0
      1725: invokevirtual #16                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
      1728: checkcast     #22                 // class ext/mods/gameserver/network/GameClient
      1731: invokevirtual #793                // Method ext/mods/gameserver/data/manager/CountryLocaleManager.onEnterWorld:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/GameClient;)V
      1734: getstatic     #796                // Field ext/mods/Config.ENABLE_PIX_MOD:Z
      1737: ifeq          1753
      1740: getstatic     #799                // Field ext/mods/Config.DONATION_ENABLED:Z
      1743: ifeq          1753
      1746: invokestatic  #802                // Method net/sf/donationmanager/DonationManager.getInstance:()Lnet/sf/donationmanager/DonationManager;
      1749: aload_2
      1750: invokevirtual #807                // Method net/sf/donationmanager/DonationManager.offlinePlayer:(Lext/mods/gameserver/model/actor/Player;)V
      1753: aload_2
      1754: invokevirtual #810                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
      1757: aload_0
      1758: new           #813                // class ext/mods/gameserver/network/serverpackets/SkillCoolTime
      1761: dup
      1762: aload_2
      1763: invokespecial #815                // Method ext/mods/gameserver/network/serverpackets/SkillCoolTime."<init>":(Lext/mods/gameserver/model/actor/Player;)V
      1766: invokevirtual #757                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1769: invokestatic  #816                // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
      1772: aload_2
      1773: invokevirtual #821                // Method ext/mods/gameserver/model/olympiad/Olympiad.playerInStadia:(Lext/mods/gameserver/model/actor/Player;)Z
      1776: ifeq          1786
      1779: aload_2
      1780: getstatic     #824                // Field ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
      1783: invokevirtual #830                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
      1786: aload_2
      1787: invokevirtual #834                // Method ext/mods/gameserver/model/actor/Player.getClanJoinExpiryTime:()J
      1790: invokestatic  #838                // Method java/lang/System.currentTimeMillis:()J
      1793: lcmp
      1794: ifle          1804
      1797: aload_2
      1798: getstatic     #843                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_MEMBERSHIP_TERMINATED:Lext/mods/gameserver/network/SystemMessageId;
      1801: invokevirtual #332                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1804: aload_2
      1805: getstatic     #846                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
      1808: invokevirtual #852                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
      1811: ifeq          1829
      1814: aload_2
      1815: invokevirtual #856                // Method ext/mods/gameserver/model/actor/Player.getSiegeState:()I
      1818: iconst_2
      1819: if_icmpge     1829
      1822: aload_2
      1823: getstatic     #824                // Field ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
      1826: invokevirtual #830                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
      1829: aload_2
      1830: getstatic     #859                // Field ext/mods/gameserver/enums/ZoneId.BOSS:Lext/mods/gameserver/enums/ZoneId;
      1833: invokevirtual #852                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
      1836: ifeq          1861
      1839: invokestatic  #838                // Method java/lang/System.currentTimeMillis:()J
      1842: aload_2
      1843: invokevirtual #862                // Method ext/mods/gameserver/model/actor/Player.getLastAccess:()J
      1846: lsub
      1847: ldc2_w        #865                // long 300000l
      1850: lcmp
      1851: ifle          1861
      1854: aload_2
      1855: getstatic     #824                // Field ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
      1858: invokevirtual #830                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
      1861: aload_2
      1862: invokestatic  #867                // Method ext/mods/gameserver/model/actor/instance/ClassMaster.showQuestionMark:(Lext/mods/gameserver/model/actor/Player;)V
      1865: aload_2
      1866: invokevirtual #626                // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
      1869: ldc_w         #872                // String Tutorial
      1872: invokevirtual #874                // Method ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
      1875: astore        5
      1877: aload         5
      1879: ifnull        1895
      1882: aload         5
      1884: invokevirtual #878                // Method ext/mods/gameserver/scripting/QuestState.getQuest:()Lext/mods/gameserver/scripting/Quest;
      1887: ldc_w         #884                // String UC
      1890: aconst_null
      1891: aload_2
      1892: invokevirtual #886                // Method ext/mods/gameserver/scripting/Quest.notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
      1895: invokestatic  #892                // Method ext/mods/playergod/PlayerGodManager.getInstance:()Lext/mods/playergod/PlayerGodManager;
      1898: aload_2
      1899: invokevirtual #897                // Method ext/mods/playergod/PlayerGodManager.onEnterWorld:(Lext/mods/gameserver/model/actor/Player;)V
      1902: aload_2
      1903: invokevirtual #898                // Method ext/mods/gameserver/model/actor/Player.restoreDressMe:()V
      1906: invokestatic  #901                // Method ext/mods/tour/TournamentEvent.isRunning:()Z
      1909: ifeq          2027
      1912: aload_2
      1913: new           #906                // class ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
      1916: dup
      1917: sipush        2000
      1920: invokespecial #908                // Method ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
      1923: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1926: invokestatic  #909                // Method ext/mods/tour/TournamentEvent.lastEvent:()Ljava/lang/String;
      1929: astore        6
      1931: aload         6
      1933: ifnull        2027
      1936: aload         6
      1938: invokevirtual #912                // Method java/lang/String.isEmpty:()Z
      1941: ifne          2027
      1944: aload         6
      1946: ldc_w         #915                // String HH:mm
      1949: invokestatic  #917                // Method java/time/format/DateTimeFormatter.ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
      1952: invokestatic  #923                // Method java/time/LocalTime.parse:(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalTime;
      1955: astore        7
      1957: invokestatic  #929                // Method java/time/LocalTime.now:()Ljava/time/LocalTime;
      1960: astore        8
      1962: invokestatic  #933                // Method ext/mods/tour/TourData.getInstance:()Lext/mods/tour/TourData;
      1965: invokevirtual #938                // Method ext/mods/tour/TourData.getConfig:()Lext/mods/tour/holder/TourConfig;
      1968: invokevirtual #942                // Method ext/mods/tour/holder/TourConfig.getDuration:()I
      1971: istore        9
      1973: aload         8
      1975: aload         7
      1977: iload         9
      1979: i2l
      1980: invokevirtual #947                // Method java/time/LocalTime.plusMinutes:(J)Ljava/time/LocalTime;
      1983: invokestatic  #951                // Method java/time/Duration.between:(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
      1986: astore        10
      1988: aload         10
      1990: invokevirtual #957                // Method java/time/Duration.isNegative:()Z
      1993: ifeq          2000
      1996: lconst_0
      1997: goto          2005
      2000: aload         10
      2002: invokevirtual #960                // Method java/time/Duration.toMinutes:()J
      2005: lstore        11
      2007: lload         11
      2009: lconst_0
      2010: lcmp
      2011: ifle          2027
      2014: aload_2
      2015: aload         6
      2017: lload         11
      2019: invokedynamic #963,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;J)Ljava/lang/String;
      2024: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2027: getstatic     #966                // Field ext/mods/Config.CTF_EVENT_ENABLED:Z
      2030: ifeq          2065
      2033: invokestatic  #568                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
      2036: invokevirtual #969                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isParticipating:()Z
      2039: ifne          2051
      2042: invokestatic  #568                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
      2045: invokevirtual #972                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
      2048: ifeq          2065
      2051: aload_2
      2052: new           #906                // class ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
      2055: dup
      2056: sipush        2001
      2059: invokespecial #908                // Method ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
      2062: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2065: getstatic     #977                // Field ext/mods/Config.DM_EVENT_ENABLED:Z
      2068: ifeq          2103
      2071: invokestatic  #576                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
      2074: invokevirtual #980                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isParticipating:()Z
      2077: ifne          2089
      2080: invokestatic  #576                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
      2083: invokevirtual #981                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
      2086: ifeq          2103
      2089: aload_2
      2090: new           #906                // class ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
      2093: dup
      2094: sipush        2002
      2097: invokespecial #908                // Method ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
      2100: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2103: getstatic     #984                // Field ext/mods/Config.LM_EVENT_ENABLED:Z
      2106: ifeq          2141
      2109: invokestatic  #582                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
      2112: invokevirtual #987                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isParticipating:()Z
      2115: ifne          2127
      2118: invokestatic  #582                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
      2121: invokevirtual #988                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
      2124: ifeq          2141
      2127: aload_2
      2128: new           #906                // class ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
      2131: dup
      2132: sipush        2003
      2135: invokespecial #908                // Method ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
      2138: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2141: getstatic     #991                // Field ext/mods/Config.TVT_EVENT_ENABLED:Z
      2144: ifeq          2179
      2147: invokestatic  #588                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
      2150: invokevirtual #994                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isParticipating:()Z
      2153: ifne          2165
      2156: invokestatic  #588                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
      2159: invokevirtual #995                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
      2162: ifeq          2179
      2165: aload_2
      2166: new           #906                // class ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
      2169: dup
      2170: sipush        2004
      2173: invokespecial #908                // Method ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
      2176: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2179: invokestatic  #998                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
      2182: invokevirtual #1003               // Method ext/mods/Crypta/RandomManager.getActiveZones:()Ljava/util/List;
      2185: invokeinterface #53,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      2190: astore        6
      2192: aload         6
      2194: invokeinterface #59,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      2199: ifeq          2254
      2202: aload         6
      2204: invokeinterface #65,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      2209: checkcast     #1006               // class ext/mods/gameserver/model/zone/type/RandomZone
      2212: astore        7
      2214: aload         7
      2216: invokevirtual #1008               // Method ext/mods/gameserver/model/zone/type/RandomZone.isActive:()Z
      2219: ifeq          2251
      2222: sipush        2005
      2225: invokestatic  #1011               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      2228: astore        8
      2230: aload         8
      2232: ifnull        2251
      2235: aload_2
      2236: new           #906                // class ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
      2239: dup
      2240: aload         8
      2242: invokevirtual #523                // Method java/lang/Integer.intValue:()I
      2245: invokespecial #908                // Method ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
      2248: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2251: goto          2192
      2254: invokestatic  #1015               // Method ext/mods/levelupmaker/LevelUpMakerManager.getInstance:()Lext/mods/levelupmaker/LevelUpMakerManager;
      2257: aload_2
      2258: invokevirtual #1020               // Method ext/mods/levelupmaker/LevelUpMakerManager.sendQuestionMark:(Lext/mods/gameserver/model/actor/Player;)V
      2261: invokestatic  #1023               // Method ext/mods/protection/hwid/hwid.isProtectionOn:()Z
      2264: ifeq          2278
      2267: aload_2
      2268: aload_0
      2269: invokevirtual #16                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
      2272: checkcast     #22                 // class ext/mods/gameserver/network/GameClient
      2275: invokestatic  #1028               // Method ext/mods/protection/hwid/hwid.enterlog:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/GameClient;)V
      2278: aload_2
      2279: getstatic     #1031               // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      2282: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2285: return
      LineNumberTable:
        line 115: 0
        line 116: 4
        line 117: 8
        line 120: 12
        line 121: 23
        line 123: 27
        line 124: 37
        line 127: 38
        line 129: 51
        line 131: 84
        line 132: 97
        line 134: 100
        line 135: 110
        line 138: 121
        line 140: 134
        line 141: 144
        line 143: 160
        line 145: 163
        line 146: 168
        line 147: 175
        line 150: 182
        line 151: 188
        line 153: 204
        line 154: 225
        line 156: 230
        line 157: 251
        line 159: 259
        line 160: 265
        line 162: 270
        line 163: 291
        line 165: 302
        line 168: 310
        line 169: 331
        line 171: 336
        line 172: 343
        line 174: 354
        line 175: 361
        line 177: 372
        line 178: 379
        line 179: 391
        line 180: 403
        line 181: 407
        line 183: 419
        line 184: 425
        line 186: 430
        line 188: 443
        line 189: 455
        line 191: 465
        line 193: 494
        line 194: 500
        line 196: 503
        line 197: 510
        line 191: 517
        line 200: 523
        line 202: 530
        line 203: 542
        line 204: 547
        line 205: 562
        line 206: 565
        line 208: 572
        line 209: 584
        line 210: 589
        line 213: 604
        line 214: 614
        line 215: 627
        line 217: 634
        line 219: 669
        line 220: 691
        line 228: 706
        line 229: 713
        line 230: 721
        line 232: 724
        line 233: 733
        line 234: 741
        line 235: 749
        line 236: 765
        line 237: 770
        line 239: 773
        line 241: 808
        line 242: 826
        line 243: 831
        line 245: 834
        line 246: 846
        line 248: 860
        line 249: 889
        line 248: 907
        line 252: 913
        line 254: 937
        line 255: 946
        line 257: 954
        line 258: 968
        line 260: 983
        line 262: 995
        line 265: 998
        line 266: 1013
        line 269: 1028
        line 270: 1034
        line 272: 1039
        line 274: 1043
        line 276: 1058
        line 278: 1098
        line 279: 1110
        line 281: 1128
        line 282: 1145
        line 284: 1148
        line 286: 1151
        line 288: 1158
        line 294: 1175
        line 296: 1201
        line 297: 1213
        line 294: 1228
        line 300: 1234
        line 301: 1243
        line 304: 1252
        line 305: 1259
        line 306: 1272
        line 308: 1280
        line 310: 1287
        line 311: 1294
        line 312: 1301
        line 313: 1308
        line 315: 1315
        line 316: 1335
        line 318: 1366
        line 320: 1389
        line 322: 1397
        line 323: 1409
        line 324: 1421
        line 325: 1433
        line 326: 1445
        line 327: 1458
        line 329: 1470
        line 331: 1489
        line 332: 1496
        line 334: 1508
        line 336: 1524
        line 337: 1531
        line 338: 1545
        line 341: 1552
        line 343: 1571
        line 344: 1581
        line 345: 1593
        line 346: 1606
        line 347: 1646
        line 348: 1652
        line 349: 1655
        line 351: 1661
        line 352: 1671
        line 353: 1683
        line 356: 1689
        line 357: 1697
        line 359: 1702
        line 361: 1709
        line 363: 1713
        line 365: 1720
        line 367: 1734
        line 368: 1746
        line 370: 1753
        line 372: 1757
        line 374: 1769
        line 375: 1779
        line 377: 1786
        line 378: 1797
        line 380: 1804
        line 381: 1822
        line 383: 1829
        line 384: 1854
        line 386: 1861
        line 388: 1865
        line 389: 1877
        line 390: 1882
        line 392: 1895
        line 393: 1902
        line 394: 1906
        line 396: 1912
        line 397: 1926
        line 398: 1931
        line 400: 1944
        line 401: 1957
        line 402: 1962
        line 403: 1973
        line 404: 1988
        line 405: 2007
        line 406: 2014
        line 409: 2027
        line 410: 2051
        line 411: 2065
        line 412: 2089
        line 413: 2103
        line 414: 2127
        line 415: 2141
        line 416: 2165
        line 417: 2179
        line 419: 2214
        line 421: 2222
        line 422: 2230
        line 423: 2235
        line 425: 2251
        line 426: 2254
        line 427: 2261
        line 428: 2267
        line 431: 2278
        line 432: 2285
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          144      16     6 message   Ljava/lang/String;
          110      50     5 grade   Lext/mods/gameserver/enums/items/CrystalType;
           84      76     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          494      23    10 member   Lext/mods/gameserver/model/actor/Player;
          542      20     7 sponsor   Lext/mods/gameserver/model/actor/Player;
          584      20     7 apprentice   Lext/mods/gameserver/model/actor/Player;
          691      79    10 skills   Ljava/util/Map;
          713      57    11 siege   Lext/mods/gameserver/model/residence/castle/Siege;
          733      37    12  type   Lext/mods/gameserver/enums/SiegeSide;
          669     101     9 castle   Lext/mods/gameserver/model/residence/castle/Castle;
          808      23     9  hall   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
          889      18    11    sp   Lext/mods/gameserver/model/pledge/SubPledge;
          455     458     5    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          465     448     6 psmlu   Lext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate;
          614     299     7    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
          946      49     5 cabal   Lext/mods/gameserver/enums/CabalType;
         1110      38     7 couple   Lext/mods/gameserver/model/holder/IntIntHolder;
         1098      50     6 coupleEntry   Ljava/util/Map$Entry;
         1201      27     9 itemId   I
         1175      77     5 itemIds   [I
         1581      71     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1671      18     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1957      70     7 startTime   Ljava/time/LocalTime;
         1962      65     8   now   Ljava/time/LocalTime;
         1973      54     9 durationMinutes   I
         1988      39    10 remaining   Ljava/time/Duration;
         2007      20    11 minutes   J
         1931      96     6 lastStart   Ljava/lang/String;
         2230      21     8  qmId   Ljava/lang/Integer;
         2214      37     7  zone   Lext/mods/gameserver/model/zone/type/RandomZone;
            0    2286     0  this   Lext/mods/gameserver/network/clientpackets/EnterWorld;
            4    2282     1    gs   Lext/mods/gameserver/GameServer;
           23    2263     2 player   Lext/mods/gameserver/model/actor/Player;
          168    2118     3 objectId   I
          425    1861     4  clan   Lext/mods/gameserver/model/pledge/Clan;
         1877     409     5    qs   Lext/mods/gameserver/scripting/QuestState;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          691      79    10 skills   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
         1098      50     6 coupleEntry   Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/gameserver/model/holder/IntIntHolder;>;
      StackMapTable: number_of_entries = 78
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/GameServer ]
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 250 /* chop */
          offset_delta = 59
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ int ]
        frame_type = 25 /* same */
        frame_type = 28 /* same */
        frame_type = 10 /* same */
        frame_type = 31 /* same */
        frame_type = 7 /* same */
        frame_type = 25 /* same */
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 107
          locals = [ class ext/mods/gameserver/network/clientpackets/EnterWorld, class ext/mods/gameserver/GameServer, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/network/serverpackets/SystemMessage, class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate, class "[Lext/mods/gameserver/model/actor/Player;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 13
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 38 /* same */
        frame_type = 2 /* same */
        frame_type = 38 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/util/Map ]
        frame_type = 253 /* append */
          offset_delta = 34
          locals = [ class java/util/Map, class ext/mods/gameserver/model/residence/castle/Siege ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/enums/SiegeSide ]
        frame_type = 15 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/network/clientpackets/EnterWorld, class ext/mods/gameserver/GameServer, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/network/serverpackets/SystemMessage, class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate, class ext/mods/gameserver/model/residence/clanhall/ClanHall, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 44 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 254 /* append */
          offset_delta = 40
          locals = [ class "[Lext/mods/gameserver/model/pledge/SubPledge;", int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/network/clientpackets/EnterWorld, class ext/mods/gameserver/GameServer, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/pledge/Clan ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/enums/CabalType ]
        frame_type = 250 /* chop */
          offset_delta = 11
        frame_type = 2 /* same */
        frame_type = 29 /* same */
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 51
          locals = [ class java/util/Map$Entry, class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 249 /* chop */
          offset_delta = 19
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/network/clientpackets/EnterWorld, class ext/mods/gameserver/GameServer, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/pledge/Clan, class "[I", class "[I", int, int ]
          stack = []
        frame_type = 40 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 17
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 98
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/network/clientpackets/EnterWorld, class ext/mods/gameserver/GameServer, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/SystemMessageId ]
        frame_type = 11 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 141
        frame_type = 43 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 102
        frame_type = 33 /* same */
        frame_type = 12 /* same */
        frame_type = 50 /* same */
        frame_type = 32 /* same */
        frame_type = 17 /* same */
        frame_type = 24 /* same */
        frame_type = 31 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/scripting/QuestState ]
        frame_type = 255 /* full_frame */
          offset_delta = 104
          locals = [ class ext/mods/gameserver/network/clientpackets/EnterWorld, class ext/mods/gameserver/GameServer, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/scripting/QuestState, class java/lang/String, class java/time/LocalTime, class java/time/LocalTime, int, class java/time/Duration ]
          stack = []
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ long ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/network/clientpackets/EnterWorld, class ext/mods/gameserver/GameServer, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/scripting/QuestState ]
          stack = []
        frame_type = 23 /* same */
        frame_type = 13 /* same */
        frame_type = 23 /* same */
        frame_type = 13 /* same */
        frame_type = 23 /* same */
        frame_type = 13 /* same */
        frame_type = 23 /* same */
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 58 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 23 /* same */

  protected boolean triggersOnActionRequest();
    descriptor: ()Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 459: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/network/clientpackets/EnterWorld;
}
SourceFile: "EnterWorld.java"
BootstrapMethods:
  0: #1209 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1181 Item \u0001 was removed: \u0001
  1: #1215 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1183 (Ljava/lang/Object;Ljava/lang/Object;)V
      #1185 REF_invokeStatic ext/mods/gameserver/network/clientpackets/EnterWorld.lambda$runImpl$0:(Lext/mods/gameserver/model/residence/castle/Castle;Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
      #1188 (Ljava/lang/Integer;Ljava/lang/Integer;)V
  2: #1215 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1190 (Ljava/lang/Object;)Z
      #1192 REF_invokeVirtual ext/mods/gameserver/scripting/Quest.isTriggeredOnEnterWorld:()Z
      #1196 (Lext/mods/gameserver/scripting/Quest;)Z
  3: #1215 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1198 (Ljava/lang/Object;)V
      #1200 REF_invokeStatic ext/mods/gameserver/network/clientpackets/EnterWorld.lambda$runImpl$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
      #1203 (Lext/mods/gameserver/scripting/Quest;)V
  4: #1209 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1205 Tournament is live! Started at \u0001h. Remaining time: \u0001 minute(s).
  5: #1209 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1207 0x\u0001
InnerClasses:
  public static final #1223= #32 of #22;  // GameClientState=class ext/mods/gameserver/network/GameClient$GameClientState of class ext/mods/gameserver/network/GameClient
  public static final #1224= #452 of #139; // FrequentSkill=class ext/mods/gameserver/data/SkillTable$FrequentSkill of class ext/mods/gameserver/data/SkillTable
  public static #1225= #508 of #364;      // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #1230= #1226 of #1228; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
