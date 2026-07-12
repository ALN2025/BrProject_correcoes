// Bytecode for: ext.mods.gameserver.model.actor.container.monster.SpoilState
// File: ext\mods\gameserver\model\actor\container\monster\SpoilState.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/monster/SpoilState.class
  Last modified 9 de jul de 2026; size 1340 bytes
  MD5 checksum aeb94782a5a6a8f059c01f14e9880b76
  Compiled from "SpoilState.java"
public class ext.mods.gameserver.model.actor.container.monster.SpoilState extends java.util.ArrayList<ext.mods.gameserver.model.holder.IntIntHolder>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/monster/SpoilState
  super_class: #2                         // java/util/ArrayList
  interfaces: 0, fields: 2, methods: 7, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // java/util/ArrayList."<init>":()V
   #2 = Class              #4             // java/util/ArrayList
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/util/ArrayList
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/container/monster/SpoilState._spoilerId:I
   #8 = Class              #10            // ext/mods/gameserver/model/actor/container/monster/SpoilState
   #9 = NameAndType        #11:#12        // _spoilerId:I
  #10 = Utf8               ext/mods/gameserver/model/actor/container/monster/SpoilState
  #11 = Utf8               _spoilerId
  #12 = Utf8               I
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #14 = Class              #16            // ext/mods/gameserver/model/actor/Player
  #15 = NameAndType        #17:#18        // getObjectId:()I
  #16 = Utf8               ext/mods/gameserver/model/actor/Player
  #17 = Utf8               getObjectId
  #18 = Utf8               ()I
  #19 = Methodref          #8.#20         // ext/mods/gameserver/model/actor/container/monster/SpoilState.isEmpty:()Z
  #20 = NameAndType        #21:#22        // isEmpty:()Z
  #21 = Utf8               isEmpty
  #22 = Utf8               ()Z
  #23 = Methodref          #2.#24         // java/util/ArrayList.clear:()V
  #24 = NameAndType        #25:#6         // clear:()V
  #25 = Utf8               clear
  #26 = Utf8               serialVersionUID
  #27 = Utf8               J
  #28 = Utf8               ConstantValue
  #29 = Long               1l
  #31 = Utf8               Code
  #32 = Utf8               LineNumberTable
  #33 = Utf8               LocalVariableTable
  #34 = Utf8               this
  #35 = Utf8               Lext/mods/gameserver/model/actor/container/monster/SpoilState;
  #36 = Utf8               getSpoilerId
  #37 = Utf8               setSpoilerId
  #38 = Utf8               (I)V
  #39 = Utf8               value
  #40 = Utf8               isSpoiled
  #41 = Utf8               StackMapTable
  #42 = Utf8               isActualSpoiler
  #43 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #44 = Utf8               player
  #45 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #46 = Utf8               isSweepable
  #47 = Utf8               Signature
  #48 = Utf8               Ljava/util/ArrayList<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #49 = Utf8               SourceFile
  #50 = Utf8               SpoilState.java
{
  public ext.mods.gameserver.model.actor.container.monster.SpoilState();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/util/ArrayList."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/monster/SpoilState;

  public int getSpoilerId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _spoilerId:I
         4: ireturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/monster/SpoilState;

  public void setSpoilerId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _spoilerId:I
         5: return
      LineNumberTable:
        line 45: 0
        line 46: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/monster/SpoilState;
            0       6     1 value   I

  public boolean isSpoiled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _spoilerId:I
         4: ifle          11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/container/monster/SpoilState;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isActualSpoiler(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        19
         4: aload_1
         5: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         8: aload_0
         9: getfield      #7                  // Field _spoilerId:I
        12: if_icmpne     19
        15: iconst_1
        16: goto          20
        19: iconst_0
        20: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/container/monster/SpoilState;
            0      21     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 19 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isSweepable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #19                 // Method isEmpty:()Z
         4: ifne          11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/container/monster/SpoilState;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void clear();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #7                  // Field _spoilerId:I
         5: aload_0
         6: invokespecial #23                 // Method java/util/ArrayList.clear:()V
         9: return
      LineNumberTable:
        line 79: 0
        line 81: 5
        line 82: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/monster/SpoilState;
}
Signature: #48                          // Ljava/util/ArrayList<Lext/mods/gameserver/model/holder/IntIntHolder;>;
SourceFile: "SpoilState.java"
