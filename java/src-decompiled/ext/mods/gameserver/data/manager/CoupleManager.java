// Bytecode for: ext.mods.gameserver.data.manager.CoupleManager
// File: ext\mods\gameserver\data\manager\CoupleManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/CoupleManager.class
  Last modified 9 de jul de 2026; size 6021 bytes
  MD5 checksum 68dd4fb016591f8d535760e8c9346338
  Compiled from "CoupleManager.java"
public class ext.mods.gameserver.data.manager.CoupleManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/CoupleManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 9, attributes: 3
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/CoupleManager._couples:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/CoupleManager
   #12 = NameAndType        #14:#15       // _couples:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/CoupleManager
   #14 = Utf8               _couples
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #17.#18       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #17 = Class              #19           // ext/mods/commons/pool/ConnectionPool
   #18 = NameAndType        #20:#21       // getConnection:()Ljava/sql/Connection;
   #19 = Utf8               ext/mods/commons/pool/ConnectionPool
   #20 = Utf8               getConnection
   #21 = Utf8               ()Ljava/sql/Connection;
   #22 = String             #23           // SELECT * FROM mods_wedding
   #23 = Utf8               SELECT * FROM mods_wedding
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
   #42 = String             #43           // id
   #43 = Utf8               id
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
   #54 = Class              #55           // ext/mods/gameserver/model/holder/IntIntHolder
   #55 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #56 = String             #57           // requesterId
   #57 = Utf8               requesterId
   #58 = String             #59           // partnerId
   #59 = Utf8               partnerId
   #60 = Methodref          #54.#61       // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
   #61 = NameAndType        #5:#62        // "<init>":(II)V
   #62 = Utf8               (II)V
   #63 = InterfaceMethodref #64.#65       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #64 = Class              #66           // java/util/Map
   #65 = NameAndType        #67:#68       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #66 = Utf8               java/util/Map
   #67 = Utf8               put
   #68 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #69 = InterfaceMethodref #37.#70       // java/sql/ResultSet.close:()V
   #70 = NameAndType        #71:#6        // close:()V
   #71 = Utf8               close
   #72 = Class              #73           // java/lang/Throwable
   #73 = Utf8               java/lang/Throwable
   #74 = Methodref          #72.#75       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #75 = NameAndType        #76:#77       // addSuppressed:(Ljava/lang/Throwable;)V
   #76 = Utf8               addSuppressed
   #77 = Utf8               (Ljava/lang/Throwable;)V
   #78 = InterfaceMethodref #31.#70       // java/sql/PreparedStatement.close:()V
   #79 = InterfaceMethodref #25.#70       // java/sql/Connection.close:()V
   #80 = Class              #81           // java/lang/Exception
   #81 = Utf8               java/lang/Exception
   #82 = Fieldref           #11.#83       // ext/mods/gameserver/data/manager/CoupleManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #83 = NameAndType        #84:#85       // LOGGER:Lext/mods/commons/logging/CLogger;
   #84 = Utf8               LOGGER
   #85 = Utf8               Lext/mods/commons/logging/CLogger;
   #86 = String             #87           // Couldn\'t load couples.
   #87 = Utf8               Couldn\'t load couples.
   #88 = Methodref          #89.#90       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #89 = Class              #91           // ext/mods/commons/logging/CLogger
   #90 = NameAndType        #92:#93       // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #91 = Utf8               ext/mods/commons/logging/CLogger
   #92 = Utf8               error
   #93 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
   #94 = String             #95           // Loaded {} couples.
   #95 = Utf8               Loaded {} couples.
   #96 = InterfaceMethodref #64.#97       // java/util/Map.size:()I
   #97 = NameAndType        #98:#99       // size:()I
   #98 = Utf8               size
   #99 = Utf8               ()I
  #100 = Methodref          #89.#101      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #101 = NameAndType        #102:#103     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #102 = Utf8               info
  #103 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #104 = InterfaceMethodref #64.#105      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #105 = NameAndType        #106:#107     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #106 = Utf8               get
  #107 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #108 = Methodref          #109.#110     // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #109 = Class              #111          // ext/mods/gameserver/idfactory/IdFactory
  #110 = NameAndType        #112:#113     // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #111 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #112 = Utf8               getInstance
  #113 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #114 = Methodref          #109.#115     // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
  #115 = NameAndType        #116:#99      // getNextId:()I
  #116 = Utf8               getNextId
  #117 = Methodref          #118.#119     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #118 = Class              #120          // ext/mods/gameserver/model/actor/Player
  #119 = NameAndType        #121:#99      // getObjectId:()I
  #120 = Utf8               ext/mods/gameserver/model/actor/Player
  #121 = Utf8               getObjectId
  #122 = Methodref          #118.#123     // ext/mods/gameserver/model/actor/Player.setCoupleId:(I)V
  #123 = NameAndType        #124:#125     // setCoupleId:(I)V
  #124 = Utf8               setCoupleId
  #125 = Utf8               (I)V
  #126 = InterfaceMethodref #64.#127      // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #127 = NameAndType        #128:#107     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #128 = Utf8               remove
  #129 = Methodref          #130.#131     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #130 = Class              #132          // ext/mods/gameserver/model/World
  #131 = NameAndType        #112:#133     // getInstance:()Lext/mods/gameserver/model/World;
  #132 = Utf8               ext/mods/gameserver/model/World
  #133 = Utf8               ()Lext/mods/gameserver/model/World;
  #134 = Methodref          #54.#135      // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #135 = NameAndType        #136:#99      // getId:()I
  #136 = Utf8               getId
  #137 = Methodref          #130.#138     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #138 = NameAndType        #139:#140     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #139 = Utf8               getPlayer
  #140 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #141 = Methodref          #118.#142     // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #142 = NameAndType        #143:#144     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #143 = Utf8               getSysString
  #144 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #145 = Methodref          #118.#146     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #146 = NameAndType        #147:#148     // sendMessage:(Ljava/lang/String;)V
  #147 = Utf8               sendMessage
  #148 = Utf8               (Ljava/lang/String;)V
  #149 = Methodref          #54.#150      // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #150 = NameAndType        #151:#99      // getValue:()I
  #151 = Utf8               getValue
  #152 = Methodref          #109.#153     // ext/mods/gameserver/idfactory/IdFactory.releaseId:(I)V
  #153 = NameAndType        #154:#125     // releaseId:(I)V
  #154 = Utf8               releaseId
  #155 = String             #156          // TRUNCATE mods_wedding
  #156 = Utf8               TRUNCATE mods_wedding
  #157 = InterfaceMethodref #31.#158      // java/sql/PreparedStatement.execute:()Z
  #158 = NameAndType        #159:#41      // execute:()Z
  #159 = Utf8               execute
  #160 = String             #161          // INSERT INTO mods_wedding (id, requesterId, partnerId) VALUES (?,?,?)
  #161 = Utf8               INSERT INTO mods_wedding (id, requesterId, partnerId) VALUES (?,?,?)
  #162 = InterfaceMethodref #64.#163      // java/util/Map.entrySet:()Ljava/util/Set;
  #163 = NameAndType        #164:#165     // entrySet:()Ljava/util/Set;
  #164 = Utf8               entrySet
  #165 = Utf8               ()Ljava/util/Set;
  #166 = InterfaceMethodref #167.#168     // java/util/Set.iterator:()Ljava/util/Iterator;
  #167 = Class              #169          // java/util/Set
  #168 = NameAndType        #170:#171     // iterator:()Ljava/util/Iterator;
  #169 = Utf8               java/util/Set
  #170 = Utf8               iterator
  #171 = Utf8               ()Ljava/util/Iterator;
  #172 = InterfaceMethodref #173.#174     // java/util/Iterator.hasNext:()Z
  #173 = Class              #175          // java/util/Iterator
  #174 = NameAndType        #176:#41      // hasNext:()Z
  #175 = Utf8               java/util/Iterator
  #176 = Utf8               hasNext
  #177 = InterfaceMethodref #173.#178     // java/util/Iterator.next:()Ljava/lang/Object;
  #178 = NameAndType        #40:#179      // next:()Ljava/lang/Object;
  #179 = Utf8               ()Ljava/lang/Object;
  #180 = Class              #181          // java/util/Map$Entry
  #181 = Utf8               java/util/Map$Entry
  #182 = InterfaceMethodref #180.#183     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #183 = NameAndType        #151:#179     // getValue:()Ljava/lang/Object;
  #184 = InterfaceMethodref #180.#185     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #185 = NameAndType        #186:#179     // getKey:()Ljava/lang/Object;
  #186 = Utf8               getKey
  #187 = Methodref          #49.#188      // java/lang/Integer.intValue:()I
  #188 = NameAndType        #189:#99      // intValue:()I
  #189 = Utf8               intValue
  #190 = InterfaceMethodref #31.#191      // java/sql/PreparedStatement.setInt:(II)V
  #191 = NameAndType        #192:#62      // setInt:(II)V
  #192 = Utf8               setInt
  #193 = InterfaceMethodref #31.#194      // java/sql/PreparedStatement.addBatch:()V
  #194 = NameAndType        #195:#6       // addBatch:()V
  #195 = Utf8               addBatch
  #196 = InterfaceMethodref #31.#197      // java/sql/PreparedStatement.executeBatch:()[I
  #197 = NameAndType        #198:#199     // executeBatch:()[I
  #198 = Utf8               executeBatch
  #199 = Utf8               ()[I
  #200 = String             #201          // Couldn\'t add a couple.
  #201 = Utf8               Couldn\'t add a couple.
  #202 = Fieldref           #203.#204     // ext/mods/gameserver/data/manager/CoupleManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/CoupleManager;
  #203 = Class              #205          // ext/mods/gameserver/data/manager/CoupleManager$SingletonHolder
  #204 = NameAndType        #206:#207     // INSTANCE:Lext/mods/gameserver/data/manager/CoupleManager;
  #205 = Utf8               ext/mods/gameserver/data/manager/CoupleManager$SingletonHolder
  #206 = Utf8               INSTANCE
  #207 = Utf8               Lext/mods/gameserver/data/manager/CoupleManager;
  #208 = Methodref          #209.#210     // java/lang/Class.getName:()Ljava/lang/String;
  #209 = Class              #211          // java/lang/Class
  #210 = NameAndType        #212:#213     // getName:()Ljava/lang/String;
  #211 = Utf8               java/lang/Class
  #212 = Utf8               getName
  #213 = Utf8               ()Ljava/lang/String;
  #214 = Methodref          #89.#215      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #215 = NameAndType        #5:#148       // "<init>":(Ljava/lang/String;)V
  #216 = Utf8               LOAD_COUPLES
  #217 = Utf8               Ljava/lang/String;
  #218 = Utf8               ConstantValue
  #219 = Utf8               TRUNCATE_COUPLES
  #220 = Utf8               ADD_COUPLE
  #221 = Utf8               Signature
  #222 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #223 = Utf8               Code
  #224 = Utf8               LineNumberTable
  #225 = Utf8               LocalVariableTable
  #226 = Utf8               rs
  #227 = Utf8               Ljava/sql/ResultSet;
  #228 = Utf8               ps
  #229 = Utf8               Ljava/sql/PreparedStatement;
  #230 = Utf8               con
  #231 = Utf8               Ljava/sql/Connection;
  #232 = Utf8               e
  #233 = Utf8               Ljava/lang/Exception;
  #234 = Utf8               this
  #235 = Utf8               StackMapTable
  #236 = Utf8               getCouples
  #237 = Utf8               ()Ljava/util/Map;
  #238 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #239 = Utf8               getCouple
  #240 = Utf8               (I)Lext/mods/gameserver/model/holder/IntIntHolder;
  #241 = Utf8               coupleId
  #242 = Utf8               I
  #243 = Utf8               addCouple
  #244 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
  #245 = Utf8               requester
  #246 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #247 = Utf8               partner
  #248 = Utf8               deleteCouple
  #249 = Utf8               couple
  #250 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #251 = Utf8               save
  #252 = Utf8               coupleEntry
  #253 = Utf8               Ljava/util/Map$Entry;
  #254 = Utf8               LocalVariableTypeTable
  #255 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #256 = Utf8               getPartnerId
  #257 = Utf8               (II)I
  #258 = Utf8               objectId
  #259 = Utf8               ()Lext/mods/gameserver/data/manager/CoupleManager;
  #260 = Utf8               <clinit>
  #261 = Utf8               SourceFile
  #262 = Utf8               CoupleManager.java
  #263 = Utf8               NestMembers
  #264 = Utf8               InnerClasses
  #265 = Utf8               Entry
  #266 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.data.manager.CoupleManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=6, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _couples:Ljava/util/Map;
        15: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        18: astore_1
        19: aload_1
        20: ldc           #22                 // String SELECT * FROM mods_wedding
        22: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        27: astore_2
        28: aload_2
        29: invokeinterface #30,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        34: astore_3
        35: aload_3
        36: invokeinterface #36,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        41: ifeq          91
        44: aload_0
        45: getfield      #10                 // Field _couples:Ljava/util/Map;
        48: aload_3
        49: ldc           #42                 // String id
        51: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        56: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        59: new           #54                 // class ext/mods/gameserver/model/holder/IntIntHolder
        62: dup
        63: aload_3
        64: ldc           #56                 // String requesterId
        66: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        71: aload_3
        72: ldc           #58                 // String partnerId
        74: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        79: invokespecial #60                 // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        82: invokeinterface #63,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        87: pop
        88: goto          35
        91: aload_3
        92: ifnull        131
        95: aload_3
        96: invokeinterface #69,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       101: goto          131
       104: astore        4
       106: aload_3
       107: ifnull        128
       110: aload_3
       111: invokeinterface #69,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       116: goto          128
       119: astore        5
       121: aload         4
       123: aload         5
       125: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       128: aload         4
       130: athrow
       131: aload_2
       132: ifnull        168
       135: aload_2
       136: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       141: goto          168
       144: astore_3
       145: aload_2
       146: ifnull        166
       149: aload_2
       150: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       155: goto          166
       158: astore        4
       160: aload_3
       161: aload         4
       163: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       166: aload_3
       167: athrow
       168: aload_1
       169: ifnull        203
       172: aload_1
       173: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       178: goto          203
       181: astore_2
       182: aload_1
       183: ifnull        201
       186: aload_1
       187: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       192: goto          201
       195: astore_3
       196: aload_2
       197: aload_3
       198: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       201: aload_2
       202: athrow
       203: goto          216
       206: astore_1
       207: getstatic     #82                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       210: ldc           #86                 // String Couldn\'t load couples.
       212: aload_1
       213: invokevirtual #88                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       216: getstatic     #82                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       219: ldc           #94                 // String Loaded {} couples.
       221: iconst_1
       222: anewarray     #2                  // class java/lang/Object
       225: dup
       226: iconst_0
       227: aload_0
       228: getfield      #10                 // Field _couples:Ljava/util/Map;
       231: invokeinterface #96,  1           // InterfaceMethod java/util/Map.size:()I
       236: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       239: aastore
       240: invokevirtual #100                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       243: return
      Exception table:
         from    to  target type
            35    91   104   Class java/lang/Throwable
           110   116   119   Class java/lang/Throwable
            28   131   144   Class java/lang/Throwable
           149   155   158   Class java/lang/Throwable
            19   168   181   Class java/lang/Throwable
           186   192   195   Class java/lang/Throwable
            15   203   206   Class java/lang/Exception
      LineNumberTable:
        line 51: 0
        line 48: 4
        line 52: 15
        line 53: 19
        line 54: 28
        line 56: 35
        line 57: 44
        line 58: 91
        line 52: 104
        line 58: 131
        line 52: 144
        line 58: 168
        line 52: 181
        line 62: 203
        line 59: 206
        line 61: 207
        line 63: 216
        line 64: 243
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      96     3    rs   Ljava/sql/ResultSet;
           28     140     2    ps   Ljava/sql/PreparedStatement;
           19     184     1   con   Ljava/sql/Connection;
          207       9     1     e   Ljava/lang/Exception;
            0     244     0  this   Lext/mods/gameserver/data/manager/CoupleManager;
      StackMapTable: number_of_entries = 16
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/data/manager/CoupleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 55 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/CoupleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/CoupleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/CoupleManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public final java.util.Map<java.lang.Integer, ext.mods.gameserver.model.holder.IntIntHolder> getCouples();
    descriptor: ()Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _couples:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/CoupleManager;
    Signature: #238                         // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/holder/IntIntHolder;>;

  public final ext.mods.gameserver.model.holder.IntIntHolder getCouple(int);
    descriptor: (I)Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _couples:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #104,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #54                 // class ext/mods/gameserver/model/holder/IntIntHolder
        16: areturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/manager/CoupleManager;
            0      17     1 coupleId   I

  public void addCouple(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=3
         0: aload_1
         1: ifnull        8
         4: aload_2
         5: ifnonnull     9
         8: return
         9: invokestatic  #108                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        12: invokevirtual #114                // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        15: istore_3
        16: aload_0
        17: getfield      #10                 // Field _couples:Ljava/util/Map;
        20: iload_3
        21: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        24: new           #54                 // class ext/mods/gameserver/model/holder/IntIntHolder
        27: dup
        28: aload_1
        29: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        32: aload_2
        33: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        36: invokespecial #60                 // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        39: invokeinterface #63,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        44: pop
        45: aload_1
        46: iload_3
        47: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.setCoupleId:(I)V
        50: aload_2
        51: iload_3
        52: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.setCoupleId:(I)V
        55: return
      LineNumberTable:
        line 83: 0
        line 84: 8
        line 86: 9
        line 88: 16
        line 90: 45
        line 91: 50
        line 92: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/gameserver/data/manager/CoupleManager;
            0      56     1 requester   Lext/mods/gameserver/model/actor/Player;
            0      56     2 partner   Lext/mods/gameserver/model/actor/Player;
           16      40     3 coupleId   I
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 0 /* same */

  public void deleteCouple(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _couples:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #126,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #54                 // class ext/mods/gameserver/model/holder/IntIntHolder
        16: astore_2
        17: aload_2
        18: ifnonnull     22
        21: return
        22: invokestatic  #129                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        25: aload_2
        26: invokevirtual #134                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        29: invokevirtual #137                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        32: astore_3
        33: aload_3
        34: ifnull        57
        37: aload_3
        38: iconst_0
        39: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.setCoupleId:(I)V
        42: aload_3
        43: aload_3
        44: sipush        10105
        47: iconst_0
        48: anewarray     #2                  // class java/lang/Object
        51: invokevirtual #141                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        54: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        57: invokestatic  #129                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        60: aload_2
        61: invokevirtual #149                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        64: invokevirtual #137                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        67: astore        4
        69: aload         4
        71: ifnull        97
        74: aload         4
        76: iconst_0
        77: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.setCoupleId:(I)V
        80: aload         4
        82: aload         4
        84: sipush        10105
        87: iconst_0
        88: anewarray     #2                  // class java/lang/Object
        91: invokevirtual #141                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        94: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        97: invokestatic  #108                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
       100: iload_1
       101: invokevirtual #152                // Method ext/mods/gameserver/idfactory/IdFactory.releaseId:(I)V
       104: return
      LineNumberTable:
        line 100: 0
        line 101: 17
        line 102: 21
        line 104: 22
        line 105: 33
        line 107: 37
        line 108: 42
        line 111: 57
        line 112: 69
        line 114: 74
        line 115: 80
        line 118: 97
        line 119: 104
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     105     0  this   Lext/mods/gameserver/data/manager/CoupleManager;
            0     105     1 coupleId   I
           17      88     2 couple   Lext/mods/gameserver/model/holder/IntIntHolder;
           33      72     3 requester   Lext/mods/gameserver/model/actor/Player;
           69      36     4 partner   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/actor/Player ]

  public void save();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=1
         0: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #155                // String TRUNCATE mods_wedding
         7: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: invokeinterface #157,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        19: pop
        20: aload_2
        21: ifnull        57
        24: aload_2
        25: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        30: goto          57
        33: astore_3
        34: aload_2
        35: ifnull        55
        38: aload_2
        39: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        44: goto          55
        47: astore        4
        49: aload_3
        50: aload         4
        52: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        55: aload_3
        56: athrow
        57: aload_1
        58: ldc           #160                // String INSERT INTO mods_wedding (id, requesterId, partnerId) VALUES (?,?,?)
        60: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        65: astore_2
        66: aload_0
        67: getfield      #10                 // Field _couples:Ljava/util/Map;
        70: invokeinterface #162,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
        75: invokeinterface #166,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        80: astore_3
        81: aload_3
        82: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        87: ifeq          166
        90: aload_3
        91: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        96: checkcast     #180                // class java/util/Map$Entry
        99: astore        4
       101: aload         4
       103: invokeinterface #182,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       108: checkcast     #54                 // class ext/mods/gameserver/model/holder/IntIntHolder
       111: astore        5
       113: aload_2
       114: iconst_1
       115: aload         4
       117: invokeinterface #184,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
       122: checkcast     #49                 // class java/lang/Integer
       125: invokevirtual #187                // Method java/lang/Integer.intValue:()I
       128: invokeinterface #190,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       133: aload_2
       134: iconst_2
       135: aload         5
       137: invokevirtual #134                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       140: invokeinterface #190,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       145: aload_2
       146: iconst_3
       147: aload         5
       149: invokevirtual #149                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       152: invokeinterface #190,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       157: aload_2
       158: invokeinterface #193,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       163: goto          81
       166: aload_2
       167: invokeinterface #196,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       172: pop
       173: aload_2
       174: ifnull        210
       177: aload_2
       178: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       183: goto          210
       186: astore_3
       187: aload_2
       188: ifnull        208
       191: aload_2
       192: invokeinterface #78,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       197: goto          208
       200: astore        4
       202: aload_3
       203: aload         4
       205: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       208: aload_3
       209: athrow
       210: aload_1
       211: ifnull        245
       214: aload_1
       215: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       220: goto          245
       223: astore_2
       224: aload_1
       225: ifnull        243
       228: aload_1
       229: invokeinterface #79,  1           // InterfaceMethod java/sql/Connection.close:()V
       234: goto          243
       237: astore_3
       238: aload_2
       239: aload_3
       240: invokevirtual #74                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       243: aload_2
       244: athrow
       245: goto          258
       248: astore_1
       249: getstatic     #82                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       252: ldc           #200                // String Couldn\'t add a couple.
       254: aload_1
       255: invokevirtual #88                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       258: return
      Exception table:
         from    to  target type
            13    20    33   Class java/lang/Throwable
            38    44    47   Class java/lang/Throwable
            66   173   186   Class java/lang/Throwable
           191   197   200   Class java/lang/Throwable
             4   210   223   Class java/lang/Throwable
           228   234   237   Class java/lang/Throwable
             0   245   248   Class java/lang/Exception
      LineNumberTable:
        line 126: 0
        line 128: 4
        line 130: 13
        line 131: 20
        line 128: 33
        line 133: 57
        line 135: 66
        line 137: 101
        line 139: 113
        line 140: 133
        line 141: 145
        line 142: 157
        line 143: 163
        line 144: 166
        line 145: 173
        line 133: 186
        line 146: 210
        line 126: 223
        line 150: 245
        line 147: 248
        line 149: 249
        line 151: 258
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      44     2    ps   Ljava/sql/PreparedStatement;
          113      50     5 couple   Lext/mods/gameserver/model/holder/IntIntHolder;
          101      62     4 coupleEntry   Ljava/util/Map$Entry;
           66     144     2    ps   Ljava/sql/PreparedStatement;
            4     241     1   con   Ljava/sql/Connection;
          249       9     1     e   Ljava/lang/Exception;
            0     259     0  this   Lext/mods/gameserver/data/manager/CoupleManager;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          101      62     4 coupleEntry   Ljava/util/Map$Entry<Ljava/lang/Integer;Lext/mods/gameserver/model/holder/IntIntHolder;>;
      StackMapTable: number_of_entries = 16
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/data/manager/CoupleManager, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/CoupleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/sql/PreparedStatement, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 84
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/CoupleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/CoupleManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public final int getPartnerId(int, int);
    descriptor: (II)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _couples:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #104,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #54                 // class ext/mods/gameserver/model/holder/IntIntHolder
        16: astore_3
        17: aload_3
        18: ifnonnull     23
        21: iconst_0
        22: ireturn
        23: aload_3
        24: invokevirtual #134                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        27: iload_2
        28: if_icmpne     38
        31: aload_3
        32: invokevirtual #149                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        35: goto          42
        38: aload_3
        39: invokevirtual #134                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        42: ireturn
      LineNumberTable:
        line 160: 0
        line 161: 17
        line 162: 21
        line 164: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/data/manager/CoupleManager;
            0      43     1 coupleId   I
            0      43     2 objectId   I
           17      26     3 couple   Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 14 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public static final ext.mods.gameserver.data.manager.CoupleManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/CoupleManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #202                // Field ext/mods/gameserver/data/manager/CoupleManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/CoupleManager;
         3: areturn
      LineNumberTable:
        line 169: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #89                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/manager/CoupleManager
         6: invokevirtual #208                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #214                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #82                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 42: 0
}
SourceFile: "CoupleManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/CoupleManager$SingletonHolder
InnerClasses:
  public static #265= #180 of #64;        // Entry=class java/util/Map$Entry of class java/util/Map
