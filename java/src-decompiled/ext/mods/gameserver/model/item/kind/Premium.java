// Bytecode for: ext.mods.gameserver.model.item.kind.Premium
// File: ext\mods\gameserver\model\item\kind\Premium.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/item/kind/Premium.class
  Last modified 9 de jul de 2026; size 1401 bytes
  MD5 checksum 23045abf56caeb2b288f7309619dd3e2
  Compiled from "Premium.java"
public class ext.mods.gameserver.model.item.kind.Premium
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/item/kind/Premium
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 13, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/item/kind/Premium._charId:I
   #8 = Class              #10            // ext/mods/gameserver/model/item/kind/Premium
   #9 = NameAndType        #11:#12        // _charId:I
  #10 = Utf8               ext/mods/gameserver/model/item/kind/Premium
  #11 = Utf8               _charId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/item/kind/Premium._itemId:I
  #14 = NameAndType        #15:#12        // _itemId:I
  #15 = Utf8               _itemId
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/item/kind/Premium._activationTime:J
  #17 = NameAndType        #18:#19        // _activationTime:J
  #18 = Utf8               _activationTime
  #19 = Utf8               J
  #20 = Utf8               MODIFIER_XP
  #21 = Utf8               ConstantValue
  #22 = Integer            0
  #23 = Utf8               MODIFIER_SP
  #24 = Integer            1
  #25 = Utf8               MODIFIER_PARTY_XP
  #26 = Integer            2
  #27 = Utf8               MODIFIER_PARTY_SP
  #28 = Integer            3
  #29 = Utf8               MODIFIER_DROP_ADENA
  #30 = Integer            4
  #31 = Utf8               MODIFIER_DROP_ITEMS
  #32 = Integer            5
  #33 = Utf8               MODIFIER_SPOIL
  #34 = Integer            6
  #35 = Utf8               MODIFIER_QUEST
  #36 = Integer            7
  #37 = Utf8               MODIFIER_QUEST_ADENA
  #38 = Integer            8
  #39 = Utf8               MODIFIER_DROP_SEAL_STONES
  #40 = Integer            9
  #41 = Utf8               Code
  #42 = Utf8               LineNumberTable
  #43 = Utf8               LocalVariableTable
  #44 = Utf8               this
  #45 = Utf8               Lext/mods/gameserver/model/item/kind/Premium;
  #46 = Utf8               getCharId
  #47 = Utf8               ()I
  #48 = Utf8               setCharId
  #49 = Utf8               (I)V
  #50 = Utf8               charId
  #51 = Utf8               getItemId
  #52 = Utf8               setItemId
  #53 = Utf8               itemId
  #54 = Utf8               getActivationTime
  #55 = Utf8               ()J
  #56 = Utf8               setActivationTime
  #57 = Utf8               (J)V
  #58 = Utf8               activationTime
  #59 = Utf8               SourceFile
  #60 = Utf8               Premium.java
{
  public static final int MODIFIER_XP;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final int MODIFIER_SP;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int MODIFIER_PARTY_XP;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final int MODIFIER_PARTY_SP;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 3

  public static final int MODIFIER_DROP_ADENA;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  public static final int MODIFIER_DROP_ITEMS;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 5

  public static final int MODIFIER_SPOIL;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 6

  public static final int MODIFIER_QUEST;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 7

  public static final int MODIFIER_QUEST_ADENA;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 8

  public static final int MODIFIER_DROP_SEAL_STONES;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 9

  public ext.mods.gameserver.model.item.kind.Premium();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Premium;

  public int getCharId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _charId:I
         4: ireturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Premium;

  public void setCharId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _charId:I
         5: return
      LineNumberTable:
        line 44: 0
        line 45: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/item/kind/Premium;
            0       6     1 charId   I

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _itemId:I
         4: ireturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Premium;

  public void setItemId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _itemId:I
         5: return
      LineNumberTable:
        line 54: 0
        line 55: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/item/kind/Premium;
            0       6     1 itemId   I

  public long getActivationTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _activationTime:J
         4: lreturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Premium;

  public void setActivationTime(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #16                 // Field _activationTime:J
         5: return
      LineNumberTable:
        line 64: 0
        line 65: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/item/kind/Premium;
            0       6     1 activationTime   J
}
SourceFile: "Premium.java"
