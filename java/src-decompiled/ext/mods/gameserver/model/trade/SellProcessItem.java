// Bytecode for: ext.mods.gameserver.model.trade.SellProcessItem
// File: ext\mods\gameserver\model\trade\SellProcessItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/trade/SellProcessItem.class
  Last modified 9 de jul de 2026; size 1111 bytes
  MD5 checksum 1c6229080a31663019caa590f4fc80eb
  Compiled from "SellProcessItem.java"
public class ext.mods.gameserver.model.trade.SellProcessItem
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/trade/SellProcessItem
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/trade/SellProcessItem._objectId:I
   #8 = Class              #10            // ext/mods/gameserver/model/trade/SellProcessItem
   #9 = NameAndType        #11:#12        // _objectId:I
  #10 = Utf8               ext/mods/gameserver/model/trade/SellProcessItem
  #11 = Utf8               _objectId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/trade/SellProcessItem._count:I
  #14 = NameAndType        #15:#12        // _count:I
  #15 = Utf8               _count
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/trade/SellProcessItem._price:I
  #17 = NameAndType        #18:#12        // _price:I
  #18 = Utf8               _price
  #19 = Methodref          #20.#21        // ext/mods/gameserver/model/trade/TradeList.addItem:(III)Lext/mods/gameserver/model/trade/TradeItem;
  #20 = Class              #22            // ext/mods/gameserver/model/trade/TradeList
  #21 = NameAndType        #23:#24        // addItem:(III)Lext/mods/gameserver/model/trade/TradeItem;
  #22 = Utf8               ext/mods/gameserver/model/trade/TradeList
  #23 = Utf8               addItem
  #24 = Utf8               (III)Lext/mods/gameserver/model/trade/TradeItem;
  #25 = Utf8               (III)V
  #26 = Utf8               Code
  #27 = Utf8               LineNumberTable
  #28 = Utf8               LocalVariableTable
  #29 = Utf8               this
  #30 = Utf8               Lext/mods/gameserver/model/trade/SellProcessItem;
  #31 = Utf8               objectId
  #32 = Utf8               count
  #33 = Utf8               price
  #34 = Utf8               getObjectId
  #35 = Utf8               ()I
  #36 = Utf8               getCount
  #37 = Utf8               getPrice
  #38 = Utf8               ()J
  #39 = Utf8               addToTradeList
  #40 = Utf8               (Lext/mods/gameserver/model/trade/TradeList;)Z
  #41 = Utf8               list
  #42 = Utf8               Lext/mods/gameserver/model/trade/TradeList;
  #43 = Utf8               StackMapTable
  #44 = Utf8               SourceFile
  #45 = Utf8               SellProcessItem.java
{
  public ext.mods.gameserver.model.trade.SellProcessItem(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _objectId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _count:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field _price:I
        19: return
      LineNumberTable:
        line 27: 0
        line 28: 4
        line 29: 9
        line 30: 14
        line 31: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/trade/SellProcessItem;
            0      20     1 objectId   I
            0      20     2 count   I
            0      20     3 price   I

  public int getObjectId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _objectId:I
         4: ireturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/SellProcessItem;

  public int getCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _count:I
         4: ireturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/SellProcessItem;

  public long getPrice();
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
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/trade/SellProcessItem;

  public boolean addToTradeList(ext.mods.gameserver.model.trade.TradeList);
    descriptor: (Lext/mods/gameserver/model/trade/TradeList;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_1
         1: aload_0
         2: getfield      #7                  // Field _objectId:I
         5: aload_0
         6: getfield      #13                 // Field _count:I
         9: aload_0
        10: getfield      #16                 // Field _price:I
        13: invokevirtual #19                 // Method ext/mods/gameserver/model/trade/TradeList.addItem:(III)Lext/mods/gameserver/model/trade/TradeItem;
        16: ifnull        23
        19: iconst_1
        20: goto          24
        23: iconst_0
        24: ireturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/trade/SellProcessItem;
            0      25     1  list   Lext/mods/gameserver/model/trade/TradeList;
      StackMapTable: number_of_entries = 2
        frame_type = 23 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "SellProcessItem.java"
