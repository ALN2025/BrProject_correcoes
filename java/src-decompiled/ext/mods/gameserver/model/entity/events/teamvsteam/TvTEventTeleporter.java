// Bytecode for: ext.mods.gameserver.model.entity.events.teamvsteam.TvTEventTeleporter
// File: ext\mods\gameserver\model\entity\events\teamvsteam\TvTEventTeleporter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter.class
  Last modified 9 de jul de 2026; size 3299 bytes
  MD5 checksum 0677c3c267dfe1b27ac2964354524121
  Compiled from "TvTEventTeleporter.java"
public class ext.mods.gameserver.model.entity.events.teamvsteam.TvTEventTeleporter implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter._player:Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter
    #9 = NameAndType        #11:#12       // _player:Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter
   #11 = Utf8               _player
   #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter._coordinates:[I
   #14 = NameAndType        #15:#16       // _coordinates:[I
   #15 = Utf8               _coordinates
   #16 = Utf8               [I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter._adminRemove:Z
   #18 = NameAndType        #19:#20       // _adminRemove:Z
   #19 = Utf8               _adminRemove
   #20 = Utf8               Z
   #21 = Methodref          #22.#23       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #22 = Class              #24           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #23 = NameAndType        #25:#26       // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #24 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #25 = Utf8               getInstance
   #26 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #27 = Methodref          #22.#28       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
   #28 = NameAndType        #29:#30       // isStarted:()Z
   #29 = Utf8               isStarted
   #30 = Utf8               ()Z
   #31 = Fieldref           #32.#33       // ext/mods/Config.TVT_EVENT_RESPAWN_TELEPORT_DELAY:I
   #32 = Class              #34           // ext/mods/Config
   #33 = NameAndType        #35:#36       // TVT_EVENT_RESPAWN_TELEPORT_DELAY:I
   #34 = Utf8               ext/mods/Config
   #35 = Utf8               TVT_EVENT_RESPAWN_TELEPORT_DELAY
   #36 = Utf8               I
   #37 = Fieldref           #32.#38       // ext/mods/Config.TVT_EVENT_START_LEAVE_TELEPORT_DELAY:I
   #38 = NameAndType        #39:#36       // TVT_EVENT_START_LEAVE_TELEPORT_DELAY:I
   #39 = Utf8               TVT_EVENT_START_LEAVE_TELEPORT_DELAY
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
   #58 = Fieldref           #32.#59       // ext/mods/Config.TVT_EVENT_EFFECTS_REMOVAL:I
   #59 = NameAndType        #60:#36       // TVT_EVENT_EFFECTS_REMOVAL:I
   #60 = Utf8               TVT_EVENT_EFFECTS_REMOVAL
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
  #104 = Methodref          #47.#105      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #105 = NameAndType        #106:#107     // getObjectId:()I
  #106 = Utf8               getObjectId
  #107 = Utf8               ()I
  #108 = Methodref          #22.#109      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getParticipantTeamId:(I)B
  #109 = NameAndType        #110:#111     // getParticipantTeamId:(I)B
  #110 = Utf8               getParticipantTeamId
  #111 = Utf8               (I)B
  #112 = Methodref          #47.#113      // ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
  #113 = NameAndType        #114:#115     // setTeam:(Lext/mods/gameserver/enums/TeamType;)V
  #114 = Utf8               setTeam
  #115 = Utf8               (Lext/mods/gameserver/enums/TeamType;)V
  #116 = Fieldref           #66.#117      // ext/mods/gameserver/enums/TeamType.BLUE:Lext/mods/gameserver/enums/TeamType;
  #117 = NameAndType        #118:#70      // BLUE:Lext/mods/gameserver/enums/TeamType;
  #118 = Utf8               BLUE
  #119 = Fieldref           #66.#120      // ext/mods/gameserver/enums/TeamType.RED:Lext/mods/gameserver/enums/TeamType;
  #120 = NameAndType        #121:#70      // RED:Lext/mods/gameserver/enums/TeamType;
  #121 = Utf8               RED
  #122 = Methodref          #47.#123      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #123 = NameAndType        #124:#125     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #124 = Utf8               getStatus
  #125 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #126 = Methodref          #127.#128     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
  #127 = Class              #129          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #128 = NameAndType        #130:#107     // getMaxCp:()I
  #129 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #130 = Utf8               getMaxCp
  #131 = Methodref          #127.#132     // ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
  #132 = NameAndType        #133:#134     // setCp:(D)V
  #133 = Utf8               setCp
  #134 = Utf8               (D)V
  #135 = Methodref          #127.#136     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
  #136 = NameAndType        #137:#107     // getMaxHp:()I
  #137 = Utf8               getMaxHp
  #138 = Methodref          #127.#139     // ext/mods/gameserver/model/actor/status/PlayerStatus.setHp:(D)V
  #139 = NameAndType        #140:#134     // setHp:(D)V
  #140 = Utf8               setHp
  #141 = Methodref          #127.#142     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
  #142 = NameAndType        #143:#107     // getMaxMp:()I
  #143 = Utf8               getMaxMp
  #144 = Methodref          #127.#145     // ext/mods/gameserver/model/actor/status/PlayerStatus.setMp:(D)V
  #145 = NameAndType        #146:#134     // setMp:(D)V
  #146 = Utf8               setMp
  #147 = Methodref          #127.#148     // ext/mods/gameserver/model/actor/status/PlayerStatus.broadcastStatusUpdate:()V
  #148 = NameAndType        #149:#6       // broadcastStatusUpdate:()V
  #149 = Utf8               broadcastStatusUpdate
  #150 = Methodref          #47.#151      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #151 = NameAndType        #152:#6       // broadcastUserInfo:()V
  #152 = Utf8               broadcastUserInfo
  #153 = Class              #154          // java/lang/Runnable
  #154 = Utf8               java/lang/Runnable
  #155 = Utf8               (Lext/mods/gameserver/model/actor/Player;[IZZ)V
  #156 = Utf8               Code
  #157 = Utf8               LineNumberTable
  #158 = Utf8               LocalVariableTable
  #159 = Utf8               this
  #160 = Utf8               Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter;
  #161 = Utf8               player
  #162 = Utf8               coordinates
  #163 = Utf8               fastSchedule
  #164 = Utf8               adminRemove
  #165 = Utf8               StackMapTable
  #166 = Class              #16           // "[I"
  #167 = Utf8               run
  #168 = Utf8               teamId
  #169 = Utf8               summon
  #170 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #171 = Utf8               SourceFile
  #172 = Utf8               TvTEventTeleporter.java
{
  public ext.mods.gameserver.model.entity.events.teamvsteam.TvTEventTeleporter(ext.mods.gameserver.model.actor.Player, int[], boolean, boolean);
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
        46: invokestatic  #21                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        49: invokevirtual #27                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
        52: ifeq          61
        55: getstatic     #31                 // Field ext/mods/Config.TVT_EVENT_RESPAWN_TELEPORT_DELAY:I
        58: goto          64
        61: getstatic     #37                 // Field ext/mods/Config.TVT_EVENT_START_LEAVE_TELEPORT_DELAY:I
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
        line 42: 37
        line 43: 73
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      74     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter;
            0      74     1 player   Lext/mods/gameserver/model/actor/Player;
            0      74     2 coordinates   [I
            0      74     3 fastSchedule   Z
            0      74     4 adminRemove   Z
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter, class ext/mods/gameserver/model/actor/Player, class "[I", int, int ]
          stack = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter ]
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter, class ext/mods/gameserver/model/actor/Player, class "[I", int, int ]
          stack = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter, class ext/mods/gameserver/model/actor/Player, class "[I", int, int ]
          stack = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter, long ]

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
        28: getstatic     #58                 // Field ext/mods/Config.TVT_EVENT_EFFECTS_REMOVAL:I
        31: ifeq          77
        34: getstatic     #58                 // Field ext/mods/Config.TVT_EVENT_EFFECTS_REMOVAL:I
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
       156: invokestatic  #21                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       159: invokevirtual #27                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
       162: ifeq          255
       165: aload_0
       166: getfield      #17                 // Field _adminRemove:Z
       169: ifne          255
       172: invokestatic  #21                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       175: aload_0
       176: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       179: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       182: invokevirtual #108                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getParticipantTeamId:(I)B
       185: iconst_1
       186: iadd
       187: istore_2
       188: iload_2
       189: tableswitch   { // 0 to 2

                       0: 216

                       1: 229

                       2: 242
                 default: 252
            }
       216: aload_0
       217: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       220: getstatic     #65                 // Field ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
       223: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
       226: goto          252
       229: aload_0
       230: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       233: getstatic     #116                // Field ext/mods/gameserver/enums/TeamType.BLUE:Lext/mods/gameserver/enums/TeamType;
       236: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
       239: goto          252
       242: aload_0
       243: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       246: getstatic     #119                // Field ext/mods/gameserver/enums/TeamType.RED:Lext/mods/gameserver/enums/TeamType;
       249: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
       252: goto          265
       255: aload_0
       256: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       259: getstatic     #65                 // Field ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
       262: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
       265: aload_0
       266: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       269: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       272: aload_0
       273: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       276: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       279: invokevirtual #126                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
       282: i2d
       283: invokevirtual #131                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
       286: aload_0
       287: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       290: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       293: aload_0
       294: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       297: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       300: invokevirtual #135                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
       303: i2d
       304: invokevirtual #138                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setHp:(D)V
       307: aload_0
       308: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       311: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       314: aload_0
       315: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       318: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       321: invokevirtual #141                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
       324: i2d
       325: invokevirtual #144                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setMp:(D)V
       328: aload_0
       329: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       332: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       335: invokevirtual #147                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.broadcastStatusUpdate:()V
       338: aload_0
       339: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       342: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       345: return
      LineNumberTable:
        line 48: 0
        line 49: 7
        line 51: 8
        line 53: 16
        line 54: 20
        line 56: 28
        line 57: 77
        line 59: 84
        line 60: 94
        line 62: 104
        line 64: 111
        line 66: 156
        line 68: 172
        line 69: 188
        line 72: 216
        line 73: 226
        line 75: 229
        line 76: 239
        line 78: 242
        line 81: 252
        line 83: 255
        line 85: 265
        line 86: 286
        line 87: 307
        line 89: 328
        line 90: 338
        line 91: 345
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          188      64     2 teamId   I
            0     346     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter;
           16     330     1 summon   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 11
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 48 /* same */
        frame_type = 6 /* same */
        frame_type = 19 /* same */
        frame_type = 252 /* append */
          offset_delta = 111
          locals = [ int ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 2 /* same */
        frame_type = 9 /* same */
}
SourceFile: "TvTEventTeleporter.java"
