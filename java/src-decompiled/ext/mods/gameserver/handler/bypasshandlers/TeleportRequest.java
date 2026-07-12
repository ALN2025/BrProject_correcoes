// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.TeleportRequest
// File: ext\mods\gameserver\handler\bypasshandlers\TeleportRequest.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/TeleportRequest.class
  Last modified 9 de jul de 2026; size 1383 bytes
  MD5 checksum e69d8e44315ae6cbcecd385bf954ec31
  Compiled from "TeleportRequest.java"
public class ext.mods.gameserver.handler.bypasshandlers.TeleportRequest implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #20                         // ext/mods/gameserver/handler/bypasshandlers/TeleportRequest
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/Npc
   #8 = Utf8               ext/mods/gameserver/model/actor/Npc
   #9 = Fieldref           #10.#11        // ext/mods/gameserver/enums/TeleportType.STANDARD:Lext/mods/gameserver/enums/TeleportType;
  #10 = Class              #12            // ext/mods/gameserver/enums/TeleportType
  #11 = NameAndType        #13:#14        // STANDARD:Lext/mods/gameserver/enums/TeleportType;
  #12 = Utf8               ext/mods/gameserver/enums/TeleportType
  #13 = Utf8               STANDARD
  #14 = Utf8               Lext/mods/gameserver/enums/TeleportType;
  #15 = Methodref          #7.#16         // ext/mods/gameserver/model/actor/Npc.showTeleportWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
  #16 = NameAndType        #17:#18        // showTeleportWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
  #17 = Utf8               showTeleportWindow
  #18 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/handler/bypasshandlers/TeleportRequest.COMMANDS:[Ljava/lang/String;
  #20 = Class              #22            // ext/mods/gameserver/handler/bypasshandlers/TeleportRequest
  #21 = NameAndType        #23:#24        // COMMANDS:[Ljava/lang/String;
  #22 = Utf8               ext/mods/gameserver/handler/bypasshandlers/TeleportRequest
  #23 = Utf8               COMMANDS
  #24 = Utf8               [Ljava/lang/String;
  #25 = Class              #26            // java/lang/String
  #26 = Utf8               java/lang/String
  #27 = String             #28            // teleport_request
  #28 = Utf8               teleport_request
  #29 = Class              #30            // ext/mods/gameserver/handler/IBypassHandler
  #30 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #31 = Utf8               Code
  #32 = Utf8               LineNumberTable
  #33 = Utf8               LocalVariableTable
  #34 = Utf8               this
  #35 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/TeleportRequest;
  #36 = Utf8               useBypass
  #37 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #38 = Utf8               npc
  #39 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #40 = Utf8               command
  #41 = Utf8               Ljava/lang/String;
  #42 = Utf8               player
  #43 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #44 = Utf8               target
  #45 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #46 = Utf8               StackMapTable
  #47 = Utf8               getBypassList
  #48 = Utf8               ()[Ljava/lang/String;
  #49 = Utf8               <clinit>
  #50 = Utf8               SourceFile
  #51 = Utf8               TeleportRequest.java
{
  public ext.mods.gameserver.handler.bypasshandlers.TeleportRequest();
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
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/TeleportRequest;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: aload_3
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Npc
         4: ifeq          22
         7: aload_3
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Npc
        11: astore        4
        13: aload         4
        15: aload_2
        16: getstatic     #9                  // Field ext/mods/gameserver/enums/TeleportType.STANDARD:Lext/mods/gameserver/enums/TeleportType;
        19: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Npc.showTeleportWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
        22: iconst_1
        23: ireturn
      LineNumberTable:
        line 33: 0
        line 34: 13
        line 36: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       9     4   npc   Lext/mods/gameserver/model/actor/Npc;
            0      24     0  this   Lext/mods/gameserver/handler/bypasshandlers/TeleportRequest;
            0      24     1 command   Ljava/lang/String;
            0      24     2 player   Lext/mods/gameserver/model/actor/Player;
            0      24     3 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 22 /* same */

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #19                 // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/TeleportRequest;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #25                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #27                 // String teleport_request
         8: aastore
         9: putstatic     #19                 // Field COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "TeleportRequest.java"
