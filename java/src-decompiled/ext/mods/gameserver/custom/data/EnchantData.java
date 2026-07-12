// Bytecode for: ext.mods.gameserver.custom.data.EnchantData
// File: ext\mods\gameserver\custom\data\EnchantData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/EnchantData.class
  Last modified 9 de jul de 2026; size 4257 bytes
  MD5 checksum 0e9e84f502c5187808b7514e66668270
  Compiled from "EnchantData.java"
public class ext.mods.gameserver.custom.data.EnchantData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/custom/data/EnchantData
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/custom/data/EnchantData._data:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/custom/data/EnchantData
   #12 = NameAndType        #14:#15       // _data:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/custom/data/EnchantData
   #14 = Utf8               _data
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/custom/data/EnchantData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = InterfaceMethodref #20.#21       // java/util/Map.clear:()V
   #20 = Class              #22           // java/util/Map
   #21 = NameAndType        #23:#6        // clear:()V
   #22 = Utf8               java/util/Map
   #23 = Utf8               clear
   #24 = String             #25           // custom/mods/enchants.xml
   #25 = Utf8               custom/mods/enchants.xml
   #26 = Methodref          #11.#27       // ext/mods/gameserver/custom/data/EnchantData.parseDataFile:(Ljava/lang/String;)V
   #27 = NameAndType        #28:#29       // parseDataFile:(Ljava/lang/String;)V
   #28 = Utf8               parseDataFile
   #29 = Utf8               (Ljava/lang/String;)V
   #30 = Fieldref           #11.#31       // ext/mods/gameserver/custom/data/EnchantData.LOGGER:Lext/mods/commons/logging/CLogger;
   #31 = NameAndType        #32:#33       // LOGGER:Lext/mods/commons/logging/CLogger;
   #32 = Utf8               LOGGER
   #33 = Utf8               Lext/mods/commons/logging/CLogger;
   #34 = String             #35           // Loaded {} enchant scroll data.
   #35 = Utf8               Loaded {} enchant scroll data.
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
   #54 = InvokeDynamic      #0:#55        // #0:accept:(Lext/mods/gameserver/custom/data/EnchantData;)Ljava/util/function/Consumer;
   #55 = NameAndType        #56:#57       // accept:(Lext/mods/gameserver/custom/data/EnchantData;)Ljava/util/function/Consumer;
   #56 = Utf8               accept
   #57 = Utf8               (Lext/mods/gameserver/custom/data/EnchantData;)Ljava/util/function/Consumer;
   #58 = Methodref          #11.#59       // ext/mods/gameserver/custom/data/EnchantData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = NameAndType        #60:#61       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #60 = Utf8               forEach
   #61 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #62 = Methodref          #63.#64       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #63 = Class              #65           // ext/mods/gameserver/model/item/instance/ItemInstance
   #64 = NameAndType        #66:#39       // getItemId:()I
   #65 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #66 = Utf8               getItemId
   #67 = InterfaceMethodref #20.#68       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #68 = NameAndType        #69:#70       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #69 = Utf8               get
   #70 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #71 = Class              #72           // ext/mods/gameserver/model/records/custom/EnchantScroll
   #72 = Utf8               ext/mods/gameserver/model/records/custom/EnchantScroll
   #73 = Fieldref           #74.#75       // ext/mods/gameserver/custom/data/EnchantData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/EnchantData;
   #74 = Class              #76           // ext/mods/gameserver/custom/data/EnchantData$SingletonHolder
   #75 = NameAndType        #77:#78       // INSTANCE:Lext/mods/gameserver/custom/data/EnchantData;
   #76 = Utf8               ext/mods/gameserver/custom/data/EnchantData$SingletonHolder
   #77 = Utf8               INSTANCE
   #78 = Utf8               Lext/mods/gameserver/custom/data/EnchantData;
   #79 = String             #80           // scroll
   #80 = Utf8               scroll
   #81 = InvokeDynamic      #1:#55        // #1:accept:(Lext/mods/gameserver/custom/data/EnchantData;)Ljava/util/function/Consumer;
   #82 = Methodref          #11.#83       // ext/mods/gameserver/custom/data/EnchantData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #83 = NameAndType        #84:#85       // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #84 = Utf8               parseAttributes
   #85 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #86 = String             #87           // settings
   #87 = Utf8               settings
   #88 = InvokeDynamic      #2:#89        // #2:accept:(Lext/mods/gameserver/custom/data/EnchantData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
   #89 = NameAndType        #56:#90       // accept:(Lext/mods/gameserver/custom/data/EnchantData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
   #90 = Utf8               (Lext/mods/gameserver/custom/data/EnchantData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
   #91 = String             #92           // chances
   #92 = Utf8               chances
   #93 = InvokeDynamic      #3:#89        // #3:accept:(Lext/mods/gameserver/custom/data/EnchantData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
   #94 = String             #95           // announce
   #95 = Utf8               announce
   #96 = InvokeDynamic      #4:#89        // #4:accept:(Lext/mods/gameserver/custom/data/EnchantData;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
   #97 = String             #98           // id
   #98 = Utf8               id
   #99 = Methodref          #100.#101     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #100 = Class              #102          // ext/mods/commons/data/StatSet
  #101 = NameAndType        #103:#104     // getInteger:(Ljava/lang/String;)I
  #102 = Utf8               ext/mods/commons/data/StatSet
  #103 = Utf8               getInteger
  #104 = Utf8               (Ljava/lang/String;)I
  #105 = Methodref          #71.#106      // ext/mods/gameserver/model/records/custom/EnchantScroll."<init>":(Lext/mods/commons/data/StatSet;)V
  #106 = NameAndType        #5:#107       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #107 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #108 = InterfaceMethodref #20.#109      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #109 = NameAndType        #110:#111     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #110 = Utf8               put
  #111 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #112 = Methodref          #100.#113     // ext/mods/commons/data/StatSet.putAll:(Ljava/util/Map;)V
  #113 = NameAndType        #114:#115     // putAll:(Ljava/util/Map;)V
  #114 = Utf8               putAll
  #115 = Utf8               (Ljava/util/Map;)V
  #116 = Class              #117          // ext/mods/commons/data/xml/IXmlReader
  #117 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #118 = Utf8               Signature
  #119 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/records/custom/EnchantScroll;>;
  #120 = Utf8               Code
  #121 = Utf8               LineNumberTable
  #122 = Utf8               LocalVariableTable
  #123 = Utf8               this
  #124 = Utf8               reload
  #125 = Utf8               parseDocument
  #126 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #127 = Utf8               doc
  #128 = Utf8               Lorg/w3c/dom/Document;
  #129 = Utf8               path
  #130 = Utf8               Ljava/nio/file/Path;
  #131 = Utf8               getEnchantScroll
  #132 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/records/custom/EnchantScroll;
  #133 = Utf8               item
  #134 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #135 = Utf8               getInstance
  #136 = Utf8               ()Lext/mods/gameserver/custom/data/EnchantData;
  #137 = Utf8               lambda$parseDocument$0
  #138 = Utf8               (Lorg/w3c/dom/Node;)V
  #139 = Utf8               listNode
  #140 = Utf8               Lorg/w3c/dom/Node;
  #141 = Utf8               lambda$parseDocument$1
  #142 = Utf8               scrollNode
  #143 = Utf8               set
  #144 = Utf8               Lext/mods/commons/data/StatSet;
  #145 = Utf8               lambda$parseDocument$4
  #146 = Utf8               (Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #147 = Utf8               announceNode
  #148 = Utf8               lambda$parseDocument$3
  #149 = Utf8               chancesNode
  #150 = Utf8               lambda$parseDocument$2
  #151 = Utf8               settingsNode
  #152 = Utf8               SourceFile
  #153 = Utf8               EnchantData.java
  #154 = Utf8               NestMembers
  #155 = Utf8               BootstrapMethods
  #156 = MethodType         #157          //  (Ljava/lang/Object;)V
  #157 = Utf8               (Ljava/lang/Object;)V
  #158 = MethodHandle       5:#159        // REF_invokeVirtual ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #159 = Methodref          #11.#160      // ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #160 = NameAndType        #137:#138     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #161 = MethodType         #138          //  (Lorg/w3c/dom/Node;)V
  #162 = MethodHandle       5:#163        // REF_invokeVirtual ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #163 = Methodref          #11.#164      // ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #164 = NameAndType        #141:#138     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #165 = MethodHandle       5:#166        // REF_invokeVirtual ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #166 = Methodref          #11.#167      // ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #167 = NameAndType        #150:#146     // lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #168 = MethodHandle       5:#169        // REF_invokeVirtual ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #169 = Methodref          #11.#170      // ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #170 = NameAndType        #148:#146     // lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #171 = MethodHandle       5:#172        // REF_invokeVirtual ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$4:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #172 = Methodref          #11.#173      // ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$4:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #173 = NameAndType        #145:#146     // lambda$parseDocument$4:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #174 = MethodHandle       6:#175        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #175 = Methodref          #176.#177     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #176 = Class              #178          // java/lang/invoke/LambdaMetafactory
  #177 = NameAndType        #179:#180     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #178 = Utf8               java/lang/invoke/LambdaMetafactory
  #179 = Utf8               metafactory
  #180 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #181 = Utf8               InnerClasses
  #182 = Utf8               SingletonHolder
  #183 = Class              #184          // java/lang/invoke/MethodHandles$Lookup
  #184 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #185 = Class              #186          // java/lang/invoke/MethodHandles
  #186 = Utf8               java/lang/invoke/MethodHandles
  #187 = Utf8               Lookup
{
  public ext.mods.gameserver.custom.data.EnchantData();
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
        12: putfield      #10                 // Field _data:Ljava/util/Map;
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
            0      20     0  this   Lext/mods/gameserver/custom/data/EnchantData;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _data:Ljava/util/Map;
         4: invokeinterface #19,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 43: 0
        line 44: 9
        line 45: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/EnchantData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #24                 // String custom/mods/enchants.xml
         3: invokevirtual #26                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #30                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #34                 // String Loaded {} enchant scroll data.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _data:Ljava/util/Map;
        21: invokeinterface #36,  1           // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #46                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 50: 0
        line 51: 6
        line 52: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/custom/data/EnchantData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #52                 // String list
         4: aload_0
         5: invokedynamic #54,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/custom/data/EnchantData;)Ljava/util/function/Consumer;
        10: invokevirtual #58                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 57: 0
        line 65: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/EnchantData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.gameserver.model.records.custom.EnchantScroll getEnchantScroll(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/records/custom/EnchantScroll;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _data:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #62                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
         8: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #67,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #71                 // class ext/mods/gameserver/model/records/custom/EnchantScroll
        19: areturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/custom/data/EnchantData;
            0      20     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public static ext.mods.gameserver.custom.data.EnchantData getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/EnchantData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #73                 // Field ext/mods/gameserver/custom/data/EnchantData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/EnchantData;
         3: areturn
      LineNumberTable:
        line 74: 0
}
SourceFile: "EnchantData.java"
NestMembers:
  ext/mods/gameserver/custom/data/EnchantData$SingletonHolder
BootstrapMethods:
  0: #174 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #156 (Ljava/lang/Object;)V
      #158 REF_invokeVirtual ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #161 (Lorg/w3c/dom/Node;)V
  1: #174 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #156 (Ljava/lang/Object;)V
      #162 REF_invokeVirtual ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #161 (Lorg/w3c/dom/Node;)V
  2: #174 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #156 (Ljava/lang/Object;)V
      #165 REF_invokeVirtual ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #161 (Lorg/w3c/dom/Node;)V
  3: #174 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #156 (Ljava/lang/Object;)V
      #168 REF_invokeVirtual ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #161 (Lorg/w3c/dom/Node;)V
  4: #174 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #156 (Ljava/lang/Object;)V
      #171 REF_invokeVirtual ext/mods/gameserver/custom/data/EnchantData.lambda$parseDocument$4:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #161 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #187= #183 of #185; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
