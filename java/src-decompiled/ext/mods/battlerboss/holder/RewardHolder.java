// Bytecode for: ext.mods.battlerboss.holder.RewardHolder
// File: ext\mods\battlerboss\holder\RewardHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/holder/RewardHolder.class
  Last modified 9 de jul de 2026; size 786 bytes
  MD5 checksum c07104d7bc10c416665f638e67ec054c
  Compiled from "RewardHolder.java"
public class ext.mods.battlerboss.holder.RewardHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/battlerboss/holder/RewardHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // itemId
   #8 = Utf8               itemId
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;)I
  #15 = Fieldref           #16.#17        // ext/mods/battlerboss/holder/RewardHolder.itemId:I
  #16 = Class              #18            // ext/mods/battlerboss/holder/RewardHolder
  #17 = NameAndType        #8:#19         // itemId:I
  #18 = Utf8               ext/mods/battlerboss/holder/RewardHolder
  #19 = Utf8               I
  #20 = String             #21            // count
  #21 = Utf8               count
  #22 = Methodref          #10.#23        // ext/mods/commons/data/StatSet.getLong:(Ljava/lang/String;)J
  #23 = NameAndType        #24:#25        // getLong:(Ljava/lang/String;)J
  #24 = Utf8               getLong
  #25 = Utf8               (Ljava/lang/String;)J
  #26 = Fieldref           #16.#27        // ext/mods/battlerboss/holder/RewardHolder.count:J
  #27 = NameAndType        #21:#28        // count:J
  #28 = Utf8               J
  #29 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #30 = Utf8               Code
  #31 = Utf8               LineNumberTable
  #32 = Utf8               LocalVariableTable
  #33 = Utf8               this
  #34 = Utf8               Lext/mods/battlerboss/holder/RewardHolder;
  #35 = Utf8               set
  #36 = Utf8               Lext/mods/commons/data/StatSet;
  #37 = Utf8               getItemId
  #38 = Utf8               ()I
  #39 = Utf8               getCount
  #40 = Utf8               ()J
  #41 = Utf8               SourceFile
  #42 = Utf8               RewardHolder.java
{
  public ext.mods.battlerboss.holder.RewardHolder(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String itemId
         8: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        11: putfield      #15                 // Field itemId:I
        14: aload_0
        15: aload_1
        16: ldc           #20                 // String count
        18: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getLong:(Ljava/lang/String;)J
        21: putfield      #26                 // Field count:J
        24: return
      LineNumberTable:
        line 28: 0
        line 29: 4
        line 30: 14
        line 31: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/battlerboss/holder/RewardHolder;
            0      25     1   set   Lext/mods/commons/data/StatSet;

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field itemId:I
         4: ireturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/RewardHolder;

  public long getCount();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field count:J
         4: lreturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/RewardHolder;
}
SourceFile: "RewardHolder.java"
