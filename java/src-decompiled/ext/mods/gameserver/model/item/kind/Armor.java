// Bytecode for: ext.mods.gameserver.model.item.kind.Armor
// File: ext\mods\gameserver\model\item\kind\Armor.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/item/kind/Armor.class
  Last modified 9 de jul de 2026; size 1349 bytes
  MD5 checksum f4cbf6c34558c9ab9e7dd802419994b0
  Compiled from "Armor.java"
public final class ext.mods.gameserver.model.item.kind.Armor extends ext.mods.gameserver.model.item.kind.Item
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #22                         // ext/mods/gameserver/model/item/kind/Armor
  super_class: #2                         // ext/mods/gameserver/model/item/kind/Item
  interfaces: 0, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/item/kind/Item."<init>":(Lext/mods/commons/data/StatSet;)V
   #2 = Class              #4             // ext/mods/gameserver/model/item/kind/Item
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/commons/data/StatSet;)V
   #4 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #7 = String             #8             // armor_type
   #8 = Utf8               armor_type
   #9 = Class              #10            // ext/mods/gameserver/enums/items/ArmorType
  #10 = Utf8               ext/mods/gameserver/enums/items/ArmorType
  #11 = Fieldref           #9.#12         // ext/mods/gameserver/enums/items/ArmorType.NONE:Lext/mods/gameserver/enums/items/ArmorType;
  #12 = NameAndType        #13:#14        // NONE:Lext/mods/gameserver/enums/items/ArmorType;
  #13 = Utf8               NONE
  #14 = Utf8               Lext/mods/gameserver/enums/items/ArmorType;
  #15 = Methodref          #16.#17        // ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #16 = Class              #18            // ext/mods/commons/data/StatSet
  #17 = NameAndType        #19:#20        // getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #18 = Utf8               ext/mods/commons/data/StatSet
  #19 = Utf8               getEnum
  #20 = Utf8               (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #21 = Fieldref           #22.#23        // ext/mods/gameserver/model/item/kind/Armor._type:Lext/mods/gameserver/enums/items/ArmorType;
  #22 = Class              #24            // ext/mods/gameserver/model/item/kind/Armor
  #23 = NameAndType        #25:#14        // _type:Lext/mods/gameserver/enums/items/ArmorType;
  #24 = Utf8               ext/mods/gameserver/model/item/kind/Armor
  #25 = Utf8               _type
  #26 = Methodref          #22.#27        // ext/mods/gameserver/model/item/kind/Armor.getBodyPart:()I
  #27 = NameAndType        #28:#29        // getBodyPart:()I
  #28 = Utf8               getBodyPart
  #29 = Utf8               ()I
  #30 = Integer            65536
  #31 = Integer            262144
  #32 = Integer            524288
  #33 = Fieldref           #22.#34        // ext/mods/gameserver/model/item/kind/Armor._type1:I
  #34 = NameAndType        #35:#36        // _type1:I
  #35 = Utf8               _type1
  #36 = Utf8               I
  #37 = Fieldref           #22.#38        // ext/mods/gameserver/model/item/kind/Armor._type2:I
  #38 = NameAndType        #39:#36        // _type2:I
  #39 = Utf8               _type2
  #40 = Fieldref           #9.#41         // ext/mods/gameserver/enums/items/ArmorType.SHIELD:Lext/mods/gameserver/enums/items/ArmorType;
  #41 = NameAndType        #42:#14        // SHIELD:Lext/mods/gameserver/enums/items/ArmorType;
  #42 = Utf8               SHIELD
  #43 = Methodref          #22.#44        // ext/mods/gameserver/model/item/kind/Armor.getItemType:()Lext/mods/gameserver/enums/items/ArmorType;
  #44 = NameAndType        #45:#46        // getItemType:()Lext/mods/gameserver/enums/items/ArmorType;
  #45 = Utf8               getItemType
  #46 = Utf8               ()Lext/mods/gameserver/enums/items/ArmorType;
  #47 = Methodref          #9.#48         // ext/mods/gameserver/enums/items/ArmorType.mask:()I
  #48 = NameAndType        #49:#29        // mask:()I
  #49 = Utf8               mask
  #50 = Utf8               Code
  #51 = Utf8               LineNumberTable
  #52 = Utf8               LocalVariableTable
  #53 = Utf8               this
  #54 = Utf8               Lext/mods/gameserver/model/item/kind/Armor;
  #55 = Utf8               set
  #56 = Utf8               Lext/mods/commons/data/StatSet;
  #57 = Utf8               StackMapTable
  #58 = Utf8               getItemMask
  #59 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
  #60 = Utf8               SourceFile
  #61 = Utf8               Armor.java
{
  public ext.mods.gameserver.model.item.kind.Armor(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/item/kind/Item."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: aload_1
         7: ldc           #7                  // String armor_type
         9: ldc           #9                  // class ext/mods/gameserver/enums/items/ArmorType
        11: getstatic     #11                 // Field ext/mods/gameserver/enums/items/ArmorType.NONE:Lext/mods/gameserver/enums/items/ArmorType;
        14: invokevirtual #15                 // Method ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
        17: checkcast     #9                  // class ext/mods/gameserver/enums/items/ArmorType
        20: putfield      #21                 // Field _type:Lext/mods/gameserver/enums/items/ArmorType;
        23: aload_0
        24: invokevirtual #26                 // Method getBodyPart:()I
        27: bipush        8
        29: if_icmpeq     89
        32: aload_0
        33: invokevirtual #26                 // Method getBodyPart:()I
        36: ldc           #30                 // int 65536
        38: if_icmpeq     89
        41: aload_0
        42: invokevirtual #26                 // Method getBodyPart:()I
        45: ldc           #31                 // int 262144
        47: if_icmpeq     89
        50: aload_0
        51: invokevirtual #26                 // Method getBodyPart:()I
        54: ldc           #32                 // int 524288
        56: if_icmpeq     89
        59: aload_0
        60: invokevirtual #26                 // Method getBodyPart:()I
        63: iconst_4
        64: iand
        65: ifne          89
        68: aload_0
        69: invokevirtual #26                 // Method getBodyPart:()I
        72: bipush        32
        74: iand
        75: ifne          89
        78: aload_0
        79: invokevirtual #26                 // Method getBodyPart:()I
        82: sipush        8192
        85: iand
        86: ifeq          102
        89: aload_0
        90: iconst_0
        91: putfield      #33                 // Field _type1:I
        94: aload_0
        95: iconst_2
        96: putfield      #37                 // Field _type2:I
        99: goto          139
       102: aload_0
       103: getfield      #21                 // Field _type:Lext/mods/gameserver/enums/items/ArmorType;
       106: getstatic     #11                 // Field ext/mods/gameserver/enums/items/ArmorType.NONE:Lext/mods/gameserver/enums/items/ArmorType;
       109: if_acmpne     129
       112: aload_0
       113: invokevirtual #26                 // Method getBodyPart:()I
       116: sipush        256
       119: if_icmpne     129
       122: aload_0
       123: getstatic     #40                 // Field ext/mods/gameserver/enums/items/ArmorType.SHIELD:Lext/mods/gameserver/enums/items/ArmorType;
       126: putfield      #21                 // Field _type:Lext/mods/gameserver/enums/items/ArmorType;
       129: aload_0
       130: iconst_1
       131: putfield      #33                 // Field _type1:I
       134: aload_0
       135: iconst_1
       136: putfield      #37                 // Field _type2:I
       139: return
      LineNumberTable:
        line 33: 0
        line 35: 5
        line 37: 23
        line 39: 89
        line 40: 94
        line 44: 102
        line 45: 122
        line 47: 129
        line 48: 134
        line 50: 139
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     140     0  this   Lext/mods/gameserver/model/item/kind/Armor;
            0     140     1   set   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 89
          locals = [ class ext/mods/gameserver/model/item/kind/Armor, class ext/mods/commons/data/StatSet ]
          stack = []
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 9 /* same */

  public ext.mods.gameserver.enums.items.ArmorType getItemType();
    descriptor: ()Lext/mods/gameserver/enums/items/ArmorType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _type:Lext/mods/gameserver/enums/items/ArmorType;
         4: areturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Armor;

  public final int getItemMask();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #43                 // Method getItemType:()Lext/mods/gameserver/enums/items/ArmorType;
         4: invokevirtual #47                 // Method ext/mods/gameserver/enums/items/ArmorType.mask:()I
         7: ireturn
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/kind/Armor;

  public ext.mods.gameserver.enums.items.ItemType getItemType();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemType;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #43                 // Method getItemType:()Lext/mods/gameserver/enums/items/ArmorType;
         4: areturn
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Armor;
}
SourceFile: "Armor.java"
