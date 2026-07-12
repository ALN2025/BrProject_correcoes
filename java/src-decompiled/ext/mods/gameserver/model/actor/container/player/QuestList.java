// Bytecode for: ext.mods.gameserver.model.actor.container.player.QuestList
// File: ext\mods\gameserver\model\actor\container\player\QuestList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/QuestList.class
  Last modified 9 de jul de 2026; size 7937 bytes
  MD5 checksum 228b8d367e82c4d94b52daede4583a88
  Compiled from "QuestList.java"
public final class ext.mods.gameserver.model.actor.container.player.QuestList extends java.util.ArrayList<ext.mods.gameserver.scripting.QuestState>
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/player/QuestList
  super_class: #2                         // java/util/ArrayList
  interfaces: 0, fields: 5, methods: 13, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/util/ArrayList."<init>":()V
    #2 = Class              #4            // java/util/ArrayList
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/util/ArrayList
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/container/player/QuestList._player:Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/container/player/QuestList
    #9 = NameAndType        #11:#12       // _player:Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/model/actor/container/player/QuestList
   #11 = Utf8               _player
   #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/container/player/QuestList._lastQuestNpcObjectId:I
   #14 = NameAndType        #15:#16       // _lastQuestNpcObjectId:I
   #15 = Utf8               _lastQuestNpcObjectId
   #16 = Utf8               I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/model/actor/container/player/QuestList.stream:()Ljava/util/stream/Stream;
   #18 = NameAndType        #19:#20       // stream:()Ljava/util/stream/Stream;
   #19 = Utf8               stream
   #20 = Utf8               ()Ljava/util/stream/Stream;
   #21 = InvokeDynamic      #0:#22        // #0:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #22 = NameAndType        #23:#24       // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #23 = Utf8               test
   #24 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
   #25 = InterfaceMethodref #26.#27       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #26 = Class              #28           // java/util/stream/Stream
   #27 = NameAndType        #29:#30       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #28 = Utf8               java/util/stream/Stream
   #29 = Utf8               filter
   #30 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #31 = InterfaceMethodref #26.#32       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #32 = NameAndType        #33:#34       // findFirst:()Ljava/util/Optional;
   #33 = Utf8               findFirst
   #34 = Utf8               ()Ljava/util/Optional;
   #35 = Methodref          #36.#37       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #36 = Class              #38           // java/util/Optional
   #37 = NameAndType        #39:#40       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #38 = Utf8               java/util/Optional
   #39 = Utf8               orElse
   #40 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #41 = Class              #42           // ext/mods/gameserver/scripting/QuestState
   #42 = Utf8               ext/mods/gameserver/scripting/QuestState
   #43 = InvokeDynamic      #1:#44        // #1:test:(I)Ljava/util/function/Predicate;
   #44 = NameAndType        #23:#45       // test:(I)Ljava/util/function/Predicate;
   #45 = Utf8               (I)Ljava/util/function/Predicate;
   #46 = InvokeDynamic      #2:#47        // #2:test:(Z)Ljava/util/function/Predicate;
   #47 = NameAndType        #23:#48       // test:(Z)Ljava/util/function/Predicate;
   #48 = Utf8               (Z)Ljava/util/function/Predicate;
   #49 = InterfaceMethodref #26.#50       // java/util/stream/Stream.toList:()Ljava/util/List;
   #50 = NameAndType        #51:#52       // toList:()Ljava/util/List;
   #51 = Utf8               toList
   #52 = Utf8               ()Ljava/util/List;
   #53 = InvokeDynamic      #3:#54        // #3:apply:()Ljava/util/function/Function;
   #54 = NameAndType        #55:#56       // apply:()Ljava/util/function/Function;
   #55 = Utf8               apply
   #56 = Utf8               ()Ljava/util/function/Function;
   #57 = InterfaceMethodref #26.#58       // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #58 = NameAndType        #59:#60       // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #59 = Utf8               map
   #60 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #61 = Methodref          #62.#63       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #62 = Class              #64           // ext/mods/commons/pool/ConnectionPool
   #63 = NameAndType        #65:#66       // getConnection:()Ljava/sql/Connection;
   #64 = Utf8               ext/mods/commons/pool/ConnectionPool
   #65 = Utf8               getConnection
   #66 = Utf8               ()Ljava/sql/Connection;
   #67 = String             #68           // SELECT name,var,value FROM character_quests WHERE charId=?
   #68 = Utf8               SELECT name,var,value FROM character_quests WHERE charId=?
   #69 = InterfaceMethodref #70.#71       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #70 = Class              #72           // java/sql/Connection
   #71 = NameAndType        #73:#74       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #72 = Utf8               java/sql/Connection
   #73 = Utf8               prepareStatement
   #74 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #75 = Methodref          #76.#77       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #76 = Class              #78           // ext/mods/gameserver/model/actor/Player
   #77 = NameAndType        #79:#80       // getObjectId:()I
   #78 = Utf8               ext/mods/gameserver/model/actor/Player
   #79 = Utf8               getObjectId
   #80 = Utf8               ()I
   #81 = InterfaceMethodref #82.#83       // java/sql/PreparedStatement.setInt:(II)V
   #82 = Class              #84           // java/sql/PreparedStatement
   #83 = NameAndType        #85:#86       // setInt:(II)V
   #84 = Utf8               java/sql/PreparedStatement
   #85 = Utf8               setInt
   #86 = Utf8               (II)V
   #87 = InterfaceMethodref #82.#88       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #88 = NameAndType        #89:#90       // executeQuery:()Ljava/sql/ResultSet;
   #89 = Utf8               executeQuery
   #90 = Utf8               ()Ljava/sql/ResultSet;
   #91 = InterfaceMethodref #92.#93       // java/sql/ResultSet.next:()Z
   #92 = Class              #94           // java/sql/ResultSet
   #93 = NameAndType        #95:#96       // next:()Z
   #94 = Utf8               java/sql/ResultSet
   #95 = Utf8               next
   #96 = Utf8               ()Z
   #97 = String             #98           // name
   #98 = Utf8               name
   #99 = InterfaceMethodref #92.#100      // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #100 = NameAndType        #101:#102     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #101 = Utf8               getString
  #102 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #103 = Methodref          #104.#105     // ext/mods/gameserver/data/xml/ScriptData.getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
  #104 = Class              #106          // ext/mods/gameserver/data/xml/ScriptData
  #105 = NameAndType        #107:#108     // getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
  #106 = Utf8               ext/mods/gameserver/data/xml/ScriptData
  #107 = Utf8               getInstance
  #108 = Utf8               ()Lext/mods/gameserver/data/xml/ScriptData;
  #109 = Methodref          #104.#110     // ext/mods/gameserver/data/xml/ScriptData.getQuest:(Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
  #110 = NameAndType        #111:#112     // getQuest:(Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
  #111 = Utf8               getQuest
  #112 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
  #113 = Fieldref           #8.#114       // ext/mods/gameserver/model/actor/container/player/QuestList.LOGGER:Lext/mods/commons/logging/CLogger;
  #114 = NameAndType        #115:#116     // LOGGER:Lext/mods/commons/logging/CLogger;
  #115 = Utf8               LOGGER
  #116 = Utf8               Lext/mods/commons/logging/CLogger;
  #117 = String             #118          // Unknown quest {} for player {}.
  #118 = Utf8               Unknown quest {} for player {}.
  #119 = Class              #120          // java/lang/Object
  #120 = Utf8               java/lang/Object
  #121 = Methodref          #76.#122      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #122 = NameAndType        #123:#124     // getName:()Ljava/lang/String;
  #123 = Utf8               getName
  #124 = Utf8               ()Ljava/lang/String;
  #125 = Methodref          #126.#127     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #126 = Class              #128          // ext/mods/commons/logging/CLogger
  #127 = NameAndType        #129:#130     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #128 = Utf8               ext/mods/commons/logging/CLogger
  #129 = Utf8               warn
  #130 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #131 = Methodref          #8.#132       // ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #132 = NameAndType        #133:#134     // getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #133 = Utf8               getQuestState
  #134 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #135 = Methodref          #41.#136      // ext/mods/gameserver/scripting/QuestState."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
  #136 = NameAndType        #5:#137       // "<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
  #137 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
  #138 = Methodref          #41.#139      // ext/mods/gameserver/scripting/QuestState.loadFromDB:(Ljava/sql/ResultSet;)V
  #139 = NameAndType        #140:#141     // loadFromDB:(Ljava/sql/ResultSet;)V
  #140 = Utf8               loadFromDB
  #141 = Utf8               (Ljava/sql/ResultSet;)V
  #142 = InterfaceMethodref #92.#143      // java/sql/ResultSet.close:()V
  #143 = NameAndType        #144:#6       // close:()V
  #144 = Utf8               close
  #145 = Class              #146          // java/lang/Throwable
  #146 = Utf8               java/lang/Throwable
  #147 = Methodref          #145.#148     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #148 = NameAndType        #149:#150     // addSuppressed:(Ljava/lang/Throwable;)V
  #149 = Utf8               addSuppressed
  #150 = Utf8               (Ljava/lang/Throwable;)V
  #151 = InterfaceMethodref #82.#143      // java/sql/PreparedStatement.close:()V
  #152 = InterfaceMethodref #70.#143      // java/sql/Connection.close:()V
  #153 = Class              #154          // java/lang/Exception
  #154 = Utf8               java/lang/Exception
  #155 = String             #156          // Couldn\'t restore quests.
  #156 = Utf8               Couldn\'t restore quests.
  #157 = Methodref          #126.#158     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #158 = NameAndType        #159:#160     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #159 = Utf8               error
  #160 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #161 = Methodref          #162.#163     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #162 = Class              #164          // ext/mods/gameserver/model/World
  #163 = NameAndType        #107:#165     // getInstance:()Lext/mods/gameserver/model/World;
  #164 = Utf8               ext/mods/gameserver/model/World
  #165 = Utf8               ()Lext/mods/gameserver/model/World;
  #166 = Methodref          #8.#167       // ext/mods/gameserver/model/actor/container/player/QuestList.getLastQuestNpcObjectId:()I
  #167 = NameAndType        #168:#80      // getLastQuestNpcObjectId:()I
  #168 = Utf8               getLastQuestNpcObjectId
  #169 = Methodref          #162.#170     // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #170 = NameAndType        #171:#172     // getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #171 = Utf8               getObject
  #172 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
  #173 = Class              #174          // ext/mods/gameserver/model/actor/Npc
  #174 = Utf8               ext/mods/gameserver/model/actor/Npc
  #175 = Methodref          #76.#176      // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #176 = NameAndType        #177:#178     // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #177 = Utf8               isIn3DRadius
  #178 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #179 = Methodref          #173.#180     // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #180 = NameAndType        #181:#182     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #181 = Utf8               getTemplate
  #182 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #183 = Fieldref           #184.#185     // ext/mods/gameserver/enums/EventHandler.TALKED:Lext/mods/gameserver/enums/EventHandler;
  #184 = Class              #186          // ext/mods/gameserver/enums/EventHandler
  #185 = NameAndType        #187:#188     // TALKED:Lext/mods/gameserver/enums/EventHandler;
  #186 = Utf8               ext/mods/gameserver/enums/EventHandler
  #187 = Utf8               TALKED
  #188 = Utf8               Lext/mods/gameserver/enums/EventHandler;
  #189 = Methodref          #190.#191     // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #190 = Class              #192          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #191 = NameAndType        #193:#194     // getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #192 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #193 = Utf8               getEventQuests
  #194 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #195 = InterfaceMethodref #196.#197     // java/util/List.iterator:()Ljava/util/Iterator;
  #196 = Class              #198          // java/util/List
  #197 = NameAndType        #199:#200     // iterator:()Ljava/util/Iterator;
  #198 = Utf8               java/util/List
  #199 = Utf8               iterator
  #200 = Utf8               ()Ljava/util/Iterator;
  #201 = InterfaceMethodref #202.#203     // java/util/Iterator.hasNext:()Z
  #202 = Class              #204          // java/util/Iterator
  #203 = NameAndType        #205:#96      // hasNext:()Z
  #204 = Utf8               java/util/Iterator
  #205 = Utf8               hasNext
  #206 = InterfaceMethodref #202.#207     // java/util/Iterator.next:()Ljava/lang/Object;
  #207 = NameAndType        #95:#208      // next:()Ljava/lang/Object;
  #208 = Utf8               ()Ljava/lang/Object;
  #209 = Class              #210          // ext/mods/gameserver/scripting/Quest
  #210 = Utf8               ext/mods/gameserver/scripting/Quest
  #211 = Methodref          #209.#212     // ext/mods/gameserver/scripting/Quest.equals:(Ljava/lang/Object;)Z
  #212 = NameAndType        #213:#214     // equals:(Ljava/lang/Object;)Z
  #213 = Utf8               equals
  #214 = Utf8               (Ljava/lang/Object;)Z
  #215 = Methodref          #209.#216     // ext/mods/gameserver/scripting/Quest.notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #216 = NameAndType        #217:#218     // notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #217 = Utf8               notifyEvent
  #218 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #219 = Methodref          #41.#220      // ext/mods/gameserver/scripting/QuestState.getQuest:()Lext/mods/gameserver/scripting/Quest;
  #220 = NameAndType        #111:#221     // getQuest:()Lext/mods/gameserver/scripting/Quest;
  #221 = Utf8               ()Lext/mods/gameserver/scripting/Quest;
  #222 = Methodref          #209.#223     // ext/mods/gameserver/scripting/Quest.isRealQuest:()Z
  #223 = NameAndType        #224:#96      // isRealQuest:()Z
  #224 = Utf8               isRealQuest
  #225 = Methodref          #41.#226      // ext/mods/gameserver/scripting/QuestState.isStarted:()Z
  #226 = NameAndType        #227:#96      // isStarted:()Z
  #227 = Utf8               isStarted
  #228 = Methodref          #41.#229      // ext/mods/gameserver/scripting/QuestState.isCompleted:()Z
  #229 = NameAndType        #230:#96      // isCompleted:()Z
  #230 = Utf8               isCompleted
  #231 = Methodref          #209.#232     // ext/mods/gameserver/scripting/Quest.getQuestId:()I
  #232 = NameAndType        #233:#80      // getQuestId:()I
  #233 = Utf8               getQuestId
  #234 = Methodref          #209.#122     // ext/mods/gameserver/scripting/Quest.getName:()Ljava/lang/String;
  #235 = Methodref          #236.#212     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #236 = Class              #237          // java/lang/String
  #237 = Utf8               java/lang/String
  #238 = Methodref          #239.#122     // java/lang/Class.getName:()Ljava/lang/String;
  #239 = Class              #240          // java/lang/Class
  #240 = Utf8               java/lang/Class
  #241 = Methodref          #126.#242     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #242 = NameAndType        #5:#243       // "<init>":(Ljava/lang/String;)V
  #243 = Utf8               (Ljava/lang/String;)V
  #244 = Utf8               serialVersionUID
  #245 = Utf8               J
  #246 = Utf8               ConstantValue
  #247 = Long               1l
  #249 = Utf8               LOAD_PLAYER_QUESTS
  #250 = Utf8               Ljava/lang/String;
  #251 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #252 = Utf8               Code
  #253 = Utf8               LineNumberTable
  #254 = Utf8               LocalVariableTable
  #255 = Utf8               this
  #256 = Utf8               Lext/mods/gameserver/model/actor/container/player/QuestList;
  #257 = Utf8               player
  #258 = Utf8               setLastQuestNpcObjectId
  #259 = Utf8               (I)V
  #260 = Utf8               objectId
  #261 = Utf8               (I)Lext/mods/gameserver/scripting/QuestState;
  #262 = Utf8               id
  #263 = Utf8               getAllQuests
  #264 = Utf8               (Z)Ljava/util/List;
  #265 = Utf8               completed
  #266 = Utf8               Z
  #267 = Utf8               Signature
  #268 = Utf8               (Z)Ljava/util/List<Lext/mods/gameserver/scripting/QuestState;>;
  #269 = Utf8               getQuests
  #270 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/List;
  #271 = Utf8               predicate
  #272 = Utf8               Ljava/util/function/Predicate;
  #273 = Utf8               LocalVariableTypeTable
  #274 = Utf8               Ljava/util/function/Predicate<Lext/mods/gameserver/scripting/Quest;>;
  #275 = Utf8               (Ljava/util/function/Predicate<Lext/mods/gameserver/scripting/Quest;>;)Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #276 = Utf8               restore
  #277 = Utf8               questName
  #278 = Utf8               quest
  #279 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #280 = Utf8               qs
  #281 = Utf8               Lext/mods/gameserver/scripting/QuestState;
  #282 = Utf8               rs
  #283 = Utf8               Ljava/sql/ResultSet;
  #284 = Utf8               ps
  #285 = Utf8               Ljava/sql/PreparedStatement;
  #286 = Utf8               con
  #287 = Utf8               Ljava/sql/Connection;
  #288 = Utf8               e
  #289 = Utf8               Ljava/lang/Exception;
  #290 = Utf8               StackMapTable
  #291 = Utf8               processQuestEvent
  #292 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #293 = Utf8               npc
  #294 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #295 = Utf8               script
  #296 = Utf8               event
  #297 = Utf8               object
  #298 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #299 = Class              #300          // ext/mods/gameserver/model/WorldObject
  #300 = Utf8               ext/mods/gameserver/model/WorldObject
  #301 = Utf8               lambda$getAllQuests$0
  #302 = Utf8               (ZLext/mods/gameserver/scripting/QuestState;)Z
  #303 = Utf8               lambda$getQuestState$1
  #304 = Utf8               (ILext/mods/gameserver/scripting/QuestState;)Z
  #305 = Utf8               lambda$getQuestState$0
  #306 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/scripting/QuestState;)Z
  #307 = Utf8               <clinit>
  #308 = Utf8               Ljava/util/ArrayList<Lext/mods/gameserver/scripting/QuestState;>;
  #309 = Utf8               SourceFile
  #310 = Utf8               QuestList.java
  #311 = Utf8               BootstrapMethods
  #312 = MethodType         #214          //  (Ljava/lang/Object;)Z
  #313 = MethodHandle       6:#314        // REF_invokeStatic ext/mods/gameserver/model/actor/container/player/QuestList.lambda$getQuestState$0:(Ljava/lang/String;Lext/mods/gameserver/scripting/QuestState;)Z
  #314 = Methodref          #8.#315       // ext/mods/gameserver/model/actor/container/player/QuestList.lambda$getQuestState$0:(Ljava/lang/String;Lext/mods/gameserver/scripting/QuestState;)Z
  #315 = NameAndType        #305:#306     // lambda$getQuestState$0:(Ljava/lang/String;Lext/mods/gameserver/scripting/QuestState;)Z
  #316 = MethodType         #317          //  (Lext/mods/gameserver/scripting/QuestState;)Z
  #317 = Utf8               (Lext/mods/gameserver/scripting/QuestState;)Z
  #318 = MethodHandle       6:#319        // REF_invokeStatic ext/mods/gameserver/model/actor/container/player/QuestList.lambda$getQuestState$1:(ILext/mods/gameserver/scripting/QuestState;)Z
  #319 = Methodref          #8.#320       // ext/mods/gameserver/model/actor/container/player/QuestList.lambda$getQuestState$1:(ILext/mods/gameserver/scripting/QuestState;)Z
  #320 = NameAndType        #303:#304     // lambda$getQuestState$1:(ILext/mods/gameserver/scripting/QuestState;)Z
  #321 = MethodHandle       6:#322        // REF_invokeStatic ext/mods/gameserver/model/actor/container/player/QuestList.lambda$getAllQuests$0:(ZLext/mods/gameserver/scripting/QuestState;)Z
  #322 = Methodref          #8.#323       // ext/mods/gameserver/model/actor/container/player/QuestList.lambda$getAllQuests$0:(ZLext/mods/gameserver/scripting/QuestState;)Z
  #323 = NameAndType        #301:#302     // lambda$getAllQuests$0:(ZLext/mods/gameserver/scripting/QuestState;)Z
  #324 = MethodType         #40           //  (Ljava/lang/Object;)Ljava/lang/Object;
  #325 = MethodHandle       5:#219        // REF_invokeVirtual ext/mods/gameserver/scripting/QuestState.getQuest:()Lext/mods/gameserver/scripting/Quest;
  #326 = MethodType         #327          //  (Lext/mods/gameserver/scripting/QuestState;)Lext/mods/gameserver/scripting/Quest;
  #327 = Utf8               (Lext/mods/gameserver/scripting/QuestState;)Lext/mods/gameserver/scripting/Quest;
  #328 = MethodHandle       6:#329        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #329 = Methodref          #330.#331     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #330 = Class              #332          // java/lang/invoke/LambdaMetafactory
  #331 = NameAndType        #333:#334     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #332 = Utf8               java/lang/invoke/LambdaMetafactory
  #333 = Utf8               metafactory
  #334 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #335 = Utf8               InnerClasses
  #336 = Class              #337          // java/lang/invoke/MethodHandles$Lookup
  #337 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #338 = Class              #339          // java/lang/invoke/MethodHandles
  #339 = Utf8               java/lang/invoke/MethodHandles
  #340 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.container.player.QuestList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/util/ArrayList."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
         9: return
      LineNumberTable:
        line 52: 0
        line 53: 4
        line 54: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/player/QuestList;
            0      10     1 player   Lext/mods/gameserver/model/actor/Player;

  public int getLastQuestNpcObjectId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _lastQuestNpcObjectId:I
         4: ireturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/QuestList;

  public void setLastQuestNpcObjectId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #13                 // Field _lastQuestNpcObjectId:I
         5: return
      LineNumberTable:
        line 63: 0
        line 64: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/container/player/QuestList;
            0       6     1 objectId   I

  public ext.mods.gameserver.scripting.QuestState getQuestState(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #17                 // Method stream:()Ljava/util/stream/Stream;
         4: aload_1
         5: invokedynamic #21,  0             // InvokeDynamic #0:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        10: invokeinterface #25,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        15: invokeinterface #31,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        20: aconst_null
        21: invokevirtual #35                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        24: checkcast     #41                 // class ext/mods/gameserver/scripting/QuestState
        27: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/container/player/QuestList;
            0      28     1  name   Ljava/lang/String;

  public ext.mods.gameserver.scripting.QuestState getQuestState(int);
    descriptor: (I)Lext/mods/gameserver/scripting/QuestState;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #17                 // Method stream:()Ljava/util/stream/Stream;
         4: iload_1
         5: invokedynamic #43,  0             // InvokeDynamic #1:test:(I)Ljava/util/function/Predicate;
        10: invokeinterface #25,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        15: invokeinterface #31,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        20: aconst_null
        21: invokevirtual #35                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        24: checkcast     #41                 // class ext/mods/gameserver/scripting/QuestState
        27: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/container/player/QuestList;
            0      28     1    id   I

  public java.util.List<ext.mods.gameserver.scripting.QuestState> getAllQuests(boolean);
    descriptor: (Z)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #17                 // Method stream:()Ljava/util/stream/Stream;
         4: iload_1
         5: invokedynamic #46,  0             // InvokeDynamic #2:test:(Z)Ljava/util/function/Predicate;
        10: invokeinterface #25,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        15: invokeinterface #49,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        20: areturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/container/player/QuestList;
            0      21     1 completed   Z
    Signature: #268                         // (Z)Ljava/util/List<Lext/mods/gameserver/scripting/QuestState;>;

  public java.util.List<ext.mods.gameserver.scripting.Quest> getQuests(java.util.function.Predicate<ext.mods.gameserver.scripting.Quest>);
    descriptor: (Ljava/util/function/Predicate;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #17                 // Method stream:()Ljava/util/stream/Stream;
         4: invokedynamic #53,  0             // InvokeDynamic #3:apply:()Ljava/util/function/Function;
         9: invokeinterface #57,  2           // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        14: aload_1
        15: invokeinterface #25,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #49,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        25: areturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/container/player/QuestList;
            0      26     1 predicate   Ljava/util/function/Predicate;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     1 predicate   Ljava/util/function/Predicate<Lext/mods/gameserver/scripting/Quest;>;
    Signature: #275                         // (Ljava/util/function/Predicate<Lext/mods/gameserver/scripting/Quest;>;)Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;

  public void restore();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=1
         0: invokestatic  #61                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #67                 // String SELECT name,var,value FROM character_quests WHERE charId=?
         7: invokeinterface #69,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: iconst_1
        15: aload_0
        16: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        19: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        22: invokeinterface #81,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        27: aload_2
        28: invokeinterface #87,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        33: astore_3
        34: aload_3
        35: invokeinterface #91,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        40: ifeq          135
        43: aload_3
        44: ldc           #97                 // String name
        46: invokeinterface #99,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        51: astore        4
        53: invokestatic  #103                // Method ext/mods/gameserver/data/xml/ScriptData.getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
        56: aload         4
        58: invokevirtual #109                // Method ext/mods/gameserver/data/xml/ScriptData.getQuest:(Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
        61: astore        5
        63: aload         5
        65: ifnonnull     98
        68: getstatic     #113                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        71: ldc           #117                // String Unknown quest {} for player {}.
        73: iconst_2
        74: anewarray     #119                // class java/lang/Object
        77: dup
        78: iconst_0
        79: aload         4
        81: aastore
        82: dup
        83: iconst_1
        84: aload_0
        85: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        88: invokevirtual #121                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        91: aastore
        92: invokevirtual #125                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        95: goto          34
        98: aload_0
        99: aload         4
       101: invokevirtual #131                // Method getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
       104: astore        6
       106: aload         6
       108: ifnonnull     126
       111: new           #41                 // class ext/mods/gameserver/scripting/QuestState
       114: dup
       115: aload_0
       116: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       119: aload         5
       121: invokespecial #135                // Method ext/mods/gameserver/scripting/QuestState."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
       124: astore        6
       126: aload         6
       128: aload_3
       129: invokevirtual #138                // Method ext/mods/gameserver/scripting/QuestState.loadFromDB:(Ljava/sql/ResultSet;)V
       132: goto          34
       135: aload_3
       136: ifnull        175
       139: aload_3
       140: invokeinterface #142,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       145: goto          175
       148: astore        4
       150: aload_3
       151: ifnull        172
       154: aload_3
       155: invokeinterface #142,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       160: goto          172
       163: astore        5
       165: aload         4
       167: aload         5
       169: invokevirtual #147                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       172: aload         4
       174: athrow
       175: aload_2
       176: ifnull        212
       179: aload_2
       180: invokeinterface #151,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       185: goto          212
       188: astore_3
       189: aload_2
       190: ifnull        210
       193: aload_2
       194: invokeinterface #151,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       199: goto          210
       202: astore        4
       204: aload_3
       205: aload         4
       207: invokevirtual #147                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       210: aload_3
       211: athrow
       212: aload_1
       213: ifnull        247
       216: aload_1
       217: invokeinterface #152,  1          // InterfaceMethod java/sql/Connection.close:()V
       222: goto          247
       225: astore_2
       226: aload_1
       227: ifnull        245
       230: aload_1
       231: invokeinterface #152,  1          // InterfaceMethod java/sql/Connection.close:()V
       236: goto          245
       239: astore_3
       240: aload_2
       241: aload_3
       242: invokevirtual #147                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       245: aload_2
       246: athrow
       247: goto          260
       250: astore_1
       251: getstatic     #113                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       254: ldc           #155                // String Couldn\'t restore quests.
       256: aload_1
       257: invokevirtual #157                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       260: return
      Exception table:
         from    to  target type
            34   135   148   Class java/lang/Throwable
           154   160   163   Class java/lang/Throwable
            13   175   188   Class java/lang/Throwable
           193   199   202   Class java/lang/Throwable
             4   212   225   Class java/lang/Throwable
           230   236   239   Class java/lang/Throwable
             0   247   250   Class java/lang/Exception
      LineNumberTable:
        line 108: 0
        line 109: 4
        line 111: 13
        line 113: 27
        line 115: 34
        line 117: 43
        line 119: 53
        line 120: 63
        line 122: 68
        line 123: 95
        line 126: 98
        line 127: 106
        line 128: 111
        line 130: 126
        line 131: 132
        line 132: 135
        line 113: 148
        line 133: 175
        line 108: 188
        line 133: 212
        line 108: 225
        line 137: 247
        line 134: 250
        line 136: 251
        line 138: 260
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      79     4 questName   Ljava/lang/String;
           63      69     5 quest   Lext/mods/gameserver/scripting/Quest;
          106      26     6    qs   Lext/mods/gameserver/scripting/QuestState;
           34     141     3    rs   Ljava/sql/ResultSet;
           13     199     2    ps   Ljava/sql/PreparedStatement;
            4     243     1   con   Ljava/sql/Connection;
          251       9     1     e   Ljava/lang/Exception;
            0     261     0  this   Lext/mods/gameserver/model/actor/container/player/QuestList;
      StackMapTable: number_of_entries = 18
        frame_type = 254 /* append */
          offset_delta = 34
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 253 /* append */
          offset_delta = 63
          locals = [ class java/lang/String, class ext/mods/gameserver/scripting/Quest ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/scripting/QuestState ]
        frame_type = 248 /* chop */
          offset_delta = 8
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/container/player/QuestList, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/QuestList, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/QuestList, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void processQuestEvent(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=3
         0: invokestatic  #103                // Method ext/mods/gameserver/data/xml/ScriptData.getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
         3: aload_1
         4: invokevirtual #109                // Method ext/mods/gameserver/data/xml/ScriptData.getQuest:(Ljava/lang/String;)Lext/mods/gameserver/scripting/Quest;
         7: astore_3
         8: aload_3
         9: ifnonnull     13
        12: return
        13: invokestatic  #161                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        16: aload_0
        17: invokevirtual #166                // Method getLastQuestNpcObjectId:()I
        20: invokevirtual #169                // Method ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
        23: astore        4
        25: aload         4
        27: instanceof    #173                // class ext/mods/gameserver/model/actor/Npc
        30: ifeq          55
        33: aload         4
        35: checkcast     #173                // class ext/mods/gameserver/model/actor/Npc
        38: astore        5
        40: aload_0
        41: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
        44: aload         5
        46: sipush        150
        49: invokevirtual #175                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        52: ifne          56
        55: return
        56: aload         5
        58: invokevirtual #179                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        61: getstatic     #183                // Field ext/mods/gameserver/enums/EventHandler.TALKED:Lext/mods/gameserver/enums/EventHandler;
        64: invokevirtual #189                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        67: invokeinterface #195,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        72: astore        6
        74: aload         6
        76: invokeinterface #201,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        81: ifeq          122
        84: aload         6
        86: invokeinterface #206,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        91: checkcast     #209                // class ext/mods/gameserver/scripting/Quest
        94: astore        7
        96: aload         7
        98: aload_3
        99: invokevirtual #211                // Method ext/mods/gameserver/scripting/Quest.equals:(Ljava/lang/Object;)Z
       102: ifne          108
       105: goto          74
       108: aload_3
       109: aload_2
       110: aload         5
       112: aload_0
       113: getfield      #7                  // Field _player:Lext/mods/gameserver/model/actor/Player;
       116: invokevirtual #215                // Method ext/mods/gameserver/scripting/Quest.notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
       119: goto          122
       122: return
      LineNumberTable:
        line 142: 0
        line 143: 8
        line 144: 12
        line 146: 13
        line 147: 25
        line 148: 55
        line 150: 56
        line 152: 96
        line 153: 105
        line 155: 108
        line 156: 119
        line 158: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      15     5   npc   Lext/mods/gameserver/model/actor/Npc;
           96      26     7 script   Lext/mods/gameserver/scripting/Quest;
            0     123     0  this   Lext/mods/gameserver/model/actor/container/player/QuestList;
            0     123     1 questName   Ljava/lang/String;
            0     123     2 event   Ljava/lang/String;
            8     115     3 quest   Lext/mods/gameserver/scripting/Quest;
           25      98     4 object   Lext/mods/gameserver/model/WorldObject;
           56      67     5   npc   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/scripting/Quest ]
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/scripting/Quest ]
        frame_type = 249 /* chop */
          offset_delta = 13

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #126                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/model/actor/container/player/QuestList
         6: invokevirtual #238                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #241                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #113                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 41: 0
}
Signature: #308                         // Ljava/util/ArrayList<Lext/mods/gameserver/scripting/QuestState;>;
SourceFile: "QuestList.java"
BootstrapMethods:
  0: #328 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #312 (Ljava/lang/Object;)Z
      #313 REF_invokeStatic ext/mods/gameserver/model/actor/container/player/QuestList.lambda$getQuestState$0:(Ljava/lang/String;Lext/mods/gameserver/scripting/QuestState;)Z
      #316 (Lext/mods/gameserver/scripting/QuestState;)Z
  1: #328 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #312 (Ljava/lang/Object;)Z
      #318 REF_invokeStatic ext/mods/gameserver/model/actor/container/player/QuestList.lambda$getQuestState$1:(ILext/mods/gameserver/scripting/QuestState;)Z
      #316 (Lext/mods/gameserver/scripting/QuestState;)Z
  2: #328 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #312 (Ljava/lang/Object;)Z
      #321 REF_invokeStatic ext/mods/gameserver/model/actor/container/player/QuestList.lambda$getAllQuests$0:(ZLext/mods/gameserver/scripting/QuestState;)Z
      #316 (Lext/mods/gameserver/scripting/QuestState;)Z
  3: #328 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #324 (Ljava/lang/Object;)Ljava/lang/Object;
      #325 REF_invokeVirtual ext/mods/gameserver/scripting/QuestState.getQuest:()Lext/mods/gameserver/scripting/Quest;
      #326 (Lext/mods/gameserver/scripting/QuestState;)Lext/mods/gameserver/scripting/Quest;
InnerClasses:
  public static final #340= #336 of #338; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
