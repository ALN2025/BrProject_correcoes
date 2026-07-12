// Bytecode for: ext.mods.gameserver.model.actor.template.PlayerTemplate
// File: ext\mods\gameserver\model\actor\template\PlayerTemplate.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/template/PlayerTemplate.class
  Last modified 9 de jul de 2026; size 7517 bytes
  MD5 checksum 0f5ab9efadba5ba33f907cde05581fb6
  Compiled from "PlayerTemplate.java"
public class ext.mods.gameserver.model.actor.template.PlayerTemplate extends ext.mods.gameserver.model.actor.template.CreatureTemplate
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #22                         // ext/mods/gameserver/model/actor/template/PlayerTemplate
  super_class: #2                         // ext/mods/gameserver/model/actor/template/CreatureTemplate
  interfaces: 0, fields: 20, methods: 25, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/template/CreatureTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/template/CreatureTemplate
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/commons/data/StatSet;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/template/CreatureTemplate
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
    #8 = Class              #10           // ext/mods/gameserver/enums/actors/ClassId
    #9 = NameAndType        #11:#12       // VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
   #10 = Utf8               ext/mods/gameserver/enums/actors/ClassId
   #11 = Utf8               VALUES
   #12 = Utf8               [Lext/mods/gameserver/enums/actors/ClassId;
   #13 = String             #14           // id
   #14 = Utf8               id
   #15 = Methodref          #16.#17       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #16 = Class              #18           // ext/mods/commons/data/StatSet
   #17 = NameAndType        #19:#20       // getInteger:(Ljava/lang/String;)I
   #18 = Utf8               ext/mods/commons/data/StatSet
   #19 = Utf8               getInteger
   #20 = Utf8               (Ljava/lang/String;)I
   #21 = Fieldref           #22.#23       // ext/mods/gameserver/model/actor/template/PlayerTemplate._classId:Lext/mods/gameserver/enums/actors/ClassId;
   #22 = Class              #24           // ext/mods/gameserver/model/actor/template/PlayerTemplate
   #23 = NameAndType        #25:#26       // _classId:Lext/mods/gameserver/enums/actors/ClassId;
   #24 = Utf8               ext/mods/gameserver/model/actor/template/PlayerTemplate
   #25 = Utf8               _classId
   #26 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
   #27 = String             #28           // safeFallHeight
   #28 = Utf8               safeFallHeight
   #29 = Methodref          #16.#30       // ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;)[I
   #30 = NameAndType        #31:#32       // getIntegerArray:(Ljava/lang/String;)[I
   #31 = Utf8               getIntegerArray
   #32 = Utf8               (Ljava/lang/String;)[I
   #33 = Fieldref           #22.#34       // ext/mods/gameserver/model/actor/template/PlayerTemplate._safeFallHeight:[I
   #34 = NameAndType        #35:#36       // _safeFallHeight:[I
   #35 = Utf8               _safeFallHeight
   #36 = Utf8               [I
   #37 = String             #38           // swimSpd
   #38 = Utf8               swimSpd
   #39 = Methodref          #16.#40       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #40 = NameAndType        #19:#41       // getInteger:(Ljava/lang/String;I)I
   #41 = Utf8               (Ljava/lang/String;I)I
   #42 = Fieldref           #22.#43       // ext/mods/gameserver/model/actor/template/PlayerTemplate._baseSwimSpd:I
   #43 = NameAndType        #44:#45       // _baseSwimSpd:I
   #44 = Utf8               _baseSwimSpd
   #45 = Utf8               I
   #46 = String             #47           // radiusFemale
   #47 = Utf8               radiusFemale
   #48 = Methodref          #16.#49       // ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
   #49 = NameAndType        #50:#51       // getDouble:(Ljava/lang/String;)D
   #50 = Utf8               getDouble
   #51 = Utf8               (Ljava/lang/String;)D
   #52 = Fieldref           #22.#53       // ext/mods/gameserver/model/actor/template/PlayerTemplate._collisionRadiusFemale:D
   #53 = NameAndType        #54:#55       // _collisionRadiusFemale:D
   #54 = Utf8               _collisionRadiusFemale
   #55 = Utf8               D
   #56 = String             #57           // heightFemale
   #57 = Utf8               heightFemale
   #58 = Fieldref           #22.#59       // ext/mods/gameserver/model/actor/template/PlayerTemplate._collisionHeightFemale:D
   #59 = NameAndType        #60:#55       // _collisionHeightFemale:D
   #60 = Utf8               _collisionHeightFemale
   #61 = String             #62           // spawnLocations
   #62 = Utf8               spawnLocations
   #63 = Methodref          #16.#64       // ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
   #64 = NameAndType        #65:#66       // getList:(Ljava/lang/String;)Ljava/util/List;
   #65 = Utf8               getList
   #66 = Utf8               (Ljava/lang/String;)Ljava/util/List;
   #67 = Fieldref           #22.#68       // ext/mods/gameserver/model/actor/template/PlayerTemplate._spawnLocations:Ljava/util/List;
   #68 = NameAndType        #69:#70       // _spawnLocations:Ljava/util/List;
   #69 = Utf8               _spawnLocations
   #70 = Utf8               Ljava/util/List;
   #71 = String             #72           // baseLvl
   #72 = Utf8               baseLvl
   #73 = Fieldref           #22.#74       // ext/mods/gameserver/model/actor/template/PlayerTemplate._classBaseLevel:I
   #74 = NameAndType        #75:#45       // _classBaseLevel:I
   #75 = Utf8               _classBaseLevel
   #76 = String             #77           // hpTable
   #77 = Utf8               hpTable
   #78 = Methodref          #16.#79       // ext/mods/commons/data/StatSet.getDoubleArray:(Ljava/lang/String;)[D
   #79 = NameAndType        #80:#81       // getDoubleArray:(Ljava/lang/String;)[D
   #80 = Utf8               getDoubleArray
   #81 = Utf8               (Ljava/lang/String;)[D
   #82 = Fieldref           #22.#83       // ext/mods/gameserver/model/actor/template/PlayerTemplate._hpTable:[D
   #83 = NameAndType        #84:#85       // _hpTable:[D
   #84 = Utf8               _hpTable
   #85 = Utf8               [D
   #86 = String             #87           // mpTable
   #87 = Utf8               mpTable
   #88 = Fieldref           #22.#89       // ext/mods/gameserver/model/actor/template/PlayerTemplate._mpTable:[D
   #89 = NameAndType        #90:#85       // _mpTable:[D
   #90 = Utf8               _mpTable
   #91 = String             #92           // cpTable
   #92 = Utf8               cpTable
   #93 = Fieldref           #22.#94       // ext/mods/gameserver/model/actor/template/PlayerTemplate._cpTable:[D
   #94 = NameAndType        #95:#85       // _cpTable:[D
   #95 = Utf8               _cpTable
   #96 = String             #97           // hpRegenTable
   #97 = Utf8               hpRegenTable
   #98 = Fieldref           #22.#99       // ext/mods/gameserver/model/actor/template/PlayerTemplate._hpRegenTable:[D
   #99 = NameAndType        #100:#85      // _hpRegenTable:[D
  #100 = Utf8               _hpRegenTable
  #101 = String             #102          // mpRegenTable
  #102 = Utf8               mpRegenTable
  #103 = Fieldref           #22.#104      // ext/mods/gameserver/model/actor/template/PlayerTemplate._mpRegenTable:[D
  #104 = NameAndType        #105:#85      // _mpRegenTable:[D
  #105 = Utf8               _mpRegenTable
  #106 = String             #107          // cpRegenTable
  #107 = Utf8               cpRegenTable
  #108 = Fieldref           #22.#109      // ext/mods/gameserver/model/actor/template/PlayerTemplate._cpRegenTable:[D
  #109 = NameAndType        #110:#85      // _cpRegenTable:[D
  #110 = Utf8               _cpRegenTable
  #111 = String             #112          // title
  #112 = Utf8               title
  #113 = String             #114          //
  #114 = Utf8
  #115 = Methodref          #16.#116      // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #116 = NameAndType        #117:#118     // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #117 = Utf8               getString
  #118 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #119 = Fieldref           #22.#120      // ext/mods/gameserver/model/actor/template/PlayerTemplate._title:Ljava/lang/String;
  #120 = NameAndType        #121:#122     // _title:Ljava/lang/String;
  #121 = Utf8               _title
  #122 = Utf8               Ljava/lang/String;
  #123 = String             #124          // startLvl
  #124 = Utf8               startLvl
  #125 = Fieldref           #22.#126      // ext/mods/gameserver/model/actor/template/PlayerTemplate._startLvl:I
  #126 = NameAndType        #127:#45      // _startLvl:I
  #127 = Utf8               _startLvl
  #128 = String             #129          // macros
  #129 = Utf8               macros
  #130 = Fieldref           #22.#131      // ext/mods/gameserver/model/actor/template/PlayerTemplate._macros:Ljava/util/List;
  #131 = NameAndType        #132:#70      // _macros:Ljava/util/List;
  #132 = Utf8               _macros
  #133 = String             #134          // items
  #134 = Utf8               items
  #135 = Fieldref           #22.#136      // ext/mods/gameserver/model/actor/template/PlayerTemplate._items:Ljava/util/List;
  #136 = NameAndType        #137:#70      // _items:Ljava/util/List;
  #137 = Utf8               _items
  #138 = String             #139          // skills
  #139 = Utf8               skills
  #140 = Fieldref           #22.#141      // ext/mods/gameserver/model/actor/template/PlayerTemplate._skills:Ljava/util/List;
  #141 = NameAndType        #142:#70      // _skills:Ljava/util/List;
  #142 = Utf8               _skills
  #143 = String             #144          // buffs
  #144 = Utf8               buffs
  #145 = Class              #146          // java/lang/String
  #146 = Utf8               java/lang/String
  #147 = Methodref          #16.#148      // ext/mods/commons/data/StatSet.getStringArray:(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
  #148 = NameAndType        #149:#150     // getStringArray:(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
  #149 = Utf8               getStringArray
  #150 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
  #151 = Fieldref           #22.#152      // ext/mods/gameserver/model/actor/template/PlayerTemplate._buffs:[Ljava/lang/String;
  #152 = NameAndType        #153:#154     // _buffs:[Ljava/lang/String;
  #153 = Utf8               _buffs
  #154 = Utf8               [Ljava/lang/String;
  #155 = Methodref          #156.#157     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #156 = Class              #158          // ext/mods/gameserver/data/xml/ItemData
  #157 = NameAndType        #159:#160     // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #158 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #159 = Utf8               getInstance
  #160 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #161 = String             #162          // fists
  #162 = Utf8               fists
  #163 = Methodref          #156.#164     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #164 = NameAndType        #165:#166     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #165 = Utf8               getTemplate
  #166 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #167 = Class              #168          // ext/mods/gameserver/model/item/kind/Weapon
  #168 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #169 = Fieldref           #22.#170      // ext/mods/gameserver/model/actor/template/PlayerTemplate._fists:Lext/mods/gameserver/model/item/kind/Weapon;
  #170 = NameAndType        #171:#172     // _fists:Lext/mods/gameserver/model/item/kind/Weapon;
  #171 = Utf8               _fists
  #172 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #173 = Methodref          #8.#174       // ext/mods/gameserver/enums/actors/ClassId.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #174 = NameAndType        #175:#176     // getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #175 = Utf8               getRace
  #176 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassRace;
  #177 = Methodref          #8.#178       // ext/mods/gameserver/enums/actors/ClassId.toString:()Ljava/lang/String;
  #178 = NameAndType        #179:#180     // toString:()Ljava/lang/String;
  #179 = Utf8               toString
  #180 = Utf8               ()Ljava/lang/String;
  #181 = Fieldref           #182.#183     // ext/mods/gameserver/enums/actors/Sex.MALE:Lext/mods/gameserver/enums/actors/Sex;
  #182 = Class              #184          // ext/mods/gameserver/enums/actors/Sex
  #183 = NameAndType        #185:#186     // MALE:Lext/mods/gameserver/enums/actors/Sex;
  #184 = Utf8               ext/mods/gameserver/enums/actors/Sex
  #185 = Utf8               MALE
  #186 = Utf8               Lext/mods/gameserver/enums/actors/Sex;
  #187 = Fieldref           #22.#188      // ext/mods/gameserver/model/actor/template/PlayerTemplate._collisionRadius:D
  #188 = NameAndType        #189:#55      // _collisionRadius:D
  #189 = Utf8               _collisionRadius
  #190 = Fieldref           #22.#191      // ext/mods/gameserver/model/actor/template/PlayerTemplate._collisionHeight:D
  #191 = NameAndType        #192:#55      // _collisionHeight:D
  #192 = Utf8               _collisionHeight
  #193 = Methodref          #194.#195     // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
  #194 = Class              #196          // ext/mods/commons/random/Rnd
  #195 = NameAndType        #197:#198     // get:(Ljava/util/List;)Ljava/lang/Object;
  #196 = Utf8               ext/mods/commons/random/Rnd
  #197 = Utf8               get
  #198 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #199 = Class              #200          // ext/mods/gameserver/model/location/Location
  #200 = Utf8               ext/mods/gameserver/model/location/Location
  #201 = Fieldref           #199.#202     // ext/mods/gameserver/model/location/Location.DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
  #202 = NameAndType        #203:#204     // DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
  #203 = Utf8               DUMMY_LOC
  #204 = Utf8               Lext/mods/gameserver/model/location/Location;
  #205 = InterfaceMethodref #206.#207     // java/util/List.stream:()Ljava/util/stream/Stream;
  #206 = Class              #208          // java/util/List
  #207 = NameAndType        #209:#210     // stream:()Ljava/util/stream/Stream;
  #208 = Utf8               java/util/List
  #209 = Utf8               stream
  #210 = Utf8               ()Ljava/util/stream/Stream;
  #211 = InvokeDynamic      #0:#212       // #0:test:(II)Ljava/util/function/Predicate;
  #212 = NameAndType        #213:#214     // test:(II)Ljava/util/function/Predicate;
  #213 = Utf8               test
  #214 = Utf8               (II)Ljava/util/function/Predicate;
  #215 = InterfaceMethodref #216.#217     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #216 = Class              #218          // java/util/stream/Stream
  #217 = NameAndType        #219:#220     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #218 = Utf8               java/util/stream/Stream
  #219 = Utf8               filter
  #220 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #221 = InterfaceMethodref #216.#222     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #222 = NameAndType        #223:#224     // findFirst:()Ljava/util/Optional;
  #223 = Utf8               findFirst
  #224 = Utf8               ()Ljava/util/Optional;
  #225 = Methodref          #226.#227     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #226 = Class              #228          // java/util/Optional
  #227 = NameAndType        #229:#230     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #228 = Utf8               java/util/Optional
  #229 = Utf8               orElse
  #230 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #231 = Class              #232          // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
  #232 = Utf8               ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
  #233 = Methodref          #231.#234     // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getId:()I
  #234 = NameAndType        #235:#236     // getId:()I
  #235 = Utf8               getId
  #236 = Utf8               ()I
  #237 = Methodref          #231.#238     // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.getValue:()I
  #238 = NameAndType        #239:#236     // getValue:()I
  #239 = Utf8               getValue
  #240 = Utf8               Signature
  #241 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #242 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/custom/Macros;>;
  #243 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/NewbieItem;>;
  #244 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;>;
  #245 = Utf8               Code
  #246 = Utf8               LineNumberTable
  #247 = Utf8               LocalVariableTable
  #248 = Utf8               this
  #249 = Utf8               Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #250 = Utf8               set
  #251 = Utf8               Lext/mods/commons/data/StatSet;
  #252 = Utf8               getClassId
  #253 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #254 = Utf8               getClassName
  #255 = Utf8               getSafeFallHeight
  #256 = Utf8               (Lext/mods/gameserver/enums/actors/Sex;)I
  #257 = Utf8               sex
  #258 = Utf8               StackMapTable
  #259 = Utf8               getBaseSwimSpeed
  #260 = Utf8               getCollisionRadiusBySex
  #261 = Utf8               (Lext/mods/gameserver/enums/actors/Sex;)D
  #262 = Utf8               getCollisionHeightBySex
  #263 = Utf8               getRandomSpawn
  #264 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #265 = Utf8               loc
  #266 = Utf8               getClassBaseLevel
  #267 = Utf8               getBaseHpMax
  #268 = Utf8               (I)D
  #269 = Utf8               level
  #270 = Utf8               getBaseMpMax
  #271 = Utf8               getBaseCpMax
  #272 = Utf8               getBaseHpRegen
  #273 = Utf8               getBaseMpRegen
  #274 = Utf8               getBaseCpRegen
  #275 = Utf8               getTitle
  #276 = Utf8               getStartLevel
  #277 = Utf8               getMacros
  #278 = Utf8               ()Ljava/util/List;
  #279 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/records/custom/Macros;>;
  #280 = Utf8               getItems
  #281 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/records/NewbieItem;>;
  #282 = Utf8               getSkills
  #283 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;>;
  #284 = Utf8               findSkill
  #285 = Utf8               (II)Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
  #286 = Utf8               getFists
  #287 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
  #288 = Utf8               getBuffIds
  #289 = Utf8               ()[Ljava/lang/String;
  #290 = Utf8               lambda$findSkill$0
  #291 = Utf8               (IILext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Z
  #292 = Utf8               s
  #293 = Utf8               Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
  #294 = Utf8               SourceFile
  #295 = Utf8               PlayerTemplate.java
  #296 = Utf8               BootstrapMethods
  #297 = MethodType         #298          //  (Ljava/lang/Object;)Z
  #298 = Utf8               (Ljava/lang/Object;)Z
  #299 = MethodHandle       6:#300        // REF_invokeStatic ext/mods/gameserver/model/actor/template/PlayerTemplate.lambda$findSkill$0:(IILext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Z
  #300 = Methodref          #22.#301      // ext/mods/gameserver/model/actor/template/PlayerTemplate.lambda$findSkill$0:(IILext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Z
  #301 = NameAndType        #290:#291     // lambda$findSkill$0:(IILext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Z
  #302 = MethodType         #303          //  (Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Z
  #303 = Utf8               (Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Z
  #304 = MethodHandle       6:#305        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #305 = Methodref          #306.#307     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #306 = Class              #308          // java/lang/invoke/LambdaMetafactory
  #307 = NameAndType        #309:#310     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #308 = Utf8               java/lang/invoke/LambdaMetafactory
  #309 = Utf8               metafactory
  #310 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #311 = Utf8               InnerClasses
  #312 = Class              #313          // java/lang/invoke/MethodHandles$Lookup
  #313 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #314 = Class              #315          // java/lang/invoke/MethodHandles
  #315 = Utf8               java/lang/invoke/MethodHandles
  #316 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.template.PlayerTemplate(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/template/CreatureTemplate."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: getstatic     #7                  // Field ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
         9: aload_1
        10: ldc           #13                 // String id
        12: invokevirtual #15                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        15: aaload
        16: putfield      #21                 // Field _classId:Lext/mods/gameserver/enums/actors/ClassId;
        19: aload_0
        20: aload_1
        21: ldc           #27                 // String safeFallHeight
        23: invokevirtual #29                 // Method ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;)[I
        26: putfield      #33                 // Field _safeFallHeight:[I
        29: aload_0
        30: aload_1
        31: ldc           #37                 // String swimSpd
        33: iconst_1
        34: invokevirtual #39                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        37: putfield      #42                 // Field _baseSwimSpd:I
        40: aload_0
        41: aload_1
        42: ldc           #46                 // String radiusFemale
        44: invokevirtual #48                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
        47: putfield      #52                 // Field _collisionRadiusFemale:D
        50: aload_0
        51: aload_1
        52: ldc           #56                 // String heightFemale
        54: invokevirtual #48                 // Method ext/mods/commons/data/StatSet.getDouble:(Ljava/lang/String;)D
        57: putfield      #58                 // Field _collisionHeightFemale:D
        60: aload_0
        61: aload_1
        62: ldc           #61                 // String spawnLocations
        64: invokevirtual #63                 // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
        67: putfield      #67                 // Field _spawnLocations:Ljava/util/List;
        70: aload_0
        71: aload_1
        72: ldc           #71                 // String baseLvl
        74: invokevirtual #15                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        77: putfield      #73                 // Field _classBaseLevel:I
        80: aload_0
        81: aload_1
        82: ldc           #76                 // String hpTable
        84: invokevirtual #78                 // Method ext/mods/commons/data/StatSet.getDoubleArray:(Ljava/lang/String;)[D
        87: putfield      #82                 // Field _hpTable:[D
        90: aload_0
        91: aload_1
        92: ldc           #86                 // String mpTable
        94: invokevirtual #78                 // Method ext/mods/commons/data/StatSet.getDoubleArray:(Ljava/lang/String;)[D
        97: putfield      #88                 // Field _mpTable:[D
       100: aload_0
       101: aload_1
       102: ldc           #91                 // String cpTable
       104: invokevirtual #78                 // Method ext/mods/commons/data/StatSet.getDoubleArray:(Ljava/lang/String;)[D
       107: putfield      #93                 // Field _cpTable:[D
       110: aload_0
       111: aload_1
       112: ldc           #96                 // String hpRegenTable
       114: invokevirtual #78                 // Method ext/mods/commons/data/StatSet.getDoubleArray:(Ljava/lang/String;)[D
       117: putfield      #98                 // Field _hpRegenTable:[D
       120: aload_0
       121: aload_1
       122: ldc           #101                // String mpRegenTable
       124: invokevirtual #78                 // Method ext/mods/commons/data/StatSet.getDoubleArray:(Ljava/lang/String;)[D
       127: putfield      #103                // Field _mpRegenTable:[D
       130: aload_0
       131: aload_1
       132: ldc           #106                // String cpRegenTable
       134: invokevirtual #78                 // Method ext/mods/commons/data/StatSet.getDoubleArray:(Ljava/lang/String;)[D
       137: putfield      #108                // Field _cpRegenTable:[D
       140: aload_0
       141: aload_1
       142: ldc           #111                // String title
       144: ldc           #113                // String
       146: invokevirtual #115                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       149: putfield      #119                // Field _title:Ljava/lang/String;
       152: aload_0
       153: aload_1
       154: ldc           #123                // String startLvl
       156: iconst_1
       157: invokevirtual #39                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       160: putfield      #125                // Field _startLvl:I
       163: aload_0
       164: aload_1
       165: ldc           #128                // String macros
       167: invokevirtual #63                 // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
       170: putfield      #130                // Field _macros:Ljava/util/List;
       173: aload_0
       174: aload_1
       175: ldc           #133                // String items
       177: invokevirtual #63                 // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
       180: putfield      #135                // Field _items:Ljava/util/List;
       183: aload_0
       184: aload_1
       185: ldc           #138                // String skills
       187: invokevirtual #63                 // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
       190: putfield      #140                // Field _skills:Ljava/util/List;
       193: aload_0
       194: aload_1
       195: ldc           #143                // String buffs
       197: iconst_0
       198: anewarray     #145                // class java/lang/String
       201: invokevirtual #147                // Method ext/mods/commons/data/StatSet.getStringArray:(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
       204: putfield      #151                // Field _buffs:[Ljava/lang/String;
       207: aload_0
       208: invokestatic  #155                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
       211: aload_1
       212: ldc           #161                // String fists
       214: invokevirtual #15                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       217: invokevirtual #163                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
       220: checkcast     #167                // class ext/mods/gameserver/model/item/kind/Weapon
       223: putfield      #169                // Field _fists:Lext/mods/gameserver/model/item/kind/Weapon;
       226: return
      LineNumberTable:
        line 78: 0
        line 80: 5
        line 82: 19
        line 84: 29
        line 86: 40
        line 87: 50
        line 89: 60
        line 91: 70
        line 93: 80
        line 94: 90
        line 95: 100
        line 97: 110
        line 98: 120
        line 99: 130
        line 101: 140
        line 102: 152
        line 104: 163
        line 105: 173
        line 106: 183
        line 108: 193
        line 110: 207
        line 111: 226
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     227     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
            0     227     1   set   Lext/mods/commons/data/StatSet;

  public final ext.mods.gameserver.enums.actors.ClassId getClassId();
    descriptor: ()Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _classId:Lext/mods/gameserver/enums/actors/ClassId;
         4: areturn
      LineNumberTable:
        line 115: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;

  public final ext.mods.gameserver.enums.actors.ClassRace getRace();
    descriptor: ()Lext/mods/gameserver/enums/actors/ClassRace;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _classId:Lext/mods/gameserver/enums/actors/ClassId;
         4: invokevirtual #173                // Method ext/mods/gameserver/enums/actors/ClassId.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
         7: areturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;

  public final java.lang.String getClassName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _classId:Lext/mods/gameserver/enums/actors/ClassId;
         4: invokevirtual #177                // Method ext/mods/gameserver/enums/actors/ClassId.toString:()Ljava/lang/String;
         7: areturn
      LineNumberTable:
        line 125: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;

  public final int getSafeFallHeight(ext.mods.gameserver.enums.actors.Sex);
    descriptor: (Lext/mods/gameserver/enums/actors/Sex;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: getstatic     #181                // Field ext/mods/gameserver/enums/actors/Sex.MALE:Lext/mods/gameserver/enums/actors/Sex;
         4: if_acmpne     16
         7: aload_0
         8: getfield      #33                 // Field _safeFallHeight:[I
        11: iconst_1
        12: iaload
        13: goto          22
        16: aload_0
        17: getfield      #33                 // Field _safeFallHeight:[I
        20: iconst_0
        21: iaload
        22: ireturn
      LineNumberTable:
        line 130: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
            0      23     1   sex   Lext/mods/gameserver/enums/actors/Sex;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ int ]

  public final int getBaseSwimSpeed();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _baseSwimSpd:I
         4: ireturn
      LineNumberTable:
        line 135: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;

  public double getCollisionRadiusBySex(ext.mods.gameserver.enums.actors.Sex);
    descriptor: (Lext/mods/gameserver/enums/actors/Sex;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: getstatic     #181                // Field ext/mods/gameserver/enums/actors/Sex.MALE:Lext/mods/gameserver/enums/actors/Sex;
         4: if_acmpne     14
         7: aload_0
         8: getfield      #187                // Field _collisionRadius:D
        11: goto          18
        14: aload_0
        15: getfield      #52                 // Field _collisionRadiusFemale:D
        18: dreturn
      LineNumberTable:
        line 144: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
            0      19     1   sex   Lext/mods/gameserver/enums/actors/Sex;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ double ]

  public double getCollisionHeightBySex(ext.mods.gameserver.enums.actors.Sex);
    descriptor: (Lext/mods/gameserver/enums/actors/Sex;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: getstatic     #181                // Field ext/mods/gameserver/enums/actors/Sex.MALE:Lext/mods/gameserver/enums/actors/Sex;
         4: if_acmpne     14
         7: aload_0
         8: getfield      #190                // Field _collisionHeight:D
        11: goto          18
        14: aload_0
        15: getfield      #58                 // Field _collisionHeightFemale:D
        18: dreturn
      LineNumberTable:
        line 153: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
            0      19     1   sex   Lext/mods/gameserver/enums/actors/Sex;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ double ]

  public final ext.mods.gameserver.model.location.Location getRandomSpawn();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: getfield      #67                 // Field _spawnLocations:Ljava/util/List;
         4: invokestatic  #193                // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
         7: checkcast     #199                // class ext/mods/gameserver/model/location/Location
        10: astore_1
        11: aload_1
        12: ifnonnull     21
        15: getstatic     #201                // Field ext/mods/gameserver/model/location/Location.DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
        18: goto          22
        21: aload_1
        22: areturn
      LineNumberTable:
        line 158: 0
        line 159: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
           11      12     1   loc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/location/Location ]

  public final int getClassBaseLevel();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #73                 // Field _classBaseLevel:I
         4: ireturn
      LineNumberTable:
        line 164: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;

  public final double getBaseHpMax(int);
    descriptor: (I)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #82                 // Field _hpTable:[D
         4: iload_1
         5: iconst_1
         6: isub
         7: daload
         8: dreturn
      LineNumberTable:
        line 170: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
            0       9     1 level   I

  public final double getBaseMpMax(int);
    descriptor: (I)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #88                 // Field _mpTable:[D
         4: iload_1
         5: iconst_1
         6: isub
         7: daload
         8: dreturn
      LineNumberTable:
        line 176: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
            0       9     1 level   I

  public final double getBaseCpMax(int);
    descriptor: (I)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #93                 // Field _cpTable:[D
         4: iload_1
         5: iconst_1
         6: isub
         7: daload
         8: dreturn
      LineNumberTable:
        line 181: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
            0       9     1 level   I

  public final double getBaseHpRegen(int);
    descriptor: (I)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #98                 // Field _hpRegenTable:[D
         4: iload_1
         5: iconst_1
         6: isub
         7: daload
         8: dreturn
      LineNumberTable:
        line 187: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
            0       9     1 level   I

  public final double getBaseMpRegen(int);
    descriptor: (I)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #103                // Field _mpRegenTable:[D
         4: iload_1
         5: iconst_1
         6: isub
         7: daload
         8: dreturn
      LineNumberTable:
        line 193: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
            0       9     1 level   I

  public final double getBaseCpRegen(int);
    descriptor: (I)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #108                // Field _cpRegenTable:[D
         4: iload_1
         5: iconst_1
         6: isub
         7: daload
         8: dreturn
      LineNumberTable:
        line 198: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
            0       9     1 level   I

  public final java.lang.String getTitle();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #119                // Field _title:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 203: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;

  public final int getStartLevel();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #125                // Field _startLvl:I
         4: ireturn
      LineNumberTable:
        line 208: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;

  public final java.util.List<ext.mods.gameserver.model.records.custom.Macros> getMacros();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #130                // Field _macros:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 213: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
    Signature: #279                         // ()Ljava/util/List<Lext/mods/gameserver/model/records/custom/Macros;>;

  public final java.util.List<ext.mods.gameserver.model.records.NewbieItem> getItems();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #135                // Field _items:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 221: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
    Signature: #281                         // ()Ljava/util/List<Lext/mods/gameserver/model/records/NewbieItem;>;

  public final java.util.List<ext.mods.gameserver.model.holder.skillnode.GeneralSkillNode> getSkills();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #140                // Field _skills:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 229: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
    Signature: #283                         // ()Ljava/util/List<Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;>;

  public ext.mods.gameserver.model.holder.skillnode.GeneralSkillNode findSkill(int, int);
    descriptor: (II)Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #140                // Field _skills:Ljava/util/List;
         4: invokeinterface #205,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: iload_2
        11: invokedynamic #211,  0            // InvokeDynamic #0:test:(II)Ljava/util/function/Predicate;
        16: invokeinterface #215,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        21: invokeinterface #221,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        26: aconst_null
        27: invokevirtual #225                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #231                // class ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
        33: areturn
      LineNumberTable:
        line 240: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
            0      34     1    id   I
            0      34     2 level   I

  public final ext.mods.gameserver.model.item.kind.Weapon getFists();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Weapon;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #169                // Field _fists:Lext/mods/gameserver/model/item/kind/Weapon;
         4: areturn
      LineNumberTable:
        line 248: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;

  public final java.lang.String[] getBuffIds();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #151                // Field _buffs:[Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 253: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
}
SourceFile: "PlayerTemplate.java"
BootstrapMethods:
  0: #304 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #297 (Ljava/lang/Object;)Z
      #299 REF_invokeStatic ext/mods/gameserver/model/actor/template/PlayerTemplate.lambda$findSkill$0:(IILext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Z
      #302 (Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;)Z
InnerClasses:
  public static final #316= #312 of #314; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
