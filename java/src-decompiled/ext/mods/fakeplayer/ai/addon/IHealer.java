// Bytecode for: ext.mods.fakeplayer.ai.addon.IHealer
// File: ext\mods\fakeplayer\ai\addon\IHealer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/ai/addon/IHealer.class
  Last modified 9 de jul de 2026; size 7978 bytes
  MD5 checksum 446ef671ffcbba3bc50394c2506417e5
  Compiled from "IHealer.java"
public interface ext.mods.fakeplayer.ai.addon.IHealer
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #14                         // ext/mods/fakeplayer/ai/addon/IHealer
  super_class: #207                       // java/lang/Object
  interfaces: 0, fields: 0, methods: 14, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
    #2 = Class              #4            // ext/mods/fakeplayer/FakePlayer
    #3 = NameAndType        #5:#6         // getTarget:()Lext/mods/gameserver/model/WorldObject;
    #4 = Utf8               ext/mods/fakeplayer/FakePlayer
    #5 = Utf8               getTarget
    #6 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Creature
    #8 = Utf8               ext/mods/gameserver/model/actor/Creature
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #10 = NameAndType        #11:#12       // isDead:()Z
   #11 = Utf8               isDead
   #12 = Utf8               ()Z
   #13 = InterfaceMethodref #14.#15       // ext/mods/fakeplayer/ai/addon/IHealer.isSamePartyOrClan:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
   #14 = Class              #16           // ext/mods/fakeplayer/ai/addon/IHealer
   #15 = NameAndType        #17:#18       // isSamePartyOrClan:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
   #16 = Utf8               ext/mods/fakeplayer/ai/addon/IHealer
   #17 = Utf8               isSamePartyOrClan
   #18 = Utf8               (Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
   #19 = Methodref          #2.#20        // ext/mods/fakeplayer/FakePlayer.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
   #20 = NameAndType        #21:#22       // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
   #21 = Utf8               setTarget
   #22 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
   #23 = Methodref          #2.#24        // ext/mods/fakeplayer/FakePlayer.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #24 = NameAndType        #25:#26       // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #25 = Utf8               getKnownTypeInRadius
   #26 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
   #27 = InterfaceMethodref #28.#29       // java/util/List.stream:()Ljava/util/stream/Stream;
   #28 = Class              #30           // java/util/List
   #29 = NameAndType        #31:#32       // stream:()Ljava/util/stream/Stream;
   #30 = Utf8               java/util/List
   #31 = Utf8               stream
   #32 = Utf8               ()Ljava/util/stream/Stream;
   #33 = InvokeDynamic      #0:#34        // #0:test:()Ljava/util/function/Predicate;
   #34 = NameAndType        #35:#36       // test:()Ljava/util/function/Predicate;
   #35 = Utf8               test
   #36 = Utf8               ()Ljava/util/function/Predicate;
   #37 = InterfaceMethodref #38.#39       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #38 = Class              #40           // java/util/stream/Stream
   #39 = NameAndType        #41:#42       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #40 = Utf8               java/util/stream/Stream
   #41 = Utf8               filter
   #42 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #43 = InvokeDynamic      #1:#34        // #1:test:()Ljava/util/function/Predicate;
   #44 = InvokeDynamic      #2:#45        // #2:apply:()Ljava/util/function/Function;
   #45 = NameAndType        #46:#47       // apply:()Ljava/util/function/Function;
   #46 = Utf8               apply
   #47 = Utf8               ()Ljava/util/function/Function;
   #48 = InterfaceMethodref #38.#49       // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #49 = NameAndType        #50:#51       // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #50 = Utf8               map
   #51 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #52 = InvokeDynamic      #3:#53        // #3:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
   #53 = NameAndType        #35:#54       // test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
   #54 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
   #55 = InvokeDynamic      #4:#53        // #4:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
   #56 = InvokeDynamic      #5:#53        // #5:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
   #57 = InvokeDynamic      #6:#58        // #6:applyAsDouble:()Ljava/util/function/ToDoubleFunction;
   #58 = NameAndType        #59:#60       // applyAsDouble:()Ljava/util/function/ToDoubleFunction;
   #59 = Utf8               applyAsDouble
   #60 = Utf8               ()Ljava/util/function/ToDoubleFunction;
   #61 = InterfaceMethodref #62.#63       // java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
   #62 = Class              #64           // java/util/Comparator
   #63 = NameAndType        #65:#66       // comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
   #64 = Utf8               java/util/Comparator
   #65 = Utf8               comparingDouble
   #66 = Utf8               (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
   #67 = InterfaceMethodref #38.#68       // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #68 = NameAndType        #69:#70       // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #69 = Utf8               sorted
   #70 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #71 = Methodref          #72.#73       // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
   #72 = Class              #74           // java/util/stream/Collectors
   #73 = NameAndType        #75:#76       // toList:()Ljava/util/stream/Collector;
   #74 = Utf8               java/util/stream/Collectors
   #75 = Utf8               toList
   #76 = Utf8               ()Ljava/util/stream/Collector;
   #77 = InterfaceMethodref #38.#78       // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #78 = NameAndType        #79:#80       // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #79 = Utf8               collect
   #80 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
   #81 = Methodref          #2.#10        // ext/mods/fakeplayer/FakePlayer.isDead:()Z
   #82 = Methodref          #2.#83        // ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #83 = NameAndType        #84:#85       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #84 = Utf8               getStatus
   #85 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #86 = Methodref          #87.#88       // ext/mods/gameserver/model/actor/status/PlayerStatus.getHpRatio:()D
   #87 = Class              #89           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #88 = NameAndType        #90:#91       // getHpRatio:()D
   #89 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #90 = Utf8               getHpRatio
   #91 = Utf8               ()D
   #92 = Double             0.8d
   #94 = InterfaceMethodref #28.#95       // java/util/List.add:(Ljava/lang/Object;)Z
   #95 = NameAndType        #96:#97       // add:(Ljava/lang/Object;)Z
   #96 = Utf8               add
   #97 = Utf8               (Ljava/lang/Object;)Z
   #98 = InterfaceMethodref #28.#99       // java/util/List.isEmpty:()Z
   #99 = NameAndType        #100:#12      // isEmpty:()Z
  #100 = Utf8               isEmpty
  #101 = InterfaceMethodref #28.#102      // java/util/List.iterator:()Ljava/util/Iterator;
  #102 = NameAndType        #103:#104     // iterator:()Ljava/util/Iterator;
  #103 = Utf8               iterator
  #104 = Utf8               ()Ljava/util/Iterator;
  #105 = InterfaceMethodref #106.#107     // java/util/Iterator.hasNext:()Z
  #106 = Class              #108          // java/util/Iterator
  #107 = NameAndType        #109:#12      // hasNext:()Z
  #108 = Utf8               java/util/Iterator
  #109 = Utf8               hasNext
  #110 = InterfaceMethodref #106.#111     // java/util/Iterator.next:()Ljava/lang/Object;
  #111 = NameAndType        #112:#113     // next:()Ljava/lang/Object;
  #112 = Utf8               next
  #113 = Utf8               ()Ljava/lang/Object;
  #114 = Methodref          #115.#116     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #115 = Class              #117          // ext/mods/gameserver/model/World
  #116 = NameAndType        #118:#119     // getInstance:()Lext/mods/gameserver/model/World;
  #117 = Utf8               ext/mods/gameserver/model/World
  #118 = Utf8               getInstance
  #119 = Utf8               ()Lext/mods/gameserver/model/World;
  #120 = Methodref          #115.#121     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #121 = NameAndType        #122:#123     // getPlayers:()Ljava/util/Collection;
  #122 = Utf8               getPlayers
  #123 = Utf8               ()Ljava/util/Collection;
  #124 = InterfaceMethodref #125.#29      // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #125 = Class              #126          // java/util/Collection
  #126 = Utf8               java/util/Collection
  #127 = InvokeDynamic      #7:#53        // #7:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
  #128 = InvokeDynamic      #8:#45        // #8:apply:()Ljava/util/function/Function;
  #129 = InvokeDynamic      #9:#53        // #9:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
  #130 = InvokeDynamic      #10:#53       // #10:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
  #131 = InterfaceMethodref #38.#132      // java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
  #132 = NameAndType        #133:#134     // anyMatch:(Ljava/util/function/Predicate;)Z
  #133 = Utf8               anyMatch
  #134 = Utf8               (Ljava/util/function/Predicate;)Z
  #135 = Methodref          #2.#136       // ext/mods/fakeplayer/FakePlayer.getAi:()Lext/mods/fakeplayer/ai/FakePlayerAI;
  #136 = NameAndType        #137:#138     // getAi:()Lext/mods/fakeplayer/ai/FakePlayerAI;
  #137 = Utf8               getAi
  #138 = Utf8               ()Lext/mods/fakeplayer/ai/FakePlayerAI;
  #139 = Class              #140          // ext/mods/fakeplayer/ai/CombatAI
  #140 = Utf8               ext/mods/fakeplayer/ai/CombatAI
  #141 = Methodref          #139.#142     // ext/mods/fakeplayer/ai/CombatAI.getBestAvailableHealingSpell:()Lext/mods/fakeplayer/model/HealingSpell;
  #142 = NameAndType        #143:#144     // getBestAvailableHealingSpell:()Lext/mods/fakeplayer/model/HealingSpell;
  #143 = Utf8               getBestAvailableHealingSpell
  #144 = Utf8               ()Lext/mods/fakeplayer/model/HealingSpell;
  #145 = Fieldref           #146.#147     // ext/mods/fakeplayer/ai/addon/IHealer$1.$SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
  #146 = Class              #148          // ext/mods/fakeplayer/ai/addon/IHealer$1
  #147 = NameAndType        #149:#150     // $SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
  #148 = Utf8               ext/mods/fakeplayer/ai/addon/IHealer$1
  #149 = Utf8               $SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition
  #150 = Utf8               [I
  #151 = Methodref          #152.#153     // ext/mods/fakeplayer/model/HealingSpell.getCondition:()Lext/mods/fakeplayer/model/SpellUsageCondition;
  #152 = Class              #154          // ext/mods/fakeplayer/model/HealingSpell
  #153 = NameAndType        #155:#156     // getCondition:()Lext/mods/fakeplayer/model/SpellUsageCondition;
  #154 = Utf8               ext/mods/fakeplayer/model/HealingSpell
  #155 = Utf8               getCondition
  #156 = Utf8               ()Lext/mods/fakeplayer/model/SpellUsageCondition;
  #157 = Methodref          #158.#159     // ext/mods/fakeplayer/model/SpellUsageCondition.ordinal:()I
  #158 = Class              #160          // ext/mods/fakeplayer/model/SpellUsageCondition
  #159 = NameAndType        #161:#162     // ordinal:()I
  #160 = Utf8               ext/mods/fakeplayer/model/SpellUsageCondition
  #161 = Utf8               ordinal
  #162 = Utf8               ()I
  #163 = Methodref          #7.#164       // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #164 = NameAndType        #84:#165      // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #165 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #166 = Methodref          #167.#168     // ext/mods/gameserver/model/actor/status/CreatureStatus.getHp:()D
  #167 = Class              #169          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #168 = NameAndType        #170:#91      // getHp:()D
  #169 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #170 = Utf8               getHp
  #171 = Methodref          #167.#172     // ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
  #172 = NameAndType        #173:#162     // getMaxHp:()I
  #173 = Utf8               getMaxHp
  #174 = Double             100.0d
  #176 = Methodref          #152.#177     // ext/mods/fakeplayer/model/HealingSpell.getConditionValue:()I
  #177 = NameAndType        #178:#162     // getConditionValue:()I
  #178 = Utf8               getConditionValue
  #179 = Methodref          #152.#180     // ext/mods/fakeplayer/model/HealingSpell.getSkillId:()I
  #180 = NameAndType        #181:#162     // getSkillId:()I
  #181 = Utf8               getSkillId
  #182 = Methodref          #2.#183       // ext/mods/fakeplayer/FakePlayer.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #183 = NameAndType        #184:#185     // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #184 = Utf8               getSkill
  #185 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #186 = Methodref          #187.#188     // ext/mods/fakeplayer/ai/FakePlayerAI.castSpell:(Lext/mods/gameserver/skills/L2Skill;)V
  #187 = Class              #189          // ext/mods/fakeplayer/ai/FakePlayerAI
  #188 = NameAndType        #190:#191     // castSpell:(Lext/mods/gameserver/skills/L2Skill;)V
  #189 = Utf8               ext/mods/fakeplayer/ai/FakePlayerAI
  #190 = Utf8               castSpell
  #191 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)V
  #192 = Methodref          #2.#193       // ext/mods/fakeplayer/FakePlayer.getParty:()Lext/mods/gameserver/model/group/Party;
  #193 = NameAndType        #194:#195     // getParty:()Lext/mods/gameserver/model/group/Party;
  #194 = Utf8               getParty
  #195 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #196 = Methodref          #197.#198     // ext/mods/gameserver/model/group/Party.equals:(Lext/mods/gameserver/model/group/Party;)Z
  #197 = Class              #199          // ext/mods/gameserver/model/group/Party
  #198 = NameAndType        #200:#201     // equals:(Lext/mods/gameserver/model/group/Party;)Z
  #199 = Utf8               ext/mods/gameserver/model/group/Party
  #200 = Utf8               equals
  #201 = Utf8               (Lext/mods/gameserver/model/group/Party;)Z
  #202 = Methodref          #2.#203       // ext/mods/fakeplayer/FakePlayer.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #203 = NameAndType        #204:#205     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #204 = Utf8               getClan
  #205 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #206 = Methodref          #207.#208     // java/lang/Object.equals:(Ljava/lang/Object;)Z
  #207 = Class              #209          // java/lang/Object
  #208 = NameAndType        #200:#97      // equals:(Ljava/lang/Object;)Z
  #209 = Utf8               java/lang/Object
  #210 = Methodref          #87.#168      // ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
  #211 = Methodref          #212.#213     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #212 = Class              #214          // ext/mods/gameserver/geoengine/GeoEngine
  #213 = NameAndType        #118:#215     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #214 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #215 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #216 = Methodref          #2.#217       // ext/mods/fakeplayer/FakePlayer.getX:()I
  #217 = NameAndType        #218:#162     // getX:()I
  #218 = Utf8               getX
  #219 = Methodref          #2.#220       // ext/mods/fakeplayer/FakePlayer.getY:()I
  #220 = NameAndType        #221:#162     // getY:()I
  #221 = Utf8               getY
  #222 = Methodref          #2.#223       // ext/mods/fakeplayer/FakePlayer.getZ:()I
  #223 = NameAndType        #224:#162     // getZ:()I
  #224 = Utf8               getZ
  #225 = Methodref          #212.#226     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
  #226 = NameAndType        #227:#228     // canMoveToTarget:(IIIIII)Z
  #227 = Utf8               canMoveToTarget
  #228 = Utf8               (IIIIII)Z
  #229 = Methodref          #212.#230     // ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #230 = NameAndType        #231:#232     // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #231 = Utf8               canSeeTarget
  #232 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #233 = Utf8               tryTargetingLowestHpAllyInRadius
  #234 = Utf8               (Lext/mods/fakeplayer/FakePlayer;Ljava/lang/Class;I)V
  #235 = Utf8               Code
  #236 = Utf8               LineNumberTable
  #237 = Utf8               LocalVariableTable
  #238 = Utf8               fake
  #239 = Utf8               Lext/mods/fakeplayer/FakePlayer;
  #240 = Utf8               currentTarget
  #241 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #242 = Utf8               alreadyTargetedByAllyHealer
  #243 = Utf8               Z
  #244 = Utf8               target
  #245 = Utf8               this
  #246 = Utf8               Lext/mods/fakeplayer/ai/addon/IHealer;
  #247 = Utf8               healer
  #248 = Utf8               creatureClass
  #249 = Utf8               Ljava/lang/Class;
  #250 = Utf8               radius
  #251 = Utf8               I
  #252 = Utf8               potentialTargets
  #253 = Utf8               Ljava/util/List;
  #254 = Utf8               LocalVariableTypeTable
  #255 = Utf8               Ljava/lang/Class<+Lext/mods/gameserver/model/actor/Creature;>;
  #256 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/FakePlayer;>;
  #257 = Utf8               StackMapTable
  #258 = Utf8               Signature
  #259 = Utf8               (Lext/mods/fakeplayer/FakePlayer;Ljava/lang/Class<+Lext/mods/gameserver/model/actor/Creature;>;I)V
  #260 = Utf8               tryHealingTarget
  #261 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)V
  #262 = Utf8               currentHpPercentage
  #263 = Utf8               D
  #264 = Utf8               skill
  #265 = Utf8               Lext/mods/fakeplayer/model/HealingSpell;
  #266 = Utf8               player
  #267 = Utf8               player1
  #268 = Utf8               player2
  #269 = Utf8               lambda$tryTargetingLowestHpAllyInRadius$10
  #270 = Utf8               p
  #271 = Utf8               lambda$tryTargetingLowestHpAllyInRadius$9
  #272 = Utf8               lambda$tryTargetingLowestHpAllyInRadius$8
  #273 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
  #274 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #275 = Utf8               lambda$tryTargetingLowestHpAllyInRadius$7
  #276 = Utf8               (Lext/mods/fakeplayer/FakePlayer;Lext/mods/gameserver/model/actor/Player;)Z
  #277 = Utf8               lambda$tryTargetingLowestHpAllyInRadius$6
  #278 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)D
  #279 = Utf8               c
  #280 = Utf8               lambda$tryTargetingLowestHpAllyInRadius$5
  #281 = Utf8               ally
  #282 = Utf8               lambda$tryTargetingLowestHpAllyInRadius$4
  #283 = Utf8               lambda$tryTargetingLowestHpAllyInRadius$3
  #284 = Utf8               lambda$tryTargetingLowestHpAllyInRadius$2
  #285 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/fakeplayer/FakePlayer;
  #286 = Utf8               creature
  #287 = Utf8               lambda$tryTargetingLowestHpAllyInRadius$1
  #288 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #289 = Utf8               lambda$tryTargetingLowestHpAllyInRadius$0
  #290 = Utf8               SourceFile
  #291 = Utf8               IHealer.java
  #292 = Utf8               NestMembers
  #293 = Utf8               BootstrapMethods
  #294 = MethodType         #97           //  (Ljava/lang/Object;)Z
  #295 = MethodHandle       6:#296        // REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #296 = InterfaceMethodref #14.#297      // ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #297 = NameAndType        #289:#288     // lambda$tryTargetingLowestHpAllyInRadius$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #298 = MethodType         #288          //  (Lext/mods/gameserver/model/actor/Creature;)Z
  #299 = MethodHandle       6:#300        // REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$1:(Lext/mods/gameserver/model/actor/Creature;)Z
  #300 = InterfaceMethodref #14.#301      // ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$1:(Lext/mods/gameserver/model/actor/Creature;)Z
  #301 = NameAndType        #287:#288     // lambda$tryTargetingLowestHpAllyInRadius$1:(Lext/mods/gameserver/model/actor/Creature;)Z
  #302 = MethodType         #303          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #303 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #304 = MethodHandle       6:#305        // REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$2:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/fakeplayer/FakePlayer;
  #305 = InterfaceMethodref #14.#306      // ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$2:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/fakeplayer/FakePlayer;
  #306 = NameAndType        #284:#285     // lambda$tryTargetingLowestHpAllyInRadius$2:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/fakeplayer/FakePlayer;
  #307 = MethodType         #285          //  (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/fakeplayer/FakePlayer;
  #308 = MethodHandle       6:#309        // REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$3:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #309 = InterfaceMethodref #14.#310      // ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$3:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #310 = NameAndType        #283:#18      // lambda$tryTargetingLowestHpAllyInRadius$3:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #311 = MethodType         #312          //  (Lext/mods/fakeplayer/FakePlayer;)Z
  #312 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)Z
  #313 = MethodHandle       6:#314        // REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$4:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #314 = InterfaceMethodref #14.#315      // ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$4:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #315 = NameAndType        #282:#18      // lambda$tryTargetingLowestHpAllyInRadius$4:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #316 = MethodHandle       6:#317        // REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$5:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #317 = InterfaceMethodref #14.#318      // ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$5:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #318 = NameAndType        #280:#18      // lambda$tryTargetingLowestHpAllyInRadius$5:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #319 = MethodType         #320          //  (Ljava/lang/Object;)D
  #320 = Utf8               (Ljava/lang/Object;)D
  #321 = MethodHandle       6:#322        // REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$6:(Lext/mods/fakeplayer/FakePlayer;)D
  #322 = InterfaceMethodref #14.#323      // ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$6:(Lext/mods/fakeplayer/FakePlayer;)D
  #323 = NameAndType        #277:#278     // lambda$tryTargetingLowestHpAllyInRadius$6:(Lext/mods/fakeplayer/FakePlayer;)D
  #324 = MethodType         #278          //  (Lext/mods/fakeplayer/FakePlayer;)D
  #325 = MethodHandle       6:#326        // REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$7:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/gameserver/model/actor/Player;)Z
  #326 = InterfaceMethodref #14.#327      // ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$7:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/gameserver/model/actor/Player;)Z
  #327 = NameAndType        #275:#276     // lambda$tryTargetingLowestHpAllyInRadius$7:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/gameserver/model/actor/Player;)Z
  #328 = MethodType         #329          //  (Lext/mods/gameserver/model/actor/Player;)Z
  #329 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #330 = MethodHandle       6:#331        // REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$8:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
  #331 = InterfaceMethodref #14.#332      // ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$8:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
  #332 = NameAndType        #272:#273     // lambda$tryTargetingLowestHpAllyInRadius$8:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
  #333 = MethodType         #273          //  (Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
  #334 = MethodHandle       6:#335        // REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$9:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #335 = InterfaceMethodref #14.#336      // ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$9:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #336 = NameAndType        #271:#18      // lambda$tryTargetingLowestHpAllyInRadius$9:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #337 = MethodHandle       6:#338        // REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$10:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #338 = InterfaceMethodref #14.#339      // ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$10:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #339 = NameAndType        #269:#18      // lambda$tryTargetingLowestHpAllyInRadius$10:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #340 = MethodHandle       6:#341        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #341 = Methodref          #342.#343     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #342 = Class              #344          // java/lang/invoke/LambdaMetafactory
  #343 = NameAndType        #345:#346     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #344 = Utf8               java/lang/invoke/LambdaMetafactory
  #345 = Utf8               metafactory
  #346 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #347 = Utf8               InnerClasses
  #348 = Class              #349          // java/lang/invoke/MethodHandles$Lookup
  #349 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #350 = Class              #351          // java/lang/invoke/MethodHandles
  #351 = Utf8               java/lang/invoke/MethodHandles
  #352 = Utf8               Lookup
{
  public default void tryTargetingLowestHpAllyInRadius(ext.mods.fakeplayer.FakePlayer, java.lang.Class<? extends ext.mods.gameserver.model.actor.Creature>, int);
    descriptor: (Lext/mods/fakeplayer/FakePlayer;Ljava/lang/Class;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=4
         0: aload_1
         1: invokevirtual #1                  // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
         4: astore        5
         6: aload         5
         8: instanceof    #7                  // class ext/mods/gameserver/model/actor/Creature
        11: ifeq          59
        14: aload         5
        16: checkcast     #7                  // class ext/mods/gameserver/model/actor/Creature
        19: astore        4
        21: aload         4
        23: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        26: ifne          54
        29: aload         4
        31: instanceof    #2                  // class ext/mods/fakeplayer/FakePlayer
        34: ifeq          54
        37: aload         4
        39: checkcast     #2                  // class ext/mods/fakeplayer/FakePlayer
        42: astore        5
        44: aload_1
        45: aload         5
        47: invokestatic  #13                 // InterfaceMethod isSamePartyOrClan:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
        50: ifeq          54
        53: return
        54: aload_1
        55: aconst_null
        56: invokevirtual #19                 // Method ext/mods/fakeplayer/FakePlayer.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
        59: aload_1
        60: aload_2
        61: iload_3
        62: invokevirtual #23                 // Method ext/mods/fakeplayer/FakePlayer.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
        65: invokeinterface #27,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        70: invokedynamic #33,  0             // InvokeDynamic #0:test:()Ljava/util/function/Predicate;
        75: invokeinterface #37,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        80: invokedynamic #43,  0             // InvokeDynamic #1:test:()Ljava/util/function/Predicate;
        85: invokeinterface #37,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        90: invokedynamic #44,  0             // InvokeDynamic #2:apply:()Ljava/util/function/Function;
        95: invokeinterface #48,  2           // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
       100: aload_1
       101: invokedynamic #52,  0             // InvokeDynamic #3:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
       106: invokeinterface #37,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       111: aload_1
       112: invokedynamic #55,  0             // InvokeDynamic #4:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
       117: invokeinterface #37,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       122: aload_1
       123: invokedynamic #56,  0             // InvokeDynamic #5:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
       128: invokeinterface #37,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       133: invokedynamic #57,  0             // InvokeDynamic #6:applyAsDouble:()Ljava/util/function/ToDoubleFunction;
       138: invokestatic  #61                 // InterfaceMethod java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
       141: invokeinterface #67,  2           // InterfaceMethod java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
       146: invokestatic  #71                 // Method java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
       149: invokeinterface #77,  2           // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
       154: checkcast     #28                 // class java/util/List
       157: astore        4
       159: aload_1
       160: invokevirtual #81                 // Method ext/mods/fakeplayer/FakePlayer.isDead:()Z
       163: ifne          189
       166: aload_1
       167: invokevirtual #82                 // Method ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       170: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getHpRatio:()D
       173: ldc2_w        #92                 // double 0.8d
       176: dcmpg
       177: ifge          189
       180: aload         4
       182: aload_1
       183: invokeinterface #94,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       188: pop
       189: aload         4
       191: invokeinterface #98,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       196: ifeq          219
       199: aload_1
       200: invokevirtual #82                 // Method ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       203: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getHpRatio:()D
       206: ldc2_w        #92                 // double 0.8d
       209: dcmpg
       210: ifge          219
       213: aload_1
       214: aload_1
       215: invokevirtual #19                 // Method ext/mods/fakeplayer/FakePlayer.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
       218: return
       219: aload         4
       221: invokeinterface #101,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       226: astore        5
       228: aload         5
       230: invokeinterface #105,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       235: ifeq          322
       238: aload         5
       240: invokeinterface #110,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       245: checkcast     #2                  // class ext/mods/fakeplayer/FakePlayer
       248: astore        6
       250: invokestatic  #114                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       253: invokevirtual #120                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
       256: invokeinterface #124,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
       261: aload_1
       262: invokedynamic #127,  0            // InvokeDynamic #7:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
       267: invokeinterface #37,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       272: invokedynamic #128,  0            // InvokeDynamic #8:apply:()Ljava/util/function/Function;
       277: invokeinterface #48,  2           // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
       282: aload_1
       283: invokedynamic #129,  0            // InvokeDynamic #9:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
       288: invokeinterface #37,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       293: aload         6
       295: invokedynamic #130,  0            // InvokeDynamic #10:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
       300: invokeinterface #131,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
       305: istore        7
       307: iload         7
       309: ifne          319
       312: aload_1
       313: aload         6
       315: invokevirtual #19                 // Method ext/mods/fakeplayer/FakePlayer.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
       318: return
       319: goto          228
       322: return
      LineNumberTable:
        line 36: 0
        line 38: 21
        line 39: 53
        line 41: 54
        line 44: 59
        line 46: 159
        line 47: 180
        line 49: 189
        line 51: 213
        line 52: 218
        line 55: 219
        line 57: 250
        line 59: 307
        line 61: 312
        line 62: 318
        line 64: 319
        line 65: 322
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44      10     5  fake   Lext/mods/fakeplayer/FakePlayer;
           21      38     4 currentTarget   Lext/mods/gameserver/model/actor/Creature;
          307      12     7 alreadyTargetedByAllyHealer   Z
          250      69     6 target   Lext/mods/fakeplayer/FakePlayer;
            0     323     0  this   Lext/mods/fakeplayer/ai/addon/IHealer;
            0     323     1 healer   Lext/mods/fakeplayer/FakePlayer;
            0     323     2 creatureClass   Ljava/lang/Class;
            0     323     3 radius   I
          159     164     4 potentialTargets   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     323     2 creatureClass   Ljava/lang/Class<+Lext/mods/gameserver/model/actor/Creature;>;
          159     164     4 potentialTargets   Ljava/util/List<Lext/mods/fakeplayer/FakePlayer;>;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 252 /* append */
          offset_delta = 129
          locals = [ class java/util/List ]
        frame_type = 29 /* same */
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 90
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #259                         // (Lext/mods/fakeplayer/FakePlayer;Ljava/lang/Class<+Lext/mods/gameserver/model/actor/Creature;>;I)V

  public default void tryHealingTarget(ext.mods.fakeplayer.FakePlayer);
    descriptor: (Lext/mods/fakeplayer/FakePlayer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=2
         0: aload_1
         1: invokevirtual #1                  // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
         4: ifnull        135
         7: aload_1
         8: invokevirtual #1                  // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
        11: instanceof    #7                  // class ext/mods/gameserver/model/actor/Creature
        14: ifeq          135
        17: aload_1
        18: invokevirtual #1                  // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
        21: checkcast     #7                  // class ext/mods/gameserver/model/actor/Creature
        24: astore_2
        25: aload_2
        26: ifnull        135
        29: aload_1
        30: invokevirtual #135                // Method ext/mods/fakeplayer/FakePlayer.getAi:()Lext/mods/fakeplayer/ai/FakePlayerAI;
        33: instanceof    #139                // class ext/mods/fakeplayer/ai/CombatAI
        36: ifeq          135
        39: aload_1
        40: invokevirtual #135                // Method ext/mods/fakeplayer/FakePlayer.getAi:()Lext/mods/fakeplayer/ai/FakePlayerAI;
        43: checkcast     #139                // class ext/mods/fakeplayer/ai/CombatAI
        46: invokevirtual #141                // Method ext/mods/fakeplayer/ai/CombatAI.getBestAvailableHealingSpell:()Lext/mods/fakeplayer/model/HealingSpell;
        49: astore_3
        50: aload_3
        51: ifnull        135
        54: getstatic     #145                // Field ext/mods/fakeplayer/ai/addon/IHealer$1.$SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
        57: aload_3
        58: invokevirtual #151                // Method ext/mods/fakeplayer/model/HealingSpell.getCondition:()Lext/mods/fakeplayer/model/SpellUsageCondition;
        61: invokevirtual #157                // Method ext/mods/fakeplayer/model/SpellUsageCondition.ordinal:()I
        64: iaload
        65: lookupswitch  { // 1

                       1: 84
                 default: 135
            }
        84: aload_2
        85: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        88: invokevirtual #166                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getHp:()D
        91: aload_2
        92: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        95: invokevirtual #171                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
        98: i2d
        99: ddiv
       100: ldc2_w        #174                // double 100.0d
       103: dmul
       104: dstore        4
       106: dload         4
       108: aload_3
       109: invokevirtual #176                // Method ext/mods/fakeplayer/model/HealingSpell.getConditionValue:()I
       112: i2d
       113: dcmpg
       114: ifgt          135
       117: aload_1
       118: invokevirtual #135                // Method ext/mods/fakeplayer/FakePlayer.getAi:()Lext/mods/fakeplayer/ai/FakePlayerAI;
       121: aload_1
       122: aload_3
       123: invokevirtual #179                // Method ext/mods/fakeplayer/model/HealingSpell.getSkillId:()I
       126: invokevirtual #182                // Method ext/mods/fakeplayer/FakePlayer.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
       129: invokevirtual #186                // Method ext/mods/fakeplayer/ai/FakePlayerAI.castSpell:(Lext/mods/gameserver/skills/L2Skill;)V
       132: goto          135
       135: return
      LineNumberTable:
        line 70: 0
        line 72: 17
        line 73: 25
        line 75: 29
        line 77: 39
        line 79: 50
        line 82: 54
        line 85: 84
        line 87: 106
        line 89: 117
        line 101: 135
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          106      29     4 currentHpPercentage   D
           50      85     3 skill   Lext/mods/fakeplayer/model/HealingSpell;
           25     110     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     136     0  this   Lext/mods/fakeplayer/ai/addon/IHealer;
            0     136     1 player   Lext/mods/fakeplayer/FakePlayer;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 84
          locals = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/fakeplayer/model/HealingSpell ]
        frame_type = 249 /* chop */
          offset_delta = 50
}
SourceFile: "IHealer.java"
NestMembers:
  ext/mods/fakeplayer/ai/addon/IHealer$1
BootstrapMethods:
  0: #340 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #294 (Ljava/lang/Object;)Z
      #295 REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$0:(Lext/mods/gameserver/model/actor/Creature;)Z
      #298 (Lext/mods/gameserver/model/actor/Creature;)Z
  1: #340 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #294 (Ljava/lang/Object;)Z
      #299 REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$1:(Lext/mods/gameserver/model/actor/Creature;)Z
      #298 (Lext/mods/gameserver/model/actor/Creature;)Z
  2: #340 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 (Ljava/lang/Object;)Ljava/lang/Object;
      #304 REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$2:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/fakeplayer/FakePlayer;
      #307 (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/fakeplayer/FakePlayer;
  3: #340 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #294 (Ljava/lang/Object;)Z
      #308 REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$3:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
      #311 (Lext/mods/fakeplayer/FakePlayer;)Z
  4: #340 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #294 (Ljava/lang/Object;)Z
      #313 REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$4:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
      #311 (Lext/mods/fakeplayer/FakePlayer;)Z
  5: #340 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #294 (Ljava/lang/Object;)Z
      #316 REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$5:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
      #311 (Lext/mods/fakeplayer/FakePlayer;)Z
  6: #340 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #319 (Ljava/lang/Object;)D
      #321 REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$6:(Lext/mods/fakeplayer/FakePlayer;)D
      #324 (Lext/mods/fakeplayer/FakePlayer;)D
  7: #340 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #294 (Ljava/lang/Object;)Z
      #325 REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$7:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/gameserver/model/actor/Player;)Z
      #328 (Lext/mods/gameserver/model/actor/Player;)Z
  8: #340 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 (Ljava/lang/Object;)Ljava/lang/Object;
      #330 REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$8:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
      #333 (Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
  9: #340 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #294 (Ljava/lang/Object;)Z
      #334 REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$9:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
      #311 (Lext/mods/fakeplayer/FakePlayer;)Z
  10: #340 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #294 (Ljava/lang/Object;)Z
      #337 REF_invokeStatic ext/mods/fakeplayer/ai/addon/IHealer.lambda$tryTargetingLowestHpAllyInRadius$10:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
      #311 (Lext/mods/fakeplayer/FakePlayer;)Z
InnerClasses:
  static #146;                            // class ext/mods/fakeplayer/ai/addon/IHealer$1
  public static final #352= #348 of #350; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
