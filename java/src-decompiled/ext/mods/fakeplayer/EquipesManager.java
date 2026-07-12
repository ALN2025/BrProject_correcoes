// Bytecode for: ext.mods.fakeplayer.EquipesManager
// File: ext\mods\fakeplayer\EquipesManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/EquipesManager.class
  Last modified 9 de jul de 2026; size 4249 bytes
  MD5 checksum 1da1767f8f341bd1459e44beb316ef0a
  Compiled from "EquipesManager.java"
public class ext.mods.fakeplayer.EquipesManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #51                         // ext/mods/fakeplayer/EquipesManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player
    #9 = NameAndType        #11:#12       // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #10 = Utf8               ext/mods/gameserver/model/actor/Player
   #11 = Utf8               getClassId
   #12 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #14 = NameAndType        #15:#16       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #15 = Utf8               getStatus
   #16 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
   #18 = Class              #20           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #19 = NameAndType        #21:#22       // getLevel:()I
   #20 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #21 = Utf8               getLevel
   #22 = Utf8               ()I
   #23 = Methodref          #24.#25       // ext/mods/fakeplayer/data/EquipesData.getInstance:()Lext/mods/fakeplayer/data/EquipesData;
   #24 = Class              #26           // ext/mods/fakeplayer/data/EquipesData
   #25 = NameAndType        #27:#28       // getInstance:()Lext/mods/fakeplayer/data/EquipesData;
   #26 = Utf8               ext/mods/fakeplayer/data/EquipesData
   #27 = Utf8               getInstance
   #28 = Utf8               ()Lext/mods/fakeplayer/data/EquipesData;
   #29 = Methodref          #30.#31       // ext/mods/gameserver/enums/actors/ClassId.name:()Ljava/lang/String;
   #30 = Class              #32           // ext/mods/gameserver/enums/actors/ClassId
   #31 = NameAndType        #33:#34       // name:()Ljava/lang/String;
   #32 = Utf8               ext/mods/gameserver/enums/actors/ClassId
   #33 = Utf8               name
   #34 = Utf8               ()Ljava/lang/String;
   #35 = Methodref          #24.#36       // ext/mods/fakeplayer/data/EquipesData.getArmorSet:(Ljava/lang/String;I)Lext/mods/fakeplayer/holder/EquipesHolder;
   #36 = NameAndType        #37:#38       // getArmorSet:(Ljava/lang/String;I)Lext/mods/fakeplayer/holder/EquipesHolder;
   #37 = Utf8               getArmorSet
   #38 = Utf8               (Ljava/lang/String;I)Lext/mods/fakeplayer/holder/EquipesHolder;
   #39 = Methodref          #40.#41       // ext/mods/fakeplayer/holder/EquipesHolder.getRhand:()I
   #40 = Class              #42           // ext/mods/fakeplayer/holder/EquipesHolder
   #41 = NameAndType        #43:#22       // getRhand:()I
   #42 = Utf8               ext/mods/fakeplayer/holder/EquipesHolder
   #43 = Utf8               getRhand
   #44 = Fieldref           #45.#46       // ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
   #45 = Class              #47           // ext/mods/gameserver/enums/Paperdoll
   #46 = NameAndType        #48:#49       // RHAND:Lext/mods/gameserver/enums/Paperdoll;
   #47 = Utf8               ext/mods/gameserver/enums/Paperdoll
   #48 = Utf8               RHAND
   #49 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
   #50 = Methodref          #51.#52       // ext/mods/fakeplayer/EquipesManager.equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
   #51 = Class              #53           // ext/mods/fakeplayer/EquipesManager
   #52 = NameAndType        #54:#55       // equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
   #53 = Utf8               ext/mods/fakeplayer/EquipesManager
   #54 = Utf8               equipItem
   #55 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
   #56 = Methodref          #40.#57       // ext/mods/fakeplayer/holder/EquipesHolder.getLhand:()I
   #57 = NameAndType        #58:#22       // getLhand:()I
   #58 = Utf8               getLhand
   #59 = Fieldref           #45.#60       // ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
   #60 = NameAndType        #61:#49       // LHAND:Lext/mods/gameserver/enums/Paperdoll;
   #61 = Utf8               LHAND
   #62 = Methodref          #40.#63       // ext/mods/fakeplayer/holder/EquipesHolder.getHead:()I
   #63 = NameAndType        #64:#22       // getHead:()I
   #64 = Utf8               getHead
   #65 = Fieldref           #45.#66       // ext/mods/gameserver/enums/Paperdoll.HEAD:Lext/mods/gameserver/enums/Paperdoll;
   #66 = NameAndType        #67:#49       // HEAD:Lext/mods/gameserver/enums/Paperdoll;
   #67 = Utf8               HEAD
   #68 = Methodref          #40.#69       // ext/mods/fakeplayer/holder/EquipesHolder.getChest:()I
   #69 = NameAndType        #70:#22       // getChest:()I
   #70 = Utf8               getChest
   #71 = Fieldref           #45.#72       // ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
   #72 = NameAndType        #73:#49       // CHEST:Lext/mods/gameserver/enums/Paperdoll;
   #73 = Utf8               CHEST
   #74 = Methodref          #40.#75       // ext/mods/fakeplayer/holder/EquipesHolder.getLegs:()I
   #75 = NameAndType        #76:#22       // getLegs:()I
   #76 = Utf8               getLegs
   #77 = Fieldref           #45.#78       // ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
   #78 = NameAndType        #79:#49       // LEGS:Lext/mods/gameserver/enums/Paperdoll;
   #79 = Utf8               LEGS
   #80 = Methodref          #40.#81       // ext/mods/fakeplayer/holder/EquipesHolder.getHands:()I
   #81 = NameAndType        #82:#22       // getHands:()I
   #82 = Utf8               getHands
   #83 = Fieldref           #45.#84       // ext/mods/gameserver/enums/Paperdoll.GLOVES:Lext/mods/gameserver/enums/Paperdoll;
   #84 = NameAndType        #85:#49       // GLOVES:Lext/mods/gameserver/enums/Paperdoll;
   #85 = Utf8               GLOVES
   #86 = Methodref          #40.#87       // ext/mods/fakeplayer/holder/EquipesHolder.getFeet:()I
   #87 = NameAndType        #88:#22       // getFeet:()I
   #88 = Utf8               getFeet
   #89 = Fieldref           #45.#90       // ext/mods/gameserver/enums/Paperdoll.FEET:Lext/mods/gameserver/enums/Paperdoll;
   #90 = NameAndType        #91:#49       // FEET:Lext/mods/gameserver/enums/Paperdoll;
   #91 = Utf8               FEET
   #92 = Methodref          #40.#93       // ext/mods/fakeplayer/holder/EquipesHolder.getNeck:()I
   #93 = NameAndType        #94:#22       // getNeck:()I
   #94 = Utf8               getNeck
   #95 = Fieldref           #45.#96       // ext/mods/gameserver/enums/Paperdoll.NECK:Lext/mods/gameserver/enums/Paperdoll;
   #96 = NameAndType        #97:#49       // NECK:Lext/mods/gameserver/enums/Paperdoll;
   #97 = Utf8               NECK
   #98 = Methodref          #40.#99       // ext/mods/fakeplayer/holder/EquipesHolder.getLear:()I
   #99 = NameAndType        #100:#22      // getLear:()I
  #100 = Utf8               getLear
  #101 = Fieldref           #45.#102      // ext/mods/gameserver/enums/Paperdoll.LEAR:Lext/mods/gameserver/enums/Paperdoll;
  #102 = NameAndType        #103:#49      // LEAR:Lext/mods/gameserver/enums/Paperdoll;
  #103 = Utf8               LEAR
  #104 = Methodref          #40.#105      // ext/mods/fakeplayer/holder/EquipesHolder.getRear:()I
  #105 = NameAndType        #106:#22      // getRear:()I
  #106 = Utf8               getRear
  #107 = Fieldref           #45.#108      // ext/mods/gameserver/enums/Paperdoll.REAR:Lext/mods/gameserver/enums/Paperdoll;
  #108 = NameAndType        #109:#49      // REAR:Lext/mods/gameserver/enums/Paperdoll;
  #109 = Utf8               REAR
  #110 = Methodref          #40.#111      // ext/mods/fakeplayer/holder/EquipesHolder.getLring:()I
  #111 = NameAndType        #112:#22      // getLring:()I
  #112 = Utf8               getLring
  #113 = Fieldref           #45.#114      // ext/mods/gameserver/enums/Paperdoll.LFINGER:Lext/mods/gameserver/enums/Paperdoll;
  #114 = NameAndType        #115:#49      // LFINGER:Lext/mods/gameserver/enums/Paperdoll;
  #115 = Utf8               LFINGER
  #116 = Methodref          #40.#117      // ext/mods/fakeplayer/holder/EquipesHolder.getRring:()I
  #117 = NameAndType        #118:#22      // getRring:()I
  #118 = Utf8               getRring
  #119 = Fieldref           #45.#120      // ext/mods/gameserver/enums/Paperdoll.RFINGER:Lext/mods/gameserver/enums/Paperdoll;
  #120 = NameAndType        #121:#49      // RFINGER:Lext/mods/gameserver/enums/Paperdoll;
  #121 = Utf8               RFINGER
  #122 = Methodref          #123.#124     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #123 = Class              #125          // ext/mods/gameserver/data/xml/ItemData
  #124 = NameAndType        #27:#126      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #125 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #126 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #127 = Methodref          #123.#128     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #128 = NameAndType        #129:#130     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #129 = Utf8               getTemplate
  #130 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #131 = Fieldref           #51.#132      // ext/mods/fakeplayer/EquipesManager._log:Ljava/util/logging/Logger;
  #132 = NameAndType        #133:#134     // _log:Ljava/util/logging/Logger;
  #133 = Utf8               _log
  #134 = Utf8               Ljava/util/logging/Logger;
  #135 = Methodref          #8.#136       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #136 = NameAndType        #137:#22      // getObjectId:()I
  #137 = Utf8               getObjectId
  #138 = InvokeDynamic      #0:#139       // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #139 = NameAndType        #140:#141     // makeConcatWithConstants:(II)Ljava/lang/String;
  #140 = Utf8               makeConcatWithConstants
  #141 = Utf8               (II)Ljava/lang/String;
  #142 = Methodref          #143.#144     // java/util/logging/Logger.warning:(Ljava/lang/String;)V
  #143 = Class              #145          // java/util/logging/Logger
  #144 = NameAndType        #146:#147     // warning:(Ljava/lang/String;)V
  #145 = Utf8               java/util/logging/Logger
  #146 = Utf8               warning
  #147 = Utf8               (Ljava/lang/String;)V
  #148 = Methodref          #123.#149     // ext/mods/gameserver/data/xml/ItemData.createDummyItem:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #149 = NameAndType        #150:#151     // createDummyItem:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #150 = Utf8               createDummyItem
  #151 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #152 = Fieldref           #153.#154     // ext/mods/gameserver/enums/items/ItemLocation.PAPERDOLL:Lext/mods/gameserver/enums/items/ItemLocation;
  #153 = Class              #155          // ext/mods/gameserver/enums/items/ItemLocation
  #154 = NameAndType        #156:#157     // PAPERDOLL:Lext/mods/gameserver/enums/items/ItemLocation;
  #155 = Utf8               ext/mods/gameserver/enums/items/ItemLocation
  #156 = Utf8               PAPERDOLL
  #157 = Utf8               Lext/mods/gameserver/enums/items/ItemLocation;
  #158 = Methodref          #159.#160     // ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
  #159 = Class              #161          // ext/mods/gameserver/model/item/instance/ItemInstance
  #160 = NameAndType        #162:#163     // setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
  #161 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #162 = Utf8               setLocation
  #163 = Utf8               (Lext/mods/gameserver/enums/items/ItemLocation;)V
  #164 = Methodref          #8.#165       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #165 = NameAndType        #166:#167     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #166 = Utf8               getInventory
  #167 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #168 = Methodref          #169.#170     // ext/mods/gameserver/model/itemcontainer/PcInventory.setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #169 = Class              #171          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #170 = NameAndType        #172:#173     // setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #171 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #172 = Utf8               setPaperdollItem
  #173 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #174 = Methodref          #8.#175       // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #175 = NameAndType        #176:#6       // broadcastUserInfo:()V
  #176 = Utf8               broadcastUserInfo
  #177 = Methodref          #178.#179     // java/lang/Class.getName:()Ljava/lang/String;
  #178 = Class              #180          // java/lang/Class
  #179 = NameAndType        #181:#34      // getName:()Ljava/lang/String;
  #180 = Utf8               java/lang/Class
  #181 = Utf8               getName
  #182 = Methodref          #143.#183     // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #183 = NameAndType        #184:#185     // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #184 = Utf8               getLogger
  #185 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
  #186 = Utf8               Code
  #187 = Utf8               LineNumberTable
  #188 = Utf8               LocalVariableTable
  #189 = Utf8               this
  #190 = Utf8               Lext/mods/fakeplayer/EquipesManager;
  #191 = Utf8               applyEquipment
  #192 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #193 = Utf8               fakePlayer
  #194 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #195 = Utf8               classId
  #196 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #197 = Utf8               level
  #198 = Utf8               I
  #199 = Utf8               armorSet
  #200 = Utf8               Lext/mods/fakeplayer/holder/EquipesHolder;
  #201 = Utf8               StackMapTable
  #202 = Utf8               player
  #203 = Utf8               itemId
  #204 = Utf8               paperdollSlot
  #205 = Utf8               item
  #206 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #207 = Utf8               itemInstance
  #208 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #209 = Class              #210          // ext/mods/gameserver/model/item/kind/Item
  #210 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #211 = Utf8               <clinit>
  #212 = Utf8               SourceFile
  #213 = Utf8               EquipesManager.java
  #214 = Utf8               BootstrapMethods
  #215 = String             #216          // Phantom [\u0001] Armor Item com ID \u0001 dont have in database.
  #216 = Utf8               Phantom [\u0001] Armor Item com ID \u0001 dont have in database.
  #217 = MethodHandle       6:#218        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #218 = Methodref          #219.#220     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #219 = Class              #221          // java/lang/invoke/StringConcatFactory
  #220 = NameAndType        #140:#222     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #221 = Utf8               java/lang/invoke/StringConcatFactory
  #222 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #223 = Utf8               InnerClasses
  #224 = Class              #225          // java/lang/invoke/MethodHandles$Lookup
  #225 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #226 = Class              #227          // java/lang/invoke/MethodHandles
  #227 = Utf8               java/lang/invoke/MethodHandles
  #228 = Utf8               Lookup
{
  public ext.mods.fakeplayer.EquipesManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/EquipesManager;

  public static void applyEquipment(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=4, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
         4: astore_1
         5: aload_0
         6: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
         9: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        12: istore_2
        13: invokestatic  #23                 // Method ext/mods/fakeplayer/data/EquipesData.getInstance:()Lext/mods/fakeplayer/data/EquipesData;
        16: aload_1
        17: invokevirtual #29                 // Method ext/mods/gameserver/enums/actors/ClassId.name:()Ljava/lang/String;
        20: iload_2
        21: invokevirtual #35                 // Method ext/mods/fakeplayer/data/EquipesData.getArmorSet:(Ljava/lang/String;I)Lext/mods/fakeplayer/holder/EquipesHolder;
        24: astore_3
        25: aload_3
        26: ifnonnull     30
        29: return
        30: aload_0
        31: aload_3
        32: invokevirtual #39                 // Method ext/mods/fakeplayer/holder/EquipesHolder.getRhand:()I
        35: getstatic     #44                 // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
        38: invokestatic  #50                 // Method equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
        41: aload_0
        42: aload_3
        43: invokevirtual #56                 // Method ext/mods/fakeplayer/holder/EquipesHolder.getLhand:()I
        46: getstatic     #59                 // Field ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
        49: invokestatic  #50                 // Method equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
        52: aload_0
        53: aload_3
        54: invokevirtual #62                 // Method ext/mods/fakeplayer/holder/EquipesHolder.getHead:()I
        57: getstatic     #65                 // Field ext/mods/gameserver/enums/Paperdoll.HEAD:Lext/mods/gameserver/enums/Paperdoll;
        60: invokestatic  #50                 // Method equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
        63: aload_0
        64: aload_3
        65: invokevirtual #68                 // Method ext/mods/fakeplayer/holder/EquipesHolder.getChest:()I
        68: getstatic     #71                 // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
        71: invokestatic  #50                 // Method equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
        74: aload_0
        75: aload_3
        76: invokevirtual #74                 // Method ext/mods/fakeplayer/holder/EquipesHolder.getLegs:()I
        79: getstatic     #77                 // Field ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
        82: invokestatic  #50                 // Method equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
        85: aload_0
        86: aload_3
        87: invokevirtual #80                 // Method ext/mods/fakeplayer/holder/EquipesHolder.getHands:()I
        90: getstatic     #83                 // Field ext/mods/gameserver/enums/Paperdoll.GLOVES:Lext/mods/gameserver/enums/Paperdoll;
        93: invokestatic  #50                 // Method equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
        96: aload_0
        97: aload_3
        98: invokevirtual #86                 // Method ext/mods/fakeplayer/holder/EquipesHolder.getFeet:()I
       101: getstatic     #89                 // Field ext/mods/gameserver/enums/Paperdoll.FEET:Lext/mods/gameserver/enums/Paperdoll;
       104: invokestatic  #50                 // Method equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
       107: aload_0
       108: aload_3
       109: invokevirtual #92                 // Method ext/mods/fakeplayer/holder/EquipesHolder.getNeck:()I
       112: getstatic     #95                 // Field ext/mods/gameserver/enums/Paperdoll.NECK:Lext/mods/gameserver/enums/Paperdoll;
       115: invokestatic  #50                 // Method equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
       118: aload_0
       119: aload_3
       120: invokevirtual #98                 // Method ext/mods/fakeplayer/holder/EquipesHolder.getLear:()I
       123: getstatic     #101                // Field ext/mods/gameserver/enums/Paperdoll.LEAR:Lext/mods/gameserver/enums/Paperdoll;
       126: invokestatic  #50                 // Method equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
       129: aload_0
       130: aload_3
       131: invokevirtual #104                // Method ext/mods/fakeplayer/holder/EquipesHolder.getRear:()I
       134: getstatic     #107                // Field ext/mods/gameserver/enums/Paperdoll.REAR:Lext/mods/gameserver/enums/Paperdoll;
       137: invokestatic  #50                 // Method equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
       140: aload_0
       141: aload_3
       142: invokevirtual #110                // Method ext/mods/fakeplayer/holder/EquipesHolder.getLring:()I
       145: getstatic     #113                // Field ext/mods/gameserver/enums/Paperdoll.LFINGER:Lext/mods/gameserver/enums/Paperdoll;
       148: invokestatic  #50                 // Method equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
       151: aload_0
       152: aload_3
       153: invokevirtual #116                // Method ext/mods/fakeplayer/holder/EquipesHolder.getRring:()I
       156: getstatic     #119                // Field ext/mods/gameserver/enums/Paperdoll.RFINGER:Lext/mods/gameserver/enums/Paperdoll;
       159: invokestatic  #50                 // Method equipItem:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/Paperdoll;)V
       162: return
      LineNumberTable:
        line 39: 0
        line 40: 5
        line 42: 13
        line 44: 25
        line 46: 29
        line 49: 30
        line 50: 41
        line 51: 52
        line 52: 63
        line 53: 74
        line 54: 85
        line 55: 96
        line 56: 107
        line 57: 118
        line 58: 129
        line 59: 140
        line 60: 151
        line 61: 162
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     163     0 fakePlayer   Lext/mods/gameserver/model/actor/Player;
            5     158     1 classId   Lext/mods/gameserver/enums/actors/ClassId;
           13     150     2 level   I
           25     138     3 armorSet   Lext/mods/fakeplayer/holder/EquipesHolder;
      StackMapTable: number_of_entries = 1
        frame_type = 254 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/enums/actors/ClassId, int, class ext/mods/fakeplayer/holder/EquipesHolder ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #51                 // class ext/mods/fakeplayer/EquipesManager
         2: invokevirtual #177                // Method java/lang/Class.getName:()Ljava/lang/String;
         5: invokestatic  #182                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         8: putstatic     #131                // Field _log:Ljava/util/logging/Logger;
        11: return
      LineNumberTable:
        line 35: 0
}
SourceFile: "EquipesManager.java"
BootstrapMethods:
  0: #217 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #215 Phantom [\u0001] Armor Item com ID \u0001 dont have in database.
InnerClasses:
  public static final #228= #224 of #226; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
