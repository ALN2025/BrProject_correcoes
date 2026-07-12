// Bytecode for: ext.mods.gameserver.data.xml.RestartPointData
// File: ext\mods\gameserver\data\xml\RestartPointData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/RestartPointData.class
  Last modified 9 de jul de 2026; size 17455 bytes
  MD5 checksum d65db862d995456a91a74ed2cf7febc5
  Compiled from "RestartPointData.java"
public final class ext.mods.gameserver.data.xml.RestartPointData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/RestartPointData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 23, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/RestartPointData._restartAreas:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/RestartPointData
   #12 = NameAndType        #14:#15       // _restartAreas:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/data/xml/RestartPointData
   #14 = Utf8               _restartAreas
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/data/xml/RestartPointData._restartPoints:Ljava/util/List;
   #17 = NameAndType        #18:#15       // _restartPoints:Ljava/util/List;
   #18 = Utf8               _restartPoints
   #19 = Methodref          #11.#20       // ext/mods/gameserver/data/xml/RestartPointData.load:()V
   #20 = NameAndType        #21:#6        // load:()V
   #21 = Utf8               load
   #22 = String             #23           // xml/restartPointAreas.xml
   #23 = Utf8               xml/restartPointAreas.xml
   #24 = Methodref          #11.#25       // ext/mods/gameserver/data/xml/RestartPointData.parseDataFile:(Ljava/lang/String;)V
   #25 = NameAndType        #26:#27       // parseDataFile:(Ljava/lang/String;)V
   #26 = Utf8               parseDataFile
   #27 = Utf8               (Ljava/lang/String;)V
   #28 = Fieldref           #11.#29       // ext/mods/gameserver/data/xml/RestartPointData.LOGGER:Lext/mods/commons/logging/CLogger;
   #29 = NameAndType        #30:#31       // LOGGER:Lext/mods/commons/logging/CLogger;
   #30 = Utf8               LOGGER
   #31 = Utf8               Lext/mods/commons/logging/CLogger;
   #32 = String             #33           // Loaded {} restart areas and {} restart points.
   #33 = Utf8               Loaded {} restart areas and {} restart points.
   #34 = InterfaceMethodref #35.#36       // java/util/List.size:()I
   #35 = Class              #37           // java/util/List
   #36 = NameAndType        #38:#39       // size:()I
   #37 = Utf8               java/util/List
   #38 = Utf8               size
   #39 = Utf8               ()I
   #40 = Methodref          #41.#42       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #41 = Class              #43           // java/lang/Integer
   #42 = NameAndType        #44:#45       // valueOf:(I)Ljava/lang/Integer;
   #43 = Utf8               java/lang/Integer
   #44 = Utf8               valueOf
   #45 = Utf8               (I)Ljava/lang/Integer;
   #46 = Methodref          #47.#48       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #47 = Class              #49           // ext/mods/commons/logging/CLogger
   #48 = NameAndType        #50:#51       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #49 = Utf8               ext/mods/commons/logging/CLogger
   #50 = Utf8               info
   #51 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #52 = String             #53           // list
   #53 = Utf8               list
   #54 = InvokeDynamic      #0:#55        // #0:accept:(Lext/mods/gameserver/data/xml/RestartPointData;Ljava/util/List;)Ljava/util/function/Consumer;
   #55 = NameAndType        #56:#57       // accept:(Lext/mods/gameserver/data/xml/RestartPointData;Ljava/util/List;)Ljava/util/function/Consumer;
   #56 = Utf8               accept
   #57 = Utf8               (Lext/mods/gameserver/data/xml/RestartPointData;Ljava/util/List;)Ljava/util/function/Consumer;
   #58 = Methodref          #11.#59       // ext/mods/gameserver/data/xml/RestartPointData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = NameAndType        #60:#61       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #60 = Utf8               forEach
   #61 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #62 = InterfaceMethodref #35.#63       // java/util/List.clear:()V
   #63 = NameAndType        #64:#6        // clear:()V
   #64 = Utf8               clear
   #65 = InterfaceMethodref #35.#66       // java/util/List.stream:()Ljava/util/stream/Stream;
   #66 = NameAndType        #67:#68       // stream:()Ljava/util/stream/Stream;
   #67 = Utf8               stream
   #68 = Utf8               ()Ljava/util/stream/Stream;
   #69 = InvokeDynamic      #1:#70        // #1:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #70 = NameAndType        #71:#72       // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #71 = Utf8               test
   #72 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #73 = InterfaceMethodref #74.#75       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #74 = Class              #76           // java/util/stream/Stream
   #75 = NameAndType        #77:#78       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #76 = Utf8               java/util/stream/Stream
   #77 = Utf8               filter
   #78 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #79 = InterfaceMethodref #74.#80       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #80 = NameAndType        #81:#82       // findFirst:()Ljava/util/Optional;
   #81 = Utf8               findFirst
   #82 = Utf8               ()Ljava/util/Optional;
   #83 = Methodref          #84.#85       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #84 = Class              #86           // java/util/Optional
   #85 = NameAndType        #87:#88       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #86 = Utf8               java/util/Optional
   #87 = Utf8               orElse
   #88 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #89 = Class              #90           // ext/mods/gameserver/model/restart/RestartArea
   #90 = Utf8               ext/mods/gameserver/model/restart/RestartArea
   #91 = Methodref          #92.#93       // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #92 = Class              #94           // ext/mods/gameserver/model/actor/Creature
   #93 = NameAndType        #95:#96       // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #94 = Utf8               ext/mods/gameserver/model/actor/Creature
   #95 = Utf8               getPosition
   #96 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #97 = Methodref          #11.#98       // ext/mods/gameserver/data/xml/RestartPointData.getRestartPoint:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/restart/RestartPoint;
   #98 = NameAndType        #99:#100      // getRestartPoint:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/restart/RestartPoint;
   #99 = Utf8               getRestartPoint
  #100 = Utf8               (Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/restart/RestartPoint;
  #101 = Methodref          #102.#103     // ext/mods/gameserver/model/location/Location.getX:()I
  #102 = Class              #104          // ext/mods/gameserver/model/location/Location
  #103 = NameAndType        #105:#39      // getX:()I
  #104 = Utf8               ext/mods/gameserver/model/location/Location
  #105 = Utf8               getX
  #106 = Class              #107          // ext/mods/gameserver/model/World
  #107 = Utf8               ext/mods/gameserver/model/World
  #108 = Integer            -131072
  #109 = Integer            32768
  #110 = Methodref          #102.#111     // ext/mods/gameserver/model/location/Location.getY:()I
  #111 = NameAndType        #112:#39      // getY:()I
  #112 = Utf8               getY
  #113 = Integer            -262144
  #114 = InterfaceMethodref #35.#115      // java/util/List.iterator:()Ljava/util/Iterator;
  #115 = NameAndType        #116:#117     // iterator:()Ljava/util/Iterator;
  #116 = Utf8               iterator
  #117 = Utf8               ()Ljava/util/Iterator;
  #118 = InterfaceMethodref #119.#120     // java/util/Iterator.hasNext:()Z
  #119 = Class              #121          // java/util/Iterator
  #120 = NameAndType        #122:#123     // hasNext:()Z
  #121 = Utf8               java/util/Iterator
  #122 = Utf8               hasNext
  #123 = Utf8               ()Z
  #124 = InterfaceMethodref #119.#125     // java/util/Iterator.next:()Ljava/lang/Object;
  #125 = NameAndType        #126:#127     // next:()Ljava/lang/Object;
  #126 = Utf8               next
  #127 = Utf8               ()Ljava/lang/Object;
  #128 = Class              #129          // ext/mods/gameserver/model/restart/RestartPoint
  #129 = Utf8               ext/mods/gameserver/model/restart/RestartPoint
  #130 = Methodref          #128.#131     // ext/mods/gameserver/model/restart/RestartPoint.getMapRegions:()Ljava/util/List;
  #131 = NameAndType        #132:#133     // getMapRegions:()Ljava/util/List;
  #132 = Utf8               getMapRegions
  #133 = Utf8               ()Ljava/util/List;
  #134 = Class              #135          // ext/mods/gameserver/model/holder/IntIntHolder
  #135 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #136 = Methodref          #134.#137     // ext/mods/gameserver/model/holder/IntIntHolder.equals:(II)Z
  #137 = NameAndType        #138:#139     // equals:(II)Z
  #138 = Utf8               equals
  #139 = Utf8               (II)Z
  #140 = InvokeDynamic      #2:#141       // #2:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #141 = NameAndType        #71:#142      // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #142 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #143 = Methodref          #11.#144      // ext/mods/gameserver/data/xml/RestartPointData.getRestartArea:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartArea;
  #144 = NameAndType        #145:#146     // getRestartArea:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartArea;
  #145 = Utf8               getRestartArea
  #146 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartArea;
  #147 = Methodref          #89.#148      // ext/mods/gameserver/model/restart/RestartArea.getClassRestriction:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #148 = NameAndType        #149:#150     // getClassRestriction:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #149 = Utf8               getClassRestriction
  #150 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #151 = Methodref          #11.#152      // ext/mods/gameserver/data/xml/RestartPointData.getRestartPointByName:(Ljava/lang/String;)Lext/mods/gameserver/model/restart/RestartPoint;
  #152 = NameAndType        #153:#154     // getRestartPointByName:(Ljava/lang/String;)Lext/mods/gameserver/model/restart/RestartPoint;
  #153 = Utf8               getRestartPointByName
  #154 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/restart/RestartPoint;
  #155 = Methodref          #11.#156      // ext/mods/gameserver/data/xml/RestartPointData.getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
  #156 = NameAndType        #99:#157      // getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
  #157 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
  #158 = Methodref          #128.#159     // ext/mods/gameserver/model/restart/RestartPoint.getBannedRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #159 = NameAndType        #160:#161     // getBannedRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #160 = Utf8               getBannedRace
  #161 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassRace;
  #162 = Methodref          #163.#164     // ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #163 = Class              #165          // ext/mods/gameserver/model/actor/Player
  #164 = NameAndType        #166:#161     // getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #165 = Utf8               ext/mods/gameserver/model/actor/Player
  #166 = Utf8               getRace
  #167 = Methodref          #128.#168     // ext/mods/gameserver/model/restart/RestartPoint.getBannedPoint:()Ljava/lang/String;
  #168 = NameAndType        #169:#170     // getBannedPoint:()Ljava/lang/String;
  #169 = Utf8               getBannedPoint
  #170 = Utf8               ()Ljava/lang/String;
  #171 = Methodref          #163.#172     // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #172 = NameAndType        #173:#39      // getKarma:()I
  #173 = Utf8               getKarma
  #174 = Methodref          #128.#175     // ext/mods/gameserver/model/restart/RestartPoint.getRandomChaoPoint:()Lext/mods/gameserver/model/location/Location;
  #175 = NameAndType        #176:#177     // getRandomChaoPoint:()Lext/mods/gameserver/model/location/Location;
  #176 = Utf8               getRandomChaoPoint
  #177 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #178 = Methodref          #128.#179     // ext/mods/gameserver/model/restart/RestartPoint.getRandomPoint:()Lext/mods/gameserver/model/location/Location;
  #179 = NameAndType        #180:#177     // getRandomPoint:()Lext/mods/gameserver/model/location/Location;
  #180 = Utf8               getRandomPoint
  #181 = Fieldref           #182.#183     // ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
  #182 = Class              #184          // ext/mods/gameserver/enums/RestartType
  #183 = NameAndType        #185:#186     // TOWN:Lext/mods/gameserver/enums/RestartType;
  #184 = Utf8               ext/mods/gameserver/enums/RestartType
  #185 = Utf8               TOWN
  #186 = Utf8               Lext/mods/gameserver/enums/RestartType;
  #187 = Methodref          #163.#188     // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #188 = NameAndType        #189:#190     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #189 = Utf8               getClan
  #190 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #191 = Fieldref           #182.#192     // ext/mods/gameserver/enums/RestartType.CLAN_HALL:Lext/mods/gameserver/enums/RestartType;
  #192 = NameAndType        #193:#186     // CLAN_HALL:Lext/mods/gameserver/enums/RestartType;
  #193 = Utf8               CLAN_HALL
  #194 = Methodref          #195.#196     // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #195 = Class              #197          // ext/mods/gameserver/data/manager/ClanHallManager
  #196 = NameAndType        #198:#199     // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #197 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
  #198 = Utf8               getInstance
  #199 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
  #200 = Methodref          #195.#201     // ext/mods/gameserver/data/manager/ClanHallManager.getClanHallByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #201 = NameAndType        #202:#203     // getClanHallByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #202 = Utf8               getClanHallByOwner
  #203 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #204 = Fieldref           #205.#206     // ext/mods/gameserver/enums/SpawnType.OWNER:Lext/mods/gameserver/enums/SpawnType;
  #205 = Class              #207          // ext/mods/gameserver/enums/SpawnType
  #206 = NameAndType        #208:#209     // OWNER:Lext/mods/gameserver/enums/SpawnType;
  #207 = Utf8               ext/mods/gameserver/enums/SpawnType
  #208 = Utf8               OWNER
  #209 = Utf8               Lext/mods/gameserver/enums/SpawnType;
  #210 = Methodref          #211.#212     // ext/mods/gameserver/model/residence/clanhall/ClanHall.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #211 = Class              #213          // ext/mods/gameserver/model/residence/clanhall/ClanHall
  #212 = NameAndType        #214:#215     // getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #213 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
  #214 = Utf8               getRndSpawn
  #215 = Utf8               (Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #216 = Fieldref           #182.#217     // ext/mods/gameserver/enums/RestartType.CASTLE:Lext/mods/gameserver/enums/RestartType;
  #217 = NameAndType        #218:#186     // CASTLE:Lext/mods/gameserver/enums/RestartType;
  #218 = Utf8               CASTLE
  #219 = Methodref          #220.#221     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #220 = Class              #222          // ext/mods/gameserver/data/manager/CastleManager
  #221 = NameAndType        #198:#223     // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #222 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #223 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #224 = Methodref          #220.#225     // ext/mods/gameserver/data/manager/CastleManager.getCastleByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
  #225 = NameAndType        #226:#227     // getCastleByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
  #226 = Utf8               getCastleByOwner
  #227 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
  #228 = Methodref          #229.#212     // ext/mods/gameserver/model/residence/castle/Castle.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #229 = Class              #230          // ext/mods/gameserver/model/residence/castle/Castle
  #230 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #231 = Methodref          #220.#232     // ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #232 = NameAndType        #233:#234     // getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #233 = Utf8               getActiveSiege
  #234 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #235 = Class              #236          // ext/mods/gameserver/enums/SiegeSide
  #236 = Utf8               ext/mods/gameserver/enums/SiegeSide
  #237 = Fieldref           #235.#238     // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
  #238 = NameAndType        #239:#240     // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
  #239 = Utf8               DEFENDER
  #240 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
  #241 = Fieldref           #235.#242     // ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
  #242 = NameAndType        #208:#240     // OWNER:Lext/mods/gameserver/enums/SiegeSide;
  #243 = Methodref          #244.#245     // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
  #244 = Class              #246          // ext/mods/gameserver/model/residence/castle/Siege
  #245 = NameAndType        #247:#248     // checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
  #246 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #247 = Utf8               checkSides
  #248 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
  #249 = Methodref          #244.#250     // ext/mods/gameserver/model/residence/castle/Siege.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #250 = NameAndType        #251:#252     // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #251 = Utf8               getCastle
  #252 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
  #253 = Fieldref           #182.#254     // ext/mods/gameserver/enums/RestartType.SIEGE_FLAG:Lext/mods/gameserver/enums/RestartType;
  #254 = NameAndType        #255:#186     // SIEGE_FLAG:Lext/mods/gameserver/enums/RestartType;
  #255 = Utf8               SIEGE_FLAG
  #256 = Methodref          #244.#257     // ext/mods/gameserver/model/residence/castle/Siege.getFlag:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/actor/Npc;
  #257 = NameAndType        #258:#259     // getFlag:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/actor/Npc;
  #258 = Utf8               getFlag
  #259 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/actor/Npc;
  #260 = Methodref          #261.#93      // ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #261 = Class              #262          // ext/mods/gameserver/model/actor/Npc
  #262 = Utf8               ext/mods/gameserver/model/actor/Npc
  #263 = Methodref          #195.#264     // ext/mods/gameserver/data/manager/ClanHallManager.getActiveSiege:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #264 = NameAndType        #233:#265     // getActiveSiege:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #265 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #266 = Methodref          #267.#257     // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.getFlag:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/actor/Npc;
  #267 = Class              #268          // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
  #268 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
  #269 = Methodref          #270.#271     // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #270 = Class              #272          // ext/mods/gameserver/data/manager/ZoneManager
  #271 = NameAndType        #198:#273     // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #272 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
  #273 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
  #274 = Class              #275          // ext/mods/gameserver/model/zone/type/ArenaZone
  #275 = Utf8               ext/mods/gameserver/model/zone/type/ArenaZone
  #276 = Methodref          #270.#277     // ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #277 = NameAndType        #278:#279     // getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #278 = Utf8               getZone
  #279 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #280 = Fieldref           #205.#281     // ext/mods/gameserver/enums/SpawnType.CHAOTIC:Lext/mods/gameserver/enums/SpawnType;
  #281 = NameAndType        #282:#209     // CHAOTIC:Lext/mods/gameserver/enums/SpawnType;
  #282 = Utf8               CHAOTIC
  #283 = Fieldref           #205.#284     // ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
  #284 = NameAndType        #285:#209     // NORMAL:Lext/mods/gameserver/enums/SpawnType;
  #285 = Utf8               NORMAL
  #286 = Methodref          #274.#212     // ext/mods/gameserver/model/zone/type/ArenaZone.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #287 = Class              #288          // ext/mods/gameserver/model/zone/type/RandomZone
  #288 = Utf8               ext/mods/gameserver/model/zone/type/RandomZone
  #289 = Methodref          #287.#290     // ext/mods/gameserver/model/zone/type/RandomZone.isActive:()Z
  #290 = NameAndType        #291:#123     // isActive:()Z
  #291 = Utf8               isActive
  #292 = Methodref          #293.#294     // ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
  #293 = Class              #295          // ext/mods/Crypta/RandomManager
  #294 = NameAndType        #198:#296     // getInstance:()Lext/mods/Crypta/RandomManager;
  #295 = Utf8               ext/mods/Crypta/RandomManager
  #296 = Utf8               ()Lext/mods/Crypta/RandomManager;
  #297 = Methodref          #293.#298     // ext/mods/Crypta/RandomManager.isEventRunning:()Z
  #298 = NameAndType        #299:#123     // isEventRunning:()Z
  #299 = Utf8               isEventRunning
  #300 = Methodref          #301.#302     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #301 = Class              #303          // java/lang/Boolean
  #302 = NameAndType        #44:#304      // valueOf:(Z)Ljava/lang/Boolean;
  #303 = Utf8               java/lang/Boolean
  #304 = Utf8               (Z)Ljava/lang/Boolean;
  #305 = Methodref          #301.#306     // java/lang/Boolean.booleanValue:()Z
  #306 = NameAndType        #307:#123     // booleanValue:()Z
  #307 = Utf8               booleanValue
  #308 = Methodref          #287.#212     // ext/mods/gameserver/model/zone/type/RandomZone.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #309 = Class              #310          // java/lang/Exception
  #310 = Utf8               java/lang/Exception
  #311 = Methodref          #220.#312     // ext/mods/gameserver/data/manager/CastleManager.getCastle:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
  #312 = NameAndType        #251:#313     // getCastle:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
  #313 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
  #314 = Methodref          #229.#315     // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #315 = NameAndType        #316:#317     // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #316 = Utf8               getSiege
  #317 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
  #318 = Methodref          #244.#319     // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
  #319 = NameAndType        #320:#123     // isInProgress:()Z
  #320 = Utf8               isInProgress
  #321 = Methodref          #322.#323     // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #322 = Class              #324          // ext/mods/gameserver/data/manager/SevenSignsManager
  #323 = NameAndType        #198:#325     // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #324 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
  #325 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #326 = Methodref          #322.#327     // ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
  #327 = NameAndType        #328:#123     // isSealValidationPeriod:()Z
  #328 = Utf8               isSealValidationPeriod
  #329 = Fieldref           #330.#331     // ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
  #330 = Class              #332          // ext/mods/gameserver/enums/SealType
  #331 = NameAndType        #333:#334     // STRIFE:Lext/mods/gameserver/enums/SealType;
  #332 = Utf8               ext/mods/gameserver/enums/SealType
  #333 = Utf8               STRIFE
  #334 = Utf8               Lext/mods/gameserver/enums/SealType;
  #335 = Methodref          #322.#336     // ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #336 = NameAndType        #337:#338     // getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #337 = Utf8               getSealOwner
  #338 = Utf8               (Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #339 = Fieldref           #340.#341     // ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
  #340 = Class              #342          // ext/mods/gameserver/enums/CabalType
  #341 = NameAndType        #343:#344     // DAWN:Lext/mods/gameserver/enums/CabalType;
  #342 = Utf8               ext/mods/gameserver/enums/CabalType
  #343 = Utf8               DAWN
  #344 = Utf8               Lext/mods/gameserver/enums/CabalType;
  #345 = Fieldref           #205.#346     // ext/mods/gameserver/enums/SpawnType.OTHER:Lext/mods/gameserver/enums/SpawnType;
  #346 = NameAndType        #347:#209     // OTHER:Lext/mods/gameserver/enums/SpawnType;
  #347 = Utf8               OTHER
  #348 = Class              #349          // ext/mods/gameserver/scripting/script/siegablehall/FlagWar
  #349 = Utf8               ext/mods/gameserver/scripting/script/siegablehall/FlagWar
  #350 = Methodref          #348.#351     // ext/mods/gameserver/scripting/script/siegablehall/FlagWar.getClanRestartPoint:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/location/Location;
  #351 = NameAndType        #352:#353     // getClanRestartPoint:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/location/Location;
  #352 = Utf8               getClanRestartPoint
  #353 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/location/Location;
  #354 = Methodref          #11.#355      // ext/mods/gameserver/data/xml/RestartPointData.getNearestRestartLocation:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
  #355 = NameAndType        #356:#357     // getNearestRestartLocation:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
  #356 = Utf8               getNearestRestartLocation
  #357 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
  #358 = String             #359          // aden
  #359 = Utf8               aden
  #360 = Methodref          #128.#361     // ext/mods/gameserver/model/restart/RestartPoint.getLocName:()I
  #361 = NameAndType        #362:#39      // getLocName:()I
  #362 = Utf8               getLocName
  #363 = String             #364          // gludio
  #364 = Utf8               gludio
  #365 = String             #366          // gludin
  #366 = Utf8               gludin
  #367 = String             #368          // dion
  #368 = Utf8               dion
  #369 = String             #370          // giran
  #370 = Utf8               giran
  #371 = String             #372          // rune
  #372 = Utf8               rune
  #373 = String             #374          // godard
  #374 = Utf8               godard
  #375 = String             #376          // schuttgart
  #376 = Utf8               schuttgart
  #377 = Fieldref           #378.#379     // ext/mods/gameserver/data/xml/RestartPointData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/RestartPointData;
  #378 = Class              #380          // ext/mods/gameserver/data/xml/RestartPointData$SingletonHolder
  #379 = NameAndType        #381:#382     // INSTANCE:Lext/mods/gameserver/data/xml/RestartPointData;
  #380 = Utf8               ext/mods/gameserver/data/xml/RestartPointData$SingletonHolder
  #381 = Utf8               INSTANCE
  #382 = Utf8               Lext/mods/gameserver/data/xml/RestartPointData;
  #383 = Methodref          #128.#384     // ext/mods/gameserver/model/restart/RestartPoint.getName:()Ljava/lang/String;
  #384 = NameAndType        #385:#170     // getName:()Ljava/lang/String;
  #385 = Utf8               getName
  #386 = Methodref          #387.#388     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #387 = Class              #389          // java/lang/String
  #388 = NameAndType        #390:#391     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #389 = Utf8               java/lang/String
  #390 = Utf8               equalsIgnoreCase
  #391 = Utf8               (Ljava/lang/String;)Z
  #392 = Methodref          #89.#393      // ext/mods/gameserver/model/restart/RestartArea.isInside:(Lext/mods/gameserver/model/WorldObject;)Z
  #393 = NameAndType        #394:#395     // isInside:(Lext/mods/gameserver/model/WorldObject;)Z
  #394 = Utf8               isInside
  #395 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #396 = String             #397          // area
  #397 = Utf8               area
  #398 = InvokeDynamic      #3:#55        // #3:accept:(Lext/mods/gameserver/data/xml/RestartPointData;Ljava/util/List;)Ljava/util/function/Consumer;
  #399 = String             #400          // point
  #400 = Utf8               point
  #401 = InvokeDynamic      #4:#402       // #4:accept:(Lext/mods/gameserver/data/xml/RestartPointData;)Ljava/util/function/Consumer;
  #402 = NameAndType        #56:#403      // accept:(Lext/mods/gameserver/data/xml/RestartPointData;)Ljava/util/function/Consumer;
  #403 = Utf8               (Lext/mods/gameserver/data/xml/RestartPointData;)Ljava/util/function/Consumer;
  #404 = Class              #405          // ext/mods/commons/data/StatSet
  #405 = Utf8               ext/mods/commons/data/StatSet
  #406 = Methodref          #404.#3       // ext/mods/commons/data/StatSet."<init>":()V
  #407 = String             #408          // set
  #408 = Utf8               set
  #409 = InvokeDynamic      #5:#410       // #5:accept:(Lext/mods/gameserver/data/xml/RestartPointData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #410 = NameAndType        #56:#411      // accept:(Lext/mods/gameserver/data/xml/RestartPointData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #411 = Utf8               (Lext/mods/gameserver/data/xml/RestartPointData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #412 = String             #413          // points
  #413 = Utf8               points
  #414 = InterfaceMethodref #35.#415      // java/util/List.isEmpty:()Z
  #415 = NameAndType        #416:#123     // isEmpty:()Z
  #416 = Utf8               isEmpty
  #417 = Methodref          #418.#419     // java/util/Collections.emptyList:()Ljava/util/List;
  #418 = Class              #420          // java/util/Collections
  #419 = NameAndType        #421:#133     // emptyList:()Ljava/util/List;
  #420 = Utf8               java/util/Collections
  #421 = Utf8               emptyList
  #422 = Methodref          #404.#423     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/Object;)V
  #423 = NameAndType        #408:#424     // set:(Ljava/lang/String;Ljava/lang/Object;)V
  #424 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
  #425 = String             #426          // chaoPoints
  #426 = Utf8               chaoPoints
  #427 = String             #428          // mapRegions
  #428 = Utf8               mapRegions
  #429 = Methodref          #128.#430     // ext/mods/gameserver/model/restart/RestartPoint."<init>":(Lext/mods/commons/data/StatSet;)V
  #430 = NameAndType        #5:#431       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #431 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #432 = InterfaceMethodref #35.#433      // java/util/List.add:(Ljava/lang/Object;)Z
  #433 = NameAndType        #434:#435     // add:(Ljava/lang/Object;)Z
  #434 = Utf8               add
  #435 = Utf8               (Ljava/lang/Object;)Z
  #436 = InterfaceMethodref #437.#438     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #437 = Class              #439          // org/w3c/dom/Node
  #438 = NameAndType        #440:#441     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #439 = Utf8               org/w3c/dom/Node
  #440 = Utf8               getAttributes
  #441 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #442 = String             #443          // name
  #443 = Utf8               name
  #444 = Methodref          #11.#445      // ext/mods/gameserver/data/xml/RestartPointData.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #445 = NameAndType        #446:#447     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #446 = Utf8               parseString
  #447 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #448 = Methodref          #387.#449     // java/lang/String.hashCode:()I
  #449 = NameAndType        #450:#39      // hashCode:()I
  #450 = Utf8               hashCode
  #451 = Methodref          #387.#452     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #452 = NameAndType        #138:#435     // equals:(Ljava/lang/Object;)Z
  #453 = String             #454          // chaoPoint
  #454 = Utf8               chaoPoint
  #455 = String             #456          // map
  #456 = Utf8               map
  #457 = String             #458          // val
  #458 = Utf8               val
  #459 = Methodref          #11.#460      // ext/mods/gameserver/data/xml/RestartPointData.parseLocation:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/location/Location;
  #460 = NameAndType        #461:#462     // parseLocation:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/location/Location;
  #461 = Utf8               parseLocation
  #462 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/location/Location;
  #463 = Methodref          #11.#464      // ext/mods/gameserver/data/xml/RestartPointData.parseIntIntHolder:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #464 = NameAndType        #465:#466     // parseIntIntHolder:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #465 = Utf8               parseIntIntHolder
  #466 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #467 = Methodref          #404.#468     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
  #468 = NameAndType        #408:#469     // set:(Ljava/lang/String;Ljava/lang/String;)V
  #469 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #470 = Methodref          #11.#471      // ext/mods/gameserver/data/xml/RestartPointData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #471 = NameAndType        #472:#473     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #472 = Utf8               parseAttributes
  #473 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #474 = String             #475          // node
  #475 = Utf8               node
  #476 = InvokeDynamic      #6:#55        // #6:accept:(Lext/mods/gameserver/data/xml/RestartPointData;Ljava/util/List;)Ljava/util/function/Consumer;
  #477 = String             #478          // coords
  #478 = Utf8               coords
  #479 = Class              #480          // java/util/EnumMap
  #480 = Utf8               java/util/EnumMap
  #481 = Class              #482          // ext/mods/gameserver/enums/actors/ClassRace
  #482 = Utf8               ext/mods/gameserver/enums/actors/ClassRace
  #483 = Methodref          #479.#484     // java/util/EnumMap."<init>":(Ljava/lang/Class;)V
  #484 = NameAndType        #5:#485       // "<init>":(Ljava/lang/Class;)V
  #485 = Utf8               (Ljava/lang/Class;)V
  #486 = String             #487          // restart
  #487 = Utf8               restart
  #488 = InvokeDynamic      #7:#489       // #7:accept:(Lext/mods/gameserver/data/xml/RestartPointData;Ljava/util/EnumMap;)Ljava/util/function/Consumer;
  #489 = NameAndType        #56:#490      // accept:(Lext/mods/gameserver/data/xml/RestartPointData;Ljava/util/EnumMap;)Ljava/util/function/Consumer;
  #490 = Utf8               (Lext/mods/gameserver/data/xml/RestartPointData;Ljava/util/EnumMap;)Ljava/util/function/Consumer;
  #491 = String             #492          // classRestrictions
  #492 = Utf8               classRestrictions
  #493 = Methodref          #89.#430      // ext/mods/gameserver/model/restart/RestartArea."<init>":(Lext/mods/commons/data/StatSet;)V
  #494 = String             #495          // race
  #495 = Utf8               race
  #496 = Methodref          #11.#497      // ext/mods/gameserver/data/xml/RestartPointData.parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #497 = NameAndType        #498:#499     // parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #498 = Utf8               parseEnum
  #499 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #500 = String             #501          // zone
  #501 = Utf8               zone
  #502 = Methodref          #479.#503     // java/util/EnumMap.put:(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
  #503 = NameAndType        #504:#505     // put:(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
  #504 = Utf8               put
  #505 = Utf8               (Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
  #506 = Methodref          #11.#507      // ext/mods/gameserver/data/xml/RestartPointData.parsePoint2D:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Point2D;
  #507 = NameAndType        #508:#509     // parsePoint2D:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Point2D;
  #508 = Utf8               parsePoint2D
  #509 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Point2D;
  #510 = Class              #511          // ext/mods/commons/data/xml/IXmlReader
  #511 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #512 = Utf8               Signature
  #513 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/restart/RestartArea;>;
  #514 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/restart/RestartPoint;>;
  #515 = Utf8               Code
  #516 = Utf8               LineNumberTable
  #517 = Utf8               LocalVariableTable
  #518 = Utf8               this
  #519 = Utf8               parseDocument
  #520 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #521 = Utf8               doc
  #522 = Utf8               Lorg/w3c/dom/Document;
  #523 = Utf8               path
  #524 = Utf8               Ljava/nio/file/Path;
  #525 = Utf8               LocalVariableTypeTable
  #526 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
  #527 = Utf8               reload
  #528 = Utf8               getRestartAreas
  #529 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/restart/RestartArea;>;
  #530 = Utf8               getRestartPoints
  #531 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/restart/RestartPoint;>;
  #532 = Utf8               player
  #533 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #534 = Utf8               creature
  #535 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #536 = Utf8               iih
  #537 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #538 = Utf8               ra
  #539 = Utf8               Lext/mods/gameserver/model/restart/RestartPoint;
  #540 = Utf8               loc
  #541 = Utf8               Lext/mods/gameserver/model/location/Location;
  #542 = Utf8               rx
  #543 = Utf8               I
  #544 = Utf8               ry
  #545 = Utf8               StackMapTable
  #546 = Utf8               Ljava/lang/String;
  #547 = Utf8               getCalculatedRestartPoint
  #548 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartPoint;
  #549 = Utf8               Lext/mods/gameserver/model/restart/RestartArea;
  #550 = Utf8               restartPoint
  #551 = Utf8               getLocationToTeleport
  #552 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/RestartType;)Lext/mods/gameserver/model/location/Location;
  #553 = Utf8               ch
  #554 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #555 = Utf8               castle
  #556 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #557 = Utf8               siege
  #558 = Utf8               Lext/mods/gameserver/model/residence/castle/Siege;
  #559 = Utf8               flag
  #560 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #561 = Utf8               chs
  #562 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #563 = Utf8               zoneSpawn
  #564 = Utf8               isRunning
  #565 = Utf8               Ljava/lang/Boolean;
  #566 = Utf8               randomManager
  #567 = Utf8               Ljava/lang/Object;
  #568 = Utf8               e
  #569 = Utf8               Ljava/lang/Exception;
  #570 = Utf8               fwRestartPoint
  #571 = Utf8               fw
  #572 = Utf8               Lext/mods/gameserver/scripting/script/siegablehall/FlagWar;
  #573 = Utf8               teleportType
  #574 = Utf8               arena
  #575 = Utf8               Lext/mods/gameserver/model/zone/type/ArenaZone;
  #576 = Utf8               random
  #577 = Utf8               Lext/mods/gameserver/model/zone/type/RandomZone;
  #578 = Utf8               getAgitMap
  #579 = Utf8               ()Lext/mods/gameserver/data/xml/RestartPointData;
  #580 = Utf8               lambda$getRestartPointByName$0
  #581 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/restart/RestartPoint;)Z
  #582 = Utf8               rp
  #583 = Utf8               lambda$getRestartArea$0
  #584 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/restart/RestartArea;)Z
  #585 = Utf8               lambda$parseDocument$0
  #586 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #587 = Utf8               listNode
  #588 = Utf8               Lorg/w3c/dom/Node;
  #589 = Utf8               lambda$parseDocument$4
  #590 = Utf8               (Lorg/w3c/dom/Node;)V
  #591 = Utf8               pointNode
  #592 = Utf8               Lext/mods/commons/data/StatSet;
  #593 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #594 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #595 = Utf8               lambda$parseDocument$5
  #596 = Utf8               (Ljava/util/List;Ljava/util/List;Ljava/util/List;Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #597 = Utf8               s0$
  #598 = Utf8               tmp1$
  #599 = Utf8               setNode
  #600 = Utf8               setAttrs
  #601 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #602 = Class              #603          // org/w3c/dom/NamedNodeMap
  #603 = Utf8               org/w3c/dom/NamedNodeMap
  #604 = Utf8               lambda$parseDocument$1
  #605 = Utf8               areaNode
  #606 = Utf8               Ljava/util/EnumMap;
  #607 = Utf8               Ljava/util/EnumMap<Lext/mods/gameserver/enums/actors/ClassRace;Ljava/lang/String;>;
  #608 = Utf8               lambda$parseDocument$3
  #609 = Utf8               (Ljava/util/EnumMap;Lorg/w3c/dom/Node;)V
  #610 = Utf8               restartNode
  #611 = Utf8               nodeAttrs
  #612 = Utf8               lambda$parseDocument$2
  #613 = Utf8               nodeNode
  #614 = Utf8               SourceFile
  #615 = Utf8               RestartPointData.java
  #616 = Utf8               NestMembers
  #617 = Utf8               BootstrapMethods
  #618 = MethodType         #619          //  (Ljava/lang/Object;)V
  #619 = Utf8               (Ljava/lang/Object;)V
  #620 = MethodHandle       5:#621        // REF_invokeVirtual ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #621 = Methodref          #11.#622      // ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #622 = NameAndType        #585:#586     // lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #623 = MethodType         #590          //  (Lorg/w3c/dom/Node;)V
  #624 = MethodType         #435          //  (Ljava/lang/Object;)Z
  #625 = MethodHandle       6:#626        // REF_invokeStatic ext/mods/gameserver/data/xml/RestartPointData.lambda$getRestartArea$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/restart/RestartArea;)Z
  #626 = Methodref          #11.#627      // ext/mods/gameserver/data/xml/RestartPointData.lambda$getRestartArea$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/restart/RestartArea;)Z
  #627 = NameAndType        #583:#584     // lambda$getRestartArea$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/restart/RestartArea;)Z
  #628 = MethodType         #629          //  (Lext/mods/gameserver/model/restart/RestartArea;)Z
  #629 = Utf8               (Lext/mods/gameserver/model/restart/RestartArea;)Z
  #630 = MethodHandle       6:#631        // REF_invokeStatic ext/mods/gameserver/data/xml/RestartPointData.lambda$getRestartPointByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/restart/RestartPoint;)Z
  #631 = Methodref          #11.#632      // ext/mods/gameserver/data/xml/RestartPointData.lambda$getRestartPointByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/restart/RestartPoint;)Z
  #632 = NameAndType        #580:#581     // lambda$getRestartPointByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/restart/RestartPoint;)Z
  #633 = MethodType         #634          //  (Lext/mods/gameserver/model/restart/RestartPoint;)Z
  #634 = Utf8               (Lext/mods/gameserver/model/restart/RestartPoint;)Z
  #635 = MethodHandle       5:#636        // REF_invokeVirtual ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #636 = Methodref          #11.#637      // ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #637 = NameAndType        #604:#586     // lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #638 = MethodHandle       5:#639        // REF_invokeVirtual ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$4:(Lorg/w3c/dom/Node;)V
  #639 = Methodref          #11.#640      // ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$4:(Lorg/w3c/dom/Node;)V
  #640 = NameAndType        #589:#590     // lambda$parseDocument$4:(Lorg/w3c/dom/Node;)V
  #641 = MethodHandle       5:#642        // REF_invokeVirtual ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$5:(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #642 = Methodref          #11.#643      // ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$5:(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #643 = NameAndType        #595:#596     // lambda$parseDocument$5:(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #644 = MethodHandle       5:#645        // REF_invokeVirtual ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #645 = Methodref          #11.#646      // ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #646 = NameAndType        #612:#586     // lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #647 = MethodHandle       5:#648        // REF_invokeVirtual ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$3:(Ljava/util/EnumMap;Lorg/w3c/dom/Node;)V
  #648 = Methodref          #11.#649      // ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$3:(Ljava/util/EnumMap;Lorg/w3c/dom/Node;)V
  #649 = NameAndType        #608:#609     // lambda$parseDocument$3:(Ljava/util/EnumMap;Lorg/w3c/dom/Node;)V
  #650 = MethodHandle       6:#651        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #651 = Methodref          #652.#653     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #652 = Class              #654          // java/lang/invoke/LambdaMetafactory
  #653 = NameAndType        #655:#656     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #654 = Utf8               java/lang/invoke/LambdaMetafactory
  #655 = Utf8               metafactory
  #656 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #657 = Utf8               InnerClasses
  #658 = Utf8               SingletonHolder
  #659 = Class              #660          // java/lang/invoke/MethodHandles$Lookup
  #660 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #661 = Class              #662          // java/lang/invoke/MethodHandles
  #662 = Utf8               java/lang/invoke/MethodHandles
  #663 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.RestartPointData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _restartAreas:Ljava/util/List;
        15: aload_0
        16: new           #7                  // class java/util/ArrayList
        19: dup
        20: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        23: putfield      #16                 // Field _restartPoints:Ljava/util/List;
        26: aload_0
        27: invokevirtual #19                 // Method load:()V
        30: return
      LineNumberTable:
        line 73: 0
        line 69: 4
        line 70: 15
        line 74: 26
        line 75: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/xml/RestartPointData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #22                 // String xml/restartPointAreas.xml
         3: invokevirtual #24                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #28                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #32                 // String Loaded {} restart areas and {} restart points.
        11: iconst_2
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _restartAreas:Ljava/util/List;
        21: invokeinterface #34,  1           // InterfaceMethod java/util/List.size:()I
        26: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: dup
        31: iconst_1
        32: aload_0
        33: getfield      #16                 // Field _restartPoints:Ljava/util/List;
        36: invokeinterface #34,  1           // InterfaceMethod java/util/List.size:()I
        41: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        44: aastore
        45: invokevirtual #46                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        48: return
      LineNumberTable:
        line 80: 0
        line 81: 6
        line 82: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/data/xml/RestartPointData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: new           #7                  // class java/util/ArrayList
         3: dup
         4: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
         7: astore_3
         8: aload_0
         9: aload_1
        10: ldc           #52                 // String list
        12: aload_0
        13: aload_3
        14: invokedynamic #54,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/RestartPointData;Ljava/util/List;)Ljava/util/function/Consumer;
        19: invokevirtual #58                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        22: return
      LineNumberTable:
        line 87: 0
        line 89: 8
        line 151: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/data/xml/RestartPointData;
            0      23     1   doc   Lorg/w3c/dom/Document;
            0      23     2  path   Ljava/nio/file/Path;
            8      15     3 coords   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      15     3 coords   Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _restartAreas:Ljava/util/List;
         4: invokeinterface #62,  1           // InterfaceMethod java/util/List.clear:()V
         9: aload_0
        10: getfield      #16                 // Field _restartPoints:Ljava/util/List;
        13: invokeinterface #62,  1           // InterfaceMethod java/util/List.clear:()V
        18: aload_0
        19: invokevirtual #19                 // Method load:()V
        22: return
      LineNumberTable:
        line 155: 0
        line 156: 9
        line 158: 18
        line 159: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/data/xml/RestartPointData;

  public java.util.List<ext.mods.gameserver.model.restart.RestartArea> getRestartAreas();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _restartAreas:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 163: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/RestartPointData;
    Signature: #529                         // ()Ljava/util/List<Lext/mods/gameserver/model/restart/RestartArea;>;

  public java.util.List<ext.mods.gameserver.model.restart.RestartPoint> getRestartPoints();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _restartPoints:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 168: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/RestartPointData;
    Signature: #531                         // ()Ljava/util/List<Lext/mods/gameserver/model/restart/RestartPoint;>;

  public ext.mods.gameserver.model.restart.RestartArea getRestartArea(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartArea;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _restartAreas:Ljava/util/List;
         4: invokeinterface #65,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #69,  0             // InvokeDynamic #1:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        15: invokeinterface #73,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #79,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aconst_null
        26: invokevirtual #83                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #89                 // class ext/mods/gameserver/model/restart/RestartArea
        32: areturn
      LineNumberTable:
        line 177: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/xml/RestartPointData;
            0      33     1 player   Lext/mods/gameserver/model/actor/Player;

  public ext.mods.gameserver.model.restart.RestartPoint getRestartPoint(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         5: invokevirtual #97                 // Method getRestartPoint:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/restart/RestartPoint;
         8: areturn
      LineNumberTable:
        line 186: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/data/xml/RestartPointData;
            0       9     1 creature   Lext/mods/gameserver/model/actor/Creature;

  public ext.mods.gameserver.model.restart.RestartPoint getRestartPoint(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/restart/RestartPoint;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=2
         0: aload_1
         1: invokevirtual #101                // Method ext/mods/gameserver/model/location/Location.getX:()I
         4: ldc           #108                // int -131072
         6: isub
         7: ldc           #109                // int 32768
         9: idiv
        10: bipush        16
        12: iadd
        13: istore_2
        14: aload_1
        15: invokevirtual #110                // Method ext/mods/gameserver/model/location/Location.getY:()I
        18: ldc           #113                // int -262144
        20: isub
        21: ldc           #109                // int 32768
        23: idiv
        24: bipush        10
        26: iadd
        27: istore_3
        28: aload_0
        29: getfield      #16                 // Field _restartPoints:Ljava/util/List;
        32: invokeinterface #114,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        37: astore        4
        39: aload         4
        41: invokeinterface #118,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        46: ifeq          114
        49: aload         4
        51: invokeinterface #124,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        56: checkcast     #128                // class ext/mods/gameserver/model/restart/RestartPoint
        59: astore        5
        61: aload         5
        63: invokevirtual #130                // Method ext/mods/gameserver/model/restart/RestartPoint.getMapRegions:()Ljava/util/List;
        66: invokeinterface #114,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        71: astore        6
        73: aload         6
        75: invokeinterface #118,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        80: ifeq          111
        83: aload         6
        85: invokeinterface #124,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        90: checkcast     #134                // class ext/mods/gameserver/model/holder/IntIntHolder
        93: astore        7
        95: aload         7
        97: iload_2
        98: iload_3
        99: invokevirtual #136                // Method ext/mods/gameserver/model/holder/IntIntHolder.equals:(II)Z
       102: ifeq          108
       105: aload         5
       107: areturn
       108: goto          73
       111: goto          39
       114: aconst_null
       115: areturn
      LineNumberTable:
        line 195: 0
        line 196: 14
        line 198: 28
        line 200: 61
        line 201: 95
        line 202: 105
        line 201: 108
        line 203: 111
        line 204: 114
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           95      13     7   iih   Lext/mods/gameserver/model/holder/IntIntHolder;
           61      50     5    ra   Lext/mods/gameserver/model/restart/RestartPoint;
            0     116     0  this   Lext/mods/gameserver/data/xml/RestartPointData;
            0     116     1   loc   Lext/mods/gameserver/model/location/Location;
           14     102     2    rx   I
           28      88     3    ry   I
      StackMapTable: number_of_entries = 5
        frame_type = 254 /* append */
          offset_delta = 39
          locals = [ int, int, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/restart/RestartPoint, class java/util/Iterator ]
        frame_type = 34 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2

  public ext.mods.gameserver.model.restart.RestartPoint getRestartPointByName(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/restart/RestartPoint;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _restartPoints:Ljava/util/List;
         4: invokeinterface #65,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #140,  0            // InvokeDynamic #2:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        15: invokeinterface #73,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #79,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aconst_null
        26: invokevirtual #83                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #128                // class ext/mods/gameserver/model/restart/RestartPoint
        32: areturn
      LineNumberTable:
        line 213: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/xml/RestartPointData;
            0      33     1  name   Ljava/lang/String;

  public ext.mods.gameserver.model.restart.RestartPoint getCalculatedRestartPoint(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartPoint;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #143                // Method getRestartArea:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartArea;
         5: astore_2
         6: aload_2
         7: ifnull        20
        10: aload_0
        11: aload_2
        12: aload_1
        13: invokevirtual #147                // Method ext/mods/gameserver/model/restart/RestartArea.getClassRestriction:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
        16: invokevirtual #151                // Method getRestartPointByName:(Ljava/lang/String;)Lext/mods/gameserver/model/restart/RestartPoint;
        19: areturn
        20: aload_0
        21: aload_1
        22: invokevirtual #155                // Method getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
        25: astore_3
        26: aload_3
        27: ifnonnull     32
        30: aconst_null
        31: areturn
        32: aload_3
        33: invokevirtual #158                // Method ext/mods/gameserver/model/restart/RestartPoint.getBannedRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        36: aload_1
        37: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        40: if_acmpne     52
        43: aload_0
        44: aload_3
        45: invokevirtual #167                // Method ext/mods/gameserver/model/restart/RestartPoint.getBannedPoint:()Ljava/lang/String;
        48: invokevirtual #151                // Method getRestartPointByName:(Ljava/lang/String;)Lext/mods/gameserver/model/restart/RestartPoint;
        51: astore_3
        52: aload_3
        53: areturn
      LineNumberTable:
        line 223: 0
        line 224: 6
        line 225: 10
        line 227: 20
        line 228: 26
        line 229: 30
        line 231: 32
        line 232: 43
        line 234: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      54     0  this   Lext/mods/gameserver/data/xml/RestartPointData;
            0      54     1 player   Lext/mods/gameserver/model/actor/Player;
            6      48     2  area   Lext/mods/gameserver/model/restart/RestartArea;
           26      28     3 restartPoint   Lext/mods/gameserver/model/restart/RestartPoint;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/restart/RestartArea ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/model/restart/RestartPoint ]
        frame_type = 19 /* same */

  public ext.mods.gameserver.model.location.Location getNearestRestartLocation(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #143                // Method getRestartArea:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/restart/RestartArea;
         5: astore_3
         6: aload_3
         7: ifnull        45
        10: aload_0
        11: aload_3
        12: aload_1
        13: invokevirtual #147                // Method ext/mods/gameserver/model/restart/RestartArea.getClassRestriction:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
        16: invokevirtual #151                // Method getRestartPointByName:(Ljava/lang/String;)Lext/mods/gameserver/model/restart/RestartPoint;
        19: astore_2
        20: aload_2
        21: ifnonnull     26
        24: aconst_null
        25: areturn
        26: aload_1
        27: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        30: ifle          40
        33: aload_2
        34: invokevirtual #174                // Method ext/mods/gameserver/model/restart/RestartPoint.getRandomChaoPoint:()Lext/mods/gameserver/model/location/Location;
        37: goto          44
        40: aload_2
        41: invokevirtual #178                // Method ext/mods/gameserver/model/restart/RestartPoint.getRandomPoint:()Lext/mods/gameserver/model/location/Location;
        44: areturn
        45: aload_0
        46: aload_1
        47: invokevirtual #155                // Method getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
        50: astore_2
        51: aload_2
        52: ifnonnull     57
        55: aconst_null
        56: areturn
        57: aload_2
        58: invokevirtual #158                // Method ext/mods/gameserver/model/restart/RestartPoint.getBannedRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        61: aload_1
        62: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        65: if_acmpne     77
        68: aload_0
        69: aload_2
        70: invokevirtual #167                // Method ext/mods/gameserver/model/restart/RestartPoint.getBannedPoint:()Ljava/lang/String;
        73: invokevirtual #151                // Method getRestartPointByName:(Ljava/lang/String;)Lext/mods/gameserver/model/restart/RestartPoint;
        76: astore_2
        77: aload_2
        78: ifnonnull     83
        81: aconst_null
        82: areturn
        83: aload_1
        84: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        87: ifle          97
        90: aload_2
        91: invokevirtual #174                // Method ext/mods/gameserver/model/restart/RestartPoint.getRandomChaoPoint:()Lext/mods/gameserver/model/location/Location;
        94: goto          101
        97: aload_2
        98: invokevirtual #178                // Method ext/mods/gameserver/model/restart/RestartPoint.getRandomPoint:()Lext/mods/gameserver/model/location/Location;
       101: areturn
      LineNumberTable:
        line 246: 0
        line 247: 6
        line 249: 10
        line 250: 20
        line 251: 24
        line 253: 26
        line 256: 45
        line 257: 51
        line 258: 55
        line 260: 57
        line 261: 68
        line 263: 77
        line 264: 81
        line 266: 83
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20      25     2 restartPoint   Lext/mods/gameserver/model/restart/RestartPoint;
            0     102     0  this   Lext/mods/gameserver/data/xml/RestartPointData;
            0     102     1 player   Lext/mods/gameserver/model/actor/Player;
           51      51     2 restartPoint   Lext/mods/gameserver/model/restart/RestartPoint;
            6      96     3  area   Lext/mods/gameserver/model/restart/RestartArea;
      StackMapTable: number_of_entries = 9
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/restart/RestartPoint, class ext/mods/gameserver/model/restart/RestartArea ]
        frame_type = 13 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/data/xml/RestartPointData, class ext/mods/gameserver/model/actor/Player, top, class ext/mods/gameserver/model/restart/RestartArea ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/data/xml/RestartPointData, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/restart/RestartPoint, class ext/mods/gameserver/model/restart/RestartArea ]
          stack = []
        frame_type = 19 /* same */
        frame_type = 5 /* same */
        frame_type = 13 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/location/Location ]

  public ext.mods.gameserver.model.location.Location getLocationToTeleport(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.enums.RestartType);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/RestartType;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=3
         0: aload_2
         1: getstatic     #181                // Field ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
         4: if_acmpeq     210
         7: aload_1
         8: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        11: ifnull        210
        14: aload_2
        15: getstatic     #191                // Field ext/mods/gameserver/enums/RestartType.CLAN_HALL:Lext/mods/gameserver/enums/RestartType;
        18: if_acmpne     47
        21: invokestatic  #194                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
        24: aload_1
        25: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        28: invokevirtual #200                // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHallByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        31: astore_3
        32: aload_3
        33: ifnull        44
        36: aload_3
        37: getstatic     #204                // Field ext/mods/gameserver/enums/SpawnType.OWNER:Lext/mods/gameserver/enums/SpawnType;
        40: invokevirtual #210                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
        43: areturn
        44: goto          210
        47: aload_2
        48: getstatic     #216                // Field ext/mods/gameserver/enums/RestartType.CASTLE:Lext/mods/gameserver/enums/RestartType;
        51: if_acmpne     134
        54: invokestatic  #219                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        57: aload_1
        58: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        61: invokevirtual #224                // Method ext/mods/gameserver/data/manager/CastleManager.getCastleByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
        64: astore_3
        65: aload_3
        66: ifnull        77
        69: aload_3
        70: getstatic     #204                // Field ext/mods/gameserver/enums/SpawnType.OWNER:Lext/mods/gameserver/enums/SpawnType;
        73: invokevirtual #228                // Method ext/mods/gameserver/model/residence/castle/Castle.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
        76: areturn
        77: invokestatic  #219                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        80: aload_1
        81: invokevirtual #231                // Method ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
        84: astore        4
        86: aload         4
        88: ifnull        131
        91: aload         4
        93: aload_1
        94: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        97: iconst_2
        98: anewarray     #235                // class ext/mods/gameserver/enums/SiegeSide
       101: dup
       102: iconst_0
       103: getstatic     #237                // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
       106: aastore
       107: dup
       108: iconst_1
       109: getstatic     #241                // Field ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
       112: aastore
       113: invokevirtual #243                // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
       116: ifeq          131
       119: aload         4
       121: invokevirtual #249                // Method ext/mods/gameserver/model/residence/castle/Siege.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       124: getstatic     #204                // Field ext/mods/gameserver/enums/SpawnType.OWNER:Lext/mods/gameserver/enums/SpawnType;
       127: invokevirtual #228                // Method ext/mods/gameserver/model/residence/castle/Castle.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
       130: areturn
       131: goto          210
       134: aload_2
       135: getstatic     #253                // Field ext/mods/gameserver/enums/RestartType.SIEGE_FLAG:Lext/mods/gameserver/enums/RestartType;
       138: if_acmpne     210
       141: invokestatic  #219                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       144: aload_1
       145: invokevirtual #231                // Method ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
       148: astore_3
       149: aload_3
       150: ifnull        174
       153: aload_3
       154: aload_1
       155: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       158: invokevirtual #256                // Method ext/mods/gameserver/model/residence/castle/Siege.getFlag:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/actor/Npc;
       161: astore        4
       163: aload         4
       165: ifnull        174
       168: aload         4
       170: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       173: areturn
       174: invokestatic  #194                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       177: aload_1
       178: invokevirtual #263                // Method ext/mods/gameserver/data/manager/ClanHallManager.getActiveSiege:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
       181: astore        4
       183: aload         4
       185: ifnull        210
       188: aload         4
       190: aload_1
       191: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       194: invokevirtual #266                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.getFlag:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/actor/Npc;
       197: astore        5
       199: aload         5
       201: ifnull        210
       204: aload         5
       206: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       209: areturn
       210: invokestatic  #269                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       213: aload_1
       214: ldc_w         #274                // class ext/mods/gameserver/model/zone/type/ArenaZone
       217: invokevirtual #276                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
       220: checkcast     #274                // class ext/mods/gameserver/model/zone/type/ArenaZone
       223: astore_3
       224: aload_3
       225: ifnull        249
       228: aload_3
       229: aload_1
       230: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       233: ifle          242
       236: getstatic     #280                // Field ext/mods/gameserver/enums/SpawnType.CHAOTIC:Lext/mods/gameserver/enums/SpawnType;
       239: goto          245
       242: getstatic     #283                // Field ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
       245: invokevirtual #286                // Method ext/mods/gameserver/model/zone/type/ArenaZone.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
       248: areturn
       249: invokestatic  #269                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       252: aload_1
       253: ldc_w         #287                // class ext/mods/gameserver/model/zone/type/RandomZone
       256: invokevirtual #276                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
       259: checkcast     #287                // class ext/mods/gameserver/model/zone/type/RandomZone
       262: astore        4
       264: aload         4
       266: ifnull        420
       269: aload         4
       271: invokevirtual #289                // Method ext/mods/gameserver/model/zone/type/RandomZone.isActive:()Z
       274: ifeq          348
       277: invokestatic  #292                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       280: astore        5
       282: aload         5
       284: ifnull        345
       287: invokestatic  #292                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       290: invokevirtual #297                // Method ext/mods/Crypta/RandomManager.isEventRunning:()Z
       293: invokestatic  #300                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       296: astore        6
       298: aload         6
       300: ifnull        314
       303: aload         6
       305: invokevirtual #305                // Method java/lang/Boolean.booleanValue:()Z
       308: ifeq          314
       311: goto          345
       314: aload         4
       316: aload_1
       317: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       320: ifle          329
       323: getstatic     #280                // Field ext/mods/gameserver/enums/SpawnType.CHAOTIC:Lext/mods/gameserver/enums/SpawnType;
       326: goto          332
       329: getstatic     #283                // Field ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
       332: invokevirtual #308                // Method ext/mods/gameserver/model/zone/type/RandomZone.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
       335: astore        7
       337: aload         7
       339: ifnull        345
       342: aload         7
       344: areturn
       345: goto          379
       348: aload         4
       350: aload_1
       351: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       354: ifle          363
       357: getstatic     #280                // Field ext/mods/gameserver/enums/SpawnType.CHAOTIC:Lext/mods/gameserver/enums/SpawnType;
       360: goto          366
       363: getstatic     #283                // Field ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
       366: invokevirtual #308                // Method ext/mods/gameserver/model/zone/type/RandomZone.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
       369: astore        5
       371: aload         5
       373: ifnull        379
       376: aload         5
       378: areturn
       379: goto          420
       382: astore        5
       384: aload         4
       386: aload_1
       387: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       390: ifle          399
       393: getstatic     #280                // Field ext/mods/gameserver/enums/SpawnType.CHAOTIC:Lext/mods/gameserver/enums/SpawnType;
       396: goto          402
       399: getstatic     #283                // Field ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
       402: invokevirtual #308                // Method ext/mods/gameserver/model/zone/type/RandomZone.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
       405: astore        6
       407: aload         6
       409: ifnull        415
       412: aload         6
       414: areturn
       415: goto          420
       418: astore        6
       420: invokestatic  #219                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       423: aload_1
       424: invokevirtual #311                // Method ext/mods/gameserver/data/manager/CastleManager.getCastle:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
       427: astore        5
       429: aload         5
       431: ifnull        491
       434: aload         5
       436: invokevirtual #314                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       439: invokevirtual #318                // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
       442: ifeq          491
       445: invokestatic  #321                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       448: invokevirtual #326                // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
       451: ifeq          491
       454: invokestatic  #321                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       457: getstatic     #329                // Field ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
       460: invokevirtual #335                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
       463: getstatic     #339                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       466: if_acmpne     491
       469: aload         5
       471: aload_1
       472: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       475: ifle          484
       478: getstatic     #280                // Field ext/mods/gameserver/enums/SpawnType.CHAOTIC:Lext/mods/gameserver/enums/SpawnType;
       481: goto          487
       484: getstatic     #345                // Field ext/mods/gameserver/enums/SpawnType.OTHER:Lext/mods/gameserver/enums/SpawnType;
       487: invokevirtual #228                // Method ext/mods/gameserver/model/residence/castle/Castle.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
       490: areturn
       491: invokestatic  #194                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       494: aload_1
       495: invokevirtual #263                // Method ext/mods/gameserver/data/manager/ClanHallManager.getActiveSiege:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
       498: astore        6
       500: aload         6
       502: instanceof    #348                // class ext/mods/gameserver/scripting/script/siegablehall/FlagWar
       505: ifeq          534
       508: aload         6
       510: checkcast     #348                // class ext/mods/gameserver/scripting/script/siegablehall/FlagWar
       513: astore        7
       515: aload         7
       517: aload_1
       518: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       521: invokevirtual #350                // Method ext/mods/gameserver/scripting/script/siegablehall/FlagWar.getClanRestartPoint:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/location/Location;
       524: astore        8
       526: aload         8
       528: ifnull        534
       531: aload         8
       533: areturn
       534: aload_0
       535: aload_1
       536: invokevirtual #354                // Method getNearestRestartLocation:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
       539: areturn
      Exception table:
         from    to  target type
           269   344   382   Class java/lang/Exception
           345   378   382   Class java/lang/Exception
           384   414   418   Class java/lang/Exception
      LineNumberTable:
        line 276: 0
        line 278: 14
        line 280: 21
        line 281: 32
        line 282: 36
        line 283: 44
        line 284: 47
        line 286: 54
        line 287: 65
        line 288: 69
        line 290: 77
        line 291: 86
        line 292: 119
        line 293: 131
        line 294: 134
        line 296: 141
        line 297: 149
        line 299: 153
        line 300: 163
        line 301: 168
        line 304: 174
        line 305: 183
        line 307: 188
        line 308: 199
        line 309: 204
        line 314: 210
        line 315: 224
        line 316: 228
        line 318: 249
        line 319: 264
        line 323: 269
        line 325: 277
        line 326: 282
        line 328: 287
        line 329: 298
        line 334: 314
        line 335: 337
        line 336: 342
        line 339: 345
        line 342: 348
        line 343: 371
        line 344: 376
        line 358: 379
        line 347: 382
        line 351: 384
        line 352: 407
        line 353: 412
        line 357: 415
        line 355: 418
        line 362: 420
        line 363: 429
        line 364: 469
        line 366: 491
        line 367: 500
        line 369: 515
        line 370: 526
        line 371: 531
        line 374: 534
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           32      12     3    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
           65      66     3 castle   Lext/mods/gameserver/model/residence/castle/Castle;
           86      45     4 siege   Lext/mods/gameserver/model/residence/castle/Siege;
          163      11     4  flag   Lext/mods/gameserver/model/actor/Npc;
          199      11     5  flag   Lext/mods/gameserver/model/actor/Npc;
          149      61     3 siege   Lext/mods/gameserver/model/residence/castle/Siege;
          183      27     4   chs   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
          337       8     7 zoneSpawn   Lext/mods/gameserver/model/location/Location;
          298      47     6 isRunning   Ljava/lang/Boolean;
          282      63     5 randomManager   Ljava/lang/Object;
          371       8     5 zoneSpawn   Lext/mods/gameserver/model/location/Location;
          407       8     6 zoneSpawn   Lext/mods/gameserver/model/location/Location;
          384      36     5     e   Ljava/lang/Exception;
          526       8     8 fwRestartPoint   Lext/mods/gameserver/model/location/Location;
          515      19     7    fw   Lext/mods/gameserver/scripting/script/siegablehall/FlagWar;
            0     540     0  this   Lext/mods/gameserver/data/xml/RestartPointData;
            0     540     1 player   Lext/mods/gameserver/model/actor/Player;
            0     540     2 teleportType   Lext/mods/gameserver/enums/RestartType;
          224     316     3 arena   Lext/mods/gameserver/model/zone/type/ArenaZone;
          264     276     4 random   Lext/mods/gameserver/model/zone/type/RandomZone;
          429     111     5 castle   Lext/mods/gameserver/model/residence/castle/Castle;
          500      40     6   chs   Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
      StackMapTable: number_of_entries = 28
        frame_type = 44 /* same */
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 250 /* chop */
          offset_delta = 53
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege ]
        frame_type = 250 /* chop */
          offset_delta = 35
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/data/xml/RestartPointData, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/RestartType, class ext/mods/gameserver/model/zone/type/ArenaZone ]
          stack = [ class ext/mods/gameserver/model/zone/type/ArenaZone ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/data/xml/RestartPointData, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/RestartType, class ext/mods/gameserver/model/zone/type/ArenaZone ]
          stack = [ class ext/mods/gameserver/model/zone/type/ArenaZone, class ext/mods/gameserver/enums/SpawnType ]
        frame_type = 3 /* same */
        frame_type = 254 /* append */
          offset_delta = 64
          locals = [ class ext/mods/gameserver/model/zone/type/RandomZone, class java/lang/Object, class java/lang/Boolean ]
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/zone/type/RandomZone ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/data/xml/RestartPointData, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/RestartType, class ext/mods/gameserver/model/zone/type/ArenaZone, class ext/mods/gameserver/model/zone/type/RandomZone, class java/lang/Object, class java/lang/Boolean ]
          stack = [ class ext/mods/gameserver/model/zone/type/RandomZone, class ext/mods/gameserver/enums/SpawnType ]
        frame_type = 249 /* chop */
          offset_delta = 12
        frame_type = 2 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/zone/type/RandomZone ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/data/xml/RestartPointData, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/RestartType, class ext/mods/gameserver/model/zone/type/ArenaZone, class ext/mods/gameserver/model/zone/type/RandomZone ]
          stack = [ class ext/mods/gameserver/model/zone/type/RandomZone, class ext/mods/gameserver/enums/SpawnType ]
        frame_type = 12 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/xml/RestartPointData, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/RestartType, class ext/mods/gameserver/model/zone/type/ArenaZone, class ext/mods/gameserver/model/zone/type/RandomZone, class java/lang/Exception ]
          stack = [ class ext/mods/gameserver/model/zone/type/RandomZone ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/data/xml/RestartPointData, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/RestartType, class ext/mods/gameserver/model/zone/type/ArenaZone, class ext/mods/gameserver/model/zone/type/RandomZone, class java/lang/Exception ]
          stack = [ class ext/mods/gameserver/model/zone/type/RandomZone, class ext/mods/gameserver/enums/SpawnType ]
        frame_type = 12 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/data/xml/RestartPointData, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/RestartType, class ext/mods/gameserver/model/zone/type/ArenaZone, class ext/mods/gameserver/model/zone/type/RandomZone, class ext/mods/gameserver/model/residence/castle/Castle ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/data/xml/RestartPointData, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/RestartType, class ext/mods/gameserver/model/zone/type/ArenaZone, class ext/mods/gameserver/model/zone/type/RandomZone, class ext/mods/gameserver/model/residence/castle/Castle ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/enums/SpawnType ]
        frame_type = 3 /* same */
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallSiege ]

  public final java.lang.String getAgitMap(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #155                // Method getRestartPoint:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/restart/RestartPoint;
         5: astore_2
         6: aload_2
         7: ifnonnull     14
        10: ldc_w         #358                // String aden
        13: areturn
        14: aload_2
        15: invokevirtual #360                // Method ext/mods/gameserver/model/restart/RestartPoint.getLocName:()I
        18: lookupswitch  { // 7

                     911: 88

                     912: 84

                     916: 92

                     918: 96

                    1537: 100

                    1538: 104

                    1714: 108
                 default: 112
            }
        84: ldc_w         #363                // String gludio
        87: areturn
        88: ldc_w         #365                // String gludin
        91: areturn
        92: ldc_w         #367                // String dion
        95: areturn
        96: ldc_w         #369                // String giran
        99: areturn
       100: ldc_w         #371                // String rune
       103: areturn
       104: ldc_w         #373                // String godard
       107: areturn
       108: ldc_w         #375                // String schuttgart
       111: areturn
       112: ldc_w         #358                // String aden
       115: areturn
      LineNumberTable:
        line 383: 0
        line 384: 6
        line 385: 10
        line 387: 14
        line 390: 84
        line 393: 88
        line 396: 92
        line 399: 96
        line 402: 100
        line 405: 104
        line 408: 108
        line 411: 112
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     116     0  this   Lext/mods/gameserver/data/xml/RestartPointData;
            0     116     1 player   Lext/mods/gameserver/model/actor/Player;
            6     110     2 restartPoint   Lext/mods/gameserver/model/restart/RestartPoint;
      StackMapTable: number_of_entries = 9
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/restart/RestartPoint ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 69
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */

  public static ext.mods.gameserver.data.xml.RestartPointData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/RestartPointData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #377                // Field ext/mods/gameserver/data/xml/RestartPointData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/RestartPointData;
         3: areturn
      LineNumberTable:
        line 417: 0
}
SourceFile: "RestartPointData.java"
NestMembers:
  ext/mods/gameserver/data/xml/RestartPointData$SingletonHolder
BootstrapMethods:
  0: #650 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #618 (Ljava/lang/Object;)V
      #620 REF_invokeVirtual ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #623 (Lorg/w3c/dom/Node;)V
  1: #650 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #624 (Ljava/lang/Object;)Z
      #625 REF_invokeStatic ext/mods/gameserver/data/xml/RestartPointData.lambda$getRestartArea$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/restart/RestartArea;)Z
      #628 (Lext/mods/gameserver/model/restart/RestartArea;)Z
  2: #650 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #624 (Ljava/lang/Object;)Z
      #630 REF_invokeStatic ext/mods/gameserver/data/xml/RestartPointData.lambda$getRestartPointByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/restart/RestartPoint;)Z
      #633 (Lext/mods/gameserver/model/restart/RestartPoint;)Z
  3: #650 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #618 (Ljava/lang/Object;)V
      #635 REF_invokeVirtual ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #623 (Lorg/w3c/dom/Node;)V
  4: #650 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #618 (Ljava/lang/Object;)V
      #638 REF_invokeVirtual ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$4:(Lorg/w3c/dom/Node;)V
      #623 (Lorg/w3c/dom/Node;)V
  5: #650 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #618 (Ljava/lang/Object;)V
      #641 REF_invokeVirtual ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$5:(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #623 (Lorg/w3c/dom/Node;)V
  6: #650 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #618 (Ljava/lang/Object;)V
      #644 REF_invokeVirtual ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #623 (Lorg/w3c/dom/Node;)V
  7: #650 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #618 (Ljava/lang/Object;)V
      #647 REF_invokeVirtual ext/mods/gameserver/data/xml/RestartPointData.lambda$parseDocument$3:(Ljava/util/EnumMap;Lorg/w3c/dom/Node;)V
      #623 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #663= #659 of #661; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
