// Bytecode for: ext.mods.gameserver.data.manager.FestivalOfDarknessManager
// File: ext\mods\gameserver\data\manager\FestivalOfDarknessManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/FestivalOfDarknessManager.class
  Last modified 9 de jul de 2026; size 23747 bytes
  MD5 checksum a4885761285d1991722d6a2fa5f5021d
  Compiled from "FestivalOfDarknessManager.java"
public class ext.mods.gameserver.data.manager.FestivalOfDarknessManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 27, methods: 37, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
    #8 = Class              #10           // ext/mods/gameserver/data/manager/SevenSignsManager
    #9 = NameAndType        #11:#12       // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #10 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
   #11 = Utf8               getInstance
   #12 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #13 = Methodref          #8.#14        // ext/mods/gameserver/data/manager/SevenSignsManager.getCurrentCycle:()I
   #14 = NameAndType        #15:#16       // getCurrentCycle:()I
   #15 = Utf8               getCurrentCycle
   #16 = Utf8               ()I
   #17 = Fieldref           #18.#19       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._signsCycle:I
   #18 = Class              #20           // ext/mods/gameserver/data/manager/FestivalOfDarknessManager
   #19 = NameAndType        #21:#22       // _signsCycle:I
   #20 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager
   #21 = Utf8               _signsCycle
   #22 = Utf8               I
   #23 = Class              #24           // java/util/ArrayList
   #24 = Utf8               java/util/ArrayList
   #25 = Methodref          #23.#3        // java/util/ArrayList."<init>":()V
   #26 = Fieldref           #18.#27       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._accumulatedBonuses:Ljava/util/List;
   #27 = NameAndType        #28:#29       // _accumulatedBonuses:Ljava/util/List;
   #28 = Utf8               _accumulatedBonuses
   #29 = Utf8               Ljava/util/List;
   #30 = Class              #31           // java/util/HashMap
   #31 = Utf8               java/util/HashMap
   #32 = Methodref          #30.#3        // java/util/HashMap."<init>":()V
   #33 = Fieldref           #18.#34       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._dawnFestivalParticipants:Ljava/util/Map;
   #34 = NameAndType        #35:#36       // _dawnFestivalParticipants:Ljava/util/Map;
   #35 = Utf8               _dawnFestivalParticipants
   #36 = Utf8               Ljava/util/Map;
   #37 = Fieldref           #18.#38       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._duskFestivalParticipants:Ljava/util/Map;
   #38 = NameAndType        #39:#36       // _duskFestivalParticipants:Ljava/util/Map;
   #39 = Utf8               _duskFestivalParticipants
   #40 = Fieldref           #18.#41       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._dawnPreviousParticipants:Ljava/util/Map;
   #41 = NameAndType        #42:#36       // _dawnPreviousParticipants:Ljava/util/Map;
   #42 = Utf8               _dawnPreviousParticipants
   #43 = Fieldref           #18.#44       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._duskPreviousParticipants:Ljava/util/Map;
   #44 = NameAndType        #45:#36       // _duskPreviousParticipants:Ljava/util/Map;
   #45 = Utf8               _duskPreviousParticipants
   #46 = Fieldref           #18.#47       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._dawnFestivalScores:Ljava/util/Map;
   #47 = NameAndType        #48:#36       // _dawnFestivalScores:Ljava/util/Map;
   #48 = Utf8               _dawnFestivalScores
   #49 = Fieldref           #18.#50       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._duskFestivalScores:Ljava/util/Map;
   #50 = NameAndType        #51:#36       // _duskFestivalScores:Ljava/util/Map;
   #51 = Utf8               _duskFestivalScores
   #52 = Class              #53           // java/util/concurrent/ConcurrentHashMap
   #53 = Utf8               java/util/concurrent/ConcurrentHashMap
   #54 = Methodref          #52.#3        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #55 = Fieldref           #18.#56       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._festivalData:Ljava/util/Map;
   #56 = NameAndType        #57:#36       // _festivalData:Ljava/util/Map;
   #57 = Utf8               _festivalData
   #58 = Methodref          #18.#59       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.restoreFestivalData:()V
   #59 = NameAndType        #60:#6        // restoreFestivalData:()V
   #60 = Utf8               restoreFestivalData
   #61 = Methodref          #8.#62        // ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
   #62 = NameAndType        #63:#64       // isSealValidationPeriod:()Z
   #63 = Utf8               isSealValidationPeriod
   #64 = Utf8               ()Z
   #65 = Fieldref           #18.#66       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #66 = NameAndType        #67:#68       // LOGGER:Lext/mods/commons/logging/CLogger;
   #67 = Utf8               LOGGER
   #68 = Utf8               Lext/mods/commons/logging/CLogger;
   #69 = String             #70           // Seven Signs Festival initialization was bypassed due to Seal Validation being under effect.
   #70 = Utf8               Seven Signs Festival initialization was bypassed due to Seal Validation being under effect.
   #71 = Methodref          #72.#73       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #72 = Class              #74           // ext/mods/commons/logging/CLogger
   #73 = NameAndType        #75:#76       // info:(Ljava/lang/Object;)V
   #74 = Utf8               ext/mods/commons/logging/CLogger
   #75 = Utf8               info
   #76 = Utf8               (Ljava/lang/Object;)V
   #77 = Methodref          #18.#78       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.startFestivalManager:()V
   #78 = NameAndType        #79:#6        // startFestivalManager:()V
   #79 = Utf8               startFestivalManager
   #80 = Methodref          #81.#82       // java/util/Calendar.getInstance:()Ljava/util/Calendar;
   #81 = Class              #83           // java/util/Calendar
   #82 = NameAndType        #11:#84       // getInstance:()Ljava/util/Calendar;
   #83 = Utf8               java/util/Calendar
   #84 = Utf8               ()Ljava/util/Calendar;
   #85 = Methodref          #81.#86       // java/util/Calendar.get:(I)I
   #86 = NameAndType        #87:#88       // get:(I)I
   #87 = Utf8               get
   #88 = Utf8               (I)I
   #89 = Methodref          #18.#90       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.setNextFestivalStart:(J)V
   #90 = NameAndType        #91:#92       // setNextFestivalStart:(J)V
   #91 = Utf8               setNextFestivalStart
   #92 = Utf8               (J)V
   #93 = Methodref          #94.#95       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #94 = Class              #96           // ext/mods/commons/pool/ConnectionPool
   #95 = NameAndType        #97:#98       // getConnection:()Ljava/sql/Connection;
   #96 = Utf8               ext/mods/commons/pool/ConnectionPool
   #97 = Utf8               getConnection
   #98 = Utf8               ()Ljava/sql/Connection;
   #99 = String             #100          // SELECT festivalId, cabal, cycle, date, score, members FROM seven_signs_festival
  #100 = Utf8               SELECT festivalId, cabal, cycle, date, score, members FROM seven_signs_festival
  #101 = InterfaceMethodref #102.#103     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #102 = Class              #104          // java/sql/Connection
  #103 = NameAndType        #105:#106     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #104 = Utf8               java/sql/Connection
  #105 = Utf8               prepareStatement
  #106 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #107 = InterfaceMethodref #108.#109     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #108 = Class              #110          // java/sql/PreparedStatement
  #109 = NameAndType        #111:#112     // executeQuery:()Ljava/sql/ResultSet;
  #110 = Utf8               java/sql/PreparedStatement
  #111 = Utf8               executeQuery
  #112 = Utf8               ()Ljava/sql/ResultSet;
  #113 = InterfaceMethodref #114.#115     // java/sql/ResultSet.next:()Z
  #114 = Class              #116          // java/sql/ResultSet
  #115 = NameAndType        #117:#64      // next:()Z
  #116 = Utf8               java/sql/ResultSet
  #117 = Utf8               next
  #118 = String             #119          // cycle
  #119 = Utf8               cycle
  #120 = InterfaceMethodref #114.#121     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #121 = NameAndType        #122:#123     // getInt:(Ljava/lang/String;)I
  #122 = Utf8               getInt
  #123 = Utf8               (Ljava/lang/String;)I
  #124 = String             #125          // festivalId
  #125 = Utf8               festivalId
  #126 = String             #127          // cabal
  #127 = Utf8               cabal
  #128 = InterfaceMethodref #114.#129     // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #129 = NameAndType        #130:#131     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #130 = Utf8               getString
  #131 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #132 = Class              #133          // ext/mods/commons/data/StatSet
  #133 = Utf8               ext/mods/commons/data/StatSet
  #134 = Methodref          #132.#3       // ext/mods/commons/data/StatSet."<init>":()V
  #135 = Methodref          #132.#136     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
  #136 = NameAndType        #137:#138     // set:(Ljava/lang/String;I)V
  #137 = Utf8               set
  #138 = Utf8               (Ljava/lang/String;I)V
  #139 = Class              #140          // ext/mods/gameserver/enums/CabalType
  #140 = Utf8               ext/mods/gameserver/enums/CabalType
  #141 = Methodref          #142.#143     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #142 = Class              #144          // java/lang/Enum
  #143 = NameAndType        #145:#146     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #144 = Utf8               java/lang/Enum
  #145 = Utf8               valueOf
  #146 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #147 = Methodref          #132.#148     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/Enum;)V
  #148 = NameAndType        #137:#149     // set:(Ljava/lang/String;Ljava/lang/Enum;)V
  #149 = Utf8               (Ljava/lang/String;Ljava/lang/Enum;)V
  #150 = String             #151          // date
  #151 = Utf8               date
  #152 = Methodref          #132.#153     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
  #153 = NameAndType        #137:#154     // set:(Ljava/lang/String;Ljava/lang/String;)V
  #154 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #155 = String             #156          // score
  #156 = Utf8               score
  #157 = String             #158          // members
  #158 = Utf8               members
  #159 = String             #160          // dawn
  #160 = Utf8               dawn
  #161 = Methodref          #162.#163     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #162 = Class              #164          // java/lang/String
  #163 = NameAndType        #165:#166     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #164 = Utf8               java/lang/String
  #165 = Utf8               equalsIgnoreCase
  #166 = Utf8               (Ljava/lang/String;)Z
  #167 = Methodref          #168.#169     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #168 = Class              #170          // java/lang/Integer
  #169 = NameAndType        #145:#171     // valueOf:(I)Ljava/lang/Integer;
  #170 = Utf8               java/lang/Integer
  #171 = Utf8               (I)Ljava/lang/Integer;
  #172 = InvokeDynamic      #0:#173       // #0:apply:()Ljava/util/function/Function;
  #173 = NameAndType        #174:#175     // apply:()Ljava/util/function/Function;
  #174 = Utf8               apply
  #175 = Utf8               ()Ljava/util/function/Function;
  #176 = InterfaceMethodref #177.#178     // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #177 = Class              #179          // java/util/Map
  #178 = NameAndType        #180:#181     // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #179 = Utf8               java/util/Map
  #180 = Utf8               computeIfAbsent
  #181 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #182 = InterfaceMethodref #177.#183     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #183 = NameAndType        #184:#185     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #184 = Utf8               put
  #185 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #186 = InterfaceMethodref #114.#187     // java/sql/ResultSet.close:()V
  #187 = NameAndType        #188:#6       // close:()V
  #188 = Utf8               close
  #189 = Class              #190          // java/lang/Throwable
  #190 = Utf8               java/lang/Throwable
  #191 = Methodref          #189.#192     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #192 = NameAndType        #193:#194     // addSuppressed:(Ljava/lang/Throwable;)V
  #193 = Utf8               addSuppressed
  #194 = Utf8               (Ljava/lang/Throwable;)V
  #195 = InterfaceMethodref #108.#187     // java/sql/PreparedStatement.close:()V
  #196 = String             #197          // SELECT festival_cycle, accumulated_bonus0, accumulated_bonus1, accumulated_bonus2, accumulated_bonus3, accumulated_bonus4 FROM seven_signs_status WHERE id=0
  #197 = Utf8               SELECT festival_cycle, accumulated_bonus0, accumulated_bonus1, accumulated_bonus2, accumulated_bonus3, accumulated_bonus4 FROM seven_signs_status WHERE id=0
  #198 = String             #199          // festival_cycle
  #199 = Utf8               festival_cycle
  #200 = Fieldref           #18.#201      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._festivalCycle:I
  #201 = NameAndType        #202:#22      // _festivalCycle:I
  #202 = Utf8               _festivalCycle
  #203 = InvokeDynamic      #1:#204       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #204 = NameAndType        #205:#206     // makeConcatWithConstants:(I)Ljava/lang/String;
  #205 = Utf8               makeConcatWithConstants
  #206 = Utf8               (I)Ljava/lang/String;
  #207 = InterfaceMethodref #208.#209     // java/util/List.add:(ILjava/lang/Object;)V
  #208 = Class              #210          // java/util/List
  #209 = NameAndType        #211:#212     // add:(ILjava/lang/Object;)V
  #210 = Utf8               java/util/List
  #211 = Utf8               add
  #212 = Utf8               (ILjava/lang/Object;)V
  #213 = InterfaceMethodref #102.#187     // java/sql/Connection.close:()V
  #214 = Class              #215          // java/lang/Exception
  #215 = Utf8               java/lang/Exception
  #216 = String             #217          // Couldn\'t load Seven Signs Festival data.
  #217 = Utf8               Couldn\'t load Seven Signs Festival data.
  #218 = Methodref          #72.#219      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #219 = NameAndType        #220:#221     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #220 = Utf8               error
  #221 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #222 = String             #223          // INSERT INTO seven_signs_festival (festivalId, cabal, cycle, date, score, members) VALUES (?,?,?,?,?,?) ON DUPLICATE KEY UPDATE date = VALUES(date), score = VALUES(score), members = VALUES(members)
  #223 = Utf8               INSERT INTO seven_signs_festival (festivalId, cabal, cycle, date, score, members) VALUES (?,?,?,?,?,?) ON DUPLICATE KEY UPDATE date = VALUES(date), score = VALUES(score), members = VALUES(members)
  #224 = InterfaceMethodref #177.#225     // java/util/Map.values:()Ljava/util/Collection;
  #225 = NameAndType        #226:#227     // values:()Ljava/util/Collection;
  #226 = Utf8               values
  #227 = Utf8               ()Ljava/util/Collection;
  #228 = InterfaceMethodref #229.#230     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #229 = Class              #231          // java/util/Collection
  #230 = NameAndType        #232:#233     // iterator:()Ljava/util/Iterator;
  #231 = Utf8               java/util/Collection
  #232 = Utf8               iterator
  #233 = Utf8               ()Ljava/util/Iterator;
  #234 = InterfaceMethodref #235.#236     // java/util/Iterator.hasNext:()Z
  #235 = Class              #237          // java/util/Iterator
  #236 = NameAndType        #238:#64      // hasNext:()Z
  #237 = Utf8               java/util/Iterator
  #238 = Utf8               hasNext
  #239 = InterfaceMethodref #235.#240     // java/util/Iterator.next:()Ljava/lang/Object;
  #240 = NameAndType        #117:#241     // next:()Ljava/lang/Object;
  #241 = Utf8               ()Ljava/lang/Object;
  #242 = Methodref          #132.#243     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #243 = NameAndType        #244:#123     // getInteger:(Ljava/lang/String;)I
  #244 = Utf8               getInteger
  #245 = InterfaceMethodref #108.#246     // java/sql/PreparedStatement.setInt:(II)V
  #246 = NameAndType        #247:#248     // setInt:(II)V
  #247 = Utf8               setInt
  #248 = Utf8               (II)V
  #249 = Methodref          #132.#129     // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #250 = InterfaceMethodref #108.#251     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #251 = NameAndType        #252:#253     // setString:(ILjava/lang/String;)V
  #252 = Utf8               setString
  #253 = Utf8               (ILjava/lang/String;)V
  #254 = Methodref          #132.#255     // ext/mods/commons/data/StatSet.getLong:(Ljava/lang/String;)J
  #255 = NameAndType        #256:#257     // getLong:(Ljava/lang/String;)J
  #256 = Utf8               getLong
  #257 = Utf8               (Ljava/lang/String;)J
  #258 = InterfaceMethodref #108.#259     // java/sql/PreparedStatement.setLong:(IJ)V
  #259 = NameAndType        #260:#261     // setLong:(IJ)V
  #260 = Utf8               setLong
  #261 = Utf8               (IJ)V
  #262 = InterfaceMethodref #108.#263     // java/sql/PreparedStatement.addBatch:()V
  #263 = NameAndType        #264:#6       // addBatch:()V
  #264 = Utf8               addBatch
  #265 = InterfaceMethodref #108.#266     // java/sql/PreparedStatement.executeBatch:()[I
  #266 = NameAndType        #267:#268     // executeBatch:()[I
  #267 = Utf8               executeBatch
  #268 = Utf8               ()[I
  #269 = String             #270          // Couldn\'t save Seven Signs Festival data.
  #270 = Utf8               Couldn\'t save Seven Signs Festival data.
  #271 = Methodref          #8.#272       // ext/mods/gameserver/data/manager/SevenSignsManager.saveSevenSignsStatus:()V
  #272 = NameAndType        #273:#6       // saveSevenSignsStatus:()V
  #273 = Utf8               saveSevenSignsStatus
  #274 = Methodref          #18.#275      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getOverallHighestScoreData:(I)Lext/mods/commons/data/StatSet;
  #275 = NameAndType        #276:#277     // getOverallHighestScoreData:(I)Lext/mods/commons/data/StatSet;
  #276 = Utf8               getOverallHighestScoreData
  #277 = Utf8               (I)Lext/mods/commons/data/StatSet;
  #278 = String             #279          // ,
  #279 = Utf8               ,
  #280 = Methodref          #162.#281     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #281 = NameAndType        #282:#283     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #282 = Utf8               split
  #283 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #284 = Methodref          #18.#285      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.addReputationPointsForPartyMemberClan:(Ljava/lang/String;)V
  #285 = NameAndType        #286:#287     // addReputationPointsForPartyMemberClan:(Ljava/lang/String;)V
  #286 = Utf8               addReputationPointsForPartyMemberClan
  #287 = Utf8               (Ljava/lang/String;)V
  #288 = Methodref          #289.#290     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #289 = Class              #291          // ext/mods/gameserver/model/World
  #290 = NameAndType        #11:#292      // getInstance:()Lext/mods/gameserver/model/World;
  #291 = Utf8               ext/mods/gameserver/model/World
  #292 = Utf8               ()Lext/mods/gameserver/model/World;
  #293 = Methodref          #289.#294     // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #294 = NameAndType        #295:#296     // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #295 = Utf8               getPlayer
  #296 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #297 = Methodref          #298.#299     // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #298 = Class              #300          // ext/mods/gameserver/model/actor/Player
  #299 = NameAndType        #301:#302     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #300 = Utf8               ext/mods/gameserver/model/actor/Player
  #301 = Utf8               getClan
  #302 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #303 = Methodref          #304.#305     // ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
  #304 = Class              #306          // ext/mods/gameserver/model/pledge/Clan
  #305 = NameAndType        #307:#308     // addReputationScore:(I)Z
  #306 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #307 = Utf8               addReputationScore
  #308 = Utf8               (I)Z
  #309 = Class              #310          // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #310 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #311 = Fieldref           #312.#313     // ext/mods/gameserver/network/SystemMessageId.CLAN_MEMBER_S1_WAS_IN_HIGHEST_RANKED_PARTY_IN_FESTIVAL_OF_DARKNESS_AND_GAINED_S2_REPUTATION:Lext/mods/gameserver/network/SystemMessageId;
  #312 = Class              #314          // ext/mods/gameserver/network/SystemMessageId
  #313 = NameAndType        #315:#316     // CLAN_MEMBER_S1_WAS_IN_HIGHEST_RANKED_PARTY_IN_FESTIVAL_OF_DARKNESS_AND_GAINED_S2_REPUTATION:Lext/mods/gameserver/network/SystemMessageId;
  #314 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #315 = Utf8               CLAN_MEMBER_S1_WAS_IN_HIGHEST_RANKED_PARTY_IN_FESTIVAL_OF_DARKNESS_AND_GAINED_S2_REPUTATION
  #316 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #317 = Methodref          #318.#319     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #318 = Class              #320          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #319 = NameAndType        #321:#322     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #320 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #321 = Utf8               getSystemMessage
  #322 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #323 = Methodref          #318.#324     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #324 = NameAndType        #325:#326     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #325 = Utf8               addString
  #326 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #327 = Methodref          #318.#328     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #328 = NameAndType        #329:#330     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #329 = Utf8               addNumber
  #330 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #331 = Methodref          #304.#332     // ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #332 = NameAndType        #333:#334     // broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #333 = Utf8               broadcastToMembers
  #334 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #335 = String             #336          // SELECT clan_name FROM clan_data WHERE clan_id = (SELECT clanid FROM characters WHERE char_name = ?)
  #336 = Utf8               SELECT clan_name FROM clan_data WHERE clan_id = (SELECT clanid FROM characters WHERE char_name = ?)
  #337 = String             #338          // clan_name
  #338 = Utf8               clan_name
  #339 = Methodref          #340.#341     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #340 = Class              #342          // ext/mods/gameserver/data/sql/ClanTable
  #341 = NameAndType        #11:#343      // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #342 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #343 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #344 = Methodref          #340.#345     // ext/mods/gameserver/data/sql/ClanTable.getClanByName:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
  #345 = NameAndType        #346:#347     // getClanByName:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
  #346 = Utf8               getClanByName
  #347 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
  #348 = String             #349          // Couldn\'t get clan name of {}.
  #349 = Utf8               Couldn\'t get clan name of {}.
  #350 = Methodref          #72.#351      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #351 = NameAndType        #220:#352     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #352 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #353 = InterfaceMethodref #208.#354     // java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
  #354 = NameAndType        #137:#355     // set:(ILjava/lang/Object;)Ljava/lang/Object;
  #355 = Utf8               (ILjava/lang/Object;)Ljava/lang/Object;
  #356 = InterfaceMethodref #177.#357     // java/util/Map.clear:()V
  #357 = NameAndType        #358:#6       // clear:()V
  #358 = Utf8               clear
  #359 = String             #360          // 0
  #360 = Utf8               0
  #361 = String             #362          //
  #362 = Utf8
  #363 = Fieldref           #139.#364     // ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
  #364 = NameAndType        #365:#366     // DAWN:Lext/mods/gameserver/enums/CabalType;
  #365 = Utf8               DAWN
  #366 = Utf8               Lext/mods/gameserver/enums/CabalType;
  #367 = Fieldref           #139.#368     // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
  #368 = NameAndType        #369:#366     // DUSK:Lext/mods/gameserver/enums/CabalType;
  #369 = Utf8               DUSK
  #370 = Methodref          #18.#371      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.saveFestivalData:(Z)V
  #371 = NameAndType        #372:#373     // saveFestivalData:(Z)V
  #372 = Utf8               saveFestivalData
  #373 = Utf8               (Z)V
  #374 = Methodref          #289.#375     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #375 = NameAndType        #376:#227     // getPlayers:()Ljava/util/Collection;
  #376 = Utf8               getPlayers
  #377 = Methodref          #298.#378     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #378 = NameAndType        #379:#380     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #379 = Utf8               getInventory
  #380 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #381 = Methodref          #382.#383     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #382 = Class              #384          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #383 = NameAndType        #385:#386     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #384 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #385 = Utf8               getItemByItemId
  #386 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #387 = Methodref          #298.#388     // ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #388 = NameAndType        #389:#390     // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #389 = Utf8               destroyItem
  #390 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #391 = String             #392          // Reinitialized Seven Signs Festival for next competition period.
  #392 = Utf8               Reinitialized Seven Signs Festival for next competition period.
  #393 = Fieldref           #18.#394      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._festivalInitialized:Z
  #394 = NameAndType        #395:#396     // _festivalInitialized:Z
  #395 = Utf8               _festivalInitialized
  #396 = Utf8               Z
  #397 = Fieldref           #18.#398      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._festivalInProgress:Z
  #398 = NameAndType        #399:#396     // _festivalInProgress:Z
  #399 = Utf8               _festivalInProgress
  #400 = Methodref          #401.#402     // java/lang/System.currentTimeMillis:()J
  #401 = Class              #403          // java/lang/System
  #402 = NameAndType        #404:#405     // currentTimeMillis:()J
  #403 = Utf8               java/lang/System
  #404 = Utf8               currentTimeMillis
  #405 = Utf8               ()J
  #406 = Fieldref           #18.#407      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._nextFestivalStart:J
  #407 = NameAndType        #408:#409     // _nextFestivalStart:J
  #408 = Utf8               _nextFestivalStart
  #409 = Utf8               J
  #410 = Fieldref           #18.#411      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._nextFestivalCycleStart:J
  #411 = NameAndType        #412:#409     // _nextFestivalCycleStart:J
  #412 = Utf8               _nextFestivalCycleStart
  #413 = Long               60000l
  #415 = Methodref          #416.#417     // java/lang/Math.round:(F)I
  #416 = Class              #418          // java/lang/Math
  #417 = NameAndType        #419:#420     // round:(F)I
  #418 = Utf8               java/lang/Math
  #419 = Utf8               round
  #420 = Utf8               (F)I
  #421 = Methodref          #298.#422     // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #422 = NameAndType        #423:#424     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #423 = Utf8               getSysString
  #424 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #425 = Methodref          #18.#426      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getMin:()I
  #426 = NameAndType        #427:#16      // getMin:()I
  #427 = Utf8               getMin
  #428 = Integer            1000441
  #429 = Methodref          #430.#431     // ext/mods/gameserver/network/NpcStringId.getNpcMessage:(I)Ljava/lang/String;
  #430 = Class              #432          // ext/mods/gameserver/network/NpcStringId
  #431 = NameAndType        #433:#206     // getNpcMessage:(I)Ljava/lang/String;
  #432 = Utf8               ext/mods/gameserver/network/NpcStringId
  #433 = Utf8               getNpcMessage
  #434 = Long               1000l
  #436 = InterfaceMethodref #177.#437     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #437 = NameAndType        #87:#438      // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #438 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #439 = Methodref          #298.#440     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #440 = NameAndType        #441:#16      // getObjectId:()I
  #441 = Utf8               getObjectId
  #442 = InterfaceMethodref #208.#443     // java/util/List.contains:(Ljava/lang/Object;)Z
  #443 = NameAndType        #444:#445     // contains:(Ljava/lang/Object;)Z
  #444 = Utf8               contains
  #445 = Utf8               (Ljava/lang/Object;)Z
  #446 = Methodref          #139.#447     // ext/mods/gameserver/enums/CabalType.ordinal:()I
  #447 = NameAndType        #448:#16      // ordinal:()I
  #448 = Utf8               ordinal
  #449 = Methodref          #450.#451     // ext/mods/gameserver/model/group/Party.getMembersCount:()I
  #450 = Class              #452          // ext/mods/gameserver/model/group/Party
  #451 = NameAndType        #453:#16      // getMembersCount:()I
  #452 = Utf8               ext/mods/gameserver/model/group/Party
  #453 = Utf8               getMembersCount
  #454 = Methodref          #23.#455      // java/util/ArrayList."<init>":(I)V
  #455 = NameAndType        #5:#456       // "<init>":(I)V
  #456 = Utf8               (I)V
  #457 = Methodref          #450.#458     // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
  #458 = NameAndType        #459:#460     // getMembers:()Ljava/util/List;
  #459 = Utf8               getMembers
  #460 = Utf8               ()Ljava/util/List;
  #461 = InterfaceMethodref #208.#230     // java/util/List.iterator:()Ljava/util/Iterator;
  #462 = InterfaceMethodref #208.#463     // java/util/List.add:(Ljava/lang/Object;)Z
  #463 = NameAndType        #211:#445     // add:(Ljava/lang/Object;)Z
  #464 = Methodref          #18.#465      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #465 = NameAndType        #466:#467     // isParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #466 = Utf8               isParticipant
  #467 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #468 = Methodref          #18.#469      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getFestivalForPlayer:(Lext/mods/gameserver/model/actor/Player;)[I
  #469 = NameAndType        #470:#471     // getFestivalForPlayer:(Lext/mods/gameserver/model/actor/Player;)[I
  #470 = Utf8               getFestivalForPlayer
  #471 = Utf8               (Lext/mods/gameserver/model/actor/Player;)[I
  #472 = Fieldref           #139.#473     // ext/mods/gameserver/enums/CabalType.VALUES:[Lext/mods/gameserver/enums/CabalType;
  #473 = NameAndType        #474:#475     // VALUES:[Lext/mods/gameserver/enums/CabalType;
  #474 = Utf8               VALUES
  #475 = Utf8               [Lext/mods/gameserver/enums/CabalType;
  #476 = Fieldref           #18.#477      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._managerInstance:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager;
  #477 = NameAndType        #478:#479     // _managerInstance:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager;
  #478 = Utf8               _managerInstance
  #479 = Utf8               Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager;
  #480 = Methodref          #481.#482     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager.getFestivalInstance:(Lext/mods/gameserver/enums/CabalType;I)Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
  #481 = Class              #483          // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager
  #482 = NameAndType        #484:#485     // getFestivalInstance:(Lext/mods/gameserver/enums/CabalType;I)Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
  #483 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager
  #484 = Utf8               getFestivalInstance
  #485 = Utf8               (Lext/mods/gameserver/enums/CabalType;I)Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
  #486 = Methodref          #18.#487      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getParticipants:(Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List;
  #487 = NameAndType        #488:#489     // getParticipants:(Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List;
  #488 = Utf8               getParticipants
  #489 = Utf8               (Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List;
  #490 = Methodref          #168.#491     // java/lang/Integer.intValue:()I
  #491 = NameAndType        #492:#16      // intValue:()I
  #492 = Utf8               intValue
  #493 = Methodref          #289.#494     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #494 = NameAndType        #295:#495     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #495 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #496 = Methodref          #497.#498     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival.relocatePlayer:(Lext/mods/gameserver/model/actor/Player;Z)V
  #497 = Class              #499          // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival
  #498 = NameAndType        #500:#501     // relocatePlayer:(Lext/mods/gameserver/model/actor/Player;Z)V
  #499 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival
  #500 = Utf8               relocatePlayer
  #501 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #502 = Methodref          #18.#503      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.setParticipants:(Lext/mods/gameserver/enums/CabalType;ILext/mods/gameserver/model/group/Party;)V
  #503 = NameAndType        #504:#505     // setParticipants:(Lext/mods/gameserver/enums/CabalType;ILext/mods/gameserver/model/group/Party;)V
  #504 = Utf8               setParticipants
  #505 = Utf8               (Lext/mods/gameserver/enums/CabalType;ILext/mods/gameserver/model/group/Party;)V
  #506 = Fieldref           #507.#508     // ext/mods/Config.FESTIVAL_MIN_PLAYER:I
  #507 = Class              #509          // ext/mods/Config
  #508 = NameAndType        #510:#22      // FESTIVAL_MIN_PLAYER:I
  #509 = Utf8               ext/mods/Config
  #510 = Utf8               FESTIVAL_MIN_PLAYER
  #511 = Methodref          #18.#512      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.updateParticipants:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
  #512 = NameAndType        #513:#514     // updateParticipants:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
  #513 = Utf8               updateParticipants
  #514 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
  #515 = Fieldref           #516.#517     // ext/mods/gameserver/enums/MessageType.EXPELLED:Lext/mods/gameserver/enums/MessageType;
  #516 = Class              #518          // ext/mods/gameserver/enums/MessageType
  #517 = NameAndType        #519:#520     // EXPELLED:Lext/mods/gameserver/enums/MessageType;
  #518 = Utf8               ext/mods/gameserver/enums/MessageType
  #519 = Utf8               EXPELLED
  #520 = Utf8               Lext/mods/gameserver/enums/MessageType;
  #521 = Methodref          #450.#522     // ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #522 = NameAndType        #523:#524     // removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #523 = Utf8               removePartyMember
  #524 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #525 = Methodref          #18.#526      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getHighestScoreData:(Lext/mods/gameserver/enums/CabalType;I)Lext/mods/commons/data/StatSet;
  #526 = NameAndType        #527:#528     // getHighestScoreData:(Lext/mods/gameserver/enums/CabalType;I)Lext/mods/commons/data/StatSet;
  #527 = Utf8               getHighestScoreData
  #528 = Utf8               (Lext/mods/gameserver/enums/CabalType;I)Lext/mods/commons/data/StatSet;
  #529 = Methodref          #530.#447     // ext/mods/gameserver/enums/FestivalType.ordinal:()I
  #530 = Class              #531          // ext/mods/gameserver/enums/FestivalType
  #531 = Utf8               ext/mods/gameserver/enums/FestivalType
  #532 = Methodref          #18.#533      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getHighestScore:(Lext/mods/gameserver/enums/CabalType;I)I
  #533 = NameAndType        #534:#535     // getHighestScore:(Lext/mods/gameserver/enums/CabalType;I)I
  #534 = Utf8               getHighestScore
  #535 = Utf8               (Lext/mods/gameserver/enums/CabalType;I)I
  #536 = Methodref          #18.#537      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getPreviousParticipants:(Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List;
  #537 = NameAndType        #538:#489     // getPreviousParticipants:(Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List;
  #538 = Utf8               getPreviousParticipants
  #539 = Methodref          #540.#541     // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #540 = Class              #542          // ext/mods/gameserver/data/sql/PlayerInfoTable
  #541 = NameAndType        #11:#543      // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #542 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
  #543 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #544 = Methodref          #540.#545     // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
  #545 = NameAndType        #546:#206     // getPlayerName:(I)Ljava/lang/String;
  #546 = Utf8               getPlayerName
  #547 = Methodref          #162.#548     // java/lang/String.valueOf:(J)Ljava/lang/String;
  #548 = NameAndType        #145:#549     // valueOf:(J)Ljava/lang/String;
  #549 = Utf8               (J)Ljava/lang/String;
  #550 = Methodref          #162.#551     // java/lang/String.join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #551 = NameAndType        #552:#553     // join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #552 = Utf8               join
  #553 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #554 = Fieldref           #139.#555     // ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
  #555 = NameAndType        #556:#366     // NORMAL:Lext/mods/gameserver/enums/CabalType;
  #556 = Utf8               NORMAL
  #557 = Methodref          #530.#558     // ext/mods/gameserver/enums/FestivalType.values:()[Lext/mods/gameserver/enums/FestivalType;
  #558 = NameAndType        #226:#559     // values:()[Lext/mods/gameserver/enums/FestivalType;
  #559 = Utf8               ()[Lext/mods/gameserver/enums/FestivalType;
  #560 = Methodref          #530.#561     // ext/mods/gameserver/enums/FestivalType.getMaxScore:()I
  #561 = NameAndType        #562:#16      // getMaxScore:()I
  #562 = Utf8               getMaxScore
  #563 = InterfaceMethodref #208.#564     // java/util/List.get:(I)Ljava/lang/Object;
  #564 = NameAndType        #87:#565      // get:(I)Ljava/lang/Object;
  #565 = Utf8               (I)Ljava/lang/Object;
  #566 = Methodref          #8.#567       // ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
  #567 = NameAndType        #568:#569     // getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
  #568 = Utf8               getPlayerCabal
  #569 = Utf8               (I)Lext/mods/gameserver/enums/CabalType;
  #570 = Methodref          #8.#571       // ext/mods/gameserver/data/manager/SevenSignsManager.getWinningCabal:()Lext/mods/gameserver/enums/CabalType;
  #571 = NameAndType        #572:#573     // getWinningCabal:()Lext/mods/gameserver/enums/CabalType;
  #572 = Utf8               getWinningCabal
  #573 = Utf8               ()Lext/mods/gameserver/enums/CabalType;
  #574 = Methodref          #298.#575     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #575 = NameAndType        #576:#577     // getName:()Ljava/lang/String;
  #576 = Utf8               getName
  #577 = Utf8               ()Ljava/lang/String;
  #578 = Methodref          #162.#579     // java/lang/String.indexOf:(Ljava/lang/String;)I
  #579 = NameAndType        #580:#123     // indexOf:(Ljava/lang/String;)I
  #580 = Utf8               indexOf
  #581 = Fieldref           #18.#582      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._dawnPeace:Ljava/util/List;
  #582 = NameAndType        #583:#29      // _dawnPeace:Ljava/util/List;
  #583 = Utf8               _dawnPeace
  #584 = Fieldref           #18.#585      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager._duskPeace:Ljava/util/List;
  #585 = NameAndType        #586:#29      // _duskPeace:Ljava/util/List;
  #586 = Utf8               _duskPeace
  #587 = Methodref          #588.#402     // ext/mods/commons/util/LinTime.currentTimeMillis:()J
  #588 = Class              #589          // ext/mods/commons/util/LinTime
  #589 = Utf8               ext/mods/commons/util/LinTime
  #590 = Methodref          #81.#591      // java/util/Calendar.setTimeInMillis:(J)V
  #591 = NameAndType        #592:#92      // setTimeInMillis:(J)V
  #592 = Utf8               setTimeInMillis
  #593 = Fieldref           #594.#595     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
  #594 = Class              #596          // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$SingletonHolder
  #595 = NameAndType        #597:#598     // INSTANCE:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
  #596 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager$SingletonHolder
  #597 = Utf8               INSTANCE
  #598 = Utf8               Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
  #599 = Methodref          #600.#575     // java/lang/Class.getName:()Ljava/lang/String;
  #600 = Class              #601          // java/lang/Class
  #601 = Utf8               java/lang/Class
  #602 = Methodref          #72.#603      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #603 = NameAndType        #5:#287       // "<init>":(Ljava/lang/String;)V
  #604 = Class              #605          // "[I"
  #605 = Utf8               [I
  #606 = Integer            -79187
  #607 = Integer            113186
  #608 = Integer            -75918
  #609 = Integer            110137
  #610 = Integer            -73835
  #611 = Integer            111969
  #612 = Integer            -76170
  #613 = Integer            113804
  #614 = Integer            -78927
  #615 = Integer            109528
  #616 = Fieldref           #18.#617      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.FESTIVAL_DAWN_PLAYER_SPAWNS:[[I
  #617 = NameAndType        #618:#619     // FESTIVAL_DAWN_PLAYER_SPAWNS:[[I
  #618 = Utf8               FESTIVAL_DAWN_PLAYER_SPAWNS
  #619 = Utf8               [[I
  #620 = Integer            -77200
  #621 = Integer            88966
  #622 = Integer            -76941
  #623 = Integer            85307
  #624 = Integer            -74855
  #625 = Integer            87135
  #626 = Integer            -80208
  #627 = Integer            88222
  #628 = Integer            -79954
  #629 = Integer            84697
  #630 = Fieldref           #18.#631      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.FESTIVAL_DUSK_PLAYER_SPAWNS:[[I
  #631 = NameAndType        #632:#619     // FESTIVAL_DUSK_PLAYER_SPAWNS:[[I
  #632 = Utf8               FESTIVAL_DUSK_PLAYER_SPAWNS
  #633 = Utf8               RESTORE_FESTIVAL
  #634 = Utf8               Ljava/lang/String;
  #635 = Utf8               ConstantValue
  #636 = Utf8               RESTORE_FESTIVAL_2
  #637 = Utf8               INSERT_OR_UPDATE_FESTIVAL
  #638 = Utf8               GET_CLAN_NAME
  #639 = Utf8               FESTIVAL_COUNT
  #640 = Integer            5
  #641 = Utf8               FESTIVAL_OFFERING_ID
  #642 = Integer            5901
  #643 = Utf8               FESTIVAL_OFFERING_VALUE
  #644 = Utf8               Signature
  #645 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #646 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/zone/type/PeaceZone;>;
  #647 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;
  #648 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #649 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;>;
  #650 = Utf8               Code
  #651 = Utf8               LineNumberTable
  #652 = Utf8               LocalVariableTable
  #653 = Utf8               this
  #654 = Utf8               StackMapTable
  #655 = Utf8               minsToNextFestival
  #656 = Utf8               currentMinute
  #657 = Utf8               festivalCycle
  #658 = Utf8               Lext/mods/commons/data/StatSet;
  #659 = Utf8               map
  #660 = Utf8               rs
  #661 = Utf8               Ljava/sql/ResultSet;
  #662 = Utf8               ps
  #663 = Utf8               Ljava/sql/PreparedStatement;
  #664 = Utf8               i
  #665 = Utf8               con
  #666 = Utf8               Ljava/sql/Connection;
  #667 = Utf8               e
  #668 = Utf8               Ljava/lang/Exception;
  #669 = Utf8               LocalVariableTypeTable
  #670 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;
  #671 = Utf8               updateSettings
  #672 = Utf8               rewardHighestRanked
  #673 = Utf8               playerName
  #674 = Class              #675          // "[Ljava/lang/String;"
  #675 = Utf8               [Ljava/lang/String;
  #676 = Utf8               clan
  #677 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #678 = Utf8               clanName
  #679 = Utf8               player
  #680 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #681 = Utf8               resetFestivalData
  #682 = Utf8               bloodOfferings
  #683 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #684 = Utf8               getCurrentFestivalCycle
  #685 = Utf8               isFestivalInitialized
  #686 = Utf8               isFestivalInProgress
  #687 = Utf8               milliFromNow
  #688 = Utf8               getMinsToNextCycle
  #689 = Utf8               getTimeToNextFestivalStr
  #690 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #691 = Utf8               getTimeOfSSQ
  #692 = Utf8               participants
  #693 = Utf8               playerFestivalInfo
  #694 = Utf8               oracle
  #695 = Utf8               (Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List<Ljava/lang/Integer;>;
  #696 = Utf8               festivalParty
  #697 = Utf8               Lext/mods/gameserver/model/group/Party;
  #698 = Utf8               partyMember
  #699 = Utf8               partyMemberObjId
  #700 = Utf8               festivalInst
  #701 = Utf8               Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
  #702 = Utf8               playerFestInfo
  #703 = Utf8               getFinalScore
  #704 = Utf8               offsetId
  #705 = Utf8               currFestID
  #706 = Utf8               festivalScore
  #707 = Utf8               setToTest
  #708 = Utf8               highestScore
  #709 = Utf8               setFinalScore
  #710 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/CabalType;Lext/mods/gameserver/enums/FestivalType;I)Z
  #711 = Utf8               partyMembers
  #712 = Utf8               festival
  #713 = Utf8               Lext/mods/gameserver/enums/FestivalType;
  #714 = Utf8               offeringScore
  #715 = Utf8               currDawnHighScore
  #716 = Utf8               currDuskHighScore
  #717 = Utf8               thisCabalHighScore
  #718 = Utf8               otherCabalHighScore
  #719 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #720 = Utf8               getFestivalScore
  #721 = Utf8               (Lext/mods/gameserver/enums/CabalType;)I
  #722 = Utf8               festivalScoreOposite
  #723 = Utf8               festivalType
  #724 = Utf8               type
  #725 = Utf8               oposite
  #726 = Utf8               result
  #727 = Class              #728          // "[Lext/mods/gameserver/enums/FestivalType;"
  #728 = Utf8               [Lext/mods/gameserver/enums/FestivalType;
  #729 = Utf8               getAccumulatedBonus
  #730 = Utf8               getTotalAccumulatedBonus
  #731 = Utf8               accumBonus
  #732 = Utf8               totalAccumBonus
  #733 = Utf8               addAccumulatedBonus
  #734 = Utf8               (III)V
  #735 = Utf8               eachStoneBonus
  #736 = Utf8               stoneType
  #737 = Utf8               stoneAmount
  #738 = Utf8               newTotalBonus
  #739 = Utf8               distribAccumulatedBonus
  #740 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #741 = Utf8               numPartyMembers
  #742 = Utf8               playerBonus
  #743 = Utf8               addPeaceZone
  #744 = Utf8               (Lext/mods/gameserver/model/zone/type/PeaceZone;Z)V
  #745 = Utf8               zone
  #746 = Utf8               Lext/mods/gameserver/model/zone/type/PeaceZone;
  #747 = Utf8               getParticipantsDusk
  #748 = Utf8               ()Ljava/util/Map;
  #749 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;
  #750 = Utf8               getParticipantsDawn
  #751 = Utf8               c
  #752 = Utf8               Ljava/util/Calendar;
  #753 = Utf8               ()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
  #754 = Utf8               lambda$restoreFestivalData$0
  #755 = Utf8               (Ljava/lang/Integer;)Ljava/util/Map;
  #756 = Utf8               m
  #757 = Utf8               Ljava/lang/Integer;
  #758 = Utf8               <clinit>
  #759 = Utf8               SourceFile
  #760 = Utf8               FestivalOfDarknessManager.java
  #761 = Utf8               NestMembers
  #762 = Class              #763          // ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn
  #763 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn
  #764 = Utf8               BootstrapMethods
  #765 = MethodType         #438          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #766 = MethodHandle       6:#767        // REF_invokeStatic ext/mods/gameserver/data/manager/FestivalOfDarknessManager.lambda$restoreFestivalData$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #767 = Methodref          #18.#768      // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.lambda$restoreFestivalData$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #768 = NameAndType        #754:#755     // lambda$restoreFestivalData$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #769 = MethodType         #755          //  (Ljava/lang/Integer;)Ljava/util/Map;
  #770 = String             #771          // accumulated_bonus\u0001
  #771 = Utf8               accumulated_bonus\u0001
  #772 = MethodHandle       6:#773        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #773 = Methodref          #774.#775     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #774 = Class              #776          // java/lang/invoke/LambdaMetafactory
  #775 = NameAndType        #777:#778     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #776 = Utf8               java/lang/invoke/LambdaMetafactory
  #777 = Utf8               metafactory
  #778 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #779 = MethodHandle       6:#780        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #780 = Methodref          #781.#782     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #781 = Class              #783          // java/lang/invoke/StringConcatFactory
  #782 = NameAndType        #205:#784     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #783 = Utf8               java/lang/invoke/StringConcatFactory
  #784 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #785 = Utf8               InnerClasses
  #786 = Utf8               FestivalManager
  #787 = Utf8               L2DarknessFestival
  #788 = Utf8               SingletonHolder
  #789 = Utf8               FestivalSpawn
  #790 = Class              #791          // java/lang/invoke/MethodHandles$Lookup
  #791 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #792 = Class              #793          // java/lang/invoke/MethodHandles
  #793 = Utf8               java/lang/invoke/MethodHandles
  #794 = Utf8               Lookup
{
  public static final int FESTIVAL_COUNT;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 5

  public static final int FESTIVAL_OFFERING_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 5901

  public static final int FESTIVAL_OFFERING_VALUE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 5

  public static final int[][] FESTIVAL_DAWN_PLAYER_SPAWNS;
    descriptor: [[I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final int[][] FESTIVAL_DUSK_PLAYER_SPAWNS;
    descriptor: [[I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public ext.mods.gameserver.data.manager.FestivalOfDarknessManager$FestivalManager _managerInstance;
    descriptor: Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager;
    flags: (0x0001) ACC_PUBLIC

  protected int _signsCycle;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _festivalCycle;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected long _nextFestivalCycleStart;
    descriptor: J
    flags: (0x0004) ACC_PROTECTED

  protected long _nextFestivalStart;
    descriptor: J
    flags: (0x0004) ACC_PROTECTED

  protected boolean _festivalInitialized;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected boolean _festivalInProgress;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected java.util.List<java.lang.Integer> _accumulatedBonuses;
    descriptor: Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Signature: #645                         // Ljava/util/List<Ljava/lang/Integer;>;

  protected java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> _dawnFestivalParticipants;
    descriptor: Ljava/util/Map;
    flags: (0x0004) ACC_PROTECTED
    Signature: #647                         // Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;

  protected java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> _duskFestivalParticipants;
    descriptor: Ljava/util/Map;
    flags: (0x0004) ACC_PROTECTED
    Signature: #647                         // Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;

  protected java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> _dawnPreviousParticipants;
    descriptor: Ljava/util/Map;
    flags: (0x0004) ACC_PROTECTED
    Signature: #647                         // Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;

  protected java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> _duskPreviousParticipants;
    descriptor: Ljava/util/Map;
    flags: (0x0004) ACC_PROTECTED
    Signature: #647                         // Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;

  public ext.mods.gameserver.data.manager.FestivalOfDarknessManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokestatic  #7                  // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
         8: invokevirtual #13                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getCurrentCycle:()I
        11: putfield      #17                 // Field _signsCycle:I
        14: aload_0
        15: new           #23                 // class java/util/ArrayList
        18: dup
        19: invokespecial #25                 // Method java/util/ArrayList."<init>":()V
        22: putfield      #26                 // Field _accumulatedBonuses:Ljava/util/List;
        25: aload_0
        26: new           #30                 // class java/util/HashMap
        29: dup
        30: invokespecial #32                 // Method java/util/HashMap."<init>":()V
        33: putfield      #33                 // Field _dawnFestivalParticipants:Ljava/util/Map;
        36: aload_0
        37: new           #30                 // class java/util/HashMap
        40: dup
        41: invokespecial #32                 // Method java/util/HashMap."<init>":()V
        44: putfield      #37                 // Field _duskFestivalParticipants:Ljava/util/Map;
        47: aload_0
        48: new           #30                 // class java/util/HashMap
        51: dup
        52: invokespecial #32                 // Method java/util/HashMap."<init>":()V
        55: putfield      #40                 // Field _dawnPreviousParticipants:Ljava/util/Map;
        58: aload_0
        59: new           #30                 // class java/util/HashMap
        62: dup
        63: invokespecial #32                 // Method java/util/HashMap."<init>":()V
        66: putfield      #43                 // Field _duskPreviousParticipants:Ljava/util/Map;
        69: aload_0
        70: new           #30                 // class java/util/HashMap
        73: dup
        74: invokespecial #32                 // Method java/util/HashMap."<init>":()V
        77: putfield      #46                 // Field _dawnFestivalScores:Ljava/util/Map;
        80: aload_0
        81: new           #30                 // class java/util/HashMap
        84: dup
        85: invokespecial #32                 // Method java/util/HashMap."<init>":()V
        88: putfield      #49                 // Field _duskFestivalScores:Ljava/util/Map;
        91: aload_0
        92: new           #52                 // class java/util/concurrent/ConcurrentHashMap
        95: dup
        96: invokespecial #54                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        99: putfield      #55                 // Field _festivalData:Ljava/util/Map;
       102: aload_0
       103: invokevirtual #58                 // Method restoreFestivalData:()V
       106: invokestatic  #7                  // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       109: invokevirtual #61                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
       112: ifeq          124
       115: getstatic     #65                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       118: ldc           #69                 // String Seven Signs Festival initialization was bypassed due to Seal Validation being under effect.
       120: invokevirtual #71                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       123: return
       124: aload_0
       125: invokevirtual #77                 // Method startFestivalManager:()V
       128: return
      LineNumberTable:
        line 163: 0
        line 140: 4
        line 146: 14
        line 151: 25
        line 152: 36
        line 154: 47
        line 155: 58
        line 157: 69
        line 158: 80
        line 160: 91
        line 164: 102
        line 166: 106
        line 168: 115
        line 169: 123
        line 172: 124
        line 173: 128
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     129     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 124
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager ]
          stack = []

  public void startFestivalManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=1
         0: invokestatic  #80                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
         3: bipush        12
         5: invokevirtual #85                 // Method java/util/Calendar.get:(I)I
         8: istore_1
         9: iload_1
        10: bipush        40
        12: if_icmplt     23
        15: bipush        60
        17: iload_1
        18: isub
        19: istore_2
        20: goto          42
        23: iload_1
        24: bipush        20
        26: if_icmplt     37
        29: bipush        40
        31: iload_1
        32: isub
        33: istore_2
        34: goto          42
        37: bipush        20
        39: iload_1
        40: isub
        41: istore_2
        42: aload_0
        43: iload_2
        44: i2l
        45: invokevirtual #89                 // Method setNextFestivalStart:(J)V
        48: return
      LineNumberTable:
        line 180: 0
        line 183: 9
        line 184: 15
        line 185: 23
        line 186: 29
        line 188: 37
        line 190: 42
        line 191: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20       3     2 minsToNextFestival   I
           34       3     2 minsToNextFestival   I
            0      49     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            9      40     1 currentMinute   I
           42       7     2 minsToNextFestival   I
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ int ]

  protected void restoreFestivalData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=9, args_size=1
         0: invokestatic  #93                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #99                 // String SELECT festivalId, cabal, cycle, date, score, members FROM seven_signs_festival
         7: invokeinterface #101,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: invokeinterface #107,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        19: astore_3
        20: aload_3
        21: invokeinterface #113,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        26: ifeq          200
        29: aload_3
        30: ldc           #118                // String cycle
        32: invokeinterface #120,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        37: istore        4
        39: aload_3
        40: ldc           #124                // String festivalId
        42: invokeinterface #120,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        47: istore        5
        49: aload_3
        50: ldc           #126                // String cabal
        52: invokeinterface #128,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        57: astore        6
        59: new           #132                // class ext/mods/commons/data/StatSet
        62: dup
        63: invokespecial #134                // Method ext/mods/commons/data/StatSet."<init>":()V
        66: astore        7
        68: aload         7
        70: ldc           #124                // String festivalId
        72: iload         5
        74: invokevirtual #135                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
        77: aload         7
        79: ldc           #126                // String cabal
        81: ldc           #139                // class ext/mods/gameserver/enums/CabalType
        83: aload         6
        85: invokestatic  #141                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        88: invokevirtual #147                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/Enum;)V
        91: aload         7
        93: ldc           #118                // String cycle
        95: iload         4
        97: invokevirtual #135                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       100: aload         7
       102: ldc           #150                // String date
       104: aload_3
       105: ldc           #150                // String date
       107: invokeinterface #128,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       112: invokevirtual #152                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       115: aload         7
       117: ldc           #155                // String score
       119: aload_3
       120: ldc           #155                // String score
       122: invokeinterface #120,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       127: invokevirtual #135                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       130: aload         7
       132: ldc           #157                // String members
       134: aload_3
       135: ldc           #157                // String members
       137: invokeinterface #128,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       142: invokevirtual #152                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       145: aload         6
       147: ldc           #159                // String dawn
       149: invokevirtual #161                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       152: ifeq          158
       155: iinc          5, 5
       158: aload_0
       159: getfield      #55                 // Field _festivalData:Ljava/util/Map;
       162: iload         4
       164: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       167: invokedynamic #172,  0            // InvokeDynamic #0:apply:()Ljava/util/function/Function;
       172: invokeinterface #176,  3          // InterfaceMethod java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
       177: checkcast     #177                // class java/util/Map
       180: astore        8
       182: aload         8
       184: iload         5
       186: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       189: aload         7
       191: invokeinterface #182,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       196: pop
       197: goto          20
       200: aload_3
       201: ifnull        240
       204: aload_3
       205: invokeinterface #186,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       210: goto          240
       213: astore        4
       215: aload_3
       216: ifnull        237
       219: aload_3
       220: invokeinterface #186,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       225: goto          237
       228: astore        5
       230: aload         4
       232: aload         5
       234: invokevirtual #191                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       237: aload         4
       239: athrow
       240: aload_2
       241: ifnull        277
       244: aload_2
       245: invokeinterface #195,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       250: goto          277
       253: astore_3
       254: aload_2
       255: ifnull        275
       258: aload_2
       259: invokeinterface #195,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       264: goto          275
       267: astore        4
       269: aload_3
       270: aload         4
       272: invokevirtual #191                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       275: aload_3
       276: athrow
       277: aload_1
       278: ldc           #196                // String SELECT festival_cycle, accumulated_bonus0, accumulated_bonus1, accumulated_bonus2, accumulated_bonus3, accumulated_bonus4 FROM seven_signs_status WHERE id=0
       280: invokeinterface #101,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       285: astore_2
       286: aload_2
       287: invokeinterface #107,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       292: astore_3
       293: aload_3
       294: invokeinterface #113,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
       299: ifeq          359
       302: aload_0
       303: aload_3
       304: ldc           #198                // String festival_cycle
       306: invokeinterface #120,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       311: putfield      #200                // Field _festivalCycle:I
       314: iconst_0
       315: istore        4
       317: iload         4
       319: iconst_5
       320: if_icmpge     356
       323: aload_0
       324: getfield      #26                 // Field _accumulatedBonuses:Ljava/util/List;
       327: iload         4
       329: aload_3
       330: iload         4
       332: invokedynamic #203,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       337: invokeinterface #120,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       342: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       345: invokeinterface #207,  3          // InterfaceMethod java/util/List.add:(ILjava/lang/Object;)V
       350: iinc          4, 1
       353: goto          317
       356: goto          293
       359: aload_3
       360: ifnull        399
       363: aload_3
       364: invokeinterface #186,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       369: goto          399
       372: astore        4
       374: aload_3
       375: ifnull        396
       378: aload_3
       379: invokeinterface #186,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       384: goto          396
       387: astore        5
       389: aload         4
       391: aload         5
       393: invokevirtual #191                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       396: aload         4
       398: athrow
       399: aload_2
       400: ifnull        436
       403: aload_2
       404: invokeinterface #195,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       409: goto          436
       412: astore_3
       413: aload_2
       414: ifnull        434
       417: aload_2
       418: invokeinterface #195,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       423: goto          434
       426: astore        4
       428: aload_3
       429: aload         4
       431: invokevirtual #191                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       434: aload_3
       435: athrow
       436: aload_1
       437: ifnull        471
       440: aload_1
       441: invokeinterface #213,  1          // InterfaceMethod java/sql/Connection.close:()V
       446: goto          471
       449: astore_2
       450: aload_1
       451: ifnull        469
       454: aload_1
       455: invokeinterface #213,  1          // InterfaceMethod java/sql/Connection.close:()V
       460: goto          469
       463: astore_3
       464: aload_2
       465: aload_3
       466: invokevirtual #191                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       469: aload_2
       470: athrow
       471: goto          484
       474: astore_1
       475: getstatic     #65                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       478: ldc           #216                // String Couldn\'t load Seven Signs Festival data.
       480: aload_1
       481: invokevirtual #218                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       484: return
      Exception table:
         from    to  target type
            20   200   213   Class java/lang/Throwable
           219   225   228   Class java/lang/Throwable
            13   240   253   Class java/lang/Throwable
           258   264   267   Class java/lang/Throwable
           293   359   372   Class java/lang/Throwable
           378   384   387   Class java/lang/Throwable
           286   399   412   Class java/lang/Throwable
           417   423   426   Class java/lang/Throwable
             4   436   449   Class java/lang/Throwable
           454   460   463   Class java/lang/Throwable
             0   471   474   Class java/lang/Exception
      LineNumberTable:
        line 198: 0
        line 200: 4
        line 201: 13
        line 203: 20
        line 205: 29
        line 206: 39
        line 207: 49
        line 209: 59
        line 210: 68
        line 211: 77
        line 212: 91
        line 213: 100
        line 214: 115
        line 215: 130
        line 217: 145
        line 218: 155
        line 220: 158
        line 221: 182
        line 222: 197
        line 223: 200
        line 200: 213
        line 223: 240
        line 200: 253
        line 225: 277
        line 226: 286
        line 228: 293
        line 230: 302
        line 232: 314
        line 233: 323
        line 232: 350
        line 235: 359
        line 225: 372
        line 235: 399
        line 225: 412
        line 236: 436
        line 198: 449
        line 240: 471
        line 237: 474
        line 239: 475
        line 241: 484
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39     158     4 festivalCycle   I
           49     148     5 festivalId   I
           59     138     6 cabal   Ljava/lang/String;
           68     129     7   set   Lext/mods/commons/data/StatSet;
          182      15     8   map   Ljava/util/Map;
           20     220     3    rs   Ljava/sql/ResultSet;
           13     264     2    ps   Ljava/sql/PreparedStatement;
          317      39     4     i   I
          293     106     3    rs   Ljava/sql/ResultSet;
          286     150     2    ps   Ljava/sql/PreparedStatement;
            4     467     1   con   Ljava/sql/Connection;
          475       9     1     e   Ljava/lang/Exception;
            0     485     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          182      15     8   map   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;
      StackMapTable: number_of_entries = 29
        frame_type = 254 /* append */
          offset_delta = 20
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 255 /* full_frame */
          offset_delta = 137
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class java/lang/String, class ext/mods/commons/data/StatSet ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 253 /* append */
          offset_delta = 15
          locals = [ class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 38
        frame_type = 2 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void saveFestivalData(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=2
         0: invokestatic  #93                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_2
         4: aload_2
         5: ldc           #222                // String INSERT INTO seven_signs_festival (festivalId, cabal, cycle, date, score, members) VALUES (?,?,?,?,?,?) ON DUPLICATE KEY UPDATE date = VALUES(date), score = VALUES(score), members = VALUES(members)
         7: invokeinterface #101,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_3
        13: aload_0
        14: getfield      #55                 // Field _festivalData:Ljava/util/Map;
        17: invokeinterface #224,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        22: invokeinterface #228,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        27: astore        4
        29: aload         4
        31: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        36: ifeq          184
        39: aload         4
        41: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        46: checkcast     #177                // class java/util/Map
        49: astore        5
        51: aload         5
        53: invokeinterface #224,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        58: invokeinterface #228,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        63: astore        6
        65: aload         6
        67: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        72: ifeq          181
        75: aload         6
        77: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        82: checkcast     #132                // class ext/mods/commons/data/StatSet
        85: astore        7
        87: aload_3
        88: iconst_1
        89: aload         7
        91: ldc           #124                // String festivalId
        93: invokevirtual #242                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        96: invokeinterface #245,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       101: aload_3
       102: iconst_2
       103: aload         7
       105: ldc           #126                // String cabal
       107: invokevirtual #249                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       110: invokeinterface #250,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       115: aload_3
       116: iconst_3
       117: aload         7
       119: ldc           #118                // String cycle
       121: invokevirtual #242                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       124: invokeinterface #245,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       129: aload_3
       130: iconst_4
       131: aload         7
       133: ldc           #150                // String date
       135: invokevirtual #254                // Method ext/mods/commons/data/StatSet.getLong:(Ljava/lang/String;)J
       138: invokeinterface #258,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       143: aload_3
       144: iconst_5
       145: aload         7
       147: ldc           #155                // String score
       149: invokevirtual #242                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       152: invokeinterface #245,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       157: aload_3
       158: bipush        6
       160: aload         7
       162: ldc           #157                // String members
       164: invokevirtual #249                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       167: invokeinterface #250,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       172: aload_3
       173: invokeinterface #262,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       178: goto          65
       181: goto          29
       184: aload_3
       185: invokeinterface #265,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       190: pop
       191: aload_3
       192: ifnull        231
       195: aload_3
       196: invokeinterface #195,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       201: goto          231
       204: astore        4
       206: aload_3
       207: ifnull        228
       210: aload_3
       211: invokeinterface #195,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       216: goto          228
       219: astore        5
       221: aload         4
       223: aload         5
       225: invokevirtual #191                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       228: aload         4
       230: athrow
       231: aload_2
       232: ifnull        268
       235: aload_2
       236: invokeinterface #213,  1          // InterfaceMethod java/sql/Connection.close:()V
       241: goto          268
       244: astore_3
       245: aload_2
       246: ifnull        266
       249: aload_2
       250: invokeinterface #213,  1          // InterfaceMethod java/sql/Connection.close:()V
       255: goto          266
       258: astore        4
       260: aload_3
       261: aload         4
       263: invokevirtual #191                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       266: aload_3
       267: athrow
       268: goto          282
       271: astore_2
       272: getstatic     #65                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       275: ldc_w         #269                // String Couldn\'t save Seven Signs Festival data.
       278: aload_2
       279: invokevirtual #218                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       282: iload_1
       283: ifeq          292
       286: invokestatic  #7                  // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       289: invokevirtual #271                // Method ext/mods/gameserver/data/manager/SevenSignsManager.saveSevenSignsStatus:()V
       292: return
      Exception table:
         from    to  target type
            13   191   204   Class java/lang/Throwable
           210   216   219   Class java/lang/Throwable
             4   231   244   Class java/lang/Throwable
           249   255   258   Class java/lang/Throwable
             0   268   271   Class java/lang/Exception
      LineNumberTable:
        line 251: 0
        line 252: 4
        line 254: 13
        line 256: 51
        line 258: 87
        line 259: 101
        line 260: 115
        line 261: 129
        line 262: 143
        line 263: 157
        line 264: 172
        line 265: 178
        line 266: 181
        line 267: 184
        line 268: 191
        line 251: 204
        line 268: 231
        line 251: 244
        line 272: 268
        line 269: 271
        line 271: 272
        line 274: 282
        line 275: 286
        line 276: 292
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           87      91     7   set   Lext/mods/commons/data/StatSet;
           51     130     5   map   Ljava/util/Map;
           13     218     3    ps   Ljava/sql/PreparedStatement;
            4     264     2   con   Ljava/sql/Connection;
          272      10     2     e   Ljava/lang/Exception;
            0     293     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0     293     1 updateSettings   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           51     130     5   map   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;
      StackMapTable: number_of_entries = 15
        frame_type = 254 /* append */
          offset_delta = 29
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class java/util/Map, class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 115
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 9 /* same */

  public void rewardHighestRanked();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=1
         0: iconst_0
         1: istore_1
         2: iload_1
         3: iconst_5
         4: if_icmpge     67
         7: aload_0
         8: iload_1
         9: invokevirtual #274                // Method getOverallHighestScoreData:(I)Lext/mods/commons/data/StatSet;
        12: astore_2
        13: aload_2
        14: ifnull        61
        17: aload_2
        18: ldc           #157                // String members
        20: invokevirtual #249                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        23: ldc_w         #278                // String ,
        26: invokevirtual #280                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        29: astore_3
        30: aload_3
        31: arraylength
        32: istore        4
        34: iconst_0
        35: istore        5
        37: iload         5
        39: iload         4
        41: if_icmpge     61
        44: aload_3
        45: iload         5
        47: aaload
        48: astore        6
        50: aload         6
        52: invokestatic  #284                // Method addReputationPointsForPartyMemberClan:(Ljava/lang/String;)V
        55: iinc          5, 1
        58: goto          37
        61: iinc          1, 1
        64: goto          2
        67: return
      LineNumberTable:
        line 280: 0
        line 282: 7
        line 283: 13
        line 285: 17
        line 286: 50
        line 285: 55
        line 280: 61
        line 289: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           50       5     6 playerName   Ljava/lang/String;
           13      48     2   set   Lext/mods/commons/data/StatSet;
            2      65     1     i   I
            0      68     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, int, class ext/mods/commons/data/StatSet, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 5

  public void resetFestivalData(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=2
         0: aload_0
         1: iconst_0
         2: putfield      #200                // Field _festivalCycle:I
         5: aload_0
         6: invokestatic  #7                  // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
         9: invokevirtual #13                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.getCurrentCycle:()I
        12: putfield      #17                 // Field _signsCycle:I
        15: iconst_0
        16: istore_2
        17: iload_2
        18: iconst_5
        19: if_icmpge     43
        22: aload_0
        23: getfield      #26                 // Field _accumulatedBonuses:Ljava/util/List;
        26: iload_2
        27: iconst_0
        28: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        31: invokeinterface #353,  3          // InterfaceMethod java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
        36: pop
        37: iinc          2, 1
        40: goto          17
        43: aload_0
        44: getfield      #33                 // Field _dawnFestivalParticipants:Ljava/util/Map;
        47: invokeinterface #356,  1          // InterfaceMethod java/util/Map.clear:()V
        52: aload_0
        53: getfield      #37                 // Field _duskFestivalParticipants:Ljava/util/Map;
        56: invokeinterface #356,  1          // InterfaceMethod java/util/Map.clear:()V
        61: aload_0
        62: getfield      #40                 // Field _dawnPreviousParticipants:Ljava/util/Map;
        65: invokeinterface #356,  1          // InterfaceMethod java/util/Map.clear:()V
        70: aload_0
        71: getfield      #43                 // Field _duskPreviousParticipants:Ljava/util/Map;
        74: invokeinterface #356,  1          // InterfaceMethod java/util/Map.clear:()V
        79: aload_0
        80: getfield      #46                 // Field _dawnFestivalScores:Ljava/util/Map;
        83: invokeinterface #356,  1          // InterfaceMethod java/util/Map.clear:()V
        88: aload_0
        89: getfield      #49                 // Field _duskFestivalScores:Ljava/util/Map;
        92: invokeinterface #356,  1          // InterfaceMethod java/util/Map.clear:()V
        97: new           #30                 // class java/util/HashMap
       100: dup
       101: invokespecial #32                 // Method java/util/HashMap."<init>":()V
       104: astore_2
       105: iconst_0
       106: istore_3
       107: iload_3
       108: bipush        10
       110: if_icmpge     221
       113: iload_3
       114: istore        4
       116: iload_3
       117: iconst_5
       118: if_icmplt     124
       121: iinc          4, -5
       124: new           #132                // class ext/mods/commons/data/StatSet
       127: dup
       128: invokespecial #134                // Method ext/mods/commons/data/StatSet."<init>":()V
       131: astore        5
       133: aload         5
       135: ldc           #124                // String festivalId
       137: iload         4
       139: invokevirtual #135                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       142: aload         5
       144: ldc           #118                // String cycle
       146: aload_0
       147: getfield      #17                 // Field _signsCycle:I
       150: invokevirtual #135                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       153: aload         5
       155: ldc           #150                // String date
       157: ldc_w         #359                // String 0
       160: invokevirtual #152                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       163: aload         5
       165: ldc           #155                // String score
       167: iconst_0
       168: invokevirtual #135                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       171: aload         5
       173: ldc           #157                // String members
       175: ldc_w         #361                // String
       178: invokevirtual #152                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       181: aload         5
       183: ldc           #126                // String cabal
       185: iload_3
       186: iconst_5
       187: if_icmplt     196
       190: getstatic     #363                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       193: goto          199
       196: getstatic     #367                // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       199: invokevirtual #147                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/Enum;)V
       202: aload_2
       203: iload_3
       204: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       207: aload         5
       209: invokeinterface #182,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       214: pop
       215: iinc          3, 1
       218: goto          107
       221: aload_0
       222: getfield      #55                 // Field _festivalData:Ljava/util/Map;
       225: aload_0
       226: getfield      #17                 // Field _signsCycle:I
       229: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       232: aload_2
       233: invokeinterface #182,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       238: pop
       239: aload_0
       240: iload_1
       241: invokevirtual #370                // Method saveFestivalData:(Z)V
       244: invokestatic  #288                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       247: invokevirtual #374                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
       250: invokeinterface #228,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       255: astore_3
       256: aload_3
       257: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       262: ifeq          306
       265: aload_3
       266: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       271: checkcast     #298                // class ext/mods/gameserver/model/actor/Player
       274: astore        4
       276: aload         4
       278: invokevirtual #377                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       281: sipush        5901
       284: invokevirtual #381                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       287: astore        5
       289: aload         5
       291: ifnull        303
       294: aload         4
       296: aload         5
       298: iconst_0
       299: invokevirtual #387                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
       302: pop
       303: goto          256
       306: getstatic     #65                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       309: ldc_w         #391                // String Reinitialized Seven Signs Festival for next competition period.
       312: invokevirtual #71                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       315: return
      LineNumberTable:
        line 339: 0
        line 340: 5
        line 342: 15
        line 343: 22
        line 342: 37
        line 345: 43
        line 346: 52
        line 348: 61
        line 349: 70
        line 351: 79
        line 352: 88
        line 354: 97
        line 356: 105
        line 358: 113
        line 360: 116
        line 361: 121
        line 363: 124
        line 364: 133
        line 365: 142
        line 366: 153
        line 367: 163
        line 368: 171
        line 369: 181
        line 371: 202
        line 356: 215
        line 374: 221
        line 376: 239
        line 378: 244
        line 380: 276
        line 381: 289
        line 382: 294
        line 383: 303
        line 385: 306
        line 386: 315
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17      26     2     i   I
          116      99     4 festivalId   I
          133      82     5   set   Lext/mods/commons/data/StatSet;
          107     114     3     i   I
          289      14     5 bloodOfferings   Lext/mods/gameserver/model/item/instance/ItemInstance;
          276      27     4 player   Lext/mods/gameserver/model/actor/Player;
            0     316     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0     316     1 updateSettings   Z
          105     211     2   map   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          105     211     2   map   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;
      StackMapTable: number_of_entries = 10
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 25
        frame_type = 253 /* append */
          offset_delta = 63
          locals = [ class java/util/Map, int ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, int, class java/util/Map, int, int, class ext/mods/commons/data/StatSet ]
          stack = [ class ext/mods/commons/data/StatSet, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, int, class java/util/Map, int, int, class ext/mods/commons/data/StatSet ]
          stack = [ class ext/mods/commons/data/StatSet, class java/lang/String, class ext/mods/gameserver/enums/CabalType ]
        frame_type = 248 /* chop */
          offset_delta = 21
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class java/util/Iterator ]
        frame_type = 46 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public final int getCurrentFestivalCycle();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #200                // Field _festivalCycle:I
         4: ireturn
      LineNumberTable:
        line 390: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;

  public final boolean isFestivalInitialized();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #393                // Field _festivalInitialized:Z
         4: ireturn
      LineNumberTable:
        line 395: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;

  public final boolean isFestivalInProgress();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #397                // Field _festivalInProgress:Z
         4: ireturn
      LineNumberTable:
        line 400: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;

  public void setNextFestivalStart(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: invokestatic  #400                // Method java/lang/System.currentTimeMillis:()J
         4: lload_1
         5: ladd
         6: putfield      #406                // Field _nextFestivalStart:J
         9: return
      LineNumberTable:
        line 405: 0
        line 406: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0      10     1 milliFromNow   J

  public final int getMinsToNextCycle();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: invokestatic  #7                  // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
         3: invokevirtual #61                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
         6: ifeq          11
         9: iconst_m1
        10: ireturn
        11: aload_0
        12: getfield      #410                // Field _nextFestivalCycleStart:J
        15: invokestatic  #400                // Method java/lang/System.currentTimeMillis:()J
        18: lsub
        19: ldc2_w        #413                // long 60000l
        22: ldiv
        23: l2f
        24: invokestatic  #415                // Method java/lang/Math.round:(F)I
        27: ireturn
      LineNumberTable:
        line 410: 0
        line 411: 9
        line 413: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */

  public final java.lang.String getTimeToNextFestivalStr(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=4, args_size=2
         0: invokestatic  #7                  // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
         3: invokevirtual #61                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
         6: ifeq          21
         9: aload_1
        10: sipush        10164
        13: iconst_0
        14: anewarray     #2                  // class java/lang/Object
        17: invokevirtual #421                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        20: areturn
        21: invokestatic  #425                // Method getMin:()I
        24: istore_2
        25: iconst_0
        26: istore_3
        27: iload_2
        28: bipush        58
        30: if_icmpeq     63
        33: iload_2
        34: bipush        18
        36: if_icmpeq     63
        39: iload_2
        40: bipush        38
        42: if_icmpeq     63
        45: iload_2
        46: bipush        59
        48: if_icmpeq     63
        51: iload_2
        52: bipush        19
        54: if_icmpeq     63
        57: iload_2
        58: bipush        39
        60: if_icmpne     70
        63: ldc_w         #428                // int 1000441
        66: invokestatic  #429                // Method ext/mods/gameserver/network/NpcStringId.getNpcMessage:(I)Ljava/lang/String;
        69: areturn
        70: iload_2
        71: bipush        39
        73: if_icmple     84
        76: bipush        58
        78: iload_2
        79: isub
        80: istore_3
        81: goto          103
        84: iload_2
        85: bipush        19
        87: if_icmple     98
        90: bipush        38
        92: iload_2
        93: isub
        94: istore_3
        95: goto          103
        98: bipush        18
       100: iload_2
       101: isub
       102: istore_3
       103: aload_1
       104: sipush        10165
       107: iconst_1
       108: anewarray     #2                  // class java/lang/Object
       111: dup
       112: iconst_0
       113: iload_3
       114: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       117: aastore
       118: invokevirtual #421                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       121: areturn
      LineNumberTable:
        line 418: 0
        line 419: 9
        line 421: 21
        line 422: 25
        line 424: 27
        line 425: 63
        line 428: 70
        line 429: 76
        line 430: 84
        line 431: 90
        line 433: 98
        line 436: 103
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     122     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0     122     1 player   Lext/mods/gameserver/model/actor/Player;
           25      97     2 currentMinute   I
           27      95     3 minsToNextFestival   I
      StackMapTable: number_of_entries = 6
        frame_type = 21 /* same */
        frame_type = 253 /* append */
          offset_delta = 41
          locals = [ int, int ]
        frame_type = 6 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 4 /* same */

  public final int getTimeOfSSQ();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #406                // Field _nextFestivalStart:J
         4: ldc2_w        #434                // long 1000l
         7: ldiv
         8: l2i
         9: ireturn
      LineNumberTable:
        line 441: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;

  public final int[] getFestivalForPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)[I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=2
         0: iconst_2
         1: newarray       int
         3: dup
         4: iconst_0
         5: iconst_m1
         6: iastore
         7: dup
         8: iconst_1
         9: iconst_m1
        10: iastore
        11: astore_2
        12: iconst_0
        13: istore_3
        14: iload_3
        15: iconst_5
        16: if_icmpge     138
        19: aload_0
        20: getfield      #33                 // Field _dawnFestivalParticipants:Ljava/util/Map;
        23: iload_3
        24: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        27: invokeinterface #436,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        32: checkcast     #208                // class java/util/List
        35: astore        4
        37: aload         4
        39: ifnull        74
        42: aload         4
        44: aload_1
        45: invokevirtual #439                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        48: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        51: invokeinterface #442,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        56: ifeq          74
        59: aload_2
        60: iconst_0
        61: getstatic     #363                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
        64: invokevirtual #446                // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
        67: iastore
        68: aload_2
        69: iconst_1
        70: iload_3
        71: iastore
        72: aload_2
        73: areturn
        74: aload_0
        75: getfield      #37                 // Field _duskFestivalParticipants:Ljava/util/Map;
        78: iinc          3, 1
        81: iload_3
        82: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        85: invokeinterface #436,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        90: checkcast     #208                // class java/util/List
        93: astore        4
        95: aload         4
        97: ifnull        132
       100: aload         4
       102: aload_1
       103: invokevirtual #439                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       106: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       109: invokeinterface #442,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       114: ifeq          132
       117: aload_2
       118: iconst_0
       119: getstatic     #367                // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       122: invokevirtual #446                // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
       125: iastore
       126: aload_2
       127: iconst_1
       128: iload_3
       129: iastore
       130: aload_2
       131: areturn
       132: iinc          3, 1
       135: goto          14
       138: aload_2
       139: areturn
      LineNumberTable:
        line 451: 0
        line 456: 12
        line 458: 14
        line 460: 19
        line 462: 37
        line 464: 59
        line 465: 68
        line 467: 72
        line 470: 74
        line 472: 95
        line 474: 117
        line 475: 126
        line 477: 130
        line 480: 132
        line 481: 135
        line 483: 138
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37      98     4 participants   Ljava/util/List;
            0     140     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0     140     1 player   Lext/mods/gameserver/model/actor/Player;
           12     128     2 playerFestivalInfo   [I
           14     126     3 festivalId   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           37      98     4 participants   Ljava/util/List<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ class "[I", int ]
        frame_type = 252 /* append */
          offset_delta = 59
          locals = [ class java/util/List ]
        frame_type = 57 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5

  public final boolean isParticipant(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=2
         0: invokestatic  #7                  // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
         3: invokevirtual #61                 // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
         6: ifeq          11
         9: iconst_0
        10: ireturn
        11: aload_0
        12: getfield      #33                 // Field _dawnFestivalParticipants:Ljava/util/Map;
        15: invokeinterface #224,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        20: invokeinterface #228,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        25: astore_2
        26: aload_2
        27: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        32: ifeq          70
        35: aload_2
        36: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        41: checkcast     #208                // class java/util/List
        44: astore_3
        45: aload_3
        46: ifnull        67
        49: aload_3
        50: aload_1
        51: invokevirtual #439                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        54: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        57: invokeinterface #442,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        62: ifeq          67
        65: iconst_1
        66: ireturn
        67: goto          26
        70: aload_0
        71: getfield      #37                 // Field _duskFestivalParticipants:Ljava/util/Map;
        74: invokeinterface #224,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        79: invokeinterface #228,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        84: astore_2
        85: aload_2
        86: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        91: ifeq          129
        94: aload_2
        95: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       100: checkcast     #208                // class java/util/List
       103: astore_3
       104: aload_3
       105: ifnull        126
       108: aload_3
       109: aload_1
       110: invokevirtual #439                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       113: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       116: invokeinterface #442,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       121: ifeq          126
       124: iconst_1
       125: ireturn
       126: goto          85
       129: iconst_0
       130: ireturn
      LineNumberTable:
        line 488: 0
        line 489: 9
        line 492: 11
        line 493: 45
        line 494: 65
        line 493: 67
        line 496: 70
        line 497: 104
        line 498: 124
        line 497: 126
        line 500: 129
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           45      22     3 participants   Ljava/util/List;
          104      22     3 participants   Ljava/util/List;
            0     131     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0     131     1 player   Lext/mods/gameserver/model/actor/Player;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           45      22     3 participants   Ljava/util/List<Ljava/lang/Integer;>;
          104      22     3 participants   Ljava/util/List<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 7
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 40 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 40 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public final java.util.List<java.lang.Integer> getParticipants(ext.mods.gameserver.enums.CabalType, int);
    descriptor: (Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: getstatic     #363                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
         4: if_acmpne     24
         7: aload_0
         8: getfield      #33                 // Field _dawnFestivalParticipants:Ljava/util/Map;
        11: iload_2
        12: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        15: invokeinterface #436,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        20: checkcast     #208                // class java/util/List
        23: areturn
        24: aload_0
        25: getfield      #37                 // Field _duskFestivalParticipants:Ljava/util/Map;
        28: iload_2
        29: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        32: invokeinterface #436,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        37: checkcast     #208                // class java/util/List
        40: areturn
      LineNumberTable:
        line 505: 0
        line 506: 7
        line 508: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0      41     1 oracle   Lext/mods/gameserver/enums/CabalType;
            0      41     2 festivalId   I
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */
    Signature: #695                         // (Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List<Ljava/lang/Integer;>;

  public final java.util.List<java.lang.Integer> getPreviousParticipants(ext.mods.gameserver.enums.CabalType, int);
    descriptor: (Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: getstatic     #363                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
         4: if_acmpne     24
         7: aload_0
         8: getfield      #40                 // Field _dawnPreviousParticipants:Ljava/util/Map;
        11: iload_2
        12: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        15: invokeinterface #436,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        20: checkcast     #208                // class java/util/List
        23: areturn
        24: aload_0
        25: getfield      #43                 // Field _duskPreviousParticipants:Ljava/util/Map;
        28: iload_2
        29: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        32: invokeinterface #436,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        37: checkcast     #208                // class java/util/List
        40: areturn
      LineNumberTable:
        line 513: 0
        line 514: 7
        line 516: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0      41     1 oracle   Lext/mods/gameserver/enums/CabalType;
            0      41     2 festivalId   I
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */
    Signature: #695                         // (Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List<Ljava/lang/Integer;>;

  public void setParticipants(ext.mods.gameserver.enums.CabalType, int, ext.mods.gameserver.model.group.Party);
    descriptor: (Lext/mods/gameserver/enums/CabalType;ILext/mods/gameserver/model/group/Party;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=4
         0: aconst_null
         1: astore        4
         3: aload_3
         4: ifnull        72
         7: new           #23                 // class java/util/ArrayList
        10: dup
        11: aload_3
        12: invokevirtual #449                // Method ext/mods/gameserver/model/group/Party.getMembersCount:()I
        15: invokespecial #454                // Method java/util/ArrayList."<init>":(I)V
        18: astore        4
        20: aload_3
        21: invokevirtual #457                // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        24: invokeinterface #461,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        29: astore        5
        31: aload         5
        33: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        38: ifeq          72
        41: aload         5
        43: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        48: checkcast     #298                // class ext/mods/gameserver/model/actor/Player
        51: astore        6
        53: aload         4
        55: aload         6
        57: invokevirtual #439                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        60: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        63: invokeinterface #462,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        68: pop
        69: goto          31
        72: aload_1
        73: getstatic     #363                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
        76: if_acmpne     98
        79: aload_0
        80: getfield      #33                 // Field _dawnFestivalParticipants:Ljava/util/Map;
        83: iload_2
        84: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        87: aload         4
        89: invokeinterface #182,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        94: pop
        95: goto          114
        98: aload_0
        99: getfield      #37                 // Field _duskFestivalParticipants:Ljava/util/Map;
       102: iload_2
       103: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       106: aload         4
       108: invokeinterface #182,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       113: pop
       114: return
      LineNumberTable:
        line 521: 0
        line 523: 3
        line 525: 7
        line 526: 20
        line 527: 53
        line 530: 72
        line 531: 79
        line 533: 98
        line 534: 114
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      16     6 player   Lext/mods/gameserver/model/actor/Player;
            0     115     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0     115     1 oracle   Lext/mods/gameserver/enums/CabalType;
            0     115     2 festivalId   I
            0     115     3 festivalParty   Lext/mods/gameserver/model/group/Party;
            3     112     4 participants   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            3     112     4 participants   Ljava/util/List<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 40
        frame_type = 25 /* same */
        frame_type = 15 /* same */

  public void updateParticipants(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.group.Party);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #464                // Method isParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
         5: ifne          9
         8: return
         9: aload_0
        10: aload_1
        11: invokevirtual #468                // Method getFestivalForPlayer:(Lext/mods/gameserver/model/actor/Player;)[I
        14: astore_3
        15: getstatic     #472                // Field ext/mods/gameserver/enums/CabalType.VALUES:[Lext/mods/gameserver/enums/CabalType;
        18: aload_3
        19: iconst_0
        20: iaload
        21: aaload
        22: astore        4
        24: aload_3
        25: iconst_1
        26: iaload
        27: istore        5
        29: iload         5
        31: iconst_m1
        32: if_icmple     175
        35: aload_0
        36: getfield      #393                // Field _festivalInitialized:Z
        39: ifeq          138
        42: aload_0
        43: getfield      #476                // Field _managerInstance:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager;
        46: aload         4
        48: iload         5
        50: invokevirtual #480                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager.getFestivalInstance:(Lext/mods/gameserver/enums/CabalType;I)Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
        53: astore        6
        55: aload_2
        56: ifnonnull     131
        59: aload_0
        60: aload         4
        62: iload         5
        64: invokevirtual #486                // Method getParticipants:(Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List;
        67: invokeinterface #461,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        72: astore        7
        74: aload         7
        76: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        81: ifeq          128
        84: aload         7
        86: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        91: checkcast     #168                // class java/lang/Integer
        94: invokevirtual #490                // Method java/lang/Integer.intValue:()I
        97: istore        8
        99: invokestatic  #288                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       102: iload         8
       104: invokevirtual #493                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
       107: astore        9
       109: aload         9
       111: ifnonnull     117
       114: goto          74
       117: aload         6
       119: aload         9
       121: iconst_1
       122: invokevirtual #496                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival.relocatePlayer:(Lext/mods/gameserver/model/actor/Player;Z)V
       125: goto          74
       128: goto          138
       131: aload         6
       133: aload_1
       134: iconst_1
       135: invokevirtual #496                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival.relocatePlayer:(Lext/mods/gameserver/model/actor/Player;Z)V
       138: aload_0
       139: aload         4
       141: iload         5
       143: aload_2
       144: invokevirtual #502                // Method setParticipants:(Lext/mods/gameserver/enums/CabalType;ILext/mods/gameserver/model/group/Party;)V
       147: aload_2
       148: ifnull        175
       151: aload_2
       152: invokevirtual #449                // Method ext/mods/gameserver/model/group/Party.getMembersCount:()I
       155: getstatic     #506                // Field ext/mods/Config.FESTIVAL_MIN_PLAYER:I
       158: if_icmpge     175
       161: aload_0
       162: aload_1
       163: aconst_null
       164: invokevirtual #511                // Method updateParticipants:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/Party;)V
       167: aload_2
       168: aload_1
       169: getstatic     #515                // Field ext/mods/gameserver/enums/MessageType.EXPELLED:Lext/mods/gameserver/enums/MessageType;
       172: invokevirtual #521                // Method ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
       175: return
      LineNumberTable:
        line 538: 0
        line 539: 8
        line 541: 9
        line 542: 15
        line 543: 24
        line 545: 29
        line 547: 35
        line 549: 42
        line 551: 55
        line 553: 59
        line 555: 99
        line 556: 109
        line 557: 114
        line 559: 117
        line 560: 125
        line 563: 131
        line 566: 138
        line 568: 147
        line 570: 161
        line 571: 167
        line 574: 175
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          109      16     9 partyMember   Lext/mods/gameserver/model/actor/Player;
           99      26     8 partyMemberObjId   I
           55      83     6 festivalInst   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival;
            0     176     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0     176     1 player   Lext/mods/gameserver/model/actor/Player;
            0     176     2 festivalParty   Lext/mods/gameserver/model/group/Party;
           15     161     3 playerFestInfo   [I
           24     152     4 oracle   Lext/mods/gameserver/enums/CabalType;
           29     147     5 festivalId   I
      StackMapTable: number_of_entries = 7
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 64
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/group/Party, class "[I", class ext/mods/gameserver/enums/CabalType, int, class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival, class java/util/Iterator ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 42
          locals = [ int, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 248 /* chop */
          offset_delta = 10
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 36 /* same */

  public final int getFinalScore(ext.mods.gameserver.enums.CabalType, int);
    descriptor: (Lext/mods/gameserver/enums/CabalType;I)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: getstatic     #363                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
         4: if_acmpne     27
         7: aload_0
         8: getfield      #46                 // Field _dawnFestivalScores:Ljava/util/Map;
        11: iload_2
        12: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        15: invokeinterface #436,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        20: checkcast     #168                // class java/lang/Integer
        23: invokevirtual #490                // Method java/lang/Integer.intValue:()I
        26: ireturn
        27: aload_0
        28: getfield      #49                 // Field _duskFestivalScores:Ljava/util/Map;
        31: iload_2
        32: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        35: invokeinterface #436,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        40: checkcast     #168                // class java/lang/Integer
        43: invokevirtual #490                // Method java/lang/Integer.intValue:()I
        46: ireturn
      LineNumberTable:
        line 578: 0
        line 579: 7
        line 581: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0      47     1 oracle   Lext/mods/gameserver/enums/CabalType;
            0      47     2 festivalId   I
      StackMapTable: number_of_entries = 1
        frame_type = 27 /* same */

  public final int getHighestScore(ext.mods.gameserver.enums.CabalType, int);
    descriptor: (Lext/mods/gameserver/enums/CabalType;I)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokevirtual #525                // Method getHighestScoreData:(Lext/mods/gameserver/enums/CabalType;I)Lext/mods/commons/data/StatSet;
         6: ldc           #155                // String score
         8: invokevirtual #242                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        11: ireturn
      LineNumberTable:
        line 586: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0      12     1 oracle   Lext/mods/gameserver/enums/CabalType;
            0      12     2 festivalId   I

  public final ext.mods.commons.data.StatSet getHighestScoreData(ext.mods.gameserver.enums.CabalType, int);
    descriptor: (Lext/mods/gameserver/enums/CabalType;I)Lext/mods/commons/data/StatSet;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=3
         0: iload_2
         1: istore_3
         2: aload_1
         3: getstatic     #363                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
         6: if_acmpne     12
         9: iinc          3, 5
        12: aload_0
        13: getfield      #55                 // Field _festivalData:Ljava/util/Map;
        16: aload_0
        17: getfield      #17                 // Field _signsCycle:I
        20: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        23: invokeinterface #436,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        28: checkcast     #177                // class java/util/Map
        31: iload_3
        32: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        35: invokeinterface #436,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        40: checkcast     #132                // class ext/mods/commons/data/StatSet
        43: areturn
      LineNumberTable:
        line 596: 0
        line 597: 2
        line 598: 9
        line 600: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0      44     1 oracle   Lext/mods/gameserver/enums/CabalType;
            0      44     2 festivalId   I
            2      42     3 offsetId   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ int ]

  public final ext.mods.commons.data.StatSet getOverallHighestScoreData(int);
    descriptor: (I)Lext/mods/commons/data/StatSet;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=10, args_size=2
         0: aconst_null
         1: astore_2
         2: iconst_0
         3: istore_3
         4: aload_0
         5: getfield      #55                 // Field _festivalData:Ljava/util/Map;
         8: invokeinterface #224,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        13: invokeinterface #228,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        18: astore        4
        20: aload         4
        22: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        27: ifeq          123
        30: aload         4
        32: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        37: checkcast     #177                // class java/util/Map
        40: astore        5
        42: aload         5
        44: invokeinterface #224,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        49: invokeinterface #228,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        54: astore        6
        56: aload         6
        58: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        63: ifeq          120
        66: aload         6
        68: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        73: checkcast     #132                // class ext/mods/commons/data/StatSet
        76: astore        7
        78: aload         7
        80: ldc           #124                // String festivalId
        82: invokevirtual #242                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        85: istore        8
        87: aload         7
        89: ldc           #155                // String score
        91: invokevirtual #242                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        94: istore        9
        96: iload         8
        98: iload_1
        99: if_icmpeq     105
       102: goto          56
       105: iload         9
       107: iload_3
       108: if_icmple     117
       111: iload         9
       113: istore_3
       114: aload         7
       116: astore_2
       117: goto          56
       120: goto          20
       123: aload_2
       124: areturn
      LineNumberTable:
        line 609: 0
        line 610: 2
        line 612: 4
        line 614: 42
        line 616: 78
        line 617: 87
        line 619: 96
        line 620: 102
        line 622: 105
        line 624: 111
        line 625: 114
        line 627: 117
        line 628: 120
        line 630: 123
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           87      30     8 currFestID   I
           96      21     9 festivalScore   I
           78      39     7 setToTest   Lext/mods/commons/data/StatSet;
           42      78     5   map   Ljava/util/Map;
            0     125     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0     125     1 festivalId   I
            2     123     2   set   Lext/mods/commons/data/StatSet;
            4     121     3 highestScore   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           42      78     5   map   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;
      StackMapTable: number_of_entries = 6
        frame_type = 254 /* append */
          offset_delta = 20
          locals = [ class ext/mods/commons/data/StatSet, int, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class java/util/Map, class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 48
          locals = [ class ext/mods/commons/data/StatSet, int, int ]
        frame_type = 248 /* chop */
          offset_delta = 11
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean setFinalScore(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.enums.CabalType, ext.mods.gameserver.enums.FestivalType, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/CabalType;Lext/mods/gameserver/enums/FestivalType;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=14, args_size=5
         0: aload_3
         1: invokevirtual #529                // Method ext/mods/gameserver/enums/FestivalType.ordinal:()I
         4: istore        5
         6: aload_0
         7: getstatic     #363                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
        10: iload         5
        12: invokevirtual #532                // Method getHighestScore:(Lext/mods/gameserver/enums/CabalType;I)I
        15: istore        6
        17: aload_0
        18: getstatic     #367                // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
        21: iload         5
        23: invokevirtual #532                // Method getHighestScore:(Lext/mods/gameserver/enums/CabalType;I)I
        26: istore        7
        28: iconst_0
        29: istore        8
        31: iconst_0
        32: istore        9
        34: aload_2
        35: getstatic     #363                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
        38: if_acmpne     72
        41: iload         6
        43: istore        8
        45: iload         7
        47: istore        9
        49: aload_0
        50: getfield      #46                 // Field _dawnFestivalScores:Ljava/util/Map;
        53: iload         5
        55: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        58: iload         4
        60: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        63: invokeinterface #182,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        68: pop
        69: goto          100
        72: iload         7
        74: istore        8
        76: iload         6
        78: istore        9
        80: aload_0
        81: getfield      #49                 // Field _duskFestivalScores:Ljava/util/Map;
        84: iload         5
        86: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        89: iload         4
        91: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        94: invokeinterface #182,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        99: pop
       100: aload_0
       101: aload_2
       102: iload         5
       104: invokevirtual #525                // Method getHighestScoreData:(Lext/mods/gameserver/enums/CabalType;I)Lext/mods/commons/data/StatSet;
       107: astore        10
       109: iload         4
       111: iload         8
       113: if_icmple     227
       116: new           #23                 // class java/util/ArrayList
       119: dup
       120: invokespecial #25                 // Method java/util/ArrayList."<init>":()V
       123: astore        11
       125: aload_0
       126: aload_2
       127: iload         5
       129: invokevirtual #536                // Method getPreviousParticipants:(Lext/mods/gameserver/enums/CabalType;I)Ljava/util/List;
       132: invokeinterface #461,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       137: astore        12
       139: aload         12
       141: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       146: ifeq          183
       149: aload         12
       151: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       156: checkcast     #168                // class java/lang/Integer
       159: invokevirtual #490                // Method java/lang/Integer.intValue:()I
       162: istore        13
       164: aload         11
       166: invokestatic  #539                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
       169: iload         13
       171: invokevirtual #544                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerName:(I)Ljava/lang/String;
       174: invokeinterface #462,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       179: pop
       180: goto          139
       183: aload         10
       185: ldc           #150                // String date
       187: invokestatic  #400                // Method java/lang/System.currentTimeMillis:()J
       190: invokestatic  #547                // Method java/lang/String.valueOf:(J)Ljava/lang/String;
       193: invokevirtual #152                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       196: aload         10
       198: ldc           #155                // String score
       200: iload         4
       202: invokevirtual #135                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       205: aload         10
       207: ldc           #157                // String members
       209: ldc_w         #278                // String ,
       212: aload         11
       214: invokestatic  #550                // Method java/lang/String.join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
       217: invokevirtual #152                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       220: aload_0
       221: iconst_1
       222: invokevirtual #370                // Method saveFestivalData:(Z)V
       225: iconst_1
       226: ireturn
       227: iconst_0
       228: ireturn
      LineNumberTable:
        line 643: 0
        line 645: 6
        line 646: 17
        line 648: 28
        line 650: 31
        line 652: 34
        line 654: 41
        line 655: 45
        line 657: 49
        line 661: 72
        line 662: 76
        line 664: 80
        line 667: 100
        line 669: 109
        line 671: 116
        line 672: 125
        line 673: 164
        line 675: 183
        line 676: 196
        line 677: 205
        line 679: 220
        line 681: 225
        line 684: 227
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          164      16    13 partyMember   I
          125     102    11 partyMembers   Ljava/util/List;
            0     229     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0     229     1 player   Lext/mods/gameserver/model/actor/Player;
            0     229     2 oracle   Lext/mods/gameserver/enums/CabalType;
            0     229     3 festival   Lext/mods/gameserver/enums/FestivalType;
            0     229     4 offeringScore   I
            6     223     5 festivalId   I
           17     212     6 currDawnHighScore   I
           28     201     7 currDuskHighScore   I
           31     198     8 thisCabalHighScore   I
           34     195     9 otherCabalHighScore   I
          109     120    10   set   Lext/mods/commons/data/StatSet;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          125     102    11 partyMembers   Ljava/util/List<Ljava/lang/String;>;
      StackMapTable: number_of_entries = 5
        frame_type = 255 /* full_frame */
          offset_delta = 72
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/CabalType, class ext/mods/gameserver/enums/FestivalType, int, int, int, int, int, int ]
          stack = []
        frame_type = 27 /* same */
        frame_type = 254 /* append */
          offset_delta = 38
          locals = [ class ext/mods/commons/data/StatSet, class java/util/List, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 43
        frame_type = 250 /* chop */
          offset_delta = 43

  public int getFestivalScore(ext.mods.gameserver.enums.CabalType);
    descriptor: (Lext/mods/gameserver/enums/CabalType;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=10, args_size=2
         0: aload_1
         1: getstatic     #554                // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
         4: if_acmpne     9
         7: iconst_0
         8: ireturn
         9: aload_1
        10: getstatic     #367                // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
        13: if_acmpne     22
        16: getstatic     #363                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
        19: goto          25
        22: getstatic     #367                // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
        25: astore_2
        26: iconst_0
        27: istore_3
        28: invokestatic  #557                // Method ext/mods/gameserver/enums/FestivalType.values:()[Lext/mods/gameserver/enums/FestivalType;
        31: astore        4
        33: aload         4
        35: arraylength
        36: istore        5
        38: iconst_0
        39: istore        6
        41: iload         6
        43: iload         5
        45: if_icmpge     100
        48: aload         4
        50: iload         6
        52: aaload
        53: astore        7
        55: aload_0
        56: aload_1
        57: aload         7
        59: invokevirtual #529                // Method ext/mods/gameserver/enums/FestivalType.ordinal:()I
        62: invokevirtual #532                // Method getHighestScore:(Lext/mods/gameserver/enums/CabalType;I)I
        65: istore        8
        67: aload_0
        68: aload_2
        69: aload         7
        71: invokevirtual #529                // Method ext/mods/gameserver/enums/FestivalType.ordinal:()I
        74: invokevirtual #532                // Method getHighestScore:(Lext/mods/gameserver/enums/CabalType;I)I
        77: istore        9
        79: iload         8
        81: iload         9
        83: if_icmple     94
        86: iload_3
        87: aload         7
        89: invokevirtual #560                // Method ext/mods/gameserver/enums/FestivalType.getMaxScore:()I
        92: iadd
        93: istore_3
        94: iinc          6, 1
        97: goto          41
       100: iload_3
       101: ireturn
      LineNumberTable:
        line 689: 0
        line 690: 7
        line 692: 9
        line 693: 26
        line 695: 28
        line 697: 55
        line 698: 67
        line 699: 79
        line 700: 86
        line 695: 94
        line 703: 100
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           67      27     8 festivalScore   I
           79      15     9 festivalScoreOposite   I
           55      39     7 festivalType   Lext/mods/gameserver/enums/FestivalType;
            0     102     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0     102     1  type   Lext/mods/gameserver/enums/CabalType;
           26      76     2 oposite   Lext/mods/gameserver/enums/CabalType;
           28      74     3 result   I
      StackMapTable: number_of_entries = 6
        frame_type = 9 /* same */
        frame_type = 12 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/CabalType ]
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/data/manager/FestivalOfDarknessManager, class ext/mods/gameserver/enums/CabalType, class ext/mods/gameserver/enums/CabalType, int, class "[Lext/mods/gameserver/enums/FestivalType;", int, int ]
          stack = []
        frame_type = 52 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public final int getAccumulatedBonus(int);
    descriptor: (I)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #26                 // Field _accumulatedBonuses:Ljava/util/List;
         4: iload_1
         5: invokeinterface #563,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        10: checkcast     #168                // class java/lang/Integer
        13: invokevirtual #490                // Method java/lang/Integer.intValue:()I
        16: ireturn
      LineNumberTable:
        line 708: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0      17     1 festivalId   I

  public final int getTotalAccumulatedBonus();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: aload_0
         3: getfield      #26                 // Field _accumulatedBonuses:Ljava/util/List;
         6: invokeinterface #461,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        11: astore_2
        12: aload_2
        13: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          41
        21: aload_2
        22: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #168                // class java/lang/Integer
        30: invokevirtual #490                // Method java/lang/Integer.intValue:()I
        33: istore_3
        34: iload_1
        35: iload_3
        36: iadd
        37: istore_1
        38: goto          12
        41: iload_1
        42: ireturn
      LineNumberTable:
        line 713: 0
        line 715: 2
        line 716: 34
        line 718: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34       4     3 accumBonus   I
            0      43     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            2      41     1 totalAccumBonus   I
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 12
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28

  public void addAccumulatedBonus(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=4
         0: iload_2
         1: tableswitch   { // 6360 to 6362

                    6360: 28

                    6361: 35

                    6362: 42
                 default: 50
            }
        28: iconst_3
        29: dup
        30: istore        4
        32: goto          51
        35: iconst_5
        36: dup
        37: istore        4
        39: goto          51
        42: bipush        10
        44: dup
        45: istore        4
        47: goto          51
        50: iconst_0
        51: istore        4
        53: aload_0
        54: getfield      #26                 // Field _accumulatedBonuses:Ljava/util/List;
        57: iload_1
        58: invokeinterface #563,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        63: checkcast     #168                // class java/lang/Integer
        66: invokevirtual #490                // Method java/lang/Integer.intValue:()I
        69: iload_3
        70: iload         4
        72: imul
        73: iadd
        74: istore        5
        76: aload_0
        77: getfield      #26                 // Field _accumulatedBonuses:Ljava/util/List;
        80: iload_1
        81: iload         5
        83: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        86: invokeinterface #353,  3          // InterfaceMethod java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
        91: pop
        92: return
      LineNumberTable:
        line 723: 0
        line 725: 28
        line 726: 35
        line 727: 42
        line 728: 50
        line 729: 51
        line 731: 53
        line 732: 76
        line 733: 92
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           32       3     4 eachStoneBonus   I
           39       3     4 eachStoneBonus   I
           47       3     4 eachStoneBonus   I
            0      93     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0      93     1 festivalId   I
            0      93     2 stoneType   I
            0      93     3 stoneAmount   I
           53      40     4 eachStoneBonus   I
           76      17     5 newTotalBonus   I
      StackMapTable: number_of_entries = 5
        frame_type = 28 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 7 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final int distribAccumulatedBonus(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=11, args_size=2
         0: invokestatic  #7                  // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
         3: aload_1
         4: invokevirtual #439                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         7: invokevirtual #566                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
        10: invokestatic  #7                  // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
        13: invokevirtual #570                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getWinningCabal:()Lext/mods/gameserver/enums/CabalType;
        16: if_acmpeq     21
        19: iconst_0
        20: ireturn
        21: aload_0
        22: getfield      #55                 // Field _festivalData:Ljava/util/Map;
        25: aload_0
        26: getfield      #17                 // Field _signsCycle:I
        29: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        32: invokeinterface #436,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        37: checkcast     #177                // class java/util/Map
        40: astore_2
        41: aload_2
        42: ifnonnull     47
        45: iconst_0
        46: ireturn
        47: aload_1
        48: invokevirtual #574                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        51: astore_3
        52: iconst_0
        53: istore        4
        55: aload_2
        56: invokeinterface #224,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        61: invokeinterface #228,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        66: astore        5
        68: aload         5
        70: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        75: ifeq          181
        78: aload         5
        80: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        85: checkcast     #132                // class ext/mods/commons/data/StatSet
        88: astore        6
        90: aload         6
        92: ldc           #157                // String members
        94: invokevirtual #249                // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        97: astore        7
        99: aload         7
       101: aload_3
       102: invokevirtual #578                // Method java/lang/String.indexOf:(Ljava/lang/String;)I
       105: iconst_m1
       106: if_icmple     178
       109: aload         6
       111: ldc           #124                // String festivalId
       113: invokevirtual #242                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       116: istore        8
       118: aload         7
       120: ldc_w         #278                // String ,
       123: invokevirtual #280                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       126: arraylength
       127: istore        9
       129: aload_0
       130: getfield      #26                 // Field _accumulatedBonuses:Ljava/util/List;
       133: iload         8
       135: invokeinterface #563,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       140: checkcast     #168                // class java/lang/Integer
       143: invokevirtual #490                // Method java/lang/Integer.intValue:()I
       146: istore        10
       148: iload         10
       150: iload         9
       152: idiv
       153: istore        4
       155: aload_0
       156: getfield      #26                 // Field _accumulatedBonuses:Ljava/util/List;
       159: iload         8
       161: iload         10
       163: iload         4
       165: isub
       166: invokestatic  #167                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       169: invokeinterface #353,  3          // InterfaceMethod java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
       174: pop
       175: goto          181
       178: goto          68
       181: iload         4
       183: ireturn
      LineNumberTable:
        line 742: 0
        line 743: 19
        line 745: 21
        line 746: 41
        line 747: 45
        line 749: 47
        line 751: 52
        line 752: 55
        line 754: 90
        line 755: 99
        line 757: 109
        line 758: 118
        line 759: 129
        line 761: 148
        line 762: 155
        line 763: 175
        line 765: 178
        line 767: 181
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          118      60     8 festivalId   I
          129      49     9 numPartyMembers   I
          148      30    10 totalAccumBonus   I
           99      79     7 members   Ljava/lang/String;
           90      88     6   set   Lext/mods/commons/data/StatSet;
            0     184     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0     184     1 player   Lext/mods/gameserver/model/actor/Player;
           41     143     2   map   Ljava/util/Map;
           52     132     3 playerName   Ljava/lang/String;
           55     129     4 playerBonus   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           41     143     2   map   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;
      StackMapTable: number_of_entries = 5
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/util/Map ]
        frame_type = 254 /* append */
          offset_delta = 20
          locals = [ class java/lang/String, int, class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 109
        frame_type = 250 /* chop */
          offset_delta = 2

  public void addPeaceZone(ext.mods.gameserver.model.zone.type.PeaceZone, boolean);
    descriptor: (Lext/mods/gameserver/model/zone/type/PeaceZone;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: iload_2
         1: ifeq          50
         4: aload_0
         5: getfield      #581                // Field _dawnPeace:Ljava/util/List;
         8: ifnonnull     23
        11: aload_0
        12: new           #23                 // class java/util/ArrayList
        15: dup
        16: iconst_2
        17: invokespecial #454                // Method java/util/ArrayList."<init>":(I)V
        20: putfield      #581                // Field _dawnPeace:Ljava/util/List;
        23: aload_0
        24: getfield      #581                // Field _dawnPeace:Ljava/util/List;
        27: aload_1
        28: invokeinterface #442,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        33: ifne          93
        36: aload_0
        37: getfield      #581                // Field _dawnPeace:Ljava/util/List;
        40: aload_1
        41: invokeinterface #462,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        46: pop
        47: goto          93
        50: aload_0
        51: getfield      #584                // Field _duskPeace:Ljava/util/List;
        54: ifnonnull     69
        57: aload_0
        58: new           #23                 // class java/util/ArrayList
        61: dup
        62: iconst_2
        63: invokespecial #454                // Method java/util/ArrayList."<init>":(I)V
        66: putfield      #584                // Field _duskPeace:Ljava/util/List;
        69: aload_0
        70: getfield      #584                // Field _duskPeace:Ljava/util/List;
        73: aload_1
        74: invokeinterface #442,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        79: ifne          93
        82: aload_0
        83: getfield      #584                // Field _duskPeace:Ljava/util/List;
        86: aload_1
        87: invokeinterface #462,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        92: pop
        93: return
      LineNumberTable:
        line 777: 0
        line 779: 4
        line 780: 11
        line 782: 23
        line 783: 36
        line 787: 50
        line 788: 57
        line 790: 69
        line 791: 82
        line 793: 93
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      94     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
            0      94     1  zone   Lext/mods/gameserver/model/zone/type/PeaceZone;
            0      94     2  dawn   Z
      StackMapTable: number_of_entries = 4
        frame_type = 23 /* same */
        frame_type = 26 /* same */
        frame_type = 18 /* same */
        frame_type = 23 /* same */

  public java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> getParticipantsDusk();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _duskFestivalParticipants:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 987: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
    Signature: #749                         // ()Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;

  public java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> getParticipantsDawn();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _dawnFestivalParticipants:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 992: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
    Signature: #749                         // ()Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;

  public static int getMin();
    descriptor: ()I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #80                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
         3: astore_0
         4: aload_0
         5: invokestatic  #587                // Method ext/mods/commons/util/LinTime.currentTimeMillis:()J
         8: invokevirtual #590                // Method java/util/Calendar.setTimeInMillis:(J)V
        11: aload_0
        12: bipush        12
        14: invokevirtual #85                 // Method java/util/Calendar.get:(I)I
        17: ireturn
      LineNumberTable:
        line 997: 0
        line 998: 4
        line 999: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            4      14     0     c   Ljava/util/Calendar;

  public static ext.mods.gameserver.data.manager.FestivalOfDarknessManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #593                // Field ext/mods/gameserver/data/manager/FestivalOfDarknessManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
         3: areturn
      LineNumberTable:
        line 1004: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=7, locals=0, args_size=0
         0: new           #72                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #18                 // class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
         6: invokevirtual #599                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #602                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #65                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: iconst_5
        16: anewarray     #604                // class "[I"
        19: dup
        20: iconst_0
        21: iconst_4
        22: newarray       int
        24: dup
        25: iconst_0
        26: ldc_w         #606                // int -79187
        29: iastore
        30: dup
        31: iconst_1
        32: ldc_w         #607                // int 113186
        35: iastore
        36: dup
        37: iconst_2
        38: sipush        -4895
        41: iastore
        42: dup
        43: iconst_3
        44: iconst_0
        45: iastore
        46: aastore
        47: dup
        48: iconst_1
        49: iconst_4
        50: newarray       int
        52: dup
        53: iconst_0
        54: ldc_w         #608                // int -75918
        57: iastore
        58: dup
        59: iconst_1
        60: ldc_w         #609                // int 110137
        63: iastore
        64: dup
        65: iconst_2
        66: sipush        -4895
        69: iastore
        70: dup
        71: iconst_3
        72: iconst_0
        73: iastore
        74: aastore
        75: dup
        76: iconst_2
        77: iconst_4
        78: newarray       int
        80: dup
        81: iconst_0
        82: ldc_w         #610                // int -73835
        85: iastore
        86: dup
        87: iconst_1
        88: ldc_w         #611                // int 111969
        91: iastore
        92: dup
        93: iconst_2
        94: sipush        -4895
        97: iastore
        98: dup
        99: iconst_3
       100: iconst_0
       101: iastore
       102: aastore
       103: dup
       104: iconst_3
       105: iconst_4
       106: newarray       int
       108: dup
       109: iconst_0
       110: ldc_w         #612                // int -76170
       113: iastore
       114: dup
       115: iconst_1
       116: ldc_w         #613                // int 113804
       119: iastore
       120: dup
       121: iconst_2
       122: sipush        -4895
       125: iastore
       126: dup
       127: iconst_3
       128: iconst_0
       129: iastore
       130: aastore
       131: dup
       132: iconst_4
       133: iconst_4
       134: newarray       int
       136: dup
       137: iconst_0
       138: ldc_w         #614                // int -78927
       141: iastore
       142: dup
       143: iconst_1
       144: ldc_w         #615                // int 109528
       147: iastore
       148: dup
       149: iconst_2
       150: sipush        -4895
       153: iastore
       154: dup
       155: iconst_3
       156: iconst_0
       157: iastore
       158: aastore
       159: putstatic     #616                // Field FESTIVAL_DAWN_PLAYER_SPAWNS:[[I
       162: iconst_5
       163: anewarray     #604                // class "[I"
       166: dup
       167: iconst_0
       168: iconst_4
       169: newarray       int
       171: dup
       172: iconst_0
       173: ldc_w         #620                // int -77200
       176: iastore
       177: dup
       178: iconst_1
       179: ldc_w         #621                // int 88966
       182: iastore
       183: dup
       184: iconst_2
       185: sipush        -5151
       188: iastore
       189: dup
       190: iconst_3
       191: iconst_0
       192: iastore
       193: aastore
       194: dup
       195: iconst_1
       196: iconst_4
       197: newarray       int
       199: dup
       200: iconst_0
       201: ldc_w         #622                // int -76941
       204: iastore
       205: dup
       206: iconst_1
       207: ldc_w         #623                // int 85307
       210: iastore
       211: dup
       212: iconst_2
       213: sipush        -5151
       216: iastore
       217: dup
       218: iconst_3
       219: iconst_0
       220: iastore
       221: aastore
       222: dup
       223: iconst_2
       224: iconst_4
       225: newarray       int
       227: dup
       228: iconst_0
       229: ldc_w         #624                // int -74855
       232: iastore
       233: dup
       234: iconst_1
       235: ldc_w         #625                // int 87135
       238: iastore
       239: dup
       240: iconst_2
       241: sipush        -5151
       244: iastore
       245: dup
       246: iconst_3
       247: iconst_0
       248: iastore
       249: aastore
       250: dup
       251: iconst_3
       252: iconst_4
       253: newarray       int
       255: dup
       256: iconst_0
       257: ldc_w         #626                // int -80208
       260: iastore
       261: dup
       262: iconst_1
       263: ldc_w         #627                // int 88222
       266: iastore
       267: dup
       268: iconst_2
       269: sipush        -5151
       272: iastore
       273: dup
       274: iconst_3
       275: iconst_0
       276: iastore
       277: aastore
       278: dup
       279: iconst_4
       280: iconst_4
       281: newarray       int
       283: dup
       284: iconst_0
       285: ldc_w         #628                // int -79954
       288: iastore
       289: dup
       290: iconst_1
       291: ldc_w         #629                // int 84697
       294: iastore
       295: dup
       296: iconst_2
       297: sipush        -5151
       300: iastore
       301: dup
       302: iconst_3
       303: iconst_0
       304: iastore
       305: aastore
       306: putstatic     #630                // Field FESTIVAL_DUSK_PLAYER_SPAWNS:[[I
       309: return
      LineNumberTable:
        line 55: 0
        line 70: 15
        line 104: 162
}
SourceFile: "FestivalOfDarknessManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/FestivalOfDarknessManager$SingletonHolder
  ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn
  ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival
  ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager
BootstrapMethods:
  0: #772 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #765 (Ljava/lang/Object;)Ljava/lang/Object;
      #766 REF_invokeStatic ext/mods/gameserver/data/manager/FestivalOfDarknessManager.lambda$restoreFestivalData$0:(Ljava/lang/Integer;)Ljava/util/Map;
      #769 (Ljava/lang/Integer;)Ljava/util/Map;
  1: #779 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #770 accumulated_bonus\u0001
InnerClasses:
  public #786= #481 of #18;               // FestivalManager=class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalManager of class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  public #787= #497 of #18;               // L2DarknessFestival=class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$L2DarknessFestival of class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  public static #789= #762 of #18;        // FestivalSpawn=class ext/mods/gameserver/data/manager/FestivalOfDarknessManager$FestivalSpawn of class ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  public static final #794= #790 of #792; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
