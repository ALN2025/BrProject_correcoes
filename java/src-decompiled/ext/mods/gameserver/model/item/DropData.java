// Bytecode for: ext.mods.gameserver.model.item.DropData
// File: ext\mods\gameserver\model\item\DropData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/item/DropData.class
  Last modified 9 de jul de 2026; size 2367 bytes
  MD5 checksum df6a57191d4aee1fd25cfd5e1880488f
  Compiled from "DropData.java"
public class ext.mods.gameserver.model.item.DropData
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/item/DropData
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 9, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/item/DropData._itemId:I
   #8 = Class              #10            // ext/mods/gameserver/model/item/DropData
   #9 = NameAndType        #11:#12        // _itemId:I
  #10 = Utf8               ext/mods/gameserver/model/item/DropData
  #11 = Utf8               _itemId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/item/DropData._minDrop:I
  #14 = NameAndType        #15:#12        // _minDrop:I
  #15 = Utf8               _minDrop
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/item/DropData._maxDrop:I
  #17 = NameAndType        #18:#12        // _maxDrop:I
  #18 = Utf8               _maxDrop
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/item/DropData._chance:D
  #20 = NameAndType        #21:#22        // _chance:D
  #21 = Utf8               _chance
  #22 = Utf8               D
  #23 = InvokeDynamic      #0:#24         // #0:makeConcatWithConstants:(IIID)Ljava/lang/String;
  #24 = NameAndType        #25:#26        // makeConcatWithConstants:(IIID)Ljava/lang/String;
  #25 = Utf8               makeConcatWithConstants
  #26 = Utf8               (IIID)Ljava/lang/String;
  #27 = Fieldref           #8.#28         // ext/mods/gameserver/model/item/DropData._categoryType:Lext/mods/gameserver/enums/DropType;
  #28 = NameAndType        #29:#30        // _categoryType:Lext/mods/gameserver/enums/DropType;
  #29 = Utf8               _categoryType
  #30 = Utf8               Lext/mods/gameserver/enums/DropType;
  #31 = Methodref          #32.#33        // ext/mods/commons/random/Rnd.get:(II)I
  #32 = Class              #34            // ext/mods/commons/random/Rnd
  #33 = NameAndType        #35:#36        // get:(II)I
  #34 = Utf8               ext/mods/commons/random/Rnd
  #35 = Utf8               get
  #36 = Utf8               (II)I
  #37 = Double             100.0d
  #39 = Methodref          #32.#40        // ext/mods/commons/random/Rnd.get:(I)I
  #40 = NameAndType        #35:#41        // get:(I)I
  #41 = Utf8               (I)I
  #42 = Class              #43            // ext/mods/gameserver/model/holder/IntIntHolder
  #43 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #44 = Methodref          #42.#45        // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
  #45 = NameAndType        #5:#46         // "<init>":(II)V
  #46 = Utf8               (II)V
  #47 = Utf8               MAX_CHANCE
  #48 = Utf8               ConstantValue
  #49 = Integer            1000000
  #50 = Utf8               (IIID)V
  #51 = Utf8               Code
  #52 = Utf8               LineNumberTable
  #53 = Utf8               LocalVariableTable
  #54 = Utf8               this
  #55 = Utf8               Lext/mods/gameserver/model/item/DropData;
  #56 = Utf8               itemId
  #57 = Utf8               minDrop
  #58 = Utf8               maxDrop
  #59 = Utf8               chance
  #60 = Utf8               toString
  #61 = Utf8               ()Ljava/lang/String;
  #62 = Utf8               getItemId
  #63 = Utf8               ()I
  #64 = Utf8               getMinDrop
  #65 = Utf8               getMaxDrop
  #66 = Utf8               getChance
  #67 = Utf8               ()D
  #68 = Utf8               setCategoryType
  #69 = Utf8               (Lext/mods/gameserver/enums/DropType;)V
  #70 = Utf8               type
  #71 = Utf8               getCategoryType
  #72 = Utf8               ()Lext/mods/gameserver/enums/DropType;
  #73 = Utf8               calculateDrop
  #74 = Utf8               (D)Lext/mods/gameserver/model/holder/IntIntHolder;
  #75 = Utf8               count
  #76 = Utf8               multiplier
  #77 = Utf8               bonus
  #78 = Utf8               ratio
  #79 = Utf8               StackMapTable
  #80 = Utf8               SourceFile
  #81 = Utf8               DropData.java
  #82 = Utf8               BootstrapMethods
  #83 = String             #84            // DropData =[ItemID: \u0001 Min: \u0001 Max: \u0001 Chance: \u0001%]
  #84 = Utf8               DropData =[ItemID: \u0001 Min: \u0001 Max: \u0001 Chance: \u0001%]
  #85 = MethodHandle       6:#86          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #86 = Methodref          #87.#88        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #87 = Class              #89            // java/lang/invoke/StringConcatFactory
  #88 = NameAndType        #25:#90        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #89 = Utf8               java/lang/invoke/StringConcatFactory
  #90 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #91 = Utf8               InnerClasses
  #92 = Class              #93            // java/lang/invoke/MethodHandles$Lookup
  #93 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #94 = Class              #95            // java/lang/invoke/MethodHandles
  #95 = Utf8               java/lang/invoke/MethodHandles
  #96 = Utf8               Lookup
{
  public static final int MAX_CHANCE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1000000

  public ext.mods.gameserver.model.item.DropData(int, int, int, double);
    descriptor: (IIID)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _itemId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _minDrop:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field _maxDrop:I
        19: aload_0
        20: dload         4
        22: putfield      #19                 // Field _chance:D
        25: return
      LineNumberTable:
        line 40: 0
        line 41: 4
        line 42: 9
        line 43: 14
        line 44: 19
        line 45: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/item/DropData;
            0      26     1 itemId   I
            0      26     2 minDrop   I
            0      26     3 maxDrop   I
            0      26     4 chance   D

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _itemId:I
         4: aload_0
         5: getfield      #13                 // Field _minDrop:I
         8: aload_0
         9: getfield      #16                 // Field _maxDrop:I
        12: aload_0
        13: getfield      #19                 // Field _chance:D
        16: invokedynamic #23,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIID)Ljava/lang/String;
        21: areturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/item/DropData;

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _itemId:I
         4: ireturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/DropData;

  public int getMinDrop();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _minDrop:I
         4: ireturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/DropData;

  public int getMaxDrop();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _maxDrop:I
         4: ireturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/DropData;

  public double getChance();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _chance:D
         4: dreturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/DropData;

  public void setCategoryType(ext.mods.gameserver.enums.DropType);
    descriptor: (Lext/mods/gameserver/enums/DropType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #27                 // Field _categoryType:Lext/mods/gameserver/enums/DropType;
         5: return
      LineNumberTable:
        line 76: 0
        line 77: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/item/DropData;
            0       6     1  type   Lext/mods/gameserver/enums/DropType;

  public ext.mods.gameserver.enums.DropType getCategoryType();
    descriptor: ()Lext/mods/gameserver/enums/DropType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _categoryType:Lext/mods/gameserver/enums/DropType;
         4: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/DropData;

  public ext.mods.gameserver.model.holder.IntIntHolder calculateDrop(double);
    descriptor: (D)Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=2
         0: dload_1
         1: dconst_1
         2: dcmpg
         3: ifgt          21
         6: aload_0
         7: getfield      #13                 // Field _minDrop:I
        10: aload_0
        11: getfield      #16                 // Field _maxDrop:I
        14: invokestatic  #31                 // Method ext/mods/commons/random/Rnd.get:(II)I
        17: istore_3
        18: goto          85
        21: dload_1
        22: ldc2_w        #37                 // double 100.0d
        25: dmul
        26: dstore_1
        27: dload_1
        28: ldc2_w        #37                 // double 100.0d
        31: ddiv
        32: d2i
        33: istore        4
        35: dload_1
        36: ldc2_w        #37                 // double 100.0d
        39: drem
        40: d2i
        41: istore        5
        43: aload_0
        44: getfield      #13                 // Field _minDrop:I
        47: iload         4
        49: imul
        50: aload_0
        51: getfield      #16                 // Field _maxDrop:I
        54: iload         4
        56: imul
        57: invokestatic  #31                 // Method ext/mods/commons/random/Rnd.get:(II)I
        60: istore_3
        61: bipush        100
        63: invokestatic  #39                 // Method ext/mods/commons/random/Rnd.get:(I)I
        66: iload         5
        68: if_icmpge     85
        71: iload_3
        72: aload_0
        73: getfield      #13                 // Field _minDrop:I
        76: aload_0
        77: getfield      #16                 // Field _maxDrop:I
        80: invokestatic  #31                 // Method ext/mods/commons/random/Rnd.get:(II)I
        83: iadd
        84: istore_3
        85: new           #42                 // class ext/mods/gameserver/model/holder/IntIntHolder
        88: dup
        89: aload_0
        90: getfield      #7                  // Field _itemId:I
        93: iload_3
        94: invokespecial #44                 // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        97: areturn
      LineNumberTable:
        line 88: 0
        line 90: 6
        line 94: 21
        line 95: 27
        line 96: 35
        line 98: 43
        line 99: 61
        line 100: 71
        line 103: 85
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       3     3 count   I
           35      50     4 multiplier   I
           43      42     5 bonus   I
            0      98     0  this   Lext/mods/gameserver/model/item/DropData;
            0      98     1 ratio   D
           61      37     3 count   I
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 63
          locals = [ int ]
}
SourceFile: "DropData.java"
BootstrapMethods:
  0: #85 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #83 DropData =[ItemID: \u0001 Min: \u0001 Max: \u0001 Chance: \u0001%]
InnerClasses:
  public static final #96= #92 of #94;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
