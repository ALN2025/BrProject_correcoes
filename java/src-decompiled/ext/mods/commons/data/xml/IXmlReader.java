// Bytecode for: ext.mods.commons.data.xml.IXmlReader
// File: ext\mods\commons\data\xml\IXmlReader.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/data/xml/IXmlReader.class
  Last modified 9 de jul de 2026; size 20455 bytes
  MD5 checksum e32686cd6d963338e01ac8feea3b57ce
  Compiled from "IXmlReader.java"
public interface ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #14                         // ext/mods/commons/data/xml/IXmlReader
  super_class: #109                       // java/lang/Object
  interfaces: 0, fields: 3, methods: 64, attributes: 4
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
    #2 = Class              #4            // ext/mods/Config
    #3 = NameAndType        #5:#6         // DATA_PATH:Ljava/nio/file/Path;
    #4 = Utf8               ext/mods/Config
    #5 = Utf8               DATA_PATH
    #6 = Utf8               Ljava/nio/file/Path;
    #7 = InterfaceMethodref #8.#9         // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
    #8 = Class              #10           // java/nio/file/Path
    #9 = NameAndType        #11:#12       // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
   #10 = Utf8               java/nio/file/Path
   #11 = Utf8               resolve
   #12 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
   #13 = InterfaceMethodref #14.#15       // ext/mods/commons/data/xml/IXmlReader.parseFile:(Ljava/nio/file/Path;ZZZ)V
   #14 = Class              #16           // ext/mods/commons/data/xml/IXmlReader
   #15 = NameAndType        #17:#18       // parseFile:(Ljava/nio/file/Path;ZZZ)V
   #16 = Utf8               ext/mods/commons/data/xml/IXmlReader
   #17 = Utf8               parseFile
   #18 = Utf8               (Ljava/nio/file/Path;ZZZ)V
   #19 = Class              #20           // java/lang/String
   #20 = Utf8               java/lang/String
   #21 = Methodref          #22.#23       // java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #22 = Class              #24           // java/nio/file/Paths
   #23 = NameAndType        #25:#26       // get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #24 = Utf8               java/nio/file/Paths
   #25 = Utf8               get
   #26 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #27 = Class              #28           // ext/mods/commons/data/StatSet
   #28 = Utf8               ext/mods/commons/data/StatSet
   #29 = Methodref          #27.#30       // ext/mods/commons/data/StatSet."<init>":()V
   #30 = NameAndType        #31:#32       // "<init>":()V
   #31 = Utf8               <init>
   #32 = Utf8               ()V
   #33 = InterfaceMethodref #34.#35       // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #34 = Class              #36           // org/w3c/dom/Node
   #35 = NameAndType        #37:#38       // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #36 = Utf8               org/w3c/dom/Node
   #37 = Utf8               getAttributes
   #38 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
   #39 = InterfaceMethodref #40.#41       // org/w3c/dom/NamedNodeMap.getLength:()I
   #40 = Class              #42           // org/w3c/dom/NamedNodeMap
   #41 = NameAndType        #43:#44       // getLength:()I
   #42 = Utf8               org/w3c/dom/NamedNodeMap
   #43 = Utf8               getLength
   #44 = Utf8               ()I
   #45 = InterfaceMethodref #40.#46       // org/w3c/dom/NamedNodeMap.item:(I)Lorg/w3c/dom/Node;
   #46 = NameAndType        #47:#48       // item:(I)Lorg/w3c/dom/Node;
   #47 = Utf8               item
   #48 = Utf8               (I)Lorg/w3c/dom/Node;
   #49 = InterfaceMethodref #34.#50       // org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
   #50 = NameAndType        #51:#52       // getNodeName:()Ljava/lang/String;
   #51 = Utf8               getNodeName
   #52 = Utf8               ()Ljava/lang/String;
   #53 = InterfaceMethodref #34.#54       // org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
   #54 = NameAndType        #55:#52       // getNodeValue:()Ljava/lang/String;
   #55 = Utf8               getNodeValue
   #56 = Methodref          #27.#57       // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
   #57 = NameAndType        #58:#59       // set:(Ljava/lang/String;Ljava/lang/String;)V
   #58 = Utf8               set
   #59 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #60 = Class              #61           // java/nio/file/LinkOption
   #61 = Utf8               java/nio/file/LinkOption
   #62 = Methodref          #63.#64       // java/nio/file/Files.isDirectory:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
   #63 = Class              #65           // java/nio/file/Files
   #64 = NameAndType        #66:#67       // isDirectory:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
   #65 = Utf8               java/nio/file/Files
   #66 = Utf8               isDirectory
   #67 = Utf8               (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
   #68 = Class              #69           // it/unimi/dsi/fastutil/objects/ObjectArrayList
   #69 = Utf8               it/unimi/dsi/fastutil/objects/ObjectArrayList
   #70 = Methodref          #68.#30       // it/unimi/dsi/fastutil/objects/ObjectArrayList."<init>":()V
   #71 = Class              #72           // java/nio/file/FileVisitOption
   #72 = Utf8               java/nio/file/FileVisitOption
   #73 = Methodref          #74.#75       // java/util/EnumSet.noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;
   #74 = Class              #76           // java/util/EnumSet
   #75 = NameAndType        #77:#78       // noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;
   #76 = Utf8               java/util/EnumSet
   #77 = Utf8               noneOf
   #78 = Utf8               (Ljava/lang/Class;)Ljava/util/EnumSet;
   #79 = Class              #80           // java/lang/Integer
   #80 = Utf8               java/lang/Integer
   #81 = Integer            2147483647
   #82 = Class              #83           // ext/mods/commons/data/xml/IXmlReader$1
   #83 = Utf8               ext/mods/commons/data/xml/IXmlReader$1
   #84 = Methodref          #82.#85       // ext/mods/commons/data/xml/IXmlReader$1."<init>":(Lext/mods/commons/data/xml/IXmlReader;Ljava/util/List;)V
   #85 = NameAndType        #31:#86       // "<init>":(Lext/mods/commons/data/xml/IXmlReader;Ljava/util/List;)V
   #86 = Utf8               (Lext/mods/commons/data/xml/IXmlReader;Ljava/util/List;)V
   #87 = Methodref          #63.#88       // java/nio/file/Files.walkFileTree:(Ljava/nio/file/Path;Ljava/util/Set;ILjava/nio/file/FileVisitor;)Ljava/nio/file/Path;
   #88 = NameAndType        #89:#90       // walkFileTree:(Ljava/nio/file/Path;Ljava/util/Set;ILjava/nio/file/FileVisitor;)Ljava/nio/file/Path;
   #89 = Utf8               walkFileTree
   #90 = Utf8               (Ljava/nio/file/Path;Ljava/util/Set;ILjava/nio/file/FileVisitor;)Ljava/nio/file/Path;
   #91 = InvokeDynamic      #0:#92        // #0:accept:(Lext/mods/commons/data/xml/IXmlReader;ZZZ)Ljava/util/function/Consumer;
   #92 = NameAndType        #93:#94       // accept:(Lext/mods/commons/data/xml/IXmlReader;ZZZ)Ljava/util/function/Consumer;
   #93 = Utf8               accept
   #94 = Utf8               (Lext/mods/commons/data/xml/IXmlReader;ZZZ)Ljava/util/function/Consumer;
   #95 = InterfaceMethodref #96.#97       // java/util/List.forEach:(Ljava/util/function/Consumer;)V
   #96 = Class              #98           // java/util/List
   #97 = NameAndType        #99:#100      // forEach:(Ljava/util/function/Consumer;)V
   #98 = Utf8               java/util/List
   #99 = Utf8               forEach
  #100 = Utf8               (Ljava/util/function/Consumer;)V
  #101 = Class              #102          // java/io/IOException
  #102 = Utf8               java/io/IOException
  #103 = Fieldref           #14.#104      // ext/mods/commons/data/xml/IXmlReader.LOGGER:Lext/mods/commons/logging/CLogger;
  #104 = NameAndType        #105:#106     // LOGGER:Lext/mods/commons/logging/CLogger;
  #105 = Utf8               LOGGER
  #106 = Utf8               Lext/mods/commons/logging/CLogger;
  #107 = String             #108          // Could not parse directory: {}
  #108 = Utf8               Could not parse directory: {}
  #109 = Class              #110          // java/lang/Object
  #110 = Utf8               java/lang/Object
  #111 = Methodref          #112.#113     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #112 = Class              #114          // ext/mods/commons/logging/CLogger
  #113 = NameAndType        #115:#116     // warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #114 = Utf8               ext/mods/commons/logging/CLogger
  #115 = Utf8               warn
  #116 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #117 = Methodref          #118.#119     // javax/xml/parsers/DocumentBuilderFactory.newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
  #118 = Class              #120          // javax/xml/parsers/DocumentBuilderFactory
  #119 = NameAndType        #121:#122     // newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
  #120 = Utf8               javax/xml/parsers/DocumentBuilderFactory
  #121 = Utf8               newInstance
  #122 = Utf8               ()Ljavax/xml/parsers/DocumentBuilderFactory;
  #123 = Class              #124          // javax/xml/XMLConstants
  #124 = Utf8               javax/xml/XMLConstants
  #125 = String             #126          // http://javax.xml.XMLConstants/property/accessExternalDTD
  #126 = Utf8               http://javax.xml.XMLConstants/property/accessExternalDTD
  #127 = String             #128          //
  #128 = Utf8
  #129 = Methodref          #118.#130     // javax/xml/parsers/DocumentBuilderFactory.setAttribute:(Ljava/lang/String;Ljava/lang/Object;)V
  #130 = NameAndType        #131:#132     // setAttribute:(Ljava/lang/String;Ljava/lang/Object;)V
  #131 = Utf8               setAttribute
  #132 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
  #133 = String             #134          // http://javax.xml.XMLConstants/property/accessExternalSchema
  #134 = Utf8               http://javax.xml.XMLConstants/property/accessExternalSchema
  #135 = Methodref          #118.#136     // javax/xml/parsers/DocumentBuilderFactory.setNamespaceAware:(Z)V
  #136 = NameAndType        #137:#138     // setNamespaceAware:(Z)V
  #137 = Utf8               setNamespaceAware
  #138 = Utf8               (Z)V
  #139 = Methodref          #118.#140     // javax/xml/parsers/DocumentBuilderFactory.setValidating:(Z)V
  #140 = NameAndType        #141:#138     // setValidating:(Z)V
  #141 = Utf8               setValidating
  #142 = Methodref          #118.#143     // javax/xml/parsers/DocumentBuilderFactory.setIgnoringComments:(Z)V
  #143 = NameAndType        #144:#138     // setIgnoringComments:(Z)V
  #144 = Utf8               setIgnoringComments
  #145 = Methodref          #118.#146     // javax/xml/parsers/DocumentBuilderFactory.setIgnoringElementContentWhitespace:(Z)V
  #146 = NameAndType        #147:#138     // setIgnoringElementContentWhitespace:(Z)V
  #147 = Utf8               setIgnoringElementContentWhitespace
  #148 = String             #149          // http://java.sun.com/xml/jaxp/properties/schemaLanguage
  #149 = Utf8               http://java.sun.com/xml/jaxp/properties/schemaLanguage
  #150 = String             #151          // http://www.w3.org/2001/XMLSchema
  #151 = Utf8               http://www.w3.org/2001/XMLSchema
  #152 = Methodref          #118.#153     // javax/xml/parsers/DocumentBuilderFactory.newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
  #153 = NameAndType        #154:#155     // newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
  #154 = Utf8               newDocumentBuilder
  #155 = Utf8               ()Ljavax/xml/parsers/DocumentBuilder;
  #156 = Class              #157          // ext/mods/commons/data/xml/IXmlReader$XMLErrorHandler
  #157 = Utf8               ext/mods/commons/data/xml/IXmlReader$XMLErrorHandler
  #158 = Methodref          #156.#30      // ext/mods/commons/data/xml/IXmlReader$XMLErrorHandler."<init>":()V
  #159 = Methodref          #160.#161     // javax/xml/parsers/DocumentBuilder.setErrorHandler:(Lorg/xml/sax/ErrorHandler;)V
  #160 = Class              #162          // javax/xml/parsers/DocumentBuilder
  #161 = NameAndType        #163:#164     // setErrorHandler:(Lorg/xml/sax/ErrorHandler;)V
  #162 = Utf8               javax/xml/parsers/DocumentBuilder
  #163 = Utf8               setErrorHandler
  #164 = Utf8               (Lorg/xml/sax/ErrorHandler;)V
  #165 = InterfaceMethodref #8.#166       // java/nio/file/Path.toAbsolutePath:()Ljava/nio/file/Path;
  #166 = NameAndType        #167:#168     // toAbsolutePath:()Ljava/nio/file/Path;
  #167 = Utf8               toAbsolutePath
  #168 = Utf8               ()Ljava/nio/file/Path;
  #169 = InterfaceMethodref #8.#170       // java/nio/file/Path.toFile:()Ljava/io/File;
  #170 = NameAndType        #171:#172     // toFile:()Ljava/io/File;
  #171 = Utf8               toFile
  #172 = Utf8               ()Ljava/io/File;
  #173 = Methodref          #160.#174     // javax/xml/parsers/DocumentBuilder.parse:(Ljava/io/File;)Lorg/w3c/dom/Document;
  #174 = NameAndType        #175:#176     // parse:(Ljava/io/File;)Lorg/w3c/dom/Document;
  #175 = Utf8               parse
  #176 = Utf8               (Ljava/io/File;)Lorg/w3c/dom/Document;
  #177 = InterfaceMethodref #14.#178      // ext/mods/commons/data/xml/IXmlReader.parseDocument:(Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #178 = NameAndType        #179:#180     // parseDocument:(Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #179 = Utf8               parseDocument
  #180 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #181 = Class              #182          // org/xml/sax/SAXParseException
  #182 = Utf8               org/xml/sax/SAXParseException
  #183 = String             #184          // Could not parse file: {} at line: {}, column: {} :
  #184 = Utf8               Could not parse file: {} at line: {}, column: {} :
  #185 = Methodref          #181.#186     // org/xml/sax/SAXParseException.getLineNumber:()I
  #186 = NameAndType        #187:#44      // getLineNumber:()I
  #187 = Utf8               getLineNumber
  #188 = Methodref          #79.#189      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #189 = NameAndType        #190:#191     // valueOf:(I)Ljava/lang/Integer;
  #190 = Utf8               valueOf
  #191 = Utf8               (I)Ljava/lang/Integer;
  #192 = Methodref          #181.#193     // org/xml/sax/SAXParseException.getColumnNumber:()I
  #193 = NameAndType        #194:#44      // getColumnNumber:()I
  #194 = Utf8               getColumnNumber
  #195 = Class              #196          // javax/xml/parsers/ParserConfigurationException
  #196 = Utf8               javax/xml/parsers/ParserConfigurationException
  #197 = Class              #198          // org/xml/sax/SAXException
  #198 = Utf8               org/xml/sax/SAXException
  #199 = String             #200          // Could not parse file: {}
  #200 = Utf8               Could not parse file: {}
  #201 = Methodref          #202.#203     // java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
  #202 = Class              #204          // java/lang/Boolean
  #203 = NameAndType        #190:#205     // valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
  #204 = Utf8               java/lang/Boolean
  #205 = Utf8               (Ljava/lang/String;)Ljava/lang/Boolean;
  #206 = InterfaceMethodref #14.#207      // ext/mods/commons/data/xml/IXmlReader.parseBoolean:(Lorg/w3c/dom/Node;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #207 = NameAndType        #208:#209     // parseBoolean:(Lorg/w3c/dom/Node;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #208 = Utf8               parseBoolean
  #209 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #210 = InterfaceMethodref #40.#211      // org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #211 = NameAndType        #212:#213     // getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
  #212 = Utf8               getNamedItem
  #213 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/Node;
  #214 = InterfaceMethodref #14.#215      // ext/mods/commons/data/xml/IXmlReader.parseBoolean:(Lorg/w3c/dom/Node;)Ljava/lang/Boolean;
  #215 = NameAndType        #208:#216     // parseBoolean:(Lorg/w3c/dom/Node;)Ljava/lang/Boolean;
  #216 = Utf8               (Lorg/w3c/dom/Node;)Ljava/lang/Boolean;
  #217 = Methodref          #218.#219     // java/lang/Byte.decode:(Ljava/lang/String;)Ljava/lang/Byte;
  #218 = Class              #220          // java/lang/Byte
  #219 = NameAndType        #221:#222     // decode:(Ljava/lang/String;)Ljava/lang/Byte;
  #220 = Utf8               java/lang/Byte
  #221 = Utf8               decode
  #222 = Utf8               (Ljava/lang/String;)Ljava/lang/Byte;
  #223 = InterfaceMethodref #14.#224      // ext/mods/commons/data/xml/IXmlReader.parseByte:(Lorg/w3c/dom/Node;Ljava/lang/Byte;)Ljava/lang/Byte;
  #224 = NameAndType        #225:#226     // parseByte:(Lorg/w3c/dom/Node;Ljava/lang/Byte;)Ljava/lang/Byte;
  #225 = Utf8               parseByte
  #226 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Byte;)Ljava/lang/Byte;
  #227 = InterfaceMethodref #14.#228      // ext/mods/commons/data/xml/IXmlReader.parseByte:(Lorg/w3c/dom/Node;)Ljava/lang/Byte;
  #228 = NameAndType        #225:#229     // parseByte:(Lorg/w3c/dom/Node;)Ljava/lang/Byte;
  #229 = Utf8               (Lorg/w3c/dom/Node;)Ljava/lang/Byte;
  #230 = Methodref          #231.#232     // java/lang/Short.decode:(Ljava/lang/String;)Ljava/lang/Short;
  #231 = Class              #233          // java/lang/Short
  #232 = NameAndType        #221:#234     // decode:(Ljava/lang/String;)Ljava/lang/Short;
  #233 = Utf8               java/lang/Short
  #234 = Utf8               (Ljava/lang/String;)Ljava/lang/Short;
  #235 = InterfaceMethodref #14.#236      // ext/mods/commons/data/xml/IXmlReader.parseShort:(Lorg/w3c/dom/Node;Ljava/lang/Short;)Ljava/lang/Short;
  #236 = NameAndType        #237:#238     // parseShort:(Lorg/w3c/dom/Node;Ljava/lang/Short;)Ljava/lang/Short;
  #237 = Utf8               parseShort
  #238 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Short;)Ljava/lang/Short;
  #239 = InterfaceMethodref #14.#240      // ext/mods/commons/data/xml/IXmlReader.parseShort:(Lorg/w3c/dom/Node;)Ljava/lang/Short;
  #240 = NameAndType        #237:#241     // parseShort:(Lorg/w3c/dom/Node;)Ljava/lang/Short;
  #241 = Utf8               (Lorg/w3c/dom/Node;)Ljava/lang/Short;
  #242 = Methodref          #79.#243      // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #243 = NameAndType        #221:#244     // decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #244 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #245 = Methodref          #79.#246      // java/lang/Integer.intValue:()I
  #246 = NameAndType        #247:#44      // intValue:()I
  #247 = Utf8               intValue
  #248 = InterfaceMethodref #14.#249      // ext/mods/commons/data/xml/IXmlReader.parseInt:(Lorg/w3c/dom/Node;Ljava/lang/Integer;)I
  #249 = NameAndType        #250:#251     // parseInt:(Lorg/w3c/dom/Node;Ljava/lang/Integer;)I
  #250 = Utf8               parseInt
  #251 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Integer;)I
  #252 = InterfaceMethodref #14.#253      // ext/mods/commons/data/xml/IXmlReader.parseInteger:(Lorg/w3c/dom/Node;Ljava/lang/Integer;)Ljava/lang/Integer;
  #253 = NameAndType        #254:#255     // parseInteger:(Lorg/w3c/dom/Node;Ljava/lang/Integer;)Ljava/lang/Integer;
  #254 = Utf8               parseInteger
  #255 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Integer;)Ljava/lang/Integer;
  #256 = InterfaceMethodref #14.#257      // ext/mods/commons/data/xml/IXmlReader.parseInteger:(Lorg/w3c/dom/Node;)Ljava/lang/Integer;
  #257 = NameAndType        #254:#258     // parseInteger:(Lorg/w3c/dom/Node;)Ljava/lang/Integer;
  #258 = Utf8               (Lorg/w3c/dom/Node;)Ljava/lang/Integer;
  #259 = InterfaceMethodref #14.#260      // ext/mods/commons/data/xml/IXmlReader.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #260 = NameAndType        #254:#261     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #261 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #262 = Methodref          #263.#264     // java/lang/Long.decode:(Ljava/lang/String;)Ljava/lang/Long;
  #263 = Class              #265          // java/lang/Long
  #264 = NameAndType        #221:#266     // decode:(Ljava/lang/String;)Ljava/lang/Long;
  #265 = Utf8               java/lang/Long
  #266 = Utf8               (Ljava/lang/String;)Ljava/lang/Long;
  #267 = InterfaceMethodref #14.#268      // ext/mods/commons/data/xml/IXmlReader.parseLong:(Lorg/w3c/dom/Node;Ljava/lang/Long;)Ljava/lang/Long;
  #268 = NameAndType        #269:#270     // parseLong:(Lorg/w3c/dom/Node;Ljava/lang/Long;)Ljava/lang/Long;
  #269 = Utf8               parseLong
  #270 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Long;)Ljava/lang/Long;
  #271 = InterfaceMethodref #14.#272      // ext/mods/commons/data/xml/IXmlReader.parseLong:(Lorg/w3c/dom/Node;)Ljava/lang/Long;
  #272 = NameAndType        #269:#273     // parseLong:(Lorg/w3c/dom/Node;)Ljava/lang/Long;
  #273 = Utf8               (Lorg/w3c/dom/Node;)Ljava/lang/Long;
  #274 = Methodref          #275.#276     // java/lang/Float.valueOf:(Ljava/lang/String;)Ljava/lang/Float;
  #275 = Class              #277          // java/lang/Float
  #276 = NameAndType        #190:#278     // valueOf:(Ljava/lang/String;)Ljava/lang/Float;
  #277 = Utf8               java/lang/Float
  #278 = Utf8               (Ljava/lang/String;)Ljava/lang/Float;
  #279 = InterfaceMethodref #14.#280      // ext/mods/commons/data/xml/IXmlReader.parseFloat:(Lorg/w3c/dom/Node;Ljava/lang/Float;)Ljava/lang/Float;
  #280 = NameAndType        #281:#282     // parseFloat:(Lorg/w3c/dom/Node;Ljava/lang/Float;)Ljava/lang/Float;
  #281 = Utf8               parseFloat
  #282 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Float;)Ljava/lang/Float;
  #283 = InterfaceMethodref #14.#284      // ext/mods/commons/data/xml/IXmlReader.parseFloat:(Lorg/w3c/dom/Node;)Ljava/lang/Float;
  #284 = NameAndType        #281:#285     // parseFloat:(Lorg/w3c/dom/Node;)Ljava/lang/Float;
  #285 = Utf8               (Lorg/w3c/dom/Node;)Ljava/lang/Float;
  #286 = Methodref          #287.#288     // java/lang/Double.valueOf:(Ljava/lang/String;)Ljava/lang/Double;
  #287 = Class              #289          // java/lang/Double
  #288 = NameAndType        #190:#290     // valueOf:(Ljava/lang/String;)Ljava/lang/Double;
  #289 = Utf8               java/lang/Double
  #290 = Utf8               (Ljava/lang/String;)Ljava/lang/Double;
  #291 = InterfaceMethodref #14.#292      // ext/mods/commons/data/xml/IXmlReader.parseDouble:(Lorg/w3c/dom/Node;Ljava/lang/Double;)Ljava/lang/Double;
  #292 = NameAndType        #293:#294     // parseDouble:(Lorg/w3c/dom/Node;Ljava/lang/Double;)Ljava/lang/Double;
  #293 = Utf8               parseDouble
  #294 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Double;)Ljava/lang/Double;
  #295 = InterfaceMethodref #14.#296      // ext/mods/commons/data/xml/IXmlReader.parseDouble:(Lorg/w3c/dom/Node;)Ljava/lang/Double;
  #296 = NameAndType        #293:#297     // parseDouble:(Lorg/w3c/dom/Node;)Ljava/lang/Double;
  #297 = Utf8               (Lorg/w3c/dom/Node;)Ljava/lang/Double;
  #298 = InterfaceMethodref #14.#299      // ext/mods/commons/data/xml/IXmlReader.parseString:(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;
  #299 = NameAndType        #300:#301     // parseString:(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;
  #300 = Utf8               parseString
  #301 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;
  #302 = InterfaceMethodref #14.#303      // ext/mods/commons/data/xml/IXmlReader.parseString:(Lorg/w3c/dom/Node;)Ljava/lang/String;
  #303 = NameAndType        #300:#304     // parseString:(Lorg/w3c/dom/Node;)Ljava/lang/String;
  #304 = Utf8               (Lorg/w3c/dom/Node;)Ljava/lang/String;
  #305 = Methodref          #306.#307     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #306 = Class              #308          // java/lang/Enum
  #307 = NameAndType        #190:#309     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #308 = Utf8               java/lang/Enum
  #309 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #310 = Class              #311          // java/lang/IllegalArgumentException
  #311 = Utf8               java/lang/IllegalArgumentException
  #312 = String             #313          // Invalid value specified for node: {} specified value: {} should be enum value of \"{}\" using default value: {}
  #313 = Utf8               Invalid value specified for node: {} specified value: {} should be enum value of \"{}\" using default value: {}
  #314 = Methodref          #315.#316     // java/lang/Class.getSimpleName:()Ljava/lang/String;
  #315 = Class              #317          // java/lang/Class
  #316 = NameAndType        #318:#52      // getSimpleName:()Ljava/lang/String;
  #317 = Utf8               java/lang/Class
  #318 = Utf8               getSimpleName
  #319 = Methodref          #112.#320     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #320 = NameAndType        #115:#321     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #321 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #322 = InterfaceMethodref #14.#323      // ext/mods/commons/data/xml/IXmlReader.parseEnum:(Lorg/w3c/dom/Node;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #323 = NameAndType        #324:#325     // parseEnum:(Lorg/w3c/dom/Node;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #324 = Utf8               parseEnum
  #325 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
  #326 = InterfaceMethodref #14.#327      // ext/mods/commons/data/xml/IXmlReader.parseEnum:(Lorg/w3c/dom/Node;Ljava/lang/Class;)Ljava/lang/Enum;
  #327 = NameAndType        #324:#328     // parseEnum:(Lorg/w3c/dom/Node;Ljava/lang/Class;)Ljava/lang/Enum;
  #328 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/Class;)Ljava/lang/Enum;
  #329 = Class              #330          // ext/mods/gameserver/model/location/Point2D
  #330 = Utf8               ext/mods/gameserver/model/location/Point2D
  #331 = String             #332          // x
  #332 = Utf8               x
  #333 = InterfaceMethodref #14.#334      // ext/mods/commons/data/xml/IXmlReader.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #334 = NameAndType        #254:#335     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #335 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #336 = String             #337          // y
  #337 = Utf8               y
  #338 = Methodref          #329.#339     // ext/mods/gameserver/model/location/Point2D."<init>":(II)V
  #339 = NameAndType        #31:#340      // "<init>":(II)V
  #340 = Utf8               (II)V
  #341 = String             #342          // ;
  #342 = Utf8               ;
  #343 = Methodref          #19.#344      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #344 = NameAndType        #345:#346     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #345 = Utf8               split
  #346 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #347 = Class              #348          // ext/mods/gameserver/model/location/Location
  #348 = Utf8               ext/mods/gameserver/model/location/Location
  #349 = Methodref          #79.#350      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #350 = NameAndType        #250:#351     // parseInt:(Ljava/lang/String;)I
  #351 = Utf8               (Ljava/lang/String;)I
  #352 = Methodref          #347.#353     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #353 = NameAndType        #31:#354      // "<init>":(III)V
  #354 = Utf8               (III)V
  #355 = Class              #356          // ext/mods/gameserver/model/location/SpawnLocation
  #356 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #357 = Methodref          #355.#358     // ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
  #358 = NameAndType        #31:#359      // "<init>":(IIII)V
  #359 = Utf8               (IIII)V
  #360 = Class              #361          // ext/mods/gameserver/model/holder/IntIntHolder
  #361 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #362 = Methodref          #360.#339     // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
  #363 = Methodref          #27.#364      // ext/mods/commons/data/StatSet.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #364 = NameAndType        #365:#366     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #365 = Utf8               put
  #366 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #367 = Class              #368          // it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap
  #368 = Utf8               it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap
  #369 = Methodref          #367.#30      // it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap."<init>":()V
  #370 = InterfaceMethodref #34.#371      // org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
  #371 = NameAndType        #372:#373     // getFirstChild:()Lorg/w3c/dom/Node;
  #372 = Utf8               getFirstChild
  #373 = Utf8               ()Lorg/w3c/dom/Node;
  #374 = Methodref          #19.#375      // java/lang/String.toLowerCase:()Ljava/lang/String;
  #375 = NameAndType        #376:#52      // toLowerCase:()Ljava/lang/String;
  #376 = Utf8               toLowerCase
  #377 = Methodref          #19.#378      // java/lang/String.hashCode:()I
  #378 = NameAndType        #379:#44      // hashCode:()I
  #379 = Utf8               hashCode
  #380 = String             #381          // param
  #381 = Utf8               param
  #382 = Methodref          #19.#383      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #383 = NameAndType        #384:#385     // equals:(Ljava/lang/Object;)Z
  #384 = Utf8               equals
  #385 = Utf8               (Ljava/lang/Object;)Z
  #386 = String             #387          // skill
  #387 = Utf8               skill
  #388 = String             #389          // location
  #389 = Utf8               location
  #390 = String             #391          // name
  #391 = Utf8               name
  #392 = InterfaceMethodref #14.#393      // ext/mods/commons/data/xml/IXmlReader.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #393 = NameAndType        #300:#394     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #394 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #395 = String             #396          // value
  #396 = Utf8               value
  #397 = InterfaceMethodref #398.#364     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #398 = Class              #399          // java/util/Map
  #399 = Utf8               java/util/Map
  #400 = String             #401          // id
  #401 = Utf8               id
  #402 = String             #403          // level
  #403 = Utf8               level
  #404 = String             #405          // z
  #405 = Utf8               z
  #406 = String             #407          // heading
  #407 = Utf8               heading
  #408 = InterfaceMethodref #34.#409      // org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
  #409 = NameAndType        #410:#373     // getNextSibling:()Lorg/w3c/dom/Node;
  #410 = Utf8               getNextSibling
  #411 = InvokeDynamic      #1:#412       // #1:test:()Ljava/util/function/Predicate;
  #412 = NameAndType        #413:#414     // test:()Ljava/util/function/Predicate;
  #413 = Utf8               test
  #414 = Utf8               ()Ljava/util/function/Predicate;
  #415 = InterfaceMethodref #14.#416      // ext/mods/commons/data/xml/IXmlReader.forEach:(Lorg/w3c/dom/Node;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #416 = NameAndType        #99:#417      // forEach:(Lorg/w3c/dom/Node;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #417 = Utf8               (Lorg/w3c/dom/Node;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #418 = InvokeDynamic      #2:#419       // #2:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #419 = NameAndType        #413:#420     // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #420 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #421 = InterfaceMethodref #34.#422      // org/w3c/dom/Node.getChildNodes:()Lorg/w3c/dom/NodeList;
  #422 = NameAndType        #423:#424     // getChildNodes:()Lorg/w3c/dom/NodeList;
  #423 = Utf8               getChildNodes
  #424 = Utf8               ()Lorg/w3c/dom/NodeList;
  #425 = InterfaceMethodref #426.#41      // org/w3c/dom/NodeList.getLength:()I
  #426 = Class              #427          // org/w3c/dom/NodeList
  #427 = Utf8               org/w3c/dom/NodeList
  #428 = InterfaceMethodref #426.#46      // org/w3c/dom/NodeList.item:(I)Lorg/w3c/dom/Node;
  #429 = InterfaceMethodref #430.#431     // java/util/function/Predicate.test:(Ljava/lang/Object;)Z
  #430 = Class              #432          // java/util/function/Predicate
  #431 = NameAndType        #413:#385     // test:(Ljava/lang/Object;)Z
  #432 = Utf8               java/util/function/Predicate
  #433 = InterfaceMethodref #434.#435     // java/util/function/Consumer.accept:(Ljava/lang/Object;)V
  #434 = Class              #436          // java/util/function/Consumer
  #435 = NameAndType        #93:#437      // accept:(Ljava/lang/Object;)V
  #436 = Utf8               java/util/function/Consumer
  #437 = Utf8               (Ljava/lang/Object;)V
  #438 = InterfaceMethodref #34.#439      // org/w3c/dom/Node.getNodeType:()S
  #439 = NameAndType        #440:#441     // getNodeType:()S
  #440 = Utf8               getNodeType
  #441 = Utf8               ()S
  #442 = String             #443          // |
  #443 = Utf8               |
  #444 = Methodref          #19.#445      // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #445 = NameAndType        #446:#447     // contains:(Ljava/lang/CharSequence;)Z
  #446 = Utf8               contains
  #447 = Utf8               (Ljava/lang/CharSequence;)Z
  #448 = String             #449          // \\|
  #449 = Utf8               \\|
  #450 = Methodref          #19.#451      // java/lang/String.isEmpty:()Z
  #451 = NameAndType        #452:#453     // isEmpty:()Z
  #452 = Utf8               isEmpty
  #453 = Utf8               ()Z
  #454 = Methodref          #315.#455     // java/lang/Class.getName:()Ljava/lang/String;
  #455 = NameAndType        #456:#52      // getName:()Ljava/lang/String;
  #456 = Utf8               getName
  #457 = Methodref          #112.#458     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #458 = NameAndType        #31:#459      // "<init>":(Ljava/lang/String;)V
  #459 = Utf8               (Ljava/lang/String;)V
  #460 = Utf8               JAXP_SCHEMA_LANGUAGE
  #461 = Utf8               Ljava/lang/String;
  #462 = Utf8               ConstantValue
  #463 = Utf8               W3C_XML_SCHEMA
  #464 = Utf8               load
  #465 = Utf8               parseDataFile
  #466 = Utf8               Code
  #467 = Utf8               LineNumberTable
  #468 = Utf8               LocalVariableTable
  #469 = Utf8               this
  #470 = Utf8               Lext/mods/commons/data/xml/IXmlReader;
  #471 = Utf8               file
  #472 = Utf8               path
  #473 = Utf8               parseStatSet
  #474 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #475 = Utf8               i
  #476 = Utf8               I
  #477 = Utf8               node
  #478 = Utf8               Lorg/w3c/dom/Node;
  #479 = Utf8               Lext/mods/commons/data/StatSet;
  #480 = Utf8               attrs
  #481 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #482 = Utf8               StackMapTable
  #483 = Utf8               e
  #484 = Utf8               Ljava/io/IOException;
  #485 = Utf8               pathsToParse
  #486 = Utf8               Ljava/util/List;
  #487 = Utf8               db
  #488 = Utf8               Ljavax/xml/parsers/DocumentBuilder;
  #489 = Utf8               Lorg/xml/sax/SAXParseException;
  #490 = Utf8               Ljava/lang/Exception;
  #491 = Utf8               dbf
  #492 = Utf8               Ljavax/xml/parsers/DocumentBuilderFactory;
  #493 = Utf8               validate
  #494 = Utf8               Z
  #495 = Utf8               ignoreComments
  #496 = Utf8               ignoreWhitespaces
  #497 = Utf8               LocalVariableTypeTable
  #498 = Utf8               Ljava/util/List<Ljava/nio/file/Path;>;
  #499 = Class              #500          // java/lang/Exception
  #500 = Utf8               java/lang/Exception
  #501 = Utf8               defaultValue
  #502 = Utf8               Ljava/lang/Boolean;
  #503 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Boolean;
  #504 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
  #505 = Utf8               Ljava/lang/Byte;
  #506 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Byte;
  #507 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Byte;)Ljava/lang/Byte;
  #508 = Utf8               Ljava/lang/Short;
  #509 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Short;
  #510 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Short;)Ljava/lang/Short;
  #511 = Utf8               Ljava/lang/Integer;
  #512 = Utf8               (Lorg/w3c/dom/Node;)I
  #513 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #514 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;I)I
  #515 = Utf8               result
  #516 = Utf8               Ljava/lang/Long;
  #517 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Long;
  #518 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;
  #519 = Utf8               Ljava/lang/Float;
  #520 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Float;
  #521 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;
  #522 = Utf8               Ljava/lang/Double;
  #523 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Double;
  #524 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;
  #525 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #526 = Utf8               Ljava/lang/IllegalArgumentException;
  #527 = Utf8               clazz
  #528 = Utf8               Ljava/lang/Class;
  #529 = Utf8               Ljava/lang/Enum;
  #530 = Utf8               Ljava/lang/Class<TT;>;
  #531 = Utf8               TT;
  #532 = Utf8               Signature
  #533 = Utf8               <T:Ljava/lang/Enum<TT;>;>(Lorg/w3c/dom/Node;Ljava/lang/Class<TT;>;TT;)TT;
  #534 = Utf8               <T:Ljava/lang/Enum<TT;>;>(Lorg/w3c/dom/Node;Ljava/lang/Class<TT;>;)TT;
  #535 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #536 = Utf8               <T:Ljava/lang/Enum<TT;>;>(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class<TT;>;Ljava/lang/String;)TT;
  #537 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;
  #538 = Utf8               <T:Ljava/lang/Enum<TT;>;>(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class<TT;>;Ljava/lang/String;TT;)TT;
  #539 = Utf8               parsePoint2D
  #540 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Point2D;
  #541 = Utf8               nodeAttrs
  #542 = Utf8               parseLocation
  #543 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/location/Location;
  #544 = Utf8               coords
  #545 = Utf8               [Ljava/lang/String;
  #546 = Utf8               parseSpawnLocation
  #547 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/location/SpawnLocation;
  #548 = Utf8               parseIntIntHolder
  #549 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #550 = Utf8               values
  #551 = Utf8               parseAttributes
  #552 = Utf8               att
  #553 = Utf8               map
  #554 = Utf8               addAttributes
  #555 = Utf8               (Lext/mods/commons/data/StatSet;Lorg/w3c/dom/NamedNodeMap;)V
  #556 = Utf8               parseParameters
  #557 = Utf8               (Lorg/w3c/dom/Node;)Ljava/util/Map;
  #558 = Utf8               parameters_node
  #559 = Utf8               n
  #560 = Utf8               parameters
  #561 = Utf8               Ljava/util/Map;
  #562 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;
  #563 = Utf8               (Lorg/w3c/dom/Node;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;
  #564 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Location;
  #565 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/SpawnLocation;
  #566 = Utf8               (Lorg/w3c/dom/Node;Ljava/util/function/Consumer;)V
  #567 = Utf8               action
  #568 = Utf8               Ljava/util/function/Consumer;
  #569 = Utf8               Ljava/util/function/Consumer<Lorg/w3c/dom/Node;>;
  #570 = Utf8               (Lorg/w3c/dom/Node;Ljava/util/function/Consumer<Lorg/w3c/dom/Node;>;)V
  #571 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #572 = Utf8               nodeName
  #573 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer<Lorg/w3c/dom/Node;>;)V
  #574 = Utf8               targetNode
  #575 = Utf8               filter
  #576 = Utf8               Ljava/util/function/Predicate;
  #577 = Utf8               list
  #578 = Utf8               Lorg/w3c/dom/NodeList;
  #579 = Utf8               Ljava/util/function/Predicate<Lorg/w3c/dom/Node;>;
  #580 = Utf8               (Lorg/w3c/dom/Node;Ljava/util/function/Predicate<Lorg/w3c/dom/Node;>;Ljava/util/function/Consumer<Lorg/w3c/dom/Node;>;)V
  #581 = Utf8               isNode
  #582 = Utf8               (Lorg/w3c/dom/Node;)Z
  #583 = Utf8               isText
  #584 = Utf8               lambda$forEach$1
  #585 = Utf8               (Ljava/lang/String;Lorg/w3c/dom/Node;)Z
  #586 = Utf8               arr$
  #587 = Utf8               len$
  #588 = Utf8               i$
  #589 = Utf8               nodeNames
  #590 = Utf8               innerNode
  #591 = Class              #545          // "[Ljava/lang/String;"
  #592 = Utf8               lambda$forEach$0
  #593 = Utf8               a
  #594 = Utf8               lambda$parseFile$0
  #595 = Utf8               (ZZZLjava/nio/file/Path;)V
  #596 = Utf8               p
  #597 = Utf8               <clinit>
  #598 = Utf8               SourceFile
  #599 = Utf8               IXmlReader.java
  #600 = Utf8               NestMembers
  #601 = Utf8               BootstrapMethods
  #602 = MethodType         #437          //  (Ljava/lang/Object;)V
  #603 = MethodHandle       9:#604        // REF_invokeInterface ext/mods/commons/data/xml/IXmlReader.lambda$parseFile$0:(ZZZLjava/nio/file/Path;)V
  #604 = InterfaceMethodref #14.#605      // ext/mods/commons/data/xml/IXmlReader.lambda$parseFile$0:(ZZZLjava/nio/file/Path;)V
  #605 = NameAndType        #594:#595     // lambda$parseFile$0:(ZZZLjava/nio/file/Path;)V
  #606 = MethodType         #607          //  (Ljava/nio/file/Path;)V
  #607 = Utf8               (Ljava/nio/file/Path;)V
  #608 = MethodType         #385          //  (Ljava/lang/Object;)Z
  #609 = MethodHandle       6:#610        // REF_invokeStatic ext/mods/commons/data/xml/IXmlReader.lambda$forEach$0:(Lorg/w3c/dom/Node;)Z
  #610 = InterfaceMethodref #14.#611      // ext/mods/commons/data/xml/IXmlReader.lambda$forEach$0:(Lorg/w3c/dom/Node;)Z
  #611 = NameAndType        #592:#582     // lambda$forEach$0:(Lorg/w3c/dom/Node;)Z
  #612 = MethodType         #582          //  (Lorg/w3c/dom/Node;)Z
  #613 = MethodHandle       6:#614        // REF_invokeStatic ext/mods/commons/data/xml/IXmlReader.lambda$forEach$1:(Ljava/lang/String;Lorg/w3c/dom/Node;)Z
  #614 = InterfaceMethodref #14.#615      // ext/mods/commons/data/xml/IXmlReader.lambda$forEach$1:(Ljava/lang/String;Lorg/w3c/dom/Node;)Z
  #615 = NameAndType        #584:#585     // lambda$forEach$1:(Ljava/lang/String;Lorg/w3c/dom/Node;)Z
  #616 = MethodHandle       6:#617        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #617 = Methodref          #618.#619     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #618 = Class              #620          // java/lang/invoke/LambdaMetafactory
  #619 = NameAndType        #621:#622     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #620 = Utf8               java/lang/invoke/LambdaMetafactory
  #621 = Utf8               metafactory
  #622 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #623 = Utf8               InnerClasses
  #624 = Utf8               XMLErrorHandler
  #625 = Class              #626          // java/lang/invoke/MethodHandles$Lookup
  #626 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #627 = Class              #628          // java/lang/invoke/MethodHandles
  #628 = Utf8               java/lang/invoke/MethodHandles
  #629 = Utf8               Lookup
{
  public static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.lang.String JAXP_SCHEMA_LANGUAGE;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String http://java.sun.com/xml/jaxp/properties/schemaLanguage

  public static final java.lang.String W3C_XML_SCHEMA;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String http://www.w3.org/2001/XMLSchema

  public abstract void load();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public default void parseDataFile(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: getstatic     #1                  // Field ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
         4: aload_1
         5: invokeinterface #7,  2            // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        10: iconst_0
        11: iconst_1
        12: iconst_1
        13: invokeinterface #13,  5           // InterfaceMethod parseFile:(Ljava/nio/file/Path;ZZZ)V
        18: return
      LineNumberTable:
        line 72: 0
        line 73: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      19     1  file   Ljava/lang/String;

  public default void parseFile(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: anewarray     #19                 // class java/lang/String
         6: invokestatic  #21                 // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
         9: iconst_0
        10: iconst_1
        11: iconst_1
        12: invokeinterface #13,  5           // InterfaceMethod parseFile:(Ljava/nio/file/Path;ZZZ)V
        17: return
      LineNumberTable:
        line 77: 0
        line 78: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      18     1  path   Ljava/lang/String;

  public default ext.mods.commons.data.StatSet parseStatSet(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=2
         0: new           #27                 // class ext/mods/commons/data/StatSet
         3: dup
         4: invokespecial #29                 // Method ext/mods/commons/data/StatSet."<init>":()V
         7: astore_2
         8: aload_1
         9: invokeinterface #33,  1           // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
        14: astore_3
        15: iconst_0
        16: istore        4
        18: iload         4
        20: aload_3
        21: invokeinterface #39,  1           // InterfaceMethod org/w3c/dom/NamedNodeMap.getLength:()I
        26: if_icmpge     65
        29: aload_2
        30: aload_3
        31: iload         4
        33: invokeinterface #45,  2           // InterfaceMethod org/w3c/dom/NamedNodeMap.item:(I)Lorg/w3c/dom/Node;
        38: invokeinterface #49,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        43: aload_3
        44: iload         4
        46: invokeinterface #45,  2           // InterfaceMethod org/w3c/dom/NamedNodeMap.item:(I)Lorg/w3c/dom/Node;
        51: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        56: invokevirtual #56                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;Ljava/lang/String;)V
        59: iinc          4, 1
        62: goto          18
        65: aload_2
        66: areturn
      LineNumberTable:
        line 82: 0
        line 83: 8
        line 84: 15
        line 85: 29
        line 84: 59
        line 86: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18      47     4     i   I
            0      67     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      67     1  node   Lorg/w3c/dom/Node;
            8      59     2   set   Lext/mods/commons/data/StatSet;
           15      52     3 attrs   Lorg/w3c/dom/NamedNodeMap;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 18
          locals = [ class ext/mods/commons/data/StatSet, class org/w3c/dom/NamedNodeMap, int ]
        frame_type = 250 /* chop */
          offset_delta = 46

  public default void parseFile(java.nio.file.Path, boolean, boolean, boolean);
    descriptor: (Ljava/nio/file/Path;ZZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=5
         0: aload_1
         1: iconst_0
         2: anewarray     #60                 // class java/nio/file/LinkOption
         5: invokestatic  #62                 // Method java/nio/file/Files.isDirectory:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
         8: ifeq          85
        11: new           #68                 // class it/unimi/dsi/fastutil/objects/ObjectArrayList
        14: dup
        15: invokespecial #70                 // Method it/unimi/dsi/fastutil/objects/ObjectArrayList."<init>":()V
        18: astore        5
        20: aload_1
        21: ldc           #71                 // class java/nio/file/FileVisitOption
        23: invokestatic  #73                 // Method java/util/EnumSet.noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;
        26: ldc           #81                 // int 2147483647
        28: new           #82                 // class ext/mods/commons/data/xml/IXmlReader$1
        31: dup
        32: aload_0
        33: aload         5
        35: invokespecial #84                 // Method ext/mods/commons/data/xml/IXmlReader$1."<init>":(Lext/mods/commons/data/xml/IXmlReader;Ljava/util/List;)V
        38: invokestatic  #87                 // Method java/nio/file/Files.walkFileTree:(Ljava/nio/file/Path;Ljava/util/Set;ILjava/nio/file/FileVisitor;)Ljava/nio/file/Path;
        41: pop
        42: aload         5
        44: aload_0
        45: iload_2
        46: iload_3
        47: iload         4
        49: invokedynamic #91,  0             // InvokeDynamic #0:accept:(Lext/mods/commons/data/xml/IXmlReader;ZZZ)Ljava/util/function/Consumer;
        54: invokeinterface #95,  2           // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        59: goto          82
        62: astore        6
        64: getstatic     #103                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        67: ldc           #107                // String Could not parse directory: {}
        69: aload         6
        71: iconst_1
        72: anewarray     #109                // class java/lang/Object
        75: dup
        76: iconst_0
        77: aload_1
        78: aastore
        79: invokevirtual #111                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        82: goto          252
        85: invokestatic  #117                // Method javax/xml/parsers/DocumentBuilderFactory.newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
        88: astore        5
        90: aload         5
        92: ldc           #125                // String http://javax.xml.XMLConstants/property/accessExternalDTD
        94: ldc           #127                // String
        96: invokevirtual #129                // Method javax/xml/parsers/DocumentBuilderFactory.setAttribute:(Ljava/lang/String;Ljava/lang/Object;)V
        99: aload         5
       101: ldc           #133                // String http://javax.xml.XMLConstants/property/accessExternalSchema
       103: ldc           #127                // String
       105: invokevirtual #129                // Method javax/xml/parsers/DocumentBuilderFactory.setAttribute:(Ljava/lang/String;Ljava/lang/Object;)V
       108: aload         5
       110: iconst_1
       111: invokevirtual #135                // Method javax/xml/parsers/DocumentBuilderFactory.setNamespaceAware:(Z)V
       114: aload         5
       116: iload_2
       117: invokevirtual #139                // Method javax/xml/parsers/DocumentBuilderFactory.setValidating:(Z)V
       120: aload         5
       122: iload_3
       123: invokevirtual #142                // Method javax/xml/parsers/DocumentBuilderFactory.setIgnoringComments:(Z)V
       126: aload         5
       128: iload         4
       130: invokevirtual #145                // Method javax/xml/parsers/DocumentBuilderFactory.setIgnoringElementContentWhitespace:(Z)V
       133: aload         5
       135: ldc           #148                // String http://java.sun.com/xml/jaxp/properties/schemaLanguage
       137: ldc           #150                // String http://www.w3.org/2001/XMLSchema
       139: invokevirtual #129                // Method javax/xml/parsers/DocumentBuilderFactory.setAttribute:(Ljava/lang/String;Ljava/lang/Object;)V
       142: aload         5
       144: invokevirtual #152                // Method javax/xml/parsers/DocumentBuilderFactory.newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
       147: astore        6
       149: aload         6
       151: new           #156                // class ext/mods/commons/data/xml/IXmlReader$XMLErrorHandler
       154: dup
       155: invokespecial #158                // Method ext/mods/commons/data/xml/IXmlReader$XMLErrorHandler."<init>":()V
       158: invokevirtual #159                // Method javax/xml/parsers/DocumentBuilder.setErrorHandler:(Lorg/xml/sax/ErrorHandler;)V
       161: aload_0
       162: aload         6
       164: aload_1
       165: invokeinterface #165,  1          // InterfaceMethod java/nio/file/Path.toAbsolutePath:()Ljava/nio/file/Path;
       170: invokeinterface #169,  1          // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
       175: invokevirtual #173                // Method javax/xml/parsers/DocumentBuilder.parse:(Ljava/io/File;)Lorg/w3c/dom/Document;
       178: aload_1
       179: invokeinterface #177,  3          // InterfaceMethod parseDocument:(Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
       184: goto          252
       187: astore        6
       189: getstatic     #103                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       192: ldc           #183                // String Could not parse file: {} at line: {}, column: {} :
       194: aload         6
       196: iconst_3
       197: anewarray     #109                // class java/lang/Object
       200: dup
       201: iconst_0
       202: aload_1
       203: aastore
       204: dup
       205: iconst_1
       206: aload         6
       208: invokevirtual #185                // Method org/xml/sax/SAXParseException.getLineNumber:()I
       211: invokestatic  #188                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       214: aastore
       215: dup
       216: iconst_2
       217: aload         6
       219: invokevirtual #192                // Method org/xml/sax/SAXParseException.getColumnNumber:()I
       222: invokestatic  #188                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       225: aastore
       226: invokevirtual #111                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       229: goto          252
       232: astore        6
       234: getstatic     #103                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       237: ldc           #199                // String Could not parse file: {}
       239: aload         6
       241: iconst_1
       242: anewarray     #109                // class java/lang/Object
       245: dup
       246: iconst_0
       247: aload_1
       248: aastore
       249: invokevirtual #111                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       252: return
      Exception table:
         from    to  target type
            20    59    62   Class java/io/IOException
           142   184   187   Class org/xml/sax/SAXParseException
           142   184   232   Class javax/xml/parsers/ParserConfigurationException
           142   184   232   Class org/xml/sax/SAXException
           142   184   232   Class java/io/IOException
      LineNumberTable:
        line 91: 0
        line 93: 11
        line 96: 20
        line 106: 42
        line 111: 59
        line 108: 62
        line 110: 64
        line 112: 82
        line 115: 85
        line 116: 90
        line 117: 99
        line 118: 108
        line 119: 114
        line 120: 120
        line 121: 126
        line 122: 133
        line 126: 142
        line 127: 149
        line 128: 161
        line 137: 184
        line 130: 187
        line 132: 189
        line 137: 229
        line 134: 232
        line 136: 234
        line 139: 252
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           64      18     6     e   Ljava/io/IOException;
           20      62     5 pathsToParse   Ljava/util/List;
          149      35     6    db   Ljavax/xml/parsers/DocumentBuilder;
          189      40     6     e   Lorg/xml/sax/SAXParseException;
          234      18     6     e   Ljava/lang/Exception;
           90     162     5   dbf   Ljavax/xml/parsers/DocumentBuilderFactory;
            0     253     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0     253     1  path   Ljava/nio/file/Path;
            0     253     2 validate   Z
            0     253     3 ignoreComments   Z
            0     253     4 ignoreWhitespaces   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           20      62     5 pathsToParse   Ljava/util/List<Ljava/nio/file/Path;>;
      StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
          offset_delta = 62
          locals = [ class ext/mods/commons/data/xml/IXmlReader, class java/nio/file/Path, int, int, int, class java/util/List ]
          stack = [ class java/io/IOException ]
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 101
          locals = [ class ext/mods/commons/data/xml/IXmlReader, class java/nio/file/Path, int, int, int, class javax/xml/parsers/DocumentBuilderFactory ]
          stack = [ class org/xml/sax/SAXParseException ]
        frame_type = 108 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 19

  public default java.lang.Boolean parseBoolean(org.w3c.dom.Node, java.lang.Boolean);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: aload_1
         1: ifnull        16
         4: aload_1
         5: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        10: invokestatic  #201                // Method java/lang/Boolean.valueOf:(Ljava/lang/String;)Ljava/lang/Boolean;
        13: goto          17
        16: aload_2
        17: areturn
      LineNumberTable:
        line 143: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      18     1  node   Lorg/w3c/dom/Node;
            0      18     2 defaultValue   Ljava/lang/Boolean;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Boolean ]

  public default java.lang.Boolean parseBoolean(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Ljava/lang/Boolean;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aconst_null
         3: invokeinterface #206,  3          // InterfaceMethod parseBoolean:(Lorg/w3c/dom/Node;Ljava/lang/Boolean;)Ljava/lang/Boolean;
         8: areturn
      LineNumberTable:
        line 148: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0       9     1  node   Lorg/w3c/dom/Node;

  public default java.lang.Boolean parseBoolean(org.w3c.dom.NamedNodeMap, java.lang.String);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Boolean;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: invokeinterface #214,  2          // InterfaceMethod parseBoolean:(Lorg/w3c/dom/Node;)Ljava/lang/Boolean;
        13: areturn
      LineNumberTable:
        line 153: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      14     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      14     2  name   Ljava/lang/String;

  public default java.lang.Boolean parseBoolean(org.w3c.dom.NamedNodeMap, java.lang.String, java.lang.Boolean);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: aload_3
         9: invokeinterface #206,  3          // InterfaceMethod parseBoolean:(Lorg/w3c/dom/Node;Ljava/lang/Boolean;)Ljava/lang/Boolean;
        14: areturn
      LineNumberTable:
        line 158: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      15     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      15     2  name   Ljava/lang/String;
            0      15     3 defaultValue   Ljava/lang/Boolean;

  public default java.lang.Byte parseByte(org.w3c.dom.Node, java.lang.Byte);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Byte;)Ljava/lang/Byte;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: aload_1
         1: ifnull        16
         4: aload_1
         5: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        10: invokestatic  #217                // Method java/lang/Byte.decode:(Ljava/lang/String;)Ljava/lang/Byte;
        13: goto          17
        16: aload_2
        17: areturn
      LineNumberTable:
        line 163: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      18     1  node   Lorg/w3c/dom/Node;
            0      18     2 defaultValue   Ljava/lang/Byte;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Byte ]

  public default java.lang.Byte parseByte(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Ljava/lang/Byte;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aconst_null
         3: invokeinterface #223,  3          // InterfaceMethod parseByte:(Lorg/w3c/dom/Node;Ljava/lang/Byte;)Ljava/lang/Byte;
         8: areturn
      LineNumberTable:
        line 168: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0       9     1  node   Lorg/w3c/dom/Node;

  public default java.lang.Byte parseByte(org.w3c.dom.NamedNodeMap, java.lang.String);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Byte;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: invokeinterface #227,  2          // InterfaceMethod parseByte:(Lorg/w3c/dom/Node;)Ljava/lang/Byte;
        13: areturn
      LineNumberTable:
        line 173: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      14     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      14     2  name   Ljava/lang/String;

  public default java.lang.Byte parseByte(org.w3c.dom.NamedNodeMap, java.lang.String, java.lang.Byte);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Byte;)Ljava/lang/Byte;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: aload_3
         9: invokeinterface #223,  3          // InterfaceMethod parseByte:(Lorg/w3c/dom/Node;Ljava/lang/Byte;)Ljava/lang/Byte;
        14: areturn
      LineNumberTable:
        line 178: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      15     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      15     2  name   Ljava/lang/String;
            0      15     3 defaultValue   Ljava/lang/Byte;

  public default java.lang.Short parseShort(org.w3c.dom.Node, java.lang.Short);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Short;)Ljava/lang/Short;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: aload_1
         1: ifnull        16
         4: aload_1
         5: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        10: invokestatic  #230                // Method java/lang/Short.decode:(Ljava/lang/String;)Ljava/lang/Short;
        13: goto          17
        16: aload_2
        17: areturn
      LineNumberTable:
        line 183: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      18     1  node   Lorg/w3c/dom/Node;
            0      18     2 defaultValue   Ljava/lang/Short;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Short ]

  public default java.lang.Short parseShort(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Ljava/lang/Short;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aconst_null
         3: invokeinterface #235,  3          // InterfaceMethod parseShort:(Lorg/w3c/dom/Node;Ljava/lang/Short;)Ljava/lang/Short;
         8: areturn
      LineNumberTable:
        line 188: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0       9     1  node   Lorg/w3c/dom/Node;

  public default java.lang.Short parseShort(org.w3c.dom.NamedNodeMap, java.lang.String);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Short;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: invokeinterface #239,  2          // InterfaceMethod parseShort:(Lorg/w3c/dom/Node;)Ljava/lang/Short;
        13: areturn
      LineNumberTable:
        line 193: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      14     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      14     2  name   Ljava/lang/String;

  public default java.lang.Short parseShort(org.w3c.dom.NamedNodeMap, java.lang.String, java.lang.Short);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Short;)Ljava/lang/Short;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: aload_3
         9: invokeinterface #235,  3          // InterfaceMethod parseShort:(Lorg/w3c/dom/Node;Ljava/lang/Short;)Ljava/lang/Short;
        14: areturn
      LineNumberTable:
        line 198: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      15     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      15     2  name   Ljava/lang/String;
            0      15     3 defaultValue   Ljava/lang/Short;

  public default int parseInt(org.w3c.dom.Node, java.lang.Integer);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Integer;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: aload_1
         1: ifnull        16
         4: aload_1
         5: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        10: invokestatic  #242                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
        13: goto          17
        16: aload_2
        17: invokevirtual #245                // Method java/lang/Integer.intValue:()I
        20: ireturn
      LineNumberTable:
        line 203: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      21     1  node   Lorg/w3c/dom/Node;
            0      21     2 defaultValue   Ljava/lang/Integer;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Integer ]

  public default int parseInt(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_m1
         3: invokestatic  #188                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         6: invokeinterface #248,  3          // InterfaceMethod parseInt:(Lorg/w3c/dom/Node;Ljava/lang/Integer;)I
        11: ireturn
      LineNumberTable:
        line 208: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      12     1  node   Lorg/w3c/dom/Node;

  public default java.lang.Integer parseInteger(org.w3c.dom.Node, java.lang.Integer);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Integer;)Ljava/lang/Integer;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: aload_1
         1: ifnull        16
         4: aload_1
         5: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        10: invokestatic  #242                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
        13: goto          17
        16: aload_2
        17: areturn
      LineNumberTable:
        line 213: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      18     1  node   Lorg/w3c/dom/Node;
            0      18     2 defaultValue   Ljava/lang/Integer;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Integer ]

  public default java.lang.Integer parseInteger(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Ljava/lang/Integer;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aconst_null
         3: invokeinterface #252,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/Node;Ljava/lang/Integer;)Ljava/lang/Integer;
         8: areturn
      LineNumberTable:
        line 218: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0       9     1  node   Lorg/w3c/dom/Node;

  public default java.lang.Integer parseInteger(org.w3c.dom.NamedNodeMap, java.lang.String);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: invokeinterface #256,  2          // InterfaceMethod parseInteger:(Lorg/w3c/dom/Node;)Ljava/lang/Integer;
        13: areturn
      LineNumberTable:
        line 223: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      14     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      14     2  name   Ljava/lang/String;

  public default java.lang.Integer parseInteger(org.w3c.dom.Node, java.lang.String, java.lang.Integer);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: invokeinterface #33,  1           // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         7: aload_2
         8: aload_3
         9: invokeinterface #259,  4          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
        14: areturn
      LineNumberTable:
        line 228: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      15     1  node   Lorg/w3c/dom/Node;
            0      15     2  name   Ljava/lang/String;
            0      15     3 defaultValue   Ljava/lang/Integer;

  public default int parseInt(org.w3c.dom.Node, java.lang.String, int);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/String;I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=4
         0: aload_0
         1: aload_1
         2: invokeinterface #33,  1           // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         7: aload_2
         8: iload_3
         9: invokestatic  #188                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        12: invokeinterface #259,  4          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
        17: astore        4
        19: aload         4
        21: ifnull        32
        24: aload         4
        26: invokevirtual #245                // Method java/lang/Integer.intValue:()I
        29: goto          33
        32: iload_3
        33: ireturn
      LineNumberTable:
        line 233: 0
        line 234: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      34     1  node   Lorg/w3c/dom/Node;
            0      34     2  name   Ljava/lang/String;
            0      34     3 defaultValue   I
           19      15     4 result   Ljava/lang/Integer;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class java/lang/Integer ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public default java.lang.Integer parseInteger(org.w3c.dom.NamedNodeMap, java.lang.String, java.lang.Integer);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: aload_3
         9: invokeinterface #252,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/Node;Ljava/lang/Integer;)Ljava/lang/Integer;
        14: areturn
      LineNumberTable:
        line 239: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      15     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      15     2  name   Ljava/lang/String;
            0      15     3 defaultValue   Ljava/lang/Integer;

  public default java.lang.Long parseLong(org.w3c.dom.Node, java.lang.Long);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Long;)Ljava/lang/Long;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: aload_1
         1: ifnull        16
         4: aload_1
         5: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        10: invokestatic  #262                // Method java/lang/Long.decode:(Ljava/lang/String;)Ljava/lang/Long;
        13: goto          17
        16: aload_2
        17: areturn
      LineNumberTable:
        line 244: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      18     1  node   Lorg/w3c/dom/Node;
            0      18     2 defaultValue   Ljava/lang/Long;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Long ]

  public default java.lang.Long parseLong(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Ljava/lang/Long;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aconst_null
         3: invokeinterface #267,  3          // InterfaceMethod parseLong:(Lorg/w3c/dom/Node;Ljava/lang/Long;)Ljava/lang/Long;
         8: areturn
      LineNumberTable:
        line 249: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0       9     1  node   Lorg/w3c/dom/Node;

  public default java.lang.Long parseLong(org.w3c.dom.NamedNodeMap, java.lang.String);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Long;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: invokeinterface #271,  2          // InterfaceMethod parseLong:(Lorg/w3c/dom/Node;)Ljava/lang/Long;
        13: areturn
      LineNumberTable:
        line 254: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      14     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      14     2  name   Ljava/lang/String;

  public default java.lang.Long parseLong(org.w3c.dom.NamedNodeMap, java.lang.String, java.lang.Long);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: aload_3
         9: invokeinterface #267,  3          // InterfaceMethod parseLong:(Lorg/w3c/dom/Node;Ljava/lang/Long;)Ljava/lang/Long;
        14: areturn
      LineNumberTable:
        line 259: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      15     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      15     2  name   Ljava/lang/String;
            0      15     3 defaultValue   Ljava/lang/Long;

  public default java.lang.Float parseFloat(org.w3c.dom.Node, java.lang.Float);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Float;)Ljava/lang/Float;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: aload_1
         1: ifnull        16
         4: aload_1
         5: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        10: invokestatic  #274                // Method java/lang/Float.valueOf:(Ljava/lang/String;)Ljava/lang/Float;
        13: goto          17
        16: aload_2
        17: areturn
      LineNumberTable:
        line 264: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      18     1  node   Lorg/w3c/dom/Node;
            0      18     2 defaultValue   Ljava/lang/Float;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Float ]

  public default java.lang.Float parseFloat(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Ljava/lang/Float;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aconst_null
         3: invokeinterface #279,  3          // InterfaceMethod parseFloat:(Lorg/w3c/dom/Node;Ljava/lang/Float;)Ljava/lang/Float;
         8: areturn
      LineNumberTable:
        line 269: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0       9     1  node   Lorg/w3c/dom/Node;

  public default java.lang.Float parseFloat(org.w3c.dom.NamedNodeMap, java.lang.String);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Float;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: invokeinterface #283,  2          // InterfaceMethod parseFloat:(Lorg/w3c/dom/Node;)Ljava/lang/Float;
        13: areturn
      LineNumberTable:
        line 274: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      14     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      14     2  name   Ljava/lang/String;

  public default java.lang.Float parseFloat(org.w3c.dom.NamedNodeMap, java.lang.String, java.lang.Float);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: aload_3
         9: invokeinterface #279,  3          // InterfaceMethod parseFloat:(Lorg/w3c/dom/Node;Ljava/lang/Float;)Ljava/lang/Float;
        14: areturn
      LineNumberTable:
        line 279: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      15     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      15     2  name   Ljava/lang/String;
            0      15     3 defaultValue   Ljava/lang/Float;

  public default java.lang.Double parseDouble(org.w3c.dom.Node, java.lang.Double);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Double;)Ljava/lang/Double;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: aload_1
         1: ifnull        16
         4: aload_1
         5: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        10: invokestatic  #286                // Method java/lang/Double.valueOf:(Ljava/lang/String;)Ljava/lang/Double;
        13: goto          17
        16: aload_2
        17: areturn
      LineNumberTable:
        line 284: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      18     1  node   Lorg/w3c/dom/Node;
            0      18     2 defaultValue   Ljava/lang/Double;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Double ]

  public default java.lang.Double parseDouble(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Ljava/lang/Double;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aconst_null
         3: invokeinterface #291,  3          // InterfaceMethod parseDouble:(Lorg/w3c/dom/Node;Ljava/lang/Double;)Ljava/lang/Double;
         8: areturn
      LineNumberTable:
        line 289: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0       9     1  node   Lorg/w3c/dom/Node;

  public default java.lang.Double parseDouble(org.w3c.dom.NamedNodeMap, java.lang.String);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Double;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: invokeinterface #295,  2          // InterfaceMethod parseDouble:(Lorg/w3c/dom/Node;)Ljava/lang/Double;
        13: areturn
      LineNumberTable:
        line 294: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      14     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      14     2  name   Ljava/lang/String;

  public default java.lang.Double parseDouble(org.w3c.dom.NamedNodeMap, java.lang.String, java.lang.Double);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: aload_3
         9: invokeinterface #291,  3          // InterfaceMethod parseDouble:(Lorg/w3c/dom/Node;Ljava/lang/Double;)Ljava/lang/Double;
        14: areturn
      LineNumberTable:
        line 299: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      15     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      15     2  name   Ljava/lang/String;
            0      15     3 defaultValue   Ljava/lang/Double;

  public default java.lang.String parseString(org.w3c.dom.Node, java.lang.String);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: aload_1
         1: ifnull        13
         4: aload_1
         5: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        10: goto          14
        13: aload_2
        14: areturn
      LineNumberTable:
        line 304: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      15     1  node   Lorg/w3c/dom/Node;
            0      15     2 defaultValue   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public default java.lang.String parseString(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aconst_null
         3: invokeinterface #298,  3          // InterfaceMethod parseString:(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;
         8: areturn
      LineNumberTable:
        line 309: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0       9     1  node   Lorg/w3c/dom/Node;

  public default java.lang.String parseString(org.w3c.dom.NamedNodeMap, java.lang.String);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: invokeinterface #302,  2          // InterfaceMethod parseString:(Lorg/w3c/dom/Node;)Ljava/lang/String;
        13: areturn
      LineNumberTable:
        line 314: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      14     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      14     2  name   Ljava/lang/String;

  public default java.lang.String parseString(org.w3c.dom.NamedNodeMap, java.lang.String, java.lang.String);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: aload_3
         9: invokeinterface #298,  3          // InterfaceMethod parseString:(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;
        14: areturn
      LineNumberTable:
        line 319: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      15     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      15     2  name   Ljava/lang/String;
            0      15     3 defaultValue   Ljava/lang/String;

  public default <T extends java.lang.Enum<T>> T parseEnum(org.w3c.dom.Node, java.lang.Class<T>, T);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=4
         0: aload_1
         1: ifnonnull     6
         4: aload_3
         5: areturn
         6: aload_2
         7: aload_1
         8: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        13: invokestatic  #305                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        16: areturn
        17: astore        4
        19: getstatic     #103                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        22: ldc_w         #312                // String Invalid value specified for node: {} specified value: {} should be enum value of \"{}\" using default value: {}
        25: iconst_4
        26: anewarray     #109                // class java/lang/Object
        29: dup
        30: iconst_0
        31: aload_1
        32: invokeinterface #49,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        37: aastore
        38: dup
        39: iconst_1
        40: aload_1
        41: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        46: aastore
        47: dup
        48: iconst_2
        49: aload_2
        50: invokevirtual #314                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
        53: aastore
        54: dup
        55: iconst_3
        56: aload_3
        57: aastore
        58: invokevirtual #319                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        61: aload_3
        62: areturn
      Exception table:
         from    to  target type
             6    16    17   Class java/lang/IllegalArgumentException
      LineNumberTable:
        line 324: 0
        line 326: 4
        line 331: 6
        line 333: 17
        line 335: 19
        line 336: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19      44     4     e   Ljava/lang/IllegalArgumentException;
            0      63     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      63     1  node   Lorg/w3c/dom/Node;
            0      63     2 clazz   Ljava/lang/Class;
            0      63     3 defaultValue   Ljava/lang/Enum;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      63     2 clazz   Ljava/lang/Class<TT;>;
            0      63     3 defaultValue   TT;
      StackMapTable: number_of_entries = 2
        frame_type = 6 /* same */
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ class java/lang/IllegalArgumentException ]
    Signature: #533                         // <T:Ljava/lang/Enum<TT;>;>(Lorg/w3c/dom/Node;Ljava/lang/Class<TT;>;TT;)TT;

  public default <T extends java.lang.Enum<T>> T parseEnum(org.w3c.dom.Node, java.lang.Class<T>);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/Class;)Ljava/lang/Enum;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: aconst_null
         4: invokeinterface #322,  4          // InterfaceMethod parseEnum:(Lorg/w3c/dom/Node;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
         9: areturn
      LineNumberTable:
        line 342: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      10     1  node   Lorg/w3c/dom/Node;
            0      10     2 clazz   Ljava/lang/Class;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     2 clazz   Ljava/lang/Class<TT;>;
    Signature: #534                         // <T:Ljava/lang/Enum<TT;>;>(Lorg/w3c/dom/Node;Ljava/lang/Class<TT;>;)TT;

  public default <T extends java.lang.Enum<T>> T parseEnum(org.w3c.dom.NamedNodeMap, java.lang.Class<T>, java.lang.String);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: aload_3
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: aload_2
         9: invokeinterface #326,  3          // InterfaceMethod parseEnum:(Lorg/w3c/dom/Node;Ljava/lang/Class;)Ljava/lang/Enum;
        14: areturn
      LineNumberTable:
        line 347: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      15     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      15     2 clazz   Ljava/lang/Class;
            0      15     3  name   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      15     2 clazz   Ljava/lang/Class<TT;>;
    Signature: #536                         // <T:Ljava/lang/Enum<TT;>;>(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class<TT;>;Ljava/lang/String;)TT;

  public default <T extends java.lang.Enum<T>> T parseEnum(org.w3c.dom.NamedNodeMap, java.lang.Class<T>, java.lang.String, T);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=5
         0: aload_0
         1: aload_1
         2: aload_3
         3: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         8: aload_2
         9: aload         4
        11: invokeinterface #322,  4          // InterfaceMethod parseEnum:(Lorg/w3c/dom/Node;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
        16: areturn
      LineNumberTable:
        line 352: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      17     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      17     2 clazz   Ljava/lang/Class;
            0      17     3  name   Ljava/lang/String;
            0      17     4 defaultValue   Ljava/lang/Enum;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      17     2 clazz   Ljava/lang/Class<TT;>;
            0      17     4 defaultValue   TT;
    Signature: #538                         // <T:Ljava/lang/Enum<TT;>;>(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class<TT;>;Ljava/lang/String;TT;)TT;

  public default ext.mods.gameserver.model.location.Point2D parsePoint2D(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: aconst_null
         5: areturn
         6: aload_1
         7: invokeinterface #33,  1           // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
        12: astore_2
        13: aload_2
        14: ifnonnull     19
        17: aconst_null
        18: areturn
        19: new           #329                // class ext/mods/gameserver/model/location/Point2D
        22: dup
        23: aload_0
        24: aload_2
        25: ldc_w         #331                // String x
        28: invokeinterface #333,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
        33: invokevirtual #245                // Method java/lang/Integer.intValue:()I
        36: aload_0
        37: aload_2
        38: ldc_w         #336                // String y
        41: invokeinterface #333,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
        46: invokevirtual #245                // Method java/lang/Integer.intValue:()I
        49: invokespecial #338                // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
        52: areturn
      LineNumberTable:
        line 357: 0
        line 358: 4
        line 360: 6
        line 361: 13
        line 362: 17
        line 364: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      53     1  node   Lorg/w3c/dom/Node;
           13      40     2 nodeAttrs   Lorg/w3c/dom/NamedNodeMap;
      StackMapTable: number_of_entries = 2
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class org/w3c/dom/NamedNodeMap ]

  public default ext.mods.gameserver.model.location.Location parseLocation(org.w3c.dom.NamedNodeMap, java.lang.String);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=3
         0: aload_1
         1: aload_2
         2: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         7: astore_3
         8: aload_3
         9: ifnonnull     14
        12: aconst_null
        13: areturn
        14: aload_3
        15: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        20: ldc_w         #341                // String ;
        23: invokevirtual #343                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        26: astore        4
        28: new           #347                // class ext/mods/gameserver/model/location/Location
        31: dup
        32: aload         4
        34: iconst_0
        35: aaload
        36: invokestatic  #349                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        39: aload         4
        41: iconst_1
        42: aaload
        43: invokestatic  #349                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        46: aload         4
        48: iconst_2
        49: aaload
        50: invokestatic  #349                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        53: invokespecial #352                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        56: areturn
      LineNumberTable:
        line 369: 0
        line 370: 8
        line 371: 12
        line 373: 14
        line 374: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      57     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      57     2  name   Ljava/lang/String;
            8      49     3  node   Lorg/w3c/dom/Node;
           28      29     4 coords   [Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class org/w3c/dom/Node ]

  public default ext.mods.gameserver.model.location.SpawnLocation parseSpawnLocation(org.w3c.dom.NamedNodeMap, java.lang.String);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/location/SpawnLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=3
         0: aload_1
         1: aload_2
         2: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         7: astore_3
         8: aload_3
         9: ifnonnull     14
        12: aconst_null
        13: areturn
        14: aload_3
        15: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        20: ldc_w         #341                // String ;
        23: invokevirtual #343                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        26: astore        4
        28: new           #355                // class ext/mods/gameserver/model/location/SpawnLocation
        31: dup
        32: aload         4
        34: iconst_0
        35: aaload
        36: invokestatic  #349                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        39: aload         4
        41: iconst_1
        42: aaload
        43: invokestatic  #349                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        46: aload         4
        48: iconst_2
        49: aaload
        50: invokestatic  #349                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        53: aload         4
        55: iconst_3
        56: aaload
        57: invokestatic  #349                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        60: invokespecial #357                // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
        63: areturn
      LineNumberTable:
        line 379: 0
        line 380: 8
        line 381: 12
        line 383: 14
        line 384: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      64     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      64     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      64     2  name   Ljava/lang/String;
            8      56     3  node   Lorg/w3c/dom/Node;
           28      36     4 coords   [Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class org/w3c/dom/Node ]

  public default ext.mods.gameserver.model.holder.IntIntHolder parseIntIntHolder(org.w3c.dom.NamedNodeMap, java.lang.String);
    descriptor: (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=3
         0: aload_1
         1: aload_2
         2: invokeinterface #210,  2          // InterfaceMethod org/w3c/dom/NamedNodeMap.getNamedItem:(Ljava/lang/String;)Lorg/w3c/dom/Node;
         7: astore_3
         8: aload_3
         9: ifnonnull     14
        12: aconst_null
        13: areturn
        14: aload_3
        15: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        20: ldc_w         #341                // String ;
        23: invokevirtual #343                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        26: astore        4
        28: new           #360                // class ext/mods/gameserver/model/holder/IntIntHolder
        31: dup
        32: aload         4
        34: iconst_0
        35: aaload
        36: invokestatic  #349                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        39: aload         4
        41: iconst_1
        42: aaload
        43: invokestatic  #349                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        46: invokespecial #362                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        49: areturn
      LineNumberTable:
        line 389: 0
        line 390: 8
        line 391: 12
        line 393: 14
        line 394: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      50     1 attrs   Lorg/w3c/dom/NamedNodeMap;
            0      50     2  name   Ljava/lang/String;
            8      42     3  node   Lorg/w3c/dom/Node;
           28      22     4 values   [Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class org/w3c/dom/Node ]

  public default ext.mods.commons.data.StatSet parseAttributes(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_1
         1: invokeinterface #33,  1           // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         6: astore_2
         7: new           #27                 // class ext/mods/commons/data/StatSet
        10: dup
        11: invokespecial #29                 // Method ext/mods/commons/data/StatSet."<init>":()V
        14: astore_3
        15: iconst_0
        16: istore        4
        18: iload         4
        20: aload_2
        21: invokeinterface #39,  1           // InterfaceMethod org/w3c/dom/NamedNodeMap.getLength:()I
        26: if_icmpge     64
        29: aload_2
        30: iload         4
        32: invokeinterface #45,  2           // InterfaceMethod org/w3c/dom/NamedNodeMap.item:(I)Lorg/w3c/dom/Node;
        37: astore        5
        39: aload_3
        40: aload         5
        42: invokeinterface #49,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        47: aload         5
        49: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        54: invokevirtual #363                // Method ext/mods/commons/data/StatSet.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        57: pop
        58: iinc          4, 1
        61: goto          18
        64: aload_3
        65: areturn
      LineNumberTable:
        line 399: 0
        line 400: 7
        line 401: 15
        line 403: 29
        line 404: 39
        line 401: 58
        line 406: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      19     5   att   Lorg/w3c/dom/Node;
           18      46     4     i   I
            0      66     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      66     1  node   Lorg/w3c/dom/Node;
            7      59     2 attrs   Lorg/w3c/dom/NamedNodeMap;
           15      51     3   map   Lext/mods/commons/data/StatSet;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 18
          locals = [ class org/w3c/dom/NamedNodeMap, class ext/mods/commons/data/StatSet, int ]
        frame_type = 250 /* chop */
          offset_delta = 45

  public default void addAttributes(ext.mods.commons.data.StatSet, org.w3c.dom.NamedNodeMap);
    descriptor: (Lext/mods/commons/data/StatSet;Lorg/w3c/dom/NamedNodeMap;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: iconst_0
         1: istore_3
         2: iload_3
         3: aload_2
         4: invokeinterface #39,  1           // InterfaceMethod org/w3c/dom/NamedNodeMap.getLength:()I
         9: if_icmpge     46
        12: aload_2
        13: iload_3
        14: invokeinterface #45,  2           // InterfaceMethod org/w3c/dom/NamedNodeMap.item:(I)Lorg/w3c/dom/Node;
        19: astore        4
        21: aload_1
        22: aload         4
        24: invokeinterface #49,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        29: aload         4
        31: invokeinterface #53,  1           // InterfaceMethod org/w3c/dom/Node.getNodeValue:()Ljava/lang/String;
        36: invokevirtual #363                // Method ext/mods/commons/data/StatSet.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        39: pop
        40: iinc          3, 1
        43: goto          2
        46: return
      LineNumberTable:
        line 411: 0
        line 413: 12
        line 414: 21
        line 411: 40
        line 416: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           21      19     4   att   Lorg/w3c/dom/Node;
            2      44     3     i   I
            0      47     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      47     1   set   Lext/mods/commons/data/StatSet;
            0      47     2 attrs   Lorg/w3c/dom/NamedNodeMap;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 43

  public default java.util.Map<java.lang.String, java.lang.Object> parseParameters(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=11, locals=7, args_size=2
         0: new           #367                // class it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap
         3: dup
         4: invokespecial #369                // Method it/unimi/dsi/fastutil/objects/Object2ObjectOpenHashMap."<init>":()V
         7: astore_2
         8: aload_1
         9: invokeinterface #370,  1          // InterfaceMethod org/w3c/dom/Node.getFirstChild:()Lorg/w3c/dom/Node;
        14: astore_3
        15: aload_3
        16: ifnull        339
        19: aload_3
        20: invokeinterface #33,  1           // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
        25: astore        4
        27: aload_3
        28: invokeinterface #49,  1           // InterfaceMethod org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
        33: invokevirtual #374                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        36: astore        5
        38: iconst_m1
        39: istore        6
        41: aload         5
        43: invokevirtual #377                // Method java/lang/String.hashCode:()I
        46: lookupswitch  { // 3

               106436749: 80

               109496913: 97

              1901043637: 114
                 default: 128
            }
        80: aload         5
        82: ldc_w         #380                // String param
        85: invokevirtual #382                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        88: ifeq          128
        91: iconst_0
        92: istore        6
        94: goto          128
        97: aload         5
        99: ldc_w         #386                // String skill
       102: invokevirtual #382                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       105: ifeq          128
       108: iconst_1
       109: istore        6
       111: goto          128
       114: aload         5
       116: ldc_w         #388                // String location
       119: invokevirtual #382                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       122: ifeq          128
       125: iconst_2
       126: istore        6
       128: iload         6
       130: tableswitch   { // 0 to 2

                       0: 156

                       1: 188

                       2: 244
                 default: 329
            }
       156: aload_2
       157: aload_0
       158: aload         4
       160: ldc_w         #390                // String name
       163: invokeinterface #392,  3          // InterfaceMethod parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
       168: aload_0
       169: aload         4
       171: ldc_w         #395                // String value
       174: invokeinterface #392,  3          // InterfaceMethod parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
       179: invokeinterface #397,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       184: pop
       185: goto          329
       188: aload_2
       189: aload_0
       190: aload         4
       192: ldc_w         #390                // String name
       195: invokeinterface #392,  3          // InterfaceMethod parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
       200: new           #360                // class ext/mods/gameserver/model/holder/IntIntHolder
       203: dup
       204: aload_0
       205: aload         4
       207: ldc_w         #400                // String id
       210: invokeinterface #333,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
       215: invokevirtual #245                // Method java/lang/Integer.intValue:()I
       218: aload_0
       219: aload         4
       221: ldc_w         #402                // String level
       224: invokeinterface #333,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
       229: invokevirtual #245                // Method java/lang/Integer.intValue:()I
       232: invokespecial #362                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
       235: invokeinterface #397,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       240: pop
       241: goto          329
       244: aload_2
       245: aload_0
       246: aload         4
       248: ldc_w         #390                // String name
       251: invokeinterface #392,  3          // InterfaceMethod parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
       256: new           #355                // class ext/mods/gameserver/model/location/SpawnLocation
       259: dup
       260: aload_0
       261: aload         4
       263: ldc_w         #331                // String x
       266: invokeinterface #333,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
       271: invokevirtual #245                // Method java/lang/Integer.intValue:()I
       274: aload_0
       275: aload         4
       277: ldc_w         #336                // String y
       280: invokeinterface #333,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
       285: invokevirtual #245                // Method java/lang/Integer.intValue:()I
       288: aload_0
       289: aload         4
       291: ldc_w         #404                // String z
       294: invokeinterface #333,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
       299: invokevirtual #245                // Method java/lang/Integer.intValue:()I
       302: aload_0
       303: aload         4
       305: ldc_w         #406                // String heading
       308: iconst_0
       309: invokestatic  #188                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       312: invokeinterface #259,  4          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
       317: invokevirtual #245                // Method java/lang/Integer.intValue:()I
       320: invokespecial #357                // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
       323: invokeinterface #397,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       328: pop
       329: aload_3
       330: invokeinterface #408,  1          // InterfaceMethod org/w3c/dom/Node.getNextSibling:()Lorg/w3c/dom/Node;
       335: astore_3
       336: goto          15
       339: aload_2
       340: areturn
      LineNumberTable:
        line 420: 0
        line 421: 8
        line 423: 19
        line 424: 27
        line 427: 156
        line 428: 185
        line 431: 188
        line 432: 241
        line 435: 244
        line 421: 329
        line 439: 339
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27     302     4 attrs   Lorg/w3c/dom/NamedNodeMap;
           15     324     3 parameters_node   Lorg/w3c/dom/Node;
            0     341     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0     341     1     n   Lorg/w3c/dom/Node;
            8     333     2 parameters   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     333     2 parameters   Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;
      StackMapTable: number_of_entries = 10
        frame_type = 253 /* append */
          offset_delta = 15
          locals = [ class java/util/Map, class org/w3c/dom/Node ]
        frame_type = 254 /* append */
          offset_delta = 64
          locals = [ class org/w3c/dom/NamedNodeMap, class java/lang/String, int ]
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 13 /* same */
        frame_type = 27 /* same */
        frame_type = 31 /* same */
        frame_type = 55 /* same */
        frame_type = 248 /* chop */
          offset_delta = 84
        frame_type = 250 /* chop */
          offset_delta = 9
    Signature: #563                         // (Lorg/w3c/dom/Node;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;

  public default ext.mods.gameserver.model.location.Location parseLocation(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=2
         0: aload_1
         1: invokeinterface #33,  1           // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         6: astore_2
         7: aload_0
         8: aload_2
         9: ldc_w         #331                // String x
        12: invokeinterface #333,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
        17: invokevirtual #245                // Method java/lang/Integer.intValue:()I
        20: istore_3
        21: aload_0
        22: aload_2
        23: ldc_w         #336                // String y
        26: invokeinterface #333,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
        31: invokevirtual #245                // Method java/lang/Integer.intValue:()I
        34: istore        4
        36: aload_0
        37: aload_2
        38: ldc_w         #404                // String z
        41: invokeinterface #333,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
        46: invokevirtual #245                // Method java/lang/Integer.intValue:()I
        49: istore        5
        51: new           #347                // class ext/mods/gameserver/model/location/Location
        54: dup
        55: iload_3
        56: iload         4
        58: iload         5
        60: invokespecial #352                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        63: areturn
      LineNumberTable:
        line 444: 0
        line 445: 7
        line 446: 21
        line 447: 36
        line 449: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      64     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      64     1     n   Lorg/w3c/dom/Node;
            7      57     2 attrs   Lorg/w3c/dom/NamedNodeMap;
           21      43     3     x   I
           36      28     4     y   I
           51      13     5     z   I

  public default ext.mods.gameserver.model.location.SpawnLocation parseSpawnLocation(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/SpawnLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=2
         0: aload_1
         1: invokeinterface #33,  1           // InterfaceMethod org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
         6: astore_2
         7: aload_0
         8: aload_2
         9: ldc_w         #331                // String x
        12: invokeinterface #333,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
        17: invokevirtual #245                // Method java/lang/Integer.intValue:()I
        20: istore_3
        21: aload_0
        22: aload_2
        23: ldc_w         #336                // String y
        26: invokeinterface #333,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
        31: invokevirtual #245                // Method java/lang/Integer.intValue:()I
        34: istore        4
        36: aload_0
        37: aload_2
        38: ldc_w         #404                // String z
        41: invokeinterface #333,  3          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
        46: invokevirtual #245                // Method java/lang/Integer.intValue:()I
        49: istore        5
        51: aload_0
        52: aload_2
        53: ldc_w         #406                // String heading
        56: iconst_0
        57: invokestatic  #188                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        60: invokeinterface #259,  4          // InterfaceMethod parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
        65: invokevirtual #245                // Method java/lang/Integer.intValue:()I
        68: istore        6
        70: new           #355                // class ext/mods/gameserver/model/location/SpawnLocation
        73: dup
        74: iload_3
        75: iload         4
        77: iload         5
        79: iload         6
        81: invokespecial #357                // Method ext/mods/gameserver/model/location/SpawnLocation."<init>":(IIII)V
        84: areturn
      LineNumberTable:
        line 454: 0
        line 455: 7
        line 456: 21
        line 457: 36
        line 458: 51
        line 460: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      85     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      85     1     n   Lorg/w3c/dom/Node;
            7      78     2 attrs   Lorg/w3c/dom/NamedNodeMap;
           21      64     3     x   I
           36      49     4     y   I
           51      34     5     z   I
           70      15     6 heading   I

  public default void forEach(org.w3c.dom.Node, java.util.function.Consumer<org.w3c.dom.Node>);
    descriptor: (Lorg/w3c/dom/Node;Ljava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokedynamic #411,  0            // InvokeDynamic #1:test:()Ljava/util/function/Predicate;
         7: aload_2
         8: invokeinterface #415,  4          // InterfaceMethod forEach:(Lorg/w3c/dom/Node;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 465: 0
        line 466: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      14     1  node   Lorg/w3c/dom/Node;
            0      14     2 action   Ljava/util/function/Consumer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      14     2 action   Ljava/util/function/Consumer<Lorg/w3c/dom/Node;>;
    Signature: #570                         // (Lorg/w3c/dom/Node;Ljava/util/function/Consumer<Lorg/w3c/dom/Node;>;)V

  public default void forEach(org.w3c.dom.Node, java.lang.String, java.util.function.Consumer<org.w3c.dom.Node>);
    descriptor: (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokedynamic #418,  0            // InvokeDynamic #2:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
         8: aload_3
         9: invokeinterface #415,  4          // InterfaceMethod forEach:(Lorg/w3c/dom/Node;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
        14: return
      LineNumberTable:
        line 470: 0
        line 484: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      15     1  node   Lorg/w3c/dom/Node;
            0      15     2 nodeName   Ljava/lang/String;
            0      15     3 action   Ljava/util/function/Consumer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      15     3 action   Ljava/util/function/Consumer<Lorg/w3c/dom/Node;>;
    Signature: #573                         // (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer<Lorg/w3c/dom/Node;>;)V

  public default void forEach(org.w3c.dom.Node, java.util.function.Predicate<org.w3c.dom.Node>, java.util.function.Consumer<org.w3c.dom.Node>);
    descriptor: (Lorg/w3c/dom/Node;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=4
         0: aload_1
         1: invokeinterface #421,  1          // InterfaceMethod org/w3c/dom/Node.getChildNodes:()Lorg/w3c/dom/NodeList;
         6: astore        4
         8: iconst_0
         9: istore        5
        11: iload         5
        13: aload         4
        15: invokeinterface #425,  1          // InterfaceMethod org/w3c/dom/NodeList.getLength:()I
        20: if_icmpge     59
        23: aload         4
        25: iload         5
        27: invokeinterface #428,  2          // InterfaceMethod org/w3c/dom/NodeList.item:(I)Lorg/w3c/dom/Node;
        32: astore        6
        34: aload_2
        35: aload         6
        37: invokeinterface #429,  2          // InterfaceMethod java/util/function/Predicate.test:(Ljava/lang/Object;)Z
        42: ifeq          53
        45: aload_3
        46: aload         6
        48: invokeinterface #433,  2          // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
        53: iinc          5, 1
        56: goto          11
        59: return
      LineNumberTable:
        line 488: 0
        line 489: 8
        line 491: 23
        line 492: 34
        line 493: 45
        line 489: 53
        line 495: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34      19     6 targetNode   Lorg/w3c/dom/Node;
           11      48     5     i   I
            0      60     0  this   Lext/mods/commons/data/xml/IXmlReader;
            0      60     1  node   Lorg/w3c/dom/Node;
            0      60     2 filter   Ljava/util/function/Predicate;
            0      60     3 action   Ljava/util/function/Consumer;
            8      52     4  list   Lorg/w3c/dom/NodeList;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      60     2 filter   Ljava/util/function/Predicate<Lorg/w3c/dom/Node;>;
            0      60     3 action   Ljava/util/function/Consumer<Lorg/w3c/dom/Node;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 11
          locals = [ class org/w3c/dom/NodeList, int ]
        frame_type = 41 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
    Signature: #580                         // (Lorg/w3c/dom/Node;Ljava/util/function/Predicate<Lorg/w3c/dom/Node;>;Ljava/util/function/Consumer<Lorg/w3c/dom/Node;>;)V

  public static boolean isNode(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokeinterface #438,  1          // InterfaceMethod org/w3c/dom/Node.getNodeType:()S
         6: iconst_1
         7: if_icmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 499: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  node   Lorg/w3c/dom/Node;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public static boolean isText(org.w3c.dom.Node);
    descriptor: (Lorg/w3c/dom/Node;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokeinterface #438,  1          // InterfaceMethod org/w3c/dom/Node.getNodeType:()S
         6: iconst_3
         7: if_icmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 504: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  node   Lorg/w3c/dom/Node;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #112                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #14                 // class ext/mods/commons/data/xml/IXmlReader
         6: invokevirtual #454                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #457                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #103                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 61: 0
}
SourceFile: "IXmlReader.java"
NestMembers:
  ext/mods/commons/data/xml/IXmlReader$XMLErrorHandler
  ext/mods/commons/data/xml/IXmlReader$1
BootstrapMethods:
  0: #616 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #602 (Ljava/lang/Object;)V
      #603 REF_invokeInterface ext/mods/commons/data/xml/IXmlReader.lambda$parseFile$0:(ZZZLjava/nio/file/Path;)V
      #606 (Ljava/nio/file/Path;)V
  1: #616 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #608 (Ljava/lang/Object;)Z
      #609 REF_invokeStatic ext/mods/commons/data/xml/IXmlReader.lambda$forEach$0:(Lorg/w3c/dom/Node;)Z
      #612 (Lorg/w3c/dom/Node;)Z
  2: #616 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #608 (Ljava/lang/Object;)Z
      #613 REF_invokeStatic ext/mods/commons/data/xml/IXmlReader.lambda$forEach$1:(Ljava/lang/String;Lorg/w3c/dom/Node;)Z
      #612 (Lorg/w3c/dom/Node;)Z
InnerClasses:
  #82;                                    // class ext/mods/commons/data/xml/IXmlReader$1
  public static #624= #156 of #14;        // XMLErrorHandler=class ext/mods/commons/data/xml/IXmlReader$XMLErrorHandler of class ext/mods/commons/data/xml/IXmlReader
  public static final #629= #625 of #627; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
