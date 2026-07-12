// Bytecode for: ext.mods.gameserver.data.xml.ScriptData
// File: ext\mods\gameserver\data\xml\ScriptData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/ScriptData.class
  Last modified 9 de jul de 2026; size 7793 bytes
  MD5 checksum e675f2f28f7a6d0e3d5d8916f3b393db
  Compiled from "ScriptData.java"
public final class ext.mods.gameserver.data.xml.ScriptData implements ext.mods.commons.data.xml.IXmlReader,java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/ScriptData
  super_class: #2                         // java/lang/Object
  interfaces: 2, fields: 4, methods: 14, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/ScriptData._quests:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/ScriptData
   #12 = NameAndType        #14:#15       // _quests:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/data/xml/ScriptData
   #14 = Utf8               _quests
   #15 = Utf8               Ljava/util/List;
   #16 = Class              #17           // java/util/LinkedList
   #17 = Utf8               java/util/LinkedList
   #18 = Methodref          #16.#3        // java/util/LinkedList."<init>":()V
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/data/xml/ScriptData._scheduled:Ljava/util/List;
   #20 = NameAndType        #21:#15       // _scheduled:Ljava/util/List;
   #21 = Utf8               _scheduled
   #22 = Methodref          #11.#23       // ext/mods/gameserver/data/xml/ScriptData.load:()V
   #23 = NameAndType        #24:#6        // load:()V
   #24 = Utf8               load
   #25 = String             #26           // xml/scripts.xml
   #26 = Utf8               xml/scripts.xml
   #27 = Methodref          #11.#28       // ext/mods/gameserver/data/xml/ScriptData.parseDataFile:(Ljava/lang/String;)V
   #28 = NameAndType        #29:#30       // parseDataFile:(Ljava/lang/String;)V
   #29 = Utf8               parseDataFile
   #30 = Utf8               (Ljava/lang/String;)V
   #31 = Fieldref           #11.#32       // ext/mods/gameserver/data/xml/ScriptData.LOGGER:Lext/mods/commons/logging/CLogger;
   #32 = NameAndType        #33:#34       // LOGGER:Lext/mods/commons/logging/CLogger;
   #33 = Utf8               LOGGER
   #34 = Utf8               Lext/mods/commons/logging/CLogger;
   #35 = String             #36           // Loaded {} regular scripts and {} scheduled scripts.
   #36 = Utf8               Loaded {} regular scripts and {} scheduled scripts.
   #37 = InterfaceMethodref #38.#39       // java/util/List.size:()I
   #38 = Class              #40           // java/util/List
   #39 = NameAndType        #41:#42       // size:()I
   #40 = Utf8               java/util/List
   #41 = Utf8               size
   #42 = Utf8               ()I
   #43 = Methodref          #44.#45       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #44 = Class              #46           // java/lang/Integer
   #45 = NameAndType        #47:#48       // valueOf:(I)Ljava/lang/Integer;
   #46 = Utf8               java/lang/Integer
   #47 = Utf8               valueOf
   #48 = Utf8               (I)Ljava/lang/Integer;
   #49 = Methodref          #50.#51       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #50 = Class              #52           // ext/mods/commons/logging/CLogger
   #51 = NameAndType        #53:#54       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #52 = Utf8               ext/mods/commons/logging/CLogger
   #53 = Utf8               info
   #54 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #55 = Long               300000l
   #57 = Methodref          #58.#59       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #58 = Class              #60           // ext/mods/commons/pool/ThreadPool
   #59 = NameAndType        #61:#62       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #60 = Utf8               ext/mods/commons/pool/ThreadPool
   #61 = Utf8               scheduleAtFixedRate
   #62 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #63 = Fieldref           #11.#64       // ext/mods/gameserver/data/xml/ScriptData._scheduledTask:Ljava/util/concurrent/ScheduledFuture;
   #64 = NameAndType        #65:#66       // _scheduledTask:Ljava/util/concurrent/ScheduledFuture;
   #65 = Utf8               _scheduledTask
   #66 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #67 = String             #68           // list
   #68 = Utf8               list
   #69 = InvokeDynamic      #0:#70        // #0:accept:(Lext/mods/gameserver/data/xml/ScriptData;)Ljava/util/function/Consumer;
   #70 = NameAndType        #71:#72       // accept:(Lext/mods/gameserver/data/xml/ScriptData;)Ljava/util/function/Consumer;
   #71 = Utf8               accept
   #72 = Utf8               (Lext/mods/gameserver/data/xml/ScriptData;)Ljava/util/function/Consumer;
   #73 = Methodref          #11.#74       // ext/mods/gameserver/data/xml/ScriptData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #74 = NameAndType        #75:#76       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #75 = Utf8               forEach
   #76 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #77 = Methodref          #78.#79       // java/lang/System.currentTimeMillis:()J
   #78 = Class              #80           // java/lang/System
   #79 = NameAndType        #81:#82       // currentTimeMillis:()J
   #80 = Utf8               java/lang/System
   #81 = Utf8               currentTimeMillis
   #82 = Utf8               ()J
   #83 = InterfaceMethodref #38.#84       // java/util/List.iterator:()Ljava/util/Iterator;
   #84 = NameAndType        #85:#86       // iterator:()Ljava/util/Iterator;
   #85 = Utf8               iterator
   #86 = Utf8               ()Ljava/util/Iterator;
   #87 = InterfaceMethodref #88.#89       // java/util/Iterator.hasNext:()Z
   #88 = Class              #90           // java/util/Iterator
   #89 = NameAndType        #91:#92       // hasNext:()Z
   #90 = Utf8               java/util/Iterator
   #91 = Utf8               hasNext
   #92 = Utf8               ()Z
   #93 = InterfaceMethodref #88.#94       // java/util/Iterator.next:()Ljava/lang/Object;
   #94 = NameAndType        #95:#96       // next:()Ljava/lang/Object;
   #95 = Utf8               next
   #96 = Utf8               ()Ljava/lang/Object;
   #97 = Class              #98           // ext/mods/gameserver/scripting/ScheduledQuest
   #98 = Utf8               ext/mods/gameserver/scripting/ScheduledQuest
   #99 = Methodref          #97.#100      // ext/mods/gameserver/scripting/ScheduledQuest.getTimeNext:()J
  #100 = NameAndType        #101:#82      // getTimeNext:()J
  #101 = Utf8               getTimeNext
  #102 = Class              #103          // ext/mods/gameserver/data/xml/ScriptData$Scheduler
  #103 = Utf8               ext/mods/gameserver/data/xml/ScriptData$Scheduler
  #104 = Methodref          #102.#105     // ext/mods/gameserver/data/xml/ScriptData$Scheduler."<init>":(Lext/mods/gameserver/data/xml/ScriptData;Lext/mods/gameserver/scripting/ScheduledQuest;)V
  #105 = NameAndType        #5:#106       // "<init>":(Lext/mods/gameserver/data/xml/ScriptData;Lext/mods/gameserver/scripting/ScheduledQuest;)V
  #106 = Utf8               (Lext/mods/gameserver/data/xml/ScriptData;Lext/mods/gameserver/scripting/ScheduledQuest;)V
  #107 = Methodref          #58.#108      // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #108 = NameAndType        #109:#110     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #109 = Utf8               schedule
  #110 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #111 = Methodref          #97.#112      // ext/mods/gameserver/scripting/ScheduledQuest.setTask:(Ljava/util/concurrent/ScheduledFuture;)V
  #112 = NameAndType        #113:#114     // setTask:(Ljava/util/concurrent/ScheduledFuture;)V
  #113 = Utf8               setTask
  #114 = Utf8               (Ljava/util/concurrent/ScheduledFuture;)V
  #115 = InterfaceMethodref #116.#117     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #116 = Class              #118          // java/util/concurrent/ScheduledFuture
  #117 = NameAndType        #119:#120     // cancel:(Z)Z
  #118 = Utf8               java/util/concurrent/ScheduledFuture
  #119 = Utf8               cancel
  #120 = Utf8               (Z)Z
  #121 = InterfaceMethodref #38.#122      // java/util/List.clear:()V
  #122 = NameAndType        #123:#6       // clear:()V
  #123 = Utf8               clear
  #124 = Methodref          #97.#125      // ext/mods/gameserver/scripting/ScheduledQuest.cleanTask:()V
  #125 = NameAndType        #126:#6       // cleanTask:()V
  #126 = Utf8               cleanTask
  #127 = Methodref          #97.#128      // ext/mods/gameserver/scripting/ScheduledQuest.stop:()V
  #128 = NameAndType        #129:#6       // stop:()V
  #129 = Utf8               stop
  #130 = InterfaceMethodref #38.#131      // java/util/List.stream:()Ljava/util/stream/Stream;
  #131 = NameAndType        #132:#133     // stream:()Ljava/util/stream/Stream;
  #132 = Utf8               stream
  #133 = Utf8               ()Ljava/util/stream/Stream;
  #134 = InvokeDynamic      #1:#135       // #1:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #135 = NameAndType        #136:#137     // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #136 = Utf8               test
  #137 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #138 = InterfaceMethodref #139.#140     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #139 = Class              #141          // java/util/stream/Stream
  #140 = NameAndType        #142:#143     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #141 = Utf8               java/util/stream/Stream
  #142 = Utf8               filter
  #143 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #144 = InterfaceMethodref #139.#145     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #145 = NameAndType        #146:#147     // findFirst:()Ljava/util/Optional;
  #146 = Utf8               findFirst
  #147 = Utf8               ()Ljava/util/Optional;
  #148 = Methodref          #149.#150     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #149 = Class              #151          // java/util/Optional
  #150 = NameAndType        #152:#153     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #151 = Utf8               java/util/Optional
  #152 = Utf8               orElse
  #153 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #154 = Class              #155          // ext/mods/gameserver/scripting/Quest
  #155 = Utf8               ext/mods/gameserver/scripting/Quest
  #156 = InvokeDynamic      #2:#157       // #2:test:(I)Ljava/util/function/Predicate;
  #157 = NameAndType        #136:#158     // test:(I)Ljava/util/function/Predicate;
  #158 = Utf8               (I)Ljava/util/function/Predicate;
  #159 = Fieldref           #160.#161     // ext/mods/gameserver/data/xml/ScriptData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/ScriptData;
  #160 = Class              #162          // ext/mods/gameserver/data/xml/ScriptData$SingletonHolder
  #161 = NameAndType        #163:#164     // INSTANCE:Lext/mods/gameserver/data/xml/ScriptData;
  #162 = Utf8               ext/mods/gameserver/data/xml/ScriptData$SingletonHolder
  #163 = Utf8               INSTANCE
  #164 = Utf8               Lext/mods/gameserver/data/xml/ScriptData;
  #165 = Methodref          #154.#166     // ext/mods/gameserver/scripting/Quest.getQuestId:()I
  #166 = NameAndType        #167:#42      // getQuestId:()I
  #167 = Utf8               getQuestId
  #168 = Methodref          #154.#169     // ext/mods/gameserver/scripting/Quest.getName:()Ljava/lang/String;
  #169 = NameAndType        #170:#171     // getName:()Ljava/lang/String;
  #170 = Utf8               getName
  #171 = Utf8               ()Ljava/lang/String;
  #172 = Methodref          #173.#174     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #173 = Class              #175          // java/lang/String
  #174 = NameAndType        #176:#177     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #175 = Utf8               java/lang/String
  #176 = Utf8               equalsIgnoreCase
  #177 = Utf8               (Ljava/lang/String;)Z
  #178 = String             #179          // script
  #179 = Utf8               script
  #180 = InvokeDynamic      #3:#70        // #3:accept:(Lext/mods/gameserver/data/xml/ScriptData;)Ljava/util/function/Consumer;
  #181 = InterfaceMethodref #182.#183     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #182 = Class              #184          // org/w3c/dom/Node
  #183 = NameAndType        #185:#186     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #184 = Utf8               org/w3c/dom/Node
  #185 = Utf8               getAttributes
  #186 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #187 = String             #188          // path
  #188 = Utf8               path
  #189 = Methodref          #11.#190      // ext/mods/gameserver/data/xml/ScriptData.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #190 = NameAndType        #191:#192     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #191 = Utf8               parseString
  #192 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #193 = String             #194          // One of the script path isn\'t defined.
  #194 = Utf8               One of the script path isn\'t defined.
  #195 = Methodref          #50.#196      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #196 = NameAndType        #197:#198     // warn:(Ljava/lang/Object;)V
  #197 = Utf8               warn
  #198 = Utf8               (Ljava/lang/Object;)V
  #199 = InvokeDynamic      #4:#200       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #200 = NameAndType        #201:#202     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #201 = Utf8               makeConcatWithConstants
  #202 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #203 = Methodref          #204.#205     // java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
  #204 = Class              #206          // java/lang/Class
  #205 = NameAndType        #207:#208     // forName:(Ljava/lang/String;)Ljava/lang/Class;
  #206 = Utf8               java/lang/Class
  #207 = Utf8               forName
  #208 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;
  #209 = Methodref          #204.#210     // java/lang/Class.getDeclaredConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #210 = NameAndType        #211:#212     // getDeclaredConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #211 = Utf8               getDeclaredConstructor
  #212 = Utf8               ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #213 = Methodref          #214.#215     // java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #214 = Class              #216          // java/lang/reflect/Constructor
  #215 = NameAndType        #217:#218     // newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #216 = Utf8               java/lang/reflect/Constructor
  #217 = Utf8               newInstance
  #218 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
  #219 = InterfaceMethodref #38.#220      // java/util/List.add:(Ljava/lang/Object;)Z
  #220 = NameAndType        #221:#222     // add:(Ljava/lang/Object;)Z
  #221 = Utf8               add
  #222 = Utf8               (Ljava/lang/Object;)Z
  #223 = Class              #224          // ext/mods/gameserver/scripting/script/ai/individual/DefaultNpc
  #224 = Utf8               ext/mods/gameserver/scripting/script/ai/individual/DefaultNpc
  #225 = Methodref          #154.#226     // ext/mods/gameserver/scripting/Quest.feedEventHandlers:()V
  #226 = NameAndType        #227:#6       // feedEventHandlers:()V
  #227 = Utf8               feedEventHandlers
  #228 = String             #109          // schedule
  #229 = String             #230          // start
  #230 = Utf8               start
  #231 = String             #232          // Missing \'start\' parameter for scheduled script \'{}\'.
  #232 = Utf8               Missing \'start\' parameter for scheduled script \'{}\'.
  #233 = Methodref          #50.#234      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #234 = NameAndType        #197:#54      // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #235 = String             #236          // end
  #236 = Utf8               end
  #237 = Methodref          #97.#238      // ext/mods/gameserver/scripting/ScheduledQuest.setSchedule:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
  #238 = NameAndType        #239:#240     // setSchedule:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
  #239 = Utf8               setSchedule
  #240 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
  #241 = Class              #242          // java/lang/Exception
  #242 = Utf8               java/lang/Exception
  #243 = String             #244          // Script \'{}\' is missing.
  #244 = Utf8               Script \'{}\' is missing.
  #245 = Methodref          #50.#246      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #246 = NameAndType        #247:#248     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #247 = Utf8               error
  #248 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #249 = Class              #250          // ext/mods/commons/data/xml/IXmlReader
  #250 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #251 = Class              #252          // java/lang/Runnable
  #252 = Utf8               java/lang/Runnable
  #253 = Utf8               PERIOD
  #254 = Utf8               I
  #255 = Utf8               ConstantValue
  #256 = Integer            300000
  #257 = Utf8               Signature
  #258 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #259 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/ScheduledQuest;>;
  #260 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #261 = Utf8               Code
  #262 = Utf8               LineNumberTable
  #263 = Utf8               LocalVariableTable
  #264 = Utf8               this
  #265 = Utf8               parseDocument
  #266 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #267 = Utf8               doc
  #268 = Utf8               Lorg/w3c/dom/Document;
  #269 = Utf8               p
  #270 = Utf8               Ljava/nio/file/Path;
  #271 = Utf8               run
  #272 = Utf8               eta
  #273 = Utf8               J
  #274 = Utf8               Lext/mods/gameserver/scripting/ScheduledQuest;
  #275 = Utf8               StackMapTable
  #276 = Utf8               reload
  #277 = Utf8               stopAllScripts
  #278 = Utf8               sq
  #279 = Utf8               getQuest
  #280 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
  #281 = Utf8               questName
  #282 = Utf8               Ljava/lang/String;
  #283 = Utf8               (I)Lext/mods/gameserver/scripting/Quest;
  #284 = Utf8               questId
  #285 = Utf8               getQuests
  #286 = Utf8               ()Ljava/util/List;
  #287 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #288 = Utf8               getInstance
  #289 = Utf8               ()Lext/mods/gameserver/data/xml/ScriptData;
  #290 = Utf8               lambda$getQuest$1
  #291 = Utf8               (ILext/mods/gameserver/scripting/Quest;)Z
  #292 = Utf8               q
  #293 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #294 = Utf8               lambda$getQuest$0
  #295 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/scripting/Quest;)Z
  #296 = Utf8               lambda$parseDocument$0
  #297 = Utf8               (Lorg/w3c/dom/Node;)V
  #298 = Utf8               listNode
  #299 = Utf8               Lorg/w3c/dom/Node;
  #300 = Utf8               lambda$parseDocument$1
  #301 = Utf8               type
  #302 = Utf8               instance
  #303 = Utf8               e
  #304 = Utf8               Ljava/lang/Exception;
  #305 = Utf8               scriptNode
  #306 = Utf8               params
  #307 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #308 = Class              #309          // org/w3c/dom/NamedNodeMap
  #309 = Utf8               org/w3c/dom/NamedNodeMap
  #310 = Utf8               SourceFile
  #311 = Utf8               ScriptData.java
  #312 = Utf8               NestMembers
  #313 = Utf8               BootstrapMethods
  #314 = MethodType         #198          //  (Ljava/lang/Object;)V
  #315 = MethodHandle       5:#316        // REF_invokeVirtual ext/mods/gameserver/data/xml/ScriptData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #316 = Methodref          #11.#317      // ext/mods/gameserver/data/xml/ScriptData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #317 = NameAndType        #296:#297     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #318 = MethodType         #297          //  (Lorg/w3c/dom/Node;)V
  #319 = MethodType         #222          //  (Ljava/lang/Object;)Z
  #320 = MethodHandle       6:#321        // REF_invokeStatic ext/mods/gameserver/data/xml/ScriptData.lambda$getQuest$0:(Ljava/lang/String;Lext/mods/gameserver/scripting/Quest;)Z
  #321 = Methodref          #11.#322      // ext/mods/gameserver/data/xml/ScriptData.lambda$getQuest$0:(Ljava/lang/String;Lext/mods/gameserver/scripting/Quest;)Z
  #322 = NameAndType        #294:#295     // lambda$getQuest$0:(Ljava/lang/String;Lext/mods/gameserver/scripting/Quest;)Z
  #323 = MethodType         #324          //  (Lext/mods/gameserver/scripting/Quest;)Z
  #324 = Utf8               (Lext/mods/gameserver/scripting/Quest;)Z
  #325 = MethodHandle       6:#326        // REF_invokeStatic ext/mods/gameserver/data/xml/ScriptData.lambda$getQuest$1:(ILext/mods/gameserver/scripting/Quest;)Z
  #326 = Methodref          #11.#327      // ext/mods/gameserver/data/xml/ScriptData.lambda$getQuest$1:(ILext/mods/gameserver/scripting/Quest;)Z
  #327 = NameAndType        #290:#291     // lambda$getQuest$1:(ILext/mods/gameserver/scripting/Quest;)Z
  #328 = MethodHandle       5:#329        // REF_invokeVirtual ext/mods/gameserver/data/xml/ScriptData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #329 = Methodref          #11.#330      // ext/mods/gameserver/data/xml/ScriptData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #330 = NameAndType        #300:#297     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #331 = String             #332          // ext.mods.gameserver.scripting.\u0001
  #332 = Utf8               ext.mods.gameserver.scripting.\u0001
  #333 = MethodHandle       6:#334        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #334 = Methodref          #335.#336     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #335 = Class              #337          // java/lang/invoke/LambdaMetafactory
  #336 = NameAndType        #338:#339     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #337 = Utf8               java/lang/invoke/LambdaMetafactory
  #338 = Utf8               metafactory
  #339 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #340 = MethodHandle       6:#341        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #341 = Methodref          #342.#343     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #342 = Class              #344          // java/lang/invoke/StringConcatFactory
  #343 = NameAndType        #201:#345     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #344 = Utf8               java/lang/invoke/StringConcatFactory
  #345 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #346 = Utf8               InnerClasses
  #347 = Utf8               Scheduler
  #348 = Utf8               SingletonHolder
  #349 = Class              #350          // java/lang/invoke/MethodHandles$Lookup
  #350 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #351 = Class              #352          // java/lang/invoke/MethodHandles
  #352 = Utf8               java/lang/invoke/MethodHandles
  #353 = Utf8               Lookup
{
  public static final int PERIOD;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 300000

  public ext.mods.gameserver.data.xml.ScriptData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _quests:Ljava/util/List;
        15: aload_0
        16: new           #16                 // class java/util/LinkedList
        19: dup
        20: invokespecial #18                 // Method java/util/LinkedList."<init>":()V
        23: putfield      #19                 // Field _scheduled:Ljava/util/List;
        26: aload_0
        27: invokevirtual #22                 // Method load:()V
        30: return
      LineNumberTable:
        line 49: 0
        line 43: 4
        line 44: 15
        line 50: 26
        line 51: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/xml/ScriptData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #25                 // String xml/scripts.xml
         3: invokevirtual #27                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #31                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #35                 // String Loaded {} regular scripts and {} scheduled scripts.
        11: iconst_2
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _quests:Ljava/util/List;
        21: invokeinterface #37,  1           // InterfaceMethod java/util/List.size:()I
        26: invokestatic  #43                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: dup
        31: iconst_1
        32: aload_0
        33: getfield      #19                 // Field _scheduled:Ljava/util/List;
        36: invokeinterface #37,  1           // InterfaceMethod java/util/List.size:()I
        41: invokestatic  #43                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        44: aastore
        45: invokevirtual #49                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        48: aload_0
        49: aload_0
        50: lconst_0
        51: ldc2_w        #55                 // long 300000l
        54: invokestatic  #57                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        57: putfield      #63                 // Field _scheduledTask:Ljava/util/concurrent/ScheduledFuture;
        60: return
      LineNumberTable:
        line 56: 0
        line 57: 6
        line 59: 48
        line 60: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/data/xml/ScriptData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #67                 // String list
         4: aload_0
         5: invokedynamic #69,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/ScriptData;)Ljava/util/function/Consumer;
        10: invokevirtual #73                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 65: 0
        line 108: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/ScriptData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2     p   Ljava/nio/file/Path;

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=1
         0: invokestatic  #77                 // Method java/lang/System.currentTimeMillis:()J
         3: ldc2_w        #55                 // long 300000l
         6: ladd
         7: lstore_1
         8: aload_0
         9: getfield      #19                 // Field _scheduled:Ljava/util/List;
        12: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        17: astore_3
        18: aload_3
        19: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        24: ifeq          81
        27: aload_3
        28: invokeinterface #93,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        33: checkcast     #97                 // class ext/mods/gameserver/scripting/ScheduledQuest
        36: astore        4
        38: lload_1
        39: aload         4
        41: invokevirtual #99                 // Method ext/mods/gameserver/scripting/ScheduledQuest.getTimeNext:()J
        44: lsub
        45: lstore        5
        47: lload         5
        49: lconst_0
        50: lcmp
        51: ifle          78
        54: aload         4
        56: new           #102                // class ext/mods/gameserver/data/xml/ScriptData$Scheduler
        59: dup
        60: aload_0
        61: aload         4
        63: invokespecial #104                // Method ext/mods/gameserver/data/xml/ScriptData$Scheduler."<init>":(Lext/mods/gameserver/data/xml/ScriptData;Lext/mods/gameserver/scripting/ScheduledQuest;)V
        66: ldc2_w        #55                 // long 300000l
        69: lload         5
        71: lsub
        72: invokestatic  #107                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        75: invokevirtual #111                // Method ext/mods/gameserver/scripting/ScheduledQuest.setTask:(Ljava/util/concurrent/ScheduledFuture;)V
        78: goto          18
        81: return
      LineNumberTable:
        line 113: 0
        line 115: 8
        line 117: 38
        line 118: 47
        line 119: 54
        line 120: 78
        line 121: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           47      31     5   eta   J
           38      40     4 script   Lext/mods/gameserver/scripting/ScheduledQuest;
            0      82     0  this   Lext/mods/gameserver/data/xml/ScriptData;
            8      74     1  next   J
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 18
          locals = [ long, class java/util/Iterator ]
        frame_type = 59 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #63                 // Field _scheduledTask:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        23
         7: aload_0
         8: getfield      #63                 // Field _scheduledTask:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_0
        12: invokeinterface #115,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #63                 // Field _scheduledTask:Ljava/util/concurrent/ScheduledFuture;
        23: aload_0
        24: getfield      #10                 // Field _quests:Ljava/util/List;
        27: invokeinterface #121,  1          // InterfaceMethod java/util/List.clear:()V
        32: aload_0
        33: getfield      #19                 // Field _scheduled:Ljava/util/List;
        36: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        41: astore_1
        42: aload_1
        43: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        48: ifeq          68
        51: aload_1
        52: invokeinterface #93,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        57: checkcast     #97                 // class ext/mods/gameserver/scripting/ScheduledQuest
        60: astore_2
        61: aload_2
        62: invokevirtual #124                // Method ext/mods/gameserver/scripting/ScheduledQuest.cleanTask:()V
        65: goto          42
        68: aload_0
        69: getfield      #19                 // Field _scheduled:Ljava/util/List;
        72: invokeinterface #121,  1          // InterfaceMethod java/util/List.clear:()V
        77: aload_0
        78: invokevirtual #22                 // Method load:()V
        81: return
      LineNumberTable:
        line 125: 0
        line 127: 7
        line 128: 18
        line 131: 23
        line 133: 32
        line 134: 61
        line 136: 68
        line 138: 77
        line 139: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           61       4     2 script   Lext/mods/gameserver/scripting/ScheduledQuest;
            0      82     0  this   Lext/mods/gameserver/data/xml/ScriptData;
      StackMapTable: number_of_entries = 3
        frame_type = 23 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 25

  public final void stopAllScripts();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _scheduled:Ljava/util/List;
         4: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          36
        19: aload_1
        20: invokeinterface #93,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #97                 // class ext/mods/gameserver/scripting/ScheduledQuest
        28: astore_2
        29: aload_2
        30: invokevirtual #127                // Method ext/mods/gameserver/scripting/ScheduledQuest.stop:()V
        33: goto          10
        36: return
      LineNumberTable:
        line 148: 0
        line 149: 29
        line 150: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       4     2    sq   Lext/mods/gameserver/scripting/ScheduledQuest;
            0      37     0  this   Lext/mods/gameserver/data/xml/ScriptData;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 25

  public final ext.mods.gameserver.scripting.Quest getQuest(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _quests:Ljava/util/List;
         4: invokeinterface #130,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #134,  0            // InvokeDynamic #1:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        15: invokeinterface #138,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #144,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aconst_null
        26: invokevirtual #148                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #154                // class ext/mods/gameserver/scripting/Quest
        32: areturn
      LineNumberTable:
        line 159: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/xml/ScriptData;
            0      33     1 questName   Ljava/lang/String;

  public final ext.mods.gameserver.scripting.Quest getQuest(int);
    descriptor: (I)Lext/mods/gameserver/scripting/Quest;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _quests:Ljava/util/List;
         4: invokeinterface #130,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: invokedynamic #156,  0            // InvokeDynamic #2:test:(I)Ljava/util/function/Predicate;
        15: invokeinterface #138,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #144,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aconst_null
        26: invokevirtual #148                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #154                // class ext/mods/gameserver/scripting/Quest
        32: areturn
      LineNumberTable:
        line 169: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/xml/ScriptData;
            0      33     1 questId   I

  public final java.util.List<ext.mods.gameserver.scripting.Quest> getQuests();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _quests:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 177: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/ScriptData;
    Signature: #287                         // ()Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;

  public static ext.mods.gameserver.data.xml.ScriptData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/ScriptData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #159                // Field ext/mods/gameserver/data/xml/ScriptData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/ScriptData;
         3: areturn
      LineNumberTable:
        line 202: 0
}
SourceFile: "ScriptData.java"
NestMembers:
  ext/mods/gameserver/data/xml/ScriptData$SingletonHolder
  ext/mods/gameserver/data/xml/ScriptData$Scheduler
BootstrapMethods:
  0: #333 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #314 (Ljava/lang/Object;)V
      #315 REF_invokeVirtual ext/mods/gameserver/data/xml/ScriptData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #318 (Lorg/w3c/dom/Node;)V
  1: #333 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #319 (Ljava/lang/Object;)Z
      #320 REF_invokeStatic ext/mods/gameserver/data/xml/ScriptData.lambda$getQuest$0:(Ljava/lang/String;Lext/mods/gameserver/scripting/Quest;)Z
      #323 (Lext/mods/gameserver/scripting/Quest;)Z
  2: #333 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #319 (Ljava/lang/Object;)Z
      #325 REF_invokeStatic ext/mods/gameserver/data/xml/ScriptData.lambda$getQuest$1:(ILext/mods/gameserver/scripting/Quest;)Z
      #323 (Lext/mods/gameserver/scripting/Quest;)Z
  3: #333 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #314 (Ljava/lang/Object;)V
      #328 REF_invokeVirtual ext/mods/gameserver/data/xml/ScriptData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #318 (Lorg/w3c/dom/Node;)V
  4: #340 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #331 ext.mods.gameserver.scripting.\u0001
InnerClasses:
  public static final #353= #349 of #351; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
