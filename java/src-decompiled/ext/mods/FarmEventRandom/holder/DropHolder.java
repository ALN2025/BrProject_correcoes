// Bytecode for: ext.mods.FarmEventRandom.holder.DropHolder
// File: ext\mods\FarmEventRandom\holder\DropHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/FarmEventRandom/holder/DropHolder.class
  Last modified 9 de jul de 2026; size 726 bytes
  MD5 checksum 1a67212265895ee0c3f8116036a5325a
  Compiled from "DropHolder.java"
public class ext.mods.FarmEventRandom.holder.DropHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/FarmEventRandom/holder/DropHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/FarmEventRandom/holder/DropHolder._itemId:I
   #8 = Class              #10            // ext/mods/FarmEventRandom/holder/DropHolder
   #9 = NameAndType        #11:#12        // _itemId:I
  #10 = Utf8               ext/mods/FarmEventRandom/holder/DropHolder
  #11 = Utf8               _itemId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/FarmEventRandom/holder/DropHolder._count:I
  #14 = NameAndType        #15:#12        // _count:I
  #15 = Utf8               _count
  #16 = Fieldref           #8.#17         // ext/mods/FarmEventRandom/holder/DropHolder._chance:I
  #17 = NameAndType        #18:#12        // _chance:I
  #18 = Utf8               _chance
  #19 = Utf8               (III)V
  #20 = Utf8               Code
  #21 = Utf8               LineNumberTable
  #22 = Utf8               LocalVariableTable
  #23 = Utf8               this
  #24 = Utf8               Lext/mods/FarmEventRandom/holder/DropHolder;
  #25 = Utf8               itemId
  #26 = Utf8               count
  #27 = Utf8               chance
  #28 = Utf8               getItemId
  #29 = Utf8               ()I
  #30 = Utf8               getCount
  #31 = Utf8               getChance
  #32 = Utf8               SourceFile
  #33 = Utf8               DropHolder.java
{
  public ext.mods.FarmEventRandom.holder.DropHolder(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
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
        16: putfield      #16                 // Field _chance:I
        19: return
      LineNumberTable:
        line 27: 0
        line 28: 4
        line 29: 9
        line 30: 14
        line 31: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/FarmEventRandom/holder/DropHolder;
            0      20     1 itemId   I
            0      20     2 count   I
            0      20     3 chance   I

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _itemId:I
         4: ireturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/DropHolder;

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
            0       5     0  this   Lext/mods/FarmEventRandom/holder/DropHolder;

  public int getChance();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _chance:I
         4: ireturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/DropHolder;
}
SourceFile: "DropHolder.java"
