// Bytecode for: ext.mods.commons.pool.ConnectionPool
// File: ext\mods\commons\pool\ConnectionPool.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/ConnectionPool.class
  Last modified 9 de jul de 2026; size 5177 bytes
  MD5 checksum 6a4671b31a732d031d70256447def9c1
  Compiled from "ConnectionPool.java"
public final class ext.mods.commons.pool.ConnectionPool
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #1                          // ext/mods/commons/pool/ConnectionPool
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 10, attributes: 3
Constant pool:
    #1 = Class              #2            // ext/mods/commons/pool/ConnectionPool
    #2 = Utf8               ext/mods/commons/pool/ConnectionPool
    #3 = Methodref          #4.#5         // java/lang/Object."<init>":()V
    #4 = Class              #6            // java/lang/Object
    #5 = NameAndType        #7:#8         // "<init>":()V
    #6 = Utf8               java/lang/Object
    #7 = Utf8               <init>
    #8 = Utf8               ()V
    #9 = Class              #10           // java/lang/IllegalStateException
   #10 = Utf8               java/lang/IllegalStateException
   #11 = String             #12           // Utility class
   #12 = Utf8               Utility class
   #13 = Methodref          #9.#14        // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
   #14 = NameAndType        #7:#15        // "<init>":(Ljava/lang/String;)V
   #15 = Utf8               (Ljava/lang/String;)V
   #16 = Class              #17           // com/zaxxer/hikari/HikariConfig
   #17 = Utf8               com/zaxxer/hikari/HikariConfig
   #18 = Methodref          #16.#5        // com/zaxxer/hikari/HikariConfig."<init>":()V
   #19 = Fieldref           #20.#21       // ext/mods/Config.DATABASE_URL:Ljava/lang/String;
   #20 = Class              #22           // ext/mods/Config
   #21 = NameAndType        #23:#24       // DATABASE_URL:Ljava/lang/String;
   #22 = Utf8               ext/mods/Config
   #23 = Utf8               DATABASE_URL
   #24 = Utf8               Ljava/lang/String;
   #25 = Methodref          #16.#26       // com/zaxxer/hikari/HikariConfig.setJdbcUrl:(Ljava/lang/String;)V
   #26 = NameAndType        #27:#15       // setJdbcUrl:(Ljava/lang/String;)V
   #27 = Utf8               setJdbcUrl
   #28 = Fieldref           #20.#29       // ext/mods/Config.DATABASE_LOGIN:Ljava/lang/String;
   #29 = NameAndType        #30:#24       // DATABASE_LOGIN:Ljava/lang/String;
   #30 = Utf8               DATABASE_LOGIN
   #31 = Methodref          #16.#32       // com/zaxxer/hikari/HikariConfig.setUsername:(Ljava/lang/String;)V
   #32 = NameAndType        #33:#15       // setUsername:(Ljava/lang/String;)V
   #33 = Utf8               setUsername
   #34 = Fieldref           #20.#35       // ext/mods/Config.DATABASE_PASSWORD:Ljava/lang/String;
   #35 = NameAndType        #36:#24       // DATABASE_PASSWORD:Ljava/lang/String;
   #36 = Utf8               DATABASE_PASSWORD
   #37 = Methodref          #16.#38       // com/zaxxer/hikari/HikariConfig.setPassword:(Ljava/lang/String;)V
   #38 = NameAndType        #39:#15       // setPassword:(Ljava/lang/String;)V
   #39 = Utf8               setPassword
   #40 = String             #41           // cachePrepStmts
   #41 = Utf8               cachePrepStmts
   #42 = String             #43           // true
   #43 = Utf8               true
   #44 = Methodref          #16.#45       // com/zaxxer/hikari/HikariConfig.addDataSourceProperty:(Ljava/lang/String;Ljava/lang/Object;)V
   #45 = NameAndType        #46:#47       // addDataSourceProperty:(Ljava/lang/String;Ljava/lang/Object;)V
   #46 = Utf8               addDataSourceProperty
   #47 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
   #48 = String             #49           // prepStmtCacheSize
   #49 = Utf8               prepStmtCacheSize
   #50 = String             #51           // 250
   #51 = Utf8               250
   #52 = String             #53           // prepStmtCacheSqlLimit
   #53 = Utf8               prepStmtCacheSqlLimit
   #54 = String             #55           // 2048
   #55 = Utf8               2048
   #56 = String             #57           // useServerPrepStmts
   #57 = Utf8               useServerPrepStmts
   #58 = String             #59           // useLocalSessionState
   #59 = Utf8               useLocalSessionState
   #60 = String             #61           // rewriteBatchedStatements
   #61 = Utf8               rewriteBatchedStatements
   #62 = String             #63           // cacheResultSetMetadata
   #63 = Utf8               cacheResultSetMetadata
   #64 = String             #65           // cacheServerConfiguration
   #65 = Utf8               cacheServerConfiguration
   #66 = String             #67           // elideSetAutoCommits
   #67 = Utf8               elideSetAutoCommits
   #68 = String             #69           // maintainTimeStats
   #69 = Utf8               maintainTimeStats
   #70 = String             #71           // false
   #71 = Utf8               false
   #72 = Methodref          #16.#73       // com/zaxxer/hikari/HikariConfig.setMaximumPoolSize:(I)V
   #73 = NameAndType        #74:#75       // setMaximumPoolSize:(I)V
   #74 = Utf8               setMaximumPoolSize
   #75 = Utf8               (I)V
   #76 = Methodref          #16.#77       // com/zaxxer/hikari/HikariConfig.setMinimumIdle:(I)V
   #77 = NameAndType        #78:#75       // setMinimumIdle:(I)V
   #78 = Utf8               setMinimumIdle
   #79 = Long               300000l
   #81 = Methodref          #16.#82       // com/zaxxer/hikari/HikariConfig.setIdleTimeout:(J)V
   #82 = NameAndType        #83:#84       // setIdleTimeout:(J)V
   #83 = Utf8               setIdleTimeout
   #84 = Utf8               (J)V
   #85 = Long               1800000l
   #87 = Methodref          #16.#88       // com/zaxxer/hikari/HikariConfig.setMaxLifetime:(J)V
   #88 = NameAndType        #89:#84       // setMaxLifetime:(J)V
   #89 = Utf8               setMaxLifetime
   #90 = String             #91           // SELECT 1
   #91 = Utf8               SELECT 1
   #92 = Methodref          #16.#93       // com/zaxxer/hikari/HikariConfig.setConnectionTestQuery:(Ljava/lang/String;)V
   #93 = NameAndType        #94:#15       // setConnectionTestQuery:(Ljava/lang/String;)V
   #94 = Utf8               setConnectionTestQuery
   #95 = Long               60000l
   #97 = Methodref          #16.#98       // com/zaxxer/hikari/HikariConfig.setLeakDetectionThreshold:(J)V
   #98 = NameAndType        #99:#84       // setLeakDetectionThreshold:(J)V
   #99 = Utf8               setLeakDetectionThreshold
  #100 = String             #101          // GameServerPool
  #101 = Utf8               GameServerPool
  #102 = Methodref          #16.#103      // com/zaxxer/hikari/HikariConfig.setPoolName:(Ljava/lang/String;)V
  #103 = NameAndType        #104:#15      // setPoolName:(Ljava/lang/String;)V
  #104 = Utf8               setPoolName
  #105 = Methodref          #16.#106      // com/zaxxer/hikari/HikariConfig.setRegisterMbeans:(Z)V
  #106 = NameAndType        #107:#108     // setRegisterMbeans:(Z)V
  #107 = Utf8               setRegisterMbeans
  #108 = Utf8               (Z)V
  #109 = Class              #110          // com/zaxxer/hikari/HikariDataSource
  #110 = Utf8               com/zaxxer/hikari/HikariDataSource
  #111 = Methodref          #109.#112     // com/zaxxer/hikari/HikariDataSource."<init>":(Lcom/zaxxer/hikari/HikariConfig;)V
  #112 = NameAndType        #7:#113       // "<init>":(Lcom/zaxxer/hikari/HikariConfig;)V
  #113 = Utf8               (Lcom/zaxxer/hikari/HikariConfig;)V
  #114 = Fieldref           #1.#115       // ext/mods/commons/pool/ConnectionPool._source:Lcom/zaxxer/hikari/HikariDataSource;
  #115 = NameAndType        #116:#117     // _source:Lcom/zaxxer/hikari/HikariDataSource;
  #116 = Utf8               _source
  #117 = Utf8               Lcom/zaxxer/hikari/HikariDataSource;
  #118 = Fieldref           #1.#119       // ext/mods/commons/pool/ConnectionPool.LOGGER:Lext/mods/commons/logging/CLogger;
  #119 = NameAndType        #120:#121     // LOGGER:Lext/mods/commons/logging/CLogger;
  #120 = Utf8               LOGGER
  #121 = Utf8               Lext/mods/commons/logging/CLogger;
  #122 = String             #123          // HikariCP Pool: 50/10 | Ready!
  #123 = Utf8               HikariCP Pool: 50/10 | Ready!
  #124 = Methodref          #125.#126     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #125 = Class              #127          // ext/mods/commons/logging/CLogger
  #126 = NameAndType        #128:#129     // info:(Ljava/lang/Object;)V
  #127 = Utf8               ext/mods/commons/logging/CLogger
  #128 = Utf8               info
  #129 = Utf8               (Ljava/lang/Object;)V
  #130 = Class              #131          // java/lang/Exception
  #131 = Utf8               java/lang/Exception
  #132 = String             #133          // HikariCP failed!
  #133 = Utf8               HikariCP failed!
  #134 = Methodref          #125.#135     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #135 = NameAndType        #136:#137     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #136 = Utf8               error
  #137 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #138 = Methodref          #109.#139     // com/zaxxer/hikari/HikariDataSource.close:()V
  #139 = NameAndType        #140:#8       // close:()V
  #140 = Utf8               close
  #141 = Methodref          #109.#142     // com/zaxxer/hikari/HikariDataSource.getConnection:()Ljava/sql/Connection;
  #142 = NameAndType        #143:#144     // getConnection:()Ljava/sql/Connection;
  #143 = Utf8               getConnection
  #144 = Utf8               ()Ljava/sql/Connection;
  #145 = Fieldref           #1.#146       // ext/mods/commons/pool/ConnectionPool.TOTAL_QUERIES:Ljava/util/concurrent/atomic/AtomicLong;
  #146 = NameAndType        #147:#148     // TOTAL_QUERIES:Ljava/util/concurrent/atomic/AtomicLong;
  #147 = Utf8               TOTAL_QUERIES
  #148 = Utf8               Ljava/util/concurrent/atomic/AtomicLong;
  #149 = Methodref          #150.#151     // java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
  #150 = Class              #152          // java/util/concurrent/atomic/AtomicLong
  #151 = NameAndType        #153:#154     // incrementAndGet:()J
  #152 = Utf8               java/util/concurrent/atomic/AtomicLong
  #153 = Utf8               incrementAndGet
  #154 = Utf8               ()J
  #155 = Methodref          #150.#156     // java/util/concurrent/atomic/AtomicLong.get:()J
  #156 = NameAndType        #157:#154     // get:()J
  #157 = Utf8               get
  #158 = String             #159          // HikariCP: not initialized
  #159 = Utf8               HikariCP: not initialized
  #160 = Methodref          #109.#161     // com/zaxxer/hikari/HikariDataSource.getHikariPoolMXBean:()Lcom/zaxxer/hikari/HikariPoolMXBean;
  #161 = NameAndType        #162:#163     // getHikariPoolMXBean:()Lcom/zaxxer/hikari/HikariPoolMXBean;
  #162 = Utf8               getHikariPoolMXBean
  #163 = Utf8               ()Lcom/zaxxer/hikari/HikariPoolMXBean;
  #164 = String             #165          // HikariCP: %d active | %d idle | %d total | %d queries
  #165 = Utf8               HikariCP: %d active | %d idle | %d total | %d queries
  #166 = InterfaceMethodref #167.#168     // com/zaxxer/hikari/HikariPoolMXBean.getActiveConnections:()I
  #167 = Class              #169          // com/zaxxer/hikari/HikariPoolMXBean
  #168 = NameAndType        #170:#171     // getActiveConnections:()I
  #169 = Utf8               com/zaxxer/hikari/HikariPoolMXBean
  #170 = Utf8               getActiveConnections
  #171 = Utf8               ()I
  #172 = Methodref          #173.#174     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #173 = Class              #175          // java/lang/Integer
  #174 = NameAndType        #176:#177     // valueOf:(I)Ljava/lang/Integer;
  #175 = Utf8               java/lang/Integer
  #176 = Utf8               valueOf
  #177 = Utf8               (I)Ljava/lang/Integer;
  #178 = InterfaceMethodref #167.#179     // com/zaxxer/hikari/HikariPoolMXBean.getIdleConnections:()I
  #179 = NameAndType        #180:#171     // getIdleConnections:()I
  #180 = Utf8               getIdleConnections
  #181 = InterfaceMethodref #167.#182     // com/zaxxer/hikari/HikariPoolMXBean.getTotalConnections:()I
  #182 = NameAndType        #183:#171     // getTotalConnections:()I
  #183 = Utf8               getTotalConnections
  #184 = Methodref          #185.#186     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #185 = Class              #187          // java/lang/Long
  #186 = NameAndType        #176:#188     // valueOf:(J)Ljava/lang/Long;
  #187 = Utf8               java/lang/Long
  #188 = Utf8               (J)Ljava/lang/Long;
  #189 = Methodref          #190.#191     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #190 = Class              #192          // java/lang/String
  #191 = NameAndType        #193:#194     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #192 = Utf8               java/lang/String
  #193 = Utf8               format
  #194 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #195 = String             #196          // HikariCP: %d queries total
  #196 = Utf8               HikariCP: %d queries total
  #197 = Class              #198          // java/sql/Connection
  #198 = Utf8               java/sql/Connection
  #199 = Methodref          #200.#201     // java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
  #200 = Class              #202          // java/lang/Class
  #201 = NameAndType        #203:#204     // getClassLoader:()Ljava/lang/ClassLoader;
  #202 = Utf8               java/lang/Class
  #203 = Utf8               getClassLoader
  #204 = Utf8               ()Ljava/lang/ClassLoader;
  #205 = Class              #206          // ext/mods/commons/pool/ConnectionPool$1
  #206 = Utf8               ext/mods/commons/pool/ConnectionPool$1
  #207 = Methodref          #205.#208     // ext/mods/commons/pool/ConnectionPool$1."<init>":(Ljava/sql/Connection;)V
  #208 = NameAndType        #7:#209       // "<init>":(Ljava/sql/Connection;)V
  #209 = Utf8               (Ljava/sql/Connection;)V
  #210 = Methodref          #211.#212     // java/lang/reflect/Proxy.newProxyInstance:(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
  #211 = Class              #213          // java/lang/reflect/Proxy
  #212 = NameAndType        #214:#215     // newProxyInstance:(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
  #213 = Utf8               java/lang/reflect/Proxy
  #214 = Utf8               newProxyInstance
  #215 = Utf8               (Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
  #216 = Class              #217          // java/sql/PreparedStatement
  #217 = Utf8               java/sql/PreparedStatement
  #218 = Class              #219          // ext/mods/commons/pool/ConnectionPool$2
  #219 = Utf8               ext/mods/commons/pool/ConnectionPool$2
  #220 = Methodref          #218.#221     // ext/mods/commons/pool/ConnectionPool$2."<init>":(Ljava/sql/PreparedStatement;Ljava/lang/String;)V
  #221 = NameAndType        #7:#222       // "<init>":(Ljava/sql/PreparedStatement;Ljava/lang/String;)V
  #222 = Utf8               (Ljava/sql/PreparedStatement;Ljava/lang/String;)V
  #223 = Class              #224          // java/sql/Statement
  #224 = Utf8               java/sql/Statement
  #225 = Class              #226          // ext/mods/commons/pool/ConnectionPool$3
  #226 = Utf8               ext/mods/commons/pool/ConnectionPool$3
  #227 = Methodref          #225.#228     // ext/mods/commons/pool/ConnectionPool$3."<init>":(Ljava/sql/Statement;)V
  #228 = NameAndType        #7:#229       // "<init>":(Ljava/sql/Statement;)V
  #229 = Utf8               (Ljava/sql/Statement;)V
  #230 = Methodref          #200.#231     // java/lang/Class.getName:()Ljava/lang/String;
  #231 = NameAndType        #232:#233     // getName:()Ljava/lang/String;
  #232 = Utf8               getName
  #233 = Utf8               ()Ljava/lang/String;
  #234 = Methodref          #125.#14      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #235 = Methodref          #150.#236     // java/util/concurrent/atomic/AtomicLong."<init>":(J)V
  #236 = NameAndType        #7:#84        // "<init>":(J)V
  #237 = Utf8               DEBUG_QUERIES
  #238 = Utf8               Z
  #239 = Utf8               ConstantValue
  #240 = Integer            0
  #241 = Utf8               SLOW_QUERY_THRESHOLD_MS
  #242 = Utf8               J
  #243 = Long               50l
  #245 = Utf8               Code
  #246 = Utf8               LineNumberTable
  #247 = Utf8               LocalVariableTable
  #248 = Utf8               this
  #249 = Utf8               Lext/mods/commons/pool/ConnectionPool;
  #250 = Utf8               init
  #251 = Utf8               config
  #252 = Utf8               Lcom/zaxxer/hikari/HikariConfig;
  #253 = Utf8               e
  #254 = Utf8               Ljava/lang/Exception;
  #255 = Utf8               StackMapTable
  #256 = Utf8               shutdown
  #257 = Utf8               conn
  #258 = Utf8               Ljava/sql/Connection;
  #259 = Utf8               Exceptions
  #260 = Class              #261          // java/sql/SQLException
  #261 = Utf8               java/sql/SQLException
  #262 = Utf8               getTotalQueries
  #263 = Utf8               getStats
  #264 = Utf8               mx
  #265 = Utf8               Lcom/zaxxer/hikari/HikariPoolMXBean;
  #266 = Utf8               wrapConnection
  #267 = Utf8               (Ljava/sql/Connection;)Ljava/sql/Connection;
  #268 = Utf8               realConnection
  #269 = Utf8               wrapPreparedStatement
  #270 = Utf8               (Ljava/sql/PreparedStatement;Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #271 = Utf8               realPs
  #272 = Utf8               Ljava/sql/PreparedStatement;
  #273 = Utf8               sql
  #274 = Utf8               wrapStatement
  #275 = Utf8               (Ljava/sql/Statement;)Ljava/sql/Statement;
  #276 = Utf8               realSt
  #277 = Utf8               Ljava/sql/Statement;
  #278 = Utf8               <clinit>
  #279 = Utf8               SourceFile
  #280 = Utf8               ConnectionPool.java
  #281 = Utf8               NestMembers
  #282 = Utf8               InnerClasses
{
  public static void init();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: new           #16                 // class com/zaxxer/hikari/HikariConfig
         3: dup
         4: invokespecial #18                 // Method com/zaxxer/hikari/HikariConfig."<init>":()V
         7: astore_0
         8: aload_0
         9: getstatic     #19                 // Field ext/mods/Config.DATABASE_URL:Ljava/lang/String;
        12: invokevirtual #25                 // Method com/zaxxer/hikari/HikariConfig.setJdbcUrl:(Ljava/lang/String;)V
        15: aload_0
        16: getstatic     #28                 // Field ext/mods/Config.DATABASE_LOGIN:Ljava/lang/String;
        19: invokevirtual #31                 // Method com/zaxxer/hikari/HikariConfig.setUsername:(Ljava/lang/String;)V
        22: aload_0
        23: getstatic     #34                 // Field ext/mods/Config.DATABASE_PASSWORD:Ljava/lang/String;
        26: invokevirtual #37                 // Method com/zaxxer/hikari/HikariConfig.setPassword:(Ljava/lang/String;)V
        29: aload_0
        30: ldc           #40                 // String cachePrepStmts
        32: ldc           #42                 // String true
        34: invokevirtual #44                 // Method com/zaxxer/hikari/HikariConfig.addDataSourceProperty:(Ljava/lang/String;Ljava/lang/Object;)V
        37: aload_0
        38: ldc           #48                 // String prepStmtCacheSize
        40: ldc           #50                 // String 250
        42: invokevirtual #44                 // Method com/zaxxer/hikari/HikariConfig.addDataSourceProperty:(Ljava/lang/String;Ljava/lang/Object;)V
        45: aload_0
        46: ldc           #52                 // String prepStmtCacheSqlLimit
        48: ldc           #54                 // String 2048
        50: invokevirtual #44                 // Method com/zaxxer/hikari/HikariConfig.addDataSourceProperty:(Ljava/lang/String;Ljava/lang/Object;)V
        53: aload_0
        54: ldc           #56                 // String useServerPrepStmts
        56: ldc           #42                 // String true
        58: invokevirtual #44                 // Method com/zaxxer/hikari/HikariConfig.addDataSourceProperty:(Ljava/lang/String;Ljava/lang/Object;)V
        61: aload_0
        62: ldc           #58                 // String useLocalSessionState
        64: ldc           #42                 // String true
        66: invokevirtual #44                 // Method com/zaxxer/hikari/HikariConfig.addDataSourceProperty:(Ljava/lang/String;Ljava/lang/Object;)V
        69: aload_0
        70: ldc           #60                 // String rewriteBatchedStatements
        72: ldc           #42                 // String true
        74: invokevirtual #44                 // Method com/zaxxer/hikari/HikariConfig.addDataSourceProperty:(Ljava/lang/String;Ljava/lang/Object;)V
        77: aload_0
        78: ldc           #62                 // String cacheResultSetMetadata
        80: ldc           #42                 // String true
        82: invokevirtual #44                 // Method com/zaxxer/hikari/HikariConfig.addDataSourceProperty:(Ljava/lang/String;Ljava/lang/Object;)V
        85: aload_0
        86: ldc           #64                 // String cacheServerConfiguration
        88: ldc           #42                 // String true
        90: invokevirtual #44                 // Method com/zaxxer/hikari/HikariConfig.addDataSourceProperty:(Ljava/lang/String;Ljava/lang/Object;)V
        93: aload_0
        94: ldc           #66                 // String elideSetAutoCommits
        96: ldc           #42                 // String true
        98: invokevirtual #44                 // Method com/zaxxer/hikari/HikariConfig.addDataSourceProperty:(Ljava/lang/String;Ljava/lang/Object;)V
       101: aload_0
       102: ldc           #68                 // String maintainTimeStats
       104: ldc           #70                 // String false
       106: invokevirtual #44                 // Method com/zaxxer/hikari/HikariConfig.addDataSourceProperty:(Ljava/lang/String;Ljava/lang/Object;)V
       109: aload_0
       110: bipush        50
       112: invokevirtual #72                 // Method com/zaxxer/hikari/HikariConfig.setMaximumPoolSize:(I)V
       115: aload_0
       116: bipush        10
       118: invokevirtual #76                 // Method com/zaxxer/hikari/HikariConfig.setMinimumIdle:(I)V
       121: aload_0
       122: ldc2_w        #79                 // long 300000l
       125: invokevirtual #81                 // Method com/zaxxer/hikari/HikariConfig.setIdleTimeout:(J)V
       128: aload_0
       129: ldc2_w        #85                 // long 1800000l
       132: invokevirtual #87                 // Method com/zaxxer/hikari/HikariConfig.setMaxLifetime:(J)V
       135: aload_0
       136: ldc           #90                 // String SELECT 1
       138: invokevirtual #92                 // Method com/zaxxer/hikari/HikariConfig.setConnectionTestQuery:(Ljava/lang/String;)V
       141: aload_0
       142: ldc2_w        #95                 // long 60000l
       145: invokevirtual #97                 // Method com/zaxxer/hikari/HikariConfig.setLeakDetectionThreshold:(J)V
       148: aload_0
       149: ldc           #100                // String GameServerPool
       151: invokevirtual #102                // Method com/zaxxer/hikari/HikariConfig.setPoolName:(Ljava/lang/String;)V
       154: aload_0
       155: iconst_1
       156: invokevirtual #105                // Method com/zaxxer/hikari/HikariConfig.setRegisterMbeans:(Z)V
       159: new           #109                // class com/zaxxer/hikari/HikariDataSource
       162: dup
       163: aload_0
       164: invokespecial #111                // Method com/zaxxer/hikari/HikariDataSource."<init>":(Lcom/zaxxer/hikari/HikariConfig;)V
       167: putstatic     #114                // Field _source:Lcom/zaxxer/hikari/HikariDataSource;
       170: getstatic     #118                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       173: ldc           #122                // String HikariCP Pool: 50/10 | Ready!
       175: invokevirtual #124                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       178: goto          191
       181: astore_0
       182: getstatic     #118                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       185: ldc           #132                // String HikariCP failed!
       187: aload_0
       188: invokevirtual #134                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       191: return
      Exception table:
         from    to  target type
             0   178   181   Class java/lang/Exception
      LineNumberTable:
        line 47: 0
        line 50: 8
        line 51: 15
        line 52: 22
        line 54: 29
        line 55: 37
        line 56: 45
        line 57: 53
        line 58: 61
        line 59: 69
        line 60: 77
        line 61: 85
        line 62: 93
        line 63: 101
        line 65: 109
        line 66: 115
        line 67: 121
        line 68: 128
        line 70: 135
        line 71: 141
        line 72: 148
        line 73: 154
        line 75: 159
        line 77: 170
        line 84: 178
        line 82: 181
        line 83: 182
        line 85: 191
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8     170     0 config   Lcom/zaxxer/hikari/HikariConfig;
          182       9     0     e   Ljava/lang/Exception;
      StackMapTable: number_of_entries = 2
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 181
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public static void shutdown();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #114                // Field _source:Lcom/zaxxer/hikari/HikariDataSource;
         3: ifnull        16
         6: getstatic     #114                // Field _source:Lcom/zaxxer/hikari/HikariDataSource;
         9: invokevirtual #138                // Method com/zaxxer/hikari/HikariDataSource.close:()V
        12: aconst_null
        13: putstatic     #114                // Field _source:Lcom/zaxxer/hikari/HikariDataSource;
        16: return
      LineNumberTable:
        line 88: 0
        line 89: 6
        line 90: 12
        line 92: 16
      StackMapTable: number_of_entries = 1
        frame_type = 16 /* same */

  public static java.sql.Connection getConnection() throws java.sql.SQLException;
    descriptor: ()Ljava/sql/Connection;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=0
         0: getstatic     #114                // Field _source:Lcom/zaxxer/hikari/HikariDataSource;
         3: invokevirtual #141                // Method com/zaxxer/hikari/HikariDataSource.getConnection:()Ljava/sql/Connection;
         6: astore_0
         7: getstatic     #145                // Field TOTAL_QUERIES:Ljava/util/concurrent/atomic/AtomicLong;
        10: invokevirtual #149                // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
        13: pop2
        14: aload_0
        15: areturn
      LineNumberTable:
        line 95: 0
        line 96: 7
        line 101: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            7       9     0  conn   Ljava/sql/Connection;
    Exceptions:
      throws java.sql.SQLException

  public static long getTotalQueries();
    descriptor: ()J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #145                // Field TOTAL_QUERIES:Ljava/util/concurrent/atomic/AtomicLong;
         3: invokevirtual #155                // Method java/util/concurrent/atomic/AtomicLong.get:()J
         6: lreturn
      LineNumberTable:
        line 105: 0

  public static java.lang.String getStats();
    descriptor: ()Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=1, args_size=0
         0: getstatic     #114                // Field _source:Lcom/zaxxer/hikari/HikariDataSource;
         3: ifnonnull     9
         6: ldc           #158                // String HikariCP: not initialized
         8: areturn
         9: getstatic     #114                // Field _source:Lcom/zaxxer/hikari/HikariDataSource;
        12: invokevirtual #160                // Method com/zaxxer/hikari/HikariDataSource.getHikariPoolMXBean:()Lcom/zaxxer/hikari/HikariPoolMXBean;
        15: astore_0
        16: aload_0
        17: ifnull        78
        20: ldc           #164                // String HikariCP: %d active | %d idle | %d total | %d queries
        22: iconst_4
        23: anewarray     #4                  // class java/lang/Object
        26: dup
        27: iconst_0
        28: aload_0
        29: invokeinterface #166,  1          // InterfaceMethod com/zaxxer/hikari/HikariPoolMXBean.getActiveConnections:()I
        34: invokestatic  #172                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        37: aastore
        38: dup
        39: iconst_1
        40: aload_0
        41: invokeinterface #178,  1          // InterfaceMethod com/zaxxer/hikari/HikariPoolMXBean.getIdleConnections:()I
        46: invokestatic  #172                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        49: aastore
        50: dup
        51: iconst_2
        52: aload_0
        53: invokeinterface #181,  1          // InterfaceMethod com/zaxxer/hikari/HikariPoolMXBean.getTotalConnections:()I
        58: invokestatic  #172                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        61: aastore
        62: dup
        63: iconst_3
        64: getstatic     #145                // Field TOTAL_QUERIES:Ljava/util/concurrent/atomic/AtomicLong;
        67: invokevirtual #155                // Method java/util/concurrent/atomic/AtomicLong.get:()J
        70: invokestatic  #184                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        73: aastore
        74: invokestatic  #189                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        77: areturn
        78: goto          82
        81: astore_0
        82: ldc           #195                // String HikariCP: %d queries total
        84: iconst_1
        85: anewarray     #4                  // class java/lang/Object
        88: dup
        89: iconst_0
        90: getstatic     #145                // Field TOTAL_QUERIES:Ljava/util/concurrent/atomic/AtomicLong;
        93: invokevirtual #155                // Method java/util/concurrent/atomic/AtomicLong.get:()J
        96: invokestatic  #184                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        99: aastore
       100: invokestatic  #189                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       103: areturn
      Exception table:
         from    to  target type
             9    77    81   Class java/lang/Exception
      LineNumberTable:
        line 109: 0
        line 111: 9
        line 112: 16
        line 113: 20
        line 114: 29
        line 115: 41
        line 116: 53
        line 117: 67
        line 113: 74
        line 119: 78
        line 120: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           16      62     0    mx   Lcom/zaxxer/hikari/HikariPoolMXBean;
      StackMapTable: number_of_entries = 4
        frame_type = 9 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 68
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 0 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #125                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #1                  // class ext/mods/commons/pool/ConnectionPool
         6: invokevirtual #230                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #234                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #118                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: new           #150                // class java/util/concurrent/atomic/AtomicLong
        18: dup
        19: lconst_0
        20: invokespecial #235                // Method java/util/concurrent/atomic/AtomicLong."<init>":(J)V
        23: putstatic     #145                // Field TOTAL_QUERIES:Ljava/util/concurrent/atomic/AtomicLong;
        26: return
      LineNumberTable:
        line 37: 0
        line 38: 15
}
SourceFile: "ConnectionPool.java"
NestMembers:
  ext/mods/commons/pool/ConnectionPool$3
  ext/mods/commons/pool/ConnectionPool$2
  ext/mods/commons/pool/ConnectionPool$1
InnerClasses:
  #205;                                   // class ext/mods/commons/pool/ConnectionPool$1
  #218;                                   // class ext/mods/commons/pool/ConnectionPool$2
  #225;                                   // class ext/mods/commons/pool/ConnectionPool$3
