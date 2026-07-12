// Bytecode for: ext.mods.gameserver.model.actor.container.player.HennaList
// File: ext\mods\gameserver\model\actor\container\player\HennaList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/HennaList.class
  Last modified 9 de jul de 2026; size 8853 bytes
  MD5 checksum 4a2833aa1c3651dc47aec37e54f0667e
  Compiled from "HennaList.java"
public class ext.mods.gameserver.model.actor.container.player.HennaList
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // ext/mods/gameserver/model/actor/container/player/HennaList
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 18, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/container/player/HennaList
    #8 = Utf8               ext/mods/gameserver/model/actor/container/player/HennaList
    #9 = Class              #10           // ext/mods/gameserver/model/records/Henna
   #10 = Utf8               ext/mods/gameserver/model/records/Henna
   #11 = Fieldref           #7.#12        // ext/mods/gameserver/model/actor/container/player/HennaList._hennas:[Lext/mods/gameserver/model/records/Henna;
   #12 = NameAndType        #13:#14       // _hennas:[Lext/mods/gameserver/model/records/Henna;
   #13 = Utf8               _hennas
   #14 = Utf8               [Lext/mods/gameserver/model/records/Henna;
   #15 = Methodref          #16.#17       // ext/mods/gameserver/enums/actors/HennaType.values:()[Lext/mods/gameserver/enums/actors/HennaType;
   #16 = Class              #18           // ext/mods/gameserver/enums/actors/HennaType
   #17 = NameAndType        #19:#20       // values:()[Lext/mods/gameserver/enums/actors/HennaType;
   #18 = Utf8               ext/mods/gameserver/enums/actors/HennaType
   #19 = Utf8               values
   #20 = Utf8               ()[Lext/mods/gameserver/enums/actors/HennaType;
   #21 = Fieldref           #7.#22        // ext/mods/gameserver/model/actor/container/player/HennaList._stats:[I
   #22 = NameAndType        #23:#24       // _stats:[I
   #23 = Utf8               _stats
   #24 = Utf8               [I
   #25 = Fieldref           #7.#26        // ext/mods/gameserver/model/actor/container/player/HennaList._owner:Lext/mods/gameserver/model/actor/Player;
   #26 = NameAndType        #27:#28       // _owner:Lext/mods/gameserver/model/actor/Player;
   #27 = Utf8               _owner
   #28 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #29 = Methodref          #9.#30        // ext/mods/gameserver/model/records/Henna.canBeUsedBy:(Lext/mods/gameserver/model/actor/Player;)Z
   #30 = NameAndType        #31:#32       // canBeUsedBy:(Lext/mods/gameserver/model/actor/Player;)Z
   #31 = Utf8               canBeUsedBy
   #32 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #33 = Methodref          #9.#34        // ext/mods/gameserver/model/records/Henna.INT:()I
   #34 = NameAndType        #35:#36       // INT:()I
   #35 = Utf8               INT
   #36 = Utf8               ()I
   #37 = Methodref          #9.#38        // ext/mods/gameserver/model/records/Henna.STR:()I
   #38 = NameAndType        #39:#36       // STR:()I
   #39 = Utf8               STR
   #40 = Methodref          #9.#41        // ext/mods/gameserver/model/records/Henna.CON:()I
   #41 = NameAndType        #42:#36       // CON:()I
   #42 = Utf8               CON
   #43 = Methodref          #9.#44        // ext/mods/gameserver/model/records/Henna.MEN:()I
   #44 = NameAndType        #45:#36       // MEN:()I
   #45 = Utf8               MEN
   #46 = Methodref          #9.#47        // ext/mods/gameserver/model/records/Henna.DEX:()I
   #47 = NameAndType        #48:#36       // DEX:()I
   #48 = Utf8               DEX
   #49 = Methodref          #9.#50        // ext/mods/gameserver/model/records/Henna.WIT:()I
   #50 = NameAndType        #51:#36       // WIT:()I
   #51 = Utf8               WIT
   #52 = Methodref          #53.#54       // java/lang/Math.min:(II)I
   #53 = Class              #55           // java/lang/Math
   #54 = NameAndType        #56:#57       // min:(II)I
   #55 = Utf8               java/lang/Math
   #56 = Utf8               min
   #57 = Utf8               (II)I
   #58 = Methodref          #9.#59        // ext/mods/gameserver/model/records/Henna.symbolId:()I
   #59 = NameAndType        #60:#36       // symbolId:()I
   #60 = Utf8               symbolId
   #61 = Methodref          #7.#62        // ext/mods/gameserver/model/actor/container/player/HennaList.getMaxSize:()I
   #62 = NameAndType        #63:#36       // getMaxSize:()I
   #63 = Utf8               getMaxSize
   #64 = Methodref          #65.#66       // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #65 = Class              #67           // java/util/Arrays
   #66 = NameAndType        #68:#69       // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #67 = Utf8               java/util/Arrays
   #68 = Utf8               stream
   #69 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #70 = InvokeDynamic      #0:#71        // #0:test:()Ljava/util/function/Predicate;
   #71 = NameAndType        #72:#73       // test:()Ljava/util/function/Predicate;
   #72 = Utf8               test
   #73 = Utf8               ()Ljava/util/function/Predicate;
   #74 = InterfaceMethodref #75.#76       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #75 = Class              #77           // java/util/stream/Stream
   #76 = NameAndType        #78:#79       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #77 = Utf8               java/util/stream/Stream
   #78 = Utf8               filter
   #79 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #80 = InterfaceMethodref #75.#81       // java/util/stream/Stream.toList:()Ljava/util/List;
   #81 = NameAndType        #82:#83       // toList:()Ljava/util/List;
   #82 = Utf8               toList
   #83 = Utf8               ()Ljava/util/List;
   #84 = Methodref          #16.#85       // ext/mods/gameserver/enums/actors/HennaType.ordinal:()I
   #85 = NameAndType        #86:#36       // ordinal:()I
   #86 = Utf8               ordinal
   #87 = Methodref          #88.#89       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #88 = Class              #90           // ext/mods/commons/pool/ConnectionPool
   #89 = NameAndType        #91:#92       // getConnection:()Ljava/sql/Connection;
   #90 = Utf8               ext/mods/commons/pool/ConnectionPool
   #91 = Utf8               getConnection
   #92 = Utf8               ()Ljava/sql/Connection;
   #93 = String             #94           // SELECT slot, symbol_id FROM character_hennas WHERE char_obj_id = ? AND class_index = ?
   #94 = Utf8               SELECT slot, symbol_id FROM character_hennas WHERE char_obj_id = ? AND class_index = ?
   #95 = InterfaceMethodref #96.#97       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #96 = Class              #98           // java/sql/Connection
   #97 = NameAndType        #99:#100      // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #98 = Utf8               java/sql/Connection
   #99 = Utf8               prepareStatement
  #100 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #101 = Methodref          #102.#103     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #102 = Class              #104          // ext/mods/gameserver/model/actor/Player
  #103 = NameAndType        #105:#36      // getObjectId:()I
  #104 = Utf8               ext/mods/gameserver/model/actor/Player
  #105 = Utf8               getObjectId
  #106 = InterfaceMethodref #107.#108     // java/sql/PreparedStatement.setInt:(II)V
  #107 = Class              #109          // java/sql/PreparedStatement
  #108 = NameAndType        #110:#111     // setInt:(II)V
  #109 = Utf8               java/sql/PreparedStatement
  #110 = Utf8               setInt
  #111 = Utf8               (II)V
  #112 = Methodref          #102.#113     // ext/mods/gameserver/model/actor/Player.getClassIndex:()I
  #113 = NameAndType        #114:#36      // getClassIndex:()I
  #114 = Utf8               getClassIndex
  #115 = InterfaceMethodref #107.#116     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #116 = NameAndType        #117:#118     // executeQuery:()Ljava/sql/ResultSet;
  #117 = Utf8               executeQuery
  #118 = Utf8               ()Ljava/sql/ResultSet;
  #119 = InterfaceMethodref #120.#121     // java/sql/ResultSet.next:()Z
  #120 = Class              #122          // java/sql/ResultSet
  #121 = NameAndType        #123:#124     // next:()Z
  #122 = Utf8               java/sql/ResultSet
  #123 = Utf8               next
  #124 = Utf8               ()Z
  #125 = String             #126          // slot
  #126 = Utf8               slot
  #127 = InterfaceMethodref #120.#128     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #128 = NameAndType        #129:#130     // getInt:(Ljava/lang/String;)I
  #129 = Utf8               getInt
  #130 = Utf8               (Ljava/lang/String;)I
  #131 = String             #132          // symbol_id
  #132 = Utf8               symbol_id
  #133 = Fieldref           #7.#134       // ext/mods/gameserver/model/actor/container/player/HennaList.LOGGER:Lext/mods/commons/logging/CLogger;
  #134 = NameAndType        #135:#136     // LOGGER:Lext/mods/commons/logging/CLogger;
  #135 = Utf8               LOGGER
  #136 = Utf8               Lext/mods/commons/logging/CLogger;
  #137 = String             #138          // {} has Henna on invalid slot {}.
  #138 = Utf8               {} has Henna on invalid slot {}.
  #139 = Methodref          #102.#140     // ext/mods/gameserver/model/actor/Player.toString:()Ljava/lang/String;
  #140 = NameAndType        #141:#142     // toString:()Ljava/lang/String;
  #141 = Utf8               toString
  #142 = Utf8               ()Ljava/lang/String;
  #143 = Methodref          #144.#145     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #144 = Class              #146          // java/lang/Integer
  #145 = NameAndType        #147:#148     // valueOf:(I)Ljava/lang/Integer;
  #146 = Utf8               java/lang/Integer
  #147 = Utf8               valueOf
  #148 = Utf8               (I)Ljava/lang/Integer;
  #149 = Methodref          #150.#151     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #150 = Class              #152          // ext/mods/commons/logging/CLogger
  #151 = NameAndType        #153:#154     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #152 = Utf8               ext/mods/commons/logging/CLogger
  #153 = Utf8               warn
  #154 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #155 = Methodref          #156.#157     // ext/mods/gameserver/data/xml/HennaData.getInstance:()Lext/mods/gameserver/data/xml/HennaData;
  #156 = Class              #158          // ext/mods/gameserver/data/xml/HennaData
  #157 = NameAndType        #159:#160     // getInstance:()Lext/mods/gameserver/data/xml/HennaData;
  #158 = Utf8               ext/mods/gameserver/data/xml/HennaData
  #159 = Utf8               getInstance
  #160 = Utf8               ()Lext/mods/gameserver/data/xml/HennaData;
  #161 = Methodref          #156.#162     // ext/mods/gameserver/data/xml/HennaData.getHenna:(I)Lext/mods/gameserver/model/records/Henna;
  #162 = NameAndType        #163:#164     // getHenna:(I)Lext/mods/gameserver/model/records/Henna;
  #163 = Utf8               getHenna
  #164 = Utf8               (I)Lext/mods/gameserver/model/records/Henna;
  #165 = String             #166          // {} has unknown Henna Symbol Id: {} in slot {}.
  #166 = Utf8               {} has unknown Henna Symbol Id: {} in slot {}.
  #167 = InterfaceMethodref #120.#168     // java/sql/ResultSet.close:()V
  #168 = NameAndType        #169:#6       // close:()V
  #169 = Utf8               close
  #170 = Class              #171          // java/lang/Throwable
  #171 = Utf8               java/lang/Throwable
  #172 = Methodref          #170.#173     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #173 = NameAndType        #174:#175     // addSuppressed:(Ljava/lang/Throwable;)V
  #174 = Utf8               addSuppressed
  #175 = Utf8               (Ljava/lang/Throwable;)V
  #176 = InterfaceMethodref #107.#168     // java/sql/PreparedStatement.close:()V
  #177 = InterfaceMethodref #96.#168      // java/sql/Connection.close:()V
  #178 = Class              #179          // java/lang/Exception
  #179 = Utf8               java/lang/Exception
  #180 = String             #181          // Couldn\'t restore hennas.
  #181 = Utf8               Couldn\'t restore hennas.
  #182 = Methodref          #150.#183     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #183 = NameAndType        #184:#185     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #184 = Utf8               error
  #185 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #186 = Methodref          #187.#188     // java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
  #187 = Class              #189          // java/lang/System
  #188 = NameAndType        #190:#191     // arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
  #189 = Utf8               java/lang/System
  #190 = Utf8               arraycopy
  #191 = Utf8               (Ljava/lang/Object;ILjava/lang/Object;II)V
  #192 = Methodref          #7.#193       // ext/mods/gameserver/model/actor/container/player/HennaList.getEmptySlotsAmount:()I
  #193 = NameAndType        #194:#36      // getEmptySlotsAmount:()I
  #194 = Utf8               getEmptySlotsAmount
  #195 = Methodref          #7.#196       // ext/mods/gameserver/model/actor/container/player/HennaList.size:()I
  #196 = NameAndType        #197:#36      // size:()I
  #197 = Utf8               size
  #198 = Methodref          #53.#199      // java/lang/Math.max:(II)I
  #199 = NameAndType        #200:#57      // max:(II)I
  #200 = Utf8               max
  #201 = Methodref          #102.#202     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #202 = NameAndType        #203:#204     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #203 = Utf8               getClassId
  #204 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #205 = Methodref          #206.#207     // ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
  #206 = Class              #208          // ext/mods/gameserver/enums/actors/ClassId
  #207 = NameAndType        #209:#36      // getLevel:()I
  #208 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #209 = Utf8               getLevel
  #210 = Methodref          #7.#211       // ext/mods/gameserver/model/actor/container/player/HennaList.getEmptySlotIndex:()I
  #211 = NameAndType        #212:#36      // getEmptySlotIndex:()I
  #212 = Utf8               getEmptySlotIndex
  #213 = String             #214          // INSERT INTO character_hennas (char_obj_id,symbol_id,slot,class_index) VALUES (?,?,?,?)
  #214 = Utf8               INSERT INTO character_hennas (char_obj_id,symbol_id,slot,class_index) VALUES (?,?,?,?)
  #215 = InterfaceMethodref #107.#216     // java/sql/PreparedStatement.execute:()Z
  #216 = NameAndType        #217:#124     // execute:()Z
  #217 = Utf8               execute
  #218 = String             #219          // Couldn\'t add Henna.
  #219 = Utf8               Couldn\'t add Henna.
  #220 = Methodref          #7.#221       // ext/mods/gameserver/model/actor/container/player/HennaList.recalculateStats:()V
  #221 = NameAndType        #222:#6       // recalculateStats:()V
  #222 = Utf8               recalculateStats
  #223 = Methodref          #7.#224       // ext/mods/gameserver/model/actor/container/player/HennaList.indexOf:(Lext/mods/gameserver/model/records/Henna;)I
  #224 = NameAndType        #225:#226     // indexOf:(Lext/mods/gameserver/model/records/Henna;)I
  #225 = Utf8               indexOf
  #226 = Utf8               (Lext/mods/gameserver/model/records/Henna;)I
  #227 = String             #228          // DELETE FROM character_hennas WHERE char_obj_id=? AND slot=? AND class_index=?
  #228 = Utf8               DELETE FROM character_hennas WHERE char_obj_id=? AND slot=? AND class_index=?
  #229 = String             #230          // Couldn\'t remove Henna.
  #230 = Utf8               Couldn\'t remove Henna.
  #231 = Methodref          #65.#232      // java/util/Arrays.toString:([Ljava/lang/Object;)Ljava/lang/String;
  #232 = NameAndType        #141:#233     // toString:([Ljava/lang/Object;)Ljava/lang/String;
  #233 = Utf8               ([Ljava/lang/Object;)Ljava/lang/String;
  #234 = Methodref          #65.#235      // java/util/Arrays.toString:([I)Ljava/lang/String;
  #235 = NameAndType        #141:#236     // toString:([I)Ljava/lang/String;
  #236 = Utf8               ([I)Ljava/lang/String;
  #237 = InvokeDynamic      #1:#238       // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #238 = NameAndType        #239:#240     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #239 = Utf8               makeConcatWithConstants
  #240 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #241 = Methodref          #242.#243     // java/lang/Class.getName:()Ljava/lang/String;
  #242 = Class              #244          // java/lang/Class
  #243 = NameAndType        #245:#142     // getName:()Ljava/lang/String;
  #244 = Utf8               java/lang/Class
  #245 = Utf8               getName
  #246 = Methodref          #150.#247     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #247 = NameAndType        #5:#248       // "<init>":(Ljava/lang/String;)V
  #248 = Utf8               (Ljava/lang/String;)V
  #249 = Utf8               MAX_HENNA_STAT_VALUE
  #250 = Utf8               I
  #251 = Utf8               ConstantValue
  #252 = Integer            5
  #253 = Utf8               HENNA_FIRST_SLOT_ID
  #254 = Integer            1
  #255 = Utf8               MAX_HENNAS_AMOUNT
  #256 = Integer            3
  #257 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #258 = Utf8               Code
  #259 = Utf8               LineNumberTable
  #260 = Utf8               LocalVariableTable
  #261 = Utf8               this
  #262 = Utf8               Lext/mods/gameserver/model/actor/container/player/HennaList;
  #263 = Utf8               owner
  #264 = Utf8               i
  #265 = Utf8               henna
  #266 = Utf8               Lext/mods/gameserver/model/records/Henna;
  #267 = Utf8               StackMapTable
  #268 = Class              #14           // "[Lext/mods/gameserver/model/records/Henna;"
  #269 = Utf8               h
  #270 = Utf8               getHennas
  #271 = Utf8               Signature
  #272 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/records/Henna;>;
  #273 = Utf8               getStat
  #274 = Utf8               (Lext/mods/gameserver/enums/actors/HennaType;)I
  #275 = Utf8               type
  #276 = Utf8               Lext/mods/gameserver/enums/actors/HennaType;
  #277 = Utf8               restore
  #278 = Utf8               rs
  #279 = Utf8               Ljava/sql/ResultSet;
  #280 = Utf8               ps
  #281 = Utf8               Ljava/sql/PreparedStatement;
  #282 = Utf8               con
  #283 = Utf8               Ljava/sql/Connection;
  #284 = Utf8               e
  #285 = Utf8               Ljava/lang/Exception;
  #286 = Utf8               hennas
  #287 = Utf8               isEmpty
  #288 = Utf8               result
  #289 = Utf8               getBySymbolId
  #290 = Utf8               isFull
  #291 = Utf8               usedSlots
  #292 = Utf8               maxSlots
  #293 = Utf8               classId
  #294 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #295 = Utf8               add
  #296 = Utf8               (Lext/mods/gameserver/model/records/Henna;)Z
  #297 = Utf8               remove
  #298 = Utf8               <clinit>
  #299 = Utf8               SourceFile
  #300 = Utf8               HennaList.java
  #301 = Utf8               BootstrapMethods
  #302 = MethodType         #303          //  (Ljava/lang/Object;)Z
  #303 = Utf8               (Ljava/lang/Object;)Z
  #304 = MethodHandle       6:#305        // REF_invokeStatic java/util/Objects.nonNull:(Ljava/lang/Object;)Z
  #305 = Methodref          #306.#307     // java/util/Objects.nonNull:(Ljava/lang/Object;)Z
  #306 = Class              #308          // java/util/Objects
  #307 = NameAndType        #309:#303     // nonNull:(Ljava/lang/Object;)Z
  #308 = Utf8               java/util/Objects
  #309 = Utf8               nonNull
  #310 = MethodType         #296          //  (Lext/mods/gameserver/model/records/Henna;)Z
  #311 = String             #312          // HennaList{_owner=\u0001, _hennas=\u0001, _stats=\u0001}
  #312 = Utf8               HennaList{_owner=\u0001, _hennas=\u0001, _stats=\u0001}
  #313 = MethodHandle       6:#314        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #314 = Methodref          #315.#316     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #315 = Class              #317          // java/lang/invoke/LambdaMetafactory
  #316 = NameAndType        #318:#319     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #317 = Utf8               java/lang/invoke/LambdaMetafactory
  #318 = Utf8               metafactory
  #319 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #320 = MethodHandle       6:#321        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #321 = Methodref          #322.#323     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #322 = Class              #324          // java/lang/invoke/StringConcatFactory
  #323 = NameAndType        #239:#325     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #324 = Utf8               java/lang/invoke/StringConcatFactory
  #325 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #326 = Utf8               InnerClasses
  #327 = Class              #328          // java/lang/invoke/MethodHandles$Lookup
  #328 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #329 = Class              #330          // java/lang/invoke/MethodHandles
  #330 = Utf8               java/lang/invoke/MethodHandles
  #331 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.container.player.HennaList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_3
         6: anewarray     #9                  // class ext/mods/gameserver/model/records/Henna
         9: putfield      #11                 // Field _hennas:[Lext/mods/gameserver/model/records/Henna;
        12: aload_0
        13: invokestatic  #15                 // Method ext/mods/gameserver/enums/actors/HennaType.values:()[Lext/mods/gameserver/enums/actors/HennaType;
        16: arraylength
        17: newarray       int
        19: putfield      #21                 // Field _stats:[I
        22: aload_0
        23: aload_1
        24: putfield      #25                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        27: return
      LineNumberTable:
        line 53: 0
        line 49: 4
        line 50: 12
        line 54: 22
        line 55: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
            0      28     1 owner   Lext/mods/gameserver/model/actor/Player;

  public void recalculateStats();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=1
         0: iconst_0
         1: istore_1
         2: iload_1
         3: aload_0
         4: getfield      #21                 // Field _stats:[I
         7: arraylength
         8: if_icmpge     24
        11: aload_0
        12: getfield      #21                 // Field _stats:[I
        15: iload_1
        16: iconst_0
        17: iastore
        18: iinc          1, 1
        21: goto          2
        24: aload_0
        25: getfield      #11                 // Field _hennas:[Lext/mods/gameserver/model/records/Henna;
        28: astore_1
        29: aload_1
        30: arraylength
        31: istore_2
        32: iconst_0
        33: istore_3
        34: iload_3
        35: iload_2
        36: if_icmpge     154
        39: aload_1
        40: iload_3
        41: aaload
        42: astore        4
        44: aload         4
        46: ifnull        148
        49: aload         4
        51: aload_0
        52: getfield      #25                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        55: invokevirtual #29                 // Method ext/mods/gameserver/model/records/Henna.canBeUsedBy:(Lext/mods/gameserver/model/actor/Player;)Z
        58: ifne          64
        61: goto          148
        64: aload_0
        65: getfield      #21                 // Field _stats:[I
        68: iconst_0
        69: dup2
        70: iaload
        71: aload         4
        73: invokevirtual #33                 // Method ext/mods/gameserver/model/records/Henna.INT:()I
        76: iadd
        77: iastore
        78: aload_0
        79: getfield      #21                 // Field _stats:[I
        82: iconst_1
        83: dup2
        84: iaload
        85: aload         4
        87: invokevirtual #37                 // Method ext/mods/gameserver/model/records/Henna.STR:()I
        90: iadd
        91: iastore
        92: aload_0
        93: getfield      #21                 // Field _stats:[I
        96: iconst_2
        97: dup2
        98: iaload
        99: aload         4
       101: invokevirtual #40                 // Method ext/mods/gameserver/model/records/Henna.CON:()I
       104: iadd
       105: iastore
       106: aload_0
       107: getfield      #21                 // Field _stats:[I
       110: iconst_3
       111: dup2
       112: iaload
       113: aload         4
       115: invokevirtual #43                 // Method ext/mods/gameserver/model/records/Henna.MEN:()I
       118: iadd
       119: iastore
       120: aload_0
       121: getfield      #21                 // Field _stats:[I
       124: iconst_4
       125: dup2
       126: iaload
       127: aload         4
       129: invokevirtual #46                 // Method ext/mods/gameserver/model/records/Henna.DEX:()I
       132: iadd
       133: iastore
       134: aload_0
       135: getfield      #21                 // Field _stats:[I
       138: iconst_5
       139: dup2
       140: iaload
       141: aload         4
       143: invokevirtual #49                 // Method ext/mods/gameserver/model/records/Henna.WIT:()I
       146: iadd
       147: iastore
       148: iinc          3, 1
       151: goto          34
       154: iconst_0
       155: istore_1
       156: iload_1
       157: aload_0
       158: getfield      #21                 // Field _stats:[I
       161: arraylength
       162: if_icmpge     187
       165: aload_0
       166: getfield      #21                 // Field _stats:[I
       169: iload_1
       170: aload_0
       171: getfield      #21                 // Field _stats:[I
       174: iload_1
       175: iaload
       176: iconst_5
       177: invokestatic  #52                 // Method java/lang/Math.min:(II)I
       180: iastore
       181: iinc          1, 1
       184: goto          156
       187: return
      LineNumberTable:
        line 64: 0
        line 65: 11
        line 64: 18
        line 67: 24
        line 69: 44
        line 70: 61
        line 72: 64
        line 73: 78
        line 74: 92
        line 75: 106
        line 76: 120
        line 77: 134
        line 67: 148
        line 80: 154
        line 81: 165
        line 80: 181
        line 82: 187
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            2      22     1     i   I
           44     104     4 henna   Lext/mods/gameserver/model/records/Henna;
          156      31     1     i   I
            0     188     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
      StackMapTable: number_of_entries = 8
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 21
        frame_type = 254 /* append */
          offset_delta = 9
          locals = [ class "[Lext/mods/gameserver/model/records/Henna;", int, int ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/records/Henna ]
        frame_type = 250 /* chop */
          offset_delta = 83
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 30

  public java.util.List<ext.mods.gameserver.model.records.Henna> getHennas();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #11                 // Field _hennas:[Lext/mods/gameserver/model/records/Henna;
         4: invokestatic  #64                 // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
         7: invokedynamic #70,  0             // InvokeDynamic #0:test:()Ljava/util/function/Predicate;
        12: invokeinterface #74,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        17: invokeinterface #80,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        22: areturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
    Signature: #272                         // ()Ljava/util/List<Lext/mods/gameserver/model/records/Henna;>;

  public int getStat(ext.mods.gameserver.enums.actors.HennaType);
    descriptor: (Lext/mods/gameserver/enums/actors/HennaType;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #21                 // Field _stats:[I
         4: aload_1
         5: invokevirtual #84                 // Method ext/mods/gameserver/enums/actors/HennaType.ordinal:()I
         8: iaload
         9: ireturn
      LineNumberTable:
        line 129: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
            0      10     1  type   Lext/mods/gameserver/enums/actors/HennaType;

  public void restore();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=1
         0: iconst_3
         1: anewarray     #9                  // class ext/mods/gameserver/model/records/Henna
         4: astore_1
         5: invokestatic  #87                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         8: astore_2
         9: aload_2
        10: ldc           #93                 // String SELECT slot, symbol_id FROM character_hennas WHERE char_obj_id = ? AND class_index = ?
        12: invokeinterface #95,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        17: astore_3
        18: aload_3
        19: iconst_1
        20: aload_0
        21: getfield      #25                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        24: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        27: invokeinterface #106,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        32: aload_3
        33: iconst_2
        34: aload_0
        35: getfield      #25                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        38: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
        41: invokeinterface #106,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        46: aload_3
        47: invokeinterface #115,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        52: astore        4
        54: aload         4
        56: invokeinterface #119,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        61: ifeq          198
        64: aload         4
        66: ldc           #125                // String slot
        68: invokeinterface #127,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        73: istore        5
        75: aload         4
        77: ldc           #131                // String symbol_id
        79: invokeinterface #127,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        84: istore        6
        86: iload         5
        88: iconst_1
        89: if_icmplt     98
        92: iload         5
        94: iconst_4
        95: if_icmple     131
        98: getstatic     #133                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       101: ldc           #137                // String {} has Henna on invalid slot {}.
       103: iconst_2
       104: anewarray     #2                  // class java/lang/Object
       107: dup
       108: iconst_0
       109: aload_0
       110: getfield      #25                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       113: invokevirtual #139                // Method ext/mods/gameserver/model/actor/Player.toString:()Ljava/lang/String;
       116: aastore
       117: dup
       118: iconst_1
       119: iload         5
       121: invokestatic  #143                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       124: aastore
       125: invokevirtual #149                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       128: goto          54
       131: invokestatic  #155                // Method ext/mods/gameserver/data/xml/HennaData.getInstance:()Lext/mods/gameserver/data/xml/HennaData;
       134: iload         6
       136: invokevirtual #161                // Method ext/mods/gameserver/data/xml/HennaData.getHenna:(I)Lext/mods/gameserver/model/records/Henna;
       139: astore        7
       141: aload         7
       143: ifnonnull     187
       146: getstatic     #133                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       149: ldc           #165                // String {} has unknown Henna Symbol Id: {} in slot {}.
       151: iconst_3
       152: anewarray     #2                  // class java/lang/Object
       155: dup
       156: iconst_0
       157: aload_0
       158: getfield      #25                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       161: invokevirtual #139                // Method ext/mods/gameserver/model/actor/Player.toString:()Ljava/lang/String;
       164: aastore
       165: dup
       166: iconst_1
       167: iload         6
       169: invokestatic  #143                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       172: aastore
       173: dup
       174: iconst_2
       175: iload         5
       177: invokestatic  #143                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       180: aastore
       181: invokevirtual #149                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       184: goto          54
       187: aload_1
       188: iload         5
       190: iconst_1
       191: isub
       192: aload         7
       194: aastore
       195: goto          54
       198: aload         4
       200: ifnull        242
       203: aload         4
       205: invokeinterface #167,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       210: goto          242
       213: astore        5
       215: aload         4
       217: ifnull        239
       220: aload         4
       222: invokeinterface #167,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       227: goto          239
       230: astore        6
       232: aload         5
       234: aload         6
       236: invokevirtual #172                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       239: aload         5
       241: athrow
       242: aload_3
       243: ifnull        282
       246: aload_3
       247: invokeinterface #176,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       252: goto          282
       255: astore        4
       257: aload_3
       258: ifnull        279
       261: aload_3
       262: invokeinterface #176,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       267: goto          279
       270: astore        5
       272: aload         4
       274: aload         5
       276: invokevirtual #172                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       279: aload         4
       281: athrow
       282: aload_2
       283: ifnull        319
       286: aload_2
       287: invokeinterface #177,  1          // InterfaceMethod java/sql/Connection.close:()V
       292: goto          319
       295: astore_3
       296: aload_2
       297: ifnull        317
       300: aload_2
       301: invokeinterface #177,  1          // InterfaceMethod java/sql/Connection.close:()V
       306: goto          317
       309: astore        4
       311: aload_3
       312: aload         4
       314: invokevirtual #172                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       317: aload_3
       318: athrow
       319: goto          332
       322: astore_2
       323: getstatic     #133                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       326: ldc           #180                // String Couldn\'t restore hennas.
       328: aload_2
       329: invokevirtual #182                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       332: aload_1
       333: iconst_0
       334: aload_0
       335: getfield      #11                 // Field _hennas:[Lext/mods/gameserver/model/records/Henna;
       338: iconst_0
       339: aload_1
       340: arraylength
       341: invokestatic  #186                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
       344: return
      Exception table:
         from    to  target type
            54   198   213   Class java/lang/Throwable
           220   227   230   Class java/lang/Throwable
            18   242   255   Class java/lang/Throwable
           261   267   270   Class java/lang/Throwable
             9   282   295   Class java/lang/Throwable
           300   306   309   Class java/lang/Throwable
             5   319   322   Class java/lang/Exception
      LineNumberTable:
        line 137: 0
        line 139: 5
        line 140: 9
        line 142: 18
        line 143: 32
        line 145: 46
        line 147: 54
        line 149: 64
        line 150: 75
        line 152: 86
        line 154: 98
        line 155: 128
        line 158: 131
        line 159: 141
        line 161: 146
        line 162: 184
        line 165: 187
        line 166: 195
        line 167: 198
        line 145: 213
        line 168: 242
        line 139: 255
        line 168: 282
        line 139: 295
        line 172: 319
        line 169: 322
        line 171: 323
        line 174: 332
        line 175: 344
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           75     120     5  slot   I
           86     109     6 symbolId   I
          141      54     7 henna   Lext/mods/gameserver/model/records/Henna;
           54     188     4    rs   Ljava/sql/ResultSet;
           18     264     3    ps   Ljava/sql/PreparedStatement;
            9     310     2   con   Ljava/sql/Connection;
          323       9     2     e   Ljava/lang/Exception;
            0     345     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
            5     340     1 hennas   [Lext/mods/gameserver/model/records/Henna;
      StackMapTable: number_of_entries = 19
        frame_type = 255 /* full_frame */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/actor/container/player/HennaList, class "[Lext/mods/gameserver/model/records/Henna;", class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 43
          locals = [ int, int ]
        frame_type = 32 /* same */
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/records/Henna ]
        frame_type = 248 /* chop */
          offset_delta = 10
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/container/player/HennaList, class "[Lext/mods/gameserver/model/records/Henna;", class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/container/player/HennaList, class "[Lext/mods/gameserver/model/records/Henna;", class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/player/HennaList, class "[Lext/mods/gameserver/model/records/Henna;", class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public boolean isEmpty();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=1
         0: aload_0
         1: getfield      #11                 // Field _hennas:[Lext/mods/gameserver/model/records/Henna;
         4: astore_1
         5: aload_1
         6: arraylength
         7: istore_2
         8: iconst_0
         9: istore_3
        10: iload_3
        11: iload_2
        12: if_icmpge     33
        15: aload_1
        16: iload_3
        17: aaload
        18: astore        4
        20: aload         4
        22: ifnull        27
        25: iconst_0
        26: ireturn
        27: iinc          3, 1
        30: goto          10
        33: iconst_1
        34: ireturn
      LineNumberTable:
        line 182: 0
        line 184: 20
        line 185: 25
        line 182: 27
        line 187: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20       7     4     h   Lext/mods/gameserver/model/records/Henna;
            0      35     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/model/records/Henna;", int, int ]
        frame_type = 16 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public int size();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: iconst_0
         1: istore_1
         2: iconst_0
         3: istore_2
         4: iload_2
         5: aload_0
         6: getfield      #11                 // Field _hennas:[Lext/mods/gameserver/model/records/Henna;
         9: arraylength
        10: if_icmpge     31
        13: aload_0
        14: getfield      #11                 // Field _hennas:[Lext/mods/gameserver/model/records/Henna;
        17: iload_2
        18: aaload
        19: ifnull        25
        22: iinc          1, 1
        25: iinc          2, 1
        28: goto          4
        31: iload_1
        32: ireturn
      LineNumberTable:
        line 195: 0
        line 196: 2
        line 198: 13
        line 199: 22
        line 196: 25
        line 201: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            4      27     2     i   I
            0      33     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
            2      31     1 result   I
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 4
          locals = [ int, int ]
        frame_type = 20 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.model.records.Henna getBySymbolId(int);
    descriptor: (I)Lext/mods/gameserver/model/records/Henna;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=2
         0: aload_0
         1: getfield      #11                 // Field _hennas:[Lext/mods/gameserver/model/records/Henna;
         4: astore_2
         5: aload_2
         6: arraylength
         7: istore_3
         8: iconst_0
         9: istore        4
        11: iload         4
        13: iload_3
        14: if_icmpge     46
        17: aload_2
        18: iload         4
        20: aaload
        21: astore        5
        23: aload         5
        25: ifnull        40
        28: aload         5
        30: invokevirtual #58                 // Method ext/mods/gameserver/model/records/Henna.symbolId:()I
        33: iload_1
        34: if_icmpne     40
        37: aload         5
        39: areturn
        40: iinc          4, 1
        43: goto          11
        46: aconst_null
        47: areturn
      LineNumberTable:
        line 210: 0
        line 212: 23
        line 213: 37
        line 210: 40
        line 215: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23      17     5     h   Lext/mods/gameserver/model/records/Henna;
            0      48     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
            0      48     1 symbolId   I
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 11
          locals = [ class "[Lext/mods/gameserver/model/records/Henna;", int, int ]
        frame_type = 28 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public boolean isFull();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #192                // Method getEmptySlotsAmount:()I
         4: ifgt          11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 223: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getEmptySlotsAmount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #195                // Method size:()I
         4: istore_1
         5: aload_0
         6: invokevirtual #61                 // Method getMaxSize:()I
         9: istore_2
        10: iload_2
        11: iload_1
        12: isub
        13: iconst_0
        14: invokestatic  #198                // Method java/lang/Math.max:(II)I
        17: ireturn
      LineNumberTable:
        line 231: 0
        line 232: 5
        line 234: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
            5      13     1 usedSlots   I
           10       8     2 maxSlots   I

  public int getMaxSize();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #201                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
         7: astore_1
         8: aload_1
         9: invokevirtual #205                // Method ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
        12: iconst_1
        13: if_icmpge     18
        16: iconst_0
        17: ireturn
        18: aload_1
        19: invokevirtual #205                // Method ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
        22: iconst_1
        23: if_icmpne     28
        26: iconst_2
        27: ireturn
        28: iconst_3
        29: ireturn
      LineNumberTable:
        line 242: 0
        line 243: 8
        line 244: 16
        line 246: 18
        line 247: 26
        line 249: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
            8      22     1 classId   Lext/mods/gameserver/enums/actors/ClassId;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/enums/actors/ClassId ]
        frame_type = 9 /* same */

  public boolean add(ext.mods.gameserver.model.records.Henna);
    descriptor: (Lext/mods/gameserver/model/records/Henna;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=2
         0: aload_0
         1: invokevirtual #210                // Method getEmptySlotIndex:()I
         4: istore_2
         5: iload_2
         6: ifge          11
         9: iconst_0
        10: ireturn
        11: aload_0
        12: getfield      #11                 // Field _hennas:[Lext/mods/gameserver/model/records/Henna;
        15: iload_2
        16: aload_1
        17: aastore
        18: invokestatic  #87                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        21: astore_3
        22: aload_3
        23: ldc           #213                // String INSERT INTO character_hennas (char_obj_id,symbol_id,slot,class_index) VALUES (?,?,?,?)
        25: invokeinterface #95,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        30: astore        4
        32: aload         4
        34: iconst_1
        35: aload_0
        36: getfield      #25                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        39: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        42: invokeinterface #106,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        47: aload         4
        49: iconst_2
        50: aload_1
        51: invokevirtual #58                 // Method ext/mods/gameserver/model/records/Henna.symbolId:()I
        54: invokeinterface #106,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        59: aload         4
        61: iconst_3
        62: iload_2
        63: iconst_1
        64: iadd
        65: invokeinterface #106,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        70: aload         4
        72: iconst_4
        73: aload_0
        74: getfield      #25                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        77: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
        80: invokeinterface #106,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        85: aload         4
        87: invokeinterface #215,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        92: pop
        93: aload         4
        95: ifnull        137
        98: aload         4
       100: invokeinterface #176,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       105: goto          137
       108: astore        5
       110: aload         4
       112: ifnull        134
       115: aload         4
       117: invokeinterface #176,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       122: goto          134
       125: astore        6
       127: aload         5
       129: aload         6
       131: invokevirtual #172                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       134: aload         5
       136: athrow
       137: aload_3
       138: ifnull        177
       141: aload_3
       142: invokeinterface #177,  1          // InterfaceMethod java/sql/Connection.close:()V
       147: goto          177
       150: astore        4
       152: aload_3
       153: ifnull        174
       156: aload_3
       157: invokeinterface #177,  1          // InterfaceMethod java/sql/Connection.close:()V
       162: goto          174
       165: astore        5
       167: aload         4
       169: aload         5
       171: invokevirtual #172                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       174: aload         4
       176: athrow
       177: goto          190
       180: astore_3
       181: getstatic     #133                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       184: ldc           #218                // String Couldn\'t add Henna.
       186: aload_3
       187: invokevirtual #182                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       190: aload_0
       191: invokevirtual #220                // Method recalculateStats:()V
       194: iconst_1
       195: ireturn
      Exception table:
         from    to  target type
            32    93   108   Class java/lang/Throwable
           115   122   125   Class java/lang/Throwable
            22   137   150   Class java/lang/Throwable
           156   162   165   Class java/lang/Throwable
            18   177   180   Class java/lang/Exception
      LineNumberTable:
        line 258: 0
        line 259: 5
        line 260: 9
        line 262: 11
        line 264: 18
        line 265: 22
        line 267: 32
        line 268: 47
        line 269: 59
        line 270: 70
        line 271: 85
        line 272: 93
        line 264: 108
        line 272: 137
        line 264: 150
        line 276: 177
        line 273: 180
        line 275: 181
        line 278: 190
        line 279: 194
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           32     105     4    ps   Ljava/sql/PreparedStatement;
           22     155     3   con   Ljava/sql/Connection;
          181       9     3     e   Ljava/lang/Exception;
            0     196     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
            0     196     1 henna   Lext/mods/gameserver/model/records/Henna;
            5     191     2  slot   I
      StackMapTable: number_of_entries = 11
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 96
          locals = [ class ext/mods/gameserver/model/actor/container/player/HennaList, class ext/mods/gameserver/model/records/Henna, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/container/player/HennaList, class ext/mods/gameserver/model/records/Henna, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/container/player/HennaList, class ext/mods/gameserver/model/records/Henna, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public boolean remove(ext.mods.gameserver.model.records.Henna);
    descriptor: (Lext/mods/gameserver/model/records/Henna;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #223                // Method indexOf:(Lext/mods/gameserver/model/records/Henna;)I
         5: istore_2
         6: iload_2
         7: ifge          12
        10: iconst_0
        11: ireturn
        12: aload_0
        13: getfield      #11                 // Field _hennas:[Lext/mods/gameserver/model/records/Henna;
        16: iload_2
        17: aconst_null
        18: aastore
        19: invokestatic  #87                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        22: astore_3
        23: aload_3
        24: ldc           #227                // String DELETE FROM character_hennas WHERE char_obj_id=? AND slot=? AND class_index=?
        26: invokeinterface #95,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        31: astore        4
        33: aload         4
        35: iconst_1
        36: aload_0
        37: getfield      #25                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        40: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        43: invokeinterface #106,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        48: aload         4
        50: iconst_2
        51: iload_2
        52: iconst_1
        53: iadd
        54: invokeinterface #106,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        59: aload         4
        61: iconst_3
        62: aload_0
        63: getfield      #25                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        66: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
        69: invokeinterface #106,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        74: aload         4
        76: invokeinterface #215,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        81: pop
        82: aload         4
        84: ifnull        126
        87: aload         4
        89: invokeinterface #176,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        94: goto          126
        97: astore        5
        99: aload         4
       101: ifnull        123
       104: aload         4
       106: invokeinterface #176,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       111: goto          123
       114: astore        6
       116: aload         5
       118: aload         6
       120: invokevirtual #172                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       123: aload         5
       125: athrow
       126: aload_3
       127: ifnull        166
       130: aload_3
       131: invokeinterface #177,  1          // InterfaceMethod java/sql/Connection.close:()V
       136: goto          166
       139: astore        4
       141: aload_3
       142: ifnull        163
       145: aload_3
       146: invokeinterface #177,  1          // InterfaceMethod java/sql/Connection.close:()V
       151: goto          163
       154: astore        5
       156: aload         4
       158: aload         5
       160: invokevirtual #172                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       163: aload         4
       165: athrow
       166: goto          179
       169: astore_3
       170: getstatic     #133                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       173: ldc           #229                // String Couldn\'t remove Henna.
       175: aload_3
       176: invokevirtual #182                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       179: aload_0
       180: invokevirtual #220                // Method recalculateStats:()V
       183: iconst_1
       184: ireturn
      Exception table:
         from    to  target type
            33    82    97   Class java/lang/Throwable
           104   111   114   Class java/lang/Throwable
            23   126   139   Class java/lang/Throwable
           145   151   154   Class java/lang/Throwable
            19   166   169   Class java/lang/Exception
      LineNumberTable:
        line 288: 0
        line 289: 6
        line 290: 10
        line 292: 12
        line 294: 19
        line 295: 23
        line 297: 33
        line 298: 48
        line 299: 59
        line 300: 74
        line 301: 82
        line 294: 97
        line 301: 126
        line 294: 139
        line 305: 166
        line 302: 169
        line 304: 170
        line 307: 179
        line 309: 183
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      93     4    ps   Ljava/sql/PreparedStatement;
           23     143     3   con   Ljava/sql/Connection;
          170       9     3     e   Ljava/lang/Exception;
            0     185     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
            0     185     1 henna   Lext/mods/gameserver/model/records/Henna;
            6     179     2  slot   I
      StackMapTable: number_of_entries = 11
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 84
          locals = [ class ext/mods/gameserver/model/actor/container/player/HennaList, class ext/mods/gameserver/model/records/Henna, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/container/player/HennaList, class ext/mods/gameserver/model/records/Henna, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/container/player/HennaList, class ext/mods/gameserver/model/records/Henna, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public boolean canBeUsedBy(ext.mods.gameserver.model.records.Henna);
    descriptor: (Lext/mods/gameserver/model/records/Henna;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: aload_0
         2: getfield      #25                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         5: invokevirtual #29                 // Method ext/mods/gameserver/model/records/Henna.canBeUsedBy:(Lext/mods/gameserver/model/actor/Player;)Z
         8: ireturn
      LineNumberTable:
        line 318: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;
            0       9     1 henna   Lext/mods/gameserver/model/records/Henna;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #139                // Method ext/mods/gameserver/model/actor/Player.toString:()Ljava/lang/String;
         7: aload_0
         8: getfield      #11                 // Field _hennas:[Lext/mods/gameserver/model/records/Henna;
        11: invokestatic  #231                // Method java/util/Arrays.toString:([Ljava/lang/Object;)Ljava/lang/String;
        14: aload_0
        15: getfield      #21                 // Field _stats:[I
        18: invokestatic  #234                // Method java/util/Arrays.toString:([I)Ljava/lang/String;
        21: invokedynamic #237,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        26: areturn
      LineNumberTable:
        line 324: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/actor/container/player/HennaList;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #150                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #7                  // class ext/mods/gameserver/model/actor/container/player/HennaList
         6: invokevirtual #241                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #246                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #133                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 41: 0
}
SourceFile: "HennaList.java"
BootstrapMethods:
  0: #313 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 (Ljava/lang/Object;)Z
      #304 REF_invokeStatic java/util/Objects.nonNull:(Ljava/lang/Object;)Z
      #310 (Lext/mods/gameserver/model/records/Henna;)Z
  1: #320 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #311 HennaList{_owner=\u0001, _hennas=\u0001, _stats=\u0001}
InnerClasses:
  public static final #331= #327 of #329; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
