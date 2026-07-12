// Bytecode for: ext.mods.CapsuleBox.CapsuleBoxData
// File: ext\mods\CapsuleBox\CapsuleBoxData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/CapsuleBox/CapsuleBoxData.class
  Last modified 9 de jul de 2026; size 4368 bytes
  MD5 checksum ba7b72622fd2199ee1a6a218bb8bfad9
  Compiled from "CapsuleBoxData.java"
public class ext.mods.CapsuleBox.CapsuleBoxData extends ext.mods.XMLDocument
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/CapsuleBox/CapsuleBoxData
  super_class: #2                         // ext/mods/XMLDocument
  interfaces: 0, fields: 1, methods: 8, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/XMLDocument."<init>":()V
    #2 = Class              #4            // ext/mods/XMLDocument
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/XMLDocument
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/CapsuleBox/CapsuleBoxData.capsuleBoxItems:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/CapsuleBox/CapsuleBoxData
   #12 = NameAndType        #14:#15       // capsuleBoxItems:Ljava/util/Map;
   #13 = Utf8               ext/mods/CapsuleBox/CapsuleBoxData
   #14 = Utf8               capsuleBoxItems
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/CapsuleBox/CapsuleBoxData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = InterfaceMethodref #20.#21       // java/util/Map.clear:()V
   #20 = Class              #22           // java/util/Map
   #21 = NameAndType        #23:#6        // clear:()V
   #22 = Utf8               java/util/Map
   #23 = Utf8               clear
   #24 = Fieldref           #25.#26       // ext/mods/CapsuleBox/CapsuleBoxData$SingletonHolder.INSTANCE:Lext/mods/CapsuleBox/CapsuleBoxData;
   #25 = Class              #27           // ext/mods/CapsuleBox/CapsuleBoxData$SingletonHolder
   #26 = NameAndType        #28:#29       // INSTANCE:Lext/mods/CapsuleBox/CapsuleBoxData;
   #27 = Utf8               ext/mods/CapsuleBox/CapsuleBoxData$SingletonHolder
   #28 = Utf8               INSTANCE
   #29 = Utf8               Lext/mods/CapsuleBox/CapsuleBoxData;
   #30 = String             #31           // ./data/xml/CapsuleBox.xml
   #31 = Utf8               ./data/xml/CapsuleBox.xml
   #32 = Methodref          #11.#33       // ext/mods/CapsuleBox/CapsuleBoxData.loadDocument:(Ljava/lang/String;)V
   #33 = NameAndType        #34:#35       // loadDocument:(Ljava/lang/String;)V
   #34 = Utf8               loadDocument
   #35 = Utf8               (Ljava/lang/String;)V
   #36 = Fieldref           #11.#37       // ext/mods/CapsuleBox/CapsuleBoxData.LOG:Ljava/util/logging/Logger;
   #37 = NameAndType        #38:#39       // LOG:Ljava/util/logging/Logger;
   #38 = Utf8               LOG
   #39 = Utf8               Ljava/util/logging/Logger;
   #40 = InterfaceMethodref #20.#41       // java/util/Map.size:()I
   #41 = NameAndType        #42:#43       // size:()I
   #42 = Utf8               size
   #43 = Utf8               ()I
   #44 = InvokeDynamic      #0:#45        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #45 = NameAndType        #46:#47       // makeConcatWithConstants:(I)Ljava/lang/String;
   #46 = Utf8               makeConcatWithConstants
   #47 = Utf8               (I)Ljava/lang/String;
   #48 = Methodref          #49.#50       // java/util/logging/Logger.info:(Ljava/lang/String;)V
   #49 = Class              #51           // java/util/logging/Logger
   #50 = NameAndType        #52:#35       // info:(Ljava/lang/String;)V
   #51 = Utf8               java/util/logging/Logger
   #52 = Utf8               info
   #53 = InterfaceMethodref #54.#55       // org/w3c/dom/Document.getFirstChild:()Lorg/w3c/dom/Node;
   #54 = Class              #56           // org/w3c/dom/Document
   #55 = NameAndType        #57:#58       // getFirstChild:()Lorg/w3c/dom/Node;
   #56 = Utf8               org/w3c/dom/Document
   #57 = Utf8               getFirstChild
   #58 = Utf8               ()Lorg/w3c/dom/Node;
   #59 = InterfaceMethodref #60.#55       // org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
   #60 = Class              #61           // org/w3c/dom/Node
   #61 = Utf8               org/w3c/dom/Node
   #62 = String             #63           // capsuled_items
   #63 = Utf8               capsuled_items
   #64 = InterfaceMethodref #60.#65       // org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
   #65 = NameAndType        #66:#67       // getNodeName:()Ljava/lang/String;
   #66 = Utf8               getNodeName
   #67 = Utf8               ()Ljava/lang/String;
   #68 = Methodref          #69.#70       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #69 = Class              #71           // java/lang/String
   #70 = NameAndType        #72:#73       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #71 = Utf8               java/lang/String
   #72 = Utf8               equalsIgnoreCase
   #73 = Utf8               (Ljava/lang/String;)Z
   #74 = InterfaceMethodref #60.#75       // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #75 = NameAndType        #76:#77       // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #76 = Utf8               getAttributes
   #77 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
   #78 = String             #79           // ID
   #79 = Utf8               ID
   #80 = InterfaceMethodref #81.#82       // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
   #81 = Class              #83           // org/w3c/dom/NamedNodeMap
   #82 = NameAndType        #84:#85       // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
   #83 = Utf8               org/w3c/dom/NamedNodeMap
   #84 = Utf8               getNamedItem
   #85 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
   #86 = InterfaceMethodref #60.#87       // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
   #87 = NameAndType        #88:#67       // getNodeValue:()Ljava/lang/String;
   #88 = Utf8               getNodeValue
   #89 = Methodref          #90.#91       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #90 = Class              #92           // java/lang/Integer
   #91 = NameAndType        #93:#94       // parseInt:(Ljava/lang/String;)I
   #92 = Utf8               java/lang/Integer
   #93 = Utf8               parseInt
   #94 = Utf8               (Ljava/lang/String;)I
   #95 = String             #96           // PlayerLevel
   #96 = Utf8               PlayerLevel
   #97 = Class              #98           // ext/mods/CapsuleBox/CapsuleBoxItem
   #98 = Utf8               ext/mods/CapsuleBox/CapsuleBoxItem
   #99 = Methodref          #97.#100      // ext/mods/CapsuleBox/CapsuleBoxItem."<init>":(II)V
  #100 = NameAndType        #5:#101       // "<init>":(II)V
  #101 = Utf8               (II)V
  #102 = String             #103          // item
  #103 = Utf8               item
  #104 = String             #105          // itemId
  #105 = Utf8               itemId
  #106 = String             #107          // min
  #107 = Utf8               min
  #108 = String             #109          // max
  #109 = Utf8               max
  #110 = Methodref          #11.#111      // ext/mods/CapsuleBox/CapsuleBoxData.getRandomAmount:(II)I
  #111 = NameAndType        #112:#113     // getRandomAmount:(II)I
  #112 = Utf8               getRandomAmount
  #113 = Utf8               (II)I
  #114 = String             #115          // enchantLevel
  #115 = Utf8               enchantLevel
  #116 = String             #117          // chance
  #117 = Utf8               chance
  #118 = Class              #119          // ext/mods/CapsuleBox/CapsuleBoxItem$Item
  #119 = Utf8               ext/mods/CapsuleBox/CapsuleBoxItem$Item
  #120 = Methodref          #118.#121     // ext/mods/CapsuleBox/CapsuleBoxItem$Item."<init>":(IIII)V
  #121 = NameAndType        #5:#122       // "<init>":(IIII)V
  #122 = Utf8               (IIII)V
  #123 = Methodref          #97.#124      // ext/mods/CapsuleBox/CapsuleBoxItem.addItem:(Lext/mods/CapsuleBox/CapsuleBoxItem$Item;)V
  #124 = NameAndType        #125:#126     // addItem:(Lext/mods/CapsuleBox/CapsuleBoxItem$Item;)V
  #125 = Utf8               addItem
  #126 = Utf8               (Lext/mods/CapsuleBox/CapsuleBoxItem$Item;)V
  #127 = InterfaceMethodref #60.#128      // org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
  #128 = NameAndType        #129:#58      // getNextSibling:()Lorg/w3c/dom/Node;
  #129 = Utf8               getNextSibling
  #130 = Methodref          #90.#131      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #131 = NameAndType        #132:#133     // valueOf:(I)Ljava/lang/Integer;
  #132 = Utf8               valueOf
  #133 = Utf8               (I)Ljava/lang/Integer;
  #134 = InterfaceMethodref #20.#135      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #135 = NameAndType        #136:#137     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #136 = Utf8               put
  #137 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #138 = Class              #139          // java/lang/Exception
  #139 = Utf8               java/lang/Exception
  #140 = Methodref          #138.#141     // java/lang/Exception.printStackTrace:()V
  #141 = NameAndType        #142:#6       // printStackTrace:()V
  #142 = Utf8               printStackTrace
  #143 = InterfaceMethodref #20.#144      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #144 = NameAndType        #145:#146     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #145 = Utf8               get
  #146 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #147 = Methodref          #148.#149     // java/lang/Math.random:()D
  #148 = Class              #150          // java/lang/Math
  #149 = NameAndType        #151:#152     // random:()D
  #150 = Utf8               java/lang/Math
  #151 = Utf8               random
  #152 = Utf8               ()D
  #153 = Utf8               Signature
  #154 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/CapsuleBox/CapsuleBoxItem;>;
  #155 = Utf8               Code
  #156 = Utf8               LineNumberTable
  #157 = Utf8               LocalVariableTable
  #158 = Utf8               this
  #159 = Utf8               reload
  #160 = Utf8               getInstance
  #161 = Utf8               ()Lext/mods/CapsuleBox/CapsuleBoxData;
  #162 = Utf8               parseDocument
  #163 = Utf8               (Lorg/w3c/dom/Document;Ljava/io/File;)V
  #164 = Utf8               I
  #165 = Utf8               itemAttrs
  #166 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #167 = Utf8               amount
  #168 = Utf8               Lext/mods/CapsuleBox/CapsuleBoxItem$Item;
  #169 = Utf8               itemNode
  #170 = Utf8               Lorg/w3c/dom/Node;
  #171 = Utf8               attrs
  #172 = Utf8               id
  #173 = Utf8               playerLevel
  #174 = Utf8               capsuleBoxItem
  #175 = Utf8               Lext/mods/CapsuleBox/CapsuleBoxItem;
  #176 = Utf8               node
  #177 = Utf8               root
  #178 = Utf8               e
  #179 = Utf8               Ljava/lang/Exception;
  #180 = Utf8               doc
  #181 = Utf8               Lorg/w3c/dom/Document;
  #182 = Utf8               file
  #183 = Utf8               Ljava/io/File;
  #184 = Utf8               StackMapTable
  #185 = Class              #186          // java/io/File
  #186 = Utf8               java/io/File
  #187 = Utf8               getCapsuleBoxItems
  #188 = Utf8               ()Ljava/util/Map;
  #189 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/CapsuleBox/CapsuleBoxItem;>;
  #190 = Utf8               getCapsuleBoxItemById
  #191 = Utf8               (I)Lext/mods/CapsuleBox/CapsuleBoxItem;
  #192 = Utf8               SourceFile
  #193 = Utf8               CapsuleBoxData.java
  #194 = Utf8               NestMembers
  #195 = Utf8               BootstrapMethods
  #196 = String             #197          // CapsuleBoxData: Loaded \u0001 items.
  #197 = Utf8               CapsuleBoxData: Loaded \u0001 items.
  #198 = MethodHandle       6:#199        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #199 = Methodref          #200.#201     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #200 = Class              #202          // java/lang/invoke/StringConcatFactory
  #201 = NameAndType        #46:#203      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #202 = Utf8               java/lang/invoke/StringConcatFactory
  #203 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #204 = Utf8               InnerClasses
  #205 = Utf8               SingletonHolder
  #206 = Utf8               Item
  #207 = Class              #208          // java/lang/invoke/MethodHandles$Lookup
  #208 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #209 = Class              #210          // java/lang/invoke/MethodHandles
  #210 = Utf8               java/lang/invoke/MethodHandles
  #211 = Utf8               Lookup
{
  public ext.mods.CapsuleBox.CapsuleBoxData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/XMLDocument."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field capsuleBoxItems:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 38: 0
        line 39: 4
        line 40: 15
        line 41: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/CapsuleBox/CapsuleBoxData;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field capsuleBoxItems:Ljava/util/Map;
         4: invokeinterface #19,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 45: 0
        line 46: 9
        line 47: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/CapsuleBox/CapsuleBoxData;

  public static ext.mods.CapsuleBox.CapsuleBoxData getInstance();
    descriptor: ()Lext/mods/CapsuleBox/CapsuleBoxData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #24                 // Field ext/mods/CapsuleBox/CapsuleBoxData$SingletonHolder.INSTANCE:Lext/mods/CapsuleBox/CapsuleBoxData;
         3: areturn
      LineNumberTable:
        line 51: 0

  protected void load();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ldc           #30                 // String ./data/xml/CapsuleBox.xml
         3: invokevirtual #32                 // Method loadDocument:(Ljava/lang/String;)V
         6: getstatic     #36                 // Field LOG:Ljava/util/logging/Logger;
         9: aload_0
        10: getfield      #10                 // Field capsuleBoxItems:Ljava/util/Map;
        13: invokeinterface #40,  1           // InterfaceMethod java/util/Map.size:()I
        18: invokedynamic #44,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        23: invokevirtual #48                 // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        26: return
      LineNumberTable:
        line 60: 0
        line 61: 6
        line 62: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/CapsuleBox/CapsuleBoxData;

  protected void parseDocument(org.w3c.dom.Document, java.io.File);
    descriptor: (Lorg/w3c/dom/Document;Ljava/io/File;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=16, args_size=3
         0: aload_1
         1: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Document.getFirstChild:()Lorg/w3c/dom/Node;
         6: astore_3
         7: aload_3
         8: invokeinterface #59,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
        13: astore        4
        15: aload         4
        17: ifnull        335
        20: ldc           #62                 // String capsuled_items
        22: aload         4
        24: invokeinterface #64,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        29: invokevirtual #68                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        32: ifne          38
        35: goto          323
        38: aload         4
        40: invokeinterface #74,  1           // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
        45: astore        5
        47: aload         5
        49: ldc           #78                 // String ID
        51: invokeinterface #80,  2           // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        56: invokeinterface #86,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        61: invokestatic  #89                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        64: istore        6
        66: aload         5
        68: ldc           #95                 // String PlayerLevel
        70: invokeinterface #80,  2           // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
        75: invokeinterface #86,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        80: invokestatic  #89                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        83: istore        7
        85: new           #97                 // class ext/mods/CapsuleBox/CapsuleBoxItem
        88: dup
        89: iload         6
        91: iload         7
        93: invokespecial #99                 // Method ext/mods/CapsuleBox/CapsuleBoxItem."<init>":(II)V
        96: astore        8
        98: aload         4
       100: invokeinterface #59,  1           // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
       105: astore        9
       107: aload         9
       109: ifnull        306
       112: ldc           #102                // String item
       114: aload         9
       116: invokeinterface #64,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
       121: invokevirtual #68                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       124: ifne          130
       127: goto          294
       130: aload         9
       132: invokeinterface #74,  1           // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
       137: astore        10
       139: aload         10
       141: ldc           #104                // String itemId
       143: invokeinterface #80,  2           // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       148: invokeinterface #86,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       153: invokestatic  #89                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       156: istore        11
       158: iconst_1
       159: istore        12
       161: aload         10
       163: ldc           #106                // String min
       165: invokeinterface #80,  2           // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       170: ifnull        232
       173: aload         10
       175: ldc           #108                // String max
       177: invokeinterface #80,  2           // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       182: ifnull        232
       185: aload         10
       187: ldc           #106                // String min
       189: invokeinterface #80,  2           // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       194: invokeinterface #86,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       199: invokestatic  #89                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       202: istore        13
       204: aload         10
       206: ldc           #108                // String max
       208: invokeinterface #80,  2           // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       213: invokeinterface #86,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       218: invokestatic  #89                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       221: istore        14
       223: iload         13
       225: iload         14
       227: invokestatic  #110                // Method getRandomAmount:(II)I
       230: istore        12
       232: aload         10
       234: ldc           #114                // String enchantLevel
       236: invokeinterface #80,  2           // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       241: invokeinterface #86,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       246: invokestatic  #89                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       249: istore        13
       251: aload         10
       253: ldc           #116                // String chance
       255: invokeinterface #80,  2           // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
       260: invokeinterface #86,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
       265: invokestatic  #89                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       268: istore        14
       270: new           #118                // class ext/mods/CapsuleBox/CapsuleBoxItem$Item
       273: dup
       274: iload         11
       276: iload         12
       278: iload         13
       280: iload         14
       282: invokespecial #120                // Method ext/mods/CapsuleBox/CapsuleBoxItem$Item."<init>":(IIII)V
       285: astore        15
       287: aload         8
       289: aload         15
       291: invokevirtual #123                // Method ext/mods/CapsuleBox/CapsuleBoxItem.addItem:(Lext/mods/CapsuleBox/CapsuleBoxItem$Item;)V
       294: aload         9
       296: invokeinterface #127,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       301: astore        9
       303: goto          107
       306: aload_0
       307: getfield      #10                 // Field capsuleBoxItems:Ljava/util/Map;
       310: iload         6
       312: invokestatic  #130                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       315: aload         8
       317: invokeinterface #134,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       322: pop
       323: aload         4
       325: invokeinterface #127,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       330: astore        4
       332: goto          15
       335: goto          343
       338: astore_3
       339: aload_3
       340: invokevirtual #140                // Method java/lang/Exception.printStackTrace:()V
       343: return
      Exception table:
         from    to  target type
             0   335   338   Class java/lang/Exception
      LineNumberTable:
        line 67: 0
        line 69: 7
        line 70: 20
        line 71: 35
        line 74: 38
        line 75: 47
        line 76: 66
        line 78: 85
        line 80: 98
        line 81: 112
        line 82: 127
        line 85: 130
        line 86: 139
        line 87: 158
        line 88: 161
        line 89: 185
        line 90: 204
        line 91: 223
        line 93: 232
        line 94: 251
        line 96: 270
        line 97: 287
        line 80: 294
        line 100: 306
        line 69: 323
        line 104: 335
        line 102: 338
        line 103: 339
        line 105: 343
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          204      28    13   min   I
          223       9    14   max   I
          139     155    10 itemAttrs   Lorg/w3c/dom/NamedNodeMap;
          158     136    11 itemId   I
          161     133    12 amount   I
          251      43    13 enchantLevel   I
          270      24    14 chance   I
          287       7    15  item   Lext/mods/CapsuleBox/CapsuleBoxItem$Item;
          107     199     9 itemNode   Lorg/w3c/dom/Node;
           47     276     5 attrs   Lorg/w3c/dom/NamedNodeMap;
           66     257     6    id   I
           85     238     7 playerLevel   I
           98     225     8 capsuleBoxItem   Lext/mods/CapsuleBox/CapsuleBoxItem;
           15     320     4  node   Lorg/w3c/dom/Node;
            7     328     3  root   Lorg/w3c/dom/Node;
          339       4     3     e   Ljava/lang/Exception;
            0     344     0  this   Lext/mods/CapsuleBox/CapsuleBoxData;
            0     344     1   doc   Lorg/w3c/dom/Document;
            0     344     2  file   Ljava/io/File;
      StackMapTable: number_of_entries = 11
        frame_type = 253 /* append */
          offset_delta = 15
          locals = [ class org/w3c/dom/Node, class org/w3c/dom/Node ]
        frame_type = 22 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/CapsuleBox/CapsuleBoxData, class org/w3c/dom/Document, class java/io/File, class org/w3c/dom/Node, class org/w3c/dom/Node, class org/w3c/dom/NamedNodeMap, int, int, class ext/mods/CapsuleBox/CapsuleBoxItem, class org/w3c/dom/Node ]
          stack = []
        frame_type = 22 /* same */
        frame_type = 254 /* append */
          offset_delta = 101
          locals = [ class org/w3c/dom/NamedNodeMap, int, int ]
        frame_type = 248 /* chop */
          offset_delta = 61
        frame_type = 250 /* chop */
          offset_delta = 11
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/CapsuleBox/CapsuleBoxData, class org/w3c/dom/Document, class java/io/File, class org/w3c/dom/Node, class org/w3c/dom/Node ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 11
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 4 /* same */

  public java.util.Map<java.lang.Integer, ext.mods.CapsuleBox.CapsuleBoxItem> getCapsuleBoxItems();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field capsuleBoxItems:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/CapsuleBox/CapsuleBoxData;
    Signature: #189                         // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/CapsuleBox/CapsuleBoxItem;>;

  public ext.mods.CapsuleBox.CapsuleBoxItem getCapsuleBoxItemById(int);
    descriptor: (I)Lext/mods/CapsuleBox/CapsuleBoxItem;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field capsuleBoxItems:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #130                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #143,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #97                 // class ext/mods/CapsuleBox/CapsuleBoxItem
        16: areturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/CapsuleBox/CapsuleBoxData;
            0      17     1    id   I
}
SourceFile: "CapsuleBoxData.java"
NestMembers:
  ext/mods/CapsuleBox/CapsuleBoxData$SingletonHolder
BootstrapMethods:
  0: #198 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #196 CapsuleBoxData: Loaded \u0001 items.
InnerClasses:
  public static #206= #118 of #97;        // Item=class ext/mods/CapsuleBox/CapsuleBoxItem$Item of class ext/mods/CapsuleBox/CapsuleBoxItem
  public static final #211= #207 of #209; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
