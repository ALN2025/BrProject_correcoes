// Bytecode for: ext.mods.gameserver.model.actor.cast.PlayerCast$1
// File: ext\mods\gameserver\model\actor\cast\PlayerCast$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/cast/PlayerCast$1.class
  Last modified 9 de jul de 2026; size 1541 bytes
  MD5 checksum 8af1ea294f6f7881dedbf1d144b34335
  Compiled from "PlayerCast.java"
class ext.mods.gameserver.model.actor.cast.PlayerCast$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/actor/cast/PlayerCast$1
  super_class: #66                        // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/skills/SkillType.values:()[Lext/mods/gameserver/enums/skills/SkillType;
   #2 = Class              #4             // ext/mods/gameserver/enums/skills/SkillType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/skills/SkillType;
   #4 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/cast/PlayerCast$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
   #8 = Class              #10            // ext/mods/gameserver/model/actor/cast/PlayerCast$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #10 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/skills/SkillType.SUMMON:Lext/mods/gameserver/enums/skills/SkillType;
  #14 = NameAndType        #15:#16        // SUMMON:Lext/mods/gameserver/enums/skills/SkillType;
  #15 = Utf8               SUMMON
  #16 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/skills/SkillType.RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
  #24 = NameAndType        #25:#16        // RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
  #25 = Utf8               RESURRECT
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/skills/SkillType.SPOIL:Lext/mods/gameserver/enums/skills/SkillType;
  #27 = NameAndType        #28:#16        // SPOIL:Lext/mods/gameserver/enums/skills/SkillType;
  #28 = Utf8               SPOIL
  #29 = Fieldref           #2.#30         // ext/mods/gameserver/enums/skills/SkillType.DRAIN_SOUL:Lext/mods/gameserver/enums/skills/SkillType;
  #30 = NameAndType        #31:#16        // DRAIN_SOUL:Lext/mods/gameserver/enums/skills/SkillType;
  #31 = Utf8               DRAIN_SOUL
  #32 = Fieldref           #2.#33         // ext/mods/gameserver/enums/skills/SkillType.SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #33 = NameAndType        #34:#16        // SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #34 = Utf8               SWEEP
  #35 = Fieldref           #2.#36         // ext/mods/gameserver/enums/skills/SkillType.TAKE_CASTLE:Lext/mods/gameserver/enums/skills/SkillType;
  #36 = NameAndType        #37:#16        // TAKE_CASTLE:Lext/mods/gameserver/enums/skills/SkillType;
  #37 = Utf8               TAKE_CASTLE
  #38 = Fieldref           #2.#39         // ext/mods/gameserver/enums/skills/SkillType.SIEGE_FLAG:Lext/mods/gameserver/enums/skills/SkillType;
  #39 = NameAndType        #40:#16        // SIEGE_FLAG:Lext/mods/gameserver/enums/skills/SkillType;
  #40 = Utf8               SIEGE_FLAG
  #41 = Fieldref           #2.#42         // ext/mods/gameserver/enums/skills/SkillType.STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/enums/skills/SkillType;
  #42 = NameAndType        #43:#16        // STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/enums/skills/SkillType;
  #43 = Utf8               STRIDER_SIEGE_ASSAULT
  #44 = Fieldref           #2.#45         // ext/mods/gameserver/enums/skills/SkillType.SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
  #45 = NameAndType        #46:#16        // SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
  #46 = Utf8               SUMMON_FRIEND
  #47 = Methodref          #48.#49        // ext/mods/gameserver/enums/SiegeSide.values:()[Lext/mods/gameserver/enums/SiegeSide;
  #48 = Class              #50            // ext/mods/gameserver/enums/SiegeSide
  #49 = NameAndType        #5:#51         // values:()[Lext/mods/gameserver/enums/SiegeSide;
  #50 = Utf8               ext/mods/gameserver/enums/SiegeSide
  #51 = Utf8               ()[Lext/mods/gameserver/enums/SiegeSide;
  #52 = Fieldref           #8.#53         // ext/mods/gameserver/model/actor/cast/PlayerCast$1.$SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
  #53 = NameAndType        #54:#12        // $SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
  #54 = Utf8               $SwitchMap$ext$mods$gameserver$enums$SiegeSide
  #55 = Fieldref           #48.#56        // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
  #56 = NameAndType        #57:#58        // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
  #57 = Utf8               DEFENDER
  #58 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
  #59 = Methodref          #48.#18        // ext/mods/gameserver/enums/SiegeSide.ordinal:()I
  #60 = Fieldref           #48.#61        // ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
  #61 = NameAndType        #62:#58        // OWNER:Lext/mods/gameserver/enums/SiegeSide;
  #62 = Utf8               OWNER
  #63 = Fieldref           #48.#64        // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #64 = NameAndType        #65:#58        // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #65 = Utf8               ATTACKER
  #66 = Class              #67            // java/lang/Object
  #67 = Utf8               java/lang/Object
  #68 = Utf8               <clinit>
  #69 = Utf8               ()V
  #70 = Utf8               Code
  #71 = Utf8               LineNumberTable
  #72 = Utf8               LocalVariableTable
  #73 = Utf8               StackMapTable
  #74 = Utf8               SourceFile
  #75 = Utf8               PlayerCast.java
  #76 = Utf8               EnclosingMethod
  #77 = Class              #78            // ext/mods/gameserver/model/actor/cast/PlayerCast
  #78 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #79 = Utf8               NestHost
  #80 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$SiegeSide;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$skills$SkillType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/skills/SkillType.values:()[Lext/mods/gameserver/enums/skills/SkillType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/skills/SkillType.SUMMON:Lext/mods/gameserver/enums/skills/SkillType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/skills/SkillType.RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/skills/SkillType.SPOIL:Lext/mods/gameserver/enums/skills/SkillType;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/skills/SkillType.DRAIN_SOUL:Lext/mods/gameserver/enums/skills/SkillType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        63: iconst_4
        64: iastore
        65: goto          69
        68: astore_0
        69: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        72: getstatic     #32                 // Field ext/mods/gameserver/enums/skills/SkillType.SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
        75: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        78: iconst_5
        79: iastore
        80: goto          84
        83: astore_0
        84: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        87: getstatic     #35                 // Field ext/mods/gameserver/enums/skills/SkillType.TAKE_CASTLE:Lext/mods/gameserver/enums/skills/SkillType;
        90: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        93: bipush        6
        95: iastore
        96: goto          100
        99: astore_0
       100: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       103: getstatic     #38                 // Field ext/mods/gameserver/enums/skills/SkillType.SIEGE_FLAG:Lext/mods/gameserver/enums/skills/SkillType;
       106: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       109: bipush        7
       111: iastore
       112: goto          116
       115: astore_0
       116: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       119: getstatic     #41                 // Field ext/mods/gameserver/enums/skills/SkillType.STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/enums/skills/SkillType;
       122: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       125: bipush        8
       127: iastore
       128: goto          132
       131: astore_0
       132: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       135: getstatic     #44                 // Field ext/mods/gameserver/enums/skills/SkillType.SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
       138: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       141: bipush        9
       143: iastore
       144: goto          148
       147: astore_0
       148: invokestatic  #47                 // Method ext/mods/gameserver/enums/SiegeSide.values:()[Lext/mods/gameserver/enums/SiegeSide;
       151: arraylength
       152: newarray       int
       154: putstatic     #52                 // Field $SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
       157: getstatic     #52                 // Field $SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
       160: getstatic     #55                 // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
       163: invokevirtual #59                 // Method ext/mods/gameserver/enums/SiegeSide.ordinal:()I
       166: iconst_1
       167: iastore
       168: goto          172
       171: astore_0
       172: getstatic     #52                 // Field $SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
       175: getstatic     #60                 // Field ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
       178: invokevirtual #59                 // Method ext/mods/gameserver/enums/SiegeSide.ordinal:()I
       181: iconst_2
       182: iastore
       183: goto          187
       186: astore_0
       187: getstatic     #52                 // Field $SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
       190: getstatic     #63                 // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
       193: invokevirtual #59                 // Method ext/mods/gameserver/enums/SiegeSide.ordinal:()I
       196: iconst_3
       197: iastore
       198: goto          202
       201: astore_0
       202: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
            54    65    68   Class java/lang/NoSuchFieldError
            69    80    83   Class java/lang/NoSuchFieldError
            84    96    99   Class java/lang/NoSuchFieldError
           100   112   115   Class java/lang/NoSuchFieldError
           116   128   131   Class java/lang/NoSuchFieldError
           132   144   147   Class java/lang/NoSuchFieldError
           157   168   171   Class java/lang/NoSuchFieldError
           172   183   186   Class java/lang/NoSuchFieldError
           187   198   201   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 282: 0
        line 317: 148
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 24
        frame_type = 87 /* same_locals_1_stack_item */
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
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
SourceFile: "PlayerCast.java"
EnclosingMethod: #77.#0                 // ext.mods.gameserver.model.actor.cast.PlayerCast
NestHost: class ext/mods/gameserver/model/actor/cast/PlayerCast
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/actor/cast/PlayerCast$1
