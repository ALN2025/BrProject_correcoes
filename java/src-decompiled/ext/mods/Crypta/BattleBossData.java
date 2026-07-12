// Bytecode for: ext.mods.Crypta.BattleBossData
// File: ext\mods\Crypta\BattleBossData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/Crypta/BattleBossData.class
  Last modified 9 de jul de 2026; size 11557 bytes
  MD5 checksum fb42a1c8301f2c718a544ef8d2176fa0
  Compiled from "BattleBossData.java"
public class ext.mods.Crypta.BattleBossData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/Crypta/BattleBossData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 21, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/Crypta/BattleBossData._events:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/Crypta/BattleBossData
   #12 = NameAndType        #14:#15       // _events:Ljava/util/Map;
   #13 = Utf8               ext/mods/Crypta/BattleBossData
   #14 = Utf8               _events
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/Crypta/BattleBossData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = InterfaceMethodref #20.#21       // java/util/Map.clear:()V
   #20 = Class              #22           // java/util/Map
   #21 = NameAndType        #23:#6        // clear:()V
   #22 = Utf8               java/util/Map
   #23 = Utf8               clear
   #24 = String             #25           // custom/mods/battleboss.xml
   #25 = Utf8               custom/mods/battleboss.xml
   #26 = Methodref          #11.#27       // ext/mods/Crypta/BattleBossData.parseDataFile:(Ljava/lang/String;)V
   #27 = NameAndType        #28:#29       // parseDataFile:(Ljava/lang/String;)V
   #28 = Utf8               parseDataFile
   #29 = Utf8               (Ljava/lang/String;)V
   #30 = Fieldref           #11.#31       // ext/mods/Crypta/BattleBossData.LOGGER:Lext/mods/commons/logging/CLogger;
   #31 = NameAndType        #32:#33       // LOGGER:Lext/mods/commons/logging/CLogger;
   #32 = Utf8               LOGGER
   #33 = Utf8               Lext/mods/commons/logging/CLogger;
   #34 = String             #35           // Loaded {} battle boss events.
   #35 = Utf8               Loaded {} battle boss events.
   #36 = InterfaceMethodref #20.#37       // java/util/Map.size:()I
   #37 = NameAndType        #38:#39       // size:()I
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
   #52 = String             #53           // events
   #53 = Utf8               events
   #54 = InvokeDynamic      #0:#55        // #0:accept:(Lext/mods/Crypta/BattleBossData;)Ljava/util/function/Consumer;
   #55 = NameAndType        #56:#57       // accept:(Lext/mods/Crypta/BattleBossData;)Ljava/util/function/Consumer;
   #56 = Utf8               accept
   #57 = Utf8               (Lext/mods/Crypta/BattleBossData;)Ljava/util/function/Consumer;
   #58 = Methodref          #11.#59       // ext/mods/Crypta/BattleBossData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = NameAndType        #60:#61       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #60 = Utf8               forEach
   #61 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #62 = Methodref          #11.#63       // ext/mods/Crypta/BattleBossData.getChild:(Lorg/w3c/dom/Node;Ljava/lang/String;)Lorg/w3c/dom/Node;
   #63 = NameAndType        #64:#65       // getChild:(Lorg/w3c/dom/Node;Ljava/lang/String;)Lorg/w3c/dom/Node;
   #64 = Utf8               getChild
   #65 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;)Lorg/w3c/dom/Node;
   #66 = InterfaceMethodref #67.#68       // org/w3c/dom/Node.getTextContent:()Ljava/lang/String;
   #67 = Class              #69           // org/w3c/dom/Node
   #68 = NameAndType        #70:#71       // getTextContent:()Ljava/lang/String;
   #69 = Utf8               org/w3c/dom/Node
   #70 = Utf8               getTextContent
   #71 = Utf8               ()Ljava/lang/String;
   #72 = Methodref          #73.#74       // java/lang/String.trim:()Ljava/lang/String;
   #73 = Class              #75           // java/lang/String
   #74 = NameAndType        #76:#71       // trim:()Ljava/lang/String;
   #75 = Utf8               java/lang/String
   #76 = Utf8               trim
   #77 = String             #78           //
   #78 = Utf8
   #79 = Class              #80           // ext/mods/commons/data/StatSet
   #80 = Utf8               ext/mods/commons/data/StatSet
   #81 = Methodref          #11.#82       // ext/mods/Crypta/BattleBossData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #82 = NameAndType        #83:#84       // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #83 = Utf8               parseAttributes
   #84 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #85 = Methodref          #79.#86       // ext/mods/commons/data/StatSet."<init>":(Lext/mods/commons/data/StatSet;)V
   #86 = NameAndType        #5:#87        // "<init>":(Lext/mods/commons/data/StatSet;)V
   #87 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #88 = String             #89           // id
   #89 = Utf8               id
   #90 = Methodref          #79.#91       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #91 = NameAndType        #92:#93       // getInteger:(Ljava/lang/String;)I
   #92 = Utf8               getInteger
   #93 = Utf8               (Ljava/lang/String;)I
   #94 = String             #95           // name
   #95 = Utf8               name
   #96 = Methodref          #79.#97       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #97 = NameAndType        #98:#99       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #98 = Utf8               getString
   #99 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #100 = String             #101          // type
  #101 = Utf8               type
  #102 = String             #103          // enabled
  #103 = Utf8               enabled
  #104 = Methodref          #11.#105      // ext/mods/Crypta/BattleBossData.getChildText:(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;
  #105 = NameAndType        #106:#107     // getChildText:(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;
  #106 = Utf8               getChildText
  #107 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;
  #108 = Methodref          #109.#110     // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
  #109 = Class              #111          // java/lang/Boolean
  #110 = NameAndType        #112:#113     // parseBoolean:(Ljava/lang/String;)Z
  #111 = Utf8               java/lang/Boolean
  #112 = Utf8               parseBoolean
  #113 = Utf8               (Ljava/lang/String;)Z
  #114 = String             #115          // duration
  #115 = Utf8               duration
  #116 = Methodref          #41.#117      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #117 = NameAndType        #118:#93      // parseInt:(Ljava/lang/String;)I
  #118 = Utf8               parseInt
  #119 = String             #120          // days
  #120 = Utf8               days
  #121 = String             #122          // ,
  #122 = Utf8               ,
  #123 = Methodref          #73.#124      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #124 = NameAndType        #125:#126     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #125 = Utf8               split
  #126 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #127 = Class              #128          // java/util/ArrayList
  #128 = Utf8               java/util/ArrayList
  #129 = Methodref          #127.#3       // java/util/ArrayList."<init>":()V
  #130 = InterfaceMethodref #131.#132     // java/util/List.add:(Ljava/lang/Object;)Z
  #131 = Class              #133          // java/util/List
  #132 = NameAndType        #134:#135     // add:(Ljava/lang/Object;)Z
  #133 = Utf8               java/util/List
  #134 = Utf8               add
  #135 = Utf8               (Ljava/lang/Object;)Z
  #136 = String             #137          // times
  #137 = Utf8               times
  #138 = InvokeDynamic      #1:#139       // #1:accept:(Lext/mods/Crypta/BattleBossData;Ljava/util/List;)Ljava/util/function/Consumer;
  #139 = NameAndType        #56:#140      // accept:(Lext/mods/Crypta/BattleBossData;Ljava/util/List;)Ljava/util/function/Consumer;
  #140 = Utf8               (Lext/mods/Crypta/BattleBossData;Ljava/util/List;)Ljava/util/function/Consumer;
  #141 = Class              #142          // ext/mods/battlerboss/holder/BattleBossConfigHolder
  #142 = Utf8               ext/mods/battlerboss/holder/BattleBossConfigHolder
  #143 = Methodref          #141.#144     // ext/mods/battlerboss/holder/BattleBossConfigHolder."<init>":(ZLjava/util/List;Ljava/util/List;I)V
  #144 = NameAndType        #5:#145       // "<init>":(ZLjava/util/List;Ljava/util/List;I)V
  #145 = Utf8               (ZLjava/util/List;Ljava/util/List;I)V
  #146 = String             #50           // info
  #147 = String             #148          // icon
  #148 = Utf8               icon
  #149 = Methodref          #79.#150      // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
  #150 = NameAndType        #151:#152     // set:(Ljava/lang/String;Ljava/lang/String;)V
  #151 = Utf8               set
  #152 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #153 = String             #154          // desc
  #154 = Utf8               desc
  #155 = InvokeDynamic      #2:#139       // #2:accept:(Lext/mods/Crypta/BattleBossData;Ljava/util/List;)Ljava/util/function/Consumer;
  #156 = Methodref          #79.#157      // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/Object;)V
  #157 = NameAndType        #151:#158     // set:(Ljava/lang/String;Ljava/lang/Object;)V
  #158 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
  #159 = String             #160          // announce
  #160 = Utf8               announce
  #161 = InvokeDynamic      #3:#139       // #3:accept:(Lext/mods/Crypta/BattleBossData;Ljava/util/List;)Ljava/util/function/Consumer;
  #162 = Class              #163          // ext/mods/battlerboss/holder/InfoHolder
  #163 = Utf8               ext/mods/battlerboss/holder/InfoHolder
  #164 = Methodref          #162.#86      // ext/mods/battlerboss/holder/InfoHolder."<init>":(Lext/mods/commons/data/StatSet;)V
  #165 = String             #166          // registration
  #166 = Utf8               registration
  #167 = Class              #168          // ext/mods/battlerboss/holder/RegistrationHolder
  #168 = Utf8               ext/mods/battlerboss/holder/RegistrationHolder
  #169 = Methodref          #167.#86      // ext/mods/battlerboss/holder/RegistrationHolder."<init>":(Lext/mods/commons/data/StatSet;)V
  #170 = String             #171          // battle
  #171 = Utf8               battle
  #172 = String             #173          // rules
  #173 = Utf8               rules
  #174 = Methodref          #79.#175      // ext/mods/commons/data/StatSet.merge:(Lext/mods/commons/data/StatSet;)V
  #175 = NameAndType        #176:#87      // merge:(Lext/mods/commons/data/StatSet;)V
  #176 = Utf8               merge
  #177 = Class              #178          // ext/mods/battlerboss/holder/BattleHolder
  #178 = Utf8               ext/mods/battlerboss/holder/BattleHolder
  #179 = Methodref          #177.#86      // ext/mods/battlerboss/holder/BattleHolder."<init>":(Lext/mods/commons/data/StatSet;)V
  #180 = String             #181          // monsterChallenge
  #181 = Utf8               monsterChallenge
  #182 = String             #183          // spawn
  #183 = Utf8               spawn
  #184 = Class              #185          // ext/mods/battlerboss/holder/MonsterChallengeHolder
  #185 = Utf8               ext/mods/battlerboss/holder/MonsterChallengeHolder
  #186 = Methodref          #184.#86      // ext/mods/battlerboss/holder/MonsterChallengeHolder."<init>":(Lext/mods/commons/data/StatSet;)V
  #187 = String             #188          // teleport
  #188 = Utf8               teleport
  #189 = Methodref          #79.#3        // ext/mods/commons/data/StatSet."<init>":()V
  #190 = String             #191          // arena
  #191 = Utf8               arena
  #192 = String             #193          // arenaX
  #193 = Utf8               arenaX
  #194 = String             #195          // x
  #195 = Utf8               x
  #196 = Methodref          #79.#197      // ext/mods/commons/data/StatSet.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #197 = NameAndType        #198:#199     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #198 = Utf8               get
  #199 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #200 = String             #201          // arenaY
  #201 = Utf8               arenaY
  #202 = String             #203          // y
  #203 = Utf8               y
  #204 = String             #205          // arenaZ
  #205 = Utf8               arenaZ
  #206 = String             #207          // z
  #207 = Utf8               z
  #208 = String             #209          // returnSpot
  #209 = Utf8               returnSpot
  #210 = String             #211          // returnX
  #211 = Utf8               returnX
  #212 = String             #213          // returnY
  #213 = Utf8               returnY
  #214 = String             #215          // returnZ
  #215 = Utf8               returnZ
  #216 = String             #217          // delay
  #217 = Utf8               delay
  #218 = Class              #219          // ext/mods/battlerboss/holder/TeleportHolder
  #219 = Utf8               ext/mods/battlerboss/holder/TeleportHolder
  #220 = Methodref          #218.#86      // ext/mods/battlerboss/holder/TeleportHolder."<init>":(Lext/mods/commons/data/StatSet;)V
  #221 = String             #222          // rewards
  #222 = Utf8               rewards
  #223 = String             #224          // winner
  #224 = Utf8               winner
  #225 = String             #226          // reward
  #226 = Utf8               reward
  #227 = InvokeDynamic      #4:#139       // #4:accept:(Lext/mods/Crypta/BattleBossData;Ljava/util/List;)Ljava/util/function/Consumer;
  #228 = String             #229          // loser
  #229 = Utf8               loser
  #230 = InvokeDynamic      #5:#139       // #5:accept:(Lext/mods/Crypta/BattleBossData;Ljava/util/List;)Ljava/util/function/Consumer;
  #231 = Class              #232          // ext/mods/battlerboss/holder/RewardsHolder
  #232 = Utf8               ext/mods/battlerboss/holder/RewardsHolder
  #233 = Methodref          #231.#234     // ext/mods/battlerboss/holder/RewardsHolder."<init>":(Ljava/util/List;Ljava/util/List;)V
  #234 = NameAndType        #5:#235       // "<init>":(Ljava/util/List;Ljava/util/List;)V
  #235 = Utf8               (Ljava/util/List;Ljava/util/List;)V
  #236 = Class              #237          // ext/mods/battlerboss/holder/EventHolder
  #237 = Utf8               ext/mods/battlerboss/holder/EventHolder
  #238 = Methodref          #236.#239     // ext/mods/battlerboss/holder/EventHolder."<init>":(ILjava/lang/String;Ljava/lang/String;Lext/mods/battlerboss/holder/InfoHolder;Lext/mods/battlerboss/holder/RegistrationHolder;Lext/mods/battlerboss/holder/BattleHolder;Lext/mods/battlerboss/holder/MonsterChallengeHolder;Lext/mods/battlerboss/holder/TeleportHolder;Lext/mods/battlerboss/holder/RewardsHolder;Lext/mods/battlerboss/holder/BattleBossConfigHolder;)V
  #239 = NameAndType        #5:#240       // "<init>":(ILjava/lang/String;Ljava/lang/String;Lext/mods/battlerboss/holder/InfoHolder;Lext/mods/battlerboss/holder/RegistrationHolder;Lext/mods/battlerboss/holder/BattleHolder;Lext/mods/battlerboss/holder/MonsterChallengeHolder;Lext/mods/battlerboss/holder/TeleportHolder;Lext/mods/battlerboss/holder/RewardsHolder;Lext/mods/battlerboss/holder/BattleBossConfigHolder;)V
  #240 = Utf8               (ILjava/lang/String;Ljava/lang/String;Lext/mods/battlerboss/holder/InfoHolder;Lext/mods/battlerboss/holder/RegistrationHolder;Lext/mods/battlerboss/holder/BattleHolder;Lext/mods/battlerboss/holder/MonsterChallengeHolder;Lext/mods/battlerboss/holder/TeleportHolder;Lext/mods/battlerboss/holder/RewardsHolder;Lext/mods/battlerboss/holder/BattleBossConfigHolder;)V
  #241 = InterfaceMethodref #20.#242      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #242 = NameAndType        #243:#244     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #243 = Utf8               put
  #244 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #245 = InterfaceMethodref #20.#197      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #246 = InterfaceMethodref #20.#247      // java/util/Map.values:()Ljava/util/Collection;
  #247 = NameAndType        #248:#249     // values:()Ljava/util/Collection;
  #248 = Utf8               values
  #249 = Utf8               ()Ljava/util/Collection;
  #250 = Methodref          #251.#252     // ext/mods/battlerboss/register/BattleBossOpenRegister.getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #251 = Class              #253          // ext/mods/battlerboss/register/BattleBossOpenRegister
  #252 = NameAndType        #254:#255     // getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #253 = Utf8               ext/mods/battlerboss/register/BattleBossOpenRegister
  #254 = Utf8               getInstance
  #255 = Utf8               ()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #256 = Methodref          #251.#257     // ext/mods/battlerboss/register/BattleBossOpenRegister.hasOpenRegistration:()Z
  #257 = NameAndType        #258:#259     // hasOpenRegistration:()Z
  #258 = Utf8               hasOpenRegistration
  #259 = Utf8               ()Z
  #260 = Methodref          #11.#261      // ext/mods/Crypta/BattleBossData.isRunning:()Z
  #261 = NameAndType        #262:#259     // isRunning:()Z
  #262 = Utf8               isRunning
  #263 = Methodref          #264.#265     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #264 = Class              #266          // ext/mods/gameserver/data/HTMLData
  #265 = NameAndType        #254:#267     // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #266 = Utf8               ext/mods/gameserver/data/HTMLData
  #267 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #268 = Methodref          #269.#270     // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #269 = Class              #271          // ext/mods/gameserver/model/actor/Player
  #270 = NameAndType        #272:#273     // getLocale:()Ljava/util/Locale;
  #271 = Utf8               ext/mods/gameserver/model/actor/Player
  #272 = Utf8               getLocale
  #273 = Utf8               ()Ljava/util/Locale;
  #274 = String             #275          // html/mods/tournament/tutorial_alert_battleboss.htm
  #275 = Utf8               html/mods/tournament/tutorial_alert_battleboss.htm
  #276 = Methodref          #264.#277     // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #277 = NameAndType        #278:#279     // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #278 = Utf8               getHtm
  #279 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #280 = Methodref          #73.#281      // java/lang/String.isEmpty:()Z
  #281 = NameAndType        #282:#259     // isEmpty:()Z
  #282 = Utf8               isEmpty
  #283 = String             #284          // Battle Boss event is open! Use .battleboss to participate.
  #284 = Utf8               Battle Boss event is open! Use .battleboss to participate.
  #285 = String             #286          // %message%
  #286 = Utf8               %message%
  #287 = Methodref          #73.#288      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #288 = NameAndType        #289:#290     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #289 = Utf8               replace
  #290 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #291 = InterfaceMethodref #67.#292      // org/w3c/dom/Node.hasChildNodes:()Z
  #292 = NameAndType        #293:#259     // hasChildNodes:()Z
  #293 = Utf8               hasChildNodes
  #294 = InterfaceMethodref #67.#295      // org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
  #295 = NameAndType        #296:#297     // getFirstChild:()Lorg/w3c/dom/Node;
  #296 = Utf8               getFirstChild
  #297 = Utf8               ()Lorg/w3c/dom/Node;
  #298 = InterfaceMethodref #67.#299      // org/w3c/dom/Node.getNodeType:()S
  #299 = NameAndType        #300:#301     // getNodeType:()S
  #300 = Utf8               getNodeType
  #301 = Utf8               ()S
  #302 = InterfaceMethodref #67.#303      // org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
  #303 = NameAndType        #304:#71      // getNodeName:()Ljava/lang/String;
  #304 = Utf8               getNodeName
  #305 = Methodref          #73.#306      // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #306 = NameAndType        #307:#113     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #307 = Utf8               equalsIgnoreCase
  #308 = InterfaceMethodref #67.#309      // org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
  #309 = NameAndType        #310:#297     // getNextSibling:()Lorg/w3c/dom/Node;
  #310 = Utf8               getNextSibling
  #311 = Fieldref           #312.#313     // ext/mods/Crypta/BattleBossData$SingletonHolder.INSTANCE:Lext/mods/Crypta/BattleBossData;
  #312 = Class              #314          // ext/mods/Crypta/BattleBossData$SingletonHolder
  #313 = NameAndType        #315:#316     // INSTANCE:Lext/mods/Crypta/BattleBossData;
  #314 = Utf8               ext/mods/Crypta/BattleBossData$SingletonHolder
  #315 = Utf8               INSTANCE
  #316 = Utf8               Lext/mods/Crypta/BattleBossData;
  #317 = Class              #318          // ext/mods/battlerboss/holder/RewardHolder
  #318 = Utf8               ext/mods/battlerboss/holder/RewardHolder
  #319 = Methodref          #317.#86      // ext/mods/battlerboss/holder/RewardHolder."<init>":(Lext/mods/commons/data/StatSet;)V
  #320 = String             #321          // line
  #321 = Utf8               line
  #322 = InvokeDynamic      #6:#323       // #6:accept:(Ljava/util/List;)Ljava/util/function/Consumer;
  #323 = NameAndType        #56:#324      // accept:(Ljava/util/List;)Ljava/util/function/Consumer;
  #324 = Utf8               (Ljava/util/List;)Ljava/util/function/Consumer;
  #325 = InvokeDynamic      #7:#323       // #7:accept:(Ljava/util/List;)Ljava/util/function/Consumer;
  #326 = String             #327          // time
  #327 = Utf8               time
  #328 = InvokeDynamic      #8:#323       // #8:accept:(Ljava/util/List;)Ljava/util/function/Consumer;
  #329 = String             #330          // event
  #330 = Utf8               event
  #331 = InvokeDynamic      #9:#55        // #9:accept:(Lext/mods/Crypta/BattleBossData;)Ljava/util/function/Consumer;
  #332 = Class              #333          // ext/mods/commons/data/xml/IXmlReader
  #333 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #334 = Utf8               TUTORIAL_QUESTION_MARK_ID
  #335 = Utf8               I
  #336 = Utf8               ConstantValue
  #337 = Integer            2006
  #338 = Utf8               Signature
  #339 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/battlerboss/holder/EventHolder;>;
  #340 = Utf8               Code
  #341 = Utf8               LineNumberTable
  #342 = Utf8               LocalVariableTable
  #343 = Utf8               this
  #344 = Utf8               parseDocument
  #345 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #346 = Utf8               doc
  #347 = Utf8               Lorg/w3c/dom/Document;
  #348 = Utf8               path
  #349 = Utf8               Ljava/nio/file/Path;
  #350 = Utf8               node
  #351 = Utf8               Lorg/w3c/dom/Node;
  #352 = Utf8               tag
  #353 = Utf8               Ljava/lang/String;
  #354 = Utf8               child
  #355 = Utf8               StackMapTable
  #356 = Utf8               parseEvent
  #357 = Utf8               (Lorg/w3c/dom/Node;)V
  #358 = Utf8               token
  #359 = Utf8               infoSet
  #360 = Utf8               Lext/mods/commons/data/StatSet;
  #361 = Utf8               infoName
  #362 = Utf8               infoIcon
  #363 = Utf8               descLines
  #364 = Utf8               Ljava/util/List;
  #365 = Utf8               announcerLines
  #366 = Utf8               regSet
  #367 = Utf8               battleSet
  #368 = Utf8               rulesNode
  #369 = Utf8               monSet
  #370 = Utf8               spawnNode
  #371 = Utf8               a
  #372 = Utf8               r
  #373 = Utf8               tpSet
  #374 = Utf8               arenaNode
  #375 = Utf8               returnNode
  #376 = Utf8               winRewards
  #377 = Utf8               loseRewards
  #378 = Utf8               winNode
  #379 = Utf8               loseNode
  #380 = Utf8               Z
  #381 = Utf8               dayTokens
  #382 = Utf8               [Ljava/lang/String;
  #383 = Utf8               config
  #384 = Utf8               Lext/mods/battlerboss/holder/BattleBossConfigHolder;
  #385 = Utf8               Lext/mods/battlerboss/holder/InfoHolder;
  #386 = Utf8               infoNode
  #387 = Utf8               Lext/mods/battlerboss/holder/RegistrationHolder;
  #388 = Utf8               regNode
  #389 = Utf8               Lext/mods/battlerboss/holder/BattleHolder;
  #390 = Utf8               battleNode
  #391 = Utf8               monster
  #392 = Utf8               Lext/mods/battlerboss/holder/MonsterChallengeHolder;
  #393 = Utf8               monNode
  #394 = Utf8               Lext/mods/battlerboss/holder/TeleportHolder;
  #395 = Utf8               tpNode
  #396 = Utf8               Lext/mods/battlerboss/holder/RewardsHolder;
  #397 = Utf8               rewardsNode
  #398 = Utf8               holder
  #399 = Utf8               Lext/mods/battlerboss/holder/EventHolder;
  #400 = Utf8               LocalVariableTypeTable
  #401 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #402 = Utf8               Ljava/util/List<Lext/mods/battlerboss/holder/RewardHolder;>;
  #403 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #404 = Class              #382          // "[Ljava/lang/String;"
  #405 = Utf8               getEvent
  #406 = Utf8               (I)Lext/mods/battlerboss/holder/EventHolder;
  #407 = Utf8               getEvents
  #408 = Utf8               ()Ljava/util/Collection<Lext/mods/battlerboss/holder/EventHolder;>;
  #409 = Utf8               getTutorialAlertHtml
  #410 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #411 = Utf8               player
  #412 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #413 = Utf8               html
  #414 = Utf8               msg
  #415 = Utf8               parent
  #416 = Utf8               ()Lext/mods/Crypta/BattleBossData;
  #417 = Utf8               lambda$parseEvent$7
  #418 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #419 = Utf8               Lext/mods/battlerboss/holder/RewardHolder;
  #420 = Utf8               lambda$parseEvent$6
  #421 = Utf8               lambda$parseEvent$4
  #422 = Utf8               d
  #423 = Utf8               lambda$parseEvent$5
  #424 = Utf8               l
  #425 = Utf8               lambda$parseEvent$2
  #426 = Utf8               lambda$parseEvent$3
  #427 = Utf8               lambda$parseEvent$0
  #428 = Utf8               timesNode
  #429 = Utf8               lambda$parseEvent$1
  #430 = Utf8               timeNode
  #431 = Utf8               lambda$parseDocument$0
  #432 = Utf8               eventsNode
  #433 = Utf8               SourceFile
  #434 = Utf8               BattleBossData.java
  #435 = Utf8               NestMembers
  #436 = Utf8               BootstrapMethods
  #437 = MethodType         #438          //  (Ljava/lang/Object;)V
  #438 = Utf8               (Ljava/lang/Object;)V
  #439 = MethodHandle       5:#440        // REF_invokeVirtual ext/mods/Crypta/BattleBossData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #440 = Methodref          #11.#441      // ext/mods/Crypta/BattleBossData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #441 = NameAndType        #431:#357     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #442 = MethodType         #357          //  (Lorg/w3c/dom/Node;)V
  #443 = MethodHandle       5:#444        // REF_invokeVirtual ext/mods/Crypta/BattleBossData.lambda$parseEvent$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #444 = Methodref          #11.#445      // ext/mods/Crypta/BattleBossData.lambda$parseEvent$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #445 = NameAndType        #427:#418     // lambda$parseEvent$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #446 = MethodHandle       5:#447        // REF_invokeVirtual ext/mods/Crypta/BattleBossData.lambda$parseEvent$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #447 = Methodref          #11.#448      // ext/mods/Crypta/BattleBossData.lambda$parseEvent$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #448 = NameAndType        #425:#418     // lambda$parseEvent$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #449 = MethodHandle       5:#450        // REF_invokeVirtual ext/mods/Crypta/BattleBossData.lambda$parseEvent$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #450 = Methodref          #11.#451      // ext/mods/Crypta/BattleBossData.lambda$parseEvent$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #451 = NameAndType        #421:#418     // lambda$parseEvent$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #452 = MethodHandle       5:#453        // REF_invokeVirtual ext/mods/Crypta/BattleBossData.lambda$parseEvent$6:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #453 = Methodref          #11.#454      // ext/mods/Crypta/BattleBossData.lambda$parseEvent$6:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #454 = NameAndType        #420:#418     // lambda$parseEvent$6:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #455 = MethodHandle       5:#456        // REF_invokeVirtual ext/mods/Crypta/BattleBossData.lambda$parseEvent$7:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #456 = Methodref          #11.#457      // ext/mods/Crypta/BattleBossData.lambda$parseEvent$7:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #457 = NameAndType        #417:#418     // lambda$parseEvent$7:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #458 = MethodHandle       6:#459        // REF_invokeStatic ext/mods/Crypta/BattleBossData.lambda$parseEvent$5:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #459 = Methodref          #11.#460      // ext/mods/Crypta/BattleBossData.lambda$parseEvent$5:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #460 = NameAndType        #423:#418     // lambda$parseEvent$5:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #461 = MethodHandle       6:#462        // REF_invokeStatic ext/mods/Crypta/BattleBossData.lambda$parseEvent$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #462 = Methodref          #11.#463      // ext/mods/Crypta/BattleBossData.lambda$parseEvent$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #463 = NameAndType        #426:#418     // lambda$parseEvent$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #464 = MethodHandle       6:#465        // REF_invokeStatic ext/mods/Crypta/BattleBossData.lambda$parseEvent$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #465 = Methodref          #11.#466      // ext/mods/Crypta/BattleBossData.lambda$parseEvent$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #466 = NameAndType        #429:#418     // lambda$parseEvent$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #467 = MethodHandle       5:#468        // REF_invokeVirtual ext/mods/Crypta/BattleBossData.parseEvent:(Lorg/w3c/dom/Node;)V
  #468 = Methodref          #11.#469      // ext/mods/Crypta/BattleBossData.parseEvent:(Lorg/w3c/dom/Node;)V
  #469 = NameAndType        #356:#357     // parseEvent:(Lorg/w3c/dom/Node;)V
  #470 = MethodHandle       6:#471        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #471 = Methodref          #472.#473     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #472 = Class              #474          // java/lang/invoke/LambdaMetafactory
  #473 = NameAndType        #475:#476     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #474 = Utf8               java/lang/invoke/LambdaMetafactory
  #475 = Utf8               metafactory
  #476 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #477 = Utf8               InnerClasses
  #478 = Utf8               SingletonHolder
  #479 = Class              #480          // java/lang/invoke/MethodHandles$Lookup
  #480 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #481 = Class              #482          // java/lang/invoke/MethodHandles
  #482 = Utf8               java/lang/invoke/MethodHandles
  #483 = Utf8               Lookup
{
  public static final int TUTORIAL_QUESTION_MARK_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2006

  public ext.mods.Crypta.BattleBossData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _events:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 52: 0
        line 49: 4
        line 53: 15
        line 54: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/Crypta/BattleBossData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _events:Ljava/util/Map;
         4: invokeinterface #19,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: ldc           #24                 // String custom/mods/battleboss.xml
        12: invokevirtual #26                 // Method parseDataFile:(Ljava/lang/String;)V
        15: getstatic     #30                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        18: ldc           #34                 // String Loaded {} battle boss events.
        20: iconst_1
        21: anewarray     #2                  // class java/lang/Object
        24: dup
        25: iconst_0
        26: aload_0
        27: getfield      #10                 // Field _events:Ljava/util/Map;
        30: invokeinterface #36,  1           // InterfaceMethod java/util/Map.size:()I
        35: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        38: aastore
        39: invokevirtual #46                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        42: return
      LineNumberTable:
        line 59: 0
        line 60: 9
        line 61: 15
        line 62: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/Crypta/BattleBossData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #52                 // String events
         4: aload_0
         5: invokedynamic #54,  0             // InvokeDynamic #0:accept:(Lext/mods/Crypta/BattleBossData;)Ljava/util/function/Consumer;
        10: invokevirtual #58                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 67: 0
        line 68: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/Crypta/BattleBossData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.battlerboss.holder.EventHolder getEvent(int);
    descriptor: (I)Lext/mods/battlerboss/holder/EventHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _events:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #245,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #236                // class ext/mods/battlerboss/holder/EventHolder
        16: areturn
      LineNumberTable:
        line 220: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/Crypta/BattleBossData;
            0      17     1    id   I

  public java.util.Collection<ext.mods.battlerboss.holder.EventHolder> getEvents();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _events:Ljava/util/Map;
         4: invokeinterface #246,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 225: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/Crypta/BattleBossData;
    Signature: #408                         // ()Ljava/util/Collection<Lext/mods/battlerboss/holder/EventHolder;>;

  public int size();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _events:Ljava/util/Map;
         4: invokeinterface #36,  1           // InterfaceMethod java/util/Map.size:()I
         9: ireturn
      LineNumberTable:
        line 230: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/Crypta/BattleBossData;

  public boolean isRunning();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #250                // Method ext/mods/battlerboss/register/BattleBossOpenRegister.getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
         3: invokevirtual #256                // Method ext/mods/battlerboss/register/BattleBossOpenRegister.hasOpenRegistration:()Z
         6: ireturn
      LineNumberTable:
        line 236: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/Crypta/BattleBossData;

  public java.lang.String getTutorialAlertHtml(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: ifnull        11
         4: aload_0
         5: invokevirtual #260                // Method isRunning:()Z
         8: ifne          13
        11: aconst_null
        12: areturn
        13: invokestatic  #263                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        16: aload_1
        17: invokevirtual #268                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        20: ldc_w         #274                // String html/mods/tournament/tutorial_alert_battleboss.htm
        23: invokevirtual #276                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
        26: astore_2
        27: aload_2
        28: ifnull        38
        31: aload_2
        32: invokevirtual #280                // Method java/lang/String.isEmpty:()Z
        35: ifeq          40
        38: aconst_null
        39: areturn
        40: ldc_w         #283                // String Battle Boss event is open! Use .battleboss to participate.
        43: astore_3
        44: aload_2
        45: ldc_w         #285                // String %message%
        48: aload_3
        49: invokevirtual #287                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        52: areturn
      LineNumberTable:
        line 242: 0
        line 243: 13
        line 244: 27
        line 245: 40
        line 246: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/Crypta/BattleBossData;
            0      53     1 player   Lext/mods/gameserver/model/actor/Player;
           27      26     2  html   Ljava/lang/String;
           44       9     3   msg   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 11 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/lang/String ]
        frame_type = 1 /* same */

  public static ext.mods.Crypta.BattleBossData getInstance();
    descriptor: ()Lext/mods/Crypta/BattleBossData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #311                // Field ext/mods/Crypta/BattleBossData$SingletonHolder.INSTANCE:Lext/mods/Crypta/BattleBossData;
         3: areturn
      LineNumberTable:
        line 268: 0
}
SourceFile: "BattleBossData.java"
NestMembers:
  ext/mods/Crypta/BattleBossData$SingletonHolder
BootstrapMethods:
  0: #470 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #437 (Ljava/lang/Object;)V
      #439 REF_invokeVirtual ext/mods/Crypta/BattleBossData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #442 (Lorg/w3c/dom/Node;)V
  1: #470 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #437 (Ljava/lang/Object;)V
      #443 REF_invokeVirtual ext/mods/Crypta/BattleBossData.lambda$parseEvent$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #442 (Lorg/w3c/dom/Node;)V
  2: #470 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #437 (Ljava/lang/Object;)V
      #446 REF_invokeVirtual ext/mods/Crypta/BattleBossData.lambda$parseEvent$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #442 (Lorg/w3c/dom/Node;)V
  3: #470 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #437 (Ljava/lang/Object;)V
      #449 REF_invokeVirtual ext/mods/Crypta/BattleBossData.lambda$parseEvent$4:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #442 (Lorg/w3c/dom/Node;)V
  4: #470 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #437 (Ljava/lang/Object;)V
      #452 REF_invokeVirtual ext/mods/Crypta/BattleBossData.lambda$parseEvent$6:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #442 (Lorg/w3c/dom/Node;)V
  5: #470 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #437 (Ljava/lang/Object;)V
      #455 REF_invokeVirtual ext/mods/Crypta/BattleBossData.lambda$parseEvent$7:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #442 (Lorg/w3c/dom/Node;)V
  6: #470 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #437 (Ljava/lang/Object;)V
      #458 REF_invokeStatic ext/mods/Crypta/BattleBossData.lambda$parseEvent$5:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #442 (Lorg/w3c/dom/Node;)V
  7: #470 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #437 (Ljava/lang/Object;)V
      #461 REF_invokeStatic ext/mods/Crypta/BattleBossData.lambda$parseEvent$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #442 (Lorg/w3c/dom/Node;)V
  8: #470 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #437 (Ljava/lang/Object;)V
      #464 REF_invokeStatic ext/mods/Crypta/BattleBossData.lambda$parseEvent$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #442 (Lorg/w3c/dom/Node;)V
  9: #470 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #437 (Ljava/lang/Object;)V
      #467 REF_invokeVirtual ext/mods/Crypta/BattleBossData.parseEvent:(Lorg/w3c/dom/Node;)V
      #442 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #483= #479 of #481; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
