// Bytecode for: ext.mods.gameserver.model.actor.attack.NpcAttack
// File: ext\mods\gameserver\model\actor\attack\NpcAttack.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/attack/NpcAttack.class
  Last modified 9 de jul de 2026; size 5519 bytes
  MD5 checksum 1a531302455102c86d099ce195d7c38d
  Compiled from "NpcAttack.java"
public class ext.mods.gameserver.model.actor.attack.NpcAttack extends ext.mods.gameserver.model.actor.attack.CreatureAttack<ext.mods.gameserver.model.actor.Npc>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/attack/NpcAttack
  super_class: #2                         // ext/mods/gameserver/model/actor/attack/CreatureAttack
  interfaces: 0, fields: 1, methods: 5, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/attack/CreatureAttack."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/attack/CreatureAttack
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/attack/NpcAttack._actor:Lext/mods/gameserver/model/actor/Creature;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/attack/NpcAttack
    #9 = NameAndType        #11:#12       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #10 = Utf8               ext/mods/gameserver/model/actor/attack/NpcAttack
   #11 = Utf8               _actor
   #12 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Npc
   #14 = Utf8               ext/mods/gameserver/model/actor/Npc
   #15 = Methodref          #13.#16       // ext/mods/gameserver/model/actor/Npc.getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
   #16 = NameAndType        #17:#18       // getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
   #17 = Utf8               getAttack
   #18 = Utf8               ()Lext/mods/gameserver/model/actor/attack/NpcAttack;
   #19 = Methodref          #8.#20        // ext/mods/gameserver/model/actor/attack/NpcAttack.isAttackingNow:()Z
   #20 = NameAndType        #21:#22       // isAttackingNow:()Z
   #21 = Utf8               isAttackingNow
   #22 = Utf8               ()Z
   #23 = Methodref          #8.#24        // ext/mods/gameserver/model/actor/attack/NpcAttack.isBowCoolingDown:()Z
   #24 = NameAndType        #25:#22       // isBowCoolingDown:()Z
   #25 = Utf8               isBowCoolingDown
   #26 = Methodref          #13.#27       // ext/mods/gameserver/model/actor/Npc.isAttackingDisabled:()Z
   #27 = NameAndType        #28:#22       // isAttackingDisabled:()Z
   #28 = Utf8               isAttackingDisabled
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #30 = Class              #32           // ext/mods/gameserver/model/actor/Creature
   #31 = NameAndType        #33:#22       // isDead:()Z
   #32 = Utf8               ext/mods/gameserver/model/actor/Creature
   #33 = Utf8               isDead
   #34 = Methodref          #30.#35       // ext/mods/gameserver/model/actor/Creature.isFakeDeath:()Z
   #35 = NameAndType        #36:#22       // isFakeDeath:()Z
   #36 = Utf8               isFakeDeath
   #37 = Methodref          #13.#38       // ext/mods/gameserver/model/actor/Npc.knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #38 = NameAndType        #39:#40       // knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #39 = Utf8               knows
   #40 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #41 = Methodref          #30.#42       // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #42 = NameAndType        #43:#44       // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #43 = Utf8               isAttackableBy
   #44 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #45 = Methodref          #13.#46       // ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #46 = NameAndType        #47:#48       // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #47 = Utf8               getStatus
   #48 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #49 = Methodref          #50.#51       // ext/mods/gameserver/model/actor/status/NpcStatus.getPhysicalAttackRange:()I
   #50 = Class              #52           // ext/mods/gameserver/model/actor/status/NpcStatus
   #51 = NameAndType        #53:#54       // getPhysicalAttackRange:()I
   #52 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
   #53 = Utf8               getPhysicalAttackRange
   #54 = Utf8               ()I
   #55 = Methodref          #13.#56       // ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
   #56 = NameAndType        #57:#58       // getCollisionRadius:()D
   #57 = Utf8               getCollisionRadius
   #58 = Utf8               ()D
   #59 = Methodref          #30.#56       // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
   #60 = Fieldref           #61.#62       // ext/mods/Config.MONSTER_MAX_RANGE:I
   #61 = Class              #63           // ext/mods/Config
   #62 = NameAndType        #64:#65       // MONSTER_MAX_RANGE:I
   #63 = Utf8               ext/mods/Config
   #64 = Utf8               MONSTER_MAX_RANGE
   #65 = Utf8               I
   #66 = Methodref          #13.#67       // ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
   #67 = NameAndType        #68:#69       // distance3D:(Lext/mods/gameserver/model/WorldObject;)D
   #68 = Utf8               distance3D
   #69 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
   #70 = Methodref          #13.#71       // ext/mods/gameserver/model/actor/Npc.isMovementDisabled:()Z
   #71 = NameAndType        #72:#22       // isMovementDisabled:()Z
   #72 = Utf8               isMovementDisabled
   #73 = Methodref          #13.#74       // ext/mods/gameserver/model/actor/Npc.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #74 = NameAndType        #75:#76       // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #75 = Utf8               getKnownTypeInRadius
   #76 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
   #77 = InterfaceMethodref #78.#79       // java/util/List.iterator:()Ljava/util/Iterator;
   #78 = Class              #80           // java/util/List
   #79 = NameAndType        #81:#82       // iterator:()Ljava/util/Iterator;
   #80 = Utf8               java/util/List
   #81 = Utf8               iterator
   #82 = Utf8               ()Ljava/util/Iterator;
   #83 = InterfaceMethodref #84.#85       // java/util/Iterator.hasNext:()Z
   #84 = Class              #86           // java/util/Iterator
   #85 = NameAndType        #87:#22       // hasNext:()Z
   #86 = Utf8               java/util/Iterator
   #87 = Utf8               hasNext
   #88 = InterfaceMethodref #84.#89       // java/util/Iterator.next:()Ljava/lang/Object;
   #89 = NameAndType        #90:#91       // next:()Ljava/lang/Object;
   #90 = Utf8               next
   #91 = Utf8               ()Ljava/lang/Object;
   #92 = Methodref          #30.#67       // ext/mods/gameserver/model/actor/Creature.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
   #93 = Methodref          #94.#95       // java/lang/Math.abs:(D)D
   #94 = Class              #96           // java/lang/Math
   #95 = NameAndType        #97:#98       // abs:(D)D
   #96 = Utf8               java/lang/Math
   #97 = Utf8               abs
   #98 = Utf8               (D)D
   #99 = Double             35.0d
  #101 = Double             2.0d
  #103 = Methodref          #13.#104      // ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #104 = NameAndType        #105:#106     // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #105 = Utf8               getAI
  #106 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #107 = Methodref          #108.#109     // ext/mods/gameserver/model/actor/ai/type/NpcAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #108 = Class              #110          // ext/mods/gameserver/model/actor/ai/type/NpcAI
  #109 = NameAndType        #111:#112     // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #110 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
  #111 = Utf8               getCurrentIntention
  #112 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
  #113 = Methodref          #114.#115     // ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
  #114 = Class              #116          // ext/mods/gameserver/model/actor/ai/Intention
  #115 = NameAndType        #117:#22      // canMoveToTarget:()Z
  #116 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
  #117 = Utf8               canMoveToTarget
  #118 = Methodref          #13.#119      // ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #119 = NameAndType        #120:#121     // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #120 = Utf8               getMove
  #121 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #122 = Methodref          #123.#124     // ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #123 = Class              #125          // ext/mods/gameserver/model/actor/move/CreatureMove
  #124 = NameAndType        #126:#127     // maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #125 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
  #126 = Utf8               maybeStartOffensiveFollow
  #127 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Z
  #128 = Fieldref           #61.#129      // ext/mods/Config.DEBUG_MELEE_ATTACK:Z
  #129 = NameAndType        #130:#131     // DEBUG_MELEE_ATTACK:Z
  #130 = Utf8               DEBUG_MELEE_ATTACK
  #131 = Utf8               Z
  #132 = Fieldref           #8.#133       // ext/mods/gameserver/model/actor/attack/NpcAttack.LOGGER:Lext/mods/commons/logging/CLogger;
  #133 = NameAndType        #134:#135     // LOGGER:Lext/mods/commons/logging/CLogger;
  #134 = Utf8               LOGGER
  #135 = Utf8               Lext/mods/commons/logging/CLogger;
  #136 = String             #137          // [MeleeDebug] canAttack: outOfRange npc={} target={} dist={} maxRange={}
  #137 = Utf8               [MeleeDebug] canAttack: outOfRange npc={} target={} dist={} maxRange={}
  #138 = Class              #139          // java/lang/Object
  #139 = Utf8               java/lang/Object
  #140 = Methodref          #13.#141      // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
  #141 = NameAndType        #142:#54      // getObjectId:()I
  #142 = Utf8               getObjectId
  #143 = Methodref          #144.#145     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #144 = Class              #146          // java/lang/Integer
  #145 = NameAndType        #147:#148     // valueOf:(I)Ljava/lang/Integer;
  #146 = Utf8               java/lang/Integer
  #147 = Utf8               valueOf
  #148 = Utf8               (I)Ljava/lang/Integer;
  #149 = Methodref          #30.#141      // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
  #150 = Methodref          #151.#152     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #151 = Class              #153          // java/lang/Double
  #152 = NameAndType        #147:#154     // valueOf:(D)Ljava/lang/Double;
  #153 = Utf8               java/lang/Double
  #154 = Utf8               (D)Ljava/lang/Double;
  #155 = Methodref          #156.#157     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #156 = Class              #158          // ext/mods/commons/logging/CLogger
  #157 = NameAndType        #159:#160     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #158 = Utf8               ext/mods/commons/logging/CLogger
  #159 = Utf8               info
  #160 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #161 = Methodref          #13.#162      // ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #162 = NameAndType        #163:#164     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #163 = Utf8               getPosition
  #164 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #165 = Methodref          #166.#167     // ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
  #166 = Class              #168          // ext/mods/gameserver/model/location/SpawnLocation
  #167 = NameAndType        #169:#170     // setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
  #168 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #169 = Utf8               setHeadingTo
  #170 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #171 = Methodref          #172.#173     // ext/mods/extensions/listener/manager/CreatureListenerManager.getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
  #172 = Class              #174          // ext/mods/extensions/listener/manager/CreatureListenerManager
  #173 = NameAndType        #175:#176     // getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
  #174 = Utf8               ext/mods/extensions/listener/manager/CreatureListenerManager
  #175 = Utf8               getInstance
  #176 = Utf8               ()Lext/mods/extensions/listener/manager/CreatureListenerManager;
  #177 = Methodref          #172.#178     // ext/mods/extensions/listener/manager/CreatureListenerManager.notifyAttack:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #178 = NameAndType        #179:#180     // notifyAttack:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #179 = Utf8               notifyAttack
  #180 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #181 = String             #182          // [MeleeDebug] canAttack: result=true npc={} target={} dist={}
  #182 = Utf8               [MeleeDebug] canAttack: result=true npc={} target={} dist={}
  #183 = Methodref          #13.#184      // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #184 = NameAndType        #185:#186     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #185 = Utf8               getTemplate
  #186 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #187 = Fieldref           #188.#189     // ext/mods/gameserver/enums/EventHandler.ATTACK_FINISHED:Lext/mods/gameserver/enums/EventHandler;
  #188 = Class              #190          // ext/mods/gameserver/enums/EventHandler
  #189 = NameAndType        #191:#192     // ATTACK_FINISHED:Lext/mods/gameserver/enums/EventHandler;
  #190 = Utf8               ext/mods/gameserver/enums/EventHandler
  #191 = Utf8               ATTACK_FINISHED
  #192 = Utf8               Lext/mods/gameserver/enums/EventHandler;
  #193 = Methodref          #194.#195     // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #194 = Class              #196          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #195 = NameAndType        #197:#198     // getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #196 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #197 = Utf8               getEventQuests
  #198 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #199 = Class              #200          // ext/mods/gameserver/scripting/Quest
  #200 = Utf8               ext/mods/gameserver/scripting/Quest
  #201 = Methodref          #199.#202     // ext/mods/gameserver/scripting/Quest.onAttackFinished:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #202 = NameAndType        #203:#204     // onAttackFinished:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #203 = Utf8               onAttackFinished
  #204 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #205 = Methodref          #2.#206       // ext/mods/gameserver/model/actor/attack/CreatureAttack.onFinishedAttackBow:(Lext/mods/gameserver/model/actor/Creature;)V
  #206 = NameAndType        #207:#6       // onFinishedAttackBow:(Lext/mods/gameserver/model/actor/Creature;)V
  #207 = Utf8               onFinishedAttackBow
  #208 = Methodref          #2.#209       // ext/mods/gameserver/model/actor/attack/CreatureAttack.onFinishedAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #209 = NameAndType        #210:#6       // onFinishedAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #210 = Utf8               onFinishedAttack
  #211 = Methodref          #212.#213     // java/lang/Class.getName:()Ljava/lang/String;
  #212 = Class              #214          // java/lang/Class
  #213 = NameAndType        #215:#216     // getName:()Ljava/lang/String;
  #214 = Utf8               java/lang/Class
  #215 = Utf8               getName
  #216 = Utf8               ()Ljava/lang/String;
  #217 = Methodref          #156.#218     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #218 = NameAndType        #5:#219       // "<init>":(Ljava/lang/String;)V
  #219 = Utf8               (Ljava/lang/String;)V
  #220 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #221 = Utf8               Code
  #222 = Utf8               LineNumberTable
  #223 = Utf8               LocalVariableTable
  #224 = Utf8               this
  #225 = Utf8               Lext/mods/gameserver/model/actor/attack/NpcAttack;
  #226 = Utf8               actor
  #227 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #228 = Utf8               canAttack
  #229 = Utf8               adjustedRange
  #230 = Utf8               D
  #231 = Utf8               distToBlocker
  #232 = Utf8               blockerToTarget
  #233 = Utf8               blocker
  #234 = Utf8               blockedByFriend
  #235 = Utf8               target
  #236 = Utf8               attackRange
  #237 = Utf8               totalAttackRange
  #238 = Utf8               attackMargin
  #239 = Utf8               maxAttackRange
  #240 = Utf8               dist
  #241 = Utf8               StackMapTable
  #242 = Utf8               quest
  #243 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #244 = Utf8               mainTarget
  #245 = Utf8               <clinit>
  #246 = Utf8               ()V
  #247 = Utf8               Signature
  #248 = Utf8               Lext/mods/gameserver/model/actor/attack/CreatureAttack<Lext/mods/gameserver/model/actor/Npc;>;
  #249 = Utf8               SourceFile
  #250 = Utf8               NpcAttack.java
{
  public ext.mods.gameserver.model.actor.attack.NpcAttack(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/attack/CreatureAttack."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         5: return
      LineNumberTable:
        line 39: 0
        line 40: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/attack/NpcAttack;
            0       6     1 actor   Lext/mods/gameserver/model/actor/Npc;

  public boolean canAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=19, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
         7: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Npc.getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
        10: invokevirtual #19                 // Method isAttackingNow:()Z
        13: ifne          32
        16: aload_0
        17: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        20: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
        23: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Npc.getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
        26: invokevirtual #23                 // Method isBowCoolingDown:()Z
        29: ifeq          34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
        41: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/Npc.isAttackingDisabled:()Z
        44: ifne          65
        47: aload_1
        48: ifnull        65
        51: aload_1
        52: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        55: ifne          65
        58: aload_1
        59: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Creature.isFakeDeath:()Z
        62: ifeq          67
        65: iconst_0
        66: ireturn
        67: aload_0
        68: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        71: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
        74: aload_1
        75: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Npc.knows:(Lext/mods/gameserver/model/WorldObject;)Z
        78: ifeq          92
        81: aload_1
        82: aload_0
        83: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        86: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
        89: ifne          94
        92: iconst_0
        93: ireturn
        94: aload_0
        95: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        98: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
       101: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       104: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/status/NpcStatus.getPhysicalAttackRange:()I
       107: istore_2
       108: iload_2
       109: i2d
       110: aload_0
       111: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       114: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
       117: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
       120: dadd
       121: aload_1
       122: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
       125: dadd
       126: d2i
       127: istore_3
       128: getstatic     #60                 // Field ext/mods/Config.MONSTER_MAX_RANGE:I
       131: i2d
       132: dstore        4
       134: iload_3
       135: i2d
       136: dload         4
       138: dadd
       139: dstore        6
       141: aload_0
       142: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       145: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
       148: aload_1
       149: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
       152: dstore        8
       154: aload_0
       155: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       158: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
       161: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Npc.isMovementDisabled:()Z
       164: ifeq          177
       167: dload         8
       169: dload         6
       171: dcmpl
       172: ifle          177
       175: iconst_0
       176: ireturn
       177: dload         8
       179: dload         6
       181: dcmpl
       182: ifle          449
       185: iconst_0
       186: istore        10
       188: aload_0
       189: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       192: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
       195: ldc           #30                 // class ext/mods/gameserver/model/actor/Creature
       197: dload         8
       199: d2i
       200: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Npc.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
       203: invokeinterface #77,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       208: astore        11
       210: aload         11
       212: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       217: ifeq          340
       220: aload         11
       222: invokeinterface #88,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       227: checkcast     #30                 // class ext/mods/gameserver/model/actor/Creature
       230: astore        12
       232: aload         12
       234: instanceof    #13                 // class ext/mods/gameserver/model/actor/Npc
       237: ifne          243
       240: goto          210
       243: aload         12
       245: aload_0
       246: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       249: if_acmpeq     210
       252: aload         12
       254: aload_1
       255: if_acmpeq     210
       258: aload         12
       260: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
       263: ifeq          269
       266: goto          210
       269: aload_0
       270: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       273: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
       276: aload         12
       278: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
       281: dstore        13
       283: aload         12
       285: aload_1
       286: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Creature.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
       289: dstore        15
       291: dload         13
       293: dload         15
       295: dadd
       296: dload         8
       298: dsub
       299: invokestatic  #93                 // Method java/lang/Math.abs:(D)D
       302: ldc2_w        #99                 // double 35.0d
       305: dcmpg
       306: ifge          337
       309: dload         6
       311: aload         12
       313: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
       316: ldc2_w        #101                // double 2.0d
       319: dmul
       320: dadd
       321: dstore        17
       323: dload         8
       325: dload         17
       327: dcmpg
       328: ifgt          337
       331: iconst_1
       332: istore        10
       334: goto          340
       337: goto          210
       340: iload         10
       342: ifne          449
       345: aload_0
       346: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       349: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
       352: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
       355: invokevirtual #107                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
       358: invokevirtual #113                // Method ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
       361: ifeq          380
       364: aload_0
       365: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       368: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
       371: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       374: aload_1
       375: iload_2
       376: invokevirtual #122                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
       379: pop
       380: getstatic     #128                // Field ext/mods/Config.DEBUG_MELEE_ATTACK:Z
       383: ifeq          447
       386: iload_2
       387: sipush        200
       390: if_icmpgt     447
       393: getstatic     #132                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       396: ldc           #136                // String [MeleeDebug] canAttack: outOfRange npc={} target={} dist={} maxRange={}
       398: iconst_4
       399: anewarray     #138                // class java/lang/Object
       402: dup
       403: iconst_0
       404: aload_0
       405: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       408: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
       411: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       414: invokestatic  #143                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       417: aastore
       418: dup
       419: iconst_1
       420: aload_1
       421: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       424: invokestatic  #143                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       427: aastore
       428: dup
       429: iconst_2
       430: dload         8
       432: invokestatic  #150                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       435: aastore
       436: dup
       437: iconst_3
       438: dload         6
       440: invokestatic  #150                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       443: aastore
       444: invokevirtual #155                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       447: iconst_0
       448: ireturn
       449: aload_0
       450: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       453: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
       456: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       459: aload_1
       460: invokevirtual #165                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
       463: invokestatic  #171                // Method ext/mods/extensions/listener/manager/CreatureListenerManager.getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
       466: aload_0
       467: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       470: aload_1
       471: invokevirtual #177                // Method ext/mods/extensions/listener/manager/CreatureListenerManager.notifyAttack:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
       474: getstatic     #128                // Field ext/mods/Config.DEBUG_MELEE_ATTACK:Z
       477: ifeq          533
       480: iload_2
       481: sipush        200
       484: if_icmpgt     533
       487: getstatic     #132                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       490: ldc           #181                // String [MeleeDebug] canAttack: result=true npc={} target={} dist={}
       492: iconst_3
       493: anewarray     #138                // class java/lang/Object
       496: dup
       497: iconst_0
       498: aload_0
       499: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       502: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
       505: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       508: invokestatic  #143                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       511: aastore
       512: dup
       513: iconst_1
       514: aload_1
       515: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       518: invokestatic  #143                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       521: aastore
       522: dup
       523: iconst_2
       524: dload         8
       526: invokestatic  #150                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       529: aastore
       530: invokevirtual #155                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       533: iconst_1
       534: ireturn
      LineNumberTable:
        line 77: 0
        line 78: 32
        line 81: 34
        line 82: 65
        line 85: 67
        line 86: 92
        line 89: 94
        line 90: 108
        line 92: 128
        line 93: 134
        line 95: 141
        line 97: 154
        line 98: 175
        line 101: 177
        line 102: 185
        line 104: 188
        line 106: 232
        line 108: 243
        line 110: 269
        line 111: 283
        line 113: 291
        line 115: 309
        line 117: 323
        line 118: 331
        line 119: 334
        line 122: 337
        line 124: 340
        line 125: 345
        line 126: 364
        line 128: 380
        line 129: 393
        line 130: 411
        line 129: 444
        line 132: 447
        line 136: 449
        line 137: 463
        line 139: 474
        line 140: 487
        line 141: 505
        line 140: 530
        line 144: 533
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          323      14    17 adjustedRange   D
          283      54    13 distToBlocker   D
          291      46    15 blockerToTarget   D
          232     105    12 blocker   Lext/mods/gameserver/model/actor/Creature;
          188     261    10 blockedByFriend   Z
            0     535     0  this   Lext/mods/gameserver/model/actor/attack/NpcAttack;
            0     535     1 target   Lext/mods/gameserver/model/actor/Creature;
          108     427     2 attackRange   I
          128     407     3 totalAttackRange   I
          134     401     4 attackMargin   D
          141     394     6 maxAttackRange   D
          154     381     8  dist   D
      StackMapTable: number_of_entries = 16
        frame_type = 32 /* same */
        frame_type = 1 /* same */
        frame_type = 30 /* same */
        frame_type = 1 /* same */
        frame_type = 24 /* same */
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 82
          locals = [ class ext/mods/gameserver/model/actor/attack/NpcAttack, class ext/mods/gameserver/model/actor/Creature, int, int, double, double, double ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 32
          locals = [ int, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 25 /* same */
        frame_type = 250 /* chop */
          offset_delta = 67
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 39 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 251 /* same_frame_extended */
          offset_delta = 83

  protected void onFinishedAttackBow(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
         7: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        10: getstatic     #187                // Field ext/mods/gameserver/enums/EventHandler.ATTACK_FINISHED:Lext/mods/gameserver/enums/EventHandler;
        13: invokevirtual #193                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        16: invokeinterface #77,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        21: astore_2
        22: aload_2
        23: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        28: ifeq          56
        31: aload_2
        32: invokeinterface #88,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        37: checkcast     #199                // class ext/mods/gameserver/scripting/Quest
        40: astore_3
        41: aload_3
        42: aload_0
        43: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        46: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
        49: aload_1
        50: invokevirtual #201                // Method ext/mods/gameserver/scripting/Quest.onAttackFinished:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
        53: goto          22
        56: aload_0
        57: aload_1
        58: invokespecial #205                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.onFinishedAttackBow:(Lext/mods/gameserver/model/actor/Creature;)V
        61: return
      LineNumberTable:
        line 150: 0
        line 151: 41
        line 153: 56
        line 154: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      12     3 quest   Lext/mods/gameserver/scripting/Quest;
            0      62     0  this   Lext/mods/gameserver/model/actor/attack/NpcAttack;
            0      62     1 mainTarget   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 33

  protected void onFinishedAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
         7: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        10: getstatic     #187                // Field ext/mods/gameserver/enums/EventHandler.ATTACK_FINISHED:Lext/mods/gameserver/enums/EventHandler;
        13: invokevirtual #193                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        16: invokeinterface #77,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        21: astore_2
        22: aload_2
        23: invokeinterface #83,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        28: ifeq          56
        31: aload_2
        32: invokeinterface #88,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        37: checkcast     #199                // class ext/mods/gameserver/scripting/Quest
        40: astore_3
        41: aload_3
        42: aload_0
        43: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        46: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
        49: aload_1
        50: invokevirtual #201                // Method ext/mods/gameserver/scripting/Quest.onAttackFinished:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
        53: goto          22
        56: aload_0
        57: aload_1
        58: invokespecial #208                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.onFinishedAttack:(Lext/mods/gameserver/model/actor/Creature;)V
        61: return
      LineNumberTable:
        line 159: 0
        line 160: 41
        line 162: 56
        line 163: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      12     3 quest   Lext/mods/gameserver/scripting/Quest;
            0      62     0  this   Lext/mods/gameserver/model/actor/attack/NpcAttack;
            0      62     1 mainTarget   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 33

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #156                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/model/actor/attack/NpcAttack
         6: invokevirtual #211                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #217                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #132                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 36: 0
}
Signature: #248                         // Lext/mods/gameserver/model/actor/attack/CreatureAttack<Lext/mods/gameserver/model/actor/Npc;>;
SourceFile: "NpcAttack.java"
