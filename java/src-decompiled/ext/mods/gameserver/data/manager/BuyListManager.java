// Bytecode for: ext.mods.gameserver.data.manager.BuyListManager
// File: ext\mods\gameserver\data\manager\BuyListManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/BuyListManager.class
  Last modified 9 de jul de 2026; size 6615 bytes
  MD5 checksum 348188dbc81a6840cdfaeffe164cd10c
  Compiled from "BuyListManager.java"
public class ext.mods.gameserver.data.manager.BuyListManager implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/BuyListManager
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 11, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/BuyListManager._buyLists:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/BuyListManager
   #12 = NameAndType        #14:#15       // _buyLists:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/BuyListManager
   #14 = Utf8               _buyLists
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/manager/BuyListManager.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/buyLists.xml
   #20 = Utf8               xml/buyLists.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/manager/BuyListManager.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/manager/BuyListManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} buyLists.
   #30 = Utf8               Loaded {} buyLists.
   #31 = InterfaceMethodref #32.#33       // java/util/Map.size:()I
   #32 = Class              #34           // java/util/Map
   #33 = NameAndType        #35:#36       // size:()I
   #34 = Utf8               java/util/Map
   #35 = Utf8               size
   #36 = Utf8               ()I
   #37 = Methodref          #38.#39       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #38 = Class              #40           // java/lang/Integer
   #39 = NameAndType        #41:#42       // valueOf:(I)Ljava/lang/Integer;
   #40 = Utf8               java/lang/Integer
   #41 = Utf8               valueOf
   #42 = Utf8               (I)Ljava/lang/Integer;
   #43 = Methodref          #44.#45       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #44 = Class              #46           // ext/mods/commons/logging/CLogger
   #45 = NameAndType        #47:#48       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #46 = Utf8               ext/mods/commons/logging/CLogger
   #47 = Utf8               info
   #48 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #49 = Methodref          #50.#51       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #50 = Class              #52           // ext/mods/commons/pool/ConnectionPool
   #51 = NameAndType        #53:#54       // getConnection:()Ljava/sql/Connection;
   #52 = Utf8               ext/mods/commons/pool/ConnectionPool
   #53 = Utf8               getConnection
   #54 = Utf8               ()Ljava/sql/Connection;
   #55 = String             #56           // SELECT * FROM `buylists`
   #56 = Utf8               SELECT * FROM `buylists`
   #57 = InterfaceMethodref #58.#59       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #58 = Class              #60           // java/sql/Connection
   #59 = NameAndType        #61:#62       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #60 = Utf8               java/sql/Connection
   #61 = Utf8               prepareStatement
   #62 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #63 = InterfaceMethodref #64.#65       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #64 = Class              #66           // java/sql/PreparedStatement
   #65 = NameAndType        #67:#68       // executeQuery:()Ljava/sql/ResultSet;
   #66 = Utf8               java/sql/PreparedStatement
   #67 = Utf8               executeQuery
   #68 = Utf8               ()Ljava/sql/ResultSet;
   #69 = InterfaceMethodref #70.#71       // java/sql/ResultSet.next:()Z
   #70 = Class              #72           // java/sql/ResultSet
   #71 = NameAndType        #73:#74       // next:()Z
   #72 = Utf8               java/sql/ResultSet
   #73 = Utf8               next
   #74 = Utf8               ()Z
   #75 = String             #76           // buylist_id
   #76 = Utf8               buylist_id
   #77 = InterfaceMethodref #70.#78       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #78 = NameAndType        #79:#80       // getInt:(Ljava/lang/String;)I
   #79 = Utf8               getInt
   #80 = Utf8               (Ljava/lang/String;)I
   #81 = InterfaceMethodref #32.#82       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #82 = NameAndType        #83:#84       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #83 = Utf8               get
   #84 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #85 = Class              #86           // ext/mods/gameserver/model/buylist/NpcBuyList
   #86 = Utf8               ext/mods/gameserver/model/buylist/NpcBuyList
   #87 = String             #88           // item_id
   #88 = Utf8               item_id
   #89 = Methodref          #85.#82       // ext/mods/gameserver/model/buylist/NpcBuyList.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #90 = Class              #91           // ext/mods/gameserver/model/buylist/Product
   #91 = Utf8               ext/mods/gameserver/model/buylist/Product
   #92 = Methodref          #93.#94       // ext/mods/gameserver/taskmanager/BuyListTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/BuyListTaskManager;
   #93 = Class              #95           // ext/mods/gameserver/taskmanager/BuyListTaskManager
   #94 = NameAndType        #96:#97       // getInstance:()Lext/mods/gameserver/taskmanager/BuyListTaskManager;
   #95 = Utf8               ext/mods/gameserver/taskmanager/BuyListTaskManager
   #96 = Utf8               getInstance
   #97 = Utf8               ()Lext/mods/gameserver/taskmanager/BuyListTaskManager;
   #98 = String             #99           // count
   #99 = Utf8               count
  #100 = String             #101          // next_restock_time
  #101 = Utf8               next_restock_time
  #102 = InterfaceMethodref #70.#103      // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #103 = NameAndType        #104:#105     // getLong:(Ljava/lang/String;)J
  #104 = Utf8               getLong
  #105 = Utf8               (Ljava/lang/String;)J
  #106 = Methodref          #93.#107      // ext/mods/gameserver/taskmanager/BuyListTaskManager.test:(Lext/mods/gameserver/model/buylist/Product;IJ)V
  #107 = NameAndType        #108:#109     // test:(Lext/mods/gameserver/model/buylist/Product;IJ)V
  #108 = Utf8               test
  #109 = Utf8               (Lext/mods/gameserver/model/buylist/Product;IJ)V
  #110 = InterfaceMethodref #70.#111      // java/sql/ResultSet.close:()V
  #111 = NameAndType        #112:#6       // close:()V
  #112 = Utf8               close
  #113 = Class              #114          // java/lang/Throwable
  #114 = Utf8               java/lang/Throwable
  #115 = Methodref          #113.#116     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #116 = NameAndType        #117:#118     // addSuppressed:(Ljava/lang/Throwable;)V
  #117 = Utf8               addSuppressed
  #118 = Utf8               (Ljava/lang/Throwable;)V
  #119 = InterfaceMethodref #64.#111      // java/sql/PreparedStatement.close:()V
  #120 = InterfaceMethodref #58.#111      // java/sql/Connection.close:()V
  #121 = Class              #122          // java/lang/Exception
  #122 = Utf8               java/lang/Exception
  #123 = String             #124          // Failed to load buyList data from database.
  #124 = Utf8               Failed to load buyList data from database.
  #125 = Methodref          #44.#126      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #126 = NameAndType        #127:#128     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #127 = Utf8               error
  #128 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #129 = String             #130          // list
  #130 = Utf8               list
  #131 = InvokeDynamic      #0:#132       // #0:accept:(Lext/mods/gameserver/data/manager/BuyListManager;)Ljava/util/function/Consumer;
  #132 = NameAndType        #133:#134     // accept:(Lext/mods/gameserver/data/manager/BuyListManager;)Ljava/util/function/Consumer;
  #133 = Utf8               accept
  #134 = Utf8               (Lext/mods/gameserver/data/manager/BuyListManager;)Ljava/util/function/Consumer;
  #135 = Methodref          #11.#136      // ext/mods/gameserver/data/manager/BuyListManager.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #136 = NameAndType        #137:#138     // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #137 = Utf8               forEach
  #138 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #139 = InterfaceMethodref #32.#140      // java/util/Map.clear:()V
  #140 = NameAndType        #141:#6       // clear:()V
  #141 = Utf8               clear
  #142 = InterfaceMethodref #32.#143      // java/util/Map.values:()Ljava/util/Collection;
  #143 = NameAndType        #144:#145     // values:()Ljava/util/Collection;
  #144 = Utf8               values
  #145 = Utf8               ()Ljava/util/Collection;
  #146 = InterfaceMethodref #147.#148     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #147 = Class              #149          // java/util/Collection
  #148 = NameAndType        #150:#151     // stream:()Ljava/util/stream/Stream;
  #149 = Utf8               java/util/Collection
  #150 = Utf8               stream
  #151 = Utf8               ()Ljava/util/stream/Stream;
  #152 = InvokeDynamic      #1:#153       // #1:test:(I)Ljava/util/function/Predicate;
  #153 = NameAndType        #108:#154     // test:(I)Ljava/util/function/Predicate;
  #154 = Utf8               (I)Ljava/util/function/Predicate;
  #155 = InterfaceMethodref #156.#157     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #156 = Class              #158          // java/util/stream/Stream
  #157 = NameAndType        #159:#160     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #158 = Utf8               java/util/stream/Stream
  #159 = Utf8               filter
  #160 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #161 = InterfaceMethodref #156.#162     // java/util/stream/Stream.toList:()Ljava/util/List;
  #162 = NameAndType        #163:#164     // toList:()Ljava/util/List;
  #163 = Utf8               toList
  #164 = Utf8               ()Ljava/util/List;
  #165 = Fieldref           #166.#167     // ext/mods/gameserver/data/manager/BuyListManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/BuyListManager;
  #166 = Class              #168          // ext/mods/gameserver/data/manager/BuyListManager$SingletonHolder
  #167 = NameAndType        #169:#170     // INSTANCE:Lext/mods/gameserver/data/manager/BuyListManager;
  #168 = Utf8               ext/mods/gameserver/data/manager/BuyListManager$SingletonHolder
  #169 = Utf8               INSTANCE
  #170 = Utf8               Lext/mods/gameserver/data/manager/BuyListManager;
  #171 = Methodref          #85.#172      // ext/mods/gameserver/model/buylist/NpcBuyList.isNpcAllowed:(I)Z
  #172 = NameAndType        #173:#174     // isNpcAllowed:(I)Z
  #173 = Utf8               isNpcAllowed
  #174 = Utf8               (I)Z
  #175 = String             #176          // buyList
  #176 = Utf8               buyList
  #177 = InvokeDynamic      #2:#132       // #2:accept:(Lext/mods/gameserver/data/manager/BuyListManager;)Ljava/util/function/Consumer;
  #178 = InterfaceMethodref #179.#180     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #179 = Class              #181          // org/w3c/dom/Node
  #180 = NameAndType        #182:#183     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #181 = Utf8               org/w3c/dom/Node
  #182 = Utf8               getAttributes
  #183 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #184 = String             #185          // id
  #185 = Utf8               id
  #186 = Methodref          #11.#187      // ext/mods/gameserver/data/manager/BuyListManager.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #187 = NameAndType        #188:#189     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #188 = Utf8               parseInteger
  #189 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #190 = Methodref          #38.#191      // java/lang/Integer.intValue:()I
  #191 = NameAndType        #192:#36      // intValue:()I
  #192 = Utf8               intValue
  #193 = Methodref          #85.#194      // ext/mods/gameserver/model/buylist/NpcBuyList."<init>":(I)V
  #194 = NameAndType        #5:#195       // "<init>":(I)V
  #195 = Utf8               (I)V
  #196 = String             #197          // npcId
  #197 = Utf8               npcId
  #198 = Methodref          #85.#199      // ext/mods/gameserver/model/buylist/NpcBuyList.setNpcId:(I)V
  #199 = NameAndType        #200:#195     // setNpcId:(I)V
  #200 = Utf8               setNpcId
  #201 = String             #202          // product
  #202 = Utf8               product
  #203 = InvokeDynamic      #3:#204       // #3:accept:(Lext/mods/gameserver/data/manager/BuyListManager;Lext/mods/gameserver/model/buylist/NpcBuyList;I)Ljava/util/function/Consumer;
  #204 = NameAndType        #133:#205     // accept:(Lext/mods/gameserver/data/manager/BuyListManager;Lext/mods/gameserver/model/buylist/NpcBuyList;I)Ljava/util/function/Consumer;
  #205 = Utf8               (Lext/mods/gameserver/data/manager/BuyListManager;Lext/mods/gameserver/model/buylist/NpcBuyList;I)Ljava/util/function/Consumer;
  #206 = InterfaceMethodref #32.#207      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #207 = NameAndType        #208:#209     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #208 = Utf8               put
  #209 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #210 = Methodref          #11.#211      // ext/mods/gameserver/data/manager/BuyListManager.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #211 = NameAndType        #212:#213     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #212 = Utf8               parseAttributes
  #213 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #214 = Methodref          #90.#215      // ext/mods/gameserver/model/buylist/Product."<init>":(ILext/mods/commons/data/StatSet;)V
  #215 = NameAndType        #5:#216       // "<init>":(ILext/mods/commons/data/StatSet;)V
  #216 = Utf8               (ILext/mods/commons/data/StatSet;)V
  #217 = Methodref          #85.#218      // ext/mods/gameserver/model/buylist/NpcBuyList.addProduct:(Lext/mods/gameserver/model/buylist/Product;)V
  #218 = NameAndType        #219:#220     // addProduct:(Lext/mods/gameserver/model/buylist/Product;)V
  #219 = Utf8               addProduct
  #220 = Utf8               (Lext/mods/gameserver/model/buylist/Product;)V
  #221 = Class              #222          // ext/mods/commons/data/xml/IXmlReader
  #222 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #223 = Utf8               Signature
  #224 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/buylist/NpcBuyList;>;
  #225 = Utf8               Code
  #226 = Utf8               LineNumberTable
  #227 = Utf8               LocalVariableTable
  #228 = Utf8               this
  #229 = Utf8               Lext/mods/gameserver/model/buylist/NpcBuyList;
  #230 = Utf8               Lext/mods/gameserver/model/buylist/Product;
  #231 = Utf8               rs
  #232 = Utf8               Ljava/sql/ResultSet;
  #233 = Utf8               ps
  #234 = Utf8               Ljava/sql/PreparedStatement;
  #235 = Utf8               con
  #236 = Utf8               Ljava/sql/Connection;
  #237 = Utf8               e
  #238 = Utf8               Ljava/lang/Exception;
  #239 = Utf8               StackMapTable
  #240 = Utf8               parseDocument
  #241 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #242 = Utf8               doc
  #243 = Utf8               Lorg/w3c/dom/Document;
  #244 = Utf8               path
  #245 = Utf8               Ljava/nio/file/Path;
  #246 = Utf8               reload
  #247 = Utf8               getBuyList
  #248 = Utf8               (I)Lext/mods/gameserver/model/buylist/NpcBuyList;
  #249 = Utf8               listId
  #250 = Utf8               I
  #251 = Utf8               getBuyListsByNpcId
  #252 = Utf8               (I)Ljava/util/List;
  #253 = Utf8               (I)Ljava/util/List<Lext/mods/gameserver/model/buylist/NpcBuyList;>;
  #254 = Utf8               ()Lext/mods/gameserver/data/manager/BuyListManager;
  #255 = Utf8               lambda$getBuyListsByNpcId$0
  #256 = Utf8               (ILext/mods/gameserver/model/buylist/NpcBuyList;)Z
  #257 = Utf8               b
  #258 = Utf8               lambda$parseDocument$0
  #259 = Utf8               (Lorg/w3c/dom/Node;)V
  #260 = Utf8               listNode
  #261 = Utf8               Lorg/w3c/dom/Node;
  #262 = Utf8               lambda$parseDocument$1
  #263 = Utf8               buyListNode
  #264 = Utf8               attrs
  #265 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #266 = Utf8               buyListId
  #267 = Utf8               lambda$parseDocument$2
  #268 = Utf8               (Lext/mods/gameserver/model/buylist/NpcBuyList;ILorg/w3c/dom/Node;)V
  #269 = Utf8               productNode
  #270 = Utf8               SourceFile
  #271 = Utf8               BuyListManager.java
  #272 = Utf8               NestMembers
  #273 = Utf8               BootstrapMethods
  #274 = MethodType         #275          //  (Ljava/lang/Object;)V
  #275 = Utf8               (Ljava/lang/Object;)V
  #276 = MethodHandle       5:#277        // REF_invokeVirtual ext/mods/gameserver/data/manager/BuyListManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #277 = Methodref          #11.#278      // ext/mods/gameserver/data/manager/BuyListManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #278 = NameAndType        #258:#259     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #279 = MethodType         #259          //  (Lorg/w3c/dom/Node;)V
  #280 = MethodType         #281          //  (Ljava/lang/Object;)Z
  #281 = Utf8               (Ljava/lang/Object;)Z
  #282 = MethodHandle       6:#283        // REF_invokeStatic ext/mods/gameserver/data/manager/BuyListManager.lambda$getBuyListsByNpcId$0:(ILext/mods/gameserver/model/buylist/NpcBuyList;)Z
  #283 = Methodref          #11.#284      // ext/mods/gameserver/data/manager/BuyListManager.lambda$getBuyListsByNpcId$0:(ILext/mods/gameserver/model/buylist/NpcBuyList;)Z
  #284 = NameAndType        #255:#256     // lambda$getBuyListsByNpcId$0:(ILext/mods/gameserver/model/buylist/NpcBuyList;)Z
  #285 = MethodType         #286          //  (Lext/mods/gameserver/model/buylist/NpcBuyList;)Z
  #286 = Utf8               (Lext/mods/gameserver/model/buylist/NpcBuyList;)Z
  #287 = MethodHandle       5:#288        // REF_invokeVirtual ext/mods/gameserver/data/manager/BuyListManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #288 = Methodref          #11.#289      // ext/mods/gameserver/data/manager/BuyListManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #289 = NameAndType        #262:#259     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #290 = MethodHandle       5:#291        // REF_invokeVirtual ext/mods/gameserver/data/manager/BuyListManager.lambda$parseDocument$2:(Lext/mods/gameserver/model/buylist/NpcBuyList;ILorg/w3c/dom/Node;)V
  #291 = Methodref          #11.#292      // ext/mods/gameserver/data/manager/BuyListManager.lambda$parseDocument$2:(Lext/mods/gameserver/model/buylist/NpcBuyList;ILorg/w3c/dom/Node;)V
  #292 = NameAndType        #267:#268     // lambda$parseDocument$2:(Lext/mods/gameserver/model/buylist/NpcBuyList;ILorg/w3c/dom/Node;)V
  #293 = MethodHandle       6:#294        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #294 = Methodref          #295.#296     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #295 = Class              #297          // java/lang/invoke/LambdaMetafactory
  #296 = NameAndType        #298:#299     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #297 = Utf8               java/lang/invoke/LambdaMetafactory
  #298 = Utf8               metafactory
  #299 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #300 = Utf8               InnerClasses
  #301 = Utf8               SingletonHolder
  #302 = Class              #303          // java/lang/invoke/MethodHandles$Lookup
  #303 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #304 = Class              #305          // java/lang/invoke/MethodHandles
  #305 = Utf8               java/lang/invoke/MethodHandles
  #306 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.manager.BuyListManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _buyLists:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 48: 0
        line 45: 4
        line 49: 15
        line 50: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/manager/BuyListManager;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/buyLists.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} buyLists.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _buyLists:Ljava/util/Map;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: invokestatic  #49                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        36: astore_1
        37: aload_1
        38: ldc           #55                 // String SELECT * FROM `buylists`
        40: invokeinterface #57,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        45: astore_2
        46: aload_2
        47: invokeinterface #63,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        52: astore_3
        53: aload_3
        54: invokeinterface #69,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        59: ifeq          151
        62: aload_0
        63: getfield      #10                 // Field _buyLists:Ljava/util/Map;
        66: aload_3
        67: ldc           #75                 // String buylist_id
        69: invokeinterface #77,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        74: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        77: invokeinterface #81,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        82: checkcast     #85                 // class ext/mods/gameserver/model/buylist/NpcBuyList
        85: astore        4
        87: aload         4
        89: ifnonnull     95
        92: goto          53
        95: aload         4
        97: aload_3
        98: ldc           #87                 // String item_id
       100: invokeinterface #77,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       105: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       108: invokevirtual #89                 // Method ext/mods/gameserver/model/buylist/NpcBuyList.get:(Ljava/lang/Object;)Ljava/lang/Object;
       111: checkcast     #90                 // class ext/mods/gameserver/model/buylist/Product
       114: astore        5
       116: aload         5
       118: ifnonnull     124
       121: goto          53
       124: invokestatic  #92                 // Method ext/mods/gameserver/taskmanager/BuyListTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/BuyListTaskManager;
       127: aload         5
       129: aload_3
       130: ldc           #98                 // String count
       132: invokeinterface #77,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       137: aload_3
       138: ldc           #100                // String next_restock_time
       140: invokeinterface #102,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       145: invokevirtual #106                // Method ext/mods/gameserver/taskmanager/BuyListTaskManager.test:(Lext/mods/gameserver/model/buylist/Product;IJ)V
       148: goto          53
       151: aload_3
       152: ifnull        191
       155: aload_3
       156: invokeinterface #110,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       161: goto          191
       164: astore        4
       166: aload_3
       167: ifnull        188
       170: aload_3
       171: invokeinterface #110,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       176: goto          188
       179: astore        5
       181: aload         4
       183: aload         5
       185: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       188: aload         4
       190: athrow
       191: aload_2
       192: ifnull        228
       195: aload_2
       196: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       201: goto          228
       204: astore_3
       205: aload_2
       206: ifnull        226
       209: aload_2
       210: invokeinterface #119,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       215: goto          226
       218: astore        4
       220: aload_3
       221: aload         4
       223: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       226: aload_3
       227: athrow
       228: aload_1
       229: ifnull        263
       232: aload_1
       233: invokeinterface #120,  1          // InterfaceMethod java/sql/Connection.close:()V
       238: goto          263
       241: astore_2
       242: aload_1
       243: ifnull        261
       246: aload_1
       247: invokeinterface #120,  1          // InterfaceMethod java/sql/Connection.close:()V
       252: goto          261
       255: astore_3
       256: aload_2
       257: aload_3
       258: invokevirtual #115                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       261: aload_2
       262: athrow
       263: goto          276
       266: astore_1
       267: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       270: ldc           #123                // String Failed to load buyList data from database.
       272: aload_1
       273: invokevirtual #125                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       276: return
      Exception table:
         from    to  target type
            53   151   164   Class java/lang/Throwable
           170   176   179   Class java/lang/Throwable
            46   191   204   Class java/lang/Throwable
           209   215   218   Class java/lang/Throwable
            37   228   241   Class java/lang/Throwable
           246   252   255   Class java/lang/Throwable
            33   263   266   Class java/lang/Exception
      LineNumberTable:
        line 55: 0
        line 56: 6
        line 58: 33
        line 59: 37
        line 60: 46
        line 62: 53
        line 64: 62
        line 65: 87
        line 66: 92
        line 68: 95
        line 69: 116
        line 70: 121
        line 72: 124
        line 73: 148
        line 74: 151
        line 58: 164
        line 74: 191
        line 58: 204
        line 74: 228
        line 58: 241
        line 78: 263
        line 75: 266
        line 77: 267
        line 79: 276
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           87      61     4 buyList   Lext/mods/gameserver/model/buylist/NpcBuyList;
          116      32     5 product   Lext/mods/gameserver/model/buylist/Product;
           53     138     3    rs   Ljava/sql/ResultSet;
           46     182     2    ps   Ljava/sql/PreparedStatement;
           37     226     1   con   Ljava/sql/Connection;
          267       9     1     e   Ljava/lang/Exception;
            0     277     0  this   Lext/mods/gameserver/data/manager/BuyListManager;
      StackMapTable: number_of_entries = 18
        frame_type = 254 /* append */
          offset_delta = 53
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/buylist/NpcBuyList ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/buylist/Product ]
        frame_type = 249 /* chop */
          offset_delta = 26
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/BuyListManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/BuyListManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/BuyListManager, class java/sql/Connection, class java/lang/Throwable ]
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
         2: ldc           #129                // String list
         4: aload_0
         5: invokedynamic #131,  0            // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/manager/BuyListManager;)Ljava/util/function/Consumer;
        10: invokevirtual #135                // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 84: 0
        line 93: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/manager/BuyListManager;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _buyLists:Ljava/util/Map;
         4: invokeinterface #139,  1          // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 97: 0
        line 98: 9
        line 99: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/manager/BuyListManager;

  public ext.mods.gameserver.model.buylist.NpcBuyList getBuyList(int);
    descriptor: (I)Lext/mods/gameserver/model/buylist/NpcBuyList;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _buyLists:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #81,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #85                 // class ext/mods/gameserver/model/buylist/NpcBuyList
        16: areturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/manager/BuyListManager;
            0      17     1 listId   I

  public java.util.List<ext.mods.gameserver.model.buylist.NpcBuyList> getBuyListsByNpcId(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _buyLists:Ljava/util/Map;
         4: invokeinterface #142,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #146,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: iload_1
        15: invokedynamic #152,  0            // InvokeDynamic #1:test:(I)Ljava/util/function/Predicate;
        20: invokeinterface #155,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #161,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        30: areturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/manager/BuyListManager;
            0      31     1 npcId   I
    Signature: #253                         // (I)Ljava/util/List<Lext/mods/gameserver/model/buylist/NpcBuyList;>;

  public static ext.mods.gameserver.data.manager.BuyListManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/BuyListManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #165                // Field ext/mods/gameserver/data/manager/BuyListManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/BuyListManager;
         3: areturn
      LineNumberTable:
        line 113: 0
}
SourceFile: "BuyListManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/BuyListManager$SingletonHolder
BootstrapMethods:
  0: #293 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #274 (Ljava/lang/Object;)V
      #276 REF_invokeVirtual ext/mods/gameserver/data/manager/BuyListManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #279 (Lorg/w3c/dom/Node;)V
  1: #293 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #280 (Ljava/lang/Object;)Z
      #282 REF_invokeStatic ext/mods/gameserver/data/manager/BuyListManager.lambda$getBuyListsByNpcId$0:(ILext/mods/gameserver/model/buylist/NpcBuyList;)Z
      #285 (Lext/mods/gameserver/model/buylist/NpcBuyList;)Z
  2: #293 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #274 (Ljava/lang/Object;)V
      #287 REF_invokeVirtual ext/mods/gameserver/data/manager/BuyListManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #279 (Lorg/w3c/dom/Node;)V
  3: #293 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #274 (Ljava/lang/Object;)V
      #290 REF_invokeVirtual ext/mods/gameserver/data/manager/BuyListManager.lambda$parseDocument$2:(Lext/mods/gameserver/model/buylist/NpcBuyList;ILorg/w3c/dom/Node;)V
      #279 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #306= #302 of #304; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
