// Bytecode for: ext.mods.gameserver.model.entity.events.lastman.LMEventTeleporter
// File: ext\mods\gameserver\model\entity\events\lastman\LMEventTeleporter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter.class
  Last modified 9 de jul de 2026; size 3534 bytes
  MD5 checksum fc162567f83240d7b04394f40e50d7cb
  Compiled from "LMEventTeleporter.java"
public class ext.mods.gameserver.model.entity.events.lastman.LMEventTeleporter implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter._coordinates:[I
    #8 = Class              #10           // ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter
    #9 = NameAndType        #11:#12       // _coordinates:[I
   #10 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter
   #11 = Utf8               _coordinates
   #12 = Utf8               [I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter._adminRemove:Z
   #14 = NameAndType        #15:#16       // _adminRemove:Z
   #15 = Utf8               _adminRemove
   #16 = Utf8               Z
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter._player:Lext/mods/gameserver/model/actor/Player;
   #18 = NameAndType        #19:#20       // _player:Lext/mods/gameserver/model/actor/Player;
   #19 = Utf8               _player
   #20 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #21 = Methodref          #8.#22        // ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter.loadTeleport:(Z)V
   #22 = NameAndType        #23:#24       // loadTeleport:(Z)V
   #23 = Utf8               loadTeleport
   #24 = Utf8               (Z)V
   #25 = Fieldref           #26.#27       // ext/mods/Config.LM_EVENT_PLAYER_COORDINATES:Ljava/util/List;
   #26 = Class              #28           // ext/mods/Config
   #27 = NameAndType        #29:#30       // LM_EVENT_PLAYER_COORDINATES:Ljava/util/List;
   #28 = Utf8               ext/mods/Config
   #29 = Utf8               LM_EVENT_PLAYER_COORDINATES
   #30 = Utf8               Ljava/util/List;
   #31 = InterfaceMethodref #32.#33       // java/util/List.size:()I
   #32 = Class              #34           // java/util/List
   #33 = NameAndType        #35:#36       // size:()I
   #34 = Utf8               java/util/List
   #35 = Utf8               size
   #36 = Utf8               ()I
   #37 = Methodref          #38.#39       // ext/mods/commons/random/Rnd.get:(I)I
   #38 = Class              #40           // ext/mods/commons/random/Rnd
   #39 = NameAndType        #41:#42       // get:(I)I
   #40 = Utf8               ext/mods/commons/random/Rnd
   #41 = Utf8               get
   #42 = Utf8               (I)I
   #43 = InterfaceMethodref #32.#44       // java/util/List.get:(I)Ljava/lang/Object;
   #44 = NameAndType        #41:#45       // get:(I)Ljava/lang/Object;
   #45 = Utf8               (I)Ljava/lang/Object;
   #46 = Class              #12           // "[I"
   #47 = Methodref          #48.#49       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #48 = Class              #50           // ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #49 = NameAndType        #51:#52       // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #50 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #51 = Utf8               getInstance
   #52 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #53 = Methodref          #48.#54       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
   #54 = NameAndType        #55:#56       // isStarted:()Z
   #55 = Utf8               isStarted
   #56 = Utf8               ()Z
   #57 = Fieldref           #26.#58       // ext/mods/Config.LM_EVENT_RESPAWN_TELEPORT_DELAY:I
   #58 = NameAndType        #59:#60       // LM_EVENT_RESPAWN_TELEPORT_DELAY:I
   #59 = Utf8               LM_EVENT_RESPAWN_TELEPORT_DELAY
   #60 = Utf8               I
   #61 = Fieldref           #26.#62       // ext/mods/Config.LM_EVENT_START_LEAVE_TELEPORT_DELAY:I
   #62 = NameAndType        #63:#60       // LM_EVENT_START_LEAVE_TELEPORT_DELAY:I
   #63 = Utf8               LM_EVENT_START_LEAVE_TELEPORT_DELAY
   #64 = Methodref          #65.#66       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #65 = Class              #67           // ext/mods/commons/pool/ThreadPool
   #66 = NameAndType        #68:#69       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #67 = Utf8               ext/mods/commons/pool/ThreadPool
   #68 = Utf8               schedule
   #69 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #70 = Methodref          #71.#72       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #71 = Class              #73           // ext/mods/gameserver/model/actor/Player
   #72 = NameAndType        #74:#75       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #73 = Utf8               ext/mods/gameserver/model/actor/Player
   #74 = Utf8               getSummon
   #75 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #76 = Methodref          #77.#78       // ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
   #77 = Class              #79           // ext/mods/gameserver/model/actor/Summon
   #78 = NameAndType        #80:#81       // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
   #79 = Utf8               ext/mods/gameserver/model/actor/Summon
   #80 = Utf8               unSummon
   #81 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #82 = Fieldref           #26.#83       // ext/mods/Config.LM_EVENT_EFFECTS_REMOVAL:I
   #83 = NameAndType        #84:#60       // LM_EVENT_EFFECTS_REMOVAL:I
   #84 = Utf8               LM_EVENT_EFFECTS_REMOVAL
   #85 = Methodref          #71.#86       // ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
   #86 = NameAndType        #87:#88       // getTeam:()Lext/mods/gameserver/enums/TeamType;
   #87 = Utf8               getTeam
   #88 = Utf8               ()Lext/mods/gameserver/enums/TeamType;
   #89 = Fieldref           #90.#91       // ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
   #90 = Class              #92           // ext/mods/gameserver/enums/TeamType
   #91 = NameAndType        #93:#94       // NONE:Lext/mods/gameserver/enums/TeamType;
   #92 = Utf8               ext/mods/gameserver/enums/TeamType
   #93 = Utf8               NONE
   #94 = Utf8               Lext/mods/gameserver/enums/TeamType;
   #95 = Methodref          #71.#96       // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
   #96 = NameAndType        #97:#56       // isInDuel:()Z
   #97 = Utf8               isInDuel
   #98 = Methodref          #71.#99       // ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
   #99 = NameAndType        #100:#101     // getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
  #100 = Utf8               getDuelState
  #101 = Utf8               ()Lext/mods/gameserver/enums/duels/DuelState;
  #102 = Fieldref           #103.#104     // ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
  #103 = Class              #105          // ext/mods/gameserver/enums/duels/DuelState
  #104 = NameAndType        #106:#107     // INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
  #105 = Utf8               ext/mods/gameserver/enums/duels/DuelState
  #106 = Utf8               INTERRUPTED
  #107 = Utf8               Lext/mods/gameserver/enums/duels/DuelState;
  #108 = Methodref          #71.#109      // ext/mods/gameserver/model/actor/Player.stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #109 = NameAndType        #110:#6       // stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #110 = Utf8               stopAllEffectsExceptThoseThatLastThroughDeath
  #111 = Methodref          #71.#112      // ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
  #112 = NameAndType        #113:#114     // setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
  #113 = Utf8               setDuelState
  #114 = Utf8               (Lext/mods/gameserver/enums/duels/DuelState;)V
  #115 = Methodref          #71.#116      // ext/mods/gameserver/model/actor/Player.doRevive:()V
  #116 = NameAndType        #117:#6       // doRevive:()V
  #117 = Utf8               doRevive
  #118 = Methodref          #71.#119      // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #119 = NameAndType        #120:#121     // teleportTo:(IIII)Z
  #120 = Utf8               teleportTo
  #121 = Utf8               (IIII)Z
  #122 = Fieldref           #90.#123      // ext/mods/gameserver/enums/TeamType.RED:Lext/mods/gameserver/enums/TeamType;
  #123 = NameAndType        #124:#94      // RED:Lext/mods/gameserver/enums/TeamType;
  #124 = Utf8               RED
  #125 = Methodref          #71.#126      // ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
  #126 = NameAndType        #127:#128     // setTeam:(Lext/mods/gameserver/enums/TeamType;)V
  #127 = Utf8               setTeam
  #128 = Utf8               (Lext/mods/gameserver/enums/TeamType;)V
  #129 = Methodref          #71.#130      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #130 = NameAndType        #131:#132     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #131 = Utf8               getStatus
  #132 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #133 = Methodref          #134.#135     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
  #134 = Class              #136          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #135 = NameAndType        #137:#36      // getMaxCp:()I
  #136 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #137 = Utf8               getMaxCp
  #138 = Methodref          #134.#139     // ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
  #139 = NameAndType        #140:#141     // setCp:(D)V
  #140 = Utf8               setCp
  #141 = Utf8               (D)V
  #142 = Methodref          #134.#143     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
  #143 = NameAndType        #144:#36      // getMaxHp:()I
  #144 = Utf8               getMaxHp
  #145 = Methodref          #134.#146     // ext/mods/gameserver/model/actor/status/PlayerStatus.setHp:(D)V
  #146 = NameAndType        #147:#141     // setHp:(D)V
  #147 = Utf8               setHp
  #148 = Methodref          #134.#149     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
  #149 = NameAndType        #150:#36      // getMaxMp:()I
  #150 = Utf8               getMaxMp
  #151 = Methodref          #134.#152     // ext/mods/gameserver/model/actor/status/PlayerStatus.setMp:(D)V
  #152 = NameAndType        #153:#141     // setMp:(D)V
  #153 = Utf8               setMp
  #154 = Methodref          #134.#155     // ext/mods/gameserver/model/actor/status/PlayerStatus.broadcastStatusUpdate:()V
  #155 = NameAndType        #156:#6       // broadcastStatusUpdate:()V
  #156 = Utf8               broadcastStatusUpdate
  #157 = Methodref          #71.#158      // ext/mods/gameserver/model/actor/Player.broadcastTitleInfo:()V
  #158 = NameAndType        #159:#6       // broadcastTitleInfo:()V
  #159 = Utf8               broadcastTitleInfo
  #160 = Methodref          #71.#161      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #161 = NameAndType        #162:#6       // broadcastUserInfo:()V
  #162 = Utf8               broadcastUserInfo
  #163 = Class              #164          // java/lang/Runnable
  #164 = Utf8               java/lang/Runnable
  #165 = Utf8               (Lext/mods/gameserver/model/actor/Player;[IZZ)V
  #166 = Utf8               Code
  #167 = Utf8               LineNumberTable
  #168 = Utf8               LocalVariableTable
  #169 = Utf8               this
  #170 = Utf8               Lext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter;
  #171 = Utf8               player
  #172 = Utf8               coordinates
  #173 = Utf8               fastSchedule
  #174 = Utf8               adminRemove
  #175 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #176 = Utf8               StackMapTable
  #177 = Utf8               run
  #178 = Utf8               summon
  #179 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #180 = Utf8               SourceFile
  #181 = Utf8               LMEventTeleporter.java
{
  public ext.mods.gameserver.model.entity.events.lastman.LMEventTeleporter(ext.mods.gameserver.model.actor.Player, int[], boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;[IZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_3
         6: newarray       int
         8: putfield      #7                  // Field _coordinates:[I
        11: aload_0
        12: iconst_0
        13: putfield      #13                 // Field _adminRemove:Z
        16: aload_0
        17: aload_1
        18: putfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        21: aload_0
        22: aload_2
        23: putfield      #7                  // Field _coordinates:[I
        26: aload_0
        27: iload         4
        29: putfield      #13                 // Field _adminRemove:Z
        32: aload_0
        33: iload_3
        34: invokevirtual #21                 // Method loadTeleport:(Z)V
        37: return
      LineNumberTable:
        line 38: 0
        line 33: 4
        line 35: 11
        line 39: 16
        line 40: 21
        line 41: 26
        line 43: 32
        line 44: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter;
            0      38     1 player   Lext/mods/gameserver/model/actor/Player;
            0      38     2 coordinates   [I
            0      38     3 fastSchedule   Z
            0      38     4 adminRemove   Z

  public ext.mods.gameserver.model.entity.events.lastman.LMEventTeleporter(ext.mods.gameserver.model.actor.Player, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_3
         6: newarray       int
         8: putfield      #7                  // Field _coordinates:[I
        11: aload_0
        12: iconst_0
        13: putfield      #13                 // Field _adminRemove:Z
        16: aload_0
        17: aload_1
        18: putfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        21: aload_0
        22: getstatic     #25                 // Field ext/mods/Config.LM_EVENT_PLAYER_COORDINATES:Ljava/util/List;
        25: getstatic     #25                 // Field ext/mods/Config.LM_EVENT_PLAYER_COORDINATES:Ljava/util/List;
        28: invokeinterface #31,  1           // InterfaceMethod java/util/List.size:()I
        33: invokestatic  #37                 // Method ext/mods/commons/random/Rnd.get:(I)I
        36: invokeinterface #43,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        41: checkcast     #46                 // class "[I"
        44: putfield      #7                  // Field _coordinates:[I
        47: aload_0
        48: iload_3
        49: putfield      #13                 // Field _adminRemove:Z
        52: aload_0
        53: iload_2
        54: invokevirtual #21                 // Method loadTeleport:(Z)V
        57: return
      LineNumberTable:
        line 47: 0
        line 33: 4
        line 35: 11
        line 48: 16
        line 49: 21
        line 50: 47
        line 52: 52
        line 53: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter;
            0      58     1 player   Lext/mods/gameserver/model/actor/Player;
            0      58     2 fastSchedule   Z
            0      58     3 adminRemove   Z

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        12: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        15: astore_1
        16: aload_1
        17: ifnull        28
        20: aload_1
        21: aload_0
        22: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        25: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
        28: getstatic     #82                 // Field ext/mods/Config.LM_EVENT_EFFECTS_REMOVAL:I
        31: ifeq          77
        34: getstatic     #82                 // Field ext/mods/Config.LM_EVENT_EFFECTS_REMOVAL:I
        37: iconst_1
        38: if_icmpne     84
        41: aload_0
        42: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        45: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
        48: getstatic     #89                 // Field ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
        51: if_acmpeq     77
        54: aload_0
        55: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        58: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
        61: ifeq          84
        64: aload_0
        65: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        68: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
        71: getstatic     #102                // Field ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
        74: if_acmpeq     84
        77: aload_0
        78: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        81: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.stopAllEffectsExceptThoseThatLastThroughDeath:()V
        84: aload_0
        85: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        88: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
        91: ifeq          104
        94: aload_0
        95: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        98: getstatic     #102                // Field ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
       101: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
       104: aload_0
       105: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       108: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Player.doRevive:()V
       111: aload_0
       112: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       115: aload_0
       116: getfield      #7                  // Field _coordinates:[I
       119: iconst_0
       120: iaload
       121: bipush        101
       123: invokestatic  #37                 // Method ext/mods/commons/random/Rnd.get:(I)I
       126: iadd
       127: bipush        50
       129: isub
       130: aload_0
       131: getfield      #7                  // Field _coordinates:[I
       134: iconst_1
       135: iaload
       136: bipush        101
       138: invokestatic  #37                 // Method ext/mods/commons/random/Rnd.get:(I)I
       141: iadd
       142: bipush        50
       144: isub
       145: aload_0
       146: getfield      #7                  // Field _coordinates:[I
       149: iconst_2
       150: iaload
       151: iconst_0
       152: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       155: pop
       156: invokestatic  #47                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       159: invokevirtual #53                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
       162: ifeq          185
       165: aload_0
       166: getfield      #13                 // Field _adminRemove:Z
       169: ifne          185
       172: aload_0
       173: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       176: getstatic     #122                // Field ext/mods/gameserver/enums/TeamType.RED:Lext/mods/gameserver/enums/TeamType;
       179: invokevirtual #125                // Method ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
       182: goto          195
       185: aload_0
       186: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       189: getstatic     #89                 // Field ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
       192: invokevirtual #125                // Method ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
       195: aload_0
       196: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       199: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       202: aload_0
       203: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       206: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       209: invokevirtual #133                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
       212: i2d
       213: invokevirtual #138                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
       216: aload_0
       217: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       220: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       223: aload_0
       224: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       227: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       230: invokevirtual #142                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
       233: i2d
       234: invokevirtual #145                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setHp:(D)V
       237: aload_0
       238: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       241: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       244: aload_0
       245: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       248: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       251: invokevirtual #148                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
       254: i2d
       255: invokevirtual #151                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setMp:(D)V
       258: aload_0
       259: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       262: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       265: invokevirtual #154                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.broadcastStatusUpdate:()V
       268: aload_0
       269: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       272: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.broadcastTitleInfo:()V
       275: aload_0
       276: getfield      #17                 // Field _player:Lext/mods/gameserver/model/actor/Player;
       279: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       282: return
      LineNumberTable:
        line 63: 0
        line 64: 7
        line 66: 8
        line 68: 16
        line 69: 20
        line 71: 28
        line 72: 77
        line 74: 84
        line 75: 94
        line 77: 104
        line 79: 111
        line 81: 156
        line 82: 172
        line 84: 185
        line 86: 195
        line 87: 216
        line 88: 237
        line 90: 258
        line 91: 268
        line 92: 275
        line 93: 282
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     283     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter;
           16     267     1 summon   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 7
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 48 /* same */
        frame_type = 6 /* same */
        frame_type = 19 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 80
        frame_type = 9 /* same */
}
SourceFile: "LMEventTeleporter.java"
