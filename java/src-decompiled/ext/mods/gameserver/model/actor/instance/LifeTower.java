// Bytecode for: ext.mods.gameserver.model.actor.instance.LifeTower
// File: ext\mods\gameserver\model\actor\instance\LifeTower.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/LifeTower.class
  Last modified 9 de jul de 2026; size 3669 bytes
  MD5 checksum 8c895a84d5d9f804c56abcc00e0c17bc
  Compiled from "LifeTower.java"
public class ext.mods.gameserver.model.actor.instance.LifeTower extends ext.mods.gameserver.model.actor.Npc
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/instance/LifeTower
  super_class: #2                         // ext/mods/gameserver/model/actor/Npc
  interfaces: 0, fields: 0, methods: 6, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Npc."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Npc
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Npc
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #2.#8         // ext/mods/gameserver/model/actor/Npc.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
    #8 = NameAndType        #9:#10        // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
    #9 = Utf8               isAttackableBy
   #10 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #11 = Class              #12           // ext/mods/gameserver/model/actor/Playable
   #12 = Utf8               ext/mods/gameserver/model/actor/Playable
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/instance/LifeTower.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/instance/LifeTower
   #15 = NameAndType        #17:#18       // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #16 = Utf8               ext/mods/gameserver/model/actor/instance/LifeTower
   #17 = Utf8               getCastle
   #18 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #20 = Class              #22           // ext/mods/gameserver/model/residence/castle/Castle
   #21 = NameAndType        #23:#24       // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #22 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #23 = Utf8               getSiege
   #24 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #25 = Methodref          #26.#27       // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #26 = Class              #28           // ext/mods/gameserver/model/residence/castle/Siege
   #27 = NameAndType        #29:#30       // isInProgress:()Z
   #28 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #29 = Utf8               isInProgress
   #30 = Utf8               ()Z
   #31 = Methodref          #14.#32       // ext/mods/gameserver/model/actor/instance/LifeTower.getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #32 = NameAndType        #33:#34       // getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #33 = Utf8               getPolymorphTemplate
   #34 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #35 = Methodref          #36.#37       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #36 = Class              #38           // ext/mods/gameserver/model/actor/Creature
   #37 = NameAndType        #39:#40       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #38 = Utf8               ext/mods/gameserver/model/actor/Creature
   #39 = Utf8               getActingPlayer
   #40 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #41 = Methodref          #42.#43       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #42 = Class              #44           // ext/mods/gameserver/model/actor/Player
   #43 = NameAndType        #45:#46       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #44 = Utf8               ext/mods/gameserver/model/actor/Player
   #45 = Utf8               getClan
   #46 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #47 = Class              #48           // ext/mods/gameserver/enums/SiegeSide
   #48 = Utf8               ext/mods/gameserver/enums/SiegeSide
   #49 = Fieldref           #47.#50       // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #50 = NameAndType        #51:#52       // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #51 = Utf8               ATTACKER
   #52 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
   #53 = Methodref          #26.#54       // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #54 = NameAndType        #55:#56       // checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #55 = Utf8               checkSides
   #56 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #57 = Methodref          #14.#8        // ext/mods/gameserver/model/actor/instance/LifeTower.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #58 = Methodref          #2.#59        // ext/mods/gameserver/model/actor/Npc.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #59 = NameAndType        #60:#61       // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #60 = Utf8               reduceCurrentHp
   #61 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #62 = Methodref          #14.#63       // ext/mods/gameserver/model/actor/instance/LifeTower.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #63 = NameAndType        #64:#65       // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #64 = Utf8               getStatus
   #65 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #66 = Methodref          #67.#68       // ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
   #67 = Class              #69           // ext/mods/gameserver/model/actor/status/NpcStatus
   #68 = NameAndType        #70:#71       // getHp:()D
   #69 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
   #70 = Utf8               getHp
   #71 = Utf8               ()D
   #72 = Methodref          #14.#73       // ext/mods/gameserver/model/actor/instance/LifeTower.unpolymorph:()V
   #73 = NameAndType        #74:#75       // unpolymorph:()V
   #74 = Utf8               unpolymorph
   #75 = Utf8               ()V
   #76 = Methodref          #20.#77       // ext/mods/gameserver/model/residence/castle/Castle.getAliveLifeTowerCount:()I
   #77 = NameAndType        #78:#79       // getAliveLifeTowerCount:()I
   #78 = Utf8               getAliveLifeTowerCount
   #79 = Utf8               ()I
   #80 = Fieldref           #81.#82       // ext/mods/gameserver/network/SystemMessageId.TOWER_DESTROYED_NO_RESURRECTION:Lext/mods/gameserver/network/SystemMessageId;
   #81 = Class              #83           // ext/mods/gameserver/network/SystemMessageId
   #82 = NameAndType        #84:#85       // TOWER_DESTROYED_NO_RESURRECTION:Lext/mods/gameserver/network/SystemMessageId;
   #83 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #84 = Utf8               TOWER_DESTROYED_NO_RESURRECTION
   #85 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #86 = Fieldref           #47.#87       // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #87 = NameAndType        #88:#52       // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #88 = Utf8               DEFENDER
   #89 = Methodref          #26.#90       // ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
   #90 = NameAndType        #91:#92       // announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
   #91 = Utf8               announce
   #92 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
   #93 = Class              #94           // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
   #94 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
   #95 = Methodref          #93.#96       // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #96 = NameAndType        #5:#97        // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #97 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #98 = Methodref          #42.#99       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #99 = NameAndType        #100:#101     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #100 = Utf8               sendPacket
  #101 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #102 = Class              #103          // ext/mods/gameserver/network/serverpackets/ServerObjectInfo
  #103 = Utf8               ext/mods/gameserver/network/serverpackets/ServerObjectInfo
  #104 = Methodref          #102.#105     // ext/mods/gameserver/network/serverpackets/ServerObjectInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #105 = NameAndType        #5:#106       // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #106 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #107 = Utf8               Code
  #108 = Utf8               LineNumberTable
  #109 = Utf8               LocalVariableTable
  #110 = Utf8               this
  #111 = Utf8               Lext/mods/gameserver/model/actor/instance/LifeTower;
  #112 = Utf8               objectId
  #113 = Utf8               I
  #114 = Utf8               template
  #115 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #116 = Utf8               attacker
  #117 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #118 = Utf8               StackMapTable
  #119 = Utf8               isAttackableWithoutForceBy
  #120 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
  #121 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #122 = Utf8               onInteract
  #123 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #124 = Utf8               player
  #125 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #126 = Utf8               damage
  #127 = Utf8               D
  #128 = Utf8               awake
  #129 = Utf8               Z
  #130 = Utf8               isDOT
  #131 = Utf8               skill
  #132 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #133 = Utf8               sendInfo
  #134 = Utf8               SourceFile
  #135 = Utf8               LifeTower.java
  #136 = Utf8               InnerClasses
  #137 = Class              #138          // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #138 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #139 = Utf8               NpcInfo
{
  public ext.mods.gameserver.model.actor.instance.LifeTower(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Npc."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 35: 0
        line 36: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/LifeTower;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isAttackableBy(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #7                  // Method ext/mods/gameserver/model/actor/Npc.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_1
        11: instanceof    #11                 // class ext/mods/gameserver/model/actor/Playable
        14: ifne          19
        17: iconst_0
        18: ireturn
        19: aload_0
        20: invokevirtual #13                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        23: ifnull        82
        26: aload_0
        27: invokevirtual #13                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        30: invokevirtual #19                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        33: invokevirtual #25                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        36: ifeq          82
        39: aload_0
        40: invokevirtual #31                 // Method getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        43: ifnull        80
        46: aload_0
        47: invokevirtual #13                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        50: invokevirtual #19                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        53: aload_1
        54: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        57: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        60: iconst_1
        61: anewarray     #47                 // class ext/mods/gameserver/enums/SiegeSide
        64: dup
        65: iconst_0
        66: getstatic     #49                 // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        69: aastore
        70: invokevirtual #53                 // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
        73: ifeq          80
        76: iconst_1
        77: goto          81
        80: iconst_0
        81: ireturn
        82: iconst_0
        83: ireturn
      LineNumberTable:
        line 41: 0
        line 42: 8
        line 44: 10
        line 45: 17
        line 47: 19
        line 48: 39
        line 50: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      84     0  this   Lext/mods/gameserver/model/actor/instance/LifeTower;
            0      84     1 attacker   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 5
        frame_type = 10 /* same */
        frame_type = 8 /* same */
        frame_type = 60 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */

  public boolean isAttackableWithoutForceBy(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #57                 // Method isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ireturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/LifeTower;
            0       6     1 attacker   Lext/mods/gameserver/model/actor/Playable;

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/instance/LifeTower;
            0       1     1 player   Lext/mods/gameserver/model/actor/Player;

  public void reduceCurrentHp(double, ext.mods.gameserver.model.actor.Creature, boolean, boolean, ext.mods.gameserver.skills.L2Skill);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=6
         0: aload_0
         1: dload_1
         2: aload_3
         3: iload         4
         5: iload         5
         7: aload         6
         9: invokespecial #58                 // Method ext/mods/gameserver/model/actor/Npc.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
        12: aload_0
        13: invokevirtual #13                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        16: ifnull        88
        19: aload_0
        20: invokevirtual #13                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        23: invokevirtual #19                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        26: invokevirtual #25                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        29: ifeq          88
        32: aload_0
        33: invokevirtual #31                 // Method getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        36: ifnull        88
        39: aload_0
        40: invokevirtual #62                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        43: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
        46: dconst_1
        47: dcmpg
        48: ifgt          88
        51: aload_0
        52: invokevirtual #72                 // Method unpolymorph:()V
        55: aload_0
        56: invokevirtual #13                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        59: invokevirtual #76                 // Method ext/mods/gameserver/model/residence/castle/Castle.getAliveLifeTowerCount:()I
        62: ifne          88
        65: aload_0
        66: invokevirtual #13                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        69: invokevirtual #19                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        72: getstatic     #80                 // Field ext/mods/gameserver/network/SystemMessageId.TOWER_DESTROYED_NO_RESURRECTION:Lext/mods/gameserver/network/SystemMessageId;
        75: iconst_1
        76: anewarray     #47                 // class ext/mods/gameserver/enums/SiegeSide
        79: dup
        80: iconst_0
        81: getstatic     #86                 // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
        84: aastore
        85: invokevirtual #89                 // Method ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
        88: return
      LineNumberTable:
        line 67: 0
        line 69: 12
        line 71: 51
        line 73: 55
        line 74: 65
        line 76: 88
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      89     0  this   Lext/mods/gameserver/model/actor/instance/LifeTower;
            0      89     1 damage   D
            0      89     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      89     4 awake   Z
            0      89     5 isDOT   Z
            0      89     6 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 1
        frame_type = 251 /* same_frame_extended */
          offset_delta = 88

  public void sendInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #31                 // Method getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: ifnull        23
         7: aload_1
         8: new           #93                 // class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
        11: dup
        12: aload_0
        13: aload_1
        14: invokespecial #95                 // Method ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
        17: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        20: goto          36
        23: aload_1
        24: new           #102                // class ext/mods/gameserver/network/serverpackets/ServerObjectInfo
        27: dup
        28: aload_0
        29: aload_1
        30: invokespecial #104                // Method ext/mods/gameserver/network/serverpackets/ServerObjectInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
        33: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        36: return
      LineNumberTable:
        line 81: 0
        line 82: 7
        line 84: 23
        line 85: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/model/actor/instance/LifeTower;
            0      37     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 23 /* same */
        frame_type = 12 /* same */
}
SourceFile: "LifeTower.java"
InnerClasses:
  public static #139= #93 of #137;        // NpcInfo=class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo of class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
