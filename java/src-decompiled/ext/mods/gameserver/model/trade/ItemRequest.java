// Bytecode for: ext.mods.gameserver.model.trade.ItemRequest
// File: ext\mods\gameserver\model\trade\ItemRequest.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/trade/ItemRequest.class
  Last modified 9 de jul de 2026; size 2100 bytes
  MD5 checksum 3a4ec54cccf72e2495aced29aa57c6ce
  Compiled from "ItemRequest.java"
public class ext.mods.gameserver.model.trade.ItemRequest
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/trade/ItemRequest
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 12, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/trade/ItemRequest._objectId:I
   #8 = Class              #10            // ext/mods/gameserver/model/trade/ItemRequest
   #9 = NameAndType        #11:#12        // _objectId:I
  #10 = Utf8               ext/mods/gameserver/model/trade/ItemRequest
  #11 = Utf8               _objectId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/trade/ItemRequest._count:I
  #14 = NameAndType        #15:#12        // _count:I
  #15 = Utf8               _count
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/trade/ItemRequest._price:I
  #17 = NameAndType        #18:#12        // _price:I
  #18 = Utf8               _price
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/trade/ItemRequest._itemId:I
  #20 = NameAndType        #21:#12        // _itemId:I
  #21 = Utf8               _itemId
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/model/trade/ItemRequest._enchant:I
  #23 = NameAndType        #24:#12        // _enchant:I
  #24 = Utf8               _enchant
  #25 = InvokeDynamic      #0:#26         // #0:makeConcatWithConstants:(IIIII)Ljava/lang/String;
  #26 = NameAndType        #27:#28        // makeConcatWithConstants:(IIIII)Ljava/lang/String;
  #27 = Utf8               makeConcatWithConstants
  #28 = Utf8               (IIIII)Ljava/lang/String;
  #29 = Utf8               (III)V
  #30 = Utf8               Code
  #31 = Utf8               LineNumberTable
  #32 = Utf8               LocalVariableTable
  #33 = Utf8               this
  #34 = Utf8               Lext/mods/gameserver/model/trade/ItemRequest;
  #35 = Utf8               objectId
  #36 = Utf8               count
  #37 = Utf8               price
  #38 = Utf8               (IIIII)V
  #39 = Utf8               itemId
  #40 = Utf8               enchant
  #41 = Utf8               toString
  #42 = Utf8               ()Ljava/lang/String;
  #43 = Utf8               getObjectId
  #44 = Utf8               ()I
  #45 = Utf8               setObjectId
  #46 = Utf8               (I)V
  #47 = Utf8               getItemId
  #48 = Utf8               getCount
  #49 = Utf8               setCount
  #50 = Utf8               getPrice
  #51 = Utf8               setPrice
  #52 = Utf8               getEnchant
  #53 = Utf8               setEnchant
  #54 = Utf8               SourceFile
  #55 = Utf8               ItemRequest.java
  #56 = Utf8               BootstrapMethods
  #57 = String             #58            // ItemRequest [objectId=\u0001, itemId=\u0001, count=\u0001, price=\u0001, enchant=\u0001]
  #58 = Utf8               ItemRequest [objectId=\u0001, itemId=\u0001, count=\u0001, price=\u0001, enchant=\u0001]
  #59 = MethodHandle       6:#60          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #60 = Methodref          #61.#62        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #61 = Class              #63            // java/lang/invoke/StringConcatFactory
  #62 = NameAndType        #27:#64        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #63 = Utf8               java/lang/invoke/StringConcatFactory
  #64 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #65 = Utf8               InnerClasses
  #66 = Class              #67            // java/lang/invoke/MethodHandles$Lookup
  #67 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #68 = Class              #69            // java/lang/invoke/MethodHandles
  #69 = Utf8               java/lang/invoke/MethodHandles
  #70 = Utf8               Lookup
{
  protected int _objectId;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _itemId;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _count;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _price;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _enchant;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.trade.ItemRequest(int, int, int);
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
        line 29: 0
        line 30: 4
        line 31: 9
        line 32: 14
        line 33: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/trade/ItemRequest;
            0      20     1 objectId   I
            0      20     2 count   I
            0      20     3 price   I

  public ext.mods.gameserver.model.trade.ItemRequest(int, int, int, int, int);
    descriptor: (IIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _objectId:I
         9: aload_0
        10: iload_2
        11: putfield      #19                 // Field _itemId:I
        14: aload_0
        15: iload_3
        16: putfield      #13                 // Field _count:I
        19: aload_0
        20: iload         4
        22: putfield      #16                 // Field _price:I
        25: aload_0
        26: iload         5
        28: putfield      #22                 // Field _enchant:I
        31: return
      LineNumberTable:
        line 36: 0
        line 37: 4
        line 38: 9
        line 39: 14
        line 40: 19
        line 41: 25
        line 42: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/trade/ItemRequest;
            0      32     1 objectId   I
            0      32     2 itemId   I
            0      32     3 count   I
            0      32     4 price   I
            0      32     5 enchant   I

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _objectId:I
         4: aload_0
         5: getfield      #19                 // Field _itemId:I
         8: aload_0
         9: getfield      #13                 // Field _count:I
        12: aload_0
        13: getfield      #16                 // Field _price:I
        16: aload_0
        17: getfield      #22                 // Field _enchant:I
        20: invokedynamic #25,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIIII)Ljava/lang/String;
        25: areturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/trade/ItemRequest;

  public int getObjectId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _objectId:I
         4: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/ItemRequest;

  public void setObjectId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _objectId:I
         5: return
      LineNumberTable:
        line 57: 0
        line 58: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/trade/ItemRequest;
            0       6     1 objectId   I

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _itemId:I
         4: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/ItemRequest;

  public int getCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _count:I
         4: ireturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/ItemRequest;

  public void setCount(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _count:I
         5: return
      LineNumberTable:
        line 72: 0
        line 73: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/trade/ItemRequest;
            0       6     1 count   I

  public int getPrice();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _price:I
         4: ireturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/ItemRequest;

  public void setPrice(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #16                 // Field _price:I
         5: return
      LineNumberTable:
        line 82: 0
        line 83: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/trade/ItemRequest;
            0       6     1 price   I

  public int getEnchant();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _enchant:I
         4: ireturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/trade/ItemRequest;

  public void setEnchant(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #22                 // Field _enchant:I
         5: return
      LineNumberTable:
        line 92: 0
        line 93: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/trade/ItemRequest;
            0       6     1 enchant   I
}
SourceFile: "ItemRequest.java"
BootstrapMethods:
  0: #59 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #57 ItemRequest [objectId=\u0001, itemId=\u0001, count=\u0001, price=\u0001, enchant=\u0001]
InnerClasses:
  public static final #70= #66 of #68;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
