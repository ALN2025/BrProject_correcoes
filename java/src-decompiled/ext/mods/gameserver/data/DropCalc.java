// Bytecode for: ext.mods.gameserver.data.DropCalc
// File: ext\mods\gameserver\data\DropCalc.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/DropCalc.class
  Last modified 9 de jul de 2026; size 5069 bytes
  MD5 checksum d68e1d6ca7ce5b32b5e7600e9a6131b7
  Compiled from "DropCalc.java"
public final class ext.mods.gameserver.data.DropCalc
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/DropCalc
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 12, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/data/DropCalc.calcLevelPenalty:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)F
    #8 = Class              #10           // ext/mods/gameserver/data/DropCalc
    #9 = NameAndType        #11:#12       // calcLevelPenalty:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)F
   #10 = Utf8               ext/mods/gameserver/data/DropCalc
   #11 = Utf8               calcLevelPenalty
   #12 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)F
   #13 = Methodref          #8.#14        // ext/mods/gameserver/data/DropCalc.prob:()I
   #14 = NameAndType        #15:#16       // prob:()I
   #15 = Utf8               prob
   #16 = Utf8               ()I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/data/DropCalc.dice:(D)Z
   #18 = NameAndType        #19:#20       // dice:(D)Z
   #19 = Utf8               dice
   #20 = Utf8               (D)Z
   #21 = Double             100.0d
   #23 = Methodref          #8.#24        // ext/mods/gameserver/data/DropCalc.rand:(DD)D
   #24 = NameAndType        #25:#26       // rand:(DD)D
   #25 = Utf8               rand
   #26 = Utf8               (DD)D
   #27 = Fieldref           #28.#29       // ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
   #28 = Class              #30           // ext/mods/gameserver/enums/DropType
   #29 = NameAndType        #31:#32       // SPOIL:Lext/mods/gameserver/enums/DropType;
   #30 = Utf8               ext/mods/gameserver/enums/DropType
   #31 = Utf8               SPOIL
   #32 = Utf8               Lext/mods/gameserver/enums/DropType;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #34 = Class              #36           // ext/mods/gameserver/model/actor/Player
   #35 = NameAndType        #37:#38       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #36 = Utf8               ext/mods/gameserver/model/actor/Player
   #37 = Utf8               getStatus
   #38 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #39 = Fieldref           #40.#41       // ext/mods/gameserver/enums/skills/Stats.SPOIL_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #40 = Class              #42           // ext/mods/gameserver/enums/skills/Stats
   #41 = NameAndType        #43:#44       // SPOIL_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #42 = Utf8               ext/mods/gameserver/enums/skills/Stats
   #43 = Utf8               SPOIL_RATE
   #44 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/actor/status/PlayerStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #46 = Class              #48           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #47 = NameAndType        #49:#50       // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #48 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #49 = Utf8               calcStat
   #50 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #51 = Fieldref           #28.#52       // ext/mods/gameserver/enums/DropType.DROP:Lext/mods/gameserver/enums/DropType;
   #52 = NameAndType        #53:#32       // DROP:Lext/mods/gameserver/enums/DropType;
   #53 = Utf8               DROP
   #54 = Fieldref           #40.#55       // ext/mods/gameserver/enums/skills/Stats.DROP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #55 = NameAndType        #56:#44       // DROP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #56 = Utf8               DROP_RATE
   #57 = Fieldref           #28.#58       // ext/mods/gameserver/enums/DropType.CURRENCY:Lext/mods/gameserver/enums/DropType;
   #58 = NameAndType        #59:#32       // CURRENCY:Lext/mods/gameserver/enums/DropType;
   #59 = Utf8               CURRENCY
   #60 = Fieldref           #40.#61       // ext/mods/gameserver/enums/skills/Stats.CURRENCY_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #61 = NameAndType        #62:#44       // CURRENCY_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #62 = Utf8               CURRENCY_RATE
   #63 = Methodref          #28.#64       // ext/mods/gameserver/enums/DropType.getDropRate:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
   #64 = NameAndType        #65:#66       // getDropRate:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
   #65 = Utf8               getDropRate
   #66 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
   #67 = Methodref          #68.#69       // ext/mods/gameserver/model/item/DropData.getChance:()D
   #68 = Class              #70           // ext/mods/gameserver/model/item/DropData
   #69 = NameAndType        #71:#72       // getChance:()D
   #70 = Utf8               ext/mods/gameserver/model/item/DropData
   #71 = Utf8               getChance
   #72 = Utf8               ()D
   #73 = Methodref          #8.#74        // ext/mods/gameserver/data/DropCalc.calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;DLext/mods/gameserver/enums/DropType;ZZ)D
   #74 = NameAndType        #75:#76       // calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;DLext/mods/gameserver/enums/DropType;ZZ)D
   #75 = Utf8               calcDropChance
   #76 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;DLext/mods/gameserver/enums/DropType;ZZ)D
   #77 = Methodref          #78.#69       // ext/mods/gameserver/model/item/DropCategory.getChance:()D
   #78 = Class              #79           // ext/mods/gameserver/model/item/DropCategory
   #79 = Utf8               ext/mods/gameserver/model/item/DropCategory
   #80 = Methodref          #68.#81       // ext/mods/gameserver/model/item/DropData.getMinDrop:()I
   #81 = NameAndType        #82:#16       // getMinDrop:()I
   #82 = Utf8               getMinDrop
   #83 = Methodref          #68.#84       // ext/mods/gameserver/model/item/DropData.getMaxDrop:()I
   #84 = NameAndType        #85:#16       // getMaxDrop:()I
   #85 = Utf8               getMaxDrop
   #86 = Double             0.5d
   #88 = Methodref          #8.#89        // ext/mods/gameserver/data/DropCalc.rand:(DDD)D
   #89 = NameAndType        #25:#90       // rand:(DDD)D
   #90 = Utf8               (DDD)D
   #91 = Fieldref           #92.#93       // ext/mods/Config.ALTERNATE_DROP_LIST:Z
   #92 = Class              #94           // ext/mods/Config
   #93 = NameAndType        #95:#96       // ALTERNATE_DROP_LIST:Z
   #94 = Utf8               ext/mods/Config
   #95 = Utf8               ALTERNATE_DROP_LIST
   #96 = Utf8               Z
   #97 = Methodref          #8.#98        // ext/mods/gameserver/data/DropCalc.getInstance:()Lext/mods/gameserver/data/DropCalc;
   #98 = NameAndType        #99:#100      // getInstance:()Lext/mods/gameserver/data/DropCalc;
   #99 = Utf8               getInstance
  #100 = Utf8               ()Lext/mods/gameserver/data/DropCalc;
  #101 = Methodref          #8.#102       // ext/mods/gameserver/data/DropCalc.calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
  #102 = NameAndType        #75:#103      // calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
  #103 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
  #104 = Methodref          #105.#106     // java/lang/Math.max:(DD)D
  #105 = Class              #107          // java/lang/Math
  #106 = NameAndType        #108:#26      // max:(DD)D
  #107 = Utf8               java/lang/Math
  #108 = Utf8               max
  #109 = Double             10.0d
  #111 = Methodref          #105.#112     // java/lang/Math.pow:(DD)D
  #112 = NameAndType        #113:#26      // pow:(DD)D
  #113 = Utf8               pow
  #114 = Methodref          #105.#115     // java/lang/Math.max:(II)I
  #115 = NameAndType        #108:#116     // max:(II)I
  #116 = Utf8               (II)I
  #117 = Methodref          #118.#119     // ext/mods/commons/random/Rnd.get:(II)I
  #118 = Class              #120          // ext/mods/commons/random/Rnd
  #119 = NameAndType        #121:#116     // get:(II)I
  #120 = Utf8               ext/mods/commons/random/Rnd
  #121 = Utf8               get
  #122 = Methodref          #123.#124     // ext/mods/gameserver/model/actor/instance/Monster.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #123 = Class              #125          // ext/mods/gameserver/model/actor/instance/Monster
  #124 = NameAndType        #37:#126      // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #125 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #126 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #127 = Methodref          #128.#129     // ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
  #128 = Class              #130          // ext/mods/gameserver/model/actor/status/AttackableStatus
  #129 = NameAndType        #131:#16      // getLevel:()I
  #130 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
  #131 = Utf8               getLevel
  #132 = Methodref          #46.#129      // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #133 = Float              10.0f
  #134 = Float              18.0f
  #135 = Float              190.0f
  #136 = Float              100.0f
  #137 = Double             32767.0d
  #139 = Methodref          #140.#141     // java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
  #140 = Class              #142          // java/util/concurrent/ThreadLocalRandom
  #141 = NameAndType        #143:#144     // current:()Ljava/util/concurrent/ThreadLocalRandom;
  #142 = Utf8               java/util/concurrent/ThreadLocalRandom
  #143 = Utf8               current
  #144 = Utf8               ()Ljava/util/concurrent/ThreadLocalRandom;
  #145 = Methodref          #140.#146     // java/util/concurrent/ThreadLocalRandom.nextInt:()I
  #146 = NameAndType        #147:#16      // nextInt:()I
  #147 = Utf8               nextInt
  #148 = Fieldref           #149.#150     // ext/mods/gameserver/data/DropCalc$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/DropCalc;
  #149 = Class              #151          // ext/mods/gameserver/data/DropCalc$SingletonHolder
  #150 = NameAndType        #152:#153     // INSTANCE:Lext/mods/gameserver/data/DropCalc;
  #151 = Utf8               ext/mods/gameserver/data/DropCalc$SingletonHolder
  #152 = Utf8               INSTANCE
  #153 = Utf8               Lext/mods/gameserver/data/DropCalc;
  #154 = Utf8               SEED
  #155 = Utf8               I
  #156 = Utf8               ConstantValue
  #157 = Integer            32767
  #158 = Utf8               Code
  #159 = Utf8               LineNumberTable
  #160 = Utf8               LocalVariableTable
  #161 = Utf8               this
  #162 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)Z
  #163 = Utf8               player
  #164 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #165 = Utf8               monster
  #166 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #167 = Utf8               chance
  #168 = Utf8               D
  #169 = Utf8               StackMapTable
  #170 = Utf8               npc
  #171 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #172 = Utf8               dropType
  #173 = Utf8               isRaid
  #174 = Utf8               isGrand
  #175 = Utf8               drop
  #176 = Utf8               Lext/mods/gameserver/model/item/DropData;
  #177 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropCategory;Lext/mods/gameserver/enums/DropType;ZZ)D
  #178 = Utf8               category
  #179 = Utf8               Lext/mods/gameserver/model/item/DropCategory;
  #180 = Utf8               calcItemDropCount
  #181 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)I
  #182 = Utf8               overflowFactor
  #183 = Utf8               inverseCategoryChance
  #184 = Utf8               reduceFactor
  #185 = Utf8               min
  #186 = Utf8               categoryChance
  #187 = Utf8               itemCount
  #188 = Utf8               diff
  #189 = Utf8               fact
  #190 = Utf8               SourceFile
  #191 = Utf8               DropCalc.java
  #192 = Utf8               NestMembers
  #193 = Utf8               InnerClasses
  #194 = Utf8               SingletonHolder
{
  public static final int SEED;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 32767

  public ext.mods.gameserver.data.DropCalc();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/DropCalc;

  public boolean dice(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.instance.Monster, double);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: aload_1
         1: aload_2
         2: invokestatic  #7                  // Method calcLevelPenalty:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)F
         5: invokestatic  #13                 // Method prob:()I
         8: bipush        100
        10: irem
        11: i2f
        12: fcmpl
        13: iflt          28
        16: aload_0
        17: dload_3
        18: invokevirtual #17                 // Method dice:(D)Z
        21: ifeq          28
        24: iconst_1
        25: goto          29
        28: iconst_0
        29: ireturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/data/DropCalc;
            0      30     1 player   Lext/mods/gameserver/model/actor/Player;
            0      30     2 monster   Lext/mods/gameserver/model/actor/instance/Monster;
            0      30     3 chance   D
      StackMapTable: number_of_entries = 2
        frame_type = 28 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean dice(double);
    descriptor: (D)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: dconst_0
         1: ldc2_w        #21                 // double 100.0d
         4: invokestatic  #23                 // Method rand:(DD)D
         7: dload_1
         8: dcmpg
         9: ifgt          16
        12: iconst_1
        13: goto          17
        16: iconst_0
        17: ireturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/data/DropCalc;
            0      18     1 chance   D
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public double calcDropChance(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Npc, double, ext.mods.gameserver.enums.DropType, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;DLext/mods/gameserver/enums/DropType;ZZ)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=8, args_size=7
         0: aload         5
         2: getstatic     #27                 // Field ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
         5: if_acmpne     32
         8: dload_3
         9: aload_1
        10: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        13: getstatic     #39                 // Field ext/mods/gameserver/enums/skills/Stats.SPOIL_RATE:Lext/mods/gameserver/enums/skills/Stats;
        16: ldc2_w        #21                 // double 100.0d
        19: aconst_null
        20: aconst_null
        21: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        24: ldc2_w        #21                 // double 100.0d
        27: ddiv
        28: d2i
        29: i2d
        30: dmul
        31: dstore_3
        32: aload         5
        34: getstatic     #51                 // Field ext/mods/gameserver/enums/DropType.DROP:Lext/mods/gameserver/enums/DropType;
        37: if_acmpne     64
        40: dload_3
        41: aload_1
        42: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        45: getstatic     #54                 // Field ext/mods/gameserver/enums/skills/Stats.DROP_RATE:Lext/mods/gameserver/enums/skills/Stats;
        48: ldc2_w        #21                 // double 100.0d
        51: aconst_null
        52: aconst_null
        53: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        56: ldc2_w        #21                 // double 100.0d
        59: ddiv
        60: d2i
        61: i2d
        62: dmul
        63: dstore_3
        64: aload         5
        66: getstatic     #57                 // Field ext/mods/gameserver/enums/DropType.CURRENCY:Lext/mods/gameserver/enums/DropType;
        69: if_acmpne     96
        72: dload_3
        73: aload_1
        74: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        77: getstatic     #60                 // Field ext/mods/gameserver/enums/skills/Stats.CURRENCY_RATE:Lext/mods/gameserver/enums/skills/Stats;
        80: ldc2_w        #21                 // double 100.0d
        83: aconst_null
        84: aconst_null
        85: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        88: ldc2_w        #21                 // double 100.0d
        91: ddiv
        92: d2i
        93: i2d
        94: dmul
        95: dstore_3
        96: dload_3
        97: aload         5
        99: aload_1
       100: aload_2
       101: iload         6
       103: iload         7
       105: invokevirtual #63                 // Method ext/mods/gameserver/enums/DropType.getDropRate:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
       108: dmul
       109: dreturn
      LineNumberTable:
        line 49: 0
        line 50: 8
        line 52: 32
        line 53: 40
        line 55: 64
        line 56: 72
        line 58: 96
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     110     0  this   Lext/mods/gameserver/data/DropCalc;
            0     110     1 player   Lext/mods/gameserver/model/actor/Player;
            0     110     2   npc   Lext/mods/gameserver/model/actor/Npc;
            0     110     3 chance   D
            0     110     5 dropType   Lext/mods/gameserver/enums/DropType;
            0     110     6 isRaid   Z
            0     110     7 isGrand   Z
      StackMapTable: number_of_entries = 3
        frame_type = 32 /* same */
        frame_type = 31 /* same */
        frame_type = 31 /* same */

  public double calcDropChance(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Npc, ext.mods.gameserver.model.item.DropData, ext.mods.gameserver.enums.DropType, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=7, args_size=7
         0: aload_0
         1: aload_1
         2: aload_2
         3: aload_3
         4: invokevirtual #67                 // Method ext/mods/gameserver/model/item/DropData.getChance:()D
         7: aload         4
         9: iload         5
        11: iload         6
        13: invokevirtual #73                 // Method calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;DLext/mods/gameserver/enums/DropType;ZZ)D
        16: dreturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/DropCalc;
            0      17     1 player   Lext/mods/gameserver/model/actor/Player;
            0      17     2   npc   Lext/mods/gameserver/model/actor/Npc;
            0      17     3  drop   Lext/mods/gameserver/model/item/DropData;
            0      17     4 dropType   Lext/mods/gameserver/enums/DropType;
            0      17     5 isRaid   Z
            0      17     6 isGrand   Z

  public double calcDropChance(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Npc, ext.mods.gameserver.model.item.DropCategory, ext.mods.gameserver.enums.DropType, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropCategory;Lext/mods/gameserver/enums/DropType;ZZ)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=7, args_size=7
         0: aload_0
         1: aload_1
         2: aload_2
         3: aload_3
         4: invokevirtual #77                 // Method ext/mods/gameserver/model/item/DropCategory.getChance:()D
         7: aload         4
         9: iload         5
        11: iload         6
        13: invokevirtual #73                 // Method calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;DLext/mods/gameserver/enums/DropType;ZZ)D
        16: dreturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/DropCalc;
            0      17     1 player   Lext/mods/gameserver/model/actor/Player;
            0      17     2   npc   Lext/mods/gameserver/model/actor/Npc;
            0      17     3 category   Lext/mods/gameserver/model/item/DropCategory;
            0      17     4 dropType   Lext/mods/gameserver/enums/DropType;
            0      17     5 isRaid   Z
            0      17     6 isGrand   Z

  public int calcItemDropCount(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.instance.Monster, double, ext.mods.gameserver.model.item.DropData, ext.mods.gameserver.enums.DropType, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=20, args_size=8
         0: aload         5
         2: invokevirtual #80                 // Method ext/mods/gameserver/model/item/DropData.getMinDrop:()I
         5: i2d
         6: aload         5
         8: invokevirtual #83                 // Method ext/mods/gameserver/model/item/DropData.getMaxDrop:()I
        11: i2d
        12: ldc2_w        #86                 // double 0.5d
        15: invokestatic  #88                 // Method rand:(DDD)D
        18: d2i
        19: istore        9
        21: getstatic     #91                 // Field ext/mods/Config.ALTERNATE_DROP_LIST:Z
        24: ifeq          172
        27: invokestatic  #97                 // Method getInstance:()Lext/mods/gameserver/data/DropCalc;
        30: aload_1
        31: aload_2
        32: aload         5
        34: aload         6
        36: iload         7
        38: iload         8
        40: invokevirtual #101                // Method calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
        43: dstore        10
        45: dconst_0
        46: dload         10
        48: ldc2_w        #21                 // double 100.0d
        51: dsub
        52: ldc2_w        #21                 // double 100.0d
        55: ddiv
        56: invokestatic  #104                // Method java/lang/Math.max:(DD)D
        59: dstore        12
        61: ldc2_w        #21                 // double 100.0d
        64: dload_3
        65: dsub
        66: ldc2_w        #21                 // double 100.0d
        69: ddiv
        70: dstore        14
        72: dload         14
        74: ldc2_w        #109                // double 10.0d
        77: invokestatic  #111                // Method java/lang/Math.pow:(DD)D
        80: dstore        16
        82: aload         5
        84: invokevirtual #80                 // Method ext/mods/gameserver/model/item/DropData.getMinDrop:()I
        87: istore        18
        89: aload         5
        91: invokevirtual #83                 // Method ext/mods/gameserver/model/item/DropData.getMaxDrop:()I
        94: istore        19
        96: iload         18
        98: i2d
        99: iload         18
       101: i2d
       102: dload         12
       104: dmul
       105: dadd
       106: iload         18
       108: i2d
       109: dload         12
       111: dmul
       112: dload         16
       114: dmul
       115: dsub
       116: d2i
       117: istore        18
       119: iload         19
       121: i2d
       122: iload         19
       124: i2d
       125: dload         12
       127: dmul
       128: dadd
       129: iload         19
       131: i2d
       132: dload         12
       134: dmul
       135: dload         16
       137: dmul
       138: dsub
       139: d2i
       140: istore        19
       142: iload         18
       144: aload         5
       146: invokevirtual #80                 // Method ext/mods/gameserver/model/item/DropData.getMinDrop:()I
       149: invokestatic  #114                // Method java/lang/Math.max:(II)I
       152: istore        18
       154: iload         19
       156: iload         18
       158: invokestatic  #114                // Method java/lang/Math.max:(II)I
       161: istore        19
       163: iload         18
       165: iload         19
       167: invokestatic  #117                // Method ext/mods/commons/random/Rnd.get:(II)I
       170: istore        9
       172: iload         9
       174: ireturn
      LineNumberTable:
        line 73: 0
        line 74: 21
        line 76: 27
        line 78: 45
        line 79: 61
        line 80: 72
        line 82: 82
        line 83: 89
        line 85: 96
        line 86: 119
        line 87: 142
        line 88: 154
        line 90: 163
        line 93: 172
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           45     127    10 chance   D
           61     111    12 overflowFactor   D
           72     100    14 inverseCategoryChance   D
           82      90    16 reduceFactor   D
           89      83    18   min   I
           96      76    19   max   I
            0     175     0  this   Lext/mods/gameserver/data/DropCalc;
            0     175     1 player   Lext/mods/gameserver/model/actor/Player;
            0     175     2 monster   Lext/mods/gameserver/model/actor/instance/Monster;
            0     175     3 categoryChance   D
            0     175     5  drop   Lext/mods/gameserver/model/item/DropData;
            0     175     6 dropType   Lext/mods/gameserver/enums/DropType;
            0     175     7 isRaid   Z
            0     175     8 isGrand   Z
           21     154     9 itemCount   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 172
          locals = [ int ]

  static float calcLevelPenalty(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.instance.Monster);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)F
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #122                // Method ext/mods/gameserver/model/actor/instance/Monster.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
         4: invokevirtual #127                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
         7: aload_0
         8: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        11: invokevirtual #132                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        14: isub
        15: istore_2
        16: iload_2
        17: bipush        -5
        19: if_icmpge     40
        22: iload_2
        23: bipush        -10
        25: if_icmpge     31
        28: ldc           #133                // float 10.0f
        30: freturn
        31: iload_2
        32: i2f
        33: ldc           #134                // float 18.0f
        35: fmul
        36: ldc           #135                // float 190.0f
        38: fadd
        39: freturn
        40: ldc           #136                // float 100.0f
        42: freturn
      LineNumberTable:
        line 98: 0
        line 99: 16
        line 101: 22
        line 102: 28
        line 104: 31
        line 107: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0 player   Lext/mods/gameserver/model/actor/Player;
            0      43     1 monster   Lext/mods/gameserver/model/actor/instance/Monster;
           16      27     2  diff   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ int ]
        frame_type = 8 /* same */

  static double rand(double, double);
    descriptor: (DD)D
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=4, args_size=2
         0: invokestatic  #13                 // Method prob:()I
         3: i2d
         4: ldc2_w        #137                // double 32767.0d
         7: ddiv
         8: dload_2
         9: dload_0
        10: dsub
        11: dmul
        12: dload_0
        13: dadd
        14: dreturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0   min   D
            0      15     2   max   D

  static double rand(double, double, double);
    descriptor: (DDD)D
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=6, args_size=3
         0: invokestatic  #13                 // Method prob:()I
         3: i2d
         4: ldc2_w        #137                // double 32767.0d
         7: ddiv
         8: dload_2
         9: dload_0
        10: dsub
        11: dmul
        12: dload_0
        13: dadd
        14: dload         4
        16: dadd
        17: dreturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0   min   D
            0      18     2   max   D
            0      18     4  fact   D

  static int prob();
    descriptor: ()I
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: invokestatic  #139                // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
         3: invokevirtual #145                // Method java/util/concurrent/ThreadLocalRandom.nextInt:()I
         6: sipush        32767
         9: iand
        10: ireturn
      LineNumberTable:
        line 122: 0

  public static final ext.mods.gameserver.data.DropCalc getInstance();
    descriptor: ()Lext/mods/gameserver/data/DropCalc;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #148                // Field ext/mods/gameserver/data/DropCalc$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/DropCalc;
         3: areturn
      LineNumberTable:
        line 127: 0
}
SourceFile: "DropCalc.java"
NestMembers:
  ext/mods/gameserver/data/DropCalc$SingletonHolder
