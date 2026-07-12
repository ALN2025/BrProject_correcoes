// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminLMEvent
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminLMEvent.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminLMEvent.class
  Last modified 9 de jul de 2026; size 2831 bytes
  MD5 checksum a8bbac321b0e98a9a93081216c5e3ce0
  Compiled from "AdminLMEvent.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminLMEvent implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #30                         // ext/mods/gameserver/handler/admincommandhandlers/AdminLMEvent
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 6, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_lm_add
    #8 = Utf8               admin_lm_add
    #9 = Methodref          #10.#11       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // equals:(Ljava/lang/Object;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               equals
   #14 = Utf8               (Ljava/lang/Object;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #16 = Class              #18           // ext/mods/gameserver/model/actor/Player
   #17 = NameAndType        #19:#20       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #18 = Utf8               ext/mods/gameserver/model/actor/Player
   #19 = Utf8               getTarget
   #20 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #21 = Methodref          #16.#22       // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #22 = NameAndType        #23:#24       // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #23 = Utf8               getSysString
   #24 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #25 = Methodref          #16.#26       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #26 = NameAndType        #27:#28       // sendMessage:(Ljava/lang/String;)V
   #27 = Utf8               sendMessage
   #28 = Utf8               (Ljava/lang/String;)V
   #29 = Methodref          #30.#31       // ext/mods/gameserver/handler/admincommandhandlers/AdminLMEvent.add:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #30 = Class              #32           // ext/mods/gameserver/handler/admincommandhandlers/AdminLMEvent
   #31 = NameAndType        #33:#34       // add:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #32 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminLMEvent
   #33 = Utf8               add
   #34 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #35 = String             #36           // admin_lm_remove
   #36 = Utf8               admin_lm_remove
   #37 = Methodref          #30.#38       // ext/mods/gameserver/handler/admincommandhandlers/AdminLMEvent.remove:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #38 = NameAndType        #39:#34       // remove:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #39 = Utf8               remove
   #40 = String             #41           // admin_lm_advance
   #41 = Utf8               admin_lm_advance
   #42 = Methodref          #43.#44       // ext/mods/gameserver/model/entity/events/lastman/LMManager.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
   #43 = Class              #45           // ext/mods/gameserver/model/entity/events/lastman/LMManager
   #44 = NameAndType        #46:#47       // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
   #45 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMManager
   #46 = Utf8               getInstance
   #47 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
   #48 = Methodref          #43.#49       // ext/mods/gameserver/model/entity/events/lastman/LMManager.skipDelay:()V
   #49 = NameAndType        #50:#6        // skipDelay:()V
   #50 = Utf8               skipDelay
   #51 = Fieldref           #30.#52       // ext/mods/gameserver/handler/admincommandhandlers/AdminLMEvent.ADMIN_COMMANDS:[Ljava/lang/String;
   #52 = NameAndType        #53:#54       // ADMIN_COMMANDS:[Ljava/lang/String;
   #53 = Utf8               ADMIN_COMMANDS
   #54 = Utf8               [Ljava/lang/String;
   #55 = Methodref          #56.#57       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #56 = Class              #58           // ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #57 = NameAndType        #46:#59       // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #58 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #59 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #60 = Methodref          #56.#61       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #61 = NameAndType        #62:#63       // isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #62 = Utf8               isPlayerParticipant
   #63 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #64 = Methodref          #56.#65       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #65 = NameAndType        #66:#63       // addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #66 = Utf8               addParticipant
   #67 = Methodref          #56.#68       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
   #68 = NameAndType        #69:#70       // isStarted:()Z
   #69 = Utf8               isStarted
   #70 = Utf8               ()Z
   #71 = Class              #72           // ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter
   #72 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter
   #73 = Methodref          #71.#74       // ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
   #74 = NameAndType        #5:#75        // "<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
   #75 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
   #76 = Methodref          #56.#77       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #77 = NameAndType        #78:#63       // removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #78 = Utf8               removeParticipant
   #79 = Fieldref           #80.#81       // ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
   #80 = Class              #82           // ext/mods/Config
   #81 = NameAndType        #83:#84       // LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
   #82 = Utf8               ext/mods/Config
   #83 = Utf8               LM_EVENT_PARTICIPATION_NPC_COORDINATES
   #84 = Utf8               [I
   #85 = Methodref          #71.#86       // ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
   #86 = NameAndType        #5:#87        // "<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
   #87 = Utf8               (Lext/mods/gameserver/model/actor/Player;[IZZ)V
   #88 = Class              #89           // ext/mods/gameserver/handler/IAdminCommandHandler
   #89 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
   #90 = Utf8               Code
   #91 = Utf8               LineNumberTable
   #92 = Utf8               LocalVariableTable
   #93 = Utf8               this
   #94 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminLMEvent;
   #95 = Utf8               useAdminCommand
   #96 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #97 = Utf8               plr
   #98 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #99 = Utf8               target
  #100 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #101 = Utf8               command
  #102 = Utf8               Ljava/lang/String;
  #103 = Utf8               player
  #104 = Utf8               StackMapTable
  #105 = Class              #106          // ext/mods/gameserver/model/WorldObject
  #106 = Utf8               ext/mods/gameserver/model/WorldObject
  #107 = Utf8               getAdminCommandList
  #108 = Utf8               ()[Ljava/lang/String;
  #109 = Utf8               activeChar
  #110 = Utf8               <clinit>
  #111 = Utf8               SourceFile
  #112 = Utf8               AdminLMEvent.java
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminLMEvent();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminLMEvent;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_lm_add
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          55
         9: aload_2
        10: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        13: astore_3
        14: aload_3
        15: instanceof    #16                 // class ext/mods/gameserver/model/actor/Player
        18: ifeq          30
        21: aload_3
        22: checkcast     #16                 // class ext/mods/gameserver/model/actor/Player
        25: astore        4
        27: goto          46
        30: aload_2
        31: aload_2
        32: sipush        10089
        35: iconst_0
        36: anewarray     #2                  // class java/lang/Object
        39: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        42: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        45: return
        46: aload_2
        47: aload         4
        49: invokestatic  #29                 // Method add:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
        52: goto          125
        55: aload_1
        56: ldc           #35                 // String admin_lm_remove
        58: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        61: ifeq          110
        64: aload_2
        65: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        68: astore_3
        69: aload_3
        70: instanceof    #16                 // class ext/mods/gameserver/model/actor/Player
        73: ifeq          85
        76: aload_3
        77: checkcast     #16                 // class ext/mods/gameserver/model/actor/Player
        80: astore        4
        82: goto          101
        85: aload_2
        86: aload_2
        87: sipush        10089
        90: iconst_0
        91: anewarray     #2                  // class java/lang/Object
        94: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        97: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       100: return
       101: aload_2
       102: aload         4
       104: invokestatic  #37                 // Method remove:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
       107: goto          125
       110: aload_1
       111: ldc           #40                 // String admin_lm_advance
       113: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       116: ifeq          125
       119: invokestatic  #42                 // Method ext/mods/gameserver/model/entity/events/lastman/LMManager.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
       122: invokevirtual #48                 // Method ext/mods/gameserver/model/entity/events/lastman/LMManager.skipDelay:()V
       125: return
      LineNumberTable:
        line 40: 0
        line 42: 9
        line 44: 14
        line 46: 30
        line 47: 45
        line 50: 46
        line 51: 52
        line 52: 55
        line 54: 64
        line 56: 69
        line 58: 85
        line 59: 100
        line 62: 101
        line 63: 107
        line 64: 110
        line 65: 119
        line 67: 125
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27       3     4   plr   Lext/mods/gameserver/model/actor/Player;
           14      38     3 target   Lext/mods/gameserver/model/WorldObject;
           46       6     4   plr   Lext/mods/gameserver/model/actor/Player;
           82       3     4   plr   Lext/mods/gameserver/model/actor/Player;
           69      38     3 target   Lext/mods/gameserver/model/WorldObject;
          101       6     4   plr   Lext/mods/gameserver/model/actor/Player;
            0     126     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminLMEvent;
            0     126     1 command   Ljava/lang/String;
            0     126     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 8
        frame_type = 14 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #51                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminLMEvent;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_3
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String admin_lm_add
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #35                 // String admin_lm_remove
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #40                 // String admin_lm_advance
        18: aastore
        19: putstatic     #51                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
        22: return
      LineNumberTable:
        line 30: 0
}
SourceFile: "AdminLMEvent.java"
