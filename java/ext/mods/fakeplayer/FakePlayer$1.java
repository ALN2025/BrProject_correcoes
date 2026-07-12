// Bytecode for: ext.mods.fakeplayer.FakePlayer$1
// File: ext\mods\fakeplayer\FakePlayer$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/FakePlayer$1.class
  Last modified 9 de jul de 2026; size 2213 bytes
  MD5 checksum 82a91166de73aa141656131c87063833
  Compiled from "FakePlayer.java"
class ext.mods.fakeplayer.FakePlayer$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/fakeplayer/FakePlayer$1
  super_class: #100                       // java/lang/Object
  interfaces: 0, fields: 3, methods: 1, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/enums/skills/EffectType.values:()[Lext/mods/gameserver/enums/skills/EffectType;
    #2 = Class              #4            // ext/mods/gameserver/enums/skills/EffectType
    #3 = NameAndType        #5:#6         // values:()[Lext/mods/gameserver/enums/skills/EffectType;
    #4 = Utf8               ext/mods/gameserver/enums/skills/EffectType
    #5 = Utf8               values
    #6 = Utf8               ()[Lext/mods/gameserver/enums/skills/EffectType;
    #7 = Fieldref           #8.#9         // ext/mods/fakeplayer/FakePlayer$1.$SwitchMap$ext$mods$gameserver$enums$skills$EffectType:[I
    #8 = Class              #10           // ext/mods/fakeplayer/FakePlayer$1
    #9 = NameAndType        #11:#12       // $SwitchMap$ext$mods$gameserver$enums$skills$EffectType:[I
   #10 = Utf8               ext/mods/fakeplayer/FakePlayer$1
   #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$EffectType
   #12 = Utf8               [I
   #13 = Fieldref           #2.#14        // ext/mods/gameserver/enums/skills/EffectType.SIGNET_GROUND:Lext/mods/gameserver/enums/skills/EffectType;
   #14 = NameAndType        #15:#16       // SIGNET_GROUND:Lext/mods/gameserver/enums/skills/EffectType;
   #15 = Utf8               SIGNET_GROUND
   #16 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
   #17 = Methodref          #2.#18        // ext/mods/gameserver/enums/skills/EffectType.ordinal:()I
   #18 = NameAndType        #19:#20       // ordinal:()I
   #19 = Utf8               ordinal
   #20 = Utf8               ()I
   #21 = Class              #22           // java/lang/NoSuchFieldError
   #22 = Utf8               java/lang/NoSuchFieldError
   #23 = Fieldref           #2.#24        // ext/mods/gameserver/enums/skills/EffectType.SIGNET_EFFECT:Lext/mods/gameserver/enums/skills/EffectType;
   #24 = NameAndType        #25:#16       // SIGNET_EFFECT:Lext/mods/gameserver/enums/skills/EffectType;
   #25 = Utf8               SIGNET_EFFECT
   #26 = Methodref          #27.#28       // ext/mods/gameserver/enums/skills/SkillType.values:()[Lext/mods/gameserver/enums/skills/SkillType;
   #27 = Class              #29           // ext/mods/gameserver/enums/skills/SkillType
   #28 = NameAndType        #5:#30        // values:()[Lext/mods/gameserver/enums/skills/SkillType;
   #29 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #30 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
   #31 = Fieldref           #8.#32        // ext/mods/fakeplayer/FakePlayer$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
   #32 = NameAndType        #33:#12       // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
   #33 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
   #34 = Fieldref           #27.#35       // ext/mods/gameserver/enums/skills/SkillType.BEAST_FEED:Lext/mods/gameserver/enums/skills/SkillType;
   #35 = NameAndType        #36:#37       // BEAST_FEED:Lext/mods/gameserver/enums/skills/SkillType;
   #36 = Utf8               BEAST_FEED
   #37 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #38 = Methodref          #27.#18       // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
   #39 = Fieldref           #27.#40       // ext/mods/gameserver/enums/skills/SkillType.DELUXE_KEY_UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
   #40 = NameAndType        #41:#37       // DELUXE_KEY_UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
   #41 = Utf8               DELUXE_KEY_UNLOCK
   #42 = Fieldref           #27.#43       // ext/mods/gameserver/enums/skills/SkillType.UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
   #43 = NameAndType        #44:#37       // UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
   #44 = Utf8               UNLOCK
   #45 = Methodref          #46.#47       // ext/mods/gameserver/enums/skills/SkillTargetType.values:()[Lext/mods/gameserver/enums/skills/SkillTargetType;
   #46 = Class              #48           // ext/mods/gameserver/enums/skills/SkillTargetType
   #47 = NameAndType        #5:#49        // values:()[Lext/mods/gameserver/enums/skills/SkillTargetType;
   #48 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #49 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillTargetType;
   #50 = Fieldref           #8.#51        // ext/mods/fakeplayer/FakePlayer$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
   #51 = NameAndType        #52:#12       // $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
   #52 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType
   #53 = Fieldref           #46.#54       // ext/mods/gameserver/enums/skills/SkillTargetType.AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #54 = NameAndType        #55:#56       // AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #55 = Utf8               AURA
   #56 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #57 = Methodref          #46.#18       // ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
   #58 = Fieldref           #46.#59       // ext/mods/gameserver/enums/skills/SkillTargetType.FRONT_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #59 = NameAndType        #60:#56       // FRONT_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #60 = Utf8               FRONT_AURA
   #61 = Fieldref           #46.#62       // ext/mods/gameserver/enums/skills/SkillTargetType.BEHIND_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #62 = NameAndType        #63:#56       // BEHIND_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #63 = Utf8               BEHIND_AURA
   #64 = Fieldref           #46.#65       // ext/mods/gameserver/enums/skills/SkillTargetType.AURA_UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #65 = NameAndType        #66:#56       // AURA_UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #66 = Utf8               AURA_UNDEAD
   #67 = Fieldref           #46.#68       // ext/mods/gameserver/enums/skills/SkillTargetType.PARTY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #68 = NameAndType        #69:#56       // PARTY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #69 = Utf8               PARTY
   #70 = Fieldref           #46.#71       // ext/mods/gameserver/enums/skills/SkillTargetType.ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #71 = NameAndType        #72:#56       // ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #72 = Utf8               ALLY
   #73 = Fieldref           #46.#74       // ext/mods/gameserver/enums/skills/SkillTargetType.CLAN:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #74 = NameAndType        #75:#56       // CLAN:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #75 = Utf8               CLAN
   #76 = Fieldref           #46.#77       // ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #77 = NameAndType        #78:#56       // GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #78 = Utf8               GROUND
   #79 = Fieldref           #46.#80       // ext/mods/gameserver/enums/skills/SkillTargetType.SELF:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #80 = NameAndType        #81:#56       // SELF:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #81 = Utf8               SELF
   #82 = Fieldref           #46.#83       // ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #83 = NameAndType        #84:#56       // CORPSE_ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #84 = Utf8               CORPSE_ALLY
   #85 = Fieldref           #46.#86       // ext/mods/gameserver/enums/skills/SkillTargetType.AREA_SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #86 = NameAndType        #87:#56       // AREA_SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #87 = Utf8               AREA_SUMMON
   #88 = Fieldref           #46.#89       // ext/mods/gameserver/enums/skills/SkillTargetType.OWNER_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #89 = NameAndType        #90:#56       // OWNER_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #90 = Utf8               OWNER_PET
   #91 = Fieldref           #46.#92       // ext/mods/gameserver/enums/skills/SkillTargetType.SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #92 = NameAndType        #93:#56       // SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #93 = Utf8               SUMMON
   #94 = Fieldref           #46.#95       // ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #95 = NameAndType        #96:#56       // CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #96 = Utf8               CORPSE_MOB
   #97 = Fieldref           #46.#98       // ext/mods/gameserver/enums/skills/SkillTargetType.AREA_CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #98 = NameAndType        #99:#56       // AREA_CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #99 = Utf8               AREA_CORPSE_MOB
  #100 = Class              #101          // java/lang/Object
  #101 = Utf8               java/lang/Object
  #102 = Utf8               <clinit>
  #103 = Utf8               ()V
  #104 = Utf8               Code
  #105 = Utf8               LineNumberTable
  #106 = Utf8               LocalVariableTable
  #107 = Utf8               StackMapTable
  #108 = Utf8               SourceFile
  #109 = Utf8               FakePlayer.java
  #110 = Utf8               EnclosingMethod
  #111 = Class              #112          // ext/mods/fakeplayer/FakePlayer
  #112 = Utf8               ext/mods/fakeplayer/FakePlayer
  #113 = Utf8               NestHost
  #114 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$skills$SkillType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$skills$EffectType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/skills/EffectType.values:()[Lext/mods/gameserver/enums/skills/EffectType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$EffectType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$EffectType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/skills/EffectType.SIGNET_GROUND:Lext/mods/gameserver/enums/skills/EffectType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/EffectType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$EffectType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/skills/EffectType.SIGNET_EFFECT:Lext/mods/gameserver/enums/skills/EffectType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/EffectType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: invokestatic  #26                 // Method ext/mods/gameserver/enums/skills/SkillType.values:()[Lext/mods/gameserver/enums/skills/SkillType;
        42: arraylength
        43: newarray       int
        45: putstatic     #31                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        48: getstatic     #31                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        51: getstatic     #34                 // Field ext/mods/gameserver/enums/skills/SkillType.BEAST_FEED:Lext/mods/gameserver/enums/skills/SkillType;
        54: invokevirtual #38                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        57: iconst_1
        58: iastore
        59: goto          63
        62: astore_0
        63: getstatic     #31                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        66: getstatic     #39                 // Field ext/mods/gameserver/enums/skills/SkillType.DELUXE_KEY_UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
        69: invokevirtual #38                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        72: iconst_2
        73: iastore
        74: goto          78
        77: astore_0
        78: getstatic     #31                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        81: getstatic     #42                 // Field ext/mods/gameserver/enums/skills/SkillType.UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
        84: invokevirtual #38                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        87: iconst_3
        88: iastore
        89: goto          93
        92: astore_0
        93: invokestatic  #45                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.values:()[Lext/mods/gameserver/enums/skills/SkillTargetType;
        96: arraylength
        97: newarray       int
        99: putstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       102: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       105: getstatic     #53                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
       108: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       111: iconst_1
       112: iastore
       113: goto          117
       116: astore_0
       117: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       120: getstatic     #58                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.FRONT_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
       123: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       126: iconst_2
       127: iastore
       128: goto          132
       131: astore_0
       132: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       135: getstatic     #61                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.BEHIND_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
       138: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       141: iconst_3
       142: iastore
       143: goto          147
       146: astore_0
       147: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       150: getstatic     #64                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.AURA_UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
       153: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       156: iconst_4
       157: iastore
       158: goto          162
       161: astore_0
       162: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       165: getstatic     #67                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.PARTY:Lext/mods/gameserver/enums/skills/SkillTargetType;
       168: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       171: iconst_5
       172: iastore
       173: goto          177
       176: astore_0
       177: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       180: getstatic     #70                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
       183: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       186: bipush        6
       188: iastore
       189: goto          193
       192: astore_0
       193: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       196: getstatic     #73                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.CLAN:Lext/mods/gameserver/enums/skills/SkillTargetType;
       199: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       202: bipush        7
       204: iastore
       205: goto          209
       208: astore_0
       209: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       212: getstatic     #76                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
       215: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       218: bipush        8
       220: iastore
       221: goto          225
       224: astore_0
       225: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       228: getstatic     #79                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.SELF:Lext/mods/gameserver/enums/skills/SkillTargetType;
       231: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       234: bipush        9
       236: iastore
       237: goto          241
       240: astore_0
       241: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       244: getstatic     #82                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
       247: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       250: bipush        10
       252: iastore
       253: goto          257
       256: astore_0
       257: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       260: getstatic     #85                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.AREA_SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
       263: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       266: bipush        11
       268: iastore
       269: goto          273
       272: astore_0
       273: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       276: getstatic     #88                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.OWNER_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
       279: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       282: bipush        12
       284: iastore
       285: goto          289
       288: astore_0
       289: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       292: getstatic     #91                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
       295: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       298: bipush        13
       300: iastore
       301: goto          305
       304: astore_0
       305: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       308: getstatic     #94                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
       311: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       314: bipush        14
       316: iastore
       317: goto          321
       320: astore_0
       321: getstatic     #50                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       324: getstatic     #97                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.AREA_CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
       327: invokevirtual #57                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       330: bipush        15
       332: iastore
       333: goto          337
       336: astore_0
       337: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            48    59    62   Class java/lang/NoSuchFieldError
            63    74    77   Class java/lang/NoSuchFieldError
            78    89    92   Class java/lang/NoSuchFieldError
           102   113   116   Class java/lang/NoSuchFieldError
           117   128   131   Class java/lang/NoSuchFieldError
           132   143   146   Class java/lang/NoSuchFieldError
           147   158   161   Class java/lang/NoSuchFieldError
           162   173   176   Class java/lang/NoSuchFieldError
           177   189   192   Class java/lang/NoSuchFieldError
           193   205   208   Class java/lang/NoSuchFieldError
           209   221   224   Class java/lang/NoSuchFieldError
           225   237   240   Class java/lang/NoSuchFieldError
           241   253   256   Class java/lang/NoSuchFieldError
           257   269   272   Class java/lang/NoSuchFieldError
           273   285   288   Class java/lang/NoSuchFieldError
           289   301   304   Class java/lang/NoSuchFieldError
           305   317   320   Class java/lang/NoSuchFieldError
           321   333   336   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 582: 0
        line 338: 39
        line 187: 93
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 40
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
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
}
SourceFile: "FakePlayer.java"
EnclosingMethod: #111.#0                // ext.mods.fakeplayer.FakePlayer
NestHost: class ext/mods/fakeplayer/FakePlayer
InnerClasses:
  static #8;                              // class ext/mods/fakeplayer/FakePlayer$1
