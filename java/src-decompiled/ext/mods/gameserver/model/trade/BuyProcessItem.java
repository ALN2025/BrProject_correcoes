// Bytecode for: ext.mods.gameserver.model.trade.BuyProcessItem
// File: ext\mods\gameserver\model\trade\BuyProcessItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/trade/BuyProcessItem.class
  Last modified 9 de jul de 2026; size 1320 bytes
  MD5 checksum 7d5af9b76a44ff3b30a0943bf05d45b7
  Compiled from "BuyProcessItem.java"
public class ext.mods.gameserver.model.trade.BuyProcessItem
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/trade/BuyProcessItem
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/trade/BuyProcessItem._itemId:I
   #8 = Class              #10            // ext/mods/gameserver/model/trade/BuyProcessItem
   #9 = NameAndType        #11:#12        // _itemId:I
  #10 = Utf8               ext/mods/gameserver/model/trade/BuyProcessItem
  #11 = Utf8               _itemId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/trade/BuyProcessItem._count:I
  #14 = NameAndType        #15:#12        // _count:I
  #15 = Utf8               _count
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/trade/BuyProcessItem._price:I
  #17 = NameAndType        #18:#12        // _price:I
  #18 = Utf8               _price
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/trade/BuyProcessItem._enchant:I
  #20 = NameAndType        #21:#12        // _enchant:I
  #21 = Utf8               _enchant
  #22 = Methodref          #23.#24        // ext/mods/gameserver/model/trade/TradeList.addItemByItemId:(IIII)Lext/mods/gameserver/model/trade/TradeItem;
  #23 = Class              #25            // ext/mods/gameserver/model/trade/TradeList
  #24 = NameAndType        #26:#27        // addItemByItemId:(IIII)Lext/mods/gameserver/model/trade/TradeItem;
  #25 = Utf8               ext/mods/gameserver/model/trade/TradeList
  #26 = Utf8               addItemByItemId
  #27 = Utf8               (IIII)Lext/mods/gameserver/model/trade/TradeItem;
  #28 = Utf8               (IIII)V
  #29 = Utf8               Code
  #30 = Utf8               LineNumberTable
  #31 = Utf8               LocalVariableTable
  #32 = Utf8               this
  #33 = Utf8               Lext/mods/gameserver/model/trade/BuyProcessItem;
  #34 = Utf8               itemId
  #35 = Utf8               count
  #36 = Utf8               price
  #37 = Utf8               enchant
  #38 = Utf8               getItemId
  #39 = Utf8               ()I
  #40 = Utf8               getCount
  #41 = Utf8               getPrice
  #42 = Utf8               getEnchant
  #43 = Utf8               getCost
  #44 = Utf8               ()J
  #45 = Utf8               addToTradeList
  #46 = Utf8               (Lext/mods/gameserver/model/trade/TradeList;)Z
  #47 = Utf8               list
  #48 = Utf8               Lext/mods/gameserver/model/trade/TradeList;
  #49 = Utf8               StackMapTable
  #50 = Utf8               SourceFile
  #51 = Utf8               BuyProcessItem.java
{
  public ext.mods.gameserver.model.trade.BuyProcessItem(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _itemId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _count:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field _price:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field _enchant:I
        25: return
      LineNumberTable:
        line 28: 0
        line 29: 4
        line 30: 9
        line 31: 14
        line 32: 19
        line 33: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/trade/BuyProcessItem;
            0      26     1 itemId   I
            0      26     2 count   I
            0      26     3 price   I
            0      26     4 enchant   I

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _itemId:I
         4: ireturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/BuyProcessItem;

  public int getCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _count:I
         4: ireturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/BuyProcessItem;

  public int getPrice();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _price:I
         4: ireturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/BuyProcessItem;

  public int getEnchant();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _enchant:I
         4: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/BuyProcessItem;

  public long getCost();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _count:I
         4: aload_0
         5: getfield      #16                 // Field _price:I
         8: imul
         9: i2l
        10: lreturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/trade/BuyProcessItem;

  public boolean addToTradeList(ext.mods.gameserver.model.trade.TradeList);
    descriptor: (Lext/mods/gameserver/model/trade/TradeList;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: aload_0
         2: getfield      #7                  // Field _itemId:I
         5: aload_0
         6: getfield      #13                 // Field _count:I
         9: aload_0
        10: getfield      #16                 // Field _price:I
        13: aload_0
        14: getfield      #19                 // Field _enchant:I
        17: invokevirtual #22                 // Method ext/mods/gameserver/model/trade/TradeList.addItemByItemId:(IIII)Lext/mods/gameserver/model/trade/TradeItem;
        20: ifnull        27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/trade/BuyProcessItem;
            0      29     1  list   Lext/mods/gameserver/model/trade/TradeList;
      StackMapTable: number_of_entries = 2
        frame_type = 27 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "BuyProcessItem.java"
