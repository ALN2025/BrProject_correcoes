// Bytecode for: ext.mods.dressme.holder.DressMeEffectHolder
// File: ext\mods\dressme\holder\DressMeEffectHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dressme/holder/DressMeEffectHolder.class
  Last modified 9 de jul de 2026; size 1096 bytes
  MD5 checksum d94b5d9b1a4b2601b4d73b81d61c0469
  Compiled from "DressMeEffectHolder.java"
public class ext.mods.dressme.holder.DressMeEffectHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/dressme/holder/DressMeEffectHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // skillId
   #8 = Utf8               skillId
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;I)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;I)I
  #15 = Fieldref           #16.#17        // ext/mods/dressme/holder/DressMeEffectHolder._skillId:I
  #16 = Class              #18            // ext/mods/dressme/holder/DressMeEffectHolder
  #17 = NameAndType        #19:#20        // _skillId:I
  #18 = Utf8               ext/mods/dressme/holder/DressMeEffectHolder
  #19 = Utf8               _skillId
  #20 = Utf8               I
  #21 = String             #22            // level
  #22 = Utf8               level
  #23 = Fieldref           #16.#24        // ext/mods/dressme/holder/DressMeEffectHolder._level:I
  #24 = NameAndType        #25:#20        // _level:I
  #25 = Utf8               _level
  #26 = String             #27            // recurring
  #27 = Utf8               recurring
  #28 = Methodref          #10.#29        // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
  #29 = NameAndType        #30:#31        // getBool:(Ljava/lang/String;Z)Z
  #30 = Utf8               getBool
  #31 = Utf8               (Ljava/lang/String;Z)Z
  #32 = Fieldref           #16.#33        // ext/mods/dressme/holder/DressMeEffectHolder._recurring:Z
  #33 = NameAndType        #34:#35        // _recurring:Z
  #34 = Utf8               _recurring
  #35 = Utf8               Z
  #36 = String             #37            // interval
  #37 = Utf8               interval
  #38 = Fieldref           #16.#39        // ext/mods/dressme/holder/DressMeEffectHolder._interval:I
  #39 = NameAndType        #40:#20        // _interval:I
  #40 = Utf8               _interval
  #41 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #42 = Utf8               Code
  #43 = Utf8               LineNumberTable
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               this
  #46 = Utf8               Lext/mods/dressme/holder/DressMeEffectHolder;
  #47 = Utf8               set
  #48 = Utf8               Lext/mods/commons/data/StatSet;
  #49 = Utf8               getSkillId
  #50 = Utf8               ()I
  #51 = Utf8               getLevel
  #52 = Utf8               isRecurring
  #53 = Utf8               ()Z
  #54 = Utf8               getInterval
  #55 = Utf8               SourceFile
  #56 = Utf8               DressMeEffectHolder.java
{
  public ext.mods.dressme.holder.DressMeEffectHolder(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String skillId
         8: iconst_0
         9: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        12: putfield      #15                 // Field _skillId:I
        15: aload_0
        16: aload_1
        17: ldc           #21                 // String level
        19: iconst_1
        20: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        23: putfield      #23                 // Field _level:I
        26: aload_0
        27: aload_1
        28: ldc           #26                 // String recurring
        30: iconst_0
        31: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        34: putfield      #32                 // Field _recurring:Z
        37: aload_0
        38: aload_1
        39: ldc           #36                 // String interval
        41: bipush        60
        43: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        46: putfield      #38                 // Field _interval:I
        49: return
      LineNumberTable:
        line 30: 0
        line 31: 4
        line 32: 15
        line 33: 26
        line 34: 37
        line 35: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/dressme/holder/DressMeEffectHolder;
            0      50     1   set   Lext/mods/commons/data/StatSet;

  public int getSkillId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _skillId:I
         4: ireturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeEffectHolder;

  public int getLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _level:I
         4: ireturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeEffectHolder;

  public boolean isRecurring();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _recurring:Z
         4: ireturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeEffectHolder;

  public int getInterval();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _interval:I
         4: ireturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/holder/DressMeEffectHolder;
}
SourceFile: "DressMeEffectHolder.java"
