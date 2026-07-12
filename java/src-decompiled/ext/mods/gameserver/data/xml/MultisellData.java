// Bytecode for: ext.mods.gameserver.data.xml.MultisellData
// File: ext\mods\gameserver\data\xml\MultisellData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/MultisellData.class
  Last modified 9 de jul de 2026; size 7840 bytes
  MD5 checksum 4582001b5f45731dc228f5562897efdd
  Compiled from "MultisellData.java"
public class ext.mods.gameserver.data.xml.MultisellData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/MultisellData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 14, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/MultisellData._entries:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/MultisellData
   #12 = NameAndType        #14:#15       // _entries:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/MultisellData
   #14 = Utf8               _entries
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/MultisellData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/multisell
   #20 = Utf8               xml/multisell
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/MultisellData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/MultisellData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} multisell.
   #30 = Utf8               Loaded {} multisell.
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
   #49 = InterfaceMethodref #50.#51       // java/nio/file/Path.toFile:()Ljava/io/File;
   #50 = Class              #52           // java/nio/file/Path
   #51 = NameAndType        #53:#54       // toFile:()Ljava/io/File;
   #52 = Utf8               java/nio/file/Path
   #53 = Utf8               toFile
   #54 = Utf8               ()Ljava/io/File;
   #55 = Methodref          #56.#57       // java/io/File.getName:()Ljava/lang/String;
   #56 = Class              #58           // java/io/File
   #57 = NameAndType        #59:#60       // getName:()Ljava/lang/String;
   #58 = Utf8               java/io/File
   #59 = Utf8               getName
   #60 = Utf8               ()Ljava/lang/String;
   #61 = String             #62           // .xml
   #62 = Utf8               .xml
   #63 = String             #64           //
   #64 = Utf8
   #65 = Methodref          #66.#67       // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #66 = Class              #68           // java/lang/String
   #67 = NameAndType        #69:#70       // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #68 = Utf8               java/lang/String
   #69 = Utf8               replaceAll
   #70 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #71 = Methodref          #66.#72       // java/lang/String.hashCode:()I
   #72 = NameAndType        #73:#36       // hashCode:()I
   #73 = Utf8               hashCode
   #74 = Class              #75           // ext/mods/gameserver/model/multisell/ListContainer
   #75 = Utf8               ext/mods/gameserver/model/multisell/ListContainer
   #76 = Methodref          #74.#77       // ext/mods/gameserver/model/multisell/ListContainer."<init>":(I)V
   #77 = NameAndType        #5:#78        // "<init>":(I)V
   #78 = Utf8               (I)V
   #79 = String             #80           // list
   #80 = Utf8               list
   #81 = InvokeDynamic      #0:#82        // #0:accept:(Lext/mods/gameserver/data/xml/MultisellData;Lext/mods/gameserver/model/multisell/ListContainer;I)Ljava/util/function/Consumer;
   #82 = NameAndType        #83:#84       // accept:(Lext/mods/gameserver/data/xml/MultisellData;Lext/mods/gameserver/model/multisell/ListContainer;I)Ljava/util/function/Consumer;
   #83 = Utf8               accept
   #84 = Utf8               (Lext/mods/gameserver/data/xml/MultisellData;Lext/mods/gameserver/model/multisell/ListContainer;I)Ljava/util/function/Consumer;
   #85 = Methodref          #11.#86       // ext/mods/gameserver/data/xml/MultisellData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #86 = NameAndType        #87:#88       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #87 = Utf8               forEach
   #88 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #89 = InterfaceMethodref #32.#90       // java/util/Map.clear:()V
   #90 = NameAndType        #91:#6        // clear:()V
   #91 = Utf8               clear
   #92 = InterfaceMethodref #32.#93       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #93 = NameAndType        #94:#95       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #94 = Utf8               get
   #95 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #96 = Methodref          #97.#98       // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
   #97 = Class              #99           // ext/mods/gameserver/model/actor/Npc
   #98 = NameAndType        #100:#36      // getNpcId:()I
   #99 = Utf8               ext/mods/gameserver/model/actor/Npc
  #100 = Utf8               getNpcId
  #101 = Methodref          #74.#102      // ext/mods/gameserver/model/multisell/ListContainer.isNpcAllowed:(I)Z
  #102 = NameAndType        #103:#104     // isNpcAllowed:(I)Z
  #103 = Utf8               isNpcAllowed
  #104 = Utf8               (I)Z
  #105 = Methodref          #74.#106      // ext/mods/gameserver/model/multisell/ListContainer.isNpcOnly:()Z
  #106 = NameAndType        #107:#108     // isNpcOnly:()Z
  #107 = Utf8               isNpcOnly
  #108 = Utf8               ()Z
  #109 = Class              #110          // ext/mods/gameserver/model/multisell/PreparedListContainer
  #110 = Utf8               ext/mods/gameserver/model/multisell/PreparedListContainer
  #111 = Methodref          #109.#112     // ext/mods/gameserver/model/multisell/PreparedListContainer."<init>":(Lext/mods/gameserver/model/multisell/ListContainer;ZLext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
  #112 = NameAndType        #5:#113       // "<init>":(Lext/mods/gameserver/model/multisell/ListContainer;ZLext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
  #113 = Utf8               (Lext/mods/gameserver/model/multisell/ListContainer;ZLext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
  #114 = Class              #115          // ext/mods/gameserver/network/serverpackets/MultiSellList
  #115 = Utf8               ext/mods/gameserver/network/serverpackets/MultiSellList
  #116 = Methodref          #114.#117     // ext/mods/gameserver/network/serverpackets/MultiSellList."<init>":(Lext/mods/gameserver/model/multisell/ListContainer;I)V
  #117 = NameAndType        #5:#118       // "<init>":(Lext/mods/gameserver/model/multisell/ListContainer;I)V
  #118 = Utf8               (Lext/mods/gameserver/model/multisell/ListContainer;I)V
  #119 = Methodref          #120.#121     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #120 = Class              #122          // ext/mods/gameserver/model/actor/Player
  #121 = NameAndType        #123:#124     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #122 = Utf8               ext/mods/gameserver/model/actor/Player
  #123 = Utf8               sendPacket
  #124 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #125 = Methodref          #109.#126     // ext/mods/gameserver/model/multisell/PreparedListContainer.getEntries:()Ljava/util/List;
  #126 = NameAndType        #127:#128     // getEntries:()Ljava/util/List;
  #127 = Utf8               getEntries
  #128 = Utf8               ()Ljava/util/List;
  #129 = InterfaceMethodref #130.#33      // java/util/List.size:()I
  #130 = Class              #131          // java/util/List
  #131 = Utf8               java/util/List
  #132 = Methodref          #120.#133     // ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
  #133 = NameAndType        #134:#135     // setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
  #134 = Utf8               setMultiSell
  #135 = Utf8               (Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
  #136 = Class              #137          // ext/mods/gameserver/model/multisell/CommunityBoardListContainer
  #137 = Utf8               ext/mods/gameserver/model/multisell/CommunityBoardListContainer
  #138 = Methodref          #136.#112     // ext/mods/gameserver/model/multisell/CommunityBoardListContainer."<init>":(Lext/mods/gameserver/model/multisell/ListContainer;ZLext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
  #139 = Methodref          #136.#126     // ext/mods/gameserver/model/multisell/CommunityBoardListContainer.getEntries:()Ljava/util/List;
  #140 = Fieldref           #141.#142     // ext/mods/gameserver/data/xml/MultisellData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/MultisellData;
  #141 = Class              #143          // ext/mods/gameserver/data/xml/MultisellData$SingletonHolder
  #142 = NameAndType        #144:#145     // INSTANCE:Lext/mods/gameserver/data/xml/MultisellData;
  #143 = Utf8               ext/mods/gameserver/data/xml/MultisellData$SingletonHolder
  #144 = Utf8               INSTANCE
  #145 = Utf8               Lext/mods/gameserver/data/xml/MultisellData;
  #146 = InterfaceMethodref #147.#148     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #147 = Class              #149          // org/w3c/dom/Node
  #148 = NameAndType        #150:#151     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #149 = Utf8               org/w3c/dom/Node
  #150 = Utf8               getAttributes
  #151 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #152 = String             #153          // applyTaxes
  #153 = Utf8               applyTaxes
  #154 = Methodref          #155.#156     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #155 = Class              #157          // java/lang/Boolean
  #156 = NameAndType        #41:#158      // valueOf:(Z)Ljava/lang/Boolean;
  #157 = Utf8               java/lang/Boolean
  #158 = Utf8               (Z)Ljava/lang/Boolean;
  #159 = Methodref          #11.#160      // ext/mods/gameserver/data/xml/MultisellData.parseBoolean:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #160 = NameAndType        #161:#162     // parseBoolean:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #161 = Utf8               parseBoolean
  #162 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #163 = Methodref          #155.#164     // java/lang/Boolean.booleanValue:()Z
  #164 = NameAndType        #165:#108     // booleanValue:()Z
  #165 = Utf8               booleanValue
  #166 = Methodref          #74.#167      // ext/mods/gameserver/model/multisell/ListContainer.setApplyTaxes:(Z)V
  #167 = NameAndType        #168:#169     // setApplyTaxes:(Z)V
  #168 = Utf8               setApplyTaxes
  #169 = Utf8               (Z)V
  #170 = String             #171          // maintainEnchantment
  #171 = Utf8               maintainEnchantment
  #172 = Methodref          #74.#173      // ext/mods/gameserver/model/multisell/ListContainer.setMaintainEnchantment:(Z)V
  #173 = NameAndType        #174:#169     // setMaintainEnchantment:(Z)V
  #174 = Utf8               setMaintainEnchantment
  #175 = String             #176          // item
  #176 = Utf8               item
  #177 = InvokeDynamic      #1:#178       // #1:accept:(Lext/mods/gameserver/data/xml/MultisellData;Lext/mods/gameserver/model/multisell/ListContainer;)Ljava/util/function/Consumer;
  #178 = NameAndType        #83:#179      // accept:(Lext/mods/gameserver/data/xml/MultisellData;Lext/mods/gameserver/model/multisell/ListContainer;)Ljava/util/function/Consumer;
  #179 = Utf8               (Lext/mods/gameserver/data/xml/MultisellData;Lext/mods/gameserver/model/multisell/ListContainer;)Ljava/util/function/Consumer;
  #180 = String             #181          // npcs
  #181 = Utf8               npcs
  #182 = InvokeDynamic      #2:#178       // #2:accept:(Lext/mods/gameserver/data/xml/MultisellData;Lext/mods/gameserver/model/multisell/ListContainer;)Ljava/util/function/Consumer;
  #183 = InterfaceMethodref #32.#184      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #184 = NameAndType        #185:#186     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #185 = Utf8               put
  #186 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #187 = String             #188          // npc
  #188 = Utf8               npc
  #189 = InvokeDynamic      #3:#190       // #3:accept:(Lext/mods/gameserver/model/multisell/ListContainer;)Ljava/util/function/Consumer;
  #190 = NameAndType        #83:#191      // accept:(Lext/mods/gameserver/model/multisell/ListContainer;)Ljava/util/function/Consumer;
  #191 = Utf8               (Lext/mods/gameserver/model/multisell/ListContainer;)Ljava/util/function/Consumer;
  #192 = InterfaceMethodref #147.#193     // org/w3c/dom/Node.getTextContent:()Ljava/lang/String;
  #193 = NameAndType        #194:#60      // getTextContent:()Ljava/lang/String;
  #194 = Utf8               getTextContent
  #195 = Methodref          #38.#196      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #196 = NameAndType        #197:#198     // parseInt:(Ljava/lang/String;)I
  #197 = Utf8               parseInt
  #198 = Utf8               (Ljava/lang/String;)I
  #199 = Methodref          #74.#200      // ext/mods/gameserver/model/multisell/ListContainer.allowNpc:(I)V
  #200 = NameAndType        #201:#78      // allowNpc:(I)V
  #201 = Utf8               allowNpc
  #202 = Class              #203          // java/util/ArrayList
  #203 = Utf8               java/util/ArrayList
  #204 = Methodref          #202.#3       // java/util/ArrayList."<init>":()V
  #205 = String             #206          // ingredient
  #206 = Utf8               ingredient
  #207 = InvokeDynamic      #4:#208       // #4:accept:(Lext/mods/gameserver/data/xml/MultisellData;Ljava/util/List;)Ljava/util/function/Consumer;
  #208 = NameAndType        #83:#209      // accept:(Lext/mods/gameserver/data/xml/MultisellData;Ljava/util/List;)Ljava/util/function/Consumer;
  #209 = Utf8               (Lext/mods/gameserver/data/xml/MultisellData;Ljava/util/List;)Ljava/util/function/Consumer;
  #210 = String             #211          // production
  #211 = Utf8               production
  #212 = InvokeDynamic      #5:#208       // #5:accept:(Lext/mods/gameserver/data/xml/MultisellData;Ljava/util/List;)Ljava/util/function/Consumer;
  #213 = Methodref          #74.#126      // ext/mods/gameserver/model/multisell/ListContainer.getEntries:()Ljava/util/List;
  #214 = Class              #215          // ext/mods/gameserver/model/multisell/Entry
  #215 = Utf8               ext/mods/gameserver/model/multisell/Entry
  #216 = Methodref          #214.#217     // ext/mods/gameserver/model/multisell/Entry."<init>":(Ljava/util/List;Ljava/util/List;)V
  #217 = NameAndType        #5:#218       // "<init>":(Ljava/util/List;Ljava/util/List;)V
  #218 = Utf8               (Ljava/util/List;Ljava/util/List;)V
  #219 = InterfaceMethodref #130.#220     // java/util/List.add:(Ljava/lang/Object;)Z
  #220 = NameAndType        #221:#222     // add:(Ljava/lang/Object;)Z
  #221 = Utf8               add
  #222 = Utf8               (Ljava/lang/Object;)Z
  #223 = Class              #224          // ext/mods/gameserver/model/multisell/Ingredient
  #224 = Utf8               ext/mods/gameserver/model/multisell/Ingredient
  #225 = Methodref          #11.#226      // ext/mods/gameserver/data/xml/MultisellData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #226 = NameAndType        #227:#228     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #227 = Utf8               parseAttributes
  #228 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #229 = Methodref          #223.#230     // ext/mods/gameserver/model/multisell/Ingredient."<init>":(Lext/mods/commons/data/StatSet;)V
  #230 = NameAndType        #5:#231       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #231 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #232 = Class              #233          // ext/mods/commons/data/xml/IXmlReader
  #233 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #234 = Utf8               PAGE_SIZE
  #235 = Utf8               I
  #236 = Utf8               ConstantValue
  #237 = Integer            40
  #238 = Utf8               Signature
  #239 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/multisell/ListContainer;>;
  #240 = Utf8               Code
  #241 = Utf8               LineNumberTable
  #242 = Utf8               LocalVariableTable
  #243 = Utf8               this
  #244 = Utf8               parseDocument
  #245 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #246 = Utf8               doc
  #247 = Utf8               Lorg/w3c/dom/Document;
  #248 = Utf8               path
  #249 = Utf8               Ljava/nio/file/Path;
  #250 = Utf8               id
  #251 = Utf8               Lext/mods/gameserver/model/multisell/ListContainer;
  #252 = Utf8               reload
  #253 = Utf8               separateAndSend
  #254 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
  #255 = Utf8               listName
  #256 = Utf8               Ljava/lang/String;
  #257 = Utf8               player
  #258 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #259 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #260 = Utf8               inventoryOnly
  #261 = Utf8               Z
  #262 = Utf8               template
  #263 = Utf8               Lext/mods/gameserver/model/multisell/PreparedListContainer;
  #264 = Utf8               index
  #265 = Utf8               StackMapTable
  #266 = Utf8               separateAndSendCb
  #267 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
  #268 = Utf8               Lext/mods/gameserver/model/multisell/CommunityBoardListContainer;
  #269 = Utf8               getList
  #270 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/multisell/ListContainer;
  #271 = Utf8               getInstance
  #272 = Utf8               ()Lext/mods/gameserver/data/xml/MultisellData;
  #273 = Utf8               lambda$parseDocument$0
  #274 = Utf8               (Lext/mods/gameserver/model/multisell/ListContainer;ILorg/w3c/dom/Node;)V
  #275 = Utf8               listNode
  #276 = Utf8               Lorg/w3c/dom/Node;
  #277 = Utf8               attrs
  #278 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #279 = Utf8               lambda$parseDocument$4
  #280 = Utf8               (Lext/mods/gameserver/model/multisell/ListContainer;Lorg/w3c/dom/Node;)V
  #281 = Utf8               npcsNode
  #282 = Utf8               lambda$parseDocument$5
  #283 = Utf8               npcNode
  #284 = Utf8               lambda$parseDocument$1
  #285 = Utf8               itemNode
  #286 = Utf8               ingredients
  #287 = Utf8               Ljava/util/List;
  #288 = Utf8               products
  #289 = Utf8               LocalVariableTypeTable
  #290 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/multisell/Ingredient;>;
  #291 = Utf8               lambda$parseDocument$3
  #292 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #293 = Utf8               productionNode
  #294 = Utf8               lambda$parseDocument$2
  #295 = Utf8               ingredientNode
  #296 = Utf8               SourceFile
  #297 = Utf8               MultisellData.java
  #298 = Utf8               NestMembers
  #299 = Utf8               BootstrapMethods
  #300 = MethodType         #301          //  (Ljava/lang/Object;)V
  #301 = Utf8               (Ljava/lang/Object;)V
  #302 = MethodHandle       5:#303        // REF_invokeVirtual ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$0:(Lext/mods/gameserver/model/multisell/ListContainer;ILorg/w3c/dom/Node;)V
  #303 = Methodref          #11.#304      // ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$0:(Lext/mods/gameserver/model/multisell/ListContainer;ILorg/w3c/dom/Node;)V
  #304 = NameAndType        #273:#274     // lambda$parseDocument$0:(Lext/mods/gameserver/model/multisell/ListContainer;ILorg/w3c/dom/Node;)V
  #305 = MethodType         #306          //  (Lorg/w3c/dom/Node;)V
  #306 = Utf8               (Lorg/w3c/dom/Node;)V
  #307 = MethodHandle       5:#308        // REF_invokeVirtual ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$1:(Lext/mods/gameserver/model/multisell/ListContainer;Lorg/w3c/dom/Node;)V
  #308 = Methodref          #11.#309      // ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$1:(Lext/mods/gameserver/model/multisell/ListContainer;Lorg/w3c/dom/Node;)V
  #309 = NameAndType        #284:#280     // lambda$parseDocument$1:(Lext/mods/gameserver/model/multisell/ListContainer;Lorg/w3c/dom/Node;)V
  #310 = MethodHandle       5:#311        // REF_invokeVirtual ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$4:(Lext/mods/gameserver/model/multisell/ListContainer;Lorg/w3c/dom/Node;)V
  #311 = Methodref          #11.#312      // ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$4:(Lext/mods/gameserver/model/multisell/ListContainer;Lorg/w3c/dom/Node;)V
  #312 = NameAndType        #279:#280     // lambda$parseDocument$4:(Lext/mods/gameserver/model/multisell/ListContainer;Lorg/w3c/dom/Node;)V
  #313 = MethodHandle       6:#314        // REF_invokeStatic ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$5:(Lext/mods/gameserver/model/multisell/ListContainer;Lorg/w3c/dom/Node;)V
  #314 = Methodref          #11.#315      // ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$5:(Lext/mods/gameserver/model/multisell/ListContainer;Lorg/w3c/dom/Node;)V
  #315 = NameAndType        #282:#280     // lambda$parseDocument$5:(Lext/mods/gameserver/model/multisell/ListContainer;Lorg/w3c/dom/Node;)V
  #316 = MethodHandle       5:#317        // REF_invokeVirtual ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #317 = Methodref          #11.#318      // ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #318 = NameAndType        #294:#292     // lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #319 = MethodHandle       5:#320        // REF_invokeVirtual ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #320 = Methodref          #11.#321      // ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #321 = NameAndType        #291:#292     // lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #322 = MethodHandle       6:#323        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #323 = Methodref          #324.#325     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #324 = Class              #326          // java/lang/invoke/LambdaMetafactory
  #325 = NameAndType        #327:#328     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #326 = Utf8               java/lang/invoke/LambdaMetafactory
  #327 = Utf8               metafactory
  #328 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #329 = Utf8               InnerClasses
  #330 = Utf8               SingletonHolder
  #331 = Class              #332          // java/lang/invoke/MethodHandles$Lookup
  #332 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #333 = Class              #334          // java/lang/invoke/MethodHandles
  #334 = Utf8               java/lang/invoke/MethodHandles
  #335 = Utf8               Lookup
{
  public static final int PAGE_SIZE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 40

  public ext.mods.gameserver.data.xml.MultisellData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _entries:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 53: 0
        line 50: 4
        line 54: 15
        line 55: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/MultisellData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/multisell
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} multisell.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _entries:Ljava/util/Map;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 60: 0
        line 61: 6
        line 62: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/xml/MultisellData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=3
         0: aload_2
         1: invokeinterface #49,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
         6: invokevirtual #55                 // Method java/io/File.getName:()Ljava/lang/String;
         9: ldc           #61                 // String .xml
        11: ldc           #63                 // String
        13: invokevirtual #65                 // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        16: invokevirtual #71                 // Method java/lang/String.hashCode:()I
        19: istore_3
        20: new           #74                 // class ext/mods/gameserver/model/multisell/ListContainer
        23: dup
        24: iload_3
        25: invokespecial #76                 // Method ext/mods/gameserver/model/multisell/ListContainer."<init>":(I)V
        28: astore        4
        30: aload_0
        31: aload_1
        32: ldc           #79                 // String list
        34: aload_0
        35: aload         4
        37: iload_3
        38: invokedynamic #81,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/MultisellData;Lext/mods/gameserver/model/multisell/ListContainer;I)Ljava/util/function/Consumer;
        43: invokevirtual #85                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        46: return
      LineNumberTable:
        line 67: 0
        line 68: 20
        line 69: 30
        line 88: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/data/xml/MultisellData;
            0      47     1   doc   Lorg/w3c/dom/Document;
            0      47     2  path   Ljava/nio/file/Path;
           20      27     3    id   I
           30      17     4  list   Lext/mods/gameserver/model/multisell/ListContainer;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/Map;
         4: invokeinterface #89,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 92: 0
        line 94: 9
        line 95: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/MultisellData;

  public void separateAndSend(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Npc, boolean);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=5
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #71                 // Method java/lang/String.hashCode:()I
         8: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #92,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #74                 // class ext/mods/gameserver/model/multisell/ListContainer
        19: astore        5
        21: aload         5
        23: ifnonnull     27
        26: return
        27: aload_3
        28: ifnull        43
        31: aload         5
        33: aload_3
        34: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
        37: invokevirtual #101                // Method ext/mods/gameserver/model/multisell/ListContainer.isNpcAllowed:(I)Z
        40: ifeq          55
        43: aload_3
        44: ifnonnull     56
        47: aload         5
        49: invokevirtual #105                // Method ext/mods/gameserver/model/multisell/ListContainer.isNpcOnly:()Z
        52: ifeq          56
        55: return
        56: new           #109                // class ext/mods/gameserver/model/multisell/PreparedListContainer
        59: dup
        60: aload         5
        62: iload         4
        64: aload_2
        65: aload_3
        66: invokespecial #111                // Method ext/mods/gameserver/model/multisell/PreparedListContainer."<init>":(Lext/mods/gameserver/model/multisell/ListContainer;ZLext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
        69: astore        6
        71: iconst_0
        72: istore        7
        74: aload_2
        75: new           #114                // class ext/mods/gameserver/network/serverpackets/MultiSellList
        78: dup
        79: aload         6
        81: iload         7
        83: invokespecial #116                // Method ext/mods/gameserver/network/serverpackets/MultiSellList."<init>":(Lext/mods/gameserver/model/multisell/ListContainer;I)V
        86: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        89: iinc          7, 40
        92: iload         7
        94: aload         6
        96: invokevirtual #125                // Method ext/mods/gameserver/model/multisell/PreparedListContainer.getEntries:()Ljava/util/List;
        99: invokeinterface #129,  1          // InterfaceMethod java/util/List.size:()I
       104: if_icmplt     74
       107: aload_2
       108: aload         6
       110: invokevirtual #132                // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
       113: return
      LineNumberTable:
        line 109: 0
        line 110: 21
        line 111: 26
        line 113: 27
        line 114: 55
        line 116: 56
        line 118: 71
        line 121: 74
        line 122: 89
        line 124: 92
        line 126: 107
        line 127: 113
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     114     0  this   Lext/mods/gameserver/data/xml/MultisellData;
            0     114     1 listName   Ljava/lang/String;
            0     114     2 player   Lext/mods/gameserver/model/actor/Player;
            0     114     3   npc   Lext/mods/gameserver/model/actor/Npc;
            0     114     4 inventoryOnly   Z
           21      93     5 template   Lext/mods/gameserver/model/multisell/ListContainer;
           71      43     6  list   Lext/mods/gameserver/model/multisell/PreparedListContainer;
           74      40     7 index   I
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/multisell/ListContainer ]
        frame_type = 15 /* same */
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/multisell/PreparedListContainer, int ]

  public void separateAndSendCb(java.lang.String, ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=4
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #71                 // Method java/lang/String.hashCode:()I
         8: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #92,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #74                 // class ext/mods/gameserver/model/multisell/ListContainer
        19: astore        4
        21: aload         4
        23: ifnonnull     27
        26: return
        27: new           #136                // class ext/mods/gameserver/model/multisell/CommunityBoardListContainer
        30: dup
        31: aload         4
        33: iload_3
        34: aload_2
        35: aconst_null
        36: invokespecial #138                // Method ext/mods/gameserver/model/multisell/CommunityBoardListContainer."<init>":(Lext/mods/gameserver/model/multisell/ListContainer;ZLext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
        39: astore        5
        41: iconst_0
        42: istore        6
        44: aload_2
        45: new           #114                // class ext/mods/gameserver/network/serverpackets/MultiSellList
        48: dup
        49: aload         5
        51: iload         6
        53: invokespecial #116                // Method ext/mods/gameserver/network/serverpackets/MultiSellList."<init>":(Lext/mods/gameserver/model/multisell/ListContainer;I)V
        56: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        59: iinc          6, 40
        62: iload         6
        64: aload         5
        66: invokevirtual #139                // Method ext/mods/gameserver/model/multisell/CommunityBoardListContainer.getEntries:()Ljava/util/List;
        69: invokeinterface #129,  1          // InterfaceMethod java/util/List.size:()I
        74: if_icmplt     44
        77: aload_2
        78: aload         5
        80: invokevirtual #132                // Method ext/mods/gameserver/model/actor/Player.setMultiSell:(Lext/mods/gameserver/model/multisell/PreparedListContainer;)V
        83: return
      LineNumberTable:
        line 140: 0
        line 141: 21
        line 142: 26
        line 144: 27
        line 146: 41
        line 149: 44
        line 150: 59
        line 152: 62
        line 154: 77
        line 155: 83
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      84     0  this   Lext/mods/gameserver/data/xml/MultisellData;
            0      84     1 listName   Ljava/lang/String;
            0      84     2 player   Lext/mods/gameserver/model/actor/Player;
            0      84     3 inventoryOnly   Z
           21      63     4 template   Lext/mods/gameserver/model/multisell/ListContainer;
           41      43     5  list   Lext/mods/gameserver/model/multisell/CommunityBoardListContainer;
           44      40     6 index   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/multisell/ListContainer ]
        frame_type = 253 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/multisell/CommunityBoardListContainer, int ]

  public ext.mods.gameserver.model.multisell.ListContainer getList(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/multisell/ListContainer;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #71                 // Method java/lang/String.hashCode:()I
         8: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #92,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #74                 // class ext/mods/gameserver/model/multisell/ListContainer
        19: areturn
      LineNumberTable:
        line 159: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/MultisellData;
            0      20     1 listName   Ljava/lang/String;

  public static ext.mods.gameserver.data.xml.MultisellData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/MultisellData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #140                // Field ext/mods/gameserver/data/xml/MultisellData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/MultisellData;
         3: areturn
      LineNumberTable:
        line 164: 0
}
SourceFile: "MultisellData.java"
NestMembers:
  ext/mods/gameserver/data/xml/MultisellData$SingletonHolder
BootstrapMethods:
  0: #322 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #300 (Ljava/lang/Object;)V
      #302 REF_invokeVirtual ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$0:(Lext/mods/gameserver/model/multisell/ListContainer;ILorg/w3c/dom/Node;)V
      #305 (Lorg/w3c/dom/Node;)V
  1: #322 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #300 (Ljava/lang/Object;)V
      #307 REF_invokeVirtual ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$1:(Lext/mods/gameserver/model/multisell/ListContainer;Lorg/w3c/dom/Node;)V
      #305 (Lorg/w3c/dom/Node;)V
  2: #322 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #300 (Ljava/lang/Object;)V
      #310 REF_invokeVirtual ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$4:(Lext/mods/gameserver/model/multisell/ListContainer;Lorg/w3c/dom/Node;)V
      #305 (Lorg/w3c/dom/Node;)V
  3: #322 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #300 (Ljava/lang/Object;)V
      #313 REF_invokeStatic ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$5:(Lext/mods/gameserver/model/multisell/ListContainer;Lorg/w3c/dom/Node;)V
      #305 (Lorg/w3c/dom/Node;)V
  4: #322 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #300 (Ljava/lang/Object;)V
      #316 REF_invokeVirtual ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #305 (Lorg/w3c/dom/Node;)V
  5: #322 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #300 (Ljava/lang/Object;)V
      #319 REF_invokeVirtual ext/mods/gameserver/data/xml/MultisellData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #305 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #335= #331 of #333; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
