// Bytecode for: ext.mods.gameserver.data.xml.FishData
// File: ext\mods\gameserver\data\xml\FishData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/FishData.class
  Last modified 9 de jul de 2026; size 3573 bytes
  MD5 checksum 7edef0aba615b1b5c60aaeeae0695a11
  Compiled from "FishData.java"
public class ext.mods.gameserver.data.xml.FishData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/FishData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 8, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/FishData._fish:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/FishData
   #12 = NameAndType        #14:#15       // _fish:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/data/xml/FishData
   #14 = Utf8               _fish
   #15 = Utf8               Ljava/util/List;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/FishData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/fish.xml
   #20 = Utf8               xml/fish.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/FishData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/FishData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} fish.
   #30 = Utf8               Loaded {} fish.
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
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/FishData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/FishData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/FishData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/FishData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #32.#60       // java/util/List.stream:()Ljava/util/stream/Stream;
   #60 = NameAndType        #61:#62       // stream:()Ljava/util/stream/Stream;
   #61 = Utf8               stream
   #62 = Utf8               ()Ljava/util/stream/Stream;
   #63 = InvokeDynamic      #1:#64        // #1:test:(III)Ljava/util/function/Predicate;
   #64 = NameAndType        #65:#66       // test:(III)Ljava/util/function/Predicate;
   #65 = Utf8               test
   #66 = Utf8               (III)Ljava/util/function/Predicate;
   #67 = InterfaceMethodref #68.#69       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #68 = Class              #70           // java/util/stream/Stream
   #69 = NameAndType        #71:#72       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #70 = Utf8               java/util/stream/Stream
   #71 = Utf8               filter
   #72 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #73 = InterfaceMethodref #68.#74       // java/util/stream/Stream.toList:()Ljava/util/List;
   #74 = NameAndType        #75:#76       // toList:()Ljava/util/List;
   #75 = Utf8               toList
   #76 = Utf8               ()Ljava/util/List;
   #77 = Methodref          #78.#79       // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
   #78 = Class              #80           // ext/mods/commons/random/Rnd
   #79 = NameAndType        #81:#82       // get:(Ljava/util/List;)Ljava/lang/Object;
   #80 = Utf8               ext/mods/commons/random/Rnd
   #81 = Utf8               get
   #82 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
   #83 = Class              #84           // ext/mods/gameserver/model/records/Fish
   #84 = Utf8               ext/mods/gameserver/model/records/Fish
   #85 = Fieldref           #86.#87       // ext/mods/gameserver/data/xml/FishData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/FishData;
   #86 = Class              #88           // ext/mods/gameserver/data/xml/FishData$SingletonHolder
   #87 = NameAndType        #89:#90       // INSTANCE:Lext/mods/gameserver/data/xml/FishData;
   #88 = Utf8               ext/mods/gameserver/data/xml/FishData$SingletonHolder
   #89 = Utf8               INSTANCE
   #90 = Utf8               Lext/mods/gameserver/data/xml/FishData;
   #91 = Methodref          #83.#92       // ext/mods/gameserver/model/records/Fish.level:()I
   #92 = NameAndType        #93:#36       // level:()I
   #93 = Utf8               level
   #94 = Methodref          #83.#95       // ext/mods/gameserver/model/records/Fish.type:()I
   #95 = NameAndType        #96:#36       // type:()I
   #96 = Utf8               type
   #97 = Methodref          #83.#98       // ext/mods/gameserver/model/records/Fish.group:()I
   #98 = NameAndType        #99:#36       // group:()I
   #99 = Utf8               group
  #100 = String             #101          // fish
  #101 = Utf8               fish
  #102 = InvokeDynamic      #2:#52        // #2:accept:(Lext/mods/gameserver/data/xml/FishData;)Ljava/util/function/Consumer;
  #103 = Methodref          #11.#104      // ext/mods/gameserver/data/xml/FishData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #104 = NameAndType        #105:#106     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #105 = Utf8               parseAttributes
  #106 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #107 = Methodref          #83.#108      // ext/mods/gameserver/model/records/Fish."<init>":(Lext/mods/commons/data/StatSet;)V
  #108 = NameAndType        #5:#109       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #109 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #110 = InterfaceMethodref #32.#111      // java/util/List.add:(Ljava/lang/Object;)Z
  #111 = NameAndType        #112:#113     // add:(Ljava/lang/Object;)Z
  #112 = Utf8               add
  #113 = Utf8               (Ljava/lang/Object;)Z
  #114 = Class              #115          // ext/mods/commons/data/xml/IXmlReader
  #115 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #116 = Utf8               Signature
  #117 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/Fish;>;
  #118 = Utf8               Code
  #119 = Utf8               LineNumberTable
  #120 = Utf8               LocalVariableTable
  #121 = Utf8               this
  #122 = Utf8               parseDocument
  #123 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #124 = Utf8               doc
  #125 = Utf8               Lorg/w3c/dom/Document;
  #126 = Utf8               path
  #127 = Utf8               Ljava/nio/file/Path;
  #128 = Utf8               getFish
  #129 = Utf8               (III)Lext/mods/gameserver/model/records/Fish;
  #130 = Utf8               lvl
  #131 = Utf8               I
  #132 = Utf8               getInstance
  #133 = Utf8               ()Lext/mods/gameserver/data/xml/FishData;
  #134 = Utf8               lambda$getFish$0
  #135 = Utf8               (IIILext/mods/gameserver/model/records/Fish;)Z
  #136 = Utf8               f
  #137 = Utf8               Lext/mods/gameserver/model/records/Fish;
  #138 = Utf8               StackMapTable
  #139 = Utf8               lambda$parseDocument$0
  #140 = Utf8               (Lorg/w3c/dom/Node;)V
  #141 = Utf8               listNode
  #142 = Utf8               Lorg/w3c/dom/Node;
  #143 = Utf8               lambda$parseDocument$1
  #144 = Utf8               fishNode
  #145 = Utf8               SourceFile
  #146 = Utf8               FishData.java
  #147 = Utf8               NestMembers
  #148 = Utf8               BootstrapMethods
  #149 = MethodType         #150          //  (Ljava/lang/Object;)V
  #150 = Utf8               (Ljava/lang/Object;)V
  #151 = MethodHandle       5:#152        // REF_invokeVirtual ext/mods/gameserver/data/xml/FishData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #152 = Methodref          #11.#153      // ext/mods/gameserver/data/xml/FishData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #153 = NameAndType        #139:#140     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #154 = MethodType         #140          //  (Lorg/w3c/dom/Node;)V
  #155 = MethodType         #113          //  (Ljava/lang/Object;)Z
  #156 = MethodHandle       6:#157        // REF_invokeStatic ext/mods/gameserver/data/xml/FishData.lambda$getFish$0:(IIILext/mods/gameserver/model/records/Fish;)Z
  #157 = Methodref          #11.#158      // ext/mods/gameserver/data/xml/FishData.lambda$getFish$0:(IIILext/mods/gameserver/model/records/Fish;)Z
  #158 = NameAndType        #134:#135     // lambda$getFish$0:(IIILext/mods/gameserver/model/records/Fish;)Z
  #159 = MethodType         #160          //  (Lext/mods/gameserver/model/records/Fish;)Z
  #160 = Utf8               (Lext/mods/gameserver/model/records/Fish;)Z
  #161 = MethodHandle       5:#162        // REF_invokeVirtual ext/mods/gameserver/data/xml/FishData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #162 = Methodref          #11.#163      // ext/mods/gameserver/data/xml/FishData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #163 = NameAndType        #143:#140     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #164 = MethodHandle       6:#165        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #165 = Methodref          #166.#167     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #166 = Class              #168          // java/lang/invoke/LambdaMetafactory
  #167 = NameAndType        #169:#170     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #168 = Utf8               java/lang/invoke/LambdaMetafactory
  #169 = Utf8               metafactory
  #170 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #171 = Utf8               InnerClasses
  #172 = Utf8               SingletonHolder
  #173 = Class              #174          // java/lang/invoke/MethodHandles$Lookup
  #174 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #175 = Class              #176          // java/lang/invoke/MethodHandles
  #176 = Utf8               java/lang/invoke/MethodHandles
  #177 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.FishData();
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
        12: putfield      #10                 // Field _fish:Ljava/util/List;
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
            0      20     0  this   Lext/mods/gameserver/data/xml/FishData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/fish.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} fish.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _fish:Ljava/util/List;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/List.size:()I
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
            0      34     0  this   Lext/mods/gameserver/data/xml/FishData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/FishData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 54: 0
        line 55: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/FishData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.gameserver.model.records.Fish getFish(int, int, int);
    descriptor: (III)Lext/mods/gameserver/model/records/Fish;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getfield      #10                 // Field _fish:Ljava/util/List;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: iload_2
        11: iload_3
        12: invokedynamic #63,  0             // InvokeDynamic #1:test:(III)Ljava/util/function/Predicate;
        17: invokeinterface #67,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        22: invokeinterface #73,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        27: invokestatic  #77                 // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
        30: checkcast     #83                 // class ext/mods/gameserver/model/records/Fish
        33: areturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/xml/FishData;
            0      34     1   lvl   I
            0      34     2  type   I
            0      34     3 group   I

  public static ext.mods.gameserver.data.xml.FishData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/FishData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #85                 // Field ext/mods/gameserver/data/xml/FishData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/FishData;
         3: areturn
      LineNumberTable:
        line 71: 0
}
SourceFile: "FishData.java"
NestMembers:
  ext/mods/gameserver/data/xml/FishData$SingletonHolder
BootstrapMethods:
  0: #164 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #149 (Ljava/lang/Object;)V
      #151 REF_invokeVirtual ext/mods/gameserver/data/xml/FishData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #154 (Lorg/w3c/dom/Node;)V
  1: #164 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #155 (Ljava/lang/Object;)Z
      #156 REF_invokeStatic ext/mods/gameserver/data/xml/FishData.lambda$getFish$0:(IIILext/mods/gameserver/model/records/Fish;)Z
      #159 (Lext/mods/gameserver/model/records/Fish;)Z
  2: #164 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #149 (Ljava/lang/Object;)V
      #161 REF_invokeVirtual ext/mods/gameserver/data/xml/FishData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #154 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #177= #173 of #175; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
