// Bytecode for: ext.mods.gameserver.data.xml.SummonItemData
// File: ext\mods\gameserver\data\xml\SummonItemData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/SummonItemData.class
  Last modified 9 de jul de 2026; size 3254 bytes
  MD5 checksum 7aa60a1bcb29afcc5641cfc1ffc74264
  Compiled from "SummonItemData.java"
public class ext.mods.gameserver.data.xml.SummonItemData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/SummonItemData
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/SummonItemData._items:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/SummonItemData
   #12 = NameAndType        #14:#15       // _items:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/SummonItemData
   #14 = Utf8               _items
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/SummonItemData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/summonItems.xml
   #20 = Utf8               xml/summonItems.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/SummonItemData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/SummonItemData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} summon items.
   #30 = Utf8               Loaded {} summon items.
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
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/SummonItemData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/SummonItemData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/SummonItemData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/SummonItemData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #32.#60       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #60 = NameAndType        #61:#62       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #61 = Utf8               get
   #62 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #63 = Class              #64           // ext/mods/gameserver/model/holder/IntIntHolder
   #64 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #65 = Fieldref           #66.#67       // ext/mods/gameserver/data/xml/SummonItemData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/SummonItemData;
   #66 = Class              #68           // ext/mods/gameserver/data/xml/SummonItemData$SingletonHolder
   #67 = NameAndType        #69:#70       // INSTANCE:Lext/mods/gameserver/data/xml/SummonItemData;
   #68 = Utf8               ext/mods/gameserver/data/xml/SummonItemData$SingletonHolder
   #69 = Utf8               INSTANCE
   #70 = Utf8               Lext/mods/gameserver/data/xml/SummonItemData;
   #71 = String             #72           // item
   #72 = Utf8               item
   #73 = InvokeDynamic      #1:#52        // #1:accept:(Lext/mods/gameserver/data/xml/SummonItemData;)Ljava/util/function/Consumer;
   #74 = InterfaceMethodref #75.#76       // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #75 = Class              #77           // org/w3c/dom/Node
   #76 = NameAndType        #78:#79       // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #77 = Utf8               org/w3c/dom/Node
   #78 = Utf8               getAttributes
   #79 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
   #80 = String             #81           // id
   #81 = Utf8               id
   #82 = Methodref          #11.#83       // ext/mods/gameserver/data/xml/SummonItemData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
   #83 = NameAndType        #84:#85       // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
   #84 = Utf8               parseInteger
   #85 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
   #86 = Methodref          #38.#87       // java/lang/Integer.intValue:()I
   #87 = NameAndType        #88:#36       // intValue:()I
   #88 = Utf8               intValue
   #89 = String             #90           // npcId
   #90 = Utf8               npcId
   #91 = String             #92           // summonType
   #92 = Utf8               summonType
   #93 = Methodref          #63.#94       // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
   #94 = NameAndType        #5:#95        // "<init>":(II)V
   #95 = Utf8               (II)V
   #96 = InterfaceMethodref #32.#97       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #97 = NameAndType        #98:#99       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #98 = Utf8               put
   #99 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #100 = Class              #101          // ext/mods/commons/data/xml/IXmlReader
  #101 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #102 = Utf8               Signature
  #103 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #104 = Utf8               Code
  #105 = Utf8               LineNumberTable
  #106 = Utf8               LocalVariableTable
  #107 = Utf8               this
  #108 = Utf8               parseDocument
  #109 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #110 = Utf8               doc
  #111 = Utf8               Lorg/w3c/dom/Document;
  #112 = Utf8               path
  #113 = Utf8               Ljava/nio/file/Path;
  #114 = Utf8               getSummonItem
  #115 = Utf8               (I)Lext/mods/gameserver/model/holder/IntIntHolder;
  #116 = Utf8               itemId
  #117 = Utf8               I
  #118 = Utf8               getInstance
  #119 = Utf8               ()Lext/mods/gameserver/data/xml/SummonItemData;
  #120 = Utf8               lambda$parseDocument$0
  #121 = Utf8               (Lorg/w3c/dom/Node;)V
  #122 = Utf8               listNode
  #123 = Utf8               Lorg/w3c/dom/Node;
  #124 = Utf8               lambda$parseDocument$1
  #125 = Utf8               itemNode
  #126 = Utf8               attrs
  #127 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #128 = Utf8               SourceFile
  #129 = Utf8               SummonItemData.java
  #130 = Utf8               NestMembers
  #131 = Utf8               BootstrapMethods
  #132 = MethodType         #133          //  (Ljava/lang/Object;)V
  #133 = Utf8               (Ljava/lang/Object;)V
  #134 = MethodHandle       5:#135        // REF_invokeVirtual ext/mods/gameserver/data/xml/SummonItemData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #135 = Methodref          #11.#136      // ext/mods/gameserver/data/xml/SummonItemData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #136 = NameAndType        #120:#121     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #137 = MethodType         #121          //  (Lorg/w3c/dom/Node;)V
  #138 = MethodHandle       5:#139        // REF_invokeVirtual ext/mods/gameserver/data/xml/SummonItemData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #139 = Methodref          #11.#140      // ext/mods/gameserver/data/xml/SummonItemData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #140 = NameAndType        #124:#121     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #141 = MethodHandle       6:#142        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #142 = Methodref          #143.#144     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #143 = Class              #145          // java/lang/invoke/LambdaMetafactory
  #144 = NameAndType        #146:#147     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #145 = Utf8               java/lang/invoke/LambdaMetafactory
  #146 = Utf8               metafactory
  #147 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #148 = Utf8               InnerClasses
  #149 = Utf8               SingletonHolder
  #150 = Class              #151          // java/lang/invoke/MethodHandles$Lookup
  #151 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #152 = Class              #153          // java/lang/invoke/MethodHandles
  #153 = Utf8               java/lang/invoke/MethodHandles
  #154 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.SummonItemData();
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
        12: putfield      #10                 // Field _items:Ljava/util/Map;
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
            0      20     0  this   Lext/mods/gameserver/data/xml/SummonItemData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/summonItems.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} summon items.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _items:Ljava/util/Map;
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
            0      34     0  this   Lext/mods/gameserver/data/xml/SummonItemData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/SummonItemData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 54: 0
        line 62: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/SummonItemData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.gameserver.model.holder.IntIntHolder getSummonItem(int);
    descriptor: (I)Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #59,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #63                 // class ext/mods/gameserver/model/holder/IntIntHolder
        16: areturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/SummonItemData;
            0      17     1 itemId   I

  public static ext.mods.gameserver.data.xml.SummonItemData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/SummonItemData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #65                 // Field ext/mods/gameserver/data/xml/SummonItemData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/SummonItemData;
         3: areturn
      LineNumberTable:
        line 71: 0
}
SourceFile: "SummonItemData.java"
NestMembers:
  ext/mods/gameserver/data/xml/SummonItemData$SingletonHolder
BootstrapMethods:
  0: #141 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #132 (Ljava/lang/Object;)V
      #134 REF_invokeVirtual ext/mods/gameserver/data/xml/SummonItemData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #137 (Lorg/w3c/dom/Node;)V
  1: #141 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #132 (Ljava/lang/Object;)V
      #138 REF_invokeVirtual ext/mods/gameserver/data/xml/SummonItemData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #137 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #154= #150 of #152; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
