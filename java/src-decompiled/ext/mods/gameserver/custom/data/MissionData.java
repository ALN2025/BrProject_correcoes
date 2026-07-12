// Bytecode for: ext.mods.gameserver.custom.data.MissionData
// File: ext\mods\gameserver\custom\data\MissionData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/MissionData.class
  Last modified 9 de jul de 2026; size 6101 bytes
  MD5 checksum 636898317eb0c5618c41429de81c5a25
  Compiled from "MissionData.java"
public class ext.mods.gameserver.custom.data.MissionData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/custom/data/MissionData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 12, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/LinkedHashMap
    #8 = Utf8               java/util/LinkedHashMap
    #9 = Methodref          #7.#3         // java/util/LinkedHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/custom/data/MissionData._missions:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/custom/data/MissionData
   #12 = NameAndType        #14:#15       // _missions:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/custom/data/MissionData
   #14 = Utf8               _missions
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/custom/data/MissionData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = Fieldref           #20.#21       // ext/mods/Config.ENABLE_MISSION:Z
   #20 = Class              #22           // ext/mods/Config
   #21 = NameAndType        #23:#24       // ENABLE_MISSION:Z
   #22 = Utf8               ext/mods/Config
   #23 = Utf8               ENABLE_MISSION
   #24 = Utf8               Z
   #25 = String             #26           // custom/mods/missions.xml
   #26 = Utf8               custom/mods/missions.xml
   #27 = Methodref          #11.#28       // ext/mods/gameserver/custom/data/MissionData.parseDataFile:(Ljava/lang/String;)V
   #28 = NameAndType        #29:#30       // parseDataFile:(Ljava/lang/String;)V
   #29 = Utf8               parseDataFile
   #30 = Utf8               (Ljava/lang/String;)V
   #31 = Fieldref           #11.#32       // ext/mods/gameserver/custom/data/MissionData.LOGGER:Lext/mods/commons/logging/CLogger;
   #32 = NameAndType        #33:#34       // LOGGER:Lext/mods/commons/logging/CLogger;
   #33 = Utf8               LOGGER
   #34 = Utf8               Lext/mods/commons/logging/CLogger;
   #35 = String             #36           // Loaded {} of {} mission data.
   #36 = Utf8               Loaded {} of {} mission data.
   #37 = InterfaceMethodref #38.#39       // java/util/Map.size:()I
   #38 = Class              #40           // java/util/Map
   #39 = NameAndType        #41:#42       // size:()I
   #40 = Utf8               java/util/Map
   #41 = Utf8               size
   #42 = Utf8               ()I
   #43 = Methodref          #44.#45       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #44 = Class              #46           // java/lang/Integer
   #45 = NameAndType        #47:#48       // valueOf:(I)Ljava/lang/Integer;
   #46 = Utf8               java/lang/Integer
   #47 = Utf8               valueOf
   #48 = Utf8               (I)Ljava/lang/Integer;
   #49 = Methodref          #50.#51       // ext/mods/gameserver/enums/actors/MissionType.values:()[Lext/mods/gameserver/enums/actors/MissionType;
   #50 = Class              #52           // ext/mods/gameserver/enums/actors/MissionType
   #51 = NameAndType        #53:#54       // values:()[Lext/mods/gameserver/enums/actors/MissionType;
   #52 = Utf8               ext/mods/gameserver/enums/actors/MissionType
   #53 = Utf8               values
   #54 = Utf8               ()[Lext/mods/gameserver/enums/actors/MissionType;
   #55 = Methodref          #56.#57       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #56 = Class              #58           // ext/mods/commons/logging/CLogger
   #57 = NameAndType        #59:#60       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #58 = Utf8               ext/mods/commons/logging/CLogger
   #59 = Utf8               info
   #60 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #61 = InterfaceMethodref #38.#62       // java/util/Map.clear:()V
   #62 = NameAndType        #63:#6        // clear:()V
   #63 = Utf8               clear
   #64 = String             #65           // list
   #65 = Utf8               list
   #66 = InvokeDynamic      #0:#67        // #0:accept:(Lext/mods/gameserver/custom/data/MissionData;)Ljava/util/function/Consumer;
   #67 = NameAndType        #68:#69       // accept:(Lext/mods/gameserver/custom/data/MissionData;)Ljava/util/function/Consumer;
   #68 = Utf8               accept
   #69 = Utf8               (Lext/mods/gameserver/custom/data/MissionData;)Ljava/util/function/Consumer;
   #70 = Methodref          #11.#71       // ext/mods/gameserver/custom/data/MissionData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #71 = NameAndType        #72:#73       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #72 = Utf8               forEach
   #73 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #74 = InterfaceMethodref #38.#75       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #75 = NameAndType        #76:#77       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #76 = Utf8               get
   #77 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #78 = Class              #79           // java/util/List
   #79 = Utf8               java/util/List
   #80 = InterfaceMethodref #78.#81       // java/util/List.stream:()Ljava/util/stream/Stream;
   #81 = NameAndType        #82:#83       // stream:()Ljava/util/stream/Stream;
   #82 = Utf8               stream
   #83 = Utf8               ()Ljava/util/stream/Stream;
   #84 = InvokeDynamic      #1:#85        // #1:test:(Lext/mods/gameserver/custom/data/MissionData;ILext/mods/gameserver/enums/actors/MissionType;)Ljava/util/function/Predicate;
   #85 = NameAndType        #86:#87       // test:(Lext/mods/gameserver/custom/data/MissionData;ILext/mods/gameserver/enums/actors/MissionType;)Ljava/util/function/Predicate;
   #86 = Utf8               test
   #87 = Utf8               (Lext/mods/gameserver/custom/data/MissionData;ILext/mods/gameserver/enums/actors/MissionType;)Ljava/util/function/Predicate;
   #88 = InterfaceMethodref #89.#90       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #89 = Class              #91           // java/util/stream/Stream
   #90 = NameAndType        #92:#93       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #91 = Utf8               java/util/stream/Stream
   #92 = Utf8               filter
   #93 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #94 = InterfaceMethodref #89.#95       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #95 = NameAndType        #96:#97       // findFirst:()Ljava/util/Optional;
   #96 = Utf8               findFirst
   #97 = Utf8               ()Ljava/util/Optional;
   #98 = Methodref          #99.#100      // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #99 = Class              #101          // java/util/Optional
  #100 = NameAndType        #102:#77      // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #101 = Utf8               java/util/Optional
  #102 = Utf8               orElse
  #103 = Class              #104          // ext/mods/gameserver/model/Mission
  #104 = Utf8               ext/mods/gameserver/model/Mission
  #105 = Fieldref           #106.#107     // ext/mods/gameserver/custom/data/MissionData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/MissionData;
  #106 = Class              #108          // ext/mods/gameserver/custom/data/MissionData$SingletonHolder
  #107 = NameAndType        #109:#110     // INSTANCE:Lext/mods/gameserver/custom/data/MissionData;
  #108 = Utf8               ext/mods/gameserver/custom/data/MissionData$SingletonHolder
  #109 = Utf8               INSTANCE
  #110 = Utf8               Lext/mods/gameserver/custom/data/MissionData;
  #111 = Methodref          #103.#112     // ext/mods/gameserver/model/Mission.getLevel:()I
  #112 = NameAndType        #113:#42      // getLevel:()I
  #113 = Utf8               getLevel
  #114 = InterfaceMethodref #78.#39       // java/util/List.size:()I
  #115 = Methodref          #116.#117     // java/lang/Math.clamp:(JII)I
  #116 = Class              #118          // java/lang/Math
  #117 = NameAndType        #119:#120     // clamp:(JII)I
  #118 = Utf8               java/lang/Math
  #119 = Utf8               clamp
  #120 = Utf8               (JII)I
  #121 = String             #122          // mission
  #122 = Utf8               mission
  #123 = InvokeDynamic      #2:#67        // #2:accept:(Lext/mods/gameserver/custom/data/MissionData;)Ljava/util/function/Consumer;
  #124 = InterfaceMethodref #125.#126     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #125 = Class              #127          // org/w3c/dom/Node
  #126 = NameAndType        #128:#129     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #127 = Utf8               org/w3c/dom/Node
  #128 = Utf8               getAttributes
  #129 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #130 = String             #131          // type
  #131 = Utf8               type
  #132 = InterfaceMethodref #133.#134     // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #133 = Class              #135          // org/w3c/dom/NamedNodeMap
  #134 = NameAndType        #136:#137     // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #135 = Utf8               org/w3c/dom/NamedNodeMap
  #136 = Utf8               getNamedItem
  #137 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
  #138 = InterfaceMethodref #125.#139     // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
  #139 = NameAndType        #140:#141     // getNodeValue:()Ljava/lang/String;
  #140 = Utf8               getNodeValue
  #141 = Utf8               ()Ljava/lang/String;
  #142 = Methodref          #50.#143      // ext/mods/gameserver/enums/actors/MissionType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/actors/MissionType;
  #143 = NameAndType        #47:#144      // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/actors/MissionType;
  #144 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/MissionType;
  #145 = Class              #146          // java/util/ArrayList
  #146 = Utf8               java/util/ArrayList
  #147 = Methodref          #145.#3       // java/util/ArrayList."<init>":()V
  #148 = String             #149          // stage
  #149 = Utf8               stage
  #150 = InvokeDynamic      #3:#151       // #3:accept:(Lext/mods/gameserver/custom/data/MissionData;Lorg/w3c/dom/NamedNodeMap;Ljava/util/List;)Ljava/util/function/Consumer;
  #151 = NameAndType        #68:#152      // accept:(Lext/mods/gameserver/custom/data/MissionData;Lorg/w3c/dom/NamedNodeMap;Ljava/util/List;)Ljava/util/function/Consumer;
  #152 = Utf8               (Lext/mods/gameserver/custom/data/MissionData;Lorg/w3c/dom/NamedNodeMap;Ljava/util/List;)Ljava/util/function/Consumer;
  #153 = InterfaceMethodref #38.#154      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #154 = NameAndType        #155:#156     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #155 = Utf8               put
  #156 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #157 = Methodref          #11.#158      // ext/mods/gameserver/custom/data/MissionData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #158 = NameAndType        #159:#160     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #159 = Utf8               parseAttributes
  #160 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #161 = String             #162          // name
  #162 = Utf8               name
  #163 = Methodref          #164.#165     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
  #164 = Class              #166          // ext/mods/commons/data/StatSet
  #165 = NameAndType        #167:#168     // set:(Ljava/lang/String;Ljava/lang/String;)V
  #166 = Utf8               ext/mods/commons/data/StatSet
  #167 = Utf8               set
  #168 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #169 = String             #170          // desc
  #170 = Utf8               desc
  #171 = String             #172          // icon
  #172 = Utf8               icon
  #173 = Methodref          #103.#174     // ext/mods/gameserver/model/Mission."<init>":(Lext/mods/commons/data/StatSet;)V
  #174 = NameAndType        #5:#175       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #175 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #176 = InterfaceMethodref #78.#177      // java/util/List.add:(Ljava/lang/Object;)Z
  #177 = NameAndType        #178:#179     // add:(Ljava/lang/Object;)Z
  #178 = Utf8               add
  #179 = Utf8               (Ljava/lang/Object;)Z
  #180 = Class              #181          // ext/mods/commons/data/xml/IXmlReader
  #181 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #182 = Utf8               Signature
  #183 = Utf8               Ljava/util/Map<Lext/mods/gameserver/enums/actors/MissionType;Ljava/util/List<Lext/mods/gameserver/model/Mission;>;>;
  #184 = Utf8               Code
  #185 = Utf8               LineNumberTable
  #186 = Utf8               LocalVariableTable
  #187 = Utf8               this
  #188 = Utf8               StackMapTable
  #189 = Utf8               reload
  #190 = Utf8               parseDocument
  #191 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #192 = Utf8               doc
  #193 = Utf8               Lorg/w3c/dom/Document;
  #194 = Utf8               path
  #195 = Utf8               Ljava/nio/file/Path;
  #196 = Utf8               getMission
  #197 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)Ljava/util/List;
  #198 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
  #199 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)Ljava/util/List<Lext/mods/gameserver/model/Mission;>;
  #200 = Utf8               getMissionByLevel
  #201 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
  #202 = Utf8               level
  #203 = Utf8               I
  #204 = Utf8               getMissions
  #205 = Utf8               ()Ljava/util/Map;
  #206 = Utf8               ()Ljava/util/Map<Lext/mods/gameserver/enums/actors/MissionType;Ljava/util/List<Lext/mods/gameserver/model/Mission;>;>;
  #207 = Utf8               getInstance
  #208 = Utf8               ()Lext/mods/gameserver/custom/data/MissionData;
  #209 = Utf8               lambda$getMissionByLevel$0
  #210 = Utf8               (ILext/mods/gameserver/enums/actors/MissionType;Lext/mods/gameserver/model/Mission;)Z
  #211 = Utf8               Lext/mods/gameserver/model/Mission;
  #212 = Utf8               lambda$parseDocument$0
  #213 = Utf8               (Lorg/w3c/dom/Node;)V
  #214 = Utf8               listNode
  #215 = Utf8               Lorg/w3c/dom/Node;
  #216 = Utf8               lambda$parseDocument$1
  #217 = Utf8               missionNode
  #218 = Utf8               missionAttrs
  #219 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #220 = Utf8               missions
  #221 = Utf8               Ljava/util/List;
  #222 = Utf8               LocalVariableTypeTable
  #223 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/Mission;>;
  #224 = Utf8               lambda$parseDocument$2
  #225 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/util/List;Lorg/w3c/dom/Node;)V
  #226 = Utf8               stageNode
  #227 = Utf8               Lext/mods/commons/data/StatSet;
  #228 = Utf8               SourceFile
  #229 = Utf8               MissionData.java
  #230 = Utf8               NestMembers
  #231 = Utf8               BootstrapMethods
  #232 = MethodType         #233          //  (Ljava/lang/Object;)V
  #233 = Utf8               (Ljava/lang/Object;)V
  #234 = MethodHandle       5:#235        // REF_invokeVirtual ext/mods/gameserver/custom/data/MissionData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #235 = Methodref          #11.#236      // ext/mods/gameserver/custom/data/MissionData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #236 = NameAndType        #212:#213     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #237 = MethodType         #213          //  (Lorg/w3c/dom/Node;)V
  #238 = MethodType         #179          //  (Ljava/lang/Object;)Z
  #239 = MethodHandle       5:#240        // REF_invokeVirtual ext/mods/gameserver/custom/data/MissionData.lambda$getMissionByLevel$0:(ILext/mods/gameserver/enums/actors/MissionType;Lext/mods/gameserver/model/Mission;)Z
  #240 = Methodref          #11.#241      // ext/mods/gameserver/custom/data/MissionData.lambda$getMissionByLevel$0:(ILext/mods/gameserver/enums/actors/MissionType;Lext/mods/gameserver/model/Mission;)Z
  #241 = NameAndType        #209:#210     // lambda$getMissionByLevel$0:(ILext/mods/gameserver/enums/actors/MissionType;Lext/mods/gameserver/model/Mission;)Z
  #242 = MethodType         #243          //  (Lext/mods/gameserver/model/Mission;)Z
  #243 = Utf8               (Lext/mods/gameserver/model/Mission;)Z
  #244 = MethodHandle       5:#245        // REF_invokeVirtual ext/mods/gameserver/custom/data/MissionData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #245 = Methodref          #11.#246      // ext/mods/gameserver/custom/data/MissionData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #246 = NameAndType        #216:#213     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #247 = MethodHandle       5:#248        // REF_invokeVirtual ext/mods/gameserver/custom/data/MissionData.lambda$parseDocument$2:(Lorg/w3c/dom/NamedNodeMap;Ljava/util/List;Lorg/w3c/dom/Node;)V
  #248 = Methodref          #11.#249      // ext/mods/gameserver/custom/data/MissionData.lambda$parseDocument$2:(Lorg/w3c/dom/NamedNodeMap;Ljava/util/List;Lorg/w3c/dom/Node;)V
  #249 = NameAndType        #224:#225     // lambda$parseDocument$2:(Lorg/w3c/dom/NamedNodeMap;Ljava/util/List;Lorg/w3c/dom/Node;)V
  #250 = MethodHandle       6:#251        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #251 = Methodref          #252.#253     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #252 = Class              #254          // java/lang/invoke/LambdaMetafactory
  #253 = NameAndType        #255:#256     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #254 = Utf8               java/lang/invoke/LambdaMetafactory
  #255 = Utf8               metafactory
  #256 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #257 = Utf8               InnerClasses
  #258 = Utf8               SingletonHolder
  #259 = Class              #260          // java/lang/invoke/MethodHandles$Lookup
  #260 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #261 = Class              #262          // java/lang/invoke/MethodHandles
  #262 = Utf8               java/lang/invoke/MethodHandles
  #263 = Utf8               Lookup
{
  public ext.mods.gameserver.custom.data.MissionData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/LinkedHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/LinkedHashMap."<init>":()V
        12: putfield      #10                 // Field _missions:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 41: 0
        line 38: 4
        line 42: 15
        line 43: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/custom/data/MissionData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: getstatic     #19                 // Field ext/mods/Config.ENABLE_MISSION:Z
         3: ifne          7
         6: return
         7: aload_0
         8: ldc           #25                 // String custom/mods/missions.xml
        10: invokevirtual #27                 // Method parseDataFile:(Ljava/lang/String;)V
        13: getstatic     #31                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        16: ldc           #35                 // String Loaded {} of {} mission data.
        18: iconst_2
        19: anewarray     #2                  // class java/lang/Object
        22: dup
        23: iconst_0
        24: aload_0
        25: getfield      #10                 // Field _missions:Ljava/util/Map;
        28: invokeinterface #37,  1           // InterfaceMethod java/util/Map.size:()I
        33: invokestatic  #43                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        36: aastore
        37: dup
        38: iconst_1
        39: invokestatic  #49                 // Method ext/mods/gameserver/enums/actors/MissionType.values:()[Lext/mods/gameserver/enums/actors/MissionType;
        42: arraylength
        43: invokestatic  #43                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        46: aastore
        47: invokevirtual #55                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        50: return
      LineNumberTable:
        line 48: 0
        line 49: 6
        line 51: 7
        line 52: 13
        line 53: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/gameserver/custom/data/MissionData;
      StackMapTable: number_of_entries = 1
        frame_type = 7 /* same */

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _missions:Ljava/util/Map;
         4: invokeinterface #61,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 57: 0
        line 58: 9
        line 59: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/MissionData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #64                 // String list
         4: aload_0
         5: invokedynamic #66,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/custom/data/MissionData;)Ljava/util/function/Consumer;
        10: invokevirtual #70                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 64: 0
        line 81: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/MissionData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public java.util.List<ext.mods.gameserver.model.Mission> getMission(ext.mods.gameserver.enums.actors.MissionType);
    descriptor: (Lext/mods/gameserver/enums/actors/MissionType;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _missions:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #74,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #78                 // class java/util/List
        13: areturn
      LineNumberTable:
        line 85: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/MissionData;
            0      14     1  type   Lext/mods/gameserver/enums/actors/MissionType;
    Signature: #199                         // (Lext/mods/gameserver/enums/actors/MissionType;)Ljava/util/List<Lext/mods/gameserver/model/Mission;>;

  public ext.mods.gameserver.model.Mission getMissionByLevel(ext.mods.gameserver.enums.actors.MissionType, int);
    descriptor: (Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _missions:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #74,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #78                 // class java/util/List
        13: invokeinterface #80,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        18: aload_0
        19: iload_2
        20: aload_1
        21: invokedynamic #84,  0             // InvokeDynamic #1:test:(Lext/mods/gameserver/custom/data/MissionData;ILext/mods/gameserver/enums/actors/MissionType;)Ljava/util/function/Predicate;
        26: invokeinterface #88,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        31: invokeinterface #94,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        36: aconst_null
        37: invokevirtual #98                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        40: checkcast     #103                // class ext/mods/gameserver/model/Mission
        43: areturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/custom/data/MissionData;
            0      44     1  type   Lext/mods/gameserver/enums/actors/MissionType;
            0      44     2 level   I

  public java.util.Map<ext.mods.gameserver.enums.actors.MissionType, java.util.List<ext.mods.gameserver.model.Mission>> getMissions();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _missions:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/MissionData;
    Signature: #206                         // ()Ljava/util/Map<Lext/mods/gameserver/enums/actors/MissionType;Ljava/util/List<Lext/mods/gameserver/model/Mission;>;>;

  public static ext.mods.gameserver.custom.data.MissionData getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/MissionData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #105                // Field ext/mods/gameserver/custom/data/MissionData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/MissionData;
         3: areturn
      LineNumberTable:
        line 100: 0
}
SourceFile: "MissionData.java"
NestMembers:
  ext/mods/gameserver/custom/data/MissionData$SingletonHolder
BootstrapMethods:
  0: #250 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #232 (Ljava/lang/Object;)V
      #234 REF_invokeVirtual ext/mods/gameserver/custom/data/MissionData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #237 (Lorg/w3c/dom/Node;)V
  1: #250 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #238 (Ljava/lang/Object;)Z
      #239 REF_invokeVirtual ext/mods/gameserver/custom/data/MissionData.lambda$getMissionByLevel$0:(ILext/mods/gameserver/enums/actors/MissionType;Lext/mods/gameserver/model/Mission;)Z
      #242 (Lext/mods/gameserver/model/Mission;)Z
  2: #250 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #232 (Ljava/lang/Object;)V
      #244 REF_invokeVirtual ext/mods/gameserver/custom/data/MissionData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #237 (Lorg/w3c/dom/Node;)V
  3: #250 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #232 (Ljava/lang/Object;)V
      #247 REF_invokeVirtual ext/mods/gameserver/custom/data/MissionData.lambda$parseDocument$2:(Lorg/w3c/dom/NamedNodeMap;Ljava/util/List;Lorg/w3c/dom/Node;)V
      #237 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #263= #259 of #261; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
