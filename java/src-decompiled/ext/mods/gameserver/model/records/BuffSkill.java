// Bytecode for: ext.mods.gameserver.model.records.BuffSkill
// File: ext\mods\gameserver\model\records\BuffSkill.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/BuffSkill.class
  Last modified 9 de jul de 2026; size 2358 bytes
  MD5 checksum d48c9e040485dc6788d1ee3e04c43d2e
  Compiled from "BuffSkill.java"
public final class ext.mods.gameserver.model.records.BuffSkill extends java.lang.Record implements ext.mods.gameserver.model.records.interfaces.ISkill
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/BuffSkill
  super_class: #2                         // java/lang/Record
  interfaces: 1, fields: 6, methods: 11, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/BuffSkill.id:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/BuffSkill
   #9 = NameAndType        #11:#12        // id:I
  #10 = Utf8               ext/mods/gameserver/model/records/BuffSkill
  #11 = Utf8               id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/BuffSkill.level:I
  #14 = NameAndType        #15:#12        // level:I
  #15 = Utf8               level
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/BuffSkill.price:I
  #17 = NameAndType        #18:#12        // price:I
  #18 = Utf8               price
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/records/BuffSkill.time:I
  #20 = NameAndType        #21:#12        // time:I
  #21 = Utf8               time
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/model/records/BuffSkill.type:Ljava/lang/String;
  #23 = NameAndType        #24:#25        // type:Ljava/lang/String;
  #24 = Utf8               type
  #25 = Utf8               Ljava/lang/String;
  #26 = Fieldref           #8.#27         // ext/mods/gameserver/model/records/BuffSkill.description:Ljava/lang/String;
  #27 = NameAndType        #28:#25        // description:Ljava/lang/String;
  #28 = Utf8               description
  #29 = Methodref          #8.#30         // ext/mods/gameserver/model/records/BuffSkill.getL2Skill:(II)Lext/mods/gameserver/skills/L2Skill;
  #30 = NameAndType        #31:#32        // getL2Skill:(II)Lext/mods/gameserver/skills/L2Skill;
  #31 = Utf8               getL2Skill
  #32 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #33 = InvokeDynamic      #0:#34         // #0:toString:(Lext/mods/gameserver/model/records/BuffSkill;)Ljava/lang/String;
  #34 = NameAndType        #35:#36        // toString:(Lext/mods/gameserver/model/records/BuffSkill;)Ljava/lang/String;
  #35 = Utf8               toString
  #36 = Utf8               (Lext/mods/gameserver/model/records/BuffSkill;)Ljava/lang/String;
  #37 = InvokeDynamic      #0:#38         // #0:hashCode:(Lext/mods/gameserver/model/records/BuffSkill;)I
  #38 = NameAndType        #39:#40        // hashCode:(Lext/mods/gameserver/model/records/BuffSkill;)I
  #39 = Utf8               hashCode
  #40 = Utf8               (Lext/mods/gameserver/model/records/BuffSkill;)I
  #41 = InvokeDynamic      #0:#42         // #0:equals:(Lext/mods/gameserver/model/records/BuffSkill;Ljava/lang/Object;)Z
  #42 = NameAndType        #43:#44        // equals:(Lext/mods/gameserver/model/records/BuffSkill;Ljava/lang/Object;)Z
  #43 = Utf8               equals
  #44 = Utf8               (Lext/mods/gameserver/model/records/BuffSkill;Ljava/lang/Object;)Z
  #45 = Class              #46            // ext/mods/gameserver/model/records/interfaces/ISkill
  #46 = Utf8               ext/mods/gameserver/model/records/interfaces/ISkill
  #47 = Utf8               (IIIILjava/lang/String;Ljava/lang/String;)V
  #48 = Utf8               Code
  #49 = Utf8               LineNumberTable
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               this
  #52 = Utf8               Lext/mods/gameserver/model/records/BuffSkill;
  #53 = Utf8               MethodParameters
  #54 = Utf8               getSkill
  #55 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #56 = Utf8               ()Ljava/lang/String;
  #57 = Utf8               ()I
  #58 = Utf8               (Ljava/lang/Object;)Z
  #59 = Utf8               o
  #60 = Utf8               Ljava/lang/Object;
  #61 = Utf8               SourceFile
  #62 = Utf8               BuffSkill.java
  #63 = Utf8               Record
  #64 = Utf8               BootstrapMethods
  #65 = String             #66            // id;level;price;time;type;description
  #66 = Utf8               id;level;price;time;type;description
  #67 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/BuffSkill.id:I
  #68 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/BuffSkill.level:I
  #69 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/BuffSkill.price:I
  #70 = MethodHandle       1:#19          // REF_getField ext/mods/gameserver/model/records/BuffSkill.time:I
  #71 = MethodHandle       1:#22          // REF_getField ext/mods/gameserver/model/records/BuffSkill.type:Ljava/lang/String;
  #72 = MethodHandle       1:#26          // REF_getField ext/mods/gameserver/model/records/BuffSkill.description:Ljava/lang/String;
  #73 = MethodHandle       6:#74          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #74 = Methodref          #75.#76        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #75 = Class              #77            // java/lang/runtime/ObjectMethods
  #76 = NameAndType        #78:#79        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #77 = Utf8               java/lang/runtime/ObjectMethods
  #78 = Utf8               bootstrap
  #79 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #80 = Utf8               InnerClasses
  #81 = Class              #82            // java/lang/invoke/MethodHandles$Lookup
  #82 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #83 = Class              #84            // java/lang/invoke/MethodHandles
  #84 = Utf8               java/lang/invoke/MethodHandles
  #85 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.BuffSkill(int, int, int, int, java.lang.String, java.lang.String);
    descriptor: (IIIILjava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=7
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
        16: putfield      #16                 // Field price:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field time:I
        25: aload_0
        26: aload         5
        28: putfield      #22                 // Field type:Ljava/lang/String;
        31: aload_0
        32: aload         6
        34: putfield      #26                 // Field description:Ljava/lang/String;
        37: return
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/records/BuffSkill;
            0      38     1    id   I
            0      38     2 level   I
            0      38     3 price   I
            0      38     4  time   I
            0      38     5  type   Ljava/lang/String;
            0      38     6 description   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      id
      level
      price
      time
      type
      description

  public ext.mods.gameserver.skills.L2Skill getSkill();
    descriptor: ()Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #7                  // Field id:I
         5: aload_0
         6: getfield      #13                 // Field level:I
         9: invokevirtual #29                 // Method getL2Skill:(II)Lext/mods/gameserver/skills/L2Skill;
        12: areturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/records/BuffSkill;

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #33,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/BuffSkill;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/BuffSkill;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #37,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/BuffSkill;)I
         6: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/BuffSkill;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #41,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/BuffSkill;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/BuffSkill;
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
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/BuffSkill;

  public int level();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field level:I
         4: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/BuffSkill;

  public int price();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field price:I
         4: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/BuffSkill;

  public int time();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field time:I
         4: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/BuffSkill;

  public java.lang.String type();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field type:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/BuffSkill;

  public java.lang.String description();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field description:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/BuffSkill;
}
SourceFile: "BuffSkill.java"
  Record: length = 0x26 (unknown attribute)
   00 06 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00 00 15 00 0C 00 00 00 18 00 19 00 00
   00 1C 00 19 00 00
BootstrapMethods:
  0: #73 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/BuffSkill
      #65 id;level;price;time;type;description
      #67 REF_getField ext/mods/gameserver/model/records/BuffSkill.id:I
      #68 REF_getField ext/mods/gameserver/model/records/BuffSkill.level:I
      #69 REF_getField ext/mods/gameserver/model/records/BuffSkill.price:I
      #70 REF_getField ext/mods/gameserver/model/records/BuffSkill.time:I
      #71 REF_getField ext/mods/gameserver/model/records/BuffSkill.type:Ljava/lang/String;
      #72 REF_getField ext/mods/gameserver/model/records/BuffSkill.description:Ljava/lang/String;
InnerClasses:
  public static final #85= #81 of #83;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
