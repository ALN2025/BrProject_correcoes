// Bytecode for: ext.mods.aghation.holder.AgathionHolder
// File: ext\mods\aghation\holder\AgathionHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/aghation/holder/AgathionHolder.class
  Last modified 9 de jul de 2026; size 1404 bytes
  MD5 checksum 6cd0caa72bd2a91e3c3ea20c7c258df6
  Compiled from "AgathionHolder.java"
public class ext.mods.aghation.holder.AgathionHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/aghation/holder/AgathionHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // NpcId
   #8 = Utf8               NpcId
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;I)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;I)I
  #15 = Fieldref           #16.#17        // ext/mods/aghation/holder/AgathionHolder._NpcId:I
  #16 = Class              #18            // ext/mods/aghation/holder/AgathionHolder
  #17 = NameAndType        #19:#20        // _NpcId:I
  #18 = Utf8               ext/mods/aghation/holder/AgathionHolder
  #19 = Utf8               _NpcId
  #20 = Utf8               I
  #21 = String             #22            // runSpeed
  #22 = Utf8               runSpeed
  #23 = Methodref          #10.#24        // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
  #24 = NameAndType        #25:#26        // getBool:(Ljava/lang/String;Z)Z
  #25 = Utf8               getBool
  #26 = Utf8               (Ljava/lang/String;Z)Z
  #27 = Fieldref           #16.#28        // ext/mods/aghation/holder/AgathionHolder._runSpeed:Z
  #28 = NameAndType        #29:#30        // _runSpeed:Z
  #29 = Utf8               _runSpeed
  #30 = Utf8               Z
  #31 = String             #32            // healAmount
  #32 = Utf8               healAmount
  #33 = Fieldref           #16.#34        // ext/mods/aghation/holder/AgathionHolder._healAmount:I
  #34 = NameAndType        #35:#20        // _healAmount:I
  #35 = Utf8               _healAmount
  #36 = String             #37            // healDelay
  #37 = Utf8               healDelay
  #38 = Fieldref           #16.#39        // ext/mods/aghation/holder/AgathionHolder._healDelay:I
  #39 = NameAndType        #40:#20        // _healDelay:I
  #40 = Utf8               _healDelay
  #41 = String             #42            // randomAnimDelay
  #42 = Utf8               randomAnimDelay
  #43 = Fieldref           #16.#44        // ext/mods/aghation/holder/AgathionHolder._randomAnimDelay:I
  #44 = NameAndType        #45:#20        // _randomAnimDelay:I
  #45 = Utf8               _randomAnimDelay
  #46 = String             #47            // followDelay
  #47 = Utf8               followDelay
  #48 = Fieldref           #16.#49        // ext/mods/aghation/holder/AgathionHolder._followCheckDelay:I
  #49 = NameAndType        #50:#20        // _followCheckDelay:I
  #50 = Utf8               _followCheckDelay
  #51 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #52 = Utf8               Code
  #53 = Utf8               LineNumberTable
  #54 = Utf8               LocalVariableTable
  #55 = Utf8               this
  #56 = Utf8               Lext/mods/aghation/holder/AgathionHolder;
  #57 = Utf8               set
  #58 = Utf8               Lext/mods/commons/data/StatSet;
  #59 = Utf8               getNpcId
  #60 = Utf8               ()I
  #61 = Utf8               getRunSpeed
  #62 = Utf8               ()Z
  #63 = Utf8               getHealAmount
  #64 = Utf8               getHealDelay
  #65 = Utf8               getRandomAnimDelay
  #66 = Utf8               getFollowCheckDelay
  #67 = Utf8               SourceFile
  #68 = Utf8               AgathionHolder.java
{
  public ext.mods.aghation.holder.AgathionHolder(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String NpcId
         8: iconst_0
         9: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        12: putfield      #15                 // Field _NpcId:I
        15: aload_0
        16: aload_1
        17: ldc           #21                 // String runSpeed
        19: iconst_1
        20: invokevirtual #23                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        23: putfield      #27                 // Field _runSpeed:Z
        26: aload_0
        27: aload_1
        28: ldc           #31                 // String healAmount
        30: sipush        500
        33: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        36: putfield      #33                 // Field _healAmount:I
        39: aload_0
        40: aload_1
        41: ldc           #36                 // String healDelay
        43: bipush        10
        45: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        48: putfield      #38                 // Field _healDelay:I
        51: aload_0
        52: aload_1
        53: ldc           #41                 // String randomAnimDelay
        55: bipush        45
        57: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        60: putfield      #43                 // Field _randomAnimDelay:I
        63: aload_0
        64: aload_1
        65: ldc           #46                 // String followDelay
        67: iconst_2
        68: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        71: putfield      #48                 // Field _followCheckDelay:I
        74: return
      LineNumberTable:
        line 33: 0
        line 34: 4
        line 35: 15
        line 37: 26
        line 38: 39
        line 39: 51
        line 40: 63
        line 41: 74
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      75     0  this   Lext/mods/aghation/holder/AgathionHolder;
            0      75     1   set   Lext/mods/commons/data/StatSet;

  public int getNpcId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _NpcId:I
         4: ireturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/aghation/holder/AgathionHolder;

  public boolean getRunSpeed();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _runSpeed:Z
         4: ireturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/aghation/holder/AgathionHolder;

  public int getHealAmount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _healAmount:I
         4: ireturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/aghation/holder/AgathionHolder;

  public int getHealDelay();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _healDelay:I
         4: ireturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/aghation/holder/AgathionHolder;

  public int getRandomAnimDelay();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field _randomAnimDelay:I
         4: ireturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/aghation/holder/AgathionHolder;

  public int getFollowCheckDelay();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #48                 // Field _followCheckDelay:I
         4: ireturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/aghation/holder/AgathionHolder;
}
SourceFile: "AgathionHolder.java"
