// Bytecode for: ext.mods.gameserver.data.DocumentSkill
// File: ext\mods\gameserver\data\DocumentSkill.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/DocumentSkill.class
  Last modified 9 de jul de 2026; size 9671 bytes
  MD5 checksum 4ee06a66b39dce98b8f5ef57b7e7dd51
  Compiled from "DocumentSkill.java"
public final class ext.mods.gameserver.data.DocumentSkill extends ext.mods.gameserver.data.DocumentBase
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/data/DocumentSkill
  super_class: #2                         // ext/mods/gameserver/data/DocumentBase
  interfaces: 0, fields: 2, methods: 10, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/data/DocumentBase."<init>":(Ljava/io/File;)V
    #2 = Class              #4            // ext/mods/gameserver/data/DocumentBase
    #3 = NameAndType        #5:#6         // "<init>":(Ljava/io/File;)V
    #4 = Utf8               ext/mods/gameserver/data/DocumentBase
    #5 = Utf8               <init>
    #6 = Utf8               (Ljava/io/File;)V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#10        // java/util/ArrayList."<init>":()V
   #10 = NameAndType        #5:#11        // "<init>":()V
   #11 = Utf8               ()V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/data/DocumentSkill._skillsInFile:Ljava/util/List;
   #13 = Class              #15           // ext/mods/gameserver/data/DocumentSkill
   #14 = NameAndType        #16:#17       // _skillsInFile:Ljava/util/List;
   #15 = Utf8               ext/mods/gameserver/data/DocumentSkill
   #16 = Utf8               _skillsInFile
   #17 = Utf8               Ljava/util/List;
   #18 = Fieldref           #13.#19       // ext/mods/gameserver/data/DocumentSkill._currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
   #19 = NameAndType        #20:#21       // _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
   #20 = Utf8               _currentSkill
   #21 = Utf8               Lext/mods/gameserver/data/DocumentSkill$Skill;
   #22 = Fieldref           #23.#24       // ext/mods/gameserver/data/DocumentSkill$Skill.sets:[Lext/mods/commons/data/StatSet;
   #23 = Class              #25           // ext/mods/gameserver/data/DocumentSkill$Skill
   #24 = NameAndType        #26:#27       // sets:[Lext/mods/commons/data/StatSet;
   #25 = Utf8               ext/mods/gameserver/data/DocumentSkill$Skill
   #26 = Utf8               sets
   #27 = Utf8               [Lext/mods/commons/data/StatSet;
   #28 = Fieldref           #23.#29       // ext/mods/gameserver/data/DocumentSkill$Skill.currentLevel:I
   #29 = NameAndType        #30:#31       // currentLevel:I
   #30 = Utf8               currentLevel
   #31 = Utf8               I
   #32 = Fieldref           #13.#33       // ext/mods/gameserver/data/DocumentSkill._tables:Ljava/util/Map;
   #33 = NameAndType        #34:#35       // _tables:Ljava/util/Map;
   #34 = Utf8               _tables
   #35 = Utf8               Ljava/util/Map;
   #36 = InterfaceMethodref #37.#38       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #37 = Class              #39           // java/util/Map
   #38 = NameAndType        #40:#41       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #39 = Utf8               java/util/Map
   #40 = Utf8               get
   #41 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #42 = Class              #43           // "[Ljava/lang/String;"
   #43 = Utf8               [Ljava/lang/String;
   #44 = Class              #45           // java/lang/RuntimeException
   #45 = Utf8               java/lang/RuntimeException
   #46 = Fieldref           #13.#47       // ext/mods/gameserver/data/DocumentSkill.LOGGER:Lext/mods/commons/logging/CLogger;
   #47 = NameAndType        #48:#49       // LOGGER:Lext/mods/commons/logging/CLogger;
   #48 = Utf8               LOGGER
   #49 = Utf8               Lext/mods/commons/logging/CLogger;
   #50 = String             #51           // Error in table {} of Skill Id {}.
   #51 = Utf8               Error in table {} of Skill Id {}.
   #52 = Class              #53           // java/lang/Object
   #53 = Utf8               java/lang/Object
   #54 = Fieldref           #23.#55       // ext/mods/gameserver/data/DocumentSkill$Skill.id:I
   #55 = NameAndType        #56:#31       // id:I
   #56 = Utf8               id
   #57 = Methodref          #58.#59       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #58 = Class              #60           // java/lang/Integer
   #59 = NameAndType        #61:#62       // valueOf:(I)Ljava/lang/Integer;
   #60 = Utf8               java/lang/Integer
   #61 = Utf8               valueOf
   #62 = Utf8               (I)Ljava/lang/Integer;
   #63 = Methodref          #64.#65       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #64 = Class              #66           // ext/mods/commons/logging/CLogger
   #65 = NameAndType        #67:#68       // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #66 = Utf8               ext/mods/commons/logging/CLogger
   #67 = Utf8               error
   #68 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #69 = String             #70           //
   #70 = Utf8
   #71 = String             #72           // Wrong level count in skill Id {}.
   #72 = Utf8               Wrong level count in skill Id {}.
   #73 = InterfaceMethodref #74.#75       // org/w3c/dom/Document.getFirstChild:()Lorg/w3c/dom/Node;
   #74 = Class              #76           // org/w3c/dom/Document
   #75 = NameAndType        #77:#78       // getFirstChild:()Lorg/w3c/dom/Node;
   #76 = Utf8               org/w3c/dom/Document
   #77 = Utf8               getFirstChild
   #78 = Utf8               ()Lorg/w3c/dom/Node;
   #79 = String             #80           // list
   #80 = Utf8               list
   #81 = InterfaceMethodref #82.#83       // org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
   #82 = Class              #84           // org/w3c/dom/Node
   #83 = NameAndType        #85:#86       // getNodeName:()Ljava/lang/String;
   #84 = Utf8               org/w3c/dom/Node
   #85 = Utf8               getNodeName
   #86 = Utf8               ()Ljava/lang/String;
   #87 = Methodref          #88.#89       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #88 = Class              #90           // java/lang/String
   #89 = NameAndType        #91:#92       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #90 = Utf8               java/lang/String
   #91 = Utf8               equalsIgnoreCase
   #92 = Utf8               (Ljava/lang/String;)Z
   #93 = InterfaceMethodref #82.#75       // org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
   #94 = String             #95           // skill
   #95 = Utf8               skill
   #96 = Methodref          #23.#97       // ext/mods/gameserver/data/DocumentSkill$Skill."<init>":(Lext/mods/gameserver/data/DocumentSkill;)V
   #97 = NameAndType        #5:#98        // "<init>":(Lext/mods/gameserver/data/DocumentSkill;)V
   #98 = Utf8               (Lext/mods/gameserver/data/DocumentSkill;)V
   #99 = Methodref          #13.#100      // ext/mods/gameserver/data/DocumentSkill.setCurrentSkill:(Lext/mods/gameserver/data/DocumentSkill$Skill;)V
  #100 = NameAndType        #101:#102     // setCurrentSkill:(Lext/mods/gameserver/data/DocumentSkill$Skill;)V
  #101 = Utf8               setCurrentSkill
  #102 = Utf8               (Lext/mods/gameserver/data/DocumentSkill$Skill;)V
  #103 = Methodref          #13.#104      // ext/mods/gameserver/data/DocumentSkill.parseSkill:(Lorg/w3c/dom/Node;)V
  #104 = NameAndType        #105:#106     // parseSkill:(Lorg/w3c/dom/Node;)V
  #105 = Utf8               parseSkill
  #106 = Utf8               (Lorg/w3c/dom/Node;)V
  #107 = Fieldref           #23.#108      // ext/mods/gameserver/data/DocumentSkill$Skill.skills:Ljava/util/List;
  #108 = NameAndType        #109:#17      // skills:Ljava/util/List;
  #109 = Utf8               skills
  #110 = InterfaceMethodref #111.#112     // java/util/List.addAll:(Ljava/util/Collection;)Z
  #111 = Class              #113          // java/util/List
  #112 = NameAndType        #114:#115     // addAll:(Ljava/util/Collection;)Z
  #113 = Utf8               java/util/List
  #114 = Utf8               addAll
  #115 = Utf8               (Ljava/util/Collection;)Z
  #116 = Methodref          #13.#117      // ext/mods/gameserver/data/DocumentSkill.resetTable:()V
  #117 = NameAndType        #118:#11      // resetTable:()V
  #118 = Utf8               resetTable
  #119 = InterfaceMethodref #82.#120      // org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
  #120 = NameAndType        #121:#78      // getNextSibling:()Lorg/w3c/dom/Node;
  #121 = Utf8               getNextSibling
  #122 = InterfaceMethodref #82.#123      // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #123 = NameAndType        #124:#125     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #124 = Utf8               getAttributes
  #125 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #126 = String             #56           // id
  #127 = InterfaceMethodref #128.#129     // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #128 = Class              #130          // org/w3c/dom/NamedNodeMap
  #129 = NameAndType        #131:#132     // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #130 = Utf8               org/w3c/dom/NamedNodeMap
  #131 = Utf8               getNamedItem
  #132 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
  #133 = InterfaceMethodref #82.#134      // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
  #134 = NameAndType        #135:#86      // getNodeValue:()Ljava/lang/String;
  #135 = Utf8               getNodeValue
  #136 = Methodref          #58.#137      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #137 = NameAndType        #138:#139     // parseInt:(Ljava/lang/String;)I
  #138 = Utf8               parseInt
  #139 = Utf8               (Ljava/lang/String;)I
  #140 = String             #141          // name
  #141 = Utf8               name
  #142 = String             #143          // levels
  #143 = Utf8               levels
  #144 = String             #145          // enchantLevels1
  #145 = Utf8               enchantLevels1
  #146 = String             #147          // enchantLevels2
  #147 = Utf8               enchantLevels2
  #148 = Fieldref           #23.#149      // ext/mods/gameserver/data/DocumentSkill$Skill.name:Ljava/lang/String;
  #149 = NameAndType        #141:#150     // name:Ljava/lang/String;
  #150 = Utf8               Ljava/lang/String;
  #151 = Class              #152          // ext/mods/commons/data/StatSet
  #152 = Utf8               ext/mods/commons/data/StatSet
  #153 = Fieldref           #23.#154      // ext/mods/gameserver/data/DocumentSkill$Skill.enchsets1:[Lext/mods/commons/data/StatSet;
  #154 = NameAndType        #155:#27      // enchsets1:[Lext/mods/commons/data/StatSet;
  #155 = Utf8               enchsets1
  #156 = Fieldref           #23.#157      // ext/mods/gameserver/data/DocumentSkill$Skill.enchsets2:[Lext/mods/commons/data/StatSet;
  #157 = NameAndType        #158:#27      // enchsets2:[Lext/mods/commons/data/StatSet;
  #158 = Utf8               enchsets2
  #159 = Methodref          #151.#10      // ext/mods/commons/data/StatSet."<init>":()V
  #160 = String             #161          // skill_id
  #161 = Utf8               skill_id
  #162 = Methodref          #151.#163     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
  #163 = NameAndType        #164:#165     // set:(Ljava/lang/String;I)V
  #164 = Utf8               set
  #165 = Utf8               (Ljava/lang/String;I)V
  #166 = String             #167          // level
  #167 = Utf8               level
  #168 = Methodref          #151.#169     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
  #169 = NameAndType        #164:#170     // set:(Ljava/lang/String;Ljava/lang/String;)V
  #170 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #171 = InvokeDynamic      #0:#172       // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #172 = NameAndType        #173:#174     // makeConcatWithConstants:(II)Ljava/lang/String;
  #173 = Utf8               makeConcatWithConstants
  #174 = Utf8               (II)Ljava/lang/String;
  #175 = Methodref          #44.#176      // java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
  #176 = NameAndType        #5:#177       // "<init>":(Ljava/lang/String;)V
  #177 = Utf8               (Ljava/lang/String;)V
  #178 = String             #179          // table
  #179 = Utf8               table
  #180 = Methodref          #13.#181      // ext/mods/gameserver/data/DocumentSkill.parseTable:(Lorg/w3c/dom/Node;)V
  #181 = NameAndType        #182:#106     // parseTable:(Lorg/w3c/dom/Node;)V
  #182 = Utf8               parseTable
  #183 = String             #164          // set
  #184 = Methodref          #13.#185      // ext/mods/gameserver/data/DocumentSkill.parseBeanSet:(Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
  #185 = NameAndType        #186:#187     // parseBeanSet:(Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
  #186 = Utf8               parseBeanSet
  #187 = Utf8               (Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
  #188 = String             #189          // enchant1
  #189 = Utf8               enchant1
  #190 = String             #191          // enchant2
  #191 = Utf8               enchant2
  #192 = Methodref          #13.#193      // ext/mods/gameserver/data/DocumentSkill.makeSkills:()V
  #193 = NameAndType        #194:#11      // makeSkills:()V
  #194 = Utf8               makeSkills
  #195 = String             #196          // cond
  #196 = Utf8               cond
  #197 = Fieldref           #23.#198      // ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
  #198 = NameAndType        #199:#17      // currentSkills:Ljava/util/List;
  #199 = Utf8               currentSkills
  #200 = InterfaceMethodref #111.#201     // java/util/List.get:(I)Ljava/lang/Object;
  #201 = NameAndType        #40:#202      // get:(I)Ljava/lang/Object;
  #202 = Utf8               (I)Ljava/lang/Object;
  #203 = Methodref          #13.#204      // ext/mods/gameserver/data/DocumentSkill.parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #204 = NameAndType        #205:#206     // parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #205 = Utf8               parseCondition
  #206 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
  #207 = String             #208          // msg
  #208 = Utf8               msg
  #209 = String             #210          // msgId
  #210 = Utf8               msgId
  #211 = Methodref          #212.#213     // ext/mods/gameserver/skills/conditions/Condition.setMessage:(Ljava/lang/String;)V
  #212 = Class              #214          // ext/mods/gameserver/skills/conditions/Condition
  #213 = NameAndType        #215:#177     // setMessage:(Ljava/lang/String;)V
  #214 = Utf8               ext/mods/gameserver/skills/conditions/Condition
  #215 = Utf8               setMessage
  #216 = Methodref          #13.#217      // ext/mods/gameserver/data/DocumentSkill.getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
  #217 = NameAndType        #218:#219     // getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
  #218 = Utf8               getValue
  #219 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
  #220 = Methodref          #58.#221      // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #221 = NameAndType        #222:#223     // decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #222 = Utf8               decode
  #223 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #224 = Methodref          #58.#225      // java/lang/Integer.intValue:()I
  #225 = NameAndType        #226:#227     // intValue:()I
  #226 = Utf8               intValue
  #227 = Utf8               ()I
  #228 = Methodref          #212.#229     // ext/mods/gameserver/skills/conditions/Condition.setMessageId:(I)V
  #229 = NameAndType        #230:#231     // setMessageId:(I)V
  #230 = Utf8               setMessageId
  #231 = Utf8               (I)V
  #232 = String             #233          // addName
  #233 = Utf8               addName
  #234 = Methodref          #212.#235     // ext/mods/gameserver/skills/conditions/Condition.addName:()V
  #235 = NameAndType        #233:#11      // addName:()V
  #236 = Class              #237          // ext/mods/gameserver/skills/L2Skill
  #237 = Utf8               ext/mods/gameserver/skills/L2Skill
  #238 = Methodref          #236.#239     // ext/mods/gameserver/skills/L2Skill.attach:(Lext/mods/gameserver/skills/conditions/Condition;Z)V
  #239 = NameAndType        #240:#241     // attach:(Lext/mods/gameserver/skills/conditions/Condition;Z)V
  #240 = Utf8               attach
  #241 = Utf8               (Lext/mods/gameserver/skills/conditions/Condition;Z)V
  #242 = String             #243          // for
  #243 = Utf8               for
  #244 = Methodref          #13.#245      // ext/mods/gameserver/data/DocumentSkill.parseTemplate:(Lorg/w3c/dom/Node;Ljava/lang/Object;)V
  #245 = NameAndType        #246:#247     // parseTemplate:(Lorg/w3c/dom/Node;Ljava/lang/Object;)V
  #246 = Utf8               parseTemplate
  #247 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Object;)V
  #248 = String             #249          // enchant1cond
  #249 = Utf8               enchant1cond
  #250 = String             #251          // enchant1for
  #251 = Utf8               enchant1for
  #252 = String             #253          // enchant2cond
  #253 = Utf8               enchant2cond
  #254 = String             #255          // enchant2for
  #255 = Utf8               enchant2for
  #256 = Methodref          #7.#257       // java/util/ArrayList."<init>":(I)V
  #257 = NameAndType        #5:#231       // "<init>":(I)V
  #258 = String             #259          // skillType
  #259 = Utf8               skillType
  #260 = Class              #261          // ext/mods/gameserver/enums/skills/SkillType
  #261 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #262 = Methodref          #151.#263     // ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
  #263 = NameAndType        #264:#265     // getEnum:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
  #264 = Utf8               getEnum
  #265 = Utf8               (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;
  #266 = Methodref          #260.#267     // ext/mods/gameserver/enums/skills/SkillType.makeSkill:(Lext/mods/commons/data/StatSet;)Lext/mods/gameserver/skills/L2Skill;
  #267 = NameAndType        #268:#269     // makeSkill:(Lext/mods/commons/data/StatSet;)Lext/mods/gameserver/skills/L2Skill;
  #268 = Utf8               makeSkill
  #269 = Utf8               (Lext/mods/commons/data/StatSet;)Lext/mods/gameserver/skills/L2Skill;
  #270 = InterfaceMethodref #111.#271     // java/util/List.add:(ILjava/lang/Object;)V
  #271 = NameAndType        #272:#273     // add:(ILjava/lang/Object;)V
  #272 = Utf8               add
  #273 = Utf8               (ILjava/lang/Object;)V
  #274 = Class              #275          // java/lang/Exception
  #275 = Utf8               java/lang/Exception
  #276 = String             #277          // Failed parsing skill.
  #277 = Utf8               Failed parsing skill.
  #278 = Methodref          #64.#279      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #279 = NameAndType        #67:#280      // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #280 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #281 = Methodref          #2.#282       // ext/mods/gameserver/data/DocumentBase.parse:()Lorg/w3c/dom/Document;
  #282 = NameAndType        #283:#284     // parse:()Lorg/w3c/dom/Document;
  #283 = Utf8               parse
  #284 = Utf8               ()Lorg/w3c/dom/Document;
  #285 = Utf8               Signature
  #286 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #287 = Utf8               Code
  #288 = Utf8               LineNumberTable
  #289 = Utf8               LocalVariableTable
  #290 = Utf8               this
  #291 = Utf8               Lext/mods/gameserver/data/DocumentSkill;
  #292 = Utf8               file
  #293 = Utf8               Ljava/io/File;
  #294 = Utf8               getStatSet
  #295 = Utf8               ()Lext/mods/commons/data/StatSet;
  #296 = Utf8               getSkills
  #297 = Utf8               ()Ljava/util/List;
  #298 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #299 = Utf8               getTableValue
  #300 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #301 = Utf8               e
  #302 = Utf8               Ljava/lang/RuntimeException;
  #303 = Utf8               StackMapTable
  #304 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #305 = Utf8               idx
  #306 = Utf8               parseDocument
  #307 = Utf8               (Lorg/w3c/dom/Document;)V
  #308 = Utf8               d
  #309 = Utf8               Lorg/w3c/dom/Node;
  #310 = Utf8               n
  #311 = Utf8               doc
  #312 = Utf8               Lorg/w3c/dom/Document;
  #313 = Utf8               i
  #314 = Utf8               condition
  #315 = Utf8               Lext/mods/gameserver/skills/conditions/Condition;
  #316 = Utf8               foundCond
  #317 = Utf8               Z
  #318 = Utf8               foundFor
  #319 = Utf8               attrs
  #320 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #321 = Utf8               skillId
  #322 = Utf8               skillName
  #323 = Utf8               lastLvl
  #324 = Utf8               first
  #325 = Utf8               Ljava/lang/Exception;
  #326 = Utf8               count
  #327 = Utf8               _count
  #328 = Utf8               SourceFile
  #329 = Utf8               DocumentSkill.java
  #330 = Utf8               NestMembers
  #331 = Utf8               BootstrapMethods
  #332 = String             #333          // Skill id=\u0001 number of levels missmatch, \u0001 levels expected
  #333 = Utf8               Skill id=\u0001 number of levels missmatch, \u0001 levels expected
  #334 = MethodHandle       6:#335        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #335 = Methodref          #336.#337     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #336 = Class              #338          // java/lang/invoke/StringConcatFactory
  #337 = NameAndType        #173:#339     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #338 = Utf8               java/lang/invoke/StringConcatFactory
  #339 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #340 = Utf8               InnerClasses
  #341 = Utf8               Skill
  #342 = Class              #343          // java/lang/invoke/MethodHandles$Lookup
  #343 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #344 = Class              #345          // java/lang/invoke/MethodHandles
  #345 = Utf8               java/lang/invoke/MethodHandles
  #346 = Utf8               Lookup
{
  public ext.mods.gameserver.data.DocumentSkill(java.io.File);
    descriptor: (Ljava/io/File;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/data/DocumentBase."<init>":(Ljava/io/File;)V
         5: aload_0
         6: new           #7                  // class java/util/ArrayList
         9: dup
        10: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        13: putfield      #12                 // Field _skillsInFile:Ljava/util/List;
        16: return
      LineNumberTable:
        line 53: 0
        line 49: 5
        line 54: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/DocumentSkill;
            0      17     1  file   Ljava/io/File;

  protected ext.mods.commons.data.StatSet getStatSet();
    descriptor: ()Lext/mods/commons/data/StatSet;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
         4: getfield      #22                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.sets:[Lext/mods/commons/data/StatSet;
         7: aload_0
         8: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
        11: getfield      #28                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentLevel:I
        14: aaload
        15: areturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/data/DocumentSkill;

  public java.util.List<ext.mods.gameserver.skills.L2Skill> getSkills();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _skillsInFile:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/DocumentSkill;
    Signature: #298                         // ()Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  protected java.lang.String getTableValue(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=3, args_size=2
         0: aload_0
         1: getfield      #32                 // Field _tables:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #36,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #42                 // class "[Ljava/lang/String;"
        13: aload_0
        14: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
        17: getfield      #28                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentLevel:I
        20: aaload
        21: areturn
        22: astore_2
        23: getstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        26: ldc           #50                 // String Error in table {} of Skill Id {}.
        28: aload_2
        29: iconst_2
        30: anewarray     #52                 // class java/lang/Object
        33: dup
        34: iconst_0
        35: aload_1
        36: aastore
        37: dup
        38: iconst_1
        39: aload_0
        40: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
        43: getfield      #54                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.id:I
        46: invokestatic  #57                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        49: aastore
        50: invokevirtual #63                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        53: ldc           #69                 // String
        55: areturn
      Exception table:
         from    to  target type
             0    21    22   Class java/lang/RuntimeException
      LineNumberTable:
        line 77: 0
        line 79: 22
        line 81: 23
        line 82: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23      33     2     e   Ljava/lang/RuntimeException;
            0      56     0  this   Lext/mods/gameserver/data/DocumentSkill;
            0      56     1  name   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/lang/RuntimeException ]

  protected java.lang.String getTableValue(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=4, args_size=3
         0: aload_0
         1: getfield      #32                 // Field _tables:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #36,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #42                 // class "[Ljava/lang/String;"
        13: iload_2
        14: iconst_1
        15: isub
        16: aaload
        17: areturn
        18: astore_3
        19: getstatic     #46                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        22: ldc           #71                 // String Wrong level count in skill Id {}.
        24: aload_3
        25: iconst_1
        26: anewarray     #52                 // class java/lang/Object
        29: dup
        30: iconst_0
        31: aload_0
        32: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
        35: getfield      #54                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.id:I
        38: invokestatic  #57                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        41: aastore
        42: invokevirtual #63                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        45: ldc           #69                 // String
        47: areturn
      Exception table:
         from    to  target type
             0    17    18   Class java/lang/RuntimeException
      LineNumberTable:
        line 91: 0
        line 93: 18
        line 95: 19
        line 96: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19      29     3     e   Ljava/lang/RuntimeException;
            0      48     0  this   Lext/mods/gameserver/data/DocumentSkill;
            0      48     1  name   Ljava/lang/String;
            0      48     2   idx   I
      StackMapTable: number_of_entries = 1
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class java/lang/RuntimeException ]

  protected void parseDocument(org.w3c.dom.Document);
    descriptor: (Lorg/w3c/dom/Document;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=4, args_size=2
         0: aload_1
         1: invokeinterface #73,  1           // InterfaceMethod org/w3c/dom/Document.getFirstChild:()Lorg/w3c/dom/Node;
         6: astore_2
         7: aload_2
         8: ifnull        159
        11: ldc           #79                 // String list
        13: aload_2
        14: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        19: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        22: ifeq          101
        25: aload_2
        26: invokeinterface #93,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
        31: astore_3
        32: aload_3
        33: ifnull        98
        36: ldc           #94                 // String skill
        38: aload_3
        39: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        44: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        47: ifeq          88
        50: aload_0
        51: new           #23                 // class ext/mods/gameserver/data/DocumentSkill$Skill
        54: dup
        55: aload_0
        56: invokespecial #96                 // Method ext/mods/gameserver/data/DocumentSkill$Skill."<init>":(Lext/mods/gameserver/data/DocumentSkill;)V
        59: invokevirtual #99                 // Method setCurrentSkill:(Lext/mods/gameserver/data/DocumentSkill$Skill;)V
        62: aload_0
        63: aload_3
        64: invokevirtual #103                // Method parseSkill:(Lorg/w3c/dom/Node;)V
        67: aload_0
        68: getfield      #12                 // Field _skillsInFile:Ljava/util/List;
        71: aload_0
        72: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
        75: getfield      #107                // Field ext/mods/gameserver/data/DocumentSkill$Skill.skills:Ljava/util/List;
        78: invokeinterface #110,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
        83: pop
        84: aload_0
        85: invokevirtual #116                // Method resetTable:()V
        88: aload_3
        89: invokeinterface #119,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
        94: astore_3
        95: goto          32
        98: goto          149
       101: ldc           #94                 // String skill
       103: aload_2
       104: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       109: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       112: ifeq          149
       115: aload_0
       116: new           #23                 // class ext/mods/gameserver/data/DocumentSkill$Skill
       119: dup
       120: aload_0
       121: invokespecial #96                 // Method ext/mods/gameserver/data/DocumentSkill$Skill."<init>":(Lext/mods/gameserver/data/DocumentSkill;)V
       124: invokevirtual #99                 // Method setCurrentSkill:(Lext/mods/gameserver/data/DocumentSkill$Skill;)V
       127: aload_0
       128: aload_2
       129: invokevirtual #103                // Method parseSkill:(Lorg/w3c/dom/Node;)V
       132: aload_0
       133: getfield      #12                 // Field _skillsInFile:Ljava/util/List;
       136: aload_0
       137: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       140: getfield      #107                // Field ext/mods/gameserver/data/DocumentSkill$Skill.skills:Ljava/util/List;
       143: invokeinterface #110,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
       148: pop
       149: aload_2
       150: invokeinterface #119,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       155: astore_2
       156: goto          7
       159: return
      LineNumberTable:
        line 103: 0
        line 105: 11
        line 107: 25
        line 109: 36
        line 111: 50
        line 112: 62
        line 113: 67
        line 114: 84
        line 107: 88
        line 118: 101
        line 120: 115
        line 121: 127
        line 122: 132
        line 103: 149
        line 125: 159
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           32      66     3     d   Lorg/w3c/dom/Node;
            7     152     2     n   Lorg/w3c/dom/Node;
            0     160     0  this   Lext/mods/gameserver/data/DocumentSkill;
            0     160     1   doc   Lorg/w3c/dom/Document;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class org/w3c/dom/Node ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class org/w3c/dom/Node ]
        frame_type = 55 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 2 /* same */
        frame_type = 47 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9

  protected void parseSkill(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=15, args_size=2
         0: aload_1
         1: invokeinterface #122,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         6: astore_2
         7: iconst_0
         8: istore_3
         9: iconst_0
        10: istore        4
        12: aload_2
        13: ldc           #126                // String id
        15: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        20: invokeinterface #133,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        25: invokestatic  #136                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        28: istore        5
        30: aload_2
        31: ldc           #140                // String name
        33: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        38: invokeinterface #133,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        43: astore        6
        45: aload_2
        46: ldc           #142                // String levels
        48: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        53: invokeinterface #133,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        58: astore        7
        60: aload         7
        62: invokestatic  #136                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        65: istore        8
        67: aload_2
        68: ldc           #144                // String enchantLevels1
        70: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        75: ifnull        95
        78: aload_2
        79: ldc           #144                // String enchantLevels1
        81: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        86: invokeinterface #133,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        91: invokestatic  #136                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        94: istore_3
        95: aload_2
        96: ldc           #146                // String enchantLevels2
        98: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       103: ifnull        124
       106: aload_2
       107: ldc           #146                // String enchantLevels2
       109: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       114: invokeinterface #133,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       119: invokestatic  #136                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       122: istore        4
       124: aload_0
       125: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       128: iload         5
       130: putfield      #54                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.id:I
       133: aload_0
       134: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       137: aload         6
       139: putfield      #148                // Field ext/mods/gameserver/data/DocumentSkill$Skill.name:Ljava/lang/String;
       142: aload_0
       143: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       146: iload         8
       148: anewarray     #151                // class ext/mods/commons/data/StatSet
       151: putfield      #22                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.sets:[Lext/mods/commons/data/StatSet;
       154: aload_0
       155: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       158: iload_3
       159: anewarray     #151                // class ext/mods/commons/data/StatSet
       162: putfield      #153                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets1:[Lext/mods/commons/data/StatSet;
       165: aload_0
       166: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       169: iload         4
       171: anewarray     #151                // class ext/mods/commons/data/StatSet
       174: putfield      #156                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets2:[Lext/mods/commons/data/StatSet;
       177: iconst_0
       178: istore        9
       180: iload         9
       182: iload         8
       184: if_icmpge     273
       187: aload_0
       188: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       191: getfield      #22                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.sets:[Lext/mods/commons/data/StatSet;
       194: iload         9
       196: new           #151                // class ext/mods/commons/data/StatSet
       199: dup
       200: invokespecial #159                // Method ext/mods/commons/data/StatSet."<init>":()V
       203: aastore
       204: aload_0
       205: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       208: getfield      #22                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.sets:[Lext/mods/commons/data/StatSet;
       211: iload         9
       213: aaload
       214: ldc           #160                // String skill_id
       216: aload_0
       217: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       220: getfield      #54                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.id:I
       223: invokevirtual #162                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       226: aload_0
       227: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       230: getfield      #22                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.sets:[Lext/mods/commons/data/StatSet;
       233: iload         9
       235: aaload
       236: ldc           #166                // String level
       238: iload         9
       240: iconst_1
       241: iadd
       242: invokevirtual #162                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       245: aload_0
       246: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       249: getfield      #22                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.sets:[Lext/mods/commons/data/StatSet;
       252: iload         9
       254: aaload
       255: ldc           #140                // String name
       257: aload_0
       258: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       261: getfield      #148                // Field ext/mods/gameserver/data/DocumentSkill$Skill.name:Ljava/lang/String;
       264: invokevirtual #168                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       267: iinc          9, 1
       270: goto          180
       273: aload_0
       274: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       277: getfield      #22                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.sets:[Lext/mods/commons/data/StatSet;
       280: arraylength
       281: iload         8
       283: if_icmpeq     303
       286: new           #44                 // class java/lang/RuntimeException
       289: dup
       290: iload         5
       292: iload         8
       294: invokedynamic #171,  0            // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
       299: invokespecial #175                // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
       302: athrow
       303: aload_1
       304: invokeinterface #93,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
       309: astore        9
       311: aload         9
       313: astore_1
       314: aload_1
       315: ifnull        347
       318: ldc           #178                // String table
       320: aload_1
       321: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       326: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       329: ifeq          337
       332: aload_0
       333: aload_1
       334: invokevirtual #180                // Method parseTable:(Lorg/w3c/dom/Node;)V
       337: aload_1
       338: invokeinterface #119,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       343: astore_1
       344: goto          314
       347: iconst_1
       348: istore        10
       350: iload         10
       352: iload         8
       354: if_icmpgt     416
       357: aload         9
       359: astore_1
       360: aload_1
       361: ifnull        410
       364: ldc           #183                // String set
       366: aload_1
       367: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       372: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       375: ifeq          400
       378: aload_0
       379: aload_1
       380: aload_0
       381: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       384: getfield      #22                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.sets:[Lext/mods/commons/data/StatSet;
       387: iload         10
       389: iconst_1
       390: isub
       391: aaload
       392: iload         10
       394: invokestatic  #57                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       397: invokevirtual #184                // Method parseBeanSet:(Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
       400: aload_1
       401: invokeinterface #119,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       406: astore_1
       407: goto          360
       410: iinc          10, 1
       413: goto          350
       416: iconst_0
       417: istore        10
       419: iload         10
       421: iload_3
       422: if_icmpge     622
       425: aload_0
       426: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       429: getfield      #153                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets1:[Lext/mods/commons/data/StatSet;
       432: iload         10
       434: new           #151                // class ext/mods/commons/data/StatSet
       437: dup
       438: invokespecial #159                // Method ext/mods/commons/data/StatSet."<init>":()V
       441: aastore
       442: aload_0
       443: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       446: getfield      #153                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets1:[Lext/mods/commons/data/StatSet;
       449: iload         10
       451: aaload
       452: ldc           #160                // String skill_id
       454: aload_0
       455: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       458: getfield      #54                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.id:I
       461: invokevirtual #162                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       464: aload_0
       465: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       468: getfield      #153                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets1:[Lext/mods/commons/data/StatSet;
       471: iload         10
       473: aaload
       474: ldc           #166                // String level
       476: iload         10
       478: bipush        101
       480: iadd
       481: invokevirtual #162                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       484: aload_0
       485: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       488: getfield      #153                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets1:[Lext/mods/commons/data/StatSet;
       491: iload         10
       493: aaload
       494: ldc           #140                // String name
       496: aload_0
       497: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       500: getfield      #148                // Field ext/mods/gameserver/data/DocumentSkill$Skill.name:Ljava/lang/String;
       503: invokevirtual #168                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       506: aload         9
       508: astore_1
       509: aload_1
       510: ifnull        563
       513: ldc           #183                // String set
       515: aload_1
       516: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       521: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       524: ifeq          553
       527: aload_0
       528: aload_1
       529: aload_0
       530: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       533: getfield      #153                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets1:[Lext/mods/commons/data/StatSet;
       536: iload         10
       538: aaload
       539: aload_0
       540: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       543: getfield      #22                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.sets:[Lext/mods/commons/data/StatSet;
       546: arraylength
       547: invokestatic  #57                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       550: invokevirtual #184                // Method parseBeanSet:(Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
       553: aload_1
       554: invokeinterface #119,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       559: astore_1
       560: goto          509
       563: aload         9
       565: astore_1
       566: aload_1
       567: ifnull        616
       570: ldc           #188                // String enchant1
       572: aload_1
       573: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       578: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       581: ifeq          606
       584: aload_0
       585: aload_1
       586: aload_0
       587: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       590: getfield      #153                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets1:[Lext/mods/commons/data/StatSet;
       593: iload         10
       595: aaload
       596: iload         10
       598: iconst_1
       599: iadd
       600: invokestatic  #57                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       603: invokevirtual #184                // Method parseBeanSet:(Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
       606: aload_1
       607: invokeinterface #119,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       612: astore_1
       613: goto          566
       616: iinc          10, 1
       619: goto          419
       622: aload_0
       623: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       626: getfield      #153                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets1:[Lext/mods/commons/data/StatSet;
       629: arraylength
       630: iload_3
       631: if_icmpeq     650
       634: new           #44                 // class java/lang/RuntimeException
       637: dup
       638: iload         5
       640: iload_3
       641: invokedynamic #171,  0            // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
       646: invokespecial #175                // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
       649: athrow
       650: iconst_0
       651: istore        10
       653: iload         10
       655: iload         4
       657: if_icmpge     858
       660: aload_0
       661: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       664: getfield      #156                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets2:[Lext/mods/commons/data/StatSet;
       667: iload         10
       669: new           #151                // class ext/mods/commons/data/StatSet
       672: dup
       673: invokespecial #159                // Method ext/mods/commons/data/StatSet."<init>":()V
       676: aastore
       677: aload_0
       678: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       681: getfield      #156                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets2:[Lext/mods/commons/data/StatSet;
       684: iload         10
       686: aaload
       687: ldc           #160                // String skill_id
       689: aload_0
       690: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       693: getfield      #54                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.id:I
       696: invokevirtual #162                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       699: aload_0
       700: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       703: getfield      #156                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets2:[Lext/mods/commons/data/StatSet;
       706: iload         10
       708: aaload
       709: ldc           #166                // String level
       711: iload         10
       713: sipush        141
       716: iadd
       717: invokevirtual #162                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       720: aload_0
       721: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       724: getfield      #156                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets2:[Lext/mods/commons/data/StatSet;
       727: iload         10
       729: aaload
       730: ldc           #140                // String name
       732: aload_0
       733: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       736: getfield      #148                // Field ext/mods/gameserver/data/DocumentSkill$Skill.name:Ljava/lang/String;
       739: invokevirtual #168                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
       742: aload         9
       744: astore_1
       745: aload_1
       746: ifnull        799
       749: ldc           #183                // String set
       751: aload_1
       752: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       757: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       760: ifeq          789
       763: aload_0
       764: aload_1
       765: aload_0
       766: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       769: getfield      #156                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets2:[Lext/mods/commons/data/StatSet;
       772: iload         10
       774: aaload
       775: aload_0
       776: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       779: getfield      #22                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.sets:[Lext/mods/commons/data/StatSet;
       782: arraylength
       783: invokestatic  #57                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       786: invokevirtual #184                // Method parseBeanSet:(Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
       789: aload_1
       790: invokeinterface #119,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       795: astore_1
       796: goto          745
       799: aload         9
       801: astore_1
       802: aload_1
       803: ifnull        852
       806: ldc           #190                // String enchant2
       808: aload_1
       809: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       814: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       817: ifeq          842
       820: aload_0
       821: aload_1
       822: aload_0
       823: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       826: getfield      #156                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets2:[Lext/mods/commons/data/StatSet;
       829: iload         10
       831: aaload
       832: iload         10
       834: iconst_1
       835: iadd
       836: invokestatic  #57                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       839: invokevirtual #184                // Method parseBeanSet:(Lorg/w3c/dom/Node;Lext/mods/commons/data/StatSet;Ljava/lang/Integer;)V
       842: aload_1
       843: invokeinterface #119,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       848: astore_1
       849: goto          802
       852: iinc          10, 1
       855: goto          653
       858: aload_0
       859: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       862: getfield      #156                // Field ext/mods/gameserver/data/DocumentSkill$Skill.enchsets2:[Lext/mods/commons/data/StatSet;
       865: arraylength
       866: iload         4
       868: if_icmpeq     888
       871: new           #44                 // class java/lang/RuntimeException
       874: dup
       875: iload         5
       877: iload         4
       879: invokedynamic #171,  0            // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
       884: invokespecial #175                // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
       887: athrow
       888: aload_0
       889: invokevirtual #192                // Method makeSkills:()V
       892: iconst_0
       893: istore        10
       895: iload         10
       897: iload         8
       899: if_icmpge     1167
       902: aload_0
       903: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       906: iload         10
       908: putfield      #28                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentLevel:I
       911: aload         9
       913: astore_1
       914: aload_1
       915: ifnull        1161
       918: ldc           #195                // String cond
       920: aload_1
       921: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       926: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       929: ifeq          1118
       932: aload_0
       933: aload_1
       934: invokeinterface #93,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
       939: aload_0
       940: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
       943: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
       946: iload         10
       948: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       953: invokevirtual #203                // Method parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
       956: astore        11
       958: aload_1
       959: invokeinterface #122,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
       964: ldc           #207                // String msg
       966: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       971: astore        12
       973: aload_1
       974: invokeinterface #122,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
       979: ldc           #209                // String msgId
       981: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       986: astore        13
       988: aload         11
       990: ifnull        1013
       993: aload         12
       995: ifnull        1013
       998: aload         11
      1000: aload         12
      1002: invokeinterface #133,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1007: invokevirtual #211                // Method ext/mods/gameserver/skills/conditions/Condition.setMessage:(Ljava/lang/String;)V
      1010: goto          1092
      1013: aload         11
      1015: ifnull        1092
      1018: aload         13
      1020: ifnull        1092
      1023: aload         11
      1025: aload_0
      1026: aload         13
      1028: invokeinterface #133,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1033: aconst_null
      1034: invokevirtual #216                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1037: invokestatic  #220                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1040: invokevirtual #224                // Method java/lang/Integer.intValue:()I
      1043: invokevirtual #228                // Method ext/mods/gameserver/skills/conditions/Condition.setMessageId:(I)V
      1046: aload_1
      1047: invokeinterface #122,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
      1052: ldc           #232                // String addName
      1054: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
      1059: astore        14
      1061: aload         14
      1063: ifnull        1092
      1066: aload_0
      1067: aload         13
      1069: invokeinterface #133,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1074: aconst_null
      1075: invokevirtual #216                // Method getValue:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      1078: invokestatic  #220                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      1081: invokevirtual #224                // Method java/lang/Integer.intValue:()I
      1084: ifle          1092
      1087: aload         11
      1089: invokevirtual #234                // Method ext/mods/gameserver/skills/conditions/Condition.addName:()V
      1092: aload_0
      1093: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1096: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1099: iload         10
      1101: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1106: checkcast     #236                // class ext/mods/gameserver/skills/L2Skill
      1109: aload         11
      1111: iconst_0
      1112: invokevirtual #238                // Method ext/mods/gameserver/skills/L2Skill.attach:(Lext/mods/gameserver/skills/conditions/Condition;Z)V
      1115: goto          1151
      1118: ldc           #242                // String for
      1120: aload_1
      1121: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1126: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1129: ifeq          1151
      1132: aload_0
      1133: aload_1
      1134: aload_0
      1135: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1138: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1141: iload         10
      1143: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1148: invokevirtual #244                // Method parseTemplate:(Lorg/w3c/dom/Node;Ljava/lang/Object;)V
      1151: aload_1
      1152: invokeinterface #119,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
      1157: astore_1
      1158: goto          914
      1161: iinc          10, 1
      1164: goto          895
      1167: iload         8
      1169: istore        10
      1171: iload         10
      1173: iload         8
      1175: iload_3
      1176: iadd
      1177: if_icmpge     1547
      1180: aload_0
      1181: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1184: iload         10
      1186: iload         8
      1188: isub
      1189: putfield      #28                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentLevel:I
      1192: iconst_0
      1193: istore        11
      1195: iconst_0
      1196: istore        12
      1198: aload         9
      1200: astore_1
      1201: aload_1
      1202: ifnull        1357
      1205: ldc           #248                // String enchant1cond
      1207: aload_1
      1208: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1213: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1216: ifeq          1311
      1219: iconst_1
      1220: istore        11
      1222: aload_0
      1223: aload_1
      1224: invokeinterface #93,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
      1229: aload_0
      1230: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1233: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1236: iload         10
      1238: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1243: invokevirtual #203                // Method parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
      1246: astore        13
      1248: aload_1
      1249: invokeinterface #122,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
      1254: ldc           #207                // String msg
      1256: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
      1261: astore        14
      1263: aload         13
      1265: ifnull        1285
      1268: aload         14
      1270: ifnull        1285
      1273: aload         13
      1275: aload         14
      1277: invokeinterface #133,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1282: invokevirtual #211                // Method ext/mods/gameserver/skills/conditions/Condition.setMessage:(Ljava/lang/String;)V
      1285: aload_0
      1286: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1289: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1292: iload         10
      1294: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1299: checkcast     #236                // class ext/mods/gameserver/skills/L2Skill
      1302: aload         13
      1304: iconst_0
      1305: invokevirtual #238                // Method ext/mods/gameserver/skills/L2Skill.attach:(Lext/mods/gameserver/skills/conditions/Condition;Z)V
      1308: goto          1347
      1311: ldc           #250                // String enchant1for
      1313: aload_1
      1314: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1319: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1322: ifeq          1347
      1325: iconst_1
      1326: istore        12
      1328: aload_0
      1329: aload_1
      1330: aload_0
      1331: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1334: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1337: iload         10
      1339: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1344: invokevirtual #244                // Method parseTemplate:(Lorg/w3c/dom/Node;Ljava/lang/Object;)V
      1347: aload_1
      1348: invokeinterface #119,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
      1353: astore_1
      1354: goto          1201
      1357: iload         11
      1359: ifeq          1367
      1362: iload         12
      1364: ifne          1541
      1367: aload_0
      1368: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1371: iload         8
      1373: iconst_1
      1374: isub
      1375: putfield      #28                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentLevel:I
      1378: aload         9
      1380: astore_1
      1381: aload_1
      1382: ifnull        1541
      1385: iload         11
      1387: ifne          1493
      1390: ldc           #195                // String cond
      1392: aload_1
      1393: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1398: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1401: ifeq          1493
      1404: aload_0
      1405: aload_1
      1406: invokeinterface #93,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
      1411: aload_0
      1412: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1415: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1418: iload         10
      1420: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1425: invokevirtual #203                // Method parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
      1428: astore        13
      1430: aload_1
      1431: invokeinterface #122,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
      1436: ldc           #207                // String msg
      1438: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
      1443: astore        14
      1445: aload         13
      1447: ifnull        1467
      1450: aload         14
      1452: ifnull        1467
      1455: aload         13
      1457: aload         14
      1459: invokeinterface #133,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1464: invokevirtual #211                // Method ext/mods/gameserver/skills/conditions/Condition.setMessage:(Ljava/lang/String;)V
      1467: aload_0
      1468: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1471: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1474: iload         10
      1476: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1481: checkcast     #236                // class ext/mods/gameserver/skills/L2Skill
      1484: aload         13
      1486: iconst_0
      1487: invokevirtual #238                // Method ext/mods/gameserver/skills/L2Skill.attach:(Lext/mods/gameserver/skills/conditions/Condition;Z)V
      1490: goto          1531
      1493: iload         12
      1495: ifne          1531
      1498: ldc           #242                // String for
      1500: aload_1
      1501: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1506: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1509: ifeq          1531
      1512: aload_0
      1513: aload_1
      1514: aload_0
      1515: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1518: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1521: iload         10
      1523: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1528: invokevirtual #244                // Method parseTemplate:(Lorg/w3c/dom/Node;Ljava/lang/Object;)V
      1531: aload_1
      1532: invokeinterface #119,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
      1537: astore_1
      1538: goto          1381
      1541: iinc          10, 1
      1544: goto          1171
      1547: iload         8
      1549: iload_3
      1550: iadd
      1551: istore        10
      1553: iload         10
      1555: iload         8
      1557: iload_3
      1558: iadd
      1559: iload         4
      1561: iadd
      1562: if_icmpge     1934
      1565: iconst_0
      1566: istore        11
      1568: iconst_0
      1569: istore        12
      1571: aload_0
      1572: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1575: iload         10
      1577: iload         8
      1579: isub
      1580: iload_3
      1581: isub
      1582: putfield      #28                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentLevel:I
      1585: aload         9
      1587: astore_1
      1588: aload_1
      1589: ifnull        1744
      1592: ldc           #252                // String enchant2cond
      1594: aload_1
      1595: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1600: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1603: ifeq          1698
      1606: iconst_1
      1607: istore        11
      1609: aload_0
      1610: aload_1
      1611: invokeinterface #93,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
      1616: aload_0
      1617: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1620: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1623: iload         10
      1625: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1630: invokevirtual #203                // Method parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
      1633: astore        13
      1635: aload_1
      1636: invokeinterface #122,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
      1641: ldc           #207                // String msg
      1643: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
      1648: astore        14
      1650: aload         13
      1652: ifnull        1672
      1655: aload         14
      1657: ifnull        1672
      1660: aload         13
      1662: aload         14
      1664: invokeinterface #133,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1669: invokevirtual #211                // Method ext/mods/gameserver/skills/conditions/Condition.setMessage:(Ljava/lang/String;)V
      1672: aload_0
      1673: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1676: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1679: iload         10
      1681: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1686: checkcast     #236                // class ext/mods/gameserver/skills/L2Skill
      1689: aload         13
      1691: iconst_0
      1692: invokevirtual #238                // Method ext/mods/gameserver/skills/L2Skill.attach:(Lext/mods/gameserver/skills/conditions/Condition;Z)V
      1695: goto          1734
      1698: ldc           #254                // String enchant2for
      1700: aload_1
      1701: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1706: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1709: ifeq          1734
      1712: iconst_1
      1713: istore        12
      1715: aload_0
      1716: aload_1
      1717: aload_0
      1718: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1721: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1724: iload         10
      1726: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1731: invokevirtual #244                // Method parseTemplate:(Lorg/w3c/dom/Node;Ljava/lang/Object;)V
      1734: aload_1
      1735: invokeinterface #119,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
      1740: astore_1
      1741: goto          1588
      1744: iload         11
      1746: ifeq          1754
      1749: iload         12
      1751: ifne          1928
      1754: aload_0
      1755: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1758: iload         8
      1760: iconst_1
      1761: isub
      1762: putfield      #28                 // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentLevel:I
      1765: aload         9
      1767: astore_1
      1768: aload_1
      1769: ifnull        1928
      1772: iload         11
      1774: ifne          1880
      1777: ldc           #195                // String cond
      1779: aload_1
      1780: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1785: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1788: ifeq          1880
      1791: aload_0
      1792: aload_1
      1793: invokeinterface #93,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
      1798: aload_0
      1799: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1802: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1805: iload         10
      1807: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1812: invokevirtual #203                // Method parseCondition:(Lorg/w3c/dom/Node;Ljava/lang/Object;)Lext/mods/gameserver/skills/conditions/Condition;
      1815: astore        13
      1817: aload_1
      1818: invokeinterface #122,  1          // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
      1823: ldc           #207                // String msg
      1825: invokeinterface #127,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
      1830: astore        14
      1832: aload         13
      1834: ifnull        1854
      1837: aload         14
      1839: ifnull        1854
      1842: aload         13
      1844: aload         14
      1846: invokeinterface #133,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
      1851: invokevirtual #211                // Method ext/mods/gameserver/skills/conditions/Condition.setMessage:(Ljava/lang/String;)V
      1854: aload_0
      1855: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1858: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1861: iload         10
      1863: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1868: checkcast     #236                // class ext/mods/gameserver/skills/L2Skill
      1871: aload         13
      1873: iconst_0
      1874: invokevirtual #238                // Method ext/mods/gameserver/skills/L2Skill.attach:(Lext/mods/gameserver/skills/conditions/Condition;Z)V
      1877: goto          1918
      1880: iload         12
      1882: ifne          1918
      1885: ldc           #242                // String for
      1887: aload_1
      1888: invokeinterface #81,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
      1893: invokevirtual #87                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1896: ifeq          1918
      1899: aload_0
      1900: aload_1
      1901: aload_0
      1902: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1905: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1908: iload         10
      1910: invokeinterface #200,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1915: invokevirtual #244                // Method parseTemplate:(Lorg/w3c/dom/Node;Ljava/lang/Object;)V
      1918: aload_1
      1919: invokeinterface #119,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
      1924: astore_1
      1925: goto          1768
      1928: iinc          10, 1
      1931: goto          1553
      1934: aload_0
      1935: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1938: getfield      #107                // Field ext/mods/gameserver/data/DocumentSkill$Skill.skills:Ljava/util/List;
      1941: aload_0
      1942: getfield      #18                 // Field _currentSkill:Lext/mods/gameserver/data/DocumentSkill$Skill;
      1945: getfield      #197                // Field ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
      1948: invokeinterface #110,  2          // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
      1953: pop
      1954: return
      LineNumberTable:
        line 129: 0
        line 130: 7
        line 131: 9
        line 132: 12
        line 133: 30
        line 134: 45
        line 135: 60
        line 136: 67
        line 137: 78
        line 138: 95
        line 139: 106
        line 141: 124
        line 142: 133
        line 143: 142
        line 144: 154
        line 145: 165
        line 147: 177
        line 149: 187
        line 150: 204
        line 151: 226
        line 152: 245
        line 147: 267
        line 155: 273
        line 156: 286
        line 158: 303
        line 159: 311
        line 161: 318
        line 162: 332
        line 159: 337
        line 164: 347
        line 166: 357
        line 168: 364
        line 169: 378
        line 166: 400
        line 164: 410
        line 172: 416
        line 174: 425
        line 175: 442
        line 176: 464
        line 177: 484
        line 179: 506
        line 181: 513
        line 182: 527
        line 179: 553
        line 185: 563
        line 187: 570
        line 188: 584
        line 185: 606
        line 172: 616
        line 192: 622
        line 193: 634
        line 195: 650
        line 197: 660
        line 198: 677
        line 199: 699
        line 200: 720
        line 202: 742
        line 204: 749
        line 205: 763
        line 202: 789
        line 208: 799
        line 210: 806
        line 211: 820
        line 208: 842
        line 195: 852
        line 215: 858
        line 216: 871
        line 218: 888
        line 219: 892
        line 221: 902
        line 222: 911
        line 224: 918
        line 226: 932
        line 227: 958
        line 228: 973
        line 229: 988
        line 230: 998
        line 231: 1013
        line 233: 1023
        line 234: 1046
        line 235: 1061
        line 236: 1087
        line 238: 1092
        line 239: 1115
        line 240: 1118
        line 242: 1132
        line 222: 1151
        line 219: 1161
        line 246: 1167
        line 248: 1180
        line 249: 1192
        line 250: 1195
        line 252: 1198
        line 254: 1205
        line 256: 1219
        line 257: 1222
        line 258: 1248
        line 259: 1263
        line 260: 1273
        line 261: 1285
        line 262: 1308
        line 263: 1311
        line 265: 1325
        line 266: 1328
        line 252: 1347
        line 269: 1357
        line 271: 1367
        line 272: 1378
        line 274: 1385
        line 276: 1404
        line 277: 1430
        line 278: 1445
        line 279: 1455
        line 280: 1467
        line 281: 1490
        line 282: 1493
        line 284: 1512
        line 272: 1531
        line 246: 1541
        line 289: 1547
        line 291: 1565
        line 292: 1568
        line 294: 1571
        line 295: 1585
        line 297: 1592
        line 299: 1606
        line 300: 1609
        line 301: 1635
        line 302: 1650
        line 303: 1660
        line 304: 1672
        line 305: 1695
        line 306: 1698
        line 308: 1712
        line 309: 1715
        line 295: 1734
        line 312: 1744
        line 314: 1754
        line 315: 1765
        line 317: 1772
        line 319: 1791
        line 320: 1817
        line 321: 1832
        line 322: 1842
        line 323: 1854
        line 324: 1877
        line 325: 1880
        line 327: 1899
        line 315: 1918
        line 289: 1928
        line 332: 1934
        line 333: 1954
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          180      93     9     i   I
          350      66    10     i   I
          419     203    10     i   I
          653     205    10     i   I
         1061      31    14 addName   Lorg/w3c/dom/Node;
          958     157    11 condition   Lext/mods/gameserver/skills/conditions/Condition;
          973     142    12   msg   Lorg/w3c/dom/Node;
          988     127    13 msgId   Lorg/w3c/dom/Node;
          895     272    10     i   I
         1248      60    13 condition   Lext/mods/gameserver/skills/conditions/Condition;
         1263      45    14   msg   Lorg/w3c/dom/Node;
         1430      60    13 condition   Lext/mods/gameserver/skills/conditions/Condition;
         1445      45    14   msg   Lorg/w3c/dom/Node;
         1195     346    11 foundCond   Z
         1198     343    12 foundFor   Z
         1171     376    10     i   I
         1635      60    13 condition   Lext/mods/gameserver/skills/conditions/Condition;
         1650      45    14   msg   Lorg/w3c/dom/Node;
         1817      60    13 condition   Lext/mods/gameserver/skills/conditions/Condition;
         1832      45    14   msg   Lorg/w3c/dom/Node;
         1568     360    11 foundCond   Z
         1571     357    12 foundFor   Z
         1553     381    10     i   I
            0    1955     0  this   Lext/mods/gameserver/data/DocumentSkill;
            0    1955     1     n   Lorg/w3c/dom/Node;
            7    1948     2 attrs   Lorg/w3c/dom/NamedNodeMap;
            9    1946     3 enchantLevels1   I
           12    1943     4 enchantLevels2   I
           30    1925     5 skillId   I
           45    1910     6 skillName   Ljava/lang/String;
           60    1895     7 levels   Ljava/lang/String;
           67    1888     8 lastLvl   I
          311    1644     9 first   Lorg/w3c/dom/Node;
      StackMapTable: number_of_entries = 65
        frame_type = 255 /* full_frame */
          offset_delta = 95
          locals = [ class ext/mods/gameserver/data/DocumentSkill, class org/w3c/dom/Node, class org/w3c/dom/NamedNodeMap, int, int, int, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 28 /* same */
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 92
        frame_type = 29 /* same */
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class org/w3c/dom/Node ]
        frame_type = 22 /* same */
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 9 /* same */
        frame_type = 39 /* same */
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 89
        frame_type = 43 /* same */
        frame_type = 9 /* same */
        frame_type = 2 /* same */
        frame_type = 39 /* same */
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 27 /* same */
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 91
        frame_type = 43 /* same */
        frame_type = 9 /* same */
        frame_type = 2 /* same */
        frame_type = 39 /* same */
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 29 /* same */
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ int ]
        frame_type = 18 /* same */
        frame_type = 254 /* append */
          offset_delta = 98
          locals = [ class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/Node, class org/w3c/dom/Node ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 78
        frame_type = 248 /* chop */
          offset_delta = 25
        frame_type = 32 /* same */
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 3
          locals = [ int ]
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ int, int ]
        frame_type = 253 /* append */
          offset_delta = 83
          locals = [ class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/Node ]
        frame_type = 249 /* chop */
          offset_delta = 25
        frame_type = 35 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 13 /* same */
        frame_type = 253 /* append */
          offset_delta = 85
          locals = [ class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/Node ]
        frame_type = 249 /* chop */
          offset_delta = 25
        frame_type = 37 /* same */
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 5
          locals = [ int ]
        frame_type = 253 /* append */
          offset_delta = 34
          locals = [ int, int ]
        frame_type = 253 /* append */
          offset_delta = 83
          locals = [ class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/Node ]
        frame_type = 249 /* chop */
          offset_delta = 25
        frame_type = 35 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 13 /* same */
        frame_type = 253 /* append */
          offset_delta = 85
          locals = [ class ext/mods/gameserver/skills/conditions/Condition, class org/w3c/dom/Node ]
        frame_type = 249 /* chop */
          offset_delta = 25
        frame_type = 37 /* same */
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 250 /* chop */
          offset_delta = 5

  public org.w3c.dom.Document parse();
    descriptor: ()Lorg/w3c/dom/Document;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #281                // Method ext/mods/gameserver/data/DocumentBase.parse:()Lorg/w3c/dom/Document;
         4: areturn
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/DocumentSkill;
}
SourceFile: "DocumentSkill.java"
NestMembers:
  ext/mods/gameserver/data/DocumentSkill$Skill
BootstrapMethods:
  0: #334 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #332 Skill id=\u0001 number of levels missmatch, \u0001 levels expected
InnerClasses:
  public #341= #23 of #13;                // Skill=class ext/mods/gameserver/data/DocumentSkill$Skill of class ext/mods/gameserver/data/DocumentSkill
  public static final #346= #342 of #344; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
