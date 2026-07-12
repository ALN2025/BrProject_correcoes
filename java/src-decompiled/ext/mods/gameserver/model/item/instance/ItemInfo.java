// Bytecode for: ext.mods.gameserver.model.item.instance.ItemInfo
// File: ext\mods\gameserver\model\item\instance\ItemInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/item/instance/ItemInfo.class
  Last modified 9 de jul de 2026; size 2552 bytes
  MD5 checksum efe9b676c84c4ede55791b77934dc3ed
  Compiled from "ItemInfo.java"
public class ext.mods.gameserver.model.item.instance.ItemInfo
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/item/instance/ItemInfo
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 10, methods: 13, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
    #8 = Class              #10           // ext/mods/gameserver/model/item/instance/ItemInstance
    #9 = NameAndType        #11:#12       // getObjectId:()I
   #10 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #11 = Utf8               getObjectId
   #12 = Utf8               ()I
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/item/instance/ItemInfo._objectId:I
   #14 = Class              #16           // ext/mods/gameserver/model/item/instance/ItemInfo
   #15 = NameAndType        #17:#18       // _objectId:I
   #16 = Utf8               ext/mods/gameserver/model/item/instance/ItemInfo
   #17 = Utf8               _objectId
   #18 = Utf8               I
   #19 = Methodref          #8.#20        // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
   #20 = NameAndType        #21:#12       // getEnchantLevel:()I
   #21 = Utf8               getEnchantLevel
   #22 = Fieldref           #14.#23       // ext/mods/gameserver/model/item/instance/ItemInfo._enchant:I
   #23 = NameAndType        #24:#18       // _enchant:I
   #24 = Utf8               _enchant
   #25 = Methodref          #8.#26        // ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
   #26 = NameAndType        #27:#28       // isAugmented:()Z
   #27 = Utf8               isAugmented
   #28 = Utf8               ()Z
   #29 = Methodref          #8.#30        // ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
   #30 = NameAndType        #31:#32       // getAugmentation:()Lext/mods/gameserver/model/Augmentation;
   #31 = Utf8               getAugmentation
   #32 = Utf8               ()Lext/mods/gameserver/model/Augmentation;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/Augmentation.getId:()I
   #34 = Class              #36           // ext/mods/gameserver/model/Augmentation
   #35 = NameAndType        #37:#12       // getId:()I
   #36 = Utf8               ext/mods/gameserver/model/Augmentation
   #37 = Utf8               getId
   #38 = Fieldref           #14.#39       // ext/mods/gameserver/model/item/instance/ItemInfo._augmentation:I
   #39 = NameAndType        #40:#18       // _augmentation:I
   #40 = Utf8               _augmentation
   #41 = Methodref          #8.#42        // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
   #42 = NameAndType        #43:#12       // getCount:()I
   #43 = Utf8               getCount
   #44 = Fieldref           #14.#45       // ext/mods/gameserver/model/item/instance/ItemInfo._count:I
   #45 = NameAndType        #46:#18       // _count:I
   #46 = Utf8               _count
   #47 = Methodref          #8.#48        // ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType1:()I
   #48 = NameAndType        #49:#12       // getCustomType1:()I
   #49 = Utf8               getCustomType1
   #50 = Fieldref           #14.#51       // ext/mods/gameserver/model/item/instance/ItemInfo._type1:I
   #51 = NameAndType        #52:#18       // _type1:I
   #52 = Utf8               _type1
   #53 = Methodref          #8.#54        // ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType2:()I
   #54 = NameAndType        #55:#12       // getCustomType2:()I
   #55 = Utf8               getCustomType2
   #56 = Fieldref           #14.#57       // ext/mods/gameserver/model/item/instance/ItemInfo._type2:I
   #57 = NameAndType        #58:#18       // _type2:I
   #58 = Utf8               _type2
   #59 = Methodref          #8.#60        // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
   #60 = NameAndType        #61:#28       // isEquipped:()Z
   #61 = Utf8               isEquipped
   #62 = Fieldref           #14.#63       // ext/mods/gameserver/model/item/instance/ItemInfo._equipped:I
   #63 = NameAndType        #64:#18       // _equipped:I
   #64 = Utf8               _equipped
   #65 = Methodref          #8.#66        // ext/mods/gameserver/model/item/instance/ItemInstance.getManaLeft:()I
   #66 = NameAndType        #67:#12       // getManaLeft:()I
   #67 = Utf8               getManaLeft
   #68 = Fieldref           #14.#69       // ext/mods/gameserver/model/item/instance/ItemInfo._manaLeft:I
   #69 = NameAndType        #70:#18       // _manaLeft:I
   #70 = Utf8               _manaLeft
   #71 = Methodref          #8.#72        // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #72 = NameAndType        #73:#74       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #73 = Utf8               getItem
   #74 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #75 = Fieldref           #14.#76       // ext/mods/gameserver/model/item/instance/ItemInfo._item:Lext/mods/gameserver/model/item/kind/Item;
   #76 = NameAndType        #77:#78       // _item:Lext/mods/gameserver/model/item/kind/Item;
   #77 = Utf8               _item
   #78 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
   #79 = Fieldref           #14.#80       // ext/mods/gameserver/model/item/instance/ItemInfo._state:Lext/mods/gameserver/enums/items/ItemState;
   #80 = NameAndType        #81:#82       // _state:Lext/mods/gameserver/enums/items/ItemState;
   #81 = Utf8               _state
   #82 = Utf8               Lext/mods/gameserver/enums/items/ItemState;
   #83 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
   #84 = Utf8               Code
   #85 = Utf8               LineNumberTable
   #86 = Utf8               LocalVariableTable
   #87 = Utf8               this
   #88 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInfo;
   #89 = Utf8               item
   #90 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
   #91 = Utf8               state
   #92 = Utf8               StackMapTable
   #93 = Class              #94           // ext/mods/gameserver/enums/items/ItemState
   #94 = Utf8               ext/mods/gameserver/enums/items/ItemState
   #95 = Utf8               getEnchant
   #96 = Utf8               setCount
   #97 = Utf8               (I)V
   #98 = Utf8               count
   #99 = Utf8               getEquipped
  #100 = Utf8               getState
  #101 = Utf8               ()Lext/mods/gameserver/enums/items/ItemState;
  #102 = Utf8               getDisplayedManaLeft
  #103 = Utf8               SourceFile
  #104 = Utf8               ItemInfo.java
{
  public ext.mods.gameserver.model.item.instance.ItemInfo(ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.enums.items.ItemState);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_1
         5: ifnonnull     9
         8: return
         9: aload_0
        10: aload_1
        11: invokevirtual #7                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        14: putfield      #13                 // Field _objectId:I
        17: aload_0
        18: aload_1
        19: invokevirtual #19                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        22: putfield      #22                 // Field _enchant:I
        25: aload_0
        26: aload_1
        27: invokevirtual #25                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
        30: ifeq          43
        33: aload_1
        34: invokevirtual #29                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
        37: invokevirtual #33                 // Method ext/mods/gameserver/model/Augmentation.getId:()I
        40: goto          44
        43: iconst_0
        44: putfield      #38                 // Field _augmentation:I
        47: aload_0
        48: aload_1
        49: invokevirtual #41                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        52: putfield      #44                 // Field _count:I
        55: aload_0
        56: aload_1
        57: invokevirtual #47                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType1:()I
        60: putfield      #50                 // Field _type1:I
        63: aload_0
        64: aload_1
        65: invokevirtual #53                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCustomType2:()I
        68: putfield      #56                 // Field _type2:I
        71: aload_0
        72: aload_1
        73: invokevirtual #59                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
        76: ifeq          83
        79: iconst_1
        80: goto          84
        83: iconst_0
        84: putfield      #62                 // Field _equipped:I
        87: aload_0
        88: aload_1
        89: invokevirtual #65                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getManaLeft:()I
        92: putfield      #68                 // Field _manaLeft:I
        95: aload_0
        96: aload_1
        97: invokevirtual #71                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       100: putfield      #75                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
       103: aload_0
       104: aload_2
       105: putfield      #79                 // Field _state:Lext/mods/gameserver/enums/items/ItemState;
       108: return
      LineNumberTable:
        line 42: 0
        line 43: 4
        line 44: 8
        line 46: 9
        line 47: 17
        line 48: 25
        line 49: 47
        line 50: 55
        line 51: 63
        line 52: 71
        line 53: 87
        line 55: 95
        line 57: 103
        line 58: 108
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     109     0  this   Lext/mods/gameserver/model/item/instance/ItemInfo;
            0     109     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     109     2 state   Lext/mods/gameserver/enums/items/ItemState;
      StackMapTable: number_of_entries = 5
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInfo, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/items/ItemState ]
          stack = []
        frame_type = 97 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInfo ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInfo, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/items/ItemState ]
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInfo, int ]
        frame_type = 102 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInfo ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInfo, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/items/ItemState ]
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInfo, int ]

  public int getObjectId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _objectId:I
         4: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInfo;

  public ext.mods.gameserver.model.item.kind.Item getItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Item;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #75                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInfo;

  public int getEnchant();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _enchant:I
         4: ireturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInfo;

  public int getAugmentation();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _augmentation:I
         4: ireturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInfo;

  public int getCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _count:I
         4: ireturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInfo;

  public void setCount(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #44                 // Field _count:I
         5: return
      LineNumberTable:
        line 87: 0
        line 88: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/item/instance/ItemInfo;
            0       6     1 count   I

  public int getCustomType1();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _type1:I
         4: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInfo;

  public int getCustomType2();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #56                 // Field _type2:I
         4: ireturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInfo;

  public int getEquipped();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #62                 // Field _equipped:I
         4: ireturn
      LineNumberTable:
        line 102: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInfo;

  public ext.mods.gameserver.enums.items.ItemState getState();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemState;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #79                 // Field _state:Lext/mods/gameserver/enums/items/ItemState;
         4: areturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInfo;

  public int getManaLeft();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #68                 // Field _manaLeft:I
         4: ireturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInfo;

  public int getDisplayedManaLeft();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #68                 // Field _manaLeft:I
         4: bipush        60
         6: idiv
         7: ireturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInfo;
}
SourceFile: "ItemInfo.java"
