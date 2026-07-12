// Bytecode for: ext.mods.gameserver.custom.data.AuctionCurrencies
// File: ext\mods\gameserver\custom\data\AuctionCurrencies.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/AuctionCurrencies.class
  Last modified 9 de jul de 2026; size 4411 bytes
  MD5 checksum 90bb9f775dcc7266db92fc94b5f7fbd6
  Compiled from "AuctionCurrencies.java"
public class ext.mods.gameserver.custom.data.AuctionCurrencies implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/custom/data/AuctionCurrencies
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/custom/data/AuctionCurrencies._currencyMap:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/custom/data/AuctionCurrencies
   #12 = NameAndType        #14:#15       // _currencyMap:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/custom/data/AuctionCurrencies
   #14 = Utf8               _currencyMap
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/custom/data/AuctionCurrencies.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = InterfaceMethodref #20.#21       // java/util/Map.clear:()V
   #20 = Class              #22           // java/util/Map
   #21 = NameAndType        #23:#6        // clear:()V
   #22 = Utf8               java/util/Map
   #23 = Utf8               clear
   #24 = String             #25           // custom/mods/auctionCurrencies.xml
   #25 = Utf8               custom/mods/auctionCurrencies.xml
   #26 = Methodref          #11.#27       // ext/mods/gameserver/custom/data/AuctionCurrencies.parseDataFile:(Ljava/lang/String;)V
   #27 = NameAndType        #28:#29       // parseDataFile:(Ljava/lang/String;)V
   #28 = Utf8               parseDataFile
   #29 = Utf8               (Ljava/lang/String;)V
   #30 = String             #31           // list
   #31 = Utf8               list
   #32 = InvokeDynamic      #0:#33        // #0:accept:(Lext/mods/gameserver/custom/data/AuctionCurrencies;)Ljava/util/function/Consumer;
   #33 = NameAndType        #34:#35       // accept:(Lext/mods/gameserver/custom/data/AuctionCurrencies;)Ljava/util/function/Consumer;
   #34 = Utf8               accept
   #35 = Utf8               (Lext/mods/gameserver/custom/data/AuctionCurrencies;)Ljava/util/function/Consumer;
   #36 = Methodref          #11.#37       // ext/mods/gameserver/custom/data/AuctionCurrencies.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #37 = NameAndType        #38:#39       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #38 = Utf8               forEach
   #39 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #40 = Methodref          #41.#42       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #41 = Class              #43           // java/lang/Integer
   #42 = NameAndType        #44:#45       // valueOf:(I)Ljava/lang/Integer;
   #43 = Utf8               java/lang/Integer
   #44 = Utf8               valueOf
   #45 = Utf8               (I)Ljava/lang/Integer;
   #46 = InterfaceMethodref #20.#47       // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #47 = NameAndType        #48:#49       // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #48 = Utf8               getOrDefault
   #49 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #50 = Methodref          #41.#51       // java/lang/Integer.intValue:()I
   #51 = NameAndType        #52:#53       // intValue:()I
   #52 = Utf8               intValue
   #53 = Utf8               ()I
   #54 = InterfaceMethodref #20.#55       // java/util/Map.entrySet:()Ljava/util/Set;
   #55 = NameAndType        #56:#57       // entrySet:()Ljava/util/Set;
   #56 = Utf8               entrySet
   #57 = Utf8               ()Ljava/util/Set;
   #58 = InterfaceMethodref #59.#60       // java/util/Set.stream:()Ljava/util/stream/Stream;
   #59 = Class              #61           // java/util/Set
   #60 = NameAndType        #62:#63       // stream:()Ljava/util/stream/Stream;
   #61 = Utf8               java/util/Set
   #62 = Utf8               stream
   #63 = Utf8               ()Ljava/util/stream/Stream;
   #64 = InvokeDynamic      #1:#65        // #1:test:(I)Ljava/util/function/Predicate;
   #65 = NameAndType        #66:#67       // test:(I)Ljava/util/function/Predicate;
   #66 = Utf8               test
   #67 = Utf8               (I)Ljava/util/function/Predicate;
   #68 = InterfaceMethodref #69.#70       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #69 = Class              #71           // java/util/stream/Stream
   #70 = NameAndType        #72:#73       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #71 = Utf8               java/util/stream/Stream
   #72 = Utf8               filter
   #73 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #74 = InvokeDynamic      #2:#75        // #2:apply:()Ljava/util/function/Function;
   #75 = NameAndType        #76:#77       // apply:()Ljava/util/function/Function;
   #76 = Utf8               apply
   #77 = Utf8               ()Ljava/util/function/Function;
   #78 = InterfaceMethodref #69.#79       // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #79 = NameAndType        #80:#81       // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #80 = Utf8               map
   #81 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #82 = InterfaceMethodref #69.#83       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #83 = NameAndType        #84:#85       // findFirst:()Ljava/util/Optional;
   #84 = Utf8               findFirst
   #85 = Utf8               ()Ljava/util/Optional;
   #86 = String             #87           // Unknown Currency
   #87 = Utf8               Unknown Currency
   #88 = Methodref          #89.#90       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #89 = Class              #91           // java/util/Optional
   #90 = NameAndType        #92:#93       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #91 = Utf8               java/util/Optional
   #92 = Utf8               orElse
   #93 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #94 = Class              #95           // java/lang/String
   #95 = Utf8               java/lang/String
   #96 = InterfaceMethodref #20.#97       // java/util/Map.keySet:()Ljava/util/Set;
   #97 = NameAndType        #98:#57       // keySet:()Ljava/util/Set;
   #98 = Utf8               keySet
   #99 = Fieldref           #100.#101     // ext/mods/gameserver/custom/data/AuctionCurrencies$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/AuctionCurrencies;
  #100 = Class              #102          // ext/mods/gameserver/custom/data/AuctionCurrencies$SingletonHolder
  #101 = NameAndType        #103:#104     // INSTANCE:Lext/mods/gameserver/custom/data/AuctionCurrencies;
  #102 = Utf8               ext/mods/gameserver/custom/data/AuctionCurrencies$SingletonHolder
  #103 = Utf8               INSTANCE
  #104 = Utf8               Lext/mods/gameserver/custom/data/AuctionCurrencies;
  #105 = InterfaceMethodref #106.#107     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #106 = Class              #108          // java/util/Map$Entry
  #107 = NameAndType        #109:#110     // getValue:()Ljava/lang/Object;
  #108 = Utf8               java/util/Map$Entry
  #109 = Utf8               getValue
  #110 = Utf8               ()Ljava/lang/Object;
  #111 = Methodref          #41.#112      // java/lang/Integer.equals:(Ljava/lang/Object;)Z
  #112 = NameAndType        #113:#114     // equals:(Ljava/lang/Object;)Z
  #113 = Utf8               equals
  #114 = Utf8               (Ljava/lang/Object;)Z
  #115 = String             #116          // currency
  #116 = Utf8               currency
  #117 = InvokeDynamic      #3:#33        // #3:accept:(Lext/mods/gameserver/custom/data/AuctionCurrencies;)Ljava/util/function/Consumer;
  #118 = InterfaceMethodref #119.#120     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #119 = Class              #121          // org/w3c/dom/Node
  #120 = NameAndType        #122:#123     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #121 = Utf8               org/w3c/dom/Node
  #122 = Utf8               getAttributes
  #123 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #124 = String             #125          // name
  #125 = Utf8               name
  #126 = Methodref          #11.#127      // ext/mods/gameserver/custom/data/AuctionCurrencies.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #127 = NameAndType        #128:#129     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #128 = Utf8               parseString
  #129 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #130 = String             #131          // id
  #131 = Utf8               id
  #132 = Methodref          #11.#133      // ext/mods/gameserver/custom/data/AuctionCurrencies.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #133 = NameAndType        #134:#135     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #134 = Utf8               parseInteger
  #135 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #136 = InterfaceMethodref #20.#137      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #137 = NameAndType        #138:#49      // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #138 = Utf8               put
  #139 = Class              #140          // ext/mods/commons/data/xml/IXmlReader
  #140 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #141 = Utf8               Signature
  #142 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;
  #143 = Utf8               Code
  #144 = Utf8               LineNumberTable
  #145 = Utf8               LocalVariableTable
  #146 = Utf8               this
  #147 = Utf8               reload
  #148 = Utf8               parseDocument
  #149 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #150 = Utf8               doc
  #151 = Utf8               Lorg/w3c/dom/Document;
  #152 = Utf8               path
  #153 = Utf8               Ljava/nio/file/Path;
  #154 = Utf8               getCurrencyId
  #155 = Utf8               (Ljava/lang/String;)I
  #156 = Utf8               Ljava/lang/String;
  #157 = Utf8               getCurrencyName
  #158 = Utf8               (I)Ljava/lang/String;
  #159 = Utf8               currencyId
  #160 = Utf8               I
  #161 = Utf8               getCurrencyNames
  #162 = Utf8               ()Ljava/util/Set<Ljava/lang/String;>;
  #163 = Utf8               getInstance
  #164 = Utf8               ()Lext/mods/gameserver/custom/data/AuctionCurrencies;
  #165 = Utf8               lambda$getCurrencyName$0
  #166 = Utf8               (ILjava/util/Map$Entry;)Z
  #167 = Utf8               entry
  #168 = Utf8               Ljava/util/Map$Entry;
  #169 = Utf8               lambda$parseDocument$0
  #170 = Utf8               (Lorg/w3c/dom/Node;)V
  #171 = Utf8               listNode
  #172 = Utf8               Lorg/w3c/dom/Node;
  #173 = Utf8               lambda$parseDocument$1
  #174 = Utf8               itemsNode
  #175 = Utf8               attrs
  #176 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #177 = Utf8               SourceFile
  #178 = Utf8               AuctionCurrencies.java
  #179 = Utf8               NestMembers
  #180 = Utf8               BootstrapMethods
  #181 = MethodType         #182          //  (Ljava/lang/Object;)V
  #182 = Utf8               (Ljava/lang/Object;)V
  #183 = MethodHandle       5:#184        // REF_invokeVirtual ext/mods/gameserver/custom/data/AuctionCurrencies.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #184 = Methodref          #11.#185      // ext/mods/gameserver/custom/data/AuctionCurrencies.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #185 = NameAndType        #169:#170     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #186 = MethodType         #170          //  (Lorg/w3c/dom/Node;)V
  #187 = MethodType         #114          //  (Ljava/lang/Object;)Z
  #188 = MethodHandle       6:#189        // REF_invokeStatic ext/mods/gameserver/custom/data/AuctionCurrencies.lambda$getCurrencyName$0:(ILjava/util/Map$Entry;)Z
  #189 = Methodref          #11.#190      // ext/mods/gameserver/custom/data/AuctionCurrencies.lambda$getCurrencyName$0:(ILjava/util/Map$Entry;)Z
  #190 = NameAndType        #165:#166     // lambda$getCurrencyName$0:(ILjava/util/Map$Entry;)Z
  #191 = MethodType         #192          //  (Ljava/util/Map$Entry;)Z
  #192 = Utf8               (Ljava/util/Map$Entry;)Z
  #193 = MethodType         #93           //  (Ljava/lang/Object;)Ljava/lang/Object;
  #194 = MethodHandle       9:#195        // REF_invokeInterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #195 = InterfaceMethodref #106.#196     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #196 = NameAndType        #197:#110     // getKey:()Ljava/lang/Object;
  #197 = Utf8               getKey
  #198 = MethodType         #199          //  (Ljava/util/Map$Entry;)Ljava/lang/String;
  #199 = Utf8               (Ljava/util/Map$Entry;)Ljava/lang/String;
  #200 = MethodHandle       5:#201        // REF_invokeVirtual ext/mods/gameserver/custom/data/AuctionCurrencies.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #201 = Methodref          #11.#202      // ext/mods/gameserver/custom/data/AuctionCurrencies.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #202 = NameAndType        #173:#170     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #203 = MethodHandle       6:#204        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #204 = Methodref          #205.#206     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #205 = Class              #207          // java/lang/invoke/LambdaMetafactory
  #206 = NameAndType        #208:#209     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #207 = Utf8               java/lang/invoke/LambdaMetafactory
  #208 = Utf8               metafactory
  #209 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #210 = Utf8               InnerClasses
  #211 = Utf8               SingletonHolder
  #212 = Utf8               Entry
  #213 = Class              #214          // java/lang/invoke/MethodHandles$Lookup
  #214 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #215 = Class              #216          // java/lang/invoke/MethodHandles
  #216 = Utf8               java/lang/invoke/MethodHandles
  #217 = Utf8               Lookup
{
  public ext.mods.gameserver.custom.data.AuctionCurrencies();
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
        12: putfield      #10                 // Field _currencyMap:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 35: 0
        line 32: 4
        line 36: 15
        line 37: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/custom/data/AuctionCurrencies;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _currencyMap:Ljava/util/Map;
         4: invokeinterface #19,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 41: 0
        line 42: 9
        line 43: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/AuctionCurrencies;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ldc           #24                 // String custom/mods/auctionCurrencies.xml
         3: invokevirtual #26                 // Method parseDataFile:(Ljava/lang/String;)V
         6: return
      LineNumberTable:
        line 48: 0
        line 49: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/custom/data/AuctionCurrencies;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #30                 // String list
         4: aload_0
         5: invokedynamic #32,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/custom/data/AuctionCurrencies;)Ljava/util/function/Consumer;
        10: invokevirtual #36                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 54: 0
        line 63: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/custom/data/AuctionCurrencies;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public int getCurrencyId(java.lang.String);
    descriptor: (Ljava/lang/String;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _currencyMap:Ljava/util/Map;
         4: aload_1
         5: iconst_m1
         6: invokestatic  #40                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         9: invokeinterface #46,  3           // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        14: checkcast     #41                 // class java/lang/Integer
        17: invokevirtual #50                 // Method java/lang/Integer.intValue:()I
        20: ireturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/custom/data/AuctionCurrencies;
            0      21     1  name   Ljava/lang/String;

  public java.lang.String getCurrencyName(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _currencyMap:Ljava/util/Map;
         4: invokeinterface #54,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
         9: invokeinterface #58,  1           // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        14: iload_1
        15: invokedynamic #64,  0             // InvokeDynamic #1:test:(I)Ljava/util/function/Predicate;
        20: invokeinterface #68,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokedynamic #74,  0             // InvokeDynamic #2:apply:()Ljava/util/function/Function;
        30: invokeinterface #78,  2           // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        35: invokeinterface #82,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        40: ldc           #86                 // String Unknown Currency
        42: invokevirtual #88                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        45: checkcast     #94                 // class java/lang/String
        48: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/custom/data/AuctionCurrencies;
            0      49     1 currencyId   I

  public java.util.Set<java.lang.String> getCurrencyNames();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _currencyMap:Ljava/util/Map;
         4: invokeinterface #96,  1           // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
         9: areturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/custom/data/AuctionCurrencies;
    Signature: #162                         // ()Ljava/util/Set<Ljava/lang/String;>;

  public static ext.mods.gameserver.custom.data.AuctionCurrencies getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/AuctionCurrencies;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #99                 // Field ext/mods/gameserver/custom/data/AuctionCurrencies$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/AuctionCurrencies;
         3: areturn
      LineNumberTable:
        line 82: 0
}
SourceFile: "AuctionCurrencies.java"
NestMembers:
  ext/mods/gameserver/custom/data/AuctionCurrencies$SingletonHolder
BootstrapMethods:
  0: #203 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #181 (Ljava/lang/Object;)V
      #183 REF_invokeVirtual ext/mods/gameserver/custom/data/AuctionCurrencies.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #186 (Lorg/w3c/dom/Node;)V
  1: #203 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #187 (Ljava/lang/Object;)Z
      #188 REF_invokeStatic ext/mods/gameserver/custom/data/AuctionCurrencies.lambda$getCurrencyName$0:(ILjava/util/Map$Entry;)Z
      #191 (Ljava/util/Map$Entry;)Z
  2: #203 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #193 (Ljava/lang/Object;)Ljava/lang/Object;
      #194 REF_invokeInterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
      #198 (Ljava/util/Map$Entry;)Ljava/lang/String;
  3: #203 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #181 (Ljava/lang/Object;)V
      #200 REF_invokeVirtual ext/mods/gameserver/custom/data/AuctionCurrencies.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #186 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static #212= #106 of #20;        // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #217= #213 of #215; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
