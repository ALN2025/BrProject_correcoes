// Bytecode for: ext.mods.gameserver.model.pledge.ItemInfo
// File: ext\mods\gameserver\model\pledge\ItemInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/pledge/ItemInfo.class
  Last modified 9 de jul de 2026; size 595 bytes
  MD5 checksum cb0ce3edb2107d8e5933c2c1ec2881b4
  Compiled from "ItemInfo.java"
public class ext.mods.gameserver.model.pledge.ItemInfo
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/pledge/ItemInfo
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/pledge/ItemInfo._count:I
   #8 = Class              #10            // ext/mods/gameserver/model/pledge/ItemInfo
   #9 = NameAndType        #11:#12        // _count:I
  #10 = Utf8               ext/mods/gameserver/model/pledge/ItemInfo
  #11 = Utf8               _count
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/pledge/ItemInfo._enchant:I
  #14 = NameAndType        #15:#12        // _enchant:I
  #15 = Utf8               _enchant
  #16 = Utf8               (II)V
  #17 = Utf8               Code
  #18 = Utf8               LineNumberTable
  #19 = Utf8               LocalVariableTable
  #20 = Utf8               this
  #21 = Utf8               Lext/mods/gameserver/model/pledge/ItemInfo;
  #22 = Utf8               count
  #23 = Utf8               enchant
  #24 = Utf8               getCount
  #25 = Utf8               ()I
  #26 = Utf8               getEnchant
  #27 = Utf8               SourceFile
  #28 = Utf8               ItemInfo.java
{
  public final int _count;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int _enchant;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public ext.mods.gameserver.model.pledge.ItemInfo(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _count:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _enchant:I
        14: return
      LineNumberTable:
        line 26: 0
        line 27: 4
        line 28: 9
        line 29: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/pledge/ItemInfo;
            0      15     1 count   I
            0      15     2 enchant   I

  public int getCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _count:I
         4: ireturn
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/ItemInfo;

  public int getEnchant();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _enchant:I
         4: ireturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/ItemInfo;
}
SourceFile: "ItemInfo.java"
