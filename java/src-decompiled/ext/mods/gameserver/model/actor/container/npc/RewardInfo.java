// Bytecode for: ext.mods.gameserver.model.actor.container.npc.RewardInfo
// File: ext\mods\gameserver\model\actor\container\npc\RewardInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/npc/RewardInfo.class
  Last modified 9 de jul de 2026; size 1228 bytes
  MD5 checksum f1e4f4cd0825c761c4d187e0f00259bb
  Compiled from "RewardInfo.java"
public final class ext.mods.gameserver.model.actor.container.npc.RewardInfo
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/npc/RewardInfo
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/container/npc/RewardInfo._attacker:Lext/mods/gameserver/model/actor/Playable;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/container/npc/RewardInfo
   #9 = NameAndType        #11:#12        // _attacker:Lext/mods/gameserver/model/actor/Playable;
  #10 = Utf8               ext/mods/gameserver/model/actor/container/npc/RewardInfo
  #11 = Utf8               _attacker
  #12 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/actor/container/npc/RewardInfo._damage:D
  #14 = NameAndType        #15:#16        // _damage:D
  #15 = Utf8               _damage
  #16 = Utf8               D
  #17 = Methodref          #18.#19        // ext/mods/gameserver/model/actor/Playable.getObjectId:()I
  #18 = Class              #20            // ext/mods/gameserver/model/actor/Playable
  #19 = NameAndType        #21:#22        // getObjectId:()I
  #20 = Utf8               ext/mods/gameserver/model/actor/Playable
  #21 = Utf8               getObjectId
  #22 = Utf8               ()I
  #23 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
  #24 = Utf8               Code
  #25 = Utf8               LineNumberTable
  #26 = Utf8               LocalVariableTable
  #27 = Utf8               this
  #28 = Utf8               Lext/mods/gameserver/model/actor/container/npc/RewardInfo;
  #29 = Utf8               attacker
  #30 = Utf8               getAttacker
  #31 = Utf8               ()Lext/mods/gameserver/model/actor/Playable;
  #32 = Utf8               addDamage
  #33 = Utf8               (D)V
  #34 = Utf8               damage
  #35 = Utf8               getDamage
  #36 = Utf8               ()D
  #37 = Utf8               equals
  #38 = Utf8               (Ljava/lang/Object;)Z
  #39 = Utf8               ri
  #40 = Utf8               obj
  #41 = Utf8               Ljava/lang/Object;
  #42 = Utf8               StackMapTable
  #43 = Utf8               hashCode
  #44 = Utf8               SourceFile
  #45 = Utf8               RewardInfo.java
{
  public ext.mods.gameserver.model.actor.container.npc.RewardInfo(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _attacker:Lext/mods/gameserver/model/actor/Playable;
         9: return
      LineNumberTable:
        line 32: 0
        line 33: 4
        line 34: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/npc/RewardInfo;
            0      10     1 attacker   Lext/mods/gameserver/model/actor/Playable;

  public ext.mods.gameserver.model.actor.Playable getAttacker();
    descriptor: ()Lext/mods/gameserver/model/actor/Playable;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _attacker:Lext/mods/gameserver/model/actor/Playable;
         4: areturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/npc/RewardInfo;

  public void addDamage(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: dup
         2: getfield      #13                 // Field _damage:D
         5: dload_1
         6: dadd
         7: putfield      #13                 // Field _damage:D
        10: return
      LineNumberTable:
        line 43: 0
        line 44: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/container/npc/RewardInfo;
            0      11     1 damage   D

  public double getDamage();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _damage:D
         4: dreturn
      LineNumberTable:
        line 48: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/npc/RewardInfo;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #8                  // class ext/mods/gameserver/model/actor/container/npc/RewardInfo
        11: ifeq          36
        14: aload_1
        15: checkcast     #8                  // class ext/mods/gameserver/model/actor/container/npc/RewardInfo
        18: astore_2
        19: aload_2
        20: getfield      #7                  // Field _attacker:Lext/mods/gameserver/model/actor/Playable;
        23: aload_0
        24: getfield      #7                  // Field _attacker:Lext/mods/gameserver/model/actor/Playable;
        27: if_acmpne     34
        30: iconst_1
        31: goto          35
        34: iconst_0
        35: ireturn
        36: iconst_0
        37: ireturn
      LineNumberTable:
        line 54: 0
        line 55: 5
        line 57: 7
        line 58: 19
        line 60: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19      17     2    ri   Lext/mods/gameserver/model/actor/container/npc/RewardInfo;
            0      38     0  this   Lext/mods/gameserver/model/actor/container/npc/RewardInfo;
            0      38     1   obj   Ljava/lang/Object;
      StackMapTable: number_of_entries = 4
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/actor/container/npc/RewardInfo ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _attacker:Lext/mods/gameserver/model/actor/Playable;
         4: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
         7: ireturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/container/npc/RewardInfo;
}
SourceFile: "RewardInfo.java"
