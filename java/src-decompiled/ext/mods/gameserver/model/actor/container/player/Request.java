// Bytecode for: ext.mods.gameserver.model.actor.container.player.Request
// File: ext\mods\gameserver\model\actor\container\player\Request.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/Request.class
  Last modified 9 de jul de 2026; size 3811 bytes
  MD5 checksum 730ce49de93e116236e80c5a733636a0
  Compiled from "Request.java"
public class ext.mods.gameserver.model.actor.container.player.Request
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/player/Request
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 10, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/container/player/Request._player:Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/container/player/Request
    #9 = NameAndType        #11:#12       // _player:Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/model/actor/container/player/Request
   #11 = Utf8               _player
   #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/container/player/Request._partner:Lext/mods/gameserver/model/actor/Player;
   #14 = NameAndType        #15:#12       // _partner:Lext/mods/gameserver/model/actor/Player;
   #15 = Utf8               _partner
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/model/actor/container/player/Request._requestPacket:Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
   #17 = NameAndType        #18:#19       // _requestPacket:Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
   #18 = Utf8               _requestPacket
   #19 = Utf8               Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
   #20 = Fieldref           #21.#22       // ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_INVITED_THE_WRONG_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #21 = Class              #23           // ext/mods/gameserver/network/SystemMessageId
   #22 = NameAndType        #24:#25       // YOU_HAVE_INVITED_THE_WRONG_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #23 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #24 = Utf8               YOU_HAVE_INVITED_THE_WRONG_TARGET
   #25 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #26 = Methodref          #27.#28       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #27 = Class              #29           // ext/mods/gameserver/model/actor/Player
   #28 = NameAndType        #30:#31       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #29 = Utf8               ext/mods/gameserver/model/actor/Player
   #30 = Utf8               sendPacket
   #31 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #32 = Methodref          #27.#33       // ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
   #33 = NameAndType        #34:#35       // getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
   #34 = Utf8               getRequest
   #35 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Request;
   #36 = Methodref          #8.#37        // ext/mods/gameserver/model/actor/container/player/Request.isProcessingRequest:()Z
   #37 = NameAndType        #38:#39       // isProcessingRequest:()Z
   #38 = Utf8               isProcessingRequest
   #39 = Utf8               ()Z
   #40 = Fieldref           #21.#41       // ext/mods/gameserver/network/SystemMessageId.S1_IS_BUSY_TRY_LATER:Lext/mods/gameserver/network/SystemMessageId;
   #41 = NameAndType        #42:#25       // S1_IS_BUSY_TRY_LATER:Lext/mods/gameserver/network/SystemMessageId;
   #42 = Utf8               S1_IS_BUSY_TRY_LATER
   #43 = Methodref          #44.#45       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #44 = Class              #46           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #45 = NameAndType        #47:#48       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #46 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #47 = Utf8               getSystemMessage
   #48 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #49 = Methodref          #44.#50       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #50 = NameAndType        #51:#52       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #51 = Utf8               addCharName
   #52 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #53 = Methodref          #27.#54       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #54 = NameAndType        #30:#55       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #55 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #56 = Fieldref           #21.#57       // ext/mods/gameserver/network/SystemMessageId.WAITING_FOR_ANOTHER_REPLY:Lext/mods/gameserver/network/SystemMessageId;
   #57 = NameAndType        #58:#25       // WAITING_FOR_ANOTHER_REPLY:Lext/mods/gameserver/network/SystemMessageId;
   #58 = Utf8               WAITING_FOR_ANOTHER_REPLY
   #59 = Methodref          #8.#60        // ext/mods/gameserver/model/actor/container/player/Request.clearRequestOnTimeout:()V
   #60 = NameAndType        #61:#6        // clearRequestOnTimeout:()V
   #61 = Utf8               clearRequestOnTimeout
   #62 = Methodref          #8.#63        // ext/mods/gameserver/model/actor/container/player/Request.setPartner:(Lext/mods/gameserver/model/actor/Player;)V
   #63 = NameAndType        #64:#65       // setPartner:(Lext/mods/gameserver/model/actor/Player;)V
   #64 = Utf8               setPartner
   #65 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #66 = Methodref          #8.#67        // ext/mods/gameserver/model/actor/container/player/Request.setRequestPacket:(Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;)V
   #67 = NameAndType        #68:#69       // setRequestPacket:(Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;)V
   #68 = Utf8               setRequestPacket
   #69 = Utf8               (Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;)V
   #70 = InvokeDynamic      #0:#71        // #0:run:(Lext/mods/gameserver/model/actor/container/player/Request;)Ljava/lang/Runnable;
   #71 = NameAndType        #72:#73       // run:(Lext/mods/gameserver/model/actor/container/player/Request;)Ljava/lang/Runnable;
   #72 = Utf8               run
   #73 = Utf8               (Lext/mods/gameserver/model/actor/container/player/Request;)Ljava/lang/Runnable;
   #74 = Long               15000l
   #76 = Methodref          #77.#78       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #77 = Class              #79           // ext/mods/commons/pool/ThreadPool
   #78 = NameAndType        #80:#81       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #79 = Utf8               ext/mods/commons/pool/ThreadPool
   #80 = Utf8               schedule
   #81 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #82 = Fieldref           #8.#83        // ext/mods/gameserver/model/actor/container/player/Request._requestTimer:Ljava/util/concurrent/ScheduledFuture;
   #83 = NameAndType        #84:#85       // _requestTimer:Ljava/util/concurrent/ScheduledFuture;
   #84 = Utf8               _requestTimer
   #85 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #86 = InterfaceMethodref #87.#88       // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
   #87 = Class              #89           // java/util/concurrent/ScheduledFuture
   #88 = NameAndType        #90:#91       // cancel:(Z)Z
   #89 = Utf8               java/util/concurrent/ScheduledFuture
   #90 = Utf8               cancel
   #91 = Utf8               (Z)Z
   #92 = Methodref          #8.#93        // ext/mods/gameserver/model/actor/container/player/Request.clear:()V
   #93 = NameAndType        #94:#6        // clear:()V
   #94 = Utf8               clear
   #95 = Utf8               REQUEST_TIMEOUT
   #96 = Utf8               I
   #97 = Utf8               ConstantValue
   #98 = Integer            15000
   #99 = Utf8               Signature
  #100 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #101 = Utf8               Code
  #102 = Utf8               LineNumberTable
  #103 = Utf8               LocalVariableTable
  #104 = Utf8               this
  #105 = Utf8               Lext/mods/gameserver/model/actor/container/player/Request;
  #106 = Utf8               player
  #107 = Utf8               getPartner
  #108 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #109 = Utf8               partner
  #110 = Utf8               getRequestPacket
  #111 = Utf8               ()Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
  #112 = Utf8               packet
  #113 = Utf8               setRequest
  #114 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;)Z
  #115 = Utf8               StackMapTable
  #116 = Utf8               onRequestResponse
  #117 = Utf8               SourceFile
  #118 = Utf8               Request.java
  #119 = Utf8               BootstrapMethods
  #120 = MethodType         #6            //  ()V
  #121 = MethodHandle       5:#92         // REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/Request.clear:()V
  #122 = MethodHandle       6:#123        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #123 = Methodref          #124.#125     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #124 = Class              #126          // java/lang/invoke/LambdaMetafactory
  #125 = NameAndType        #127:#128     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #126 = Utf8               java/lang/invoke/LambdaMetafactory
  #127 = Utf8               metafactory
  #128 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #129 = Utf8               InnerClasses
  #130 = Class              #131          // java/lang/invoke/MethodHandles$Lookup
  #131 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #132 = Class              #133          // java/lang/invoke/MethodHandles
  #133 = Utf8               java/lang/invoke/MethodHandles
  #134 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.container.player.Request(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
         9: return
      LineNumberTable:
        line 46: 0
        line 47: 4
        line 48: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/player/Request;
            0      10     1 player   Lext/mods/gameserver/model/actor/Player;

  public synchronized ext.mods.gameserver.model.actor.Player getPartner();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/Request;

  public synchronized ext.mods.gameserver.network.clientpackets.L2GameClientPacket getRequestPacket();
    descriptor: ()Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _requestPacket:Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
         4: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/Request;

  public synchronized boolean setRequest(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.network.clientpackets.L2GameClientPacket);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;)Z
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ifnonnull     16
         4: aload_0
         5: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
         8: getstatic     #20                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_INVITED_THE_WRONG_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        11: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        14: iconst_0
        15: ireturn
        16: aload_1
        17: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
        20: invokevirtual #36                 // Method isProcessingRequest:()Z
        23: ifeq          45
        26: aload_0
        27: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        30: getstatic     #40                 // Field ext/mods/gameserver/network/SystemMessageId.S1_IS_BUSY_TRY_LATER:Lext/mods/gameserver/network/SystemMessageId;
        33: invokestatic  #43                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        36: aload_1
        37: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        40: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        43: iconst_0
        44: ireturn
        45: aload_0
        46: invokevirtual #36                 // Method isProcessingRequest:()Z
        49: ifeq          64
        52: aload_0
        53: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        56: getstatic     #56                 // Field ext/mods/gameserver/network/SystemMessageId.WAITING_FOR_ANOTHER_REPLY:Lext/mods/gameserver/network/SystemMessageId;
        59: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        62: iconst_0
        63: ireturn
        64: aload_0
        65: aload_1
        66: putfield      #13                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
        69: aload_0
        70: aload_2
        71: putfield      #16                 // Field _requestPacket:Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
        74: aload_0
        75: invokevirtual #59                 // Method clearRequestOnTimeout:()V
        78: aload_0
        79: getfield      #13                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
        82: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
        85: aload_0
        86: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        89: invokevirtual #62                 // Method setPartner:(Lext/mods/gameserver/model/actor/Player;)V
        92: aload_0
        93: getfield      #13                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
        96: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
        99: aload_2
       100: invokevirtual #66                 // Method setRequestPacket:(Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;)V
       103: aload_0
       104: getfield      #13                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
       107: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
       110: invokevirtual #59                 // Method clearRequestOnTimeout:()V
       113: iconst_1
       114: ireturn
      LineNumberTable:
        line 98: 0
        line 100: 4
        line 101: 14
        line 104: 16
        line 106: 26
        line 107: 43
        line 110: 45
        line 112: 52
        line 113: 62
        line 116: 64
        line 117: 69
        line 118: 74
        line 120: 78
        line 121: 92
        line 122: 103
        line 123: 113
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     115     0  this   Lext/mods/gameserver/model/actor/container/player/Request;
            0     115     1 partner   Lext/mods/gameserver/model/actor/Player;
            0     115     2 packet   Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
      StackMapTable: number_of_entries = 3
        frame_type = 16 /* same */
        frame_type = 28 /* same */
        frame_type = 18 /* same */

  public void onRequestResponse();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #82                 // Field _requestTimer:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        23
         7: aload_0
         8: getfield      #82                 // Field _requestTimer:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_1
        12: invokeinterface #86,  2           // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #82                 // Field _requestTimer:Ljava/util/concurrent/ScheduledFuture;
        23: aload_0
        24: invokevirtual #92                 // Method clear:()V
        27: aload_0
        28: getfield      #13                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
        31: ifnull        44
        34: aload_0
        35: getfield      #13                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
        38: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
        41: invokevirtual #92                 // Method clear:()V
        44: return
      LineNumberTable:
        line 136: 0
        line 138: 7
        line 139: 18
        line 142: 23
        line 144: 27
        line 145: 34
        line 146: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/container/player/Request;
      StackMapTable: number_of_entries = 2
        frame_type = 23 /* same */
        frame_type = 20 /* same */

  public boolean isProcessingRequest();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _partner:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 153: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/container/player/Request;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "Request.java"
BootstrapMethods:
  0: #122 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #120 ()V
      #121 REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/Request.clear:()V
      #120 ()V
InnerClasses:
  public static final #134= #130 of #132; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
