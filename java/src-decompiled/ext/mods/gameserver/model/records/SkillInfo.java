// Bytecode for: ext.mods.gameserver.model.records.SkillInfo
// File: ext\mods\gameserver\model\records\SkillInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/SkillInfo.class
  Last modified 9 de jul de 2026; size 1825 bytes
  MD5 checksum 84aa78f1f7392ba16027095585426097
  Compiled from "SkillInfo.java"
public final class ext.mods.gameserver.model.records.SkillInfo extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/SkillInfo
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 4, methods: 8, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/SkillInfo.id:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/SkillInfo
   #9 = NameAndType        #11:#12        // id:I
  #10 = Utf8               ext/mods/gameserver/model/records/SkillInfo
  #11 = Utf8               id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/SkillInfo.level:I
  #14 = NameAndType        #15:#12        // level:I
  #15 = Utf8               level
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/SkillInfo.isPassive:Z
  #17 = NameAndType        #18:#19        // isPassive:Z
  #18 = Utf8               isPassive
  #19 = Utf8               Z
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/model/records/SkillInfo.isDisabled:Z
  #21 = NameAndType        #22:#19        // isDisabled:Z
  #22 = Utf8               isDisabled
  #23 = InvokeDynamic      #0:#24         // #0:toString:(Lext/mods/gameserver/model/records/SkillInfo;)Ljava/lang/String;
  #24 = NameAndType        #25:#26        // toString:(Lext/mods/gameserver/model/records/SkillInfo;)Ljava/lang/String;
  #25 = Utf8               toString
  #26 = Utf8               (Lext/mods/gameserver/model/records/SkillInfo;)Ljava/lang/String;
  #27 = InvokeDynamic      #0:#28         // #0:hashCode:(Lext/mods/gameserver/model/records/SkillInfo;)I
  #28 = NameAndType        #29:#30        // hashCode:(Lext/mods/gameserver/model/records/SkillInfo;)I
  #29 = Utf8               hashCode
  #30 = Utf8               (Lext/mods/gameserver/model/records/SkillInfo;)I
  #31 = InvokeDynamic      #0:#32         // #0:equals:(Lext/mods/gameserver/model/records/SkillInfo;Ljava/lang/Object;)Z
  #32 = NameAndType        #33:#34        // equals:(Lext/mods/gameserver/model/records/SkillInfo;Ljava/lang/Object;)Z
  #33 = Utf8               equals
  #34 = Utf8               (Lext/mods/gameserver/model/records/SkillInfo;Ljava/lang/Object;)Z
  #35 = Utf8               (IIZZ)V
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lext/mods/gameserver/model/records/SkillInfo;
  #41 = Utf8               MethodParameters
  #42 = Utf8               ()Ljava/lang/String;
  #43 = Utf8               ()I
  #44 = Utf8               (Ljava/lang/Object;)Z
  #45 = Utf8               o
  #46 = Utf8               Ljava/lang/Object;
  #47 = Utf8               ()Z
  #48 = Utf8               SourceFile
  #49 = Utf8               SkillInfo.java
  #50 = Utf8               Record
  #51 = Utf8               BootstrapMethods
  #52 = String             #53            // id;level;isPassive;isDisabled
  #53 = Utf8               id;level;isPassive;isDisabled
  #54 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/SkillInfo.id:I
  #55 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/SkillInfo.level:I
  #56 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/SkillInfo.isPassive:Z
  #57 = MethodHandle       1:#20          // REF_getField ext/mods/gameserver/model/records/SkillInfo.isDisabled:Z
  #58 = MethodHandle       6:#59          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #59 = Methodref          #60.#61        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #60 = Class              #62            // java/lang/runtime/ObjectMethods
  #61 = NameAndType        #63:#64        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #62 = Utf8               java/lang/runtime/ObjectMethods
  #63 = Utf8               bootstrap
  #64 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #65 = Utf8               InnerClasses
  #66 = Class              #67            // java/lang/invoke/MethodHandles$Lookup
  #67 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #68 = Class              #69            // java/lang/invoke/MethodHandles
  #69 = Utf8               java/lang/invoke/MethodHandles
  #70 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.SkillInfo(int, int, boolean, boolean);
    descriptor: (IIZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field id:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field level:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field isPassive:Z
        19: aload_0
        20: iload         4
        22: putfield      #20                 // Field isDisabled:Z
        25: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/records/SkillInfo;
            0      26     1    id   I
            0      26     2 level   I
            0      26     3 isPassive   Z
            0      26     4 isDisabled   Z
    MethodParameters:
      Name                           Flags
      id
      level
      isPassive
      isDisabled

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #23,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/SkillInfo;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/SkillInfo;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #27,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/SkillInfo;)I
         6: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/SkillInfo;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #31,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/SkillInfo;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/SkillInfo;
            0       8     1     o   Ljava/lang/Object;

  public int id();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field id:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/SkillInfo;

  public int level();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field level:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/SkillInfo;

  public boolean isPassive();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field isPassive:Z
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/SkillInfo;

  public boolean isDisabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field isDisabled:Z
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/SkillInfo;
}
SourceFile: "SkillInfo.java"
  Record: length = 0x1A (unknown attribute)
   00 04 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 13 00 00 00 16 00 13 00 00
BootstrapMethods:
  0: #58 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/SkillInfo
      #52 id;level;isPassive;isDisabled
      #54 REF_getField ext/mods/gameserver/model/records/SkillInfo.id:I
      #55 REF_getField ext/mods/gameserver/model/records/SkillInfo.level:I
      #56 REF_getField ext/mods/gameserver/model/records/SkillInfo.isPassive:Z
      #57 REF_getField ext/mods/gameserver/model/records/SkillInfo.isDisabled:Z
InnerClasses:
  public static final #70= #66 of #68;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
