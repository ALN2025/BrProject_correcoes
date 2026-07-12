// Bytecode for: ext.mods.gameserver.model.actor.instance.FlameTower
// File: ext\mods\gameserver\model\actor\instance\FlameTower.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/FlameTower.class
  Last modified 9 de jul de 2026; size 5036 bytes
  MD5 checksum 371c24a4f2d7e372013e18278e9f9640
  Compiled from "FlameTower.java"
public class ext.mods.gameserver.model.actor.instance.FlameTower extends ext.mods.gameserver.model.actor.Npc
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/FlameTower
  super_class: #2                         // ext/mods/gameserver/model/actor/Npc
  interfaces: 0, fields: 2, methods: 10, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Npc."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Npc
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Npc
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/instance/FlameTower.enableZones:(Z)V
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/FlameTower
    #9 = NameAndType        #11:#12       // enableZones:(Z)V
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/FlameTower
   #11 = Utf8               enableZones
   #12 = Utf8               (Z)V
   #13 = Methodref          #2.#14        // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
   #14 = NameAndType        #15:#16       // deleteMe:()V
   #15 = Utf8               deleteMe
   #16 = Utf8               ()V
   #17 = Methodref          #2.#18        // ext/mods/gameserver/model/actor/Npc.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #18 = NameAndType        #19:#20       // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #19 = Utf8               isAttackableBy
   #20 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #21 = Class              #22           // ext/mods/gameserver/model/actor/Playable
   #22 = Utf8               ext/mods/gameserver/model/actor/Playable
   #23 = Methodref          #8.#24        // ext/mods/gameserver/model/actor/instance/FlameTower.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #24 = NameAndType        #25:#26       // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #25 = Utf8               getCastle
   #26 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #28 = Class              #30           // ext/mods/gameserver/model/residence/castle/Castle
   #29 = NameAndType        #31:#32       // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #30 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #31 = Utf8               getSiege
   #32 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #34 = Class              #36           // ext/mods/gameserver/model/residence/castle/Siege
   #35 = NameAndType        #37:#38       // isInProgress:()Z
   #36 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #37 = Utf8               isInProgress
   #38 = Utf8               ()Z
   #39 = Methodref          #8.#40        // ext/mods/gameserver/model/actor/instance/FlameTower.getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #40 = NameAndType        #41:#42       // getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #41 = Utf8               getPolymorphTemplate
   #42 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #44 = Class              #46           // ext/mods/gameserver/model/actor/Creature
   #45 = NameAndType        #47:#48       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #46 = Utf8               ext/mods/gameserver/model/actor/Creature
   #47 = Utf8               getActingPlayer
   #48 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #49 = Methodref          #50.#51       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #50 = Class              #52           // ext/mods/gameserver/model/actor/Player
   #51 = NameAndType        #53:#54       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #52 = Utf8               ext/mods/gameserver/model/actor/Player
   #53 = Utf8               getClan
   #54 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #55 = Class              #56           // ext/mods/gameserver/enums/SiegeSide
   #56 = Utf8               ext/mods/gameserver/enums/SiegeSide
   #57 = Fieldref           #55.#58       // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #58 = NameAndType        #59:#60       // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #59 = Utf8               ATTACKER
   #60 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
   #61 = Methodref          #34.#62       // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #62 = NameAndType        #63:#64       // checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #63 = Utf8               checkSides
   #64 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #65 = Methodref          #8.#18        // ext/mods/gameserver/model/actor/instance/FlameTower.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #66 = Methodref          #2.#67        // ext/mods/gameserver/model/actor/Npc.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #67 = NameAndType        #68:#69       // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #68 = Utf8               reduceCurrentHp
   #69 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #70 = Methodref          #8.#71        // ext/mods/gameserver/model/actor/instance/FlameTower.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #71 = NameAndType        #72:#73       // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #72 = Utf8               getStatus
   #73 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #74 = Methodref          #75.#76       // ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
   #75 = Class              #77           // ext/mods/gameserver/model/actor/status/NpcStatus
   #76 = NameAndType        #78:#79       // getHp:()D
   #77 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
   #78 = Utf8               getHp
   #79 = Utf8               ()D
   #80 = Methodref          #8.#81        // ext/mods/gameserver/model/actor/instance/FlameTower.unpolymorph:()V
   #81 = NameAndType        #82:#16       // unpolymorph:()V
   #82 = Utf8               unpolymorph
   #83 = Fieldref           #8.#84        // ext/mods/gameserver/model/actor/instance/FlameTower._zoneList:Ljava/util/List;
   #84 = NameAndType        #85:#86       // _zoneList:Ljava/util/List;
   #85 = Utf8               _zoneList
   #86 = Utf8               Ljava/util/List;
   #87 = Fieldref           #8.#88        // ext/mods/gameserver/model/actor/instance/FlameTower._upgradeLevel:I
   #88 = NameAndType        #89:#90       // _upgradeLevel:I
   #89 = Utf8               _upgradeLevel
   #90 = Utf8               I
   #91 = Fieldref           #92.#93       // ext/mods/gameserver/network/SystemMessageId.A_TRAP_DEVICE_HAS_BEEN_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
   #92 = Class              #94           // ext/mods/gameserver/network/SystemMessageId
   #93 = NameAndType        #95:#96       // A_TRAP_DEVICE_HAS_BEEN_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
   #94 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #95 = Utf8               A_TRAP_DEVICE_HAS_BEEN_STOPPED
   #96 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #97 = Fieldref           #55.#98       // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #98 = NameAndType        #99:#60       // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
   #99 = Utf8               DEFENDER
  #100 = Methodref          #34.#101      // ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
  #101 = NameAndType        #102:#103     // announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
  #102 = Utf8               announce
  #103 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
  #104 = Class              #105          // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
  #105 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
  #106 = Methodref          #104.#107     // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #107 = NameAndType        #5:#108       // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #108 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #109 = Methodref          #50.#110      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #110 = NameAndType        #111:#112     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #111 = Utf8               sendPacket
  #112 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #113 = Class              #114          // ext/mods/gameserver/network/serverpackets/ServerObjectInfo
  #114 = Utf8               ext/mods/gameserver/network/serverpackets/ServerObjectInfo
  #115 = Methodref          #113.#116     // ext/mods/gameserver/network/serverpackets/ServerObjectInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #116 = NameAndType        #5:#117       // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #117 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #118 = Methodref          #119.#120     // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #119 = Class              #121          // ext/mods/gameserver/data/manager/ZoneManager
  #120 = NameAndType        #122:#123     // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #121 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
  #122 = Utf8               getInstance
  #123 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
  #124 = InterfaceMethodref #125.#126     // java/util/List.get:(I)Ljava/lang/Object;
  #125 = Class              #127          // java/util/List
  #126 = NameAndType        #128:#129     // get:(I)Ljava/lang/Object;
  #127 = Utf8               java/util/List
  #128 = Utf8               get
  #129 = Utf8               (I)Ljava/lang/Object;
  #130 = Class              #131          // java/lang/Integer
  #131 = Utf8               java/lang/Integer
  #132 = Methodref          #130.#133     // java/lang/Integer.intValue:()I
  #133 = NameAndType        #134:#135     // intValue:()I
  #134 = Utf8               intValue
  #135 = Utf8               ()I
  #136 = Methodref          #119.#137     // ext/mods/gameserver/data/manager/ZoneManager.getZoneById:(I)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #137 = NameAndType        #138:#139     // getZoneById:(I)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #138 = Utf8               getZoneById
  #139 = Utf8               (I)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #140 = Class              #141          // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType
  #141 = Utf8               ext/mods/gameserver/model/zone/type/subtype/CastleZoneType
  #142 = Methodref          #140.#143     // ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.setEnabled:(Z)V
  #143 = NameAndType        #144:#12      // setEnabled:(Z)V
  #144 = Utf8               setEnabled
  #145 = Utf8               Signature
  #146 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #147 = Utf8               Code
  #148 = Utf8               LineNumberTable
  #149 = Utf8               LocalVariableTable
  #150 = Utf8               this
  #151 = Utf8               Lext/mods/gameserver/model/actor/instance/FlameTower;
  #152 = Utf8               objectId
  #153 = Utf8               template
  #154 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #155 = Utf8               attacker
  #156 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #157 = Utf8               StackMapTable
  #158 = Utf8               isAttackableWithoutForceBy
  #159 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
  #160 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #161 = Utf8               onInteract
  #162 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #163 = Utf8               player
  #164 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #165 = Utf8               damage
  #166 = Utf8               D
  #167 = Utf8               awake
  #168 = Utf8               Z
  #169 = Utf8               isDOT
  #170 = Utf8               skill
  #171 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #172 = Utf8               sendInfo
  #173 = Utf8               czt
  #174 = Utf8               Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;
  #175 = Utf8               zone
  #176 = Utf8               Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #177 = Utf8               i
  #178 = Utf8               maxIndex
  #179 = Utf8               state
  #180 = Utf8               setUpgradeLevel
  #181 = Utf8               (I)V
  #182 = Utf8               level
  #183 = Utf8               setZoneList
  #184 = Utf8               (Ljava/util/List;)V
  #185 = Utf8               list
  #186 = Utf8               LocalVariableTypeTable
  #187 = Utf8               (Ljava/util/List<Ljava/lang/Integer;>;)V
  #188 = Utf8               SourceFile
  #189 = Utf8               FlameTower.java
  #190 = Utf8               InnerClasses
  #191 = Class              #192          // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #192 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #193 = Utf8               NpcInfo
{
  public ext.mods.gameserver.model.actor.instance.FlameTower(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 43: 0
        line 44: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/FlameTower;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void deleteMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: invokevirtual #7                  // Method enableZones:(Z)V
         5: aload_0
         6: invokespecial #13                 // Method ext/mods/gameserver/model/actor/Npc.deleteMe:()V
         9: return
      LineNumberTable:
        line 49: 0
        line 51: 5
        line 52: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/instance/FlameTower;

  public boolean isAttackableBy(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #17                 // Method ext/mods/gameserver/model/actor/Npc.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_1
        11: instanceof    #21                 // class ext/mods/gameserver/model/actor/Playable
        14: ifne          19
        17: iconst_0
        18: ireturn
        19: aload_0
        20: invokevirtual #23                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        23: ifnull        82
        26: aload_0
        27: invokevirtual #23                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        30: invokevirtual #27                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        33: invokevirtual #33                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        36: ifeq          82
        39: aload_0
        40: invokevirtual #39                 // Method getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        43: ifnull        80
        46: aload_0
        47: invokevirtual #23                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        50: invokevirtual #27                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        53: aload_1
        54: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        57: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        60: iconst_1
        61: anewarray     #55                 // class ext/mods/gameserver/enums/SiegeSide
        64: dup
        65: iconst_0
        66: getstatic     #57                 // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        69: aastore
        70: invokevirtual #61                 // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
        73: ifeq          80
        76: iconst_1
        77: goto          81
        80: iconst_0
        81: ireturn
        82: iconst_0
        83: ireturn
      LineNumberTable:
        line 57: 0
        line 58: 8
        line 60: 10
        line 61: 17
        line 63: 19
        line 64: 39
        line 66: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      84     0  this   Lext/mods/gameserver/model/actor/instance/FlameTower;
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
         2: invokevirtual #65                 // Method isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ireturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/FlameTower;
            0       6     1 attacker   Lext/mods/gameserver/model/actor/Playable;

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 78: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/instance/FlameTower;
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
         9: invokespecial #66                 // Method ext/mods/gameserver/model/actor/Npc.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
        12: aload_0
        13: invokevirtual #23                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        16: ifnull        97
        19: aload_0
        20: invokevirtual #23                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        23: invokevirtual #27                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        26: invokevirtual #33                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        29: ifeq          97
        32: aload_0
        33: invokevirtual #39                 // Method getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        36: ifnull        97
        39: aload_0
        40: invokevirtual #70                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        43: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
        46: dconst_1
        47: dcmpg
        48: ifgt          97
        51: aload_0
        52: invokevirtual #80                 // Method unpolymorph:()V
        55: aload_0
        56: iconst_0
        57: invokevirtual #7                  // Method enableZones:(Z)V
        60: aload_0
        61: getfield      #83                 // Field _zoneList:Ljava/util/List;
        64: ifnull        97
        67: aload_0
        68: getfield      #87                 // Field _upgradeLevel:I
        71: ifeq          97
        74: aload_0
        75: invokevirtual #23                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        78: invokevirtual #27                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        81: getstatic     #91                 // Field ext/mods/gameserver/network/SystemMessageId.A_TRAP_DEVICE_HAS_BEEN_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
        84: iconst_1
        85: anewarray     #55                 // class ext/mods/gameserver/enums/SiegeSide
        88: dup
        89: iconst_0
        90: getstatic     #97                 // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
        93: aastore
        94: invokevirtual #100                // Method ext/mods/gameserver/model/residence/castle/Siege.announce:(Lext/mods/gameserver/network/SystemMessageId;[Lext/mods/gameserver/enums/SiegeSide;)V
        97: return
      LineNumberTable:
        line 83: 0
        line 85: 12
        line 87: 51
        line 88: 55
        line 90: 60
        line 91: 74
        line 93: 97
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      98     0  this   Lext/mods/gameserver/model/actor/instance/FlameTower;
            0      98     1 damage   D
            0      98     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      98     4 awake   Z
            0      98     5 isDOT   Z
            0      98     6 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 1
        frame_type = 251 /* same_frame_extended */
          offset_delta = 97

  public void sendInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #39                 // Method getPolymorphTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: ifnull        23
         7: aload_1
         8: new           #104                // class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
        11: dup
        12: aload_0
        13: aload_1
        14: invokespecial #106                // Method ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
        17: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        20: goto          36
        23: aload_1
        24: new           #113                // class ext/mods/gameserver/network/serverpackets/ServerObjectInfo
        27: dup
        28: aload_0
        29: aload_1
        30: invokespecial #115                // Method ext/mods/gameserver/network/serverpackets/ServerObjectInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
        33: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        36: return
      LineNumberTable:
        line 98: 0
        line 99: 7
        line 101: 23
        line 102: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/model/actor/instance/FlameTower;
            0      37     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 23 /* same */
        frame_type = 12 /* same */

  public final void enableZones(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=6, args_size=2
         0: aload_0
         1: getfield      #83                 // Field _zoneList:Ljava/util/List;
         4: ifnull        79
         7: aload_0
         8: getfield      #87                 // Field _upgradeLevel:I
        11: ifeq          79
        14: aload_0
        15: getfield      #87                 // Field _upgradeLevel:I
        18: iconst_2
        19: imul
        20: istore_2
        21: iconst_0
        22: istore_3
        23: iload_3
        24: iload_2
        25: if_icmpge     79
        28: invokestatic  #118                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
        31: aload_0
        32: getfield      #83                 // Field _zoneList:Ljava/util/List;
        35: iload_3
        36: invokeinterface #124,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        41: checkcast     #130                // class java/lang/Integer
        44: invokevirtual #132                // Method java/lang/Integer.intValue:()I
        47: invokevirtual #136                // Method ext/mods/gameserver/data/manager/ZoneManager.getZoneById:(I)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
        50: astore        4
        52: aload         4
        54: instanceof    #140                // class ext/mods/gameserver/model/zone/type/subtype/CastleZoneType
        57: ifeq          73
        60: aload         4
        62: checkcast     #140                // class ext/mods/gameserver/model/zone/type/subtype/CastleZoneType
        65: astore        5
        67: aload         5
        69: iload_1
        70: invokevirtual #142                // Method ext/mods/gameserver/model/zone/type/subtype/CastleZoneType.setEnabled:(Z)V
        73: iinc          3, 1
        76: goto          23
        79: return
      LineNumberTable:
        line 106: 0
        line 108: 14
        line 109: 21
        line 111: 28
        line 112: 52
        line 113: 67
        line 109: 73
        line 116: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           67       6     5   czt   Lext/mods/gameserver/model/zone/type/subtype/CastleZoneType;
           52      21     4  zone   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
           23      56     3     i   I
           21      58     2 maxIndex   I
            0      80     0  this   Lext/mods/gameserver/model/actor/instance/FlameTower;
            0      80     1 state   Z
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ int, int ]
        frame_type = 49 /* same */
        frame_type = 249 /* chop */
          offset_delta = 5

  public final void setUpgradeLevel(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #87                 // Field _upgradeLevel:I
         5: return
      LineNumberTable:
        line 120: 0
        line 121: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/FlameTower;
            0       6     1 level   I

  public final void setZoneList(java.util.List<java.lang.Integer>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #83                 // Field _zoneList:Ljava/util/List;
         5: aload_0
         6: iconst_1
         7: invokevirtual #7                  // Method enableZones:(Z)V
        10: return
      LineNumberTable:
        line 125: 0
        line 127: 5
        line 128: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/instance/FlameTower;
            0      11     1  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     1  list   Ljava/util/List<Ljava/lang/Integer;>;
    Signature: #187                         // (Ljava/util/List<Ljava/lang/Integer;>;)V
}
SourceFile: "FlameTower.java"
InnerClasses:
  public static #193= #104 of #191;       // NpcInfo=class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo of class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
