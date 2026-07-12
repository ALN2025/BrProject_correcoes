// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.Autofarm
// File: ext\mods\gameserver\handler\voicedcommandhandlers\Autofarm.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/Autofarm.class
  Last modified 9 de jul de 2026; size 1460 bytes
  MD5 checksum 8c9c23923616dc5f28839441f0bb1173
  Compiled from "Autofarm.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.Autofarm implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #34                         // ext/mods/gameserver/handler/voicedcommandhandlers/Autofarm
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/Config.AUTOFARM_ENABLED:Z
   #8 = Class              #10            // ext/mods/Config
   #9 = NameAndType        #11:#12        // AUTOFARM_ENABLED:Z
  #10 = Utf8               ext/mods/Config
  #11 = Utf8               AUTOFARM_ENABLED
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
  #23 = Methodref          #24.#25        // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #24 = Class              #26            // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #25 = NameAndType        #27:#28        // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #26 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #27 = Utf8               getInstance
  #28 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #29 = Methodref          #24.#30        // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showIndexWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #30 = NameAndType        #31:#32        // showIndexWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #31 = Utf8               showIndexWindow
  #32 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #33 = Fieldref           #34.#35        // ext/mods/gameserver/handler/voicedcommandhandlers/Autofarm.VOICED_COMMANDS:[Ljava/lang/String;
  #34 = Class              #36            // ext/mods/gameserver/handler/voicedcommandhandlers/Autofarm
  #35 = NameAndType        #37:#38        // VOICED_COMMANDS:[Ljava/lang/String;
  #36 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/Autofarm
  #37 = Utf8               VOICED_COMMANDS
  #38 = Utf8               [Ljava/lang/String;
  #39 = Class              #40            // java/lang/String
  #40 = Utf8               java/lang/String
  #41 = String             #42            // autofarm
  #42 = Utf8               autofarm
  #43 = Class              #44            // ext/mods/gameserver/handler/IVoicedCommandHandler
  #44 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #45 = Utf8               Code
  #46 = Utf8               LineNumberTable
  #47 = Utf8               LocalVariableTable
  #48 = Utf8               this
  #49 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/Autofarm;
  #50 = Utf8               useVoicedCommand
  #51 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #52 = Utf8               command
  #53 = Utf8               Ljava/lang/String;
  #54 = Utf8               player
  #55 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #56 = Utf8               target
  #57 = Utf8               StackMapTable
  #58 = Utf8               getVoicedCommandList
  #59 = Utf8               ()[Ljava/lang/String;
  #60 = Utf8               <clinit>
  #61 = Utf8               SourceFile
  #62 = Utf8               Autofarm.java
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.Autofarm();
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
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Autofarm;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: getstatic     #7                  // Field ext/mods/Config.AUTOFARM_ENABLED:Z
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
        23: invokestatic  #23                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
        26: aload_2
        27: invokevirtual #29                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showIndexWindow:(Lext/mods/gameserver/model/actor/Player;)V
        30: iconst_1
        31: ireturn
      LineNumberTable:
        line 35: 0
        line 37: 6
        line 38: 21
        line 41: 23
        line 43: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Autofarm;
            0      32     1 command   Ljava/lang/String;
            0      32     2 player   Lext/mods/gameserver/model/actor/Player;
            0      32     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #33                 // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Autofarm;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #39                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #41                 // String autofarm
         8: aastore
         9: putstatic     #33                 // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 27: 0
}
SourceFile: "Autofarm.java"
