// Bytecode for: ext.mods.gameserver.data.xml.StaticSpawnData
// File: ext\mods\gameserver\data\xml\StaticSpawnData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/StaticSpawnData.class
  Last modified 9 de jul de 2026; size 4273 bytes
  MD5 checksum bf3c62ecb19aae6fefde36000172fecb
  Compiled from "StaticSpawnData.java"
public class ext.mods.gameserver.data.xml.StaticSpawnData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/StaticSpawnData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 7, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/StaticSpawnData._staticSpawn:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/StaticSpawnData
   #12 = NameAndType        #14:#15       // _staticSpawn:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/StaticSpawnData
   #14 = Utf8               _staticSpawn
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/StaticSpawnData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/staticSpawn.xml
   #20 = Utf8               xml/staticSpawn.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/StaticSpawnData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/StaticSpawnData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} raidboss static spawn.
   #30 = Utf8               Loaded {} raidboss static spawn.
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
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/StaticSpawnData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/StaticSpawnData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/StaticSpawnData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/StaticSpawnData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #32.#60       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #60 = NameAndType        #61:#62       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #61 = Utf8               get
   #62 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #63 = Class              #64           // ext/mods/gameserver/model/records/custom/StaticSpawn
   #64 = Utf8               ext/mods/gameserver/model/records/custom/StaticSpawn
   #65 = Fieldref           #66.#67       // ext/mods/gameserver/data/xml/StaticSpawnData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/StaticSpawnData;
   #66 = Class              #68           // ext/mods/gameserver/data/xml/StaticSpawnData$SingletonHolder
   #67 = NameAndType        #69:#70       // INSTANCE:Lext/mods/gameserver/data/xml/StaticSpawnData;
   #68 = Utf8               ext/mods/gameserver/data/xml/StaticSpawnData$SingletonHolder
   #69 = Utf8               INSTANCE
   #70 = Utf8               Lext/mods/gameserver/data/xml/StaticSpawnData;
   #71 = String             #72           // npc
   #72 = Utf8               npc
   #73 = InvokeDynamic      #1:#52        // #1:accept:(Lext/mods/gameserver/data/xml/StaticSpawnData;)Ljava/util/function/Consumer;
   #74 = InterfaceMethodref #75.#76       // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #75 = Class              #77           // org/w3c/dom/Node
   #76 = NameAndType        #78:#79       // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #77 = Utf8               org/w3c/dom/Node
   #78 = Utf8               getAttributes
   #79 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
   #80 = String             #81           // isEnable
   #81 = Utf8               isEnable
   #82 = Methodref          #83.#84       // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #83 = Class              #85           // java/lang/Boolean
   #84 = NameAndType        #41:#86       // valueOf:(Z)Ljava/lang/Boolean;
   #85 = Utf8               java/lang/Boolean
   #86 = Utf8               (Z)Ljava/lang/Boolean;
   #87 = Methodref          #11.#88       // ext/mods/gameserver/data/xml/StaticSpawnData.parseBoolean:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
   #88 = NameAndType        #89:#90       // parseBoolean:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
   #89 = Utf8               parseBoolean
   #90 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
   #91 = Methodref          #83.#92       // java/lang/Boolean.booleanValue:()Z
   #92 = NameAndType        #93:#94       // booleanValue:()Z
   #93 = Utf8               booleanValue
   #94 = Utf8               ()Z
   #95 = String             #96           // id
   #96 = Utf8               id
   #97 = Methodref          #11.#98       // ext/mods/gameserver/data/xml/StaticSpawnData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
   #98 = NameAndType        #99:#100      // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
   #99 = Utf8               parseInteger
  #100 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #101 = Methodref          #38.#102      // java/lang/Integer.intValue:()I
  #102 = NameAndType        #103:#36      // intValue:()I
  #103 = Utf8               intValue
  #104 = String             #105          // days
  #105 = Utf8               days
  #106 = Methodref          #11.#107      // ext/mods/gameserver/data/xml/StaticSpawnData.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #107 = NameAndType        #108:#109     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #108 = Utf8               parseString
  #109 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #110 = String             #111          // ;
  #111 = Utf8               ;
  #112 = Methodref          #113.#114     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #113 = Class              #115          // java/lang/String
  #114 = NameAndType        #116:#117     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #115 = Utf8               java/lang/String
  #116 = Utf8               split
  #117 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #118 = Methodref          #119.#120     // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
  #119 = Class              #121          // java/util/Arrays
  #120 = NameAndType        #122:#123     // asList:([Ljava/lang/Object;)Ljava/util/List;
  #121 = Utf8               java/util/Arrays
  #122 = Utf8               asList
  #123 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
  #124 = String             #125          // time
  #125 = Utf8               time
  #126 = String             #127          // randomTime
  #127 = Utf8               randomTime
  #128 = Methodref          #11.#129      // ext/mods/gameserver/data/xml/StaticSpawnData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #129 = NameAndType        #99:#130      // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #130 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #131 = String             #132          // earthQuake
  #132 = Utf8               earthQuake
  #133 = String             #134          // announce
  #134 = Utf8               announce
  #135 = Methodref          #63.#136      // ext/mods/gameserver/model/records/custom/StaticSpawn."<init>":(ZILjava/util/List;Ljava/util/List;IZZ)V
  #136 = NameAndType        #5:#137       // "<init>":(ZILjava/util/List;Ljava/util/List;IZZ)V
  #137 = Utf8               (ZILjava/util/List;Ljava/util/List;IZZ)V
  #138 = InterfaceMethodref #32.#139      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #139 = NameAndType        #140:#141     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #140 = Utf8               put
  #141 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #142 = Class              #143          // ext/mods/commons/data/xml/IXmlReader
  #143 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #144 = Utf8               Signature
  #145 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/custom/StaticSpawn;>;
  #146 = Utf8               Code
  #147 = Utf8               LineNumberTable
  #148 = Utf8               LocalVariableTable
  #149 = Utf8               this
  #150 = Utf8               parseDocument
  #151 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #152 = Utf8               doc
  #153 = Utf8               Lorg/w3c/dom/Document;
  #154 = Utf8               path
  #155 = Utf8               Ljava/nio/file/Path;
  #156 = Utf8               getById
  #157 = Utf8               (I)Lext/mods/gameserver/model/records/custom/StaticSpawn;
  #158 = Utf8               I
  #159 = Utf8               getInstance
  #160 = Utf8               ()Lext/mods/gameserver/data/xml/StaticSpawnData;
  #161 = Utf8               lambda$parseDocument$0
  #162 = Utf8               (Lorg/w3c/dom/Node;)V
  #163 = Utf8               listNode
  #164 = Utf8               Lorg/w3c/dom/Node;
  #165 = Utf8               lambda$parseDocument$1
  #166 = Utf8               npcNode
  #167 = Utf8               attrs
  #168 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #169 = Utf8               Z
  #170 = Utf8               Ljava/util/List;
  #171 = Utf8               staticSpawn
  #172 = Utf8               Lext/mods/gameserver/model/records/custom/StaticSpawn;
  #173 = Utf8               LocalVariableTypeTable
  #174 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #175 = Utf8               SourceFile
  #176 = Utf8               StaticSpawnData.java
  #177 = Utf8               NestMembers
  #178 = Utf8               BootstrapMethods
  #179 = MethodType         #180          //  (Ljava/lang/Object;)V
  #180 = Utf8               (Ljava/lang/Object;)V
  #181 = MethodHandle       5:#182        // REF_invokeVirtual ext/mods/gameserver/data/xml/StaticSpawnData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #182 = Methodref          #11.#183      // ext/mods/gameserver/data/xml/StaticSpawnData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #183 = NameAndType        #161:#162     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #184 = MethodType         #162          //  (Lorg/w3c/dom/Node;)V
  #185 = MethodHandle       5:#186        // REF_invokeVirtual ext/mods/gameserver/data/xml/StaticSpawnData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #186 = Methodref          #11.#187      // ext/mods/gameserver/data/xml/StaticSpawnData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #187 = NameAndType        #165:#162     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #188 = MethodHandle       6:#189        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #189 = Methodref          #190.#191     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #190 = Class              #192          // java/lang/invoke/LambdaMetafactory
  #191 = NameAndType        #193:#194     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #192 = Utf8               java/lang/invoke/LambdaMetafactory
  #193 = Utf8               metafactory
  #194 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #195 = Utf8               InnerClasses
  #196 = Utf8               SingletonHolder
  #197 = Class              #198          // java/lang/invoke/MethodHandles$Lookup
  #198 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #199 = Class              #200          // java/lang/invoke/MethodHandles
  #200 = Utf8               java/lang/invoke/MethodHandles
  #201 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.StaticSpawnData();
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
        12: putfield      #10                 // Field _staticSpawn:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 38: 0
        line 35: 4
        line 39: 15
        line 40: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/StaticSpawnData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/staticSpawn.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} raidboss static spawn.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _staticSpawn:Ljava/util/Map;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 45: 0
        line 46: 6
        line 47: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/xml/StaticSpawnData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/StaticSpawnData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 52: 0
        line 69: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/StaticSpawnData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.gameserver.model.records.custom.StaticSpawn getById(int);
    descriptor: (I)Lext/mods/gameserver/model/records/custom/StaticSpawn;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _staticSpawn:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #59,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #63                 // class ext/mods/gameserver/model/records/custom/StaticSpawn
        16: areturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/StaticSpawnData;
            0      17     1    id   I

  public static ext.mods.gameserver.data.xml.StaticSpawnData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/StaticSpawnData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #65                 // Field ext/mods/gameserver/data/xml/StaticSpawnData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/StaticSpawnData;
         3: areturn
      LineNumberTable:
        line 78: 0
}
SourceFile: "StaticSpawnData.java"
NestMembers:
  ext/mods/gameserver/data/xml/StaticSpawnData$SingletonHolder
BootstrapMethods:
  0: #188 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #179 (Ljava/lang/Object;)V
      #181 REF_invokeVirtual ext/mods/gameserver/data/xml/StaticSpawnData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #184 (Lorg/w3c/dom/Node;)V
  1: #188 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #179 (Ljava/lang/Object;)V
      #185 REF_invokeVirtual ext/mods/gameserver/data/xml/StaticSpawnData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #184 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #201= #197 of #199; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
