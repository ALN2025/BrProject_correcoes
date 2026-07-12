// Bytecode for: ext.mods.gameserver.model.records.NewbieBuff
// File: ext\mods\gameserver\model\records\NewbieBuff.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/NewbieBuff.class
  Last modified 9 de jul de 2026; size 2572 bytes
  MD5 checksum 4a32c7a923b914f46103f86a810cb152
  Compiled from "NewbieBuff.java"
public final class ext.mods.gameserver.model.records.NewbieBuff extends java.lang.Record implements ext.mods.gameserver.model.records.interfaces.ISkill
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/NewbieBuff
  super_class: #2                         // java/lang/Record
  interfaces: 1, fields: 5, methods: 11, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Record."<init>":()V
    #2 = Class              #4            // java/lang/Record
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Record
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/records/NewbieBuff.skillId:I
    #8 = Class              #10           // ext/mods/gameserver/model/records/NewbieBuff
    #9 = NameAndType        #11:#12       // skillId:I
   #10 = Utf8               ext/mods/gameserver/model/records/NewbieBuff
   #11 = Utf8               skillId
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/records/NewbieBuff.skillLevel:I
   #14 = NameAndType        #15:#12       // skillLevel:I
   #15 = Utf8               skillLevel
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/model/records/NewbieBuff.lowerLevel:I
   #17 = NameAndType        #18:#12       // lowerLevel:I
   #18 = Utf8               lowerLevel
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/model/records/NewbieBuff.upperLevel:I
   #20 = NameAndType        #21:#12       // upperLevel:I
   #21 = Utf8               upperLevel
   #22 = Fieldref           #8.#23        // ext/mods/gameserver/model/records/NewbieBuff.isMagicClass:Z
   #23 = NameAndType        #24:#25       // isMagicClass:Z
   #24 = Utf8               isMagicClass
   #25 = Utf8               Z
   #26 = String             #11           // skillId
   #27 = Methodref          #28.#29       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #28 = Class              #30           // ext/mods/commons/data/StatSet
   #29 = NameAndType        #31:#32       // getInteger:(Ljava/lang/String;)I
   #30 = Utf8               ext/mods/commons/data/StatSet
   #31 = Utf8               getInteger
   #32 = Utf8               (Ljava/lang/String;)I
   #33 = String             #15           // skillLevel
   #34 = String             #18           // lowerLevel
   #35 = String             #21           // upperLevel
   #36 = String             #24           // isMagicClass
   #37 = Methodref          #28.#38       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;)Z
   #38 = NameAndType        #39:#40       // getBool:(Ljava/lang/String;)Z
   #39 = Utf8               getBool
   #40 = Utf8               (Ljava/lang/String;)Z
   #41 = Methodref          #8.#42        // ext/mods/gameserver/model/records/NewbieBuff."<init>":(IIIIZ)V
   #42 = NameAndType        #5:#43        // "<init>":(IIIIZ)V
   #43 = Utf8               (IIIIZ)V
   #44 = Methodref          #8.#45        // ext/mods/gameserver/model/records/NewbieBuff.getL2Skill:(II)Lext/mods/gameserver/skills/L2Skill;
   #45 = NameAndType        #46:#47       // getL2Skill:(II)Lext/mods/gameserver/skills/L2Skill;
   #46 = Utf8               getL2Skill
   #47 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #48 = InvokeDynamic      #0:#49        // #0:toString:(Lext/mods/gameserver/model/records/NewbieBuff;)Ljava/lang/String;
   #49 = NameAndType        #50:#51       // toString:(Lext/mods/gameserver/model/records/NewbieBuff;)Ljava/lang/String;
   #50 = Utf8               toString
   #51 = Utf8               (Lext/mods/gameserver/model/records/NewbieBuff;)Ljava/lang/String;
   #52 = InvokeDynamic      #0:#53        // #0:hashCode:(Lext/mods/gameserver/model/records/NewbieBuff;)I
   #53 = NameAndType        #54:#55       // hashCode:(Lext/mods/gameserver/model/records/NewbieBuff;)I
   #54 = Utf8               hashCode
   #55 = Utf8               (Lext/mods/gameserver/model/records/NewbieBuff;)I
   #56 = InvokeDynamic      #0:#57        // #0:equals:(Lext/mods/gameserver/model/records/NewbieBuff;Ljava/lang/Object;)Z
   #57 = NameAndType        #58:#59       // equals:(Lext/mods/gameserver/model/records/NewbieBuff;Ljava/lang/Object;)Z
   #58 = Utf8               equals
   #59 = Utf8               (Lext/mods/gameserver/model/records/NewbieBuff;Ljava/lang/Object;)Z
   #60 = Class              #61           // ext/mods/gameserver/model/records/interfaces/ISkill
   #61 = Utf8               ext/mods/gameserver/model/records/interfaces/ISkill
   #62 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #63 = Utf8               Code
   #64 = Utf8               LineNumberTable
   #65 = Utf8               LocalVariableTable
   #66 = Utf8               this
   #67 = Utf8               Lext/mods/gameserver/model/records/NewbieBuff;
   #68 = Utf8               set
   #69 = Utf8               Lext/mods/commons/data/StatSet;
   #70 = Utf8               MethodParameters
   #71 = Utf8               getSkill
   #72 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #73 = Utf8               ()Ljava/lang/String;
   #74 = Utf8               ()I
   #75 = Utf8               (Ljava/lang/Object;)Z
   #76 = Utf8               o
   #77 = Utf8               Ljava/lang/Object;
   #78 = Utf8               ()Z
   #79 = Utf8               SourceFile
   #80 = Utf8               NewbieBuff.java
   #81 = Utf8               Record
   #82 = Utf8               BootstrapMethods
   #83 = String             #84           // skillId;skillLevel;lowerLevel;upperLevel;isMagicClass
   #84 = Utf8               skillId;skillLevel;lowerLevel;upperLevel;isMagicClass
   #85 = MethodHandle       1:#7          // REF_getField ext/mods/gameserver/model/records/NewbieBuff.skillId:I
   #86 = MethodHandle       1:#13         // REF_getField ext/mods/gameserver/model/records/NewbieBuff.skillLevel:I
   #87 = MethodHandle       1:#16         // REF_getField ext/mods/gameserver/model/records/NewbieBuff.lowerLevel:I
   #88 = MethodHandle       1:#19         // REF_getField ext/mods/gameserver/model/records/NewbieBuff.upperLevel:I
   #89 = MethodHandle       1:#22         // REF_getField ext/mods/gameserver/model/records/NewbieBuff.isMagicClass:Z
   #90 = MethodHandle       6:#91         // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #91 = Methodref          #92.#93       // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #92 = Class              #94           // java/lang/runtime/ObjectMethods
   #93 = NameAndType        #95:#96       // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #94 = Utf8               java/lang/runtime/ObjectMethods
   #95 = Utf8               bootstrap
   #96 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #97 = Utf8               InnerClasses
   #98 = Class              #99           // java/lang/invoke/MethodHandles$Lookup
   #99 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #100 = Class              #101          // java/lang/invoke/MethodHandles
  #101 = Utf8               java/lang/invoke/MethodHandles
  #102 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.NewbieBuff(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #26                 // String skillId
         4: invokevirtual #27                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #33                 // String skillLevel
        10: invokevirtual #27                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: aload_1
        14: ldc           #34                 // String lowerLevel
        16: invokevirtual #27                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        19: aload_1
        20: ldc           #35                 // String upperLevel
        22: invokevirtual #27                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        25: aload_1
        26: ldc           #36                 // String isMagicClass
        28: invokevirtual #37                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;)Z
        31: invokespecial #41                 // Method "<init>":(IIIIZ)V
        34: return
      LineNumberTable:
        line 29: 0
        line 30: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/records/NewbieBuff;
            0      35     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.NewbieBuff(int, int, int, int, boolean);
    descriptor: (IIIIZ)V
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
        16: putfield      #16                 // Field lowerLevel:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field upperLevel:I
        25: aload_0
        26: iload         5
        28: putfield      #22                 // Field isMagicClass:Z
        31: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/records/NewbieBuff;
            0      32     1 skillId   I
            0      32     2 skillLevel   I
            0      32     3 lowerLevel   I
            0      32     4 upperLevel   I
            0      32     5 isMagicClass   Z
    MethodParameters:
      Name                           Flags
      skillId
      skillLevel
      lowerLevel
      upperLevel
      isMagicClass

  public ext.mods.gameserver.skills.L2Skill getSkill();
    descriptor: ()Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #7                  // Field skillId:I
         5: aload_0
         6: getfield      #13                 // Field skillLevel:I
         9: invokevirtual #44                 // Method getL2Skill:(II)Lext/mods/gameserver/skills/L2Skill;
        12: areturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/records/NewbieBuff;

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #48,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/NewbieBuff;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/NewbieBuff;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #52,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/NewbieBuff;)I
         6: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/NewbieBuff;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #56,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/NewbieBuff;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/NewbieBuff;
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
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/NewbieBuff;

  public int skillLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field skillLevel:I
         4: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/NewbieBuff;

  public int lowerLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field lowerLevel:I
         4: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/NewbieBuff;

  public int upperLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field upperLevel:I
         4: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/NewbieBuff;

  public boolean isMagicClass();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field isMagicClass:Z
         4: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/NewbieBuff;
}
SourceFile: "NewbieBuff.java"
  Record: length = 0x20 (unknown attribute)
   00 05 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00 00 15 00 0C 00 00 00 18 00 19 00 00

BootstrapMethods:
  0: #90 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/NewbieBuff
      #83 skillId;skillLevel;lowerLevel;upperLevel;isMagicClass
      #85 REF_getField ext/mods/gameserver/model/records/NewbieBuff.skillId:I
      #86 REF_getField ext/mods/gameserver/model/records/NewbieBuff.skillLevel:I
      #87 REF_getField ext/mods/gameserver/model/records/NewbieBuff.lowerLevel:I
      #88 REF_getField ext/mods/gameserver/model/records/NewbieBuff.upperLevel:I
      #89 REF_getField ext/mods/gameserver/model/records/NewbieBuff.isMagicClass:Z
InnerClasses:
  public static final #102= #98 of #100;  // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
