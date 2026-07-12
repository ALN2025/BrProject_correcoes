// Bytecode for: ext.mods.gameserver.model.records.PlayerLevel
// File: ext\mods\gameserver\model\records\PlayerLevel.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/PlayerLevel.class
  Last modified 9 de jul de 2026; size 2087 bytes
  MD5 checksum c8b300f52030d5c90fe7eab2b41d1073
  Compiled from "PlayerLevel.java"
public final class ext.mods.gameserver.model.records.PlayerLevel extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/PlayerLevel
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 3, methods: 8, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:J
   #8 = Class              #10            // ext/mods/gameserver/model/records/PlayerLevel
   #9 = NameAndType        #11:#12        // requiredExpToLevelUp:J
  #10 = Utf8               ext/mods/gameserver/model/records/PlayerLevel
  #11 = Utf8               requiredExpToLevelUp
  #12 = Utf8               J
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/PlayerLevel.karmaModifier:D
  #14 = NameAndType        #15:#16        // karmaModifier:D
  #15 = Utf8               karmaModifier
  #16 = Utf8               D
  #17 = Fieldref           #8.#18         // ext/mods/gameserver/model/records/PlayerLevel.expLossAtDeath:D
  #18 = NameAndType        #19:#16        // expLossAtDeath:D
  #19 = Utf8               expLossAtDeath
  #20 = String             #11            // requiredExpToLevelUp
  #21 = Methodref          #22.#23        // ext/mods/commons/data/StatSet.getLong:(Ljava/lang/String;)J
  #22 = Class              #24            // ext/mods/commons/data/StatSet
  #23 = NameAndType        #25:#26        // getLong:(Ljava/lang/String;)J
  #24 = Utf8               ext/mods/commons/data/StatSet
  #25 = Utf8               getLong
  #26 = Utf8               (Ljava/lang/String;)J
  #27 = String             #15            // karmaModifier
  #28 = Methodref          #22.#29        // ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
  #29 = NameAndType        #30:#31        // getDouble:(Ljava/lang/String;D)D
  #30 = Utf8               getDouble
  #31 = Utf8               (Ljava/lang/String;D)D
  #32 = String             #19            // expLossAtDeath
  #33 = Methodref          #8.#34         // ext/mods/gameserver/model/records/PlayerLevel."<init>":(JDD)V
  #34 = NameAndType        #5:#35         // "<init>":(JDD)V
  #35 = Utf8               (JDD)V
  #36 = InvokeDynamic      #0:#37         // #0:toString:(Lext/mods/gameserver/model/records/PlayerLevel;)Ljava/lang/String;
  #37 = NameAndType        #38:#39        // toString:(Lext/mods/gameserver/model/records/PlayerLevel;)Ljava/lang/String;
  #38 = Utf8               toString
  #39 = Utf8               (Lext/mods/gameserver/model/records/PlayerLevel;)Ljava/lang/String;
  #40 = InvokeDynamic      #0:#41         // #0:hashCode:(Lext/mods/gameserver/model/records/PlayerLevel;)I
  #41 = NameAndType        #42:#43        // hashCode:(Lext/mods/gameserver/model/records/PlayerLevel;)I
  #42 = Utf8               hashCode
  #43 = Utf8               (Lext/mods/gameserver/model/records/PlayerLevel;)I
  #44 = InvokeDynamic      #0:#45         // #0:equals:(Lext/mods/gameserver/model/records/PlayerLevel;Ljava/lang/Object;)Z
  #45 = NameAndType        #46:#47        // equals:(Lext/mods/gameserver/model/records/PlayerLevel;Ljava/lang/Object;)Z
  #46 = Utf8               equals
  #47 = Utf8               (Lext/mods/gameserver/model/records/PlayerLevel;Ljava/lang/Object;)Z
  #48 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #49 = Utf8               Code
  #50 = Utf8               LineNumberTable
  #51 = Utf8               LocalVariableTable
  #52 = Utf8               this
  #53 = Utf8               Lext/mods/gameserver/model/records/PlayerLevel;
  #54 = Utf8               set
  #55 = Utf8               Lext/mods/commons/data/StatSet;
  #56 = Utf8               MethodParameters
  #57 = Utf8               ()Ljava/lang/String;
  #58 = Utf8               ()I
  #59 = Utf8               (Ljava/lang/Object;)Z
  #60 = Utf8               o
  #61 = Utf8               Ljava/lang/Object;
  #62 = Utf8               ()J
  #63 = Utf8               ()D
  #64 = Utf8               SourceFile
  #65 = Utf8               PlayerLevel.java
  #66 = Utf8               Record
  #67 = Utf8               BootstrapMethods
  #68 = String             #69            // requiredExpToLevelUp;karmaModifier;expLossAtDeath
  #69 = Utf8               requiredExpToLevelUp;karmaModifier;expLossAtDeath
  #70 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:J
  #71 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/PlayerLevel.karmaModifier:D
  #72 = MethodHandle       1:#17          // REF_getField ext/mods/gameserver/model/records/PlayerLevel.expLossAtDeath:D
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
  public ext.mods.gameserver.model.records.PlayerLevel(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #20                 // String requiredExpToLevelUp
         4: invokevirtual #21                 // Method ext/mods/commons/data/StatSet.getLong:(Ljava/lang/String;)J
         7: aload_1
         8: ldc           #27                 // String karmaModifier
        10: dconst_0
        11: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
        14: aload_1
        15: ldc           #32                 // String expLossAtDeath
        17: dconst_0
        18: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
        21: invokespecial #33                 // Method "<init>":(JDD)V
        24: return
      LineNumberTable:
        line 26: 0
        line 27: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/records/PlayerLevel;
            0      25     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.PlayerLevel(long, double, double);
    descriptor: (JDD)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: lload_1
         6: putfield      #7                  // Field requiredExpToLevelUp:J
         9: aload_0
        10: dload_3
        11: putfield      #13                 // Field karmaModifier:D
        14: aload_0
        15: dload         5
        17: putfield      #17                 // Field expLossAtDeath:D
        20: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/records/PlayerLevel;
            0      21     1 requiredExpToLevelUp   J
            0      21     3 karmaModifier   D
            0      21     5 expLossAtDeath   D
    MethodParameters:
      Name                           Flags
      requiredExpToLevelUp
      karmaModifier
      expLossAtDeath

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #36,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/PlayerLevel;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/PlayerLevel;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #40,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/PlayerLevel;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/PlayerLevel;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #44,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/PlayerLevel;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/PlayerLevel;
            0       8     1     o   Ljava/lang/Object;

  public long requiredExpToLevelUp();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field requiredExpToLevelUp:J
         4: lreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PlayerLevel;

  public double karmaModifier();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field karmaModifier:D
         4: dreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PlayerLevel;

  public double expLossAtDeath();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field expLossAtDeath:D
         4: dreturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/PlayerLevel;
}
SourceFile: "PlayerLevel.java"
  Record: length = 0x14 (unknown attribute)
   00 03 00 0B 00 0C 00 00 00 0F 00 10 00 00 00 13
   00 10 00 00
BootstrapMethods:
  0: #73 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/PlayerLevel
      #68 requiredExpToLevelUp;karmaModifier;expLossAtDeath
      #70 REF_getField ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:J
      #71 REF_getField ext/mods/gameserver/model/records/PlayerLevel.karmaModifier:D
      #72 REF_getField ext/mods/gameserver/model/records/PlayerLevel.expLossAtDeath:D
InnerClasses:
  public static final #85= #81 of #83;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
