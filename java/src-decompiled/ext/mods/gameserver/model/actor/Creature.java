// Bytecode for: ext.mods.gameserver.model.actor.Creature
// File: ext\mods\gameserver\model\actor\Creature.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/Creature.class
  Last modified 9 de jul de 2026; size 46819 bytes
  MD5 checksum 407a2fbb8c85a7ca8238c5ed0b7c7522
  Compiled from "Creature.java"
public abstract class ext.mods.gameserver.model.actor.Creature extends ext.mods.gameserver.model.WorldObject
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #13                         // ext/mods/gameserver/model/actor/Creature
  super_class: #2                         // ext/mods/gameserver/model/WorldObject
  interfaces: 0, fields: 29, methods: 197, attributes: 3
Constant pool:
     #1 = Methodref          #2.#3        // ext/mods/gameserver/model/WorldObject."<init>":(I)V
     #2 = Class              #4           // ext/mods/gameserver/model/WorldObject
     #3 = NameAndType        #5:#6        // "<init>":(I)V
     #4 = Utf8               ext/mods/gameserver/model/WorldObject
     #5 = Utf8               <init>
     #6 = Utf8               (I)V
     #7 = Class              #8           // java/util/concurrent/atomic/AtomicBoolean
     #8 = Utf8               java/util/concurrent/atomic/AtomicBoolean
     #9 = Methodref          #7.#10       // java/util/concurrent/atomic/AtomicBoolean."<init>":()V
    #10 = NameAndType        #5:#11       // "<init>":()V
    #11 = Utf8               ()V
    #12 = Fieldref           #13.#14      // ext/mods/gameserver/model/actor/Creature._isTeleporting:Ljava/util/concurrent/atomic/AtomicBoolean;
    #13 = Class              #15          // ext/mods/gameserver/model/actor/Creature
    #14 = NameAndType        #16:#17      // _isTeleporting:Ljava/util/concurrent/atomic/AtomicBoolean;
    #15 = Utf8               ext/mods/gameserver/model/actor/Creature
    #16 = Utf8               _isTeleporting
    #17 = Utf8               Ljava/util/concurrent/atomic/AtomicBoolean;
    #18 = Fieldref           #13.#19      // ext/mods/gameserver/model/actor/Creature._isMortal:Z
    #19 = NameAndType        #20:#21      // _isMortal:Z
    #20 = Utf8               _isMortal
    #21 = Utf8               Z
    #22 = Fieldref           #23.#24      // ext/mods/gameserver/enums/ZoneId.VALUES:[Lext/mods/gameserver/enums/ZoneId;
    #23 = Class              #25          // ext/mods/gameserver/enums/ZoneId
    #24 = NameAndType        #26:#27      // VALUES:[Lext/mods/gameserver/enums/ZoneId;
    #25 = Utf8               ext/mods/gameserver/enums/ZoneId
    #26 = Utf8               VALUES
    #27 = Utf8               [Lext/mods/gameserver/enums/ZoneId;
    #28 = Fieldref           #13.#29      // ext/mods/gameserver/model/actor/Creature._zones:[B
    #29 = NameAndType        #30:#31      // _zones:[B
    #30 = Utf8               _zones
    #31 = Utf8               [B
    #32 = Fieldref           #13.#33      // ext/mods/gameserver/model/actor/Creature._zoneValidateCounter:B
    #33 = NameAndType        #34:#35      // _zoneValidateCounter:B
    #34 = Utf8               _zoneValidateCounter
    #35 = Utf8               B
    #36 = Class              #37          // ext/mods/gameserver/model/actor/container/creature/EffectList
    #37 = Utf8               ext/mods/gameserver/model/actor/container/creature/EffectList
    #38 = Methodref          #36.#39      // ext/mods/gameserver/model/actor/container/creature/EffectList."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #39 = NameAndType        #5:#40       // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #40 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
    #41 = Fieldref           #13.#42      // ext/mods/gameserver/model/actor/Creature._effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
    #42 = NameAndType        #43:#44      // _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
    #43 = Utf8               _effects
    #44 = Utf8               Lext/mods/gameserver/model/actor/container/creature/EffectList;
    #45 = Class              #46          // java/util/concurrent/ConcurrentHashMap
    #46 = Utf8               java/util/concurrent/ConcurrentHashMap
    #47 = Methodref          #45.#10      // java/util/concurrent/ConcurrentHashMap."<init>":()V
    #48 = Fieldref           #13.#49      // ext/mods/gameserver/model/actor/Creature._disabledSkills:Ljava/util/Map;
    #49 = NameAndType        #50:#51      // _disabledSkills:Ljava/util/Map;
    #50 = Utf8               _disabledSkills
    #51 = Utf8               Ljava/util/Map;
    #52 = Fieldref           #13.#53      // ext/mods/gameserver/model/actor/Creature._template:Lext/mods/gameserver/model/actor/template/CreatureTemplate;
    #53 = NameAndType        #54:#55      // _template:Lext/mods/gameserver/model/actor/template/CreatureTemplate;
    #54 = Utf8               _template
    #55 = Utf8               Lext/mods/gameserver/model/actor/template/CreatureTemplate;
    #56 = Fieldref           #57.#58      // ext/mods/gameserver/enums/skills/Stats.NUM_STATS:I
    #57 = Class              #59          // ext/mods/gameserver/enums/skills/Stats
    #58 = NameAndType        #60:#61      // NUM_STATS:I
    #59 = Utf8               ext/mods/gameserver/enums/skills/Stats
    #60 = Utf8               NUM_STATS
    #61 = Utf8               I
    #62 = Class              #63          // ext/mods/gameserver/skills/Calculator
    #63 = Utf8               ext/mods/gameserver/skills/Calculator
    #64 = Fieldref           #13.#65      // ext/mods/gameserver/model/actor/Creature._calculators:[Lext/mods/gameserver/skills/Calculator;
    #65 = NameAndType        #66:#67      // _calculators:[Lext/mods/gameserver/skills/Calculator;
    #66 = Utf8               _calculators
    #67 = Utf8               [Lext/mods/gameserver/skills/Calculator;
    #68 = Methodref          #13.#69      // ext/mods/gameserver/model/actor/Creature.addFuncsToNewCharacter:()V
    #69 = NameAndType        #70:#11      // addFuncsToNewCharacter:()V
    #70 = Utf8               addFuncsToNewCharacter
    #71 = Methodref          #13.#72      // ext/mods/gameserver/model/actor/Creature.setAI:()V
    #72 = NameAndType        #73:#11      // setAI:()V
    #73 = Utf8               setAI
    #74 = Methodref          #13.#75      // ext/mods/gameserver/model/actor/Creature.setStatus:()V
    #75 = NameAndType        #76:#11      // setStatus:()V
    #76 = Utf8               setStatus
    #77 = Methodref          #13.#78      // ext/mods/gameserver/model/actor/Creature.setMove:()V
    #78 = NameAndType        #79:#11      // setMove:()V
    #79 = Utf8               setMove
    #80 = Methodref          #13.#81      // ext/mods/gameserver/model/actor/Creature.setAttack:()V
    #81 = NameAndType        #82:#11      // setAttack:()V
    #82 = Utf8               setAttack
    #83 = Methodref          #13.#84      // ext/mods/gameserver/model/actor/Creature.setCast:()V
    #84 = NameAndType        #85:#11      // setCast:()V
    #85 = Utf8               setCast
    #86 = Methodref          #2.#87       // ext/mods/gameserver/model/WorldObject.knows:(Lext/mods/gameserver/model/WorldObject;)Z
    #87 = NameAndType        #88:#89      // knows:(Lext/mods/gameserver/model/WorldObject;)Z
    #88 = Utf8               knows
    #89 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
    #90 = Methodref          #13.#91      // ext/mods/gameserver/model/actor/Creature.isGM:()Z
    #91 = NameAndType        #92:#93      // isGM:()Z
    #92 = Utf8               isGM
    #93 = Utf8               ()Z
    #94 = Methodref          #2.#95       // ext/mods/gameserver/model/WorldObject.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
    #95 = NameAndType        #96:#97      // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
    #96 = Utf8               getActingPlayer
    #97 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
    #98 = Methodref          #99.#100     // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
    #99 = Class              #101         // ext/mods/gameserver/model/actor/Player
   #100 = NameAndType        #102:#103    // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #101 = Utf8               ext/mods/gameserver/model/actor/Player
   #102 = Utf8               getAppearance
   #103 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #104 = Methodref          #105.#106    // ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
   #105 = Class              #107         // ext/mods/gameserver/model/actor/container/player/Appearance
   #106 = NameAndType        #108:#93     // isVisible:()Z
   #107 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
   #108 = Utf8               isVisible
   #109 = Methodref          #110.#111    // ext/mods/gameserver/skills/funcs/FuncPAtkMod.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #110 = Class              #112         // ext/mods/gameserver/skills/funcs/FuncPAtkMod
   #111 = NameAndType        #113:#114    // getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #112 = Utf8               ext/mods/gameserver/skills/funcs/FuncPAtkMod
   #113 = Utf8               getInstance
   #114 = Utf8               ()Lext/mods/gameserver/skills/basefuncs/Func;
   #115 = Methodref          #13.#116     // ext/mods/gameserver/model/actor/Creature.addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
   #116 = NameAndType        #117:#118    // addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
   #117 = Utf8               addStatFunc
   #118 = Utf8               (Lext/mods/gameserver/skills/basefuncs/Func;)V
   #119 = Methodref          #120.#111    // ext/mods/gameserver/skills/funcs/FuncMAtkMod.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #120 = Class              #121         // ext/mods/gameserver/skills/funcs/FuncMAtkMod
   #121 = Utf8               ext/mods/gameserver/skills/funcs/FuncMAtkMod
   #122 = Methodref          #123.#111    // ext/mods/gameserver/skills/funcs/FuncPDefMod.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #123 = Class              #124         // ext/mods/gameserver/skills/funcs/FuncPDefMod
   #124 = Utf8               ext/mods/gameserver/skills/funcs/FuncPDefMod
   #125 = Methodref          #126.#111    // ext/mods/gameserver/skills/funcs/FuncMDefMod.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #126 = Class              #127         // ext/mods/gameserver/skills/funcs/FuncMDefMod
   #127 = Utf8               ext/mods/gameserver/skills/funcs/FuncMDefMod
   #128 = Methodref          #129.#111    // ext/mods/gameserver/skills/funcs/FuncMaxHpMul.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #129 = Class              #130         // ext/mods/gameserver/skills/funcs/FuncMaxHpMul
   #130 = Utf8               ext/mods/gameserver/skills/funcs/FuncMaxHpMul
   #131 = Methodref          #132.#111    // ext/mods/gameserver/skills/funcs/FuncMaxMpMul.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #132 = Class              #133         // ext/mods/gameserver/skills/funcs/FuncMaxMpMul
   #133 = Utf8               ext/mods/gameserver/skills/funcs/FuncMaxMpMul
   #134 = Methodref          #135.#111    // ext/mods/gameserver/skills/funcs/FuncRegenHpMul.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #135 = Class              #136         // ext/mods/gameserver/skills/funcs/FuncRegenHpMul
   #136 = Utf8               ext/mods/gameserver/skills/funcs/FuncRegenHpMul
   #137 = Methodref          #138.#111    // ext/mods/gameserver/skills/funcs/FuncRegenMpMul.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #138 = Class              #139         // ext/mods/gameserver/skills/funcs/FuncRegenMpMul
   #139 = Utf8               ext/mods/gameserver/skills/funcs/FuncRegenMpMul
   #140 = Methodref          #141.#111    // ext/mods/gameserver/skills/funcs/FuncAtkAccuracy.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #141 = Class              #142         // ext/mods/gameserver/skills/funcs/FuncAtkAccuracy
   #142 = Utf8               ext/mods/gameserver/skills/funcs/FuncAtkAccuracy
   #143 = Methodref          #144.#111    // ext/mods/gameserver/skills/funcs/FuncAtkEvasion.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #144 = Class              #145         // ext/mods/gameserver/skills/funcs/FuncAtkEvasion
   #145 = Utf8               ext/mods/gameserver/skills/funcs/FuncAtkEvasion
   #146 = Methodref          #147.#111    // ext/mods/gameserver/skills/funcs/FuncPAtkSpeed.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #147 = Class              #148         // ext/mods/gameserver/skills/funcs/FuncPAtkSpeed
   #148 = Utf8               ext/mods/gameserver/skills/funcs/FuncPAtkSpeed
   #149 = Methodref          #150.#111    // ext/mods/gameserver/skills/funcs/FuncMAtkSpeed.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #150 = Class              #151         // ext/mods/gameserver/skills/funcs/FuncMAtkSpeed
   #151 = Utf8               ext/mods/gameserver/skills/funcs/FuncMAtkSpeed
   #152 = Methodref          #153.#111    // ext/mods/gameserver/skills/funcs/FuncMoveSpeed.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #153 = Class              #154         // ext/mods/gameserver/skills/funcs/FuncMoveSpeed
   #154 = Utf8               ext/mods/gameserver/skills/funcs/FuncMoveSpeed
   #155 = Methodref          #156.#111    // ext/mods/gameserver/skills/funcs/FuncAtkCritical.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
   #156 = Class              #157         // ext/mods/gameserver/skills/funcs/FuncAtkCritical
   #157 = Utf8               ext/mods/gameserver/skills/funcs/FuncAtkCritical
   #158 = Methodref          #13.#159     // ext/mods/gameserver/model/actor/Creature.decayMe:()V
   #159 = NameAndType        #160:#11     // decayMe:()V
   #160 = Utf8               decayMe
   #161 = Methodref          #7.#162      // java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
   #162 = NameAndType        #163:#164    // compareAndSet:(ZZ)Z
   #163 = Utf8               compareAndSet
   #164 = Utf8               (ZZ)Z
   #165 = Methodref          #166.#167    // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #166 = Class              #168         // ext/mods/gameserver/model/World
   #167 = NameAndType        #113:#169    // getInstance:()Lext/mods/gameserver/model/World;
   #168 = Utf8               ext/mods/gameserver/model/World
   #169 = Utf8               ()Lext/mods/gameserver/model/World;
   #170 = Methodref          #13.#171     // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #171 = NameAndType        #172:#173    // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #172 = Utf8               getPosition
   #173 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #174 = Methodref          #166.#175    // ext/mods/gameserver/model/World.getRegion:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
   #175 = NameAndType        #176:#177    // getRegion:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
   #176 = Utf8               getRegion
   #177 = Utf8               (Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
   #178 = Methodref          #13.#179     // ext/mods/gameserver/model/actor/Creature.setRegion:(Lext/mods/gameserver/model/WorldRegion;)V
   #179 = NameAndType        #180:#181    // setRegion:(Lext/mods/gameserver/model/WorldRegion;)V
   #180 = Utf8               setRegion
   #181 = Utf8               (Lext/mods/gameserver/model/WorldRegion;)V
   #182 = Fieldref           #23.#183     // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
   #183 = NameAndType        #184:#185    // PVP:Lext/mods/gameserver/enums/ZoneId;
   #184 = Utf8               PVP
   #185 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #186 = Methodref          #23.#187     // ext/mods/gameserver/enums/ZoneId.getId:()I
   #187 = NameAndType        #188:#189    // getId:()I
   #188 = Utf8               getId
   #189 = Utf8               ()I
   #190 = Fieldref           #23.#191     // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
   #191 = NameAndType        #192:#185    // PEACE:Lext/mods/gameserver/enums/ZoneId;
   #192 = Utf8               PEACE
   #193 = Methodref          #13.#194     // ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Z)V
   #194 = NameAndType        #195:#196    // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Z)V
   #195 = Utf8               broadcastPacket
   #196 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Z)V
   #197 = InvokeDynamic      #0:#198      // #0:accept:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)Ljava/util/function/Consumer;
   #198 = NameAndType        #199:#200    // accept:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)Ljava/util/function/Consumer;
   #199 = Utf8               accept
   #200 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)Ljava/util/function/Consumer;
   #201 = Methodref          #13.#202     // ext/mods/gameserver/model/actor/Creature.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
   #202 = NameAndType        #203:#204    // forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
   #203 = Utf8               forEachKnownType
   #204 = Utf8               (Ljava/lang/Class;Ljava/util/function/Consumer;)V
   #205 = InvokeDynamic      #1:#198      // #1:accept:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)Ljava/util/function/Consumer;
   #206 = Methodref          #13.#207     // ext/mods/gameserver/model/actor/Creature.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #207 = NameAndType        #208:#209    // forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #208 = Utf8               forEachKnownTypeInRadius
   #209 = Utf8               (Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #210 = Methodref          #13.#211     // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #211 = NameAndType        #212:#93     // isDead:()Z
   #212 = Utf8               isDead
   #213 = Methodref          #214.#215    // ext/mods/commons/random/Rnd.get:(II)I
   #214 = Class              #216         // ext/mods/commons/random/Rnd
   #215 = NameAndType        #217:#218    // get:(II)I
   #216 = Utf8               ext/mods/commons/random/Rnd
   #217 = Utf8               get
   #218 = Utf8               (II)I
   #219 = Methodref          #220.#221    // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #220 = Class              #222         // ext/mods/gameserver/geoengine/GeoEngine
   #221 = NameAndType        #113:#223    // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #222 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #223 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #224 = Methodref          #220.#225    // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
   #225 = NameAndType        #226:#227    // getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
   #226 = Utf8               getValidLocation
   #227 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
   #228 = Methodref          #229.#230    // ext/mods/gameserver/model/location/Location.getX:()I
   #229 = Class              #231         // ext/mods/gameserver/model/location/Location
   #230 = NameAndType        #232:#189    // getX:()I
   #231 = Utf8               ext/mods/gameserver/model/location/Location
   #232 = Utf8               getX
   #233 = Methodref          #229.#234    // ext/mods/gameserver/model/location/Location.getY:()I
   #234 = NameAndType        #235:#189    // getY:()I
   #235 = Utf8               getY
   #236 = Methodref          #13.#237     // ext/mods/gameserver/model/actor/Creature.isFlying:()Z
   #237 = NameAndType        #238:#93     // isFlying:()Z
   #238 = Utf8               isFlying
   #239 = Methodref          #240.#241    // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #240 = Class              #242         // ext/mods/gameserver/data/manager/ZoneManager
   #241 = NameAndType        #113:#243    // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #242 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
   #243 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
   #244 = Class              #245         // ext/mods/gameserver/model/zone/type/WaterZone
   #245 = Utf8               ext/mods/gameserver/model/zone/type/WaterZone
   #246 = Methodref          #240.#247    // ext/mods/gameserver/data/manager/ZoneManager.getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
   #247 = NameAndType        #248:#249    // getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
   #248 = Utf8               getZone
   #249 = Utf8               (IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
   #250 = Methodref          #220.#251    // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
   #251 = NameAndType        #252:#253    // getHeight:(III)S
   #252 = Utf8               getHeight
   #253 = Utf8               (III)S
   #254 = Class              #255         // ext/mods/gameserver/network/serverpackets/TeleportToLocation
   #255 = Utf8               ext/mods/gameserver/network/serverpackets/TeleportToLocation
   #256 = Methodref          #254.#257    // ext/mods/gameserver/network/serverpackets/TeleportToLocation."<init>":(Lext/mods/gameserver/model/WorldObject;IIIZ)V
   #257 = NameAndType        #5:#258      // "<init>":(Lext/mods/gameserver/model/WorldObject;IIIZ)V
   #258 = Utf8               (Lext/mods/gameserver/model/WorldObject;IIIZ)V
   #259 = Methodref          #13.#260     // ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #260 = NameAndType        #195:#261    // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #261 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #262 = Methodref          #263.#264    // ext/mods/gameserver/model/location/SpawnLocation.set:(III)V
   #263 = Class              #265         // ext/mods/gameserver/model/location/SpawnLocation
   #264 = NameAndType        #266:#267    // set:(III)V
   #265 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #266 = Utf8               set
   #267 = Utf8               (III)V
   #268 = Methodref          #13.#269     // ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #269 = NameAndType        #270:#271    // getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #270 = Utf8               getAI
   #271 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #272 = Fieldref           #273.#274    // ext/mods/gameserver/enums/AiEventType.TELEPORTED:Lext/mods/gameserver/enums/AiEventType;
   #273 = Class              #275         // ext/mods/gameserver/enums/AiEventType
   #274 = NameAndType        #276:#277    // TELEPORTED:Lext/mods/gameserver/enums/AiEventType;
   #275 = Utf8               ext/mods/gameserver/enums/AiEventType
   #276 = Utf8               TELEPORTED
   #277 = Utf8               Lext/mods/gameserver/enums/AiEventType;
   #278 = Methodref          #279.#280    // ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #279 = Class              #281         // ext/mods/gameserver/model/actor/ai/type/CreatureAI
   #280 = NameAndType        #282:#283    // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #281 = Utf8               ext/mods/gameserver/model/actor/ai/type/CreatureAI
   #282 = Utf8               notifyEvent
   #283 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #284 = Methodref          #13.#285     // ext/mods/gameserver/model/actor/Creature.refreshKnownlist:()V
   #285 = NameAndType        #286:#11     // refreshKnownlist:()V
   #286 = Utf8               refreshKnownlist
   #287 = Methodref          #13.#288     // ext/mods/gameserver/model/actor/Creature.forceSeeCreature:()V
   #288 = NameAndType        #289:#11     // forceSeeCreature:()V
   #289 = Utf8               forceSeeCreature
   #290 = Methodref          #13.#291     // ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #291 = NameAndType        #292:#293    // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #292 = Utf8               getMove
   #293 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #294 = Methodref          #295.#296    // ext/mods/gameserver/model/actor/move/CreatureMove.resetGeoPathFailCount:()V
   #295 = Class              #297         // ext/mods/gameserver/model/actor/move/CreatureMove
   #296 = NameAndType        #298:#11     // resetGeoPathFailCount:()V
   #297 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
   #298 = Utf8               resetGeoPathFailCount
   #299 = Methodref          #295.#300    // ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
   #300 = NameAndType        #301:#11     // stop:()V
   #301 = Utf8               stop
   #302 = Methodref          #229.#303    // ext/mods/gameserver/model/location/Location.getZ:()I
   #303 = NameAndType        #304:#189    // getZ:()I
   #304 = Utf8               getZ
   #305 = Methodref          #13.#306     // ext/mods/gameserver/model/actor/Creature.instantTeleportTo:(IIII)V
   #306 = NameAndType        #307:#308    // instantTeleportTo:(IIII)V
   #307 = Utf8               instantTeleportTo
   #308 = Utf8               (IIII)V
   #309 = Methodref          #13.#310     // ext/mods/gameserver/model/actor/Creature.abortAll:(Z)V
   #310 = NameAndType        #311:#312    // abortAll:(Z)V
   #311 = Utf8               abortAll
   #312 = Utf8               (Z)V
   #313 = Methodref          #99.#314     // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
   #314 = NameAndType        #315:#316    // getClient:()Lext/mods/gameserver/network/GameClient;
   #315 = Utf8               getClient
   #316 = Utf8               ()Lext/mods/gameserver/network/GameClient;
   #317 = Methodref          #318.#319    // ext/mods/gameserver/network/GameClient.isDetached:()Z
   #318 = Class              #320         // ext/mods/gameserver/network/GameClient
   #319 = NameAndType        #321:#93     // isDetached:()Z
   #320 = Utf8               ext/mods/gameserver/network/GameClient
   #321 = Utf8               isDetached
   #322 = Methodref          #13.#323     // ext/mods/gameserver/model/actor/Creature.onTeleported:()V
   #323 = NameAndType        #324:#11     // onTeleported:()V
   #324 = Utf8               onTeleported
   #325 = Methodref          #13.#326     // ext/mods/gameserver/model/actor/Creature.teleportTo:(IIII)Z
   #326 = NameAndType        #327:#328    // teleportTo:(IIII)Z
   #327 = Utf8               teleportTo
   #328 = Utf8               (IIII)Z
   #329 = Fieldref           #13.#330     // ext/mods/gameserver/model/actor/Creature._fusionSkill:Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
   #330 = NameAndType        #331:#332    // _fusionSkill:Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
   #331 = Utf8               _fusionSkill
   #332 = Utf8               Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
   #333 = Class              #334         // ext/mods/gameserver/model/actor/container/creature/FusionSkill
   #334 = Utf8               ext/mods/gameserver/model/actor/container/creature/FusionSkill
   #335 = Methodref          #333.#336    // ext/mods/gameserver/model/actor/container/creature/FusionSkill."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #336 = NameAndType        #5:#337      // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #337 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #338 = Methodref          #13.#339     // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #339 = NameAndType        #340:#341    // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #340 = Utf8               getStatus
   #341 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #342 = Methodref          #343.#344    // ext/mods/gameserver/model/actor/status/CreatureStatus.setHp:(D)V
   #343 = Class              #345         // ext/mods/gameserver/model/actor/status/CreatureStatus
   #344 = NameAndType        #346:#347    // setHp:(D)V
   #345 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
   #346 = Utf8               setHp
   #347 = Utf8               (D)V
   #348 = Methodref          #13.#349     // ext/mods/gameserver/model/actor/Creature.setIsDead:(Z)V
   #349 = NameAndType        #350:#312    // setIsDead:(Z)V
   #350 = Utf8               setIsDead
   #351 = Methodref          #343.#352    // ext/mods/gameserver/model/actor/status/CreatureStatus.stopHpMpRegeneration:()V
   #352 = NameAndType        #353:#11     // stopHpMpRegeneration:()V
   #353 = Utf8               stopHpMpRegeneration
   #354 = Methodref          #13.#355     // ext/mods/gameserver/model/actor/Creature.stopAllEffectsExceptThoseThatLastThroughDeath:()V
   #355 = NameAndType        #356:#11     // stopAllEffectsExceptThoseThatLastThroughDeath:()V
   #356 = Utf8               stopAllEffectsExceptThoseThatLastThroughDeath
   #357 = Methodref          #13.#358     // ext/mods/gameserver/model/actor/Creature.calculateRewards:(Lext/mods/gameserver/model/actor/Creature;)V
   #358 = NameAndType        #359:#40     // calculateRewards:(Lext/mods/gameserver/model/actor/Creature;)V
   #359 = Utf8               calculateRewards
   #360 = Methodref          #13.#361     // ext/mods/gameserver/model/actor/Creature.calculateMission:(Lext/mods/gameserver/model/actor/Creature;)V
   #361 = NameAndType        #362:#40     // calculateMission:(Lext/mods/gameserver/model/actor/Creature;)V
   #362 = Utf8               calculateMission
   #363 = Fieldref           #364.#365    // ext/mods/Config.BOTS_PREVENTION:Z
   #364 = Class              #366         // ext/mods/Config
   #365 = NameAndType        #367:#21     // BOTS_PREVENTION:Z
   #366 = Utf8               ext/mods/Config
   #367 = Utf8               BOTS_PREVENTION
   #368 = Methodref          #369.#370    // ext/mods/gameserver/data/manager/BotsPreventionManager.getInstance:()Lext/mods/gameserver/data/manager/BotsPreventionManager;
   #369 = Class              #371         // ext/mods/gameserver/data/manager/BotsPreventionManager
   #370 = NameAndType        #113:#372    // getInstance:()Lext/mods/gameserver/data/manager/BotsPreventionManager;
   #371 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager
   #372 = Utf8               ()Lext/mods/gameserver/data/manager/BotsPreventionManager;
   #373 = Methodref          #369.#374    // ext/mods/gameserver/data/manager/BotsPreventionManager.updateCounter:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
   #374 = NameAndType        #375:#376    // updateCounter:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
   #375 = Utf8               updateCounter
   #376 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
   #377 = Methodref          #343.#378    // ext/mods/gameserver/model/actor/status/CreatureStatus.broadcastStatusUpdate:()V
   #378 = NameAndType        #379:#11     // broadcastStatusUpdate:()V
   #379 = Utf8               broadcastStatusUpdate
   #380 = Fieldref           #273.#381    // ext/mods/gameserver/enums/AiEventType.DEAD:Lext/mods/gameserver/enums/AiEventType;
   #381 = NameAndType        #382:#277    // DEAD:Lext/mods/gameserver/enums/AiEventType;
   #382 = Utf8               DEAD
   #383 = Methodref          #279.#384    // ext/mods/gameserver/model/actor/ai/type/CreatureAI.stopAITask:()V
   #384 = NameAndType        #385:#11     // stopAITask:()V
   #385 = Utf8               stopAITask
   #386 = Methodref          #13.#387     // ext/mods/gameserver/model/actor/Creature.isTeleporting:()Z
   #387 = NameAndType        #388:#93     // isTeleporting:()Z
   #388 = Utf8               isTeleporting
   #389 = Fieldref           #13.#390     // ext/mods/gameserver/model/actor/Creature._status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #390 = NameAndType        #391:#392    // _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #391 = Utf8               _status
   #392 = Utf8               Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #393 = Methodref          #343.#394    // ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
   #394 = NameAndType        #395:#189    // getMaxHp:()I
   #395 = Utf8               getMaxHp
   #396 = Fieldref           #364.#397    // ext/mods/Config.RESPAWN_RESTORE_HP:D
   #397 = NameAndType        #398:#399    // RESPAWN_RESTORE_HP:D
   #398 = Utf8               RESPAWN_RESTORE_HP
   #399 = Utf8               D
   #400 = Class              #401         // ext/mods/gameserver/network/serverpackets/Revive
   #401 = Utf8               ext/mods/gameserver/network/serverpackets/Revive
   #402 = Methodref          #400.#403    // ext/mods/gameserver/network/serverpackets/Revive."<init>":(Lext/mods/gameserver/model/WorldObject;)V
   #403 = NameAndType        #5:#404      // "<init>":(Lext/mods/gameserver/model/WorldObject;)V
   #404 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
   #405 = Methodref          #406.#407    // ext/mods/extensions/listener/manager/CreatureListenerManager.getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
   #406 = Class              #408         // ext/mods/extensions/listener/manager/CreatureListenerManager
   #407 = NameAndType        #113:#409    // getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
   #408 = Utf8               ext/mods/extensions/listener/manager/CreatureListenerManager
   #409 = Utf8               ()Lext/mods/extensions/listener/manager/CreatureListenerManager;
   #410 = Methodref          #406.#411    // ext/mods/extensions/listener/manager/CreatureListenerManager.notifyRevive:(Lext/mods/gameserver/model/actor/Creature;)V
   #411 = NameAndType        #412:#40     // notifyRevive:(Lext/mods/gameserver/model/actor/Creature;)V
   #412 = Utf8               notifyRevive
   #413 = Methodref          #13.#414     // ext/mods/gameserver/model/actor/Creature.doRevive:()V
   #414 = NameAndType        #415:#11     // doRevive:()V
   #415 = Utf8               doRevive
   #416 = Fieldref           #417.#418    // ext/mods/gameserver/enums/skills/EffectFlag.FEAR:Lext/mods/gameserver/enums/skills/EffectFlag;
   #417 = Class              #419         // ext/mods/gameserver/enums/skills/EffectFlag
   #418 = NameAndType        #420:#421    // FEAR:Lext/mods/gameserver/enums/skills/EffectFlag;
   #419 = Utf8               ext/mods/gameserver/enums/skills/EffectFlag
   #420 = Utf8               FEAR
   #421 = Utf8               Lext/mods/gameserver/enums/skills/EffectFlag;
   #422 = Methodref          #13.#423     // ext/mods/gameserver/model/actor/Creature.isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
   #423 = NameAndType        #424:#425    // isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
   #424 = Utf8               isAffected
   #425 = Utf8               (Lext/mods/gameserver/enums/skills/EffectFlag;)Z
   #426 = Fieldref           #417.#427    // ext/mods/gameserver/enums/skills/EffectFlag.CONFUSED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #427 = NameAndType        #428:#421    // CONFUSED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #428 = Utf8               CONFUSED
   #429 = Fieldref           #417.#430    // ext/mods/gameserver/enums/skills/EffectFlag.MUTED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #430 = NameAndType        #431:#421    // MUTED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #431 = Utf8               MUTED
   #432 = Fieldref           #417.#433    // ext/mods/gameserver/enums/skills/EffectFlag.PHYSICAL_MUTED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #433 = NameAndType        #434:#421    // PHYSICAL_MUTED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #434 = Utf8               PHYSICAL_MUTED
   #435 = Fieldref           #417.#436    // ext/mods/gameserver/enums/skills/EffectFlag.ROOTED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #436 = NameAndType        #437:#421    // ROOTED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #437 = Utf8               ROOTED
   #438 = Fieldref           #417.#439    // ext/mods/gameserver/enums/skills/EffectFlag.SLEEP:Lext/mods/gameserver/enums/skills/EffectFlag;
   #439 = NameAndType        #440:#421    // SLEEP:Lext/mods/gameserver/enums/skills/EffectFlag;
   #440 = Utf8               SLEEP
   #441 = Fieldref           #417.#442    // ext/mods/gameserver/enums/skills/EffectFlag.STUNNED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #442 = NameAndType        #443:#421    // STUNNED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #443 = Utf8               STUNNED
   #444 = Fieldref           #417.#445    // ext/mods/gameserver/enums/skills/EffectFlag.BETRAYED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #445 = NameAndType        #446:#421    // BETRAYED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #446 = Utf8               BETRAYED
   #447 = Fieldref           #417.#448    // ext/mods/gameserver/enums/skills/EffectFlag.MEDITATING:Lext/mods/gameserver/enums/skills/EffectFlag;
   #448 = NameAndType        #449:#421    // MEDITATING:Lext/mods/gameserver/enums/skills/EffectFlag;
   #449 = Utf8               MEDITATING
   #450 = Methodref          #13.#451     // ext/mods/gameserver/model/actor/Creature.getAllSkillsDisabled:()Z
   #451 = NameAndType        #452:#93     // getAllSkillsDisabled:()Z
   #452 = Utf8               getAllSkillsDisabled
   #453 = Methodref          #13.#454     // ext/mods/gameserver/model/actor/Creature.isStunned:()Z
   #454 = NameAndType        #455:#93     // isStunned:()Z
   #455 = Utf8               isStunned
   #456 = Methodref          #13.#457     // ext/mods/gameserver/model/actor/Creature.isImmobileUntilAttacked:()Z
   #457 = NameAndType        #458:#93     // isImmobileUntilAttacked:()Z
   #458 = Utf8               isImmobileUntilAttacked
   #459 = Methodref          #13.#460     // ext/mods/gameserver/model/actor/Creature.isSleeping:()Z
   #460 = NameAndType        #461:#93     // isSleeping:()Z
   #461 = Utf8               isSleeping
   #462 = Methodref          #13.#463     // ext/mods/gameserver/model/actor/Creature.isParalyzed:()Z
   #463 = NameAndType        #464:#93     // isParalyzed:()Z
   #464 = Utf8               isParalyzed
   #465 = Methodref          #13.#466     // ext/mods/gameserver/model/actor/Creature.isAfraid:()Z
   #466 = NameAndType        #467:#93     // isAfraid:()Z
   #467 = Utf8               isAfraid
   #468 = Methodref          #13.#469     // ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
   #469 = NameAndType        #470:#93     // isAlikeDead:()Z
   #470 = Utf8               isAlikeDead
   #471 = Methodref          #13.#472     // ext/mods/gameserver/model/actor/Creature.isRooted:()Z
   #472 = NameAndType        #473:#93     // isRooted:()Z
   #473 = Utf8               isRooted
   #474 = Methodref          #13.#475     // ext/mods/gameserver/model/actor/Creature.isImmobilized:()Z
   #475 = NameAndType        #476:#93     // isImmobilized:()Z
   #476 = Utf8               isImmobilized
   #477 = Methodref          #13.#478     // ext/mods/gameserver/model/actor/Creature.isSitting:()Z
   #478 = NameAndType        #479:#93     // isSitting:()Z
   #479 = Utf8               isSitting
   #480 = Methodref          #13.#481     // ext/mods/gameserver/model/actor/Creature.isSittingNow:()Z
   #481 = NameAndType        #482:#93     // isSittingNow:()Z
   #482 = Utf8               isSittingNow
   #483 = Methodref          #13.#484     // ext/mods/gameserver/model/actor/Creature.isStandingNow:()Z
   #484 = NameAndType        #485:#93     // isStandingNow:()Z
   #485 = Utf8               isStandingNow
   #486 = Methodref          #13.#487     // ext/mods/gameserver/model/actor/Creature.isConfused:()Z
   #487 = NameAndType        #488:#93     // isConfused:()Z
   #488 = Utf8               isConfused
   #489 = Fieldref           #13.#490     // ext/mods/gameserver/model/actor/Creature._isImmobilized:Z
   #490 = NameAndType        #491:#21     // _isImmobilized:Z
   #491 = Utf8               _isImmobilized
   #492 = Fieldref           #13.#493     // ext/mods/gameserver/model/actor/Creature._isDead:Z
   #493 = NameAndType        #494:#21     // _isDead:Z
   #494 = Utf8               _isDead
   #495 = Fieldref           #13.#496     // ext/mods/gameserver/model/actor/Creature._isParalyzed:Z
   #496 = NameAndType        #497:#21     // _isParalyzed:Z
   #497 = Utf8               _isParalyzed
   #498 = Fieldref           #417.#499    // ext/mods/gameserver/enums/skills/EffectFlag.PARALYZED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #499 = NameAndType        #500:#421    // PARALYZED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #500 = Utf8               PARALYZED
   #501 = Fieldref           #13.#502     // ext/mods/gameserver/model/actor/Creature._isFlying:Z
   #502 = NameAndType        #503:#21     // _isFlying:Z
   #503 = Utf8               _isFlying
   #504 = Fieldref           #13.#505     // ext/mods/gameserver/model/actor/Creature._isRunning:Z
   #505 = NameAndType        #506:#21     // _isRunning:Z
   #506 = Utf8               _isRunning
   #507 = Methodref          #343.#508    // ext/mods/gameserver/model/actor/status/CreatureStatus.getMoveSpeed:()F
   #508 = NameAndType        #509:#510    // getMoveSpeed:()F
   #509 = Utf8               getMoveSpeed
   #510 = Utf8               ()F
   #511 = Class              #512         // ext/mods/gameserver/network/serverpackets/ChangeMoveType
   #512 = Utf8               ext/mods/gameserver/network/serverpackets/ChangeMoveType
   #513 = Methodref          #511.#39     // ext/mods/gameserver/network/serverpackets/ChangeMoveType."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #514 = Methodref          #13.#515     // ext/mods/gameserver/model/actor/Creature.isRunning:()Z
   #515 = NameAndType        #516:#93     // isRunning:()Z
   #516 = Utf8               isRunning
   #517 = Methodref          #13.#518     // ext/mods/gameserver/model/actor/Creature.setWalkOrRun:(Z)V
   #518 = NameAndType        #519:#312    // setWalkOrRun:(Z)V
   #519 = Utf8               setWalkOrRun
   #520 = Methodref          #7.#521      // java/util/concurrent/atomic/AtomicBoolean.get:()Z
   #521 = NameAndType        #217:#93     // get:()Z
   #522 = Fieldref           #13.#523     // ext/mods/gameserver/model/actor/Creature._isInvul:Z
   #523 = NameAndType        #524:#21     // _isInvul:Z
   #524 = Utf8               _isInvul
   #525 = Fieldref           #13.#526     // ext/mods/gameserver/model/actor/Creature._ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #526 = NameAndType        #527:#528    // _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #527 = Utf8               _ai
   #528 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #529 = Methodref          #279.#39     // ext/mods/gameserver/model/actor/ai/type/CreatureAI."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #530 = Methodref          #343.#39     // ext/mods/gameserver/model/actor/status/CreatureStatus."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #531 = Fieldref           #13.#532     // ext/mods/gameserver/model/actor/Creature._move:Lext/mods/gameserver/model/actor/move/CreatureMove;
   #532 = NameAndType        #533:#534    // _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
   #533 = Utf8               _move
   #534 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove;
   #535 = Methodref          #295.#39     // ext/mods/gameserver/model/actor/move/CreatureMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #536 = Fieldref           #13.#537     // ext/mods/gameserver/model/actor/Creature._attack:Lext/mods/gameserver/model/actor/attack/CreatureAttack;
   #537 = NameAndType        #538:#539    // _attack:Lext/mods/gameserver/model/actor/attack/CreatureAttack;
   #538 = Utf8               _attack
   #539 = Utf8               Lext/mods/gameserver/model/actor/attack/CreatureAttack;
   #540 = Class              #541         // ext/mods/gameserver/model/actor/attack/CreatureAttack
   #541 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack
   #542 = Methodref          #540.#39     // ext/mods/gameserver/model/actor/attack/CreatureAttack."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #543 = Fieldref           #13.#544     // ext/mods/gameserver/model/actor/Creature._cast:Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #544 = NameAndType        #545:#546    // _cast:Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #545 = Utf8               _cast
   #546 = Utf8               Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #547 = Class              #548         // ext/mods/gameserver/model/actor/cast/CreatureCast
   #548 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
   #549 = Methodref          #547.#39     // ext/mods/gameserver/model/actor/cast/CreatureCast."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #550 = Fieldref           #13.#551     // ext/mods/gameserver/model/actor/Creature._title:Ljava/lang/String;
   #551 = NameAndType        #552:#553    // _title:Ljava/lang/String;
   #552 = Utf8               _title
   #553 = Utf8               Ljava/lang/String;
   #554 = String             #555         //
   #555 = Utf8
   #556 = Methodref          #557.#558    // ext/mods/commons/lang/StringUtil.trim:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #557 = Class              #559         // ext/mods/commons/lang/StringUtil
   #558 = NameAndType        #560:#561    // trim:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #559 = Utf8               ext/mods/commons/lang/StringUtil
   #560 = Utf8               trim
   #561 = Utf8               (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #562 = Fieldref           #13.#563     // ext/mods/gameserver/model/actor/Creature._abnormalEffects:I
   #563 = NameAndType        #564:#61     // _abnormalEffects:I
   #564 = Utf8               _abnormalEffects
   #565 = Fieldref           #566.#567    // ext/mods/gameserver/enums/skills/AbnormalEffect.STUN:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #566 = Class              #568         // ext/mods/gameserver/enums/skills/AbnormalEffect
   #567 = NameAndType        #569:#570    // STUN:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #568 = Utf8               ext/mods/gameserver/enums/skills/AbnormalEffect
   #569 = Utf8               STUN
   #570 = Utf8               Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #571 = Methodref          #566.#572    // ext/mods/gameserver/enums/skills/AbnormalEffect.getMask:()I
   #572 = NameAndType        #573:#189    // getMask:()I
   #573 = Utf8               getMask
   #574 = Fieldref           #566.#575    // ext/mods/gameserver/enums/skills/AbnormalEffect.ROOT:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #575 = NameAndType        #576:#570    // ROOT:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #576 = Utf8               ROOT
   #577 = Fieldref           #566.#578    // ext/mods/gameserver/enums/skills/AbnormalEffect.SLEEP:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #578 = NameAndType        #440:#570    // SLEEP:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #579 = Fieldref           #566.#580    // ext/mods/gameserver/enums/skills/AbnormalEffect.FEAR:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #580 = NameAndType        #420:#570    // FEAR:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #581 = Methodref          #13.#582     // ext/mods/gameserver/model/actor/Creature.isMuted:()Z
   #582 = NameAndType        #583:#93     // isMuted:()Z
   #583 = Utf8               isMuted
   #584 = Fieldref           #566.#585    // ext/mods/gameserver/enums/skills/AbnormalEffect.MUTED:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #585 = NameAndType        #431:#570    // MUTED:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #586 = Methodref          #13.#587     // ext/mods/gameserver/model/actor/Creature.isPhysicalMuted:()Z
   #587 = NameAndType        #588:#93     // isPhysicalMuted:()Z
   #588 = Utf8               isPhysicalMuted
   #589 = Fieldref           #566.#590    // ext/mods/gameserver/enums/skills/AbnormalEffect.FLOATING_ROOT:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #590 = NameAndType        #591:#570    // FLOATING_ROOT:Lext/mods/gameserver/enums/skills/AbnormalEffect;
   #591 = Utf8               FLOATING_ROOT
   #592 = Methodref          #13.#593     // ext/mods/gameserver/model/actor/Creature.updateAbnormalEffect:()V
   #593 = NameAndType        #594:#11     // updateAbnormalEffect:()V
   #594 = Utf8               updateAbnormalEffect
   #595 = Methodref          #596.#597    // ext/mods/gameserver/skills/AbstractEffect.getEffected:()Lext/mods/gameserver/model/actor/Creature;
   #596 = Class              #598         // ext/mods/gameserver/skills/AbstractEffect
   #597 = NameAndType        #599:#600    // getEffected:()Lext/mods/gameserver/model/actor/Creature;
   #598 = Utf8               ext/mods/gameserver/skills/AbstractEffect
   #599 = Utf8               getEffected
   #600 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
   #601 = Class              #602         // ext/mods/gameserver/model/actor/Npc
   #602 = Utf8               ext/mods/gameserver/model/actor/Npc
   #603 = Methodref          #601.#604    // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #604 = NameAndType        #605:#606    // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #605 = Utf8               getTemplate
   #606 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #607 = Fieldref           #608.#609    // ext/mods/gameserver/enums/EventHandler.SEE_SPELL:Lext/mods/gameserver/enums/EventHandler;
   #608 = Class              #610         // ext/mods/gameserver/enums/EventHandler
   #609 = NameAndType        #611:#612    // SEE_SPELL:Lext/mods/gameserver/enums/EventHandler;
   #610 = Utf8               ext/mods/gameserver/enums/EventHandler
   #611 = Utf8               SEE_SPELL
   #612 = Utf8               Lext/mods/gameserver/enums/EventHandler;
   #613 = Methodref          #614.#615    // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #614 = Class              #616         // ext/mods/gameserver/model/actor/template/NpcTemplate
   #615 = NameAndType        #617:#618    // getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #616 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #617 = Utf8               getEventQuests
   #618 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #619 = InterfaceMethodref #620.#621    // java/util/List.iterator:()Ljava/util/Iterator;
   #620 = Class              #622         // java/util/List
   #621 = NameAndType        #623:#624    // iterator:()Ljava/util/Iterator;
   #622 = Utf8               java/util/List
   #623 = Utf8               iterator
   #624 = Utf8               ()Ljava/util/Iterator;
   #625 = InterfaceMethodref #626.#627    // java/util/Iterator.hasNext:()Z
   #626 = Class              #628         // java/util/Iterator
   #627 = NameAndType        #629:#93     // hasNext:()Z
   #628 = Utf8               java/util/Iterator
   #629 = Utf8               hasNext
   #630 = InterfaceMethodref #626.#631    // java/util/Iterator.next:()Ljava/lang/Object;
   #631 = NameAndType        #632:#633    // next:()Ljava/lang/Object;
   #632 = Utf8               next
   #633 = Utf8               ()Ljava/lang/Object;
   #634 = Class              #635         // ext/mods/gameserver/scripting/Quest
   #635 = Utf8               ext/mods/gameserver/scripting/Quest
   #636 = Methodref          #596.#637    // ext/mods/gameserver/skills/AbstractEffect.getEffector:()Lext/mods/gameserver/model/actor/Creature;
   #637 = NameAndType        #638:#600    // getEffector:()Lext/mods/gameserver/model/actor/Creature;
   #638 = Utf8               getEffector
   #639 = Methodref          #596.#640    // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #640 = NameAndType        #641:#642    // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #641 = Utf8               getSkill
   #642 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #643 = Methodref          #634.#644    // ext/mods/gameserver/scripting/Quest.onAbnormalStatusChanged:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #644 = NameAndType        #645:#646    // onAbnormalStatusChanged:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #645 = Utf8               onAbnormalStatusChanged
   #646 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #647 = Methodref          #36.#648     // ext/mods/gameserver/model/actor/container/creature/EffectList.queueEffect:(Lext/mods/gameserver/skills/AbstractEffect;Z)V
   #648 = NameAndType        #649:#650    // queueEffect:(Lext/mods/gameserver/skills/AbstractEffect;Z)V
   #649 = Utf8               queueEffect
   #650 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;Z)V
   #651 = Methodref          #36.#652     // ext/mods/gameserver/model/actor/container/creature/EffectList.stopAllEffects:()V
   #652 = NameAndType        #653:#11     // stopAllEffects:()V
   #653 = Utf8               stopAllEffects
   #654 = Methodref          #36.#655     // ext/mods/gameserver/model/actor/container/creature/EffectList.stopAllEffectDebuff:()V
   #655 = NameAndType        #656:#11     // stopAllEffectDebuff:()V
   #656 = Utf8               stopAllEffectDebuff
   #657 = Methodref          #36.#355     // ext/mods/gameserver/model/actor/container/creature/EffectList.stopAllEffectsExceptThoseThatLastThroughDeath:()V
   #658 = Methodref          #36.#659     // ext/mods/gameserver/model/actor/container/creature/EffectList.stopSkillEffects:(I)V
   #659 = NameAndType        #660:#6      // stopSkillEffects:(I)V
   #660 = Utf8               stopSkillEffects
   #661 = Methodref          #36.#662     // ext/mods/gameserver/model/actor/container/creature/EffectList.stopSkillEffects:(Lext/mods/gameserver/enums/skills/SkillType;I)V
   #662 = NameAndType        #660:#663    // stopSkillEffects:(Lext/mods/gameserver/enums/skills/SkillType;I)V
   #663 = Utf8               (Lext/mods/gameserver/enums/skills/SkillType;I)V
   #664 = Methodref          #36.#665     // ext/mods/gameserver/model/actor/container/creature/EffectList.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
   #665 = NameAndType        #666:#667    // stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
   #666 = Utf8               stopEffects
   #667 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)V
   #668 = Methodref          #36.#669     // ext/mods/gameserver/model/actor/container/creature/EffectList.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
   #669 = NameAndType        #670:#671    // getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
   #670 = Utf8               getAllEffects
   #671 = Utf8               ()[Lext/mods/gameserver/skills/AbstractEffect;
   #672 = Methodref          #36.#673     // ext/mods/gameserver/model/actor/container/creature/EffectList.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
   #673 = NameAndType        #674:#675    // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
   #674 = Utf8               getFirstEffect
   #675 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
   #676 = Methodref          #36.#677     // ext/mods/gameserver/model/actor/container/creature/EffectList.getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
   #677 = NameAndType        #674:#678    // getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
   #678 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
   #679 = Methodref          #36.#680     // ext/mods/gameserver/model/actor/container/creature/EffectList.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
   #680 = NameAndType        #674:#681    // getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
   #681 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
   #682 = Methodref          #13.#683     // ext/mods/gameserver/model/actor/Creature.updateEffectIcons:(Z)V
   #683 = NameAndType        #684:#312    // updateEffectIcons:(Z)V
   #684 = Utf8               updateEffectIcons
   #685 = Methodref          #686.#687    // ext/mods/gameserver/skills/basefuncs/Func.getStat:()Lext/mods/gameserver/enums/skills/Stats;
   #686 = Class              #688         // ext/mods/gameserver/skills/basefuncs/Func
   #687 = NameAndType        #689:#690    // getStat:()Lext/mods/gameserver/enums/skills/Stats;
   #688 = Utf8               ext/mods/gameserver/skills/basefuncs/Func
   #689 = Utf8               getStat
   #690 = Utf8               ()Lext/mods/gameserver/enums/skills/Stats;
   #691 = Methodref          #57.#692     // ext/mods/gameserver/enums/skills/Stats.ordinal:()I
   #692 = NameAndType        #693:#189    // ordinal:()I
   #693 = Utf8               ordinal
   #694 = Methodref          #62.#10      // ext/mods/gameserver/skills/Calculator."<init>":()V
   #695 = Methodref          #62.#696     // ext/mods/gameserver/skills/Calculator.addFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
   #696 = NameAndType        #697:#118    // addFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
   #697 = Utf8               addFunc
   #698 = InterfaceMethodref #620.#699    // java/util/List.isEmpty:()Z
   #699 = NameAndType        #700:#93     // isEmpty:()Z
   #700 = Utf8               isEmpty
   #701 = InterfaceMethodref #620.#702    // java/util/List.stream:()Ljava/util/stream/Stream;
   #702 = NameAndType        #703:#704    // stream:()Ljava/util/stream/Stream;
   #703 = Utf8               stream
   #704 = Utf8               ()Ljava/util/stream/Stream;
   #705 = InvokeDynamic      #2:#706      // #2:apply:()Ljava/util/function/Function;
   #706 = NameAndType        #707:#708    // apply:()Ljava/util/function/Function;
   #707 = Utf8               apply
   #708 = Utf8               ()Ljava/util/function/Function;
   #709 = InterfaceMethodref #710.#711    // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #710 = Class              #712         // java/util/stream/Stream
   #711 = NameAndType        #713:#714    // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #712 = Utf8               java/util/stream/Stream
   #713 = Utf8               map
   #714 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #715 = Methodref          #716.#717    // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
   #716 = Class              #718         // java/util/stream/Collectors
   #717 = NameAndType        #719:#720    // toList:()Ljava/util/stream/Collector;
   #718 = Utf8               java/util/stream/Collectors
   #719 = Utf8               toList
   #720 = Utf8               ()Ljava/util/stream/Collector;
   #721 = InterfaceMethodref #710.#722    // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #722 = NameAndType        #723:#724    // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #723 = Utf8               collect
   #724 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
   #725 = Methodref          #13.#726     // ext/mods/gameserver/model/actor/Creature.broadcastModifiedStats:(Ljava/util/List;)V
   #726 = NameAndType        #727:#728    // broadcastModifiedStats:(Ljava/util/List;)V
   #727 = Utf8               broadcastModifiedStats
   #728 = Utf8               (Ljava/util/List;)V
   #729 = Methodref          #62.#730     // ext/mods/gameserver/skills/Calculator.removeOwner:(Ljava/lang/Object;)Ljava/util/List;
   #730 = NameAndType        #731:#732    // removeOwner:(Ljava/lang/Object;)Ljava/util/List;
   #731 = Utf8               removeOwner
   #732 = Utf8               (Ljava/lang/Object;)Ljava/util/List;
   #733 = InterfaceMethodref #620.#734    // java/util/List.addAll:(Ljava/util/Collection;)Z
   #734 = NameAndType        #735:#736    // addAll:(Ljava/util/Collection;)Z
   #735 = Utf8               addAll
   #736 = Utf8               (Ljava/util/Collection;)Z
   #737 = Methodref          #62.#738     // ext/mods/gameserver/skills/Calculator.size:()I
   #738 = NameAndType        #739:#189    // size:()I
   #739 = Utf8               size
   #740 = Methodref          #596.#741    // ext/mods/gameserver/skills/AbstractEffect.cantUpdateAnymore:()Z
   #741 = NameAndType        #742:#93     // cantUpdateAnymore:()Z
   #742 = Utf8               cantUpdateAnymore
   #743 = Class              #744         // ext/mods/gameserver/model/actor/Summon
   #744 = Utf8               ext/mods/gameserver/model/actor/Summon
   #745 = Methodref          #743.#746    // ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #746 = NameAndType        #747:#97     // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #747 = Utf8               getOwner
   #748 = Methodref          #743.#749    // ext/mods/gameserver/model/actor/Summon.updateAndBroadcastStatusAndInfos:(I)V
   #749 = NameAndType        #750:#6      // updateAndBroadcastStatusAndInfos:(I)V
   #750 = Utf8               updateAndBroadcastStatusAndInfos
   #751 = Fieldref           #57.#752     // ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #752 = NameAndType        #753:#754    // POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #753 = Utf8               POWER_ATTACK_SPEED
   #754 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
   #755 = Class              #756         // ext/mods/gameserver/network/serverpackets/StatusUpdate
   #756 = Utf8               ext/mods/gameserver/network/serverpackets/StatusUpdate
   #757 = Methodref          #755.#403    // ext/mods/gameserver/network/serverpackets/StatusUpdate."<init>":(Lext/mods/gameserver/model/WorldObject;)V
   #758 = Fieldref           #759.#760    // ext/mods/gameserver/enums/StatusType.ATK_SPD:Lext/mods/gameserver/enums/StatusType;
   #759 = Class              #761         // ext/mods/gameserver/enums/StatusType
   #760 = NameAndType        #762:#763    // ATK_SPD:Lext/mods/gameserver/enums/StatusType;
   #761 = Utf8               ext/mods/gameserver/enums/StatusType
   #762 = Utf8               ATK_SPD
   #763 = Utf8               Lext/mods/gameserver/enums/StatusType;
   #764 = Methodref          #343.#765    // ext/mods/gameserver/model/actor/status/CreatureStatus.getPAtkSpd:()I
   #765 = NameAndType        #766:#189    // getPAtkSpd:()I
   #766 = Utf8               getPAtkSpd
   #767 = Methodref          #755.#768    // ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
   #768 = NameAndType        #769:#770    // addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
   #769 = Utf8               addAttribute
   #770 = Utf8               (Lext/mods/gameserver/enums/StatusType;I)V
   #771 = Fieldref           #57.#772     // ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #772 = NameAndType        #773:#754    // MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #773 = Utf8               MAGIC_ATTACK_SPEED
   #774 = Fieldref           #759.#775    // ext/mods/gameserver/enums/StatusType.CAST_SPD:Lext/mods/gameserver/enums/StatusType;
   #775 = NameAndType        #776:#763    // CAST_SPD:Lext/mods/gameserver/enums/StatusType;
   #776 = Utf8               CAST_SPD
   #777 = Methodref          #343.#778    // ext/mods/gameserver/model/actor/status/CreatureStatus.getMAtkSpd:()I
   #778 = NameAndType        #779:#189    // getMAtkSpd:()I
   #779 = Utf8               getMAtkSpd
   #780 = Fieldref           #57.#781     // ext/mods/gameserver/enums/skills/Stats.MAX_HP:Lext/mods/gameserver/enums/skills/Stats;
   #781 = NameAndType        #782:#754    // MAX_HP:Lext/mods/gameserver/enums/skills/Stats;
   #782 = Utf8               MAX_HP
   #783 = Class              #784         // ext/mods/gameserver/model/actor/Attackable
   #784 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #785 = Fieldref           #759.#786    // ext/mods/gameserver/enums/StatusType.MAX_HP:Lext/mods/gameserver/enums/StatusType;
   #786 = NameAndType        #782:#763    // MAX_HP:Lext/mods/gameserver/enums/StatusType;
   #787 = Fieldref           #57.#788     // ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #788 = NameAndType        #789:#754    // RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #789 = Utf8               RUN_SPEED
   #790 = Methodref          #99.#791     // ext/mods/gameserver/model/actor/Player.updateAndBroadcastStatus:(I)V
   #791 = NameAndType        #792:#6      // updateAndBroadcastStatus:(I)V
   #792 = Utf8               updateAndBroadcastStatus
   #793 = InvokeDynamic      #3:#794      // #3:accept:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
   #794 = NameAndType        #199:#795    // accept:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
   #795 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
   #796 = Methodref          #797.#798    // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #797 = Class              #799         // ext/mods/gameserver/taskmanager/AttackStanceTaskManager
   #798 = NameAndType        #113:#800    // getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #799 = Utf8               ext/mods/gameserver/taskmanager/AttackStanceTaskManager
   #800 = Utf8               ()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #801 = Methodref          #797.#802    // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
   #802 = NameAndType        #803:#804    // isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
   #803 = Utf8               isInAttackStance
   #804 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #805 = Methodref          #295.#806    // ext/mods/gameserver/model/actor/move/CreatureMove.getTask:()Ljava/util/concurrent/ScheduledFuture;
   #806 = NameAndType        #807:#808    // getTask:()Ljava/util/concurrent/ScheduledFuture;
   #807 = Utf8               getTask
   #808 = Utf8               ()Ljava/util/concurrent/ScheduledFuture;
   #809 = Methodref          #540.#300    // ext/mods/gameserver/model/actor/attack/CreatureAttack.stop:()V
   #810 = Methodref          #547.#300    // ext/mods/gameserver/model/actor/cast/CreatureCast.stop:()V
   #811 = Methodref          #13.#812     // ext/mods/gameserver/model/actor/Creature.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
   #812 = NameAndType        #813:#404    // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
   #813 = Utf8               setTarget
   #814 = Methodref          #601.#815    // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
   #815 = NameAndType        #816:#189    // getNpcId:()I
   #816 = Utf8               getNpcId
   #817 = Fieldref           #818.#819    // ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
   #818 = Class              #820         // ext/mods/gameserver/enums/actors/MoveType
   #819 = NameAndType        #821:#822    // SWIM:Lext/mods/gameserver/enums/actors/MoveType;
   #820 = Utf8               ext/mods/gameserver/enums/actors/MoveType
   #821 = Utf8               SWIM
   #822 = Utf8               Lext/mods/gameserver/enums/actors/MoveType;
   #823 = Methodref          #295.#824    // ext/mods/gameserver/model/actor/move/CreatureMove.removeMoveType:(Lext/mods/gameserver/enums/actors/MoveType;)V
   #824 = NameAndType        #825:#826    // removeMoveType:(Lext/mods/gameserver/enums/actors/MoveType;)V
   #825 = Utf8               removeMoveType
   #826 = Utf8               (Lext/mods/gameserver/enums/actors/MoveType;)V
   #827 = Methodref          #295.#828    // ext/mods/gameserver/model/actor/move/CreatureMove.getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
   #828 = NameAndType        #829:#830    // getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
   #829 = Utf8               getMoveType
   #830 = Utf8               ()Lext/mods/gameserver/enums/actors/MoveType;
   #831 = Methodref          #13.#832     // ext/mods/gameserver/model/actor/Creature.getRegion:()Lext/mods/gameserver/model/WorldRegion;
   #832 = NameAndType        #176:#833    // getRegion:()Lext/mods/gameserver/model/WorldRegion;
   #833 = Utf8               ()Lext/mods/gameserver/model/WorldRegion;
   #834 = Methodref          #835.#836    // ext/mods/gameserver/model/WorldRegion.revalidateZones:(Lext/mods/gameserver/model/actor/Creature;)V
   #835 = Class              #837         // ext/mods/gameserver/model/WorldRegion
   #836 = NameAndType        #838:#40     // revalidateZones:(Lext/mods/gameserver/model/actor/Creature;)V
   #837 = Utf8               ext/mods/gameserver/model/WorldRegion
   #838 = Utf8               revalidateZones
   #839 = Fieldref           #13.#840     // ext/mods/gameserver/model/actor/Creature._showSummonAnimation:Z
   #840 = NameAndType        #841:#21     // _showSummonAnimation:Z
   #841 = Utf8               _showSummonAnimation
   #842 = Methodref          #2.#106      // ext/mods/gameserver/model/WorldObject.isVisible:()Z
   #843 = Fieldref           #13.#844     // ext/mods/gameserver/model/actor/Creature._target:Lext/mods/gameserver/model/WorldObject;
   #844 = NameAndType        #845:#846    // _target:Lext/mods/gameserver/model/WorldObject;
   #845 = Utf8               _target
   #846 = Utf8               Lext/mods/gameserver/model/WorldObject;
   #847 = Methodref          #2.#848      // ext/mods/gameserver/model/WorldObject.getObjectId:()I
   #848 = NameAndType        #849:#189    // getObjectId:()I
   #849 = Utf8               getObjectId
   #850 = Methodref          #13.#851     // ext/mods/gameserver/model/actor/Creature.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
   #851 = NameAndType        #852:#853    // getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
   #852 = Utf8               getActiveWeaponItem
   #853 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
   #854 = Fieldref           #855.#856    // ext/mods/gameserver/enums/items/WeaponType.NONE:Lext/mods/gameserver/enums/items/WeaponType;
   #855 = Class              #857         // ext/mods/gameserver/enums/items/WeaponType
   #856 = NameAndType        #858:#859    // NONE:Lext/mods/gameserver/enums/items/WeaponType;
   #857 = Utf8               ext/mods/gameserver/enums/items/WeaponType
   #858 = Utf8               NONE
   #859 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
   #860 = Methodref          #861.#862    // ext/mods/gameserver/model/item/kind/Weapon.getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
   #861 = Class              #863         // ext/mods/gameserver/model/item/kind/Weapon
   #862 = NameAndType        #864:#865    // getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
   #863 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
   #864 = Utf8               getItemType
   #865 = Utf8               ()Lext/mods/gameserver/enums/items/WeaponType;
   #866 = Methodref          #99.#867     // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #867 = NameAndType        #868:#869    // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #868 = Utf8               getTarget
   #869 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #870 = Methodref          #99.#812     // ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
   #871 = Methodref          #13.#872     // ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #872 = NameAndType        #873:#874    // isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #873 = Utf8               isAttackableWithoutForceBy
   #874 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #875 = Methodref          #13.#876     // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #876 = NameAndType        #877:#804    // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #877 = Utf8               isAttackableBy
   #878 = Methodref          #99.#879     // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #879 = NameAndType        #270:#880    // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #880 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #881 = Methodref          #882.#883    // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
   #882 = Class              #884         // ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #883 = NameAndType        #885:#886    // tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
   #884 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #885 = Utf8               tryToAttack
   #886 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ZZ)V
   #887 = Methodref          #882.#888    // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
   #888 = NameAndType        #889:#890    // tryToInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
   #889 = Utf8               tryToInteract
   #890 = Utf8               (Lext/mods/gameserver/model/WorldObject;ZZ)V
   #891 = Methodref          #835.#892    // ext/mods/gameserver/model/WorldRegion.isActive:()Z
   #892 = NameAndType        #893:#93     // isActive:()Z
   #893 = Utf8               isActive
   #894 = Fieldref           #13.#895     // ext/mods/gameserver/model/actor/Creature._chanceSkills:Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
   #895 = NameAndType        #896:#897    // _chanceSkills:Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
   #896 = Utf8               _chanceSkills
   #897 = Utf8               Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
   #898 = Methodref          #899.#900    // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.keySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #899 = Class              #901         // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList
   #900 = NameAndType        #902:#903    // keySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #901 = Utf8               ext/mods/gameserver/model/actor/container/creature/ChanceSkillList
   #902 = Utf8               keySet
   #903 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #904 = Methodref          #905.#621    // java/util/concurrent/ConcurrentHashMap$KeySetView.iterator:()Ljava/util/Iterator;
   #905 = Class              #906         // java/util/concurrent/ConcurrentHashMap$KeySetView
   #906 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
   #907 = Class              #908         // ext/mods/gameserver/skills/IChanceSkillTrigger
   #908 = Utf8               ext/mods/gameserver/skills/IChanceSkillTrigger
   #909 = Class              #910         // ext/mods/gameserver/skills/L2Skill
   #910 = Utf8               ext/mods/gameserver/skills/L2Skill
   #911 = Methodref          #909.#187    // ext/mods/gameserver/skills/L2Skill.getId:()I
   #912 = Methodref          #899.#913    // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #913 = NameAndType        #914:#915    // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #914 = Utf8               remove
   #915 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #916 = Methodref          #899.#39     // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #917 = InterfaceMethodref #907.#918    // ext/mods/gameserver/skills/IChanceSkillTrigger.getTriggeredChanceCondition:()Lext/mods/gameserver/skills/ChanceCondition;
   #918 = NameAndType        #919:#920    // getTriggeredChanceCondition:()Lext/mods/gameserver/skills/ChanceCondition;
   #919 = Utf8               getTriggeredChanceCondition
   #920 = Utf8               ()Lext/mods/gameserver/skills/ChanceCondition;
   #921 = Methodref          #899.#922    // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #922 = NameAndType        #923:#924    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #923 = Utf8               put
   #924 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #925 = Methodref          #926.#927    // java/util/Collections.emptyMap:()Ljava/util/Map;
   #926 = Class              #928         // java/util/Collections
   #927 = NameAndType        #929:#930    // emptyMap:()Ljava/util/Map;
   #928 = Utf8               java/util/Collections
   #929 = Utf8               emptyMap
   #930 = Utf8               ()Ljava/util/Map;
   #931 = Methodref          #13.#932     // ext/mods/gameserver/model/actor/Creature.getSkills:()Ljava/util/Map;
   #932 = NameAndType        #933:#930    // getSkills:()Ljava/util/Map;
   #933 = Utf8               getSkills
   #934 = Methodref          #935.#936    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #935 = Class              #937         // java/lang/Integer
   #936 = NameAndType        #938:#939    // valueOf:(I)Ljava/lang/Integer;
   #937 = Utf8               java/lang/Integer
   #938 = Utf8               valueOf
   #939 = Utf8               (I)Ljava/lang/Integer;
   #940 = InterfaceMethodref #941.#942    // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #941 = Class              #943         // java/util/Map
   #942 = NameAndType        #217:#915    // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #943 = Utf8               java/util/Map
   #944 = Methodref          #909.#945    // ext/mods/gameserver/skills/L2Skill.getLevel:()I
   #945 = NameAndType        #946:#189    // getLevel:()I
   #946 = Utf8               getLevel
   #947 = InterfaceMethodref #941.#948    // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #948 = NameAndType        #949:#950    // containsKey:(Ljava/lang/Object;)Z
   #949 = Utf8               containsKey
   #950 = Utf8               (Ljava/lang/Object;)Z
   #951 = Methodref          #36.#952     // ext/mods/gameserver/model/actor/container/creature/EffectList.getBuffCount:()I
   #952 = NameAndType        #953:#189    // getBuffCount:()I
   #953 = Utf8               getBuffCount
   #954 = Methodref          #36.#955     // ext/mods/gameserver/model/actor/container/creature/EffectList.getDanceCount:()I
   #955 = NameAndType        #956:#189    // getDanceCount:()I
   #956 = Utf8               getDanceCount
   #957 = Methodref          #909.#958    // ext/mods/gameserver/skills/L2Skill.getReuseHashCode:()I
   #958 = NameAndType        #959:#189    // getReuseHashCode:()I
   #959 = Utf8               getReuseHashCode
   #960 = InterfaceMethodref #941.#913    // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #961 = Long               10l
   #963 = Methodref          #964.#965    // java/lang/System.currentTimeMillis:()J
   #964 = Class              #966         // java/lang/System
   #965 = NameAndType        #967:#968    // currentTimeMillis:()J
   #966 = Utf8               java/lang/System
   #967 = Utf8               currentTimeMillis
   #968 = Utf8               ()J
   #969 = Class              #970         // java/lang/Long
   #970 = Utf8               java/lang/Long
   #971 = Long               9223372036854775807l
   #973 = Methodref          #969.#974    // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #974 = NameAndType        #938:#975    // valueOf:(J)Ljava/lang/Long;
   #975 = Utf8               (J)Ljava/lang/Long;
   #976 = InterfaceMethodref #941.#922    // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #977 = InterfaceMethodref #941.#699    // java/util/Map.isEmpty:()Z
   #978 = Methodref          #13.#979     // ext/mods/gameserver/model/actor/Creature.isAllSkillsDisabled:()Z
   #979 = NameAndType        #980:#93     // isAllSkillsDisabled:()Z
   #980 = Utf8               isAllSkillsDisabled
   #981 = Methodref          #969.#982    // java/lang/Long.longValue:()J
   #982 = NameAndType        #983:#968    // longValue:()J
   #983 = Utf8               longValue
   #984 = Fieldref           #13.#985     // ext/mods/gameserver/model/actor/Creature._allSkillsDisabled:Z
   #985 = NameAndType        #986:#21     // _allSkillsDisabled:Z
   #986 = Utf8               _allSkillsDisabled
   #987 = Methodref          #13.#988     // ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #988 = NameAndType        #989:#990    // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #989 = Utf8               reduceCurrentHp
   #990 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #991 = Methodref          #909.#992    // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
   #992 = NameAndType        #993:#93     // isToggle:()Z
   #993 = Utf8               isToggle
   #994 = Methodref          #13.#995     // ext/mods/gameserver/model/actor/Creature.isChampion:()Z
   #995 = NameAndType        #996:#93     // isChampion:()Z
   #996 = Utf8               isChampion
   #997 = Fieldref           #364.#998    // ext/mods/Config.CHAMPION_HP:I
   #998 = NameAndType        #999:#61     // CHAMPION_HP:I
   #999 = Utf8               CHAMPION_HP
  #1000 = Methodref          #343.#1001   // ext/mods/gameserver/model/actor/status/CreatureStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
  #1001 = NameAndType        #1002:#1003  // reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
  #1002 = Utf8               reduceHp
  #1003 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZZ)V
  #1004 = Methodref          #406.#1005   // ext/mods/extensions/listener/manager/CreatureListenerManager.notifyHpDamage:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #1005 = NameAndType        #1006:#1007  // notifyHpDamage:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #1006 = Utf8               notifyHpDamage
  #1007 = Utf8               (Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #1008 = Methodref          #36.#423     // ext/mods/gameserver/model/actor/container/creature/EffectList.isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
  #1009 = Fieldref           #364.#1010   // ext/mods/Config.MAX_BUFFS_AMOUNT:I
  #1010 = NameAndType        #1011:#61    // MAX_BUFFS_AMOUNT:I
  #1011 = Utf8               MAX_BUFFS_AMOUNT
  #1012 = Methodref          #13.#1013    // ext/mods/gameserver/model/actor/Creature.getSkillLevel:(I)I
  #1013 = NameAndType        #1014:#1015  // getSkillLevel:(I)I
  #1014 = Utf8               getSkillLevel
  #1015 = Utf8               (I)I
  #1016 = Methodref          #861.#1017   // ext/mods/gameserver/model/item/kind/Weapon.getRandomDamage:()I
  #1017 = NameAndType        #1018:#189   // getRandomDamage:()I
  #1018 = Utf8               getRandomDamage
  #1019 = Methodref          #343.#945    // ext/mods/gameserver/model/actor/status/CreatureStatus.getLevel:()I
  #1020 = Methodref          #1021.#1022  // java/lang/Math.sqrt:(D)D
  #1021 = Class              #1023        // java/lang/Math
  #1022 = NameAndType        #1024:#1025  // sqrt:(D)D
  #1023 = Utf8               java/lang/Math
  #1024 = Utf8               sqrt
  #1025 = Utf8               (D)D
  #1026 = Double             100.0d
  #1028 = Methodref          #13.#1029    // ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
  #1029 = NameAndType        #605:#1030   // getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
  #1030 = Utf8               ()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
  #1031 = Methodref          #1032.#1033  // ext/mods/gameserver/model/actor/template/CreatureTemplate.getCollisionRadius:()D
  #1032 = Class              #1034        // ext/mods/gameserver/model/actor/template/CreatureTemplate
  #1033 = NameAndType        #1035:#1036  // getCollisionRadius:()D
  #1034 = Utf8               ext/mods/gameserver/model/actor/template/CreatureTemplate
  #1035 = Utf8               getCollisionRadius
  #1036 = Utf8               ()D
  #1037 = Methodref          #1032.#1038  // ext/mods/gameserver/model/actor/template/CreatureTemplate.getCollisionHeight:()D
  #1038 = NameAndType        #1039:#1036  // getCollisionHeight:()D
  #1039 = Utf8               getCollisionHeight
  #1040 = Methodref          #13.#1041    // ext/mods/gameserver/model/actor/Creature.forceRunStance:()V
  #1041 = NameAndType        #1042:#11    // forceRunStance:()V
  #1042 = Utf8               forceRunStance
  #1043 = Methodref          #263.#1044   // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #1044 = NameAndType        #1045:#173   // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #1045 = Utf8               clone
  #1046 = Methodref          #229.#1047   // ext/mods/gameserver/model/location/Location.setFleeing:(Lext/mods/gameserver/model/location/Point2D;I)V
  #1047 = NameAndType        #1048:#1049  // setFleeing:(Lext/mods/gameserver/model/location/Point2D;I)V
  #1048 = Utf8               setFleeing
  #1049 = Utf8               (Lext/mods/gameserver/model/location/Point2D;I)V
  #1050 = Methodref          #295.#1051   // ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #1051 = NameAndType        #1052:#1053  // maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #1052 = Utf8               maybeMoveToLocation
  #1053 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
  #1054 = Methodref          #229.#1055   // ext/mods/gameserver/model/location/Location.addRandomOffset:(I)V
  #1055 = NameAndType        #1056:#6     // addRandomOffset:(I)V
  #1056 = Utf8               addRandomOffset
  #1057 = Methodref          #835.#1058   // ext/mods/gameserver/model/WorldRegion.removeFromZones:(Lext/mods/gameserver/model/actor/Creature;)V
  #1058 = NameAndType        #1059:#40    // removeFromZones:(Lext/mods/gameserver/model/actor/Creature;)V
  #1059 = Utf8               removeFromZones
  #1060 = Methodref          #2.#179      // ext/mods/gameserver/model/WorldObject.setRegion:(Lext/mods/gameserver/model/WorldRegion;)V
  #1061 = Methodref          #13.#1062    // ext/mods/gameserver/model/actor/Creature.revalidateZone:(Z)V
  #1062 = NameAndType        #1063:#312   // revalidateZone:(Z)V
  #1063 = Utf8               revalidateZone
  #1064 = Methodref          #13.#867     // ext/mods/gameserver/model/actor/Creature.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #1065 = Fieldref           #13.#1066    // ext/mods/gameserver/model/actor/Creature._premiumService:I
  #1066 = NameAndType        #1067:#61    // _premiumService:I
  #1067 = Utf8               _premiumService
  #1068 = InvokeDynamic      #4:#1069     // #4:test:()Ljava/util/function/Predicate;
  #1069 = NameAndType        #1070:#1071  // test:()Ljava/util/function/Predicate;
  #1070 = Utf8               test
  #1071 = Utf8               ()Ljava/util/function/Predicate;
  #1072 = Methodref          #13.#1073    // ext/mods/gameserver/model/actor/Creature.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #1073 = NameAndType        #203:#1074   // forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #1074 = Utf8               (Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #1075 = Fieldref           #13.#1076    // ext/mods/gameserver/model/actor/Creature._polymorphTemplate:Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #1076 = NameAndType        #1077:#1078  // _polymorphTemplate:Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #1077 = Utf8               _polymorphTemplate
  #1078 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #1079 = Methodref          #1080.#1081  // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #1080 = Class              #1082        // ext/mods/gameserver/data/xml/NpcData
  #1081 = NameAndType        #113:#1083   // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #1082 = Utf8               ext/mods/gameserver/data/xml/NpcData
  #1083 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
  #1084 = Methodref          #1080.#1085  // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #1085 = NameAndType        #605:#1086   // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #1086 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #1087 = Methodref          #13.#1088    // ext/mods/gameserver/model/actor/Creature.spawnMe:()V
  #1088 = NameAndType        #1089:#11    // spawnMe:()V
  #1089 = Utf8               spawnMe
  #1090 = Methodref          #13.#1091    // ext/mods/gameserver/model/actor/Creature.isInvul:()Z
  #1091 = NameAndType        #1092:#93    // isInvul:()Z
  #1092 = Utf8               isInvul
  #1093 = Methodref          #1094.#1095  // ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
  #1094 = Class              #1096        // ext/mods/gameserver/taskmanager/DecayTaskManager
  #1095 = NameAndType        #113:#1097   // getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
  #1096 = Utf8               ext/mods/gameserver/taskmanager/DecayTaskManager
  #1097 = Utf8               ()Lext/mods/gameserver/taskmanager/DecayTaskManager;
  #1098 = Methodref          #1094.#1099  // ext/mods/gameserver/taskmanager/DecayTaskManager.cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
  #1099 = NameAndType        #1100:#804   // cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
  #1100 = Utf8               cancel
  #1101 = Methodref          #13.#1102    // ext/mods/gameserver/model/actor/Creature.onDecay:()V
  #1102 = NameAndType        #1103:#11    // onDecay:()V
  #1103 = Utf8               onDecay
  #1104 = Class              #1105        // ext/mods/gameserver/model/actor/Playable
  #1105 = Utf8               ext/mods/gameserver/model/actor/Playable
  #1106 = Methodref          #13.#95      // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #1107 = Methodref          #99.#1108    // ext/mods/gameserver/model/actor/Player.isSpawnProtected:()Z
  #1108 = NameAndType        #1109:#93    // isSpawnProtected:()Z
  #1109 = Utf8               isSpawnProtected
  #1110 = Methodref          #99.#237     // ext/mods/gameserver/model/actor/Player.isFlying:()Z
  #1111 = InvokeDynamic      #5:#1112     // #5:test:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Predicate;
  #1112 = NameAndType        #1070:#1113  // test:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Predicate;
  #1113 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Predicate;
  #1114 = InvokeDynamic      #6:#1115     // #6:accept:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #1115 = NameAndType        #199:#1116   // accept:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #1116 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #1117 = Methodref          #99.#1118    // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #1118 = NameAndType        #1119:#1120  // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #1119 = Utf8               getMissions
  #1120 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #1121 = Class              #1122        // ext/mods/gameserver/model/actor/instance/GrandBoss
  #1122 = Utf8               ext/mods/gameserver/model/actor/instance/GrandBoss
  #1123 = Fieldref           #1124.#1125  // ext/mods/gameserver/enums/actors/MissionType.GRANDBOSS:Lext/mods/gameserver/enums/actors/MissionType;
  #1124 = Class              #1126        // ext/mods/gameserver/enums/actors/MissionType
  #1125 = NameAndType        #1127:#1128  // GRANDBOSS:Lext/mods/gameserver/enums/actors/MissionType;
  #1126 = Utf8               ext/mods/gameserver/enums/actors/MissionType
  #1127 = Utf8               GRANDBOSS
  #1128 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
  #1129 = Methodref          #1130.#1131  // ext/mods/gameserver/model/actor/container/player/MissionList.updateParty:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #1130 = Class              #1132        // ext/mods/gameserver/model/actor/container/player/MissionList
  #1131 = NameAndType        #1133:#1134  // updateParty:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #1132 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
  #1133 = Utf8               updateParty
  #1134 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)V
  #1135 = Methodref          #1121.#815   // ext/mods/gameserver/model/actor/instance/GrandBoss.getNpcId:()I
  #1136 = Fieldref           #1124.#1137  // ext/mods/gameserver/enums/actors/MissionType.ANTHARAS:Lext/mods/gameserver/enums/actors/MissionType;
  #1137 = NameAndType        #1138:#1128  // ANTHARAS:Lext/mods/gameserver/enums/actors/MissionType;
  #1138 = Utf8               ANTHARAS
  #1139 = Fieldref           #1124.#1140  // ext/mods/gameserver/enums/actors/MissionType.QUEEN_ANT:Lext/mods/gameserver/enums/actors/MissionType;
  #1140 = NameAndType        #1141:#1128  // QUEEN_ANT:Lext/mods/gameserver/enums/actors/MissionType;
  #1141 = Utf8               QUEEN_ANT
  #1142 = Fieldref           #1124.#1143  // ext/mods/gameserver/enums/actors/MissionType.CORE:Lext/mods/gameserver/enums/actors/MissionType;
  #1143 = NameAndType        #1144:#1128  // CORE:Lext/mods/gameserver/enums/actors/MissionType;
  #1144 = Utf8               CORE
  #1145 = Fieldref           #1124.#1146  // ext/mods/gameserver/enums/actors/MissionType.ORFEN:Lext/mods/gameserver/enums/actors/MissionType;
  #1146 = NameAndType        #1147:#1128  // ORFEN:Lext/mods/gameserver/enums/actors/MissionType;
  #1147 = Utf8               ORFEN
  #1148 = Fieldref           #1124.#1149  // ext/mods/gameserver/enums/actors/MissionType.ZAKEN:Lext/mods/gameserver/enums/actors/MissionType;
  #1149 = NameAndType        #1150:#1128  // ZAKEN:Lext/mods/gameserver/enums/actors/MissionType;
  #1150 = Utf8               ZAKEN
  #1151 = Fieldref           #1124.#1152  // ext/mods/gameserver/enums/actors/MissionType.BAIUM:Lext/mods/gameserver/enums/actors/MissionType;
  #1152 = NameAndType        #1153:#1128  // BAIUM:Lext/mods/gameserver/enums/actors/MissionType;
  #1153 = Utf8               BAIUM
  #1154 = Fieldref           #1124.#1155  // ext/mods/gameserver/enums/actors/MissionType.VALAKAS:Lext/mods/gameserver/enums/actors/MissionType;
  #1155 = NameAndType        #1156:#1128  // VALAKAS:Lext/mods/gameserver/enums/actors/MissionType;
  #1156 = Utf8               VALAKAS
  #1157 = Fieldref           #1124.#1158  // ext/mods/gameserver/enums/actors/MissionType.HALISHA:Lext/mods/gameserver/enums/actors/MissionType;
  #1158 = NameAndType        #1159:#1128  // HALISHA:Lext/mods/gameserver/enums/actors/MissionType;
  #1159 = Utf8               HALISHA
  #1160 = Methodref          #99.#1161    // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #1161 = NameAndType        #340:#1162   // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #1162 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #1163 = Methodref          #1164.#945   // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #1164 = Class              #1165        // ext/mods/gameserver/model/actor/status/PlayerStatus
  #1165 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #1166 = Class              #1167        // ext/mods/gameserver/model/actor/instance/RaidBoss
  #1167 = Utf8               ext/mods/gameserver/model/actor/instance/RaidBoss
  #1168 = Fieldref           #1124.#1169  // ext/mods/gameserver/enums/actors/MissionType.RAIDBOSS:Lext/mods/gameserver/enums/actors/MissionType;
  #1169 = NameAndType        #1170:#1128  // RAIDBOSS:Lext/mods/gameserver/enums/actors/MissionType;
  #1170 = Utf8               RAIDBOSS
  #1171 = Class              #1172        // ext/mods/gameserver/model/actor/instance/SiegeGuard
  #1172 = Utf8               ext/mods/gameserver/model/actor/instance/SiegeGuard
  #1173 = Fieldref           #1124.#1174  // ext/mods/gameserver/enums/actors/MissionType.GUARD:Lext/mods/gameserver/enums/actors/MissionType;
  #1174 = NameAndType        #1175:#1128  // GUARD:Lext/mods/gameserver/enums/actors/MissionType;
  #1175 = Utf8               GUARD
  #1176 = Methodref          #1130.#1177  // ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #1177 = NameAndType        #1178:#1134  // update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #1178 = Utf8               update
  #1179 = Class              #1180        // ext/mods/gameserver/model/actor/instance/Monster
  #1180 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #1181 = Methodref          #1179.#815   // ext/mods/gameserver/model/actor/instance/Monster.getNpcId:()I
  #1182 = Fieldref           #1124.#1183  // ext/mods/gameserver/enums/actors/MissionType.TYRANNOSAURUS:Lext/mods/gameserver/enums/actors/MissionType;
  #1183 = NameAndType        #1184:#1128  // TYRANNOSAURUS:Lext/mods/gameserver/enums/actors/MissionType;
  #1184 = Utf8               TYRANNOSAURUS
  #1185 = Fieldref           #1124.#1186  // ext/mods/gameserver/enums/actors/MissionType.MONSTER:Lext/mods/gameserver/enums/actors/MissionType;
  #1186 = NameAndType        #1187:#1128  // MONSTER:Lext/mods/gameserver/enums/actors/MissionType;
  #1187 = Utf8               MONSTER
  #1188 = Fieldref           #13.#1189    // ext/mods/gameserver/model/actor/Creature._townZone:Z
  #1189 = NameAndType        #1190:#21    // _townZone:Z
  #1190 = Utf8               _townZone
  #1191 = Fieldref           #608.#1192   // ext/mods/gameserver/enums/EventHandler.SEE_CREATURE:Lext/mods/gameserver/enums/EventHandler;
  #1192 = NameAndType        #1193:#612   // SEE_CREATURE:Lext/mods/gameserver/enums/EventHandler;
  #1193 = Utf8               SEE_CREATURE
  #1194 = Methodref          #634.#1195   // ext/mods/gameserver/scripting/Quest.onSeeCreature:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1195 = NameAndType        #1196:#1197  // onSeeCreature:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1196 = Utf8               onSeeCreature
  #1197 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1198 = Methodref          #601.#1199   // ext/mods/gameserver/model/actor/Npc.getSeeRange:()I
  #1199 = NameAndType        #1200:#189   // getSeeRange:()I
  #1200 = Utf8               getSeeRange
  #1201 = Methodref          #13.#1202    // ext/mods/gameserver/model/actor/Creature.isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #1202 = NameAndType        #1203:#1204  // isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #1203 = Utf8               isInStrictRadius
  #1204 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #1205 = Methodref          #601.#303    // ext/mods/gameserver/model/actor/Npc.getZ:()I
  #1206 = Methodref          #13.#303     // ext/mods/gameserver/model/actor/Creature.getZ:()I
  #1207 = Methodref          #1021.#1208  // java/lang/Math.abs:(I)I
  #1208 = NameAndType        #1209:#1015  // abs:(I)I
  #1209 = Utf8               abs
  #1210 = Class              #1211        // ext/mods/gameserver/network/serverpackets/ServerObjectInfo
  #1211 = Utf8               ext/mods/gameserver/network/serverpackets/ServerObjectInfo
  #1212 = Methodref          #1210.#1213  // ext/mods/gameserver/network/serverpackets/ServerObjectInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1213 = NameAndType        #5:#1197     // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1214 = Methodref          #99.#1215    // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #1215 = NameAndType        #1216:#261   // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #1216 = Utf8               sendPacket
  #1217 = Class              #1218        // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
  #1218 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
  #1219 = Methodref          #1217.#1220  // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #1220 = NameAndType        #5:#1221     // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #1221 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #1222 = Methodref          #13.#1223    // ext/mods/gameserver/model/actor/Creature.isVisibleTo:(Lext/mods/gameserver/model/WorldObject;)Z
  #1223 = NameAndType        #1224:#89    // isVisibleTo:(Lext/mods/gameserver/model/WorldObject;)Z
  #1224 = Utf8               isVisibleTo
  #1225 = Utf8               Signature
  #1226 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI<+Lext/mods/gameserver/model/actor/Creature;>;
  #1227 = Utf8               Lext/mods/gameserver/model/actor/status/CreatureStatus<+Lext/mods/gameserver/model/actor/Creature;>;
  #1228 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove<+Lext/mods/gameserver/model/actor/Creature;>;
  #1229 = Utf8               Lext/mods/gameserver/model/actor/attack/CreatureAttack<+Lext/mods/gameserver/model/actor/Creature;>;
  #1230 = Utf8               Lext/mods/gameserver/model/actor/cast/CreatureCast<+Lext/mods/gameserver/model/actor/Creature;>;
  #1231 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #1232 = Utf8               (ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
  #1233 = Utf8               Code
  #1234 = Utf8               LineNumberTable
  #1235 = Utf8               LocalVariableTable
  #1236 = Utf8               this
  #1237 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #1238 = Utf8               objectId
  #1239 = Utf8               template
  #1240 = Utf8               getActiveWeaponInstance
  #1241 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1242 = Utf8               getSecondaryWeaponInstance
  #1243 = Utf8               getSecondaryWeaponItem
  #1244 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #1245 = Utf8               player
  #1246 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #1247 = Utf8               target
  #1248 = Utf8               StackMapTable
  #1249 = Utf8               getInventory
  #1250 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #1251 = Utf8               destroyItemByItemId
  #1252 = Utf8               (IIZ)Z
  #1253 = Utf8               itemId
  #1254 = Utf8               count
  #1255 = Utf8               sendMessage
  #1256 = Utf8               destroyItem
  #1257 = Utf8               isInsideZone
  #1258 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #1259 = Utf8               zone
  #1260 = Utf8               setInsideZone
  #1261 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #1262 = Utf8               state
  #1263 = Utf8               packet
  #1264 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #1265 = Utf8               selfToo
  #1266 = Utf8               broadcastPacketInRadius
  #1267 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #1268 = Utf8               radius
  #1269 = Utf8               (Ljava/lang/String;)V
  #1270 = Utf8               text
  #1271 = Utf8               nx
  #1272 = Utf8               ny
  #1273 = Utf8               loc
  #1274 = Utf8               Lext/mods/gameserver/model/location/Location;
  #1275 = Utf8               x
  #1276 = Utf8               y
  #1277 = Utf8               z
  #1278 = Utf8               randomOffset
  #1279 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #1280 = Utf8               (Lext/mods/gameserver/enums/RestartType;)V
  #1281 = Utf8               type
  #1282 = Utf8               Lext/mods/gameserver/enums/RestartType;
  #1283 = Utf8               addTimeStamp
  #1284 = Utf8               (Lext/mods/gameserver/skills/L2Skill;J)V
  #1285 = Utf8               skill
  #1286 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #1287 = Utf8               reuse
  #1288 = Utf8               J
  #1289 = Utf8               startFusionSkill
  #1290 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #1291 = Utf8               doDie
  #1292 = Utf8               killer
  #1293 = Class              #1294        // java/lang/Object
  #1294 = Utf8               java/lang/Object
  #1295 = Class              #1296        // java/lang/Throwable
  #1296 = Utf8               java/lang/Throwable
  #1297 = Utf8               deleteMe
  #1298 = Utf8               creature
  #1299 = Utf8               revivePower
  #1300 = Utf8               isRaidBoss
  #1301 = Utf8               isRaidRelated
  #1302 = Utf8               isBetrayed
  #1303 = Utf8               isAttackingDisabled
  #1304 = Utf8               denyAiAction
  #1305 = Utf8               isMovementDisabled
  #1306 = Utf8               isOutOfControl
  #1307 = Utf8               getCalculators
  #1308 = Utf8               ()[Lext/mods/gameserver/skills/Calculator;
  #1309 = Utf8               setIsImmobilized
  #1310 = Utf8               value
  #1311 = Utf8               isFakeDeath
  #1312 = Utf8               attacker
  #1313 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #1314 = Utf8               setIsParalyzed
  #1315 = Utf8               getSummon
  #1316 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #1317 = Utf8               isOperating
  #1318 = Utf8               isSeated
  #1319 = Utf8               isStanding
  #1320 = Utf8               isRiding
  #1321 = Utf8               forceWalkStance
  #1322 = Utf8               setRunning
  #1323 = Utf8               setInvul
  #1324 = Utf8               isMortal
  #1325 = Utf8               setMortal
  #1326 = Utf8               isLethalable
  #1327 = Utf8               isUndead
  #1328 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI<+Lext/mods/gameserver/model/actor/Creature;>;
  #1329 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus<+Lext/mods/gameserver/model/actor/Creature;>;
  #1330 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove<+Lext/mods/gameserver/model/actor/Creature;>;
  #1331 = Utf8               getAttack
  #1332 = Utf8               ()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #1333 = Utf8               ()Lext/mods/gameserver/model/actor/attack/CreatureAttack<+Lext/mods/gameserver/model/actor/Creature;>;
  #1334 = Utf8               getCast
  #1335 = Utf8               ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #1336 = Utf8               ()Lext/mods/gameserver/model/actor/cast/CreatureCast<+Lext/mods/gameserver/model/actor/Creature;>;
  #1337 = Utf8               setTemplate
  #1338 = Utf8               (Lext/mods/gameserver/model/actor/template/CreatureTemplate;)V
  #1339 = Utf8               getTitle
  #1340 = Utf8               ()Ljava/lang/String;
  #1341 = Utf8               setTitle
  #1342 = Utf8               getAbnormalEffect
  #1343 = Utf8               ae
  #1344 = Utf8               startAbnormalEffect
  #1345 = Utf8               (Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
  #1346 = Utf8               mask
  #1347 = Utf8               stopAbnormalEffect
  #1348 = Utf8               addEffect
  #1349 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)V
  #1350 = Utf8               quest
  #1351 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #1352 = Utf8               npc
  #1353 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #1354 = Utf8               effect
  #1355 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #1356 = Utf8               removeEffect
  #1357 = Utf8               stopAllEffectsDebuff
  #1358 = Utf8               skillId
  #1359 = Utf8               skillType
  #1360 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #1361 = Utf8               negateLvl
  #1362 = Utf8               (Lext/mods/gameserver/enums/skills/SkillType;)V
  #1363 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
  #1364 = Utf8               partyOnly
  #1365 = Utf8               function
  #1366 = Utf8               Lext/mods/gameserver/skills/basefuncs/Func;
  #1367 = Utf8               stat
  #1368 = Utf8               addStatFuncs
  #1369 = Utf8               f
  #1370 = Utf8               funcs
  #1371 = Utf8               Ljava/util/List;
  #1372 = Utf8               LocalVariableTypeTable
  #1373 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/basefuncs/Func;>;
  #1374 = Utf8               (Ljava/util/List<Lext/mods/gameserver/skills/basefuncs/Func;>;)V
  #1375 = Utf8               removeStatsByOwner
  #1376 = Utf8               (Ljava/lang/Object;)V
  #1377 = Utf8               calc
  #1378 = Utf8               Lext/mods/gameserver/skills/Calculator;
  #1379 = Utf8               owner
  #1380 = Utf8               Ljava/lang/Object;
  #1381 = Utf8               modifiedStats
  #1382 = Utf8               i
  #1383 = Utf8               Ljava/util/List<Lext/mods/gameserver/enums/skills/Stats;>;
  #1384 = Class              #67          // "[Lext/mods/gameserver/skills/Calculator;"
  #1385 = Utf8               summon
  #1386 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #1387 = Utf8               stats
  #1388 = Utf8               broadcastFull
  #1389 = Utf8               su
  #1390 = Utf8               Lext/mods/gameserver/network/serverpackets/StatusUpdate;
  #1391 = Utf8               (Ljava/util/List<Lext/mods/gameserver/enums/skills/Stats;>;)V
  #1392 = Utf8               isInCombat
  #1393 = Utf8               isMoving
  #1394 = Utf8               resetTarget
  #1395 = Utf8               isInWater
  #1396 = Utf8               force
  #1397 = Utf8               isShowSummonAnimation
  #1398 = Utf8               setShowSummonAnimation
  #1399 = Utf8               showSummonAnimation
  #1400 = Utf8               object
  #1401 = Utf8               getTargetId
  #1402 = Utf8               checkAndEquipArrows
  #1403 = Utf8               addExpAndSp
  #1404 = Utf8               (JI)V
  #1405 = Utf8               addToExp
  #1406 = Utf8               addToSp
  #1407 = Utf8               getAttackType
  #1408 = Utf8               weapon
  #1409 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #1410 = Utf8               reduceArrowCount
  #1411 = Utf8               onAction
  #1412 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #1413 = Utf8               isCtrlPressed
  #1414 = Utf8               isShiftPressed
  #1415 = Utf8               isInActiveRegion
  #1416 = Utf8               region
  #1417 = Utf8               Lext/mods/gameserver/model/WorldRegion;
  #1418 = Utf8               isInParty
  #1419 = Utf8               getParty
  #1420 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #1421 = Utf8               getChanceSkills
  #1422 = Utf8               ()Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
  #1423 = Utf8               removeChanceSkill
  #1424 = Utf8               trigger
  #1425 = Utf8               Lext/mods/gameserver/skills/IChanceSkillTrigger;
  #1426 = Utf8               id
  #1427 = Utf8               addChanceTrigger
  #1428 = Utf8               (Lext/mods/gameserver/skills/IChanceSkillTrigger;)V
  #1429 = Utf8               removeChanceEffect
  #1430 = Utf8               (Lext/mods/gameserver/skills/effects/EffectChanceSkillTrigger;)V
  #1431 = Utf8               Lext/mods/gameserver/skills/effects/EffectChanceSkillTrigger;
  #1432 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/skills/L2Skill;>;
  #1433 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #1434 = Utf8               hasSkill
  #1435 = Utf8               (I)Z
  #1436 = Utf8               getDisabledSkills
  #1437 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #1438 = Utf8               enableSkill
  #1439 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)V
  #1440 = Utf8               disableSkill
  #1441 = Utf8               delay
  #1442 = Utf8               isSkillDisabled
  #1443 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #1444 = Utf8               hashCode
  #1445 = Utf8               timeStamp
  #1446 = Utf8               Ljava/lang/Long;
  #1447 = Utf8               disableAllSkills
  #1448 = Utf8               enableAllSkills
  #1449 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #1450 = Utf8               reduceCurrentHpByDOT
  #1451 = Utf8               awake
  #1452 = Utf8               isDOT
  #1453 = Utf8               sendDamageMessage
  #1454 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #1455 = Utf8               damage
  #1456 = Utf8               mcrit
  #1457 = Utf8               pcrit
  #1458 = Utf8               miss
  #1459 = Utf8               getFusionSkill
  #1460 = Utf8               ()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
  #1461 = Utf8               setFusionSkill
  #1462 = Utf8               (Lext/mods/gameserver/model/actor/container/creature/FusionSkill;)V
  #1463 = Utf8               fb
  #1464 = Utf8               flag
  #1465 = Utf8               getMaxBuffCount
  #1466 = Utf8               getRandomDamageMultiplier
  #1467 = Utf8               random
  #1468 = Utf8               activeWeapon
  #1469 = Utf8               isInArena
  #1470 = Utf8               fleeFrom
  #1471 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
  #1472 = Utf8               distance
  #1473 = Utf8               moveUsingRandomOffset
  #1474 = Utf8               offset
  #1475 = Utf8               newRegion
  #1476 = Utf8               removeKnownObject
  #1477 = Utf8               setPremiumService
  #1478 = Utf8               premiumService
  #1479 = Utf8               getPremiumService
  #1480 = Utf8               forEachKnownGM
  #1481 = Utf8               (Ljava/util/function/Consumer;)V
  #1482 = Utf8               action
  #1483 = Utf8               Ljava/util/function/Consumer;
  #1484 = Utf8               Ljava/util/function/Consumer<Lext/mods/gameserver/model/actor/Player;>;
  #1485 = Utf8               (Ljava/util/function/Consumer<Lext/mods/gameserver/model/actor/Player;>;)V
  #1486 = Utf8               testCursesOnAttack
  #1487 = Utf8               (Lext/mods/gameserver/model/actor/Npc;I)Z
  #1488 = Utf8               npcId
  #1489 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)Z
  #1490 = Utf8               testCursesOnAggro
  #1491 = Utf8               testCursesOnSkillSee
  #1492 = Utf8               (Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)Z
  #1493 = Utf8               targets
  #1494 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
  #1495 = Utf8               checkCondition
  #1496 = Utf8               (DD)V
  #1497 = Utf8               curHp
  #1498 = Utf8               newHp
  #1499 = Utf8               getPolymorphTemplate
  #1500 = Utf8               polymorph
  #1501 = Utf8               unpolymorph
  #1502 = Utf8               canBeHealed
  #1503 = Utf8               forceDecay
  #1504 = Utf8               isSilentMoving
  #1505 = Utf8               sendIU
  #1506 = Utf8               isInBoat
  #1507 = Utf8               setIsFlying
  #1508 = Utf8               mode
  #1509 = Utf8               grandboss
  #1510 = Utf8               Lext/mods/gameserver/model/actor/instance/GrandBoss;
  #1511 = Utf8               monster
  #1512 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #1513 = Utf8               missions
  #1514 = Utf8               Lext/mods/gameserver/model/actor/container/player/MissionList;
  #1515 = Utf8               getTownZone
  #1516 = Utf8               setTownZone
  #1517 = Utf8               val
  #1518 = Utf8               lambda$forceSeeCreature$1
  #1519 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #1520 = Utf8               i$
  #1521 = Utf8               Ljava/util/Iterator;
  #1522 = Utf8               lambda$forceSeeCreature$0
  #1523 = Utf8               lambda$broadcastModifiedStats$0
  #1524 = Utf8               lambda$broadcastPacketInRadius$0
  #1525 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
  #1526 = Utf8               lambda$broadcastPacket$0
  #1527 = Utf8               SourceFile
  #1528 = Utf8               Creature.java
  #1529 = Utf8               BootstrapMethods
  #1530 = MethodType         #1376        //  (Ljava/lang/Object;)V
  #1531 = MethodHandle       5:#1532      // REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.lambda$broadcastPacket$0:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
  #1532 = Methodref          #13.#1533    // ext/mods/gameserver/model/actor/Creature.lambda$broadcastPacket$0:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
  #1533 = NameAndType        #1526:#1525  // lambda$broadcastPacket$0:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
  #1534 = MethodType         #1535        //  (Lext/mods/gameserver/model/actor/Player;)V
  #1535 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #1536 = MethodHandle       5:#1537      // REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.lambda$broadcastPacketInRadius$0:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
  #1537 = Methodref          #13.#1538    // ext/mods/gameserver/model/actor/Creature.lambda$broadcastPacketInRadius$0:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
  #1538 = NameAndType        #1524:#1525  // lambda$broadcastPacketInRadius$0:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
  #1539 = MethodType         #915         //  (Ljava/lang/Object;)Ljava/lang/Object;
  #1540 = MethodHandle       5:#685       // REF_invokeVirtual ext/mods/gameserver/skills/basefuncs/Func.getStat:()Lext/mods/gameserver/enums/skills/Stats;
  #1541 = MethodType         #1542        //  (Lext/mods/gameserver/skills/basefuncs/Func;)Lext/mods/gameserver/enums/skills/Stats;
  #1542 = Utf8               (Lext/mods/gameserver/skills/basefuncs/Func;)Lext/mods/gameserver/enums/skills/Stats;
  #1543 = MethodHandle       5:#1544      // REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.lambda$broadcastModifiedStats$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #1544 = Methodref          #13.#1545    // ext/mods/gameserver/model/actor/Creature.lambda$broadcastModifiedStats$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #1545 = NameAndType        #1523:#1221  // lambda$broadcastModifiedStats$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #1546 = MethodType         #950         //  (Ljava/lang/Object;)Z
  #1547 = MethodHandle       5:#1548      // REF_invokeVirtual ext/mods/gameserver/model/actor/Player.isGM:()Z
  #1548 = Methodref          #99.#91      // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #1549 = MethodType         #1550        //  (Lext/mods/gameserver/model/actor/Player;)Z
  #1550 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #1551 = MethodHandle       5:#1552      // REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.lambda$forceSeeCreature$0:(Lext/mods/gameserver/model/actor/Npc;)Z
  #1552 = Methodref          #13.#1553    // ext/mods/gameserver/model/actor/Creature.lambda$forceSeeCreature$0:(Lext/mods/gameserver/model/actor/Npc;)Z
  #1553 = NameAndType        #1522:#1489  // lambda$forceSeeCreature$0:(Lext/mods/gameserver/model/actor/Npc;)Z
  #1554 = MethodType         #1489        //  (Lext/mods/gameserver/model/actor/Npc;)Z
  #1555 = MethodHandle       5:#1556      // REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.lambda$forceSeeCreature$1:(Lext/mods/gameserver/model/actor/Npc;)V
  #1556 = Methodref          #13.#1557    // ext/mods/gameserver/model/actor/Creature.lambda$forceSeeCreature$1:(Lext/mods/gameserver/model/actor/Npc;)V
  #1557 = NameAndType        #1518:#1519  // lambda$forceSeeCreature$1:(Lext/mods/gameserver/model/actor/Npc;)V
  #1558 = MethodType         #1519        //  (Lext/mods/gameserver/model/actor/Npc;)V
  #1559 = MethodHandle       6:#1560      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1560 = Methodref          #1561.#1562  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1561 = Class              #1563        // java/lang/invoke/LambdaMetafactory
  #1562 = NameAndType        #1564:#1565  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1563 = Utf8               java/lang/invoke/LambdaMetafactory
  #1564 = Utf8               metafactory
  #1565 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1566 = Utf8               InnerClasses
  #1567 = Utf8               KeySetView
  #1568 = Class              #1569        // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #1569 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #1570 = Utf8               NpcInfo
  #1571 = Class              #1572        // java/lang/invoke/MethodHandles$Lookup
  #1572 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1573 = Class              #1574        // java/lang/invoke/MethodHandles
  #1574 = Utf8               java/lang/invoke/MethodHandles
  #1575 = Utf8               Lookup
{
  protected java.lang.String _title;
    descriptor: Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.actor.ai.type.CreatureAI<? extends ext.mods.gameserver.model.actor.Creature> _ai;
    descriptor: Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    flags: (0x0004) ACC_PROTECTED
    Signature: #1226                        // Lext/mods/gameserver/model/actor/ai/type/CreatureAI<+Lext/mods/gameserver/model/actor/Creature;>;

  protected ext.mods.gameserver.model.actor.status.CreatureStatus<? extends ext.mods.gameserver.model.actor.Creature> _status;
    descriptor: Lext/mods/gameserver/model/actor/status/CreatureStatus;
    flags: (0x0004) ACC_PROTECTED
    Signature: #1227                        // Lext/mods/gameserver/model/actor/status/CreatureStatus<+Lext/mods/gameserver/model/actor/Creature;>;

  protected ext.mods.gameserver.model.actor.move.CreatureMove<? extends ext.mods.gameserver.model.actor.Creature> _move;
    descriptor: Lext/mods/gameserver/model/actor/move/CreatureMove;
    flags: (0x0004) ACC_PROTECTED
    Signature: #1228                        // Lext/mods/gameserver/model/actor/move/CreatureMove<+Lext/mods/gameserver/model/actor/Creature;>;

  protected ext.mods.gameserver.model.actor.attack.CreatureAttack<? extends ext.mods.gameserver.model.actor.Creature> _attack;
    descriptor: Lext/mods/gameserver/model/actor/attack/CreatureAttack;
    flags: (0x0004) ACC_PROTECTED
    Signature: #1229                        // Lext/mods/gameserver/model/actor/attack/CreatureAttack<+Lext/mods/gameserver/model/actor/Creature;>;

  protected ext.mods.gameserver.model.actor.cast.CreatureCast<? extends ext.mods.gameserver.model.actor.Creature> _cast;
    descriptor: Lext/mods/gameserver/model/actor/cast/CreatureCast;
    flags: (0x0004) ACC_PROTECTED
    Signature: #1230                        // Lext/mods/gameserver/model/actor/cast/CreatureCast<+Lext/mods/gameserver/model/actor/Creature;>;

  protected java.util.concurrent.atomic.AtomicBoolean _isTeleporting;
    descriptor: Ljava/util/concurrent/atomic/AtomicBoolean;
    flags: (0x0004) ACC_PROTECTED

  protected byte _zoneValidateCounter;
    descriptor: B
    flags: (0x0004) ACC_PROTECTED

  protected final ext.mods.gameserver.model.actor.container.creature.EffectList _effects;
    descriptor: Lext/mods/gameserver/model/actor/container/creature/EffectList;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  public ext.mods.gameserver.model.actor.Creature(int, ext.mods.gameserver.model.actor.template.CreatureTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/WorldObject."<init>":(I)V
         5: aload_0
         6: new           #7                  // class java/util/concurrent/atomic/AtomicBoolean
         9: dup
        10: invokespecial #9                  // Method java/util/concurrent/atomic/AtomicBoolean."<init>":()V
        13: putfield      #12                 // Field _isTeleporting:Ljava/util/concurrent/atomic/AtomicBoolean;
        16: aload_0
        17: iconst_1
        18: putfield      #18                 // Field _isMortal:Z
        21: aload_0
        22: getstatic     #22                 // Field ext/mods/gameserver/enums/ZoneId.VALUES:[Lext/mods/gameserver/enums/ZoneId;
        25: arraylength
        26: newarray       byte
        28: putfield      #28                 // Field _zones:[B
        31: aload_0
        32: iconst_4
        33: putfield      #32                 // Field _zoneValidateCounter:B
        36: aload_0
        37: new           #36                 // class ext/mods/gameserver/model/actor/container/creature/EffectList
        40: dup
        41: aload_0
        42: invokespecial #38                 // Method ext/mods/gameserver/model/actor/container/creature/EffectList."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
        45: putfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
        48: aload_0
        49: new           #45                 // class java/util/concurrent/ConcurrentHashMap
        52: dup
        53: invokespecial #47                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        56: putfield      #48                 // Field _disabledSkills:Ljava/util/Map;
        59: aload_0
        60: aload_2
        61: putfield      #52                 // Field _template:Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        64: aload_0
        65: getstatic     #56                 // Field ext/mods/gameserver/enums/skills/Stats.NUM_STATS:I
        68: anewarray     #62                 // class ext/mods/gameserver/skills/Calculator
        71: putfield      #64                 // Field _calculators:[Lext/mods/gameserver/skills/Calculator;
        74: aload_0
        75: invokevirtual #68                 // Method addFuncsToNewCharacter:()V
        78: aload_0
        79: invokevirtual #71                 // Method setAI:()V
        82: aload_0
        83: invokevirtual #74                 // Method setStatus:()V
        86: aload_0
        87: invokevirtual #77                 // Method setMove:()V
        90: aload_0
        91: invokevirtual #80                 // Method setAttack:()V
        94: aload_0
        95: invokevirtual #83                 // Method setCast:()V
        98: return
      LineNumberTable:
        line 152: 0
        line 125: 5
        line 128: 16
        line 135: 21
        line 136: 31
        line 138: 36
        line 141: 48
        line 154: 59
        line 155: 64
        line 157: 74
        line 159: 78
        line 160: 82
        line 161: 86
        line 162: 90
        line 163: 94
        line 164: 98
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      99     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      99     1 objectId   I
            0      99     2 template   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public abstract void updateAbnormalEffect();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.model.item.instance.ItemInstance getActiveWeaponInstance();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.model.item.kind.Weapon getActiveWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Weapon;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.model.item.instance.ItemInstance getSecondaryWeaponInstance();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.model.item.kind.Item getSecondaryWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Item;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public boolean knows(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #86                 // Method ext/mods/gameserver/model/WorldObject.knows:(Lext/mods/gameserver/model/WorldObject;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: invokevirtual #90                 // Method isGM:()Z
        14: ifne          38
        17: aload_1
        18: invokevirtual #94                 // Method ext/mods/gameserver/model/WorldObject.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        21: astore_2
        22: aload_2
        23: ifnull        38
        26: aload_2
        27: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        30: invokevirtual #104                // Method ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
        33: ifne          38
        36: iconst_0
        37: ireturn
        38: iconst_1
        39: ireturn
      LineNumberTable:
        line 175: 0
        line 176: 8
        line 178: 10
        line 180: 17
        line 181: 22
        line 182: 36
        line 184: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22      16     2 player   Lext/mods/gameserver/model/actor/Player;
            0      40     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      40     1 target   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 2
        frame_type = 10 /* same */
        frame_type = 27 /* same */

  public void addFuncsToNewCharacter();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokestatic  #109                // Method ext/mods/gameserver/skills/funcs/FuncPAtkMod.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
         4: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
         7: aload_0
         8: invokestatic  #119                // Method ext/mods/gameserver/skills/funcs/FuncMAtkMod.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
        11: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        14: aload_0
        15: invokestatic  #122                // Method ext/mods/gameserver/skills/funcs/FuncPDefMod.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
        18: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        21: aload_0
        22: invokestatic  #125                // Method ext/mods/gameserver/skills/funcs/FuncMDefMod.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
        25: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        28: aload_0
        29: invokestatic  #128                // Method ext/mods/gameserver/skills/funcs/FuncMaxHpMul.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
        32: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        35: aload_0
        36: invokestatic  #131                // Method ext/mods/gameserver/skills/funcs/FuncMaxMpMul.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
        39: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        42: aload_0
        43: invokestatic  #134                // Method ext/mods/gameserver/skills/funcs/FuncRegenHpMul.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
        46: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        49: aload_0
        50: invokestatic  #137                // Method ext/mods/gameserver/skills/funcs/FuncRegenMpMul.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
        53: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        56: aload_0
        57: invokestatic  #140                // Method ext/mods/gameserver/skills/funcs/FuncAtkAccuracy.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
        60: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        63: aload_0
        64: invokestatic  #143                // Method ext/mods/gameserver/skills/funcs/FuncAtkEvasion.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
        67: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        70: aload_0
        71: invokestatic  #146                // Method ext/mods/gameserver/skills/funcs/FuncPAtkSpeed.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
        74: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        77: aload_0
        78: invokestatic  #149                // Method ext/mods/gameserver/skills/funcs/FuncMAtkSpeed.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
        81: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        84: aload_0
        85: invokestatic  #152                // Method ext/mods/gameserver/skills/funcs/FuncMoveSpeed.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
        88: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        91: aload_0
        92: invokestatic  #155                // Method ext/mods/gameserver/skills/funcs/FuncAtkCritical.getInstance:()Lext/mods/gameserver/skills/basefuncs/Func;
        95: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        98: return
      LineNumberTable:
        line 189: 0
        line 190: 7
        line 191: 14
        line 192: 21
        line 194: 28
        line 195: 35
        line 196: 42
        line 197: 49
        line 199: 56
        line 200: 63
        line 202: 70
        line 203: 77
        line 205: 84
        line 206: 91
        line 207: 98
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      99     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void onDecay();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #158                // Method decayMe:()V
         4: return
      LineNumberTable:
        line 211: 0
        line 212: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void onTeleported();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _isTeleporting:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: iconst_1
         5: iconst_0
         6: invokevirtual #161                // Method java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
         9: ifne          13
        12: return
        13: aload_0
        14: invokestatic  #165                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        17: aload_0
        18: invokevirtual #170                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        21: invokevirtual #174                // Method ext/mods/gameserver/model/World.getRegion:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/WorldRegion;
        24: invokevirtual #178                // Method setRegion:(Lext/mods/gameserver/model/WorldRegion;)V
        27: return
      LineNumberTable:
        line 216: 0
        line 217: 12
        line 219: 13
        line 220: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 13 /* same */

  public ext.mods.gameserver.model.itemcontainer.Inventory getInventory();
    descriptor: ()Lext/mods/gameserver/model/itemcontainer/Inventory;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 224: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean destroyItemByItemId(int, int, boolean);
    descriptor: (IIZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 229: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       2     1 itemId   I
            0       2     2 count   I
            0       2     3 sendMessage   Z

  public boolean destroyItem(int, int, boolean);
    descriptor: (IIZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 234: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       2     1 objectId   I
            0       2     2 count   I
            0       2     3 sendMessage   Z

  public boolean isInsideZone(ext.mods.gameserver.enums.ZoneId);
    descriptor: (Lext/mods/gameserver/enums/ZoneId;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: getstatic     #182                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
         4: if_acmpne     43
         7: aload_0
         8: getfield      #28                 // Field _zones:[B
        11: getstatic     #182                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
        14: invokevirtual #186                // Method ext/mods/gameserver/enums/ZoneId.getId:()I
        17: baload
        18: ifle          39
        21: aload_0
        22: getfield      #28                 // Field _zones:[B
        25: getstatic     #190                // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        28: invokevirtual #186                // Method ext/mods/gameserver/enums/ZoneId.getId:()I
        31: baload
        32: ifne          39
        35: iconst_1
        36: goto          60
        39: iconst_0
        40: goto          60
        43: aload_0
        44: getfield      #28                 // Field _zones:[B
        47: aload_1
        48: invokevirtual #186                // Method ext/mods/gameserver/enums/ZoneId.getId:()I
        51: baload
        52: ifle          59
        55: iconst_1
        56: goto          60
        59: iconst_0
        60: ireturn
      LineNumberTable:
        line 240: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      61     1  zone   Lext/mods/gameserver/enums/ZoneId;
      StackMapTable: number_of_entries = 4
        frame_type = 39 /* same */
        frame_type = 3 /* same */
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setInsideZone(ext.mods.gameserver.enums.ZoneId, boolean);
    descriptor: (Lext/mods/gameserver/enums/ZoneId;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: iload_2
         1: ifeq          21
         4: aload_0
         5: getfield      #28                 // Field _zones:[B
         8: aload_1
         9: invokevirtual #186                // Method ext/mods/gameserver/enums/ZoneId.getId:()I
        12: dup2
        13: baload
        14: iconst_1
        15: iadd
        16: i2b
        17: bastore
        18: goto          57
        21: aload_0
        22: getfield      #28                 // Field _zones:[B
        25: aload_1
        26: invokevirtual #186                // Method ext/mods/gameserver/enums/ZoneId.getId:()I
        29: dup2
        30: baload
        31: iconst_1
        32: isub
        33: i2b
        34: bastore
        35: aload_0
        36: getfield      #28                 // Field _zones:[B
        39: aload_1
        40: invokevirtual #186                // Method ext/mods/gameserver/enums/ZoneId.getId:()I
        43: baload
        44: ifge          57
        47: aload_0
        48: getfield      #28                 // Field _zones:[B
        51: aload_1
        52: invokevirtual #186                // Method ext/mods/gameserver/enums/ZoneId.getId:()I
        55: iconst_0
        56: bastore
        57: return
      LineNumberTable:
        line 245: 0
        line 246: 4
        line 249: 21
        line 250: 35
        line 251: 47
        line 253: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      58     1  zone   Lext/mods/gameserver/enums/ZoneId;
            0      58     2 state   Z
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 35 /* same */

  public boolean isGM();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 257: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void broadcastPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_1
         3: invokevirtual #193                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Z)V
         6: return
      LineNumberTable:
        line 267: 0
        line 268: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       7     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;

  public void broadcastPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket, boolean);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: ldc           #99                 // class ext/mods/gameserver/model/actor/Player
         3: aload_0
         4: aload_1
         5: invokedynamic #197,  0            // InvokeDynamic #0:accept:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)Ljava/util/function/Consumer;
        10: invokevirtual #201                // Method forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 272: 0
        line 277: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      14     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
            0      14     2 selfToo   Z

  public void broadcastPacketInRadius(ext.mods.gameserver.network.serverpackets.L2GameServerPacket, int);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: iload_2
         1: ifge          8
         4: sipush        600
         7: istore_2
         8: aload_0
         9: ldc           #99                 // class ext/mods/gameserver/model/actor/Player
        11: iload_2
        12: aload_0
        13: aload_1
        14: invokedynamic #205,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)Ljava/util/function/Consumer;
        19: invokevirtual #206                // Method forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
        22: return
      LineNumberTable:
        line 281: 0
        line 282: 4
        line 284: 8
        line 289: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      23     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
            0      23     2 radius   I
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void sendPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 291: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       1     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;

  public void sendMessage(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 292: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       1     1  text   Ljava/lang/String;

  public void instantTeleportTo(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=8, args_size=5
         0: aload_0
         1: invokevirtual #210                // Method isDead:()Z
         4: ifeq          8
         7: return
         8: iload         4
        10: ifle          66
        13: iload_1
        14: iload         4
        16: ineg
        17: iload         4
        19: invokestatic  #213                // Method ext/mods/commons/random/Rnd.get:(II)I
        22: iadd
        23: istore        5
        25: iload_2
        26: iload         4
        28: ineg
        29: iload         4
        31: invokestatic  #213                // Method ext/mods/commons/random/Rnd.get:(II)I
        34: iadd
        35: istore        6
        37: invokestatic  #219                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        40: iload_1
        41: iload_2
        42: iload_3
        43: iload         5
        45: iload         6
        47: iload_3
        48: aconst_null
        49: invokevirtual #224                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
        52: astore        7
        54: aload         7
        56: invokevirtual #228                // Method ext/mods/gameserver/model/location/Location.getX:()I
        59: istore_1
        60: aload         7
        62: invokevirtual #233                // Method ext/mods/gameserver/model/location/Location.getY:()I
        65: istore_2
        66: aload_0
        67: invokevirtual #236                // Method isFlying:()Z
        70: ifne          97
        73: invokestatic  #239                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
        76: iload_1
        77: iload_2
        78: iload_3
        79: ldc           #244                // class ext/mods/gameserver/model/zone/type/WaterZone
        81: invokevirtual #246                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
        84: ifnonnull     97
        87: invokestatic  #219                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        90: iload_1
        91: iload_2
        92: iload_3
        93: invokevirtual #250                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
        96: istore_3
        97: aload_0
        98: new           #254                // class ext/mods/gameserver/network/serverpackets/TeleportToLocation
       101: dup
       102: aload_0
       103: iload_1
       104: iload_2
       105: iload_3
       106: iconst_1
       107: invokespecial #256                // Method ext/mods/gameserver/network/serverpackets/TeleportToLocation."<init>":(Lext/mods/gameserver/model/WorldObject;IIIZ)V
       110: invokevirtual #259                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       113: aload_0
       114: invokevirtual #170                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       117: iload_1
       118: iload_2
       119: iload_3
       120: invokevirtual #262                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(III)V
       123: aload_0
       124: invokevirtual #268                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
       127: getstatic     #272                // Field ext/mods/gameserver/enums/AiEventType.TELEPORTED:Lext/mods/gameserver/enums/AiEventType;
       130: aconst_null
       131: aconst_null
       132: invokevirtual #278                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
       135: aload_0
       136: invokevirtual #284                // Method refreshKnownlist:()V
       139: aload_0
       140: invokevirtual #287                // Method forceSeeCreature:()V
       143: aload_0
       144: invokevirtual #290                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       147: invokevirtual #294                // Method ext/mods/gameserver/model/actor/move/CreatureMove.resetGeoPathFailCount:()V
       150: aload_0
       151: invokevirtual #290                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       154: invokevirtual #299                // Method ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
       157: return
      LineNumberTable:
        line 296: 0
        line 297: 7
        line 299: 8
        line 301: 13
        line 302: 25
        line 303: 37
        line 304: 54
        line 305: 60
        line 308: 66
        line 309: 87
        line 311: 97
        line 312: 113
        line 314: 123
        line 315: 135
        line 316: 139
        line 318: 143
        line 319: 150
        line 320: 157
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      41     5    nx   I
           37      29     6    ny   I
           54      12     7   loc   Lext/mods/gameserver/model/location/Location;
            0     158     0  this   Lext/mods/gameserver/model/actor/Creature;
            0     158     1     x   I
            0     158     2     y   I
            0     158     3     z   I
            0     158     4 randomOffset   I
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 57 /* same */
        frame_type = 30 /* same */

  public void instantTeleportTo(ext.mods.gameserver.model.location.Location, int);
    descriptor: (Lext/mods/gameserver/model/location/Location;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #228                // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #233                // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: aload_1
        10: invokevirtual #302                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        13: iload_2
        14: invokevirtual #305                // Method instantTeleportTo:(IIII)V
        17: return
      LineNumberTable:
        line 324: 0
        line 325: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      18     1   loc   Lext/mods/gameserver/model/location/Location;
            0      18     2 randomOffset   I

  public boolean teleportTo(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=8, args_size=5
         0: aload_0
         1: invokevirtual #210                // Method isDead:()Z
         4: ifeq          9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: getfield      #12                 // Field _isTeleporting:Ljava/util/concurrent/atomic/AtomicBoolean;
        13: iconst_0
        14: iconst_1
        15: invokevirtual #161                // Method java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
        18: ifne          23
        21: iconst_0
        22: ireturn
        23: aload_0
        24: iconst_1
        25: invokevirtual #309                // Method abortAll:(Z)V
        28: iload         4
        30: ifle          86
        33: iload_1
        34: iload         4
        36: ineg
        37: iload         4
        39: invokestatic  #213                // Method ext/mods/commons/random/Rnd.get:(II)I
        42: iadd
        43: istore        5
        45: iload_2
        46: iload         4
        48: ineg
        49: iload         4
        51: invokestatic  #213                // Method ext/mods/commons/random/Rnd.get:(II)I
        54: iadd
        55: istore        6
        57: invokestatic  #219                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        60: iload_1
        61: iload_2
        62: iload_3
        63: iload         5
        65: iload         6
        67: iload_3
        68: aconst_null
        69: invokevirtual #224                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
        72: astore        7
        74: aload         7
        76: invokevirtual #228                // Method ext/mods/gameserver/model/location/Location.getX:()I
        79: istore_1
        80: aload         7
        82: invokevirtual #233                // Method ext/mods/gameserver/model/location/Location.getY:()I
        85: istore_2
        86: aload_0
        87: invokevirtual #236                // Method isFlying:()Z
        90: ifne          117
        93: invokestatic  #239                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
        96: iload_1
        97: iload_2
        98: iload_3
        99: ldc           #244                // class ext/mods/gameserver/model/zone/type/WaterZone
       101: invokevirtual #246                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
       104: ifnonnull     117
       107: invokestatic  #219                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       110: iload_1
       111: iload_2
       112: iload_3
       113: invokevirtual #250                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       116: istore_3
       117: aload_0
       118: new           #254                // class ext/mods/gameserver/network/serverpackets/TeleportToLocation
       121: dup
       122: aload_0
       123: iload_1
       124: iload_2
       125: iload_3
       126: iconst_0
       127: invokespecial #256                // Method ext/mods/gameserver/network/serverpackets/TeleportToLocation."<init>":(Lext/mods/gameserver/model/WorldObject;IIIZ)V
       130: invokevirtual #259                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       133: aload_0
       134: aconst_null
       135: invokevirtual #178                // Method setRegion:(Lext/mods/gameserver/model/WorldRegion;)V
       138: aload_0
       139: invokevirtual #170                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       142: iload_1
       143: iload_2
       144: iload_3
       145: invokevirtual #262                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(III)V
       148: aload_0
       149: astore        6
       151: aload         6
       153: instanceof    #99                 // class ext/mods/gameserver/model/actor/Player
       156: ifeq          185
       159: aload         6
       161: checkcast     #99                 // class ext/mods/gameserver/model/actor/Player
       164: astore        5
       166: aload         5
       168: invokevirtual #313                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       171: ifnull        189
       174: aload         5
       176: invokevirtual #313                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       179: invokevirtual #317                // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
       182: ifeq          189
       185: aload_0
       186: invokevirtual #322                // Method onTeleported:()V
       189: aload_0
       190: invokevirtual #268                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
       193: getstatic     #272                // Field ext/mods/gameserver/enums/AiEventType.TELEPORTED:Lext/mods/gameserver/enums/AiEventType;
       196: aconst_null
       197: aconst_null
       198: invokevirtual #278                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
       201: aload_0
       202: invokevirtual #287                // Method forceSeeCreature:()V
       205: aload_0
       206: invokevirtual #290                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       209: invokevirtual #294                // Method ext/mods/gameserver/model/actor/move/CreatureMove.resetGeoPathFailCount:()V
       212: aload_0
       213: invokevirtual #290                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       216: invokevirtual #299                // Method ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
       219: iconst_1
       220: ireturn
      LineNumberTable:
        line 329: 0
        line 330: 7
        line 332: 9
        line 333: 21
        line 335: 23
        line 337: 28
        line 339: 33
        line 340: 45
        line 341: 57
        line 342: 74
        line 343: 80
        line 346: 86
        line 347: 107
        line 349: 117
        line 350: 133
        line 351: 138
        line 353: 148
        line 354: 185
        line 356: 189
        line 357: 201
        line 359: 205
        line 360: 212
        line 362: 219
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           45      41     5    nx   I
           57      29     6    ny   I
           74      12     7   loc   Lext/mods/gameserver/model/location/Location;
          166      19     5 player   Lext/mods/gameserver/model/actor/Player;
            0     221     0  this   Lext/mods/gameserver/model/actor/Creature;
            0     221     1     x   I
            0     221     2     y   I
            0     221     3     z   I
            0     221     4 randomOffset   I
      StackMapTable: number_of_entries = 6
        frame_type = 9 /* same */
        frame_type = 13 /* same */
        frame_type = 62 /* same */
        frame_type = 30 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67
        frame_type = 3 /* same */

  public void teleportTo(ext.mods.gameserver.model.location.Location, int);
    descriptor: (Lext/mods/gameserver/model/location/Location;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #228                // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #233                // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: aload_1
        10: invokevirtual #302                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        13: iload_2
        14: invokevirtual #325                // Method teleportTo:(IIII)Z
        17: pop
        18: return
      LineNumberTable:
        line 367: 0
        line 368: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      19     1   loc   Lext/mods/gameserver/model/location/Location;
            0      19     2 randomOffset   I

  public void teleportTo(ext.mods.gameserver.enums.RestartType);
    descriptor: (Lext/mods/gameserver/enums/RestartType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 370: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       1     1  type   Lext/mods/gameserver/enums/RestartType;

  public void addTimeStamp(ext.mods.gameserver.skills.L2Skill, long);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=4, args_size=3
         0: return
      LineNumberTable:
        line 372: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       1     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0       1     2 reuse   J

  public void startFusionSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: getfield      #329                // Field _fusionSkill:Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
         4: ifnonnull     21
         7: aload_0
         8: new           #333                // class ext/mods/gameserver/model/actor/container/creature/FusionSkill
        11: dup
        12: aload_0
        13: aload_1
        14: aload_2
        15: invokespecial #335                // Method ext/mods/gameserver/model/actor/container/creature/FusionSkill."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
        18: putfield      #329                // Field _fusionSkill:Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
        21: return
      LineNumberTable:
        line 376: 0
        line 377: 7
        line 378: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      22     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      22     2 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 1
        frame_type = 21 /* same */

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: dup
         2: astore_2
         3: monitorenter
         4: aload_0
         5: invokevirtual #210                // Method isDead:()Z
         8: ifeq          15
        11: iconst_0
        12: aload_2
        13: monitorexit
        14: ireturn
        15: aload_0
        16: invokevirtual #338                // Method getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        19: dconst_0
        20: invokevirtual #342                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.setHp:(D)V
        23: aload_0
        24: iconst_1
        25: invokevirtual #348                // Method setIsDead:(Z)V
        28: aload_2
        29: monitorexit
        30: goto          38
        33: astore_3
        34: aload_2
        35: monitorexit
        36: aload_3
        37: athrow
        38: aload_0
        39: iconst_1
        40: invokevirtual #309                // Method abortAll:(Z)V
        43: aload_0
        44: invokevirtual #338                // Method getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        47: invokevirtual #351                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.stopHpMpRegeneration:()V
        50: aload_0
        51: invokevirtual #354                // Method stopAllEffectsExceptThoseThatLastThroughDeath:()V
        54: aload_0
        55: aload_1
        56: invokevirtual #357                // Method calculateRewards:(Lext/mods/gameserver/model/actor/Creature;)V
        59: aload_0
        60: aload_1
        61: invokevirtual #360                // Method calculateMission:(Lext/mods/gameserver/model/actor/Creature;)V
        64: getstatic     #363                // Field ext/mods/Config.BOTS_PREVENTION:Z
        67: ifeq          78
        70: invokestatic  #368                // Method ext/mods/gameserver/data/manager/BotsPreventionManager.getInstance:()Lext/mods/gameserver/data/manager/BotsPreventionManager;
        73: aload_1
        74: aload_0
        75: invokevirtual #373                // Method ext/mods/gameserver/data/manager/BotsPreventionManager.updateCounter:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
        78: aload_0
        79: invokevirtual #338                // Method getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        82: invokevirtual #377                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.broadcastStatusUpdate:()V
        85: aload_0
        86: invokevirtual #268                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        89: getstatic     #380                // Field ext/mods/gameserver/enums/AiEventType.DEAD:Lext/mods/gameserver/enums/AiEventType;
        92: aconst_null
        93: aconst_null
        94: invokevirtual #278                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        97: iconst_1
        98: ireturn
      Exception table:
         from    to  target type
             4    14    33   any
            15    30    33   any
            33    36    33   any
      LineNumberTable:
        line 382: 0
        line 384: 4
        line 385: 11
        line 387: 15
        line 388: 23
        line 389: 28
        line 391: 38
        line 392: 43
        line 393: 50
        line 395: 54
        line 396: 59
        line 398: 64
        line 399: 70
        line 401: 78
        line 402: 85
        line 404: 97
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      99     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      99     1 killer   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/lang/Object ]
        frame_type = 81 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 39 /* same */

  public void deleteMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #338                // Method getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
         4: invokevirtual #351                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.stopHpMpRegeneration:()V
         7: aload_0
         8: invokevirtual #268                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        11: invokevirtual #383                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.stopAITask:()V
        14: return
      LineNumberTable:
        line 409: 0
        line 410: 7
        line 411: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/Creature;

  protected void calculateRewards(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 413: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       1     1 creature   Lext/mods/gameserver/model/actor/Creature;

  public void doRevive();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #210                // Method isDead:()Z
         4: ifeq          14
         7: aload_0
         8: invokevirtual #386                // Method isTeleporting:()Z
        11: ifeq          15
        14: return
        15: aload_0
        16: iconst_0
        17: invokevirtual #348                // Method setIsDead:(Z)V
        20: aload_0
        21: getfield      #389                // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
        24: aload_0
        25: getfield      #389                // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
        28: invokevirtual #393                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
        31: i2d
        32: getstatic     #396                // Field ext/mods/Config.RESPAWN_RESTORE_HP:D
        35: dmul
        36: invokevirtual #342                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.setHp:(D)V
        39: aload_0
        40: new           #400                // class ext/mods/gameserver/network/serverpackets/Revive
        43: dup
        44: aload_0
        45: invokespecial #402                // Method ext/mods/gameserver/network/serverpackets/Revive."<init>":(Lext/mods/gameserver/model/WorldObject;)V
        48: invokevirtual #259                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        51: invokestatic  #405                // Method ext/mods/extensions/listener/manager/CreatureListenerManager.getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
        54: aload_0
        55: invokevirtual #410                // Method ext/mods/extensions/listener/manager/CreatureListenerManager.notifyRevive:(Lext/mods/gameserver/model/actor/Creature;)V
        58: return
      LineNumberTable:
        line 417: 0
        line 418: 14
        line 420: 15
        line 421: 20
        line 422: 39
        line 423: 51
        line 424: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      59     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 0 /* same */

  public void doRevive(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=2
         0: aload_0
         1: invokevirtual #413                // Method doRevive:()V
         4: return
      LineNumberTable:
        line 428: 0
        line 429: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       5     1 revivePower   D

  public boolean isRaidBoss();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 431: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isRaidRelated();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 432: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final boolean isAfraid();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getstatic     #416                // Field ext/mods/gameserver/enums/skills/EffectFlag.FEAR:Lext/mods/gameserver/enums/skills/EffectFlag;
         4: invokevirtual #422                // Method isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
         7: ireturn
      LineNumberTable:
        line 434: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final boolean isConfused();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getstatic     #426                // Field ext/mods/gameserver/enums/skills/EffectFlag.CONFUSED:Lext/mods/gameserver/enums/skills/EffectFlag;
         4: invokevirtual #422                // Method isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
         7: ireturn
      LineNumberTable:
        line 435: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final boolean isMuted();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getstatic     #429                // Field ext/mods/gameserver/enums/skills/EffectFlag.MUTED:Lext/mods/gameserver/enums/skills/EffectFlag;
         4: invokevirtual #422                // Method isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
         7: ireturn
      LineNumberTable:
        line 436: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final boolean isPhysicalMuted();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getstatic     #432                // Field ext/mods/gameserver/enums/skills/EffectFlag.PHYSICAL_MUTED:Lext/mods/gameserver/enums/skills/EffectFlag;
         4: invokevirtual #422                // Method isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
         7: ireturn
      LineNumberTable:
        line 437: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final boolean isRooted();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getstatic     #435                // Field ext/mods/gameserver/enums/skills/EffectFlag.ROOTED:Lext/mods/gameserver/enums/skills/EffectFlag;
         4: invokevirtual #422                // Method isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
         7: ireturn
      LineNumberTable:
        line 438: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final boolean isSleeping();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getstatic     #438                // Field ext/mods/gameserver/enums/skills/EffectFlag.SLEEP:Lext/mods/gameserver/enums/skills/EffectFlag;
         4: invokevirtual #422                // Method isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
         7: ireturn
      LineNumberTable:
        line 439: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final boolean isStunned();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getstatic     #441                // Field ext/mods/gameserver/enums/skills/EffectFlag.STUNNED:Lext/mods/gameserver/enums/skills/EffectFlag;
         4: invokevirtual #422                // Method isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
         7: ireturn
      LineNumberTable:
        line 440: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final boolean isBetrayed();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getstatic     #444                // Field ext/mods/gameserver/enums/skills/EffectFlag.BETRAYED:Lext/mods/gameserver/enums/skills/EffectFlag;
         4: invokevirtual #422                // Method isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
         7: ireturn
      LineNumberTable:
        line 441: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final boolean isImmobileUntilAttacked();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getstatic     #447                // Field ext/mods/gameserver/enums/skills/EffectFlag.MEDITATING:Lext/mods/gameserver/enums/skills/EffectFlag;
         4: invokevirtual #422                // Method isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
         7: ireturn
      LineNumberTable:
        line 442: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final boolean isAllSkillsDisabled();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #450                // Method getAllSkillsDisabled:()Z
         4: ifne          42
         7: aload_0
         8: invokevirtual #453                // Method isStunned:()Z
        11: ifne          42
        14: aload_0
        15: invokevirtual #456                // Method isImmobileUntilAttacked:()Z
        18: ifne          42
        21: aload_0
        22: invokevirtual #459                // Method isSleeping:()Z
        25: ifne          42
        28: aload_0
        29: invokevirtual #462                // Method isParalyzed:()Z
        32: ifne          42
        35: aload_0
        36: invokevirtual #465                // Method isAfraid:()Z
        39: ifeq          46
        42: iconst_1
        43: goto          47
        46: iconst_0
        47: ireturn
      LineNumberTable:
        line 446: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 42 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isAttackingDisabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #236                // Method isFlying:()Z
         4: ifne          49
         7: aload_0
         8: invokevirtual #453                // Method isStunned:()Z
        11: ifne          49
        14: aload_0
        15: invokevirtual #456                // Method isImmobileUntilAttacked:()Z
        18: ifne          49
        21: aload_0
        22: invokevirtual #459                // Method isSleeping:()Z
        25: ifne          49
        28: aload_0
        29: invokevirtual #462                // Method isParalyzed:()Z
        32: ifne          49
        35: aload_0
        36: invokevirtual #468                // Method isAlikeDead:()Z
        39: ifne          49
        42: aload_0
        43: invokevirtual #465                // Method isAfraid:()Z
        46: ifeq          53
        49: iconst_1
        50: goto          54
        53: iconst_0
        54: ireturn
      LineNumberTable:
        line 451: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 49 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean denyAiAction();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #453                // Method isStunned:()Z
         4: ifne          49
         7: aload_0
         8: invokevirtual #456                // Method isImmobileUntilAttacked:()Z
        11: ifne          49
        14: aload_0
        15: invokevirtual #459                // Method isSleeping:()Z
        18: ifne          49
        21: aload_0
        22: invokevirtual #462                // Method isParalyzed:()Z
        25: ifne          49
        28: aload_0
        29: invokevirtual #386                // Method isTeleporting:()Z
        32: ifne          49
        35: aload_0
        36: invokevirtual #210                // Method isDead:()Z
        39: ifne          49
        42: aload_0
        43: invokevirtual #465                // Method isAfraid:()Z
        46: ifeq          53
        49: iconst_1
        50: goto          54
        53: iconst_0
        54: ireturn
      LineNumberTable:
        line 456: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 49 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isMovementDisabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #453                // Method isStunned:()Z
         4: ifne          77
         7: aload_0
         8: invokevirtual #456                // Method isImmobileUntilAttacked:()Z
        11: ifne          77
        14: aload_0
        15: invokevirtual #471                // Method isRooted:()Z
        18: ifne          77
        21: aload_0
        22: invokevirtual #459                // Method isSleeping:()Z
        25: ifne          77
        28: aload_0
        29: invokevirtual #462                // Method isParalyzed:()Z
        32: ifne          77
        35: aload_0
        36: invokevirtual #474                // Method isImmobilized:()Z
        39: ifne          77
        42: aload_0
        43: invokevirtual #468                // Method isAlikeDead:()Z
        46: ifne          77
        49: aload_0
        50: invokevirtual #386                // Method isTeleporting:()Z
        53: ifne          77
        56: aload_0
        57: invokevirtual #477                // Method isSitting:()Z
        60: ifne          77
        63: aload_0
        64: invokevirtual #480                // Method isSittingNow:()Z
        67: ifne          77
        70: aload_0
        71: invokevirtual #483                // Method isStandingNow:()Z
        74: ifeq          81
        77: iconst_1
        78: goto          82
        81: iconst_0
        82: ireturn
      LineNumberTable:
        line 461: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      83     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 251 /* same_frame_extended */
          offset_delta = 77
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isOutOfControl();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #453                // Method isStunned:()Z
         4: ifne          56
         7: aload_0
         8: invokevirtual #456                // Method isImmobileUntilAttacked:()Z
        11: ifne          56
        14: aload_0
        15: invokevirtual #459                // Method isSleeping:()Z
        18: ifne          56
        21: aload_0
        22: invokevirtual #462                // Method isParalyzed:()Z
        25: ifne          56
        28: aload_0
        29: invokevirtual #465                // Method isAfraid:()Z
        32: ifne          56
        35: aload_0
        36: invokevirtual #486                // Method isConfused:()Z
        39: ifne          56
        42: aload_0
        43: invokevirtual #386                // Method isTeleporting:()Z
        46: ifne          56
        49: aload_0
        50: invokevirtual #210                // Method isDead:()Z
        53: ifeq          60
        56: iconst_1
        57: goto          61
        60: iconst_0
        61: ireturn
      LineNumberTable:
        line 466: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 56 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final ext.mods.gameserver.skills.Calculator[] getCalculators();
    descriptor: ()[Lext/mods/gameserver/skills/Calculator;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #64                 // Field _calculators:[Lext/mods/gameserver/skills/Calculator;
         4: areturn
      LineNumberTable:
        line 471: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isImmobilized();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #489                // Field _isImmobilized:Z
         4: ireturn
      LineNumberTable:
        line 474: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void setIsImmobilized(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #489                // Field _isImmobilized:Z
         5: return
      LineNumberTable:
        line 475: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       6     1 value   Z

  public boolean isAlikeDead();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #492                // Field _isDead:Z
         4: ireturn
      LineNumberTable:
        line 477: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isFakeDeath();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 478: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final boolean isDead();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #492                // Field _isDead:Z
         4: ireturn
      LineNumberTable:
        line 479: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isAttackableBy(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: aload_0
         2: if_acmpeq     9
         5: iconst_1
         6: goto          10
         9: iconst_0
        10: ireturn
      LineNumberTable:
        line 482: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      11     1 attacker   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isAttackableWithoutForceBy(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 484: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       2     1 attacker   Lext/mods/gameserver/model/actor/Playable;

  public final void setIsDead(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #492                // Field _isDead:Z
         5: return
      LineNumberTable:
        line 486: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       6     1 value   Z

  public final boolean isParalyzed();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #495                // Field _isParalyzed:Z
         4: ifne          17
         7: aload_0
         8: getstatic     #498                // Field ext/mods/gameserver/enums/skills/EffectFlag.PARALYZED:Lext/mods/gameserver/enums/skills/EffectFlag;
        11: invokevirtual #422                // Method isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
        14: ifeq          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 490: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final void setIsParalyzed(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #495                // Field _isParalyzed:Z
         5: return
      LineNumberTable:
        line 493: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       6     1 value   Z

  public ext.mods.gameserver.model.actor.Summon getSummon();
    descriptor: ()Lext/mods/gameserver/model/actor/Summon;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 495: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isOperating();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 497: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isSeated();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 498: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isStandingNow();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 499: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isStanding();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 500: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isSittingNow();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 501: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isSitting();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 502: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isRiding();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 503: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isFlying();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #501                // Field _isFlying:Z
         4: ireturn
      LineNumberTable:
        line 504: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final boolean isRunning();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #504                // Field _isRunning:Z
         4: ireturn
      LineNumberTable:
        line 505: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void setWalkOrRun(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #504                // Field _isRunning:Z
         5: aload_0
         6: getfield      #389                // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
         9: invokevirtual #507                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMoveSpeed:()F
        12: fconst_0
        13: fcmpl
        14: ifeq          29
        17: aload_0
        18: new           #511                // class ext/mods/gameserver/network/serverpackets/ChangeMoveType
        21: dup
        22: aload_0
        23: invokespecial #513                // Method ext/mods/gameserver/network/serverpackets/ChangeMoveType."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
        26: invokevirtual #259                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        29: return
      LineNumberTable:
        line 509: 0
        line 510: 5
        line 511: 17
        line 512: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      30     1 value   Z
      StackMapTable: number_of_entries = 1
        frame_type = 29 /* same */

  public final void forceWalkStance();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #514                // Method isRunning:()Z
         4: ifeq          12
         7: aload_0
         8: iconst_0
         9: invokevirtual #517                // Method setWalkOrRun:(Z)V
        12: return
      LineNumberTable:
        line 516: 0
        line 517: 7
        line 518: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 12 /* same */

  public final void forceRunStance();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #514                // Method isRunning:()Z
         4: ifne          12
         7: aload_0
         8: iconst_1
         9: invokevirtual #517                // Method setWalkOrRun:(Z)V
        12: return
      LineNumberTable:
        line 522: 0
        line 523: 7
        line 524: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 12 /* same */

  public final boolean isTeleporting();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _isTeleporting:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: invokevirtual #520                // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
         7: ireturn
      LineNumberTable:
        line 526: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final void setRunning(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #504                // Field _isRunning:Z
         5: return
      LineNumberTable:
        line 527: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       6     1 value   Z

  public boolean isInvul();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #522                // Field _isInvul:Z
         4: ifne          14
         7: aload_0
         8: invokevirtual #386                // Method isTeleporting:()Z
        11: ifeq          18
        14: iconst_1
        15: goto          19
        18: iconst_0
        19: ireturn
      LineNumberTable:
        line 531: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 14 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setInvul(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #522                // Field _isInvul:Z
         5: return
      LineNumberTable:
        line 534: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       6     1 value   Z

  public boolean isMortal();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _isMortal:Z
         4: ireturn
      LineNumberTable:
        line 536: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void setMortal(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #18                 // Field _isMortal:Z
         5: return
      LineNumberTable:
        line 537: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       6     1 value   Z

  public boolean isLethalable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 538: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isUndead();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 539: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public ext.mods.gameserver.model.actor.ai.type.CreatureAI<? extends ext.mods.gameserver.model.actor.Creature> getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #525                // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
         4: areturn
      LineNumberTable:
        line 541: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;
    Signature: #1328                        // ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI<+Lext/mods/gameserver/model/actor/Creature;>;

  public void setAI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #279                // class ext/mods/gameserver/model/actor/ai/type/CreatureAI
         4: dup
         5: aload_0
         6: invokespecial #529                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         9: putfield      #525                // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        12: return
      LineNumberTable:
        line 542: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Creature;

  public ext.mods.gameserver.model.actor.status.CreatureStatus<? extends ext.mods.gameserver.model.actor.Creature> getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #389                // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
         4: areturn
      LineNumberTable:
        line 544: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;
    Signature: #1329                        // ()Lext/mods/gameserver/model/actor/status/CreatureStatus<+Lext/mods/gameserver/model/actor/Creature;>;

  public void setStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #343                // class ext/mods/gameserver/model/actor/status/CreatureStatus
         4: dup
         5: aload_0
         6: invokespecial #530                // Method ext/mods/gameserver/model/actor/status/CreatureStatus."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         9: putfield      #389                // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
        12: return
      LineNumberTable:
        line 545: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Creature;

  public ext.mods.gameserver.model.actor.move.CreatureMove<? extends ext.mods.gameserver.model.actor.Creature> getMove();
    descriptor: ()Lext/mods/gameserver/model/actor/move/CreatureMove;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #531                // Field _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
         4: areturn
      LineNumberTable:
        line 547: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;
    Signature: #1330                        // ()Lext/mods/gameserver/model/actor/move/CreatureMove<+Lext/mods/gameserver/model/actor/Creature;>;

  public void setMove();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #295                // class ext/mods/gameserver/model/actor/move/CreatureMove
         4: dup
         5: aload_0
         6: invokespecial #535                // Method ext/mods/gameserver/model/actor/move/CreatureMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         9: putfield      #531                // Field _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
        12: return
      LineNumberTable:
        line 548: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Creature;

  public ext.mods.gameserver.model.actor.attack.CreatureAttack<? extends ext.mods.gameserver.model.actor.Creature> getAttack();
    descriptor: ()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #536                // Field _attack:Lext/mods/gameserver/model/actor/attack/CreatureAttack;
         4: areturn
      LineNumberTable:
        line 550: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;
    Signature: #1333                        // ()Lext/mods/gameserver/model/actor/attack/CreatureAttack<+Lext/mods/gameserver/model/actor/Creature;>;

  public void setAttack();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #540                // class ext/mods/gameserver/model/actor/attack/CreatureAttack
         4: dup
         5: aload_0
         6: invokespecial #542                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         9: putfield      #536                // Field _attack:Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        12: return
      LineNumberTable:
        line 551: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Creature;

  public ext.mods.gameserver.model.actor.cast.CreatureCast<? extends ext.mods.gameserver.model.actor.Creature> getCast();
    descriptor: ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #543                // Field _cast:Lext/mods/gameserver/model/actor/cast/CreatureCast;
         4: areturn
      LineNumberTable:
        line 553: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;
    Signature: #1336                        // ()Lext/mods/gameserver/model/actor/cast/CreatureCast<+Lext/mods/gameserver/model/actor/Creature;>;

  public void setCast();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #547                // class ext/mods/gameserver/model/actor/cast/CreatureCast
         4: dup
         5: aload_0
         6: invokespecial #549                // Method ext/mods/gameserver/model/actor/cast/CreatureCast."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         9: putfield      #543                // Field _cast:Lext/mods/gameserver/model/actor/cast/CreatureCast;
        12: return
      LineNumberTable:
        line 554: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Creature;

  public ext.mods.gameserver.model.actor.template.CreatureTemplate getTemplate();
    descriptor: ()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #52                 // Field _template:Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         4: areturn
      LineNumberTable:
        line 556: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  protected final void setTemplate(ext.mods.gameserver.model.actor.template.CreatureTemplate);
    descriptor: (Lext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #52                 // Field _template:Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         5: return
      LineNumberTable:
        line 557: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       6     1 template   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public final java.lang.String getTitle();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #550                // Field _title:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 559: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void setTitle(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: bipush        16
         4: ldc_w         #554                // String
         7: invokestatic  #556                // Method ext/mods/commons/lang/StringUtil.trim:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
        10: putfield      #550                // Field _title:Ljava/lang/String;
        13: return
      LineNumberTable:
        line 562: 0
        line 563: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      14     1 value   Ljava/lang/String;

  public int getAbnormalEffect();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #562                // Field _abnormalEffects:I
         4: istore_1
         5: aload_0
         6: invokevirtual #453                // Method isStunned:()Z
         9: ifeq          21
        12: iload_1
        13: getstatic     #565                // Field ext/mods/gameserver/enums/skills/AbnormalEffect.STUN:Lext/mods/gameserver/enums/skills/AbnormalEffect;
        16: invokevirtual #571                // Method ext/mods/gameserver/enums/skills/AbnormalEffect.getMask:()I
        19: ior
        20: istore_1
        21: aload_0
        22: invokevirtual #471                // Method isRooted:()Z
        25: ifeq          37
        28: iload_1
        29: getstatic     #574                // Field ext/mods/gameserver/enums/skills/AbnormalEffect.ROOT:Lext/mods/gameserver/enums/skills/AbnormalEffect;
        32: invokevirtual #571                // Method ext/mods/gameserver/enums/skills/AbnormalEffect.getMask:()I
        35: ior
        36: istore_1
        37: aload_0
        38: invokevirtual #459                // Method isSleeping:()Z
        41: ifeq          53
        44: iload_1
        45: getstatic     #577                // Field ext/mods/gameserver/enums/skills/AbnormalEffect.SLEEP:Lext/mods/gameserver/enums/skills/AbnormalEffect;
        48: invokevirtual #571                // Method ext/mods/gameserver/enums/skills/AbnormalEffect.getMask:()I
        51: ior
        52: istore_1
        53: aload_0
        54: invokevirtual #486                // Method isConfused:()Z
        57: ifeq          69
        60: iload_1
        61: getstatic     #579                // Field ext/mods/gameserver/enums/skills/AbnormalEffect.FEAR:Lext/mods/gameserver/enums/skills/AbnormalEffect;
        64: invokevirtual #571                // Method ext/mods/gameserver/enums/skills/AbnormalEffect.getMask:()I
        67: ior
        68: istore_1
        69: aload_0
        70: invokevirtual #465                // Method isAfraid:()Z
        73: ifeq          85
        76: iload_1
        77: getstatic     #579                // Field ext/mods/gameserver/enums/skills/AbnormalEffect.FEAR:Lext/mods/gameserver/enums/skills/AbnormalEffect;
        80: invokevirtual #571                // Method ext/mods/gameserver/enums/skills/AbnormalEffect.getMask:()I
        83: ior
        84: istore_1
        85: aload_0
        86: invokevirtual #581                // Method isMuted:()Z
        89: ifeq          101
        92: iload_1
        93: getstatic     #584                // Field ext/mods/gameserver/enums/skills/AbnormalEffect.MUTED:Lext/mods/gameserver/enums/skills/AbnormalEffect;
        96: invokevirtual #571                // Method ext/mods/gameserver/enums/skills/AbnormalEffect.getMask:()I
        99: ior
       100: istore_1
       101: aload_0
       102: invokevirtual #586                // Method isPhysicalMuted:()Z
       105: ifeq          117
       108: iload_1
       109: getstatic     #584                // Field ext/mods/gameserver/enums/skills/AbnormalEffect.MUTED:Lext/mods/gameserver/enums/skills/AbnormalEffect;
       112: invokevirtual #571                // Method ext/mods/gameserver/enums/skills/AbnormalEffect.getMask:()I
       115: ior
       116: istore_1
       117: aload_0
       118: invokevirtual #456                // Method isImmobileUntilAttacked:()Z
       121: ifeq          133
       124: iload_1
       125: getstatic     #589                // Field ext/mods/gameserver/enums/skills/AbnormalEffect.FLOATING_ROOT:Lext/mods/gameserver/enums/skills/AbnormalEffect;
       128: invokevirtual #571                // Method ext/mods/gameserver/enums/skills/AbnormalEffect.getMask:()I
       131: ior
       132: istore_1
       133: iload_1
       134: ireturn
      LineNumberTable:
        line 567: 0
        line 568: 5
        line 569: 21
        line 570: 37
        line 571: 53
        line 572: 69
        line 573: 85
        line 574: 101
        line 575: 117
        line 576: 133
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     135     0  this   Lext/mods/gameserver/model/actor/Creature;
            5     130     1    ae   I
      StackMapTable: number_of_entries = 8
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */

  public final void startAbnormalEffect(ext.mods.gameserver.enums.skills.AbnormalEffect);
    descriptor: (Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: dup
         2: getfield      #562                // Field _abnormalEffects:I
         5: aload_1
         6: invokevirtual #571                // Method ext/mods/gameserver/enums/skills/AbnormalEffect.getMask:()I
         9: ior
        10: putfield      #562                // Field _abnormalEffects:I
        13: aload_0
        14: invokevirtual #592                // Method updateAbnormalEffect:()V
        17: return
      LineNumberTable:
        line 579: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      18     1  mask   Lext/mods/gameserver/enums/skills/AbnormalEffect;

  public final void startAbnormalEffect(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: dup
         2: getfield      #562                // Field _abnormalEffects:I
         5: iload_1
         6: ior
         7: putfield      #562                // Field _abnormalEffects:I
        10: aload_0
        11: invokevirtual #592                // Method updateAbnormalEffect:()V
        14: return
      LineNumberTable:
        line 580: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      15     1  mask   I

  public final void stopAbnormalEffect(ext.mods.gameserver.enums.skills.AbnormalEffect);
    descriptor: (Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: dup
         2: getfield      #562                // Field _abnormalEffects:I
         5: aload_1
         6: invokevirtual #571                // Method ext/mods/gameserver/enums/skills/AbnormalEffect.getMask:()I
         9: iconst_m1
        10: ixor
        11: iand
        12: putfield      #562                // Field _abnormalEffects:I
        15: aload_0
        16: invokevirtual #592                // Method updateAbnormalEffect:()V
        19: return
      LineNumberTable:
        line 581: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      20     1  mask   Lext/mods/gameserver/enums/skills/AbnormalEffect;

  public final void stopAbnormalEffect(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: dup
         2: getfield      #562                // Field _abnormalEffects:I
         5: iload_1
         6: iconst_m1
         7: ixor
         8: iand
         9: putfield      #562                // Field _abnormalEffects:I
        12: aload_0
        13: invokevirtual #592                // Method updateAbnormalEffect:()V
        16: return
      LineNumberTable:
        line 582: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      17     1  mask   I

  public void addEffect(ext.mods.gameserver.skills.AbstractEffect);
    descriptor: (Lext/mods/gameserver/skills/AbstractEffect;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=2
         0: aload_1
         1: invokevirtual #595                // Method ext/mods/gameserver/skills/AbstractEffect.getEffected:()Lext/mods/gameserver/model/actor/Creature;
         4: astore_3
         5: aload_3
         6: instanceof    #601                // class ext/mods/gameserver/model/actor/Npc
         9: ifeq          70
        12: aload_3
        13: checkcast     #601                // class ext/mods/gameserver/model/actor/Npc
        16: astore_2
        17: aload_2
        18: invokevirtual #603                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        21: getstatic     #607                // Field ext/mods/gameserver/enums/EventHandler.SEE_SPELL:Lext/mods/gameserver/enums/EventHandler;
        24: invokevirtual #613                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        27: invokeinterface #619,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        32: astore_3
        33: aload_3
        34: invokeinterface #625,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        39: ifeq          70
        42: aload_3
        43: invokeinterface #630,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        48: checkcast     #634                // class ext/mods/gameserver/scripting/Quest
        51: astore        4
        53: aload         4
        55: aload_2
        56: aload_1
        57: invokevirtual #636                // Method ext/mods/gameserver/skills/AbstractEffect.getEffector:()Lext/mods/gameserver/model/actor/Creature;
        60: aload_1
        61: invokevirtual #639                // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        64: invokevirtual #643                // Method ext/mods/gameserver/scripting/Quest.onAbnormalStatusChanged:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
        67: goto          33
        70: aload_0
        71: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
        74: aload_1
        75: iconst_0
        76: invokevirtual #647                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.queueEffect:(Lext/mods/gameserver/skills/AbstractEffect;Z)V
        79: return
      LineNumberTable:
        line 586: 0
        line 588: 17
        line 589: 53
        line 591: 70
        line 592: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      14     4 quest   Lext/mods/gameserver/scripting/Quest;
           17      53     2   npc   Lext/mods/gameserver/model/actor/Npc;
            0      80     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      80     1 effect   Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/actor/Npc, class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 36

  public final void removeEffect(ext.mods.gameserver.skills.AbstractEffect);
    descriptor: (Lext/mods/gameserver/skills/AbstractEffect;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: aload_1
         5: iconst_1
         6: invokevirtual #647                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.queueEffect:(Lext/mods/gameserver/skills/AbstractEffect;Z)V
         9: return
      LineNumberTable:
        line 594: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      10     1 effect   Lext/mods/gameserver/skills/AbstractEffect;

  public void stopAllEffects();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: invokevirtual #651                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.stopAllEffects:()V
         7: return
      LineNumberTable:
        line 595: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void stopAllEffectsDebuff();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: invokevirtual #654                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.stopAllEffectDebuff:()V
         7: return
      LineNumberTable:
        line 596: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void stopAllEffectsExceptThoseThatLastThroughDeath();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: invokevirtual #657                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.stopAllEffectsExceptThoseThatLastThroughDeath:()V
         7: return
      LineNumberTable:
        line 597: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final void stopSkillEffects(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: iload_1
         5: invokevirtual #658                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.stopSkillEffects:(I)V
         8: return
      LineNumberTable:
        line 599: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       9     1 skillId   I

  public final void stopSkillEffects(ext.mods.gameserver.enums.skills.SkillType, int);
    descriptor: (Lext/mods/gameserver/enums/skills/SkillType;I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: aload_1
         5: iload_2
         6: invokevirtual #661                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.stopSkillEffects:(Lext/mods/gameserver/enums/skills/SkillType;I)V
         9: return
      LineNumberTable:
        line 600: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      10     1 skillType   Lext/mods/gameserver/enums/skills/SkillType;
            0      10     2 negateLvl   I

  public final void stopSkillEffects(ext.mods.gameserver.enums.skills.SkillType);
    descriptor: (Lext/mods/gameserver/enums/skills/SkillType;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: aload_1
         5: iconst_m1
         6: invokevirtual #661                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.stopSkillEffects:(Lext/mods/gameserver/enums/skills/SkillType;I)V
         9: return
      LineNumberTable:
        line 601: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      10     1 skillType   Lext/mods/gameserver/enums/skills/SkillType;

  public final void stopEffects(ext.mods.gameserver.enums.skills.EffectType);
    descriptor: (Lext/mods/gameserver/enums/skills/EffectType;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: aload_1
         5: invokevirtual #664                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
         8: return
      LineNumberTable:
        line 602: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       9     1  type   Lext/mods/gameserver/enums/skills/EffectType;

  public final ext.mods.gameserver.skills.AbstractEffect[] getAllEffects();
    descriptor: ()[Lext/mods/gameserver/skills/AbstractEffect;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: invokevirtual #668                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
         7: areturn
      LineNumberTable:
        line 604: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final ext.mods.gameserver.skills.AbstractEffect getFirstEffect(int);
    descriptor: (I)Lext/mods/gameserver/skills/AbstractEffect;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: iload_1
         5: invokevirtual #672                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
         8: areturn
      LineNumberTable:
        line 605: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       9     1 skillId   I

  public final ext.mods.gameserver.skills.AbstractEffect getFirstEffect(ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: aload_1
         5: invokevirtual #676                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
         8: areturn
      LineNumberTable:
        line 606: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       9     1 skill   Lext/mods/gameserver/skills/L2Skill;

  public final ext.mods.gameserver.skills.AbstractEffect getFirstEffect(ext.mods.gameserver.enums.skills.EffectType);
    descriptor: (Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: aload_1
         5: invokevirtual #679                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
         8: areturn
      LineNumberTable:
        line 607: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       9     1  type   Lext/mods/gameserver/enums/skills/EffectType;

  public final void updateEffectIcons();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: invokevirtual #682                // Method updateEffectIcons:(Z)V
         5: return
      LineNumberTable:
        line 609: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void updateEffectIcons(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 610: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       1     1 partyOnly   Z

  public final void addStatFunc(ext.mods.gameserver.skills.basefuncs.Func);
    descriptor: (Lext/mods/gameserver/skills/basefuncs/Func;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_1
         6: invokevirtual #685                // Method ext/mods/gameserver/skills/basefuncs/Func.getStat:()Lext/mods/gameserver/enums/skills/Stats;
         9: invokevirtual #691                // Method ext/mods/gameserver/enums/skills/Stats.ordinal:()I
        12: istore_2
        13: aload_0
        14: getfield      #64                 // Field _calculators:[Lext/mods/gameserver/skills/Calculator;
        17: dup
        18: astore_3
        19: monitorenter
        20: aload_0
        21: getfield      #64                 // Field _calculators:[Lext/mods/gameserver/skills/Calculator;
        24: iload_2
        25: aaload
        26: ifnonnull     42
        29: aload_0
        30: getfield      #64                 // Field _calculators:[Lext/mods/gameserver/skills/Calculator;
        33: iload_2
        34: new           #62                 // class ext/mods/gameserver/skills/Calculator
        37: dup
        38: invokespecial #694                // Method ext/mods/gameserver/skills/Calculator."<init>":()V
        41: aastore
        42: aload_0
        43: getfield      #64                 // Field _calculators:[Lext/mods/gameserver/skills/Calculator;
        46: iload_2
        47: aaload
        48: aload_1
        49: invokevirtual #695                // Method ext/mods/gameserver/skills/Calculator.addFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        52: aload_3
        53: monitorexit
        54: goto          64
        57: astore        4
        59: aload_3
        60: monitorexit
        61: aload         4
        63: athrow
        64: return
      Exception table:
         from    to  target type
            20    54    57   any
            57    61    57   any
      LineNumberTable:
        line 614: 0
        line 615: 5
        line 616: 13
        line 618: 20
        line 619: 42
        line 620: 52
        line 621: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      65     1 function   Lext/mods/gameserver/skills/basefuncs/Func;
           13      52     2  stat   I
      StackMapTable: number_of_entries = 4
        frame_type = 5 /* same */
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ int, class java/lang/Object ]
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 6

  public final void addStatFuncs(java.util.List<ext.mods.gameserver.skills.basefuncs.Func>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: ifnull        13
         4: aload_1
         5: invokeinterface #698,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        10: ifeq          14
        13: return
        14: aload_1
        15: invokeinterface #619,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        20: astore_2
        21: aload_2
        22: invokeinterface #625,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        27: ifeq          48
        30: aload_2
        31: invokeinterface #630,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        36: checkcast     #686                // class ext/mods/gameserver/skills/basefuncs/Func
        39: astore_3
        40: aload_0
        41: aload_3
        42: invokevirtual #115                // Method addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
        45: goto          21
        48: aload_0
        49: aload_1
        50: invokeinterface #701,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        55: invokedynamic #705,  0            // InvokeDynamic #2:apply:()Ljava/util/function/Function;
        60: invokeinterface #709,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        65: invokestatic  #715                // Method java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
        68: invokeinterface #721,  2          // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
        73: checkcast     #620                // class java/util/List
        76: invokevirtual #725                // Method broadcastModifiedStats:(Ljava/util/List;)V
        79: return
      LineNumberTable:
        line 628: 0
        line 630: 14
        line 632: 40
        line 633: 45
        line 634: 48
        line 635: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40       5     3     f   Lext/mods/gameserver/skills/basefuncs/Func;
            0      80     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      80     1 funcs   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      80     1 funcs   Ljava/util/List<Lext/mods/gameserver/skills/basefuncs/Func;>;
      StackMapTable: number_of_entries = 4
        frame_type = 13 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 26
    Signature: #1374                        // (Ljava/util/List<Lext/mods/gameserver/skills/basefuncs/Func;>;)V

  public final void removeStatsByOwner(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=10, args_size=2
         0: aconst_null
         1: astore_2
         2: iconst_0
         3: istore_3
         4: aload_0
         5: getfield      #64                 // Field _calculators:[Lext/mods/gameserver/skills/Calculator;
         8: dup
         9: astore        4
        11: monitorenter
        12: aload_0
        13: getfield      #64                 // Field _calculators:[Lext/mods/gameserver/skills/Calculator;
        16: astore        5
        18: aload         5
        20: arraylength
        21: istore        6
        23: iconst_0
        24: istore        7
        26: iload         7
        28: iload         6
        30: if_icmpge     96
        33: aload         5
        35: iload         7
        37: aaload
        38: astore        8
        40: aload         8
        42: ifnull        87
        45: aload_2
        46: ifnull        65
        49: aload_2
        50: aload         8
        52: aload_1
        53: invokevirtual #729                // Method ext/mods/gameserver/skills/Calculator.removeOwner:(Ljava/lang/Object;)Ljava/util/List;
        56: invokeinterface #733,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
        61: pop
        62: goto          72
        65: aload         8
        67: aload_1
        68: invokevirtual #729                // Method ext/mods/gameserver/skills/Calculator.removeOwner:(Ljava/lang/Object;)Ljava/util/List;
        71: astore_2
        72: aload         8
        74: invokevirtual #737                // Method ext/mods/gameserver/skills/Calculator.size:()I
        77: ifne          87
        80: aload_0
        81: getfield      #64                 // Field _calculators:[Lext/mods/gameserver/skills/Calculator;
        84: iload_3
        85: aconst_null
        86: aastore
        87: iinc          3, 1
        90: iinc          7, 1
        93: goto          26
        96: aload_1
        97: instanceof    #596                // class ext/mods/gameserver/skills/AbstractEffect
       100: ifeq          125
       103: aload_1
       104: checkcast     #596                // class ext/mods/gameserver/skills/AbstractEffect
       107: astore        5
       109: aload         5
       111: invokevirtual #740                // Method ext/mods/gameserver/skills/AbstractEffect.cantUpdateAnymore:()Z
       114: ifne          130
       117: aload_0
       118: aload_2
       119: invokevirtual #725                // Method broadcastModifiedStats:(Ljava/util/List;)V
       122: goto          130
       125: aload_0
       126: aload_2
       127: invokevirtual #725                // Method broadcastModifiedStats:(Ljava/util/List;)V
       130: aload         4
       132: monitorexit
       133: goto          144
       136: astore        9
       138: aload         4
       140: monitorexit
       141: aload         9
       143: athrow
       144: return
      Exception table:
         from    to  target type
            12   133   136   any
           136   141   136   any
      LineNumberTable:
        line 639: 0
        line 640: 2
        line 641: 4
        line 643: 12
        line 645: 40
        line 647: 45
        line 648: 49
        line 650: 65
        line 652: 72
        line 653: 80
        line 655: 87
        line 643: 90
        line 658: 96
        line 660: 109
        line 661: 117
        line 664: 125
        line 665: 130
        line 666: 144
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      50     8  calc   Lext/mods/gameserver/skills/Calculator;
          109      16     5    ae   Lext/mods/gameserver/skills/AbstractEffect;
            0     145     0  this   Lext/mods/gameserver/model/actor/Creature;
            0     145     1 owner   Ljava/lang/Object;
            2     143     2 modifiedStats   Ljava/util/List;
            4     141     3     i   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            2     143     2 modifiedStats   Ljava/util/List<Lext/mods/gameserver/enums/skills/Stats;>;
      StackMapTable: number_of_entries = 9
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/actor/Creature, class java/lang/Object, class java/util/List, int, class java/lang/Object, class "[Lext/mods/gameserver/skills/Calculator;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/skills/Calculator ]
        frame_type = 6 /* same */
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/model/actor/Creature, class java/lang/Object, class java/util/List, int, class java/lang/Object ]
          stack = []
        frame_type = 28 /* same */
        frame_type = 4 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 7

  public boolean isInCombat();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #796                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
         3: aload_0
         4: invokevirtual #801                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
         7: ireturn
      LineNumberTable:
        line 732: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final boolean isMoving();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #290                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
         4: invokevirtual #805                // Method ext/mods/gameserver/model/actor/move/CreatureMove.getTask:()Ljava/util/concurrent/ScheduledFuture;
         7: ifnull        14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 737: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void abortAll(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #531                // Field _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
         4: invokevirtual #299                // Method ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
         7: aload_0
         8: getfield      #536                // Field _attack:Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        11: invokevirtual #809                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.stop:()V
        14: aload_0
        15: getfield      #543                // Field _cast:Lext/mods/gameserver/model/actor/cast/CreatureCast;
        18: invokevirtual #810                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.stop:()V
        21: iload_1
        22: ifeq          30
        25: aload_0
        26: aconst_null
        27: invokevirtual #811                // Method setTarget:(Lext/mods/gameserver/model/WorldObject;)V
        30: return
      LineNumberTable:
        line 742: 0
        line 743: 7
        line 744: 14
        line 745: 21
        line 746: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      31     1 resetTarget   Z
      StackMapTable: number_of_entries = 1
        frame_type = 30 /* same */

  public boolean isInWater();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: astore_2
         2: aload_2
         3: instanceof    #601                // class ext/mods/gameserver/model/actor/Npc
         6: ifeq          34
         9: aload_2
        10: checkcast     #601                // class ext/mods/gameserver/model/actor/Npc
        13: astore_1
        14: aload_1
        15: invokevirtual #814                // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
        18: sipush        32108
        21: if_icmpne     34
        24: aload_0
        25: getfield      #531                // Field _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
        28: getstatic     #817                // Field ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
        31: invokevirtual #823                // Method ext/mods/gameserver/model/actor/move/CreatureMove.removeMoveType:(Lext/mods/gameserver/enums/actors/MoveType;)V
        34: aload_0
        35: getfield      #531                // Field _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
        38: invokevirtual #827                // Method ext/mods/gameserver/model/actor/move/CreatureMove.getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
        41: getstatic     #817                // Field ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
        44: if_acmpne     51
        47: iconst_1
        48: goto          52
        51: iconst_0
        52: ireturn
      LineNumberTable:
        line 750: 0
        line 752: 14
        line 753: 24
        line 755: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      20     1   npc   Lext/mods/gameserver/model/actor/Npc;
            0      53     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 34 /* same */
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void revalidateZone(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #831                // Method getRegion:()Lext/mods/gameserver/model/WorldRegion;
         4: ifnonnull     8
         7: return
         8: iload_1
         9: ifeq          20
        12: aload_0
        13: iconst_4
        14: putfield      #32                 // Field _zoneValidateCounter:B
        17: goto          47
        20: aload_0
        21: dup
        22: getfield      #32                 // Field _zoneValidateCounter:B
        25: iconst_1
        26: isub
        27: i2b
        28: putfield      #32                 // Field _zoneValidateCounter:B
        31: aload_0
        32: getfield      #32                 // Field _zoneValidateCounter:B
        35: ifge          46
        38: aload_0
        39: iconst_4
        40: putfield      #32                 // Field _zoneValidateCounter:B
        43: goto          47
        46: return
        47: aload_0
        48: invokevirtual #831                // Method getRegion:()Lext/mods/gameserver/model/WorldRegion;
        51: aload_0
        52: invokevirtual #834                // Method ext/mods/gameserver/model/WorldRegion.revalidateZones:(Lext/mods/gameserver/model/actor/Creature;)V
        55: return
      LineNumberTable:
        line 760: 0
        line 761: 8
        line 764: 20
        line 765: 31
        line 766: 46
        line 768: 47
        line 769: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      56     1 force   Z
      StackMapTable: number_of_entries = 4
        frame_type = 8 /* same */
        frame_type = 11 /* same */
        frame_type = 25 /* same */
        frame_type = 0 /* same */

  public boolean isShowSummonAnimation();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #839                // Field _showSummonAnimation:Z
         4: ireturn
      LineNumberTable:
        line 771: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void setShowSummonAnimation(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #839                // Field _showSummonAnimation:Z
         5: return
      LineNumberTable:
        line 772: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       6     1 showSummonAnimation   Z

  public void setTarget(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        13
         4: aload_1
         5: invokevirtual #842                // Method ext/mods/gameserver/model/WorldObject.isVisible:()Z
         8: ifne          13
        11: aconst_null
        12: astore_1
        13: aload_0
        14: aload_1
        15: putfield      #843                // Field _target:Lext/mods/gameserver/model/WorldObject;
        18: return
      LineNumberTable:
        line 776: 0
        line 777: 13
        line 778: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      19     1 object   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 1
        frame_type = 13 /* same */

  public final int getTargetId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #843                // Field _target:Lext/mods/gameserver/model/WorldObject;
         4: ifnull        17
         7: aload_0
         8: getfield      #843                // Field _target:Lext/mods/gameserver/model/WorldObject;
        11: invokevirtual #847                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
        14: goto          18
        17: iconst_m1
        18: ireturn
      LineNumberTable:
        line 780: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final ext.mods.gameserver.model.WorldObject getTarget();
    descriptor: ()Lext/mods/gameserver/model/WorldObject;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #843                // Field _target:Lext/mods/gameserver/model/WorldObject;
         4: areturn
      LineNumberTable:
        line 781: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean checkAndEquipArrows();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 783: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void addExpAndSp(long, int);
    descriptor: (JI)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=4, args_size=3
         0: return
      LineNumberTable:
        line 784: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       1     1 addToExp   J
            0       1     3 addToSp   I

  public ext.mods.gameserver.enums.items.WeaponType getAttackType();
    descriptor: ()Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #850                // Method getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
         4: astore_1
         5: aload_1
         6: ifnonnull     15
         9: getstatic     #854                // Field ext/mods/gameserver/enums/items/WeaponType.NONE:Lext/mods/gameserver/enums/items/WeaponType;
        12: goto          19
        15: aload_1
        16: invokevirtual #860                // Method ext/mods/gameserver/model/item/kind/Weapon.getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
        19: areturn
      LineNumberTable:
        line 788: 0
        line 789: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/Creature;
            5      15     1 weapon   Lext/mods/gameserver/model/item/kind/Weapon;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/item/kind/Weapon ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/items/WeaponType ]

  public void reduceArrowCount();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 792: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void onAction(ext.mods.gameserver.model.actor.Player, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_1
         1: invokevirtual #866                // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
         4: aload_0
         5: if_acmpeq     16
         8: aload_1
         9: aload_0
        10: invokevirtual #870                // Method ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
        13: goto          59
        16: aload_0
        17: aload_1
        18: invokevirtual #871                // Method isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
        21: ifne          36
        24: iload_2
        25: ifeq          49
        28: aload_0
        29: aload_1
        30: invokevirtual #875                // Method isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
        33: ifeq          49
        36: aload_1
        37: invokevirtual #878                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        40: aload_0
        41: iload_2
        42: iload_3
        43: invokevirtual #881                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
        46: goto          59
        49: aload_1
        50: invokevirtual #878                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        53: aload_0
        54: iload_2
        55: iload_3
        56: invokevirtual #887                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
        59: return
      LineNumberTable:
        line 797: 0
        line 798: 8
        line 801: 16
        line 802: 36
        line 804: 49
        line 806: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      60     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      60     1 player   Lext/mods/gameserver/model/actor/Player;
            0      60     2 isCtrlPressed   Z
            0      60     3 isShiftPressed   Z
      StackMapTable: number_of_entries = 4
        frame_type = 16 /* same */
        frame_type = 19 /* same */
        frame_type = 12 /* same */
        frame_type = 9 /* same */

  public boolean isInActiveRegion();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #831                // Method getRegion:()Lext/mods/gameserver/model/WorldRegion;
         4: astore_1
         5: aload_1
         6: ifnull        20
         9: aload_1
        10: invokevirtual #891                // Method ext/mods/gameserver/model/WorldRegion.isActive:()Z
        13: ifeq          20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 810: 0
        line 811: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/Creature;
            5      17     1 region   Lext/mods/gameserver/model/WorldRegion;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/WorldRegion ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isInParty();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 814: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public ext.mods.gameserver.model.group.Party getParty();
    descriptor: ()Lext/mods/gameserver/model/group/Party;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 815: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public ext.mods.gameserver.model.actor.container.creature.ChanceSkillList getChanceSkills();
    descriptor: ()Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #894                // Field _chanceSkills:Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
         4: areturn
      LineNumberTable:
        line 817: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void removeChanceSkill(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: aload_0
         1: getfield      #894                // Field _chanceSkills:Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #894                // Field _chanceSkills:Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
        12: invokevirtual #898                // Method ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.keySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        15: invokevirtual #904                // Method java/util/concurrent/ConcurrentHashMap$KeySetView.iterator:()Ljava/util/Iterator;
        18: astore_2
        19: aload_2
        20: invokeinterface #625,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        25: ifeq          73
        28: aload_2
        29: invokeinterface #630,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        34: checkcast     #907                // class ext/mods/gameserver/skills/IChanceSkillTrigger
        37: astore_3
        38: aload_3
        39: instanceof    #909                // class ext/mods/gameserver/skills/L2Skill
        42: ifeq          19
        45: aload_3
        46: checkcast     #909                // class ext/mods/gameserver/skills/L2Skill
        49: astore        4
        51: aload         4
        53: invokevirtual #911                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        56: iload_1
        57: if_icmpne     70
        60: aload_0
        61: getfield      #894                // Field _chanceSkills:Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
        64: aload         4
        66: invokevirtual #912                // Method ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        69: pop
        70: goto          19
        73: return
      LineNumberTable:
        line 821: 0
        line 822: 8
        line 824: 38
        line 825: 51
        line 826: 70
        line 827: 73
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      19     4 skill   Lext/mods/gameserver/skills/L2Skill;
           38      32     3 trigger   Lext/mods/gameserver/skills/IChanceSkillTrigger;
            0      74     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      74     1    id   I
      StackMapTable: number_of_entries = 4
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 50 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void addChanceTrigger(ext.mods.gameserver.skills.IChanceSkillTrigger);
    descriptor: (Lext/mods/gameserver/skills/IChanceSkillTrigger;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #894                // Field _chanceSkills:Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
         4: ifnonnull     19
         7: aload_0
         8: new           #899                // class ext/mods/gameserver/model/actor/container/creature/ChanceSkillList
        11: dup
        12: aload_0
        13: invokespecial #916                // Method ext/mods/gameserver/model/actor/container/creature/ChanceSkillList."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
        16: putfield      #894                // Field _chanceSkills:Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
        19: aload_0
        20: getfield      #894                // Field _chanceSkills:Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
        23: aload_1
        24: aload_1
        25: invokeinterface #917,  1          // InterfaceMethod ext/mods/gameserver/skills/IChanceSkillTrigger.getTriggeredChanceCondition:()Lext/mods/gameserver/skills/ChanceCondition;
        30: invokevirtual #921                // Method ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        33: pop
        34: return
      LineNumberTable:
        line 831: 0
        line 832: 19
        line 833: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      35     1 trigger   Lext/mods/gameserver/skills/IChanceSkillTrigger;
      StackMapTable: number_of_entries = 1
        frame_type = 19 /* same */

  public void removeChanceEffect(ext.mods.gameserver.skills.effects.EffectChanceSkillTrigger);
    descriptor: (Lext/mods/gameserver/skills/effects/EffectChanceSkillTrigger;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #894                // Field _chanceSkills:Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #894                // Field _chanceSkills:Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
        12: aload_1
        13: invokevirtual #912                // Method ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        16: pop
        17: return
      LineNumberTable:
        line 837: 0
        line 838: 8
        line 839: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      18     1 effect   Lext/mods/gameserver/skills/effects/EffectChanceSkillTrigger;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public java.util.Map<java.lang.Integer, ext.mods.gameserver.skills.L2Skill> getSkills();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #925                // Method java/util/Collections.emptyMap:()Ljava/util/Map;
         3: areturn
      LineNumberTable:
        line 841: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/actor/Creature;
    Signature: #1432                        // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/skills/L2Skill;>;

  public int getSkillLevel(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: invokevirtual #931                // Method getSkills:()Ljava/util/Map;
         4: iload_1
         5: invokestatic  #934                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #940,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #909                // class ext/mods/gameserver/skills/L2Skill
        16: astore_2
        17: aload_2
        18: ifnonnull     25
        21: iconst_0
        22: goto          29
        25: aload_2
        26: invokevirtual #944                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
        29: ireturn
      LineNumberTable:
        line 845: 0
        line 846: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      30     1 skillId   I
           17      13     2 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.skills.L2Skill getSkill(int);
    descriptor: (I)Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #931                // Method getSkills:()Ljava/util/Map;
         4: iload_1
         5: invokestatic  #934                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #940,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #909                // class ext/mods/gameserver/skills/L2Skill
        16: areturn
      LineNumberTable:
        line 849: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      17     1 skillId   I

  public boolean hasSkill(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #931                // Method getSkills:()Ljava/util/Map;
         4: iload_1
         5: invokestatic  #934                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #947,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        13: ireturn
      LineNumberTable:
        line 850: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      14     1 skillId   I

  public int getBuffCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: invokevirtual #951                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.getBuffCount:()I
         7: ireturn
      LineNumberTable:
        line 852: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public int getDanceCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: invokevirtual #954                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.getDanceCount:()I
         7: ireturn
      LineNumberTable:
        line 853: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public java.util.Map<java.lang.Integer, java.lang.Long> getDisabledSkills();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #48                 // Field _disabledSkills:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 854: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;
    Signature: #1437                        // ()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;

  public void enableSkill(ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #48                 // Field _disabledSkills:Ljava/util/Map;
         9: aload_1
        10: invokevirtual #957                // Method ext/mods/gameserver/skills/L2Skill.getReuseHashCode:()I
        13: invokestatic  #934                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: invokeinterface #960,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        21: pop
        22: return
      LineNumberTable:
        line 858: 0
        line 859: 5
        line 860: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      23     1 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 1
        frame_type = 5 /* same */

  public void disableSkill(ext.mods.gameserver.skills.L2Skill, long);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=3
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #48                 // Field _disabledSkills:Ljava/util/Map;
         9: aload_1
        10: invokevirtual #957                // Method ext/mods/gameserver/skills/L2Skill.getReuseHashCode:()I
        13: invokestatic  #934                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: lload_2
        17: ldc2_w        #961                // long 10l
        20: lcmp
        21: ifle          32
        24: invokestatic  #963                // Method java/lang/System.currentTimeMillis:()J
        27: lload_2
        28: ladd
        29: goto          35
        32: ldc2_w        #971                // long 9223372036854775807l
        35: invokestatic  #973                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        38: invokeinterface #976,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        43: pop
        44: return
      LineNumberTable:
        line 864: 0
        line 865: 5
        line 866: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      45     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0      45     2 delay   J
      StackMapTable: number_of_entries = 3
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, long ]
          stack = [ class java/util/Map, class java/lang/Integer ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, long ]
          stack = [ class java/util/Map, class java/lang/Integer, long ]

  public boolean isSkillDisabled(ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: getfield      #48                 // Field _disabledSkills:Ljava/util/Map;
         4: invokeinterface #977,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
         9: ifeq          14
        12: iconst_0
        13: ireturn
        14: aload_1
        15: ifnull        25
        18: aload_0
        19: invokevirtual #978                // Method isAllSkillsDisabled:()Z
        22: ifeq          27
        25: iconst_1
        26: ireturn
        27: aload_1
        28: invokevirtual #957                // Method ext/mods/gameserver/skills/L2Skill.getReuseHashCode:()I
        31: istore_2
        32: aload_0
        33: getfield      #48                 // Field _disabledSkills:Ljava/util/Map;
        36: iload_2
        37: invokestatic  #934                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        40: invokeinterface #940,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        45: checkcast     #969                // class java/lang/Long
        48: astore_3
        49: aload_3
        50: ifnonnull     55
        53: iconst_0
        54: ireturn
        55: aload_3
        56: invokevirtual #981                // Method java/lang/Long.longValue:()J
        59: invokestatic  #963                // Method java/lang/System.currentTimeMillis:()J
        62: lcmp
        63: ifge          82
        66: aload_0
        67: getfield      #48                 // Field _disabledSkills:Ljava/util/Map;
        70: iload_2
        71: invokestatic  #934                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        74: invokeinterface #960,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        79: pop
        80: iconst_0
        81: ireturn
        82: iconst_1
        83: ireturn
      LineNumberTable:
        line 870: 0
        line 871: 14
        line 872: 27
        line 873: 32
        line 874: 49
        line 875: 55
        line 877: 66
        line 878: 80
        line 880: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      84     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      84     1 skill   Lext/mods/gameserver/skills/L2Skill;
           32      52     2 hashCode   I
           49      35     3 timeStamp   Ljava/lang/Long;
      StackMapTable: number_of_entries = 5
        frame_type = 14 /* same */
        frame_type = 10 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 27
          locals = [ int, class java/lang/Long ]
        frame_type = 26 /* same */

  public void disableAllSkills();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: putfield      #984                // Field _allSkillsDisabled:Z
         5: return
      LineNumberTable:
        line 883: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void enableAllSkills();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #984                // Field _allSkillsDisabled:Z
         5: return
      LineNumberTable:
        line 884: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean getAllSkillsDisabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #984                // Field _allSkillsDisabled:Z
         4: ireturn
      LineNumberTable:
        line 885: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void reduceCurrentHp(double, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=4
         0: aload_0
         1: dload_1
         2: aload_3
         3: iconst_1
         4: iconst_0
         5: aload         4
         7: invokevirtual #987                // Method reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
        10: return
      LineNumberTable:
        line 889: 0
        line 890: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      11     1     i   D
            0      11     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      11     4 skill   Lext/mods/gameserver/skills/L2Skill;

  public void reduceCurrentHpByDOT(double, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=4
         0: aload_0
         1: dload_1
         2: aload_3
         3: aload         4
         5: invokevirtual #991                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
         8: ifne          15
        11: iconst_1
        12: goto          16
        15: iconst_0
        16: iconst_1
        17: aload         4
        19: invokevirtual #987                // Method reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
        22: return
      LineNumberTable:
        line 894: 0
        line 895: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      23     1     i   D
            0      23     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      23     4 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Creature, double, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill ]
          stack = [ class ext/mods/gameserver/model/actor/Creature, double, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Creature, double, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill ]
          stack = [ class ext/mods/gameserver/model/actor/Creature, double, class ext/mods/gameserver/model/actor/Creature, int ]

  public void reduceCurrentHp(double, ext.mods.gameserver.model.actor.Creature, boolean, boolean, ext.mods.gameserver.skills.L2Skill);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=6
         0: aload_0
         1: invokevirtual #994                // Method isChampion:()Z
         4: ifeq          35
         7: getstatic     #997                // Field ext/mods/Config.CHAMPION_HP:I
        10: ifeq          35
        13: aload_0
        14: invokevirtual #338                // Method getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        17: dload_1
        18: getstatic     #997                // Field ext/mods/Config.CHAMPION_HP:I
        21: i2d
        22: ddiv
        23: aload_3
        24: iload         4
        26: iload         5
        28: iconst_0
        29: invokevirtual #1000               // Method ext/mods/gameserver/model/actor/status/CreatureStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
        32: goto          49
        35: aload_0
        36: invokevirtual #338                // Method getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        39: dload_1
        40: aload_3
        41: iload         4
        43: iload         5
        45: iconst_0
        46: invokevirtual #1000               // Method ext/mods/gameserver/model/actor/status/CreatureStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
        49: invokestatic  #405                // Method ext/mods/extensions/listener/manager/CreatureListenerManager.getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
        52: aload_0
        53: dload_1
        54: aload_3
        55: aload         6
        57: invokevirtual #1004               // Method ext/mods/extensions/listener/manager/CreatureListenerManager.notifyHpDamage:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
        60: return
      LineNumberTable:
        line 899: 0
        line 900: 13
        line 902: 35
        line 904: 49
        line 905: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      61     1     i   D
            0      61     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      61     4 awake   Z
            0      61     5 isDOT   Z
            0      61     6 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 2
        frame_type = 35 /* same */
        frame_type = 13 /* same */

  public boolean isChampion();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 907: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void sendDamageMessage(ext.mods.gameserver.model.actor.Creature, int, boolean, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=6, args_size=6
         0: return
      LineNumberTable:
        line 909: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       1     1 target   Lext/mods/gameserver/model/actor/Creature;
            0       1     2 damage   I
            0       1     3 mcrit   Z
            0       1     4 pcrit   Z
            0       1     5  miss   Z

  public ext.mods.gameserver.model.actor.container.creature.FusionSkill getFusionSkill();
    descriptor: ()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #329                // Field _fusionSkill:Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
         4: areturn
      LineNumberTable:
        line 911: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void setFusionSkill(ext.mods.gameserver.model.actor.container.creature.FusionSkill);
    descriptor: (Lext/mods/gameserver/model/actor/container/creature/FusionSkill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #329                // Field _fusionSkill:Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
         5: return
      LineNumberTable:
        line 912: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       6     1    fb   Lext/mods/gameserver/model/actor/container/creature/FusionSkill;

  public boolean isAffected(ext.mods.gameserver.enums.skills.EffectFlag);
    descriptor: (Lext/mods/gameserver/enums/skills/EffectFlag;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #41                 // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: aload_1
         5: invokevirtual #1008               // Method ext/mods/gameserver/model/actor/container/creature/EffectList.isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
         8: ireturn
      LineNumberTable:
        line 914: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       9     1  flag   Lext/mods/gameserver/enums/skills/EffectFlag;

  public int getMaxBuffCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: getstatic     #1009               // Field ext/mods/Config.MAX_BUFFS_AMOUNT:I
         3: aload_0
         4: sipush        1405
         7: invokevirtual #1012               // Method getSkillLevel:(I)I
        10: iadd
        11: ireturn
      LineNumberTable:
        line 916: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/Creature;

  public final double getRandomDamageMultiplier();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #850                // Method getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
         4: astore_1
         5: aload_1
         6: ifnull        17
         9: aload_1
        10: invokevirtual #1016               // Method ext/mods/gameserver/model/item/kind/Weapon.getRandomDamage:()I
        13: istore_2
        14: goto          32
        17: iconst_5
        18: aload_0
        19: invokevirtual #338                // Method getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        22: invokevirtual #1019               // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getLevel:()I
        25: i2d
        26: invokestatic  #1020               // Method java/lang/Math.sqrt:(D)D
        29: d2i
        30: iadd
        31: istore_2
        32: dconst_1
        33: iconst_0
        34: iload_2
        35: isub
        36: iload_2
        37: invokestatic  #213                // Method ext/mods/commons/random/Rnd.get:(II)I
        40: i2d
        41: ldc2_w        #1026               // double 100.0d
        44: ddiv
        45: dadd
        46: dreturn
      LineNumberTable:
        line 920: 0
        line 922: 5
        line 923: 17
        line 924: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14       3     2 random   I
            0      47     0  this   Lext/mods/gameserver/model/actor/Creature;
            5      42     1 activeWeapon   Lext/mods/gameserver/model/item/kind/Weapon;
           32      15     2 random   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/item/kind/Weapon ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ int ]

  public boolean isInArena();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 927: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public double getCollisionRadius();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #1028               // Method getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         4: invokevirtual #1031               // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getCollisionRadius:()D
         7: dreturn
      LineNumberTable:
        line 929: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public double getCollisionHeight();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #1028               // Method getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         4: invokevirtual #1037               // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getCollisionHeight:()D
         7: dreturn
      LineNumberTable:
        line 930: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void fleeFrom(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: aload_1
         1: ifnull        15
         4: aload_1
         5: aload_0
         6: if_acmpeq     15
         9: iload_2
        10: bipush        10
        12: if_icmpge     16
        15: return
        16: aload_0
        17: invokevirtual #1040               // Method forceRunStance:()V
        20: aload_0
        21: invokevirtual #170                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        24: invokevirtual #1043               // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
        27: astore_3
        28: aload_3
        29: aload_1
        30: invokevirtual #170                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        33: iload_2
        34: invokevirtual #1046               // Method ext/mods/gameserver/model/location/Location.setFleeing:(Lext/mods/gameserver/model/location/Point2D;I)V
        37: aload_0
        38: invokevirtual #290                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        41: aload_3
        42: iconst_0
        43: iconst_1
        44: iconst_0
        45: invokevirtual #1050               // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
        48: pop
        49: return
      LineNumberTable:
        line 934: 0
        line 935: 16
        line 936: 20
        line 937: 28
        line 938: 37
        line 939: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      50     1 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      50     2 distance   I
           28      22     3   loc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 0 /* same */

  public void moveUsingRandomOffset(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: iload_1
         1: bipush        10
         3: if_icmpge     7
         6: return
         7: aload_0
         8: invokevirtual #170                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        11: invokevirtual #1043               // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
        14: astore_2
        15: aload_2
        16: iload_1
        17: invokevirtual #1054               // Method ext/mods/gameserver/model/location/Location.addRandomOffset:(I)V
        20: aload_0
        21: invokevirtual #290                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        24: aload_2
        25: iconst_0
        26: iconst_1
        27: iconst_0
        28: invokevirtual #1050               // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
        31: pop
        32: return
      LineNumberTable:
        line 943: 0
        line 944: 7
        line 945: 15
        line 946: 20
        line 947: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      33     1 offset   I
           15      18     2   loc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 1
        frame_type = 7 /* same */

  public final void setRegion(ext.mods.gameserver.model.WorldRegion);
    descriptor: (Lext/mods/gameserver/model/WorldRegion;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #831                // Method getRegion:()Lext/mods/gameserver/model/WorldRegion;
         4: ifnull        38
         7: aload_1
         8: ifnonnull     22
        11: aload_0
        12: invokevirtual #831                // Method getRegion:()Lext/mods/gameserver/model/WorldRegion;
        15: aload_0
        16: invokevirtual #1057               // Method ext/mods/gameserver/model/WorldRegion.removeFromZones:(Lext/mods/gameserver/model/actor/Creature;)V
        19: goto          38
        22: aload_1
        23: aload_0
        24: invokevirtual #831                // Method getRegion:()Lext/mods/gameserver/model/WorldRegion;
        27: if_acmpeq     38
        30: aload_0
        31: invokevirtual #831                // Method getRegion:()Lext/mods/gameserver/model/WorldRegion;
        34: aload_0
        35: invokevirtual #834                // Method ext/mods/gameserver/model/WorldRegion.revalidateZones:(Lext/mods/gameserver/model/actor/Creature;)V
        38: aload_0
        39: aload_1
        40: invokespecial #1060               // Method ext/mods/gameserver/model/WorldObject.setRegion:(Lext/mods/gameserver/model/WorldRegion;)V
        43: aload_0
        44: iconst_1
        45: invokevirtual #1061               // Method revalidateZone:(Z)V
        48: return
      LineNumberTable:
        line 952: 0
        line 954: 7
        line 955: 22
        line 957: 38
        line 958: 43
        line 959: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      49     1 newRegion   Lext/mods/gameserver/model/WorldRegion;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 15 /* same */

  public void removeKnownObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: aload_0
         2: invokevirtual #1064               // Method getTarget:()Lext/mods/gameserver/model/WorldObject;
         5: if_acmpne     13
         8: aload_0
         9: aconst_null
        10: invokevirtual #811                // Method setTarget:(Lext/mods/gameserver/model/WorldObject;)V
        13: return
      LineNumberTable:
        line 964: 0
        line 965: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      14     1 object   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 1
        frame_type = 13 /* same */

  public void setPremiumService(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #1065               // Field _premiumService:I
         5: return
      LineNumberTable:
        line 967: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       6     1 premiumService   I

  public int getPremiumService();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #1065               // Field _premiumService:I
         4: ireturn
      LineNumberTable:
        line 968: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void forEachKnownGM(java.util.function.Consumer<ext.mods.gameserver.model.actor.Player>);
    descriptor: (Ljava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: ldc           #99                 // class ext/mods/gameserver/model/actor/Player
         3: invokedynamic #1068,  0           // InvokeDynamic #4:test:()Ljava/util/function/Predicate;
         8: aload_1
         9: invokevirtual #1072               // Method forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
        12: return
      LineNumberTable:
        line 972: 0
        line 973: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      13     1 action   Ljava/util/function/Consumer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      13     1 action   Ljava/util/function/Consumer<Lext/mods/gameserver/model/actor/Player;>;
    Signature: #1485                        // (Ljava/util/function/Consumer<Lext/mods/gameserver/model/actor/Player;>;)V

  public boolean testCursesOnAttack(ext.mods.gameserver.model.actor.Npc, int);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 975: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       2     1   npc   Lext/mods/gameserver/model/actor/Npc;
            0       2     2 npcId   I

  public boolean testCursesOnAttack(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 976: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       2     1   npc   Lext/mods/gameserver/model/actor/Npc;

  public boolean testCursesOnAggro(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 977: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       2     1   npc   Lext/mods/gameserver/model/actor/Npc;

  public boolean testCursesOnSkillSee(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.actor.Creature[]);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 978: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       2     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0       2     2 targets   [Lext/mods/gameserver/model/actor/Creature;

  public void checkCondition(double, double);
    descriptor: (DD)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=5, args_size=3
         0: return
      LineNumberTable:
        line 980: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       1     1 curHp   D
            0       1     3 newHp   D

  public final ext.mods.gameserver.model.actor.template.NpcTemplate getPolymorphTemplate();
    descriptor: ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #1075               // Field _polymorphTemplate:Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: areturn
      LineNumberTable:
        line 982: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean polymorph(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: instanceof    #601                // class ext/mods/gameserver/model/actor/Npc
         4: ifne          16
         7: aload_0
         8: instanceof    #99                 // class ext/mods/gameserver/model/actor/Player
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: invokestatic  #1079               // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
        19: iload_1
        20: invokevirtual #1084               // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
        23: astore_2
        24: aload_2
        25: ifnonnull     30
        28: iconst_0
        29: ireturn
        30: aload_0
        31: aload_2
        32: putfield      #1075               // Field _polymorphTemplate:Lext/mods/gameserver/model/actor/template/NpcTemplate;
        35: aload_0
        36: invokevirtual #158                // Method decayMe:()V
        39: aload_0
        40: invokevirtual #1087               // Method spawnMe:()V
        43: iconst_1
        44: ireturn
      LineNumberTable:
        line 986: 0
        line 987: 16
        line 988: 24
        line 989: 30
        line 990: 35
        line 991: 39
        line 992: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/Creature;
            0      45     1    id   I
           24      21     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate ]

  public void unpolymorph();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aconst_null
         2: putfield      #1075               // Field _polymorphTemplate:Lext/mods/gameserver/model/actor/template/NpcTemplate;
         5: aload_0
         6: invokevirtual #158                // Method decayMe:()V
         9: aload_0
        10: invokevirtual #1087               // Method spawnMe:()V
        13: return
      LineNumberTable:
        line 997: 0
        line 998: 5
        line 999: 9
        line 1000: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean canBeHealed();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #210                // Method isDead:()Z
         4: ifne          18
         7: aload_0
         8: invokevirtual #1090               // Method isInvul:()Z
        11: ifne          18
        14: iconst_1
        15: goto          19
        18: iconst_0
        19: ireturn
      LineNumberTable:
        line 1002: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void forceDecay();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #1093               // Method ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
         3: aload_0
         4: invokevirtual #1098               // Method ext/mods/gameserver/taskmanager/DecayTaskManager.cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
         7: ifeq          14
        10: aload_0
        11: invokevirtual #1101               // Method onDecay:()V
        14: return
      LineNumberTable:
        line 1006: 0
        line 1007: 10
        line 1008: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */

  public void forceSeeCreature();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: instanceof    #1104               // class ext/mods/gameserver/model/actor/Playable
         4: ifne          8
         7: return
         8: aload_0
         9: invokevirtual #1106               // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        12: ifnull        36
        15: aload_0
        16: invokevirtual #1106               // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        19: invokevirtual #1107               // Method ext/mods/gameserver/model/actor/Player.isSpawnProtected:()Z
        22: ifne          35
        25: aload_0
        26: invokevirtual #1106               // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        29: invokevirtual #1110               // Method ext/mods/gameserver/model/actor/Player.isFlying:()Z
        32: ifeq          36
        35: return
        36: aload_0
        37: ldc_w         #601                // class ext/mods/gameserver/model/actor/Npc
        40: aload_0
        41: invokedynamic #1111,  0           // InvokeDynamic #5:test:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Predicate;
        46: aload_0
        47: invokedynamic #1114,  0           // InvokeDynamic #6:accept:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
        52: invokevirtual #1072               // Method forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
        55: return
      LineNumberTable:
        line 1012: 0
        line 1013: 8
        line 1015: 36
        line 1020: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 26 /* same */
        frame_type = 0 /* same */

  public boolean isSilentMoving();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 1022: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void sendIU();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 1023: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Creature;

  public boolean isInBoat();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 1024: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void setIsFlying(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #501                // Field _isFlying:Z
         5: return
      LineNumberTable:
        line 1025: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       6     1  mode   Z

  protected void calculateMission(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=5, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_1
         6: instanceof    #743                // class ext/mods/gameserver/model/actor/Summon
         9: ifeq          22
        12: aload_1
        13: checkcast     #743                // class ext/mods/gameserver/model/actor/Summon
        16: invokevirtual #745                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        19: goto          37
        22: aload_1
        23: instanceof    #99                 // class ext/mods/gameserver/model/actor/Player
        26: ifeq          36
        29: aload_1
        30: checkcast     #99                 // class ext/mods/gameserver/model/actor/Player
        33: goto          37
        36: aconst_null
        37: astore_2
        38: aload_2
        39: ifnull        47
        42: aload_2
        43: aload_0
        44: if_acmpne     48
        47: return
        48: aload_2
        49: invokevirtual #1117               // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
        52: astore_3
        53: aload_0
        54: instanceof    #1121               // class ext/mods/gameserver/model/actor/instance/GrandBoss
        57: ifeq          257
        60: aload_2
        61: invokevirtual #1117               // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
        64: getstatic     #1123               // Field ext/mods/gameserver/enums/actors/MissionType.GRANDBOSS:Lext/mods/gameserver/enums/actors/MissionType;
        67: invokevirtual #1129               // Method ext/mods/gameserver/model/actor/container/player/MissionList.updateParty:(Lext/mods/gameserver/enums/actors/MissionType;)V
        70: aload_0
        71: checkcast     #1121               // class ext/mods/gameserver/model/actor/instance/GrandBoss
        74: astore        4
        76: aload         4
        78: invokevirtual #1135               // Method ext/mods/gameserver/model/actor/instance/GrandBoss.getNpcId:()I
        81: lookupswitch  { // 11

                   29001: 190

                   29006: 200

                   29014: 210

                   29019: 180

                   29020: 230

                   29022: 220

                   29028: 240

                   29047: 250

                   29066: 180

                   29067: 180

                   29068: 180
                 default: 257
            }
       180: aload_3
       181: getstatic     #1136               // Field ext/mods/gameserver/enums/actors/MissionType.ANTHARAS:Lext/mods/gameserver/enums/actors/MissionType;
       184: invokevirtual #1129               // Method ext/mods/gameserver/model/actor/container/player/MissionList.updateParty:(Lext/mods/gameserver/enums/actors/MissionType;)V
       187: goto          257
       190: aload_3
       191: getstatic     #1139               // Field ext/mods/gameserver/enums/actors/MissionType.QUEEN_ANT:Lext/mods/gameserver/enums/actors/MissionType;
       194: invokevirtual #1129               // Method ext/mods/gameserver/model/actor/container/player/MissionList.updateParty:(Lext/mods/gameserver/enums/actors/MissionType;)V
       197: goto          257
       200: aload_3
       201: getstatic     #1142               // Field ext/mods/gameserver/enums/actors/MissionType.CORE:Lext/mods/gameserver/enums/actors/MissionType;
       204: invokevirtual #1129               // Method ext/mods/gameserver/model/actor/container/player/MissionList.updateParty:(Lext/mods/gameserver/enums/actors/MissionType;)V
       207: goto          257
       210: aload_3
       211: getstatic     #1145               // Field ext/mods/gameserver/enums/actors/MissionType.ORFEN:Lext/mods/gameserver/enums/actors/MissionType;
       214: invokevirtual #1129               // Method ext/mods/gameserver/model/actor/container/player/MissionList.updateParty:(Lext/mods/gameserver/enums/actors/MissionType;)V
       217: goto          257
       220: aload_3
       221: getstatic     #1148               // Field ext/mods/gameserver/enums/actors/MissionType.ZAKEN:Lext/mods/gameserver/enums/actors/MissionType;
       224: invokevirtual #1129               // Method ext/mods/gameserver/model/actor/container/player/MissionList.updateParty:(Lext/mods/gameserver/enums/actors/MissionType;)V
       227: goto          257
       230: aload_3
       231: getstatic     #1151               // Field ext/mods/gameserver/enums/actors/MissionType.BAIUM:Lext/mods/gameserver/enums/actors/MissionType;
       234: invokevirtual #1129               // Method ext/mods/gameserver/model/actor/container/player/MissionList.updateParty:(Lext/mods/gameserver/enums/actors/MissionType;)V
       237: goto          257
       240: aload_3
       241: getstatic     #1154               // Field ext/mods/gameserver/enums/actors/MissionType.VALAKAS:Lext/mods/gameserver/enums/actors/MissionType;
       244: invokevirtual #1129               // Method ext/mods/gameserver/model/actor/container/player/MissionList.updateParty:(Lext/mods/gameserver/enums/actors/MissionType;)V
       247: goto          257
       250: aload_3
       251: getstatic     #1157               // Field ext/mods/gameserver/enums/actors/MissionType.HALISHA:Lext/mods/gameserver/enums/actors/MissionType;
       254: invokevirtual #1129               // Method ext/mods/gameserver/model/actor/container/player/MissionList.updateParty:(Lext/mods/gameserver/enums/actors/MissionType;)V
       257: aload_2
       258: invokevirtual #1160               // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       261: invokevirtual #1163               // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       264: aload_0
       265: invokevirtual #338                // Method getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       268: invokevirtual #1019               // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getLevel:()I
       271: isub
       272: bipush        8
       274: if_icmple     278
       277: return
       278: aload_0
       279: instanceof    #1166               // class ext/mods/gameserver/model/actor/instance/RaidBoss
       282: ifeq          295
       285: aload_3
       286: getstatic     #1168               // Field ext/mods/gameserver/enums/actors/MissionType.RAIDBOSS:Lext/mods/gameserver/enums/actors/MissionType;
       289: invokevirtual #1129               // Method ext/mods/gameserver/model/actor/container/player/MissionList.updateParty:(Lext/mods/gameserver/enums/actors/MissionType;)V
       292: goto          373
       295: aload_0
       296: instanceof    #1171               // class ext/mods/gameserver/model/actor/instance/SiegeGuard
       299: ifeq          312
       302: aload_3
       303: getstatic     #1173               // Field ext/mods/gameserver/enums/actors/MissionType.GUARD:Lext/mods/gameserver/enums/actors/MissionType;
       306: invokevirtual #1176               // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       309: goto          373
       312: aload_0
       313: instanceof    #1179               // class ext/mods/gameserver/model/actor/instance/Monster
       316: ifeq          373
       319: aload_0
       320: checkcast     #1179               // class ext/mods/gameserver/model/actor/instance/Monster
       323: astore        4
       325: aload         4
       327: invokevirtual #1181               // Method ext/mods/gameserver/model/actor/instance/Monster.getNpcId:()I
       330: tableswitch   { // 22215 to 22217

                   22215: 356

                   22216: 356

                   22217: 356
                 default: 366
            }
       356: aload_3
       357: getstatic     #1182               // Field ext/mods/gameserver/enums/actors/MissionType.TYRANNOSAURUS:Lext/mods/gameserver/enums/actors/MissionType;
       360: invokevirtual #1176               // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       363: goto          373
       366: aload_3
       367: getstatic     #1185               // Field ext/mods/gameserver/enums/actors/MissionType.MONSTER:Lext/mods/gameserver/enums/actors/MissionType;
       370: invokevirtual #1176               // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       373: return
      LineNumberTable:
        line 1029: 0
        line 1030: 5
        line 1031: 38
        line 1033: 48
        line 1034: 53
        line 1036: 60
        line 1037: 70
        line 1038: 76
        line 1044: 180
        line 1045: 187
        line 1047: 190
        line 1048: 197
        line 1050: 200
        line 1051: 207
        line 1053: 210
        line 1054: 217
        line 1056: 220
        line 1057: 227
        line 1059: 230
        line 1060: 237
        line 1062: 240
        line 1063: 247
        line 1065: 250
        line 1070: 257
        line 1072: 278
        line 1073: 285
        line 1074: 295
        line 1075: 302
        line 1076: 312
        line 1078: 319
        line 1079: 325
        line 1084: 356
        line 1085: 363
        line 1087: 366
        line 1091: 373
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           76     181     4 grandboss   Lext/mods/gameserver/model/actor/instance/GrandBoss;
          325      48     4 monster   Lext/mods/gameserver/model/actor/instance/Monster;
            0     374     0  this   Lext/mods/gameserver/model/actor/Creature;
            0     374     1 killer   Lext/mods/gameserver/model/actor/Creature;
           38     336     2 player   Lext/mods/gameserver/model/actor/Player;
           53     321     3 missions   Lext/mods/gameserver/model/actor/container/player/MissionList;
      StackMapTable: number_of_entries = 21
        frame_type = 5 /* same */
        frame_type = 16 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 131
          locals = [ class ext/mods/gameserver/model/actor/container/player/MissionList, class ext/mods/gameserver/model/actor/instance/GrandBoss ]
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 20 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster ]
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 6

  public boolean getTownZone();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #1188               // Field _townZone:Z
         4: ireturn
      LineNumberTable:
        line 1096: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Creature;

  public void setTownZone(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #1188               // Field _townZone:Z
         5: return
      LineNumberTable:
        line 1102: 0
        line 1103: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Creature;
            0       6     1   val   Z
}
SourceFile: "Creature.java"
BootstrapMethods:
  0: #1559 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1530 (Ljava/lang/Object;)V
      #1531 REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.lambda$broadcastPacket$0:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
      #1534 (Lext/mods/gameserver/model/actor/Player;)V
  1: #1559 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1530 (Ljava/lang/Object;)V
      #1536 REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.lambda$broadcastPacketInRadius$0:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;Lext/mods/gameserver/model/actor/Player;)V
      #1534 (Lext/mods/gameserver/model/actor/Player;)V
  2: #1559 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1539 (Ljava/lang/Object;)Ljava/lang/Object;
      #1540 REF_invokeVirtual ext/mods/gameserver/skills/basefuncs/Func.getStat:()Lext/mods/gameserver/enums/skills/Stats;
      #1541 (Lext/mods/gameserver/skills/basefuncs/Func;)Lext/mods/gameserver/enums/skills/Stats;
  3: #1559 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1530 (Ljava/lang/Object;)V
      #1543 REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.lambda$broadcastModifiedStats$0:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
      #1534 (Lext/mods/gameserver/model/actor/Player;)V
  4: #1559 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1546 (Ljava/lang/Object;)Z
      #1547 REF_invokeVirtual ext/mods/gameserver/model/actor/Player.isGM:()Z
      #1549 (Lext/mods/gameserver/model/actor/Player;)Z
  5: #1559 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1546 (Ljava/lang/Object;)Z
      #1551 REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.lambda$forceSeeCreature$0:(Lext/mods/gameserver/model/actor/Npc;)Z
      #1554 (Lext/mods/gameserver/model/actor/Npc;)Z
  6: #1559 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1530 (Ljava/lang/Object;)V
      #1555 REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.lambda$forceSeeCreature$1:(Lext/mods/gameserver/model/actor/Npc;)V
      #1558 (Lext/mods/gameserver/model/actor/Npc;)V
InnerClasses:
  public static final #1567= #905 of #45; // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static #1570= #1217 of #1568;    // NpcInfo=class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo of class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  public static final #1575= #1571 of #1573; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
