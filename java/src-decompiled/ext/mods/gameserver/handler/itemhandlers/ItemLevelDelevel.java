// Bytecode for: ext.mods.gameserver.handler.itemhandlers.ItemLevelDelevel
// File: ext\mods\gameserver\handler\itemhandlers\ItemLevelDelevel.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/ItemLevelDelevel.class
  Last modified 9 de jul de 2026; size 3555 bytes
  MD5 checksum 8849d0cd26f7a7caa03b5b4b084747f8
  Compiled from "ItemLevelDelevel.java"
public class ext.mods.gameserver.handler.itemhandlers.ItemLevelDelevel implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #124                        // ext/mods/gameserver/handler/itemhandlers/ItemLevelDelevel
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #10 = NameAndType        #11:#12       // isInOlympiadMode:()Z
   #11 = Utf8               isInOlympiadMode
   #12 = Utf8               ()Z
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/network/SystemMessageId.THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
   #14 = Class              #16           // ext/mods/gameserver/network/SystemMessageId
   #15 = NameAndType        #17:#18       // THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
   #16 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #17 = Utf8               THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT
   #18 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #19 = Methodref          #7.#20        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #20 = NameAndType        #21:#22       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #21 = Utf8               sendPacket
   #22 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #23 = Methodref          #24.#25       // ext/mods/gameserver/data/manager/ItemLevelDelevelManager.getInstance:()Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
   #24 = Class              #26           // ext/mods/gameserver/data/manager/ItemLevelDelevelManager
   #25 = NameAndType        #27:#28       // getInstance:()Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
   #26 = Utf8               ext/mods/gameserver/data/manager/ItemLevelDelevelManager
   #27 = Utf8               getInstance
   #28 = Utf8               ()Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #30 = Class              #32           // ext/mods/gameserver/model/item/instance/ItemInstance
   #31 = NameAndType        #33:#34       // getItemId:()I
   #32 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #33 = Utf8               getItemId
   #34 = Utf8               ()I
   #35 = Methodref          #24.#36       // ext/mods/gameserver/data/manager/ItemLevelDelevelManager.isConfigured:(I)Z
   #36 = NameAndType        #37:#38       // isConfigured:(I)Z
   #37 = Utf8               isConfigured
   #38 = Utf8               (I)Z
   #39 = String             #40           // This item is not configured for level/delevel.
   #40 = Utf8               This item is not configured for level/delevel.
   #41 = Methodref          #7.#42        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #42 = NameAndType        #43:#44       // sendMessage:(Ljava/lang/String;)V
   #43 = Utf8               sendMessage
   #44 = Utf8               (Ljava/lang/String;)V
   #45 = Methodref          #24.#46       // ext/mods/gameserver/data/manager/ItemLevelDelevelManager.getLevelAdd:(I)I
   #46 = NameAndType        #47:#48       // getLevelAdd:(I)I
   #47 = Utf8               getLevelAdd
   #48 = Utf8               (I)I
   #49 = Methodref          #24.#50       // ext/mods/gameserver/data/manager/ItemLevelDelevelManager.getLevelRemove:(I)I
   #50 = NameAndType        #51:#48       // getLevelRemove:(I)I
   #51 = Utf8               getLevelRemove
   #52 = Methodref          #24.#53       // ext/mods/gameserver/data/manager/ItemLevelDelevelManager.getMaxLevel:()I
   #53 = NameAndType        #54:#34       // getMaxLevel:()I
   #54 = Utf8               getMaxLevel
   #55 = Methodref          #7.#56        // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #56 = NameAndType        #57:#58       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #57 = Utf8               getStatus
   #58 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #59 = Methodref          #60.#61       // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
   #60 = Class              #62           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #61 = NameAndType        #63:#34       // getLevel:()I
   #62 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #63 = Utf8               getLevel
   #64 = Methodref          #60.#65       // ext/mods/gameserver/model/actor/status/PlayerStatus.getExp:()J
   #65 = NameAndType        #66:#67       // getExp:()J
   #66 = Utf8               getExp
   #67 = Utf8               ()J
   #68 = Methodref          #69.#70       // java/lang/Math.min:(II)I
   #69 = Class              #71           // java/lang/Math
   #70 = NameAndType        #72:#73       // min:(II)I
   #71 = Utf8               java/lang/Math
   #72 = Utf8               min
   #73 = Utf8               (II)I
   #74 = Methodref          #69.#75       // java/lang/Math.max:(II)I
   #75 = NameAndType        #76:#73       // max:(II)I
   #76 = Utf8               max
   #77 = Methodref          #60.#78       // ext/mods/gameserver/model/actor/status/PlayerStatus.getExpForLevel:(I)J
   #78 = NameAndType        #79:#80       // getExpForLevel:(I)J
   #79 = Utf8               getExpForLevel
   #80 = Utf8               (I)J
   #81 = Methodref          #69.#82       // java/lang/Math.max:(JJ)J
   #82 = NameAndType        #76:#83       // max:(JJ)J
   #83 = Utf8               (JJ)J
   #84 = Methodref          #60.#85       // ext/mods/gameserver/model/actor/status/PlayerStatus.removeExpAndSp:(JI)Z
   #85 = NameAndType        #86:#87       // removeExpAndSp:(JI)Z
   #86 = Utf8               removeExpAndSp
   #87 = Utf8               (JI)Z
   #88 = Methodref          #60.#89       // ext/mods/gameserver/model/actor/status/PlayerStatus.addExp:(J)Z
   #89 = NameAndType        #90:#91       // addExp:(J)Z
   #90 = Utf8               addExp
   #91 = Utf8               (J)Z
   #92 = Methodref          #7.#93        // ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
   #93 = NameAndType        #94:#95       // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
   #94 = Utf8               destroyItem
   #95 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
   #96 = Fieldref           #14.#97       // ext/mods/gameserver/network/SystemMessageId.YOU_INCREASED_YOUR_LEVEL:Lext/mods/gameserver/network/SystemMessageId;
   #97 = NameAndType        #98:#18       // YOU_INCREASED_YOUR_LEVEL:Lext/mods/gameserver/network/SystemMessageId;
   #98 = Utf8               YOU_INCREASED_YOUR_LEVEL
   #99 = Methodref          #100.#101     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #100 = Class              #102          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #101 = NameAndType        #103:#104     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #102 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #103 = Utf8               getSystemMessage
  #104 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #105 = Methodref          #7.#106       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #106 = NameAndType        #21:#107      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #107 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #108 = Fieldref           #14.#109      // ext/mods/gameserver/network/SystemMessageId.EXP_DECREASED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
  #109 = NameAndType        #110:#18      // EXP_DECREASED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
  #110 = Utf8               EXP_DECREASED_BY_S1
  #111 = Class              #112          // java/lang/Integer
  #112 = Utf8               java/lang/Integer
  #113 = Long               2147483647l
  #115 = Methodref          #69.#116      // java/lang/Math.min:(JJ)J
  #116 = NameAndType        #72:#83       // min:(JJ)J
  #117 = Methodref          #100.#118     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #118 = NameAndType        #119:#120     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #119 = Utf8               addNumber
  #120 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #121 = Methodref          #7.#122       // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #122 = NameAndType        #123:#6       // broadcastUserInfo:()V
  #123 = Utf8               broadcastUserInfo
  #124 = Class              #125          // ext/mods/gameserver/handler/itemhandlers/ItemLevelDelevel
  #125 = Utf8               ext/mods/gameserver/handler/itemhandlers/ItemLevelDelevel
  #126 = Class              #127          // ext/mods/gameserver/handler/IItemHandler
  #127 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #128 = Utf8               Code
  #129 = Utf8               LineNumberTable
  #130 = Utf8               LocalVariableTable
  #131 = Utf8               this
  #132 = Utf8               Lext/mods/gameserver/handler/itemhandlers/ItemLevelDelevel;
  #133 = Utf8               useItem
  #134 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #135 = Utf8               player
  #136 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #137 = Utf8               targetLevel
  #138 = Utf8               I
  #139 = Utf8               targetExp
  #140 = Utf8               J
  #141 = Utf8               expToRemove
  #142 = Utf8               toRemove
  #143 = Utf8               toAdd
  #144 = Utf8               expForTarget
  #145 = Utf8               playable
  #146 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #147 = Utf8               item
  #148 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #149 = Utf8               forceUse
  #150 = Utf8               Z
  #151 = Utf8               manager
  #152 = Utf8               Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
  #153 = Utf8               levelAdd
  #154 = Utf8               levelRemove
  #155 = Utf8               maxLevel
  #156 = Utf8               currentLevel
  #157 = Utf8               initialLevel
  #158 = Utf8               initialExp
  #159 = Utf8               newLevel
  #160 = Utf8               StackMapTable
  #161 = Class              #162          // ext/mods/gameserver/model/actor/Playable
  #162 = Utf8               ext/mods/gameserver/model/actor/Playable
  #163 = Utf8               SourceFile
  #164 = Utf8               ItemLevelDelevel.java
{
  public ext.mods.gameserver.handler.itemhandlers.ItemLevelDelevel();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/ItemLevelDelevel;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=19, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: aload         4
        19: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        22: ifeq          34
        25: aload         4
        27: getstatic     #13                 // Field ext/mods/gameserver/network/SystemMessageId.THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
        30: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        33: return
        34: invokestatic  #23                 // Method ext/mods/gameserver/data/manager/ItemLevelDelevelManager.getInstance:()Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
        37: astore        5
        39: aload         5
        41: aload_2
        42: invokevirtual #29                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        45: invokevirtual #35                 // Method ext/mods/gameserver/data/manager/ItemLevelDelevelManager.isConfigured:(I)Z
        48: ifne          59
        51: aload         4
        53: ldc           #39                 // String This item is not configured for level/delevel.
        55: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        58: return
        59: aload         5
        61: aload_2
        62: invokevirtual #29                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        65: invokevirtual #45                 // Method ext/mods/gameserver/data/manager/ItemLevelDelevelManager.getLevelAdd:(I)I
        68: istore        6
        70: aload         5
        72: aload_2
        73: invokevirtual #29                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        76: invokevirtual #49                 // Method ext/mods/gameserver/data/manager/ItemLevelDelevelManager.getLevelRemove:(I)I
        79: istore        7
        81: aload         5
        83: invokevirtual #52                 // Method ext/mods/gameserver/data/manager/ItemLevelDelevelManager.getMaxLevel:()I
        86: istore        8
        88: aload         4
        90: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        93: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        96: istore        9
        98: iload         9
       100: istore        10
       102: aload         4
       104: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       107: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getExp:()J
       110: lstore        11
       112: iload         7
       114: ifeq          208
       117: iload         7
       119: iconst_m1
       120: if_icmpne     130
       123: iload         9
       125: iconst_1
       126: isub
       127: goto          139
       130: iload         7
       132: iload         9
       134: iconst_1
       135: isub
       136: invokestatic  #68                 // Method java/lang/Math.min:(II)I
       139: istore        13
       141: iload         13
       143: ifle          208
       146: iconst_1
       147: iload         9
       149: iload         13
       151: isub
       152: invokestatic  #74                 // Method java/lang/Math.max:(II)I
       155: istore        14
       157: aload         4
       159: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       162: iload         14
       164: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getExpForLevel:(I)J
       167: lstore        15
       169: lconst_1
       170: aload         4
       172: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       175: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getExp:()J
       178: lload         15
       180: lsub
       181: invokestatic  #81                 // Method java/lang/Math.max:(JJ)J
       184: lstore        17
       186: aload         4
       188: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       191: lload         17
       193: iconst_0
       194: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.removeExpAndSp:(JI)Z
       197: pop
       198: aload         4
       200: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       203: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       206: istore        9
       208: iload         6
       210: ifeq          285
       213: iload         6
       215: iconst_m1
       216: if_icmpne     229
       219: iload         8
       221: iload         9
       223: isub
       224: istore        13
       226: goto          241
       229: iload         6
       231: iload         8
       233: iload         9
       235: isub
       236: invokestatic  #68                 // Method java/lang/Math.min:(II)I
       239: istore        13
       241: iload         13
       243: ifle          285
       246: aload         4
       248: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       251: iload         9
       253: iload         13
       255: iadd
       256: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getExpForLevel:(I)J
       259: lstore        14
       261: aload         4
       263: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       266: lconst_0
       267: lload         14
       269: aload         4
       271: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       274: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getExp:()J
       277: lsub
       278: invokestatic  #81                 // Method java/lang/Math.max:(JJ)J
       281: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.addExp:(J)Z
       284: pop
       285: aload         4
       287: aload_2
       288: iconst_1
       289: iconst_0
       290: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;IZ)Z
       293: pop
       294: aload         4
       296: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       299: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       302: istore        13
       304: iload         13
       306: iload         10
       308: if_icmple     325
       311: aload         4
       313: getstatic     #96                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_INCREASED_YOUR_LEVEL:Lext/mods/gameserver/network/SystemMessageId;
       316: invokestatic  #99                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       319: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       322: goto          364
       325: iload         13
       327: iload         10
       329: if_icmpge     364
       332: aload         4
       334: getstatic     #108                // Field ext/mods/gameserver/network/SystemMessageId.EXP_DECREASED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
       337: invokestatic  #99                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       340: ldc2_w        #113                // long 2147483647l
       343: lload         11
       345: aload         4
       347: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       350: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getExp:()J
       353: lsub
       354: invokestatic  #115                // Method java/lang/Math.min:(JJ)J
       357: l2i
       358: invokevirtual #117                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       361: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       364: aload         4
       366: invokevirtual #121                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       369: return
      LineNumberTable:
        line 41: 0
        line 42: 16
        line 44: 17
        line 46: 25
        line 47: 33
        line 50: 34
        line 51: 39
        line 53: 51
        line 54: 58
        line 57: 59
        line 58: 70
        line 59: 81
        line 60: 88
        line 61: 98
        line 62: 102
        line 64: 112
        line 66: 117
        line 67: 141
        line 69: 146
        line 70: 157
        line 71: 169
        line 72: 186
        line 73: 198
        line 77: 208
        line 80: 213
        line 81: 219
        line 83: 229
        line 85: 241
        line 87: 246
        line 88: 261
        line 92: 285
        line 93: 294
        line 94: 304
        line 95: 311
        line 96: 325
        line 97: 332
        line 98: 364
        line 99: 369
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
          157      51    14 targetLevel   I
          169      39    15 targetExp   J
          186      22    17 expToRemove   J
          141      67    13 toRemove   I
          226       3    13 toAdd   I
          261      24    14 expForTarget   J
          241      44    13 toAdd   I
            0     370     0  this   Lext/mods/gameserver/handler/itemhandlers/ItemLevelDelevel;
            0     370     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     370     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     370     3 forceUse   Z
           17     353     4 player   Lext/mods/gameserver/model/actor/Player;
           39     331     5 manager   Lext/mods/gameserver/data/manager/ItemLevelDelevelManager;
           70     300     6 levelAdd   I
           81     289     7 levelRemove   I
           88     282     8 maxLevel   I
           98     272     9 currentLevel   I
          102     268    10 initialLevel   I
          112     258    11 initialExp   J
          304      66    13 newLevel   I
      StackMapTable: number_of_entries = 12
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/data/manager/ItemLevelDelevelManager ]
        frame_type = 255 /* full_frame */
          offset_delta = 70
          locals = [ class ext/mods/gameserver/handler/itemhandlers/ItemLevelDelevel, class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/model/item/instance/ItemInstance, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/data/manager/ItemLevelDelevelManager, int, int, int, int, int, long ]
          stack = []
        frame_type = 72 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 68
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 43
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ int ]
        frame_type = 38 /* same */
}
SourceFile: "ItemLevelDelevel.java"
