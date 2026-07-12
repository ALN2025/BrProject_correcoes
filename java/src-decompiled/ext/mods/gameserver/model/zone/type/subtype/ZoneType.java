// Bytecode for: ext.mods.gameserver.model.zone.type.subtype.ZoneType
// File: ext\mods\gameserver\model\zone\type\subtype\ZoneType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/subtype/ZoneType.class
  Last modified 9 de jul de 2026; size 10184 bytes
  MD5 checksum 35401b6745dcfda627d3db1b14e629c2
  Compiled from "ZoneType.java"
public abstract class ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #14                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 29, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #8 = Class              #10           // java/util/concurrent/ConcurrentHashMap
    #9 = NameAndType        #11:#12       // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #10 = Utf8               java/util/concurrent/ConcurrentHashMap
   #11 = Utf8               newKeySet
   #12 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/zone/type/subtype/ZoneType._creatures:Ljava/util/Set;
   #14 = Class              #16           // ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #15 = NameAndType        #17:#18       // _creatures:Ljava/util/Set;
   #16 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #17 = Utf8               _creatures
   #18 = Utf8               Ljava/util/Set;
   #19 = Fieldref           #14.#20       // ext/mods/gameserver/model/zone/type/subtype/ZoneType._id:I
   #20 = NameAndType        #21:#22       // _id:I
   #21 = Utf8               _id
   #22 = Utf8               I
   #23 = Methodref          #2.#24        // java/lang/Object.getClass:()Ljava/lang/Class;
   #24 = NameAndType        #25:#26       // getClass:()Ljava/lang/Class;
   #25 = Utf8               getClass
   #26 = Utf8               ()Ljava/lang/Class;
   #27 = Methodref          #28.#29       // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #28 = Class              #30           // java/lang/Class
   #29 = NameAndType        #31:#32       // getSimpleName:()Ljava/lang/String;
   #30 = Utf8               java/lang/Class
   #31 = Utf8               getSimpleName
   #32 = Utf8               ()Ljava/lang/String;
   #33 = InvokeDynamic      #0:#34        // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #34 = NameAndType        #35:#36       // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #35 = Utf8               makeConcatWithConstants
   #36 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #37 = Fieldref           #14.#38       // ext/mods/gameserver/model/zone/type/subtype/ZoneType._zone:Lext/mods/gameserver/model/zone/ZoneForm;
   #38 = NameAndType        #39:#40       // _zone:Lext/mods/gameserver/model/zone/ZoneForm;
   #39 = Utf8               _zone
   #40 = Utf8               Lext/mods/gameserver/model/zone/ZoneForm;
   #41 = Class              #42           // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #42 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #43 = Class              #44           // java/lang/IllegalStateException
   #44 = Utf8               java/lang/IllegalStateException
   #45 = String             #46           // Zone already set
   #46 = Utf8               Zone already set
   #47 = Methodref          #43.#48       // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
   #48 = NameAndType        #5:#49        // "<init>":(Ljava/lang/String;)V
   #49 = Utf8               (Ljava/lang/String;)V
   #50 = Methodref          #51.#52       // ext/mods/gameserver/model/zone/ZoneForm.getHighZ:()I
   #51 = Class              #53           // ext/mods/gameserver/model/zone/ZoneForm
   #52 = NameAndType        #54:#55       // getHighZ:()I
   #53 = Utf8               ext/mods/gameserver/model/zone/ZoneForm
   #54 = Utf8               getHighZ
   #55 = Utf8               ()I
   #56 = Methodref          #51.#57       // ext/mods/gameserver/model/zone/ZoneForm.isInsideZone:(III)Z
   #57 = NameAndType        #58:#59       // isInsideZone:(III)Z
   #58 = Utf8               isInsideZone
   #59 = Utf8               (III)Z
   #60 = Methodref          #61.#62       // ext/mods/gameserver/model/WorldObject.getX:()I
   #61 = Class              #63           // ext/mods/gameserver/model/WorldObject
   #62 = NameAndType        #64:#55       // getX:()I
   #63 = Utf8               ext/mods/gameserver/model/WorldObject
   #64 = Utf8               getX
   #65 = Methodref          #61.#66       // ext/mods/gameserver/model/WorldObject.getY:()I
   #66 = NameAndType        #67:#55       // getY:()I
   #67 = Utf8               getY
   #68 = Methodref          #61.#69       // ext/mods/gameserver/model/WorldObject.getZ:()I
   #69 = NameAndType        #70:#55       // getZ:()I
   #70 = Utf8               getZ
   #71 = Methodref          #14.#57       // ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(III)Z
   #72 = Methodref          #14.#73       // ext/mods/gameserver/model/zone/type/subtype/ZoneType.toString:()Ljava/lang/String;
   #73 = NameAndType        #74:#32       // toString:()Ljava/lang/String;
   #74 = Utf8               toString
   #75 = Methodref          #51.#76       // ext/mods/gameserver/model/zone/ZoneForm.visualizeZone:(Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
   #76 = NameAndType        #77:#78       // visualizeZone:(Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
   #77 = Utf8               visualizeZone
   #78 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
   #79 = Methodref          #14.#80       // ext/mods/gameserver/model/zone/type/subtype/ZoneType.isAffected:(Lext/mods/gameserver/model/actor/Creature;)Z
   #80 = NameAndType        #81:#82       // isAffected:(Lext/mods/gameserver/model/actor/Creature;)Z
   #81 = Utf8               isAffected
   #82 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #83 = Methodref          #14.#84       // ext/mods/gameserver/model/zone/type/subtype/ZoneType.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
   #84 = NameAndType        #58:#85       // isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
   #85 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #86 = InterfaceMethodref #87.#88       // java/util/Set.add:(Ljava/lang/Object;)Z
   #87 = Class              #89           // java/util/Set
   #88 = NameAndType        #90:#91       // add:(Ljava/lang/Object;)Z
   #89 = Utf8               java/util/Set
   #90 = Utf8               add
   #91 = Utf8               (Ljava/lang/Object;)Z
   #92 = Fieldref           #93.#94       // ext/mods/gameserver/enums/EventHandler.ZONE_ENTER:Lext/mods/gameserver/enums/EventHandler;
   #93 = Class              #95           // ext/mods/gameserver/enums/EventHandler
   #94 = NameAndType        #96:#97       // ZONE_ENTER:Lext/mods/gameserver/enums/EventHandler;
   #95 = Utf8               ext/mods/gameserver/enums/EventHandler
   #96 = Utf8               ZONE_ENTER
   #97 = Utf8               Lext/mods/gameserver/enums/EventHandler;
   #98 = Methodref          #14.#99       // ext/mods/gameserver/model/zone/type/subtype/ZoneType.getQuestByEvent:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #99 = NameAndType        #100:#101     // getQuestByEvent:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #100 = Utf8               getQuestByEvent
  #101 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #102 = InterfaceMethodref #103.#104     // java/util/List.iterator:()Ljava/util/Iterator;
  #103 = Class              #105          // java/util/List
  #104 = NameAndType        #106:#107     // iterator:()Ljava/util/Iterator;
  #105 = Utf8               java/util/List
  #106 = Utf8               iterator
  #107 = Utf8               ()Ljava/util/Iterator;
  #108 = InterfaceMethodref #109.#110     // java/util/Iterator.hasNext:()Z
  #109 = Class              #111          // java/util/Iterator
  #110 = NameAndType        #112:#113     // hasNext:()Z
  #111 = Utf8               java/util/Iterator
  #112 = Utf8               hasNext
  #113 = Utf8               ()Z
  #114 = InterfaceMethodref #109.#115     // java/util/Iterator.next:()Ljava/lang/Object;
  #115 = NameAndType        #116:#117     // next:()Ljava/lang/Object;
  #116 = Utf8               next
  #117 = Utf8               ()Ljava/lang/Object;
  #118 = Class              #119          // ext/mods/gameserver/scripting/Quest
  #119 = Utf8               ext/mods/gameserver/scripting/Quest
  #120 = Methodref          #118.#121     // ext/mods/gameserver/scripting/Quest.onZoneEnter:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #121 = NameAndType        #122:#123     // onZoneEnter:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #122 = Utf8               onZoneEnter
  #123 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #124 = Methodref          #14.#125      // ext/mods/gameserver/model/zone/type/subtype/ZoneType.onEnter:(Lext/mods/gameserver/model/actor/Creature;)V
  #125 = NameAndType        #126:#127     // onEnter:(Lext/mods/gameserver/model/actor/Creature;)V
  #126 = Utf8               onEnter
  #127 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #128 = Methodref          #129.#130     // ext/mods/extensions/listener/manager/ZoneListenerManager.getInstance:()Lext/mods/extensions/listener/manager/ZoneListenerManager;
  #129 = Class              #131          // ext/mods/extensions/listener/manager/ZoneListenerManager
  #130 = NameAndType        #132:#133     // getInstance:()Lext/mods/extensions/listener/manager/ZoneListenerManager;
  #131 = Utf8               ext/mods/extensions/listener/manager/ZoneListenerManager
  #132 = Utf8               getInstance
  #133 = Utf8               ()Lext/mods/extensions/listener/manager/ZoneListenerManager;
  #134 = Methodref          #129.#135     // ext/mods/extensions/listener/manager/ZoneListenerManager.notifyZoneEnter:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
  #135 = NameAndType        #136:#137     // notifyZoneEnter:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
  #136 = Utf8               notifyZoneEnter
  #137 = Utf8               (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
  #138 = Methodref          #14.#139      // ext/mods/gameserver/model/zone/type/subtype/ZoneType.removeCreature:(Lext/mods/gameserver/model/actor/Creature;)V
  #139 = NameAndType        #140:#127     // removeCreature:(Lext/mods/gameserver/model/actor/Creature;)V
  #140 = Utf8               removeCreature
  #141 = InterfaceMethodref #87.#142      // java/util/Set.remove:(Ljava/lang/Object;)Z
  #142 = NameAndType        #143:#91      // remove:(Ljava/lang/Object;)Z
  #143 = Utf8               remove
  #144 = Fieldref           #93.#145      // ext/mods/gameserver/enums/EventHandler.ZONE_EXIT:Lext/mods/gameserver/enums/EventHandler;
  #145 = NameAndType        #146:#97      // ZONE_EXIT:Lext/mods/gameserver/enums/EventHandler;
  #146 = Utf8               ZONE_EXIT
  #147 = Methodref          #118.#148     // ext/mods/gameserver/scripting/Quest.onZoneExit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #148 = NameAndType        #149:#123     // onZoneExit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
  #149 = Utf8               onZoneExit
  #150 = Methodref          #14.#151      // ext/mods/gameserver/model/zone/type/subtype/ZoneType.onExit:(Lext/mods/gameserver/model/actor/Creature;)V
  #151 = NameAndType        #152:#127     // onExit:(Lext/mods/gameserver/model/actor/Creature;)V
  #152 = Utf8               onExit
  #153 = Methodref          #129.#154     // ext/mods/extensions/listener/manager/ZoneListenerManager.notifyZoneLeave:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
  #154 = NameAndType        #155:#137     // notifyZoneLeave:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
  #155 = Utf8               notifyZoneLeave
  #156 = InterfaceMethodref #87.#157      // java/util/Set.contains:(Ljava/lang/Object;)Z
  #157 = NameAndType        #158:#91      // contains:(Ljava/lang/Object;)Z
  #158 = Utf8               contains
  #159 = InterfaceMethodref #87.#160      // java/util/Set.isEmpty:()Z
  #160 = NameAndType        #161:#113     // isEmpty:()Z
  #161 = Utf8               isEmpty
  #162 = Methodref          #163.#164     // java/util/Collections.emptyList:()Ljava/util/List;
  #163 = Class              #165          // java/util/Collections
  #164 = NameAndType        #166:#167     // emptyList:()Ljava/util/List;
  #165 = Utf8               java/util/Collections
  #166 = Utf8               emptyList
  #167 = Utf8               ()Ljava/util/List;
  #168 = InterfaceMethodref #87.#169      // java/util/Set.stream:()Ljava/util/stream/Stream;
  #169 = NameAndType        #170:#171     // stream:()Ljava/util/stream/Stream;
  #170 = Utf8               stream
  #171 = Utf8               ()Ljava/util/stream/Stream;
  #172 = Methodref          #173.#174     // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #173 = Class              #175          // java/util/Objects
  #174 = NameAndType        #176:#177     // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #175 = Utf8               java/util/Objects
  #176 = Utf8               requireNonNull
  #177 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #178 = InvokeDynamic      #1:#179       // #1:test:(Ljava/lang/Class;)Ljava/util/function/Predicate;
  #179 = NameAndType        #180:#181     // test:(Ljava/lang/Class;)Ljava/util/function/Predicate;
  #180 = Utf8               test
  #181 = Utf8               (Ljava/lang/Class;)Ljava/util/function/Predicate;
  #182 = InterfaceMethodref #183.#184     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #183 = Class              #185          // java/util/stream/Stream
  #184 = NameAndType        #186:#187     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #185 = Utf8               java/util/stream/Stream
  #186 = Utf8               filter
  #187 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #188 = InvokeDynamic      #2:#189       // #2:apply:(Ljava/lang/Class;)Ljava/util/function/Function;
  #189 = NameAndType        #190:#191     // apply:(Ljava/lang/Class;)Ljava/util/function/Function;
  #190 = Utf8               apply
  #191 = Utf8               (Ljava/lang/Class;)Ljava/util/function/Function;
  #192 = InterfaceMethodref #183.#193     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #193 = NameAndType        #194:#195     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #194 = Utf8               map
  #195 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #196 = InterfaceMethodref #183.#197     // java/util/stream/Stream.toList:()Ljava/util/List;
  #197 = NameAndType        #198:#167     // toList:()Ljava/util/List;
  #198 = Utf8               toList
  #199 = InvokeDynamic      #3:#200       // #3:test:(Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
  #200 = NameAndType        #180:#201     // test:(Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
  #201 = Utf8               (Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
  #202 = Fieldref           #14.#203      // ext/mods/gameserver/model/zone/type/subtype/ZoneType._questEvents:Ljava/util/Map;
  #203 = NameAndType        #204:#205     // _questEvents:Ljava/util/Map;
  #204 = Utf8               _questEvents
  #205 = Utf8               Ljava/util/Map;
  #206 = Class              #207          // java/util/EnumMap
  #207 = Utf8               java/util/EnumMap
  #208 = Methodref          #206.#209     // java/util/EnumMap."<init>":(Ljava/lang/Class;)V
  #209 = NameAndType        #5:#210       // "<init>":(Ljava/lang/Class;)V
  #210 = Utf8               (Ljava/lang/Class;)V
  #211 = InvokeDynamic      #4:#212       // #4:apply:()Ljava/util/function/Function;
  #212 = NameAndType        #190:#213     // apply:()Ljava/util/function/Function;
  #213 = Utf8               ()Ljava/util/function/Function;
  #214 = InterfaceMethodref #215.#216     // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #215 = Class              #217          // java/util/Map
  #216 = NameAndType        #218:#219     // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #217 = Utf8               java/util/Map
  #218 = Utf8               computeIfAbsent
  #219 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #220 = InterfaceMethodref #103.#142     // java/util/List.remove:(Ljava/lang/Object;)Z
  #221 = InterfaceMethodref #215.#222     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #222 = NameAndType        #223:#177     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #223 = Utf8               get
  #224 = InterfaceMethodref #103.#88      // java/util/List.add:(Ljava/lang/Object;)Z
  #225 = InterfaceMethodref #215.#226     // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #226 = NameAndType        #227:#228     // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #227 = Utf8               getOrDefault
  #228 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #229 = InterfaceMethodref #87.#104      // java/util/Set.iterator:()Ljava/util/Iterator;
  #230 = Class              #231          // ext/mods/gameserver/model/actor/Creature
  #231 = Utf8               ext/mods/gameserver/model/actor/Creature
  #232 = Class              #233          // ext/mods/gameserver/model/actor/Player
  #233 = Utf8               ext/mods/gameserver/model/actor/Player
  #234 = Methodref          #232.#235     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #235 = NameAndType        #236:#237     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #236 = Utf8               sendPacket
  #237 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #238 = Fieldref           #14.#239      // ext/mods/gameserver/model/zone/type/subtype/ZoneType.LOGGER:Lext/mods/commons/logging/CLogger;
  #239 = NameAndType        #240:#241     // LOGGER:Lext/mods/commons/logging/CLogger;
  #240 = Utf8               LOGGER
  #241 = Utf8               Lext/mods/commons/logging/CLogger;
  #242 = String             #243          // Unknown name/values couple {}, {} for {}.
  #243 = Utf8               Unknown name/values couple {}, {} for {}.
  #244 = Methodref          #245.#246     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #245 = Class              #247          // ext/mods/commons/logging/CLogger
  #246 = NameAndType        #248:#249     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #247 = Utf8               ext/mods/commons/logging/CLogger
  #248 = Utf8               warn
  #249 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #250 = InvokeDynamic      #5:#251       // #5:test:()Ljava/util/function/Predicate;
  #251 = NameAndType        #180:#252     // test:()Ljava/util/function/Predicate;
  #252 = Utf8               ()Ljava/util/function/Predicate;
  #253 = Methodref          #14.#254      // ext/mods/gameserver/model/zone/type/subtype/ZoneType.getKnownTypeInside:(Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/List;
  #254 = NameAndType        #255:#256     // getKnownTypeInside:(Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/List;
  #255 = Utf8               getKnownTypeInside
  #256 = Utf8               (Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/List;
  #257 = Methodref          #232.#258     // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #258 = NameAndType        #259:#260     // teleportTo:(IIII)Z
  #259 = Utf8               teleportTo
  #260 = Utf8               (IIII)Z
  #261 = Methodref          #262.#62      // ext/mods/gameserver/model/location/Location.getX:()I
  #262 = Class              #263          // ext/mods/gameserver/model/location/Location
  #263 = Utf8               ext/mods/gameserver/model/location/Location
  #264 = Methodref          #262.#66      // ext/mods/gameserver/model/location/Location.getY:()I
  #265 = Methodref          #262.#69      // ext/mods/gameserver/model/location/Location.getZ:()I
  #266 = Methodref          #14.#267      // ext/mods/gameserver/model/zone/type/subtype/ZoneType.instantTeleport:(III)V
  #267 = NameAndType        #268:#269     // instantTeleport:(III)V
  #268 = Utf8               instantTeleport
  #269 = Utf8               (III)V
  #270 = Class              #271          // java/util/ArrayList
  #271 = Utf8               java/util/ArrayList
  #272 = Methodref          #270.#3       // java/util/ArrayList."<init>":()V
  #273 = Methodref          #28.#274      // java/lang/Class.isInstance:(Ljava/lang/Object;)Z
  #274 = NameAndType        #275:#91      // isInstance:(Ljava/lang/Object;)Z
  #275 = Utf8               isInstance
  #276 = Methodref          #28.#277      // java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
  #277 = NameAndType        #278:#177     // cast:(Ljava/lang/Object;)Ljava/lang/Object;
  #278 = Utf8               cast
  #279 = InterfaceMethodref #280.#281     // java/util/function/Predicate.test:(Ljava/lang/Object;)Z
  #280 = Class              #282          // java/util/function/Predicate
  #281 = NameAndType        #180:#91      // test:(Ljava/lang/Object;)Z
  #282 = Utf8               java/util/function/Predicate
  #283 = Methodref          #28.#284      // java/lang/Class.getName:()Ljava/lang/String;
  #284 = NameAndType        #285:#32      // getName:()Ljava/lang/String;
  #285 = Utf8               getName
  #286 = Methodref          #245.#48      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #287 = Utf8               Signature
  #288 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/actor/Creature;>;
  #289 = Utf8               Ljava/util/Map<Lext/mods/gameserver/enums/EventHandler;Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;>;
  #290 = Utf8               (I)V
  #291 = Utf8               Code
  #292 = Utf8               LineNumberTable
  #293 = Utf8               LocalVariableTable
  #294 = Utf8               this
  #295 = Utf8               Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #296 = Utf8               id
  #297 = Utf8               getId
  #298 = Utf8               getZone
  #299 = Utf8               ()Lext/mods/gameserver/model/zone/ZoneForm;
  #300 = Utf8               setZone
  #301 = Utf8               (Lext/mods/gameserver/model/zone/ZoneForm;)V
  #302 = Utf8               zone
  #303 = Utf8               StackMapTable
  #304 = Utf8               (II)Z
  #305 = Utf8               x
  #306 = Utf8               y
  #307 = Utf8               z
  #308 = Utf8               object
  #309 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #310 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #311 = Utf8               debug
  #312 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #313 = Utf8               revalidateInZone
  #314 = Utf8               quest
  #315 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #316 = Utf8               creature
  #317 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #318 = Utf8               isInZone
  #319 = Utf8               getCreatures
  #320 = Utf8               ()Ljava/util/Set;
  #321 = Utf8               ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Creature;>;
  #322 = Utf8               (Ljava/lang/Class;)Ljava/util/List;
  #323 = Utf8               type
  #324 = Utf8               Ljava/lang/Class;
  #325 = Utf8               LocalVariableTypeTable
  #326 = Utf8               Ljava/lang/Class<TA;>;
  #327 = Utf8               <A:Ljava/lang/Object;>(Ljava/lang/Class<TA;>;)Ljava/util/List<TA;>;
  #328 = Utf8               predicate
  #329 = Utf8               Ljava/util/function/Predicate;
  #330 = Utf8               Ljava/util/function/Predicate<TA;>;
  #331 = Utf8               <A:Ljava/lang/Object;>(Ljava/lang/Class<TA;>;Ljava/util/function/Predicate<TA;>;)Ljava/util/List<TA;>;
  #332 = Utf8               addQuestEvent
  #333 = Utf8               (Lext/mods/gameserver/enums/EventHandler;Lext/mods/gameserver/scripting/Quest;)V
  #334 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #335 = Utf8               broadcastPacket
  #336 = Utf8               player
  #337 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #338 = Utf8               packet
  #339 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #340 = Utf8               setParameter
  #341 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #342 = Utf8               name
  #343 = Utf8               Ljava/lang/String;
  #344 = Utf8               value
  #345 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #346 = Utf8               loc
  #347 = Utf8               Lext/mods/gameserver/model/location/Location;
  #348 = Utf8               addKnownObject
  #349 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #350 = Utf8               removeKnownObject
  #351 = Utf8               lambda$addQuestEvent$0
  #352 = Utf8               k
  #353 = Utf8               lambda$getKnownTypeInside$0
  #354 = Utf8               (Ljava/lang/Class;Ljava/util/function/Predicate;Lext/mods/gameserver/model/actor/Creature;)Z
  #355 = Utf8               o
  #356 = Utf8               <clinit>
  #357 = Utf8               SourceFile
  #358 = Utf8               ZoneType.java
  #359 = Utf8               BootstrapMethods
  #360 = String             #361          // \u0001[\u0001]
  #361 = Utf8               \u0001[\u0001]
  #362 = MethodType         #91           //  (Ljava/lang/Object;)Z
  #363 = MethodHandle       5:#273        // REF_invokeVirtual java/lang/Class.isInstance:(Ljava/lang/Object;)Z
  #364 = MethodType         #82           //  (Lext/mods/gameserver/model/actor/Creature;)Z
  #365 = MethodType         #177          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #366 = MethodHandle       5:#276        // REF_invokeVirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
  #367 = MethodType         #368          //  (Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Object;
  #368 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Object;
  #369 = MethodHandle       6:#370        // REF_invokeStatic ext/mods/gameserver/model/zone/type/subtype/ZoneType.lambda$getKnownTypeInside$0:(Ljava/lang/Class;Ljava/util/function/Predicate;Lext/mods/gameserver/model/actor/Creature;)Z
  #370 = Methodref          #14.#371      // ext/mods/gameserver/model/zone/type/subtype/ZoneType.lambda$getKnownTypeInside$0:(Ljava/lang/Class;Ljava/util/function/Predicate;Lext/mods/gameserver/model/actor/Creature;)Z
  #371 = NameAndType        #353:#354     // lambda$getKnownTypeInside$0:(Ljava/lang/Class;Ljava/util/function/Predicate;Lext/mods/gameserver/model/actor/Creature;)Z
  #372 = MethodHandle       6:#373        // REF_invokeStatic ext/mods/gameserver/model/zone/type/subtype/ZoneType.lambda$addQuestEvent$0:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #373 = Methodref          #14.#374      // ext/mods/gameserver/model/zone/type/subtype/ZoneType.lambda$addQuestEvent$0:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #374 = NameAndType        #351:#101     // lambda$addQuestEvent$0:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #375 = MethodType         #101          //  (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #376 = MethodHandle       5:#377        // REF_invokeVirtual ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #377 = Methodref          #232.#378     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #378 = NameAndType        #379:#113     // isOnline:()Z
  #379 = Utf8               isOnline
  #380 = MethodType         #381          //  (Lext/mods/gameserver/model/actor/Player;)Z
  #381 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #382 = MethodHandle       6:#383        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #383 = Methodref          #384.#385     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #384 = Class              #386          // java/lang/invoke/StringConcatFactory
  #385 = NameAndType        #35:#387      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #386 = Utf8               java/lang/invoke/StringConcatFactory
  #387 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #388 = MethodHandle       6:#389        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #389 = Methodref          #390.#391     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #390 = Class              #392          // java/lang/invoke/LambdaMetafactory
  #391 = NameAndType        #393:#394     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #392 = Utf8               java/lang/invoke/LambdaMetafactory
  #393 = Utf8               metafactory
  #394 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #395 = Utf8               InnerClasses
  #396 = Class              #397          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #397 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #398 = Utf8               KeySetView
  #399 = Class              #400          // java/lang/invoke/MethodHandles$Lookup
  #400 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #401 = Class              #402          // java/lang/invoke/MethodHandles
  #402 = Utf8               java/lang/invoke/MethodHandles
  #403 = Utf8               Lookup
{
  protected static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  protected final java.util.Set<ext.mods.gameserver.model.actor.Creature> _creatures;
    descriptor: Ljava/util/Set;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #288                         // Ljava/util/Set<Lext/mods/gameserver/model/actor/Creature;>;

  protected ext.mods.gameserver.model.zone.type.subtype.ZoneType(int);
    descriptor: (I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokestatic  #7                  // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
         8: putfield      #13                 // Field _creatures:Ljava/util/Set;
        11: aload_0
        12: iload_1
        13: putfield      #19                 // Field _id:I
        16: return
      LineNumberTable:
        line 59: 0
        line 51: 4
        line 60: 11
        line 61: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      17     1    id   I

  protected abstract void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #23                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: invokevirtual #27                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
         7: aload_0
         8: getfield      #19                 // Field _id:I
        11: invokedynamic #33,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        16: areturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 75: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;

  public ext.mods.gameserver.model.zone.ZoneForm getZone();
    descriptor: ()Lext/mods/gameserver/model/zone/ZoneForm;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _zone:Lext/mods/gameserver/model/zone/ZoneForm;
         4: areturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;

  public void setZone(ext.mods.gameserver.model.zone.ZoneForm);
    descriptor: (Lext/mods/gameserver/model/zone/ZoneForm;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #37                 // Field _zone:Lext/mods/gameserver/model/zone/ZoneForm;
         4: ifnull        24
         7: aload_0
         8: instanceof    #41                 // class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
        11: ifne          24
        14: new           #43                 // class java/lang/IllegalStateException
        17: dup
        18: ldc           #45                 // String Zone already set
        20: invokespecial #47                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
        23: athrow
        24: aload_0
        25: aload_1
        26: putfield      #37                 // Field _zone:Lext/mods/gameserver/model/zone/ZoneForm;
        29: return
      LineNumberTable:
        line 85: 0
        line 86: 14
        line 88: 24
        line 89: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      30     1  zone   Lext/mods/gameserver/model/zone/ZoneForm;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public boolean isInsideZone(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: getfield      #37                 // Field _zone:Lext/mods/gameserver/model/zone/ZoneForm;
         4: iload_1
         5: iload_2
         6: aload_0
         7: getfield      #37                 // Field _zone:Lext/mods/gameserver/model/zone/ZoneForm;
        10: invokevirtual #50                 // Method ext/mods/gameserver/model/zone/ZoneForm.getHighZ:()I
        13: invokevirtual #56                 // Method ext/mods/gameserver/model/zone/ZoneForm.isInsideZone:(III)Z
        16: ireturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      17     1     x   I
            0      17     2     y   I

  public boolean isInsideZone(int, int, int);
    descriptor: (III)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getfield      #37                 // Field _zone:Lext/mods/gameserver/model/zone/ZoneForm;
         4: iload_1
         5: iload_2
         6: iload_3
         7: invokevirtual #56                 // Method ext/mods/gameserver/model/zone/ZoneForm.isInsideZone:(III)Z
        10: ireturn
      LineNumberTable:
        line 109: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      11     1     x   I
            0      11     2     y   I
            0      11     3     z   I

  public boolean isInsideZone(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #60                 // Method ext/mods/gameserver/model/WorldObject.getX:()I
         5: aload_1
         6: invokevirtual #65                 // Method ext/mods/gameserver/model/WorldObject.getY:()I
         9: aload_1
        10: invokevirtual #68                 // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        13: invokevirtual #71                 // Method isInsideZone:(III)Z
        16: ireturn
      LineNumberTable:
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      17     1 object   Lext/mods/gameserver/model/WorldObject;

  public void visualizeZone(ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #37                 // Field _zone:Lext/mods/gameserver/model/zone/ZoneForm;
         4: aload_0
         5: invokevirtual #72                 // Method toString:()Ljava/lang/String;
         8: aload_1
         9: invokevirtual #75                 // Method ext/mods/gameserver/model/zone/ZoneForm.visualizeZone:(Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
        12: return
      LineNumberTable:
        line 123: 0
        line 124: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      13     1 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;

  public void revalidateInZone(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #79                 // Method isAffected:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          9
         8: return
         9: aload_0
        10: aload_1
        11: invokevirtual #83                 // Method isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
        14: ifeq          87
        17: aload_0
        18: getfield      #13                 // Field _creatures:Ljava/util/Set;
        21: aload_1
        22: invokeinterface #86,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        27: ifeq          92
        30: aload_0
        31: getstatic     #92                 // Field ext/mods/gameserver/enums/EventHandler.ZONE_ENTER:Lext/mods/gameserver/enums/EventHandler;
        34: invokevirtual #98                 // Method getQuestByEvent:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        37: invokeinterface #102,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        42: astore_2
        43: aload_2
        44: invokeinterface #108,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        49: ifeq          71
        52: aload_2
        53: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        58: checkcast     #118                // class ext/mods/gameserver/scripting/Quest
        61: astore_3
        62: aload_3
        63: aload_1
        64: aload_0
        65: invokevirtual #120                // Method ext/mods/gameserver/scripting/Quest.onZoneEnter:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
        68: goto          43
        71: aload_0
        72: aload_1
        73: invokevirtual #124                // Method onEnter:(Lext/mods/gameserver/model/actor/Creature;)V
        76: invokestatic  #128                // Method ext/mods/extensions/listener/manager/ZoneListenerManager.getInstance:()Lext/mods/extensions/listener/manager/ZoneListenerManager;
        79: aload_0
        80: aload_1
        81: invokevirtual #134                // Method ext/mods/extensions/listener/manager/ZoneListenerManager.notifyZoneEnter:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
        84: goto          92
        87: aload_0
        88: aload_1
        89: invokevirtual #138                // Method removeCreature:(Lext/mods/gameserver/model/actor/Creature;)V
        92: return
      LineNumberTable:
        line 140: 0
        line 141: 8
        line 143: 9
        line 145: 17
        line 147: 30
        line 148: 62
        line 150: 71
        line 151: 76
        line 155: 87
        line 156: 92
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           62       6     3 quest   Lext/mods/gameserver/scripting/Quest;
            0      93     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      93     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 5
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 27
        frame_type = 15 /* same */
        frame_type = 4 /* same */

  public void removeCreature(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _creatures:Ljava/util/Set;
         4: aload_1
         5: invokeinterface #141,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        10: ifeq          67
        13: aload_0
        14: getstatic     #144                // Field ext/mods/gameserver/enums/EventHandler.ZONE_EXIT:Lext/mods/gameserver/enums/EventHandler;
        17: invokevirtual #98                 // Method getQuestByEvent:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        20: invokeinterface #102,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        25: astore_2
        26: aload_2
        27: invokeinterface #108,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        32: ifeq          54
        35: aload_2
        36: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        41: checkcast     #118                // class ext/mods/gameserver/scripting/Quest
        44: astore_3
        45: aload_3
        46: aload_1
        47: aload_0
        48: invokevirtual #147                // Method ext/mods/gameserver/scripting/Quest.onZoneExit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/zone/type/subtype/ZoneType;)V
        51: goto          26
        54: aload_0
        55: aload_1
        56: invokevirtual #150                // Method onExit:(Lext/mods/gameserver/model/actor/Creature;)V
        59: invokestatic  #128                // Method ext/mods/extensions/listener/manager/ZoneListenerManager.getInstance:()Lext/mods/extensions/listener/manager/ZoneListenerManager;
        62: aload_0
        63: aload_1
        64: invokevirtual #153                // Method ext/mods/extensions/listener/manager/ZoneListenerManager.notifyZoneLeave:(Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
        67: return
      LineNumberTable:
        line 169: 0
        line 171: 13
        line 172: 45
        line 174: 54
        line 175: 59
        line 177: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           45       6     3 quest   Lext/mods/gameserver/scripting/Quest;
            0      68     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      68     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 27
        frame_type = 12 /* same */

  public boolean isInZone(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _creatures:Ljava/util/Set;
         4: aload_1
         5: invokeinterface #156,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        10: ireturn
      LineNumberTable:
        line 185: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      11     1 creature   Lext/mods/gameserver/model/actor/Creature;

  public java.util.Set<ext.mods.gameserver.model.actor.Creature> getCreatures();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _creatures:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 190: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
    Signature: #321                         // ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Creature;>;

  public final <A extends java.lang.Object> java.util.List<A> getKnownTypeInside(java.lang.Class<A>);
    descriptor: (Ljava/lang/Class;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _creatures:Ljava/util/Set;
         4: invokeinterface #159,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          16
        12: invokestatic  #162                // Method java/util/Collections.emptyList:()Ljava/util/List;
        15: areturn
        16: aload_0
        17: getfield      #13                 // Field _creatures:Ljava/util/Set;
        20: invokeinterface #168,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        25: aload_1
        26: dup
        27: invokestatic  #172                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        30: pop
        31: invokedynamic #178,  0            // InvokeDynamic #1:test:(Ljava/lang/Class;)Ljava/util/function/Predicate;
        36: invokeinterface #182,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        41: aload_1
        42: dup
        43: invokestatic  #172                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        46: pop
        47: invokedynamic #188,  0            // InvokeDynamic #2:apply:(Ljava/lang/Class;)Ljava/util/function/Function;
        52: invokeinterface #192,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        57: invokeinterface #196,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        62: areturn
      LineNumberTable:
        line 200: 0
        line 201: 12
        line 203: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      63     1  type   Ljava/lang/Class;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      63     1  type   Ljava/lang/Class<TA;>;
      StackMapTable: number_of_entries = 1
        frame_type = 16 /* same */
    Signature: #327                         // <A:Ljava/lang/Object;>(Ljava/lang/Class<TA;>;)Ljava/util/List<TA;>;

  public final <A extends java.lang.Object> java.util.List<A> getKnownTypeInside(java.lang.Class<A>, java.util.function.Predicate<A>);
    descriptor: (Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #13                 // Field _creatures:Ljava/util/Set;
         4: invokeinterface #159,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          16
        12: invokestatic  #162                // Method java/util/Collections.emptyList:()Ljava/util/List;
        15: areturn
        16: aload_0
        17: getfield      #13                 // Field _creatures:Ljava/util/Set;
        20: invokeinterface #168,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        25: aload_1
        26: aload_2
        27: invokedynamic #199,  0            // InvokeDynamic #3:test:(Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
        32: invokeinterface #182,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        37: aload_1
        38: dup
        39: invokestatic  #172                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        42: pop
        43: invokedynamic #188,  0            // InvokeDynamic #2:apply:(Ljava/lang/Class;)Ljava/util/function/Function;
        48: invokeinterface #192,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        53: invokeinterface #196,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        58: areturn
      LineNumberTable:
        line 214: 0
        line 215: 12
        line 217: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      59     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      59     1  type   Ljava/lang/Class;
            0      59     2 predicate   Ljava/util/function/Predicate;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      59     1  type   Ljava/lang/Class<TA;>;
            0      59     2 predicate   Ljava/util/function/Predicate<TA;>;
      StackMapTable: number_of_entries = 1
        frame_type = 16 /* same */
    Signature: #331                         // <A:Ljava/lang/Object;>(Ljava/lang/Class<TA;>;Ljava/util/function/Predicate<TA;>;)Ljava/util/List<TA;>;

  public void addQuestEvent(ext.mods.gameserver.enums.EventHandler, ext.mods.gameserver.scripting.Quest);
    descriptor: (Lext/mods/gameserver/enums/EventHandler;Lext/mods/gameserver/scripting/Quest;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: getfield      #202                // Field _questEvents:Ljava/util/Map;
         4: ifnonnull     20
         7: aload_0
         8: new           #206                // class java/util/EnumMap
        11: dup
        12: ldc           #93                 // class ext/mods/gameserver/enums/EventHandler
        14: invokespecial #208                // Method java/util/EnumMap."<init>":(Ljava/lang/Class;)V
        17: putfield      #202                // Field _questEvents:Ljava/util/Map;
        20: aload_0
        21: getfield      #202                // Field _questEvents:Ljava/util/Map;
        24: aload_1
        25: invokedynamic #211,  0            // InvokeDynamic #4:apply:()Ljava/util/function/Function;
        30: invokeinterface #214,  3          // InterfaceMethod java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
        35: checkcast     #103                // class java/util/List
        38: aload_2
        39: invokeinterface #220,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        44: pop
        45: aload_0
        46: getfield      #202                // Field _questEvents:Ljava/util/Map;
        49: aload_1
        50: invokeinterface #221,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        55: checkcast     #103                // class java/util/List
        58: aload_2
        59: invokeinterface #224,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        64: pop
        65: return
      LineNumberTable:
        line 229: 0
        line 230: 7
        line 232: 20
        line 233: 45
        line 234: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      66     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      66     1  type   Lext/mods/gameserver/enums/EventHandler;
            0      66     2 quest   Lext/mods/gameserver/scripting/Quest;
      StackMapTable: number_of_entries = 1
        frame_type = 20 /* same */

  public java.util.List<ext.mods.gameserver.scripting.Quest> getQuestByEvent(ext.mods.gameserver.enums.EventHandler);
    descriptor: (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #202                // Field _questEvents:Ljava/util/Map;
         4: ifnonnull     11
         7: invokestatic  #162                // Method java/util/Collections.emptyList:()Ljava/util/List;
        10: areturn
        11: aload_0
        12: getfield      #202                // Field _questEvents:Ljava/util/Map;
        15: aload_1
        16: invokestatic  #162                // Method java/util/Collections.emptyList:()Ljava/util/List;
        19: invokeinterface #225,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        24: checkcast     #103                // class java/util/List
        27: areturn
      LineNumberTable:
        line 242: 0
        line 243: 7
        line 245: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      28     1  type   Lext/mods/gameserver/enums/EventHandler;
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */
    Signature: #334                         // (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;

  public void broadcastPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _creatures:Ljava/util/Set;
         4: invokeinterface #229,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #108,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          51
        19: aload_2
        20: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #230                // class ext/mods/gameserver/model/actor/Creature
        28: astore_3
        29: aload_3
        30: instanceof    #232                // class ext/mods/gameserver/model/actor/Player
        33: ifeq          48
        36: aload_3
        37: checkcast     #232                // class ext/mods/gameserver/model/actor/Player
        40: astore        4
        42: aload         4
        44: aload_1
        45: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        48: goto          10
        51: return
      LineNumberTable:
        line 254: 0
        line 256: 29
        line 257: 42
        line 258: 48
        line 259: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42       6     4 player   Lext/mods/gameserver/model/actor/Player;
           29      19     3 creature   Lext/mods/gameserver/model/actor/Creature;
            0      52     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      52     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void setParameter(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: getstatic     #238                // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: ldc           #242                // String Unknown name/values couple {}, {} for {}.
         5: iconst_3
         6: anewarray     #2                  // class java/lang/Object
         9: dup
        10: iconst_0
        11: aload_1
        12: aastore
        13: dup
        14: iconst_1
        15: aload_2
        16: aastore
        17: dup
        18: iconst_2
        19: aload_0
        20: invokevirtual #72                 // Method toString:()Ljava/lang/String;
        23: aastore
        24: invokevirtual #244                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        27: return
      LineNumberTable:
        line 268: 0
        line 269: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      28     1  name   Ljava/lang/String;
            0      28     2 value   Ljava/lang/String;

  protected boolean isAffected(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 277: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0       2     1 creature   Lext/mods/gameserver/model/actor/Creature;

  public void instantTeleport(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=4
         0: aload_0
         1: ldc           #232                // class ext/mods/gameserver/model/actor/Player
         3: invokedynamic #250,  0            // InvokeDynamic #5:test:()Ljava/util/function/Predicate;
         8: invokevirtual #253                // Method getKnownTypeInside:(Ljava/lang/Class;Ljava/util/function/Predicate;)Ljava/util/List;
        11: invokeinterface #102,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        16: astore        4
        18: aload         4
        20: invokeinterface #108,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        25: ifeq          53
        28: aload         4
        30: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        35: checkcast     #232                // class ext/mods/gameserver/model/actor/Player
        38: astore        5
        40: aload         5
        42: iload_1
        43: iload_2
        44: iload_3
        45: iconst_0
        46: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
        49: pop
        50: goto          18
        53: return
      LineNumberTable:
        line 288: 0
        line 289: 40
        line 290: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      10     5 player   Lext/mods/gameserver/model/actor/Player;
            0      54     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      54     1     x   I
            0      54     2     y   I
            0      54     3     z   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 34

  public void instantTeleport(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #261                // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #264                // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: aload_1
        10: invokevirtual #265                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        13: invokevirtual #266                // Method instantTeleport:(III)V
        16: return
      LineNumberTable:
        line 299: 0
        line 300: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0      17     1   loc   Lext/mods/gameserver/model/location/Location;

  public void addKnownObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 308: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0       1     1 object   Lext/mods/gameserver/model/WorldObject;

  public void removeKnownObject(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 316: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
            0       1     1 object   Lext/mods/gameserver/model/WorldObject;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #245                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #14                 // class ext/mods/gameserver/model/zone/type/subtype/ZoneType
         6: invokevirtual #283                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #286                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #238                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 49: 0
}
SourceFile: "ZoneType.java"
BootstrapMethods:
  0: #382 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #360 \u0001[\u0001]
  1: #388 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #362 (Ljava/lang/Object;)Z
      #363 REF_invokeVirtual java/lang/Class.isInstance:(Ljava/lang/Object;)Z
      #364 (Lext/mods/gameserver/model/actor/Creature;)Z
  2: #388 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #365 (Ljava/lang/Object;)Ljava/lang/Object;
      #366 REF_invokeVirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
      #367 (Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Object;
  3: #388 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #362 (Ljava/lang/Object;)Z
      #369 REF_invokeStatic ext/mods/gameserver/model/zone/type/subtype/ZoneType.lambda$getKnownTypeInside$0:(Ljava/lang/Class;Ljava/util/function/Predicate;Lext/mods/gameserver/model/actor/Creature;)Z
      #364 (Lext/mods/gameserver/model/actor/Creature;)Z
  4: #388 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #365 (Ljava/lang/Object;)Ljava/lang/Object;
      #372 REF_invokeStatic ext/mods/gameserver/model/zone/type/subtype/ZoneType.lambda$addQuestEvent$0:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
      #375 (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  5: #388 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #362 (Ljava/lang/Object;)Z
      #376 REF_invokeVirtual ext/mods/gameserver/model/actor/Player.isOnline:()Z
      #380 (Lext/mods/gameserver/model/actor/Player;)Z
InnerClasses:
  public static final #398= #396 of #8;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static final #403= #399 of #401; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
