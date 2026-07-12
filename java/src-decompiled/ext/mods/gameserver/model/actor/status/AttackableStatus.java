// Bytecode for: ext.mods.gameserver.model.actor.status.AttackableStatus
// File: ext\mods\gameserver\model\actor\status\AttackableStatus.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/status/AttackableStatus.class
  Last modified 9 de jul de 2026; size 1642 bytes
  MD5 checksum 1cceaa566e2c75aa7098389065ad1030
  Compiled from "AttackableStatus.java"
public class ext.mods.gameserver.model.actor.status.AttackableStatus extends ext.mods.gameserver.model.actor.status.NpcStatus<ext.mods.gameserver.model.actor.Attackable>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/status/AttackableStatus
  super_class: #2                         // ext/mods/gameserver/model/actor/status/NpcStatus
  interfaces: 0, fields: 0, methods: 3, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/status/NpcStatus."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/status/NpcStatus
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/gameserver/model/actor/Npc;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/status/AttackableStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
   #8 = Class              #10            // ext/mods/gameserver/model/actor/status/AttackableStatus
   #9 = NameAndType        #11:#12        // reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
  #10 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
  #11 = Utf8               reduceHp
  #12 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZZ)V
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/actor/status/AttackableStatus._actor:Lext/mods/gameserver/model/actor/Creature;
  #14 = NameAndType        #15:#16        // _actor:Lext/mods/gameserver/model/actor/Creature;
  #15 = Utf8               _actor
  #16 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #17 = Class              #18            // ext/mods/gameserver/model/actor/Attackable
  #18 = Utf8               ext/mods/gameserver/model/actor/Attackable
  #19 = Methodref          #17.#20        // ext/mods/gameserver/model/actor/Attackable.isDead:()Z
  #20 = NameAndType        #21:#22        // isDead:()Z
  #21 = Utf8               isDead
  #22 = Utf8               ()Z
  #23 = Class              #24            // ext/mods/gameserver/model/actor/instance/Monster
  #24 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #25 = Methodref          #23.#26        // ext/mods/gameserver/model/actor/instance/Monster.getOverhitState:()Lext/mods/gameserver/model/actor/container/monster/OverhitState;
  #26 = NameAndType        #27:#28        // getOverhitState:()Lext/mods/gameserver/model/actor/container/monster/OverhitState;
  #27 = Utf8               getOverhitState
  #28 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/OverhitState;
  #29 = Methodref          #30.#31        // ext/mods/gameserver/model/actor/container/monster/OverhitState.test:(Lext/mods/gameserver/model/actor/Creature;D)V
  #30 = Class              #32            // ext/mods/gameserver/model/actor/container/monster/OverhitState
  #31 = NameAndType        #33:#34        // test:(Lext/mods/gameserver/model/actor/Creature;D)V
  #32 = Utf8               ext/mods/gameserver/model/actor/container/monster/OverhitState
  #33 = Utf8               test
  #34 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
  #35 = Methodref          #2.#9          // ext/mods/gameserver/model/actor/status/NpcStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
  #36 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;)V
  #37 = Utf8               Code
  #38 = Utf8               LineNumberTable
  #39 = Utf8               LocalVariableTable
  #40 = Utf8               this
  #41 = Utf8               Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #42 = Utf8               actor
  #43 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #44 = Utf8               (DLext/mods/gameserver/model/actor/Creature;)V
  #45 = Utf8               value
  #46 = Utf8               D
  #47 = Utf8               attacker
  #48 = Utf8               monster
  #49 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #50 = Utf8               awake
  #51 = Utf8               Z
  #52 = Utf8               isDOT
  #53 = Utf8               isHpConsumption
  #54 = Utf8               StackMapTable
  #55 = Utf8               Signature
  #56 = Utf8               Lext/mods/gameserver/model/actor/status/NpcStatus<Lext/mods/gameserver/model/actor/Attackable;>;
  #57 = Utf8               SourceFile
  #58 = Utf8               AttackableStatus.java
{
  public ext.mods.gameserver.model.actor.status.AttackableStatus(ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/status/NpcStatus."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
         5: return
      LineNumberTable:
        line 28: 0
        line 29: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/AttackableStatus;
            0       6     1 actor   Lext/mods/gameserver/model/actor/Attackable;

  public final void reduceHp(double, ext.mods.gameserver.model.actor.Creature);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=4, args_size=3
         0: aload_0
         1: dload_1
         2: aload_3
         3: iconst_1
         4: iconst_0
         5: iconst_0
         6: invokevirtual #7                  // Method reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
         9: return
      LineNumberTable:
        line 34: 0
        line 35: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/status/AttackableStatus;
            0      10     1 value   D
            0      10     3 attacker   Lext/mods/gameserver/model/actor/Creature;

  public final void reduceHp(double, ext.mods.gameserver.model.actor.Creature, boolean, boolean, boolean);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;ZZZ)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=9, args_size=6
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/Attackable
         7: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Attackable.isDead:()Z
        10: ifeq          14
        13: return
        14: aload_0
        15: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        18: astore        8
        20: aload         8
        22: instanceof    #23                 // class ext/mods/gameserver/model/actor/instance/Monster
        25: ifeq          45
        28: aload         8
        30: checkcast     #23                 // class ext/mods/gameserver/model/actor/instance/Monster
        33: astore        7
        35: aload         7
        37: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/instance/Monster.getOverhitState:()Lext/mods/gameserver/model/actor/container/monster/OverhitState;
        40: aload_3
        41: dload_1
        42: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/container/monster/OverhitState.test:(Lext/mods/gameserver/model/actor/Creature;D)V
        45: aload_0
        46: dload_1
        47: aload_3
        48: iload         4
        50: iload         5
        52: iload         6
        54: invokespecial #35                 // Method ext/mods/gameserver/model/actor/status/NpcStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
        57: return
      LineNumberTable:
        line 40: 0
        line 41: 13
        line 43: 14
        line 44: 35
        line 46: 45
        line 47: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      10     7 monster   Lext/mods/gameserver/model/actor/instance/Monster;
            0      58     0  this   Lext/mods/gameserver/model/actor/status/AttackableStatus;
            0      58     1 value   D
            0      58     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      58     4 awake   Z
            0      58     5 isDOT   Z
            0      58     6 isHpConsumption   Z
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 30 /* same */
}
Signature: #56                          // Lext/mods/gameserver/model/actor/status/NpcStatus<Lext/mods/gameserver/model/actor/Attackable;>;
SourceFile: "AttackableStatus.java"
