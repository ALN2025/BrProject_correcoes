// Bytecode for: ext.mods.battlerboss.holder.MonsterChallengeHolder
// File: ext\mods\battlerboss\holder\MonsterChallengeHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/holder/MonsterChallengeHolder.class
  Last modified 9 de jul de 2026; size 1308 bytes
  MD5 checksum 47e777294dce66f035147c1beea1542f
  Compiled from "MonsterChallengeHolder.java"
public class ext.mods.battlerboss.holder.MonsterChallengeHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/battlerboss/holder/MonsterChallengeHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // npcId
   #8 = Utf8               npcId
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;)I
  #15 = Fieldref           #16.#17        // ext/mods/battlerboss/holder/MonsterChallengeHolder.npcId:I
  #16 = Class              #18            // ext/mods/battlerboss/holder/MonsterChallengeHolder
  #17 = NameAndType        #8:#19         // npcId:I
  #18 = Utf8               ext/mods/battlerboss/holder/MonsterChallengeHolder
  #19 = Utf8               I
  #20 = String             #21            // timeLimit
  #21 = Utf8               timeLimit
  #22 = Methodref          #10.#23        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #23 = NameAndType        #13:#24        // getInteger:(Ljava/lang/String;I)I
  #24 = Utf8               (Ljava/lang/String;I)I
  #25 = Fieldref           #16.#26        // ext/mods/battlerboss/holder/MonsterChallengeHolder.timeLimit:I
  #26 = NameAndType        #21:#19        // timeLimit:I
  #27 = String             #28            // reviveTeam
  #28 = Utf8               reviveTeam
  #29 = Methodref          #10.#30        // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
  #30 = NameAndType        #31:#32        // getBool:(Ljava/lang/String;Z)Z
  #31 = Utf8               getBool
  #32 = Utf8               (Ljava/lang/String;Z)Z
  #33 = Fieldref           #16.#34        // ext/mods/battlerboss/holder/MonsterChallengeHolder.reviveTeam:Z
  #34 = NameAndType        #28:#35        // reviveTeam:Z
  #35 = Utf8               Z
  #36 = String             #37            // x
  #37 = Utf8               x
  #38 = Fieldref           #16.#39        // ext/mods/battlerboss/holder/MonsterChallengeHolder.x:I
  #39 = NameAndType        #37:#19        // x:I
  #40 = String             #41            // y
  #41 = Utf8               y
  #42 = Fieldref           #16.#43        // ext/mods/battlerboss/holder/MonsterChallengeHolder.y:I
  #43 = NameAndType        #41:#19        // y:I
  #44 = String             #45            // z
  #45 = Utf8               z
  #46 = Fieldref           #16.#47        // ext/mods/battlerboss/holder/MonsterChallengeHolder.z:I
  #47 = NameAndType        #45:#19        // z:I
  #48 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #49 = Utf8               Code
  #50 = Utf8               LineNumberTable
  #51 = Utf8               LocalVariableTable
  #52 = Utf8               this
  #53 = Utf8               Lext/mods/battlerboss/holder/MonsterChallengeHolder;
  #54 = Utf8               set
  #55 = Utf8               Lext/mods/commons/data/StatSet;
  #56 = Utf8               getNpcId
  #57 = Utf8               ()I
  #58 = Utf8               getTimeLimit
  #59 = Utf8               isReviveTeam
  #60 = Utf8               ()Z
  #61 = Utf8               getX
  #62 = Utf8               getY
  #63 = Utf8               getZ
  #64 = Utf8               SourceFile
  #65 = Utf8               MonsterChallengeHolder.java
{
  public ext.mods.battlerboss.holder.MonsterChallengeHolder(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String npcId
         8: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        11: putfield      #15                 // Field npcId:I
        14: aload_0
        15: aload_1
        16: ldc           #20                 // String timeLimit
        18: iconst_0
        19: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        22: putfield      #25                 // Field timeLimit:I
        25: aload_0
        26: aload_1
        27: ldc           #27                 // String reviveTeam
        29: iconst_0
        30: invokevirtual #29                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        33: putfield      #33                 // Field reviveTeam:Z
        36: aload_0
        37: aload_1
        38: ldc           #36                 // String x
        40: iconst_0
        41: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        44: putfield      #38                 // Field x:I
        47: aload_0
        48: aload_1
        49: ldc           #40                 // String y
        51: iconst_0
        52: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        55: putfield      #42                 // Field y:I
        58: aload_0
        59: aload_1
        60: ldc           #44                 // String z
        62: iconst_0
        63: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        66: putfield      #46                 // Field z:I
        69: return
      LineNumberTable:
        line 30: 0
        line 31: 4
        line 32: 14
        line 33: 25
        line 35: 36
        line 36: 47
        line 37: 58
        line 38: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      70     0  this   Lext/mods/battlerboss/holder/MonsterChallengeHolder;
            0      70     1   set   Lext/mods/commons/data/StatSet;

  public int getNpcId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field npcId:I
         4: ireturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/MonsterChallengeHolder;

  public int getTimeLimit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field timeLimit:I
         4: ireturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/MonsterChallengeHolder;

  public boolean isReviveTeam();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field reviveTeam:Z
         4: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/MonsterChallengeHolder;

  public int getX();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field x:I
         4: ireturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/MonsterChallengeHolder;

  public int getY();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field y:I
         4: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/MonsterChallengeHolder;

  public int getZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field z:I
         4: ireturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/MonsterChallengeHolder;
}
SourceFile: "MonsterChallengeHolder.java"
