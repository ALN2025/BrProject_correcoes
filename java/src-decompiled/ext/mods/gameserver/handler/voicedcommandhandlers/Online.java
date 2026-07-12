// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.Online
// File: ext\mods\gameserver\handler\voicedcommandhandlers\Online.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/Online.class
  Last modified 9 de jul de 2026; size 1619 bytes
  MD5 checksum eb41e124d6440490a7af613b3199d5d5
  Compiled from "Online.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.Online implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #58                         // ext/mods/gameserver/handler/voicedcommandhandlers/Online
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // online
   #8 = Utf8               online
   #9 = Methodref          #10.#11        // java/lang/String.equals:(Ljava/lang/Object;)Z
  #10 = Class              #12            // java/lang/String
  #11 = NameAndType        #13:#14        // equals:(Ljava/lang/Object;)Z
  #12 = Utf8               java/lang/String
  #13 = Utf8               equals
  #14 = Utf8               (Ljava/lang/Object;)Z
  #15 = Fieldref           #16.#17        // ext/mods/Config.ENABLE_ONLINE_COMMAND:Z
  #16 = Class              #18            // ext/mods/Config
  #17 = NameAndType        #19:#20        // ENABLE_ONLINE_COMMAND:Z
  #18 = Utf8               ext/mods/Config
  #19 = Utf8               ENABLE_ONLINE_COMMAND
  #20 = Utf8               Z
  #21 = Methodref          #22.#23        // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #22 = Class              #24            // ext/mods/gameserver/model/World
  #23 = NameAndType        #25:#26        // getInstance:()Lext/mods/gameserver/model/World;
  #24 = Utf8               ext/mods/gameserver/model/World
  #25 = Utf8               getInstance
  #26 = Utf8               ()Lext/mods/gameserver/model/World;
  #27 = Methodref          #22.#28        // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #28 = NameAndType        #29:#30        // getPlayers:()Ljava/util/Collection;
  #29 = Utf8               getPlayers
  #30 = Utf8               ()Ljava/util/Collection;
  #31 = InterfaceMethodref #32.#33        // java/util/Collection.size:()I
  #32 = Class              #34            // java/util/Collection
  #33 = NameAndType        #35:#36        // size:()I
  #34 = Utf8               java/util/Collection
  #35 = Utf8               size
  #36 = Utf8               ()I
  #37 = Fieldref           #16.#38        // ext/mods/Config.MULTIPLIER_ONLINE_COMMAND:I
  #38 = NameAndType        #39:#40        // MULTIPLIER_ONLINE_COMMAND:I
  #39 = Utf8               MULTIPLIER_ONLINE_COMMAND
  #40 = Utf8               I
  #41 = Methodref          #42.#43        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #42 = Class              #44            // java/lang/Integer
  #43 = NameAndType        #45:#46        // valueOf:(I)Ljava/lang/Integer;
  #44 = Utf8               java/lang/Integer
  #45 = Utf8               valueOf
  #46 = Utf8               (I)Ljava/lang/Integer;
  #47 = Methodref          #48.#49        // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #48 = Class              #50            // ext/mods/gameserver/model/actor/Player
  #49 = NameAndType        #51:#52        // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #50 = Utf8               ext/mods/gameserver/model/actor/Player
  #51 = Utf8               getSysString
  #52 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #53 = Methodref          #48.#54        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #54 = NameAndType        #55:#56        // sendMessage:(Ljava/lang/String;)V
  #55 = Utf8               sendMessage
  #56 = Utf8               (Ljava/lang/String;)V
  #57 = Fieldref           #58.#59        // ext/mods/gameserver/handler/voicedcommandhandlers/Online.VOICED_COMMANDS:[Ljava/lang/String;
  #58 = Class              #60            // ext/mods/gameserver/handler/voicedcommandhandlers/Online
  #59 = NameAndType        #61:#62        // VOICED_COMMANDS:[Ljava/lang/String;
  #60 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/Online
  #61 = Utf8               VOICED_COMMANDS
  #62 = Utf8               [Ljava/lang/String;
  #63 = Class              #64            // ext/mods/gameserver/handler/IVoicedCommandHandler
  #64 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #65 = Utf8               Code
  #66 = Utf8               LineNumberTable
  #67 = Utf8               LocalVariableTable
  #68 = Utf8               this
  #69 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/Online;
  #70 = Utf8               useVoicedCommand
  #71 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #72 = Utf8               command
  #73 = Utf8               Ljava/lang/String;
  #74 = Utf8               player
  #75 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #76 = Utf8               target
  #77 = Utf8               StackMapTable
  #78 = Utf8               getVoicedCommandList
  #79 = Utf8               ()[Ljava/lang/String;
  #80 = Utf8               <clinit>
  #81 = Utf8               SourceFile
  #82 = Utf8               Online.java
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.Online();
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
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Online;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=4, args_size=4
         0: aload_1
         1: ldc           #7                  // String online
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          54
         9: getstatic     #15                 // Field ext/mods/Config.ENABLE_ONLINE_COMMAND:Z
        12: ifeq          54
        15: aload_2
        16: aload_2
        17: sipush        10088
        20: iconst_1
        21: anewarray     #2                  // class java/lang/Object
        24: dup
        25: iconst_0
        26: invokestatic  #21                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        29: invokevirtual #27                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
        32: invokeinterface #31,  1           // InterfaceMethod java/util/Collection.size:()I
        37: getstatic     #37                 // Field ext/mods/Config.MULTIPLIER_ONLINE_COMMAND:I
        40: imul
        41: invokestatic  #41                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        44: aastore
        45: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        48: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        51: goto          69
        54: aload_2
        55: aload_2
        56: sipush        10200
        59: iconst_0
        60: anewarray     #2                  // class java/lang/Object
        63: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        66: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        69: iconst_1
        70: ireturn
      LineNumberTable:
        line 35: 0
        line 36: 15
        line 38: 54
        line 40: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Online;
            0      71     1 command   Ljava/lang/String;
            0      71     2 player   Lext/mods/gameserver/model/actor/Player;
            0      71     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 54 /* same */
        frame_type = 14 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #57                 // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Online;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String online
         8: aastore
         9: putstatic     #57                 // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 27: 0
}
SourceFile: "Online.java"
