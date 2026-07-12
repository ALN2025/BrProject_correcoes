// Bytecode for: ext.mods.gameserver.data.xml.NewbieBuffData
// File: ext\mods\gameserver\data\xml\NewbieBuffData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/NewbieBuffData.class
  Last modified 9 de jul de 2026; size 4148 bytes
  MD5 checksum f2dadf41148be240181a3e04e3ff87b5
  Compiled from "NewbieBuffData.java"
public class ext.mods.gameserver.data.xml.NewbieBuffData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/NewbieBuffData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 9, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/NewbieBuffData._buffs:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/NewbieBuffData
   #12 = NameAndType        #14:#15       // _buffs:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/data/xml/NewbieBuffData
   #14 = Utf8               _buffs
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/data/xml/NewbieBuffData._magicLowestLevel:I
   #17 = NameAndType        #18:#19       // _magicLowestLevel:I
   #18 = Utf8               _magicLowestLevel
   #19 = Utf8               I
   #20 = Fieldref           #11.#21       // ext/mods/gameserver/data/xml/NewbieBuffData._physicLowestLevel:I
   #21 = NameAndType        #22:#19       // _physicLowestLevel:I
   #22 = Utf8               _physicLowestLevel
   #23 = Methodref          #11.#24       // ext/mods/gameserver/data/xml/NewbieBuffData.load:()V
   #24 = NameAndType        #25:#6        // load:()V
   #25 = Utf8               load
   #26 = String             #27           // xml/newbieBuffs.xml
   #27 = Utf8               xml/newbieBuffs.xml
   #28 = Methodref          #11.#29       // ext/mods/gameserver/data/xml/NewbieBuffData.parseDataFile:(Ljava/lang/String;)V
   #29 = NameAndType        #30:#31       // parseDataFile:(Ljava/lang/String;)V
   #30 = Utf8               parseDataFile
   #31 = Utf8               (Ljava/lang/String;)V
   #32 = Fieldref           #11.#33       // ext/mods/gameserver/data/xml/NewbieBuffData.LOGGER:Lext/mods/commons/logging/CLogger;
   #33 = NameAndType        #34:#35       // LOGGER:Lext/mods/commons/logging/CLogger;
   #34 = Utf8               LOGGER
   #35 = Utf8               Lext/mods/commons/logging/CLogger;
   #36 = String             #37           // Loaded {} newbie buffs.
   #37 = Utf8               Loaded {} newbie buffs.
   #38 = InterfaceMethodref #39.#40       // java/util/List.size:()I
   #39 = Class              #41           // java/util/List
   #40 = NameAndType        #42:#43       // size:()I
   #41 = Utf8               java/util/List
   #42 = Utf8               size
   #43 = Utf8               ()I
   #44 = Methodref          #45.#46       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #45 = Class              #47           // java/lang/Integer
   #46 = NameAndType        #48:#49       // valueOf:(I)Ljava/lang/Integer;
   #47 = Utf8               java/lang/Integer
   #48 = Utf8               valueOf
   #49 = Utf8               (I)Ljava/lang/Integer;
   #50 = Methodref          #51.#52       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #51 = Class              #53           // ext/mods/commons/logging/CLogger
   #52 = NameAndType        #54:#55       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #53 = Utf8               ext/mods/commons/logging/CLogger
   #54 = Utf8               info
   #55 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #56 = String             #57           // list
   #57 = Utf8               list
   #58 = InvokeDynamic      #0:#59        // #0:accept:(Lext/mods/gameserver/data/xml/NewbieBuffData;)Ljava/util/function/Consumer;
   #59 = NameAndType        #60:#61       // accept:(Lext/mods/gameserver/data/xml/NewbieBuffData;)Ljava/util/function/Consumer;
   #60 = Utf8               accept
   #61 = Utf8               (Lext/mods/gameserver/data/xml/NewbieBuffData;)Ljava/util/function/Consumer;
   #62 = Methodref          #11.#63       // ext/mods/gameserver/data/xml/NewbieBuffData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #63 = NameAndType        #64:#65       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #64 = Utf8               forEach
   #65 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #66 = InterfaceMethodref #39.#67       // java/util/List.stream:()Ljava/util/stream/Stream;
   #67 = NameAndType        #68:#69       // stream:()Ljava/util/stream/Stream;
   #68 = Utf8               stream
   #69 = Utf8               ()Ljava/util/stream/Stream;
   #70 = InvokeDynamic      #1:#71        // #1:test:(ZI)Ljava/util/function/Predicate;
   #71 = NameAndType        #72:#73       // test:(ZI)Ljava/util/function/Predicate;
   #72 = Utf8               test
   #73 = Utf8               (ZI)Ljava/util/function/Predicate;
   #74 = InterfaceMethodref #75.#76       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #75 = Class              #77           // java/util/stream/Stream
   #76 = NameAndType        #78:#79       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #77 = Utf8               java/util/stream/Stream
   #78 = Utf8               filter
   #79 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #80 = InterfaceMethodref #75.#81       // java/util/stream/Stream.toList:()Ljava/util/List;
   #81 = NameAndType        #82:#83       // toList:()Ljava/util/List;
   #82 = Utf8               toList
   #83 = Utf8               ()Ljava/util/List;
   #84 = Fieldref           #85.#86       // ext/mods/gameserver/data/xml/NewbieBuffData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/NewbieBuffData;
   #85 = Class              #87           // ext/mods/gameserver/data/xml/NewbieBuffData$SingletonHolder
   #86 = NameAndType        #88:#89       // INSTANCE:Lext/mods/gameserver/data/xml/NewbieBuffData;
   #87 = Utf8               ext/mods/gameserver/data/xml/NewbieBuffData$SingletonHolder
   #88 = Utf8               INSTANCE
   #89 = Utf8               Lext/mods/gameserver/data/xml/NewbieBuffData;
   #90 = Methodref          #91.#92       // ext/mods/gameserver/model/records/NewbieBuff.isMagicClass:()Z
   #91 = Class              #93           // ext/mods/gameserver/model/records/NewbieBuff
   #92 = NameAndType        #94:#95       // isMagicClass:()Z
   #93 = Utf8               ext/mods/gameserver/model/records/NewbieBuff
   #94 = Utf8               isMagicClass
   #95 = Utf8               ()Z
   #96 = Methodref          #91.#97       // ext/mods/gameserver/model/records/NewbieBuff.lowerLevel:()I
   #97 = NameAndType        #98:#43       // lowerLevel:()I
   #98 = Utf8               lowerLevel
   #99 = Methodref          #91.#100      // ext/mods/gameserver/model/records/NewbieBuff.upperLevel:()I
  #100 = NameAndType        #101:#43      // upperLevel:()I
  #101 = Utf8               upperLevel
  #102 = String             #103          // buff
  #103 = Utf8               buff
  #104 = InvokeDynamic      #2:#59        // #2:accept:(Lext/mods/gameserver/data/xml/NewbieBuffData;)Ljava/util/function/Consumer;
  #105 = Methodref          #11.#106      // ext/mods/gameserver/data/xml/NewbieBuffData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #106 = NameAndType        #107:#108     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #107 = Utf8               parseAttributes
  #108 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #109 = String             #98           // lowerLevel
  #110 = Methodref          #111.#112     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #111 = Class              #113          // ext/mods/commons/data/StatSet
  #112 = NameAndType        #114:#115     // getInteger:(Ljava/lang/String;)I
  #113 = Utf8               ext/mods/commons/data/StatSet
  #114 = Utf8               getInteger
  #115 = Utf8               (Ljava/lang/String;)I
  #116 = String             #94           // isMagicClass
  #117 = Methodref          #111.#118     // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;)Z
  #118 = NameAndType        #119:#120     // getBool:(Ljava/lang/String;)Z
  #119 = Utf8               getBool
  #120 = Utf8               (Ljava/lang/String;)Z
  #121 = Methodref          #91.#122      // ext/mods/gameserver/model/records/NewbieBuff."<init>":(Lext/mods/commons/data/StatSet;)V
  #122 = NameAndType        #5:#123       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #123 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #124 = InterfaceMethodref #39.#125      // java/util/List.add:(Ljava/lang/Object;)Z
  #125 = NameAndType        #126:#127     // add:(Ljava/lang/Object;)Z
  #126 = Utf8               add
  #127 = Utf8               (Ljava/lang/Object;)Z
  #128 = Class              #129          // ext/mods/commons/data/xml/IXmlReader
  #129 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #130 = Utf8               Signature
  #131 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/NewbieBuff;>;
  #132 = Utf8               Code
  #133 = Utf8               LineNumberTable
  #134 = Utf8               LocalVariableTable
  #135 = Utf8               this
  #136 = Utf8               parseDocument
  #137 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #138 = Utf8               doc
  #139 = Utf8               Lorg/w3c/dom/Document;
  #140 = Utf8               path
  #141 = Utf8               Ljava/nio/file/Path;
  #142 = Utf8               getValidBuffs
  #143 = Utf8               (ZI)Ljava/util/List;
  #144 = Utf8               isMage
  #145 = Utf8               Z
  #146 = Utf8               level
  #147 = Utf8               (ZI)Ljava/util/List<Lext/mods/gameserver/model/records/NewbieBuff;>;
  #148 = Utf8               getLowestBuffLevel
  #149 = Utf8               (Z)I
  #150 = Utf8               StackMapTable
  #151 = Utf8               getInstance
  #152 = Utf8               ()Lext/mods/gameserver/data/xml/NewbieBuffData;
  #153 = Utf8               lambda$getValidBuffs$0
  #154 = Utf8               (ZILext/mods/gameserver/model/records/NewbieBuff;)Z
  #155 = Utf8               b
  #156 = Utf8               Lext/mods/gameserver/model/records/NewbieBuff;
  #157 = Utf8               lambda$parseDocument$0
  #158 = Utf8               (Lorg/w3c/dom/Node;)V
  #159 = Utf8               listNode
  #160 = Utf8               Lorg/w3c/dom/Node;
  #161 = Utf8               lambda$parseDocument$1
  #162 = Utf8               buffNode
  #163 = Utf8               set
  #164 = Utf8               Lext/mods/commons/data/StatSet;
  #165 = Utf8               SourceFile
  #166 = Utf8               NewbieBuffData.java
  #167 = Utf8               NestMembers
  #168 = Utf8               BootstrapMethods
  #169 = MethodType         #170          //  (Ljava/lang/Object;)V
  #170 = Utf8               (Ljava/lang/Object;)V
  #171 = MethodHandle       5:#172        // REF_invokeVirtual ext/mods/gameserver/data/xml/NewbieBuffData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #172 = Methodref          #11.#173      // ext/mods/gameserver/data/xml/NewbieBuffData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #173 = NameAndType        #157:#158     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #174 = MethodType         #158          //  (Lorg/w3c/dom/Node;)V
  #175 = MethodType         #127          //  (Ljava/lang/Object;)Z
  #176 = MethodHandle       6:#177        // REF_invokeStatic ext/mods/gameserver/data/xml/NewbieBuffData.lambda$getValidBuffs$0:(ZILext/mods/gameserver/model/records/NewbieBuff;)Z
  #177 = Methodref          #11.#178      // ext/mods/gameserver/data/xml/NewbieBuffData.lambda$getValidBuffs$0:(ZILext/mods/gameserver/model/records/NewbieBuff;)Z
  #178 = NameAndType        #153:#154     // lambda$getValidBuffs$0:(ZILext/mods/gameserver/model/records/NewbieBuff;)Z
  #179 = MethodType         #180          //  (Lext/mods/gameserver/model/records/NewbieBuff;)Z
  #180 = Utf8               (Lext/mods/gameserver/model/records/NewbieBuff;)Z
  #181 = MethodHandle       5:#182        // REF_invokeVirtual ext/mods/gameserver/data/xml/NewbieBuffData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #182 = Methodref          #11.#183      // ext/mods/gameserver/data/xml/NewbieBuffData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #183 = NameAndType        #161:#158     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #184 = MethodHandle       6:#185        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #185 = Methodref          #186.#187     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #186 = Class              #188          // java/lang/invoke/LambdaMetafactory
  #187 = NameAndType        #189:#190     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #188 = Utf8               java/lang/invoke/LambdaMetafactory
  #189 = Utf8               metafactory
  #190 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #191 = Utf8               InnerClasses
  #192 = Utf8               SingletonHolder
  #193 = Class              #194          // java/lang/invoke/MethodHandles$Lookup
  #194 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #195 = Class              #196          // java/lang/invoke/MethodHandles
  #196 = Utf8               java/lang/invoke/MethodHandles
  #197 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.NewbieBuffData();
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
        12: putfield      #10                 // Field _buffs:Ljava/util/List;
        15: aload_0
        16: bipush        100
        18: putfield      #16                 // Field _magicLowestLevel:I
        21: aload_0
        22: bipush        100
        24: putfield      #20                 // Field _physicLowestLevel:I
        27: aload_0
        28: invokevirtual #23                 // Method load:()V
        31: return
      LineNumberTable:
        line 42: 0
        line 36: 4
        line 38: 15
        line 39: 21
        line 43: 27
        line 44: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/data/xml/NewbieBuffData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #26                 // String xml/newbieBuffs.xml
         3: invokevirtual #28                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #32                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #36                 // String Loaded {} newbie buffs.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _buffs:Ljava/util/List;
        21: invokeinterface #38,  1           // InterfaceMethod java/util/List.size:()I
        26: invokestatic  #44                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #50                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 49: 0
        line 50: 6
        line 51: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/xml/NewbieBuffData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #56                 // String list
         4: aload_0
         5: invokedynamic #58,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/NewbieBuffData;)Ljava/util/function/Consumer;
        10: invokevirtual #62                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 56: 0
        line 72: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/NewbieBuffData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public java.util.List<ext.mods.gameserver.model.records.NewbieBuff> getValidBuffs(boolean, int);
    descriptor: (ZI)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _buffs:Ljava/util/List;
         4: invokeinterface #66,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: iload_2
        11: invokedynamic #70,  0             // InvokeDynamic #1:test:(ZI)Ljava/util/function/Predicate;
        16: invokeinterface #74,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        21: invokeinterface #80,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        26: areturn
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/data/xml/NewbieBuffData;
            0      27     1 isMage   Z
            0      27     2 level   I
    Signature: #147                         // (ZI)Ljava/util/List<Lext/mods/gameserver/model/records/NewbieBuff;>;

  public int getLowestBuffLevel(boolean);
    descriptor: (Z)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iload_1
         1: ifeq          11
         4: aload_0
         5: getfield      #16                 // Field _magicLowestLevel:I
         8: goto          15
        11: aload_0
        12: getfield      #20                 // Field _physicLowestLevel:I
        15: ireturn
      LineNumberTable:
        line 86: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/data/xml/NewbieBuffData;
            0      16     1 isMage   Z
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public static ext.mods.gameserver.data.xml.NewbieBuffData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/NewbieBuffData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #84                 // Field ext/mods/gameserver/data/xml/NewbieBuffData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/NewbieBuffData;
         3: areturn
      LineNumberTable:
        line 91: 0
}
SourceFile: "NewbieBuffData.java"
NestMembers:
  ext/mods/gameserver/data/xml/NewbieBuffData$SingletonHolder
BootstrapMethods:
  0: #184 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #169 (Ljava/lang/Object;)V
      #171 REF_invokeVirtual ext/mods/gameserver/data/xml/NewbieBuffData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #174 (Lorg/w3c/dom/Node;)V
  1: #184 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #175 (Ljava/lang/Object;)Z
      #176 REF_invokeStatic ext/mods/gameserver/data/xml/NewbieBuffData.lambda$getValidBuffs$0:(ZILext/mods/gameserver/model/records/NewbieBuff;)Z
      #179 (Lext/mods/gameserver/model/records/NewbieBuff;)Z
  2: #184 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #169 (Ljava/lang/Object;)V
      #181 REF_invokeVirtual ext/mods/gameserver/data/xml/NewbieBuffData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #174 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #197= #193 of #195; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
