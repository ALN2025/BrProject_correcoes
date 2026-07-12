// Bytecode for: ext.mods.gameserver.custom.data.PcCafeData
// File: ext\mods\gameserver\custom\data\PcCafeData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/PcCafeData.class
  Last modified 9 de jul de 2026; size 3942 bytes
  MD5 checksum eab54c5c299d983ade269aec15128ed9
  Compiled from "PcCafeData.java"
public final class ext.mods.gameserver.custom.data.PcCafeData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/custom/data/PcCafeData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 9, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/custom/data/PcCafeData._cafeData:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/custom/data/PcCafeData
   #12 = NameAndType        #14:#15       // _cafeData:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/custom/data/PcCafeData
   #14 = Utf8               _cafeData
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/custom/data/PcCafeData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // custom/mods/pcCafe.xml
   #20 = Utf8               custom/mods/pcCafe.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/custom/data/PcCafeData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/custom/data/PcCafeData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} pcCafe variables.
   #30 = Utf8               Loaded {} pcCafe variables.
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
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/custom/data/PcCafeData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/custom/data/PcCafeData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/custom/data/PcCafeData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/custom/data/PcCafeData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #32.#60       // java/util/Map.clear:()V
   #60 = NameAndType        #61:#6        // clear:()V
   #61 = Utf8               clear
   #62 = InterfaceMethodref #32.#63       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #63 = NameAndType        #64:#65       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #64 = Utf8               get
   #65 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #66 = Class              #67           // java/lang/Boolean
   #67 = Utf8               java/lang/Boolean
   #68 = Methodref          #66.#69       // java/lang/Boolean.booleanValue:()Z
   #69 = NameAndType        #70:#71       // booleanValue:()Z
   #70 = Utf8               booleanValue
   #71 = Utf8               ()Z
   #72 = Class              #73           // java/lang/String
   #73 = Utf8               java/lang/String
   #74 = Methodref          #66.#75       // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
   #75 = NameAndType        #76:#77       // parseBoolean:(Ljava/lang/String;)Z
   #76 = Utf8               parseBoolean
   #77 = Utf8               (Ljava/lang/String;)Z
   #78 = Class              #79           // java/lang/Number
   #79 = Utf8               java/lang/Number
   #80 = Methodref          #78.#81       // java/lang/Number.intValue:()I
   #81 = NameAndType        #82:#36       // intValue:()I
   #82 = Utf8               intValue
   #83 = Methodref          #38.#84       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #84 = NameAndType        #85:#86       // parseInt:(Ljava/lang/String;)I
   #85 = Utf8               parseInt
   #86 = Utf8               (Ljava/lang/String;)I
   #87 = Fieldref           #88.#89       // ext/mods/gameserver/custom/data/PcCafeData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/PcCafeData;
   #88 = Class              #90           // ext/mods/gameserver/custom/data/PcCafeData$SingletonHolder
   #89 = NameAndType        #91:#92       // INSTANCE:Lext/mods/gameserver/custom/data/PcCafeData;
   #90 = Utf8               ext/mods/gameserver/custom/data/PcCafeData$SingletonHolder
   #91 = Utf8               INSTANCE
   #92 = Utf8               Lext/mods/gameserver/custom/data/PcCafeData;
   #93 = String             #94           // variable
   #94 = Utf8               variable
   #95 = InvokeDynamic      #1:#52        // #1:accept:(Lext/mods/gameserver/custom/data/PcCafeData;)Ljava/util/function/Consumer;
   #96 = Methodref          #11.#97       // ext/mods/gameserver/custom/data/PcCafeData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #97 = NameAndType        #98:#99       // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #98 = Utf8               parseAttributes
   #99 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #100 = String             #101          // name
  #101 = Utf8               name
  #102 = Methodref          #103.#104     // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #103 = Class              #105          // ext/mods/commons/data/StatSet
  #104 = NameAndType        #106:#107     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #105 = Utf8               ext/mods/commons/data/StatSet
  #106 = Utf8               getString
  #107 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #108 = String             #109          // value
  #109 = Utf8               value
  #110 = InterfaceMethodref #32.#111      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #111 = NameAndType        #112:#113     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #112 = Utf8               put
  #113 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #114 = Class              #115          // ext/mods/commons/data/xml/IXmlReader
  #115 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #116 = Utf8               Signature
  #117 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
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
  #128 = Utf8               reload
  #129 = Utf8               getCafeBool
  #130 = Utf8               (Ljava/lang/String;Z)Z
  #131 = Utf8               bool
  #132 = Utf8               Ljava/lang/Boolean;
  #133 = Utf8               str
  #134 = Utf8               Ljava/lang/String;
  #135 = Utf8               num
  #136 = Utf8               Ljava/lang/Number;
  #137 = Utf8               key
  #138 = Utf8               defaultValue
  #139 = Utf8               Z
  #140 = Utf8               val
  #141 = Utf8               Ljava/lang/Object;
  #142 = Utf8               StackMapTable
  #143 = Utf8               getCafeInt
  #144 = Utf8               (Ljava/lang/String;I)I
  #145 = Utf8               I
  #146 = Utf8               getInstance
  #147 = Utf8               ()Lext/mods/gameserver/custom/data/PcCafeData;
  #148 = Utf8               lambda$parseDocument$0
  #149 = Utf8               (Lorg/w3c/dom/Node;)V
  #150 = Utf8               listNode
  #151 = Utf8               Lorg/w3c/dom/Node;
  #152 = Utf8               lambda$parseDocument$1
  #153 = Utf8               accessNode
  #154 = Utf8               set
  #155 = Utf8               Lext/mods/commons/data/StatSet;
  #156 = Utf8               SourceFile
  #157 = Utf8               PcCafeData.java
  #158 = Utf8               NestMembers
  #159 = Utf8               BootstrapMethods
  #160 = MethodType         #161          //  (Ljava/lang/Object;)V
  #161 = Utf8               (Ljava/lang/Object;)V
  #162 = MethodHandle       5:#163        // REF_invokeVirtual ext/mods/gameserver/custom/data/PcCafeData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #163 = Methodref          #11.#164      // ext/mods/gameserver/custom/data/PcCafeData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #164 = NameAndType        #148:#149     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #165 = MethodType         #149          //  (Lorg/w3c/dom/Node;)V
  #166 = MethodHandle       5:#167        // REF_invokeVirtual ext/mods/gameserver/custom/data/PcCafeData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #167 = Methodref          #11.#168      // ext/mods/gameserver/custom/data/PcCafeData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #168 = NameAndType        #152:#149     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #169 = MethodHandle       6:#170        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #170 = Methodref          #171.#172     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #171 = Class              #173          // java/lang/invoke/LambdaMetafactory
  #172 = NameAndType        #174:#175     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #173 = Utf8               java/lang/invoke/LambdaMetafactory
  #174 = Utf8               metafactory
  #175 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #176 = Utf8               InnerClasses
  #177 = Utf8               SingletonHolder
  #178 = Class              #179          // java/lang/invoke/MethodHandles$Lookup
  #179 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #180 = Class              #181          // java/lang/invoke/MethodHandles
  #181 = Utf8               java/lang/invoke/MethodHandles
  #182 = Utf8               Lookup
{
  protected ext.mods.gameserver.custom.data.PcCafeData();
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
        12: putfield      #10                 // Field _cafeData:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 37: 0
        line 34: 4
        line 38: 15
        line 39: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/custom/data/PcCafeData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String custom/mods/pcCafe.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} pcCafe variables.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _cafeData:Ljava/util/Map;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 44: 0
        line 45: 6
        line 46: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/custom/data/PcCafeData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/custom/data/PcCafeData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 51: 0
        line 59: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/PcCafeData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _cafeData:Ljava/util/Map;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 63: 0
        line 64: 9
        line 65: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/PcCafeData;

  public boolean getCafeBool(java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _cafeData:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #62,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: astore_3
        11: aload_3
        12: instanceof    #66                 // class java/lang/Boolean
        15: ifeq          30
        18: aload_3
        19: checkcast     #66                 // class java/lang/Boolean
        22: astore        4
        24: aload         4
        26: invokevirtual #68                 // Method java/lang/Boolean.booleanValue:()Z
        29: ireturn
        30: aload_3
        31: instanceof    #72                 // class java/lang/String
        34: ifeq          49
        37: aload_3
        38: checkcast     #72                 // class java/lang/String
        41: astore        4
        43: aload         4
        45: invokestatic  #74                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        48: ireturn
        49: aload_3
        50: instanceof    #78                 // class java/lang/Number
        53: ifeq          76
        56: aload_3
        57: checkcast     #78                 // class java/lang/Number
        60: astore        4
        62: aload         4
        64: invokevirtual #80                 // Method java/lang/Number.intValue:()I
        67: ifeq          74
        70: iconst_1
        71: goto          75
        74: iconst_0
        75: ireturn
        76: iload_2
        77: ireturn
      LineNumberTable:
        line 69: 0
        line 71: 11
        line 72: 24
        line 74: 30
        line 75: 43
        line 77: 49
        line 78: 62
        line 80: 76
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24       6     4  bool   Ljava/lang/Boolean;
           43       6     4   str   Ljava/lang/String;
           62      14     4   num   Ljava/lang/Number;
            0      78     0  this   Lext/mods/gameserver/custom/data/PcCafeData;
            0      78     1   key   Ljava/lang/String;
            0      78     2 defaultValue   Z
           11      67     3   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class java/lang/Object ]
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/lang/Number ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public int getCafeInt(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _cafeData:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #62,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: astore_3
        11: aload_3
        12: instanceof    #78                 // class java/lang/Number
        15: ifeq          30
        18: aload_3
        19: checkcast     #78                 // class java/lang/Number
        22: astore        4
        24: aload         4
        26: invokevirtual #80                 // Method java/lang/Number.intValue:()I
        29: ireturn
        30: aload_3
        31: instanceof    #72                 // class java/lang/String
        34: ifeq          49
        37: aload_3
        38: checkcast     #72                 // class java/lang/String
        41: astore        4
        43: aload         4
        45: invokestatic  #83                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        48: ireturn
        49: aload_3
        50: instanceof    #66                 // class java/lang/Boolean
        53: ifeq          76
        56: aload_3
        57: checkcast     #66                 // class java/lang/Boolean
        60: astore        4
        62: aload         4
        64: invokevirtual #68                 // Method java/lang/Boolean.booleanValue:()Z
        67: ifeq          74
        70: iconst_1
        71: goto          75
        74: iconst_0
        75: ireturn
        76: iload_2
        77: ireturn
      LineNumberTable:
        line 85: 0
        line 87: 11
        line 88: 24
        line 90: 30
        line 91: 43
        line 93: 49
        line 94: 62
        line 96: 76
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24       6     4   num   Ljava/lang/Number;
           43       6     4   str   Ljava/lang/String;
           62      14     4  bool   Ljava/lang/Boolean;
            0      78     0  this   Lext/mods/gameserver/custom/data/PcCafeData;
            0      78     1   key   Ljava/lang/String;
            0      78     2 defaultValue   I
           11      67     3   val   Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class java/lang/Object ]
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/lang/Boolean ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 0

  public static ext.mods.gameserver.custom.data.PcCafeData getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/PcCafeData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #87                 // Field ext/mods/gameserver/custom/data/PcCafeData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/PcCafeData;
         3: areturn
      LineNumberTable:
        line 101: 0
}
SourceFile: "PcCafeData.java"
NestMembers:
  ext/mods/gameserver/custom/data/PcCafeData$SingletonHolder
BootstrapMethods:
  0: #169 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #160 (Ljava/lang/Object;)V
      #162 REF_invokeVirtual ext/mods/gameserver/custom/data/PcCafeData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #165 (Lorg/w3c/dom/Node;)V
  1: #169 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #160 (Ljava/lang/Object;)V
      #166 REF_invokeVirtual ext/mods/gameserver/custom/data/PcCafeData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #165 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #182= #178 of #180; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
