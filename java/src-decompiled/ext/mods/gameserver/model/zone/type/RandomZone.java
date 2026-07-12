// Bytecode for: ext.mods.gameserver.model.zone.type.RandomZone
// File: ext\mods\gameserver\model\zone\type\RandomZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/RandomZone.class
  Last modified 9 de jul de 2026; size 8106 bytes
  MD5 checksum ab893cce6c50ea6eec378a9f714f5684
  Compiled from "RandomZone.java"
public class ext.mods.gameserver.model.zone.type.RandomZone extends ext.mods.gameserver.model.zone.type.subtype.SpawnZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/zone/type/RandomZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
  interfaces: 0, fields: 7, methods: 16, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/zone/type/RandomZone._active:Z
    #8 = Class              #10           // ext/mods/gameserver/model/zone/type/RandomZone
    #9 = NameAndType        #11:#12       // _active:Z
   #10 = Utf8               ext/mods/gameserver/model/zone/type/RandomZone
   #11 = Utf8               _active
   #12 = Utf8               Z
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/zone/type/RandomZone._flagzone:Z
   #14 = NameAndType        #15:#12       // _flagzone:Z
   #15 = Utf8               _flagzone
   #16 = Class              #17           // java/util/HashSet
   #17 = Utf8               java/util/HashSet
   #18 = Methodref          #16.#19       // java/util/HashSet."<init>":()V
   #19 = NameAndType        #5:#20        // "<init>":()V
   #20 = Utf8               ()V
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/model/zone/type/RandomZone._restrictedClasses:Ljava/util/Set;
   #22 = NameAndType        #23:#24       // _restrictedClasses:Ljava/util/Set;
   #23 = Utf8               _restrictedClasses
   #24 = Utf8               Ljava/util/Set;
   #25 = Fieldref           #8.#26        // ext/mods/gameserver/model/zone/type/RandomZone._restrictedItems:Ljava/util/Set;
   #26 = NameAndType        #27:#24       // _restrictedItems:Ljava/util/Set;
   #27 = Utf8               _restrictedItems
   #28 = Class              #29           // ext/mods/gameserver/model/location/Location
   #29 = Utf8               ext/mods/gameserver/model/location/Location
   #30 = Methodref          #28.#31       // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #31 = NameAndType        #5:#32        // "<init>":(III)V
   #32 = Utf8               (III)V
   #33 = Fieldref           #8.#34        // ext/mods/gameserver/model/zone/type/RandomZone._returnLocation:Lext/mods/gameserver/model/location/Location;
   #34 = NameAndType        #35:#36       // _returnLocation:Lext/mods/gameserver/model/location/Location;
   #35 = Utf8               _returnLocation
   #36 = Utf8               Lext/mods/gameserver/model/location/Location;
   #37 = String             #38           // id
   #38 = Utf8               id
   #39 = Methodref          #40.#41       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #40 = Class              #42           // java/lang/String
   #41 = NameAndType        #43:#44       // equals:(Ljava/lang/Object;)Z
   #42 = Utf8               java/lang/String
   #43 = Utf8               equals
   #44 = Utf8               (Ljava/lang/Object;)Z
   #45 = Methodref          #46.#47       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #46 = Class              #48           // java/lang/Integer
   #47 = NameAndType        #49:#50       // parseInt:(Ljava/lang/String;)I
   #48 = Utf8               java/lang/Integer
   #49 = Utf8               parseInt
   #50 = Utf8               (Ljava/lang/String;)I
   #51 = Fieldref           #8.#52        // ext/mods/gameserver/model/zone/type/RandomZone._id:I
   #52 = NameAndType        #53:#54       // _id:I
   #53 = Utf8               _id
   #54 = Utf8               I
   #55 = String             #56           // name
   #56 = Utf8               name
   #57 = Fieldref           #8.#58        // ext/mods/gameserver/model/zone/type/RandomZone._name:Ljava/lang/String;
   #58 = NameAndType        #59:#60       // _name:Ljava/lang/String;
   #59 = Utf8               _name
   #60 = Utf8               Ljava/lang/String;
   #61 = String             #62           // flagzone
   #62 = Utf8               flagzone
   #63 = Methodref          #64.#65       // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
   #64 = Class              #66           // java/lang/Boolean
   #65 = NameAndType        #67:#68       // parseBoolean:(Ljava/lang/String;)Z
   #66 = Utf8               java/lang/Boolean
   #67 = Utf8               parseBoolean
   #68 = Utf8               (Ljava/lang/String;)Z
   #69 = String             #70           // restrictedClasses
   #70 = Utf8               restrictedClasses
   #71 = String             #72           // ,
   #72 = Utf8               ,
   #73 = Methodref          #40.#74       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #74 = NameAndType        #75:#76       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #75 = Utf8               split
   #76 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #77 = Methodref          #40.#78       // java/lang/String.trim:()Ljava/lang/String;
   #78 = NameAndType        #79:#80       // trim:()Ljava/lang/String;
   #79 = Utf8               trim
   #80 = Utf8               ()Ljava/lang/String;
   #81 = Methodref          #8.#82        // ext/mods/gameserver/model/zone/type/RandomZone.getClassIdFromName:(Ljava/lang/String;)I
   #82 = NameAndType        #83:#50       // getClassIdFromName:(Ljava/lang/String;)I
   #83 = Utf8               getClassIdFromName
   #84 = Methodref          #46.#85       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #85 = NameAndType        #86:#87       // valueOf:(I)Ljava/lang/Integer;
   #86 = Utf8               valueOf
   #87 = Utf8               (I)Ljava/lang/Integer;
   #88 = InterfaceMethodref #89.#90       // java/util/Set.add:(Ljava/lang/Object;)Z
   #89 = Class              #91           // java/util/Set
   #90 = NameAndType        #92:#44       // add:(Ljava/lang/Object;)Z
   #91 = Utf8               java/util/Set
   #92 = Utf8               add
   #93 = String             #94           // restrictedItems
   #94 = Utf8               restrictedItems
   #95 = String             #96           // returnLocation
   #96 = Utf8               returnLocation
   #97 = Methodref          #2.#98        // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #98 = NameAndType        #99:#100      // setParameter:(Ljava/lang/String;Ljava/lang/String;)V
   #99 = Utf8               setParameter
  #100 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #101 = Fieldref           #102.#103     // ext/mods/gameserver/enums/ZoneId.RANDOM:Lext/mods/gameserver/enums/ZoneId;
  #102 = Class              #104          // ext/mods/gameserver/enums/ZoneId
  #103 = NameAndType        #105:#106     // RANDOM:Lext/mods/gameserver/enums/ZoneId;
  #104 = Utf8               ext/mods/gameserver/enums/ZoneId
  #105 = Utf8               RANDOM
  #106 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #107 = Methodref          #108.#109     // ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #108 = Class              #110          // ext/mods/gameserver/model/actor/Creature
  #109 = NameAndType        #111:#112     // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #110 = Utf8               ext/mods/gameserver/model/actor/Creature
  #111 = Utf8               setInsideZone
  #112 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #113 = Class              #114          // ext/mods/gameserver/model/actor/Player
  #114 = Utf8               ext/mods/gameserver/model/actor/Player
  #115 = Methodref          #116.#117     // ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
  #116 = Class              #118          // ext/mods/Crypta/RandomManager
  #117 = NameAndType        #119:#120     // getInstance:()Lext/mods/Crypta/RandomManager;
  #118 = Utf8               ext/mods/Crypta/RandomManager
  #119 = Utf8               getInstance
  #120 = Utf8               ()Lext/mods/Crypta/RandomManager;
  #121 = Methodref          #116.#122     // ext/mods/Crypta/RandomManager.getZoneDataForZone:(Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #122 = NameAndType        #123:#124     // getZoneDataForZone:(Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #123 = Utf8               getZoneDataForZone
  #124 = Utf8               (Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #125 = Methodref          #126.#127     // ext/mods/FarmEventRandom/holder/RandomZoneData.isDwarvenOnly:()Z
  #126 = Class              #128          // ext/mods/FarmEventRandom/holder/RandomZoneData
  #127 = NameAndType        #129:#130     // isDwarvenOnly:()Z
  #128 = Utf8               ext/mods/FarmEventRandom/holder/RandomZoneData
  #129 = Utf8               isDwarvenOnly
  #130 = Utf8               ()Z
  #131 = Methodref          #113.#132     // ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #132 = NameAndType        #133:#134     // getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #133 = Utf8               getRace
  #134 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassRace;
  #135 = Fieldref           #136.#137     // ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
  #136 = Class              #138          // ext/mods/gameserver/enums/actors/ClassRace
  #137 = NameAndType        #139:#140     // DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
  #138 = Utf8               ext/mods/gameserver/enums/actors/ClassRace
  #139 = Utf8               DWARF
  #140 = Utf8               Lext/mods/gameserver/enums/actors/ClassRace;
  #141 = String             #142          // Esta zona é exclusiva para classes DWARVEN.
  #142 = Utf8               Esta zona é exclusiva para classes DWARVEN.
  #143 = Methodref          #113.#144     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #144 = NameAndType        #145:#146     // sendMessage:(Ljava/lang/String;)V
  #145 = Utf8               sendMessage
  #146 = Utf8               (Ljava/lang/String;)V
  #147 = Integer            83417
  #148 = Integer            147991
  #149 = Methodref          #113.#150     // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #150 = NameAndType        #151:#152     // teleportTo:(IIII)Z
  #151 = Utf8               teleportTo
  #152 = Utf8               (IIII)Z
  #153 = Methodref          #126.#154     // ext/mods/FarmEventRandom/holder/RandomZoneData.isEnchanterZone:()Z
  #154 = NameAndType        #155:#130     // isEnchanterZone:()Z
  #155 = Utf8               isEnchanterZone
  #156 = Methodref          #113.#157     // ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
  #157 = NameAndType        #158:#159     // getPvpFlag:()B
  #158 = Utf8               getPvpFlag
  #159 = Utf8               ()B
  #160 = Methodref          #113.#161     // ext/mods/gameserver/model/actor/Player.updatePvPFlag:(I)V
  #161 = NameAndType        #162:#6       // updatePvPFlag:(I)V
  #162 = Utf8               updatePvPFlag
  #163 = Methodref          #164.#165     // ext/mods/gameserver/taskmanager/PvpFlagTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
  #164 = Class              #166          // ext/mods/gameserver/taskmanager/PvpFlagTaskManager
  #165 = NameAndType        #119:#167     // getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
  #166 = Utf8               ext/mods/gameserver/taskmanager/PvpFlagTaskManager
  #167 = Utf8               ()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
  #168 = Fieldref           #169.#170     // ext/mods/Config.PVP_NORMAL_TIME:I
  #169 = Class              #171          // ext/mods/Config
  #170 = NameAndType        #172:#54      // PVP_NORMAL_TIME:I
  #171 = Utf8               ext/mods/Config
  #172 = Utf8               PVP_NORMAL_TIME
  #173 = Methodref          #164.#174     // ext/mods/gameserver/taskmanager/PvpFlagTaskManager.add:(Lext/mods/gameserver/model/actor/Player;J)V
  #174 = NameAndType        #92:#175      // add:(Lext/mods/gameserver/model/actor/Player;J)V
  #175 = Utf8               (Lext/mods/gameserver/model/actor/Player;J)V
  #176 = Methodref          #113.#177     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #177 = NameAndType        #178:#179     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #178 = Utf8               getClassId
  #179 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #180 = Methodref          #181.#182     // ext/mods/gameserver/enums/actors/ClassId.getId:()I
  #181 = Class              #183          // ext/mods/gameserver/enums/actors/ClassId
  #182 = NameAndType        #184:#185     // getId:()I
  #183 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #184 = Utf8               getId
  #185 = Utf8               ()I
  #186 = InterfaceMethodref #89.#187      // java/util/Set.contains:(Ljava/lang/Object;)Z
  #187 = NameAndType        #188:#44      // contains:(Ljava/lang/Object;)Z
  #188 = Utf8               contains
  #189 = String             #190          // Your class is restricted in this event zone.
  #190 = Utf8               Your class is restricted in this event zone.
  #191 = Methodref          #113.#192     // ext/mods/gameserver/model/actor/Player.teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #192 = NameAndType        #193:#194     // teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #193 = Utf8               teleToLocation
  #194 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #195 = InterfaceMethodref #89.#196      // java/util/Set.iterator:()Ljava/util/Iterator;
  #196 = NameAndType        #197:#198     // iterator:()Ljava/util/Iterator;
  #197 = Utf8               iterator
  #198 = Utf8               ()Ljava/util/Iterator;
  #199 = InterfaceMethodref #200.#201     // java/util/Iterator.hasNext:()Z
  #200 = Class              #202          // java/util/Iterator
  #201 = NameAndType        #203:#130     // hasNext:()Z
  #202 = Utf8               java/util/Iterator
  #203 = Utf8               hasNext
  #204 = InterfaceMethodref #200.#205     // java/util/Iterator.next:()Ljava/lang/Object;
  #205 = NameAndType        #206:#207     // next:()Ljava/lang/Object;
  #206 = Utf8               next
  #207 = Utf8               ()Ljava/lang/Object;
  #208 = Methodref          #46.#209      // java/lang/Integer.intValue:()I
  #209 = NameAndType        #210:#185     // intValue:()I
  #210 = Utf8               intValue
  #211 = Methodref          #113.#212     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #212 = NameAndType        #213:#214     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #213 = Utf8               getInventory
  #214 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #215 = Methodref          #216.#217     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #216 = Class              #218          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #217 = NameAndType        #219:#220     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #218 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #219 = Utf8               getItemByItemId
  #220 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #221 = Methodref          #216.#222     // ext/mods/gameserver/model/itemcontainer/PcInventory.getSlotFromItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)I
  #222 = NameAndType        #223:#224     // getSlotFromItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)I
  #223 = Utf8               getSlotFromItem
  #224 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)I
  #225 = Methodref          #216.#226     // ext/mods/gameserver/model/itemcontainer/PcInventory.unequipItemInSlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #226 = NameAndType        #227:#220     // unequipItemInSlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #227 = Utf8               unequipItemInSlot
  #228 = String             #229          // Some restricted items have been unequipped.
  #229 = Utf8               Some restricted items have been unequipped.
  #230 = InvokeDynamic      #0:#231       // #0:accept:()Ljava/util/function/Consumer;
  #231 = NameAndType        #232:#233     // accept:()Ljava/util/function/Consumer;
  #232 = Utf8               accept
  #233 = Utf8               ()Ljava/util/function/Consumer;
  #234 = Methodref          #8.#235       // ext/mods/gameserver/model/zone/type/RandomZone.forEachCreatureInside:(Ljava/util/function/Consumer;)V
  #235 = NameAndType        #236:#237     // forEachCreatureInside:(Ljava/util/function/Consumer;)V
  #236 = Utf8               forEachCreatureInside
  #237 = Utf8               (Ljava/util/function/Consumer;)V
  #238 = Fieldref           #8.#239       // ext/mods/gameserver/model/zone/type/RandomZone._creatures:Ljava/util/Set;
  #239 = NameAndType        #240:#24      // _creatures:Ljava/util/Set;
  #240 = Utf8               _creatures
  #241 = InterfaceMethodref #89.#242      // java/util/Set.isEmpty:()Z
  #242 = NameAndType        #243:#130     // isEmpty:()Z
  #243 = Utf8               isEmpty
  #244 = InterfaceMethodref #89.#245      // java/util/Set.stream:()Ljava/util/stream/Stream;
  #245 = NameAndType        #246:#247     // stream:()Ljava/util/stream/Stream;
  #246 = Utf8               stream
  #247 = Utf8               ()Ljava/util/stream/Stream;
  #248 = InvokeDynamic      #1:#249       // #1:test:()Ljava/util/function/Predicate;
  #249 = NameAndType        #250:#251     // test:()Ljava/util/function/Predicate;
  #250 = Utf8               test
  #251 = Utf8               ()Ljava/util/function/Predicate;
  #252 = InterfaceMethodref #253.#254     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #253 = Class              #255          // java/util/stream/Stream
  #254 = NameAndType        #256:#257     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #255 = Utf8               java/util/stream/Stream
  #256 = Utf8               filter
  #257 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #258 = InterfaceMethodref #253.#259     // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
  #259 = NameAndType        #260:#237     // forEach:(Ljava/util/function/Consumer;)V
  #260 = Utf8               forEach
  #261 = Methodref          #262.#263     // java/util/Collections.unmodifiableSet:(Ljava/util/Set;)Ljava/util/Set;
  #262 = Class              #264          // java/util/Collections
  #263 = NameAndType        #265:#266     // unmodifiableSet:(Ljava/util/Set;)Ljava/util/Set;
  #264 = Utf8               java/util/Collections
  #265 = Utf8               unmodifiableSet
  #266 = Utf8               (Ljava/util/Set;)Ljava/util/Set;
  #267 = Fieldref           #181.#268     // ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #268 = NameAndType        #269:#270     // VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #269 = Utf8               VALUES
  #270 = Utf8               [Lext/mods/gameserver/enums/actors/ClassId;
  #271 = Methodref          #181.#272     // ext/mods/gameserver/enums/actors/ClassId.name:()Ljava/lang/String;
  #272 = NameAndType        #56:#80       // name:()Ljava/lang/String;
  #273 = Methodref          #40.#274      // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #274 = NameAndType        #275:#68      // equalsIgnoreCase:(Ljava/lang/String;)Z
  #275 = Utf8               equalsIgnoreCase
  #276 = Methodref          #108.#277     // ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #277 = NameAndType        #278:#279     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #278 = Utf8               isInsideZone
  #279 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #280 = Utf8               Signature
  #281 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #282 = Utf8               Code
  #283 = Utf8               LineNumberTable
  #284 = Utf8               LocalVariableTable
  #285 = Utf8               this
  #286 = Utf8               Lext/mods/gameserver/model/zone/type/RandomZone;
  #287 = Utf8               classId
  #288 = Utf8               className
  #289 = Utf8               itemIdStr
  #290 = Utf8               coords
  #291 = Utf8               [Ljava/lang/String;
  #292 = Utf8               value
  #293 = Utf8               StackMapTable
  #294 = Class              #291          // "[Ljava/lang/String;"
  #295 = Utf8               onEnter
  #296 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #297 = Utf8               zoneData
  #298 = Utf8               Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #299 = Utf8               item
  #300 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #301 = Utf8               itemId
  #302 = Utf8               player
  #303 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #304 = Utf8               randomManager
  #305 = Utf8               Ljava/lang/Object;
  #306 = Utf8               character
  #307 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #308 = Class              #309          // java/lang/Object
  #309 = Utf8               java/lang/Object
  #310 = Utf8               onExit
  #311 = Utf8               setActive
  #312 = Utf8               (Z)V
  #313 = Utf8               val
  #314 = Utf8               action
  #315 = Utf8               Ljava/util/function/Consumer;
  #316 = Utf8               LocalVariableTypeTable
  #317 = Utf8               Ljava/util/function/Consumer<Lext/mods/gameserver/model/actor/Creature;>;
  #318 = Utf8               (Ljava/util/function/Consumer<Lext/mods/gameserver/model/actor/Creature;>;)V
  #319 = Utf8               isActive
  #320 = Utf8               isFlegZone
  #321 = Utf8               getRestrictedClasses
  #322 = Utf8               ()Ljava/util/Set;
  #323 = Utf8               ()Ljava/util/Set<Ljava/lang/Integer;>;
  #324 = Utf8               getRestrictedItems
  #325 = Utf8               getReturnLocation
  #326 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #327 = Utf8               cid
  #328 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #329 = Class              #270          // "[Lext/mods/gameserver/enums/actors/ClassId;"
  #330 = Utf8               getName
  #331 = Utf8               lambda$forEachCreatureInside$0
  #332 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #333 = Utf8               c
  #334 = Utf8               lambda$setActive$0
  #335 = Utf8               SourceFile
  #336 = Utf8               RandomZone.java
  #337 = Utf8               BootstrapMethods
  #338 = MethodType         #339          //  (Ljava/lang/Object;)V
  #339 = Utf8               (Ljava/lang/Object;)V
  #340 = MethodHandle       6:#341        // REF_invokeStatic ext/mods/gameserver/model/zone/type/RandomZone.lambda$setActive$0:(Lext/mods/gameserver/model/actor/Creature;)V
  #341 = Methodref          #8.#342       // ext/mods/gameserver/model/zone/type/RandomZone.lambda$setActive$0:(Lext/mods/gameserver/model/actor/Creature;)V
  #342 = NameAndType        #334:#296     // lambda$setActive$0:(Lext/mods/gameserver/model/actor/Creature;)V
  #343 = MethodType         #296          //  (Lext/mods/gameserver/model/actor/Creature;)V
  #344 = MethodType         #44           //  (Ljava/lang/Object;)Z
  #345 = MethodHandle       6:#346        // REF_invokeStatic ext/mods/gameserver/model/zone/type/RandomZone.lambda$forEachCreatureInside$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #346 = Methodref          #8.#347       // ext/mods/gameserver/model/zone/type/RandomZone.lambda$forEachCreatureInside$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #347 = NameAndType        #331:#332     // lambda$forEachCreatureInside$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #348 = MethodType         #332          //  (Lext/mods/gameserver/model/actor/Creature;)Z
  #349 = MethodHandle       6:#350        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #350 = Methodref          #351.#352     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #351 = Class              #353          // java/lang/invoke/LambdaMetafactory
  #352 = NameAndType        #354:#355     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #353 = Utf8               java/lang/invoke/LambdaMetafactory
  #354 = Utf8               metafactory
  #355 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #356 = Utf8               InnerClasses
  #357 = Class              #358          // java/lang/invoke/MethodHandles$Lookup
  #358 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #359 = Class              #360          // java/lang/invoke/MethodHandles
  #360 = Utf8               java/lang/invoke/MethodHandles
  #361 = Utf8               Lookup
{
  public ext.mods.gameserver.model.zone.type.RandomZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType."<init>":(I)V
         5: aload_0
         6: iconst_0
         7: putfield      #7                  // Field _active:Z
        10: aload_0
        11: iconst_0
        12: putfield      #13                 // Field _flagzone:Z
        15: aload_0
        16: new           #16                 // class java/util/HashSet
        19: dup
        20: invokespecial #18                 // Method java/util/HashSet."<init>":()V
        23: putfield      #21                 // Field _restrictedClasses:Ljava/util/Set;
        26: aload_0
        27: new           #16                 // class java/util/HashSet
        30: dup
        31: invokespecial #18                 // Method java/util/HashSet."<init>":()V
        34: putfield      #25                 // Field _restrictedItems:Ljava/util/Set;
        37: aload_0
        38: new           #28                 // class ext/mods/gameserver/model/location/Location
        41: dup
        42: iconst_0
        43: iconst_0
        44: iconst_0
        45: invokespecial #30                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        48: putfield      #33                 // Field _returnLocation:Lext/mods/gameserver/model/location/Location;
        51: return
      LineNumberTable:
        line 51: 0
        line 42: 5
        line 43: 10
        line 44: 15
        line 45: 26
        line 47: 37
        line 52: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/zone/type/RandomZone;
            0      52     1    id   I

  public void setParameter(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=8, args_size=3
         0: aload_1
         1: ldc           #37                 // String id
         3: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          20
         9: aload_0
        10: aload_2
        11: invokestatic  #45                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        14: putfield      #51                 // Field _id:I
        17: goto          259
        20: aload_1
        21: ldc           #55                 // String name
        23: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        26: ifeq          37
        29: aload_0
        30: aload_2
        31: putfield      #57                 // Field _name:Ljava/lang/String;
        34: goto          259
        37: aload_1
        38: ldc           #61                 // String flagzone
        40: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        43: ifeq          57
        46: aload_0
        47: aload_2
        48: invokestatic  #63                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        51: putfield      #13                 // Field _flagzone:Z
        54: goto          259
        57: aload_1
        58: ldc           #69                 // String restrictedClasses
        60: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        63: ifeq          133
        66: aload_2
        67: ldc           #71                 // String ,
        69: invokevirtual #73                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        72: astore_3
        73: aload_3
        74: arraylength
        75: istore        4
        77: iconst_0
        78: istore        5
        80: iload         5
        82: iload         4
        84: if_icmpge     130
        87: aload_3
        88: iload         5
        90: aaload
        91: astore        6
        93: aload_0
        94: aload         6
        96: invokevirtual #77                 // Method java/lang/String.trim:()Ljava/lang/String;
        99: invokevirtual #81                 // Method getClassIdFromName:(Ljava/lang/String;)I
       102: istore        7
       104: iload         7
       106: ifle          124
       109: aload_0
       110: getfield      #21                 // Field _restrictedClasses:Ljava/util/Set;
       113: iload         7
       115: invokestatic  #84                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       118: invokeinterface #88,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
       123: pop
       124: iinc          5, 1
       127: goto          80
       130: goto          259
       133: aload_1
       134: ldc           #93                 // String restrictedItems
       136: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       139: ifeq          199
       142: aload_2
       143: ldc           #71                 // String ,
       145: invokevirtual #73                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       148: astore_3
       149: aload_3
       150: arraylength
       151: istore        4
       153: iconst_0
       154: istore        5
       156: iload         5
       158: iload         4
       160: if_icmpge     196
       163: aload_3
       164: iload         5
       166: aaload
       167: astore        6
       169: aload_0
       170: getfield      #25                 // Field _restrictedItems:Ljava/util/Set;
       173: aload         6
       175: invokevirtual #77                 // Method java/lang/String.trim:()Ljava/lang/String;
       178: invokestatic  #45                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       181: invokestatic  #84                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       184: invokeinterface #88,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
       189: pop
       190: iinc          5, 1
       193: goto          156
       196: goto          259
       199: aload_1
       200: ldc           #95                 // String returnLocation
       202: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       205: ifeq          253
       208: aload_2
       209: ldc           #71                 // String ,
       211: invokevirtual #73                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       214: astore_3
       215: aload_3
       216: arraylength
       217: iconst_3
       218: if_icmpne     250
       221: aload_0
       222: new           #28                 // class ext/mods/gameserver/model/location/Location
       225: dup
       226: aload_3
       227: iconst_0
       228: aaload
       229: invokestatic  #45                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       232: aload_3
       233: iconst_1
       234: aaload
       235: invokestatic  #45                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       238: aload_3
       239: iconst_2
       240: aaload
       241: invokestatic  #45                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       244: invokespecial #30                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       247: putfield      #33                 // Field _returnLocation:Lext/mods/gameserver/model/location/Location;
       250: goto          259
       253: aload_0
       254: aload_1
       255: aload_2
       256: invokespecial #97                 // Method ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
       259: return
      LineNumberTable:
        line 57: 0
        line 58: 9
        line 59: 20
        line 60: 29
        line 61: 37
        line 62: 46
        line 63: 57
        line 65: 66
        line 67: 93
        line 68: 104
        line 69: 109
        line 65: 124
        line 72: 133
        line 74: 142
        line 75: 169
        line 74: 190
        line 78: 199
        line 80: 208
        line 81: 215
        line 82: 221
        line 83: 250
        line 86: 253
        line 87: 259
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          104      20     7 classId   I
           93      31     6 className   Ljava/lang/String;
          169      21     6 itemIdStr   Ljava/lang/String;
          215      35     3 coords   [Ljava/lang/String;
            0     260     0  this   Lext/mods/gameserver/model/zone/type/RandomZone;
            0     260     1  name   Ljava/lang/String;
            0     260     2 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 13
        frame_type = 20 /* same */
        frame_type = 16 /* same */
        frame_type = 19 /* same */
        frame_type = 254 /* append */
          offset_delta = 22
          locals = [ class "[Ljava/lang/String;", int, int ]
        frame_type = 43 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 254 /* append */
          offset_delta = 22
          locals = [ class "[Ljava/lang/String;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 39
        frame_type = 2 /* same */
        frame_type = 50 /* same */
        frame_type = 2 /* same */
        frame_type = 5 /* same */

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=7, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _active:Z
         4: ifeq          15
         7: aload_1
         8: getstatic     #101                // Field ext/mods/gameserver/enums/ZoneId.RANDOM:Lext/mods/gameserver/enums/ZoneId;
        11: iconst_1
        12: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        15: aload_1
        16: instanceof    #113                // class ext/mods/gameserver/model/actor/Player
        19: ifeq          264
        22: aload_1
        23: checkcast     #113                // class ext/mods/gameserver/model/actor/Player
        26: astore_2
        27: invokestatic  #115                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
        30: astore_3
        31: aload_3
        32: ifnull        112
        35: invokestatic  #115                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
        38: aload_0
        39: invokevirtual #121                // Method ext/mods/Crypta/RandomManager.getZoneDataForZone:(Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
        42: astore        4
        44: aload         4
        46: ifnull        87
        49: aload         4
        51: invokevirtual #125                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.isDwarvenOnly:()Z
        54: ifeq          87
        57: aload_2
        58: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        61: getstatic     #135                // Field ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
        64: if_acmpeq     87
        67: aload_2
        68: ldc           #141                // String Esta zona é exclusiva para classes DWARVEN.
        70: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        73: aload_2
        74: ldc           #147                // int 83417
        76: ldc           #148                // int 147991
        78: sipush        -3400
        81: iconst_0
        82: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
        85: pop
        86: return
        87: aload         4
        89: ifnull        112
        92: aload         4
        94: invokevirtual #153                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.isEnchanterZone:()Z
        97: ifeq          112
       100: aload_2
       101: invokevirtual #156                // Method ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
       104: ifne          112
       107: aload_2
       108: iconst_1
       109: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.updatePvPFlag:(I)V
       112: aload_0
       113: getfield      #13                 // Field _flagzone:Z
       116: ifeq          142
       119: aload_2
       120: invokevirtual #156                // Method ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
       123: ifne          131
       126: aload_2
       127: iconst_1
       128: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.updatePvPFlag:(I)V
       131: invokestatic  #163                // Method ext/mods/gameserver/taskmanager/PvpFlagTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
       134: aload_2
       135: getstatic     #168                // Field ext/mods/Config.PVP_NORMAL_TIME:I
       138: i2l
       139: invokevirtual #173                // Method ext/mods/gameserver/taskmanager/PvpFlagTaskManager.add:(Lext/mods/gameserver/model/actor/Player;J)V
       142: aload_0
       143: getfield      #21                 // Field _restrictedClasses:Ljava/util/Set;
       146: aload_2
       147: invokevirtual #176                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       150: invokevirtual #180                // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
       153: invokestatic  #84                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       156: invokeinterface #186,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
       161: ifeq          179
       164: aload_2
       165: ldc           #189                // String Your class is restricted in this event zone.
       167: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       170: aload_2
       171: aload_0
       172: getfield      #33                 // Field _returnLocation:Lext/mods/gameserver/model/location/Location;
       175: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Player.teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
       178: return
       179: aload_0
       180: getfield      #25                 // Field _restrictedItems:Ljava/util/Set;
       183: invokeinterface #195,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       188: astore        4
       190: aload         4
       192: invokeinterface #199,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       197: ifeq          264
       200: aload         4
       202: invokeinterface #204,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       207: checkcast     #46                 // class java/lang/Integer
       210: invokevirtual #208                // Method java/lang/Integer.intValue:()I
       213: istore        5
       215: aload_2
       216: invokevirtual #211                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       219: iload         5
       221: invokevirtual #215                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       224: ifnull        261
       227: aload_2
       228: invokevirtual #211                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       231: iload         5
       233: invokevirtual #215                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       236: astore        6
       238: aload_2
       239: invokevirtual #211                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       242: aload_2
       243: invokevirtual #211                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       246: aload         6
       248: invokevirtual #221                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getSlotFromItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)I
       251: invokevirtual #225                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.unequipItemInSlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       254: pop
       255: aload_2
       256: ldc           #228                // String Some restricted items have been unequipped.
       258: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       261: goto          190
       264: return
      LineNumberTable:
        line 92: 0
        line 93: 7
        line 95: 15
        line 97: 22
        line 99: 27
        line 100: 31
        line 102: 35
        line 103: 44
        line 105: 57
        line 107: 67
        line 109: 73
        line 110: 86
        line 114: 87
        line 116: 100
        line 118: 107
        line 123: 112
        line 125: 119
        line 127: 126
        line 129: 131
        line 132: 142
        line 134: 164
        line 135: 170
        line 136: 178
        line 140: 179
        line 142: 215
        line 144: 227
        line 146: 238
        line 147: 255
        line 149: 261
        line 152: 264
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44      68     4 zoneData   Lext/mods/FarmEventRandom/holder/RandomZoneData;
          238      23     6  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          215      46     5 itemId   I
           27     237     2 player   Lext/mods/gameserver/model/actor/Player;
           31     233     3 randomManager   Ljava/lang/Object;
            0     265     0  this   Lext/mods/gameserver/model/zone/type/RandomZone;
            0     265     1 character   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 9
        frame_type = 15 /* same */
        frame_type = 254 /* append */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/Object, class ext/mods/FarmEventRandom/holder/RandomZoneData ]
        frame_type = 250 /* chop */
          offset_delta = 24
        frame_type = 18 /* same */
        frame_type = 10 /* same */
        frame_type = 36 /* same */
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 70
        frame_type = 248 /* chop */
          offset_delta = 2

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=5, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _active:Z
         4: ifeq          15
         7: aload_1
         8: getstatic     #101                // Field ext/mods/gameserver/enums/ZoneId.RANDOM:Lext/mods/gameserver/enums/ZoneId;
        11: iconst_0
        12: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        15: aload_1
        16: instanceof    #113                // class ext/mods/gameserver/model/actor/Player
        19: ifeq          86
        22: aload_1
        23: checkcast     #113                // class ext/mods/gameserver/model/actor/Player
        26: astore_2
        27: invokestatic  #115                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
        30: astore_3
        31: aload_3
        32: ifnull        68
        35: invokestatic  #115                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
        38: aload_0
        39: invokevirtual #121                // Method ext/mods/Crypta/RandomManager.getZoneDataForZone:(Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
        42: astore        4
        44: aload         4
        46: ifnull        68
        49: aload         4
        51: invokevirtual #153                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.isEnchanterZone:()Z
        54: ifeq          68
        57: invokestatic  #163                // Method ext/mods/gameserver/taskmanager/PvpFlagTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
        60: aload_2
        61: getstatic     #168                // Field ext/mods/Config.PVP_NORMAL_TIME:I
        64: i2l
        65: invokevirtual #173                // Method ext/mods/gameserver/taskmanager/PvpFlagTaskManager.add:(Lext/mods/gameserver/model/actor/Player;J)V
        68: aload_0
        69: getfield      #13                 // Field _flagzone:Z
        72: ifeq          86
        75: invokestatic  #163                // Method ext/mods/gameserver/taskmanager/PvpFlagTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
        78: aload_2
        79: getstatic     #168                // Field ext/mods/Config.PVP_NORMAL_TIME:I
        82: i2l
        83: invokevirtual #173                // Method ext/mods/gameserver/taskmanager/PvpFlagTaskManager.add:(Lext/mods/gameserver/model/actor/Player;J)V
        86: return
      LineNumberTable:
        line 157: 0
        line 158: 7
        line 160: 15
        line 162: 22
        line 164: 27
        line 165: 31
        line 167: 35
        line 168: 44
        line 170: 57
        line 174: 68
        line 176: 75
        line 179: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44      24     4 zoneData   Lext/mods/FarmEventRandom/holder/RandomZoneData;
           27      59     2 player   Lext/mods/gameserver/model/actor/Player;
           31      55     3 randomManager   Ljava/lang/Object;
            0      87     0  this   Lext/mods/gameserver/model/zone/type/RandomZone;
            0      87     1 character   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 15 /* same */
        frame_type = 253 /* append */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/Object ]
        frame_type = 249 /* chop */
          offset_delta = 17

  public void setActive(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field _active:Z
         5: iload_1
         6: ifne          18
         9: aload_0
        10: invokedynamic #230,  0            // InvokeDynamic #0:accept:()Ljava/util/function/Consumer;
        15: invokevirtual #234                // Method forEachCreatureInside:(Ljava/util/function/Consumer;)V
        18: return
      LineNumberTable:
        line 183: 0
        line 185: 5
        line 187: 9
        line 190: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/zone/type/RandomZone;
            0      19     1   val   Z
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */

  public void forEachCreatureInside(java.util.function.Consumer<ext.mods.gameserver.model.actor.Creature>);
    descriptor: (Ljava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #238                // Field _creatures:Ljava/util/Set;
         4: ifnull        19
         7: aload_0
         8: getfield      #238                // Field _creatures:Ljava/util/Set;
        11: invokeinterface #241,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
        16: ifeq          20
        19: return
        20: aload_0
        21: getfield      #238                // Field _creatures:Ljava/util/Set;
        24: invokeinterface #244,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        29: invokedynamic #248,  0            // InvokeDynamic #1:test:()Ljava/util/function/Predicate;
        34: invokeinterface #252,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        39: aload_1
        40: invokeinterface #258,  2          // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        45: return
      LineNumberTable:
        line 194: 0
        line 195: 19
        line 197: 20
        line 198: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/zone/type/RandomZone;
            0      46     1 action   Ljava/util/function/Consumer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      46     1 action   Ljava/util/function/Consumer<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 2
        frame_type = 19 /* same */
        frame_type = 0 /* same */
    Signature: #318                         // (Ljava/util/function/Consumer<Lext/mods/gameserver/model/actor/Creature;>;)V

  public boolean isActive();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _active:Z
         4: ireturn
      LineNumberTable:
        line 202: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/RandomZone;

  public boolean isFlegZone();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _flagzone:Z
         4: ireturn
      LineNumberTable:
        line 207: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/RandomZone;

  public java.util.Set<java.lang.Integer> getRestrictedClasses();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _restrictedClasses:Ljava/util/Set;
         4: invokestatic  #261                // Method java/util/Collections.unmodifiableSet:(Ljava/util/Set;)Ljava/util/Set;
         7: areturn
      LineNumberTable:
        line 212: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/zone/type/RandomZone;
    Signature: #323                         // ()Ljava/util/Set<Ljava/lang/Integer;>;

  public java.util.Set<java.lang.Integer> getRestrictedItems();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _restrictedItems:Ljava/util/Set;
         4: invokestatic  #261                // Method java/util/Collections.unmodifiableSet:(Ljava/util/Set;)Ljava/util/Set;
         7: areturn
      LineNumberTable:
        line 217: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/zone/type/RandomZone;
    Signature: #323                         // ()Ljava/util/Set<Ljava/lang/Integer;>;

  public ext.mods.gameserver.model.location.Location getReturnLocation();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _returnLocation:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 222: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/RandomZone;

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #51                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 238: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/RandomZone;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #57                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 243: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/RandomZone;
}
SourceFile: "RandomZone.java"
BootstrapMethods:
  0: #349 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #338 (Ljava/lang/Object;)V
      #340 REF_invokeStatic ext/mods/gameserver/model/zone/type/RandomZone.lambda$setActive$0:(Lext/mods/gameserver/model/actor/Creature;)V
      #343 (Lext/mods/gameserver/model/actor/Creature;)V
  1: #349 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #344 (Ljava/lang/Object;)Z
      #345 REF_invokeStatic ext/mods/gameserver/model/zone/type/RandomZone.lambda$forEachCreatureInside$0:(Lext/mods/gameserver/model/actor/Creature;)Z
      #348 (Lext/mods/gameserver/model/actor/Creature;)Z
InnerClasses:
  public static final #361= #357 of #359; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
