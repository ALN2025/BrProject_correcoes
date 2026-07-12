// Bytecode for: ext.mods.gameserver.model.zone.type.SiegeZone
// File: ext\mods\gameserver\model\zone\type\SiegeZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/SiegeZone.class
  Last modified 9 de jul de 2026; size 3876 bytes
  MD5 checksum 22f5c12da51b2f36cf5e0c8171b0f483
  Compiled from "SiegeZone.java"
public class ext.mods.gameserver.model.zone.type.SiegeZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/zone/type/SiegeZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 2, methods: 8, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/zone/type/SiegeZone._siegableId:I
    #8 = Class              #10           // ext/mods/gameserver/model/zone/type/SiegeZone
    #9 = NameAndType        #11:#12       // _siegableId:I
   #10 = Utf8               ext/mods/gameserver/model/zone/type/SiegeZone
   #11 = Utf8               _siegableId
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/zone/type/SiegeZone._isActiveSiege:Z
   #14 = NameAndType        #15:#16       // _isActiveSiege:Z
   #15 = Utf8               _isActiveSiege
   #16 = Utf8               Z
   #17 = String             #18           // castleId
   #18 = Utf8               castleId
   #19 = Methodref          #20.#21       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #20 = Class              #22           // java/lang/String
   #21 = NameAndType        #23:#24       // equals:(Ljava/lang/Object;)Z
   #22 = Utf8               java/lang/String
   #23 = Utf8               equals
   #24 = Utf8               (Ljava/lang/Object;)Z
   #25 = String             #26           // clanHallId
   #26 = Utf8               clanHallId
   #27 = Methodref          #28.#29       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #28 = Class              #30           // java/lang/Integer
   #29 = NameAndType        #31:#32       // parseInt:(Ljava/lang/String;)I
   #30 = Utf8               java/lang/Integer
   #31 = Utf8               parseInt
   #32 = Utf8               (Ljava/lang/String;)I
   #33 = Methodref          #2.#34        // ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #34 = NameAndType        #35:#36       // setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #35 = Utf8               setParameter
   #36 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #37 = Fieldref           #38.#39       // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
   #38 = Class              #40           // ext/mods/gameserver/enums/ZoneId
   #39 = NameAndType        #41:#42       // PVP:Lext/mods/gameserver/enums/ZoneId;
   #40 = Utf8               ext/mods/gameserver/enums/ZoneId
   #41 = Utf8               PVP
   #42 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #44 = Class              #46           // ext/mods/gameserver/model/actor/Creature
   #45 = NameAndType        #47:#48       // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
   #46 = Utf8               ext/mods/gameserver/model/actor/Creature
   #47 = Utf8               setInsideZone
   #48 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
   #49 = Fieldref           #38.#50       // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #50 = NameAndType        #51:#42       // SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #51 = Utf8               SIEGE
   #52 = Fieldref           #38.#53       // ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
   #53 = NameAndType        #54:#42       // NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
   #54 = Utf8               NO_SUMMON_FRIEND
   #55 = Class              #56           // ext/mods/gameserver/model/actor/Player
   #56 = Utf8               ext/mods/gameserver/model/actor/Player
   #57 = Fieldref           #58.#59       // ext/mods/gameserver/network/SystemMessageId.ENTERED_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
   #58 = Class              #60           // ext/mods/gameserver/network/SystemMessageId
   #59 = NameAndType        #61:#62       // ENTERED_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
   #60 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #61 = Utf8               ENTERED_COMBAT_ZONE
   #62 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #63 = Methodref          #55.#64       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #64 = NameAndType        #65:#66       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #65 = Utf8               sendPacket
   #66 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #67 = Methodref          #55.#68       // ext/mods/gameserver/model/actor/Player.enterOnNoLandingZone:()V
   #68 = NameAndType        #69:#70       // enterOnNoLandingZone:()V
   #69 = Utf8               enterOnNoLandingZone
   #70 = Utf8               ()V
   #71 = Fieldref           #58.#72       // ext/mods/gameserver/network/SystemMessageId.LEFT_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
   #72 = NameAndType        #73:#62       // LEFT_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
   #73 = Utf8               LEFT_COMBAT_ZONE
   #74 = Methodref          #55.#75       // ext/mods/gameserver/model/actor/Player.exitOnNoLandingZone:()V
   #75 = NameAndType        #76:#70       // exitOnNoLandingZone:()V
   #76 = Utf8               exitOnNoLandingZone
   #77 = Methodref          #78.#79       // ext/mods/gameserver/taskmanager/PvpFlagTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
   #78 = Class              #80           // ext/mods/gameserver/taskmanager/PvpFlagTaskManager
   #79 = NameAndType        #81:#82       // getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
   #80 = Utf8               ext/mods/gameserver/taskmanager/PvpFlagTaskManager
   #81 = Utf8               getInstance
   #82 = Utf8               ()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
   #83 = Fieldref           #84.#85       // ext/mods/Config.PVP_NORMAL_TIME:I
   #84 = Class              #86           // ext/mods/Config
   #85 = NameAndType        #87:#12       // PVP_NORMAL_TIME:I
   #86 = Utf8               ext/mods/Config
   #87 = Utf8               PVP_NORMAL_TIME
   #88 = Methodref          #78.#89       // ext/mods/gameserver/taskmanager/PvpFlagTaskManager.add:(Lext/mods/gameserver/model/actor/Player;J)V
   #89 = NameAndType        #90:#91       // add:(Lext/mods/gameserver/model/actor/Player;J)V
   #90 = Utf8               add
   #91 = Utf8               (Lext/mods/gameserver/model/actor/Player;J)V
   #92 = Methodref          #55.#93       // ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
   #93 = NameAndType        #94:#95       // getPvpFlag:()B
   #94 = Utf8               getPvpFlag
   #95 = Utf8               ()B
   #96 = Methodref          #55.#97       // ext/mods/gameserver/model/actor/Player.updatePvPFlag:(I)V
   #97 = NameAndType        #98:#6        // updatePvPFlag:(I)V
   #98 = Utf8               updatePvPFlag
   #99 = Class              #100          // ext/mods/gameserver/model/actor/instance/SiegeSummon
  #100 = Utf8               ext/mods/gameserver/model/actor/instance/SiegeSummon
  #101 = Methodref          #99.#102      // ext/mods/gameserver/model/actor/instance/SiegeSummon.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #102 = NameAndType        #103:#104     // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #103 = Utf8               getOwner
  #104 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #105 = Methodref          #99.#106      // ext/mods/gameserver/model/actor/instance/SiegeSummon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #106 = NameAndType        #107:#108     // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #107 = Utf8               unSummon
  #108 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #109 = Fieldref           #8.#110       // ext/mods/gameserver/model/zone/type/SiegeZone._creatures:Ljava/util/Set;
  #110 = NameAndType        #111:#112     // _creatures:Ljava/util/Set;
  #111 = Utf8               _creatures
  #112 = Utf8               Ljava/util/Set;
  #113 = InterfaceMethodref #114.#115     // java/util/Set.iterator:()Ljava/util/Iterator;
  #114 = Class              #116          // java/util/Set
  #115 = NameAndType        #117:#118     // iterator:()Ljava/util/Iterator;
  #116 = Utf8               java/util/Set
  #117 = Utf8               iterator
  #118 = Utf8               ()Ljava/util/Iterator;
  #119 = InterfaceMethodref #120.#121     // java/util/Iterator.hasNext:()Z
  #120 = Class              #122          // java/util/Iterator
  #121 = NameAndType        #123:#124     // hasNext:()Z
  #122 = Utf8               java/util/Iterator
  #123 = Utf8               hasNext
  #124 = Utf8               ()Z
  #125 = InterfaceMethodref #120.#126     // java/util/Iterator.next:()Ljava/lang/Object;
  #126 = NameAndType        #127:#128     // next:()Ljava/lang/Object;
  #127 = Utf8               next
  #128 = Utf8               ()Ljava/lang/Object;
  #129 = Methodref          #8.#130       // ext/mods/gameserver/model/zone/type/SiegeZone.onEnter:(Lext/mods/gameserver/model/actor/Creature;)V
  #130 = NameAndType        #131:#132     // onEnter:(Lext/mods/gameserver/model/actor/Creature;)V
  #131 = Utf8               onEnter
  #132 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #133 = Methodref          #8.#134       // ext/mods/gameserver/model/zone/type/SiegeZone.getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
  #134 = NameAndType        #135:#136     // getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
  #135 = Utf8               getKnownTypeInside
  #136 = Utf8               (Ljava/lang/Class;)Ljava/util/List;
  #137 = InterfaceMethodref #138.#115     // java/util/List.iterator:()Ljava/util/Iterator;
  #138 = Class              #139          // java/util/List
  #139 = Utf8               java/util/List
  #140 = Methodref          #55.#141      // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #141 = NameAndType        #142:#143     // getClanId:()I
  #142 = Utf8               getClanId
  #143 = Utf8               ()I
  #144 = Fieldref           #145.#146     // ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
  #145 = Class              #147          // ext/mods/gameserver/enums/RestartType
  #146 = NameAndType        #148:#149     // TOWN:Lext/mods/gameserver/enums/RestartType;
  #147 = Utf8               ext/mods/gameserver/enums/RestartType
  #148 = Utf8               TOWN
  #149 = Utf8               Lext/mods/gameserver/enums/RestartType;
  #150 = Methodref          #55.#151      // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
  #151 = NameAndType        #152:#153     // teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
  #152 = Utf8               teleportTo
  #153 = Utf8               (Lext/mods/gameserver/enums/RestartType;)V
  #154 = Utf8               Code
  #155 = Utf8               LineNumberTable
  #156 = Utf8               LocalVariableTable
  #157 = Utf8               this
  #158 = Utf8               Lext/mods/gameserver/model/zone/type/SiegeZone;
  #159 = Utf8               id
  #160 = Utf8               name
  #161 = Utf8               Ljava/lang/String;
  #162 = Utf8               value
  #163 = Utf8               StackMapTable
  #164 = Utf8               player
  #165 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #166 = Utf8               creature
  #167 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #168 = Utf8               onExit
  #169 = Utf8               siegeSummon
  #170 = Utf8               Lext/mods/gameserver/model/actor/instance/SiegeSummon;
  #171 = Utf8               getSiegableId
  #172 = Utf8               isActive
  #173 = Utf8               setActive
  #174 = Utf8               (Z)V
  #175 = Utf8               val
  #176 = Utf8               banishForeigners
  #177 = Utf8               clanId
  #178 = Utf8               SourceFile
  #179 = Utf8               SiegeZone.java
{
  public ext.mods.gameserver.model.zone.type.SiegeZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: aload_0
         6: iconst_m1
         7: putfield      #7                  // Field _siegableId:I
        10: aload_0
        11: iconst_0
        12: putfield      #13                 // Field _isActiveSiege:Z
        15: return
      LineNumberTable:
        line 45: 0
        line 40: 5
        line 41: 10
        line 46: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/zone/type/SiegeZone;
            0      16     1    id   I

  public void setParameter(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ldc           #17                 // String castleId
         3: invokevirtual #19                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifne          18
         9: aload_1
        10: ldc           #25                 // String clanHallId
        12: invokevirtual #19                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        15: ifeq          29
        18: aload_0
        19: aload_2
        20: invokestatic  #27                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        23: putfield      #7                  // Field _siegableId:I
        26: goto          35
        29: aload_0
        30: aload_1
        31: aload_2
        32: invokespecial #33                 // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
        35: return
      LineNumberTable:
        line 51: 0
        line 52: 18
        line 54: 29
        line 55: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/zone/type/SiegeZone;
            0      36     1  name   Ljava/lang/String;
            0      36     2 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 10 /* same */
        frame_type = 5 /* same */

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _isActiveSiege:Z
         4: ifeq          54
         7: aload_1
         8: getstatic     #37                 // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
        11: iconst_1
        12: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        15: aload_1
        16: getstatic     #49                 // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
        19: iconst_1
        20: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        23: aload_1
        24: getstatic     #52                 // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
        27: iconst_1
        28: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        31: aload_1
        32: instanceof    #55                 // class ext/mods/gameserver/model/actor/Player
        35: ifeq          54
        38: aload_1
        39: checkcast     #55                 // class ext/mods/gameserver/model/actor/Player
        42: astore_2
        43: aload_2
        44: getstatic     #57                 // Field ext/mods/gameserver/network/SystemMessageId.ENTERED_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
        47: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        50: aload_2
        51: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.enterOnNoLandingZone:()V
        54: return
      LineNumberTable:
        line 60: 0
        line 62: 7
        line 63: 15
        line 64: 23
        line 66: 31
        line 68: 43
        line 69: 50
        line 72: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      11     2 player   Lext/mods/gameserver/model/actor/Player;
            0      55     0  this   Lext/mods/gameserver/model/zone/type/SiegeZone;
            0      55     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 54 /* same */

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=4, args_size=2
         0: aload_1
         1: getstatic     #37                 // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_0
         5: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: aload_1
         9: getstatic     #49                 // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
        12: iconst_0
        13: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        16: aload_1
        17: getstatic     #52                 // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
        20: iconst_0
        21: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        24: aload_1
        25: instanceof    #55                 // class ext/mods/gameserver/model/actor/Player
        28: ifeq          80
        31: aload_1
        32: checkcast     #55                 // class ext/mods/gameserver/model/actor/Player
        35: astore_2
        36: aload_0
        37: getfield      #13                 // Field _isActiveSiege:Z
        40: ifeq          100
        43: aload_2
        44: getstatic     #71                 // Field ext/mods/gameserver/network/SystemMessageId.LEFT_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
        47: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        50: aload_2
        51: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.exitOnNoLandingZone:()V
        54: invokestatic  #77                 // Method ext/mods/gameserver/taskmanager/PvpFlagTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
        57: aload_2
        58: getstatic     #83                 // Field ext/mods/Config.PVP_NORMAL_TIME:I
        61: i2l
        62: invokevirtual #88                 // Method ext/mods/gameserver/taskmanager/PvpFlagTaskManager.add:(Lext/mods/gameserver/model/actor/Player;J)V
        65: aload_2
        66: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
        69: ifne          100
        72: aload_2
        73: iconst_1
        74: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.updatePvPFlag:(I)V
        77: goto          100
        80: aload_1
        81: instanceof    #99                 // class ext/mods/gameserver/model/actor/instance/SiegeSummon
        84: ifeq          100
        87: aload_1
        88: checkcast     #99                 // class ext/mods/gameserver/model/actor/instance/SiegeSummon
        91: astore_3
        92: aload_3
        93: aload_3
        94: invokevirtual #101                // Method ext/mods/gameserver/model/actor/instance/SiegeSummon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        97: invokevirtual #105                // Method ext/mods/gameserver/model/actor/instance/SiegeSummon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
       100: return
      LineNumberTable:
        line 77: 0
        line 78: 8
        line 79: 16
        line 81: 24
        line 83: 36
        line 85: 43
        line 86: 50
        line 88: 54
        line 90: 65
        line 91: 72
        line 94: 80
        line 95: 92
        line 96: 100
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36      44     2 player   Lext/mods/gameserver/model/actor/Player;
           92       8     3 siegeSummon   Lext/mods/gameserver/model/actor/instance/SiegeSummon;
            0     101     0  this   Lext/mods/gameserver/model/zone/type/SiegeZone;
            0     101     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 251 /* same_frame_extended */
          offset_delta = 80
        frame_type = 19 /* same */

  public int getSiegableId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _siegableId:I
         4: ireturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/SiegeZone;

  public boolean isActive();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _isActiveSiege:Z
         4: ireturn
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/SiegeZone;

  public void setActive(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _isActiveSiege:Z
         5: aload_0
         6: getfield      #13                 // Field _isActiveSiege:Z
         9: ifeq          52
        12: aload_0
        13: getfield      #109                // Field _creatures:Ljava/util/Set;
        16: invokeinterface #113,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        21: astore_2
        22: aload_2
        23: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        28: ifeq          49
        31: aload_2
        32: invokeinterface #125,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        37: checkcast     #44                 // class ext/mods/gameserver/model/actor/Creature
        40: astore_3
        41: aload_0
        42: aload_3
        43: invokevirtual #129                // Method onEnter:(Lext/mods/gameserver/model/actor/Creature;)V
        46: goto          22
        49: goto          160
        52: aload_0
        53: getfield      #109                // Field _creatures:Ljava/util/Set;
        56: invokeinterface #113,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        61: astore_2
        62: aload_2
        63: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        68: ifeq          160
        71: aload_2
        72: invokeinterface #125,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        77: checkcast     #44                 // class ext/mods/gameserver/model/actor/Creature
        80: astore_3
        81: aload_3
        82: getstatic     #37                 // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
        85: iconst_0
        86: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        89: aload_3
        90: getstatic     #49                 // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
        93: iconst_0
        94: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        97: aload_3
        98: getstatic     #52                 // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
       101: iconst_0
       102: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
       105: aload_3
       106: instanceof    #55                 // class ext/mods/gameserver/model/actor/Player
       109: ifeq          134
       112: aload_3
       113: checkcast     #55                 // class ext/mods/gameserver/model/actor/Player
       116: astore        4
       118: aload         4
       120: getstatic     #71                 // Field ext/mods/gameserver/network/SystemMessageId.LEFT_COMBAT_ZONE:Lext/mods/gameserver/network/SystemMessageId;
       123: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       126: aload         4
       128: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.exitOnNoLandingZone:()V
       131: goto          157
       134: aload_3
       135: instanceof    #99                 // class ext/mods/gameserver/model/actor/instance/SiegeSummon
       138: ifeq          157
       141: aload_3
       142: checkcast     #99                 // class ext/mods/gameserver/model/actor/instance/SiegeSummon
       145: astore        5
       147: aload         5
       149: aload         5
       151: invokevirtual #101                // Method ext/mods/gameserver/model/actor/instance/SiegeSummon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       154: invokevirtual #105                // Method ext/mods/gameserver/model/actor/instance/SiegeSummon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
       157: goto          62
       160: return
      LineNumberTable:
        line 110: 0
        line 112: 5
        line 114: 12
        line 115: 41
        line 119: 52
        line 121: 81
        line 122: 89
        line 123: 97
        line 125: 105
        line 127: 118
        line 128: 126
        line 130: 134
        line 131: 147
        line 132: 157
        line 134: 160
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41       5     3 creature   Lext/mods/gameserver/model/actor/Creature;
          118      16     4 player   Lext/mods/gameserver/model/actor/Player;
          147      10     5 siegeSummon   Lext/mods/gameserver/model/actor/instance/SiegeSummon;
           81      76     3 creature   Lext/mods/gameserver/model/actor/Creature;
            0     161     0  this   Lext/mods/gameserver/model/zone/type/SiegeZone;
            0     161     1   val   Z
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 26
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 250 /* chop */
          offset_delta = 2

  public void banishForeigners(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: ldc           #55                 // class ext/mods/gameserver/model/actor/Player
         3: invokevirtual #133                // Method getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
         6: invokeinterface #137,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        11: astore_2
        12: aload_2
        13: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          52
        21: aload_2
        22: invokeinterface #125,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #55                 // class ext/mods/gameserver/model/actor/Player
        30: astore_3
        31: aload_3
        32: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        35: iload_1
        36: if_icmpne     42
        39: goto          12
        42: aload_3
        43: getstatic     #144                // Field ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
        46: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
        49: goto          12
        52: return
      LineNumberTable:
        line 142: 0
        line 144: 31
        line 145: 39
        line 147: 42
        line 148: 49
        line 149: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      18     3 player   Lext/mods/gameserver/model/actor/Player;
            0      53     0  this   Lext/mods/gameserver/model/zone/type/SiegeZone;
            0      53     1 clanId   I
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 9
}
SourceFile: "SiegeZone.java"
