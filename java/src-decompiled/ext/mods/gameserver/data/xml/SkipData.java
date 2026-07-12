// Bytecode for: ext.mods.gameserver.data.xml.SkipData
// File: ext\mods\gameserver\data\xml\SkipData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/SkipData.class
  Last modified 9 de jul de 2026; size 3283 bytes
  MD5 checksum 0df8e95efeb7d4ced63ca91eaa99ebb7
  Compiled from "SkipData.java"
public class ext.mods.gameserver.data.xml.SkipData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/xml/SkipData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 9, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/data/xml/SkipData.load:()V
    #8 = Class              #10           // ext/mods/gameserver/data/xml/SkipData
    #9 = NameAndType        #11:#6        // load:()V
   #10 = Utf8               ext/mods/gameserver/data/xml/SkipData
   #11 = Utf8               load
   #12 = String             #13           // xml/skippingItems.xml
   #13 = Utf8               xml/skippingItems.xml
   #14 = Methodref          #8.#15        // ext/mods/gameserver/data/xml/SkipData.parseDataFile:(Ljava/lang/String;)V
   #15 = NameAndType        #16:#17       // parseDataFile:(Ljava/lang/String;)V
   #16 = Utf8               parseDataFile
   #17 = Utf8               (Ljava/lang/String;)V
   #18 = String             #19           // list
   #19 = Utf8               list
   #20 = InvokeDynamic      #0:#21        // #0:accept:(Lext/mods/gameserver/data/xml/SkipData;)Ljava/util/function/Consumer;
   #21 = NameAndType        #22:#23       // accept:(Lext/mods/gameserver/data/xml/SkipData;)Ljava/util/function/Consumer;
   #22 = Utf8               accept
   #23 = Utf8               (Lext/mods/gameserver/data/xml/SkipData;)Ljava/util/function/Consumer;
   #24 = Methodref          #8.#25        // ext/mods/gameserver/data/xml/SkipData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #25 = NameAndType        #26:#27       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #26 = Utf8               forEach
   #27 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #28 = Fieldref           #8.#29        // ext/mods/gameserver/data/xml/SkipData._skip:Ljava/util/List;
   #29 = NameAndType        #30:#31       // _skip:Ljava/util/List;
   #30 = Utf8               _skip
   #31 = Utf8               Ljava/util/List;
   #32 = Methodref          #33.#34       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #33 = Class              #35           // java/lang/Integer
   #34 = NameAndType        #36:#37       // valueOf:(I)Ljava/lang/Integer;
   #35 = Utf8               java/lang/Integer
   #36 = Utf8               valueOf
   #37 = Utf8               (I)Ljava/lang/Integer;
   #38 = InterfaceMethodref #39.#40       // java/util/List.contains:(Ljava/lang/Object;)Z
   #39 = Class              #41           // java/util/List
   #40 = NameAndType        #42:#43       // contains:(Ljava/lang/Object;)Z
   #41 = Utf8               java/util/List
   #42 = Utf8               contains
   #43 = Utf8               (Ljava/lang/Object;)Z
   #44 = Fieldref           #8.#45        // ext/mods/gameserver/data/xml/SkipData._enabled:Z
   #45 = NameAndType        #46:#47       // _enabled:Z
   #46 = Utf8               _enabled
   #47 = Utf8               Z
   #48 = Fieldref           #49.#50       // ext/mods/gameserver/data/xml/SkipData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/SkipData;
   #49 = Class              #51           // ext/mods/gameserver/data/xml/SkipData$SingletonHolder
   #50 = NameAndType        #52:#53       // INSTANCE:Lext/mods/gameserver/data/xml/SkipData;
   #51 = Utf8               ext/mods/gameserver/data/xml/SkipData$SingletonHolder
   #52 = Utf8               INSTANCE
   #53 = Utf8               Lext/mods/gameserver/data/xml/SkipData;
   #54 = Methodref          #8.#55        // ext/mods/gameserver/data/xml/SkipData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #55 = NameAndType        #56:#57       // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #56 = Utf8               parseAttributes
   #57 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #58 = String             #59           // enabled
   #59 = Utf8               enabled
   #60 = Methodref          #61.#62       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
   #61 = Class              #63           // ext/mods/commons/data/StatSet
   #62 = NameAndType        #64:#65       // getBool:(Ljava/lang/String;Z)Z
   #63 = Utf8               ext/mods/commons/data/StatSet
   #64 = Utf8               getBool
   #65 = Utf8               (Ljava/lang/String;Z)Z
   #66 = String             #67           // item
   #67 = Utf8               item
   #68 = InvokeDynamic      #1:#21        // #1:accept:(Lext/mods/gameserver/data/xml/SkipData;)Ljava/util/function/Consumer;
   #69 = Fieldref           #8.#70        // ext/mods/gameserver/data/xml/SkipData.LOGGER:Lext/mods/commons/logging/CLogger;
   #70 = NameAndType        #71:#72       // LOGGER:Lext/mods/commons/logging/CLogger;
   #71 = Utf8               LOGGER
   #72 = Utf8               Lext/mods/commons/logging/CLogger;
   #73 = String             #74           // Loaded {} skip list templates.
   #74 = Utf8               Loaded {} skip list templates.
   #75 = InterfaceMethodref #39.#76       // java/util/List.size:()I
   #76 = NameAndType        #77:#78       // size:()I
   #77 = Utf8               size
   #78 = Utf8               ()I
   #79 = Methodref          #80.#81       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #80 = Class              #82           // ext/mods/commons/logging/CLogger
   #81 = NameAndType        #83:#84       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #82 = Utf8               ext/mods/commons/logging/CLogger
   #83 = Utf8               info
   #84 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #85 = String             #86           // Skipping items list is disabled. No items will be loaded from this list.
   #86 = Utf8               Skipping items list is disabled. No items will be loaded from this list.
   #87 = Methodref          #80.#88       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #88 = NameAndType        #89:#90       // warn:(Ljava/lang/Object;)V
   #89 = Utf8               warn
   #90 = Utf8               (Ljava/lang/Object;)V
   #91 = String             #92           // id
   #92 = Utf8               id
   #93 = Methodref          #61.#94       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #94 = NameAndType        #95:#96       // getInteger:(Ljava/lang/String;)I
   #95 = Utf8               getInteger
   #96 = Utf8               (Ljava/lang/String;)I
   #97 = InterfaceMethodref #39.#98       // java/util/List.add:(Ljava/lang/Object;)Z
   #98 = NameAndType        #99:#43       // add:(Ljava/lang/Object;)Z
   #99 = Utf8               add
  #100 = Class              #101          // java/util/ArrayList
  #101 = Utf8               java/util/ArrayList
  #102 = Methodref          #100.#3       // java/util/ArrayList."<init>":()V
  #103 = Class              #104          // ext/mods/commons/data/xml/IXmlReader
  #104 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #105 = Utf8               Signature
  #106 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #107 = Utf8               Code
  #108 = Utf8               LineNumberTable
  #109 = Utf8               LocalVariableTable
  #110 = Utf8               this
  #111 = Utf8               parseDocument
  #112 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #113 = Utf8               doc
  #114 = Utf8               Lorg/w3c/dom/Document;
  #115 = Utf8               path
  #116 = Utf8               Ljava/nio/file/Path;
  #117 = Utf8               isSkipped
  #118 = Utf8               (I)Z
  #119 = Utf8               itemId
  #120 = Utf8               I
  #121 = Utf8               isEnabled
  #122 = Utf8               ()Z
  #123 = Utf8               getInstance
  #124 = Utf8               ()Lext/mods/gameserver/data/xml/SkipData;
  #125 = Utf8               lambda$parseDocument$0
  #126 = Utf8               (Lorg/w3c/dom/Node;)V
  #127 = Utf8               listNode
  #128 = Utf8               Lorg/w3c/dom/Node;
  #129 = Utf8               set
  #130 = Utf8               Lext/mods/commons/data/StatSet;
  #131 = Utf8               StackMapTable
  #132 = Utf8               lambda$parseDocument$1
  #133 = Utf8               itemNode
  #134 = Utf8               itemSet
  #135 = Utf8               <clinit>
  #136 = Utf8               SourceFile
  #137 = Utf8               SkipData.java
  #138 = Utf8               NestMembers
  #139 = Utf8               BootstrapMethods
  #140 = MethodType         #90           //  (Ljava/lang/Object;)V
  #141 = MethodHandle       5:#142        // REF_invokeVirtual ext/mods/gameserver/data/xml/SkipData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #142 = Methodref          #8.#143       // ext/mods/gameserver/data/xml/SkipData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #143 = NameAndType        #125:#126     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #144 = MethodType         #126          //  (Lorg/w3c/dom/Node;)V
  #145 = MethodHandle       5:#146        // REF_invokeVirtual ext/mods/gameserver/data/xml/SkipData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #146 = Methodref          #8.#147       // ext/mods/gameserver/data/xml/SkipData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #147 = NameAndType        #132:#126     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #148 = MethodHandle       6:#149        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #149 = Methodref          #150.#151     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #150 = Class              #152          // java/lang/invoke/LambdaMetafactory
  #151 = NameAndType        #153:#154     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #152 = Utf8               java/lang/invoke/LambdaMetafactory
  #153 = Utf8               metafactory
  #154 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #155 = Utf8               InnerClasses
  #156 = Utf8               SingletonHolder
  #157 = Class              #158          // java/lang/invoke/MethodHandles$Lookup
  #158 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #159 = Class              #160          // java/lang/invoke/MethodHandles
  #160 = Utf8               java/lang/invoke/MethodHandles
  #161 = Utf8               Lookup
{
  public ext.mods.gameserver.data.xml.SkipData();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokevirtual #7                  // Method load:()V
         8: return
      LineNumberTable:
        line 35: 0
        line 36: 4
        line 37: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/data/xml/SkipData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ldc           #12                 // String xml/skippingItems.xml
         3: invokevirtual #14                 // Method parseDataFile:(Ljava/lang/String;)V
         6: return
      LineNumberTable:
        line 42: 0
        line 43: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/data/xml/SkipData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #18                 // String list
         4: aload_0
         5: invokedynamic #20,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/SkipData;)Ljava/util/function/Consumer;
        10: invokevirtual #24                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 48: 0
        line 66: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/SkipData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public boolean isSkipped(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #28                 // Field _skip:Ljava/util/List;
         3: iload_1
         4: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         7: invokeinterface #38,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        12: ireturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/data/xml/SkipData;
            0      13     1 itemId   I

  public boolean isEnabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _enabled:Z
         4: ireturn
      LineNumberTable:
        line 75: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/xml/SkipData;

  public static ext.mods.gameserver.data.xml.SkipData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/SkipData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #48                 // Field ext/mods/gameserver/data/xml/SkipData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/SkipData;
         3: areturn
      LineNumberTable:
        line 80: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #100                // class java/util/ArrayList
         3: dup
         4: invokespecial #102                // Method java/util/ArrayList."<init>":()V
         7: putstatic     #28                 // Field _skip:Ljava/util/List;
        10: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "SkipData.java"
NestMembers:
  ext/mods/gameserver/data/xml/SkipData$SingletonHolder
BootstrapMethods:
  0: #148 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #140 (Ljava/lang/Object;)V
      #141 REF_invokeVirtual ext/mods/gameserver/data/xml/SkipData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #144 (Lorg/w3c/dom/Node;)V
  1: #148 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #140 (Ljava/lang/Object;)V
      #145 REF_invokeVirtual ext/mods/gameserver/data/xml/SkipData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #144 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #161= #157 of #159; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
