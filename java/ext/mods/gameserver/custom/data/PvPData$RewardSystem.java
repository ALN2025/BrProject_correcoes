// Bytecode for: ext.mods.gameserver.custom.data.PvPData$RewardSystem
// File: ext\mods\gameserver\custom\data\PvPData$RewardSystem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/PvPData$RewardSystem.class
  Last modified 9 de jul de 2026; size 2184 bytes
  MD5 checksum 648099112e2e2d1a14969eb139dafd43
  Compiled from "PvPData.java"
public final class ext.mods.gameserver.custom.data.PvPData$RewardSystem extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/custom/data/PvPData$RewardSystem
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 1, methods: 6, attributes: 5
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/custom/data/PvPData$RewardSystem.reward:Ljava/util/List;
   #8 = Class              #10            // ext/mods/gameserver/custom/data/PvPData$RewardSystem
   #9 = NameAndType        #11:#12        // reward:Ljava/util/List;
  #10 = Utf8               ext/mods/gameserver/custom/data/PvPData$RewardSystem
  #11 = Utf8               reward
  #12 = Utf8               Ljava/util/List;
  #13 = String             #14            // rewards
  #14 = Utf8               rewards
  #15 = Methodref          #16.#17        // ext/mods/commons/data/StatSet.getIntIntHolderList:(Ljava/lang/String;)Ljava/util/List;
  #16 = Class              #18            // ext/mods/commons/data/StatSet
  #17 = NameAndType        #19:#20        // getIntIntHolderList:(Ljava/lang/String;)Ljava/util/List;
  #18 = Utf8               ext/mods/commons/data/StatSet
  #19 = Utf8               getIntIntHolderList
  #20 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #21 = Methodref          #8.#22         // ext/mods/gameserver/custom/data/PvPData$RewardSystem."<init>":(Ljava/util/List;)V
  #22 = NameAndType        #5:#23         // "<init>":(Ljava/util/List;)V
  #23 = Utf8               (Ljava/util/List;)V
  #24 = InvokeDynamic      #0:#25         // #0:toString:(Lext/mods/gameserver/custom/data/PvPData$RewardSystem;)Ljava/lang/String;
  #25 = NameAndType        #26:#27        // toString:(Lext/mods/gameserver/custom/data/PvPData$RewardSystem;)Ljava/lang/String;
  #26 = Utf8               toString
  #27 = Utf8               (Lext/mods/gameserver/custom/data/PvPData$RewardSystem;)Ljava/lang/String;
  #28 = InvokeDynamic      #0:#29         // #0:hashCode:(Lext/mods/gameserver/custom/data/PvPData$RewardSystem;)I
  #29 = NameAndType        #30:#31        // hashCode:(Lext/mods/gameserver/custom/data/PvPData$RewardSystem;)I
  #30 = Utf8               hashCode
  #31 = Utf8               (Lext/mods/gameserver/custom/data/PvPData$RewardSystem;)I
  #32 = InvokeDynamic      #0:#33         // #0:equals:(Lext/mods/gameserver/custom/data/PvPData$RewardSystem;Ljava/lang/Object;)Z
  #33 = NameAndType        #34:#35        // equals:(Lext/mods/gameserver/custom/data/PvPData$RewardSystem;Ljava/lang/Object;)Z
  #34 = Utf8               equals
  #35 = Utf8               (Lext/mods/gameserver/custom/data/PvPData$RewardSystem;Ljava/lang/Object;)Z
  #36 = Utf8               Signature
  #37 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #38 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #39 = Utf8               Code
  #40 = Utf8               LineNumberTable
  #41 = Utf8               LocalVariableTable
  #42 = Utf8               this
  #43 = Utf8               Lext/mods/gameserver/custom/data/PvPData$RewardSystem;
  #44 = Utf8               set
  #45 = Utf8               Lext/mods/commons/data/StatSet;
  #46 = Utf8               LocalVariableTypeTable
  #47 = Utf8               MethodParameters
  #48 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;)V
  #49 = Utf8               ()Ljava/lang/String;
  #50 = Utf8               ()I
  #51 = Utf8               (Ljava/lang/Object;)Z
  #52 = Utf8               o
  #53 = Utf8               Ljava/lang/Object;
  #54 = Utf8               ()Ljava/util/List;
  #55 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #56 = Utf8               SourceFile
  #57 = Utf8               PvPData.java
  #58 = Utf8               NestHost
  #59 = Class              #60            // ext/mods/gameserver/custom/data/PvPData
  #60 = Utf8               ext/mods/gameserver/custom/data/PvPData
  #61 = Utf8               Record
  #62 = Utf8               BootstrapMethods
  #63 = String             #11            // reward
  #64 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/custom/data/PvPData$RewardSystem.reward:Ljava/util/List;
  #65 = MethodHandle       6:#66          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #66 = Methodref          #67.#68        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #67 = Class              #69            // java/lang/runtime/ObjectMethods
  #68 = NameAndType        #70:#71        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #69 = Utf8               java/lang/runtime/ObjectMethods
  #70 = Utf8               bootstrap
  #71 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #72 = Utf8               InnerClasses
  #73 = Utf8               RewardSystem
  #74 = Class              #75            // java/lang/invoke/MethodHandles$Lookup
  #75 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #76 = Class              #77            // java/lang/invoke/MethodHandles
  #77 = Utf8               java/lang/invoke/MethodHandles
  #78 = Utf8               Lookup
{
  public ext.mods.gameserver.custom.data.PvPData$RewardSystem(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #13                 // String rewards
         4: invokevirtual #15                 // Method ext/mods/commons/data/StatSet.getIntIntHolderList:(Ljava/lang/String;)Ljava/util/List;
         7: invokespecial #21                 // Method "<init>":(Ljava/util/List;)V
        10: return
      LineNumberTable:
        line 107: 0
        line 108: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/custom/data/PvPData$RewardSystem;
            0      11     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.custom.data.PvPData$RewardSystem(java.util.List<ext.mods.gameserver.model.holder.IntIntHolder>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field reward:Ljava/util/List;
         9: return
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/custom/data/PvPData$RewardSystem;
            0      10     1 reward   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     1 reward   Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
    MethodParameters:
      Name                           Flags
      reward
    Signature: #48                          // (Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;)V

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #24,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/custom/data/PvPData$RewardSystem;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/custom/data/PvPData$RewardSystem;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #28,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/custom/data/PvPData$RewardSystem;)I
         6: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/custom/data/PvPData$RewardSystem;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #32,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/custom/data/PvPData$RewardSystem;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/custom/data/PvPData$RewardSystem;
            0       8     1     o   Ljava/lang/Object;

  public java.util.List<ext.mods.gameserver.model.holder.IntIntHolder> reward();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field reward:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PvPData$RewardSystem;
    Signature: #55                          // ()Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
}
SourceFile: "PvPData.java"
NestHost: class ext/mods/gameserver/custom/data/PvPData
  Record: length = 0x10 (unknown attribute)
   00 01 00 0B 00 0C 00 01 00 24 00 00 00 02 00 25

BootstrapMethods:
  0: #65 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/custom/data/PvPData$RewardSystem
      #63 reward
      #64 REF_getField ext/mods/gameserver/custom/data/PvPData$RewardSystem.reward:Ljava/util/List;
InnerClasses:
  public static final #73= #8 of #59;     // RewardSystem=class ext/mods/gameserver/custom/data/PvPData$RewardSystem of class ext/mods/gameserver/custom/data/PvPData
  public static final #78= #74 of #76;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
