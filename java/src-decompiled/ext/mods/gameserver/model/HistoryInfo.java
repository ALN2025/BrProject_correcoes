// Bytecode for: ext.mods.gameserver.model.HistoryInfo
// File: ext\mods\gameserver\model\HistoryInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/HistoryInfo.class
  Last modified 9 de jul de 2026; size 1139 bytes
  MD5 checksum b5b9ab6cd67603e7684c85f224cc3e01
  Compiled from "HistoryInfo.java"
public class ext.mods.gameserver.model.HistoryInfo
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/HistoryInfo
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 8, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/HistoryInfo._raceId:I
   #8 = Class              #10            // ext/mods/gameserver/model/HistoryInfo
   #9 = NameAndType        #11:#12        // _raceId:I
  #10 = Utf8               ext/mods/gameserver/model/HistoryInfo
  #11 = Utf8               _raceId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/HistoryInfo._first:I
  #14 = NameAndType        #15:#12        // _first:I
  #15 = Utf8               _first
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/HistoryInfo._second:I
  #17 = NameAndType        #18:#12        // _second:I
  #18 = Utf8               _second
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/HistoryInfo._oddRate:D
  #20 = NameAndType        #21:#22        // _oddRate:D
  #21 = Utf8               _oddRate
  #22 = Utf8               D
  #23 = Utf8               (IIID)V
  #24 = Utf8               Code
  #25 = Utf8               LineNumberTable
  #26 = Utf8               LocalVariableTable
  #27 = Utf8               this
  #28 = Utf8               Lext/mods/gameserver/model/HistoryInfo;
  #29 = Utf8               raceId
  #30 = Utf8               first
  #31 = Utf8               second
  #32 = Utf8               oddRate
  #33 = Utf8               getRaceId
  #34 = Utf8               ()I
  #35 = Utf8               getFirst
  #36 = Utf8               getSecond
  #37 = Utf8               getOddRate
  #38 = Utf8               ()D
  #39 = Utf8               setFirst
  #40 = Utf8               (I)V
  #41 = Utf8               setSecond
  #42 = Utf8               setOddRate
  #43 = Utf8               (D)V
  #44 = Utf8               SourceFile
  #45 = Utf8               HistoryInfo.java
{
  public ext.mods.gameserver.model.HistoryInfo(int, int, int, double);
    descriptor: (IIID)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _raceId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _first:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field _second:I
        19: aload_0
        20: dload         4
        22: putfield      #19                 // Field _oddRate:D
        25: return
      LineNumberTable:
        line 28: 0
        line 29: 4
        line 30: 9
        line 31: 14
        line 32: 19
        line 33: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/HistoryInfo;
            0      26     1 raceId   I
            0      26     2 first   I
            0      26     3 second   I
            0      26     4 oddRate   D

  public int getRaceId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _raceId:I
         4: ireturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/HistoryInfo;

  public int getFirst();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _first:I
         4: ireturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/HistoryInfo;

  public int getSecond();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _second:I
         4: ireturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/HistoryInfo;

  public double getOddRate();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _oddRate:D
         4: dreturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/HistoryInfo;

  public void setFirst(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _first:I
         5: return
      LineNumberTable:
        line 57: 0
        line 58: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/HistoryInfo;
            0       6     1 first   I

  public void setSecond(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #16                 // Field _second:I
         5: return
      LineNumberTable:
        line 62: 0
        line 63: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/HistoryInfo;
            0       6     1 second   I

  public void setOddRate(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: dload_1
         2: putfield      #19                 // Field _oddRate:D
         5: return
      LineNumberTable:
        line 67: 0
        line 68: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/HistoryInfo;
            0       6     1 oddRate   D
}
SourceFile: "HistoryInfo.java"
