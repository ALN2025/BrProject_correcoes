// Bytecode for: ext.mods.gameserver.model.olympiad.OlympiadManager
// File: ext\mods\gameserver\model\olympiad\OlympiadManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/olympiad/OlympiadManager.class
  Last modified 9 de jul de 2026; size 11860 bytes
  MD5 checksum 77cf16aa8fe365ff09fbd615303079a4
  Compiled from "OlympiadManager.java"
public class ext.mods.gameserver.model.olympiad.OlympiadManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/olympiad/OlympiadManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 16, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/CopyOnWriteArrayList
    #8 = Utf8               java/util/concurrent/CopyOnWriteArrayList
    #9 = Methodref          #7.#3         // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/olympiad/OlympiadManager._nonClassBasedParticipants:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/model/olympiad/OlympiadManager
   #12 = NameAndType        #14:#15       // _nonClassBasedParticipants:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
   #14 = Utf8               _nonClassBasedParticipants
   #15 = Utf8               Ljava/util/List;
   #16 = Class              #17           // java/util/concurrent/ConcurrentHashMap
   #17 = Utf8               java/util/concurrent/ConcurrentHashMap
   #18 = Methodref          #16.#3        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/model/olympiad/OlympiadManager._classBasedParticipants:Ljava/util/Map;
   #20 = NameAndType        #21:#22       // _classBasedParticipants:Ljava/util/Map;
   #21 = Utf8               _classBasedParticipants
   #22 = Utf8               Ljava/util/Map;
   #23 = InterfaceMethodref #24.#25       // java/util/List.size:()I
   #24 = Class              #26           // java/util/List
   #25 = NameAndType        #27:#28       // size:()I
   #26 = Utf8               java/util/List
   #27 = Utf8               size
   #28 = Utf8               ()I
   #29 = Fieldref           #30.#31       // ext/mods/Config.OLY_NONCLASSED:I
   #30 = Class              #32           // ext/mods/Config
   #31 = NameAndType        #33:#34       // OLY_NONCLASSED:I
   #32 = Utf8               ext/mods/Config
   #33 = Utf8               OLY_NONCLASSED
   #34 = Utf8               I
   #35 = InterfaceMethodref #36.#37       // java/util/Map.values:()Ljava/util/Collection;
   #36 = Class              #38           // java/util/Map
   #37 = NameAndType        #39:#40       // values:()Ljava/util/Collection;
   #38 = Utf8               java/util/Map
   #39 = Utf8               values
   #40 = Utf8               ()Ljava/util/Collection;
   #41 = InterfaceMethodref #42.#43       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #42 = Class              #44           // java/util/Collection
   #43 = NameAndType        #45:#46       // iterator:()Ljava/util/Iterator;
   #44 = Utf8               java/util/Collection
   #45 = Utf8               iterator
   #46 = Utf8               ()Ljava/util/Iterator;
   #47 = InterfaceMethodref #48.#49       // java/util/Iterator.hasNext:()Z
   #48 = Class              #50           // java/util/Iterator
   #49 = NameAndType        #51:#52       // hasNext:()Z
   #50 = Utf8               java/util/Iterator
   #51 = Utf8               hasNext
   #52 = Utf8               ()Z
   #53 = InterfaceMethodref #48.#54       // java/util/Iterator.next:()Ljava/lang/Object;
   #54 = NameAndType        #55:#56       // next:()Ljava/lang/Object;
   #55 = Utf8               next
   #56 = Utf8               ()Ljava/lang/Object;
   #57 = Fieldref           #30.#58       // ext/mods/Config.OLY_CLASSED:I
   #58 = NameAndType        #59:#34       // OLY_CLASSED:I
   #59 = Utf8               OLY_CLASSED
   #60 = Class              #61           // java/util/ArrayList
   #61 = Utf8               java/util/ArrayList
   #62 = Methodref          #60.#3        // java/util/ArrayList."<init>":()V
   #63 = InterfaceMethodref #24.#64       // java/util/List.add:(Ljava/lang/Object;)Z
   #64 = NameAndType        #65:#66       // add:(Ljava/lang/Object;)Z
   #65 = Utf8               add
   #66 = Utf8               (Ljava/lang/Object;)Z
   #67 = InterfaceMethodref #24.#68       // java/util/List.clear:()V
   #68 = NameAndType        #69:#6        // clear:()V
   #69 = Utf8               clear
   #70 = InterfaceMethodref #36.#68       // java/util/Map.clear:()V
   #71 = Methodref          #72.#73       // ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
   #72 = Class              #74           // ext/mods/gameserver/data/manager/AntiFeedManager
   #73 = NameAndType        #75:#76       // getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
   #74 = Utf8               ext/mods/gameserver/data/manager/AntiFeedManager
   #75 = Utf8               getInstance
   #76 = Utf8               ()Lext/mods/gameserver/data/manager/AntiFeedManager;
   #77 = Methodref          #72.#78       // ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
   #78 = NameAndType        #69:#79       // clear:(I)V
   #79 = Utf8               (I)V
   #80 = Methodref          #11.#81       // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;Z)Z
   #81 = NameAndType        #82:#83       // isRegistered:(Lext/mods/gameserver/model/actor/Player;Z)Z
   #82 = Utf8               isRegistered
   #83 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Z
   #84 = Methodref          #11.#85       // ext/mods/gameserver/model/olympiad/OlympiadManager.isInCompetition:(Lext/mods/gameserver/model/actor/Player;Z)Z
   #85 = NameAndType        #86:#83       // isInCompetition:(Lext/mods/gameserver/model/actor/Player;Z)Z
   #86 = Utf8               isInCompetition
   #87 = Methodref          #88.#89       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #88 = Class              #90           // ext/mods/gameserver/model/actor/Player
   #89 = NameAndType        #91:#28       // getObjectId:()I
   #90 = Utf8               ext/mods/gameserver/model/actor/Player
   #91 = Utf8               getObjectId
   #92 = Methodref          #93.#94       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #93 = Class              #95           // java/lang/Integer
   #94 = NameAndType        #96:#97       // valueOf:(I)Ljava/lang/Integer;
   #95 = Utf8               java/lang/Integer
   #96 = Utf8               valueOf
   #97 = Utf8               (I)Ljava/lang/Integer;
   #98 = InterfaceMethodref #24.#99       // java/util/List.contains:(Ljava/lang/Object;)Z
   #99 = NameAndType        #100:#66      // contains:(Ljava/lang/Object;)Z
  #100 = Utf8               contains
  #101 = Fieldref           #102.#103     // ext/mods/gameserver/network/SystemMessageId.YOU_ARE_ALREADY_ON_THE_WAITING_LIST_FOR_ALL_CLASSES_WAITING_TO_PARTICIPATE_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #102 = Class              #104          // ext/mods/gameserver/network/SystemMessageId
  #103 = NameAndType        #105:#106     // YOU_ARE_ALREADY_ON_THE_WAITING_LIST_FOR_ALL_CLASSES_WAITING_TO_PARTICIPATE_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #104 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #105 = Utf8               YOU_ARE_ALREADY_ON_THE_WAITING_LIST_FOR_ALL_CLASSES_WAITING_TO_PARTICIPATE_IN_THE_GAME
  #106 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #107 = Methodref          #108.#109     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #108 = Class              #110          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #109 = NameAndType        #111:#112     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #110 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #111 = Utf8               getSystemMessage
  #112 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #113 = Methodref          #88.#114      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #114 = NameAndType        #115:#116     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #115 = Utf8               sendPacket
  #116 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #117 = Methodref          #88.#118      // ext/mods/gameserver/model/actor/Player.getBaseClass:()I
  #118 = NameAndType        #119:#28      // getBaseClass:()I
  #119 = Utf8               getBaseClass
  #120 = InterfaceMethodref #36.#121      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #121 = NameAndType        #122:#123     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #122 = Utf8               get
  #123 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #124 = Fieldref           #102.#125     // ext/mods/gameserver/network/SystemMessageId.YOU_ARE_ALREADY_ON_THE_WAITING_LIST_TO_PARTICIPATE_IN_THE_GAME_FOR_YOUR_CLASS:Lext/mods/gameserver/network/SystemMessageId;
  #125 = NameAndType        #126:#106     // YOU_ARE_ALREADY_ON_THE_WAITING_LIST_TO_PARTICIPATE_IN_THE_GAME_FOR_YOUR_CLASS:Lext/mods/gameserver/network/SystemMessageId;
  #126 = Utf8               YOU_ARE_ALREADY_ON_THE_WAITING_LIST_TO_PARTICIPATE_IN_THE_GAME_FOR_YOUR_CLASS
  #127 = Methodref          #128.#129     // ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
  #128 = Class              #130          // ext/mods/gameserver/model/olympiad/Olympiad
  #129 = NameAndType        #75:#131      // getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
  #130 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad
  #131 = Utf8               ()Lext/mods/gameserver/model/olympiad/Olympiad;
  #132 = Methodref          #128.#133     // ext/mods/gameserver/model/olympiad/Olympiad.isInCompPeriod:()Z
  #133 = NameAndType        #134:#52      // isInCompPeriod:()Z
  #134 = Utf8               isInCompPeriod
  #135 = Methodref          #136.#137     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #136 = Class              #138          // ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #137 = NameAndType        #75:#139      // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #138 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #139 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #140 = Methodref          #136.#141     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getNumberOfStadiums:()I
  #141 = NameAndType        #142:#28      // getNumberOfStadiums:()I
  #142 = Utf8               getNumberOfStadiums
  #143 = Methodref          #136.#144     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getOlympiadTask:(I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #144 = NameAndType        #145:#146     // getOlympiadTask:(I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #145 = Utf8               getOlympiadTask
  #146 = Utf8               (I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #147 = Methodref          #148.#149     // ext/mods/gameserver/model/olympiad/OlympiadGameTask.getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #148 = Class              #150          // ext/mods/gameserver/model/olympiad/OlympiadGameTask
  #149 = NameAndType        #151:#152     // getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #150 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameTask
  #151 = Utf8               getGame
  #152 = Utf8               ()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #153 = Methodref          #154.#155     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.containsParticipant:(I)Z
  #154 = Class              #156          // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
  #155 = NameAndType        #157:#158     // containsParticipant:(I)Z
  #156 = Utf8               ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
  #157 = Utf8               containsParticipant
  #158 = Utf8               (I)Z
  #159 = Fieldref           #102.#160     // ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_ALREADY_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_AN_EVENT:Lext/mods/gameserver/network/SystemMessageId;
  #160 = NameAndType        #161:#106     // YOU_HAVE_ALREADY_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_AN_EVENT:Lext/mods/gameserver/network/SystemMessageId;
  #161 = Utf8               YOU_HAVE_ALREADY_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_AN_EVENT
  #162 = Methodref          #88.#163      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #163 = NameAndType        #115:#164     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #164 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #165 = Fieldref           #102.#166     // ext/mods/gameserver/network/SystemMessageId.THE_OLYMPIAD_GAME_IS_NOT_CURRENTLY_IN_PROGRESS:Lext/mods/gameserver/network/SystemMessageId;
  #166 = NameAndType        #167:#106     // THE_OLYMPIAD_GAME_IS_NOT_CURRENTLY_IN_PROGRESS:Lext/mods/gameserver/network/SystemMessageId;
  #167 = Utf8               THE_OLYMPIAD_GAME_IS_NOT_CURRENTLY_IN_PROGRESS
  #168 = Methodref          #128.#169     // ext/mods/gameserver/model/olympiad/Olympiad.getMillisToCompEnd:()J
  #169 = NameAndType        #170:#171     // getMillisToCompEnd:()J
  #170 = Utf8               getMillisToCompEnd
  #171 = Utf8               ()J
  #172 = Long               600000l
  #174 = Fieldref           #102.#175     // ext/mods/gameserver/network/SystemMessageId.GAME_REQUEST_CANNOT_BE_MADE:Lext/mods/gameserver/network/SystemMessageId;
  #175 = NameAndType        #176:#106     // GAME_REQUEST_CANNOT_BE_MADE:Lext/mods/gameserver/network/SystemMessageId;
  #176 = Utf8               GAME_REQUEST_CANNOT_BE_MADE
  #177 = Fieldref           #178.#179     // ext/mods/gameserver/model/olympiad/OlympiadManager$1.$SwitchMap$ext$mods$gameserver$enums$OlympiadType:[I
  #178 = Class              #180          // ext/mods/gameserver/model/olympiad/OlympiadManager$1
  #179 = NameAndType        #181:#182     // $SwitchMap$ext$mods$gameserver$enums$OlympiadType:[I
  #180 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager$1
  #181 = Utf8               $SwitchMap$ext$mods$gameserver$enums$OlympiadType
  #182 = Utf8               [I
  #183 = Methodref          #184.#185     // ext/mods/gameserver/enums/OlympiadType.ordinal:()I
  #184 = Class              #186          // ext/mods/gameserver/enums/OlympiadType
  #185 = NameAndType        #187:#28      // ordinal:()I
  #186 = Utf8               ext/mods/gameserver/enums/OlympiadType
  #187 = Utf8               ordinal
  #188 = Methodref          #11.#189      // ext/mods/gameserver/model/olympiad/OlympiadManager.checkNoble:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
  #189 = NameAndType        #190:#191     // checkNoble:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
  #190 = Utf8               checkNoble
  #191 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
  #192 = InvokeDynamic      #0:#193       // #0:apply:()Ljava/util/function/Function;
  #193 = NameAndType        #194:#195     // apply:()Ljava/util/function/Function;
  #194 = Utf8               apply
  #195 = Utf8               ()Ljava/util/function/Function;
  #196 = InterfaceMethodref #36.#197      // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #197 = NameAndType        #198:#199     // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #198 = Utf8               computeIfAbsent
  #199 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #200 = Fieldref           #102.#201     // ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_CLASSIFIED_GAMES:Lext/mods/gameserver/network/SystemMessageId;
  #201 = NameAndType        #202:#106     // YOU_HAVE_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_CLASSIFIED_GAMES:Lext/mods/gameserver/network/SystemMessageId;
  #202 = Utf8               YOU_HAVE_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_CLASSIFIED_GAMES
  #203 = Fieldref           #102.#204     // ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_NO_CLASS_GAMES:Lext/mods/gameserver/network/SystemMessageId;
  #204 = NameAndType        #205:#106     // YOU_HAVE_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_NO_CLASS_GAMES:Lext/mods/gameserver/network/SystemMessageId;
  #205 = Utf8               YOU_HAVE_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_NO_CLASS_GAMES
  #206 = Methodref          #88.#207      // ext/mods/gameserver/model/actor/Player.isNoble:()Z
  #207 = NameAndType        #208:#52      // isNoble:()Z
  #208 = Utf8               isNoble
  #209 = Fieldref           #102.#210     // ext/mods/gameserver/network/SystemMessageId.NOBLESSE_ONLY:Lext/mods/gameserver/network/SystemMessageId;
  #210 = NameAndType        #211:#106     // NOBLESSE_ONLY:Lext/mods/gameserver/network/SystemMessageId;
  #211 = Utf8               NOBLESSE_ONLY
  #212 = Fieldref           #102.#213     // ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_NOT_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_A_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #213 = NameAndType        #214:#106     // YOU_HAVE_NOT_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_A_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #214 = Utf8               YOU_HAVE_NOT_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_A_GAME
  #215 = InterfaceMethodref #24.#216      // java/util/List.remove:(Ljava/lang/Object;)Z
  #216 = NameAndType        #217:#66      // remove:(Ljava/lang/Object;)Z
  #217 = Utf8               remove
  #218 = Fieldref           #30.#219      // ext/mods/Config.DUALBOX_CHECK_MAX_OLYMPIAD_PARTICIPANTS_PER_IP:I
  #219 = NameAndType        #220:#34      // DUALBOX_CHECK_MAX_OLYMPIAD_PARTICIPANTS_PER_IP:I
  #220 = Utf8               DUALBOX_CHECK_MAX_OLYMPIAD_PARTICIPANTS_PER_IP
  #221 = Methodref          #72.#222      // ext/mods/gameserver/data/manager/AntiFeedManager.removePlayer:(ILext/mods/gameserver/model/actor/Player;)Z
  #222 = NameAndType        #223:#224     // removePlayer:(ILext/mods/gameserver/model/actor/Player;)Z
  #223 = Utf8               removePlayer
  #224 = Utf8               (ILext/mods/gameserver/model/actor/Player;)Z
  #225 = Fieldref           #102.#226     // ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_BEEN_DELETED_FROM_THE_WAITING_LIST_OF_A_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #226 = NameAndType        #227:#106     // YOU_HAVE_BEEN_DELETED_FROM_THE_WAITING_LIST_OF_A_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #227 = Utf8               YOU_HAVE_BEEN_DELETED_FROM_THE_WAITING_LIST_OF_A_GAME
  #228 = Methodref          #88.#229      // ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
  #229 = NameAndType        #230:#28      // getOlympiadGameId:()I
  #230 = Utf8               getOlympiadGameId
  #231 = Methodref          #232.#233     // ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
  #232 = Class              #234          // ext/mods/Safedisconect/SafeDisconnectManager
  #233 = NameAndType        #75:#235      // getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
  #234 = Utf8               ext/mods/Safedisconect/SafeDisconnectManager
  #235 = Utf8               ()Lext/mods/Safedisconect/SafeDisconnectManager;
  #236 = Methodref          #232.#237     // ext/mods/Safedisconect/SafeDisconnectManager.isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
  #237 = NameAndType        #238:#239     // isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
  #238 = Utf8               isSafeDisconnectActive
  #239 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #240 = Fieldref           #30.#241      // ext/mods/Config.SAFEDISCONNECT_INTEGRATION_OLYMPIAD:Z
  #241 = NameAndType        #242:#243     // SAFEDISCONNECT_INTEGRATION_OLYMPIAD:Z
  #242 = Utf8               SAFEDISCONNECT_INTEGRATION_OLYMPIAD
  #243 = Utf8               Z
  #244 = Methodref          #148.#245     // ext/mods/gameserver/model/olympiad/OlympiadGameTask.isGameStarted:()Z
  #245 = NameAndType        #246:#52      // isGameStarted:()Z
  #246 = Utf8               isGameStarted
  #247 = Methodref          #148.#248     // ext/mods/gameserver/model/olympiad/OlympiadGameTask.pauseForDisconnect:(Lext/mods/gameserver/model/actor/Player;)V
  #248 = NameAndType        #249:#250     // pauseForDisconnect:(Lext/mods/gameserver/model/actor/Player;)V
  #249 = Utf8               pauseForDisconnect
  #250 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #251 = Methodref          #154.#252     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.handleDisconnect:(Lext/mods/gameserver/model/actor/Player;)V
  #252 = NameAndType        #253:#250     // handleDisconnect:(Lext/mods/gameserver/model/actor/Player;)V
  #253 = Utf8               handleDisconnect
  #254 = Fieldref           #102.#255     // ext/mods/gameserver/network/SystemMessageId.ONLY_NOBLESS_CAN_PARTICIPATE_IN_THE_OLYMPIAD:Lext/mods/gameserver/network/SystemMessageId;
  #255 = NameAndType        #256:#106     // ONLY_NOBLESS_CAN_PARTICIPATE_IN_THE_OLYMPIAD:Lext/mods/gameserver/network/SystemMessageId;
  #256 = Utf8               ONLY_NOBLESS_CAN_PARTICIPATE_IN_THE_OLYMPIAD
  #257 = Methodref          #88.#258      // ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
  #258 = NameAndType        #259:#52      // isSubClassActive:()Z
  #259 = Utf8               isSubClassActive
  #260 = Fieldref           #102.#261     // ext/mods/gameserver/network/SystemMessageId.YOU_CANT_JOIN_THE_OLYMPIAD_WITH_A_SUB_JOB_CHARACTER:Lext/mods/gameserver/network/SystemMessageId;
  #261 = NameAndType        #262:#106     // YOU_CANT_JOIN_THE_OLYMPIAD_WITH_A_SUB_JOB_CHARACTER:Lext/mods/gameserver/network/SystemMessageId;
  #262 = Utf8               YOU_CANT_JOIN_THE_OLYMPIAD_WITH_A_SUB_JOB_CHARACTER
  #263 = Methodref          #88.#264      // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #264 = NameAndType        #265:#52      // isCursedWeaponEquipped:()Z
  #265 = Utf8               isCursedWeaponEquipped
  #266 = Fieldref           #102.#267     // ext/mods/gameserver/network/SystemMessageId.CANNOT_JOIN_OLYMPIAD_POSSESSING_S1:Lext/mods/gameserver/network/SystemMessageId;
  #267 = NameAndType        #268:#106     // CANNOT_JOIN_OLYMPIAD_POSSESSING_S1:Lext/mods/gameserver/network/SystemMessageId;
  #268 = Utf8               CANNOT_JOIN_OLYMPIAD_POSSESSING_S1
  #269 = Methodref          #88.#270      // ext/mods/gameserver/model/actor/Player.getCursedWeaponEquippedId:()I
  #270 = NameAndType        #271:#28      // getCursedWeaponEquippedId:()I
  #271 = Utf8               getCursedWeaponEquippedId
  #272 = Methodref          #108.#273     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #273 = NameAndType        #274:#275     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #274 = Utf8               addItemName
  #275 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #276 = Methodref          #88.#277      // ext/mods/gameserver/model/actor/Player.isOverweight:()Z
  #277 = NameAndType        #278:#52      // isOverweight:()Z
  #278 = Utf8               isOverweight
  #279 = Fieldref           #102.#280     // ext/mods/gameserver/network/SystemMessageId.SINCE_80_PERCENT_OR_MORE_OF_YOUR_INVENTORY_SLOTS_ARE_FULL_YOU_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD:Lext/mods/gameserver/network/SystemMessageId;
  #280 = NameAndType        #281:#106     // SINCE_80_PERCENT_OR_MORE_OF_YOUR_INVENTORY_SLOTS_ARE_FULL_YOU_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD:Lext/mods/gameserver/network/SystemMessageId;
  #281 = Utf8               SINCE_80_PERCENT_OR_MORE_OF_YOUR_INVENTORY_SLOTS_ARE_FULL_YOU_CANNOT_PARTICIPATE_IN_THE_OLYMPIAD
  #282 = Methodref          #283.#284     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #283 = Class              #285          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #284 = NameAndType        #75:#286      // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #285 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #286 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #287 = Methodref          #283.#288     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
  #288 = NameAndType        #289:#158     // isPlayerParticipant:(I)Z
  #289 = Utf8               isPlayerParticipant
  #290 = Methodref          #291.#292     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #291 = Class              #293          // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #292 = NameAndType        #75:#294      // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #293 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #294 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #295 = Methodref          #291.#288     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
  #296 = Methodref          #297.#298     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #297 = Class              #299          // ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #298 = NameAndType        #75:#300      // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #299 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #300 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #301 = Methodref          #297.#288     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
  #302 = Methodref          #303.#304     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #303 = Class              #305          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #304 = NameAndType        #75:#306      // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #305 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #306 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #307 = Methodref          #303.#288     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
  #308 = Methodref          #88.#309      // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #309 = NameAndType        #310:#311     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #310 = Utf8               getSysString
  #311 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #312 = Methodref          #88.#313      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #313 = NameAndType        #314:#315     // sendMessage:(Ljava/lang/String;)V
  #314 = Utf8               sendMessage
  #315 = Utf8               (Ljava/lang/String;)V
  #316 = Methodref          #128.#317     // ext/mods/gameserver/model/olympiad/Olympiad.getNobleStats:(I)Lext/mods/commons/data/StatSet;
  #317 = NameAndType        #318:#319     // getNobleStats:(I)Lext/mods/commons/data/StatSet;
  #318 = Utf8               getNobleStats
  #319 = Utf8               (I)Lext/mods/commons/data/StatSet;
  #320 = Class              #321          // ext/mods/commons/data/StatSet
  #321 = Utf8               ext/mods/commons/data/StatSet
  #322 = Methodref          #320.#3       // ext/mods/commons/data/StatSet."<init>":()V
  #323 = String             #324          // class_id
  #324 = Utf8               class_id
  #325 = Methodref          #320.#326     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
  #326 = NameAndType        #327:#328     // set:(Ljava/lang/String;I)V
  #327 = Utf8               set
  #328 = Utf8               (Ljava/lang/String;I)V
  #329 = String             #330          // char_name
  #330 = Utf8               char_name
  #331 = Methodref          #88.#332      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #332 = NameAndType        #333:#334     // getName:()Ljava/lang/String;
  #333 = Utf8               getName
  #334 = Utf8               ()Ljava/lang/String;
  #335 = Methodref          #320.#336     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
  #336 = NameAndType        #327:#337     // set:(Ljava/lang/String;Ljava/lang/String;)V
  #337 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #338 = String             #339          // olympiad_points
  #339 = Utf8               olympiad_points
  #340 = Fieldref           #30.#341      // ext/mods/Config.OLY_START_POINTS:I
  #341 = NameAndType        #342:#34      // OLY_START_POINTS:I
  #342 = Utf8               OLY_START_POINTS
  #343 = String             #344          // competitions_done
  #344 = Utf8               competitions_done
  #345 = String             #346          // competitions_won
  #346 = Utf8               competitions_won
  #347 = String             #348          // competitions_lost
  #348 = Utf8               competitions_lost
  #349 = String             #350          // competitions_drawn
  #350 = Utf8               competitions_drawn
  #351 = Methodref          #128.#352     // ext/mods/gameserver/model/olympiad/Olympiad.addNobleStats:(ILext/mods/commons/data/StatSet;)Lext/mods/commons/data/StatSet;
  #352 = NameAndType        #353:#354     // addNobleStats:(ILext/mods/commons/data/StatSet;)Lext/mods/commons/data/StatSet;
  #353 = Utf8               addNobleStats
  #354 = Utf8               (ILext/mods/commons/data/StatSet;)Lext/mods/commons/data/StatSet;
  #355 = Methodref          #128.#356     // ext/mods/gameserver/model/olympiad/Olympiad.getNoblePoints:(I)I
  #356 = NameAndType        #357:#358     // getNoblePoints:(I)I
  #357 = Utf8               getNoblePoints
  #358 = Utf8               (I)I
  #359 = Class              #360          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #360 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #361 = Methodref          #362.#89      // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
  #362 = Class              #363          // ext/mods/gameserver/model/actor/Npc
  #363 = Utf8               ext/mods/gameserver/model/actor/Npc
  #364 = Methodref          #359.#365     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #365 = NameAndType        #5:#79        // "<init>":(I)V
  #366 = Methodref          #88.#367      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #367 = NameAndType        #368:#369     // getLocale:()Ljava/util/Locale;
  #368 = Utf8               getLocale
  #369 = Utf8               ()Ljava/util/Locale;
  #370 = String             #371          // html/olympiad/noble_nopoints1.htm
  #371 = Utf8               html/olympiad/noble_nopoints1.htm
  #372 = Methodref          #359.#373     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #373 = NameAndType        #374:#375     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #374 = Utf8               setFile
  #375 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #376 = String             #377          // %objectId%
  #377 = Utf8               %objectId%
  #378 = Methodref          #359.#379     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #379 = NameAndType        #380:#328     // replace:(Ljava/lang/String;I)V
  #380 = Utf8               replace
  #381 = Methodref          #72.#382      // ext/mods/gameserver/data/manager/AntiFeedManager.tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
  #382 = NameAndType        #383:#384     // tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
  #383 = Utf8               tryAddPlayer
  #384 = Utf8               (ILext/mods/gameserver/model/actor/Player;I)Z
  #385 = String             #386          // html/mods/OlympiadIPRestriction.htm
  #386 = Utf8               html/mods/OlympiadIPRestriction.htm
  #387 = String             #388          // %max%
  #388 = Utf8               %max%
  #389 = Methodref          #72.#390      // ext/mods/gameserver/data/manager/AntiFeedManager.getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
  #390 = NameAndType        #391:#392     // getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
  #391 = Utf8               getLimit
  #392 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)I
  #393 = Methodref          #394.#395     // java/lang/String.valueOf:(I)Ljava/lang/String;
  #394 = Class              #396          // java/lang/String
  #395 = NameAndType        #96:#397      // valueOf:(I)Ljava/lang/String;
  #396 = Utf8               java/lang/String
  #397 = Utf8               (I)Ljava/lang/String;
  #398 = Methodref          #359.#399     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #399 = NameAndType        #380:#337     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #400 = Fieldref           #401.#402     // ext/mods/gameserver/model/olympiad/OlympiadManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #401 = Class              #403          // ext/mods/gameserver/model/olympiad/OlympiadManager$SingletonHolder
  #402 = NameAndType        #404:#405     // INSTANCE:Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #403 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager$SingletonHolder
  #404 = Utf8               INSTANCE
  #405 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #406 = Utf8               Signature
  #407 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #408 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;
  #409 = Utf8               Code
  #410 = Utf8               LineNumberTable
  #411 = Utf8               LocalVariableTable
  #412 = Utf8               this
  #413 = Utf8               getNonClassBasedParticipants
  #414 = Utf8               ()Ljava/util/List;
  #415 = Utf8               ()Ljava/util/List<Ljava/lang/Integer;>;
  #416 = Utf8               getClassBasedParticipants
  #417 = Utf8               ()Ljava/util/Map;
  #418 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;
  #419 = Utf8               hasEnoughNonClassBasedParticipants
  #420 = Utf8               StackMapTable
  #421 = Utf8               hasEnoughClassBasedParticipants
  #422 = Utf8               classList
  #423 = Utf8               result
  #424 = Utf8               LocalVariableTypeTable
  #425 = Utf8               Ljava/util/List<Ljava/util/List<Ljava/lang/Integer;>;>;
  #426 = Utf8               ()Ljava/util/List<Ljava/util/List<Ljava/lang/Integer;>;>;
  #427 = Utf8               clearParticipants
  #428 = Utf8               isRegisteredInComp
  #429 = Utf8               noble
  #430 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #431 = Utf8               player
  #432 = Utf8               showMessage
  #433 = Utf8               objId
  #434 = Utf8               Ljava/lang/Integer;
  #435 = Utf8               classed
  #436 = Utf8               game
  #437 = Utf8               Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #438 = Utf8               i
  #439 = Utf8               registerNoble
  #440 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/OlympiadType;)Z
  #441 = Utf8               npc
  #442 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #443 = Utf8               type
  #444 = Utf8               Lext/mods/gameserver/enums/OlympiadType;
  #445 = Utf8               unRegisterNoble
  #446 = Utf8               objectId
  #447 = Utf8               removeDisconnectedCompetitor
  #448 = Utf8               task
  #449 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #450 = Utf8               html
  #451 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #452 = Utf8               charId
  #453 = Utf8               Lext/mods/commons/data/StatSet;
  #454 = Utf8               points
  #455 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #456 = Utf8               lambda$registerNoble$0
  #457 = Utf8               (Ljava/lang/Integer;)Ljava/util/List;
  #458 = Utf8               c
  #459 = Utf8               SourceFile
  #460 = Utf8               OlympiadManager.java
  #461 = Utf8               NestMembers
  #462 = Utf8               BootstrapMethods
  #463 = MethodType         #123          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #464 = MethodHandle       6:#465        // REF_invokeStatic ext/mods/gameserver/model/olympiad/OlympiadManager.lambda$registerNoble$0:(Ljava/lang/Integer;)Ljava/util/List;
  #465 = Methodref          #11.#466      // ext/mods/gameserver/model/olympiad/OlympiadManager.lambda$registerNoble$0:(Ljava/lang/Integer;)Ljava/util/List;
  #466 = NameAndType        #456:#457     // lambda$registerNoble$0:(Ljava/lang/Integer;)Ljava/util/List;
  #467 = MethodType         #457          //  (Ljava/lang/Integer;)Ljava/util/List;
  #468 = MethodHandle       6:#469        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #469 = Methodref          #470.#471     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #470 = Class              #472          // java/lang/invoke/LambdaMetafactory
  #471 = NameAndType        #473:#474     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #472 = Utf8               java/lang/invoke/LambdaMetafactory
  #473 = Utf8               metafactory
  #474 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #475 = Utf8               InnerClasses
  #476 = Utf8               SingletonHolder
  #477 = Class              #478          // java/lang/invoke/MethodHandles$Lookup
  #478 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #479 = Class              #480          // java/lang/invoke/MethodHandles
  #480 = Utf8               java/lang/invoke/MethodHandles
  #481 = Utf8               Lookup
{
  protected ext.mods.gameserver.model.olympiad.OlympiadManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/CopyOnWriteArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
        12: putfield      #10                 // Field _nonClassBasedParticipants:Ljava/util/List;
        15: aload_0
        16: new           #16                 // class java/util/concurrent/ConcurrentHashMap
        19: dup
        20: invokespecial #18                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        23: putfield      #19                 // Field _classBasedParticipants:Ljava/util/Map;
        26: return
      LineNumberTable:
        line 48: 0
        line 44: 4
        line 45: 15
        line 49: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/olympiad/OlympiadManager;

  public final java.util.List<java.lang.Integer> getNonClassBasedParticipants();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _nonClassBasedParticipants:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/OlympiadManager;
    Signature: #415                         // ()Ljava/util/List<Ljava/lang/Integer;>;

  public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> getClassBasedParticipants();
    descriptor: ()Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _classBasedParticipants:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/OlympiadManager;
    Signature: #418                         // ()Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;

  protected final boolean hasEnoughNonClassBasedParticipants();
    descriptor: ()Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _nonClassBasedParticipants:Ljava/util/List;
         4: invokeinterface #23,  1           // InterfaceMethod java/util/List.size:()I
         9: getstatic     #29                 // Field ext/mods/Config.OLY_NONCLASSED:I
        12: if_icmplt     19
        15: iconst_1
        16: goto          20
        19: iconst_0
        20: ireturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/olympiad/OlympiadManager;
      StackMapTable: number_of_entries = 2
        frame_type = 19 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected final java.util.List<java.util.List<java.lang.Integer>> hasEnoughClassBasedParticipants();
    descriptor: ()Ljava/util/List;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=1
         0: aconst_null
         1: astore_1
         2: aload_0
         3: getfield      #19                 // Field _classBasedParticipants:Ljava/util/Map;
         6: invokeinterface #35,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        11: invokeinterface #41,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        16: astore_2
        17: aload_2
        18: invokeinterface #47,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        23: ifeq          75
        26: aload_2
        27: invokeinterface #53,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        32: checkcast     #24                 // class java/util/List
        35: astore_3
        36: aload_3
        37: ifnull        72
        40: aload_3
        41: invokeinterface #23,  1           // InterfaceMethod java/util/List.size:()I
        46: getstatic     #57                 // Field ext/mods/Config.OLY_CLASSED:I
        49: if_icmplt     72
        52: aload_1
        53: ifnonnull     64
        56: new           #60                 // class java/util/ArrayList
        59: dup
        60: invokespecial #62                 // Method java/util/ArrayList."<init>":()V
        63: astore_1
        64: aload_1
        65: aload_3
        66: invokeinterface #63,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        71: pop
        72: goto          17
        75: aload_1
        76: areturn
      LineNumberTable:
        line 68: 0
        line 69: 2
        line 71: 36
        line 73: 52
        line 74: 56
        line 76: 64
        line 78: 72
        line 79: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36      36     3 classList   Ljava/util/List;
            0      77     0  this   Lext/mods/gameserver/model/olympiad/OlympiadManager;
            2      75     1 result   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           36      36     3 classList   Ljava/util/List<Ljava/lang/Integer;>;
            2      75     1 result   Ljava/util/List<Ljava/util/List<Ljava/lang/Integer;>;>;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ class java/util/List ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #426                         // ()Ljava/util/List<Ljava/util/List<Ljava/lang/Integer;>;>;

  protected final void clearParticipants();
    descriptor: ()V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _nonClassBasedParticipants:Ljava/util/List;
         4: invokeinterface #67,  1           // InterfaceMethod java/util/List.clear:()V
         9: aload_0
        10: getfield      #19                 // Field _classBasedParticipants:Ljava/util/Map;
        13: invokeinterface #70,  1           // InterfaceMethod java/util/Map.clear:()V
        18: invokestatic  #71                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
        21: iconst_1
        22: invokevirtual #77                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
        25: return
      LineNumberTable:
        line 84: 0
        line 85: 9
        line 86: 18
        line 87: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/olympiad/OlympiadManager;

  public final boolean isRegisteredInComp(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: invokevirtual #80                 // Method isRegistered:(Lext/mods/gameserver/model/actor/Player;Z)Z
         6: ifne          17
         9: aload_1
        10: iconst_0
        11: invokestatic  #84                 // Method isInCompetition:(Lext/mods/gameserver/model/actor/Player;Z)Z
        14: ifeq          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/olympiad/OlympiadManager;
            0      23     1 noble   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isRegistered(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: invokevirtual #80                 // Method isRegistered:(Lext/mods/gameserver/model/actor/Player;Z)Z
         6: ireturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/olympiad/OlympiadManager;
            0       7     1 player   Lext/mods/gameserver/model/actor/Player;

  public final boolean registerNoble(ext.mods.gameserver.model.actor.Npc, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.enums.OlympiadType);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/OlympiadType;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=4
         0: invokestatic  #127                // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
         3: invokevirtual #132                // Method ext/mods/gameserver/model/olympiad/Olympiad.isInCompPeriod:()Z
         6: ifne          18
         9: aload_2
        10: getstatic     #165                // Field ext/mods/gameserver/network/SystemMessageId.THE_OLYMPIAD_GAME_IS_NOT_CURRENTLY_IN_PROGRESS:Lext/mods/gameserver/network/SystemMessageId;
        13: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        16: iconst_0
        17: ireturn
        18: invokestatic  #127                // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
        21: invokevirtual #168                // Method ext/mods/gameserver/model/olympiad/Olympiad.getMillisToCompEnd:()J
        24: ldc2_w        #172                // long 600000l
        27: lcmp
        28: ifge          40
        31: aload_2
        32: getstatic     #174                // Field ext/mods/gameserver/network/SystemMessageId.GAME_REQUEST_CANNOT_BE_MADE:Lext/mods/gameserver/network/SystemMessageId;
        35: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        38: iconst_0
        39: ireturn
        40: getstatic     #177                // Field ext/mods/gameserver/model/olympiad/OlympiadManager$1.$SwitchMap$ext$mods$gameserver$enums$OlympiadType:[I
        43: aload_3
        44: invokevirtual #183                // Method ext/mods/gameserver/enums/OlympiadType.ordinal:()I
        47: iaload
        48: lookupswitch  { // 2

                       1: 76

                       2: 138
                 default: 173
            }
        76: aload_0
        77: aload_1
        78: aload_2
        79: invokevirtual #188                // Method checkNoble:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
        82: ifne          87
        85: iconst_0
        86: ireturn
        87: aload_0
        88: getfield      #19                 // Field _classBasedParticipants:Ljava/util/Map;
        91: aload_2
        92: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.getBaseClass:()I
        95: invokestatic  #92                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        98: invokedynamic #192,  0            // InvokeDynamic #0:apply:()Ljava/util/function/Function;
       103: invokeinterface #196,  3          // InterfaceMethod java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
       108: checkcast     #24                 // class java/util/List
       111: astore        4
       113: aload         4
       115: aload_2
       116: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       119: invokestatic  #92                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       122: invokeinterface #63,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       127: pop
       128: aload_2
       129: getstatic     #200                // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_CLASSIFIED_GAMES:Lext/mods/gameserver/network/SystemMessageId;
       132: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       135: goto          173
       138: aload_0
       139: aload_1
       140: aload_2
       141: invokevirtual #188                // Method checkNoble:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
       144: ifne          149
       147: iconst_0
       148: ireturn
       149: aload_0
       150: getfield      #10                 // Field _nonClassBasedParticipants:Ljava/util/List;
       153: aload_2
       154: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       157: invokestatic  #92                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       160: invokeinterface #63,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       165: pop
       166: aload_2
       167: getstatic     #203                // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_NO_CLASS_GAMES:Lext/mods/gameserver/network/SystemMessageId;
       170: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       173: iconst_1
       174: ireturn
      LineNumberTable:
        line 148: 0
        line 150: 9
        line 151: 16
        line 154: 18
        line 156: 31
        line 157: 38
        line 160: 40
        line 163: 76
        line 164: 85
        line 166: 87
        line 167: 113
        line 169: 128
        line 170: 135
        line 173: 138
        line 174: 147
        line 176: 149
        line 177: 166
        line 180: 173
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          113      25     4 classed   Ljava/util/List;
            0     175     0  this   Lext/mods/gameserver/model/olympiad/OlympiadManager;
            0     175     1   npc   Lext/mods/gameserver/model/actor/Npc;
            0     175     2 player   Lext/mods/gameserver/model/actor/Player;
            0     175     3  type   Lext/mods/gameserver/enums/OlympiadType;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          113      25     4 classed   Ljava/util/List<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 7
        frame_type = 18 /* same */
        frame_type = 21 /* same */
        frame_type = 35 /* same */
        frame_type = 10 /* same */
        frame_type = 50 /* same */
        frame_type = 10 /* same */
        frame_type = 23 /* same */

  public final boolean unRegisterNoble(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=2
         0: invokestatic  #127                // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
         3: invokevirtual #132                // Method ext/mods/gameserver/model/olympiad/Olympiad.isInCompPeriod:()Z
         6: ifne          18
         9: aload_1
        10: getstatic     #165                // Field ext/mods/gameserver/network/SystemMessageId.THE_OLYMPIAD_GAME_IS_NOT_CURRENTLY_IN_PROGRESS:Lext/mods/gameserver/network/SystemMessageId;
        13: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        16: iconst_0
        17: ireturn
        18: aload_1
        19: invokevirtual #206                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
        22: ifne          34
        25: aload_1
        26: getstatic     #209                // Field ext/mods/gameserver/network/SystemMessageId.NOBLESSE_ONLY:Lext/mods/gameserver/network/SystemMessageId;
        29: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        32: iconst_0
        33: ireturn
        34: aload_0
        35: aload_1
        36: iconst_0
        37: invokevirtual #80                 // Method isRegistered:(Lext/mods/gameserver/model/actor/Player;Z)Z
        40: ifne          52
        43: aload_1
        44: getstatic     #212                // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_NOT_BEEN_REGISTERED_IN_A_WAITING_LIST_OF_A_GAME:Lext/mods/gameserver/network/SystemMessageId;
        47: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        50: iconst_0
        51: ireturn
        52: aload_1
        53: iconst_0
        54: invokestatic  #84                 // Method isInCompetition:(Lext/mods/gameserver/model/actor/Player;Z)Z
        57: ifeq          62
        60: iconst_0
        61: ireturn
        62: aload_1
        63: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        66: invokestatic  #92                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        69: astore_2
        70: aload_0
        71: getfield      #10                 // Field _nonClassBasedParticipants:Ljava/util/List;
        74: aload_2
        75: invokeinterface #215,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        80: ifeq          107
        83: getstatic     #218                // Field ext/mods/Config.DUALBOX_CHECK_MAX_OLYMPIAD_PARTICIPANTS_PER_IP:I
        86: ifle          98
        89: invokestatic  #71                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
        92: iconst_1
        93: aload_1
        94: invokevirtual #221                // Method ext/mods/gameserver/data/manager/AntiFeedManager.removePlayer:(ILext/mods/gameserver/model/actor/Player;)Z
        97: pop
        98: aload_1
        99: getstatic     #225                // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_BEEN_DELETED_FROM_THE_WAITING_LIST_OF_A_GAME:Lext/mods/gameserver/network/SystemMessageId;
       102: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       105: iconst_1
       106: ireturn
       107: aload_0
       108: getfield      #19                 // Field _classBasedParticipants:Ljava/util/Map;
       111: aload_1
       112: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.getBaseClass:()I
       115: invokestatic  #92                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       118: invokeinterface #120,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       123: checkcast     #24                 // class java/util/List
       126: astore_3
       127: aload_3
       128: ifnull        165
       131: aload_3
       132: aload_2
       133: invokeinterface #215,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
       138: ifeq          165
       141: getstatic     #218                // Field ext/mods/Config.DUALBOX_CHECK_MAX_OLYMPIAD_PARTICIPANTS_PER_IP:I
       144: ifle          156
       147: invokestatic  #71                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       150: iconst_1
       151: aload_1
       152: invokevirtual #221                // Method ext/mods/gameserver/data/manager/AntiFeedManager.removePlayer:(ILext/mods/gameserver/model/actor/Player;)Z
       155: pop
       156: aload_1
       157: getstatic     #225                // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_BEEN_DELETED_FROM_THE_WAITING_LIST_OF_A_GAME:Lext/mods/gameserver/network/SystemMessageId;
       160: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       163: iconst_1
       164: ireturn
       165: iconst_0
       166: ireturn
      LineNumberTable:
        line 185: 0
        line 187: 9
        line 188: 16
        line 191: 18
        line 193: 25
        line 194: 32
        line 197: 34
        line 199: 43
        line 200: 50
        line 203: 52
        line 204: 60
        line 206: 62
        line 207: 70
        line 209: 83
        line 210: 89
        line 212: 98
        line 213: 105
        line 216: 107
        line 217: 127
        line 219: 141
        line 220: 147
        line 222: 156
        line 223: 163
        line 226: 165
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     167     0  this   Lext/mods/gameserver/model/olympiad/OlympiadManager;
            0     167     1 player   Lext/mods/gameserver/model/actor/Player;
           70      97     2 objectId   Ljava/lang/Integer;
          127      40     3 classed   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          127      40     3 classed   Ljava/util/List<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 8
        frame_type = 18 /* same */
        frame_type = 15 /* same */
        frame_type = 17 /* same */
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class java/lang/Integer ]
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ class java/util/List ]
        frame_type = 8 /* same */

  public final void removeDisconnectedCompetitor(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=5, args_size=2
         0: invokestatic  #135                // Method ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
         3: aload_1
         4: invokevirtual #228                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
         7: invokevirtual #143                // Method ext/mods/gameserver/model/olympiad/OlympiadGameManager.getOlympiadTask:(I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
        10: astore_2
        11: invokestatic  #231                // Method ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
        14: aload_1
        15: invokevirtual #236                // Method ext/mods/Safedisconect/SafeDisconnectManager.isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
        18: ifeq          44
        21: getstatic     #240                // Field ext/mods/Config.SAFEDISCONNECT_INTEGRATION_OLYMPIAD:Z
        24: ifeq          44
        27: aload_2
        28: ifnull        43
        31: aload_2
        32: invokevirtual #244                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.isGameStarted:()Z
        35: ifeq          43
        38: aload_2
        39: aload_1
        40: invokevirtual #247                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.pauseForDisconnect:(Lext/mods/gameserver/model/actor/Player;)V
        43: return
        44: aload_2
        45: ifnull        63
        48: aload_2
        49: invokevirtual #244                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.isGameStarted:()Z
        52: ifeq          63
        55: aload_2
        56: invokevirtual #147                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
        59: aload_1
        60: invokevirtual #251                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.handleDisconnect:(Lext/mods/gameserver/model/actor/Player;)V
        63: aload_1
        64: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        67: invokestatic  #92                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        70: astore_3
        71: aload_0
        72: getfield      #10                 // Field _nonClassBasedParticipants:Ljava/util/List;
        75: aload_3
        76: invokeinterface #215,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        81: ifeq          85
        84: return
        85: aload_0
        86: getfield      #19                 // Field _classBasedParticipants:Ljava/util/Map;
        89: aload_1
        90: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.getBaseClass:()I
        93: invokestatic  #92                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        96: invokeinterface #120,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       101: checkcast     #24                 // class java/util/List
       104: astore        4
       106: aload         4
       108: ifnull        120
       111: aload         4
       113: aload_3
       114: invokeinterface #215,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
       119: pop
       120: return
      LineNumberTable:
        line 231: 0
        line 232: 11
        line 234: 27
        line 235: 38
        line 236: 43
        line 239: 44
        line 240: 55
        line 242: 63
        line 243: 71
        line 244: 84
        line 246: 85
        line 247: 106
        line 248: 111
        line 249: 120
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     121     0  this   Lext/mods/gameserver/model/olympiad/OlympiadManager;
            0     121     1 player   Lext/mods/gameserver/model/actor/Player;
           11     110     2  task   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
           71      50     3 objId   Ljava/lang/Integer;
          106      15     4 classed   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          106      15     4 classed   Ljava/util/List<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/olympiad/OlympiadGameTask ]
        frame_type = 0 /* same */
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/lang/Integer ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class java/util/List ]

  public static final ext.mods.gameserver.model.olympiad.OlympiadManager getInstance();
    descriptor: ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #400                // Field ext/mods/gameserver/model/olympiad/OlympiadManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/olympiad/OlympiadManager;
         3: areturn
      LineNumberTable:
        line 334: 0
}
SourceFile: "OlympiadManager.java"
NestMembers:
  ext/mods/gameserver/model/olympiad/OlympiadManager$1
  ext/mods/gameserver/model/olympiad/OlympiadManager$SingletonHolder
BootstrapMethods:
  0: #468 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #463 (Ljava/lang/Object;)Ljava/lang/Object;
      #464 REF_invokeStatic ext/mods/gameserver/model/olympiad/OlympiadManager.lambda$registerNoble$0:(Ljava/lang/Integer;)Ljava/util/List;
      #467 (Ljava/lang/Integer;)Ljava/util/List;
InnerClasses:
  static #178;                            // class ext/mods/gameserver/model/olympiad/OlympiadManager$1
  public static final #481= #477 of #479; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
