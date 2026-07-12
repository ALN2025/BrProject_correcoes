// Bytecode for: ext.mods.gameserver.data.xml.AugmentationData$AugmentationStat
// File: ext\mods\gameserver\data\xml\AugmentationData$AugmentationStat.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat.class
  Last modified 9 de jul de 2026; size 1456 bytes
  MD5 checksum 674ddb68be10a4639aae99185b47bc79
  Compiled from "AugmentationData.java"
public class ext.mods.gameserver.data.xml.AugmentationData$AugmentationStat
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 6, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat._stat:Lext/mods/gameserver/enums/skills/Stats;
   #8 = Class              #10            // ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat
   #9 = NameAndType        #11:#12        // _stat:Lext/mods/gameserver/enums/skills/Stats;
  #10 = Utf8               ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat
  #11 = Utf8               _stat
  #12 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat._singleSize:I
  #14 = NameAndType        #15:#16        // _singleSize:I
  #15 = Utf8               _singleSize
  #16 = Utf8               I
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat._singleValues:[F
  #18 = NameAndType        #19:#20        // _singleValues:[F
  #19 = Utf8               _singleValues
  #20 = Utf8               [F
  #21 = Fieldref           #8.#22         // ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat._combinedSize:I
  #22 = NameAndType        #23:#16        // _combinedSize:I
  #23 = Utf8               _combinedSize
  #24 = Fieldref           #8.#25         // ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat._combinedValues:[F
  #25 = NameAndType        #26:#20        // _combinedValues:[F
  #26 = Utf8               _combinedValues
  #27 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;[F[F)V
  #28 = Utf8               Code
  #29 = Utf8               LineNumberTable
  #30 = Utf8               LocalVariableTable
  #31 = Utf8               this
  #32 = Utf8               Lext/mods/gameserver/data/xml/AugmentationData$AugmentationStat;
  #33 = Utf8               stat
  #34 = Utf8               singleValues
  #35 = Utf8               combinedValues
  #36 = Utf8               getSingleStatSize
  #37 = Utf8               ()I
  #38 = Utf8               getCombinedStatSize
  #39 = Utf8               getSingleStatValue
  #40 = Utf8               (I)F
  #41 = Utf8               i
  #42 = Utf8               StackMapTable
  #43 = Utf8               getCombinedStatValue
  #44 = Utf8               getStat
  #45 = Utf8               ()Lext/mods/gameserver/enums/skills/Stats;
  #46 = Utf8               SourceFile
  #47 = Utf8               AugmentationData.java
  #48 = Utf8               NestHost
  #49 = Class              #50            // ext/mods/gameserver/data/xml/AugmentationData
  #50 = Utf8               ext/mods/gameserver/data/xml/AugmentationData
  #51 = Utf8               InnerClasses
  #52 = Utf8               AugmentationStat
{
  public ext.mods.gameserver.data.xml.AugmentationData$AugmentationStat(ext.mods.gameserver.enums.skills.Stats, float[], float[]);
    descriptor: (Lext/mods/gameserver/enums/skills/Stats;[F[F)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _stat:Lext/mods/gameserver/enums/skills/Stats;
         9: aload_0
        10: aload_2
        11: arraylength
        12: putfield      #13                 // Field _singleSize:I
        15: aload_0
        16: aload_2
        17: putfield      #17                 // Field _singleValues:[F
        20: aload_0
        21: aload_3
        22: arraylength
        23: putfield      #21                 // Field _combinedSize:I
        26: aload_0
        27: aload_3
        28: putfield      #24                 // Field _combinedValues:[F
        31: return
      LineNumberTable:
        line 359: 0
        line 360: 4
        line 361: 9
        line 362: 15
        line 363: 20
        line 364: 26
        line 365: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/data/xml/AugmentationData$AugmentationStat;
            0      32     1  stat   Lext/mods/gameserver/enums/skills/Stats;
            0      32     2 singleValues   [F
            0      32     3 combinedValues   [F

  public int getSingleStatSize();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _singleSize:I
         4: ireturn
      LineNumberTable:
        line 369: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/AugmentationData$AugmentationStat;

  public int getCombinedStatSize();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _combinedSize:I
         4: ireturn
      LineNumberTable:
        line 374: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/AugmentationData$AugmentationStat;

  public float getSingleStatValue(int);
    descriptor: (I)F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: iload_1
         1: aload_0
         2: getfield      #13                 // Field _singleSize:I
         5: if_icmpge     12
         8: iload_1
         9: ifge          24
        12: aload_0
        13: getfield      #17                 // Field _singleValues:[F
        16: aload_0
        17: getfield      #13                 // Field _singleSize:I
        20: iconst_1
        21: isub
        22: faload
        23: freturn
        24: aload_0
        25: getfield      #17                 // Field _singleValues:[F
        28: iload_1
        29: faload
        30: freturn
      LineNumberTable:
        line 379: 0
        line 380: 12
        line 382: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/xml/AugmentationData$AugmentationStat;
            0      31     1     i   I
      StackMapTable: number_of_entries = 2
        frame_type = 12 /* same */
        frame_type = 11 /* same */

  public float getCombinedStatValue(int);
    descriptor: (I)F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: iload_1
         1: aload_0
         2: getfield      #21                 // Field _combinedSize:I
         5: if_icmpge     12
         8: iload_1
         9: ifge          24
        12: aload_0
        13: getfield      #24                 // Field _combinedValues:[F
        16: aload_0
        17: getfield      #21                 // Field _combinedSize:I
        20: iconst_1
        21: isub
        22: faload
        23: freturn
        24: aload_0
        25: getfield      #24                 // Field _combinedValues:[F
        28: iload_1
        29: faload
        30: freturn
      LineNumberTable:
        line 387: 0
        line 388: 12
        line 390: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/xml/AugmentationData$AugmentationStat;
            0      31     1     i   I
      StackMapTable: number_of_entries = 2
        frame_type = 12 /* same */
        frame_type = 11 /* same */

  public ext.mods.gameserver.enums.skills.Stats getStat();
    descriptor: ()Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _stat:Lext/mods/gameserver/enums/skills/Stats;
         4: areturn
      LineNumberTable:
        line 395: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/AugmentationData$AugmentationStat;
}
SourceFile: "AugmentationData.java"
NestHost: class ext/mods/gameserver/data/xml/AugmentationData
InnerClasses:
  public static #52= #8 of #49;           // AugmentationStat=class ext/mods/gameserver/data/xml/AugmentationData$AugmentationStat of class ext/mods/gameserver/data/xml/AugmentationData
