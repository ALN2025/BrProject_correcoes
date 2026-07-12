// Bytecode for: ext.mods.gameserver.model.actor.container.attackable.AggroList
// File: ext\mods\gameserver\model\actor\container\attackable\AggroList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/attackable/AggroList.class
  Last modified 9 de jul de 2026; size 8071 bytes
  MD5 checksum e89e63a81e2f869dc5166522d4dd50b6
  Compiled from "AggroList.java"
public class ext.mods.gameserver.model.actor.container.attackable.AggroList extends java.util.concurrent.ConcurrentHashMap<ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.container.npc.AggroInfo>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/attackable/AggroList
  super_class: #2                         // java/util/concurrent/ConcurrentHashMap
  interfaces: 0, fields: 2, methods: 13, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
    #2 = Class              #4            // java/util/concurrent/ConcurrentHashMap
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/util/concurrent/ConcurrentHashMap
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/container/attackable/AggroList._owner:Lext/mods/gameserver/model/actor/Npc;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/container/attackable/AggroList
    #9 = NameAndType        #11:#12       // _owner:Lext/mods/gameserver/model/actor/Npc;
   #10 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
   #11 = Utf8               _owner
   #12 = Utf8               Lext/mods/gameserver/model/actor/Npc;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/instance/SiegeGuard
   #14 = Utf8               ext/mods/gameserver/model/actor/instance/SiegeGuard
   #15 = InvokeDynamic      #0:#16        // #0:apply:()Ljava/util/function/Function;
   #16 = NameAndType        #17:#18       // apply:()Ljava/util/function/Function;
   #17 = Utf8               apply
   #18 = Utf8               ()Ljava/util/function/Function;
   #19 = Methodref          #8.#20        // ext/mods/gameserver/model/actor/container/attackable/AggroList.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #20 = NameAndType        #21:#22       // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #21 = Utf8               computeIfAbsent
   #22 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #23 = Class              #24           // ext/mods/gameserver/model/actor/container/npc/AggroInfo
   #24 = Utf8               ext/mods/gameserver/model/actor/container/npc/AggroInfo
   #25 = Methodref          #23.#26       // ext/mods/gameserver/model/actor/container/npc/AggroInfo.addDamage:(D)V
   #26 = NameAndType        #27:#28       // addDamage:(D)V
   #27 = Utf8               addDamage
   #28 = Utf8               (D)V
   #29 = Methodref          #23.#30       // ext/mods/gameserver/model/actor/container/npc/AggroInfo.addHate:(D)V
   #30 = NameAndType        #31:#28       // addHate:(D)V
   #31 = Utf8               addHate
   #32 = Methodref          #33.#34       // java/lang/System.currentTimeMillis:()J
   #33 = Class              #35           // java/lang/System
   #34 = NameAndType        #36:#37       // currentTimeMillis:()J
   #35 = Utf8               java/lang/System
   #36 = Utf8               currentTimeMillis
   #37 = Utf8               ()J
   #38 = Methodref          #23.#39       // ext/mods/gameserver/model/actor/container/npc/AggroInfo.setTimestamp:(J)V
   #39 = NameAndType        #40:#41       // setTimestamp:(J)V
   #40 = Utf8               setTimestamp
   #41 = Utf8               (J)V
   #42 = Methodref          #8.#43        // ext/mods/gameserver/model/actor/container/attackable/AggroList.isEmpty:()Z
   #43 = NameAndType        #44:#45       // isEmpty:()Z
   #44 = Utf8               isEmpty
   #45 = Utf8               ()Z
   #46 = Methodref          #47.#48       // ext/mods/gameserver/model/actor/Npc.isAlikeDead:()Z
   #47 = Class              #49           // ext/mods/gameserver/model/actor/Npc
   #48 = NameAndType        #50:#45       // isAlikeDead:()Z
   #49 = Utf8               ext/mods/gameserver/model/actor/Npc
   #50 = Utf8               isAlikeDead
   #51 = Methodref          #8.#52        // ext/mods/gameserver/model/actor/container/attackable/AggroList.values:()Ljava/util/Collection;
   #52 = NameAndType        #53:#54       // values:()Ljava/util/Collection;
   #53 = Utf8               values
   #54 = Utf8               ()Ljava/util/Collection;
   #55 = InterfaceMethodref #56.#57       // java/util/Collection.stream:()Ljava/util/stream/Stream;
   #56 = Class              #58           // java/util/Collection
   #57 = NameAndType        #59:#60       // stream:()Ljava/util/stream/Stream;
   #58 = Utf8               java/util/Collection
   #59 = Utf8               stream
   #60 = Utf8               ()Ljava/util/stream/Stream;
   #61 = InvokeDynamic      #1:#62        // #1:test:()Ljava/util/function/Predicate;
   #62 = NameAndType        #63:#64       // test:()Ljava/util/function/Predicate;
   #63 = Utf8               test
   #64 = Utf8               ()Ljava/util/function/Predicate;
   #65 = InterfaceMethodref #66.#67       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #66 = Class              #68           // java/util/stream/Stream
   #67 = NameAndType        #69:#70       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #68 = Utf8               java/util/stream/Stream
   #69 = Utf8               filter
   #70 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #71 = InvokeDynamic      #2:#16        // #2:apply:()Ljava/util/function/Function;
   #72 = InterfaceMethodref #73.#74       // java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
   #73 = Class              #75           // java/util/Comparator
   #74 = NameAndType        #76:#77       // comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
   #75 = Utf8               java/util/Comparator
   #76 = Utf8               comparing
   #77 = Utf8               (Ljava/util/function/Function;)Ljava/util/Comparator;
   #78 = InterfaceMethodref #66.#79       // java/util/stream/Stream.max:(Ljava/util/Comparator;)Ljava/util/Optional;
   #79 = NameAndType        #80:#81       // max:(Ljava/util/Comparator;)Ljava/util/Optional;
   #80 = Utf8               max
   #81 = Utf8               (Ljava/util/Comparator;)Ljava/util/Optional;
   #82 = Methodref          #83.#84       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #83 = Class              #85           // java/util/Optional
   #84 = NameAndType        #86:#87       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #85 = Utf8               java/util/Optional
   #86 = Utf8               orElse
   #87 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #88 = Methodref          #8.#89        // ext/mods/gameserver/model/actor/container/attackable/AggroList.getMostHated:()Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
   #89 = NameAndType        #90:#91       // getMostHated:()Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
   #90 = Utf8               getMostHated
   #91 = Utf8               ()Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
   #92 = Methodref          #23.#93       // ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
   #93 = NameAndType        #94:#95       // getAttacker:()Lext/mods/gameserver/model/actor/Creature;
   #94 = Utf8               getAttacker
   #95 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
   #96 = Methodref          #8.#97        // ext/mods/gameserver/model/actor/container/attackable/AggroList.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #97 = NameAndType        #98:#87       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #98 = Utf8               get
   #99 = Methodref          #23.#100      // ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
  #100 = NameAndType        #101:#102     // getHate:()D
  #101 = Utf8               getHate
  #102 = Utf8               ()D
  #103 = Methodref          #23.#104      // ext/mods/gameserver/model/actor/container/npc/AggroInfo.stopHate:()V
  #104 = NameAndType        #105:#6       // stopHate:()V
  #105 = Utf8               stopHate
  #106 = Methodref          #47.#107      // ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #107 = NameAndType        #108:#109     // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #108 = Utf8               getAI
  #109 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #110 = Methodref          #111.#112     // ext/mods/gameserver/model/actor/ai/type/NpcAI.getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #111 = Class              #113          // ext/mods/gameserver/model/actor/ai/type/NpcAI
  #112 = NameAndType        #114:#115     // getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #113 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
  #114 = Utf8               getHateList
  #115 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #116 = Methodref          #117.#118     // ext/mods/gameserver/model/actor/container/attackable/HateList.getMostHatedCreature:()Lext/mods/gameserver/model/actor/Creature;
  #117 = Class              #119          // ext/mods/gameserver/model/actor/container/attackable/HateList
  #118 = NameAndType        #120:#95      // getMostHatedCreature:()Lext/mods/gameserver/model/actor/Creature;
  #119 = Utf8               ext/mods/gameserver/model/actor/container/attackable/HateList
  #120 = Utf8               getMostHatedCreature
  #121 = Methodref          #111.#122     // ext/mods/gameserver/model/actor/ai/type/NpcAI.setBackToPeace:()V
  #122 = NameAndType        #123:#6       // setBackToPeace:()V
  #123 = Utf8               setBackToPeace
  #124 = InterfaceMethodref #56.#125      // java/util/Collection.iterator:()Ljava/util/Iterator;
  #125 = NameAndType        #126:#127     // iterator:()Ljava/util/Iterator;
  #126 = Utf8               iterator
  #127 = Utf8               ()Ljava/util/Iterator;
  #128 = InterfaceMethodref #129.#130     // java/util/Iterator.hasNext:()Z
  #129 = Class              #131          // java/util/Iterator
  #130 = NameAndType        #132:#45      // hasNext:()Z
  #131 = Utf8               java/util/Iterator
  #132 = Utf8               hasNext
  #133 = InterfaceMethodref #129.#134     // java/util/Iterator.next:()Ljava/lang/Object;
  #134 = NameAndType        #135:#136     // next:()Ljava/lang/Object;
  #135 = Utf8               next
  #136 = Utf8               ()Ljava/lang/Object;
  #137 = Methodref          #8.#138       // ext/mods/gameserver/model/actor/container/attackable/AggroList.size:()I
  #138 = NameAndType        #139:#140     // size:()I
  #139 = Utf8               size
  #140 = Utf8               ()I
  #141 = Methodref          #47.#142      // ext/mods/gameserver/model/actor/Npc.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #142 = NameAndType        #143:#144     // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #143 = Utf8               isIn3DRadius
  #144 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #145 = Methodref          #47.#146      // ext/mods/gameserver/model/actor/Npc.canAutoAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
  #146 = NameAndType        #147:#148     // canAutoAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
  #147 = Utf8               canAutoAttack
  #148 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #149 = Double             2000.0d
  #151 = Methodref          #8.#152       // ext/mods/gameserver/model/actor/container/attackable/AggroList.addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
  #152 = NameAndType        #153:#154     // addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
  #153 = Utf8               addDamageHate
  #154 = Utf8               (Lext/mods/gameserver/model/actor/Creature;DD)V
  #155 = Methodref          #47.#156      // ext/mods/gameserver/model/actor/Npc.isAggressive:()Z
  #156 = NameAndType        #157:#45      // isAggressive:()Z
  #157 = Utf8               isAggressive
  #158 = Class              #159          // ext/mods/gameserver/model/actor/Creature
  #159 = Utf8               ext/mods/gameserver/model/actor/Creature
  #160 = Methodref          #47.#161      // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #161 = NameAndType        #162:#163     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #162 = Utf8               getTemplate
  #163 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #164 = Methodref          #165.#166     // ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
  #165 = Class              #167          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #166 = NameAndType        #168:#140     // getAggroRange:()I
  #167 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #168 = Utf8               getAggroRange
  #169 = Methodref          #47.#170      // ext/mods/gameserver/model/actor/Npc.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #170 = NameAndType        #171:#172     // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #171 = Utf8               getKnownTypeInRadius
  #172 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
  #173 = InterfaceMethodref #174.#125     // java/util/List.iterator:()Ljava/util/Iterator;
  #174 = Class              #175          // java/util/List
  #175 = Utf8               java/util/List
  #176 = InvokeDynamic      #3:#177       // #3:test:(Lext/mods/gameserver/model/actor/container/attackable/AggroList;Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Ljava/util/function/Predicate;
  #177 = NameAndType        #63:#178      // test:(Lext/mods/gameserver/model/actor/container/attackable/AggroList;Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Ljava/util/function/Predicate;
  #178 = Utf8               (Lext/mods/gameserver/model/actor/container/attackable/AggroList;Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Ljava/util/function/Predicate;
  #179 = InterfaceMethodref #66.#180      // java/util/stream/Stream.findAny:()Ljava/util/Optional;
  #180 = NameAndType        #181:#182     // findAny:()Ljava/util/Optional;
  #181 = Utf8               findAny
  #182 = Utf8               ()Ljava/util/Optional;
  #183 = Methodref          #111.#184     // ext/mods/gameserver/model/actor/ai/type/NpcAI.getDesires:()Ljava/util/Set;
  #184 = NameAndType        #185:#186     // getDesires:()Ljava/util/Set;
  #185 = Utf8               getDesires
  #186 = Utf8               ()Ljava/util/Set;
  #187 = InterfaceMethodref #188.#125     // java/util/Set.iterator:()Ljava/util/Iterator;
  #188 = Class              #189          // java/util/Set
  #189 = Utf8               java/util/Set
  #190 = Class              #191          // ext/mods/gameserver/model/actor/ai/Desire
  #191 = Utf8               ext/mods/gameserver/model/actor/ai/Desire
  #192 = Methodref          #190.#193     // ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
  #193 = NameAndType        #194:#195     // getType:()Lext/mods/gameserver/enums/IntentionType;
  #194 = Utf8               getType
  #195 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
  #196 = Fieldref           #197.#198     // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
  #197 = Class              #199          // ext/mods/gameserver/enums/IntentionType
  #198 = NameAndType        #200:#201     // ATTACK:Lext/mods/gameserver/enums/IntentionType;
  #199 = Utf8               ext/mods/gameserver/enums/IntentionType
  #200 = Utf8               ATTACK
  #201 = Utf8               Lext/mods/gameserver/enums/IntentionType;
  #202 = Methodref          #190.#203     // ext/mods/gameserver/model/actor/ai/Desire.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
  #203 = NameAndType        #204:#95      // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
  #204 = Utf8               getFinalTarget
  #205 = Methodref          #190.#206     // ext/mods/gameserver/model/actor/ai/Desire.setWeight:(D)V
  #206 = NameAndType        #207:#28      // setWeight:(D)V
  #207 = Utf8               setWeight
  #208 = Methodref          #158.#48      // ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
  #209 = Methodref          #158.#210     // ext/mods/gameserver/model/actor/Creature.isVisible:()Z
  #210 = NameAndType        #211:#45      // isVisible:()Z
  #211 = Utf8               isVisible
  #212 = Methodref          #47.#213      // ext/mods/gameserver/model/actor/Npc.knows:(Lext/mods/gameserver/model/WorldObject;)Z
  #213 = NameAndType        #214:#215     // knows:(Lext/mods/gameserver/model/WorldObject;)Z
  #214 = Utf8               knows
  #215 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #216 = Methodref          #158.#217     // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #217 = NameAndType        #218:#219     // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #218 = Utf8               getActingPlayer
  #219 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #220 = Methodref          #221.#222     // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #221 = Class              #223          // ext/mods/gameserver/model/actor/Player
  #222 = NameAndType        #224:#225     // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #223 = Utf8               ext/mods/gameserver/model/actor/Player
  #224 = Utf8               getAppearance
  #225 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #226 = Methodref          #227.#210     // ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
  #227 = Class              #228          // ext/mods/gameserver/model/actor/container/player/Appearance
  #228 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
  #229 = Methodref          #8.#230       // ext/mods/gameserver/model/actor/container/attackable/AggroList.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #230 = NameAndType        #231:#87      // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #231 = Utf8               remove
  #232 = Fieldref           #233.#234     // ext/mods/Config.PARTY_RANGE:I
  #233 = Class              #235          // ext/mods/Config
  #234 = NameAndType        #236:#237     // PARTY_RANGE:I
  #235 = Utf8               ext/mods/Config
  #236 = Utf8               PARTY_RANGE
  #237 = Utf8               I
  #238 = Methodref          #47.#239      // ext/mods/gameserver/model/actor/Npc.canAutoAttack:(Lext/mods/gameserver/model/actor/Creature;IZ)Z
  #239 = NameAndType        #147:#240     // canAutoAttack:(Lext/mods/gameserver/model/actor/Creature;IZ)Z
  #240 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZ)Z
  #241 = Utf8               serialVersionUID
  #242 = Utf8               J
  #243 = Utf8               ConstantValue
  #244 = Long               1l
  #246 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #247 = Utf8               Code
  #248 = Utf8               LineNumberTable
  #249 = Utf8               LocalVariableTable
  #250 = Utf8               this
  #251 = Utf8               Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #252 = Utf8               owner
  #253 = Utf8               attacker
  #254 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #255 = Utf8               damage
  #256 = Utf8               D
  #257 = Utf8               aggro
  #258 = Utf8               ai
  #259 = Utf8               Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
  #260 = Utf8               StackMapTable
  #261 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)D
  #262 = Utf8               target
  #263 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #264 = Utf8               reduceAllHate
  #265 = Utf8               amount
  #266 = Utf8               cleanAllHate
  #267 = Utf8               reconsiderTarget
  #268 = Utf8               (I)Lext/mods/gameserver/model/actor/Creature;
  #269 = Utf8               mostHated
  #270 = Utf8               creature
  #271 = Utf8               range
  #272 = Utf8               randomizeAttack
  #273 = Utf8               desire
  #274 = Utf8               Lext/mods/gameserver/model/actor/ai/Desire;
  #275 = Utf8               mostHatedInfo
  #276 = Utf8               randomInfo
  #277 = Utf8               mostHate
  #278 = Utf8               randomHate
  #279 = Utf8               refresh
  #280 = Utf8               lambda$randomizeAttack$0
  #281 = Utf8               (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Z
  #282 = Utf8               a
  #283 = Utf8               lambda$getMostHated$0
  #284 = Utf8               (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Z
  #285 = Utf8               Signature
  #286 = Utf8               Ljava/util/concurrent/ConcurrentHashMap<Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/container/npc/AggroInfo;>;
  #287 = Utf8               SourceFile
  #288 = Utf8               AggroList.java
  #289 = Utf8               BootstrapMethods
  #290 = MethodType         #87           //  (Ljava/lang/Object;)Ljava/lang/Object;
  #291 = MethodHandle       8:#292        // REF_newInvokeSpecial ext/mods/gameserver/model/actor/container/npc/AggroInfo."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
  #292 = Methodref          #23.#293      // ext/mods/gameserver/model/actor/container/npc/AggroInfo."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
  #293 = NameAndType        #5:#263       // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
  #294 = MethodType         #295          //  (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
  #295 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
  #296 = MethodType         #297          //  (Ljava/lang/Object;)Z
  #297 = Utf8               (Ljava/lang/Object;)Z
  #298 = MethodHandle       6:#299        // REF_invokeStatic ext/mods/gameserver/model/actor/container/attackable/AggroList.lambda$getMostHated$0:(Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Z
  #299 = Methodref          #8.#300       // ext/mods/gameserver/model/actor/container/attackable/AggroList.lambda$getMostHated$0:(Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Z
  #300 = NameAndType        #283:#284     // lambda$getMostHated$0:(Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Z
  #301 = MethodType         #284          //  (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Z
  #302 = MethodHandle       5:#99         // REF_invokeVirtual ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
  #303 = MethodType         #304          //  (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Ljava/lang/Double;
  #304 = Utf8               (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Ljava/lang/Double;
  #305 = MethodHandle       5:#306        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/attackable/AggroList.lambda$randomizeAttack$0:(Lext/mods/gameserver/model/actor/container/npc/AggroInfo;Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Z
  #306 = Methodref          #8.#307       // ext/mods/gameserver/model/actor/container/attackable/AggroList.lambda$randomizeAttack$0:(Lext/mods/gameserver/model/actor/container/npc/AggroInfo;Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Z
  #307 = NameAndType        #280:#281     // lambda$randomizeAttack$0:(Lext/mods/gameserver/model/actor/container/npc/AggroInfo;Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Z
  #308 = MethodHandle       6:#309        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #309 = Methodref          #310.#311     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #310 = Class              #312          // java/lang/invoke/LambdaMetafactory
  #311 = NameAndType        #313:#314     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #312 = Utf8               java/lang/invoke/LambdaMetafactory
  #313 = Utf8               metafactory
  #314 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #315 = Utf8               InnerClasses
  #316 = Class              #317          // java/lang/invoke/MethodHandles$Lookup
  #317 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #318 = Class              #319          // java/lang/invoke/MethodHandles
  #319 = Utf8               java/lang/invoke/MethodHandles
  #320 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.container.attackable.AggroList(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
         9: return
      LineNumberTable:
        line 40: 0
        line 42: 4
        line 43: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/attackable/AggroList;
            0      10     1 owner   Lext/mods/gameserver/model/actor/Npc;

  public void addDamageHate(ext.mods.gameserver.model.actor.Creature, double, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;DD)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=4
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
         9: instanceof    #13                 // class ext/mods/gameserver/model/actor/instance/SiegeGuard
        12: ifeq          23
        15: aload_1
        16: instanceof    #13                 // class ext/mods/gameserver/model/actor/instance/SiegeGuard
        19: ifeq          23
        22: return
        23: aload_0
        24: aload_1
        25: invokedynamic #15,  0             // InvokeDynamic #0:apply:()Ljava/util/function/Function;
        30: invokevirtual #19                 // Method computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
        33: checkcast     #23                 // class ext/mods/gameserver/model/actor/container/npc/AggroInfo
        36: astore        6
        38: aload         6
        40: dload_2
        41: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.addDamage:(D)V
        44: aload         6
        46: dload         4
        48: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.addHate:(D)V
        51: aload         6
        53: invokestatic  #32                 // Method java/lang/System.currentTimeMillis:()J
        56: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.setTimestamp:(J)V
        59: return
      LineNumberTable:
        line 53: 0
        line 54: 4
        line 56: 5
        line 57: 22
        line 59: 23
        line 60: 38
        line 61: 44
        line 62: 51
        line 63: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      60     0  this   Lext/mods/gameserver/model/actor/container/attackable/AggroList;
            0      60     1 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      60     2 damage   D
            0      60     4 aggro   D
           38      22     6    ai   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
      StackMapTable: number_of_entries = 2
        frame_type = 5 /* same */
        frame_type = 17 /* same */

  public ext.mods.gameserver.model.actor.container.npc.AggroInfo getMostHated();
    descriptor: ()Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #42                 // Method isEmpty:()Z
         4: ifne          17
         7: aload_0
         8: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
        11: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Npc.isAlikeDead:()Z
        14: ifeq          19
        17: aconst_null
        18: areturn
        19: aload_0
        20: invokevirtual #51                 // Method values:()Ljava/util/Collection;
        23: invokeinterface #55,  1           // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        28: invokedynamic #61,  0             // InvokeDynamic #1:test:()Ljava/util/function/Predicate;
        33: invokeinterface #65,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        38: invokedynamic #71,  0             // InvokeDynamic #2:apply:()Ljava/util/function/Function;
        43: invokestatic  #72                 // InterfaceMethod java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        46: invokeinterface #78,  2           // InterfaceMethod java/util/stream/Stream.max:(Ljava/util/Comparator;)Ljava/util/Optional;
        51: aconst_null
        52: invokevirtual #82                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        55: checkcast     #23                 // class ext/mods/gameserver/model/actor/container/npc/AggroInfo
        58: areturn
      LineNumberTable:
        line 70: 0
        line 71: 17
        line 73: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      59     0  this   Lext/mods/gameserver/model/actor/container/attackable/AggroList;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 1 /* same */

  public ext.mods.gameserver.model.actor.Creature getMostHatedCreature();
    descriptor: ()Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #88                 // Method getMostHated:()Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
         4: astore_1
         5: aload_1
         6: ifnonnull     13
         9: aconst_null
        10: goto          17
        13: aload_1
        14: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
        17: areturn
      LineNumberTable:
        line 81: 0
        line 82: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/container/attackable/AggroList;
            5      13     1    ai   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/npc/AggroInfo ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]

  public double getHate(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #96                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
         5: checkcast     #23                 // class ext/mods/gameserver/model/actor/container/npc/AggroInfo
         8: astore_2
         9: aload_2
        10: ifnonnull     17
        13: dconst_0
        14: goto          21
        17: aload_2
        18: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
        21: dreturn
      LineNumberTable:
        line 91: 0
        line 92: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/container/attackable/AggroList;
            0      22     1 target   Lext/mods/gameserver/model/actor/Creature;
            9      13     2    ai   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/actor/container/npc/AggroInfo ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ double ]

  public void stopHate(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: ifnull        11
         4: aload_0
         5: invokevirtual #42                 // Method isEmpty:()Z
         8: ifeq          12
        11: return
        12: aload_0
        13: aload_1
        14: invokevirtual #96                 // Method get:(Ljava/lang/Object;)Ljava/lang/Object;
        17: checkcast     #23                 // class ext/mods/gameserver/model/actor/container/npc/AggroInfo
        20: astore_2
        21: aload_2
        22: ifnull        29
        25: aload_2
        26: invokevirtual #103                // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.stopHate:()V
        29: aload_0
        30: invokevirtual #88                 // Method getMostHated:()Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
        33: ifnonnull     62
        36: aload_0
        37: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
        40: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        43: invokevirtual #110                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
        46: invokevirtual #116                // Method ext/mods/gameserver/model/actor/container/attackable/HateList.getMostHatedCreature:()Lext/mods/gameserver/model/actor/Creature;
        49: ifnonnull     62
        52: aload_0
        53: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
        56: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        59: invokevirtual #121                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.setBackToPeace:()V
        62: return
      LineNumberTable:
        line 103: 0
        line 104: 11
        line 106: 12
        line 107: 21
        line 108: 25
        line 110: 29
        line 111: 52
        line 112: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/actor/container/attackable/AggroList;
            0      63     1 target   Lext/mods/gameserver/model/actor/Creature;
           21      42     2    ai   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
      StackMapTable: number_of_entries = 4
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/container/npc/AggroInfo ]
        frame_type = 32 /* same */

  public void reduceAllHate(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=2
         0: aload_0
         1: invokevirtual #42                 // Method isEmpty:()Z
         4: ifeq          8
         7: return
         8: aload_0
         9: invokevirtual #51                 // Method values:()Ljava/util/Collection;
        12: invokeinterface #124,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        17: astore_3
        18: aload_3
        19: invokeinterface #128,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        24: ifeq          48
        27: aload_3
        28: invokeinterface #133,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        33: checkcast     #23                 // class ext/mods/gameserver/model/actor/container/npc/AggroInfo
        36: astore        4
        38: aload         4
        40: dload_1
        41: dneg
        42: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.addHate:(D)V
        45: goto          18
        48: aload_0
        49: invokevirtual #88                 // Method getMostHated:()Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
        52: ifnonnull     81
        55: aload_0
        56: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
        59: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        62: invokevirtual #110                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
        65: invokevirtual #116                // Method ext/mods/gameserver/model/actor/container/attackable/HateList.getMostHatedCreature:()Lext/mods/gameserver/model/actor/Creature;
        68: ifnonnull     81
        71: aload_0
        72: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
        75: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        78: invokevirtual #121                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.setBackToPeace:()V
        81: return
      LineNumberTable:
        line 122: 0
        line 123: 7
        line 125: 8
        line 126: 38
        line 128: 48
        line 129: 71
        line 130: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38       7     4    ai   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
            0      82     0  this   Lext/mods/gameserver/model/actor/container/attackable/AggroList;
            0      82     1 amount   D
      StackMapTable: number_of_entries = 4
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 29
        frame_type = 32 /* same */

  public void cleanAllHate();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #51                 // Method values:()Ljava/util/Collection;
         4: invokeinterface #124,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #128,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          36
        19: aload_1
        20: invokeinterface #133,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #23                 // class ext/mods/gameserver/model/actor/container/npc/AggroInfo
        28: astore_2
        29: aload_2
        30: invokevirtual #103                // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.stopHate:()V
        33: goto          10
        36: return
      LineNumberTable:
        line 137: 0
        line 138: 29
        line 139: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       4     2    ai   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
            0      37     0  this   Lext/mods/gameserver/model/actor/container/attackable/AggroList;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 25

  public ext.mods.gameserver.model.actor.Creature reconsiderTarget(int);
    descriptor: (I)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=2
         0: aload_0
         1: invokevirtual #137                // Method size:()I
         4: iconst_1
         5: if_icmple     160
         8: aload_0
         9: invokevirtual #88                 // Method getMostHated:()Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
        12: astore_2
        13: aload_0
        14: invokevirtual #51                 // Method values:()Ljava/util/Collection;
        17: invokeinterface #124,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        22: astore_3
        23: aload_3
        24: invokeinterface #128,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        29: ifeq          160
        32: aload_3
        33: invokeinterface #133,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        38: checkcast     #23                 // class ext/mods/gameserver/model/actor/container/npc/AggroInfo
        41: astore        4
        43: aload_2
        44: ifnull        62
        47: aload_2
        48: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
        51: aload         4
        53: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
        56: if_acmpne     62
        59: goto          23
        62: aload         4
        64: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
        67: dconst_0
        68: dcmpg
        69: ifgt          75
        72: goto          23
        75: iload_1
        76: ifle          98
        79: aload_0
        80: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
        83: aload         4
        85: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
        88: iload_1
        89: invokevirtual #141                // Method ext/mods/gameserver/model/actor/Npc.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        92: ifne          98
        95: goto          23
        98: aload_0
        99: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
       102: aload         4
       104: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
       107: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Npc.canAutoAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
       110: ifne          116
       113: goto          23
       116: aload_2
       117: ifnonnull     136
       120: aload_0
       121: aload         4
       123: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
       126: dconst_0
       127: ldc2_w        #149                // double 2000.0d
       130: invokevirtual #151                // Method addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
       133: goto          154
       136: aload_2
       137: invokevirtual #103                // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.stopHate:()V
       140: aload_0
       141: aload         4
       143: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
       146: dconst_0
       147: aload_2
       148: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
       151: invokevirtual #151                // Method addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
       154: aload         4
       156: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
       159: areturn
       160: aload_0
       161: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
       164: instanceof    #13                 // class ext/mods/gameserver/model/actor/instance/SiegeGuard
       167: ifne          266
       170: aload_0
       171: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
       174: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Npc.isAggressive:()Z
       177: ifeq          266
       180: aload_0
       181: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
       184: ldc           #158                // class ext/mods/gameserver/model/actor/Creature
       186: aload_0
       187: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
       190: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       193: invokevirtual #164                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
       196: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Npc.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
       199: invokeinterface #173,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       204: astore_2
       205: aload_2
       206: invokeinterface #128,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       211: ifeq          266
       214: aload_2
       215: invokeinterface #133,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       220: checkcast     #158                // class ext/mods/gameserver/model/actor/Creature
       223: astore_3
       224: iload_1
       225: ifle          243
       228: aload_0
       229: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
       232: aload_3
       233: iload_1
       234: invokevirtual #141                // Method ext/mods/gameserver/model/actor/Npc.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       237: ifne          243
       240: goto          205
       243: aload_0
       244: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
       247: aload_3
       248: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Npc.canAutoAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
       251: ifne          257
       254: goto          205
       257: aload_0
       258: aload_3
       259: dconst_0
       260: dconst_1
       261: invokevirtual #151                // Method addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
       264: aload_3
       265: areturn
       266: aconst_null
       267: areturn
      LineNumberTable:
        line 152: 0
        line 154: 8
        line 156: 13
        line 158: 43
        line 159: 59
        line 161: 62
        line 162: 72
        line 164: 75
        line 165: 95
        line 167: 98
        line 168: 113
        line 170: 116
        line 171: 120
        line 174: 136
        line 175: 140
        line 177: 154
        line 181: 160
        line 183: 180
        line 185: 224
        line 186: 240
        line 188: 243
        line 189: 254
        line 191: 257
        line 192: 264
        line 196: 266
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43     117     4    ai   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
           13     147     2 mostHated   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
          224      42     3 creature   Lext/mods/gameserver/model/actor/Creature;
            0     268     0  this   Lext/mods/gameserver/model/actor/container/attackable/AggroList;
            0     268     1 range   I
      StackMapTable: number_of_entries = 12
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/actor/container/npc/AggroInfo, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/actor/container/npc/AggroInfo ]
        frame_type = 12 /* same */
        frame_type = 22 /* same */
        frame_type = 17 /* same */
        frame_type = 19 /* same */
        frame_type = 17 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 13 /* same */
        frame_type = 249 /* chop */
          offset_delta = 8

  public void randomizeAttack();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=1
         0: aload_0
         1: invokevirtual #137                // Method size:()I
         4: iconst_2
         5: if_icmpge     9
         8: return
         9: aload_0
        10: invokevirtual #88                 // Method getMostHated:()Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
        13: astore_1
        14: aload_1
        15: ifnonnull     19
        18: return
        19: aload_0
        20: invokevirtual #51                 // Method values:()Ljava/util/Collection;
        23: invokeinterface #55,  1           // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        28: aload_0
        29: aload_1
        30: invokedynamic #176,  0            // InvokeDynamic #3:test:(Lext/mods/gameserver/model/actor/container/attackable/AggroList;Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Ljava/util/function/Predicate;
        35: invokeinterface #65,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        40: invokeinterface #179,  1          // InterfaceMethod java/util/stream/Stream.findAny:()Ljava/util/Optional;
        45: aconst_null
        46: invokevirtual #82                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        49: checkcast     #23                 // class ext/mods/gameserver/model/actor/container/npc/AggroInfo
        52: astore_2
        53: aload_2
        54: ifnonnull     58
        57: return
        58: aload_1
        59: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
        62: dstore_3
        63: aload_2
        64: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
        67: dstore        5
        69: aload_1
        70: dload         5
        72: dload_3
        73: dsub
        74: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.addHate:(D)V
        77: aload_1
        78: invokestatic  #32                 // Method java/lang/System.currentTimeMillis:()J
        81: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.setTimestamp:(J)V
        84: aload_2
        85: dload_3
        86: dload         5
        88: dsub
        89: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.addHate:(D)V
        92: aload_2
        93: invokestatic  #32                 // Method java/lang/System.currentTimeMillis:()J
        96: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.setTimestamp:(J)V
        99: aload_0
       100: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
       103: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
       106: invokevirtual #183                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getDesires:()Ljava/util/Set;
       109: invokeinterface #187,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       114: astore        7
       116: aload         7
       118: invokeinterface #128,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       123: ifeq          197
       126: aload         7
       128: invokeinterface #133,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       133: checkcast     #190                // class ext/mods/gameserver/model/actor/ai/Desire
       136: astore        8
       138: aload         8
       140: invokevirtual #192                // Method ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
       143: getstatic     #196                // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
       146: if_acmpne     194
       149: aload         8
       151: invokevirtual #202                // Method ext/mods/gameserver/model/actor/ai/Desire.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
       154: aload_1
       155: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
       158: if_acmpne     173
       161: aload         8
       163: aload_1
       164: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
       167: invokevirtual #205                // Method ext/mods/gameserver/model/actor/ai/Desire.setWeight:(D)V
       170: goto          194
       173: aload         8
       175: invokevirtual #202                // Method ext/mods/gameserver/model/actor/ai/Desire.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
       178: aload_2
       179: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
       182: if_acmpne     194
       185: aload         8
       187: aload_2
       188: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
       191: invokevirtual #205                // Method ext/mods/gameserver/model/actor/ai/Desire.setWeight:(D)V
       194: goto          116
       197: return
      LineNumberTable:
        line 204: 0
        line 205: 8
        line 207: 9
        line 208: 14
        line 209: 18
        line 211: 19
        line 212: 53
        line 213: 57
        line 215: 58
        line 216: 63
        line 218: 69
        line 219: 77
        line 221: 84
        line 222: 92
        line 224: 99
        line 226: 138
        line 228: 149
        line 229: 161
        line 230: 173
        line 231: 185
        line 233: 194
        line 234: 197
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          138      56     8 desire   Lext/mods/gameserver/model/actor/ai/Desire;
            0     198     0  this   Lext/mods/gameserver/model/actor/container/attackable/AggroList;
           14     184     1 mostHatedInfo   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
           53     145     2 randomInfo   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
           63     135     3 mostHate   D
           69     129     5 randomHate   D
      StackMapTable: number_of_entries = 7
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/actor/container/npc/AggroInfo ]
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/actor/container/npc/AggroInfo ]
        frame_type = 254 /* append */
          offset_delta = 57
          locals = [ double, double, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/actor/ai/Desire ]
        frame_type = 250 /* chop */
          offset_delta = 20
        frame_type = 250 /* chop */
          offset_delta = 2

  public void refresh();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: aload_0
         1: invokevirtual #42                 // Method isEmpty:()Z
         4: ifeq          8
         7: return
         8: aload_0
         9: invokevirtual #51                 // Method values:()Ljava/util/Collection;
        12: invokeinterface #124,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        17: astore_1
        18: aload_1
        19: invokeinterface #128,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        24: ifeq          103
        27: aload_1
        28: invokeinterface #133,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        33: checkcast     #23                 // class ext/mods/gameserver/model/actor/container/npc/AggroInfo
        36: astore_2
        37: aload_2
        38: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
        41: astore_3
        42: aload_3
        43: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
        46: ifeq          56
        49: aload_2
        50: invokevirtual #103                // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.stopHate:()V
        53: goto          100
        56: aload_3
        57: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Creature.isVisible:()Z
        60: ifeq          94
        63: aload_0
        64: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Npc;
        67: aload_3
        68: invokevirtual #212                // Method ext/mods/gameserver/model/actor/Npc.knows:(Lext/mods/gameserver/model/WorldObject;)Z
        71: ifeq          94
        74: aload_3
        75: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        78: ifnull        100
        81: aload_3
        82: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        85: invokevirtual #220                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        88: invokevirtual #226                // Method ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
        91: ifne          100
        94: aload_0
        95: aload_3
        96: invokevirtual #229                // Method remove:(Ljava/lang/Object;)Ljava/lang/Object;
        99: pop
       100: goto          18
       103: return
      LineNumberTable:
        line 245: 0
        line 246: 7
        line 248: 8
        line 250: 37
        line 252: 42
        line 253: 49
        line 254: 56
        line 255: 94
        line 256: 100
        line 257: 103
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42      58     3 creature   Lext/mods/gameserver/model/actor/Creature;
           37      63     2    ai   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
            0     104     0  this   Lext/mods/gameserver/model/actor/container/attackable/AggroList;
      StackMapTable: number_of_entries = 6
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/actor/container/npc/AggroInfo, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 37 /* same */
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 2
}
Signature: #286                         // Ljava/util/concurrent/ConcurrentHashMap<Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/container/npc/AggroInfo;>;
SourceFile: "AggroList.java"
BootstrapMethods:
  0: #308 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #290 (Ljava/lang/Object;)Ljava/lang/Object;
      #291 REF_newInvokeSpecial ext/mods/gameserver/model/actor/container/npc/AggroInfo."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
      #294 (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
  1: #308 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #296 (Ljava/lang/Object;)Z
      #298 REF_invokeStatic ext/mods/gameserver/model/actor/container/attackable/AggroList.lambda$getMostHated$0:(Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Z
      #301 (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Z
  2: #308 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #290 (Ljava/lang/Object;)Ljava/lang/Object;
      #302 REF_invokeVirtual ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
      #303 (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Ljava/lang/Double;
  3: #308 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #296 (Ljava/lang/Object;)Z
      #305 REF_invokeVirtual ext/mods/gameserver/model/actor/container/attackable/AggroList.lambda$randomizeAttack$0:(Lext/mods/gameserver/model/actor/container/npc/AggroInfo;Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Z
      #301 (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Z
InnerClasses:
  public static final #320= #316 of #318; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
