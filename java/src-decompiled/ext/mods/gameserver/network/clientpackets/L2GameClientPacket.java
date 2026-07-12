// Bytecode for: ext.mods.gameserver.network.clientpackets.L2GameClientPacket
// File: ext\mods\gameserver\network\clientpackets\L2GameClientPacket.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/L2GameClientPacket.class
  Last modified 9 de jul de 2026; size 3300 bytes
  MD5 checksum 1f3d7161c4629901c0b060064d97b574
  Compiled from "L2GameClientPacket.java"
public abstract class ext.mods.gameserver.network.clientpackets.L2GameClientPacket extends ext.mods.commons.mmocore.ReceivablePacket<ext.mods.gameserver.network.GameClient>
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #36                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  super_class: #2                         // ext/mods/commons/mmocore/ReceivablePacket
  interfaces: 0, fields: 1, methods: 9, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/commons/mmocore/ReceivablePacket."<init>":()V
    #2 = Class              #4            // ext/mods/commons/mmocore/ReceivablePacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/commons/mmocore/ReceivablePacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.PACKET_HANDLER_DEBUG:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // PACKET_HANDLER_DEBUG:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               PACKET_HANDLER_DEBUG
   #12 = Utf8               Z
   #13 = Fieldref           #8.#14        // ext/mods/Config.CLIENT_PACKETS:Ljava/util/List;
   #14 = NameAndType        #15:#16       // CLIENT_PACKETS:Ljava/util/List;
   #15 = Utf8               CLIENT_PACKETS
   #16 = Utf8               Ljava/util/List;
   #17 = Methodref          #18.#19       // java/lang/Object.getClass:()Ljava/lang/Class;
   #18 = Class              #20           // java/lang/Object
   #19 = NameAndType        #21:#22       // getClass:()Ljava/lang/Class;
   #20 = Utf8               java/lang/Object
   #21 = Utf8               getClass
   #22 = Utf8               ()Ljava/lang/Class;
   #23 = Methodref          #24.#25       // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #24 = Class              #26           // java/lang/Class
   #25 = NameAndType        #27:#28       // getSimpleName:()Ljava/lang/String;
   #26 = Utf8               java/lang/Class
   #27 = Utf8               getSimpleName
   #28 = Utf8               ()Ljava/lang/String;
   #29 = InterfaceMethodref #30.#31       // java/util/List.contains:(Ljava/lang/Object;)Z
   #30 = Class              #32           // java/util/List
   #31 = NameAndType        #33:#34       // contains:(Ljava/lang/Object;)Z
   #32 = Utf8               java/util/List
   #33 = Utf8               contains
   #34 = Utf8               (Ljava/lang/Object;)Z
   #35 = Fieldref           #36.#37       // ext/mods/gameserver/network/clientpackets/L2GameClientPacket.LOGGER:Lext/mods/commons/logging/CLogger;
   #36 = Class              #38           // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #37 = NameAndType        #39:#40       // LOGGER:Lext/mods/commons/logging/CLogger;
   #38 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #39 = Utf8               LOGGER
   #40 = Utf8               Lext/mods/commons/logging/CLogger;
   #41 = Methodref          #36.#42       // ext/mods/gameserver/network/clientpackets/L2GameClientPacket.getType:()Ljava/lang/String;
   #42 = NameAndType        #43:#28       // getType:()Ljava/lang/String;
   #43 = Utf8               getType
   #44 = Methodref          #45.#46       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #45 = Class              #47           // ext/mods/commons/logging/CLogger
   #46 = NameAndType        #48:#49       // info:(Ljava/lang/Object;)V
   #47 = Utf8               ext/mods/commons/logging/CLogger
   #48 = Utf8               info
   #49 = Utf8               (Ljava/lang/Object;)V
   #50 = Methodref          #36.#51       // ext/mods/gameserver/network/clientpackets/L2GameClientPacket.readImpl:()V
   #51 = NameAndType        #52:#6        // readImpl:()V
   #52 = Utf8               readImpl
   #53 = Class              #54           // java/lang/Exception
   #54 = Utf8               java/lang/Exception
   #55 = Class              #56           // java/nio/BufferUnderflowException
   #56 = Utf8               java/nio/BufferUnderflowException
   #57 = Methodref          #36.#58       // ext/mods/gameserver/network/clientpackets/L2GameClientPacket.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #58 = NameAndType        #59:#60       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #59 = Utf8               getClient
   #60 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #61 = Class              #62           // ext/mods/gameserver/network/GameClient
   #62 = Utf8               ext/mods/gameserver/network/GameClient
   #63 = Methodref          #61.#64       // ext/mods/gameserver/network/GameClient.onBufferUnderflow:()V
   #64 = NameAndType        #65:#6        // onBufferUnderflow:()V
   #65 = Utf8               onBufferUnderflow
   #66 = String             #67           // Failed reading {} for {}.
   #67 = Utf8               Failed reading {} for {}.
   #68 = Methodref          #61.#69       // ext/mods/gameserver/network/GameClient.toString:()Ljava/lang/String;
   #69 = NameAndType        #70:#28       // toString:()Ljava/lang/String;
   #70 = Utf8               toString
   #71 = Methodref          #45.#72       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #72 = NameAndType        #73:#74       // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #73 = Utf8               error
   #74 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #75 = Methodref          #36.#76       // ext/mods/gameserver/network/clientpackets/L2GameClientPacket.runImpl:()V
   #76 = NameAndType        #77:#6        // runImpl:()V
   #77 = Utf8               runImpl
   #78 = Methodref          #36.#79       // ext/mods/gameserver/network/clientpackets/L2GameClientPacket.triggersOnActionRequest:()Z
   #79 = NameAndType        #80:#81       // triggersOnActionRequest:()Z
   #80 = Utf8               triggersOnActionRequest
   #81 = Utf8               ()Z
   #82 = Methodref          #61.#83       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #83 = NameAndType        #84:#85       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #84 = Utf8               getPlayer
   #85 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #86 = Methodref          #87.#88       // ext/mods/gameserver/model/actor/Player.isSpawnProtected:()Z
   #87 = Class              #89           // ext/mods/gameserver/model/actor/Player
   #88 = NameAndType        #90:#81       // isSpawnProtected:()Z
   #89 = Utf8               ext/mods/gameserver/model/actor/Player
   #90 = Utf8               isSpawnProtected
   #91 = Methodref          #87.#92       // ext/mods/gameserver/model/actor/Player.onActionRequest:()V
   #92 = NameAndType        #93:#6        // onActionRequest:()V
   #93 = Utf8               onActionRequest
   #94 = Class              #95           // ext/mods/gameserver/network/clientpackets/EnterWorld
   #95 = Utf8               ext/mods/gameserver/network/clientpackets/EnterWorld
   #96 = Methodref          #61.#97       // ext/mods/gameserver/network/GameClient.closeNow:()V
   #97 = NameAndType        #98:#6        // closeNow:()V
   #98 = Utf8               closeNow
   #99 = Methodref          #61.#100      // ext/mods/gameserver/network/GameClient.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #100 = NameAndType        #101:#102     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #101 = Utf8               sendPacket
  #102 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #103 = Methodref          #87.#104      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #104 = NameAndType        #105:#28      // getName:()Ljava/lang/String;
  #105 = Utf8               getName
  #106 = InvokeDynamic      #0:#107       // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #107 = NameAndType        #108:#109     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #108 = Utf8               makeConcatWithConstants
  #109 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #110 = InvokeDynamic      #1:#111       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #111 = NameAndType        #108:#112     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #112 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #113 = Methodref          #24.#104      // java/lang/Class.getName:()Ljava/lang/String;
  #114 = Methodref          #45.#115      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #115 = NameAndType        #5:#116       // "<init>":(Ljava/lang/String;)V
  #116 = Utf8               (Ljava/lang/String;)V
  #117 = Utf8               Code
  #118 = Utf8               LineNumberTable
  #119 = Utf8               LocalVariableTable
  #120 = Utf8               this
  #121 = Utf8               Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
  #122 = Utf8               read
  #123 = Utf8               e
  #124 = Utf8               Ljava/lang/Exception;
  #125 = Utf8               StackMapTable
  #126 = Utf8               run
  #127 = Utf8               player
  #128 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #129 = Utf8               gsp
  #130 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #131 = Utf8               <clinit>
  #132 = Utf8               Signature
  #133 = Utf8               Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;
  #134 = Utf8               SourceFile
  #135 = Utf8               L2GameClientPacket.java
  #136 = Utf8               BootstrapMethods
  #137 = String             #138          // [\u0001] [C] \u0001
  #138 = Utf8               [\u0001] [C] \u0001
  #139 = String             #140          // [C] \u0001
  #140 = Utf8               [C] \u0001
  #141 = MethodHandle       6:#142        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #142 = Methodref          #143.#144     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #143 = Class              #145          // java/lang/invoke/StringConcatFactory
  #144 = NameAndType        #108:#146     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #145 = Utf8               java/lang/invoke/StringConcatFactory
  #146 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #147 = Utf8               InnerClasses
  #148 = Class              #149          // java/lang/invoke/MethodHandles$Lookup
  #149 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #150 = Class              #151          // java/lang/invoke/MethodHandles
  #151 = Utf8               java/lang/invoke/MethodHandles
  #152 = Utf8               Lookup
{
  protected static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  public ext.mods.gameserver.network.clientpackets.L2GameClientPacket();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/commons/mmocore/ReceivablePacket."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;

  protected abstract void readImpl();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void runImpl();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected boolean read();
    descriptor: ()Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=2, args_size=1
         0: getstatic     #7                  // Field ext/mods/Config.PACKET_HANDLER_DEBUG:Z
         3: ifeq          34
         6: getstatic     #13                 // Field ext/mods/Config.CLIENT_PACKETS:Ljava/util/List;
         9: aload_0
        10: invokevirtual #17                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        13: invokevirtual #23                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
        16: invokeinterface #29,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        21: ifne          34
        24: getstatic     #35                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        27: aload_0
        28: invokevirtual #41                 // Method getType:()Ljava/lang/String;
        31: invokevirtual #44                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        34: aload_0
        35: invokevirtual #50                 // Method readImpl:()V
        38: iconst_1
        39: ireturn
        40: astore_1
        41: aload_1
        42: instanceof    #55                 // class java/nio/BufferUnderflowException
        45: ifeq          60
        48: aload_0
        49: invokevirtual #57                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        52: checkcast     #61                 // class ext/mods/gameserver/network/GameClient
        55: invokevirtual #63                 // Method ext/mods/gameserver/network/GameClient.onBufferUnderflow:()V
        58: iconst_0
        59: ireturn
        60: getstatic     #35                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        63: ldc           #66                 // String Failed reading {} for {}.
        65: aload_1
        66: iconst_2
        67: anewarray     #18                 // class java/lang/Object
        70: dup
        71: iconst_0
        72: aload_0
        73: invokevirtual #41                 // Method getType:()Ljava/lang/String;
        76: aastore
        77: dup
        78: iconst_1
        79: aload_0
        80: invokevirtual #57                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        83: checkcast     #61                 // class ext/mods/gameserver/network/GameClient
        86: invokevirtual #68                 // Method ext/mods/gameserver/network/GameClient.toString:()Ljava/lang/String;
        89: aastore
        90: invokevirtual #71                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        93: iconst_0
        94: ireturn
      Exception table:
         from    to  target type
            34    39    40   Class java/lang/Exception
      LineNumberTable:
        line 44: 0
        line 45: 24
        line 49: 34
        line 50: 38
        line 52: 40
        line 54: 41
        line 56: 48
        line 57: 58
        line 59: 60
        line 61: 93
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      52     1     e   Ljava/lang/Exception;
            0      95     0  this   Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
      StackMapTable: number_of_entries = 3
        frame_type = 34 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/lang/Exception ]

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #75                 // Method runImpl:()V
         4: aload_0
         5: invokevirtual #78                 // Method triggersOnActionRequest:()Z
         8: ifeq          37
        11: aload_0
        12: invokevirtual #57                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        15: checkcast     #61                 // class ext/mods/gameserver/network/GameClient
        18: invokevirtual #82                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        21: astore_1
        22: aload_1
        23: ifnull        37
        26: aload_1
        27: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.isSpawnProtected:()Z
        30: ifeq          37
        33: aload_1
        34: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.onActionRequest:()V
        37: goto          91
        40: astore_1
        41: getstatic     #35                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        44: ldc           #66                 // String Failed reading {} for {}.
        46: aload_1
        47: iconst_2
        48: anewarray     #18                 // class java/lang/Object
        51: dup
        52: iconst_0
        53: aload_0
        54: invokevirtual #41                 // Method getType:()Ljava/lang/String;
        57: aastore
        58: dup
        59: iconst_1
        60: aload_0
        61: invokevirtual #57                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        64: checkcast     #61                 // class ext/mods/gameserver/network/GameClient
        67: invokevirtual #68                 // Method ext/mods/gameserver/network/GameClient.toString:()Ljava/lang/String;
        70: aastore
        71: invokevirtual #71                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        74: aload_0
        75: instanceof    #94                 // class ext/mods/gameserver/network/clientpackets/EnterWorld
        78: ifeq          91
        81: aload_0
        82: invokevirtual #57                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        85: checkcast     #61                 // class ext/mods/gameserver/network/GameClient
        88: invokevirtual #96                 // Method ext/mods/gameserver/network/GameClient.closeNow:()V
        91: return
      Exception table:
         from    to  target type
             0    37    40   Class java/lang/Exception
      LineNumberTable:
        line 69: 0
        line 71: 4
        line 73: 11
        line 74: 22
        line 75: 33
        line 84: 37
        line 78: 40
        line 80: 41
        line 82: 74
        line 83: 81
        line 85: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22      15     1 player   Lext/mods/gameserver/model/actor/Player;
           41      50     1     e   Ljava/lang/Exception;
            0      92     0  this   Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
      StackMapTable: number_of_entries = 3
        frame_type = 37 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 50 /* same */

  protected final void sendPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #57                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #61                 // class ext/mods/gameserver/network/GameClient
         7: aload_1
         8: invokevirtual #99                 // Method ext/mods/gameserver/network/GameClient.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        11: return
      LineNumberTable:
        line 89: 0
        line 90: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
            0      12     1   gsp   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;

  public java.lang.String getType();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #57                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #61                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #82                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: ifnull        39
        13: aload_0
        14: invokevirtual #57                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        17: checkcast     #61                 // class ext/mods/gameserver/network/GameClient
        20: invokevirtual #82                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        23: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        26: aload_0
        27: invokevirtual #17                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        30: invokevirtual #23                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
        33: invokedynamic #106,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        38: areturn
        39: aload_0
        40: invokevirtual #17                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        43: invokevirtual #23                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
        46: invokedynamic #110,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        51: areturn
      LineNumberTable:
        line 97: 0
        line 98: 13
        line 100: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
      StackMapTable: number_of_entries = 1
        frame_type = 39 /* same */

  protected boolean triggersOnActionRequest();
    descriptor: ()Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 109: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #45                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #36                 // class ext/mods/gameserver/network/clientpackets/L2GameClientPacket
         6: invokevirtual #113                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #114                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #35                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 35: 0
}
Signature: #133                         // Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;
SourceFile: "L2GameClientPacket.java"
BootstrapMethods:
  0: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #137 [\u0001] [C] \u0001
  1: #141 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #139 [C] \u0001
InnerClasses:
  public static final #152= #148 of #150; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
