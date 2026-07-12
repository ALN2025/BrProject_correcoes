// Bytecode for: ext.mods.XMLDocument
// File: ext\mods\XMLDocument.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/XMLDocument.class
  Last modified 9 de jul de 2026; size 4715 bytes
  MD5 checksum 5bf097a688ea3cdf03a394c9bfec8cd7
  Compiled from "XMLDocument.java"
public abstract class ext.mods.XMLDocument
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #13                         // ext/mods/XMLDocument
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 9, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/io/File
    #8 = Utf8               java/io/File
    #9 = Methodref          #7.#10        // java/io/File."<init>":(Ljava/lang/String;)V
   #10 = NameAndType        #5:#11        // "<init>":(Ljava/lang/String;)V
   #11 = Utf8               (Ljava/lang/String;)V
   #12 = Methodref          #13.#14       // ext/mods/XMLDocument.loadDocument:(Ljava/io/File;)V
   #13 = Class              #15           // ext/mods/XMLDocument
   #14 = NameAndType        #16:#17       // loadDocument:(Ljava/io/File;)V
   #15 = Utf8               ext/mods/XMLDocument
   #16 = Utf8               loadDocument
   #17 = Utf8               (Ljava/io/File;)V
   #18 = Methodref          #19.#20       // javax/xml/transform/TransformerFactory.newInstance:()Ljavax/xml/transform/TransformerFactory;
   #19 = Class              #21           // javax/xml/transform/TransformerFactory
   #20 = NameAndType        #22:#23       // newInstance:()Ljavax/xml/transform/TransformerFactory;
   #21 = Utf8               javax/xml/transform/TransformerFactory
   #22 = Utf8               newInstance
   #23 = Utf8               ()Ljavax/xml/transform/TransformerFactory;
   #24 = Methodref          #19.#25       // javax/xml/transform/TransformerFactory.newTransformer:()Ljavax/xml/transform/Transformer;
   #25 = NameAndType        #26:#27       // newTransformer:()Ljavax/xml/transform/Transformer;
   #26 = Utf8               newTransformer
   #27 = Utf8               ()Ljavax/xml/transform/Transformer;
   #28 = Class              #29           // javax/xml/transform/OutputKeys
   #29 = Utf8               javax/xml/transform/OutputKeys
   #30 = String             #31           // encoding
   #31 = Utf8               encoding
   #32 = String             #33           // UTF-8
   #33 = Utf8               UTF-8
   #34 = Methodref          #35.#36       // javax/xml/transform/Transformer.setOutputProperty:(Ljava/lang/String;Ljava/lang/String;)V
   #35 = Class              #37           // javax/xml/transform/Transformer
   #36 = NameAndType        #38:#39       // setOutputProperty:(Ljava/lang/String;Ljava/lang/String;)V
   #37 = Utf8               javax/xml/transform/Transformer
   #38 = Utf8               setOutputProperty
   #39 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #40 = String             #41           // indent
   #41 = Utf8               indent
   #42 = String             #43           // yes
   #43 = Utf8               yes
   #44 = String             #45           // {http://xml.apache.org/xslt}indent-amount
   #45 = Utf8               {http://xml.apache.org/xslt}indent-amount
   #46 = String             #47           // 2
   #47 = Utf8               2
   #48 = Class              #49           // javax/xml/transform/dom/DOMSource
   #49 = Utf8               javax/xml/transform/dom/DOMSource
   #50 = Methodref          #48.#51       // javax/xml/transform/dom/DOMSource."<init>":(Lorg/w3c/dom/Node;)V
   #51 = NameAndType        #5:#52        // "<init>":(Lorg/w3c/dom/Node;)V
   #52 = Utf8               (Lorg/w3c/dom/Node;)V
   #53 = Class              #54           // javax/xml/transform/stream/StreamResult
   #54 = Utf8               javax/xml/transform/stream/StreamResult
   #55 = Methodref          #53.#56       // javax/xml/transform/stream/StreamResult."<init>":(Ljava/io/File;)V
   #56 = NameAndType        #5:#17        // "<init>":(Ljava/io/File;)V
   #57 = Methodref          #35.#58       // javax/xml/transform/Transformer.transform:(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
   #58 = NameAndType        #59:#60       // transform:(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
   #59 = Utf8               transform
   #60 = Utf8               (Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
   #61 = Fieldref           #13.#62       // ext/mods/XMLDocument.LOG:Ljava/util/logging/Logger;
   #62 = NameAndType        #63:#64       // LOG:Ljava/util/logging/Logger;
   #63 = Utf8               LOG
   #64 = Utf8               Ljava/util/logging/Logger;
   #65 = InvokeDynamic      #0:#66        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #66 = NameAndType        #67:#68       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #67 = Utf8               makeConcatWithConstants
   #68 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #69 = Methodref          #70.#71       // java/util/logging/Logger.info:(Ljava/lang/String;)V
   #70 = Class              #72           // java/util/logging/Logger
   #71 = NameAndType        #73:#11       // info:(Ljava/lang/String;)V
   #72 = Utf8               java/util/logging/Logger
   #73 = Utf8               info
   #74 = Class              #75           // javax/xml/transform/TransformerException
   #75 = Utf8               javax/xml/transform/TransformerException
   #76 = Methodref          #74.#77       // javax/xml/transform/TransformerException.getMessage:()Ljava/lang/String;
   #77 = NameAndType        #78:#79       // getMessage:()Ljava/lang/String;
   #78 = Utf8               getMessage
   #79 = Utf8               ()Ljava/lang/String;
   #80 = InvokeDynamic      #1:#66        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #81 = Methodref          #70.#82       // java/util/logging/Logger.warning:(Ljava/lang/String;)V
   #82 = NameAndType        #83:#11       // warning:(Ljava/lang/String;)V
   #83 = Utf8               warning
   #84 = Methodref          #7.#85        // java/io/File.exists:()Z
   #85 = NameAndType        #86:#87       // exists:()Z
   #86 = Utf8               exists
   #87 = Utf8               ()Z
   #88 = Methodref          #7.#89        // java/io/File.getName:()Ljava/lang/String;
   #89 = NameAndType        #90:#79       // getName:()Ljava/lang/String;
   #90 = Utf8               getName
   #91 = InvokeDynamic      #2:#66        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #92 = Methodref          #70.#93       // java/util/logging/Logger.severe:(Ljava/lang/String;)V
   #93 = NameAndType        #94:#11       // severe:(Ljava/lang/String;)V
   #94 = Utf8               severe
   #95 = Methodref          #7.#96        // java/io/File.isDirectory:()Z
   #96 = NameAndType        #97:#87       // isDirectory:()Z
   #97 = Utf8               isDirectory
   #98 = Methodref          #7.#99        // java/io/File.listFiles:()[Ljava/io/File;
   #99 = NameAndType        #100:#101     // listFiles:()[Ljava/io/File;
  #100 = Utf8               listFiles
  #101 = Utf8               ()[Ljava/io/File;
  #102 = Methodref          #7.#103       // java/io/File.isFile:()Z
  #103 = NameAndType        #104:#87      // isFile:()Z
  #104 = Utf8               isFile
  #105 = Fieldref           #13.#106      // ext/mods/XMLDocument.BUILDER:Ljavax/xml/parsers/DocumentBuilderFactory;
  #106 = NameAndType        #107:#108     // BUILDER:Ljavax/xml/parsers/DocumentBuilderFactory;
  #107 = Utf8               BUILDER
  #108 = Utf8               Ljavax/xml/parsers/DocumentBuilderFactory;
  #109 = Methodref          #110.#111     // javax/xml/parsers/DocumentBuilderFactory.newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
  #110 = Class              #112          // javax/xml/parsers/DocumentBuilderFactory
  #111 = NameAndType        #113:#114     // newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
  #112 = Utf8               javax/xml/parsers/DocumentBuilderFactory
  #113 = Utf8               newDocumentBuilder
  #114 = Utf8               ()Ljavax/xml/parsers/DocumentBuilder;
  #115 = Methodref          #116.#117     // javax/xml/parsers/DocumentBuilder.parse:(Ljava/io/File;)Lorg/w3c/dom/Document;
  #116 = Class              #118          // javax/xml/parsers/DocumentBuilder
  #117 = NameAndType        #119:#120     // parse:(Ljava/io/File;)Lorg/w3c/dom/Document;
  #118 = Utf8               javax/xml/parsers/DocumentBuilder
  #119 = Utf8               parse
  #120 = Utf8               (Ljava/io/File;)Lorg/w3c/dom/Document;
  #121 = Methodref          #13.#122      // ext/mods/XMLDocument.parseDocument:(Lorg/w3c/dom/Document;Ljava/io/File;)V
  #122 = NameAndType        #123:#124     // parseDocument:(Lorg/w3c/dom/Document;Ljava/io/File;)V
  #123 = Utf8               parseDocument
  #124 = Utf8               (Lorg/w3c/dom/Document;Ljava/io/File;)V
  #125 = Class              #126          // java/lang/Exception
  #126 = Utf8               java/lang/Exception
  #127 = Fieldref           #128.#129     // java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
  #128 = Class              #130          // java/util/logging/Level
  #129 = NameAndType        #131:#132     // SEVERE:Ljava/util/logging/Level;
  #130 = Utf8               java/util/logging/Level
  #131 = Utf8               SEVERE
  #132 = Utf8               Ljava/util/logging/Level;
  #133 = InvokeDynamic      #3:#66        // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #134 = Methodref          #70.#135      // java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
  #135 = NameAndType        #136:#137     // log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
  #136 = Utf8               log
  #137 = Utf8               (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
  #138 = Fieldref           #13.#139      // ext/mods/XMLDocument.document:Lorg/w3c/dom/Document;
  #139 = NameAndType        #140:#141     // document:Lorg/w3c/dom/Document;
  #140 = Utf8               document
  #141 = Utf8               Lorg/w3c/dom/Document;
  #142 = InterfaceMethodref #143.#144     // org/w3c/dom/NamedNodeMap.getLength:()I
  #143 = Class              #145          // org/w3c/dom/NamedNodeMap
  #144 = NameAndType        #146:#147     // getLength:()I
  #145 = Utf8               org/w3c/dom/NamedNodeMap
  #146 = Utf8               getLength
  #147 = Utf8               ()I
  #148 = InterfaceMethodref #143.#149     // org/w3c/dom/NamedNodeMap.item:(I)Lorg/w3c/dom/Node;
  #149 = NameAndType        #150:#151     // item:(I)Lorg/w3c/dom/Node;
  #150 = Utf8               item
  #151 = Utf8               (I)Lorg/w3c/dom/Node;
  #152 = InterfaceMethodref #153.#154     // org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
  #153 = Class              #155          // org/w3c/dom/Node
  #154 = NameAndType        #156:#79      // getNodeName:()Ljava/lang/String;
  #155 = Utf8               org/w3c/dom/Node
  #156 = Utf8               getNodeName
  #157 = InterfaceMethodref #153.#158     // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
  #158 = NameAndType        #159:#79      // getNodeValue:()Ljava/lang/String;
  #159 = Utf8               getNodeValue
  #160 = Methodref          #161.#162     // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
  #161 = Class              #163          // ext/mods/commons/data/StatSet
  #162 = NameAndType        #164:#39      // set:(Ljava/lang/String;Ljava/lang/String;)V
  #163 = Utf8               ext/mods/commons/data/StatSet
  #164 = Utf8               set
  #165 = Methodref          #166.#89      // java/lang/Class.getName:()Ljava/lang/String;
  #166 = Class              #167          // java/lang/Class
  #167 = Utf8               java/lang/Class
  #168 = Methodref          #70.#169      // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #169 = NameAndType        #170:#171     // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #170 = Utf8               getLogger
  #171 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
  #172 = Methodref          #110.#173     // javax/xml/parsers/DocumentBuilderFactory.newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
  #173 = NameAndType        #22:#174      // newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
  #174 = Utf8               ()Ljavax/xml/parsers/DocumentBuilderFactory;
  #175 = Methodref          #110.#176     // javax/xml/parsers/DocumentBuilderFactory.setValidating:(Z)V
  #176 = NameAndType        #177:#178     // setValidating:(Z)V
  #177 = Utf8               setValidating
  #178 = Utf8               (Z)V
  #179 = Methodref          #110.#180     // javax/xml/parsers/DocumentBuilderFactory.setIgnoringComments:(Z)V
  #180 = NameAndType        #181:#178     // setIgnoringComments:(Z)V
  #181 = Utf8               setIgnoringComments
  #182 = Utf8               Code
  #183 = Utf8               LineNumberTable
  #184 = Utf8               LocalVariableTable
  #185 = Utf8               this
  #186 = Utf8               Lext/mods/XMLDocument;
  #187 = Utf8               load
  #188 = Utf8               filePath
  #189 = Utf8               Ljava/lang/String;
  #190 = Utf8               writeDocument
  #191 = Utf8               (Lorg/w3c/dom/Document;Ljava/lang/String;)V
  #192 = Utf8               transformerFactory
  #193 = Utf8               Ljavax/xml/transform/TransformerFactory;
  #194 = Utf8               transformer
  #195 = Utf8               Ljavax/xml/transform/Transformer;
  #196 = Utf8               source
  #197 = Utf8               Ljavax/xml/transform/dom/DOMSource;
  #198 = Utf8               result
  #199 = Utf8               Ljavax/xml/transform/stream/StreamResult;
  #200 = Utf8               e
  #201 = Utf8               Ljavax/xml/transform/TransformerException;
  #202 = Utf8               doc
  #203 = Utf8               fileName
  #204 = Utf8               StackMapTable
  #205 = Utf8               f
  #206 = Utf8               Ljava/io/File;
  #207 = Utf8               Ljava/lang/Exception;
  #208 = Utf8               file
  #209 = Class              #210          // "[Ljava/io/File;"
  #210 = Utf8               [Ljava/io/File;
  #211 = Utf8               getDocument
  #212 = Utf8               ()Lorg/w3c/dom/Document;
  #213 = Utf8               parseAndFeed
  #214 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Lext/mods/commons/data/StatSet;)V
  #215 = Utf8               attr
  #216 = Utf8               Lorg/w3c/dom/Node;
  #217 = Utf8               i
  #218 = Utf8               I
  #219 = Utf8               attrs
  #220 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #221 = Utf8               Lext/mods/commons/data/StatSet;
  #222 = Utf8               <clinit>
  #223 = Utf8               SourceFile
  #224 = Utf8               XMLDocument.java
  #225 = Utf8               BootstrapMethods
  #226 = String             #227          // XML file saved to \u0001
  #227 = Utf8               XML file saved to \u0001
  #228 = String             #229          // Error saving XML file: \u0001
  #229 = Utf8               Error saving XML file: \u0001
  #230 = String             #231          // The following file or directory doesn\'t exist: \u0001
  #231 = Utf8               The following file or directory doesn\'t exist: \u0001
  #232 = String             #233          // Error loading XML file \u0001
  #233 = Utf8               Error loading XML file \u0001
  #234 = MethodHandle       6:#235        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #235 = Methodref          #236.#237     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #236 = Class              #238          // java/lang/invoke/StringConcatFactory
  #237 = NameAndType        #67:#239      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #238 = Utf8               java/lang/invoke/StringConcatFactory
  #239 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #240 = Utf8               InnerClasses
  #241 = Class              #242          // java/lang/invoke/MethodHandles$Lookup
  #242 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #243 = Class              #244          // java/lang/invoke/MethodHandles
  #244 = Utf8               java/lang/invoke/MethodHandles
  #245 = Utf8               Lookup
{
  protected static final java.util.logging.Logger LOG;
    descriptor: Ljava/util/logging/Logger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  protected org.w3c.dom.Document document;
    descriptor: Lorg/w3c/dom/Document;
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.XMLDocument();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/XMLDocument;

  protected abstract void load();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void parseDocument(org.w3c.dom.Document, java.io.File);
    descriptor: (Lorg/w3c/dom/Document;Ljava/io/File;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  public void loadDocument(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: new           #7                  // class java/io/File
         4: dup
         5: aload_1
         6: invokespecial #9                  // Method java/io/File."<init>":(Ljava/lang/String;)V
         9: invokevirtual #12                 // Method loadDocument:(Ljava/io/File;)V
        12: return
      LineNumberTable:
        line 65: 0
        line 66: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/XMLDocument;
            0      13     1 filePath   Ljava/lang/String;

  public void writeDocument(org.w3c.dom.Document, java.lang.String);
    descriptor: (Lorg/w3c/dom/Document;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=3
         0: invokestatic  #18                 // Method javax/xml/transform/TransformerFactory.newInstance:()Ljavax/xml/transform/TransformerFactory;
         3: astore_3
         4: aload_3
         5: invokevirtual #24                 // Method javax/xml/transform/TransformerFactory.newTransformer:()Ljavax/xml/transform/Transformer;
         8: astore        4
        10: aload         4
        12: ldc           #30                 // String encoding
        14: ldc           #32                 // String UTF-8
        16: invokevirtual #34                 // Method javax/xml/transform/Transformer.setOutputProperty:(Ljava/lang/String;Ljava/lang/String;)V
        19: aload         4
        21: ldc           #40                 // String indent
        23: ldc           #42                 // String yes
        25: invokevirtual #34                 // Method javax/xml/transform/Transformer.setOutputProperty:(Ljava/lang/String;Ljava/lang/String;)V
        28: aload         4
        30: ldc           #44                 // String {http://xml.apache.org/xslt}indent-amount
        32: ldc           #46                 // String 2
        34: invokevirtual #34                 // Method javax/xml/transform/Transformer.setOutputProperty:(Ljava/lang/String;Ljava/lang/String;)V
        37: new           #48                 // class javax/xml/transform/dom/DOMSource
        40: dup
        41: aload_1
        42: invokespecial #50                 // Method javax/xml/transform/dom/DOMSource."<init>":(Lorg/w3c/dom/Node;)V
        45: astore        5
        47: new           #53                 // class javax/xml/transform/stream/StreamResult
        50: dup
        51: new           #7                  // class java/io/File
        54: dup
        55: aload_2
        56: invokespecial #9                  // Method java/io/File."<init>":(Ljava/lang/String;)V
        59: invokespecial #55                 // Method javax/xml/transform/stream/StreamResult."<init>":(Ljava/io/File;)V
        62: astore        6
        64: aload         4
        66: aload         5
        68: aload         6
        70: invokevirtual #57                 // Method javax/xml/transform/Transformer.transform:(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
        73: getstatic     #61                 // Field LOG:Ljava/util/logging/Logger;
        76: aload_2
        77: invokedynamic #65,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        82: invokevirtual #69                 // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        85: goto          104
        88: astore_3
        89: getstatic     #61                 // Field LOG:Ljava/util/logging/Logger;
        92: aload_3
        93: invokevirtual #76                 // Method javax/xml/transform/TransformerException.getMessage:()Ljava/lang/String;
        96: invokedynamic #80,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       101: invokevirtual #81                 // Method java/util/logging/Logger.warning:(Ljava/lang/String;)V
       104: return
      Exception table:
         from    to  target type
             0    85    88   Class javax/xml/transform/TransformerException
      LineNumberTable:
        line 72: 0
        line 73: 4
        line 74: 10
        line 75: 19
        line 76: 28
        line 78: 37
        line 79: 47
        line 81: 64
        line 82: 73
        line 87: 85
        line 84: 88
        line 86: 89
        line 88: 104
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            4      81     3 transformerFactory   Ljavax/xml/transform/TransformerFactory;
           10      75     4 transformer   Ljavax/xml/transform/Transformer;
           47      38     5 source   Ljavax/xml/transform/dom/DOMSource;
           64      21     6 result   Ljavax/xml/transform/stream/StreamResult;
           89      15     3     e   Ljavax/xml/transform/TransformerException;
            0     105     0  this   Lext/mods/XMLDocument;
            0     105     1   doc   Lorg/w3c/dom/Document;
            0     105     2 fileName   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 88
          stack = [ class javax/xml/transform/TransformerException ]
        frame_type = 15 /* same */

  public void loadDocument(java.io.File);
    descriptor: (Ljava/io/File;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=2
         0: aload_1
         1: invokevirtual #84                 // Method java/io/File.exists:()Z
         4: ifne          23
         7: getstatic     #61                 // Field LOG:Ljava/util/logging/Logger;
        10: aload_1
        11: invokevirtual #88                 // Method java/io/File.getName:()Ljava/lang/String;
        14: invokedynamic #91,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        19: invokevirtual #92                 // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
        22: return
        23: aload_1
        24: invokevirtual #95                 // Method java/io/File.isDirectory:()Z
        27: ifeq          68
        30: aload_1
        31: invokevirtual #98                 // Method java/io/File.listFiles:()[Ljava/io/File;
        34: astore_2
        35: aload_2
        36: arraylength
        37: istore_3
        38: iconst_0
        39: istore        4
        41: iload         4
        43: iload_3
        44: if_icmpge     65
        47: aload_2
        48: iload         4
        50: aaload
        51: astore        5
        53: aload_0
        54: aload         5
        56: invokevirtual #12                 // Method loadDocument:(Ljava/io/File;)V
        59: iinc          4, 1
        62: goto          41
        65: goto          113
        68: aload_1
        69: invokevirtual #102                // Method java/io/File.isFile:()Z
        72: ifeq          113
        75: aload_0
        76: getstatic     #105                // Field BUILDER:Ljavax/xml/parsers/DocumentBuilderFactory;
        79: invokevirtual #109                // Method javax/xml/parsers/DocumentBuilderFactory.newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
        82: aload_1
        83: invokevirtual #115                // Method javax/xml/parsers/DocumentBuilder.parse:(Ljava/io/File;)Lorg/w3c/dom/Document;
        86: aload_1
        87: invokevirtual #121                // Method parseDocument:(Lorg/w3c/dom/Document;Ljava/io/File;)V
        90: goto          113
        93: astore_2
        94: getstatic     #61                 // Field LOG:Ljava/util/logging/Logger;
        97: getstatic     #127                // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
       100: aload_1
       101: invokevirtual #88                 // Method java/io/File.getName:()Ljava/lang/String;
       104: invokedynamic #133,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       109: aload_2
       110: invokevirtual #134                // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
       113: return
      Exception table:
         from    to  target type
            75    90    93   Class java/lang/Exception
      LineNumberTable:
        line 96: 0
        line 98: 7
        line 99: 22
        line 102: 23
        line 104: 30
        line 106: 53
        line 104: 59
        line 109: 68
        line 113: 75
        line 118: 90
        line 115: 93
        line 117: 94
        line 120: 113
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53       6     5     f   Ljava/io/File;
           94      19     2     e   Ljava/lang/Exception;
            0     114     0  this   Lext/mods/XMLDocument;
            0     114     1  file   Ljava/io/File;
      StackMapTable: number_of_entries = 6
        frame_type = 23 /* same */
        frame_type = 254 /* append */
          offset_delta = 17
          locals = [ class "[Ljava/io/File;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 23
        frame_type = 2 /* same */
        frame_type = 88 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 19 /* same */

  public org.w3c.dom.Document getDocument();
    descriptor: ()Lorg/w3c/dom/Document;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #138                // Field document:Lorg/w3c/dom/Document;
         4: areturn
      LineNumberTable:
        line 124: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/XMLDocument;

  public static void parseAndFeed(org.w3c.dom.NamedNodeMap, ext.mods.commons.data.StatSet);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Lext/mods/commons/data/StatSet;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=4, args_size=2
         0: iconst_0
         1: istore_2
         2: iload_2
         3: aload_0
         4: invokeinterface #142,  1          // InterfaceMethod org/w3c/dom/NamedNodeMap.getLength:()I
         9: if_icmpge     42
        12: aload_0
        13: iload_2
        14: invokeinterface #148,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.item:(I)Lorg/w3c/dom/Node;
        19: astore_3
        20: aload_1
        21: aload_3
        22: invokeinterface #152,  1          // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        27: aload_3
        28: invokeinterface #157,  1          // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        33: invokevirtual #160                // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
        36: iinc          2, 1
        39: goto          2
        42: return
      LineNumberTable:
        line 134: 0
        line 136: 12
        line 137: 20
        line 134: 36
        line 139: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20      16     3  attr   Lorg/w3c/dom/Node;
            2      40     2     i   I
            0      43     0 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      43     1   set   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 39

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: ldc           #13                 // class ext/mods/XMLDocument
         2: invokevirtual #165                // Method java/lang/Class.getName:()Ljava/lang/String;
         5: invokestatic  #168                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         8: putstatic     #61                 // Field LOG:Ljava/util/logging/Logger;
        11: invokestatic  #172                // Method javax/xml/parsers/DocumentBuilderFactory.newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
        14: putstatic     #105                // Field BUILDER:Ljavax/xml/parsers/DocumentBuilderFactory;
        17: getstatic     #105                // Field BUILDER:Ljavax/xml/parsers/DocumentBuilderFactory;
        20: iconst_0
        21: invokevirtual #175                // Method javax/xml/parsers/DocumentBuilderFactory.setValidating:(Z)V
        24: getstatic     #105                // Field BUILDER:Ljavax/xml/parsers/DocumentBuilderFactory;
        27: iconst_1
        28: invokevirtual #179                // Method javax/xml/parsers/DocumentBuilderFactory.setIgnoringComments:(Z)V
        31: return
      LineNumberTable:
        line 47: 0
        line 54: 11
        line 55: 17
        line 56: 24
        line 57: 31
}
SourceFile: "XMLDocument.java"
BootstrapMethods:
  0: #234 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #226 XML file saved to \u0001
  1: #234 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #228 Error saving XML file: \u0001
  2: #234 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #230 The following file or directory doesn\'t exist: \u0001
  3: #234 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #232 Error loading XML file \u0001
InnerClasses:
  public static final #245= #241 of #243; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
