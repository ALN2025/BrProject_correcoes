// Bytecode for: ext.mods.gameserver.model.records.custom.CapsuleBoxItem
// File: ext\mods\gameserver\model\records\custom\CapsuleBoxItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/custom/CapsuleBoxItem.class
  Last modified 9 de jul de 2026; size 2481 bytes
  MD5 checksum 6daa320a6040ee0332fd55d462fb0598
  Compiled from "CapsuleBoxItem.java"
public final class ext.mods.gameserver.model.records.custom.CapsuleBoxItem extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/custom/CapsuleBoxItem
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 3, methods: 9, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/custom/CapsuleBoxItem.id:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/custom/CapsuleBoxItem
   #9 = NameAndType        #11:#12        // id:I
  #10 = Utf8               ext/mods/gameserver/model/records/custom/CapsuleBoxItem
  #11 = Utf8               id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/custom/CapsuleBoxItem.playerLevel:I
  #14 = NameAndType        #15:#12        // playerLevel:I
  #15 = Utf8               playerLevel
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/custom/CapsuleBoxItem.items:Ljava/util/List;
  #17 = NameAndType        #18:#19        // items:Ljava/util/List;
  #18 = Utf8               items
  #19 = Utf8               Ljava/util/List;
  #20 = Class              #21            // java/util/ArrayList
  #21 = Utf8               java/util/ArrayList
  #22 = Methodref          #20.#3         // java/util/ArrayList."<init>":()V
  #23 = Methodref          #8.#24         // ext/mods/gameserver/model/records/custom/CapsuleBoxItem."<init>":(IILjava/util/List;)V
  #24 = NameAndType        #5:#25         // "<init>":(IILjava/util/List;)V
  #25 = Utf8               (IILjava/util/List;)V
  #26 = InterfaceMethodref #27.#28        // java/util/List.add:(Ljava/lang/Object;)Z
  #27 = Class              #29            // java/util/List
  #28 = NameAndType        #30:#31        // add:(Ljava/lang/Object;)Z
  #29 = Utf8               java/util/List
  #30 = Utf8               add
  #31 = Utf8               (Ljava/lang/Object;)Z
  #32 = InvokeDynamic      #0:#33         // #0:toString:(Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;)Ljava/lang/String;
  #33 = NameAndType        #34:#35        // toString:(Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;)Ljava/lang/String;
  #34 = Utf8               toString
  #35 = Utf8               (Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;)Ljava/lang/String;
  #36 = InvokeDynamic      #0:#37         // #0:hashCode:(Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;)I
  #37 = NameAndType        #38:#39        // hashCode:(Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;)I
  #38 = Utf8               hashCode
  #39 = Utf8               (Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;)I
  #40 = InvokeDynamic      #0:#41         // #0:equals:(Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;Ljava/lang/Object;)Z
  #41 = NameAndType        #42:#43        // equals:(Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;Ljava/lang/Object;)Z
  #42 = Utf8               equals
  #43 = Utf8               (Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;Ljava/lang/Object;)Z
  #44 = Utf8               Signature
  #45 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/custom/Item;>;
  #46 = Utf8               (II)V
  #47 = Utf8               Code
  #48 = Utf8               LineNumberTable
  #49 = Utf8               LocalVariableTable
  #50 = Utf8               this
  #51 = Utf8               Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;
  #52 = Utf8               LocalVariableTypeTable
  #53 = Utf8               MethodParameters
  #54 = Utf8               (IILjava/util/List<Lext/mods/gameserver/model/records/custom/Item;>;)V
  #55 = Utf8               addItem
  #56 = Utf8               (Lext/mods/gameserver/model/records/custom/Item;)V
  #57 = Utf8               item
  #58 = Utf8               Lext/mods/gameserver/model/records/custom/Item;
  #59 = Utf8               ()Ljava/lang/String;
  #60 = Utf8               ()I
  #61 = Utf8               o
  #62 = Utf8               Ljava/lang/Object;
  #63 = Utf8               ()Ljava/util/List;
  #64 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/records/custom/Item;>;
  #65 = Utf8               SourceFile
  #66 = Utf8               CapsuleBoxItem.java
  #67 = Utf8               Record
  #68 = Utf8               BootstrapMethods
  #69 = String             #70            // id;playerLevel;items
  #70 = Utf8               id;playerLevel;items
  #71 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/custom/CapsuleBoxItem.id:I
  #72 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/custom/CapsuleBoxItem.playerLevel:I
  #73 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/custom/CapsuleBoxItem.items:Ljava/util/List;
  #74 = MethodHandle       6:#75          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #75 = Methodref          #76.#77        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #76 = Class              #78            // java/lang/runtime/ObjectMethods
  #77 = NameAndType        #79:#80        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #78 = Utf8               java/lang/runtime/ObjectMethods
  #79 = Utf8               bootstrap
  #80 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #81 = Utf8               InnerClasses
  #82 = Class              #83            // java/lang/invoke/MethodHandles$Lookup
  #83 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #84 = Class              #85            // java/lang/invoke/MethodHandles
  #85 = Utf8               java/lang/invoke/MethodHandles
  #86 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.custom.CapsuleBoxItem(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: new           #20                 // class java/util/ArrayList
         6: dup
         7: invokespecial #22                 // Method java/util/ArrayList."<init>":()V
        10: invokespecial #23                 // Method "<init>":(IILjava/util/List;)V
        13: return
      LineNumberTable:
        line 27: 0
        line 28: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;
            0      14     1    id   I
            0      14     2 playerLevel   I

  public ext.mods.gameserver.model.records.custom.CapsuleBoxItem(int, int, java.util.List<ext.mods.gameserver.model.records.custom.Item>);
    descriptor: (IILjava/util/List;)V
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
        11: putfield      #13                 // Field playerLevel:I
        14: aload_0
        15: aload_3
        16: putfield      #16                 // Field items:Ljava/util/List;
        19: return
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;
            0      20     1    id   I
            0      20     2 playerLevel   I
            0      20     3 items   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      20     3 items   Ljava/util/List<Lext/mods/gameserver/model/records/custom/Item;>;
    MethodParameters:
      Name                           Flags
      id
      playerLevel
      items
    Signature: #54                          // (IILjava/util/List<Lext/mods/gameserver/model/records/custom/Item;>;)V

  public void addItem(ext.mods.gameserver.model.records.custom.Item);
    descriptor: (Lext/mods/gameserver/model/records/custom/Item;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field items:Ljava/util/List;
         4: aload_1
         5: invokeinterface #26,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 32: 0
        line 33: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;
            0      12     1  item   Lext/mods/gameserver/model/records/custom/Item;

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #32,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #36,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;)I
         6: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #40,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;
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
            0       5     0  this   Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;

  public int playerLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field playerLevel:I
         4: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;

  public java.util.List<ext.mods.gameserver.model.records.custom.Item> items();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field items:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/CapsuleBoxItem;
    Signature: #64                          // ()Ljava/util/List<Lext/mods/gameserver/model/records/custom/Item;>;
}
SourceFile: "CapsuleBoxItem.java"
  Record: length = 0x1C (unknown attribute)
   00 03 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 13 00 01 00 2C 00 00 00 02 00 2D
BootstrapMethods:
  0: #74 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/custom/CapsuleBoxItem
      #69 id;playerLevel;items
      #71 REF_getField ext/mods/gameserver/model/records/custom/CapsuleBoxItem.id:I
      #72 REF_getField ext/mods/gameserver/model/records/custom/CapsuleBoxItem.playerLevel:I
      #73 REF_getField ext/mods/gameserver/model/records/custom/CapsuleBoxItem.items:Ljava/util/List;
InnerClasses:
  public static final #86= #82 of #84;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
