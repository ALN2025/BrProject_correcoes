// Bytecode for: ext.mods.battlerboss.tasks.BattleBossCountDownTask
// File: ext\mods\battlerboss\tasks\BattleBossCountDownTask.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/tasks/BattleBossCountDownTask.class
  Last modified 9 de jul de 2026; size 7141 bytes
  MD5 checksum aef7b7444fb7c2d26f7e8a658a86b323
  Compiled from "BattleBossCountDownTask.java"
public class ext.mods.battlerboss.tasks.BattleBossCountDownTask
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/battlerboss/tasks/BattleBossCountDownTask
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 10, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/battlerboss/tasks/BattleBossCountDownTask.scheduledEvents:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/battlerboss/tasks/BattleBossCountDownTask
   #12 = NameAndType        #14:#15       // scheduledEvents:Ljava/util/Map;
   #13 = Utf8               ext/mods/battlerboss/tasks/BattleBossCountDownTask
   #14 = Utf8               scheduledEvents
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #17.#18       // ext/mods/Crypta/BattleBossData.getInstance:()Lext/mods/Crypta/BattleBossData;
   #17 = Class              #19           // ext/mods/Crypta/BattleBossData
   #18 = NameAndType        #20:#21       // getInstance:()Lext/mods/Crypta/BattleBossData;
   #19 = Utf8               ext/mods/Crypta/BattleBossData
   #20 = Utf8               getInstance
   #21 = Utf8               ()Lext/mods/Crypta/BattleBossData;
   #22 = Fieldref           #11.#23       // ext/mods/battlerboss/tasks/BattleBossCountDownTask.LOGGER:Ljava/util/logging/Logger;
   #23 = NameAndType        #24:#25       // LOGGER:Ljava/util/logging/Logger;
   #24 = Utf8               LOGGER
   #25 = Utf8               Ljava/util/logging/Logger;
   #26 = String             #27           // BattleBossData não está disponível.
   #27 = Utf8               BattleBossData não está disponível.
   #28 = Methodref          #29.#30       // java/util/logging/Logger.severe:(Ljava/lang/String;)V
   #29 = Class              #31           // java/util/logging/Logger
   #30 = NameAndType        #32:#33       // severe:(Ljava/lang/String;)V
   #31 = Utf8               java/util/logging/Logger
   #32 = Utf8               severe
   #33 = Utf8               (Ljava/lang/String;)V
   #34 = Methodref          #17.#35       // ext/mods/Crypta/BattleBossData.getEvents:()Ljava/util/Collection;
   #35 = NameAndType        #36:#37       // getEvents:()Ljava/util/Collection;
   #36 = Utf8               getEvents
   #37 = Utf8               ()Ljava/util/Collection;
   #38 = Class              #39           // java/util/List
   #39 = Utf8               java/util/List
   #40 = Class              #41           // java/lang/Exception
   #41 = Utf8               java/lang/Exception
   #42 = Methodref          #40.#43       // java/lang/Exception.getMessage:()Ljava/lang/String;
   #43 = NameAndType        #44:#45       // getMessage:()Ljava/lang/String;
   #44 = Utf8               getMessage
   #45 = Utf8               ()Ljava/lang/String;
   #46 = InvokeDynamic      #0:#47        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #47 = NameAndType        #48:#49       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #48 = Utf8               makeConcatWithConstants
   #49 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #50 = Methodref          #40.#51       // java/lang/Exception.printStackTrace:()V
   #51 = NameAndType        #52:#6        // printStackTrace:()V
   #52 = Utf8               printStackTrace
   #53 = String             #54           // Nenhum evento encontrado.
   #54 = Utf8               Nenhum evento encontrado.
   #55 = Methodref          #29.#56       // java/util/logging/Logger.warning:(Ljava/lang/String;)V
   #56 = NameAndType        #57:#33       // warning:(Ljava/lang/String;)V
   #57 = Utf8               warning
   #58 = InterfaceMethodref #38.#59       // java/util/List.iterator:()Ljava/util/Iterator;
   #59 = NameAndType        #60:#61       // iterator:()Ljava/util/Iterator;
   #60 = Utf8               iterator
   #61 = Utf8               ()Ljava/util/Iterator;
   #62 = InterfaceMethodref #63.#64       // java/util/Iterator.hasNext:()Z
   #63 = Class              #65           // java/util/Iterator
   #64 = NameAndType        #66:#67       // hasNext:()Z
   #65 = Utf8               java/util/Iterator
   #66 = Utf8               hasNext
   #67 = Utf8               ()Z
   #68 = InterfaceMethodref #63.#69       // java/util/Iterator.next:()Ljava/lang/Object;
   #69 = NameAndType        #70:#71       // next:()Ljava/lang/Object;
   #70 = Utf8               next
   #71 = Utf8               ()Ljava/lang/Object;
   #72 = Class              #73           // ext/mods/battlerboss/holder/EventHolder
   #73 = Utf8               ext/mods/battlerboss/holder/EventHolder
   #74 = Methodref          #11.#75       // ext/mods/battlerboss/tasks/BattleBossCountDownTask.scheduleNextEvent:(Lext/mods/battlerboss/holder/EventHolder;)V
   #75 = NameAndType        #76:#77       // scheduleNextEvent:(Lext/mods/battlerboss/holder/EventHolder;)V
   #76 = Utf8               scheduleNextEvent
   #77 = Utf8               (Lext/mods/battlerboss/holder/EventHolder;)V
   #78 = Methodref          #72.#79       // ext/mods/battlerboss/holder/EventHolder.getConfig:()Lext/mods/battlerboss/holder/BattleBossConfigHolder;
   #79 = NameAndType        #80:#81       // getConfig:()Lext/mods/battlerboss/holder/BattleBossConfigHolder;
   #80 = Utf8               getConfig
   #81 = Utf8               ()Lext/mods/battlerboss/holder/BattleBossConfigHolder;
   #82 = Methodref          #83.#84       // ext/mods/battlerboss/holder/BattleBossConfigHolder.isEnabled:()Z
   #83 = Class              #85           // ext/mods/battlerboss/holder/BattleBossConfigHolder
   #84 = NameAndType        #86:#67       // isEnabled:()Z
   #85 = Utf8               ext/mods/battlerboss/holder/BattleBossConfigHolder
   #86 = Utf8               isEnabled
   #87 = Methodref          #88.#89       // java/time/LocalDateTime.now:()Ljava/time/LocalDateTime;
   #88 = Class              #90           // java/time/LocalDateTime
   #89 = NameAndType        #91:#92       // now:()Ljava/time/LocalDateTime;
   #90 = Utf8               java/time/LocalDateTime
   #91 = Utf8               now
   #92 = Utf8               ()Ljava/time/LocalDateTime;
   #93 = Methodref          #11.#94       // ext/mods/battlerboss/tasks/BattleBossCountDownTask.getNextEventTime:(Lext/mods/battlerboss/holder/EventHolder;Ljava/time/LocalDateTime;)Ljava/time/LocalDateTime;
   #94 = NameAndType        #95:#96       // getNextEventTime:(Lext/mods/battlerboss/holder/EventHolder;Ljava/time/LocalDateTime;)Ljava/time/LocalDateTime;
   #95 = Utf8               getNextEventTime
   #96 = Utf8               (Lext/mods/battlerboss/holder/EventHolder;Ljava/time/LocalDateTime;)Ljava/time/LocalDateTime;
   #97 = Fieldref           #98.#99       // java/time/temporal/ChronoUnit.MILLIS:Ljava/time/temporal/ChronoUnit;
   #98 = Class              #100          // java/time/temporal/ChronoUnit
   #99 = NameAndType        #101:#102     // MILLIS:Ljava/time/temporal/ChronoUnit;
  #100 = Utf8               java/time/temporal/ChronoUnit
  #101 = Utf8               MILLIS
  #102 = Utf8               Ljava/time/temporal/ChronoUnit;
  #103 = Methodref          #98.#104      // java/time/temporal/ChronoUnit.between:(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)J
  #104 = NameAndType        #105:#106     // between:(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)J
  #105 = Utf8               between
  #106 = Utf8               (Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)J
  #107 = InvokeDynamic      #1:#108       // #1:run:(Lext/mods/battlerboss/tasks/BattleBossCountDownTask;Lext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
  #108 = NameAndType        #109:#110     // run:(Lext/mods/battlerboss/tasks/BattleBossCountDownTask;Lext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
  #109 = Utf8               run
  #110 = Utf8               (Lext/mods/battlerboss/tasks/BattleBossCountDownTask;Lext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
  #111 = Methodref          #112.#113     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #112 = Class              #114          // ext/mods/commons/pool/ThreadPool
  #113 = NameAndType        #115:#116     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #114 = Utf8               ext/mods/commons/pool/ThreadPool
  #115 = Utf8               schedule
  #116 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #117 = InterfaceMethodref #118.#119     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #118 = Class              #120          // java/util/Map
  #119 = NameAndType        #121:#122     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #120 = Utf8               java/util/Map
  #121 = Utf8               put
  #122 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #123 = Methodref          #72.#124      // ext/mods/battlerboss/holder/EventHolder.getId:()I
  #124 = NameAndType        #125:#126     // getId:()I
  #125 = Utf8               getId
  #126 = Utf8               ()I
  #127 = InvokeDynamic      #2:#128       // #2:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #128 = NameAndType        #48:#129      // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #129 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #130 = Methodref          #83.#131      // ext/mods/battlerboss/holder/BattleBossConfigHolder.getDays:()Ljava/util/List;
  #131 = NameAndType        #132:#133     // getDays:()Ljava/util/List;
  #132 = Utf8               getDays
  #133 = Utf8               ()Ljava/util/List;
  #134 = Methodref          #83.#135      // ext/mods/battlerboss/holder/BattleBossConfigHolder.getTimes:()Ljava/util/List;
  #135 = NameAndType        #136:#133     // getTimes:()Ljava/util/List;
  #136 = Utf8               getTimes
  #137 = Methodref          #88.#138      // java/time/LocalDateTime.plusDays:(J)Ljava/time/LocalDateTime;
  #138 = NameAndType        #139:#140     // plusDays:(J)Ljava/time/LocalDateTime;
  #139 = Utf8               plusDays
  #140 = Utf8               (J)Ljava/time/LocalDateTime;
  #141 = Methodref          #88.#142      // java/time/LocalDateTime.getDayOfWeek:()Ljava/time/DayOfWeek;
  #142 = NameAndType        #143:#144     // getDayOfWeek:()Ljava/time/DayOfWeek;
  #143 = Utf8               getDayOfWeek
  #144 = Utf8               ()Ljava/time/DayOfWeek;
  #145 = Methodref          #146.#147     // java/time/DayOfWeek.getValue:()I
  #146 = Class              #148          // java/time/DayOfWeek
  #147 = NameAndType        #149:#126     // getValue:()I
  #148 = Utf8               java/time/DayOfWeek
  #149 = Utf8               getValue
  #150 = Methodref          #151.#152     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #151 = Class              #153          // java/lang/Integer
  #152 = NameAndType        #154:#155     // valueOf:(I)Ljava/lang/Integer;
  #153 = Utf8               java/lang/Integer
  #154 = Utf8               valueOf
  #155 = Utf8               (I)Ljava/lang/Integer;
  #156 = InterfaceMethodref #38.#157      // java/util/List.contains:(Ljava/lang/Object;)Z
  #157 = NameAndType        #158:#159     // contains:(Ljava/lang/Object;)Z
  #158 = Utf8               contains
  #159 = Utf8               (Ljava/lang/Object;)Z
  #160 = Class              #161          // java/lang/String
  #161 = Utf8               java/lang/String
  #162 = Methodref          #163.#164     // java/time/LocalTime.parse:(Ljava/lang/CharSequence;)Ljava/time/LocalTime;
  #163 = Class              #165          // java/time/LocalTime
  #164 = NameAndType        #166:#167     // parse:(Ljava/lang/CharSequence;)Ljava/time/LocalTime;
  #165 = Utf8               java/time/LocalTime
  #166 = Utf8               parse
  #167 = Utf8               (Ljava/lang/CharSequence;)Ljava/time/LocalTime;
  #168 = Methodref          #163.#169     // java/time/LocalTime.getHour:()I
  #169 = NameAndType        #170:#126     // getHour:()I
  #170 = Utf8               getHour
  #171 = Methodref          #88.#172      // java/time/LocalDateTime.withHour:(I)Ljava/time/LocalDateTime;
  #172 = NameAndType        #173:#174     // withHour:(I)Ljava/time/LocalDateTime;
  #173 = Utf8               withHour
  #174 = Utf8               (I)Ljava/time/LocalDateTime;
  #175 = Methodref          #163.#176     // java/time/LocalTime.getMinute:()I
  #176 = NameAndType        #177:#126     // getMinute:()I
  #177 = Utf8               getMinute
  #178 = Methodref          #88.#179      // java/time/LocalDateTime.withMinute:(I)Ljava/time/LocalDateTime;
  #179 = NameAndType        #180:#174     // withMinute:(I)Ljava/time/LocalDateTime;
  #180 = Utf8               withMinute
  #181 = Methodref          #88.#182      // java/time/LocalDateTime.withSecond:(I)Ljava/time/LocalDateTime;
  #182 = NameAndType        #183:#174     // withSecond:(I)Ljava/time/LocalDateTime;
  #183 = Utf8               withSecond
  #184 = Methodref          #88.#185      // java/time/LocalDateTime.withNano:(I)Ljava/time/LocalDateTime;
  #185 = NameAndType        #186:#174     // withNano:(I)Ljava/time/LocalDateTime;
  #186 = Utf8               withNano
  #187 = Methodref          #88.#188      // java/time/LocalDateTime.isAfter:(Ljava/time/chrono/ChronoLocalDateTime;)Z
  #188 = NameAndType        #189:#190     // isAfter:(Ljava/time/chrono/ChronoLocalDateTime;)Z
  #189 = Utf8               isAfter
  #190 = Utf8               (Ljava/time/chrono/ChronoLocalDateTime;)Z
  #191 = Methodref          #88.#192      // java/time/LocalDateTime.isBefore:(Ljava/time/chrono/ChronoLocalDateTime;)Z
  #192 = NameAndType        #193:#190     // isBefore:(Ljava/time/chrono/ChronoLocalDateTime;)Z
  #193 = Utf8               isBefore
  #194 = Methodref          #195.#196     // ext/mods/battlerboss/register/BattleBossOpenRegister.getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #195 = Class              #197          // ext/mods/battlerboss/register/BattleBossOpenRegister
  #196 = NameAndType        #20:#198      // getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #197 = Utf8               ext/mods/battlerboss/register/BattleBossOpenRegister
  #198 = Utf8               ()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #199 = Methodref          #195.#200     // ext/mods/battlerboss/register/BattleBossOpenRegister.open:(Lext/mods/battlerboss/holder/EventHolder;)V
  #200 = NameAndType        #201:#77      // open:(Lext/mods/battlerboss/holder/EventHolder;)V
  #201 = Utf8               open
  #202 = InterfaceMethodref #118.#203     // java/util/Map.values:()Ljava/util/Collection;
  #203 = NameAndType        #204:#37      // values:()Ljava/util/Collection;
  #204 = Utf8               values
  #205 = InvokeDynamic      #3:#206       // #3:accept:()Ljava/util/function/Consumer;
  #206 = NameAndType        #207:#208     // accept:()Ljava/util/function/Consumer;
  #207 = Utf8               accept
  #208 = Utf8               ()Ljava/util/function/Consumer;
  #209 = InterfaceMethodref #210.#211     // java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
  #210 = Class              #212          // java/util/Collection
  #211 = NameAndType        #213:#214     // forEach:(Ljava/util/function/Consumer;)V
  #212 = Utf8               java/util/Collection
  #213 = Utf8               forEach
  #214 = Utf8               (Ljava/util/function/Consumer;)V
  #215 = InterfaceMethodref #118.#216     // java/util/Map.clear:()V
  #216 = NameAndType        #217:#6       // clear:()V
  #217 = Utf8               clear
  #218 = Methodref          #11.#219      // ext/mods/battlerboss/tasks/BattleBossCountDownTask.start:()V
  #219 = NameAndType        #220:#6       // start:()V
  #220 = Utf8               start
  #221 = Fieldref           #222.#223     // ext/mods/battlerboss/tasks/BattleBossCountDownTask$SingletonHolder.INSTANCE:Lext/mods/battlerboss/tasks/BattleBossCountDownTask;
  #222 = Class              #224          // ext/mods/battlerboss/tasks/BattleBossCountDownTask$SingletonHolder
  #223 = NameAndType        #225:#226     // INSTANCE:Lext/mods/battlerboss/tasks/BattleBossCountDownTask;
  #224 = Utf8               ext/mods/battlerboss/tasks/BattleBossCountDownTask$SingletonHolder
  #225 = Utf8               INSTANCE
  #226 = Utf8               Lext/mods/battlerboss/tasks/BattleBossCountDownTask;
  #227 = InterfaceMethodref #228.#229     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #228 = Class              #230          // java/util/concurrent/ScheduledFuture
  #229 = NameAndType        #231:#232     // cancel:(Z)Z
  #230 = Utf8               java/util/concurrent/ScheduledFuture
  #231 = Utf8               cancel
  #232 = Utf8               (Z)Z
  #233 = Methodref          #11.#234      // ext/mods/battlerboss/tasks/BattleBossCountDownTask.startEvent:(Lext/mods/battlerboss/holder/EventHolder;)V
  #234 = NameAndType        #235:#77      // startEvent:(Lext/mods/battlerboss/holder/EventHolder;)V
  #235 = Utf8               startEvent
  #236 = InvokeDynamic      #4:#128       // #4:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #237 = Methodref          #238.#239     // java/lang/Class.getName:()Ljava/lang/String;
  #238 = Class              #240          // java/lang/Class
  #239 = NameAndType        #241:#45      // getName:()Ljava/lang/String;
  #240 = Utf8               java/lang/Class
  #241 = Utf8               getName
  #242 = Methodref          #29.#243      // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #243 = NameAndType        #244:#245     // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #244 = Utf8               getLogger
  #245 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
  #246 = Utf8               Signature
  #247 = Utf8               Ljava/util/Map<Lext/mods/battlerboss/holder/EventHolder;Ljava/util/concurrent/ScheduledFuture<*>;>;
  #248 = Utf8               Code
  #249 = Utf8               LineNumberTable
  #250 = Utf8               LocalVariableTable
  #251 = Utf8               this
  #252 = Utf8               tempList
  #253 = Utf8               Ljava/util/List;
  #254 = Utf8               result
  #255 = Utf8               Ljava/lang/Object;
  #256 = Utf8               e
  #257 = Utf8               Ljava/lang/Exception;
  #258 = Utf8               event
  #259 = Utf8               Lext/mods/battlerboss/holder/EventHolder;
  #260 = Utf8               battleBossDataInstance
  #261 = Utf8               events
  #262 = Utf8               LocalVariableTypeTable
  #263 = Utf8               Ljava/util/List<Lext/mods/battlerboss/holder/EventHolder;>;
  #264 = Utf8               StackMapTable
  #265 = Utf8               Ljava/time/LocalDateTime;
  #266 = Utf8               nextTime
  #267 = Utf8               delay
  #268 = Utf8               J
  #269 = Utf8               future
  #270 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #271 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #272 = Utf8               eventTime
  #273 = Utf8               Ljava/time/LocalTime;
  #274 = Utf8               candidate
  #275 = Utf8               timeStr
  #276 = Utf8               Ljava/lang/String;
  #277 = Utf8               day
  #278 = Utf8               dayOfWeek
  #279 = Utf8               I
  #280 = Utf8               i
  #281 = Utf8               from
  #282 = Utf8               days
  #283 = Utf8               times
  #284 = Utf8               nextEvent
  #285 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #286 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #287 = Utf8               reset
  #288 = Utf8               ()Lext/mods/battlerboss/tasks/BattleBossCountDownTask;
  #289 = Utf8               lambda$reset$0
  #290 = Utf8               (Ljava/util/concurrent/ScheduledFuture;)V
  #291 = Utf8               f
  #292 = Utf8               lambda$scheduleNextEvent$0
  #293 = Class              #294          // java/lang/Throwable
  #294 = Utf8               java/lang/Throwable
  #295 = Utf8               <clinit>
  #296 = Utf8               SourceFile
  #297 = Utf8               BattleBossCountDownTask.java
  #298 = Utf8               NestMembers
  #299 = Utf8               BootstrapMethods
  #300 = String             #301          // Erro ao acessar dados do BattleBoss: \u0001
  #301 = Utf8               Erro ao acessar dados do BattleBoss: \u0001
  #302 = MethodType         #6            //  ()V
  #303 = MethodHandle       5:#304        // REF_invokeVirtual ext/mods/battlerboss/tasks/BattleBossCountDownTask.lambda$scheduleNextEvent$0:(Lext/mods/battlerboss/holder/EventHolder;)V
  #304 = Methodref          #11.#305      // ext/mods/battlerboss/tasks/BattleBossCountDownTask.lambda$scheduleNextEvent$0:(Lext/mods/battlerboss/holder/EventHolder;)V
  #305 = NameAndType        #292:#77      // lambda$scheduleNextEvent$0:(Lext/mods/battlerboss/holder/EventHolder;)V
  #306 = String             #307          // Erro ao agendar evento \u0001: \u0001
  #307 = Utf8               Erro ao agendar evento \u0001: \u0001
  #308 = MethodType         #309          //  (Ljava/lang/Object;)V
  #309 = Utf8               (Ljava/lang/Object;)V
  #310 = MethodHandle       6:#311        // REF_invokeStatic ext/mods/battlerboss/tasks/BattleBossCountDownTask.lambda$reset$0:(Ljava/util/concurrent/ScheduledFuture;)V
  #311 = Methodref          #11.#312      // ext/mods/battlerboss/tasks/BattleBossCountDownTask.lambda$reset$0:(Ljava/util/concurrent/ScheduledFuture;)V
  #312 = NameAndType        #289:#290     // lambda$reset$0:(Ljava/util/concurrent/ScheduledFuture;)V
  #313 = MethodType         #290          //  (Ljava/util/concurrent/ScheduledFuture;)V
  #314 = String             #315          // Erro ao iniciar evento \u0001: \u0001
  #315 = Utf8               Erro ao iniciar evento \u0001: \u0001
  #316 = MethodHandle       6:#317        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #317 = Methodref          #318.#319     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #318 = Class              #320          // java/lang/invoke/StringConcatFactory
  #319 = NameAndType        #48:#321      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #320 = Utf8               java/lang/invoke/StringConcatFactory
  #321 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #322 = MethodHandle       6:#323        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #323 = Methodref          #324.#325     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #324 = Class              #326          // java/lang/invoke/LambdaMetafactory
  #325 = NameAndType        #327:#328     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #326 = Utf8               java/lang/invoke/LambdaMetafactory
  #327 = Utf8               metafactory
  #328 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #329 = Utf8               InnerClasses
  #330 = Utf8               SingletonHolder
  #331 = Class              #332          // java/lang/invoke/MethodHandles$Lookup
  #332 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #333 = Class              #334          // java/lang/invoke/MethodHandles
  #334 = Utf8               java/lang/invoke/MethodHandles
  #335 = Utf8               Lookup
{
  public static java.util.logging.Logger LOGGER;
    descriptor: Ljava/util/logging/Logger;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public ext.mods.battlerboss.tasks.BattleBossCountDownTask();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field scheduledEvents:Ljava/util/Map;
        15: return
      LineNumberTable:
        line 34: 0
        line 38: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/battlerboss/tasks/BattleBossCountDownTask;

  public void start();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=1
         0: invokestatic  #16                 // Method ext/mods/Crypta/BattleBossData.getInstance:()Lext/mods/Crypta/BattleBossData;
         3: astore_1
         4: aload_1
         5: ifnonnull     17
         8: getstatic     #22                 // Field LOGGER:Ljava/util/logging/Logger;
        11: ldc           #26                 // String BattleBossData não está disponível.
        13: invokevirtual #28                 // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
        16: return
        17: aconst_null
        18: astore_2
        19: invokestatic  #16                 // Method ext/mods/Crypta/BattleBossData.getInstance:()Lext/mods/Crypta/BattleBossData;
        22: invokevirtual #34                 // Method ext/mods/Crypta/BattleBossData.getEvents:()Ljava/util/Collection;
        25: astore_3
        26: aload_3
        27: instanceof    #38                 // class java/util/List
        30: ifeq          42
        33: aload_3
        34: checkcast     #38                 // class java/util/List
        37: astore        4
        39: aload         4
        41: astore_2
        42: goto          66
        45: astore_3
        46: getstatic     #22                 // Field LOGGER:Ljava/util/logging/Logger;
        49: aload_3
        50: invokevirtual #42                 // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        53: invokedynamic #46,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        58: invokevirtual #28                 // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
        61: aload_3
        62: invokevirtual #50                 // Method java/lang/Exception.printStackTrace:()V
        65: return
        66: aload_2
        67: ifnonnull     79
        70: getstatic     #22                 // Field LOGGER:Ljava/util/logging/Logger;
        73: ldc           #53                 // String Nenhum evento encontrado.
        75: invokevirtual #55                 // Method java/util/logging/Logger.warning:(Ljava/lang/String;)V
        78: return
        79: aload_2
        80: invokeinterface #58,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        85: astore_3
        86: aload_3
        87: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        92: ifeq          115
        95: aload_3
        96: invokeinterface #68,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       101: checkcast     #72                 // class ext/mods/battlerboss/holder/EventHolder
       104: astore        4
       106: aload_0
       107: aload         4
       109: invokevirtual #74                 // Method scheduleNextEvent:(Lext/mods/battlerboss/holder/EventHolder;)V
       112: goto          86
       115: return
      Exception table:
         from    to  target type
            19    42    45   Class java/lang/Exception
      LineNumberTable:
        line 42: 0
        line 43: 4
        line 45: 8
        line 46: 16
        line 49: 17
        line 52: 19
        line 53: 26
        line 56: 33
        line 57: 39
        line 65: 42
        line 60: 45
        line 62: 46
        line 63: 61
        line 64: 65
        line 67: 66
        line 69: 70
        line 70: 78
        line 73: 79
        line 75: 106
        line 76: 112
        line 77: 115
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39       3     4 tempList   Ljava/util/List;
           26      16     3 result   Ljava/lang/Object;
           46      20     3     e   Ljava/lang/Exception;
          106       6     4 event   Lext/mods/battlerboss/holder/EventHolder;
            0     116     0  this   Lext/mods/battlerboss/tasks/BattleBossCountDownTask;
            4     112     1 battleBossDataInstance   Ljava/lang/Object;
           19      97     2 events   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           39       3     4 tempList   Ljava/util/List<Lext/mods/battlerboss/holder/EventHolder;>;
           19      97     2 events   Ljava/util/List<Lext/mods/battlerboss/holder/EventHolder;>;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/lang/Object ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/util/List ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 20 /* same */
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28

  public void reset();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field scheduledEvents:Ljava/util/Map;
         4: invokeinterface #202,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokedynamic #205,  0            // InvokeDynamic #3:accept:()Ljava/util/function/Consumer;
        14: invokeinterface #209,  2          // InterfaceMethod java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
        19: aload_0
        20: getfield      #10                 // Field scheduledEvents:Ljava/util/Map;
        23: invokeinterface #215,  1          // InterfaceMethod java/util/Map.clear:()V
        28: aload_0
        29: invokevirtual #218                // Method start:()V
        32: return
      LineNumberTable:
        line 153: 0
        line 154: 19
        line 155: 28
        line 156: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/battlerboss/tasks/BattleBossCountDownTask;

  public static ext.mods.battlerboss.tasks.BattleBossCountDownTask getInstance();
    descriptor: ()Lext/mods/battlerboss/tasks/BattleBossCountDownTask;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #221                // Field ext/mods/battlerboss/tasks/BattleBossCountDownTask$SingletonHolder.INSTANCE:Lext/mods/battlerboss/tasks/BattleBossCountDownTask;
         3: areturn
      LineNumberTable:
        line 160: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #11                 // class ext/mods/battlerboss/tasks/BattleBossCountDownTask
         2: invokevirtual #237                // Method java/lang/Class.getName:()Ljava/lang/String;
         5: invokestatic  #242                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         8: putstatic     #22                 // Field LOGGER:Ljava/util/logging/Logger;
        11: return
      LineNumberTable:
        line 36: 0
}
SourceFile: "BattleBossCountDownTask.java"
NestMembers:
  ext/mods/battlerboss/tasks/BattleBossCountDownTask$SingletonHolder
BootstrapMethods:
  0: #316 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #300 Erro ao acessar dados do BattleBoss: \u0001
  1: #322 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 ()V
      #303 REF_invokeVirtual ext/mods/battlerboss/tasks/BattleBossCountDownTask.lambda$scheduleNextEvent$0:(Lext/mods/battlerboss/holder/EventHolder;)V
      #302 ()V
  2: #316 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #306 Erro ao agendar evento \u0001: \u0001
  3: #322 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #308 (Ljava/lang/Object;)V
      #310 REF_invokeStatic ext/mods/battlerboss/tasks/BattleBossCountDownTask.lambda$reset$0:(Ljava/util/concurrent/ScheduledFuture;)V
      #313 (Ljava/util/concurrent/ScheduledFuture;)V
  4: #316 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #314 Erro ao iniciar evento \u0001: \u0001
InnerClasses:
  public static final #335= #331 of #333; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
