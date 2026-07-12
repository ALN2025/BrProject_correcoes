// Bytecode for: ext.mods.gameserver.model.records.SellBuffData
// File: ext\mods\gameserver\model\records\SellBuffData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/SellBuffData.class
  Last modified 9 de jul de 2026; size 1783 bytes
  MD5 checksum e719690ffa31bdb2c59ab069275bafd0
  Compiled from "SellBuffData.java"
public final class ext.mods.gameserver.model.records.SellBuffData extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/SellBuffData
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 3, methods: 8, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/SellBuffData.id:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/SellBuffData
   #9 = NameAndType        #11:#12        // id:I
  #10 = Utf8               ext/mods/gameserver/model/records/SellBuffData
  #11 = Utf8               id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/SellBuffData.time:I
  #14 = NameAndType        #15:#12        // time:I
  #15 = Utf8               time
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/SellBuffData.applyOnPets:Z
  #17 = NameAndType        #18:#19        // applyOnPets:Z
  #18 = Utf8               applyOnPets
  #19 = Utf8               Z
  #20 = InvokeDynamic      #0:#21         // #0:toString:(Lext/mods/gameserver/model/records/SellBuffData;)Ljava/lang/String;
  #21 = NameAndType        #22:#23        // toString:(Lext/mods/gameserver/model/records/SellBuffData;)Ljava/lang/String;
  #22 = Utf8               toString
  #23 = Utf8               (Lext/mods/gameserver/model/records/SellBuffData;)Ljava/lang/String;
  #24 = InvokeDynamic      #0:#25         // #0:hashCode:(Lext/mods/gameserver/model/records/SellBuffData;)I
  #25 = NameAndType        #26:#27        // hashCode:(Lext/mods/gameserver/model/records/SellBuffData;)I
  #26 = Utf8               hashCode
  #27 = Utf8               (Lext/mods/gameserver/model/records/SellBuffData;)I
  #28 = InvokeDynamic      #0:#29         // #0:equals:(Lext/mods/gameserver/model/records/SellBuffData;Ljava/lang/Object;)Z
  #29 = NameAndType        #30:#31        // equals:(Lext/mods/gameserver/model/records/SellBuffData;Ljava/lang/Object;)Z
  #30 = Utf8               equals
  #31 = Utf8               (Lext/mods/gameserver/model/records/SellBuffData;Ljava/lang/Object;)Z
  #32 = Utf8               (IIZ)V
  #33 = Utf8               Code
  #34 = Utf8               LineNumberTable
  #35 = Utf8               LocalVariableTable
  #36 = Utf8               this
  #37 = Utf8               Lext/mods/gameserver/model/records/SellBuffData;
  #38 = Utf8               MethodParameters
  #39 = Utf8               getSkillId
  #40 = Utf8               ()I
  #41 = Utf8               ()Ljava/lang/String;
  #42 = Utf8               (Ljava/lang/Object;)Z
  #43 = Utf8               o
  #44 = Utf8               Ljava/lang/Object;
  #45 = Utf8               ()Z
  #46 = Utf8               SourceFile
  #47 = Utf8               SellBuffData.java
  #48 = Utf8               Record
  #49 = Utf8               BootstrapMethods
  #50 = String             #51            // id;time;applyOnPets
  #51 = Utf8               id;time;applyOnPets
  #52 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/SellBuffData.id:I
  #53 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/SellBuffData.time:I
  #54 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/SellBuffData.applyOnPets:Z
  #55 = MethodHandle       6:#56          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #56 = Methodref          #57.#58        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #57 = Class              #59            // java/lang/runtime/ObjectMethods
  #58 = NameAndType        #60:#61        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #59 = Utf8               java/lang/runtime/ObjectMethods
  #60 = Utf8               bootstrap
  #61 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #62 = Utf8               InnerClasses
  #63 = Class              #64            // java/lang/invoke/MethodHandles$Lookup
  #64 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #65 = Class              #66            // java/lang/invoke/MethodHandles
  #66 = Utf8               java/lang/invoke/MethodHandles
  #67 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.SellBuffData(int, int, boolean);
    descriptor: (IIZ)V
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
        11: putfield      #13                 // Field time:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field applyOnPets:Z
        19: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/records/SellBuffData;
            0      20     1    id   I
            0      20     2  time   I
            0      20     3 applyOnPets   Z
    MethodParameters:
      Name                           Flags
      id
      time
      applyOnPets

  public int getSkillId();
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
            0       5     0  this   Lext/mods/gameserver/model/records/SellBuffData;

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #20,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/SellBuffData;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/SellBuffData;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #24,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/SellBuffData;)I
         6: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/SellBuffData;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #28,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/SellBuffData;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/SellBuffData;
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
            0       5     0  this   Lext/mods/gameserver/model/records/SellBuffData;

  public int time();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field time:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/SellBuffData;

  public boolean applyOnPets();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field applyOnPets:Z
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/SellBuffData;
}
SourceFile: "SellBuffData.java"
  Record: length = 0x14 (unknown attribute)
   00 03 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 13 00 00
BootstrapMethods:
  0: #55 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/SellBuffData
      #50 id;time;applyOnPets
      #52 REF_getField ext/mods/gameserver/model/records/SellBuffData.id:I
      #53 REF_getField ext/mods/gameserver/model/records/SellBuffData.time:I
      #54 REF_getField ext/mods/gameserver/model/records/SellBuffData.applyOnPets:Z
InnerClasses:
  public static final #67= #63 of #65;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
