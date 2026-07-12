// Bytecode for: ext.mods.gameserver.model.records.custom.RatesHolder
// File: ext\mods\gameserver\model\records\custom\RatesHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/custom/RatesHolder.class
  Last modified 9 de jul de 2026; size 1357 bytes
  MD5 checksum a2f176b6d5913a3516d46ce19bf08f09
  Compiled from "RatesHolder.java"
public class ext.mods.gameserver.model.records.custom.RatesHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/records/custom/RatesHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // level
   #8 = Utf8               level
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;)I
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/model/records/custom/RatesHolder.level:I
  #16 = Class              #18            // ext/mods/gameserver/model/records/custom/RatesHolder
  #17 = NameAndType        #8:#19         // level:I
  #18 = Utf8               ext/mods/gameserver/model/records/custom/RatesHolder
  #19 = Utf8               I
  #20 = String             #21            // xpRate
  #21 = Utf8               xpRate
  #22 = Methodref          #10.#23        // ext/mods/commons/data/StatSet.getFloat:(Ljava/lang/String;F)F
  #23 = NameAndType        #24:#25        // getFloat:(Ljava/lang/String;F)F
  #24 = Utf8               getFloat
  #25 = Utf8               (Ljava/lang/String;F)F
  #26 = Fieldref           #16.#27        // ext/mods/gameserver/model/records/custom/RatesHolder.xpRate:F
  #27 = NameAndType        #21:#28        // xpRate:F
  #28 = Utf8               F
  #29 = String             #30            // spRate
  #30 = Utf8               spRate
  #31 = Fieldref           #16.#32        // ext/mods/gameserver/model/records/custom/RatesHolder.spRate:F
  #32 = NameAndType        #30:#28        // spRate:F
  #33 = String             #34            // adenaRate
  #34 = Utf8               adenaRate
  #35 = Fieldref           #16.#36        // ext/mods/gameserver/model/records/custom/RatesHolder.adenaRate:F
  #36 = NameAndType        #34:#28        // adenaRate:F
  #37 = String             #38            // dropRate
  #38 = Utf8               dropRate
  #39 = Fieldref           #16.#40        // ext/mods/gameserver/model/records/custom/RatesHolder.dropRate:F
  #40 = NameAndType        #38:#28        // dropRate:F
  #41 = String             #42            // spoilRate
  #42 = Utf8               spoilRate
  #43 = Methodref          #10.#44        // ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
  #44 = NameAndType        #45:#46        // getDouble:(Ljava/lang/String;D)D
  #45 = Utf8               getDouble
  #46 = Utf8               (Ljava/lang/String;D)D
  #47 = Fieldref           #16.#48        // ext/mods/gameserver/model/records/custom/RatesHolder.spoilRate:D
  #48 = NameAndType        #42:#49        // spoilRate:D
  #49 = Utf8               D
  #50 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #51 = Utf8               Code
  #52 = Utf8               LineNumberTable
  #53 = Utf8               LocalVariableTable
  #54 = Utf8               this
  #55 = Utf8               Lext/mods/gameserver/model/records/custom/RatesHolder;
  #56 = Utf8               set
  #57 = Utf8               Lext/mods/commons/data/StatSet;
  #58 = Utf8               getLevel
  #59 = Utf8               ()I
  #60 = Utf8               getXpRate
  #61 = Utf8               ()F
  #62 = Utf8               getSpRate
  #63 = Utf8               getAdenaRate
  #64 = Utf8               getDropRate
  #65 = Utf8               getSpoilRate
  #66 = Utf8               ()D
  #67 = Utf8               SourceFile
  #68 = Utf8               RatesHolder.java
{
  public ext.mods.gameserver.model.records.custom.RatesHolder(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String level
         8: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        11: putfield      #15                 // Field level:I
        14: aload_0
        15: aload_1
        16: ldc           #20                 // String xpRate
        18: fconst_1
        19: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getFloat:(Ljava/lang/String;F)F
        22: putfield      #26                 // Field xpRate:F
        25: aload_0
        26: aload_1
        27: ldc           #29                 // String spRate
        29: fconst_1
        30: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getFloat:(Ljava/lang/String;F)F
        33: putfield      #31                 // Field spRate:F
        36: aload_0
        37: aload_1
        38: ldc           #33                 // String adenaRate
        40: fconst_1
        41: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getFloat:(Ljava/lang/String;F)F
        44: putfield      #35                 // Field adenaRate:F
        47: aload_0
        48: aload_1
        49: ldc           #37                 // String dropRate
        51: fconst_1
        52: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getFloat:(Ljava/lang/String;F)F
        55: putfield      #39                 // Field dropRate:F
        58: aload_0
        59: aload_1
        60: ldc           #41                 // String spoilRate
        62: dconst_1
        63: invokevirtual #43                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
        66: putfield      #47                 // Field spoilRate:D
        69: return
      LineNumberTable:
        line 31: 0
        line 32: 4
        line 33: 14
        line 34: 25
        line 35: 36
        line 36: 47
        line 37: 58
        line 38: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      70     0  this   Lext/mods/gameserver/model/records/custom/RatesHolder;
            0      70     1   set   Lext/mods/commons/data/StatSet;

  public int getLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field level:I
         4: ireturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/RatesHolder;

  public float getXpRate();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field xpRate:F
         4: freturn
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/RatesHolder;

  public float getSpRate();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field spRate:F
         4: freturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/RatesHolder;

  public float getAdenaRate();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field adenaRate:F
         4: freturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/RatesHolder;

  public float getDropRate();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field dropRate:F
         4: freturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/RatesHolder;

  public double getSpoilRate();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field spoilRate:D
         4: dreturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/RatesHolder;
}
SourceFile: "RatesHolder.java"
