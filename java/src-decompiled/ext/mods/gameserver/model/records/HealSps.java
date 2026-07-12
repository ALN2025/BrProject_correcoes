// Bytecode for: ext.mods.gameserver.model.records.HealSps
// File: ext\mods\gameserver\model\records\HealSps.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/HealSps.class
  Last modified 9 de jul de 2026; size 2288 bytes
  MD5 checksum 5b66461a91fda016e11c46ef9e77d235
  Compiled from "HealSps.java"
public final class ext.mods.gameserver.model.records.HealSps extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/HealSps
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 5, methods: 10, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/HealSps.skillId:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/HealSps
   #9 = NameAndType        #11:#12        // skillId:I
  #10 = Utf8               ext/mods/gameserver/model/records/HealSps
  #11 = Utf8               skillId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/HealSps.skillLevel:I
  #14 = NameAndType        #15:#12        // skillLevel:I
  #15 = Utf8               skillLevel
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/HealSps.magicLevel:I
  #17 = NameAndType        #18:#12        // magicLevel:I
  #18 = Utf8               magicLevel
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/records/HealSps.correction:I
  #20 = NameAndType        #21:#12        // correction:I
  #21 = Utf8               correction
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/model/records/HealSps.neededMatk:I
  #23 = NameAndType        #24:#12        // neededMatk:I
  #24 = Utf8               neededMatk
  #25 = String             #11            // skillId
  #26 = Methodref          #27.#28        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #27 = Class              #29            // ext/mods/commons/data/StatSet
  #28 = NameAndType        #30:#31        // getInteger:(Ljava/lang/String;I)I
  #29 = Utf8               ext/mods/commons/data/StatSet
  #30 = Utf8               getInteger
  #31 = Utf8               (Ljava/lang/String;I)I
  #32 = String             #15            // skillLevel
  #33 = String             #18            // magicLevel
  #34 = String             #21            // correction
  #35 = Methodref          #27.#36        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #36 = NameAndType        #30:#37        // getInteger:(Ljava/lang/String;)I
  #37 = Utf8               (Ljava/lang/String;)I
  #38 = String             #24            // neededMatk
  #39 = Methodref          #8.#40         // ext/mods/gameserver/model/records/HealSps."<init>":(IIIII)V
  #40 = NameAndType        #5:#41         // "<init>":(IIIII)V
  #41 = Utf8               (IIIII)V
  #42 = InvokeDynamic      #0:#43         // #0:toString:(Lext/mods/gameserver/model/records/HealSps;)Ljava/lang/String;
  #43 = NameAndType        #44:#45        // toString:(Lext/mods/gameserver/model/records/HealSps;)Ljava/lang/String;
  #44 = Utf8               toString
  #45 = Utf8               (Lext/mods/gameserver/model/records/HealSps;)Ljava/lang/String;
  #46 = InvokeDynamic      #0:#47         // #0:hashCode:(Lext/mods/gameserver/model/records/HealSps;)I
  #47 = NameAndType        #48:#49        // hashCode:(Lext/mods/gameserver/model/records/HealSps;)I
  #48 = Utf8               hashCode
  #49 = Utf8               (Lext/mods/gameserver/model/records/HealSps;)I
  #50 = InvokeDynamic      #0:#51         // #0:equals:(Lext/mods/gameserver/model/records/HealSps;Ljava/lang/Object;)Z
  #51 = NameAndType        #52:#53        // equals:(Lext/mods/gameserver/model/records/HealSps;Ljava/lang/Object;)Z
  #52 = Utf8               equals
  #53 = Utf8               (Lext/mods/gameserver/model/records/HealSps;Ljava/lang/Object;)Z
  #54 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #55 = Utf8               Code
  #56 = Utf8               LineNumberTable
  #57 = Utf8               LocalVariableTable
  #58 = Utf8               this
  #59 = Utf8               Lext/mods/gameserver/model/records/HealSps;
  #60 = Utf8               set
  #61 = Utf8               Lext/mods/commons/data/StatSet;
  #62 = Utf8               MethodParameters
  #63 = Utf8               ()Ljava/lang/String;
  #64 = Utf8               ()I
  #65 = Utf8               (Ljava/lang/Object;)Z
  #66 = Utf8               o
  #67 = Utf8               Ljava/lang/Object;
  #68 = Utf8               SourceFile
  #69 = Utf8               HealSps.java
  #70 = Utf8               Record
  #71 = Utf8               BootstrapMethods
  #72 = String             #73            // skillId;skillLevel;magicLevel;correction;neededMatk
  #73 = Utf8               skillId;skillLevel;magicLevel;correction;neededMatk
  #74 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/HealSps.skillId:I
  #75 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/HealSps.skillLevel:I
  #76 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/HealSps.magicLevel:I
  #77 = MethodHandle       1:#19          // REF_getField ext/mods/gameserver/model/records/HealSps.correction:I
  #78 = MethodHandle       1:#22          // REF_getField ext/mods/gameserver/model/records/HealSps.neededMatk:I
  #79 = MethodHandle       6:#80          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #80 = Methodref          #81.#82        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #81 = Class              #83            // java/lang/runtime/ObjectMethods
  #82 = NameAndType        #84:#85        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #83 = Utf8               java/lang/runtime/ObjectMethods
  #84 = Utf8               bootstrap
  #85 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #86 = Utf8               InnerClasses
  #87 = Class              #88            // java/lang/invoke/MethodHandles$Lookup
  #88 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #89 = Class              #90            // java/lang/invoke/MethodHandles
  #90 = Utf8               java/lang/invoke/MethodHandles
  #91 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.HealSps(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #25                 // String skillId
         4: iconst_0
         5: invokevirtual #26                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
         8: aload_1
         9: ldc           #32                 // String skillLevel
        11: iconst_0
        12: invokevirtual #26                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        15: aload_1
        16: ldc           #33                 // String magicLevel
        18: iconst_0
        19: invokevirtual #26                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        22: aload_1
        23: ldc           #34                 // String correction
        25: invokevirtual #35                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        28: aload_1
        29: ldc           #38                 // String neededMatk
        31: invokevirtual #35                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        34: invokespecial #39                 // Method "<init>":(IIIII)V
        37: return
      LineNumberTable:
        line 26: 0
        line 27: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/records/HealSps;
            0      38     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.HealSps(int, int, int, int, int);
    descriptor: (IIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field skillId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field skillLevel:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field magicLevel:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field correction:I
        25: aload_0
        26: iload         5
        28: putfield      #22                 // Field neededMatk:I
        31: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/records/HealSps;
            0      32     1 skillId   I
            0      32     2 skillLevel   I
            0      32     3 magicLevel   I
            0      32     4 correction   I
            0      32     5 neededMatk   I
    MethodParameters:
      Name                           Flags
      skillId
      skillLevel
      magicLevel
      correction
      neededMatk

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #42,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/HealSps;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/HealSps;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #46,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/HealSps;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/HealSps;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #50,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/HealSps;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/HealSps;
            0       8     1     o   Ljava/lang/Object;

  public int skillId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field skillId:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/HealSps;

  public int skillLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field skillLevel:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/HealSps;

  public int magicLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field magicLevel:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/HealSps;

  public int correction();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field correction:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/HealSps;

  public int neededMatk();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field neededMatk:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/HealSps;
}
SourceFile: "HealSps.java"
  Record: length = 0x20 (unknown attribute)
   00 05 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00 00 15 00 0C 00 00 00 18 00 0C 00 00

BootstrapMethods:
  0: #79 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/HealSps
      #72 skillId;skillLevel;magicLevel;correction;neededMatk
      #74 REF_getField ext/mods/gameserver/model/records/HealSps.skillId:I
      #75 REF_getField ext/mods/gameserver/model/records/HealSps.skillLevel:I
      #76 REF_getField ext/mods/gameserver/model/records/HealSps.magicLevel:I
      #77 REF_getField ext/mods/gameserver/model/records/HealSps.correction:I
      #78 REF_getField ext/mods/gameserver/model/records/HealSps.neededMatk:I
InnerClasses:
  public static final #91= #87 of #89;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
