// Bytecode for: ext.mods.gameserver.data.xml.PlayerLevelData
// File: ext\mods\gameserver\data\xml\PlayerLevelData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/PlayerLevelData.class
  Last modified 9 de jul de 2026; size 3570 bytes
  MD5 checksum ecdf88f9ed023766ecd9a37899492862
  Compiled from "PlayerLevelData.java"
public class ext.mods.gameserver.data.xml.PlayerLevelData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/PlayerLevelData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 10, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/PlayerLevelData._levels:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/PlayerLevelData
   #12 = NameAndType        #14:#15       // _levels:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/PlayerLevelData
   #14 = Utf8               _levels
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/PlayerLevelData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/playerLevels.xml
   #20 = Utf8               xml/playerLevels.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/PlayerLevelData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/PlayerLevelData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} player levels.
   #30 = Utf8               Loaded {} player levels.
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
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/PlayerLevelData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/PlayerLevelData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/PlayerLevelData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/PlayerLevelData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #32.#60       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #60 = NameAndType        #61:#62       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #61 = Utf8               get
   #62 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #63 = Class              #64           // ext/mods/gameserver/model/records/PlayerLevel
   #64 = Utf8               ext/mods/gameserver/model/records/PlayerLevel
   #65 = Fieldref           #11.#66       // ext/mods/gameserver/data/xml/PlayerLevelData._maxLevel:I
   #66 = NameAndType        #67:#68       // _maxLevel:I
   #67 = Utf8               _maxLevel
   #68 = Utf8               I
   #69 = Methodref          #63.#70       // ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
   #70 = NameAndType        #71:#72       // requiredExpToLevelUp:()J
   #71 = Utf8               requiredExpToLevelUp
   #72 = Utf8               ()J
   #73 = Fieldref           #74.#75       // ext/mods/gameserver/data/xml/PlayerLevelData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/PlayerLevelData;
   #74 = Class              #76           // ext/mods/gameserver/data/xml/PlayerLevelData$SingletonHolder
   #75 = NameAndType        #77:#78       // INSTANCE:Lext/mods/gameserver/data/xml/PlayerLevelData;
   #76 = Utf8               ext/mods/gameserver/data/xml/PlayerLevelData$SingletonHolder
   #77 = Utf8               INSTANCE
   #78 = Utf8               Lext/mods/gameserver/data/xml/PlayerLevelData;
   #79 = String             #80           // playerLevel
   #80 = Utf8               playerLevel
   #81 = InvokeDynamic      #1:#52        // #1:accept:(Lext/mods/gameserver/data/xml/PlayerLevelData;)Ljava/util/function/Consumer;
   #82 = Methodref          #11.#83       // ext/mods/gameserver/data/xml/PlayerLevelData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #83 = NameAndType        #84:#85       // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #84 = Utf8               parseAttributes
   #85 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #86 = String             #87           // level
   #87 = Utf8               level
   #88 = Methodref          #89.#90       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #89 = Class              #91           // ext/mods/commons/data/StatSet
   #90 = NameAndType        #92:#93       // getInteger:(Ljava/lang/String;)I
   #91 = Utf8               ext/mods/commons/data/StatSet
   #92 = Utf8               getInteger
   #93 = Utf8               (Ljava/lang/String;)I
   #94 = Methodref          #63.#95       // ext/mods/gameserver/model/records/PlayerLevel."<init>":(Lext/mods/commons/data/StatSet;)V
   #95 = NameAndType        #5:#96        // "<init>":(Lext/mods/commons/data/StatSet;)V
   #96 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #97 = InterfaceMethodref #32.#98       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #98 = NameAndType        #99:#100      // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #99 = Utf8               put
  #100 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #101 = Class              #102          // ext/mods/commons/data/xml/IXmlReader
  #102 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #103 = Utf8               Signature
  #104 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/PlayerLevel;>;
  #105 = Utf8               Code
  #106 = Utf8               LineNumberTable
  #107 = Utf8               LocalVariableTable
  #108 = Utf8               this
  #109 = Utf8               parseDocument
  #110 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #111 = Utf8               doc
  #112 = Utf8               Lorg/w3c/dom/Document;
  #113 = Utf8               path
  #114 = Utf8               Ljava/nio/file/Path;
  #115 = Utf8               getPlayerLevel
  #116 = Utf8               (I)Lext/mods/gameserver/model/records/PlayerLevel;
  #117 = Utf8               getRequiredExpForHighestLevel
  #118 = Utf8               getMaxLevel
  #119 = Utf8               getRealMaxLevel
  #120 = Utf8               getInstance
  #121 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #122 = Utf8               lambda$parseDocument$0
  #123 = Utf8               (Lorg/w3c/dom/Node;)V
  #124 = Utf8               listNode
  #125 = Utf8               Lorg/w3c/dom/Node;
  #126 = Utf8               lambda$parseDocument$1
  #127 = Utf8               levelNode
  #128 = Utf8               set
  #129 = Utf8               Lext/mods/commons/data/StatSet;
  #130 = Utf8               StackMapTable
  #131 = Utf8               SourceFile
  #132 = Utf8               PlayerLevelData.java
  #133 = Utf8               NestMembers
  #134 = Utf8               BootstrapMethods
  #135 = MethodType         #136          //  (Ljava/lang/Object;)V
  #136 = Utf8               (Ljava/lang/Object;)V
  #137 = MethodHandle       5:#138        // REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerLevelData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #138 = Methodref          #11.#139      // ext/mods/gameserver/data/xml/PlayerLevelData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #139 = NameAndType        #122:#123     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #140 = MethodType         #123          //  (Lorg/w3c/dom/Node;)V
  #141 = MethodHandle       5:#142        // REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerLevelData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #142 = Methodref          #11.#143      // ext/mods/gameserver/data/xml/PlayerLevelData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #143 = NameAndType        #126:#123     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #144 = MethodHandle       6:#145        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #145 = Methodref          #146.#147     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #146 = Class              #148          // java/lang/invoke/LambdaMetafactory
  #147 = NameAndType        #149:#150     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #148 = Utf8               java/lang/invoke/LambdaMetafactory
  #149 = Utf8               metafactory
  #150 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #151 = Utf8               InnerClasses
  #152 = Utf8               SingletonHolder
  #153 = Class              #154          // java/lang/invoke/MethodHandles$Lookup
  #154 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #155 = Class              #156          // java/lang/invoke/MethodHandles
  #156 = Utf8               java/lang/invoke/MethodHandles
  #157 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.PlayerLevelData();
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
        12: putfield      #10                 // Field _levels:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 41: 0
        line 36: 4
        line 42: 15
        line 43: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/PlayerLevelData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/playerLevels.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} player levels.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _levels:Ljava/util/Map;
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
            0      34     0  this   Lext/mods/gameserver/data/xml/PlayerLevelData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/PlayerLevelData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 55: 0
        line 65: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/PlayerLevelData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.gameserver.model.records.PlayerLevel getPlayerLevel(int);
    descriptor: (I)Lext/mods/gameserver/model/records/PlayerLevel;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _levels:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #59,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #63                 // class ext/mods/gameserver/model/records/PlayerLevel
        16: areturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/PlayerLevelData;
            0      17     1 level   I

  public long getRequiredExpForHighestLevel();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _levels:Ljava/util/Map;
         4: aload_0
         5: getfield      #65                 // Field _maxLevel:I
         8: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #59,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #63                 // class ext/mods/gameserver/model/records/PlayerLevel
        19: invokevirtual #69                 // Method ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
        22: lreturn
      LineNumberTable:
        line 78: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/data/xml/PlayerLevelData;

  public int getMaxLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #65                 // Field _maxLevel:I
         4: ireturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/PlayerLevelData;

  public int getRealMaxLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #65                 // Field _maxLevel:I
         4: iconst_1
         5: isub
         6: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/data/xml/PlayerLevelData;

  public static ext.mods.gameserver.data.xml.PlayerLevelData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/PlayerLevelData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #73                 // Field ext/mods/gameserver/data/xml/PlayerLevelData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/PlayerLevelData;
         3: areturn
      LineNumberTable:
        line 97: 0
}
SourceFile: "PlayerLevelData.java"
NestMembers:
  ext/mods/gameserver/data/xml/PlayerLevelData$SingletonHolder
BootstrapMethods:
  0: #144 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #135 (Ljava/lang/Object;)V
      #137 REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerLevelData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #140 (Lorg/w3c/dom/Node;)V
  1: #144 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #135 (Ljava/lang/Object;)V
      #141 REF_invokeVirtual ext/mods/gameserver/data/xml/PlayerLevelData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #140 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #157= #153 of #155; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
