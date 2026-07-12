// Bytecode for: ext.mods.gameserver.model.zone.type.BossZone
// File: ext\mods\gameserver\model\zone\type\BossZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/BossZone.class
  Last modified 9 de jul de 2026; size 6750 bytes
  MD5 checksum 9c4265edcf0c9b92059099ac395821cd
  Compiled from "BossZone.java"
public class ext.mods.gameserver.model.zone.type.BossZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/zone/type/BossZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 5, methods: 9, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#10        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = NameAndType        #5:#11        // "<init>":()V
   #11 = Utf8               ()V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/zone/type/BossZone._allowedPlayersEntryTime:Ljava/util/Map;
   #13 = Class              #15           // ext/mods/gameserver/model/zone/type/BossZone
   #14 = NameAndType        #16:#17       // _allowedPlayersEntryTime:Ljava/util/Map;
   #15 = Utf8               ext/mods/gameserver/model/zone/type/BossZone
   #16 = Utf8               _allowedPlayersEntryTime
   #17 = Utf8               Ljava/util/Map;
   #18 = Methodref          #7.#19        // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #19 = NameAndType        #20:#21       // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #20 = Utf8               newKeySet
   #21 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #22 = Fieldref           #13.#23       // ext/mods/gameserver/model/zone/type/BossZone._allowedPlayers:Ljava/util/Set;
   #23 = NameAndType        #24:#25       // _allowedPlayers:Ljava/util/Set;
   #24 = Utf8               _allowedPlayers
   #25 = Utf8               Ljava/util/Set;
   #26 = Fieldref           #13.#27       // ext/mods/gameserver/model/zone/type/BossZone._oustLoc:[I
   #27 = NameAndType        #28:#29       // _oustLoc:[I
   #28 = Utf8               _oustLoc
   #29 = Utf8               [I
   #30 = Methodref          #31.#32       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #31 = Class              #33           // ext/mods/commons/pool/ConnectionPool
   #32 = NameAndType        #34:#35       // getConnection:()Ljava/sql/Connection;
   #33 = Utf8               ext/mods/commons/pool/ConnectionPool
   #34 = Utf8               getConnection
   #35 = Utf8               ()Ljava/sql/Connection;
   #36 = String             #37           // SELECT * FROM grandboss_list WHERE zone = ?
   #37 = Utf8               SELECT * FROM grandboss_list WHERE zone = ?
   #38 = InterfaceMethodref #39.#40       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #39 = Class              #41           // java/sql/Connection
   #40 = NameAndType        #42:#43       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #41 = Utf8               java/sql/Connection
   #42 = Utf8               prepareStatement
   #43 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #44 = InterfaceMethodref #45.#46       // java/sql/PreparedStatement.setInt:(II)V
   #45 = Class              #47           // java/sql/PreparedStatement
   #46 = NameAndType        #48:#49       // setInt:(II)V
   #47 = Utf8               java/sql/PreparedStatement
   #48 = Utf8               setInt
   #49 = Utf8               (II)V
   #50 = InterfaceMethodref #45.#51       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #51 = NameAndType        #52:#53       // executeQuery:()Ljava/sql/ResultSet;
   #52 = Utf8               executeQuery
   #53 = Utf8               ()Ljava/sql/ResultSet;
   #54 = InterfaceMethodref #55.#56       // java/sql/ResultSet.next:()Z
   #55 = Class              #57           // java/sql/ResultSet
   #56 = NameAndType        #58:#59       // next:()Z
   #57 = Utf8               java/sql/ResultSet
   #58 = Utf8               next
   #59 = Utf8               ()Z
   #60 = String             #61           // player_id
   #61 = Utf8               player_id
   #62 = InterfaceMethodref #55.#63       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #63 = NameAndType        #64:#65       // getInt:(Ljava/lang/String;)I
   #64 = Utf8               getInt
   #65 = Utf8               (Ljava/lang/String;)I
   #66 = Methodref          #13.#67       // ext/mods/gameserver/model/zone/type/BossZone.allowPlayerEntry:(I)V
   #67 = NameAndType        #68:#6        // allowPlayerEntry:(I)V
   #68 = Utf8               allowPlayerEntry
   #69 = InterfaceMethodref #55.#70       // java/sql/ResultSet.close:()V
   #70 = NameAndType        #71:#11       // close:()V
   #71 = Utf8               close
   #72 = Class              #73           // java/lang/Throwable
   #73 = Utf8               java/lang/Throwable
   #74 = Methodref          #72.#75       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #75 = NameAndType        #76:#77       // addSuppressed:(Ljava/lang/Throwable;)V
   #76 = Utf8               addSuppressed
   #77 = Utf8               (Ljava/lang/Throwable;)V
   #78 = InterfaceMethodref #45.#70       // java/sql/PreparedStatement.close:()V
   #79 = InterfaceMethodref #39.#70       // java/sql/Connection.close:()V
   #80 = Class              #81           // java/lang/Exception
   #81 = Utf8               java/lang/Exception
   #82 = Fieldref           #13.#83       // ext/mods/gameserver/model/zone/type/BossZone.LOGGER:Lext/mods/commons/logging/CLogger;
   #83 = NameAndType        #84:#85       // LOGGER:Lext/mods/commons/logging/CLogger;
   #84 = Utf8               LOGGER
   #85 = Utf8               Lext/mods/commons/logging/CLogger;
   #86 = String             #87           // Couldn\'t load players for {}.
   #87 = Utf8               Couldn\'t load players for {}.
   #88 = Class              #89           // java/lang/Object
   #89 = Utf8               java/lang/Object
   #90 = Methodref          #13.#91       // ext/mods/gameserver/model/zone/type/BossZone.toString:()Ljava/lang/String;
   #91 = NameAndType        #92:#93       // toString:()Ljava/lang/String;
   #92 = Utf8               toString
   #93 = Utf8               ()Ljava/lang/String;
   #94 = Methodref          #95.#96       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #95 = Class              #97           // ext/mods/commons/logging/CLogger
   #96 = NameAndType        #98:#99       // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #97 = Utf8               ext/mods/commons/logging/CLogger
   #98 = Utf8               error
   #99 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #100 = String             #101          // InvadeTime
  #101 = Utf8               InvadeTime
  #102 = Methodref          #103.#104     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #103 = Class              #105          // java/lang/String
  #104 = NameAndType        #106:#107     // equals:(Ljava/lang/Object;)Z
  #105 = Utf8               java/lang/String
  #106 = Utf8               equals
  #107 = Utf8               (Ljava/lang/Object;)Z
  #108 = Methodref          #109.#110     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #109 = Class              #111          // java/lang/Integer
  #110 = NameAndType        #112:#65      // parseInt:(Ljava/lang/String;)I
  #111 = Utf8               java/lang/Integer
  #112 = Utf8               parseInt
  #113 = Fieldref           #13.#114      // ext/mods/gameserver/model/zone/type/BossZone._invadeTime:I
  #114 = NameAndType        #115:#116     // _invadeTime:I
  #115 = Utf8               _invadeTime
  #116 = Utf8               I
  #117 = String             #118          // oustX
  #118 = Utf8               oustX
  #119 = String             #120          // oustY
  #120 = Utf8               oustY
  #121 = String             #122          // oustZ
  #122 = Utf8               oustZ
  #123 = Methodref          #2.#124       // ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
  #124 = NameAndType        #125:#126     // setParameter:(Ljava/lang/String;Ljava/lang/String;)V
  #125 = Utf8               setParameter
  #126 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #127 = Fieldref           #128.#129     // ext/mods/gameserver/enums/ZoneId.BOSS:Lext/mods/gameserver/enums/ZoneId;
  #128 = Class              #130          // ext/mods/gameserver/enums/ZoneId
  #129 = NameAndType        #131:#132     // BOSS:Lext/mods/gameserver/enums/ZoneId;
  #130 = Utf8               ext/mods/gameserver/enums/ZoneId
  #131 = Utf8               BOSS
  #132 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #133 = Methodref          #134.#135     // ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #134 = Class              #136          // ext/mods/gameserver/model/actor/Creature
  #135 = NameAndType        #137:#138     // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #136 = Utf8               ext/mods/gameserver/model/actor/Creature
  #137 = Utf8               setInsideZone
  #138 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #139 = Class              #140          // ext/mods/gameserver/model/actor/Player
  #140 = Utf8               ext/mods/gameserver/model/actor/Player
  #141 = Fieldref           #128.#142     // ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #142 = NameAndType        #143:#132     // NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #143 = Utf8               NO_SUMMON_FRIEND
  #144 = Methodref          #139.#135     // ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #145 = Methodref          #139.#146     // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #146 = NameAndType        #147:#59      // isGM:()Z
  #147 = Utf8               isGM
  #148 = Fieldref           #149.#150     // ext/mods/Config.ALLOW_GRAND_BOSSES_TELEPORT:Z
  #149 = Class              #151          // ext/mods/Config
  #150 = NameAndType        #152:#153     // ALLOW_GRAND_BOSSES_TELEPORT:Z
  #151 = Utf8               ext/mods/Config
  #152 = Utf8               ALLOW_GRAND_BOSSES_TELEPORT
  #153 = Utf8               Z
  #154 = Methodref          #139.#155     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #155 = NameAndType        #156:#157     // getObjectId:()I
  #156 = Utf8               getObjectId
  #157 = Utf8               ()I
  #158 = Methodref          #109.#159     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #159 = NameAndType        #160:#161     // valueOf:(I)Ljava/lang/Integer;
  #160 = Utf8               valueOf
  #161 = Utf8               (I)Ljava/lang/Integer;
  #162 = InterfaceMethodref #163.#164     // java/util/Set.contains:(Ljava/lang/Object;)Z
  #163 = Class              #165          // java/util/Set
  #164 = NameAndType        #166:#107     // contains:(Ljava/lang/Object;)Z
  #165 = Utf8               java/util/Set
  #166 = Utf8               contains
  #167 = InterfaceMethodref #168.#169     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #168 = Class              #170          // java/util/Map
  #169 = NameAndType        #171:#172     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #170 = Utf8               java/util/Map
  #171 = Utf8               remove
  #172 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #173 = Class              #174          // java/lang/Long
  #174 = Utf8               java/lang/Long
  #175 = Methodref          #173.#176     // java/lang/Long.longValue:()J
  #176 = NameAndType        #177:#178     // longValue:()J
  #177 = Utf8               longValue
  #178 = Utf8               ()J
  #179 = Methodref          #180.#181     // java/lang/System.currentTimeMillis:()J
  #180 = Class              #182          // java/lang/System
  #181 = NameAndType        #183:#178     // currentTimeMillis:()J
  #182 = Utf8               java/lang/System
  #183 = Utf8               currentTimeMillis
  #184 = InterfaceMethodref #163.#185     // java/util/Set.remove:(Ljava/lang/Object;)Z
  #185 = NameAndType        #171:#107     // remove:(Ljava/lang/Object;)Z
  #186 = Class              #187          // ext/mods/gameserver/model/actor/Playable
  #187 = Utf8               ext/mods/gameserver/model/actor/Playable
  #188 = Methodref          #139.#189     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #189 = NameAndType        #190:#59      // isOnline:()Z
  #190 = Utf8               isOnline
  #191 = Methodref          #173.#192     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #192 = NameAndType        #160:#193     // valueOf:(J)Ljava/lang/Long;
  #193 = Utf8               (J)Ljava/lang/Long;
  #194 = InterfaceMethodref #168.#195     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #195 = NameAndType        #196:#197     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #196 = Utf8               put
  #197 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #198 = InterfaceMethodref #168.#199     // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #199 = NameAndType        #200:#107     // containsKey:(Ljava/lang/Object;)Z
  #200 = Utf8               containsKey
  #201 = Fieldref           #13.#202      // ext/mods/gameserver/model/zone/type/BossZone._creatures:Ljava/util/Set;
  #202 = NameAndType        #203:#25      // _creatures:Ljava/util/Set;
  #203 = Utf8               _creatures
  #204 = InterfaceMethodref #163.#205     // java/util/Set.isEmpty:()Z
  #205 = NameAndType        #206:#59      // isEmpty:()Z
  #206 = Utf8               isEmpty
  #207 = Methodref          #13.#208      // ext/mods/gameserver/model/zone/type/BossZone.getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
  #208 = NameAndType        #209:#210     // getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
  #209 = Utf8               getKnownTypeInside
  #210 = Utf8               (Ljava/lang/Class;)Ljava/util/List;
  #211 = InterfaceMethodref #212.#205     // java/util/List.isEmpty:()Z
  #212 = Class              #213          // java/util/List
  #213 = Utf8               java/util/List
  #214 = Class              #215          // ext/mods/gameserver/model/actor/Attackable
  #215 = Utf8               ext/mods/gameserver/model/actor/Attackable
  #216 = InterfaceMethodref #212.#217     // java/util/List.iterator:()Ljava/util/Iterator;
  #217 = NameAndType        #218:#219     // iterator:()Ljava/util/Iterator;
  #218 = Utf8               iterator
  #219 = Utf8               ()Ljava/util/Iterator;
  #220 = InterfaceMethodref #221.#222     // java/util/Iterator.hasNext:()Z
  #221 = Class              #223          // java/util/Iterator
  #222 = NameAndType        #224:#59      // hasNext:()Z
  #223 = Utf8               java/util/Iterator
  #224 = Utf8               hasNext
  #225 = InterfaceMethodref #221.#226     // java/util/Iterator.next:()Ljava/lang/Object;
  #226 = NameAndType        #58:#227      // next:()Ljava/lang/Object;
  #227 = Utf8               ()Ljava/lang/Object;
  #228 = Methodref          #214.#229     // ext/mods/gameserver/model/actor/Attackable.isRaidRelated:()Z
  #229 = NameAndType        #230:#59      // isRaidRelated:()Z
  #230 = Utf8               isRaidRelated
  #231 = Methodref          #214.#232     // ext/mods/gameserver/model/actor/Attackable.returnHome:()Z
  #232 = NameAndType        #233:#59      // returnHome:()Z
  #233 = Utf8               returnHome
  #234 = InterfaceMethodref #163.#235     // java/util/Set.add:(Ljava/lang/Object;)Z
  #235 = NameAndType        #236:#107     // add:(Ljava/lang/Object;)Z
  #236 = Utf8               add
  #237 = Methodref          #139.#238     // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #238 = NameAndType        #239:#240     // teleportTo:(IIII)Z
  #239 = Utf8               teleportTo
  #240 = Utf8               (IIII)Z
  #241 = Fieldref           #242.#243     // ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
  #242 = Class              #244          // ext/mods/gameserver/enums/RestartType
  #243 = NameAndType        #245:#246     // TOWN:Lext/mods/gameserver/enums/RestartType;
  #244 = Utf8               ext/mods/gameserver/enums/RestartType
  #245 = Utf8               TOWN
  #246 = Utf8               Lext/mods/gameserver/enums/RestartType;
  #247 = Methodref          #139.#248     // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
  #248 = NameAndType        #239:#249     // teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
  #249 = Utf8               (Lext/mods/gameserver/enums/RestartType;)V
  #250 = InterfaceMethodref #168.#251     // java/util/Map.clear:()V
  #251 = NameAndType        #252:#11      // clear:()V
  #252 = Utf8               clear
  #253 = InterfaceMethodref #163.#251     // java/util/Set.clear:()V
  #254 = Utf8               SELECT_GRAND_BOSS_LIST
  #255 = Utf8               Ljava/lang/String;
  #256 = Utf8               ConstantValue
  #257 = Utf8               Signature
  #258 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #259 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #260 = Utf8               Code
  #261 = Utf8               LineNumberTable
  #262 = Utf8               LocalVariableTable
  #263 = Utf8               rs
  #264 = Utf8               Ljava/sql/ResultSet;
  #265 = Utf8               ps
  #266 = Utf8               Ljava/sql/PreparedStatement;
  #267 = Utf8               con
  #268 = Utf8               Ljava/sql/Connection;
  #269 = Utf8               e
  #270 = Utf8               Ljava/lang/Exception;
  #271 = Utf8               this
  #272 = Utf8               Lext/mods/gameserver/model/zone/type/BossZone;
  #273 = Utf8               id
  #274 = Utf8               StackMapTable
  #275 = Utf8               name
  #276 = Utf8               value
  #277 = Utf8               onEnter
  #278 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #279 = Utf8               entryTime
  #280 = Utf8               J
  #281 = Utf8               player
  #282 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #283 = Utf8               creature
  #284 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #285 = Utf8               onExit
  #286 = Utf8               raid
  #287 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #288 = Utf8               attackable
  #289 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #290 = Utf8               duration
  #291 = Utf8               playerId
  #292 = Utf8               removePlayer
  #293 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #294 = Utf8               getAllowedPlayers
  #295 = Utf8               ()Ljava/util/Set;
  #296 = Utf8               ()Ljava/util/Set<Ljava/lang/Integer;>;
  #297 = Utf8               oustAllPlayers
  #298 = Utf8               ()Ljava/util/List;
  #299 = Utf8               players
  #300 = Utf8               Ljava/util/List;
  #301 = Utf8               LocalVariableTypeTable
  #302 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #303 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #304 = Utf8               SourceFile
  #305 = Utf8               BossZone.java
  #306 = Utf8               InnerClasses
  #307 = Class              #308          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #308 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #309 = Utf8               KeySetView
{
  public ext.mods.gameserver.model.zone.type.BossZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: aload_0
         6: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         9: dup
        10: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        13: putfield      #12                 // Field _allowedPlayersEntryTime:Ljava/util/Map;
        16: aload_0
        17: invokestatic  #18                 // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        20: putfield      #22                 // Field _allowedPlayers:Ljava/util/Set;
        23: aload_0
        24: iconst_3
        25: newarray       int
        27: putfield      #26                 // Field _oustLoc:[I
        30: invokestatic  #30                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        33: astore_2
        34: aload_2
        35: ldc           #36                 // String SELECT * FROM grandboss_list WHERE zone = ?
        37: invokeinterface #38,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        42: astore_3
        43: aload_3
        44: iconst_1
        45: iload_1
        46: invokeinterface #44,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        51: aload_3
        52: invokeinterface #50,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        57: astore        4
        59: aload         4
        61: invokeinterface #54,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        66: ifeq          85
        69: aload_0
        70: aload         4
        72: ldc           #60                 // String player_id
        74: invokeinterface #62,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        79: invokevirtual #66                 // Method allowPlayerEntry:(I)V
        82: goto          59
        85: aload         4
        87: ifnull        129
        90: aload         4
        92: invokeinterface #69,  1           // InterfaceMethod java/sql/ResultSet.close:()V
        97: goto          129
       100: astore        5
       102: aload         4
       104: ifnull        126
       107: aload         4
       109: invokeinterface #69,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       114: goto          126
       117: astore        6
       119: aload         5
       121: aload         6
       123: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       126: aload         5
       128: athrow
       129: aload_3
       130: ifnull        169
       133: aload_3
       134: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       139: goto          169
       142: astore        4
       144: aload_3
       145: ifnull        166
       148: aload_3
       149: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       154: goto          166
       157: astore        5
       159: aload         4
       161: aload         5
       163: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       166: aload         4
       168: athrow
       169: aload_2
       170: ifnull        206
       173: aload_2
       174: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       179: goto          206
       182: astore_3
       183: aload_2
       184: ifnull        204
       187: aload_2
       188: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       193: goto          204
       196: astore        4
       198: aload_3
       199: aload         4
       201: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       204: aload_3
       205: athrow
       206: goto          230
       209: astore_2
       210: getstatic     #82                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       213: ldc           #86                 // String Couldn\'t load players for {}.
       215: aload_2
       216: iconst_1
       217: anewarray     #88                 // class java/lang/Object
       220: dup
       221: iconst_0
       222: aload_0
       223: invokevirtual #90                 // Method toString:()Ljava/lang/String;
       226: aastore
       227: invokevirtual #94                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       230: return
      Exception table:
         from    to  target type
            59    85   100   Class java/lang/Throwable
           107   114   117   Class java/lang/Throwable
            43   129   142   Class java/lang/Throwable
           148   154   157   Class java/lang/Throwable
            34   169   182   Class java/lang/Throwable
           187   193   196   Class java/lang/Throwable
            30   206   209   Class java/lang/Exception
      LineNumberTable:
        line 58: 0
        line 48: 5
        line 50: 16
        line 52: 23
        line 60: 30
        line 61: 34
        line 63: 43
        line 65: 51
        line 67: 59
        line 68: 69
        line 69: 85
        line 65: 100
        line 70: 129
        line 60: 142
        line 70: 169
        line 60: 182
        line 74: 206
        line 71: 209
        line 73: 210
        line 75: 230
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59      70     4    rs   Ljava/sql/ResultSet;
           43     126     3    ps   Ljava/sql/PreparedStatement;
           34     172     2   con   Ljava/sql/Connection;
          210      20     2     e   Ljava/lang/Exception;
            0     231     0  this   Lext/mods/gameserver/model/zone/type/BossZone;
            0     231     1    id   I
      StackMapTable: number_of_entries = 16
        frame_type = 255 /* full_frame */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/model/zone/type/BossZone, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 25 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/zone/type/BossZone, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/zone/type/BossZone, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/zone/type/BossZone, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 20 /* same */

  public void setParameter(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ldc           #100                // String InvadeTime
         3: invokevirtual #102                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          20
         9: aload_0
        10: aload_2
        11: invokestatic  #108                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        14: putfield      #113                // Field _invadeTime:I
        17: goto          92
        20: aload_1
        21: ldc           #117                // String oustX
        23: invokevirtual #102                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        26: ifeq          42
        29: aload_0
        30: getfield      #26                 // Field _oustLoc:[I
        33: iconst_0
        34: aload_2
        35: invokestatic  #108                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        38: iastore
        39: goto          92
        42: aload_1
        43: ldc           #119                // String oustY
        45: invokevirtual #102                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        48: ifeq          64
        51: aload_0
        52: getfield      #26                 // Field _oustLoc:[I
        55: iconst_1
        56: aload_2
        57: invokestatic  #108                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        60: iastore
        61: goto          92
        64: aload_1
        65: ldc           #121                // String oustZ
        67: invokevirtual #102                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        70: ifeq          86
        73: aload_0
        74: getfield      #26                 // Field _oustLoc:[I
        77: iconst_2
        78: aload_2
        79: invokestatic  #108                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        82: iastore
        83: goto          92
        86: aload_0
        87: aload_1
        88: aload_2
        89: invokespecial #123                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
        92: return
      LineNumberTable:
        line 80: 0
        line 81: 9
        line 82: 20
        line 83: 29
        line 84: 42
        line 85: 51
        line 86: 64
        line 87: 73
        line 89: 86
        line 90: 92
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      93     0  this   Lext/mods/gameserver/model/zone/type/BossZone;
            0      93     1  name   Ljava/lang/String;
            0      93     2 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 5
        frame_type = 20 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 5 /* same */

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=6, args_size=2
         0: aload_1
         1: getstatic     #127                // Field ext/mods/gameserver/enums/ZoneId.BOSS:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_1
         5: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: aload_1
         9: instanceof    #139                // class ext/mods/gameserver/model/actor/Player
        12: ifeq          115
        15: aload_1
        16: checkcast     #139                // class ext/mods/gameserver/model/actor/Player
        19: astore_2
        20: aload_2
        21: getstatic     #141                // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
        24: iconst_1
        25: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        28: aload_2
        29: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        32: ifne          48
        35: aload_0
        36: getfield      #113                // Field _invadeTime:I
        39: ifeq          48
        42: getstatic     #148                // Field ext/mods/Config.ALLOW_GRAND_BOSSES_TELEPORT:Z
        45: ifeq          49
        48: return
        49: aload_2
        50: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        53: istore_3
        54: aload_0
        55: getfield      #22                 // Field _allowedPlayers:Ljava/util/Set;
        58: iload_3
        59: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        62: invokeinterface #162,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        67: ifeq          115
        70: aload_0
        71: getfield      #12                 // Field _allowedPlayersEntryTime:Ljava/util/Map;
        74: iload_3
        75: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        78: invokeinterface #167,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        83: checkcast     #173                // class java/lang/Long
        86: invokevirtual #175                // Method java/lang/Long.longValue:()J
        89: lstore        4
        91: lload         4
        93: invokestatic  #179                // Method java/lang/System.currentTimeMillis:()J
        96: lcmp
        97: ifle          101
       100: return
       101: aload_0
       102: getfield      #22                 // Field _allowedPlayers:Ljava/util/Set;
       105: iload_3
       106: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       109: invokeinterface #184,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
       114: pop
       115: return
      LineNumberTable:
        line 95: 0
        line 97: 8
        line 99: 20
        line 101: 28
        line 102: 48
        line 104: 49
        line 106: 54
        line 108: 70
        line 109: 91
        line 110: 100
        line 112: 101
        line 115: 115
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           91      24     4 entryTime   J
           54      61     3    id   I
           20      95     2 player   Lext/mods/gameserver/model/actor/Player;
            0     116     0  this   Lext/mods/gameserver/model/zone/type/BossZone;
            0     116     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 51
          locals = [ int, long ]
        frame_type = 248 /* chop */
          offset_delta = 13

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=5, args_size=2
         0: aload_1
         1: getstatic     #127                // Field ext/mods/gameserver/enums/ZoneId.BOSS:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_0
         5: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: aload_1
         9: instanceof    #186                // class ext/mods/gameserver/model/actor/Playable
        12: ifeq          225
        15: aload_1
        16: instanceof    #139                // class ext/mods/gameserver/model/actor/Player
        19: ifeq          143
        22: aload_1
        23: checkcast     #139                // class ext/mods/gameserver/model/actor/Player
        26: astore_3
        27: aload_3
        28: getstatic     #141                // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
        31: iconst_0
        32: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        35: aload_3
        36: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        39: ifne          49
        42: aload_0
        43: getfield      #113                // Field _invadeTime:I
        46: ifne          50
        49: return
        50: aload_3
        51: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        54: istore        4
        56: aload_0
        57: getfield      #22                 // Field _allowedPlayers:Ljava/util/Set;
        60: iload         4
        62: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        65: invokeinterface #162,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        70: ifeq          143
        73: aload_3
        74: invokevirtual #188                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        77: ifne          110
        80: aload_0
        81: getfield      #12                 // Field _allowedPlayersEntryTime:Ljava/util/Map;
        84: iload         4
        86: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        89: invokestatic  #179                // Method java/lang/System.currentTimeMillis:()J
        92: aload_0
        93: getfield      #113                // Field _invadeTime:I
        96: i2l
        97: ladd
        98: invokestatic  #191                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       101: invokeinterface #194,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       106: pop
       107: goto          143
       110: aload_0
       111: getfield      #12                 // Field _allowedPlayersEntryTime:Ljava/util/Map;
       114: iload         4
       116: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       119: invokeinterface #198,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
       124: ifeq          128
       127: return
       128: aload_0
       129: getfield      #22                 // Field _allowedPlayers:Ljava/util/Set;
       132: iload         4
       134: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       137: invokeinterface #184,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
       142: pop
       143: aload_0
       144: getfield      #201                // Field _creatures:Ljava/util/Set;
       147: invokeinterface #204,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
       152: ifne          249
       155: aload_0
       156: ldc           #186                // class ext/mods/gameserver/model/actor/Playable
       158: invokevirtual #207                // Method getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
       161: invokeinterface #211,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       166: ifne          170
       169: return
       170: aload_0
       171: ldc           #214                // class ext/mods/gameserver/model/actor/Attackable
       173: invokevirtual #207                // Method getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
       176: invokeinterface #216,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       181: astore_3
       182: aload_3
       183: invokeinterface #220,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       188: ifeq          222
       191: aload_3
       192: invokeinterface #225,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       197: checkcast     #214                // class ext/mods/gameserver/model/actor/Attackable
       200: astore        4
       202: aload         4
       204: invokevirtual #228                // Method ext/mods/gameserver/model/actor/Attackable.isRaidRelated:()Z
       207: ifne          213
       210: goto          182
       213: aload         4
       215: invokevirtual #231                // Method ext/mods/gameserver/model/actor/Attackable.returnHome:()Z
       218: pop
       219: goto          182
       222: goto          249
       225: aload_1
       226: instanceof    #214                // class ext/mods/gameserver/model/actor/Attackable
       229: ifeq          249
       232: aload_1
       233: checkcast     #214                // class ext/mods/gameserver/model/actor/Attackable
       236: astore_2
       237: aload_2
       238: invokevirtual #228                // Method ext/mods/gameserver/model/actor/Attackable.isRaidRelated:()Z
       241: ifeq          249
       244: aload_2
       245: invokevirtual #231                // Method ext/mods/gameserver/model/actor/Attackable.returnHome:()Z
       248: pop
       249: return
      LineNumberTable:
        line 120: 0
        line 122: 8
        line 124: 15
        line 126: 27
        line 128: 35
        line 129: 49
        line 131: 50
        line 133: 56
        line 135: 73
        line 137: 80
        line 141: 110
        line 142: 127
        line 144: 128
        line 149: 143
        line 151: 155
        line 152: 169
        line 154: 170
        line 156: 202
        line 157: 210
        line 159: 213
        line 160: 219
        line 163: 225
        line 164: 244
        line 165: 249
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           56      87     4    id   I
           27     116     3 player   Lext/mods/gameserver/model/actor/Player;
          202      17     4  raid   Lext/mods/gameserver/model/actor/Attackable;
          237      12     2 attackable   Lext/mods/gameserver/model/actor/Attackable;
            0     250     0  this   Lext/mods/gameserver/model/zone/type/BossZone;
            0     250     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 11
        frame_type = 253 /* append */
          offset_delta = 49
          locals = [ top, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 59
          locals = [ int ]
        frame_type = 17 /* same */
        frame_type = 248 /* chop */
          offset_delta = 14
        frame_type = 26 /* same */
        frame_type = 253 /* append */
          offset_delta = 11
          locals = [ top, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/actor/Attackable ]
        frame_type = 248 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 23 /* same */

  public void allowPlayerEntry(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=3
         0: aload_1
         1: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         4: istore_3
         5: aload_0
         6: getfield      #22                 // Field _allowedPlayers:Ljava/util/Set;
         9: iload_3
        10: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        13: invokeinterface #162,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        18: ifne          35
        21: aload_0
        22: getfield      #22                 // Field _allowedPlayers:Ljava/util/Set;
        25: iload_3
        26: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: invokeinterface #234,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        34: pop
        35: aload_0
        36: getfield      #12                 // Field _allowedPlayersEntryTime:Ljava/util/Map;
        39: iload_3
        40: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        43: invokestatic  #179                // Method java/lang/System.currentTimeMillis:()J
        46: iload_2
        47: sipush        1000
        50: imul
        51: i2l
        52: ladd
        53: invokestatic  #191                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        56: invokeinterface #194,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        61: pop
        62: return
      LineNumberTable:
        line 174: 0
        line 176: 5
        line 177: 21
        line 179: 35
        line 180: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/zone/type/BossZone;
            0      63     1 player   Lext/mods/gameserver/model/actor/Player;
            0      63     2 duration   I
            5      58     3 playerId   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ int ]

  public void allowPlayerEntry(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: getfield      #22                 // Field _allowedPlayers:Ljava/util/Set;
         4: iload_1
         5: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #162,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        13: ifne          30
        16: aload_0
        17: getfield      #22                 // Field _allowedPlayers:Ljava/util/Set;
        20: iload_1
        21: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        24: invokeinterface #234,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        29: pop
        30: aload_0
        31: getfield      #12                 // Field _allowedPlayersEntryTime:Ljava/util/Map;
        34: iload_1
        35: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        38: invokestatic  #179                // Method java/lang/System.currentTimeMillis:()J
        41: aload_0
        42: getfield      #113                // Field _invadeTime:I
        45: i2l
        46: ladd
        47: invokestatic  #191                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        50: invokeinterface #194,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        55: pop
        56: return
      LineNumberTable:
        line 188: 0
        line 189: 16
        line 191: 30
        line 192: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/zone/type/BossZone;
            0      57     1 playerId   I
      StackMapTable: number_of_entries = 1
        frame_type = 30 /* same */

  public void removePlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         4: istore_2
         5: aload_0
         6: getfield      #22                 // Field _allowedPlayers:Ljava/util/Set;
         9: iload_2
        10: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        13: invokeinterface #184,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        18: pop
        19: aload_0
        20: getfield      #12                 // Field _allowedPlayersEntryTime:Ljava/util/Map;
        23: iload_2
        24: invokestatic  #158                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        27: invokeinterface #167,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        32: pop
        33: return
      LineNumberTable:
        line 200: 0
        line 202: 5
        line 204: 19
        line 205: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/zone/type/BossZone;
            0      34     1 player   Lext/mods/gameserver/model/actor/Player;
            5      29     2    id   I

  public java.util.Set<java.lang.Integer> getAllowedPlayers();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _allowedPlayers:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 212: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/BossZone;
    Signature: #296                         // ()Ljava/util/Set<Ljava/lang/Integer;>;

  public java.util.List<ext.mods.gameserver.model.actor.Player> oustAllPlayers();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=1
         0: aload_0
         1: ldc           #139                // class ext/mods/gameserver/model/actor/Player
         3: invokevirtual #207                // Method getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
         6: astore_1
         7: aload_1
         8: invokeinterface #211,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        13: ifeq          18
        16: aload_1
        17: areturn
        18: aload_1
        19: invokeinterface #216,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        24: astore_2
        25: aload_2
        26: invokeinterface #220,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        31: ifeq          115
        34: aload_2
        35: invokeinterface #225,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        40: checkcast     #139                // class ext/mods/gameserver/model/actor/Player
        43: astore_3
        44: aload_3
        45: invokevirtual #188                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        48: ifeq          112
        51: aload_0
        52: getfield      #26                 // Field _oustLoc:[I
        55: iconst_0
        56: iaload
        57: ifeq          105
        60: aload_0
        61: getfield      #26                 // Field _oustLoc:[I
        64: iconst_1
        65: iaload
        66: ifeq          105
        69: aload_0
        70: getfield      #26                 // Field _oustLoc:[I
        73: iconst_2
        74: iaload
        75: ifeq          105
        78: aload_3
        79: aload_0
        80: getfield      #26                 // Field _oustLoc:[I
        83: iconst_0
        84: iaload
        85: aload_0
        86: getfield      #26                 // Field _oustLoc:[I
        89: iconst_1
        90: iaload
        91: aload_0
        92: getfield      #26                 // Field _oustLoc:[I
        95: iconst_2
        96: iaload
        97: iconst_0
        98: invokevirtual #237                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       101: pop
       102: goto          112
       105: aload_3
       106: getstatic     #241                // Field ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
       109: invokevirtual #247                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
       112: goto          25
       115: aload_0
       116: getfield      #12                 // Field _allowedPlayersEntryTime:Ljava/util/Map;
       119: invokeinterface #250,  1          // InterfaceMethod java/util/Map.clear:()V
       124: aload_0
       125: getfield      #22                 // Field _allowedPlayers:Ljava/util/Set;
       128: invokeinterface #253,  1          // InterfaceMethod java/util/Set.clear:()V
       133: aload_1
       134: areturn
      LineNumberTable:
        line 221: 0
        line 222: 7
        line 223: 16
        line 225: 18
        line 227: 44
        line 229: 51
        line 230: 78
        line 232: 105
        line 234: 112
        line 235: 115
        line 236: 124
        line 238: 133
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44      68     3 player   Lext/mods/gameserver/model/actor/Player;
            0     135     0  this   Lext/mods/gameserver/model/zone/type/BossZone;
            7     128     1 players   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            7     128     1 players   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/util/List ]
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 79
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #303                         // ()Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
}
SourceFile: "BossZone.java"
InnerClasses:
  public static final #309= #307 of #7;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
