// Bytecode for: ext.mods.gameserver.data.xml.AugmentationData$AugStat
// File: ext\mods\gameserver\data\xml\AugmentationData$AugStat.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/AugmentationData$AugStat.class
  Last modified 9 de jul de 2026; size 856 bytes
  MD5 checksum 2d542be576c898f985d23bdb3d3ff559
  Compiled from "AugmentationData.java"
public class ext.mods.gameserver.data.xml.AugmentationData$AugStat
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/xml/AugmentationData$AugStat
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 3, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/xml/AugmentationData$AugStat._stat:Lext/mods/gameserver/enums/skills/Stats;
   #8 = Class              #10            // ext/mods/gameserver/data/xml/AugmentationData$AugStat
   #9 = NameAndType        #11:#12        // _stat:Lext/mods/gameserver/enums/skills/Stats;
  #10 = Utf8               ext/mods/gameserver/data/xml/AugmentationData$AugStat
  #11 = Utf8               _stat
  #12 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/data/xml/AugmentationData$AugStat._value:F
  #14 = NameAndType        #15:#16        // _value:F
  #15 = Utf8               _value
  #16 = Utf8               F
  #17 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;F)V
  #18 = Utf8               Code
  #19 = Utf8               LineNumberTable
  #20 = Utf8               LocalVariableTable
  #21 = Utf8               this
  #22 = Utf8               Lext/mods/gameserver/data/xml/AugmentationData$AugStat;
  #23 = Utf8               stat
  #24 = Utf8               value
  #25 = Utf8               getStat
  #26 = Utf8               ()Lext/mods/gameserver/enums/skills/Stats;
  #27 = Utf8               getValue
  #28 = Utf8               ()F
  #29 = Utf8               SourceFile
  #30 = Utf8               AugmentationData.java
  #31 = Utf8               NestHost
  #32 = Class              #33            // ext/mods/gameserver/data/xml/AugmentationData
  #33 = Utf8               ext/mods/gameserver/data/xml/AugmentationData
  #34 = Utf8               InnerClasses
  #35 = Utf8               AugStat
{
  public ext.mods.gameserver.data.xml.AugmentationData$AugStat(ext.mods.gameserver.enums.skills.Stats, float);
    descriptor: (Lext/mods/gameserver/enums/skills/Stats;F)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _stat:Lext/mods/gameserver/enums/skills/Stats;
         9: aload_0
        10: fload_2
        11: putfield      #13                 // Field _value:F
        14: return
      LineNumberTable:
        line 334: 0
        line 335: 4
        line 336: 9
        line 337: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/data/xml/AugmentationData$AugStat;
            0      15     1  stat   Lext/mods/gameserver/enums/skills/Stats;
            0      15     2 value   F

  public ext.mods.gameserver.enums.skills.Stats getStat();
    descriptor: ()Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _stat:Lext/mods/gameserver/enums/skills/Stats;
         4: areturn
      LineNumberTable:
        line 341: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/AugmentationData$AugStat;

  public float getValue();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _value:F
         4: freturn
      LineNumberTable:
        line 346: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/AugmentationData$AugStat;
}
SourceFile: "AugmentationData.java"
NestHost: class ext/mods/gameserver/data/xml/AugmentationData
InnerClasses:
  public static #35= #8 of #32;           // AugStat=class ext/mods/gameserver/data/xml/AugmentationData$AugStat of class ext/mods/gameserver/data/xml/AugmentationData
