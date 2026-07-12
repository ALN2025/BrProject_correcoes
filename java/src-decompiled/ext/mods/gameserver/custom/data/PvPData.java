// Bytecode for: ext.mods.gameserver.custom.data.PvPData
// File: ext\mods\gameserver\custom\data\PvPData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/PvPData.class
  Last modified 9 de jul de 2026; size 4244 bytes
  MD5 checksum bdd97be0da3f7c6a55363345db87d613
  Compiled from "PvPData.java"
public class ext.mods.gameserver.custom.data.PvPData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/custom/data/PvPData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 11, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/custom/data/PvPData._color:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/custom/data/PvPData
   #12 = NameAndType        #14:#15       // _color:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/custom/data/PvPData
   #14 = Utf8               _color
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/custom/data/PvPData._reward:Ljava/util/List;
   #17 = NameAndType        #18:#15       // _reward:Ljava/util/List;
   #18 = Utf8               _reward
   #19 = Methodref          #11.#20       // ext/mods/gameserver/custom/data/PvPData.load:()V
   #20 = NameAndType        #21:#6        // load:()V
   #21 = Utf8               load
   #22 = InterfaceMethodref #23.#24       // java/util/List.clear:()V
   #23 = Class              #25           // java/util/List
   #24 = NameAndType        #26:#6        // clear:()V
   #25 = Utf8               java/util/List
   #26 = Utf8               clear
   #27 = Fieldref           #11.#28       // ext/mods/gameserver/custom/data/PvPData._enabled:Z
   #28 = NameAndType        #29:#30       // _enabled:Z
   #29 = Utf8               _enabled
   #30 = Utf8               Z
   #31 = String             #32           // custom/mods/pvpSystem.xml
   #32 = Utf8               custom/mods/pvpSystem.xml
   #33 = Methodref          #11.#34       // ext/mods/gameserver/custom/data/PvPData.parseDataFile:(Ljava/lang/String;)V
   #34 = NameAndType        #35:#36       // parseDataFile:(Ljava/lang/String;)V
   #35 = Utf8               parseDataFile
   #36 = Utf8               (Ljava/lang/String;)V
   #37 = Fieldref           #11.#38       // ext/mods/gameserver/custom/data/PvPData.LOGGER:Lext/mods/commons/logging/CLogger;
   #38 = NameAndType        #39:#40       // LOGGER:Lext/mods/commons/logging/CLogger;
   #39 = Utf8               LOGGER
   #40 = Utf8               Lext/mods/commons/logging/CLogger;
   #41 = String             #42           // Loaded {} PvP Colors templates.
   #42 = Utf8               Loaded {} PvP Colors templates.
   #43 = InterfaceMethodref #23.#44       // java/util/List.size:()I
   #44 = NameAndType        #45:#46       // size:()I
   #45 = Utf8               size
   #46 = Utf8               ()I
   #47 = Methodref          #48.#49       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #48 = Class              #50           // java/lang/Integer
   #49 = NameAndType        #51:#52       // valueOf:(I)Ljava/lang/Integer;
   #50 = Utf8               java/lang/Integer
   #51 = Utf8               valueOf
   #52 = Utf8               (I)Ljava/lang/Integer;
   #53 = Methodref          #54.#55       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #54 = Class              #56           // ext/mods/commons/logging/CLogger
   #55 = NameAndType        #57:#58       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #56 = Utf8               ext/mods/commons/logging/CLogger
   #57 = Utf8               info
   #58 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #59 = String             #60           // Loaded {} PvP Rewards templates.
   #60 = Utf8               Loaded {} PvP Rewards templates.
   #61 = String             #62           // PvP System is disabled.
   #62 = Utf8               PvP System is disabled.
   #63 = Methodref          #54.#64       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #64 = NameAndType        #65:#66       // warn:(Ljava/lang/Object;)V
   #65 = Utf8               warn
   #66 = Utf8               (Ljava/lang/Object;)V
   #67 = String             #68           // list
   #68 = Utf8               list
   #69 = InvokeDynamic      #0:#70        // #0:accept:(Lext/mods/gameserver/custom/data/PvPData;)Ljava/util/function/Consumer;
   #70 = NameAndType        #71:#72       // accept:(Lext/mods/gameserver/custom/data/PvPData;)Ljava/util/function/Consumer;
   #71 = Utf8               accept
   #72 = Utf8               (Lext/mods/gameserver/custom/data/PvPData;)Ljava/util/function/Consumer;
   #73 = Methodref          #11.#74       // ext/mods/gameserver/custom/data/PvPData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #74 = NameAndType        #75:#76       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #75 = Utf8               forEach
   #76 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #77 = Methodref          #78.#79       // java/util/Collections.emptyList:()Ljava/util/List;
   #78 = Class              #80           // java/util/Collections
   #79 = NameAndType        #81:#82       // emptyList:()Ljava/util/List;
   #80 = Utf8               java/util/Collections
   #81 = Utf8               emptyList
   #82 = Utf8               ()Ljava/util/List;
   #83 = Fieldref           #84.#85       // ext/mods/gameserver/custom/data/PvPData$SingletonHolder._instance:Lext/mods/gameserver/custom/data/PvPData;
   #84 = Class              #86           // ext/mods/gameserver/custom/data/PvPData$SingletonHolder
   #85 = NameAndType        #87:#88       // _instance:Lext/mods/gameserver/custom/data/PvPData;
   #86 = Utf8               ext/mods/gameserver/custom/data/PvPData$SingletonHolder
   #87 = Utf8               _instance
   #88 = Utf8               Lext/mods/gameserver/custom/data/PvPData;
   #89 = Methodref          #11.#90       // ext/mods/gameserver/custom/data/PvPData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #90 = NameAndType        #91:#92       // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #91 = Utf8               parseAttributes
   #92 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #93 = String             #94           // enabled
   #94 = Utf8               enabled
   #95 = Methodref          #96.#97       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
   #96 = Class              #98           // ext/mods/commons/data/StatSet
   #97 = NameAndType        #99:#100      // getBool:(Ljava/lang/String;Z)Z
   #98 = Utf8               ext/mods/commons/data/StatSet
   #99 = Utf8               getBool
  #100 = Utf8               (Ljava/lang/String;Z)Z
  #101 = String             #102          // color
  #102 = Utf8               color
  #103 = InvokeDynamic      #1:#70        // #1:accept:(Lext/mods/gameserver/custom/data/PvPData;)Ljava/util/function/Consumer;
  #104 = String             #105          // reward
  #105 = Utf8               reward
  #106 = InvokeDynamic      #2:#70        // #2:accept:(Lext/mods/gameserver/custom/data/PvPData;)Ljava/util/function/Consumer;
  #107 = Class              #108          // ext/mods/gameserver/custom/data/PvPData$RewardSystem
  #108 = Utf8               ext/mods/gameserver/custom/data/PvPData$RewardSystem
  #109 = Methodref          #107.#110     // ext/mods/gameserver/custom/data/PvPData$RewardSystem."<init>":(Lext/mods/commons/data/StatSet;)V
  #110 = NameAndType        #5:#111       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #111 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #112 = InterfaceMethodref #23.#113      // java/util/List.add:(Ljava/lang/Object;)Z
  #113 = NameAndType        #114:#115     // add:(Ljava/lang/Object;)Z
  #114 = Utf8               add
  #115 = Utf8               (Ljava/lang/Object;)Z
  #116 = Class              #117          // ext/mods/gameserver/custom/data/PvPData$ColorSystem
  #117 = Utf8               ext/mods/gameserver/custom/data/PvPData$ColorSystem
  #118 = Methodref          #116.#110     // ext/mods/gameserver/custom/data/PvPData$ColorSystem."<init>":(Lext/mods/commons/data/StatSet;)V
  #119 = Class              #120          // ext/mods/commons/data/xml/IXmlReader
  #120 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #121 = Utf8               Signature
  #122 = Utf8               Ljava/util/List<Lext/mods/gameserver/custom/data/PvPData$ColorSystem;>;
  #123 = Utf8               Ljava/util/List<Lext/mods/gameserver/custom/data/PvPData$RewardSystem;>;
  #124 = Utf8               Code
  #125 = Utf8               LineNumberTable
  #126 = Utf8               LocalVariableTable
  #127 = Utf8               this
  #128 = Utf8               reload
  #129 = Utf8               StackMapTable
  #130 = Utf8               parseDocument
  #131 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #132 = Utf8               doc
  #133 = Utf8               Lorg/w3c/dom/Document;
  #134 = Utf8               path
  #135 = Utf8               Ljava/nio/file/Path;
  #136 = Utf8               getColor
  #137 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/custom/data/PvPData$ColorSystem;>;
  #138 = Utf8               getReward
  #139 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/custom/data/PvPData$RewardSystem;>;
  #140 = Utf8               isEnabled
  #141 = Utf8               ()Z
  #142 = Utf8               getInstance
  #143 = Utf8               ()Lext/mods/gameserver/custom/data/PvPData;
  #144 = Utf8               lambda$parseDocument$0
  #145 = Utf8               (Lorg/w3c/dom/Node;)V
  #146 = Utf8               listNode
  #147 = Utf8               Lorg/w3c/dom/Node;
  #148 = Utf8               set
  #149 = Utf8               Lext/mods/commons/data/StatSet;
  #150 = Utf8               lambda$parseDocument$2
  #151 = Utf8               rewardNode
  #152 = Utf8               rewardSet
  #153 = Utf8               lambda$parseDocument$1
  #154 = Utf8               colorNode
  #155 = Utf8               colorSet
  #156 = Utf8               SourceFile
  #157 = Utf8               PvPData.java
  #158 = Utf8               NestMembers
  #159 = Utf8               BootstrapMethods
  #160 = MethodType         #66           //  (Ljava/lang/Object;)V
  #161 = MethodHandle       5:#162        // REF_invokeVirtual ext/mods/gameserver/custom/data/PvPData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #162 = Methodref          #11.#163      // ext/mods/gameserver/custom/data/PvPData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #163 = NameAndType        #144:#145     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #164 = MethodType         #145          //  (Lorg/w3c/dom/Node;)V
  #165 = MethodHandle       5:#166        // REF_invokeVirtual ext/mods/gameserver/custom/data/PvPData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #166 = Methodref          #11.#167      // ext/mods/gameserver/custom/data/PvPData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #167 = NameAndType        #153:#145     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #168 = MethodHandle       5:#169        // REF_invokeVirtual ext/mods/gameserver/custom/data/PvPData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #169 = Methodref          #11.#170      // ext/mods/gameserver/custom/data/PvPData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #170 = NameAndType        #150:#145     // lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
  #171 = MethodHandle       6:#172        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #172 = Methodref          #173.#174     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #173 = Class              #175          // java/lang/invoke/LambdaMetafactory
  #174 = NameAndType        #176:#177     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #175 = Utf8               java/lang/invoke/LambdaMetafactory
  #176 = Utf8               metafactory
  #177 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #178 = Utf8               InnerClasses
  #179 = Utf8               SingletonHolder
  #180 = Utf8               RewardSystem
  #181 = Utf8               ColorSystem
  #182 = Class              #183          // java/lang/invoke/MethodHandles$Lookup
  #183 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #184 = Class              #185          // java/lang/invoke/MethodHandles
  #185 = Utf8               java/lang/invoke/MethodHandles
  #186 = Utf8               Lookup
{
  public ext.mods.gameserver.custom.data.PvPData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _color:Ljava/util/List;
        15: aload_0
        16: new           #7                  // class java/util/ArrayList
        19: dup
        20: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        23: putfield      #16                 // Field _reward:Ljava/util/List;
        26: aload_0
        27: invokevirtual #19                 // Method load:()V
        30: return
      LineNumberTable:
        line 39: 0
        line 34: 4
        line 35: 15
        line 40: 26
        line 41: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/custom/data/PvPData;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _color:Ljava/util/List;
         4: invokeinterface #22,  1           // InterfaceMethod java/util/List.clear:()V
         9: aload_0
        10: getfield      #16                 // Field _reward:Ljava/util/List;
        13: invokeinterface #22,  1           // InterfaceMethod java/util/List.clear:()V
        18: aload_0
        19: invokevirtual #19                 // Method load:()V
        22: return
      LineNumberTable:
        line 45: 0
        line 46: 9
        line 47: 18
        line 48: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/custom/data/PvPData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _enabled:Z
         4: ifeq          70
         7: aload_0
         8: ldc           #31                 // String custom/mods/pvpSystem.xml
        10: invokevirtual #33                 // Method parseDataFile:(Ljava/lang/String;)V
        13: getstatic     #37                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        16: ldc           #41                 // String Loaded {} PvP Colors templates.
        18: iconst_1
        19: anewarray     #2                  // class java/lang/Object
        22: dup
        23: iconst_0
        24: aload_0
        25: getfield      #10                 // Field _color:Ljava/util/List;
        28: invokeinterface #43,  1           // InterfaceMethod java/util/List.size:()I
        33: invokestatic  #47                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        36: aastore
        37: invokevirtual #53                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        40: getstatic     #37                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        43: ldc           #59                 // String Loaded {} PvP Rewards templates.
        45: iconst_1
        46: anewarray     #2                  // class java/lang/Object
        49: dup
        50: iconst_0
        51: aload_0
        52: getfield      #16                 // Field _reward:Ljava/util/List;
        55: invokeinterface #43,  1           // InterfaceMethod java/util/List.size:()I
        60: invokestatic  #47                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        63: aastore
        64: invokevirtual #53                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        67: goto          78
        70: getstatic     #37                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        73: ldc           #61                 // String PvP System is disabled.
        75: invokevirtual #63                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
        78: return
      LineNumberTable:
        line 53: 0
        line 55: 7
        line 56: 13
        line 57: 40
        line 60: 70
        line 61: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      79     0  this   Lext/mods/gameserver/custom/data/PvPData;
      StackMapTable: number_of_entries = 2
        frame_type = 251 /* same_frame_extended */
          offset_delta = 70
        frame_type = 7 /* same */

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #67                 // String list
         4: aload_0
         5: invokedynamic #69,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/custom/data/PvPData;)Ljava/util/function/Consumer;
        10: invokevirtual #73                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 66: 0
        line 86: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/PvPData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public java.util.List<ext.mods.gameserver.custom.data.PvPData$ColorSystem> getColor();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _enabled:Z
         4: ifeq          14
         7: aload_0
         8: getfield      #10                 // Field _color:Ljava/util/List;
        11: goto          17
        14: invokestatic  #77                 // Method java/util/Collections.emptyList:()Ljava/util/List;
        17: areturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/custom/data/PvPData;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/util/List ]
    Signature: #137                         // ()Ljava/util/List<Lext/mods/gameserver/custom/data/PvPData$ColorSystem;>;

  public java.util.List<ext.mods.gameserver.custom.data.PvPData$RewardSystem> getReward();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _enabled:Z
         4: ifeq          14
         7: aload_0
         8: getfield      #16                 // Field _reward:Ljava/util/List;
        11: goto          17
        14: invokestatic  #77                 // Method java/util/Collections.emptyList:()Ljava/util/List;
        17: areturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/custom/data/PvPData;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/util/List ]
    Signature: #139                         // ()Ljava/util/List<Lext/mods/gameserver/custom/data/PvPData$RewardSystem;>;

  public boolean isEnabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _enabled:Z
         4: ireturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/custom/data/PvPData;

  public static ext.mods.gameserver.custom.data.PvPData getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/PvPData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #83                 // Field ext/mods/gameserver/custom/data/PvPData$SingletonHolder._instance:Lext/mods/gameserver/custom/data/PvPData;
         3: areturn
      LineNumberTable:
        line 121: 0
}
SourceFile: "PvPData.java"
NestMembers:
  ext/mods/gameserver/custom/data/PvPData$SingletonHolder
  ext/mods/gameserver/custom/data/PvPData$ColorSystem
  ext/mods/gameserver/custom/data/PvPData$RewardSystem
BootstrapMethods:
  0: #171 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #160 (Ljava/lang/Object;)V
      #161 REF_invokeVirtual ext/mods/gameserver/custom/data/PvPData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #164 (Lorg/w3c/dom/Node;)V
  1: #171 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #160 (Ljava/lang/Object;)V
      #165 REF_invokeVirtual ext/mods/gameserver/custom/data/PvPData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #164 (Lorg/w3c/dom/Node;)V
  2: #171 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #160 (Ljava/lang/Object;)V
      #168 REF_invokeVirtual ext/mods/gameserver/custom/data/PvPData.lambda$parseDocument$2:(Lorg/w3c/dom/Node;)V
      #164 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #180= #107 of #11;  // RewardSystem=class ext/mods/gameserver/custom/data/PvPData$RewardSystem of class ext/mods/gameserver/custom/data/PvPData
  public static final #181= #116 of #11;  // ColorSystem=class ext/mods/gameserver/custom/data/PvPData$ColorSystem of class ext/mods/gameserver/custom/data/PvPData
  public static final #186= #182 of #184; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
