// Bytecode for: ext.mods.gameserver.model.olympiad.Olympiad
// File: ext\mods\gameserver\model\olympiad\Olympiad.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/olympiad/Olympiad.class
  Last modified 9 de jul de 2026; size 25877 bytes
  MD5 checksum c069b2b099eff355b73ff0b7db4457ef
  Compiled from "Olympiad.java"
public class ext.mods.gameserver.model.olympiad.Olympiad
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/olympiad/Olympiad
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 38, methods: 35, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/olympiad/Olympiad._nobles:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/model/olympiad/Olympiad
   #12 = NameAndType        #14:#15       // _nobles:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad
   #14 = Utf8               _nobles
   #15 = Utf8               Ljava/util/Map;
   #16 = Class              #17           // java/util/HashMap
   #17 = Utf8               java/util/HashMap
   #18 = Methodref          #16.#3        // java/util/HashMap."<init>":()V
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/model/olympiad/Olympiad._rankRewards:Ljava/util/Map;
   #20 = NameAndType        #21:#15       // _rankRewards:Ljava/util/Map;
   #21 = Utf8               _rankRewards
   #22 = Fieldref           #23.#24       // ext/mods/Config.OLY_ENABLED:Z
   #23 = Class              #25           // ext/mods/Config
   #24 = NameAndType        #26:#27       // OLY_ENABLED:Z
   #25 = Utf8               ext/mods/Config
   #26 = Utf8               OLY_ENABLED
   #27 = Utf8               Z
   #28 = Methodref          #11.#29       // ext/mods/gameserver/model/olympiad/Olympiad.load:()V
   #29 = NameAndType        #30:#6        // load:()V
   #30 = Utf8               load
   #31 = Methodref          #32.#33       // ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
   #32 = Class              #34           // ext/mods/gameserver/data/manager/AntiFeedManager
   #33 = NameAndType        #35:#36       // getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
   #34 = Utf8               ext/mods/gameserver/data/manager/AntiFeedManager
   #35 = Utf8               getInstance
   #36 = Utf8               ()Lext/mods/gameserver/data/manager/AntiFeedManager;
   #37 = Methodref          #32.#38       // ext/mods/gameserver/data/manager/AntiFeedManager.registerEvent:(I)V
   #38 = NameAndType        #39:#40       // registerEvent:(I)V
   #39 = Utf8               registerEvent
   #40 = Utf8               (I)V
   #41 = Fieldref           #11.#42       // ext/mods/gameserver/model/olympiad/Olympiad._period:Lext/mods/gameserver/enums/OlympiadState;
   #42 = NameAndType        #43:#44       // _period:Lext/mods/gameserver/enums/OlympiadState;
   #43 = Utf8               _period
   #44 = Utf8               Lext/mods/gameserver/enums/OlympiadState;
   #45 = Fieldref           #46.#47       // ext/mods/gameserver/enums/OlympiadState.COMPETITION:Lext/mods/gameserver/enums/OlympiadState;
   #46 = Class              #48           // ext/mods/gameserver/enums/OlympiadState
   #47 = NameAndType        #49:#44       // COMPETITION:Lext/mods/gameserver/enums/OlympiadState;
   #48 = Utf8               ext/mods/gameserver/enums/OlympiadState
   #49 = Utf8               COMPETITION
   #50 = Methodref          #11.#51       // ext/mods/gameserver/model/olympiad/Olympiad.init:()V
   #51 = NameAndType        #52:#6        // init:()V
   #52 = Utf8               init
   #53 = Fieldref           #11.#54       // ext/mods/gameserver/model/olympiad/Olympiad.LOGGER:Lext/mods/commons/logging/CLogger;
   #54 = NameAndType        #55:#56       // LOGGER:Lext/mods/commons/logging/CLogger;
   #55 = Utf8               LOGGER
   #56 = Utf8               Lext/mods/commons/logging/CLogger;
   #57 = String             #58           // Olympiad disabled.
   #58 = Utf8               Olympiad disabled.
   #59 = Methodref          #60.#61       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #60 = Class              #62           // ext/mods/commons/logging/CLogger
   #61 = NameAndType        #63:#64       // info:(Ljava/lang/Object;)V
   #62 = Utf8               ext/mods/commons/logging/CLogger
   #63 = Utf8               info
   #64 = Utf8               (Ljava/lang/Object;)V
   #65 = Methodref          #66.#67       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #66 = Class              #68           // java/lang/Integer
   #67 = NameAndType        #69:#70       // valueOf:(I)Ljava/lang/Integer;
   #68 = Utf8               java/lang/Integer
   #69 = Utf8               valueOf
   #70 = Utf8               (I)Ljava/lang/Integer;
   #71 = InterfaceMethodref #72.#73       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #72 = Class              #74           // java/util/Map
   #73 = NameAndType        #75:#76       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #74 = Utf8               java/util/Map
   #75 = Utf8               get
   #76 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #77 = Class              #78           // ext/mods/commons/data/StatSet
   #78 = Utf8               ext/mods/commons/data/StatSet
   #79 = InterfaceMethodref #72.#80       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #80 = NameAndType        #81:#82       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #81 = Utf8               put
   #82 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #83 = String             #84           // olympiad_points
   #84 = Utf8               olympiad_points
   #85 = Methodref          #77.#86       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #86 = NameAndType        #87:#88       // getInteger:(Ljava/lang/String;)I
   #87 = Utf8               getInteger
   #88 = Utf8               (Ljava/lang/String;)I
   #89 = Fieldref           #46.#90       // ext/mods/gameserver/enums/OlympiadState.VALIDATION:Lext/mods/gameserver/enums/OlympiadState;
   #90 = NameAndType        #91:#44       // VALIDATION:Lext/mods/gameserver/enums/OlympiadState;
   #91 = Utf8               VALIDATION
   #92 = Fieldref           #11.#93       // ext/mods/gameserver/model/olympiad/Olympiad._isInCompPeriod:Z
   #93 = NameAndType        #94:#27       // _isInCompPeriod:Z
   #94 = Utf8               _isInCompPeriod
   #95 = Fieldref           #11.#96       // ext/mods/gameserver/model/olympiad/Olympiad._currentCycle:I
   #96 = NameAndType        #97:#98       // _currentCycle:I
   #97 = Utf8               _currentCycle
   #98 = Utf8               I
   #99 = Methodref          #100.#101     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #100 = Class              #102          // ext/mods/commons/pool/ConnectionPool
  #101 = NameAndType        #103:#104     // getConnection:()Ljava/sql/Connection;
  #102 = Utf8               ext/mods/commons/pool/ConnectionPool
  #103 = Utf8               getConnection
  #104 = Utf8               ()Ljava/sql/Connection;
  #105 = String             #106          // SELECT current_cycle, period, olympiad_end, validation_end, next_weekly_change FROM olympiad_data WHERE id = 0
  #106 = Utf8               SELECT current_cycle, period, olympiad_end, validation_end, next_weekly_change FROM olympiad_data WHERE id = 0
  #107 = InterfaceMethodref #108.#109     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #108 = Class              #110          // java/sql/Connection
  #109 = NameAndType        #111:#112     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #110 = Utf8               java/sql/Connection
  #111 = Utf8               prepareStatement
  #112 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #113 = InterfaceMethodref #114.#115     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #114 = Class              #116          // java/sql/PreparedStatement
  #115 = NameAndType        #117:#118     // executeQuery:()Ljava/sql/ResultSet;
  #116 = Utf8               java/sql/PreparedStatement
  #117 = Utf8               executeQuery
  #118 = Utf8               ()Ljava/sql/ResultSet;
  #119 = InterfaceMethodref #120.#121     // java/sql/ResultSet.next:()Z
  #120 = Class              #122          // java/sql/ResultSet
  #121 = NameAndType        #123:#124     // next:()Z
  #122 = Utf8               java/sql/ResultSet
  #123 = Utf8               next
  #124 = Utf8               ()Z
  #125 = String             #126          // current_cycle
  #126 = Utf8               current_cycle
  #127 = InterfaceMethodref #120.#128     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #128 = NameAndType        #129:#88      // getInt:(Ljava/lang/String;)I
  #129 = Utf8               getInt
  #130 = String             #131          // period
  #131 = Utf8               period
  #132 = InterfaceMethodref #120.#133     // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #133 = NameAndType        #134:#135     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #134 = Utf8               getString
  #135 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #136 = Methodref          #137.#138     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #137 = Class              #139          // java/lang/Enum
  #138 = NameAndType        #69:#140      // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #139 = Utf8               java/lang/Enum
  #140 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #141 = String             #142          // olympiad_end
  #142 = Utf8               olympiad_end
  #143 = InterfaceMethodref #120.#144     // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #144 = NameAndType        #145:#146     // getLong:(Ljava/lang/String;)J
  #145 = Utf8               getLong
  #146 = Utf8               (Ljava/lang/String;)J
  #147 = Fieldref           #11.#148      // ext/mods/gameserver/model/olympiad/Olympiad._olympiadEnd:J
  #148 = NameAndType        #149:#150     // _olympiadEnd:J
  #149 = Utf8               _olympiadEnd
  #150 = Utf8               J
  #151 = String             #152          // validation_end
  #152 = Utf8               validation_end
  #153 = Fieldref           #11.#154      // ext/mods/gameserver/model/olympiad/Olympiad._validationEnd:J
  #154 = NameAndType        #155:#150     // _validationEnd:J
  #155 = Utf8               _validationEnd
  #156 = String             #157          // next_weekly_change
  #157 = Utf8               next_weekly_change
  #158 = Fieldref           #11.#159      // ext/mods/gameserver/model/olympiad/Olympiad._nextWeeklyChange:J
  #159 = NameAndType        #160:#150     // _nextWeeklyChange:J
  #160 = Utf8               _nextWeeklyChange
  #161 = String             #162          // Couldn\'t load Olympiad data, default values are used.
  #162 = Utf8               Couldn\'t load Olympiad data, default values are used.
  #163 = InterfaceMethodref #120.#164     // java/sql/ResultSet.close:()V
  #164 = NameAndType        #165:#6       // close:()V
  #165 = Utf8               close
  #166 = Class              #167          // java/lang/Throwable
  #167 = Utf8               java/lang/Throwable
  #168 = Methodref          #166.#169     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #169 = NameAndType        #170:#171     // addSuppressed:(Ljava/lang/Throwable;)V
  #170 = Utf8               addSuppressed
  #171 = Utf8               (Ljava/lang/Throwable;)V
  #172 = InterfaceMethodref #114.#164     // java/sql/PreparedStatement.close:()V
  #173 = InterfaceMethodref #108.#164     // java/sql/Connection.close:()V
  #174 = Class              #175          // java/lang/Exception
  #175 = Utf8               java/lang/Exception
  #176 = String             #177          // Couldn\'t load Olympiad data.
  #177 = Utf8               Couldn\'t load Olympiad data.
  #178 = Methodref          #60.#179      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #179 = NameAndType        #180:#181     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #180 = Utf8               error
  #181 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #182 = Fieldref           #183.#184     // ext/mods/gameserver/model/olympiad/Olympiad$1.$SwitchMap$ext$mods$gameserver$enums$OlympiadState:[I
  #183 = Class              #185          // ext/mods/gameserver/model/olympiad/Olympiad$1
  #184 = NameAndType        #186:#187     // $SwitchMap$ext$mods$gameserver$enums$OlympiadState:[I
  #185 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad$1
  #186 = Utf8               $SwitchMap$ext$mods$gameserver$enums$OlympiadState
  #187 = Utf8               [I
  #188 = Methodref          #46.#189      // ext/mods/gameserver/enums/OlympiadState.ordinal:()I
  #189 = NameAndType        #190:#191     // ordinal:()I
  #190 = Utf8               ordinal
  #191 = Utf8               ()I
  #192 = Methodref          #193.#194     // java/util/Calendar.getInstance:()Ljava/util/Calendar;
  #193 = Class              #195          // java/util/Calendar
  #194 = NameAndType        #35:#196      // getInstance:()Ljava/util/Calendar;
  #195 = Utf8               java/util/Calendar
  #196 = Utf8               ()Ljava/util/Calendar;
  #197 = Methodref          #193.#198     // java/util/Calendar.getTimeInMillis:()J
  #198 = NameAndType        #199:#200     // getTimeInMillis:()J
  #199 = Utf8               getTimeInMillis
  #200 = Utf8               ()J
  #201 = Methodref          #11.#202      // ext/mods/gameserver/model/olympiad/Olympiad.setNewOlympiadEnd:()V
  #202 = NameAndType        #203:#6       // setNewOlympiadEnd:()V
  #203 = Utf8               setNewOlympiadEnd
  #204 = Methodref          #11.#205      // ext/mods/gameserver/model/olympiad/Olympiad.scheduleWeeklyChange:()V
  #205 = NameAndType        #206:#6       // scheduleWeeklyChange:()V
  #206 = Utf8               scheduleWeeklyChange
  #207 = Methodref          #11.#208      // ext/mods/gameserver/model/olympiad/Olympiad.processRankRewards:()V
  #208 = NameAndType        #209:#6       // processRankRewards:()V
  #209 = Utf8               processRankRewards
  #210 = InvokeDynamic      #0:#211       // #0:run:(Lext/mods/gameserver/model/olympiad/Olympiad;)Ljava/lang/Runnable;
  #211 = NameAndType        #212:#213     // run:(Lext/mods/gameserver/model/olympiad/Olympiad;)Ljava/lang/Runnable;
  #212 = Utf8               run
  #213 = Utf8               (Lext/mods/gameserver/model/olympiad/Olympiad;)Ljava/lang/Runnable;
  #214 = Methodref          #11.#215      // ext/mods/gameserver/model/olympiad/Olympiad.getMillisToValidationEnd:()J
  #215 = NameAndType        #216:#200     // getMillisToValidationEnd:()J
  #216 = Utf8               getMillisToValidationEnd
  #217 = Methodref          #218.#219     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #218 = Class              #220          // ext/mods/commons/pool/ThreadPool
  #219 = NameAndType        #221:#222     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #220 = Utf8               ext/mods/commons/pool/ThreadPool
  #221 = Utf8               schedule
  #222 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #223 = Fieldref           #11.#224      // ext/mods/gameserver/model/olympiad/Olympiad._validationEndTask:Ljava/util/concurrent/ScheduledFuture;
  #224 = NameAndType        #225:#226     // _validationEndTask:Ljava/util/concurrent/ScheduledFuture;
  #225 = Utf8               _validationEndTask
  #226 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #227 = Methodref          #11.#228      // ext/mods/gameserver/model/olympiad/Olympiad.deleteNobles:()V
  #228 = NameAndType        #229:#6       // deleteNobles:()V
  #229 = Utf8               deleteNobles
  #230 = String             #231          // SELECT olympiad_nobles.char_id, olympiad_nobles.class_id, characters.char_name, olympiad_nobles.olympiad_points, olympiad_nobles.competitions_done, olympiad_nobles.competitions_won, olympiad_nobles.competitions_lost, olympiad_nobles.competitions_drawn FROM olympiad_nobles, characters WHERE characters.obj_Id = olympiad_nobles.char_id
  #231 = Utf8               SELECT olympiad_nobles.char_id, olympiad_nobles.class_id, characters.char_name, olympiad_nobles.olympiad_points, olympiad_nobles.competitions_done, olympiad_nobles.competitions_won, olympiad_nobles.competitions_lost, olympiad_nobles.competitions_drawn FROM olympiad_nobles, characters WHERE characters.obj_Id = olympiad_nobles.char_id
  #232 = Methodref          #77.#3        // ext/mods/commons/data/StatSet."<init>":()V
  #233 = String             #234          // class_id
  #234 = Utf8               class_id
  #235 = Methodref          #77.#236      // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
  #236 = NameAndType        #237:#238     // set:(Ljava/lang/String;I)V
  #237 = Utf8               set
  #238 = Utf8               (Ljava/lang/String;I)V
  #239 = String             #240          // char_name
  #240 = Utf8               char_name
  #241 = Methodref          #77.#242      // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
  #242 = NameAndType        #237:#243     // set:(Ljava/lang/String;Ljava/lang/String;)V
  #243 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #244 = String             #245          // competitions_done
  #245 = Utf8               competitions_done
  #246 = String             #247          // competitions_won
  #247 = Utf8               competitions_won
  #248 = String             #249          // competitions_lost
  #249 = Utf8               competitions_lost
  #250 = String             #251          // competitions_drawn
  #251 = Utf8               competitions_drawn
  #252 = String             #253          // char_id
  #253 = Utf8               char_id
  #254 = Methodref          #11.#255      // ext/mods/gameserver/model/olympiad/Olympiad.addNobleStats:(ILext/mods/commons/data/StatSet;)Lext/mods/commons/data/StatSet;
  #255 = NameAndType        #256:#257     // addNobleStats:(ILext/mods/commons/data/StatSet;)Lext/mods/commons/data/StatSet;
  #256 = Utf8               addNobleStats
  #257 = Utf8               (ILext/mods/commons/data/StatSet;)Lext/mods/commons/data/StatSet;
  #258 = String             #259          // Couldn\'t load noblesse data.
  #259 = Utf8               Couldn\'t load noblesse data.
  #260 = Methodref          #11.#261      // ext/mods/gameserver/model/olympiad/Olympiad.getMillisToOlympiadEnd:()J
  #261 = NameAndType        #262:#200     // getMillisToOlympiadEnd:()J
  #262 = Utf8               getMillisToOlympiadEnd
  #263 = String             #264          // {} minutes until Olympiad period ends.
  #264 = Utf8               {} minutes until Olympiad period ends.
  #265 = Long               60000l
  #267 = Methodref          #268.#269     // java/lang/Math.round:(F)I
  #268 = Class              #270          // java/lang/Math
  #269 = NameAndType        #271:#272     // round:(F)I
  #270 = Utf8               java/lang/Math
  #271 = Utf8               round
  #272 = Utf8               (F)I
  #273 = Methodref          #60.#274      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #274 = NameAndType        #63:#275      // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #275 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #276 = Methodref          #11.#277      // ext/mods/gameserver/model/olympiad/Olympiad.getMillisToWeekChange:()J
  #277 = NameAndType        #278:#200     // getMillisToWeekChange:()J
  #278 = Utf8               getMillisToWeekChange
  #279 = String             #280          // Next weekly Olympiad change is in {} minutes.
  #280 = Utf8               Next weekly Olympiad change is in {} minutes.
  #281 = String             #282          // Loaded {} nobles.
  #282 = Utf8               Loaded {} nobles.
  #283 = InterfaceMethodref #72.#284      // java/util/Map.size:()I
  #284 = NameAndType        #285:#191     // size:()I
  #285 = Utf8               size
  #286 = InterfaceMethodref #72.#287      // java/util/Map.clear:()V
  #287 = NameAndType        #288:#6       // clear:()V
  #288 = Utf8               clear
  #289 = String             #290          // SELECT char_id from olympiad_nobles_eom WHERE competitions_done >= ? ORDER BY olympiad_points DESC, competitions_done DESC, competitions_won DESC
  #290 = Utf8               SELECT char_id from olympiad_nobles_eom WHERE competitions_done >= ? ORDER BY olympiad_points DESC, competitions_done DESC, competitions_won DESC
  #291 = Fieldref           #23.#292      // ext/mods/Config.OLY_MIN_MATCHES:I
  #292 = NameAndType        #293:#98      // OLY_MIN_MATCHES:I
  #293 = Utf8               OLY_MIN_MATCHES
  #294 = InterfaceMethodref #114.#295     // java/sql/PreparedStatement.setInt:(II)V
  #295 = NameAndType        #296:#297     // setInt:(II)V
  #296 = Utf8               setInt
  #297 = Utf8               (II)V
  #298 = String             #299          // Couldn\'t load Olympiad ranks.
  #299 = Utf8               Couldn\'t load Olympiad ranks.
  #300 = Double             0.01d
  #302 = Methodref          #268.#303     // java/lang/Math.round:(D)J
  #303 = NameAndType        #271:#304     // round:(D)J
  #304 = Utf8               (D)J
  #305 = Double             0.1d
  #307 = Double             0.25d
  #309 = Double             0.5d
  #311 = InterfaceMethodref #72.#312      // java/util/Map.entrySet:()Ljava/util/Set;
  #312 = NameAndType        #313:#314     // entrySet:()Ljava/util/Set;
  #313 = Utf8               entrySet
  #314 = Utf8               ()Ljava/util/Set;
  #315 = InterfaceMethodref #316.#317     // java/util/Set.iterator:()Ljava/util/Iterator;
  #316 = Class              #318          // java/util/Set
  #317 = NameAndType        #319:#320     // iterator:()Ljava/util/Iterator;
  #318 = Utf8               java/util/Set
  #319 = Utf8               iterator
  #320 = Utf8               ()Ljava/util/Iterator;
  #321 = InterfaceMethodref #322.#323     // java/util/Iterator.hasNext:()Z
  #322 = Class              #324          // java/util/Iterator
  #323 = NameAndType        #325:#124     // hasNext:()Z
  #324 = Utf8               java/util/Iterator
  #325 = Utf8               hasNext
  #326 = InterfaceMethodref #322.#327     // java/util/Iterator.next:()Ljava/lang/Object;
  #327 = NameAndType        #123:#328     // next:()Ljava/lang/Object;
  #328 = Utf8               ()Ljava/lang/Object;
  #329 = Class              #330          // java/util/Map$Entry
  #330 = Utf8               java/util/Map$Entry
  #331 = InterfaceMethodref #329.#332     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #332 = NameAndType        #333:#328     // getKey:()Ljava/lang/Object;
  #333 = Utf8               getKey
  #334 = Methodref          #66.#335      // java/lang/Integer.intValue:()I
  #335 = NameAndType        #336:#191     // intValue:()I
  #336 = Utf8               intValue
  #337 = InterfaceMethodref #329.#338     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #338 = NameAndType        #339:#328     // getValue:()Ljava/lang/Object;
  #339 = Utf8               getValue
  #340 = Fieldref           #11.#341      // ext/mods/gameserver/model/olympiad/Olympiad._compStart:Ljava/util/Calendar;
  #341 = NameAndType        #342:#343     // _compStart:Ljava/util/Calendar;
  #342 = Utf8               _compStart
  #343 = Utf8               Ljava/util/Calendar;
  #344 = Fieldref           #23.#345      // ext/mods/Config.OLY_START_TIME:I
  #345 = NameAndType        #346:#98      // OLY_START_TIME:I
  #346 = Utf8               OLY_START_TIME
  #347 = Methodref          #193.#348     // java/util/Calendar.set:(II)V
  #348 = NameAndType        #237:#297     // set:(II)V
  #349 = Fieldref           #23.#350      // ext/mods/Config.OLY_MIN:I
  #350 = NameAndType        #351:#98      // OLY_MIN:I
  #351 = Utf8               OLY_MIN
  #352 = Fieldref           #23.#353      // ext/mods/Config.OLY_CPERIOD:J
  #353 = NameAndType        #354:#150     // OLY_CPERIOD:J
  #354 = Utf8               OLY_CPERIOD
  #355 = Fieldref           #11.#356      // ext/mods/gameserver/model/olympiad/Olympiad._compEnd:J
  #356 = NameAndType        #357:#150     // _compEnd:J
  #357 = Utf8               _compEnd
  #358 = Fieldref           #11.#359      // ext/mods/gameserver/model/olympiad/Olympiad._olympiadEndTask:Ljava/util/concurrent/ScheduledFuture;
  #359 = NameAndType        #360:#226     // _olympiadEndTask:Ljava/util/concurrent/ScheduledFuture;
  #360 = Utf8               _olympiadEndTask
  #361 = InterfaceMethodref #362.#363     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #362 = Class              #364          // java/util/concurrent/ScheduledFuture
  #363 = NameAndType        #365:#366     // cancel:(Z)Z
  #364 = Utf8               java/util/concurrent/ScheduledFuture
  #365 = Utf8               cancel
  #366 = Utf8               (Z)Z
  #367 = InvokeDynamic      #1:#211       // #1:run:(Lext/mods/gameserver/model/olympiad/Olympiad;)Ljava/lang/Runnable;
  #368 = Methodref          #11.#369      // ext/mods/gameserver/model/olympiad/Olympiad.getMillisToCompBegin:()J
  #369 = NameAndType        #370:#200     // getMillisToCompBegin:()J
  #370 = Utf8               getMillisToCompBegin
  #371 = Long               1000l
  #373 = Long               60l
  #375 = Double             60.0d
  #377 = Methodref          #268.#378     // java/lang/Math.floor:(D)D
  #378 = NameAndType        #379:#380     // floor:(D)D
  #379 = Utf8               floor
  #380 = Utf8               (D)D
  #381 = Double             24.0d
  #383 = String             #384          // Olympiad competition period starts in {} days, {} hours and {} mins.
  #384 = Utf8               Olympiad competition period starts in {} days, {} hours and {} mins.
  #385 = String             #386          // Olympiad event starts/started @ {}.
  #386 = Utf8               Olympiad event starts/started @ {}.
  #387 = Methodref          #193.#388     // java/util/Calendar.getTime:()Ljava/util/Date;
  #388 = NameAndType        #389:#390     // getTime:()Ljava/util/Date;
  #389 = Utf8               getTime
  #390 = Utf8               ()Ljava/util/Date;
  #391 = InvokeDynamic      #2:#211       // #2:run:(Lext/mods/gameserver/model/olympiad/Olympiad;)Ljava/lang/Runnable;
  #392 = Fieldref           #11.#393      // ext/mods/gameserver/model/olympiad/Olympiad._competitionStartTask:Ljava/util/concurrent/ScheduledFuture;
  #393 = NameAndType        #394:#226     // _competitionStartTask:Ljava/util/concurrent/ScheduledFuture;
  #394 = Utf8               _competitionStartTask
  #395 = Long               10l
  #397 = Fieldref           #398.#399     // ext/mods/gameserver/network/SystemMessageId.OLYMPIAD_PERIOD_S1_HAS_STARTED:Lext/mods/gameserver/network/SystemMessageId;
  #398 = Class              #400          // ext/mods/gameserver/network/SystemMessageId
  #399 = NameAndType        #401:#402     // OLYMPIAD_PERIOD_S1_HAS_STARTED:Lext/mods/gameserver/network/SystemMessageId;
  #400 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #401 = Utf8               OLYMPIAD_PERIOD_S1_HAS_STARTED
  #402 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #403 = Methodref          #404.#405     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #404 = Class              #406          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #405 = NameAndType        #407:#408     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #406 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #407 = Utf8               getSystemMessage
  #408 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #409 = Methodref          #404.#410     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #410 = NameAndType        #411:#412     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #411 = Utf8               addNumber
  #412 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #413 = Methodref          #414.#415     // ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #414 = Class              #416          // ext/mods/gameserver/model/World
  #415 = NameAndType        #417:#418     // toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #416 = Utf8               ext/mods/gameserver/model/World
  #417 = Utf8               toAllOnlinePlayers
  #418 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #419 = Fieldref           #23.#420      // ext/mods/Config.OLY_USE_CUSTOM_PERIOD_SETTINGS:Z
  #420 = NameAndType        #421:#27      // OLY_USE_CUSTOM_PERIOD_SETTINGS:Z
  #421 = Utf8               OLY_USE_CUSTOM_PERIOD_SETTINGS
  #422 = Methodref          #193.#423     // java/util/Calendar.add:(II)V
  #423 = NameAndType        #424:#297     // add:(II)V
  #424 = Utf8               add
  #425 = Fieldref           #23.#426      // ext/mods/Config.OLY_WPERIOD:J
  #426 = NameAndType        #427:#150     // OLY_WPERIOD:J
  #427 = Utf8               OLY_WPERIOD
  #428 = Fieldref           #183.#429     // ext/mods/gameserver/model/olympiad/Olympiad$1.$SwitchMap$ext$mods$gameserver$model$olympiad$enums$OlympiadPeriod:[I
  #429 = NameAndType        #430:#187     // $SwitchMap$ext$mods$gameserver$model$olympiad$enums$OlympiadPeriod:[I
  #430 = Utf8               $SwitchMap$ext$mods$gameserver$model$olympiad$enums$OlympiadPeriod
  #431 = Fieldref           #23.#432      // ext/mods/Config.OLY_PERIOD:Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #432 = NameAndType        #433:#434     // OLY_PERIOD:Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #433 = Utf8               OLY_PERIOD
  #434 = Utf8               Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #435 = Methodref          #436.#189     // ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.ordinal:()I
  #436 = Class              #437          // ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod
  #437 = Utf8               ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod
  #438 = Fieldref           #23.#439      // ext/mods/Config.OLY_PERIOD_MULTIPLIER:I
  #439 = NameAndType        #440:#98      // OLY_PERIOD_MULTIPLIER:I
  #440 = Utf8               OLY_PERIOD_MULTIPLIER
  #441 = Long               2l
  #443 = Methodref          #11.#444      // ext/mods/gameserver/model/olympiad/Olympiad.setNewCompBegin:()J
  #444 = NameAndType        #445:#200     // setNewCompBegin:()J
  #445 = Utf8               setNewCompBegin
  #446 = String             #447          // New Olympiad schedule @ {}.
  #447 = Utf8               New Olympiad schedule @ {}.
  #448 = InvokeDynamic      #3:#211       // #3:run:(Lext/mods/gameserver/model/olympiad/Olympiad;)Ljava/lang/Runnable;
  #449 = Methodref          #218.#450     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #450 = NameAndType        #451:#452     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #451 = Utf8               scheduleAtFixedRate
  #452 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #453 = Fieldref           #11.#454      // ext/mods/gameserver/model/olympiad/Olympiad._weeklyTask:Ljava/util/concurrent/ScheduledFuture;
  #454 = NameAndType        #455:#226     // _weeklyTask:Ljava/util/concurrent/ScheduledFuture;
  #455 = Utf8               _weeklyTask
  #456 = Methodref          #457.#458     // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #457 = Class              #459          // ext/mods/gameserver/data/manager/ZoneManager
  #458 = NameAndType        #35:#460      // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #459 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
  #460 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
  #461 = Class              #462          // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
  #462 = Utf8               ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
  #463 = Methodref          #457.#464     // ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #464 = NameAndType        #465:#466     // getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #465 = Utf8               getZone
  #466 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #467 = InterfaceMethodref #72.#468      // java/util/Map.isEmpty:()Z
  #468 = NameAndType        #469:#124     // isEmpty:()Z
  #469 = Utf8               isEmpty
  #470 = String             #471          // INSERT INTO olympiad_nobles (`char_id`,`class_id`,`olympiad_points`,`competitions_done`,`competitions_won`,`competitions_lost`, `competitions_drawn`) VALUES (?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE olympiad_points=VALUES(olympiad_points), competitions_done=VALUES(competitions_done), competitions_won=VALUES(competitions_won), competitions_lost=VALUES(competitions_lost), competitions_drawn=VALUES(competitions_drawn)
  #471 = Utf8               INSERT INTO olympiad_nobles (`char_id`,`class_id`,`olympiad_points`,`competitions_done`,`competitions_won`,`competitions_lost`, `competitions_drawn`) VALUES (?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE olympiad_points=VALUES(olympiad_points), competitions_done=VALUES(competitions_done), competitions_won=VALUES(competitions_won), competitions_lost=VALUES(competitions_lost), competitions_drawn=VALUES(competitions_drawn)
  #472 = InterfaceMethodref #114.#473     // java/sql/PreparedStatement.addBatch:()V
  #473 = NameAndType        #474:#6       // addBatch:()V
  #474 = Utf8               addBatch
  #475 = InterfaceMethodref #114.#476     // java/sql/PreparedStatement.executeBatch:()[I
  #476 = NameAndType        #477:#478     // executeBatch:()[I
  #477 = Utf8               executeBatch
  #478 = Utf8               ()[I
  #479 = String             #480          // Couldn\'t save Olympiad nobles data.
  #480 = Utf8               Couldn\'t save Olympiad nobles data.
  #481 = Methodref          #11.#482      // ext/mods/gameserver/model/olympiad/Olympiad.saveNobleData:()V
  #482 = NameAndType        #483:#6       // saveNobleData:()V
  #483 = Utf8               saveNobleData
  #484 = String             #485          // INSERT INTO olympiad_data (id, current_cycle, period, olympiad_end, validation_end, next_weekly_change) VALUES (0,?,?,?,?,?) ON DUPLICATE KEY UPDATE current_cycle=?, period=?, olympiad_end=?, validation_end=?, next_weekly_change=?
  #485 = Utf8               INSERT INTO olympiad_data (id, current_cycle, period, olympiad_end, validation_end, next_weekly_change) VALUES (0,?,?,?,?,?) ON DUPLICATE KEY UPDATE current_cycle=?, period=?, olympiad_end=?, validation_end=?, next_weekly_change=?
  #486 = Methodref          #46.#487      // ext/mods/gameserver/enums/OlympiadState.toString:()Ljava/lang/String;
  #487 = NameAndType        #488:#489     // toString:()Ljava/lang/String;
  #488 = Utf8               toString
  #489 = Utf8               ()Ljava/lang/String;
  #490 = InterfaceMethodref #114.#491     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #491 = NameAndType        #492:#493     // setString:(ILjava/lang/String;)V
  #492 = Utf8               setString
  #493 = Utf8               (ILjava/lang/String;)V
  #494 = InterfaceMethodref #114.#495     // java/sql/PreparedStatement.setLong:(IJ)V
  #495 = NameAndType        #496:#497     // setLong:(IJ)V
  #496 = Utf8               setLong
  #497 = Utf8               (IJ)V
  #498 = InterfaceMethodref #114.#499     // java/sql/PreparedStatement.execute:()Z
  #499 = NameAndType        #500:#124     // execute:()Z
  #500 = Utf8               execute
  #501 = String             #502          // Couldn\'t save Olympiad status.
  #502 = Utf8               Couldn\'t save Olympiad status.
  #503 = Class              #504          // java/util/ArrayList
  #504 = Utf8               java/util/ArrayList
  #505 = Methodref          #503.#3       // java/util/ArrayList."<init>":()V
  #506 = Fieldref           #23.#507      // ext/mods/Config.OLY_SHOW_MONTHLY_WINNERS:Z
  #507 = NameAndType        #508:#27      // OLY_SHOW_MONTHLY_WINNERS:Z
  #508 = Utf8               OLY_SHOW_MONTHLY_WINNERS
  #509 = String             #510          // SELECT characters.char_name from olympiad_nobles_eom, characters WHERE characters.obj_Id = olympiad_nobles_eom.char_id AND olympiad_nobles_eom.class_id = ? AND olympiad_nobles_eom.competitions_done >= ? ORDER BY olympiad_nobles_eom.olympiad_points DESC, olympiad_nobles_eom.competitions_done DESC, olympiad_nobles_eom.competitions_won DESC LIMIT 10
  #510 = Utf8               SELECT characters.char_name from olympiad_nobles_eom, characters WHERE characters.obj_Id = olympiad_nobles_eom.char_id AND olympiad_nobles_eom.class_id = ? AND olympiad_nobles_eom.competitions_done >= ? ORDER BY olympiad_nobles_eom.olympiad_points DESC, olympiad_nobles_eom.competitions_done DESC, olympiad_nobles_eom.competitions_won DESC LIMIT 10
  #511 = String             #512          // SELECT characters.char_name from olympiad_nobles, characters WHERE characters.obj_Id = olympiad_nobles.char_id AND olympiad_nobles.class_id = ? AND olympiad_nobles.competitions_done >= 3 ORDER BY olympiad_nobles.olympiad_points DESC, olympiad_nobles.competitions_done DESC LIMIT 10
  #512 = Utf8               SELECT characters.char_name from olympiad_nobles, characters WHERE characters.obj_Id = olympiad_nobles.char_id AND olympiad_nobles.class_id = ? AND olympiad_nobles.competitions_done >= 3 ORDER BY olympiad_nobles.olympiad_points DESC, olympiad_nobles.competitions_done DESC LIMIT 10
  #513 = InterfaceMethodref #514.#515     // java/util/List.add:(Ljava/lang/Object;)Z
  #514 = Class              #516          // java/util/List
  #515 = NameAndType        #424:#517     // add:(Ljava/lang/Object;)Z
  #516 = Utf8               java/util/List
  #517 = Utf8               (Ljava/lang/Object;)Z
  #518 = String             #519          // Couldn\'t load Olympiad leaders.
  #519 = Utf8               Couldn\'t load Olympiad leaders.
  #520 = Methodref          #521.#522     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #521 = Class              #523          // ext/mods/gameserver/model/actor/Player
  #522 = NameAndType        #524:#191     // getObjectId:()I
  #523 = Utf8               ext/mods/gameserver/model/actor/Player
  #524 = Utf8               getObjectId
  #525 = Methodref          #521.#526     // ext/mods/gameserver/model/actor/Player.isHero:()Z
  #526 = NameAndType        #527:#124     // isHero:()Z
  #527 = Utf8               isHero
  #528 = Methodref          #529.#530     // ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
  #529 = Class              #531          // ext/mods/gameserver/data/manager/HeroManager
  #530 = NameAndType        #35:#532      // getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
  #531 = Utf8               ext/mods/gameserver/data/manager/HeroManager
  #532 = Utf8               ()Lext/mods/gameserver/data/manager/HeroManager;
  #533 = Methodref          #529.#534     // ext/mods/gameserver/data/manager/HeroManager.isInactiveHero:(I)Z
  #534 = NameAndType        #535:#536     // isInactiveHero:(I)Z
  #535 = Utf8               isInactiveHero
  #536 = Utf8               (I)Z
  #537 = Fieldref           #23.#538      // ext/mods/Config.OLY_HERO_POINTS:I
  #538 = NameAndType        #539:#98      // OLY_HERO_POINTS:I
  #539 = Utf8               OLY_HERO_POINTS
  #540 = Fieldref           #23.#541      // ext/mods/Config.OLY_RANK1_POINTS:I
  #541 = NameAndType        #542:#98      // OLY_RANK1_POINTS:I
  #542 = Utf8               OLY_RANK1_POINTS
  #543 = Fieldref           #23.#544      // ext/mods/Config.OLY_RANK2_POINTS:I
  #544 = NameAndType        #545:#98      // OLY_RANK2_POINTS:I
  #545 = Utf8               OLY_RANK2_POINTS
  #546 = Fieldref           #23.#547      // ext/mods/Config.OLY_RANK3_POINTS:I
  #547 = NameAndType        #548:#98      // OLY_RANK3_POINTS:I
  #548 = Utf8               OLY_RANK3_POINTS
  #549 = Fieldref           #23.#550      // ext/mods/Config.OLY_RANK4_POINTS:I
  #550 = NameAndType        #551:#98      // OLY_RANK4_POINTS:I
  #551 = Utf8               OLY_RANK4_POINTS
  #552 = Fieldref           #23.#553      // ext/mods/Config.OLY_RANK5_POINTS:I
  #553 = NameAndType        #554:#98      // OLY_RANK5_POINTS:I
  #554 = Utf8               OLY_RANK5_POINTS
  #555 = Fieldref           #23.#556      // ext/mods/Config.OLY_GP_PER_POINT:I
  #556 = NameAndType        #557:#98      // OLY_GP_PER_POINT:I
  #557 = Utf8               OLY_GP_PER_POINT
  #558 = String             #559          // SELECT olympiad_points FROM olympiad_nobles_eom WHERE char_id = ?
  #559 = Utf8               SELECT olympiad_points FROM olympiad_nobles_eom WHERE char_id = ?
  #560 = String             #561          // Couldn\'t load last Olympiad points.
  #561 = Utf8               Couldn\'t load last Olympiad points.
  #562 = String             #563          // TRUNCATE olympiad_nobles
  #563 = Utf8               TRUNCATE olympiad_nobles
  #564 = String             #565          // Couldn\'t delete Olympiad nobles.
  #565 = Utf8               Couldn\'t delete Olympiad nobles.
  #566 = Fieldref           #398.#567     // ext/mods/gameserver/network/SystemMessageId.OLYMPIAD_PERIOD_S1_HAS_ENDED:Lext/mods/gameserver/network/SystemMessageId;
  #567 = NameAndType        #568:#402     // OLYMPIAD_PERIOD_S1_HAS_ENDED:Lext/mods/gameserver/network/SystemMessageId;
  #568 = Utf8               OLYMPIAD_PERIOD_S1_HAS_ENDED
  #569 = Methodref          #529.#570     // ext/mods/gameserver/data/manager/HeroManager.resetData:()V
  #570 = NameAndType        #571:#6       // resetData:()V
  #571 = Utf8               resetData
  #572 = Methodref          #529.#573     // ext/mods/gameserver/data/manager/HeroManager.computeNewHeroes:()V
  #573 = NameAndType        #574:#6       // computeNewHeroes:()V
  #574 = Utf8               computeNewHeroes
  #575 = Methodref          #11.#576      // ext/mods/gameserver/model/olympiad/Olympiad.saveOlympiadStatus:()V
  #576 = NameAndType        #577:#6       // saveOlympiadStatus:()V
  #577 = Utf8               saveOlympiadStatus
  #578 = String             #579          // TRUNCATE olympiad_nobles_eom
  #579 = Utf8               TRUNCATE olympiad_nobles_eom
  #580 = String             #581          // INSERT INTO olympiad_nobles_eom SELECT char_id, class_id, olympiad_points, competitions_done, competitions_won, competitions_lost, competitions_drawn FROM olympiad_nobles
  #581 = Utf8               INSERT INTO olympiad_nobles_eom SELECT char_id, class_id, olympiad_points, competitions_done, competitions_won, competitions_lost, competitions_drawn FROM olympiad_nobles
  #582 = String             #583          // Couldn\'t update monthly Olympiad nobles.
  #583 = Utf8               Couldn\'t update monthly Olympiad nobles.
  #584 = Fieldref           #23.#585      // ext/mods/Config.OLY_VPERIOD:J
  #585 = NameAndType        #586:#150     // OLY_VPERIOD:J
  #586 = Utf8               OLY_VPERIOD
  #587 = Fieldref           #588.#589     // ext/mods/gameserver/model/olympiad/Olympiad$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/olympiad/Olympiad;
  #588 = Class              #590          // ext/mods/gameserver/model/olympiad/Olympiad$SingletonHolder
  #589 = NameAndType        #591:#592     // INSTANCE:Lext/mods/gameserver/model/olympiad/Olympiad;
  #590 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad$SingletonHolder
  #591 = Utf8               INSTANCE
  #592 = Utf8               Lext/mods/gameserver/model/olympiad/Olympiad;
  #593 = InterfaceMethodref #72.#594      // java/util/Map.values:()Ljava/util/Collection;
  #594 = NameAndType        #595:#596     // values:()Ljava/util/Collection;
  #595 = Utf8               values
  #596 = Utf8               ()Ljava/util/Collection;
  #597 = InterfaceMethodref #598.#317     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #598 = Class              #599          // java/util/Collection
  #599 = Utf8               java/util/Collection
  #600 = Fieldref           #23.#601      // ext/mods/Config.OLY_WEEKLY_POINTS:I
  #601 = NameAndType        #602:#98      // OLY_WEEKLY_POINTS:I
  #602 = Utf8               OLY_WEEKLY_POINTS
  #603 = String             #604          // Added weekly Olympiad points to nobles.
  #604 = Utf8               Added weekly Olympiad points to nobles.
  #605 = Methodref          #11.#606      // ext/mods/gameserver/model/olympiad/Olympiad.isOlympiadEnd:()Z
  #606 = NameAndType        #607:#124     // isOlympiadEnd:()Z
  #607 = Utf8               isOlympiadEnd
  #608 = Fieldref           #398.#609     // ext/mods/gameserver/network/SystemMessageId.THE_OLYMPIAD_GAME_HAS_STARTED:Lext/mods/gameserver/network/SystemMessageId;
  #609 = NameAndType        #610:#402     // THE_OLYMPIAD_GAME_HAS_STARTED:Lext/mods/gameserver/network/SystemMessageId;
  #610 = Utf8               THE_OLYMPIAD_GAME_HAS_STARTED
  #611 = String             #612          // Olympiad game started.
  #612 = Utf8               Olympiad game started.
  #613 = Methodref          #614.#615     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #614 = Class              #616          // ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #615 = NameAndType        #35:#617      // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #616 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #617 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #618 = Long               30000l
  #620 = Fieldref           #11.#621      // ext/mods/gameserver/model/olympiad/Olympiad._gameManagerTask:Ljava/util/concurrent/ScheduledFuture;
  #621 = NameAndType        #622:#226     // _gameManagerTask:Ljava/util/concurrent/ScheduledFuture;
  #622 = Utf8               _gameManagerTask
  #623 = Fieldref           #23.#624      // ext/mods/Config.OLY_ANNOUNCE_GAMES:Z
  #624 = NameAndType        #625:#27      // OLY_ANNOUNCE_GAMES:Z
  #625 = Utf8               OLY_ANNOUNCE_GAMES
  #626 = InvokeDynamic      #4:#627       // #4:run:()Ljava/lang/Runnable;
  #627 = NameAndType        #212:#628     // run:()Ljava/lang/Runnable;
  #628 = Utf8               ()Ljava/lang/Runnable;
  #629 = Long               500l
  #631 = Fieldref           #11.#632      // ext/mods/gameserver/model/olympiad/Olympiad._gameAnnouncerTask:Ljava/util/concurrent/ScheduledFuture;
  #632 = NameAndType        #633:#226     // _gameAnnouncerTask:Ljava/util/concurrent/ScheduledFuture;
  #633 = Utf8               _gameAnnouncerTask
  #634 = Methodref          #11.#635      // ext/mods/gameserver/model/olympiad/Olympiad.getMillisToCompEnd:()J
  #635 = NameAndType        #636:#200     // getMillisToCompEnd:()J
  #636 = Utf8               getMillisToCompEnd
  #637 = Long               600000l
  #639 = InvokeDynamic      #5:#627       // #5:run:()Ljava/lang/Runnable;
  #640 = InvokeDynamic      #6:#211       // #6:run:(Lext/mods/gameserver/model/olympiad/Olympiad;)Ljava/lang/Runnable;
  #641 = Fieldref           #11.#642      // ext/mods/gameserver/model/olympiad/Olympiad._competitionEndTask:Ljava/util/concurrent/ScheduledFuture;
  #642 = NameAndType        #643:#226     // _competitionEndTask:Ljava/util/concurrent/ScheduledFuture;
  #643 = Utf8               _competitionEndTask
  #644 = Fieldref           #398.#645     // ext/mods/gameserver/network/SystemMessageId.THE_OLYMPIAD_GAME_HAS_ENDED:Lext/mods/gameserver/network/SystemMessageId;
  #645 = NameAndType        #646:#402     // THE_OLYMPIAD_GAME_HAS_ENDED:Lext/mods/gameserver/network/SystemMessageId;
  #646 = Utf8               THE_OLYMPIAD_GAME_HAS_ENDED
  #647 = String             #648          // Olympiad game ended.
  #648 = Utf8               Olympiad game ended.
  #649 = Methodref          #614.#650     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.isBattleStarted:()Z
  #650 = NameAndType        #651:#124     // isBattleStarted:()Z
  #651 = Utf8               isBattleStarted
  #652 = Methodref          #653.#654     // java/lang/Thread.sleep:(J)V
  #653 = Class              #655          // java/lang/Thread
  #654 = NameAndType        #656:#657     // sleep:(J)V
  #655 = Utf8               java/lang/Thread
  #656 = Utf8               sleep
  #657 = Utf8               (J)V
  #658 = Class              #659          // java/lang/InterruptedException
  #659 = Utf8               java/lang/InterruptedException
  #660 = Fieldref           #398.#661     // ext/mods/gameserver/network/SystemMessageId.OLYMPIAD_REGISTRATION_PERIOD_ENDED:Lext/mods/gameserver/network/SystemMessageId;
  #661 = NameAndType        #662:#402     // OLYMPIAD_REGISTRATION_PERIOD_ENDED:Lext/mods/gameserver/network/SystemMessageId;
  #662 = Utf8               OLYMPIAD_REGISTRATION_PERIOD_ENDED
  #663 = Methodref          #614.#664     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getOlympiadTasks:()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #664 = NameAndType        #665:#666     // getOlympiadTasks:()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #665 = Utf8               getOlympiadTasks
  #666 = Utf8               ()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #667 = Methodref          #668.#669     // ext/mods/gameserver/model/olympiad/OlympiadGameTask.needAnnounce:()Z
  #668 = Class              #670          // ext/mods/gameserver/model/olympiad/OlympiadGameTask
  #669 = NameAndType        #671:#124     // needAnnounce:()Z
  #670 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameTask
  #671 = Utf8               needAnnounce
  #672 = Methodref          #668.#673     // ext/mods/gameserver/model/olympiad/OlympiadGameTask.getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #673 = NameAndType        #674:#675     // getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #674 = Utf8               getGame
  #675 = Utf8               ()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #676 = Methodref          #677.#678     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.getType:()Lext/mods/gameserver/enums/OlympiadType;
  #677 = Class              #679          // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
  #678 = NameAndType        #680:#681     // getType:()Lext/mods/gameserver/enums/OlympiadType;
  #679 = Utf8               ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
  #680 = Utf8               getType
  #681 = Utf8               ()Lext/mods/gameserver/enums/OlympiadType;
  #682 = Fieldref           #683.#684     // ext/mods/gameserver/enums/OlympiadType.NON_CLASSED:Lext/mods/gameserver/enums/OlympiadType;
  #683 = Class              #685          // ext/mods/gameserver/enums/OlympiadType
  #684 = NameAndType        #686:#687     // NON_CLASSED:Lext/mods/gameserver/enums/OlympiadType;
  #685 = Utf8               ext/mods/gameserver/enums/OlympiadType
  #686 = Utf8               NON_CLASSED
  #687 = Utf8               Lext/mods/gameserver/enums/OlympiadType;
  #688 = Methodref          #677.#689     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.getStadiumId:()I
  #689 = NameAndType        #690:#191     // getStadiumId:()I
  #690 = Utf8               getStadiumId
  #691 = InvokeDynamic      #7:#692       // #7:makeConcatWithConstants:(I)Ljava/lang/String;
  #692 = NameAndType        #693:#694     // makeConcatWithConstants:(I)Ljava/lang/String;
  #693 = Utf8               makeConcatWithConstants
  #694 = Utf8               (I)Ljava/lang/String;
  #695 = InvokeDynamic      #8:#692       // #8:makeConcatWithConstants:(I)Ljava/lang/String;
  #696 = Methodref          #697.#698     // ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc.getInstances:()Ljava/util/List;
  #697 = Class              #699          // ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc
  #698 = NameAndType        #700:#701     // getInstances:()Ljava/util/List;
  #699 = Utf8               ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc
  #700 = Utf8               getInstances
  #701 = Utf8               ()Ljava/util/List;
  #702 = InterfaceMethodref #514.#317     // java/util/List.iterator:()Ljava/util/Iterator;
  #703 = Methodref          #697.#704     // ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc.broadcastNpcShout:(Ljava/lang/String;)V
  #704 = NameAndType        #705:#706     // broadcastNpcShout:(Ljava/lang/String;)V
  #705 = Utf8               broadcastNpcShout
  #706 = Utf8               (Ljava/lang/String;)V
  #707 = Methodref          #708.#709     // java/lang/Class.getName:()Ljava/lang/String;
  #708 = Class              #710          // java/lang/Class
  #709 = NameAndType        #711:#489     // getName:()Ljava/lang/String;
  #710 = Utf8               java/lang/Class
  #711 = Utf8               getName
  #712 = Methodref          #60.#713      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #713 = NameAndType        #5:#706       // "<init>":(Ljava/lang/String;)V
  #714 = Utf8               Signature
  #715 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;
  #716 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #717 = Utf8               SELECT_OLYMPIAD_DATA
  #718 = Utf8               Ljava/lang/String;
  #719 = Utf8               ConstantValue
  #720 = Utf8               INSERT_OLYMPIAD_DATA
  #721 = Utf8               SELECT_OLYMPIAD_NOBLES
  #722 = Utf8               INSERT_OR_UPDATE_OLYMPIAD_NOBLES
  #723 = Utf8               TRUNCATE_OLYMPIAD_NOBLES
  #724 = Utf8               SELECT_CLASSIFIED_NOBLES
  #725 = Utf8               SELECT_CLASS_LEADER
  #726 = Utf8               SELECT_CLASS_LEADER_CURRENT
  #727 = Utf8               SELECT_MONTH_OLYMPIAD_POINTS
  #728 = Utf8               INSERT_MONTH_OLYMPIAD
  #729 = Utf8               TRUNCATE_MONTH_OLYMPIAD
  #730 = Utf8               OLYMPIAD_HTML_PATH
  #731 = String             #732          // html/olympiad/
  #732 = Utf8               html/olympiad/
  #733 = Utf8               CHAR_ID
  #734 = Utf8               CLASS_ID
  #735 = Utf8               CHAR_NAME
  #736 = Utf8               POINTS
  #737 = Utf8               COMP_DONE
  #738 = Utf8               COMP_WON
  #739 = Utf8               COMP_LOST
  #740 = Utf8               COMP_DRAWN
  #741 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #742 = Utf8               Code
  #743 = Utf8               LineNumberTable
  #744 = Utf8               LocalVariableTable
  #745 = Utf8               this
  #746 = Utf8               StackMapTable
  #747 = Utf8               getNobleStats
  #748 = Utf8               (I)Lext/mods/commons/data/StatSet;
  #749 = Utf8               objectId
  #750 = Utf8               Lext/mods/commons/data/StatSet;
  #751 = Utf8               getNoblePoints
  #752 = Utf8               (I)I
  #753 = Utf8               objId
  #754 = Utf8               isInCompPeriod
  #755 = Utf8               getCurrentCycle
  #756 = Utf8               rs
  #757 = Utf8               Ljava/sql/ResultSet;
  #758 = Utf8               ps
  #759 = Utf8               Ljava/sql/PreparedStatement;
  #760 = Utf8               con
  #761 = Utf8               Ljava/sql/Connection;
  #762 = Utf8               e
  #763 = Utf8               Ljava/lang/Exception;
  #764 = Utf8               rset
  #765 = Utf8               milliToEnd
  #766 = Utf8               place
  #767 = Utf8               temporaryRank
  #768 = Utf8               Ljava/util/Map$Entry;
  #769 = Utf8               temporaryRanks
  #770 = Utf8               rank1
  #771 = Utf8               rank2
  #772 = Utf8               rank3
  #773 = Utf8               rank4
  #774 = Utf8               LocalVariableTypeTable
  #775 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #776 = Utf8               milliToStart
  #777 = Utf8               numSecs
  #778 = Utf8               D
  #779 = Utf8               countDown
  #780 = Utf8               numMins
  #781 = Utf8               numHours
  #782 = Utf8               numDays
  #783 = Utf8               manualSelectHeroes
  #784 = Utf8               currentTime
  #785 = Utf8               nextChange
  #786 = Utf8               playerInStadia
  #787 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #788 = Utf8               player
  #789 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #790 = Utf8               noble
  #791 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/commons/data/StatSet;>;
  #792 = Utf8               getClassLeaderBoard
  #793 = Utf8               (I)Ljava/util/List;
  #794 = Utf8               classId
  #795 = Utf8               names
  #796 = Utf8               Ljava/util/List;
  #797 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #798 = Class              #799          // java/lang/String
  #799 = Utf8               java/lang/String
  #800 = Utf8               (I)Ljava/util/List<Ljava/lang/String;>;
  #801 = Utf8               getNoblessePasses
  #802 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)I
  #803 = Utf8               rankReward
  #804 = Utf8               Ljava/lang/Integer;
  #805 = Utf8               points
  #806 = Utf8               getLastNobleOlympiadPoints
  #807 = Utf8               result
  #808 = Utf8               olympiadEnd
  #809 = Utf8               ps2
  #810 = Utf8               validationEnd
  #811 = Utf8               ()Lext/mods/gameserver/model/olympiad/Olympiad;
  #812 = Utf8               lambda$scheduleWeeklyChange$0
  #813 = Utf8               i$
  #814 = Utf8               Ljava/util/Iterator;
  #815 = Utf8               lambda$init$0
  #816 = Utf8               regEnd
  #817 = Utf8               lambda$init$3
  #818 = Utf8               lambda$init$2
  #819 = Utf8               lambda$init$1
  #820 = Utf8               announcement
  #821 = Utf8               manager
  #822 = Utf8               Lext/mods/gameserver/model/actor/instance/OlympiadManagerNpc;
  #823 = Utf8               game
  #824 = Utf8               Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #825 = Utf8               task
  #826 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #827 = Utf8               arr$
  #828 = Utf8               [Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #829 = Utf8               len$
  #830 = Class              #828          // "[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;"
  #831 = Utf8               <clinit>
  #832 = Utf8               SourceFile
  #833 = Utf8               Olympiad.java
  #834 = Utf8               NestMembers
  #835 = Utf8               BootstrapMethods
  #836 = MethodType         #6            //  ()V
  #837 = MethodHandle       5:#838        // REF_invokeVirtual ext/mods/gameserver/model/olympiad/Olympiad.validationEnd:()V
  #838 = Methodref          #11.#839      // ext/mods/gameserver/model/olympiad/Olympiad.validationEnd:()V
  #839 = NameAndType        #810:#6       // validationEnd:()V
  #840 = MethodHandle       5:#841        // REF_invokeVirtual ext/mods/gameserver/model/olympiad/Olympiad.olympiadEnd:()V
  #841 = Methodref          #11.#842      // ext/mods/gameserver/model/olympiad/Olympiad.olympiadEnd:()V
  #842 = NameAndType        #808:#6       // olympiadEnd:()V
  #843 = MethodHandle       5:#844        // REF_invokeVirtual ext/mods/gameserver/model/olympiad/Olympiad.lambda$init$0:()V
  #844 = Methodref          #11.#845      // ext/mods/gameserver/model/olympiad/Olympiad.lambda$init$0:()V
  #845 = NameAndType        #815:#6       // lambda$init$0:()V
  #846 = MethodHandle       5:#847        // REF_invokeVirtual ext/mods/gameserver/model/olympiad/Olympiad.lambda$scheduleWeeklyChange$0:()V
  #847 = Methodref          #11.#848      // ext/mods/gameserver/model/olympiad/Olympiad.lambda$scheduleWeeklyChange$0:()V
  #848 = NameAndType        #812:#6       // lambda$scheduleWeeklyChange$0:()V
  #849 = MethodHandle       6:#850        // REF_invokeStatic ext/mods/gameserver/model/olympiad/Olympiad.lambda$init$1:()V
  #850 = Methodref          #11.#851      // ext/mods/gameserver/model/olympiad/Olympiad.lambda$init$1:()V
  #851 = NameAndType        #819:#6       // lambda$init$1:()V
  #852 = MethodHandle       6:#853        // REF_invokeStatic ext/mods/gameserver/model/olympiad/Olympiad.lambda$init$2:()V
  #853 = Methodref          #11.#854      // ext/mods/gameserver/model/olympiad/Olympiad.lambda$init$2:()V
  #854 = NameAndType        #818:#6       // lambda$init$2:()V
  #855 = MethodHandle       5:#856        // REF_invokeVirtual ext/mods/gameserver/model/olympiad/Olympiad.lambda$init$3:()V
  #856 = Methodref          #11.#857      // ext/mods/gameserver/model/olympiad/Olympiad.lambda$init$3:()V
  #857 = NameAndType        #817:#6       // lambda$init$3:()V
  #858 = String             #859          // Olympiad class-free individual match is going to begin in Arena \u0001 in a moment.
  #859 = Utf8               Olympiad class-free individual match is going to begin in Arena \u0001 in a moment.
  #860 = String             #861          // Olympiad class individual match is going to begin in Arena \u0001 in a moment.
  #861 = Utf8               Olympiad class individual match is going to begin in Arena \u0001 in a moment.
  #862 = MethodHandle       6:#863        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #863 = Methodref          #864.#865     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #864 = Class              #866          // java/lang/invoke/LambdaMetafactory
  #865 = NameAndType        #867:#868     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #866 = Utf8               java/lang/invoke/LambdaMetafactory
  #867 = Utf8               metafactory
  #868 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #869 = MethodHandle       6:#870        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #870 = Methodref          #871.#872     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #871 = Class              #873          // java/lang/invoke/StringConcatFactory
  #872 = NameAndType        #693:#874     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #873 = Utf8               java/lang/invoke/StringConcatFactory
  #874 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #875 = Utf8               InnerClasses
  #876 = Utf8               Entry
  #877 = Utf8               SingletonHolder
  #878 = Class              #879          // java/lang/invoke/MethodHandles$Lookup
  #879 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #880 = Class              #881          // java/lang/invoke/MethodHandles
  #881 = Utf8               java/lang/invoke/MethodHandles
  #882 = Utf8               Lookup
{
  protected static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  public static final java.lang.String OLYMPIAD_HTML_PATH;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String html/olympiad/

  public static final java.lang.String CHAR_ID;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String char_id

  public static final java.lang.String CLASS_ID;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String class_id

  public static final java.lang.String CHAR_NAME;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String char_name

  public static final java.lang.String POINTS;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String olympiad_points

  public static final java.lang.String COMP_DONE;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String competitions_done

  public static final java.lang.String COMP_WON;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String competitions_won

  public static final java.lang.String COMP_LOST;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String competitions_lost

  public static final java.lang.String COMP_DRAWN;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String competitions_drawn

  protected long _olympiadEnd;
    descriptor: J
    flags: (0x0004) ACC_PROTECTED

  protected long _validationEnd;
    descriptor: J
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.enums.OlympiadState _period;
    descriptor: Lext/mods/gameserver/enums/OlympiadState;
    flags: (0x0004) ACC_PROTECTED

  protected long _nextWeeklyChange;
    descriptor: J
    flags: (0x0004) ACC_PROTECTED

  protected int _currentCycle;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected boolean _isInCompPeriod;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected java.util.concurrent.ScheduledFuture<?> _competitionStartTask;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0004) ACC_PROTECTED
    Signature: #741                         // Ljava/util/concurrent/ScheduledFuture<*>;

  protected java.util.concurrent.ScheduledFuture<?> _competitionEndTask;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0004) ACC_PROTECTED
    Signature: #741                         // Ljava/util/concurrent/ScheduledFuture<*>;

  protected java.util.concurrent.ScheduledFuture<?> _olympiadEndTask;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0004) ACC_PROTECTED
    Signature: #741                         // Ljava/util/concurrent/ScheduledFuture<*>;

  protected java.util.concurrent.ScheduledFuture<?> _weeklyTask;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0004) ACC_PROTECTED
    Signature: #741                         // Ljava/util/concurrent/ScheduledFuture<*>;

  protected java.util.concurrent.ScheduledFuture<?> _validationEndTask;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0004) ACC_PROTECTED
    Signature: #741                         // Ljava/util/concurrent/ScheduledFuture<*>;

  protected java.util.concurrent.ScheduledFuture<?> _gameManagerTask;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0004) ACC_PROTECTED
    Signature: #741                         // Ljava/util/concurrent/ScheduledFuture<*>;

  protected java.util.concurrent.ScheduledFuture<?> _gameAnnouncerTask;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0004) ACC_PROTECTED
    Signature: #741                         // Ljava/util/concurrent/ScheduledFuture<*>;

  protected ext.mods.gameserver.model.olympiad.Olympiad();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _nobles:Ljava/util/Map;
        15: aload_0
        16: new           #16                 // class java/util/HashMap
        19: dup
        20: invokespecial #18                 // Method java/util/HashMap."<init>":()V
        23: putfield      #19                 // Field _rankRewards:Ljava/util/Map;
        26: getstatic     #22                 // Field ext/mods/Config.OLY_ENABLED:Z
        29: ifeq          60
        32: aload_0
        33: invokevirtual #28                 // Method load:()V
        36: invokestatic  #31                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
        39: iconst_1
        40: invokevirtual #37                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.registerEvent:(I)V
        43: aload_0
        44: getfield      #41                 // Field _period:Lext/mods/gameserver/enums/OlympiadState;
        47: getstatic     #45                 // Field ext/mods/gameserver/enums/OlympiadState.COMPETITION:Lext/mods/gameserver/enums/OlympiadState;
        50: if_acmpne     68
        53: aload_0
        54: invokevirtual #50                 // Method init:()V
        57: goto          68
        60: getstatic     #53                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        63: ldc           #57                 // String Olympiad disabled.
        65: invokevirtual #59                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        68: return
      LineNumberTable:
        line 102: 0
        line 54: 4
        line 55: 15
        line 103: 26
        line 105: 32
        line 106: 36
        line 108: 43
        line 109: 53
        line 112: 60
        line 113: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      69     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad ]
          stack = []
        frame_type = 7 /* same */

  public ext.mods.commons.data.StatSet getNobleStats(int);
    descriptor: (I)Lext/mods/commons/data/StatSet;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _nobles:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #71,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #77                 // class ext/mods/commons/data/StatSet
        16: areturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;
            0      17     1 objectId   I

  public ext.mods.commons.data.StatSet addNobleStats(int, ext.mods.commons.data.StatSet);
    descriptor: (ILext/mods/commons/data/StatSet;)Lext/mods/commons/data/StatSet;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _nobles:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: aload_2
         9: invokeinterface #79,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        14: checkcast     #77                 // class ext/mods/commons/data/StatSet
        17: areturn
      LineNumberTable:
        line 127: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;
            0      18     1 objectId   I
            0      18     2   set   Lext/mods/commons/data/StatSet;

  public int getNoblePoints(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _nobles:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #71,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #77                 // class ext/mods/commons/data/StatSet
        16: astore_2
        17: aload_2
        18: ifnonnull     25
        21: iconst_0
        22: goto          31
        25: aload_2
        26: ldc           #83                 // String olympiad_points
        28: invokevirtual #85                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        31: ireturn
      LineNumberTable:
        line 132: 0
        line 133: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;
            0      32     1 objId   I
           17      15     2   set   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/commons/data/StatSet ]
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isOlympiadEnd();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _period:Lext/mods/gameserver/enums/OlympiadState;
         4: getstatic     #89                 // Field ext/mods/gameserver/enums/OlympiadState.VALIDATION:Lext/mods/gameserver/enums/OlympiadState;
         7: if_acmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isInCompPeriod();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #92                 // Field _isInCompPeriod:Z
         4: ireturn
      LineNumberTable:
        line 143: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;

  public int getCurrentCycle();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #95                 // Field _currentCycle:I
         4: ireturn
      LineNumberTable:
        line 148: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;

  public void processRankRewards();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=11, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _rankRewards:Ljava/util/Map;
         4: invokeinterface #286,  1          // InterfaceMethod java/util/Map.clear:()V
         9: new           #16                 // class java/util/HashMap
        12: dup
        13: invokespecial #18                 // Method java/util/HashMap."<init>":()V
        16: astore_1
        17: invokestatic  #99                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        20: astore_2
        21: aload_2
        22: ldc_w         #289                // String SELECT char_id from olympiad_nobles_eom WHERE competitions_done >= ? ORDER BY olympiad_points DESC, competitions_done DESC, competitions_won DESC
        25: invokeinterface #107,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        30: astore_3
        31: aload_3
        32: iconst_1
        33: getstatic     #291                // Field ext/mods/Config.OLY_MIN_MATCHES:I
        36: invokeinterface #294,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        41: aload_3
        42: invokeinterface #113,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        47: astore        4
        49: iconst_1
        50: istore        5
        52: aload         4
        54: invokeinterface #119,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        59: ifeq          92
        62: aload_1
        63: aload         4
        65: ldc           #252                // String char_id
        67: invokeinterface #127,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        72: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        75: iload         5
        77: iinc          5, 1
        80: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        83: invokeinterface #79,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        88: pop
        89: goto          52
        92: aload         4
        94: ifnull        136
        97: aload         4
        99: invokeinterface #163,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       104: goto          136
       107: astore        5
       109: aload         4
       111: ifnull        133
       114: aload         4
       116: invokeinterface #163,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       121: goto          133
       124: astore        6
       126: aload         5
       128: aload         6
       130: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       133: aload         5
       135: athrow
       136: aload_3
       137: ifnull        176
       140: aload_3
       141: invokeinterface #172,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       146: goto          176
       149: astore        4
       151: aload_3
       152: ifnull        173
       155: aload_3
       156: invokeinterface #172,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       161: goto          173
       164: astore        5
       166: aload         4
       168: aload         5
       170: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       173: aload         4
       175: athrow
       176: aload_2
       177: ifnull        213
       180: aload_2
       181: invokeinterface #173,  1          // InterfaceMethod java/sql/Connection.close:()V
       186: goto          213
       189: astore_3
       190: aload_2
       191: ifnull        211
       194: aload_2
       195: invokeinterface #173,  1          // InterfaceMethod java/sql/Connection.close:()V
       200: goto          211
       203: astore        4
       205: aload_3
       206: aload         4
       208: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       211: aload_3
       212: athrow
       213: goto          227
       216: astore_2
       217: getstatic     #53                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       220: ldc_w         #298                // String Couldn\'t load Olympiad ranks.
       223: aload_2
       224: invokevirtual #178                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       227: aload_1
       228: invokeinterface #283,  1          // InterfaceMethod java/util/Map.size:()I
       233: istore_2
       234: iload_2
       235: i2d
       236: ldc2_w        #300                // double 0.01d
       239: dmul
       240: invokestatic  #302                // Method java/lang/Math.round:(D)J
       243: l2i
       244: istore_3
       245: iload_2
       246: i2d
       247: ldc2_w        #305                // double 0.1d
       250: dmul
       251: invokestatic  #302                // Method java/lang/Math.round:(D)J
       254: l2i
       255: istore        4
       257: iload_2
       258: i2d
       259: ldc2_w        #307                // double 0.25d
       262: dmul
       263: invokestatic  #302                // Method java/lang/Math.round:(D)J
       266: l2i
       267: istore        5
       269: iload_2
       270: i2d
       271: ldc2_w        #309                // double 0.5d
       274: dmul
       275: invokestatic  #302                // Method java/lang/Math.round:(D)J
       278: l2i
       279: istore        6
       281: iload_3
       282: ifne          296
       285: iconst_1
       286: istore_3
       287: iinc          4, 1
       290: iinc          5, 1
       293: iinc          6, 1
       296: aload_1
       297: invokeinterface #311,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       302: invokeinterface #315,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       307: astore        7
       309: aload         7
       311: invokeinterface #321,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       316: ifeq          498
       319: aload         7
       321: invokeinterface #326,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       326: checkcast     #329                // class java/util/Map$Entry
       329: astore        8
       331: aload         8
       333: invokeinterface #331,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
       338: checkcast     #66                 // class java/lang/Integer
       341: invokevirtual #334                // Method java/lang/Integer.intValue:()I
       344: istore        9
       346: aload         8
       348: invokeinterface #337,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       353: checkcast     #66                 // class java/lang/Integer
       356: invokevirtual #334                // Method java/lang/Integer.intValue:()I
       359: istore        10
       361: iload         10
       363: iload_3
       364: if_icmpgt     389
       367: aload_0
       368: getfield      #19                 // Field _rankRewards:Ljava/util/Map;
       371: iload         9
       373: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       376: iconst_1
       377: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       380: invokeinterface #79,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       385: pop
       386: goto          495
       389: iload         10
       391: iload         4
       393: if_icmpgt     418
       396: aload_0
       397: getfield      #19                 // Field _rankRewards:Ljava/util/Map;
       400: iload         9
       402: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       405: iconst_2
       406: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       409: invokeinterface #79,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       414: pop
       415: goto          495
       418: iload         10
       420: iload         5
       422: if_icmpgt     447
       425: aload_0
       426: getfield      #19                 // Field _rankRewards:Ljava/util/Map;
       429: iload         9
       431: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       434: iconst_3
       435: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       438: invokeinterface #79,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       443: pop
       444: goto          495
       447: iload         10
       449: iload         6
       451: if_icmpgt     476
       454: aload_0
       455: getfield      #19                 // Field _rankRewards:Ljava/util/Map;
       458: iload         9
       460: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       463: iconst_4
       464: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       467: invokeinterface #79,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       472: pop
       473: goto          495
       476: aload_0
       477: getfield      #19                 // Field _rankRewards:Ljava/util/Map;
       480: iload         9
       482: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       485: iconst_5
       486: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       489: invokeinterface #79,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       494: pop
       495: goto          309
       498: return
      Exception table:
         from    to  target type
            49    92   107   Class java/lang/Throwable
           114   121   124   Class java/lang/Throwable
            31   136   149   Class java/lang/Throwable
           155   161   164   Class java/lang/Throwable
            21   176   189   Class java/lang/Throwable
           194   200   203   Class java/lang/Throwable
            17   213   216   Class java/lang/Exception
      LineNumberTable:
        line 256: 0
        line 258: 9
        line 260: 17
        line 261: 21
        line 263: 31
        line 265: 41
        line 267: 49
        line 268: 52
        line 269: 62
        line 270: 92
        line 265: 107
        line 271: 136
        line 260: 149
        line 271: 176
        line 260: 189
        line 275: 213
        line 272: 216
        line 274: 217
        line 277: 227
        line 279: 234
        line 280: 245
        line 281: 257
        line 282: 269
        line 284: 281
        line 286: 285
        line 287: 287
        line 288: 290
        line 289: 293
        line 292: 296
        line 294: 331
        line 295: 346
        line 297: 361
        line 298: 367
        line 299: 389
        line 300: 396
        line 301: 418
        line 302: 425
        line 303: 447
        line 304: 454
        line 306: 476
        line 307: 495
        line 308: 498
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           52      40     5 place   I
           49      87     4    rs   Ljava/sql/ResultSet;
           31     145     3    ps   Ljava/sql/PreparedStatement;
           21     192     2   con   Ljava/sql/Connection;
          217      10     2     e   Ljava/lang/Exception;
          346     149     9 objectId   I
          361     134    10 place   I
          331     164     8 temporaryRank   Ljava/util/Map$Entry;
            0     499     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;
           17     482     1 temporaryRanks   Ljava/util/Map;
          234     265     2  size   I
          245     254     3 rank1   I
          257     242     4 rank2   I
          269     230     5 rank3   I
          281     218     6 rank4   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          331     164     8 temporaryRank   Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Integer;>;
           17     482     1 temporaryRanks   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 24
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, class java/util/Map, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 39
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, class java/util/Map, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, class java/util/Map, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, class java/util/Map, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, class java/util/Map, int, int, int, int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 79
          locals = [ class java/util/Map$Entry, int, int ]
        frame_type = 28 /* same */
        frame_type = 28 /* same */
        frame_type = 28 /* same */
        frame_type = 248 /* chop */
          offset_delta = 18
        frame_type = 250 /* chop */
          offset_delta = 2

  public void manualSelectHeroes();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #358                // Field _olympiadEndTask:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        18
         7: aload_0
         8: getfield      #358                // Field _olympiadEndTask:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_1
        12: invokeinterface #361,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aload_0
        20: invokedynamic #367,  0            // InvokeDynamic #1:run:(Lext/mods/gameserver/model/olympiad/Olympiad;)Ljava/lang/Runnable;
        25: lconst_0
        26: invokestatic  #217                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        29: putfield      #358                // Field _olympiadEndTask:Ljava/util/concurrent/ScheduledFuture;
        32: return
      LineNumberTable:
        line 429: 0
        line 430: 7
        line 432: 18
        line 433: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */

  protected long getMillisToCompEnd();
    descriptor: ()J
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #355                // Field _compEnd:J
         4: invokestatic  #192                // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
         7: invokevirtual #197                // Method java/util/Calendar.getTimeInMillis:()J
        10: lsub
        11: lreturn
      LineNumberTable:
        line 537: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;

  public boolean playerInStadia(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: invokestatic  #456                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
         3: aload_1
         4: ldc_w         #461                // class ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
         7: invokevirtual #463                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
        10: ifnull        17
        13: iconst_1
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 569: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;
            0      19     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void saveOlympiadStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #481                // Method saveNobleData:()V
         4: invokestatic  #99                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         7: astore_1
         8: aload_1
         9: ldc_w         #484                // String INSERT INTO olympiad_data (id, current_cycle, period, olympiad_end, validation_end, next_weekly_change) VALUES (0,?,?,?,?,?) ON DUPLICATE KEY UPDATE current_cycle=?, period=?, olympiad_end=?, validation_end=?, next_weekly_change=?
        12: invokeinterface #107,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        17: astore_2
        18: aload_2
        19: iconst_1
        20: aload_0
        21: getfield      #95                 // Field _currentCycle:I
        24: invokeinterface #294,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        29: aload_2
        30: iconst_2
        31: aload_0
        32: getfield      #41                 // Field _period:Lext/mods/gameserver/enums/OlympiadState;
        35: invokevirtual #486                // Method ext/mods/gameserver/enums/OlympiadState.toString:()Ljava/lang/String;
        38: invokeinterface #490,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        43: aload_2
        44: iconst_3
        45: aload_0
        46: getfield      #147                // Field _olympiadEnd:J
        49: invokeinterface #494,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        54: aload_2
        55: iconst_4
        56: aload_0
        57: getfield      #153                // Field _validationEnd:J
        60: invokeinterface #494,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        65: aload_2
        66: iconst_5
        67: aload_0
        68: getfield      #158                // Field _nextWeeklyChange:J
        71: invokeinterface #494,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        76: aload_2
        77: bipush        6
        79: aload_0
        80: getfield      #95                 // Field _currentCycle:I
        83: invokeinterface #294,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        88: aload_2
        89: bipush        7
        91: aload_0
        92: getfield      #41                 // Field _period:Lext/mods/gameserver/enums/OlympiadState;
        95: invokevirtual #486                // Method ext/mods/gameserver/enums/OlympiadState.toString:()Ljava/lang/String;
        98: invokeinterface #490,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       103: aload_2
       104: bipush        8
       106: aload_0
       107: getfield      #147                // Field _olympiadEnd:J
       110: invokeinterface #494,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       115: aload_2
       116: bipush        9
       118: aload_0
       119: getfield      #153                // Field _validationEnd:J
       122: invokeinterface #494,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       127: aload_2
       128: bipush        10
       130: aload_0
       131: getfield      #158                // Field _nextWeeklyChange:J
       134: invokeinterface #494,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       139: aload_2
       140: invokeinterface #498,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       145: pop
       146: aload_2
       147: ifnull        183
       150: aload_2
       151: invokeinterface #172,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       156: goto          183
       159: astore_3
       160: aload_2
       161: ifnull        181
       164: aload_2
       165: invokeinterface #172,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       170: goto          181
       173: astore        4
       175: aload_3
       176: aload         4
       178: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       181: aload_3
       182: athrow
       183: aload_1
       184: ifnull        218
       187: aload_1
       188: invokeinterface #173,  1          // InterfaceMethod java/sql/Connection.close:()V
       193: goto          218
       196: astore_2
       197: aload_1
       198: ifnull        216
       201: aload_1
       202: invokeinterface #173,  1          // InterfaceMethod java/sql/Connection.close:()V
       207: goto          216
       210: astore_3
       211: aload_2
       212: aload_3
       213: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       216: aload_2
       217: athrow
       218: goto          232
       221: astore_1
       222: getstatic     #53                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       225: ldc_w         #501                // String Couldn\'t save Olympiad status.
       228: aload_1
       229: invokevirtual #178                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       232: return
      Exception table:
         from    to  target type
            18   146   159   Class java/lang/Throwable
           164   170   173   Class java/lang/Throwable
             8   183   196   Class java/lang/Throwable
           201   207   210   Class java/lang/Throwable
             4   218   221   Class java/lang/Exception
      LineNumberTable:
        line 611: 0
        line 613: 4
        line 614: 8
        line 616: 18
        line 617: 29
        line 618: 43
        line 619: 54
        line 620: 65
        line 621: 76
        line 622: 88
        line 623: 103
        line 624: 115
        line 625: 127
        line 626: 139
        line 627: 146
        line 613: 159
        line 627: 183
        line 613: 196
        line 631: 218
        line 628: 221
        line 630: 222
        line 632: 232
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18     165     2    ps   Ljava/sql/PreparedStatement;
            8     210     1   con   Ljava/sql/Connection;
          222      10     1     e   Ljava/lang/Exception;
            0     233     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 159
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public java.util.List<java.lang.String> getClassLeaderBoard(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=2
         0: new           #503                // class java/util/ArrayList
         3: dup
         4: invokespecial #505                // Method java/util/ArrayList."<init>":()V
         7: astore_2
         8: invokestatic  #99                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        11: astore_3
        12: aload_3
        13: getstatic     #506                // Field ext/mods/Config.OLY_SHOW_MONTHLY_WINNERS:Z
        16: ifeq          25
        19: ldc_w         #509                // String SELECT characters.char_name from olympiad_nobles_eom, characters WHERE characters.obj_Id = olympiad_nobles_eom.char_id AND olympiad_nobles_eom.class_id = ? AND olympiad_nobles_eom.competitions_done >= ? ORDER BY olympiad_nobles_eom.olympiad_points DESC, olympiad_nobles_eom.competitions_done DESC, olympiad_nobles_eom.competitions_won DESC LIMIT 10
        22: goto          28
        25: ldc_w         #511                // String SELECT characters.char_name from olympiad_nobles, characters WHERE characters.obj_Id = olympiad_nobles.char_id AND olympiad_nobles.class_id = ? AND olympiad_nobles.competitions_done >= 3 ORDER BY olympiad_nobles.olympiad_points DESC, olympiad_nobles.competitions_done DESC LIMIT 10
        28: invokeinterface #107,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        33: astore        4
        35: aload         4
        37: iconst_1
        38: iload_1
        39: invokeinterface #294,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        44: aload         4
        46: iconst_2
        47: getstatic     #291                // Field ext/mods/Config.OLY_MIN_MATCHES:I
        50: invokeinterface #294,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        55: aload         4
        57: invokeinterface #113,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        62: astore        5
        64: aload         5
        66: invokeinterface #119,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        71: ifeq          93
        74: aload_2
        75: aload         5
        77: ldc           #239                // String char_name
        79: invokeinterface #132,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        84: invokeinterface #513,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        89: pop
        90: goto          64
        93: aload         5
        95: ifnull        137
        98: aload         5
       100: invokeinterface #163,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       105: goto          137
       108: astore        6
       110: aload         5
       112: ifnull        134
       115: aload         5
       117: invokeinterface #163,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       122: goto          134
       125: astore        7
       127: aload         6
       129: aload         7
       131: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       134: aload         6
       136: athrow
       137: aload         4
       139: ifnull        181
       142: aload         4
       144: invokeinterface #172,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       149: goto          181
       152: astore        5
       154: aload         4
       156: ifnull        178
       159: aload         4
       161: invokeinterface #172,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       166: goto          178
       169: astore        6
       171: aload         5
       173: aload         6
       175: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       178: aload         5
       180: athrow
       181: aload_3
       182: ifnull        221
       185: aload_3
       186: invokeinterface #173,  1          // InterfaceMethod java/sql/Connection.close:()V
       191: goto          221
       194: astore        4
       196: aload_3
       197: ifnull        218
       200: aload_3
       201: invokeinterface #173,  1          // InterfaceMethod java/sql/Connection.close:()V
       206: goto          218
       209: astore        5
       211: aload         4
       213: aload         5
       215: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       218: aload         4
       220: athrow
       221: goto          235
       224: astore_3
       225: getstatic     #53                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       228: ldc_w         #518                // String Couldn\'t load Olympiad leaders.
       231: aload_3
       232: invokevirtual #178                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       235: aload_2
       236: areturn
      Exception table:
         from    to  target type
            64    93   108   Class java/lang/Throwable
           115   122   125   Class java/lang/Throwable
            35   137   152   Class java/lang/Throwable
           159   166   169   Class java/lang/Throwable
            12   181   194   Class java/lang/Throwable
           200   206   209   Class java/lang/Throwable
             8   221   224   Class java/lang/Exception
      LineNumberTable:
        line 636: 0
        line 638: 8
        line 639: 12
        line 641: 35
        line 642: 44
        line 644: 55
        line 646: 64
        line 647: 74
        line 648: 93
        line 644: 108
        line 649: 137
        line 638: 152
        line 649: 181
        line 638: 194
        line 653: 221
        line 650: 224
        line 652: 225
        line 654: 235
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           64      73     5    rs   Ljava/sql/ResultSet;
           35     146     4    ps   Ljava/sql/PreparedStatement;
           12     209     3   con   Ljava/sql/Connection;
          225      10     3     e   Ljava/lang/Exception;
            0     237     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;
            0     237     1 classId   I
            8     229     2 names   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     229     2 names   Ljava/util/List<Ljava/lang/String;>;
      StackMapTable: number_of_entries = 18
        frame_type = 255 /* full_frame */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, int, class java/util/List, class java/sql/Connection ]
          stack = [ class java/sql/Connection ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, int, class java/util/List, class java/sql/Connection ]
          stack = [ class java/sql/Connection, class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 28 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, int, class java/util/List, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, int, class java/util/List, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, int, class java/util/List, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
    Signature: #800                         // (I)Ljava/util/List<Ljava/lang/String;>;

  public int getNoblessePasses(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=3
         0: aload_1
         1: ifnull        14
         4: aload_0
         5: getfield      #41                 // Field _period:Lext/mods/gameserver/enums/OlympiadState;
         8: getstatic     #89                 // Field ext/mods/gameserver/enums/OlympiadState.VALIDATION:Lext/mods/gameserver/enums/OlympiadState;
        11: if_acmpeq     16
        14: iconst_0
        15: ireturn
        16: aload_0
        17: getfield      #19                 // Field _rankRewards:Ljava/util/Map;
        20: aload_1
        21: invokevirtual #520                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        24: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        27: invokeinterface #71,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        32: checkcast     #66                 // class java/lang/Integer
        35: astore_3
        36: aload_3
        37: ifnonnull     42
        40: iconst_0
        41: ireturn
        42: aload_0
        43: getfield      #10                 // Field _nobles:Ljava/util/Map;
        46: aload_1
        47: invokevirtual #520                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        50: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        53: invokeinterface #71,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        58: checkcast     #77                 // class ext/mods/commons/data/StatSet
        61: astore        4
        63: aload         4
        65: ifnull        78
        68: aload         4
        70: ldc           #83                 // String olympiad_points
        72: invokevirtual #85                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        75: ifne          80
        78: iconst_0
        79: ireturn
        80: iload_2
        81: ifeq          92
        84: aload         4
        86: ldc           #83                 // String olympiad_points
        88: iconst_0
        89: invokevirtual #235                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
        92: aload_1
        93: invokevirtual #525                // Method ext/mods/gameserver/model/actor/Player.isHero:()Z
        96: ifne          112
        99: invokestatic  #528                // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
       102: aload_1
       103: invokevirtual #520                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       106: invokevirtual #533                // Method ext/mods/gameserver/data/manager/HeroManager.isInactiveHero:(I)Z
       109: ifeq          118
       112: getstatic     #537                // Field ext/mods/Config.OLY_HERO_POINTS:I
       115: goto          119
       118: iconst_0
       119: istore        5
       121: aload_3
       122: invokevirtual #334                // Method java/lang/Integer.intValue:()I
       125: tableswitch   { // 1 to 4

                       1: 156

                       2: 167

                       3: 178

                       4: 189
                 default: 200
            }
       156: iload         5
       158: getstatic     #540                // Field ext/mods/Config.OLY_RANK1_POINTS:I
       161: iadd
       162: istore        5
       164: goto          208
       167: iload         5
       169: getstatic     #543                // Field ext/mods/Config.OLY_RANK2_POINTS:I
       172: iadd
       173: istore        5
       175: goto          208
       178: iload         5
       180: getstatic     #546                // Field ext/mods/Config.OLY_RANK3_POINTS:I
       183: iadd
       184: istore        5
       186: goto          208
       189: iload         5
       191: getstatic     #549                // Field ext/mods/Config.OLY_RANK4_POINTS:I
       194: iadd
       195: istore        5
       197: goto          208
       200: iload         5
       202: getstatic     #552                // Field ext/mods/Config.OLY_RANK5_POINTS:I
       205: iadd
       206: istore        5
       208: iload         5
       210: getstatic     #555                // Field ext/mods/Config.OLY_GP_PER_POINT:I
       213: imul
       214: istore        5
       216: iload         5
       218: ireturn
      LineNumberTable:
        line 659: 0
        line 660: 14
        line 662: 16
        line 663: 36
        line 664: 40
        line 666: 42
        line 667: 63
        line 668: 78
        line 670: 80
        line 671: 84
        line 673: 92
        line 675: 121
        line 678: 156
        line 679: 164
        line 681: 167
        line 682: 175
        line 684: 178
        line 685: 186
        line 687: 189
        line 688: 197
        line 690: 200
        line 693: 208
        line 694: 216
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     219     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;
            0     219     1 player   Lext/mods/gameserver/model/actor/Player;
            0     219     2 clear   Z
           36     183     3 rankReward   Ljava/lang/Integer;
           63     156     4   set   Lext/mods/commons/data/StatSet;
          121      98     5 points   I
      StackMapTable: number_of_entries = 15
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/lang/Integer ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/commons/data/StatSet ]
        frame_type = 1 /* same */
        frame_type = 11 /* same */
        frame_type = 19 /* same */
        frame_type = 5 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ int ]
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 7 /* same */

  public int getLastNobleOlympiadPoints(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=2
         0: iconst_0
         1: istore_2
         2: invokestatic  #99                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         5: astore_3
         6: aload_3
         7: ldc_w         #558                // String SELECT olympiad_points FROM olympiad_nobles_eom WHERE char_id = ?
        10: invokeinterface #107,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        15: astore        4
        17: aload         4
        19: iconst_1
        20: iload_1
        21: invokeinterface #294,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        26: aload         4
        28: invokeinterface #113,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        33: astore        5
        35: aload         5
        37: invokeinterface #119,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        42: ifeq          55
        45: aload         5
        47: ldc           #83                 // String olympiad_points
        49: invokeinterface #127,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        54: istore_2
        55: aload         5
        57: ifnull        99
        60: aload         5
        62: invokeinterface #163,  1          // InterfaceMethod java/sql/ResultSet.close:()V
        67: goto          99
        70: astore        6
        72: aload         5
        74: ifnull        96
        77: aload         5
        79: invokeinterface #163,  1          // InterfaceMethod java/sql/ResultSet.close:()V
        84: goto          96
        87: astore        7
        89: aload         6
        91: aload         7
        93: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        96: aload         6
        98: athrow
        99: aload         4
       101: ifnull        143
       104: aload         4
       106: invokeinterface #172,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       111: goto          143
       114: astore        5
       116: aload         4
       118: ifnull        140
       121: aload         4
       123: invokeinterface #172,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       128: goto          140
       131: astore        6
       133: aload         5
       135: aload         6
       137: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       140: aload         5
       142: athrow
       143: aload_3
       144: ifnull        183
       147: aload_3
       148: invokeinterface #173,  1          // InterfaceMethod java/sql/Connection.close:()V
       153: goto          183
       156: astore        4
       158: aload_3
       159: ifnull        180
       162: aload_3
       163: invokeinterface #173,  1          // InterfaceMethod java/sql/Connection.close:()V
       168: goto          180
       171: astore        5
       173: aload         4
       175: aload         5
       177: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       180: aload         4
       182: athrow
       183: goto          197
       186: astore_3
       187: getstatic     #53                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       190: ldc_w         #560                // String Couldn\'t load last Olympiad points.
       193: aload_3
       194: invokevirtual #178                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       197: iload_2
       198: ireturn
      Exception table:
         from    to  target type
            35    55    70   Class java/lang/Throwable
            77    84    87   Class java/lang/Throwable
            17    99   114   Class java/lang/Throwable
           121   128   131   Class java/lang/Throwable
             6   143   156   Class java/lang/Throwable
           162   168   171   Class java/lang/Throwable
             2   183   186   Class java/lang/Exception
      LineNumberTable:
        line 699: 0
        line 701: 2
        line 702: 6
        line 704: 17
        line 706: 26
        line 708: 35
        line 709: 45
        line 710: 55
        line 706: 70
        line 711: 99
        line 701: 114
        line 711: 143
        line 701: 156
        line 715: 183
        line 712: 186
        line 714: 187
        line 716: 197
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      64     5    rs   Ljava/sql/ResultSet;
           17     126     4    ps   Ljava/sql/PreparedStatement;
            6     177     3   con   Ljava/sql/Connection;
          187      10     3     e   Ljava/lang/Exception;
            0     199     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;
            0     199     1 objId   I
            2     197     2 result   I
      StackMapTable: number_of_entries = 15
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  protected void deleteNobles();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=5, args_size=1
         0: invokestatic  #99                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc_w         #562                // String TRUNCATE olympiad_nobles
         8: invokeinterface #107,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_2
        14: aload_2
        15: invokeinterface #498,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        20: pop
        21: aload_2
        22: ifnull        58
        25: aload_2
        26: invokeinterface #172,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        31: goto          58
        34: astore_3
        35: aload_2
        36: ifnull        56
        39: aload_2
        40: invokeinterface #172,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        45: goto          56
        48: astore        4
        50: aload_3
        51: aload         4
        53: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        56: aload_3
        57: athrow
        58: aload_1
        59: ifnull        93
        62: aload_1
        63: invokeinterface #173,  1          // InterfaceMethod java/sql/Connection.close:()V
        68: goto          93
        71: astore_2
        72: aload_1
        73: ifnull        91
        76: aload_1
        77: invokeinterface #173,  1          // InterfaceMethod java/sql/Connection.close:()V
        82: goto          91
        85: astore_3
        86: aload_2
        87: aload_3
        88: invokevirtual #168                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        91: aload_2
        92: athrow
        93: goto          107
        96: astore_1
        97: getstatic     #53                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       100: ldc_w         #564                // String Couldn\'t delete Olympiad nobles.
       103: aload_1
       104: invokevirtual #178                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       107: aload_0
       108: getfield      #10                 // Field _nobles:Ljava/util/Map;
       111: invokeinterface #286,  1          // InterfaceMethod java/util/Map.clear:()V
       116: return
      Exception table:
         from    to  target type
            14    21    34   Class java/lang/Throwable
            39    45    48   Class java/lang/Throwable
             4    58    71   Class java/lang/Throwable
            76    82    85   Class java/lang/Throwable
             0    93    96   Class java/lang/Exception
      LineNumberTable:
        line 721: 0
        line 722: 4
        line 724: 14
        line 725: 21
        line 721: 34
        line 725: 58
        line 721: 71
        line 729: 93
        line 726: 96
        line 728: 97
        line 730: 107
        line 731: 116
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      44     2    ps   Ljava/sql/PreparedStatement;
            4      89     1   con   Ljava/sql/Connection;
           97      10     1     e   Ljava/lang/Exception;
            0     117     0  this   Lext/mods/gameserver/model/olympiad/Olympiad;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/olympiad/Olympiad, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public static ext.mods.gameserver.model.olympiad.Olympiad getInstance();
    descriptor: ()Lext/mods/gameserver/model/olympiad/Olympiad;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #587                // Field ext/mods/gameserver/model/olympiad/Olympiad$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/olympiad/Olympiad;
         3: areturn
      LineNumberTable:
        line 779: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #60                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/model/olympiad/Olympiad
         6: invokevirtual #707                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #712                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #53                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 52: 0
}
SourceFile: "Olympiad.java"
NestMembers:
  ext/mods/gameserver/model/olympiad/Olympiad$1
  ext/mods/gameserver/model/olympiad/Olympiad$SingletonHolder
BootstrapMethods:
  0: #862 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #836 ()V
      #837 REF_invokeVirtual ext/mods/gameserver/model/olympiad/Olympiad.validationEnd:()V
      #836 ()V
  1: #862 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #836 ()V
      #840 REF_invokeVirtual ext/mods/gameserver/model/olympiad/Olympiad.olympiadEnd:()V
      #836 ()V
  2: #862 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #836 ()V
      #843 REF_invokeVirtual ext/mods/gameserver/model/olympiad/Olympiad.lambda$init$0:()V
      #836 ()V
  3: #862 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #836 ()V
      #846 REF_invokeVirtual ext/mods/gameserver/model/olympiad/Olympiad.lambda$scheduleWeeklyChange$0:()V
      #836 ()V
  4: #862 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #836 ()V
      #849 REF_invokeStatic ext/mods/gameserver/model/olympiad/Olympiad.lambda$init$1:()V
      #836 ()V
  5: #862 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #836 ()V
      #852 REF_invokeStatic ext/mods/gameserver/model/olympiad/Olympiad.lambda$init$2:()V
      #836 ()V
  6: #862 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #836 ()V
      #855 REF_invokeVirtual ext/mods/gameserver/model/olympiad/Olympiad.lambda$init$3:()V
      #836 ()V
  7: #869 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #858 Olympiad class-free individual match is going to begin in Arena \u0001 in a moment.
  8: #869 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #860 Olympiad class individual match is going to begin in Arena \u0001 in a moment.
InnerClasses:
  static #183;                            // class ext/mods/gameserver/model/olympiad/Olympiad$1
  public static #876= #329 of #72;        // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #882= #878 of #880; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
