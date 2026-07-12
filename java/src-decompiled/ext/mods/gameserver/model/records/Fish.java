// Bytecode for: ext.mods.gameserver.model.records.Fish
// File: ext\mods\gameserver\model\records\Fish.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/Fish.class
  Last modified 9 de jul de 2026; size 3212 bytes
  MD5 checksum 4c49886c899b3849c5e8866c0524ec11
  Compiled from "Fish.java"
public final class ext.mods.gameserver.model.records.Fish extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/Fish
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 10, methods: 16, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Record."<init>":()V
    #2 = Class              #4            // java/lang/Record
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Record
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/records/Fish.id:I
    #8 = Class              #10           // ext/mods/gameserver/model/records/Fish
    #9 = NameAndType        #11:#12       // id:I
   #10 = Utf8               ext/mods/gameserver/model/records/Fish
   #11 = Utf8               id
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/records/Fish.level:I
   #14 = NameAndType        #15:#12       // level:I
   #15 = Utf8               level
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/model/records/Fish.hp:I
   #17 = NameAndType        #18:#12       // hp:I
   #18 = Utf8               hp
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/model/records/Fish.hpRegen:I
   #20 = NameAndType        #21:#12       // hpRegen:I
   #21 = Utf8               hpRegen
   #22 = Fieldref           #8.#23        // ext/mods/gameserver/model/records/Fish.type:I
   #23 = NameAndType        #24:#12       // type:I
   #24 = Utf8               type
   #25 = Fieldref           #8.#26        // ext/mods/gameserver/model/records/Fish.group:I
   #26 = NameAndType        #27:#12       // group:I
   #27 = Utf8               group
   #28 = Fieldref           #8.#29        // ext/mods/gameserver/model/records/Fish.guts:I
   #29 = NameAndType        #30:#12       // guts:I
   #30 = Utf8               guts
   #31 = Fieldref           #8.#32        // ext/mods/gameserver/model/records/Fish.gutsCheckTime:I
   #32 = NameAndType        #33:#12       // gutsCheckTime:I
   #33 = Utf8               gutsCheckTime
   #34 = Fieldref           #8.#35        // ext/mods/gameserver/model/records/Fish.waitTime:I
   #35 = NameAndType        #36:#12       // waitTime:I
   #36 = Utf8               waitTime
   #37 = Fieldref           #8.#38        // ext/mods/gameserver/model/records/Fish.combatTime:I
   #38 = NameAndType        #39:#12       // combatTime:I
   #39 = Utf8               combatTime
   #40 = String             #11           // id
   #41 = Methodref          #42.#43       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #42 = Class              #44           // ext/mods/commons/data/StatSet
   #43 = NameAndType        #45:#46       // getInteger:(Ljava/lang/String;)I
   #44 = Utf8               ext/mods/commons/data/StatSet
   #45 = Utf8               getInteger
   #46 = Utf8               (Ljava/lang/String;)I
   #47 = String             #15           // level
   #48 = String             #18           // hp
   #49 = String             #21           // hpRegen
   #50 = String             #24           // type
   #51 = String             #27           // group
   #52 = String             #30           // guts
   #53 = String             #33           // gutsCheckTime
   #54 = String             #36           // waitTime
   #55 = String             #39           // combatTime
   #56 = Methodref          #8.#57        // ext/mods/gameserver/model/records/Fish."<init>":(IIIIIIIIII)V
   #57 = NameAndType        #5:#58        // "<init>":(IIIIIIIIII)V
   #58 = Utf8               (IIIIIIIIII)V
   #59 = Methodref          #60.#61       // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #60 = Class              #62           // ext/mods/gameserver/taskmanager/GameTimeTaskManager
   #61 = NameAndType        #63:#64       // getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #62 = Utf8               ext/mods/gameserver/taskmanager/GameTimeTaskManager
   #63 = Utf8               getInstance
   #64 = Utf8               ()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #65 = Methodref          #60.#66       // ext/mods/gameserver/taskmanager/GameTimeTaskManager.isNight:()Z
   #66 = NameAndType        #67:#68       // isNight:()Z
   #67 = Utf8               isNight
   #68 = Utf8               ()Z
   #69 = Methodref          #8.#70        // ext/mods/gameserver/model/records/Fish.type:()I
   #70 = NameAndType        #24:#71       // type:()I
   #71 = Utf8               ()I
   #72 = InvokeDynamic      #0:#73        // #0:toString:(Lext/mods/gameserver/model/records/Fish;)Ljava/lang/String;
   #73 = NameAndType        #74:#75       // toString:(Lext/mods/gameserver/model/records/Fish;)Ljava/lang/String;
   #74 = Utf8               toString
   #75 = Utf8               (Lext/mods/gameserver/model/records/Fish;)Ljava/lang/String;
   #76 = InvokeDynamic      #0:#77        // #0:hashCode:(Lext/mods/gameserver/model/records/Fish;)I
   #77 = NameAndType        #78:#79       // hashCode:(Lext/mods/gameserver/model/records/Fish;)I
   #78 = Utf8               hashCode
   #79 = Utf8               (Lext/mods/gameserver/model/records/Fish;)I
   #80 = InvokeDynamic      #0:#81        // #0:equals:(Lext/mods/gameserver/model/records/Fish;Ljava/lang/Object;)Z
   #81 = NameAndType        #82:#83       // equals:(Lext/mods/gameserver/model/records/Fish;Ljava/lang/Object;)Z
   #82 = Utf8               equals
   #83 = Utf8               (Lext/mods/gameserver/model/records/Fish;Ljava/lang/Object;)Z
   #84 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #85 = Utf8               Code
   #86 = Utf8               LineNumberTable
   #87 = Utf8               LocalVariableTable
   #88 = Utf8               this
   #89 = Utf8               Lext/mods/gameserver/model/records/Fish;
   #90 = Utf8               set
   #91 = Utf8               Lext/mods/commons/data/StatSet;
   #92 = Utf8               MethodParameters
   #93 = Utf8               getType
   #94 = Utf8               (Z)I
   #95 = Utf8               isLureNight
   #96 = Utf8               Z
   #97 = Utf8               StackMapTable
   #98 = Utf8               ()Ljava/lang/String;
   #99 = Utf8               (Ljava/lang/Object;)Z
  #100 = Utf8               o
  #101 = Utf8               Ljava/lang/Object;
  #102 = Utf8               SourceFile
  #103 = Utf8               Fish.java
  #104 = Utf8               Record
  #105 = Utf8               BootstrapMethods
  #106 = String             #107          // id;level;hp;hpRegen;type;group;guts;gutsCheckTime;waitTime;combatTime
  #107 = Utf8               id;level;hp;hpRegen;type;group;guts;gutsCheckTime;waitTime;combatTime
  #108 = MethodHandle       1:#7          // REF_getField ext/mods/gameserver/model/records/Fish.id:I
  #109 = MethodHandle       1:#13         // REF_getField ext/mods/gameserver/model/records/Fish.level:I
  #110 = MethodHandle       1:#16         // REF_getField ext/mods/gameserver/model/records/Fish.hp:I
  #111 = MethodHandle       1:#19         // REF_getField ext/mods/gameserver/model/records/Fish.hpRegen:I
  #112 = MethodHandle       1:#22         // REF_getField ext/mods/gameserver/model/records/Fish.type:I
  #113 = MethodHandle       1:#25         // REF_getField ext/mods/gameserver/model/records/Fish.group:I
  #114 = MethodHandle       1:#28         // REF_getField ext/mods/gameserver/model/records/Fish.guts:I
  #115 = MethodHandle       1:#31         // REF_getField ext/mods/gameserver/model/records/Fish.gutsCheckTime:I
  #116 = MethodHandle       1:#34         // REF_getField ext/mods/gameserver/model/records/Fish.waitTime:I
  #117 = MethodHandle       1:#37         // REF_getField ext/mods/gameserver/model/records/Fish.combatTime:I
  #118 = MethodHandle       6:#119        // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #119 = Methodref          #120.#121     // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #120 = Class              #122          // java/lang/runtime/ObjectMethods
  #121 = NameAndType        #123:#124     // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #122 = Utf8               java/lang/runtime/ObjectMethods
  #123 = Utf8               bootstrap
  #124 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #125 = Utf8               InnerClasses
  #126 = Class              #127          // java/lang/invoke/MethodHandles$Lookup
  #127 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #128 = Class              #129          // java/lang/invoke/MethodHandles
  #129 = Utf8               java/lang/invoke/MethodHandles
  #130 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.Fish(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=12, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #40                 // String id
         4: invokevirtual #41                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #47                 // String level
        10: invokevirtual #41                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: aload_1
        14: ldc           #48                 // String hp
        16: invokevirtual #41                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        19: aload_1
        20: ldc           #49                 // String hpRegen
        22: invokevirtual #41                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        25: aload_1
        26: ldc           #50                 // String type
        28: invokevirtual #41                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        31: aload_1
        32: ldc           #51                 // String group
        34: invokevirtual #41                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        37: aload_1
        38: ldc           #52                 // String guts
        40: invokevirtual #41                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        43: aload_1
        44: ldc           #53                 // String gutsCheckTime
        46: invokevirtual #41                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        49: aload_1
        50: ldc           #54                 // String waitTime
        52: invokevirtual #41                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        55: aload_1
        56: ldc           #55                 // String combatTime
        58: invokevirtual #41                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        61: invokespecial #56                 // Method "<init>":(IIIIIIIIII)V
        64: return
      LineNumberTable:
        line 28: 0
        line 29: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/gameserver/model/records/Fish;
            0      65     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.Fish(int, int, int, int, int, int, int, int, int, int);
    descriptor: (IIIIIIIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=11, args_size=11
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
        16: putfield      #16                 // Field hp:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field hpRegen:I
        25: aload_0
        26: iload         5
        28: putfield      #22                 // Field type:I
        31: aload_0
        32: iload         6
        34: putfield      #25                 // Field group:I
        37: aload_0
        38: iload         7
        40: putfield      #28                 // Field guts:I
        43: aload_0
        44: iload         8
        46: putfield      #31                 // Field gutsCheckTime:I
        49: aload_0
        50: iload         9
        52: putfield      #34                 // Field waitTime:I
        55: aload_0
        56: iload         10
        58: putfield      #37                 // Field combatTime:I
        61: return
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/model/records/Fish;
            0      62     1    id   I
            0      62     2 level   I
            0      62     3    hp   I
            0      62     4 hpRegen   I
            0      62     5  type   I
            0      62     6 group   I
            0      62     7  guts   I
            0      62     8 gutsCheckTime   I
            0      62     9 waitTime   I
            0      62    10 combatTime   I
    MethodParameters:
      Name                           Flags
      id
      level
      hp
      hpRegen
      type
      group
      guts
      gutsCheckTime
      waitTime
      combatTime

  public int getType(boolean);
    descriptor: (Z)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: invokestatic  #59                 // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
         3: invokevirtual #65                 // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.isNight:()Z
         6: ifne          15
         9: iload_1
        10: ifeq          15
        13: iconst_m1
        14: ireturn
        15: aload_0
        16: invokevirtual #69                 // Method type:()I
        19: ireturn
      LineNumberTable:
        line 33: 0
        line 34: 13
        line 36: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/records/Fish;
            0      20     1 isLureNight   Z
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #72,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/Fish;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/Fish;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #76,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/Fish;)I
         6: ireturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/Fish;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #80,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/Fish;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/Fish;
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
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Fish;

  public int level();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field level:I
         4: ireturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Fish;

  public int hp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field hp:I
         4: ireturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Fish;

  public int hpRegen();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field hpRegen:I
         4: ireturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Fish;

  public int type();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field type:I
         4: ireturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Fish;

  public int group();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field group:I
         4: ireturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Fish;

  public int guts();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field guts:I
         4: ireturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Fish;

  public int gutsCheckTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field gutsCheckTime:I
         4: ireturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Fish;

  public int waitTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #34                 // Field waitTime:I
         4: ireturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Fish;

  public int combatTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field combatTime:I
         4: ireturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Fish;
}
SourceFile: "Fish.java"
  Record: length = 0x3E (unknown attribute)
   00 0A 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00 00 15 00 0C 00 00 00 18 00 0C 00 00
   00 1B 00 0C 00 00 00 1E 00 0C 00 00 00 21 00 0C
   00 00 00 24 00 0C 00 00 00 27 00 0C 00 00
BootstrapMethods:
  0: #118 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/Fish
      #106 id;level;hp;hpRegen;type;group;guts;gutsCheckTime;waitTime;combatTime
      #108 REF_getField ext/mods/gameserver/model/records/Fish.id:I
      #109 REF_getField ext/mods/gameserver/model/records/Fish.level:I
      #110 REF_getField ext/mods/gameserver/model/records/Fish.hp:I
      #111 REF_getField ext/mods/gameserver/model/records/Fish.hpRegen:I
      #112 REF_getField ext/mods/gameserver/model/records/Fish.type:I
      #113 REF_getField ext/mods/gameserver/model/records/Fish.group:I
      #114 REF_getField ext/mods/gameserver/model/records/Fish.guts:I
      #115 REF_getField ext/mods/gameserver/model/records/Fish.gutsCheckTime:I
      #116 REF_getField ext/mods/gameserver/model/records/Fish.waitTime:I
      #117 REF_getField ext/mods/gameserver/model/records/Fish.combatTime:I
InnerClasses:
  public static final #130= #126 of #128; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
