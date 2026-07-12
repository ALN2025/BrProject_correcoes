// Bytecode for: ext.mods.commons.gui.damage$RowData
// File: ext\mods\commons\gui\damage$RowData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/damage$RowData.class
  Last modified 9 de jul de 2026; size 674 bytes
  MD5 checksum d51b0d1acef99494aba9994024544f89
  Compiled from "damage.java"
class ext.mods.commons.gui.damage$RowData
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/damage$RowData
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/damage$RowData._classAtk:I
   #8 = Class              #10            // ext/mods/commons/gui/damage$RowData
   #9 = NameAndType        #11:#12        // _classAtk:I
  #10 = Utf8               ext/mods/commons/gui/damage$RowData
  #11 = Utf8               _classAtk
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/commons/gui/damage$RowData._classTgt:I
  #14 = NameAndType        #15:#12        // _classTgt:I
  #15 = Utf8               _classTgt
  #16 = Fieldref           #8.#17         // ext/mods/commons/gui/damage$RowData._modifier:Lext/mods/gameserver/model/holder/BalanceHolder;
  #17 = NameAndType        #18:#19        // _modifier:Lext/mods/gameserver/model/holder/BalanceHolder;
  #18 = Utf8               _modifier
  #19 = Utf8               Lext/mods/gameserver/model/holder/BalanceHolder;
  #20 = Utf8               (IILext/mods/gameserver/model/holder/BalanceHolder;)V
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               LocalVariableTable
  #24 = Utf8               this
  #25 = Utf8               Lext/mods/commons/gui/damage$RowData;
  #26 = Utf8               atk
  #27 = Utf8               tgt
  #28 = Utf8               mod
  #29 = Utf8               SourceFile
  #30 = Utf8               damage.java
  #31 = Utf8               NestHost
  #32 = Class              #33            // ext/mods/commons/gui/damage
  #33 = Utf8               ext/mods/commons/gui/damage
  #34 = Utf8               InnerClasses
  #35 = Utf8               RowData
{
  int _classAtk;
    descriptor: I
    flags: (0x0000)

  int _classTgt;
    descriptor: I
    flags: (0x0000)

  ext.mods.gameserver.model.holder.BalanceHolder _modifier;
    descriptor: Lext/mods/gameserver/model/holder/BalanceHolder;
    flags: (0x0000)

  ext.mods.commons.gui.damage$RowData(int, int, ext.mods.gameserver.model.holder.BalanceHolder);
    descriptor: (IILext/mods/gameserver/model/holder/BalanceHolder;)V
    flags: (0x0000)
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _classAtk:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _classTgt:I
        14: aload_0
        15: aload_3
        16: putfield      #16                 // Field _modifier:Lext/mods/gameserver/model/holder/BalanceHolder;
        19: return
      LineNumberTable:
        line 46: 0
        line 47: 4
        line 48: 9
        line 49: 14
        line 50: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/commons/gui/damage$RowData;
            0      20     1   atk   I
            0      20     2   tgt   I
            0      20     3   mod   Lext/mods/gameserver/model/holder/BalanceHolder;
}
SourceFile: "damage.java"
NestHost: class ext/mods/commons/gui/damage
