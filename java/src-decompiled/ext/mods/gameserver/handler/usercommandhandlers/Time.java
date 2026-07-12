// Bytecode for: ext.mods.gameserver.handler.usercommandhandlers.Time
// File: ext\mods\gameserver\handler\usercommandhandlers\Time.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/usercommandhandlers/Time.class
  Last modified 9 de jul de 2026; size 2408 bytes
  MD5 checksum d13119c3ae08f7ffa5a5b18fbe7203f9
  Compiled from "Time.java"
public class ext.mods.gameserver.handler.usercommandhandlers.Time implements ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #62                         // ext/mods/gameserver/handler/usercommandhandlers/Time
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
    #8 = Class              #10           // ext/mods/gameserver/taskmanager/GameTimeTaskManager
    #9 = NameAndType        #11:#12       // getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #10 = Utf8               ext/mods/gameserver/taskmanager/GameTimeTaskManager
   #11 = Utf8               getInstance
   #12 = Utf8               ()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #13 = Methodref          #8.#14        // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getGameHour:()I
   #14 = NameAndType        #15:#16       // getGameHour:()I
   #15 = Utf8               getGameHour
   #16 = Utf8               ()I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getGameMinute:()I
   #18 = NameAndType        #19:#16       // getGameMinute:()I
   #19 = Utf8               getGameMinute
   #20 = String             #21           // 0
   #21 = Utf8               0
   #22 = String             #23           //
   #23 = Utf8
   #24 = InvokeDynamic      #0:#25        // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #25 = NameAndType        #26:#27       // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #26 = Utf8               makeConcatWithConstants
   #27 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #28 = Methodref          #8.#29        // ext/mods/gameserver/taskmanager/GameTimeTaskManager.isNight:()Z
   #29 = NameAndType        #30:#31       // isNight:()Z
   #30 = Utf8               isNight
   #31 = Utf8               ()Z
   #32 = Fieldref           #33.#34       // ext/mods/gameserver/network/SystemMessageId.TIME_S1_S2_IN_THE_NIGHT:Lext/mods/gameserver/network/SystemMessageId;
   #33 = Class              #35           // ext/mods/gameserver/network/SystemMessageId
   #34 = NameAndType        #36:#37       // TIME_S1_S2_IN_THE_NIGHT:Lext/mods/gameserver/network/SystemMessageId;
   #35 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #36 = Utf8               TIME_S1_S2_IN_THE_NIGHT
   #37 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #38 = Fieldref           #33.#39       // ext/mods/gameserver/network/SystemMessageId.TIME_S1_S2_IN_THE_DAY:Lext/mods/gameserver/network/SystemMessageId;
   #39 = NameAndType        #40:#37       // TIME_S1_S2_IN_THE_DAY:Lext/mods/gameserver/network/SystemMessageId;
   #40 = Utf8               TIME_S1_S2_IN_THE_DAY
   #41 = Methodref          #42.#43       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #42 = Class              #44           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #43 = NameAndType        #45:#46       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #44 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #45 = Utf8               getSystemMessage
   #46 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #47 = Methodref          #42.#48       // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #48 = NameAndType        #49:#50       // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #49 = Utf8               addNumber
   #50 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #51 = Methodref          #42.#52       // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #52 = NameAndType        #53:#54       // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #53 = Utf8               addString
   #54 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #55 = Methodref          #56.#57       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #56 = Class              #58           // ext/mods/gameserver/model/actor/Player
   #57 = NameAndType        #59:#60       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #58 = Utf8               ext/mods/gameserver/model/actor/Player
   #59 = Utf8               sendPacket
   #60 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #61 = Fieldref           #62.#63       // ext/mods/gameserver/handler/usercommandhandlers/Time.COMMAND_IDS:[I
   #62 = Class              #64           // ext/mods/gameserver/handler/usercommandhandlers/Time
   #63 = NameAndType        #65:#66       // COMMAND_IDS:[I
   #64 = Utf8               ext/mods/gameserver/handler/usercommandhandlers/Time
   #65 = Utf8               COMMAND_IDS
   #66 = Utf8               [I
   #67 = Class              #68           // ext/mods/gameserver/handler/IUserCommandHandler
   #68 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
   #69 = Utf8               Code
   #70 = Utf8               LineNumberTable
   #71 = Utf8               LocalVariableTable
   #72 = Utf8               this
   #73 = Utf8               Lext/mods/gameserver/handler/usercommandhandlers/Time;
   #74 = Utf8               useUserCommand
   #75 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
   #76 = Utf8               id
   #77 = Utf8               I
   #78 = Utf8               player
   #79 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #80 = Utf8               hour
   #81 = Utf8               minute
   #82 = Utf8               min
   #83 = Utf8               Ljava/lang/String;
   #84 = Utf8               StackMapTable
   #85 = Class              #86           // java/lang/String
   #86 = Utf8               java/lang/String
   #87 = Utf8               getUserCommandList
   #88 = Utf8               ()[I
   #89 = Utf8               <clinit>
   #90 = Utf8               SourceFile
   #91 = Utf8               Time.java
   #92 = Utf8               BootstrapMethods
   #93 = String             #94           // \u0001\u0001
   #94 = Utf8               \u0001\u0001
   #95 = MethodHandle       6:#96         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #96 = Methodref          #97.#98       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #97 = Class              #99           // java/lang/invoke/StringConcatFactory
   #98 = NameAndType        #26:#100      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #99 = Utf8               java/lang/invoke/StringConcatFactory
  #100 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #101 = Utf8               InnerClasses
  #102 = Class              #103          // java/lang/invoke/MethodHandles$Lookup
  #103 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #104 = Class              #105          // java/lang/invoke/MethodHandles
  #105 = Utf8               java/lang/invoke/MethodHandles
  #106 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.usercommandhandlers.Time();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/usercommandhandlers/Time;

  public void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=3
         0: invokestatic  #7                  // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
         3: invokevirtual #13                 // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getGameHour:()I
         6: istore_3
         7: invokestatic  #7                  // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
        10: invokevirtual #17                 // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getGameMinute:()I
        13: istore        4
        15: iload         4
        17: bipush        10
        19: if_icmpge     27
        22: ldc           #20                 // String 0
        24: goto          29
        27: ldc           #22                 // String
        29: iload         4
        31: invokedynamic #24,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        36: astore        5
        38: aload_2
        39: invokestatic  #7                  // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
        42: invokevirtual #28                 // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.isNight:()Z
        45: ifeq          54
        48: getstatic     #32                 // Field ext/mods/gameserver/network/SystemMessageId.TIME_S1_S2_IN_THE_NIGHT:Lext/mods/gameserver/network/SystemMessageId;
        51: goto          57
        54: getstatic     #38                 // Field ext/mods/gameserver/network/SystemMessageId.TIME_S1_S2_IN_THE_DAY:Lext/mods/gameserver/network/SystemMessageId;
        57: invokestatic  #41                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        60: iload_3
        61: invokevirtual #47                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        64: aload         5
        66: invokevirtual #51                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        69: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        72: return
      LineNumberTable:
        line 36: 0
        line 37: 7
        line 39: 15
        line 41: 38
        line 42: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      73     0  this   Lext/mods/gameserver/handler/usercommandhandlers/Time;
            0      73     1    id   I
            0      73     2 player   Lext/mods/gameserver/model/actor/Player;
            7      66     3  hour   I
           15      58     4 minute   I
           38      35     5   min   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 27
          locals = [ int, int ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/handler/usercommandhandlers/Time, int, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/usercommandhandlers/Time, int, class ext/mods/gameserver/model/actor/Player, int, int, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/SystemMessageId ]

  public int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #61                 // Field COMMAND_IDS:[I
         3: areturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/usercommandhandlers/Time;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: newarray       int
         3: dup
         4: iconst_0
         5: bipush        77
         7: iastore
         8: putstatic     #61                 // Field COMMAND_IDS:[I
        11: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "Time.java"
BootstrapMethods:
  0: #95 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #93 \u0001\u0001
InnerClasses:
  public static final #106= #102 of #104; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
