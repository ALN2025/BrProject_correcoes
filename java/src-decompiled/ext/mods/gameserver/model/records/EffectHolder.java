// Bytecode for: ext.mods.gameserver.model.records.EffectHolder
// File: ext\mods\gameserver\model\records\EffectHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/EffectHolder.class
  Last modified 9 de jul de 2026; size 1977 bytes
  MD5 checksum b6de87f1287cd8201c50999a5ee925e8
  Compiled from "EffectHolder.java"
public final class ext.mods.gameserver.model.records.EffectHolder extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/EffectHolder
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 3, methods: 8, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/EffectHolder.id:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/EffectHolder
   #9 = NameAndType        #11:#12        // id:I
  #10 = Utf8               ext/mods/gameserver/model/records/EffectHolder
  #11 = Utf8               id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/EffectHolder.level:I
  #14 = NameAndType        #15:#12        // level:I
  #15 = Utf8               level
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/EffectHolder.duration:I
  #17 = NameAndType        #18:#12        // duration:I
  #18 = Utf8               duration
  #19 = Methodref          #20.#21        // ext/mods/gameserver/skills/L2Skill.getId:()I
  #20 = Class              #22            // ext/mods/gameserver/skills/L2Skill
  #21 = NameAndType        #23:#24        // getId:()I
  #22 = Utf8               ext/mods/gameserver/skills/L2Skill
  #23 = Utf8               getId
  #24 = Utf8               ()I
  #25 = Methodref          #20.#26        // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #26 = NameAndType        #27:#24        // getLevel:()I
  #27 = Utf8               getLevel
  #28 = Methodref          #8.#29         // ext/mods/gameserver/model/records/EffectHolder."<init>":(III)V
  #29 = NameAndType        #5:#30         // "<init>":(III)V
  #30 = Utf8               (III)V
  #31 = InvokeDynamic      #0:#32         // #0:toString:(Lext/mods/gameserver/model/records/EffectHolder;)Ljava/lang/String;
  #32 = NameAndType        #33:#34        // toString:(Lext/mods/gameserver/model/records/EffectHolder;)Ljava/lang/String;
  #33 = Utf8               toString
  #34 = Utf8               (Lext/mods/gameserver/model/records/EffectHolder;)Ljava/lang/String;
  #35 = InvokeDynamic      #0:#36         // #0:hashCode:(Lext/mods/gameserver/model/records/EffectHolder;)I
  #36 = NameAndType        #37:#38        // hashCode:(Lext/mods/gameserver/model/records/EffectHolder;)I
  #37 = Utf8               hashCode
  #38 = Utf8               (Lext/mods/gameserver/model/records/EffectHolder;)I
  #39 = InvokeDynamic      #0:#40         // #0:equals:(Lext/mods/gameserver/model/records/EffectHolder;Ljava/lang/Object;)Z
  #40 = NameAndType        #41:#42        // equals:(Lext/mods/gameserver/model/records/EffectHolder;Ljava/lang/Object;)Z
  #41 = Utf8               equals
  #42 = Utf8               (Lext/mods/gameserver/model/records/EffectHolder;Ljava/lang/Object;)Z
  #43 = Utf8               (Lext/mods/gameserver/skills/L2Skill;I)V
  #44 = Utf8               Code
  #45 = Utf8               LineNumberTable
  #46 = Utf8               LocalVariableTable
  #47 = Utf8               this
  #48 = Utf8               Lext/mods/gameserver/model/records/EffectHolder;
  #49 = Utf8               skill
  #50 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #51 = Utf8               period
  #52 = Utf8               MethodParameters
  #53 = Utf8               ()Ljava/lang/String;
  #54 = Utf8               (Ljava/lang/Object;)Z
  #55 = Utf8               o
  #56 = Utf8               Ljava/lang/Object;
  #57 = Utf8               SourceFile
  #58 = Utf8               EffectHolder.java
  #59 = Utf8               Record
  #60 = Utf8               BootstrapMethods
  #61 = String             #62            // id;level;duration
  #62 = Utf8               id;level;duration
  #63 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/EffectHolder.id:I
  #64 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/EffectHolder.level:I
  #65 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/EffectHolder.duration:I
  #66 = MethodHandle       6:#67          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #67 = Methodref          #68.#69        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #68 = Class              #70            // java/lang/runtime/ObjectMethods
  #69 = NameAndType        #71:#72        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #70 = Utf8               java/lang/runtime/ObjectMethods
  #71 = Utf8               bootstrap
  #72 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #73 = Utf8               InnerClasses
  #74 = Class              #75            // java/lang/invoke/MethodHandles$Lookup
  #75 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #76 = Class              #77            // java/lang/invoke/MethodHandles
  #77 = Utf8               java/lang/invoke/MethodHandles
  #78 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.EffectHolder(ext.mods.gameserver.skills.L2Skill, int);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #19                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
         5: aload_1
         6: invokevirtual #25                 // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
         9: iload_2
        10: invokespecial #28                 // Method "<init>":(III)V
        13: return
      LineNumberTable:
        line 26: 0
        line 27: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/records/EffectHolder;
            0      14     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0      14     2 period   I

  public ext.mods.gameserver.model.records.EffectHolder(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
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
        16: putfield      #16                 // Field duration:I
        19: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/records/EffectHolder;
            0      20     1    id   I
            0      20     2 level   I
            0      20     3 duration   I
    MethodParameters:
      Name                           Flags
      id
      level
      duration

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #31,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/EffectHolder;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/EffectHolder;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #35,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/EffectHolder;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/EffectHolder;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #39,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/EffectHolder;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/EffectHolder;
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
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/EffectHolder;

  public int level();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field level:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/EffectHolder;

  public int duration();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field duration:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/EffectHolder;
}
SourceFile: "EffectHolder.java"
  Record: length = 0x14 (unknown attribute)
   00 03 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00
BootstrapMethods:
  0: #66 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/EffectHolder
      #61 id;level;duration
      #63 REF_getField ext/mods/gameserver/model/records/EffectHolder.id:I
      #64 REF_getField ext/mods/gameserver/model/records/EffectHolder.level:I
      #65 REF_getField ext/mods/gameserver/model/records/EffectHolder.duration:I
InnerClasses:
  public static final #78= #74 of #76;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
