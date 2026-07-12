// Bytecode for: ext.mods.battlerboss.holder.RegistrationHolder
// File: ext\mods\battlerboss\holder\RegistrationHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/holder/RegistrationHolder.class
  Last modified 9 de jul de 2026; size 1037 bytes
  MD5 checksum 4d21ae7451513b10062fed16c3f8ba07
  Compiled from "RegistrationHolder.java"
public class ext.mods.battlerboss.holder.RegistrationHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/battlerboss/holder/RegistrationHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // minPlayers
   #8 = Utf8               minPlayers
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;I)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;I)I
  #15 = Fieldref           #16.#17        // ext/mods/battlerboss/holder/RegistrationHolder.minPlayers:I
  #16 = Class              #18            // ext/mods/battlerboss/holder/RegistrationHolder
  #17 = NameAndType        #8:#19         // minPlayers:I
  #18 = Utf8               ext/mods/battlerboss/holder/RegistrationHolder
  #19 = Utf8               I
  #20 = String             #21            // maxPlayers
  #21 = Utf8               maxPlayers
  #22 = Fieldref           #16.#23        // ext/mods/battlerboss/holder/RegistrationHolder.maxPlayers:I
  #23 = NameAndType        #21:#19        // maxPlayers:I
  #24 = String             #25            // groupSize
  #25 = Utf8               groupSize
  #26 = Fieldref           #16.#27        // ext/mods/battlerboss/holder/RegistrationHolder.groupSize:I
  #27 = NameAndType        #25:#19        // groupSize:I
  #28 = String             #29            // waitingTimeMatches
  #29 = Utf8               waitingTimeMatches
  #30 = Fieldref           #16.#31        // ext/mods/battlerboss/holder/RegistrationHolder.waitingTimeMatches:I
  #31 = NameAndType        #29:#19        // waitingTimeMatches:I
  #32 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #33 = Utf8               Code
  #34 = Utf8               LineNumberTable
  #35 = Utf8               LocalVariableTable
  #36 = Utf8               this
  #37 = Utf8               Lext/mods/battlerboss/holder/RegistrationHolder;
  #38 = Utf8               set
  #39 = Utf8               Lext/mods/commons/data/StatSet;
  #40 = Utf8               getMinPlayers
  #41 = Utf8               ()I
  #42 = Utf8               getMaxPlayers
  #43 = Utf8               getGroupSize
  #44 = Utf8               getWaitingTimeMatches
  #45 = Utf8               SourceFile
  #46 = Utf8               RegistrationHolder.java
{
  public ext.mods.battlerboss.holder.RegistrationHolder(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String minPlayers
         8: iconst_0
         9: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        12: putfield      #15                 // Field minPlayers:I
        15: aload_0
        16: aload_1
        17: ldc           #20                 // String maxPlayers
        19: iconst_0
        20: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        23: putfield      #22                 // Field maxPlayers:I
        26: aload_0
        27: aload_1
        28: ldc           #24                 // String groupSize
        30: iconst_1
        31: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        34: putfield      #26                 // Field groupSize:I
        37: aload_0
        38: aload_1
        39: ldc           #28                 // String waitingTimeMatches
        41: iconst_5
        42: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        45: putfield      #30                 // Field waitingTimeMatches:I
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
            0      49     0  this   Lext/mods/battlerboss/holder/RegistrationHolder;
            0      49     1   set   Lext/mods/commons/data/StatSet;

  public int getMinPlayers();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field minPlayers:I
         4: ireturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/RegistrationHolder;

  public int getMaxPlayers();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field maxPlayers:I
         4: ireturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/RegistrationHolder;

  public int getGroupSize();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field groupSize:I
         4: ireturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/RegistrationHolder;

  public int getWaitingTimeMatches();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field waitingTimeMatches:I
         4: ireturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/RegistrationHolder;
}
SourceFile: "RegistrationHolder.java"
