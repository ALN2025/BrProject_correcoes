// Bytecode for: ext.mods.Crypta.AgathionData
// File: ext\mods\Crypta\AgathionData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/Crypta/AgathionData.class
  Last modified 9 de jul de 2026; size 4354 bytes
  MD5 checksum 2399430489221d89639236bfff7689fc
  Compiled from "AgathionData.java"
public class ext.mods.Crypta.AgathionData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/Crypta/AgathionData
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
   #10 = Fieldref           #11.#12       // ext/mods/Crypta/AgathionData._listagation:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/Crypta/AgathionData
   #12 = NameAndType        #14:#15       // _listagation:Ljava/util/Map;
   #13 = Utf8               ext/mods/Crypta/AgathionData
   #14 = Utf8               _listagation
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/Crypta/AgathionData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = InterfaceMethodref #20.#21       // java/util/Map.clear:()V
   #20 = Class              #22           // java/util/Map
   #21 = NameAndType        #23:#6        // clear:()V
   #22 = Utf8               java/util/Map
   #23 = Utf8               clear
   #24 = String             #25           // custom/mods/agathionList.xml
   #25 = Utf8               custom/mods/agathionList.xml
   #26 = Methodref          #11.#27       // ext/mods/Crypta/AgathionData.parseDataFile:(Ljava/lang/String;)V
   #27 = NameAndType        #28:#29       // parseDataFile:(Ljava/lang/String;)V
   #28 = Utf8               parseDataFile
   #29 = Utf8               (Ljava/lang/String;)V
   #30 = Fieldref           #11.#31       // ext/mods/Crypta/AgathionData.LOGGER:Lext/mods/commons/logging/CLogger;
   #31 = NameAndType        #32:#33       // LOGGER:Lext/mods/commons/logging/CLogger;
   #32 = Utf8               LOGGER
   #33 = Utf8               Lext/mods/commons/logging/CLogger;
   #34 = InterfaceMethodref #20.#35       // java/util/Map.size:()I
   #35 = NameAndType        #36:#37       // size:()I
   #36 = Utf8               size
   #37 = Utf8               ()I
   #38 = InvokeDynamic      #0:#39        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #39 = NameAndType        #40:#41       // makeConcatWithConstants:(I)Ljava/lang/String;
   #40 = Utf8               makeConcatWithConstants
   #41 = Utf8               (I)Ljava/lang/String;
   #42 = Methodref          #43.#44       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #43 = Class              #45           // ext/mods/commons/logging/CLogger
   #44 = NameAndType        #46:#47       // info:(Ljava/lang/Object;)V
   #45 = Utf8               ext/mods/commons/logging/CLogger
   #46 = Utf8               info
   #47 = Utf8               (Ljava/lang/Object;)V
   #48 = String             #49           // list
   #49 = Utf8               list
   #50 = InvokeDynamic      #1:#51        // #1:accept:(Lext/mods/Crypta/AgathionData;)Ljava/util/function/Consumer;
   #51 = NameAndType        #52:#53       // accept:(Lext/mods/Crypta/AgathionData;)Ljava/util/function/Consumer;
   #52 = Utf8               accept
   #53 = Utf8               (Lext/mods/Crypta/AgathionData;)Ljava/util/function/Consumer;
   #54 = Methodref          #11.#55       // ext/mods/Crypta/AgathionData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #55 = NameAndType        #56:#57       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = Utf8               forEach
   #57 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #58 = Methodref          #59.#60       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #59 = Class              #61           // java/lang/Integer
   #60 = NameAndType        #62:#63       // valueOf:(I)Ljava/lang/Integer;
   #61 = Utf8               java/lang/Integer
   #62 = Utf8               valueOf
   #63 = Utf8               (I)Ljava/lang/Integer;
   #64 = InterfaceMethodref #65.#66       // java/util/List.of:()Ljava/util/List;
   #65 = Class              #67           // java/util/List
   #66 = NameAndType        #68:#69       // of:()Ljava/util/List;
   #67 = Utf8               java/util/List
   #68 = Utf8               of
   #69 = Utf8               ()Ljava/util/List;
   #70 = InterfaceMethodref #20.#71       // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #71 = NameAndType        #72:#73       // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #72 = Utf8               getOrDefault
   #73 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #74 = Fieldref           #75.#76       // ext/mods/Crypta/AgathionData$SingletonHolder._instance:Lext/mods/Crypta/AgathionData;
   #75 = Class              #77           // ext/mods/Crypta/AgathionData$SingletonHolder
   #76 = NameAndType        #78:#79       // _instance:Lext/mods/Crypta/AgathionData;
   #77 = Utf8               ext/mods/Crypta/AgathionData$SingletonHolder
   #78 = Utf8               _instance
   #79 = Utf8               Lext/mods/Crypta/AgathionData;
   #80 = String             #81           // items
   #81 = Utf8               items
   #82 = InvokeDynamic      #2:#51        // #2:accept:(Lext/mods/Crypta/AgathionData;)Ljava/util/function/Consumer;
   #83 = Methodref          #11.#84       // ext/mods/Crypta/AgathionData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #84 = NameAndType        #85:#86       // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #85 = Utf8               parseAttributes
   #86 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #87 = String             #88           // id
   #88 = Utf8               id
   #89 = Methodref          #90.#91       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #90 = Class              #92           // ext/mods/commons/data/StatSet
   #91 = NameAndType        #93:#94       // getInteger:(Ljava/lang/String;)I
   #92 = Utf8               ext/mods/commons/data/StatSet
   #93 = Utf8               getInteger
   #94 = Utf8               (Ljava/lang/String;)I
   #95 = String             #96           // agathion
   #96 = Utf8               agathion
   #97 = InvokeDynamic      #3:#98        // #3:accept:(Lext/mods/Crypta/AgathionData;I)Ljava/util/function/Consumer;
   #98 = NameAndType        #52:#99       // accept:(Lext/mods/Crypta/AgathionData;I)Ljava/util/function/Consumer;
   #99 = Utf8               (Lext/mods/Crypta/AgathionData;I)Ljava/util/function/Consumer;
  #100 = Class              #101          // ext/mods/aghation/holder/AgathionHolder
  #101 = Utf8               ext/mods/aghation/holder/AgathionHolder
  #102 = Methodref          #100.#103     // ext/mods/aghation/holder/AgathionHolder."<init>":(Lext/mods/commons/data/StatSet;)V
  #103 = NameAndType        #5:#104       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #104 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #105 = InvokeDynamic      #4:#106       // #4:apply:()Ljava/util/function/Function;
  #106 = NameAndType        #107:#108     // apply:()Ljava/util/function/Function;
  #107 = Utf8               apply
  #108 = Utf8               ()Ljava/util/function/Function;
  #109 = InterfaceMethodref #20.#110      // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #110 = NameAndType        #111:#112     // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #111 = Utf8               computeIfAbsent
  #112 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #113 = InterfaceMethodref #65.#114      // java/util/List.add:(Ljava/lang/Object;)Z
  #114 = NameAndType        #115:#116     // add:(Ljava/lang/Object;)Z
  #115 = Utf8               add
  #116 = Utf8               (Ljava/lang/Object;)Z
  #117 = Class              #118          // java/util/ArrayList
  #118 = Utf8               java/util/ArrayList
  #119 = Methodref          #117.#3       // java/util/ArrayList."<init>":()V
  #120 = Class              #121          // ext/mods/commons/data/xml/IXmlReader
  #121 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #122 = Utf8               Signature
  #123 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/aghation/holder/AgathionHolder;>;>;
  #124 = Utf8               Code
  #125 = Utf8               LineNumberTable
  #126 = Utf8               LocalVariableTable
  #127 = Utf8               this
  #128 = Utf8               reload
  #129 = Utf8               parseDocument
  #130 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #131 = Utf8               doc
  #132 = Utf8               Lorg/w3c/dom/Document;
  #133 = Utf8               path
  #134 = Utf8               Ljava/nio/file/Path;
  #135 = Utf8               getAgathionsByItemId
  #136 = Utf8               (I)Ljava/util/List;
  #137 = Utf8               boxId
  #138 = Utf8               I
  #139 = Utf8               (I)Ljava/util/List<Lext/mods/aghation/holder/AgathionHolder;>;
  #140 = Utf8               getInstance
  #141 = Utf8               ()Lext/mods/Crypta/AgathionData;
  #142 = Utf8               lambda$parseDocument$0
  #143 = Utf8               (Lorg/w3c/dom/Node;)V
  #144 = Utf8               listNode
  #145 = Utf8               Lorg/w3c/dom/Node;
  #146 = Utf8               lambda$parseDocument$1
  #147 = Utf8               itemNode
  #148 = Utf8               set
  #149 = Utf8               Lext/mods/commons/data/StatSet;
  #150 = Utf8               lambda$parseDocument$2
  #151 = Utf8               (ILorg/w3c/dom/Node;)V
  #152 = Utf8               holder
  #153 = Utf8               npcAttributes
  #154 = Utf8               agathionholder
  #155 = Utf8               Lext/mods/aghation/holder/AgathionHolder;
  #156 = Utf8               lambda$parseDocument$3
  #157 = Utf8               (Ljava/lang/Integer;)Ljava/util/List;
  #158 = Utf8               k
  #159 = Utf8               Ljava/lang/Integer;
  #160 = Utf8               SourceFile
  #161 = Utf8               AgathionData.java
  #162 = Utf8               NestMembers
  #163 = Utf8               BootstrapMethods
  #164 = String             #165          // Loaded {\u0001} Agathion list.
  #165 = Utf8               Loaded {\u0001} Agathion list.
  #166 = MethodType         #47           //  (Ljava/lang/Object;)V
  #167 = MethodHandle       5:#168        // REF_invokeVirtual ext/mods/Crypta/AgathionData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #168 = Methodref          #11.#169      // ext/mods/Crypta/AgathionData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #169 = NameAndType        #142:#143     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #170 = MethodType         #143          //  (Lorg/w3c/dom/Node;)V
  #171 = MethodHandle       5:#172        // REF_invokeVirtual ext/mods/Crypta/AgathionData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #172 = Methodref          #11.#173      // ext/mods/Crypta/AgathionData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #173 = NameAndType        #146:#143     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #174 = MethodHandle       5:#175        // REF_invokeVirtual ext/mods/Crypta/AgathionData.lambda$parseDocument$2:(ILorg/w3c/dom/Node;)V
  #175 = Methodref          #11.#176      // ext/mods/Crypta/AgathionData.lambda$parseDocument$2:(ILorg/w3c/dom/Node;)V
  #176 = NameAndType        #150:#151     // lambda$parseDocument$2:(ILorg/w3c/dom/Node;)V
  #177 = MethodType         #178          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #178 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #179 = MethodHandle       6:#180        // REF_invokeStatic ext/mods/Crypta/AgathionData.lambda$parseDocument$3:(Ljava/lang/Integer;)Ljava/util/List;
  #180 = Methodref          #11.#181      // ext/mods/Crypta/AgathionData.lambda$parseDocument$3:(Ljava/lang/Integer;)Ljava/util/List;
  #181 = NameAndType        #156:#157     // lambda$parseDocument$3:(Ljava/lang/Integer;)Ljava/util/List;
  #182 = MethodType         #157          //  (Ljava/lang/Integer;)Ljava/util/List;
  #183 = MethodHandle       6:#184        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #184 = Methodref          #185.#186     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #185 = Class              #187          // java/lang/invoke/StringConcatFactory
  #186 = NameAndType        #40:#188      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #187 = Utf8               java/lang/invoke/StringConcatFactory
  #188 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #189 = MethodHandle       6:#190        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #190 = Methodref          #191.#192     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #191 = Class              #193          // java/lang/invoke/LambdaMetafactory
  #192 = NameAndType        #194:#195     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #193 = Utf8               java/lang/invoke/LambdaMetafactory
  #194 = Utf8               metafactory
  #195 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #196 = Utf8               InnerClasses
  #197 = Utf8               SingletonHolder
  #198 = Class              #199          // java/lang/invoke/MethodHandles$Lookup
  #199 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #200 = Class              #201          // java/lang/invoke/MethodHandles
  #201 = Utf8               java/lang/invoke/MethodHandles
  #202 = Utf8               Lookup
{
  public ext.mods.Crypta.AgathionData();
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
        12: putfield      #10                 // Field _listagation:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 36: 0
        line 34: 4
        line 37: 15
        line 38: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/Crypta/AgathionData;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _listagation:Ljava/util/Map;
         4: invokeinterface #19,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 42: 0
        line 43: 9
        line 44: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/Crypta/AgathionData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ldc           #24                 // String custom/mods/agathionList.xml
         3: invokevirtual #26                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #30                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: aload_0
        10: getfield      #10                 // Field _listagation:Ljava/util/Map;
        13: invokeinterface #34,  1           // InterfaceMethod java/util/Map.size:()I
        18: invokedynamic #38,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        23: invokevirtual #42                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        26: return
      LineNumberTable:
        line 49: 0
        line 50: 6
        line 51: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/Crypta/AgathionData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #48                 // String list
         4: aload_0
         5: invokedynamic #50,  0             // InvokeDynamic #1:accept:(Lext/mods/Crypta/AgathionData;)Ljava/util/function/Consumer;
        10: invokevirtual #54                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 56: 0
        line 72: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/Crypta/AgathionData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public java.util.List<ext.mods.aghation.holder.AgathionHolder> getAgathionsByItemId(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _listagation:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #58                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokestatic  #64                 // InterfaceMethod java/util/List.of:()Ljava/util/List;
        11: invokeinterface #70,  3           // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #65                 // class java/util/List
        19: areturn
      LineNumberTable:
        line 76: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/Crypta/AgathionData;
            0      20     1 boxId   I
    Signature: #139                         // (I)Ljava/util/List<Lext/mods/aghation/holder/AgathionHolder;>;

  public static ext.mods.Crypta.AgathionData getInstance();
    descriptor: ()Lext/mods/Crypta/AgathionData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #74                 // Field ext/mods/Crypta/AgathionData$SingletonHolder._instance:Lext/mods/Crypta/AgathionData;
         3: areturn
      LineNumberTable:
        line 81: 0
}
SourceFile: "AgathionData.java"
NestMembers:
  ext/mods/Crypta/AgathionData$SingletonHolder
BootstrapMethods:
  0: #183 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #164 Loaded {\u0001} Agathion list.
  1: #189 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #166 (Ljava/lang/Object;)V
      #167 REF_invokeVirtual ext/mods/Crypta/AgathionData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #170 (Lorg/w3c/dom/Node;)V
  2: #189 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #166 (Ljava/lang/Object;)V
      #171 REF_invokeVirtual ext/mods/Crypta/AgathionData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #170 (Lorg/w3c/dom/Node;)V
  3: #189 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #166 (Ljava/lang/Object;)V
      #174 REF_invokeVirtual ext/mods/Crypta/AgathionData.lambda$parseDocument$2:(ILorg/w3c/dom/Node;)V
      #170 (Lorg/w3c/dom/Node;)V
  4: #189 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #177 (Ljava/lang/Object;)Ljava/lang/Object;
      #179 REF_invokeStatic ext/mods/Crypta/AgathionData.lambda$parseDocument$3:(Ljava/lang/Integer;)Ljava/util/List;
      #182 (Ljava/lang/Integer;)Ljava/util/List;
InnerClasses:
  public static final #202= #198 of #200; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
