// Bytecode for: ext.mods.gameserver.model.item.LifeStone
// File: ext\mods\gameserver\model\item\LifeStone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/item/LifeStone.class
  Last modified 9 de jul de 2026; size 813 bytes
  MD5 checksum b6ff1645606396a3f6fc96293d8974cc
  Compiled from "LifeStone.java"
public class ext.mods.gameserver.model.item.LifeStone
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/item/LifeStone
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/item/LifeStone._grade:I
   #8 = Class              #10            // ext/mods/gameserver/model/item/LifeStone
   #9 = NameAndType        #11:#12        // _grade:I
  #10 = Utf8               ext/mods/gameserver/model/item/LifeStone
  #11 = Utf8               _grade
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/item/LifeStone._level:I
  #14 = NameAndType        #15:#12        // _level:I
  #15 = Utf8               _level
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/item/LifeStone.LEVELS:[I
  #17 = NameAndType        #18:#19        // LEVELS:[I
  #18 = Utf8               LEVELS
  #19 = Utf8               [I
  #20 = Utf8               (II)V
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               LocalVariableTable
  #24 = Utf8               this
  #25 = Utf8               Lext/mods/gameserver/model/item/LifeStone;
  #26 = Utf8               grade
  #27 = Utf8               level
  #28 = Utf8               getLevel
  #29 = Utf8               ()I
  #30 = Utf8               getGrade
  #31 = Utf8               getPlayerLevel
  #32 = Utf8               <clinit>
  #33 = Utf8               SourceFile
  #34 = Utf8               LifeStone.java
{
  public ext.mods.gameserver.model.item.LifeStone(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _grade:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _level:I
        14: return
      LineNumberTable:
        line 40: 0
        line 41: 4
        line 42: 9
        line 43: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/item/LifeStone;
            0      15     1 grade   I
            0      15     2 level   I

  public final int getLevel();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _level:I
         4: ireturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/LifeStone;

  public final int getGrade();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _grade:I
         4: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/LifeStone;

  public final int getPlayerLevel();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #16                 // Field LEVELS:[I
         3: aload_0
         4: getfield      #13                 // Field _level:I
         7: iaload
         8: ireturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/item/LifeStone;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        10
         2: newarray       int
         4: dup
         5: iconst_0
         6: bipush        46
         8: iastore
         9: dup
        10: iconst_1
        11: bipush        49
        13: iastore
        14: dup
        15: iconst_2
        16: bipush        52
        18: iastore
        19: dup
        20: iconst_3
        21: bipush        55
        23: iastore
        24: dup
        25: iconst_4
        26: bipush        58
        28: iastore
        29: dup
        30: iconst_5
        31: bipush        61
        33: iastore
        34: dup
        35: bipush        6
        37: bipush        64
        39: iastore
        40: dup
        41: bipush        7
        43: bipush        67
        45: iastore
        46: dup
        47: bipush        8
        49: bipush        70
        51: iastore
        52: dup
        53: bipush        9
        55: bipush        76
        57: iastore
        58: putstatic     #16                 // Field LEVELS:[I
        61: return
      LineNumberTable:
        line 22: 0
}
SourceFile: "LifeStone.java"
