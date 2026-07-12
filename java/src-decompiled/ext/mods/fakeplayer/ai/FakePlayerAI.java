// Bytecode for: ext.mods.fakeplayer.ai.FakePlayerAI
// File: ext\mods\fakeplayer\ai\FakePlayerAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/ai/FakePlayerAI.class
  Last modified 9 de jul de 2026; size 13392 bytes
  MD5 checksum 0039df66c6b7a1fe1124eb0ca38f176c
  Compiled from "FakePlayerAI.java"
public abstract class ext.mods.fakeplayer.ai.FakePlayerAI
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/fakeplayer/ai/FakePlayerAI
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 25, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/fakeplayer/ai/FakePlayerAI._isBusyThinking:Z
    #8 = Class              #10           // ext/mods/fakeplayer/ai/FakePlayerAI
    #9 = NameAndType        #11:#12       // _isBusyThinking:Z
   #10 = Utf8               ext/mods/fakeplayer/ai/FakePlayerAI
   #11 = Utf8               _isBusyThinking
   #12 = Utf8               Z
   #13 = Fieldref           #8.#14        // ext/mods/fakeplayer/ai/FakePlayerAI.iterationsOnDeath:I
   #14 = NameAndType        #15:#16       // iterationsOnDeath:I
   #15 = Utf8               iterationsOnDeath
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/fakeplayer/ai/FakePlayerAI.toVillageIterationsOnDeath:I
   #18 = NameAndType        #19:#16       // toVillageIterationsOnDeath:I
   #19 = Utf8               toVillageIterationsOnDeath
   #20 = Fieldref           #8.#21        // ext/mods/fakeplayer/ai/FakePlayerAI._fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #21 = NameAndType        #22:#23       // _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #22 = Utf8               _fakePlayer
   #23 = Utf8               Lext/mods/fakeplayer/FakePlayer;
   #24 = Methodref          #8.#25        // ext/mods/fakeplayer/ai/FakePlayerAI.setup:()V
   #25 = NameAndType        #26:#6        // setup:()V
   #26 = Utf8               setup
   #27 = Methodref          #28.#29       // ext/mods/fakeplayer/FakePlayer.setRunning:(Z)V
   #28 = Class              #30           // ext/mods/fakeplayer/FakePlayer
   #29 = NameAndType        #31:#32       // setRunning:(Z)V
   #30 = Utf8               ext/mods/fakeplayer/FakePlayer
   #31 = Utf8               setRunning
   #32 = Utf8               (Z)V
   #33 = Methodref          #8.#34        // ext/mods/fakeplayer/ai/FakePlayerAI.getBuffs:()[[I
   #34 = NameAndType        #35:#36       // getBuffs:()[[I
   #35 = Utf8               getBuffs
   #36 = Utf8               ()[[I
   #37 = Methodref          #28.#38       // ext/mods/fakeplayer/FakePlayer.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
   #38 = NameAndType        #39:#40       // getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
   #39 = Utf8               getAllEffects
   #40 = Utf8               ()[Lext/mods/gameserver/skills/AbstractEffect;
   #41 = Methodref          #42.#43       // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #42 = Class              #44           // java/util/Arrays
   #43 = NameAndType        #45:#46       // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #44 = Utf8               java/util/Arrays
   #45 = Utf8               stream
   #46 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #47 = InvokeDynamic      #0:#48        // #0:test:()Ljava/util/function/Predicate;
   #48 = NameAndType        #49:#50       // test:()Ljava/util/function/Predicate;
   #49 = Utf8               test
   #50 = Utf8               ()Ljava/util/function/Predicate;
   #51 = InterfaceMethodref #52.#53       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #52 = Class              #54           // java/util/stream/Stream
   #53 = NameAndType        #55:#56       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #54 = Utf8               java/util/stream/Stream
   #55 = Utf8               filter
   #56 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #57 = InvokeDynamic      #1:#58        // #1:apply:()Ljava/util/function/Function;
   #58 = NameAndType        #59:#60       // apply:()Ljava/util/function/Function;
   #59 = Utf8               apply
   #60 = Utf8               ()Ljava/util/function/Function;
   #61 = InvokeDynamic      #2:#58        // #2:apply:()Ljava/util/function/Function;
   #62 = Methodref          #63.#64       // java/util/stream/Collectors.toMap:(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;
   #63 = Class              #65           // java/util/stream/Collectors
   #64 = NameAndType        #66:#67       // toMap:(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;
   #65 = Utf8               java/util/stream/Collectors
   #66 = Utf8               toMap
   #67 = Utf8               (Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;
   #68 = InterfaceMethodref #52.#69       // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #69 = NameAndType        #70:#71       // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #70 = Utf8               collect
   #71 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
   #72 = Class              #73           // java/util/Map
   #73 = Utf8               java/util/Map
   #74 = Methodref          #75.#76       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #75 = Class              #77           // java/lang/Integer
   #76 = NameAndType        #78:#79       // valueOf:(I)Ljava/lang/Integer;
   #77 = Utf8               java/lang/Integer
   #78 = Utf8               valueOf
   #79 = Utf8               (I)Ljava/lang/Integer;
   #80 = InterfaceMethodref #72.#81       // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #81 = NameAndType        #82:#83       // containsKey:(Ljava/lang/Object;)Z
   #82 = Utf8               containsKey
   #83 = Utf8               (Ljava/lang/Object;)Z
   #84 = Methodref          #85.#86       // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #85 = Class              #87           // ext/mods/gameserver/data/SkillTable
   #86 = NameAndType        #88:#89       // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #87 = Utf8               ext/mods/gameserver/data/SkillTable
   #88 = Utf8               getInstance
   #89 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #90 = Methodref          #85.#91       // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #91 = NameAndType        #92:#93       // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #92 = Utf8               getInfo
   #93 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #94 = Methodref          #95.#96       // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #95 = Class              #97           // ext/mods/gameserver/skills/L2Skill
   #96 = NameAndType        #98:#99       // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #97 = Utf8               ext/mods/gameserver/skills/L2Skill
   #98 = Utf8               getEffects
   #99 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #100 = InterfaceMethodref #72.#101      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #101 = NameAndType        #102:#103     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #102 = Utf8               get
  #103 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #104 = Class              #105          // ext/mods/gameserver/skills/AbstractEffect
  #105 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #106 = Methodref          #104.#107     // ext/mods/gameserver/skills/AbstractEffect.getPeriod:()I
  #107 = NameAndType        #108:#109     // getPeriod:()I
  #108 = Utf8               getPeriod
  #109 = Utf8               ()I
  #110 = Methodref          #104.#111     // ext/mods/gameserver/skills/AbstractEffect.getTime:()I
  #111 = NameAndType        #112:#109     // getTime:()I
  #112 = Utf8               getTime
  #113 = Class              #114          // java/lang/Exception
  #114 = Utf8               java/lang/Exception
  #115 = Methodref          #113.#116     // java/lang/Exception.printStackTrace:()V
  #116 = NameAndType        #117:#6       // printStackTrace:()V
  #117 = Utf8               printStackTrace
  #118 = Methodref          #28.#119      // ext/mods/fakeplayer/FakePlayer.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #119 = NameAndType        #120:#121     // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #120 = Utf8               getCast
  #121 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #122 = Methodref          #123.#124     // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
  #123 = Class              #125          // ext/mods/gameserver/model/actor/cast/PlayerCast
  #124 = NameAndType        #126:#127     // isCastingNow:()Z
  #125 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #126 = Utf8               isCastingNow
  #127 = Utf8               ()Z
  #128 = Methodref          #95.#129      // ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #129 = NameAndType        #130:#131     // getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #130 = Utf8               getTargetType
  #131 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #132 = Fieldref           #133.#134     // ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #133 = Class              #135          // ext/mods/gameserver/enums/skills/SkillTargetType
  #134 = NameAndType        #136:#137     // GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #135 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #136 = Utf8               GROUND
  #137 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #138 = Methodref          #28.#139      // ext/mods/fakeplayer/FakePlayer.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #139 = NameAndType        #140:#141     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #140 = Utf8               getAI
  #141 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #142 = Class              #143          // ext/mods/gameserver/model/location/Location
  #143 = Utf8               ext/mods/gameserver/model/location/Location
  #144 = Methodref          #28.#145      // ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #145 = NameAndType        #146:#147     // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #146 = Utf8               getTarget
  #147 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #148 = Methodref          #149.#150     // ext/mods/gameserver/model/WorldObject.getX:()I
  #149 = Class              #151          // ext/mods/gameserver/model/WorldObject
  #150 = NameAndType        #152:#109     // getX:()I
  #151 = Utf8               ext/mods/gameserver/model/WorldObject
  #152 = Utf8               getX
  #153 = Methodref          #28.#154      // ext/mods/fakeplayer/FakePlayer.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #154 = NameAndType        #155:#156     // getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #155 = Utf8               getTemplate
  #156 = Utf8               ()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #157 = Methodref          #158.#159     // ext/mods/gameserver/model/actor/template/PlayerTemplate.getCollisionRadius:()D
  #158 = Class              #160          // ext/mods/gameserver/model/actor/template/PlayerTemplate
  #159 = NameAndType        #161:#162     // getCollisionRadius:()D
  #160 = Utf8               ext/mods/gameserver/model/actor/template/PlayerTemplate
  #161 = Utf8               getCollisionRadius
  #162 = Utf8               ()D
  #163 = Methodref          #149.#164     // ext/mods/gameserver/model/WorldObject.getY:()I
  #164 = NameAndType        #165:#109     // getY:()I
  #165 = Utf8               getY
  #166 = Methodref          #149.#167     // ext/mods/gameserver/model/WorldObject.getZ:()I
  #167 = NameAndType        #168:#109     // getZ:()I
  #168 = Utf8               getZ
  #169 = Methodref          #142.#170     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #170 = NameAndType        #5:#171       // "<init>":(III)V
  #171 = Utf8               (III)V
  #172 = Methodref          #173.#174     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #173 = Class              #175          // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #174 = NameAndType        #176:#177     // tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #175 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #176 = Utf8               tryToMoveTo
  #177 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #178 = Methodref          #8.#179       // ext/mods/fakeplayer/ai/FakePlayerAI.checkTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
  #179 = NameAndType        #180:#181     // checkTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
  #180 = Utf8               checkTargetLost
  #181 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #182 = Methodref          #95.#183      // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
  #183 = NameAndType        #184:#127     // isOffensive:()Z
  #184 = Utf8               isOffensive
  #185 = Methodref          #28.#186      // ext/mods/fakeplayer/FakePlayer.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #186 = NameAndType        #187:#188     // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #187 = Utf8               setTarget
  #188 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #189 = Methodref          #123.#190     // ext/mods/gameserver/model/actor/cast/PlayerCast.stop:()V
  #190 = NameAndType        #191:#6       // stop:()V
  #191 = Utf8               stop
  #192 = Methodref          #95.#193      // ext/mods/gameserver/skills/L2Skill.getHitTime:()I
  #193 = NameAndType        #194:#109     // getHitTime:()I
  #194 = Utf8               getHitTime
  #195 = Methodref          #95.#196      // ext/mods/gameserver/skills/L2Skill.isSimultaneousCast:()Z
  #196 = NameAndType        #197:#127     // isSimultaneousCast:()Z
  #197 = Utf8               isSimultaneousCast
  #198 = Methodref          #28.#199      // ext/mods/fakeplayer/FakePlayer.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #199 = NameAndType        #200:#201     // getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #200 = Utf8               getMove
  #201 = Utf8               ()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #202 = Methodref          #203.#190     // ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
  #203 = Class              #204          // ext/mods/gameserver/model/actor/move/PlayerMove
  #204 = Utf8               ext/mods/gameserver/model/actor/move/PlayerMove
  #205 = Class              #206          // ext/mods/gameserver/model/actor/Creature
  #206 = Utf8               ext/mods/gameserver/model/actor/Creature
  #207 = Methodref          #173.#208     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #208 = NameAndType        #209:#210     // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #209 = Utf8               tryToCast
  #210 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #211 = Class              #212          // ext/mods/gameserver/model/actor/Player
  #212 = Utf8               ext/mods/gameserver/model/actor/Player
  #213 = Methodref          #211.#214     // ext/mods/gameserver/model/actor/Player.isFakeDeath:()Z
  #214 = NameAndType        #215:#127     // isFakeDeath:()Z
  #215 = Utf8               isFakeDeath
  #216 = Methodref          #211.#217     // ext/mods/gameserver/model/actor/Player.stopFakeDeath:(Z)V
  #217 = NameAndType        #218:#32      // stopFakeDeath:(Z)V
  #218 = Utf8               stopFakeDeath
  #219 = Methodref          #173.#220     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
  #220 = NameAndType        #221:#6       // tryToIdle:()V
  #221 = Utf8               tryToIdle
  #222 = Methodref          #205.#223     // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #223 = NameAndType        #224:#127     // isDead:()Z
  #224 = Utf8               isDead
  #225 = Methodref          #226.#227     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #226 = Class              #228          // ext/mods/gameserver/geoengine/GeoEngine
  #227 = NameAndType        #88:#229      // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #228 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #229 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #230 = Methodref          #226.#231     // ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #231 = NameAndType        #232:#233     // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #232 = Utf8               canSeeTarget
  #233 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #234 = Methodref          #28.#150      // ext/mods/fakeplayer/FakePlayer.getX:()I
  #235 = Methodref          #28.#164      // ext/mods/fakeplayer/FakePlayer.getY:()I
  #236 = Methodref          #28.#167      // ext/mods/fakeplayer/FakePlayer.getZ:()I
  #237 = Methodref          #205.#150     // ext/mods/gameserver/model/actor/Creature.getX:()I
  #238 = Methodref          #205.#164     // ext/mods/gameserver/model/actor/Creature.getY:()I
  #239 = Methodref          #205.#167     // ext/mods/gameserver/model/actor/Creature.getZ:()I
  #240 = Methodref          #226.#241     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
  #241 = NameAndType        #242:#243     // canMoveToTarget:(IIIIII)Z
  #242 = Utf8               canMoveToTarget
  #243 = Utf8               (IIIIII)Z
  #244 = Methodref          #28.#245      // ext/mods/fakeplayer/FakePlayer.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #245 = NameAndType        #246:#247     // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #246 = Utf8               getKnownTypeInRadius
  #247 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
  #248 = InterfaceMethodref #249.#250     // java/util/List.stream:()Ljava/util/stream/Stream;
  #249 = Class              #251          // java/util/List
  #250 = NameAndType        #45:#252      // stream:()Ljava/util/stream/Stream;
  #251 = Utf8               java/util/List
  #252 = Utf8               ()Ljava/util/stream/Stream;
  #253 = InvokeDynamic      #3:#48        // #3:test:()Ljava/util/function/Predicate;
  #254 = InvokeDynamic      #4:#48        // #4:test:()Ljava/util/function/Predicate;
  #255 = InvokeDynamic      #5:#256       // #5:test:(Lext/mods/fakeplayer/ai/FakePlayerAI;)Ljava/util/function/Predicate;
  #256 = NameAndType        #49:#257      // test:(Lext/mods/fakeplayer/ai/FakePlayerAI;)Ljava/util/function/Predicate;
  #257 = Utf8               (Lext/mods/fakeplayer/ai/FakePlayerAI;)Ljava/util/function/Predicate;
  #258 = InvokeDynamic      #6:#259       // #6:applyAsDouble:(Lext/mods/fakeplayer/ai/FakePlayerAI;)Ljava/util/function/ToDoubleFunction;
  #259 = NameAndType        #260:#261     // applyAsDouble:(Lext/mods/fakeplayer/ai/FakePlayerAI;)Ljava/util/function/ToDoubleFunction;
  #260 = Utf8               applyAsDouble
  #261 = Utf8               (Lext/mods/fakeplayer/ai/FakePlayerAI;)Ljava/util/function/ToDoubleFunction;
  #262 = InterfaceMethodref #263.#264     // java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #263 = Class              #265          // java/util/Comparator
  #264 = NameAndType        #266:#267     // comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #265 = Utf8               java/util/Comparator
  #266 = Utf8               comparingDouble
  #267 = Utf8               (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #268 = InterfaceMethodref #52.#269      // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #269 = NameAndType        #270:#271     // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #270 = Utf8               sorted
  #271 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #272 = Methodref          #63.#273      // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
  #273 = NameAndType        #274:#275     // toList:()Ljava/util/stream/Collector;
  #274 = Utf8               toList
  #275 = Utf8               ()Ljava/util/stream/Collector;
  #276 = InterfaceMethodref #249.#277     // java/util/List.iterator:()Ljava/util/Iterator;
  #277 = NameAndType        #278:#279     // iterator:()Ljava/util/Iterator;
  #278 = Utf8               iterator
  #279 = Utf8               ()Ljava/util/Iterator;
  #280 = InterfaceMethodref #281.#282     // java/util/Iterator.hasNext:()Z
  #281 = Class              #283          // java/util/Iterator
  #282 = NameAndType        #284:#127     // hasNext:()Z
  #283 = Utf8               java/util/Iterator
  #284 = Utf8               hasNext
  #285 = InterfaceMethodref #281.#286     // java/util/Iterator.next:()Ljava/lang/Object;
  #286 = NameAndType        #287:#288     // next:()Ljava/lang/Object;
  #287 = Utf8               next
  #288 = Utf8               ()Ljava/lang/Object;
  #289 = Methodref          #290.#291     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #290 = Class              #292          // ext/mods/gameserver/model/World
  #291 = NameAndType        #88:#293      // getInstance:()Lext/mods/gameserver/model/World;
  #292 = Utf8               ext/mods/gameserver/model/World
  #293 = Utf8               ()Lext/mods/gameserver/model/World;
  #294 = Methodref          #290.#295     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #295 = NameAndType        #296:#297     // getPlayers:()Ljava/util/Collection;
  #296 = Utf8               getPlayers
  #297 = Utf8               ()Ljava/util/Collection;
  #298 = InterfaceMethodref #299.#277     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #299 = Class              #300          // java/util/Collection
  #300 = Utf8               java/util/Collection
  #301 = Methodref          #211.#145     // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #302 = Methodref          #8.#303       // ext/mods/fakeplayer/ai/FakePlayerAI.isSamePartyOrClan:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #303 = NameAndType        #304:#305     // isSamePartyOrClan:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #304 = Utf8               isSamePartyOrClan
  #305 = Utf8               (Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
  #306 = Methodref          #211.#307     // ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
  #307 = NameAndType        #308:#309     // getPvpFlag:()B
  #308 = Utf8               getPvpFlag
  #309 = Utf8               ()B
  #310 = Methodref          #211.#311     // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #311 = NameAndType        #312:#109     // getKarma:()I
  #312 = Utf8               getKarma
  #313 = Methodref          #211.#314     // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #314 = NameAndType        #315:#109     // getClanId:()I
  #315 = Utf8               getClanId
  #316 = Fieldref           #317.#318     // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
  #317 = Class              #319          // ext/mods/gameserver/enums/ZoneId
  #318 = NameAndType        #320:#321     // PVP:Lext/mods/gameserver/enums/ZoneId;
  #319 = Utf8               ext/mods/gameserver/enums/ZoneId
  #320 = Utf8               PVP
  #321 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #322 = Methodref          #211.#323     // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #323 = NameAndType        #324:#325     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #324 = Utf8               isInsideZone
  #325 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #326 = Methodref          #28.#327      // ext/mods/fakeplayer/FakePlayer.getParty:()Lext/mods/gameserver/model/group/Party;
  #327 = NameAndType        #328:#329     // getParty:()Lext/mods/gameserver/model/group/Party;
  #328 = Utf8               getParty
  #329 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #330 = Methodref          #331.#332     // ext/mods/gameserver/model/group/Party.equals:(Lext/mods/gameserver/model/group/Party;)Z
  #331 = Class              #333          // ext/mods/gameserver/model/group/Party
  #332 = NameAndType        #334:#335     // equals:(Lext/mods/gameserver/model/group/Party;)Z
  #333 = Utf8               ext/mods/gameserver/model/group/Party
  #334 = Utf8               equals
  #335 = Utf8               (Lext/mods/gameserver/model/group/Party;)Z
  #336 = Methodref          #28.#337      // ext/mods/fakeplayer/FakePlayer.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #337 = NameAndType        #338:#339     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #338 = Utf8               getClan
  #339 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #340 = Methodref          #2.#341       // java/lang/Object.equals:(Ljava/lang/Object;)Z
  #341 = NameAndType        #334:#83      // equals:(Ljava/lang/Object;)Z
  #342 = Methodref          #28.#223      // ext/mods/fakeplayer/FakePlayer.isDead:()Z
  #343 = Methodref          #8.#344       // ext/mods/fakeplayer/ai/FakePlayerAI.toVillageOnDeath:()V
  #344 = NameAndType        #345:#6       // toVillageOnDeath:()V
  #345 = Utf8               toVillageOnDeath
  #346 = Methodref          #28.#347      // ext/mods/fakeplayer/FakePlayer.doRevive:()V
  #347 = NameAndType        #348:#6       // doRevive:()V
  #348 = Utf8               doRevive
  #349 = Methodref          #28.#350      // ext/mods/fakeplayer/FakePlayer.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
  #350 = NameAndType        #351:#352     // isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
  #351 = Utf8               isSkillDisabled
  #352 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #353 = Methodref          #354.#355     // ext/mods/fakeplayer/holder/WalkerHolder.getCityWaypoints:(Ljava/lang/String;)Ljava/util/List;
  #354 = Class              #356          // ext/mods/fakeplayer/holder/WalkerHolder
  #355 = NameAndType        #357:#358     // getCityWaypoints:(Ljava/lang/String;)Ljava/util/List;
  #356 = Utf8               ext/mods/fakeplayer/holder/WalkerHolder
  #357 = Utf8               getCityWaypoints
  #358 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #359 = InterfaceMethodref #249.#360     // java/util/List.isEmpty:()Z
  #360 = NameAndType        #361:#127     // isEmpty:()Z
  #361 = Utf8               isEmpty
  #362 = InvokeDynamic      #7:#363       // #7:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #363 = NameAndType        #49:#364      // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #364 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #365 = InterfaceMethodref #249.#366     // java/util/List.size:()I
  #366 = NameAndType        #367:#109     // size:()I
  #367 = Utf8               size
  #368 = Methodref          #369.#370     // ext/mods/commons/random/Rnd.get:(I)I
  #369 = Class              #371          // ext/mods/commons/random/Rnd
  #370 = NameAndType        #102:#372     // get:(I)I
  #371 = Utf8               ext/mods/commons/random/Rnd
  #372 = Utf8               (I)I
  #373 = InterfaceMethodref #249.#374     // java/util/List.get:(I)Ljava/lang/Object;
  #374 = NameAndType        #102:#375     // get:(I)Ljava/lang/Object;
  #375 = Utf8               (I)Ljava/lang/Object;
  #376 = InvokeDynamic      #8:#377       // #8:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
  #377 = NameAndType        #260:#378     // applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
  #378 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
  #379 = InterfaceMethodref #52.#380      // java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
  #380 = NameAndType        #381:#382     // min:(Ljava/util/Comparator;)Ljava/util/Optional;
  #381 = Utf8               min
  #382 = Utf8               (Ljava/util/Comparator;)Ljava/util/Optional;
  #383 = Methodref          #384.#385     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #384 = Class              #386          // java/util/Optional
  #385 = NameAndType        #387:#103     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #386 = Utf8               java/util/Optional
  #387 = Utf8               orElse
  #388 = Methodref          #389.#390     // ext/mods/commons/math/MathUtil.calculateDistance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;Z)D
  #389 = Class              #391          // ext/mods/commons/math/MathUtil
  #390 = NameAndType        #392:#393     // calculateDistance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;Z)D
  #391 = Utf8               ext/mods/commons/math/MathUtil
  #392 = Utf8               calculateDistance
  #393 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;Z)D
  #394 = Methodref          #211.#150     // ext/mods/gameserver/model/actor/Player.getX:()I
  #395 = Methodref          #211.#164     // ext/mods/gameserver/model/actor/Player.getY:()I
  #396 = Methodref          #211.#167     // ext/mods/gameserver/model/actor/Player.getZ:()I
  #397 = Methodref          #142.#150     // ext/mods/gameserver/model/location/Location.getX:()I
  #398 = Methodref          #142.#164     // ext/mods/gameserver/model/location/Location.getY:()I
  #399 = Methodref          #142.#167     // ext/mods/gameserver/model/location/Location.getZ:()I
  #400 = Methodref          #226.#401     // ext/mods/gameserver/geoengine/GeoEngine.canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #401 = NameAndType        #402:#403     // canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #402 = Utf8               canMove
  #403 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #404 = Methodref          #389.#405     // ext/mods/commons/math/MathUtil.calculateDistance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)D
  #405 = NameAndType        #392:#406     // calculateDistance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)D
  #406 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)D
  #407 = Methodref          #8.#408       // ext/mods/fakeplayer/ai/FakePlayerAI.isAttackablePlayer:(Lext/mods/gameserver/model/actor/Player;)Z
  #408 = NameAndType        #409:#410     // isAttackablePlayer:(Lext/mods/gameserver/model/actor/Player;)Z
  #409 = Utf8               isAttackablePlayer
  #410 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #411 = Class              #412          // ext/mods/gameserver/model/actor/Attackable
  #412 = Utf8               ext/mods/gameserver/model/actor/Attackable
  #413 = Methodref          #104.#414     // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #414 = NameAndType        #415:#416     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #415 = Utf8               getSkill
  #416 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #417 = Methodref          #95.#418      // ext/mods/gameserver/skills/L2Skill.getId:()I
  #418 = NameAndType        #419:#109     // getId:()I
  #419 = Utf8               getId
  #420 = Methodref          #104.#421     // ext/mods/gameserver/skills/AbstractEffect.getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
  #421 = NameAndType        #422:#423     // getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
  #422 = Utf8               getEffectType
  #423 = Utf8               ()Lext/mods/gameserver/enums/skills/EffectType;
  #424 = Fieldref           #425.#426     // ext/mods/gameserver/enums/skills/EffectType.BUFF:Lext/mods/gameserver/enums/skills/EffectType;
  #425 = Class              #427          // ext/mods/gameserver/enums/skills/EffectType
  #426 = NameAndType        #428:#429     // BUFF:Lext/mods/gameserver/enums/skills/EffectType;
  #427 = Utf8               ext/mods/gameserver/enums/skills/EffectType
  #428 = Utf8               BUFF
  #429 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
  #430 = Utf8               ConstantValue
  #431 = Integer            10
  #432 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)V
  #433 = Utf8               Code
  #434 = Utf8               LineNumberTable
  #435 = Utf8               LocalVariableTable
  #436 = Utf8               this
  #437 = Utf8               Lext/mods/fakeplayer/ai/FakePlayerAI;
  #438 = Utf8               character
  #439 = Utf8               applyDefaultBuffs
  #440 = Utf8               activeEffects
  #441 = Utf8               Ljava/util/Map;
  #442 = Utf8               e
  #443 = Utf8               Ljava/lang/Exception;
  #444 = Utf8               buff
  #445 = Utf8               [I
  #446 = Utf8               LocalVariableTypeTable
  #447 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/skills/AbstractEffect;>;
  #448 = Utf8               StackMapTable
  #449 = Class              #450          // "[[I"
  #450 = Utf8               [[I
  #451 = Class              #445          // "[I"
  #452 = Utf8               castSpell
  #453 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)V
  #454 = Utf8               skill
  #455 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #456 = Utf8               victim
  #457 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #458 = Utf8               target
  #459 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #460 = Utf8               tryTargetNearestCreatureByTypeInRadius
  #461 = Utf8               (Ljava/lang/Class;I)V
  #462 = Utf8               currentTarget
  #463 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #464 = Utf8               otherFake
  #465 = Utf8               other
  #466 = Utf8               isTargetedByAlly
  #467 = Utf8               isTargetedByEnemy
  #468 = Utf8               creatureClass
  #469 = Utf8               Ljava/lang/Class;
  #470 = Utf8               radius
  #471 = Utf8               potentialTargets
  #472 = Utf8               Ljava/util/List;
  #473 = Utf8               Ljava/lang/Class<+Lext/mods/gameserver/model/actor/Creature;>;
  #474 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
  #475 = Class              #476          // java/lang/Class
  #476 = Utf8               java/lang/Class
  #477 = Utf8               Signature
  #478 = Utf8               (Ljava/lang/Class<+Lext/mods/gameserver/model/actor/Creature;>;I)V
  #479 = Utf8               player
  #480 = Utf8               player1
  #481 = Utf8               player2
  #482 = Utf8               handleDeath
  #483 = Utf8               castSelfSpell
  #484 = Utf8               getCityWaypoint
  #485 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
  #486 = Utf8               townName
  #487 = Utf8               Ljava/lang/String;
  #488 = Utf8               fakePlayer
  #489 = Utf8               waypoints
  #490 = Utf8               validWaypoints
  #491 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #492 = Utf8               setBusyThinking
  #493 = Utf8               thinking
  #494 = Utf8               isBusyThinking
  #495 = Utf8               thinkAndAct
  #496 = Utf8               lambda$getCityWaypoint$1
  #497 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #498 = Utf8               loc
  #499 = Utf8               Lext/mods/gameserver/model/location/Location;
  #500 = Utf8               lambda$getCityWaypoint$0
  #501 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
  #502 = Utf8               lambda$tryTargetNearestCreatureByTypeInRadius$3
  #503 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)D
  #504 = Utf8               c
  #505 = Utf8               lambda$tryTargetNearestCreatureByTypeInRadius$2
  #506 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #507 = Utf8               playerTarget
  #508 = Utf8               creature
  #509 = Utf8               lambda$tryTargetNearestCreatureByTypeInRadius$1
  #510 = Utf8               lambda$tryTargetNearestCreatureByTypeInRadius$0
  #511 = Utf8               lambda$applyDefaultBuffs$2
  #512 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/skills/AbstractEffect;
  #513 = Utf8               x
  #514 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #515 = Utf8               lambda$applyDefaultBuffs$1
  #516 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
  #517 = Utf8               lambda$applyDefaultBuffs$0
  #518 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)Z
  #519 = Utf8               SourceFile
  #520 = Utf8               FakePlayerAI.java
  #521 = Utf8               BootstrapMethods
  #522 = MethodType         #83           //  (Ljava/lang/Object;)Z
  #523 = MethodHandle       6:#524        // REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$applyDefaultBuffs$0:(Lext/mods/gameserver/skills/AbstractEffect;)Z
  #524 = Methodref          #8.#525       // ext/mods/fakeplayer/ai/FakePlayerAI.lambda$applyDefaultBuffs$0:(Lext/mods/gameserver/skills/AbstractEffect;)Z
  #525 = NameAndType        #517:#518     // lambda$applyDefaultBuffs$0:(Lext/mods/gameserver/skills/AbstractEffect;)Z
  #526 = MethodType         #518          //  (Lext/mods/gameserver/skills/AbstractEffect;)Z
  #527 = MethodType         #103          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #528 = MethodHandle       6:#529        // REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$applyDefaultBuffs$1:(Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
  #529 = Methodref          #8.#530       // ext/mods/fakeplayer/ai/FakePlayerAI.lambda$applyDefaultBuffs$1:(Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
  #530 = NameAndType        #515:#516     // lambda$applyDefaultBuffs$1:(Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
  #531 = MethodType         #516          //  (Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
  #532 = MethodHandle       6:#533        // REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$applyDefaultBuffs$2:(Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/skills/AbstractEffect;
  #533 = Methodref          #8.#534       // ext/mods/fakeplayer/ai/FakePlayerAI.lambda$applyDefaultBuffs$2:(Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/skills/AbstractEffect;
  #534 = NameAndType        #511:#512     // lambda$applyDefaultBuffs$2:(Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/skills/AbstractEffect;
  #535 = MethodType         #512          //  (Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/skills/AbstractEffect;
  #536 = MethodHandle       6:#537        // REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$tryTargetNearestCreatureByTypeInRadius$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #537 = Methodref          #8.#538       // ext/mods/fakeplayer/ai/FakePlayerAI.lambda$tryTargetNearestCreatureByTypeInRadius$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #538 = NameAndType        #510:#506     // lambda$tryTargetNearestCreatureByTypeInRadius$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #539 = MethodType         #506          //  (Lext/mods/gameserver/model/actor/Creature;)Z
  #540 = MethodHandle       6:#541        // REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$tryTargetNearestCreatureByTypeInRadius$1:(Lext/mods/gameserver/model/actor/Creature;)Z
  #541 = Methodref          #8.#542       // ext/mods/fakeplayer/ai/FakePlayerAI.lambda$tryTargetNearestCreatureByTypeInRadius$1:(Lext/mods/gameserver/model/actor/Creature;)Z
  #542 = NameAndType        #509:#506     // lambda$tryTargetNearestCreatureByTypeInRadius$1:(Lext/mods/gameserver/model/actor/Creature;)Z
  #543 = MethodHandle       5:#544        // REF_invokeVirtual ext/mods/fakeplayer/ai/FakePlayerAI.lambda$tryTargetNearestCreatureByTypeInRadius$2:(Lext/mods/gameserver/model/actor/Creature;)Z
  #544 = Methodref          #8.#545       // ext/mods/fakeplayer/ai/FakePlayerAI.lambda$tryTargetNearestCreatureByTypeInRadius$2:(Lext/mods/gameserver/model/actor/Creature;)Z
  #545 = NameAndType        #505:#506     // lambda$tryTargetNearestCreatureByTypeInRadius$2:(Lext/mods/gameserver/model/actor/Creature;)Z
  #546 = MethodType         #547          //  (Ljava/lang/Object;)D
  #547 = Utf8               (Ljava/lang/Object;)D
  #548 = MethodHandle       5:#549        // REF_invokeVirtual ext/mods/fakeplayer/ai/FakePlayerAI.lambda$tryTargetNearestCreatureByTypeInRadius$3:(Lext/mods/gameserver/model/actor/Creature;)D
  #549 = Methodref          #8.#550       // ext/mods/fakeplayer/ai/FakePlayerAI.lambda$tryTargetNearestCreatureByTypeInRadius$3:(Lext/mods/gameserver/model/actor/Creature;)D
  #550 = NameAndType        #502:#503     // lambda$tryTargetNearestCreatureByTypeInRadius$3:(Lext/mods/gameserver/model/actor/Creature;)D
  #551 = MethodType         #503          //  (Lext/mods/gameserver/model/actor/Creature;)D
  #552 = MethodHandle       6:#553        // REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$getCityWaypoint$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
  #553 = Methodref          #8.#554       // ext/mods/fakeplayer/ai/FakePlayerAI.lambda$getCityWaypoint$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
  #554 = NameAndType        #500:#501     // lambda$getCityWaypoint$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
  #555 = MethodType         #556          //  (Lext/mods/gameserver/model/location/Location;)Z
  #556 = Utf8               (Lext/mods/gameserver/model/location/Location;)Z
  #557 = MethodHandle       6:#558        // REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$getCityWaypoint$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #558 = Methodref          #8.#559       // ext/mods/fakeplayer/ai/FakePlayerAI.lambda$getCityWaypoint$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #559 = NameAndType        #496:#497     // lambda$getCityWaypoint$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #560 = MethodType         #561          //  (Lext/mods/gameserver/model/location/Location;)D
  #561 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #562 = MethodHandle       6:#563        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #563 = Methodref          #564.#565     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #564 = Class              #566          // java/lang/invoke/LambdaMetafactory
  #565 = NameAndType        #567:#568     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #566 = Utf8               java/lang/invoke/LambdaMetafactory
  #567 = Utf8               metafactory
  #568 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #569 = Utf8               InnerClasses
  #570 = Class              #571          // java/lang/invoke/MethodHandles$Lookup
  #571 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #572 = Class              #573          // java/lang/invoke/MethodHandles
  #573 = Utf8               java/lang/invoke/MethodHandles
  #574 = Utf8               Lookup
{
  protected final ext.mods.fakeplayer.FakePlayer _fakePlayer;
    descriptor: Lext/mods/fakeplayer/FakePlayer;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected boolean _isBusyThinking;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected int iterationsOnDeath;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.fakeplayer.ai.FakePlayerAI(ext.mods.fakeplayer.FakePlayer);
    descriptor: (Lext/mods/fakeplayer/FakePlayer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field _isBusyThinking:Z
         9: aload_0
        10: iconst_0
        11: putfield      #13                 // Field iterationsOnDeath:I
        14: aload_0
        15: bipush        10
        17: putfield      #17                 // Field toVillageIterationsOnDeath:I
        20: aload_0
        21: aload_1
        22: putfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        25: aload_0
        26: invokevirtual #24                 // Method setup:()V
        29: return
      LineNumberTable:
        line 52: 0
        line 47: 4
        line 48: 9
        line 49: 14
        line 53: 20
        line 54: 25
        line 55: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/fakeplayer/ai/FakePlayerAI;
            0      30     1 character   Lext/mods/fakeplayer/FakePlayer;

  public void setup();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
         4: iconst_1
         5: invokevirtual #27                 // Method ext/mods/fakeplayer/FakePlayer.setRunning:(Z)V
         8: return
      LineNumberTable:
        line 59: 0
        line 60: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/fakeplayer/ai/FakePlayerAI;

  protected void applyDefaultBuffs();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=6, args_size=1
         0: aload_0
         1: invokevirtual #33                 // Method getBuffs:()[[I
         4: astore_1
         5: aload_1
         6: arraylength
         7: istore_2
         8: iconst_0
         9: istore_3
        10: iload_3
        11: iload_2
        12: if_icmpge     197
        15: aload_1
        16: iload_3
        17: aaload
        18: astore        4
        20: aload_0
        21: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        24: invokevirtual #37                 // Method ext/mods/fakeplayer/FakePlayer.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
        27: invokestatic  #41                 // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
        30: invokedynamic #47,  0             // InvokeDynamic #0:test:()Ljava/util/function/Predicate;
        35: invokeinterface #51,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        40: invokedynamic #57,  0             // InvokeDynamic #1:apply:()Ljava/util/function/Function;
        45: invokedynamic #61,  0             // InvokeDynamic #2:apply:()Ljava/util/function/Function;
        50: invokestatic  #62                 // Method java/util/stream/Collectors.toMap:(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;
        53: invokeinterface #68,  2           // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
        58: checkcast     #72                 // class java/util/Map
        61: astore        5
        63: aload         5
        65: aload         4
        67: iconst_0
        68: iaload
        69: invokestatic  #74                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        72: invokeinterface #80,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        77: ifne          109
        80: invokestatic  #84                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        83: aload         4
        85: iconst_0
        86: iaload
        87: aload         4
        89: iconst_1
        90: iaload
        91: invokevirtual #90                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        94: aload_0
        95: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        98: aload_0
        99: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       102: invokevirtual #94                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       105: pop
       106: goto          181
       109: aload         5
       111: aload         4
       113: iconst_0
       114: iaload
       115: invokestatic  #74                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       118: invokeinterface #100,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       123: checkcast     #104                // class ext/mods/gameserver/skills/AbstractEffect
       126: invokevirtual #106                // Method ext/mods/gameserver/skills/AbstractEffect.getPeriod:()I
       129: aload         5
       131: aload         4
       133: iconst_0
       134: iaload
       135: invokestatic  #74                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       138: invokeinterface #100,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       143: checkcast     #104                // class ext/mods/gameserver/skills/AbstractEffect
       146: invokevirtual #110                // Method ext/mods/gameserver/skills/AbstractEffect.getTime:()I
       149: isub
       150: bipush        20
       152: if_icmpgt     181
       155: invokestatic  #84                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       158: aload         4
       160: iconst_0
       161: iaload
       162: aload         4
       164: iconst_1
       165: iaload
       166: invokevirtual #90                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       169: aload_0
       170: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       173: aload_0
       174: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       177: invokevirtual #94                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       180: pop
       181: goto          191
       184: astore        5
       186: aload         5
       188: invokevirtual #115                // Method java/lang/Exception.printStackTrace:()V
       191: iinc          3, 1
       194: goto          10
       197: return
      Exception table:
         from    to  target type
            20   181   184   Class java/lang/Exception
      LineNumberTable:
        line 64: 0
        line 68: 20
        line 70: 63
        line 71: 80
        line 74: 109
        line 76: 155
        line 83: 181
        line 80: 184
        line 82: 186
        line 64: 191
        line 85: 197
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           63     118     5 activeEffects   Ljava/util/Map;
          186       5     5     e   Ljava/lang/Exception;
           20     171     4  buff   [I
            0     198     0  this   Lext/mods/fakeplayer/ai/FakePlayerAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           63     118     5 activeEffects   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/skills/AbstractEffect;>;
      StackMapTable: number_of_entries = 6
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[[I", int, int ]
        frame_type = 253 /* append */
          offset_delta = 98
          locals = [ class "[I", class java/util/Map ]
        frame_type = 250 /* chop */
          offset_delta = 71
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 248 /* chop */
          offset_delta = 5

  public void castSpell(ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: aload_0
         1: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
         4: invokevirtual #118                // Method ext/mods/fakeplayer/FakePlayer.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
         7: invokevirtual #122                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
        10: ifne          195
        13: aload_1
        14: invokevirtual #128                // Method ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
        17: getstatic     #132                // Field ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
        20: if_acmpne     98
        23: aload_0
        24: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        27: invokevirtual #138                // Method ext/mods/fakeplayer/FakePlayer.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        30: new           #142                // class ext/mods/gameserver/model/location/Location
        33: dup
        34: aload_0
        35: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        38: invokevirtual #144                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
        41: invokevirtual #148                // Method ext/mods/gameserver/model/WorldObject.getX:()I
        44: aload_0
        45: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        48: invokevirtual #153                // Method ext/mods/fakeplayer/FakePlayer.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
        51: invokevirtual #157                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getCollisionRadius:()D
        54: d2i
        55: iadd
        56: aload_0
        57: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        60: invokevirtual #144                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
        63: invokevirtual #163                // Method ext/mods/gameserver/model/WorldObject.getY:()I
        66: aload_0
        67: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        70: invokevirtual #153                // Method ext/mods/fakeplayer/FakePlayer.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
        73: invokevirtual #157                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getCollisionRadius:()D
        76: d2i
        77: iadd
        78: aload_0
        79: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        82: invokevirtual #144                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
        85: invokevirtual #166                // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        88: invokespecial #169                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        91: aconst_null
        92: invokevirtual #172                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
        95: goto          195
        98: aload_0
        99: aload_0
       100: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       103: invokevirtual #144                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
       106: invokevirtual #178                // Method checkTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
       109: ifeq          148
       112: aload_1
       113: invokevirtual #182                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
       116: ifeq          137
       119: aload_0
       120: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       123: invokevirtual #144                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
       126: ifnull        137
       129: aload_0
       130: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       133: aconst_null
       134: invokevirtual #185                // Method ext/mods/fakeplayer/FakePlayer.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
       137: aload_0
       138: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       141: invokevirtual #118                // Method ext/mods/fakeplayer/FakePlayer.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
       144: invokevirtual #189                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.stop:()V
       147: return
       148: aload_1
       149: invokevirtual #192                // Method ext/mods/gameserver/skills/L2Skill.getHitTime:()I
       152: bipush        50
       154: if_icmple     174
       157: aload_1
       158: invokevirtual #195                // Method ext/mods/gameserver/skills/L2Skill.isSimultaneousCast:()Z
       161: ifne          174
       164: aload_0
       165: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       168: invokevirtual #198                // Method ext/mods/fakeplayer/FakePlayer.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       171: invokevirtual #202                // Method ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
       174: aload_0
       175: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       178: invokevirtual #138                // Method ext/mods/fakeplayer/FakePlayer.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       181: aload_0
       182: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       185: invokevirtual #144                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
       188: checkcast     #205                // class ext/mods/gameserver/model/actor/Creature
       191: aload_1
       192: invokevirtual #207                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       195: return
      LineNumberTable:
        line 89: 0
        line 91: 13
        line 93: 23
        line 97: 98
        line 99: 112
        line 100: 129
        line 102: 137
        line 103: 147
        line 106: 148
        line 107: 164
        line 109: 174
        line 112: 195
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     196     0  this   Lext/mods/fakeplayer/ai/FakePlayerAI;
            0     196     1 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 5
        frame_type = 251 /* same_frame_extended */
          offset_delta = 98
        frame_type = 38 /* same */
        frame_type = 10 /* same */
        frame_type = 25 /* same */
        frame_type = 20 /* same */

  protected boolean checkTargetLost(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: instanceof    #211                // class ext/mods/gameserver/model/actor/Player
         4: ifeq          26
         7: aload_1
         8: checkcast     #211                // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.isFakeDeath:()Z
        16: ifeq          26
        19: aload_2
        20: iconst_1
        21: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.stopFakeDeath:(Z)V
        24: iconst_0
        25: ireturn
        26: aload_1
        27: ifnonnull     42
        30: aload_0
        31: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        34: invokevirtual #138                // Method ext/mods/fakeplayer/FakePlayer.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        37: invokevirtual #219                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
        40: iconst_1
        41: ireturn
        42: iconst_0
        43: ireturn
      LineNumberTable:
        line 116: 0
        line 118: 7
        line 119: 12
        line 121: 19
        line 122: 24
        line 126: 26
        line 128: 30
        line 130: 40
        line 132: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      14     2 victim   Lext/mods/gameserver/model/actor/Player;
            0      44     0  this   Lext/mods/fakeplayer/ai/FakePlayerAI;
            0      44     1 target   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 2
        frame_type = 26 /* same */
        frame_type = 15 /* same */

  protected void tryTargetNearestCreatureByTypeInRadius(java.lang.Class<? extends ext.mods.gameserver.model.actor.Creature>, int);
    descriptor: (Ljava/lang/Class;I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=11, args_size=3
         0: aload_0
         1: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
         4: invokevirtual #144                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
         7: ifnull        96
        10: aload_0
        11: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        14: invokevirtual #144                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
        17: checkcast     #205                // class ext/mods/gameserver/model/actor/Creature
        20: astore_3
        21: aload_3
        22: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        25: ifne          84
        28: invokestatic  #225                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        31: aload_0
        32: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        35: aload_3
        36: invokevirtual #230                // Method ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
        39: ifeq          84
        42: invokestatic  #225                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        45: aload_0
        46: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        49: invokevirtual #234                // Method ext/mods/fakeplayer/FakePlayer.getX:()I
        52: aload_0
        53: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        56: invokevirtual #235                // Method ext/mods/fakeplayer/FakePlayer.getY:()I
        59: aload_0
        60: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        63: invokevirtual #236                // Method ext/mods/fakeplayer/FakePlayer.getZ:()I
        66: aload_3
        67: invokevirtual #237                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
        70: aload_3
        71: invokevirtual #238                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
        74: aload_3
        75: invokevirtual #239                // Method ext/mods/gameserver/model/actor/Creature.getZ:()I
        78: invokevirtual #240                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
        81: ifne          95
        84: aload_0
        85: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        88: aconst_null
        89: invokevirtual #185                // Method ext/mods/fakeplayer/FakePlayer.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
        92: goto          96
        95: return
        96: aload_0
        97: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       100: aload_1
       101: iload_2
       102: invokevirtual #244                // Method ext/mods/fakeplayer/FakePlayer.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
       105: invokeinterface #248,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
       110: invokedynamic #253,  0            // InvokeDynamic #3:test:()Ljava/util/function/Predicate;
       115: invokeinterface #51,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       120: invokedynamic #254,  0            // InvokeDynamic #4:test:()Ljava/util/function/Predicate;
       125: invokeinterface #51,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       130: aload_0
       131: invokedynamic #255,  0            // InvokeDynamic #5:test:(Lext/mods/fakeplayer/ai/FakePlayerAI;)Ljava/util/function/Predicate;
       136: invokeinterface #51,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       141: aload_0
       142: invokedynamic #258,  0            // InvokeDynamic #6:applyAsDouble:(Lext/mods/fakeplayer/ai/FakePlayerAI;)Ljava/util/function/ToDoubleFunction;
       147: invokestatic  #262                // InterfaceMethod java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
       150: invokeinterface #268,  2          // InterfaceMethod java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
       155: invokestatic  #272                // Method java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
       158: invokeinterface #68,  2           // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
       163: checkcast     #249                // class java/util/List
       166: astore_3
       167: aload_3
       168: invokeinterface #276,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       173: astore        4
       175: aload         4
       177: invokeinterface #280,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       182: ifeq          338
       185: aload         4
       187: invokeinterface #285,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       192: checkcast     #205                // class ext/mods/gameserver/model/actor/Creature
       195: astore        5
       197: iconst_0
       198: istore        6
       200: iconst_0
       201: istore        7
       203: invokestatic  #289                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       206: invokevirtual #294                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
       209: invokeinterface #298,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       214: astore        8
       216: aload         8
       218: invokeinterface #280,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       223: ifeq          315
       226: aload         8
       228: invokeinterface #285,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       233: checkcast     #211                // class ext/mods/gameserver/model/actor/Player
       236: astore        9
       238: aload         9
       240: ifnull        216
       243: aload         9
       245: aload_0
       246: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       249: if_acmpeq     216
       252: aload         9
       254: invokevirtual #301                // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
       257: ifnonnull     263
       260: goto          216
       263: aload         9
       265: invokevirtual #301                // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
       268: aload         5
       270: if_acmpne     312
       273: aload         9
       275: instanceof    #28                 // class ext/mods/fakeplayer/FakePlayer
       278: ifeq          306
       281: aload         9
       283: checkcast     #28                 // class ext/mods/fakeplayer/FakePlayer
       286: astore        10
       288: aload_0
       289: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       292: aload         10
       294: invokestatic  #302                // Method isSamePartyOrClan:(Lext/mods/fakeplayer/FakePlayer;Lext/mods/fakeplayer/FakePlayer;)Z
       297: ifeq          306
       300: iconst_1
       301: istore        6
       303: goto          312
       306: iconst_1
       307: istore        7
       309: goto          315
       312: goto          216
       315: iload         7
       317: ifeq          325
       320: iload         6
       322: ifeq          335
       325: aload_0
       326: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       329: aload         5
       331: invokevirtual #185                // Method ext/mods/fakeplayer/FakePlayer.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
       334: return
       335: goto          175
       338: return
      LineNumberTable:
        line 138: 0
        line 140: 10
        line 142: 21
        line 144: 84
        line 148: 95
        line 152: 96
        line 164: 147
        line 166: 167
        line 168: 197
        line 169: 200
        line 171: 203
        line 173: 238
        line 174: 260
        line 176: 263
        line 178: 273
        line 179: 300
        line 182: 306
        line 183: 309
        line 186: 312
        line 188: 315
        line 190: 325
        line 191: 334
        line 193: 335
        line 194: 338
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           21      75     3 currentTarget   Lext/mods/gameserver/model/actor/Creature;
          288      18    10 otherFake   Lext/mods/fakeplayer/FakePlayer;
          238      74     9 other   Lext/mods/gameserver/model/actor/Player;
          200     135     6 isTargetedByAlly   Z
          203     132     7 isTargetedByEnemy   Z
          197     138     5 target   Lext/mods/gameserver/model/actor/Creature;
            0     339     0  this   Lext/mods/fakeplayer/ai/FakePlayerAI;
            0     339     1 creatureClass   Ljava/lang/Class;
            0     339     2 radius   I
          167     172     3 potentialTargets   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     339     1 creatureClass   Ljava/lang/Class<+Lext/mods/gameserver/model/actor/Creature;>;
          167     172     3 potentialTargets   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 12
        frame_type = 252 /* append */
          offset_delta = 84
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 10 /* same */
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 253 /* append */
          offset_delta = 78
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = [ class ext/mods/fakeplayer/ai/FakePlayerAI, class java/lang/Class, int, class java/util/List, class java/util/Iterator, class ext/mods/gameserver/model/actor/Creature, int, int, class java/util/Iterator ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 42 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 9 /* same */
        frame_type = 248 /* chop */
          offset_delta = 9
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #478                         // (Ljava/lang/Class<+Lext/mods/gameserver/model/actor/Creature;>;I)V

  public static boolean isAttackablePlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #306                // Method ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
         4: ifgt          31
         7: aload_0
         8: invokevirtual #310                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        11: ifgt          31
        14: aload_0
        15: invokevirtual #313                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        18: ifgt          31
        21: aload_0
        22: getstatic     #316                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
        25: invokevirtual #322                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        28: ifeq          35
        31: iconst_1
        32: goto          36
        35: iconst_0
        36: ireturn
      LineNumberTable:
        line 198: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 31 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected void handleDeath();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
         4: invokevirtual #342                // Method ext/mods/fakeplayer/FakePlayer.isDead:()Z
         7: ifeq          34
        10: aload_0
        11: getfield      #13                 // Field iterationsOnDeath:I
        14: bipush        10
        16: if_icmplt     23
        19: aload_0
        20: invokevirtual #343                // Method toVillageOnDeath:()V
        23: aload_0
        24: dup
        25: getfield      #13                 // Field iterationsOnDeath:I
        28: iconst_1
        29: iadd
        30: putfield      #13                 // Field iterationsOnDeath:I
        33: return
        34: aload_0
        35: iconst_0
        36: putfield      #13                 // Field iterationsOnDeath:I
        39: return
      LineNumberTable:
        line 217: 0
        line 219: 10
        line 221: 19
        line 223: 23
        line 224: 33
        line 227: 34
        line 228: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/fakeplayer/ai/FakePlayerAI;
      StackMapTable: number_of_entries = 2
        frame_type = 23 /* same */
        frame_type = 10 /* same */

  protected void toVillageOnDeath();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
         4: invokevirtual #342                // Method ext/mods/fakeplayer/FakePlayer.isDead:()Z
         7: ifeq          17
        10: aload_0
        11: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        14: invokevirtual #346                // Method ext/mods/fakeplayer/FakePlayer.doRevive:()V
        17: return
      LineNumberTable:
        line 232: 0
        line 233: 10
        line 235: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/fakeplayer/ai/FakePlayerAI;
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */

  protected void castSelfSpell(ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
         4: invokevirtual #118                // Method ext/mods/fakeplayer/FakePlayer.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
         7: invokevirtual #122                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
        10: ifne          39
        13: aload_0
        14: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        17: aload_1
        18: invokevirtual #349                // Method ext/mods/fakeplayer/FakePlayer.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
        21: ifne          39
        24: aload_0
        25: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        28: invokevirtual #138                // Method ext/mods/fakeplayer/FakePlayer.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        31: aload_0
        32: getfield      #20                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        35: aload_1
        36: invokevirtual #207                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
        39: return
      LineNumberTable:
        line 239: 0
        line 241: 24
        line 243: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/fakeplayer/ai/FakePlayerAI;
            0      40     1 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 1
        frame_type = 39 /* same */

  protected ext.mods.gameserver.model.location.Location getCityWaypoint(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=5, args_size=3
         0: aload_1
         1: invokestatic  #353                // Method ext/mods/fakeplayer/holder/WalkerHolder.getCityWaypoints:(Ljava/lang/String;)Ljava/util/List;
         4: astore_3
         5: aload_3
         6: ifnull        18
         9: aload_3
        10: invokeinterface #359,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        15: ifeq          20
        18: aconst_null
        19: areturn
        20: aload_3
        21: invokeinterface #248,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        26: aload_2
        27: invokedynamic #362,  0            // InvokeDynamic #7:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        32: invokeinterface #51,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        37: invokestatic  #272                // Method java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
        40: invokeinterface #68,  2           // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
        45: checkcast     #249                // class java/util/List
        48: astore        4
        50: aload         4
        52: invokeinterface #359,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        57: ifne          83
        60: aload         4
        62: aload         4
        64: invokeinterface #365,  1          // InterfaceMethod java/util/List.size:()I
        69: invokestatic  #368                // Method ext/mods/commons/random/Rnd.get:(I)I
        72: invokeinterface #373,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        77: checkcast     #142                // class ext/mods/gameserver/model/location/Location
        80: goto          110
        83: aload_3
        84: invokeinterface #248,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        89: aload_2
        90: invokedynamic #376,  0            // InvokeDynamic #8:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
        95: invokestatic  #262                // InterfaceMethod java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
        98: invokeinterface #379,  2          // InterfaceMethod java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
       103: aconst_null
       104: invokevirtual #383                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       107: checkcast     #142                // class ext/mods/gameserver/model/location/Location
       110: areturn
      LineNumberTable:
        line 247: 0
        line 248: 5
        line 250: 18
        line 253: 20
        line 255: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     111     0  this   Lext/mods/fakeplayer/ai/FakePlayerAI;
            0     111     1 townName   Ljava/lang/String;
            0     111     2 fakePlayer   Lext/mods/gameserver/model/actor/Player;
            5     106     3 waypoints   Ljava/util/List;
           50      61     4 validWaypoints   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            5     106     3 waypoints   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
           50      61     4 validWaypoints   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/util/List ]
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 62
          locals = [ class java/util/List ]
        frame_type = 90 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/location/Location ]

  public void setBusyThinking(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _isBusyThinking:Z
         5: return
      LineNumberTable:
        line 260: 0
        line 261: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/fakeplayer/ai/FakePlayerAI;
            0       6     1 thinking   Z

  public boolean isBusyThinking();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _isBusyThinking:Z
         4: ireturn
      LineNumberTable:
        line 265: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/ai/FakePlayerAI;

  public abstract void thinkAndAct();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  protected abstract int[][] getBuffs();
    descriptor: ()[[I
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT
}
SourceFile: "FakePlayerAI.java"
BootstrapMethods:
  0: #562 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #522 (Ljava/lang/Object;)Z
      #523 REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$applyDefaultBuffs$0:(Lext/mods/gameserver/skills/AbstractEffect;)Z
      #526 (Lext/mods/gameserver/skills/AbstractEffect;)Z
  1: #562 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #527 (Ljava/lang/Object;)Ljava/lang/Object;
      #528 REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$applyDefaultBuffs$1:(Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
      #531 (Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
  2: #562 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #527 (Ljava/lang/Object;)Ljava/lang/Object;
      #532 REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$applyDefaultBuffs$2:(Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/skills/AbstractEffect;
      #535 (Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/skills/AbstractEffect;
  3: #562 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #522 (Ljava/lang/Object;)Z
      #536 REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$tryTargetNearestCreatureByTypeInRadius$0:(Lext/mods/gameserver/model/actor/Creature;)Z
      #539 (Lext/mods/gameserver/model/actor/Creature;)Z
  4: #562 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #522 (Ljava/lang/Object;)Z
      #540 REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$tryTargetNearestCreatureByTypeInRadius$1:(Lext/mods/gameserver/model/actor/Creature;)Z
      #539 (Lext/mods/gameserver/model/actor/Creature;)Z
  5: #562 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #522 (Ljava/lang/Object;)Z
      #543 REF_invokeVirtual ext/mods/fakeplayer/ai/FakePlayerAI.lambda$tryTargetNearestCreatureByTypeInRadius$2:(Lext/mods/gameserver/model/actor/Creature;)Z
      #539 (Lext/mods/gameserver/model/actor/Creature;)Z
  6: #562 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #546 (Ljava/lang/Object;)D
      #548 REF_invokeVirtual ext/mods/fakeplayer/ai/FakePlayerAI.lambda$tryTargetNearestCreatureByTypeInRadius$3:(Lext/mods/gameserver/model/actor/Creature;)D
      #551 (Lext/mods/gameserver/model/actor/Creature;)D
  7: #562 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #522 (Ljava/lang/Object;)Z
      #552 REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$getCityWaypoint$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Z
      #555 (Lext/mods/gameserver/model/location/Location;)Z
  8: #562 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #546 (Ljava/lang/Object;)D
      #557 REF_invokeStatic ext/mods/fakeplayer/ai/FakePlayerAI.lambda$getCityWaypoint$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
      #560 (Lext/mods/gameserver/model/location/Location;)D
InnerClasses:
  public static final #574= #570 of #572; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
