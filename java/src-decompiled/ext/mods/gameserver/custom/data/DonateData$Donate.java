// Bytecode for: ext.mods.gameserver.custom.data.DonateData$Donate
// File: ext\mods\gameserver\custom\data\DonateData$Donate.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/DonateData$Donate.class
  Last modified 9 de jul de 2026; size 2332 bytes
  MD5 checksum 447168b04a621f0fae32ce0fea2d8193
  Compiled from "DonateData.java"
public final class ext.mods.gameserver.custom.data.DonateData$Donate extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/custom/data/DonateData$Donate
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 3, methods: 8, attributes: 5
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/custom/data/DonateData$Donate.service:I
   #8 = Class              #10            // ext/mods/gameserver/custom/data/DonateData$Donate
   #9 = NameAndType        #11:#12        // service:I
  #10 = Utf8               ext/mods/gameserver/custom/data/DonateData$Donate
  #11 = Utf8               service
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/custom/data/DonateData$Donate.duration:I
  #14 = NameAndType        #15:#12        // duration:I
  #15 = Utf8               duration
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/custom/data/DonateData$Donate.price:Lext/mods/gameserver/model/holder/IntIntHolder;
  #17 = NameAndType        #18:#19        // price:Lext/mods/gameserver/model/holder/IntIntHolder;
  #18 = Utf8               price
  #19 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #20 = String             #21            // id
  #21 = Utf8               id
  #22 = Methodref          #23.#24        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #23 = Class              #25            // ext/mods/commons/data/StatSet
  #24 = NameAndType        #26:#27        // getInteger:(Ljava/lang/String;)I
  #25 = Utf8               ext/mods/commons/data/StatSet
  #26 = Utf8               getInteger
  #27 = Utf8               (Ljava/lang/String;)I
  #28 = String             #29            // value
  #29 = Utf8               value
  #30 = String             #18            // price
  #31 = Methodref          #23.#32        // ext/mods/commons/data/StatSet.getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #32 = NameAndType        #33:#34        // getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #33 = Utf8               getIntIntHolder
  #34 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #35 = Methodref          #8.#36         // ext/mods/gameserver/custom/data/DonateData$Donate."<init>":(IILext/mods/gameserver/model/holder/IntIntHolder;)V
  #36 = NameAndType        #5:#37         // "<init>":(IILext/mods/gameserver/model/holder/IntIntHolder;)V
  #37 = Utf8               (IILext/mods/gameserver/model/holder/IntIntHolder;)V
  #38 = InvokeDynamic      #0:#39         // #0:toString:(Lext/mods/gameserver/custom/data/DonateData$Donate;)Ljava/lang/String;
  #39 = NameAndType        #40:#41        // toString:(Lext/mods/gameserver/custom/data/DonateData$Donate;)Ljava/lang/String;
  #40 = Utf8               toString
  #41 = Utf8               (Lext/mods/gameserver/custom/data/DonateData$Donate;)Ljava/lang/String;
  #42 = InvokeDynamic      #0:#43         // #0:hashCode:(Lext/mods/gameserver/custom/data/DonateData$Donate;)I
  #43 = NameAndType        #44:#45        // hashCode:(Lext/mods/gameserver/custom/data/DonateData$Donate;)I
  #44 = Utf8               hashCode
  #45 = Utf8               (Lext/mods/gameserver/custom/data/DonateData$Donate;)I
  #46 = InvokeDynamic      #0:#47         // #0:equals:(Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/Object;)Z
  #47 = NameAndType        #48:#49        // equals:(Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/Object;)Z
  #48 = Utf8               equals
  #49 = Utf8               (Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/Object;)Z
  #50 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #51 = Utf8               Code
  #52 = Utf8               LineNumberTable
  #53 = Utf8               LocalVariableTable
  #54 = Utf8               this
  #55 = Utf8               Lext/mods/gameserver/custom/data/DonateData$Donate;
  #56 = Utf8               set
  #57 = Utf8               Lext/mods/commons/data/StatSet;
  #58 = Utf8               MethodParameters
  #59 = Utf8               ()Ljava/lang/String;
  #60 = Utf8               ()I
  #61 = Utf8               (Ljava/lang/Object;)Z
  #62 = Utf8               o
  #63 = Utf8               Ljava/lang/Object;
  #64 = Utf8               ()Lext/mods/gameserver/model/holder/IntIntHolder;
  #65 = Utf8               SourceFile
  #66 = Utf8               DonateData.java
  #67 = Utf8               NestHost
  #68 = Class              #69            // ext/mods/gameserver/custom/data/DonateData
  #69 = Utf8               ext/mods/gameserver/custom/data/DonateData
  #70 = Utf8               Record
  #71 = Utf8               BootstrapMethods
  #72 = String             #73            // service;duration;price
  #73 = Utf8               service;duration;price
  #74 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/custom/data/DonateData$Donate.service:I
  #75 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/custom/data/DonateData$Donate.duration:I
  #76 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/custom/data/DonateData$Donate.price:Lext/mods/gameserver/model/holder/IntIntHolder;
  #77 = MethodHandle       6:#78          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #78 = Methodref          #79.#80        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #79 = Class              #81            // java/lang/runtime/ObjectMethods
  #80 = NameAndType        #82:#83        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #81 = Utf8               java/lang/runtime/ObjectMethods
  #82 = Utf8               bootstrap
  #83 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #84 = Utf8               InnerClasses
  #85 = Utf8               Donate
  #86 = Class              #87            // java/lang/invoke/MethodHandles$Lookup
  #87 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #88 = Class              #89            // java/lang/invoke/MethodHandles
  #89 = Utf8               java/lang/invoke/MethodHandles
  #90 = Utf8               Lookup
{
  public ext.mods.gameserver.custom.data.DonateData$Donate(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #20                 // String id
         4: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #28                 // String value
        10: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: aload_1
        14: ldc           #30                 // String price
        16: invokevirtual #31                 // Method ext/mods/commons/data/StatSet.getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
        19: invokespecial #35                 // Method "<init>":(IILext/mods/gameserver/model/holder/IntIntHolder;)V
        22: return
      LineNumberTable:
        line 100: 0
        line 101: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/custom/data/DonateData$Donate;
            0      23     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.custom.data.DonateData$Donate(int, int, ext.mods.gameserver.model.holder.IntIntHolder);
    descriptor: (IILext/mods/gameserver/model/holder/IntIntHolder;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field service:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field duration:I
        14: aload_0
        15: aload_3
        16: putfield      #16                 // Field price:Lext/mods/gameserver/model/holder/IntIntHolder;
        19: return
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/custom/data/DonateData$Donate;
            0      20     1 service   I
            0      20     2 duration   I
            0      20     3 price   Lext/mods/gameserver/model/holder/IntIntHolder;
    MethodParameters:
      Name                           Flags
      service
      duration
      price

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #38,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/custom/data/DonateData$Donate;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/custom/data/DonateData$Donate;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #42,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/custom/data/DonateData$Donate;)I
         6: ireturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/custom/data/DonateData$Donate;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #46,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/custom/data/DonateData$Donate;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/custom/data/DonateData$Donate;
            0       8     1     o   Ljava/lang/Object;

  public int service();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field service:I
         4: ireturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/DonateData$Donate;

  public int duration();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field duration:I
         4: ireturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/DonateData$Donate;

  public ext.mods.gameserver.model.holder.IntIntHolder price();
    descriptor: ()Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field price:Lext/mods/gameserver/model/holder/IntIntHolder;
         4: areturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/DonateData$Donate;
}
SourceFile: "DonateData.java"
NestHost: class ext/mods/gameserver/custom/data/DonateData
  Record: length = 0x14 (unknown attribute)
   00 03 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 13 00 00
BootstrapMethods:
  0: #77 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/custom/data/DonateData$Donate
      #72 service;duration;price
      #74 REF_getField ext/mods/gameserver/custom/data/DonateData$Donate.service:I
      #75 REF_getField ext/mods/gameserver/custom/data/DonateData$Donate.duration:I
      #76 REF_getField ext/mods/gameserver/custom/data/DonateData$Donate.price:Lext/mods/gameserver/model/holder/IntIntHolder;
InnerClasses:
  public static final #85= #8 of #68;     // Donate=class ext/mods/gameserver/custom/data/DonateData$Donate of class ext/mods/gameserver/custom/data/DonateData
  public static final #90= #86 of #88;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
