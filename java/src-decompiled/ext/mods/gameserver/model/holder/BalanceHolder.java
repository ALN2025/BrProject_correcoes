// Bytecode for: ext.mods.gameserver.model.holder.BalanceHolder
// File: ext\mods\gameserver\model\holder\BalanceHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/holder/BalanceHolder.class
  Last modified 9 de jul de 2026; size 570 bytes
  MD5 checksum e3cf33575e7e144a36c02fac48fd87f3
  Compiled from "BalanceHolder.java"
public class ext.mods.gameserver.model.holder.BalanceHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/holder/BalanceHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 1, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/holder/BalanceHolder._pAtkMod:D
   #8 = Class              #10            // ext/mods/gameserver/model/holder/BalanceHolder
   #9 = NameAndType        #11:#12        // _pAtkMod:D
  #10 = Utf8               ext/mods/gameserver/model/holder/BalanceHolder
  #11 = Utf8               _pAtkMod
  #12 = Utf8               D
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/holder/BalanceHolder._mAtkMod:D
  #14 = NameAndType        #15:#12        // _mAtkMod:D
  #15 = Utf8               _mAtkMod
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/holder/BalanceHolder._pDefMod:D
  #17 = NameAndType        #18:#12        // _pDefMod:D
  #18 = Utf8               _pDefMod
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/holder/BalanceHolder._mDefMod:D
  #20 = NameAndType        #21:#12        // _mDefMod:D
  #21 = Utf8               _mDefMod
  #22 = Utf8               (DDDD)V
  #23 = Utf8               Code
  #24 = Utf8               LineNumberTable
  #25 = Utf8               LocalVariableTable
  #26 = Utf8               this
  #27 = Utf8               Lext/mods/gameserver/model/holder/BalanceHolder;
  #28 = Utf8               pAtk
  #29 = Utf8               mAtk
  #30 = Utf8               pDef
  #31 = Utf8               mDef
  #32 = Utf8               SourceFile
  #33 = Utf8               BalanceHolder.java
{
  public double _pAtkMod;
    descriptor: D
    flags: (0x0001) ACC_PUBLIC

  public double _mAtkMod;
    descriptor: D
    flags: (0x0001) ACC_PUBLIC

  public double _pDefMod;
    descriptor: D
    flags: (0x0001) ACC_PUBLIC

  public double _mDefMod;
    descriptor: D
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.holder.BalanceHolder(double, double, double, double);
    descriptor: (DDDD)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=9, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: dload_1
         6: putfield      #7                  // Field _pAtkMod:D
         9: aload_0
        10: dload_3
        11: putfield      #13                 // Field _mAtkMod:D
        14: aload_0
        15: dload         5
        17: putfield      #16                 // Field _pDefMod:D
        20: aload_0
        21: dload         7
        23: putfield      #19                 // Field _mDefMod:D
        26: return
      LineNumberTable:
        line 28: 0
        line 29: 4
        line 30: 9
        line 31: 14
        line 32: 20
        line 33: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/holder/BalanceHolder;
            0      27     1  pAtk   D
            0      27     3  mAtk   D
            0      27     5  pDef   D
            0      27     7  mDef   D
}
SourceFile: "BalanceHolder.java"
