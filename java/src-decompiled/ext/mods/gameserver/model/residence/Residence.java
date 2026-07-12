// Bytecode for: ext.mods.gameserver.model.residence.Residence
// File: ext\mods\gameserver\model\residence\Residence.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/Residence.class
  Last modified 9 de jul de 2026; size 7338 bytes
  MD5 checksum 2fb421ddb3cb52420c51c1d3056a4384
  Compiled from "Residence.java"
public abstract class ext.mods.gameserver.model.residence.Residence
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #15                         // ext/mods/gameserver/model/residence/Residence
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 12, methods: 26, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/EnumMap
    #8 = Utf8               java/util/EnumMap
    #9 = Class              #10           // ext/mods/gameserver/enums/SpawnType
   #10 = Utf8               ext/mods/gameserver/enums/SpawnType
   #11 = Methodref          #7.#12        // java/util/EnumMap."<init>":(Ljava/lang/Class;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/Class;)V
   #13 = Utf8               (Ljava/lang/Class;)V
   #14 = Fieldref           #15.#16       // ext/mods/gameserver/model/residence/Residence._spawns:Ljava/util/Map;
   #15 = Class              #17           // ext/mods/gameserver/model/residence/Residence
   #16 = NameAndType        #18:#19       // _spawns:Ljava/util/Map;
   #17 = Utf8               ext/mods/gameserver/model/residence/Residence
   #18 = Utf8               _spawns
   #19 = Utf8               Ljava/util/Map;
   #20 = Class              #21           // java/util/ArrayList
   #21 = Utf8               java/util/ArrayList
   #22 = Methodref          #20.#3        // java/util/ArrayList."<init>":()V
   #23 = Fieldref           #15.#24       // ext/mods/gameserver/model/residence/Residence._doors:Ljava/util/List;
   #24 = NameAndType        #25:#26       // _doors:Ljava/util/List;
   #25 = Utf8               _doors
   #26 = Utf8               Ljava/util/List;
   #27 = Fieldref           #15.#28       // ext/mods/gameserver/model/residence/Residence._npcs:Ljava/util/List;
   #28 = NameAndType        #29:#26       // _npcs:Ljava/util/List;
   #29 = Utf8               _npcs
   #30 = String             #31           // id
   #31 = Utf8               id
   #32 = Methodref          #33.#34       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #33 = Class              #35           // ext/mods/commons/data/StatSet
   #34 = NameAndType        #36:#37       // getInteger:(Ljava/lang/String;)I
   #35 = Utf8               ext/mods/commons/data/StatSet
   #36 = Utf8               getInteger
   #37 = Utf8               (Ljava/lang/String;)I
   #38 = Fieldref           #15.#39       // ext/mods/gameserver/model/residence/Residence._id:I
   #39 = NameAndType        #40:#41       // _id:I
   #40 = Utf8               _id
   #41 = Utf8               I
   #42 = String             #43           // parentId
   #43 = Utf8               parentId
   #44 = Fieldref           #15.#45       // ext/mods/gameserver/model/residence/Residence._parentId:I
   #45 = NameAndType        #46:#41       // _parentId:I
   #46 = Utf8               _parentId
   #47 = String             #48           // alias
   #48 = Utf8               alias
   #49 = Methodref          #33.#50       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #50 = NameAndType        #51:#52       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #51 = Utf8               getString
   #52 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #53 = Fieldref           #15.#54       // ext/mods/gameserver/model/residence/Residence._alias:Ljava/lang/String;
   #54 = NameAndType        #55:#56       // _alias:Ljava/lang/String;
   #55 = Utf8               _alias
   #56 = Utf8               Ljava/lang/String;
   #57 = String             #58           // name
   #58 = Utf8               name
   #59 = Fieldref           #15.#60       // ext/mods/gameserver/model/residence/Residence._name:Ljava/lang/String;
   #60 = NameAndType        #61:#56       // _name:Ljava/lang/String;
   #61 = Utf8               _name
   #62 = String             #63           // taxRate
   #63 = Utf8               taxRate
   #64 = Fieldref           #15.#65       // ext/mods/gameserver/model/residence/Residence._defaultTaxRate:I
   #65 = NameAndType        #66:#41       // _defaultTaxRate:I
   #66 = Utf8               _defaultTaxRate
   #67 = String             #68           // taxSysgetRate
   #68 = Utf8               taxSysgetRate
   #69 = Fieldref           #15.#70       // ext/mods/gameserver/model/residence/Residence._taxSysgetRate:I
   #70 = NameAndType        #71:#41       // _taxSysgetRate:I
   #71 = Utf8               _taxSysgetRate
   #72 = String             #73           // tributeRate
   #73 = Utf8               tributeRate
   #74 = Fieldref           #15.#75       // ext/mods/gameserver/model/residence/Residence._tributeRate:I
   #75 = NameAndType        #76:#41       // _tributeRate:I
   #76 = Utf8               _tributeRate
   #77 = InvokeDynamic      #0:#78        // #0:apply:()Ljava/util/function/Function;
   #78 = NameAndType        #79:#80       // apply:()Ljava/util/function/Function;
   #79 = Utf8               apply
   #80 = Utf8               ()Ljava/util/function/Function;
   #81 = InterfaceMethodref #82.#83       // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #82 = Class              #84           // java/util/Map
   #83 = NameAndType        #85:#86       // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #84 = Utf8               java/util/Map
   #85 = Utf8               computeIfAbsent
   #86 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #87 = Class              #88           // java/util/List
   #88 = Utf8               java/util/List
   #89 = InterfaceMethodref #87.#90       // java/util/List.add:(Ljava/lang/Object;)Z
   #90 = NameAndType        #91:#92       // add:(Ljava/lang/Object;)Z
   #91 = Utf8               add
   #92 = Utf8               (Ljava/lang/Object;)Z
   #93 = Fieldref           #9.#94        // ext/mods/gameserver/enums/SpawnType.OWNER:Lext/mods/gameserver/enums/SpawnType;
   #94 = NameAndType        #95:#96       // OWNER:Lext/mods/gameserver/enums/SpawnType;
   #95 = Utf8               OWNER
   #96 = Utf8               Lext/mods/gameserver/enums/SpawnType;
   #97 = InterfaceMethodref #82.#98       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #98 = NameAndType        #99:#100      // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #99 = Utf8               get
  #100 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #101 = InterfaceMethodref #82.#102      // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #102 = NameAndType        #103:#104     // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #103 = Utf8               getOrDefault
  #104 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #105 = Methodref          #15.#106      // ext/mods/gameserver/model/residence/Residence.getSpawns:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
  #106 = NameAndType        #107:#108     // getSpawns:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
  #107 = Utf8               getSpawns
  #108 = Utf8               (Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
  #109 = Methodref          #110.#111     // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
  #110 = Class              #112          // ext/mods/commons/random/Rnd
  #111 = NameAndType        #99:#113      // get:(Ljava/util/List;)Ljava/lang/Object;
  #112 = Utf8               ext/mods/commons/random/Rnd
  #113 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #114 = Class              #115          // ext/mods/gameserver/model/location/Location
  #115 = Utf8               ext/mods/gameserver/model/location/Location
  #116 = String             #117          // ;
  #117 = Utf8               ;
  #118 = Methodref          #119.#120     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #119 = Class              #121          // java/lang/String
  #120 = NameAndType        #122:#123     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #121 = Utf8               java/lang/String
  #122 = Utf8               split
  #123 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #124 = Methodref          #125.#126     // ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
  #125 = Class              #127          // ext/mods/gameserver/data/xml/DoorData
  #126 = NameAndType        #128:#129     // getInstance:()Lext/mods/gameserver/data/xml/DoorData;
  #127 = Utf8               ext/mods/gameserver/data/xml/DoorData
  #128 = Utf8               getInstance
  #129 = Utf8               ()Lext/mods/gameserver/data/xml/DoorData;
  #130 = Methodref          #125.#131     // ext/mods/gameserver/data/xml/DoorData.getDoor:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/instance/Door;
  #131 = NameAndType        #132:#133     // getDoor:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/instance/Door;
  #132 = Utf8               getDoor
  #133 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/instance/Door;
  #134 = Methodref          #135.#136     // ext/mods/gameserver/model/actor/instance/Door.setResidence:(Lext/mods/gameserver/model/residence/Residence;)V
  #135 = Class              #137          // ext/mods/gameserver/model/actor/instance/Door
  #136 = NameAndType        #138:#139     // setResidence:(Lext/mods/gameserver/model/residence/Residence;)V
  #137 = Utf8               ext/mods/gameserver/model/actor/instance/Door
  #138 = Utf8               setResidence
  #139 = Utf8               (Lext/mods/gameserver/model/residence/Residence;)V
  #140 = InterfaceMethodref #87.#141      // java/util/List.stream:()Ljava/util/stream/Stream;
  #141 = NameAndType        #142:#143     // stream:()Ljava/util/stream/Stream;
  #142 = Utf8               stream
  #143 = Utf8               ()Ljava/util/stream/Stream;
  #144 = InvokeDynamic      #1:#145       // #1:test:(I)Ljava/util/function/Predicate;
  #145 = NameAndType        #146:#147     // test:(I)Ljava/util/function/Predicate;
  #146 = Utf8               test
  #147 = Utf8               (I)Ljava/util/function/Predicate;
  #148 = InterfaceMethodref #149.#150     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #149 = Class              #151          // java/util/stream/Stream
  #150 = NameAndType        #152:#153     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #151 = Utf8               java/util/stream/Stream
  #152 = Utf8               filter
  #153 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #154 = InterfaceMethodref #149.#155     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #155 = NameAndType        #156:#157     // findFirst:()Ljava/util/Optional;
  #156 = Utf8               findFirst
  #157 = Utf8               ()Ljava/util/Optional;
  #158 = Methodref          #159.#160     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #159 = Class              #161          // java/util/Optional
  #160 = NameAndType        #162:#100     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #161 = Utf8               java/util/Optional
  #162 = Utf8               orElse
  #163 = Methodref          #164.#165     // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #164 = Class              #166          // ext/mods/gameserver/model/actor/Player
  #165 = NameAndType        #167:#168     // getClanId:()I
  #166 = Utf8               ext/mods/gameserver/model/actor/Player
  #167 = Utf8               getClanId
  #168 = Utf8               ()I
  #169 = Fieldref           #15.#170      // ext/mods/gameserver/model/residence/Residence._ownerId:I
  #170 = NameAndType        #171:#41      // _ownerId:I
  #171 = Utf8               _ownerId
  #172 = Methodref          #15.#173      // ext/mods/gameserver/model/residence/Residence.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
  #173 = NameAndType        #132:#174     // getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
  #174 = Utf8               (I)Lext/mods/gameserver/model/actor/instance/Door;
  #175 = Methodref          #135.#176     // ext/mods/gameserver/model/actor/instance/Door.closeMe:()V
  #176 = NameAndType        #177:#6       // closeMe:()V
  #177 = Utf8               closeMe
  #178 = InvokeDynamic      #2:#179       // #2:accept:()Ljava/util/function/Consumer;
  #179 = NameAndType        #180:#181     // accept:()Ljava/util/function/Consumer;
  #180 = Utf8               accept
  #181 = Utf8               ()Ljava/util/function/Consumer;
  #182 = InterfaceMethodref #87.#183      // java/util/List.forEach:(Ljava/util/function/Consumer;)V
  #183 = NameAndType        #184:#185     // forEach:(Ljava/util/function/Consumer;)V
  #184 = Utf8               forEach
  #185 = Utf8               (Ljava/util/function/Consumer;)V
  #186 = Methodref          #135.#187     // ext/mods/gameserver/model/actor/instance/Door.openMe:()V
  #187 = NameAndType        #188:#6       // openMe:()V
  #188 = Utf8               openMe
  #189 = InvokeDynamic      #3:#179       // #3:accept:()Ljava/util/function/Consumer;
  #190 = Methodref          #191.#192     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #191 = Class              #193          // java/lang/Integer
  #192 = NameAndType        #194:#37      // parseInt:(Ljava/lang/String;)I
  #193 = Utf8               java/lang/Integer
  #194 = Utf8               parseInt
  #195 = Methodref          #191.#196     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #196 = NameAndType        #197:#198     // valueOf:(I)Ljava/lang/Integer;
  #197 = Utf8               valueOf
  #198 = Utf8               (I)Ljava/lang/Integer;
  #199 = Fieldref           #15.#200      // ext/mods/gameserver/model/residence/Residence._townName:Ljava/lang/String;
  #200 = NameAndType        #201:#56      // _townName:Ljava/lang/String;
  #201 = Utf8               _townName
  #202 = Methodref          #135.#203     // ext/mods/gameserver/model/actor/instance/Door.getDoorId:()I
  #203 = NameAndType        #204:#168     // getDoorId:()I
  #204 = Utf8               getDoorId
  #205 = Utf8               Signature
  #206 = Utf8               Ljava/util/Map<Lext/mods/gameserver/enums/SpawnType;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;>;
  #207 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Door;>;
  #208 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #209 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #210 = Utf8               Code
  #211 = Utf8               LineNumberTable
  #212 = Utf8               LocalVariableTable
  #213 = Utf8               this
  #214 = Utf8               Lext/mods/gameserver/model/residence/Residence;
  #215 = Utf8               set
  #216 = Utf8               Lext/mods/commons/data/StatSet;
  #217 = Utf8               getId
  #218 = Utf8               getParentId
  #219 = Utf8               getAlias
  #220 = Utf8               ()Ljava/lang/String;
  #221 = Utf8               getName
  #222 = Utf8               addSpawn
  #223 = Utf8               (Lext/mods/gameserver/enums/SpawnType;Lext/mods/gameserver/model/location/Location;)V
  #224 = Utf8               type
  #225 = Utf8               loc
  #226 = Utf8               Lext/mods/gameserver/model/location/Location;
  #227 = Utf8               (Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #228 = Utf8               getRndSpawn
  #229 = Utf8               (Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #230 = Utf8               getDoors
  #231 = Utf8               ()Ljava/util/List;
  #232 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Door;>;
  #233 = Utf8               setDoors
  #234 = Utf8               (Ljava/lang/String;)V
  #235 = Utf8               door
  #236 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #237 = Utf8               doorName
  #238 = Utf8               doors
  #239 = Utf8               StackMapTable
  #240 = Class              #241          // "[Ljava/lang/String;"
  #241 = Utf8               [Ljava/lang/String;
  #242 = Utf8               doorId
  #243 = Utf8               closeDoor
  #244 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #245 = Utf8               player
  #246 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #247 = Utf8               closeDoors
  #248 = Utf8               openDoor
  #249 = Utf8               openDoors
  #250 = Utf8               getNpcs
  #251 = Utf8               ()Ljava/util/List<Ljava/lang/Integer;>;
  #252 = Utf8               setNpcs
  #253 = Utf8               npc
  #254 = Utf8               npcs
  #255 = Utf8               getOwnerId
  #256 = Utf8               setOwnerId
  #257 = Utf8               (I)V
  #258 = Utf8               ownerId
  #259 = Utf8               isFree
  #260 = Utf8               ()Z
  #261 = Utf8               getTownName
  #262 = Utf8               getDefaultTaxRate
  #263 = Utf8               getTaxSysgetRate
  #264 = Utf8               getTributeRate
  #265 = Utf8               lambda$getDoor$0
  #266 = Utf8               (ILext/mods/gameserver/model/actor/instance/Door;)Z
  #267 = Utf8               d
  #268 = Utf8               lambda$addSpawn$0
  #269 = Utf8               k
  #270 = Utf8               SourceFile
  #271 = Utf8               Residence.java
  #272 = Utf8               BootstrapMethods
  #273 = MethodType         #100          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #274 = MethodHandle       6:#275        // REF_invokeStatic ext/mods/gameserver/model/residence/Residence.lambda$addSpawn$0:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
  #275 = Methodref          #15.#276      // ext/mods/gameserver/model/residence/Residence.lambda$addSpawn$0:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
  #276 = NameAndType        #268:#108     // lambda$addSpawn$0:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
  #277 = MethodType         #108          //  (Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
  #278 = MethodType         #92           //  (Ljava/lang/Object;)Z
  #279 = MethodHandle       6:#280        // REF_invokeStatic ext/mods/gameserver/model/residence/Residence.lambda$getDoor$0:(ILext/mods/gameserver/model/actor/instance/Door;)Z
  #280 = Methodref          #15.#281      // ext/mods/gameserver/model/residence/Residence.lambda$getDoor$0:(ILext/mods/gameserver/model/actor/instance/Door;)Z
  #281 = NameAndType        #265:#266     // lambda$getDoor$0:(ILext/mods/gameserver/model/actor/instance/Door;)Z
  #282 = MethodType         #283          //  (Lext/mods/gameserver/model/actor/instance/Door;)Z
  #283 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;)Z
  #284 = MethodType         #285          //  (Ljava/lang/Object;)V
  #285 = Utf8               (Ljava/lang/Object;)V
  #286 = MethodHandle       5:#175        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Door.closeMe:()V
  #287 = MethodType         #288          //  (Lext/mods/gameserver/model/actor/instance/Door;)V
  #288 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;)V
  #289 = MethodHandle       5:#186        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Door.openMe:()V
  #290 = MethodHandle       6:#291        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #291 = Methodref          #292.#293     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #292 = Class              #294          // java/lang/invoke/LambdaMetafactory
  #293 = NameAndType        #295:#296     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #294 = Utf8               java/lang/invoke/LambdaMetafactory
  #295 = Utf8               metafactory
  #296 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #297 = Utf8               InnerClasses
  #298 = Class              #299          // java/lang/invoke/MethodHandles$Lookup
  #299 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #300 = Class              #301          // java/lang/invoke/MethodHandles
  #301 = Utf8               java/lang/invoke/MethodHandles
  #302 = Utf8               Lookup
{
  protected final int _id;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _parentId;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final java.lang.String _alias;
    descriptor: Ljava/lang/String;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final java.lang.String _name;
    descriptor: Ljava/lang/String;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final java.util.Map<ext.mods.gameserver.enums.SpawnType, java.util.List<ext.mods.gameserver.model.location.Location>> _spawns;
    descriptor: Ljava/util/Map;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #206                         // Ljava/util/Map<Lext/mods/gameserver/enums/SpawnType;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;>;

  protected final java.util.List<ext.mods.gameserver.model.actor.instance.Door> _doors;
    descriptor: Ljava/util/List;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #207                         // Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Door;>;

  protected final java.util.List<java.lang.Integer> _npcs;
    descriptor: Ljava/util/List;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #208                         // Ljava/util/List<Ljava/lang/Integer;>;

  protected int _ownerId;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected java.lang.String _townName;
    descriptor: Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED

  protected final int _defaultTaxRate;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _taxSysgetRate;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _tributeRate;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected ext.mods.gameserver.model.residence.Residence(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/EnumMap
         8: dup
         9: ldc           #9                  // class ext/mods/gameserver/enums/SpawnType
        11: invokespecial #11                 // Method java/util/EnumMap."<init>":(Ljava/lang/Class;)V
        14: putfield      #14                 // Field _spawns:Ljava/util/Map;
        17: aload_0
        18: new           #20                 // class java/util/ArrayList
        21: dup
        22: invokespecial #22                 // Method java/util/ArrayList."<init>":()V
        25: putfield      #23                 // Field _doors:Ljava/util/List;
        28: aload_0
        29: new           #20                 // class java/util/ArrayList
        32: dup
        33: invokespecial #22                 // Method java/util/ArrayList."<init>":()V
        36: putfield      #27                 // Field _npcs:Ljava/util/List;
        39: aload_0
        40: aload_1
        41: ldc           #30                 // String id
        43: invokevirtual #32                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        46: putfield      #38                 // Field _id:I
        49: aload_0
        50: aload_1
        51: ldc           #42                 // String parentId
        53: invokevirtual #32                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        56: putfield      #44                 // Field _parentId:I
        59: aload_0
        60: aload_1
        61: ldc           #47                 // String alias
        63: invokevirtual #49                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        66: putfield      #53                 // Field _alias:Ljava/lang/String;
        69: aload_0
        70: aload_1
        71: ldc           #57                 // String name
        73: invokevirtual #49                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        76: putfield      #59                 // Field _name:Ljava/lang/String;
        79: aload_0
        80: aload_1
        81: ldc           #62                 // String taxRate
        83: invokevirtual #32                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        86: putfield      #64                 // Field _defaultTaxRate:I
        89: aload_0
        90: aload_1
        91: ldc           #67                 // String taxSysgetRate
        93: invokevirtual #32                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        96: putfield      #69                 // Field _taxSysgetRate:I
        99: aload_0
       100: aload_1
       101: ldc           #72                 // String tributeRate
       103: invokevirtual #32                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       106: putfield      #74                 // Field _tributeRate:I
       109: return
      LineNumberTable:
        line 56: 0
        line 43: 4
        line 45: 17
        line 46: 28
        line 57: 39
        line 58: 49
        line 60: 59
        line 61: 69
        line 63: 79
        line 64: 89
        line 65: 99
        line 66: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     110     0  this   Lext/mods/gameserver/model/residence/Residence;
            0     110     1   set   Lext/mods/commons/data/StatSet;

  public final int getId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/Residence;

  public final int getParentId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _parentId:I
         4: ireturn
      LineNumberTable:
        line 75: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/Residence;

  public final java.lang.String getAlias();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _alias:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/Residence;

  public final java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #59                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 85: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/Residence;

  public final void addSpawn(ext.mods.gameserver.enums.SpawnType, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/enums/SpawnType;Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #14                 // Field _spawns:Ljava/util/Map;
         4: aload_1
         5: invokedynamic #77,  0             // InvokeDynamic #0:apply:()Ljava/util/function/Function;
        10: invokeinterface #81,  3           // InterfaceMethod java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
        15: checkcast     #87                 // class java/util/List
        18: aload_2
        19: invokeinterface #89,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: return
      LineNumberTable:
        line 97: 0
        line 98: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/residence/Residence;
            0      26     1  type   Lext/mods/gameserver/enums/SpawnType;
            0      26     2   loc   Lext/mods/gameserver/model/location/Location;

  public final java.util.List<ext.mods.gameserver.model.location.Location> getSpawns(ext.mods.gameserver.enums.SpawnType);
    descriptor: (Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #14                 // Field _spawns:Ljava/util/Map;
         4: aload_1
         5: aload_0
         6: getfield      #14                 // Field _spawns:Ljava/util/Map;
         9: getstatic     #93                 // Field ext/mods/gameserver/enums/SpawnType.OWNER:Lext/mods/gameserver/enums/SpawnType;
        12: invokeinterface #97,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        17: checkcast     #87                 // class java/util/List
        20: invokeinterface #101,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        25: checkcast     #87                 // class java/util/List
        28: areturn
      LineNumberTable:
        line 106: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/residence/Residence;
            0      29     1  type   Lext/mods/gameserver/enums/SpawnType;
    Signature: #227                         // (Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;

  public final ext.mods.gameserver.model.location.Location getRndSpawn(ext.mods.gameserver.enums.SpawnType);
    descriptor: (Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #105                // Method getSpawns:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
         5: invokestatic  #109                // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
         8: checkcast     #114                // class ext/mods/gameserver/model/location/Location
        11: areturn
      LineNumberTable:
        line 115: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/residence/Residence;
            0      12     1  type   Lext/mods/gameserver/enums/SpawnType;

  public final java.util.List<ext.mods.gameserver.model.actor.instance.Door> getDoors();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _doors:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 123: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/Residence;
    Signature: #232                         // ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Door;>;

  public void setDoors(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=2
         0: aload_1
         1: ldc           #116                // String ;
         3: invokevirtual #118                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
         6: astore_2
         7: aload_2
         8: arraylength
         9: istore_3
        10: iconst_0
        11: istore        4
        13: iload         4
        15: iload_3
        16: if_icmpge     64
        19: aload_2
        20: iload         4
        22: aaload
        23: astore        5
        25: invokestatic  #124                // Method ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
        28: aload         5
        30: invokevirtual #130                // Method ext/mods/gameserver/data/xml/DoorData.getDoor:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/instance/Door;
        33: astore        6
        35: aload         6
        37: ifnull        58
        40: aload_0
        41: getfield      #23                 // Field _doors:Ljava/util/List;
        44: aload         6
        46: invokeinterface #89,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        51: pop
        52: aload         6
        54: aload_0
        55: invokevirtual #134                // Method ext/mods/gameserver/model/actor/instance/Door.setResidence:(Lext/mods/gameserver/model/residence/Residence;)V
        58: iinc          4, 1
        61: goto          13
        64: return
      LineNumberTable:
        line 132: 0
        line 134: 25
        line 135: 35
        line 137: 40
        line 139: 52
        line 132: 58
        line 142: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      23     6  door   Lext/mods/gameserver/model/actor/instance/Door;
           25      33     5 doorName   Ljava/lang/String;
            0      65     0  this   Lext/mods/gameserver/model/residence/Residence;
            0      65     1 doors   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class "[Ljava/lang/String;", int, int ]
        frame_type = 44 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public final ext.mods.gameserver.model.actor.instance.Door getDoor(int);
    descriptor: (I)Lext/mods/gameserver/model/actor/instance/Door;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #23                 // Field _doors:Ljava/util/List;
         4: invokeinterface #140,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: invokedynamic #144,  0            // InvokeDynamic #1:test:(I)Ljava/util/function/Predicate;
        15: invokeinterface #148,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #154,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aconst_null
        26: invokevirtual #158                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #135                // class ext/mods/gameserver/model/actor/instance/Door
        32: areturn
      LineNumberTable:
        line 150: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/residence/Residence;
            0      33     1 doorId   I

  public void closeDoor(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_1
         1: ifnull        16
         4: aload_1
         5: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
         8: aload_0
         9: getfield      #169                // Field _ownerId:I
        12: if_icmpeq     16
        15: return
        16: aload_0
        17: iload_2
        18: invokevirtual #172                // Method getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
        21: astore_3
        22: aload_3
        23: ifnull        30
        26: aload_3
        27: invokevirtual #175                // Method ext/mods/gameserver/model/actor/instance/Door.closeMe:()V
        30: return
      LineNumberTable:
        line 155: 0
        line 156: 15
        line 158: 16
        line 159: 22
        line 160: 26
        line 161: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/residence/Residence;
            0      31     1 player   Lext/mods/gameserver/model/actor/Player;
            0      31     2 doorId   I
           22       9     3  door   Lext/mods/gameserver/model/actor/instance/Door;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/instance/Door ]

  public void closeDoors();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _doors:Ljava/util/List;
         4: invokedynamic #178,  0            // InvokeDynamic #2:accept:()Ljava/util/function/Consumer;
         9: invokeinterface #182,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        14: return
      LineNumberTable:
        line 165: 0
        line 166: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/residence/Residence;

  public void openDoor(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_1
         1: ifnull        16
         4: aload_1
         5: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
         8: aload_0
         9: getfield      #169                // Field _ownerId:I
        12: if_icmpeq     16
        15: return
        16: aload_0
        17: iload_2
        18: invokevirtual #172                // Method getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
        21: astore_3
        22: aload_3
        23: ifnull        30
        26: aload_3
        27: invokevirtual #186                // Method ext/mods/gameserver/model/actor/instance/Door.openMe:()V
        30: return
      LineNumberTable:
        line 170: 0
        line 171: 15
        line 173: 16
        line 174: 22
        line 175: 26
        line 176: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/residence/Residence;
            0      31     1 player   Lext/mods/gameserver/model/actor/Player;
            0      31     2 doorId   I
           22       9     3  door   Lext/mods/gameserver/model/actor/instance/Door;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/instance/Door ]

  public void openDoors();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _doors:Ljava/util/List;
         4: invokedynamic #189,  0            // InvokeDynamic #3:accept:()Ljava/util/function/Consumer;
         9: invokeinterface #182,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        14: return
      LineNumberTable:
        line 180: 0
        line 181: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/residence/Residence;

  public java.util.List<java.lang.Integer> getNpcs();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _npcs:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 185: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/Residence;
    Signature: #251                         // ()Ljava/util/List<Ljava/lang/Integer;>;

  public void setNpcs(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=2
         0: aload_1
         1: ldc           #116                // String ;
         3: invokevirtual #118                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
         6: astore_2
         7: aload_2
         8: arraylength
         9: istore_3
        10: iconst_0
        11: istore        4
        13: iload         4
        15: iload_3
        16: if_icmpge     49
        19: aload_2
        20: iload         4
        22: aaload
        23: astore        5
        25: aload_0
        26: getfield      #27                 // Field _npcs:Ljava/util/List;
        29: aload         5
        31: invokestatic  #190                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        34: invokestatic  #195                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        37: invokeinterface #89,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        42: pop
        43: iinc          4, 1
        46: goto          13
        49: return
      LineNumberTable:
        line 190: 0
        line 191: 25
        line 190: 43
        line 192: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      18     5   npc   Ljava/lang/String;
            0      50     0  this   Lext/mods/gameserver/model/residence/Residence;
            0      50     1  npcs   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class "[Ljava/lang/String;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 35

  public final int getOwnerId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #169                // Field _ownerId:I
         4: ireturn
      LineNumberTable:
        line 196: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/Residence;

  public void setOwnerId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #169                // Field _ownerId:I
         5: return
      LineNumberTable:
        line 201: 0
        line 202: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/Residence;
            0       6     1 ownerId   I

  public boolean isFree();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #169                // Field _ownerId:I
         4: ifne          11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 209: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/residence/Residence;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.lang.String getTownName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #199                // Field _townName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 214: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/Residence;

  public final int getDefaultTaxRate();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #64                 // Field _defaultTaxRate:I
         4: ireturn
      LineNumberTable:
        line 219: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/Residence;

  public final int getTaxSysgetRate();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #69                 // Field _taxSysgetRate:I
         4: ireturn
      LineNumberTable:
        line 224: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/Residence;

  public final int getTributeRate();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #74                 // Field _tributeRate:I
         4: ireturn
      LineNumberTable:
        line 229: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/Residence;
}
SourceFile: "Residence.java"
BootstrapMethods:
  0: #290 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #273 (Ljava/lang/Object;)Ljava/lang/Object;
      #274 REF_invokeStatic ext/mods/gameserver/model/residence/Residence.lambda$addSpawn$0:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
      #277 (Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
  1: #290 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #278 (Ljava/lang/Object;)Z
      #279 REF_invokeStatic ext/mods/gameserver/model/residence/Residence.lambda$getDoor$0:(ILext/mods/gameserver/model/actor/instance/Door;)Z
      #282 (Lext/mods/gameserver/model/actor/instance/Door;)Z
  2: #290 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #284 (Ljava/lang/Object;)V
      #286 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Door.closeMe:()V
      #287 (Lext/mods/gameserver/model/actor/instance/Door;)V
  3: #290 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #284 (Ljava/lang/Object;)V
      #289 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Door.openMe:()V
      #287 (Lext/mods/gameserver/model/actor/instance/Door;)V
InnerClasses:
  public static final #302= #298 of #300; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
