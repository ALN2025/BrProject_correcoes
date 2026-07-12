// Bytecode for: ext.mods.gameserver.model.zone.type.OlympiadStadiumZone
// File: ext\mods\gameserver\model\zone\type\OlympiadStadiumZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.class
  Last modified 9 de jul de 2026; size 4172 bytes
  MD5 checksum ab03fe26a542e1f526060025d2c67ff1
  Compiled from "OlympiadStadiumZone.java"
public class ext.mods.gameserver.model.zone.type.OlympiadStadiumZone extends ext.mods.gameserver.model.zone.type.subtype.SpawnZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
  interfaces: 0, fields: 1, methods: 7, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone._task:Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
    #8 = Class              #10           // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
    #9 = NameAndType        #11:#12       // _task:Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
   #10 = Utf8               ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
   #11 = Utf8               _task
   #12 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
   #14 = Class              #16           // ext/mods/gameserver/enums/ZoneId
   #15 = NameAndType        #17:#18       // NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
   #16 = Utf8               ext/mods/gameserver/enums/ZoneId
   #17 = Utf8               NO_SUMMON_FRIEND
   #18 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #20 = Class              #22           // ext/mods/gameserver/model/actor/Creature
   #21 = NameAndType        #23:#24       // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #22 = Utf8               ext/mods/gameserver/model/actor/Creature
   #23 = Utf8               setInsideZone
   #24 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
   #25 = Fieldref           #14.#26       // ext/mods/gameserver/enums/ZoneId.NO_RESTART:Lext/mods/gameserver/enums/ZoneId;
   #26 = NameAndType        #27:#18       // NO_RESTART:Lext/mods/gameserver/enums/ZoneId;
   #27 = Utf8               NO_RESTART
   #28 = Methodref          #29.#30       // ext/mods/gameserver/model/olympiad/OlympiadGameTask.isBattleStarted:()Z
   #29 = Class              #31           // ext/mods/gameserver/model/olympiad/OlympiadGameTask
   #30 = NameAndType        #32:#33       // isBattleStarted:()Z
   #31 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameTask
   #32 = Utf8               isBattleStarted
   #33 = Utf8               ()Z
   #34 = Fieldref           #14.#35       // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
   #35 = NameAndType        #36:#18       // PVP:Lext/mods/gameserver/enums/ZoneId;
   #36 = Utf8               PVP
   #37 = Class              #38           // ext/mods/gameserver/model/actor/Player
   #38 = Utf8               ext/mods/gameserver/model/actor/Player
   #39 = Fieldref           #40.#41       // ext/mods/gameserver/network/SystemMessageId.ENTERED_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
   #40 = Class              #42           // ext/mods/gameserver/network/SystemMessageId
   #41 = NameAndType        #43:#44       // ENTERED_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
   #42 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #43 = Utf8               ENTERED_COMBAT_ZONE
   #44 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #45 = Methodref          #37.#46       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #46 = NameAndType        #47:#48       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #47 = Utf8               sendPacket
   #48 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #49 = Methodref          #29.#50       // ext/mods/gameserver/model/olympiad/OlympiadGameTask.getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
   #50 = NameAndType        #51:#52       // getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
   #51 = Utf8               getGame
   #52 = Utf8               ()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
   #53 = Methodref          #54.#55       // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.sendOlympiadInfo:(Lext/mods/gameserver/model/actor/Creature;)V
   #54 = Class              #56           // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
   #55 = NameAndType        #57:#58       // sendOlympiadInfo:(Lext/mods/gameserver/model/actor/Creature;)V
   #56 = Utf8               ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
   #57 = Utf8               sendOlympiadInfo
   #58 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #59 = Methodref          #20.#60       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #60 = NameAndType        #61:#62       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #61 = Utf8               getActingPlayer
   #62 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #63 = Methodref          #37.#64       // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #64 = NameAndType        #65:#33       // isGM:()Z
   #65 = Utf8               isGM
   #66 = Methodref          #37.#67       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #67 = NameAndType        #68:#33       // isInOlympiadMode:()Z
   #68 = Utf8               isInOlympiadMode
   #69 = Methodref          #37.#70       // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
   #70 = NameAndType        #71:#33       // isInObserverMode:()Z
   #71 = Utf8               isInObserverMode
   #72 = Methodref          #37.#73       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #73 = NameAndType        #74:#75       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #74 = Utf8               getSummon
   #75 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #76 = Methodref          #77.#78       // ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
   #77 = Class              #79           // ext/mods/gameserver/model/actor/Summon
   #78 = NameAndType        #80:#81       // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
   #79 = Utf8               ext/mods/gameserver/model/actor/Summon
   #80 = Utf8               unSummon
   #81 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #82 = Fieldref           #83.#84       // ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
   #83 = Class              #85           // ext/mods/gameserver/enums/RestartType
   #84 = NameAndType        #86:#87       // TOWN:Lext/mods/gameserver/enums/RestartType;
   #85 = Utf8               ext/mods/gameserver/enums/RestartType
   #86 = Utf8               TOWN
   #87 = Utf8               Lext/mods/gameserver/enums/RestartType;
   #88 = Methodref          #37.#89       // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
   #89 = NameAndType        #90:#91       // teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
   #90 = Utf8               teleportTo
   #91 = Utf8               (Lext/mods/gameserver/enums/RestartType;)V
   #92 = Fieldref           #40.#93       // ext/mods/gameserver/network/SystemMessageId.LEFT_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
   #93 = NameAndType        #94:#44       // LEFT_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
   #94 = Utf8               LEFT_COMBAT_ZONE
   #95 = Fieldref           #96.#97       // ext/mods/gameserver/network/serverpackets/ExOlympiadMatchEnd.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExOlympiadMatchEnd;
   #96 = Class              #98           // ext/mods/gameserver/network/serverpackets/ExOlympiadMatchEnd
   #97 = NameAndType        #99:#100      // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExOlympiadMatchEnd;
   #98 = Utf8               ext/mods/gameserver/network/serverpackets/ExOlympiadMatchEnd
   #99 = Utf8               STATIC_PACKET
  #100 = Utf8               Lext/mods/gameserver/network/serverpackets/ExOlympiadMatchEnd;
  #101 = Methodref          #37.#102      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #102 = NameAndType        #47:#103      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #103 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #104 = Fieldref           #8.#105       // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone._creatures:Ljava/util/Set;
  #105 = NameAndType        #106:#107     // _creatures:Ljava/util/Set;
  #106 = Utf8               _creatures
  #107 = Utf8               Ljava/util/Set;
  #108 = InterfaceMethodref #109.#110     // java/util/Set.iterator:()Ljava/util/Iterator;
  #109 = Class              #111          // java/util/Set
  #110 = NameAndType        #112:#113     // iterator:()Ljava/util/Iterator;
  #111 = Utf8               java/util/Set
  #112 = Utf8               iterator
  #113 = Utf8               ()Ljava/util/Iterator;
  #114 = InterfaceMethodref #115.#116     // java/util/Iterator.hasNext:()Z
  #115 = Class              #117          // java/util/Iterator
  #116 = NameAndType        #118:#33      // hasNext:()Z
  #117 = Utf8               java/util/Iterator
  #118 = Utf8               hasNext
  #119 = InterfaceMethodref #115.#120     // java/util/Iterator.next:()Ljava/lang/Object;
  #120 = NameAndType        #121:#122     // next:()Ljava/lang/Object;
  #121 = Utf8               next
  #122 = Utf8               ()Ljava/lang/Object;
  #123 = Class              #124          // ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo
  #124 = Utf8               ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo
  #125 = Methodref          #123.#126     // ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #126 = NameAndType        #5:#81        // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #127 = Methodref          #8.#128       // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
  #128 = NameAndType        #129:#130     // getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
  #129 = Utf8               getKnownTypeInside
  #130 = Utf8               (Ljava/lang/Class;)Ljava/util/List;
  #131 = InterfaceMethodref #132.#110     // java/util/List.iterator:()Ljava/util/Iterator;
  #132 = Class              #133          // java/util/List
  #133 = Utf8               java/util/List
  #134 = Methodref          #37.#135      // ext/mods/gameserver/model/actor/Player.getOlympiadSide:()I
  #135 = NameAndType        #136:#137     // getOlympiadSide:()I
  #136 = Utf8               getOlympiadSide
  #137 = Utf8               ()I
  #138 = Utf8               Code
  #139 = Utf8               LineNumberTable
  #140 = Utf8               LocalVariableTable
  #141 = Utf8               this
  #142 = Utf8               Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
  #143 = Utf8               id
  #144 = Utf8               I
  #145 = Utf8               onEnter
  #146 = Utf8               player
  #147 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #148 = Utf8               summon
  #149 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #150 = Utf8               creature
  #151 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #152 = Utf8               StackMapTable
  #153 = Utf8               onExit
  #154 = Utf8               updateZoneStatus
  #155 = Utf8               ()V
  #156 = Utf8               registerTask
  #157 = Utf8               (Lext/mods/gameserver/model/olympiad/OlympiadGameTask;)V
  #158 = Utf8               task
  #159 = Utf8               broadcastStatusUpdate
  #160 = Utf8               plyr
  #161 = Utf8               packet
  #162 = Utf8               Lext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo;
  #163 = Utf8               broadcastPacketToObservers
  #164 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #165 = Utf8               SourceFile
  #166 = Utf8               OlympiadStadiumZone.java
{
  ext.mods.gameserver.model.olympiad.OlympiadGameTask _task;
    descriptor: Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
    flags: (0x0000)

  public ext.mods.gameserver.model.zone.type.OlympiadStadiumZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType."<init>":(I)V
         5: aload_0
         6: aconst_null
         7: putfield      #7                  // Field _task:Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
        10: return
      LineNumberTable:
        line 43: 0
        line 39: 5
        line 44: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
            0      11     1    id   I

  protected final void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: getstatic     #13                 // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_1
         5: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: aload_1
         9: getstatic     #25                 // Field ext/mods/gameserver/enums/ZoneId.NO_RESTART:Lext/mods/gameserver/enums/ZoneId;
        12: iconst_1
        13: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        16: aload_0
        17: getfield      #7                  // Field _task:Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
        20: ifnull        71
        23: aload_0
        24: getfield      #7                  // Field _task:Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
        27: invokevirtual #28                 // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.isBattleStarted:()Z
        30: ifeq          71
        33: aload_1
        34: getstatic     #34                 // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
        37: iconst_1
        38: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        41: aload_1
        42: instanceof    #37                 // class ext/mods/gameserver/model/actor/Player
        45: ifeq          71
        48: aload_1
        49: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        52: astore_2
        53: aload_2
        54: getstatic     #39                 // Field ext/mods/gameserver/network/SystemMessageId.ENTERED_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
        57: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        60: aload_0
        61: getfield      #7                  // Field _task:Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
        64: invokevirtual #49                 // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
        67: aload_2
        68: invokevirtual #53                 // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.sendOlympiadInfo:(Lext/mods/gameserver/model/actor/Creature;)V
        71: aload_1
        72: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        75: astore_2
        76: aload_2
        77: ifnull        122
        80: aload_2
        81: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        84: ifne          122
        87: aload_2
        88: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        91: ifne          122
        94: aload_2
        95: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
        98: ifne          122
       101: aload_2
       102: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       105: astore_3
       106: aload_3
       107: ifnull        115
       110: aload_3
       111: aload_2
       112: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
       115: aload_2
       116: getstatic     #82                 // Field ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
       119: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
       122: return
      LineNumberTable:
        line 49: 0
        line 50: 8
        line 52: 16
        line 54: 33
        line 56: 41
        line 58: 53
        line 60: 60
        line 64: 71
        line 65: 76
        line 67: 101
        line 68: 106
        line 69: 110
        line 71: 115
        line 73: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      18     2 player   Lext/mods/gameserver/model/actor/Player;
          106      16     3 summon   Lext/mods/gameserver/model/actor/Summon;
            0     123     0  this   Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
            0     123     1 creature   Lext/mods/gameserver/model/actor/Creature;
           76      47     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 251 /* same_frame_extended */
          offset_delta = 71
        frame_type = 253 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 250 /* chop */
          offset_delta = 6

  protected final void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: getstatic     #13                 // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_0
         5: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: aload_1
         9: getstatic     #25                 // Field ext/mods/gameserver/enums/ZoneId.NO_RESTART:Lext/mods/gameserver/enums/ZoneId;
        12: iconst_0
        13: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        16: aload_0
        17: getfield      #7                  // Field _task:Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
        20: ifnull        67
        23: aload_0
        24: getfield      #7                  // Field _task:Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
        27: invokevirtual #28                 // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.isBattleStarted:()Z
        30: ifeq          67
        33: aload_1
        34: getstatic     #34                 // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
        37: iconst_0
        38: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        41: aload_1
        42: instanceof    #37                 // class ext/mods/gameserver/model/actor/Player
        45: ifeq          67
        48: aload_1
        49: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        52: astore_2
        53: aload_2
        54: getstatic     #92                 // Field ext/mods/gameserver/network/SystemMessageId.LEFT_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
        57: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        60: aload_2
        61: getstatic     #95                 // Field ext/mods/gameserver/network/serverpackets/ExOlympiadMatchEnd.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExOlympiadMatchEnd;
        64: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        67: return
      LineNumberTable:
        line 78: 0
        line 79: 8
        line 81: 16
        line 83: 33
        line 85: 41
        line 87: 53
        line 88: 60
        line 91: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      14     2 player   Lext/mods/gameserver/model/actor/Player;
            0      68     0  this   Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
            0      68     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67

  public final void updateZoneStatus();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _task:Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #104                // Field _creatures:Ljava/util/Set;
        12: invokeinterface #108,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        17: astore_1
        18: aload_1
        19: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        24: ifeq          114
        27: aload_1
        28: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        33: checkcast     #20                 // class ext/mods/gameserver/model/actor/Creature
        36: astore_2
        37: aload_0
        38: getfield      #7                  // Field _task:Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
        41: invokevirtual #28                 // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.isBattleStarted:()Z
        44: ifeq          77
        47: aload_2
        48: getstatic     #34                 // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
        51: iconst_1
        52: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        55: aload_2
        56: instanceof    #37                 // class ext/mods/gameserver/model/actor/Player
        59: ifeq          74
        62: aload_2
        63: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        66: astore_3
        67: aload_3
        68: getstatic     #39                 // Field ext/mods/gameserver/network/SystemMessageId.ENTERED_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
        71: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        74: goto          111
        77: aload_2
        78: getstatic     #34                 // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
        81: iconst_0
        82: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        85: aload_2
        86: instanceof    #37                 // class ext/mods/gameserver/model/actor/Player
        89: ifeq          111
        92: aload_2
        93: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        96: astore_3
        97: aload_3
        98: getstatic     #92                 // Field ext/mods/gameserver/network/SystemMessageId.LEFT_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
       101: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       104: aload_3
       105: getstatic     #95                 // Field ext/mods/gameserver/network/serverpackets/ExOlympiadMatchEnd.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ExOlympiadMatchEnd;
       108: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       111: goto          18
       114: return
      LineNumberTable:
        line 95: 0
        line 96: 7
        line 98: 8
        line 100: 37
        line 102: 47
        line 103: 55
        line 104: 67
        line 108: 77
        line 109: 85
        line 111: 97
        line 112: 104
        line 115: 111
        line 116: 114
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           67       7     3 player   Lext/mods/gameserver/model/actor/Player;
           97      14     3 player   Lext/mods/gameserver/model/actor/Player;
           37      74     2 creature   Lext/mods/gameserver/model/actor/Creature;
            0     115     0  this   Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
      StackMapTable: number_of_entries = 6
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 33
        frame_type = 250 /* chop */
          offset_delta = 2

  public final void registerTask(ext.mods.gameserver.model.olympiad.OlympiadGameTask);
    descriptor: (Lext/mods/gameserver/model/olympiad/OlympiadGameTask;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #7                  // Field _task:Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
         5: return
      LineNumberTable:
        line 120: 0
        line 121: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
            0       6     1  task   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;

  public final void broadcastStatusUpdate(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=5, args_size=2
         0: new           #123                // class ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo
         3: dup
         4: aload_1
         5: invokespecial #125                // Method ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
         8: astore_2
         9: aload_0
        10: ldc           #37                 // class ext/mods/gameserver/model/actor/Player
        12: invokevirtual #127                // Method getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
        15: invokeinterface #131,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        20: astore_3
        21: aload_3
        22: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        27: ifeq          70
        30: aload_3
        31: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        36: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        39: astore        4
        41: aload         4
        43: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
        46: ifne          61
        49: aload         4
        51: invokevirtual #134                // Method ext/mods/gameserver/model/actor/Player.getOlympiadSide:()I
        54: aload_1
        55: invokevirtual #134                // Method ext/mods/gameserver/model/actor/Player.getOlympiadSide:()I
        58: if_icmpeq     67
        61: aload         4
        63: aload_2
        64: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        67: goto          21
        70: return
      LineNumberTable:
        line 125: 0
        line 126: 9
        line 128: 41
        line 129: 61
        line 130: 67
        line 131: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      26     4  plyr   Lext/mods/gameserver/model/actor/Player;
            0      71     0  this   Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
            0      71     1 player   Lext/mods/gameserver/model/actor/Player;
            9      62     2 packet   Lext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 2

  public final void broadcastPacketToObservers(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: ldc           #37                 // class ext/mods/gameserver/model/actor/Player
         3: invokevirtual #127                // Method getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
         6: invokeinterface #131,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        11: astore_2
        12: aload_2
        13: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          46
        21: aload_2
        22: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        30: astore_3
        31: aload_3
        32: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
        35: ifeq          43
        38: aload_3
        39: aload_1
        40: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        43: goto          12
        46: return
      LineNumberTable:
        line 135: 0
        line 137: 31
        line 138: 38
        line 139: 43
        line 140: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      12     3 player   Lext/mods/gameserver/model/actor/Player;
            0      47     0  this   Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
            0      47     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 30 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
}
SourceFile: "OlympiadStadiumZone.java"
