// Bytecode for: ext.mods.gameserver.data.xml.ArmorSetData
// File: ext\mods\gameserver\data\xml\ArmorSetData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/ArmorSetData.class
  Last modified 9 de jul de 2026; size 3329 bytes
  MD5 checksum e81569a6352e886d9e63a9efb38ad944
  Compiled from "ArmorSetData.java"
public class ext.mods.gameserver.data.xml.ArmorSetData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/ArmorSetData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 8, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/ArmorSetData._armorSets:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/ArmorSetData
   #12 = NameAndType        #14:#15       // _armorSets:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/ArmorSetData
   #14 = Utf8               _armorSets
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/ArmorSetData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/armorSets.xml
   #20 = Utf8               xml/armorSets.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/ArmorSetData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/ArmorSetData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} armor sets.
   #30 = Utf8               Loaded {} armor sets.
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
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/ArmorSetData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/ArmorSetData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/ArmorSetData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/ArmorSetData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #32.#60       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #60 = NameAndType        #61:#62       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #61 = Utf8               get
   #62 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #63 = Class              #64           // ext/mods/gameserver/model/item/ArmorSet
   #64 = Utf8               ext/mods/gameserver/model/item/ArmorSet
   #65 = InterfaceMethodref #32.#66       // java/util/Map.values:()Ljava/util/Collection;
   #66 = NameAndType        #67:#68       // values:()Ljava/util/Collection;
   #67 = Utf8               values
   #68 = Utf8               ()Ljava/util/Collection;
   #69 = Fieldref           #70.#71       // ext/mods/gameserver/data/xml/ArmorSetData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/ArmorSetData;
   #70 = Class              #72           // ext/mods/gameserver/data/xml/ArmorSetData$SingletonHolder
   #71 = NameAndType        #73:#74       // INSTANCE:Lext/mods/gameserver/data/xml/ArmorSetData;
   #72 = Utf8               ext/mods/gameserver/data/xml/ArmorSetData$SingletonHolder
   #73 = Utf8               INSTANCE
   #74 = Utf8               Lext/mods/gameserver/data/xml/ArmorSetData;
   #75 = String             #76           // armorset
   #76 = Utf8               armorset
   #77 = InvokeDynamic      #1:#52        // #1:accept:(Lext/mods/gameserver/data/xml/ArmorSetData;)Ljava/util/function/Consumer;
   #78 = Methodref          #11.#79       // ext/mods/gameserver/data/xml/ArmorSetData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #79 = NameAndType        #80:#81       // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #80 = Utf8               parseAttributes
   #81 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #82 = String             #83           // chest
   #83 = Utf8               chest
   #84 = Methodref          #85.#86       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #85 = Class              #87           // ext/mods/commons/data/StatSet
   #86 = NameAndType        #88:#89       // getInteger:(Ljava/lang/String;)I
   #87 = Utf8               ext/mods/commons/data/StatSet
   #88 = Utf8               getInteger
   #89 = Utf8               (Ljava/lang/String;)I
   #90 = Methodref          #63.#91       // ext/mods/gameserver/model/item/ArmorSet."<init>":(Lext/mods/commons/data/StatSet;)V
   #91 = NameAndType        #5:#92        // "<init>":(Lext/mods/commons/data/StatSet;)V
   #92 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #93 = InterfaceMethodref #32.#94       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #94 = NameAndType        #95:#96       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #95 = Utf8               put
   #96 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #97 = Class              #98           // ext/mods/commons/data/xml/IXmlReader
   #98 = Utf8               ext/mods/commons/data/xml/IXmlReader
   #99 = Utf8               Signature
  #100 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/item/ArmorSet;>;
  #101 = Utf8               Code
  #102 = Utf8               LineNumberTable
  #103 = Utf8               LocalVariableTable
  #104 = Utf8               this
  #105 = Utf8               parseDocument
  #106 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #107 = Utf8               doc
  #108 = Utf8               Lorg/w3c/dom/Document;
  #109 = Utf8               path
  #110 = Utf8               Ljava/nio/file/Path;
  #111 = Utf8               getSet
  #112 = Utf8               (I)Lext/mods/gameserver/model/item/ArmorSet;
  #113 = Utf8               chestId
  #114 = Utf8               I
  #115 = Utf8               getSets
  #116 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/item/ArmorSet;>;
  #117 = Utf8               getInstance
  #118 = Utf8               ()Lext/mods/gameserver/data/xml/ArmorSetData;
  #119 = Utf8               lambda$parseDocument$0
  #120 = Utf8               (Lorg/w3c/dom/Node;)V
  #121 = Utf8               listNode
  #122 = Utf8               Lorg/w3c/dom/Node;
  #123 = Utf8               lambda$parseDocument$1
  #124 = Utf8               armorsetNode
  #125 = Utf8               set
  #126 = Utf8               Lext/mods/commons/data/StatSet;
  #127 = Utf8               SourceFile
  #128 = Utf8               ArmorSetData.java
  #129 = Utf8               NestMembers
  #130 = Utf8               BootstrapMethods
  #131 = MethodType         #132          //  (Ljava/lang/Object;)V
  #132 = Utf8               (Ljava/lang/Object;)V
  #133 = MethodHandle       5:#134        // REF_invokeVirtual ext/mods/gameserver/data/xml/ArmorSetData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #134 = Methodref          #11.#135      // ext/mods/gameserver/data/xml/ArmorSetData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #135 = NameAndType        #119:#120     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #136 = MethodType         #120          //  (Lorg/w3c/dom/Node;)V
  #137 = MethodHandle       5:#138        // REF_invokeVirtual ext/mods/gameserver/data/xml/ArmorSetData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #138 = Methodref          #11.#139      // ext/mods/gameserver/data/xml/ArmorSetData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #139 = NameAndType        #123:#120     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #140 = MethodHandle       6:#141        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #141 = Methodref          #142.#143     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #142 = Class              #144          // java/lang/invoke/LambdaMetafactory
  #143 = NameAndType        #145:#146     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #144 = Utf8               java/lang/invoke/LambdaMetafactory
  #145 = Utf8               metafactory
  #146 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #147 = Utf8               InnerClasses
  #148 = Utf8               SingletonHolder
  #149 = Class              #150          // java/lang/invoke/MethodHandles$Lookup
  #150 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #151 = Class              #152          // java/lang/invoke/MethodHandles
  #152 = Utf8               java/lang/invoke/MethodHandles
  #153 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.ArmorSetData();
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
        12: putfield      #10                 // Field _armorSets:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 40: 0
        line 37: 4
        line 41: 15
        line 42: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/ArmorSetData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/armorSets.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} armor sets.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _armorSets:Ljava/util/Map;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 47: 0
        line 48: 6
        line 49: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/xml/ArmorSetData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/ArmorSetData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 54: 0
        line 59: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/ArmorSetData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.gameserver.model.item.ArmorSet getSet(int);
    descriptor: (I)Lext/mods/gameserver/model/item/ArmorSet;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _armorSets:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #59,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #63                 // class ext/mods/gameserver/model/item/ArmorSet
        16: areturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/ArmorSetData;
            0      17     1 chestId   I

  public java.util.Collection<ext.mods.gameserver.model.item.ArmorSet> getSets();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _armorSets:Ljava/util/Map;
         4: invokeinterface #65,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/xml/ArmorSetData;
    Signature: #116                         // ()Ljava/util/Collection<Lext/mods/gameserver/model/item/ArmorSet;>;

  public static ext.mods.gameserver.data.xml.ArmorSetData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/ArmorSetData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #69                 // Field ext/mods/gameserver/data/xml/ArmorSetData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/ArmorSetData;
         3: areturn
      LineNumberTable:
        line 73: 0
}
SourceFile: "ArmorSetData.java"
NestMembers:
  ext/mods/gameserver/data/xml/ArmorSetData$SingletonHolder
BootstrapMethods:
  0: #140 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #131 (Ljava/lang/Object;)V
      #133 REF_invokeVirtual ext/mods/gameserver/data/xml/ArmorSetData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #136 (Lorg/w3c/dom/Node;)V
  1: #140 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #131 (Ljava/lang/Object;)V
      #137 REF_invokeVirtual ext/mods/gameserver/data/xml/ArmorSetData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #136 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #153= #149 of #151; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
