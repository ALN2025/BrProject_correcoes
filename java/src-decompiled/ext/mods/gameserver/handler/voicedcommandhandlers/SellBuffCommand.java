// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.SellBuffCommand
// File: ext\mods\gameserver\handler\voicedcommandhandlers\SellBuffCommand.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/SellBuffCommand.class
  Last modified 9 de jul de 2026; size 1662 bytes
  MD5 checksum dbc1df275e75af4a59d67c0a61bc732f
  Compiled from "SellBuffCommand.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.SellBuffCommand implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #48                         // ext/mods/gameserver/handler/voicedcommandhandlers/SellBuffCommand
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/Config.SELLBUFF_ENABLED:Z
   #8 = Class              #10            // ext/mods/Config
   #9 = NameAndType        #11:#12        // SELLBUFF_ENABLED:Z
  #10 = Utf8               ext/mods/Config
  #11 = Utf8               SELLBUFF_ENABLED
  #12 = Utf8               Z
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #14 = Class              #16            // ext/mods/gameserver/model/actor/Player
  #15 = NameAndType        #17:#18        // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #16 = Utf8               ext/mods/gameserver/model/actor/Player
  #17 = Utf8               getSysString
  #18 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #19 = Methodref          #14.#20        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #20 = NameAndType        #21:#22        // sendMessage:(Ljava/lang/String;)V
  #21 = Utf8               sendMessage
  #22 = Utf8               (Ljava/lang/String;)V
  #23 = Methodref          #24.#25        // java/lang/String.hashCode:()I
  #24 = Class              #26            // java/lang/String
  #25 = NameAndType        #27:#28        // hashCode:()I
  #26 = Utf8               java/lang/String
  #27 = Utf8               hashCode
  #28 = Utf8               ()I
  #29 = String             #30            // sellbuff
  #30 = Utf8               sellbuff
  #31 = Methodref          #24.#32        // java/lang/String.equals:(Ljava/lang/Object;)Z
  #32 = NameAndType        #33:#34        // equals:(Ljava/lang/Object;)Z
  #33 = Utf8               equals
  #34 = Utf8               (Ljava/lang/Object;)Z
  #35 = String             #36            // sellbuffs
  #36 = Utf8               sellbuffs
  #37 = Methodref          #38.#39        // ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
  #38 = Class              #40            // ext/mods/gameserver/data/manager/SellBuffsManager
  #39 = NameAndType        #41:#42        // getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
  #40 = Utf8               ext/mods/gameserver/data/manager/SellBuffsManager
  #41 = Utf8               getInstance
  #42 = Utf8               ()Lext/mods/gameserver/data/manager/SellBuffsManager;
  #43 = Methodref          #38.#44        // ext/mods/gameserver/data/manager/SellBuffsManager.sendSellMenu:(Lext/mods/gameserver/model/actor/Player;)V
  #44 = NameAndType        #45:#46        // sendSellMenu:(Lext/mods/gameserver/model/actor/Player;)V
  #45 = Utf8               sendSellMenu
  #46 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #47 = Fieldref           #48.#49        // ext/mods/gameserver/handler/voicedcommandhandlers/SellBuffCommand.VOICED_COMMANDS:[Ljava/lang/String;
  #48 = Class              #50            // ext/mods/gameserver/handler/voicedcommandhandlers/SellBuffCommand
  #49 = NameAndType        #51:#52        // VOICED_COMMANDS:[Ljava/lang/String;
  #50 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/SellBuffCommand
  #51 = Utf8               VOICED_COMMANDS
  #52 = Utf8               [Ljava/lang/String;
  #53 = Class              #54            // ext/mods/gameserver/handler/IVoicedCommandHandler
  #54 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #55 = Utf8               Code
  #56 = Utf8               LineNumberTable
  #57 = Utf8               LocalVariableTable
  #58 = Utf8               this
  #59 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/SellBuffCommand;
  #60 = Utf8               useVoicedCommand
  #61 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #62 = Utf8               command
  #63 = Utf8               Ljava/lang/String;
  #64 = Utf8               player
  #65 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #66 = Utf8               target
  #67 = Utf8               StackMapTable
  #68 = Utf8               getVoicedCommandList
  #69 = Utf8               ()[Ljava/lang/String;
  #70 = Utf8               <clinit>
  #71 = Utf8               SourceFile
  #72 = Utf8               SellBuffCommand.java
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.SellBuffCommand();
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
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/SellBuffCommand;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: getstatic     #7                  // Field ext/mods/Config.SELLBUFF_ENABLED:Z
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
        24: astore        4
        26: iconst_m1
        27: istore        5
        29: aload         4
        31: invokevirtual #23                 // Method java/lang/String.hashCode:()I
        34: lookupswitch  { // 2

             -1516458386: 76

              1198007973: 60
                 default: 89
            }
        60: aload         4
        62: ldc           #29                 // String sellbuff
        64: invokevirtual #31                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        67: ifeq          89
        70: iconst_0
        71: istore        5
        73: goto          89
        76: aload         4
        78: ldc           #35                 // String sellbuffs
        80: invokevirtual #31                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        83: ifeq          89
        86: iconst_1
        87: istore        5
        89: iload         5
        91: lookupswitch  { // 2

                       0: 116

                       1: 116
                 default: 123
            }
       116: invokestatic  #37                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       119: aload_2
       120: invokevirtual #43                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendSellMenu:(Lext/mods/gameserver/model/actor/Player;)V
       123: iconst_1
       124: ireturn
      LineNumberTable:
        line 36: 0
        line 38: 6
        line 39: 21
        line 42: 23
        line 46: 116
        line 49: 123
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     125     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/SellBuffCommand;
            0     125     1 command   Ljava/lang/String;
            0     125     2 player   Lext/mods/gameserver/model/actor/Player;
            0     125     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 6
        frame_type = 23 /* same */
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 249 /* chop */
          offset_delta = 6

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #47                 // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/SellBuffCommand;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #24                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #29                 // String sellbuff
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #35                 // String sellbuffs
        13: aastore
        14: putstatic     #47                 // Field VOICED_COMMANDS:[Ljava/lang/String;
        17: return
      LineNumberTable:
        line 27: 0
}
SourceFile: "SellBuffCommand.java"
