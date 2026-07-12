// Bytecode for: ext.mods.gameserver.model.itemcontainer.Inventory$1
// File: ext\mods\gameserver\model\itemcontainer\Inventory$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/Inventory$1.class
  Last modified 9 de jul de 2026; size 1941 bytes
  MD5 checksum 7b52292489dfca5b80449886d1d2dd49
  Compiled from "Inventory.java"
class ext.mods.gameserver.model.itemcontainer.Inventory$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/itemcontainer/Inventory$1
  super_class: #96                        // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/enums/items/CrystalType.values:()[Lext/mods/gameserver/enums/items/CrystalType;
    #2 = Class              #4            // ext/mods/gameserver/enums/items/CrystalType
    #3 = NameAndType        #5:#6         // values:()[Lext/mods/gameserver/enums/items/CrystalType;
    #4 = Utf8               ext/mods/gameserver/enums/items/CrystalType
    #5 = Utf8               values
    #6 = Utf8               ()[Lext/mods/gameserver/enums/items/CrystalType;
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/itemcontainer/Inventory$1.$SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
    #8 = Class              #10           // ext/mods/gameserver/model/itemcontainer/Inventory$1
    #9 = NameAndType        #11:#12       // $SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
   #10 = Utf8               ext/mods/gameserver/model/itemcontainer/Inventory$1
   #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$items$CrystalType
   #12 = Utf8               [I
   #13 = Fieldref           #2.#14        // ext/mods/gameserver/enums/items/CrystalType.NONE:Lext/mods/gameserver/enums/items/CrystalType;
   #14 = NameAndType        #15:#16       // NONE:Lext/mods/gameserver/enums/items/CrystalType;
   #15 = Utf8               NONE
   #16 = Utf8               Lext/mods/gameserver/enums/items/CrystalType;
   #17 = Methodref          #2.#18        // ext/mods/gameserver/enums/items/CrystalType.ordinal:()I
   #18 = NameAndType        #19:#20       // ordinal:()I
   #19 = Utf8               ordinal
   #20 = Utf8               ()I
   #21 = Class              #22           // java/lang/NoSuchFieldError
   #22 = Utf8               java/lang/NoSuchFieldError
   #23 = Fieldref           #2.#24        // ext/mods/gameserver/enums/items/CrystalType.D:Lext/mods/gameserver/enums/items/CrystalType;
   #24 = NameAndType        #25:#16       // D:Lext/mods/gameserver/enums/items/CrystalType;
   #25 = Utf8               D
   #26 = Fieldref           #2.#27        // ext/mods/gameserver/enums/items/CrystalType.C:Lext/mods/gameserver/enums/items/CrystalType;
   #27 = NameAndType        #28:#16       // C:Lext/mods/gameserver/enums/items/CrystalType;
   #28 = Utf8               C
   #29 = Fieldref           #2.#30        // ext/mods/gameserver/enums/items/CrystalType.B:Lext/mods/gameserver/enums/items/CrystalType;
   #30 = NameAndType        #31:#16       // B:Lext/mods/gameserver/enums/items/CrystalType;
   #31 = Utf8               B
   #32 = Fieldref           #2.#33        // ext/mods/gameserver/enums/items/CrystalType.A:Lext/mods/gameserver/enums/items/CrystalType;
   #33 = NameAndType        #34:#16       // A:Lext/mods/gameserver/enums/items/CrystalType;
   #34 = Utf8               A
   #35 = Fieldref           #2.#36        // ext/mods/gameserver/enums/items/CrystalType.S:Lext/mods/gameserver/enums/items/CrystalType;
   #36 = NameAndType        #37:#16       // S:Lext/mods/gameserver/enums/items/CrystalType;
   #37 = Utf8               S
   #38 = Methodref          #39.#40       // ext/mods/gameserver/enums/Paperdoll.values:()[Lext/mods/gameserver/enums/Paperdoll;
   #39 = Class              #41           // ext/mods/gameserver/enums/Paperdoll
   #40 = NameAndType        #5:#42        // values:()[Lext/mods/gameserver/enums/Paperdoll;
   #41 = Utf8               ext/mods/gameserver/enums/Paperdoll
   #42 = Utf8               ()[Lext/mods/gameserver/enums/Paperdoll;
   #43 = Fieldref           #8.#44        // ext/mods/gameserver/model/itemcontainer/Inventory$1.$SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
   #44 = NameAndType        #45:#12       // $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
   #45 = Utf8               $SwitchMap$ext$mods$gameserver$enums$Paperdoll
   #46 = Fieldref           #39.#47       // ext/mods/gameserver/enums/Paperdoll.UNDER:Lext/mods/gameserver/enums/Paperdoll;
   #47 = NameAndType        #48:#49       // UNDER:Lext/mods/gameserver/enums/Paperdoll;
   #48 = Utf8               UNDER
   #49 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
   #50 = Methodref          #39.#18       // ext/mods/gameserver/enums/Paperdoll.ordinal:()I
   #51 = Fieldref           #39.#52       // ext/mods/gameserver/enums/Paperdoll.LEAR:Lext/mods/gameserver/enums/Paperdoll;
   #52 = NameAndType        #53:#49       // LEAR:Lext/mods/gameserver/enums/Paperdoll;
   #53 = Utf8               LEAR
   #54 = Fieldref           #39.#55       // ext/mods/gameserver/enums/Paperdoll.REAR:Lext/mods/gameserver/enums/Paperdoll;
   #55 = NameAndType        #56:#49       // REAR:Lext/mods/gameserver/enums/Paperdoll;
   #56 = Utf8               REAR
   #57 = Fieldref           #39.#58       // ext/mods/gameserver/enums/Paperdoll.NECK:Lext/mods/gameserver/enums/Paperdoll;
   #58 = NameAndType        #59:#49       // NECK:Lext/mods/gameserver/enums/Paperdoll;
   #59 = Utf8               NECK
   #60 = Fieldref           #39.#61       // ext/mods/gameserver/enums/Paperdoll.RFINGER:Lext/mods/gameserver/enums/Paperdoll;
   #61 = NameAndType        #62:#49       // RFINGER:Lext/mods/gameserver/enums/Paperdoll;
   #62 = Utf8               RFINGER
   #63 = Fieldref           #39.#64       // ext/mods/gameserver/enums/Paperdoll.LFINGER:Lext/mods/gameserver/enums/Paperdoll;
   #64 = NameAndType        #65:#49       // LFINGER:Lext/mods/gameserver/enums/Paperdoll;
   #65 = Utf8               LFINGER
   #66 = Fieldref           #39.#67       // ext/mods/gameserver/enums/Paperdoll.HAIR:Lext/mods/gameserver/enums/Paperdoll;
   #67 = NameAndType        #68:#49       // HAIR:Lext/mods/gameserver/enums/Paperdoll;
   #68 = Utf8               HAIR
   #69 = Fieldref           #39.#70       // ext/mods/gameserver/enums/Paperdoll.FACE:Lext/mods/gameserver/enums/Paperdoll;
   #70 = NameAndType        #71:#49       // FACE:Lext/mods/gameserver/enums/Paperdoll;
   #71 = Utf8               FACE
   #72 = Fieldref           #39.#73       // ext/mods/gameserver/enums/Paperdoll.HEAD:Lext/mods/gameserver/enums/Paperdoll;
   #73 = NameAndType        #74:#49       // HEAD:Lext/mods/gameserver/enums/Paperdoll;
   #74 = Utf8               HEAD
   #75 = Fieldref           #39.#76       // ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
   #76 = NameAndType        #77:#49       // RHAND:Lext/mods/gameserver/enums/Paperdoll;
   #77 = Utf8               RHAND
   #78 = Fieldref           #39.#79       // ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
   #79 = NameAndType        #80:#49       // LHAND:Lext/mods/gameserver/enums/Paperdoll;
   #80 = Utf8               LHAND
   #81 = Fieldref           #39.#82       // ext/mods/gameserver/enums/Paperdoll.GLOVES:Lext/mods/gameserver/enums/Paperdoll;
   #82 = NameAndType        #83:#49       // GLOVES:Lext/mods/gameserver/enums/Paperdoll;
   #83 = Utf8               GLOVES
   #84 = Fieldref           #39.#85       // ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
   #85 = NameAndType        #86:#49       // CHEST:Lext/mods/gameserver/enums/Paperdoll;
   #86 = Utf8               CHEST
   #87 = Fieldref           #39.#88       // ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
   #88 = NameAndType        #89:#49       // LEGS:Lext/mods/gameserver/enums/Paperdoll;
   #89 = Utf8               LEGS
   #90 = Fieldref           #39.#91       // ext/mods/gameserver/enums/Paperdoll.CLOAK:Lext/mods/gameserver/enums/Paperdoll;
   #91 = NameAndType        #92:#49       // CLOAK:Lext/mods/gameserver/enums/Paperdoll;
   #92 = Utf8               CLOAK
   #93 = Fieldref           #39.#94       // ext/mods/gameserver/enums/Paperdoll.FEET:Lext/mods/gameserver/enums/Paperdoll;
   #94 = NameAndType        #95:#49       // FEET:Lext/mods/gameserver/enums/Paperdoll;
   #95 = Utf8               FEET
   #96 = Class              #97           // java/lang/Object
   #97 = Utf8               java/lang/Object
   #98 = Utf8               <clinit>
   #99 = Utf8               ()V
  #100 = Utf8               Code
  #101 = Utf8               LineNumberTable
  #102 = Utf8               LocalVariableTable
  #103 = Utf8               StackMapTable
  #104 = Utf8               SourceFile
  #105 = Utf8               Inventory.java
  #106 = Utf8               EnclosingMethod
  #107 = Class              #108          // ext/mods/gameserver/model/itemcontainer/Inventory
  #108 = Utf8               ext/mods/gameserver/model/itemcontainer/Inventory
  #109 = Utf8               NestHost
  #110 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$Paperdoll;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$items$CrystalType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/items/CrystalType.values:()[Lext/mods/gameserver/enums/items/CrystalType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/items/CrystalType.NONE:Lext/mods/gameserver/enums/items/CrystalType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/items/CrystalType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/items/CrystalType.D:Lext/mods/gameserver/enums/items/CrystalType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/items/CrystalType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/items/CrystalType.C:Lext/mods/gameserver/enums/items/CrystalType;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/items/CrystalType.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/items/CrystalType.B:Lext/mods/gameserver/enums/items/CrystalType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/items/CrystalType.ordinal:()I
        63: iconst_4
        64: iastore
        65: goto          69
        68: astore_0
        69: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
        72: getstatic     #32                 // Field ext/mods/gameserver/enums/items/CrystalType.A:Lext/mods/gameserver/enums/items/CrystalType;
        75: invokevirtual #17                 // Method ext/mods/gameserver/enums/items/CrystalType.ordinal:()I
        78: iconst_5
        79: iastore
        80: goto          84
        83: astore_0
        84: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
        87: getstatic     #35                 // Field ext/mods/gameserver/enums/items/CrystalType.S:Lext/mods/gameserver/enums/items/CrystalType;
        90: invokevirtual #17                 // Method ext/mods/gameserver/enums/items/CrystalType.ordinal:()I
        93: bipush        6
        95: iastore
        96: goto          100
        99: astore_0
       100: invokestatic  #38                 // Method ext/mods/gameserver/enums/Paperdoll.values:()[Lext/mods/gameserver/enums/Paperdoll;
       103: arraylength
       104: newarray       int
       106: putstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       109: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       112: getstatic     #46                 // Field ext/mods/gameserver/enums/Paperdoll.UNDER:Lext/mods/gameserver/enums/Paperdoll;
       115: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       118: iconst_1
       119: iastore
       120: goto          124
       123: astore_0
       124: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       127: getstatic     #51                 // Field ext/mods/gameserver/enums/Paperdoll.LEAR:Lext/mods/gameserver/enums/Paperdoll;
       130: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       133: iconst_2
       134: iastore
       135: goto          139
       138: astore_0
       139: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       142: getstatic     #54                 // Field ext/mods/gameserver/enums/Paperdoll.REAR:Lext/mods/gameserver/enums/Paperdoll;
       145: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       148: iconst_3
       149: iastore
       150: goto          154
       153: astore_0
       154: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       157: getstatic     #57                 // Field ext/mods/gameserver/enums/Paperdoll.NECK:Lext/mods/gameserver/enums/Paperdoll;
       160: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       163: iconst_4
       164: iastore
       165: goto          169
       168: astore_0
       169: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       172: getstatic     #60                 // Field ext/mods/gameserver/enums/Paperdoll.RFINGER:Lext/mods/gameserver/enums/Paperdoll;
       175: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       178: iconst_5
       179: iastore
       180: goto          184
       183: astore_0
       184: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       187: getstatic     #63                 // Field ext/mods/gameserver/enums/Paperdoll.LFINGER:Lext/mods/gameserver/enums/Paperdoll;
       190: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       193: bipush        6
       195: iastore
       196: goto          200
       199: astore_0
       200: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       203: getstatic     #66                 // Field ext/mods/gameserver/enums/Paperdoll.HAIR:Lext/mods/gameserver/enums/Paperdoll;
       206: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       209: bipush        7
       211: iastore
       212: goto          216
       215: astore_0
       216: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       219: getstatic     #69                 // Field ext/mods/gameserver/enums/Paperdoll.FACE:Lext/mods/gameserver/enums/Paperdoll;
       222: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       225: bipush        8
       227: iastore
       228: goto          232
       231: astore_0
       232: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       235: getstatic     #72                 // Field ext/mods/gameserver/enums/Paperdoll.HEAD:Lext/mods/gameserver/enums/Paperdoll;
       238: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       241: bipush        9
       243: iastore
       244: goto          248
       247: astore_0
       248: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       251: getstatic     #75                 // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
       254: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       257: bipush        10
       259: iastore
       260: goto          264
       263: astore_0
       264: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       267: getstatic     #78                 // Field ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
       270: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       273: bipush        11
       275: iastore
       276: goto          280
       279: astore_0
       280: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       283: getstatic     #81                 // Field ext/mods/gameserver/enums/Paperdoll.GLOVES:Lext/mods/gameserver/enums/Paperdoll;
       286: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       289: bipush        12
       291: iastore
       292: goto          296
       295: astore_0
       296: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       299: getstatic     #84                 // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
       302: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       305: bipush        13
       307: iastore
       308: goto          312
       311: astore_0
       312: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       315: getstatic     #87                 // Field ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
       318: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       321: bipush        14
       323: iastore
       324: goto          328
       327: astore_0
       328: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       331: getstatic     #90                 // Field ext/mods/gameserver/enums/Paperdoll.CLOAK:Lext/mods/gameserver/enums/Paperdoll;
       334: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       337: bipush        15
       339: iastore
       340: goto          344
       343: astore_0
       344: getstatic     #43                 // Field $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
       347: getstatic     #93                 // Field ext/mods/gameserver/enums/Paperdoll.FEET:Lext/mods/gameserver/enums/Paperdoll;
       350: invokevirtual #50                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
       353: bipush        16
       355: iastore
       356: goto          360
       359: astore_0
       360: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
            54    65    68   Class java/lang/NoSuchFieldError
            69    80    83   Class java/lang/NoSuchFieldError
            84    96    99   Class java/lang/NoSuchFieldError
           109   120   123   Class java/lang/NoSuchFieldError
           124   135   138   Class java/lang/NoSuchFieldError
           139   150   153   Class java/lang/NoSuchFieldError
           154   165   168   Class java/lang/NoSuchFieldError
           169   180   183   Class java/lang/NoSuchFieldError
           184   196   199   Class java/lang/NoSuchFieldError
           200   212   215   Class java/lang/NoSuchFieldError
           216   228   231   Class java/lang/NoSuchFieldError
           232   244   247   Class java/lang/NoSuchFieldError
           248   260   263   Class java/lang/NoSuchFieldError
           264   276   279   Class java/lang/NoSuchFieldError
           280   292   295   Class java/lang/NoSuchFieldError
           296   308   311   Class java/lang/NoSuchFieldError
           312   324   327   Class java/lang/NoSuchFieldError
           328   340   343   Class java/lang/NoSuchFieldError
           344   356   359   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 936: 0
        line 494: 100
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 44
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
}
SourceFile: "Inventory.java"
EnclosingMethod: #107.#0                // ext.mods.gameserver.model.itemcontainer.Inventory
NestHost: class ext/mods/gameserver/model/itemcontainer/Inventory
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/itemcontainer/Inventory$1
