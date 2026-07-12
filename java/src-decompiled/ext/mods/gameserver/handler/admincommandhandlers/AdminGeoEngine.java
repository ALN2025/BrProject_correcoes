// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminGeoEngine
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminGeoEngine.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine.class
  Last modified 9 de jul de 2026; size 16238 bytes
  MD5 checksum 2ba1172f3e5e3d3f8f7093e2409296e8
  Compiled from "AdminGeoEngine.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminGeoEngine implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #157                        // ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 9, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player
    #9 = NameAndType        #11:#12       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #10 = Utf8               ext/mods/gameserver/model/actor/Player
   #11 = Utf8               getTarget
   #12 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Creature
   #14 = Utf8               ext/mods/gameserver/model/actor/Creature
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #16 = Class              #18           // ext/mods/gameserver/network/SystemMessageId
   #17 = NameAndType        #19:#20       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #18 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #19 = Utf8               INVALID_TARGET
   #20 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #21 = Methodref          #8.#22        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #22 = NameAndType        #23:#24       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #23 = Utf8               sendPacket
   #24 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #25 = Class              #26           // java/util/StringTokenizer
   #26 = Utf8               java/util/StringTokenizer
   #27 = String             #28           //
   #28 = Utf8
   #29 = Methodref          #25.#30       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #30 = NameAndType        #5:#31        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #31 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #32 = Methodref          #25.#33       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #33 = NameAndType        #34:#35       // nextToken:()Ljava/lang/String;
   #34 = Utf8               nextToken
   #35 = Utf8               ()Ljava/lang/String;
   #36 = String             #37           // admin_geo
   #37 = Utf8               admin_geo
   #38 = Methodref          #39.#40       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #39 = Class              #41           // java/lang/String
   #40 = NameAndType        #42:#43       // startsWith:(Ljava/lang/String;)Z
   #41 = Utf8               java/lang/String
   #42 = Utf8               startsWith
   #43 = Utf8               (Ljava/lang/String;)Z
   #44 = Methodref          #39.#45       // java/lang/String.hashCode:()I
   #45 = NameAndType        #46:#47       // hashCode:()I
   #46 = Utf8               hashCode
   #47 = Utf8               ()I
   #48 = String             #49           // bug
   #49 = Utf8               bug
   #50 = Methodref          #39.#51       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #51 = NameAndType        #52:#53       // equals:(Ljava/lang/Object;)Z
   #52 = Utf8               equals
   #53 = Utf8               (Ljava/lang/Object;)Z
   #54 = String             #55           // pos
   #55 = Utf8               pos
   #56 = String             #57           // see
   #57 = Utf8               see
   #58 = String             #59           // move
   #59 = Utf8               move
   #60 = String             #61           // fly
   #61 = Utf8               fly
   #62 = String             #63           // grid
   #63 = Utf8               grid
   #64 = Methodref          #8.#65        // ext/mods/gameserver/model/actor/Player.getX:()I
   #65 = NameAndType        #66:#47       // getX:()I
   #66 = Utf8               getX
   #67 = Methodref          #68.#69       // ext/mods/gameserver/geoengine/GeoEngine.getGeoX:(I)I
   #68 = Class              #70           // ext/mods/gameserver/geoengine/GeoEngine
   #69 = NameAndType        #71:#72       // getGeoX:(I)I
   #70 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #71 = Utf8               getGeoX
   #72 = Utf8               (I)I
   #73 = Methodref          #8.#74        // ext/mods/gameserver/model/actor/Player.getY:()I
   #74 = NameAndType        #75:#47       // getY:()I
   #75 = Utf8               getY
   #76 = Methodref          #68.#77       // ext/mods/gameserver/geoengine/GeoEngine.getGeoY:(I)I
   #77 = NameAndType        #78:#72       // getGeoY:(I)I
   #78 = Utf8               getGeoY
   #79 = Methodref          #68.#80       // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #80 = NameAndType        #81:#82       // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #81 = Utf8               getInstance
   #82 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #83 = Methodref          #68.#84       // ext/mods/gameserver/geoengine/GeoEngine.hasGeoPos:(II)Z
   #84 = NameAndType        #85:#86       // hasGeoPos:(II)Z
   #85 = Utf8               hasGeoPos
   #86 = Utf8               (II)Z
   #87 = Methodref          #39.#88       // java/lang/String.substring:(I)Ljava/lang/String;
   #88 = NameAndType        #89:#90       // substring:(I)Ljava/lang/String;
   #89 = Utf8               substring
   #90 = Utf8               (I)Ljava/lang/String;
   #91 = Methodref          #8.#92        // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #92 = NameAndType        #93:#94       // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #93 = Utf8               getPosition
   #94 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #95 = Methodref          #8.#96        // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #96 = NameAndType        #97:#35       // getName:()Ljava/lang/String;
   #97 = Utf8               getName
   #98 = InvokeDynamic      #0:#99        // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #99 = NameAndType        #100:#101     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #100 = Utf8               makeConcatWithConstants
  #101 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #102 = Methodref          #68.#103      // ext/mods/gameserver/geoengine/GeoEngine.addGeoBug:(Lext/mods/gameserver/model/location/Location;Ljava/lang/String;)Z
  #103 = NameAndType        #104:#105     // addGeoBug:(Lext/mods/gameserver/model/location/Location;Ljava/lang/String;)Z
  #104 = Utf8               addGeoBug
  #105 = Utf8               (Lext/mods/gameserver/model/location/Location;Ljava/lang/String;)Z
  #106 = String             #107          // GeoData bug saved.
  #107 = Utf8               GeoData bug saved.
  #108 = Methodref          #8.#109       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #109 = NameAndType        #110:#111     // sendMessage:(Ljava/lang/String;)V
  #110 = Utf8               sendMessage
  #111 = Utf8               (Ljava/lang/String;)V
  #112 = Class              #113          // java/lang/Exception
  #113 = Utf8               java/lang/Exception
  #114 = String             #115          // Usage: //geo bug comments
  #115 = Utf8               Usage: //geo bug comments
  #116 = String             #117          // There is no geodata at this position.
  #117 = Utf8               There is no geodata at this position.
  #118 = Methodref          #8.#119       // ext/mods/gameserver/model/actor/Player.getZ:()I
  #119 = NameAndType        #120:#47      // getZ:()I
  #120 = Utf8               getZ
  #121 = Class              #122          // ext/mods/gameserver/model/World
  #122 = Utf8               ext/mods/gameserver/model/World
  #123 = Integer            -131072
  #124 = Integer            32768
  #125 = Integer            -262144
  #126 = Methodref          #68.#127      // ext/mods/gameserver/geoengine/GeoEngine.getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
  #127 = NameAndType        #128:#129     // getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
  #128 = Utf8               getBlock
  #129 = Utf8               (II)Lext/mods/gameserver/geoengine/geodata/ABlock;
  #130 = Methodref          #2.#131       // java/lang/Object.getClass:()Ljava/lang/Class;
  #131 = NameAndType        #132:#133     // getClass:()Ljava/lang/Class;
  #132 = Utf8               getClass
  #133 = Utf8               ()Ljava/lang/Class;
  #134 = Methodref          #135.#136     // java/lang/Class.getSimpleName:()Ljava/lang/String;
  #135 = Class              #137          // java/lang/Class
  #136 = NameAndType        #138:#35      // getSimpleName:()Ljava/lang/String;
  #137 = Utf8               java/lang/Class
  #138 = Utf8               getSimpleName
  #139 = InvokeDynamic      #1:#140       // #1:makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
  #140 = NameAndType        #100:#141     // makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
  #141 = Utf8               (IILjava/lang/String;)Ljava/lang/String;
  #142 = Methodref          #143.#144     // ext/mods/gameserver/geoengine/geodata/ABlock.hasGeoPos:()Z
  #143 = Class              #145          // ext/mods/gameserver/geoengine/geodata/ABlock
  #144 = NameAndType        #85:#146      // hasGeoPos:()Z
  #145 = Utf8               ext/mods/gameserver/geoengine/geodata/ABlock
  #146 = Utf8               ()Z
  #147 = Methodref          #143.#148     // ext/mods/gameserver/geoengine/geodata/ABlock.getHeightNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #148 = NameAndType        #149:#150     // getHeightNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #149 = Utf8               getHeightNearest
  #150 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #151 = Methodref          #143.#152     // ext/mods/gameserver/geoengine/geodata/ABlock.getNsweNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #152 = NameAndType        #153:#154     // getNsweNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #153 = Utf8               getNsweNearest
  #154 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #155 = Class              #156          // ext/mods/gameserver/geoengine/geodata/GeoStructure
  #156 = Utf8               ext/mods/gameserver/geoengine/geodata/GeoStructure
  #157 = Class              #158          // ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine
  #158 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine
  #159 = String             #160          // x
  #160 = Utf8               x
  #161 = String             #162          //
  #162 = Utf8
  #163 = InvokeDynamic      #2:#164       // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #164 = NameAndType        #100:#165     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #165 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #166 = InvokeDynamic      #3:#167       // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #167 = NameAndType        #100:#168     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #168 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #169 = InvokeDynamic      #4:#164       // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #170 = String             #171          // POS
  #171 = Utf8               POS
  #172 = Methodref          #8.#173       // ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #173 = NameAndType        #174:#175     // getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #174 = Utf8               getDebugPacket
  #175 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #176 = Methodref          #177.#178     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
  #177 = Class              #179          // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #178 = NameAndType        #180:#6       // reset:()V
  #179 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #180 = Utf8               reset
  #181 = Fieldref           #182.#183     // java/awt/Color.GREEN:Ljava/awt/Color;
  #182 = Class              #184          // java/awt/Color
  #183 = NameAndType        #185:#186     // GREEN:Ljava/awt/Color;
  #184 = Utf8               java/awt/Color
  #185 = Utf8               GREEN
  #186 = Utf8               Ljava/awt/Color;
  #187 = Methodref          #177.#188     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
  #188 = NameAndType        #189:#190     // addSquare:(Ljava/awt/Color;IIII)V
  #189 = Utf8               addSquare
  #190 = Utf8               (Ljava/awt/Color;IIII)V
  #191 = Fieldref           #182.#192     // java/awt/Color.RED:Ljava/awt/Color;
  #192 = NameAndType        #193:#186     // RED:Ljava/awt/Color;
  #193 = Utf8               RED
  #194 = Methodref          #177.#195     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
  #195 = NameAndType        #196:#197     // addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
  #196 = Utf8               addPoint
  #197 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIII)V
  #198 = Methodref          #177.#199     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
  #199 = NameAndType        #200:#201     // sendTo:(Lext/mods/gameserver/model/actor/Player;)V
  #200 = Utf8               sendTo
  #201 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #202 = Methodref          #157.#203     // ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine.getCreatureTarget:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
  #203 = NameAndType        #204:#205     // getCreatureTarget:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
  #204 = Utf8               getCreatureTarget
  #205 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
  #206 = String             #207          // CAN_SEE
  #207 = Utf8               CAN_SEE
  #208 = Double             2.0d
  #210 = Methodref          #8.#211       // ext/mods/gameserver/model/actor/Player.getCollisionHeight:()D
  #211 = NameAndType        #212:#213     // getCollisionHeight:()D
  #212 = Utf8               getCollisionHeight
  #213 = Utf8               ()D
  #214 = String             #215          // origin
  #215 = Utf8               origin
  #216 = Fieldref           #182.#217     // java/awt/Color.BLUE:Ljava/awt/Color;
  #217 = NameAndType        #218:#186     // BLUE:Ljava/awt/Color;
  #218 = Utf8               BLUE
  #219 = Methodref          #177.#220     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #220 = NameAndType        #221:#222     // addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #221 = Utf8               addLine
  #222 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #223 = Fieldref           #224.#225     // ext/mods/Config.PART_OF_CHARACTER_HEIGHT:I
  #224 = Class              #226          // ext/mods/Config
  #225 = NameAndType        #227:#228     // PART_OF_CHARACTER_HEIGHT:I
  #226 = Utf8               ext/mods/Config
  #227 = Utf8               PART_OF_CHARACTER_HEIGHT
  #228 = Utf8               I
  #229 = Methodref          #13.#65       // ext/mods/gameserver/model/actor/Creature.getX:()I
  #230 = Methodref          #13.#74       // ext/mods/gameserver/model/actor/Creature.getY:()I
  #231 = Methodref          #13.#119      // ext/mods/gameserver/model/actor/Creature.getZ:()I
  #232 = Methodref          #13.#211      // ext/mods/gameserver/model/actor/Creature.getCollisionHeight:()D
  #233 = String             #234          // target
  #234 = Utf8               target
  #235 = Class              #236          // ext/mods/gameserver/geoengine/geodata/IGeoObject
  #236 = Utf8               ext/mods/gameserver/geoengine/geodata/IGeoObject
  #237 = Methodref          #68.#238      // ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #238 = NameAndType        #239:#240     // canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #239 = Utf8               canSee
  #240 = Utf8               (IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #241 = String             #242          // Line-of-Sight
  #242 = Utf8               Line-of-Sight
  #243 = String             #244          // Geodata limit
  #244 = Utf8               Geodata limit
  #245 = Fieldref           #182.#246     // java/awt/Color.MAGENTA:Ljava/awt/Color;
  #246 = NameAndType        #247:#186     // MAGENTA:Ljava/awt/Color;
  #247 = Utf8               MAGENTA
  #248 = Fieldref           #224.#249     // ext/mods/Config.MAX_OBSTACLE_HEIGHT:I
  #249 = NameAndType        #250:#228     // MAX_OBSTACLE_HEIGHT:I
  #250 = Utf8               MAX_OBSTACLE_HEIGHT
  #251 = Methodref          #252.#92      // ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #252 = Class              #253          // ext/mods/gameserver/model/WorldObject
  #253 = Utf8               ext/mods/gameserver/model/WorldObject
  #254 = String             #255          // CAN_MOVE
  #255 = Utf8               CAN_MOVE
  #256 = Methodref          #257.#65      // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
  #257 = Class              #258          // ext/mods/gameserver/model/location/SpawnLocation
  #258 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #259 = Methodref          #257.#74      // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
  #260 = Methodref          #257.#119     // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
  #261 = Methodref          #68.#262      // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #262 = NameAndType        #263:#264     // getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #263 = Utf8               getValidLocation
  #264 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #265 = String             #266          // Can move
  #266 = Utf8               Can move
  #267 = Methodref          #177.#268     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #268 = NameAndType        #221:#269     // addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #269 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #270 = Methodref          #271.#51      // ext/mods/gameserver/model/location/Location.equals:(Ljava/lang/Object;)Z
  #271 = Class              #272          // ext/mods/gameserver/model/location/Location
  #272 = Utf8               ext/mods/gameserver/model/location/Location
  #273 = String             #274          // Can move beeline.
  #274 = Utf8               Can move beeline.
  #275 = Fieldref           #182.#276     // java/awt/Color.WHITE:Ljava/awt/Color;
  #276 = NameAndType        #277:#186     // WHITE:Ljava/awt/Color;
  #277 = Utf8               WHITE
  #278 = Methodref          #177.#279     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/awt/Color;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #279 = NameAndType        #221:#280     // addLine:(Ljava/awt/Color;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #280 = Utf8               (Ljava/awt/Color;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #281 = String             #282          // Inaccessible
  #282 = Utf8               Inaccessible
  #283 = String             #284          // Limit
  #284 = Utf8               Limit
  #285 = Methodref          #177.#286     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;)V
  #286 = NameAndType        #196:#287     // addPoint:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;)V
  #287 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;)V
  #288 = String             #289          // Can not move beeline!
  #289 = Utf8               Can not move beeline!
  #290 = String             #291          // CAN_FLY
  #291 = Utf8               CAN_FLY
  #292 = Methodref          #68.#293      // ext/mods/gameserver/geoengine/GeoEngine.getValidFlyLocation:(IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #293 = NameAndType        #294:#295     // getValidFlyLocation:(IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #294 = Utf8               getValidFlyLocation
  #295 = Utf8               (IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #296 = Methodref          #271.#65      // ext/mods/gameserver/model/location/Location.getX:()I
  #297 = Methodref          #271.#74      // ext/mods/gameserver/model/location/Location.getY:()I
  #298 = Methodref          #271.#119     // ext/mods/gameserver/model/location/Location.getZ:()I
  #299 = String             #300          // Can fly
  #300 = Utf8               Can fly
  #301 = String             #302          // Can fly beeline.
  #302 = Utf8               Can fly beeline.
  #303 = String             #304          // Can not fly beeline!
  #304 = Utf8               Can not fly beeline!
  #305 = Methodref          #177.#306     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/awt/Color;IIIIII)V
  #306 = NameAndType        #221:#307     // addLine:(Ljava/awt/Color;IIIIII)V
  #307 = Utf8               (Ljava/awt/Color;IIIIII)V
  #308 = String             #309          // Last position
  #309 = Utf8               Last position
  #310 = String             #311          // Line-of-Flight MIN
  #311 = Utf8               Line-of-Flight MIN
  #312 = String             #313          // Line-of-Fligth MAX
  #313 = Utf8               Line-of-Fligth MAX
  #314 = Methodref          #25.#315      // java/util/StringTokenizer.hasMoreTokens:()Z
  #315 = NameAndType        #316:#146     // hasMoreTokens:()Z
  #316 = Utf8               hasMoreTokens
  #317 = Methodref          #318.#319     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #318 = Class              #320          // java/lang/Integer
  #319 = NameAndType        #321:#322     // parseInt:(Ljava/lang/String;)I
  #320 = Utf8               java/lang/Integer
  #321 = Utf8               parseInt
  #322 = Utf8               (Ljava/lang/String;)I
  #323 = Methodref          #324.#325     // java/lang/Math.max:(II)I
  #324 = Class              #326          // java/lang/Math
  #325 = NameAndType        #327:#328     // max:(II)I
  #326 = Utf8               java/lang/Math
  #327 = Utf8               max
  #328 = Utf8               (II)I
  #329 = Methodref          #324.#330     // java/lang/Math.min:(II)I
  #330 = NameAndType        #331:#328     // min:(II)I
  #331 = Utf8               min
  #332 = Methodref          #157.#333     // ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine.displayGeoGrid:(Lext/mods/gameserver/model/actor/Player;I)V
  #333 = NameAndType        #334:#335     // displayGeoGrid:(Lext/mods/gameserver/model/actor/Player;I)V
  #334 = Utf8               displayGeoGrid
  #335 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #336 = Class              #337          // java/lang/NumberFormatException
  #337 = Utf8               java/lang/NumberFormatException
  #338 = String             #339          // Usage: //geo grid [radius] - radius deve ser entre 2 e 20
  #339 = Utf8               Usage: //geo grid [radius] - radius deve ser entre 2 e 20
  #340 = String             #341          // Usage: //geo bug|pos|see|move|fly|grid
  #341 = Utf8               Usage: //geo bug|pos|see|move|fly|grid
  #342 = String             #343          // admin_path
  #343 = Utf8               admin_path
  #344 = String             #345          // find
  #345 = Utf8               find
  #346 = String             #347          // PATH
  #347 = Utf8               PATH
  #348 = Methodref          #252.#65      // ext/mods/gameserver/model/WorldObject.getX:()I
  #349 = Methodref          #252.#74      // ext/mods/gameserver/model/WorldObject.getY:()I
  #350 = Methodref          #252.#119     // ext/mods/gameserver/model/WorldObject.getZ:()I
  #351 = Methodref          #68.#352      // ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #352 = NameAndType        #353:#354     // findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #353 = Utf8               findPath
  #354 = Utf8               (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #355 = InterfaceMethodref #356.#357     // java/util/List.isEmpty:()Z
  #356 = Class              #358          // java/util/List
  #357 = NameAndType        #359:#146     // isEmpty:()Z
  #358 = Utf8               java/util/List
  #359 = Utf8               isEmpty
  #360 = String             #361          // No route found or pathfinding is disabled.
  #361 = Utf8               No route found or pathfinding is disabled.
  #362 = InterfaceMethodref #356.#363     // java/util/List.iterator:()Ljava/util/Iterator;
  #363 = NameAndType        #364:#365     // iterator:()Ljava/util/Iterator;
  #364 = Utf8               iterator
  #365 = Utf8               ()Ljava/util/Iterator;
  #366 = InterfaceMethodref #367.#368     // java/util/Iterator.hasNext:()Z
  #367 = Class              #369          // java/util/Iterator
  #368 = NameAndType        #370:#146     // hasNext:()Z
  #369 = Utf8               java/util/Iterator
  #370 = Utf8               hasNext
  #371 = InterfaceMethodref #367.#372     // java/util/Iterator.next:()Ljava/lang/Object;
  #372 = NameAndType        #373:#374     // next:()Ljava/lang/Object;
  #373 = Utf8               next
  #374 = Utf8               ()Ljava/lang/Object;
  #375 = InvokeDynamic      #5:#376       // #5:makeConcatWithConstants:(III)Ljava/lang/String;
  #376 = NameAndType        #100:#377     // makeConcatWithConstants:(III)Ljava/lang/String;
  #377 = Utf8               (III)Ljava/lang/String;
  #378 = String             #379          // Usage: //path find|info
  #379 = Utf8               Usage: //path find|info
  #380 = String             #381          // GEO_GRID
  #381 = Utf8               GEO_GRID
  #382 = Integer            2147483647
  #383 = Integer            -2147483648
  #384 = Methodref          #68.#385      // ext/mods/gameserver/geoengine/GeoEngine.getHeightNearest:(III)S
  #385 = NameAndType        #149:#386     // getHeightNearest:(III)S
  #386 = Utf8               (III)S
  #387 = String             #388          // Sem geodata disponível nesta área!
  #388 = Utf8               Sem geodata disponível nesta área!
  #389 = Methodref          #68.#390      // ext/mods/gameserver/geoengine/GeoEngine.getNsweNearest:(III)B
  #390 = NameAndType        #153:#391     // getNsweNearest:(III)B
  #391 = Utf8               (III)B
  #392 = Methodref          #68.#393      // ext/mods/gameserver/geoengine/GeoEngine.getWorldX:(I)I
  #393 = NameAndType        #394:#72      // getWorldX:(I)I
  #394 = Utf8               getWorldX
  #395 = Methodref          #68.#396      // ext/mods/gameserver/geoengine/GeoEngine.getWorldY:(I)I
  #396 = NameAndType        #397:#72      // getWorldY:(I)I
  #397 = Utf8               getWorldY
  #398 = Methodref          #157.#399     // ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine.getHeightColor:(III)Ljava/awt/Color;
  #399 = NameAndType        #400:#401     // getHeightColor:(III)Ljava/awt/Color;
  #400 = Utf8               getHeightColor
  #401 = Utf8               (III)Ljava/awt/Color;
  #402 = Methodref          #157.#403     // ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine.drawNsweIndicators:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;IIIIB)V
  #403 = NameAndType        #404:#405     // drawNsweIndicators:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;IIIIB)V
  #404 = Utf8               drawNsweIndicators
  #405 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;IIIIB)V
  #406 = String             #407          // VOCÊ
  #407 = Utf8               VOCÊ
  #408 = Fieldref           #182.#409     // java/awt/Color.CYAN:Ljava/awt/Color;
  #409 = NameAndType        #410:#186     // CYAN:Ljava/awt/Color;
  #410 = Utf8               CYAN
  #411 = Methodref          #177.#412     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/lang/String;Ljava/awt/Color;ZIIII)V
  #412 = NameAndType        #189:#413     // addSquare:(Ljava/lang/String;Ljava/awt/Color;ZIIII)V
  #413 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIIII)V
  #414 = String             #415          // Player
  #415 = Utf8               Player
  #416 = Methodref          #157.#417     // ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine.drawGridLines:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;IIII)V
  #417 = NameAndType        #418:#419     // drawGridLines:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;IIII)V
  #418 = Utf8               drawGridLines
  #419 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;IIII)V
  #420 = String             #421          // === GeoEngine Grid Debug ===
  #421 = Utf8               === GeoEngine Grid Debug ===
  #422 = InvokeDynamic      #6:#423       // #6:makeConcatWithConstants:(I)Ljava/lang/String;
  #423 = NameAndType        #100:#90      // makeConcatWithConstants:(I)Ljava/lang/String;
  #424 = InvokeDynamic      #7:#425       // #7:makeConcatWithConstants:(II)Ljava/lang/String;
  #425 = NameAndType        #100:#426     // makeConcatWithConstants:(II)Ljava/lang/String;
  #426 = Utf8               (II)Ljava/lang/String;
  #427 = InvokeDynamic      #8:#423       // #8:makeConcatWithConstants:(I)Ljava/lang/String;
  #428 = InvokeDynamic      #9:#423       // #9:makeConcatWithConstants:(I)Ljava/lang/String;
  #429 = InvokeDynamic      #10:#423      // #10:makeConcatWithConstants:(I)Ljava/lang/String;
  #430 = InvokeDynamic      #11:#425      // #11:makeConcatWithConstants:(II)Ljava/lang/String;
  #431 = String             #432          // ===========================
  #432 = Utf8               ===========================
  #433 = Float              0.25f
  #434 = Float              255.0f
  #435 = Methodref          #182.#436     // java/awt/Color."<init>":(III)V
  #436 = NameAndType        #5:#437       // "<init>":(III)V
  #437 = Utf8               (III)V
  #438 = Float              0.5f
  #439 = Float              0.75f
  #440 = Fieldref           #182.#441     // java/awt/Color.ORANGE:Ljava/awt/Color;
  #441 = NameAndType        #442:#186     // ORANGE:Ljava/awt/Color;
  #442 = Utf8               ORANGE
  #443 = Methodref          #182.#444     // java/awt/Color."<init>":(IIII)V
  #444 = NameAndType        #5:#445       // "<init>":(IIII)V
  #445 = Utf8               (IIII)V
  #446 = Fieldref           #157.#447     // ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine.ADMIN_COMMANDS:[Ljava/lang/String;
  #447 = NameAndType        #448:#449     // ADMIN_COMMANDS:[Ljava/lang/String;
  #448 = Utf8               ADMIN_COMMANDS
  #449 = Utf8               [Ljava/lang/String;
  #450 = Class              #451          // ext/mods/gameserver/handler/IAdminCommandHandler
  #451 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #452 = Utf8               Y
  #453 = Utf8               Ljava/lang/String;
  #454 = Utf8               ConstantValue
  #455 = Utf8               N
  #456 = Utf8               Code
  #457 = Utf8               LineNumberTable
  #458 = Utf8               LocalVariableTable
  #459 = Utf8               this
  #460 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine;
  #461 = Utf8               player
  #462 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #463 = Utf8               Z
  #464 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #465 = Utf8               StackMapTable
  #466 = Utf8               useAdminCommand
  #467 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #468 = Utf8               comment
  #469 = Utf8               e
  #470 = Utf8               Ljava/lang/Exception;
  #471 = Utf8               geoX
  #472 = Utf8               geoY
  #473 = Utf8               geoZ
  #474 = Utf8               nswe
  #475 = Utf8               B
  #476 = Utf8               debug
  #477 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #478 = Utf8               ox
  #479 = Utf8               oy
  #480 = Utf8               oz
  #481 = Utf8               rx
  #482 = Utf8               ry
  #483 = Utf8               block
  #484 = Utf8               Lext/mods/gameserver/geoengine/geodata/ABlock;
  #485 = Utf8               igo
  #486 = Utf8               Lext/mods/gameserver/geoengine/geodata/IGeoObject;
  #487 = Utf8               targetCreature
  #488 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #489 = Utf8               oh
  #490 = Utf8               tx
  #491 = Utf8               ty
  #492 = Utf8               tz
  #493 = Utf8               th
  #494 = Utf8               ignore
  #495 = Utf8               targetWorldObject
  #496 = Utf8               aLoc
  #497 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #498 = Utf8               tLoc
  #499 = Utf8               loc
  #500 = Utf8               Lext/mods/gameserver/model/location/Location;
  #501 = Utf8               x
  #502 = Utf8               y
  #503 = Utf8               z
  #504 = Utf8               canFly
  #505 = Utf8               radius
  #506 = Utf8               Ljava/lang/NumberFormatException;
  #507 = Utf8               path
  #508 = Utf8               Ljava/util/List;
  #509 = Utf8               command
  #510 = Utf8               st
  #511 = Utf8               Ljava/util/StringTokenizer;
  #512 = Utf8               LocalVariableTypeTable
  #513 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #514 = Utf8               height
  #515 = Utf8               S
  #516 = Utf8               dy
  #517 = Utf8               dx
  #518 = Utf8               worldX
  #519 = Utf8               worldY
  #520 = Utf8               cellColor
  #521 = Utf8               cellSize
  #522 = Utf8               playerX
  #523 = Utf8               playerY
  #524 = Utf8               playerZ
  #525 = Utf8               centerGeoX
  #526 = Utf8               centerGeoY
  #527 = Utf8               minHeight
  #528 = Utf8               maxHeight
  #529 = Utf8               heightRange
  #530 = Utf8               cellCount
  #531 = Utf8               blockedCount
  #532 = Utf8               t
  #533 = Utf8               F
  #534 = Utf8               normalized
  #535 = Utf8               size
  #536 = Utf8               offset
  #537 = Utf8               geoXStart
  #538 = Utf8               geoYStart
  #539 = Utf8               geoYEnd
  #540 = Utf8               worldYStart
  #541 = Utf8               worldYEnd
  #542 = Utf8               zStart
  #543 = Utf8               zEnd
  #544 = Utf8               geoXEnd
  #545 = Utf8               worldXStart
  #546 = Utf8               worldXEnd
  #547 = Utf8               baseZ
  #548 = Utf8               getAdminCommandList
  #549 = Utf8               ()[Ljava/lang/String;
  #550 = Utf8               <clinit>
  #551 = Utf8               SourceFile
  #552 = Utf8               AdminGeoEngine.java
  #553 = Utf8               BootstrapMethods
  #554 = String             #555          // \u0001: \u0001
  #555 = Utf8               \u0001: \u0001
  #556 = String             #557          // Region: \u0001_\u0001; Block: \u0001
  #557 = Utf8               Region: \u0001_\u0001; Block: \u0001
  #558 = String             #559          //     \u0001\u0001\u0001         GeoX=\u0001
  #559 = Utf8                   \u0001\u0001\u0001         GeoX=\u0001
  #560 = String             #561          //     \u0001o \u0001         GeoY=\u0001
  #561 = Utf8                   \u0001o \u0001         GeoY=\u0001
  #562 = String             #563          //     \u0001\u0001\u0001         GeoZ=\u0001
  #563 = Utf8                   \u0001\u0001\u0001         GeoZ=\u0001
  #564 = String             #565          // x:\u0001 y:\u0001 z:\u0001
  #565 = Utf8               x:\u0001 y:\u0001 z:\u0001
  #566 = String             #567          // Células analisadas: \u0001
  #567 = Utf8               Células analisadas: \u0001
  #568 = String             #569          // Células bloqueadas: \u0001 (\u0001%)
  #569 = Utf8               Células bloqueadas: \u0001 (\u0001%)
  #570 = String             #571          // Altura mínima: \u0001
  #571 = Utf8               Altura mínima: \u0001
  #572 = String             #573          // Altura máxima: \u0001
  #573 = Utf8               Altura máxima: \u0001
  #574 = String             #575          // Variação de altura: \u0001
  #575 = Utf8               Variação de altura: \u0001
  #576 = String             #577          // Posição GeoData: [\u0001, \u0001]
  #577 = Utf8               Posição GeoData: [\u0001, \u0001]
  #578 = MethodHandle       6:#579        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #579 = Methodref          #580.#581     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #580 = Class              #582          // java/lang/invoke/StringConcatFactory
  #581 = NameAndType        #100:#583     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #582 = Utf8               java/lang/invoke/StringConcatFactory
  #583 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #584 = Utf8               InnerClasses
  #585 = Class              #586          // java/lang/invoke/MethodHandles$Lookup
  #586 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #587 = Class              #588          // java/lang/invoke/MethodHandles
  #588 = Utf8               java/lang/invoke/MethodHandles
  #589 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminGeoEngine();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=14, locals=32, args_size=3
         0: new           #25                 // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #27                 // String
         7: invokespecial #29                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #32                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: aload_1
        17: ldc           #36                 // String admin_geo
        19: invokevirtual #38                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        22: ifeq          1682
        25: aload_3
        26: invokevirtual #32                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        29: astore        4
        31: iconst_m1
        32: istore        5
        34: aload         4
        36: invokevirtual #44                 // Method java/lang/String.hashCode:()I
        39: lookupswitch  { // 6

                   97908: 96

                  101491: 160

                  111188: 112

                  113747: 128

                 3181382: 176

                 3357649: 144
                 default: 189
            }
        96: aload         4
        98: ldc           #48                 // String bug
       100: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       103: ifeq          189
       106: iconst_0
       107: istore        5
       109: goto          189
       112: aload         4
       114: ldc           #54                 // String pos
       116: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       119: ifeq          189
       122: iconst_1
       123: istore        5
       125: goto          189
       128: aload         4
       130: ldc           #56                 // String see
       132: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       135: ifeq          189
       138: iconst_2
       139: istore        5
       141: goto          189
       144: aload         4
       146: ldc           #58                 // String move
       148: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       151: ifeq          189
       154: iconst_3
       155: istore        5
       157: goto          189
       160: aload         4
       162: ldc           #60                 // String fly
       164: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       167: ifeq          189
       170: iconst_4
       171: istore        5
       173: goto          189
       176: aload         4
       178: ldc           #62                 // String grid
       180: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       183: ifeq          189
       186: iconst_5
       187: istore        5
       189: iload         5
       191: tableswitch   { // 0 to 5

                       0: 228

                       1: 320

                       2: 695

                       3: 1026

                       4: 1199

                       5: 1615
                 default: 1667
            }
       228: aload_2
       229: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
       232: invokestatic  #67                 // Method ext/mods/gameserver/geoengine/GeoEngine.getGeoX:(I)I
       235: istore        6
       237: aload_2
       238: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getY:()I
       241: invokestatic  #76                 // Method ext/mods/gameserver/geoengine/GeoEngine.getGeoY:(I)I
       244: istore        7
       246: invokestatic  #79                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       249: iload         6
       251: iload         7
       253: invokevirtual #83                 // Method ext/mods/gameserver/geoengine/GeoEngine.hasGeoPos:(II)Z
       256: ifeq          311
       259: aload_1
       260: bipush        14
       262: invokevirtual #87                 // Method java/lang/String.substring:(I)Ljava/lang/String;
       265: astore        8
       267: invokestatic  #79                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       270: aload_2
       271: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       274: aload_2
       275: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       278: aload         8
       280: invokedynamic #98,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       285: invokevirtual #102                // Method ext/mods/gameserver/geoengine/GeoEngine.addGeoBug:(Lext/mods/gameserver/model/location/Location;Ljava/lang/String;)Z
       288: ifeq          297
       291: aload_2
       292: ldc           #106                // String GeoData bug saved.
       294: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       297: goto          1667
       300: astore        8
       302: aload_2
       303: ldc           #114                // String Usage: //geo bug comments
       305: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       308: goto          1667
       311: aload_2
       312: ldc           #116                // String There is no geodata at this position.
       314: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       317: goto          1667
       320: aload_2
       321: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
       324: istore        8
       326: aload_2
       327: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getY:()I
       330: istore        9
       332: aload_2
       333: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       336: istore        10
       338: iload         8
       340: invokestatic  #67                 // Method ext/mods/gameserver/geoengine/GeoEngine.getGeoX:(I)I
       343: istore        6
       345: iload         9
       347: invokestatic  #76                 // Method ext/mods/gameserver/geoengine/GeoEngine.getGeoY:(I)I
       350: istore        7
       352: iload         8
       354: ldc           #123                // int -131072
       356: isub
       357: ldc           #124                // int 32768
       359: idiv
       360: bipush        16
       362: iadd
       363: istore        11
       365: iload         9
       367: ldc           #125                // int -262144
       369: isub
       370: ldc           #124                // int 32768
       372: idiv
       373: bipush        10
       375: iadd
       376: istore        12
       378: invokestatic  #79                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       381: iload         6
       383: iload         7
       385: invokevirtual #126                // Method ext/mods/gameserver/geoengine/GeoEngine.getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
       388: astore        13
       390: aload_2
       391: iload         11
       393: iload         12
       395: aload         13
       397: invokevirtual #130                // Method java/lang/Object.getClass:()Ljava/lang/Class;
       400: invokevirtual #134                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
       403: invokedynamic #139,  0            // InvokeDynamic #1:makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
       408: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       411: aload         13
       413: invokevirtual #142                // Method ext/mods/gameserver/geoengine/geodata/ABlock.hasGeoPos:()Z
       416: ifeq          686
       419: aload         13
       421: iload         6
       423: iload         7
       425: aload_2
       426: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       429: aconst_null
       430: invokevirtual #147                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeightNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       433: istore        14
       435: aload         13
       437: iload         6
       439: iload         7
       441: iload         14
       443: aconst_null
       444: invokevirtual #151                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNsweNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       447: istore        15
       449: aload_2
       450: iload         15
       452: bipush        8
       454: iand
       455: ifeq          470
       458: iload         15
       460: iconst_2
       461: iand
       462: ifeq          470
       465: ldc           #159                // String x
       467: goto          472
       470: ldc           #161                // String
       472: iload         15
       474: bipush        8
       476: iand
       477: ifeq          485
       480: ldc           #159                // String x
       482: goto          487
       485: ldc           #161                // String
       487: iload         15
       489: bipush        8
       491: iand
       492: ifeq          507
       495: iload         15
       497: iconst_1
       498: iand
       499: ifeq          507
       502: ldc           #159                // String x
       504: goto          509
       507: ldc           #161                // String
       509: iload         6
       511: invokedynamic #163,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
       516: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       519: aload_2
       520: iload         15
       522: iconst_2
       523: iand
       524: ifeq          532
       527: ldc           #159                // String x
       529: goto          534
       532: ldc           #161                // String
       534: iload         15
       536: iconst_1
       537: iand
       538: ifeq          546
       541: ldc           #159                // String x
       543: goto          548
       546: ldc           #161                // String
       548: iload         7
       550: invokedynamic #166,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
       555: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       558: aload_2
       559: iload         15
       561: iconst_4
       562: iand
       563: ifeq          578
       566: iload         15
       568: iconst_2
       569: iand
       570: ifeq          578
       573: ldc           #159                // String x
       575: goto          580
       578: ldc           #161                // String
       580: iload         15
       582: iconst_4
       583: iand
       584: ifeq          592
       587: ldc           #159                // String x
       589: goto          594
       592: ldc           #161                // String
       594: iload         15
       596: iconst_4
       597: iand
       598: ifeq          613
       601: iload         15
       603: iconst_1
       604: iand
       605: ifeq          613
       608: ldc           #159                // String x
       610: goto          615
       613: ldc           #161                // String
       615: iload         14
       617: invokedynamic #169,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
       622: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       625: aload_2
       626: ldc           #170                // String POS
       628: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
       631: astore        16
       633: aload         16
       635: invokevirtual #176                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
       638: aload         16
       640: getstatic     #181                // Field java/awt/Color.GREEN:Ljava/awt/Color;
       643: iload         8
       645: bipush        -16
       647: iand
       648: iload         9
       650: bipush        -16
       652: iand
       653: iload         10
       655: bipush        15
       657: invokevirtual #187                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       660: aload         16
       662: ldc           #170                // String POS
       664: getstatic     #191                // Field java/awt/Color.RED:Ljava/awt/Color;
       667: iconst_1
       668: iload         8
       670: iload         9
       672: iload         10
       674: invokevirtual #194                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
       677: aload         16
       679: aload_2
       680: invokevirtual #198                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
       683: goto          1667
       686: aload_2
       687: ldc           #116                // String There is no geodata at this position.
       689: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       692: goto          1667
       695: aload_0
       696: aload_2
       697: iconst_1
       698: invokevirtual #202                // Method getCreatureTarget:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
       701: astore        14
       703: aload_2
       704: ldc           #206                // String CAN_SEE
       706: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
       709: astore        15
       711: aload         15
       713: invokevirtual #176                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
       716: aload_2
       717: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
       720: istore        8
       722: aload_2
       723: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getY:()I
       726: istore        9
       728: aload_2
       729: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       732: istore        10
       734: ldc2_w        #208                // double 2.0d
       737: aload_2
       738: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Player.getCollisionHeight:()D
       741: dmul
       742: d2i
       743: istore        16
       745: aload         15
       747: ldc           #214                // String origin
       749: getstatic     #216                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       752: iconst_1
       753: iload         8
       755: iload         9
       757: iload         10
       759: iload         8
       761: iload         9
       763: iload         10
       765: iload         16
       767: iadd
       768: invokevirtual #219                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       771: iload         16
       773: getstatic     #223                // Field ext/mods/Config.PART_OF_CHARACTER_HEIGHT:I
       776: imul
       777: bipush        100
       779: idiv
       780: istore        16
       782: aload         14
       784: invokevirtual #229                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
       787: istore        17
       789: aload         14
       791: invokevirtual #230                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
       794: istore        18
       796: aload         14
       798: invokevirtual #231                // Method ext/mods/gameserver/model/actor/Creature.getZ:()I
       801: istore        19
       803: ldc2_w        #208                // double 2.0d
       806: aload         14
       808: invokevirtual #232                // Method ext/mods/gameserver/model/actor/Creature.getCollisionHeight:()D
       811: dmul
       812: d2i
       813: istore        20
       815: aload         15
       817: ldc           #233                // String target
       819: getstatic     #216                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       822: iconst_1
       823: iload         17
       825: iload         18
       827: iload         19
       829: iload         17
       831: iload         18
       833: iload         19
       835: iload         20
       837: iadd
       838: invokevirtual #219                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       841: iload         20
       843: getstatic     #223                // Field ext/mods/Config.PART_OF_CHARACTER_HEIGHT:I
       846: imul
       847: bipush        100
       849: idiv
       850: istore        20
       852: aload         14
       854: instanceof    #235                // class ext/mods/gameserver/geoengine/geodata/IGeoObject
       857: ifeq          872
       860: aload         14
       862: checkcast     #235                // class ext/mods/gameserver/geoengine/geodata/IGeoObject
       865: astore        22
       867: aload         22
       869: goto          873
       872: aconst_null
       873: astore        21
       875: invokestatic  #79                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       878: iload         17
       880: iload         18
       882: iload         19
       884: iload         20
       886: i2d
       887: iload         8
       889: iload         9
       891: iload         10
       893: iload         16
       895: i2d
       896: aload         21
       898: aload         15
       900: invokevirtual #237                // Method ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
       903: istore        22
       905: iload         22
       907: invokestatic  #79                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       910: iload         8
       912: iload         9
       914: iload         10
       916: iload         16
       918: i2d
       919: iload         17
       921: iload         18
       923: iload         19
       925: iload         20
       927: i2d
       928: aload         21
       930: aload         15
       932: invokevirtual #237                // Method ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
       935: iand
       936: istore        22
       938: iload         16
       940: iload         10
       942: iadd
       943: istore        16
       945: iload         20
       947: iload         19
       949: iadd
       950: istore        20
       952: aload         15
       954: ldc           #241                // String Line-of-Sight
       956: iload         22
       958: ifeq          967
       961: getstatic     #181                // Field java/awt/Color.GREEN:Ljava/awt/Color;
       964: goto          970
       967: getstatic     #191                // Field java/awt/Color.RED:Ljava/awt/Color;
       970: iconst_1
       971: iload         8
       973: iload         9
       975: iload         16
       977: iload         17
       979: iload         18
       981: iload         20
       983: invokevirtual #219                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       986: aload         15
       988: ldc           #243                // String Geodata limit
       990: getstatic     #245                // Field java/awt/Color.MAGENTA:Ljava/awt/Color;
       993: iconst_1
       994: iload         8
       996: iload         9
       998: iload         16
      1000: getstatic     #248                // Field ext/mods/Config.MAX_OBSTACLE_HEIGHT:I
      1003: iadd
      1004: iload         17
      1006: iload         18
      1008: iload         20
      1010: getstatic     #248                // Field ext/mods/Config.MAX_OBSTACLE_HEIGHT:I
      1013: iadd
      1014: invokevirtual #219                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
      1017: aload         15
      1019: aload_2
      1020: invokevirtual #198                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
      1023: goto          1667
      1026: aload_2
      1027: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
      1030: astore        23
      1032: aload         23
      1034: ifnonnull     1045
      1037: aload_2
      1038: getstatic     #15                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      1041: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1044: return
      1045: aload_2
      1046: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
      1049: astore        24
      1051: aload         23
      1053: invokevirtual #251                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
      1056: astore        25
      1058: aload_2
      1059: ldc           #254                // String CAN_MOVE
      1061: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
      1064: astore        15
      1066: aload         15
      1068: invokevirtual #176                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
      1071: invokestatic  #79                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
      1074: aload         24
      1076: invokevirtual #256                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
      1079: aload         24
      1081: invokevirtual #259                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
      1084: aload         24
      1086: invokevirtual #260                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
      1089: aload         25
      1091: invokevirtual #256                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
      1094: aload         25
      1096: invokevirtual #259                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
      1099: aload         25
      1101: invokevirtual #260                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
      1104: aload         15
      1106: invokevirtual #261                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
      1109: astore        26
      1111: aload         15
      1113: ldc_w         #265                // String Can move
      1116: getstatic     #181                // Field java/awt/Color.GREEN:Ljava/awt/Color;
      1119: iconst_1
      1120: aload         24
      1122: aload         26
      1124: invokevirtual #267                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
      1127: aload         26
      1129: aload         25
      1131: invokevirtual #270                // Method ext/mods/gameserver/model/location/Location.equals:(Ljava/lang/Object;)Z
      1134: ifeq          1147
      1137: aload_2
      1138: ldc_w         #273                // String Can move beeline.
      1141: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1144: goto          1667
      1147: aload         15
      1149: getstatic     #275                // Field java/awt/Color.WHITE:Ljava/awt/Color;
      1152: aload         24
      1154: aload         25
      1156: invokevirtual #278                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/awt/Color;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
      1159: aload         15
      1161: ldc_w         #281                // String Inaccessible
      1164: getstatic     #191                // Field java/awt/Color.RED:Ljava/awt/Color;
      1167: iconst_1
      1168: aload         26
      1170: aload         25
      1172: invokevirtual #267                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
      1175: aload         15
      1177: ldc_w         #283                // String Limit
      1180: getstatic     #191                // Field java/awt/Color.RED:Ljava/awt/Color;
      1183: iconst_1
      1184: aload         26
      1186: invokevirtual #285                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;)V
      1189: aload_2
      1190: ldc_w         #288                // String Can not move beeline!
      1193: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1196: goto          1667
      1199: aload_0
      1200: aload_2
      1201: iconst_1
      1202: invokevirtual #202                // Method getCreatureTarget:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
      1205: astore        14
      1207: aload_2
      1208: ldc_w         #290                // String CAN_FLY
      1211: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
      1214: astore        15
      1216: aload         15
      1218: invokevirtual #176                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
      1221: aload_2
      1222: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
      1225: istore        8
      1227: aload_2
      1228: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getY:()I
      1231: istore        9
      1233: aload_2
      1234: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
      1237: istore        10
      1239: ldc2_w        #208                // double 2.0d
      1242: aload_2
      1243: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Player.getCollisionHeight:()D
      1246: dmul
      1247: d2i
      1248: istore        16
      1250: aload         15
      1252: ldc           #214                // String origin
      1254: getstatic     #216                // Field java/awt/Color.BLUE:Ljava/awt/Color;
      1257: iconst_1
      1258: iload         8
      1260: iload         9
      1262: iload         10
      1264: bipush        32
      1266: isub
      1267: iload         8
      1269: iload         9
      1271: iload         10
      1273: iload         16
      1275: iadd
      1276: bipush        32
      1278: isub
      1279: invokevirtual #219                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
      1282: aload         14
      1284: invokevirtual #229                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
      1287: istore        17
      1289: aload         14
      1291: invokevirtual #230                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
      1294: istore        18
      1296: aload         14
      1298: invokevirtual #231                // Method ext/mods/gameserver/model/actor/Creature.getZ:()I
      1301: istore        19
      1303: invokestatic  #79                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
      1306: iload         8
      1308: iload         9
      1310: iload         10
      1312: iload         16
      1314: i2d
      1315: iload         17
      1317: iload         18
      1319: iload         19
      1321: aload         15
      1323: invokevirtual #292                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidFlyLocation:(IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
      1326: astore        26
      1328: aload         26
      1330: invokevirtual #296                // Method ext/mods/gameserver/model/location/Location.getX:()I
      1333: istore        27
      1335: aload         26
      1337: invokevirtual #297                // Method ext/mods/gameserver/model/location/Location.getY:()I
      1340: istore        28
      1342: aload         26
      1344: invokevirtual #298                // Method ext/mods/gameserver/model/location/Location.getZ:()I
      1347: istore        29
      1349: iload         27
      1351: iload         17
      1353: if_icmpne     1374
      1356: iload         28
      1358: iload         18
      1360: if_icmpne     1374
      1363: iload         29
      1365: iload         19
      1367: if_icmpne     1374
      1370: iconst_1
      1371: goto          1375
      1374: iconst_0
      1375: istore        30
      1377: aload         15
      1379: ldc_w         #299                // String Can fly
      1382: getstatic     #181                // Field java/awt/Color.GREEN:Ljava/awt/Color;
      1385: iconst_1
      1386: iload         8
      1388: iload         9
      1390: iload         10
      1392: bipush        32
      1394: isub
      1395: iload         27
      1397: iload         28
      1399: iload         29
      1401: bipush        32
      1403: isub
      1404: invokevirtual #219                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
      1407: iload         30
      1409: ifeq          1422
      1412: aload_2
      1413: ldc_w         #301                // String Can fly beeline.
      1416: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1419: goto          1518
      1422: aload_2
      1423: ldc_w         #303                // String Can not fly beeline!
      1426: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1429: aload         15
      1431: getstatic     #275                // Field java/awt/Color.WHITE:Ljava/awt/Color;
      1434: iload         8
      1436: iload         9
      1438: iload         10
      1440: bipush        32
      1442: isub
      1443: iload         17
      1445: iload         18
      1447: iload         19
      1449: bipush        32
      1451: isub
      1452: invokevirtual #305                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/awt/Color;IIIIII)V
      1455: aload         15
      1457: ldc_w         #281                // String Inaccessible
      1460: getstatic     #191                // Field java/awt/Color.RED:Ljava/awt/Color;
      1463: iconst_1
      1464: iload         27
      1466: iload         28
      1468: iload         29
      1470: bipush        32
      1472: isub
      1473: iload         17
      1475: iload         18
      1477: iload         19
      1479: bipush        32
      1481: isub
      1482: invokevirtual #219                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
      1485: aload         15
      1487: ldc_w         #308                // String Last position
      1490: getstatic     #191                // Field java/awt/Color.RED:Ljava/awt/Color;
      1493: iconst_1
      1494: iload         27
      1496: iload         28
      1498: iload         29
      1500: bipush        32
      1502: isub
      1503: iload         27
      1505: iload         28
      1507: iload         29
      1509: iload         16
      1511: iadd
      1512: bipush        32
      1514: isub
      1515: invokevirtual #219                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
      1518: aload         15
      1520: ldc_w         #310                // String Line-of-Flight MIN
      1523: iload         30
      1525: ifeq          1534
      1528: getstatic     #181                // Field java/awt/Color.GREEN:Ljava/awt/Color;
      1531: goto          1537
      1534: getstatic     #191                // Field java/awt/Color.RED:Ljava/awt/Color;
      1537: iconst_1
      1538: iload         8
      1540: iload         9
      1542: iload         10
      1544: bipush        32
      1546: isub
      1547: iload         17
      1549: iload         18
      1551: iload         19
      1553: bipush        32
      1555: isub
      1556: invokevirtual #219                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
      1559: aload         15
      1561: ldc_w         #312                // String Line-of-Fligth MAX
      1564: iload         30
      1566: ifeq          1575
      1569: getstatic     #181                // Field java/awt/Color.GREEN:Ljava/awt/Color;
      1572: goto          1578
      1575: getstatic     #191                // Field java/awt/Color.RED:Ljava/awt/Color;
      1578: iconst_1
      1579: iload         8
      1581: iload         9
      1583: iload         10
      1585: iload         16
      1587: iadd
      1588: bipush        32
      1590: isub
      1591: iload         17
      1593: iload         18
      1595: iload         19
      1597: iload         16
      1599: iadd
      1600: bipush        32
      1602: isub
      1603: invokevirtual #219                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
      1606: aload         15
      1608: aload_2
      1609: invokevirtual #198                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
      1612: goto          1667
      1615: aload_3
      1616: invokevirtual #314                // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1619: ifeq          1632
      1622: aload_3
      1623: invokevirtual #32                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1626: invokestatic  #317                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1629: goto          1633
      1632: iconst_5
      1633: istore        31
      1635: iload         31
      1637: iconst_2
      1638: invokestatic  #323                // Method java/lang/Math.max:(II)I
      1641: bipush        20
      1643: invokestatic  #329                // Method java/lang/Math.min:(II)I
      1646: istore        31
      1648: aload_0
      1649: aload_2
      1650: iload         31
      1652: invokevirtual #332                // Method displayGeoGrid:(Lext/mods/gameserver/model/actor/Player;I)V
      1655: goto          1667
      1658: astore        31
      1660: aload_2
      1661: ldc_w         #338                // String Usage: //geo grid [radius] - radius deve ser entre 2 e 20
      1664: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1667: goto          1925
      1670: astore        4
      1672: aload_2
      1673: ldc_w         #340                // String Usage: //geo bug|pos|see|move|fly|grid
      1676: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1679: goto          1925
      1682: aload_1
      1683: ldc_w         #342                // String admin_path
      1686: invokevirtual #38                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1689: ifeq          1925
      1692: aload_3
      1693: invokevirtual #32                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1696: astore        4
      1698: iconst_m1
      1699: istore        5
      1701: aload         4
      1703: invokevirtual #44                 // Method java/lang/String.hashCode:()I
      1706: lookupswitch  { // 1

                 3143097: 1724
                 default: 1738
            }
      1724: aload         4
      1726: ldc_w         #344                // String find
      1729: invokevirtual #50                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1732: ifeq          1738
      1735: iconst_0
      1736: istore        5
      1738: iload         5
      1740: lookupswitch  { // 1

                       0: 1760
                 default: 1913
            }
      1760: aload_2
      1761: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
      1764: astore        6
      1766: aload         6
      1768: ifnonnull     1779
      1771: aload_2
      1772: getstatic     #15                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      1775: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1778: return
      1779: aload_2
      1780: ldc_w         #346                // String PATH
      1783: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
      1786: astore        7
      1788: aload         7
      1790: invokevirtual #176                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
      1793: invokestatic  #79                 // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
      1796: aload_2
      1797: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
      1800: aload_2
      1801: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getY:()I
      1804: aload_2
      1805: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
      1808: aload         6
      1810: invokevirtual #348                // Method ext/mods/gameserver/model/WorldObject.getX:()I
      1813: aload         6
      1815: invokevirtual #349                // Method ext/mods/gameserver/model/WorldObject.getY:()I
      1818: aload         6
      1820: invokevirtual #350                // Method ext/mods/gameserver/model/WorldObject.getZ:()I
      1823: iconst_1
      1824: aload         7
      1826: invokevirtual #351                // Method ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
      1829: astore        8
      1831: aload         8
      1833: invokeinterface #355,  1          // InterfaceMethod java/util/List.isEmpty:()Z
      1838: ifeq          1849
      1841: aload_2
      1842: ldc_w         #360                // String No route found or pathfinding is disabled.
      1845: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1848: return
      1849: aload         8
      1851: invokeinterface #362,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      1856: astore        9
      1858: aload         9
      1860: invokeinterface #366,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1865: ifeq          1907
      1868: aload         9
      1870: invokeinterface #371,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1875: checkcast     #271                // class ext/mods/gameserver/model/location/Location
      1878: astore        10
      1880: aload_2
      1881: aload         10
      1883: invokevirtual #296                // Method ext/mods/gameserver/model/location/Location.getX:()I
      1886: aload         10
      1888: invokevirtual #297                // Method ext/mods/gameserver/model/location/Location.getY:()I
      1891: aload         10
      1893: invokevirtual #298                // Method ext/mods/gameserver/model/location/Location.getZ:()I
      1896: invokedynamic #375,  0            // InvokeDynamic #5:makeConcatWithConstants:(III)Ljava/lang/String;
      1901: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1904: goto          1858
      1907: aload         7
      1909: aload_2
      1910: invokevirtual #198                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
      1913: goto          1925
      1916: astore        4
      1918: aload_2
      1919: ldc_w         #378                // String Usage: //path find|info
      1922: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1925: return
      Exception table:
         from    to  target type
           259   297   300   Class java/lang/Exception
          1615  1655  1658   Class java/lang/NumberFormatException
            25  1044  1670   Class java/lang/Exception
          1045  1667  1670   Class java/lang/Exception
          1692  1778  1916   Class java/lang/Exception
          1779  1848  1916   Class java/lang/Exception
          1849  1913  1916   Class java/lang/Exception
      LineNumberTable:
        line 65: 0
        line 66: 11
        line 68: 16
        line 72: 25
        line 75: 228
        line 76: 237
        line 78: 246
        line 82: 259
        line 83: 267
        line 84: 291
        line 89: 297
        line 86: 300
        line 88: 302
        line 89: 308
        line 92: 311
        line 93: 317
        line 96: 320
        line 97: 326
        line 98: 332
        line 100: 338
        line 101: 345
        line 103: 352
        line 104: 365
        line 105: 378
        line 107: 390
        line 109: 411
        line 111: 419
        line 112: 435
        line 114: 449
        line 115: 519
        line 116: 558
        line 118: 625
        line 119: 633
        line 121: 638
        line 122: 660
        line 124: 677
        line 125: 683
        line 127: 686
        line 128: 692
        line 131: 695
        line 133: 703
        line 134: 711
        line 136: 716
        line 137: 722
        line 138: 728
        line 140: 734
        line 141: 745
        line 142: 771
        line 144: 782
        line 145: 789
        line 146: 796
        line 148: 803
        line 149: 815
        line 150: 841
        line 152: 852
        line 154: 875
        line 155: 905
        line 157: 938
        line 158: 945
        line 160: 952
        line 161: 986
        line 162: 1017
        line 163: 1023
        line 166: 1026
        line 167: 1032
        line 169: 1037
        line 170: 1044
        line 173: 1045
        line 174: 1051
        line 176: 1058
        line 177: 1066
        line 179: 1071
        line 180: 1111
        line 181: 1127
        line 183: 1137
        line 187: 1147
        line 188: 1159
        line 189: 1175
        line 190: 1189
        line 192: 1196
        line 195: 1199
        line 197: 1207
        line 198: 1216
        line 200: 1221
        line 201: 1227
        line 202: 1233
        line 203: 1239
        line 204: 1250
        line 206: 1282
        line 207: 1289
        line 208: 1296
        line 210: 1303
        line 211: 1328
        line 212: 1335
        line 213: 1342
        line 215: 1349
        line 217: 1377
        line 219: 1407
        line 220: 1412
        line 223: 1422
        line 225: 1429
        line 226: 1455
        line 227: 1485
        line 230: 1518
        line 231: 1559
        line 232: 1606
        line 233: 1612
        line 238: 1615
        line 239: 1635
        line 241: 1648
        line 246: 1655
        line 243: 1658
        line 245: 1660
        line 253: 1667
        line 250: 1670
        line 252: 1672
        line 253: 1679
        line 255: 1682
        line 259: 1692
        line 262: 1760
        line 263: 1766
        line 265: 1771
        line 266: 1778
        line 269: 1779
        line 270: 1788
        line 272: 1793
        line 273: 1831
        line 275: 1841
        line 276: 1848
        line 279: 1849
        line 280: 1880
        line 282: 1907
        line 289: 1913
        line 286: 1916
        line 288: 1918
        line 291: 1925
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          267      30     8 comment   Ljava/lang/String;
          302       6     8     e   Ljava/lang/Exception;
          237      83     6  geoX   I
          246      74     7  geoY   I
          435     248    14  geoZ   I
          449     234    15  nswe   B
          633      50    16 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          345     350     6  geoX   I
          352     343     7  geoY   I
          326     369     8    ox   I
          332     363     9    oy   I
          338     357    10    oz   I
          365     330    11    rx   I
          378     317    12    ry   I
          390     305    13 block   Lext/mods/gameserver/geoengine/geodata/ABlock;
          867       5    22   igo   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
          722     304     8    ox   I
          728     298     9    oy   I
          734     292    10    oz   I
          703     323    14 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          711     315    15 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          745     281    16    oh   I
          789     237    17    tx   I
          796     230    18    ty   I
          803     223    19    tz   I
          815     211    20    th   I
          875     151    21 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
          905     121    22 canSee   Z
         1066     133    15 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         1032     167    23 targetWorldObject   Lext/mods/gameserver/model/WorldObject;
         1051     148    24  aLoc   Lext/mods/gameserver/model/location/SpawnLocation;
         1058     141    25  tLoc   Lext/mods/gameserver/model/location/SpawnLocation;
         1111      88    26   loc   Lext/mods/gameserver/model/location/Location;
         1227     388     8    ox   I
         1233     382     9    oy   I
         1239     376    10    oz   I
         1207     408    14 targetCreature   Lext/mods/gameserver/model/actor/Creature;
         1216     399    15 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         1250     365    16    oh   I
         1289     326    17    tx   I
         1296     319    18    ty   I
         1303     312    19    tz   I
         1328     287    26   loc   Lext/mods/gameserver/model/location/Location;
         1335     280    27     x   I
         1342     273    28     y   I
         1349     266    29     z   I
         1377     238    30 canFly   Z
         1635      20    31 radius   I
         1660       7    31     e   Ljava/lang/NumberFormatException;
         1672       7     4     e   Ljava/lang/Exception;
         1880      24    10   loc   Lext/mods/gameserver/model/location/Location;
         1766     147     6 targetWorldObject   Lext/mods/gameserver/model/WorldObject;
         1788     125     7 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
         1831      82     8  path   Ljava/util/List;
         1918       7     4     e   Ljava/lang/Exception;
            0    1926     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine;
            0    1926     1 command   Ljava/lang/String;
            0    1926     2 player   Lext/mods/gameserver/model/actor/Player;
           11    1915     3    st   Ljava/util/StringTokenizer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
         1831      82     8  path   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 63
        frame_type = 254 /* append */
          offset_delta = 96
          locals = [ class java/util/StringTokenizer, class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 38 /* same */
        frame_type = 253 /* append */
          offset_delta = 68
          locals = [ int, int ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 249 /* chop */
          offset_delta = 8
        frame_type = 255 /* full_frame */
          offset_delta = 149
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String ]
        frame_type = 93 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 249 /* chop */
          offset_delta = 70
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 176
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, top, top, int, int, int, top, top, top, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/geodata/IGeoObject ]
        frame_type = 255 /* full_frame */
          offset_delta = 93
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, top, top, int, int, int, top, top, top, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/IGeoObject, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, top, top, int, int, int, top, top, top, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/IGeoObject, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String, class java/awt/Color ]
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class ext/mods/gameserver/model/WorldObject ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 101
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, top, top, top, top, top, top, top, top, top, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, top, top, top, top, top, top, top, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/location/SpawnLocation, class ext/mods/gameserver/model/location/SpawnLocation, class ext/mods/gameserver/model/location/Location ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 174
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, top, top, int, int, int, top, top, top, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, top, top, top, top, top, top, class ext/mods/gameserver/model/location/Location, int, int, int ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 95
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, top, top, int, int, int, top, top, top, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, top, top, top, top, top, top, class ext/mods/gameserver/model/location/Location, int, int, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, top, top, int, int, int, top, top, top, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, top, top, top, top, top, top, class ext/mods/gameserver/model/location/Location, int, int, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String, class java/awt/Color ]
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, top, top, int, int, int, top, top, top, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, top, top, top, top, top, top, class ext/mods/gameserver/model/location/Location, int, int, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, top, top, int, int, int, top, top, top, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, top, top, top, top, top, top, class ext/mods/gameserver/model/location/Location, int, int, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/lang/String, class java/awt/Color ]
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int ]
          stack = []
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 88 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 249 /* chop */
          offset_delta = 8
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 253 /* append */
          offset_delta = 41
          locals = [ class java/lang/String, int ]
        frame_type = 13 /* same */
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 253 /* append */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/util/List ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 48
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = []
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 8 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #446                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 517: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminGeoEngine;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #39                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #36                 // String admin_geo
         8: aastore
         9: dup
        10: iconst_1
        11: ldc_w         #342                // String admin_path
        14: aastore
        15: putstatic     #446                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        18: return
      LineNumberTable:
        line 44: 0
}
SourceFile: "AdminGeoEngine.java"
BootstrapMethods:
  0: #578 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 \u0001: \u0001
  1: #578 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #556 Region: \u0001_\u0001; Block: \u0001
  2: #578 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #558     \u0001\u0001\u0001         GeoX=\u0001
  3: #578 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #560     \u0001o \u0001         GeoY=\u0001
  4: #578 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #562     \u0001\u0001\u0001         GeoZ=\u0001
  5: #578 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #564 x:\u0001 y:\u0001 z:\u0001
  6: #578 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #566 Células analisadas: \u0001
  7: #578 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #568 Células bloqueadas: \u0001 (\u0001%)
  8: #578 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #570 Altura mínima: \u0001
  9: #578 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #572 Altura máxima: \u0001
  10: #578 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #574 Variação de altura: \u0001
  11: #578 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #576 Posição GeoData: [\u0001, \u0001]
InnerClasses:
  public static final #589= #585 of #587; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
