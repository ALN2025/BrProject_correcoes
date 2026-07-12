// Bytecode for: ext.mods.gameserver.model.records.PrivateData
// File: ext\mods\gameserver\model\records\PrivateData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/PrivateData.class
  Last modified 9 de jul de 2026; size 2107 bytes
  MD5 checksum d1c029a1098b72f9b437c96c280d4b1d
  Compiled from "PrivateData.java"
public final class ext.mods.gameserver.model.records.PrivateData extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/PrivateData
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 3, methods: 8, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/PrivateData.id:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/PrivateData
   #9 = NameAndType        #11:#12        // id:I
  #10 = Utf8               ext/mods/gameserver/model/records/PrivateData
  #11 = Utf8               id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/PrivateData.weight:I
  #14 = NameAndType        #15:#12        // weight:I
  #15 = Utf8               weight
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/PrivateData.respawnTime:I
  #17 = NameAndType        #18:#12        // respawnTime:I
  #18 = Utf8               respawnTime
  #19 = String             #11            // id
  #20 = Methodref          #21.#22        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #21 = Class              #23            // ext/mods/commons/data/StatSet
  #22 = NameAndType        #24:#25        // getInteger:(Ljava/lang/String;)I
  #23 = Utf8               ext/mods/commons/data/StatSet
  #24 = Utf8               getInteger
  #25 = Utf8               (Ljava/lang/String;)I
  #26 = String             #15            // weight
  #27 = String             #28            // respawn
  #28 = Utf8               respawn
  #29 = Methodref          #21.#30        // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #30 = NameAndType        #31:#32        // getString:(Ljava/lang/String;)Ljava/lang/String;
  #31 = Utf8               getString
  #32 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #33 = Methodref          #34.#35        // ext/mods/commons/lang/StringUtil.getTimeStamp:(Ljava/lang/String;)I
  #34 = Class              #36            // ext/mods/commons/lang/StringUtil
  #35 = NameAndType        #37:#25        // getTimeStamp:(Ljava/lang/String;)I
  #36 = Utf8               ext/mods/commons/lang/StringUtil
  #37 = Utf8               getTimeStamp
  #38 = Methodref          #8.#39         // ext/mods/gameserver/model/records/PrivateData."<init>":(III)V
  #39 = NameAndType        #5:#40         // "<init>":(III)V
  #40 = Utf8               (III)V
  #41 = InvokeDynamic      #0:#42         // #0:toString:(Lext/mods/gameserver/model/records/PrivateData;)Ljava/lang/String;
  #42 = NameAndType        #43:#44        // toString:(Lext/mods/gameserver/model/records/PrivateData;)Ljava/lang/String;
  #43 = Utf8               toString
  #44 = Utf8               (Lext/mods/gameserver/model/records/PrivateData;)Ljava/lang/String;
  #45 = InvokeDynamic      #0:#46         // #0:hashCode:(Lext/mods/gameserver/model/records/PrivateData;)I
  #46 = NameAndType        #47:#48        // hashCode:(Lext/mods/gameserver/model/records/PrivateData;)I
  #47 = Utf8               hashCode
  #48 = Utf8               (Lext/mods/gameserver/model/records/PrivateData;)I
  #49 = InvokeDynamic      #0:#50         // #0:equals:(Lext/mods/gameserver/model/records/PrivateData;Ljava/lang/Object;)Z
  #50 = NameAndType        #51:#52        // equals:(Lext/mods/gameserver/model/records/PrivateData;Ljava/lang/Object;)Z
  #51 = Utf8               equals
  #52 = Utf8               (Lext/mods/gameserver/model/records/PrivateData;Ljava/lang/Object;)Z
  #53 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #54 = Utf8               Code
  #55 = Utf8               LineNumberTable
  #56 = Utf8               LocalVariableTable
  #57 = Utf8               this
  #58 = Utf8               Lext/mods/gameserver/model/records/PrivateData;
  #59 = Utf8               set
  #60 = Utf8               Lext/mods/commons/data/StatSet;
  #61 = Utf8               MethodParameters
  #62 = Utf8               ()Ljava/lang/String;
  #63 = Utf8               ()I
  #64 = Utf8               (Ljava/lang/Object;)Z
  #65 = Utf8               o
  #66 = Utf8               Ljava/lang/Object;
  #67 = Utf8               SourceFile
  #68 = Utf8               PrivateData.java
  #69 = Utf8               Record
  #70 = Utf8               BootstrapMethods
  #71 = String             #72            // id;weight;respawnTime
  #72 = Utf8               id;weight;respawnTime
  #73 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/PrivateData.id:I
  #74 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/PrivateData.weight:I
  #75 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/PrivateData.respawnTime:I
  #76 = MethodHandle       6:#77          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #77 = Methodref          #78.#79        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #78 = Class              #80            // java/lang/runtime/ObjectMethods
  #79 = NameAndType        #81:#82        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #80 = Utf8               java/lang/runtime/ObjectMethods
  #81 = Utf8               bootstrap
  #82 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #83 = Utf8               InnerClasses
  #84 = Class              #85            // java/lang/invoke/MethodHandles$Lookup
  #85 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #86 = Class              #87            // java/lang/invoke/MethodHandles
  #87 = Utf8               java/lang/invoke/MethodHandles
  #88 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.PrivateData(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #19                 // String id
         4: invokevirtual #20                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #26                 // String weight
        10: invokevirtual #20                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: aload_1
        14: ldc           #27                 // String respawn
        16: invokevirtual #29                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        19: invokestatic  #33                 // Method ext/mods/commons/lang/StringUtil.getTimeStamp:(Ljava/lang/String;)I
        22: invokespecial #38                 // Method "<init>":(III)V
        25: return
      LineNumberTable:
        line 27: 0
        line 28: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/records/PrivateData;
            0      26     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.PrivateData(int, int, int);
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
        11: putfield      #13                 // Field weight:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field respawnTime:I
        19: return
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/records/PrivateData;
            0      20     1    id   I
            0      20     2 weight   I
            0      20     3 respawnTime   I
    MethodParameters:
      Name                           Flags
      id
      weight
      respawnTime

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #41,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/PrivateData;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/PrivateData;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #45,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/PrivateData;)I
         6: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/PrivateData;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #49,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/PrivateData;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/PrivateData;
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
            0       5     0  this   Lext/mods/gameserver/model/records/PrivateData;

  public int weight();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field weight:I
         4: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PrivateData;

  public int respawnTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field respawnTime:I
         4: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PrivateData;
}
SourceFile: "PrivateData.java"
  Record: length = 0x14 (unknown attribute)
   00 03 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00
BootstrapMethods:
  0: #76 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/PrivateData
      #71 id;weight;respawnTime
      #73 REF_getField ext/mods/gameserver/model/records/PrivateData.id:I
      #74 REF_getField ext/mods/gameserver/model/records/PrivateData.weight:I
      #75 REF_getField ext/mods/gameserver/model/records/PrivateData.respawnTime:I
InnerClasses:
  public static final #88= #84 of #86;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
