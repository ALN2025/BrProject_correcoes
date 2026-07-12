// Bytecode for: ext.mods.gameserver.custom.data.EventsData
// File: ext\mods\gameserver\custom\data\EventsData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/EventsData.class
  Last modified 9 de jul de 2026; size 4803 bytes
  MD5 checksum 98b22ef37e88d25773372a2af34b1759
  Compiled from "EventsData.java"
public class ext.mods.gameserver.custom.data.EventsData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/custom/data/EventsData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 9, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/custom/data/EventsData._events:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/custom/data/EventsData
   #12 = NameAndType        #14:#15       // _events:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/custom/data/EventsData
   #14 = Utf8               _events
   #15 = Utf8               Ljava/util/List;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/custom/data/EventsData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // custom/mods/events.xml
   #20 = Utf8               custom/mods/events.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/custom/data/EventsData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/custom/data/EventsData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} events.
   #30 = Utf8               Loaded {} events.
   #31 = InterfaceMethodref #32.#33       // java/util/List.size:()I
   #32 = Class              #34           // java/util/List
   #33 = NameAndType        #35:#36       // size:()I
   #34 = Utf8               java/util/List
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
   #49 = String             #50           // list
   #50 = Utf8               list
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/custom/data/EventsData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/custom/data/EventsData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/custom/data/EventsData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/custom/data/EventsData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #32.#60       // java/util/List.stream:()Ljava/util/stream/Stream;
   #60 = NameAndType        #61:#62       // stream:()Ljava/util/stream/Stream;
   #61 = Utf8               stream
   #62 = Utf8               ()Ljava/util/stream/Stream;
   #63 = InvokeDynamic      #1:#64        // #1:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #64 = NameAndType        #65:#66       // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #65 = Utf8               test
   #66 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
   #67 = InterfaceMethodref #68.#69       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #68 = Class              #70           // java/util/stream/Stream
   #69 = NameAndType        #71:#72       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #70 = Utf8               java/util/stream/Stream
   #71 = Utf8               filter
   #72 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #73 = InterfaceMethodref #68.#74       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #74 = NameAndType        #75:#76       // findFirst:()Ljava/util/Optional;
   #75 = Utf8               findFirst
   #76 = Utf8               ()Ljava/util/Optional;
   #77 = Methodref          #78.#79       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #78 = Class              #80           // java/util/Optional
   #79 = NameAndType        #81:#82       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #80 = Utf8               java/util/Optional
   #81 = Utf8               orElse
   #82 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #83 = Class              #84           // ext/mods/gameserver/model/records/custom/EventsInfo
   #84 = Utf8               ext/mods/gameserver/model/records/custom/EventsInfo
   #85 = Fieldref           #86.#87       // ext/mods/gameserver/custom/data/EventsData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/EventsData;
   #86 = Class              #88           // ext/mods/gameserver/custom/data/EventsData$SingletonHolder
   #87 = NameAndType        #89:#90       // INSTANCE:Lext/mods/gameserver/custom/data/EventsData;
   #88 = Utf8               ext/mods/gameserver/custom/data/EventsData$SingletonHolder
   #89 = Utf8               INSTANCE
   #90 = Utf8               Lext/mods/gameserver/custom/data/EventsData;
   #91 = Methodref          #83.#92       // ext/mods/gameserver/model/records/custom/EventsInfo.eventName:()Ljava/lang/String;
   #92 = NameAndType        #93:#94       // eventName:()Ljava/lang/String;
   #93 = Utf8               eventName
   #94 = Utf8               ()Ljava/lang/String;
   #95 = Methodref          #96.#97       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #96 = Class              #98           // java/lang/String
   #97 = NameAndType        #99:#100      // equals:(Ljava/lang/Object;)Z
   #98 = Utf8               java/lang/String
   #99 = Utf8               equals
  #100 = Utf8               (Ljava/lang/Object;)Z
  #101 = String             #102          // event
  #102 = Utf8               event
  #103 = InvokeDynamic      #2:#52        // #2:accept:(Lext/mods/gameserver/custom/data/EventsData;)Ljava/util/function/Consumer;
  #104 = InterfaceMethodref #105.#106     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #105 = Class              #107          // org/w3c/dom/Node
  #106 = NameAndType        #108:#109     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #107 = Utf8               org/w3c/dom/Node
  #108 = Utf8               getAttributes
  #109 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #110 = String             #111          // name
  #111 = Utf8               name
  #112 = Methodref          #11.#113      // ext/mods/gameserver/custom/data/EventsData.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #113 = NameAndType        #114:#115     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #114 = Utf8               parseString
  #115 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #116 = String             #117          // item
  #117 = Utf8               item
  #118 = InvokeDynamic      #3:#119       // #3:accept:(Lext/mods/gameserver/custom/data/EventsData;Ljava/util/List;)Ljava/util/function/Consumer;
  #119 = NameAndType        #53:#120      // accept:(Lext/mods/gameserver/custom/data/EventsData;Ljava/util/List;)Ljava/util/function/Consumer;
  #120 = Utf8               (Lext/mods/gameserver/custom/data/EventsData;Ljava/util/List;)Ljava/util/function/Consumer;
  #121 = Methodref          #83.#122      // ext/mods/gameserver/model/records/custom/EventsInfo."<init>":(Ljava/lang/String;Ljava/util/List;)V
  #122 = NameAndType        #5:#123       // "<init>":(Ljava/lang/String;Ljava/util/List;)V
  #123 = Utf8               (Ljava/lang/String;Ljava/util/List;)V
  #124 = InterfaceMethodref #32.#125      // java/util/List.add:(Ljava/lang/Object;)Z
  #125 = NameAndType        #126:#100     // add:(Ljava/lang/Object;)Z
  #126 = Utf8               add
  #127 = String             #128          // id
  #128 = Utf8               id
  #129 = Methodref          #11.#130      // ext/mods/gameserver/custom/data/EventsData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #130 = NameAndType        #131:#132     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #131 = Utf8               parseInteger
  #132 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #133 = Methodref          #38.#134      // java/lang/Integer.intValue:()I
  #134 = NameAndType        #135:#36      // intValue:()I
  #135 = Utf8               intValue
  #136 = String             #137          // count
  #137 = Utf8               count
  #138 = String             #139          // chance
  #139 = Utf8               chance
  #140 = String             #141          // minLvl
  #141 = Utf8               minLvl
  #142 = Methodref          #11.#143      // ext/mods/gameserver/custom/data/EventsData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #143 = NameAndType        #131:#144     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #144 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #145 = Class              #146          // ext/mods/gameserver/model/records/custom/EventItem
  #146 = Utf8               ext/mods/gameserver/model/records/custom/EventItem
  #147 = Methodref          #145.#148     // ext/mods/gameserver/model/records/custom/EventItem."<init>":(IIII)V
  #148 = NameAndType        #5:#149       // "<init>":(IIII)V
  #149 = Utf8               (IIII)V
  #150 = Class              #151          // ext/mods/commons/data/xml/IXmlReader
  #151 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #152 = Utf8               Signature
  #153 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventsInfo;>;
  #154 = Utf8               Code
  #155 = Utf8               LineNumberTable
  #156 = Utf8               LocalVariableTable
  #157 = Utf8               this
  #158 = Utf8               parseDocument
  #159 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #160 = Utf8               doc
  #161 = Utf8               Lorg/w3c/dom/Document;
  #162 = Utf8               path
  #163 = Utf8               Ljava/nio/file/Path;
  #164 = Utf8               getEventsData
  #165 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/records/custom/EventsInfo;
  #166 = Utf8               Ljava/lang/String;
  #167 = Utf8               getInstance
  #168 = Utf8               ()Lext/mods/gameserver/custom/data/EventsData;
  #169 = Utf8               lambda$getEventsData$0
  #170 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/records/custom/EventsInfo;)Z
  #171 = Utf8               Lext/mods/gameserver/model/records/custom/EventsInfo;
  #172 = Utf8               lambda$parseDocument$0
  #173 = Utf8               (Lorg/w3c/dom/Node;)V
  #174 = Utf8               listNode
  #175 = Utf8               Lorg/w3c/dom/Node;
  #176 = Utf8               lambda$parseDocument$1
  #177 = Utf8               items
  #178 = Utf8               LocalVariableTypeTable
  #179 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
  #180 = Utf8               lambda$parseDocument$2
  #181 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #182 = Utf8               itemNode
  #183 = Utf8               attrs
  #184 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #185 = Utf8               I
  #186 = Utf8               SourceFile
  #187 = Utf8               EventsData.java
  #188 = Utf8               NestMembers
  #189 = Utf8               BootstrapMethods
  #190 = MethodType         #191          //  (Ljava/lang/Object;)V
  #191 = Utf8               (Ljava/lang/Object;)V
  #192 = MethodHandle       5:#193        // REF_invokeVirtual ext/mods/gameserver/custom/data/EventsData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #193 = Methodref          #11.#194      // ext/mods/gameserver/custom/data/EventsData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #194 = NameAndType        #172:#173     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #195 = MethodType         #173          //  (Lorg/w3c/dom/Node;)V
  #196 = MethodType         #100          //  (Ljava/lang/Object;)Z
  #197 = MethodHandle       6:#198        // REF_invokeStatic ext/mods/gameserver/custom/data/EventsData.lambda$getEventsData$0:(Ljava/lang/String;Lext/mods/gameserver/model/records/custom/EventsInfo;)Z
  #198 = Methodref          #11.#199      // ext/mods/gameserver/custom/data/EventsData.lambda$getEventsData$0:(Ljava/lang/String;Lext/mods/gameserver/model/records/custom/EventsInfo;)Z
  #199 = NameAndType        #169:#170     // lambda$getEventsData$0:(Ljava/lang/String;Lext/mods/gameserver/model/records/custom/EventsInfo;)Z
  #200 = MethodType         #201          //  (Lext/mods/gameserver/model/records/custom/EventsInfo;)Z
  #201 = Utf8               (Lext/mods/gameserver/model/records/custom/EventsInfo;)Z
  #202 = MethodHandle       5:#203        // REF_invokeVirtual ext/mods/gameserver/custom/data/EventsData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #203 = Methodref          #11.#204      // ext/mods/gameserver/custom/data/EventsData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #204 = NameAndType        #176:#173     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #205 = MethodHandle       5:#206        // REF_invokeVirtual ext/mods/gameserver/custom/data/EventsData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #206 = Methodref          #11.#207      // ext/mods/gameserver/custom/data/EventsData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #207 = NameAndType        #180:#181     // lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #208 = MethodHandle       6:#209        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #209 = Methodref          #210.#211     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #210 = Class              #212          // java/lang/invoke/LambdaMetafactory
  #211 = NameAndType        #213:#214     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #212 = Utf8               java/lang/invoke/LambdaMetafactory
  #213 = Utf8               metafactory
  #214 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #215 = Utf8               InnerClasses
  #216 = Utf8               SingletonHolder
  #217 = Class              #218          // java/lang/invoke/MethodHandles$Lookup
  #218 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #219 = Class              #220          // java/lang/invoke/MethodHandles
  #220 = Utf8               java/lang/invoke/MethodHandles
  #221 = Utf8               Lookup
{
  protected ext.mods.gameserver.custom.data.EventsData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _events:Ljava/util/List;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 37: 0
        line 34: 4
        line 38: 15
        line 39: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/custom/data/EventsData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String custom/mods/events.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} events.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _events:Ljava/util/List;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/List.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 44: 0
        line 45: 6
        line 46: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/custom/data/EventsData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/custom/data/EventsData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 51: 0
        line 70: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/EventsData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.gameserver.model.records.custom.EventsInfo getEventsData(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/records/custom/EventsInfo;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _events:Ljava/util/List;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #63,  0             // InvokeDynamic #1:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        15: invokeinterface #67,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #73,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aconst_null
        26: invokevirtual #77                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #83                 // class ext/mods/gameserver/model/records/custom/EventsInfo
        32: areturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/custom/data/EventsData;
            0      33     1 eventName   Ljava/lang/String;

  public static ext.mods.gameserver.custom.data.EventsData getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/EventsData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #85                 // Field ext/mods/gameserver/custom/data/EventsData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/EventsData;
         3: areturn
      LineNumberTable:
        line 79: 0
}
SourceFile: "EventsData.java"
NestMembers:
  ext/mods/gameserver/custom/data/EventsData$SingletonHolder
BootstrapMethods:
  0: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #190 (Ljava/lang/Object;)V
      #192 REF_invokeVirtual ext/mods/gameserver/custom/data/EventsData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #195 (Lorg/w3c/dom/Node;)V
  1: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #196 (Ljava/lang/Object;)Z
      #197 REF_invokeStatic ext/mods/gameserver/custom/data/EventsData.lambda$getEventsData$0:(Ljava/lang/String;Lext/mods/gameserver/model/records/custom/EventsInfo;)Z
      #200 (Lext/mods/gameserver/model/records/custom/EventsInfo;)Z
  2: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #190 (Ljava/lang/Object;)V
      #202 REF_invokeVirtual ext/mods/gameserver/custom/data/EventsData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #195 (Lorg/w3c/dom/Node;)V
  3: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #190 (Ljava/lang/Object;)V
      #205 REF_invokeVirtual ext/mods/gameserver/custom/data/EventsData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #195 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #221= #217 of #219; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
