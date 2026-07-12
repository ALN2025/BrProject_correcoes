// Bytecode for: ext.mods.gameserver.model.actor.ai.type.AgathionAI
// File: ext\mods\gameserver\model\actor\ai\type\AgathionAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/AgathionAI.class
  Last modified 9 de jul de 2026; size 3911 bytes
  MD5 checksum c1fc7d6c4aeb8faf3ebd24961a0bcdc3
  Compiled from "AgathionAI.java"
public class ext.mods.gameserver.model.actor.ai.type.AgathionAI extends ext.mods.gameserver.model.actor.ai.type.NpcAI<ext.mods.gameserver.model.actor.instance.Agathion>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/ai/type/AgathionAI
  super_class: #2                         // ext/mods/gameserver/model/actor/ai/type/NpcAI
  interfaces: 0, fields: 0, methods: 4, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/ai/type/NpcAI."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/ai/type/NpcAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Npc;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/ai/type/AgathionAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
    #8 = Class              #10           // ext/mods/gameserver/model/actor/ai/type/AgathionAI$1
    #9 = NameAndType        #11:#12       // $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #10 = Utf8               ext/mods/gameserver/model/actor/ai/type/AgathionAI$1
   #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$IntentionType
   #12 = Utf8               [I
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/actor/ai/type/AgathionAI._actor:Lext/mods/gameserver/model/actor/Creature;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/ai/type/AgathionAI
   #15 = NameAndType        #17:#18       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #16 = Utf8               ext/mods/gameserver/model/actor/ai/type/AgathionAI
   #17 = Utf8               _actor
   #18 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #19 = Class              #20           // ext/mods/gameserver/model/actor/instance/Agathion
   #20 = Utf8               ext/mods/gameserver/model/actor/instance/Agathion
   #21 = Methodref          #19.#22       // ext/mods/gameserver/model/actor/instance/Agathion.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #22 = NameAndType        #23:#24       // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #23 = Utf8               getAI
   #24 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #25 = Methodref          #2.#26        // ext/mods/gameserver/model/actor/ai/type/NpcAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #26 = NameAndType        #27:#28       // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #27 = Utf8               getCurrentIntention
   #28 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
   #30 = Class              #32           // ext/mods/gameserver/model/actor/ai/Intention
   #31 = NameAndType        #33:#34       // getType:()Lext/mods/gameserver/enums/IntentionType;
   #32 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
   #33 = Utf8               getType
   #34 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
   #35 = Methodref          #36.#37       // ext/mods/gameserver/enums/IntentionType.ordinal:()I
   #36 = Class              #38           // ext/mods/gameserver/enums/IntentionType
   #37 = NameAndType        #39:#40       // ordinal:()I
   #38 = Utf8               ext/mods/gameserver/enums/IntentionType
   #39 = Utf8               ordinal
   #40 = Utf8               ()I
   #41 = Methodref          #14.#42       // ext/mods/gameserver/model/actor/ai/type/AgathionAI.thinkFollow:()V
   #42 = NameAndType        #43:#44       // thinkFollow:()V
   #43 = Utf8               thinkFollow
   #44 = Utf8               ()V
   #45 = Methodref          #2.#46        // ext/mods/gameserver/model/actor/ai/type/NpcAI.thinkIdle:()V
   #46 = NameAndType        #47:#44       // thinkIdle:()V
   #47 = Utf8               thinkIdle
   #48 = Methodref          #19.#49       // ext/mods/gameserver/model/actor/instance/Agathion.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #49 = NameAndType        #50:#51       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #50 = Utf8               getPlayer
   #51 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #52 = Methodref          #53.#54       // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #53 = Class              #55           // ext/mods/gameserver/model/actor/Player
   #54 = NameAndType        #56:#57       // isOnline:()Z
   #55 = Utf8               ext/mods/gameserver/model/actor/Player
   #56 = Utf8               isOnline
   #57 = Utf8               ()Z
   #58 = Methodref          #19.#59       // ext/mods/gameserver/model/actor/instance/Agathion.deleteMe:()V
   #59 = NameAndType        #60:#44       // deleteMe:()V
   #60 = Utf8               deleteMe
   #61 = Methodref          #19.#62       // ext/mods/gameserver/model/actor/instance/Agathion.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #62 = NameAndType        #63:#64       // distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #63 = Utf8               distance2D
   #64 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
   #65 = Double             1500.0d
   #67 = Methodref          #53.#68       // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
   #68 = NameAndType        #69:#57       // isTeleporting:()Z
   #69 = Utf8               isTeleporting
   #70 = Methodref          #71.#72       // java/lang/Math.random:()D
   #71 = Class              #73           // java/lang/Math
   #72 = NameAndType        #74:#75       // random:()D
   #73 = Utf8               java/lang/Math
   #74 = Utf8               random
   #75 = Utf8               ()D
   #76 = Double             360.0d
   #78 = Methodref          #71.#79       // java/lang/Math.toRadians:(D)D
   #79 = NameAndType        #80:#81       // toRadians:(D)D
   #80 = Utf8               toRadians
   #81 = Utf8               (D)D
   #82 = Methodref          #71.#83       // java/lang/Math.cos:(D)D
   #83 = NameAndType        #84:#81       // cos:(D)D
   #84 = Utf8               cos
   #85 = Double             45.0d
   #87 = Methodref          #71.#88       // java/lang/Math.sin:(D)D
   #88 = NameAndType        #89:#81       // sin:(D)D
   #89 = Utf8               sin
   #90 = Methodref          #53.#91       // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #91 = NameAndType        #92:#93       // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #92 = Utf8               getPosition
   #93 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #94 = Methodref          #95.#96       // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
   #95 = Class              #97           // ext/mods/gameserver/model/location/SpawnLocation
   #96 = NameAndType        #98:#93       // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
   #97 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #98 = Utf8               clone
   #99 = Methodref          #100.#101     // ext/mods/gameserver/model/location/Location.getX:()I
  #100 = Class              #102          // ext/mods/gameserver/model/location/Location
  #101 = NameAndType        #103:#40      // getX:()I
  #102 = Utf8               ext/mods/gameserver/model/location/Location
  #103 = Utf8               getX
  #104 = Methodref          #100.#105     // ext/mods/gameserver/model/location/Location.setX:(I)V
  #105 = NameAndType        #106:#107     // setX:(I)V
  #106 = Utf8               setX
  #107 = Utf8               (I)V
  #108 = Methodref          #100.#109     // ext/mods/gameserver/model/location/Location.getY:()I
  #109 = NameAndType        #110:#40      // getY:()I
  #110 = Utf8               getY
  #111 = Methodref          #100.#112     // ext/mods/gameserver/model/location/Location.setY:(I)V
  #112 = NameAndType        #113:#107     // setY:(I)V
  #113 = Utf8               setY
  #114 = Methodref          #19.#115      // ext/mods/gameserver/model/actor/instance/Agathion.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #115 = NameAndType        #116:#117     // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #116 = Utf8               teleportTo
  #117 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #118 = Methodref          #19.#119      // ext/mods/gameserver/model/actor/instance/Agathion.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #119 = NameAndType        #120:#121     // isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #120 = Utf8               isIn2DRadius
  #121 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #122 = Methodref          #19.#101      // ext/mods/gameserver/model/actor/instance/Agathion.getX:()I
  #123 = Methodref          #19.#109      // ext/mods/gameserver/model/actor/instance/Agathion.getY:()I
  #124 = Methodref          #71.#125      // java/lang/Math.sqrt:(D)D
  #125 = NameAndType        #126:#81      // sqrt:(D)D
  #126 = Utf8               sqrt
  #127 = Methodref          #100.#128     // ext/mods/gameserver/model/location/Location.getZ:()I
  #128 = NameAndType        #129:#40      // getZ:()I
  #129 = Utf8               getZ
  #130 = Methodref          #131.#132     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #131 = Class              #133          // ext/mods/gameserver/geoengine/GeoEngine
  #132 = NameAndType        #134:#135     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #133 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #134 = Utf8               getInstance
  #135 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #136 = Methodref          #19.#128      // ext/mods/gameserver/model/actor/instance/Agathion.getZ:()I
  #137 = Methodref          #131.#138     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
  #138 = NameAndType        #139:#140     // canMoveToTarget:(IIIIII)Z
  #139 = Utf8               canMoveToTarget
  #140 = Utf8               (IIIIII)Z
  #141 = Methodref          #100.#142     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #142 = NameAndType        #5:#143       // "<init>":(III)V
  #143 = Utf8               (III)V
  #144 = Methodref          #19.#145      // ext/mods/gameserver/model/actor/instance/Agathion.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #145 = NameAndType        #146:#147     // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #146 = Utf8               getMove
  #147 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #148 = Methodref          #149.#150     // ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #149 = Class              #151          // ext/mods/gameserver/model/actor/move/CreatureMove
  #150 = NameAndType        #152:#153     // maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #151 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
  #152 = Utf8               maybeMoveToLocation
  #153 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
  #154 = Utf8               (Lext/mods/gameserver/model/actor/instance/Agathion;)V
  #155 = Utf8               Code
  #156 = Utf8               LineNumberTable
  #157 = Utf8               LocalVariableTable
  #158 = Utf8               this
  #159 = Utf8               Lext/mods/gameserver/model/actor/ai/type/AgathionAI;
  #160 = Utf8               actor
  #161 = Utf8               Lext/mods/gameserver/model/actor/instance/Agathion;
  #162 = Utf8               onEvtThink
  #163 = Utf8               StackMapTable
  #164 = Utf8               safeOffset
  #165 = Utf8               I
  #166 = Utf8               angleDeg
  #167 = Utf8               rad
  #168 = Utf8               D
  #169 = Utf8               dx
  #170 = Utf8               dy
  #171 = Utf8               ownerPos
  #172 = Utf8               Lext/mods/gameserver/model/location/Location;
  #173 = Utf8               targetLoc
  #174 = Utf8               ratio
  #175 = Utf8               targetX
  #176 = Utf8               targetY
  #177 = Utf8               targetZ
  #178 = Utf8               ownerLoc
  #179 = Utf8               distance
  #180 = Utf8               agathion
  #181 = Utf8               owner
  #182 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #183 = Utf8               followDistance
  #184 = Utf8               Signature
  #185 = Utf8               Lext/mods/gameserver/model/actor/ai/type/NpcAI<Lext/mods/gameserver/model/actor/instance/Agathion;>;
  #186 = Utf8               SourceFile
  #187 = Utf8               AgathionAI.java
  #188 = Utf8               NestMembers
  #189 = Utf8               InnerClasses
{
  public ext.mods.gameserver.model.actor.ai.type.AgathionAI(ext.mods.gameserver.model.actor.instance.Agathion);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Agathion;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/ai/type/NpcAI."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
         5: return
      LineNumberTable:
        line 32: 0
        line 33: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/AgathionAI;
            0       6     1 actor   Lext/mods/gameserver/model/actor/instance/Agathion;

  protected synchronized void onEvtThink();
    descriptor: ()V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/model/actor/ai/type/AgathionAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
         3: aload_0
         4: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         7: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
        10: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/instance/Agathion.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        13: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
        16: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        19: invokevirtual #35                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        22: iaload
        23: lookupswitch  { // 2

                       1: 48

                       2: 55
                 default: 55
            }
        48: aload_0
        49: invokevirtual #41                 // Method thinkFollow:()V
        52: goto          68
        55: aload_0
        56: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        59: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
        62: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/instance/Agathion.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        65: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.thinkIdle:()V
        68: return
      LineNumberTable:
        line 42: 0
        line 45: 48
        line 46: 52
        line 49: 55
        line 52: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      69     0  this   Lext/mods/gameserver/model/actor/ai/type/AgathionAI;
      StackMapTable: number_of_entries = 3
        frame_type = 48 /* same */
        frame_type = 6 /* same */
        frame_type = 12 /* same */

  protected void thinkFollow();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=15, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
         7: astore_1
         8: aload_1
         9: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/instance/Agathion.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        12: astore_2
        13: aload_2
        14: ifnull        24
        17: aload_2
        18: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        21: ifne          29
        24: aload_1
        25: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/instance/Agathion.deleteMe:()V
        28: return
        29: aload_0
        30: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        33: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
        36: aload_2
        37: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/instance/Agathion.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
        40: ldc2_w        #65                 // double 1500.0d
        43: dcmpl
        44: ifgt          54
        47: aload_2
        48: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
        51: ifeq          148
        54: bipush        45
        56: istore_3
        57: invokestatic  #70                 // Method java/lang/Math.random:()D
        60: ldc2_w        #76                 // double 360.0d
        63: dmul
        64: d2i
        65: istore        4
        67: iload         4
        69: i2d
        70: invokestatic  #78                 // Method java/lang/Math.toRadians:(D)D
        73: dstore        5
        75: dload         5
        77: invokestatic  #82                 // Method java/lang/Math.cos:(D)D
        80: ldc2_w        #85                 // double 45.0d
        83: dmul
        84: d2i
        85: istore        7
        87: dload         5
        89: invokestatic  #87                 // Method java/lang/Math.sin:(D)D
        92: ldc2_w        #85                 // double 45.0d
        95: dmul
        96: d2i
        97: istore        8
        99: aload_2
       100: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       103: invokevirtual #94                 // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
       106: astore        9
       108: aload         9
       110: aload         9
       112: invokevirtual #99                 // Method ext/mods/gameserver/model/location/Location.getX:()I
       115: iload         7
       117: iadd
       118: invokevirtual #104                // Method ext/mods/gameserver/model/location/Location.setX:(I)V
       121: aload         9
       123: aload         9
       125: invokevirtual #108                // Method ext/mods/gameserver/model/location/Location.getY:()I
       128: iload         8
       130: iadd
       131: invokevirtual #111                // Method ext/mods/gameserver/model/location/Location.setY:(I)V
       134: aload_0
       135: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       138: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
       141: aload         9
       143: iconst_0
       144: invokevirtual #114                // Method ext/mods/gameserver/model/actor/instance/Agathion.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       147: return
       148: bipush        45
       150: istore_3
       151: aload_0
       152: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       155: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
       158: aload_2
       159: bipush        45
       161: invokevirtual #118                // Method ext/mods/gameserver/model/actor/instance/Agathion.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       164: ifne          387
       167: aload_2
       168: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       171: astore        4
       173: aload         4
       175: invokevirtual #99                 // Method ext/mods/gameserver/model/location/Location.getX:()I
       178: aload_0
       179: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       182: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
       185: invokevirtual #122                // Method ext/mods/gameserver/model/actor/instance/Agathion.getX:()I
       188: isub
       189: istore        5
       191: aload         4
       193: invokevirtual #108                // Method ext/mods/gameserver/model/location/Location.getY:()I
       196: aload_0
       197: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       200: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
       203: invokevirtual #123                // Method ext/mods/gameserver/model/actor/instance/Agathion.getY:()I
       206: isub
       207: istore        6
       209: iload         5
       211: iload         5
       213: imul
       214: iload         6
       216: iload         6
       218: imul
       219: iadd
       220: i2d
       221: invokestatic  #124                // Method java/lang/Math.sqrt:(D)D
       224: dstore        7
       226: dload         7
       228: dconst_0
       229: dcmpl
       230: ifle          387
       233: dload         7
       235: ldc2_w        #85                 // double 45.0d
       238: dsub
       239: dload         7
       241: ddiv
       242: dstore        9
       244: aload_0
       245: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       248: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
       251: invokevirtual #122                // Method ext/mods/gameserver/model/actor/instance/Agathion.getX:()I
       254: iload         5
       256: i2d
       257: dload         9
       259: dmul
       260: d2i
       261: iadd
       262: istore        11
       264: aload_0
       265: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       268: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
       271: invokevirtual #123                // Method ext/mods/gameserver/model/actor/instance/Agathion.getY:()I
       274: iload         6
       276: i2d
       277: dload         9
       279: dmul
       280: d2i
       281: iadd
       282: istore        12
       284: aload         4
       286: invokevirtual #127                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       289: istore        13
       291: invokestatic  #130                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       294: aload_0
       295: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       298: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
       301: invokevirtual #122                // Method ext/mods/gameserver/model/actor/instance/Agathion.getX:()I
       304: aload_0
       305: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       308: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
       311: invokevirtual #123                // Method ext/mods/gameserver/model/actor/instance/Agathion.getY:()I
       314: aload_0
       315: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       318: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
       321: invokevirtual #136                // Method ext/mods/gameserver/model/actor/instance/Agathion.getZ:()I
       324: iload         11
       326: iload         12
       328: iload         13
       330: invokevirtual #137                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
       333: ifeq          373
       336: new           #100                // class ext/mods/gameserver/model/location/Location
       339: dup
       340: iload         11
       342: iload         12
       344: iload         13
       346: invokespecial #141                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       349: astore        14
       351: aload_0
       352: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       355: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
       358: invokevirtual #144                // Method ext/mods/gameserver/model/actor/instance/Agathion.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       361: aload         14
       363: iconst_0
       364: iconst_1
       365: iconst_0
       366: invokevirtual #148                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
       369: pop
       370: goto          387
       373: aload_0
       374: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       377: checkcast     #19                 // class ext/mods/gameserver/model/actor/instance/Agathion
       380: aload         4
       382: bipush        45
       384: invokevirtual #114                // Method ext/mods/gameserver/model/actor/instance/Agathion.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       387: return
      LineNumberTable:
        line 61: 0
        line 62: 8
        line 64: 13
        line 66: 24
        line 67: 28
        line 70: 29
        line 72: 54
        line 73: 57
        line 74: 67
        line 75: 75
        line 76: 87
        line 77: 99
        line 78: 108
        line 79: 121
        line 80: 134
        line 81: 147
        line 84: 148
        line 85: 151
        line 87: 167
        line 88: 173
        line 89: 191
        line 90: 209
        line 92: 226
        line 94: 233
        line 95: 244
        line 96: 264
        line 97: 284
        line 99: 291
        line 101: 336
        line 102: 351
        line 104: 370
        line 107: 373
        line 111: 387
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           57      91     3 safeOffset   I
           67      81     4 angleDeg   I
           75      73     5   rad   D
           87      61     7    dx   I
           99      49     8    dy   I
          108      40     9 ownerPos   Lext/mods/gameserver/model/location/Location;
          351      19    14 targetLoc   Lext/mods/gameserver/model/location/Location;
          244     143     9 ratio   D
          264     123    11 targetX   I
          284     103    12 targetY   I
          291      96    13 targetZ   I
          173     214     4 ownerLoc   Lext/mods/gameserver/model/location/Location;
          191     196     5    dx   I
          209     178     6    dy   I
          226     161     7 distance   D
            0     388     0  this   Lext/mods/gameserver/model/actor/ai/type/AgathionAI;
            8     380     1 agathion   Lext/mods/gameserver/model/actor/instance/Agathion;
           13     375     2 owner   Lext/mods/gameserver/model/actor/Player;
          151     237     3 followDistance   I
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/actor/instance/Agathion, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 4 /* same */
        frame_type = 24 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 93
        frame_type = 255 /* full_frame */
          offset_delta = 224
          locals = [ class ext/mods/gameserver/model/actor/ai/type/AgathionAI, class ext/mods/gameserver/model/actor/instance/Agathion, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/location/Location, int, int, double, double, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/ai/type/AgathionAI, class ext/mods/gameserver/model/actor/instance/Agathion, class ext/mods/gameserver/model/actor/Player, int ]
          stack = []

  public void thinkIdle();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 119: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/AgathionAI;
}
Signature: #185                         // Lext/mods/gameserver/model/actor/ai/type/NpcAI<Lext/mods/gameserver/model/actor/instance/Agathion;>;
SourceFile: "AgathionAI.java"
NestMembers:
  ext/mods/gameserver/model/actor/ai/type/AgathionAI$1
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/actor/ai/type/AgathionAI$1
