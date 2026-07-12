// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.Banking
// File: ext\mods\gameserver\handler\voicedcommandhandlers\Banking.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/Banking.class
  Last modified 9 de jul de 2026; size 2519 bytes
  MD5 checksum 9a8bfa4d4683c65a3f1708fd07853f67
  Compiled from "Banking.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.Banking implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #89                         // ext/mods/gameserver/handler/voicedcommandhandlers/Banking
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.ENABLE_COMMAND_GOLDBAR:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // ENABLE_COMMAND_GOLDBAR:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               ENABLE_COMMAND_GOLDBAR
   #12 = Utf8               Z
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Player
   #15 = NameAndType        #17:#18       // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #16 = Utf8               ext/mods/gameserver/model/actor/Player
   #17 = Utf8               getSysString
   #18 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #19 = Methodref          #14.#20       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #20 = NameAndType        #21:#22       // sendMessage:(Ljava/lang/String;)V
   #21 = Utf8               sendMessage
   #22 = Utf8               (Ljava/lang/String;)V
   #23 = String             #24           // bank
   #24 = Utf8               bank
   #25 = Methodref          #26.#27       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #26 = Class              #28           // java/lang/String
   #27 = NameAndType        #29:#30       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #28 = Utf8               java/lang/String
   #29 = Utf8               equalsIgnoreCase
   #30 = Utf8               (Ljava/lang/String;)Z
   #31 = Fieldref           #8.#32        // ext/mods/Config.BANKING_SYSTEM_ADENA:I
   #32 = NameAndType        #33:#34       // BANKING_SYSTEM_ADENA:I
   #33 = Utf8               BANKING_SYSTEM_ADENA
   #34 = Utf8               I
   #35 = Methodref          #36.#37       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #36 = Class              #38           // java/lang/Integer
   #37 = NameAndType        #39:#40       // valueOf:(I)Ljava/lang/Integer;
   #38 = Utf8               java/lang/Integer
   #39 = Utf8               valueOf
   #40 = Utf8               (I)Ljava/lang/Integer;
   #41 = Fieldref           #8.#42        // ext/mods/Config.BANKING_SYSTEM_GOLDBARS:I
   #42 = NameAndType        #43:#34       // BANKING_SYSTEM_GOLDBARS:I
   #43 = Utf8               BANKING_SYSTEM_GOLDBARS
   #44 = String             #45           // deposit
   #45 = Utf8               deposit
   #46 = Methodref          #14.#47       // ext/mods/gameserver/model/actor/Player.getAdena:()I
   #47 = NameAndType        #48:#49       // getAdena:()I
   #48 = Utf8               getAdena
   #49 = Utf8               ()I
   #50 = Methodref          #14.#51       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #51 = NameAndType        #52:#53       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #52 = Utf8               getInventory
   #53 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #54 = Methodref          #55.#56       // ext/mods/gameserver/model/itemcontainer/PcInventory.reduceAdena:(I)Z
   #55 = Class              #57           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #56 = NameAndType        #58:#59       // reduceAdena:(I)Z
   #57 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #58 = Utf8               reduceAdena
   #59 = Utf8               (I)Z
   #60 = Methodref          #55.#61       // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #61 = NameAndType        #62:#63       // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #62 = Utf8               addItem
   #63 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #64 = Class              #65           // ext/mods/gameserver/network/serverpackets/ItemList
   #65 = Utf8               ext/mods/gameserver/network/serverpackets/ItemList
   #66 = Methodref          #64.#67       // ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
   #67 = NameAndType        #5:#68        // "<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
   #68 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
   #69 = Methodref          #14.#70       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #70 = NameAndType        #71:#72       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #71 = Utf8               sendPacket
   #72 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #73 = String             #74           // withdraw
   #74 = Utf8               withdraw
   #75 = Long               2147483647l
   #77 = Methodref          #55.#78       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(II)I
   #78 = NameAndType        #79:#80       // getItemCount:(II)I
   #79 = Utf8               getItemCount
   #80 = Utf8               (II)I
   #81 = Methodref          #55.#82       // ext/mods/gameserver/model/itemcontainer/PcInventory.destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #82 = NameAndType        #83:#63       // destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #83 = Utf8               destroyItemByItemId
   #84 = Methodref          #55.#85       // ext/mods/gameserver/model/itemcontainer/PcInventory.addAdena:(I)V
   #85 = NameAndType        #86:#87       // addAdena:(I)V
   #86 = Utf8               addAdena
   #87 = Utf8               (I)V
   #88 = Fieldref           #89.#90       // ext/mods/gameserver/handler/voicedcommandhandlers/Banking.VOICED_COMMANDS:[Ljava/lang/String;
   #89 = Class              #91           // ext/mods/gameserver/handler/voicedcommandhandlers/Banking
   #90 = NameAndType        #92:#93       // VOICED_COMMANDS:[Ljava/lang/String;
   #91 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/Banking
   #92 = Utf8               VOICED_COMMANDS
   #93 = Utf8               [Ljava/lang/String;
   #94 = Class              #95           // ext/mods/gameserver/handler/IVoicedCommandHandler
   #95 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
   #96 = Utf8               Code
   #97 = Utf8               LineNumberTable
   #98 = Utf8               LocalVariableTable
   #99 = Utf8               this
  #100 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/Banking;
  #101 = Utf8               useVoicedCommand
  #102 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #103 = Utf8               a
  #104 = Utf8               J
  #105 = Utf8               b
  #106 = Utf8               command
  #107 = Utf8               Ljava/lang/String;
  #108 = Utf8               player
  #109 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #110 = Utf8               target
  #111 = Utf8               StackMapTable
  #112 = Utf8               getVoicedCommandList
  #113 = Utf8               ()[Ljava/lang/String;
  #114 = Utf8               <clinit>
  #115 = Utf8               SourceFile
  #116 = Utf8               Banking.java
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.Banking();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Banking;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=8, args_size=4
         0: getstatic     #7                  // Field ext/mods/Config.ENABLE_COMMAND_GOLDBAR:Z
         3: ifne          23
         6: aload_2
         7: aload_2
         8: sipush        10200
        11: iconst_0
        12: anewarray     #2                  // class java/lang/Object
        15: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        18: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        21: iconst_0
        22: ireturn
        23: aload_1
        24: ldc           #23                 // String bank
        26: invokevirtual #25                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        29: ifeq          86
        32: aload_2
        33: aload_2
        34: sipush        10194
        37: iconst_4
        38: anewarray     #2                  // class java/lang/Object
        41: dup
        42: iconst_0
        43: getstatic     #31                 // Field ext/mods/Config.BANKING_SYSTEM_ADENA:I
        46: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        49: aastore
        50: dup
        51: iconst_1
        52: getstatic     #41                 // Field ext/mods/Config.BANKING_SYSTEM_GOLDBARS:I
        55: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        58: aastore
        59: dup
        60: iconst_2
        61: getstatic     #41                 // Field ext/mods/Config.BANKING_SYSTEM_GOLDBARS:I
        64: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        67: aastore
        68: dup
        69: iconst_3
        70: getstatic     #31                 // Field ext/mods/Config.BANKING_SYSTEM_ADENA:I
        73: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        76: aastore
        77: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        80: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        83: goto          371
        86: aload_1
        87: ldc           #44                 // String deposit
        89: invokevirtual #25                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        92: ifeq          206
        95: aload_2
        96: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.getAdena:()I
        99: getstatic     #31                 // Field ext/mods/Config.BANKING_SYSTEM_ADENA:I
       102: if_icmplt     179
       105: aload_2
       106: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       109: getstatic     #31                 // Field ext/mods/Config.BANKING_SYSTEM_ADENA:I
       112: invokevirtual #54                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.reduceAdena:(I)Z
       115: pop
       116: aload_2
       117: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       120: sipush        3470
       123: getstatic     #41                 // Field ext/mods/Config.BANKING_SYSTEM_GOLDBARS:I
       126: invokevirtual #60                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       129: pop
       130: aload_2
       131: new           #64                 // class ext/mods/gameserver/network/serverpackets/ItemList
       134: dup
       135: aload_2
       136: iconst_1
       137: invokespecial #66                 // Method ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
       140: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       143: aload_2
       144: aload_2
       145: sipush        10195
       148: iconst_2
       149: anewarray     #2                  // class java/lang/Object
       152: dup
       153: iconst_0
       154: getstatic     #41                 // Field ext/mods/Config.BANKING_SYSTEM_GOLDBARS:I
       157: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       160: aastore
       161: dup
       162: iconst_1
       163: getstatic     #31                 // Field ext/mods/Config.BANKING_SYSTEM_ADENA:I
       166: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       169: aastore
       170: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       173: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       176: goto          371
       179: aload_2
       180: aload_2
       181: sipush        10196
       184: iconst_1
       185: anewarray     #2                  // class java/lang/Object
       188: dup
       189: iconst_0
       190: getstatic     #31                 // Field ext/mods/Config.BANKING_SYSTEM_ADENA:I
       193: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       196: aastore
       197: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       200: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       203: goto          371
       206: aload_1
       207: ldc           #73                 // String withdraw
       209: invokevirtual #25                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       212: ifeq          371
       215: aload_2
       216: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.getAdena:()I
       219: i2l
       220: lstore        4
       222: getstatic     #31                 // Field ext/mods/Config.BANKING_SYSTEM_ADENA:I
       225: i2l
       226: lstore        6
       228: lload         4
       230: lload         6
       232: ladd
       233: ldc2_w        #75                 // long 2147483647l
       236: lcmp
       237: ifle          257
       240: aload_2
       241: aload_2
       242: sipush        10197
       245: iconst_0
       246: anewarray     #2                  // class java/lang/Object
       249: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       252: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       255: iconst_0
       256: ireturn
       257: aload_2
       258: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       261: sipush        3470
       264: iconst_0
       265: invokevirtual #77                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(II)I
       268: getstatic     #41                 // Field ext/mods/Config.BANKING_SYSTEM_GOLDBARS:I
       271: if_icmplt     347
       274: aload_2
       275: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       278: sipush        3470
       281: getstatic     #41                 // Field ext/mods/Config.BANKING_SYSTEM_GOLDBARS:I
       284: invokevirtual #81                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       287: pop
       288: aload_2
       289: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       292: getstatic     #31                 // Field ext/mods/Config.BANKING_SYSTEM_ADENA:I
       295: invokevirtual #84                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addAdena:(I)V
       298: aload_2
       299: new           #64                 // class ext/mods/gameserver/network/serverpackets/ItemList
       302: dup
       303: aload_2
       304: iconst_1
       305: invokespecial #66                 // Method ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
       308: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       311: aload_2
       312: aload_2
       313: sipush        10198
       316: iconst_2
       317: anewarray     #2                  // class java/lang/Object
       320: dup
       321: iconst_0
       322: getstatic     #31                 // Field ext/mods/Config.BANKING_SYSTEM_ADENA:I
       325: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       328: aastore
       329: dup
       330: iconst_1
       331: getstatic     #41                 // Field ext/mods/Config.BANKING_SYSTEM_GOLDBARS:I
       334: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       337: aastore
       338: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       341: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       344: goto          371
       347: aload_2
       348: aload_2
       349: sipush        10199
       352: iconst_1
       353: anewarray     #2                  // class java/lang/Object
       356: dup
       357: iconst_0
       358: getstatic     #31                 // Field ext/mods/Config.BANKING_SYSTEM_ADENA:I
       361: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       364: aastore
       365: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       368: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       371: iconst_1
       372: ireturn
      LineNumberTable:
        line 37: 0
        line 39: 6
        line 40: 21
        line 43: 23
        line 44: 32
        line 45: 86
        line 47: 95
        line 49: 105
        line 50: 116
        line 51: 130
        line 52: 143
        line 55: 179
        line 57: 206
        line 59: 215
        line 60: 222
        line 62: 228
        line 64: 240
        line 65: 255
        line 68: 257
        line 70: 274
        line 71: 288
        line 72: 298
        line 73: 311
        line 76: 347
        line 79: 371
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          222     149     4     a   J
          228     143     6     b   J
            0     373     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Banking;
            0     373     1 command   Ljava/lang/String;
            0     373     2 player   Lext/mods/gameserver/model/actor/Player;
            0     373     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 7
        frame_type = 23 /* same */
        frame_type = 62 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 92
        frame_type = 26 /* same */
        frame_type = 253 /* append */
          offset_delta = 50
          locals = [ long, long ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 89
        frame_type = 249 /* chop */
          offset_delta = 23

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #88                 // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 85: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Banking;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_3
         1: anewarray     #26                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #23                 // String bank
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #73                 // String withdraw
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #44                 // String deposit
        18: aastore
        19: putstatic     #88                 // Field VOICED_COMMANDS:[Ljava/lang/String;
        22: return
      LineNumberTable:
        line 27: 0
}
SourceFile: "Banking.java"
