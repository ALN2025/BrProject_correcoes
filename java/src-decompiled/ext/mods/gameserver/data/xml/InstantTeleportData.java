// Bytecode for: ext.mods.gameserver.data.xml.InstantTeleportData
// File: ext\mods\gameserver\data\xml\InstantTeleportData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/InstantTeleportData.class
  Last modified 9 de jul de 2026; size 4177 bytes
  MD5 checksum 77ed0e6b1eaa3db42665651cff49c733
  Compiled from "InstantTeleportData.java"
public class ext.mods.gameserver.data.xml.InstantTeleportData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/InstantTeleportData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 9, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/InstantTeleportData._teleports:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/InstantTeleportData
   #12 = NameAndType        #14:#15       // _teleports:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/InstantTeleportData
   #14 = Utf8               _teleports
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/InstantTeleportData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/instantTeleports.xml
   #20 = Utf8               xml/instantTeleports.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/InstantTeleportData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/InstantTeleportData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} instant teleport positions.
   #30 = Utf8               Loaded {} instant teleport positions.
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
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/InstantTeleportData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/InstantTeleportData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/InstantTeleportData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/InstantTeleportData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
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
   #66 = Class              #67           // java/util/List
   #67 = Utf8               java/util/List
   #68 = Fieldref           #69.#70       // ext/mods/gameserver/data/xml/InstantTeleportData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/InstantTeleportData;
   #69 = Class              #71           // ext/mods/gameserver/data/xml/InstantTeleportData$SingletonHolder
   #70 = NameAndType        #72:#73       // INSTANCE:Lext/mods/gameserver/data/xml/InstantTeleportData;
   #71 = Utf8               ext/mods/gameserver/data/xml/InstantTeleportData$SingletonHolder
   #72 = Utf8               INSTANCE
   #73 = Utf8               Lext/mods/gameserver/data/xml/InstantTeleportData;
   #74 = String             #75           // telPosList
   #75 = Utf8               telPosList
   #76 = InvokeDynamic      #1:#52        // #1:accept:(Lext/mods/gameserver/data/xml/InstantTeleportData;)Ljava/util/function/Consumer;
   #77 = InterfaceMethodref #78.#79       // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #78 = Class              #80           // org/w3c/dom/Node
   #79 = NameAndType        #81:#82       // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #80 = Utf8               org/w3c/dom/Node
   #81 = Utf8               getAttributes
   #82 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
   #83 = String             #84           // npcId
   #84 = Utf8               npcId
   #85 = InterfaceMethodref #86.#87       // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
   #86 = Class              #88           // org/w3c/dom/NamedNodeMap
   #87 = NameAndType        #89:#90       // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
   #88 = Utf8               org/w3c/dom/NamedNodeMap
   #89 = Utf8               getNamedItem
   #90 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
   #91 = InterfaceMethodref #78.#92       // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
   #92 = NameAndType        #93:#94       // getNodeValue:()Ljava/lang/String;
   #93 = Utf8               getNodeValue
   #94 = Utf8               ()Ljava/lang/String;
   #95 = Methodref          #38.#96       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #96 = NameAndType        #97:#98       // parseInt:(Ljava/lang/String;)I
   #97 = Utf8               parseInt
   #98 = Utf8               (Ljava/lang/String;)I
   #99 = Class              #100          // java/util/ArrayList
  #100 = Utf8               java/util/ArrayList
  #101 = Methodref          #99.#3        // java/util/ArrayList."<init>":()V
  #102 = String             #103          // loc
  #103 = Utf8               loc
  #104 = InvokeDynamic      #2:#105       // #2:accept:(Lext/mods/gameserver/data/xml/InstantTeleportData;Ljava/util/List;)Ljava/util/function/Consumer;
  #105 = NameAndType        #53:#106      // accept:(Lext/mods/gameserver/data/xml/InstantTeleportData;Ljava/util/List;)Ljava/util/function/Consumer;
  #106 = Utf8               (Lext/mods/gameserver/data/xml/InstantTeleportData;Ljava/util/List;)Ljava/util/function/Consumer;
  #107 = InterfaceMethodref #32.#108      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #108 = NameAndType        #109:#110     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #109 = Utf8               put
  #110 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #111 = Class              #112          // ext/mods/gameserver/model/location/Location
  #112 = Utf8               ext/mods/gameserver/model/location/Location
  #113 = Methodref          #11.#114      // ext/mods/gameserver/data/xml/InstantTeleportData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #114 = NameAndType        #115:#116     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #115 = Utf8               parseAttributes
  #116 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #117 = Methodref          #111.#118     // ext/mods/gameserver/model/location/Location."<init>":(Lext/mods/commons/data/StatSet;)V
  #118 = NameAndType        #5:#119       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #119 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #120 = InterfaceMethodref #66.#121      // java/util/List.add:(Ljava/lang/Object;)Z
  #121 = NameAndType        #122:#123     // add:(Ljava/lang/Object;)Z
  #122 = Utf8               add
  #123 = Utf8               (Ljava/lang/Object;)Z
  #124 = Class              #125          // ext/mods/commons/data/xml/IXmlReader
  #125 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #126 = Utf8               Signature
  #127 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;>;
  #128 = Utf8               Code
  #129 = Utf8               LineNumberTable
  #130 = Utf8               LocalVariableTable
  #131 = Utf8               this
  #132 = Utf8               parseDocument
  #133 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #134 = Utf8               doc
  #135 = Utf8               Lorg/w3c/dom/Document;
  #136 = Utf8               path
  #137 = Utf8               Ljava/nio/file/Path;
  #138 = Utf8               reload
  #139 = Utf8               getTeleports
  #140 = Utf8               (I)Ljava/util/List;
  #141 = Utf8               I
  #142 = Utf8               (I)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #143 = Utf8               getInstance
  #144 = Utf8               ()Lext/mods/gameserver/data/xml/InstantTeleportData;
  #145 = Utf8               lambda$parseDocument$0
  #146 = Utf8               (Lorg/w3c/dom/Node;)V
  #147 = Utf8               listNode
  #148 = Utf8               Lorg/w3c/dom/Node;
  #149 = Utf8               lambda$parseDocument$1
  #150 = Utf8               telPosListNode
  #151 = Utf8               telPosListAttrs
  #152 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #153 = Utf8               teleports
  #154 = Utf8               Ljava/util/List;
  #155 = Utf8               LocalVariableTypeTable
  #156 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #157 = Utf8               lambda$parseDocument$2
  #158 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #159 = Utf8               locNode
  #160 = Utf8               SourceFile
  #161 = Utf8               InstantTeleportData.java
  #162 = Utf8               NestMembers
  #163 = Utf8               BootstrapMethods
  #164 = MethodType         #165          //  (Ljava/lang/Object;)V
  #165 = Utf8               (Ljava/lang/Object;)V
  #166 = MethodHandle       5:#167        // REF_invokeVirtual ext/mods/gameserver/data/xml/InstantTeleportData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #167 = Methodref          #11.#168      // ext/mods/gameserver/data/xml/InstantTeleportData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #168 = NameAndType        #145:#146     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #169 = MethodType         #146          //  (Lorg/w3c/dom/Node;)V
  #170 = MethodHandle       5:#171        // REF_invokeVirtual ext/mods/gameserver/data/xml/InstantTeleportData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #171 = Methodref          #11.#172      // ext/mods/gameserver/data/xml/InstantTeleportData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #172 = NameAndType        #149:#146     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #173 = MethodHandle       5:#174        // REF_invokeVirtual ext/mods/gameserver/data/xml/InstantTeleportData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #174 = Methodref          #11.#175      // ext/mods/gameserver/data/xml/InstantTeleportData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #175 = NameAndType        #157:#158     // lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #176 = MethodHandle       6:#177        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #177 = Methodref          #178.#179     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #178 = Class              #180          // java/lang/invoke/LambdaMetafactory
  #179 = NameAndType        #181:#182     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #180 = Utf8               java/lang/invoke/LambdaMetafactory
  #181 = Utf8               metafactory
  #182 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #183 = Utf8               InnerClasses
  #184 = Utf8               SingletonHolder
  #185 = Class              #186          // java/lang/invoke/MethodHandles$Lookup
  #186 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #187 = Class              #188          // java/lang/invoke/MethodHandles
  #188 = Utf8               java/lang/invoke/MethodHandles
  #189 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.InstantTeleportData();
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
        12: putfield      #10                 // Field _teleports:Ljava/util/Map;
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
            0      20     0  this   Lext/mods/gameserver/data/xml/InstantTeleportData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/instantTeleports.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} instant teleport positions.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _teleports:Ljava/util/Map;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 48: 0
        line 49: 6
        line 50: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/xml/InstantTeleportData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/InstantTeleportData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 55: 0
        line 65: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/InstantTeleportData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _teleports:Ljava/util/Map;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 69: 0
        line 71: 9
        line 72: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/InstantTeleportData;

  public java.util.List<ext.mods.gameserver.model.location.Location> getTeleports(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _teleports:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #62,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #66                 // class java/util/List
        16: areturn
      LineNumberTable:
        line 76: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/InstantTeleportData;
            0      17     1 npcId   I
    Signature: #142                         // (I)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;

  public static ext.mods.gameserver.data.xml.InstantTeleportData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/InstantTeleportData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #68                 // Field ext/mods/gameserver/data/xml/InstantTeleportData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/InstantTeleportData;
         3: areturn
      LineNumberTable:
        line 81: 0
}
SourceFile: "InstantTeleportData.java"
NestMembers:
  ext/mods/gameserver/data/xml/InstantTeleportData$SingletonHolder
BootstrapMethods:
  0: #176 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #164 (Ljava/lang/Object;)V
      #166 REF_invokeVirtual ext/mods/gameserver/data/xml/InstantTeleportData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #169 (Lorg/w3c/dom/Node;)V
  1: #176 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #164 (Ljava/lang/Object;)V
      #170 REF_invokeVirtual ext/mods/gameserver/data/xml/InstantTeleportData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #169 (Lorg/w3c/dom/Node;)V
  2: #176 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #164 (Ljava/lang/Object;)V
      #173 REF_invokeVirtual ext/mods/gameserver/data/xml/InstantTeleportData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #169 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #189= #185 of #187; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
