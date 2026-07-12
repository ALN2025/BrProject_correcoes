// Bytecode for: ext.mods.CapsuleBox.CapsuleBoxItem$Item
// File: ext\mods\CapsuleBox\CapsuleBoxItem$Item.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/CapsuleBox/CapsuleBoxItem$Item.class
  Last modified 9 de jul de 2026; size 927 bytes
  MD5 checksum 3f22ce1f1af4bbaa427f2d78741432aa
  Compiled from "CapsuleBoxItem.java"
public class ext.mods.CapsuleBox.CapsuleBoxItem$Item
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/CapsuleBox/CapsuleBoxItem$Item
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 5, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/CapsuleBox/CapsuleBoxItem$Item.itemId:I
   #8 = Class              #10            // ext/mods/CapsuleBox/CapsuleBoxItem$Item
   #9 = NameAndType        #11:#12        // itemId:I
  #10 = Utf8               ext/mods/CapsuleBox/CapsuleBoxItem$Item
  #11 = Utf8               itemId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/CapsuleBox/CapsuleBoxItem$Item.amount:I
  #14 = NameAndType        #15:#12        // amount:I
  #15 = Utf8               amount
  #16 = Fieldref           #8.#17         // ext/mods/CapsuleBox/CapsuleBoxItem$Item.enchantLevel:I
  #17 = NameAndType        #18:#12        // enchantLevel:I
  #18 = Utf8               enchantLevel
  #19 = Fieldref           #8.#20         // ext/mods/CapsuleBox/CapsuleBoxItem$Item.chance:I
  #20 = NameAndType        #21:#12        // chance:I
  #21 = Utf8               chance
  #22 = Utf8               (IIII)V
  #23 = Utf8               Code
  #24 = Utf8               LineNumberTable
  #25 = Utf8               LocalVariableTable
  #26 = Utf8               this
  #27 = Utf8               Lext/mods/CapsuleBox/CapsuleBoxItem$Item;
  #28 = Utf8               getItemId
  #29 = Utf8               ()I
  #30 = Utf8               getAmount
  #31 = Utf8               getEnchantLevel
  #32 = Utf8               getChance
  #33 = Utf8               SourceFile
  #34 = Utf8               CapsuleBoxItem.java
  #35 = Utf8               NestHost
  #36 = Class              #37            // ext/mods/CapsuleBox/CapsuleBoxItem
  #37 = Utf8               ext/mods/CapsuleBox/CapsuleBoxItem
  #38 = Utf8               InnerClasses
  #39 = Utf8               Item
{
  public ext.mods.CapsuleBox.CapsuleBoxItem$Item(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field itemId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field amount:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field enchantLevel:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field chance:I
        25: return
      LineNumberTable:
        line 60: 0
        line 61: 4
        line 62: 9
        line 63: 14
        line 64: 19
        line 65: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/CapsuleBox/CapsuleBoxItem$Item;
            0      26     1 itemId   I
            0      26     2 amount   I
            0      26     3 enchantLevel   I
            0      26     4 chance   I

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field itemId:I
         4: ireturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/CapsuleBox/CapsuleBoxItem$Item;

  public int getAmount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field amount:I
         4: ireturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/CapsuleBox/CapsuleBoxItem$Item;

  public int getEnchantLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field enchantLevel:I
         4: ireturn
      LineNumberTable:
        line 76: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/CapsuleBox/CapsuleBoxItem$Item;

  public int getChance();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field chance:I
         4: ireturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/CapsuleBox/CapsuleBoxItem$Item;
}
SourceFile: "CapsuleBoxItem.java"
NestHost: class ext/mods/CapsuleBox/CapsuleBoxItem
InnerClasses:
  public static #39= #8 of #36;           // Item=class ext/mods/CapsuleBox/CapsuleBoxItem$Item of class ext/mods/CapsuleBox/CapsuleBoxItem
