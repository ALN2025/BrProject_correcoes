// Bytecode for: ext.mods.gameserver.data.xml.HennaData
// File: ext\mods\gameserver\data\xml\HennaData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/HennaData.class
  Last modified 9 de jul de 2026; size 4369 bytes
  MD5 checksum fb7f843d7ba84f4e67a57675ae8700f2
  Compiled from "HennaData.java"
public class ext.mods.gameserver.data.xml.HennaData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/HennaData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 10, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/HennaData._hennas:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/HennaData
   #12 = NameAndType        #14:#15       // _hennas:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/HennaData
   #14 = Utf8               _hennas
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/HennaData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/hennas.xml
   #20 = Utf8               xml/hennas.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/HennaData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/HennaData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} hennas.
   #30 = Utf8               Loaded {} hennas.
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
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/HennaData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/HennaData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/HennaData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/HennaData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #32.#60       // java/util/Map.values:()Ljava/util/Collection;
   #60 = NameAndType        #61:#62       // values:()Ljava/util/Collection;
   #61 = Utf8               values
   #62 = Utf8               ()Ljava/util/Collection;
   #63 = InterfaceMethodref #32.#64       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #64 = NameAndType        #65:#66       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #65 = Utf8               get
   #66 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #67 = Class              #68           // ext/mods/gameserver/model/records/Henna
   #68 = Utf8               ext/mods/gameserver/model/records/Henna
   #69 = InterfaceMethodref #70.#71       // java/util/Collection.stream:()Ljava/util/stream/Stream;
   #70 = Class              #72           // java/util/Collection
   #71 = NameAndType        #73:#74       // stream:()Ljava/util/stream/Stream;
   #72 = Utf8               java/util/Collection
   #73 = Utf8               stream
   #74 = Utf8               ()Ljava/util/stream/Stream;
   #75 = InvokeDynamic      #1:#76        // #1:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #76 = NameAndType        #77:#78       // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #77 = Utf8               test
   #78 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #79 = InterfaceMethodref #80.#81       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #80 = Class              #82           // java/util/stream/Stream
   #81 = NameAndType        #83:#84       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #82 = Utf8               java/util/stream/Stream
   #83 = Utf8               filter
   #84 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #85 = InterfaceMethodref #80.#86       // java/util/stream/Stream.toList:()Ljava/util/List;
   #86 = NameAndType        #87:#88       // toList:()Ljava/util/List;
   #87 = Utf8               toList
   #88 = Utf8               ()Ljava/util/List;
   #89 = Fieldref           #90.#91       // ext/mods/gameserver/data/xml/HennaData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/HennaData;
   #90 = Class              #92           // ext/mods/gameserver/data/xml/HennaData$SingletonHolder
   #91 = NameAndType        #93:#94       // INSTANCE:Lext/mods/gameserver/data/xml/HennaData;
   #92 = Utf8               ext/mods/gameserver/data/xml/HennaData$SingletonHolder
   #93 = Utf8               INSTANCE
   #94 = Utf8               Lext/mods/gameserver/data/xml/HennaData;
   #95 = Methodref          #67.#96       // ext/mods/gameserver/model/records/Henna.canBeUsedBy:(Lext/mods/gameserver/model/actor/Player;)Z
   #96 = NameAndType        #97:#98       // canBeUsedBy:(Lext/mods/gameserver/model/actor/Player;)Z
   #97 = Utf8               canBeUsedBy
   #98 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #99 = String             #100          // henna
  #100 = Utf8               henna
  #101 = InvokeDynamic      #2:#52        // #2:accept:(Lext/mods/gameserver/data/xml/HennaData;)Ljava/util/function/Consumer;
  #102 = Methodref          #11.#103      // ext/mods/gameserver/data/xml/HennaData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #103 = NameAndType        #104:#105     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #104 = Utf8               parseAttributes
  #105 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #106 = String             #107          // symbolId
  #107 = Utf8               symbolId
  #108 = Methodref          #109.#110     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #109 = Class              #111          // ext/mods/commons/data/StatSet
  #110 = NameAndType        #112:#113     // getInteger:(Ljava/lang/String;)I
  #111 = Utf8               ext/mods/commons/data/StatSet
  #112 = Utf8               getInteger
  #113 = Utf8               (Ljava/lang/String;)I
  #114 = Methodref          #67.#115      // ext/mods/gameserver/model/records/Henna."<init>":(Lext/mods/commons/data/StatSet;)V
  #115 = NameAndType        #5:#116       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #116 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #117 = InterfaceMethodref #32.#118      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #118 = NameAndType        #119:#120     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #119 = Utf8               put
  #120 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #121 = Class              #122          // ext/mods/commons/data/xml/IXmlReader
  #122 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #123 = Utf8               Signature
  #124 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/Henna;>;
  #125 = Utf8               Code
  #126 = Utf8               LineNumberTable
  #127 = Utf8               LocalVariableTable
  #128 = Utf8               this
  #129 = Utf8               parseDocument
  #130 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #131 = Utf8               doc
  #132 = Utf8               Lorg/w3c/dom/Document;
  #133 = Utf8               path
  #134 = Utf8               Ljava/nio/file/Path;
  #135 = Utf8               getHennas
  #136 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/records/Henna;>;
  #137 = Utf8               getHenna
  #138 = Utf8               (I)Lext/mods/gameserver/model/records/Henna;
  #139 = Utf8               id
  #140 = Utf8               I
  #141 = Utf8               getAvailableHennasFor
  #142 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
  #143 = Utf8               player
  #144 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #145 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List<Lext/mods/gameserver/model/records/Henna;>;
  #146 = Utf8               getInstance
  #147 = Utf8               ()Lext/mods/gameserver/data/xml/HennaData;
  #148 = Utf8               lambda$getAvailableHennasFor$0
  #149 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/records/Henna;)Z
  #150 = Utf8               h
  #151 = Utf8               Lext/mods/gameserver/model/records/Henna;
  #152 = Utf8               lambda$parseDocument$0
  #153 = Utf8               (Lorg/w3c/dom/Node;)V
  #154 = Utf8               listNode
  #155 = Utf8               Lorg/w3c/dom/Node;
  #156 = Utf8               lambda$parseDocument$1
  #157 = Utf8               hennaNode
  #158 = Utf8               set
  #159 = Utf8               Lext/mods/commons/data/StatSet;
  #160 = Utf8               SourceFile
  #161 = Utf8               HennaData.java
  #162 = Utf8               NestMembers
  #163 = Utf8               BootstrapMethods
  #164 = MethodType         #165          //  (Ljava/lang/Object;)V
  #165 = Utf8               (Ljava/lang/Object;)V
  #166 = MethodHandle       5:#167        // REF_invokeVirtual ext/mods/gameserver/data/xml/HennaData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #167 = Methodref          #11.#168      // ext/mods/gameserver/data/xml/HennaData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #168 = NameAndType        #152:#153     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #169 = MethodType         #153          //  (Lorg/w3c/dom/Node;)V
  #170 = MethodType         #171          //  (Ljava/lang/Object;)Z
  #171 = Utf8               (Ljava/lang/Object;)Z
  #172 = MethodHandle       6:#173        // REF_invokeStatic ext/mods/gameserver/data/xml/HennaData.lambda$getAvailableHennasFor$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/records/Henna;)Z
  #173 = Methodref          #11.#174      // ext/mods/gameserver/data/xml/HennaData.lambda$getAvailableHennasFor$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/records/Henna;)Z
  #174 = NameAndType        #148:#149     // lambda$getAvailableHennasFor$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/records/Henna;)Z
  #175 = MethodType         #176          //  (Lext/mods/gameserver/model/records/Henna;)Z
  #176 = Utf8               (Lext/mods/gameserver/model/records/Henna;)Z
  #177 = MethodHandle       5:#178        // REF_invokeVirtual ext/mods/gameserver/data/xml/HennaData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #178 = Methodref          #11.#179      // ext/mods/gameserver/data/xml/HennaData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #179 = NameAndType        #156:#153     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #180 = MethodHandle       6:#181        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #181 = Methodref          #182.#183     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #182 = Class              #184          // java/lang/invoke/LambdaMetafactory
  #183 = NameAndType        #185:#186     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #184 = Utf8               java/lang/invoke/LambdaMetafactory
  #185 = Utf8               metafactory
  #186 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #187 = Utf8               InnerClasses
  #188 = Utf8               SingletonHolder
  #189 = Class              #190          // java/lang/invoke/MethodHandles$Lookup
  #190 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #191 = Class              #192          // java/lang/invoke/MethodHandles
  #192 = Utf8               java/lang/invoke/MethodHandles
  #193 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.HennaData();
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
        12: putfield      #10                 // Field _hennas:Ljava/util/Map;
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
            0      20     0  this   Lext/mods/gameserver/data/xml/HennaData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/hennas.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} hennas.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _hennas:Ljava/util/Map;
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
            0      34     0  this   Lext/mods/gameserver/data/xml/HennaData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/HennaData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 56: 0
        line 61: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/HennaData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public java.util.Collection<ext.mods.gameserver.model.records.Henna> getHennas();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _hennas:Ljava/util/Map;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/xml/HennaData;
    Signature: #136                         // ()Ljava/util/Collection<Lext/mods/gameserver/model/records/Henna;>;

  public ext.mods.gameserver.model.records.Henna getHenna(int);
    descriptor: (I)Lext/mods/gameserver/model/records/Henna;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _hennas:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #63,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #67                 // class ext/mods/gameserver/model/records/Henna
        16: areturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/HennaData;
            0      17     1    id   I

  public java.util.List<ext.mods.gameserver.model.records.Henna> getAvailableHennasFor(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _hennas:Ljava/util/Map;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #69,  1           // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokedynamic #75,  0             // InvokeDynamic #1:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
        20: invokeinterface #79,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #85,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        30: areturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/xml/HennaData;
            0      31     1 player   Lext/mods/gameserver/model/actor/Player;
    Signature: #145                         // (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List<Lext/mods/gameserver/model/records/Henna;>;

  public static ext.mods.gameserver.data.xml.HennaData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/HennaData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #89                 // Field ext/mods/gameserver/data/xml/HennaData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/HennaData;
         3: areturn
      LineNumberTable:
        line 85: 0
}
SourceFile: "HennaData.java"
NestMembers:
  ext/mods/gameserver/data/xml/HennaData$SingletonHolder
BootstrapMethods:
  0: #180 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #164 (Ljava/lang/Object;)V
      #166 REF_invokeVirtual ext/mods/gameserver/data/xml/HennaData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #169 (Lorg/w3c/dom/Node;)V
  1: #180 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #170 (Ljava/lang/Object;)Z
      #172 REF_invokeStatic ext/mods/gameserver/data/xml/HennaData.lambda$getAvailableHennasFor$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/records/Henna;)Z
      #175 (Lext/mods/gameserver/model/records/Henna;)Z
  2: #180 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #164 (Ljava/lang/Object;)V
      #177 REF_invokeVirtual ext/mods/gameserver/data/xml/HennaData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #169 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #193= #189 of #191; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
