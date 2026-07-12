// Bytecode for: ext.mods.gameserver.data.manager.BufferManager
// File: ext\mods\gameserver\data\manager\BufferManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/BufferManager.class
  Last modified 9 de jul de 2026; size 15731 bytes
  MD5 checksum da68d6733e0d0baa2b3ef01f4da195a1
  Compiled from "BufferManager.java"
public class ext.mods.gameserver.data.manager.BufferManager implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/BufferManager
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 6, methods: 22, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/BufferManager._schemesTable:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/BufferManager
   #12 = NameAndType        #14:#15       // _schemesTable:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/BufferManager
   #14 = Utf8               _schemesTable
   #15 = Utf8               Ljava/util/Map;
   #16 = Class              #17           // java/util/LinkedHashMap
   #17 = Utf8               java/util/LinkedHashMap
   #18 = Methodref          #16.#3        // java/util/LinkedHashMap."<init>":()V
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/data/manager/BufferManager._availableBuffs:Ljava/util/Map;
   #20 = NameAndType        #21:#15       // _availableBuffs:Ljava/util/Map;
   #21 = Utf8               _availableBuffs
   #22 = Class              #23           // java/util/HashMap
   #23 = Utf8               java/util/HashMap
   #24 = Methodref          #22.#3        // java/util/HashMap."<init>":()V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/manager/BufferManager._availableSchemes:Ljava/util/Map;
   #26 = NameAndType        #27:#15       // _availableSchemes:Ljava/util/Map;
   #27 = Utf8               _availableSchemes
   #28 = Methodref          #11.#29       // ext/mods/gameserver/data/manager/BufferManager.load:()V
   #29 = NameAndType        #30:#6        // load:()V
   #30 = Utf8               load
   #31 = String             #32           // custom/mods/bufferSkills.xml
   #32 = Utf8               custom/mods/bufferSkills.xml
   #33 = Methodref          #11.#34       // ext/mods/gameserver/data/manager/BufferManager.parseDataFile:(Ljava/lang/String;)V
   #34 = NameAndType        #35:#36       // parseDataFile:(Ljava/lang/String;)V
   #35 = Utf8               parseDataFile
   #36 = Utf8               (Ljava/lang/String;)V
   #37 = Fieldref           #11.#38       // ext/mods/gameserver/data/manager/BufferManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #38 = NameAndType        #39:#40       // LOGGER:Lext/mods/commons/logging/CLogger;
   #39 = Utf8               LOGGER
   #40 = Utf8               Lext/mods/commons/logging/CLogger;
   #41 = String             #42           // Loaded {} available buffs.
   #42 = Utf8               Loaded {} available buffs.
   #43 = InterfaceMethodref #44.#45       // java/util/Map.size:()I
   #44 = Class              #46           // java/util/Map
   #45 = NameAndType        #47:#48       // size:()I
   #46 = Utf8               java/util/Map
   #47 = Utf8               size
   #48 = Utf8               ()I
   #49 = Methodref          #50.#51       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #50 = Class              #52           // java/lang/Integer
   #51 = NameAndType        #53:#54       // valueOf:(I)Ljava/lang/Integer;
   #52 = Utf8               java/lang/Integer
   #53 = Utf8               valueOf
   #54 = Utf8               (I)Ljava/lang/Integer;
   #55 = Methodref          #56.#57       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #56 = Class              #58           // ext/mods/commons/logging/CLogger
   #57 = NameAndType        #59:#60       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #58 = Utf8               ext/mods/commons/logging/CLogger
   #59 = Utf8               info
   #60 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #61 = String             #62           // Loaded {} ready to use schemes.
   #62 = Utf8               Loaded {} ready to use schemes.
   #63 = Methodref          #64.#65       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #64 = Class              #66           // ext/mods/commons/pool/ConnectionPool
   #65 = NameAndType        #67:#68       // getConnection:()Ljava/sql/Connection;
   #66 = Utf8               ext/mods/commons/pool/ConnectionPool
   #67 = Utf8               getConnection
   #68 = Utf8               ()Ljava/sql/Connection;
   #69 = String             #70           // SELECT * FROM buffer_schemes
   #70 = Utf8               SELECT * FROM buffer_schemes
   #71 = InterfaceMethodref #72.#73       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #72 = Class              #74           // java/sql/Connection
   #73 = NameAndType        #75:#76       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #74 = Utf8               java/sql/Connection
   #75 = Utf8               prepareStatement
   #76 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #77 = InterfaceMethodref #78.#79       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #78 = Class              #80           // java/sql/PreparedStatement
   #79 = NameAndType        #81:#82       // executeQuery:()Ljava/sql/ResultSet;
   #80 = Utf8               java/sql/PreparedStatement
   #81 = Utf8               executeQuery
   #82 = Utf8               ()Ljava/sql/ResultSet;
   #83 = InterfaceMethodref #84.#85       // java/sql/ResultSet.next:()Z
   #84 = Class              #86           // java/sql/ResultSet
   #85 = NameAndType        #87:#88       // next:()Z
   #86 = Utf8               java/sql/ResultSet
   #87 = Utf8               next
   #88 = Utf8               ()Z
   #89 = Class              #90           // java/util/ArrayList
   #90 = Utf8               java/util/ArrayList
   #91 = Methodref          #89.#3        // java/util/ArrayList."<init>":()V
   #92 = String             #93           // skills
   #93 = Utf8               skills
   #94 = InterfaceMethodref #84.#95       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #95 = NameAndType        #96:#97       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #96 = Utf8               getString
   #97 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #98 = String             #99           // ,
   #99 = Utf8               ,
  #100 = Methodref          #101.#102     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #101 = Class              #103          // java/lang/String
  #102 = NameAndType        #104:#105     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #103 = Utf8               java/lang/String
  #104 = Utf8               split
  #105 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #106 = String             #107          // levels
  #107 = Utf8               levels
  #108 = Methodref          #101.#109     // java/lang/String.length:()I
  #109 = NameAndType        #110:#48      // length:()I
  #110 = Utf8               length
  #111 = Methodref          #101.#112     // java/lang/String.isEmpty:()Z
  #112 = NameAndType        #113:#88      // isEmpty:()Z
  #113 = Utf8               isEmpty
  #114 = Methodref          #50.#115      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #115 = NameAndType        #116:#117     // parseInt:(Ljava/lang/String;)I
  #116 = Utf8               parseInt
  #117 = Utf8               (Ljava/lang/String;)I
  #118 = Methodref          #119.#120     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #119 = Class              #121          // ext/mods/gameserver/data/SkillTable
  #120 = NameAndType        #122:#123     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #121 = Utf8               ext/mods/gameserver/data/SkillTable
  #122 = Utf8               getInstance
  #123 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #124 = Methodref          #119.#125     // ext/mods/gameserver/data/SkillTable.getMaxLevel:(I)I
  #125 = NameAndType        #126:#127     // getMaxLevel:(I)I
  #126 = Utf8               getMaxLevel
  #127 = Utf8               (I)I
  #128 = Methodref          #119.#129     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #129 = NameAndType        #130:#131     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #130 = Utf8               getInfo
  #131 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #132 = InterfaceMethodref #44.#133      // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #133 = NameAndType        #134:#135     // containsKey:(Ljava/lang/Object;)Z
  #134 = Utf8               containsKey
  #135 = Utf8               (Ljava/lang/Object;)Z
  #136 = Methodref          #89.#137      // java/util/ArrayList.add:(Ljava/lang/Object;)Z
  #137 = NameAndType        #138:#135     // add:(Ljava/lang/Object;)Z
  #138 = Utf8               add
  #139 = String             #140          // object_id
  #140 = Utf8               object_id
  #141 = InterfaceMethodref #84.#142      // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #142 = NameAndType        #143:#117     // getInt:(Ljava/lang/String;)I
  #143 = Utf8               getInt
  #144 = String             #145          // scheme_name
  #145 = Utf8               scheme_name
  #146 = Methodref          #11.#147      // ext/mods/gameserver/data/manager/BufferManager.setScheme:(ILjava/lang/String;Ljava/util/ArrayList;)V
  #147 = NameAndType        #148:#149     // setScheme:(ILjava/lang/String;Ljava/util/ArrayList;)V
  #148 = Utf8               setScheme
  #149 = Utf8               (ILjava/lang/String;Ljava/util/ArrayList;)V
  #150 = InterfaceMethodref #84.#151      // java/sql/ResultSet.close:()V
  #151 = NameAndType        #152:#6       // close:()V
  #152 = Utf8               close
  #153 = Class              #154          // java/lang/Throwable
  #154 = Utf8               java/lang/Throwable
  #155 = Methodref          #153.#156     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #156 = NameAndType        #157:#158     // addSuppressed:(Ljava/lang/Throwable;)V
  #157 = Utf8               addSuppressed
  #158 = Utf8               (Ljava/lang/Throwable;)V
  #159 = InterfaceMethodref #78.#151      // java/sql/PreparedStatement.close:()V
  #160 = InterfaceMethodref #72.#151      // java/sql/Connection.close:()V
  #161 = Class              #162          // java/lang/Exception
  #162 = Utf8               java/lang/Exception
  #163 = String             #164          // Failed to load schemes data.
  #164 = Utf8               Failed to load schemes data.
  #165 = Methodref          #56.#166      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #166 = NameAndType        #167:#168     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #167 = Utf8               error
  #168 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #169 = String             #170          // list
  #170 = Utf8               list
  #171 = InvokeDynamic      #0:#172       // #0:accept:(Lext/mods/gameserver/data/manager/BufferManager;)Ljava/util/function/Consumer;
  #172 = NameAndType        #173:#174     // accept:(Lext/mods/gameserver/data/manager/BufferManager;)Ljava/util/function/Consumer;
  #173 = Utf8               accept
  #174 = Utf8               (Lext/mods/gameserver/data/manager/BufferManager;)Ljava/util/function/Consumer;
  #175 = Methodref          #11.#176      // ext/mods/gameserver/data/manager/BufferManager.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #176 = NameAndType        #177:#178     // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #177 = Utf8               forEach
  #178 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #179 = Class              #180          // java/lang/StringBuilder
  #180 = Utf8               java/lang/StringBuilder
  #181 = Methodref          #179.#3       // java/lang/StringBuilder."<init>":()V
  #182 = String             #183          // TRUNCATE buffer_schemes
  #183 = Utf8               TRUNCATE buffer_schemes
  #184 = InterfaceMethodref #78.#185      // java/sql/PreparedStatement.execute:()Z
  #185 = NameAndType        #186:#88      // execute:()Z
  #186 = Utf8               execute
  #187 = String             #188          // INSERT INTO buffer_schemes (object_id, scheme_name, skills, levels) VALUES (?,?,?,?)
  #188 = Utf8               INSERT INTO buffer_schemes (object_id, scheme_name, skills, levels) VALUES (?,?,?,?)
  #189 = InterfaceMethodref #44.#190      // java/util/Map.entrySet:()Ljava/util/Set;
  #190 = NameAndType        #191:#192     // entrySet:()Ljava/util/Set;
  #191 = Utf8               entrySet
  #192 = Utf8               ()Ljava/util/Set;
  #193 = InterfaceMethodref #194.#195     // java/util/Set.iterator:()Ljava/util/Iterator;
  #194 = Class              #196          // java/util/Set
  #195 = NameAndType        #197:#198     // iterator:()Ljava/util/Iterator;
  #196 = Utf8               java/util/Set
  #197 = Utf8               iterator
  #198 = Utf8               ()Ljava/util/Iterator;
  #199 = InterfaceMethodref #200.#201     // java/util/Iterator.hasNext:()Z
  #200 = Class              #202          // java/util/Iterator
  #201 = NameAndType        #203:#88      // hasNext:()Z
  #202 = Utf8               java/util/Iterator
  #203 = Utf8               hasNext
  #204 = InterfaceMethodref #200.#205     // java/util/Iterator.next:()Ljava/lang/Object;
  #205 = NameAndType        #87:#206      // next:()Ljava/lang/Object;
  #206 = Utf8               ()Ljava/lang/Object;
  #207 = Class              #208          // java/util/Map$Entry
  #208 = Utf8               java/util/Map$Entry
  #209 = InterfaceMethodref #207.#210     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #210 = NameAndType        #211:#206     // getValue:()Ljava/lang/Object;
  #211 = Utf8               getValue
  #212 = Methodref          #89.#195      // java/util/ArrayList.iterator:()Ljava/util/Iterator;
  #213 = Class              #214          // ext/mods/gameserver/skills/L2Skill
  #214 = Utf8               ext/mods/gameserver/skills/L2Skill
  #215 = Methodref          #213.#216     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #216 = NameAndType        #217:#48      // getId:()I
  #217 = Utf8               getId
  #218 = Methodref          #219.#220     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #219 = Class              #221          // ext/mods/commons/lang/StringUtil
  #220 = NameAndType        #222:#223     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #221 = Utf8               ext/mods/commons/lang/StringUtil
  #222 = Utf8               append
  #223 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #224 = Methodref          #213.#225     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #225 = NameAndType        #226:#48      // getLevel:()I
  #226 = Utf8               getLevel
  #227 = Methodref          #179.#109     // java/lang/StringBuilder.length:()I
  #228 = Methodref          #179.#229     // java/lang/StringBuilder.setLength:(I)V
  #229 = NameAndType        #230:#231     // setLength:(I)V
  #230 = Utf8               setLength
  #231 = Utf8               (I)V
  #232 = InterfaceMethodref #207.#233     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #233 = NameAndType        #234:#206     // getKey:()Ljava/lang/Object;
  #234 = Utf8               getKey
  #235 = Methodref          #50.#236      // java/lang/Integer.intValue:()I
  #236 = NameAndType        #237:#48      // intValue:()I
  #237 = Utf8               intValue
  #238 = InterfaceMethodref #78.#239      // java/sql/PreparedStatement.setInt:(II)V
  #239 = NameAndType        #240:#241     // setInt:(II)V
  #240 = Utf8               setInt
  #241 = Utf8               (II)V
  #242 = InterfaceMethodref #78.#243      // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #243 = NameAndType        #244:#245     // setString:(ILjava/lang/String;)V
  #244 = Utf8               setString
  #245 = Utf8               (ILjava/lang/String;)V
  #246 = Methodref          #179.#247     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #247 = NameAndType        #248:#249     // toString:()Ljava/lang/String;
  #248 = Utf8               toString
  #249 = Utf8               ()Ljava/lang/String;
  #250 = InterfaceMethodref #78.#251      // java/sql/PreparedStatement.addBatch:()V
  #251 = NameAndType        #252:#6       // addBatch:()V
  #252 = Utf8               addBatch
  #253 = InterfaceMethodref #78.#254      // java/sql/PreparedStatement.executeBatch:()[I
  #254 = NameAndType        #255:#256     // executeBatch:()[I
  #255 = Utf8               executeBatch
  #256 = Utf8               ()[I
  #257 = String             #258          // Failed to save schemes data.
  #258 = Utf8               Failed to save schemes data.
  #259 = InvokeDynamic      #1:#260       // #1:apply:()Ljava/util/function/Function;
  #260 = NameAndType        #261:#262     // apply:()Ljava/util/function/Function;
  #261 = Utf8               apply
  #262 = Utf8               ()Ljava/util/function/Function;
  #263 = InterfaceMethodref #44.#264      // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #264 = NameAndType        #265:#266     // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #265 = Utf8               computeIfAbsent
  #266 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #267 = Fieldref           #268.#269     // ext/mods/Config.BUFFER_MAX_SCHEMES:I
  #268 = Class              #270          // ext/mods/Config
  #269 = NameAndType        #271:#272     // BUFFER_MAX_SCHEMES:I
  #270 = Utf8               ext/mods/Config
  #271 = Utf8               BUFFER_MAX_SCHEMES
  #272 = Utf8               I
  #273 = InterfaceMethodref #44.#274      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #274 = NameAndType        #275:#276     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #275 = Utf8               put
  #276 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #277 = InterfaceMethodref #44.#278      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #278 = NameAndType        #279:#280     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #279 = Utf8               get
  #280 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #281 = Methodref          #282.#283     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #282 = Class              #284          // ext/mods/gameserver/model/World
  #283 = NameAndType        #122:#285     // getInstance:()Lext/mods/gameserver/model/World;
  #284 = Utf8               ext/mods/gameserver/model/World
  #285 = Utf8               ()Lext/mods/gameserver/model/World;
  #286 = Methodref          #282.#287     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #287 = NameAndType        #288:#289     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #288 = Utf8               getPlayer
  #289 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #290 = Methodref          #291.#292     // java/util/Collections.emptyList:()Ljava/util/List;
  #291 = Class              #293          // java/util/Collections
  #292 = NameAndType        #294:#295     // emptyList:()Ljava/util/List;
  #293 = Utf8               java/util/Collections
  #294 = Utf8               emptyList
  #295 = Utf8               ()Ljava/util/List;
  #296 = Methodref          #297.#298     // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
  #297 = Class              #299          // ext/mods/gameserver/model/actor/Player
  #298 = NameAndType        #300:#48      // getPremiumService:()I
  #299 = Utf8               ext/mods/gameserver/model/actor/Player
  #300 = Utf8               getPremiumService
  #301 = Methodref          #89.#45       // java/util/ArrayList.size:()I
  #302 = Fieldref           #268.#303     // ext/mods/Config.PREMIUM_BUFFS_CATEGORY:Ljava/util/List;
  #303 = NameAndType        #304:#305     // PREMIUM_BUFFS_CATEGORY:Ljava/util/List;
  #304 = Utf8               PREMIUM_BUFFS_CATEGORY
  #305 = Utf8               Ljava/util/List;
  #306 = Methodref          #89.#307      // java/util/ArrayList.get:(I)Ljava/lang/Object;
  #307 = NameAndType        #279:#308     // get:(I)Ljava/lang/Object;
  #308 = Utf8               (I)Ljava/lang/Object;
  #309 = Methodref          #11.#310      // ext/mods/gameserver/data/manager/BufferManager.getAvailableBuff:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
  #310 = NameAndType        #311:#312     // getAvailableBuff:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
  #311 = Utf8               getAvailableBuff
  #312 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
  #313 = Methodref          #314.#315     // ext/mods/gameserver/model/records/BuffSkill.type:()Ljava/lang/String;
  #314 = Class              #316          // ext/mods/gameserver/model/records/BuffSkill
  #315 = NameAndType        #317:#249     // type:()Ljava/lang/String;
  #316 = Utf8               ext/mods/gameserver/model/records/BuffSkill
  #317 = Utf8               type
  #318 = InterfaceMethodref #319.#320     // java/util/List.contains:(Ljava/lang/Object;)Z
  #319 = Class              #321          // java/util/List
  #320 = NameAndType        #322:#135     // contains:(Ljava/lang/Object;)Z
  #321 = Utf8               java/util/List
  #322 = Utf8               contains
  #323 = Methodref          #89.#324      // java/util/ArrayList.remove:(I)Ljava/lang/Object;
  #324 = NameAndType        #325:#308     // remove:(I)Ljava/lang/Object;
  #325 = Utf8               remove
  #326 = Methodref          #11.#327      // ext/mods/gameserver/data/manager/BufferManager.getScheme:(ILjava/lang/String;)Ljava/util/List;
  #327 = NameAndType        #328:#329     // getScheme:(ILjava/lang/String;)Ljava/util/List;
  #328 = Utf8               getScheme
  #329 = Utf8               (ILjava/lang/String;)Ljava/util/List;
  #330 = InterfaceMethodref #319.#195     // java/util/List.iterator:()Ljava/util/Iterator;
  #331 = Methodref          #314.#332     // ext/mods/gameserver/model/records/BuffSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #332 = NameAndType        #333:#334     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #333 = Utf8               getSkill
  #334 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #335 = Methodref          #213.#336     // ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
  #336 = NameAndType        #337:#88      // isDebuff:()Z
  #337 = Utf8               isDebuff
  #338 = Methodref          #339.#340     // ext/mods/gameserver/model/actor/Creature.stopAllEffectsDebuff:()V
  #339 = Class              #341          // ext/mods/gameserver/model/actor/Creature
  #340 = NameAndType        #342:#6       // stopAllEffectsDebuff:()V
  #341 = Utf8               ext/mods/gameserver/model/actor/Creature
  #342 = Utf8               stopAllEffectsDebuff
  #343 = Methodref          #213.#344     // ext/mods/gameserver/skills/L2Skill.getEffectsNpc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #344 = NameAndType        #345:#346     // getEffectsNpc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #345 = Utf8               getEffectsNpc
  #346 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #347 = InterfaceMethodref #44.#348      // java/util/Map.values:()Ljava/util/Collection;
  #348 = NameAndType        #349:#350     // values:()Ljava/util/Collection;
  #349 = Utf8               values
  #350 = Utf8               ()Ljava/util/Collection;
  #351 = InterfaceMethodref #352.#195     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #352 = Class              #353          // java/util/Collection
  #353 = Utf8               java/util/Collection
  #354 = Methodref          #101.#355     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #355 = NameAndType        #356:#357     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #356 = Utf8               equalsIgnoreCase
  #357 = Utf8               (Ljava/lang/String;)Z
  #358 = InterfaceMethodref #319.#137     // java/util/List.add:(Ljava/lang/Object;)Z
  #359 = InvokeDynamic      #2:#360       // #2:accept:(Ljava/util/List;)Ljava/util/function/Consumer;
  #360 = NameAndType        #173:#361     // accept:(Ljava/util/List;)Ljava/util/function/Consumer;
  #361 = Utf8               (Ljava/util/List;)Ljava/util/function/Consumer;
  #362 = InterfaceMethodref #319.#363     // java/util/List.forEach:(Ljava/util/function/Consumer;)V
  #363 = NameAndType        #177:#364     // forEach:(Ljava/util/function/Consumer;)V
  #364 = Utf8               (Ljava/util/function/Consumer;)V
  #365 = Fieldref           #366.#367     // ext/mods/gameserver/data/manager/BufferManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/BufferManager;
  #366 = Class              #368          // ext/mods/gameserver/data/manager/BufferManager$SingletonHolder
  #367 = NameAndType        #369:#370     // INSTANCE:Lext/mods/gameserver/data/manager/BufferManager;
  #368 = Utf8               ext/mods/gameserver/data/manager/BufferManager$SingletonHolder
  #369 = Utf8               INSTANCE
  #370 = Utf8               Lext/mods/gameserver/data/manager/BufferManager;
  #371 = Class              #372          // java/util/TreeMap
  #372 = Utf8               java/util/TreeMap
  #373 = Fieldref           #101.#374     // java/lang/String.CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;
  #374 = NameAndType        #375:#376     // CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;
  #375 = Utf8               CASE_INSENSITIVE_ORDER
  #376 = Utf8               Ljava/util/Comparator;
  #377 = Methodref          #371.#378     // java/util/TreeMap."<init>":(Ljava/util/Comparator;)V
  #378 = NameAndType        #5:#379       // "<init>":(Ljava/util/Comparator;)V
  #379 = Utf8               (Ljava/util/Comparator;)V
  #380 = String             #381          // category
  #381 = Utf8               category
  #382 = InvokeDynamic      #3:#172       // #3:accept:(Lext/mods/gameserver/data/manager/BufferManager;)Ljava/util/function/Consumer;
  #383 = String             #384          // scheme
  #384 = Utf8               scheme
  #385 = InvokeDynamic      #4:#172       // #4:accept:(Lext/mods/gameserver/data/manager/BufferManager;)Ljava/util/function/Consumer;
  #386 = InterfaceMethodref #387.#388     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #387 = Class              #389          // org/w3c/dom/Node
  #388 = NameAndType        #390:#391     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #389 = Utf8               org/w3c/dom/Node
  #390 = Utf8               getAttributes
  #391 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #392 = String             #317          // type
  #393 = Methodref          #11.#394      // ext/mods/gameserver/data/manager/BufferManager.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #394 = NameAndType        #395:#396     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #395 = Utf8               parseString
  #396 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #397 = Methodref          #101.#398     // java/lang/String.toUpperCase:()Ljava/lang/String;
  #398 = NameAndType        #399:#249     // toUpperCase:()Ljava/lang/String;
  #399 = Utf8               toUpperCase
  #400 = String             #401          // buff
  #401 = Utf8               buff
  #402 = InvokeDynamic      #5:#403       // #5:accept:(Lext/mods/gameserver/data/manager/BufferManager;Ljava/util/List;Ljava/lang/String;)Ljava/util/function/Consumer;
  #403 = NameAndType        #173:#404     // accept:(Lext/mods/gameserver/data/manager/BufferManager;Ljava/util/List;Ljava/lang/String;)Ljava/util/function/Consumer;
  #404 = Utf8               (Lext/mods/gameserver/data/manager/BufferManager;Ljava/util/List;Ljava/lang/String;)Ljava/util/function/Consumer;
  #405 = Methodref          #406.#407     // ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #406 = Class              #408          // ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
  #407 = NameAndType        #53:#409      // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #408 = Utf8               ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
  #409 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #410 = String             #411          // id
  #411 = Utf8               id
  #412 = Methodref          #11.#413      // ext/mods/gameserver/data/manager/BufferManager.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #413 = NameAndType        #414:#415     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #414 = Utf8               parseInteger
  #415 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #416 = String             #417          // level
  #417 = Utf8               level
  #418 = Methodref          #11.#419      // ext/mods/gameserver/data/manager/BufferManager.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #419 = NameAndType        #414:#420     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #420 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #421 = String             #422          // price
  #422 = Utf8               price
  #423 = String             #424          // time
  #424 = Utf8               time
  #425 = String             #426          //
  #426 = Utf8
  #427 = Methodref          #314.#428     // ext/mods/gameserver/model/records/BuffSkill."<init>":(IIIILjava/lang/String;Ljava/lang/String;)V
  #428 = NameAndType        #5:#429       // "<init>":(IIIILjava/lang/String;Ljava/lang/String;)V
  #429 = Utf8               (IIIILjava/lang/String;Ljava/lang/String;)V
  #430 = InvokeDynamic      #6:#431       // #6:accept:(Lext/mods/gameserver/data/manager/BufferManager;Ljava/lang/String;)Ljava/util/function/Consumer;
  #431 = NameAndType        #173:#432     // accept:(Lext/mods/gameserver/data/manager/BufferManager;Ljava/lang/String;)Ljava/util/function/Consumer;
  #432 = Utf8               (Lext/mods/gameserver/data/manager/BufferManager;Ljava/lang/String;)Ljava/util/function/Consumer;
  #433 = String             #434          // desc
  #434 = Utf8               desc
  #435 = Methodref          #11.#436      // ext/mods/gameserver/data/manager/BufferManager.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #436 = NameAndType        #395:#437     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #437 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #438 = Class              #439          // ext/mods/commons/data/xml/IXmlReader
  #439 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #440 = Utf8               LOAD_SCHEMES
  #441 = Utf8               Ljava/lang/String;
  #442 = Utf8               ConstantValue
  #443 = Utf8               TRUNCATE_SCHEMES
  #444 = Utf8               INSERT_SCHEME
  #445 = Utf8               Signature
  #446 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;>;
  #447 = Utf8               Ljava/util/Map<Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/BuffSkill;>;
  #448 = Utf8               Ljava/util/Map<Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;Ljava/util/List<Lext/mods/gameserver/model/records/BuffSkill;>;>;
  #449 = Utf8               Code
  #450 = Utf8               LineNumberTable
  #451 = Utf8               LocalVariableTable
  #452 = Utf8               this
  #453 = Utf8               skillId
  #454 = Utf8               skillLevel
  #455 = Utf8               skill
  #456 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #457 = Utf8               i
  #458 = Utf8               schemeList
  #459 = Utf8               Ljava/util/ArrayList;
  #460 = Utf8               [Ljava/lang/String;
  #461 = Utf8               levelsString
  #462 = Utf8               rs
  #463 = Utf8               Ljava/sql/ResultSet;
  #464 = Utf8               ps
  #465 = Utf8               Ljava/sql/PreparedStatement;
  #466 = Utf8               con
  #467 = Utf8               Ljava/sql/Connection;
  #468 = Utf8               e
  #469 = Utf8               Ljava/lang/Exception;
  #470 = Utf8               LocalVariableTypeTable
  #471 = Utf8               Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;
  #472 = Utf8               StackMapTable
  #473 = Class              #460          // "[Ljava/lang/String;"
  #474 = Utf8               parseDocument
  #475 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #476 = Utf8               doc
  #477 = Utf8               Lorg/w3c/dom/Document;
  #478 = Utf8               path
  #479 = Utf8               Ljava/nio/file/Path;
  #480 = Utf8               saveSchemes
  #481 = Utf8               Ljava/util/Map$Entry;
  #482 = Utf8               player
  #483 = Utf8               sb
  #484 = Utf8               Ljava/lang/StringBuilder;
  #485 = Utf8               sb2
  #486 = Utf8               Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
  #487 = Utf8               Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;>;
  #488 = Utf8               playerId
  #489 = Utf8               schemeName
  #490 = Utf8               schemes
  #491 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
  #492 = Utf8               (ILjava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;)V
  #493 = Utf8               getPlayerSchemes
  #494 = Utf8               (I)Ljava/util/Map;
  #495 = Utf8               (I)Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
  #496 = Utf8               j
  #497 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #498 = Utf8               (ILjava/lang/String;)Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #499 = Utf8               applySchemeEffects
  #500 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILjava/lang/String;)V
  #501 = Utf8               s
  #502 = Utf8               holder
  #503 = Utf8               Lext/mods/gameserver/model/records/BuffSkill;
  #504 = Utf8               npc
  #505 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #506 = Utf8               target
  #507 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #508 = Utf8               getSchemeContainsSkill
  #509 = Utf8               (ILjava/lang/String;Lext/mods/gameserver/skills/L2Skill;)Z
  #510 = Utf8               getSkillsIdsByType
  #511 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #512 = Utf8               groupType
  #513 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #514 = Utf8               (Ljava/lang/String;)Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #515 = Utf8               getSchemeSkills
  #516 = Utf8               (Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;)Ljava/util/List;
  #517 = Utf8               schemeType
  #518 = Utf8               Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
  #519 = Utf8               (Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;)Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #520 = Utf8               getSkillTypes
  #521 = Utf8               skillTypes
  #522 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #523 = Utf8               ()Ljava/util/List<Ljava/lang/String;>;
  #524 = Utf8               getAvailableBuffs
  #525 = Utf8               ()Ljava/util/Map;
  #526 = Utf8               ()Ljava/util/Map<Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/BuffSkill;>;
  #527 = Utf8               ()Lext/mods/gameserver/data/manager/BufferManager;
  #528 = Utf8               lambda$getSchemeSkills$0
  #529 = Utf8               (Ljava/util/List;Lext/mods/gameserver/model/records/BuffSkill;)V
  #530 = Utf8               lambda$setScheme$0
  #531 = Utf8               (Ljava/lang/Integer;)Ljava/util/Map;
  #532 = Utf8               Ljava/lang/Integer;
  #533 = Utf8               lambda$parseDocument$0
  #534 = Utf8               (Lorg/w3c/dom/Node;)V
  #535 = Utf8               listNode
  #536 = Utf8               Lorg/w3c/dom/Node;
  #537 = Utf8               lambda$parseDocument$3
  #538 = Utf8               schemeNode
  #539 = Utf8               skillHolder
  #540 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/BuffSkill;>;
  #541 = Utf8               lambda$parseDocument$4
  #542 = Utf8               (Ljava/util/List;Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #543 = Utf8               buffNode
  #544 = Utf8               attrs
  #545 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #546 = Utf8               lambda$parseDocument$1
  #547 = Utf8               categoryNode
  #548 = Utf8               lambda$parseDocument$2
  #549 = Utf8               (Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #550 = Utf8               skillLvl
  #551 = Utf8               SourceFile
  #552 = Utf8               BufferManager.java
  #553 = Utf8               NestMembers
  #554 = Utf8               BootstrapMethods
  #555 = MethodType         #556          //  (Ljava/lang/Object;)V
  #556 = Utf8               (Ljava/lang/Object;)V
  #557 = MethodHandle       5:#558        // REF_invokeVirtual ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #558 = Methodref          #11.#559      // ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #559 = NameAndType        #533:#534     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #560 = MethodType         #534          //  (Lorg/w3c/dom/Node;)V
  #561 = MethodType         #280          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #562 = MethodHandle       6:#563        // REF_invokeStatic ext/mods/gameserver/data/manager/BufferManager.lambda$setScheme$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #563 = Methodref          #11.#564      // ext/mods/gameserver/data/manager/BufferManager.lambda$setScheme$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #564 = NameAndType        #530:#531     // lambda$setScheme$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #565 = MethodType         #531          //  (Ljava/lang/Integer;)Ljava/util/Map;
  #566 = MethodHandle       6:#567        // REF_invokeStatic ext/mods/gameserver/data/manager/BufferManager.lambda$getSchemeSkills$0:(Ljava/util/List;Lext/mods/gameserver/model/records/BuffSkill;)V
  #567 = Methodref          #11.#568      // ext/mods/gameserver/data/manager/BufferManager.lambda$getSchemeSkills$0:(Ljava/util/List;Lext/mods/gameserver/model/records/BuffSkill;)V
  #568 = NameAndType        #528:#529     // lambda$getSchemeSkills$0:(Ljava/util/List;Lext/mods/gameserver/model/records/BuffSkill;)V
  #569 = MethodType         #570          //  (Lext/mods/gameserver/model/records/BuffSkill;)V
  #570 = Utf8               (Lext/mods/gameserver/model/records/BuffSkill;)V
  #571 = MethodHandle       5:#572        // REF_invokeVirtual ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #572 = Methodref          #11.#573      // ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #573 = NameAndType        #546:#534     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #574 = MethodHandle       5:#575        // REF_invokeVirtual ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
  #575 = Methodref          #11.#576      // ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
  #576 = NameAndType        #537:#534     // lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
  #577 = MethodHandle       5:#578        // REF_invokeVirtual ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$4:(Ljava/util/List;Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #578 = Methodref          #11.#579      // ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$4:(Ljava/util/List;Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #579 = NameAndType        #541:#542     // lambda$parseDocument$4:(Ljava/util/List;Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #580 = MethodHandle       5:#581        // REF_invokeVirtual ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$2:(Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #581 = Methodref          #11.#582      // ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$2:(Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #582 = NameAndType        #548:#549     // lambda$parseDocument$2:(Ljava/lang/String;Lorg/w3c/dom/Node;)V
  #583 = MethodHandle       6:#584        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #584 = Methodref          #585.#586     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #585 = Class              #587          // java/lang/invoke/LambdaMetafactory
  #586 = NameAndType        #588:#589     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #587 = Utf8               java/lang/invoke/LambdaMetafactory
  #588 = Utf8               metafactory
  #589 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #590 = Utf8               InnerClasses
  #591 = Utf8               Entry
  #592 = Utf8               SingletonHolder
  #593 = Utf8               BufferSchemeType
  #594 = Class              #595          // java/lang/invoke/MethodHandles$Lookup
  #595 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #596 = Class              #597          // java/lang/invoke/MethodHandles
  #597 = Utf8               java/lang/invoke/MethodHandles
  #598 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.manager.BufferManager();
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
        12: putfield      #10                 // Field _schemesTable:Ljava/util/Map;
        15: aload_0
        16: new           #16                 // class java/util/LinkedHashMap
        19: dup
        20: invokespecial #18                 // Method java/util/LinkedHashMap."<init>":()V
        23: putfield      #19                 // Field _availableBuffs:Ljava/util/Map;
        26: aload_0
        27: new           #22                 // class java/util/HashMap
        30: dup
        31: invokespecial #24                 // Method java/util/HashMap."<init>":()V
        34: putfield      #25                 // Field _availableSchemes:Ljava/util/Map;
        37: aload_0
        38: invokevirtual #28                 // Method load:()V
        41: return
      LineNumberTable:
        line 70: 0
        line 59: 4
        line 60: 15
        line 61: 26
        line 71: 37
        line 72: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/data/manager/BufferManager;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=12, args_size=1
         0: aload_0
         1: ldc           #31                 // String custom/mods/bufferSkills.xml
         3: invokevirtual #33                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #37                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #41                 // String Loaded {} available buffs.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #19                 // Field _availableBuffs:Ljava/util/Map;
        21: invokeinterface #43,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #49                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #55                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: getstatic     #37                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        36: ldc           #61                 // String Loaded {} ready to use schemes.
        38: iconst_1
        39: anewarray     #2                  // class java/lang/Object
        42: dup
        43: iconst_0
        44: aload_0
        45: getfield      #25                 // Field _availableSchemes:Ljava/util/Map;
        48: invokeinterface #43,  1           // InterfaceMethod java/util/Map.size:()I
        53: invokestatic  #49                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        56: aastore
        57: invokevirtual #55                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        60: invokestatic  #63                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        63: astore_1
        64: aload_1
        65: ldc           #69                 // String SELECT * FROM buffer_schemes
        67: invokeinterface #71,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        72: astore_2
        73: aload_2
        74: invokeinterface #77,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        79: astore_3
        80: aload_3
        81: invokeinterface #83,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        86: ifeq          296
        89: new           #89                 // class java/util/ArrayList
        92: dup
        93: invokespecial #91                 // Method java/util/ArrayList."<init>":()V
        96: astore        4
        98: aload_3
        99: ldc           #92                 // String skills
       101: invokeinterface #94,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       106: ldc           #98                 // String ,
       108: invokevirtual #100                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       111: astore        5
       113: aload_3
       114: ldc           #106                // String levels
       116: invokeinterface #94,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       121: astore        6
       123: aconst_null
       124: astore        7
       126: aload         6
       128: ifnull        148
       131: aload         6
       133: invokevirtual #108                // Method java/lang/String.length:()I
       136: ifeq          148
       139: aload         6
       141: ldc           #98                 // String ,
       143: invokevirtual #100                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       146: astore        7
       148: iconst_0
       149: istore        8
       151: iload         8
       153: aload         5
       155: arraylength
       156: if_icmpge     271
       159: aload         5
       161: iload         8
       163: aaload
       164: invokevirtual #111                // Method java/lang/String.isEmpty:()Z
       167: ifeq          173
       170: goto          271
       173: aload         5
       175: iload         8
       177: aaload
       178: invokestatic  #114                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       181: istore        9
       183: aload         7
       185: ifnull        194
       188: aload         7
       190: arraylength
       191: ifne          205
       194: invokestatic  #118                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       197: iload         9
       199: invokevirtual #124                // Method ext/mods/gameserver/data/SkillTable.getMaxLevel:(I)I
       202: goto          213
       205: aload         7
       207: iload         8
       209: aaload
       210: invokestatic  #114                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       213: istore        10
       215: iload         10
       217: iconst_m1
       218: if_icmpne     231
       221: invokestatic  #118                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       224: iload         9
       226: invokevirtual #124                // Method ext/mods/gameserver/data/SkillTable.getMaxLevel:(I)I
       229: istore        10
       231: invokestatic  #118                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       234: iload         9
       236: iload         10
       238: invokevirtual #128                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       241: astore        11
       243: aload_0
       244: getfield      #19                 // Field _availableBuffs:Ljava/util/Map;
       247: aload         11
       249: invokeinterface #132,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
       254: ifeq          265
       257: aload         4
       259: aload         11
       261: invokevirtual #136                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
       264: pop
       265: iinc          8, 1
       268: goto          151
       271: aload_0
       272: aload_3
       273: ldc           #139                // String object_id
       275: invokeinterface #141,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       280: aload_3
       281: ldc           #144                // String scheme_name
       283: invokeinterface #94,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       288: aload         4
       290: invokevirtual #146                // Method setScheme:(ILjava/lang/String;Ljava/util/ArrayList;)V
       293: goto          80
       296: aload_3
       297: ifnull        336
       300: aload_3
       301: invokeinterface #150,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       306: goto          336
       309: astore        4
       311: aload_3
       312: ifnull        333
       315: aload_3
       316: invokeinterface #150,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       321: goto          333
       324: astore        5
       326: aload         4
       328: aload         5
       330: invokevirtual #155                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       333: aload         4
       335: athrow
       336: aload_2
       337: ifnull        373
       340: aload_2
       341: invokeinterface #159,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       346: goto          373
       349: astore_3
       350: aload_2
       351: ifnull        371
       354: aload_2
       355: invokeinterface #159,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       360: goto          371
       363: astore        4
       365: aload_3
       366: aload         4
       368: invokevirtual #155                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       371: aload_3
       372: athrow
       373: aload_1
       374: ifnull        408
       377: aload_1
       378: invokeinterface #160,  1          // InterfaceMethod java/sql/Connection.close:()V
       383: goto          408
       386: astore_2
       387: aload_1
       388: ifnull        406
       391: aload_1
       392: invokeinterface #160,  1          // InterfaceMethod java/sql/Connection.close:()V
       397: goto          406
       400: astore_3
       401: aload_2
       402: aload_3
       403: invokevirtual #155                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       406: aload_2
       407: athrow
       408: goto          421
       411: astore_1
       412: getstatic     #37                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       415: ldc           #163                // String Failed to load schemes data.
       417: aload_1
       418: invokevirtual #165                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       421: return
      Exception table:
         from    to  target type
            80   296   309   Class java/lang/Throwable
           315   321   324   Class java/lang/Throwable
            73   336   349   Class java/lang/Throwable
           354   360   363   Class java/lang/Throwable
            64   373   386   Class java/lang/Throwable
           391   397   400   Class java/lang/Throwable
            60   408   411   Class java/lang/Exception
      LineNumberTable:
        line 77: 0
        line 78: 6
        line 79: 33
        line 81: 60
        line 82: 64
        line 83: 73
        line 85: 80
        line 87: 89
        line 89: 98
        line 90: 113
        line 91: 123
        line 92: 126
        line 93: 139
        line 94: 148
        line 96: 159
        line 97: 170
        line 99: 173
        line 100: 183
        line 102: 215
        line 103: 221
        line 105: 231
        line 106: 243
        line 107: 257
        line 94: 265
        line 110: 271
        line 111: 293
        line 112: 296
        line 81: 309
        line 112: 336
        line 81: 349
        line 112: 373
        line 81: 386
        line 116: 408
        line 113: 411
        line 115: 412
        line 117: 421
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          183      82     9 skillId   I
          215      50    10 skillLevel   I
          243      22    11 skill   Lext/mods/gameserver/skills/L2Skill;
          151     120     8     i   I
           98     195     4 schemeList   Ljava/util/ArrayList;
          113     180     5 skills   [Ljava/lang/String;
          123     170     6 levelsString   Ljava/lang/String;
          126     167     7 levels   [Ljava/lang/String;
           80     256     3    rs   Ljava/sql/ResultSet;
           73     300     2    ps   Ljava/sql/PreparedStatement;
           64     344     1   con   Ljava/sql/Connection;
          412       9     1     e   Ljava/lang/Exception;
            0     422     0  this   Lext/mods/gameserver/data/manager/BufferManager;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           98     195     4 schemeList   Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;
      StackMapTable: number_of_entries = 25
        frame_type = 254 /* append */
          offset_delta = 80
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/data/manager/BufferManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/util/ArrayList, class "[Ljava/lang/String;", class java/lang/String, class "[Ljava/lang/String;" ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 10 /* same */
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 33
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/data/manager/BufferManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/BufferManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/BufferManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/BufferManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #169                // String list
         4: aload_0
         5: invokedynamic #171,  0            // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/manager/BufferManager;)Ljava/util/function/Consumer;
        10: invokevirtual #175                // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 122: 0
        line 154: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/manager/BufferManager;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void saveSchemes();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=11, args_size=1
         0: new           #179                // class java/lang/StringBuilder
         3: dup
         4: invokespecial #181                // Method java/lang/StringBuilder."<init>":()V
         7: astore_1
         8: new           #179                // class java/lang/StringBuilder
        11: dup
        12: invokespecial #181                // Method java/lang/StringBuilder."<init>":()V
        15: astore_2
        16: invokestatic  #63                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        19: astore_3
        20: aload_3
        21: ldc           #182                // String TRUNCATE buffer_schemes
        23: invokeinterface #71,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        28: astore        4
        30: aload         4
        32: invokeinterface #184,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        37: pop
        38: aload         4
        40: ifnull        82
        43: aload         4
        45: invokeinterface #159,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        50: goto          82
        53: astore        5
        55: aload         4
        57: ifnull        79
        60: aload         4
        62: invokeinterface #159,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        67: goto          79
        70: astore        6
        72: aload         5
        74: aload         6
        76: invokevirtual #155                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        79: aload         5
        81: athrow
        82: aload_3
        83: ldc           #187                // String INSERT INTO buffer_schemes (object_id, scheme_name, skills, levels) VALUES (?,?,?,?)
        85: invokeinterface #71,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        90: astore        4
        92: aload_0
        93: getfield      #10                 // Field _schemesTable:Ljava/util/Map;
        96: invokeinterface #189,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       101: invokeinterface #193,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       106: astore        5
       108: aload         5
       110: invokeinterface #199,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       115: ifeq          382
       118: aload         5
       120: invokeinterface #204,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       125: checkcast     #207                // class java/util/Map$Entry
       128: astore        6
       130: aload         6
       132: invokeinterface #209,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       137: checkcast     #44                 // class java/util/Map
       140: invokeinterface #189,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       145: invokeinterface #193,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       150: astore        7
       152: aload         7
       154: invokeinterface #199,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       159: ifeq          379
       162: aload         7
       164: invokeinterface #204,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       169: checkcast     #207                // class java/util/Map$Entry
       172: astore        8
       174: aload         8
       176: invokeinterface #209,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       181: checkcast     #89                 // class java/util/ArrayList
       184: invokevirtual #212                // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
       187: astore        9
       189: aload         9
       191: invokeinterface #199,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       196: ifeq          262
       199: aload         9
       201: invokeinterface #204,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       206: checkcast     #213                // class ext/mods/gameserver/skills/L2Skill
       209: astore        10
       211: aload_1
       212: iconst_2
       213: anewarray     #2                  // class java/lang/Object
       216: dup
       217: iconst_0
       218: aload         10
       220: invokevirtual #215                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       223: invokestatic  #49                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       226: aastore
       227: dup
       228: iconst_1
       229: ldc           #98                 // String ,
       231: aastore
       232: invokestatic  #218                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       235: aload_2
       236: iconst_2
       237: anewarray     #2                  // class java/lang/Object
       240: dup
       241: iconst_0
       242: aload         10
       244: invokevirtual #224                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       247: invokestatic  #49                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       250: aastore
       251: dup
       252: iconst_1
       253: ldc           #98                 // String ,
       255: aastore
       256: invokestatic  #218                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       259: goto          189
       262: aload_1
       263: invokevirtual #227                // Method java/lang/StringBuilder.length:()I
       266: ifle          279
       269: aload_1
       270: aload_1
       271: invokevirtual #227                // Method java/lang/StringBuilder.length:()I
       274: iconst_1
       275: isub
       276: invokevirtual #228                // Method java/lang/StringBuilder.setLength:(I)V
       279: aload_2
       280: invokevirtual #227                // Method java/lang/StringBuilder.length:()I
       283: ifle          296
       286: aload_2
       287: aload_2
       288: invokevirtual #227                // Method java/lang/StringBuilder.length:()I
       291: iconst_1
       292: isub
       293: invokevirtual #228                // Method java/lang/StringBuilder.setLength:(I)V
       296: aload         4
       298: iconst_1
       299: aload         6
       301: invokeinterface #232,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
       306: checkcast     #50                 // class java/lang/Integer
       309: invokevirtual #235                // Method java/lang/Integer.intValue:()I
       312: invokeinterface #238,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       317: aload         4
       319: iconst_2
       320: aload         8
       322: invokeinterface #232,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
       327: checkcast     #101                // class java/lang/String
       330: invokeinterface #242,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       335: aload         4
       337: iconst_3
       338: aload_1
       339: invokevirtual #246                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       342: invokeinterface #242,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       347: aload         4
       349: iconst_4
       350: aload_2
       351: invokevirtual #246                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       354: invokeinterface #242,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       359: aload         4
       361: invokeinterface #250,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       366: aload_1
       367: iconst_0
       368: invokevirtual #228                // Method java/lang/StringBuilder.setLength:(I)V
       371: aload_2
       372: iconst_0
       373: invokevirtual #228                // Method java/lang/StringBuilder.setLength:(I)V
       376: goto          152
       379: goto          108
       382: aload         4
       384: invokeinterface #253,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       389: pop
       390: aload         4
       392: ifnull        434
       395: aload         4
       397: invokeinterface #159,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       402: goto          434
       405: astore        5
       407: aload         4
       409: ifnull        431
       412: aload         4
       414: invokeinterface #159,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       419: goto          431
       422: astore        6
       424: aload         5
       426: aload         6
       428: invokevirtual #155                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       431: aload         5
       433: athrow
       434: aload_3
       435: ifnull        474
       438: aload_3
       439: invokeinterface #160,  1          // InterfaceMethod java/sql/Connection.close:()V
       444: goto          474
       447: astore        4
       449: aload_3
       450: ifnull        471
       453: aload_3
       454: invokeinterface #160,  1          // InterfaceMethod java/sql/Connection.close:()V
       459: goto          471
       462: astore        5
       464: aload         4
       466: aload         5
       468: invokevirtual #155                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       471: aload         4
       473: athrow
       474: goto          488
       477: astore_3
       478: getstatic     #37                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       481: ldc_w         #257                // String Failed to save schemes data.
       484: aload_3
       485: invokevirtual #165                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       488: return
      Exception table:
         from    to  target type
            30    38    53   Class java/lang/Throwable
            60    67    70   Class java/lang/Throwable
            92   390   405   Class java/lang/Throwable
           412   419   422   Class java/lang/Throwable
            20   434   447   Class java/lang/Throwable
           453   459   462   Class java/lang/Throwable
            16   474   477   Class java/lang/Exception
      LineNumberTable:
        line 158: 0
        line 159: 8
        line 161: 16
        line 163: 20
        line 165: 30
        line 166: 38
        line 163: 53
        line 168: 82
        line 170: 92
        line 172: 130
        line 174: 174
        line 176: 211
        line 177: 235
        line 178: 259
        line 180: 262
        line 181: 269
        line 183: 279
        line 184: 286
        line 186: 296
        line 187: 317
        line 188: 335
        line 189: 347
        line 190: 359
        line 192: 366
        line 193: 371
        line 194: 376
        line 195: 379
        line 196: 382
        line 197: 390
        line 168: 405
        line 198: 434
        line 161: 447
        line 202: 474
        line 199: 477
        line 201: 478
        line 203: 488
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      52     4    ps   Ljava/sql/PreparedStatement;
          211      48    10 skill   Lext/mods/gameserver/skills/L2Skill;
          174     202     8 scheme   Ljava/util/Map$Entry;
          130     249     6 player   Ljava/util/Map$Entry;
           92     342     4    ps   Ljava/sql/PreparedStatement;
           20     454     3   con   Ljava/sql/Connection;
          478      10     3     e   Ljava/lang/Exception;
            0     489     0  this   Lext/mods/gameserver/data/manager/BufferManager;
            8     481     1    sb   Ljava/lang/StringBuilder;
           16     473     2   sb2   Ljava/lang/StringBuilder;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          174     202     8 scheme   Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
          130     249     6 player   Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;>;
      StackMapTable: number_of_entries = 22
        frame_type = 255 /* full_frame */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/data/manager/BufferManager, class java/lang/StringBuilder, class java/lang/StringBuilder, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/BufferManager, class java/lang/StringBuilder, class java/lang/StringBuilder, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ class java/sql/PreparedStatement, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 43
          locals = [ class java/util/Map$Entry, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ class java/util/Map$Entry, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 72
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 248 /* chop */
          offset_delta = 82
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/BufferManager, class java/lang/StringBuilder, class java/lang/StringBuilder, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/BufferManager, class java/lang/StringBuilder, class java/lang/StringBuilder, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void setScheme(int, java.lang.String, java.util.ArrayList<ext.mods.gameserver.skills.L2Skill>);
    descriptor: (ILjava/lang/String;Ljava/util/ArrayList;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: aload_0
         1: getfield      #10                 // Field _schemesTable:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #49                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokedynamic #259,  0            // InvokeDynamic #1:apply:()Ljava/util/function/Function;
        13: invokeinterface #263,  3          // InterfaceMethod java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
        18: checkcast     #44                 // class java/util/Map
        21: astore        4
        23: aload         4
        25: invokeinterface #43,  1           // InterfaceMethod java/util/Map.size:()I
        30: getstatic     #267                // Field ext/mods/Config.BUFFER_MAX_SCHEMES:I
        33: if_icmplt     37
        36: return
        37: aload         4
        39: aload_2
        40: aload_3
        41: invokeinterface #273,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        46: pop
        47: return
      LineNumberTable:
        line 213: 0
        line 214: 23
        line 215: 36
        line 217: 37
        line 218: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/data/manager/BufferManager;
            0      48     1 playerId   I
            0      48     2 schemeName   Ljava/lang/String;
            0      48     3  list   Ljava/util/ArrayList;
           23      25     4 schemes   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      48     3  list   Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;
           23      25     4 schemes   Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class java/util/Map ]
    Signature: #492                         // (ILjava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;)V

  public java.util.Map<java.lang.String, java.util.ArrayList<ext.mods.gameserver.skills.L2Skill>> getPlayerSchemes(int);
    descriptor: (I)Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _schemesTable:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #49                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #277,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #44                 // class java/util/Map
        16: areturn
      LineNumberTable:
        line 226: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/manager/BufferManager;
            0      17     1 playerId   I
    Signature: #495                         // (I)Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;

  public java.util.List<ext.mods.gameserver.skills.L2Skill> getScheme(int, java.lang.String);
    descriptor: (ILjava/lang/String;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=3
         0: invokestatic  #281                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: iload_1
         4: invokevirtual #286                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
         7: astore_3
         8: aload_0
         9: getfield      #10                 // Field _schemesTable:Ljava/util/Map;
        12: iload_1
        13: invokestatic  #49                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: invokeinterface #277,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        21: checkcast     #44                 // class java/util/Map
        24: astore        4
        26: aload         4
        28: ifnonnull     35
        31: invokestatic  #290                // Method java/util/Collections.emptyList:()Ljava/util/List;
        34: areturn
        35: aload         4
        37: aload_2
        38: invokeinterface #277,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        43: checkcast     #89                 // class java/util/ArrayList
        46: astore        5
        48: aload         5
        50: ifnonnull     57
        53: invokestatic  #290                // Method java/util/Collections.emptyList:()Ljava/util/List;
        56: areturn
        57: aload_3
        58: invokevirtual #296                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
        61: ifne          129
        64: aload         5
        66: invokevirtual #301                // Method java/util/ArrayList.size:()I
        69: istore        6
        71: iconst_0
        72: istore        7
        74: iload         7
        76: iload         6
        78: if_icmpge     129
        81: getstatic     #302                // Field ext/mods/Config.PREMIUM_BUFFS_CATEGORY:Ljava/util/List;
        84: aload_0
        85: aload         5
        87: iload         7
        89: invokevirtual #306                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
        92: checkcast     #213                // class ext/mods/gameserver/skills/L2Skill
        95: invokevirtual #309                // Method getAvailableBuff:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
        98: invokevirtual #313                // Method ext/mods/gameserver/model/records/BuffSkill.type:()Ljava/lang/String;
       101: invokeinterface #318,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       106: ifeq          123
       109: aload         5
       111: iload         7
       113: invokevirtual #323                // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
       116: pop
       117: iinc          7, -1
       120: iinc          6, -1
       123: iinc          7, 1
       126: goto          74
       129: aload         5
       131: areturn
      LineNumberTable:
        line 236: 0
        line 237: 8
        line 238: 26
        line 239: 31
        line 241: 35
        line 242: 48
        line 243: 53
        line 245: 57
        line 247: 64
        line 248: 71
        line 250: 81
        line 252: 109
        line 253: 117
        line 254: 120
        line 248: 123
        line 259: 129
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           74      55     7     i   I
           71      58     6     j   I
            0     132     0  this   Lext/mods/gameserver/data/manager/BufferManager;
            0     132     1 playerId   I
            0     132     2 schemeName   Ljava/lang/String;
            8     124     3 player   Lext/mods/gameserver/model/actor/Player;
           26     106     4 schemes   Ljava/util/Map;
           48      84     5 scheme   Ljava/util/ArrayList;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           26     106     4 schemes   Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;>;
           48      84     5 scheme   Ljava/util/ArrayList<Lext/mods/gameserver/skills/L2Skill;>;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/util/Map ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/util/ArrayList ]
        frame_type = 253 /* append */
          offset_delta = 16
          locals = [ int, int ]
        frame_type = 48 /* same */
        frame_type = 249 /* chop */
          offset_delta = 5
    Signature: #498                         // (ILjava/lang/String;)Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public void applySchemeEffects(ext.mods.gameserver.model.actor.Npc, ext.mods.gameserver.model.actor.Creature, int, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILjava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=9, args_size=5
         0: aload_0
         1: iload_3
         2: aload         4
         4: invokevirtual #326                // Method getScheme:(ILjava/lang/String;)Ljava/util/List;
         7: invokeinterface #330,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        12: astore        5
        14: aload         5
        16: invokeinterface #199,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          84
        24: aload         5
        26: invokeinterface #204,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        31: checkcast     #213                // class ext/mods/gameserver/skills/L2Skill
        34: astore        6
        36: aload_0
        37: aload         6
        39: invokevirtual #309                // Method getAvailableBuff:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
        42: astore        7
        44: aload         7
        46: ifnull        81
        49: aload         7
        51: invokevirtual #331                // Method ext/mods/gameserver/model/records/BuffSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        54: astore        8
        56: aload         8
        58: ifnull        81
        61: aload         8
        63: invokevirtual #335                // Method ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
        66: ifeq          73
        69: aload_2
        70: invokevirtual #338                // Method ext/mods/gameserver/model/actor/Creature.stopAllEffectsDebuff:()V
        73: aload         8
        75: aload_1
        76: aload_2
        77: invokevirtual #343                // Method ext/mods/gameserver/skills/L2Skill.getEffectsNpc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
        80: pop
        81: goto          14
        84: return
      LineNumberTable:
        line 271: 0
        line 273: 36
        line 274: 44
        line 276: 49
        line 277: 56
        line 279: 61
        line 280: 69
        line 282: 73
        line 285: 81
        line 286: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           56      25     8     s   Lext/mods/gameserver/skills/L2Skill;
           44      37     7 holder   Lext/mods/gameserver/model/records/BuffSkill;
           36      45     6 skill   Lext/mods/gameserver/skills/L2Skill;
            0      85     0  this   Lext/mods/gameserver/data/manager/BufferManager;
            0      85     1   npc   Lext/mods/gameserver/model/actor/Npc;
            0      85     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      85     3 playerId   I
            0      85     4 schemeName   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 58
          locals = [ class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/records/BuffSkill, class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 248 /* chop */
          offset_delta = 7
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean getSchemeContainsSkill(int, java.lang.String, ext.mods.gameserver.skills.L2Skill);
    descriptor: (ILjava/lang/String;Lext/mods/gameserver/skills/L2Skill;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokevirtual #326                // Method getScheme:(ILjava/lang/String;)Ljava/util/List;
         6: aload_3
         7: invokeinterface #318,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        12: ireturn
      LineNumberTable:
        line 296: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/data/manager/BufferManager;
            0      13     1 playerId   I
            0      13     2 schemeName   Ljava/lang/String;
            0      13     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public java.util.List<ext.mods.gameserver.skills.L2Skill> getSkillsIdsByType(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: new           #89                 // class java/util/ArrayList
         3: dup
         4: invokespecial #91                 // Method java/util/ArrayList."<init>":()V
         7: astore_2
         8: aload_0
         9: getfield      #19                 // Field _availableBuffs:Ljava/util/Map;
        12: invokeinterface #347,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        17: invokeinterface #351,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        22: astore_3
        23: aload_3
        24: invokeinterface #199,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        29: ifeq          70
        32: aload_3
        33: invokeinterface #204,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        38: checkcast     #314                // class ext/mods/gameserver/model/records/BuffSkill
        41: astore        4
        43: aload         4
        45: invokevirtual #313                // Method ext/mods/gameserver/model/records/BuffSkill.type:()Ljava/lang/String;
        48: aload_1
        49: invokevirtual #354                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        52: ifeq          67
        55: aload_2
        56: aload         4
        58: invokevirtual #331                // Method ext/mods/gameserver/model/records/BuffSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        61: invokeinterface #358,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        66: pop
        67: goto          23
        70: aload_2
        71: areturn
      LineNumberTable:
        line 305: 0
        line 306: 8
        line 308: 43
        line 309: 55
        line 310: 67
        line 311: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      24     4 holder   Lext/mods/gameserver/model/records/BuffSkill;
            0      72     0  this   Lext/mods/gameserver/data/manager/BufferManager;
            0      72     1 groupType   Ljava/lang/String;
            8      64     2 skills   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      64     2 skills   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 43 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #514                         // (Ljava/lang/String;)Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public java.util.List<ext.mods.gameserver.skills.L2Skill> getSchemeSkills(ext.mods.gameserver.data.manager.BufferManager$BufferSchemeType);
    descriptor: (Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: new           #89                 // class java/util/ArrayList
         3: dup
         4: invokespecial #91                 // Method java/util/ArrayList."<init>":()V
         7: astore_2
         8: aload_0
         9: getfield      #25                 // Field _availableSchemes:Ljava/util/Map;
        12: aload_1
        13: invokeinterface #277,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        18: checkcast     #319                // class java/util/List
        21: aload_2
        22: invokedynamic #359,  0            // InvokeDynamic #2:accept:(Ljava/util/List;)Ljava/util/function/Consumer;
        27: invokeinterface #362,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        32: aload_2
        33: areturn
      LineNumberTable:
        line 316: 0
        line 317: 8
        line 318: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/manager/BufferManager;
            0      34     1 schemeType   Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;
            8      26     2 skills   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      26     2 skills   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
    Signature: #519                         // (Lext/mods/gameserver/data/manager/BufferManager$BufferSchemeType;)Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public java.util.List<java.lang.String> getSkillTypes();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: new           #89                 // class java/util/ArrayList
         3: dup
         4: invokespecial #91                 // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: aload_0
         9: getfield      #19                 // Field _availableBuffs:Ljava/util/Map;
        12: invokeinterface #347,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        17: invokeinterface #351,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        22: astore_2
        23: aload_2
        24: invokeinterface #199,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        29: ifeq          69
        32: aload_2
        33: invokeinterface #204,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        38: checkcast     #314                // class ext/mods/gameserver/model/records/BuffSkill
        41: astore_3
        42: aload_1
        43: aload_3
        44: invokevirtual #313                // Method ext/mods/gameserver/model/records/BuffSkill.type:()Ljava/lang/String;
        47: invokeinterface #318,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        52: ifne          66
        55: aload_1
        56: aload_3
        57: invokevirtual #313                // Method ext/mods/gameserver/model/records/BuffSkill.type:()Ljava/lang/String;
        60: invokeinterface #358,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        65: pop
        66: goto          23
        69: aload_1
        70: areturn
      LineNumberTable:
        line 326: 0
        line 327: 8
        line 329: 42
        line 330: 55
        line 331: 66
        line 332: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42      24     3 holder   Lext/mods/gameserver/model/records/BuffSkill;
            0      71     0  this   Lext/mods/gameserver/data/manager/BufferManager;
            8      63     1 skillTypes   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      63     1 skillTypes   Ljava/util/List<Ljava/lang/String;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 42 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #523                         // ()Ljava/util/List<Ljava/lang/String;>;

  public ext.mods.gameserver.model.records.BuffSkill getAvailableBuff(ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/BuffSkill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _availableBuffs:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #277,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #314                // class ext/mods/gameserver/model/records/BuffSkill
        13: areturn
      LineNumberTable:
        line 337: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/manager/BufferManager;
            0      14     1 skill   Lext/mods/gameserver/skills/L2Skill;

  public java.util.Map<ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.records.BuffSkill> getAvailableBuffs();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _availableBuffs:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 342: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/BufferManager;
    Signature: #526                         // ()Ljava/util/Map<Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/BuffSkill;>;

  public static ext.mods.gameserver.data.manager.BufferManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/BufferManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #365                // Field ext/mods/gameserver/data/manager/BufferManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/BufferManager;
         3: areturn
      LineNumberTable:
        line 347: 0
}
SourceFile: "BufferManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/BufferManager$SingletonHolder
  ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType
BootstrapMethods:
  0: #583 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #555 (Ljava/lang/Object;)V
      #557 REF_invokeVirtual ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #560 (Lorg/w3c/dom/Node;)V
  1: #583 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #561 (Ljava/lang/Object;)Ljava/lang/Object;
      #562 REF_invokeStatic ext/mods/gameserver/data/manager/BufferManager.lambda$setScheme$0:(Ljava/lang/Integer;)Ljava/util/Map;
      #565 (Ljava/lang/Integer;)Ljava/util/Map;
  2: #583 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #555 (Ljava/lang/Object;)V
      #566 REF_invokeStatic ext/mods/gameserver/data/manager/BufferManager.lambda$getSchemeSkills$0:(Ljava/util/List;Lext/mods/gameserver/model/records/BuffSkill;)V
      #569 (Lext/mods/gameserver/model/records/BuffSkill;)V
  3: #583 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #555 (Ljava/lang/Object;)V
      #571 REF_invokeVirtual ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #560 (Lorg/w3c/dom/Node;)V
  4: #583 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #555 (Ljava/lang/Object;)V
      #574 REF_invokeVirtual ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
      #560 (Lorg/w3c/dom/Node;)V
  5: #583 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #555 (Ljava/lang/Object;)V
      #577 REF_invokeVirtual ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$4:(Ljava/util/List;Ljava/lang/String;Lorg/w3c/dom/Node;)V
      #560 (Lorg/w3c/dom/Node;)V
  6: #583 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #555 (Ljava/lang/Object;)V
      #580 REF_invokeVirtual ext/mods/gameserver/data/manager/BufferManager.lambda$parseDocument$2:(Ljava/lang/String;Lorg/w3c/dom/Node;)V
      #560 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static #591= #207 of #44;        // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #593= #406 of #11;  // BufferSchemeType=class ext/mods/gameserver/data/manager/BufferManager$BufferSchemeType of class ext/mods/gameserver/data/manager/BufferManager
  public static final #598= #594 of #596; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
