// Bytecode for: ext.mods.gameserver.model.actor.status.NpcStatus
// File: ext\mods\gameserver\model\actor\status\NpcStatus.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/status/NpcStatus.class
  Last modified 9 de jul de 2026; size 2286 bytes
  MD5 checksum 319144a23e075598aa60b1242a70a005
  Compiled from "NpcStatus.java"
public class ext.mods.gameserver.model.actor.status.NpcStatus<T extends ext.mods.gameserver.model.actor.Npc> extends ext.mods.gameserver.model.actor.status.CreatureStatus<T>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/status/NpcStatus
  super_class: #2                         // ext/mods/gameserver/model/actor/status/CreatureStatus
  interfaces: 0, fields: 0, methods: 5, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/status/CreatureStatus."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/status/CreatureStatus
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/status/NpcStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
   #8 = Class              #10            // ext/mods/gameserver/model/actor/status/NpcStatus
   #9 = NameAndType        #11:#12        // reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
  #10 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
  #11 = Utf8               reduceHp
  #12 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZZ)V
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/actor/status/NpcStatus._actor:Lext/mods/gameserver/model/actor/Creature;
  #14 = NameAndType        #15:#16        // _actor:Lext/mods/gameserver/model/actor/Creature;
  #15 = Utf8               _actor
  #16 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #17 = Class              #18            // ext/mods/gameserver/model/actor/Npc
  #18 = Utf8               ext/mods/gameserver/model/actor/Npc
  #19 = Methodref          #17.#20        // ext/mods/gameserver/model/actor/Npc.isDead:()Z
  #20 = NameAndType        #21:#22        // isDead:()Z
  #21 = Utf8               isDead
  #22 = Utf8               ()Z
  #23 = Methodref          #24.#25        // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #24 = Class              #26            // ext/mods/gameserver/model/actor/Creature
  #25 = NameAndType        #27:#28        // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #26 = Utf8               ext/mods/gameserver/model/actor/Creature
  #27 = Utf8               getActingPlayer
  #28 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #29 = Methodref          #30.#31        // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
  #30 = Class              #32            // ext/mods/gameserver/model/actor/Player
  #31 = NameAndType        #33:#22        // isInDuel:()Z
  #32 = Utf8               ext/mods/gameserver/model/actor/Player
  #33 = Utf8               isInDuel
  #34 = Fieldref           #35.#36        // ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
  #35 = Class              #37            // ext/mods/gameserver/enums/duels/DuelState
  #36 = NameAndType        #38:#39        // INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
  #37 = Utf8               ext/mods/gameserver/enums/duels/DuelState
  #38 = Utf8               INTERRUPTED
  #39 = Utf8               Lext/mods/gameserver/enums/duels/DuelState;
  #40 = Methodref          #30.#41        // ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
  #41 = NameAndType        #42:#43        // setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
  #42 = Utf8               setDuelState
  #43 = Utf8               (Lext/mods/gameserver/enums/duels/DuelState;)V
  #44 = Methodref          #2.#9          // ext/mods/gameserver/model/actor/status/CreatureStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
  #45 = Methodref          #17.#46        // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #46 = NameAndType        #47:#48        // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #47 = Utf8               getTemplate
  #48 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #49 = Methodref          #50.#51        // ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
  #50 = Class              #52            // ext/mods/gameserver/model/actor/template/NpcTemplate
  #51 = NameAndType        #53:#54        // getLevel:()B
  #52 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #53 = Utf8               getLevel
  #54 = Utf8               ()B
  #55 = Methodref          #50.#56        // ext/mods/gameserver/model/actor/template/NpcTemplate.getBaseAttackRange:()I
  #56 = NameAndType        #57:#58        // getBaseAttackRange:()I
  #57 = Utf8               getBaseAttackRange
  #58 = Utf8               ()I
  #59 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #60 = Utf8               Code
  #61 = Utf8               LineNumberTable
  #62 = Utf8               LocalVariableTable
  #63 = Utf8               this
  #64 = Utf8               Lext/mods/gameserver/model/actor/status/NpcStatus;
  #65 = Utf8               actor
  #66 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #67 = Utf8               LocalVariableTypeTable
  #68 = Utf8               Lext/mods/gameserver/model/actor/status/NpcStatus<TT;>;
  #69 = Utf8               TT;
  #70 = Utf8               Signature
  #71 = Utf8               (TT;)V
  #72 = Utf8               (DLext/mods/gameserver/model/actor/Creature;)V
  #73 = Utf8               value
  #74 = Utf8               D
  #75 = Utf8               attacker
  #76 = Utf8               attackerPlayer
  #77 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #78 = Utf8               awake
  #79 = Utf8               Z
  #80 = Utf8               isDOT
  #81 = Utf8               isHpConsumption
  #82 = Utf8               StackMapTable
  #83 = Utf8               getPhysicalAttackRange
  #84 = Utf8               <T:Lext/mods/gameserver/model/actor/Npc;>Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
  #85 = Utf8               SourceFile
  #86 = Utf8               NpcStatus.java
{
  public ext.mods.gameserver.model.actor.status.NpcStatus(T);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/status/CreatureStatus."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         5: return
      LineNumberTable:
        line 29: 0
        line 30: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/NpcStatus;
            0       6     1 actor   Lext/mods/gameserver/model/actor/Npc;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/NpcStatus<TT;>;
            0       6     1 actor   TT;
    Signature: #71                          // (TT;)V

  public void reduceHp(double, ext.mods.gameserver.model.actor.Creature);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
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
        line 35: 0
        line 36: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/status/NpcStatus;
            0      10     1 value   D
            0      10     3 attacker   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/status/NpcStatus<TT;>;

  public void reduceHp(double, ext.mods.gameserver.model.actor.Creature, boolean, boolean, boolean);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;ZZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=8, args_size=6
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/Npc
         7: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Npc.isDead:()Z
        10: ifeq          14
        13: return
        14: aload_3
        15: ifnull        45
        18: aload_3
        19: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        22: astore        7
        24: aload         7
        26: ifnull        45
        29: aload         7
        31: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
        34: ifeq          45
        37: aload         7
        39: getstatic     #34                 // Field ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
        42: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
        45: aload_0
        46: dload_1
        47: aload_3
        48: iload         4
        50: iload         5
        52: iload         6
        54: invokespecial #44                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
        57: return
      LineNumberTable:
        line 41: 0
        line 42: 13
        line 44: 14
        line 46: 18
        line 47: 24
        line 48: 37
        line 51: 45
        line 52: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24      21     7 attackerPlayer   Lext/mods/gameserver/model/actor/Player;
            0      58     0  this   Lext/mods/gameserver/model/actor/status/NpcStatus;
            0      58     1 value   D
            0      58     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      58     4 awake   Z
            0      58     5 isDOT   Z
            0      58     6 isHpConsumption   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/actor/status/NpcStatus<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 30 /* same */

  public int getLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/Npc
         7: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        10: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
        13: ireturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/status/NpcStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/status/NpcStatus<TT;>;

  public int getPhysicalAttackRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/Npc
         7: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        10: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getBaseAttackRange:()I
        13: ireturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/status/NpcStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/status/NpcStatus<TT;>;
}
Signature: #84                          // <T:Lext/mods/gameserver/model/actor/Npc;>Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
SourceFile: "NpcStatus.java"
