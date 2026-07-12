// Bytecode for: ext.mods.gameserver.model.actor.Player$4
// File: ext\mods\gameserver\model\actor\Player$4.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/Player$4.class
  Last modified 9 de jul de 2026; size 2441 bytes
  MD5 checksum 81f211346469545f2b6caf0eb19bb063
  Compiled from "Player.java"
class ext.mods.gameserver.model.actor.Player$4
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/actor/Player$4
  super_class: #104                       // java/lang/Object
  interfaces: 0, fields: 5, methods: 1, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/enums/PrivateStoreType.values:()[Lext/mods/gameserver/enums/PrivateStoreType;
    #2 = Class              #4            // ext/mods/gameserver/enums/PrivateStoreType
    #3 = NameAndType        #5:#6         // values:()[Lext/mods/gameserver/enums/PrivateStoreType;
    #4 = Utf8               ext/mods/gameserver/enums/PrivateStoreType
    #5 = Utf8               values
    #6 = Utf8               ()[Lext/mods/gameserver/enums/PrivateStoreType;
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/Player$4.$SwitchMap$ext$mods$gameserver$enums$PrivateStoreType:[I
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player$4
    #9 = NameAndType        #11:#12       // $SwitchMap$ext$mods$gameserver$enums$PrivateStoreType:[I
   #10 = Utf8               ext/mods/gameserver/model/actor/Player$4
   #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$PrivateStoreType
   #12 = Utf8               [I
   #13 = Fieldref           #2.#14        // ext/mods/gameserver/enums/PrivateStoreType.NONE:Lext/mods/gameserver/enums/PrivateStoreType;
   #14 = NameAndType        #15:#16       // NONE:Lext/mods/gameserver/enums/PrivateStoreType;
   #15 = Utf8               NONE
   #16 = Utf8               Lext/mods/gameserver/enums/PrivateStoreType;
   #17 = Methodref          #2.#18        // ext/mods/gameserver/enums/PrivateStoreType.ordinal:()I
   #18 = NameAndType        #19:#20       // ordinal:()I
   #19 = Utf8               ordinal
   #20 = Utf8               ()I
   #21 = Class              #22           // java/lang/NoSuchFieldError
   #22 = Utf8               java/lang/NoSuchFieldError
   #23 = Fieldref           #2.#24        // ext/mods/gameserver/enums/PrivateStoreType.SELL:Lext/mods/gameserver/enums/PrivateStoreType;
   #24 = NameAndType        #25:#16       // SELL:Lext/mods/gameserver/enums/PrivateStoreType;
   #25 = Utf8               SELL
   #26 = Fieldref           #2.#27        // ext/mods/gameserver/enums/PrivateStoreType.PACKAGE_SELL:Lext/mods/gameserver/enums/PrivateStoreType;
   #27 = NameAndType        #28:#16       // PACKAGE_SELL:Lext/mods/gameserver/enums/PrivateStoreType;
   #28 = Utf8               PACKAGE_SELL
   #29 = Fieldref           #2.#30        // ext/mods/gameserver/enums/PrivateStoreType.BUY:Lext/mods/gameserver/enums/PrivateStoreType;
   #30 = NameAndType        #31:#16       // BUY:Lext/mods/gameserver/enums/PrivateStoreType;
   #31 = Utf8               BUY
   #32 = Fieldref           #2.#33        // ext/mods/gameserver/enums/PrivateStoreType.MANUFACTURE:Lext/mods/gameserver/enums/PrivateStoreType;
   #33 = NameAndType        #34:#16       // MANUFACTURE:Lext/mods/gameserver/enums/PrivateStoreType;
   #34 = Utf8               MANUFACTURE
   #35 = Methodref          #36.#37       // ext/mods/dressme/holder/DressMeVisualType.values:()[Lext/mods/dressme/holder/DressMeVisualType;
   #36 = Class              #38           // ext/mods/dressme/holder/DressMeVisualType
   #37 = NameAndType        #5:#39        // values:()[Lext/mods/dressme/holder/DressMeVisualType;
   #38 = Utf8               ext/mods/dressme/holder/DressMeVisualType
   #39 = Utf8               ()[Lext/mods/dressme/holder/DressMeVisualType;
   #40 = Fieldref           #8.#41        // ext/mods/gameserver/model/actor/Player$4.$SwitchMap$ext$mods$dressme$holder$DressMeVisualType:[I
   #41 = NameAndType        #42:#12       // $SwitchMap$ext$mods$dressme$holder$DressMeVisualType:[I
   #42 = Utf8               $SwitchMap$ext$mods$dressme$holder$DressMeVisualType
   #43 = Fieldref           #36.#44       // ext/mods/dressme/holder/DressMeVisualType.ARMOR:Lext/mods/dressme/holder/DressMeVisualType;
   #44 = NameAndType        #45:#46       // ARMOR:Lext/mods/dressme/holder/DressMeVisualType;
   #45 = Utf8               ARMOR
   #46 = Utf8               Lext/mods/dressme/holder/DressMeVisualType;
   #47 = Methodref          #36.#18       // ext/mods/dressme/holder/DressMeVisualType.ordinal:()I
   #48 = Fieldref           #36.#49       // ext/mods/dressme/holder/DressMeVisualType.CLOAK:Lext/mods/dressme/holder/DressMeVisualType;
   #49 = NameAndType        #50:#46       // CLOAK:Lext/mods/dressme/holder/DressMeVisualType;
   #50 = Utf8               CLOAK
   #51 = Fieldref           #36.#52       // ext/mods/dressme/holder/DressMeVisualType.WEAPON:Lext/mods/dressme/holder/DressMeVisualType;
   #52 = NameAndType        #53:#46       // WEAPON:Lext/mods/dressme/holder/DressMeVisualType;
   #53 = Utf8               WEAPON
   #54 = Methodref          #55.#56       // ext/mods/gameserver/enums/actors/OperateType.values:()[Lext/mods/gameserver/enums/actors/OperateType;
   #55 = Class              #57           // ext/mods/gameserver/enums/actors/OperateType
   #56 = NameAndType        #5:#58        // values:()[Lext/mods/gameserver/enums/actors/OperateType;
   #57 = Utf8               ext/mods/gameserver/enums/actors/OperateType
   #58 = Utf8               ()[Lext/mods/gameserver/enums/actors/OperateType;
   #59 = Fieldref           #8.#60        // ext/mods/gameserver/model/actor/Player$4.$SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
   #60 = NameAndType        #61:#12       // $SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
   #61 = Utf8               $SwitchMap$ext$mods$gameserver$enums$actors$OperateType
   #62 = Fieldref           #55.#63       // ext/mods/gameserver/enums/actors/OperateType.SELL:Lext/mods/gameserver/enums/actors/OperateType;
   #63 = NameAndType        #25:#64       // SELL:Lext/mods/gameserver/enums/actors/OperateType;
   #64 = Utf8               Lext/mods/gameserver/enums/actors/OperateType;
   #65 = Methodref          #55.#18       // ext/mods/gameserver/enums/actors/OperateType.ordinal:()I
   #66 = Fieldref           #55.#67       // ext/mods/gameserver/enums/actors/OperateType.PACKAGE_SELL:Lext/mods/gameserver/enums/actors/OperateType;
   #67 = NameAndType        #28:#64       // PACKAGE_SELL:Lext/mods/gameserver/enums/actors/OperateType;
   #68 = Fieldref           #55.#69       // ext/mods/gameserver/enums/actors/OperateType.BUY:Lext/mods/gameserver/enums/actors/OperateType;
   #69 = NameAndType        #31:#64       // BUY:Lext/mods/gameserver/enums/actors/OperateType;
   #70 = Fieldref           #55.#71       // ext/mods/gameserver/enums/actors/OperateType.MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
   #71 = NameAndType        #34:#64       // MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
   #72 = Methodref          #73.#74       // ext/mods/gameserver/enums/skills/EffectType.values:()[Lext/mods/gameserver/enums/skills/EffectType;
   #73 = Class              #75           // ext/mods/gameserver/enums/skills/EffectType
   #74 = NameAndType        #5:#76        // values:()[Lext/mods/gameserver/enums/skills/EffectType;
   #75 = Utf8               ext/mods/gameserver/enums/skills/EffectType
   #76 = Utf8               ()[Lext/mods/gameserver/enums/skills/EffectType;
   #77 = Fieldref           #8.#78        // ext/mods/gameserver/model/actor/Player$4.$SwitchMap$ext$mods$gameserver$enums$skills$EffectType:[I
   #78 = NameAndType        #79:#12       // $SwitchMap$ext$mods$gameserver$enums$skills$EffectType:[I
   #79 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$EffectType
   #80 = Fieldref           #73.#81       // ext/mods/gameserver/enums/skills/EffectType.SIGNET_GROUND:Lext/mods/gameserver/enums/skills/EffectType;
   #81 = NameAndType        #82:#83       // SIGNET_GROUND:Lext/mods/gameserver/enums/skills/EffectType;
   #82 = Utf8               SIGNET_GROUND
   #83 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
   #84 = Methodref          #73.#18       // ext/mods/gameserver/enums/skills/EffectType.ordinal:()I
   #85 = Fieldref           #73.#86       // ext/mods/gameserver/enums/skills/EffectType.SIGNET_EFFECT:Lext/mods/gameserver/enums/skills/EffectType;
   #86 = NameAndType        #87:#83       // SIGNET_EFFECT:Lext/mods/gameserver/enums/skills/EffectType;
   #87 = Utf8               SIGNET_EFFECT
   #88 = Methodref          #89.#90       // ext/mods/gameserver/enums/items/ActionType.values:()[Lext/mods/gameserver/enums/items/ActionType;
   #89 = Class              #91           // ext/mods/gameserver/enums/items/ActionType
   #90 = NameAndType        #5:#92        // values:()[Lext/mods/gameserver/enums/items/ActionType;
   #91 = Utf8               ext/mods/gameserver/enums/items/ActionType
   #92 = Utf8               ()[Lext/mods/gameserver/enums/items/ActionType;
   #93 = Fieldref           #8.#94        // ext/mods/gameserver/model/actor/Player$4.$SwitchMap$ext$mods$gameserver$enums$items$ActionType:[I
   #94 = NameAndType        #95:#12       // $SwitchMap$ext$mods$gameserver$enums$items$ActionType:[I
   #95 = Utf8               $SwitchMap$ext$mods$gameserver$enums$items$ActionType
   #96 = Fieldref           #89.#97       // ext/mods/gameserver/enums/items/ActionType.summon_soulshot:Lext/mods/gameserver/enums/items/ActionType;
   #97 = NameAndType        #98:#99       // summon_soulshot:Lext/mods/gameserver/enums/items/ActionType;
   #98 = Utf8               summon_soulshot
   #99 = Utf8               Lext/mods/gameserver/enums/items/ActionType;
  #100 = Methodref          #89.#18       // ext/mods/gameserver/enums/items/ActionType.ordinal:()I
  #101 = Fieldref           #89.#102      // ext/mods/gameserver/enums/items/ActionType.summon_spiritshot:Lext/mods/gameserver/enums/items/ActionType;
  #102 = NameAndType        #103:#99      // summon_spiritshot:Lext/mods/gameserver/enums/items/ActionType;
  #103 = Utf8               summon_spiritshot
  #104 = Class              #105          // java/lang/Object
  #105 = Utf8               java/lang/Object
  #106 = Utf8               <clinit>
  #107 = Utf8               ()V
  #108 = Utf8               Code
  #109 = Utf8               LineNumberTable
  #110 = Utf8               LocalVariableTable
  #111 = Utf8               StackMapTable
  #112 = Utf8               SourceFile
  #113 = Utf8               Player.java
  #114 = Utf8               EnclosingMethod
  #115 = Class              #116          // ext/mods/gameserver/model/actor/Player
  #116 = Utf8               ext/mods/gameserver/model/actor/Player
  #117 = Utf8               NestHost
  #118 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$items$ActionType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$skills$EffectType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$actors$OperateType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$dressme$holder$DressMeVisualType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$PrivateStoreType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/PrivateStoreType.values:()[Lext/mods/gameserver/enums/PrivateStoreType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PrivateStoreType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PrivateStoreType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/PrivateStoreType.NONE:Lext/mods/gameserver/enums/PrivateStoreType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/PrivateStoreType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PrivateStoreType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/PrivateStoreType.SELL:Lext/mods/gameserver/enums/PrivateStoreType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/PrivateStoreType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PrivateStoreType:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/PrivateStoreType.PACKAGE_SELL:Lext/mods/gameserver/enums/PrivateStoreType;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/PrivateStoreType.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PrivateStoreType:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/PrivateStoreType.BUY:Lext/mods/gameserver/enums/PrivateStoreType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/PrivateStoreType.ordinal:()I
        63: iconst_4
        64: iastore
        65: goto          69
        68: astore_0
        69: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PrivateStoreType:[I
        72: getstatic     #32                 // Field ext/mods/gameserver/enums/PrivateStoreType.MANUFACTURE:Lext/mods/gameserver/enums/PrivateStoreType;
        75: invokevirtual #17                 // Method ext/mods/gameserver/enums/PrivateStoreType.ordinal:()I
        78: iconst_5
        79: iastore
        80: goto          84
        83: astore_0
        84: invokestatic  #35                 // Method ext/mods/dressme/holder/DressMeVisualType.values:()[Lext/mods/dressme/holder/DressMeVisualType;
        87: arraylength
        88: newarray       int
        90: putstatic     #40                 // Field $SwitchMap$ext$mods$dressme$holder$DressMeVisualType:[I
        93: getstatic     #40                 // Field $SwitchMap$ext$mods$dressme$holder$DressMeVisualType:[I
        96: getstatic     #43                 // Field ext/mods/dressme/holder/DressMeVisualType.ARMOR:Lext/mods/dressme/holder/DressMeVisualType;
        99: invokevirtual #47                 // Method ext/mods/dressme/holder/DressMeVisualType.ordinal:()I
       102: iconst_1
       103: iastore
       104: goto          108
       107: astore_0
       108: getstatic     #40                 // Field $SwitchMap$ext$mods$dressme$holder$DressMeVisualType:[I
       111: getstatic     #48                 // Field ext/mods/dressme/holder/DressMeVisualType.CLOAK:Lext/mods/dressme/holder/DressMeVisualType;
       114: invokevirtual #47                 // Method ext/mods/dressme/holder/DressMeVisualType.ordinal:()I
       117: iconst_2
       118: iastore
       119: goto          123
       122: astore_0
       123: getstatic     #40                 // Field $SwitchMap$ext$mods$dressme$holder$DressMeVisualType:[I
       126: getstatic     #51                 // Field ext/mods/dressme/holder/DressMeVisualType.WEAPON:Lext/mods/dressme/holder/DressMeVisualType;
       129: invokevirtual #47                 // Method ext/mods/dressme/holder/DressMeVisualType.ordinal:()I
       132: iconst_3
       133: iastore
       134: goto          138
       137: astore_0
       138: invokestatic  #54                 // Method ext/mods/gameserver/enums/actors/OperateType.values:()[Lext/mods/gameserver/enums/actors/OperateType;
       141: arraylength
       142: newarray       int
       144: putstatic     #59                 // Field $SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
       147: getstatic     #59                 // Field $SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
       150: getstatic     #62                 // Field ext/mods/gameserver/enums/actors/OperateType.SELL:Lext/mods/gameserver/enums/actors/OperateType;
       153: invokevirtual #65                 // Method ext/mods/gameserver/enums/actors/OperateType.ordinal:()I
       156: iconst_1
       157: iastore
       158: goto          162
       161: astore_0
       162: getstatic     #59                 // Field $SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
       165: getstatic     #66                 // Field ext/mods/gameserver/enums/actors/OperateType.PACKAGE_SELL:Lext/mods/gameserver/enums/actors/OperateType;
       168: invokevirtual #65                 // Method ext/mods/gameserver/enums/actors/OperateType.ordinal:()I
       171: iconst_2
       172: iastore
       173: goto          177
       176: astore_0
       177: getstatic     #59                 // Field $SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
       180: getstatic     #68                 // Field ext/mods/gameserver/enums/actors/OperateType.BUY:Lext/mods/gameserver/enums/actors/OperateType;
       183: invokevirtual #65                 // Method ext/mods/gameserver/enums/actors/OperateType.ordinal:()I
       186: iconst_3
       187: iastore
       188: goto          192
       191: astore_0
       192: getstatic     #59                 // Field $SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
       195: getstatic     #70                 // Field ext/mods/gameserver/enums/actors/OperateType.MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
       198: invokevirtual #65                 // Method ext/mods/gameserver/enums/actors/OperateType.ordinal:()I
       201: iconst_4
       202: iastore
       203: goto          207
       206: astore_0
       207: invokestatic  #72                 // Method ext/mods/gameserver/enums/skills/EffectType.values:()[Lext/mods/gameserver/enums/skills/EffectType;
       210: arraylength
       211: newarray       int
       213: putstatic     #77                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$EffectType:[I
       216: getstatic     #77                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$EffectType:[I
       219: getstatic     #80                 // Field ext/mods/gameserver/enums/skills/EffectType.SIGNET_GROUND:Lext/mods/gameserver/enums/skills/EffectType;
       222: invokevirtual #84                 // Method ext/mods/gameserver/enums/skills/EffectType.ordinal:()I
       225: iconst_1
       226: iastore
       227: goto          231
       230: astore_0
       231: getstatic     #77                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$EffectType:[I
       234: getstatic     #85                 // Field ext/mods/gameserver/enums/skills/EffectType.SIGNET_EFFECT:Lext/mods/gameserver/enums/skills/EffectType;
       237: invokevirtual #84                 // Method ext/mods/gameserver/enums/skills/EffectType.ordinal:()I
       240: iconst_2
       241: iastore
       242: goto          246
       245: astore_0
       246: invokestatic  #88                 // Method ext/mods/gameserver/enums/items/ActionType.values:()[Lext/mods/gameserver/enums/items/ActionType;
       249: arraylength
       250: newarray       int
       252: putstatic     #93                 // Field $SwitchMap$ext$mods$gameserver$enums$items$ActionType:[I
       255: getstatic     #93                 // Field $SwitchMap$ext$mods$gameserver$enums$items$ActionType:[I
       258: getstatic     #96                 // Field ext/mods/gameserver/enums/items/ActionType.summon_soulshot:Lext/mods/gameserver/enums/items/ActionType;
       261: invokevirtual #100                // Method ext/mods/gameserver/enums/items/ActionType.ordinal:()I
       264: iconst_1
       265: iastore
       266: goto          270
       269: astore_0
       270: getstatic     #93                 // Field $SwitchMap$ext$mods$gameserver$enums$items$ActionType:[I
       273: getstatic     #101                // Field ext/mods/gameserver/enums/items/ActionType.summon_spiritshot:Lext/mods/gameserver/enums/items/ActionType;
       276: invokevirtual #100                // Method ext/mods/gameserver/enums/items/ActionType.ordinal:()I
       279: iconst_2
       280: iastore
       281: goto          285
       284: astore_0
       285: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
            54    65    68   Class java/lang/NoSuchFieldError
            69    80    83   Class java/lang/NoSuchFieldError
            93   104   107   Class java/lang/NoSuchFieldError
           108   119   122   Class java/lang/NoSuchFieldError
           123   134   137   Class java/lang/NoSuchFieldError
           147   158   161   Class java/lang/NoSuchFieldError
           162   173   176   Class java/lang/NoSuchFieldError
           177   188   191   Class java/lang/NoSuchFieldError
           192   203   206   Class java/lang/NoSuchFieldError
           216   227   230   Class java/lang/NoSuchFieldError
           231   242   245   Class java/lang/NoSuchFieldError
           255   266   269   Class java/lang/NoSuchFieldError
           270   281   284   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 8440: 0
        line 8171: 84
        line 7238: 138
        line 6668: 207
        line 5414: 246
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 32
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
        frame_type = 86 /* same_locals_1_stack_item */
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
}
SourceFile: "Player.java"
EnclosingMethod: #115.#0                // ext.mods.gameserver.model.actor.Player
NestHost: class ext/mods/gameserver/model/actor/Player
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/actor/Player$4
