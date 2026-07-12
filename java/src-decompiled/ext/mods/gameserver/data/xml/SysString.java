// Bytecode for: ext.mods.gameserver.data.xml.SysString
// File: ext\mods\gameserver\data\xml\SysString.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/SysString.class
  Last modified 9 de jul de 2026; size 5111 bytes
  MD5 checksum 500e4abc9494e34c2bd373b0620e2fe9
  Compiled from "SysString.java"
public final class ext.mods.gameserver.data.xml.SysString extends ext.mods.gameserver.data.AbstractLocaleData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/SysString
  super_class: #2                         // ext/mods/gameserver/data/AbstractLocaleData
  interfaces: 1, fields: 2, methods: 8, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/data/AbstractLocaleData."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/data/AbstractLocaleData
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/data/AbstractLocaleData
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/SysString._data:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/SysString
   #12 = NameAndType        #14:#15       // _data:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/SysString
   #14 = Utf8               _data
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/data/xml/SysString.LOGGER:Lext/mods/commons/logging/CLogger;
   #17 = NameAndType        #18:#19       // LOGGER:Lext/mods/commons/logging/CLogger;
   #18 = Utf8               LOGGER
   #19 = Utf8               Lext/mods/commons/logging/CLogger;
   #20 = String             #21           // SysString has been cleared ({} entries).
   #21 = Utf8               SysString has been cleared ({} entries).
   #22 = Class              #23           // java/lang/Object
   #23 = Utf8               java/lang/Object
   #24 = InterfaceMethodref #25.#26       // java/util/Map.size:()I
   #25 = Class              #27           // java/util/Map
   #26 = NameAndType        #28:#29       // size:()I
   #27 = Utf8               java/util/Map
   #28 = Utf8               size
   #29 = Utf8               ()I
   #30 = Methodref          #31.#32       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #31 = Class              #33           // java/lang/Integer
   #32 = NameAndType        #34:#35       // valueOf:(I)Ljava/lang/Integer;
   #33 = Utf8               java/lang/Integer
   #34 = Utf8               valueOf
   #35 = Utf8               (I)Ljava/lang/Integer;
   #36 = Methodref          #37.#38       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #37 = Class              #39           // ext/mods/commons/logging/CLogger
   #38 = NameAndType        #40:#41       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #39 = Utf8               ext/mods/commons/logging/CLogger
   #40 = Utf8               info
   #41 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #42 = Fieldref           #43.#44       // ext/mods/Config.LOCALES:Ljava/util/Set;
   #43 = Class              #45           // ext/mods/Config
   #44 = NameAndType        #46:#47       // LOCALES:Ljava/util/Set;
   #45 = Utf8               ext/mods/Config
   #46 = Utf8               LOCALES
   #47 = Utf8               Ljava/util/Set;
   #48 = InterfaceMethodref #49.#50       // java/util/Set.iterator:()Ljava/util/Iterator;
   #49 = Class              #51           // java/util/Set
   #50 = NameAndType        #52:#53       // iterator:()Ljava/util/Iterator;
   #51 = Utf8               java/util/Set
   #52 = Utf8               iterator
   #53 = Utf8               ()Ljava/util/Iterator;
   #54 = InterfaceMethodref #55.#56       // java/util/Iterator.hasNext:()Z
   #55 = Class              #57           // java/util/Iterator
   #56 = NameAndType        #58:#59       // hasNext:()Z
   #57 = Utf8               java/util/Iterator
   #58 = Utf8               hasNext
   #59 = Utf8               ()Z
   #60 = InterfaceMethodref #55.#61       // java/util/Iterator.next:()Ljava/lang/Object;
   #61 = NameAndType        #62:#63       // next:()Ljava/lang/Object;
   #62 = Utf8               next
   #63 = Utf8               ()Ljava/lang/Object;
   #64 = Class              #65           // java/util/Locale
   #65 = Utf8               java/util/Locale
   #66 = InterfaceMethodref #25.#67       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #67 = NameAndType        #68:#69       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #68 = Utf8               get
   #69 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #70 = InterfaceMethodref #25.#71       // java/util/Map.clear:()V
   #71 = NameAndType        #72:#6        // clear:()V
   #72 = Utf8               clear
   #73 = Methodref          #11.#74       // ext/mods/gameserver/data/xml/SysString.load:()V
   #74 = NameAndType        #75:#6        // load:()V
   #75 = Utf8               load
   #76 = Fieldref           #11.#77       // ext/mods/gameserver/data/xml/SysString._activeLocale:Ljava/util/Locale;
   #77 = NameAndType        #78:#79       // _activeLocale:Ljava/util/Locale;
   #78 = Utf8               _activeLocale
   #79 = Utf8               Ljava/util/Locale;
   #80 = Class              #81           // java/util/concurrent/ConcurrentHashMap
   #81 = Utf8               java/util/concurrent/ConcurrentHashMap
   #82 = Methodref          #80.#3        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #83 = InterfaceMethodref #25.#84       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #84 = NameAndType        #85:#86       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #85 = Utf8               put
   #86 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #87 = String             #88           // sysstring.xml
   #88 = Utf8               sysstring.xml
   #89 = Methodref          #11.#90       // ext/mods/gameserver/data/xml/SysString.resolve:(Ljava/util/Locale;Ljava/lang/String;)Ljava/nio/file/Path;
   #90 = NameAndType        #91:#92       // resolve:(Ljava/util/Locale;Ljava/lang/String;)Ljava/nio/file/Path;
   #91 = Utf8               resolve
   #92 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/nio/file/Path;
   #93 = InterfaceMethodref #94.#95       // java/nio/file/Path.toString:()Ljava/lang/String;
   #94 = Class              #96           // java/nio/file/Path
   #95 = NameAndType        #97:#98       // toString:()Ljava/lang/String;
   #96 = Utf8               java/nio/file/Path
   #97 = Utf8               toString
   #98 = Utf8               ()Ljava/lang/String;
   #99 = Methodref          #11.#100      // ext/mods/gameserver/data/xml/SysString.parseFile:(Ljava/lang/String;)V
  #100 = NameAndType        #101:#102     // parseFile:(Ljava/lang/String;)V
  #101 = Utf8               parseFile
  #102 = Utf8               (Ljava/lang/String;)V
  #103 = String             #104          // SysString.parseDocument: _activeLocale is null, skipping parse.
  #104 = Utf8               SysString.parseDocument: _activeLocale is null, skipping parse.
  #105 = Methodref          #37.#106      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #106 = NameAndType        #107:#108     // warn:(Ljava/lang/Object;)V
  #107 = Utf8               warn
  #108 = Utf8               (Ljava/lang/Object;)V
  #109 = Methodref          #110.#111     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #110 = Class              #112          // java/lang/String
  #111 = NameAndType        #34:#113      // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #112 = Utf8               java/lang/String
  #113 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #114 = InvokeDynamic      #0:#115       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #115 = NameAndType        #116:#117     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #116 = Utf8               makeConcatWithConstants
  #117 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #118 = String             #119          // list
  #119 = Utf8               list
  #120 = InvokeDynamic      #1:#121       // #1:accept:(Lext/mods/gameserver/data/xml/SysString;Ljava/util/Map;)Ljava/util/function/Consumer;
  #121 = NameAndType        #122:#123     // accept:(Lext/mods/gameserver/data/xml/SysString;Ljava/util/Map;)Ljava/util/function/Consumer;
  #122 = Utf8               accept
  #123 = Utf8               (Lext/mods/gameserver/data/xml/SysString;Ljava/util/Map;)Ljava/util/function/Consumer;
  #124 = Methodref          #11.#125      // ext/mods/gameserver/data/xml/SysString.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #125 = NameAndType        #126:#127     // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #126 = Utf8               forEach
  #127 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #128 = Fieldref           #43.#129      // ext/mods/Config.DEFAULT_LOCALE:Ljava/util/Locale;
  #129 = NameAndType        #130:#79      // DEFAULT_LOCALE:Ljava/util/Locale;
  #130 = Utf8               DEFAULT_LOCALE
  #131 = InvokeDynamic      #2:#115       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #132 = InvokeDynamic      #3:#115       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #133 = Fieldref           #134.#135     // ext/mods/gameserver/data/xml/SysString$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/SysString;
  #134 = Class              #136          // ext/mods/gameserver/data/xml/SysString$SingletonHolder
  #135 = NameAndType        #137:#138     // INSTANCE:Lext/mods/gameserver/data/xml/SysString;
  #136 = Utf8               ext/mods/gameserver/data/xml/SysString$SingletonHolder
  #137 = Utf8               INSTANCE
  #138 = Utf8               Lext/mods/gameserver/data/xml/SysString;
  #139 = String             #140          // string
  #140 = Utf8               string
  #141 = InvokeDynamic      #4:#121       // #4:accept:(Lext/mods/gameserver/data/xml/SysString;Ljava/util/Map;)Ljava/util/function/Consumer;
  #142 = InterfaceMethodref #143.#144     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #143 = Class              #145          // org/w3c/dom/Node
  #144 = NameAndType        #146:#147     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #145 = Utf8               org/w3c/dom/Node
  #146 = Utf8               getAttributes
  #147 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #148 = String             #149          // key
  #149 = Utf8               key
  #150 = Methodref          #11.#151      // ext/mods/gameserver/data/xml/SysString.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #151 = NameAndType        #152:#153     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #152 = Utf8               parseString
  #153 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #154 = InterfaceMethodref #143.#155     // org/w3c/dom/Node.getTextContent:()Ljava/lang/String;
  #155 = NameAndType        #156:#98      // getTextContent:()Ljava/lang/String;
  #156 = Utf8               getTextContent
  #157 = Class              #158          // ext/mods/commons/data/xml/IXmlReader
  #158 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #159 = Utf8               Signature
  #160 = Utf8               Ljava/util/Map<Ljava/util/Locale;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;>;
  #161 = Utf8               Code
  #162 = Utf8               LineNumberTable
  #163 = Utf8               LocalVariableTable
  #164 = Utf8               this
  #165 = Utf8               reload
  #166 = Utf8               localeMap
  #167 = Utf8               locale
  #168 = Utf8               LocalVariableTypeTable
  #169 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #170 = Utf8               StackMapTable
  #171 = Utf8               parseDocument
  #172 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #173 = Utf8               doc
  #174 = Utf8               Lorg/w3c/dom/Document;
  #175 = Utf8               path
  #176 = Utf8               Ljava/nio/file/Path;
  #177 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #178 = Utf8               defaultMap
  #179 = Utf8               Ljava/lang/String;
  #180 = Utf8               result
  #181 = Utf8               getInstance
  #182 = Utf8               ()Lext/mods/gameserver/data/xml/SysString;
  #183 = Utf8               lambda$parseDocument$0
  #184 = Utf8               (Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #185 = Utf8               root
  #186 = Utf8               Lorg/w3c/dom/Node;
  #187 = Utf8               lambda$parseDocument$1
  #188 = Utf8               node
  #189 = Utf8               SourceFile
  #190 = Utf8               SysString.java
  #191 = Utf8               NestMembers
  #192 = Utf8               BootstrapMethods
  #193 = String             #194          // SysString.parseDocument: locale map not found for locale: \u0001
  #194 = Utf8               SysString.parseDocument: locale map not found for locale: \u0001
  #195 = MethodType         #108          //  (Ljava/lang/Object;)V
  #196 = MethodHandle       5:#197        // REF_invokeVirtual ext/mods/gameserver/data/xml/SysString.lambda$parseDocument$0:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #197 = Methodref          #11.#198      // ext/mods/gameserver/data/xml/SysString.lambda$parseDocument$0:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #198 = NameAndType        #183:#184     // lambda$parseDocument$0:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #199 = MethodType         #200          //  (Lorg/w3c/dom/Node;)V
  #200 = Utf8               (Lorg/w3c/dom/Node;)V
  #201 = String             #202          // missing sysstring: \u0001 (locale not loaded)
  #202 = Utf8               missing sysstring: \u0001 (locale not loaded)
  #203 = String             #204          // missing sysstring: \u0001
  #204 = Utf8               missing sysstring: \u0001
  #205 = MethodHandle       5:#206        // REF_invokeVirtual ext/mods/gameserver/data/xml/SysString.lambda$parseDocument$1:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #206 = Methodref          #11.#207      // ext/mods/gameserver/data/xml/SysString.lambda$parseDocument$1:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #207 = NameAndType        #187:#184     // lambda$parseDocument$1:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #208 = MethodHandle       6:#209        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #209 = Methodref          #210.#211     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #210 = Class              #212          // java/lang/invoke/StringConcatFactory
  #211 = NameAndType        #116:#213     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #212 = Utf8               java/lang/invoke/StringConcatFactory
  #213 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #214 = MethodHandle       6:#215        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #215 = Methodref          #216.#217     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #216 = Class              #218          // java/lang/invoke/LambdaMetafactory
  #217 = NameAndType        #219:#220     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #218 = Utf8               java/lang/invoke/LambdaMetafactory
  #219 = Utf8               metafactory
  #220 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #221 = Utf8               InnerClasses
  #222 = Utf8               SingletonHolder
  #223 = Class              #224          // java/lang/invoke/MethodHandles$Lookup
  #224 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #225 = Class              #226          // java/lang/invoke/MethodHandles
  #226 = Utf8               java/lang/invoke/MethodHandles
  #227 = Utf8               Lookup
{
  public ext.mods.gameserver.data.xml.SysString();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/data/AbstractLocaleData."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _data:Ljava/util/Map;
        15: return
      LineNumberTable:
        line 33: 0
        line 35: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/data/xml/SysString;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=1
         0: getstatic     #16                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: ldc           #20                 // String SysString has been cleared ({} entries).
         5: iconst_1
         6: anewarray     #22                 // class java/lang/Object
         9: dup
        10: iconst_0
        11: aload_0
        12: getfield      #10                 // Field _data:Ljava/util/Map;
        15: invokeinterface #24,  1           // InterfaceMethod java/util/Map.size:()I
        20: invokestatic  #30                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        23: aastore
        24: invokevirtual #36                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        27: getstatic     #42                 // Field ext/mods/Config.LOCALES:Ljava/util/Set;
        30: invokeinterface #48,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        35: astore_1
        36: aload_1
        37: invokeinterface #54,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        42: ifeq          82
        45: aload_1
        46: invokeinterface #60,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        51: checkcast     #64                 // class java/util/Locale
        54: astore_2
        55: aload_0
        56: getfield      #10                 // Field _data:Ljava/util/Map;
        59: aload_2
        60: invokeinterface #66,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        65: checkcast     #25                 // class java/util/Map
        68: astore_3
        69: aload_3
        70: ifnull        79
        73: aload_3
        74: invokeinterface #70,  1           // InterfaceMethod java/util/Map.clear:()V
        79: goto          36
        82: aload_0
        83: invokevirtual #73                 // Method load:()V
        86: return
      LineNumberTable:
        line 41: 0
        line 43: 27
        line 45: 55
        line 46: 69
        line 48: 73
        line 50: 79
        line 51: 82
        line 52: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           69      10     3 localeMap   Ljava/util/Map;
           55      24     2 locale   Ljava/util/Locale;
            0      87     0  this   Lext/mods/gameserver/data/xml/SysString;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           69      10     3 localeMap   Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class java/util/Iterator ]
        frame_type = 42 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: getstatic     #42                 // Field ext/mods/Config.LOCALES:Ljava/util/Set;
         3: invokeinterface #48,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
         8: astore_1
         9: aload_1
        10: invokeinterface #54,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        15: ifeq          72
        18: aload_1
        19: invokeinterface #60,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        24: checkcast     #64                 // class java/util/Locale
        27: astore_2
        28: aload_0
        29: aload_2
        30: putfield      #76                 // Field _activeLocale:Ljava/util/Locale;
        33: aload_0
        34: getfield      #10                 // Field _data:Ljava/util/Map;
        37: aload_2
        38: new           #80                 // class java/util/concurrent/ConcurrentHashMap
        41: dup
        42: invokespecial #82                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        45: invokeinterface #83,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        50: pop
        51: aload_0
        52: aload_0
        53: aload_2
        54: ldc           #87                 // String sysstring.xml
        56: invokevirtual #89                 // Method resolve:(Ljava/util/Locale;Ljava/lang/String;)Ljava/nio/file/Path;
        59: invokeinterface #93,  1           // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
        64: invokevirtual #99                 // Method parseFile:(Ljava/lang/String;)V
        67: aconst_null
        68: astore_2
        69: goto          9
        72: return
      LineNumberTable:
        line 57: 0
        line 59: 28
        line 60: 33
        line 61: 51
        line 62: 67
        line 63: 69
        line 64: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           28      41     2 locale   Ljava/util/Locale;
            0      73     0  this   Lext/mods/gameserver/data/xml/SysString;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 62

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: aload_0
         1: getfield      #76                 // Field _activeLocale:Ljava/util/Locale;
         4: ifnonnull     16
         7: getstatic     #16                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        10: ldc           #103                // String SysString.parseDocument: _activeLocale is null, skipping parse.
        12: invokevirtual #105                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
        15: return
        16: aload_0
        17: getfield      #10                 // Field _data:Ljava/util/Map;
        20: aload_0
        21: getfield      #76                 // Field _activeLocale:Ljava/util/Locale;
        24: invokeinterface #66,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #25                 // class java/util/Map
        32: astore_3
        33: aload_3
        34: ifnonnull     56
        37: getstatic     #16                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        40: aload_0
        41: getfield      #76                 // Field _activeLocale:Ljava/util/Locale;
        44: invokestatic  #109                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        47: invokedynamic #114,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        52: invokevirtual #105                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
        55: return
        56: aload_0
        57: aload_1
        58: ldc           #118                // String list
        60: aload_0
        61: aload_3
        62: invokedynamic #120,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/data/xml/SysString;Ljava/util/Map;)Ljava/util/function/Consumer;
        67: invokevirtual #124                // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        70: return
      LineNumberTable:
        line 69: 0
        line 71: 7
        line 72: 15
        line 75: 16
        line 76: 33
        line 78: 37
        line 79: 55
        line 82: 56
        line 86: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/data/xml/SysString;
            0      71     1   doc   Lorg/w3c/dom/Document;
            0      71     2  path   Ljava/nio/file/Path;
           33      38     3 localeMap   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           33      38     3 localeMap   Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class java/util/Map ]

  public java.lang.String get(java.util.Locale, java.lang.String);
    descriptor: (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=3
         0: aload_1
         1: ifnonnull     8
         4: getstatic     #128                // Field ext/mods/Config.DEFAULT_LOCALE:Ljava/util/Locale;
         7: astore_1
         8: aload_0
         9: getfield      #10                 // Field _data:Ljava/util/Map;
        12: aload_1
        13: invokeinterface #66,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        18: checkcast     #25                 // class java/util/Map
        21: astore_3
        22: aload_3
        23: ifnonnull     55
        26: getstatic     #128                // Field ext/mods/Config.DEFAULT_LOCALE:Ljava/util/Locale;
        29: astore_1
        30: aload_0
        31: getfield      #10                 // Field _data:Ljava/util/Map;
        34: aload_1
        35: invokeinterface #66,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        40: checkcast     #25                 // class java/util/Map
        43: astore_3
        44: aload_3
        45: ifnonnull     55
        48: aload_2
        49: invokedynamic #131,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        54: areturn
        55: aload_3
        56: aload_2
        57: invokeinterface #66,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        62: checkcast     #110                // class java/lang/String
        65: astore        4
        67: aload         4
        69: ifnonnull     126
        72: aload_1
        73: getstatic     #128                // Field ext/mods/Config.DEFAULT_LOCALE:Ljava/util/Locale;
        76: if_acmpeq     114
        79: aload_0
        80: getfield      #10                 // Field _data:Ljava/util/Map;
        83: getstatic     #128                // Field ext/mods/Config.DEFAULT_LOCALE:Ljava/util/Locale;
        86: invokeinterface #66,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        91: checkcast     #25                 // class java/util/Map
        94: astore        5
        96: aload         5
        98: ifnull        114
       101: aload         5
       103: aload_2
       104: invokeinterface #66,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       109: checkcast     #110                // class java/lang/String
       112: astore        4
       114: aload         4
       116: ifnonnull     126
       119: aload_2
       120: invokedynamic #132,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       125: areturn
       126: aload         4
       128: areturn
      LineNumberTable:
        line 91: 0
        line 93: 4
        line 96: 8
        line 97: 22
        line 99: 26
        line 100: 30
        line 101: 44
        line 103: 48
        line 107: 55
        line 108: 67
        line 110: 72
        line 112: 79
        line 113: 96
        line 115: 101
        line 119: 114
        line 120: 119
        line 122: 126
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           96      18     5 defaultMap   Ljava/util/Map;
            0     129     0  this   Lext/mods/gameserver/data/xml/SysString;
            0     129     1 locale   Ljava/util/Locale;
            0     129     2   key   Ljava/lang/String;
           22     107     3 localeMap   Ljava/util/Map;
           67      62     4 result   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           96      18     5 defaultMap   Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
           22     107     3 localeMap   Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
      StackMapTable: number_of_entries = 4
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ class java/util/Map ]
        frame_type = 252 /* append */
          offset_delta = 58
          locals = [ class java/lang/String ]
        frame_type = 11 /* same */

  public static ext.mods.gameserver.data.xml.SysString getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/SysString;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #133                // Field ext/mods/gameserver/data/xml/SysString$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/SysString;
         3: areturn
      LineNumberTable:
        line 127: 0
}
SourceFile: "SysString.java"
NestMembers:
  ext/mods/gameserver/data/xml/SysString$SingletonHolder
BootstrapMethods:
  0: #208 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #193 SysString.parseDocument: locale map not found for locale: \u0001
  1: #214 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #195 (Ljava/lang/Object;)V
      #196 REF_invokeVirtual ext/mods/gameserver/data/xml/SysString.lambda$parseDocument$0:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
      #199 (Lorg/w3c/dom/Node;)V
  2: #208 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #201 missing sysstring: \u0001 (locale not loaded)
  3: #208 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #203 missing sysstring: \u0001
  4: #214 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #195 (Ljava/lang/Object;)V
      #205 REF_invokeVirtual ext/mods/gameserver/data/xml/SysString.lambda$parseDocument$1:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
      #199 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #227= #223 of #225; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
