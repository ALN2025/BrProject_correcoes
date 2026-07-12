// Bytecode for: ext.mods.battlerboss.holder.BattleHolder
// File: ext\mods\battlerboss\holder\BattleHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/holder/BattleHolder.class
  Last modified 9 de jul de 2026; size 1071 bytes
  MD5 checksum b514dd7f56c12a3d14283ea5bde75046
  Compiled from "BattleHolder.java"
public class ext.mods.battlerboss.holder.BattleHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/battlerboss/holder/BattleHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // duration
   #8 = Utf8               duration
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;I)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;I)I
  #15 = Fieldref           #16.#17        // ext/mods/battlerboss/holder/BattleHolder.duration:I
  #16 = Class              #18            // ext/mods/battlerboss/holder/BattleHolder
  #17 = NameAndType        #8:#19         // duration:I
  #18 = Utf8               ext/mods/battlerboss/holder/BattleHolder
  #19 = Utf8               I
  #20 = String             #21            // stayDownOnDeath
  #21 = Utf8               stayDownOnDeath
  #22 = Methodref          #10.#23        // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
  #23 = NameAndType        #24:#25        // getBool:(Ljava/lang/String;Z)Z
  #24 = Utf8               getBool
  #25 = Utf8               (Ljava/lang/String;Z)Z
  #26 = Fieldref           #16.#27        // ext/mods/battlerboss/holder/BattleHolder.stayDownOnDeath:Z
  #27 = NameAndType        #21:#28        // stayDownOnDeath:Z
  #28 = Utf8               Z
  #29 = String             #30            // winnerByHpCp
  #30 = Utf8               winnerByHpCp
  #31 = Fieldref           #16.#32        // ext/mods/battlerboss/holder/BattleHolder.winnerByHpCp:Z
  #32 = NameAndType        #30:#28        // winnerByHpCp:Z
  #33 = String             #34            // multiMatches
  #34 = Utf8               multiMatches
  #35 = Fieldref           #16.#36        // ext/mods/battlerboss/holder/BattleHolder.multiMatches:Z
  #36 = NameAndType        #34:#28        // multiMatches:Z
  #37 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #38 = Utf8               Code
  #39 = Utf8               LineNumberTable
  #40 = Utf8               LocalVariableTable
  #41 = Utf8               this
  #42 = Utf8               Lext/mods/battlerboss/holder/BattleHolder;
  #43 = Utf8               set
  #44 = Utf8               Lext/mods/commons/data/StatSet;
  #45 = Utf8               getDuration
  #46 = Utf8               ()I
  #47 = Utf8               isStayDownOnDeath
  #48 = Utf8               ()Z
  #49 = Utf8               isWinnerByHpCp
  #50 = Utf8               isMultiMatches
  #51 = Utf8               SourceFile
  #52 = Utf8               BattleHolder.java
{
  public ext.mods.battlerboss.holder.BattleHolder(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String duration
         8: iconst_0
         9: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        12: putfield      #15                 // Field duration:I
        15: aload_0
        16: aload_1
        17: ldc           #20                 // String stayDownOnDeath
        19: iconst_0
        20: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        23: putfield      #26                 // Field stayDownOnDeath:Z
        26: aload_0
        27: aload_1
        28: ldc           #29                 // String winnerByHpCp
        30: iconst_0
        31: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        34: putfield      #31                 // Field winnerByHpCp:Z
        37: aload_0
        38: aload_1
        39: ldc           #33                 // String multiMatches
        41: iconst_0
        42: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        45: putfield      #35                 // Field multiMatches:Z
        48: return
      LineNumberTable:
        line 30: 0
        line 31: 4
        line 32: 15
        line 33: 26
        line 34: 37
        line 35: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/battlerboss/holder/BattleHolder;
            0      49     1   set   Lext/mods/commons/data/StatSet;

  public int getDuration();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field duration:I
         4: ireturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/BattleHolder;

  public boolean isStayDownOnDeath();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field stayDownOnDeath:Z
         4: ireturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/BattleHolder;

  public boolean isWinnerByHpCp();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field winnerByHpCp:Z
         4: ireturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/BattleHolder;

  public boolean isMultiMatches();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field multiMatches:Z
         4: ireturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/BattleHolder;
}
SourceFile: "BattleHolder.java"
