// Bytecode for: ext.mods.gameserver.model.records.SoulCrystal
// File: ext\mods\gameserver\model\records\SoulCrystal.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/SoulCrystal.class
  Last modified 9 de jul de 2026; size 2167 bytes
  MD5 checksum a0027999997d874e798390a5753939c4
  Compiled from "SoulCrystal.java"
public final class ext.mods.gameserver.model.records.SoulCrystal extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/SoulCrystal
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 4, methods: 9, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/SoulCrystal.level:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/SoulCrystal
   #9 = NameAndType        #11:#12        // level:I
  #10 = Utf8               ext/mods/gameserver/model/records/SoulCrystal
  #11 = Utf8               level
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/SoulCrystal.initialItemId:I
  #14 = NameAndType        #15:#12        // initialItemId:I
  #15 = Utf8               initialItemId
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/SoulCrystal.stagedItemId:I
  #17 = NameAndType        #18:#12        // stagedItemId:I
  #18 = Utf8               stagedItemId
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/records/SoulCrystal.brokenItemId:I
  #20 = NameAndType        #21:#12        // brokenItemId:I
  #21 = Utf8               brokenItemId
  #22 = String             #11            // level
  #23 = Methodref          #24.#25        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #24 = Class              #26            // ext/mods/commons/data/StatSet
  #25 = NameAndType        #27:#28        // getInteger:(Ljava/lang/String;)I
  #26 = Utf8               ext/mods/commons/data/StatSet
  #27 = Utf8               getInteger
  #28 = Utf8               (Ljava/lang/String;)I
  #29 = String             #30            // initial
  #30 = Utf8               initial
  #31 = String             #32            // staged
  #32 = Utf8               staged
  #33 = String             #34            // broken
  #34 = Utf8               broken
  #35 = Methodref          #8.#36         // ext/mods/gameserver/model/records/SoulCrystal."<init>":(IIII)V
  #36 = NameAndType        #5:#37         // "<init>":(IIII)V
  #37 = Utf8               (IIII)V
  #38 = InvokeDynamic      #0:#39         // #0:toString:(Lext/mods/gameserver/model/records/SoulCrystal;)Ljava/lang/String;
  #39 = NameAndType        #40:#41        // toString:(Lext/mods/gameserver/model/records/SoulCrystal;)Ljava/lang/String;
  #40 = Utf8               toString
  #41 = Utf8               (Lext/mods/gameserver/model/records/SoulCrystal;)Ljava/lang/String;
  #42 = InvokeDynamic      #0:#43         // #0:hashCode:(Lext/mods/gameserver/model/records/SoulCrystal;)I
  #43 = NameAndType        #44:#45        // hashCode:(Lext/mods/gameserver/model/records/SoulCrystal;)I
  #44 = Utf8               hashCode
  #45 = Utf8               (Lext/mods/gameserver/model/records/SoulCrystal;)I
  #46 = InvokeDynamic      #0:#47         // #0:equals:(Lext/mods/gameserver/model/records/SoulCrystal;Ljava/lang/Object;)Z
  #47 = NameAndType        #48:#49        // equals:(Lext/mods/gameserver/model/records/SoulCrystal;Ljava/lang/Object;)Z
  #48 = Utf8               equals
  #49 = Utf8               (Lext/mods/gameserver/model/records/SoulCrystal;Ljava/lang/Object;)Z
  #50 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #51 = Utf8               Code
  #52 = Utf8               LineNumberTable
  #53 = Utf8               LocalVariableTable
  #54 = Utf8               this
  #55 = Utf8               Lext/mods/gameserver/model/records/SoulCrystal;
  #56 = Utf8               set
  #57 = Utf8               Lext/mods/commons/data/StatSet;
  #58 = Utf8               MethodParameters
  #59 = Utf8               ()Ljava/lang/String;
  #60 = Utf8               ()I
  #61 = Utf8               (Ljava/lang/Object;)Z
  #62 = Utf8               o
  #63 = Utf8               Ljava/lang/Object;
  #64 = Utf8               SourceFile
  #65 = Utf8               SoulCrystal.java
  #66 = Utf8               Record
  #67 = Utf8               BootstrapMethods
  #68 = String             #69            // level;initialItemId;stagedItemId;brokenItemId
  #69 = Utf8               level;initialItemId;stagedItemId;brokenItemId
  #70 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/SoulCrystal.level:I
  #71 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/SoulCrystal.initialItemId:I
  #72 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/SoulCrystal.stagedItemId:I
  #73 = MethodHandle       1:#19          // REF_getField ext/mods/gameserver/model/records/SoulCrystal.brokenItemId:I
  #74 = MethodHandle       6:#75          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #75 = Methodref          #76.#77        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #76 = Class              #78            // java/lang/runtime/ObjectMethods
  #77 = NameAndType        #79:#80        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #78 = Utf8               java/lang/runtime/ObjectMethods
  #79 = Utf8               bootstrap
  #80 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #81 = Utf8               InnerClasses
  #82 = Class              #83            // java/lang/invoke/MethodHandles$Lookup
  #83 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #84 = Class              #85            // java/lang/invoke/MethodHandles
  #85 = Utf8               java/lang/invoke/MethodHandles
  #86 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.SoulCrystal(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #22                 // String level
         4: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #29                 // String initial
        10: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: aload_1
        14: ldc           #31                 // String staged
        16: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        19: aload_1
        20: ldc           #33                 // String broken
        22: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        25: invokespecial #35                 // Method "<init>":(IIII)V
        28: return
      LineNumberTable:
        line 33: 0
        line 34: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/records/SoulCrystal;
            0      29     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.SoulCrystal(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field level:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field initialItemId:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field stagedItemId:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field brokenItemId:I
        25: return
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/records/SoulCrystal;
            0      26     1 level   I
            0      26     2 initialItemId   I
            0      26     3 stagedItemId   I
            0      26     4 brokenItemId   I
    MethodParameters:
      Name                           Flags
      level
      initialItemId
      stagedItemId
      brokenItemId

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #38,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/SoulCrystal;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/SoulCrystal;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #42,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/SoulCrystal;)I
         6: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/SoulCrystal;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #46,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/SoulCrystal;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/SoulCrystal;
            0       8     1     o   Ljava/lang/Object;

  public int level();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field level:I
         4: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/SoulCrystal;

  public int initialItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field initialItemId:I
         4: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/SoulCrystal;

  public int stagedItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field stagedItemId:I
         4: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/SoulCrystal;

  public int brokenItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field brokenItemId:I
         4: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/SoulCrystal;
}
SourceFile: "SoulCrystal.java"
  Record: length = 0x1A (unknown attribute)
   00 04 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00 00 15 00 0C 00 00
BootstrapMethods:
  0: #74 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/SoulCrystal
      #68 level;initialItemId;stagedItemId;brokenItemId
      #70 REF_getField ext/mods/gameserver/model/records/SoulCrystal.level:I
      #71 REF_getField ext/mods/gameserver/model/records/SoulCrystal.initialItemId:I
      #72 REF_getField ext/mods/gameserver/model/records/SoulCrystal.stagedItemId:I
      #73 REF_getField ext/mods/gameserver/model/records/SoulCrystal.brokenItemId:I
InnerClasses:
  public static final #86= #82 of #84;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
