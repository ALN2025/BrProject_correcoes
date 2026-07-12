// Bytecode for: ext.mods.fakeplayer.data.EquipesData
// File: ext\mods\fakeplayer\data\EquipesData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/data/EquipesData.class
  Last modified 9 de jul de 2026; size 4704 bytes
  MD5 checksum d29a121964d97604dbb4a1e8677979b9
  Compiled from "EquipesData.java"
public class ext.mods.fakeplayer.data.EquipesData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/fakeplayer/data/EquipesData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 8, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/fakeplayer/data/EquipesData._equipes:Ljava/util/List;
   #11 = Class              #13           // ext/mods/fakeplayer/data/EquipesData
   #12 = NameAndType        #14:#15       // _equipes:Ljava/util/List;
   #13 = Utf8               ext/mods/fakeplayer/data/EquipesData
   #14 = Utf8               _equipes
   #15 = Utf8               Ljava/util/List;
   #16 = Methodref          #11.#17       // ext/mods/fakeplayer/data/EquipesData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // custom/mods/fakesEquipes.xml
   #20 = Utf8               custom/mods/fakesEquipes.xml
   #21 = Methodref          #11.#22       // ext/mods/fakeplayer/data/EquipesData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/fakeplayer/data/EquipesData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} equipes.
   #30 = Utf8               Loaded {} equipes.
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
   #49 = String             #50           // equipmentSets
   #50 = Utf8               equipmentSets
   #51 = InvokeDynamic      #0:#52        // #0:accept:(Lext/mods/fakeplayer/data/EquipesData;)Ljava/util/function/Consumer;
   #52 = NameAndType        #53:#54       // accept:(Lext/mods/fakeplayer/data/EquipesData;)Ljava/util/function/Consumer;
   #53 = Utf8               accept
   #54 = Utf8               (Lext/mods/fakeplayer/data/EquipesData;)Ljava/util/function/Consumer;
   #55 = Methodref          #11.#56       // ext/mods/fakeplayer/data/EquipesData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = NameAndType        #57:#58       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Utf8               forEach
   #58 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #59 = InterfaceMethodref #60.#61       // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
   #60 = Class              #62           // org/w3c/dom/NamedNodeMap
   #61 = NameAndType        #63:#64       // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
   #62 = Utf8               org/w3c/dom/NamedNodeMap
   #63 = Utf8               getNamedItem
   #64 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
   #65 = InterfaceMethodref #66.#67       // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
   #66 = Class              #68           // org/w3c/dom/Node
   #67 = NameAndType        #69:#70       // getNodeValue:()Ljava/lang/String;
   #68 = Utf8               org/w3c/dom/Node
   #69 = Utf8               getNodeValue
   #70 = Utf8               ()Ljava/lang/String;
   #71 = Methodref          #72.#73       // java/lang/String.isEmpty:()Z
   #72 = Class              #74           // java/lang/String
   #73 = NameAndType        #75:#76       // isEmpty:()Z
   #74 = Utf8               java/lang/String
   #75 = Utf8               isEmpty
   #76 = Utf8               ()Z
   #77 = Methodref          #38.#78       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #78 = NameAndType        #79:#80       // parseInt:(Ljava/lang/String;)I
   #79 = Utf8               parseInt
   #80 = Utf8               (Ljava/lang/String;)I
   #81 = InterfaceMethodref #32.#82       // java/util/List.iterator:()Ljava/util/Iterator;
   #82 = NameAndType        #83:#84       // iterator:()Ljava/util/Iterator;
   #83 = Utf8               iterator
   #84 = Utf8               ()Ljava/util/Iterator;
   #85 = InterfaceMethodref #86.#87       // java/util/Iterator.hasNext:()Z
   #86 = Class              #88           // java/util/Iterator
   #87 = NameAndType        #89:#76       // hasNext:()Z
   #88 = Utf8               java/util/Iterator
   #89 = Utf8               hasNext
   #90 = InterfaceMethodref #86.#91       // java/util/Iterator.next:()Ljava/lang/Object;
   #91 = NameAndType        #92:#93       // next:()Ljava/lang/Object;
   #92 = Utf8               next
   #93 = Utf8               ()Ljava/lang/Object;
   #94 = Class              #95           // ext/mods/fakeplayer/holder/EquipesHolder
   #95 = Utf8               ext/mods/fakeplayer/holder/EquipesHolder
   #96 = Methodref          #94.#97       // ext/mods/fakeplayer/holder/EquipesHolder.getClassId:()Ljava/lang/String;
   #97 = NameAndType        #98:#70       // getClassId:()Ljava/lang/String;
   #98 = Utf8               getClassId
   #99 = Methodref          #72.#100      // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #100 = NameAndType        #101:#102     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #101 = Utf8               equalsIgnoreCase
  #102 = Utf8               (Ljava/lang/String;)Z
  #103 = Methodref          #94.#104      // ext/mods/fakeplayer/holder/EquipesHolder.getMinLevel:()I
  #104 = NameAndType        #105:#36      // getMinLevel:()I
  #105 = Utf8               getMinLevel
  #106 = Methodref          #94.#107      // ext/mods/fakeplayer/holder/EquipesHolder.getMaxLevel:()I
  #107 = NameAndType        #108:#36      // getMaxLevel:()I
  #108 = Utf8               getMaxLevel
  #109 = InterfaceMethodref #32.#110      // java/util/List.add:(Ljava/lang/Object;)Z
  #110 = NameAndType        #111:#112     // add:(Ljava/lang/Object;)Z
  #111 = Utf8               add
  #112 = Utf8               (Ljava/lang/Object;)Z
  #113 = InterfaceMethodref #32.#73       // java/util/List.isEmpty:()Z
  #114 = Methodref          #115.#116     // ext/mods/commons/random/Rnd.get:(I)I
  #115 = Class              #117          // ext/mods/commons/random/Rnd
  #116 = NameAndType        #118:#119     // get:(I)I
  #117 = Utf8               ext/mods/commons/random/Rnd
  #118 = Utf8               get
  #119 = Utf8               (I)I
  #120 = InterfaceMethodref #32.#121      // java/util/List.get:(I)Ljava/lang/Object;
  #121 = NameAndType        #118:#122     // get:(I)Ljava/lang/Object;
  #122 = Utf8               (I)Ljava/lang/Object;
  #123 = Fieldref           #124.#125     // ext/mods/fakeplayer/data/EquipesData$SingletonHolder.INSTANCE:Lext/mods/fakeplayer/data/EquipesData;
  #124 = Class              #126          // ext/mods/fakeplayer/data/EquipesData$SingletonHolder
  #125 = NameAndType        #127:#128     // INSTANCE:Lext/mods/fakeplayer/data/EquipesData;
  #126 = Utf8               ext/mods/fakeplayer/data/EquipesData$SingletonHolder
  #127 = Utf8               INSTANCE
  #128 = Utf8               Lext/mods/fakeplayer/data/EquipesData;
  #129 = String             #130          // equipment
  #130 = Utf8               equipment
  #131 = InvokeDynamic      #1:#52        // #1:accept:(Lext/mods/fakeplayer/data/EquipesData;)Ljava/util/function/Consumer;
  #132 = InterfaceMethodref #66.#133      // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #133 = NameAndType        #134:#135     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #134 = Utf8               getAttributes
  #135 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #136 = String             #137          // classId
  #137 = Utf8               classId
  #138 = String             #139          // minLevel
  #139 = Utf8               minLevel
  #140 = String             #141          // maxLevel
  #141 = Utf8               maxLevel
  #142 = String             #143          // rhand
  #143 = Utf8               rhand
  #144 = Methodref          #11.#145      // ext/mods/fakeplayer/data/EquipesData.getInt:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)I
  #145 = NameAndType        #146:#147     // getInt:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)I
  #146 = Utf8               getInt
  #147 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)I
  #148 = String             #149          // lhand
  #149 = Utf8               lhand
  #150 = String             #151          // head
  #151 = Utf8               head
  #152 = String             #153          // chest
  #153 = Utf8               chest
  #154 = String             #155          // legs
  #155 = Utf8               legs
  #156 = String             #157          // hands
  #157 = Utf8               hands
  #158 = String             #159          // feet
  #159 = Utf8               feet
  #160 = String             #161          // neck
  #161 = Utf8               neck
  #162 = String             #163          // lear
  #163 = Utf8               lear
  #164 = String             #165          // rear
  #165 = Utf8               rear
  #166 = String             #167          // lring
  #167 = Utf8               lring
  #168 = String             #169          // rring
  #169 = Utf8               rring
  #170 = Methodref          #94.#171      // ext/mods/fakeplayer/holder/EquipesHolder."<init>":(Ljava/lang/String;IIIIIIIIIIIIII)V
  #171 = NameAndType        #5:#172       // "<init>":(Ljava/lang/String;IIIIIIIIIIIIII)V
  #172 = Utf8               (Ljava/lang/String;IIIIIIIIIIIIII)V
  #173 = Class              #174          // ext/mods/commons/data/xml/IXmlReader
  #174 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #175 = Utf8               Signature
  #176 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/holder/EquipesHolder;>;
  #177 = Utf8               Code
  #178 = Utf8               LineNumberTable
  #179 = Utf8               LocalVariableTable
  #180 = Utf8               this
  #181 = Utf8               parseDocument
  #182 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #183 = Utf8               doc
  #184 = Utf8               Lorg/w3c/dom/Document;
  #185 = Utf8               path
  #186 = Utf8               Ljava/nio/file/Path;
  #187 = Utf8               attrs
  #188 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #189 = Utf8               name
  #190 = Utf8               Ljava/lang/String;
  #191 = Utf8               node
  #192 = Utf8               Lorg/w3c/dom/Node;
  #193 = Utf8               StackMapTable
  #194 = Utf8               getArmorSet
  #195 = Utf8               (Ljava/lang/String;I)Lext/mods/fakeplayer/holder/EquipesHolder;
  #196 = Utf8               holder
  #197 = Utf8               Lext/mods/fakeplayer/holder/EquipesHolder;
  #198 = Utf8               level
  #199 = Utf8               I
  #200 = Utf8               matching
  #201 = Utf8               fallback
  #202 = Utf8               LocalVariableTypeTable
  #203 = Utf8               getInstance
  #204 = Utf8               ()Lext/mods/fakeplayer/data/EquipesData;
  #205 = Utf8               lambda$parseDocument$0
  #206 = Utf8               (Lorg/w3c/dom/Node;)V
  #207 = Utf8               listNode
  #208 = Utf8               lambda$parseDocument$1
  #209 = Utf8               SourceFile
  #210 = Utf8               EquipesData.java
  #211 = Utf8               NestMembers
  #212 = Utf8               BootstrapMethods
  #213 = MethodType         #214          //  (Ljava/lang/Object;)V
  #214 = Utf8               (Ljava/lang/Object;)V
  #215 = MethodHandle       5:#216        // REF_invokeVirtual ext/mods/fakeplayer/data/EquipesData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #216 = Methodref          #11.#217      // ext/mods/fakeplayer/data/EquipesData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #217 = NameAndType        #205:#206     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #218 = MethodType         #206          //  (Lorg/w3c/dom/Node;)V
  #219 = MethodHandle       5:#220        // REF_invokeVirtual ext/mods/fakeplayer/data/EquipesData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #220 = Methodref          #11.#221      // ext/mods/fakeplayer/data/EquipesData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #221 = NameAndType        #208:#206     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #222 = MethodHandle       6:#223        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #223 = Methodref          #224.#225     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #224 = Class              #226          // java/lang/invoke/LambdaMetafactory
  #225 = NameAndType        #227:#228     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #226 = Utf8               java/lang/invoke/LambdaMetafactory
  #227 = Utf8               metafactory
  #228 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #229 = Utf8               InnerClasses
  #230 = Utf8               SingletonHolder
  #231 = Class              #232          // java/lang/invoke/MethodHandles$Lookup
  #232 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #233 = Class              #234          // java/lang/invoke/MethodHandles
  #234 = Utf8               java/lang/invoke/MethodHandles
  #235 = Utf8               Lookup
{
  public ext.mods.fakeplayer.data.EquipesData();
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
        12: putfield      #10                 // Field _equipes:Ljava/util/List;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 38: 0
        line 35: 4
        line 39: 15
        line 40: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/fakeplayer/data/EquipesData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String custom/mods/fakesEquipes.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} equipes.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _equipes:Ljava/util/List;
        21: invokeinterface #31,  1           // InterfaceMethod java/util/List.size:()I
        26: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #43                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 45: 0
        line 46: 6
        line 47: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/fakeplayer/data/EquipesData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String equipmentSets
         4: aload_0
         5: invokedynamic #51,  0             // InvokeDynamic #0:accept:(Lext/mods/fakeplayer/data/EquipesData;)Ljava/util/function/Consumer;
        10: invokevirtual #55                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 52: 0
        line 75: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/fakeplayer/data/EquipesData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.fakeplayer.holder.EquipesHolder getArmorSet(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)Lext/mods/fakeplayer/holder/EquipesHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=3
         0: new           #7                  // class java/util/ArrayList
         3: dup
         4: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
         7: astore_3
         8: aconst_null
         9: astore        4
        11: aload_0
        12: getfield      #10                 // Field _equipes:Ljava/util/List;
        15: invokeinterface #81,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        20: astore        5
        22: aload         5
        24: invokeinterface #85,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        29: ifeq          120
        32: aload         5
        34: invokeinterface #90,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        39: checkcast     #94                 // class ext/mods/fakeplayer/holder/EquipesHolder
        42: astore        6
        44: aload         6
        46: invokevirtual #96                 // Method ext/mods/fakeplayer/holder/EquipesHolder.getClassId:()Ljava/lang/String;
        49: aload_1
        50: invokevirtual #99                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        53: ifeq          117
        56: iload_2
        57: aload         6
        59: invokevirtual #103                // Method ext/mods/fakeplayer/holder/EquipesHolder.getMinLevel:()I
        62: if_icmplt     86
        65: iload_2
        66: aload         6
        68: invokevirtual #106                // Method ext/mods/fakeplayer/holder/EquipesHolder.getMaxLevel:()I
        71: if_icmpgt     86
        74: aload_3
        75: aload         6
        77: invokeinterface #109,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        82: pop
        83: goto          117
        86: aload         6
        88: invokevirtual #106                // Method ext/mods/fakeplayer/holder/EquipesHolder.getMaxLevel:()I
        91: iload_2
        92: if_icmpge     117
        95: aload         4
        97: ifnull        113
       100: aload         6
       102: invokevirtual #106                // Method ext/mods/fakeplayer/holder/EquipesHolder.getMaxLevel:()I
       105: aload         4
       107: invokevirtual #106                // Method ext/mods/fakeplayer/holder/EquipesHolder.getMaxLevel:()I
       110: if_icmple     117
       113: aload         6
       115: astore        4
       117: goto          22
       120: aload_3
       121: invokeinterface #113,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       126: ifne          148
       129: aload_3
       130: aload_3
       131: invokeinterface #31,  1           // InterfaceMethod java/util/List.size:()I
       136: invokestatic  #114                // Method ext/mods/commons/random/Rnd.get:(I)I
       139: invokeinterface #120,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       144: checkcast     #94                 // class ext/mods/fakeplayer/holder/EquipesHolder
       147: areturn
       148: aload         4
       150: areturn
      LineNumberTable:
        line 85: 0
        line 86: 8
        line 88: 11
        line 90: 44
        line 92: 56
        line 94: 74
        line 96: 86
        line 99: 95
        line 100: 113
        line 103: 117
        line 105: 120
        line 106: 129
        line 108: 148
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44      73     6 holder   Lext/mods/fakeplayer/holder/EquipesHolder;
            0     151     0  this   Lext/mods/fakeplayer/data/EquipesData;
            0     151     1 classId   Ljava/lang/String;
            0     151     2 level   I
            8     143     3 matching   Ljava/util/List;
           11     140     4 fallback   Lext/mods/fakeplayer/holder/EquipesHolder;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     143     3 matching   Ljava/util/List<Lext/mods/fakeplayer/holder/EquipesHolder;>;
      StackMapTable: number_of_entries = 6
        frame_type = 254 /* append */
          offset_delta = 22
          locals = [ class java/util/List, class ext/mods/fakeplayer/holder/EquipesHolder, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 63
          locals = [ class ext/mods/fakeplayer/holder/EquipesHolder ]
        frame_type = 26 /* same */
        frame_type = 250 /* chop */
          offset_delta = 3
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 27 /* same */

  public static ext.mods.fakeplayer.data.EquipesData getInstance();
    descriptor: ()Lext/mods/fakeplayer/data/EquipesData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #123                // Field ext/mods/fakeplayer/data/EquipesData$SingletonHolder.INSTANCE:Lext/mods/fakeplayer/data/EquipesData;
         3: areturn
      LineNumberTable:
        line 113: 0
}
SourceFile: "EquipesData.java"
NestMembers:
  ext/mods/fakeplayer/data/EquipesData$SingletonHolder
BootstrapMethods:
  0: #222 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #213 (Ljava/lang/Object;)V
      #215 REF_invokeVirtual ext/mods/fakeplayer/data/EquipesData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #218 (Lorg/w3c/dom/Node;)V
  1: #222 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #213 (Ljava/lang/Object;)V
      #219 REF_invokeVirtual ext/mods/fakeplayer/data/EquipesData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #218 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #235= #231 of #233; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
