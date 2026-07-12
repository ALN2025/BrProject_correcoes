// Bytecode for: ext.mods.gameserver.custom.data.PolymorphData
// File: ext\mods\gameserver\custom\data\PolymorphData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/PolymorphData.class
  Last modified 9 de jul de 2026; size 4058 bytes
  MD5 checksum 7d1aae33b145f68da649967eeb267c00
  Compiled from "PolymorphData.java"
public class ext.mods.gameserver.custom.data.PolymorphData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/custom/data/PolymorphData
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/custom/data/PolymorphData._fakePcs:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/custom/data/PolymorphData
   #12 = NameAndType        #14:#15       // _fakePcs:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/custom/data/PolymorphData
   #14 = Utf8               _fakePcs
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/custom/data/PolymorphData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = InterfaceMethodref #20.#21       // java/util/Map.clear:()V
   #20 = Class              #22           // java/util/Map
   #21 = NameAndType        #23:#6        // clear:()V
   #22 = Utf8               java/util/Map
   #23 = Utf8               clear
   #24 = String             #25           // custom/mods/polymorph.xml
   #25 = Utf8               custom/mods/polymorph.xml
   #26 = Methodref          #11.#27       // ext/mods/gameserver/custom/data/PolymorphData.parseDataFile:(Ljava/lang/String;)V
   #27 = NameAndType        #28:#29       // parseDataFile:(Ljava/lang/String;)V
   #28 = Utf8               parseDataFile
   #29 = Utf8               (Ljava/lang/String;)V
   #30 = Fieldref           #11.#31       // ext/mods/gameserver/custom/data/PolymorphData.LOGGER:Lext/mods/commons/logging/CLogger;
   #31 = NameAndType        #32:#33       // LOGGER:Lext/mods/commons/logging/CLogger;
   #32 = Utf8               LOGGER
   #33 = Utf8               Lext/mods/commons/logging/CLogger;
   #34 = String             #35           // Loaded {} polymorph templates.
   #35 = Utf8               Loaded {} polymorph templates.
   #36 = InterfaceMethodref #20.#37       // java/util/Map.size:()I
   #37 = NameAndType        #38:#39       // size:()I
   #38 = Utf8               size
   #39 = Utf8               ()I
   #40 = Methodref          #41.#42       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #41 = Class              #43           // java/lang/Integer
   #42 = NameAndType        #44:#45       // valueOf:(I)Ljava/lang/Integer;
   #43 = Utf8               java/lang/Integer
   #44 = Utf8               valueOf
   #45 = Utf8               (I)Ljava/lang/Integer;
   #46 = Methodref          #47.#48       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #47 = Class              #49           // ext/mods/commons/logging/CLogger
   #48 = NameAndType        #50:#51       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #49 = Utf8               ext/mods/commons/logging/CLogger
   #50 = Utf8               info
   #51 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #52 = String             #53           // list
   #53 = Utf8               list
   #54 = InvokeDynamic      #0:#55        // #0:accept:(Lext/mods/gameserver/custom/data/PolymorphData;)Ljava/util/function/Consumer;
   #55 = NameAndType        #56:#57       // accept:(Lext/mods/gameserver/custom/data/PolymorphData;)Ljava/util/function/Consumer;
   #56 = Utf8               accept
   #57 = Utf8               (Lext/mods/gameserver/custom/data/PolymorphData;)Ljava/util/function/Consumer;
   #58 = Methodref          #11.#59       // ext/mods/gameserver/custom/data/PolymorphData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = NameAndType        #60:#61       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #60 = Utf8               forEach
   #61 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #62 = InterfaceMethodref #20.#63       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #63 = NameAndType        #64:#65       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #64 = Utf8               get
   #65 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #66 = Class              #67           // ext/mods/gameserver/custom/data/PolymorphData$Polymorph
   #67 = Utf8               ext/mods/gameserver/custom/data/PolymorphData$Polymorph
   #68 = Fieldref           #69.#70       // ext/mods/gameserver/custom/data/PolymorphData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/PolymorphData;
   #69 = Class              #71           // ext/mods/gameserver/custom/data/PolymorphData$SingletonHolder
   #70 = NameAndType        #72:#73       // INSTANCE:Lext/mods/gameserver/custom/data/PolymorphData;
   #71 = Utf8               ext/mods/gameserver/custom/data/PolymorphData$SingletonHolder
   #72 = Utf8               INSTANCE
   #73 = Utf8               Lext/mods/gameserver/custom/data/PolymorphData;
   #74 = String             #75           // npc
   #75 = Utf8               npc
   #76 = InvokeDynamic      #1:#55        // #1:accept:(Lext/mods/gameserver/custom/data/PolymorphData;)Ljava/util/function/Consumer;
   #77 = Methodref          #11.#78       // ext/mods/gameserver/custom/data/PolymorphData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #78 = NameAndType        #79:#80       // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #79 = Utf8               parseAttributes
   #80 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #81 = String             #82           // appearance
   #82 = Utf8               appearance
   #83 = InvokeDynamic      #2:#84        // #2:accept:(Lext/mods/gameserver/custom/data/PolymorphData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
   #84 = NameAndType        #56:#85       // accept:(Lext/mods/gameserver/custom/data/PolymorphData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
   #85 = Utf8               (Lext/mods/gameserver/custom/data/PolymorphData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
   #86 = String             #87           // items
   #87 = Utf8               items
   #88 = InvokeDynamic      #3:#84        // #3:accept:(Lext/mods/gameserver/custom/data/PolymorphData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
   #89 = String             #90           // clan
   #90 = Utf8               clan
   #91 = InvokeDynamic      #4:#84        // #4:accept:(Lext/mods/gameserver/custom/data/PolymorphData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
   #92 = String             #93           // id
   #93 = Utf8               id
   #94 = Methodref          #95.#96       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #95 = Class              #97           // ext/mods/commons/data/StatSet
   #96 = NameAndType        #98:#99       // getInteger:(Ljava/lang/String;)I
   #97 = Utf8               ext/mods/commons/data/StatSet
   #98 = Utf8               getInteger
   #99 = Utf8               (Ljava/lang/String;)I
  #100 = Methodref          #66.#101      // ext/mods/gameserver/custom/data/PolymorphData$Polymorph."<init>":(Lext/mods/commons/data/StatSet;)V
  #101 = NameAndType        #5:#102       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #102 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #103 = InterfaceMethodref #20.#104      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #104 = NameAndType        #105:#106     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #105 = Utf8               put
  #106 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #107 = Methodref          #95.#108      // ext/mods/commons/data/StatSet.putAll:(Ljava/util/Map;)V
  #108 = NameAndType        #109:#110     // putAll:(Ljava/util/Map;)V
  #109 = Utf8               putAll
  #110 = Utf8               (Ljava/util/Map;)V
  #111 = Class              #112          // ext/mods/commons/data/xml/IXmlReader
  #112 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #113 = Utf8               Signature
  #114 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;>;
  #115 = Utf8               Code
  #116 = Utf8               LineNumberTable
  #117 = Utf8               LocalVariableTable
  #118 = Utf8               this
  #119 = Utf8               reload
  #120 = Utf8               parseDocument
  #121 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #122 = Utf8               doc
  #123 = Utf8               Lorg/w3c/dom/Document;
  #124 = Utf8               path
  #125 = Utf8               Ljava/nio/file/Path;
  #126 = Utf8               getFakePc
  #127 = Utf8               (I)Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
  #128 = Utf8               npcId
  #129 = Utf8               I
  #130 = Utf8               getInstance
  #131 = Utf8               ()Lext/mods/gameserver/custom/data/PolymorphData;
  #132 = Utf8               lambda$parseDocument$0
  #133 = Utf8               (Lorg/w3c/dom/Node;)V
  #134 = Utf8               listNode
  #135 = Utf8               Lorg/w3c/dom/Node;
  #136 = Utf8               lambda$parseDocument$1
  #137 = Utf8               node
  #138 = Utf8               set
  #139 = Utf8               Lext/mods/commons/data/StatSet;
  #140 = Utf8               lambda$parseDocument$4
  #141 = Utf8               (Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #142 = Utf8               setNode
  #143 = Utf8               lambda$parseDocument$3
  #144 = Utf8               lambda$parseDocument$2
  #145 = Utf8               SourceFile
  #146 = Utf8               PolymorphData.java
  #147 = Utf8               NestMembers
  #148 = Utf8               BootstrapMethods
  #149 = MethodType         #150          //  (Ljava/lang/Object;)V
  #150 = Utf8               (Ljava/lang/Object;)V
  #151 = MethodHandle       5:#152        // REF_invokeVirtual ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #152 = Methodref          #11.#153      // ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #153 = NameAndType        #132:#133     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #154 = MethodType         #133          //  (Lorg/w3c/dom/Node;)V
  #155 = MethodHandle       5:#156        // REF_invokeVirtual ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #156 = Methodref          #11.#157      // ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #157 = NameAndType        #136:#133     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #158 = MethodHandle       5:#159        // REF_invokeVirtual ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #159 = Methodref          #11.#160      // ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #160 = NameAndType        #144:#141     // lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #161 = MethodHandle       5:#162        // REF_invokeVirtual ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #162 = Methodref          #11.#163      // ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #163 = NameAndType        #143:#141     // lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #164 = MethodHandle       5:#165        // REF_invokeVirtual ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$4:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #165 = Methodref          #11.#166      // ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$4:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #166 = NameAndType        #140:#141     // lambda$parseDocument$4:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #167 = MethodHandle       6:#168        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #168 = Methodref          #169.#170     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #169 = Class              #171          // java/lang/invoke/LambdaMetafactory
  #170 = NameAndType        #172:#173     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #171 = Utf8               java/lang/invoke/LambdaMetafactory
  #172 = Utf8               metafactory
  #173 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #174 = Utf8               InnerClasses
  #175 = Utf8               Polymorph
  #176 = Utf8               SingletonHolder
  #177 = Class              #178          // java/lang/invoke/MethodHandles$Lookup
  #178 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #179 = Class              #180          // java/lang/invoke/MethodHandles
  #180 = Utf8               java/lang/invoke/MethodHandles
  #181 = Utf8               Lookup
{
  public ext.mods.gameserver.custom.data.PolymorphData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _fakePcs:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 34: 0
        line 31: 4
        line 35: 15
        line 36: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/custom/data/PolymorphData;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _fakePcs:Ljava/util/Map;
         4: invokeinterface #19,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 40: 0
        line 41: 9
        line 42: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/PolymorphData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #24                 // String custom/mods/polymorph.xml
         3: invokevirtual #26                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #30                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #34                 // String Loaded {} polymorph templates.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _fakePcs:Ljava/util/Map;
        21: invokeinterface #36,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #46                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 47: 0
        line 48: 6
        line 49: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/custom/data/PolymorphData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #52                 // String list
         4: aload_0
         5: invokedynamic #54,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/custom/data/PolymorphData;)Ljava/util/function/Consumer;
        10: invokevirtual #58                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 54: 0
        line 62: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/PolymorphData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.gameserver.custom.data.PolymorphData$Polymorph getFakePc(int);
    descriptor: (I)Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _fakePcs:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #62,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #66                 // class ext/mods/gameserver/custom/data/PolymorphData$Polymorph
        16: areturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/custom/data/PolymorphData;
            0      17     1 npcId   I

  public static ext.mods.gameserver.custom.data.PolymorphData getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/PolymorphData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #68                 // Field ext/mods/gameserver/custom/data/PolymorphData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/PolymorphData;
         3: areturn
      LineNumberTable:
        line 79: 0
}
SourceFile: "PolymorphData.java"
NestMembers:
  ext/mods/gameserver/custom/data/PolymorphData$SingletonHolder
  ext/mods/gameserver/custom/data/PolymorphData$Polymorph
BootstrapMethods:
  0: #167 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #149 (Ljava/lang/Object;)V
      #151 REF_invokeVirtual ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #154 (Lorg/w3c/dom/Node;)V
  1: #167 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #149 (Ljava/lang/Object;)V
      #155 REF_invokeVirtual ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #154 (Lorg/w3c/dom/Node;)V
  2: #167 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #149 (Ljava/lang/Object;)V
      #158 REF_invokeVirtual ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #154 (Lorg/w3c/dom/Node;)V
  3: #167 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #149 (Ljava/lang/Object;)V
      #161 REF_invokeVirtual ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #154 (Lorg/w3c/dom/Node;)V
  4: #167 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #149 (Ljava/lang/Object;)V
      #164 REF_invokeVirtual ext/mods/gameserver/custom/data/PolymorphData.lambda$parseDocument$4:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #154 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #175= #66 of #11;   // Polymorph=class ext/mods/gameserver/custom/data/PolymorphData$Polymorph of class ext/mods/gameserver/custom/data/PolymorphData
  public static final #181= #177 of #179; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
