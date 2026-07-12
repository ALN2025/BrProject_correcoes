// Bytecode for: ext.mods.gameserver.data.xml.WalkerRouteData
// File: ext\mods\gameserver\data\xml\WalkerRouteData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/WalkerRouteData.class
  Last modified 9 de jul de 2026; size 5141 bytes
  MD5 checksum 08506993ed9176a64193b5dffe804056
  Compiled from "WalkerRouteData.java"
public class ext.mods.gameserver.data.xml.WalkerRouteData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/WalkerRouteData
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/WalkerRouteData._routes:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/WalkerRouteData
   #12 = NameAndType        #14:#15       // _routes:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/WalkerRouteData
   #14 = Utf8               _routes
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/WalkerRouteData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/walkerRoutes.xml
   #20 = Utf8               xml/walkerRoutes.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/WalkerRouteData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/WalkerRouteData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} walking routes.
   #30 = Utf8               Loaded {} walking routes.
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
   #49 = String             #50           // list
   #50 = Utf8               list
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/WalkerRouteData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/WalkerRouteData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/WalkerRouteData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/WalkerRouteData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #32.#60       // java/util/Map.clear:()V
   #60 = NameAndType        #61:#6        // clear:()V
   #61 = Utf8               clear
   #62 = InterfaceMethodref #32.#63       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #63 = NameAndType        #64:#65       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #64 = Utf8               get
   #65 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #66 = Methodref          #67.#68       // java/util/Collections.emptyList:()Ljava/util/List;
   #67 = Class              #69           // java/util/Collections
   #68 = NameAndType        #70:#71       // emptyList:()Ljava/util/List;
   #69 = Utf8               java/util/Collections
   #70 = Utf8               emptyList
   #71 = Utf8               ()Ljava/util/List;
   #72 = Class              #73           // java/util/List
   #73 = Utf8               java/util/List
   #74 = Fieldref           #75.#76       // ext/mods/gameserver/data/xml/WalkerRouteData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/WalkerRouteData;
   #75 = Class              #77           // ext/mods/gameserver/data/xml/WalkerRouteData$SingletonHolder
   #76 = NameAndType        #78:#79       // INSTANCE:Lext/mods/gameserver/data/xml/WalkerRouteData;
   #77 = Utf8               ext/mods/gameserver/data/xml/WalkerRouteData$SingletonHolder
   #78 = Utf8               INSTANCE
   #79 = Utf8               Lext/mods/gameserver/data/xml/WalkerRouteData;
   #80 = String             #81           // route
   #81 = Utf8               route
   #82 = InvokeDynamic      #1:#52        // #1:accept:(Lext/mods/gameserver/data/xml/WalkerRouteData;)Ljava/util/function/Consumer;
   #83 = InterfaceMethodref #84.#85       // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #84 = Class              #86           // org/w3c/dom/Node
   #85 = NameAndType        #87:#88       // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #86 = Utf8               org/w3c/dom/Node
   #87 = Utf8               getAttributes
   #88 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
   #89 = String             #90           // name
   #90 = Utf8               name
   #91 = Methodref          #11.#92       // ext/mods/gameserver/data/xml/WalkerRouteData.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
   #92 = NameAndType        #93:#94       // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
   #93 = Utf8               parseString
   #94 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
   #95 = String             #96           // npc
   #96 = Utf8               npc
   #97 = InvokeDynamic      #2:#98        // #2:accept:(Lext/mods/gameserver/data/xml/WalkerRouteData;Ljava/util/Map;)Ljava/util/function/Consumer;
   #98 = NameAndType        #53:#99       // accept:(Lext/mods/gameserver/data/xml/WalkerRouteData;Ljava/util/Map;)Ljava/util/function/Consumer;
   #99 = Utf8               (Lext/mods/gameserver/data/xml/WalkerRouteData;Ljava/util/Map;)Ljava/util/function/Consumer;
  #100 = InterfaceMethodref #32.#101      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #101 = NameAndType        #102:#103     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #102 = Utf8               put
  #103 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #104 = Class              #105          // java/util/ArrayList
  #105 = Utf8               java/util/ArrayList
  #106 = Methodref          #104.#3       // java/util/ArrayList."<init>":()V
  #107 = String             #108          // node
  #108 = Utf8               node
  #109 = InvokeDynamic      #3:#110       // #3:accept:(Lext/mods/gameserver/data/xml/WalkerRouteData;Ljava/util/List;)Ljava/util/function/Consumer;
  #110 = NameAndType        #53:#111      // accept:(Lext/mods/gameserver/data/xml/WalkerRouteData;Ljava/util/List;)Ljava/util/function/Consumer;
  #111 = Utf8               (Lext/mods/gameserver/data/xml/WalkerRouteData;Ljava/util/List;)Ljava/util/function/Consumer;
  #112 = Class              #113          // ext/mods/gameserver/model/location/WalkerLocation
  #113 = Utf8               ext/mods/gameserver/model/location/WalkerLocation
  #114 = Methodref          #11.#115      // ext/mods/gameserver/data/xml/WalkerRouteData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #115 = NameAndType        #116:#117     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #116 = Utf8               parseAttributes
  #117 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #118 = Methodref          #112.#119     // ext/mods/gameserver/model/location/WalkerLocation."<init>":(Lext/mods/commons/data/StatSet;)V
  #119 = NameAndType        #5:#120       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #120 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #121 = InterfaceMethodref #72.#122      // java/util/List.add:(Ljava/lang/Object;)Z
  #122 = NameAndType        #123:#124     // add:(Ljava/lang/Object;)Z
  #123 = Utf8               add
  #124 = Utf8               (Ljava/lang/Object;)Z
  #125 = Class              #126          // ext/mods/commons/data/xml/IXmlReader
  #126 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #127 = Utf8               Signature
  #128 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;>;>;
  #129 = Utf8               Code
  #130 = Utf8               LineNumberTable
  #131 = Utf8               LocalVariableTable
  #132 = Utf8               this
  #133 = Utf8               parseDocument
  #134 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #135 = Utf8               doc
  #136 = Utf8               Lorg/w3c/dom/Document;
  #137 = Utf8               path
  #138 = Utf8               Ljava/nio/file/Path;
  #139 = Utf8               reload
  #140 = Utf8               getWalkerRoutes
  #141 = Utf8               ()Ljava/util/Map;
  #142 = Utf8               ()Ljava/util/Map<Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;>;>;
  #143 = Utf8               getWalkerRoute
  #144 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
  #145 = Utf8               routeName
  #146 = Utf8               Ljava/lang/String;
  #147 = Utf8               npcName
  #148 = Utf8               npcRoutes
  #149 = Utf8               LocalVariableTypeTable
  #150 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;>;
  #151 = Utf8               StackMapTable
  #152 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;
  #153 = Utf8               getInstance
  #154 = Utf8               ()Lext/mods/gameserver/data/xml/WalkerRouteData;
  #155 = Utf8               lambda$parseDocument$0
  #156 = Utf8               (Lorg/w3c/dom/Node;)V
  #157 = Utf8               listNode
  #158 = Utf8               Lorg/w3c/dom/Node;
  #159 = Utf8               lambda$parseDocument$1
  #160 = Utf8               routeNode
  #161 = Utf8               routeAttrs
  #162 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #163 = Utf8               routeList
  #164 = Utf8               lambda$parseDocument$2
  #165 = Utf8               (Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #166 = Utf8               npcNode
  #167 = Utf8               npcAttrs
  #168 = Utf8               nodeList
  #169 = Utf8               Ljava/util/List;
  #170 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;
  #171 = Utf8               lambda$parseDocument$3
  #172 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #173 = Utf8               nodeNode
  #174 = Utf8               SourceFile
  #175 = Utf8               WalkerRouteData.java
  #176 = Utf8               NestMembers
  #177 = Utf8               BootstrapMethods
  #178 = MethodType         #179          //  (Ljava/lang/Object;)V
  #179 = Utf8               (Ljava/lang/Object;)V
  #180 = MethodHandle       5:#181        // REF_invokeVirtual ext/mods/gameserver/data/xml/WalkerRouteData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #181 = Methodref          #11.#182      // ext/mods/gameserver/data/xml/WalkerRouteData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #182 = NameAndType        #155:#156     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #183 = MethodType         #156          //  (Lorg/w3c/dom/Node;)V
  #184 = MethodHandle       5:#185        // REF_invokeVirtual ext/mods/gameserver/data/xml/WalkerRouteData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #185 = Methodref          #11.#186      // ext/mods/gameserver/data/xml/WalkerRouteData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #186 = NameAndType        #159:#156     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #187 = MethodHandle       5:#188        // REF_invokeVirtual ext/mods/gameserver/data/xml/WalkerRouteData.lambda$parseDocument$2:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #188 = Methodref          #11.#189      // ext/mods/gameserver/data/xml/WalkerRouteData.lambda$parseDocument$2:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #189 = NameAndType        #164:#165     // lambda$parseDocument$2:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #190 = MethodHandle       5:#191        // REF_invokeVirtual ext/mods/gameserver/data/xml/WalkerRouteData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #191 = Methodref          #11.#192      // ext/mods/gameserver/data/xml/WalkerRouteData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #192 = NameAndType        #171:#172     // lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #193 = MethodHandle       6:#194        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #194 = Methodref          #195.#196     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #195 = Class              #197          // java/lang/invoke/LambdaMetafactory
  #196 = NameAndType        #198:#199     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #197 = Utf8               java/lang/invoke/LambdaMetafactory
  #198 = Utf8               metafactory
  #199 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #200 = Utf8               InnerClasses
  #201 = Utf8               SingletonHolder
  #202 = Class              #203          // java/lang/invoke/MethodHandles$Lookup
  #203 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #204 = Class              #205          // java/lang/invoke/MethodHandles
  #205 = Utf8               java/lang/invoke/MethodHandles
  #206 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.WalkerRouteData();
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
        12: putfield      #10                 // Field _routes:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 42: 0
        line 39: 4
        line 43: 15
        line 44: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/WalkerRouteData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/walkerRoutes.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} walking routes.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _routes:Ljava/util/Map;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 49: 0
        line 50: 6
        line 51: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/xml/WalkerRouteData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/WalkerRouteData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 56: 0
        line 73: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/WalkerRouteData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _routes:Ljava/util/Map;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 77: 0
        line 79: 9
        line 80: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/WalkerRouteData;

  public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<ext.mods.gameserver.model.location.WalkerLocation>>> getWalkerRoutes();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _routes:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/WalkerRouteData;
    Signature: #142                         // ()Ljava/util/Map<Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;>;>;

  public java.util.List<ext.mods.gameserver.model.location.WalkerLocation> getWalkerRoute(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _routes:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #62,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #32                 // class java/util/Map
        13: astore_3
        14: aload_3
        15: ifnonnull     22
        18: invokestatic  #66                 // Method java/util/Collections.emptyList:()Ljava/util/List;
        21: areturn
        22: aload_3
        23: aload_2
        24: invokeinterface #62,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #72                 // class java/util/List
        32: areturn
      LineNumberTable:
        line 89: 0
        line 90: 14
        line 91: 18
        line 93: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/xml/WalkerRouteData;
            0      33     1 routeName   Ljava/lang/String;
            0      33     2 npcName   Ljava/lang/String;
           14      19     3 npcRoutes   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14      19     3 npcRoutes   Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/util/Map ]
    Signature: #152                         // (Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;

  public static ext.mods.gameserver.data.xml.WalkerRouteData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/WalkerRouteData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #74                 // Field ext/mods/gameserver/data/xml/WalkerRouteData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/WalkerRouteData;
         3: areturn
      LineNumberTable:
        line 98: 0
}
SourceFile: "WalkerRouteData.java"
NestMembers:
  ext/mods/gameserver/data/xml/WalkerRouteData$SingletonHolder
BootstrapMethods:
  0: #193 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #178 (Ljava/lang/Object;)V
      #180 REF_invokeVirtual ext/mods/gameserver/data/xml/WalkerRouteData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #183 (Lorg/w3c/dom/Node;)V
  1: #193 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #178 (Ljava/lang/Object;)V
      #184 REF_invokeVirtual ext/mods/gameserver/data/xml/WalkerRouteData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #183 (Lorg/w3c/dom/Node;)V
  2: #193 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #178 (Ljava/lang/Object;)V
      #187 REF_invokeVirtual ext/mods/gameserver/data/xml/WalkerRouteData.lambda$parseDocument$2:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
      #183 (Lorg/w3c/dom/Node;)V
  3: #193 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #178 (Ljava/lang/Object;)V
      #190 REF_invokeVirtual ext/mods/gameserver/data/xml/WalkerRouteData.lambda$parseDocument$3:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #183 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #206= #202 of #204; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
