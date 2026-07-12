// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminEnchant
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminEnchant.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminEnchant.class
  Last modified 9 de jul de 2026; size 7797 bytes
  MD5 checksum a704af82aa9268720c8cb318b545f155
  Compiled from "AdminEnchant.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminEnchant implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #50                         // ext/mods/gameserver/handler/admincommandhandlers/AdminEnchant
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = String             #10           //
   #10 = Utf8
   #11 = Methodref          #7.#12        // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #14 = Methodref          #7.#15        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #15 = NameAndType        #16:#17       // nextToken:()Ljava/lang/String;
   #16 = Utf8               nextToken
   #17 = Utf8               ()Ljava/lang/String;
   #18 = Methodref          #7.#19        // java/util/StringTokenizer.countTokens:()I
   #19 = NameAndType        #20:#21       // countTokens:()I
   #20 = Utf8               countTokens
   #21 = Utf8               ()I
   #22 = Methodref          #23.#24       // ext/mods/gameserver/enums/Paperdoll.getEnumByName:(Ljava/lang/String;)Lext/mods/gameserver/enums/Paperdoll;
   #23 = Class              #25           // ext/mods/gameserver/enums/Paperdoll
   #24 = NameAndType        #26:#27       // getEnumByName:(Ljava/lang/String;)Lext/mods/gameserver/enums/Paperdoll;
   #25 = Utf8               ext/mods/gameserver/enums/Paperdoll
   #26 = Utf8               getEnumByName
   #27 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/Paperdoll;
   #28 = Fieldref           #23.#29       // ext/mods/gameserver/enums/Paperdoll.NULL:Lext/mods/gameserver/enums/Paperdoll;
   #29 = NameAndType        #30:#31       // NULL:Lext/mods/gameserver/enums/Paperdoll;
   #30 = Utf8               NULL
   #31 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
   #32 = String             #33           // Unknown paperdoll slot.
   #33 = Utf8               Unknown paperdoll slot.
   #34 = Methodref          #35.#36       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #35 = Class              #37           // ext/mods/gameserver/model/actor/Player
   #36 = NameAndType        #38:#39       // sendMessage:(Ljava/lang/String;)V
   #37 = Utf8               ext/mods/gameserver/model/actor/Player
   #38 = Utf8               sendMessage
   #39 = Utf8               (Ljava/lang/String;)V
   #40 = Methodref          #41.#42       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #41 = Class              #43           // java/lang/Integer
   #42 = NameAndType        #44:#45       // parseInt:(Ljava/lang/String;)I
   #43 = Utf8               java/lang/Integer
   #44 = Utf8               parseInt
   #45 = Utf8               (Ljava/lang/String;)I
   #46 = Integer            65535
   #47 = String             #48           // You must set the enchant level between 0 - 65535.
   #48 = Utf8               You must set the enchant level between 0 - 65535.
   #49 = Methodref          #50.#51       // ext/mods/gameserver/handler/admincommandhandlers/AdminEnchant.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #50 = Class              #52           // ext/mods/gameserver/handler/admincommandhandlers/AdminEnchant
   #51 = NameAndType        #53:#54       // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #52 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminEnchant
   #53 = Utf8               getTargetPlayer
   #54 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #55 = Methodref          #35.#56       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #56 = NameAndType        #57:#58       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #57 = Utf8               getInventory
   #58 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #59 = Methodref          #60.#61       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #60 = Class              #62           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #61 = NameAndType        #63:#64       // getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #62 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #63 = Utf8               getItemFrom
   #64 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #65 = Methodref          #35.#66       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #66 = NameAndType        #67:#17       // getName:()Ljava/lang/String;
   #67 = Utf8               getName
   #68 = Methodref          #69.#70       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #69 = Class              #71           // java/lang/String
   #70 = NameAndType        #72:#73       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #71 = Utf8               java/lang/String
   #72 = Utf8               valueOf
   #73 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #74 = InvokeDynamic      #0:#75        // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #75 = NameAndType        #76:#77       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #76 = Utf8               makeConcatWithConstants
   #77 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #78 = String             #79           // enchant.htm
   #79 = Utf8               enchant.htm
   #80 = Methodref          #50.#81       // ext/mods/gameserver/handler/admincommandhandlers/AdminEnchant.sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #81 = NameAndType        #82:#83       // sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #82 = Utf8               sendFile
   #83 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #84 = Methodref          #85.#86       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #85 = Class              #87           // ext/mods/gameserver/model/item/instance/ItemInstance
   #86 = NameAndType        #88:#89       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #87 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #88 = Utf8               getItem
   #89 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #90 = Methodref          #85.#91       // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
   #91 = NameAndType        #92:#21       // getEnchantLevel:()I
   #92 = Utf8               getEnchantLevel
   #93 = Methodref          #94.#66       // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
   #94 = Class              #95           // ext/mods/gameserver/model/item/kind/Item
   #95 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #96 = InvokeDynamic      #1:#97        // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
   #97 = NameAndType        #76:#98       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
   #98 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
   #99 = Methodref          #85.#100      // ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #100 = NameAndType        #101:#102     // setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #101 = Utf8               setEnchantLevel
  #102 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
  #103 = Fieldref           #104.#105     // ext/mods/Config.UPGRADE_BOSS_JEWELS_ENCHANT:Z
  #104 = Class              #106          // ext/mods/Config
  #105 = NameAndType        #107:#108     // UPGRADE_BOSS_JEWELS_ENCHANT:Z
  #106 = Utf8               ext/mods/Config
  #107 = Utf8               UPGRADE_BOSS_JEWELS_ENCHANT
  #108 = Utf8               Z
  #109 = Fieldref           #104.#110     // ext/mods/Config.UPGRADEABLE_BOSS_JEWELS:Ljava/util/Set;
  #110 = NameAndType        #111:#112     // UPGRADEABLE_BOSS_JEWELS:Ljava/util/Set;
  #111 = Utf8               UPGRADEABLE_BOSS_JEWELS
  #112 = Utf8               Ljava/util/Set;
  #113 = Methodref          #85.#114      // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #114 = NameAndType        #115:#21      // getItemId:()I
  #115 = Utf8               getItemId
  #116 = Methodref          #41.#117      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #117 = NameAndType        #72:#118      // valueOf:(I)Ljava/lang/Integer;
  #118 = Utf8               (I)Ljava/lang/Integer;
  #119 = InterfaceMethodref #120.#121     // java/util/Set.contains:(Ljava/lang/Object;)Z
  #120 = Class              #122          // java/util/Set
  #121 = NameAndType        #123:#124     // contains:(Ljava/lang/Object;)Z
  #122 = Utf8               java/util/Set
  #123 = Utf8               contains
  #124 = Utf8               (Ljava/lang/Object;)Z
  #125 = Fieldref           #104.#126     // ext/mods/Config.UPGRADE_BOSS_JEWELS:Ljava/util/List;
  #126 = NameAndType        #127:#128     // UPGRADE_BOSS_JEWELS:Ljava/util/List;
  #127 = Utf8               UPGRADE_BOSS_JEWELS
  #128 = Utf8               Ljava/util/List;
  #129 = InterfaceMethodref #130.#131     // java/util/List.iterator:()Ljava/util/Iterator;
  #130 = Class              #132          // java/util/List
  #131 = NameAndType        #133:#134     // iterator:()Ljava/util/Iterator;
  #132 = Utf8               java/util/List
  #133 = Utf8               iterator
  #134 = Utf8               ()Ljava/util/Iterator;
  #135 = InterfaceMethodref #136.#137     // java/util/Iterator.hasNext:()Z
  #136 = Class              #138          // java/util/Iterator
  #137 = NameAndType        #139:#140     // hasNext:()Z
  #138 = Utf8               java/util/Iterator
  #139 = Utf8               hasNext
  #140 = Utf8               ()Z
  #141 = InterfaceMethodref #136.#142     // java/util/Iterator.next:()Ljava/lang/Object;
  #142 = NameAndType        #143:#144     // next:()Ljava/lang/Object;
  #143 = Utf8               next
  #144 = Utf8               ()Ljava/lang/Object;
  #145 = Class              #146          // ext/mods/Config$JewelUpgrade
  #146 = Utf8               ext/mods/Config$JewelUpgrade
  #147 = Fieldref           #145.#148     // ext/mods/Config$JewelUpgrade.itemId:I
  #148 = NameAndType        #149:#150     // itemId:I
  #149 = Utf8               itemId
  #150 = Utf8               I
  #151 = Fieldref           #145.#152     // ext/mods/Config$JewelUpgrade.enchantLevel:I
  #152 = NameAndType        #153:#150     // enchantLevel:I
  #153 = Utf8               enchantLevel
  #154 = Methodref          #85.#155      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #155 = NameAndType        #156:#21      // getObjectId:()I
  #156 = Utf8               getObjectId
  #157 = Methodref          #35.#158      // ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
  #158 = NameAndType        #159:#160     // destroyItem:(IIZ)Z
  #159 = Utf8               destroyItem
  #160 = Utf8               (IIZ)Z
  #161 = Methodref          #162.#163     // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #162 = Class              #164          // ext/mods/gameserver/idfactory/IdFactory
  #163 = NameAndType        #165:#166     // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #164 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #165 = Utf8               getInstance
  #166 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #167 = Methodref          #162.#168     // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
  #168 = NameAndType        #169:#21      // getNextId:()I
  #169 = Utf8               getNextId
  #170 = Fieldref           #145.#171     // ext/mods/Config$JewelUpgrade.newItemId:I
  #171 = NameAndType        #172:#150     // newItemId:I
  #172 = Utf8               newItemId
  #173 = Methodref          #85.#174      // ext/mods/gameserver/model/item/instance/ItemInstance."<init>":(II)V
  #174 = NameAndType        #5:#175       // "<init>":(II)V
  #175 = Utf8               (II)V
  #176 = Methodref          #35.#177      // ext/mods/gameserver/model/actor/Player.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #177 = NameAndType        #178:#179     // addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #178 = Utf8               addItem
  #179 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #180 = Methodref          #60.#181      // ext/mods/gameserver/model/itemcontainer/PcInventory.equipItemAndRecord:(Lext/mods/gameserver/model/item/instance/ItemInstance;)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #181 = NameAndType        #182:#183     // equipItemAndRecord:(Lext/mods/gameserver/model/item/instance/ItemInstance;)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #182 = Utf8               equipItemAndRecord
  #183 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #184 = Methodref          #185.#186     // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #185 = Class              #187          // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager
  #186 = NameAndType        #165:#188     // getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #187 = Utf8               ext/mods/gameserver/taskmanager/ItemInstanceTaskManager
  #188 = Utf8               ()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #189 = Methodref          #185.#190     // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #190 = NameAndType        #191:#192     // add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #191 = Utf8               add
  #192 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #193 = Methodref          #85.#194      // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
  #194 = NameAndType        #195:#140     // isEquipped:()Z
  #195 = Utf8               isEquipped
  #196 = Class              #197          // ext/mods/gameserver/model/item/kind/Weapon
  #197 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #198 = Methodref          #196.#199     // ext/mods/gameserver/model/item/kind/Weapon.getEnchant4Skill:()Lext/mods/gameserver/skills/L2Skill;
  #199 = NameAndType        #200:#201     // getEnchant4Skill:()Lext/mods/gameserver/skills/L2Skill;
  #200 = Utf8               getEnchant4Skill
  #201 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #202 = Methodref          #203.#204     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #203 = Class              #205          // ext/mods/gameserver/skills/L2Skill
  #204 = NameAndType        #206:#21      // getId:()I
  #205 = Utf8               ext/mods/gameserver/skills/L2Skill
  #206 = Utf8               getId
  #207 = Methodref          #35.#208      // ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
  #208 = NameAndType        #209:#210     // removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
  #209 = Utf8               removeSkill
  #210 = Utf8               (IZ)Lext/mods/gameserver/skills/L2Skill;
  #211 = Class              #212          // ext/mods/gameserver/network/serverpackets/SkillList
  #212 = Utf8               ext/mods/gameserver/network/serverpackets/SkillList
  #213 = Methodref          #211.#214     // ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #214 = NameAndType        #5:#215       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #215 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #216 = Methodref          #35.#217      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #217 = NameAndType        #218:#219     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #218 = Utf8               sendPacket
  #219 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #220 = Methodref          #35.#221      // ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #221 = NameAndType        #222:#223     // addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
  #222 = Utf8               addSkill
  #223 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Z)Z
  #224 = Class              #225          // ext/mods/gameserver/model/item/kind/Armor
  #225 = Utf8               ext/mods/gameserver/model/item/kind/Armor
  #226 = Fieldref           #23.#227      // ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
  #227 = NameAndType        #228:#31      // CHEST:Lext/mods/gameserver/enums/Paperdoll;
  #228 = Utf8               CHEST
  #229 = Methodref          #60.#230      // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
  #230 = NameAndType        #231:#232     // getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
  #231 = Utf8               getItemIdFrom
  #232 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;)I
  #233 = Methodref          #234.#235     // ext/mods/gameserver/data/xml/ArmorSetData.getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
  #234 = Class              #236          // ext/mods/gameserver/data/xml/ArmorSetData
  #235 = NameAndType        #165:#237     // getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
  #236 = Utf8               ext/mods/gameserver/data/xml/ArmorSetData
  #237 = Utf8               ()Lext/mods/gameserver/data/xml/ArmorSetData;
  #238 = Methodref          #234.#239     // ext/mods/gameserver/data/xml/ArmorSetData.getSet:(I)Lext/mods/gameserver/model/item/ArmorSet;
  #239 = NameAndType        #240:#241     // getSet:(I)Lext/mods/gameserver/model/item/ArmorSet;
  #240 = Utf8               getSet
  #241 = Utf8               (I)Lext/mods/gameserver/model/item/ArmorSet;
  #242 = Methodref          #243.#244     // ext/mods/gameserver/model/item/ArmorSet.getEnchant6skillId:()I
  #243 = Class              #245          // ext/mods/gameserver/model/item/ArmorSet
  #244 = NameAndType        #246:#21      // getEnchant6skillId:()I
  #245 = Utf8               ext/mods/gameserver/model/item/ArmorSet
  #246 = Utf8               getEnchant6skillId
  #247 = Methodref          #243.#248     // ext/mods/gameserver/model/item/ArmorSet.isEnchanted6:(Lext/mods/gameserver/model/actor/Player;)Z
  #248 = NameAndType        #249:#250     // isEnchanted6:(Lext/mods/gameserver/model/actor/Player;)Z
  #249 = Utf8               isEnchanted6
  #250 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #251 = Methodref          #252.#253     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #252 = Class              #254          // ext/mods/gameserver/data/SkillTable
  #253 = NameAndType        #165:#255     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #254 = Utf8               ext/mods/gameserver/data/SkillTable
  #255 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #256 = Methodref          #252.#257     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #257 = NameAndType        #258:#259     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #258 = Utf8               getInfo
  #259 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #260 = Methodref          #35.#261      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #261 = NameAndType        #262:#6       // broadcastUserInfo:()V
  #262 = Utf8               broadcastUserInfo
  #263 = Class              #264          // ext/mods/gameserver/network/serverpackets/ItemList
  #264 = Utf8               ext/mods/gameserver/network/serverpackets/ItemList
  #265 = Methodref          #263.#266     // ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #266 = NameAndType        #5:#267       // "<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #267 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #268 = InvokeDynamic      #2:#269       // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
  #269 = NameAndType        #76:#270      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
  #270 = Utf8               (Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
  #271 = Class              #272          // java/lang/Exception
  #272 = Utf8               java/lang/Exception
  #273 = String             #274          // Please specify a new enchant value.
  #274 = Utf8               Please specify a new enchant value.
  #275 = String             #276          // Usage: //enchant slot enchant
  #276 = Utf8               Usage: //enchant slot enchant
  #277 = String             #278          // Slots: under|lear|rear|neck|lfinger|rfinger|head|rhand|lhand
  #278 = Utf8               Slots: under|lear|rear|neck|lfinger|rfinger|head|rhand|lhand
  #279 = String             #280          // Slots: gloves|chest|legs|feet|cloak|face|hair|hairall
  #280 = Utf8               Slots: gloves|chest|legs|feet|cloak|face|hair|hairall
  #281 = Fieldref           #50.#282      // ext/mods/gameserver/handler/admincommandhandlers/AdminEnchant.ADMIN_COMMANDS:[Ljava/lang/String;
  #282 = NameAndType        #283:#284     // ADMIN_COMMANDS:[Ljava/lang/String;
  #283 = Utf8               ADMIN_COMMANDS
  #284 = Utf8               [Ljava/lang/String;
  #285 = String             #286          // admin_enchant
  #286 = Utf8               admin_enchant
  #287 = Class              #288          // ext/mods/gameserver/handler/IAdminCommandHandler
  #288 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #289 = Utf8               Code
  #290 = Utf8               LineNumberTable
  #291 = Utf8               LocalVariableTable
  #292 = Utf8               this
  #293 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminEnchant;
  #294 = Utf8               useAdminCommand
  #295 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #296 = Utf8               newItem
  #297 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #298 = Utf8               upgrade
  #299 = Utf8               Lext/mods/Config$JewelUpgrade;
  #300 = Utf8               currentEnchant
  #301 = Utf8               enchant4Skill
  #302 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #303 = Utf8               weapon
  #304 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #305 = Utf8               skillId
  #306 = Utf8               armorSet
  #307 = Utf8               Lext/mods/gameserver/model/item/ArmorSet;
  #308 = Utf8               skill
  #309 = Utf8               paperdoll
  #310 = Utf8               enchant
  #311 = Utf8               targetPlayer
  #312 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #313 = Utf8               item
  #314 = Utf8               toTestItem
  #315 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #316 = Utf8               oldEnchant
  #317 = Utf8               e
  #318 = Utf8               Ljava/lang/Exception;
  #319 = Utf8               command
  #320 = Utf8               Ljava/lang/String;
  #321 = Utf8               player
  #322 = Utf8               st
  #323 = Utf8               Ljava/util/StringTokenizer;
  #324 = Utf8               StackMapTable
  #325 = Utf8               getAdminCommandList
  #326 = Utf8               ()[Ljava/lang/String;
  #327 = Utf8               <clinit>
  #328 = Utf8               SourceFile
  #329 = Utf8               AdminEnchant.java
  #330 = Utf8               BootstrapMethods
  #331 = String             #332          // \u0001 doesn\'t wear any item in \u0001 slot.
  #332 = Utf8               \u0001 doesn\'t wear any item in \u0001 slot.
  #333 = String             #334          // \u0001\'s \u0001 enchant is already set to \u0001.
  #334 = Utf8               \u0001\'s \u0001 enchant is already set to \u0001.
  #335 = String             #336          // \u0001\'s \u0001 enchant was modified from \u0001 to \u0001.
  #336 = Utf8               \u0001\'s \u0001 enchant was modified from \u0001 to \u0001.
  #337 = MethodHandle       6:#338        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #338 = Methodref          #339.#340     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #339 = Class              #341          // java/lang/invoke/StringConcatFactory
  #340 = NameAndType        #76:#342      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #341 = Utf8               java/lang/invoke/StringConcatFactory
  #342 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #343 = Utf8               InnerClasses
  #344 = Utf8               JewelUpgrade
  #345 = Class              #346          // java/lang/invoke/MethodHandles$Lookup
  #346 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #347 = Class              #348          // java/lang/invoke/MethodHandles
  #348 = Utf8               java/lang/invoke/MethodHandles
  #349 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminEnchant();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminEnchant;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=16, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: aload_3
        17: invokevirtual #18                 // Method java/util/StringTokenizer.countTokens:()I
        20: iconst_2
        21: if_icmpne     742
        24: aload_3
        25: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        28: invokestatic  #22                 // Method ext/mods/gameserver/enums/Paperdoll.getEnumByName:(Ljava/lang/String;)Lext/mods/gameserver/enums/Paperdoll;
        31: astore        4
        33: aload         4
        35: getstatic     #28                 // Field ext/mods/gameserver/enums/Paperdoll.NULL:Lext/mods/gameserver/enums/Paperdoll;
        38: if_acmpne     48
        41: aload_2
        42: ldc           #32                 // String Unknown paperdoll slot.
        44: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        47: return
        48: aload_3
        49: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        52: invokestatic  #40                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        55: istore        5
        57: iload         5
        59: iflt          69
        62: iload         5
        64: ldc           #46                 // int 65535
        66: if_icmple     76
        69: aload_2
        70: ldc           #47                 // String You must set the enchant level between 0 - 65535.
        72: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        75: return
        76: aload_0
        77: aload_2
        78: iconst_1
        79: invokevirtual #49                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
        82: astore        6
        84: aload         6
        86: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        89: aload         4
        91: invokevirtual #59                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        94: astore        7
        96: aload         7
        98: ifnonnull     128
       101: aload_2
       102: aload         6
       104: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       107: aload         4
       109: invokestatic  #68                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       112: invokedynamic #74,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       117: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       120: aload_0
       121: aload_2
       122: ldc           #78                 // String enchant.htm
       124: invokevirtual #80                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       127: return
       128: aload         7
       130: invokevirtual #84                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       133: astore        8
       135: aload         7
       137: invokevirtual #90                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       140: istore        9
       142: iload         9
       144: iload         5
       146: if_icmpne     178
       149: aload_2
       150: aload         6
       152: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       155: aload         8
       157: invokevirtual #93                 // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
       160: iload         5
       162: invokedynamic #96,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
       167: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       170: aload_0
       171: aload_2
       172: ldc           #78                 // String enchant.htm
       174: invokevirtual #80                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       177: return
       178: aload         7
       180: iload         5
       182: aload_2
       183: invokevirtual #99                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
       186: getstatic     #103                // Field ext/mods/Config.UPGRADE_BOSS_JEWELS_ENCHANT:Z
       189: ifeq          345
       192: getstatic     #109                // Field ext/mods/Config.UPGRADEABLE_BOSS_JEWELS:Ljava/util/Set;
       195: aload         7
       197: invokevirtual #113                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       200: invokestatic  #116                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       203: invokeinterface #119,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
       208: ifeq          345
       211: aload         7
       213: invokevirtual #90                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       216: istore        10
       218: getstatic     #125                // Field ext/mods/Config.UPGRADE_BOSS_JEWELS:Ljava/util/List;
       221: invokeinterface #129,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       226: astore        11
       228: aload         11
       230: invokeinterface #135,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       235: ifeq          345
       238: aload         11
       240: invokeinterface #141,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       245: checkcast     #145                // class ext/mods/Config$JewelUpgrade
       248: astore        12
       250: aload         12
       252: getfield      #147                // Field ext/mods/Config$JewelUpgrade.itemId:I
       255: aload         7
       257: invokevirtual #113                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       260: if_icmpne     342
       263: aload         12
       265: getfield      #151                // Field ext/mods/Config$JewelUpgrade.enchantLevel:I
       268: iload         10
       270: if_icmpne     342
       273: aload_2
       274: aload         7
       276: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       279: iconst_1
       280: iconst_0
       281: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
       284: pop
       285: new           #85                 // class ext/mods/gameserver/model/item/instance/ItemInstance
       288: dup
       289: invokestatic  #161                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
       292: invokevirtual #167                // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
       295: aload         12
       297: getfield      #170                // Field ext/mods/Config$JewelUpgrade.newItemId:I
       300: invokespecial #173                // Method ext/mods/gameserver/model/item/instance/ItemInstance."<init>":(II)V
       303: astore        13
       305: aload         13
       307: iload         10
       309: aload         6
       311: invokevirtual #99                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
       314: aload_2
       315: aload         13
       317: iconst_1
       318: invokevirtual #176                // Method ext/mods/gameserver/model/actor/Player.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       321: aload_2
       322: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       325: aload         13
       327: invokevirtual #180                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.equipItemAndRecord:(Lext/mods/gameserver/model/item/instance/ItemInstance;)[Lext/mods/gameserver/model/item/instance/ItemInstance;
       330: pop
       331: invokestatic  #184                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
       334: aload         13
       336: invokevirtual #189                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       339: goto          345
       342: goto          228
       345: aload_0
       346: aload_2
       347: ldc           #78                 // String enchant.htm
       349: invokevirtual #80                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       352: aload         7
       354: invokevirtual #193                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
       357: ifeq          686
       360: aload         7
       362: invokevirtual #90                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       365: istore        10
       367: aload         8
       369: instanceof    #196                // class ext/mods/gameserver/model/item/kind/Weapon
       372: ifeq          485
       375: aload         8
       377: checkcast     #196                // class ext/mods/gameserver/model/item/kind/Weapon
       380: astore        11
       382: iload         9
       384: iconst_4
       385: if_icmplt     435
       388: iload         10
       390: iconst_4
       391: if_icmpge     435
       394: aload         11
       396: invokevirtual #198                // Method ext/mods/gameserver/model/item/kind/Weapon.getEnchant4Skill:()Lext/mods/gameserver/skills/L2Skill;
       399: astore        12
       401: aload         12
       403: ifnull        432
       406: aload         6
       408: aload         12
       410: invokevirtual #202                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       413: iconst_0
       414: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
       417: pop
       418: aload         6
       420: new           #211                // class ext/mods/gameserver/network/serverpackets/SkillList
       423: dup
       424: aload         6
       426: invokespecial #213                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       429: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       432: goto          686
       435: iload         9
       437: iconst_4
       438: if_icmpge     686
       441: iload         10
       443: iconst_4
       444: if_icmplt     686
       447: aload         11
       449: invokevirtual #198                // Method ext/mods/gameserver/model/item/kind/Weapon.getEnchant4Skill:()Lext/mods/gameserver/skills/L2Skill;
       452: astore        12
       454: aload         12
       456: ifnull        482
       459: aload         6
       461: aload         12
       463: iconst_0
       464: invokevirtual #220                // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       467: pop
       468: aload         6
       470: new           #211                // class ext/mods/gameserver/network/serverpackets/SkillList
       473: dup
       474: aload         6
       476: invokespecial #213                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       479: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       482: goto          686
       485: aload         8
       487: instanceof    #224                // class ext/mods/gameserver/model/item/kind/Armor
       490: ifeq          686
       493: iload         9
       495: bipush        6
       497: if_icmplt     578
       500: iload         10
       502: bipush        6
       504: if_icmpge     578
       507: aload         6
       509: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       512: getstatic     #226                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
       515: invokevirtual #229                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
       518: istore        12
       520: iload         12
       522: ifle          575
       525: invokestatic  #233                // Method ext/mods/gameserver/data/xml/ArmorSetData.getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
       528: iload         12
       530: invokevirtual #238                // Method ext/mods/gameserver/data/xml/ArmorSetData.getSet:(I)Lext/mods/gameserver/model/item/ArmorSet;
       533: astore        13
       535: aload         13
       537: ifnull        575
       540: aload         13
       542: invokevirtual #242                // Method ext/mods/gameserver/model/item/ArmorSet.getEnchant6skillId:()I
       545: istore        14
       547: iload         14
       549: ifle          575
       552: aload         6
       554: iload         14
       556: iconst_0
       557: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Player.removeSkill:(IZ)Lext/mods/gameserver/skills/L2Skill;
       560: pop
       561: aload         6
       563: new           #211                // class ext/mods/gameserver/network/serverpackets/SkillList
       566: dup
       567: aload         6
       569: invokespecial #213                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       572: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       575: goto          686
       578: iload         9
       580: bipush        6
       582: if_icmpge     686
       585: iload         10
       587: bipush        6
       589: if_icmplt     686
       592: aload         6
       594: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       597: getstatic     #226                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
       600: invokevirtual #229                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
       603: istore        12
       605: iload         12
       607: ifle          686
       610: invokestatic  #233                // Method ext/mods/gameserver/data/xml/ArmorSetData.getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
       613: iload         12
       615: invokevirtual #238                // Method ext/mods/gameserver/data/xml/ArmorSetData.getSet:(I)Lext/mods/gameserver/model/item/ArmorSet;
       618: astore        13
       620: aload         13
       622: ifnull        686
       625: aload         13
       627: aload         6
       629: invokevirtual #247                // Method ext/mods/gameserver/model/item/ArmorSet.isEnchanted6:(Lext/mods/gameserver/model/actor/Player;)Z
       632: ifeq          686
       635: aload         13
       637: invokevirtual #242                // Method ext/mods/gameserver/model/item/ArmorSet.getEnchant6skillId:()I
       640: istore        14
       642: iload         14
       644: ifle          686
       647: invokestatic  #251                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       650: iload         14
       652: iconst_1
       653: invokevirtual #256                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       656: astore        15
       658: aload         15
       660: ifnull        686
       663: aload         6
       665: aload         15
       667: iconst_0
       668: invokevirtual #220                // Method ext/mods/gameserver/model/actor/Player.addSkill:(Lext/mods/gameserver/skills/L2Skill;Z)Z
       671: pop
       672: aload         6
       674: new           #211                // class ext/mods/gameserver/network/serverpackets/SkillList
       677: dup
       678: aload         6
       680: invokespecial #213                // Method ext/mods/gameserver/network/serverpackets/SkillList."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       683: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       686: aload         6
       688: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       691: aload_2
       692: new           #263                // class ext/mods/gameserver/network/serverpackets/ItemList
       695: dup
       696: aload_2
       697: iconst_0
       698: invokespecial #265                // Method ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
       701: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       704: aload_2
       705: aload         6
       707: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       710: aload         8
       712: invokevirtual #93                 // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
       715: iload         9
       717: iload         5
       719: invokedynamic #268,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
       724: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       727: goto          770
       730: astore        4
       732: aload_2
       733: ldc_w         #273                // String Please specify a new enchant value.
       736: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       739: goto          770
       742: aload_2
       743: ldc_w         #275                // String Usage: //enchant slot enchant
       746: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       749: aload_2
       750: ldc_w         #277                // String Slots: under|lear|rear|neck|lfinger|rfinger|head|rhand|lhand
       753: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       756: aload_2
       757: ldc_w         #279                // String Slots: gloves|chest|legs|feet|cloak|face|hair|hairall
       760: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       763: aload_0
       764: aload_2
       765: ldc           #78                 // String enchant.htm
       767: invokevirtual #80                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       770: return
      Exception table:
         from    to  target type
            24    47   730   Class java/lang/Exception
            48    75   730   Class java/lang/Exception
            76   127   730   Class java/lang/Exception
           128   177   730   Class java/lang/Exception
           178   727   730   Class java/lang/Exception
      LineNumberTable:
        line 51: 0
        line 52: 11
        line 54: 16
        line 58: 24
        line 59: 33
        line 61: 41
        line 62: 47
        line 65: 48
        line 66: 57
        line 68: 69
        line 69: 75
        line 72: 76
        line 74: 84
        line 75: 96
        line 77: 101
        line 78: 120
        line 79: 127
        line 82: 128
        line 83: 135
        line 85: 142
        line 87: 149
        line 88: 170
        line 89: 177
        line 92: 178
        line 93: 186
        line 94: 211
        line 95: 218
        line 96: 250
        line 97: 273
        line 98: 285
        line 99: 305
        line 100: 314
        line 101: 321
        line 102: 331
        line 103: 339
        line 105: 342
        line 107: 345
        line 109: 352
        line 111: 360
        line 113: 367
        line 115: 382
        line 117: 394
        line 118: 401
        line 120: 406
        line 121: 418
        line 123: 432
        line 124: 435
        line 126: 447
        line 127: 454
        line 129: 459
        line 130: 468
        line 132: 482
        line 134: 485
        line 136: 493
        line 138: 507
        line 139: 520
        line 141: 525
        line 142: 535
        line 144: 540
        line 145: 547
        line 147: 552
        line 148: 561
        line 152: 575
        line 153: 578
        line 155: 592
        line 156: 605
        line 158: 610
        line 159: 620
        line 161: 635
        line 162: 642
        line 164: 647
        line 165: 658
        line 167: 663
        line 168: 672
        line 177: 686
        line 178: 691
        line 180: 704
        line 185: 727
        line 182: 730
        line 184: 732
        line 185: 739
        line 189: 742
        line 190: 749
        line 191: 756
        line 192: 763
        line 194: 770
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          305      37    13 newItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
          250      92    12 upgrade   Lext/mods/Config$JewelUpgrade;
          218     127    10 currentEnchant   I
          401      31    12 enchant4Skill   Lext/mods/gameserver/skills/L2Skill;
          454      28    12 enchant4Skill   Lext/mods/gameserver/skills/L2Skill;
          382     103    11 weapon   Lext/mods/gameserver/model/item/kind/Weapon;
          547      28    14 skillId   I
          535      40    13 armorSet   Lext/mods/gameserver/model/item/ArmorSet;
          520      55    12 itemId   I
          658      28    15 skill   Lext/mods/gameserver/skills/L2Skill;
          642      44    14 skillId   I
          620      66    13 armorSet   Lext/mods/gameserver/model/item/ArmorSet;
          605      81    12 itemId   I
          367     319    10 currentEnchant   I
           33     694     4 paperdoll   Lext/mods/gameserver/enums/Paperdoll;
           57     670     5 enchant   I
           84     643     6 targetPlayer   Lext/mods/gameserver/model/actor/Player;
           96     631     7  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          135     592     8 toTestItem   Lext/mods/gameserver/model/item/kind/Item;
          142     585     9 oldEnchant   I
          732       7     4     e   Ljava/lang/Exception;
            0     771     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminEnchant;
            0     771     1 command   Ljava/lang/String;
            0     771     2 player   Lext/mods/gameserver/model/actor/Player;
           11     760     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 18
        frame_type = 253 /* append */
          offset_delta = 48
          locals = [ class java/util/StringTokenizer, class ext/mods/gameserver/enums/Paperdoll ]
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 6 /* same */
        frame_type = 253 /* append */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 253 /* append */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/item/kind/Item, int ]
        frame_type = 253 /* append */
          offset_delta = 49
          locals = [ int, class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 113
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 86
          locals = [ int, class ext/mods/gameserver/model/item/kind/Weapon ]
        frame_type = 2 /* same */
        frame_type = 46 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 251 /* same_frame_extended */
          offset_delta = 89
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 107
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEnchant, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 27 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #281                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 199: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminEnchant;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #69                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc_w         #285                // String admin_enchant
         9: aastore
        10: putstatic     #281                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        13: return
      LineNumberTable:
        line 43: 0
}
SourceFile: "AdminEnchant.java"
BootstrapMethods:
  0: #337 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #331 \u0001 doesn\'t wear any item in \u0001 slot.
  1: #337 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #333 \u0001\'s \u0001 enchant is already set to \u0001.
  2: #337 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #335 \u0001\'s \u0001 enchant was modified from \u0001 to \u0001.
InnerClasses:
  public static #344= #145 of #104;       // JewelUpgrade=class ext/mods/Config$JewelUpgrade of class ext/mods/Config
  public static final #349= #345 of #347; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
