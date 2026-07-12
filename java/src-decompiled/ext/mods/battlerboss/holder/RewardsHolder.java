// Bytecode for: ext.mods.battlerboss.holder.RewardsHolder
// File: ext\mods\battlerboss\holder\RewardsHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/holder/RewardsHolder.class
  Last modified 9 de jul de 2026; size 1001 bytes
  MD5 checksum a65a42af743fbc37f91ec5e500688f8b
  Compiled from "RewardsHolder.java"
public class ext.mods.battlerboss.holder.RewardsHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/battlerboss/holder/RewardsHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/battlerboss/holder/RewardsHolder.winners:Ljava/util/List;
   #8 = Class              #10            // ext/mods/battlerboss/holder/RewardsHolder
   #9 = NameAndType        #11:#12        // winners:Ljava/util/List;
  #10 = Utf8               ext/mods/battlerboss/holder/RewardsHolder
  #11 = Utf8               winners
  #12 = Utf8               Ljava/util/List;
  #13 = Fieldref           #8.#14         // ext/mods/battlerboss/holder/RewardsHolder.losers:Ljava/util/List;
  #14 = NameAndType        #15:#12        // losers:Ljava/util/List;
  #15 = Utf8               losers
  #16 = Utf8               Signature
  #17 = Utf8               Ljava/util/List<Lext/mods/battlerboss/holder/RewardHolder;>;
  #18 = Utf8               (Ljava/util/List;Ljava/util/List;)V
  #19 = Utf8               Code
  #20 = Utf8               LineNumberTable
  #21 = Utf8               LocalVariableTable
  #22 = Utf8               this
  #23 = Utf8               Lext/mods/battlerboss/holder/RewardsHolder;
  #24 = Utf8               LocalVariableTypeTable
  #25 = Utf8               (Ljava/util/List<Lext/mods/battlerboss/holder/RewardHolder;>;Ljava/util/List<Lext/mods/battlerboss/holder/RewardHolder;>;)V
  #26 = Utf8               getWinners
  #27 = Utf8               ()Ljava/util/List;
  #28 = Utf8               ()Ljava/util/List<Lext/mods/battlerboss/holder/RewardHolder;>;
  #29 = Utf8               getLosers
  #30 = Utf8               SourceFile
  #31 = Utf8               RewardsHolder.java
{
  public ext.mods.battlerboss.holder.RewardsHolder(java.util.List<ext.mods.battlerboss.holder.RewardHolder>, java.util.List<ext.mods.battlerboss.holder.RewardHolder>);
    descriptor: (Ljava/util/List;Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field winners:Ljava/util/List;
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field losers:Ljava/util/List;
        14: return
      LineNumberTable:
        line 28: 0
        line 29: 4
        line 30: 9
        line 31: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/battlerboss/holder/RewardsHolder;
            0      15     1 winners   Ljava/util/List;
            0      15     2 losers   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      15     1 winners   Ljava/util/List<Lext/mods/battlerboss/holder/RewardHolder;>;
            0      15     2 losers   Ljava/util/List<Lext/mods/battlerboss/holder/RewardHolder;>;
    Signature: #25                          // (Ljava/util/List<Lext/mods/battlerboss/holder/RewardHolder;>;Ljava/util/List<Lext/mods/battlerboss/holder/RewardHolder;>;)V

  public java.util.List<ext.mods.battlerboss.holder.RewardHolder> getWinners();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field winners:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/RewardsHolder;
    Signature: #28                          // ()Ljava/util/List<Lext/mods/battlerboss/holder/RewardHolder;>;

  public java.util.List<ext.mods.battlerboss.holder.RewardHolder> getLosers();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field losers:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/RewardsHolder;
    Signature: #28                          // ()Ljava/util/List<Lext/mods/battlerboss/holder/RewardHolder;>;
}
SourceFile: "RewardsHolder.java"
