// Bytecode for: ext.mods.gameserver.data.xml.TeleportData
// File: ext\mods\gameserver\data\xml\TeleportData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/TeleportData.class
  Last modified 9 de jul de 2026; size 4781 bytes
  MD5 checksum 8fe9ab0434d00fc55be9684312cde20e
  Compiled from "TeleportData.java"
public class ext.mods.gameserver.data.xml.TeleportData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/TeleportData
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/TeleportData._teleports:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/TeleportData
   #12 = NameAndType        #14:#15       // _teleports:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/xml/TeleportData
   #14 = Utf8               _teleports
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/TeleportData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/teleports.xml
   #20 = Utf8               xml/teleports.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/TeleportData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/TeleportData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} teleport positions.
   #30 = Utf8               Loaded {} teleport positions.
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
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/TeleportData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/TeleportData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/TeleportData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/TeleportData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
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
   #66 = Class              #67           // java/util/List
   #67 = Utf8               java/util/List
   #68 = Class              #69           // java/util/ArrayList
   #69 = Utf8               java/util/ArrayList
   #70 = Methodref          #68.#3        // java/util/ArrayList."<init>":()V
   #71 = InterfaceMethodref #32.#72       // java/util/Map.values:()Ljava/util/Collection;
   #72 = NameAndType        #73:#74       // values:()Ljava/util/Collection;
   #73 = Utf8               values
   #74 = Utf8               ()Ljava/util/Collection;
   #75 = InterfaceMethodref #76.#77       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #76 = Class              #78           // java/util/Collection
   #77 = NameAndType        #79:#80       // iterator:()Ljava/util/Iterator;
   #78 = Utf8               java/util/Collection
   #79 = Utf8               iterator
   #80 = Utf8               ()Ljava/util/Iterator;
   #81 = InterfaceMethodref #82.#83       // java/util/Iterator.hasNext:()Z
   #82 = Class              #84           // java/util/Iterator
   #83 = NameAndType        #85:#86       // hasNext:()Z
   #84 = Utf8               java/util/Iterator
   #85 = Utf8               hasNext
   #86 = Utf8               ()Z
   #87 = InterfaceMethodref #82.#88       // java/util/Iterator.next:()Ljava/lang/Object;
   #88 = NameAndType        #89:#90       // next:()Ljava/lang/Object;
   #89 = Utf8               next
   #90 = Utf8               ()Ljava/lang/Object;
   #91 = InterfaceMethodref #66.#92       // java/util/List.isEmpty:()Z
   #92 = NameAndType        #93:#86       // isEmpty:()Z
   #93 = Utf8               isEmpty
   #94 = InterfaceMethodref #66.#95       // java/util/List.addAll:(Ljava/util/Collection;)Z
   #95 = NameAndType        #96:#97       // addAll:(Ljava/util/Collection;)Z
   #96 = Utf8               addAll
   #97 = Utf8               (Ljava/util/Collection;)Z
   #98 = Fieldref           #99.#100      // ext/mods/gameserver/data/xml/TeleportData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/TeleportData;
   #99 = Class              #101          // ext/mods/gameserver/data/xml/TeleportData$SingletonHolder
  #100 = NameAndType        #102:#103     // INSTANCE:Lext/mods/gameserver/data/xml/TeleportData;
  #101 = Utf8               ext/mods/gameserver/data/xml/TeleportData$SingletonHolder
  #102 = Utf8               INSTANCE
  #103 = Utf8               Lext/mods/gameserver/data/xml/TeleportData;
  #104 = String             #105          // telPosList
  #105 = Utf8               telPosList
  #106 = InvokeDynamic      #1:#52        // #1:accept:(Lext/mods/gameserver/data/xml/TeleportData;)Ljava/util/function/Consumer;
  #107 = InterfaceMethodref #108.#109     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #108 = Class              #110          // org/w3c/dom/Node
  #109 = NameAndType        #111:#112     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #110 = Utf8               org/w3c/dom/Node
  #111 = Utf8               getAttributes
  #112 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #113 = String             #114          // npcId
  #114 = Utf8               npcId
  #115 = InterfaceMethodref #116.#117     // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #116 = Class              #118          // org/w3c/dom/NamedNodeMap
  #117 = NameAndType        #119:#120     // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #118 = Utf8               org/w3c/dom/NamedNodeMap
  #119 = Utf8               getNamedItem
  #120 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
  #121 = InterfaceMethodref #108.#122     // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
  #122 = NameAndType        #123:#124     // getNodeValue:()Ljava/lang/String;
  #123 = Utf8               getNodeValue
  #124 = Utf8               ()Ljava/lang/String;
  #125 = Methodref          #38.#126      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #126 = NameAndType        #127:#128     // parseInt:(Ljava/lang/String;)I
  #127 = Utf8               parseInt
  #128 = Utf8               (Ljava/lang/String;)I
  #129 = String             #130          // loc
  #130 = Utf8               loc
  #131 = InvokeDynamic      #2:#132       // #2:accept:(Lext/mods/gameserver/data/xml/TeleportData;Ljava/util/List;)Ljava/util/function/Consumer;
  #132 = NameAndType        #53:#133      // accept:(Lext/mods/gameserver/data/xml/TeleportData;Ljava/util/List;)Ljava/util/function/Consumer;
  #133 = Utf8               (Lext/mods/gameserver/data/xml/TeleportData;Ljava/util/List;)Ljava/util/function/Consumer;
  #134 = InterfaceMethodref #32.#135      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #135 = NameAndType        #136:#137     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #136 = Utf8               put
  #137 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #138 = Class              #139          // ext/mods/gameserver/model/location/TeleportLocation
  #139 = Utf8               ext/mods/gameserver/model/location/TeleportLocation
  #140 = Methodref          #11.#141      // ext/mods/gameserver/data/xml/TeleportData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #141 = NameAndType        #142:#143     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #142 = Utf8               parseAttributes
  #143 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #144 = Methodref          #138.#145     // ext/mods/gameserver/model/location/TeleportLocation."<init>":(Lext/mods/commons/data/StatSet;)V
  #145 = NameAndType        #5:#146       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #146 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #147 = InterfaceMethodref #66.#148      // java/util/List.add:(Ljava/lang/Object;)Z
  #148 = NameAndType        #149:#150     // add:(Ljava/lang/Object;)Z
  #149 = Utf8               add
  #150 = Utf8               (Ljava/lang/Object;)Z
  #151 = Class              #152          // ext/mods/commons/data/xml/IXmlReader
  #152 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #153 = Utf8               Signature
  #154 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;>;
  #155 = Utf8               Code
  #156 = Utf8               LineNumberTable
  #157 = Utf8               LocalVariableTable
  #158 = Utf8               this
  #159 = Utf8               parseDocument
  #160 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #161 = Utf8               doc
  #162 = Utf8               Lorg/w3c/dom/Document;
  #163 = Utf8               path
  #164 = Utf8               Ljava/nio/file/Path;
  #165 = Utf8               reload
  #166 = Utf8               getTeleports
  #167 = Utf8               (I)Ljava/util/List;
  #168 = Utf8               I
  #169 = Utf8               (I)Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;
  #170 = Utf8               getAllTeleports
  #171 = Utf8               ()Ljava/util/List;
  #172 = Utf8               Ljava/util/List;
  #173 = Utf8               result
  #174 = Utf8               LocalVariableTypeTable
  #175 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;
  #176 = Utf8               StackMapTable
  #177 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;
  #178 = Utf8               getInstance
  #179 = Utf8               ()Lext/mods/gameserver/data/xml/TeleportData;
  #180 = Utf8               lambda$parseDocument$0
  #181 = Utf8               (Lorg/w3c/dom/Node;)V
  #182 = Utf8               listNode
  #183 = Utf8               Lorg/w3c/dom/Node;
  #184 = Utf8               lambda$parseDocument$1
  #185 = Utf8               telPosListNode
  #186 = Utf8               telPosListAttrs
  #187 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #188 = Utf8               teleports
  #189 = Utf8               lambda$parseDocument$2
  #190 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #191 = Utf8               locNode
  #192 = Utf8               SourceFile
  #193 = Utf8               TeleportData.java
  #194 = Utf8               NestMembers
  #195 = Utf8               BootstrapMethods
  #196 = MethodType         #197          //  (Ljava/lang/Object;)V
  #197 = Utf8               (Ljava/lang/Object;)V
  #198 = MethodHandle       5:#199        // REF_invokeVirtual ext/mods/gameserver/data/xml/TeleportData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #199 = Methodref          #11.#200      // ext/mods/gameserver/data/xml/TeleportData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #200 = NameAndType        #180:#181     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #201 = MethodType         #181          //  (Lorg/w3c/dom/Node;)V
  #202 = MethodHandle       5:#203        // REF_invokeVirtual ext/mods/gameserver/data/xml/TeleportData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #203 = Methodref          #11.#204      // ext/mods/gameserver/data/xml/TeleportData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #204 = NameAndType        #184:#181     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #205 = MethodHandle       5:#206        // REF_invokeVirtual ext/mods/gameserver/data/xml/TeleportData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #206 = Methodref          #11.#207      // ext/mods/gameserver/data/xml/TeleportData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #207 = NameAndType        #189:#190     // lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #208 = MethodHandle       6:#209        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #209 = Methodref          #210.#211     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #210 = Class              #212          // java/lang/invoke/LambdaMetafactory
  #211 = NameAndType        #213:#214     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #212 = Utf8               java/lang/invoke/LambdaMetafactory
  #213 = Utf8               metafactory
  #214 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #215 = Utf8               InnerClasses
  #216 = Utf8               SingletonHolder
  #217 = Class              #218          // java/lang/invoke/MethodHandles$Lookup
  #218 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #219 = Class              #220          // java/lang/invoke/MethodHandles
  #220 = Utf8               java/lang/invoke/MethodHandles
  #221 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.TeleportData();
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
        12: putfield      #10                 // Field _teleports:Ljava/util/Map;
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
            0      20     0  this   Lext/mods/gameserver/data/xml/TeleportData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/teleports.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} teleport positions.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _teleports:Ljava/util/Map;
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
            0      34     0  this   Lext/mods/gameserver/data/xml/TeleportData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String list
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/TeleportData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 55: 0
        line 65: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/TeleportData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _teleports:Ljava/util/Map;
         4: invokeinterface #59,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 69: 0
        line 71: 9
        line 72: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/TeleportData;

  public java.util.List<ext.mods.gameserver.model.location.TeleportLocation> getTeleports(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _teleports:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #62,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #66                 // class java/util/List
        16: areturn
      LineNumberTable:
        line 76: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/xml/TeleportData;
            0      17     1 npcId   I
    Signature: #169                         // (I)Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;

  public java.util.List<ext.mods.gameserver.model.location.TeleportLocation> getAllTeleports();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: new           #68                 // class java/util/ArrayList
         3: dup
         4: invokespecial #70                 // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: aload_0
         9: getfield      #10                 // Field _teleports:Ljava/util/Map;
        12: invokeinterface #71,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        17: invokeinterface #75,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        22: astore_2
        23: aload_2
        24: invokeinterface #81,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        29: ifeq          66
        32: aload_2
        33: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        38: checkcast     #66                 // class java/util/List
        41: astore_3
        42: aload_3
        43: ifnull        63
        46: aload_3
        47: invokeinterface #91,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        52: ifne          63
        55: aload_1
        56: aload_3
        57: invokeinterface #94,  2           // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
        62: pop
        63: goto          23
        66: aload_1
        67: areturn
      LineNumberTable:
        line 81: 0
        line 82: 8
        line 84: 42
        line 85: 55
        line 86: 63
        line 87: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42      21     3  list   Ljava/util/List;
            0      68     0  this   Lext/mods/gameserver/data/xml/TeleportData;
            8      60     1 result   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           42      21     3  list   Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;
            8      60     1 result   Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 39 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #177                         // ()Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;

  public static ext.mods.gameserver.data.xml.TeleportData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/TeleportData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #98                 // Field ext/mods/gameserver/data/xml/TeleportData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/TeleportData;
         3: areturn
      LineNumberTable:
        line 92: 0
}
SourceFile: "TeleportData.java"
NestMembers:
  ext/mods/gameserver/data/xml/TeleportData$SingletonHolder
BootstrapMethods:
  0: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #196 (Ljava/lang/Object;)V
      #198 REF_invokeVirtual ext/mods/gameserver/data/xml/TeleportData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #201 (Lorg/w3c/dom/Node;)V
  1: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #196 (Ljava/lang/Object;)V
      #202 REF_invokeVirtual ext/mods/gameserver/data/xml/TeleportData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #201 (Lorg/w3c/dom/Node;)V
  2: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #196 (Ljava/lang/Object;)V
      #205 REF_invokeVirtual ext/mods/gameserver/data/xml/TeleportData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #201 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #221= #217 of #219; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
