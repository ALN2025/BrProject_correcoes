// Bytecode for: ext.mods.gameserver.model.location.TowerSpawnLocation
// File: ext\mods\gameserver\model\location\TowerSpawnLocation.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/location/TowerSpawnLocation.class
  Last modified 9 de jul de 2026; size 4944 bytes
  MD5 checksum 13008d066c5f3b7859933e3bfbf8f50c
  Compiled from "TowerSpawnLocation.java"
public class ext.mods.gameserver.model.location.TowerSpawnLocation extends ext.mods.gameserver.model.location.SpawnLocation
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #12                         // ext/mods/gameserver/model/location/TowerSpawnLocation
  super_class: #2                         // ext/mods/gameserver/model/location/SpawnLocation
  interfaces: 0, fields: 13, methods: 16, attributes: 1
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/gameserver/model/location/SpawnLocation.DUMMY_SPAWNLOC:Lext/mods/gameserver/model/location/SpawnLocation;
    #2 = Class              #4            // ext/mods/gameserver/model/location/SpawnLocation
    #3 = NameAndType        #5:#6         // DUMMY_SPAWNLOC:Lext/mods/gameserver/model/location/SpawnLocation;
    #4 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
    #5 = Utf8               DUMMY_SPAWNLOC
    #6 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
    #7 = Methodref          #2.#8         // ext/mods/gameserver/model/location/SpawnLocation."<init>":(Lext/mods/gameserver/model/location/SpawnLocation;)V
    #8 = NameAndType        #9:#10        // "<init>":(Lext/mods/gameserver/model/location/SpawnLocation;)V
    #9 = Utf8               <init>
   #10 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
   #11 = Fieldref           #12.#13       // ext/mods/gameserver/model/location/TowerSpawnLocation._type:Lext/mods/gameserver/enums/actors/TowerType;
   #12 = Class              #14           // ext/mods/gameserver/model/location/TowerSpawnLocation
   #13 = NameAndType        #15:#16       // _type:Lext/mods/gameserver/enums/actors/TowerType;
   #14 = Utf8               ext/mods/gameserver/model/location/TowerSpawnLocation
   #15 = Utf8               _type
   #16 = Utf8               Lext/mods/gameserver/enums/actors/TowerType;
   #17 = Fieldref           #12.#18       // ext/mods/gameserver/model/location/TowerSpawnLocation._alias:Ljava/lang/String;
   #18 = NameAndType        #19:#20       // _alias:Ljava/lang/String;
   #19 = Utf8               _alias
   #20 = Utf8               Ljava/lang/String;
   #21 = Fieldref           #12.#22       // ext/mods/gameserver/model/location/TowerSpawnLocation._castle:Lext/mods/gameserver/model/residence/castle/Castle;
   #22 = NameAndType        #23:#24       // _castle:Lext/mods/gameserver/model/residence/castle/Castle;
   #23 = Utf8               _castle
   #24 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
   #25 = Fieldref           #12.#26       // ext/mods/gameserver/model/location/TowerSpawnLocation._hp:D
   #26 = NameAndType        #27:#28       // _hp:D
   #27 = Utf8               _hp
   #28 = Utf8               D
   #29 = Fieldref           #12.#30       // ext/mods/gameserver/model/location/TowerSpawnLocation._pDef:D
   #30 = NameAndType        #31:#28       // _pDef:D
   #31 = Utf8               _pDef
   #32 = Fieldref           #12.#33       // ext/mods/gameserver/model/location/TowerSpawnLocation._mDef:D
   #33 = NameAndType        #34:#28       // _mDef:D
   #34 = Utf8               _mDef
   #35 = Fieldref           #12.#36       // ext/mods/gameserver/model/location/TowerSpawnLocation._zones:[Ljava/lang/String;
   #36 = NameAndType        #37:#38       // _zones:[Ljava/lang/String;
   #37 = Utf8               _zones
   #38 = Utf8               [Ljava/lang/String;
   #39 = Fieldref           #12.#40       // ext/mods/gameserver/model/location/TowerSpawnLocation._upgradeLevel:I
   #40 = NameAndType        #41:#42       // _upgradeLevel:I
   #41 = Utf8               _upgradeLevel
   #42 = Utf8               I
   #43 = Fieldref           #12.#44       // ext/mods/gameserver/model/location/TowerSpawnLocation._npc:Lext/mods/gameserver/model/actor/Npc;
   #44 = NameAndType        #45:#46       // _npc:Lext/mods/gameserver/model/actor/Npc;
   #45 = Utf8               _npc
   #46 = Utf8               Lext/mods/gameserver/model/actor/Npc;
   #47 = Class              #48           // ext/mods/commons/data/StatSet
   #48 = Utf8               ext/mods/commons/data/StatSet
   #49 = Methodref          #47.#50       // ext/mods/commons/data/StatSet."<init>":()V
   #50 = NameAndType        #9:#51        // "<init>":()V
   #51 = Utf8               ()V
   #52 = String             #53           // id
   #53 = Utf8               id
   #54 = Fieldref           #55.#56       // ext/mods/gameserver/enums/actors/TowerType.LIFE_CONTROL:Lext/mods/gameserver/enums/actors/TowerType;
   #55 = Class              #57           // ext/mods/gameserver/enums/actors/TowerType
   #56 = NameAndType        #58:#16       // LIFE_CONTROL:Lext/mods/gameserver/enums/actors/TowerType;
   #57 = Utf8               ext/mods/gameserver/enums/actors/TowerType
   #58 = Utf8               LIFE_CONTROL
   #59 = Methodref          #47.#60       // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
   #60 = NameAndType        #61:#62       // set:(Ljava/lang/String;I)V
   #61 = Utf8               set
   #62 = Utf8               (Ljava/lang/String;I)V
   #63 = String             #64           // type
   #64 = Utf8               type
   #65 = String             #66           // LifeTower
   #66 = Utf8               LifeTower
   #67 = String             #68           // FlameTower
   #68 = Utf8               FlameTower
   #69 = Methodref          #47.#70       // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
   #70 = NameAndType        #61:#71       // set:(Ljava/lang/String;Ljava/lang/String;)V
   #71 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #72 = String             #73           // name
   #73 = Utf8               name
   #74 = String             #75           // Life Control Tower
   #75 = Utf8               Life Control Tower
   #76 = String             #77           // Flame Control Tower
   #77 = Utf8               Flame Control Tower
   #78 = String             #79           // hp
   #79 = Utf8               hp
   #80 = Methodref          #47.#81       // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;D)V
   #81 = NameAndType        #61:#82       // set:(Ljava/lang/String;D)V
   #82 = Utf8               (Ljava/lang/String;D)V
   #83 = String             #84           // mp
   #84 = Utf8               mp
   #85 = String             #86           // pAtk
   #86 = Utf8               pAtk
   #87 = String             #88           // mAtk
   #88 = Utf8               mAtk
   #89 = String             #90           // pDef
   #90 = Utf8               pDef
   #91 = String             #92           // mDef
   #92 = Utf8               mDef
   #93 = String             #94           // runSpd
   #94 = Utf8               runSpd
   #95 = String             #96           // radius
   #96 = Utf8               radius
   #97 = String             #98           // height
   #98 = Utf8               height
   #99 = String             #100          // undying
  #100 = Utf8               undying
  #101 = Methodref          #47.#102      // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Z)V
  #102 = NameAndType        #61:#103      // set:(Ljava/lang/String;Z)V
  #103 = Utf8               (Ljava/lang/String;Z)V
  #104 = String             #105          // baseDamageRange
  #105 = Utf8               baseDamageRange
  #106 = String             #107          // 0;0;80;120
  #107 = Utf8               0;0;80;120
  #108 = Class              #109          // ext/mods/gameserver/model/spawn/Spawn
  #109 = Utf8               ext/mods/gameserver/model/spawn/Spawn
  #110 = Class              #111          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #111 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #112 = Methodref          #110.#113     // ext/mods/gameserver/model/actor/template/NpcTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
  #113 = NameAndType        #9:#114       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #114 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #115 = Methodref          #108.#116     // ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #116 = NameAndType        #9:#117       // "<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #117 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #118 = Methodref          #108.#119     // ext/mods/gameserver/model/spawn/Spawn.setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #119 = NameAndType        #120:#10      // setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #120 = Utf8               setLoc
  #121 = Methodref          #108.#122     // ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #122 = NameAndType        #123:#124     // doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #123 = Utf8               doSpawn
  #124 = Utf8               (Z)Lext/mods/gameserver/model/actor/Npc;
  #125 = Methodref          #126.#127     // ext/mods/gameserver/model/actor/Npc.setResidence:(Lext/mods/gameserver/model/residence/Residence;)V
  #126 = Class              #128          // ext/mods/gameserver/model/actor/Npc
  #127 = NameAndType        #129:#130     // setResidence:(Lext/mods/gameserver/model/residence/Residence;)V
  #128 = Utf8               ext/mods/gameserver/model/actor/Npc
  #129 = Utf8               setResidence
  #130 = Utf8               (Lext/mods/gameserver/model/residence/Residence;)V
  #131 = Class              #132          // java/lang/Exception
  #132 = Utf8               java/lang/Exception
  #133 = Methodref          #126.#134     // ext/mods/gameserver/model/actor/Npc.polymorph:(I)Z
  #134 = NameAndType        #135:#136     // polymorph:(I)Z
  #135 = Utf8               polymorph
  #136 = Utf8               (I)Z
  #137 = Methodref          #126.#138     // ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #138 = NameAndType        #139:#140     // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #139 = Utf8               getStatus
  #140 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #141 = Methodref          #142.#143     // ext/mods/gameserver/model/actor/status/NpcStatus.setMaxHp:()V
  #142 = Class              #144          // ext/mods/gameserver/model/actor/status/NpcStatus
  #143 = NameAndType        #145:#51      // setMaxHp:()V
  #144 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
  #145 = Utf8               setMaxHp
  #146 = Methodref          #126.#147     // ext/mods/gameserver/model/actor/Npc.unpolymorph:()V
  #147 = NameAndType        #148:#51      // unpolymorph:()V
  #148 = Utf8               unpolymorph
  #149 = Fieldref           #55.#150      // ext/mods/gameserver/enums/actors/TowerType.TRAP_CONTROL:Lext/mods/gameserver/enums/actors/TowerType;
  #150 = NameAndType        #151:#16      // TRAP_CONTROL:Lext/mods/gameserver/enums/actors/TowerType;
  #151 = Utf8               TRAP_CONTROL
  #152 = Methodref          #126.#153     // ext/mods/gameserver/model/actor/Npc.getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #153 = NameAndType        #154:#155     // getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #154 = Utf8               getPolymorphTemplate
  #155 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #156 = Class              #157          // ext/mods/gameserver/model/actor/instance/FlameTower
  #157 = Utf8               ext/mods/gameserver/model/actor/instance/FlameTower
  #158 = Methodref          #156.#159     // ext/mods/gameserver/model/actor/instance/FlameTower.enableZones:(Z)V
  #159 = NameAndType        #160:#161     // enableZones:(Z)V
  #160 = Utf8               enableZones
  #161 = Utf8               (Z)V
  #162 = Methodref          #12.#163      // ext/mods/gameserver/model/location/TowerSpawnLocation.polymorph:()V
  #163 = NameAndType        #135:#51      // polymorph:()V
  #164 = Utf8               LT_DISPLAY_NPC_WORKING
  #165 = Utf8               ConstantValue
  #166 = Integer            13002
  #167 = Utf8               LT_DISPLAY_NPC_NON_WORKING
  #168 = Integer            13003
  #169 = Utf8               FT_DISPLAY_NPC_WORKING
  #170 = Integer            13004
  #171 = Utf8               FT_DISPLAY_NPC_NON_WORKING
  #172 = Integer            13005
  #173 = Utf8               (Lext/mods/gameserver/enums/actors/TowerType;Ljava/lang/String;Lext/mods/gameserver/model/residence/castle/Castle;)V
  #174 = Utf8               Code
  #175 = Utf8               LineNumberTable
  #176 = Utf8               LocalVariableTable
  #177 = Utf8               this
  #178 = Utf8               Lext/mods/gameserver/model/location/TowerSpawnLocation;
  #179 = Utf8               alias
  #180 = Utf8               castle
  #181 = Utf8               getType
  #182 = Utf8               ()Lext/mods/gameserver/enums/actors/TowerType;
  #183 = Utf8               getAlias
  #184 = Utf8               ()Ljava/lang/String;
  #185 = Utf8               getHp
  #186 = Utf8               ()D
  #187 = Utf8               getPdef
  #188 = Utf8               getMdef
  #189 = Utf8               setStats
  #190 = Utf8               (DDD)V
  #191 = Utf8               getZones
  #192 = Utf8               ()[Ljava/lang/String;
  #193 = Utf8               setZones
  #194 = Utf8               ([Ljava/lang/String;)V
  #195 = Utf8               zones
  #196 = Utf8               getUpgradeLevel
  #197 = Utf8               ()I
  #198 = Utf8               setUpgradeLevel
  #199 = Utf8               (I)V
  #200 = Utf8               level
  #201 = Utf8               getNpc
  #202 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #203 = Utf8               spawnMe
  #204 = Utf8               npcDat
  #205 = Utf8               Lext/mods/commons/data/StatSet;
  #206 = Utf8               spawn
  #207 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #208 = Utf8               StackMapTable
  #209 = Class              #210          // java/lang/String
  #210 = Utf8               java/lang/String
  #211 = Utf8               midVictory
  #212 = Utf8               SourceFile
  #213 = Utf8               TowerSpawnLocation.java
{
  public static final int LT_DISPLAY_NPC_WORKING;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 13002

  public static final int LT_DISPLAY_NPC_NON_WORKING;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 13003

  public static final int FT_DISPLAY_NPC_WORKING;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 13004

  public static final int FT_DISPLAY_NPC_NON_WORKING;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 13005

  public ext.mods.gameserver.model.location.TowerSpawnLocation(ext.mods.gameserver.enums.actors.TowerType, java.lang.String, ext.mods.gameserver.model.residence.castle.Castle);
    descriptor: (Lext/mods/gameserver/enums/actors/TowerType;Ljava/lang/String;Lext/mods/gameserver/model/residence/castle/Castle;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: getstatic     #1                  // Field ext/mods/gameserver/model/location/SpawnLocation.DUMMY_SPAWNLOC:Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokespecial #7                  // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(Lext/mods/gameserver/model/location/SpawnLocation;)V
         7: aload_0
         8: aload_1
         9: putfield      #11                 // Field _type:Lext/mods/gameserver/enums/actors/TowerType;
        12: aload_0
        13: aload_2
        14: putfield      #17                 // Field _alias:Ljava/lang/String;
        17: aload_0
        18: aload_3
        19: putfield      #21                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
        22: return
      LineNumberTable:
        line 54: 0
        line 56: 7
        line 57: 12
        line 58: 17
        line 59: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;
            0      23     1  type   Lext/mods/gameserver/enums/actors/TowerType;
            0      23     2 alias   Ljava/lang/String;
            0      23     3 castle   Lext/mods/gameserver/model/residence/castle/Castle;

  public ext.mods.gameserver.enums.actors.TowerType getType();
    descriptor: ()Lext/mods/gameserver/enums/actors/TowerType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #11                 // Field _type:Lext/mods/gameserver/enums/actors/TowerType;
         4: areturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;

  public java.lang.String getAlias();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _alias:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;

  public double getHp();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _hp:D
         4: dreturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;

  public double getPdef();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _pDef:D
         4: dreturn
      LineNumberTable:
        line 78: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;

  public double getMdef();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _mDef:D
         4: dreturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;

  public void setStats(double, double, double);
    descriptor: (DDD)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=4
         0: aload_0
         1: dload_1
         2: putfield      #25                 // Field _hp:D
         5: aload_0
         6: dload_3
         7: putfield      #29                 // Field _pDef:D
        10: aload_0
        11: dload         5
        13: putfield      #32                 // Field _mDef:D
        16: return
      LineNumberTable:
        line 88: 0
        line 89: 5
        line 90: 10
        line 91: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;
            0      17     1    hp   D
            0      17     3  pDef   D
            0      17     5  mDef   D

  public java.lang.String[] getZones();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _zones:[Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;

  public void setZones(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #35                 // Field _zones:[Ljava/lang/String;
         5: return
      LineNumberTable:
        line 100: 0
        line 101: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;
            0       6     1 zones   [Ljava/lang/String;

  public int getUpgradeLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _upgradeLevel:I
         4: ireturn
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;

  public void setUpgradeLevel(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #39                 // Field _upgradeLevel:I
         5: return
      LineNumberTable:
        line 110: 0
        line 111: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;
            0       6     1 level   I

  public ext.mods.gameserver.model.actor.Npc getNpc();
    descriptor: ()Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
         4: areturn
      LineNumberTable:
        line 115: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;

  public void spawnMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=1
         0: new           #47                 // class ext/mods/commons/data/StatSet
         3: dup
         4: invokespecial #49                 // Method ext/mods/commons/data/StatSet."<init>":()V
         7: astore_1
         8: aload_1
         9: ldc           #52                 // String id
        11: aload_0
        12: getfield      #11                 // Field _type:Lext/mods/gameserver/enums/actors/TowerType;
        15: getstatic     #54                 // Field ext/mods/gameserver/enums/actors/TowerType.LIFE_CONTROL:Lext/mods/gameserver/enums/actors/TowerType;
        18: if_acmpne     27
        21: sipush        13003
        24: goto          30
        27: sipush        13005
        30: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
        33: aload_1
        34: ldc           #63                 // String type
        36: aload_0
        37: getfield      #11                 // Field _type:Lext/mods/gameserver/enums/actors/TowerType;
        40: getstatic     #54                 // Field ext/mods/gameserver/enums/actors/TowerType.LIFE_CONTROL:Lext/mods/gameserver/enums/actors/TowerType;
        43: if_acmpne     51
        46: ldc           #65                 // String LifeTower
        48: goto          53
        51: ldc           #67                 // String FlameTower
        53: invokevirtual #69                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
        56: aload_1
        57: ldc           #72                 // String name
        59: aload_0
        60: getfield      #11                 // Field _type:Lext/mods/gameserver/enums/actors/TowerType;
        63: getstatic     #54                 // Field ext/mods/gameserver/enums/actors/TowerType.LIFE_CONTROL:Lext/mods/gameserver/enums/actors/TowerType;
        66: if_acmpne     74
        69: ldc           #74                 // String Life Control Tower
        71: goto          76
        74: ldc           #76                 // String Flame Control Tower
        76: invokevirtual #69                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
        79: aload_1
        80: ldc           #78                 // String hp
        82: aload_0
        83: getfield      #25                 // Field _hp:D
        86: invokevirtual #80                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;D)V
        89: aload_1
        90: ldc           #83                 // String mp
        92: iconst_0
        93: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
        96: aload_1
        97: ldc           #85                 // String pAtk
        99: iconst_0
       100: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       103: aload_1
       104: ldc           #87                 // String mAtk
       106: iconst_0
       107: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       110: aload_1
       111: ldc           #89                 // String pDef
       113: aload_0
       114: getfield      #29                 // Field _pDef:D
       117: invokevirtual #80                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;D)V
       120: aload_1
       121: ldc           #91                 // String mDef
       123: aload_0
       124: getfield      #32                 // Field _mDef:D
       127: invokevirtual #80                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;D)V
       130: aload_1
       131: ldc           #93                 // String runSpd
       133: iconst_0
       134: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       137: aload_1
       138: ldc           #95                 // String radius
       140: bipush        7
       142: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       145: aload_1
       146: ldc           #97                 // String height
       148: bipush        35
       150: invokevirtual #59                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       153: aload_1
       154: ldc           #99                 // String undying
       156: iconst_1
       157: invokevirtual #101                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Z)V
       160: aload_1
       161: ldc           #104                // String baseDamageRange
       163: ldc           #106                // String 0;0;80;120
       165: invokevirtual #69                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       168: new           #108                // class ext/mods/gameserver/model/spawn/Spawn
       171: dup
       172: new           #110                // class ext/mods/gameserver/model/actor/template/NpcTemplate
       175: dup
       176: aload_1
       177: invokespecial #112                // Method ext/mods/gameserver/model/actor/template/NpcTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
       180: invokespecial #115                // Method ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
       183: astore_2
       184: aload_2
       185: aload_0
       186: invokevirtual #118                // Method ext/mods/gameserver/model/spawn/Spawn.setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
       189: aload_0
       190: aload_2
       191: iconst_0
       192: invokevirtual #121                // Method ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
       195: putfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
       198: aload_0
       199: getfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
       202: aload_0
       203: getfield      #21                 // Field _castle:Lext/mods/gameserver/model/residence/castle/Castle;
       206: invokevirtual #125                // Method ext/mods/gameserver/model/actor/Npc.setResidence:(Lext/mods/gameserver/model/residence/Residence;)V
       209: goto          213
       212: astore_1
       213: return
      Exception table:
         from    to  target type
             0   209   212   Class java/lang/Exception
      LineNumberTable:
        line 122: 0
        line 124: 8
        line 125: 33
        line 127: 56
        line 129: 79
        line 130: 89
        line 132: 96
        line 133: 103
        line 134: 110
        line 135: 120
        line 137: 130
        line 139: 137
        line 140: 145
        line 142: 153
        line 143: 160
        line 145: 168
        line 146: 184
        line 148: 189
        line 149: 198
        line 153: 209
        line 151: 212
        line 154: 213
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8     201     1 npcDat   Lext/mods/commons/data/StatSet;
          184      25     2 spawn   Lext/mods/gameserver/model/spawn/Spawn;
            0     214     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/location/TowerSpawnLocation, class ext/mods/commons/data/StatSet ]
          stack = [ class ext/mods/commons/data/StatSet, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/location/TowerSpawnLocation, class ext/mods/commons/data/StatSet ]
          stack = [ class ext/mods/commons/data/StatSet, class java/lang/String, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/location/TowerSpawnLocation, class ext/mods/commons/data/StatSet ]
          stack = [ class ext/mods/commons/data/StatSet, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/location/TowerSpawnLocation, class ext/mods/commons/data/StatSet ]
          stack = [ class ext/mods/commons/data/StatSet, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/location/TowerSpawnLocation, class ext/mods/commons/data/StatSet ]
          stack = [ class ext/mods/commons/data/StatSet, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/location/TowerSpawnLocation, class ext/mods/commons/data/StatSet ]
          stack = [ class ext/mods/commons/data/StatSet, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 135
          locals = [ class ext/mods/gameserver/model/location/TowerSpawnLocation ]
          stack = [ class java/lang/Exception ]
        frame_type = 0 /* same */

  public void polymorph();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        12: aload_0
        13: getfield      #11                 // Field _type:Lext/mods/gameserver/enums/actors/TowerType;
        16: getstatic     #54                 // Field ext/mods/gameserver/enums/actors/TowerType.LIFE_CONTROL:Lext/mods/gameserver/enums/actors/TowerType;
        19: if_acmpne     28
        22: sipush        13002
        25: goto          31
        28: sipush        13004
        31: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.polymorph:(I)Z
        34: pop
        35: return
      LineNumberTable:
        line 161: 0
        line 162: 7
        line 164: 8
        line 165: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/location/TowerSpawnLocation ]
          stack = [ class ext/mods/gameserver/model/actor/Npc, int ]

  public void unpolymorph();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        12: invokevirtual #137                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        15: invokevirtual #141                // Method ext/mods/gameserver/model/actor/status/NpcStatus.setMaxHp:()V
        18: aload_0
        19: getfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        22: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Npc.unpolymorph:()V
        25: return
      LineNumberTable:
        line 172: 0
        line 173: 7
        line 175: 8
        line 177: 18
        line 178: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void midVictory();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #11                 // Field _type:Lext/mods/gameserver/enums/actors/TowerType;
        12: getstatic     #149                // Field ext/mods/gameserver/enums/actors/TowerType.TRAP_CONTROL:Lext/mods/gameserver/enums/actors/TowerType;
        15: if_acmpne     49
        18: aload_0
        19: getfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        22: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Npc.getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        25: ifnull        49
        28: aload_0
        29: getfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        32: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Npc.unpolymorph:()V
        35: aload_0
        36: getfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        39: checkcast     #156                // class ext/mods/gameserver/model/actor/instance/FlameTower
        42: iconst_0
        43: invokevirtual #158                // Method ext/mods/gameserver/model/actor/instance/FlameTower.enableZones:(Z)V
        46: goto          83
        49: aload_0
        50: getfield      #11                 // Field _type:Lext/mods/gameserver/enums/actors/TowerType;
        53: getstatic     #54                 // Field ext/mods/gameserver/enums/actors/TowerType.LIFE_CONTROL:Lext/mods/gameserver/enums/actors/TowerType;
        56: if_acmpne     83
        59: aload_0
        60: getfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        63: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Npc.getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        66: ifnonnull     83
        69: aload_0
        70: getfield      #43                 // Field _npc:Lext/mods/gameserver/model/actor/Npc;
        73: invokevirtual #137                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        76: invokevirtual #141                // Method ext/mods/gameserver/model/actor/status/NpcStatus.setMaxHp:()V
        79: aload_0
        80: invokevirtual #162                // Method polymorph:()V
        83: return
      LineNumberTable:
        line 185: 0
        line 186: 7
        line 188: 8
        line 190: 28
        line 192: 35
        line 194: 49
        line 196: 69
        line 198: 79
        line 200: 83
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      84     0  this   Lext/mods/gameserver/model/location/TowerSpawnLocation;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 40 /* same */
        frame_type = 33 /* same */
}
SourceFile: "TowerSpawnLocation.java"
