// Bytecode for: ext.mods.gameserver.custom.data.BossHpAnnounceData
// File: ext\mods\gameserver\custom\data\BossHpAnnounceData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/BossHpAnnounceData.class
  Last modified 9 de jul de 2026; size 5951 bytes
  MD5 checksum 67add182293b4e80741d3f573c3d2f81
  Compiled from "BossHpAnnounceData.java"
public class ext.mods.gameserver.custom.data.BossHpAnnounceData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/custom/data/BossHpAnnounceData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 11, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/custom/data/BossHpAnnounceData._enabled:Z
    #8 = Class              #10           // ext/mods/gameserver/custom/data/BossHpAnnounceData
    #9 = NameAndType        #11:#12       // _enabled:Z
   #10 = Utf8               ext/mods/gameserver/custom/data/BossHpAnnounceData
   #11 = Utf8               _enabled
   #12 = Utf8               Z
   #13 = Class              #14           // java/util/concurrent/ConcurrentHashMap
   #14 = Utf8               java/util/concurrent/ConcurrentHashMap
   #15 = Methodref          #13.#3        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/custom/data/BossHpAnnounceData._thresholds:Ljava/util/Map;
   #17 = NameAndType        #18:#19       // _thresholds:Ljava/util/Map;
   #18 = Utf8               _thresholds
   #19 = Utf8               Ljava/util/Map;
   #20 = Methodref          #8.#21        // ext/mods/gameserver/custom/data/BossHpAnnounceData.load:()V
   #21 = NameAndType        #22:#6        // load:()V
   #22 = Utf8               load
   #23 = InterfaceMethodref #24.#25       // java/util/Map.clear:()V
   #24 = Class              #26           // java/util/Map
   #25 = NameAndType        #27:#6        // clear:()V
   #26 = Utf8               java/util/Map
   #27 = Utf8               clear
   #28 = String             #29           // custom/mods/bossHpAnnounce.xml
   #29 = Utf8               custom/mods/bossHpAnnounce.xml
   #30 = Methodref          #8.#31        // ext/mods/gameserver/custom/data/BossHpAnnounceData.parseDataFile:(Ljava/lang/String;)V
   #31 = NameAndType        #32:#33       // parseDataFile:(Ljava/lang/String;)V
   #32 = Utf8               parseDataFile
   #33 = Utf8               (Ljava/lang/String;)V
   #34 = Fieldref           #8.#35        // ext/mods/gameserver/custom/data/BossHpAnnounceData.LOGGER:Lext/mods/commons/logging/CLogger;
   #35 = NameAndType        #36:#37       // LOGGER:Lext/mods/commons/logging/CLogger;
   #36 = Utf8               LOGGER
   #37 = Utf8               Lext/mods/commons/logging/CLogger;
   #38 = Methodref          #2.#39        // java/lang/Object.getClass:()Ljava/lang/Class;
   #39 = NameAndType        #40:#41       // getClass:()Ljava/lang/Class;
   #40 = Utf8               getClass
   #41 = Utf8               ()Ljava/lang/Class;
   #42 = Methodref          #43.#44       // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #43 = Class              #45           // java/lang/Class
   #44 = NameAndType        #46:#47       // getSimpleName:()Ljava/lang/String;
   #45 = Utf8               java/lang/Class
   #46 = Utf8               getSimpleName
   #47 = Utf8               ()Ljava/lang/String;
   #48 = InterfaceMethodref #24.#49       // java/util/Map.size:()I
   #49 = NameAndType        #50:#51       // size:()I
   #50 = Utf8               size
   #51 = Utf8               ()I
   #52 = InvokeDynamic      #0:#53        // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #53 = NameAndType        #54:#55       // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #54 = Utf8               makeConcatWithConstants
   #55 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #56 = Methodref          #57.#58       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #57 = Class              #59           // ext/mods/commons/logging/CLogger
   #58 = NameAndType        #60:#61       // info:(Ljava/lang/Object;)V
   #59 = Utf8               ext/mods/commons/logging/CLogger
   #60 = Utf8               info
   #61 = Utf8               (Ljava/lang/Object;)V
   #62 = String             #63           // list
   #63 = Utf8               list
   #64 = InvokeDynamic      #1:#65        // #1:accept:(Lext/mods/gameserver/custom/data/BossHpAnnounceData;)Ljava/util/function/Consumer;
   #65 = NameAndType        #66:#67       // accept:(Lext/mods/gameserver/custom/data/BossHpAnnounceData;)Ljava/util/function/Consumer;
   #66 = Utf8               accept
   #67 = Utf8               (Lext/mods/gameserver/custom/data/BossHpAnnounceData;)Ljava/util/function/Consumer;
   #68 = Methodref          #8.#69        // ext/mods/gameserver/custom/data/BossHpAnnounceData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #69 = NameAndType        #70:#71       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #70 = Utf8               forEach
   #71 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #72 = Methodref          #73.#74       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #73 = Class              #75           // java/lang/Integer
   #74 = NameAndType        #76:#77       // valueOf:(I)Ljava/lang/Integer;
   #75 = Utf8               java/lang/Integer
   #76 = Utf8               valueOf
   #77 = Utf8               (I)Ljava/lang/Integer;
   #78 = InterfaceMethodref #24.#79       // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #79 = NameAndType        #80:#81       // containsKey:(Ljava/lang/Object;)Z
   #80 = Utf8               containsKey
   #81 = Utf8               (Ljava/lang/Object;)Z
   #82 = Methodref          #83.#84       // java/util/Collections.emptyList:()Ljava/util/List;
   #83 = Class              #85           // java/util/Collections
   #84 = NameAndType        #86:#87       // emptyList:()Ljava/util/List;
   #85 = Utf8               java/util/Collections
   #86 = Utf8               emptyList
   #87 = Utf8               ()Ljava/util/List;
   #88 = InterfaceMethodref #24.#89       // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #89 = NameAndType        #90:#91       // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #90 = Utf8               getOrDefault
   #91 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #92 = Class              #93           // java/util/List
   #93 = Utf8               java/util/List
   #94 = Fieldref           #95.#96       // ext/mods/gameserver/custom/data/BossHpAnnounceData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/BossHpAnnounceData;
   #95 = Class              #97           // ext/mods/gameserver/custom/data/BossHpAnnounceData$SingletonHolder
   #96 = NameAndType        #98:#99       // INSTANCE:Lext/mods/gameserver/custom/data/BossHpAnnounceData;
   #97 = Utf8               ext/mods/gameserver/custom/data/BossHpAnnounceData$SingletonHolder
   #98 = Utf8               INSTANCE
   #99 = Utf8               Lext/mods/gameserver/custom/data/BossHpAnnounceData;
  #100 = InterfaceMethodref #101.#102     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #101 = Class              #103          // org/w3c/dom/Node
  #102 = NameAndType        #104:#105     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #103 = Utf8               org/w3c/dom/Node
  #104 = Utf8               getAttributes
  #105 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #106 = String             #107          // enabled
  #107 = Utf8               enabled
  #108 = InterfaceMethodref #109.#110     // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #109 = Class              #111          // org/w3c/dom/NamedNodeMap
  #110 = NameAndType        #112:#113     // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #111 = Utf8               org/w3c/dom/NamedNodeMap
  #112 = Utf8               getNamedItem
  #113 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
  #114 = InterfaceMethodref #101.#115     // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
  #115 = NameAndType        #116:#47      // getNodeValue:()Ljava/lang/String;
  #116 = Utf8               getNodeValue
  #117 = Methodref          #118.#119     // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
  #118 = Class              #120          // java/lang/Boolean
  #119 = NameAndType        #121:#122     // parseBoolean:(Ljava/lang/String;)Z
  #120 = Utf8               java/lang/Boolean
  #121 = Utf8               parseBoolean
  #122 = Utf8               (Ljava/lang/String;)Z
  #123 = String             #124          // boss
  #124 = Utf8               boss
  #125 = InvokeDynamic      #2:#65        // #2:accept:(Lext/mods/gameserver/custom/data/BossHpAnnounceData;)Ljava/util/function/Consumer;
  #126 = Class              #127          // ext/mods/commons/data/StatSet
  #127 = Utf8               ext/mods/commons/data/StatSet
  #128 = Methodref          #8.#129       // ext/mods/gameserver/custom/data/BossHpAnnounceData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #129 = NameAndType        #130:#131     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #130 = Utf8               parseAttributes
  #131 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #132 = Methodref          #126.#133     // ext/mods/commons/data/StatSet."<init>":(Lext/mods/commons/data/StatSet;)V
  #133 = NameAndType        #5:#134       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #134 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #135 = String             #136          // npcId
  #136 = Utf8               npcId
  #137 = Methodref          #126.#138     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #138 = NameAndType        #139:#140     // getInteger:(Ljava/lang/String;)I
  #139 = Utf8               getInteger
  #140 = Utf8               (Ljava/lang/String;)I
  #141 = Class              #142          // java/util/ArrayList
  #142 = Utf8               java/util/ArrayList
  #143 = Methodref          #141.#3       // java/util/ArrayList."<init>":()V
  #144 = String             #145          // hp
  #145 = Utf8               hp
  #146 = InvokeDynamic      #3:#147       // #3:accept:(Lext/mods/gameserver/custom/data/BossHpAnnounceData;Ljava/util/List;)Ljava/util/function/Consumer;
  #147 = NameAndType        #66:#148      // accept:(Lext/mods/gameserver/custom/data/BossHpAnnounceData;Ljava/util/List;)Ljava/util/function/Consumer;
  #148 = Utf8               (Lext/mods/gameserver/custom/data/BossHpAnnounceData;Ljava/util/List;)Ljava/util/function/Consumer;
  #149 = InvokeDynamic      #4:#150       // #4:compare:()Ljava/util/Comparator;
  #150 = NameAndType        #151:#152     // compare:()Ljava/util/Comparator;
  #151 = Utf8               compare
  #152 = Utf8               ()Ljava/util/Comparator;
  #153 = InterfaceMethodref #92.#154      // java/util/List.sort:(Ljava/util/Comparator;)V
  #154 = NameAndType        #155:#156     // sort:(Ljava/util/Comparator;)V
  #155 = Utf8               sort
  #156 = Utf8               (Ljava/util/Comparator;)V
  #157 = InterfaceMethodref #24.#158      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #158 = NameAndType        #159:#91      // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #159 = Utf8               put
  #160 = Fieldref           #161.#162     // ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold.percent:I
  #161 = Class              #163          // ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold
  #162 = NameAndType        #164:#165     // percent:I
  #163 = Utf8               ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold
  #164 = Utf8               percent
  #165 = Utf8               I
  #166 = Methodref          #73.#167      // java/lang/Integer.compare:(II)I
  #167 = NameAndType        #151:#168     // compare:(II)I
  #168 = Utf8               (II)I
  #169 = String             #164          // percent
  #170 = String             #171          // message
  #171 = Utf8               message
  #172 = String             #173          // %boss% reached %hp%% of life!
  #173 = Utf8               %boss% reached %hp%% of life!
  #174 = Methodref          #126.#175     // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #175 = NameAndType        #176:#177     // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #176 = Utf8               getString
  #177 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #178 = Methodref          #161.#179     // ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold."<init>":(ILjava/lang/String;)V
  #179 = NameAndType        #5:#180       // "<init>":(ILjava/lang/String;)V
  #180 = Utf8               (ILjava/lang/String;)V
  #181 = InterfaceMethodref #92.#182      // java/util/List.add:(Ljava/lang/Object;)Z
  #182 = NameAndType        #183:#81      // add:(Ljava/lang/Object;)Z
  #183 = Utf8               add
  #184 = Class              #185          // ext/mods/commons/data/xml/IXmlReader
  #185 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #186 = Utf8               Signature
  #187 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;>;>;
  #188 = Utf8               Code
  #189 = Utf8               LineNumberTable
  #190 = Utf8               LocalVariableTable
  #191 = Utf8               this
  #192 = Utf8               parseDocument
  #193 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #194 = Utf8               doc
  #195 = Utf8               Lorg/w3c/dom/Document;
  #196 = Utf8               path
  #197 = Utf8               Ljava/nio/file/Path;
  #198 = Utf8               isEnabled
  #199 = Utf8               ()Z
  #200 = Utf8               isAnnounceEnabledFor
  #201 = Utf8               (I)Z
  #202 = Utf8               StackMapTable
  #203 = Utf8               getThresholds
  #204 = Utf8               (I)Ljava/util/List;
  #205 = Utf8               (I)Ljava/util/List<Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;>;
  #206 = Utf8               getInstance
  #207 = Utf8               ()Lext/mods/gameserver/custom/data/BossHpAnnounceData;
  #208 = Utf8               lambda$parseDocument$0
  #209 = Utf8               (Lorg/w3c/dom/Node;)V
  #210 = Utf8               listNode
  #211 = Utf8               Lorg/w3c/dom/Node;
  #212 = Utf8               enabledNode
  #213 = Utf8               lambda$parseDocument$1
  #214 = Utf8               bossNode
  #215 = Utf8               set
  #216 = Utf8               Lext/mods/commons/data/StatSet;
  #217 = Utf8               Ljava/util/List;
  #218 = Utf8               LocalVariableTypeTable
  #219 = Utf8               Ljava/util/List<Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;>;
  #220 = Utf8               lambda$parseDocument$3
  #221 = Utf8               (Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;)I
  #222 = Utf8               a
  #223 = Utf8               Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;
  #224 = Utf8               b
  #225 = Utf8               lambda$parseDocument$2
  #226 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #227 = Utf8               hpNode
  #228 = Utf8               hpSet
  #229 = Utf8               Ljava/lang/String;
  #230 = Class              #231          // java/lang/String
  #231 = Utf8               java/lang/String
  #232 = Utf8               SourceFile
  #233 = Utf8               BossHpAnnounceData.java
  #234 = Utf8               NestMembers
  #235 = Utf8               BootstrapMethods
  #236 = String             #237          // \u0001: Loaded \u0001 boss HP announce configs.
  #237 = Utf8               \u0001: Loaded \u0001 boss HP announce configs.
  #238 = MethodType         #61           //  (Ljava/lang/Object;)V
  #239 = MethodHandle       5:#240        // REF_invokeVirtual ext/mods/gameserver/custom/data/BossHpAnnounceData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #240 = Methodref          #8.#241       // ext/mods/gameserver/custom/data/BossHpAnnounceData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #241 = NameAndType        #208:#209     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #242 = MethodType         #209          //  (Lorg/w3c/dom/Node;)V
  #243 = MethodHandle       5:#244        // REF_invokeVirtual ext/mods/gameserver/custom/data/BossHpAnnounceData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #244 = Methodref          #8.#245       // ext/mods/gameserver/custom/data/BossHpAnnounceData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #245 = NameAndType        #213:#209     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #246 = MethodHandle       5:#247        // REF_invokeVirtual ext/mods/gameserver/custom/data/BossHpAnnounceData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #247 = Methodref          #8.#248       // ext/mods/gameserver/custom/data/BossHpAnnounceData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #248 = NameAndType        #225:#226     // lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #249 = MethodType         #250          //  (Ljava/lang/Object;Ljava/lang/Object;)I
  #250 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)I
  #251 = MethodHandle       6:#252        // REF_invokeStatic ext/mods/gameserver/custom/data/BossHpAnnounceData.lambda$parseDocument$3:(Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;)I
  #252 = Methodref          #8.#253       // ext/mods/gameserver/custom/data/BossHpAnnounceData.lambda$parseDocument$3:(Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;)I
  #253 = NameAndType        #220:#221     // lambda$parseDocument$3:(Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;)I
  #254 = MethodType         #221          //  (Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;)I
  #255 = MethodHandle       6:#256        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #256 = Methodref          #257.#258     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #257 = Class              #259          // java/lang/invoke/StringConcatFactory
  #258 = NameAndType        #54:#260      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #259 = Utf8               java/lang/invoke/StringConcatFactory
  #260 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #261 = MethodHandle       6:#262        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #262 = Methodref          #263.#264     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #263 = Class              #265          // java/lang/invoke/LambdaMetafactory
  #264 = NameAndType        #266:#267     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #265 = Utf8               java/lang/invoke/LambdaMetafactory
  #266 = Utf8               metafactory
  #267 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #268 = Utf8               InnerClasses
  #269 = Utf8               SingletonHolder
  #270 = Utf8               HpThreshold
  #271 = Class              #272          // java/lang/invoke/MethodHandles$Lookup
  #272 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #273 = Class              #274          // java/lang/invoke/MethodHandles
  #274 = Utf8               java/lang/invoke/MethodHandles
  #275 = Utf8               Lookup
{
  protected ext.mods.gameserver.custom.data.BossHpAnnounceData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_1
         6: putfield      #7                  // Field _enabled:Z
         9: aload_0
        10: new           #13                 // class java/util/concurrent/ConcurrentHashMap
        13: dup
        14: invokespecial #15                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        17: putfield      #16                 // Field _thresholds:Ljava/util/Map;
        20: aload_0
        21: invokevirtual #20                 // Method load:()V
        24: return
      LineNumberTable:
        line 53: 0
        line 36: 4
        line 50: 9
        line 54: 20
        line 55: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/custom/data/BossHpAnnounceData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _thresholds:Ljava/util/Map;
         4: invokeinterface #23,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: ldc           #28                 // String custom/mods/bossHpAnnounce.xml
        12: invokevirtual #30                 // Method parseDataFile:(Ljava/lang/String;)V
        15: getstatic     #34                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        18: aload_0
        19: invokevirtual #38                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        22: invokevirtual #42                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
        25: aload_0
        26: getfield      #16                 // Field _thresholds:Ljava/util/Map;
        29: invokeinterface #48,  1           // InterfaceMethod java/util/Map.size:()I
        34: invokedynamic #52,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        39: invokevirtual #56                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        42: return
      LineNumberTable:
        line 60: 0
        line 61: 9
        line 62: 15
        line 63: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/custom/data/BossHpAnnounceData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #62                 // String list
         4: aload_0
         5: invokedynamic #64,  0             // InvokeDynamic #1:accept:(Lext/mods/gameserver/custom/data/BossHpAnnounceData;)Ljava/util/function/Consumer;
        10: invokevirtual #68                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 68: 0
        line 94: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/BossHpAnnounceData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public boolean isEnabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _enabled:Z
         4: ireturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/BossHpAnnounceData;

  public boolean isAnnounceEnabledFor(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _enabled:Z
         4: ifeq          27
         7: aload_0
         8: getfield      #16                 // Field _thresholds:Ljava/util/Map;
        11: iload_1
        12: invokestatic  #72                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        15: invokeinterface #78,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        20: ifeq          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/custom/data/BossHpAnnounceData;
            0      29     1 npcId   I
      StackMapTable: number_of_entries = 2
        frame_type = 27 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.util.List<ext.mods.gameserver.custom.data.BossHpAnnounceData$HpThreshold> getThresholds(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _thresholds:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #72                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokestatic  #82                 // Method java/util/Collections.emptyList:()Ljava/util/List;
        11: invokeinterface #88,  3           // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #92                 // class java/util/List
        19: areturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/custom/data/BossHpAnnounceData;
            0      20     1 npcId   I
    Signature: #205                         // (I)Ljava/util/List<Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;>;

  public static ext.mods.gameserver.custom.data.BossHpAnnounceData getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/BossHpAnnounceData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #94                 // Field ext/mods/gameserver/custom/data/BossHpAnnounceData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/BossHpAnnounceData;
         3: areturn
      LineNumberTable:
        line 113: 0
}
SourceFile: "BossHpAnnounceData.java"
NestMembers:
  ext/mods/gameserver/custom/data/BossHpAnnounceData$SingletonHolder
  ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold
BootstrapMethods:
  0: #255 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #236 \u0001: Loaded \u0001 boss HP announce configs.
  1: #261 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #238 (Ljava/lang/Object;)V
      #239 REF_invokeVirtual ext/mods/gameserver/custom/data/BossHpAnnounceData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #242 (Lorg/w3c/dom/Node;)V
  2: #261 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #238 (Ljava/lang/Object;)V
      #243 REF_invokeVirtual ext/mods/gameserver/custom/data/BossHpAnnounceData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #242 (Lorg/w3c/dom/Node;)V
  3: #261 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #238 (Ljava/lang/Object;)V
      #246 REF_invokeVirtual ext/mods/gameserver/custom/data/BossHpAnnounceData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #242 (Lorg/w3c/dom/Node;)V
  4: #261 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #249 (Ljava/lang/Object;Ljava/lang/Object;)I
      #251 REF_invokeStatic ext/mods/gameserver/custom/data/BossHpAnnounceData.lambda$parseDocument$3:(Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;)I
      #254 (Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;Lext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold;)I
InnerClasses:
  public static #270= #161 of #8;         // HpThreshold=class ext/mods/gameserver/custom/data/BossHpAnnounceData$HpThreshold of class ext/mods/gameserver/custom/data/BossHpAnnounceData
  public static final #275= #271 of #273; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
