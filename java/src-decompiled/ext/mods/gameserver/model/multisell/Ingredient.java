// Bytecode for: ext.mods.gameserver.model.multisell.Ingredient
// File: ext\mods\gameserver\model\multisell\Ingredient.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/multisell/Ingredient.class
  Last modified 9 de jul de 2026; size 3031 bytes
  MD5 checksum 0b808968587c978a8fe53e6cf6464d9a
  Compiled from "Ingredient.java"
public class ext.mods.gameserver.model.multisell.Ingredient
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #25                         // ext/mods/gameserver/model/multisell/Ingredient
  super_class: #31                        // java/lang/Object
  interfaces: 0, fields: 6, methods: 17, attributes: 1
Constant pool:
    #1 = String             #2            // id
    #2 = Utf8               id
    #3 = Methodref          #4.#5         // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
    #4 = Class              #6            // ext/mods/commons/data/StatSet
    #5 = NameAndType        #7:#8         // getInteger:(Ljava/lang/String;)I
    #6 = Utf8               ext/mods/commons/data/StatSet
    #7 = Utf8               getInteger
    #8 = Utf8               (Ljava/lang/String;)I
    #9 = String             #10           // count
   #10 = Utf8               count
   #11 = String             #12           // enchant
   #12 = Utf8               enchant
   #13 = Methodref          #4.#14        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #14 = NameAndType        #7:#15        // getInteger:(Ljava/lang/String;I)I
   #15 = Utf8               (Ljava/lang/String;I)I
   #16 = String             #17           // isTaxIngredient
   #17 = Utf8               isTaxIngredient
   #18 = Methodref          #4.#19        // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
   #19 = NameAndType        #20:#21       // getBool:(Ljava/lang/String;Z)Z
   #20 = Utf8               getBool
   #21 = Utf8               (Ljava/lang/String;Z)Z
   #22 = String             #23           // maintainIngredient
   #23 = Utf8               maintainIngredient
   #24 = Methodref          #25.#26       // ext/mods/gameserver/model/multisell/Ingredient."<init>":(IIIZZ)V
   #25 = Class              #27           // ext/mods/gameserver/model/multisell/Ingredient
   #26 = NameAndType        #28:#29       // "<init>":(IIIZZ)V
   #27 = Utf8               ext/mods/gameserver/model/multisell/Ingredient
   #28 = Utf8               <init>
   #29 = Utf8               (IIIZZ)V
   #30 = Methodref          #31.#32       // java/lang/Object."<init>":()V
   #31 = Class              #33           // java/lang/Object
   #32 = NameAndType        #28:#34       // "<init>":()V
   #33 = Utf8               java/lang/Object
   #34 = Utf8               ()V
   #35 = Fieldref           #25.#36       // ext/mods/gameserver/model/multisell/Ingredient._template:Lext/mods/gameserver/model/item/kind/Item;
   #36 = NameAndType        #37:#38       // _template:Lext/mods/gameserver/model/item/kind/Item;
   #37 = Utf8               _template
   #38 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
   #39 = Fieldref           #25.#40       // ext/mods/gameserver/model/multisell/Ingredient._itemId:I
   #40 = NameAndType        #41:#42       // _itemId:I
   #41 = Utf8               _itemId
   #42 = Utf8               I
   #43 = Fieldref           #25.#44       // ext/mods/gameserver/model/multisell/Ingredient._itemCount:I
   #44 = NameAndType        #45:#42       // _itemCount:I
   #45 = Utf8               _itemCount
   #46 = Fieldref           #25.#47       // ext/mods/gameserver/model/multisell/Ingredient._enchantmentLevel:I
   #47 = NameAndType        #48:#42       // _enchantmentLevel:I
   #48 = Utf8               _enchantmentLevel
   #49 = Fieldref           #25.#50       // ext/mods/gameserver/model/multisell/Ingredient._isTaxIngredient:Z
   #50 = NameAndType        #51:#52       // _isTaxIngredient:Z
   #51 = Utf8               _isTaxIngredient
   #52 = Utf8               Z
   #53 = Fieldref           #25.#54       // ext/mods/gameserver/model/multisell/Ingredient._maintainIngredient:Z
   #54 = NameAndType        #55:#52       // _maintainIngredient:Z
   #55 = Utf8               _maintainIngredient
   #56 = Methodref          #57.#58       // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #57 = Class              #59           // ext/mods/gameserver/data/xml/ItemData
   #58 = NameAndType        #60:#61       // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #59 = Utf8               ext/mods/gameserver/data/xml/ItemData
   #60 = Utf8               getInstance
   #61 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
   #62 = Methodref          #57.#63       // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #63 = NameAndType        #64:#65       // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #64 = Utf8               getTemplate
   #65 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
   #66 = Methodref          #67.#68       // ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
   #67 = Class              #69           // ext/mods/gameserver/model/item/kind/Item
   #68 = NameAndType        #70:#71       // isStackable:()Z
   #69 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #70 = Utf8               isStackable
   #71 = Utf8               ()Z
   #72 = Class              #73           // ext/mods/gameserver/model/item/kind/Armor
   #73 = Utf8               ext/mods/gameserver/model/item/kind/Armor
   #74 = Class              #75           // ext/mods/gameserver/model/item/kind/Weapon
   #75 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
   #76 = Methodref          #67.#77       // ext/mods/gameserver/model/item/kind/Item.getWeight:()I
   #77 = NameAndType        #78:#79       // getWeight:()I
   #78 = Utf8               getWeight
   #79 = Utf8               ()I
   #80 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #81 = Utf8               Code
   #82 = Utf8               LineNumberTable
   #83 = Utf8               LocalVariableTable
   #84 = Utf8               this
   #85 = Utf8               Lext/mods/gameserver/model/multisell/Ingredient;
   #86 = Utf8               set
   #87 = Utf8               Lext/mods/commons/data/StatSet;
   #88 = Utf8               itemId
   #89 = Utf8               itemCount
   #90 = Utf8               enchantmentLevel
   #91 = Utf8               StackMapTable
   #92 = Utf8               getCopy
   #93 = Utf8               ()Lext/mods/gameserver/model/multisell/Ingredient;
   #94 = Utf8               getItemId
   #95 = Utf8               setItemId
   #96 = Utf8               (I)V
   #97 = Utf8               getItemCount
   #98 = Utf8               setItemCount
   #99 = Utf8               getEnchantLevel
  #100 = Utf8               setEnchantLevel
  #101 = Utf8               setIsTaxIngredient
  #102 = Utf8               (Z)V
  #103 = Utf8               getMaintainIngredient
  #104 = Utf8               setMaintainIngredient
  #105 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #106 = Utf8               isArmorOrWeapon
  #107 = Utf8               SourceFile
  #108 = Utf8               Ingredient.java
{
  public ext.mods.gameserver.model.multisell.Ingredient(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #1                  // String id
         4: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #9                  // String count
        10: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: aload_1
        14: ldc           #11                 // String enchant
        16: iconst_0
        17: invokevirtual #13                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        20: aload_1
        21: ldc           #16                 // String isTaxIngredient
        23: iconst_0
        24: invokevirtual #18                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        27: aload_1
        28: ldc           #22                 // String maintainIngredient
        30: iconst_0
        31: invokevirtual #18                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        34: invokespecial #24                 // Method "<init>":(IIIZZ)V
        37: return
      LineNumberTable:
        line 43: 0
        line 44: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/multisell/Ingredient;
            0      38     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.multisell.Ingredient(int, int, int, boolean, boolean);
    descriptor: (IIIZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=6
         0: aload_0
         1: invokespecial #30                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aconst_null
         6: putfield      #35                 // Field _template:Lext/mods/gameserver/model/item/kind/Item;
         9: aload_0
        10: iload_1
        11: putfield      #39                 // Field _itemId:I
        14: aload_0
        15: iload_2
        16: putfield      #43                 // Field _itemCount:I
        19: aload_0
        20: iload_3
        21: putfield      #46                 // Field _enchantmentLevel:I
        24: aload_0
        25: iload         4
        27: putfield      #49                 // Field _isTaxIngredient:Z
        30: aload_0
        31: iload         5
        33: putfield      #53                 // Field _maintainIngredient:Z
        36: aload_0
        37: getfield      #39                 // Field _itemId:I
        40: ifle          57
        43: aload_0
        44: invokestatic  #56                 // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
        47: aload_0
        48: getfield      #39                 // Field _itemId:I
        51: invokevirtual #62                 // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        54: putfield      #35                 // Field _template:Lext/mods/gameserver/model/item/kind/Item;
        57: return
      LineNumberTable:
        line 47: 0
        line 39: 4
        line 48: 9
        line 49: 14
        line 50: 19
        line 51: 24
        line 52: 30
        line 54: 36
        line 55: 43
        line 56: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/multisell/Ingredient;
            0      58     1 itemId   I
            0      58     2 itemCount   I
            0      58     3 enchantmentLevel   I
            0      58     4 isTaxIngredient   Z
            0      58     5 maintainIngredient   Z
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/model/multisell/Ingredient, int, int, int, int, int ]
          stack = []

  public ext.mods.gameserver.model.multisell.Ingredient getCopy();
    descriptor: ()Lext/mods/gameserver/model/multisell/Ingredient;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: new           #25                 // class ext/mods/gameserver/model/multisell/Ingredient
         3: dup
         4: aload_0
         5: getfield      #39                 // Field _itemId:I
         8: aload_0
         9: getfield      #43                 // Field _itemCount:I
        12: aload_0
        13: getfield      #46                 // Field _enchantmentLevel:I
        16: aload_0
        17: getfield      #49                 // Field _isTaxIngredient:Z
        20: aload_0
        21: getfield      #53                 // Field _maintainIngredient:Z
        24: invokespecial #24                 // Method "<init>":(IIIZZ)V
        27: areturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/multisell/Ingredient;

  public final int getItemId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _itemId:I
         4: ireturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/Ingredient;

  public final void setItemId(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #39                 // Field _itemId:I
         5: return
      LineNumberTable:
        line 73: 0
        line 74: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/multisell/Ingredient;
            0       6     1 itemId   I

  public final int getItemCount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field _itemCount:I
         4: ireturn
      LineNumberTable:
        line 78: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/Ingredient;

  public final void setItemCount(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #43                 // Field _itemCount:I
         5: return
      LineNumberTable:
        line 83: 0
        line 84: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/multisell/Ingredient;
            0       6     1 itemCount   I

  public final int getEnchantLevel();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field _enchantmentLevel:I
         4: ireturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/Ingredient;

  public final void setEnchantLevel(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #46                 // Field _enchantmentLevel:I
         5: return
      LineNumberTable:
        line 93: 0
        line 94: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/multisell/Ingredient;
            0       6     1 enchantmentLevel   I

  public final boolean isTaxIngredient();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #49                 // Field _isTaxIngredient:Z
         4: ireturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/Ingredient;

  public final void setIsTaxIngredient(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #49                 // Field _isTaxIngredient:Z
         5: return
      LineNumberTable:
        line 103: 0
        line 104: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/multisell/Ingredient;
            0       6     1 isTaxIngredient   Z

  public final boolean getMaintainIngredient();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _maintainIngredient:Z
         4: ireturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/Ingredient;

  public final void setMaintainIngredient(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #53                 // Field _maintainIngredient:Z
         5: return
      LineNumberTable:
        line 113: 0
        line 114: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/multisell/Ingredient;
            0       6     1 maintainIngredient   Z

  public final ext.mods.gameserver.model.item.kind.Item getTemplate();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Item;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _template:Lext/mods/gameserver/model/item/kind/Item;
         4: areturn
      LineNumberTable:
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/multisell/Ingredient;

  public final boolean isStackable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _template:Lext/mods/gameserver/model/item/kind/Item;
         4: ifnull        17
         7: aload_0
         8: getfield      #35                 // Field _template:Lext/mods/gameserver/model/item/kind/Item;
        11: invokevirtual #66                 // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
        14: ifeq          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 123: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/multisell/Ingredient;
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isArmorOrWeapon();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _template:Lext/mods/gameserver/model/item/kind/Item;
         4: instanceof    #72                 // class ext/mods/gameserver/model/item/kind/Armor
         7: ifne          20
        10: aload_0
        11: getfield      #35                 // Field _template:Lext/mods/gameserver/model/item/kind/Item;
        14: instanceof    #74                 // class ext/mods/gameserver/model/item/kind/Weapon
        17: ifeq          24
        20: iconst_1
        21: goto          25
        24: iconst_0
        25: ireturn
      LineNumberTable:
        line 128: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/multisell/Ingredient;
      StackMapTable: number_of_entries = 3
        frame_type = 20 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final int getWeight();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _template:Lext/mods/gameserver/model/item/kind/Item;
         4: ifnonnull     11
         7: iconst_0
         8: goto          18
        11: aload_0
        12: getfield      #35                 // Field _template:Lext/mods/gameserver/model/item/kind/Item;
        15: invokevirtual #76                 // Method ext/mods/gameserver/model/item/kind/Item.getWeight:()I
        18: ireturn
      LineNumberTable:
        line 133: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/multisell/Ingredient;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "Ingredient.java"
