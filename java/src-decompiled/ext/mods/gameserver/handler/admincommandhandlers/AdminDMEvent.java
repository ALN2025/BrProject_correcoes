// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminDMEvent
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminDMEvent.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminDMEvent.class
  Last modified 9 de jul de 2026; size 2912 bytes
  MD5 checksum e32164f7c97391b0e217795c3f24fb79
  Compiled from "AdminDMEvent.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminDMEvent implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #30                         // ext/mods/gameserver/handler/admincommandhandlers/AdminDMEvent
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 6, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_dm_add
    #8 = Utf8               admin_dm_add
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
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
   #29 = Methodref          #30.#31       // ext/mods/gameserver/handler/admincommandhandlers/AdminDMEvent.add:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #30 = Class              #32           // ext/mods/gameserver/handler/admincommandhandlers/AdminDMEvent
   #31 = NameAndType        #33:#34       // add:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #32 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminDMEvent
   #33 = Utf8               add
   #34 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #35 = String             #36           // admin_dm_remove
   #36 = Utf8               admin_dm_remove
   #37 = Methodref          #30.#38       // ext/mods/gameserver/handler/admincommandhandlers/AdminDMEvent.remove:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #38 = NameAndType        #39:#34       // remove:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #39 = Utf8               remove
   #40 = String             #41           // admin_dm_advance
   #41 = Utf8               admin_dm_advance
   #42 = Methodref          #43.#44       // ext/mods/gameserver/model/entity/events/deathmatch/DMManager.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
   #43 = Class              #45           // ext/mods/gameserver/model/entity/events/deathmatch/DMManager
   #44 = NameAndType        #46:#47       // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
   #45 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMManager
   #46 = Utf8               getInstance
   #47 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
   #48 = Methodref          #43.#49       // ext/mods/gameserver/model/entity/events/deathmatch/DMManager.skipDelay:()V
   #49 = NameAndType        #50:#6        // skipDelay:()V
   #50 = Utf8               skipDelay
   #51 = Fieldref           #30.#52       // ext/mods/gameserver/handler/admincommandhandlers/AdminDMEvent.ADMIN_COMMANDS:[Ljava/lang/String;
   #52 = NameAndType        #53:#54       // ADMIN_COMMANDS:[Ljava/lang/String;
   #53 = Utf8               ADMIN_COMMANDS
   #54 = Utf8               [Ljava/lang/String;
   #55 = Methodref          #56.#57       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #56 = Class              #58           // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #57 = NameAndType        #46:#59       // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #58 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #59 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #60 = Methodref          #16.#61       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #61 = NameAndType        #62:#63       // getObjectId:()I
   #62 = Utf8               getObjectId
   #63 = Utf8               ()I
   #64 = Methodref          #56.#65       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
   #65 = NameAndType        #66:#67       // isPlayerParticipant:(I)Z
   #66 = Utf8               isPlayerParticipant
   #67 = Utf8               (I)Z
   #68 = Methodref          #56.#69       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #69 = NameAndType        #70:#71       // addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #70 = Utf8               addParticipant
   #71 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #72 = Methodref          #56.#73       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
   #73 = NameAndType        #74:#75       // isStarted:()Z
   #74 = Utf8               isStarted
   #75 = Utf8               ()Z
   #76 = Class              #77           // ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter
   #77 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter
   #78 = Methodref          #76.#79       // ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
   #79 = NameAndType        #5:#80        // "<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
   #80 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
   #81 = Methodref          #56.#82       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #82 = NameAndType        #83:#71       // removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #83 = Utf8               removeParticipant
   #84 = Fieldref           #85.#86       // ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
   #85 = Class              #87           // ext/mods/Config
   #86 = NameAndType        #88:#89       // DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
   #87 = Utf8               ext/mods/Config
   #88 = Utf8               DM_EVENT_PARTICIPATION_NPC_COORDINATES
   #89 = Utf8               [I
   #90 = Methodref          #76.#91       // ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
   #91 = NameAndType        #5:#92        // "<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
   #92 = Utf8               (Lext/mods/gameserver/model/actor/Player;[IZZ)V
   #93 = Class              #94           // ext/mods/gameserver/handler/IAdminCommandHandler
   #94 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
   #95 = Utf8               Code
   #96 = Utf8               LineNumberTable
   #97 = Utf8               LocalVariableTable
   #98 = Utf8               this
   #99 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminDMEvent;
  #100 = Utf8               useAdminCommand
  #101 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #102 = Utf8               plr
  #103 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #104 = Utf8               target
  #105 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #106 = Utf8               command
  #107 = Utf8               Ljava/lang/String;
  #108 = Utf8               player
  #109 = Utf8               StackMapTable
  #110 = Class              #111          // ext/mods/gameserver/model/WorldObject
  #111 = Utf8               ext/mods/gameserver/model/WorldObject
  #112 = Utf8               getAdminCommandList
  #113 = Utf8               ()[Ljava/lang/String;
  #114 = Utf8               activeChar
  #115 = Utf8               <clinit>
  #116 = Utf8               SourceFile
  #117 = Utf8               AdminDMEvent.java
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminDMEvent();
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
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminDMEvent;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_dm_add
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          56
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
        46: aload_0
        47: aload_2
        48: aload         4
        50: invokevirtual #29                 // Method add:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
        53: goto          127
        56: aload_1
        57: ldc           #35                 // String admin_dm_remove
        59: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        62: ifeq          112
        65: aload_2
        66: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        69: astore_3
        70: aload_3
        71: instanceof    #16                 // class ext/mods/gameserver/model/actor/Player
        74: ifeq          86
        77: aload_3
        78: checkcast     #16                 // class ext/mods/gameserver/model/actor/Player
        81: astore        4
        83: goto          102
        86: aload_2
        87: aload_2
        88: sipush        10089
        91: iconst_0
        92: anewarray     #2                  // class java/lang/Object
        95: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        98: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       101: return
       102: aload_0
       103: aload_2
       104: aload         4
       106: invokevirtual #37                 // Method remove:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
       109: goto          127
       112: aload_1
       113: ldc           #40                 // String admin_dm_advance
       115: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       118: ifeq          127
       121: invokestatic  #42                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMManager.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
       124: invokevirtual #48                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMManager.skipDelay:()V
       127: return
      LineNumberTable:
        line 40: 0
        line 42: 9
        line 44: 14
        line 46: 30
        line 47: 45
        line 50: 46
        line 51: 53
        line 52: 56
        line 54: 65
        line 56: 70
        line 58: 86
        line 59: 101
        line 62: 102
        line 63: 109
        line 64: 112
        line 65: 121
        line 67: 127
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27       3     4   plr   Lext/mods/gameserver/model/actor/Player;
           14      39     3 target   Lext/mods/gameserver/model/WorldObject;
           46       7     4   plr   Lext/mods/gameserver/model/actor/Player;
           83       3     4   plr   Lext/mods/gameserver/model/actor/Player;
           70      39     3 target   Lext/mods/gameserver/model/WorldObject;
          102       7     4   plr   Lext/mods/gameserver/model/actor/Player;
            0     128     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminDMEvent;
            0     128     1 command   Ljava/lang/String;
            0     128     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 9
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
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminDMEvent;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_3
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String admin_dm_add
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #35                 // String admin_dm_remove
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #40                 // String admin_dm_advance
        18: aastore
        19: putstatic     #51                 // Field ADMIN_COMMANDS:[Ljava/lang/String;
        22: return
      LineNumberTable:
        line 30: 0
}
SourceFile: "AdminDMEvent.java"
