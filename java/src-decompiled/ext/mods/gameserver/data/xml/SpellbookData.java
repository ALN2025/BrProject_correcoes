// Bytecode for: ext.mods.gameserver.data.xml.SpellbookData
// File: ext\mods\gameserver\data\xml\SpellbookData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/SpellbookData.class
  Last modified 9 de jul de 2026; size 3396 bytes
  MD5 checksum 5a7dcbd6e0909cb71414837d372fd76d
  Compiled from "SpellbookData.java"
public class ext.mods.gameserver.data.xml.SpellbookData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/SpellbookData
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/SpellbookData._books:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/SpellbookData
   #12 = NameAndType        #14:#15       // _books:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/SpellbookData
   #14 = Utf8               _books
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/SpellbookData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/spellbooks.xml
   #20 = Utf8               xml/spellbooks.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/SpellbookData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/SpellbookData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} spellbooks.
   #30 = Utf8               Loaded {} spellbooks.
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
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/SpellbookData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/SpellbookData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/SpellbookData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/SpellbookData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = Class              #60           // ext/mods/gameserver/skills/L2Skill
   #60 = Utf8               ext/mods/gameserver/skills/L2Skill
   #61 = Fieldref           #62.#63       // ext/mods/Config.DIVINE_SP_BOOK_NEEDED:Z
   #62 = Class              #64           // ext/mods/Config
   #63 = NameAndType        #65:#66       // DIVINE_SP_BOOK_NEEDED:Z
   #64 = Utf8               ext/mods/Config
   #65 = Utf8               DIVINE_SP_BOOK_NEEDED
   #66 = Utf8               Z
   #67 = Fieldref           #62.#68       // ext/mods/Config.SP_BOOK_NEEDED:Z
   #68 = NameAndType        #69:#66       // SP_BOOK_NEEDED:Z
   #69 = Utf8               SP_BOOK_NEEDED
   #70 = InterfaceMethodref #32.#71       // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #71 = NameAndType        #72:#73       // containsKey:(Ljava/lang/Object;)Z
   #72 = Utf8               containsKey
   #73 = Utf8               (Ljava/lang/Object;)Z
   #74 = InterfaceMethodref #32.#75       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #75 = NameAndType        #76:#77       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #76 = Utf8               get
   #77 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #78 = Methodref          #38.#79       // java/lang/Integer.intValue:()I
   #79 = NameAndType        #80:#36       // intValue:()I
   #80 = Utf8               intValue
   #81 = Fieldref           #82.#83       // ext/mods/gameserver/data/xml/SpellbookData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/SpellbookData;
   #82 = Class              #84           // ext/mods/gameserver/data/xml/SpellbookData$SingletonHolder
   #83 = NameAndType        #85:#86       // INSTANCE:Lext/mods/gameserver/data/xml/SpellbookData;
   #84 = Utf8               ext/mods/gameserver/data/xml/SpellbookData$SingletonHolder
   #85 = Utf8               INSTANCE
   #86 = Utf8               Lext/mods/gameserver/data/xml/SpellbookData;
   #87 = String             #88           // book
   #88 = Utf8               book
   #89 = InvokeDynamic      #1:#52        // #1:accept:(Lext/mods/gameserver/data/xml/SpellbookData;)Ljava/util/function/Consumer;
   #90 = InterfaceMethodref #91.#92       // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #91 = Class              #93           // org/w3c/dom/Node
   #92 = NameAndType        #94:#95       // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #93 = Utf8               org/w3c/dom/Node
   #94 = Utf8               getAttributes
   #95 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
   #96 = String             #97           // skillId
   #97 = Utf8               skillId
   #98 = Methodref          #11.#99       // ext/mods/gameserver/data/xml/SpellbookData.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
   #99 = NameAndType        #100:#101     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #100 = Utf8               parseInteger
  #101 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #102 = String             #103          // itemId
  #103 = Utf8               itemId
  #104 = InterfaceMethodref #32.#105      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #105 = NameAndType        #106:#107     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #106 = Utf8               put
  #107 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #108 = Class              #109          // ext/mods/commons/data/xml/IXmlReader
  #109 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #110 = Utf8               Signature
  #111 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #112 = Utf8               Code
  #113 = Utf8               LineNumberTable
  #114 = Utf8               LocalVariableTable
  #115 = Utf8               this
  #116 = Utf8               parseDocument
  #117 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #118 = Utf8               doc
  #119 = Utf8               Lorg/w3c/dom/Document;
  #120 = Utf8               path
  #121 = Utf8               Ljava/nio/file/Path;
  #122 = Utf8               getBookForSkill
  #123 = Utf8               (II)I
  #124 = Utf8               I
  #125 = Utf8               level
  #126 = Utf8               StackMapTable
  #127 = Utf8               getInstance
  #128 = Utf8               ()Lext/mods/gameserver/data/xml/SpellbookData;
  #129 = Utf8               lambda$parseDocument$0
  #130 = Utf8               (Lorg/w3c/dom/Node;)V
  #131 = Utf8               listNode
  #132 = Utf8               Lorg/w3c/dom/Node;
  #133 = Utf8               lambda$parseDocument$1
  #134 = Utf8               bookNode
  #135 = Utf8               attrs
  #136 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #137 = Utf8               SourceFile
  #138 = Utf8               SpellbookData.java
  #139 = Utf8               NestMembers
  #140 = Utf8               BootstrapMethods
  #141 = MethodType         #142          //  (Ljava/lang/Object;)V
  #142 = Utf8               (Ljava/lang/Object;)V
  #143 = MethodHandle       5:#144        // REF_invokeVirtual ext/mods/gameserver/data/xml/SpellbookData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #144 = Methodref          #11.#145      // ext/mods/gameserver/data/xml/SpellbookData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #145 = NameAndType        #129:#130     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #146 = MethodType         #130          //  (Lorg/w3c/dom/Node;)V
  #147 = MethodHandle       5:#148        // REF_invokeVirtual ext/mods/gameserver/data/xml/SpellbookData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #148 = Methodref          #11.#149      // ext/mods/gameserver/data/xml/SpellbookData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #149 = NameAndType        #133:#130     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #150 = MethodHandle       6:#151        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #151 = Methodref          #152.#153     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #152 = Class              #154          // java/lang/invoke/LambdaMetafactory
  #153 = NameAndType        #155:#156     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #154 = Utf8               java/lang/invoke/LambdaMetafactory
  #155 = Utf8               metafactory
  #156 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #157 = Utf8               InnerClasses
  #158 = Utf8               SingletonHolder
  #159 = Class              #160          // java/lang/invoke/MethodHandles$Lookup
  #160 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #161 = Class              #162          // java/lang/invoke/MethodHandles
  #162 = Utf8               java/lang/invoke/MethodHandles
  #163 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.SpellbookData();
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
        12: putfield      #10                 // Field _books:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 41: 0
        line 38: 4
        line 42: 15
        line 43: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/SpellbookData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/spellbooks.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} spellbooks.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _books:Ljava/util/Map;
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
            0      34     0  this   Lext/mods/gameserver/data/xml/SpellbookData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/SpellbookData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 55: 0
        line 60: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/SpellbookData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public int getBookForSkill(int, int);
    descriptor: (II)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: iload_1
         1: sipush        1405
         4: if_icmpne     66
         7: getstatic     #61                 // Field ext/mods/Config.DIVINE_SP_BOOK_NEEDED:Z
        10: ifne          15
        13: iconst_0
        14: ireturn
        15: iload_2
        16: tableswitch   { // 1 to 4

                       1: 48

                       2: 52

                       3: 56

                       4: 60
                 default: 64
            }
        48: sipush        8618
        51: ireturn
        52: sipush        8619
        55: ireturn
        56: sipush        8620
        59: ireturn
        60: sipush        8621
        63: ireturn
        64: iconst_0
        65: ireturn
        66: iload_2
        67: iconst_1
        68: if_icmpeq     73
        71: iconst_0
        72: ireturn
        73: getstatic     #67                 // Field ext/mods/Config.SP_BOOK_NEEDED:Z
        76: ifne          81
        79: iconst_0
        80: ireturn
        81: aload_0
        82: getfield      #10                 // Field _books:Ljava/util/Map;
        85: iload_1
        86: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        89: invokeinterface #70,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        94: ifne          99
        97: iconst_0
        98: ireturn
        99: aload_0
       100: getfield      #10                 // Field _books:Ljava/util/Map;
       103: iload_1
       104: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       107: invokeinterface #74,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       112: checkcast     #38                 // class java/lang/Integer
       115: invokevirtual #78                 // Method java/lang/Integer.intValue:()I
       118: ireturn
      LineNumberTable:
        line 64: 0
        line 66: 7
        line 67: 13
        line 69: 15
        line 72: 48
        line 74: 52
        line 76: 56
        line 78: 60
        line 80: 64
        line 84: 66
        line 85: 71
        line 87: 73
        line 88: 79
        line 90: 81
        line 91: 97
        line 93: 99
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     119     0  this   Lext/mods/gameserver/data/xml/SpellbookData;
            0     119     1 skillId   I
            0     119     2 level   I
      StackMapTable: number_of_entries = 10
        frame_type = 15 /* same */
        frame_type = 32 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 1 /* same */
        frame_type = 6 /* same */
        frame_type = 7 /* same */
        frame_type = 17 /* same */

  public static ext.mods.gameserver.data.xml.SpellbookData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/SpellbookData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #81                 // Field ext/mods/gameserver/data/xml/SpellbookData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/SpellbookData;
         3: areturn
      LineNumberTable:
        line 98: 0
}
SourceFile: "SpellbookData.java"
NestMembers:
  ext/mods/gameserver/data/xml/SpellbookData$SingletonHolder
BootstrapMethods:
  0: #150 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #141 (Ljava/lang/Object;)V
      #143 REF_invokeVirtual ext/mods/gameserver/data/xml/SpellbookData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #146 (Lorg/w3c/dom/Node;)V
  1: #150 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #141 (Ljava/lang/Object;)V
      #147 REF_invokeVirtual ext/mods/gameserver/data/xml/SpellbookData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #146 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #163= #159 of #161; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
