// Bytecode for: ext.mods.gameserver.model.trade.TradeItem
// File: ext\mods\gameserver\model\trade\TradeItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/trade/TradeItem.class
  Last modified 9 de jul de 2026; size 2418 bytes
  MD5 checksum 954d8b64670b01b0b870db8fcd05ea6c
  Compiled from "TradeItem.java"
public class ext.mods.gameserver.model.trade.TradeItem extends ext.mods.gameserver.model.trade.ItemRequest
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #26                         // ext/mods/gameserver/model/trade/TradeItem
  super_class: #20                        // ext/mods/gameserver/model/trade/ItemRequest
  interfaces: 0, fields: 2, methods: 7, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
    #2 = Class              #4            // ext/mods/gameserver/model/item/instance/ItemInstance
    #3 = NameAndType        #5:#6         // getObjectId:()I
    #4 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
    #5 = Utf8               getObjectId
    #6 = Utf8               ()I
    #7 = Methodref          #2.#8         // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
    #8 = NameAndType        #9:#10        // getItem:()Lext/mods/gameserver/model/item/kind/Item;
    #9 = Utf8               getItem
   #10 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #11 = Methodref          #12.#13       // ext/mods/gameserver/model/item/kind/Item.getItemId:()I
   #12 = Class              #14           // ext/mods/gameserver/model/item/kind/Item
   #13 = NameAndType        #15:#6        // getItemId:()I
   #14 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #15 = Utf8               getItemId
   #16 = Methodref          #2.#17        // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
   #17 = NameAndType        #18:#6        // getEnchantLevel:()I
   #18 = Utf8               getEnchantLevel
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/trade/ItemRequest."<init>":(IIIII)V
   #20 = Class              #22           // ext/mods/gameserver/model/trade/ItemRequest
   #21 = NameAndType        #23:#24       // "<init>":(IIIII)V
   #22 = Utf8               ext/mods/gameserver/model/trade/ItemRequest
   #23 = Utf8               <init>
   #24 = Utf8               (IIIII)V
   #25 = Fieldref           #26.#27       // ext/mods/gameserver/model/trade/TradeItem._item:Lext/mods/gameserver/model/item/kind/Item;
   #26 = Class              #28           // ext/mods/gameserver/model/trade/TradeItem
   #27 = NameAndType        #29:#30       // _item:Lext/mods/gameserver/model/item/kind/Item;
   #28 = Utf8               ext/mods/gameserver/model/trade/TradeItem
   #29 = Utf8               _item
   #30 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
   #31 = Fieldref           #26.#32       // ext/mods/gameserver/model/trade/TradeItem._quantity:I
   #32 = NameAndType        #33:#34       // _quantity:I
   #33 = Utf8               _quantity
   #34 = Utf8               I
   #35 = Methodref          #26.#3        // ext/mods/gameserver/model/trade/TradeItem.getObjectId:()I
   #36 = Methodref          #26.#13       // ext/mods/gameserver/model/trade/TradeItem.getItemId:()I
   #37 = Methodref          #26.#38       // ext/mods/gameserver/model/trade/TradeItem.getEnchant:()I
   #38 = NameAndType        #39:#6        // getEnchant:()I
   #39 = Utf8               getEnchant
   #40 = Methodref          #26.#8        // ext/mods/gameserver/model/trade/TradeItem.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #41 = Methodref          #42.#43       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #42 = Class              #44           // java/lang/String
   #43 = NameAndType        #45:#46       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #44 = Utf8               java/lang/String
   #45 = Utf8               valueOf
   #46 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #47 = Fieldref           #26.#48       // ext/mods/gameserver/model/trade/TradeItem._objectId:I
   #48 = NameAndType        #49:#34       // _objectId:I
   #49 = Utf8               _objectId
   #50 = Fieldref           #26.#51       // ext/mods/gameserver/model/trade/TradeItem._itemId:I
   #51 = NameAndType        #52:#34       // _itemId:I
   #52 = Utf8               _itemId
   #53 = Fieldref           #26.#54       // ext/mods/gameserver/model/trade/TradeItem._count:I
   #54 = NameAndType        #55:#34       // _count:I
   #55 = Utf8               _count
   #56 = Fieldref           #26.#57       // ext/mods/gameserver/model/trade/TradeItem._price:I
   #57 = NameAndType        #58:#34       // _price:I
   #58 = Utf8               _price
   #59 = Fieldref           #26.#60       // ext/mods/gameserver/model/trade/TradeItem._enchant:I
   #60 = NameAndType        #61:#34       // _enchant:I
   #61 = Utf8               _enchant
   #62 = InvokeDynamic      #0:#63        // #0:makeConcatWithConstants:(Ljava/lang/String;IIIIII)Ljava/lang/String;
   #63 = NameAndType        #64:#65       // makeConcatWithConstants:(Ljava/lang/String;IIIIII)Ljava/lang/String;
   #64 = Utf8               makeConcatWithConstants
   #65 = Utf8               (Ljava/lang/String;IIIIII)Ljava/lang/String;
   #66 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;II)V
   #67 = Utf8               Code
   #68 = Utf8               LineNumberTable
   #69 = Utf8               LocalVariableTable
   #70 = Utf8               this
   #71 = Utf8               Lext/mods/gameserver/model/trade/TradeItem;
   #72 = Utf8               item
   #73 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
   #74 = Utf8               count
   #75 = Utf8               price
   #76 = Utf8               (Lext/mods/gameserver/model/item/kind/Item;III)V
   #77 = Utf8               enchant
   #78 = Utf8               (Lext/mods/gameserver/model/trade/TradeItem;II)V
   #79 = Utf8               toString
   #80 = Utf8               ()Ljava/lang/String;
   #81 = Utf8               getQuantity
   #82 = Utf8               setQuantity
   #83 = Utf8               (I)V
   #84 = Utf8               quantity
   #85 = Utf8               SourceFile
   #86 = Utf8               TradeItem.java
   #87 = Utf8               BootstrapMethods
   #88 = String             #89           // TradeItem [item=\u0001, quantity=\u0001, objectId=\u0001, itemId=\u0001, count=\u0001, price=\u0001, enchant=\u0001]
   #89 = Utf8               TradeItem [item=\u0001, quantity=\u0001, objectId=\u0001, itemId=\u0001, count=\u0001, price=\u0001, enchant=\u0001]
   #90 = MethodHandle       6:#91         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #91 = Methodref          #92.#93       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #92 = Class              #94           // java/lang/invoke/StringConcatFactory
   #93 = NameAndType        #64:#95       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #94 = Utf8               java/lang/invoke/StringConcatFactory
   #95 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #96 = Utf8               InnerClasses
   #97 = Class              #98           // java/lang/invoke/MethodHandles$Lookup
   #98 = Utf8               java/lang/invoke/MethodHandles$Lookup
   #99 = Class              #100          // java/lang/invoke/MethodHandles
  #100 = Utf8               java/lang/invoke/MethodHandles
  #101 = Utf8               Lookup
{
  public ext.mods.gameserver.model.trade.TradeItem(ext.mods.gameserver.model.item.instance.ItemInstance, int, int);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: invokevirtual #1                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
         5: aload_1
         6: invokevirtual #7                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
         9: invokevirtual #11                 // Method ext/mods/gameserver/model/item/kind/Item.getItemId:()I
        12: iload_2
        13: iload_3
        14: aload_1
        15: invokevirtual #16                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        18: invokespecial #19                 // Method ext/mods/gameserver/model/trade/ItemRequest."<init>":(IIIII)V
        21: aload_0
        22: aload_1
        23: invokevirtual #7                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        26: putfield      #25                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        29: aload_0
        30: iload_2
        31: putfield      #31                 // Field _quantity:I
        34: return
      LineNumberTable:
        line 30: 0
        line 32: 21
        line 33: 29
        line 34: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/trade/TradeItem;
            0      35     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      35     2 count   I
            0      35     3 price   I

  public ext.mods.gameserver.model.trade.TradeItem(ext.mods.gameserver.model.item.kind.Item, int, int, int);
    descriptor: (Lext/mods/gameserver/model/item/kind/Item;III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=5
         0: aload_0
         1: iconst_0
         2: aload_1
         3: invokevirtual #11                 // Method ext/mods/gameserver/model/item/kind/Item.getItemId:()I
         6: iload_2
         7: iload_3
         8: iload         4
        10: invokespecial #19                 // Method ext/mods/gameserver/model/trade/ItemRequest."<init>":(IIIII)V
        13: aload_0
        14: aload_1
        15: putfield      #25                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        18: aload_0
        19: iload_2
        20: putfield      #31                 // Field _quantity:I
        23: return
      LineNumberTable:
        line 38: 0
        line 40: 13
        line 41: 18
        line 42: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/trade/TradeItem;
            0      24     1  item   Lext/mods/gameserver/model/item/kind/Item;
            0      24     2 count   I
            0      24     3 price   I
            0      24     4 enchant   I

  public ext.mods.gameserver.model.trade.TradeItem(ext.mods.gameserver.model.trade.TradeItem, int, int);
    descriptor: (Lext/mods/gameserver/model/trade/TradeItem;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: invokevirtual #35                 // Method getObjectId:()I
         5: aload_1
         6: invokevirtual #36                 // Method getItemId:()I
         9: iload_2
        10: iload_3
        11: aload_1
        12: invokevirtual #37                 // Method getEnchant:()I
        15: invokespecial #19                 // Method ext/mods/gameserver/model/trade/ItemRequest."<init>":(IIIII)V
        18: aload_0
        19: aload_1
        20: invokevirtual #40                 // Method getItem:()Lext/mods/gameserver/model/item/kind/Item;
        23: putfield      #25                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        26: aload_0
        27: iload_2
        28: putfield      #31                 // Field _quantity:I
        31: return
      LineNumberTable:
        line 46: 0
        line 48: 18
        line 49: 26
        line 50: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/trade/TradeItem;
            0      32     1  item   Lext/mods/gameserver/model/trade/TradeItem;
            0      32     2 count   I
            0      32     3 price   I

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokestatic  #41                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         7: aload_0
         8: getfield      #31                 // Field _quantity:I
        11: aload_0
        12: getfield      #47                 // Field _objectId:I
        15: aload_0
        16: getfield      #50                 // Field _itemId:I
        19: aload_0
        20: getfield      #53                 // Field _count:I
        23: aload_0
        24: getfield      #56                 // Field _price:I
        27: aload_0
        28: getfield      #59                 // Field _enchant:I
        31: invokedynamic #62,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;IIIIII)Ljava/lang/String;
        36: areturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/model/trade/TradeItem;

  public ext.mods.gameserver.model.item.kind.Item getItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Item;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: areturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/TradeItem;

  public int getQuantity();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field _quantity:I
         4: ireturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/TradeItem;

  public void setQuantity(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #31                 // Field _quantity:I
         5: return
      LineNumberTable:
        line 70: 0
        line 71: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/trade/TradeItem;
            0       6     1 quantity   I
}
SourceFile: "TradeItem.java"
BootstrapMethods:
  0: #90 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #88 TradeItem [item=\u0001, quantity=\u0001, objectId=\u0001, itemId=\u0001, count=\u0001, price=\u0001, enchant=\u0001]
InnerClasses:
  public static final #101= #97 of #99;   // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
