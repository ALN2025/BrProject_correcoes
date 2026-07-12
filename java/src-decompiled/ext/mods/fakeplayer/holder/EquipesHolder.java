// Bytecode for: ext.mods.fakeplayer.holder.EquipesHolder
// File: ext\mods\fakeplayer\holder\EquipesHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/holder/EquipesHolder.class
  Last modified 9 de jul de 2026; size 2322 bytes
  MD5 checksum 83c02e84773d03253c2af3a9af50c242
  Compiled from "EquipesHolder.java"
public class ext.mods.fakeplayer.holder.EquipesHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/holder/EquipesHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 15, methods: 16, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/fakeplayer/holder/EquipesHolder._classId:Ljava/lang/String;
   #8 = Class              #10            // ext/mods/fakeplayer/holder/EquipesHolder
   #9 = NameAndType        #11:#12        // _classId:Ljava/lang/String;
  #10 = Utf8               ext/mods/fakeplayer/holder/EquipesHolder
  #11 = Utf8               _classId
  #12 = Utf8               Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/fakeplayer/holder/EquipesHolder._minLevel:I
  #14 = NameAndType        #15:#16        // _minLevel:I
  #15 = Utf8               _minLevel
  #16 = Utf8               I
  #17 = Fieldref           #8.#18         // ext/mods/fakeplayer/holder/EquipesHolder._maxLevel:I
  #18 = NameAndType        #19:#16        // _maxLevel:I
  #19 = Utf8               _maxLevel
  #20 = Fieldref           #8.#21         // ext/mods/fakeplayer/holder/EquipesHolder._rhand:I
  #21 = NameAndType        #22:#16        // _rhand:I
  #22 = Utf8               _rhand
  #23 = Fieldref           #8.#24         // ext/mods/fakeplayer/holder/EquipesHolder._lhand:I
  #24 = NameAndType        #25:#16        // _lhand:I
  #25 = Utf8               _lhand
  #26 = Fieldref           #8.#27         // ext/mods/fakeplayer/holder/EquipesHolder._head:I
  #27 = NameAndType        #28:#16        // _head:I
  #28 = Utf8               _head
  #29 = Fieldref           #8.#30         // ext/mods/fakeplayer/holder/EquipesHolder._chest:I
  #30 = NameAndType        #31:#16        // _chest:I
  #31 = Utf8               _chest
  #32 = Fieldref           #8.#33         // ext/mods/fakeplayer/holder/EquipesHolder._legs:I
  #33 = NameAndType        #34:#16        // _legs:I
  #34 = Utf8               _legs
  #35 = Fieldref           #8.#36         // ext/mods/fakeplayer/holder/EquipesHolder._hands:I
  #36 = NameAndType        #37:#16        // _hands:I
  #37 = Utf8               _hands
  #38 = Fieldref           #8.#39         // ext/mods/fakeplayer/holder/EquipesHolder._feet:I
  #39 = NameAndType        #40:#16        // _feet:I
  #40 = Utf8               _feet
  #41 = Fieldref           #8.#42         // ext/mods/fakeplayer/holder/EquipesHolder._neck:I
  #42 = NameAndType        #43:#16        // _neck:I
  #43 = Utf8               _neck
  #44 = Fieldref           #8.#45         // ext/mods/fakeplayer/holder/EquipesHolder._lear:I
  #45 = NameAndType        #46:#16        // _lear:I
  #46 = Utf8               _lear
  #47 = Fieldref           #8.#48         // ext/mods/fakeplayer/holder/EquipesHolder._rear:I
  #48 = NameAndType        #49:#16        // _rear:I
  #49 = Utf8               _rear
  #50 = Fieldref           #8.#51         // ext/mods/fakeplayer/holder/EquipesHolder._lring:I
  #51 = NameAndType        #52:#16        // _lring:I
  #52 = Utf8               _lring
  #53 = Fieldref           #8.#54         // ext/mods/fakeplayer/holder/EquipesHolder._rring:I
  #54 = NameAndType        #55:#16        // _rring:I
  #55 = Utf8               _rring
  #56 = Utf8               (Ljava/lang/String;IIIIIIIIIIIIII)V
  #57 = Utf8               Code
  #58 = Utf8               LineNumberTable
  #59 = Utf8               LocalVariableTable
  #60 = Utf8               this
  #61 = Utf8               Lext/mods/fakeplayer/holder/EquipesHolder;
  #62 = Utf8               classId
  #63 = Utf8               minLevel
  #64 = Utf8               maxLevel
  #65 = Utf8               rhand
  #66 = Utf8               lhand
  #67 = Utf8               head
  #68 = Utf8               chest
  #69 = Utf8               legs
  #70 = Utf8               hands
  #71 = Utf8               feet
  #72 = Utf8               neck
  #73 = Utf8               lear
  #74 = Utf8               rear
  #75 = Utf8               lring
  #76 = Utf8               rring
  #77 = Utf8               getClassId
  #78 = Utf8               ()Ljava/lang/String;
  #79 = Utf8               getMinLevel
  #80 = Utf8               ()I
  #81 = Utf8               getMaxLevel
  #82 = Utf8               getRhand
  #83 = Utf8               getLhand
  #84 = Utf8               getHead
  #85 = Utf8               getChest
  #86 = Utf8               getLegs
  #87 = Utf8               getHands
  #88 = Utf8               getFeet
  #89 = Utf8               getNeck
  #90 = Utf8               getLear
  #91 = Utf8               getRear
  #92 = Utf8               getLring
  #93 = Utf8               getRring
  #94 = Utf8               SourceFile
  #95 = Utf8               EquipesHolder.java
{
  public ext.mods.fakeplayer.holder.EquipesHolder(java.lang.String, int, int, int, int, int, int, int, int, int, int, int, int, int, int);
    descriptor: (Ljava/lang/String;IIIIIIIIIIIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=16, args_size=16
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _classId:Ljava/lang/String;
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _minLevel:I
        14: aload_0
        15: iload_3
        16: putfield      #17                 // Field _maxLevel:I
        19: aload_0
        20: iload         4
        22: putfield      #20                 // Field _rhand:I
        25: aload_0
        26: iload         5
        28: putfield      #23                 // Field _lhand:I
        31: aload_0
        32: iload         6
        34: putfield      #26                 // Field _head:I
        37: aload_0
        38: iload         7
        40: putfield      #29                 // Field _chest:I
        43: aload_0
        44: iload         8
        46: putfield      #32                 // Field _legs:I
        49: aload_0
        50: iload         9
        52: putfield      #35                 // Field _hands:I
        55: aload_0
        56: iload         10
        58: putfield      #38                 // Field _feet:I
        61: aload_0
        62: iload         11
        64: putfield      #41                 // Field _neck:I
        67: aload_0
        68: iload         12
        70: putfield      #44                 // Field _lear:I
        73: aload_0
        74: iload         13
        76: putfield      #47                 // Field _rear:I
        79: aload_0
        80: iload         14
        82: putfield      #50                 // Field _lring:I
        85: aload_0
        86: iload         15
        88: putfield      #53                 // Field _rring:I
        91: return
      LineNumberTable:
        line 39: 0
        line 40: 4
        line 41: 9
        line 42: 14
        line 43: 19
        line 44: 25
        line 45: 31
        line 46: 37
        line 47: 43
        line 48: 49
        line 49: 55
        line 50: 61
        line 51: 67
        line 52: 73
        line 53: 79
        line 54: 85
        line 55: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      92     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;
            0      92     1 classId   Ljava/lang/String;
            0      92     2 minLevel   I
            0      92     3 maxLevel   I
            0      92     4 rhand   I
            0      92     5 lhand   I
            0      92     6  head   I
            0      92     7 chest   I
            0      92     8  legs   I
            0      92     9 hands   I
            0      92    10  feet   I
            0      92    11  neck   I
            0      92    12  lear   I
            0      92    13  rear   I
            0      92    14 lring   I
            0      92    15 rring   I

  public java.lang.String getClassId();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _classId:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getMinLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _minLevel:I
         4: ireturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getMaxLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _maxLevel:I
         4: ireturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getRhand();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _rhand:I
         4: ireturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getLhand();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _lhand:I
         4: ireturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getHead();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _head:I
         4: ireturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getChest();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _chest:I
         4: ireturn
      LineNumberTable:
        line 89: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getLegs();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _legs:I
         4: ireturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getHands();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _hands:I
         4: ireturn
      LineNumberTable:
        line 99: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getFeet();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _feet:I
         4: ireturn
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getNeck();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _neck:I
         4: ireturn
      LineNumberTable:
        line 109: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getLear();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _lear:I
         4: ireturn
      LineNumberTable:
        line 114: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getRear();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field _rear:I
         4: ireturn
      LineNumberTable:
        line 119: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getLring();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _lring:I
         4: ireturn
      LineNumberTable:
        line 124: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;

  public int getRring();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _rring:I
         4: ireturn
      LineNumberTable:
        line 129: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/EquipesHolder;
}
SourceFile: "EquipesHolder.java"
