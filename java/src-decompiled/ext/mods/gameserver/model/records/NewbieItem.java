// Bytecode for: ext.mods.gameserver.model.records.NewbieItem
// File: ext\mods\gameserver\model\records\NewbieItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/NewbieItem.class
  Last modified 9 de jul de 2026; size 2189 bytes
  MD5 checksum c03192b5bdbfa733c493aeced41d97e6
  Compiled from "NewbieItem.java"
public final class ext.mods.gameserver.model.records.NewbieItem extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/NewbieItem
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 4, methods: 9, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/NewbieItem.id:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/NewbieItem
   #9 = NameAndType        #11:#12        // id:I
  #10 = Utf8               ext/mods/gameserver/model/records/NewbieItem
  #11 = Utf8               id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/NewbieItem.count:I
  #14 = NameAndType        #15:#12        // count:I
  #15 = Utf8               count
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/NewbieItem.isEquipped:Z
  #17 = NameAndType        #18:#19        // isEquipped:Z
  #18 = Utf8               isEquipped
  #19 = Utf8               Z
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/model/records/NewbieItem.enchant:I
  #21 = NameAndType        #22:#12        // enchant:I
  #22 = Utf8               enchant
  #23 = String             #11            // id
  #24 = Methodref          #25.#26        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #25 = Class              #27            // ext/mods/commons/data/StatSet
  #26 = NameAndType        #28:#29        // getInteger:(Ljava/lang/String;)I
  #27 = Utf8               ext/mods/commons/data/StatSet
  #28 = Utf8               getInteger
  #29 = Utf8               (Ljava/lang/String;)I
  #30 = String             #15            // count
  #31 = String             #18            // isEquipped
  #32 = Methodref          #25.#33        // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
  #33 = NameAndType        #34:#35        // getBool:(Ljava/lang/String;Z)Z
  #34 = Utf8               getBool
  #35 = Utf8               (Ljava/lang/String;Z)Z
  #36 = String             #22            // enchant
  #37 = Methodref          #25.#38        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #38 = NameAndType        #28:#39        // getInteger:(Ljava/lang/String;I)I
  #39 = Utf8               (Ljava/lang/String;I)I
  #40 = Methodref          #8.#41         // ext/mods/gameserver/model/records/NewbieItem."<init>":(IIZI)V
  #41 = NameAndType        #5:#42         // "<init>":(IIZI)V
  #42 = Utf8               (IIZI)V
  #43 = InvokeDynamic      #0:#44         // #0:toString:(Lext/mods/gameserver/model/records/NewbieItem;)Ljava/lang/String;
  #44 = NameAndType        #45:#46        // toString:(Lext/mods/gameserver/model/records/NewbieItem;)Ljava/lang/String;
  #45 = Utf8               toString
  #46 = Utf8               (Lext/mods/gameserver/model/records/NewbieItem;)Ljava/lang/String;
  #47 = InvokeDynamic      #0:#48         // #0:hashCode:(Lext/mods/gameserver/model/records/NewbieItem;)I
  #48 = NameAndType        #49:#50        // hashCode:(Lext/mods/gameserver/model/records/NewbieItem;)I
  #49 = Utf8               hashCode
  #50 = Utf8               (Lext/mods/gameserver/model/records/NewbieItem;)I
  #51 = InvokeDynamic      #0:#52         // #0:equals:(Lext/mods/gameserver/model/records/NewbieItem;Ljava/lang/Object;)Z
  #52 = NameAndType        #53:#54        // equals:(Lext/mods/gameserver/model/records/NewbieItem;Ljava/lang/Object;)Z
  #53 = Utf8               equals
  #54 = Utf8               (Lext/mods/gameserver/model/records/NewbieItem;Ljava/lang/Object;)Z
  #55 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #56 = Utf8               Code
  #57 = Utf8               LineNumberTable
  #58 = Utf8               LocalVariableTable
  #59 = Utf8               this
  #60 = Utf8               Lext/mods/gameserver/model/records/NewbieItem;
  #61 = Utf8               set
  #62 = Utf8               Lext/mods/commons/data/StatSet;
  #63 = Utf8               MethodParameters
  #64 = Utf8               ()Ljava/lang/String;
  #65 = Utf8               ()I
  #66 = Utf8               (Ljava/lang/Object;)Z
  #67 = Utf8               o
  #68 = Utf8               Ljava/lang/Object;
  #69 = Utf8               ()Z
  #70 = Utf8               SourceFile
  #71 = Utf8               NewbieItem.java
  #72 = Utf8               Record
  #73 = Utf8               BootstrapMethods
  #74 = String             #75            // id;count;isEquipped;enchant
  #75 = Utf8               id;count;isEquipped;enchant
  #76 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/NewbieItem.id:I
  #77 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/NewbieItem.count:I
  #78 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/NewbieItem.isEquipped:Z
  #79 = MethodHandle       1:#20          // REF_getField ext/mods/gameserver/model/records/NewbieItem.enchant:I
  #80 = MethodHandle       6:#81          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #81 = Methodref          #82.#83        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #82 = Class              #84            // java/lang/runtime/ObjectMethods
  #83 = NameAndType        #85:#86        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #84 = Utf8               java/lang/runtime/ObjectMethods
  #85 = Utf8               bootstrap
  #86 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #87 = Utf8               InnerClasses
  #88 = Class              #89            // java/lang/invoke/MethodHandles$Lookup
  #89 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #90 = Class              #91            // java/lang/invoke/MethodHandles
  #91 = Utf8               java/lang/invoke/MethodHandles
  #92 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.NewbieItem(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #23                 // String id
         4: invokevirtual #24                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #30                 // String count
        10: invokevirtual #24                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: aload_1
        14: ldc           #31                 // String isEquipped
        16: iconst_1
        17: invokevirtual #32                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        20: aload_1
        21: ldc           #36                 // String enchant
        23: iconst_0
        24: invokevirtual #37                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        27: invokespecial #40                 // Method "<init>":(IIZI)V
        30: return
      LineNumberTable:
        line 26: 0
        line 27: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/records/NewbieItem;
            0      31     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.NewbieItem(int, int, boolean, int);
    descriptor: (IIZI)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field id:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field count:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field isEquipped:Z
        19: aload_0
        20: iload         4
        22: putfield      #20                 // Field enchant:I
        25: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/records/NewbieItem;
            0      26     1    id   I
            0      26     2 count   I
            0      26     3 isEquipped   Z
            0      26     4 enchant   I
    MethodParameters:
      Name                           Flags
      id
      count
      isEquipped
      enchant

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #43,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/NewbieItem;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/NewbieItem;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #47,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/NewbieItem;)I
         6: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/NewbieItem;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #51,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/NewbieItem;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/NewbieItem;
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
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/NewbieItem;

  public int count();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field count:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/NewbieItem;

  public boolean isEquipped();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field isEquipped:Z
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/NewbieItem;

  public int enchant();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field enchant:I
         4: ireturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/NewbieItem;
}
SourceFile: "NewbieItem.java"
  Record: length = 0x1A (unknown attribute)
   00 04 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 13 00 00 00 16 00 0C 00 00
BootstrapMethods:
  0: #80 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/NewbieItem
      #74 id;count;isEquipped;enchant
      #76 REF_getField ext/mods/gameserver/model/records/NewbieItem.id:I
      #77 REF_getField ext/mods/gameserver/model/records/NewbieItem.count:I
      #78 REF_getField ext/mods/gameserver/model/records/NewbieItem.isEquipped:Z
      #79 REF_getField ext/mods/gameserver/model/records/NewbieItem.enchant:I
InnerClasses:
  public static final #92= #88 of #90;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
