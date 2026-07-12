// Bytecode for: ext.mods.dressme.DressMeData
// File: ext\mods\dressme\DressMeData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dressme/DressMeData.class
  Last modified 9 de jul de 2026; size 4910 bytes
  MD5 checksum eac7ee7dba9c3013ebd57bc1dee9b0cc
  Compiled from "DressMeData.java"
public class ext.mods.dressme.DressMeData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/dressme/DressMeData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 13, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/dressme/DressMeData._entries:Ljava/util/List;
   #11 = Class              #13           // ext/mods/dressme/DressMeData
   #12 = NameAndType        #14:#15       // _entries:Ljava/util/List;
   #13 = Utf8               ext/mods/dressme/DressMeData
   #14 = Utf8               _entries
   #15 = Utf8               Ljava/util/List;
   #16 = Methodref          #11.#17       // ext/mods/dressme/DressMeData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = InterfaceMethodref #20.#21       // java/util/List.clear:()V
   #20 = Class              #22           // java/util/List
   #21 = NameAndType        #23:#6        // clear:()V
   #22 = Utf8               java/util/List
   #23 = Utf8               clear
   #24 = String             #25           // custom/mods/DressMeData.xml
   #25 = Utf8               custom/mods/DressMeData.xml
   #26 = Methodref          #11.#27       // ext/mods/dressme/DressMeData.parseDataFile:(Ljava/lang/String;)V
   #27 = NameAndType        #28:#29       // parseDataFile:(Ljava/lang/String;)V
   #28 = Utf8               parseDataFile
   #29 = Utf8               (Ljava/lang/String;)V
   #30 = Fieldref           #11.#31       // ext/mods/dressme/DressMeData.LOGGER:Lext/mods/commons/logging/CLogger;
   #31 = NameAndType        #32:#33       // LOGGER:Lext/mods/commons/logging/CLogger;
   #32 = Utf8               LOGGER
   #33 = Utf8               Lext/mods/commons/logging/CLogger;
   #34 = InterfaceMethodref #20.#35       // java/util/List.size:()I
   #35 = NameAndType        #36:#37       // size:()I
   #36 = Utf8               size
   #37 = Utf8               ()I
   #38 = InvokeDynamic      #0:#39        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #39 = NameAndType        #40:#41       // makeConcatWithConstants:(I)Ljava/lang/String;
   #40 = Utf8               makeConcatWithConstants
   #41 = Utf8               (I)Ljava/lang/String;
   #42 = Methodref          #43.#44       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #43 = Class              #45           // ext/mods/commons/logging/CLogger
   #44 = NameAndType        #46:#47       // info:(Ljava/lang/Object;)V
   #45 = Utf8               ext/mods/commons/logging/CLogger
   #46 = Utf8               info
   #47 = Utf8               (Ljava/lang/Object;)V
   #48 = String             #49           // dressMeList
   #49 = Utf8               dressMeList
   #50 = InvokeDynamic      #1:#51        // #1:accept:(Lext/mods/dressme/DressMeData;)Ljava/util/function/Consumer;
   #51 = NameAndType        #52:#53       // accept:(Lext/mods/dressme/DressMeData;)Ljava/util/function/Consumer;
   #52 = Utf8               accept
   #53 = Utf8               (Lext/mods/dressme/DressMeData;)Ljava/util/function/Consumer;
   #54 = Methodref          #11.#55       // ext/mods/dressme/DressMeData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #55 = NameAndType        #56:#57       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #56 = Utf8               forEach
   #57 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #58 = InterfaceMethodref #20.#59       // java/util/List.stream:()Ljava/util/stream/Stream;
   #59 = NameAndType        #60:#61       // stream:()Ljava/util/stream/Stream;
   #60 = Utf8               stream
   #61 = Utf8               ()Ljava/util/stream/Stream;
   #62 = InvokeDynamic      #2:#63        // #2:test:(I)Ljava/util/function/Predicate;
   #63 = NameAndType        #64:#65       // test:(I)Ljava/util/function/Predicate;
   #64 = Utf8               test
   #65 = Utf8               (I)Ljava/util/function/Predicate;
   #66 = InterfaceMethodref #67.#68       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #67 = Class              #69           // java/util/stream/Stream
   #68 = NameAndType        #70:#71       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #69 = Utf8               java/util/stream/Stream
   #70 = Utf8               filter
   #71 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #72 = InterfaceMethodref #67.#73       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #73 = NameAndType        #74:#75       // findFirst:()Ljava/util/Optional;
   #74 = Utf8               findFirst
   #75 = Utf8               ()Ljava/util/Optional;
   #76 = Methodref          #77.#78       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #77 = Class              #79           // java/util/Optional
   #78 = NameAndType        #80:#81       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #79 = Utf8               java/util/Optional
   #80 = Utf8               orElse
   #81 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #82 = Class              #83           // ext/mods/dressme/holder/DressMeHolder
   #83 = Utf8               ext/mods/dressme/holder/DressMeHolder
   #84 = Fieldref           #85.#86       // ext/mods/dressme/DressMeData$SingletonHolder.INSTANCE:Lext/mods/dressme/DressMeData;
   #85 = Class              #87           // ext/mods/dressme/DressMeData$SingletonHolder
   #86 = NameAndType        #88:#89       // INSTANCE:Lext/mods/dressme/DressMeData;
   #87 = Utf8               ext/mods/dressme/DressMeData$SingletonHolder
   #88 = Utf8               INSTANCE
   #89 = Utf8               Lext/mods/dressme/DressMeData;
   #90 = Methodref          #82.#91       // ext/mods/dressme/holder/DressMeHolder.getSkillId:()I
   #91 = NameAndType        #92:#37       // getSkillId:()I
   #92 = Utf8               getSkillId
   #93 = String             #94           // dress
   #94 = Utf8               dress
   #95 = InvokeDynamic      #3:#51        // #3:accept:(Lext/mods/dressme/DressMeData;)Ljava/util/function/Consumer;
   #96 = Methodref          #11.#97       // ext/mods/dressme/DressMeData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #97 = NameAndType        #98:#99       // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #98 = Utf8               parseAttributes
   #99 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #100 = Methodref          #82.#101      // ext/mods/dressme/holder/DressMeHolder."<init>":(Lext/mods/commons/data/StatSet;)V
  #101 = NameAndType        #5:#102       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #102 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #103 = String             #104          // visualSet
  #104 = Utf8               visualSet
  #105 = InvokeDynamic      #4:#106       // #4:accept:(Lext/mods/dressme/DressMeData;Lext/mods/dressme/holder/DressMeHolder;)Ljava/util/function/Consumer;
  #106 = NameAndType        #52:#107      // accept:(Lext/mods/dressme/DressMeData;Lext/mods/dressme/holder/DressMeHolder;)Ljava/util/function/Consumer;
  #107 = Utf8               (Lext/mods/dressme/DressMeData;Lext/mods/dressme/holder/DressMeHolder;)Ljava/util/function/Consumer;
  #108 = String             #109          // visualWep
  #109 = Utf8               visualWep
  #110 = InvokeDynamic      #5:#106       // #5:accept:(Lext/mods/dressme/DressMeData;Lext/mods/dressme/holder/DressMeHolder;)Ljava/util/function/Consumer;
  #111 = String             #112          // visualEffect
  #112 = Utf8               visualEffect
  #113 = InvokeDynamic      #6:#106       // #6:accept:(Lext/mods/dressme/DressMeData;Lext/mods/dressme/holder/DressMeHolder;)Ljava/util/function/Consumer;
  #114 = InterfaceMethodref #20.#115      // java/util/List.add:(Ljava/lang/Object;)Z
  #115 = NameAndType        #116:#117     // add:(Ljava/lang/Object;)Z
  #116 = Utf8               add
  #117 = Utf8               (Ljava/lang/Object;)Z
  #118 = Class              #119          // ext/mods/dressme/holder/DressMeEffectHolder
  #119 = Utf8               ext/mods/dressme/holder/DressMeEffectHolder
  #120 = Methodref          #118.#101     // ext/mods/dressme/holder/DressMeEffectHolder."<init>":(Lext/mods/commons/data/StatSet;)V
  #121 = Methodref          #82.#122      // ext/mods/dressme/holder/DressMeHolder.setEffect:(Lext/mods/dressme/holder/DressMeEffectHolder;)V
  #122 = NameAndType        #123:#124     // setEffect:(Lext/mods/dressme/holder/DressMeEffectHolder;)V
  #123 = Utf8               setEffect
  #124 = Utf8               (Lext/mods/dressme/holder/DressMeEffectHolder;)V
  #125 = Methodref          #82.#126      // ext/mods/dressme/holder/DressMeHolder.setWeaponSet:(Lext/mods/commons/data/StatSet;)V
  #126 = NameAndType        #127:#102     // setWeaponSet:(Lext/mods/commons/data/StatSet;)V
  #127 = Utf8               setWeaponSet
  #128 = Methodref          #82.#129      // ext/mods/dressme/holder/DressMeHolder.setVisualSet:(Lext/mods/commons/data/StatSet;)V
  #129 = NameAndType        #130:#102     // setVisualSet:(Lext/mods/commons/data/StatSet;)V
  #130 = Utf8               setVisualSet
  #131 = Class              #132          // ext/mods/commons/data/xml/IXmlReader
  #132 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #133 = Utf8               Signature
  #134 = Utf8               Ljava/util/List<Lext/mods/dressme/holder/DressMeHolder;>;
  #135 = Utf8               Code
  #136 = Utf8               LineNumberTable
  #137 = Utf8               LocalVariableTable
  #138 = Utf8               this
  #139 = Utf8               reload
  #140 = Utf8               parseDocument
  #141 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #142 = Utf8               doc
  #143 = Utf8               Lorg/w3c/dom/Document;
  #144 = Utf8               path
  #145 = Utf8               Ljava/nio/file/Path;
  #146 = Utf8               getEntries
  #147 = Utf8               ()Ljava/util/List;
  #148 = Utf8               ()Ljava/util/List<Lext/mods/dressme/holder/DressMeHolder;>;
  #149 = Utf8               getBySkillId
  #150 = Utf8               (I)Lext/mods/dressme/holder/DressMeHolder;
  #151 = Utf8               skillId
  #152 = Utf8               I
  #153 = Utf8               getInstance
  #154 = Utf8               ()Lext/mods/dressme/DressMeData;
  #155 = Utf8               lambda$getBySkillId$0
  #156 = Utf8               (ILext/mods/dressme/holder/DressMeHolder;)Z
  #157 = Utf8               d
  #158 = Utf8               Lext/mods/dressme/holder/DressMeHolder;
  #159 = Utf8               StackMapTable
  #160 = Utf8               lambda$parseDocument$0
  #161 = Utf8               (Lorg/w3c/dom/Node;)V
  #162 = Utf8               listNode
  #163 = Utf8               Lorg/w3c/dom/Node;
  #164 = Utf8               lambda$parseDocument$1
  #165 = Utf8               dressNode
  #166 = Utf8               attrs
  #167 = Utf8               Lext/mods/commons/data/StatSet;
  #168 = Utf8               holder
  #169 = Utf8               lambda$parseDocument$4
  #170 = Utf8               (Lext/mods/dressme/holder/DressMeHolder;Lorg/w3c/dom/Node;)V
  #171 = Utf8               fxNode
  #172 = Utf8               lambda$parseDocument$3
  #173 = Utf8               wepNode
  #174 = Utf8               lambda$parseDocument$2
  #175 = Utf8               setNode
  #176 = Utf8               SourceFile
  #177 = Utf8               DressMeData.java
  #178 = Utf8               NestMembers
  #179 = Utf8               BootstrapMethods
  #180 = String             #181          // Loaded {\u0001} DressMe entries.
  #181 = Utf8               Loaded {\u0001} DressMe entries.
  #182 = MethodType         #47           //  (Ljava/lang/Object;)V
  #183 = MethodHandle       5:#184        // REF_invokeVirtual ext/mods/dressme/DressMeData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #184 = Methodref          #11.#185      // ext/mods/dressme/DressMeData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #185 = NameAndType        #160:#161     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #186 = MethodType         #161          //  (Lorg/w3c/dom/Node;)V
  #187 = MethodType         #117          //  (Ljava/lang/Object;)Z
  #188 = MethodHandle       6:#189        // REF_invokeStatic ext/mods/dressme/DressMeData.lambda$getBySkillId$0:(ILext/mods/dressme/holder/DressMeHolder;)Z
  #189 = Methodref          #11.#190      // ext/mods/dressme/DressMeData.lambda$getBySkillId$0:(ILext/mods/dressme/holder/DressMeHolder;)Z
  #190 = NameAndType        #155:#156     // lambda$getBySkillId$0:(ILext/mods/dressme/holder/DressMeHolder;)Z
  #191 = MethodType         #192          //  (Lext/mods/dressme/holder/DressMeHolder;)Z
  #192 = Utf8               (Lext/mods/dressme/holder/DressMeHolder;)Z
  #193 = MethodHandle       5:#194        // REF_invokeVirtual ext/mods/dressme/DressMeData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #194 = Methodref          #11.#195      // ext/mods/dressme/DressMeData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #195 = NameAndType        #164:#161     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #196 = MethodHandle       5:#197        // REF_invokeVirtual ext/mods/dressme/DressMeData.lambda$parseDocument$2:(Lext/mods/dressme/holder/DressMeHolder;Lorg/w3c/dom/Node;)V
  #197 = Methodref          #11.#198      // ext/mods/dressme/DressMeData.lambda$parseDocument$2:(Lext/mods/dressme/holder/DressMeHolder;Lorg/w3c/dom/Node;)V
  #198 = NameAndType        #174:#170     // lambda$parseDocument$2:(Lext/mods/dressme/holder/DressMeHolder;Lorg/w3c/dom/Node;)V
  #199 = MethodHandle       5:#200        // REF_invokeVirtual ext/mods/dressme/DressMeData.lambda$parseDocument$3:(Lext/mods/dressme/holder/DressMeHolder;Lorg/w3c/dom/Node;)V
  #200 = Methodref          #11.#201      // ext/mods/dressme/DressMeData.lambda$parseDocument$3:(Lext/mods/dressme/holder/DressMeHolder;Lorg/w3c/dom/Node;)V
  #201 = NameAndType        #172:#170     // lambda$parseDocument$3:(Lext/mods/dressme/holder/DressMeHolder;Lorg/w3c/dom/Node;)V
  #202 = MethodHandle       5:#203        // REF_invokeVirtual ext/mods/dressme/DressMeData.lambda$parseDocument$4:(Lext/mods/dressme/holder/DressMeHolder;Lorg/w3c/dom/Node;)V
  #203 = Methodref          #11.#204      // ext/mods/dressme/DressMeData.lambda$parseDocument$4:(Lext/mods/dressme/holder/DressMeHolder;Lorg/w3c/dom/Node;)V
  #204 = NameAndType        #169:#170     // lambda$parseDocument$4:(Lext/mods/dressme/holder/DressMeHolder;Lorg/w3c/dom/Node;)V
  #205 = MethodHandle       6:#206        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #206 = Methodref          #207.#208     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #207 = Class              #209          // java/lang/invoke/StringConcatFactory
  #208 = NameAndType        #40:#210      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #209 = Utf8               java/lang/invoke/StringConcatFactory
  #210 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #211 = MethodHandle       6:#212        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #212 = Methodref          #213.#214     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #213 = Class              #215          // java/lang/invoke/LambdaMetafactory
  #214 = NameAndType        #216:#217     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #215 = Utf8               java/lang/invoke/LambdaMetafactory
  #216 = Utf8               metafactory
  #217 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #218 = Utf8               InnerClasses
  #219 = Utf8               SingletonHolder
  #220 = Class              #221          // java/lang/invoke/MethodHandles$Lookup
  #221 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #222 = Class              #223          // java/lang/invoke/MethodHandles
  #223 = Utf8               java/lang/invoke/MethodHandles
  #224 = Utf8               Lookup
{
  public ext.mods.dressme.DressMeData();
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
        12: putfield      #10                 // Field _entries:Ljava/util/List;
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
            0      20     0  this   Lext/mods/dressme/DressMeData;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/List;
         4: invokeinterface #19,  1           // InterfaceMethod java/util/List.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 43: 0
        line 44: 9
        line 45: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/dressme/DressMeData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ldc           #24                 // String custom/mods/DressMeData.xml
         3: invokevirtual #26                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #30                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: aload_0
        10: getfield      #10                 // Field _entries:Ljava/util/List;
        13: invokeinterface #34,  1           // InterfaceMethod java/util/List.size:()I
        18: invokedynamic #38,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        23: invokevirtual #42                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        26: return
      LineNumberTable:
        line 51: 0
        line 52: 6
        line 53: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/dressme/DressMeData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #48                 // String dressMeList
         4: aload_0
         5: invokedynamic #50,  0             // InvokeDynamic #1:accept:(Lext/mods/dressme/DressMeData;)Ljava/util/function/Consumer;
        10: invokevirtual #54                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 58: 0
        line 70: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/dressme/DressMeData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public java.util.List<ext.mods.dressme.holder.DressMeHolder> getEntries();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/dressme/DressMeData;
    Signature: #148                         // ()Ljava/util/List<Lext/mods/dressme/holder/DressMeHolder;>;

  public ext.mods.dressme.holder.DressMeHolder getBySkillId(int);
    descriptor: (I)Lext/mods/dressme/holder/DressMeHolder;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/List;
         4: invokeinterface #58,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: invokedynamic #62,  0             // InvokeDynamic #2:test:(I)Ljava/util/function/Predicate;
        15: invokeinterface #66,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #72,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aconst_null
        26: invokevirtual #76                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #82                 // class ext/mods/dressme/holder/DressMeHolder
        32: areturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/dressme/DressMeData;
            0      33     1 skillId   I

  public static ext.mods.dressme.DressMeData getInstance();
    descriptor: ()Lext/mods/dressme/DressMeData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #84                 // Field ext/mods/dressme/DressMeData$SingletonHolder.INSTANCE:Lext/mods/dressme/DressMeData;
         3: areturn
      LineNumberTable:
        line 84: 0
}
SourceFile: "DressMeData.java"
NestMembers:
  ext/mods/dressme/DressMeData$SingletonHolder
BootstrapMethods:
  0: #205 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #180 Loaded {\u0001} DressMe entries.
  1: #211 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #182 (Ljava/lang/Object;)V
      #183 REF_invokeVirtual ext/mods/dressme/DressMeData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #186 (Lorg/w3c/dom/Node;)V
  2: #211 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #187 (Ljava/lang/Object;)Z
      #188 REF_invokeStatic ext/mods/dressme/DressMeData.lambda$getBySkillId$0:(ILext/mods/dressme/holder/DressMeHolder;)Z
      #191 (Lext/mods/dressme/holder/DressMeHolder;)Z
  3: #211 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #182 (Ljava/lang/Object;)V
      #193 REF_invokeVirtual ext/mods/dressme/DressMeData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #186 (Lorg/w3c/dom/Node;)V
  4: #211 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #182 (Ljava/lang/Object;)V
      #196 REF_invokeVirtual ext/mods/dressme/DressMeData.lambda$parseDocument$2:(Lext/mods/dressme/holder/DressMeHolder;Lorg/w3c/dom/Node;)V
      #186 (Lorg/w3c/dom/Node;)V
  5: #211 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #182 (Ljava/lang/Object;)V
      #199 REF_invokeVirtual ext/mods/dressme/DressMeData.lambda$parseDocument$3:(Lext/mods/dressme/holder/DressMeHolder;Lorg/w3c/dom/Node;)V
      #186 (Lorg/w3c/dom/Node;)V
  6: #211 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #182 (Ljava/lang/Object;)V
      #202 REF_invokeVirtual ext/mods/dressme/DressMeData.lambda$parseDocument$4:(Lext/mods/dressme/holder/DressMeHolder;Lorg/w3c/dom/Node;)V
      #186 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #224= #220 of #222; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
