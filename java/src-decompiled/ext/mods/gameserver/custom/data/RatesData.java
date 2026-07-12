// Bytecode for: ext.mods.gameserver.custom.data.RatesData
// File: ext\mods\gameserver\custom\data\RatesData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/RatesData.class
  Last modified 9 de jul de 2026; size 3579 bytes
  MD5 checksum 9eb36890c834b5dd34716b123da24ba8
  Compiled from "RatesData.java"
public class ext.mods.gameserver.custom.data.RatesData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/custom/data/RatesData
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/custom/data/RatesData._ratess:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/custom/data/RatesData
   #12 = NameAndType        #14:#15       // _ratess:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/custom/data/RatesData
   #14 = Utf8               _ratess
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/custom/data/RatesData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // custom/mods/rates.xml
   #20 = Utf8               custom/mods/rates.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/custom/data/RatesData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/custom/data/RatesData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = Methodref          #2.#30        // java/lang/Object.getClass:()Ljava/lang/Class;
   #30 = NameAndType        #31:#32       // getClass:()Ljava/lang/Class;
   #31 = Utf8               getClass
   #32 = Utf8               ()Ljava/lang/Class;
   #33 = Methodref          #34.#35       // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #34 = Class              #36           // java/lang/Class
   #35 = NameAndType        #37:#38       // getSimpleName:()Ljava/lang/String;
   #36 = Utf8               java/lang/Class
   #37 = Utf8               getSimpleName
   #38 = Utf8               ()Ljava/lang/String;
   #39 = InterfaceMethodref #40.#41       // java/util/Map.size:()I
   #40 = Class              #42           // java/util/Map
   #41 = NameAndType        #43:#44       // size:()I
   #42 = Utf8               java/util/Map
   #43 = Utf8               size
   #44 = Utf8               ()I
   #45 = InvokeDynamic      #0:#46        // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #46 = NameAndType        #47:#48       // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #47 = Utf8               makeConcatWithConstants
   #48 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #49 = Methodref          #50.#51       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #50 = Class              #52           // ext/mods/commons/logging/CLogger
   #51 = NameAndType        #53:#54       // info:(Ljava/lang/Object;)V
   #52 = Utf8               ext/mods/commons/logging/CLogger
   #53 = Utf8               info
   #54 = Utf8               (Ljava/lang/Object;)V
   #55 = String             #56           // list
   #56 = Utf8               list
   #57 = InvokeDynamic      #1:#58        // #1:accept:(Lext/mods/gameserver/custom/data/RatesData;)Ljava/util/function/Consumer;
   #58 = NameAndType        #59:#60       // accept:(Lext/mods/gameserver/custom/data/RatesData;)Ljava/util/function/Consumer;
   #59 = Utf8               accept
   #60 = Utf8               (Lext/mods/gameserver/custom/data/RatesData;)Ljava/util/function/Consumer;
   #61 = Methodref          #11.#62       // ext/mods/gameserver/custom/data/RatesData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #62 = NameAndType        #63:#64       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #63 = Utf8               forEach
   #64 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #65 = Methodref          #66.#67       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #66 = Class              #68           // java/lang/Integer
   #67 = NameAndType        #69:#70       // valueOf:(I)Ljava/lang/Integer;
   #68 = Utf8               java/lang/Integer
   #69 = Utf8               valueOf
   #70 = Utf8               (I)Ljava/lang/Integer;
   #71 = InterfaceMethodref #40.#72       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #72 = NameAndType        #73:#74       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #73 = Utf8               get
   #74 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #75 = Class              #76           // ext/mods/gameserver/model/records/custom/RatesHolder
   #76 = Utf8               ext/mods/gameserver/model/records/custom/RatesHolder
   #77 = Fieldref           #78.#79       // ext/mods/gameserver/custom/data/RatesData$SingletonHolder._instance:Lext/mods/gameserver/custom/data/RatesData;
   #78 = Class              #80           // ext/mods/gameserver/custom/data/RatesData$SingletonHolder
   #79 = NameAndType        #81:#82       // _instance:Lext/mods/gameserver/custom/data/RatesData;
   #80 = Utf8               ext/mods/gameserver/custom/data/RatesData$SingletonHolder
   #81 = Utf8               _instance
   #82 = Utf8               Lext/mods/gameserver/custom/data/RatesData;
   #83 = String             #84           // rate
   #84 = Utf8               rate
   #85 = InvokeDynamic      #2:#58        // #2:accept:(Lext/mods/gameserver/custom/data/RatesData;)Ljava/util/function/Consumer;
   #86 = Class              #87           // ext/mods/commons/data/StatSet
   #87 = Utf8               ext/mods/commons/data/StatSet
   #88 = Methodref          #11.#89       // ext/mods/gameserver/custom/data/RatesData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #89 = NameAndType        #90:#91       // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #90 = Utf8               parseAttributes
   #91 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #92 = Methodref          #86.#93       // ext/mods/commons/data/StatSet."<init>":(Lext/mods/commons/data/StatSet;)V
   #93 = NameAndType        #5:#94        // "<init>":(Lext/mods/commons/data/StatSet;)V
   #94 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #95 = Methodref          #75.#93       // ext/mods/gameserver/model/records/custom/RatesHolder."<init>":(Lext/mods/commons/data/StatSet;)V
   #96 = Methodref          #75.#97       // ext/mods/gameserver/model/records/custom/RatesHolder.getLevel:()I
   #97 = NameAndType        #98:#44       // getLevel:()I
   #98 = Utf8               getLevel
   #99 = InterfaceMethodref #40.#100      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #100 = NameAndType        #101:#102     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #101 = Utf8               put
  #102 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #103 = Class              #104          // ext/mods/commons/data/xml/IXmlReader
  #104 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #105 = Utf8               Signature
  #106 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/custom/RatesHolder;>;
  #107 = Utf8               Code
  #108 = Utf8               LineNumberTable
  #109 = Utf8               LocalVariableTable
  #110 = Utf8               this
  #111 = Utf8               parseDocument
  #112 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #113 = Utf8               doc
  #114 = Utf8               Lorg/w3c/dom/Document;
  #115 = Utf8               path
  #116 = Utf8               Ljava/nio/file/Path;
  #117 = Utf8               getRates
  #118 = Utf8               (I)Lext/mods/gameserver/model/records/custom/RatesHolder;
  #119 = Utf8               lvl
  #120 = Utf8               I
  #121 = Utf8               getInstance
  #122 = Utf8               ()Lext/mods/gameserver/custom/data/RatesData;
  #123 = Utf8               lambda$parseDocument$0
  #124 = Utf8               (Lorg/w3c/dom/Node;)V
  #125 = Utf8               listNode
  #126 = Utf8               Lorg/w3c/dom/Node;
  #127 = Utf8               lambda$parseDocument$1
  #128 = Utf8               greetNode
  #129 = Utf8               set
  #130 = Utf8               Lext/mods/commons/data/StatSet;
  #131 = Utf8               holder
  #132 = Utf8               Lext/mods/gameserver/model/records/custom/RatesHolder;
  #133 = Utf8               SourceFile
  #134 = Utf8               RatesData.java
  #135 = Utf8               NestMembers
  #136 = Utf8               BootstrapMethods
  #137 = String             #138          // \u0001: Loaded \u0001 rates.
  #138 = Utf8               \u0001: Loaded \u0001 rates.
  #139 = MethodType         #54           //  (Ljava/lang/Object;)V
  #140 = MethodHandle       5:#141        // REF_invokeVirtual ext/mods/gameserver/custom/data/RatesData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #141 = Methodref          #11.#142      // ext/mods/gameserver/custom/data/RatesData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #142 = NameAndType        #123:#124     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #143 = MethodType         #124          //  (Lorg/w3c/dom/Node;)V
  #144 = MethodHandle       5:#145        // REF_invokeVirtual ext/mods/gameserver/custom/data/RatesData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #145 = Methodref          #11.#146      // ext/mods/gameserver/custom/data/RatesData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #146 = NameAndType        #127:#124     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #147 = MethodHandle       6:#148        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #148 = Methodref          #149.#150     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #149 = Class              #151          // java/lang/invoke/StringConcatFactory
  #150 = NameAndType        #47:#152      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #151 = Utf8               java/lang/invoke/StringConcatFactory
  #152 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #153 = MethodHandle       6:#154        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #154 = Methodref          #155.#156     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #155 = Class              #157          // java/lang/invoke/LambdaMetafactory
  #156 = NameAndType        #158:#159     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #157 = Utf8               java/lang/invoke/LambdaMetafactory
  #158 = Utf8               metafactory
  #159 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #160 = Utf8               InnerClasses
  #161 = Utf8               SingletonHolder
  #162 = Class              #163          // java/lang/invoke/MethodHandles$Lookup
  #163 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #164 = Class              #165          // java/lang/invoke/MethodHandles
  #165 = Utf8               java/lang/invoke/MethodHandles
  #166 = Utf8               Lookup
{
  public ext.mods.gameserver.custom.data.RatesData();
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
        12: putfield      #10                 // Field _ratess:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 36: 0
        line 33: 4
        line 37: 15
        line 38: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/custom/data/RatesData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String custom/mods/rates.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: aload_0
        10: invokevirtual #29                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        13: invokevirtual #33                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
        16: aload_0
        17: getfield      #10                 // Field _ratess:Ljava/util/Map;
        20: invokeinterface #39,  1           // InterfaceMethod java/util/Map.size:()I
        25: invokedynamic #45,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        30: invokevirtual #49                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 43: 0
        line 44: 6
        line 46: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/custom/data/RatesData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #55                 // String list
         4: aload_0
         5: invokedynamic #57,  0             // InvokeDynamic #1:accept:(Lext/mods/gameserver/custom/data/RatesData;)Ljava/util/function/Consumer;
        10: invokevirtual #61                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 51: 0
        line 58: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/RatesData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.gameserver.model.records.custom.RatesHolder getRates(int);
    descriptor: (I)Lext/mods/gameserver/model/records/custom/RatesHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _ratess:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #65                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #71,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #75                 // class ext/mods/gameserver/model/records/custom/RatesHolder
        16: areturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/custom/data/RatesData;
            0      17     1   lvl   I

  public static ext.mods.gameserver.custom.data.RatesData getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/RatesData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #77                 // Field ext/mods/gameserver/custom/data/RatesData$SingletonHolder._instance:Lext/mods/gameserver/custom/data/RatesData;
         3: areturn
      LineNumberTable:
        line 67: 0
}
SourceFile: "RatesData.java"
NestMembers:
  ext/mods/gameserver/custom/data/RatesData$SingletonHolder
BootstrapMethods:
  0: #147 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #137 \u0001: Loaded \u0001 rates.
  1: #153 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #139 (Ljava/lang/Object;)V
      #140 REF_invokeVirtual ext/mods/gameserver/custom/data/RatesData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #143 (Lorg/w3c/dom/Node;)V
  2: #153 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #139 (Ljava/lang/Object;)V
      #144 REF_invokeVirtual ext/mods/gameserver/custom/data/RatesData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #143 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #166= #162 of #164; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
