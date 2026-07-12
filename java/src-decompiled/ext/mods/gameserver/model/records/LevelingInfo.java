// Bytecode for: ext.mods.gameserver.model.records.LevelingInfo
// File: ext\mods\gameserver\model\records\LevelingInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/LevelingInfo.class
  Last modified 9 de jul de 2026; size 2749 bytes
  MD5 checksum f0c08736e9e12806ea36741b2380e00b
  Compiled from "LevelingInfo.java"
public final class ext.mods.gameserver.model.records.LevelingInfo extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/LevelingInfo
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 5, methods: 10, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Record."<init>":()V
    #2 = Class              #4            // java/lang/Record
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Record
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/records/LevelingInfo.absorbCrystalType:Lext/mods/gameserver/enums/items/AbsorbCrystalType;
    #8 = Class              #10           // ext/mods/gameserver/model/records/LevelingInfo
    #9 = NameAndType        #11:#12       // absorbCrystalType:Lext/mods/gameserver/enums/items/AbsorbCrystalType;
   #10 = Utf8               ext/mods/gameserver/model/records/LevelingInfo
   #11 = Utf8               absorbCrystalType
   #12 = Utf8               Lext/mods/gameserver/enums/items/AbsorbCrystalType;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/records/LevelingInfo.isSkillRequired:Z
   #14 = NameAndType        #15:#16       // isSkillRequired:Z
   #15 = Utf8               isSkillRequired
   #16 = Utf8               Z
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/records/LevelingInfo.chanceStage:I
   #18 = NameAndType        #19:#20       // chanceStage:I
   #19 = Utf8               chanceStage
   #20 = Utf8               I
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/model/records/LevelingInfo.chanceBreak:I
   #22 = NameAndType        #23:#20       // chanceBreak:I
   #23 = Utf8               chanceBreak
   #24 = Fieldref           #8.#25        // ext/mods/gameserver/model/records/LevelingInfo.levelList:[I
   #25 = NameAndType        #26:#27       // levelList:[I
   #26 = Utf8               levelList
   #27 = Utf8               [I
   #28 = String             #29           // absorbType
   #29 = Utf8               absorbType
   #30 = Class              #31           // ext/mods/gameserver/enums/items/AbsorbCrystalType
   #31 = Utf8               ext/mods/gameserver/enums/items/AbsorbCrystalType
   #32 = Methodref          #33.#34       // ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
   #33 = Class              #35           // ext/mods/commons/data/StatSet
   #34 = NameAndType        #36:#37       // getEnum:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
   #35 = Utf8               ext/mods/commons/data/StatSet
   #36 = Utf8               getEnum
   #37 = Utf8               (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
   #38 = String             #39           // skill
   #39 = Utf8               skill
   #40 = Methodref          #33.#41       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;)Z
   #41 = NameAndType        #42:#43       // getBool:(Ljava/lang/String;)Z
   #42 = Utf8               getBool
   #43 = Utf8               (Ljava/lang/String;)Z
   #44 = String             #19           // chanceStage
   #45 = Methodref          #33.#46       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #46 = NameAndType        #47:#48       // getInteger:(Ljava/lang/String;)I
   #47 = Utf8               getInteger
   #48 = Utf8               (Ljava/lang/String;)I
   #49 = String             #23           // chanceBreak
   #50 = String             #26           // levelList
   #51 = Methodref          #33.#52       // ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;)[I
   #52 = NameAndType        #53:#54       // getIntegerArray:(Ljava/lang/String;)[I
   #53 = Utf8               getIntegerArray
   #54 = Utf8               (Ljava/lang/String;)[I
   #55 = Methodref          #8.#56        // ext/mods/gameserver/model/records/LevelingInfo."<init>":(Lext/mods/gameserver/enums/items/AbsorbCrystalType;ZII[I)V
   #56 = NameAndType        #5:#57        // "<init>":(Lext/mods/gameserver/enums/items/AbsorbCrystalType;ZII[I)V
   #57 = Utf8               (Lext/mods/gameserver/enums/items/AbsorbCrystalType;ZII[I)V
   #58 = InvokeDynamic      #0:#59        // #0:toString:(Lext/mods/gameserver/model/records/LevelingInfo;)Ljava/lang/String;
   #59 = NameAndType        #60:#61       // toString:(Lext/mods/gameserver/model/records/LevelingInfo;)Ljava/lang/String;
   #60 = Utf8               toString
   #61 = Utf8               (Lext/mods/gameserver/model/records/LevelingInfo;)Ljava/lang/String;
   #62 = InvokeDynamic      #0:#63        // #0:hashCode:(Lext/mods/gameserver/model/records/LevelingInfo;)I
   #63 = NameAndType        #64:#65       // hashCode:(Lext/mods/gameserver/model/records/LevelingInfo;)I
   #64 = Utf8               hashCode
   #65 = Utf8               (Lext/mods/gameserver/model/records/LevelingInfo;)I
   #66 = InvokeDynamic      #0:#67        // #0:equals:(Lext/mods/gameserver/model/records/LevelingInfo;Ljava/lang/Object;)Z
   #67 = NameAndType        #68:#69       // equals:(Lext/mods/gameserver/model/records/LevelingInfo;Ljava/lang/Object;)Z
   #68 = Utf8               equals
   #69 = Utf8               (Lext/mods/gameserver/model/records/LevelingInfo;Ljava/lang/Object;)Z
   #70 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #71 = Utf8               Code
   #72 = Utf8               LineNumberTable
   #73 = Utf8               LocalVariableTable
   #74 = Utf8               this
   #75 = Utf8               Lext/mods/gameserver/model/records/LevelingInfo;
   #76 = Utf8               set
   #77 = Utf8               Lext/mods/commons/data/StatSet;
   #78 = Utf8               MethodParameters
   #79 = Utf8               ()Ljava/lang/String;
   #80 = Utf8               ()I
   #81 = Utf8               (Ljava/lang/Object;)Z
   #82 = Utf8               o
   #83 = Utf8               Ljava/lang/Object;
   #84 = Utf8               ()Lext/mods/gameserver/enums/items/AbsorbCrystalType;
   #85 = Utf8               ()Z
   #86 = Utf8               ()[I
   #87 = Utf8               SourceFile
   #88 = Utf8               LevelingInfo.java
   #89 = Utf8               Record
   #90 = Utf8               BootstrapMethods
   #91 = String             #92           // absorbCrystalType;isSkillRequired;chanceStage;chanceBreak;levelList
   #92 = Utf8               absorbCrystalType;isSkillRequired;chanceStage;chanceBreak;levelList
   #93 = MethodHandle       1:#7          // REF_getField ext/mods/gameserver/model/records/LevelingInfo.absorbCrystalType:Lext/mods/gameserver/enums/items/AbsorbCrystalType;
   #94 = MethodHandle       1:#13         // REF_getField ext/mods/gameserver/model/records/LevelingInfo.isSkillRequired:Z
   #95 = MethodHandle       1:#17         // REF_getField ext/mods/gameserver/model/records/LevelingInfo.chanceStage:I
   #96 = MethodHandle       1:#21         // REF_getField ext/mods/gameserver/model/records/LevelingInfo.chanceBreak:I
   #97 = MethodHandle       1:#24         // REF_getField ext/mods/gameserver/model/records/LevelingInfo.levelList:[I
   #98 = MethodHandle       6:#99         // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #99 = Methodref          #100.#101     // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #100 = Class              #102          // java/lang/runtime/ObjectMethods
  #101 = NameAndType        #103:#104     // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #102 = Utf8               java/lang/runtime/ObjectMethods
  #103 = Utf8               bootstrap
  #104 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #105 = Utf8               InnerClasses
  #106 = Class              #107          // java/lang/invoke/MethodHandles$Lookup
  #107 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #108 = Class              #109          // java/lang/invoke/MethodHandles
  #109 = Utf8               java/lang/invoke/MethodHandles
  #110 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.LevelingInfo(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #28                 // String absorbType
         4: ldc           #30                 // class ext/mods/gameserver/enums/items/AbsorbCrystalType
         6: invokevirtual #32                 // Method ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
         9: checkcast     #30                 // class ext/mods/gameserver/enums/items/AbsorbCrystalType
        12: aload_1
        13: ldc           #38                 // String skill
        15: invokevirtual #40                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;)Z
        18: aload_1
        19: ldc           #44                 // String chanceStage
        21: invokevirtual #45                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        24: aload_1
        25: ldc           #49                 // String chanceBreak
        27: invokevirtual #45                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        30: aload_1
        31: ldc           #50                 // String levelList
        33: invokevirtual #51                 // Method ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;)[I
        36: invokespecial #55                 // Method "<init>":(Lext/mods/gameserver/enums/items/AbsorbCrystalType;ZII[I)V
        39: return
      LineNumberTable:
        line 36: 0
        line 37: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/records/LevelingInfo;
            0      40     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.LevelingInfo(ext.mods.gameserver.enums.items.AbsorbCrystalType, boolean, int, int, int[]);
    descriptor: (Lext/mods/gameserver/enums/items/AbsorbCrystalType;ZII[I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field absorbCrystalType:Lext/mods/gameserver/enums/items/AbsorbCrystalType;
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field isSkillRequired:Z
        14: aload_0
        15: iload_3
        16: putfield      #17                 // Field chanceStage:I
        19: aload_0
        20: iload         4
        22: putfield      #21                 // Field chanceBreak:I
        25: aload_0
        26: aload         5
        28: putfield      #24                 // Field levelList:[I
        31: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/records/LevelingInfo;
            0      32     1 absorbCrystalType   Lext/mods/gameserver/enums/items/AbsorbCrystalType;
            0      32     2 isSkillRequired   Z
            0      32     3 chanceStage   I
            0      32     4 chanceBreak   I
            0      32     5 levelList   [I
    MethodParameters:
      Name                           Flags
      absorbCrystalType
      isSkillRequired
      chanceStage
      chanceBreak
      levelList

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #58,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/LevelingInfo;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/LevelingInfo;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #62,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/LevelingInfo;)I
         6: ireturn
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/LevelingInfo;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #66,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/LevelingInfo;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/LevelingInfo;
            0       8     1     o   Ljava/lang/Object;

  public ext.mods.gameserver.enums.items.AbsorbCrystalType absorbCrystalType();
    descriptor: ()Lext/mods/gameserver/enums/items/AbsorbCrystalType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field absorbCrystalType:Lext/mods/gameserver/enums/items/AbsorbCrystalType;
         4: areturn
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/LevelingInfo;

  public boolean isSkillRequired();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field isSkillRequired:Z
         4: ireturn
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/LevelingInfo;

  public int chanceStage();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field chanceStage:I
         4: ireturn
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/LevelingInfo;

  public int chanceBreak();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field chanceBreak:I
         4: ireturn
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/LevelingInfo;

  public int[] levelList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field levelList:[I
         4: areturn
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/LevelingInfo;
}
SourceFile: "LevelingInfo.java"
  Record: length = 0x20 (unknown attribute)
   00 05 00 0B 00 0C 00 00 00 0F 00 10 00 00 00 13
   00 14 00 00 00 17 00 14 00 00 00 1A 00 1B 00 00

BootstrapMethods:
  0: #98 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/LevelingInfo
      #91 absorbCrystalType;isSkillRequired;chanceStage;chanceBreak;levelList
      #93 REF_getField ext/mods/gameserver/model/records/LevelingInfo.absorbCrystalType:Lext/mods/gameserver/enums/items/AbsorbCrystalType;
      #94 REF_getField ext/mods/gameserver/model/records/LevelingInfo.isSkillRequired:Z
      #95 REF_getField ext/mods/gameserver/model/records/LevelingInfo.chanceStage:I
      #96 REF_getField ext/mods/gameserver/model/records/LevelingInfo.chanceBreak:I
      #97 REF_getField ext/mods/gameserver/model/records/LevelingInfo.levelList:[I
InnerClasses:
  public static final #110= #106 of #108; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
