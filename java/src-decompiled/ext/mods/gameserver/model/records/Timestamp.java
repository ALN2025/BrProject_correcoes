// Bytecode for: ext.mods.gameserver.model.records.Timestamp
// File: ext\mods\gameserver\model\records\Timestamp.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/Timestamp.class
  Last modified 9 de jul de 2026; size 2574 bytes
  MD5 checksum 23b244ccc87e74b7f4b54972871a71cb
  Compiled from "Timestamp.java"
public final class ext.mods.gameserver.model.records.Timestamp extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/Timestamp
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 4, methods: 12, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Record."<init>":()V
    #2 = Class              #4            // java/lang/Record
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Record
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/records/Timestamp.skillId:I
    #8 = Class              #10           // ext/mods/gameserver/model/records/Timestamp
    #9 = NameAndType        #11:#12       // skillId:I
   #10 = Utf8               ext/mods/gameserver/model/records/Timestamp
   #11 = Utf8               skillId
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/records/Timestamp.skillLevel:I
   #14 = NameAndType        #15:#12       // skillLevel:I
   #15 = Utf8               skillLevel
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/model/records/Timestamp.reuse:J
   #17 = NameAndType        #18:#19       // reuse:J
   #18 = Utf8               reuse
   #19 = Utf8               J
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/model/records/Timestamp.stamp:J
   #21 = NameAndType        #22:#19       // stamp:J
   #22 = Utf8               stamp
   #23 = Methodref          #24.#25       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #24 = Class              #26           // ext/mods/gameserver/skills/L2Skill
   #25 = NameAndType        #27:#28       // getId:()I
   #26 = Utf8               ext/mods/gameserver/skills/L2Skill
   #27 = Utf8               getId
   #28 = Utf8               ()I
   #29 = Methodref          #24.#30       // ext/mods/gameserver/skills/L2Skill.getLevel:()I
   #30 = NameAndType        #31:#28       // getLevel:()I
   #31 = Utf8               getLevel
   #32 = Methodref          #33.#34       // java/lang/System.currentTimeMillis:()J
   #33 = Class              #35           // java/lang/System
   #34 = NameAndType        #36:#37       // currentTimeMillis:()J
   #35 = Utf8               java/lang/System
   #36 = Utf8               currentTimeMillis
   #37 = Utf8               ()J
   #38 = Methodref          #8.#39        // ext/mods/gameserver/model/records/Timestamp."<init>":(IIJJ)V
   #39 = NameAndType        #5:#40        // "<init>":(IIJJ)V
   #40 = Utf8               (IIJJ)V
   #41 = Methodref          #42.#43       // java/lang/Math.max:(JJ)J
   #42 = Class              #44           // java/lang/Math
   #43 = NameAndType        #45:#46       // max:(JJ)J
   #44 = Utf8               java/lang/Math
   #45 = Utf8               max
   #46 = Utf8               (JJ)J
   #47 = InvokeDynamic      #0:#48        // #0:toString:(Lext/mods/gameserver/model/records/Timestamp;)Ljava/lang/String;
   #48 = NameAndType        #49:#50       // toString:(Lext/mods/gameserver/model/records/Timestamp;)Ljava/lang/String;
   #49 = Utf8               toString
   #50 = Utf8               (Lext/mods/gameserver/model/records/Timestamp;)Ljava/lang/String;
   #51 = InvokeDynamic      #0:#52        // #0:hashCode:(Lext/mods/gameserver/model/records/Timestamp;)I
   #52 = NameAndType        #53:#54       // hashCode:(Lext/mods/gameserver/model/records/Timestamp;)I
   #53 = Utf8               hashCode
   #54 = Utf8               (Lext/mods/gameserver/model/records/Timestamp;)I
   #55 = InvokeDynamic      #0:#56        // #0:equals:(Lext/mods/gameserver/model/records/Timestamp;Ljava/lang/Object;)Z
   #56 = NameAndType        #57:#58       // equals:(Lext/mods/gameserver/model/records/Timestamp;Ljava/lang/Object;)Z
   #57 = Utf8               equals
   #58 = Utf8               (Lext/mods/gameserver/model/records/Timestamp;Ljava/lang/Object;)Z
   #59 = Utf8               (Lext/mods/gameserver/skills/L2Skill;J)V
   #60 = Utf8               Code
   #61 = Utf8               LineNumberTable
   #62 = Utf8               LocalVariableTable
   #63 = Utf8               this
   #64 = Utf8               Lext/mods/gameserver/model/records/Timestamp;
   #65 = Utf8               skill
   #66 = Utf8               Lext/mods/gameserver/skills/L2Skill;
   #67 = Utf8               reuse2
   #68 = Utf8               (Lext/mods/gameserver/skills/L2Skill;JJ)V
   #69 = Utf8               stamp2
   #70 = Utf8               MethodParameters
   #71 = Utf8               getRemaining
   #72 = Utf8               hasNotPassed
   #73 = Utf8               ()Z
   #74 = Utf8               StackMapTable
   #75 = Utf8               ()Ljava/lang/String;
   #76 = Utf8               (Ljava/lang/Object;)Z
   #77 = Utf8               o
   #78 = Utf8               Ljava/lang/Object;
   #79 = Utf8               SourceFile
   #80 = Utf8               Timestamp.java
   #81 = Utf8               Record
   #82 = Utf8               BootstrapMethods
   #83 = String             #84           // skillId;skillLevel;reuse;stamp
   #84 = Utf8               skillId;skillLevel;reuse;stamp
   #85 = MethodHandle       1:#7          // REF_getField ext/mods/gameserver/model/records/Timestamp.skillId:I
   #86 = MethodHandle       1:#13         // REF_getField ext/mods/gameserver/model/records/Timestamp.skillLevel:I
   #87 = MethodHandle       1:#16         // REF_getField ext/mods/gameserver/model/records/Timestamp.reuse:J
   #88 = MethodHandle       1:#20         // REF_getField ext/mods/gameserver/model/records/Timestamp.stamp:J
   #89 = MethodHandle       6:#90         // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #90 = Methodref          #91.#92       // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #91 = Class              #93           // java/lang/runtime/ObjectMethods
   #92 = NameAndType        #94:#95       // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #93 = Utf8               java/lang/runtime/ObjectMethods
   #94 = Utf8               bootstrap
   #95 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #96 = Utf8               InnerClasses
   #97 = Class              #98           // java/lang/invoke/MethodHandles$Lookup
   #98 = Utf8               java/lang/invoke/MethodHandles$Lookup
   #99 = Class              #100          // java/lang/invoke/MethodHandles
  #100 = Utf8               java/lang/invoke/MethodHandles
  #101 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.Timestamp(ext.mods.gameserver.skills.L2Skill, long);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #23                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
         5: aload_1
         6: invokevirtual #29                 // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
         9: lload_2
        10: invokestatic  #32                 // Method java/lang/System.currentTimeMillis:()J
        13: lload_2
        14: ladd
        15: invokespecial #38                 // Method "<init>":(IIJJ)V
        18: return
      LineNumberTable:
        line 26: 0
        line 27: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/records/Timestamp;
            0      19     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0      19     2 reuse2   J

  public ext.mods.gameserver.model.records.Timestamp(ext.mods.gameserver.skills.L2Skill, long, long);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;JJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=4
         0: aload_0
         1: aload_1
         2: invokevirtual #23                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
         5: aload_1
         6: invokevirtual #29                 // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
         9: lload_2
        10: lload         4
        12: invokespecial #38                 // Method "<init>":(IIJJ)V
        15: return
      LineNumberTable:
        line 31: 0
        line 32: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/records/Timestamp;
            0      16     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0      16     2 reuse2   J
            0      16     4 stamp2   J

  public ext.mods.gameserver.model.records.Timestamp(int, int, long, long);
    descriptor: (IIJJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field skillId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field skillLevel:I
        14: aload_0
        15: lload_3
        16: putfield      #16                 // Field reuse:J
        19: aload_0
        20: lload         5
        22: putfield      #20                 // Field stamp:J
        25: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/records/Timestamp;
            0      26     1 skillId   I
            0      26     2 skillLevel   I
            0      26     3 reuse   J
            0      26     5 stamp   J
    MethodParameters:
      Name                           Flags
      skillId
      skillLevel
      reuse
      stamp

  public long getRemaining();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field stamp:J
         4: invokestatic  #32                 // Method java/lang/System.currentTimeMillis:()J
         7: lsub
         8: lconst_0
         9: invokestatic  #41                 // Method java/lang/Math.max:(JJ)J
        12: lreturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/records/Timestamp;

  public boolean hasNotPassed();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: invokestatic  #32                 // Method java/lang/System.currentTimeMillis:()J
         3: aload_0
         4: getfield      #20                 // Field stamp:J
         7: lcmp
         8: ifge          15
        11: iconst_1
        12: goto          16
        15: iconst_0
        16: ireturn
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/records/Timestamp;
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #47,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/Timestamp;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/Timestamp;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #51,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/Timestamp;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/Timestamp;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #55,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/Timestamp;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/Timestamp;
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
            0       5     0  this   Lext/mods/gameserver/model/records/Timestamp;

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
            0       5     0  this   Lext/mods/gameserver/model/records/Timestamp;

  public long reuse();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field reuse:J
         4: lreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Timestamp;

  public long stamp();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field stamp:J
         4: lreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Timestamp;
}
SourceFile: "Timestamp.java"
  Record: length = 0x1A (unknown attribute)
   00 04 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 13 00 00 00 16 00 13 00 00
BootstrapMethods:
  0: #89 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/Timestamp
      #83 skillId;skillLevel;reuse;stamp
      #85 REF_getField ext/mods/gameserver/model/records/Timestamp.skillId:I
      #86 REF_getField ext/mods/gameserver/model/records/Timestamp.skillLevel:I
      #87 REF_getField ext/mods/gameserver/model/records/Timestamp.reuse:J
      #88 REF_getField ext/mods/gameserver/model/records/Timestamp.stamp:J
InnerClasses:
  public static final #101= #97 of #99;   // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
