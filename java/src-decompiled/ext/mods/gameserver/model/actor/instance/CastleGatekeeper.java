// Bytecode for: ext.mods.gameserver.model.actor.instance.CastleGatekeeper
// File: ext\mods\gameserver\model\actor\instance\CastleGatekeeper.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/CastleGatekeeper.class
  Last modified 9 de jul de 2026; size 4228 bytes
  MD5 checksum 5e7ee6e4d4839f49f0e27882a8fc9f92
  Compiled from "CastleGatekeeper.java"
public class ext.mods.gameserver.model.actor.instance.CastleGatekeeper extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/actor/instance/CastleGatekeeper
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 1, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = String             #8            // tele
    #8 = Utf8               tele
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/model/actor/instance/CastleGatekeeper._teleportTask:Ljava/util/concurrent/Future;
   #16 = Class              #18           // ext/mods/gameserver/model/actor/instance/CastleGatekeeper
   #17 = NameAndType        #19:#20       // _teleportTask:Ljava/util/concurrent/Future;
   #18 = Utf8               ext/mods/gameserver/model/actor/instance/CastleGatekeeper
   #19 = Utf8               _teleportTask
   #20 = Utf8               Ljava/util/concurrent/Future;
   #21 = InvokeDynamic      #0:#22        // #0:run:(Lext/mods/gameserver/model/actor/instance/CastleGatekeeper;)Ljava/lang/Runnable;
   #22 = NameAndType        #23:#24       // run:(Lext/mods/gameserver/model/actor/instance/CastleGatekeeper;)Ljava/lang/Runnable;
   #23 = Utf8               run
   #24 = Utf8               (Lext/mods/gameserver/model/actor/instance/CastleGatekeeper;)Ljava/lang/Runnable;
   #25 = Methodref          #16.#26       // ext/mods/gameserver/model/actor/instance/CastleGatekeeper.getTeleportDelay:()I
   #26 = NameAndType        #27:#28       // getTeleportDelay:()I
   #27 = Utf8               getTeleportDelay
   #28 = Utf8               ()I
   #29 = Long               1000l
   #31 = Methodref          #32.#33       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #32 = Class              #34           // ext/mods/commons/pool/ThreadPool
   #33 = NameAndType        #35:#36       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #34 = Utf8               ext/mods/commons/pool/ThreadPool
   #35 = Utf8               schedule
   #36 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #37 = Class              #38           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #38 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #39 = Methodref          #16.#40       // ext/mods/gameserver/model/actor/instance/CastleGatekeeper.getObjectId:()I
   #40 = NameAndType        #41:#28       // getObjectId:()I
   #41 = Utf8               getObjectId
   #42 = Methodref          #37.#43       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #43 = NameAndType        #5:#44        // "<init>":(I)V
   #44 = Utf8               (I)V
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #46 = Class              #48           // ext/mods/gameserver/model/actor/Player
   #47 = NameAndType        #49:#50       // getLocale:()Ljava/util/Locale;
   #48 = Utf8               ext/mods/gameserver/model/actor/Player
   #49 = Utf8               getLocale
   #50 = Utf8               ()Ljava/util/Locale;
   #51 = String             #52           // html/castleteleporter/MassGK-1.htm
   #52 = Utf8               html/castleteleporter/MassGK-1.htm
   #53 = Methodref          #37.#54       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #54 = NameAndType        #55:#56       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #55 = Utf8               setFile
   #56 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #57 = String             #58           // %delay%
   #58 = Utf8               %delay%
   #59 = Methodref          #37.#60       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
   #60 = NameAndType        #61:#62       // replace:(Ljava/lang/String;I)V
   #61 = Utf8               replace
   #62 = Utf8               (Ljava/lang/String;I)V
   #63 = Methodref          #46.#64       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #64 = NameAndType        #65:#66       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #65 = Utf8               sendPacket
   #66 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #67 = Methodref          #2.#68        // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #68 = NameAndType        #69:#70       // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #69 = Utf8               onBypassFeedback
   #70 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #71 = Methodref          #16.#72       // ext/mods/gameserver/model/actor/instance/CastleGatekeeper.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #72 = NameAndType        #73:#74       // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #73 = Utf8               getCastle
   #74 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
   #75 = Methodref          #76.#77       // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #76 = Class              #78           // ext/mods/gameserver/model/residence/castle/Castle
   #77 = NameAndType        #79:#80       // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #78 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #79 = Utf8               getSiege
   #80 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #81 = Methodref          #82.#83       // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #82 = Class              #84           // ext/mods/gameserver/model/residence/castle/Siege
   #83 = NameAndType        #85:#86       // isInProgress:()Z
   #84 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #85 = Utf8               isInProgress
   #86 = Utf8               ()Z
   #87 = Methodref          #76.#88       // ext/mods/gameserver/model/residence/castle/Castle.getAliveLifeTowerCount:()I
   #88 = NameAndType        #89:#28       // getAliveLifeTowerCount:()I
   #89 = Utf8               getAliveLifeTowerCount
   #90 = String             #91           // html/castleteleporter/MassGK-2.htm
   #91 = Utf8               html/castleteleporter/MassGK-2.htm
   #92 = String             #93           // html/castleteleporter/MassGK.htm
   #93 = Utf8               html/castleteleporter/MassGK.htm
   #94 = String             #95           // %objectId%
   #95 = Utf8               %objectId%
   #96 = Class              #97           // ext/mods/gameserver/network/serverpackets/NpcSay
   #97 = Utf8               ext/mods/gameserver/network/serverpackets/NpcSay
   #98 = Fieldref           #99.#100      // ext/mods/gameserver/enums/SayType.SHOUT:Lext/mods/gameserver/enums/SayType;
   #99 = Class              #101          // ext/mods/gameserver/enums/SayType
  #100 = NameAndType        #102:#103     // SHOUT:Lext/mods/gameserver/enums/SayType;
  #101 = Utf8               ext/mods/gameserver/enums/SayType
  #102 = Utf8               SHOUT
  #103 = Utf8               Lext/mods/gameserver/enums/SayType;
  #104 = Methodref          #76.#105      // ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
  #105 = NameAndType        #106:#107     // getName:()Ljava/lang/String;
  #106 = Utf8               getName
  #107 = Utf8               ()Ljava/lang/String;
  #108 = InvokeDynamic      #1:#109       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #109 = NameAndType        #110:#111     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #110 = Utf8               makeConcatWithConstants
  #111 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #112 = Methodref          #96.#113      // ext/mods/gameserver/network/serverpackets/NpcSay."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #113 = NameAndType        #5:#114       // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #114 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #115 = Methodref          #116.#117     // ext/mods/gameserver/model/World.broadcastToSameRegion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #116 = Class              #118          // ext/mods/gameserver/model/World
  #117 = NameAndType        #119:#120     // broadcastToSameRegion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #118 = Utf8               ext/mods/gameserver/model/World
  #119 = Utf8               broadcastToSameRegion
  #120 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #121 = Methodref          #76.#122      // ext/mods/gameserver/model/residence/castle/Castle.oustAllPlayers:()V
  #122 = NameAndType        #123:#124     // oustAllPlayers:()V
  #123 = Utf8               oustAllPlayers
  #124 = Utf8               ()V
  #125 = Utf8               Signature
  #126 = Utf8               Ljava/util/concurrent/Future<*>;
  #127 = Utf8               Code
  #128 = Utf8               LineNumberTable
  #129 = Utf8               LocalVariableTable
  #130 = Utf8               this
  #131 = Utf8               Lext/mods/gameserver/model/actor/instance/CastleGatekeeper;
  #132 = Utf8               objectId
  #133 = Utf8               I
  #134 = Utf8               template
  #135 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #136 = Utf8               html
  #137 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #138 = Utf8               player
  #139 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #140 = Utf8               command
  #141 = Utf8               Ljava/lang/String;
  #142 = Utf8               StackMapTable
  #143 = Utf8               showChatWindow
  #144 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #145 = Utf8               oustPlayers
  #146 = Utf8               SourceFile
  #147 = Utf8               CastleGatekeeper.java
  #148 = Utf8               BootstrapMethods
  #149 = MethodType         #124          //  ()V
  #150 = MethodHandle       5:#151        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/CastleGatekeeper.oustPlayers:()V
  #151 = Methodref          #16.#152      // ext/mods/gameserver/model/actor/instance/CastleGatekeeper.oustPlayers:()V
  #152 = NameAndType        #145:#124     // oustPlayers:()V
  #153 = String             #154          // The defenders of \u0001 castle have been teleported to the inner castle.
  #154 = Utf8               The defenders of \u0001 castle have been teleported to the inner castle.
  #155 = MethodHandle       6:#156        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #156 = Methodref          #157.#158     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #157 = Class              #159          // java/lang/invoke/LambdaMetafactory
  #158 = NameAndType        #160:#161     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #159 = Utf8               java/lang/invoke/LambdaMetafactory
  #160 = Utf8               metafactory
  #161 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #162 = MethodHandle       6:#163        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #163 = Methodref          #164.#165     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #164 = Class              #166          // java/lang/invoke/StringConcatFactory
  #165 = NameAndType        #110:#167     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #166 = Utf8               java/lang/invoke/StringConcatFactory
  #167 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #168 = Utf8               InnerClasses
  #169 = Class              #170          // java/lang/invoke/MethodHandles$Lookup
  #170 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #171 = Class              #172          // java/lang/invoke/MethodHandles
  #172 = Utf8               java/lang/invoke/MethodHandles
  #173 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.CastleGatekeeper(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 42: 0
        line 43: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/CastleGatekeeper;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=3
         0: aload_2
         1: ldc           #7                  // String tele
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          78
         9: aload_0
        10: getfield      #15                 // Field _teleportTask:Ljava/util/concurrent/Future;
        13: ifnonnull     38
        16: aload_0
        17: aload_0
        18: invokedynamic #21,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/instance/CastleGatekeeper;)Ljava/lang/Runnable;
        23: aload_0
        24: invokevirtual #25                 // Method getTeleportDelay:()I
        27: i2l
        28: ldc2_w        #29                 // long 1000l
        31: lmul
        32: invokestatic  #31                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        35: putfield      #15                 // Field _teleportTask:Ljava/util/concurrent/Future;
        38: new           #37                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        41: dup
        42: aload_0
        43: invokevirtual #39                 // Method getObjectId:()I
        46: invokespecial #42                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        49: astore_3
        50: aload_3
        51: aload_1
        52: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        55: ldc           #51                 // String html/castleteleporter/MassGK-1.htm
        57: invokevirtual #53                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        60: aload_3
        61: ldc           #57                 // String %delay%
        63: aload_0
        64: invokevirtual #25                 // Method getTeleportDelay:()I
        67: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        70: aload_1
        71: aload_3
        72: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        75: goto          84
        78: aload_0
        79: aload_1
        80: aload_2
        81: invokespecial #67                 // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        84: return
      LineNumberTable:
        line 48: 0
        line 50: 9
        line 51: 16
        line 53: 38
        line 54: 50
        line 55: 60
        line 56: 70
        line 57: 75
        line 59: 78
        line 60: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           50      25     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0      85     0  this   Lext/mods/gameserver/model/actor/instance/CastleGatekeeper;
            0      85     1 player   Lext/mods/gameserver/model/actor/Player;
            0      85     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 38 /* same */
        frame_type = 39 /* same */
        frame_type = 5 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: new           #37                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: aload_0
         5: invokevirtual #39                 // Method getObjectId:()I
         8: invokespecial #42                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        11: astore_2
        12: aload_0
        13: getfield      #15                 // Field _teleportTask:Ljava/util/concurrent/Future;
        16: ifnonnull     68
        19: aload_0
        20: invokevirtual #71                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        23: invokevirtual #75                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        26: invokevirtual #81                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        29: ifeq          55
        32: aload_0
        33: invokevirtual #71                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        36: invokevirtual #87                 // Method ext/mods/gameserver/model/residence/castle/Castle.getAliveLifeTowerCount:()I
        39: ifne          55
        42: aload_2
        43: aload_1
        44: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        47: ldc           #90                 // String html/castleteleporter/MassGK-2.htm
        49: invokevirtual #53                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        52: goto          88
        55: aload_2
        56: aload_1
        57: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        60: ldc           #92                 // String html/castleteleporter/MassGK.htm
        62: invokevirtual #53                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        65: goto          88
        68: aload_2
        69: aload_1
        70: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        73: ldc           #51                 // String html/castleteleporter/MassGK-1.htm
        75: invokevirtual #53                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        78: aload_2
        79: ldc           #57                 // String %delay%
        81: aload_0
        82: invokevirtual #25                 // Method getTeleportDelay:()I
        85: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        88: aload_2
        89: ldc           #94                 // String %objectId%
        91: aload_0
        92: invokevirtual #39                 // Method getObjectId:()I
        95: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        98: aload_1
        99: aload_2
       100: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       103: return
      LineNumberTable:
        line 65: 0
        line 67: 12
        line 69: 19
        line 70: 42
        line 72: 55
        line 76: 68
        line 77: 78
        line 79: 88
        line 80: 98
        line 81: 103
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     104     0  this   Lext/mods/gameserver/model/actor/instance/CastleGatekeeper;
            0     104     1 player   Lext/mods/gameserver/model/actor/Player;
           12      92     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 12 /* same */
        frame_type = 19 /* same */
}
SourceFile: "CastleGatekeeper.java"
BootstrapMethods:
  0: #155 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #149 ()V
      #150 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/CastleGatekeeper.oustPlayers:()V
      #149 ()V
  1: #162 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #153 The defenders of \u0001 castle have been teleported to the inner castle.
InnerClasses:
  public static final #173= #169 of #171; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
