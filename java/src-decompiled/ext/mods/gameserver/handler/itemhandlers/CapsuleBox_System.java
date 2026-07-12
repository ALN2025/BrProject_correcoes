// Bytecode for: ext.mods.gameserver.handler.itemhandlers.CapsuleBox_System
// File: ext\mods\gameserver\handler\itemhandlers\CapsuleBox_System.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/CapsuleBox_System.class
  Last modified 9 de jul de 2026; size 3599 bytes
  MD5 checksum 281bda27a904d2e23a0929a44fb1fe18
  Compiled from "CapsuleBox_System.java"
public class ext.mods.gameserver.handler.itemhandlers.CapsuleBox_System implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #124                        // ext/mods/gameserver/handler/itemhandlers/CapsuleBox_System
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #10.#11       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #10 = Class              #12           // ext/mods/gameserver/model/item/instance/ItemInstance
   #11 = NameAndType        #13:#14       // getItemId:()I
   #12 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #13 = Utf8               getItemId
   #14 = Utf8               ()I
   #15 = Methodref          #16.#17       // ext/mods/CapsuleBox/CapsuleBoxData.getInstance:()Lext/mods/CapsuleBox/CapsuleBoxData;
   #16 = Class              #18           // ext/mods/CapsuleBox/CapsuleBoxData
   #17 = NameAndType        #19:#20       // getInstance:()Lext/mods/CapsuleBox/CapsuleBoxData;
   #18 = Utf8               ext/mods/CapsuleBox/CapsuleBoxData
   #19 = Utf8               getInstance
   #20 = Utf8               ()Lext/mods/CapsuleBox/CapsuleBoxData;
   #21 = Methodref          #16.#22       // ext/mods/CapsuleBox/CapsuleBoxData.getCapsuleBoxItemById:(I)Lext/mods/CapsuleBox/CapsuleBoxItem;
   #22 = NameAndType        #23:#24       // getCapsuleBoxItemById:(I)Lext/mods/CapsuleBox/CapsuleBoxItem;
   #23 = Utf8               getCapsuleBoxItemById
   #24 = Utf8               (I)Lext/mods/CapsuleBox/CapsuleBoxItem;
   #25 = Methodref          #7.#26        // ext/mods/gameserver/model/actor/Player.getLevel:()I
   #26 = NameAndType        #27:#14       // getLevel:()I
   #27 = Utf8               getLevel
   #28 = Methodref          #29.#30       // ext/mods/CapsuleBox/CapsuleBoxItem.getPlayerLevel:()I
   #29 = Class              #31           // ext/mods/CapsuleBox/CapsuleBoxItem
   #30 = NameAndType        #32:#14       // getPlayerLevel:()I
   #31 = Utf8               ext/mods/CapsuleBox/CapsuleBoxItem
   #32 = Utf8               getPlayerLevel
   #33 = InvokeDynamic      #0:#34        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #34 = NameAndType        #35:#36       // makeConcatWithConstants:(I)Ljava/lang/String;
   #35 = Utf8               makeConcatWithConstants
   #36 = Utf8               (I)Ljava/lang/String;
   #37 = Methodref          #7.#38        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #38 = NameAndType        #39:#40       // sendMessage:(Ljava/lang/String;)V
   #39 = Utf8               sendMessage
   #40 = Utf8               (Ljava/lang/String;)V
   #41 = Methodref          #29.#42       // ext/mods/CapsuleBox/CapsuleBoxItem.getItems:()Ljava/util/List;
   #42 = NameAndType        #43:#44       // getItems:()Ljava/util/List;
   #43 = Utf8               getItems
   #44 = Utf8               ()Ljava/util/List;
   #45 = InterfaceMethodref #46.#47       // java/util/List.iterator:()Ljava/util/Iterator;
   #46 = Class              #48           // java/util/List
   #47 = NameAndType        #49:#50       // iterator:()Ljava/util/Iterator;
   #48 = Utf8               java/util/List
   #49 = Utf8               iterator
   #50 = Utf8               ()Ljava/util/Iterator;
   #51 = InterfaceMethodref #52.#53       // java/util/Iterator.hasNext:()Z
   #52 = Class              #54           // java/util/Iterator
   #53 = NameAndType        #55:#56       // hasNext:()Z
   #54 = Utf8               java/util/Iterator
   #55 = Utf8               hasNext
   #56 = Utf8               ()Z
   #57 = InterfaceMethodref #52.#58       // java/util/Iterator.next:()Ljava/lang/Object;
   #58 = NameAndType        #59:#60       // next:()Ljava/lang/Object;
   #59 = Utf8               next
   #60 = Utf8               ()Ljava/lang/Object;
   #61 = Class              #62           // ext/mods/CapsuleBox/CapsuleBoxItem$Item
   #62 = Utf8               ext/mods/CapsuleBox/CapsuleBoxItem$Item
   #63 = Methodref          #64.#65       // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #64 = Class              #66           // ext/mods/gameserver/idfactory/IdFactory
   #65 = NameAndType        #19:#67       // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #66 = Utf8               ext/mods/gameserver/idfactory/IdFactory
   #67 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
   #68 = Methodref          #64.#69       // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
   #69 = NameAndType        #70:#14       // getNextId:()I
   #70 = Utf8               getNextId
   #71 = Methodref          #61.#11       // ext/mods/CapsuleBox/CapsuleBoxItem$Item.getItemId:()I
   #72 = Methodref          #10.#73       // ext/mods/gameserver/model/item/instance/ItemInstance."<init>":(II)V
   #73 = NameAndType        #5:#74        // "<init>":(II)V
   #74 = Utf8               (II)V
   #75 = Methodref          #76.#77       // ext/mods/commons/random/Rnd.get:(I)I
   #76 = Class              #78           // ext/mods/commons/random/Rnd
   #77 = NameAndType        #79:#80       // get:(I)I
   #78 = Utf8               ext/mods/commons/random/Rnd
   #79 = Utf8               get
   #80 = Utf8               (I)I
   #81 = Methodref          #61.#82       // ext/mods/CapsuleBox/CapsuleBoxItem$Item.getChance:()I
   #82 = NameAndType        #83:#14       // getChance:()I
   #83 = Utf8               getChance
   #84 = Methodref          #10.#85       // ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
   #85 = NameAndType        #86:#56       // isStackable:()Z
   #86 = Utf8               isStackable
   #87 = Methodref          #61.#88       // ext/mods/CapsuleBox/CapsuleBoxItem$Item.getEnchantLevel:()I
   #88 = NameAndType        #89:#14       // getEnchantLevel:()I
   #89 = Utf8               getEnchantLevel
   #90 = Methodref          #10.#91       // ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
   #91 = NameAndType        #92:#93       // setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
   #92 = Utf8               setEnchantLevel
   #93 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
   #94 = Methodref          #7.#95        // ext/mods/gameserver/model/actor/Player.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #95 = NameAndType        #96:#97       // addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #96 = Utf8               addItem
   #97 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #98 = Methodref          #61.#99       // ext/mods/CapsuleBox/CapsuleBoxItem$Item.getAmount:()I
   #99 = NameAndType        #100:#14      // getAmount:()I
  #100 = Utf8               getAmount
  #101 = Methodref          #7.#102       // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #102 = NameAndType        #96:#103      // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #103 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #104 = Class              #105          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #105 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #106 = Methodref          #104.#107     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #107 = NameAndType        #5:#108       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #108 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #109 = Methodref          #7.#110       // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #110 = NameAndType        #111:#112     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #111 = Utf8               broadcastPacket
  #112 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #113 = String             #114          // This Capsule box expired or is invalid!
  #114 = Utf8               This Capsule box expired or is invalid!
  #115 = Methodref          #10.#116      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #116 = NameAndType        #117:#14      // getObjectId:()I
  #117 = Utf8               getObjectId
  #118 = Methodref          #119.#120     // ext/mods/gameserver/model/actor/Playable.destroyItem:(IIZ)Z
  #119 = Class              #121          // ext/mods/gameserver/model/actor/Playable
  #120 = NameAndType        #122:#123     // destroyItem:(IIZ)Z
  #121 = Utf8               ext/mods/gameserver/model/actor/Playable
  #122 = Utf8               destroyItem
  #123 = Utf8               (IIZ)Z
  #124 = Class              #125          // ext/mods/gameserver/handler/itemhandlers/CapsuleBox_System
  #125 = Utf8               ext/mods/gameserver/handler/itemhandlers/CapsuleBox_System
  #126 = Class              #127          // ext/mods/gameserver/handler/IItemHandler
  #127 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #128 = Utf8               Code
  #129 = Utf8               LineNumberTable
  #130 = Utf8               LocalVariableTable
  #131 = Utf8               this
  #132 = Utf8               Lext/mods/gameserver/handler/itemhandlers/CapsuleBox_System;
  #133 = Utf8               useItem
  #134 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #135 = Utf8               random
  #136 = Utf8               I
  #137 = Utf8               MSU
  #138 = Utf8               Lext/mods/gameserver/network/serverpackets/MagicSkillUse;
  #139 = Utf8               boxItem
  #140 = Utf8               Lext/mods/CapsuleBox/CapsuleBoxItem$Item;
  #141 = Utf8               toGive
  #142 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #143 = Utf8               playable
  #144 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #145 = Utf8               item
  #146 = Utf8               forceUse
  #147 = Utf8               Z
  #148 = Utf8               activeChar
  #149 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #150 = Utf8               itemId
  #151 = Utf8               capsuleBoxItem
  #152 = Utf8               Lext/mods/CapsuleBox/CapsuleBoxItem;
  #153 = Utf8               StackMapTable
  #154 = Utf8               SourceFile
  #155 = Utf8               CapsuleBox_System.java
  #156 = Utf8               BootstrapMethods
  #157 = String             #158          // Para Usar Esta Capsule Box Necesitas El LvL.\u0001
  #158 = Utf8               Para Usar Esta Capsule Box Necesitas El LvL.\u0001
  #159 = MethodHandle       6:#160        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #160 = Methodref          #161.#162     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #161 = Class              #163          // java/lang/invoke/StringConcatFactory
  #162 = NameAndType        #35:#164      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #163 = Utf8               java/lang/invoke/StringConcatFactory
  #164 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #165 = Utf8               InnerClasses
  #166 = Utf8               Item
  #167 = Class              #168          // java/lang/invoke/MethodHandles$Lookup
  #168 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #169 = Class              #170          // java/lang/invoke/MethodHandles
  #170 = Utf8               java/lang/invoke/MethodHandles
  #171 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.itemhandlers.CapsuleBox_System();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/CapsuleBox_System;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=12, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifne          8
         7: return
         8: aload_1
         9: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        12: astore        4
        14: aload_2
        15: invokevirtual #9                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        18: istore        5
        20: invokestatic  #15                 // Method ext/mods/CapsuleBox/CapsuleBoxData.getInstance:()Lext/mods/CapsuleBox/CapsuleBoxData;
        23: iload         5
        25: invokevirtual #21                 // Method ext/mods/CapsuleBox/CapsuleBoxData.getCapsuleBoxItemById:(I)Lext/mods/CapsuleBox/CapsuleBoxItem;
        28: astore        6
        30: aload         6
        32: ifnull        217
        35: aload         4
        37: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.getLevel:()I
        40: aload         6
        42: invokevirtual #28                 // Method ext/mods/CapsuleBox/CapsuleBoxItem.getPlayerLevel:()I
        45: if_icmpge     64
        48: aload         4
        50: aload         6
        52: invokevirtual #28                 // Method ext/mods/CapsuleBox/CapsuleBoxItem.getPlayerLevel:()I
        55: invokedynamic #33,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        60: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        63: return
        64: aconst_null
        65: astore        7
        67: aload         6
        69: invokevirtual #41                 // Method ext/mods/CapsuleBox/CapsuleBoxItem.getItems:()Ljava/util/List;
        72: invokeinterface #45,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        77: astore        8
        79: aload         8
        81: invokeinterface #51,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        86: ifeq          214
        89: aload         8
        91: invokeinterface #57,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        96: checkcast     #61                 // class ext/mods/CapsuleBox/CapsuleBoxItem$Item
        99: astore        9
       101: new           #10                 // class ext/mods/gameserver/model/item/instance/ItemInstance
       104: dup
       105: invokestatic  #63                 // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
       108: invokevirtual #68                 // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
       111: aload         9
       113: invokevirtual #71                 // Method ext/mods/CapsuleBox/CapsuleBoxItem$Item.getItemId:()I
       116: invokespecial #72                 // Method ext/mods/gameserver/model/item/instance/ItemInstance."<init>":(II)V
       119: astore        7
       121: bipush        100
       123: invokestatic  #75                 // Method ext/mods/commons/random/Rnd.get:(I)I
       126: istore        10
       128: iload         10
       130: aload         9
       132: invokevirtual #81                 // Method ext/mods/CapsuleBox/CapsuleBoxItem$Item.getChance:()I
       135: if_icmpge     185
       138: aload         7
       140: invokevirtual #84                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
       143: ifne          168
       146: aload         7
       148: aload         9
       150: invokevirtual #87                 // Method ext/mods/CapsuleBox/CapsuleBoxItem$Item.getEnchantLevel:()I
       153: aload_1
       154: invokevirtual #90                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
       157: aload         4
       159: aload         7
       161: iconst_1
       162: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Player.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       165: goto          185
       168: aload         4
       170: aload         9
       172: invokevirtual #71                 // Method ext/mods/CapsuleBox/CapsuleBoxItem$Item.getItemId:()I
       175: aload         9
       177: invokevirtual #98                 // Method ext/mods/CapsuleBox/CapsuleBoxItem$Item.getAmount:()I
       180: iconst_1
       181: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       184: pop
       185: new           #104                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       188: dup
       189: aload         4
       191: aload         4
       193: sipush        2024
       196: iconst_1
       197: iconst_1
       198: iconst_0
       199: invokespecial #106                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       202: astore        11
       204: aload         4
       206: aload         11
       208: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       211: goto          79
       214: goto          224
       217: aload         4
       219: ldc           #113                // String This Capsule box expired or is invalid!
       221: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       224: aload_1
       225: aload_2
       226: invokevirtual #115                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       229: iconst_1
       230: iconst_0
       231: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.destroyItem:(IIZ)Z
       234: pop
       235: return
      LineNumberTable:
        line 41: 0
        line 42: 7
        line 44: 8
        line 45: 14
        line 47: 20
        line 48: 30
        line 49: 35
        line 50: 48
        line 51: 63
        line 54: 64
        line 55: 67
        line 56: 101
        line 57: 121
        line 58: 128
        line 59: 138
        line 60: 146
        line 61: 157
        line 63: 168
        line 68: 185
        line 69: 204
        line 71: 211
        line 73: 214
        line 74: 217
        line 77: 224
        line 78: 235
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          128      83    10 random   I
          204       7    11   MSU   Lext/mods/gameserver/network/serverpackets/MagicSkillUse;
          101     110     9 boxItem   Lext/mods/CapsuleBox/CapsuleBoxItem$Item;
           67     147     7 toGive   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     236     0  this   Lext/mods/gameserver/handler/itemhandlers/CapsuleBox_System;
            0     236     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     236     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     236     3 forceUse   Z
           14     222     4 activeChar   Lext/mods/gameserver/model/actor/Player;
           20     216     5 itemId   I
           30     206     6 capsuleBoxItem   Lext/mods/CapsuleBox/CapsuleBoxItem;
      StackMapTable: number_of_entries = 8
        frame_type = 8 /* same */
        frame_type = 254 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/actor/Player, int, class ext/mods/CapsuleBox/CapsuleBoxItem ]
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 88
          locals = [ class ext/mods/CapsuleBox/CapsuleBoxItem$Item, int ]
        frame_type = 16 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/handler/itemhandlers/CapsuleBox_System, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/item/instance/ItemInstance, int, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/CapsuleBox/CapsuleBoxItem ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 6 /* same */
}
SourceFile: "CapsuleBox_System.java"
BootstrapMethods:
  0: #159 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #157 Para Usar Esta Capsule Box Necesitas El LvL.\u0001
InnerClasses:
  public static #166= #61 of #29;         // Item=class ext/mods/CapsuleBox/CapsuleBoxItem$Item of class ext/mods/CapsuleBox/CapsuleBoxItem
  public static final #171= #167 of #169; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
