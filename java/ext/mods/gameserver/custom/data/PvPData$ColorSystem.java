// Bytecode for: ext.mods.gameserver.custom.data.PvPData$ColorSystem
// File: ext\mods\gameserver\custom\data\PvPData$ColorSystem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/PvPData$ColorSystem.class
  Last modified 9 de jul de 2026; size 2637 bytes
  MD5 checksum d2a785ef9f5a73f6fa3a8c513fc8a1c7
  Compiled from "PvPData.java"
public final class ext.mods.gameserver.custom.data.PvPData$ColorSystem extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/custom/data/PvPData$ColorSystem
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 3, methods: 8, attributes: 5
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Record."<init>":()V
    #2 = Class              #4            // java/lang/Record
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Record
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/custom/data/PvPData$ColorSystem.pvpAmount:I
    #8 = Class              #10           // ext/mods/gameserver/custom/data/PvPData$ColorSystem
    #9 = NameAndType        #11:#12       // pvpAmount:I
   #10 = Utf8               ext/mods/gameserver/custom/data/PvPData$ColorSystem
   #11 = Utf8               pvpAmount
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/custom/data/PvPData$ColorSystem.nameColor:I
   #14 = NameAndType        #15:#12       // nameColor:I
   #15 = Utf8               nameColor
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/custom/data/PvPData$ColorSystem.titleColor:I
   #17 = NameAndType        #18:#12       // titleColor:I
   #18 = Utf8               titleColor
   #19 = String             #11           // pvpAmount
   #20 = Methodref          #21.#22       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #21 = Class              #23           // ext/mods/commons/data/StatSet
   #22 = NameAndType        #24:#25       // getInteger:(Ljava/lang/String;)I
   #23 = Utf8               ext/mods/commons/data/StatSet
   #24 = Utf8               getInteger
   #25 = Utf8               (Ljava/lang/String;)I
   #26 = String             #15           // nameColor
   #27 = String             #28           // FFFFFF
   #28 = Utf8               FFFFFF
   #29 = Methodref          #21.#30       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #30 = NameAndType        #31:#32       // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #31 = Utf8               getString
   #32 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #33 = InvokeDynamic      #0:#34        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #34 = NameAndType        #35:#36       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #35 = Utf8               makeConcatWithConstants
   #36 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #37 = Methodref          #38.#39       // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
   #38 = Class              #40           // java/lang/Integer
   #39 = NameAndType        #41:#42       // decode:(Ljava/lang/String;)Ljava/lang/Integer;
   #40 = Utf8               java/lang/Integer
   #41 = Utf8               decode
   #42 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
   #43 = Methodref          #38.#44       // java/lang/Integer.intValue:()I
   #44 = NameAndType        #45:#46       // intValue:()I
   #45 = Utf8               intValue
   #46 = Utf8               ()I
   #47 = String             #18           // titleColor
   #48 = String             #49           // FFFF77
   #49 = Utf8               FFFF77
   #50 = Methodref          #8.#51        // ext/mods/gameserver/custom/data/PvPData$ColorSystem."<init>":(III)V
   #51 = NameAndType        #5:#52        // "<init>":(III)V
   #52 = Utf8               (III)V
   #53 = InvokeDynamic      #1:#54        // #1:toString:(Lext/mods/gameserver/custom/data/PvPData$ColorSystem;)Ljava/lang/String;
   #54 = NameAndType        #55:#56       // toString:(Lext/mods/gameserver/custom/data/PvPData$ColorSystem;)Ljava/lang/String;
   #55 = Utf8               toString
   #56 = Utf8               (Lext/mods/gameserver/custom/data/PvPData$ColorSystem;)Ljava/lang/String;
   #57 = InvokeDynamic      #1:#58        // #1:hashCode:(Lext/mods/gameserver/custom/data/PvPData$ColorSystem;)I
   #58 = NameAndType        #59:#60       // hashCode:(Lext/mods/gameserver/custom/data/PvPData$ColorSystem;)I
   #59 = Utf8               hashCode
   #60 = Utf8               (Lext/mods/gameserver/custom/data/PvPData$ColorSystem;)I
   #61 = InvokeDynamic      #1:#62        // #1:equals:(Lext/mods/gameserver/custom/data/PvPData$ColorSystem;Ljava/lang/Object;)Z
   #62 = NameAndType        #63:#64       // equals:(Lext/mods/gameserver/custom/data/PvPData$ColorSystem;Ljava/lang/Object;)Z
   #63 = Utf8               equals
   #64 = Utf8               (Lext/mods/gameserver/custom/data/PvPData$ColorSystem;Ljava/lang/Object;)Z
   #65 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #66 = Utf8               Code
   #67 = Utf8               LineNumberTable
   #68 = Utf8               LocalVariableTable
   #69 = Utf8               this
   #70 = Utf8               Lext/mods/gameserver/custom/data/PvPData$ColorSystem;
   #71 = Utf8               set
   #72 = Utf8               Lext/mods/commons/data/StatSet;
   #73 = Utf8               MethodParameters
   #74 = Utf8               ()Ljava/lang/String;
   #75 = Utf8               (Ljava/lang/Object;)Z
   #76 = Utf8               o
   #77 = Utf8               Ljava/lang/Object;
   #78 = Utf8               SourceFile
   #79 = Utf8               PvPData.java
   #80 = Utf8               NestHost
   #81 = Class              #82           // ext/mods/gameserver/custom/data/PvPData
   #82 = Utf8               ext/mods/gameserver/custom/data/PvPData
   #83 = Utf8               Record
   #84 = Utf8               BootstrapMethods
   #85 = String             #86           // 0x\u0001
   #86 = Utf8               0x\u0001
   #87 = String             #88           // pvpAmount;nameColor;titleColor
   #88 = Utf8               pvpAmount;nameColor;titleColor
   #89 = MethodHandle       1:#7          // REF_getField ext/mods/gameserver/custom/data/PvPData$ColorSystem.pvpAmount:I
   #90 = MethodHandle       1:#13         // REF_getField ext/mods/gameserver/custom/data/PvPData$ColorSystem.nameColor:I
   #91 = MethodHandle       1:#16         // REF_getField ext/mods/gameserver/custom/data/PvPData$ColorSystem.titleColor:I
   #92 = MethodHandle       6:#93         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #93 = Methodref          #94.#95       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #94 = Class              #96           // java/lang/invoke/StringConcatFactory
   #95 = NameAndType        #35:#97       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #96 = Utf8               java/lang/invoke/StringConcatFactory
   #97 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #98 = MethodHandle       6:#99         // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
   #99 = Methodref          #100.#101     // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #100 = Class              #102          // java/lang/runtime/ObjectMethods
  #101 = NameAndType        #103:#104     // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #102 = Utf8               java/lang/runtime/ObjectMethods
  #103 = Utf8               bootstrap
  #104 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #105 = Utf8               InnerClasses
  #106 = Utf8               ColorSystem
  #107 = Class              #108          // java/lang/invoke/MethodHandles$Lookup
  #108 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #109 = Class              #110          // java/lang/invoke/MethodHandles
  #110 = Utf8               java/lang/invoke/MethodHandles
  #111 = Utf8               Lookup
{
  public ext.mods.gameserver.custom.data.PvPData$ColorSystem(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #19                 // String pvpAmount
         4: invokevirtual #20                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #26                 // String nameColor
        10: ldc           #27                 // String FFFFFF
        12: invokevirtual #29                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        15: invokedynamic #33,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        20: invokestatic  #37                 // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
        23: invokevirtual #43                 // Method java/lang/Integer.intValue:()I
        26: aload_1
        27: ldc           #47                 // String titleColor
        29: ldc           #48                 // String FFFF77
        31: invokevirtual #29                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        34: invokedynamic #33,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        39: invokestatic  #37                 // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
        42: invokevirtual #43                 // Method java/lang/Integer.intValue:()I
        45: invokespecial #50                 // Method "<init>":(III)V
        48: return
      LineNumberTable:
        line 115: 0
        line 116: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/custom/data/PvPData$ColorSystem;
            0      49     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.custom.data.PvPData$ColorSystem(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field pvpAmount:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field nameColor:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field titleColor:I
        19: return
      LineNumberTable:
        line 111: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/custom/data/PvPData$ColorSystem;
            0      20     1 pvpAmount   I
            0      20     2 nameColor   I
            0      20     3 titleColor   I
    MethodParameters:
      Name                           Flags
      pvpAmount
      nameColor
      titleColor

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #53,  0             // InvokeDynamic #1:toString:(Lext/mods/gameserver/custom/data/PvPData$ColorSystem;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 111: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/custom/data/PvPData$ColorSystem;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #57,  0             // InvokeDynamic #1:hashCode:(Lext/mods/gameserver/custom/data/PvPData$ColorSystem;)I
         6: ireturn
      LineNumberTable:
        line 111: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/custom/data/PvPData$ColorSystem;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #61,  0             // InvokeDynamic #1:equals:(Lext/mods/gameserver/custom/data/PvPData$ColorSystem;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 111: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/custom/data/PvPData$ColorSystem;
            0       8     1     o   Ljava/lang/Object;

  public int pvpAmount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field pvpAmount:I
         4: ireturn
      LineNumberTable:
        line 111: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PvPData$ColorSystem;

  public int nameColor();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field nameColor:I
         4: ireturn
      LineNumberTable:
        line 111: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PvPData$ColorSystem;

  public int titleColor();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field titleColor:I
         4: ireturn
      LineNumberTable:
        line 111: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PvPData$ColorSystem;
}
SourceFile: "PvPData.java"
NestHost: class ext/mods/gameserver/custom/data/PvPData
  Record: length = 0x14 (unknown attribute)
   00 03 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00
BootstrapMethods:
  0: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #85 0x\u0001
  1: #98 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/custom/data/PvPData$ColorSystem
      #87 pvpAmount;nameColor;titleColor
      #89 REF_getField ext/mods/gameserver/custom/data/PvPData$ColorSystem.pvpAmount:I
      #90 REF_getField ext/mods/gameserver/custom/data/PvPData$ColorSystem.nameColor:I
      #91 REF_getField ext/mods/gameserver/custom/data/PvPData$ColorSystem.titleColor:I
InnerClasses:
  public static final #106= #8 of #81;    // ColorSystem=class ext/mods/gameserver/custom/data/PvPData$ColorSystem of class ext/mods/gameserver/custom/data/PvPData
  public static final #111= #107 of #109; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
