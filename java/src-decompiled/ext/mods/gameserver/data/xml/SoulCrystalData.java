// Bytecode for: ext.mods.gameserver.data.xml.SoulCrystalData
// File: ext\mods\gameserver\data\xml\SoulCrystalData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/SoulCrystalData.class
  Last modified 9 de jul de 2026; size 4107 bytes
  MD5 checksum 156f6c85d149bd91c8bbbb2d88985c43
  Compiled from "SoulCrystalData.java"
public class ext.mods.gameserver.data.xml.SoulCrystalData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/SoulCrystalData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 11, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/SoulCrystalData._soulCrystals:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/SoulCrystalData
   #12 = NameAndType        #14:#15       // _soulCrystals:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/SoulCrystalData
   #14 = Utf8               _soulCrystals
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/data/xml/SoulCrystalData._levelingInfos:Ljava/util/Map;
   #17 = NameAndType        #18:#15       // _levelingInfos:Ljava/util/Map;
   #18 = Utf8               _levelingInfos
   #19 = Methodref          #11.#20       // ext/mods/gameserver/data/xml/SoulCrystalData.load:()V
   #20 = NameAndType        #21:#6        // load:()V
   #21 = Utf8               load
   #22 = String             #23           // xml/soulCrystals.xml
   #23 = Utf8               xml/soulCrystals.xml
   #24 = Methodref          #11.#25       // ext/mods/gameserver/data/xml/SoulCrystalData.parseDataFile:(Ljava/lang/String;)V
   #25 = NameAndType        #26:#27       // parseDataFile:(Ljava/lang/String;)V
   #26 = Utf8               parseDataFile
   #27 = Utf8               (Ljava/lang/String;)V
   #28 = Fieldref           #11.#29       // ext/mods/gameserver/data/xml/SoulCrystalData.LOGGER:Lext/mods/commons/logging/CLogger;
   #29 = NameAndType        #30:#31       // LOGGER:Lext/mods/commons/logging/CLogger;
   #30 = Utf8               LOGGER
   #31 = Utf8               Lext/mods/commons/logging/CLogger;
   #32 = String             #33           // Loaded {} Soul Crystals data and {} NPCs data.
   #33 = Utf8               Loaded {} Soul Crystals data and {} NPCs data.
   #34 = InterfaceMethodref #35.#36       // java/util/Map.size:()I
   #35 = Class              #37           // java/util/Map
   #36 = NameAndType        #38:#39       // size:()I
   #37 = Utf8               java/util/Map
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
   #54 = InvokeDynamic      #0:#55        // #0:accept:(Lext/mods/gameserver/data/xml/SoulCrystalData;)Ljava/util/function/Consumer;
   #55 = NameAndType        #56:#57       // accept:(Lext/mods/gameserver/data/xml/SoulCrystalData;)Ljava/util/function/Consumer;
   #56 = Utf8               accept
   #57 = Utf8               (Lext/mods/gameserver/data/xml/SoulCrystalData;)Ljava/util/function/Consumer;
   #58 = Methodref          #11.#59       // ext/mods/gameserver/data/xml/SoulCrystalData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = NameAndType        #60:#61       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #60 = Utf8               forEach
   #61 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #62 = Fieldref           #63.#64       // ext/mods/gameserver/data/xml/SoulCrystalData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/SoulCrystalData;
   #63 = Class              #65           // ext/mods/gameserver/data/xml/SoulCrystalData$SingletonHolder
   #64 = NameAndType        #66:#67       // INSTANCE:Lext/mods/gameserver/data/xml/SoulCrystalData;
   #65 = Utf8               ext/mods/gameserver/data/xml/SoulCrystalData$SingletonHolder
   #66 = Utf8               INSTANCE
   #67 = Utf8               Lext/mods/gameserver/data/xml/SoulCrystalData;
   #68 = String             #69           // crystals
   #69 = Utf8               crystals
   #70 = InvokeDynamic      #1:#55        // #1:accept:(Lext/mods/gameserver/data/xml/SoulCrystalData;)Ljava/util/function/Consumer;
   #71 = String             #72           // npcs
   #72 = Utf8               npcs
   #73 = InvokeDynamic      #2:#55        // #2:accept:(Lext/mods/gameserver/data/xml/SoulCrystalData;)Ljava/util/function/Consumer;
   #74 = String             #75           // npc
   #75 = Utf8               npc
   #76 = InvokeDynamic      #3:#55        // #3:accept:(Lext/mods/gameserver/data/xml/SoulCrystalData;)Ljava/util/function/Consumer;
   #77 = Methodref          #11.#78       // ext/mods/gameserver/data/xml/SoulCrystalData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #78 = NameAndType        #79:#80       // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #79 = Utf8               parseAttributes
   #80 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #81 = String             #82           // id
   #82 = Utf8               id
   #83 = Methodref          #84.#85       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #84 = Class              #86           // ext/mods/commons/data/StatSet
   #85 = NameAndType        #87:#88       // getInteger:(Ljava/lang/String;)I
   #86 = Utf8               ext/mods/commons/data/StatSet
   #87 = Utf8               getInteger
   #88 = Utf8               (Ljava/lang/String;)I
   #89 = Class              #90           // ext/mods/gameserver/model/records/LevelingInfo
   #90 = Utf8               ext/mods/gameserver/model/records/LevelingInfo
   #91 = Methodref          #89.#92       // ext/mods/gameserver/model/records/LevelingInfo."<init>":(Lext/mods/commons/data/StatSet;)V
   #92 = NameAndType        #5:#93        // "<init>":(Lext/mods/commons/data/StatSet;)V
   #93 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #94 = InterfaceMethodref #35.#95       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #95 = NameAndType        #96:#97       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #96 = Utf8               put
   #97 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #98 = String             #99           // crystal
   #99 = Utf8               crystal
  #100 = InvokeDynamic      #4:#55        // #4:accept:(Lext/mods/gameserver/data/xml/SoulCrystalData;)Ljava/util/function/Consumer;
  #101 = String             #102          // initial
  #102 = Utf8               initial
  #103 = Class              #104          // ext/mods/gameserver/model/records/SoulCrystal
  #104 = Utf8               ext/mods/gameserver/model/records/SoulCrystal
  #105 = Methodref          #103.#92      // ext/mods/gameserver/model/records/SoulCrystal."<init>":(Lext/mods/commons/data/StatSet;)V
  #106 = Class              #107          // ext/mods/commons/data/xml/IXmlReader
  #107 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #108 = Utf8               Signature
  #109 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/SoulCrystal;>;
  #110 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/LevelingInfo;>;
  #111 = Utf8               Code
  #112 = Utf8               LineNumberTable
  #113 = Utf8               LocalVariableTable
  #114 = Utf8               this
  #115 = Utf8               parseDocument
  #116 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #117 = Utf8               doc
  #118 = Utf8               Lorg/w3c/dom/Document;
  #119 = Utf8               path
  #120 = Utf8               Ljava/nio/file/Path;
  #121 = Utf8               getSoulCrystals
  #122 = Utf8               ()Ljava/util/Map;
  #123 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/SoulCrystal;>;
  #124 = Utf8               getLevelingInfos
  #125 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/LevelingInfo;>;
  #126 = Utf8               getInstance
  #127 = Utf8               ()Lext/mods/gameserver/data/xml/SoulCrystalData;
  #128 = Utf8               lambda$parseDocument$0
  #129 = Utf8               (Lorg/w3c/dom/Node;)V
  #130 = Utf8               listNode
  #131 = Utf8               Lorg/w3c/dom/Node;
  #132 = Utf8               lambda$parseDocument$3
  #133 = Utf8               npcsNode
  #134 = Utf8               lambda$parseDocument$4
  #135 = Utf8               npcNode
  #136 = Utf8               set
  #137 = Utf8               Lext/mods/commons/data/StatSet;
  #138 = Utf8               lambda$parseDocument$1
  #139 = Utf8               crystalsNode
  #140 = Utf8               lambda$parseDocument$2
  #141 = Utf8               crystalNode
  #142 = Utf8               SourceFile
  #143 = Utf8               SoulCrystalData.java
  #144 = Utf8               NestMembers
  #145 = Utf8               BootstrapMethods
  #146 = MethodType         #147          //  (Ljava/lang/Object;)V
  #147 = Utf8               (Ljava/lang/Object;)V
  #148 = MethodHandle       5:#149        // REF_invokeVirtual ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #149 = Methodref          #11.#150      // ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #150 = NameAndType        #128:#129     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #151 = MethodType         #129          //  (Lorg/w3c/dom/Node;)V
  #152 = MethodHandle       5:#153        // REF_invokeVirtual ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #153 = Methodref          #11.#154      // ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #154 = NameAndType        #138:#129     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #155 = MethodHandle       5:#156        // REF_invokeVirtual ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
  #156 = Methodref          #11.#157      // ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
  #157 = NameAndType        #132:#129     // lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
  #158 = MethodHandle       5:#159        // REF_invokeVirtual ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$4:(Lorg/w3c/dom/Node;)V
  #159 = Methodref          #11.#160      // ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$4:(Lorg/w3c/dom/Node;)V
  #160 = NameAndType        #134:#129     // lambda$parseDocument$4:(Lorg/w3c/dom/Node;)V
  #161 = MethodHandle       5:#162        // REF_invokeVirtual ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #162 = Methodref          #11.#163      // ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #163 = NameAndType        #140:#129     // lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
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
  protected ext.mods.gameserver.data.xml.SoulCrystalData();
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
        12: putfield      #10                 // Field _soulCrystals:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/HashMap
        19: dup
        20: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        23: putfield      #16                 // Field _levelingInfos:Ljava/util/Map;
        26: aload_0
        27: invokevirtual #19                 // Method load:()V
        30: return
      LineNumberTable:
        line 45: 0
        line 41: 4
        line 42: 15
        line 46: 26
        line 47: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/xml/SoulCrystalData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #22                 // String xml/soulCrystals.xml
         3: invokevirtual #24                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #28                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #32                 // String Loaded {} Soul Crystals data and {} NPCs data.
        11: iconst_2
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _soulCrystals:Ljava/util/Map;
        21: invokeinterface #34,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: dup
        31: iconst_1
        32: aload_0
        33: getfield      #16                 // Field _levelingInfos:Ljava/util/Map;
        36: invokeinterface #34,  1           // InterfaceMethod java/util/Map.size:()I
        41: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        44: aastore
        45: invokevirtual #46                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        48: return
      LineNumberTable:
        line 52: 0
        line 53: 6
        line 54: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/data/xml/SoulCrystalData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #52                 // String list
         4: aload_0
         5: invokedynamic #54,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/SoulCrystalData;)Ljava/util/function/Consumer;
        10: invokevirtual #58                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 59: 0
        line 72: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/SoulCrystalData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public final java.util.Map<java.lang.Integer, ext.mods.gameserver.model.records.SoulCrystal> getSoulCrystals();
    descriptor: ()Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _soulCrystals:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 76: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/SoulCrystalData;
    Signature: #123                         // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/SoulCrystal;>;

  public final java.util.Map<java.lang.Integer, ext.mods.gameserver.model.records.LevelingInfo> getLevelingInfos();
    descriptor: ()Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _levelingInfos:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/SoulCrystalData;
    Signature: #125                         // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/LevelingInfo;>;

  public static ext.mods.gameserver.data.xml.SoulCrystalData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/SoulCrystalData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #62                 // Field ext/mods/gameserver/data/xml/SoulCrystalData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/SoulCrystalData;
         3: areturn
      LineNumberTable:
        line 86: 0
}
SourceFile: "SoulCrystalData.java"
NestMembers:
  ext/mods/gameserver/data/xml/SoulCrystalData$SingletonHolder
BootstrapMethods:
  0: #164 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #146 (Ljava/lang/Object;)V
      #148 REF_invokeVirtual ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #151 (Lorg/w3c/dom/Node;)V
  1: #164 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #146 (Ljava/lang/Object;)V
      #152 REF_invokeVirtual ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #151 (Lorg/w3c/dom/Node;)V
  2: #164 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #146 (Ljava/lang/Object;)V
      #155 REF_invokeVirtual ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
      #151 (Lorg/w3c/dom/Node;)V
  3: #164 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #146 (Ljava/lang/Object;)V
      #158 REF_invokeVirtual ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$4:(Lorg/w3c/dom/Node;)V
      #151 (Lorg/w3c/dom/Node;)V
  4: #164 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #146 (Ljava/lang/Object;)V
      #161 REF_invokeVirtual ext/mods/gameserver/data/xml/SoulCrystalData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
      #151 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #177= #173 of #175; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
