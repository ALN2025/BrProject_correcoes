// Bytecode for: ext.mods.gameserver.model.actor.template.NpcTemplate
// File: ext\mods\gameserver\model\actor\template\NpcTemplate.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/template/NpcTemplate.class
  Last modified 9 de jul de 2026; size 15780 bytes
  MD5 checksum b032ead7a24d3af16528606277610e19
  Compiled from "NpcTemplate.java"
public class ext.mods.gameserver.model.actor.template.NpcTemplate extends ext.mods.gameserver.model.actor.template.CreatureTemplate
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #15                         // ext/mods/gameserver/model/actor/template/NpcTemplate
  super_class: #2                         // ext/mods/gameserver/model/actor/template/CreatureTemplate
  interfaces: 0, fields: 42, methods: 51, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/template/CreatureTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/template/CreatureTemplate
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/commons/data/StatSet;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/template/CreatureTemplate
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
    #7 = Class              #8            // java/util/EnumMap
    #8 = Utf8               java/util/EnumMap
    #9 = Class              #10           // ext/mods/gameserver/enums/EventHandler
   #10 = Utf8               ext/mods/gameserver/enums/EventHandler
   #11 = Methodref          #7.#12        // java/util/EnumMap."<init>":(Ljava/lang/Class;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/Class;)V
   #13 = Utf8               (Ljava/lang/Class;)V
   #14 = Fieldref           #15.#16       // ext/mods/gameserver/model/actor/template/NpcTemplate._questEvents:Ljava/util/Map;
   #15 = Class              #17           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #16 = NameAndType        #18:#19       // _questEvents:Ljava/util/Map;
   #17 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #18 = Utf8               _questEvents
   #19 = Utf8               Ljava/util/Map;
   #20 = String             #21           // id
   #21 = Utf8               id
   #22 = Methodref          #23.#24       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #23 = Class              #25           // ext/mods/commons/data/StatSet
   #24 = NameAndType        #26:#27       // getInteger:(Ljava/lang/String;)I
   #25 = Utf8               ext/mods/commons/data/StatSet
   #26 = Utf8               getInteger
   #27 = Utf8               (Ljava/lang/String;)I
   #28 = Fieldref           #15.#29       // ext/mods/gameserver/model/actor/template/NpcTemplate._npcId:I
   #29 = NameAndType        #30:#31       // _npcId:I
   #30 = Utf8               _npcId
   #31 = Utf8               I
   #32 = String             #33           // idTemplate
   #33 = Utf8               idTemplate
   #34 = Methodref          #23.#35       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #35 = NameAndType        #26:#36       // getInteger:(Ljava/lang/String;I)I
   #36 = Utf8               (Ljava/lang/String;I)I
   #37 = Fieldref           #15.#38       // ext/mods/gameserver/model/actor/template/NpcTemplate._idTemplate:I
   #38 = NameAndType        #39:#31       // _idTemplate:I
   #39 = Utf8               _idTemplate
   #40 = String             #41           // name
   #41 = Utf8               name
   #42 = Methodref          #23.#43       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #43 = NameAndType        #44:#45       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #44 = Utf8               getString
   #45 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #46 = Fieldref           #15.#47       // ext/mods/gameserver/model/actor/template/NpcTemplate._name:Ljava/lang/String;
   #47 = NameAndType        #48:#49       // _name:Ljava/lang/String;
   #48 = Utf8               _name
   #49 = Utf8               Ljava/lang/String;
   #50 = String             #51           // title
   #51 = Utf8               title
   #52 = String             #53           //
   #53 = Utf8
   #54 = Methodref          #23.#55       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #55 = NameAndType        #44:#56       // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #56 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #57 = Fieldref           #15.#58       // ext/mods/gameserver/model/actor/template/NpcTemplate._title:Ljava/lang/String;
   #58 = NameAndType        #59:#49       // _title:Ljava/lang/String;
   #59 = Utf8               _title
   #60 = String             #61           // alias
   #61 = Utf8               alias
   #62 = Fieldref           #15.#63       // ext/mods/gameserver/model/actor/template/NpcTemplate._alias:Ljava/lang/String;
   #63 = NameAndType        #64:#49       // _alias:Ljava/lang/String;
   #64 = Utf8               _alias
   #65 = String             #66           // usingServerSideName
   #66 = Utf8               usingServerSideName
   #67 = Methodref          #23.#68       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
   #68 = NameAndType        #69:#70       // getBool:(Ljava/lang/String;Z)Z
   #69 = Utf8               getBool
   #70 = Utf8               (Ljava/lang/String;Z)Z
   #71 = Fieldref           #15.#72       // ext/mods/gameserver/model/actor/template/NpcTemplate._usingServerSideName:Z
   #72 = NameAndType        #73:#74       // _usingServerSideName:Z
   #73 = Utf8               _usingServerSideName
   #74 = Utf8               Z
   #75 = String             #76           // usingServerSideTitle
   #76 = Utf8               usingServerSideTitle
   #77 = Fieldref           #15.#78       // ext/mods/gameserver/model/actor/template/NpcTemplate._usingServerSideTitle:Z
   #78 = NameAndType        #79:#74       // _usingServerSideTitle:Z
   #79 = Utf8               _usingServerSideTitle
   #80 = String             #81           // type
   #81 = Utf8               type
   #82 = Fieldref           #15.#83       // ext/mods/gameserver/model/actor/template/NpcTemplate._type:Ljava/lang/String;
   #83 = NameAndType        #84:#49       // _type:Ljava/lang/String;
   #84 = Utf8               _type
   #85 = String             #86           // level
   #86 = Utf8               level
   #87 = Methodref          #23.#88       // ext/mods/commons/data/StatSet.getByte:(Ljava/lang/String;B)B
   #88 = NameAndType        #89:#90       // getByte:(Ljava/lang/String;B)B
   #89 = Utf8               getByte
   #90 = Utf8               (Ljava/lang/String;B)B
   #91 = Fieldref           #15.#92       // ext/mods/gameserver/model/actor/template/NpcTemplate._level:B
   #92 = NameAndType        #93:#94       // _level:B
   #93 = Utf8               _level
   #94 = Utf8               B
   #95 = String             #96           // hitTimeFactor
   #96 = Utf8               hitTimeFactor
   #97 = Methodref          #23.#98       // ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
   #98 = NameAndType        #99:#100      // getDouble:(Ljava/lang/String;D)D
   #99 = Utf8               getDouble
  #100 = Utf8               (Ljava/lang/String;D)D
  #101 = Fieldref           #15.#102      // ext/mods/gameserver/model/actor/template/NpcTemplate._hitTimeFactor:D
  #102 = NameAndType        #103:#104     // _hitTimeFactor:D
  #103 = Utf8               _hitTimeFactor
  #104 = Utf8               D
  #105 = String             #106          // rHand
  #106 = Utf8               rHand
  #107 = Fieldref           #15.#108      // ext/mods/gameserver/model/actor/template/NpcTemplate._rHand:I
  #108 = NameAndType        #109:#31      // _rHand:I
  #109 = Utf8               _rHand
  #110 = String             #111          // lHand
  #111 = Utf8               lHand
  #112 = Fieldref           #15.#113      // ext/mods/gameserver/model/actor/template/NpcTemplate._lHand:I
  #113 = NameAndType        #114:#31      // _lHand:I
  #114 = Utf8               _lHand
  #115 = String             #116          // exp
  #116 = Utf8               exp
  #117 = Fieldref           #15.#118      // ext/mods/gameserver/model/actor/template/NpcTemplate._exp:D
  #118 = NameAndType        #119:#104     // _exp:D
  #119 = Utf8               _exp
  #120 = String             #121          // sp
  #121 = Utf8               sp
  #122 = Fieldref           #15.#123      // ext/mods/gameserver/model/actor/template/NpcTemplate._sp:D
  #123 = NameAndType        #124:#104     // _sp:D
  #124 = Utf8               _sp
  #125 = String             #126          // baseAttackRange
  #126 = Utf8               baseAttackRange
  #127 = Fieldref           #15.#128      // ext/mods/gameserver/model/actor/template/NpcTemplate._baseAttackRange:I
  #128 = NameAndType        #129:#31      // _baseAttackRange:I
  #129 = Utf8               _baseAttackRange
  #130 = String             #131          // baseDamageRange
  #131 = Utf8               baseDamageRange
  #132 = Methodref          #23.#133      // ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;)[I
  #133 = NameAndType        #134:#135     // getIntegerArray:(Ljava/lang/String;)[I
  #134 = Utf8               getIntegerArray
  #135 = Utf8               (Ljava/lang/String;)[I
  #136 = Fieldref           #15.#137      // ext/mods/gameserver/model/actor/template/NpcTemplate._baseDamageRange:[I
  #137 = NameAndType        #138:#139     // _baseDamageRange:[I
  #138 = Utf8               _baseDamageRange
  #139 = Utf8               [I
  #140 = String             #141          // baseRandomDamage
  #141 = Utf8               baseRandomDamage
  #142 = Fieldref           #15.#143      // ext/mods/gameserver/model/actor/template/NpcTemplate._baseRandomDamage:I
  #143 = NameAndType        #144:#31      // _baseRandomDamage:I
  #144 = Utf8               _baseRandomDamage
  #145 = String             #146          // race
  #146 = Utf8               race
  #147 = Class              #148          // ext/mods/gameserver/enums/actors/NpcRace
  #148 = Utf8               ext/mods/gameserver/enums/actors/NpcRace
  #149 = Fieldref           #147.#150     // ext/mods/gameserver/enums/actors/NpcRace.DUMMY:Lext/mods/gameserver/enums/actors/NpcRace;
  #150 = NameAndType        #151:#152     // DUMMY:Lext/mods/gameserver/enums/actors/NpcRace;
  #151 = Utf8               DUMMY
  #152 = Utf8               Lext/mods/gameserver/enums/actors/NpcRace;
  #153 = Methodref          #23.#154      // ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #154 = NameAndType        #155:#156     // getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #155 = Utf8               getEnum
  #156 = Utf8               (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #157 = Fieldref           #15.#158      // ext/mods/gameserver/model/actor/template/NpcTemplate._race:Lext/mods/gameserver/enums/actors/NpcRace;
  #158 = NameAndType        #159:#152     // _race:Lext/mods/gameserver/enums/actors/NpcRace;
  #159 = Utf8               _race
  #160 = String             #161          // ssCount
  #161 = Utf8               ssCount
  #162 = Fieldref           #15.#163      // ext/mods/gameserver/model/actor/template/NpcTemplate._ssCount:I
  #163 = NameAndType        #164:#31      // _ssCount:I
  #164 = Utf8               _ssCount
  #165 = String             #166          // spsCount
  #166 = Utf8               spsCount
  #167 = Fieldref           #15.#168      // ext/mods/gameserver/model/actor/template/NpcTemplate._spsCount:I
  #168 = NameAndType        #169:#31      // _spsCount:I
  #169 = Utf8               _spsCount
  #170 = String             #171          // undying
  #171 = Utf8               undying
  #172 = Fieldref           #15.#173      // ext/mods/gameserver/model/actor/template/NpcTemplate._isUndying:Z
  #173 = NameAndType        #174:#74      // _isUndying:Z
  #174 = Utf8               _isUndying
  #175 = String             #176          // canBeAttacked
  #176 = Utf8               canBeAttacked
  #177 = Fieldref           #15.#178      // ext/mods/gameserver/model/actor/template/NpcTemplate._canBeAttacked:Z
  #178 = NameAndType        #179:#74      // _canBeAttacked:Z
  #179 = Utf8               _canBeAttacked
  #180 = String             #181          // corpseTime
  #181 = Utf8               corpseTime
  #182 = Fieldref           #15.#183      // ext/mods/gameserver/model/actor/template/NpcTemplate._corpseTime:I
  #183 = NameAndType        #184:#31      // _corpseTime:I
  #184 = Utf8               _corpseTime
  #185 = String             #186          // noSleepMode
  #186 = Utf8               noSleepMode
  #187 = Fieldref           #15.#188      // ext/mods/gameserver/model/actor/template/NpcTemplate._isNoSleepMode:Z
  #188 = NameAndType        #189:#74      // _isNoSleepMode:Z
  #189 = Utf8               _isNoSleepMode
  #190 = String             #191          // aggroRange
  #191 = Utf8               aggroRange
  #192 = Fieldref           #15.#193      // ext/mods/gameserver/model/actor/template/NpcTemplate._aggroRange:I
  #193 = NameAndType        #194:#31      // _aggroRange:I
  #194 = Utf8               _aggroRange
  #195 = String             #196          // aggro
  #196 = Utf8               aggro
  #197 = Fieldref           #15.#198      // ext/mods/gameserver/model/actor/template/NpcTemplate._aggro:Z
  #198 = NameAndType        #199:#74      // _aggro:Z
  #199 = Utf8               _aggro
  #200 = String             #201          // canMove
  #201 = Utf8               canMove
  #202 = Fieldref           #15.#203      // ext/mods/gameserver/model/actor/template/NpcTemplate._canMove:Z
  #203 = NameAndType        #204:#74      // _canMove:Z
  #204 = Utf8               _canMove
  #205 = String             #206          // seedable
  #206 = Utf8               seedable
  #207 = Fieldref           #15.#208      // ext/mods/gameserver/model/actor/template/NpcTemplate._isSeedable:Z
  #208 = NameAndType        #209:#74      // _isSeedable:Z
  #209 = Utf8               _isSeedable
  #210 = String             #211          // canSeeThrough
  #211 = Utf8               canSeeThrough
  #212 = Fieldref           #15.#213      // ext/mods/gameserver/model/actor/template/NpcTemplate._canSeeThrough:Z
  #213 = NameAndType        #214:#74      // _canSeeThrough:Z
  #214 = Utf8               _canSeeThrough
  #215 = String             #216          // Quest Monster
  #216 = Utf8               Quest Monster
  #217 = Methodref          #218.#219     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #218 = Class              #220          // java/lang/String
  #219 = NameAndType        #221:#222     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #220 = Utf8               java/lang/String
  #221 = Utf8               equalsIgnoreCase
  #222 = Utf8               (Ljava/lang/String;)Z
  #223 = String             #224          // Chest
  #224 = Utf8               Chest
  #225 = Methodref          #15.#226      // ext/mods/gameserver/model/actor/template/NpcTemplate.isType:(Ljava/lang/String;)Z
  #226 = NameAndType        #227:#222     // isType:(Ljava/lang/String;)Z
  #227 = Utf8               isType
  #228 = String             #229          // canBeChamp
  #229 = Utf8               canBeChamp
  #230 = Fieldref           #15.#231      // ext/mods/gameserver/model/actor/template/NpcTemplate._cantBeChampionMonster:Z
  #231 = NameAndType        #232:#74      // _cantBeChampionMonster:Z
  #232 = Utf8               _cantBeChampionMonster
  #233 = String             #234          // NoRespawn
  #234 = Utf8               NoRespawn
  #235 = Fieldref           #15.#236      // ext/mods/gameserver/model/actor/template/NpcTemplate._noRespawn:Z
  #236 = NameAndType        #237:#74      // _noRespawn:Z
  #237 = Utf8               _noRespawn
  #238 = String             #239          // aiParams
  #239 = Utf8               aiParams
  #240 = Methodref          #23.#241      // ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
  #241 = NameAndType        #242:#243     // containsKey:(Ljava/lang/Object;)Z
  #242 = Utf8               containsKey
  #243 = Utf8               (Ljava/lang/Object;)Z
  #244 = Class              #245          // ext/mods/gameserver/model/memo/NpcMemo
  #245 = Utf8               ext/mods/gameserver/model/memo/NpcMemo
  #246 = Methodref          #23.#247      // ext/mods/commons/data/StatSet.getMap:(Ljava/lang/String;)Ljava/util/Map;
  #247 = NameAndType        #248:#249     // getMap:(Ljava/lang/String;)Ljava/util/Map;
  #248 = Utf8               getMap
  #249 = Utf8               (Ljava/lang/String;)Ljava/util/Map;
  #250 = Methodref          #244.#251     // ext/mods/gameserver/model/memo/NpcMemo."<init>":(Ljava/util/Map;)V
  #251 = NameAndType        #5:#252       // "<init>":(Ljava/util/Map;)V
  #252 = Utf8               (Ljava/util/Map;)V
  #253 = Fieldref           #244.#254     // ext/mods/gameserver/model/memo/NpcMemo.DUMMY_SET:Lext/mods/gameserver/model/memo/NpcMemo;
  #254 = NameAndType        #255:#256     // DUMMY_SET:Lext/mods/gameserver/model/memo/NpcMemo;
  #255 = Utf8               DUMMY_SET
  #256 = Utf8               Lext/mods/gameserver/model/memo/NpcMemo;
  #257 = Fieldref           #15.#258      // ext/mods/gameserver/model/actor/template/NpcTemplate._aiParams:Lext/mods/gameserver/model/memo/NpcMemo;
  #258 = NameAndType        #259:#256     // _aiParams:Lext/mods/gameserver/model/memo/NpcMemo;
  #259 = Utf8               _aiParams
  #260 = String             #261          // drops
  #261 = Utf8               drops
  #262 = Methodref          #23.#263      // ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
  #263 = NameAndType        #264:#265     // getList:(Ljava/lang/String;)Ljava/util/List;
  #264 = Utf8               getList
  #265 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #266 = Fieldref           #15.#267      // ext/mods/gameserver/model/actor/template/NpcTemplate._categories:Ljava/util/List;
  #267 = NameAndType        #268:#269     // _categories:Ljava/util/List;
  #268 = Utf8               _categories
  #269 = Utf8               Ljava/util/List;
  #270 = String             #271          // privates
  #271 = Utf8               privates
  #272 = Fieldref           #15.#273      // ext/mods/gameserver/model/actor/template/NpcTemplate._privateData:Ljava/util/List;
  #273 = NameAndType        #274:#269     // _privateData:Ljava/util/List;
  #274 = Utf8               _privateData
  #275 = String             #276          // passives
  #276 = Utf8               passives
  #277 = Fieldref           #15.#278      // ext/mods/gameserver/model/actor/template/NpcTemplate._passives:Ljava/util/List;
  #278 = NameAndType        #279:#269     // _passives:Ljava/util/List;
  #279 = Utf8               _passives
  #280 = String             #281          // skills
  #281 = Utf8               skills
  #282 = Fieldref           #15.#283      // ext/mods/gameserver/model/actor/template/NpcTemplate._skills:Ljava/util/Map;
  #283 = NameAndType        #284:#19      // _skills:Ljava/util/Map;
  #284 = Utf8               _skills
  #285 = String             #286          // clan
  #286 = Utf8               clan
  #287 = Methodref          #23.#288      // ext/mods/commons/data/StatSet.getStringArray:(Ljava/lang/String;)[Ljava/lang/String;
  #288 = NameAndType        #289:#290     // getStringArray:(Ljava/lang/String;)[Ljava/lang/String;
  #289 = Utf8               getStringArray
  #290 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #291 = Fieldref           #15.#292      // ext/mods/gameserver/model/actor/template/NpcTemplate._clans:[Ljava/lang/String;
  #292 = NameAndType        #293:#294     // _clans:[Ljava/lang/String;
  #293 = Utf8               _clans
  #294 = Utf8               [Ljava/lang/String;
  #295 = String             #296          // clanRange
  #296 = Utf8               clanRange
  #297 = Fieldref           #15.#298      // ext/mods/gameserver/model/actor/template/NpcTemplate._clanRange:I
  #298 = NameAndType        #299:#31      // _clanRange:I
  #299 = Utf8               _clanRange
  #300 = String             #301          // ignoredIds
  #301 = Utf8               ignoredIds
  #302 = Fieldref           #15.#303      // ext/mods/gameserver/model/actor/template/NpcTemplate._ignoredIds:[I
  #303 = NameAndType        #304:#139     // _ignoredIds:[I
  #304 = Utf8               _ignoredIds
  #305 = String             #306          // teachTo
  #306 = Utf8               teachTo
  #307 = Class              #308          // java/util/ArrayList
  #308 = Utf8               java/util/ArrayList
  #309 = Methodref          #307.#310     // java/util/ArrayList."<init>":(I)V
  #310 = NameAndType        #5:#311       // "<init>":(I)V
  #311 = Utf8               (I)V
  #312 = Fieldref           #15.#313      // ext/mods/gameserver/model/actor/template/NpcTemplate._teachInfo:Ljava/util/List;
  #313 = NameAndType        #314:#269     // _teachInfo:Ljava/util/List;
  #314 = Utf8               _teachInfo
  #315 = Fieldref           #316.#317     // ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #316 = Class              #318          // ext/mods/gameserver/enums/actors/ClassId
  #317 = NameAndType        #319:#320     // VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #318 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #319 = Utf8               VALUES
  #320 = Utf8               [Lext/mods/gameserver/enums/actors/ClassId;
  #321 = InterfaceMethodref #322.#323     // java/util/List.add:(Ljava/lang/Object;)Z
  #322 = Class              #324          // java/util/List
  #323 = NameAndType        #325:#243     // add:(Ljava/lang/Object;)Z
  #324 = Utf8               java/util/List
  #325 = Utf8               add
  #326 = Fieldref           #327.#328     // ext/mods/Config.NPC_STAT_MULTIPLIERS:Z
  #327 = Class              #329          // ext/mods/Config
  #328 = NameAndType        #330:#74      // NPC_STAT_MULTIPLIERS:Z
  #329 = Utf8               ext/mods/Config
  #330 = Utf8               NPC_STAT_MULTIPLIERS
  #331 = Methodref          #218.#332     // java/lang/String.hashCode:()I
  #332 = NameAndType        #333:#334     // hashCode:()I
  #333 = Utf8               hashCode
  #334 = Utf8               ()I
  #335 = String             #336          // Monster
  #336 = Utf8               Monster
  #337 = Methodref          #218.#338     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #338 = NameAndType        #339:#243     // equals:(Ljava/lang/Object;)Z
  #339 = Utf8               equals
  #340 = String             #341          // RaidBoss
  #341 = Utf8               RaidBoss
  #342 = String             #343          // GrandBoss
  #343 = Utf8               GrandBoss
  #344 = Fieldref           #15.#345      // ext/mods/gameserver/model/actor/template/NpcTemplate._baseHpMax:D
  #345 = NameAndType        #346:#104     // _baseHpMax:D
  #346 = Utf8               _baseHpMax
  #347 = Fieldref           #327.#348     // ext/mods/Config.MONSTER_HP_MULTIPLIER:D
  #348 = NameAndType        #349:#104     // MONSTER_HP_MULTIPLIER:D
  #349 = Utf8               MONSTER_HP_MULTIPLIER
  #350 = Fieldref           #15.#351      // ext/mods/gameserver/model/actor/template/NpcTemplate._baseMpMax:D
  #351 = NameAndType        #352:#104     // _baseMpMax:D
  #352 = Utf8               _baseMpMax
  #353 = Fieldref           #327.#354     // ext/mods/Config.MONSTER_MP_MULTIPLIER:D
  #354 = NameAndType        #355:#104     // MONSTER_MP_MULTIPLIER:D
  #355 = Utf8               MONSTER_MP_MULTIPLIER
  #356 = Fieldref           #15.#357      // ext/mods/gameserver/model/actor/template/NpcTemplate._basePAtk:D
  #357 = NameAndType        #358:#104     // _basePAtk:D
  #358 = Utf8               _basePAtk
  #359 = Fieldref           #327.#360     // ext/mods/Config.MONSTER_PATK_MULTIPLIER:D
  #360 = NameAndType        #361:#104     // MONSTER_PATK_MULTIPLIER:D
  #361 = Utf8               MONSTER_PATK_MULTIPLIER
  #362 = Fieldref           #15.#363      // ext/mods/gameserver/model/actor/template/NpcTemplate._baseMAtk:D
  #363 = NameAndType        #364:#104     // _baseMAtk:D
  #364 = Utf8               _baseMAtk
  #365 = Fieldref           #327.#366     // ext/mods/Config.MONSTER_MATK_MULTIPLIER:D
  #366 = NameAndType        #367:#104     // MONSTER_MATK_MULTIPLIER:D
  #367 = Utf8               MONSTER_MATK_MULTIPLIER
  #368 = Fieldref           #15.#369      // ext/mods/gameserver/model/actor/template/NpcTemplate._basePDef:D
  #369 = NameAndType        #370:#104     // _basePDef:D
  #370 = Utf8               _basePDef
  #371 = Fieldref           #327.#372     // ext/mods/Config.MONSTER_PDEF_MULTIPLIER:D
  #372 = NameAndType        #373:#104     // MONSTER_PDEF_MULTIPLIER:D
  #373 = Utf8               MONSTER_PDEF_MULTIPLIER
  #374 = Fieldref           #15.#375      // ext/mods/gameserver/model/actor/template/NpcTemplate._baseMDef:D
  #375 = NameAndType        #376:#104     // _baseMDef:D
  #376 = Utf8               _baseMDef
  #377 = Fieldref           #327.#378     // ext/mods/Config.MONSTER_MDEF_MULTIPLIER:D
  #378 = NameAndType        #379:#104     // MONSTER_MDEF_MULTIPLIER:D
  #379 = Utf8               MONSTER_MDEF_MULTIPLIER
  #380 = Fieldref           #327.#381     // ext/mods/Config.RAIDBOSS_HP_MULTIPLIER:D
  #381 = NameAndType        #382:#104     // RAIDBOSS_HP_MULTIPLIER:D
  #382 = Utf8               RAIDBOSS_HP_MULTIPLIER
  #383 = Fieldref           #327.#384     // ext/mods/Config.RAIDBOSS_MP_MULTIPLIER:D
  #384 = NameAndType        #385:#104     // RAIDBOSS_MP_MULTIPLIER:D
  #385 = Utf8               RAIDBOSS_MP_MULTIPLIER
  #386 = Fieldref           #327.#387     // ext/mods/Config.RAIDBOSS_PATK_MULTIPLIER:D
  #387 = NameAndType        #388:#104     // RAIDBOSS_PATK_MULTIPLIER:D
  #388 = Utf8               RAIDBOSS_PATK_MULTIPLIER
  #389 = Fieldref           #327.#390     // ext/mods/Config.RAIDBOSS_MATK_MULTIPLIER:D
  #390 = NameAndType        #391:#104     // RAIDBOSS_MATK_MULTIPLIER:D
  #391 = Utf8               RAIDBOSS_MATK_MULTIPLIER
  #392 = Fieldref           #327.#393     // ext/mods/Config.RAIDBOSS_PDEF_MULTIPLIER:D
  #393 = NameAndType        #394:#104     // RAIDBOSS_PDEF_MULTIPLIER:D
  #394 = Utf8               RAIDBOSS_PDEF_MULTIPLIER
  #395 = Fieldref           #327.#396     // ext/mods/Config.RAIDBOSS_MDEF_MULTIPLIER:D
  #396 = NameAndType        #397:#104     // RAIDBOSS_MDEF_MULTIPLIER:D
  #397 = Utf8               RAIDBOSS_MDEF_MULTIPLIER
  #398 = Fieldref           #327.#399     // ext/mods/Config.GRANDBOSS_HP_MULTIPLIER:D
  #399 = NameAndType        #400:#104     // GRANDBOSS_HP_MULTIPLIER:D
  #400 = Utf8               GRANDBOSS_HP_MULTIPLIER
  #401 = Fieldref           #327.#402     // ext/mods/Config.GRANDBOSS_MP_MULTIPLIER:D
  #402 = NameAndType        #403:#104     // GRANDBOSS_MP_MULTIPLIER:D
  #403 = Utf8               GRANDBOSS_MP_MULTIPLIER
  #404 = Fieldref           #327.#405     // ext/mods/Config.GRANDBOSS_PATK_MULTIPLIER:D
  #405 = NameAndType        #406:#104     // GRANDBOSS_PATK_MULTIPLIER:D
  #406 = Utf8               GRANDBOSS_PATK_MULTIPLIER
  #407 = Fieldref           #327.#408     // ext/mods/Config.GRANDBOSS_MATK_MULTIPLIER:D
  #408 = NameAndType        #409:#104     // GRANDBOSS_MATK_MULTIPLIER:D
  #409 = Utf8               GRANDBOSS_MATK_MULTIPLIER
  #410 = Fieldref           #327.#411     // ext/mods/Config.GRANDBOSS_PDEF_MULTIPLIER:D
  #411 = NameAndType        #412:#104     // GRANDBOSS_PDEF_MULTIPLIER:D
  #412 = Utf8               GRANDBOSS_PDEF_MULTIPLIER
  #413 = Fieldref           #327.#414     // ext/mods/Config.GRANDBOSS_MDEF_MULTIPLIER:D
  #414 = NameAndType        #415:#104     // GRANDBOSS_MDEF_MULTIPLIER:D
  #415 = Utf8               GRANDBOSS_MDEF_MULTIPLIER
  #416 = Methodref          #417.#418     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #417 = Class              #419          // ext/mods/gameserver/data/manager/CastleManager
  #418 = NameAndType        #420:#421     // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #419 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #420 = Utf8               getInstance
  #421 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #422 = Methodref          #417.#423     // ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
  #423 = NameAndType        #424:#425     // getCastles:()Ljava/util/Collection;
  #424 = Utf8               getCastles
  #425 = Utf8               ()Ljava/util/Collection;
  #426 = InterfaceMethodref #427.#428     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #427 = Class              #429          // java/util/Collection
  #428 = NameAndType        #430:#431     // iterator:()Ljava/util/Iterator;
  #429 = Utf8               java/util/Collection
  #430 = Utf8               iterator
  #431 = Utf8               ()Ljava/util/Iterator;
  #432 = InterfaceMethodref #433.#434     // java/util/Iterator.hasNext:()Z
  #433 = Class              #435          // java/util/Iterator
  #434 = NameAndType        #436:#437     // hasNext:()Z
  #435 = Utf8               java/util/Iterator
  #436 = Utf8               hasNext
  #437 = Utf8               ()Z
  #438 = InterfaceMethodref #433.#439     // java/util/Iterator.next:()Ljava/lang/Object;
  #439 = NameAndType        #440:#441     // next:()Ljava/lang/Object;
  #440 = Utf8               next
  #441 = Utf8               ()Ljava/lang/Object;
  #442 = Class              #443          // ext/mods/gameserver/model/residence/castle/Castle
  #443 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #444 = Methodref          #442.#445     // ext/mods/gameserver/model/residence/castle/Castle.getNpcs:()Ljava/util/List;
  #445 = NameAndType        #446:#447     // getNpcs:()Ljava/util/List;
  #446 = Utf8               getNpcs
  #447 = Utf8               ()Ljava/util/List;
  #448 = Methodref          #449.#450     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #449 = Class              #451          // java/lang/Integer
  #450 = NameAndType        #452:#453     // valueOf:(I)Ljava/lang/Integer;
  #451 = Utf8               java/lang/Integer
  #452 = Utf8               valueOf
  #453 = Utf8               (I)Ljava/lang/Integer;
  #454 = InterfaceMethodref #322.#455     // java/util/List.contains:(Ljava/lang/Object;)Z
  #455 = NameAndType        #456:#243     // contains:(Ljava/lang/Object;)Z
  #456 = Utf8               contains
  #457 = Fieldref           #15.#458      // ext/mods/gameserver/model/actor/template/NpcTemplate._residence:Lext/mods/gameserver/model/residence/Residence;
  #458 = NameAndType        #459:#460     // _residence:Lext/mods/gameserver/model/residence/Residence;
  #459 = Utf8               _residence
  #460 = Utf8               Lext/mods/gameserver/model/residence/Residence;
  #461 = Methodref          #462.#463     // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #462 = Class              #464          // ext/mods/gameserver/data/manager/ClanHallManager
  #463 = NameAndType        #420:#465     // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #464 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
  #465 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
  #466 = Methodref          #462.#467     // ext/mods/gameserver/data/manager/ClanHallManager.getClanHalls:()Ljava/util/Map;
  #467 = NameAndType        #468:#469     // getClanHalls:()Ljava/util/Map;
  #468 = Utf8               getClanHalls
  #469 = Utf8               ()Ljava/util/Map;
  #470 = InterfaceMethodref #471.#472     // java/util/Map.values:()Ljava/util/Collection;
  #471 = Class              #473          // java/util/Map
  #472 = NameAndType        #474:#425     // values:()Ljava/util/Collection;
  #473 = Utf8               java/util/Map
  #474 = Utf8               values
  #475 = Class              #476          // ext/mods/gameserver/model/residence/clanhall/ClanHall
  #476 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
  #477 = Methodref          #475.#445     // ext/mods/gameserver/model/residence/clanhall/ClanHall.getNpcs:()Ljava/util/List;
  #478 = Class              #479          // ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #479 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #480 = Integer            41000
  #481 = Integer            41014
  #482 = Integer            99990
  #483 = Integer            99996
  #484 = InterfaceMethodref #471.#485     // java/util/Map.entrySet:()Ljava/util/Set;
  #485 = NameAndType        #486:#487     // entrySet:()Ljava/util/Set;
  #486 = Utf8               entrySet
  #487 = Utf8               ()Ljava/util/Set;
  #488 = InterfaceMethodref #489.#490     // java/util/Set.stream:()Ljava/util/stream/Stream;
  #489 = Class              #491          // java/util/Set
  #490 = NameAndType        #492:#493     // stream:()Ljava/util/stream/Stream;
  #491 = Utf8               java/util/Set
  #492 = Utf8               stream
  #493 = Utf8               ()Ljava/util/stream/Stream;
  #494 = InvokeDynamic      #0:#495       // #0:test:([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/function/Predicate;
  #495 = NameAndType        #496:#497     // test:([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/function/Predicate;
  #496 = Utf8               test
  #497 = Utf8               ([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/function/Predicate;
  #498 = InterfaceMethodref #499.#500     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #499 = Class              #501          // java/util/stream/Stream
  #500 = NameAndType        #502:#503     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #501 = Utf8               java/util/stream/Stream
  #502 = Utf8               filter
  #503 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #504 = InvokeDynamic      #1:#505       // #1:apply:()Ljava/util/function/Function;
  #505 = NameAndType        #506:#507     // apply:()Ljava/util/function/Function;
  #506 = Utf8               apply
  #507 = Utf8               ()Ljava/util/function/Function;
  #508 = InterfaceMethodref #499.#509     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #509 = NameAndType        #510:#511     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #510 = Utf8               map
  #511 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #512 = InterfaceMethodref #499.#513     // java/util/stream/Stream.toList:()Ljava/util/List;
  #513 = NameAndType        #514:#447     // toList:()Ljava/util/List;
  #514 = Utf8               toList
  #515 = InterfaceMethodref #471.#516     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #516 = NameAndType        #517:#518     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #517 = Utf8               get
  #518 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #519 = Class              #520          // ext/mods/gameserver/skills/L2Skill
  #520 = Utf8               ext/mods/gameserver/skills/L2Skill
  #521 = Methodref          #316.#522     // ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
  #522 = NameAndType        #523:#334     // getLevel:()I
  #523 = Utf8               getLevel
  #524 = Methodref          #316.#525     // ext/mods/gameserver/enums/actors/ClassId.getParent:()Lext/mods/gameserver/enums/actors/ClassId;
  #525 = NameAndType        #526:#527     // getParent:()Lext/mods/gameserver/enums/actors/ClassId;
  #526 = Utf8               getParent
  #527 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #528 = Methodref          #529.#530     // java/util/Collections.emptyList:()Ljava/util/List;
  #529 = Class              #531          // java/util/Collections
  #530 = NameAndType        #532:#447     // emptyList:()Ljava/util/List;
  #531 = Utf8               java/util/Collections
  #532 = Utf8               emptyList
  #533 = InterfaceMethodref #471.#534     // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #534 = NameAndType        #535:#536     // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #535 = Utf8               getOrDefault
  #536 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #537 = InterfaceMethodref #471.#538     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #538 = NameAndType        #539:#536     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #539 = Utf8               put
  #540 = InterfaceMethodref #322.#541     // java/util/List.remove:(Ljava/lang/Object;)Z
  #541 = NameAndType        #542:#243     // remove:(Ljava/lang/Object;)Z
  #542 = Utf8               remove
  #543 = Methodref          #9.#544       // ext/mods/gameserver/enums/EventHandler.isMultipleRegistrationAllowed:()Z
  #544 = NameAndType        #545:#437     // isMultipleRegistrationAllowed:()Z
  #545 = Utf8               isMultipleRegistrationAllowed
  #546 = InterfaceMethodref #322.#547     // java/util/List.isEmpty:()Z
  #547 = NameAndType        #548:#437     // isEmpty:()Z
  #548 = Utf8               isEmpty
  #549 = InterfaceMethodref #550.#551     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #550 = Class              #552          // java/util/Map$Entry
  #551 = NameAndType        #553:#441     // getKey:()Ljava/lang/Object;
  #552 = Utf8               java/util/Map$Entry
  #553 = Utf8               getKey
  #554 = Class              #555          // ext/mods/gameserver/enums/actors/NpcSkillType
  #555 = Utf8               ext/mods/gameserver/enums/actors/NpcSkillType
  #556 = Methodref          #557.#558     // ext/mods/commons/util/ArraysUtil.contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
  #557 = Class              #559          // ext/mods/commons/util/ArraysUtil
  #558 = NameAndType        #456:#560     // contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
  #559 = Utf8               ext/mods/commons/util/ArraysUtil
  #560 = Utf8               ([Ljava/lang/Object;Ljava/lang/Object;)Z
  #561 = Utf8               Signature
  #562 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/DropCategory;>;
  #563 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;
  #564 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #565 = Utf8               Ljava/util/Map<Lext/mods/gameserver/enums/actors/NpcSkillType;Lext/mods/gameserver/skills/L2Skill;>;
  #566 = Utf8               Ljava/util/Map<Lext/mods/gameserver/enums/EventHandler;Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;>;
  #567 = Utf8               Ljava/util/List<Lext/mods/gameserver/enums/actors/ClassId;>;
  #568 = Utf8               Code
  #569 = Utf8               LineNumberTable
  #570 = Utf8               LocalVariableTable
  #571 = Utf8               classId
  #572 = Utf8               classIds
  #573 = Utf8               castle
  #574 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #575 = Utf8               sh
  #576 = Utf8               Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #577 = Utf8               ch
  #578 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #579 = Utf8               this
  #580 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #581 = Utf8               set
  #582 = Utf8               Lext/mods/commons/data/StatSet;
  #583 = Utf8               StackMapTable
  #584 = Class              #139          // "[I"
  #585 = Utf8               isAgathion
  #586 = Utf8               getNpcId
  #587 = Utf8               getIdTemplate
  #588 = Utf8               getName
  #589 = Utf8               ()Ljava/lang/String;
  #590 = Utf8               getTitle
  #591 = Utf8               getAlias
  #592 = Utf8               isUsingServerSideName
  #593 = Utf8               isUsingServerSideTitle
  #594 = Utf8               getType
  #595 = Utf8               ()B
  #596 = Utf8               getHitTimeFactor
  #597 = Utf8               ()D
  #598 = Utf8               getRightHand
  #599 = Utf8               getLeftHand
  #600 = Utf8               getRewardExp
  #601 = Utf8               getRewardSp
  #602 = Utf8               getBaseAttackRange
  #603 = Utf8               getBaseDamageRange
  #604 = Utf8               ()[I
  #605 = Utf8               getBaseRandomDamage
  #606 = Utf8               getRace
  #607 = Utf8               ()Lext/mods/gameserver/enums/actors/NpcRace;
  #608 = Utf8               getClans
  #609 = Utf8               ()[Ljava/lang/String;
  #610 = Utf8               getClanRange
  #611 = Utf8               getIgnoredIds
  #612 = Utf8               getSsCount
  #613 = Utf8               getSpsCount
  #614 = Utf8               isUndying
  #615 = Utf8               getCorpseTime
  #616 = Utf8               isNoSleepMode
  #617 = Utf8               getAggroRange
  #618 = Utf8               getAggro
  #619 = Utf8               isNoRespawn
  #620 = Utf8               isSeedable
  #621 = Utf8               cantBeChampion
  #622 = Utf8               getResidence
  #623 = Utf8               ()Lext/mods/gameserver/model/residence/Residence;
  #624 = Utf8               getAiParams
  #625 = Utf8               ()Lext/mods/gameserver/model/memo/NpcMemo;
  #626 = Utf8               getDropData
  #627 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/item/DropCategory;>;
  #628 = Utf8               addDropData
  #629 = Utf8               (Lext/mods/gameserver/model/item/DropCategory;)V
  #630 = Utf8               category
  #631 = Utf8               Lext/mods/gameserver/model/item/DropCategory;
  #632 = Utf8               getPrivateData
  #633 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;
  #634 = Utf8               getPassives
  #635 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #636 = Utf8               getSkills
  #637 = Utf8               ()Ljava/util/Map<Lext/mods/gameserver/enums/actors/NpcSkillType;Lext/mods/gameserver/skills/L2Skill;>;
  #638 = Utf8               ([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List;
  #639 = Utf8               types
  #640 = Utf8               [Lext/mods/gameserver/enums/actors/NpcSkillType;
  #641 = Utf8               ([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #642 = Utf8               getSkill
  #643 = Utf8               (Lext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #644 = Utf8               Lext/mods/gameserver/enums/actors/NpcSkillType;
  #645 = Utf8               canTeach
  #646 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Z
  #647 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #648 = Utf8               getEventQuests
  #649 = Utf8               ()Ljava/util/Map<Lext/mods/gameserver/enums/EventHandler;Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;>;
  #650 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #651 = Utf8               Lext/mods/gameserver/enums/EventHandler;
  #652 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #653 = Utf8               addQuestEvent
  #654 = Utf8               (Lext/mods/gameserver/enums/EventHandler;Lext/mods/gameserver/scripting/Quest;)V
  #655 = Utf8               quest
  #656 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #657 = Utf8               list
  #658 = Utf8               LocalVariableTypeTable
  #659 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #660 = Utf8               lambda$getSkills$0
  #661 = Utf8               ([Lext/mods/gameserver/enums/actors/NpcSkillType;Ljava/util/Map$Entry;)Z
  #662 = Utf8               s
  #663 = Utf8               Ljava/util/Map$Entry;
  #664 = Utf8               SourceFile
  #665 = Utf8               NpcTemplate.java
  #666 = Utf8               BootstrapMethods
  #667 = MethodType         #243          //  (Ljava/lang/Object;)Z
  #668 = MethodHandle       6:#669        // REF_invokeStatic ext/mods/gameserver/model/actor/template/NpcTemplate.lambda$getSkills$0:([Lext/mods/gameserver/enums/actors/NpcSkillType;Ljava/util/Map$Entry;)Z
  #669 = Methodref          #15.#670      // ext/mods/gameserver/model/actor/template/NpcTemplate.lambda$getSkills$0:([Lext/mods/gameserver/enums/actors/NpcSkillType;Ljava/util/Map$Entry;)Z
  #670 = NameAndType        #660:#661     // lambda$getSkills$0:([Lext/mods/gameserver/enums/actors/NpcSkillType;Ljava/util/Map$Entry;)Z
  #671 = MethodType         #672          //  (Ljava/util/Map$Entry;)Z
  #672 = Utf8               (Ljava/util/Map$Entry;)Z
  #673 = MethodType         #518          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #674 = MethodHandle       9:#675        // REF_invokeInterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #675 = InterfaceMethodref #550.#676     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #676 = NameAndType        #677:#441     // getValue:()Ljava/lang/Object;
  #677 = Utf8               getValue
  #678 = MethodType         #679          //  (Ljava/util/Map$Entry;)Lext/mods/gameserver/skills/L2Skill;
  #679 = Utf8               (Ljava/util/Map$Entry;)Lext/mods/gameserver/skills/L2Skill;
  #680 = MethodHandle       6:#681        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #681 = Methodref          #682.#683     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #682 = Class              #684          // java/lang/invoke/LambdaMetafactory
  #683 = NameAndType        #685:#686     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #684 = Utf8               java/lang/invoke/LambdaMetafactory
  #685 = Utf8               metafactory
  #686 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #687 = Utf8               InnerClasses
  #688 = Utf8               Entry
  #689 = Class              #690          // java/lang/invoke/MethodHandles$Lookup
  #690 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #691 = Class              #692          // java/lang/invoke/MethodHandles
  #692 = Utf8               java/lang/invoke/MethodHandles
  #693 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.template.NpcTemplate(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/template/CreatureTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: new           #7                  // class java/util/EnumMap
         9: dup
        10: ldc           #9                  // class ext/mods/gameserver/enums/EventHandler
        12: invokespecial #11                 // Method java/util/EnumMap."<init>":(Ljava/lang/Class;)V
        15: putfield      #14                 // Field _questEvents:Ljava/util/Map;
        18: aload_0
        19: aload_1
        20: ldc           #20                 // String id
        22: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        25: putfield      #28                 // Field _npcId:I
        28: aload_0
        29: aload_1
        30: ldc           #32                 // String idTemplate
        32: aload_0
        33: getfield      #28                 // Field _npcId:I
        36: invokevirtual #34                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        39: putfield      #37                 // Field _idTemplate:I
        42: aload_0
        43: aload_1
        44: ldc           #40                 // String name
        46: invokevirtual #42                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        49: putfield      #46                 // Field _name:Ljava/lang/String;
        52: aload_0
        53: aload_1
        54: ldc           #50                 // String title
        56: ldc           #52                 // String
        58: invokevirtual #54                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        61: putfield      #57                 // Field _title:Ljava/lang/String;
        64: aload_0
        65: aload_1
        66: ldc           #60                 // String alias
        68: ldc           #52                 // String
        70: invokevirtual #54                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        73: putfield      #62                 // Field _alias:Ljava/lang/String;
        76: aload_0
        77: aload_1
        78: ldc           #65                 // String usingServerSideName
        80: iconst_0
        81: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        84: putfield      #71                 // Field _usingServerSideName:Z
        87: aload_0
        88: aload_1
        89: ldc           #75                 // String usingServerSideTitle
        91: iconst_0
        92: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        95: putfield      #77                 // Field _usingServerSideTitle:Z
        98: aload_0
        99: aload_1
       100: ldc           #80                 // String type
       102: invokevirtual #42                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       105: putfield      #82                 // Field _type:Ljava/lang/String;
       108: aload_0
       109: aload_1
       110: ldc           #85                 // String level
       112: iconst_1
       113: invokevirtual #87                 // Method ext/mods/commons/data/StatSet.getByte:(Ljava/lang/String;B)B
       116: putfield      #91                 // Field _level:B
       119: aload_0
       120: aload_1
       121: ldc           #95                 // String hitTimeFactor
       123: dconst_0
       124: invokevirtual #97                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       127: putfield      #101                // Field _hitTimeFactor:D
       130: aload_0
       131: aload_1
       132: ldc           #105                // String rHand
       134: iconst_0
       135: invokevirtual #34                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       138: putfield      #107                // Field _rHand:I
       141: aload_0
       142: aload_1
       143: ldc           #110                // String lHand
       145: iconst_0
       146: invokevirtual #34                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       149: putfield      #112                // Field _lHand:I
       152: aload_0
       153: aload_1
       154: ldc           #115                // String exp
       156: dconst_0
       157: invokevirtual #97                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       160: putfield      #117                // Field _exp:D
       163: aload_0
       164: aload_1
       165: ldc           #120                // String sp
       167: dconst_0
       168: invokevirtual #97                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;D)D
       171: putfield      #122                // Field _sp:D
       174: aload_0
       175: aload_1
       176: ldc           #125                // String baseAttackRange
       178: iconst_0
       179: invokevirtual #34                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       182: putfield      #127                // Field _baseAttackRange:I
       185: aload_0
       186: aload_1
       187: ldc           #130                // String baseDamageRange
       189: invokevirtual #132                // Method ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;)[I
       192: putfield      #136                // Field _baseDamageRange:[I
       195: aload_0
       196: aload_1
       197: ldc           #140                // String baseRandomDamage
       199: iconst_0
       200: invokevirtual #34                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       203: putfield      #142                // Field _baseRandomDamage:I
       206: aload_0
       207: aload_1
       208: ldc           #145                // String race
       210: ldc           #147                // class ext/mods/gameserver/enums/actors/NpcRace
       212: getstatic     #149                // Field ext/mods/gameserver/enums/actors/NpcRace.DUMMY:Lext/mods/gameserver/enums/actors/NpcRace;
       215: invokevirtual #153                // Method ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
       218: checkcast     #147                // class ext/mods/gameserver/enums/actors/NpcRace
       221: putfield      #157                // Field _race:Lext/mods/gameserver/enums/actors/NpcRace;
       224: aload_0
       225: aload_1
       226: ldc           #160                // String ssCount
       228: iconst_0
       229: invokevirtual #34                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       232: putfield      #162                // Field _ssCount:I
       235: aload_0
       236: aload_1
       237: ldc           #165                // String spsCount
       239: iconst_0
       240: invokevirtual #34                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       243: putfield      #167                // Field _spsCount:I
       246: aload_0
       247: aload_1
       248: ldc           #170                // String undying
       250: iconst_0
       251: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       254: putfield      #172                // Field _isUndying:Z
       257: aload_0
       258: aload_1
       259: ldc           #175                // String canBeAttacked
       261: iconst_1
       262: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       265: putfield      #177                // Field _canBeAttacked:Z
       268: aload_0
       269: aload_1
       270: ldc           #180                // String corpseTime
       272: bipush        7
       274: invokevirtual #34                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       277: putfield      #182                // Field _corpseTime:I
       280: aload_0
       281: aload_1
       282: ldc           #185                // String noSleepMode
       284: iconst_0
       285: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       288: putfield      #187                // Field _isNoSleepMode:Z
       291: aload_0
       292: aload_1
       293: ldc           #190                // String aggroRange
       295: iconst_0
       296: invokevirtual #34                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       299: putfield      #192                // Field _aggroRange:I
       302: aload_0
       303: aload_1
       304: ldc           #195                // String aggro
       306: iconst_0
       307: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       310: putfield      #197                // Field _aggro:Z
       313: aload_0
       314: aload_1
       315: ldc           #200                // String canMove
       317: iconst_1
       318: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       321: putfield      #202                // Field _canMove:Z
       324: aload_0
       325: aload_1
       326: ldc           #205                // String seedable
       328: iconst_0
       329: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       332: putfield      #207                // Field _isSeedable:Z
       335: aload_0
       336: aload_1
       337: ldc           #210                // String canSeeThrough
       339: iconst_0
       340: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       343: putfield      #212                // Field _canSeeThrough:Z
       346: aload_0
       347: aload_0
       348: getfield      #57                 // Field _title:Ljava/lang/String;
       351: ldc           #215                // String Quest Monster
       353: invokevirtual #217                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       356: ifne          378
       359: aload_0
       360: ldc           #223                // String Chest
       362: invokevirtual #225                // Method isType:(Ljava/lang/String;)Z
       365: ifne          378
       368: aload_1
       369: ldc           #228                // String canBeChamp
       371: iconst_1
       372: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       375: ifne          382
       378: iconst_1
       379: goto          383
       382: iconst_0
       383: putfield      #230                // Field _cantBeChampionMonster:Z
       386: aload_0
       387: aload_1
       388: ldc           #233                // String NoRespawn
       390: iconst_0
       391: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       394: putfield      #235                // Field _noRespawn:Z
       397: aload_0
       398: aload_1
       399: ldc           #238                // String aiParams
       401: invokevirtual #240                // Method ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
       404: ifeq          423
       407: new           #244                // class ext/mods/gameserver/model/memo/NpcMemo
       410: dup
       411: aload_1
       412: ldc           #238                // String aiParams
       414: invokevirtual #246                // Method ext/mods/commons/data/StatSet.getMap:(Ljava/lang/String;)Ljava/util/Map;
       417: invokespecial #250                // Method ext/mods/gameserver/model/memo/NpcMemo."<init>":(Ljava/util/Map;)V
       420: goto          426
       423: getstatic     #253                // Field ext/mods/gameserver/model/memo/NpcMemo.DUMMY_SET:Lext/mods/gameserver/model/memo/NpcMemo;
       426: putfield      #257                // Field _aiParams:Lext/mods/gameserver/model/memo/NpcMemo;
       429: aload_0
       430: aload_1
       431: ldc_w         #260                // String drops
       434: invokevirtual #262                // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
       437: putfield      #266                // Field _categories:Ljava/util/List;
       440: aload_0
       441: aload_1
       442: ldc_w         #270                // String privates
       445: invokevirtual #262                // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
       448: putfield      #272                // Field _privateData:Ljava/util/List;
       451: aload_0
       452: aload_1
       453: ldc_w         #275                // String passives
       456: invokevirtual #262                // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
       459: putfield      #277                // Field _passives:Ljava/util/List;
       462: aload_0
       463: aload_1
       464: ldc_w         #280                // String skills
       467: invokevirtual #246                // Method ext/mods/commons/data/StatSet.getMap:(Ljava/lang/String;)Ljava/util/Map;
       470: putfield      #282                // Field _skills:Ljava/util/Map;
       473: aload_1
       474: ldc_w         #285                // String clan
       477: invokevirtual #240                // Method ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
       480: ifeq          526
       483: aload_0
       484: aload_1
       485: ldc_w         #285                // String clan
       488: invokevirtual #287                // Method ext/mods/commons/data/StatSet.getStringArray:(Ljava/lang/String;)[Ljava/lang/String;
       491: putfield      #291                // Field _clans:[Ljava/lang/String;
       494: aload_0
       495: aload_1
       496: ldc_w         #295                // String clanRange
       499: invokevirtual #22                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       502: putfield      #297                // Field _clanRange:I
       505: aload_1
       506: ldc_w         #300                // String ignoredIds
       509: invokevirtual #240                // Method ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
       512: ifeq          526
       515: aload_0
       516: aload_1
       517: ldc_w         #300                // String ignoredIds
       520: invokevirtual #132                // Method ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;)[I
       523: putfield      #302                // Field _ignoredIds:[I
       526: aload_1
       527: ldc_w         #305                // String teachTo
       530: invokevirtual #240                // Method ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
       533: ifeq          601
       536: aload_1
       537: ldc_w         #305                // String teachTo
       540: invokevirtual #132                // Method ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;)[I
       543: astore_2
       544: aload_0
       545: new           #307                // class java/util/ArrayList
       548: dup
       549: aload_2
       550: arraylength
       551: invokespecial #309                // Method java/util/ArrayList."<init>":(I)V
       554: putfield      #312                // Field _teachInfo:Ljava/util/List;
       557: aload_2
       558: astore_3
       559: aload_3
       560: arraylength
       561: istore        4
       563: iconst_0
       564: istore        5
       566: iload         5
       568: iload         4
       570: if_icmpge     601
       573: aload_3
       574: iload         5
       576: iaload
       577: istore        6
       579: aload_0
       580: getfield      #312                // Field _teachInfo:Ljava/util/List;
       583: getstatic     #315                // Field ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
       586: iload         6
       588: aaload
       589: invokeinterface #321,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       594: pop
       595: iinc          5, 1
       598: goto          566
       601: getstatic     #326                // Field ext/mods/Config.NPC_STAT_MULTIPLIERS:Z
       604: ifeq          942
       607: aload_0
       608: getfield      #82                 // Field _type:Ljava/lang/String;
       611: astore_2
       612: iconst_m1
       613: istore_3
       614: aload_2
       615: invokevirtual #331                // Method java/lang/String.hashCode:()I
       618: lookupswitch  { // 3

             -1393696838: 652

               170560055: 667

               768813689: 682
                 default: 694
            }
       652: aload_2
       653: ldc_w         #335                // String Monster
       656: invokevirtual #337                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       659: ifeq          694
       662: iconst_0
       663: istore_3
       664: goto          694
       667: aload_2
       668: ldc_w         #340                // String RaidBoss
       671: invokevirtual #337                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       674: ifeq          694
       677: iconst_1
       678: istore_3
       679: goto          694
       682: aload_2
       683: ldc_w         #342                // String GrandBoss
       686: invokevirtual #337                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       689: ifeq          694
       692: iconst_2
       693: istore_3
       694: iload_3
       695: tableswitch   { // 0 to 2

                       0: 720

                       1: 795

                       2: 870
                 default: 942
            }
       720: aload_0
       721: dup
       722: getfield      #344                // Field _baseHpMax:D
       725: getstatic     #347                // Field ext/mods/Config.MONSTER_HP_MULTIPLIER:D
       728: dmul
       729: putfield      #344                // Field _baseHpMax:D
       732: aload_0
       733: dup
       734: getfield      #350                // Field _baseMpMax:D
       737: getstatic     #353                // Field ext/mods/Config.MONSTER_MP_MULTIPLIER:D
       740: dmul
       741: putfield      #350                // Field _baseMpMax:D
       744: aload_0
       745: dup
       746: getfield      #356                // Field _basePAtk:D
       749: getstatic     #359                // Field ext/mods/Config.MONSTER_PATK_MULTIPLIER:D
       752: dmul
       753: putfield      #356                // Field _basePAtk:D
       756: aload_0
       757: dup
       758: getfield      #362                // Field _baseMAtk:D
       761: getstatic     #365                // Field ext/mods/Config.MONSTER_MATK_MULTIPLIER:D
       764: dmul
       765: putfield      #362                // Field _baseMAtk:D
       768: aload_0
       769: dup
       770: getfield      #368                // Field _basePDef:D
       773: getstatic     #371                // Field ext/mods/Config.MONSTER_PDEF_MULTIPLIER:D
       776: dmul
       777: putfield      #368                // Field _basePDef:D
       780: aload_0
       781: dup
       782: getfield      #374                // Field _baseMDef:D
       785: getstatic     #377                // Field ext/mods/Config.MONSTER_MDEF_MULTIPLIER:D
       788: dmul
       789: putfield      #374                // Field _baseMDef:D
       792: goto          942
       795: aload_0
       796: dup
       797: getfield      #344                // Field _baseHpMax:D
       800: getstatic     #380                // Field ext/mods/Config.RAIDBOSS_HP_MULTIPLIER:D
       803: dmul
       804: putfield      #344                // Field _baseHpMax:D
       807: aload_0
       808: dup
       809: getfield      #350                // Field _baseMpMax:D
       812: getstatic     #383                // Field ext/mods/Config.RAIDBOSS_MP_MULTIPLIER:D
       815: dmul
       816: putfield      #350                // Field _baseMpMax:D
       819: aload_0
       820: dup
       821: getfield      #356                // Field _basePAtk:D
       824: getstatic     #386                // Field ext/mods/Config.RAIDBOSS_PATK_MULTIPLIER:D
       827: dmul
       828: putfield      #356                // Field _basePAtk:D
       831: aload_0
       832: dup
       833: getfield      #362                // Field _baseMAtk:D
       836: getstatic     #389                // Field ext/mods/Config.RAIDBOSS_MATK_MULTIPLIER:D
       839: dmul
       840: putfield      #362                // Field _baseMAtk:D
       843: aload_0
       844: dup
       845: getfield      #368                // Field _basePDef:D
       848: getstatic     #392                // Field ext/mods/Config.RAIDBOSS_PDEF_MULTIPLIER:D
       851: dmul
       852: putfield      #368                // Field _basePDef:D
       855: aload_0
       856: dup
       857: getfield      #374                // Field _baseMDef:D
       860: getstatic     #395                // Field ext/mods/Config.RAIDBOSS_MDEF_MULTIPLIER:D
       863: dmul
       864: putfield      #374                // Field _baseMDef:D
       867: goto          942
       870: aload_0
       871: dup
       872: getfield      #344                // Field _baseHpMax:D
       875: getstatic     #398                // Field ext/mods/Config.GRANDBOSS_HP_MULTIPLIER:D
       878: dmul
       879: putfield      #344                // Field _baseHpMax:D
       882: aload_0
       883: dup
       884: getfield      #350                // Field _baseMpMax:D
       887: getstatic     #401                // Field ext/mods/Config.GRANDBOSS_MP_MULTIPLIER:D
       890: dmul
       891: putfield      #350                // Field _baseMpMax:D
       894: aload_0
       895: dup
       896: getfield      #356                // Field _basePAtk:D
       899: getstatic     #404                // Field ext/mods/Config.GRANDBOSS_PATK_MULTIPLIER:D
       902: dmul
       903: putfield      #356                // Field _basePAtk:D
       906: aload_0
       907: dup
       908: getfield      #362                // Field _baseMAtk:D
       911: getstatic     #407                // Field ext/mods/Config.GRANDBOSS_MATK_MULTIPLIER:D
       914: dmul
       915: putfield      #362                // Field _baseMAtk:D
       918: aload_0
       919: dup
       920: getfield      #368                // Field _basePDef:D
       923: getstatic     #410                // Field ext/mods/Config.GRANDBOSS_PDEF_MULTIPLIER:D
       926: dmul
       927: putfield      #368                // Field _basePDef:D
       930: aload_0
       931: dup
       932: getfield      #374                // Field _baseMDef:D
       935: getstatic     #413                // Field ext/mods/Config.GRANDBOSS_MDEF_MULTIPLIER:D
       938: dmul
       939: putfield      #374                // Field _baseMDef:D
       942: invokestatic  #416                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       945: invokevirtual #422                // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
       948: invokeinterface #426,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       953: astore_2
       954: aload_2
       955: invokeinterface #432,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       960: ifeq          1003
       963: aload_2
       964: invokeinterface #438,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       969: checkcast     #442                // class ext/mods/gameserver/model/residence/castle/Castle
       972: astore_3
       973: aload_3
       974: invokevirtual #444                // Method ext/mods/gameserver/model/residence/castle/Castle.getNpcs:()Ljava/util/List;
       977: aload_0
       978: getfield      #28                 // Field _npcId:I
       981: invokestatic  #448                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       984: invokeinterface #454,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       989: ifeq          1000
       992: aload_0
       993: aload_3
       994: putfield      #457                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
       997: goto          1003
      1000: goto          954
      1003: aload_0
      1004: getfield      #457                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
      1007: ifnonnull     1094
      1010: invokestatic  #461                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1013: invokevirtual #466                // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHalls:()Ljava/util/Map;
      1016: invokeinterface #470,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
      1021: invokeinterface #426,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      1026: astore_2
      1027: aload_2
      1028: invokeinterface #432,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1033: ifeq          1094
      1036: aload_2
      1037: invokeinterface #438,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1042: checkcast     #475                // class ext/mods/gameserver/model/residence/clanhall/ClanHall
      1045: astore_3
      1046: aload_3
      1047: invokevirtual #477                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getNpcs:()Ljava/util/List;
      1050: aload_0
      1051: getfield      #28                 // Field _npcId:I
      1054: invokestatic  #448                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1057: invokeinterface #454,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
      1062: ifeq          1091
      1065: aload_0
      1066: aload_3
      1067: instanceof    #478                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
      1070: ifeq          1084
      1073: aload_3
      1074: checkcast     #478                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
      1077: astore        4
      1079: aload         4
      1081: goto          1085
      1084: aload_3
      1085: putfield      #457                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
      1088: goto          1094
      1091: goto          1027
      1094: return
      LineNumberTable:
        line 107: 0
        line 95: 5
        line 109: 18
        line 110: 28
        line 112: 42
        line 113: 52
        line 114: 64
        line 116: 76
        line 117: 87
        line 119: 98
        line 120: 108
        line 121: 119
        line 122: 130
        line 123: 141
        line 124: 152
        line 125: 163
        line 127: 174
        line 128: 185
        line 129: 195
        line 131: 206
        line 133: 224
        line 134: 235
        line 136: 246
        line 137: 257
        line 138: 268
        line 139: 280
        line 140: 291
        line 141: 302
        line 142: 313
        line 143: 324
        line 144: 335
        line 146: 346
        line 147: 386
        line 149: 397
        line 150: 429
        line 151: 440
        line 153: 451
        line 154: 462
        line 156: 473
        line 158: 483
        line 159: 494
        line 161: 505
        line 162: 515
        line 165: 526
        line 167: 536
        line 169: 544
        line 170: 557
        line 171: 579
        line 170: 595
        line 174: 601
        line 176: 607
        line 179: 720
        line 180: 732
        line 181: 744
        line 182: 756
        line 183: 768
        line 184: 780
        line 185: 792
        line 187: 795
        line 188: 807
        line 189: 819
        line 190: 831
        line 191: 843
        line 192: 855
        line 193: 867
        line 195: 870
        line 196: 882
        line 197: 894
        line 198: 906
        line 199: 918
        line 200: 930
        line 205: 942
        line 207: 973
        line 209: 992
        line 210: 997
        line 212: 1000
        line 214: 1003
        line 216: 1010
        line 218: 1046
        line 220: 1065
        line 221: 1088
        line 223: 1091
        line 225: 1094
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          579      16     6 classId   I
          544      57     2 classIds   [I
          973      27     3 castle   Lext/mods/gameserver/model/residence/castle/Castle;
         1079       5     4    sh   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
         1046      45     3    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
            0    1095     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0    1095     1   set   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 24
        frame_type = 255 /* full_frame */
          offset_delta = 378
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/commons/data/StatSet ]
          stack = [ class ext/mods/gameserver/model/actor/template/NpcTemplate ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/template/NpcTemplate ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/commons/data/StatSet ]
          stack = [ class ext/mods/gameserver/model/actor/template/NpcTemplate, int ]
        frame_type = 103 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/template/NpcTemplate ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/commons/data/StatSet ]
          stack = [ class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/model/memo/NpcMemo ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 99
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/commons/data/StatSet, class "[I", class "[I", int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/commons/data/StatSet ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 50
          locals = [ class java/lang/String, int ]
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 11 /* same */
        frame_type = 25 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 249 /* chop */
          offset_delta = 71
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 45 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/commons/data/StatSet, class java/util/Iterator, class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
          stack = [ class ext/mods/gameserver/model/actor/template/NpcTemplate ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/commons/data/StatSet, class java/util/Iterator, class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
          stack = [ class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean isAgathion();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _npcId:I
         4: istore_1
         5: iload_1
         6: ldc_w         #480                // int 41000
         9: if_icmplt     19
        12: iload_1
        13: ldc_w         #481                // int 41014
        16: if_icmple     47
        19: iload_1
        20: ldc_w         #482                // int 99990
        23: if_icmplt     33
        26: iload_1
        27: ldc_w         #483                // int 99996
        30: if_icmple     47
        33: iload_1
        34: sipush        27000
        37: if_icmplt     51
        40: iload_1
        41: sipush        28000
        44: if_icmpge     51
        47: iconst_1
        48: goto          52
        51: iconst_0
        52: ireturn
      LineNumberTable:
        line 229: 0
        line 230: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            5      48     1    id   I
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ int ]
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getNpcId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _npcId:I
         4: ireturn
      LineNumberTable:
        line 235: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public int getIdTemplate();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _idTemplate:I
         4: ireturn
      LineNumberTable:
        line 240: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 245: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public java.lang.String getTitle();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #57                 // Field _title:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 250: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public java.lang.String getAlias();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #62                 // Field _alias:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 255: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isUsingServerSideName();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #71                 // Field _usingServerSideName:Z
         4: ireturn
      LineNumberTable:
        line 260: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isUsingServerSideTitle();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #77                 // Field _usingServerSideTitle:Z
         4: ireturn
      LineNumberTable:
        line 265: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public java.lang.String getType();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #82                 // Field _type:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 270: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isType(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #82                 // Field _type:Ljava/lang/String;
         4: aload_1
         5: invokevirtual #217                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
         8: ireturn
      LineNumberTable:
        line 279: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0       9     1  type   Ljava/lang/String;

  public byte getLevel();
    descriptor: ()B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #91                 // Field _level:B
         4: ireturn
      LineNumberTable:
        line 284: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public double getHitTimeFactor();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #101                // Field _hitTimeFactor:D
         4: dreturn
      LineNumberTable:
        line 289: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public int getRightHand();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #107                // Field _rHand:I
         4: ireturn
      LineNumberTable:
        line 294: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public int getLeftHand();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #112                // Field _lHand:I
         4: ireturn
      LineNumberTable:
        line 299: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public double getRewardExp();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #117                // Field _exp:D
         4: dreturn
      LineNumberTable:
        line 304: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public double getRewardSp();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #122                // Field _sp:D
         4: dreturn
      LineNumberTable:
        line 309: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public int getBaseAttackRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #127                // Field _baseAttackRange:I
         4: ireturn
      LineNumberTable:
        line 314: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public int[] getBaseDamageRange();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #136                // Field _baseDamageRange:[I
         4: areturn
      LineNumberTable:
        line 319: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public int getBaseRandomDamage();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #142                // Field _baseRandomDamage:I
         4: ireturn
      LineNumberTable:
        line 324: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public ext.mods.gameserver.enums.actors.NpcRace getRace();
    descriptor: ()Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #157                // Field _race:Lext/mods/gameserver/enums/actors/NpcRace;
         4: areturn
      LineNumberTable:
        line 329: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public java.lang.String[] getClans();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #291                // Field _clans:[Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 334: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public int getClanRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #297                // Field _clanRange:I
         4: ireturn
      LineNumberTable:
        line 339: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public int[] getIgnoredIds();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #302                // Field _ignoredIds:[I
         4: areturn
      LineNumberTable:
        line 344: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public int getSsCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #162                // Field _ssCount:I
         4: ireturn
      LineNumberTable:
        line 349: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public int getSpsCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #167                // Field _spsCount:I
         4: ireturn
      LineNumberTable:
        line 354: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isUndying();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #172                // Field _isUndying:Z
         4: ireturn
      LineNumberTable:
        line 359: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean canBeAttacked();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #177                // Field _canBeAttacked:Z
         4: ireturn
      LineNumberTable:
        line 364: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public int getCorpseTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #182                // Field _corpseTime:I
         4: ireturn
      LineNumberTable:
        line 369: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isNoSleepMode();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #187                // Field _isNoSleepMode:Z
         4: ireturn
      LineNumberTable:
        line 374: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public int getAggroRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #192                // Field _aggroRange:I
         4: ireturn
      LineNumberTable:
        line 379: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean getAggro();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #197                // Field _aggro:Z
         4: ireturn
      LineNumberTable:
        line 384: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isNoRespawn();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #235                // Field _noRespawn:Z
         4: ireturn
      LineNumberTable:
        line 389: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean canMove();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #202                // Field _canMove:Z
         4: ireturn
      LineNumberTable:
        line 394: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean isSeedable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #207                // Field _isSeedable:Z
         4: ireturn
      LineNumberTable:
        line 399: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean canSeeThrough();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #212                // Field _canSeeThrough:Z
         4: ireturn
      LineNumberTable:
        line 404: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public boolean cantBeChampion();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #230                // Field _cantBeChampionMonster:Z
         4: ireturn
      LineNumberTable:
        line 409: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public ext.mods.gameserver.model.residence.Residence getResidence();
    descriptor: ()Lext/mods/gameserver/model/residence/Residence;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #457                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
         4: areturn
      LineNumberTable:
        line 414: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public ext.mods.gameserver.model.memo.NpcMemo getAiParams();
    descriptor: ()Lext/mods/gameserver/model/memo/NpcMemo;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #257                // Field _aiParams:Lext/mods/gameserver/model/memo/NpcMemo;
         4: areturn
      LineNumberTable:
        line 419: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public java.util.List<ext.mods.gameserver.model.item.DropCategory> getDropData();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #266                // Field _categories:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 427: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
    Signature: #627                         // ()Ljava/util/List<Lext/mods/gameserver/model/item/DropCategory;>;

  public void addDropData(ext.mods.gameserver.model.item.DropCategory);
    descriptor: (Lext/mods/gameserver/model/item/DropCategory;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #266                // Field _categories:Ljava/util/List;
         4: aload_1
         5: invokeinterface #321,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 436: 0
        line 437: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      12     1 category   Lext/mods/gameserver/model/item/DropCategory;

  public java.util.List<ext.mods.gameserver.model.records.PrivateData> getPrivateData();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #272                // Field _privateData:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 444: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
    Signature: #633                         // ()Ljava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;

  public java.util.List<ext.mods.gameserver.skills.L2Skill> getPassives();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #277                // Field _passives:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 452: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
    Signature: #635                         // ()Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public java.util.Map<ext.mods.gameserver.enums.actors.NpcSkillType, ext.mods.gameserver.skills.L2Skill> getSkills();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #282                // Field _skills:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 460: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
    Signature: #637                         // ()Ljava/util/Map<Lext/mods/gameserver/enums/actors/NpcSkillType;Lext/mods/gameserver/skills/L2Skill;>;

  public java.util.List<ext.mods.gameserver.skills.L2Skill> getSkills(ext.mods.gameserver.enums.actors.NpcSkillType...);
    descriptor: ([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List;
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #282                // Field _skills:Ljava/util/Map;
         4: invokeinterface #484,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
         9: invokeinterface #488,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokedynamic #494,  0            // InvokeDynamic #0:test:([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/function/Predicate;
        20: invokeinterface #498,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokedynamic #504,  0            // InvokeDynamic #1:apply:()Ljava/util/function/Function;
        30: invokeinterface #508,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        35: invokeinterface #512,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        40: areturn
      LineNumberTable:
        line 469: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      41     1 types   [Lext/mods/gameserver/enums/actors/NpcSkillType;
    Signature: #641                         // ([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public ext.mods.gameserver.skills.L2Skill getSkill(ext.mods.gameserver.enums.actors.NpcSkillType);
    descriptor: (Lext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #282                // Field _skills:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #515,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #519                // class ext/mods/gameserver/skills/L2Skill
        13: areturn
      LineNumberTable:
        line 478: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      14     1  type   Lext/mods/gameserver/enums/actors/NpcSkillType;

  public boolean canTeach(ext.mods.gameserver.enums.actors.ClassId);
    descriptor: (Lext/mods/gameserver/enums/actors/ClassId;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #312                // Field _teachInfo:Ljava/util/List;
         4: ifnull        39
         7: aload_0
         8: getfield      #312                // Field _teachInfo:Ljava/util/List;
        11: aload_1
        12: invokevirtual #521                // Method ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
        15: iconst_3
        16: if_icmpne     26
        19: aload_1
        20: invokevirtual #524                // Method ext/mods/gameserver/enums/actors/ClassId.getParent:()Lext/mods/gameserver/enums/actors/ClassId;
        23: goto          27
        26: aload_1
        27: invokeinterface #454,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        32: ifeq          39
        35: iconst_1
        36: goto          40
        39: iconst_0
        40: ireturn
      LineNumberTable:
        line 487: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      41     1 classId   Lext/mods/gameserver/enums/actors/ClassId;
      StackMapTable: number_of_entries = 4
        frame_type = 90 /* same_locals_1_stack_item */
          stack = [ class java/util/List ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/enums/actors/ClassId ]
          stack = [ class java/util/List, class ext/mods/gameserver/enums/actors/ClassId ]
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.util.Map<ext.mods.gameserver.enums.EventHandler, java.util.List<ext.mods.gameserver.scripting.Quest>> getEventQuests();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field _questEvents:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 495: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
    Signature: #649                         // ()Ljava/util/Map<Lext/mods/gameserver/enums/EventHandler;Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;>;

  public java.util.List<ext.mods.gameserver.scripting.Quest> getEventQuests(ext.mods.gameserver.enums.EventHandler);
    descriptor: (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #14                 // Field _questEvents:Ljava/util/Map;
         4: aload_1
         5: invokestatic  #528                // Method java/util/Collections.emptyList:()Ljava/util/List;
         8: invokeinterface #533,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #322                // class java/util/List
        16: areturn
      LineNumberTable:
        line 504: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      17     1  type   Lext/mods/gameserver/enums/EventHandler;
    Signature: #652                         // (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;

  public void addQuestEvent(ext.mods.gameserver.enums.EventHandler, ext.mods.gameserver.scripting.Quest);
    descriptor: (Lext/mods/gameserver/enums/EventHandler;Lext/mods/gameserver/scripting/Quest;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: getfield      #14                 // Field _questEvents:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #515,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #322                // class java/util/List
        13: astore_3
        14: aload_3
        15: ifnonnull     50
        18: new           #307                // class java/util/ArrayList
        21: dup
        22: iconst_5
        23: invokespecial #309                // Method java/util/ArrayList."<init>":(I)V
        26: astore_3
        27: aload_3
        28: aload_2
        29: invokeinterface #321,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        34: pop
        35: aload_0
        36: getfield      #14                 // Field _questEvents:Ljava/util/Map;
        39: aload_1
        40: aload_3
        41: invokeinterface #537,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        46: pop
        47: goto          82
        50: aload_3
        51: aload_2
        52: invokeinterface #540,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        57: pop
        58: aload_1
        59: invokevirtual #543                // Method ext/mods/gameserver/enums/EventHandler.isMultipleRegistrationAllowed:()Z
        62: ifne          74
        65: aload_3
        66: invokeinterface #546,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        71: ifeq          82
        74: aload_3
        75: aload_2
        76: invokeinterface #321,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        81: pop
        82: return
      LineNumberTable:
        line 516: 0
        line 517: 14
        line 519: 18
        line 520: 27
        line 522: 35
        line 526: 50
        line 528: 58
        line 529: 74
        line 531: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      83     0  this   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      83     1  type   Lext/mods/gameserver/enums/EventHandler;
            0      83     2 quest   Lext/mods/gameserver/scripting/Quest;
           14      69     3  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14      69     3  list   Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 50
          locals = [ class java/util/List ]
        frame_type = 23 /* same */
        frame_type = 7 /* same */
}
SourceFile: "NpcTemplate.java"
BootstrapMethods:
  0: #680 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #667 (Ljava/lang/Object;)Z
      #668 REF_invokeStatic ext/mods/gameserver/model/actor/template/NpcTemplate.lambda$getSkills$0:([Lext/mods/gameserver/enums/actors/NpcSkillType;Ljava/util/Map$Entry;)Z
      #671 (Ljava/util/Map$Entry;)Z
  1: #680 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #673 (Ljava/lang/Object;)Ljava/lang/Object;
      #674 REF_invokeInterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
      #678 (Ljava/util/Map$Entry;)Lext/mods/gameserver/skills/L2Skill;
InnerClasses:
  public static #688= #550 of #471;       // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #693= #689 of #691; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
