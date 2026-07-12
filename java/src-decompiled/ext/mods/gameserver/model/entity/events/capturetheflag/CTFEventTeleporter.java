// Bytecode for: ext.mods.gameserver.model.entity.events.capturetheflag.CTFEventTeleporter
// File: ext\mods\gameserver\model\entity\events\capturetheflag\CTFEventTeleporter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter.class
  Last modified 9 de jul de 2026; size 4244 bytes
  MD5 checksum adb0e9461c48e8bdf66701ce1bb096a8
  Compiled from "CTFEventTeleporter.java"
public class ext.mods.gameserver.model.entity.events.capturetheflag.CTFEventTeleporter implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 2, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter._player:Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter
    #9 = NameAndType        #11:#12       // _player:Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter
   #11 = Utf8               _player
   #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter._coordinates:[I
   #14 = NameAndType        #15:#16       // _coordinates:[I
   #15 = Utf8               _coordinates
   #16 = Utf8               [I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter._adminRemove:Z
   #18 = NameAndType        #19:#20       // _adminRemove:Z
   #19 = Utf8               _adminRemove
   #20 = Utf8               Z
   #21 = Methodref          #22.#23       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #22 = Class              #24           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #23 = NameAndType        #25:#26       // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #24 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #25 = Utf8               getInstance
   #26 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #27 = Methodref          #22.#28       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
   #28 = NameAndType        #29:#30       // isStarted:()Z
   #29 = Utf8               isStarted
   #30 = Utf8               ()Z
   #31 = Fieldref           #32.#33       // ext/mods/Config.CTF_EVENT_RESPAWN_TELEPORT_DELAY:I
   #32 = Class              #34           // ext/mods/Config
   #33 = NameAndType        #35:#36       // CTF_EVENT_RESPAWN_TELEPORT_DELAY:I
   #34 = Utf8               ext/mods/Config
   #35 = Utf8               CTF_EVENT_RESPAWN_TELEPORT_DELAY
   #36 = Utf8               I
   #37 = Fieldref           #32.#38       // ext/mods/Config.CTF_EVENT_START_LEAVE_TELEPORT_DELAY:I
   #38 = NameAndType        #39:#36       // CTF_EVENT_START_LEAVE_TELEPORT_DELAY:I
   #39 = Utf8               CTF_EVENT_START_LEAVE_TELEPORT_DELAY
   #40 = Methodref          #41.#42       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #41 = Class              #43           // ext/mods/commons/pool/ThreadPool
   #42 = NameAndType        #44:#45       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #43 = Utf8               ext/mods/commons/pool/ThreadPool
   #44 = Utf8               schedule
   #45 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #46 = Methodref          #47.#48       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #47 = Class              #49           // ext/mods/gameserver/model/actor/Player
   #48 = NameAndType        #50:#51       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #49 = Utf8               ext/mods/gameserver/model/actor/Player
   #50 = Utf8               getSummon
   #51 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #52 = Methodref          #53.#54       // ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
   #53 = Class              #55           // ext/mods/gameserver/model/actor/Summon
   #54 = NameAndType        #56:#57       // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
   #55 = Utf8               ext/mods/gameserver/model/actor/Summon
   #56 = Utf8               unSummon
   #57 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #58 = Fieldref           #32.#59       // ext/mods/Config.CTF_EVENT_EFFECTS_REMOVAL:I
   #59 = NameAndType        #60:#36       // CTF_EVENT_EFFECTS_REMOVAL:I
   #60 = Utf8               CTF_EVENT_EFFECTS_REMOVAL
   #61 = Methodref          #47.#62       // ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
   #62 = NameAndType        #63:#64       // getTeam:()Lext/mods/gameserver/enums/TeamType;
   #63 = Utf8               getTeam
   #64 = Utf8               ()Lext/mods/gameserver/enums/TeamType;
   #65 = Fieldref           #66.#67       // ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
   #66 = Class              #68           // ext/mods/gameserver/enums/TeamType
   #67 = NameAndType        #69:#70       // NONE:Lext/mods/gameserver/enums/TeamType;
   #68 = Utf8               ext/mods/gameserver/enums/TeamType
   #69 = Utf8               NONE
   #70 = Utf8               Lext/mods/gameserver/enums/TeamType;
   #71 = Methodref          #47.#72       // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
   #72 = NameAndType        #73:#30       // isInDuel:()Z
   #73 = Utf8               isInDuel
   #74 = Methodref          #47.#75       // ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
   #75 = NameAndType        #76:#77       // getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
   #76 = Utf8               getDuelState
   #77 = Utf8               ()Lext/mods/gameserver/enums/duels/DuelState;
   #78 = Fieldref           #79.#80       // ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
   #79 = Class              #81           // ext/mods/gameserver/enums/duels/DuelState
   #80 = NameAndType        #82:#83       // INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
   #81 = Utf8               ext/mods/gameserver/enums/duels/DuelState
   #82 = Utf8               INTERRUPTED
   #83 = Utf8               Lext/mods/gameserver/enums/duels/DuelState;
   #84 = Methodref          #47.#85       // ext/mods/gameserver/model/actor/Player.stopAllEffectsExceptThoseThatLastThroughDeath:()V
   #85 = NameAndType        #86:#6        // stopAllEffectsExceptThoseThatLastThroughDeath:()V
   #86 = Utf8               stopAllEffectsExceptThoseThatLastThroughDeath
   #87 = Methodref          #47.#88       // ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
   #88 = NameAndType        #89:#90       // setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
   #89 = Utf8               setDuelState
   #90 = Utf8               (Lext/mods/gameserver/enums/duels/DuelState;)V
   #91 = Methodref          #47.#92       // ext/mods/gameserver/model/actor/Player.doRevive:()V
   #92 = NameAndType        #93:#6        // doRevive:()V
   #93 = Utf8               doRevive
   #94 = Methodref          #95.#96       // ext/mods/commons/random/Rnd.get:(I)I
   #95 = Class              #97           // ext/mods/commons/random/Rnd
   #96 = NameAndType        #98:#99       // get:(I)I
   #97 = Utf8               ext/mods/commons/random/Rnd
   #98 = Utf8               get
   #99 = Utf8               (I)I
  #100 = Methodref          #47.#101      // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #101 = NameAndType        #102:#103     // teleportTo:(IIII)Z
  #102 = Utf8               teleportTo
  #103 = Utf8               (IIII)Z
  #104 = Methodref          #22.#105      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.playerIsCarrier:(Lext/mods/gameserver/model/actor/Player;)Z
  #105 = NameAndType        #106:#107     // playerIsCarrier:(Lext/mods/gameserver/model/actor/Player;)Z
  #106 = Utf8               playerIsCarrier
  #107 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #108 = Methodref          #22.#109      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.removeFlagCarrier:(Lext/mods/gameserver/model/actor/Player;)V
  #109 = NameAndType        #110:#57      // removeFlagCarrier:(Lext/mods/gameserver/model/actor/Player;)V
  #110 = Utf8               removeFlagCarrier
  #111 = Methodref          #47.#112      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #112 = NameAndType        #113:#114     // getObjectId:()I
  #113 = Utf8               getObjectId
  #114 = Utf8               ()I
  #115 = Methodref          #22.#116      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getParticipantEnemyTeam:(I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
  #116 = NameAndType        #117:#118     // getParticipantEnemyTeam:(I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
  #117 = Utf8               getParticipantEnemyTeam
  #118 = Utf8               (I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
  #119 = Methodref          #120.#121     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getName:()Ljava/lang/String;
  #120 = Class              #122          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam
  #121 = NameAndType        #123:#124     // getName:()Ljava/lang/String;
  #122 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam
  #123 = Utf8               getName
  #124 = Utf8               ()Ljava/lang/String;
  #125 = InvokeDynamic      #0:#126       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #126 = NameAndType        #127:#128     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #127 = Utf8               makeConcatWithConstants
  #128 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #129 = Methodref          #22.#130      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
  #130 = NameAndType        #131:#132     // sysMsgToAllParticipants:(Ljava/lang/String;)V
  #131 = Utf8               sysMsgToAllParticipants
  #132 = Utf8               (Ljava/lang/String;)V
  #133 = Methodref          #22.#134      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getParticipantTeamId:(I)B
  #134 = NameAndType        #135:#136     // getParticipantTeamId:(I)B
  #135 = Utf8               getParticipantTeamId
  #136 = Utf8               (I)B
  #137 = Methodref          #47.#138      // ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
  #138 = NameAndType        #139:#140     // setTeam:(Lext/mods/gameserver/enums/TeamType;)V
  #139 = Utf8               setTeam
  #140 = Utf8               (Lext/mods/gameserver/enums/TeamType;)V
  #141 = Fieldref           #66.#142      // ext/mods/gameserver/enums/TeamType.BLUE:Lext/mods/gameserver/enums/TeamType;
  #142 = NameAndType        #143:#70      // BLUE:Lext/mods/gameserver/enums/TeamType;
  #143 = Utf8               BLUE
  #144 = Fieldref           #66.#145      // ext/mods/gameserver/enums/TeamType.RED:Lext/mods/gameserver/enums/TeamType;
  #145 = NameAndType        #146:#70      // RED:Lext/mods/gameserver/enums/TeamType;
  #146 = Utf8               RED
  #147 = Methodref          #47.#148      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #148 = NameAndType        #149:#150     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #149 = Utf8               getStatus
  #150 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #151 = Methodref          #152.#153     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
  #152 = Class              #154          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #153 = NameAndType        #155:#114     // getMaxCp:()I
  #154 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #155 = Utf8               getMaxCp
  #156 = Methodref          #152.#157     // ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
  #157 = NameAndType        #158:#159     // setCp:(D)V
  #158 = Utf8               setCp
  #159 = Utf8               (D)V
  #160 = Methodref          #152.#161     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
  #161 = NameAndType        #162:#114     // getMaxHp:()I
  #162 = Utf8               getMaxHp
  #163 = Methodref          #152.#164     // ext/mods/gameserver/model/actor/status/PlayerStatus.setHp:(D)V
  #164 = NameAndType        #165:#159     // setHp:(D)V
  #165 = Utf8               setHp
  #166 = Methodref          #152.#167     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
  #167 = NameAndType        #168:#114     // getMaxMp:()I
  #168 = Utf8               getMaxMp
  #169 = Methodref          #152.#170     // ext/mods/gameserver/model/actor/status/PlayerStatus.setMp:(D)V
  #170 = NameAndType        #171:#159     // setMp:(D)V
  #171 = Utf8               setMp
  #172 = Methodref          #152.#173     // ext/mods/gameserver/model/actor/status/PlayerStatus.broadcastStatusUpdate:()V
  #173 = NameAndType        #174:#6       // broadcastStatusUpdate:()V
  #174 = Utf8               broadcastStatusUpdate
  #175 = Methodref          #47.#176      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #176 = NameAndType        #177:#6       // broadcastUserInfo:()V
  #177 = Utf8               broadcastUserInfo
  #178 = Class              #179          // java/lang/Runnable
  #179 = Utf8               java/lang/Runnable
  #180 = Utf8               (Lext/mods/gameserver/model/actor/Player;[IZZ)V
  #181 = Utf8               Code
  #182 = Utf8               LineNumberTable
  #183 = Utf8               LocalVariableTable
  #184 = Utf8               this
  #185 = Utf8               Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter;
  #186 = Utf8               player
  #187 = Utf8               coordinates
  #188 = Utf8               fastSchedule
  #189 = Utf8               adminRemove
  #190 = Utf8               StackMapTable
  #191 = Class              #16           // "[I"
  #192 = Utf8               run
  #193 = Utf8               teamId
  #194 = Utf8               summon
  #195 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #196 = Utf8               SourceFile
  #197 = Utf8               CTFEventTeleporter.java
  #198 = Utf8               BootstrapMethods
  #199 = String             #200          // The \u0001 flag has been returned!
  #200 = Utf8               The \u0001 flag has been returned!
  #201 = MethodHandle       6:#202        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #202 = Methodref          #203.#204     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #203 = Class              #205          // java/lang/invoke/StringConcatFactory
  #204 = NameAndType        #127:#206     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #205 = Utf8               java/lang/invoke/StringConcatFactory
  #206 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #207 = Utf8               InnerClasses
  #208 = Class              #209          // java/lang/invoke/MethodHandles$Lookup
  #209 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #210 = Class              #211          // java/lang/invoke/MethodHandles
  #211 = Utf8               java/lang/invoke/MethodHandles
  #212 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.events.capturetheflag.CTFEventTeleporter(ext.mods.gameserver.model.actor.Player, int[], boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;[IZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aconst_null
         6: putfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
         9: aload_0
        10: iconst_3
        11: newarray       int
        13: putfield      #13                 // Field _coordinates:[I
        16: aload_0
        17: iconst_0
        18: putfield      #17                 // Field _adminRemove:Z
        21: aload_0
        22: aload_1
        23: putfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        26: aload_0
        27: aload_2
        28: putfield      #13                 // Field _coordinates:[I
        31: aload_0
        32: iload         4
        34: putfield      #17                 // Field _adminRemove:Z
        37: aload_0
        38: iload_3
        39: ifeq          46
        42: lconst_0
        43: goto          69
        46: invokestatic  #21                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        49: invokevirtual #27                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
        52: ifeq          61
        55: getstatic     #31                 // Field ext/mods/Config.CTF_EVENT_RESPAWN_TELEPORT_DELAY:I
        58: goto          64
        61: getstatic     #37                 // Field ext/mods/Config.CTF_EVENT_START_LEAVE_TELEPORT_DELAY:I
        64: sipush        1000
        67: imul
        68: i2l
        69: invokestatic  #40                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        72: pop
        73: return
      LineNumberTable:
        line 38: 0
        line 31: 4
        line 33: 9
        line 35: 16
        line 39: 21
        line 40: 26
        line 41: 31
        line 43: 37
        line 44: 73
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      74     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter;
            0      74     1 player   Lext/mods/gameserver/model/actor/Player;
            0      74     2 coordinates   [I
            0      74     3 fastSchedule   Z
            0      74     4 adminRemove   Z
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter, class ext/mods/gameserver/model/actor/Player, class "[I", int, int ]
          stack = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter ]
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter, class ext/mods/gameserver/model/actor/Player, class "[I", int, int ]
          stack = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter, class ext/mods/gameserver/model/actor/Player, class "[I", int, int ]
          stack = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter, long ]

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        12: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        15: astore_1
        16: aload_1
        17: ifnull        28
        20: aload_1
        21: aload_0
        22: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        25: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
        28: getstatic     #58                 // Field ext/mods/Config.CTF_EVENT_EFFECTS_REMOVAL:I
        31: ifeq          77
        34: getstatic     #58                 // Field ext/mods/Config.CTF_EVENT_EFFECTS_REMOVAL:I
        37: iconst_1
        38: if_icmpne     84
        41: aload_0
        42: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        45: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
        48: getstatic     #65                 // Field ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
        51: if_acmpeq     77
        54: aload_0
        55: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        58: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
        61: ifeq          84
        64: aload_0
        65: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        68: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
        71: getstatic     #78                 // Field ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
        74: if_acmpeq     84
        77: aload_0
        78: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        81: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.stopAllEffectsExceptThoseThatLastThroughDeath:()V
        84: aload_0
        85: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        88: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
        91: ifeq          104
        94: aload_0
        95: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        98: getstatic     #78                 // Field ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
       101: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
       104: aload_0
       105: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       108: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.doRevive:()V
       111: aload_0
       112: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       115: aload_0
       116: getfield      #13                 // Field _coordinates:[I
       119: iconst_0
       120: iaload
       121: bipush        101
       123: invokestatic  #94                 // Method ext/mods/commons/random/Rnd.get:(I)I
       126: iadd
       127: bipush        50
       129: isub
       130: aload_0
       131: getfield      #13                 // Field _coordinates:[I
       134: iconst_1
       135: iaload
       136: bipush        101
       138: invokestatic  #94                 // Method ext/mods/commons/random/Rnd.get:(I)I
       141: iadd
       142: bipush        50
       144: isub
       145: aload_0
       146: getfield      #13                 // Field _coordinates:[I
       149: iconst_2
       150: iaload
       151: iconst_0
       152: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       155: pop
       156: invokestatic  #21                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       159: aload_0
       160: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       163: invokevirtual #104                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.playerIsCarrier:(Lext/mods/gameserver/model/actor/Player;)Z
       166: ifeq          206
       169: invokestatic  #21                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       172: aload_0
       173: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       176: invokevirtual #108                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.removeFlagCarrier:(Lext/mods/gameserver/model/actor/Player;)V
       179: invokestatic  #21                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       182: invokestatic  #21                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       185: aload_0
       186: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       189: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       192: invokevirtual #115                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getParticipantEnemyTeam:(I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       195: invokevirtual #119                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getName:()Ljava/lang/String;
       198: invokedynamic #125,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       203: invokevirtual #129                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
       206: invokestatic  #21                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       209: invokevirtual #27                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
       212: ifeq          303
       215: aload_0
       216: getfield      #17                 // Field _adminRemove:Z
       219: ifne          303
       222: invokestatic  #21                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       225: aload_0
       226: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       229: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       232: invokevirtual #133                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getParticipantTeamId:(I)B
       235: iconst_1
       236: iadd
       237: istore_2
       238: iload_2
       239: tableswitch   { // 0 to 2

                       0: 264

                       1: 277

                       2: 290
                 default: 300
            }
       264: aload_0
       265: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       268: getstatic     #65                 // Field ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
       271: invokevirtual #137                // Method ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
       274: goto          300
       277: aload_0
       278: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       281: getstatic     #141                // Field ext/mods/gameserver/enums/TeamType.BLUE:Lext/mods/gameserver/enums/TeamType;
       284: invokevirtual #137                // Method ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
       287: goto          300
       290: aload_0
       291: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       294: getstatic     #144                // Field ext/mods/gameserver/enums/TeamType.RED:Lext/mods/gameserver/enums/TeamType;
       297: invokevirtual #137                // Method ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
       300: goto          313
       303: aload_0
       304: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       307: getstatic     #65                 // Field ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
       310: invokevirtual #137                // Method ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
       313: aload_0
       314: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       317: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       320: aload_0
       321: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       324: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       327: invokevirtual #151                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
       330: i2d
       331: invokevirtual #156                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
       334: aload_0
       335: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       338: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       341: aload_0
       342: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       345: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       348: invokevirtual #160                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
       351: i2d
       352: invokevirtual #163                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setHp:(D)V
       355: aload_0
       356: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       359: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       362: aload_0
       363: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       366: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       369: invokevirtual #166                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
       372: i2d
       373: invokevirtual #169                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setMp:(D)V
       376: aload_0
       377: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       380: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       383: invokevirtual #172                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.broadcastStatusUpdate:()V
       386: aload_0
       387: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       390: invokevirtual #175                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       393: return
      LineNumberTable:
        line 49: 0
        line 50: 7
        line 52: 8
        line 54: 16
        line 55: 20
        line 57: 28
        line 58: 77
        line 60: 84
        line 61: 94
        line 63: 104
        line 65: 111
        line 67: 156
        line 69: 169
        line 70: 179
        line 73: 206
        line 75: 222
        line 76: 238
        line 79: 264
        line 80: 274
        line 82: 277
        line 83: 287
        line 85: 290
        line 88: 300
        line 90: 303
        line 92: 313
        line 93: 334
        line 94: 355
        line 96: 376
        line 97: 386
        line 98: 393
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          238      62     2 teamId   I
            0     394     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter;
           16     378     1 summon   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 12
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 48 /* same */
        frame_type = 6 /* same */
        frame_type = 19 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 101
        frame_type = 252 /* append */
          offset_delta = 57
          locals = [ int ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 2 /* same */
        frame_type = 9 /* same */
}
SourceFile: "CTFEventTeleporter.java"
BootstrapMethods:
  0: #201 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #199 The \u0001 flag has been returned!
InnerClasses:
  public static final #212= #208 of #210; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
