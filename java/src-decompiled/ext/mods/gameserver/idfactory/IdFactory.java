// Bytecode for: ext.mods.gameserver.idfactory.IdFactory
// File: ext\mods\gameserver\idfactory\IdFactory.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/idfactory/IdFactory.class
  Last modified 9 de jul de 2026; size 14634 bytes
  MD5 checksum c2a4d45a3c82977140cb5d04c9b04a09
  Compiled from "IdFactory.java"
public class ext.mods.gameserver.idfactory.IdFactory
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #1                          // ext/mods/gameserver/idfactory/IdFactory
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 13, attributes: 4
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/idfactory/IdFactory
    #2 = Utf8               ext/mods/gameserver/idfactory/IdFactory
    #3 = Methodref          #4.#5         // java/lang/Object."<init>":()V
    #4 = Class              #6            // java/lang/Object
    #5 = NameAndType        #7:#8         // "<init>":()V
    #6 = Utf8               java/lang/Object
    #7 = Utf8               <init>
    #8 = Utf8               ()V
    #9 = Methodref          #1.#10        // ext/mods/gameserver/idfactory/IdFactory.setAllCharacterOffline:()V
   #10 = NameAndType        #11:#8        // setAllCharacterOffline:()V
   #11 = Utf8               setAllCharacterOffline
   #12 = Methodref          #1.#13        // ext/mods/gameserver/idfactory/IdFactory.cleanUpDB:()V
   #13 = NameAndType        #14:#8        // cleanUpDB:()V
   #14 = Utf8               cleanUpDB
   #15 = Methodref          #1.#16        // ext/mods/gameserver/idfactory/IdFactory.cleanUpTimeStamps:()V
   #16 = NameAndType        #17:#8        // cleanUpTimeStamps:()V
   #17 = Utf8               cleanUpTimeStamps
   #18 = Methodref          #1.#19        // ext/mods/gameserver/idfactory/IdFactory.initialize:()V
   #19 = NameAndType        #20:#8        // initialize:()V
   #20 = Utf8               initialize
   #21 = InvokeDynamic      #0:#22        // #0:run:(Lext/mods/gameserver/idfactory/IdFactory;)Ljava/lang/Runnable;
   #22 = NameAndType        #23:#24       // run:(Lext/mods/gameserver/idfactory/IdFactory;)Ljava/lang/Runnable;
   #23 = Utf8               run
   #24 = Utf8               (Lext/mods/gameserver/idfactory/IdFactory;)Ljava/lang/Runnable;
   #25 = Long               30000l
   #27 = Methodref          #28.#29       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #28 = Class              #30           // ext/mods/commons/pool/ThreadPool
   #29 = NameAndType        #31:#32       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #30 = Utf8               ext/mods/commons/pool/ThreadPool
   #31 = Utf8               scheduleAtFixedRate
   #32 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #33 = Class              #34           // java/util/BitSet
   #34 = Utf8               java/util/BitSet
   #35 = Integer            100000
   #36 = Methodref          #37.#38       // ext/mods/commons/math/PrimeFinder.nextPrime:(I)I
   #37 = Class              #39           // ext/mods/commons/math/PrimeFinder
   #38 = NameAndType        #40:#41       // nextPrime:(I)I
   #39 = Utf8               ext/mods/commons/math/PrimeFinder
   #40 = Utf8               nextPrime
   #41 = Utf8               (I)I
   #42 = Methodref          #33.#43       // java/util/BitSet."<init>":(I)V
   #43 = NameAndType        #7:#44        // "<init>":(I)V
   #44 = Utf8               (I)V
   #45 = Fieldref           #1.#46        // ext/mods/gameserver/idfactory/IdFactory._freeIds:Ljava/util/BitSet;
   #46 = NameAndType        #47:#48       // _freeIds:Ljava/util/BitSet;
   #47 = Utf8               _freeIds
   #48 = Utf8               Ljava/util/BitSet;
   #49 = Class              #50           // java/util/concurrent/atomic/AtomicInteger
   #50 = Utf8               java/util/concurrent/atomic/AtomicInteger
   #51 = Integer            1879048191
   #52 = Methodref          #49.#43       // java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
   #53 = Fieldref           #1.#54        // ext/mods/gameserver/idfactory/IdFactory._freeIdCount:Ljava/util/concurrent/atomic/AtomicInteger;
   #54 = NameAndType        #55:#56       // _freeIdCount:Ljava/util/concurrent/atomic/AtomicInteger;
   #55 = Utf8               _freeIdCount
   #56 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
   #57 = Class              #58           // java/util/ArrayList
   #58 = Utf8               java/util/ArrayList
   #59 = Methodref          #57.#5        // java/util/ArrayList."<init>":()V
   #60 = Methodref          #61.#62       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #61 = Class              #63           // ext/mods/commons/pool/ConnectionPool
   #62 = NameAndType        #64:#65       // getConnection:()Ljava/sql/Connection;
   #63 = Utf8               ext/mods/commons/pool/ConnectionPool
   #64 = Utf8               getConnection
   #65 = Utf8               ()Ljava/sql/Connection;
   #66 = InterfaceMethodref #67.#68       // java/sql/Connection.createStatement:()Ljava/sql/Statement;
   #67 = Class              #69           // java/sql/Connection
   #68 = NameAndType        #70:#71       // createStatement:()Ljava/sql/Statement;
   #69 = Utf8               java/sql/Connection
   #70 = Utf8               createStatement
   #71 = Utf8               ()Ljava/sql/Statement;
   #72 = String             #73           // SELECT obj_Id FROM characters
   #73 = Utf8               SELECT obj_Id FROM characters
   #74 = InterfaceMethodref #75.#76       // java/sql/Statement.executeQuery:(Ljava/lang/String;)Ljava/sql/ResultSet;
   #75 = Class              #77           // java/sql/Statement
   #76 = NameAndType        #78:#79       // executeQuery:(Ljava/lang/String;)Ljava/sql/ResultSet;
   #77 = Utf8               java/sql/Statement
   #78 = Utf8               executeQuery
   #79 = Utf8               (Ljava/lang/String;)Ljava/sql/ResultSet;
   #80 = InterfaceMethodref #81.#82       // java/sql/ResultSet.next:()Z
   #81 = Class              #83           // java/sql/ResultSet
   #82 = NameAndType        #84:#85       // next:()Z
   #83 = Utf8               java/sql/ResultSet
   #84 = Utf8               next
   #85 = Utf8               ()Z
   #86 = InterfaceMethodref #81.#87       // java/sql/ResultSet.getInt:(I)I
   #87 = NameAndType        #88:#41       // getInt:(I)I
   #88 = Utf8               getInt
   #89 = Methodref          #90.#91       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #90 = Class              #92           // java/lang/Integer
   #91 = NameAndType        #93:#94       // valueOf:(I)Ljava/lang/Integer;
   #92 = Utf8               java/lang/Integer
   #93 = Utf8               valueOf
   #94 = Utf8               (I)Ljava/lang/Integer;
   #95 = InterfaceMethodref #96.#97       // java/util/List.add:(Ljava/lang/Object;)Z
   #96 = Class              #98           // java/util/List
   #97 = NameAndType        #99:#100      // add:(Ljava/lang/Object;)Z
   #98 = Utf8               java/util/List
   #99 = Utf8               add
  #100 = Utf8               (Ljava/lang/Object;)Z
  #101 = InterfaceMethodref #81.#102      // java/sql/ResultSet.close:()V
  #102 = NameAndType        #103:#8       // close:()V
  #103 = Utf8               close
  #104 = Class              #105          // java/lang/Throwable
  #105 = Utf8               java/lang/Throwable
  #106 = Methodref          #104.#107     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #107 = NameAndType        #108:#109     // addSuppressed:(Ljava/lang/Throwable;)V
  #108 = Utf8               addSuppressed
  #109 = Utf8               (Ljava/lang/Throwable;)V
  #110 = String             #111          // SELECT object_id FROM items
  #111 = Utf8               SELECT object_id FROM items
  #112 = String             #113          // SELECT clan_id FROM clan_data
  #113 = Utf8               SELECT clan_id FROM clan_data
  #114 = String             #115          // SELECT object_id FROM items_on_ground
  #115 = Utf8               SELECT object_id FROM items_on_ground
  #116 = String             #117          // SELECT id FROM mods_wedding
  #117 = Utf8               SELECT id FROM mods_wedding
  #118 = String             #119          // SELECT oid FROM petition
  #119 = Utf8               SELECT oid FROM petition
  #120 = String             #121          // SELECT area_id FROM autofarm_areas
  #121 = Utf8               SELECT area_id FROM autofarm_areas
  #122 = InterfaceMethodref #75.#102      // java/sql/Statement.close:()V
  #123 = InterfaceMethodref #67.#102      // java/sql/Connection.close:()V
  #124 = Class              #125          // java/lang/Exception
  #125 = Utf8               java/lang/Exception
  #126 = Fieldref           #1.#127       // ext/mods/gameserver/idfactory/IdFactory.LOGGER:Lext/mods/commons/logging/CLogger;
  #127 = NameAndType        #128:#129     // LOGGER:Lext/mods/commons/logging/CLogger;
  #128 = Utf8               LOGGER
  #129 = Utf8               Lext/mods/commons/logging/CLogger;
  #130 = String             #131          // Couldn\'t properly initialize objectIds.
  #131 = Utf8               Couldn\'t properly initialize objectIds.
  #132 = Methodref          #133.#134     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #133 = Class              #135          // ext/mods/commons/logging/CLogger
  #134 = NameAndType        #136:#137     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #135 = Utf8               ext/mods/commons/logging/CLogger
  #136 = Utf8               error
  #137 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #138 = InterfaceMethodref #96.#139      // java/util/List.iterator:()Ljava/util/Iterator;
  #139 = NameAndType        #140:#141     // iterator:()Ljava/util/Iterator;
  #140 = Utf8               iterator
  #141 = Utf8               ()Ljava/util/Iterator;
  #142 = InterfaceMethodref #143.#144     // java/util/Iterator.hasNext:()Z
  #143 = Class              #145          // java/util/Iterator
  #144 = NameAndType        #146:#85      // hasNext:()Z
  #145 = Utf8               java/util/Iterator
  #146 = Utf8               hasNext
  #147 = InterfaceMethodref #143.#148     // java/util/Iterator.next:()Ljava/lang/Object;
  #148 = NameAndType        #84:#149      // next:()Ljava/lang/Object;
  #149 = Utf8               ()Ljava/lang/Object;
  #150 = Methodref          #90.#151      // java/lang/Integer.intValue:()I
  #151 = NameAndType        #152:#153     // intValue:()I
  #152 = Utf8               intValue
  #153 = Utf8               ()I
  #154 = Integer            268435456
  #155 = String             #156          // Found invalid objectId {}. It is less than minimum of {}.
  #156 = Utf8               Found invalid objectId {}. It is less than minimum of {}.
  #157 = Methodref          #133.#158     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #158 = NameAndType        #159:#160     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #159 = Utf8               warn
  #160 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #161 = Methodref          #33.#162      // java/util/BitSet.set:(I)V
  #162 = NameAndType        #163:#44      // set:(I)V
  #163 = Utf8               set
  #164 = Methodref          #49.#165      // java/util/concurrent/atomic/AtomicInteger.decrementAndGet:()I
  #165 = NameAndType        #166:#153     // decrementAndGet:()I
  #166 = Utf8               decrementAndGet
  #167 = Methodref          #33.#168      // java/util/BitSet.nextClearBit:(I)I
  #168 = NameAndType        #169:#41      // nextClearBit:(I)I
  #169 = Utf8               nextClearBit
  #170 = Fieldref           #1.#171       // ext/mods/gameserver/idfactory/IdFactory._nextFreeId:Ljava/util/concurrent/atomic/AtomicInteger;
  #171 = NameAndType        #172:#56      // _nextFreeId:Ljava/util/concurrent/atomic/AtomicInteger;
  #172 = Utf8               _nextFreeId
  #173 = String             #174          // Initializing {} objectIds pool, with {} used ids.
  #174 = Utf8               Initializing {} objectIds pool, with {} used ids.
  #175 = Methodref          #33.#176      // java/util/BitSet.size:()I
  #176 = NameAndType        #177:#153     // size:()I
  #177 = Utf8               size
  #178 = InterfaceMethodref #96.#176      // java/util/List.size:()I
  #179 = Methodref          #133.#180     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #180 = NameAndType        #181:#160     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #181 = Utf8               info
  #182 = Methodref          #33.#183      // java/util/BitSet.clear:(I)V
  #183 = NameAndType        #184:#44      // clear:(I)V
  #184 = Utf8               clear
  #185 = Methodref          #49.#186      // java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
  #186 = NameAndType        #187:#153     // incrementAndGet:()I
  #187 = Utf8               incrementAndGet
  #188 = String             #189          // Release objectId {} failed (< {}).
  #189 = Utf8               Release objectId {} failed (< {}).
  #190 = Methodref          #49.#191      // java/util/concurrent/atomic/AtomicInteger.get:()I
  #191 = NameAndType        #192:#153     // get:()I
  #192 = Utf8               get
  #193 = Methodref          #1.#194       // ext/mods/gameserver/idfactory/IdFactory.increaseBitSetCapacity:()V
  #194 = NameAndType        #195:#8       // increaseBitSetCapacity:()V
  #195 = Utf8               increaseBitSetCapacity
  #196 = Class              #197          // java/lang/NullPointerException
  #197 = Utf8               java/lang/NullPointerException
  #198 = String             #199          // Ran out of valid Id\'s.
  #199 = Utf8               Ran out of valid Id\'s.
  #200 = Methodref          #196.#201     // java/lang/NullPointerException."<init>":(Ljava/lang/String;)V
  #201 = NameAndType        #7:#202       // "<init>":(Ljava/lang/String;)V
  #202 = Utf8               (Ljava/lang/String;)V
  #203 = Methodref          #49.#162      // java/util/concurrent/atomic/AtomicInteger.set:(I)V
  #204 = Methodref          #1.#205       // ext/mods/gameserver/idfactory/IdFactory.usedIdCount:()I
  #205 = NameAndType        #206:#153     // usedIdCount:()I
  #206 = Utf8               usedIdCount
  #207 = Methodref          #33.#208      // java/util/BitSet.or:(Ljava/util/BitSet;)V
  #208 = NameAndType        #209:#210     // or:(Ljava/util/BitSet;)V
  #209 = Utf8               or
  #210 = Utf8               (Ljava/util/BitSet;)V
  #211 = String             #212          // UPDATE characters SET online = 0
  #212 = Utf8               UPDATE characters SET online = 0
  #213 = InterfaceMethodref #67.#214      // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #214 = NameAndType        #215:#216     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #215 = Utf8               prepareStatement
  #216 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #217 = InterfaceMethodref #218.#219     // java/sql/PreparedStatement.executeUpdate:()I
  #218 = Class              #220          // java/sql/PreparedStatement
  #219 = NameAndType        #221:#153     // executeUpdate:()I
  #220 = Utf8               java/sql/PreparedStatement
  #221 = Utf8               executeUpdate
  #222 = InterfaceMethodref #218.#102     // java/sql/PreparedStatement.close:()V
  #223 = String             #224          // Couldn\'t set characters offline.
  #224 = Utf8               Couldn\'t set characters offline.
  #225 = Methodref          #133.#226     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #226 = NameAndType        #159:#137     // warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #227 = String             #228          // Updated characters online status.
  #228 = Utf8               Updated characters online status.
  #229 = Methodref          #133.#230     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #230 = NameAndType        #181:#231     // info:(Ljava/lang/Object;)V
  #231 = Utf8               (Ljava/lang/Object;)V
  #232 = String             #233          // DELETE FROM augmentations WHERE augmentations.item_oid NOT IN (SELECT object_id FROM items);
  #233 = Utf8               DELETE FROM augmentations WHERE augmentations.item_oid NOT IN (SELECT object_id FROM items);
  #234 = InterfaceMethodref #75.#235      // java/sql/Statement.executeUpdate:(Ljava/lang/String;)I
  #235 = NameAndType        #221:#236     // executeUpdate:(Ljava/lang/String;)I
  #236 = Utf8               (Ljava/lang/String;)I
  #237 = String             #238          // DELETE FROM character_hennas WHERE character_hennas.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #238 = Utf8               DELETE FROM character_hennas WHERE character_hennas.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #239 = String             #240          // DELETE FROM character_macroses WHERE character_macroses.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #240 = Utf8               DELETE FROM character_macroses WHERE character_macroses.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #241 = String             #242          // DELETE FROM character_memo WHERE character_memo.charId NOT IN (SELECT obj_Id FROM characters);
  #242 = Utf8               DELETE FROM character_memo WHERE character_memo.charId NOT IN (SELECT obj_Id FROM characters);
  #243 = String             #244          // DELETE FROM character_quests WHERE character_quests.charId NOT IN (SELECT obj_Id FROM characters);
  #244 = Utf8               DELETE FROM character_quests WHERE character_quests.charId NOT IN (SELECT obj_Id FROM characters);
  #245 = String             #246          // DELETE FROM character_raid_points WHERE character_raid_points.char_id NOT IN (SELECT obj_Id FROM characters);
  #246 = Utf8               DELETE FROM character_raid_points WHERE character_raid_points.char_id NOT IN (SELECT obj_Id FROM characters);
  #247 = String             #248          // DELETE FROM character_recipebook WHERE character_recipebook.charId NOT IN (SELECT obj_Id FROM characters);
  #248 = Utf8               DELETE FROM character_recipebook WHERE character_recipebook.charId NOT IN (SELECT obj_Id FROM characters);
  #249 = String             #250          // DELETE FROM character_relations WHERE character_relations.char_id NOT IN (SELECT obj_Id FROM characters);
  #250 = Utf8               DELETE FROM character_relations WHERE character_relations.char_id NOT IN (SELECT obj_Id FROM characters);
  #251 = String             #252          // DELETE FROM character_relations WHERE character_relations.friend_id NOT IN (SELECT obj_Id FROM characters);
  #252 = Utf8               DELETE FROM character_relations WHERE character_relations.friend_id NOT IN (SELECT obj_Id FROM characters);
  #253 = String             #254          // DELETE FROM character_shortcuts WHERE character_shortcuts.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #254 = Utf8               DELETE FROM character_shortcuts WHERE character_shortcuts.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #255 = String             #256          // DELETE FROM character_skills WHERE character_skills.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #256 = Utf8               DELETE FROM character_skills WHERE character_skills.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #257 = String             #258          // DELETE FROM character_skills_save WHERE character_skills_save.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #258 = Utf8               DELETE FROM character_skills_save WHERE character_skills_save.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #259 = String             #260          // DELETE FROM character_subclasses WHERE character_subclasses.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #260 = Utf8               DELETE FROM character_subclasses WHERE character_subclasses.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #261 = String             #262          // DELETE FROM cursed_weapons WHERE cursed_weapons.playerId NOT IN (SELECT obj_Id FROM characters);
  #262 = Utf8               DELETE FROM cursed_weapons WHERE cursed_weapons.playerId NOT IN (SELECT obj_Id FROM characters);
  #263 = String             #264          // DELETE FROM pets WHERE pets.item_obj_id NOT IN (SELECT object_id FROM items UNION SELECT object_id FROM items_on_ground);
  #264 = Utf8               DELETE FROM pets WHERE pets.item_obj_id NOT IN (SELECT object_id FROM items UNION SELECT object_id FROM items_on_ground);
  #265 = String             #266          // DELETE FROM seven_signs WHERE seven_signs.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #266 = Utf8               DELETE FROM seven_signs WHERE seven_signs.char_obj_id NOT IN (SELECT obj_Id FROM characters);
  #267 = String             #268          // DELETE FROM heroes WHERE heroes.char_id NOT IN (SELECT obj_Id FROM characters);
  #268 = Utf8               DELETE FROM heroes WHERE heroes.char_id NOT IN (SELECT obj_Id FROM characters);
  #269 = String             #270          // DELETE FROM olympiad_nobles WHERE olympiad_nobles.char_id NOT IN (SELECT obj_Id FROM characters);
  #270 = Utf8               DELETE FROM olympiad_nobles WHERE olympiad_nobles.char_id NOT IN (SELECT obj_Id FROM characters);
  #271 = String             #272          // DELETE FROM olympiad_nobles_eom WHERE olympiad_nobles_eom.char_id NOT IN (SELECT obj_Id FROM characters);
  #272 = Utf8               DELETE FROM olympiad_nobles_eom WHERE olympiad_nobles_eom.char_id NOT IN (SELECT obj_Id FROM characters);
  #273 = String             #274          // DELETE FROM olympiad_fights WHERE olympiad_fights.charOneId NOT IN (SELECT obj_Id FROM characters);
  #274 = Utf8               DELETE FROM olympiad_fights WHERE olympiad_fights.charOneId NOT IN (SELECT obj_Id FROM characters);
  #275 = String             #276          // DELETE FROM olympiad_fights WHERE olympiad_fights.charTwoId NOT IN (SELECT obj_Id FROM characters);
  #276 = Utf8               DELETE FROM olympiad_fights WHERE olympiad_fights.charTwoId NOT IN (SELECT obj_Id FROM characters);
  #277 = String             #278          // DELETE FROM heroes_diary WHERE heroes_diary.char_id NOT IN (SELECT obj_Id FROM characters);
  #278 = Utf8               DELETE FROM heroes_diary WHERE heroes_diary.char_id NOT IN (SELECT obj_Id FROM characters);
  #279 = String             #280          // DELETE FROM character_offline_trade WHERE charId NOT IN (SELECT charId FROM characters);
  #280 = Utf8               DELETE FROM character_offline_trade WHERE charId NOT IN (SELECT charId FROM characters);
  #281 = String             #282          // DELETE FROM character_offline_trade_items WHERE charId NOT IN (SELECT charId FROM characters);
  #282 = Utf8               DELETE FROM character_offline_trade_items WHERE charId NOT IN (SELECT charId FROM characters);
  #283 = String             #284          // DELETE FROM auctions WHERE clanhall_id IN (SELECT id FROM clanhall WHERE ownerId <> 0 AND sellerClanName=\'\');
  #284 = Utf8               DELETE FROM auctions WHERE clanhall_id IN (SELECT id FROM clanhall WHERE ownerId <> 0 AND sellerClanName=\'\');
  #285 = String             #286          // DELETE FROM clan_data WHERE clan_data.leader_id NOT IN (SELECT obj_Id FROM characters);
  #286 = Utf8               DELETE FROM clan_data WHERE clan_data.leader_id NOT IN (SELECT obj_Id FROM characters);
  #287 = String             #288          // DELETE FROM auctions WHERE auctions.clan_oid NOT IN (SELECT clan_id FROM clan_data);
  #288 = Utf8               DELETE FROM auctions WHERE auctions.clan_oid NOT IN (SELECT clan_id FROM clan_data);
  #289 = String             #290          // DELETE FROM clanhall_functions WHERE clanhall_functions.hall_id NOT IN (SELECT id FROM clanhall WHERE ownerId <> 0);
  #290 = Utf8               DELETE FROM clanhall_functions WHERE clanhall_functions.hall_id NOT IN (SELECT id FROM clanhall WHERE ownerId <> 0);
  #291 = String             #292          // DELETE FROM clan_privs WHERE clan_privs.clan_id NOT IN (SELECT clan_id FROM clan_data);
  #292 = Utf8               DELETE FROM clan_privs WHERE clan_privs.clan_id NOT IN (SELECT clan_id FROM clan_data);
  #293 = String             #294          // DELETE FROM clan_skills WHERE clan_skills.clan_id NOT IN (SELECT clan_id FROM clan_data);
  #294 = Utf8               DELETE FROM clan_skills WHERE clan_skills.clan_id NOT IN (SELECT clan_id FROM clan_data);
  #295 = String             #296          // DELETE FROM clan_subpledges WHERE clan_subpledges.clan_id NOT IN (SELECT clan_id FROM clan_data);
  #296 = Utf8               DELETE FROM clan_subpledges WHERE clan_subpledges.clan_id NOT IN (SELECT clan_id FROM clan_data);
  #297 = String             #298          // DELETE FROM clan_wars WHERE clan_wars.clan1 NOT IN (SELECT clan_id FROM clan_data);
  #298 = Utf8               DELETE FROM clan_wars WHERE clan_wars.clan1 NOT IN (SELECT clan_id FROM clan_data);
  #299 = String             #300          // DELETE FROM clan_wars WHERE clan_wars.clan2 NOT IN (SELECT clan_id FROM clan_data);
  #300 = Utf8               DELETE FROM clan_wars WHERE clan_wars.clan2 NOT IN (SELECT clan_id FROM clan_data);
  #301 = String             #302          // DELETE FROM siege_clans WHERE siege_clans.clan_id NOT IN (SELECT clan_id FROM clan_data);
  #302 = Utf8               DELETE FROM siege_clans WHERE siege_clans.clan_id NOT IN (SELECT clan_id FROM clan_data);
  #303 = String             #304          // DELETE FROM items WHERE items.owner_id NOT IN (SELECT obj_Id FROM characters) AND items.owner_id NOT IN (SELECT clan_id FROM clan_data);
  #304 = Utf8               DELETE FROM items WHERE items.owner_id NOT IN (SELECT obj_Id FROM characters) AND items.owner_id NOT IN (SELECT clan_id FROM clan_data);
  #305 = String             #306          // DELETE FROM bbs_forum WHERE bbs_forum.type=\'CLAN\' AND bbs_forum.owner_id NOT IN (SELECT clan_id FROM clan_data);
  #306 = Utf8               DELETE FROM bbs_forum WHERE bbs_forum.type=\'CLAN\' AND bbs_forum.owner_id NOT IN (SELECT clan_id FROM clan_data);
  #307 = String             #308          // DELETE FROM bbs_forum WHERE bbs_forum.type=\'MEMO\' AND bbs_forum.owner_id NOT IN (SELECT obj_Id FROM characters);
  #308 = Utf8               DELETE FROM bbs_forum WHERE bbs_forum.type=\'MEMO\' AND bbs_forum.owner_id NOT IN (SELECT obj_Id FROM characters);
  #309 = String             #310          // DELETE FROM bbs_topic WHERE bbs_topic.forum_id NOT IN (SELECT id FROM bbs_forum);
  #310 = Utf8               DELETE FROM bbs_topic WHERE bbs_topic.forum_id NOT IN (SELECT id FROM bbs_forum);
  #311 = String             #312          // DELETE FROM bbs_post WHERE bbs_post.forum_id NOT IN (SELECT id FROM bbs_forum);
  #312 = Utf8               DELETE FROM bbs_post WHERE bbs_post.forum_id NOT IN (SELECT id FROM bbs_forum);
  #313 = String             #314          // DELETE FROM bbs_post WHERE bbs_post.topic_id NOT IN (SELECT id FROM bbs_topic);
  #314 = Utf8               DELETE FROM bbs_post WHERE bbs_post.topic_id NOT IN (SELECT id FROM bbs_topic);
  #315 = String             #316          // DELETE FROM bbs_favorite WHERE bbs_favorite.player_id NOT IN (SELECT obj_Id FROM characters);
  #316 = Utf8               DELETE FROM bbs_favorite WHERE bbs_favorite.player_id NOT IN (SELECT obj_Id FROM characters);
  #317 = String             #318          // DELETE FROM bbs_mail WHERE bbs_mail.receiver_id NOT IN (SELECT obj_Id FROM characters);
  #318 = Utf8               DELETE FROM bbs_mail WHERE bbs_mail.receiver_id NOT IN (SELECT obj_Id FROM characters);
  #319 = String             #320          // DELETE FROM petition WHERE petition.petitioner_oid NOT IN (SELECT obj_Id FROM characters);
  #320 = Utf8               DELETE FROM petition WHERE petition.petitioner_oid NOT IN (SELECT obj_Id FROM characters);
  #321 = String             #322          // DELETE FROM petition_message WHERE petition_message.petition_oid NOT IN (SELECT oid FROM petition);
  #322 = Utf8               DELETE FROM petition_message WHERE petition_message.petition_oid NOT IN (SELECT oid FROM petition);
  #323 = String             #324          // UPDATE clan_data SET auction_bid_at = 0 WHERE auction_bid_at NOT IN (SELECT clanhall_id FROM auctions);
  #324 = Utf8               UPDATE clan_data SET auction_bid_at = 0 WHERE auction_bid_at NOT IN (SELECT clanhall_id FROM auctions);
  #325 = String             #326          // UPDATE clan_data SET new_leader_id = 0 WHERE new_leader_id NOT IN (SELECT obj_Id FROM characters);
  #326 = Utf8               UPDATE clan_data SET new_leader_id = 0 WHERE new_leader_id NOT IN (SELECT obj_Id FROM characters);
  #327 = String             #328          // UPDATE clan_subpledges SET leader_id=0 WHERE clan_subpledges.leader_id NOT IN (SELECT obj_Id FROM characters) AND leader_id > 0;
  #328 = Utf8               UPDATE clan_subpledges SET leader_id=0 WHERE clan_subpledges.leader_id NOT IN (SELECT obj_Id FROM characters) AND leader_id > 0;
  #329 = String             #330          // UPDATE castle SET currentTaxPercent=0, nextTaxPercent=0 WHERE castle.id NOT IN (SELECT hasCastle FROM clan_data);
  #330 = Utf8               UPDATE castle SET currentTaxPercent=0, nextTaxPercent=0 WHERE castle.id NOT IN (SELECT hasCastle FROM clan_data);
  #331 = String             #332          // UPDATE characters SET clanid=0 WHERE characters.clanid NOT IN (SELECT clan_id FROM clan_data);
  #332 = Utf8               UPDATE characters SET clanid=0 WHERE characters.clanid NOT IN (SELECT clan_id FROM clan_data);
  #333 = String             #334          // UPDATE clanhall SET ownerId=0, paidUntil=0, paid=0 WHERE clanhall.ownerId NOT IN (SELECT clan_id FROM clan_data);
  #334 = Utf8               UPDATE clanhall SET ownerId=0, paidUntil=0, paid=0 WHERE clanhall.ownerId NOT IN (SELECT clan_id FROM clan_data);
  #335 = String             #336          // Couldn\'t cleanup database.
  #336 = Utf8               Couldn\'t cleanup database.
  #337 = String             #338          // Cleaned {} elements from database.
  #338 = Utf8               Cleaned {} elements from database.
  #339 = String             #340          // DELETE FROM character_skills_save WHERE restore_type = 1 AND systime <= ?
  #340 = Utf8               DELETE FROM character_skills_save WHERE restore_type = 1 AND systime <= ?
  #341 = Methodref          #342.#343     // java/lang/System.currentTimeMillis:()J
  #342 = Class              #344          // java/lang/System
  #343 = NameAndType        #345:#346     // currentTimeMillis:()J
  #344 = Utf8               java/lang/System
  #345 = Utf8               currentTimeMillis
  #346 = Utf8               ()J
  #347 = InterfaceMethodref #218.#348     // java/sql/PreparedStatement.setLong:(IJ)V
  #348 = NameAndType        #349:#350     // setLong:(IJ)V
  #349 = Utf8               setLong
  #350 = Utf8               (IJ)V
  #351 = String             #352          // Couldn\'t cleanup timestamps.
  #352 = Utf8               Couldn\'t cleanup timestamps.
  #353 = String             #354          // Cleaned {} expired timestamps from database.
  #354 = Utf8               Cleaned {} expired timestamps from database.
  #355 = Fieldref           #356.#357     // ext/mods/gameserver/idfactory/IdFactory$SingletonHolder.INSTANCE:Lext/mods/gameserver/idfactory/IdFactory;
  #356 = Class              #358          // ext/mods/gameserver/idfactory/IdFactory$SingletonHolder
  #357 = NameAndType        #359:#360     // INSTANCE:Lext/mods/gameserver/idfactory/IdFactory;
  #358 = Utf8               ext/mods/gameserver/idfactory/IdFactory$SingletonHolder
  #359 = Utf8               INSTANCE
  #360 = Utf8               Lext/mods/gameserver/idfactory/IdFactory;
  #361 = Methodref          #1.#362       // ext/mods/gameserver/idfactory/IdFactory.reachingBitSetCapacity:()Z
  #362 = NameAndType        #363:#85      // reachingBitSetCapacity:()Z
  #363 = Utf8               reachingBitSetCapacity
  #364 = Methodref          #365.#366     // java/lang/Class.getName:()Ljava/lang/String;
  #365 = Class              #367          // java/lang/Class
  #366 = NameAndType        #368:#369     // getName:()Ljava/lang/String;
  #367 = Utf8               java/lang/Class
  #368 = Utf8               getName
  #369 = Utf8               ()Ljava/lang/String;
  #370 = Methodref          #133.#201     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #371 = Utf8               FIRST_OID
  #372 = Utf8               I
  #373 = Utf8               ConstantValue
  #374 = Utf8               LAST_OID
  #375 = Integer            2147483647
  #376 = Utf8               FREE_OBJECT_ID_SIZE
  #377 = Utf8               Code
  #378 = Utf8               LineNumberTable
  #379 = Utf8               LocalVariableTable
  #380 = Utf8               this
  #381 = Utf8               rs
  #382 = Utf8               Ljava/sql/ResultSet;
  #383 = Utf8               st
  #384 = Utf8               Ljava/sql/Statement;
  #385 = Utf8               con
  #386 = Utf8               Ljava/sql/Connection;
  #387 = Utf8               e
  #388 = Utf8               Ljava/lang/Exception;
  #389 = Utf8               objectId
  #390 = Utf8               usedObjectId
  #391 = Utf8               usedObjectIds
  #392 = Utf8               Ljava/util/List;
  #393 = Utf8               LocalVariableTypeTable
  #394 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #395 = Utf8               StackMapTable
  #396 = Utf8               releaseId
  #397 = Utf8               objectID
  #398 = Utf8               getNextId
  #399 = Utf8               newId
  #400 = Utf8               nextFree
  #401 = Utf8               newBitSet
  #402 = Utf8               ps
  #403 = Utf8               Ljava/sql/PreparedStatement;
  #404 = Utf8               stmt
  #405 = Utf8               cleanCount
  #406 = Utf8               getInstance
  #407 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #408 = Utf8               lambda$new$0
  #409 = Utf8               <clinit>
  #410 = Utf8               SourceFile
  #411 = Utf8               IdFactory.java
  #412 = Utf8               NestMembers
  #413 = Utf8               BootstrapMethods
  #414 = MethodType         #8            //  ()V
  #415 = MethodHandle       5:#416        // REF_invokeVirtual ext/mods/gameserver/idfactory/IdFactory.lambda$new$0:()V
  #416 = Methodref          #1.#417       // ext/mods/gameserver/idfactory/IdFactory.lambda$new$0:()V
  #417 = NameAndType        #408:#8       // lambda$new$0:()V
  #418 = MethodHandle       6:#419        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #419 = Methodref          #420.#421     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #420 = Class              #422          // java/lang/invoke/LambdaMetafactory
  #421 = NameAndType        #423:#424     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #422 = Utf8               java/lang/invoke/LambdaMetafactory
  #423 = Utf8               metafactory
  #424 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #425 = Utf8               InnerClasses
  #426 = Utf8               SingletonHolder
  #427 = Class              #428          // java/lang/invoke/MethodHandles$Lookup
  #428 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #429 = Class              #430          // java/lang/invoke/MethodHandles
  #430 = Utf8               java/lang/invoke/MethodHandles
  #431 = Utf8               Lookup
{
  public static final int FIRST_OID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 268435456

  public static final int LAST_OID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2147483647

  public static final int FREE_OBJECT_ID_SIZE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1879048191

  protected ext.mods.gameserver.idfactory.IdFactory();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokespecial #3                  // Method java/lang/Object."<init>":()V
         4: invokestatic  #9                  // Method setAllCharacterOffline:()V
         7: invokestatic  #12                 // Method cleanUpDB:()V
        10: invokestatic  #15                 // Method cleanUpTimeStamps:()V
        13: aload_0
        14: invokevirtual #18                 // Method initialize:()V
        17: aload_0
        18: invokedynamic #21,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/idfactory/IdFactory;)Ljava/lang/Runnable;
        23: ldc2_w        #25                 // long 30000l
        26: ldc2_w        #25                 // long 30000l
        29: invokestatic  #27                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        32: pop
        33: return
      LineNumberTable:
        line 50: 0
        line 51: 4
        line 52: 7
        line 53: 10
        line 55: 13
        line 57: 17
        line 62: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/idfactory/IdFactory;

  public synchronized void releaseId(int);
    descriptor: (I)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=6, locals=2, args_size=2
         0: iload_1
         1: ldc           #154                // int 268435456
         3: isub
         4: iconst_m1
         5: if_icmple     30
         8: aload_0
         9: getfield      #45                 // Field _freeIds:Ljava/util/BitSet;
        12: iload_1
        13: ldc           #154                // int 268435456
        15: isub
        16: invokevirtual #182                // Method java/util/BitSet.clear:(I)V
        19: aload_0
        20: getfield      #53                 // Field _freeIdCount:Ljava/util/concurrent/atomic/AtomicInteger;
        23: invokevirtual #185                // Method java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        26: pop
        27: goto          57
        30: getstatic     #126                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        33: ldc           #188                // String Release objectId {} failed (< {}).
        35: iconst_2
        36: anewarray     #4                  // class java/lang/Object
        39: dup
        40: iconst_0
        41: iload_1
        42: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        45: aastore
        46: dup
        47: iconst_1
        48: ldc           #154                // int 268435456
        50: invokestatic  #89                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        53: aastore
        54: invokevirtual #157                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        57: return
      LineNumberTable:
        line 154: 0
        line 156: 8
        line 157: 19
        line 160: 30
        line 161: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/idfactory/IdFactory;
            0      58     1 objectID   I
      StackMapTable: number_of_entries = 2
        frame_type = 30 /* same */
        frame_type = 26 /* same */

  public synchronized int getNextId();
    descriptor: ()I
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=3, args_size=1
         0: aload_0
         1: getfield      #170                // Field _nextFreeId:Ljava/util/concurrent/atomic/AtomicInteger;
         4: invokevirtual #190                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
         7: istore_1
         8: aload_0
         9: getfield      #45                 // Field _freeIds:Ljava/util/BitSet;
        12: iload_1
        13: invokevirtual #161                // Method java/util/BitSet.set:(I)V
        16: aload_0
        17: getfield      #53                 // Field _freeIdCount:Ljava/util/concurrent/atomic/AtomicInteger;
        20: invokevirtual #164                // Method java/util/concurrent/atomic/AtomicInteger.decrementAndGet:()I
        23: pop
        24: aload_0
        25: getfield      #45                 // Field _freeIds:Ljava/util/BitSet;
        28: iload_1
        29: invokevirtual #167                // Method java/util/BitSet.nextClearBit:(I)I
        32: istore_2
        33: iload_2
        34: ifge          46
        37: aload_0
        38: getfield      #45                 // Field _freeIds:Ljava/util/BitSet;
        41: iconst_0
        42: invokevirtual #167                // Method java/util/BitSet.nextClearBit:(I)I
        45: istore_2
        46: iload_2
        47: ifge          79
        50: aload_0
        51: getfield      #45                 // Field _freeIds:Ljava/util/BitSet;
        54: invokevirtual #175                // Method java/util/BitSet.size:()I
        57: ldc           #51                 // int 1879048191
        59: if_icmpge     69
        62: aload_0
        63: invokevirtual #193                // Method increaseBitSetCapacity:()V
        66: goto          79
        69: new           #196                // class java/lang/NullPointerException
        72: dup
        73: ldc           #198                // String Ran out of valid Id\'s.
        75: invokespecial #200                // Method java/lang/NullPointerException."<init>":(Ljava/lang/String;)V
        78: athrow
        79: aload_0
        80: getfield      #170                // Field _nextFreeId:Ljava/util/concurrent/atomic/AtomicInteger;
        83: iload_2
        84: invokevirtual #203                // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
        87: iload_1
        88: ldc           #154                // int 268435456
        90: iadd
        91: ireturn
      LineNumberTable:
        line 168: 0
        line 170: 8
        line 171: 16
        line 173: 24
        line 175: 33
        line 176: 37
        line 178: 46
        line 180: 50
        line 181: 62
        line 183: 69
        line 186: 79
        line 188: 87
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      92     0  this   Lext/mods/gameserver/idfactory/IdFactory;
            8      84     1 newId   I
           33      59     2 nextFree   I
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 46
          locals = [ int, int ]
        frame_type = 22 /* same */
        frame_type = 9 /* same */

  protected int usedIdCount();
    descriptor: ()I
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _freeIdCount:Ljava/util/concurrent/atomic/AtomicInteger;
         4: invokevirtual #190                // Method java/util/concurrent/atomic/AtomicInteger.get:()I
         7: ldc           #154                // int 268435456
         9: isub
        10: ireturn
      LineNumberTable:
        line 196: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/idfactory/IdFactory;

  protected synchronized boolean reachingBitSetCapacity();
    descriptor: ()Z
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #204                // Method usedIdCount:()I
         4: bipush        11
         6: imul
         7: bipush        10
         9: idiv
        10: invokestatic  #36                 // Method ext/mods/commons/math/PrimeFinder.nextPrime:(I)I
        13: aload_0
        14: getfield      #45                 // Field _freeIds:Ljava/util/BitSet;
        17: invokevirtual #175                // Method java/util/BitSet.size:()I
        20: if_icmple     27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 204: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/idfactory/IdFactory;
      StackMapTable: number_of_entries = 2
        frame_type = 27 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected synchronized void increaseBitSetCapacity();
    descriptor: ()V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=4, locals=2, args_size=1
         0: new           #33                 // class java/util/BitSet
         3: dup
         4: aload_0
         5: invokevirtual #204                // Method usedIdCount:()I
         8: bipush        11
        10: imul
        11: bipush        10
        13: idiv
        14: invokestatic  #36                 // Method ext/mods/commons/math/PrimeFinder.nextPrime:(I)I
        17: invokespecial #42                 // Method java/util/BitSet."<init>":(I)V
        20: astore_1
        21: aload_1
        22: aload_0
        23: getfield      #45                 // Field _freeIds:Ljava/util/BitSet;
        26: invokevirtual #207                // Method java/util/BitSet.or:(Ljava/util/BitSet;)V
        29: aload_0
        30: aload_1
        31: putfield      #45                 // Field _freeIds:Ljava/util/BitSet;
        34: return
      LineNumberTable:
        line 212: 0
        line 213: 21
        line 214: 29
        line 215: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/idfactory/IdFactory;
           21      14     1 newBitSet   Ljava/util/BitSet;

  public static final ext.mods.gameserver.idfactory.IdFactory getInstance();
    descriptor: ()Lext/mods/gameserver/idfactory/IdFactory;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #355                // Field ext/mods/gameserver/idfactory/IdFactory$SingletonHolder.INSTANCE:Lext/mods/gameserver/idfactory/IdFactory;
         3: areturn
      LineNumberTable:
        line 335: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #133                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #1                  // class ext/mods/gameserver/idfactory/IdFactory
         6: invokevirtual #364                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #370                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #126                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 39: 0
}
SourceFile: "IdFactory.java"
NestMembers:
  ext/mods/gameserver/idfactory/IdFactory$SingletonHolder
BootstrapMethods:
  0: #418 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #414 ()V
      #415 REF_invokeVirtual ext/mods/gameserver/idfactory/IdFactory.lambda$new$0:()V
      #414 ()V
InnerClasses:
  public static final #431= #427 of #429; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
