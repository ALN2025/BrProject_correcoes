// Bytecode for: ext.mods.dungeon.Dungeon
// File: ext\mods\dungeon\Dungeon.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dungeon/Dungeon.class
  Last modified 9 de jul de 2026; size 18724 bytes
  MD5 checksum 5faccd4feb3705b5c1731ec70f35729c
  Compiled from "Dungeon.java"
public class ext.mods.dungeon.Dungeon
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/dungeon/Dungeon
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 17, methods: 28, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/dungeon/Dungeon.mobToTemplate:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/dungeon/Dungeon
   #12 = NameAndType        #14:#15       // mobToTemplate:Ljava/util/Map;
   #13 = Utf8               ext/mods/dungeon/Dungeon
   #14 = Utf8               mobToTemplate
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/dungeon/Dungeon.currentStageIndex:I
   #17 = NameAndType        #18:#19       // currentStageIndex:I
   #18 = Utf8               currentStageIndex
   #19 = Utf8               I
   #20 = Fieldref           #11.#21       // ext/mods/dungeon/Dungeon.stagePaused:Z
   #21 = NameAndType        #22:#23       // stagePaused:Z
   #22 = Utf8               stagePaused
   #23 = Utf8               Z
   #24 = Fieldref           #11.#25       // ext/mods/dungeon/Dungeon.stageRemainingMs:J
   #25 = NameAndType        #26:#27       // stageRemainingMs:J
   #26 = Utf8               stageRemainingMs
   #27 = Utf8               J
   #28 = Fieldref           #11.#29       // ext/mods/dungeon/Dungeon.disconnectPauseCount:I
   #29 = NameAndType        #30:#19       // disconnectPauseCount:I
   #30 = Utf8               disconnectPauseCount
   #31 = Fieldref           #11.#32       // ext/mods/dungeon/Dungeon._isEnding:Z
   #32 = NameAndType        #33:#23       // _isEnding:Z
   #33 = Utf8               _isEnding
   #34 = Fieldref           #11.#35       // ext/mods/dungeon/Dungeon.template:Lext/mods/dungeon/DungeonTemplate;
   #35 = NameAndType        #36:#37       // template:Lext/mods/dungeon/DungeonTemplate;
   #36 = Utf8               template
   #37 = Utf8               Lext/mods/dungeon/DungeonTemplate;
   #38 = Fieldref           #11.#39       // ext/mods/dungeon/Dungeon.players:Ljava/util/List;
   #39 = NameAndType        #40:#41       // players:Ljava/util/List;
   #40 = Utf8               players
   #41 = Utf8               Ljava/util/List;
   #42 = Methodref          #43.#44       // ext/mods/InstanceMap/InstanceManager.getInstance:()Lext/mods/InstanceMap/InstanceManager;
   #43 = Class              #45           // ext/mods/InstanceMap/InstanceManager
   #44 = NameAndType        #46:#47       // getInstance:()Lext/mods/InstanceMap/InstanceManager;
   #45 = Utf8               ext/mods/InstanceMap/InstanceManager
   #46 = Utf8               getInstance
   #47 = Utf8               ()Lext/mods/InstanceMap/InstanceManager;
   #48 = Methodref          #43.#49       // ext/mods/InstanceMap/InstanceManager.createInstance:()Lext/mods/InstanceMap/MapInstance;
   #49 = NameAndType        #50:#51       // createInstance:()Lext/mods/InstanceMap/MapInstance;
   #50 = Utf8               createInstance
   #51 = Utf8               ()Lext/mods/InstanceMap/MapInstance;
   #52 = Fieldref           #11.#53       // ext/mods/dungeon/Dungeon.instance:Lext/mods/InstanceMap/MapInstance;
   #53 = NameAndType        #54:#55       // instance:Lext/mods/InstanceMap/MapInstance;
   #54 = Utf8               instance
   #55 = Utf8               Lext/mods/InstanceMap/MapInstance;
   #56 = Methodref          #11.#57       // ext/mods/dungeon/Dungeon.beginTeleport:()V
   #57 = NameAndType        #58:#6        // beginTeleport:()V
   #58 = Utf8               beginTeleport
   #59 = Methodref          #11.#60       // ext/mods/dungeon/Dungeon.getNextStage:()Z
   #60 = NameAndType        #61:#62       // getNextStage:()Z
   #61 = Utf8               getNextStage
   #62 = Utf8               ()Z
   #63 = String             #64           // Failed to load dungeon stage!
   #64 = Utf8               Failed to load dungeon stage!
   #65 = Methodref          #11.#66       // ext/mods/dungeon/Dungeon.broadcastScreenMessage:(Ljava/lang/String;I)V
   #66 = NameAndType        #67:#68       // broadcastScreenMessage:(Ljava/lang/String;I)V
   #67 = Utf8               broadcastScreenMessage
   #68 = Utf8               (Ljava/lang/String;I)V
   #69 = Methodref          #11.#70       // ext/mods/dungeon/Dungeon.cancelDungeon:()V
   #70 = NameAndType        #71:#6        // cancelDungeon:()V
   #71 = Utf8               cancelDungeon
   #72 = InterfaceMethodref #73.#74       // java/util/List.isEmpty:()Z
   #73 = Class              #75           // java/util/List
   #74 = NameAndType        #76:#62       // isEmpty:()Z
   #75 = Utf8               java/util/List
   #76 = Utf8               isEmpty
   #77 = InterfaceMethodref #73.#78       // java/util/List.get:(I)Ljava/lang/Object;
   #78 = NameAndType        #79:#80       // get:(I)Ljava/lang/Object;
   #79 = Utf8               get
   #80 = Utf8               (I)Ljava/lang/Object;
   #81 = Class              #82           // ext/mods/gameserver/model/actor/Player
   #82 = Utf8               ext/mods/gameserver/model/actor/Player
   #83 = InterfaceMethodref #73.#84       // java/util/List.iterator:()Ljava/util/Iterator;
   #84 = NameAndType        #85:#86       // iterator:()Ljava/util/Iterator;
   #85 = Utf8               iterator
   #86 = Utf8               ()Ljava/util/Iterator;
   #87 = InterfaceMethodref #88.#89       // java/util/Iterator.hasNext:()Z
   #88 = Class              #90           // java/util/Iterator
   #89 = NameAndType        #91:#62       // hasNext:()Z
   #90 = Utf8               java/util/Iterator
   #91 = Utf8               hasNext
   #92 = InterfaceMethodref #88.#93       // java/util/Iterator.next:()Ljava/lang/Object;
   #93 = NameAndType        #94:#95       // next:()Ljava/lang/Object;
   #94 = Utf8               next
   #95 = Utf8               ()Ljava/lang/Object;
   #96 = Methodref          #81.#97       // ext/mods/gameserver/model/actor/Player.equals:(Ljava/lang/Object;)Z
   #97 = NameAndType        #98:#99       // equals:(Ljava/lang/Object;)Z
   #98 = Utf8               equals
   #99 = Utf8               (Ljava/lang/Object;)Z
  #100 = Methodref          #81.#101      // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #101 = NameAndType        #102:#103     // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #102 = Utf8               isIn3DRadius
  #103 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #104 = Methodref          #81.#105      // ext/mods/gameserver/model/actor/Player.getX:()I
  #105 = NameAndType        #106:#107     // getX:()I
  #106 = Utf8               getX
  #107 = Utf8               ()I
  #108 = Methodref          #81.#109      // ext/mods/gameserver/model/actor/Player.getY:()I
  #109 = NameAndType        #110:#107     // getY:()I
  #110 = Utf8               getY
  #111 = Methodref          #81.#112      // ext/mods/gameserver/model/actor/Player.getZ:()I
  #112 = NameAndType        #113:#107     // getZ:()I
  #113 = Utf8               getZ
  #114 = Methodref          #81.#115      // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #115 = NameAndType        #116:#117     // teleportTo:(IIII)Z
  #116 = Utf8               teleportTo
  #117 = Utf8               (IIII)Z
  #118 = String             #119          // You have been teleported to your party leader to start the dungeon.
  #119 = Utf8               You have been teleported to your party leader to start the dungeon.
  #120 = Methodref          #81.#121      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #121 = NameAndType        #122:#123     // sendMessage:(Ljava/lang/String;)V
  #122 = Utf8               sendMessage
  #123 = Utf8               (Ljava/lang/String;)V
  #124 = Fieldref           #125.#126     // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
  #125 = Class              #127          // ext/mods/gameserver/enums/ZoneId
  #126 = NameAndType        #128:#129     // PEACE:Lext/mods/gameserver/enums/ZoneId;
  #127 = Utf8               ext/mods/gameserver/enums/ZoneId
  #128 = Utf8               PEACE
  #129 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #130 = Methodref          #81.#131      // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #131 = NameAndType        #132:#133     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #132 = Utf8               isInsideZone
  #133 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #134 = String             #135          // Peace Zone detected. Teleporting directly!
  #135 = Utf8               Peace Zone detected. Teleporting directly!
  #136 = Methodref          #81.#137      // ext/mods/gameserver/model/actor/Player.setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
  #137 = NameAndType        #138:#139     // setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
  #138 = Utf8               setInstanceMap
  #139 = Utf8               (Lext/mods/InstanceMap/MapInstance;Z)V
  #140 = Methodref          #81.#141      // ext/mods/gameserver/model/actor/Player.setDungeon:(Lext/mods/dungeon/Dungeon;)V
  #141 = NameAndType        #142:#143     // setDungeon:(Lext/mods/dungeon/Dungeon;)V
  #142 = Utf8               setDungeon
  #143 = Utf8               (Lext/mods/dungeon/Dungeon;)V
  #144 = Methodref          #11.#145      // ext/mods/dungeon/Dungeon.teleportPlayers:()V
  #145 = NameAndType        #146:#6       // teleportPlayers:()V
  #146 = Utf8               teleportPlayers
  #147 = String             #148          // You will be teleported in a few seconds!
  #148 = Utf8               You will be teleported in a few seconds!
  #149 = Methodref          #150.#151     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #150 = Class              #152          // ext/mods/gameserver/data/SkillTable
  #151 = NameAndType        #46:#153      // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #152 = Utf8               ext/mods/gameserver/data/SkillTable
  #153 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #154 = Methodref          #150.#155     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #155 = NameAndType        #156:#157     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #156 = Utf8               getInfo
  #157 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #158 = Methodref          #81.#159      // ext/mods/gameserver/model/actor/Player.setIsParalyzed:(Z)V
  #159 = NameAndType        #160:#161     // setIsParalyzed:(Z)V
  #160 = Utf8               setIsParalyzed
  #161 = Utf8               (Z)V
  #162 = Class              #163          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #163 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #164 = Methodref          #165.#166     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #165 = Class              #167          // ext/mods/gameserver/skills/L2Skill
  #166 = NameAndType        #168:#107     // getId:()I
  #167 = Utf8               ext/mods/gameserver/skills/L2Skill
  #168 = Utf8               getId
  #169 = Methodref          #165.#170     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #170 = NameAndType        #171:#107     // getLevel:()I
  #171 = Utf8               getLevel
  #172 = Methodref          #162.#173     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #173 = NameAndType        #5:#174       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #174 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #175 = Methodref          #81.#176      // ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #176 = NameAndType        #177:#178     // broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #177 = Utf8               broadcastPacketInRadius
  #178 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #179 = Methodref          #81.#180      // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #180 = NameAndType        #181:#182     // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #181 = Utf8               getCast
  #182 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #183 = Methodref          #184.#185     // ext/mods/gameserver/model/actor/cast/PlayerCast.doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #184 = Class              #186          // ext/mods/gameserver/model/actor/cast/PlayerCast
  #185 = NameAndType        #187:#188     // doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #186 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #187 = Utf8               doCast
  #188 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #189 = InvokeDynamic      #0:#190       // #0:run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #190 = NameAndType        #191:#192     // run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #191 = Utf8               run
  #192 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #193 = Long               10000l
  #195 = Methodref          #196.#197     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #196 = Class              #198          // ext/mods/commons/pool/ThreadPool
  #197 = NameAndType        #199:#200     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #198 = Utf8               ext/mods/commons/pool/ThreadPool
  #199 = Utf8               schedule
  #200 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #201 = InvokeDynamic      #1:#202       // #1:run:(Lext/mods/dungeon/Dungeon;)Ljava/lang/Runnable;
  #202 = NameAndType        #191:#203     // run:(Lext/mods/dungeon/Dungeon;)Ljava/lang/Runnable;
  #203 = Utf8               (Lext/mods/dungeon/Dungeon;)Ljava/lang/Runnable;
  #204 = Fieldref           #11.#205      // ext/mods/dungeon/Dungeon.nextTask:Ljava/util/concurrent/ScheduledFuture;
  #205 = NameAndType        #206:#207     // nextTask:Ljava/util/concurrent/ScheduledFuture;
  #206 = Utf8               nextTask
  #207 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #208 = Methodref          #11.#209      // ext/mods/dungeon/Dungeon.teleToStage:()V
  #209 = NameAndType        #210:#6       // teleToStage:()V
  #210 = Utf8               teleToStage
  #211 = Fieldref           #11.#212      // ext/mods/dungeon/Dungeon.currentStage:Lext/mods/dungeon/holder/StageTemplate;
  #212 = NameAndType        #213:#214     // currentStage:Lext/mods/dungeon/holder/StageTemplate;
  #213 = Utf8               currentStage
  #214 = Utf8               Lext/mods/dungeon/holder/StageTemplate;
  #215 = Fieldref           #216.#217     // ext/mods/dungeon/holder/StageTemplate.order:I
  #216 = Class              #218          // ext/mods/dungeon/holder/StageTemplate
  #217 = NameAndType        #219:#19      // order:I
  #218 = Utf8               ext/mods/dungeon/holder/StageTemplate
  #219 = Utf8               order
  #220 = InvokeDynamic      #2:#221       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #221 = NameAndType        #222:#223     // makeConcatWithConstants:(I)Ljava/lang/String;
  #222 = Utf8               makeConcatWithConstants
  #223 = Utf8               (I)Ljava/lang/String;
  #224 = InvokeDynamic      #3:#202       // #3:run:(Lext/mods/dungeon/Dungeon;)Ljava/lang/Runnable;
  #225 = Methodref          #11.#226      // ext/mods/dungeon/Dungeon.beginStage:()V
  #226 = NameAndType        #227:#6       // beginStage:()V
  #227 = Utf8               beginStage
  #228 = String             #229          // A party member is not present. Re-teleporting...
  #229 = Utf8               A party member is not present. Re-teleporting...
  #230 = Long               5000l
  #232 = Fieldref           #11.#233      // ext/mods/dungeon/Dungeon.currentSpawns:Ljava/util/List;
  #233 = NameAndType        #234:#41      // currentSpawns:Ljava/util/List;
  #234 = Utf8               currentSpawns
  #235 = Class              #236          // ext/mods/dungeon/holder/SpawnTemplate
  #236 = Utf8               ext/mods/dungeon/holder/SpawnTemplate
  #237 = Fieldref           #235.#238     // ext/mods/dungeon/holder/SpawnTemplate.count:I
  #238 = NameAndType        #239:#19      // count:I
  #239 = Utf8               count
  #240 = Methodref          #241.#242     // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #241 = Class              #243          // ext/mods/gameserver/data/xml/NpcData
  #242 = NameAndType        #46:#244      // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #243 = Utf8               ext/mods/gameserver/data/xml/NpcData
  #244 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
  #245 = Fieldref           #235.#246     // ext/mods/dungeon/holder/SpawnTemplate.npcId:I
  #246 = NameAndType        #247:#19      // npcId:I
  #247 = Utf8               npcId
  #248 = Methodref          #241.#249     // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #249 = NameAndType        #250:#251     // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #250 = Utf8               getTemplate
  #251 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #252 = Class              #253          // ext/mods/gameserver/model/spawn/Spawn
  #253 = Utf8               ext/mods/gameserver/model/spawn/Spawn
  #254 = Methodref          #252.#255     // ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #255 = NameAndType        #5:#256       // "<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #256 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #257 = Fieldref           #235.#258     // ext/mods/dungeon/holder/SpawnTemplate.x:I
  #258 = NameAndType        #259:#19      // x:I
  #259 = Utf8               x
  #260 = Fieldref           #235.#261     // ext/mods/dungeon/holder/SpawnTemplate.y:I
  #261 = NameAndType        #262:#19      // y:I
  #262 = Utf8               y
  #263 = Fieldref           #235.#264     // ext/mods/dungeon/holder/SpawnTemplate.z:I
  #264 = NameAndType        #265:#19      // z:I
  #265 = Utf8               z
  #266 = Fieldref           #235.#267     // ext/mods/dungeon/holder/SpawnTemplate.range:I
  #267 = NameAndType        #268:#19      // range:I
  #268 = Utf8               range
  #269 = Methodref          #270.#271     // ext/mods/commons/random/Rnd.nextDouble:()D
  #270 = Class              #272          // ext/mods/commons/random/Rnd
  #271 = NameAndType        #273:#274     // nextDouble:()D
  #272 = Utf8               ext/mods/commons/random/Rnd
  #273 = Utf8               nextDouble
  #274 = Utf8               ()D
  #275 = Double             2.0d
  #277 = Class              #278          // java/lang/Math
  #278 = Utf8               java/lang/Math
  #279 = Double             3.141592653589793d
  #281 = Methodref          #277.#282     // java/lang/Math.cos:(D)D
  #282 = NameAndType        #283:#284     // cos:(D)D
  #283 = Utf8               cos
  #284 = Utf8               (D)D
  #285 = Methodref          #270.#286     // ext/mods/commons/random/Rnd.get:(II)I
  #286 = NameAndType        #79:#287      // get:(II)I
  #287 = Utf8               (II)I
  #288 = Methodref          #277.#289     // java/lang/Math.sin:(D)D
  #289 = NameAndType        #290:#284     // sin:(D)D
  #290 = Utf8               sin
  #291 = Class              #292          // ext/mods/gameserver/model/location/Location
  #292 = Utf8               ext/mods/gameserver/model/location/Location
  #293 = Methodref          #291.#294     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #294 = NameAndType        #5:#295       // "<init>":(III)V
  #295 = Utf8               (III)V
  #296 = Methodref          #291.#105     // ext/mods/gameserver/model/location/Location.getX:()I
  #297 = Methodref          #291.#109     // ext/mods/gameserver/model/location/Location.getY:()I
  #298 = Methodref          #291.#112     // ext/mods/gameserver/model/location/Location.getZ:()I
  #299 = Methodref          #252.#300     // ext/mods/gameserver/model/spawn/Spawn.setLoc:(IIII)V
  #300 = NameAndType        #301:#302     // setLoc:(IIII)V
  #301 = Utf8               setLoc
  #302 = Utf8               (IIII)V
  #303 = Methodref          #252.#304     // ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #304 = NameAndType        #305:#306     // doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #305 = Utf8               doSpawn
  #306 = Utf8               (Z)Lext/mods/gameserver/model/actor/Npc;
  #307 = Methodref          #252.#308     // ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #308 = NameAndType        #309:#310     // getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #309 = Utf8               getNpc
  #310 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #311 = Class              #312          // ext/mods/gameserver/model/actor/instance/Monster
  #312 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #313 = Methodref          #311.#141     // ext/mods/gameserver/model/actor/instance/Monster.setDungeon:(Lext/mods/dungeon/Dungeon;)V
  #314 = Methodref          #315.#137     // ext/mods/gameserver/model/actor/Npc.setInstanceMap:(Lext/mods/InstanceMap/MapInstance;Z)V
  #315 = Class              #316          // ext/mods/gameserver/model/actor/Npc
  #316 = Utf8               ext/mods/gameserver/model/actor/Npc
  #317 = Fieldref           #235.#318     // ext/mods/dungeon/holder/SpawnTemplate.title:Ljava/lang/String;
  #318 = NameAndType        #319:#320     // title:Ljava/lang/String;
  #319 = Utf8               title
  #320 = Utf8               Ljava/lang/String;
  #321 = Methodref          #315.#322     // ext/mods/gameserver/model/actor/Npc.setTitle:(Ljava/lang/String;)V
  #322 = NameAndType        #323:#123     // setTitle:(Ljava/lang/String;)V
  #323 = Utf8               setTitle
  #324 = Methodref          #325.#326     // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #325 = Class              #327          // ext/mods/gameserver/data/manager/SpawnManager
  #326 = NameAndType        #46:#328      // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #327 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
  #328 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
  #329 = Methodref          #325.#330     // ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #330 = NameAndType        #331:#332     // addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #331 = Utf8               addSpawn
  #332 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;)V
  #333 = Class              #334          // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
  #334 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
  #335 = Methodref          #333.#336     // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #336 = NameAndType        #5:#337       // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #337 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #338 = Methodref          #315.#339     // ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #339 = NameAndType        #340:#341     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #340 = Utf8               broadcastPacket
  #341 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #342 = InterfaceMethodref #343.#344     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #343 = Class              #345          // java/util/Map
  #344 = NameAndType        #346:#347     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #345 = Utf8               java/util/Map
  #346 = Utf8               put
  #347 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #348 = Class              #349          // java/lang/Exception
  #349 = Utf8               java/lang/Exception
  #350 = Methodref          #348.#351     // java/lang/Exception.printStackTrace:()V
  #351 = NameAndType        #352:#6       // printStackTrace:()V
  #352 = Utf8               printStackTrace
  #353 = Fieldref           #216.#354     // ext/mods/dungeon/holder/StageTemplate.timeLimit:I
  #354 = NameAndType        #355:#19      // timeLimit:I
  #355 = Utf8               timeLimit
  #356 = InvokeDynamic      #4:#357       // #4:makeConcatWithConstants:(II)Ljava/lang/String;
  #357 = NameAndType        #222:#358     // makeConcatWithConstants:(II)Ljava/lang/String;
  #358 = Utf8               (II)Ljava/lang/String;
  #359 = Methodref          #360.#361     // java/lang/System.currentTimeMillis:()J
  #360 = Class              #362          // java/lang/System
  #361 = NameAndType        #363:#364     // currentTimeMillis:()J
  #362 = Utf8               java/lang/System
  #363 = Utf8               currentTimeMillis
  #364 = Utf8               ()J
  #365 = Fieldref           #11.#366      // ext/mods/dungeon/Dungeon.stageBeginTime:J
  #366 = NameAndType        #367:#27      // stageBeginTime:J
  #367 = Utf8               stageBeginTime
  #368 = Methodref          #11.#369      // ext/mods/dungeon/Dungeon.updatePlayerStage:(I)V
  #369 = NameAndType        #370:#371     // updatePlayerStage:(I)V
  #370 = Utf8               updatePlayerStage
  #371 = Utf8               (I)V
  #372 = InvokeDynamic      #5:#202       // #5:run:(Lext/mods/dungeon/Dungeon;)Ljava/lang/Runnable;
  #373 = Long               1000l
  #375 = Methodref          #196.#376     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #376 = NameAndType        #377:#378     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #377 = Utf8               scheduleAtFixedRate
  #378 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #379 = Fieldref           #11.#380      // ext/mods/dungeon/Dungeon.timerTask:Ljava/util/concurrent/ScheduledFuture;
  #380 = NameAndType        #381:#207     // timerTask:Ljava/util/concurrent/ScheduledFuture;
  #381 = Utf8               timerTask
  #382 = InvokeDynamic      #6:#202       // #6:run:(Lext/mods/dungeon/Dungeon;)Ljava/lang/Runnable;
  #383 = Integer            60000
  #384 = Fieldref           #11.#385      // ext/mods/dungeon/Dungeon.dungeonCancelTask:Ljava/util/concurrent/ScheduledFuture;
  #385 = NameAndType        #386:#207     // dungeonCancelTask:Ljava/util/concurrent/ScheduledFuture;
  #386 = Utf8               dungeonCancelTask
  #387 = InvokeDynamic      #7:#202       // #7:run:(Lext/mods/dungeon/Dungeon;)Ljava/lang/Runnable;
  #388 = Fieldref           #11.#389      // ext/mods/dungeon/Dungeon.monitorTask:Ljava/util/concurrent/ScheduledFuture;
  #389 = NameAndType        #390:#207     // monitorTask:Ljava/util/concurrent/ScheduledFuture;
  #390 = Utf8               monitorTask
  #391 = Methodref          #11.#392      // ext/mods/dungeon/Dungeon.pauseStageTimer:()V
  #392 = NameAndType        #393:#6       // pauseStageTimer:()V
  #393 = Utf8               pauseStageTimer
  #394 = Methodref          #11.#395      // ext/mods/dungeon/Dungeon.resumeStageTimer:()V
  #395 = NameAndType        #396:#6       // resumeStageTimer:()V
  #396 = Utf8               resumeStageTimer
  #397 = Long               60l
  #399 = Methodref          #277.#400     // java/lang/Math.max:(JJ)J
  #400 = NameAndType        #401:#402     // max:(JJ)J
  #401 = Utf8               max
  #402 = Utf8               (JJ)J
  #403 = InterfaceMethodref #404.#405     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #404 = Class              #406          // java/util/concurrent/ScheduledFuture
  #405 = NameAndType        #407:#408     // cancel:(Z)Z
  #406 = Utf8               java/util/concurrent/ScheduledFuture
  #407 = Utf8               cancel
  #408 = Utf8               (Z)Z
  #409 = InterfaceMethodref #73.#410      // java/util/List.size:()I
  #410 = NameAndType        #411:#107     // size:()I
  #411 = Utf8               size
  #412 = Methodref          #81.#413      // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #413 = NameAndType        #414:#415     // getParty:()Lext/mods/gameserver/model/group/Party;
  #414 = Utf8               getParty
  #415 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #416 = String             #417          // The party has been disbanded. The dungeon is being canceled.
  #417 = Utf8               The party has been disbanded. The dungeon is being canceled.
  #418 = Methodref          #81.#419      // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #419 = NameAndType        #420:#62      // isDead:()Z
  #420 = Utf8               isDead
  #421 = InvokeDynamic      #8:#202       // #8:run:(Lext/mods/dungeon/Dungeon;)Ljava/lang/Runnable;
  #422 = Fieldref           #216.#423     // ext/mods/dungeon/holder/StageTemplate.teleport:Z
  #423 = NameAndType        #424:#23      // teleport:Z
  #424 = Utf8               teleport
  #425 = Fieldref           #216.#258     // ext/mods/dungeon/holder/StageTemplate.x:I
  #426 = Fieldref           #216.#261     // ext/mods/dungeon/holder/StageTemplate.y:I
  #427 = Fieldref           #216.#264     // ext/mods/dungeon/holder/StageTemplate.z:I
  #428 = Integer            81664
  #429 = Integer            149056
  #430 = Methodref          #11.#431      // ext/mods/dungeon/Dungeon.cancelScheduledTasks:()V
  #431 = NameAndType        #432:#6       // cancelScheduledTasks:()V
  #432 = Utf8               cancelScheduledTasks
  #433 = InterfaceMethodref #343.#434     // java/util/Map.keySet:()Ljava/util/Set;
  #434 = NameAndType        #435:#436     // keySet:()Ljava/util/Set;
  #435 = Utf8               keySet
  #436 = Utf8               ()Ljava/util/Set;
  #437 = InterfaceMethodref #438.#84      // java/util/Set.iterator:()Ljava/util/Iterator;
  #438 = Class              #439          // java/util/Set
  #439 = Utf8               java/util/Set
  #440 = Class              #441          // ext/mods/gameserver/model/actor/Attackable
  #441 = Utf8               ext/mods/gameserver/model/actor/Attackable
  #442 = Methodref          #11.#443      // ext/mods/dungeon/Dungeon.deleteMob:(Lext/mods/gameserver/model/actor/Attackable;)V
  #443 = NameAndType        #444:#445     // deleteMob:(Lext/mods/gameserver/model/actor/Attackable;)V
  #444 = Utf8               deleteMob
  #445 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;)V
  #446 = String             #447          // You have failed to complete the dungeon.
  #447 = Utf8               You have failed to complete the dungeon.
  #448 = InvokeDynamic      #9:#202       // #9:run:(Lext/mods/dungeon/Dungeon;)Ljava/lang/Runnable;
  #449 = Methodref          #440.#450     // ext/mods/gameserver/model/actor/Attackable.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #450 = NameAndType        #451:#452     // getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #451 = Utf8               getSpawn
  #452 = Utf8               ()Lext/mods/gameserver/model/spawn/ASpawn;
  #453 = Methodref          #454.#455     // ext/mods/gameserver/model/spawn/ASpawn.setRespawnDelay:(I)V
  #454 = Class              #456          // ext/mods/gameserver/model/spawn/ASpawn
  #455 = NameAndType        #457:#371     // setRespawnDelay:(I)V
  #456 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
  #457 = Utf8               setRespawnDelay
  #458 = Methodref          #454.#308     // ext/mods/gameserver/model/spawn/ASpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #459 = Methodref          #315.#460     // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #460 = NameAndType        #461:#6       // deleteMe:()V
  #461 = Utf8               deleteMe
  #462 = Methodref          #325.#463     // ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #463 = NameAndType        #464:#332     // deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #464 = Utf8               deleteSpawn
  #465 = Methodref          #81.#466      // ext/mods/gameserver/model/actor/Player.doRevive:()V
  #466 = NameAndType        #467:#6       // doRevive:()V
  #467 = Utf8               doRevive
  #468 = Methodref          #81.#469      // ext/mods/gameserver/model/actor/Player.broadcastCharInfo:()V
  #469 = NameAndType        #470:#6       // broadcastCharInfo:()V
  #470 = Utf8               broadcastCharInfo
  #471 = Methodref          #81.#472      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #472 = NameAndType        #473:#6       // broadcastUserInfo:()V
  #473 = Utf8               broadcastUserInfo
  #474 = Methodref          #43.#475      // ext/mods/InstanceMap/InstanceManager.getInstance:(I)Lext/mods/InstanceMap/MapInstance;
  #475 = NameAndType        #46:#476      // getInstance:(I)Lext/mods/InstanceMap/MapInstance;
  #476 = Utf8               (I)Lext/mods/InstanceMap/MapInstance;
  #477 = Methodref          #11.#478      // ext/mods/dungeon/Dungeon.cleanupDungeon:()V
  #478 = NameAndType        #479:#6       // cleanupDungeon:()V
  #479 = Utf8               cleanupDungeon
  #480 = Methodref          #481.#166     // ext/mods/InstanceMap/MapInstance.getId:()I
  #481 = Class              #482          // ext/mods/InstanceMap/MapInstance
  #482 = Utf8               ext/mods/InstanceMap/MapInstance
  #483 = Methodref          #43.#484      // ext/mods/InstanceMap/InstanceManager.deleteInstance:(I)V
  #484 = NameAndType        #485:#371     // deleteInstance:(I)V
  #485 = Utf8               deleteInstance
  #486 = Methodref          #487.#488     // ext/mods/dungeon/DungeonManager.getInstance:()Lext/mods/dungeon/DungeonManager;
  #487 = Class              #489          // ext/mods/dungeon/DungeonManager
  #488 = NameAndType        #46:#490      // getInstance:()Lext/mods/dungeon/DungeonManager;
  #489 = Utf8               ext/mods/dungeon/DungeonManager
  #490 = Utf8               ()Lext/mods/dungeon/DungeonManager;
  #491 = Methodref          #487.#492     // ext/mods/dungeon/DungeonManager.removeDungeon:(Lext/mods/dungeon/Dungeon;)V
  #492 = NameAndType        #493:#143     // removeDungeon:(Lext/mods/dungeon/Dungeon;)V
  #493 = Utf8               removeDungeon
  #494 = String             #495          // You have completed the dungeon!
  #495 = Utf8               You have completed the dungeon!
  #496 = Methodref          #11.#497      // ext/mods/dungeon/Dungeon.startReturnCountdown:(I)V
  #497 = NameAndType        #498:#371     // startReturnCountdown:(I)V
  #498 = Utf8               startReturnCountdown
  #499 = Methodref          #11.#500      // ext/mods/dungeon/Dungeon.teleToTown:()V
  #500 = NameAndType        #501:#6       // teleToTown:()V
  #501 = Utf8               teleToTown
  #502 = InvokeDynamic      #10:#221      // #10:makeConcatWithConstants:(I)Ljava/lang/String;
  #503 = Class              #504          // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #504 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #505 = Fieldref           #506.#507     // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS.TOP_CENTER:Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
  #506 = Class              #508          // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS
  #507 = NameAndType        #509:#510     // TOP_CENTER:Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
  #508 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS
  #509 = Utf8               TOP_CENTER
  #510 = Utf8               Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
  #511 = Methodref          #503.#512     // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;ILext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;Z)V
  #512 = NameAndType        #5:#513       // "<init>":(Ljava/lang/String;ILext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;Z)V
  #513 = Utf8               (Ljava/lang/String;ILext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;Z)V
  #514 = Methodref          #81.#515      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #515 = NameAndType        #516:#341     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #516 = Utf8               sendPacket
  #517 = InvokeDynamic      #11:#518      // #11:run:(Lext/mods/dungeon/Dungeon;I)Ljava/lang/Runnable;
  #518 = NameAndType        #191:#519     // run:(Lext/mods/dungeon/Dungeon;I)Ljava/lang/Runnable;
  #519 = Utf8               (Lext/mods/dungeon/Dungeon;I)Ljava/lang/Runnable;
  #520 = Fieldref           #11.#521      // ext/mods/dungeon/Dungeon.countdownTask:Ljava/util/concurrent/ScheduledFuture;
  #521 = NameAndType        #522:#207     // countdownTask:Ljava/util/concurrent/ScheduledFuture;
  #522 = Utf8               countdownTask
  #523 = String             #524          // %02d:%02d
  #524 = Utf8               %02d:%02d
  #525 = Methodref          #526.#527     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #526 = Class              #528          // java/lang/Integer
  #527 = NameAndType        #529:#530     // valueOf:(I)Ljava/lang/Integer;
  #528 = Utf8               java/lang/Integer
  #529 = Utf8               valueOf
  #530 = Utf8               (I)Ljava/lang/Integer;
  #531 = Methodref          #532.#533     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #532 = Class              #534          // java/lang/String
  #533 = NameAndType        #535:#536     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #534 = Utf8               java/lang/String
  #535 = Utf8               format
  #536 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #537 = Fieldref           #506.#538     // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS.BOTTOM_RIGHT:Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
  #538 = NameAndType        #539:#510     // BOTTOM_RIGHT:Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS;
  #539 = Utf8               BOTTOM_RIGHT
  #540 = Fieldref           #541.#542     // ext/mods/dungeon/DungeonTemplate.stages:Ljava/util/List;
  #541 = Class              #543          // ext/mods/dungeon/DungeonTemplate
  #542 = NameAndType        #544:#41      // stages:Ljava/util/List;
  #543 = Utf8               ext/mods/dungeon/DungeonTemplate
  #544 = Utf8               stages
  #545 = Fieldref           #541.#546     // ext/mods/dungeon/DungeonTemplate.spawns:Ljava/util/Map;
  #546 = NameAndType        #547:#15      // spawns:Ljava/util/Map;
  #547 = Utf8               spawns
  #548 = InterfaceMethodref #343.#549     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #549 = NameAndType        #79:#550      // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #550 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #551 = InterfaceMethodref #343.#552     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #552 = NameAndType        #553:#550     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #553 = Utf8               remove
  #554 = Fieldref           #235.#555     // ext/mods/dungeon/holder/SpawnTemplate.drops:Ljava/lang/String;
  #555 = NameAndType        #556:#320     // drops:Ljava/lang/String;
  #556 = Utf8               drops
  #557 = Methodref          #11.#558      // ext/mods/dungeon/Dungeon.parseDrops:(Ljava/lang/String;)Ljava/util/List;
  #558 = NameAndType        #559:#560     // parseDrops:(Ljava/lang/String;)Ljava/util/List;
  #559 = Utf8               parseDrops
  #560 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #561 = Class              #562          // ext/mods/dungeon/Dungeon$DropData
  #562 = Utf8               ext/mods/dungeon/Dungeon$DropData
  #563 = Integer            1000000
  #564 = Methodref          #270.#565     // ext/mods/commons/random/Rnd.get:(I)I
  #565 = NameAndType        #79:#566      // get:(I)I
  #566 = Utf8               (I)I
  #567 = Fieldref           #561.#568     // ext/mods/dungeon/Dungeon$DropData.chance:I
  #568 = NameAndType        #569:#19      // chance:I
  #569 = Utf8               chance
  #570 = Fieldref           #561.#571     // ext/mods/dungeon/Dungeon$DropData.min:I
  #571 = NameAndType        #572:#19      // min:I
  #572 = Utf8               min
  #573 = Fieldref           #561.#574     // ext/mods/dungeon/Dungeon$DropData.max:I
  #574 = NameAndType        #401:#19      // max:I
  #575 = Methodref          #81.#576      // ext/mods/gameserver/model/actor/Player.isInParty:()Z
  #576 = NameAndType        #577:#62      // isInParty:()Z
  #577 = Utf8               isInParty
  #578 = Methodref          #579.#580     // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
  #579 = Class              #581          // ext/mods/gameserver/model/group/Party
  #580 = NameAndType        #582:#583     // getMembers:()Ljava/util/List;
  #581 = Utf8               ext/mods/gameserver/model/group/Party
  #582 = Utf8               getMembers
  #583 = Utf8               ()Ljava/util/List;
  #584 = Fieldref           #561.#585     // ext/mods/dungeon/Dungeon$DropData.itemId:I
  #585 = NameAndType        #586:#19      // itemId:I
  #586 = Utf8               itemId
  #587 = Methodref          #81.#588      // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #588 = NameAndType        #589:#590     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #589 = Utf8               addItem
  #590 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #591 = InterfaceMethodref #343.#74      // java/util/Map.isEmpty:()Z
  #592 = Methodref          #11.#593      // ext/mods/dungeon/Dungeon.advanceToNextStage:()Z
  #593 = NameAndType        #594:#62      // advanceToNextStage:()Z
  #594 = Utf8               advanceToNextStage
  #595 = InvokeDynamic      #12:#221      // #12:makeConcatWithConstants:(I)Ljava/lang/String;
  #596 = InvokeDynamic      #13:#202      // #13:run:(Lext/mods/dungeon/Dungeon;)Ljava/lang/Runnable;
  #597 = Methodref          #11.#598      // ext/mods/dungeon/Dungeon.completeDungeon:()V
  #598 = NameAndType        #599:#6       // completeDungeon:()V
  #599 = Utf8               completeDungeon
  #600 = Class              #601          // java/util/ArrayList
  #601 = Utf8               java/util/ArrayList
  #602 = Methodref          #600.#3       // java/util/ArrayList."<init>":()V
  #603 = Methodref          #532.#74      // java/lang/String.isEmpty:()Z
  #604 = String             #605          // ;
  #605 = Utf8               ;
  #606 = Methodref          #532.#607     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #607 = NameAndType        #608:#609     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #608 = Utf8               split
  #609 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #610 = String             #611          // -
  #611 = Utf8               -
  #612 = Methodref          #526.#613     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #613 = NameAndType        #614:#615     // parseInt:(Ljava/lang/String;)I
  #614 = Utf8               parseInt
  #615 = Utf8               (Ljava/lang/String;)I
  #616 = Methodref          #561.#617     // ext/mods/dungeon/Dungeon$DropData."<init>":(Lext/mods/dungeon/Dungeon;IIII)V
  #617 = NameAndType        #5:#618       // "<init>":(Lext/mods/dungeon/Dungeon;IIII)V
  #618 = Utf8               (Lext/mods/dungeon/Dungeon;IIII)V
  #619 = InterfaceMethodref #73.#620      // java/util/List.add:(Ljava/lang/Object;)Z
  #620 = NameAndType        #621:#99      // add:(Ljava/lang/Object;)Z
  #621 = Utf8               add
  #622 = Fieldref           #541.#623     // ext/mods/dungeon/DungeonTemplate.id:I
  #623 = NameAndType        #624:#19      // id:I
  #624 = Utf8               id
  #625 = Methodref          #81.#626      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #626 = NameAndType        #627:#107     // getObjectId:()I
  #627 = Utf8               getObjectId
  #628 = Methodref          #487.#629     // ext/mods/dungeon/DungeonManager.updateStage:(III)V
  #629 = NameAndType        #630:#295     // updateStage:(III)V
  #630 = Utf8               updateStage
  #631 = Utf8               Signature
  #632 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #633 = Utf8               Ljava/util/Map<Lext/mods/gameserver/model/actor/instance/Monster;Lext/mods/dungeon/holder/SpawnTemplate;>;
  #634 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #635 = Utf8               Ljava/util/List<Lext/mods/dungeon/holder/SpawnTemplate;>;
  #636 = Utf8               (Lext/mods/dungeon/DungeonTemplate;Ljava/util/List;)V
  #637 = Utf8               Code
  #638 = Utf8               LineNumberTable
  #639 = Utf8               LocalVariableTable
  #640 = Utf8               this
  #641 = Utf8               Lext/mods/dungeon/Dungeon;
  #642 = Utf8               LocalVariableTypeTable
  #643 = Utf8               (Lext/mods/dungeon/DungeonTemplate;Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;)V
  #644 = Utf8               member
  #645 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #646 = Utf8               player
  #647 = Utf8               skill
  #648 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #649 = Utf8               initiator
  #650 = Utf8               maxDistance
  #651 = Utf8               StackMapTable
  #652 = Utf8               finalProximityCheck
  #653 = Utf8               allClose
  #654 = Utf8               radius
  #655 = Utf8               angle
  #656 = Utf8               D
  #657 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #658 = Utf8               loc
  #659 = Utf8               Lext/mods/gameserver/model/location/Location;
  #660 = Utf8               e
  #661 = Utf8               Ljava/lang/Exception;
  #662 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #663 = Utf8               i
  #664 = Utf8               spawn
  #665 = Utf8               Lext/mods/dungeon/holder/SpawnTemplate;
  #666 = Class              #667          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #667 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #668 = Utf8               pauseForDisconnect
  #669 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #670 = Utf8               resumeForReconnect
  #671 = Utf8               totalMs
  #672 = Utf8               elapsed
  #673 = Utf8               remaining
  #674 = Utf8               monitorDungeon
  #675 = Utf8               allDead
  #676 = Utf8               mob
  #677 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #678 = Class              #679          // java/lang/Throwable
  #679 = Utf8               java/lang/Throwable
  #680 = Utf8               Lext/mods/gameserver/model/spawn/ASpawn;
  #681 = Utf8               seconds
  #682 = Utf8               msg
  #683 = Utf8               packet
  #684 = Utf8               Lext/mods/gameserver/network/serverpackets/ExShowScreenMessage;
  #685 = Utf8               broadcastTimer
  #686 = Utf8               secondsLeft
  #687 = Utf8               minutes
  #688 = Utf8               stageSpawns
  #689 = Utf8               onMobKill
  #690 = Utf8               amount
  #691 = Utf8               members
  #692 = Utf8               baseAmount
  #693 = Utf8               remainder
  #694 = Utf8               totalAmount
  #695 = Utf8               drop
  #696 = Utf8               Lext/mods/dungeon/Dungeon$DropData;
  #697 = Utf8               attackable
  #698 = Utf8               spawnTemplate
  #699 = Utf8               Ljava/util/List<Lext/mods/dungeon/Dungeon$DropData;>;
  #700 = Utf8               parts
  #701 = Utf8               [Ljava/lang/String;
  #702 = Utf8               entry
  #703 = Utf8               dropString
  #704 = Utf8               entries
  #705 = Class              #701          // "[Ljava/lang/String;"
  #706 = Utf8               (Ljava/lang/String;)Ljava/util/List<Lext/mods/dungeon/Dungeon$DropData;>;
  #707 = Utf8               stage
  #708 = Utf8               getPlayers
  #709 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #710 = Utf8               lambda$startReturnCountdown$0
  #711 = Utf8               lambda$beginTeleport$0
  #712 = Utf8               SourceFile
  #713 = Utf8               Dungeon.java
  #714 = Utf8               NestMembers
  #715 = Utf8               BootstrapMethods
  #716 = MethodType         #6            //  ()V
  #717 = MethodHandle       6:#718        // REF_invokeStatic ext/mods/dungeon/Dungeon.lambda$beginTeleport$0:(Lext/mods/gameserver/model/actor/Player;)V
  #718 = Methodref          #11.#719      // ext/mods/dungeon/Dungeon.lambda$beginTeleport$0:(Lext/mods/gameserver/model/actor/Player;)V
  #719 = NameAndType        #711:#669     // lambda$beginTeleport$0:(Lext/mods/gameserver/model/actor/Player;)V
  #720 = MethodHandle       5:#144        // REF_invokeVirtual ext/mods/dungeon/Dungeon.teleportPlayers:()V
  #721 = String             #722          // Stage \u0001 begins in 10 seconds!
  #722 = Utf8               Stage \u0001 begins in 10 seconds!
  #723 = MethodHandle       5:#724        // REF_invokeVirtual ext/mods/dungeon/Dungeon.finalProximityCheck:()V
  #724 = Methodref          #11.#725      // ext/mods/dungeon/Dungeon.finalProximityCheck:()V
  #725 = NameAndType        #652:#6       // finalProximityCheck:()V
  #726 = String             #727          // You have \u0001 minutes to finish stage \u0001!
  #727 = Utf8               You have \u0001 minutes to finish stage \u0001!
  #728 = MethodHandle       5:#729        // REF_invokeVirtual ext/mods/dungeon/Dungeon.broadcastTimer:()V
  #729 = Methodref          #11.#730      // ext/mods/dungeon/Dungeon.broadcastTimer:()V
  #730 = NameAndType        #685:#6       // broadcastTimer:()V
  #731 = MethodHandle       5:#69         // REF_invokeVirtual ext/mods/dungeon/Dungeon.cancelDungeon:()V
  #732 = MethodHandle       5:#733        // REF_invokeVirtual ext/mods/dungeon/Dungeon.monitorDungeon:()V
  #733 = Methodref          #11.#734      // ext/mods/dungeon/Dungeon.monitorDungeon:()V
  #734 = NameAndType        #674:#6       // monitorDungeon:()V
  #735 = MethodHandle       5:#208        // REF_invokeVirtual ext/mods/dungeon/Dungeon.teleToStage:()V
  #736 = MethodHandle       5:#499        // REF_invokeVirtual ext/mods/dungeon/Dungeon.teleToTown:()V
  #737 = String             #738          // Returning to town in \u0001...
  #738 = Utf8               Returning to town in \u0001...
  #739 = MethodHandle       5:#740        // REF_invokeVirtual ext/mods/dungeon/Dungeon.lambda$startReturnCountdown$0:(I)V
  #740 = Methodref          #11.#741      // ext/mods/dungeon/Dungeon.lambda$startReturnCountdown$0:(I)V
  #741 = NameAndType        #710:#371     // lambda$startReturnCountdown$0:(I)V
  #742 = String             #743          // You have completed stage \u0001! Next stage begins in 10 seconds.
  #743 = Utf8               You have completed stage \u0001! Next stage begins in 10 seconds.
  #744 = MethodHandle       5:#225        // REF_invokeVirtual ext/mods/dungeon/Dungeon.beginStage:()V
  #745 = MethodHandle       6:#746        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #746 = Methodref          #747.#748     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #747 = Class              #749          // java/lang/invoke/LambdaMetafactory
  #748 = NameAndType        #750:#751     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #749 = Utf8               java/lang/invoke/LambdaMetafactory
  #750 = Utf8               metafactory
  #751 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #752 = MethodHandle       6:#753        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #753 = Methodref          #754.#755     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #754 = Class              #756          // java/lang/invoke/StringConcatFactory
  #755 = NameAndType        #222:#757     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #756 = Utf8               java/lang/invoke/StringConcatFactory
  #757 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #758 = Utf8               InnerClasses
  #759 = Class              #760          // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #760 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #761 = Utf8               NpcInfo
  #762 = Utf8               SMPOS
  #763 = Utf8               DropData
  #764 = Class              #765          // java/lang/invoke/MethodHandles$Lookup
  #765 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #766 = Class              #767          // java/lang/invoke/MethodHandles
  #767 = Utf8               java/lang/invoke/MethodHandles
  #768 = Utf8               Lookup
{
  public ext.mods.dungeon.Dungeon(ext.mods.dungeon.DungeonTemplate, java.util.List<ext.mods.gameserver.model.actor.Player>);
    descriptor: (Lext/mods/dungeon/DungeonTemplate;Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field mobToTemplate:Ljava/util/Map;
        15: aload_0
        16: iconst_0
        17: putfield      #16                 // Field currentStageIndex:I
        20: aload_0
        21: iconst_0
        22: putfield      #20                 // Field stagePaused:Z
        25: aload_0
        26: lconst_0
        27: putfield      #24                 // Field stageRemainingMs:J
        30: aload_0
        31: iconst_0
        32: putfield      #28                 // Field disconnectPauseCount:I
        35: aload_0
        36: iconst_0
        37: putfield      #31                 // Field _isEnding:Z
        40: aload_0
        41: aload_1
        42: putfield      #34                 // Field template:Lext/mods/dungeon/DungeonTemplate;
        45: aload_0
        46: aload_2
        47: putfield      #38                 // Field players:Ljava/util/List;
        50: aload_0
        51: invokestatic  #42                 // Method ext/mods/InstanceMap/InstanceManager.getInstance:()Lext/mods/InstanceMap/InstanceManager;
        54: invokevirtual #48                 // Method ext/mods/InstanceMap/InstanceManager.createInstance:()Lext/mods/InstanceMap/MapInstance;
        57: putfield      #52                 // Field instance:Lext/mods/InstanceMap/MapInstance;
        60: aload_0
        61: invokevirtual #56                 // Method beginTeleport:()V
        64: return
      LineNumberTable:
        line 75: 0
        line 56: 4
        line 66: 15
        line 67: 20
        line 68: 25
        line 69: 30
        line 72: 35
        line 76: 40
        line 77: 45
        line 78: 50
        line 79: 60
        line 81: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/dungeon/Dungeon;
            0      65     1 template   Lext/mods/dungeon/DungeonTemplate;
            0      65     2 players   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      65     2 players   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
    Signature: #643                         // (Lext/mods/dungeon/DungeonTemplate;Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;)V

  public synchronized void pauseForDisconnect(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #211                // Field currentStage:Lext/mods/dungeon/holder/StageTemplate;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: dup
        10: getfield      #28                 // Field disconnectPauseCount:I
        13: iconst_1
        14: iadd
        15: putfield      #28                 // Field disconnectPauseCount:I
        18: aload_0
        19: getfield      #28                 // Field disconnectPauseCount:I
        22: iconst_1
        23: if_icmpne     30
        26: aload_0
        27: invokevirtual #391                // Method pauseStageTimer:()V
        30: return
      LineNumberTable:
        line 245: 0
        line 246: 7
        line 248: 8
        line 249: 18
        line 250: 26
        line 251: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/dungeon/Dungeon;
            0      31     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 21 /* same */

  public synchronized void resumeForReconnect(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #211                // Field currentStage:Lext/mods/dungeon/holder/StageTemplate;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #28                 // Field disconnectPauseCount:I
        12: ifle          25
        15: aload_0
        16: dup
        17: getfield      #28                 // Field disconnectPauseCount:I
        20: iconst_1
        21: isub
        22: putfield      #28                 // Field disconnectPauseCount:I
        25: aload_0
        26: getfield      #28                 // Field disconnectPauseCount:I
        29: ifne          36
        32: aload_0
        33: invokevirtual #394                // Method resumeStageTimer:()V
        36: return
      LineNumberTable:
        line 255: 0
        line 256: 7
        line 258: 8
        line 259: 15
        line 261: 25
        line 262: 32
        line 263: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/dungeon/Dungeon;
            0      37     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 16 /* same */
        frame_type = 10 /* same */

  public void cancelDungeon();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: dup
         2: astore_1
         3: monitorenter
         4: aload_0
         5: getfield      #31                 // Field _isEnding:Z
         8: ifeq          14
        11: aload_1
        12: monitorexit
        13: return
        14: aload_0
        15: iconst_1
        16: putfield      #31                 // Field _isEnding:Z
        19: aload_1
        20: monitorexit
        21: goto          29
        24: astore_2
        25: aload_1
        26: monitorexit
        27: aload_2
        28: athrow
        29: aload_0
        30: iconst_0
        31: putfield      #20                 // Field stagePaused:Z
        34: aload_0
        35: lconst_0
        36: putfield      #24                 // Field stageRemainingMs:J
        39: aload_0
        40: iconst_0
        41: putfield      #28                 // Field disconnectPauseCount:I
        44: aload_0
        45: getfield      #38                 // Field players:Ljava/util/List;
        48: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        53: astore_1
        54: aload_1
        55: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        60: ifeq          92
        63: aload_1
        64: invokeinterface #92,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        69: checkcast     #81                 // class ext/mods/gameserver/model/actor/Player
        72: astore_2
        73: aload_2
        74: ldc_w         #428                // int 81664
        77: ldc_w         #429                // int 149056
        80: sipush        -3472
        83: bipush        15
        85: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
        88: pop
        89: goto          54
        92: aload_0
        93: invokevirtual #430                // Method cancelScheduledTasks:()V
        96: aload_0
        97: getfield      #10                 // Field mobToTemplate:Ljava/util/Map;
       100: invokeinterface #433,  1          // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
       105: invokeinterface #437,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       110: astore_1
       111: aload_1
       112: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       117: ifeq          137
       120: aload_1
       121: invokeinterface #92,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       126: checkcast     #440                // class ext/mods/gameserver/model/actor/Attackable
       129: astore_2
       130: aload_2
       131: invokestatic  #442                // Method deleteMob:(Lext/mods/gameserver/model/actor/Attackable;)V
       134: goto          111
       137: aload_0
       138: ldc_w         #446                // String You have failed to complete the dungeon.
       141: iconst_5
       142: invokevirtual #65                 // Method broadcastScreenMessage:(Ljava/lang/String;I)V
       145: aload_0
       146: invokedynamic #448,  0            // InvokeDynamic #9:run:(Lext/mods/dungeon/Dungeon;)Ljava/lang/Runnable;
       151: ldc2_w        #230                // long 5000l
       154: invokestatic  #195                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       157: pop
       158: return
      Exception table:
         from    to  target type
             4    13    24   any
            14    21    24   any
            24    27    24   any
      LineNumberTable:
        line 367: 0
        line 369: 4
        line 370: 11
        line 371: 14
        line 372: 19
        line 374: 29
        line 375: 34
        line 376: 39
        line 378: 44
        line 380: 73
        line 381: 89
        line 383: 92
        line 385: 96
        line 387: 130
        line 388: 134
        line 392: 137
        line 393: 145
        line 394: 158
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           73      16     2 player   Lext/mods/gameserver/model/actor/Player;
          130       4     2   mob   Lext/mods/gameserver/model/actor/Attackable;
            0     159     0  this   Lext/mods/dungeon/Dungeon;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/lang/Object ]
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 37
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 25

  public synchronized void onMobKill(ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=4, locals=16, args_size=2
         0: aload_0
         1: getfield      #10                 // Field mobToTemplate:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #551,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #235                // class ext/mods/dungeon/holder/SpawnTemplate
        13: astore_2
        14: aload_2
        15: ifnonnull     19
        18: return
        19: aload_0
        20: aload_2
        21: getfield      #554                // Field ext/mods/dungeon/holder/SpawnTemplate.drops:Ljava/lang/String;
        24: invokevirtual #557                // Method parseDrops:(Ljava/lang/String;)Ljava/util/List;
        27: astore_3
        28: aload_0
        29: getfield      #38                 // Field players:Ljava/util/List;
        32: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        37: astore        4
        39: aload         4
        41: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        46: ifeq          265
        49: aload         4
        51: invokeinterface #92,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        56: checkcast     #81                 // class ext/mods/gameserver/model/actor/Player
        59: astore        5
        61: aload_3
        62: ifnull        262
        65: aload_3
        66: invokeinterface #72,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        71: ifne          262
        74: aload_3
        75: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        80: astore        6
        82: aload         6
        84: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        89: ifeq          262
        92: aload         6
        94: invokeinterface #92,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        99: checkcast     #561                // class ext/mods/dungeon/Dungeon$DropData
       102: astore        7
       104: ldc_w         #563                // int 1000000
       107: invokestatic  #564                // Method ext/mods/commons/random/Rnd.get:(I)I
       110: aload         7
       112: getfield      #567                // Field ext/mods/dungeon/Dungeon$DropData.chance:I
       115: if_icmpge     259
       118: aload         7
       120: getfield      #570                // Field ext/mods/dungeon/Dungeon$DropData.min:I
       123: aload         7
       125: getfield      #573                // Field ext/mods/dungeon/Dungeon$DropData.max:I
       128: invokestatic  #285                // Method ext/mods/commons/random/Rnd.get:(II)I
       131: istore        8
       133: aload         5
       135: invokevirtual #575                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
       138: ifeq          245
       141: aload         5
       143: invokevirtual #412                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       146: invokevirtual #578                // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       149: astore        9
       151: aload         9
       153: invokeinterface #409,  1          // InterfaceMethod java/util/List.size:()I
       158: istore        10
       160: iload         8
       162: iload         10
       164: idiv
       165: istore        11
       167: iload         8
       169: iload         10
       171: irem
       172: istore        12
       174: aload         9
       176: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       181: astore        13
       183: aload         13
       185: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       190: ifeq          242
       193: aload         13
       195: invokeinterface #92,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       200: checkcast     #81                 // class ext/mods/gameserver/model/actor/Player
       203: astore        14
       205: iload         11
       207: istore        15
       209: iload         12
       211: ifle          220
       214: iinc          15, 1
       217: iinc          12, -1
       220: iload         15
       222: ifle          239
       225: aload         14
       227: aload         7
       229: getfield      #584                // Field ext/mods/dungeon/Dungeon$DropData.itemId:I
       232: iload         15
       234: iconst_1
       235: invokevirtual #587                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       238: pop
       239: goto          183
       242: goto          259
       245: aload         5
       247: aload         7
       249: getfield      #584                // Field ext/mods/dungeon/Dungeon$DropData.itemId:I
       252: iload         8
       254: iconst_1
       255: invokevirtual #587                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       258: pop
       259: goto          82
       262: goto          39
       265: aload_1
       266: invokestatic  #442                // Method deleteMob:(Lext/mods/gameserver/model/actor/Attackable;)V
       269: aload_0
       270: getfield      #10                 // Field mobToTemplate:Ljava/util/Map;
       273: invokeinterface #591,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
       278: ifeq          334
       281: aload_0
       282: invokevirtual #430                // Method cancelScheduledTasks:()V
       285: aload_0
       286: invokevirtual #592                // Method advanceToNextStage:()Z
       289: ifeq          330
       292: aload_0
       293: aload_0
       294: getfield      #211                // Field currentStage:Lext/mods/dungeon/holder/StageTemplate;
       297: getfield      #215                // Field ext/mods/dungeon/holder/StageTemplate.order:I
       300: iconst_1
       301: isub
       302: invokedynamic #595,  0            // InvokeDynamic #12:makeConcatWithConstants:(I)Ljava/lang/String;
       307: iconst_5
       308: invokevirtual #65                 // Method broadcastScreenMessage:(Ljava/lang/String;I)V
       311: aload_0
       312: aload_0
       313: invokedynamic #596,  0            // InvokeDynamic #13:run:(Lext/mods/dungeon/Dungeon;)Ljava/lang/Runnable;
       318: ldc2_w        #193                // long 10000l
       321: invokestatic  #195                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       324: putfield      #204                // Field nextTask:Ljava/util/concurrent/ScheduledFuture;
       327: goto          334
       330: aload_0
       331: invokevirtual #597                // Method completeDungeon:()V
       334: return
      LineNumberTable:
        line 540: 0
        line 541: 14
        line 542: 18
        line 544: 19
        line 546: 28
        line 548: 61
        line 550: 74
        line 552: 104
        line 554: 118
        line 556: 133
        line 558: 141
        line 559: 151
        line 561: 160
        line 562: 167
        line 564: 174
        line 566: 205
        line 567: 209
        line 569: 214
        line 570: 217
        line 573: 220
        line 574: 225
        line 575: 239
        line 576: 242
        line 579: 245
        line 582: 259
        line 584: 262
        line 586: 265
        line 588: 269
        line 590: 281
        line 592: 285
        line 594: 292
        line 595: 311
        line 599: 330
        line 602: 334
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          209      30    15 amount   I
          205      34    14 member   Lext/mods/gameserver/model/actor/Player;
          151      91     9 members   Ljava/util/List;
          160      82    10  size   I
          167      75    11 baseAmount   I
          174      68    12 remainder   I
          133     126     8 totalAmount   I
          104     155     7  drop   Lext/mods/dungeon/Dungeon$DropData;
           61     201     5 player   Lext/mods/gameserver/model/actor/Player;
            0     335     0  this   Lext/mods/dungeon/Dungeon;
            0     335     1 attackable   Lext/mods/gameserver/model/actor/Attackable;
           14     321     2 spawnTemplate   Lext/mods/dungeon/holder/SpawnTemplate;
           28     307     3 drops   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          151      91     9 members   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
           28     307     3 drops   Ljava/util/List<Lext/mods/dungeon/Dungeon$DropData;>;
      StackMapTable: number_of_entries = 13
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/dungeon/holder/SpawnTemplate ]
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 100
          locals = [ class ext/mods/dungeon/Dungeon, class ext/mods/gameserver/model/actor/Attackable, class ext/mods/dungeon/holder/SpawnTemplate, class java/util/List, class java/util/Iterator, class ext/mods/gameserver/model/actor/Player, class java/util/Iterator, class ext/mods/dungeon/Dungeon$DropData, int, class java/util/List, int, int, int, class java/util/Iterator ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 249 /* chop */
          offset_delta = 18
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/dungeon/Dungeon, class ext/mods/gameserver/model/actor/Attackable, class ext/mods/dungeon/holder/SpawnTemplate, class java/util/List, class java/util/Iterator, class ext/mods/gameserver/model/actor/Player, class java/util/Iterator, class ext/mods/dungeon/Dungeon$DropData, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 249 /* chop */
          offset_delta = 13
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 3 /* same */

  public void updatePlayerStage(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: getfield      #38                 // Field players:Ljava/util/List;
         4: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          50
        19: aload_2
        20: invokeinterface #92,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #81                 // class ext/mods/gameserver/model/actor/Player
        28: astore_3
        29: invokestatic  #486                // Method ext/mods/dungeon/DungeonManager.getInstance:()Lext/mods/dungeon/DungeonManager;
        32: aload_0
        33: getfield      #34                 // Field template:Lext/mods/dungeon/DungeonTemplate;
        36: getfield      #622                // Field ext/mods/dungeon/DungeonTemplate.id:I
        39: aload_3
        40: invokevirtual #625                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        43: iload_1
        44: invokevirtual #628                // Method ext/mods/dungeon/DungeonManager.updateStage:(III)V
        47: goto          10
        50: return
      LineNumberTable:
        line 645: 0
        line 647: 29
        line 648: 47
        line 649: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      18     3 player   Lext/mods/gameserver/model/actor/Player;
            0      51     0  this   Lext/mods/dungeon/Dungeon;
            0      51     1 stage   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 39

  public java.util.List<ext.mods.gameserver.model.actor.Player> getPlayers();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field players:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 653: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dungeon/Dungeon;
    Signature: #709                         // ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
}
SourceFile: "Dungeon.java"
NestMembers:
  ext/mods/dungeon/Dungeon$DropData
BootstrapMethods:
  0: #745 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #716 ()V
      #717 REF_invokeStatic ext/mods/dungeon/Dungeon.lambda$beginTeleport$0:(Lext/mods/gameserver/model/actor/Player;)V
      #716 ()V
  1: #745 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #716 ()V
      #720 REF_invokeVirtual ext/mods/dungeon/Dungeon.teleportPlayers:()V
      #716 ()V
  2: #752 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #721 Stage \u0001 begins in 10 seconds!
  3: #745 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #716 ()V
      #723 REF_invokeVirtual ext/mods/dungeon/Dungeon.finalProximityCheck:()V
      #716 ()V
  4: #752 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #726 You have \u0001 minutes to finish stage \u0001!
  5: #745 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #716 ()V
      #728 REF_invokeVirtual ext/mods/dungeon/Dungeon.broadcastTimer:()V
      #716 ()V
  6: #745 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #716 ()V
      #731 REF_invokeVirtual ext/mods/dungeon/Dungeon.cancelDungeon:()V
      #716 ()V
  7: #745 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #716 ()V
      #732 REF_invokeVirtual ext/mods/dungeon/Dungeon.monitorDungeon:()V
      #716 ()V
  8: #745 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #716 ()V
      #735 REF_invokeVirtual ext/mods/dungeon/Dungeon.teleToStage:()V
      #716 ()V
  9: #745 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #716 ()V
      #736 REF_invokeVirtual ext/mods/dungeon/Dungeon.teleToTown:()V
      #716 ()V
  10: #752 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #737 Returning to town in \u0001...
  11: #745 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #716 ()V
      #739 REF_invokeVirtual ext/mods/dungeon/Dungeon.lambda$startReturnCountdown$0:(I)V
      #716 ()V
  12: #752 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #742 You have completed stage \u0001! Next stage begins in 10 seconds.
  13: #745 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #716 ()V
      #744 REF_invokeVirtual ext/mods/dungeon/Dungeon.beginStage:()V
      #716 ()V
InnerClasses:
  public static #761= #333 of #759;       // NpcInfo=class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo of class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  public static final #762= #506 of #503; // SMPOS=class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage$SMPOS of class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  public #763= #561 of #11;               // DropData=class ext/mods/dungeon/Dungeon$DropData of class ext/mods/dungeon/Dungeon
  public static final #768= #764 of #766; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
