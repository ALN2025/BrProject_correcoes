// Bytecode for: ext.mods.gameserver.model.entity.autofarm.Util$1
// File: ext\mods\gameserver\model\entity\autofarm\Util$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/Util$1.class
  Last modified 9 de jul de 2026; size 1898 bytes
  MD5 checksum b4de6caf88b27a3067d8c62eaf36ac0f
  Compiled from "Util.java"
class ext.mods.gameserver.model.entity.autofarm.Util$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/entity/autofarm/Util$1
  super_class: #83                        // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/skills/SkillTargetType.values:()[Lext/mods/gameserver/enums/skills/SkillTargetType;
   #2 = Class              #4             // ext/mods/gameserver/enums/skills/SkillTargetType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/skills/SkillTargetType;
   #4 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillTargetType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/entity/autofarm/Util$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
   #8 = Class              #10            // ext/mods/gameserver/model/entity/autofarm/Util$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
  #10 = Utf8               ext/mods/gameserver/model/entity/autofarm/Util$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/skills/SkillTargetType.SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #14 = NameAndType        #15:#16        // SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #15 = Utf8               SUMMON
  #16 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Methodref          #24.#25        // ext/mods/gameserver/enums/skills/SkillType.values:()[Lext/mods/gameserver/enums/skills/SkillType;
  #24 = Class              #26            // ext/mods/gameserver/enums/skills/SkillType
  #25 = NameAndType        #5:#27         // values:()[Lext/mods/gameserver/enums/skills/SkillType;
  #26 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #27 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #28 = Fieldref           #8.#29         // ext/mods/gameserver/model/entity/autofarm/Util$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #29 = NameAndType        #30:#12        // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #30 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
  #31 = Fieldref           #24.#32        // ext/mods/gameserver/enums/skills/SkillType.SUMMON:Lext/mods/gameserver/enums/skills/SkillType;
  #32 = NameAndType        #15:#33        // SUMMON:Lext/mods/gameserver/enums/skills/SkillType;
  #33 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #34 = Methodref          #24.#18        // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
  #35 = Fieldref           #24.#36        // ext/mods/gameserver/enums/skills/SkillType.SUMMON_CREATURE:Lext/mods/gameserver/enums/skills/SkillType;
  #36 = NameAndType        #37:#33        // SUMMON_CREATURE:Lext/mods/gameserver/enums/skills/SkillType;
  #37 = Utf8               SUMMON_CREATURE
  #38 = Fieldref           #24.#39        // ext/mods/gameserver/enums/skills/SkillType.SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
  #39 = NameAndType        #40:#33        // SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
  #40 = Utf8               SUMMON_FRIEND
  #41 = Fieldref           #24.#42        // ext/mods/gameserver/enums/skills/SkillType.SUMMON_PARTY:Lext/mods/gameserver/enums/skills/SkillType;
  #42 = NameAndType        #43:#33        // SUMMON_PARTY:Lext/mods/gameserver/enums/skills/SkillType;
  #43 = Utf8               SUMMON_PARTY
  #44 = Fieldref           #24.#45        // ext/mods/gameserver/enums/skills/SkillType.COMMON_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
  #45 = NameAndType        #46:#33        // COMMON_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
  #46 = Utf8               COMMON_CRAFT
  #47 = Fieldref           #24.#48        // ext/mods/gameserver/enums/skills/SkillType.DWARVEN_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
  #48 = NameAndType        #49:#33        // DWARVEN_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
  #49 = Utf8               DWARVEN_CRAFT
  #50 = Fieldref           #24.#51        // ext/mods/gameserver/enums/skills/SkillType.TELEPORT:Lext/mods/gameserver/enums/skills/SkillType;
  #51 = NameAndType        #52:#33        // TELEPORT:Lext/mods/gameserver/enums/skills/SkillType;
  #52 = Utf8               TELEPORT
  #53 = Fieldref           #24.#54        // ext/mods/gameserver/enums/skills/SkillType.RECALL:Lext/mods/gameserver/enums/skills/SkillType;
  #54 = NameAndType        #55:#33        // RECALL:Lext/mods/gameserver/enums/skills/SkillType;
  #55 = Utf8               RECALL
  #56 = Fieldref           #24.#57        // ext/mods/gameserver/enums/skills/SkillType.RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
  #57 = NameAndType        #58:#33        // RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
  #58 = Utf8               RESURRECT
  #59 = Fieldref           #24.#60        // ext/mods/gameserver/enums/skills/SkillType.TAKE_CASTLE:Lext/mods/gameserver/enums/skills/SkillType;
  #60 = NameAndType        #61:#33        // TAKE_CASTLE:Lext/mods/gameserver/enums/skills/SkillType;
  #61 = Utf8               TAKE_CASTLE
  #62 = Fieldref           #24.#63        // ext/mods/gameserver/enums/skills/SkillType.SIEGE_FLAG:Lext/mods/gameserver/enums/skills/SkillType;
  #63 = NameAndType        #64:#33        // SIEGE_FLAG:Lext/mods/gameserver/enums/skills/SkillType;
  #64 = Utf8               SIEGE_FLAG
  #65 = Fieldref           #24.#66        // ext/mods/gameserver/enums/skills/SkillType.SEED:Lext/mods/gameserver/enums/skills/SkillType;
  #66 = NameAndType        #67:#33        // SEED:Lext/mods/gameserver/enums/skills/SkillType;
  #67 = Utf8               SEED
  #68 = Fieldref           #24.#69        // ext/mods/gameserver/enums/skills/SkillType.SIGNET:Lext/mods/gameserver/enums/skills/SkillType;
  #69 = NameAndType        #70:#33        // SIGNET:Lext/mods/gameserver/enums/skills/SkillType;
  #70 = Utf8               SIGNET
  #71 = Fieldref           #24.#72        // ext/mods/gameserver/enums/skills/SkillType.SIGNET_CASTTIME:Lext/mods/gameserver/enums/skills/SkillType;
  #72 = NameAndType        #73:#33        // SIGNET_CASTTIME:Lext/mods/gameserver/enums/skills/SkillType;
  #73 = Utf8               SIGNET_CASTTIME
  #74 = Fieldref           #24.#75        // ext/mods/gameserver/enums/skills/SkillType.FUSION:Lext/mods/gameserver/enums/skills/SkillType;
  #75 = NameAndType        #76:#33        // FUSION:Lext/mods/gameserver/enums/skills/SkillType;
  #76 = Utf8               FUSION
  #77 = Fieldref           #24.#78        // ext/mods/gameserver/enums/skills/SkillType.STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/enums/skills/SkillType;
  #78 = NameAndType        #79:#33        // STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/enums/skills/SkillType;
  #79 = Utf8               STRIDER_SIEGE_ASSAULT
  #80 = Fieldref           #24.#81        // ext/mods/gameserver/enums/skills/SkillType.UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
  #81 = NameAndType        #82:#33        // UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
  #82 = Utf8               UNLOCK
  #83 = Class              #84            // java/lang/Object
  #84 = Utf8               java/lang/Object
  #85 = Utf8               <clinit>
  #86 = Utf8               ()V
  #87 = Utf8               Code
  #88 = Utf8               LineNumberTable
  #89 = Utf8               LocalVariableTable
  #90 = Utf8               StackMapTable
  #91 = Utf8               SourceFile
  #92 = Utf8               Util.java
  #93 = Utf8               EnclosingMethod
  #94 = Class              #95            // ext/mods/gameserver/model/entity/autofarm/Util
  #95 = Utf8               ext/mods/gameserver/model/entity/autofarm/Util
  #96 = Utf8               NestHost
  #97 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$skills$SkillType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/skills/SkillTargetType.values:()[Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: invokestatic  #23                 // Method ext/mods/gameserver/enums/skills/SkillType.values:()[Lext/mods/gameserver/enums/skills/SkillType;
        27: arraylength
        28: newarray       int
        30: putstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        33: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        36: getstatic     #31                 // Field ext/mods/gameserver/enums/skills/SkillType.SUMMON:Lext/mods/gameserver/enums/skills/SkillType;
        39: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        42: iconst_1
        43: iastore
        44: goto          48
        47: astore_0
        48: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        51: getstatic     #35                 // Field ext/mods/gameserver/enums/skills/SkillType.SUMMON_CREATURE:Lext/mods/gameserver/enums/skills/SkillType;
        54: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        57: iconst_2
        58: iastore
        59: goto          63
        62: astore_0
        63: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        66: getstatic     #38                 // Field ext/mods/gameserver/enums/skills/SkillType.SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
        69: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        72: iconst_3
        73: iastore
        74: goto          78
        77: astore_0
        78: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        81: getstatic     #41                 // Field ext/mods/gameserver/enums/skills/SkillType.SUMMON_PARTY:Lext/mods/gameserver/enums/skills/SkillType;
        84: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        87: iconst_4
        88: iastore
        89: goto          93
        92: astore_0
        93: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        96: getstatic     #44                 // Field ext/mods/gameserver/enums/skills/SkillType.COMMON_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
        99: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       102: iconst_5
       103: iastore
       104: goto          108
       107: astore_0
       108: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       111: getstatic     #47                 // Field ext/mods/gameserver/enums/skills/SkillType.DWARVEN_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
       114: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       117: bipush        6
       119: iastore
       120: goto          124
       123: astore_0
       124: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       127: getstatic     #50                 // Field ext/mods/gameserver/enums/skills/SkillType.TELEPORT:Lext/mods/gameserver/enums/skills/SkillType;
       130: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       133: bipush        7
       135: iastore
       136: goto          140
       139: astore_0
       140: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       143: getstatic     #53                 // Field ext/mods/gameserver/enums/skills/SkillType.RECALL:Lext/mods/gameserver/enums/skills/SkillType;
       146: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       149: bipush        8
       151: iastore
       152: goto          156
       155: astore_0
       156: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       159: getstatic     #56                 // Field ext/mods/gameserver/enums/skills/SkillType.RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
       162: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       165: bipush        9
       167: iastore
       168: goto          172
       171: astore_0
       172: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       175: getstatic     #59                 // Field ext/mods/gameserver/enums/skills/SkillType.TAKE_CASTLE:Lext/mods/gameserver/enums/skills/SkillType;
       178: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       181: bipush        10
       183: iastore
       184: goto          188
       187: astore_0
       188: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       191: getstatic     #62                 // Field ext/mods/gameserver/enums/skills/SkillType.SIEGE_FLAG:Lext/mods/gameserver/enums/skills/SkillType;
       194: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       197: bipush        11
       199: iastore
       200: goto          204
       203: astore_0
       204: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       207: getstatic     #65                 // Field ext/mods/gameserver/enums/skills/SkillType.SEED:Lext/mods/gameserver/enums/skills/SkillType;
       210: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       213: bipush        12
       215: iastore
       216: goto          220
       219: astore_0
       220: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       223: getstatic     #68                 // Field ext/mods/gameserver/enums/skills/SkillType.SIGNET:Lext/mods/gameserver/enums/skills/SkillType;
       226: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       229: bipush        13
       231: iastore
       232: goto          236
       235: astore_0
       236: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       239: getstatic     #71                 // Field ext/mods/gameserver/enums/skills/SkillType.SIGNET_CASTTIME:Lext/mods/gameserver/enums/skills/SkillType;
       242: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       245: bipush        14
       247: iastore
       248: goto          252
       251: astore_0
       252: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       255: getstatic     #74                 // Field ext/mods/gameserver/enums/skills/SkillType.FUSION:Lext/mods/gameserver/enums/skills/SkillType;
       258: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       261: bipush        15
       263: iastore
       264: goto          268
       267: astore_0
       268: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       271: getstatic     #77                 // Field ext/mods/gameserver/enums/skills/SkillType.STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/enums/skills/SkillType;
       274: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       277: bipush        16
       279: iastore
       280: goto          284
       283: astore_0
       284: getstatic     #28                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       287: getstatic     #80                 // Field ext/mods/gameserver/enums/skills/SkillType.UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
       290: invokevirtual #34                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       293: bipush        17
       295: iastore
       296: goto          300
       299: astore_0
       300: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            33    44    47   Class java/lang/NoSuchFieldError
            48    59    62   Class java/lang/NoSuchFieldError
            63    74    77   Class java/lang/NoSuchFieldError
            78    89    92   Class java/lang/NoSuchFieldError
            93   104   107   Class java/lang/NoSuchFieldError
           108   120   123   Class java/lang/NoSuchFieldError
           124   136   139   Class java/lang/NoSuchFieldError
           140   152   155   Class java/lang/NoSuchFieldError
           156   168   171   Class java/lang/NoSuchFieldError
           172   184   187   Class java/lang/NoSuchFieldError
           188   200   203   Class java/lang/NoSuchFieldError
           204   216   219   Class java/lang/NoSuchFieldError
           220   232   235   Class java/lang/NoSuchFieldError
           236   248   251   Class java/lang/NoSuchFieldError
           252   264   267   Class java/lang/NoSuchFieldError
           268   280   283   Class java/lang/NoSuchFieldError
           284   296   299   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 76: 0
        line 54: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 36
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
SourceFile: "Util.java"
EnclosingMethod: #94.#0                 // ext.mods.gameserver.model.entity.autofarm.Util
NestHost: class ext/mods/gameserver/model/entity/autofarm/Util
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/entity/autofarm/Util$1
