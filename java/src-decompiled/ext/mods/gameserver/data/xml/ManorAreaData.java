// Bytecode for: ext.mods.gameserver.data.xml.ManorAreaData
// File: ext\mods\gameserver\data\xml\ManorAreaData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/ManorAreaData.class
  Last modified 9 de jul de 2026; size 4875 bytes
  MD5 checksum c503b77cdeea07f479b2862cc6ad6c72
  Compiled from "ManorAreaData.java"
public class ext.mods.gameserver.data.xml.ManorAreaData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/ManorAreaData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 10, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/ManorAreaData._manorAreas:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/ManorAreaData
   #12 = NameAndType        #14:#15       // _manorAreas:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/data/xml/ManorAreaData
   #14 = Utf8               _manorAreas
   #15 = Utf8               Ljava/util/List;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/ManorAreaData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/manorAreas.xml
   #20 = Utf8               xml/manorAreas.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/ManorAreaData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/ManorAreaData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} manor areas.
   #30 = Utf8               Loaded {} manor areas.
   #31 = InterfaceMethodref #32.#33       // java/util/List.size:()I
   #32 = Class              #34           // java/util/List
   #33 = NameAndType        #35:#36       // size:()I
   #34 = Utf8               java/util/List
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
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/gameserver/data/xml/ManorAreaData;Ljava/util/List;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/gameserver/data/xml/ManorAreaData;Ljava/util/List;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/gameserver/data/xml/ManorAreaData;Ljava/util/List;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/gameserver/data/xml/ManorAreaData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = Methodref          #60.#61       // ext/mods/gameserver/model/actor/instance/Monster.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #60 = Class              #62           // ext/mods/gameserver/model/actor/instance/Monster
   #61 = NameAndType        #63:#64       // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #62 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #63 = Utf8               getSpawnLocation
   #64 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #65 = InterfaceMethodref #32.#66       // java/util/List.stream:()Ljava/util/stream/Stream;
   #66 = NameAndType        #67:#68       // stream:()Ljava/util/stream/Stream;
   #67 = Utf8               stream
   #68 = Utf8               ()Ljava/util/stream/Stream;
   #69 = InvokeDynamic      #1:#70        // #1:test:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
   #70 = NameAndType        #71:#72       // test:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
   #71 = Utf8               test
   #72 = Utf8               (Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
   #73 = InterfaceMethodref #74.#75       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #74 = Class              #76           // java/util/stream/Stream
   #75 = NameAndType        #77:#78       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #76 = Utf8               java/util/stream/Stream
   #77 = Utf8               filter
   #78 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #79 = InterfaceMethodref #74.#80       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #80 = NameAndType        #81:#82       // findFirst:()Ljava/util/Optional;
   #81 = Utf8               findFirst
   #82 = Utf8               ()Ljava/util/Optional;
   #83 = Methodref          #84.#85       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #84 = Class              #86           // java/util/Optional
   #85 = NameAndType        #87:#88       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #86 = Utf8               java/util/Optional
   #87 = Utf8               orElse
   #88 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #89 = Class              #90           // ext/mods/gameserver/model/manor/ManorArea
   #90 = Utf8               ext/mods/gameserver/model/manor/ManorArea
   #91 = Fieldref           #92.#93       // ext/mods/gameserver/data/xml/ManorAreaData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/ManorAreaData;
   #92 = Class              #94           // ext/mods/gameserver/data/xml/ManorAreaData$SingletonHolder
   #93 = NameAndType        #95:#96       // INSTANCE:Lext/mods/gameserver/data/xml/ManorAreaData;
   #94 = Utf8               ext/mods/gameserver/data/xml/ManorAreaData$SingletonHolder
   #95 = Utf8               INSTANCE
   #96 = Utf8               Lext/mods/gameserver/data/xml/ManorAreaData;
   #97 = Methodref          #98.#99       // ext/mods/gameserver/model/location/Location.getX:()I
   #98 = Class              #100          // ext/mods/gameserver/model/location/Location
   #99 = NameAndType        #101:#36      // getX:()I
  #100 = Utf8               ext/mods/gameserver/model/location/Location
  #101 = Utf8               getX
  #102 = Methodref          #98.#103      // ext/mods/gameserver/model/location/Location.getY:()I
  #103 = NameAndType        #104:#36      // getY:()I
  #104 = Utf8               getY
  #105 = Methodref          #89.#106      // ext/mods/gameserver/model/manor/ManorArea.isInside:(II)Z
  #106 = NameAndType        #107:#108     // isInside:(II)Z
  #107 = Utf8               isInside
  #108 = Utf8               (II)Z
  #109 = String             #110          // area
  #110 = Utf8               area
  #111 = InvokeDynamic      #2:#52        // #2:accept:(Lext/mods/gameserver/data/xml/ManorAreaData;Ljava/util/List;)Ljava/util/function/Consumer;
  #112 = Methodref          #11.#113      // ext/mods/gameserver/data/xml/ManorAreaData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #113 = NameAndType        #114:#115     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #114 = Utf8               parseAttributes
  #115 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #116 = String             #117          // node
  #117 = Utf8               node
  #118 = InvokeDynamic      #3:#52        // #3:accept:(Lext/mods/gameserver/data/xml/ManorAreaData;Ljava/util/List;)Ljava/util/function/Consumer;
  #119 = String             #120          // coords
  #120 = Utf8               coords
  #121 = Methodref          #122.#123     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/Object;)V
  #122 = Class              #124          // ext/mods/commons/data/StatSet
  #123 = NameAndType        #125:#126     // set:(Ljava/lang/String;Ljava/lang/Object;)V
  #124 = Utf8               ext/mods/commons/data/StatSet
  #125 = Utf8               set
  #126 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
  #127 = Methodref          #89.#128      // ext/mods/gameserver/model/manor/ManorArea."<init>":(Lext/mods/commons/data/StatSet;)V
  #128 = NameAndType        #5:#129       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #129 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #130 = InterfaceMethodref #32.#131      // java/util/List.add:(Ljava/lang/Object;)Z
  #131 = NameAndType        #132:#133     // add:(Ljava/lang/Object;)Z
  #132 = Utf8               add
  #133 = Utf8               (Ljava/lang/Object;)Z
  #134 = InterfaceMethodref #32.#135      // java/util/List.clear:()V
  #135 = NameAndType        #136:#6       // clear:()V
  #136 = Utf8               clear
  #137 = Methodref          #11.#138      // ext/mods/gameserver/data/xml/ManorAreaData.parsePoint2D:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Point2D;
  #138 = NameAndType        #139:#140     // parsePoint2D:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Point2D;
  #139 = Utf8               parsePoint2D
  #140 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Point2D;
  #141 = Class              #142          // ext/mods/commons/data/xml/IXmlReader
  #142 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #143 = Utf8               Signature
  #144 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/manor/ManorArea;>;
  #145 = Utf8               Code
  #146 = Utf8               LineNumberTable
  #147 = Utf8               LocalVariableTable
  #148 = Utf8               this
  #149 = Utf8               parseDocument
  #150 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #151 = Utf8               doc
  #152 = Utf8               Lorg/w3c/dom/Document;
  #153 = Utf8               path
  #154 = Utf8               Ljava/nio/file/Path;
  #155 = Utf8               LocalVariableTypeTable
  #156 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
  #157 = Utf8               getManorAreas
  #158 = Utf8               ()Ljava/util/List;
  #159 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/manor/ManorArea;>;
  #160 = Utf8               getManorArea
  #161 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)Lext/mods/gameserver/model/manor/ManorArea;
  #162 = Utf8               monster
  #163 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #164 = Utf8               loc
  #165 = Utf8               Lext/mods/gameserver/model/location/Location;
  #166 = Utf8               getInstance
  #167 = Utf8               ()Lext/mods/gameserver/data/xml/ManorAreaData;
  #168 = Utf8               lambda$getManorArea$0
  #169 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/manor/ManorArea;)Z
  #170 = Utf8               ma
  #171 = Utf8               Lext/mods/gameserver/model/manor/ManorArea;
  #172 = Utf8               lambda$parseDocument$0
  #173 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #174 = Utf8               listNode
  #175 = Utf8               Lorg/w3c/dom/Node;
  #176 = Utf8               lambda$parseDocument$1
  #177 = Utf8               areaNode
  #178 = Utf8               Lext/mods/commons/data/StatSet;
  #179 = Utf8               lambda$parseDocument$2
  #180 = Utf8               nodeNode
  #181 = Utf8               SourceFile
  #182 = Utf8               ManorAreaData.java
  #183 = Utf8               NestMembers
  #184 = Utf8               BootstrapMethods
  #185 = MethodType         #186          //  (Ljava/lang/Object;)V
  #186 = Utf8               (Ljava/lang/Object;)V
  #187 = MethodHandle       5:#188        // REF_invokeVirtual ext/mods/gameserver/data/xml/ManorAreaData.lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #188 = Methodref          #11.#189      // ext/mods/gameserver/data/xml/ManorAreaData.lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #189 = NameAndType        #172:#173     // lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #190 = MethodType         #191          //  (Lorg/w3c/dom/Node;)V
  #191 = Utf8               (Lorg/w3c/dom/Node;)V
  #192 = MethodType         #133          //  (Ljava/lang/Object;)Z
  #193 = MethodHandle       6:#194        // REF_invokeStatic ext/mods/gameserver/data/xml/ManorAreaData.lambda$getManorArea$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/manor/ManorArea;)Z
  #194 = Methodref          #11.#195      // ext/mods/gameserver/data/xml/ManorAreaData.lambda$getManorArea$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/manor/ManorArea;)Z
  #195 = NameAndType        #168:#169     // lambda$getManorArea$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/manor/ManorArea;)Z
  #196 = MethodType         #197          //  (Lext/mods/gameserver/model/manor/ManorArea;)Z
  #197 = Utf8               (Lext/mods/gameserver/model/manor/ManorArea;)Z
  #198 = MethodHandle       5:#199        // REF_invokeVirtual ext/mods/gameserver/data/xml/ManorAreaData.lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #199 = Methodref          #11.#200      // ext/mods/gameserver/data/xml/ManorAreaData.lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #200 = NameAndType        #176:#173     // lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #201 = MethodHandle       5:#202        // REF_invokeVirtual ext/mods/gameserver/data/xml/ManorAreaData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #202 = Methodref          #11.#203      // ext/mods/gameserver/data/xml/ManorAreaData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #203 = NameAndType        #179:#173     // lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #204 = MethodHandle       6:#205        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #205 = Methodref          #206.#207     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #206 = Class              #208          // java/lang/invoke/LambdaMetafactory
  #207 = NameAndType        #209:#210     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #208 = Utf8               java/lang/invoke/LambdaMetafactory
  #209 = Utf8               metafactory
  #210 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #211 = Utf8               InnerClasses
  #212 = Utf8               SingletonHolder
  #213 = Class              #214          // java/lang/invoke/MethodHandles$Lookup
  #214 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #215 = Class              #216          // java/lang/invoke/MethodHandles
  #216 = Utf8               java/lang/invoke/MethodHandles
  #217 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.ManorAreaData();
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
        12: putfield      #10                 // Field _manorAreas:Ljava/util/List;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 46: 0
        line 43: 4
        line 47: 15
        line 48: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/ManorAreaData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/manorAreas.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} manor areas.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _manorAreas:Ljava/util/List;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/List.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 53: 0
        line 54: 6
        line 55: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/xml/ManorAreaData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: new           #7                  // class java/util/ArrayList
         3: dup
         4: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
         7: astore_3
         8: aload_0
         9: aload_1
        10: ldc           #49                 // String list
        12: aload_0
        13: aload_3
        14: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/ManorAreaData;Ljava/util/List;)Ljava/util/function/Consumer;
        19: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        22: return
      LineNumberTable:
        line 60: 0
        line 62: 8
        line 73: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/data/xml/ManorAreaData;
            0      23     1   doc   Lorg/w3c/dom/Document;
            0      23     2  path   Ljava/nio/file/Path;
            8      15     3 coords   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      15     3 coords   Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;

  public final java.util.List<ext.mods.gameserver.model.manor.ManorArea> getManorAreas();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _manorAreas:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/ManorAreaData;
    Signature: #159                         // ()Ljava/util/List<Lext/mods/gameserver/model/manor/ManorArea;>;

  public final ext.mods.gameserver.model.manor.ManorArea getManorArea(ext.mods.gameserver.model.actor.instance.Monster);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Monster;)Lext/mods/gameserver/model/manor/ManorArea;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/instance/Monster.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
         4: astore_2
         5: aload_0
         6: getfield      #10                 // Field _manorAreas:Ljava/util/List;
         9: invokeinterface #65,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        14: aload_2
        15: invokedynamic #69,  0             // InvokeDynamic #1:test:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
        20: invokeinterface #73,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #79,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        30: aconst_null
        31: invokevirtual #83                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #89                 // class ext/mods/gameserver/model/manor/ManorArea
        37: areturn
      LineNumberTable:
        line 89: 0
        line 91: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/data/xml/ManorAreaData;
            0      38     1 monster   Lext/mods/gameserver/model/actor/instance/Monster;
            5      33     2   loc   Lext/mods/gameserver/model/location/Location;

  public static ext.mods.gameserver.data.xml.ManorAreaData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/ManorAreaData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #91                 // Field ext/mods/gameserver/data/xml/ManorAreaData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/ManorAreaData;
         3: areturn
      LineNumberTable:
        line 96: 0
}
SourceFile: "ManorAreaData.java"
NestMembers:
  ext/mods/gameserver/data/xml/ManorAreaData$SingletonHolder
BootstrapMethods:
  0: #204 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #185 (Ljava/lang/Object;)V
      #187 REF_invokeVirtual ext/mods/gameserver/data/xml/ManorAreaData.lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #190 (Lorg/w3c/dom/Node;)V
  1: #204 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #192 (Ljava/lang/Object;)Z
      #193 REF_invokeStatic ext/mods/gameserver/data/xml/ManorAreaData.lambda$getManorArea$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/manor/ManorArea;)Z
      #196 (Lext/mods/gameserver/model/manor/ManorArea;)Z
  2: #204 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #185 (Ljava/lang/Object;)V
      #198 REF_invokeVirtual ext/mods/gameserver/data/xml/ManorAreaData.lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #190 (Lorg/w3c/dom/Node;)V
  3: #204 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #185 (Ljava/lang/Object;)V
      #201 REF_invokeVirtual ext/mods/gameserver/data/xml/ManorAreaData.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #190 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #217= #213 of #215; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
