// Bytecode for: ext.mods.gameserver.model.entity.autofarm.ZoneBuilder
// File: ext\mods\gameserver\model\entity\autofarm\ZoneBuilder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.class
  Last modified 9 de jul de 2026; size 11062 bytes
  MD5 checksum 2b2a9c9632fada9e3c3ce5f3a4064676
  Compiled from "ZoneBuilder.java"
public class ext.mods.gameserver.model.entity.autofarm.ZoneBuilder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 24, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // ZoneBuilder
    #8 = Utf8               ZoneBuilder
    #9 = Methodref          #10.#11       // ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #10 = Class              #12           // ext/mods/gameserver/model/actor/Player
   #11 = NameAndType        #13:#14       // getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #12 = Utf8               ext/mods/gameserver/model/actor/Player
   #13 = Utf8               getDebugPacket
   #14 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #15 = String             #16           // ZBCylinder
   #16 = Utf8               ZBCylinder
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getDebugPacket:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #18 = Class              #20           // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder
   #19 = NameAndType        #13:#21       // getDebugPacket:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #20 = Utf8               ext/mods/gameserver/model/entity/autofarm/ZoneBuilder
   #21 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #22 = Methodref          #23.#24       // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.getPoints:()Ljava/util/Map;
   #23 = Class              #25           // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #24 = NameAndType        #26:#27       // getPoints:()Ljava/util/Map;
   #25 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #26 = Utf8               getPoints
   #27 = Utf8               ()Ljava/util/Map;
   #28 = Class              #29           // java/util/ArrayList
   #29 = Utf8               java/util/ArrayList
   #30 = Methodref          #18.#31       // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
   #31 = NameAndType        #26:#32       // getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
   #32 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
   #33 = InterfaceMethodref #34.#35       // java/util/Map.values:()Ljava/util/Collection;
   #34 = Class              #36           // java/util/Map
   #35 = NameAndType        #37:#38       // values:()Ljava/util/Collection;
   #36 = Utf8               java/util/Map
   #37 = Utf8               values
   #38 = Utf8               ()Ljava/util/Collection;
   #39 = Methodref          #28.#40       // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
   #40 = NameAndType        #5:#41        // "<init>":(Ljava/util/Collection;)V
   #41 = Utf8               (Ljava/util/Collection;)V
   #42 = Methodref          #10.#43       // ext/mods/gameserver/model/actor/Player.clearDebugPackets:()V
   #43 = NameAndType        #44:#6        // clearDebugPackets:()V
   #44 = Utf8               clearDebugPackets
   #45 = Methodref          #18.#46       // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getDebugPacket2:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #46 = NameAndType        #47:#21       // getDebugPacket2:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #47 = Utf8               getDebugPacket2
   #48 = Methodref          #23.#49       // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
   #49 = NameAndType        #50:#6        // reset:()V
   #50 = Utf8               reset
   #51 = Methodref          #23.#52       // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
   #52 = NameAndType        #53:#54       // sendTo:(Lext/mods/gameserver/model/actor/Player;)V
   #53 = Utf8               sendTo
   #54 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #55 = InterfaceMethodref #56.#57       // java/util/List.iterator:()Ljava/util/Iterator;
   #56 = Class              #58           // java/util/List
   #57 = NameAndType        #59:#60       // iterator:()Ljava/util/Iterator;
   #58 = Utf8               java/util/List
   #59 = Utf8               iterator
   #60 = Utf8               ()Ljava/util/Iterator;
   #61 = InterfaceMethodref #62.#63       // java/util/Iterator.hasNext:()Z
   #62 = Class              #64           // java/util/Iterator
   #63 = NameAndType        #65:#66       // hasNext:()Z
   #64 = Utf8               java/util/Iterator
   #65 = Utf8               hasNext
   #66 = Utf8               ()Z
   #67 = InterfaceMethodref #62.#68       // java/util/Iterator.next:()Ljava/lang/Object;
   #68 = NameAndType        #69:#70       // next:()Ljava/lang/Object;
   #69 = Utf8               next
   #70 = Utf8               ()Ljava/lang/Object;
   #71 = Class              #72           // ext/mods/gameserver/model/location/Location
   #72 = Utf8               ext/mods/gameserver/model/location/Location
   #73 = Methodref          #18.#74       // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.addPoint:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/location/Location;)V
   #74 = NameAndType        #75:#76       // addPoint:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/location/Location;)V
   #75 = Utf8               addPoint
   #76 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/location/Location;)V
   #77 = Methodref          #78.#79       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #78 = Class              #80           // java/lang/Integer
   #79 = NameAndType        #81:#82       // valueOf:(I)Ljava/lang/Integer;
   #80 = Utf8               java/lang/Integer
   #81 = Utf8               valueOf
   #82 = Utf8               (I)Ljava/lang/Integer;
   #83 = InterfaceMethodref #34.#84       // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #84 = NameAndType        #85:#86       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #85 = Utf8               remove
   #86 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #87 = InterfaceMethodref #34.#88       // java/util/Map.isEmpty:()Z
   #88 = NameAndType        #89:#66       // isEmpty:()Z
   #89 = Utf8               isEmpty
   #90 = InvokeDynamic      #0:#91        // #0:run:(Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #91 = NameAndType        #92:#93       // run:(Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #92 = Utf8               run
   #93 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
   #94 = Methodref          #95.#96       // ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
   #95 = Class              #97           // ext/mods/commons/pool/ThreadPool
   #96 = NameAndType        #98:#99       // execute:(Ljava/lang/Runnable;)V
   #97 = Utf8               ext/mods/commons/pool/ThreadPool
   #98 = Utf8               execute
   #99 = Utf8               (Ljava/lang/Runnable;)V
  #100 = Methodref          #18.#101      // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.getPointsLoc:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #101 = NameAndType        #102:#103     // getPointsLoc:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #102 = Utf8               getPointsLoc
  #103 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #104 = InvokeDynamic      #1:#105       // #1:accept:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/function/Consumer;
  #105 = NameAndType        #106:#107     // accept:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/function/Consumer;
  #106 = Utf8               accept
  #107 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/function/Consumer;
  #108 = InterfaceMethodref #56.#109      // java/util/List.forEach:(Ljava/util/function/Consumer;)V
  #109 = NameAndType        #110:#111     // forEach:(Ljava/util/function/Consumer;)V
  #110 = Utf8               forEach
  #111 = Utf8               (Ljava/util/function/Consumer;)V
  #112 = Methodref          #113.#114     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #113 = Class              #115          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #114 = NameAndType        #116:#117     // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #115 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #116 = Utf8               getInstance
  #117 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #118 = Methodref          #113.#119     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showZoneWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #119 = NameAndType        #120:#54      // showZoneWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #120 = Utf8               showZoneWindow
  #121 = InterfaceMethodref #34.#122      // java/util/Map.size:()I
  #122 = NameAndType        #123:#124     // size:()I
  #123 = Utf8               size
  #124 = Utf8               ()I
  #125 = Methodref          #126.#127     // java/lang/String.valueOf:(I)Ljava/lang/String;
  #126 = Class              #128          // java/lang/String
  #127 = NameAndType        #81:#129      // valueOf:(I)Ljava/lang/String;
  #128 = Utf8               java/lang/String
  #129 = Utf8               (I)Ljava/lang/String;
  #130 = Fieldref           #131.#132     // java/awt/Color.RED:Ljava/awt/Color;
  #131 = Class              #133          // java/awt/Color
  #132 = NameAndType        #134:#135     // RED:Ljava/awt/Color;
  #133 = Utf8               java/awt/Color
  #134 = Utf8               RED
  #135 = Utf8               Ljava/awt/Color;
  #136 = Methodref          #71.#137      // ext/mods/gameserver/model/location/Location.getX:()I
  #137 = NameAndType        #138:#124     // getX:()I
  #138 = Utf8               getX
  #139 = Methodref          #71.#140      // ext/mods/gameserver/model/location/Location.getY:()I
  #140 = NameAndType        #141:#124     // getY:()I
  #141 = Utf8               getY
  #142 = Methodref          #71.#143      // ext/mods/gameserver/model/location/Location.getZ:()I
  #143 = NameAndType        #144:#124     // getZ:()I
  #144 = Utf8               getZ
  #145 = Methodref          #23.#146      // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
  #146 = NameAndType        #75:#147      // addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
  #147 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIII)V
  #148 = InterfaceMethodref #34.#149      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #149 = NameAndType        #150:#86      // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #150 = Utf8               get
  #151 = Class              #152          // ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point
  #152 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point
  #153 = Fieldref           #131.#154     // java/awt/Color.GREEN:Ljava/awt/Color;
  #154 = NameAndType        #155:#135     // GREEN:Ljava/awt/Color;
  #155 = Utf8               GREEN
  #156 = Methodref          #151.#137     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getX:()I
  #157 = Methodref          #151.#140     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getY:()I
  #158 = Methodref          #151.#143     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point.getZ:()I
  #159 = Methodref          #23.#160      // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/awt/Color;IIIIII)V
  #160 = NameAndType        #161:#162     // addLine:(Ljava/awt/Color;IIIIII)V
  #161 = Utf8               addLine
  #162 = Utf8               (Ljava/awt/Color;IIIIII)V
  #163 = Fieldref           #131.#164     // java/awt/Color.YELLOW:Ljava/awt/Color;
  #164 = NameAndType        #165:#135     // YELLOW:Ljava/awt/Color;
  #165 = Utf8               YELLOW
  #166 = Methodref          #10.#167      // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #167 = NameAndType        #168:#169     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #168 = Utf8               getPosition
  #169 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #170 = Methodref          #18.#171      // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.previewCylinder:(Lext/mods/gameserver/model/actor/Player;ILjava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #171 = NameAndType        #172:#173     // previewCylinder:(Lext/mods/gameserver/model/actor/Player;ILjava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #172 = Utf8               previewCylinder
  #173 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILjava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #174 = Methodref          #18.#175      // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.previewCylinderCalc:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;ILjava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #175 = NameAndType        #176:#177     // previewCylinderCalc:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;ILjava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #176 = Utf8               previewCylinderCalc
  #177 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;ILjava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #178 = Methodref          #179.#180     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #179 = Class              #181          // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
  #180 = NameAndType        #182:#183     // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #181 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
  #182 = Utf8               getPlayer
  #183 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #184 = Methodref          #179.#185     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #185 = NameAndType        #186:#187     // getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #186 = Utf8               getAreaById
  #187 = Utf8               (I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #188 = Methodref          #189.#190     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.visualizeZone:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #189 = Class              #191          // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
  #190 = NameAndType        #192:#193     // visualizeZone:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #191 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
  #192 = Utf8               visualizeZone
  #193 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #194 = Methodref          #189.#195     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
  #195 = NameAndType        #196:#197     // getNodes:()Ljava/util/List;
  #196 = Utf8               getNodes
  #197 = Utf8               ()Ljava/util/List;
  #198 = InterfaceMethodref #56.#88       // java/util/List.isEmpty:()Z
  #199 = InterfaceMethodref #56.#200      // java/util/List.addAll:(Ljava/util/Collection;)Z
  #200 = NameAndType        #201:#202     // addAll:(Ljava/util/Collection;)Z
  #201 = Utf8               addAll
  #202 = Utf8               (Ljava/util/Collection;)Z
  #203 = InterfaceMethodref #56.#204      // java/util/List.stream:()Ljava/util/stream/Stream;
  #204 = NameAndType        #205:#206     // stream:()Ljava/util/stream/Stream;
  #205 = Utf8               stream
  #206 = Utf8               ()Ljava/util/stream/Stream;
  #207 = InvokeDynamic      #2:#208       // #2:applyAsInt:()Ljava/util/function/ToIntFunction;
  #208 = NameAndType        #209:#210     // applyAsInt:()Ljava/util/function/ToIntFunction;
  #209 = Utf8               applyAsInt
  #210 = Utf8               ()Ljava/util/function/ToIntFunction;
  #211 = InterfaceMethodref #212.#213     // java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #212 = Class              #214          // java/util/stream/Stream
  #213 = NameAndType        #215:#216     // mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #214 = Utf8               java/util/stream/Stream
  #215 = Utf8               mapToInt
  #216 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #217 = InterfaceMethodref #218.#219     // java/util/stream/IntStream.min:()Ljava/util/OptionalInt;
  #218 = Class              #220          // java/util/stream/IntStream
  #219 = NameAndType        #221:#222     // min:()Ljava/util/OptionalInt;
  #220 = Utf8               java/util/stream/IntStream
  #221 = Utf8               min
  #222 = Utf8               ()Ljava/util/OptionalInt;
  #223 = Methodref          #224.#225     // java/util/OptionalInt.orElse:(I)I
  #224 = Class              #226          // java/util/OptionalInt
  #225 = NameAndType        #227:#228     // orElse:(I)I
  #226 = Utf8               java/util/OptionalInt
  #227 = Utf8               orElse
  #228 = Utf8               (I)I
  #229 = InterfaceMethodref #218.#230     // java/util/stream/IntStream.max:()Ljava/util/OptionalInt;
  #230 = NameAndType        #231:#222     // max:()Ljava/util/OptionalInt;
  #231 = Utf8               max
  #232 = InterfaceMethodref #56.#122      // java/util/List.size:()I
  #233 = Fieldref           #234.#235     // ext/mods/Config.DEVELOPER:Z
  #234 = Class              #236          // ext/mods/Config
  #235 = NameAndType        #237:#238     // DEVELOPER:Z
  #236 = Utf8               ext/mods/Config
  #237 = Utf8               DEVELOPER
  #238 = Utf8               Z
  #239 = Class              #240          // java/lang/StringBuilder
  #240 = Utf8               java/lang/StringBuilder
  #241 = Methodref          #239.#3       // java/lang/StringBuilder."<init>":()V
  #242 = String             #243          // <zone shape=\"%s\" minZ=\"%d\" maxZ=\"%d\">\n
  #243 = Utf8               <zone shape=\"%s\" minZ=\"%d\" maxZ=\"%d\">\n
  #244 = String             #245          // NPoly
  #245 = Utf8               NPoly
  #246 = Methodref          #126.#247     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #247 = NameAndType        #248:#249     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #248 = Utf8               format
  #249 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #250 = Methodref          #239.#251     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #251 = NameAndType        #252:#253     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #252 = Utf8               append
  #253 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #254 = String             #255          // \t<stat name=\"name\" val=\"%s\"/>\n
  #255 = Utf8               \t<stat name=\"name\" val=\"%s\"/>\n
  #256 = Methodref          #189.#257     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getName:()Ljava/lang/String;
  #257 = NameAndType        #258:#259     // getName:()Ljava/lang/String;
  #258 = Utf8               getName
  #259 = Utf8               ()Ljava/lang/String;
  #260 = String             #261          // \t<node x=\"%d\" y=\"%d\" z=\"%d\"/>\n
  #261 = Utf8               \t<node x=\"%d\" y=\"%d\" z=\"%d\"/>\n
  #262 = String             #263          // </zone>
  #263 = Utf8               </zone>
  #264 = Fieldref           #18.#265      // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.LOGGER:Lext/mods/commons/logging/CLogger;
  #265 = NameAndType        #266:#267     // LOGGER:Lext/mods/commons/logging/CLogger;
  #266 = Utf8               LOGGER
  #267 = Utf8               Lext/mods/commons/logging/CLogger;
  #268 = Methodref          #239.#269     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #269 = NameAndType        #270:#259     // toString:()Ljava/lang/String;
  #270 = Utf8               toString
  #271 = Methodref          #272.#273     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #272 = Class              #274          // ext/mods/commons/logging/CLogger
  #273 = NameAndType        #275:#276     // info:(Ljava/lang/Object;)V
  #274 = Utf8               ext/mods/commons/logging/CLogger
  #275 = Utf8               info
  #276 = Utf8               (Ljava/lang/Object;)V
  #277 = InterfaceMethodref #56.#278      // java/util/List.get:(I)Ljava/lang/Object;
  #278 = NameAndType        #150:#279     // get:(I)Ljava/lang/Object;
  #279 = Utf8               (I)Ljava/lang/Object;
  #280 = Class              #281          // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ
  #281 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ
  #282 = Methodref          #280.#283     // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ."<init>":([I[I[III)V
  #283 = NameAndType        #5:#284       // "<init>":([I[I[III)V
  #284 = Utf8               ([I[I[III)V
  #285 = Methodref          #189.#286     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.setZone:(Lext/mods/gameserver/model/zone/ZoneForm;)V
  #286 = NameAndType        #287:#288     // setZone:(Lext/mods/gameserver/model/zone/ZoneForm;)V
  #287 = Utf8               setZone
  #288 = Utf8               (Lext/mods/gameserver/model/zone/ZoneForm;)V
  #289 = Methodref          #290.#291     // java/lang/Math.abs:(D)D
  #290 = Class              #292          // java/lang/Math
  #291 = NameAndType        #293:#294     // abs:(D)D
  #292 = Utf8               java/lang/Math
  #293 = Utf8               abs
  #294 = Utf8               (D)D
  #295 = Double             2.0d
  #297 = Methodref          #290.#298     // java/lang/Math.sqrt:(D)D
  #298 = NameAndType        #299:#294     // sqrt:(D)D
  #299 = Utf8               sqrt
  #300 = Fieldref           #301.#302     // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
  #301 = Class              #303          // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder$SingletonHolder
  #302 = NameAndType        #304:#305     // INSTANCE:Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
  #303 = Utf8               ext/mods/gameserver/model/entity/autofarm/ZoneBuilder$SingletonHolder
  #304 = Utf8               INSTANCE
  #305 = Utf8               Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
  #306 = Methodref          #18.#307      // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.clearAllPreview:(Lext/mods/gameserver/model/actor/Player;)V
  #307 = NameAndType        #308:#54      // clearAllPreview:(Lext/mods/gameserver/model/actor/Player;)V
  #308 = Utf8               clearAllPreview
  #309 = Methodref          #310.#257     // java/lang/Class.getName:()Ljava/lang/String;
  #310 = Class              #311          // java/lang/Class
  #311 = Utf8               java/lang/Class
  #312 = Methodref          #272.#313     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #313 = NameAndType        #5:#314       // "<init>":(Ljava/lang/String;)V
  #314 = Utf8               (Ljava/lang/String;)V
  #315 = Utf8               Code
  #316 = Utf8               LineNumberTable
  #317 = Utf8               LocalVariableTable
  #318 = Utf8               this
  #319 = Utf8               player
  #320 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #321 = Utf8               Signature
  #322 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;>;
  #323 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #324 = Utf8               clearCylinderPreview
  #325 = Utf8               restoreDebugPoints
  #326 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
  #327 = Utf8               loc
  #328 = Utf8               Lext/mods/gameserver/model/location/Location;
  #329 = Utf8               location
  #330 = Utf8               Ljava/util/List;
  #331 = Utf8               debug
  #332 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #333 = Utf8               LocalVariableTypeTable
  #334 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #335 = Utf8               StackMapTable
  #336 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)V
  #337 = Utf8               removePoint
  #338 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #339 = Utf8               nodeId
  #340 = Utf8               I
  #341 = Utf8               backup
  #342 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #343 = Utf8               previousPoint
  #344 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;
  #345 = Utf8               preview
  #346 = Utf8               radius
  #347 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILjava/awt/Color;)V
  #348 = Utf8               color
  #349 = Utf8               center
  #350 = Utf8               packet
  #351 = Utf8               previewFinalArea
  #352 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
  #353 = Utf8               autoFarmProfile
  #354 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #355 = Utf8               areaId
  #356 = Utf8               setAutoFarmAreaZone
  #357 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
  #358 = Utf8               sb
  #359 = Utf8               Ljava/lang/StringBuilder;
  #360 = Utf8               i
  #361 = Utf8               area
  #362 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #363 = Utf8               nodes
  #364 = Utf8               minZ
  #365 = Utf8               maxZ
  #366 = Utf8               aX
  #367 = Utf8               [I
  #368 = Utf8               aY
  #369 = Utf8               aZ
  #370 = Class              #367          // "[I"
  #371 = Utf8               calculateArea
  #372 = Utf8               (Lext/mods/gameserver/model/actor/Player;)D
  #373 = Utf8               j
  #374 = Utf8               n
  #375 = Utf8               D
  #376 = Utf8               calculatePerimeter
  #377 = Utf8               dx
  #378 = Utf8               dy
  #379 = Utf8               perimeter
  #380 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
  #381 = Utf8               lambda$removePoint$1
  #382 = Utf8               l
  #383 = Utf8               lambda$removePoint$0
  #384 = Utf8               <clinit>
  #385 = Utf8               SourceFile
  #386 = Utf8               ZoneBuilder.java
  #387 = Utf8               NestMembers
  #388 = Utf8               BootstrapMethods
  #389 = MethodType         #6            //  ()V
  #390 = MethodHandle       5:#391        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.lambda$removePoint$0:(Lext/mods/gameserver/model/actor/Player;)V
  #391 = Methodref          #18.#392      // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.lambda$removePoint$0:(Lext/mods/gameserver/model/actor/Player;)V
  #392 = NameAndType        #383:#54      // lambda$removePoint$0:(Lext/mods/gameserver/model/actor/Player;)V
  #393 = MethodType         #276          //  (Ljava/lang/Object;)V
  #394 = MethodHandle       6:#395        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.lambda$removePoint$1:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/location/Location;)V
  #395 = Methodref          #18.#396      // ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.lambda$removePoint$1:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/location/Location;)V
  #396 = NameAndType        #381:#76      // lambda$removePoint$1:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/location/Location;)V
  #397 = MethodType         #398          //  (Lext/mods/gameserver/model/location/Location;)V
  #398 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #399 = MethodType         #400          //  (Ljava/lang/Object;)I
  #400 = Utf8               (Ljava/lang/Object;)I
  #401 = MethodHandle       5:#142        // REF_invokeVirtual ext/mods/gameserver/model/location/Location.getZ:()I
  #402 = MethodType         #403          //  (Lext/mods/gameserver/model/location/Location;)I
  #403 = Utf8               (Lext/mods/gameserver/model/location/Location;)I
  #404 = MethodHandle       6:#405        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #405 = Methodref          #406.#407     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #406 = Class              #408          // java/lang/invoke/LambdaMetafactory
  #407 = NameAndType        #409:#410     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #408 = Utf8               java/lang/invoke/LambdaMetafactory
  #409 = Utf8               metafactory
  #410 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #411 = Utf8               InnerClasses
  #412 = Utf8               Point
  #413 = Utf8               SingletonHolder
  #414 = Class              #415          // java/lang/invoke/MethodHandles$Lookup
  #415 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #416 = Class              #417          // java/lang/invoke/MethodHandles
  #417 = Utf8               java/lang/invoke/MethodHandles
  #418 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.autofarm.ZoneBuilder();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;

  public ext.mods.gameserver.network.serverpackets.ExServerPrimitive getDebugPacket(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ldc           #7                  // String ZoneBuilder
         3: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         6: areturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0       7     1 player   Lext/mods/gameserver/model/actor/Player;

  public java.util.Map<java.lang.Integer, ext.mods.gameserver.network.serverpackets.ExServerPrimitive$Point> getPoints(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #17                 // Method getDebugPacket:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         5: invokevirtual #22                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.getPoints:()Ljava/util/Map;
         8: areturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0       9     1 player   Lext/mods/gameserver/model/actor/Player;
    Signature: #322                         // (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point;>;

  public java.util.List<ext.mods.gameserver.model.location.Location> getPointsLoc(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: new           #28                 // class java/util/ArrayList
         3: dup
         4: aload_0
         5: aload_1
         6: invokevirtual #30                 // Method getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
         9: invokeinterface #33,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        14: invokespecial #39                 // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
        17: areturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0      18     1 player   Lext/mods/gameserver/model/actor/Player;
    Signature: #323                         // (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;

  public void clearAllPreview(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.clearDebugPackets:()V
         4: return
      LineNumberTable:
        line 63: 0
        line 64: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0       5     1 player   Lext/mods/gameserver/model/actor/Player;

  public void clearCylinderPreview(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokestatic  #45                 // Method getDebugPacket2:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         4: invokevirtual #48                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
         7: aload_1
         8: invokestatic  #45                 // Method getDebugPacket2:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
        11: aload_1
        12: invokevirtual #51                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
        15: return
      LineNumberTable:
        line 68: 0
        line 69: 7
        line 70: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0      16     1 player   Lext/mods/gameserver/model/actor/Player;

  public void restoreDebugPoints(ext.mods.gameserver.model.actor.Player, java.util.List<ext.mods.gameserver.model.location.Location>);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #17                 // Method getDebugPacket:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         5: astore_3
         6: aload_2
         7: invokeinterface #55,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        12: astore        4
        14: aload         4
        16: invokeinterface #61,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          45
        24: aload         4
        26: invokeinterface #67,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        31: checkcast     #71                 // class ext/mods/gameserver/model/location/Location
        34: astore        5
        36: aload_3
        37: aload         5
        39: invokestatic  #73                 // Method addPoint:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/location/Location;)V
        42: goto          14
        45: return
      LineNumberTable:
        line 74: 0
        line 75: 6
        line 77: 36
        line 78: 42
        line 79: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36       6     5   loc   Lext/mods/gameserver/model/location/Location;
            0      46     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0      46     1 player   Lext/mods/gameserver/model/actor/Player;
            0      46     2 location   Ljava/util/List;
            6      40     3 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      46     2 location   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 30
    Signature: #336                         // (Lext/mods/gameserver/model/actor/Player;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)V

  public void removePoint(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #17                 // Method getDebugPacket:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         5: astore_3
         6: aload_3
         7: invokevirtual #22                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.getPoints:()Ljava/util/Map;
        10: iload_2
        11: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        14: invokeinterface #83,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        19: pop
        20: aload_3
        21: invokevirtual #22                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.getPoints:()Ljava/util/Map;
        24: invokeinterface #87,  1           // InterfaceMethod java/util/Map.isEmpty:()Z
        29: ifeq          43
        32: aload_0
        33: aload_1
        34: invokedynamic #90,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
        39: invokestatic  #94                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
        42: return
        43: aload_0
        44: aload_1
        45: invokevirtual #100                // Method getPointsLoc:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
        48: astore        4
        50: aload_3
        51: invokevirtual #48                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
        54: aload         4
        56: aload_3
        57: invokedynamic #104,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/function/Consumer;
        62: invokeinterface #108,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        67: aload_3
        68: aload_1
        69: invokevirtual #51                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
        72: return
      LineNumberTable:
        line 83: 0
        line 85: 6
        line 87: 20
        line 89: 32
        line 90: 42
        line 93: 43
        line 94: 50
        line 96: 54
        line 98: 67
        line 99: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      73     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0      73     1 player   Lext/mods/gameserver/model/actor/Player;
            0      73     2 nodeId   I
            6      67     3 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
           50      23     4 backup   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           50      23     4 backup   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]

  public void addPoint(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #17                 // Method getDebugPacket:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         5: astore_3
         6: aload_3
         7: aload_2
         8: invokestatic  #73                 // Method addPoint:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/location/Location;)V
        11: aload_3
        12: aload_1
        13: invokevirtual #51                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
        16: invokestatic  #112                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
        19: aload_1
        20: invokevirtual #118                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.showZoneWindow:(Lext/mods/gameserver/model/actor/Player;)V
        23: return
      LineNumberTable:
        line 103: 0
        line 104: 6
        line 105: 11
        line 106: 16
        line 107: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0      24     1 player   Lext/mods/gameserver/model/actor/Player;
            0      24     2   loc   Lext/mods/gameserver/model/location/Location;
            6      18     3 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;

  public void preview(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #30                 // Method getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
         5: invokeinterface #87,  1           // InterfaceMethod java/util/Map.isEmpty:()Z
        10: ifeq          14
        13: return
        14: aload_0
        15: aload_1
        16: invokevirtual #17                 // Method getDebugPacket:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
        19: aload_1
        20: invokevirtual #51                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
        23: return
      LineNumberTable:
        line 122: 0
        line 123: 13
        line 125: 14
        line 126: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0      24     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */

  public void previewCylinder(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: getstatic     #163                // Field java/awt/Color.YELLOW:Ljava/awt/Color;
         6: aload_1
         7: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        10: invokevirtual #170                // Method previewCylinder:(Lext/mods/gameserver/model/actor/Player;ILjava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
        13: return
      LineNumberTable:
        line 133: 0
        line 134: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0      14     1 player   Lext/mods/gameserver/model/actor/Player;
            0      14     2 radius   I

  public void previewCylinder(ext.mods.gameserver.model.actor.Player, int, java.awt.Color);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ILjava/awt/Color;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: iload_2
         3: aload_3
         4: aload_1
         5: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         8: invokevirtual #170                // Method previewCylinder:(Lext/mods/gameserver/model/actor/Player;ILjava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
        11: return
      LineNumberTable:
        line 138: 0
        line 139: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0      12     1 player   Lext/mods/gameserver/model/actor/Player;
            0      12     2 radius   I
            0      12     3 color   Ljava/awt/Color;

  public void previewCylinder(ext.mods.gameserver.model.actor.Player, int, java.awt.Color, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ILjava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=5
         0: aload_1
         1: invokestatic  #45                 // Method getDebugPacket2:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         4: astore        5
         6: aload         5
         8: invokevirtual #48                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
        11: aload_1
        12: aload         5
        14: iload_2
        15: aload_3
        16: aload         4
        18: invokestatic  #174                // Method previewCylinderCalc:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;ILjava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
        21: aload         5
        23: aload_1
        24: invokevirtual #51                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
        27: return
      LineNumberTable:
        line 147: 0
        line 148: 6
        line 150: 11
        line 152: 21
        line 153: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0      28     1 player   Lext/mods/gameserver/model/actor/Player;
            0      28     2 radius   I
            0      28     3 color   Ljava/awt/Color;
            0      28     4 center   Lext/mods/gameserver/model/location/Location;
            6      22     5 packet   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;

  public void previewFinalArea(ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile, int);
    descriptor: (Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #178                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayer:()Lext/mods/gameserver/model/actor/Player;
         5: invokevirtual #17                 // Method getDebugPacket:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         8: astore_3
         9: aload_3
        10: invokevirtual #48                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
        13: aload_1
        14: iload_2
        15: invokevirtual #184                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        18: aload_3
        19: invokevirtual #188                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.visualizeZone:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
        22: aload_3
        23: aload_1
        24: invokevirtual #178                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        27: invokevirtual #51                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
        30: return
      LineNumberTable:
        line 164: 0
        line 165: 9
        line 166: 13
        line 167: 22
        line 168: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0      31     1 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      31     2 areaId   I
            9      22     3 packet   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;

  public void setAutoFarmAreaZone(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=12, args_size=3
         0: aload_2
         1: invokevirtual #194                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
         4: astore_3
         5: aload_3
         6: invokeinterface #198,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        11: ifeq          31
        14: aload_3
        15: aload_0
        16: aload_1
        17: invokevirtual #30                 // Method getPoints:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
        20: invokeinterface #33,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        25: invokeinterface #199,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
        30: pop
        31: aload_3
        32: invokeinterface #203,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        37: invokedynamic #207,  0            // InvokeDynamic #2:applyAsInt:()Ljava/util/function/ToIntFunction;
        42: invokeinterface #211,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        47: invokeinterface #217,  1          // InterfaceMethod java/util/stream/IntStream.min:()Ljava/util/OptionalInt;
        52: iconst_0
        53: invokevirtual #223                // Method java/util/OptionalInt.orElse:(I)I
        56: bipush        100
        58: isub
        59: istore        4
        61: aload_3
        62: invokeinterface #203,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        67: invokedynamic #207,  0            // InvokeDynamic #2:applyAsInt:()Ljava/util/function/ToIntFunction;
        72: invokeinterface #211,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        77: invokeinterface #229,  1          // InterfaceMethod java/util/stream/IntStream.max:()Ljava/util/OptionalInt;
        82: iconst_0
        83: invokevirtual #223                // Method java/util/OptionalInt.orElse:(I)I
        86: bipush        100
        88: iadd
        89: istore        5
        91: aload_3
        92: invokeinterface #232,  1          // InterfaceMethod java/util/List.size:()I
        97: newarray       int
        99: astore        6
       101: aload_3
       102: invokeinterface #232,  1          // InterfaceMethod java/util/List.size:()I
       107: newarray       int
       109: astore        7
       111: aload_3
       112: invokeinterface #232,  1          // InterfaceMethod java/util/List.size:()I
       117: newarray       int
       119: astore        8
       121: getstatic     #233                // Field ext/mods/Config.DEVELOPER:Z
       124: ifeq          296
       127: new           #239                // class java/lang/StringBuilder
       130: dup
       131: invokespecial #241                // Method java/lang/StringBuilder."<init>":()V
       134: astore        9
       136: aload         9
       138: ldc           #242                // String <zone shape=\"%s\" minZ=\"%d\" maxZ=\"%d\">\n
       140: iconst_3
       141: anewarray     #2                  // class java/lang/Object
       144: dup
       145: iconst_0
       146: ldc           #244                // String NPoly
       148: aastore
       149: dup
       150: iconst_1
       151: iload         4
       153: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       156: aastore
       157: dup
       158: iconst_2
       159: iload         5
       161: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       164: aastore
       165: invokestatic  #246                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       168: invokevirtual #250                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       171: pop
       172: aload         9
       174: ldc           #254                // String \t<stat name=\"name\" val=\"%s\"/>\n
       176: iconst_1
       177: anewarray     #2                  // class java/lang/Object
       180: dup
       181: iconst_0
       182: aload_2
       183: invokevirtual #256                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getName:()Ljava/lang/String;
       186: aastore
       187: invokestatic  #246                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       190: invokevirtual #250                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       193: pop
       194: aload_3
       195: invokeinterface #55,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       200: astore        10
       202: aload         10
       204: invokeinterface #61,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       209: ifeq          276
       212: aload         10
       214: invokeinterface #67,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       219: checkcast     #71                 // class ext/mods/gameserver/model/location/Location
       222: astore        11
       224: aload         9
       226: ldc_w         #260                // String \t<node x=\"%d\" y=\"%d\" z=\"%d\"/>\n
       229: iconst_3
       230: anewarray     #2                  // class java/lang/Object
       233: dup
       234: iconst_0
       235: aload         11
       237: invokevirtual #136                // Method ext/mods/gameserver/model/location/Location.getX:()I
       240: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       243: aastore
       244: dup
       245: iconst_1
       246: aload         11
       248: invokevirtual #139                // Method ext/mods/gameserver/model/location/Location.getY:()I
       251: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       254: aastore
       255: dup
       256: iconst_2
       257: aload         11
       259: invokevirtual #142                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       262: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       265: aastore
       266: invokestatic  #246                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       269: invokevirtual #250                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       272: pop
       273: goto          202
       276: aload         9
       278: ldc_w         #262                // String </zone>
       281: invokevirtual #250                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       284: pop
       285: getstatic     #264                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       288: aload         9
       290: invokevirtual #268                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       293: invokevirtual #271                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       296: iconst_0
       297: istore        9
       299: iload         9
       301: aload_3
       302: invokeinterface #232,  1          // InterfaceMethod java/util/List.size:()I
       307: if_icmpge     373
       310: aload         6
       312: iload         9
       314: aload_3
       315: iload         9
       317: invokeinterface #277,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       322: checkcast     #71                 // class ext/mods/gameserver/model/location/Location
       325: invokevirtual #136                // Method ext/mods/gameserver/model/location/Location.getX:()I
       328: iastore
       329: aload         7
       331: iload         9
       333: aload_3
       334: iload         9
       336: invokeinterface #277,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       341: checkcast     #71                 // class ext/mods/gameserver/model/location/Location
       344: invokevirtual #139                // Method ext/mods/gameserver/model/location/Location.getY:()I
       347: iastore
       348: aload         8
       350: iload         9
       352: aload_3
       353: iload         9
       355: invokeinterface #277,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       360: checkcast     #71                 // class ext/mods/gameserver/model/location/Location
       363: invokevirtual #142                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       366: iastore
       367: iinc          9, 1
       370: goto          299
       373: aload_2
       374: new           #280                // class ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ
       377: dup
       378: aload         6
       380: aload         7
       382: aload         8
       384: iload         4
       386: iload         5
       388: invokespecial #282                // Method ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ."<init>":([I[I[III)V
       391: invokevirtual #285                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.setZone:(Lext/mods/gameserver/model/zone/ZoneForm;)V
       394: return
      LineNumberTable:
        line 172: 0
        line 173: 5
        line 174: 14
        line 176: 31
        line 177: 61
        line 179: 91
        line 180: 101
        line 181: 111
        line 183: 121
        line 185: 127
        line 186: 136
        line 187: 172
        line 189: 194
        line 190: 224
        line 192: 276
        line 193: 285
        line 196: 296
        line 198: 310
        line 199: 329
        line 200: 348
        line 196: 367
        line 203: 373
        line 204: 394
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          224      49    11   loc   Lext/mods/gameserver/model/location/Location;
          136     160     9    sb   Ljava/lang/StringBuilder;
          299      74     9     i   I
            0     395     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0     395     1 player   Lext/mods/gameserver/model/actor/Player;
            0     395     2  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
            5     390     3 nodes   Ljava/util/List;
           61     334     4  minZ   I
           91     304     5  maxZ   I
          101     294     6    aX   [I
          111     284     7    aY   [I
          121     274     8    aZ   [I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            5     390     3 nodes   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class java/util/List ]
        frame_type = 255 /* full_frame */
          offset_delta = 170
          locals = [ class ext/mods/gameserver/model/entity/autofarm/ZoneBuilder, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea, class java/util/List, int, int, class "[I", class "[I", class "[I", class java/lang/StringBuilder, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 73
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 73

  public double calculateArea(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #100                // Method getPointsLoc:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
         5: astore_2
         6: aload_2
         7: invokeinterface #232,  1          // InterfaceMethod java/util/List.size:()I
        12: istore_3
        13: dconst_0
        14: dstore        4
        16: iconst_0
        17: istore        6
        19: iload         6
        21: iload_3
        22: if_icmpge     104
        25: iload         6
        27: iconst_1
        28: iadd
        29: iload_3
        30: irem
        31: istore        7
        33: dload         4
        35: aload_2
        36: iload         6
        38: invokeinterface #277,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        43: checkcast     #71                 // class ext/mods/gameserver/model/location/Location
        46: invokevirtual #136                // Method ext/mods/gameserver/model/location/Location.getX:()I
        49: aload_2
        50: iload         7
        52: invokeinterface #277,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        57: checkcast     #71                 // class ext/mods/gameserver/model/location/Location
        60: invokevirtual #139                // Method ext/mods/gameserver/model/location/Location.getY:()I
        63: imul
        64: aload_2
        65: iload         6
        67: invokeinterface #277,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        72: checkcast     #71                 // class ext/mods/gameserver/model/location/Location
        75: invokevirtual #139                // Method ext/mods/gameserver/model/location/Location.getY:()I
        78: aload_2
        79: iload         7
        81: invokeinterface #277,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        86: checkcast     #71                 // class ext/mods/gameserver/model/location/Location
        89: invokevirtual #136                // Method ext/mods/gameserver/model/location/Location.getX:()I
        92: imul
        93: isub
        94: i2d
        95: dadd
        96: dstore        4
        98: iinc          6, 1
       101: goto          19
       104: dload         4
       106: invokestatic  #289                // Method java/lang/Math.abs:(D)D
       109: ldc2_w        #295                // double 2.0d
       112: ddiv
       113: dstore        4
       115: dload         4
       117: dreturn
      LineNumberTable:
        line 208: 0
        line 209: 6
        line 210: 13
        line 212: 16
        line 214: 25
        line 215: 33
        line 212: 98
        line 218: 104
        line 219: 115
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      65     7     j   I
           19      85     6     i   I
            0     118     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0     118     1 player   Lext/mods/gameserver/model/actor/Player;
            6     112     2 nodes   Ljava/util/List;
           13     105     3     n   I
           16     102     4  area   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            6     112     2 nodes   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/entity/autofarm/ZoneBuilder, class ext/mods/gameserver/model/actor/Player, class java/util/List, int, double, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 84

  public double calculatePerimeter(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=12, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #100                // Method getPointsLoc:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
         5: astore_2
         6: aload_2
         7: invokeinterface #232,  1          // InterfaceMethod java/util/List.size:()I
        12: istore_3
        13: dconst_0
        14: dstore        4
        16: iconst_0
        17: istore        6
        19: iload         6
        21: iload_3
        22: if_icmpge     122
        25: iload         6
        27: iconst_1
        28: iadd
        29: iload_3
        30: irem
        31: istore        7
        33: aload_2
        34: iload         6
        36: invokeinterface #277,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        41: checkcast     #71                 // class ext/mods/gameserver/model/location/Location
        44: invokevirtual #136                // Method ext/mods/gameserver/model/location/Location.getX:()I
        47: aload_2
        48: iload         7
        50: invokeinterface #277,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        55: checkcast     #71                 // class ext/mods/gameserver/model/location/Location
        58: invokevirtual #136                // Method ext/mods/gameserver/model/location/Location.getX:()I
        61: isub
        62: i2d
        63: dstore        8
        65: aload_2
        66: iload         6
        68: invokeinterface #277,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        73: checkcast     #71                 // class ext/mods/gameserver/model/location/Location
        76: invokevirtual #139                // Method ext/mods/gameserver/model/location/Location.getY:()I
        79: aload_2
        80: iload         7
        82: invokeinterface #277,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        87: checkcast     #71                 // class ext/mods/gameserver/model/location/Location
        90: invokevirtual #139                // Method ext/mods/gameserver/model/location/Location.getY:()I
        93: isub
        94: i2d
        95: dstore        10
        97: dload         4
        99: dload         8
       101: dload         8
       103: dmul
       104: dload         10
       106: dload         10
       108: dmul
       109: dadd
       110: invokestatic  #297                // Method java/lang/Math.sqrt:(D)D
       113: dadd
       114: dstore        4
       116: iinc          6, 1
       119: goto          19
       122: dload         4
       124: dreturn
      LineNumberTable:
        line 224: 0
        line 225: 6
        line 226: 13
        line 228: 16
        line 230: 25
        line 231: 33
        line 232: 65
        line 233: 97
        line 228: 116
        line 236: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      83     7     j   I
           65      51     8    dx   D
           97      19    10    dy   D
           19     103     6     i   I
            0     125     0  this   Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
            0     125     1 player   Lext/mods/gameserver/model/actor/Player;
            6     119     2 nodes   Ljava/util/List;
           13     112     3     n   I
           16     109     4 perimeter   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            6     119     2 nodes   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/entity/autofarm/ZoneBuilder, class ext/mods/gameserver/model/actor/Player, class java/util/List, int, double, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 102

  public static ext.mods.gameserver.model.entity.autofarm.ZoneBuilder getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #300                // Field ext/mods/gameserver/model/entity/autofarm/ZoneBuilder$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/autofarm/ZoneBuilder;
         3: areturn
      LineNumberTable:
        line 241: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #272                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #18                 // class ext/mods/gameserver/model/entity/autofarm/ZoneBuilder
         6: invokevirtual #309                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #312                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #264                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 39: 0
}
SourceFile: "ZoneBuilder.java"
NestMembers:
  ext/mods/gameserver/model/entity/autofarm/ZoneBuilder$SingletonHolder
BootstrapMethods:
  0: #404 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #389 ()V
      #390 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.lambda$removePoint$0:(Lext/mods/gameserver/model/actor/Player;)V
      #389 ()V
  1: #404 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #393 (Ljava/lang/Object;)V
      #394 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/ZoneBuilder.lambda$removePoint$1:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/location/Location;)V
      #397 (Lext/mods/gameserver/model/location/Location;)V
  2: #404 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #399 (Ljava/lang/Object;)I
      #401 REF_invokeVirtual ext/mods/gameserver/model/location/Location.getZ:()I
      #402 (Lext/mods/gameserver/model/location/Location;)I
InnerClasses:
  public static #412= #151 of #23;        // Point=class ext/mods/gameserver/network/serverpackets/ExServerPrimitive$Point of class ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  public static final #418= #414 of #416; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
