// Bytecode for: ext.mods.fakeplayer.helper.FakePlayerHelpers
// File: ext\mods\fakeplayer\helper\FakePlayerHelpers.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/helper/FakePlayerHelpers.class
  Last modified 9 de jul de 2026; size 8464 bytes
  MD5 checksum 44bcb88fe1759dbdbe5b3d8a51f97d5e
  Compiled from "FakePlayerHelpers.java"
public class ext.mods.fakeplayer.helper.FakePlayerHelpers
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/helper/FakePlayerHelpers
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 11, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/fakeplayer/helper/FakePlayerHelpers.getThirdClasses:()Ljava/util/List;
    #8 = Class              #10           // ext/mods/fakeplayer/helper/FakePlayerHelpers
    #9 = NameAndType        #11:#12       // getThirdClasses:()Ljava/util/List;
   #10 = Utf8               ext/mods/fakeplayer/helper/FakePlayerHelpers
   #11 = Utf8               getThirdClasses
   #12 = Utf8               ()Ljava/util/List;
   #13 = InterfaceMethodref #14.#15       // java/util/List.size:()I
   #14 = Class              #16           // java/util/List
   #15 = NameAndType        #17:#18       // size:()I
   #16 = Utf8               java/util/List
   #17 = Utf8               size
   #18 = Utf8               ()I
   #19 = Methodref          #20.#21       // ext/mods/commons/random/Rnd.get:(II)I
   #20 = Class              #22           // ext/mods/commons/random/Rnd
   #21 = NameAndType        #23:#24       // get:(II)I
   #22 = Utf8               ext/mods/commons/random/Rnd
   #23 = Utf8               get
   #24 = Utf8               (II)I
   #25 = InterfaceMethodref #14.#26       // java/util/List.get:(I)Ljava/lang/Object;
   #26 = NameAndType        #23:#27       // get:(I)Ljava/lang/Object;
   #27 = Utf8               (I)Ljava/lang/Object;
   #28 = Class              #29           // ext/mods/gameserver/enums/actors/ClassId
   #29 = Utf8               ext/mods/gameserver/enums/actors/ClassId
   #30 = Methodref          #31.#32       // ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
   #31 = Class              #33           // ext/mods/gameserver/data/xml/PlayerData
   #32 = NameAndType        #34:#35       // getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
   #33 = Utf8               ext/mods/gameserver/data/xml/PlayerData
   #34 = Utf8               getInstance
   #35 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerData;
   #36 = Methodref          #31.#37       // ext/mods/gameserver/data/xml/PlayerData.getTemplate:(Lext/mods/gameserver/enums/actors/ClassId;)Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #37 = NameAndType        #38:#39       // getTemplate:(Lext/mods/gameserver/enums/actors/ClassId;)Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #38 = Utf8               getTemplate
   #39 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #40 = Methodref          #41.#42       // ext/mods/gameserver/model/actor/template/PlayerTemplate.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
   #41 = Class              #43           // ext/mods/gameserver/model/actor/template/PlayerTemplate
   #42 = NameAndType        #44:#45       // getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
   #43 = Utf8               ext/mods/gameserver/model/actor/template/PlayerTemplate
   #44 = Utf8               getRace
   #45 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassRace;
   #46 = Methodref          #8.#47        // ext/mods/fakeplayer/helper/FakePlayerHelpers.getRandomAppearance:(Lext/mods/gameserver/enums/actors/ClassRace;)Lext/mods/gameserver/model/actor/container/player/Appearance;
   #47 = NameAndType        #48:#49       // getRandomAppearance:(Lext/mods/gameserver/enums/actors/ClassRace;)Lext/mods/gameserver/model/actor/container/player/Appearance;
   #48 = Utf8               getRandomAppearance
   #49 = Utf8               (Lext/mods/gameserver/enums/actors/ClassRace;)Lext/mods/gameserver/model/actor/container/player/Appearance;
   #50 = Methodref          #51.#52       // ext/mods/gameserver/model/actor/container/player/Appearance.getSex:()Lext/mods/gameserver/enums/actors/Sex;
   #51 = Class              #53           // ext/mods/gameserver/model/actor/container/player/Appearance
   #52 = NameAndType        #54:#55       // getSex:()Lext/mods/gameserver/enums/actors/Sex;
   #53 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
   #54 = Utf8               getSex
   #55 = Utf8               ()Lext/mods/gameserver/enums/actors/Sex;
   #56 = Methodref          #57.#58       // ext/mods/fakeplayer/FakePlayerNames.getUniqueName:(Lext/mods/gameserver/enums/actors/Sex;)Ljava/lang/String;
   #57 = Class              #59           // ext/mods/fakeplayer/FakePlayerNames
   #58 = NameAndType        #60:#61       // getUniqueName:(Lext/mods/gameserver/enums/actors/Sex;)Ljava/lang/String;
   #59 = Utf8               ext/mods/fakeplayer/FakePlayerNames
   #60 = Utf8               getUniqueName
   #61 = Utf8               (Lext/mods/gameserver/enums/actors/Sex;)Ljava/lang/String;
   #62 = Methodref          #63.#64       // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #63 = Class              #65           // ext/mods/gameserver/idfactory/IdFactory
   #64 = NameAndType        #34:#66       // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #65 = Utf8               ext/mods/gameserver/idfactory/IdFactory
   #66 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
   #67 = Methodref          #63.#68       // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
   #68 = NameAndType        #69:#18       // getNextId:()I
   #69 = Utf8               getNextId
   #70 = String             #71           // AutoPilot
   #71 = Utf8               AutoPilot
   #72 = Class              #73           // ext/mods/fakeplayer/FakePlayer
   #73 = Utf8               ext/mods/fakeplayer/FakePlayer
   #74 = Methodref          #72.#75       // ext/mods/fakeplayer/FakePlayer."<init>":(ILext/mods/gameserver/model/actor/template/PlayerTemplate;Ljava/lang/String;Lext/mods/gameserver/model/actor/container/player/Appearance;)V
   #75 = NameAndType        #5:#76        // "<init>":(ILext/mods/gameserver/model/actor/template/PlayerTemplate;Ljava/lang/String;Lext/mods/gameserver/model/actor/container/player/Appearance;)V
   #76 = Utf8               (ILext/mods/gameserver/model/actor/template/PlayerTemplate;Ljava/lang/String;Lext/mods/gameserver/model/actor/container/player/Appearance;)V
   #77 = Methodref          #72.#78       // ext/mods/fakeplayer/FakePlayer.setName:(Ljava/lang/String;)V
   #78 = NameAndType        #79:#80       // setName:(Ljava/lang/String;)V
   #79 = Utf8               setName
   #80 = Utf8               (Ljava/lang/String;)V
   #81 = Fieldref           #82.#83       // ext/mods/Config.DEFAULT_ACCESS_LEVEL:I
   #82 = Class              #84           // ext/mods/Config
   #83 = NameAndType        #85:#86       // DEFAULT_ACCESS_LEVEL:I
   #84 = Utf8               ext/mods/Config
   #85 = Utf8               DEFAULT_ACCESS_LEVEL
   #86 = Utf8               I
   #87 = Methodref          #72.#88       // ext/mods/fakeplayer/FakePlayer.setAccessLevel:(I)V
   #88 = NameAndType        #89:#90       // setAccessLevel:(I)V
   #89 = Utf8               setAccessLevel
   #90 = Utf8               (I)V
   #91 = Methodref          #72.#92       // ext/mods/fakeplayer/FakePlayer.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #92 = NameAndType        #93:#94       // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #93 = Utf8               getClassId
   #94 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
   #95 = Methodref          #72.#96       // ext/mods/fakeplayer/FakePlayer.setBaseClass:(Lext/mods/gameserver/enums/actors/ClassId;)V
   #96 = NameAndType        #97:#98       // setBaseClass:(Lext/mods/gameserver/enums/actors/ClassId;)V
   #97 = Utf8               setBaseClass
   #98 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)V
   #99 = Methodref          #8.#100       // ext/mods/fakeplayer/helper/FakePlayerHelpers.setLevel:(Lext/mods/fakeplayer/FakePlayer;I)V
  #100 = NameAndType        #101:#102     // setLevel:(Lext/mods/fakeplayer/FakePlayer;I)V
  #101 = Utf8               setLevel
  #102 = Utf8               (Lext/mods/fakeplayer/FakePlayer;I)V
  #103 = Methodref          #72.#104      // ext/mods/fakeplayer/FakePlayer.rewardSkills:()V
  #104 = NameAndType        #105:#6       // rewardSkills:()V
  #105 = Utf8               rewardSkills
  #106 = Methodref          #107.#108     // ext/mods/fakeplayer/EquipesManager.applyEquipment:(Lext/mods/gameserver/model/actor/Player;)V
  #107 = Class              #109          // ext/mods/fakeplayer/EquipesManager
  #108 = NameAndType        #110:#111     // applyEquipment:(Lext/mods/gameserver/model/actor/Player;)V
  #109 = Utf8               ext/mods/fakeplayer/EquipesManager
  #110 = Utf8               applyEquipment
  #111 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #112 = Methodref          #72.#113      // ext/mods/fakeplayer/FakePlayer.heal:()V
  #113 = NameAndType        #114:#6       // heal:()V
  #114 = Utf8               heal
  #115 = Fieldref           #116.#117     // ext/mods/gameserver/enums/actors/Sex.MALE:Lext/mods/gameserver/enums/actors/Sex;
  #116 = Class              #118          // ext/mods/gameserver/enums/actors/Sex
  #117 = NameAndType        #119:#120     // MALE:Lext/mods/gameserver/enums/actors/Sex;
  #118 = Utf8               ext/mods/gameserver/enums/actors/Sex
  #119 = Utf8               MALE
  #120 = Utf8               Lext/mods/gameserver/enums/actors/Sex;
  #121 = Fieldref           #116.#122     // ext/mods/gameserver/enums/actors/Sex.FEMALE:Lext/mods/gameserver/enums/actors/Sex;
  #122 = NameAndType        #123:#120     // FEMALE:Lext/mods/gameserver/enums/actors/Sex;
  #123 = Utf8               FEMALE
  #124 = Methodref          #51.#125      // ext/mods/gameserver/model/actor/container/player/Appearance."<init>":(BBBLext/mods/gameserver/enums/actors/Sex;)V
  #125 = NameAndType        #5:#126       // "<init>":(BBBLext/mods/gameserver/enums/actors/Sex;)V
  #126 = Utf8               (BBBLext/mods/gameserver/enums/actors/Sex;)V
  #127 = Methodref          #128.#129     // ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #128 = Class              #130          // ext/mods/gameserver/data/xml/PlayerLevelData
  #129 = NameAndType        #34:#131      // getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #130 = Utf8               ext/mods/gameserver/data/xml/PlayerLevelData
  #131 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #132 = Methodref          #128.#133     // ext/mods/gameserver/data/xml/PlayerLevelData.getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
  #133 = NameAndType        #134:#135     // getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
  #134 = Utf8               getPlayerLevel
  #135 = Utf8               (I)Lext/mods/gameserver/model/records/PlayerLevel;
  #136 = Methodref          #72.#137      // ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #137 = NameAndType        #138:#139     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #138 = Utf8               getStatus
  #139 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #140 = Methodref          #141.#142     // ext/mods/gameserver/model/actor/status/PlayerStatus.getExp:()J
  #141 = Class              #143          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #142 = NameAndType        #144:#145     // getExp:()J
  #143 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #144 = Utf8               getExp
  #145 = Utf8               ()J
  #146 = Methodref          #147.#148     // ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
  #147 = Class              #149          // ext/mods/gameserver/model/records/PlayerLevel
  #148 = NameAndType        #150:#145     // requiredExpToLevelUp:()J
  #149 = Utf8               ext/mods/gameserver/model/records/PlayerLevel
  #150 = Utf8               requiredExpToLevelUp
  #151 = Methodref          #72.#152      // ext/mods/fakeplayer/FakePlayer.removeExpAndSp:(JI)V
  #152 = NameAndType        #153:#154     // removeExpAndSp:(JI)V
  #153 = Utf8               removeExpAndSp
  #154 = Utf8               (JI)V
  #155 = Methodref          #72.#156      // ext/mods/fakeplayer/FakePlayer.addExpAndSp:(JI)V
  #156 = NameAndType        #157:#154     // addExpAndSp:(JI)V
  #157 = Utf8               addExpAndSp
  #158 = Class              #159          // java/util/ArrayList
  #159 = Utf8               java/util/ArrayList
  #160 = Methodref          #158.#3       // java/util/ArrayList."<init>":()V
  #161 = Fieldref           #28.#162      // ext/mods/gameserver/enums/actors/ClassId.SAGGITARIUS:Lext/mods/gameserver/enums/actors/ClassId;
  #162 = NameAndType        #163:#164     // SAGGITARIUS:Lext/mods/gameserver/enums/actors/ClassId;
  #163 = Utf8               SAGGITARIUS
  #164 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #165 = InterfaceMethodref #14.#166      // java/util/List.add:(Ljava/lang/Object;)Z
  #166 = NameAndType        #167:#168     // add:(Ljava/lang/Object;)Z
  #167 = Utf8               add
  #168 = Utf8               (Ljava/lang/Object;)Z
  #169 = Fieldref           #28.#170      // ext/mods/gameserver/enums/actors/ClassId.ARCHMAGE:Lext/mods/gameserver/enums/actors/ClassId;
  #170 = NameAndType        #171:#164     // ARCHMAGE:Lext/mods/gameserver/enums/actors/ClassId;
  #171 = Utf8               ARCHMAGE
  #172 = Fieldref           #28.#173      // ext/mods/gameserver/enums/actors/ClassId.SOULTAKER:Lext/mods/gameserver/enums/actors/ClassId;
  #173 = NameAndType        #174:#164     // SOULTAKER:Lext/mods/gameserver/enums/actors/ClassId;
  #174 = Utf8               SOULTAKER
  #175 = Fieldref           #28.#176      // ext/mods/gameserver/enums/actors/ClassId.MYSTIC_MUSE:Lext/mods/gameserver/enums/actors/ClassId;
  #176 = NameAndType        #177:#164     // MYSTIC_MUSE:Lext/mods/gameserver/enums/actors/ClassId;
  #177 = Utf8               MYSTIC_MUSE
  #178 = Fieldref           #28.#179      // ext/mods/gameserver/enums/actors/ClassId.STORM_SCREAMER:Lext/mods/gameserver/enums/actors/ClassId;
  #179 = NameAndType        #180:#164     // STORM_SCREAMER:Lext/mods/gameserver/enums/actors/ClassId;
  #180 = Utf8               STORM_SCREAMER
  #181 = Fieldref           #28.#182      // ext/mods/gameserver/enums/actors/ClassId.MOONLIGHT_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
  #182 = NameAndType        #183:#164     // MOONLIGHT_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
  #183 = Utf8               MOONLIGHT_SENTINEL
  #184 = Fieldref           #28.#185      // ext/mods/gameserver/enums/actors/ClassId.GHOST_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
  #185 = NameAndType        #186:#164     // GHOST_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
  #186 = Utf8               GHOST_SENTINEL
  #187 = Fieldref           #28.#188      // ext/mods/gameserver/enums/actors/ClassId.ADVENTURER:Lext/mods/gameserver/enums/actors/ClassId;
  #188 = NameAndType        #189:#164     // ADVENTURER:Lext/mods/gameserver/enums/actors/ClassId;
  #189 = Utf8               ADVENTURER
  #190 = Fieldref           #28.#191      // ext/mods/gameserver/enums/actors/ClassId.WIND_RIDER:Lext/mods/gameserver/enums/actors/ClassId;
  #191 = NameAndType        #192:#164     // WIND_RIDER:Lext/mods/gameserver/enums/actors/ClassId;
  #192 = Utf8               WIND_RIDER
  #193 = Fieldref           #28.#194      // ext/mods/gameserver/enums/actors/ClassId.DOMINATOR:Lext/mods/gameserver/enums/actors/ClassId;
  #194 = NameAndType        #195:#164     // DOMINATOR:Lext/mods/gameserver/enums/actors/ClassId;
  #195 = Utf8               DOMINATOR
  #196 = Fieldref           #28.#197      // ext/mods/gameserver/enums/actors/ClassId.TITAN:Lext/mods/gameserver/enums/actors/ClassId;
  #197 = NameAndType        #198:#164     // TITAN:Lext/mods/gameserver/enums/actors/ClassId;
  #198 = Utf8               TITAN
  #199 = Fieldref           #28.#200      // ext/mods/gameserver/enums/actors/ClassId.CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
  #200 = NameAndType        #201:#164     // CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
  #201 = Utf8               CARDINAL
  #202 = Fieldref           #28.#203      // ext/mods/gameserver/enums/actors/ClassId.DUELIST:Lext/mods/gameserver/enums/actors/ClassId;
  #203 = NameAndType        #204:#164     // DUELIST:Lext/mods/gameserver/enums/actors/ClassId;
  #204 = Utf8               DUELIST
  #205 = Fieldref           #28.#206      // ext/mods/gameserver/enums/actors/ClassId.GRAND_KHAVATARI:Lext/mods/gameserver/enums/actors/ClassId;
  #206 = NameAndType        #207:#164     // GRAND_KHAVATARI:Lext/mods/gameserver/enums/actors/ClassId;
  #207 = Utf8               GRAND_KHAVATARI
  #208 = Fieldref           #28.#209      // ext/mods/gameserver/enums/actors/ClassId.DREADNOUGHT:Lext/mods/gameserver/enums/actors/ClassId;
  #209 = NameAndType        #210:#164     // DREADNOUGHT:Lext/mods/gameserver/enums/actors/ClassId;
  #210 = Utf8               DREADNOUGHT
  #211 = Fieldref           #28.#212      // ext/mods/gameserver/enums/actors/ClassId.MAESTRO:Lext/mods/gameserver/enums/actors/ClassId;
  #212 = NameAndType        #213:#164     // MAESTRO:Lext/mods/gameserver/enums/actors/ClassId;
  #213 = Utf8               MAESTRO
  #214 = Class              #215          // java/util/HashMap
  #215 = Utf8               java/util/HashMap
  #216 = Methodref          #214.#3       // java/util/HashMap."<init>":()V
  #217 = Class              #218          // ext/mods/fakeplayer/thirdclasses/CardinalAI
  #218 = Utf8               ext/mods/fakeplayer/thirdclasses/CardinalAI
  #219 = InterfaceMethodref #220.#221     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #220 = Class              #222          // java/util/Map
  #221 = NameAndType        #223:#224     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #222 = Utf8               java/util/Map
  #223 = Utf8               put
  #224 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #225 = Class              #226          // ext/mods/fakeplayer/thirdclasses/StormScreamerAI
  #226 = Utf8               ext/mods/fakeplayer/thirdclasses/StormScreamerAI
  #227 = Class              #228          // ext/mods/fakeplayer/thirdclasses/MysticMuseAI
  #228 = Utf8               ext/mods/fakeplayer/thirdclasses/MysticMuseAI
  #229 = Class              #230          // ext/mods/fakeplayer/thirdclasses/ArchmageAI
  #230 = Utf8               ext/mods/fakeplayer/thirdclasses/ArchmageAI
  #231 = Class              #232          // ext/mods/fakeplayer/thirdclasses/SoultakerAI
  #232 = Utf8               ext/mods/fakeplayer/thirdclasses/SoultakerAI
  #233 = Class              #234          // ext/mods/fakeplayer/thirdclasses/SaggitariusAI
  #234 = Utf8               ext/mods/fakeplayer/thirdclasses/SaggitariusAI
  #235 = Class              #236          // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI
  #236 = Utf8               ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI
  #237 = Class              #238          // ext/mods/fakeplayer/thirdclasses/GhostSentinelAI
  #238 = Utf8               ext/mods/fakeplayer/thirdclasses/GhostSentinelAI
  #239 = Class              #240          // ext/mods/fakeplayer/thirdclasses/AdventurerAI
  #240 = Utf8               ext/mods/fakeplayer/thirdclasses/AdventurerAI
  #241 = Class              #242          // ext/mods/fakeplayer/thirdclasses/WindRiderAI
  #242 = Utf8               ext/mods/fakeplayer/thirdclasses/WindRiderAI
  #243 = Fieldref           #28.#244      // ext/mods/gameserver/enums/actors/ClassId.GHOST_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
  #244 = NameAndType        #245:#164     // GHOST_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
  #245 = Utf8               GHOST_HUNTER
  #246 = Class              #247          // ext/mods/fakeplayer/thirdclasses/GhostHunterAI
  #247 = Utf8               ext/mods/fakeplayer/thirdclasses/GhostHunterAI
  #248 = Class              #249          // ext/mods/fakeplayer/thirdclasses/DominatorAI
  #249 = Utf8               ext/mods/fakeplayer/thirdclasses/DominatorAI
  #250 = Class              #251          // ext/mods/fakeplayer/thirdclasses/TitanAI
  #251 = Utf8               ext/mods/fakeplayer/thirdclasses/TitanAI
  #252 = Class              #253          // ext/mods/fakeplayer/thirdclasses/DuelistAI
  #253 = Utf8               ext/mods/fakeplayer/thirdclasses/DuelistAI
  #254 = Class              #255          // ext/mods/fakeplayer/thirdclasses/GrandKhavatariAI
  #255 = Utf8               ext/mods/fakeplayer/thirdclasses/GrandKhavatariAI
  #256 = Class              #257          // ext/mods/fakeplayer/thirdclasses/DreadnoughtAI
  #257 = Utf8               ext/mods/fakeplayer/thirdclasses/DreadnoughtAI
  #258 = Class              #259          // ext/mods/fakeplayer/thirdclasses/MaestroAI
  #259 = Utf8               ext/mods/fakeplayer/thirdclasses/MaestroAI
  #260 = Methodref          #8.#261       // ext/mods/fakeplayer/helper/FakePlayerHelpers.getAllAIs:()Ljava/util/Map;
  #261 = NameAndType        #262:#263     // getAllAIs:()Ljava/util/Map;
  #262 = Utf8               getAllAIs
  #263 = Utf8               ()Ljava/util/Map;
  #264 = InterfaceMethodref #220.#265     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #265 = NameAndType        #23:#266      // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #266 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #267 = Class              #268          // java/lang/Class
  #268 = Utf8               java/lang/Class
  #269 = Class              #270          // ext/mods/fakeplayer/ai/FallbackAI
  #270 = Utf8               ext/mods/fakeplayer/ai/FallbackAI
  #271 = Class              #272          // ext/mods/gameserver/model/actor/Creature
  #272 = Utf8               ext/mods/gameserver/model/actor/Creature
  #273 = Class              #274          // "[I"
  #274 = Utf8               [I
  #275 = Utf8               Code
  #276 = Utf8               LineNumberTable
  #277 = Utf8               LocalVariableTable
  #278 = Utf8               this
  #279 = Utf8               Lext/mods/fakeplayer/helper/FakePlayerHelpers;
  #280 = Utf8               createRandomFakePlayer
  #281 = Utf8               ()Lext/mods/fakeplayer/FakePlayer;
  #282 = Utf8               classId
  #283 = Utf8               template
  #284 = Utf8               Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #285 = Utf8               app
  #286 = Utf8               Lext/mods/gameserver/model/actor/container/player/Appearance;
  #287 = Utf8               playerName
  #288 = Utf8               Ljava/lang/String;
  #289 = Utf8               objectId
  #290 = Utf8               accountName
  #291 = Utf8               player
  #292 = Utf8               Lext/mods/fakeplayer/FakePlayer;
  #293 = Utf8               StackMapTable
  #294 = Class              #295          // java/lang/String
  #295 = Utf8               java/lang/String
  #296 = Utf8               race
  #297 = Utf8               Lext/mods/gameserver/enums/actors/ClassRace;
  #298 = Utf8               randomSex
  #299 = Utf8               hairStyle
  #300 = Utf8               hairColor
  #301 = Utf8               faceId
  #302 = Class              #303          // ext/mods/gameserver/enums/actors/ClassRace
  #303 = Utf8               ext/mods/gameserver/enums/actors/ClassRace
  #304 = Utf8               level
  #305 = Utf8               pl
  #306 = Utf8               Lext/mods/gameserver/model/records/PlayerLevel;
  #307 = Utf8               pXp
  #308 = Utf8               J
  #309 = Utf8               tXp
  #310 = Utf8               classes
  #311 = Utf8               Ljava/util/List;
  #312 = Utf8               LocalVariableTypeTable
  #313 = Utf8               Ljava/util/List<Lext/mods/gameserver/enums/actors/ClassId;>;
  #314 = Utf8               Signature
  #315 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/enums/actors/ClassId;>;
  #316 = Utf8               ais
  #317 = Utf8               Ljava/util/Map;
  #318 = Utf8               Ljava/util/Map<Lext/mods/gameserver/enums/actors/ClassId;Ljava/lang/Class<+Lext/mods/fakeplayer/ai/FakePlayerAI;>;>;
  #319 = Utf8               ()Ljava/util/Map<Lext/mods/gameserver/enums/actors/ClassId;Ljava/lang/Class<+Lext/mods/fakeplayer/ai/FakePlayerAI;>;>;
  #320 = Utf8               getAIbyClassId
  #321 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Ljava/lang/Class;
  #322 = Utf8               ai
  #323 = Utf8               Ljava/lang/Class;
  #324 = Utf8               Ljava/lang/Class<+Lext/mods/fakeplayer/ai/FakePlayerAI;>;
  #325 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Ljava/lang/Class<+Lext/mods/fakeplayer/ai/FakePlayerAI;>;
  #326 = Utf8               getTargetClass
  #327 = Utf8               ()Ljava/lang/Class;
  #328 = Utf8               ()Ljava/lang/Class<+Lext/mods/gameserver/model/actor/Creature;>;
  #329 = Utf8               getTargetRange
  #330 = Utf8               getFighterBuffs
  #331 = Utf8               ()[[I
  #332 = Utf8               getMageBuffs
  #333 = Utf8               SourceFile
  #334 = Utf8               FakePlayerHelpers.java
{
  public ext.mods.fakeplayer.helper.FakePlayerHelpers();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/helper/FakePlayerHelpers;

  public static ext.mods.fakeplayer.FakePlayer createRandomFakePlayer();
    descriptor: ()Lext/mods/fakeplayer/FakePlayer;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=7, args_size=0
         0: invokestatic  #7                  // Method getThirdClasses:()Ljava/util/List;
         3: iconst_0
         4: invokestatic  #7                  // Method getThirdClasses:()Ljava/util/List;
         7: invokeinterface #13,  1           // InterfaceMethod java/util/List.size:()I
        12: iconst_1
        13: isub
        14: invokestatic  #19                 // Method ext/mods/commons/random/Rnd.get:(II)I
        17: invokeinterface #25,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        22: checkcast     #28                 // class ext/mods/gameserver/enums/actors/ClassId
        25: astore_0
        26: invokestatic  #30                 // Method ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
        29: aload_0
        30: invokevirtual #36                 // Method ext/mods/gameserver/data/xml/PlayerData.getTemplate:(Lext/mods/gameserver/enums/actors/ClassId;)Lext/mods/gameserver/model/actor/template/PlayerTemplate;
        33: astore_1
        34: aload_1
        35: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        38: invokestatic  #46                 // Method getRandomAppearance:(Lext/mods/gameserver/enums/actors/ClassRace;)Lext/mods/gameserver/model/actor/container/player/Appearance;
        41: astore_2
        42: aload_2
        43: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/container/player/Appearance.getSex:()Lext/mods/gameserver/enums/actors/Sex;
        46: invokestatic  #56                 // Method ext/mods/fakeplayer/FakePlayerNames.getUniqueName:(Lext/mods/gameserver/enums/actors/Sex;)Ljava/lang/String;
        49: astore_3
        50: aload_3
        51: ifnonnull     56
        54: aconst_null
        55: areturn
        56: invokestatic  #62                 // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        59: invokevirtual #67                 // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        62: istore        4
        64: ldc           #70                 // String AutoPilot
        66: astore        5
        68: new           #72                 // class ext/mods/fakeplayer/FakePlayer
        71: dup
        72: iload         4
        74: aload_1
        75: aload         5
        77: aload_2
        78: invokespecial #74                 // Method ext/mods/fakeplayer/FakePlayer."<init>":(ILext/mods/gameserver/model/actor/template/PlayerTemplate;Ljava/lang/String;Lext/mods/gameserver/model/actor/container/player/Appearance;)V
        81: astore        6
        83: aload         6
        85: aload_3
        86: invokevirtual #77                 // Method ext/mods/fakeplayer/FakePlayer.setName:(Ljava/lang/String;)V
        89: aload         6
        91: getstatic     #81                 // Field ext/mods/Config.DEFAULT_ACCESS_LEVEL:I
        94: invokevirtual #87                 // Method ext/mods/fakeplayer/FakePlayer.setAccessLevel:(I)V
        97: aload         6
        99: aload         6
       101: invokevirtual #91                 // Method ext/mods/fakeplayer/FakePlayer.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       104: invokevirtual #95                 // Method ext/mods/fakeplayer/FakePlayer.setBaseClass:(Lext/mods/gameserver/enums/actors/ClassId;)V
       107: aload         6
       109: bipush        81
       111: invokestatic  #99                 // Method setLevel:(Lext/mods/fakeplayer/FakePlayer;I)V
       114: aload         6
       116: invokevirtual #103                // Method ext/mods/fakeplayer/FakePlayer.rewardSkills:()V
       119: aload         6
       121: invokestatic  #106                // Method ext/mods/fakeplayer/EquipesManager.applyEquipment:(Lext/mods/gameserver/model/actor/Player;)V
       124: aload         6
       126: invokevirtual #112                // Method ext/mods/fakeplayer/FakePlayer.heal:()V
       129: aload         6
       131: areturn
      LineNumberTable:
        line 66: 0
        line 67: 26
        line 68: 34
        line 69: 42
        line 71: 50
        line 72: 54
        line 74: 56
        line 75: 64
        line 77: 68
        line 78: 83
        line 80: 89
        line 81: 97
        line 82: 107
        line 83: 114
        line 84: 119
        line 85: 124
        line 87: 129
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26     106     0 classId   Lext/mods/gameserver/enums/actors/ClassId;
           34      98     1 template   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
           42      90     2   app   Lext/mods/gameserver/model/actor/container/player/Appearance;
           50      82     3 playerName   Ljava/lang/String;
           64      68     4 objectId   I
           68      64     5 accountName   Ljava/lang/String;
           83      49     6 player   Lext/mods/fakeplayer/FakePlayer;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/enums/actors/ClassId, class ext/mods/gameserver/model/actor/template/PlayerTemplate, class ext/mods/gameserver/model/actor/container/player/Appearance, class java/lang/String ]
          stack = []

  public static ext.mods.gameserver.model.actor.container.player.Appearance getRandomAppearance(ext.mods.gameserver.enums.actors.ClassRace);
    descriptor: (Lext/mods/gameserver/enums/actors/ClassRace;)Lext/mods/gameserver/model/actor/container/player/Appearance;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=5, args_size=1
         0: iconst_1
         1: iconst_2
         2: invokestatic  #19                 // Method ext/mods/commons/random/Rnd.get:(II)I
         5: iconst_1
         6: if_icmpne     15
         9: getstatic     #115                // Field ext/mods/gameserver/enums/actors/Sex.MALE:Lext/mods/gameserver/enums/actors/Sex;
        12: goto          18
        15: getstatic     #121                // Field ext/mods/gameserver/enums/actors/Sex.FEMALE:Lext/mods/gameserver/enums/actors/Sex;
        18: astore_1
        19: iconst_0
        20: aload_1
        21: getstatic     #115                // Field ext/mods/gameserver/enums/actors/Sex.MALE:Lext/mods/gameserver/enums/actors/Sex;
        24: if_acmpne     31
        27: iconst_4
        28: goto          33
        31: bipush        6
        33: invokestatic  #19                 // Method ext/mods/commons/random/Rnd.get:(II)I
        36: istore_2
        37: iconst_0
        38: iconst_3
        39: invokestatic  #19                 // Method ext/mods/commons/random/Rnd.get:(II)I
        42: istore_3
        43: iconst_0
        44: iconst_2
        45: invokestatic  #19                 // Method ext/mods/commons/random/Rnd.get:(II)I
        48: istore        4
        50: new           #51                 // class ext/mods/gameserver/model/actor/container/player/Appearance
        53: dup
        54: iload         4
        56: i2b
        57: iload_3
        58: i2b
        59: iload_2
        60: i2b
        61: aload_1
        62: invokespecial #124                // Method ext/mods/gameserver/model/actor/container/player/Appearance."<init>":(BBBLext/mods/gameserver/enums/actors/Sex;)V
        65: areturn
      LineNumberTable:
        line 93: 0
        line 94: 19
        line 95: 37
        line 96: 43
        line 98: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      66     0  race   Lext/mods/gameserver/enums/actors/ClassRace;
           19      47     1 randomSex   Lext/mods/gameserver/enums/actors/Sex;
           37      29     2 hairStyle   I
           43      23     3 hairColor   I
           50      16     4 faceId   I
      StackMapTable: number_of_entries = 4
        frame_type = 15 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/actors/Sex ]
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/enums/actors/ClassRace, class ext/mods/gameserver/enums/actors/Sex ]
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/enums/actors/ClassRace, class ext/mods/gameserver/enums/actors/Sex ]
          stack = [ int, int ]

  public static void setLevel(ext.mods.fakeplayer.FakePlayer, int);
    descriptor: (Lext/mods/fakeplayer/FakePlayer;I)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=7, args_size=2
         0: invokestatic  #127                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
         3: iload_1
         4: invokevirtual #132                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
         7: astore_2
         8: aload_0
         9: invokevirtual #136                // Method ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        12: invokevirtual #140                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getExp:()J
        15: lstore_3
        16: aload_2
        17: invokevirtual #146                // Method ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
        20: lstore        5
        22: lload_3
        23: lload         5
        25: lcmp
        26: ifle          41
        29: aload_0
        30: lload_3
        31: lload         5
        33: lsub
        34: iconst_0
        35: invokevirtual #151                // Method ext/mods/fakeplayer/FakePlayer.removeExpAndSp:(JI)V
        38: goto          57
        41: lload_3
        42: lload         5
        44: lcmp
        45: ifge          57
        48: aload_0
        49: lload         5
        51: lload_3
        52: lsub
        53: iconst_0
        54: invokevirtual #155                // Method ext/mods/fakeplayer/FakePlayer.addExpAndSp:(JI)V
        57: return
      LineNumberTable:
        line 104: 0
        line 106: 8
        line 107: 16
        line 109: 22
        line 110: 29
        line 111: 41
        line 112: 48
        line 114: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0 player   Lext/mods/fakeplayer/FakePlayer;
            0      58     1 level   I
            8      50     2    pl   Lext/mods/gameserver/model/records/PlayerLevel;
           16      42     3   pXp   J
           22      36     5   tXp   J
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/records/PlayerLevel, long, long ]
        frame_type = 15 /* same */

  public static java.util.List<ext.mods.gameserver.enums.actors.ClassId> getThirdClasses();
    descriptor: ()Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=0
         0: new           #158                // class java/util/ArrayList
         3: dup
         4: invokespecial #160                // Method java/util/ArrayList."<init>":()V
         7: astore_0
         8: aload_0
         9: getstatic     #161                // Field ext/mods/gameserver/enums/actors/ClassId.SAGGITARIUS:Lext/mods/gameserver/enums/actors/ClassId;
        12: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        17: pop
        18: aload_0
        19: getstatic     #169                // Field ext/mods/gameserver/enums/actors/ClassId.ARCHMAGE:Lext/mods/gameserver/enums/actors/ClassId;
        22: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        27: pop
        28: aload_0
        29: getstatic     #172                // Field ext/mods/gameserver/enums/actors/ClassId.SOULTAKER:Lext/mods/gameserver/enums/actors/ClassId;
        32: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        37: pop
        38: aload_0
        39: getstatic     #175                // Field ext/mods/gameserver/enums/actors/ClassId.MYSTIC_MUSE:Lext/mods/gameserver/enums/actors/ClassId;
        42: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        47: pop
        48: aload_0
        49: getstatic     #178                // Field ext/mods/gameserver/enums/actors/ClassId.STORM_SCREAMER:Lext/mods/gameserver/enums/actors/ClassId;
        52: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        57: pop
        58: aload_0
        59: getstatic     #181                // Field ext/mods/gameserver/enums/actors/ClassId.MOONLIGHT_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
        62: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        67: pop
        68: aload_0
        69: getstatic     #184                // Field ext/mods/gameserver/enums/actors/ClassId.GHOST_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
        72: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        77: pop
        78: aload_0
        79: getstatic     #187                // Field ext/mods/gameserver/enums/actors/ClassId.ADVENTURER:Lext/mods/gameserver/enums/actors/ClassId;
        82: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        87: pop
        88: aload_0
        89: getstatic     #190                // Field ext/mods/gameserver/enums/actors/ClassId.WIND_RIDER:Lext/mods/gameserver/enums/actors/ClassId;
        92: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        97: pop
        98: aload_0
        99: getstatic     #193                // Field ext/mods/gameserver/enums/actors/ClassId.DOMINATOR:Lext/mods/gameserver/enums/actors/ClassId;
       102: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       107: pop
       108: aload_0
       109: getstatic     #196                // Field ext/mods/gameserver/enums/actors/ClassId.TITAN:Lext/mods/gameserver/enums/actors/ClassId;
       112: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       117: pop
       118: aload_0
       119: getstatic     #199                // Field ext/mods/gameserver/enums/actors/ClassId.CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
       122: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       127: pop
       128: aload_0
       129: getstatic     #202                // Field ext/mods/gameserver/enums/actors/ClassId.DUELIST:Lext/mods/gameserver/enums/actors/ClassId;
       132: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       137: pop
       138: aload_0
       139: getstatic     #205                // Field ext/mods/gameserver/enums/actors/ClassId.GRAND_KHAVATARI:Lext/mods/gameserver/enums/actors/ClassId;
       142: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       147: pop
       148: aload_0
       149: getstatic     #208                // Field ext/mods/gameserver/enums/actors/ClassId.DREADNOUGHT:Lext/mods/gameserver/enums/actors/ClassId;
       152: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       157: pop
       158: aload_0
       159: getstatic     #211                // Field ext/mods/gameserver/enums/actors/ClassId.MAESTRO:Lext/mods/gameserver/enums/actors/ClassId;
       162: invokeinterface #165,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       167: pop
       168: aload_0
       169: areturn
      LineNumberTable:
        line 118: 0
        line 120: 8
        line 121: 18
        line 122: 28
        line 123: 38
        line 124: 48
        line 125: 58
        line 126: 68
        line 127: 78
        line 128: 88
        line 129: 98
        line 130: 108
        line 131: 118
        line 132: 128
        line 133: 138
        line 134: 148
        line 135: 158
        line 137: 168
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8     162     0 classes   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     162     0 classes   Ljava/util/List<Lext/mods/gameserver/enums/actors/ClassId;>;
    Signature: #315                         // ()Ljava/util/List<Lext/mods/gameserver/enums/actors/ClassId;>;

  public static java.util.Map<ext.mods.gameserver.enums.actors.ClassId, java.lang.Class<? extends ext.mods.fakeplayer.ai.FakePlayerAI>> getAllAIs();
    descriptor: ()Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: new           #214                // class java/util/HashMap
         3: dup
         4: invokespecial #216                // Method java/util/HashMap."<init>":()V
         7: astore_0
         8: aload_0
         9: getstatic     #199                // Field ext/mods/gameserver/enums/actors/ClassId.CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
        12: ldc           #217                // class ext/mods/fakeplayer/thirdclasses/CardinalAI
        14: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        19: pop
        20: aload_0
        21: getstatic     #178                // Field ext/mods/gameserver/enums/actors/ClassId.STORM_SCREAMER:Lext/mods/gameserver/enums/actors/ClassId;
        24: ldc           #225                // class ext/mods/fakeplayer/thirdclasses/StormScreamerAI
        26: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        31: pop
        32: aload_0
        33: getstatic     #175                // Field ext/mods/gameserver/enums/actors/ClassId.MYSTIC_MUSE:Lext/mods/gameserver/enums/actors/ClassId;
        36: ldc           #227                // class ext/mods/fakeplayer/thirdclasses/MysticMuseAI
        38: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        43: pop
        44: aload_0
        45: getstatic     #169                // Field ext/mods/gameserver/enums/actors/ClassId.ARCHMAGE:Lext/mods/gameserver/enums/actors/ClassId;
        48: ldc           #229                // class ext/mods/fakeplayer/thirdclasses/ArchmageAI
        50: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        55: pop
        56: aload_0
        57: getstatic     #172                // Field ext/mods/gameserver/enums/actors/ClassId.SOULTAKER:Lext/mods/gameserver/enums/actors/ClassId;
        60: ldc           #231                // class ext/mods/fakeplayer/thirdclasses/SoultakerAI
        62: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        67: pop
        68: aload_0
        69: getstatic     #161                // Field ext/mods/gameserver/enums/actors/ClassId.SAGGITARIUS:Lext/mods/gameserver/enums/actors/ClassId;
        72: ldc           #233                // class ext/mods/fakeplayer/thirdclasses/SaggitariusAI
        74: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        79: pop
        80: aload_0
        81: getstatic     #181                // Field ext/mods/gameserver/enums/actors/ClassId.MOONLIGHT_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
        84: ldc           #235                // class ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI
        86: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        91: pop
        92: aload_0
        93: getstatic     #184                // Field ext/mods/gameserver/enums/actors/ClassId.GHOST_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
        96: ldc           #237                // class ext/mods/fakeplayer/thirdclasses/GhostSentinelAI
        98: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       103: pop
       104: aload_0
       105: getstatic     #187                // Field ext/mods/gameserver/enums/actors/ClassId.ADVENTURER:Lext/mods/gameserver/enums/actors/ClassId;
       108: ldc           #239                // class ext/mods/fakeplayer/thirdclasses/AdventurerAI
       110: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       115: pop
       116: aload_0
       117: getstatic     #190                // Field ext/mods/gameserver/enums/actors/ClassId.WIND_RIDER:Lext/mods/gameserver/enums/actors/ClassId;
       120: ldc           #241                // class ext/mods/fakeplayer/thirdclasses/WindRiderAI
       122: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       127: pop
       128: aload_0
       129: getstatic     #243                // Field ext/mods/gameserver/enums/actors/ClassId.GHOST_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
       132: ldc           #246                // class ext/mods/fakeplayer/thirdclasses/GhostHunterAI
       134: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       139: pop
       140: aload_0
       141: getstatic     #193                // Field ext/mods/gameserver/enums/actors/ClassId.DOMINATOR:Lext/mods/gameserver/enums/actors/ClassId;
       144: ldc           #248                // class ext/mods/fakeplayer/thirdclasses/DominatorAI
       146: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       151: pop
       152: aload_0
       153: getstatic     #196                // Field ext/mods/gameserver/enums/actors/ClassId.TITAN:Lext/mods/gameserver/enums/actors/ClassId;
       156: ldc           #250                // class ext/mods/fakeplayer/thirdclasses/TitanAI
       158: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       163: pop
       164: aload_0
       165: getstatic     #202                // Field ext/mods/gameserver/enums/actors/ClassId.DUELIST:Lext/mods/gameserver/enums/actors/ClassId;
       168: ldc           #252                // class ext/mods/fakeplayer/thirdclasses/DuelistAI
       170: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       175: pop
       176: aload_0
       177: getstatic     #205                // Field ext/mods/gameserver/enums/actors/ClassId.GRAND_KHAVATARI:Lext/mods/gameserver/enums/actors/ClassId;
       180: ldc           #254                // class ext/mods/fakeplayer/thirdclasses/GrandKhavatariAI
       182: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       187: pop
       188: aload_0
       189: getstatic     #208                // Field ext/mods/gameserver/enums/actors/ClassId.DREADNOUGHT:Lext/mods/gameserver/enums/actors/ClassId;
       192: ldc_w         #256                // class ext/mods/fakeplayer/thirdclasses/DreadnoughtAI
       195: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       200: pop
       201: aload_0
       202: getstatic     #211                // Field ext/mods/gameserver/enums/actors/ClassId.MAESTRO:Lext/mods/gameserver/enums/actors/ClassId;
       205: ldc_w         #258                // class ext/mods/fakeplayer/thirdclasses/MaestroAI
       208: invokeinterface #219,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       213: pop
       214: aload_0
       215: areturn
      LineNumberTable:
        line 142: 0
        line 143: 8
        line 144: 20
        line 145: 32
        line 146: 44
        line 147: 56
        line 148: 68
        line 149: 80
        line 150: 92
        line 151: 104
        line 152: 116
        line 153: 128
        line 154: 140
        line 155: 152
        line 156: 164
        line 157: 176
        line 158: 188
        line 159: 201
        line 160: 214
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8     208     0   ais   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     208     0   ais   Ljava/util/Map<Lext/mods/gameserver/enums/actors/ClassId;Ljava/lang/Class<+Lext/mods/fakeplayer/ai/FakePlayerAI;>;>;
    Signature: #319                         // ()Ljava/util/Map<Lext/mods/gameserver/enums/actors/ClassId;Ljava/lang/Class<+Lext/mods/fakeplayer/ai/FakePlayerAI;>;>;

  public static java.lang.Class<? extends ext.mods.fakeplayer.ai.FakePlayerAI> getAIbyClassId(ext.mods.gameserver.enums.actors.ClassId);
    descriptor: (Lext/mods/gameserver/enums/actors/ClassId;)Ljava/lang/Class;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: invokestatic  #260                // Method getAllAIs:()Ljava/util/Map;
         3: aload_0
         4: invokeinterface #264,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         9: checkcast     #267                // class java/lang/Class
        12: astore_1
        13: aload_1
        14: ifnonnull     21
        17: ldc_w         #269                // class ext/mods/fakeplayer/ai/FallbackAI
        20: areturn
        21: aload_1
        22: areturn
      LineNumberTable:
        line 165: 0
        line 166: 13
        line 167: 17
        line 169: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0 classId   Lext/mods/gameserver/enums/actors/ClassId;
           13      10     1    ai   Ljava/lang/Class;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           13      10     1    ai   Ljava/lang/Class<+Lext/mods/fakeplayer/ai/FakePlayerAI;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/lang/Class ]
    Signature: #325                         // (Lext/mods/gameserver/enums/actors/ClassId;)Ljava/lang/Class<+Lext/mods/fakeplayer/ai/FakePlayerAI;>;

  public static java.lang.Class<? extends ext.mods.gameserver.model.actor.Creature> getTargetClass();
    descriptor: ()Ljava/lang/Class;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc_w         #271                // class ext/mods/gameserver/model/actor/Creature
         3: areturn
      LineNumberTable:
        line 174: 0
    Signature: #328                         // ()Ljava/lang/Class<+Lext/mods/gameserver/model/actor/Creature;>;

  public static int getTargetRange();
    descriptor: ()I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: sipush        5000
         3: ireturn
      LineNumberTable:
        line 179: 0

  public static int[][] getFighterBuffs();
    descriptor: ()[[I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=0, args_size=0
         0: bipush        21
         2: anewarray     #273                // class "[I"
         5: dup
         6: iconst_0
         7: iconst_2
         8: newarray       int
        10: dup
        11: iconst_0
        12: sipush        1204
        15: iastore
        16: dup
        17: iconst_1
        18: iconst_2
        19: iastore
        20: aastore
        21: dup
        22: iconst_1
        23: iconst_2
        24: newarray       int
        26: dup
        27: iconst_0
        28: sipush        1040
        31: iastore
        32: dup
        33: iconst_1
        34: iconst_3
        35: iastore
        36: aastore
        37: dup
        38: iconst_2
        39: iconst_2
        40: newarray       int
        42: dup
        43: iconst_0
        44: sipush        1035
        47: iastore
        48: dup
        49: iconst_1
        50: iconst_4
        51: iastore
        52: aastore
        53: dup
        54: iconst_3
        55: iconst_2
        56: newarray       int
        58: dup
        59: iconst_0
        60: sipush        1045
        63: iastore
        64: dup
        65: iconst_1
        66: bipush        6
        68: iastore
        69: aastore
        70: dup
        71: iconst_4
        72: iconst_2
        73: newarray       int
        75: dup
        76: iconst_0
        77: sipush        1068
        80: iastore
        81: dup
        82: iconst_1
        83: iconst_3
        84: iastore
        85: aastore
        86: dup
        87: iconst_5
        88: iconst_2
        89: newarray       int
        91: dup
        92: iconst_0
        93: sipush        1062
        96: iastore
        97: dup
        98: iconst_1
        99: iconst_2
       100: iastore
       101: aastore
       102: dup
       103: bipush        6
       105: iconst_2
       106: newarray       int
       108: dup
       109: iconst_0
       110: sipush        1086
       113: iastore
       114: dup
       115: iconst_1
       116: iconst_2
       117: iastore
       118: aastore
       119: dup
       120: bipush        7
       122: iconst_2
       123: newarray       int
       125: dup
       126: iconst_0
       127: sipush        1077
       130: iastore
       131: dup
       132: iconst_1
       133: iconst_3
       134: iastore
       135: aastore
       136: dup
       137: bipush        8
       139: iconst_2
       140: newarray       int
       142: dup
       143: iconst_0
       144: sipush        1388
       147: iastore
       148: dup
       149: iconst_1
       150: iconst_3
       151: iastore
       152: aastore
       153: dup
       154: bipush        9
       156: iconst_2
       157: newarray       int
       159: dup
       160: iconst_0
       161: sipush        1036
       164: iastore
       165: dup
       166: iconst_1
       167: iconst_2
       168: iastore
       169: aastore
       170: dup
       171: bipush        10
       173: iconst_2
       174: newarray       int
       176: dup
       177: iconst_0
       178: sipush        274
       181: iastore
       182: dup
       183: iconst_1
       184: iconst_1
       185: iastore
       186: aastore
       187: dup
       188: bipush        11
       190: iconst_2
       191: newarray       int
       193: dup
       194: iconst_0
       195: sipush        273
       198: iastore
       199: dup
       200: iconst_1
       201: iconst_1
       202: iastore
       203: aastore
       204: dup
       205: bipush        12
       207: iconst_2
       208: newarray       int
       210: dup
       211: iconst_0
       212: sipush        268
       215: iastore
       216: dup
       217: iconst_1
       218: iconst_1
       219: iastore
       220: aastore
       221: dup
       222: bipush        13
       224: iconst_2
       225: newarray       int
       227: dup
       228: iconst_0
       229: sipush        271
       232: iastore
       233: dup
       234: iconst_1
       235: iconst_1
       236: iastore
       237: aastore
       238: dup
       239: bipush        14
       241: iconst_2
       242: newarray       int
       244: dup
       245: iconst_0
       246: sipush        267
       249: iastore
       250: dup
       251: iconst_1
       252: iconst_1
       253: iastore
       254: aastore
       255: dup
       256: bipush        15
       258: iconst_2
       259: newarray       int
       261: dup
       262: iconst_0
       263: sipush        349
       266: iastore
       267: dup
       268: iconst_1
       269: iconst_1
       270: iastore
       271: aastore
       272: dup
       273: bipush        16
       275: iconst_2
       276: newarray       int
       278: dup
       279: iconst_0
       280: sipush        264
       283: iastore
       284: dup
       285: iconst_1
       286: iconst_1
       287: iastore
       288: aastore
       289: dup
       290: bipush        17
       292: iconst_2
       293: newarray       int
       295: dup
       296: iconst_0
       297: sipush        269
       300: iastore
       301: dup
       302: iconst_1
       303: iconst_1
       304: iastore
       305: aastore
       306: dup
       307: bipush        18
       309: iconst_2
       310: newarray       int
       312: dup
       313: iconst_0
       314: sipush        364
       317: iastore
       318: dup
       319: iconst_1
       320: iconst_1
       321: iastore
       322: aastore
       323: dup
       324: bipush        19
       326: iconst_2
       327: newarray       int
       329: dup
       330: iconst_0
       331: sipush        1363
       334: iastore
       335: dup
       336: iconst_1
       337: iconst_1
       338: iastore
       339: aastore
       340: dup
       341: bipush        20
       343: iconst_2
       344: newarray       int
       346: dup
       347: iconst_0
       348: sipush        4699
       351: iastore
       352: dup
       353: iconst_1
       354: iconst_5
       355: iastore
       356: aastore
       357: areturn
      LineNumberTable:
        line 184: 0

  public static int[][] getMageBuffs();
    descriptor: ()[[I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=0, args_size=0
         0: bipush        20
         2: anewarray     #273                // class "[I"
         5: dup
         6: iconst_0
         7: iconst_2
         8: newarray       int
        10: dup
        11: iconst_0
        12: sipush        1204
        15: iastore
        16: dup
        17: iconst_1
        18: iconst_2
        19: iastore
        20: aastore
        21: dup
        22: iconst_1
        23: iconst_2
        24: newarray       int
        26: dup
        27: iconst_0
        28: sipush        1040
        31: iastore
        32: dup
        33: iconst_1
        34: iconst_3
        35: iastore
        36: aastore
        37: dup
        38: iconst_2
        39: iconst_2
        40: newarray       int
        42: dup
        43: iconst_0
        44: sipush        1035
        47: iastore
        48: dup
        49: iconst_1
        50: iconst_4
        51: iastore
        52: aastore
        53: dup
        54: iconst_3
        55: iconst_2
        56: newarray       int
        58: dup
        59: iconst_0
        60: sipush        4351
        63: iastore
        64: dup
        65: iconst_1
        66: bipush        6
        68: iastore
        69: aastore
        70: dup
        71: iconst_4
        72: iconst_2
        73: newarray       int
        75: dup
        76: iconst_0
        77: sipush        1036
        80: iastore
        81: dup
        82: iconst_1
        83: iconst_2
        84: iastore
        85: aastore
        86: dup
        87: iconst_5
        88: iconst_2
        89: newarray       int
        91: dup
        92: iconst_0
        93: sipush        1045
        96: iastore
        97: dup
        98: iconst_1
        99: bipush        6
       101: iastore
       102: aastore
       103: dup
       104: bipush        6
       106: iconst_2
       107: newarray       int
       109: dup
       110: iconst_0
       111: sipush        1303
       114: iastore
       115: dup
       116: iconst_1
       117: iconst_2
       118: iastore
       119: aastore
       120: dup
       121: bipush        7
       123: iconst_2
       124: newarray       int
       126: dup
       127: iconst_0
       128: sipush        1085
       131: iastore
       132: dup
       133: iconst_1
       134: iconst_3
       135: iastore
       136: aastore
       137: dup
       138: bipush        8
       140: iconst_2
       141: newarray       int
       143: dup
       144: iconst_0
       145: sipush        1062
       148: iastore
       149: dup
       150: iconst_1
       151: iconst_2
       152: iastore
       153: aastore
       154: dup
       155: bipush        9
       157: iconst_2
       158: newarray       int
       160: dup
       161: iconst_0
       162: sipush        1059
       165: iastore
       166: dup
       167: iconst_1
       168: iconst_3
       169: iastore
       170: aastore
       171: dup
       172: bipush        10
       174: iconst_2
       175: newarray       int
       177: dup
       178: iconst_0
       179: sipush        1389
       182: iastore
       183: dup
       184: iconst_1
       185: iconst_3
       186: iastore
       187: aastore
       188: dup
       189: bipush        11
       191: iconst_2
       192: newarray       int
       194: dup
       195: iconst_0
       196: sipush        273
       199: iastore
       200: dup
       201: iconst_1
       202: iconst_1
       203: iastore
       204: aastore
       205: dup
       206: bipush        12
       208: iconst_2
       209: newarray       int
       211: dup
       212: iconst_0
       213: sipush        276
       216: iastore
       217: dup
       218: iconst_1
       219: iconst_1
       220: iastore
       221: aastore
       222: dup
       223: bipush        13
       225: iconst_2
       226: newarray       int
       228: dup
       229: iconst_0
       230: sipush        365
       233: iastore
       234: dup
       235: iconst_1
       236: iconst_1
       237: iastore
       238: aastore
       239: dup
       240: bipush        14
       242: iconst_2
       243: newarray       int
       245: dup
       246: iconst_0
       247: sipush        264
       250: iastore
       251: dup
       252: iconst_1
       253: iconst_1
       254: iastore
       255: aastore
       256: dup
       257: bipush        15
       259: iconst_2
       260: newarray       int
       262: dup
       263: iconst_0
       264: sipush        268
       267: iastore
       268: dup
       269: iconst_1
       270: iconst_1
       271: iastore
       272: aastore
       273: dup
       274: bipush        16
       276: iconst_2
       277: newarray       int
       279: dup
       280: iconst_0
       281: sipush        267
       284: iastore
       285: dup
       286: iconst_1
       287: iconst_1
       288: iastore
       289: aastore
       290: dup
       291: bipush        17
       293: iconst_2
       294: newarray       int
       296: dup
       297: iconst_0
       298: sipush        349
       301: iastore
       302: dup
       303: iconst_1
       304: iconst_1
       305: iastore
       306: aastore
       307: dup
       308: bipush        18
       310: iconst_2
       311: newarray       int
       313: dup
       314: iconst_0
       315: sipush        1413
       318: iastore
       319: dup
       320: iconst_1
       321: iconst_1
       322: iastore
       323: aastore
       324: dup
       325: bipush        19
       327: iconst_2
       328: newarray       int
       330: dup
       331: iconst_0
       332: sipush        4703
       335: iastore
       336: dup
       337: iconst_1
       338: iconst_4
       339: iastore
       340: aastore
       341: areturn
      LineNumberTable:
        line 275: 0
}
SourceFile: "FakePlayerHelpers.java"
