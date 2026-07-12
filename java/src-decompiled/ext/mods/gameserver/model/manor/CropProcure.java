// Bytecode for: ext.mods.gameserver.model.manor.CropProcure
// File: ext\mods\gameserver\model\manor\CropProcure.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/manor/CropProcure.class
  Last modified 9 de jul de 2026; size 594 bytes
  MD5 checksum c8713e023e6c56c7558cddd99f86e0eb
  Compiled from "CropProcure.java"
public final class ext.mods.gameserver.model.manor.CropProcure extends ext.mods.gameserver.model.manor.SeedProduction
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/manor/CropProcure
  super_class: #2                         // ext/mods/gameserver/model/manor/SeedProduction
  interfaces: 0, fields: 1, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/manor/SeedProduction."<init>":(IIII)V
   #2 = Class              #4             // ext/mods/gameserver/model/manor/SeedProduction
   #3 = NameAndType        #5:#6          // "<init>":(IIII)V
   #4 = Utf8               ext/mods/gameserver/model/manor/SeedProduction
   #5 = Utf8               <init>
   #6 = Utf8               (IIII)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/manor/CropProcure._rewardType:I
   #8 = Class              #10            // ext/mods/gameserver/model/manor/CropProcure
   #9 = NameAndType        #11:#12        // _rewardType:I
  #10 = Utf8               ext/mods/gameserver/model/manor/CropProcure
  #11 = Utf8               _rewardType
  #12 = Utf8               I
  #13 = Utf8               (IIIII)V
  #14 = Utf8               Code
  #15 = Utf8               LineNumberTable
  #16 = Utf8               LocalVariableTable
  #17 = Utf8               this
  #18 = Utf8               Lext/mods/gameserver/model/manor/CropProcure;
  #19 = Utf8               id
  #20 = Utf8               amount
  #21 = Utf8               type
  #22 = Utf8               startAmount
  #23 = Utf8               price
  #24 = Utf8               getReward
  #25 = Utf8               ()I
  #26 = Utf8               SourceFile
  #27 = Utf8               CropProcure.java
{
  public ext.mods.gameserver.model.manor.CropProcure(int, int, int, int, int);
    descriptor: (IIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=6
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload         5
         5: iload         4
         7: invokespecial #1                  // Method ext/mods/gameserver/model/manor/SeedProduction."<init>":(IIII)V
        10: aload_0
        11: iload_3
        12: putfield      #7                  // Field _rewardType:I
        15: return
      LineNumberTable:
        line 26: 0
        line 28: 10
        line 29: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/manor/CropProcure;
            0      16     1    id   I
            0      16     2 amount   I
            0      16     3  type   I
            0      16     4 startAmount   I
            0      16     5 price   I

  public final int getReward();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _rewardType:I
         4: ireturn
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/CropProcure;
}
SourceFile: "CropProcure.java"
