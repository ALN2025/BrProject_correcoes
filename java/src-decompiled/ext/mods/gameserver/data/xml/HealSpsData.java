// Bytecode for: ext.mods.gameserver.data.xml.HealSpsData
// File: ext\mods\gameserver\data\xml\HealSpsData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/xml/HealSpsData.class
  Last modified 9 de jul de 2026; size 4551 bytes
  MD5 checksum 2aceb3611d0957b6f4036b12b0659bad
  Compiled from "HealSpsData.java"
public class ext.mods.gameserver.data.xml.HealSpsData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/xml/HealSpsData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 9, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/LinkedList
    #8 = Utf8               java/util/LinkedList
    #9 = Methodref          #7.#3         // java/util/LinkedList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/xml/HealSpsData._healSps:Ljava/util/LinkedList;
   #11 = Class              #13           // ext/mods/gameserver/data/xml/HealSpsData
   #12 = NameAndType        #14:#15       // _healSps:Ljava/util/LinkedList;
   #13 = Utf8               ext/mods/gameserver/data/xml/HealSpsData
   #14 = Utf8               _healSps
   #15 = Utf8               Ljava/util/LinkedList;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/xml/HealSpsData.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = String             #20           // xml/healSps.xml
   #20 = Utf8               xml/healSps.xml
   #21 = Methodref          #11.#22       // ext/mods/gameserver/data/xml/HealSpsData.parseDataFile:(Ljava/lang/String;)V
   #22 = NameAndType        #23:#24       // parseDataFile:(Ljava/lang/String;)V
   #23 = Utf8               parseDataFile
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Fieldref           #11.#26       // ext/mods/gameserver/data/xml/HealSpsData.LOGGER:Lext/mods/commons/logging/CLogger;
   #26 = NameAndType        #27:#28       // LOGGER:Lext/mods/commons/logging/CLogger;
   #27 = Utf8               LOGGER
   #28 = Utf8               Lext/mods/commons/logging/CLogger;
   #29 = String             #30           // Loaded {} healSps entries.
   #30 = Utf8               Loaded {} healSps entries.
   #31 = Methodref          #7.#32        // java/util/LinkedList.size:()I
   #32 = NameAndType        #33:#34       // size:()I
   #33 = Utf8               size
   #34 = Utf8               ()I
   #35 = Methodref          #36.#37       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #36 = Class              #38           // java/lang/Integer
   #37 = NameAndType        #39:#40       // valueOf:(I)Ljava/lang/Integer;
   #38 = Utf8               java/lang/Integer
   #39 = Utf8               valueOf
   #40 = Utf8               (I)Ljava/lang/Integer;
   #41 = Methodref          #42.#43       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #42 = Class              #44           // ext/mods/commons/logging/CLogger
   #43 = NameAndType        #45:#46       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #44 = Utf8               ext/mods/commons/logging/CLogger
   #45 = Utf8               info
   #46 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #47 = String             #48           // list
   #48 = Utf8               list
   #49 = InvokeDynamic      #0:#50        // #0:accept:(Lext/mods/gameserver/data/xml/HealSpsData;)Ljava/util/function/Consumer;
   #50 = NameAndType        #51:#52       // accept:(Lext/mods/gameserver/data/xml/HealSpsData;)Ljava/util/function/Consumer;
   #51 = Utf8               accept
   #52 = Utf8               (Lext/mods/gameserver/data/xml/HealSpsData;)Ljava/util/function/Consumer;
   #53 = Methodref          #11.#54       // ext/mods/gameserver/data/xml/HealSpsData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #54 = NameAndType        #55:#56       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #55 = Utf8               forEach
   #56 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #57 = Methodref          #7.#58        // java/util/LinkedList.stream:()Ljava/util/stream/Stream;
   #58 = NameAndType        #59:#60       // stream:()Ljava/util/stream/Stream;
   #59 = Utf8               stream
   #60 = Utf8               ()Ljava/util/stream/Stream;
   #61 = InvokeDynamic      #1:#62        // #1:test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
   #62 = NameAndType        #63:#64       // test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
   #63 = Utf8               test
   #64 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
   #65 = InterfaceMethodref #66.#67       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #66 = Class              #68           // java/util/stream/Stream
   #67 = NameAndType        #69:#70       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #68 = Utf8               java/util/stream/Stream
   #69 = Utf8               filter
   #70 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #71 = InterfaceMethodref #66.#72       // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #72 = NameAndType        #73:#74       // findFirst:()Ljava/util/Optional;
   #73 = Utf8               findFirst
   #74 = Utf8               ()Ljava/util/Optional;
   #75 = Methodref          #76.#77       // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #76 = Class              #78           // java/util/Optional
   #77 = NameAndType        #79:#80       // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #78 = Utf8               java/util/Optional
   #79 = Utf8               orElse
   #80 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #81 = Class              #82           // ext/mods/gameserver/model/records/HealSps
   #82 = Utf8               ext/mods/gameserver/model/records/HealSps
   #83 = Methodref          #84.#85       // ext/mods/gameserver/skills/L2Skill.getMagicLevel:()I
   #84 = Class              #86           // ext/mods/gameserver/skills/L2Skill
   #85 = NameAndType        #87:#34       // getMagicLevel:()I
   #86 = Utf8               ext/mods/gameserver/skills/L2Skill
   #87 = Utf8               getMagicLevel
   #88 = InvokeDynamic      #2:#62        // #2:test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
   #89 = InvokeDynamic      #3:#90        // #3:apply:()Ljava/util/function/Function;
   #90 = NameAndType        #91:#92       // apply:()Ljava/util/function/Function;
   #91 = Utf8               apply
   #92 = Utf8               ()Ljava/util/function/Function;
   #93 = InterfaceMethodref #94.#95       // java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
   #94 = Class              #96           // java/util/Comparator
   #95 = NameAndType        #97:#98       // comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
   #96 = Utf8               java/util/Comparator
   #97 = Utf8               comparing
   #98 = Utf8               (Ljava/util/function/Function;)Ljava/util/Comparator;
   #99 = InterfaceMethodref #66.#100      // java/util/stream/Stream.max:(Ljava/util/Comparator;)Ljava/util/Optional;
  #100 = NameAndType        #101:#102     // max:(Ljava/util/Comparator;)Ljava/util/Optional;
  #101 = Utf8               max
  #102 = Utf8               (Ljava/util/Comparator;)Ljava/util/Optional;
  #103 = Methodref          #81.#104      // ext/mods/gameserver/model/records/HealSps.correction:()I
  #104 = NameAndType        #105:#34      // correction:()I
  #105 = Utf8               correction
  #106 = Methodref          #81.#107      // ext/mods/gameserver/model/records/HealSps.neededMatk:()I
  #107 = NameAndType        #108:#34      // neededMatk:()I
  #108 = Utf8               neededMatk
  #109 = Double             2.0d
  #111 = Fieldref           #112.#113     // ext/mods/gameserver/data/xml/HealSpsData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/HealSpsData;
  #112 = Class              #114          // ext/mods/gameserver/data/xml/HealSpsData$SingletonHolder
  #113 = NameAndType        #115:#116     // INSTANCE:Lext/mods/gameserver/data/xml/HealSpsData;
  #114 = Utf8               ext/mods/gameserver/data/xml/HealSpsData$SingletonHolder
  #115 = Utf8               INSTANCE
  #116 = Utf8               Lext/mods/gameserver/data/xml/HealSpsData;
  #117 = Methodref          #81.#118      // ext/mods/gameserver/model/records/HealSps.magicLevel:()I
  #118 = NameAndType        #119:#34      // magicLevel:()I
  #119 = Utf8               magicLevel
  #120 = Methodref          #81.#121      // ext/mods/gameserver/model/records/HealSps.skillId:()I
  #121 = NameAndType        #122:#34      // skillId:()I
  #122 = Utf8               skillId
  #123 = Methodref          #84.#124      // ext/mods/gameserver/skills/L2Skill.getId:()I
  #124 = NameAndType        #125:#34      // getId:()I
  #125 = Utf8               getId
  #126 = Methodref          #81.#127      // ext/mods/gameserver/model/records/HealSps.skillLevel:()I
  #127 = NameAndType        #128:#34      // skillLevel:()I
  #128 = Utf8               skillLevel
  #129 = Methodref          #84.#130      // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #130 = NameAndType        #131:#34      // getLevel:()I
  #131 = Utf8               getLevel
  #132 = String             #133          // healSps
  #133 = Utf8               healSps
  #134 = InvokeDynamic      #4:#50        // #4:accept:(Lext/mods/gameserver/data/xml/HealSpsData;)Ljava/util/function/Consumer;
  #135 = Methodref          #11.#136      // ext/mods/gameserver/data/xml/HealSpsData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #136 = NameAndType        #137:#138     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #137 = Utf8               parseAttributes
  #138 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #139 = Methodref          #81.#140      // ext/mods/gameserver/model/records/HealSps."<init>":(Lext/mods/commons/data/StatSet;)V
  #140 = NameAndType        #5:#141       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #141 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #142 = Methodref          #7.#143       // java/util/LinkedList.add:(Ljava/lang/Object;)Z
  #143 = NameAndType        #144:#145     // add:(Ljava/lang/Object;)Z
  #144 = Utf8               add
  #145 = Utf8               (Ljava/lang/Object;)Z
  #146 = Class              #147          // ext/mods/commons/data/xml/IXmlReader
  #147 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #148 = Utf8               Signature
  #149 = Utf8               Ljava/util/LinkedList<Lext/mods/gameserver/model/records/HealSps;>;
  #150 = Utf8               Code
  #151 = Utf8               LineNumberTable
  #152 = Utf8               LocalVariableTable
  #153 = Utf8               this
  #154 = Utf8               parseDocument
  #155 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #156 = Utf8               doc
  #157 = Utf8               Lorg/w3c/dom/Document;
  #158 = Utf8               path
  #159 = Utf8               Ljava/nio/file/Path;
  #160 = Utf8               calculateHealSps
  #161 = Utf8               (Lext/mods/gameserver/skills/L2Skill;I)D
  #162 = Utf8               skill
  #163 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #164 = Utf8               mAtk
  #165 = Utf8               I
  #166 = Utf8               Lext/mods/gameserver/model/records/HealSps;
  #167 = Utf8               amount
  #168 = Utf8               D
  #169 = Utf8               mAtkDiff
  #170 = Utf8               StackMapTable
  #171 = Utf8               getInstance
  #172 = Utf8               ()Lext/mods/gameserver/data/xml/HealSpsData;
  #173 = Utf8               lambda$calculateHealSps$1
  #174 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/HealSps;)Z
  #175 = Utf8               h
  #176 = Utf8               lambda$calculateHealSps$0
  #177 = Utf8               lambda$parseDocument$0
  #178 = Utf8               (Lorg/w3c/dom/Node;)V
  #179 = Utf8               listNode
  #180 = Utf8               Lorg/w3c/dom/Node;
  #181 = Utf8               lambda$parseDocument$1
  #182 = Utf8               healSpsNode
  #183 = Utf8               SourceFile
  #184 = Utf8               HealSpsData.java
  #185 = Utf8               NestMembers
  #186 = Utf8               BootstrapMethods
  #187 = MethodType         #188          //  (Ljava/lang/Object;)V
  #188 = Utf8               (Ljava/lang/Object;)V
  #189 = MethodHandle       5:#190        // REF_invokeVirtual ext/mods/gameserver/data/xml/HealSpsData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #190 = Methodref          #11.#191      // ext/mods/gameserver/data/xml/HealSpsData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #191 = NameAndType        #177:#178     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #192 = MethodType         #178          //  (Lorg/w3c/dom/Node;)V
  #193 = MethodType         #145          //  (Ljava/lang/Object;)Z
  #194 = MethodHandle       6:#195        // REF_invokeStatic ext/mods/gameserver/data/xml/HealSpsData.lambda$calculateHealSps$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/HealSps;)Z
  #195 = Methodref          #11.#196      // ext/mods/gameserver/data/xml/HealSpsData.lambda$calculateHealSps$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/HealSps;)Z
  #196 = NameAndType        #176:#174     // lambda$calculateHealSps$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/HealSps;)Z
  #197 = MethodType         #198          //  (Lext/mods/gameserver/model/records/HealSps;)Z
  #198 = Utf8               (Lext/mods/gameserver/model/records/HealSps;)Z
  #199 = MethodHandle       6:#200        // REF_invokeStatic ext/mods/gameserver/data/xml/HealSpsData.lambda$calculateHealSps$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/HealSps;)Z
  #200 = Methodref          #11.#201      // ext/mods/gameserver/data/xml/HealSpsData.lambda$calculateHealSps$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/HealSps;)Z
  #201 = NameAndType        #173:#174     // lambda$calculateHealSps$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/HealSps;)Z
  #202 = MethodType         #80           //  (Ljava/lang/Object;)Ljava/lang/Object;
  #203 = MethodHandle       5:#117        // REF_invokeVirtual ext/mods/gameserver/model/records/HealSps.magicLevel:()I
  #204 = MethodType         #205          //  (Lext/mods/gameserver/model/records/HealSps;)Ljava/lang/Integer;
  #205 = Utf8               (Lext/mods/gameserver/model/records/HealSps;)Ljava/lang/Integer;
  #206 = MethodHandle       5:#207        // REF_invokeVirtual ext/mods/gameserver/data/xml/HealSpsData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #207 = Methodref          #11.#208      // ext/mods/gameserver/data/xml/HealSpsData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #208 = NameAndType        #181:#178     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #209 = MethodHandle       6:#210        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #210 = Methodref          #211.#212     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #211 = Class              #213          // java/lang/invoke/LambdaMetafactory
  #212 = NameAndType        #214:#215     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #213 = Utf8               java/lang/invoke/LambdaMetafactory
  #214 = Utf8               metafactory
  #215 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #216 = Utf8               InnerClasses
  #217 = Utf8               SingletonHolder
  #218 = Class              #219          // java/lang/invoke/MethodHandles$Lookup
  #219 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #220 = Class              #221          // java/lang/invoke/MethodHandles
  #221 = Utf8               java/lang/invoke/MethodHandles
  #222 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.xml.HealSpsData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/LinkedList
         8: dup
         9: invokespecial #9                  // Method java/util/LinkedList."<init>":()V
        12: putfield      #10                 // Field _healSps:Ljava/util/LinkedList;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: return
      LineNumberTable:
        line 39: 0
        line 36: 4
        line 40: 15
        line 41: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/xml/HealSpsData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #19                 // String xml/healSps.xml
         3: invokevirtual #21                 // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #25                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #29                 // String Loaded {} healSps entries.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _healSps:Ljava/util/LinkedList;
        21: invokevirtual #31                 // Method java/util/LinkedList.size:()I
        24: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        27: aastore
        28: invokevirtual #41                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        31: return
      LineNumberTable:
        line 46: 0
        line 47: 6
        line 48: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/data/xml/HealSpsData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #47                 // String list
         4: aload_0
         5: invokedynamic #49,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/xml/HealSpsData;)Ljava/util/function/Consumer;
        10: invokevirtual #53                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 53: 0
        line 54: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/xml/HealSpsData;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public double calculateHealSps(ext.mods.gameserver.skills.L2Skill, int);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;I)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _healSps:Ljava/util/LinkedList;
         4: invokevirtual #57                 // Method java/util/LinkedList.stream:()Ljava/util/stream/Stream;
         7: aload_1
         8: invokedynamic #61,  0             // InvokeDynamic #1:test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
        13: invokeinterface #65,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        18: invokeinterface #71,  1           // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        23: aconst_null
        24: invokevirtual #75                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        27: checkcast     #81                 // class ext/mods/gameserver/model/records/HealSps
        30: astore_3
        31: aload_3
        32: ifnonnull     81
        35: aload_1
        36: invokevirtual #83                 // Method ext/mods/gameserver/skills/L2Skill.getMagicLevel:()I
        39: ifle          81
        42: aload_0
        43: getfield      #10                 // Field _healSps:Ljava/util/LinkedList;
        46: invokevirtual #57                 // Method java/util/LinkedList.stream:()Ljava/util/stream/Stream;
        49: aload_1
        50: invokedynamic #88,  0             // InvokeDynamic #2:test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
        55: invokeinterface #65,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        60: invokedynamic #89,  0             // InvokeDynamic #3:apply:()Ljava/util/function/Function;
        65: invokestatic  #93                 // InterfaceMethod java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        68: invokeinterface #99,  2           // InterfaceMethod java/util/stream/Stream.max:(Ljava/util/Comparator;)Ljava/util/Optional;
        73: aconst_null
        74: invokevirtual #75                 // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        77: checkcast     #81                 // class ext/mods/gameserver/model/records/HealSps
        80: astore_3
        81: aload_3
        82: ifnonnull     87
        85: dconst_0
        86: dreturn
        87: aload_3
        88: invokevirtual #103                // Method ext/mods/gameserver/model/records/HealSps.correction:()I
        91: i2d
        92: dstore        4
        94: aload_3
        95: invokevirtual #106                // Method ext/mods/gameserver/model/records/HealSps.neededMatk:()I
        98: iload_2
        99: isub
       100: istore        6
       102: iload         6
       104: ifgt          110
       107: dload         4
       109: dreturn
       110: dload         4
       112: iload         6
       114: i2d
       115: ldc2_w        #109                // double 2.0d
       118: ddiv
       119: dsub
       120: dstore        4
       122: dload         4
       124: dreturn
      LineNumberTable:
        line 63: 0
        line 65: 31
        line 66: 42
        line 68: 81
        line 69: 85
        line 71: 87
        line 73: 94
        line 74: 102
        line 75: 107
        line 77: 110
        line 79: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     125     0  this   Lext/mods/gameserver/data/xml/HealSpsData;
            0     125     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0     125     2  mAtk   I
           31      94     3 healSps   Lext/mods/gameserver/model/records/HealSps;
           94      31     4 amount   D
          102      23     6 mAtkDiff   I
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 81
          locals = [ class ext/mods/gameserver/model/records/HealSps ]
        frame_type = 5 /* same */
        frame_type = 253 /* append */
          offset_delta = 22
          locals = [ double, int ]

  public static ext.mods.gameserver.data.xml.HealSpsData getInstance();
    descriptor: ()Lext/mods/gameserver/data/xml/HealSpsData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #111                // Field ext/mods/gameserver/data/xml/HealSpsData$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/xml/HealSpsData;
         3: areturn
      LineNumberTable:
        line 84: 0
}
SourceFile: "HealSpsData.java"
NestMembers:
  ext/mods/gameserver/data/xml/HealSpsData$SingletonHolder
BootstrapMethods:
  0: #209 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #187 (Ljava/lang/Object;)V
      #189 REF_invokeVirtual ext/mods/gameserver/data/xml/HealSpsData.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #192 (Lorg/w3c/dom/Node;)V
  1: #209 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #193 (Ljava/lang/Object;)Z
      #194 REF_invokeStatic ext/mods/gameserver/data/xml/HealSpsData.lambda$calculateHealSps$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/HealSps;)Z
      #197 (Lext/mods/gameserver/model/records/HealSps;)Z
  2: #209 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #193 (Ljava/lang/Object;)Z
      #199 REF_invokeStatic ext/mods/gameserver/data/xml/HealSpsData.lambda$calculateHealSps$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/records/HealSps;)Z
      #197 (Lext/mods/gameserver/model/records/HealSps;)Z
  3: #209 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #202 (Ljava/lang/Object;)Ljava/lang/Object;
      #203 REF_invokeVirtual ext/mods/gameserver/model/records/HealSps.magicLevel:()I
      #204 (Lext/mods/gameserver/model/records/HealSps;)Ljava/lang/Integer;
  4: #209 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #187 (Ljava/lang/Object;)V
      #206 REF_invokeVirtual ext/mods/gameserver/data/xml/HealSpsData.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #192 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #222= #218 of #220; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
