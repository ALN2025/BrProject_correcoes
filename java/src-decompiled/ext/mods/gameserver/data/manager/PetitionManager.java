// Bytecode for: ext.mods.gameserver.data.manager.PetitionManager
// File: ext\mods\gameserver\data\manager\PetitionManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/PetitionManager.class
  Last modified 9 de jul de 2026; size 15069 bytes
  MD5 checksum 1d3a22e3df180e1f39d899be5caee07c
  Compiled from "PetitionManager.java"
public final class ext.mods.gameserver.data.manager.PetitionManager
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/PetitionManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 30, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentSkipListMap
    #8 = Utf8               java/util/concurrent/ConcurrentSkipListMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentSkipListMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/PetitionManager._petitions:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/PetitionManager
   #12 = NameAndType        #14:#15       // _petitions:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/PetitionManager
   #14 = Utf8               _petitions
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #17.#18       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #17 = Class              #19           // ext/mods/commons/pool/ConnectionPool
   #18 = NameAndType        #20:#21       // getConnection:()Ljava/sql/Connection;
   #19 = Utf8               ext/mods/commons/pool/ConnectionPool
   #20 = Utf8               getConnection
   #21 = Utf8               ()Ljava/sql/Connection;
   #22 = String             #23           // SELECT * FROM petition ORDER BY oid ASC
   #23 = Utf8               SELECT * FROM petition ORDER BY oid ASC
   #24 = InterfaceMethodref #25.#26       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #25 = Class              #27           // java/sql/Connection
   #26 = NameAndType        #28:#29       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #27 = Utf8               java/sql/Connection
   #28 = Utf8               prepareStatement
   #29 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #30 = InterfaceMethodref #31.#32       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #31 = Class              #33           // java/sql/PreparedStatement
   #32 = NameAndType        #34:#35       // executeQuery:()Ljava/sql/ResultSet;
   #33 = Utf8               java/sql/PreparedStatement
   #34 = Utf8               executeQuery
   #35 = Utf8               ()Ljava/sql/ResultSet;
   #36 = InterfaceMethodref #37.#38       // java/sql/ResultSet.next:()Z
   #37 = Class              #39           // java/sql/ResultSet
   #38 = NameAndType        #40:#41       // next:()Z
   #39 = Utf8               java/sql/ResultSet
   #40 = Utf8               next
   #41 = Utf8               ()Z
   #42 = String             #43           // oid
   #43 = Utf8               oid
   #44 = InterfaceMethodref #37.#45       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #45 = NameAndType        #46:#47       // getInt:(Ljava/lang/String;)I
   #46 = Utf8               getInt
   #47 = Utf8               (Ljava/lang/String;)I
   #48 = Methodref          #49.#50       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #49 = Class              #51           // java/lang/Integer
   #50 = NameAndType        #52:#53       // valueOf:(I)Ljava/lang/Integer;
   #51 = Utf8               java/lang/Integer
   #52 = Utf8               valueOf
   #53 = Utf8               (I)Ljava/lang/Integer;
   #54 = Class              #55           // ext/mods/gameserver/model/Petition
   #55 = Utf8               ext/mods/gameserver/model/Petition
   #56 = Methodref          #54.#57       // ext/mods/gameserver/model/Petition."<init>":(Ljava/sql/ResultSet;)V
   #57 = NameAndType        #5:#58        // "<init>":(Ljava/sql/ResultSet;)V
   #58 = Utf8               (Ljava/sql/ResultSet;)V
   #59 = InterfaceMethodref #60.#61       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #60 = Class              #62           // java/util/Map
   #61 = NameAndType        #63:#64       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #62 = Utf8               java/util/Map
   #63 = Utf8               put
   #64 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #65 = InterfaceMethodref #37.#66       // java/sql/ResultSet.close:()V
   #66 = NameAndType        #67:#6        // close:()V
   #67 = Utf8               close
   #68 = Class              #69           // java/lang/Throwable
   #69 = Utf8               java/lang/Throwable
   #70 = Methodref          #68.#71       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #71 = NameAndType        #72:#73       // addSuppressed:(Ljava/lang/Throwable;)V
   #72 = Utf8               addSuppressed
   #73 = Utf8               (Ljava/lang/Throwable;)V
   #74 = InterfaceMethodref #31.#66       // java/sql/PreparedStatement.close:()V
   #75 = String             #76           // SELECT * FROM petition_message ORDER BY id ASC, petition_oid ASC
   #76 = Utf8               SELECT * FROM petition_message ORDER BY id ASC, petition_oid ASC
   #77 = String             #78           // petition_oid
   #78 = Utf8               petition_oid
   #79 = InterfaceMethodref #60.#80       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #80 = NameAndType        #81:#82       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #81 = Utf8               get
   #82 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #83 = Class              #84           // ext/mods/gameserver/network/serverpackets/CreatureSay
   #84 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
   #85 = Methodref          #83.#57       // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Ljava/sql/ResultSet;)V
   #86 = Methodref          #54.#87       // ext/mods/gameserver/model/Petition.addMessage:(Lext/mods/gameserver/network/serverpackets/CreatureSay;)Z
   #87 = NameAndType        #88:#89       // addMessage:(Lext/mods/gameserver/network/serverpackets/CreatureSay;)Z
   #88 = Utf8               addMessage
   #89 = Utf8               (Lext/mods/gameserver/network/serverpackets/CreatureSay;)Z
   #90 = InterfaceMethodref #25.#66       // java/sql/Connection.close:()V
   #91 = Class              #92           // java/lang/Exception
   #92 = Utf8               java/lang/Exception
   #93 = Fieldref           #11.#94       // ext/mods/gameserver/data/manager/PetitionManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #94 = NameAndType        #95:#96       // LOGGER:Lext/mods/commons/logging/CLogger;
   #95 = Utf8               LOGGER
   #96 = Utf8               Lext/mods/commons/logging/CLogger;
   #97 = String             #98           // Couldn\'t load petitions.
   #98 = Utf8               Couldn\'t load petitions.
   #99 = Methodref          #100.#101     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #100 = Class              #102          // ext/mods/commons/logging/CLogger
  #101 = NameAndType        #103:#104     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #102 = Utf8               ext/mods/commons/logging/CLogger
  #103 = Utf8               error
  #104 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #105 = String             #106          // Loaded {} petitions.
  #106 = Utf8               Loaded {} petitions.
  #107 = InterfaceMethodref #60.#108      // java/util/Map.size:()I
  #108 = NameAndType        #109:#110     // size:()I
  #109 = Utf8               size
  #110 = Utf8               ()I
  #111 = Methodref          #100.#112     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #112 = NameAndType        #113:#114     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #113 = Utf8               info
  #114 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #115 = InterfaceMethodref #60.#116      // java/util/Map.values:()Ljava/util/Collection;
  #116 = NameAndType        #117:#118     // values:()Ljava/util/Collection;
  #117 = Utf8               values
  #118 = Utf8               ()Ljava/util/Collection;
  #119 = InterfaceMethodref #120.#121     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #120 = Class              #122          // java/util/Collection
  #121 = NameAndType        #123:#124     // stream:()Ljava/util/stream/Stream;
  #122 = Utf8               java/util/Collection
  #123 = Utf8               stream
  #124 = Utf8               ()Ljava/util/stream/Stream;
  #125 = InterfaceMethodref #126.#127     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #126 = Class              #128          // java/util/stream/Stream
  #127 = NameAndType        #129:#130     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #128 = Utf8               java/util/stream/Stream
  #129 = Utf8               filter
  #130 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #131 = InterfaceMethodref #126.#132     // java/util/stream/Stream.toList:()Ljava/util/List;
  #132 = NameAndType        #133:#134     // toList:()Ljava/util/List;
  #133 = Utf8               toList
  #134 = Utf8               ()Ljava/util/List;
  #135 = InterfaceMethodref #60.#136      // java/util/Map.isEmpty:()Z
  #136 = NameAndType        #137:#41      // isEmpty:()Z
  #137 = Utf8               isEmpty
  #138 = InvokeDynamic      #0:#139       // #0:test:()Ljava/util/function/Predicate;
  #139 = NameAndType        #140:#141     // test:()Ljava/util/function/Predicate;
  #140 = Utf8               test
  #141 = Utf8               ()Ljava/util/function/Predicate;
  #142 = InterfaceMethodref #126.#143     // java/util/stream/Stream.count:()J
  #143 = NameAndType        #144:#145     // count:()J
  #144 = Utf8               count
  #145 = Utf8               ()J
  #146 = InvokeDynamic      #1:#147       // #1:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #147 = NameAndType        #140:#148     // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #148 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #149 = InvokeDynamic      #2:#139       // #2:test:()Ljava/util/function/Predicate;
  #150 = InterfaceMethodref #126.#151     // java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
  #151 = NameAndType        #152:#153     // anyMatch:(Ljava/util/function/Predicate;)Z
  #152 = Utf8               anyMatch
  #153 = Utf8               (Ljava/util/function/Predicate;)Z
  #154 = Methodref          #54.#155      // ext/mods/gameserver/model/Petition.getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
  #155 = NameAndType        #156:#157     // getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
  #156 = Utf8               getState
  #157 = Utf8               ()Lext/mods/gameserver/enums/petitions/PetitionState;
  #158 = Fieldref           #159.#160     // ext/mods/gameserver/enums/petitions/PetitionState.ACCEPTED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #159 = Class              #161          // ext/mods/gameserver/enums/petitions/PetitionState
  #160 = NameAndType        #162:#163     // ACCEPTED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #161 = Utf8               ext/mods/gameserver/enums/petitions/PetitionState
  #162 = Utf8               ACCEPTED
  #163 = Utf8               Lext/mods/gameserver/enums/petitions/PetitionState;
  #164 = InvokeDynamic      #3:#139       // #3:test:()Ljava/util/function/Predicate;
  #165 = Methodref          #11.#166      // ext/mods/gameserver/data/manager/PetitionManager.getPetitions:(Ljava/util/function/Predicate;)Ljava/util/List;
  #166 = NameAndType        #167:#168     // getPetitions:(Ljava/util/function/Predicate;)Ljava/util/List;
  #167 = Utf8               getPetitions
  #168 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/List;
  #169 = InterfaceMethodref #170.#171     // java/util/List.iterator:()Ljava/util/Iterator;
  #170 = Class              #172          // java/util/List
  #171 = NameAndType        #173:#174     // iterator:()Ljava/util/Iterator;
  #172 = Utf8               java/util/List
  #173 = Utf8               iterator
  #174 = Utf8               ()Ljava/util/Iterator;
  #175 = InterfaceMethodref #176.#177     // java/util/Iterator.hasNext:()Z
  #176 = Class              #178          // java/util/Iterator
  #177 = NameAndType        #179:#41      // hasNext:()Z
  #178 = Utf8               java/util/Iterator
  #179 = Utf8               hasNext
  #180 = InterfaceMethodref #176.#181     // java/util/Iterator.next:()Ljava/lang/Object;
  #181 = NameAndType        #40:#182      // next:()Ljava/lang/Object;
  #182 = Utf8               ()Ljava/lang/Object;
  #183 = Methodref          #54.#184      // ext/mods/gameserver/model/Petition.getPetitionerObjectId:()I
  #184 = NameAndType        #185:#110     // getPetitionerObjectId:()I
  #185 = Utf8               getPetitionerObjectId
  #186 = Methodref          #187.#188     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #187 = Class              #189          // ext/mods/gameserver/model/actor/Player
  #188 = NameAndType        #190:#110     // getObjectId:()I
  #189 = Utf8               ext/mods/gameserver/model/actor/Player
  #190 = Utf8               getObjectId
  #191 = Methodref          #54.#192      // ext/mods/gameserver/model/Petition.getResponders:()Ljava/util/List;
  #192 = NameAndType        #193:#134     // getResponders:()Ljava/util/List;
  #193 = Utf8               getResponders
  #194 = InterfaceMethodref #170.#195     // java/util/List.contains:(Ljava/lang/Object;)Z
  #195 = NameAndType        #196:#197     // contains:(Ljava/lang/Object;)Z
  #196 = Utf8               contains
  #197 = Utf8               (Ljava/lang/Object;)Z
  #198 = InvokeDynamic      #4:#147       // #4:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #199 = InterfaceMethodref #126.#200     // java/util/stream/Stream.findAny:()Ljava/util/Optional;
  #200 = NameAndType        #201:#202     // findAny:()Ljava/util/Optional;
  #201 = Utf8               findAny
  #202 = Utf8               ()Ljava/util/Optional;
  #203 = Methodref          #204.#205     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #204 = Class              #206          // java/util/Optional
  #205 = NameAndType        #207:#82      // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #206 = Utf8               java/util/Optional
  #207 = Utf8               orElse
  #208 = InvokeDynamic      #5:#147       // #5:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #209 = Methodref          #54.#210      // ext/mods/gameserver/model/Petition."<init>":(Lext/mods/gameserver/enums/petitions/PetitionType;ILjava/lang/String;)V
  #210 = NameAndType        #5:#211       // "<init>":(Lext/mods/gameserver/enums/petitions/PetitionType;ILjava/lang/String;)V
  #211 = Utf8               (Lext/mods/gameserver/enums/petitions/PetitionType;ILjava/lang/String;)V
  #212 = Methodref          #54.#213      // ext/mods/gameserver/model/Petition.getId:()I
  #213 = NameAndType        #214:#110     // getId:()I
  #214 = Utf8               getId
  #215 = Methodref          #216.#217     // ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
  #216 = Class              #218          // ext/mods/gameserver/data/xml/AdminData
  #217 = NameAndType        #219:#220     // getInstance:()Lext/mods/gameserver/data/xml/AdminData;
  #218 = Utf8               ext/mods/gameserver/data/xml/AdminData
  #219 = Utf8               getInstance
  #220 = Utf8               ()Lext/mods/gameserver/data/xml/AdminData;
  #221 = Fieldref           #222.#223     // ext/mods/gameserver/enums/SayType.HERO_VOICE:Lext/mods/gameserver/enums/SayType;
  #222 = Class              #224          // ext/mods/gameserver/enums/SayType
  #223 = NameAndType        #225:#226     // HERO_VOICE:Lext/mods/gameserver/enums/SayType;
  #224 = Utf8               ext/mods/gameserver/enums/SayType
  #225 = Utf8               HERO_VOICE
  #226 = Utf8               Lext/mods/gameserver/enums/SayType;
  #227 = String             #228          // Petition System
  #228 = Utf8               Petition System
  #229 = Methodref          #187.#230     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #230 = NameAndType        #231:#232     // getName:()Ljava/lang/String;
  #231 = Utf8               getName
  #232 = Utf8               ()Ljava/lang/String;
  #233 = InvokeDynamic      #6:#234       // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #234 = NameAndType        #235:#236     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #235 = Utf8               makeConcatWithConstants
  #236 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #237 = Methodref          #83.#238      // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #238 = NameAndType        #5:#239       // "<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #239 = Utf8               (ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #240 = Methodref          #216.#241     // ext/mods/gameserver/data/xml/AdminData.broadcastToGMs:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #241 = NameAndType        #242:#243     // broadcastToGMs:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #242 = Utf8               broadcastToGMs
  #243 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #244 = Methodref          #11.#245      // ext/mods/gameserver/data/manager/PetitionManager.getPetitionInProcess:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
  #245 = NameAndType        #246:#247     // getPetitionInProcess:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
  #246 = Utf8               getPetitionInProcess
  #247 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
  #248 = Methodref          #54.#249      // ext/mods/gameserver/model/Petition.abortConsultation:(Lext/mods/gameserver/model/actor/Player;)V
  #249 = NameAndType        #250:#251     // abortConsultation:(Lext/mods/gameserver/model/actor/Player;)V
  #250 = Utf8               abortConsultation
  #251 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #252 = Methodref          #11.#253      // ext/mods/gameserver/data/manager/PetitionManager.abortActivePetition:(Lext/mods/gameserver/model/actor/Player;)V
  #253 = NameAndType        #254:#251     // abortActivePetition:(Lext/mods/gameserver/model/actor/Player;)V
  #254 = Utf8               abortActivePetition
  #255 = Methodref          #54.#256      // ext/mods/gameserver/model/Petition.join:(Lext/mods/gameserver/model/actor/Player;Z)Z
  #256 = NameAndType        #257:#258     // join:(Lext/mods/gameserver/model/actor/Player;Z)Z
  #257 = Utf8               join
  #258 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Z
  #259 = Fieldref           #159.#260     // ext/mods/gameserver/enums/petitions/PetitionState.REJECTED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #260 = NameAndType        #261:#163     // REJECTED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #261 = Utf8               REJECTED
  #262 = Methodref          #54.#263      // ext/mods/gameserver/model/Petition.addResponder:(Lext/mods/gameserver/model/actor/Player;)Z
  #263 = NameAndType        #264:#265     // addResponder:(Lext/mods/gameserver/model/actor/Player;)Z
  #264 = Utf8               addResponder
  #265 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #266 = Methodref          #54.#267      // ext/mods/gameserver/model/Petition.endConsultation:(Lext/mods/gameserver/enums/petitions/PetitionState;)V
  #267 = NameAndType        #268:#269     // endConsultation:(Lext/mods/gameserver/enums/petitions/PetitionState;)V
  #268 = Utf8               endConsultation
  #269 = Utf8               (Lext/mods/gameserver/enums/petitions/PetitionState;)V
  #270 = InvokeDynamic      #7:#147       // #7:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #271 = Fieldref           #159.#272     // ext/mods/gameserver/enums/petitions/PetitionState.CANCELLED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #272 = NameAndType        #273:#163     // CANCELLED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #273 = Utf8               CANCELLED
  #274 = InvokeDynamic      #8:#139       // #8:test:()Ljava/util/function/Predicate;
  #275 = Methodref          #54.#276      // ext/mods/gameserver/model/Petition.showCompleteLog:(Lext/mods/gameserver/model/actor/Player;)V
  #276 = NameAndType        #277:#251     // showCompleteLog:(Lext/mods/gameserver/model/actor/Player;)V
  #277 = Utf8               showCompleteLog
  #278 = InvokeDynamic      #9:#279       // #9:accept:()Ljava/util/function/Consumer;
  #279 = NameAndType        #280:#281     // accept:()Ljava/util/function/Consumer;
  #280 = Utf8               accept
  #281 = Utf8               ()Ljava/util/function/Consumer;
  #282 = InterfaceMethodref #120.#283     // java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
  #283 = NameAndType        #284:#285     // forEach:(Ljava/util/function/Consumer;)V
  #284 = Utf8               forEach
  #285 = Utf8               (Ljava/util/function/Consumer;)V
  #286 = InterfaceMethodref #60.#287      // java/util/Map.clear:()V
  #287 = NameAndType        #288:#6       // clear:()V
  #288 = Utf8               clear
  #289 = String             #290          // TRUNCATE petition
  #290 = Utf8               TRUNCATE petition
  #291 = InterfaceMethodref #31.#292      // java/sql/PreparedStatement.execute:()Z
  #292 = NameAndType        #293:#41      // execute:()Z
  #293 = Utf8               execute
  #294 = String             #295          // INSERT INTO petition (oid, type, petitioner_oid, submit_date, content, is_unread, state, rate, feedback, responders) VALUES (?,?,?,?,?,?,?,?,?,?)
  #295 = Utf8               INSERT INTO petition (oid, type, petitioner_oid, submit_date, content, is_unread, state, rate, feedback, responders) VALUES (?,?,?,?,?,?,?,?,?,?)
  #296 = InterfaceMethodref #120.#171     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #297 = Methodref          #54.#298      // ext/mods/gameserver/model/Petition.getMessages:()Ljava/util/List;
  #298 = NameAndType        #299:#134     // getMessages:()Ljava/util/List;
  #299 = Utf8               getMessages
  #300 = InterfaceMethodref #170.#136     // java/util/List.isEmpty:()Z
  #301 = InterfaceMethodref #31.#302      // java/sql/PreparedStatement.setInt:(II)V
  #302 = NameAndType        #303:#304     // setInt:(II)V
  #303 = Utf8               setInt
  #304 = Utf8               (II)V
  #305 = Methodref          #54.#306      // ext/mods/gameserver/model/Petition.getType:()Lext/mods/gameserver/enums/petitions/PetitionType;
  #306 = NameAndType        #307:#308     // getType:()Lext/mods/gameserver/enums/petitions/PetitionType;
  #307 = Utf8               getType
  #308 = Utf8               ()Lext/mods/gameserver/enums/petitions/PetitionType;
  #309 = Methodref          #310.#311     // ext/mods/gameserver/enums/petitions/PetitionType.toString:()Ljava/lang/String;
  #310 = Class              #312          // ext/mods/gameserver/enums/petitions/PetitionType
  #311 = NameAndType        #313:#232     // toString:()Ljava/lang/String;
  #312 = Utf8               ext/mods/gameserver/enums/petitions/PetitionType
  #313 = Utf8               toString
  #314 = InterfaceMethodref #31.#315      // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #315 = NameAndType        #316:#317     // setString:(ILjava/lang/String;)V
  #316 = Utf8               setString
  #317 = Utf8               (ILjava/lang/String;)V
  #318 = Methodref          #54.#319      // ext/mods/gameserver/model/Petition.getSubmitDate:()J
  #319 = NameAndType        #320:#145     // getSubmitDate:()J
  #320 = Utf8               getSubmitDate
  #321 = InterfaceMethodref #31.#322      // java/sql/PreparedStatement.setLong:(IJ)V
  #322 = NameAndType        #323:#324     // setLong:(IJ)V
  #323 = Utf8               setLong
  #324 = Utf8               (IJ)V
  #325 = Methodref          #54.#326      // ext/mods/gameserver/model/Petition.getContent:()Ljava/lang/String;
  #326 = NameAndType        #327:#232     // getContent:()Ljava/lang/String;
  #327 = Utf8               getContent
  #328 = Methodref          #54.#329      // ext/mods/gameserver/model/Petition.isUnread:()Z
  #329 = NameAndType        #330:#41      // isUnread:()Z
  #330 = Utf8               isUnread
  #331 = String             #332          // PENDING
  #332 = Utf8               PENDING
  #333 = Methodref          #159.#311     // ext/mods/gameserver/enums/petitions/PetitionState.toString:()Ljava/lang/String;
  #334 = Methodref          #54.#335      // ext/mods/gameserver/model/Petition.getRate:()Lext/mods/gameserver/enums/petitions/PetitionRate;
  #335 = NameAndType        #336:#337     // getRate:()Lext/mods/gameserver/enums/petitions/PetitionRate;
  #336 = Utf8               getRate
  #337 = Utf8               ()Lext/mods/gameserver/enums/petitions/PetitionRate;
  #338 = Methodref          #339.#311     // ext/mods/gameserver/enums/petitions/PetitionRate.toString:()Ljava/lang/String;
  #339 = Class              #340          // ext/mods/gameserver/enums/petitions/PetitionRate
  #340 = Utf8               ext/mods/gameserver/enums/petitions/PetitionRate
  #341 = Methodref          #54.#342      // ext/mods/gameserver/model/Petition.getFeedback:()Ljava/lang/String;
  #342 = NameAndType        #343:#232     // getFeedback:()Ljava/lang/String;
  #343 = Utf8               getFeedback
  #344 = String             #345          //
  #345 = Utf8
  #346 = InterfaceMethodref #170.#121     // java/util/List.stream:()Ljava/util/stream/Stream;
  #347 = InvokeDynamic      #10:#348      // #10:apply:()Ljava/util/function/Function;
  #348 = NameAndType        #349:#350     // apply:()Ljava/util/function/Function;
  #349 = Utf8               apply
  #350 = Utf8               ()Ljava/util/function/Function;
  #351 = InterfaceMethodref #126.#352     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #352 = NameAndType        #353:#354     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #353 = Utf8               map
  #354 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #355 = String             #356          // ;
  #356 = Utf8               ;
  #357 = Methodref          #358.#359     // java/util/stream/Collectors.joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
  #358 = Class              #360          // java/util/stream/Collectors
  #359 = NameAndType        #361:#362     // joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
  #360 = Utf8               java/util/stream/Collectors
  #361 = Utf8               joining
  #362 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
  #363 = InterfaceMethodref #126.#364     // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #364 = NameAndType        #365:#366     // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #365 = Utf8               collect
  #366 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
  #367 = Class              #368          // java/lang/String
  #368 = Utf8               java/lang/String
  #369 = InterfaceMethodref #31.#370      // java/sql/PreparedStatement.addBatch:()V
  #370 = NameAndType        #371:#6       // addBatch:()V
  #371 = Utf8               addBatch
  #372 = InterfaceMethodref #31.#373      // java/sql/PreparedStatement.executeBatch:()[I
  #373 = NameAndType        #374:#375     // executeBatch:()[I
  #374 = Utf8               executeBatch
  #375 = Utf8               ()[I
  #376 = String             #377          // TRUNCATE petition_message
  #377 = Utf8               TRUNCATE petition_message
  #378 = String             #379          // INSERT INTO petition_message (id, petition_oid, player_oid, type, player_name, content) VALUES (?,?,?,?,?,?)
  #379 = Utf8               INSERT INTO petition_message (id, petition_oid, player_oid, type, player_name, content) VALUES (?,?,?,?,?,?)
  #380 = Methodref          #83.#188      // ext/mods/gameserver/network/serverpackets/CreatureSay.getObjectId:()I
  #381 = Methodref          #83.#382      // ext/mods/gameserver/network/serverpackets/CreatureSay.getSayType:()Lext/mods/gameserver/enums/SayType;
  #382 = NameAndType        #383:#384     // getSayType:()Lext/mods/gameserver/enums/SayType;
  #383 = Utf8               getSayType
  #384 = Utf8               ()Lext/mods/gameserver/enums/SayType;
  #385 = Methodref          #222.#311     // ext/mods/gameserver/enums/SayType.toString:()Ljava/lang/String;
  #386 = Methodref          #83.#230      // ext/mods/gameserver/network/serverpackets/CreatureSay.getName:()Ljava/lang/String;
  #387 = Methodref          #83.#326      // ext/mods/gameserver/network/serverpackets/CreatureSay.getContent:()Ljava/lang/String;
  #388 = String             #389          // Failed to save petitions data.
  #389 = Utf8               Failed to save petitions data.
  #390 = Fieldref           #391.#392     // ext/mods/gameserver/data/manager/PetitionManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/PetitionManager;
  #391 = Class              #393          // ext/mods/gameserver/data/manager/PetitionManager$SingletonHolder
  #392 = NameAndType        #394:#395     // INSTANCE:Lext/mods/gameserver/data/manager/PetitionManager;
  #393 = Utf8               ext/mods/gameserver/data/manager/PetitionManager$SingletonHolder
  #394 = Utf8               INSTANCE
  #395 = Utf8               Lext/mods/gameserver/data/manager/PetitionManager;
  #396 = Methodref          #397.#398     // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #397 = Class              #399          // ext/mods/gameserver/idfactory/IdFactory
  #398 = NameAndType        #219:#400     // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #399 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #400 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #401 = Methodref          #397.#402     // ext/mods/gameserver/idfactory/IdFactory.releaseId:(I)V
  #402 = NameAndType        #403:#404     // releaseId:(I)V
  #403 = Utf8               releaseId
  #404 = Utf8               (I)V
  #405 = Fieldref           #159.#406     // ext/mods/gameserver/enums/petitions/PetitionState.PENDING:Lext/mods/gameserver/enums/petitions/PetitionState;
  #406 = NameAndType        #332:#163     // PENDING:Lext/mods/gameserver/enums/petitions/PetitionState;
  #407 = Fieldref           #159.#408     // ext/mods/gameserver/enums/petitions/PetitionState.CLOSED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #408 = NameAndType        #409:#163     // CLOSED:Lext/mods/gameserver/enums/petitions/PetitionState;
  #409 = Utf8               CLOSED
  #410 = Methodref          #54.#411      // ext/mods/gameserver/model/Petition.isUnderFeedback:()Z
  #411 = NameAndType        #412:#41      // isUnderFeedback:()Z
  #412 = Utf8               isUnderFeedback
  #413 = Methodref          #414.#230     // java/lang/Class.getName:()Ljava/lang/String;
  #414 = Class              #415          // java/lang/Class
  #415 = Utf8               java/lang/Class
  #416 = Methodref          #100.#417     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #417 = NameAndType        #5:#418       // "<init>":(Ljava/lang/String;)V
  #418 = Utf8               (Ljava/lang/String;)V
  #419 = Utf8               SELECT_PETITIONS
  #420 = Utf8               Ljava/lang/String;
  #421 = Utf8               ConstantValue
  #422 = Utf8               TRUNCATE_PETITIONS
  #423 = Utf8               INSERT_PETITION
  #424 = Utf8               SELECT_PETITION_MESSAGES
  #425 = Utf8               TRUNCATE_PETITION_MESSAGES
  #426 = Utf8               INSERT_PETITION_MESSAGE
  #427 = Utf8               Signature
  #428 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/Petition;>;
  #429 = Utf8               Code
  #430 = Utf8               LineNumberTable
  #431 = Utf8               LocalVariableTable
  #432 = Utf8               rs
  #433 = Utf8               Ljava/sql/ResultSet;
  #434 = Utf8               ps
  #435 = Utf8               Ljava/sql/PreparedStatement;
  #436 = Utf8               petition
  #437 = Utf8               Lext/mods/gameserver/model/Petition;
  #438 = Utf8               con
  #439 = Utf8               Ljava/sql/Connection;
  #440 = Utf8               e
  #441 = Utf8               Ljava/lang/Exception;
  #442 = Utf8               this
  #443 = Utf8               StackMapTable
  #444 = Utf8               ()Ljava/util/Map;
  #445 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/Petition;>;
  #446 = Utf8               predicate
  #447 = Utf8               Ljava/util/function/Predicate;
  #448 = Utf8               LocalVariableTypeTable
  #449 = Utf8               Ljava/util/function/Predicate<Lext/mods/gameserver/model/Petition;>;
  #450 = Utf8               (Ljava/util/function/Predicate<Lext/mods/gameserver/model/Petition;>;)Ljava/util/List<Lext/mods/gameserver/model/Petition;>;
  #451 = Utf8               getActivePetitionsCount
  #452 = Utf8               getPetitionsCount
  #453 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #454 = Utf8               player
  #455 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #456 = Utf8               isAnyPetitionInProcess
  #457 = Utf8               isPetitionInProcess
  #458 = Utf8               (I)Z
  #459 = Utf8               id
  #460 = Utf8               I
  #461 = Utf8               getFeedbackPetition
  #462 = Utf8               isActivePetition
  #463 = Utf8               submitPetition
  #464 = Utf8               (Lext/mods/gameserver/enums/petitions/PetitionType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)I
  #465 = Utf8               type
  #466 = Utf8               Lext/mods/gameserver/enums/petitions/PetitionType;
  #467 = Utf8               content
  #468 = Utf8               activePetition
  #469 = Utf8               joinPetition
  #470 = Utf8               (Lext/mods/gameserver/model/actor/Player;IZ)Z
  #471 = Utf8               isEnforcing
  #472 = Utf8               Z
  #473 = Utf8               rejectPetition
  #474 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
  #475 = Utf8               cancelPendingPetition
  #476 = Utf8               checkActivePetition
  #477 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #478 = Utf8               clearPetitions
  #479 = Utf8               store
  #480 = Utf8               mustBeReset
  #481 = Utf8               cs
  #482 = Utf8               Lext/mods/gameserver/network/serverpackets/CreatureSay;
  #483 = Utf8               ()Lext/mods/gameserver/data/manager/PetitionManager;
  #484 = Utf8               lambda$clearPetitions$0
  #485 = Utf8               (Lext/mods/gameserver/model/Petition;)V
  #486 = Utf8               p
  #487 = Utf8               lambda$checkActivePetition$0
  #488 = Utf8               (Lext/mods/gameserver/model/Petition;)Z
  #489 = Utf8               lambda$cancelPendingPetition$0
  #490 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
  #491 = Utf8               lambda$isActivePetition$0
  #492 = Utf8               lambda$getFeedbackPetition$0
  #493 = Utf8               lambda$getPetitionInProcess$0
  #494 = Utf8               lambda$isAnyPetitionInProcess$0
  #495 = Utf8               lambda$getPetitionsCount$0
  #496 = Utf8               lambda$getActivePetitionsCount$0
  #497 = Utf8               <clinit>
  #498 = Utf8               SourceFile
  #499 = Utf8               PetitionManager.java
  #500 = Utf8               NestMembers
  #501 = Utf8               BootstrapMethods
  #502 = MethodType         #197          //  (Ljava/lang/Object;)Z
  #503 = MethodHandle       6:#504        // REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$getActivePetitionsCount$0:(Lext/mods/gameserver/model/Petition;)Z
  #504 = Methodref          #11.#505      // ext/mods/gameserver/data/manager/PetitionManager.lambda$getActivePetitionsCount$0:(Lext/mods/gameserver/model/Petition;)Z
  #505 = NameAndType        #496:#488     // lambda$getActivePetitionsCount$0:(Lext/mods/gameserver/model/Petition;)Z
  #506 = MethodType         #488          //  (Lext/mods/gameserver/model/Petition;)Z
  #507 = MethodHandle       6:#508        // REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$getPetitionsCount$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
  #508 = Methodref          #11.#509      // ext/mods/gameserver/data/manager/PetitionManager.lambda$getPetitionsCount$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
  #509 = NameAndType        #495:#490     // lambda$getPetitionsCount$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
  #510 = MethodHandle       6:#511        // REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$isAnyPetitionInProcess$0:(Lext/mods/gameserver/model/Petition;)Z
  #511 = Methodref          #11.#512      // ext/mods/gameserver/data/manager/PetitionManager.lambda$isAnyPetitionInProcess$0:(Lext/mods/gameserver/model/Petition;)Z
  #512 = NameAndType        #494:#488     // lambda$isAnyPetitionInProcess$0:(Lext/mods/gameserver/model/Petition;)Z
  #513 = MethodHandle       6:#514        // REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$getPetitionInProcess$0:(Lext/mods/gameserver/model/Petition;)Z
  #514 = Methodref          #11.#515      // ext/mods/gameserver/data/manager/PetitionManager.lambda$getPetitionInProcess$0:(Lext/mods/gameserver/model/Petition;)Z
  #515 = NameAndType        #493:#488     // lambda$getPetitionInProcess$0:(Lext/mods/gameserver/model/Petition;)Z
  #516 = MethodHandle       6:#517        // REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$getFeedbackPetition$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
  #517 = Methodref          #11.#518      // ext/mods/gameserver/data/manager/PetitionManager.lambda$getFeedbackPetition$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
  #518 = NameAndType        #492:#490     // lambda$getFeedbackPetition$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
  #519 = MethodHandle       6:#520        // REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$isActivePetition$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
  #520 = Methodref          #11.#521      // ext/mods/gameserver/data/manager/PetitionManager.lambda$isActivePetition$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
  #521 = NameAndType        #491:#490     // lambda$isActivePetition$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
  #522 = String             #523          // \u0001 has submitted a new petition.
  #523 = Utf8               \u0001 has submitted a new petition.
  #524 = MethodHandle       6:#525        // REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$cancelPendingPetition$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
  #525 = Methodref          #11.#526      // ext/mods/gameserver/data/manager/PetitionManager.lambda$cancelPendingPetition$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
  #526 = NameAndType        #489:#490     // lambda$cancelPendingPetition$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
  #527 = MethodHandle       6:#528        // REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$checkActivePetition$0:(Lext/mods/gameserver/model/Petition;)Z
  #528 = Methodref          #11.#529      // ext/mods/gameserver/data/manager/PetitionManager.lambda$checkActivePetition$0:(Lext/mods/gameserver/model/Petition;)Z
  #529 = NameAndType        #487:#488     // lambda$checkActivePetition$0:(Lext/mods/gameserver/model/Petition;)Z
  #530 = MethodType         #531          //  (Ljava/lang/Object;)V
  #531 = Utf8               (Ljava/lang/Object;)V
  #532 = MethodHandle       6:#533        // REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$clearPetitions$0:(Lext/mods/gameserver/model/Petition;)V
  #533 = Methodref          #11.#534      // ext/mods/gameserver/data/manager/PetitionManager.lambda$clearPetitions$0:(Lext/mods/gameserver/model/Petition;)V
  #534 = NameAndType        #484:#485     // lambda$clearPetitions$0:(Lext/mods/gameserver/model/Petition;)V
  #535 = MethodType         #485          //  (Lext/mods/gameserver/model/Petition;)V
  #536 = MethodType         #82           //  (Ljava/lang/Object;)Ljava/lang/Object;
  #537 = MethodHandle       6:#538        // REF_invokeStatic java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #538 = Methodref          #367.#539     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #539 = NameAndType        #52:#540      // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #540 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #541 = MethodType         #542          //  (Ljava/lang/Integer;)Ljava/lang/String;
  #542 = Utf8               (Ljava/lang/Integer;)Ljava/lang/String;
  #543 = MethodHandle       6:#544        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #544 = Methodref          #545.#546     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #545 = Class              #547          // java/lang/invoke/LambdaMetafactory
  #546 = NameAndType        #548:#549     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #547 = Utf8               java/lang/invoke/LambdaMetafactory
  #548 = Utf8               metafactory
  #549 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #550 = MethodHandle       6:#551        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #551 = Methodref          #552.#553     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #552 = Class              #554          // java/lang/invoke/StringConcatFactory
  #553 = NameAndType        #235:#555     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #554 = Utf8               java/lang/invoke/StringConcatFactory
  #555 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #556 = Utf8               InnerClasses
  #557 = Utf8               SingletonHolder
  #558 = Class              #559          // java/lang/invoke/MethodHandles$Lookup
  #559 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #560 = Class              #561          // java/lang/invoke/MethodHandles
  #561 = Utf8               java/lang/invoke/MethodHandles
  #562 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.manager.PetitionManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=6, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentSkipListMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentSkipListMap."<init>":()V
        12: putfield      #10                 // Field _petitions:Ljava/util/Map;
        15: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        18: astore_1
        19: aload_1
        20: ldc           #22                 // String SELECT * FROM petition ORDER BY oid ASC
        22: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        27: astore_2
        28: aload_2
        29: invokeinterface #30,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        34: astore_3
        35: aload_3
        36: invokeinterface #36,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        41: ifeq          76
        44: aload_0
        45: getfield      #10                 // Field _petitions:Ljava/util/Map;
        48: aload_3
        49: ldc           #42                 // String oid
        51: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        56: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        59: new           #54                 // class ext/mods/gameserver/model/Petition
        62: dup
        63: aload_3
        64: invokespecial #56                 // Method ext/mods/gameserver/model/Petition."<init>":(Ljava/sql/ResultSet;)V
        67: invokeinterface #59,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        72: pop
        73: goto          35
        76: aload_3
        77: ifnull        116
        80: aload_3
        81: invokeinterface #65,  1           // InterfaceMethod java/sql/ResultSet.close:()V
        86: goto          116
        89: astore        4
        91: aload_3
        92: ifnull        113
        95: aload_3
        96: invokeinterface #65,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       101: goto          113
       104: astore        5
       106: aload         4
       108: aload         5
       110: invokevirtual #70                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       113: aload         4
       115: athrow
       116: aload_2
       117: ifnull        153
       120: aload_2
       121: invokeinterface #74,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       126: goto          153
       129: astore_3
       130: aload_2
       131: ifnull        151
       134: aload_2
       135: invokeinterface #74,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       140: goto          151
       143: astore        4
       145: aload_3
       146: aload         4
       148: invokevirtual #70                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       151: aload_3
       152: athrow
       153: aload_1
       154: ldc           #75                 // String SELECT * FROM petition_message ORDER BY id ASC, petition_oid ASC
       156: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       161: astore_2
       162: aload_2
       163: invokeinterface #30,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       168: astore_3
       169: aload_3
       170: invokeinterface #36,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       175: ifeq          228
       178: aload_0
       179: getfield      #10                 // Field _petitions:Ljava/util/Map;
       182: aload_3
       183: ldc           #77                 // String petition_oid
       185: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       190: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       193: invokeinterface #79,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       198: checkcast     #54                 // class ext/mods/gameserver/model/Petition
       201: astore        4
       203: aload         4
       205: ifnonnull     211
       208: goto          169
       211: aload         4
       213: new           #83                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
       216: dup
       217: aload_3
       218: invokespecial #85                 // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Ljava/sql/ResultSet;)V
       221: invokevirtual #86                 // Method ext/mods/gameserver/model/Petition.addMessage:(Lext/mods/gameserver/network/serverpackets/CreatureSay;)Z
       224: pop
       225: goto          169
       228: aload_3
       229: ifnull        268
       232: aload_3
       233: invokeinterface #65,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       238: goto          268
       241: astore        4
       243: aload_3
       244: ifnull        265
       247: aload_3
       248: invokeinterface #65,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       253: goto          265
       256: astore        5
       258: aload         4
       260: aload         5
       262: invokevirtual #70                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       265: aload         4
       267: athrow
       268: aload_2
       269: ifnull        305
       272: aload_2
       273: invokeinterface #74,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       278: goto          305
       281: astore_3
       282: aload_2
       283: ifnull        303
       286: aload_2
       287: invokeinterface #74,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       292: goto          303
       295: astore        4
       297: aload_3
       298: aload         4
       300: invokevirtual #70                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       303: aload_3
       304: athrow
       305: aload_1
       306: ifnull        340
       309: aload_1
       310: invokeinterface #90,  1           // InterfaceMethod java/sql/Connection.close:()V
       315: goto          340
       318: astore_2
       319: aload_1
       320: ifnull        338
       323: aload_1
       324: invokeinterface #90,  1           // InterfaceMethod java/sql/Connection.close:()V
       329: goto          338
       332: astore_3
       333: aload_2
       334: aload_3
       335: invokevirtual #70                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       338: aload_2
       339: athrow
       340: goto          353
       343: astore_1
       344: getstatic     #93                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       347: ldc           #97                 // String Couldn\'t load petitions.
       349: aload_1
       350: invokevirtual #99                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       353: getstatic     #93                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       356: ldc           #105                // String Loaded {} petitions.
       358: iconst_1
       359: anewarray     #2                  // class java/lang/Object
       362: dup
       363: iconst_0
       364: aload_0
       365: getfield      #10                 // Field _petitions:Ljava/util/Map;
       368: invokeinterface #107,  1          // InterfaceMethod java/util/Map.size:()I
       373: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       376: aastore
       377: invokevirtual #111                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       380: return
      Exception table:
         from    to  target type
            35    76    89   Class java/lang/Throwable
            95   101   104   Class java/lang/Throwable
            28   116   129   Class java/lang/Throwable
           134   140   143   Class java/lang/Throwable
           169   228   241   Class java/lang/Throwable
           247   253   256   Class java/lang/Throwable
           162   268   281   Class java/lang/Throwable
           286   292   295   Class java/lang/Throwable
            19   305   318   Class java/lang/Throwable
           323   329   332   Class java/lang/Throwable
            15   340   343   Class java/lang/Exception
      LineNumberTable:
        line 61: 0
        line 58: 4
        line 62: 15
        line 64: 19
        line 65: 28
        line 67: 35
        line 68: 44
        line 69: 76
        line 64: 89
        line 69: 116
        line 64: 129
        line 71: 153
        line 72: 162
        line 74: 169
        line 76: 178
        line 77: 203
        line 78: 208
        line 80: 211
        line 81: 225
        line 82: 228
        line 71: 241
        line 82: 268
        line 71: 281
        line 83: 305
        line 62: 318
        line 87: 340
        line 84: 343
        line 86: 344
        line 88: 353
        line 89: 380
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      81     3    rs   Ljava/sql/ResultSet;
           28     125     2    ps   Ljava/sql/PreparedStatement;
          203      22     4 petition   Lext/mods/gameserver/model/Petition;
          169      99     3    rs   Ljava/sql/ResultSet;
          162     143     2    ps   Ljava/sql/PreparedStatement;
           19     321     1   con   Ljava/sql/Connection;
          344       9     1     e   Ljava/lang/Exception;
            0     381     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
      StackMapTable: number_of_entries = 27
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 40 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 253 /* append */
          offset_delta = 15
          locals = [ class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/Petition ]
        frame_type = 250 /* chop */
          offset_delta = 16
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public java.util.Map<java.lang.Integer, ext.mods.gameserver.model.Petition> getPetitions();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _petitions:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
    Signature: #445                         // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/Petition;>;

  public java.util.List<ext.mods.gameserver.model.Petition> getPetitions(java.util.function.Predicate<ext.mods.gameserver.model.Petition>);
    descriptor: (Ljava/util/function/Predicate;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _petitions:Ljava/util/Map;
         4: invokeinterface #115,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #119,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokeinterface #125,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #131,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        25: areturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
            0      26     1 predicate   Ljava/util/function/Predicate;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     1 predicate   Ljava/util/function/Predicate<Lext/mods/gameserver/model/Petition;>;
    Signature: #450                         // (Ljava/util/function/Predicate<Lext/mods/gameserver/model/Petition;>;)Ljava/util/List<Lext/mods/gameserver/model/Petition;>;

  public int getActivePetitionsCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _petitions:Ljava/util/Map;
         4: invokeinterface #135,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
         9: ifeq          14
        12: iconst_0
        13: ireturn
        14: aload_0
        15: getfield      #10                 // Field _petitions:Ljava/util/Map;
        18: invokeinterface #115,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        23: invokeinterface #119,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        28: invokedynamic #138,  0            // InvokeDynamic #0:test:()Ljava/util/function/Predicate;
        33: invokeinterface #125,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        38: invokeinterface #142,  1          // InterfaceMethod java/util/stream/Stream.count:()J
        43: l2i
        44: ireturn
      LineNumberTable:
        line 106: 0
        line 107: 12
        line 109: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */

  public int getPetitionsCount(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: getfield      #10                 // Field _petitions:Ljava/util/Map;
        10: invokeinterface #115,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        15: invokeinterface #119,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        20: aload_1
        21: invokedynamic #146,  0            // InvokeDynamic #1:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        26: invokeinterface #125,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        31: invokeinterface #142,  1          // InterfaceMethod java/util/stream/Stream.count:()J
        36: l2i
        37: ireturn
      LineNumberTable:
        line 118: 0
        line 119: 4
        line 121: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
            0      38     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 6 /* same */

  public boolean isAnyPetitionInProcess();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _petitions:Ljava/util/Map;
         4: invokeinterface #115,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #119,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: invokedynamic #149,  0            // InvokeDynamic #2:test:()Ljava/util/function/Predicate;
        19: invokeinterface #150,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        24: ireturn
      LineNumberTable:
        line 129: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/data/manager/PetitionManager;

  public boolean isPetitionInProcess(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _petitions:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #79,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #54                 // class ext/mods/gameserver/model/Petition
        16: astore_2
        17: aload_2
        18: ifnull        35
        21: aload_2
        22: invokevirtual #154                // Method ext/mods/gameserver/model/Petition.getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
        25: getstatic     #158                // Field ext/mods/gameserver/enums/petitions/PetitionState.ACCEPTED:Lext/mods/gameserver/enums/petitions/PetitionState;
        28: if_acmpne     35
        31: iconst_1
        32: goto          36
        35: iconst_0
        36: ireturn
      LineNumberTable:
        line 138: 0
        line 139: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
            0      37     1    id   I
           17      20     2 petition   Lext/mods/gameserver/model/Petition;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/Petition ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.Petition getPetitionInProcess(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: aconst_null
         5: areturn
         6: aload_0
         7: invokedynamic #164,  0            // InvokeDynamic #3:test:()Ljava/util/function/Predicate;
        12: invokevirtual #165                // Method getPetitions:(Ljava/util/function/Predicate;)Ljava/util/List;
        15: invokeinterface #169,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        20: astore_2
        21: aload_2
        22: invokeinterface #175,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        27: ifeq          75
        30: aload_2
        31: invokeinterface #180,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        36: checkcast     #54                 // class ext/mods/gameserver/model/Petition
        39: astore_3
        40: aload_3
        41: invokevirtual #183                // Method ext/mods/gameserver/model/Petition.getPetitionerObjectId:()I
        44: aload_1
        45: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        48: if_icmpeq     70
        51: aload_3
        52: invokevirtual #191                // Method ext/mods/gameserver/model/Petition.getResponders:()Ljava/util/List;
        55: aload_1
        56: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        59: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        62: invokeinterface #194,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        67: ifeq          72
        70: aload_3
        71: areturn
        72: goto          21
        75: aconst_null
        76: areturn
      LineNumberTable:
        line 148: 0
        line 149: 4
        line 151: 6
        line 153: 40
        line 154: 70
        line 155: 72
        line 156: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      32     3 petition   Lext/mods/gameserver/model/Petition;
            0      77     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
            0      77     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 5
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/Petition ]
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 250 /* chop */
          offset_delta = 2

  public ext.mods.gameserver.model.Petition getFeedbackPetition(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: aconst_null
         5: areturn
         6: aload_0
         7: getfield      #10                 // Field _petitions:Ljava/util/Map;
        10: invokeinterface #115,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        15: invokeinterface #119,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        20: aload_1
        21: invokedynamic #198,  0            // InvokeDynamic #4:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        26: invokeinterface #125,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        31: invokeinterface #199,  1          // InterfaceMethod java/util/stream/Stream.findAny:()Ljava/util/Optional;
        36: aconst_null
        37: invokevirtual #203                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        40: checkcast     #54                 // class ext/mods/gameserver/model/Petition
        43: areturn
      LineNumberTable:
        line 165: 0
        line 166: 4
        line 168: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
            0      44     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 6 /* same */

  public boolean isActivePetition(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: getfield      #10                 // Field _petitions:Ljava/util/Map;
        10: invokeinterface #115,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        15: invokeinterface #119,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        20: aload_1
        21: invokedynamic #208,  0            // InvokeDynamic #5:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        26: invokeinterface #150,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        31: ireturn
      LineNumberTable:
        line 177: 0
        line 178: 4
        line 180: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
            0      32     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 6 /* same */

  public int submitPetition(ext.mods.gameserver.enums.petitions.PetitionType, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/enums/petitions/PetitionType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=4
         0: new           #54                 // class ext/mods/gameserver/model/Petition
         3: dup
         4: aload_1
         5: aload_2
         6: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         9: aload_3
        10: invokespecial #209                // Method ext/mods/gameserver/model/Petition."<init>":(Lext/mods/gameserver/enums/petitions/PetitionType;ILjava/lang/String;)V
        13: astore        4
        15: aload_0
        16: getfield      #10                 // Field _petitions:Ljava/util/Map;
        19: aload         4
        21: invokevirtual #212                // Method ext/mods/gameserver/model/Petition.getId:()I
        24: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        27: aload         4
        29: invokeinterface #59,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        34: pop
        35: invokestatic  #215                // Method ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
        38: new           #83                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
        41: dup
        42: aload_2
        43: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        46: getstatic     #221                // Field ext/mods/gameserver/enums/SayType.HERO_VOICE:Lext/mods/gameserver/enums/SayType;
        49: ldc           #227                // String Petition System
        51: aload_2
        52: invokevirtual #229                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        55: invokedynamic #233,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        60: invokespecial #237                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
        63: invokevirtual #240                // Method ext/mods/gameserver/data/xml/AdminData.broadcastToGMs:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        66: aload         4
        68: invokevirtual #212                // Method ext/mods/gameserver/model/Petition.getId:()I
        71: ireturn
      LineNumberTable:
        line 192: 0
        line 194: 15
        line 196: 35
        line 198: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      72     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
            0      72     1  type   Lext/mods/gameserver/enums/petitions/PetitionType;
            0      72     2 player   Lext/mods/gameserver/model/actor/Player;
            0      72     3 content   Ljava/lang/String;
           15      57     4 petition   Lext/mods/gameserver/model/Petition;

  public void abortActivePetition(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #244                // Method getPetitionInProcess:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
         5: astore_2
         6: aload_2
         7: ifnull        15
        10: aload_2
        11: aload_1
        12: invokevirtual #248                // Method ext/mods/gameserver/model/Petition.abortConsultation:(Lext/mods/gameserver/model/actor/Player;)V
        15: return
      LineNumberTable:
        line 207: 0
        line 208: 6
        line 209: 10
        line 210: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
            0      16     1 player   Lext/mods/gameserver/model/actor/Player;
            6      10     2 activePetition   Lext/mods/gameserver/model/Petition;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/Petition ]

  public boolean joinPetition(ext.mods.gameserver.model.actor.Player, int, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;IZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: aload_0
         1: aload_1
         2: invokevirtual #252                // Method abortActivePetition:(Lext/mods/gameserver/model/actor/Player;)V
         5: aload_0
         6: getfield      #10                 // Field _petitions:Ljava/util/Map;
         9: iload_2
        10: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        13: invokeinterface #79,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        18: checkcast     #54                 // class ext/mods/gameserver/model/Petition
        21: astore        4
        23: aload         4
        25: ifnull        42
        28: aload         4
        30: aload_1
        31: iload_3
        32: invokevirtual #255                // Method ext/mods/gameserver/model/Petition.join:(Lext/mods/gameserver/model/actor/Player;Z)Z
        35: ifeq          42
        38: iconst_1
        39: goto          43
        42: iconst_0
        43: ireturn
      LineNumberTable:
        line 221: 0
        line 223: 5
        line 224: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
            0      44     1 player   Lext/mods/gameserver/model/actor/Player;
            0      44     2    id   I
            0      44     3 isEnforcing   Z
           23      21     4 petition   Lext/mods/gameserver/model/Petition;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/Petition ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean rejectPetition(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _petitions:Ljava/util/Map;
         4: iload_2
         5: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #79,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #54                 // class ext/mods/gameserver/model/Petition
        16: astore_3
        17: aload_3
        18: ifnull        31
        21: aload_3
        22: invokevirtual #154                // Method ext/mods/gameserver/model/Petition.getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
        25: getstatic     #259                // Field ext/mods/gameserver/enums/petitions/PetitionState.REJECTED:Lext/mods/gameserver/enums/petitions/PetitionState;
        28: if_acmpne     33
        31: iconst_0
        32: ireturn
        33: aload_3
        34: aload_1
        35: invokevirtual #262                // Method ext/mods/gameserver/model/Petition.addResponder:(Lext/mods/gameserver/model/actor/Player;)Z
        38: pop
        39: aload_3
        40: getstatic     #259                // Field ext/mods/gameserver/enums/petitions/PetitionState.REJECTED:Lext/mods/gameserver/enums/petitions/PetitionState;
        43: invokevirtual #266                // Method ext/mods/gameserver/model/Petition.endConsultation:(Lext/mods/gameserver/enums/petitions/PetitionState;)V
        46: iconst_1
        47: ireturn
      LineNumberTable:
        line 235: 0
        line 236: 17
        line 237: 31
        line 239: 33
        line 240: 39
        line 241: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
            0      48     1 player   Lext/mods/gameserver/model/actor/Player;
            0      48     2    id   I
           17      31     3 petition   Lext/mods/gameserver/model/Petition;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/Petition ]
        frame_type = 1 /* same */

  public boolean cancelPendingPetition(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _petitions:Ljava/util/Map;
         4: invokeinterface #115,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #119,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokedynamic #270,  0            // InvokeDynamic #7:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        20: invokeinterface #125,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #199,  1          // InterfaceMethod java/util/stream/Stream.findAny:()Ljava/util/Optional;
        30: aconst_null
        31: invokevirtual #203                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #54                 // class ext/mods/gameserver/model/Petition
        37: astore_2
        38: aload_2
        39: ifnonnull     44
        42: iconst_0
        43: ireturn
        44: aload_2
        45: getstatic     #271                // Field ext/mods/gameserver/enums/petitions/PetitionState.CANCELLED:Lext/mods/gameserver/enums/petitions/PetitionState;
        48: invokevirtual #266                // Method ext/mods/gameserver/model/Petition.endConsultation:(Lext/mods/gameserver/enums/petitions/PetitionState;)V
        51: iconst_1
        52: ireturn
      LineNumberTable:
        line 246: 0
        line 247: 38
        line 248: 42
        line 250: 44
        line 251: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
            0      53     1 player   Lext/mods/gameserver/model/actor/Player;
           38      15     2 petition   Lext/mods/gameserver/model/Petition;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/Petition ]

  public void checkActivePetition(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: invokedynamic #274,  0            // InvokeDynamic #8:test:()Ljava/util/function/Predicate;
        11: invokevirtual #165                // Method getPetitions:(Ljava/util/function/Predicate;)Ljava/util/List;
        14: invokeinterface #169,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        19: astore_2
        20: aload_2
        21: invokeinterface #175,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        26: ifeq          78
        29: aload_2
        30: invokeinterface #180,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        35: checkcast     #54                 // class ext/mods/gameserver/model/Petition
        38: astore_3
        39: aload_3
        40: invokevirtual #183                // Method ext/mods/gameserver/model/Petition.getPetitionerObjectId:()I
        43: aload_1
        44: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        47: if_icmpeq     69
        50: aload_3
        51: invokevirtual #191                // Method ext/mods/gameserver/model/Petition.getResponders:()Ljava/util/List;
        54: aload_1
        55: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        58: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        61: invokeinterface #194,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        66: ifeq          75
        69: aload_3
        70: aload_1
        71: invokevirtual #275                // Method ext/mods/gameserver/model/Petition.showCompleteLog:(Lext/mods/gameserver/model/actor/Player;)V
        74: return
        75: goto          20
        78: return
      LineNumberTable:
        line 262: 0
        line 263: 4
        line 265: 5
        line 267: 39
        line 269: 69
        line 270: 74
        line 272: 75
        line 273: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      36     3 petition   Lext/mods/gameserver/model/Petition;
            0      79     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
            0      79     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 5
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/Petition ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 2

  public void showCompleteLog(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _petitions:Ljava/util/Map;
         4: iload_2
         5: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #79,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #54                 // class ext/mods/gameserver/model/Petition
        16: astore_3
        17: aload_3
        18: ifnonnull     22
        21: return
        22: aload_3
        23: aload_1
        24: invokevirtual #275                // Method ext/mods/gameserver/model/Petition.showCompleteLog:(Lext/mods/gameserver/model/actor/Player;)V
        27: return
      LineNumberTable:
        line 277: 0
        line 278: 17
        line 279: 21
        line 281: 22
        line 282: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
            0      28     1 player   Lext/mods/gameserver/model/actor/Player;
            0      28     2    id   I
           17      11     3 petition   Lext/mods/gameserver/model/Petition;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/Petition ]

  public void clearPetitions();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _petitions:Ljava/util/Map;
         4: invokeinterface #115,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokedynamic #278,  0            // InvokeDynamic #9:accept:()Ljava/util/function/Consumer;
        14: invokeinterface #282,  2          // InterfaceMethod java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
        19: aload_0
        20: getfield      #10                 // Field _petitions:Ljava/util/Map;
        23: invokeinterface #286,  1          // InterfaceMethod java/util/Map.clear:()V
        28: return
      LineNumberTable:
        line 289: 0
        line 291: 19
        line 292: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/data/manager/PetitionManager;

  public void store();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=1
         0: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc_w         #289                // String TRUNCATE petition
         8: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_2
        14: aload_2
        15: invokeinterface #291,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        20: pop
        21: aload_2
        22: ifnull        58
        25: aload_2
        26: invokeinterface #74,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        31: goto          58
        34: astore_3
        35: aload_2
        36: ifnull        56
        39: aload_2
        40: invokeinterface #74,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        45: goto          56
        48: astore        4
        50: aload_3
        51: aload         4
        53: invokevirtual #70                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        56: aload_3
        57: athrow
        58: aload_1
        59: ldc_w         #294                // String INSERT INTO petition (oid, type, petitioner_oid, submit_date, content, is_unread, state, rate, feedback, responders) VALUES (?,?,?,?,?,?,?,?,?,?)
        62: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        67: astore_2
        68: aload_0
        69: getfield      #10                 // Field _petitions:Ljava/util/Map;
        72: invokeinterface #115,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        77: invokeinterface #296,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        82: astore_3
        83: aload_3
        84: invokeinterface #175,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        89: ifeq          336
        92: aload_3
        93: invokeinterface #180,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        98: checkcast     #54                 // class ext/mods/gameserver/model/Petition
       101: astore        4
       103: aload         4
       105: invokevirtual #154                // Method ext/mods/gameserver/model/Petition.getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
       108: getstatic     #158                // Field ext/mods/gameserver/enums/petitions/PetitionState.ACCEPTED:Lext/mods/gameserver/enums/petitions/PetitionState;
       111: if_acmpne     131
       114: aload         4
       116: invokevirtual #297                // Method ext/mods/gameserver/model/Petition.getMessages:()Ljava/util/List;
       119: invokeinterface #300,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       124: ifeq          131
       127: iconst_1
       128: goto          132
       131: iconst_0
       132: istore        5
       134: aload_2
       135: iconst_1
       136: aload         4
       138: invokevirtual #212                // Method ext/mods/gameserver/model/Petition.getId:()I
       141: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       146: aload_2
       147: iconst_2
       148: aload         4
       150: invokevirtual #305                // Method ext/mods/gameserver/model/Petition.getType:()Lext/mods/gameserver/enums/petitions/PetitionType;
       153: invokevirtual #309                // Method ext/mods/gameserver/enums/petitions/PetitionType.toString:()Ljava/lang/String;
       156: invokeinterface #314,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       161: aload_2
       162: iconst_3
       163: aload         4
       165: invokevirtual #183                // Method ext/mods/gameserver/model/Petition.getPetitionerObjectId:()I
       168: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       173: aload_2
       174: iconst_4
       175: aload         4
       177: invokevirtual #318                // Method ext/mods/gameserver/model/Petition.getSubmitDate:()J
       180: invokeinterface #321,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       185: aload_2
       186: iconst_5
       187: aload         4
       189: invokevirtual #325                // Method ext/mods/gameserver/model/Petition.getContent:()Ljava/lang/String;
       192: invokeinterface #314,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       197: aload_2
       198: bipush        6
       200: aload         4
       202: invokevirtual #328                // Method ext/mods/gameserver/model/Petition.isUnread:()Z
       205: ifeq          212
       208: iconst_1
       209: goto          213
       212: iconst_0
       213: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       218: aload_2
       219: bipush        7
       221: iload         5
       223: ifeq          232
       226: ldc_w         #331                // String PENDING
       229: goto          240
       232: aload         4
       234: invokevirtual #154                // Method ext/mods/gameserver/model/Petition.getState:()Lext/mods/gameserver/enums/petitions/PetitionState;
       237: invokevirtual #333                // Method ext/mods/gameserver/enums/petitions/PetitionState.toString:()Ljava/lang/String;
       240: invokeinterface #314,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       245: aload_2
       246: bipush        8
       248: aload         4
       250: invokevirtual #334                // Method ext/mods/gameserver/model/Petition.getRate:()Lext/mods/gameserver/enums/petitions/PetitionRate;
       253: invokevirtual #338                // Method ext/mods/gameserver/enums/petitions/PetitionRate.toString:()Ljava/lang/String;
       256: invokeinterface #314,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       261: aload_2
       262: bipush        9
       264: aload         4
       266: invokevirtual #341                // Method ext/mods/gameserver/model/Petition.getFeedback:()Ljava/lang/String;
       269: invokeinterface #314,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       274: aload_2
       275: bipush        10
       277: iload         5
       279: ifeq          288
       282: ldc_w         #344                // String
       285: goto          322
       288: aload         4
       290: invokevirtual #191                // Method ext/mods/gameserver/model/Petition.getResponders:()Ljava/util/List;
       293: invokeinterface #346,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
       298: invokedynamic #347,  0            // InvokeDynamic #10:apply:()Ljava/util/function/Function;
       303: invokeinterface #351,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
       308: ldc_w         #355                // String ;
       311: invokestatic  #357                // Method java/util/stream/Collectors.joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
       314: invokeinterface #363,  2          // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
       319: checkcast     #367                // class java/lang/String
       322: invokeinterface #314,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       327: aload_2
       328: invokeinterface #369,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       333: goto          83
       336: aload_2
       337: invokeinterface #372,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       342: pop
       343: aload_2
       344: ifnull        380
       347: aload_2
       348: invokeinterface #74,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       353: goto          380
       356: astore_3
       357: aload_2
       358: ifnull        378
       361: aload_2
       362: invokeinterface #74,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       367: goto          378
       370: astore        4
       372: aload_3
       373: aload         4
       375: invokevirtual #70                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       378: aload_3
       379: athrow
       380: aload_1
       381: ldc_w         #376                // String TRUNCATE petition_message
       384: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       389: astore_2
       390: aload_2
       391: invokeinterface #291,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       396: pop
       397: aload_2
       398: ifnull        434
       401: aload_2
       402: invokeinterface #74,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       407: goto          434
       410: astore_3
       411: aload_2
       412: ifnull        432
       415: aload_2
       416: invokeinterface #74,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       421: goto          432
       424: astore        4
       426: aload_3
       427: aload         4
       429: invokevirtual #70                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       432: aload_3
       433: athrow
       434: aload_1
       435: ldc_w         #378                // String INSERT INTO petition_message (id, petition_oid, player_oid, type, player_name, content) VALUES (?,?,?,?,?,?)
       438: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       443: astore_2
       444: aload_0
       445: getfield      #10                 // Field _petitions:Ljava/util/Map;
       448: invokeinterface #115,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       453: invokeinterface #296,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       458: astore_3
       459: aload_3
       460: invokeinterface #175,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       465: ifeq          611
       468: aload_3
       469: invokeinterface #180,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       474: checkcast     #54                 // class ext/mods/gameserver/model/Petition
       477: astore        4
       479: iconst_0
       480: istore        5
       482: aload         4
       484: invokevirtual #297                // Method ext/mods/gameserver/model/Petition.getMessages:()Ljava/util/List;
       487: invokeinterface #169,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       492: astore        6
       494: aload         6
       496: invokeinterface #175,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       501: ifeq          601
       504: aload         6
       506: invokeinterface #180,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       511: checkcast     #83                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
       514: astore        7
       516: aload_2
       517: iconst_1
       518: iload         5
       520: iinc          5, 1
       523: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       528: aload_2
       529: iconst_2
       530: aload         4
       532: invokevirtual #212                // Method ext/mods/gameserver/model/Petition.getId:()I
       535: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       540: aload_2
       541: iconst_3
       542: aload         7
       544: invokevirtual #380                // Method ext/mods/gameserver/network/serverpackets/CreatureSay.getObjectId:()I
       547: invokeinterface #301,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       552: aload_2
       553: iconst_4
       554: aload         7
       556: invokevirtual #381                // Method ext/mods/gameserver/network/serverpackets/CreatureSay.getSayType:()Lext/mods/gameserver/enums/SayType;
       559: invokevirtual #385                // Method ext/mods/gameserver/enums/SayType.toString:()Ljava/lang/String;
       562: invokeinterface #314,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       567: aload_2
       568: iconst_5
       569: aload         7
       571: invokevirtual #386                // Method ext/mods/gameserver/network/serverpackets/CreatureSay.getName:()Ljava/lang/String;
       574: invokeinterface #314,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       579: aload_2
       580: bipush        6
       582: aload         7
       584: invokevirtual #387                // Method ext/mods/gameserver/network/serverpackets/CreatureSay.getContent:()Ljava/lang/String;
       587: invokeinterface #314,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       592: aload_2
       593: invokeinterface #369,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       598: goto          494
       601: aload_2
       602: invokeinterface #372,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       607: pop
       608: goto          459
       611: aload_2
       612: ifnull        648
       615: aload_2
       616: invokeinterface #74,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       621: goto          648
       624: astore_3
       625: aload_2
       626: ifnull        646
       629: aload_2
       630: invokeinterface #74,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       635: goto          646
       638: astore        4
       640: aload_3
       641: aload         4
       643: invokevirtual #70                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       646: aload_3
       647: athrow
       648: aload_1
       649: ifnull        683
       652: aload_1
       653: invokeinterface #90,  1           // InterfaceMethod java/sql/Connection.close:()V
       658: goto          683
       661: astore_2
       662: aload_1
       663: ifnull        681
       666: aload_1
       667: invokeinterface #90,  1           // InterfaceMethod java/sql/Connection.close:()V
       672: goto          681
       675: astore_3
       676: aload_2
       677: aload_3
       678: invokevirtual #70                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       681: aload_2
       682: athrow
       683: goto          697
       686: astore_1
       687: getstatic     #93                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       690: ldc_w         #388                // String Failed to save petitions data.
       693: aload_1
       694: invokevirtual #99                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       697: return
      Exception table:
         from    to  target type
            14    21    34   Class java/lang/Throwable
            39    45    48   Class java/lang/Throwable
            68   343   356   Class java/lang/Throwable
           361   367   370   Class java/lang/Throwable
           390   397   410   Class java/lang/Throwable
           415   421   424   Class java/lang/Throwable
           444   611   624   Class java/lang/Throwable
           629   635   638   Class java/lang/Throwable
             4   648   661   Class java/lang/Throwable
           666   672   675   Class java/lang/Throwable
             0   683   686   Class java/lang/Exception
      LineNumberTable:
        line 296: 0
        line 298: 4
        line 300: 14
        line 301: 21
        line 298: 34
        line 303: 58
        line 305: 68
        line 307: 103
        line 309: 134
        line 310: 146
        line 311: 161
        line 312: 173
        line 313: 185
        line 314: 197
        line 315: 218
        line 316: 245
        line 317: 261
        line 318: 274
        line 319: 327
        line 320: 333
        line 321: 336
        line 322: 343
        line 303: 356
        line 324: 380
        line 326: 390
        line 327: 397
        line 324: 410
        line 329: 434
        line 331: 444
        line 333: 479
        line 335: 482
        line 337: 516
        line 338: 528
        line 339: 540
        line 340: 552
        line 341: 567
        line 342: 579
        line 343: 592
        line 344: 598
        line 345: 601
        line 346: 608
        line 347: 611
        line 329: 624
        line 348: 648
        line 296: 661
        line 352: 683
        line 349: 686
        line 351: 687
        line 353: 697
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      44     2    ps   Ljava/sql/PreparedStatement;
          134     199     5 mustBeReset   Z
          103     230     4 petition   Lext/mods/gameserver/model/Petition;
           68     312     2    ps   Ljava/sql/PreparedStatement;
          390      44     2    ps   Ljava/sql/PreparedStatement;
          516      82     7    cs   Lext/mods/gameserver/network/serverpackets/CreatureSay;
          482     126     5    id   I
          479     129     4 petition   Lext/mods/gameserver/model/Petition;
          444     204     2    ps   Ljava/sql/PreparedStatement;
            4     679     1   con   Ljava/sql/Connection;
          687      10     1     e   Ljava/lang/Exception;
            0     698     0  this   Lext/mods/gameserver/data/manager/PetitionManager;
      StackMapTable: number_of_entries = 36
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ class java/sql/PreparedStatement, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/Petition ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 79
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/util/Iterator, class ext/mods/gameserver/model/Petition, int ]
          stack = [ class java/sql/PreparedStatement, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/util/Iterator, class ext/mods/gameserver/model/Petition, int ]
          stack = [ class java/sql/PreparedStatement, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/util/Iterator, class ext/mods/gameserver/model/Petition, int ]
          stack = [ class java/sql/PreparedStatement, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/util/Iterator, class ext/mods/gameserver/model/Petition, int ]
          stack = [ class java/sql/PreparedStatement, int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/util/Iterator, class ext/mods/gameserver/model/Petition, int ]
          stack = [ class java/sql/PreparedStatement, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/util/Iterator, class ext/mods/gameserver/model/Petition, int ]
          stack = [ class java/sql/PreparedStatement, int, class java/lang/String ]
        frame_type = 248 /* chop */
          offset_delta = 13
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ class java/sql/PreparedStatement, class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/Petition, int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 106
        frame_type = 248 /* chop */
          offset_delta = 9
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/PetitionManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public static ext.mods.gameserver.data.manager.PetitionManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/PetitionManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #390                // Field ext/mods/gameserver/data/manager/PetitionManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/PetitionManager;
         3: areturn
      LineNumberTable:
        line 357: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #100                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/manager/PetitionManager
         6: invokevirtual #413                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #416                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #93                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 48: 0
}
SourceFile: "PetitionManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/PetitionManager$SingletonHolder
BootstrapMethods:
  0: #543 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #502 (Ljava/lang/Object;)Z
      #503 REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$getActivePetitionsCount$0:(Lext/mods/gameserver/model/Petition;)Z
      #506 (Lext/mods/gameserver/model/Petition;)Z
  1: #543 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #502 (Ljava/lang/Object;)Z
      #507 REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$getPetitionsCount$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
      #506 (Lext/mods/gameserver/model/Petition;)Z
  2: #543 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #502 (Ljava/lang/Object;)Z
      #510 REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$isAnyPetitionInProcess$0:(Lext/mods/gameserver/model/Petition;)Z
      #506 (Lext/mods/gameserver/model/Petition;)Z
  3: #543 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #502 (Ljava/lang/Object;)Z
      #513 REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$getPetitionInProcess$0:(Lext/mods/gameserver/model/Petition;)Z
      #506 (Lext/mods/gameserver/model/Petition;)Z
  4: #543 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #502 (Ljava/lang/Object;)Z
      #516 REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$getFeedbackPetition$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
      #506 (Lext/mods/gameserver/model/Petition;)Z
  5: #543 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #502 (Ljava/lang/Object;)Z
      #519 REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$isActivePetition$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
      #506 (Lext/mods/gameserver/model/Petition;)Z
  6: #550 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #522 \u0001 has submitted a new petition.
  7: #543 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #502 (Ljava/lang/Object;)Z
      #524 REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$cancelPendingPetition$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/Petition;)Z
      #506 (Lext/mods/gameserver/model/Petition;)Z
  8: #543 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #502 (Ljava/lang/Object;)Z
      #527 REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$checkActivePetition$0:(Lext/mods/gameserver/model/Petition;)Z
      #506 (Lext/mods/gameserver/model/Petition;)Z
  9: #543 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #530 (Ljava/lang/Object;)V
      #532 REF_invokeStatic ext/mods/gameserver/data/manager/PetitionManager.lambda$clearPetitions$0:(Lext/mods/gameserver/model/Petition;)V
      #535 (Lext/mods/gameserver/model/Petition;)V
  10: #543 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #536 (Ljava/lang/Object;)Ljava/lang/Object;
      #537 REF_invokeStatic java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      #541 (Ljava/lang/Integer;)Ljava/lang/String;
InnerClasses:
  public static final #562= #558 of #560; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
