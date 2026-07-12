// Bytecode for: ext.mods.gameserver.data.xml.StaticObjectData
// File: ext\mods\gameserver\data\xml\StaticObjectData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/StaticObjectData.class
  Last modified 9 de jul de 2026; size 3724 bytes
  MD5 checksum c6a068b083da7c2b5c760acf4186e0e7
  Compiled from "StaticObjectData.java"
public class ext.mods.gameserver.data.xml.StaticObjectData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/StaticObjectData
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/StaticObjectData._objects:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/StaticObjectData
   #12 = NameAndType        #14:#15       // _objects:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/StaticObjectData
   #14 = Utf8               _objects
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/StaticObjectData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/staticObjects.xml
   #20 = Utf8               xml/staticObjects.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/StaticObjectData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/StaticObjectData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} static objects.
   #30 = Utf8               Loaded {} static objects.
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
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/StaticObjectData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/StaticObjectData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/StaticObjectData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/StaticObjectData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #32.#60       // java/util/Map.values:()Ljava/util/Collection;
   #60 = NameAndType        #61:#62       // values:()Ljava/util/Collection;
   #61 = Utf8               values
   #62 = Utf8               ()Ljava/util/Collection;
   #63 = Fieldref           #64.#65       // ext/mods/gameserver/data/xml/StaticObjectData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/StaticObjectData;
   #64 = Class              #66           // ext/mods/gameserver/data/xml/StaticObjectData$SingletonHolder
   #65 = NameAndType        #67:#68       // INSTANCE:Lext/mods/gameserver/data/xml/StaticObjectData;
   #66 = Utf8               ext/mods/gameserver/data/xml/StaticObjectData$SingletonHolder
   #67 = Utf8               INSTANCE
   #68 = Utf8               Lext/mods/gameserver/data/xml/StaticObjectData;
   #69 = String             #70           // object
   #70 = Utf8               object
   #71 = InvokeDynamic      #1:#52        // #1:accept:(Lext/mods/gameserver/data/xml/StaticObjectData;)Ljava/util/function/Consumer;
   #72 = Methodref          #11.#73       // ext/mods/gameserver/data/xml/StaticObjectData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #73 = NameAndType        #74:#75       // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #74 = Utf8               parseAttributes
   #75 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #76 = Class              #77           // ext/mods/gameserver/model/actor/instance/StaticObject
   #77 = Utf8               ext/mods/gameserver/model/actor/instance/StaticObject
   #78 = Methodref          #79.#80       // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #79 = Class              #81           // ext/mods/gameserver/idfactory/IdFactory
   #80 = NameAndType        #82:#83       // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #81 = Utf8               ext/mods/gameserver/idfactory/IdFactory
   #82 = Utf8               getInstance
   #83 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
   #84 = Methodref          #79.#85       // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
   #85 = NameAndType        #86:#36       // getNextId:()I
   #86 = Utf8               getNextId
   #87 = Methodref          #76.#88       // ext/mods/gameserver/model/actor/instance/StaticObject."<init>":(I)V
   #88 = NameAndType        #5:#89        // "<init>":(I)V
   #89 = Utf8               (I)V
   #90 = String             #91           // id
   #91 = Utf8               id
   #92 = Methodref          #93.#94       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #93 = Class              #95           // ext/mods/commons/data/StatSet
   #94 = NameAndType        #96:#97       // getInteger:(Ljava/lang/String;)I
   #95 = Utf8               ext/mods/commons/data/StatSet
   #96 = Utf8               getInteger
   #97 = Utf8               (Ljava/lang/String;)I
   #98 = Methodref          #76.#99       // ext/mods/gameserver/model/actor/instance/StaticObject.setStaticObjectId:(I)V
   #99 = NameAndType        #100:#89      // setStaticObjectId:(I)V
  #100 = Utf8               setStaticObjectId
  #101 = String             #102          // type
  #102 = Utf8               type
  #103 = Methodref          #76.#104      // ext/mods/gameserver/model/actor/instance/StaticObject.setType:(I)V
  #104 = NameAndType        #105:#89      // setType:(I)V
  #105 = Utf8               setType
  #106 = String             #107          // texture
  #107 = Utf8               texture
  #108 = Methodref          #93.#109      // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #109 = NameAndType        #110:#111     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #110 = Utf8               getString
  #111 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #112 = String             #113          // mapX
  #113 = Utf8               mapX
  #114 = String             #115          // mapY
  #115 = Utf8               mapY
  #116 = Methodref          #76.#117      // ext/mods/gameserver/model/actor/instance/StaticObject.setMap:(Ljava/lang/String;II)V
  #117 = NameAndType        #118:#119     // setMap:(Ljava/lang/String;II)V
  #118 = Utf8               setMap
  #119 = Utf8               (Ljava/lang/String;II)V
  #120 = String             #121          // x
  #121 = Utf8               x
  #122 = String             #123          // y
  #123 = Utf8               y
  #124 = String             #125          // z
  #125 = Utf8               z
  #126 = Methodref          #76.#127      // ext/mods/gameserver/model/actor/instance/StaticObject.spawnMe:(III)V
  #127 = NameAndType        #128:#129     // spawnMe:(III)V
  #128 = Utf8               spawnMe
  #129 = Utf8               (III)V
  #130 = Methodref          #76.#131      // ext/mods/gameserver/model/actor/instance/StaticObject.getObjectId:()I
  #131 = NameAndType        #132:#36      // getObjectId:()I
  #132 = Utf8               getObjectId
  #133 = InterfaceMethodref #32.#134      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #134 = NameAndType        #135:#136     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #135 = Utf8               put
  #136 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #137 = Class              #138          // ext/mods/commons/data/xml/IXmlReader
  #138 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #139 = Utf8               Signature
  #140 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/instance/StaticObject;>;
  #141 = Utf8               Code
  #142 = Utf8               LineNumberTable
  #143 = Utf8               LocalVariableTable
  #144 = Utf8               this
  #145 = Utf8               parseDocument
  #146 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #147 = Utf8               doc
  #148 = Utf8               Lorg/w3c/dom/Document;
  #149 = Utf8               path
  #150 = Utf8               Ljava/nio/file/Path;
  #151 = Utf8               getStaticObjects
  #152 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/actor/instance/StaticObject;>;
  #153 = Utf8               ()Lext/mods/gameserver/data/xml/StaticObjectData;
  #154 = Utf8               lambda$parseDocument$0
  #155 = Utf8               (Lorg/w3c/dom/Node;)V
  #156 = Utf8               listNode
  #157 = Utf8               Lorg/w3c/dom/Node;
  #158 = Utf8               lambda$parseDocument$1
  #159 = Utf8               objectNode
  #160 = Utf8               set
  #161 = Utf8               Lext/mods/commons/data/StatSet;
  #162 = Utf8               obj
  #163 = Utf8               Lext/mods/gameserver/model/actor/instance/StaticObject;
  #164 = Utf8               SourceFile
  #165 = Utf8               StaticObjectData.java
  #166 = Utf8               NestMembers
  #167 = Utf8               BootstrapMethods
  #168 = MethodType         #169          //  (Ljava/lang/Object;)V
  #169 = Utf8               (Ljava/lang/Object;)V
  #170 = MethodHandle       5:#171        // REF_invokeVirtual ext/mods/gameserver/data/xml/StaticObjectData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #171 = Methodref          #11.#172      // ext/mods/gameserver/data/xml/StaticObjectData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #172 = NameAndType        #154:#155     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #173 = MethodType         #155          //  (Lorg/w3c/dom/Node;)V
  #174 = MethodHandle       5:#175        // REF_invokeVirtual ext/mods/gameserver/data/xml/StaticObjectData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #175 = Methodref          #11.#176      // ext/mods/gameserver/data/xml/StaticObjectData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #176 = NameAndType        #158:#155     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #177 = MethodHandle       6:#178        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #178 = Methodref          #179.#180     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #179 = Class              #181          // java/lang/invoke/LambdaMetafactory
  #180 = NameAndType        #182:#183     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #181 = Utf8               java/lang/invoke/LambdaMetafactory
  #182 = Utf8               metafactory
  #183 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #184 = Utf8               InnerClasses
  #185 = Utf8               SingletonHolder
  #186 = Class              #187          // java/lang/invoke/MethodHandles$Lookup
  #187 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #188 = Class              #189          // java/lang/invoke/MethodHandles
  #189 = Utf8               java/lang/invoke/MethodHandles
  #190 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.StaticObjectData();
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
        12: putfield      #10                 // Field _objects:Ljava/util/Map;
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
            0      20     0  this   Lext/mods/gameserver/data/xml/StaticObjectData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/staticObjects.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} static objects.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _objects:Ljava/util/Map;
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
            0      34     0  this   Lext/mods/gameserver/data/xml/StaticObjectData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/StaticObjectData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 55: 0
        line 65: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/StaticObjectData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public java.util.Collection<ext.mods.gameserver.model.actor.instance.StaticObject> getStaticObjects();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _objects:Ljava/util/Map;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/xml/StaticObjectData;
    Signature: #152                         // ()Ljava/util/Collection<Lext/mods/gameserver/model/actor/instance/StaticObject;>;

  public static ext.mods.gameserver.data.xml.StaticObjectData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/StaticObjectData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #63                 // Field ext/mods/gameserver/data/xml/StaticObjectData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/StaticObjectData;
         3: areturn
      LineNumberTable:
        line 74: 0
}
SourceFile: "StaticObjectData.java"
NestMembers:
  ext/mods/gameserver/data/xml/StaticObjectData$SingletonHolder
BootstrapMethods:
  0: #177 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #168 (Ljava/lang/Object;)V
      #170 REF_invokeVirtual ext/mods/gameserver/data/xml/StaticObjectData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #173 (Lorg/w3c/dom/Node;)V
  1: #177 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #168 (Ljava/lang/Object;)V
      #174 REF_invokeVirtual ext/mods/gameserver/data/xml/StaticObjectData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #173 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #190= #186 of #188; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
