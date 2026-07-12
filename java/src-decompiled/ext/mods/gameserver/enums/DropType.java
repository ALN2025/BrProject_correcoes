// Bytecode for: ext.mods.gameserver.enums.DropType
// File: ext\mods\gameserver\enums\DropType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/DropType.class
  Last modified 9 de jul de 2026; size 3042 bytes
  MD5 checksum 1193b900b583d442876ba22a4d3338ef
  Compiled from "DropType.java"
public final class ext.mods.gameserver.enums.DropType extends java.lang.Enum<ext.mods.gameserver.enums.DropType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/DropType
  super_class: #29                        // java/lang/Enum
  interfaces: 0, fields: 6, methods: 6, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/DropType
    #2 = Utf8               ext/mods/gameserver/enums/DropType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
    #4 = NameAndType        #5:#6         // SPOIL:Lext/mods/gameserver/enums/DropType;
    #5 = Utf8               SPOIL
    #6 = Utf8               Lext/mods/gameserver/enums/DropType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/DropType.CURRENCY:Lext/mods/gameserver/enums/DropType;
    #8 = NameAndType        #9:#6         // CURRENCY:Lext/mods/gameserver/enums/DropType;
    #9 = Utf8               CURRENCY
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/DropType.DROP:Lext/mods/gameserver/enums/DropType;
   #11 = NameAndType        #12:#6        // DROP:Lext/mods/gameserver/enums/DropType;
   #12 = Utf8               DROP
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/DropType.HERB:Lext/mods/gameserver/enums/DropType;
   #14 = NameAndType        #15:#6        // HERB:Lext/mods/gameserver/enums/DropType;
   #15 = Utf8               HERB
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/DropType.SEALSTONE:Lext/mods/gameserver/enums/DropType;
   #17 = NameAndType        #18:#6        // SEALSTONE:Lext/mods/gameserver/enums/DropType;
   #18 = Utf8               SEALSTONE
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/DropType.$VALUES:[Lext/mods/gameserver/enums/DropType;
   #20 = NameAndType        #21:#22       // $VALUES:[Lext/mods/gameserver/enums/DropType;
   #21 = Utf8               $VALUES
   #22 = Utf8               [Lext/mods/gameserver/enums/DropType;
   #23 = Methodref          #24.#25       // "[Lext/mods/gameserver/enums/DropType;".clone:()Ljava/lang/Object;
   #24 = Class              #22           // "[Lext/mods/gameserver/enums/DropType;"
   #25 = NameAndType        #26:#27       // clone:()Ljava/lang/Object;
   #26 = Utf8               clone
   #27 = Utf8               ()Ljava/lang/Object;
   #28 = Methodref          #29.#30       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #29 = Class              #31           // java/lang/Enum
   #30 = NameAndType        #32:#33       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #31 = Utf8               java/lang/Enum
   #32 = Utf8               valueOf
   #33 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #34 = Methodref          #29.#35       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #35 = NameAndType        #36:#37       // "<init>":(Ljava/lang/String;I)V
   #36 = Utf8               <init>
   #37 = Utf8               (Ljava/lang/String;I)V
   #38 = Methodref          #1.#39        // ext/mods/gameserver/enums/DropType.ordinal:()I
   #39 = NameAndType        #40:#41       // ordinal:()I
   #40 = Utf8               ordinal
   #41 = Utf8               ()I
   #42 = Methodref          #43.#44       // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
   #43 = Class              #45           // ext/mods/gameserver/model/actor/Player
   #44 = NameAndType        #46:#41       // getPremiumService:()I
   #45 = Utf8               ext/mods/gameserver/model/actor/Player
   #46 = Utf8               getPremiumService
   #47 = Methodref          #48.#49       // ext/mods/gameserver/model/actor/Npc.isChampion:()Z
   #48 = Class              #50           // ext/mods/gameserver/model/actor/Npc
   #49 = NameAndType        #51:#52       // isChampion:()Z
   #50 = Utf8               ext/mods/gameserver/model/actor/Npc
   #51 = Utf8               isChampion
   #52 = Utf8               ()Z
   #53 = Fieldref           #54.#55       // ext/mods/Config.PREMIUM_CHAMPION_SPOIL_REWARDS:I
   #54 = Class              #56           // ext/mods/Config
   #55 = NameAndType        #57:#58       // PREMIUM_CHAMPION_SPOIL_REWARDS:I
   #56 = Utf8               ext/mods/Config
   #57 = Utf8               PREMIUM_CHAMPION_SPOIL_REWARDS
   #58 = Utf8               I
   #59 = Fieldref           #54.#60       // ext/mods/Config.CHAMPION_SPOIL_REWARDS:I
   #60 = NameAndType        #61:#58       // CHAMPION_SPOIL_REWARDS:I
   #61 = Utf8               CHAMPION_SPOIL_REWARDS
   #62 = Fieldref           #54.#63       // ext/mods/Config.PREMIUM_RATE_DROP_SPOIL:D
   #63 = NameAndType        #64:#65       // PREMIUM_RATE_DROP_SPOIL:D
   #64 = Utf8               PREMIUM_RATE_DROP_SPOIL
   #65 = Utf8               D
   #66 = Fieldref           #54.#67       // ext/mods/Config.RATE_DROP_SPOIL:D
   #67 = NameAndType        #68:#65       // RATE_DROP_SPOIL:D
   #68 = Utf8               RATE_DROP_SPOIL
   #69 = Fieldref           #54.#70       // ext/mods/Config.PREMIUM_CHAMPION_ADENAS_REWARDS:I
   #70 = NameAndType        #71:#58       // PREMIUM_CHAMPION_ADENAS_REWARDS:I
   #71 = Utf8               PREMIUM_CHAMPION_ADENAS_REWARDS
   #72 = Fieldref           #54.#73       // ext/mods/Config.CHAMPION_ADENAS_REWARDS:I
   #73 = NameAndType        #74:#58       // CHAMPION_ADENAS_REWARDS:I
   #74 = Utf8               CHAMPION_ADENAS_REWARDS
   #75 = Fieldref           #54.#76       // ext/mods/Config.PREMIUM_RATE_DROP_CURRENCY:D
   #76 = NameAndType        #77:#65       // PREMIUM_RATE_DROP_CURRENCY:D
   #77 = Utf8               PREMIUM_RATE_DROP_CURRENCY
   #78 = Fieldref           #54.#79       // ext/mods/Config.RATE_DROP_CURRENCY:D
   #79 = NameAndType        #80:#65       // RATE_DROP_CURRENCY:D
   #80 = Utf8               RATE_DROP_CURRENCY
   #81 = Fieldref           #54.#82       // ext/mods/Config.PREMIUM_CHAMPION_REWARDS:I
   #82 = NameAndType        #83:#58       // PREMIUM_CHAMPION_REWARDS:I
   #83 = Utf8               PREMIUM_CHAMPION_REWARDS
   #84 = Fieldref           #54.#85       // ext/mods/Config.CHAMPION_REWARDS:I
   #85 = NameAndType        #86:#58       // CHAMPION_REWARDS:I
   #86 = Utf8               CHAMPION_REWARDS
   #87 = Fieldref           #54.#88       // ext/mods/Config.PREMIUM_RATE_DROP_ITEMS_BY_GRAND:D
   #88 = NameAndType        #89:#65       // PREMIUM_RATE_DROP_ITEMS_BY_GRAND:D
   #89 = Utf8               PREMIUM_RATE_DROP_ITEMS_BY_GRAND
   #90 = Fieldref           #54.#91       // ext/mods/Config.PREMIUM_RATE_DROP_ITEMS_BY_RAID:D
   #91 = NameAndType        #92:#65       // PREMIUM_RATE_DROP_ITEMS_BY_RAID:D
   #92 = Utf8               PREMIUM_RATE_DROP_ITEMS_BY_RAID
   #93 = Fieldref           #54.#94       // ext/mods/Config.PREMIUM_RATE_DROP_ITEMS:D
   #94 = NameAndType        #95:#65       // PREMIUM_RATE_DROP_ITEMS:D
   #95 = Utf8               PREMIUM_RATE_DROP_ITEMS
   #96 = Fieldref           #54.#97       // ext/mods/Config.RATE_DROP_ITEMS_BY_GRAND:D
   #97 = NameAndType        #98:#65       // RATE_DROP_ITEMS_BY_GRAND:D
   #98 = Utf8               RATE_DROP_ITEMS_BY_GRAND
   #99 = Fieldref           #54.#100      // ext/mods/Config.RATE_DROP_ITEMS_BY_RAID:D
  #100 = NameAndType        #101:#65      // RATE_DROP_ITEMS_BY_RAID:D
  #101 = Utf8               RATE_DROP_ITEMS_BY_RAID
  #102 = Fieldref           #54.#103      // ext/mods/Config.RATE_DROP_ITEMS:D
  #103 = NameAndType        #104:#65      // RATE_DROP_ITEMS:D
  #104 = Utf8               RATE_DROP_ITEMS
  #105 = Fieldref           #54.#106      // ext/mods/Config.RATE_DROP_HERBS:D
  #106 = NameAndType        #107:#65      // RATE_DROP_HERBS:D
  #107 = Utf8               RATE_DROP_HERBS
  #108 = Fieldref           #54.#109      // ext/mods/Config.PREMIUM_CHAMPION_SEALSTONE_REWARDS:I
  #109 = NameAndType        #110:#58      // PREMIUM_CHAMPION_SEALSTONE_REWARDS:I
  #110 = Utf8               PREMIUM_CHAMPION_SEALSTONE_REWARDS
  #111 = Fieldref           #54.#112      // ext/mods/Config.CHAMPION_SEALSTONE_REWARDS:I
  #112 = NameAndType        #113:#58      // CHAMPION_SEALSTONE_REWARDS:I
  #113 = Utf8               CHAMPION_SEALSTONE_REWARDS
  #114 = Fieldref           #54.#115      // ext/mods/Config.PREMIUM_RATE_DROP_SEAL_STONE:D
  #115 = NameAndType        #116:#65      // PREMIUM_RATE_DROP_SEAL_STONE:D
  #116 = Utf8               PREMIUM_RATE_DROP_SEAL_STONE
  #117 = Fieldref           #54.#118      // ext/mods/Config.RATE_DROP_SEAL_STONE:D
  #118 = NameAndType        #119:#65      // RATE_DROP_SEAL_STONE:D
  #119 = Utf8               RATE_DROP_SEAL_STONE
  #120 = String             #5            // SPOIL
  #121 = Methodref          #1.#35        // ext/mods/gameserver/enums/DropType."<init>":(Ljava/lang/String;I)V
  #122 = String             #9            // CURRENCY
  #123 = String             #12           // DROP
  #124 = String             #15           // HERB
  #125 = String             #18           // SEALSTONE
  #126 = Methodref          #1.#127       // ext/mods/gameserver/enums/DropType.$values:()[Lext/mods/gameserver/enums/DropType;
  #127 = NameAndType        #128:#129     // $values:()[Lext/mods/gameserver/enums/DropType;
  #128 = Utf8               $values
  #129 = Utf8               ()[Lext/mods/gameserver/enums/DropType;
  #130 = Utf8               values
  #131 = Utf8               Code
  #132 = Utf8               LineNumberTable
  #133 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/DropType;
  #134 = Utf8               LocalVariableTable
  #135 = Utf8               name
  #136 = Utf8               Ljava/lang/String;
  #137 = Utf8               MethodParameters
  #138 = Utf8               this
  #139 = Utf8               Signature
  #140 = Utf8               ()V
  #141 = Utf8               getDropRate
  #142 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
  #143 = Utf8               player
  #144 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #145 = Utf8               npc
  #146 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #147 = Utf8               isRaid
  #148 = Utf8               Z
  #149 = Utf8               isGrand
  #150 = Utf8               StackMapTable
  #151 = Utf8               <clinit>
  #152 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/DropType;>;
  #153 = Utf8               SourceFile
  #154 = Utf8               DropType.java
{
  public static final ext.mods.gameserver.enums.DropType SPOIL;
    descriptor: Lext/mods/gameserver/enums/DropType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.DropType CURRENCY;
    descriptor: Lext/mods/gameserver/enums/DropType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.DropType DROP;
    descriptor: Lext/mods/gameserver/enums/DropType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.DropType HERB;
    descriptor: Lext/mods/gameserver/enums/DropType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.DropType SEALSTONE;
    descriptor: Lext/mods/gameserver/enums/DropType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.DropType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/DropType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/DropType;
         3: invokevirtual #23                 // Method "[Lext/mods/gameserver/enums/DropType;".clone:()Ljava/lang/Object;
         6: checkcast     #24                 // class "[Lext/mods/gameserver/enums/DropType;"
         9: areturn
      LineNumberTable:
        line 24: 0

  public static ext.mods.gameserver.enums.DropType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/DropType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/DropType
         2: aload_0
         3: invokestatic  #28                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/DropType
         9: areturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public double getDropRate(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Npc, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokevirtual #38                 // Method ordinal:()I
         4: tableswitch   { // 0 to 4

                       0: 40

                       1: 88

                       2: 136

                       3: 218

                       4: 222
                 default: 270
            }
        40: aload_1
        41: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
        44: iconst_1
        45: if_icmpne     60
        48: aload_2
        49: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
        52: ifeq          60
        55: getstatic     #53                 // Field ext/mods/Config.PREMIUM_CHAMPION_SPOIL_REWARDS:I
        58: i2d
        59: dreturn
        60: aload_2
        61: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
        64: ifeq          72
        67: getstatic     #59                 // Field ext/mods/Config.CHAMPION_SPOIL_REWARDS:I
        70: i2d
        71: dreturn
        72: aload_1
        73: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
        76: iconst_1
        77: if_icmpne     84
        80: getstatic     #62                 // Field ext/mods/Config.PREMIUM_RATE_DROP_SPOIL:D
        83: dreturn
        84: getstatic     #66                 // Field ext/mods/Config.RATE_DROP_SPOIL:D
        87: dreturn
        88: aload_1
        89: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
        92: iconst_1
        93: if_icmpne     108
        96: aload_2
        97: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
       100: ifeq          108
       103: getstatic     #69                 // Field ext/mods/Config.PREMIUM_CHAMPION_ADENAS_REWARDS:I
       106: i2d
       107: dreturn
       108: aload_2
       109: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
       112: ifeq          120
       115: getstatic     #72                 // Field ext/mods/Config.CHAMPION_ADENAS_REWARDS:I
       118: i2d
       119: dreturn
       120: aload_1
       121: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       124: iconst_1
       125: if_icmpne     132
       128: getstatic     #75                 // Field ext/mods/Config.PREMIUM_RATE_DROP_CURRENCY:D
       131: dreturn
       132: getstatic     #78                 // Field ext/mods/Config.RATE_DROP_CURRENCY:D
       135: dreturn
       136: aload_1
       137: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       140: iconst_1
       141: if_icmpne     156
       144: aload_2
       145: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
       148: ifeq          156
       151: getstatic     #81                 // Field ext/mods/Config.PREMIUM_CHAMPION_REWARDS:I
       154: i2d
       155: dreturn
       156: aload_2
       157: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
       160: ifeq          168
       163: getstatic     #84                 // Field ext/mods/Config.CHAMPION_REWARDS:I
       166: i2d
       167: dreturn
       168: aload_1
       169: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       172: iconst_1
       173: if_icmpne     197
       176: iload         4
       178: ifeq          185
       181: getstatic     #87                 // Field ext/mods/Config.PREMIUM_RATE_DROP_ITEMS_BY_GRAND:D
       184: dreturn
       185: iload_3
       186: ifeq          193
       189: getstatic     #90                 // Field ext/mods/Config.PREMIUM_RATE_DROP_ITEMS_BY_RAID:D
       192: dreturn
       193: getstatic     #93                 // Field ext/mods/Config.PREMIUM_RATE_DROP_ITEMS:D
       196: dreturn
       197: iload         4
       199: ifeq          206
       202: getstatic     #96                 // Field ext/mods/Config.RATE_DROP_ITEMS_BY_GRAND:D
       205: dreturn
       206: iload_3
       207: ifeq          214
       210: getstatic     #99                 // Field ext/mods/Config.RATE_DROP_ITEMS_BY_RAID:D
       213: dreturn
       214: getstatic     #102                // Field ext/mods/Config.RATE_DROP_ITEMS:D
       217: dreturn
       218: getstatic     #105                // Field ext/mods/Config.RATE_DROP_HERBS:D
       221: dreturn
       222: aload_1
       223: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       226: iconst_1
       227: if_icmpne     242
       230: aload_2
       231: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
       234: ifeq          242
       237: getstatic     #108                // Field ext/mods/Config.PREMIUM_CHAMPION_SEALSTONE_REWARDS:I
       240: i2d
       241: dreturn
       242: aload_2
       243: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
       246: ifeq          254
       249: getstatic     #111                // Field ext/mods/Config.CHAMPION_SEALSTONE_REWARDS:I
       252: i2d
       253: dreturn
       254: aload_1
       255: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       258: iconst_1
       259: if_icmpne     266
       262: getstatic     #114                // Field ext/mods/Config.PREMIUM_RATE_DROP_SEAL_STONE:D
       265: dreturn
       266: getstatic     #117                // Field ext/mods/Config.RATE_DROP_SEAL_STONE:D
       269: dreturn
       270: dconst_0
       271: dreturn
      LineNumberTable:
        line 34: 0
        line 37: 40
        line 38: 55
        line 39: 60
        line 40: 67
        line 42: 72
        line 43: 80
        line 45: 84
        line 48: 88
        line 49: 103
        line 50: 108
        line 51: 115
        line 53: 120
        line 54: 128
        line 56: 132
        line 59: 136
        line 60: 151
        line 61: 156
        line 62: 163
        line 64: 168
        line 66: 176
        line 67: 181
        line 69: 185
        line 70: 189
        line 72: 193
        line 76: 197
        line 77: 202
        line 79: 206
        line 80: 210
        line 82: 214
        line 86: 218
        line 89: 222
        line 90: 237
        line 91: 242
        line 92: 249
        line 94: 254
        line 95: 262
        line 97: 266
        line 100: 270
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     272     0  this   Lext/mods/gameserver/enums/DropType;
            0     272     1 player   Lext/mods/gameserver/model/actor/Player;
            0     272     2   npc   Lext/mods/gameserver/model/actor/Npc;
            0     272     3 isRaid   Z
            0     272     4 isGrand   Z
      StackMapTable: number_of_entries = 22
        frame_type = 40 /* same */
        frame_type = 19 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 3 /* same */
        frame_type = 19 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 3 /* same */
        frame_type = 19 /* same */
        frame_type = 11 /* same */
        frame_type = 16 /* same */
        frame_type = 7 /* same */
        frame_type = 3 /* same */
        frame_type = 8 /* same */
        frame_type = 7 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 19 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 3 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/DropType
         3: dup
         4: ldc           #120                // String SPOIL
         6: iconst_0
         7: invokespecial #121                // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field SPOIL:Lext/mods/gameserver/enums/DropType;
        13: new           #1                  // class ext/mods/gameserver/enums/DropType
        16: dup
        17: ldc           #122                // String CURRENCY
        19: iconst_1
        20: invokespecial #121                // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field CURRENCY:Lext/mods/gameserver/enums/DropType;
        26: new           #1                  // class ext/mods/gameserver/enums/DropType
        29: dup
        30: ldc           #123                // String DROP
        32: iconst_2
        33: invokespecial #121                // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field DROP:Lext/mods/gameserver/enums/DropType;
        39: new           #1                  // class ext/mods/gameserver/enums/DropType
        42: dup
        43: ldc           #124                // String HERB
        45: iconst_3
        46: invokespecial #121                // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field HERB:Lext/mods/gameserver/enums/DropType;
        52: new           #1                  // class ext/mods/gameserver/enums/DropType
        55: dup
        56: ldc           #125                // String SEALSTONE
        58: iconst_4
        59: invokespecial #121                // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field SEALSTONE:Lext/mods/gameserver/enums/DropType;
        65: invokestatic  #126                // Method $values:()[Lext/mods/gameserver/enums/DropType;
        68: putstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/DropType;
        71: return
      LineNumberTable:
        line 26: 0
        line 27: 13
        line 28: 26
        line 29: 39
        line 30: 52
        line 24: 65
}
Signature: #152                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/DropType;>;
SourceFile: "DropType.java"
