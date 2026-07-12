// Bytecode for: ext.mods.gameserver.model.actor.instance.SiegeGuard
// File: ext\mods\gameserver\model\actor\instance\SiegeGuard.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/SiegeGuard.class
  Last modified 9 de jul de 2026; size 4157 bytes
  MD5 checksum 398f44285f59469692559804ea685854
  Compiled from "SiegeGuard.java"
public final class ext.mods.gameserver.model.actor.instance.SiegeGuard extends ext.mods.gameserver.model.actor.Attackable
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/model/actor/instance/SiegeGuard
  super_class: #2                         // ext/mods/gameserver/model/actor/Attackable
  interfaces: 0, fields: 0, methods: 7, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Attackable."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Attackable
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Attackable
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #2.#8         // ext/mods/gameserver/model/actor/Attackable.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
    #8 = NameAndType        #9:#10        // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
    #9 = Utf8               isAttackableBy
   #10 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #11 = Methodref          #12.#13       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #12 = Class              #14           // ext/mods/gameserver/model/actor/Creature
   #13 = NameAndType        #15:#16       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #14 = Utf8               ext/mods/gameserver/model/actor/Creature
   #15 = Utf8               getActingPlayer
   #16 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/actor/instance/SiegeGuard.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #18 = Class              #20           // ext/mods/gameserver/model/actor/instance/SiegeGuard
   #19 = NameAndType        #21:#22       // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #20 = Utf8               ext/mods/gameserver/model/actor/instance/SiegeGuard
   #21 = Utf8               getCastle
   #22 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #24 = Class              #26           // ext/mods/gameserver/model/residence/castle/Castle
   #25 = NameAndType        #27:#28       // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #26 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #27 = Utf8               getSiege
   #28 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #30 = Class              #32           // ext/mods/gameserver/model/residence/castle/Siege
   #31 = NameAndType        #33:#34       // isInProgress:()Z
   #32 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #33 = Utf8               isInProgress
   #34 = Utf8               ()Z
   #35 = Methodref          #36.#37       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #36 = Class              #38           // ext/mods/gameserver/model/actor/Player
   #37 = NameAndType        #39:#40       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #38 = Utf8               ext/mods/gameserver/model/actor/Player
   #39 = Utf8               getClan
   #40 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #41 = Class              #42           // ext/mods/gameserver/enums/SiegeSide
   #42 = Utf8               ext/mods/gameserver/enums/SiegeSide
   #43 = Fieldref           #41.#44       // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #44 = NameAndType        #45:#46       // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #45 = Utf8               ATTACKER
   #46 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
   #47 = Methodref          #30.#48       // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #48 = NameAndType        #49:#50       // checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #49 = Utf8               checkSides
   #50 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #51 = Methodref          #18.#52       // ext/mods/gameserver/model/actor/instance/SiegeGuard.getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #52 = NameAndType        #53:#54       // getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #53 = Utf8               getSiegableHall
   #54 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #55 = Methodref          #56.#57       // ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
   #56 = Class              #58           // ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #57 = NameAndType        #59:#34       // isInSiege:()Z
   #58 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #59 = Utf8               isInSiege
   #60 = Methodref          #56.#61       // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
   #61 = NameAndType        #27:#62       // getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
   #62 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
   #63 = Methodref          #64.#48       // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
   #64 = Class              #65           // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
   #65 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
   #66 = Methodref          #18.#8        // ext/mods/gameserver/model/actor/instance/SiegeGuard.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #67 = Methodref          #18.#68       // ext/mods/gameserver/model/actor/instance/SiegeGuard.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #68 = NameAndType        #69:#70       // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #69 = Utf8               getSpawnLocation
   #70 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #71 = Methodref          #18.#72       // ext/mods/gameserver/model/actor/instance/SiegeGuard.getDriftRange:()I
   #72 = NameAndType        #73:#74       // getDriftRange:()I
   #73 = Utf8               getDriftRange
   #74 = Utf8               ()I
   #75 = Methodref          #18.#76       // ext/mods/gameserver/model/actor/instance/SiegeGuard.isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #76 = NameAndType        #77:#78       // isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #77 = Utf8               isIn2DRadius
   #78 = Utf8               (Lext/mods/gameserver/model/location/Location;I)Z
   #79 = Methodref          #18.#80       // ext/mods/gameserver/model/actor/instance/SiegeGuard.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #80 = NameAndType        #81:#82       // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #81 = Utf8               getAI
   #82 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #84 = Class              #86           // ext/mods/gameserver/model/actor/ai/type/AttackableAI
   #85 = NameAndType        #87:#88       // getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #86 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
   #87 = Utf8               getAggroList
   #88 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #89 = Methodref          #90.#91       // ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
   #90 = Class              #92           // ext/mods/gameserver/model/actor/container/attackable/AggroList
   #91 = NameAndType        #93:#94       // cleanAllHate:()V
   #92 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
   #93 = Utf8               cleanAllHate
   #94 = Utf8               ()V
   #95 = Methodref          #18.#96       // ext/mods/gameserver/model/actor/instance/SiegeGuard.forceRunStance:()V
   #96 = NameAndType        #97:#94       // forceRunStance:()V
   #97 = Utf8               forceRunStance
   #98 = Methodref          #18.#99       // ext/mods/gameserver/model/actor/instance/SiegeGuard.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #99 = NameAndType        #100:#101     // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #100 = Utf8               getMove
  #101 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #102 = Methodref          #103.#104     // ext/mods/gameserver/model/actor/move/CreatureMove.getGeoPathFailCount:()I
  #103 = Class              #105          // ext/mods/gameserver/model/actor/move/CreatureMove
  #104 = NameAndType        #106:#74      // getGeoPathFailCount:()I
  #105 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
  #106 = Utf8               getGeoPathFailCount
  #107 = Methodref          #18.#108      // ext/mods/gameserver/model/actor/instance/SiegeGuard.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #108 = NameAndType        #109:#110     // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #109 = Utf8               teleportTo
  #110 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #111 = Double             1000000.0d
  #113 = Methodref          #84.#114      // ext/mods/gameserver/model/actor/ai/type/AttackableAI.addMoveToDesire:(Lext/mods/gameserver/model/location/Location;D)V
  #114 = NameAndType        #115:#116     // addMoveToDesire:(Lext/mods/gameserver/model/location/Location;D)V
  #115 = Utf8               addMoveToDesire
  #116 = Utf8               (Lext/mods/gameserver/model/location/Location;D)V
  #117 = Methodref          #36.#118      // ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
  #118 = NameAndType        #119:#34      // isAlikeDead:()Z
  #119 = Utf8               isAlikeDead
  #120 = Methodref          #36.#121      // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #121 = NameAndType        #122:#123     // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #122 = Utf8               getAppearance
  #123 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #124 = Methodref          #125.#126     // ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
  #125 = Class              #127          // ext/mods/gameserver/model/actor/container/player/Appearance
  #126 = NameAndType        #128:#34      // isVisible:()Z
  #127 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
  #128 = Utf8               isVisible
  #129 = Methodref          #36.#130      // ext/mods/gameserver/model/actor/Player.isSilentMoving:()Z
  #130 = NameAndType        #131:#34      // isSilentMoving:()Z
  #131 = Utf8               isSilentMoving
  #132 = Methodref          #18.#133      // ext/mods/gameserver/model/actor/instance/SiegeGuard.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #133 = NameAndType        #134:#135     // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #134 = Utf8               isIn3DRadius
  #135 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #136 = Methodref          #12.#8        // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #137 = Methodref          #138.#139     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #138 = Class              #140          // ext/mods/gameserver/geoengine/GeoEngine
  #139 = NameAndType        #141:#142     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #140 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #141 = Utf8               getInstance
  #142 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #143 = Methodref          #138.#144     // ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #144 = NameAndType        #145:#146     // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #145 = Utf8               canSeeTarget
  #146 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #147 = Utf8               Code
  #148 = Utf8               LineNumberTable
  #149 = Utf8               LocalVariableTable
  #150 = Utf8               this
  #151 = Utf8               Lext/mods/gameserver/model/actor/instance/SiegeGuard;
  #152 = Utf8               objectId
  #153 = Utf8               I
  #154 = Utf8               template
  #155 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #156 = Utf8               attacker
  #157 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #158 = Utf8               player
  #159 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #160 = Utf8               StackMapTable
  #161 = Utf8               isAttackableWithoutForceBy
  #162 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
  #163 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #164 = Utf8               returnHome
  #165 = Utf8               isGuard
  #166 = Utf8               canAutoAttack
  #167 = Utf8               target
  #168 = Utf8               SourceFile
  #169 = Utf8               SiegeGuard.java
{
  public ext.mods.gameserver.model.actor.instance.SiegeGuard(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Attackable."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 35: 0
        line 36: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/SiegeGuard;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isAttackableBy(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #7                  // Method ext/mods/gameserver/model/actor/Attackable.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_1
        11: invokevirtual #11                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        14: astore_2
        15: aload_2
        16: ifnonnull     21
        19: iconst_0
        20: ireturn
        21: aload_0
        22: invokevirtual #17                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        25: ifnull        66
        28: aload_0
        29: invokevirtual #17                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        32: invokevirtual #23                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        35: invokevirtual #29                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        38: ifeq          66
        41: aload_0
        42: invokevirtual #17                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        45: invokevirtual #23                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        48: aload_2
        49: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        52: iconst_1
        53: anewarray     #41                 // class ext/mods/gameserver/enums/SiegeSide
        56: dup
        57: iconst_0
        58: getstatic     #43                 // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        61: aastore
        62: invokevirtual #47                 // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
        65: ireturn
        66: aload_0
        67: invokevirtual #51                 // Method getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        70: ifnull        108
        73: aload_0
        74: invokevirtual #51                 // Method getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        77: invokevirtual #55                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
        80: ifeq          108
        83: aload_0
        84: invokevirtual #51                 // Method getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        87: invokevirtual #60                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
        90: aload_2
        91: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        94: iconst_1
        95: anewarray     #41                 // class ext/mods/gameserver/enums/SiegeSide
        98: dup
        99: iconst_0
       100: getstatic     #43                 // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
       103: aastore
       104: invokevirtual #63                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
       107: ireturn
       108: iconst_0
       109: ireturn
      LineNumberTable:
        line 41: 0
        line 42: 8
        line 44: 10
        line 45: 15
        line 46: 19
        line 48: 21
        line 49: 41
        line 51: 66
        line 52: 83
        line 54: 108
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     110     0  this   Lext/mods/gameserver/model/actor/instance/SiegeGuard;
            0     110     1 attacker   Lext/mods/gameserver/model/actor/Creature;
           15      95     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 44 /* same */
        frame_type = 41 /* same */

  public boolean isAttackableWithoutForceBy(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #66                 // Method isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ireturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/SiegeGuard;
            0       6     1 attacker   Lext/mods/gameserver/model/actor/Playable;

  public boolean returnHome();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #67                 // Method getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
         4: ifnull        22
         7: aload_0
         8: aload_0
         9: invokevirtual #67                 // Method getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        12: aload_0
        13: invokevirtual #71                 // Method getDriftRange:()I
        16: invokevirtual #75                 // Method isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
        19: ifeq          24
        22: iconst_0
        23: ireturn
        24: aload_0
        25: invokevirtual #79                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
        28: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
        31: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
        34: aload_0
        35: invokevirtual #95                 // Method forceRunStance:()V
        38: aload_0
        39: invokevirtual #98                 // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        42: invokevirtual #102                // Method ext/mods/gameserver/model/actor/move/CreatureMove.getGeoPathFailCount:()I
        45: bipush        10
        47: if_icmplt     62
        50: aload_0
        51: aload_0
        52: invokevirtual #67                 // Method getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        55: iconst_0
        56: invokevirtual #107                // Method teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
        59: goto          76
        62: aload_0
        63: invokevirtual #79                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
        66: aload_0
        67: invokevirtual #67                 // Method getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        70: ldc2_w        #111                // double 1000000.0d
        73: invokevirtual #113                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.addMoveToDesire:(Lext/mods/gameserver/model/location/Location;D)V
        76: iconst_1
        77: ireturn
      LineNumberTable:
        line 66: 0
        line 67: 22
        line 69: 24
        line 71: 34
        line 73: 38
        line 74: 50
        line 76: 62
        line 78: 76
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      78     0  this   Lext/mods/gameserver/model/actor/instance/SiegeGuard;
      StackMapTable: number_of_entries = 4
        frame_type = 22 /* same */
        frame_type = 1 /* same */
        frame_type = 37 /* same */
        frame_type = 13 /* same */

  public boolean isGuard();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/SiegeGuard;

  public int getDriftRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: bipush        20
         2: ireturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/model/actor/instance/SiegeGuard;

  public boolean canAutoAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #11                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: astore_2
         5: aload_2
         6: ifnull        16
         9: aload_2
        10: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
        13: ifeq          18
        16: iconst_0
        17: ireturn
        18: aload_2
        19: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        22: invokevirtual #124                // Method ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
        25: ifne          30
        28: iconst_0
        29: ireturn
        30: aload_2
        31: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.isSilentMoving:()Z
        34: ifeq          50
        37: aload_0
        38: aload_2
        39: sipush        250
        42: invokevirtual #132                // Method isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        45: ifne          50
        48: iconst_0
        49: ireturn
        50: aload_1
        51: aload_0
        52: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
        55: ifeq          73
        58: invokestatic  #137                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        61: aload_0
        62: aload_1
        63: invokevirtual #143                // Method ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
        66: ifeq          73
        69: iconst_1
        70: goto          74
        73: iconst_0
        74: ireturn
      LineNumberTable:
        line 96: 0
        line 97: 5
        line 98: 16
        line 100: 18
        line 101: 28
        line 103: 30
        line 104: 48
        line 106: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      75     0  this   Lext/mods/gameserver/model/actor/instance/SiegeGuard;
            0      75     1 target   Lext/mods/gameserver/model/actor/Creature;
            5      70     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 1 /* same */
        frame_type = 11 /* same */
        frame_type = 19 /* same */
        frame_type = 22 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "SiegeGuard.java"
