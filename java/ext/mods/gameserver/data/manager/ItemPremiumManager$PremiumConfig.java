// Bytecode for: ext.mods.gameserver.data.manager.ItemPremiumManager$PremiumConfig
// File: ext\mods\gameserver\data\manager\ItemPremiumManager$PremiumConfig.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig.class
  Last modified 9 de jul de 2026; size 785 bytes
  MD5 checksum 01a0a48572c6ef782ddfaac719a3ca98
  Compiled from "ItemPremiumManager.java"
public final class ext.mods.gameserver.data.manager.ItemPremiumManager$PremiumConfig
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig.minutes:I
   #8 = Class              #10            // ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig
   #9 = NameAndType        #11:#12        // minutes:I
  #10 = Utf8               ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig
  #11 = Utf8               minutes
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig.hours:I
  #14 = NameAndType        #15:#12        // hours:I
  #15 = Utf8               hours
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig.days:I
  #17 = NameAndType        #18:#12        // days:I
  #18 = Utf8               days
  #19 = Long               60000l
  #21 = Long               3600000l
  #23 = Long               86400000l
  #25 = Utf8               (III)V
  #26 = Utf8               Code
  #27 = Utf8               LineNumberTable
  #28 = Utf8               LocalVariableTable
  #29 = Utf8               this
  #30 = Utf8               Lext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig;
  #31 = Utf8               toMilliseconds
  #32 = Utf8               ()J
  #33 = Utf8               SourceFile
  #34 = Utf8               ItemPremiumManager.java
  #35 = Utf8               NestHost
  #36 = Class              #37            // ext/mods/gameserver/data/manager/ItemPremiumManager
  #37 = Utf8               ext/mods/gameserver/data/manager/ItemPremiumManager
  #38 = Utf8               InnerClasses
  #39 = Utf8               PremiumConfig
{
  public final int minutes;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int hours;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int days;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public ext.mods.gameserver.data.manager.ItemPremiumManager$PremiumConfig(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field minutes:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field hours:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field days:I
        19: return
      LineNumberTable:
        line 126: 0
        line 127: 4
        line 128: 9
        line 129: 14
        line 130: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig;
            0      20     1 minutes   I
            0      20     2 hours   I
            0      20     3  days   I

  public long toMilliseconds();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field minutes:I
         4: i2l
         5: ldc2_w        #19                 // long 60000l
         8: lmul
         9: aload_0
        10: getfield      #13                 // Field hours:I
        13: i2l
        14: ldc2_w        #21                 // long 3600000l
        17: lmul
        18: ladd
        19: aload_0
        20: getfield      #16                 // Field days:I
        23: i2l
        24: ldc2_w        #23                 // long 86400000l
        27: lmul
        28: ladd
        29: lreturn
      LineNumberTable:
        line 135: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig;
}
SourceFile: "ItemPremiumManager.java"
NestHost: class ext/mods/gameserver/data/manager/ItemPremiumManager
InnerClasses:
  public static final #39= #8 of #36;     // PremiumConfig=class ext/mods/gameserver/data/manager/ItemPremiumManager$PremiumConfig of class ext/mods/gameserver/data/manager/ItemPremiumManager
