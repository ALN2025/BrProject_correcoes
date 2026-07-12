// Bytecode for: ext.mods.gameserver.model.actor.status.PlayableStatus
// File: ext\mods\gameserver\model\actor\status\PlayableStatus.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/status/PlayableStatus.class
  Last modified 9 de jul de 2026; size 5580 bytes
  MD5 checksum a4f1b5b61d028710f0bc8c9c3af7995d
  Compiled from "PlayableStatus.java"
public class ext.mods.gameserver.model.actor.status.PlayableStatus<T extends ext.mods.gameserver.model.actor.Playable> extends ext.mods.gameserver.model.actor.status.CreatureStatus<T>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/status/PlayableStatus
  super_class: #2                         // ext/mods/gameserver/model/actor/status/CreatureStatus
  interfaces: 0, fields: 3, methods: 18, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/status/CreatureStatus."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/status/CreatureStatus
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/status/PlayableStatus._exp:J
    #8 = Class              #10           // ext/mods/gameserver/model/actor/status/PlayableStatus
    #9 = NameAndType        #11:#12       // _exp:J
   #10 = Utf8               ext/mods/gameserver/model/actor/status/PlayableStatus
   #11 = Utf8               _exp
   #12 = Utf8               J
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/status/PlayableStatus._sp:I
   #14 = NameAndType        #15:#16       // _sp:I
   #15 = Utf8               _sp
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/actor/status/PlayableStatus._level:I
   #18 = NameAndType        #19:#16       // _level:I
   #19 = Utf8               _level
   #20 = Methodref          #8.#21        // ext/mods/gameserver/model/actor/status/PlayableStatus.getBaseMoveSpeed:()I
   #21 = NameAndType        #22:#23       // getBaseMoveSpeed:()I
   #22 = Utf8               getBaseMoveSpeed
   #23 = Utf8               ()I
   #24 = Fieldref           #8.#25        // ext/mods/gameserver/model/actor/status/PlayableStatus._actor:Lext/mods/gameserver/model/actor/Creature;
   #25 = NameAndType        #26:#27       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #26 = Utf8               _actor
   #27 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #28 = Class              #29           // ext/mods/gameserver/model/actor/Playable
   #29 = Utf8               ext/mods/gameserver/model/actor/Playable
   #30 = Fieldref           #31.#32       // ext/mods/gameserver/enums/ZoneId.SWAMP:Lext/mods/gameserver/enums/ZoneId;
   #31 = Class              #33           // ext/mods/gameserver/enums/ZoneId
   #32 = NameAndType        #34:#35       // SWAMP:Lext/mods/gameserver/enums/ZoneId;
   #33 = Utf8               ext/mods/gameserver/enums/ZoneId
   #34 = Utf8               SWAMP
   #35 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #36 = Methodref          #28.#37       // ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #37 = NameAndType        #38:#39       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #38 = Utf8               isInsideZone
   #39 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #40 = Methodref          #41.#42       // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #41 = Class              #43           // ext/mods/gameserver/data/manager/ZoneManager
   #42 = NameAndType        #44:#45       // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #43 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
   #44 = Utf8               getInstance
   #45 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
   #46 = Class              #47           // ext/mods/gameserver/model/zone/type/SwampZone
   #47 = Utf8               ext/mods/gameserver/model/zone/type/SwampZone
   #48 = Methodref          #41.#49       // ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
   #49 = NameAndType        #50:#51       // getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
   #50 = Utf8               getZone
   #51 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
   #52 = Methodref          #46.#53       // ext/mods/gameserver/model/zone/type/SwampZone.getMoveBonus:()I
   #53 = NameAndType        #54:#23       // getMoveBonus:()I
   #54 = Utf8               getMoveBonus
   #55 = Double             100.0d
   #57 = Fieldref           #58.#59       // ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #58 = Class              #60           // ext/mods/gameserver/enums/skills/Stats
   #59 = NameAndType        #61:#62       // RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #60 = Utf8               ext/mods/gameserver/enums/skills/Stats
   #61 = Utf8               RUN_SPEED
   #62 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
   #63 = Methodref          #8.#64        // ext/mods/gameserver/model/actor/status/PlayableStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #64 = NameAndType        #65:#66       // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #65 = Utf8               calcStat
   #66 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #67 = Methodref          #8.#68        // ext/mods/gameserver/model/actor/status/PlayableStatus.getExp:()J
   #68 = NameAndType        #69:#70       // getExp:()J
   #69 = Utf8               getExp
   #70 = Utf8               ()J
   #71 = Methodref          #72.#73       // ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
   #72 = Class              #74           // ext/mods/gameserver/data/xml/PlayerLevelData
   #73 = NameAndType        #44:#75       // getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
   #74 = Utf8               ext/mods/gameserver/data/xml/PlayerLevelData
   #75 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerLevelData;
   #76 = Methodref          #72.#77       // ext/mods/gameserver/data/xml/PlayerLevelData.getRequiredExpForHighestLevel:()J
   #77 = NameAndType        #78:#70       // getRequiredExpForHighestLevel:()J
   #78 = Utf8               getRequiredExpForHighestLevel
   #79 = Methodref          #8.#80        // ext/mods/gameserver/model/actor/status/PlayableStatus.setExp:(J)V
   #80 = NameAndType        #81:#82       // setExp:(J)V
   #81 = Utf8               setExp
   #82 = Utf8               (J)V
   #83 = Methodref          #72.#84       // ext/mods/gameserver/data/xml/PlayerLevelData.getMaxLevel:()I
   #84 = NameAndType        #85:#23       // getMaxLevel:()I
   #85 = Utf8               getMaxLevel
   #86 = Methodref          #8.#87        // ext/mods/gameserver/model/actor/status/PlayableStatus.getExpForLevel:(I)J
   #87 = NameAndType        #88:#89       // getExpForLevel:(I)J
   #88 = Utf8               getExpForLevel
   #89 = Utf8               (I)J
   #90 = Methodref          #8.#91        // ext/mods/gameserver/model/actor/status/PlayableStatus.getLevel:()I
   #91 = NameAndType        #92:#23       // getLevel:()I
   #92 = Utf8               getLevel
   #93 = Methodref          #8.#94        // ext/mods/gameserver/model/actor/status/PlayableStatus.addLevel:(B)Z
   #94 = NameAndType        #95:#96       // addLevel:(B)Z
   #95 = Utf8               addLevel
   #96 = Utf8               (B)Z
   #97 = Methodref          #8.#98        // ext/mods/gameserver/model/actor/status/PlayableStatus.addExp:(J)Z
   #98 = NameAndType        #99:#100      // addExp:(J)Z
   #99 = Utf8               addExp
  #100 = Utf8               (J)Z
  #101 = Methodref          #8.#102       // ext/mods/gameserver/model/actor/status/PlayableStatus.addSp:(I)Z
  #102 = NameAndType        #103:#104     // addSp:(I)Z
  #103 = Utf8               addSp
  #104 = Utf8               (I)Z
  #105 = Methodref          #8.#106       // ext/mods/gameserver/model/actor/status/PlayableStatus.removeExp:(J)Z
  #106 = NameAndType        #107:#100     // removeExp:(J)Z
  #107 = Utf8               removeExp
  #108 = Methodref          #8.#109       // ext/mods/gameserver/model/actor/status/PlayableStatus.removeSp:(I)Z
  #109 = NameAndType        #110:#104     // removeSp:(I)Z
  #110 = Utf8               removeSp
  #111 = Methodref          #72.#112      // ext/mods/gameserver/data/xml/PlayerLevelData.getRealMaxLevel:()I
  #112 = NameAndType        #113:#23      // getRealMaxLevel:()I
  #113 = Utf8               getRealMaxLevel
  #114 = Methodref          #8.#115       // ext/mods/gameserver/model/actor/status/PlayableStatus.setLevel:(I)V
  #115 = NameAndType        #116:#117     // setLevel:(I)V
  #116 = Utf8               setLevel
  #117 = Utf8               (I)V
  #118 = Methodref          #119.#120     // ext/mods/extensions/listener/manager/PlayerListenerManager.getInstance:()Lext/mods/extensions/listener/manager/PlayerListenerManager;
  #119 = Class              #121          // ext/mods/extensions/listener/manager/PlayerListenerManager
  #120 = NameAndType        #44:#122      // getInstance:()Lext/mods/extensions/listener/manager/PlayerListenerManager;
  #121 = Utf8               ext/mods/extensions/listener/manager/PlayerListenerManager
  #122 = Utf8               ()Lext/mods/extensions/listener/manager/PlayerListenerManager;
  #123 = Class              #124          // ext/mods/gameserver/model/actor/Player
  #124 = Utf8               ext/mods/gameserver/model/actor/Player
  #125 = Methodref          #119.#126     // ext/mods/extensions/listener/manager/PlayerListenerManager.notifySetLevel:(Lext/mods/gameserver/model/actor/Player;I)V
  #126 = NameAndType        #127:#128     // notifySetLevel:(Lext/mods/gameserver/model/actor/Player;I)V
  #127 = Utf8               notifySetLevel
  #128 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #129 = Methodref          #119.#130     // ext/mods/extensions/listener/manager/PlayerListenerManager.notifyLevelUp:(Lext/mods/gameserver/model/actor/Player;)V
  #130 = NameAndType        #131:#132     // notifyLevelUp:(Lext/mods/gameserver/model/actor/Player;)V
  #131 = Utf8               notifyLevelUp
  #132 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #133 = Methodref          #8.#134       // ext/mods/gameserver/model/actor/status/PlayableStatus.setMaxHpMp:()V
  #134 = NameAndType        #135:#136     // setMaxHpMp:()V
  #135 = Utf8               setMaxHpMp
  #136 = Utf8               ()V
  #137 = Methodref          #8.#138       // ext/mods/gameserver/model/actor/status/PlayableStatus.getSp:()I
  #138 = NameAndType        #139:#23      // getSp:()I
  #139 = Utf8               getSp
  #140 = Class              #141          // java/lang/Integer
  #141 = Utf8               java/lang/Integer
  #142 = Integer            2147483647
  #143 = Methodref          #8.#144       // ext/mods/gameserver/model/actor/status/PlayableStatus.setSp:(I)V
  #144 = NameAndType        #145:#117     // setSp:(I)V
  #145 = Utf8               setSp
  #146 = Methodref          #147.#148     // java/lang/Math.max:(II)I
  #147 = Class              #149          // java/lang/Math
  #148 = NameAndType        #150:#151     // max:(II)I
  #149 = Utf8               java/lang/Math
  #150 = Utf8               max
  #151 = Utf8               (II)I
  #152 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
  #153 = Utf8               Code
  #154 = Utf8               LineNumberTable
  #155 = Utf8               LocalVariableTable
  #156 = Utf8               this
  #157 = Utf8               Lext/mods/gameserver/model/actor/status/PlayableStatus;
  #158 = Utf8               actor
  #159 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #160 = Utf8               LocalVariableTypeTable
  #161 = Utf8               Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;
  #162 = Utf8               TT;
  #163 = Utf8               Signature
  #164 = Utf8               (TT;)V
  #165 = Utf8               value
  #166 = Utf8               getMoveSpeed
  #167 = Utf8               ()F
  #168 = Utf8               zone
  #169 = Utf8               Lext/mods/gameserver/model/zone/type/SwampZone;
  #170 = Utf8               baseValue
  #171 = Utf8               F
  #172 = Utf8               StackMapTable
  #173 = Utf8               level
  #174 = Utf8               B
  #175 = Utf8               addExpAndSp
  #176 = Utf8               (JI)Z
  #177 = Utf8               addToExp
  #178 = Utf8               addToSp
  #179 = Utf8               expAdded
  #180 = Utf8               Z
  #181 = Utf8               spAdded
  #182 = Utf8               removeExpAndSp
  #183 = Utf8               expRemoved
  #184 = Utf8               spRemoved
  #185 = Utf8               levelIncreased
  #186 = Utf8               currentSp
  #187 = Utf8               getExpForThisLevel
  #188 = Utf8               getExpForNextLevel
  #189 = Utf8               <T:Lext/mods/gameserver/model/actor/Playable;>Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
  #190 = Utf8               SourceFile
  #191 = Utf8               PlayableStatus.java
{
  protected int _level;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.actor.status.PlayableStatus(T);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/status/CreatureStatus."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         5: aload_0
         6: lconst_0
         7: putfield      #7                  // Field _exp:J
        10: aload_0
        11: iconst_0
        12: putfield      #13                 // Field _sp:I
        15: aload_0
        16: iconst_1
        17: putfield      #17                 // Field _level:I
        20: return
      LineNumberTable:
        line 38: 0
        line 31: 5
        line 32: 10
        line 34: 15
        line 39: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
            0      21     1 actor   Lext/mods/gameserver/model/actor/Playable;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;
            0      21     1 actor   TT;
    Signature: #164                         // (TT;)V

  public int getLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _level:I
         4: ireturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;

  public void setLevel(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #17                 // Field _level:I
         5: return
      LineNumberTable:
        line 49: 0
        line 50: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
            0       6     1 value   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;

  public float getMoveSpeed();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #20                 // Method getBaseMoveSpeed:()I
         4: i2f
         5: fstore_1
         6: aload_0
         7: getfield      #24                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        10: checkcast     #28                 // class ext/mods/gameserver/model/actor/Playable
        13: getstatic     #30                 // Field ext/mods/gameserver/enums/ZoneId.SWAMP:Lext/mods/gameserver/enums/ZoneId;
        16: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        19: ifeq          59
        22: invokestatic  #40                 // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
        25: aload_0
        26: getfield      #24                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        29: ldc           #46                 // class ext/mods/gameserver/model/zone/type/SwampZone
        31: invokevirtual #48                 // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
        34: checkcast     #46                 // class ext/mods/gameserver/model/zone/type/SwampZone
        37: astore_2
        38: aload_2
        39: ifnull        59
        42: fload_1
        43: f2d
        44: bipush        100
        46: aload_2
        47: invokevirtual #52                 // Method ext/mods/gameserver/model/zone/type/SwampZone.getMoveBonus:()I
        50: iadd
        51: i2d
        52: ldc2_w        #55                 // double 100.0d
        55: ddiv
        56: dmul
        57: d2f
        58: fstore_1
        59: aload_0
        60: getstatic     #57                 // Field ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
        63: fload_1
        64: f2d
        65: aconst_null
        66: aconst_null
        67: invokevirtual #63                 // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        70: d2f
        71: freturn
      LineNumberTable:
        line 55: 0
        line 57: 6
        line 59: 22
        line 60: 38
        line 61: 42
        line 64: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38      21     2  zone   Lext/mods/gameserver/model/zone/type/SwampZone;
            0      72     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
            6      66     1 baseValue   F
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      72     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 59
          locals = [ float ]

  public long getExp();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _exp:J
         4: lreturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;

  public void setExp(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #7                  // Field _exp:J
         5: return
      LineNumberTable:
        line 74: 0
        line 75: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
            0       6     1 value   J
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;

  public int getSp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _sp:I
         4: ireturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;

  public void setSp(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _sp:I
         5: return
      LineNumberTable:
        line 84: 0
        line 85: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
            0       6     1 value   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;

  public boolean addExp(long);
    descriptor: (J)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #67                 // Method getExp:()J
         4: lload_1
         5: ladd
         6: lconst_0
         7: lcmp
         8: ifge          13
        11: iconst_1
        12: ireturn
        13: aload_0
        14: invokevirtual #67                 // Method getExp:()J
        17: lload_1
        18: ladd
        19: invokestatic  #71                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
        22: invokevirtual #76                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getRequiredExpForHighestLevel:()J
        25: lcmp
        26: iflt          43
        29: invokestatic  #71                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
        32: invokevirtual #76                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getRequiredExpForHighestLevel:()J
        35: lconst_1
        36: lsub
        37: aload_0
        38: invokevirtual #67                 // Method getExp:()J
        41: lsub
        42: lstore_1
        43: aload_0
        44: aload_0
        45: invokevirtual #67                 // Method getExp:()J
        48: lload_1
        49: ladd
        50: invokevirtual #79                 // Method setExp:(J)V
        53: iconst_0
        54: istore_3
        55: iconst_1
        56: istore_3
        57: iload_3
        58: invokestatic  #71                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
        61: invokevirtual #83                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getMaxLevel:()I
        64: if_icmpgt     99
        67: aload_0
        68: invokevirtual #67                 // Method getExp:()J
        71: aload_0
        72: iload_3
        73: invokevirtual #86                 // Method getExpForLevel:(I)J
        76: lcmp
        77: iflt          83
        80: goto          91
        83: iload_3
        84: iconst_1
        85: isub
        86: i2b
        87: istore_3
        88: goto          99
        91: iload_3
        92: iconst_1
        93: iadd
        94: i2b
        95: istore_3
        96: goto          57
        99: iload_3
       100: aload_0
       101: invokevirtual #90                 // Method getLevel:()I
       104: if_icmpeq     119
       107: aload_0
       108: iload_3
       109: aload_0
       110: invokevirtual #90                 // Method getLevel:()I
       113: isub
       114: i2b
       115: invokevirtual #93                 // Method addLevel:(B)Z
       118: pop
       119: iconst_1
       120: ireturn
      LineNumberTable:
        line 89: 0
        line 90: 11
        line 92: 13
        line 93: 29
        line 95: 43
        line 97: 53
        line 98: 55
        line 100: 67
        line 101: 80
        line 103: 83
        line 104: 88
        line 98: 91
        line 107: 99
        line 108: 107
        line 110: 119
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     121     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
            0     121     1 value   J
           55      66     3 level   B
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     121     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;
      StackMapTable: number_of_entries = 7
        frame_type = 13 /* same */
        frame_type = 29 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ int ]
        frame_type = 25 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 19 /* same */

  public boolean removeExp(long);
    descriptor: (J)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #67                 // Method getExp:()J
         4: lload_1
         5: lsub
         6: lconst_0
         7: lcmp
         8: ifge          18
        11: aload_0
        12: invokevirtual #67                 // Method getExp:()J
        15: lconst_1
        16: lsub
        17: lstore_1
        18: aload_0
        19: aload_0
        20: invokevirtual #67                 // Method getExp:()J
        23: lload_1
        24: lsub
        25: invokevirtual #79                 // Method setExp:(J)V
        28: iconst_0
        29: istore_3
        30: iconst_1
        31: istore_3
        32: iload_3
        33: invokestatic  #71                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
        36: invokevirtual #83                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getMaxLevel:()I
        39: if_icmpgt     74
        42: aload_0
        43: invokevirtual #67                 // Method getExp:()J
        46: aload_0
        47: iload_3
        48: invokevirtual #86                 // Method getExpForLevel:(I)J
        51: lcmp
        52: iflt          58
        55: goto          66
        58: iload_3
        59: iconst_1
        60: isub
        61: i2b
        62: istore_3
        63: goto          74
        66: iload_3
        67: iconst_1
        68: iadd
        69: i2b
        70: istore_3
        71: goto          32
        74: iload_3
        75: aload_0
        76: invokevirtual #90                 // Method getLevel:()I
        79: if_icmpeq     94
        82: aload_0
        83: iload_3
        84: aload_0
        85: invokevirtual #90                 // Method getLevel:()I
        88: isub
        89: i2b
        90: invokevirtual #93                 // Method addLevel:(B)Z
        93: pop
        94: iconst_1
        95: ireturn
      LineNumberTable:
        line 115: 0
        line 116: 11
        line 118: 18
        line 120: 28
        line 121: 30
        line 123: 42
        line 124: 55
        line 126: 58
        line 127: 63
        line 121: 66
        line 130: 74
        line 131: 82
        line 133: 94
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      96     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
            0      96     1 value   J
           30      66     3 level   B
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      96     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;
      StackMapTable: number_of_entries = 6
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ int ]
        frame_type = 25 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 19 /* same */

  public boolean addExpAndSp(long, int);
    descriptor: (JI)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=3
         0: iconst_0
         1: istore        4
         3: iconst_0
         4: istore        5
         6: lload_1
         7: lconst_0
         8: lcmp
         9: iflt          19
        12: aload_0
        13: lload_1
        14: invokevirtual #97                 // Method addExp:(J)Z
        17: istore        4
        19: iload_3
        20: iflt          30
        23: aload_0
        24: iload_3
        25: invokevirtual #101                // Method addSp:(I)Z
        28: istore        5
        30: iload         4
        32: ifne          40
        35: iload         5
        37: ifeq          44
        40: iconst_1
        41: goto          45
        44: iconst_0
        45: ireturn
      LineNumberTable:
        line 138: 0
        line 139: 3
        line 141: 6
        line 142: 12
        line 144: 19
        line 145: 23
        line 147: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
            0      46     1 addToExp   J
            0      46     3 addToSp   I
            3      43     4 expAdded   Z
            6      40     5 spAdded   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ int, int ]
        frame_type = 10 /* same */
        frame_type = 9 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean removeExpAndSp(long, int);
    descriptor: (JI)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=3
         0: iconst_0
         1: istore        4
         3: iconst_0
         4: istore        5
         6: lload_1
         7: lconst_0
         8: lcmp
         9: ifle          19
        12: aload_0
        13: lload_1
        14: invokevirtual #105                // Method removeExp:(J)Z
        17: istore        4
        19: iload_3
        20: ifle          30
        23: aload_0
        24: iload_3
        25: invokevirtual #108                // Method removeSp:(I)Z
        28: istore        5
        30: iload         4
        32: ifne          40
        35: iload         5
        37: ifeq          44
        40: iconst_1
        41: goto          45
        44: iconst_0
        45: ireturn
      LineNumberTable:
        line 152: 0
        line 153: 3
        line 155: 6
        line 156: 12
        line 158: 19
        line 159: 23
        line 161: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
            0      46     1 removeExp   J
            0      46     3 removeSp   I
            3      43     4 expRemoved   Z
            6      40     5 spRemoved   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ int, int ]
        frame_type = 10 /* same */
        frame_type = 9 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean addLevel(byte);
    descriptor: (B)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: invokevirtual #90                 // Method getLevel:()I
         4: iload_1
         5: iadd
         6: invokestatic  #71                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
         9: invokevirtual #111                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getRealMaxLevel:()I
        12: if_icmple     46
        15: aload_0
        16: invokevirtual #90                 // Method getLevel:()I
        19: invokestatic  #71                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
        22: invokevirtual #111                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getRealMaxLevel:()I
        25: if_icmpge     44
        28: invokestatic  #71                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
        31: invokevirtual #111                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getRealMaxLevel:()I
        34: aload_0
        35: invokevirtual #90                 // Method getLevel:()I
        38: isub
        39: i2b
        40: istore_1
        41: goto          46
        44: iconst_0
        45: ireturn
        46: aload_0
        47: invokevirtual #90                 // Method getLevel:()I
        50: iload_1
        51: iadd
        52: aload_0
        53: invokevirtual #90                 // Method getLevel:()I
        56: if_icmple     63
        59: iconst_1
        60: goto          64
        63: iconst_0
        64: istore_2
        65: iload_1
        66: aload_0
        67: invokevirtual #90                 // Method getLevel:()I
        70: iadd
        71: i2b
        72: istore_1
        73: aload_0
        74: iload_1
        75: invokevirtual #114                // Method setLevel:(I)V
        78: aload_0
        79: invokevirtual #67                 // Method getExp:()J
        82: aload_0
        83: aload_0
        84: invokevirtual #90                 // Method getLevel:()I
        87: iconst_1
        88: iadd
        89: invokevirtual #86                 // Method getExpForLevel:(I)J
        92: lcmp
        93: ifge          112
        96: aload_0
        97: aload_0
        98: invokevirtual #90                 // Method getLevel:()I
       101: invokevirtual #86                 // Method getExpForLevel:(I)J
       104: aload_0
       105: invokevirtual #67                 // Method getExp:()J
       108: lcmp
       109: ifle          124
       112: aload_0
       113: aload_0
       114: aload_0
       115: invokevirtual #90                 // Method getLevel:()I
       118: invokevirtual #86                 // Method getExpForLevel:(I)J
       121: invokevirtual #79                 // Method setExp:(J)V
       124: iload_2
       125: ifne          130
       128: iconst_0
       129: ireturn
       130: invokestatic  #118                // Method ext/mods/extensions/listener/manager/PlayerListenerManager.getInstance:()Lext/mods/extensions/listener/manager/PlayerListenerManager;
       133: aload_0
       134: getfield      #24                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       137: checkcast     #123                // class ext/mods/gameserver/model/actor/Player
       140: iload_1
       141: invokevirtual #125                // Method ext/mods/extensions/listener/manager/PlayerListenerManager.notifySetLevel:(Lext/mods/gameserver/model/actor/Player;I)V
       144: invokestatic  #118                // Method ext/mods/extensions/listener/manager/PlayerListenerManager.getInstance:()Lext/mods/extensions/listener/manager/PlayerListenerManager;
       147: aload_0
       148: getfield      #24                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       151: checkcast     #123                // class ext/mods/gameserver/model/actor/Player
       154: invokevirtual #129                // Method ext/mods/extensions/listener/manager/PlayerListenerManager.notifyLevelUp:(Lext/mods/gameserver/model/actor/Player;)V
       157: aload_0
       158: invokevirtual #133                // Method setMaxHpMp:()V
       161: iconst_1
       162: ireturn
      LineNumberTable:
        line 167: 0
        line 169: 15
        line 170: 28
        line 172: 44
        line 175: 46
        line 176: 65
        line 177: 73
        line 179: 78
        line 180: 112
        line 182: 124
        line 183: 128
        line 185: 130
        line 186: 144
        line 188: 157
        line 190: 161
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     163     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
            0     163     1 value   B
           65      98     2 levelIncreased   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     163     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;
      StackMapTable: number_of_entries = 7
        frame_type = 44 /* same */
        frame_type = 1 /* same */
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ int ]
        frame_type = 11 /* same */
        frame_type = 5 /* same */

  public boolean addSp(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: iload_1
         1: ifge          6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: invokevirtual #137                // Method getSp:()I
        10: istore_2
        11: iload_2
        12: ldc           #142                // int 2147483647
        14: if_icmpne     19
        17: iconst_0
        18: ireturn
        19: iload_2
        20: ldc           #142                // int 2147483647
        22: iload_1
        23: isub
        24: if_icmple     32
        27: ldc           #142                // int 2147483647
        29: iload_2
        30: isub
        31: istore_1
        32: aload_0
        33: iload_2
        34: iload_1
        35: iadd
        36: invokevirtual #143                // Method setSp:(I)V
        39: iconst_1
        40: ireturn
      LineNumberTable:
        line 195: 0
        line 196: 4
        line 198: 6
        line 199: 11
        line 200: 17
        line 202: 19
        line 203: 27
        line 205: 32
        line 206: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
            0      41     1 value   I
           11      30     2 currentSp   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ int ]
        frame_type = 12 /* same */

  public boolean removeSp(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: iconst_0
         2: aload_0
         3: invokevirtual #137                // Method getSp:()I
         6: iload_1
         7: isub
         8: invokestatic  #146                // Method java/lang/Math.max:(II)I
        11: invokevirtual #143                // Method setSp:(I)V
        14: iconst_1
        15: ireturn
      LineNumberTable:
        line 211: 0
        line 212: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
            0      16     1 value   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;

  public long getExpForLevel(int);
    descriptor: (I)J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: lconst_0
         1: lreturn
      LineNumberTable:
        line 217: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
            0       2     1 level   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;

  public long getExpForThisLevel();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: lconst_0
         1: lreturn
      LineNumberTable:
        line 222: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;

  public long getExpForNextLevel();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: lconst_0
         1: lreturn
      LineNumberTable:
        line 227: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/status/PlayableStatus<TT;>;
}
Signature: #189                         // <T:Lext/mods/gameserver/model/actor/Playable;>Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
SourceFile: "PlayableStatus.java"
