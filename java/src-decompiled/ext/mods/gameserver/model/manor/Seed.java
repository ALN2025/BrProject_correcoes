// Bytecode for: ext.mods.gameserver.model.manor.Seed
// File: ext\mods\gameserver\model\manor\Seed.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/manor/Seed.class
  Last modified 9 de jul de 2026; size 3673 bytes
  MD5 checksum bc81673fc7366b6271aecd93f4ac08cb
  Compiled from "Seed.java"
public final class ext.mods.gameserver.model.manor.Seed
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/manor/Seed
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 12, methods: 18, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // id
    #8 = Utf8               id
    #9 = Methodref          #10.#11       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #10 = Class              #12           // ext/mods/commons/data/StatSet
   #11 = NameAndType        #13:#14       // getInteger:(Ljava/lang/String;)I
   #12 = Utf8               ext/mods/commons/data/StatSet
   #13 = Utf8               getInteger
   #14 = Utf8               (Ljava/lang/String;)I
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/model/manor/Seed._cropId:I
   #16 = Class              #18           // ext/mods/gameserver/model/manor/Seed
   #17 = NameAndType        #19:#20       // _cropId:I
   #18 = Utf8               ext/mods/gameserver/model/manor/Seed
   #19 = Utf8               _cropId
   #20 = Utf8               I
   #21 = String             #22           // seedId
   #22 = Utf8               seedId
   #23 = Fieldref           #16.#24       // ext/mods/gameserver/model/manor/Seed._seedId:I
   #24 = NameAndType        #25:#20       // _seedId:I
   #25 = Utf8               _seedId
   #26 = String             #27           // matureId
   #27 = Utf8               matureId
   #28 = Fieldref           #16.#29       // ext/mods/gameserver/model/manor/Seed._matureId:I
   #29 = NameAndType        #30:#20       // _matureId:I
   #30 = Utf8               _matureId
   #31 = String             #32           // level
   #32 = Utf8               level
   #33 = Fieldref           #16.#34       // ext/mods/gameserver/model/manor/Seed._level:I
   #34 = NameAndType        #35:#20       // _level:I
   #35 = Utf8               _level
   #36 = String             #37           // reward1
   #37 = Utf8               reward1
   #38 = Fieldref           #16.#39       // ext/mods/gameserver/model/manor/Seed._reward1:I
   #39 = NameAndType        #40:#20       // _reward1:I
   #40 = Utf8               _reward1
   #41 = String             #42           // reward2
   #42 = Utf8               reward2
   #43 = Fieldref           #16.#44       // ext/mods/gameserver/model/manor/Seed._reward2:I
   #44 = NameAndType        #45:#20       // _reward2:I
   #45 = Utf8               _reward2
   #46 = String             #47           // castleId
   #47 = Utf8               castleId
   #48 = Fieldref           #16.#49       // ext/mods/gameserver/model/manor/Seed._castleId:I
   #49 = NameAndType        #50:#20       // _castleId:I
   #50 = Utf8               _castleId
   #51 = String             #52           // isAlternative
   #52 = Utf8               isAlternative
   #53 = Methodref          #10.#54       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;)Z
   #54 = NameAndType        #55:#56       // getBool:(Ljava/lang/String;)Z
   #55 = Utf8               getBool
   #56 = Utf8               (Ljava/lang/String;)Z
   #57 = Fieldref           #16.#58       // ext/mods/gameserver/model/manor/Seed._isAlternative:Z
   #58 = NameAndType        #59:#60       // _isAlternative:Z
   #59 = Utf8               _isAlternative
   #60 = Utf8               Z
   #61 = String             #62           // seedsLimit
   #62 = Utf8               seedsLimit
   #63 = Fieldref           #16.#64       // ext/mods/gameserver/model/manor/Seed._seedsLimit:I
   #64 = NameAndType        #65:#20       // _seedsLimit:I
   #65 = Utf8               _seedsLimit
   #66 = String             #67           // cropsLimit
   #67 = Utf8               cropsLimit
   #68 = Fieldref           #16.#69       // ext/mods/gameserver/model/manor/Seed._cropsLimit:I
   #69 = NameAndType        #70:#20       // _cropsLimit:I
   #70 = Utf8               _cropsLimit
   #71 = Methodref          #72.#73       // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #72 = Class              #74           // ext/mods/gameserver/data/xml/ItemData
   #73 = NameAndType        #75:#76       // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #74 = Utf8               ext/mods/gameserver/data/xml/ItemData
   #75 = Utf8               getInstance
   #76 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
   #77 = Methodref          #72.#78       // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #78 = NameAndType        #79:#80       // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #79 = Utf8               getTemplate
   #80 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
   #81 = Methodref          #82.#83       // ext/mods/gameserver/model/item/kind/Item.getReferencePrice:()I
   #82 = Class              #84           // ext/mods/gameserver/model/item/kind/Item
   #83 = NameAndType        #85:#86       // getReferencePrice:()I
   #84 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #85 = Utf8               getReferencePrice
   #86 = Utf8               ()I
   #87 = Fieldref           #16.#88       // ext/mods/gameserver/model/manor/Seed._cropReferencePrice:I
   #88 = NameAndType        #89:#20       // _cropReferencePrice:I
   #89 = Utf8               _cropReferencePrice
   #90 = Fieldref           #16.#91       // ext/mods/gameserver/model/manor/Seed._seedReferencePrice:I
   #91 = NameAndType        #92:#20       // _seedReferencePrice:I
   #92 = Utf8               _seedReferencePrice
   #93 = Fieldref           #94.#95       // ext/mods/Config.RATE_DROP_MANOR:I
   #94 = Class              #96           // ext/mods/Config
   #95 = NameAndType        #97:#20       // RATE_DROP_MANOR:I
   #96 = Utf8               ext/mods/Config
   #97 = Utf8               RATE_DROP_MANOR
   #98 = Double             0.6d
  #100 = InvokeDynamic      #0:#101       // #0:makeConcatWithConstants:(IIIIIIIZII)Ljava/lang/String;
  #101 = NameAndType        #102:#103     // makeConcatWithConstants:(IIIIIIIZII)Ljava/lang/String;
  #102 = Utf8               makeConcatWithConstants
  #103 = Utf8               (IIIIIIIZII)Ljava/lang/String;
  #104 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #105 = Utf8               Code
  #106 = Utf8               LineNumberTable
  #107 = Utf8               LocalVariableTable
  #108 = Utf8               this
  #109 = Utf8               Lext/mods/gameserver/model/manor/Seed;
  #110 = Utf8               set
  #111 = Utf8               Lext/mods/commons/data/StatSet;
  #112 = Utf8               item
  #113 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #114 = Utf8               StackMapTable
  #115 = Utf8               getCropId
  #116 = Utf8               getSeedId
  #117 = Utf8               getMatureId
  #118 = Utf8               getLevel
  #119 = Utf8               getReward1
  #120 = Utf8               getReward2
  #121 = Utf8               getCastleId
  #122 = Utf8               ()Z
  #123 = Utf8               getSeedsLimit
  #124 = Utf8               getCropsLimit
  #125 = Utf8               getSeedReferencePrice
  #126 = Utf8               getSeedMaxPrice
  #127 = Utf8               getSeedMinPrice
  #128 = Utf8               getCropReferencePrice
  #129 = Utf8               getCropMaxPrice
  #130 = Utf8               getCropMinPrice
  #131 = Utf8               toString
  #132 = Utf8               ()Ljava/lang/String;
  #133 = Utf8               SourceFile
  #134 = Utf8               Seed.java
  #135 = Utf8               BootstrapMethods
  #136 = String             #137          // Seed [_id=\u0001, _level=\u0001, _crop=\u0001, _mature=\u0001, _reward1=\u0001, _reward2=\u0001, _manorId=\u0001, _isAlternative=\u0001, _limitSeeds=\u0001, _limitCrops=\u0001]
  #137 = Utf8               Seed [_id=\u0001, _level=\u0001, _crop=\u0001, _mature=\u0001, _reward1=\u0001, _reward2=\u0001, _manorId=\u0001, _isAlternative=\u0001, _limitSeeds=\u0001, _limitCrops=\u0001]
  #138 = MethodHandle       6:#139        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #139 = Methodref          #140.#141     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #140 = Class              #142          // java/lang/invoke/StringConcatFactory
  #141 = NameAndType        #102:#143     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #142 = Utf8               java/lang/invoke/StringConcatFactory
  #143 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #144 = Utf8               InnerClasses
  #145 = Class              #146          // java/lang/invoke/MethodHandles$Lookup
  #146 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #147 = Class              #148          // java/lang/invoke/MethodHandles
  #148 = Utf8               java/lang/invoke/MethodHandles
  #149 = Utf8               Lookup
{
  public ext.mods.gameserver.model.manor.Seed(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String id
         8: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        11: putfield      #15                 // Field _cropId:I
        14: aload_0
        15: aload_1
        16: ldc           #21                 // String seedId
        18: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        21: putfield      #23                 // Field _seedId:I
        24: aload_0
        25: aload_1
        26: ldc           #26                 // String matureId
        28: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        31: putfield      #28                 // Field _matureId:I
        34: aload_0
        35: aload_1
        36: ldc           #31                 // String level
        38: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        41: putfield      #33                 // Field _level:I
        44: aload_0
        45: aload_1
        46: ldc           #36                 // String reward1
        48: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        51: putfield      #38                 // Field _reward1:I
        54: aload_0
        55: aload_1
        56: ldc           #41                 // String reward2
        58: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        61: putfield      #43                 // Field _reward2:I
        64: aload_0
        65: aload_1
        66: ldc           #46                 // String castleId
        68: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        71: putfield      #48                 // Field _castleId:I
        74: aload_0
        75: aload_1
        76: ldc           #51                 // String isAlternative
        78: invokevirtual #53                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;)Z
        81: putfield      #57                 // Field _isAlternative:Z
        84: aload_0
        85: aload_1
        86: ldc           #61                 // String seedsLimit
        88: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        91: putfield      #63                 // Field _seedsLimit:I
        94: aload_0
        95: aload_1
        96: ldc           #66                 // String cropsLimit
        98: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       101: putfield      #68                 // Field _cropsLimit:I
       104: invokestatic  #71                 // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
       107: aload_0
       108: getfield      #15                 // Field _cropId:I
       111: invokevirtual #77                 // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
       114: astore_2
       115: aload_0
       116: aload_2
       117: ifnull        127
       120: aload_2
       121: invokevirtual #81                 // Method ext/mods/gameserver/model/item/kind/Item.getReferencePrice:()I
       124: goto          128
       127: iconst_1
       128: putfield      #87                 // Field _cropReferencePrice:I
       131: invokestatic  #71                 // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
       134: aload_0
       135: getfield      #23                 // Field _seedId:I
       138: invokevirtual #77                 // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
       141: astore_2
       142: aload_0
       143: aload_2
       144: ifnull        154
       147: aload_2
       148: invokevirtual #81                 // Method ext/mods/gameserver/model/item/kind/Item.getReferencePrice:()I
       151: goto          155
       154: iconst_1
       155: putfield      #90                 // Field _seedReferencePrice:I
       158: return
      LineNumberTable:
        line 42: 0
        line 43: 4
        line 44: 14
        line 45: 24
        line 46: 34
        line 47: 44
        line 48: 54
        line 49: 64
        line 50: 74
        line 51: 84
        line 52: 94
        line 54: 104
        line 55: 115
        line 57: 131
        line 58: 142
        line 59: 158
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     159     0  this   Lext/mods/gameserver/model/manor/Seed;
            0     159     1   set   Lext/mods/commons/data/StatSet;
          115      44     2  item   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 127
          locals = [ class ext/mods/gameserver/model/manor/Seed, class ext/mods/commons/data/StatSet, class ext/mods/gameserver/model/item/kind/Item ]
          stack = [ class ext/mods/gameserver/model/manor/Seed ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/manor/Seed, class ext/mods/commons/data/StatSet, class ext/mods/gameserver/model/item/kind/Item ]
          stack = [ class ext/mods/gameserver/model/manor/Seed, int ]
        frame_type = 89 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/manor/Seed ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/manor/Seed, class ext/mods/commons/data/StatSet, class ext/mods/gameserver/model/item/kind/Item ]
          stack = [ class ext/mods/gameserver/model/manor/Seed, int ]

  public final int getCropId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _cropId:I
         4: ireturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getSeedId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _seedId:I
         4: ireturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getMatureId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _matureId:I
         4: ireturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getLevel();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _level:I
         4: ireturn
      LineNumberTable:
        line 78: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getReward1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _reward1:I
         4: ireturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getReward2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field _reward2:I
         4: ireturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getCastleId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #48                 // Field _castleId:I
         4: ireturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final boolean isAlternative();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #57                 // Field _isAlternative:Z
         4: ireturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getSeedsLimit();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #63                 // Field _seedsLimit:I
         4: getstatic     #93                 // Field ext/mods/Config.RATE_DROP_MANOR:I
         7: imul
         8: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getCropsLimit();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #68                 // Field _cropsLimit:I
         4: getstatic     #93                 // Field ext/mods/Config.RATE_DROP_MANOR:I
         7: imul
         8: ireturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getSeedReferencePrice();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #90                 // Field _seedReferencePrice:I
         4: ireturn
      LineNumberTable:
        line 113: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getSeedMaxPrice();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #90                 // Field _seedReferencePrice:I
         4: bipush        10
         6: imul
         7: ireturn
      LineNumberTable:
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getSeedMinPrice();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #90                 // Field _seedReferencePrice:I
         4: i2d
         5: ldc2_w        #98                 // double 0.6d
         8: dmul
         9: d2i
        10: ireturn
      LineNumberTable:
        line 123: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getCropReferencePrice();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #87                 // Field _cropReferencePrice:I
         4: ireturn
      LineNumberTable:
        line 128: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getCropMaxPrice();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #87                 // Field _cropReferencePrice:I
         4: bipush        10
         6: imul
         7: ireturn
      LineNumberTable:
        line 133: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final int getCropMinPrice();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #87                 // Field _cropReferencePrice:I
         4: i2d
         5: ldc2_w        #98                 // double 0.6d
         8: dmul
         9: d2i
        10: ireturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/manor/Seed;

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=10, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _seedId:I
         4: aload_0
         5: getfield      #33                 // Field _level:I
         8: aload_0
         9: getfield      #15                 // Field _cropId:I
        12: aload_0
        13: getfield      #28                 // Field _matureId:I
        16: aload_0
        17: getfield      #38                 // Field _reward1:I
        20: aload_0
        21: getfield      #43                 // Field _reward2:I
        24: aload_0
        25: getfield      #48                 // Field _castleId:I
        28: aload_0
        29: getfield      #57                 // Field _isAlternative:Z
        32: aload_0
        33: getfield      #63                 // Field _seedsLimit:I
        36: aload_0
        37: getfield      #68                 // Field _cropsLimit:I
        40: invokedynamic #100,  0            // InvokeDynamic #0:makeConcatWithConstants:(IIIIIIIZII)Ljava/lang/String;
        45: areturn
      LineNumberTable:
        line 144: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/manor/Seed;
}
SourceFile: "Seed.java"
BootstrapMethods:
  0: #138 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #136 Seed [_id=\u0001, _level=\u0001, _crop=\u0001, _mature=\u0001, _reward1=\u0001, _reward2=\u0001, _manorId=\u0001, _isAlternative=\u0001, _limitSeeds=\u0001, _limitCrops=\u0001]
InnerClasses:
  public static final #149= #145 of #147; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
