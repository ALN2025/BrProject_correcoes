// Bytecode for: ext.mods.gameserver.data.DocumentBase
// File: ext\mods\gameserver\data\DocumentBase.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/DocumentBase.class
  Last modified 9 de jul de 2026; size 25404 bytes
  MD5 checksum 64258f23f68e496927a7fc6beb990bac
  Compiled from "DocumentBase.java"
abstract class ext.mods.gameserver.data.DocumentBase
  minor version: 0
  major version: 69
  flags: (0x0420) ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/gameserver/data/DocumentBase
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 25, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/data/DocumentBase._file:Ljava/io/File;
    #8 = Class              #10           // ext/mods/gameserver/data/DocumentBase
    #9 = NameAndType        #11:#12       // _file:Ljava/io/File;
   #10 = Utf8               ext/mods/gameserver/data/DocumentBase
   #11 = Utf8               _file
   #12 = Utf8               Ljava/io/File;
   #13 = Class              #14           // java/util/HashMap
   #14 = Utf8               java/util/HashMap
   #15 = Methodref          #13.#3        // java/util/HashMap."<init>":()V
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/data/DocumentBase._tables:Ljava/util/Map;
   #17 = NameAndType        #18:#19       // _tables:Ljava/util/Map;
   #18 = Utf8               _tables
   #19 = Utf8               Ljava/util/Map;
   #20 = Methodref          #21.#22       // javax/xml/parsers/DocumentBuilderFactory.newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
   #21 = Class              #23           // javax/xml/parsers/DocumentBuilderFactory
   #22 = NameAndType        #24:#25       // newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
   #23 = Utf8               javax/xml/parsers/DocumentBuilderFactory
   #24 = Utf8               newInstance
   #25 = Utf8               ()Ljavax/xml/parsers/DocumentBuilderFactory;
   #26 = Class              #27           // javax/xml/XMLConstants
   #27 = Utf8               javax/xml/XMLConstants
   #28 = String             #29           // http://javax.xml.XMLConstants/property/accessExternalDTD
   #29 = Utf8               http://javax.xml.XMLConstants/property/accessExternalDTD
   #30 = String             #31           //
   #31 = Utf8
   #32 = Methodref          #21.#33       // javax/xml/parsers/DocumentBuilderFactory.setAttribute:(Ljava/lang/String;Ljava/lang/Object;)V
   #33 = NameAndType        #34:#35       // setAttribute:(Ljava/lang/String;Ljava/lang/Object;)V
   #34 = Utf8               setAttribute
   #35 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
   #36 = String             #37           // http://javax.xml.XMLConstants/property/accessExternalSchema
   #37 = Utf8               http://javax.xml.XMLConstants/property/accessExternalSchema
   #38 = Methodref          #21.#39       // javax/xml/parsers/DocumentBuilderFactory.setValidating:(Z)V
   #39 = NameAndType        #40:#41       // setValidating:(Z)V
   #40 = Utf8               setValidating
   #41 = Utf8               (Z)V
   #42 = Methodref          #21.#43       // javax/xml/parsers/DocumentBuilderFactory.setIgnoringComments:(Z)V
   #43 = NameAndType        #44:#41       // setIgnoringComments:(Z)V
   #44 = Utf8               setIgnoringComments
   #45 = Methodref          #21.#46       // javax/xml/parsers/DocumentBuilderFactory.newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
   #46 = NameAndType        #47:#48       // newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
   #47 = Utf8               newDocumentBuilder
   #48 = Utf8               ()Ljavax/xml/parsers/DocumentBuilder;
   #49 = Methodref          #50.#51       // javax/xml/parsers/DocumentBuilder.parse:(Ljava/io/File;)Lorg/w3c/dom/Document;
   #50 = Class              #52           // javax/xml/parsers/DocumentBuilder
   #51 = NameAndType        #53:#54       // parse:(Ljava/io/File;)Lorg/w3c/dom/Document;
   #52 = Utf8               javax/xml/parsers/DocumentBuilder
   #53 = Utf8               parse
   #54 = Utf8               (Ljava/io/File;)Lorg/w3c/dom/Document;
   #55 = Methodref          #8.#56        // ext/mods/gameserver/data/DocumentBase.parseDocument:(Lorg/w3c/dom/Document;)V
   #56 = NameAndType        #57:#58       // parseDocument:(Lorg/w3c/dom/Document;)V
   #57 = Utf8               parseDocument
   #58 = Utf8               (Lorg/w3c/dom/Document;)V
   #59 = Class              #60           // java/lang/Exception
   #60 = Utf8               java/lang/Exception
   #61 = Fieldref           #8.#62        // ext/mods/gameserver/data/DocumentBase.LOGGER:Lext/mods/commons/logging/CLogger;
   #62 = NameAndType        #63:#64       // LOGGER:Lext/mods/commons/logging/CLogger;
   #63 = Utf8               LOGGER
   #64 = Utf8               Lext/mods/commons/logging/CLogger;
   #65 = String             #66           // Error loading file {}.
   #66 = Utf8               Error loading file {}.
   #67 = Methodref          #68.#69       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #68 = Class              #70           // ext/mods/commons/logging/CLogger
   #69 = NameAndType        #71:#72       // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #70 = Utf8               ext/mods/commons/logging/CLogger
   #71 = Utf8               error
   #72 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #73 = InterfaceMethodref #74.#75       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #74 = Class              #76           // java/util/Map
   #75 = NameAndType        #77:#78       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #76 = Utf8               java/util/Map
   #77 = Utf8               put
   #78 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #79 = InterfaceMethodref #80.#81       // org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
   #80 = Class              #82           // org/w3c/dom/Node
   #81 = NameAndType        #83:#84       // getFirstChild:()Lorg/w3c/dom/Node;
   #82 = Utf8               org/w3c/dom/Node
   #83 = Utf8               getFirstChild
   #84 = Utf8               ()Lorg/w3c/dom/Node;
   #85 = String             #86           // cond
   #86 = Utf8               cond
   #87 = InterfaceMethodref #80.#88       // org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
   #88 = NameAndType        #89:#90       // getNodeName:()Ljava/lang/String;
   #89 = Utf8               getNodeName
   #90 = Utf8               ()Ljava/lang/String;
   #91 = Methodref          #92.#93       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #92 = Class              #94           // java/lang/String
   #93 = NameAndType        #95:#96       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #94 = Utf8               java/lang/String
   #95 = Utf8               equalsIgnoreCase
   #96 = Utf8               (Ljava/lang/String;)Z
   #97 = Methodref          #8.#98        // ext/mods/gameserver/data/DocumentBase.parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
   #98 = NameAndType        #99:#100      // parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
   #99 = Utf8               parseCondition
  #100 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #101 = InterfaceMethodref #80.#102      // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #102 = NameAndType        #103:#104     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #103 = Utf8               getAttributes
  #104 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #105 = String             #106          // msg
  #106 = Utf8               msg
  #107 = InterfaceMethodref #108.#109     // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #108 = Class              #110          // org/w3c/dom/NamedNodeMap
  #109 = NameAndType        #111:#112     // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #110 = Utf8               org/w3c/dom/NamedNodeMap
  #111 = Utf8               getNamedItem
  #112 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
  #113 = String             #114          // msgId
  #114 = Utf8               msgId
  #115 = InterfaceMethodref #80.#116      // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
  #116 = NameAndType        #117:#90      // getNodeValue:()Ljava/lang/String;
  #117 = Utf8               getNodeValue
  #118 = Methodref          #119.#120     // ext/mods/gameserver/skills/conditions/Condition.setMessage:(Ljava/lang/String;)V
  #119 = Class              #121          // ext/mods/gameserver/skills/conditions/Condition
  #120 = NameAndType        #122:#123     // setMessage:(Ljava/lang/String;)V
  #121 = Utf8               ext/mods/gameserver/skills/conditions/Condition
  #122 = Utf8               setMessage
  #123 = Utf8               (Ljava/lang/String;)V
  #124 = Methodref          #8.#125       // ext/mods/gameserver/data/DocumentBase.getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
  #125 = NameAndType        #126:#127     // getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
  #126 = Utf8               getValue
  #127 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
  #128 = Methodref          #129.#130     // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #129 = Class              #131          // java/lang/Integer
  #130 = NameAndType        #132:#133     // decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #131 = Utf8               java/lang/Integer
  #132 = Utf8               decode
  #133 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #134 = Methodref          #129.#135     // java/lang/Integer.intValue:()I
  #135 = NameAndType        #136:#137     // intValue:()I
  #136 = Utf8               intValue
  #137 = Utf8               ()I
  #138 = Methodref          #119.#139     // ext/mods/gameserver/skills/conditions/Condition.setMessageId:(I)V
  #139 = NameAndType        #140:#141     // setMessageId:(I)V
  #140 = Utf8               setMessageId
  #141 = Utf8               (I)V
  #142 = String             #143          // addName
  #143 = Utf8               addName
  #144 = Methodref          #119.#145     // ext/mods/gameserver/skills/conditions/Condition.addName:()V
  #145 = NameAndType        #143:#6       // addName:()V
  #146 = InterfaceMethodref #80.#147      // org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
  #147 = NameAndType        #148:#84      // getNextSibling:()Lorg/w3c/dom/Node;
  #148 = Utf8               getNextSibling
  #149 = String             #150          // add
  #150 = Utf8               add
  #151 = String             #152          // Add
  #152 = Utf8               Add
  #153 = Methodref          #8.#154       // ext/mods/gameserver/data/DocumentBase.attachFunc:(Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
  #154 = NameAndType        #155:#156     // attachFunc:(Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
  #155 = Utf8               attachFunc
  #156 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
  #157 = String             #158          // addMul
  #158 = Utf8               addMul
  #159 = String             #160          // AddMul
  #160 = Utf8               AddMul
  #161 = String             #162          // sub
  #162 = Utf8               sub
  #163 = String             #164          // Sub
  #164 = Utf8               Sub
  #165 = String             #166          // subDiv
  #166 = Utf8               subDiv
  #167 = String             #168          // SubDiv
  #168 = Utf8               SubDiv
  #169 = String             #170          // mul
  #170 = Utf8               mul
  #171 = String             #172          // Mul
  #172 = Utf8               Mul
  #173 = String             #174          // basemul
  #174 = Utf8               basemul
  #175 = String             #176          // BaseMul
  #176 = Utf8               BaseMul
  #177 = String             #178          // div
  #178 = Utf8               div
  #179 = String             #180          // Div
  #180 = Utf8               Div
  #181 = String             #182          // set
  #182 = Utf8               set
  #183 = String             #184          // Set
  #184 = Utf8               Set
  #185 = String             #186          // enchant
  #186 = Utf8               enchant
  #187 = String             #188          // Enchant
  #188 = Utf8               Enchant
  #189 = String             #190          // baseadd
  #190 = Utf8               baseadd
  #191 = String             #192          // BaseAdd
  #192 = Utf8               BaseAdd
  #193 = String             #194          // effect
  #194 = Utf8               effect
  #195 = Class              #196          // ext/mods/gameserver/skills/effects/EffectTemplate
  #196 = Utf8               ext/mods/gameserver/skills/effects/EffectTemplate
  #197 = Class              #198          // java/lang/RuntimeException
  #198 = Utf8               java/lang/RuntimeException
  #199 = String             #200          // Nested effects
  #200 = Utf8               Nested effects
  #201 = Methodref          #197.#202     // java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
  #202 = NameAndType        #5:#123       // "<init>":(Ljava/lang/String;)V
  #203 = Methodref          #8.#204       // ext/mods/gameserver/data/DocumentBase.attachEffect:(Lorg/w3c/dom/Node;Ljava/lang/Object;Lext/mods/gameserver/skills/conditions/Condition;)V
  #204 = NameAndType        #205:#206     // attachEffect:(Lorg/w3c/dom/Node;Ljava/lang/Object;Lext/mods/gameserver/skills/conditions/Condition;)V
  #205 = Utf8               attachEffect
  #206 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Object;Lext/mods/gameserver/skills/conditions/Condition;)V
  #207 = String             #208          // stat
  #208 = Utf8               stat
  #209 = Methodref          #210.#211     // ext/mods/gameserver/enums/skills/Stats.valueOfXml:(Ljava/lang/String;)Lext/mods/gameserver/enums/skills/Stats;
  #210 = Class              #212          // ext/mods/gameserver/enums/skills/Stats
  #211 = NameAndType        #213:#214     // valueOfXml:(Ljava/lang/String;)Lext/mods/gameserver/enums/skills/Stats;
  #212 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #213 = Utf8               valueOfXml
  #214 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/Stats;
  #215 = String             #216          // val
  #216 = Utf8               val
  #217 = Methodref          #92.#218      // java/lang/String.charAt:(I)C
  #218 = NameAndType        #219:#220     // charAt:(I)C
  #219 = Utf8               charAt
  #220 = Utf8               (I)C
  #221 = Methodref          #8.#222       // ext/mods/gameserver/data/DocumentBase.getTableValue:(Ljava/lang/String;)Ljava/lang/String;
  #222 = NameAndType        #223:#224     // getTableValue:(Ljava/lang/String;)Ljava/lang/String;
  #223 = Utf8               getTableValue
  #224 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #225 = Methodref          #226.#227     // java/lang/Double.parseDouble:(Ljava/lang/String;)D
  #226 = Class              #228          // java/lang/Double
  #227 = NameAndType        #229:#230     // parseDouble:(Ljava/lang/String;)D
  #228 = Utf8               java/lang/Double
  #229 = Utf8               parseDouble
  #230 = Utf8               (Ljava/lang/String;)D
  #231 = Class              #232          // ext/mods/gameserver/skills/basefuncs/FuncTemplate
  #232 = Utf8               ext/mods/gameserver/skills/basefuncs/FuncTemplate
  #233 = Methodref          #231.#234     // ext/mods/gameserver/skills/basefuncs/FuncTemplate."<init>":(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;Ljava/lang/String;Lext/mods/gameserver/enums/skills/Stats;D)V
  #234 = NameAndType        #5:#235       // "<init>":(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;Ljava/lang/String;Lext/mods/gameserver/enums/skills/Stats;D)V
  #235 = Utf8               (Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;Ljava/lang/String;Lext/mods/gameserver/enums/skills/Stats;D)V
  #236 = Class              #237          // ext/mods/gameserver/model/item/kind/Item
  #237 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #238 = Methodref          #236.#239     // ext/mods/gameserver/model/item/kind/Item.attach:(Lext/mods/gameserver/skills/basefuncs/FuncTemplate;)V
  #239 = NameAndType        #240:#241     // attach:(Lext/mods/gameserver/skills/basefuncs/FuncTemplate;)V
  #240 = Utf8               attach
  #241 = Utf8               (Lext/mods/gameserver/skills/basefuncs/FuncTemplate;)V
  #242 = Class              #243          // ext/mods/gameserver/skills/L2Skill
  #243 = Utf8               ext/mods/gameserver/skills/L2Skill
  #244 = Methodref          #242.#239     // ext/mods/gameserver/skills/L2Skill.attach:(Lext/mods/gameserver/skills/basefuncs/FuncTemplate;)V
  #245 = Methodref          #195.#239     // ext/mods/gameserver/skills/effects/EffectTemplate.attach:(Lext/mods/gameserver/skills/basefuncs/FuncTemplate;)V
  #246 = String             #247          // Attaching stat to a non-effect template!!!
  #247 = Utf8               Attaching stat to a non-effect template!!!
  #248 = String             #249          // name
  #249 = Utf8               name
  #250 = Methodref          #92.#251      // java/lang/String.intern:()Ljava/lang/String;
  #251 = NameAndType        #252:#90      // intern:()Ljava/lang/String;
  #252 = Utf8               intern
  #253 = String             #254          // count
  #254 = Utf8               count
  #255 = String             #256          // time
  #256 = Utf8               time
  #257 = Fieldref           #258.#259     // ext/mods/Config.ENABLE_MODIFY_SKILL_DURATION:Z
  #258 = Class              #260          // ext/mods/Config
  #259 = NameAndType        #261:#262     // ENABLE_MODIFY_SKILL_DURATION:Z
  #260 = Utf8               ext/mods/Config
  #261 = Utf8               ENABLE_MODIFY_SKILL_DURATION
  #262 = Utf8               Z
  #263 = Fieldref           #258.#264     // ext/mods/Config.SKILL_DURATION_LIST:Ljava/util/HashMap;
  #264 = NameAndType        #265:#266     // SKILL_DURATION_LIST:Ljava/util/HashMap;
  #265 = Utf8               SKILL_DURATION_LIST
  #266 = Utf8               Ljava/util/HashMap;
  #267 = Methodref          #242.#268     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #268 = NameAndType        #269:#137     // getId:()I
  #269 = Utf8               getId
  #270 = Methodref          #129.#271     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #271 = NameAndType        #272:#273     // valueOf:(I)Ljava/lang/Integer;
  #272 = Utf8               valueOf
  #273 = Utf8               (I)Ljava/lang/Integer;
  #274 = Methodref          #13.#275      // java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
  #275 = NameAndType        #276:#277     // containsKey:(Ljava/lang/Object;)Z
  #276 = Utf8               containsKey
  #277 = Utf8               (Ljava/lang/Object;)Z
  #278 = Methodref          #242.#279     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #279 = NameAndType        #280:#137     // getLevel:()I
  #280 = Utf8               getLevel
  #281 = Methodref          #13.#282      // java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #282 = NameAndType        #283:#284     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #283 = Utf8               get
  #284 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #285 = String             #286          // self
  #286 = Utf8               self
  #287 = String             #288          // noicon
  #288 = Utf8               noicon
  #289 = Fieldref           #290.#291     // ext/mods/gameserver/enums/skills/AbnormalEffect.NULL:Lext/mods/gameserver/enums/skills/AbnormalEffect;
  #290 = Class              #292          // ext/mods/gameserver/enums/skills/AbnormalEffect
  #291 = NameAndType        #293:#294     // NULL:Lext/mods/gameserver/enums/skills/AbnormalEffect;
  #292 = Utf8               ext/mods/gameserver/enums/skills/AbnormalEffect
  #293 = Utf8               NULL
  #294 = Utf8               Lext/mods/gameserver/enums/skills/AbnormalEffect;
  #295 = String             #296          // abnormal
  #296 = Utf8               abnormal
  #297 = Methodref          #290.#298     // ext/mods/gameserver/enums/skills/AbnormalEffect.getByName:(Ljava/lang/String;)Lext/mods/gameserver/enums/skills/AbnormalEffect;
  #298 = NameAndType        #299:#300     // getByName:(Ljava/lang/String;)Lext/mods/gameserver/enums/skills/AbnormalEffect;
  #299 = Utf8               getByName
  #300 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/AbnormalEffect;
  #301 = String             #302          // none
  #302 = Utf8               none
  #303 = String             #304          // stackType
  #304 = Utf8               stackType
  #305 = String             #306          // stackOrder
  #306 = Utf8               stackOrder
  #307 = Methodref          #308.#309     // java/lang/Float.parseFloat:(Ljava/lang/String;)F
  #308 = Class              #310          // java/lang/Float
  #309 = NameAndType        #311:#312     // parseFloat:(Ljava/lang/String;)F
  #310 = Utf8               java/lang/Float
  #311 = Utf8               parseFloat
  #312 = Utf8               (Ljava/lang/String;)F
  #313 = Double             -1.0d
  #315 = String             #316          // effectPower
  #316 = Utf8               effectPower
  #317 = String             #318          // effectType
  #318 = Utf8               effectType
  #319 = Class              #320          // ext/mods/gameserver/enums/skills/SkillType
  #320 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #321 = Methodref          #322.#323     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #322 = Class              #324          // java/lang/Enum
  #323 = NameAndType        #272:#325     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #324 = Utf8               java/lang/Enum
  #325 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #326 = Class              #327          // java/lang/IllegalArgumentException
  #327 = Utf8               java/lang/IllegalArgumentException
  #328 = InvokeDynamic      #0:#329       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #329 = NameAndType        #330:#224     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #330 = Utf8               makeConcatWithConstants
  #331 = Methodref          #326.#202     // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
  #332 = Class              #333          // ext/mods/gameserver/skills/effects/EffectChanceSkillTrigger
  #333 = Utf8               ext/mods/gameserver/skills/effects/EffectChanceSkillTrigger
  #334 = Methodref          #335.#336     // java/lang/Class.getName:()Ljava/lang/String;
  #335 = Class              #337          // java/lang/Class
  #336 = NameAndType        #338:#90      // getName:()Ljava/lang/String;
  #337 = Utf8               java/lang/Class
  #338 = Utf8               getName
  #339 = String             #340          // triggeredId
  #340 = Utf8               triggeredId
  #341 = Methodref          #129.#342     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #342 = NameAndType        #343:#344     // parseInt:(Ljava/lang/String;)I
  #343 = Utf8               parseInt
  #344 = Utf8               (Ljava/lang/String;)I
  #345 = Class              #346          // java/util/NoSuchElementException
  #346 = Utf8               java/util/NoSuchElementException
  #347 = InvokeDynamic      #1:#329       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #348 = Methodref          #345.#202     // java/util/NoSuchElementException."<init>":(Ljava/lang/String;)V
  #349 = String             #350          // triggeredLevel
  #350 = Utf8               triggeredLevel
  #351 = String             #352          // chanceType
  #352 = Utf8               chanceType
  #353 = InvokeDynamic      #2:#329       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #354 = String             #355          // activationChance
  #355 = Utf8               activationChance
  #356 = Methodref          #357.#358     // ext/mods/gameserver/skills/ChanceCondition.parse:(Ljava/lang/String;I)Lext/mods/gameserver/skills/ChanceCondition;
  #357 = Class              #359          // ext/mods/gameserver/skills/ChanceCondition
  #358 = NameAndType        #53:#360      // parse:(Ljava/lang/String;I)Lext/mods/gameserver/skills/ChanceCondition;
  #359 = Utf8               ext/mods/gameserver/skills/ChanceCondition
  #360 = Utf8               (Ljava/lang/String;I)Lext/mods/gameserver/skills/ChanceCondition;
  #361 = InvokeDynamic      #3:#362       // #3:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #362 = NameAndType        #330:#363     // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #363 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #364 = Methodref          #195.#365     // ext/mods/gameserver/skills/effects/EffectTemplate."<init>":(Lext/mods/gameserver/skills/conditions/Condition;Ljava/lang/String;DIILext/mods/gameserver/enums/skills/AbnormalEffect;Ljava/lang/String;FZDLext/mods/gameserver/enums/skills/SkillType;IILext/mods/gameserver/skills/ChanceCondition;)V
  #365 = NameAndType        #5:#366       // "<init>":(Lext/mods/gameserver/skills/conditions/Condition;Ljava/lang/String;DIILext/mods/gameserver/enums/skills/AbnormalEffect;Ljava/lang/String;FZDLext/mods/gameserver/enums/skills/SkillType;IILext/mods/gameserver/skills/ChanceCondition;)V
  #366 = Utf8               (Lext/mods/gameserver/skills/conditions/Condition;Ljava/lang/String;DIILext/mods/gameserver/enums/skills/AbnormalEffect;Ljava/lang/String;FZDLext/mods/gameserver/enums/skills/SkillType;IILext/mods/gameserver/skills/ChanceCondition;)V
  #367 = Methodref          #8.#368       // ext/mods/gameserver/data/DocumentBase.parseTemplate:(Lorg/w3c/dom/Node;Ljava/lang/Object;)V
  #368 = NameAndType        #369:#370     // parseTemplate:(Lorg/w3c/dom/Node;Ljava/lang/Object;)V
  #369 = Utf8               parseTemplate
  #370 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Object;)V
  #371 = Methodref          #242.#372     // ext/mods/gameserver/skills/L2Skill.attachSelf:(Lext/mods/gameserver/skills/effects/EffectTemplate;)V
  #372 = NameAndType        #373:#374     // attachSelf:(Lext/mods/gameserver/skills/effects/EffectTemplate;)V
  #373 = Utf8               attachSelf
  #374 = Utf8               (Lext/mods/gameserver/skills/effects/EffectTemplate;)V
  #375 = Methodref          #242.#376     // ext/mods/gameserver/skills/L2Skill.attach:(Lext/mods/gameserver/skills/effects/EffectTemplate;)V
  #376 = NameAndType        #240:#374     // attach:(Lext/mods/gameserver/skills/effects/EffectTemplate;)V
  #377 = InterfaceMethodref #80.#378      // org/w3c/dom/Node.getNodeType:()S
  #378 = NameAndType        #379:#380     // getNodeType:()S
  #379 = Utf8               getNodeType
  #380 = Utf8               ()S
  #381 = String             #382          // and
  #382 = Utf8               and
  #383 = Methodref          #8.#384       // ext/mods/gameserver/data/DocumentBase.parseLogicAnd:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #384 = NameAndType        #385:#100     // parseLogicAnd:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #385 = Utf8               parseLogicAnd
  #386 = String             #387          // or
  #387 = Utf8               or
  #388 = Methodref          #8.#389       // ext/mods/gameserver/data/DocumentBase.parseLogicOr:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #389 = NameAndType        #390:#100     // parseLogicOr:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #390 = Utf8               parseLogicOr
  #391 = String             #392          // not
  #392 = Utf8               not
  #393 = Methodref          #8.#394       // ext/mods/gameserver/data/DocumentBase.parseLogicNot:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #394 = NameAndType        #395:#100     // parseLogicNot:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #395 = Utf8               parseLogicNot
  #396 = String             #397          // player
  #397 = Utf8               player
  #398 = Methodref          #8.#399       // ext/mods/gameserver/data/DocumentBase.parsePlayerCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #399 = NameAndType        #400:#100     // parsePlayerCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #400 = Utf8               parsePlayerCondition
  #401 = String             #402          // target
  #402 = Utf8               target
  #403 = Methodref          #8.#404       // ext/mods/gameserver/data/DocumentBase.parseTargetCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #404 = NameAndType        #405:#100     // parseTargetCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #405 = Utf8               parseTargetCondition
  #406 = String             #407          // skill
  #407 = Utf8               skill
  #408 = Methodref          #8.#409       // ext/mods/gameserver/data/DocumentBase.parseSkillCondition:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/skills/conditions/Condition;
  #409 = NameAndType        #410:#411     // parseSkillCondition:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/skills/conditions/Condition;
  #410 = Utf8               parseSkillCondition
  #411 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/gameserver/skills/conditions/Condition;
  #412 = String             #413          // using
  #413 = Utf8               using
  #414 = Methodref          #8.#415       // ext/mods/gameserver/data/DocumentBase.parseUsingCondition:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/skills/conditions/Condition;
  #415 = NameAndType        #416:#411     // parseUsingCondition:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/skills/conditions/Condition;
  #416 = Utf8               parseUsingCondition
  #417 = String             #418          // game
  #418 = Utf8               game
  #419 = Methodref          #8.#420       // ext/mods/gameserver/data/DocumentBase.parseGameCondition:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/skills/conditions/Condition;
  #420 = NameAndType        #421:#411     // parseGameCondition:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/skills/conditions/Condition;
  #421 = Utf8               parseGameCondition
  #422 = Class              #423          // ext/mods/gameserver/skills/conditions/ConditionLogicAnd
  #423 = Utf8               ext/mods/gameserver/skills/conditions/ConditionLogicAnd
  #424 = Methodref          #422.#3       // ext/mods/gameserver/skills/conditions/ConditionLogicAnd."<init>":()V
  #425 = Methodref          #422.#426     // ext/mods/gameserver/skills/conditions/ConditionLogicAnd.add:(Lext/mods/gameserver/skills/conditions/Condition;)V
  #426 = NameAndType        #150:#427     // add:(Lext/mods/gameserver/skills/conditions/Condition;)V
  #427 = Utf8               (Lext/mods/gameserver/skills/conditions/Condition;)V
  #428 = Fieldref           #422.#429     // ext/mods/gameserver/skills/conditions/ConditionLogicAnd.conditions:[Lext/mods/gameserver/skills/conditions/Condition;
  #429 = NameAndType        #430:#431     // conditions:[Lext/mods/gameserver/skills/conditions/Condition;
  #430 = Utf8               conditions
  #431 = Utf8               [Lext/mods/gameserver/skills/conditions/Condition;
  #432 = String             #433          // Empty <and> condition in {}.
  #433 = Utf8               Empty <and> condition in {}.
  #434 = Methodref          #68.#435      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #435 = NameAndType        #71:#436      // error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #436 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #437 = Class              #438          // ext/mods/gameserver/skills/conditions/ConditionLogicOr
  #438 = Utf8               ext/mods/gameserver/skills/conditions/ConditionLogicOr
  #439 = Methodref          #437.#3       // ext/mods/gameserver/skills/conditions/ConditionLogicOr."<init>":()V
  #440 = Methodref          #437.#426     // ext/mods/gameserver/skills/conditions/ConditionLogicOr.add:(Lext/mods/gameserver/skills/conditions/Condition;)V
  #441 = Fieldref           #437.#429     // ext/mods/gameserver/skills/conditions/ConditionLogicOr.conditions:[Lext/mods/gameserver/skills/conditions/Condition;
  #442 = String             #443          // Empty <or> condition in {}.
  #443 = Utf8               Empty <or> condition in {}.
  #444 = Class              #445          // ext/mods/gameserver/skills/conditions/ConditionLogicNot
  #445 = Utf8               ext/mods/gameserver/skills/conditions/ConditionLogicNot
  #446 = Methodref          #444.#447     // ext/mods/gameserver/skills/conditions/ConditionLogicNot."<init>":(Lext/mods/gameserver/skills/conditions/Condition;)V
  #447 = NameAndType        #5:#427       // "<init>":(Lext/mods/gameserver/skills/conditions/Condition;)V
  #448 = String             #449          // Empty <not> condition in {}.
  #449 = Utf8               Empty <not> condition in {}.
  #450 = InterfaceMethodref #108.#451     // org/w3c/dom/NamedNodeMap.getLength:()I
  #451 = NameAndType        #452:#137     // getLength:()I
  #452 = Utf8               getLength
  #453 = InterfaceMethodref #108.#454     // org/w3c/dom/NamedNodeMap.item:(I)Lorg/w3c/dom/Node;
  #454 = NameAndType        #455:#456     // item:(I)Lorg/w3c/dom/Node;
  #455 = Utf8               item
  #456 = Utf8               (I)Lorg/w3c/dom/Node;
  #457 = String             #458          // race
  #458 = Utf8               race
  #459 = Methodref          #460.#461     // ext/mods/gameserver/enums/actors/ClassRace.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/actors/ClassRace;
  #460 = Class              #462          // ext/mods/gameserver/enums/actors/ClassRace
  #461 = NameAndType        #272:#463     // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/actors/ClassRace;
  #462 = Utf8               ext/mods/gameserver/enums/actors/ClassRace
  #463 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/ClassRace;
  #464 = Class              #465          // ext/mods/gameserver/skills/conditions/ConditionPlayerRace
  #465 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerRace
  #466 = Methodref          #464.#467     // ext/mods/gameserver/skills/conditions/ConditionPlayerRace."<init>":(Lext/mods/gameserver/enums/actors/ClassRace;)V
  #467 = NameAndType        #5:#468       // "<init>":(Lext/mods/gameserver/enums/actors/ClassRace;)V
  #468 = Utf8               (Lext/mods/gameserver/enums/actors/ClassRace;)V
  #469 = Methodref          #8.#470       // ext/mods/gameserver/data/DocumentBase.joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
  #470 = NameAndType        #471:#472     // joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
  #471 = Utf8               joinAnd
  #472 = Utf8               (Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
  #473 = String             #474          // level
  #474 = Utf8               level
  #475 = Class              #476          // ext/mods/gameserver/skills/conditions/ConditionPlayerLevel
  #476 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerLevel
  #477 = Methodref          #475.#478     // ext/mods/gameserver/skills/conditions/ConditionPlayerLevel."<init>":(I)V
  #478 = NameAndType        #5:#141       // "<init>":(I)V
  #479 = String             #480          // resting
  #480 = Utf8               resting
  #481 = Methodref          #482.#483     // java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
  #482 = Class              #484          // java/lang/Boolean
  #483 = NameAndType        #272:#485     // valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
  #484 = Utf8               java/lang/Boolean
  #485 = Utf8               (Ljava/lang/String;)Ljava/lang/Boolean;
  #486 = Methodref          #482.#487     // java/lang/Boolean.booleanValue:()Z
  #487 = NameAndType        #488:#489     // booleanValue:()Z
  #488 = Utf8               booleanValue
  #489 = Utf8               ()Z
  #490 = Class              #491          // ext/mods/gameserver/skills/conditions/ConditionPlayerState
  #491 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerState
  #492 = Fieldref           #493.#494     // ext/mods/gameserver/enums/skills/PlayerState.RESTING:Lext/mods/gameserver/enums/skills/PlayerState;
  #493 = Class              #495          // ext/mods/gameserver/enums/skills/PlayerState
  #494 = NameAndType        #496:#497     // RESTING:Lext/mods/gameserver/enums/skills/PlayerState;
  #495 = Utf8               ext/mods/gameserver/enums/skills/PlayerState
  #496 = Utf8               RESTING
  #497 = Utf8               Lext/mods/gameserver/enums/skills/PlayerState;
  #498 = Methodref          #490.#499     // ext/mods/gameserver/skills/conditions/ConditionPlayerState."<init>":(Lext/mods/gameserver/enums/skills/PlayerState;Z)V
  #499 = NameAndType        #5:#500       // "<init>":(Lext/mods/gameserver/enums/skills/PlayerState;Z)V
  #500 = Utf8               (Lext/mods/gameserver/enums/skills/PlayerState;Z)V
  #501 = String             #502          // riding
  #502 = Utf8               riding
  #503 = Fieldref           #493.#504     // ext/mods/gameserver/enums/skills/PlayerState.RIDING:Lext/mods/gameserver/enums/skills/PlayerState;
  #504 = NameAndType        #505:#497     // RIDING:Lext/mods/gameserver/enums/skills/PlayerState;
  #505 = Utf8               RIDING
  #506 = String             #507          // flying
  #507 = Utf8               flying
  #508 = Fieldref           #493.#509     // ext/mods/gameserver/enums/skills/PlayerState.FLYING:Lext/mods/gameserver/enums/skills/PlayerState;
  #509 = NameAndType        #510:#497     // FLYING:Lext/mods/gameserver/enums/skills/PlayerState;
  #510 = Utf8               FLYING
  #511 = String             #512          // moving
  #512 = Utf8               moving
  #513 = Fieldref           #493.#514     // ext/mods/gameserver/enums/skills/PlayerState.MOVING:Lext/mods/gameserver/enums/skills/PlayerState;
  #514 = NameAndType        #515:#497     // MOVING:Lext/mods/gameserver/enums/skills/PlayerState;
  #515 = Utf8               MOVING
  #516 = String             #517          // running
  #517 = Utf8               running
  #518 = Fieldref           #493.#519     // ext/mods/gameserver/enums/skills/PlayerState.RUNNING:Lext/mods/gameserver/enums/skills/PlayerState;
  #519 = NameAndType        #520:#497     // RUNNING:Lext/mods/gameserver/enums/skills/PlayerState;
  #520 = Utf8               RUNNING
  #521 = String             #522          // behind
  #522 = Utf8               behind
  #523 = Fieldref           #493.#524     // ext/mods/gameserver/enums/skills/PlayerState.BEHIND:Lext/mods/gameserver/enums/skills/PlayerState;
  #524 = NameAndType        #525:#497     // BEHIND:Lext/mods/gameserver/enums/skills/PlayerState;
  #525 = Utf8               BEHIND
  #526 = String             #527          // front
  #527 = Utf8               front
  #528 = Fieldref           #493.#529     // ext/mods/gameserver/enums/skills/PlayerState.FRONT:Lext/mods/gameserver/enums/skills/PlayerState;
  #529 = NameAndType        #530:#497     // FRONT:Lext/mods/gameserver/enums/skills/PlayerState;
  #530 = Utf8               FRONT
  #531 = String             #532          // olympiad
  #532 = Utf8               olympiad
  #533 = Fieldref           #493.#534     // ext/mods/gameserver/enums/skills/PlayerState.OLYMPIAD:Lext/mods/gameserver/enums/skills/PlayerState;
  #534 = NameAndType        #535:#497     // OLYMPIAD:Lext/mods/gameserver/enums/skills/PlayerState;
  #535 = Utf8               OLYMPIAD
  #536 = String             #537          // ishero
  #537 = Utf8               ishero
  #538 = Class              #539          // ext/mods/gameserver/skills/conditions/ConditionPlayerIsHero
  #539 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerIsHero
  #540 = Methodref          #538.#541     // ext/mods/gameserver/skills/conditions/ConditionPlayerIsHero."<init>":(Z)V
  #541 = NameAndType        #5:#41        // "<init>":(Z)V
  #542 = String             #543          // hp
  #543 = Utf8               hp
  #544 = Class              #545          // ext/mods/gameserver/skills/conditions/ConditionPlayerHp
  #545 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerHp
  #546 = Methodref          #544.#478     // ext/mods/gameserver/skills/conditions/ConditionPlayerHp."<init>":(I)V
  #547 = String             #548          // mp
  #548 = Utf8               mp
  #549 = Class              #550          // ext/mods/gameserver/skills/conditions/ConditionPlayerMp
  #550 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerMp
  #551 = Methodref          #549.#478     // ext/mods/gameserver/skills/conditions/ConditionPlayerMp."<init>":(I)V
  #552 = String             #553          // pkCount
  #553 = Utf8               pkCount
  #554 = Class              #555          // ext/mods/gameserver/skills/conditions/ConditionPlayerPkCount
  #555 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerPkCount
  #556 = Methodref          #554.#478     // ext/mods/gameserver/skills/conditions/ConditionPlayerPkCount."<init>":(I)V
  #557 = String             #558          // battle_force
  #558 = Utf8               battle_force
  #559 = Methodref          #560.#561     // java/lang/Byte.decode:(Ljava/lang/String;)Ljava/lang/Byte;
  #560 = Class              #562          // java/lang/Byte
  #561 = NameAndType        #132:#563     // decode:(Ljava/lang/String;)Ljava/lang/Byte;
  #562 = Utf8               java/lang/Byte
  #563 = Utf8               (Ljava/lang/String;)Ljava/lang/Byte;
  #564 = Methodref          #560.#565     // java/lang/Byte.byteValue:()B
  #565 = NameAndType        #566:#567     // byteValue:()B
  #566 = Utf8               byteValue
  #567 = Utf8               ()B
  #568 = String             #569          // spell_force
  #569 = Utf8               spell_force
  #570 = String             #571          // charges
  #571 = Utf8               charges
  #572 = Class              #573          // ext/mods/gameserver/skills/conditions/ConditionPlayerCharges
  #573 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerCharges
  #574 = Methodref          #572.#478     // ext/mods/gameserver/skills/conditions/ConditionPlayerCharges."<init>":(I)V
  #575 = String             #576          // weight
  #576 = Utf8               weight
  #577 = Class              #578          // ext/mods/gameserver/skills/conditions/ConditionPlayerWeight
  #578 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerWeight
  #579 = Methodref          #577.#478     // ext/mods/gameserver/skills/conditions/ConditionPlayerWeight."<init>":(I)V
  #580 = String             #581          // invSize
  #581 = Utf8               invSize
  #582 = Class              #583          // ext/mods/gameserver/skills/conditions/ConditionPlayerInvSize
  #583 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerInvSize
  #584 = Methodref          #582.#478     // ext/mods/gameserver/skills/conditions/ConditionPlayerInvSize."<init>":(I)V
  #585 = String             #586          // pledgeClass
  #586 = Utf8               pledgeClass
  #587 = Class              #588          // ext/mods/gameserver/skills/conditions/ConditionPlayerPledgeClass
  #588 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerPledgeClass
  #589 = Methodref          #587.#478     // ext/mods/gameserver/skills/conditions/ConditionPlayerPledgeClass."<init>":(I)V
  #590 = String             #591          // clanHall
  #591 = Utf8               clanHall
  #592 = Class              #593          // java/util/StringTokenizer
  #593 = Utf8               java/util/StringTokenizer
  #594 = String             #595          // ,
  #595 = Utf8               ,
  #596 = Methodref          #592.#597     // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #597 = NameAndType        #5:#598       // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #598 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #599 = Class              #600          // java/util/ArrayList
  #600 = Utf8               java/util/ArrayList
  #601 = Methodref          #592.#602     // java/util/StringTokenizer.countTokens:()I
  #602 = NameAndType        #603:#137     // countTokens:()I
  #603 = Utf8               countTokens
  #604 = Methodref          #599.#478     // java/util/ArrayList."<init>":(I)V
  #605 = Methodref          #592.#606     // java/util/StringTokenizer.hasMoreTokens:()Z
  #606 = NameAndType        #607:#489     // hasMoreTokens:()Z
  #607 = Utf8               hasMoreTokens
  #608 = Methodref          #592.#609     // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
  #609 = NameAndType        #610:#90      // nextToken:()Ljava/lang/String;
  #610 = Utf8               nextToken
  #611 = Methodref          #92.#612      // java/lang/String.trim:()Ljava/lang/String;
  #612 = NameAndType        #613:#90      // trim:()Ljava/lang/String;
  #613 = Utf8               trim
  #614 = Methodref          #599.#615     // java/util/ArrayList.add:(Ljava/lang/Object;)Z
  #615 = NameAndType        #150:#277     // add:(Ljava/lang/Object;)Z
  #616 = Class              #617          // ext/mods/gameserver/skills/conditions/ConditionPlayerHasClanHall
  #617 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerHasClanHall
  #618 = Methodref          #616.#619     // ext/mods/gameserver/skills/conditions/ConditionPlayerHasClanHall."<init>":(Ljava/util/List;)V
  #619 = NameAndType        #5:#620       // "<init>":(Ljava/util/List;)V
  #620 = Utf8               (Ljava/util/List;)V
  #621 = String             #622          // castle
  #622 = Utf8               castle
  #623 = Class              #624          // ext/mods/gameserver/skills/conditions/ConditionPlayerHasCastle
  #624 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerHasCastle
  #625 = Methodref          #623.#478     // ext/mods/gameserver/skills/conditions/ConditionPlayerHasCastle."<init>":(I)V
  #626 = String             #627          // sex
  #627 = Utf8               sex
  #628 = Class              #629          // ext/mods/gameserver/skills/conditions/ConditionPlayerSex
  #629 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerSex
  #630 = Methodref          #628.#478     // ext/mods/gameserver/skills/conditions/ConditionPlayerSex."<init>":(I)V
  #631 = String             #632          // active_effect_id
  #632 = Utf8               active_effect_id
  #633 = Class              #634          // ext/mods/gameserver/skills/conditions/ConditionPlayerActiveEffectId
  #634 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerActiveEffectId
  #635 = Methodref          #633.#478     // ext/mods/gameserver/skills/conditions/ConditionPlayerActiveEffectId."<init>":(I)V
  #636 = String             #637          // active_effect_id_lvl
  #637 = Utf8               active_effect_id_lvl
  #638 = Methodref          #92.#639      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #639 = NameAndType        #640:#641     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #640 = Utf8               split
  #641 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #642 = Methodref          #633.#643     // ext/mods/gameserver/skills/conditions/ConditionPlayerActiveEffectId."<init>":(II)V
  #643 = NameAndType        #5:#644       // "<init>":(II)V
  #644 = Utf8               (II)V
  #645 = String             #646          // active_skill_id
  #646 = Utf8               active_skill_id
  #647 = Class              #648          // ext/mods/gameserver/skills/conditions/ConditionPlayerActiveSkillId
  #648 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerActiveSkillId
  #649 = Methodref          #647.#478     // ext/mods/gameserver/skills/conditions/ConditionPlayerActiveSkillId."<init>":(I)V
  #650 = String             #651          // active_skill_id_lvl
  #651 = Utf8               active_skill_id_lvl
  #652 = Methodref          #647.#643     // ext/mods/gameserver/skills/conditions/ConditionPlayerActiveSkillId."<init>":(II)V
  #653 = String             #654          // seed_fire
  #654 = Utf8               seed_fire
  #655 = String             #656          // seed_water
  #656 = Utf8               seed_water
  #657 = String             #658          // seed_wind
  #658 = Utf8               seed_wind
  #659 = String             #660          // seed_various
  #660 = Utf8               seed_various
  #661 = String             #662          // seed_any
  #662 = Utf8               seed_any
  #663 = String             #664          // insidePoly
  #664 = Utf8               insidePoly
  #665 = String             #666          // minZ
  #666 = Utf8               minZ
  #667 = String             #668          // maxZ
  #668 = Utf8               maxZ
  #669 = Methodref          #482.#670     // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
  #670 = NameAndType        #671:#96      // parseBoolean:(Ljava/lang/String;)Z
  #671 = Utf8               parseBoolean
  #672 = InterfaceMethodref #80.#673      // org/w3c/dom/Node.getChildNodes:()Lorg/w3c/dom/NodeList;
  #673 = NameAndType        #674:#675     // getChildNodes:()Lorg/w3c/dom/NodeList;
  #674 = Utf8               getChildNodes
  #675 = Utf8               ()Lorg/w3c/dom/NodeList;
  #676 = Methodref          #599.#3       // java/util/ArrayList."<init>":()V
  #677 = InterfaceMethodref #678.#451     // org/w3c/dom/NodeList.getLength:()I
  #678 = Class              #679          // org/w3c/dom/NodeList
  #679 = Utf8               org/w3c/dom/NodeList
  #680 = InterfaceMethodref #678.#454     // org/w3c/dom/NodeList.item:(I)Lorg/w3c/dom/Node;
  #681 = String             #682          // x
  #682 = Utf8               x
  #683 = String             #684          // y
  #684 = Utf8               y
  #685 = Class              #686          // ext/mods/gameserver/model/holder/IntIntHolder
  #686 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #687 = Methodref          #685.#643     // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
  #688 = InterfaceMethodref #689.#615     // java/util/List.add:(Ljava/lang/Object;)Z
  #689 = Class              #690          // java/util/List
  #690 = Utf8               java/util/List
  #691 = InterfaceMethodref #689.#692     // java/util/List.size:()I
  #692 = NameAndType        #693:#137     // size:()I
  #693 = Utf8               size
  #694 = InterfaceMethodref #689.#695     // java/util/List.get:(I)Ljava/lang/Object;
  #695 = NameAndType        #283:#696     // get:(I)Ljava/lang/Object;
  #696 = Utf8               (I)Ljava/lang/Object;
  #697 = Methodref          #685.#268     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #698 = Methodref          #685.#699     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #699 = NameAndType        #126:#137     // getValue:()I
  #700 = Class              #701          // ext/mods/gameserver/skills/conditions/ConditionPlayerInsidePoly
  #701 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPlayerInsidePoly
  #702 = Class              #703          // ext/mods/gameserver/model/zone/form/ZoneNPoly
  #703 = Utf8               ext/mods/gameserver/model/zone/form/ZoneNPoly
  #704 = Methodref          #702.#705     // ext/mods/gameserver/model/zone/form/ZoneNPoly."<init>":([I[III)V
  #705 = NameAndType        #5:#706       // "<init>":([I[III)V
  #706 = Utf8               ([I[III)V
  #707 = Methodref          #700.#708     // ext/mods/gameserver/skills/conditions/ConditionPlayerInsidePoly."<init>":(Lext/mods/gameserver/model/zone/form/ZoneNPoly;Z)V
  #708 = NameAndType        #5:#709       // "<init>":(Lext/mods/gameserver/model/zone/form/ZoneNPoly;Z)V
  #709 = Utf8               (Lext/mods/gameserver/model/zone/form/ZoneNPoly;Z)V
  #710 = Class              #711          // ext/mods/gameserver/skills/conditions/ConditionElementSeed
  #711 = Utf8               ext/mods/gameserver/skills/conditions/ConditionElementSeed
  #712 = Methodref          #710.#713     // ext/mods/gameserver/skills/conditions/ConditionElementSeed."<init>":([I)V
  #713 = NameAndType        #5:#714       // "<init>":([I)V
  #714 = Utf8               ([I)V
  #715 = Class              #716          // ext/mods/gameserver/skills/conditions/ConditionForceBuff
  #716 = Utf8               ext/mods/gameserver/skills/conditions/ConditionForceBuff
  #717 = Methodref          #715.#718     // ext/mods/gameserver/skills/conditions/ConditionForceBuff."<init>":([B)V
  #718 = NameAndType        #5:#719       // "<init>":([B)V
  #719 = Utf8               ([B)V
  #720 = String             #721          // Unrecognized <player> condition in {}.
  #721 = Utf8               Unrecognized <player> condition in {}.
  #722 = String             #723          // hp_min_max
  #723 = Utf8               hp_min_max
  #724 = Class              #725          // ext/mods/gameserver/skills/conditions/ConditionTargetHpMinMax
  #725 = Utf8               ext/mods/gameserver/skills/conditions/ConditionTargetHpMinMax
  #726 = Methodref          #724.#643     // ext/mods/gameserver/skills/conditions/ConditionTargetHpMinMax."<init>":(II)V
  #727 = Class              #728          // ext/mods/gameserver/skills/conditions/ConditionTargetActiveSkillId
  #728 = Utf8               ext/mods/gameserver/skills/conditions/ConditionTargetActiveSkillId
  #729 = Methodref          #727.#478     // ext/mods/gameserver/skills/conditions/ConditionTargetActiveSkillId."<init>":(I)V
  #730 = String             #731          // race_id
  #731 = Utf8               race_id
  #732 = Class              #733          // ext/mods/gameserver/skills/conditions/ConditionTargetRaceId
  #733 = Utf8               ext/mods/gameserver/skills/conditions/ConditionTargetRaceId
  #734 = Methodref          #732.#619     // ext/mods/gameserver/skills/conditions/ConditionTargetRaceId."<init>":(Ljava/util/List;)V
  #735 = String             #736          // npcId
  #736 = Utf8               npcId
  #737 = Class              #738          // ext/mods/gameserver/skills/conditions/ConditionTargetNpcId
  #738 = Utf8               ext/mods/gameserver/skills/conditions/ConditionTargetNpcId
  #739 = Methodref          #737.#619     // ext/mods/gameserver/skills/conditions/ConditionTargetNpcId."<init>":(Ljava/util/List;)V
  #740 = String             #741          // Unrecognized <target> condition in {}.
  #741 = Utf8               Unrecognized <target> condition in {}.
  #742 = Class              #743          // ext/mods/gameserver/skills/conditions/ConditionSkillStats
  #743 = Utf8               ext/mods/gameserver/skills/conditions/ConditionSkillStats
  #744 = Methodref          #742.#745     // ext/mods/gameserver/skills/conditions/ConditionSkillStats."<init>":(Lext/mods/gameserver/enums/skills/Stats;)V
  #745 = NameAndType        #5:#746       // "<init>":(Lext/mods/gameserver/enums/skills/Stats;)V
  #746 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;)V
  #747 = String             #748          // kind
  #748 = Utf8               kind
  #749 = Fieldref           #750.#751     // ext/mods/gameserver/enums/items/WeaponType.VALUES:[Lext/mods/gameserver/enums/items/WeaponType;
  #750 = Class              #752          // ext/mods/gameserver/enums/items/WeaponType
  #751 = NameAndType        #753:#754     // VALUES:[Lext/mods/gameserver/enums/items/WeaponType;
  #752 = Utf8               ext/mods/gameserver/enums/items/WeaponType
  #753 = Utf8               VALUES
  #754 = Utf8               [Lext/mods/gameserver/enums/items/WeaponType;
  #755 = Methodref          #750.#756     // ext/mods/gameserver/enums/items/WeaponType.name:()Ljava/lang/String;
  #756 = NameAndType        #249:#90      // name:()Ljava/lang/String;
  #757 = Methodref          #92.#758      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #758 = NameAndType        #759:#277     // equals:(Ljava/lang/Object;)Z
  #759 = Utf8               equals
  #760 = Methodref          #750.#761     // ext/mods/gameserver/enums/items/WeaponType.mask:()I
  #761 = NameAndType        #762:#137     // mask:()I
  #762 = Utf8               mask
  #763 = Fieldref           #764.#765     // ext/mods/gameserver/enums/items/ArmorType.VALUES:[Lext/mods/gameserver/enums/items/ArmorType;
  #764 = Class              #766          // ext/mods/gameserver/enums/items/ArmorType
  #765 = NameAndType        #753:#767     // VALUES:[Lext/mods/gameserver/enums/items/ArmorType;
  #766 = Utf8               ext/mods/gameserver/enums/items/ArmorType
  #767 = Utf8               [Lext/mods/gameserver/enums/items/ArmorType;
  #768 = Methodref          #764.#756     // ext/mods/gameserver/enums/items/ArmorType.name:()Ljava/lang/String;
  #769 = Methodref          #764.#761     // ext/mods/gameserver/enums/items/ArmorType.mask:()I
  #770 = String             #771          // [parseUsingCondition=\"kind\"] Unknown item type name: {}.
  #771 = Utf8               [parseUsingCondition=\"kind\"] Unknown item type name: {}.
  #772 = Class              #773          // ext/mods/gameserver/skills/conditions/ConditionUsingItemType
  #773 = Utf8               ext/mods/gameserver/skills/conditions/ConditionUsingItemType
  #774 = Methodref          #772.#478     // ext/mods/gameserver/skills/conditions/ConditionUsingItemType."<init>":(I)V
  #775 = String             #776          // Unrecognized <using> condition in {}.
  #776 = Utf8               Unrecognized <using> condition in {}.
  #777 = String             #778          // night
  #778 = Utf8               night
  #779 = Class              #780          // ext/mods/gameserver/skills/conditions/ConditionGameTime
  #780 = Utf8               ext/mods/gameserver/skills/conditions/ConditionGameTime
  #781 = Methodref          #779.#541     // ext/mods/gameserver/skills/conditions/ConditionGameTime."<init>":(Z)V
  #782 = String             #783          // Unrecognized <game> condition in {}.
  #783 = Utf8               Unrecognized <game> condition in {}.
  #784 = String             #785          // Table name must start with #
  #785 = Utf8               Table name must start with #
  #786 = Methodref          #592.#202     // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
  #787 = InterfaceMethodref #689.#788     // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #788 = NameAndType        #789:#790     // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #789 = Utf8               toArray
  #790 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
  #791 = Class              #792          // "[Ljava/lang/String;"
  #792 = Utf8               [Ljava/lang/String;
  #793 = Methodref          #8.#794       // ext/mods/gameserver/data/DocumentBase.setTable:(Ljava/lang/String;[Ljava/lang/String;)V
  #794 = NameAndType        #795:#796     // setTable:(Ljava/lang/String;[Ljava/lang/String;)V
  #795 = Utf8               setTable
  #796 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)V
  #797 = Methodref          #92.#798      // java/lang/String.length:()I
  #798 = NameAndType        #799:#137     // length:()I
  #799 = Utf8               length
  #800 = Methodref          #801.#802     // java/lang/Character.isDigit:(C)Z
  #801 = Class              #803          // java/lang/Character
  #802 = NameAndType        #804:#805     // isDigit:(C)Z
  #803 = Utf8               java/lang/Character
  #804 = Utf8               isDigit
  #805 = Utf8               (C)Z
  #806 = Methodref          #92.#807      // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #807 = NameAndType        #272:#808     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #808 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #809 = Methodref          #810.#811     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
  #810 = Class              #812          // ext/mods/commons/data/StatSet
  #811 = NameAndType        #182:#598     // set:(Ljava/lang/String;Ljava/lang/String;)V
  #812 = Utf8               ext/mods/commons/data/StatSet
  #813 = Methodref          #8.#814       // ext/mods/gameserver/data/DocumentBase.getTableValue:(Ljava/lang/String;I)Ljava/lang/String;
  #814 = NameAndType        #223:#363     // getTableValue:(Ljava/lang/String;I)Ljava/lang/String;
  #815 = Class              #816          // java/lang/IllegalStateException
  #816 = Utf8               java/lang/IllegalStateException
  #817 = Methodref          #815.#3       // java/lang/IllegalStateException."<init>":()V
  #818 = Methodref          #68.#202      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #819 = Utf8               Signature
  #820 = Utf8               Ljava/util/Map<Ljava/lang/String;[Ljava/lang/String;>;
  #821 = Utf8               (Ljava/io/File;)V
  #822 = Utf8               Code
  #823 = Utf8               LineNumberTable
  #824 = Utf8               LocalVariableTable
  #825 = Utf8               this
  #826 = Utf8               Lext/mods/gameserver/data/DocumentBase;
  #827 = Utf8               pFile
  #828 = Utf8               ()Lorg/w3c/dom/Document;
  #829 = Utf8               dbf
  #830 = Utf8               Ljavax/xml/parsers/DocumentBuilderFactory;
  #831 = Utf8               e
  #832 = Utf8               Ljava/lang/Exception;
  #833 = Utf8               doc
  #834 = Utf8               Lorg/w3c/dom/Document;
  #835 = Utf8               StackMapTable
  #836 = Class              #837          // org/w3c/dom/Document
  #837 = Utf8               org/w3c/dom/Document
  #838 = Utf8               getStatSet
  #839 = Utf8               ()Lext/mods/commons/data/StatSet;
  #840 = Utf8               resetTable
  #841 = Utf8               Ljava/lang/String;
  #842 = Utf8               table
  #843 = Utf8               Lorg/w3c/dom/Node;
  #844 = Utf8               n
  #845 = Utf8               template
  #846 = Utf8               Ljava/lang/Object;
  #847 = Utf8               condition
  #848 = Utf8               Lext/mods/gameserver/skills/conditions/Condition;
  #849 = Utf8               value
  #850 = Utf8               D
  #851 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #852 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #853 = Utf8               Lext/mods/gameserver/skills/effects/EffectTemplate;
  #854 = Utf8               function
  #855 = Utf8               attachCond
  #856 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #857 = Utf8               valueString
  #858 = Utf8               applyCond
  #859 = Utf8               ft
  #860 = Utf8               Lext/mods/gameserver/skills/basefuncs/FuncTemplate;
  #861 = Utf8               abn
  #862 = Utf8               typeName
  #863 = Utf8               attrs
  #864 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #865 = Utf8               I
  #866 = Utf8               icon
  #867 = Utf8               F
  #868 = Utf8               type
  #869 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #870 = Utf8               lt
  #871 = Utf8               isChanceSkillTrigger
  #872 = Utf8               trigId
  #873 = Utf8               trigLvl
  #874 = Utf8               chanceCond
  #875 = Utf8               chance
  #876 = Utf8               Lext/mods/gameserver/skills/ChanceCondition;
  #877 = Utf8               Lext/mods/gameserver/skills/conditions/ConditionLogicAnd;
  #878 = Utf8               Lext/mods/gameserver/skills/conditions/ConditionLogicOr;
  #879 = Utf8               Lext/mods/gameserver/enums/actors/ClassRace;
  #880 = Utf8               lvl
  #881 = Utf8               expIndex
  #882 = Utf8               st
  #883 = Utf8               Ljava/util/StringTokenizer;
  #884 = Utf8               array
  #885 = Utf8               Ljava/util/ArrayList;
  #886 = Utf8               effect_id
  #887 = Utf8               effect_lvl
  #888 = Utf8               skill_id
  #889 = Utf8               skill_lvl
  #890 = Utf8               nodeAttrs
  #891 = Utf8               xCoord
  #892 = Utf8               yCoord
  #893 = Utf8               j
  #894 = Utf8               k
  #895 = Utf8               zoneNode
  #896 = Utf8               pAttrs
  #897 = Utf8               checkInside
  #898 = Utf8               nNodes
  #899 = Utf8               Lorg/w3c/dom/NodeList;
  #900 = Utf8               pNodes
  #901 = Utf8               Ljava/util/List;
  #902 = Utf8               aX
  #903 = Utf8               [I
  #904 = Utf8               aY
  #905 = Utf8               a
  #906 = Utf8               i
  #907 = Utf8               elementSeed
  #908 = Utf8               ElementSeeds
  #909 = Utf8               forces
  #910 = Utf8               [B
  #911 = Utf8               LocalVariableTypeTable
  #912 = Utf8               Ljava/util/ArrayList<Ljava/lang/Integer;>;
  #913 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #914 = Class              #903          // "[I"
  #915 = Class              #910          // "[B"
  #916 = Utf8               hpMin
  #917 = Utf8               hpMax
  #918 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #919 = Utf8               wt
  #920 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
  #921 = Utf8               at
  #922 = Utf8               Lext/mods/gameserver/enums/items/ArmorType;
  #923 = Utf8               old
  #924 = Class              #754          // "[Lext/mods/gameserver/enums/items/WeaponType;"
  #925 = Class              #767          // "[Lext/mods/gameserver/enums/items/ArmorType;"
  #926 = Utf8               parseTable
  #927 = Utf8               (Lorg/w3c/dom/Node;)V
  #928 = Utf8               data
  #929 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #930 = Utf8               parseBeanSet
  #931 = Utf8               (Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
  #932 = Utf8               Lext/mods/commons/data/StatSet;
  #933 = Utf8               Ljava/lang/Integer;
  #934 = Utf8               ch
  #935 = Utf8               C
  #936 = Utf8               intTemplate
  #937 = Utf8               cla
  #938 = Utf8               c
  #939 = Utf8               <clinit>
  #940 = Utf8               SourceFile
  #941 = Utf8               DocumentBase.java
  #942 = Utf8               BootstrapMethods
  #943 = String             #944          // Not skilltype found for: \u0001
  #944 = Utf8               Not skilltype found for: \u0001
  #945 = String             #946          // \u0001 requires triggerId
  #946 = Utf8               \u0001 requires triggerId
  #947 = String             #948          // \u0001 requires chanceType
  #948 = Utf8               \u0001 requires chanceType
  #949 = String             #950          // Invalid chance condition: \u0001 \u0001
  #950 = Utf8               Invalid chance condition: \u0001 \u0001
  #951 = MethodHandle       6:#952        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #952 = Methodref          #953.#954     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #953 = Class              #955          // java/lang/invoke/StringConcatFactory
  #954 = NameAndType        #330:#956     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #955 = Utf8               java/lang/invoke/StringConcatFactory
  #956 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #957 = Utf8               InnerClasses
  #958 = Class              #959          // java/lang/invoke/MethodHandles$Lookup
  #959 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #960 = Class              #961          // java/lang/invoke/MethodHandles
  #961 = Utf8               java/lang/invoke/MethodHandles
  #962 = Utf8               Lookup
{
  protected static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  protected java.util.Map<java.lang.String, java.lang.String[]> _tables;
    descriptor: Ljava/util/Map;
    flags: (0x0004) ACC_PROTECTED
    Signature: #820                         // Ljava/util/Map<Ljava/lang/String;[Ljava/lang/String;>;

  ext.mods.gameserver.data.DocumentBase(java.io.File);
    descriptor: (Ljava/io/File;)V
    flags: (0x0000)
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _file:Ljava/io/File;
         9: aload_0
        10: new           #13                 // class java/util/HashMap
        13: dup
        14: invokespecial #15                 // Method java/util/HashMap."<init>":()V
        17: putfield      #16                 // Field _tables:Ljava/util/Map;
        20: return
      LineNumberTable:
        line 94: 0
        line 95: 4
        line 96: 9
        line 97: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/data/DocumentBase;
            0      21     1 pFile   Ljava/io/File;

  public org.w3c.dom.Document parse();
    descriptor: ()Lorg/w3c/dom/Document;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=3, args_size=1
         0: aconst_null
         1: astore_1
         2: invokestatic  #20                 // Method javax/xml/parsers/DocumentBuilderFactory.newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
         5: astore_2
         6: aload_2
         7: ldc           #28                 // String http://javax.xml.XMLConstants/property/accessExternalDTD
         9: ldc           #30                 // String
        11: invokevirtual #32                 // Method javax/xml/parsers/DocumentBuilderFactory.setAttribute:(Ljava/lang/String;Ljava/lang/Object;)V
        14: aload_2
        15: ldc           #36                 // String http://javax.xml.XMLConstants/property/accessExternalSchema
        17: ldc           #30                 // String
        19: invokevirtual #32                 // Method javax/xml/parsers/DocumentBuilderFactory.setAttribute:(Ljava/lang/String;Ljava/lang/Object;)V
        22: aload_2
        23: iconst_0
        24: invokevirtual #38                 // Method javax/xml/parsers/DocumentBuilderFactory.setValidating:(Z)V
        27: aload_2
        28: iconst_1
        29: invokevirtual #42                 // Method javax/xml/parsers/DocumentBuilderFactory.setIgnoringComments:(Z)V
        32: aload_2
        33: invokevirtual #45                 // Method javax/xml/parsers/DocumentBuilderFactory.newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
        36: aload_0
        37: getfield      #7                  // Field _file:Ljava/io/File;
        40: invokevirtual #49                 // Method javax/xml/parsers/DocumentBuilder.parse:(Ljava/io/File;)Lorg/w3c/dom/Document;
        43: astore_1
        44: aload_0
        45: aload_1
        46: invokevirtual #55                 // Method parseDocument:(Lorg/w3c/dom/Document;)V
        49: goto          73
        52: astore_2
        53: getstatic     #61                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        56: ldc           #65                 // String Error loading file {}.
        58: aload_2
        59: iconst_1
        60: anewarray     #2                  // class java/lang/Object
        63: dup
        64: iconst_0
        65: aload_0
        66: getfield      #7                  // Field _file:Ljava/io/File;
        69: aastore
        70: invokevirtual #67                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        73: aload_1
        74: areturn
      Exception table:
         from    to  target type
             2    49    52   Class java/lang/Exception
      LineNumberTable:
        line 101: 0
        line 104: 2
        line 105: 6
        line 106: 14
        line 107: 22
        line 108: 27
        line 110: 32
        line 112: 44
        line 117: 49
        line 114: 52
        line 116: 53
        line 118: 73
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            6      43     2   dbf   Ljavax/xml/parsers/DocumentBuilderFactory;
           53      20     2     e   Ljava/lang/Exception;
            0      75     0  this   Lext/mods/gameserver/data/DocumentBase;
            2      73     1   doc   Lorg/w3c/dom/Document;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/data/DocumentBase, class org/w3c/dom/Document ]
          stack = [ class java/lang/Exception ]
        frame_type = 20 /* same */

  protected abstract void parseDocument(org.w3c.dom.Document);
    descriptor: (Lorg/w3c/dom/Document;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract ext.mods.commons.data.StatSet getStatSet();
    descriptor: ()Lext/mods/commons/data/StatSet;
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract java.lang.String getTableValue(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract java.lang.String getTableValue(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)Ljava/lang/String;
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected void resetTable();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: new           #13                 // class java/util/HashMap
         4: dup
         5: invokespecial #15                 // Method java/util/HashMap."<init>":()V
         8: putfield      #16                 // Field _tables:Ljava/util/Map;
        11: return
      LineNumberTable:
        line 131: 0
        line 132: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/data/DocumentBase;

  protected void setTable(java.lang.String, java.lang.String[]);
    descriptor: (Ljava/lang/String;[Ljava/lang/String;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #16                 // Field _tables:Ljava/util/Map;
         4: aload_1
         5: aload_2
         6: invokeinterface #73,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        11: pop
        12: return
      LineNumberTable:
        line 136: 0
        line 137: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/data/DocumentBase;
            0      13     1  name   Ljava/lang/String;
            0      13     2 table   [Ljava/lang/String;

  protected void parseTemplate(org.w3c.dom.Node, java.lang.Object);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Object;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=7, args_size=3
         0: aload_1
         1: invokeinterface #79,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
         6: astore_1
         7: aload_1
         8: ifnonnull     12
        11: return
        12: aconst_null
        13: astore_3
        14: ldc           #85                 // String cond
        16: aload_1
        17: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        22: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        25: ifeq          176
        28: aload_0
        29: aload_1
        30: invokeinterface #79,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
        35: aload_2
        36: invokevirtual #97                 // Method parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
        39: astore_3
        40: aload_1
        41: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
        46: ldc           #105                // String msg
        48: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        53: astore        4
        55: aload_1
        56: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
        61: ldc           #113                // String msgId
        63: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        68: astore        5
        70: aload_3
        71: ifnull        93
        74: aload         4
        76: ifnull        93
        79: aload_3
        80: aload         4
        82: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        87: invokevirtual #118                // Method ext/mods/gameserver/skills/conditions/Condition.setMessage:(Ljava/lang/String;)V
        90: goto          169
        93: aload_3
        94: ifnull        169
        97: aload         5
        99: ifnull        169
       102: aload_3
       103: aload_0
       104: aload         5
       106: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       111: aconst_null
       112: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       115: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       118: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       121: invokevirtual #138                // Method ext/mods/gameserver/skills/conditions/Condition.setMessageId:(I)V
       124: aload_1
       125: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
       130: ldc           #142                // String addName
       132: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       137: astore        6
       139: aload         6
       141: ifnull        169
       144: aload_0
       145: aload         5
       147: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       152: aconst_null
       153: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       156: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       159: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       162: ifle          169
       165: aload_3
       166: invokevirtual #144                // Method ext/mods/gameserver/skills/conditions/Condition.addName:()V
       169: aload_1
       170: invokeinterface #146,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       175: astore_1
       176: aload_1
       177: ifnull        488
       180: ldc           #149                // String add
       182: aload_1
       183: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       188: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       191: ifeq          206
       194: aload_0
       195: aload_1
       196: aload_2
       197: ldc           #151                // String Add
       199: aload_3
       200: invokevirtual #153                // Method attachFunc:(Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
       203: goto          478
       206: ldc           #157                // String addMul
       208: aload_1
       209: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       214: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       217: ifeq          232
       220: aload_0
       221: aload_1
       222: aload_2
       223: ldc           #159                // String AddMul
       225: aload_3
       226: invokevirtual #153                // Method attachFunc:(Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
       229: goto          478
       232: ldc           #161                // String sub
       234: aload_1
       235: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       240: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       243: ifeq          258
       246: aload_0
       247: aload_1
       248: aload_2
       249: ldc           #163                // String Sub
       251: aload_3
       252: invokevirtual #153                // Method attachFunc:(Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
       255: goto          478
       258: ldc           #165                // String subDiv
       260: aload_1
       261: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       266: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       269: ifeq          284
       272: aload_0
       273: aload_1
       274: aload_2
       275: ldc           #167                // String SubDiv
       277: aload_3
       278: invokevirtual #153                // Method attachFunc:(Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
       281: goto          478
       284: ldc           #169                // String mul
       286: aload_1
       287: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       292: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       295: ifeq          310
       298: aload_0
       299: aload_1
       300: aload_2
       301: ldc           #171                // String Mul
       303: aload_3
       304: invokevirtual #153                // Method attachFunc:(Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
       307: goto          478
       310: ldc           #173                // String basemul
       312: aload_1
       313: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       318: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       321: ifeq          336
       324: aload_0
       325: aload_1
       326: aload_2
       327: ldc           #175                // String BaseMul
       329: aload_3
       330: invokevirtual #153                // Method attachFunc:(Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
       333: goto          478
       336: ldc           #177                // String div
       338: aload_1
       339: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       344: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       347: ifeq          362
       350: aload_0
       351: aload_1
       352: aload_2
       353: ldc           #179                // String Div
       355: aload_3
       356: invokevirtual #153                // Method attachFunc:(Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
       359: goto          478
       362: ldc           #181                // String set
       364: aload_1
       365: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       370: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       373: ifeq          388
       376: aload_0
       377: aload_1
       378: aload_2
       379: ldc           #183                // String Set
       381: aload_3
       382: invokevirtual #153                // Method attachFunc:(Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
       385: goto          478
       388: ldc           #185                // String enchant
       390: aload_1
       391: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       396: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       399: ifeq          414
       402: aload_0
       403: aload_1
       404: aload_2
       405: ldc           #187                // String Enchant
       407: aload_3
       408: invokevirtual #153                // Method attachFunc:(Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
       411: goto          478
       414: ldc           #189                // String baseadd
       416: aload_1
       417: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       422: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       425: ifeq          440
       428: aload_0
       429: aload_1
       430: aload_2
       431: ldc           #191                // String BaseAdd
       433: aload_3
       434: invokevirtual #153                // Method attachFunc:(Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
       437: goto          478
       440: ldc           #193                // String effect
       442: aload_1
       443: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       448: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       451: ifeq          478
       454: aload_2
       455: instanceof    #195                // class ext/mods/gameserver/skills/effects/EffectTemplate
       458: ifeq          471
       461: new           #197                // class java/lang/RuntimeException
       464: dup
       465: ldc           #199                // String Nested effects
       467: invokespecial #201                // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
       470: athrow
       471: aload_0
       472: aload_1
       473: aload_2
       474: aload_3
       475: invokevirtual #203                // Method attachEffect:(Lorg/w3c/dom/Node;Ljava/lang/Object;Lext/mods/gameserver/skills/conditions/Condition;)V
       478: aload_1
       479: invokeinterface #146,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       484: astore_1
       485: goto          176
       488: return
      LineNumberTable:
        line 141: 0
        line 142: 7
        line 143: 11
        line 145: 12
        line 146: 14
        line 148: 28
        line 149: 40
        line 150: 55
        line 151: 70
        line 152: 79
        line 153: 93
        line 155: 102
        line 156: 124
        line 157: 139
        line 158: 165
        line 160: 169
        line 163: 176
        line 165: 180
        line 166: 194
        line 167: 206
        line 168: 220
        line 169: 232
        line 170: 246
        line 171: 258
        line 172: 272
        line 173: 284
        line 174: 298
        line 175: 310
        line 176: 324
        line 177: 336
        line 178: 350
        line 179: 362
        line 180: 376
        line 181: 388
        line 182: 402
        line 183: 414
        line 184: 428
        line 185: 440
        line 187: 454
        line 188: 461
        line 190: 471
        line 163: 478
        line 193: 488
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          139      30     6 addName   Lorg/w3c/dom/Node;
           55     121     4   msg   Lorg/w3c/dom/Node;
           70     106     5 msgId   Lorg/w3c/dom/Node;
            0     489     0  this   Lext/mods/gameserver/data/DocumentBase;
            0     489     1     n   Lorg/w3c/dom/Node;
            0     489     2 template   Ljava/lang/Object;
           14     475     3 condition   Lext/mods/gameserver/skills/conditions/Condition;
      StackMapTable: number_of_entries = 17
        frame_type = 12 /* same */
        frame_type = 254 /* append */
          offset_delta = 80
          locals = [ class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/Node, class org/w3c/dom/Node ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 75
        frame_type = 249 /* chop */
          offset_delta = 6
        frame_type = 29 /* same */
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 30 /* same */
        frame_type = 6 /* same */
        frame_type = 9 /* same */

  protected void attachFunc(org.w3c.dom.Node, java.lang.Object, java.lang.String, ext.mods.gameserver.skills.conditions.Condition);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Object;Ljava/lang/String;Lext/mods/gameserver/skills/conditions/Condition;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=8, locals=14, args_size=5
         0: aload_1
         1: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         6: ldc           #207                // String stat
         8: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        13: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        18: invokestatic  #209                // Method ext/mods/gameserver/enums/skills/Stats.valueOfXml:(Ljava/lang/String;)Lext/mods/gameserver/enums/skills/Stats;
        21: astore        5
        23: aload_1
        24: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
        29: ldc           #215                // String val
        31: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        36: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        41: astore        6
        43: aload         6
        45: iconst_0
        46: invokevirtual #217                // Method java/lang/String.charAt:(I)C
        49: bipush        35
        51: if_icmpne     68
        54: aload_0
        55: aload         6
        57: invokevirtual #221                // Method getTableValue:(Ljava/lang/String;)Ljava/lang/String;
        60: invokestatic  #225                // Method java/lang/Double.parseDouble:(Ljava/lang/String;)D
        63: dstore        7
        65: goto          75
        68: aload         6
        70: invokestatic  #225                // Method java/lang/Double.parseDouble:(Ljava/lang/String;)D
        73: dstore        7
        75: aload_0
        76: aload_1
        77: invokeinterface #79,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
        82: aload_2
        83: invokevirtual #97                 // Method parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
        86: astore        9
        88: new           #231                // class ext/mods/gameserver/skills/basefuncs/FuncTemplate
        91: dup
        92: aload         4
        94: aload         9
        96: aload_3
        97: aload         5
        99: dload         7
       101: invokespecial #233                // Method ext/mods/gameserver/skills/basefuncs/FuncTemplate."<init>":(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;Ljava/lang/String;Lext/mods/gameserver/enums/skills/Stats;D)V
       104: astore        10
       106: aload_2
       107: instanceof    #236                // class ext/mods/gameserver/model/item/kind/Item
       110: ifeq          129
       113: aload_2
       114: checkcast     #236                // class ext/mods/gameserver/model/item/kind/Item
       117: astore        12
       119: aload         12
       121: aload         10
       123: invokevirtual #238                // Method ext/mods/gameserver/model/item/kind/Item.attach:(Lext/mods/gameserver/skills/basefuncs/FuncTemplate;)V
       126: goto          185
       129: aload_2
       130: instanceof    #242                // class ext/mods/gameserver/skills/L2Skill
       133: ifeq          152
       136: aload_2
       137: checkcast     #242                // class ext/mods/gameserver/skills/L2Skill
       140: astore        13
       142: aload         13
       144: aload         10
       146: invokevirtual #244                // Method ext/mods/gameserver/skills/L2Skill.attach:(Lext/mods/gameserver/skills/basefuncs/FuncTemplate;)V
       149: goto          185
       152: aload_2
       153: instanceof    #195                // class ext/mods/gameserver/skills/effects/EffectTemplate
       156: ifeq          175
       159: aload_2
       160: checkcast     #195                // class ext/mods/gameserver/skills/effects/EffectTemplate
       163: astore        11
       165: aload         11
       167: aload         10
       169: invokevirtual #245                // Method ext/mods/gameserver/skills/effects/EffectTemplate.attach:(Lext/mods/gameserver/skills/basefuncs/FuncTemplate;)V
       172: goto          185
       175: new           #197                // class java/lang/RuntimeException
       178: dup
       179: ldc           #246                // String Attaching stat to a non-effect template!!!
       181: invokespecial #201                // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
       184: athrow
       185: return
      LineNumberTable:
        line 197: 0
        line 199: 23
        line 201: 43
        line 202: 54
        line 204: 68
        line 206: 75
        line 207: 88
        line 209: 106
        line 210: 119
        line 211: 129
        line 212: 142
        line 213: 152
        line 214: 165
        line 216: 175
        line 217: 185
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           65       3     7 value   D
          119      10    12  item   Lext/mods/gameserver/model/item/kind/Item;
          142      10    13 skill   Lext/mods/gameserver/skills/L2Skill;
          165      10    11 effect   Lext/mods/gameserver/skills/effects/EffectTemplate;
            0     186     0  this   Lext/mods/gameserver/data/DocumentBase;
            0     186     1     n   Lorg/w3c/dom/Node;
            0     186     2 template   Ljava/lang/Object;
            0     186     3 function   Ljava/lang/String;
            0     186     4 attachCond   Lext/mods/gameserver/skills/conditions/Condition;
           23     163     5  stat   Lext/mods/gameserver/enums/skills/Stats;
           43     143     6 valueString   Ljava/lang/String;
           75     111     7 value   D
           88      98     9 applyCond   Lext/mods/gameserver/skills/conditions/Condition;
          106      80    10    ft   Lext/mods/gameserver/skills/basefuncs/FuncTemplate;
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/enums/skills/Stats, class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ double ]
        frame_type = 253 /* append */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/skills/conditions/Condition, class ext/mods/gameserver/skills/basefuncs/FuncTemplate ]
        frame_type = 22 /* same */
        frame_type = 22 /* same */
        frame_type = 9 /* same */

  protected void attachEffect(org.w3c.dom.Node, java.lang.Object, ext.mods.gameserver.skills.conditions.Condition);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Object;Lext/mods/gameserver/skills/conditions/Condition;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=18, locals=27, args_size=4
         0: aload_1
         1: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         6: astore        4
         8: aload_0
         9: aload         4
        11: ldc           #248                // String name
        13: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        18: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        23: invokevirtual #250                // Method java/lang/String.intern:()Ljava/lang/String;
        26: aload_2
        27: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        30: astore        5
        32: iconst_1
        33: istore        6
        35: iconst_1
        36: istore        7
        38: aload         4
        40: ldc           #253                // String count
        42: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        47: ifnull        77
        50: aload_0
        51: aload         4
        53: ldc           #253                // String count
        55: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        60: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        65: aload_2
        66: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        69: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
        72: invokevirtual #134                // Method java/lang/Integer.intValue:()I
        75: istore        7
        77: aload         4
        79: ldc           #255                // String time
        81: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        86: ifnull        116
        89: aload_0
        90: aload         4
        92: ldc           #255                // String time
        94: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        99: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       104: aload_2
       105: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       108: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       111: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       114: istore        6
       116: getstatic     #257                // Field ext/mods/Config.ENABLE_MODIFY_SKILL_DURATION:Z
       119: ifeq          272
       122: getstatic     #263                // Field ext/mods/Config.SKILL_DURATION_LIST:Ljava/util/HashMap;
       125: aload_2
       126: checkcast     #242                // class ext/mods/gameserver/skills/L2Skill
       129: invokevirtual #267                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       132: invokestatic  #270                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       135: invokevirtual #274                // Method java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
       138: ifeq          272
       141: aload_2
       142: checkcast     #242                // class ext/mods/gameserver/skills/L2Skill
       145: invokevirtual #278                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       148: bipush        100
       150: if_icmpge     180
       153: getstatic     #263                // Field ext/mods/Config.SKILL_DURATION_LIST:Ljava/util/HashMap;
       156: aload_2
       157: checkcast     #242                // class ext/mods/gameserver/skills/L2Skill
       160: invokevirtual #267                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       163: invokestatic  #270                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       166: invokevirtual #281                // Method java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
       169: checkcast     #129                // class java/lang/Integer
       172: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       175: istore        6
       177: goto          272
       180: aload_2
       181: checkcast     #242                // class ext/mods/gameserver/skills/L2Skill
       184: invokevirtual #278                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       187: bipush        100
       189: if_icmplt     235
       192: aload_2
       193: checkcast     #242                // class ext/mods/gameserver/skills/L2Skill
       196: invokevirtual #278                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       199: sipush        140
       202: if_icmpge     235
       205: iload         6
       207: getstatic     #263                // Field ext/mods/Config.SKILL_DURATION_LIST:Ljava/util/HashMap;
       210: aload_2
       211: checkcast     #242                // class ext/mods/gameserver/skills/L2Skill
       214: invokevirtual #267                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       217: invokestatic  #270                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       220: invokevirtual #281                // Method java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
       223: checkcast     #129                // class java/lang/Integer
       226: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       229: iadd
       230: istore        6
       232: goto          272
       235: aload_2
       236: checkcast     #242                // class ext/mods/gameserver/skills/L2Skill
       239: invokevirtual #278                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       242: sipush        140
       245: if_icmple     272
       248: getstatic     #263                // Field ext/mods/Config.SKILL_DURATION_LIST:Ljava/util/HashMap;
       251: aload_2
       252: checkcast     #242                // class ext/mods/gameserver/skills/L2Skill
       255: invokevirtual #267                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       258: invokestatic  #270                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       261: invokevirtual #281                // Method java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
       264: checkcast     #129                // class java/lang/Integer
       267: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       270: istore        6
       272: iconst_0
       273: istore        8
       275: aload         4
       277: ldc_w         #285                // String self
       280: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       285: ifnull        321
       288: aload_0
       289: aload         4
       291: ldc_w         #285                // String self
       294: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       299: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       304: aload_2
       305: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       308: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       311: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       314: iconst_1
       315: if_icmpne     321
       318: iconst_1
       319: istore        8
       321: iconst_1
       322: istore        9
       324: aload         4
       326: ldc_w         #287                // String noicon
       329: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       334: ifnull        370
       337: aload_0
       338: aload         4
       340: ldc_w         #287                // String noicon
       343: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       348: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       353: aload_2
       354: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       357: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       360: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       363: iconst_1
       364: if_icmpne     370
       367: iconst_0
       368: istore        9
       370: aload_1
       371: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
       376: ldc           #215                // String val
       378: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       383: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       388: astore        10
       390: aload         10
       392: iconst_0
       393: invokevirtual #217                // Method java/lang/String.charAt:(I)C
       396: bipush        35
       398: if_icmpne     415
       401: aload_0
       402: aload         10
       404: invokevirtual #221                // Method getTableValue:(Ljava/lang/String;)Ljava/lang/String;
       407: invokestatic  #225                // Method java/lang/Double.parseDouble:(Ljava/lang/String;)D
       410: dstore        11
       412: goto          422
       415: aload         10
       417: invokestatic  #225                // Method java/lang/Double.parseDouble:(Ljava/lang/String;)D
       420: dstore        11
       422: getstatic     #289                // Field ext/mods/gameserver/enums/skills/AbnormalEffect.NULL:Lext/mods/gameserver/enums/skills/AbnormalEffect;
       425: astore        13
       427: aload         4
       429: ldc_w         #295                // String abnormal
       432: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       437: ifnull        489
       440: aload         4
       442: ldc_w         #295                // String abnormal
       445: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       450: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       455: astore        14
       457: aload         14
       459: iconst_0
       460: invokevirtual #217                // Method java/lang/String.charAt:(I)C
       463: bipush        35
       465: if_icmpne     482
       468: aload_0
       469: aload         14
       471: invokevirtual #221                // Method getTableValue:(Ljava/lang/String;)Ljava/lang/String;
       474: invokestatic  #297                // Method ext/mods/gameserver/enums/skills/AbnormalEffect.getByName:(Ljava/lang/String;)Lext/mods/gameserver/enums/skills/AbnormalEffect;
       477: astore        13
       479: goto          489
       482: aload         14
       484: invokestatic  #297                // Method ext/mods/gameserver/enums/skills/AbnormalEffect.getByName:(Ljava/lang/String;)Lext/mods/gameserver/enums/skills/AbnormalEffect;
       487: astore        13
       489: ldc_w         #301                // String none
       492: astore        14
       494: aload         4
       496: ldc_w         #303                // String stackType
       499: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       504: ifnull        524
       507: aload         4
       509: ldc_w         #303                // String stackType
       512: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       517: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       522: astore        14
       524: fconst_0
       525: fstore        15
       527: aload         4
       529: ldc_w         #305                // String stackOrder
       532: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       537: ifnull        565
       540: aload_0
       541: aload         4
       543: ldc_w         #305                // String stackOrder
       546: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       551: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       556: aload_2
       557: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       560: invokestatic  #307                // Method java/lang/Float.parseFloat:(Ljava/lang/String;)F
       563: fstore        15
       565: ldc2_w        #313                // double -1.0d
       568: dstore        16
       570: aload         4
       572: ldc_w         #315                // String effectPower
       575: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       580: ifnull        608
       583: aload_0
       584: aload         4
       586: ldc_w         #315                // String effectPower
       589: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       594: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       599: aload_2
       600: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       603: invokestatic  #225                // Method java/lang/Double.parseDouble:(Ljava/lang/String;)D
       606: dstore        16
       608: aconst_null
       609: astore        18
       611: aload         4
       613: ldc_w         #317                // String effectType
       616: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       621: ifnull        679
       624: aload_0
       625: aload         4
       627: ldc_w         #317                // String effectType
       630: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       635: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       640: aload_2
       641: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       644: astore        19
       646: ldc_w         #319                // class ext/mods/gameserver/enums/skills/SkillType
       649: aload         19
       651: invokestatic  #321                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       654: checkcast     #319                // class ext/mods/gameserver/enums/skills/SkillType
       657: astore        18
       659: goto          679
       662: astore        20
       664: new           #326                // class java/lang/IllegalArgumentException
       667: dup
       668: aload         19
       670: invokedynamic #328,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       675: invokespecial #331                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
       678: athrow
       679: aload         5
       681: ldc_w         #332                // class ext/mods/gameserver/skills/effects/EffectChanceSkillTrigger
       684: invokevirtual #334                // Method java/lang/Class.getName:()Ljava/lang/String;
       687: if_acmpne     694
       690: iconst_1
       691: goto          695
       694: iconst_0
       695: istore        20
       697: iconst_0
       698: istore        21
       700: aload         4
       702: ldc_w         #339                // String triggeredId
       705: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       710: ifnull        741
       713: aload_0
       714: aload         4
       716: ldc_w         #339                // String triggeredId
       719: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       724: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       729: aload_2
       730: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       733: invokestatic  #341                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       736: istore        21
       738: goto          761
       741: iload         20
       743: ifeq          761
       746: new           #345                // class java/util/NoSuchElementException
       749: dup
       750: aload         5
       752: invokedynamic #347,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       757: invokespecial #348                // Method java/util/NoSuchElementException."<init>":(Ljava/lang/String;)V
       760: athrow
       761: iconst_1
       762: istore        22
       764: aload         4
       766: ldc_w         #349                // String triggeredLevel
       769: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       774: ifnull        802
       777: aload_0
       778: aload         4
       780: ldc_w         #349                // String triggeredLevel
       783: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       788: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       793: aload_2
       794: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       797: invokestatic  #341                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       800: istore        22
       802: aconst_null
       803: astore        23
       805: aload         4
       807: ldc_w         #351                // String chanceType
       810: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       815: ifnull        843
       818: aload_0
       819: aload         4
       821: ldc_w         #351                // String chanceType
       824: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       829: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       834: aload_2
       835: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       838: astore        23
       840: goto          863
       843: iload         20
       845: ifeq          863
       848: new           #345                // class java/util/NoSuchElementException
       851: dup
       852: aload         5
       854: invokedynamic #353,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       859: invokespecial #348                // Method java/util/NoSuchElementException."<init>":(Ljava/lang/String;)V
       862: athrow
       863: iconst_m1
       864: istore        24
       866: aload         4
       868: ldc_w         #354                // String activationChance
       871: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       876: ifnull        904
       879: aload_0
       880: aload         4
       882: ldc_w         #354                // String activationChance
       885: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       890: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       895: aload_2
       896: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       899: invokestatic  #341                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       902: istore        24
       904: aload         23
       906: iload         24
       908: invokestatic  #356                // Method ext/mods/gameserver/skills/ChanceCondition.parse:(Ljava/lang/String;I)Lext/mods/gameserver/skills/ChanceCondition;
       911: astore        25
       913: aload         25
       915: ifnonnull     940
       918: iload         20
       920: ifeq          940
       923: new           #345                // class java/util/NoSuchElementException
       926: dup
       927: aload         23
       929: iload         24
       931: invokedynamic #361,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       936: invokespecial #348                // Method java/util/NoSuchElementException."<init>":(Ljava/lang/String;)V
       939: athrow
       940: new           #195                // class ext/mods/gameserver/skills/effects/EffectTemplate
       943: dup
       944: aload_3
       945: aload         5
       947: dload         11
       949: iload         7
       951: iload         6
       953: aload         13
       955: aload         14
       957: fload         15
       959: iload         9
       961: dload         16
       963: aload         18
       965: iload         21
       967: iload         22
       969: aload         25
       971: invokespecial #364                // Method ext/mods/gameserver/skills/effects/EffectTemplate."<init>":(Lext/mods/gameserver/skills/conditions/Condition;Ljava/lang/String;DIILext/mods/gameserver/enums/skills/AbnormalEffect;Ljava/lang/String;FZDLext/mods/gameserver/enums/skills/SkillType;IILext/mods/gameserver/skills/ChanceCondition;)V
       974: astore        19
       976: aload_0
       977: aload_1
       978: aload         19
       980: invokevirtual #367                // Method parseTemplate:(Lorg/w3c/dom/Node;Ljava/lang/Object;)V
       983: aload_2
       984: instanceof    #242                // class ext/mods/gameserver/skills/L2Skill
       987: ifeq          1018
       990: aload_2
       991: checkcast     #242                // class ext/mods/gameserver/skills/L2Skill
       994: astore        26
       996: iload         8
       998: ifeq          1011
      1001: aload         26
      1003: aload         19
      1005: invokevirtual #371                // Method ext/mods/gameserver/skills/L2Skill.attachSelf:(Lext/mods/gameserver/skills/effects/EffectTemplate;)V
      1008: goto          1018
      1011: aload         26
      1013: aload         19
      1015: invokevirtual #375                // Method ext/mods/gameserver/skills/L2Skill.attach:(Lext/mods/gameserver/skills/effects/EffectTemplate;)V
      1018: return
      Exception table:
         from    to  target type
           646   659   662   Class java/lang/Exception
      LineNumberTable:
        line 221: 0
        line 222: 8
        line 224: 32
        line 225: 35
        line 227: 38
        line 228: 50
        line 230: 77
        line 231: 89
        line 232: 116
        line 234: 122
        line 236: 141
        line 238: 153
        line 240: 180
        line 242: 205
        line 244: 235
        line 246: 248
        line 252: 272
        line 253: 275
        line 254: 318
        line 256: 321
        line 257: 324
        line 258: 367
        line 260: 370
        line 262: 390
        line 263: 401
        line 265: 415
        line 267: 422
        line 268: 427
        line 270: 440
        line 272: 457
        line 273: 468
        line 275: 482
        line 278: 489
        line 279: 494
        line 280: 507
        line 282: 524
        line 283: 527
        line 284: 540
        line 286: 565
        line 287: 570
        line 288: 583
        line 290: 608
        line 291: 611
        line 293: 624
        line 297: 646
        line 302: 659
        line 299: 662
        line 301: 664
        line 307: 679
        line 308: 697
        line 309: 700
        line 310: 713
        line 311: 741
        line 312: 746
        line 314: 761
        line 315: 764
        line 316: 777
        line 318: 802
        line 319: 805
        line 320: 818
        line 321: 843
        line 322: 848
        line 324: 863
        line 325: 866
        line 326: 879
        line 328: 904
        line 330: 913
        line 331: 923
        line 333: 940
        line 335: 976
        line 336: 983
        line 338: 996
        line 339: 1001
        line 341: 1011
        line 343: 1018
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          412       3    11 value   D
          457      32    14   abn   Ljava/lang/String;
          664      15    20     e   Ljava/lang/Exception;
          646      33    19 typeName   Ljava/lang/String;
          996      22    26 skill   Lext/mods/gameserver/skills/L2Skill;
            0    1019     0  this   Lext/mods/gameserver/data/DocumentBase;
            0    1019     1     n   Lorg/w3c/dom/Node;
            0    1019     2 template   Ljava/lang/Object;
            0    1019     3 attachCond   Lext/mods/gameserver/skills/conditions/Condition;
            8    1011     4 attrs   Lorg/w3c/dom/NamedNodeMap;
           32     987     5  name   Ljava/lang/String;
           35     984     6  time   I
           38     981     7 count   I
          275     744     8  self   Z
          324     695     9  icon   Z
          390     629    10 valueString   Ljava/lang/String;
          422     597    11 value   D
          427     592    13 abnormal   Lext/mods/gameserver/enums/skills/AbnormalEffect;
          494     525    14 stackType   Ljava/lang/String;
          527     492    15 stackOrder   F
          570     449    16 effectPower   D
          611     408    18  type   Lext/mods/gameserver/enums/skills/SkillType;
          976      43    19    lt   Lext/mods/gameserver/skills/effects/EffectTemplate;
          697     322    20 isChanceSkillTrigger   Z
          700     319    21 trigId   I
          764     255    22 trigLvl   I
          805     214    23 chanceCond   Ljava/lang/String;
          866     153    24 activationChance   I
          913     106    25 chance   Lext/mods/gameserver/skills/ChanceCondition;
      StackMapTable: number_of_entries = 27
        frame_type = 255 /* full_frame */
          offset_delta = 77
          locals = [ class ext/mods/gameserver/data/DocumentBase, class org/w3c/dom/Node, class java/lang/Object, class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/NamedNodeMap, class java/lang/String, int, int ]
          stack = []
        frame_type = 38 /* same */
        frame_type = 63 /* same */
        frame_type = 54 /* same */
        frame_type = 36 /* same */
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ double ]
        frame_type = 253 /* append */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/enums/skills/AbnormalEffect, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ float ]
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ double ]
        frame_type = 255 /* full_frame */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/data/DocumentBase, class org/w3c/dom/Node, class java/lang/Object, class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/NamedNodeMap, class java/lang/String, int, int, int, int, class java/lang/String, double, class ext/mods/gameserver/enums/skills/AbnormalEffect, class java/lang/String, float, double, class ext/mods/gameserver/enums/skills/SkillType, class java/lang/String ]
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 16
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 254 /* append */
          offset_delta = 45
          locals = [ top, int, int ]
        frame_type = 19 /* same */
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class java/lang/String ]
        frame_type = 19 /* same */
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/skills/ChanceCondition ]
        frame_type = 255 /* full_frame */
          offset_delta = 70
          locals = [ class ext/mods/gameserver/data/DocumentBase, class org/w3c/dom/Node, class java/lang/Object, class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/NamedNodeMap, class java/lang/String, int, int, int, int, class java/lang/String, double, class ext/mods/gameserver/enums/skills/AbnormalEffect, class java/lang/String, float, double, class ext/mods/gameserver/enums/skills/SkillType, class ext/mods/gameserver/skills/effects/EffectTemplate, int, int, int, class java/lang/String, int, class ext/mods/gameserver/skills/ChanceCondition, class ext/mods/gameserver/skills/L2Skill ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 6

  protected ext.mods.gameserver.skills.conditions.Condition parseCondition(org.w3c.dom.Node, java.lang.Object);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ifnull        24
         4: aload_1
         5: invokeinterface #377,  1          // InterfaceMethod org/w3c/dom/Node.getNodeType:()S
        10: iconst_1
        11: if_icmpeq     24
        14: aload_1
        15: invokeinterface #146,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
        20: astore_1
        21: goto          0
        24: aload_1
        25: ifnonnull     30
        28: aconst_null
        29: areturn
        30: ldc_w         #381                // String and
        33: aload_1
        34: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        39: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        42: ifeq          52
        45: aload_0
        46: aload_1
        47: aload_2
        48: invokevirtual #383                // Method parseLogicAnd:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
        51: areturn
        52: ldc_w         #386                // String or
        55: aload_1
        56: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        61: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        64: ifeq          74
        67: aload_0
        68: aload_1
        69: aload_2
        70: invokevirtual #388                // Method parseLogicOr:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
        73: areturn
        74: ldc_w         #391                // String not
        77: aload_1
        78: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        83: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        86: ifeq          96
        89: aload_0
        90: aload_1
        91: aload_2
        92: invokevirtual #393                // Method parseLogicNot:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
        95: areturn
        96: ldc_w         #396                // String player
        99: aload_1
       100: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       105: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       108: ifeq          118
       111: aload_0
       112: aload_1
       113: aload_2
       114: invokevirtual #398                // Method parsePlayerCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
       117: areturn
       118: ldc_w         #401                // String target
       121: aload_1
       122: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       127: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       130: ifeq          140
       133: aload_0
       134: aload_1
       135: aload_2
       136: invokevirtual #403                // Method parseTargetCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
       139: areturn
       140: ldc_w         #406                // String skill
       143: aload_1
       144: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       149: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       152: ifeq          161
       155: aload_0
       156: aload_1
       157: invokevirtual #408                // Method parseSkillCondition:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/skills/conditions/Condition;
       160: areturn
       161: ldc_w         #412                // String using
       164: aload_1
       165: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       170: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       173: ifeq          182
       176: aload_0
       177: aload_1
       178: invokevirtual #414                // Method parseUsingCondition:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/skills/conditions/Condition;
       181: areturn
       182: ldc_w         #417                // String game
       185: aload_1
       186: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       191: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       194: ifeq          203
       197: aload_0
       198: aload_1
       199: invokevirtual #419                // Method parseGameCondition:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/skills/conditions/Condition;
       202: areturn
       203: aconst_null
       204: areturn
      LineNumberTable:
        line 347: 0
        line 348: 14
        line 350: 24
        line 351: 28
        line 353: 30
        line 354: 45
        line 356: 52
        line 357: 67
        line 359: 74
        line 360: 89
        line 362: 96
        line 363: 111
        line 365: 118
        line 366: 133
        line 368: 140
        line 369: 155
        line 371: 161
        line 372: 176
        line 374: 182
        line 375: 197
        line 377: 203
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     205     0  this   Lext/mods/gameserver/data/DocumentBase;
            0     205     1     n   Lorg/w3c/dom/Node;
            0     205     2 template   Ljava/lang/Object;
      StackMapTable: number_of_entries = 11
        frame_type = 0 /* same */
        frame_type = 23 /* same */
        frame_type = 5 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 20 /* same */
        frame_type = 20 /* same */
        frame_type = 20 /* same */

  protected ext.mods.gameserver.skills.conditions.Condition parseLogicAnd(org.w3c.dom.Node, java.lang.Object);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=4, args_size=3
         0: new           #422                // class ext/mods/gameserver/skills/conditions/ConditionLogicAnd
         3: dup
         4: invokespecial #424                // Method ext/mods/gameserver/skills/conditions/ConditionLogicAnd."<init>":()V
         7: astore_3
         8: aload_1
         9: invokeinterface #79,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
        14: astore_1
        15: aload_1
        16: ifnull        49
        19: aload_1
        20: invokeinterface #377,  1          // InterfaceMethod org/w3c/dom/Node.getNodeType:()S
        25: iconst_1
        26: if_icmpne     39
        29: aload_3
        30: aload_0
        31: aload_1
        32: aload_2
        33: invokevirtual #97                 // Method parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
        36: invokevirtual #425                // Method ext/mods/gameserver/skills/conditions/ConditionLogicAnd.add:(Lext/mods/gameserver/skills/conditions/Condition;)V
        39: aload_1
        40: invokeinterface #146,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
        45: astore_1
        46: goto          15
        49: aload_3
        50: getfield      #428                // Field ext/mods/gameserver/skills/conditions/ConditionLogicAnd.conditions:[Lext/mods/gameserver/skills/conditions/Condition;
        53: ifnull        64
        56: aload_3
        57: getfield      #428                // Field ext/mods/gameserver/skills/conditions/ConditionLogicAnd.conditions:[Lext/mods/gameserver/skills/conditions/Condition;
        60: arraylength
        61: ifne          84
        64: getstatic     #61                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        67: ldc_w         #432                // String Empty <and> condition in {}.
        70: iconst_1
        71: anewarray     #2                  // class java/lang/Object
        74: dup
        75: iconst_0
        76: aload_0
        77: getfield      #7                  // Field _file:Ljava/io/File;
        80: aastore
        81: invokevirtual #434                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
        84: aload_3
        85: areturn
      LineNumberTable:
        line 382: 0
        line 383: 8
        line 384: 19
        line 385: 29
        line 383: 39
        line 387: 49
        line 388: 64
        line 390: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      86     0  this   Lext/mods/gameserver/data/DocumentBase;
            0      86     1     n   Lorg/w3c/dom/Node;
            0      86     2 template   Ljava/lang/Object;
            8      78     3  cond   Lext/mods/gameserver/skills/conditions/ConditionLogicAnd;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/skills/conditions/ConditionLogicAnd ]
        frame_type = 23 /* same */
        frame_type = 9 /* same */
        frame_type = 14 /* same */
        frame_type = 19 /* same */

  protected ext.mods.gameserver.skills.conditions.Condition parseLogicOr(org.w3c.dom.Node, java.lang.Object);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=4, args_size=3
         0: new           #437                // class ext/mods/gameserver/skills/conditions/ConditionLogicOr
         3: dup
         4: invokespecial #439                // Method ext/mods/gameserver/skills/conditions/ConditionLogicOr."<init>":()V
         7: astore_3
         8: aload_1
         9: invokeinterface #79,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
        14: astore_1
        15: aload_1
        16: ifnull        49
        19: aload_1
        20: invokeinterface #377,  1          // InterfaceMethod org/w3c/dom/Node.getNodeType:()S
        25: iconst_1
        26: if_icmpne     39
        29: aload_3
        30: aload_0
        31: aload_1
        32: aload_2
        33: invokevirtual #97                 // Method parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
        36: invokevirtual #440                // Method ext/mods/gameserver/skills/conditions/ConditionLogicOr.add:(Lext/mods/gameserver/skills/conditions/Condition;)V
        39: aload_1
        40: invokeinterface #146,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
        45: astore_1
        46: goto          15
        49: aload_3
        50: getfield      #441                // Field ext/mods/gameserver/skills/conditions/ConditionLogicOr.conditions:[Lext/mods/gameserver/skills/conditions/Condition;
        53: ifnull        64
        56: aload_3
        57: getfield      #441                // Field ext/mods/gameserver/skills/conditions/ConditionLogicOr.conditions:[Lext/mods/gameserver/skills/conditions/Condition;
        60: arraylength
        61: ifne          84
        64: getstatic     #61                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        67: ldc_w         #442                // String Empty <or> condition in {}.
        70: iconst_1
        71: anewarray     #2                  // class java/lang/Object
        74: dup
        75: iconst_0
        76: aload_0
        77: getfield      #7                  // Field _file:Ljava/io/File;
        80: aastore
        81: invokevirtual #434                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
        84: aload_3
        85: areturn
      LineNumberTable:
        line 395: 0
        line 396: 8
        line 397: 19
        line 398: 29
        line 396: 39
        line 400: 49
        line 401: 64
        line 403: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      86     0  this   Lext/mods/gameserver/data/DocumentBase;
            0      86     1     n   Lorg/w3c/dom/Node;
            0      86     2 template   Ljava/lang/Object;
            8      78     3  cond   Lext/mods/gameserver/skills/conditions/ConditionLogicOr;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/skills/conditions/ConditionLogicOr ]
        frame_type = 23 /* same */
        frame_type = 9 /* same */
        frame_type = 14 /* same */
        frame_type = 19 /* same */

  protected ext.mods.gameserver.skills.conditions.Condition parseLogicNot(org.w3c.dom.Node, java.lang.Object);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=3, args_size=3
         0: aload_1
         1: invokeinterface #79,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
         6: astore_1
         7: aload_1
         8: ifnull        45
        11: aload_1
        12: invokeinterface #377,  1          // InterfaceMethod org/w3c/dom/Node.getNodeType:()S
        17: iconst_1
        18: if_icmpne     35
        21: new           #444                // class ext/mods/gameserver/skills/conditions/ConditionLogicNot
        24: dup
        25: aload_0
        26: aload_1
        27: aload_2
        28: invokevirtual #97                 // Method parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
        31: invokespecial #446                // Method ext/mods/gameserver/skills/conditions/ConditionLogicNot."<init>":(Lext/mods/gameserver/skills/conditions/Condition;)V
        34: areturn
        35: aload_1
        36: invokeinterface #146,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
        41: astore_1
        42: goto          7
        45: getstatic     #61                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        48: ldc_w         #448                // String Empty <not> condition in {}.
        51: iconst_1
        52: anewarray     #2                  // class java/lang/Object
        55: dup
        56: iconst_0
        57: aload_0
        58: getfield      #7                  // Field _file:Ljava/io/File;
        61: aastore
        62: invokevirtual #434                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
        65: aconst_null
        66: areturn
      LineNumberTable:
        line 408: 0
        line 409: 11
        line 410: 21
        line 408: 35
        line 412: 45
        line 413: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/data/DocumentBase;
            0      67     1     n   Lorg/w3c/dom/Node;
            0      67     2 template   Ljava/lang/Object;
      StackMapTable: number_of_entries = 3
        frame_type = 7 /* same */
        frame_type = 27 /* same */
        frame_type = 9 /* same */

  protected ext.mods.gameserver.skills.conditions.Condition parsePlayerCondition(org.w3c.dom.Node, java.lang.Object);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=10, locals=20, args_size=3
         0: aconst_null
         1: astore_3
         2: iconst_5
         3: newarray       int
         5: astore        4
         7: iconst_2
         8: newarray       byte
        10: astore        5
        12: aload_1
        13: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
        18: astore        6
        20: iconst_0
        21: istore        7
        23: iload         7
        25: aload         6
        27: invokeinterface #450,  1          // InterfaceMethod org/w3c/dom/NamedNodeMap.getLength:()I
        32: if_icmpge     2166
        35: aload         6
        37: iload         7
        39: invokeinterface #453,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.item:(I)Lorg/w3c/dom/Node;
        44: astore        8
        46: ldc_w         #457                // String race
        49: aload         8
        51: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        56: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        59: ifeq          92
        62: aload         8
        64: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        69: invokestatic  #459                // Method ext/mods/gameserver/enums/actors/ClassRace.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/actors/ClassRace;
        72: astore        9
        74: aload_0
        75: aload_3
        76: new           #464                // class ext/mods/gameserver/skills/conditions/ConditionPlayerRace
        79: dup
        80: aload         9
        82: invokespecial #466                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerRace."<init>":(Lext/mods/gameserver/enums/actors/ClassRace;)V
        85: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
        88: astore_3
        89: goto          2160
        92: ldc_w         #473                // String level
        95: aload         8
        97: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       102: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       105: ifeq          146
       108: aload_0
       109: aload         8
       111: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       116: aload_2
       117: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       120: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       123: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       126: istore        9
       128: aload_0
       129: aload_3
       130: new           #475                // class ext/mods/gameserver/skills/conditions/ConditionPlayerLevel
       133: dup
       134: iload         9
       136: invokespecial #477                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerLevel."<init>":(I)V
       139: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       142: astore_3
       143: goto          2160
       146: ldc_w         #479                // String resting
       149: aload         8
       151: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       156: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       159: ifeq          198
       162: aload         8
       164: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       169: invokestatic  #481                // Method java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
       172: invokevirtual #486                // Method java/lang/Boolean.booleanValue:()Z
       175: istore        9
       177: aload_0
       178: aload_3
       179: new           #490                // class ext/mods/gameserver/skills/conditions/ConditionPlayerState
       182: dup
       183: getstatic     #492                // Field ext/mods/gameserver/enums/skills/PlayerState.RESTING:Lext/mods/gameserver/enums/skills/PlayerState;
       186: iload         9
       188: invokespecial #498                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerState."<init>":(Lext/mods/gameserver/enums/skills/PlayerState;Z)V
       191: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       194: astore_3
       195: goto          2160
       198: ldc_w         #501                // String riding
       201: aload         8
       203: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       208: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       211: ifeq          250
       214: aload         8
       216: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       221: invokestatic  #481                // Method java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
       224: invokevirtual #486                // Method java/lang/Boolean.booleanValue:()Z
       227: istore        9
       229: aload_0
       230: aload_3
       231: new           #490                // class ext/mods/gameserver/skills/conditions/ConditionPlayerState
       234: dup
       235: getstatic     #503                // Field ext/mods/gameserver/enums/skills/PlayerState.RIDING:Lext/mods/gameserver/enums/skills/PlayerState;
       238: iload         9
       240: invokespecial #498                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerState."<init>":(Lext/mods/gameserver/enums/skills/PlayerState;Z)V
       243: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       246: astore_3
       247: goto          2160
       250: ldc_w         #506                // String flying
       253: aload         8
       255: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       260: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       263: ifeq          302
       266: aload         8
       268: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       273: invokestatic  #481                // Method java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
       276: invokevirtual #486                // Method java/lang/Boolean.booleanValue:()Z
       279: istore        9
       281: aload_0
       282: aload_3
       283: new           #490                // class ext/mods/gameserver/skills/conditions/ConditionPlayerState
       286: dup
       287: getstatic     #508                // Field ext/mods/gameserver/enums/skills/PlayerState.FLYING:Lext/mods/gameserver/enums/skills/PlayerState;
       290: iload         9
       292: invokespecial #498                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerState."<init>":(Lext/mods/gameserver/enums/skills/PlayerState;Z)V
       295: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       298: astore_3
       299: goto          2160
       302: ldc_w         #511                // String moving
       305: aload         8
       307: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       312: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       315: ifeq          354
       318: aload         8
       320: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       325: invokestatic  #481                // Method java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
       328: invokevirtual #486                // Method java/lang/Boolean.booleanValue:()Z
       331: istore        9
       333: aload_0
       334: aload_3
       335: new           #490                // class ext/mods/gameserver/skills/conditions/ConditionPlayerState
       338: dup
       339: getstatic     #513                // Field ext/mods/gameserver/enums/skills/PlayerState.MOVING:Lext/mods/gameserver/enums/skills/PlayerState;
       342: iload         9
       344: invokespecial #498                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerState."<init>":(Lext/mods/gameserver/enums/skills/PlayerState;Z)V
       347: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       350: astore_3
       351: goto          2160
       354: ldc_w         #516                // String running
       357: aload         8
       359: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       364: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       367: ifeq          406
       370: aload         8
       372: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       377: invokestatic  #481                // Method java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
       380: invokevirtual #486                // Method java/lang/Boolean.booleanValue:()Z
       383: istore        9
       385: aload_0
       386: aload_3
       387: new           #490                // class ext/mods/gameserver/skills/conditions/ConditionPlayerState
       390: dup
       391: getstatic     #518                // Field ext/mods/gameserver/enums/skills/PlayerState.RUNNING:Lext/mods/gameserver/enums/skills/PlayerState;
       394: iload         9
       396: invokespecial #498                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerState."<init>":(Lext/mods/gameserver/enums/skills/PlayerState;Z)V
       399: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       402: astore_3
       403: goto          2160
       406: ldc_w         #521                // String behind
       409: aload         8
       411: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       416: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       419: ifeq          458
       422: aload         8
       424: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       429: invokestatic  #481                // Method java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
       432: invokevirtual #486                // Method java/lang/Boolean.booleanValue:()Z
       435: istore        9
       437: aload_0
       438: aload_3
       439: new           #490                // class ext/mods/gameserver/skills/conditions/ConditionPlayerState
       442: dup
       443: getstatic     #523                // Field ext/mods/gameserver/enums/skills/PlayerState.BEHIND:Lext/mods/gameserver/enums/skills/PlayerState;
       446: iload         9
       448: invokespecial #498                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerState."<init>":(Lext/mods/gameserver/enums/skills/PlayerState;Z)V
       451: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       454: astore_3
       455: goto          2160
       458: ldc_w         #526                // String front
       461: aload         8
       463: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       468: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       471: ifeq          510
       474: aload         8
       476: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       481: invokestatic  #481                // Method java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
       484: invokevirtual #486                // Method java/lang/Boolean.booleanValue:()Z
       487: istore        9
       489: aload_0
       490: aload_3
       491: new           #490                // class ext/mods/gameserver/skills/conditions/ConditionPlayerState
       494: dup
       495: getstatic     #528                // Field ext/mods/gameserver/enums/skills/PlayerState.FRONT:Lext/mods/gameserver/enums/skills/PlayerState;
       498: iload         9
       500: invokespecial #498                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerState."<init>":(Lext/mods/gameserver/enums/skills/PlayerState;Z)V
       503: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       506: astore_3
       507: goto          2160
       510: ldc_w         #531                // String olympiad
       513: aload         8
       515: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       520: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       523: ifeq          562
       526: aload         8
       528: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       533: invokestatic  #481                // Method java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
       536: invokevirtual #486                // Method java/lang/Boolean.booleanValue:()Z
       539: istore        9
       541: aload_0
       542: aload_3
       543: new           #490                // class ext/mods/gameserver/skills/conditions/ConditionPlayerState
       546: dup
       547: getstatic     #533                // Field ext/mods/gameserver/enums/skills/PlayerState.OLYMPIAD:Lext/mods/gameserver/enums/skills/PlayerState;
       550: iload         9
       552: invokespecial #498                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerState."<init>":(Lext/mods/gameserver/enums/skills/PlayerState;Z)V
       555: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       558: astore_3
       559: goto          2160
       562: ldc_w         #536                // String ishero
       565: aload         8
       567: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       572: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       575: ifeq          611
       578: aload         8
       580: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       585: invokestatic  #481                // Method java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
       588: invokevirtual #486                // Method java/lang/Boolean.booleanValue:()Z
       591: istore        9
       593: aload_0
       594: aload_3
       595: new           #538                // class ext/mods/gameserver/skills/conditions/ConditionPlayerIsHero
       598: dup
       599: iload         9
       601: invokespecial #540                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerIsHero."<init>":(Z)V
       604: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       607: astore_3
       608: goto          2160
       611: ldc_w         #542                // String hp
       614: aload         8
       616: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       621: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       624: ifeq          665
       627: aload_0
       628: aload         8
       630: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       635: aconst_null
       636: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       639: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       642: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       645: istore        9
       647: aload_0
       648: aload_3
       649: new           #544                // class ext/mods/gameserver/skills/conditions/ConditionPlayerHp
       652: dup
       653: iload         9
       655: invokespecial #546                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerHp."<init>":(I)V
       658: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       661: astore_3
       662: goto          2160
       665: ldc_w         #547                // String mp
       668: aload         8
       670: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       675: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       678: ifeq          719
       681: aload_0
       682: aload         8
       684: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       689: aconst_null
       690: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       693: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       696: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       699: istore        9
       701: aload_0
       702: aload_3
       703: new           #549                // class ext/mods/gameserver/skills/conditions/ConditionPlayerMp
       706: dup
       707: iload         9
       709: invokespecial #551                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerMp."<init>":(I)V
       712: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       715: astore_3
       716: goto          2160
       719: ldc_w         #552                // String pkCount
       722: aload         8
       724: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       729: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       732: ifeq          773
       735: aload_0
       736: aload         8
       738: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       743: aload_2
       744: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       747: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       750: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       753: istore        9
       755: aload_0
       756: aload_3
       757: new           #554                // class ext/mods/gameserver/skills/conditions/ConditionPlayerPkCount
       760: dup
       761: iload         9
       763: invokespecial #556                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerPkCount."<init>":(I)V
       766: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       769: astore_3
       770: goto          2160
       773: ldc_w         #557                // String battle_force
       776: aload         8
       778: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       783: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       786: ifeq          814
       789: aload         5
       791: iconst_0
       792: aload_0
       793: aload         8
       795: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       800: aconst_null
       801: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       804: invokestatic  #559                // Method java/lang/Byte.decode:(Ljava/lang/String;)Ljava/lang/Byte;
       807: invokevirtual #564                // Method java/lang/Byte.byteValue:()B
       810: bastore
       811: goto          2160
       814: ldc_w         #568                // String spell_force
       817: aload         8
       819: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       824: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       827: ifeq          855
       830: aload         5
       832: iconst_1
       833: aload_0
       834: aload         8
       836: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       841: aconst_null
       842: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       845: invokestatic  #559                // Method java/lang/Byte.decode:(Ljava/lang/String;)Ljava/lang/Byte;
       848: invokevirtual #564                // Method java/lang/Byte.byteValue:()B
       851: bastore
       852: goto          2160
       855: ldc_w         #570                // String charges
       858: aload         8
       860: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       865: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       868: ifeq          909
       871: aload_0
       872: aload         8
       874: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       879: aload_2
       880: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       883: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       886: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       889: istore        9
       891: aload_0
       892: aload_3
       893: new           #572                // class ext/mods/gameserver/skills/conditions/ConditionPlayerCharges
       896: dup
       897: iload         9
       899: invokespecial #574                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerCharges."<init>":(I)V
       902: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       905: astore_3
       906: goto          2160
       909: ldc_w         #575                // String weight
       912: aload         8
       914: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       919: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       922: ifeq          963
       925: aload_0
       926: aload         8
       928: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       933: aconst_null
       934: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       937: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       940: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       943: istore        9
       945: aload_0
       946: aload_3
       947: new           #577                // class ext/mods/gameserver/skills/conditions/ConditionPlayerWeight
       950: dup
       951: iload         9
       953: invokespecial #579                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerWeight."<init>":(I)V
       956: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       959: astore_3
       960: goto          2160
       963: ldc_w         #580                // String invSize
       966: aload         8
       968: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       973: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       976: ifeq          1017
       979: aload_0
       980: aload         8
       982: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       987: aconst_null
       988: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       991: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       994: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       997: istore        9
       999: aload_0
      1000: aload_3
      1001: new           #582                // class ext/mods/gameserver/skills/conditions/ConditionPlayerInvSize
      1004: dup
      1005: iload         9
      1007: invokespecial #584                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerInvSize."<init>":(I)V
      1010: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
      1013: astore_3
      1014: goto          2160
      1017: ldc_w         #585                // String pledgeClass
      1020: aload         8
      1022: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1027: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1030: ifeq          1071
      1033: aload_0
      1034: aload         8
      1036: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1041: aconst_null
      1042: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1045: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1048: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1051: istore        9
      1053: aload_0
      1054: aload_3
      1055: new           #587                // class ext/mods/gameserver/skills/conditions/ConditionPlayerPledgeClass
      1058: dup
      1059: iload         9
      1061: invokespecial #589                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerPledgeClass."<init>":(I)V
      1064: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
      1067: astore_3
      1068: goto          2160
      1071: ldc_w         #590                // String clanHall
      1074: aload         8
      1076: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1081: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1084: ifeq          1175
      1087: new           #592                // class java/util/StringTokenizer
      1090: dup
      1091: aload         8
      1093: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1098: ldc_w         #594                // String ,
      1101: invokespecial #596                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
      1104: astore        9
      1106: new           #599                // class java/util/ArrayList
      1109: dup
      1110: aload         9
      1112: invokevirtual #601                // Method java/util/StringTokenizer.countTokens:()I
      1115: invokespecial #604                // Method java/util/ArrayList."<init>":(I)V
      1118: astore        10
      1120: aload         9
      1122: invokevirtual #605                // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1125: ifeq          1157
      1128: aload         9
      1130: invokevirtual #608                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1133: invokevirtual #611                // Method java/lang/String.trim:()Ljava/lang/String;
      1136: astore        11
      1138: aload         10
      1140: aload_0
      1141: aload         11
      1143: aconst_null
      1144: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1147: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1150: invokevirtual #614                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      1153: pop
      1154: goto          1120
      1157: aload_0
      1158: aload_3
      1159: new           #616                // class ext/mods/gameserver/skills/conditions/ConditionPlayerHasClanHall
      1162: dup
      1163: aload         10
      1165: invokespecial #618                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerHasClanHall."<init>":(Ljava/util/List;)V
      1168: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
      1171: astore_3
      1172: goto          2160
      1175: ldc_w         #621                // String castle
      1178: aload         8
      1180: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1185: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1188: ifeq          1229
      1191: aload_0
      1192: aload         8
      1194: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1199: aconst_null
      1200: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1203: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1206: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1209: istore        9
      1211: aload_0
      1212: aload_3
      1213: new           #623                // class ext/mods/gameserver/skills/conditions/ConditionPlayerHasCastle
      1216: dup
      1217: iload         9
      1219: invokespecial #625                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerHasCastle."<init>":(I)V
      1222: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
      1225: astore_3
      1226: goto          2160
      1229: ldc_w         #626                // String sex
      1232: aload         8
      1234: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1239: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1242: ifeq          1283
      1245: aload_0
      1246: aload         8
      1248: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1253: aconst_null
      1254: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1257: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1260: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1263: istore        9
      1265: aload_0
      1266: aload_3
      1267: new           #628                // class ext/mods/gameserver/skills/conditions/ConditionPlayerSex
      1270: dup
      1271: iload         9
      1273: invokespecial #630                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerSex."<init>":(I)V
      1276: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
      1279: astore_3
      1280: goto          2160
      1283: ldc_w         #631                // String active_effect_id
      1286: aload         8
      1288: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1293: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1296: ifeq          1337
      1299: aload_0
      1300: aload         8
      1302: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1307: aload_2
      1308: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1311: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1314: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1317: istore        9
      1319: aload_0
      1320: aload_3
      1321: new           #633                // class ext/mods/gameserver/skills/conditions/ConditionPlayerActiveEffectId
      1324: dup
      1325: iload         9
      1327: invokespecial #635                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerActiveEffectId."<init>":(I)V
      1330: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
      1333: astore_3
      1334: goto          2160
      1337: ldc_w         #636                // String active_effect_id_lvl
      1340: aload         8
      1342: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1347: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1350: ifeq          1433
      1353: aload_0
      1354: aload         8
      1356: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1361: aload_2
      1362: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1365: astore        9
      1367: aload_0
      1368: aload         9
      1370: ldc_w         #594                // String ,
      1373: invokevirtual #638                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      1376: iconst_0
      1377: aaload
      1378: aload_2
      1379: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1382: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1385: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1388: istore        10
      1390: aload_0
      1391: aload         9
      1393: ldc_w         #594                // String ,
      1396: invokevirtual #638                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      1399: iconst_1
      1400: aaload
      1401: aload_2
      1402: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1405: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1408: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1411: istore        11
      1413: aload_0
      1414: aload_3
      1415: new           #633                // class ext/mods/gameserver/skills/conditions/ConditionPlayerActiveEffectId
      1418: dup
      1419: iload         10
      1421: iload         11
      1423: invokespecial #642                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerActiveEffectId."<init>":(II)V
      1426: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
      1429: astore_3
      1430: goto          2160
      1433: ldc_w         #645                // String active_skill_id
      1436: aload         8
      1438: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1443: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1446: ifeq          1487
      1449: aload_0
      1450: aload         8
      1452: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1457: aload_2
      1458: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1461: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1464: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1467: istore        9
      1469: aload_0
      1470: aload_3
      1471: new           #647                // class ext/mods/gameserver/skills/conditions/ConditionPlayerActiveSkillId
      1474: dup
      1475: iload         9
      1477: invokespecial #649                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerActiveSkillId."<init>":(I)V
      1480: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
      1483: astore_3
      1484: goto          2160
      1487: ldc_w         #650                // String active_skill_id_lvl
      1490: aload         8
      1492: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1497: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1500: ifeq          1583
      1503: aload_0
      1504: aload         8
      1506: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1511: aload_2
      1512: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1515: astore        9
      1517: aload_0
      1518: aload         9
      1520: ldc_w         #594                // String ,
      1523: invokevirtual #638                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      1526: iconst_0
      1527: aaload
      1528: aload_2
      1529: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1532: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1535: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1538: istore        10
      1540: aload_0
      1541: aload         9
      1543: ldc_w         #594                // String ,
      1546: invokevirtual #638                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      1549: iconst_1
      1550: aaload
      1551: aload_2
      1552: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1555: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1558: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1561: istore        11
      1563: aload_0
      1564: aload_3
      1565: new           #647                // class ext/mods/gameserver/skills/conditions/ConditionPlayerActiveSkillId
      1568: dup
      1569: iload         10
      1571: iload         11
      1573: invokespecial #652                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerActiveSkillId."<init>":(II)V
      1576: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
      1579: astore_3
      1580: goto          2160
      1583: ldc_w         #653                // String seed_fire
      1586: aload         8
      1588: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1593: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1596: ifeq          1624
      1599: aload         4
      1601: iconst_0
      1602: aload_0
      1603: aload         8
      1605: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1610: aconst_null
      1611: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1614: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1617: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1620: iastore
      1621: goto          2160
      1624: ldc_w         #655                // String seed_water
      1627: aload         8
      1629: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1634: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1637: ifeq          1665
      1640: aload         4
      1642: iconst_1
      1643: aload_0
      1644: aload         8
      1646: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1651: aconst_null
      1652: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1655: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1658: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1661: iastore
      1662: goto          2160
      1665: ldc_w         #657                // String seed_wind
      1668: aload         8
      1670: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1675: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1678: ifeq          1706
      1681: aload         4
      1683: iconst_2
      1684: aload_0
      1685: aload         8
      1687: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1692: aconst_null
      1693: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1696: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1699: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1702: iastore
      1703: goto          2160
      1706: ldc_w         #659                // String seed_various
      1709: aload         8
      1711: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1716: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1719: ifeq          1747
      1722: aload         4
      1724: iconst_3
      1725: aload_0
      1726: aload         8
      1728: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1733: aconst_null
      1734: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1737: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1740: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1743: iastore
      1744: goto          2160
      1747: ldc_w         #661                // String seed_any
      1750: aload         8
      1752: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1757: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1760: ifeq          1788
      1763: aload         4
      1765: iconst_4
      1766: aload_0
      1767: aload         8
      1769: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1774: aconst_null
      1775: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1778: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1781: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1784: iastore
      1785: goto          2160
      1788: ldc_w         #663                // String insidePoly
      1791: aload         8
      1793: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1798: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1801: ifeq          2160
      1804: aload_1
      1805: invokeinterface #79,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
      1810: invokeinterface #146,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
      1815: astore        9
      1817: aload         9
      1819: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
      1824: astore        10
      1826: aload_0
      1827: aload         10
      1829: ldc_w         #665                // String minZ
      1832: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
      1837: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1842: aconst_null
      1843: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1846: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1849: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1852: istore        11
      1854: aload_0
      1855: aload         10
      1857: ldc_w         #667                // String maxZ
      1860: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
      1865: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1870: aconst_null
      1871: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1874: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1877: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1880: istore        12
      1882: aload_0
      1883: aload         8
      1885: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1890: aconst_null
      1891: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1894: invokestatic  #669                // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
      1897: istore        13
      1899: aload         9
      1901: invokeinterface #672,  1          // InterfaceMethod org/w3c/dom/Node.getChildNodes:()Lorg/w3c/dom/NodeList;
      1906: astore        14
      1908: new           #599                // class java/util/ArrayList
      1911: dup
      1912: invokespecial #676                // Method java/util/ArrayList."<init>":()V
      1915: astore        15
      1917: iconst_0
      1918: istore        16
      1920: iload         16
      1922: aload         14
      1924: invokeinterface #677,  1          // InterfaceMethod org/w3c/dom/NodeList.getLength:()I
      1929: if_icmpge     2047
      1932: aload         14
      1934: iload         16
      1936: invokeinterface #680,  2          // InterfaceMethod org/w3c/dom/NodeList.item:(I)Lorg/w3c/dom/Node;
      1941: invokeinterface #377,  1          // InterfaceMethod org/w3c/dom/Node.getNodeType:()S
      1946: iconst_1
      1947: if_icmpne     2041
      1950: aload         14
      1952: iload         16
      1954: invokeinterface #680,  2          // InterfaceMethod org/w3c/dom/NodeList.item:(I)Lorg/w3c/dom/Node;
      1959: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
      1964: astore        17
      1966: aload_0
      1967: aload         17
      1969: ldc_w         #681                // String x
      1972: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
      1977: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1982: aconst_null
      1983: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1986: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1989: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      1992: istore        18
      1994: aload_0
      1995: aload         17
      1997: ldc_w         #683                // String y
      2000: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
      2005: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      2010: aconst_null
      2011: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      2014: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      2017: invokevirtual #134                // Method java/lang/Integer.intValue:()I
      2020: istore        19
      2022: aload         15
      2024: new           #685                // class ext/mods/gameserver/model/holder/IntIntHolder
      2027: dup
      2028: iload         18
      2030: iload         19
      2032: invokespecial #687                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
      2035: invokeinterface #688,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      2040: pop
      2041: iinc          16, 1
      2044: goto          1920
      2047: aload         15
      2049: invokeinterface #691,  1          // InterfaceMethod java/util/List.size:()I
      2054: newarray       int
      2056: astore        16
      2058: aload         15
      2060: invokeinterface #691,  1          // InterfaceMethod java/util/List.size:()I
      2065: newarray       int
      2067: astore        17
      2069: iconst_0
      2070: istore        18
      2072: iload         18
      2074: aload         15
      2076: invokeinterface #691,  1          // InterfaceMethod java/util/List.size:()I
      2081: if_icmpge     2130
      2084: aload         16
      2086: iload         18
      2088: aload         15
      2090: iload         18
      2092: invokeinterface #694,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      2097: checkcast     #685                // class ext/mods/gameserver/model/holder/IntIntHolder
      2100: invokevirtual #697                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
      2103: iastore
      2104: aload         17
      2106: iload         18
      2108: aload         15
      2110: iload         18
      2112: invokeinterface #694,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      2117: checkcast     #685                // class ext/mods/gameserver/model/holder/IntIntHolder
      2120: invokevirtual #698                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
      2123: iastore
      2124: iinc          18, 1
      2127: goto          2072
      2130: aload_0
      2131: aload_3
      2132: new           #700                // class ext/mods/gameserver/skills/conditions/ConditionPlayerInsidePoly
      2135: dup
      2136: new           #702                // class ext/mods/gameserver/model/zone/form/ZoneNPoly
      2139: dup
      2140: aload         16
      2142: aload         17
      2144: iload         11
      2146: iload         12
      2148: invokespecial #704                // Method ext/mods/gameserver/model/zone/form/ZoneNPoly."<init>":([I[III)V
      2151: iload         13
      2153: invokespecial #707                // Method ext/mods/gameserver/skills/conditions/ConditionPlayerInsidePoly."<init>":(Lext/mods/gameserver/model/zone/form/ZoneNPoly;Z)V
      2156: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
      2159: astore_3
      2160: iinc          7, 1
      2163: goto          23
      2166: aload         4
      2168: astore        7
      2170: aload         7
      2172: arraylength
      2173: istore        8
      2175: iconst_0
      2176: istore        9
      2178: iload         9
      2180: iload         8
      2182: if_icmpge     2221
      2185: aload         7
      2187: iload         9
      2189: iaload
      2190: istore        10
      2192: iload         10
      2194: ifle          2215
      2197: aload_0
      2198: aload_3
      2199: new           #710                // class ext/mods/gameserver/skills/conditions/ConditionElementSeed
      2202: dup
      2203: aload         4
      2205: invokespecial #712                // Method ext/mods/gameserver/skills/conditions/ConditionElementSeed."<init>":([I)V
      2208: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
      2211: astore_3
      2212: goto          2221
      2215: iinc          9, 1
      2218: goto          2178
      2221: aload         5
      2223: iconst_0
      2224: baload
      2225: aload         5
      2227: iconst_1
      2228: baload
      2229: iadd
      2230: ifle          2248
      2233: aload_0
      2234: aload_3
      2235: new           #715                // class ext/mods/gameserver/skills/conditions/ConditionForceBuff
      2238: dup
      2239: aload         5
      2241: invokespecial #717                // Method ext/mods/gameserver/skills/conditions/ConditionForceBuff."<init>":([B)V
      2244: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
      2247: astore_3
      2248: aload_3
      2249: ifnonnull     2272
      2252: getstatic     #61                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
      2255: ldc_w         #720                // String Unrecognized <player> condition in {}.
      2258: iconst_1
      2259: anewarray     #2                  // class java/lang/Object
      2262: dup
      2263: iconst_0
      2264: aload_0
      2265: getfield      #7                  // Field _file:Ljava/io/File;
      2268: aastore
      2269: invokevirtual #434                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
      2272: aload_3
      2273: areturn
      LineNumberTable:
        line 418: 0
        line 419: 2
        line 420: 7
        line 421: 12
        line 423: 20
        line 425: 35
        line 426: 46
        line 428: 62
        line 429: 74
        line 430: 89
        line 431: 92
        line 433: 108
        line 434: 128
        line 435: 143
        line 436: 146
        line 438: 162
        line 439: 177
        line 440: 195
        line 441: 198
        line 443: 214
        line 444: 229
        line 445: 247
        line 446: 250
        line 448: 266
        line 449: 281
        line 450: 299
        line 451: 302
        line 453: 318
        line 454: 333
        line 455: 351
        line 456: 354
        line 458: 370
        line 459: 385
        line 460: 403
        line 461: 406
        line 463: 422
        line 464: 437
        line 465: 455
        line 466: 458
        line 468: 474
        line 469: 489
        line 470: 507
        line 471: 510
        line 473: 526
        line 474: 541
        line 475: 559
        line 476: 562
        line 478: 578
        line 479: 593
        line 480: 608
        line 481: 611
        line 483: 627
        line 484: 647
        line 485: 662
        line 486: 665
        line 488: 681
        line 489: 701
        line 490: 716
        line 491: 719
        line 493: 735
        line 494: 755
        line 495: 770
        line 496: 773
        line 498: 789
        line 500: 814
        line 502: 830
        line 504: 855
        line 506: 871
        line 507: 891
        line 508: 906
        line 509: 909
        line 511: 925
        line 512: 945
        line 513: 960
        line 514: 963
        line 516: 979
        line 517: 999
        line 518: 1014
        line 519: 1017
        line 521: 1033
        line 522: 1053
        line 523: 1068
        line 524: 1071
        line 526: 1087
        line 527: 1106
        line 528: 1120
        line 530: 1128
        line 531: 1138
        line 532: 1154
        line 533: 1157
        line 534: 1172
        line 535: 1175
        line 537: 1191
        line 538: 1211
        line 539: 1226
        line 540: 1229
        line 542: 1245
        line 543: 1265
        line 544: 1280
        line 545: 1283
        line 547: 1299
        line 548: 1319
        line 549: 1334
        line 550: 1337
        line 552: 1353
        line 553: 1367
        line 554: 1390
        line 555: 1413
        line 556: 1430
        line 557: 1433
        line 559: 1449
        line 560: 1469
        line 561: 1484
        line 562: 1487
        line 564: 1503
        line 565: 1517
        line 566: 1540
        line 567: 1563
        line 568: 1580
        line 569: 1583
        line 570: 1599
        line 571: 1624
        line 572: 1640
        line 573: 1665
        line 574: 1681
        line 575: 1706
        line 576: 1722
        line 577: 1747
        line 578: 1763
        line 579: 1788
        line 581: 1804
        line 582: 1817
        line 584: 1826
        line 585: 1854
        line 586: 1882
        line 588: 1899
        line 590: 1908
        line 592: 1917
        line 593: 1932
        line 595: 1950
        line 596: 1966
        line 597: 1994
        line 599: 2022
        line 592: 2041
        line 602: 2047
        line 603: 2058
        line 605: 2069
        line 607: 2084
        line 608: 2104
        line 605: 2124
        line 611: 2130
        line 423: 2160
        line 615: 2166
        line 617: 2192
        line 619: 2197
        line 620: 2212
        line 615: 2215
        line 624: 2221
        line 625: 2233
        line 627: 2248
        line 628: 2252
        line 630: 2272
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           74      15     9  race   Lext/mods/gameserver/enums/actors/ClassRace;
          128      15     9   lvl   I
          177      18     9   val   Z
          229      18     9   val   Z
          281      18     9   val   Z
          333      18     9   val   Z
          385      18     9   val   Z
          437      18     9   val   Z
          489      18     9   val   Z
          541      18     9   val   Z
          593      15     9   val   Z
          647      15     9    hp   I
          701      15     9    hp   I
          755      15     9 expIndex   I
          891      15     9 value   I
          945      15     9 weight   I
          999      15     9  size   I
         1053      15     9 pledgeClass   I
         1138      16    11  item   Ljava/lang/String;
         1106      66     9    st   Ljava/util/StringTokenizer;
         1120      52    10 array   Ljava/util/ArrayList;
         1211      15     9 castle   I
         1265      15     9   sex   I
         1319      15     9 effect_id   I
         1367      63     9   val   Ljava/lang/String;
         1390      40    10 effect_id   I
         1413      17    11 effect_lvl   I
         1469      15     9 skill_id   I
         1517      63     9   val   Ljava/lang/String;
         1540      40    10 skill_id   I
         1563      17    11 skill_lvl   I
         1966      75    17 nodeAttrs   Lorg/w3c/dom/NamedNodeMap;
         1994      47    18 xCoord   I
         2022      19    19 yCoord   I
         1920     127    16     j   I
         2072      58    18     k   I
         1817     343     9 zoneNode   Lorg/w3c/dom/Node;
         1826     334    10 pAttrs   Lorg/w3c/dom/NamedNodeMap;
         1854     306    11  minZ   I
         1882     278    12  maxZ   I
         1899     261    13 checkInside   Z
         1908     252    14 nNodes   Lorg/w3c/dom/NodeList;
         1917     243    15 pNodes   Ljava/util/List;
         2058     102    16    aX   [I
         2069      91    17    aY   [I
           46    2114     8     a   Lorg/w3c/dom/Node;
           23    2143     7     i   I
         2192      23    10 elementSeed   I
            0    2274     0  this   Lext/mods/gameserver/data/DocumentBase;
            0    2274     1     n   Lorg/w3c/dom/Node;
            0    2274     2 template   Ljava/lang/Object;
            2    2272     3  cond   Lext/mods/gameserver/skills/conditions/Condition;
            7    2267     4 ElementSeeds   [I
           12    2262     5 forces   [B
           20    2254     6 attrs   Lorg/w3c/dom/NamedNodeMap;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
         1120      52    10 array   Ljava/util/ArrayList<Ljava/lang/Integer;>;
         1917     243    15 pNodes   Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
      StackMapTable: number_of_entries = 47
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/data/DocumentBase, class org/w3c/dom/Node, class java/lang/Object, class ext/mods/gameserver/skills/conditions/Condition, class "[I", class "[B", class org/w3c/dom/NamedNodeMap, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 68
          locals = [ class org/w3c/dom/Node ]
        frame_type = 53 /* same */
        frame_type = 51 /* same */
        frame_type = 51 /* same */
        frame_type = 51 /* same */
        frame_type = 51 /* same */
        frame_type = 51 /* same */
        frame_type = 51 /* same */
        frame_type = 51 /* same */
        frame_type = 51 /* same */
        frame_type = 48 /* same */
        frame_type = 53 /* same */
        frame_type = 53 /* same */
        frame_type = 53 /* same */
        frame_type = 40 /* same */
        frame_type = 40 /* same */
        frame_type = 53 /* same */
        frame_type = 53 /* same */
        frame_type = 53 /* same */
        frame_type = 53 /* same */
        frame_type = 253 /* append */
          offset_delta = 48
          locals = [ class java/util/StringTokenizer, class java/util/ArrayList ]
        frame_type = 36 /* same */
        frame_type = 249 /* chop */
          offset_delta = 17
        frame_type = 53 /* same */
        frame_type = 53 /* same */
        frame_type = 53 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 95
        frame_type = 53 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 95
        frame_type = 40 /* same */
        frame_type = 40 /* same */
        frame_type = 40 /* same */
        frame_type = 40 /* same */
        frame_type = 40 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 131
          locals = [ class ext/mods/gameserver/data/DocumentBase, class org/w3c/dom/Node, class java/lang/Object, class ext/mods/gameserver/skills/conditions/Condition, class "[I", class "[B", class org/w3c/dom/NamedNodeMap, int, class org/w3c/dom/Node, class org/w3c/dom/Node, class org/w3c/dom/NamedNodeMap, int, int, int, class org/w3c/dom/NodeList, class java/util/List, int ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 120
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 254 /* append */
          offset_delta = 24
          locals = [ class "[I", class "[I", int ]
        frame_type = 250 /* chop */
          offset_delta = 57
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/data/DocumentBase, class org/w3c/dom/Node, class java/lang/Object, class ext/mods/gameserver/skills/conditions/Condition, class "[I", class "[B", class org/w3c/dom/NamedNodeMap, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 254 /* append */
          offset_delta = 11
          locals = [ class "[I", int, int ]
        frame_type = 36 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 26 /* same */
        frame_type = 23 /* same */

  protected ext.mods.gameserver.skills.conditions.Condition parseTargetCondition(org.w3c.dom.Node, java.lang.Object);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=10, args_size=3
         0: aconst_null
         1: astore_3
         2: aload_1
         3: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         8: astore        4
        10: iconst_0
        11: istore        5
        13: iload         5
        15: aload         4
        17: invokeinterface #450,  1          // InterfaceMethod org/w3c/dom/NamedNodeMap.getLength:()I
        22: if_icmpge     394
        25: aload         4
        27: iload         5
        29: invokeinterface #453,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.item:(I)Lorg/w3c/dom/Node;
        34: astore        6
        36: ldc_w         #722                // String hp_min_max
        39: aload         6
        41: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        46: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        49: ifeq          132
        52: aload_0
        53: aload         6
        55: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        60: aload_2
        61: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        64: astore        7
        66: aload_0
        67: aload         7
        69: ldc_w         #594                // String ,
        72: invokevirtual #638                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        75: iconst_0
        76: aaload
        77: aload_2
        78: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        81: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
        84: invokevirtual #134                // Method java/lang/Integer.intValue:()I
        87: istore        8
        89: aload_0
        90: aload         7
        92: ldc_w         #594                // String ,
        95: invokevirtual #638                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        98: iconst_1
        99: aaload
       100: aload_2
       101: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       104: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       107: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       110: istore        9
       112: aload_0
       113: aload_3
       114: new           #724                // class ext/mods/gameserver/skills/conditions/ConditionTargetHpMinMax
       117: dup
       118: iload         8
       120: iload         9
       122: invokespecial #726                // Method ext/mods/gameserver/skills/conditions/ConditionTargetHpMinMax."<init>":(II)V
       125: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       128: astore_3
       129: goto          388
       132: ldc_w         #645                // String active_skill_id
       135: aload         6
       137: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       142: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       145: ifeq          186
       148: aload_0
       149: aload         6
       151: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       156: aload_2
       157: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       160: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       163: invokevirtual #134                // Method java/lang/Integer.intValue:()I
       166: istore        7
       168: aload_0
       169: aload_3
       170: new           #727                // class ext/mods/gameserver/skills/conditions/ConditionTargetActiveSkillId
       173: dup
       174: iload         7
       176: invokespecial #729                // Method ext/mods/gameserver/skills/conditions/ConditionTargetActiveSkillId."<init>":(I)V
       179: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       182: astore_3
       183: goto          388
       186: ldc_w         #730                // String race_id
       189: aload         6
       191: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       196: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       199: ifeq          287
       202: new           #599                // class java/util/ArrayList
       205: dup
       206: invokespecial #676                // Method java/util/ArrayList."<init>":()V
       209: astore        7
       211: new           #592                // class java/util/StringTokenizer
       214: dup
       215: aload         6
       217: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       222: ldc_w         #594                // String ,
       225: invokespecial #596                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       228: astore        8
       230: aload         8
       232: invokevirtual #605                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       235: ifeq          269
       238: aload         8
       240: invokevirtual #608                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       243: invokevirtual #611                // Method java/lang/String.trim:()Ljava/lang/String;
       246: astore        9
       248: aload         7
       250: aload_0
       251: aload         9
       253: aconst_null
       254: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       257: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       260: invokeinterface #688,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       265: pop
       266: goto          230
       269: aload_0
       270: aload_3
       271: new           #732                // class ext/mods/gameserver/skills/conditions/ConditionTargetRaceId
       274: dup
       275: aload         7
       277: invokespecial #734                // Method ext/mods/gameserver/skills/conditions/ConditionTargetRaceId."<init>":(Ljava/util/List;)V
       280: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       283: astore_3
       284: goto          388
       287: ldc_w         #735                // String npcId
       290: aload         6
       292: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       297: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       300: ifeq          388
       303: new           #592                // class java/util/StringTokenizer
       306: dup
       307: aload         6
       309: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       314: ldc_w         #594                // String ,
       317: invokespecial #596                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       320: astore        7
       322: new           #599                // class java/util/ArrayList
       325: dup
       326: aload         7
       328: invokevirtual #601                // Method java/util/StringTokenizer.countTokens:()I
       331: invokespecial #604                // Method java/util/ArrayList."<init>":(I)V
       334: astore        8
       336: aload         7
       338: invokevirtual #605                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       341: ifeq          373
       344: aload         7
       346: invokevirtual #608                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       349: invokevirtual #611                // Method java/lang/String.trim:()Ljava/lang/String;
       352: astore        9
       354: aload         8
       356: aload_0
       357: aload         9
       359: aconst_null
       360: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
       363: invokestatic  #128                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       366: invokevirtual #614                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
       369: pop
       370: goto          336
       373: aload_0
       374: aload_3
       375: new           #737                // class ext/mods/gameserver/skills/conditions/ConditionTargetNpcId
       378: dup
       379: aload         8
       381: invokespecial #739                // Method ext/mods/gameserver/skills/conditions/ConditionTargetNpcId."<init>":(Ljava/util/List;)V
       384: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       387: astore_3
       388: iinc          5, 1
       391: goto          13
       394: aload_3
       395: ifnonnull     418
       398: getstatic     #61                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       401: ldc_w         #740                // String Unrecognized <target> condition in {}.
       404: iconst_1
       405: anewarray     #2                  // class java/lang/Object
       408: dup
       409: iconst_0
       410: aload_0
       411: getfield      #7                  // Field _file:Ljava/io/File;
       414: aastore
       415: invokevirtual #434                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
       418: aload_3
       419: areturn
      LineNumberTable:
        line 635: 0
        line 636: 2
        line 637: 10
        line 639: 25
        line 640: 36
        line 642: 52
        line 643: 66
        line 644: 89
        line 645: 112
        line 646: 129
        line 647: 132
        line 649: 148
        line 650: 168
        line 651: 183
        line 652: 186
        line 654: 202
        line 655: 211
        line 656: 230
        line 658: 238
        line 659: 248
        line 660: 266
        line 661: 269
        line 662: 284
        line 663: 287
        line 665: 303
        line 666: 322
        line 667: 336
        line 669: 344
        line 670: 354
        line 671: 370
        line 672: 373
        line 637: 388
        line 676: 394
        line 677: 398
        line 679: 418
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           66      63     7   val   Ljava/lang/String;
           89      40     8 hpMin   I
          112      17     9 hpMax   I
          168      15     7 skill_id   I
          248      18     9  item   Ljava/lang/String;
          211      73     7 array   Ljava/util/List;
          230      54     8    st   Ljava/util/StringTokenizer;
          354      16     9  item   Ljava/lang/String;
          322      66     7    st   Ljava/util/StringTokenizer;
          336      52     8 array   Ljava/util/ArrayList;
           36     352     6     a   Lorg/w3c/dom/Node;
           13     381     5     i   I
            0     420     0  this   Lext/mods/gameserver/data/DocumentBase;
            0     420     1     n   Lorg/w3c/dom/Node;
            0     420     2 template   Ljava/lang/Object;
            2     418     3  cond   Lext/mods/gameserver/skills/conditions/Condition;
           10     410     4 attrs   Lorg/w3c/dom/NamedNodeMap;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          211      73     7 array   Ljava/util/List<Ljava/lang/Integer;>;
          336      52     8 array   Ljava/util/ArrayList<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 11
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/NamedNodeMap, int ]
        frame_type = 252 /* append */
          offset_delta = 118
          locals = [ class org/w3c/dom/Node ]
        frame_type = 53 /* same */
        frame_type = 253 /* append */
          offset_delta = 43
          locals = [ class java/util/List, class java/util/StringTokenizer ]
        frame_type = 38 /* same */
        frame_type = 249 /* chop */
          offset_delta = 17
        frame_type = 253 /* append */
          offset_delta = 48
          locals = [ class java/util/StringTokenizer, class java/util/ArrayList ]
        frame_type = 36 /* same */
        frame_type = 248 /* chop */
          offset_delta = 14
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 23 /* same */

  protected ext.mods.gameserver.skills.conditions.Condition parseSkillCondition(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Lext/mods/gameserver/skills/conditions/Condition;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         6: astore_2
         7: aload_2
         8: ldc           #207                // String stat
        10: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        15: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        20: invokestatic  #209                // Method ext/mods/gameserver/enums/skills/Stats.valueOfXml:(Ljava/lang/String;)Lext/mods/gameserver/enums/skills/Stats;
        23: astore_3
        24: new           #742                // class ext/mods/gameserver/skills/conditions/ConditionSkillStats
        27: dup
        28: aload_3
        29: invokespecial #744                // Method ext/mods/gameserver/skills/conditions/ConditionSkillStats."<init>":(Lext/mods/gameserver/enums/skills/Stats;)V
        32: areturn
      LineNumberTable:
        line 684: 0
        line 685: 7
        line 686: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/DocumentBase;
            0      33     1     n   Lorg/w3c/dom/Node;
            7      26     2 attrs   Lorg/w3c/dom/NamedNodeMap;
           24       9     3  stat   Lext/mods/gameserver/enums/skills/Stats;

  protected ext.mods.gameserver.skills.conditions.Condition parseUsingCondition(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Lext/mods/gameserver/skills/conditions/Condition;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=14, args_size=2
         0: aconst_null
         1: astore_2
         2: aload_1
         3: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         8: astore_3
         9: iconst_0
        10: istore        4
        12: iload         4
        14: aload_3
        15: invokeinterface #450,  1          // InterfaceMethod org/w3c/dom/NamedNodeMap.getLength:()I
        20: if_icmpge     257
        23: aload_3
        24: iload         4
        26: invokeinterface #453,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.item:(I)Lorg/w3c/dom/Node;
        31: astore        5
        33: ldc_w         #747                // String kind
        36: aload         5
        38: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        43: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        46: ifeq          251
        49: iconst_0
        50: istore        6
        52: new           #592                // class java/util/StringTokenizer
        55: dup
        56: aload         5
        58: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        63: ldc_w         #594                // String ,
        66: invokespecial #596                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        69: astore        7
        71: aload         7
        73: invokevirtual #605                // Method java/util/StringTokenizer.hasMoreTokens:()Z
        76: ifeq          236
        79: iload         6
        81: istore        8
        83: aload         7
        85: invokevirtual #608                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        88: astore        9
        90: getstatic     #749                // Field ext/mods/gameserver/enums/items/WeaponType.VALUES:[Lext/mods/gameserver/enums/items/WeaponType;
        93: astore        10
        95: aload         10
        97: arraylength
        98: istore        11
       100: iconst_0
       101: istore        12
       103: iload         12
       105: iload         11
       107: if_icmpge     149
       110: aload         10
       112: iload         12
       114: aaload
       115: astore        13
       117: aload         13
       119: invokevirtual #755                // Method ext/mods/gameserver/enums/items/WeaponType.name:()Ljava/lang/String;
       122: aload         9
       124: invokevirtual #757                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       127: ifeq          143
       130: iload         6
       132: aload         13
       134: invokevirtual #760                // Method ext/mods/gameserver/enums/items/WeaponType.mask:()I
       137: ior
       138: istore        6
       140: goto          149
       143: iinc          12, 1
       146: goto          103
       149: getstatic     #763                // Field ext/mods/gameserver/enums/items/ArmorType.VALUES:[Lext/mods/gameserver/enums/items/ArmorType;
       152: astore        10
       154: aload         10
       156: arraylength
       157: istore        11
       159: iconst_0
       160: istore        12
       162: iload         12
       164: iload         11
       166: if_icmpge     208
       169: aload         10
       171: iload         12
       173: aaload
       174: astore        13
       176: aload         13
       178: invokevirtual #768                // Method ext/mods/gameserver/enums/items/ArmorType.name:()Ljava/lang/String;
       181: aload         9
       183: invokevirtual #757                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       186: ifeq          202
       189: iload         6
       191: aload         13
       193: invokevirtual #769                // Method ext/mods/gameserver/enums/items/ArmorType.mask:()I
       196: ior
       197: istore        6
       199: goto          208
       202: iinc          12, 1
       205: goto          162
       208: iload         8
       210: iload         6
       212: if_icmpne     233
       215: getstatic     #61                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       218: ldc_w         #770                // String [parseUsingCondition=\"kind\"] Unknown item type name: {}.
       221: iconst_1
       222: anewarray     #2                  // class java/lang/Object
       225: dup
       226: iconst_0
       227: aload         9
       229: aastore
       230: invokevirtual #434                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
       233: goto          71
       236: aload_0
       237: aload_2
       238: new           #772                // class ext/mods/gameserver/skills/conditions/ConditionUsingItemType
       241: dup
       242: iload         6
       244: invokespecial #774                // Method ext/mods/gameserver/skills/conditions/ConditionUsingItemType."<init>":(I)V
       247: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
       250: astore_2
       251: iinc          4, 1
       254: goto          12
       257: aload_2
       258: ifnonnull     281
       261: getstatic     #61                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       264: ldc_w         #775                // String Unrecognized <using> condition in {}.
       267: iconst_1
       268: anewarray     #2                  // class java/lang/Object
       271: dup
       272: iconst_0
       273: aload_0
       274: getfield      #7                  // Field _file:Ljava/io/File;
       277: aastore
       278: invokevirtual #434                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
       281: aload_2
       282: areturn
      LineNumberTable:
        line 691: 0
        line 692: 2
        line 693: 9
        line 695: 23
        line 696: 33
        line 698: 49
        line 699: 52
        line 700: 71
        line 702: 79
        line 703: 83
        line 704: 90
        line 706: 117
        line 708: 130
        line 709: 140
        line 704: 143
        line 713: 149
        line 715: 176
        line 717: 189
        line 718: 199
        line 713: 202
        line 722: 208
        line 723: 215
        line 724: 233
        line 725: 236
        line 693: 251
        line 729: 257
        line 730: 261
        line 732: 281
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          117      26    13    wt   Lext/mods/gameserver/enums/items/WeaponType;
          176      26    13    at   Lext/mods/gameserver/enums/items/ArmorType;
           83     150     8   old   I
           90     143     9  item   Ljava/lang/String;
           52     199     6  mask   I
           71     180     7    st   Ljava/util/StringTokenizer;
           33     218     5     a   Lorg/w3c/dom/Node;
           12     245     4     i   I
            0     283     0  this   Lext/mods/gameserver/data/DocumentBase;
            0     283     1     n   Lorg/w3c/dom/Node;
            2     281     2  cond   Lext/mods/gameserver/skills/conditions/Condition;
            9     274     3 attrs   Lorg/w3c/dom/NamedNodeMap;
      StackMapTable: number_of_entries = 13
        frame_type = 254 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/NamedNodeMap, int ]
        frame_type = 254 /* append */
          offset_delta = 58
          locals = [ class org/w3c/dom/Node, int, class java/util/StringTokenizer ]
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/data/DocumentBase, class org/w3c/dom/Node, class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/NamedNodeMap, int, class org/w3c/dom/Node, int, class java/util/StringTokenizer, int, class java/lang/String, class "[Lext/mods/gameserver/enums/items/WeaponType;", int, int ]
          stack = []
        frame_type = 39 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 254 /* append */
          offset_delta = 12
          locals = [ class "[Lext/mods/gameserver/enums/items/ArmorType;", int, int ]
        frame_type = 39 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 249 /* chop */
          offset_delta = 24
        frame_type = 2 /* same */
        frame_type = 248 /* chop */
          offset_delta = 14
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 23 /* same */

  protected ext.mods.gameserver.skills.conditions.Condition parseGameCondition(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Lext/mods/gameserver/skills/conditions/Condition;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=7, args_size=2
         0: aconst_null
         1: astore_2
         2: aload_1
         3: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         8: astore_3
         9: iconst_0
        10: istore        4
        12: iload         4
        14: aload_3
        15: invokeinterface #450,  1          // InterfaceMethod org/w3c/dom/NamedNodeMap.getLength:()I
        20: if_icmpge     85
        23: aload_3
        24: iload         4
        26: invokeinterface #453,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.item:(I)Lorg/w3c/dom/Node;
        31: astore        5
        33: ldc_w         #777                // String night
        36: aload         5
        38: invokeinterface #87,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        43: invokevirtual #91                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        46: ifeq          79
        49: aload         5
        51: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        56: invokestatic  #481                // Method java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
        59: invokevirtual #486                // Method java/lang/Boolean.booleanValue:()Z
        62: istore        6
        64: aload_0
        65: aload_2
        66: new           #779                // class ext/mods/gameserver/skills/conditions/ConditionGameTime
        69: dup
        70: iload         6
        72: invokespecial #781                // Method ext/mods/gameserver/skills/conditions/ConditionGameTime."<init>":(Z)V
        75: invokevirtual #469                // Method joinAnd:(Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
        78: astore_2
        79: iinc          4, 1
        82: goto          12
        85: aload_2
        86: ifnonnull     109
        89: getstatic     #61                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        92: ldc_w         #782                // String Unrecognized <game> condition in {}.
        95: iconst_1
        96: anewarray     #2                  // class java/lang/Object
        99: dup
       100: iconst_0
       101: aload_0
       102: getfield      #7                  // Field _file:Ljava/io/File;
       105: aastore
       106: invokevirtual #434                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
       109: aload_2
       110: areturn
      LineNumberTable:
        line 737: 0
        line 738: 2
        line 739: 9
        line 741: 23
        line 742: 33
        line 744: 49
        line 745: 64
        line 739: 79
        line 749: 85
        line 750: 89
        line 752: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           64      15     6   val   Z
           33      46     5     a   Lorg/w3c/dom/Node;
           12      73     4     i   I
            0     111     0  this   Lext/mods/gameserver/data/DocumentBase;
            0     111     1     n   Lorg/w3c/dom/Node;
            2     109     2  cond   Lext/mods/gameserver/skills/conditions/Condition;
            9     102     3 attrs   Lorg/w3c/dom/NamedNodeMap;
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/NamedNodeMap, int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 23 /* same */

  protected void parseTable(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=6, args_size=2
         0: aload_1
         1: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         6: astore_2
         7: aload_2
         8: ldc           #248                // String name
        10: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        15: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        20: astore_3
        21: aload_3
        22: iconst_0
        23: invokevirtual #217                // Method java/lang/String.charAt:(I)C
        26: bipush        35
        28: if_icmpeq     42
        31: new           #326                // class java/lang/IllegalArgumentException
        34: dup
        35: ldc_w         #784                // String Table name must start with #
        38: invokespecial #331                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        41: athrow
        42: new           #592                // class java/util/StringTokenizer
        45: dup
        46: aload_1
        47: invokeinterface #79,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
        52: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        57: invokespecial #786                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
        60: astore        4
        62: new           #599                // class java/util/ArrayList
        65: dup
        66: aload         4
        68: invokevirtual #601                // Method java/util/StringTokenizer.countTokens:()I
        71: invokespecial #604                // Method java/util/ArrayList."<init>":(I)V
        74: astore        5
        76: aload         4
        78: invokevirtual #605                // Method java/util/StringTokenizer.hasMoreTokens:()Z
        81: ifeq          100
        84: aload         5
        86: aload         4
        88: invokevirtual #608                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        91: invokeinterface #688,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        96: pop
        97: goto          76
       100: aload_0
       101: aload_3
       102: aload         5
       104: aload         5
       106: invokeinterface #691,  1          // InterfaceMethod java/util/List.size:()I
       111: anewarray     #92                 // class java/lang/String
       114: invokeinterface #787,  2          // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       119: checkcast     #791                // class "[Ljava/lang/String;"
       122: invokevirtual #793                // Method setTable:(Ljava/lang/String;[Ljava/lang/String;)V
       125: return
      LineNumberTable:
        line 757: 0
        line 758: 7
        line 760: 21
        line 761: 31
        line 763: 42
        line 764: 62
        line 766: 76
        line 767: 84
        line 769: 100
        line 770: 125
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     126     0  this   Lext/mods/gameserver/data/DocumentBase;
            0     126     1     n   Lorg/w3c/dom/Node;
            7     119     2 attrs   Lorg/w3c/dom/NamedNodeMap;
           21     105     3  name   Ljava/lang/String;
           62      64     4  data   Ljava/util/StringTokenizer;
           76      50     5 array   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           76      50     5 array   Ljava/util/List<Ljava/lang/String;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 42
          locals = [ class org/w3c/dom/NamedNodeMap, class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ class java/util/StringTokenizer, class java/util/List ]
        frame_type = 23 /* same */

  protected void parseBeanSet(org.w3c.dom.Node, ext.mods.commons.data.StatSet, java.lang.Integer);
    descriptor: (Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=7, args_size=4
         0: aload_1
         1: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         6: ldc           #248                // String name
         8: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        13: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        18: invokevirtual #611                // Method java/lang/String.trim:()Ljava/lang/String;
        21: astore        4
        23: aload_1
        24: invokeinterface #101,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
        29: ldc           #215                // String val
        31: invokeinterface #107,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        36: invokeinterface #115,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        41: invokevirtual #611                // Method java/lang/String.trim:()Ljava/lang/String;
        44: astore        5
        46: aload         5
        48: invokevirtual #797                // Method java/lang/String.length:()I
        51: ifne          59
        54: bipush        32
        56: goto          65
        59: aload         5
        61: iconst_0
        62: invokevirtual #217                // Method java/lang/String.charAt:(I)C
        65: istore        6
        67: iload         6
        69: bipush        35
        71: if_icmpeq     89
        74: iload         6
        76: bipush        45
        78: if_icmpeq     89
        81: iload         6
        83: invokestatic  #800                // Method java/lang/Character.isDigit:(C)Z
        86: ifeq          108
        89: aload_2
        90: aload         4
        92: aload_0
        93: aload         5
        95: aload_3
        96: invokevirtual #124                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        99: invokestatic  #806                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       102: invokevirtual #809                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       105: goto          116
       108: aload_2
       109: aload         4
       111: aload         5
       113: invokevirtual #809                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       116: return
      LineNumberTable:
        line 774: 0
        line 775: 23
        line 776: 46
        line 778: 67
        line 779: 89
        line 781: 108
        line 782: 116
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     117     0  this   Lext/mods/gameserver/data/DocumentBase;
            0     117     1     n   Lorg/w3c/dom/Node;
            0     117     2   set   Lext/mods/commons/data/StatSet;
            0     117     3 level   Ljava/lang/Integer;
           23      94     4  name   Ljava/lang/String;
           46      71     5 value   Ljava/lang/String;
           67      50     6    ch   C
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 59
          locals = [ class java/lang/String, class java/lang/String ]
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]
        frame_type = 18 /* same */
        frame_type = 7 /* same */

  protected java.lang.String getValue(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=4, args_size=3
         0: aload_1
         1: iconst_0
         2: invokevirtual #217                // Method java/lang/String.charAt:(I)C
         5: bipush        35
         7: if_icmpne     53
        10: aload_2
        11: instanceof    #242                // class ext/mods/gameserver/skills/L2Skill
        14: ifeq          23
        17: aload_0
        18: aload_1
        19: invokevirtual #221                // Method getTableValue:(Ljava/lang/String;)Ljava/lang/String;
        22: areturn
        23: aload_2
        24: instanceof    #129                // class java/lang/Integer
        27: ifeq          45
        30: aload_2
        31: checkcast     #129                // class java/lang/Integer
        34: astore_3
        35: aload_0
        36: aload_1
        37: aload_3
        38: invokevirtual #134                // Method java/lang/Integer.intValue:()I
        41: invokevirtual #813                // Method getTableValue:(Ljava/lang/String;I)Ljava/lang/String;
        44: areturn
        45: new           #815                // class java/lang/IllegalStateException
        48: dup
        49: invokespecial #817                // Method java/lang/IllegalStateException."<init>":()V
        52: athrow
        53: aload_1
        54: areturn
      LineNumberTable:
        line 786: 0
        line 788: 10
        line 789: 17
        line 791: 23
        line 792: 35
        line 794: 45
        line 796: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      10     3 intTemplate   Ljava/lang/Integer;
            0      55     0  this   Lext/mods/gameserver/data/DocumentBase;
            0      55     1 value   Ljava/lang/String;
            0      55     2 template   Ljava/lang/Object;
      StackMapTable: number_of_entries = 3
        frame_type = 23 /* same */
        frame_type = 21 /* same */
        frame_type = 7 /* same */

  protected ext.mods.gameserver.skills.conditions.Condition joinAnd(ext.mods.gameserver.skills.conditions.Condition, ext.mods.gameserver.skills.conditions.Condition);
    descriptor: (Lext/mods/gameserver/skills/conditions/Condition;Lext/mods/gameserver/skills/conditions/Condition;)Lext/mods/gameserver/skills/conditions/Condition;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=4, args_size=3
         0: aload_1
         1: ifnonnull     6
         4: aload_2
         5: areturn
         6: aload_1
         7: instanceof    #422                // class ext/mods/gameserver/skills/conditions/ConditionLogicAnd
        10: ifeq          25
        13: aload_1
        14: checkcast     #422                // class ext/mods/gameserver/skills/conditions/ConditionLogicAnd
        17: astore_3
        18: aload_3
        19: aload_2
        20: invokevirtual #425                // Method ext/mods/gameserver/skills/conditions/ConditionLogicAnd.add:(Lext/mods/gameserver/skills/conditions/Condition;)V
        23: aload_1
        24: areturn
        25: new           #422                // class ext/mods/gameserver/skills/conditions/ConditionLogicAnd
        28: dup
        29: invokespecial #424                // Method ext/mods/gameserver/skills/conditions/ConditionLogicAnd."<init>":()V
        32: astore_3
        33: aload_3
        34: aload_1
        35: invokevirtual #425                // Method ext/mods/gameserver/skills/conditions/ConditionLogicAnd.add:(Lext/mods/gameserver/skills/conditions/Condition;)V
        38: aload_3
        39: aload_2
        40: invokevirtual #425                // Method ext/mods/gameserver/skills/conditions/ConditionLogicAnd.add:(Lext/mods/gameserver/skills/conditions/Condition;)V
        43: aload_3
        44: areturn
      LineNumberTable:
        line 801: 0
        line 802: 4
        line 804: 6
        line 806: 18
        line 807: 23
        line 810: 25
        line 811: 33
        line 812: 38
        line 813: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       7     3   cla   Lext/mods/gameserver/skills/conditions/ConditionLogicAnd;
            0      45     0  this   Lext/mods/gameserver/data/DocumentBase;
            0      45     1  cond   Lext/mods/gameserver/skills/conditions/Condition;
            0      45     2     c   Lext/mods/gameserver/skills/conditions/Condition;
           33      12     3   cla   Lext/mods/gameserver/skills/conditions/ConditionLogicAnd;
      StackMapTable: number_of_entries = 2
        frame_type = 6 /* same */
        frame_type = 18 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #68                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/data/DocumentBase
         6: invokevirtual #334                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #818                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #61                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 88: 0
}
SourceFile: "DocumentBase.java"
BootstrapMethods:
  0: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #943 Not skilltype found for: \u0001
  1: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #945 \u0001 requires triggerId
  2: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #947 \u0001 requires chanceType
  3: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #949 Invalid chance condition: \u0001 \u0001
InnerClasses:
  public static final #962= #958 of #960; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
