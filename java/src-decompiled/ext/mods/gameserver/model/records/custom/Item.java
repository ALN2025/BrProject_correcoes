// Bytecode for: ext.mods.gameserver.model.records.custom.Item
// File: ext\mods\gameserver\model\records\custom\Item.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/custom/Item.class
  Last modified 9 de jul de 2026; size 1944 bytes
  MD5 checksum 827f263dc1ba86351d4a70c197ccb019
  Compiled from "Item.java"
public final class ext.mods.gameserver.model.records.custom.Item extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/custom/Item
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 5, methods: 9, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Record."<init>":()V
   #2 = Class              #4             // java/lang/Record
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Record
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/records/custom/Item.itemId:I
   #8 = Class              #10            // ext/mods/gameserver/model/records/custom/Item
   #9 = NameAndType        #11:#12        // itemId:I
  #10 = Utf8               ext/mods/gameserver/model/records/custom/Item
  #11 = Utf8               itemId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/records/custom/Item.min:I
  #14 = NameAndType        #15:#12        // min:I
  #15 = Utf8               min
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/records/custom/Item.max:I
  #17 = NameAndType        #18:#12        // max:I
  #18 = Utf8               max
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/records/custom/Item.enchantLevel:I
  #20 = NameAndType        #21:#12        // enchantLevel:I
  #21 = Utf8               enchantLevel
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/model/records/custom/Item.chance:I
  #23 = NameAndType        #24:#12        // chance:I
  #24 = Utf8               chance
  #25 = InvokeDynamic      #0:#26         // #0:toString:(Lext/mods/gameserver/model/records/custom/Item;)Ljava/lang/String;
  #26 = NameAndType        #27:#28        // toString:(Lext/mods/gameserver/model/records/custom/Item;)Ljava/lang/String;
  #27 = Utf8               toString
  #28 = Utf8               (Lext/mods/gameserver/model/records/custom/Item;)Ljava/lang/String;
  #29 = InvokeDynamic      #0:#30         // #0:hashCode:(Lext/mods/gameserver/model/records/custom/Item;)I
  #30 = NameAndType        #31:#32        // hashCode:(Lext/mods/gameserver/model/records/custom/Item;)I
  #31 = Utf8               hashCode
  #32 = Utf8               (Lext/mods/gameserver/model/records/custom/Item;)I
  #33 = InvokeDynamic      #0:#34         // #0:equals:(Lext/mods/gameserver/model/records/custom/Item;Ljava/lang/Object;)Z
  #34 = NameAndType        #35:#36        // equals:(Lext/mods/gameserver/model/records/custom/Item;Ljava/lang/Object;)Z
  #35 = Utf8               equals
  #36 = Utf8               (Lext/mods/gameserver/model/records/custom/Item;Ljava/lang/Object;)Z
  #37 = Utf8               (IIIII)V
  #38 = Utf8               Code
  #39 = Utf8               LineNumberTable
  #40 = Utf8               LocalVariableTable
  #41 = Utf8               this
  #42 = Utf8               Lext/mods/gameserver/model/records/custom/Item;
  #43 = Utf8               MethodParameters
  #44 = Utf8               ()Ljava/lang/String;
  #45 = Utf8               ()I
  #46 = Utf8               (Ljava/lang/Object;)Z
  #47 = Utf8               o
  #48 = Utf8               Ljava/lang/Object;
  #49 = Utf8               SourceFile
  #50 = Utf8               Item.java
  #51 = Utf8               Record
  #52 = Utf8               BootstrapMethods
  #53 = String             #54            // itemId;min;max;enchantLevel;chance
  #54 = Utf8               itemId;min;max;enchantLevel;chance
  #55 = MethodHandle       1:#7           // REF_getField ext/mods/gameserver/model/records/custom/Item.itemId:I
  #56 = MethodHandle       1:#13          // REF_getField ext/mods/gameserver/model/records/custom/Item.min:I
  #57 = MethodHandle       1:#16          // REF_getField ext/mods/gameserver/model/records/custom/Item.max:I
  #58 = MethodHandle       1:#19          // REF_getField ext/mods/gameserver/model/records/custom/Item.enchantLevel:I
  #59 = MethodHandle       1:#22          // REF_getField ext/mods/gameserver/model/records/custom/Item.chance:I
  #60 = MethodHandle       6:#61          // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #61 = Methodref          #62.#63        // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #62 = Class              #64            // java/lang/runtime/ObjectMethods
  #63 = NameAndType        #65:#66        // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #64 = Utf8               java/lang/runtime/ObjectMethods
  #65 = Utf8               bootstrap
  #66 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #67 = Utf8               InnerClasses
  #68 = Class              #69            // java/lang/invoke/MethodHandles$Lookup
  #69 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #70 = Class              #71            // java/lang/invoke/MethodHandles
  #71 = Utf8               java/lang/invoke/MethodHandles
  #72 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.custom.Item(int, int, int, int, int);
    descriptor: (IIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field itemId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field min:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field max:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field enchantLevel:I
        25: aload_0
        26: iload         5
        28: putfield      #22                 // Field chance:I
        31: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/records/custom/Item;
            0      32     1 itemId   I
            0      32     2   min   I
            0      32     3   max   I
            0      32     4 enchantLevel   I
            0      32     5 chance   I
    MethodParameters:
      Name                           Flags
      itemId
      min
      max
      enchantLevel
      chance

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #25,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/custom/Item;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/Item;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #29,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/custom/Item;)I
         6: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/Item;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #33,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/custom/Item;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/custom/Item;
            0       8     1     o   Ljava/lang/Object;

  public int itemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field itemId:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/Item;

  public int min();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field min:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/Item;

  public int max();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field max:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/Item;

  public int enchantLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field enchantLevel:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/Item;

  public int chance();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field chance:I
         4: ireturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/Item;
}
SourceFile: "Item.java"
  Record: length = 0x20 (unknown attribute)
   00 05 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00 00 15 00 0C 00 00 00 18 00 0C 00 00

BootstrapMethods:
  0: #60 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/custom/Item
      #53 itemId;min;max;enchantLevel;chance
      #55 REF_getField ext/mods/gameserver/model/records/custom/Item.itemId:I
      #56 REF_getField ext/mods/gameserver/model/records/custom/Item.min:I
      #57 REF_getField ext/mods/gameserver/model/records/custom/Item.max:I
      #58 REF_getField ext/mods/gameserver/model/records/custom/Item.enchantLevel:I
      #59 REF_getField ext/mods/gameserver/model/records/custom/Item.chance:I
InnerClasses:
  public static final #72= #68 of #70;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
