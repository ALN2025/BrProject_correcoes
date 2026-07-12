// Bytecode for: ext.mods.gameserver.custom.data.EquipGradeRestrictionData
// File: ext\mods\gameserver\custom\data\EquipGradeRestrictionData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/EquipGradeRestrictionData.class
  Last modified 9 de jul de 2026; size 6317 bytes
  MD5 checksum 7c034e24e488bc1840d3d1fa92e68df4
  Compiled from "EquipGradeRestrictionData.java"
public class ext.mods.gameserver.custom.data.EquipGradeRestrictionData implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #15                         // ext/mods/gameserver/custom/data/EquipGradeRestrictionData
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 9, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/EnumMap
    #8 = Utf8               java/util/EnumMap
    #9 = Class              #10           // ext/mods/gameserver/enums/items/CrystalType
   #10 = Utf8               ext/mods/gameserver/enums/items/CrystalType
   #11 = Methodref          #7.#12        // java/util/EnumMap."<init>":(Ljava/lang/Class;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/Class;)V
   #13 = Utf8               (Ljava/lang/Class;)V
   #14 = Fieldref           #15.#16       // ext/mods/gameserver/custom/data/EquipGradeRestrictionData.restrictions:Ljava/util/Map;
   #15 = Class              #17           // ext/mods/gameserver/custom/data/EquipGradeRestrictionData
   #16 = NameAndType        #18:#19       // restrictions:Ljava/util/Map;
   #17 = Utf8               ext/mods/gameserver/custom/data/EquipGradeRestrictionData
   #18 = Utf8               restrictions
   #19 = Utf8               Ljava/util/Map;
   #20 = Methodref          #15.#21       // ext/mods/gameserver/custom/data/EquipGradeRestrictionData.load:()V
   #21 = NameAndType        #22:#6        // load:()V
   #22 = Utf8               load
   #23 = InterfaceMethodref #24.#25       // java/util/Map.clear:()V
   #24 = Class              #26           // java/util/Map
   #25 = NameAndType        #27:#6        // clear:()V
   #26 = Utf8               java/util/Map
   #27 = Utf8               clear
   #28 = String             #29           // custom/mods/equip_grade_restrictions.xml
   #29 = Utf8               custom/mods/equip_grade_restrictions.xml
   #30 = Methodref          #15.#31       // ext/mods/gameserver/custom/data/EquipGradeRestrictionData.parseDataFile:(Ljava/lang/String;)V
   #31 = NameAndType        #32:#33       // parseDataFile:(Ljava/lang/String;)V
   #32 = Utf8               parseDataFile
   #33 = Utf8               (Ljava/lang/String;)V
   #34 = Fieldref           #15.#35       // ext/mods/gameserver/custom/data/EquipGradeRestrictionData.LOGGER:Lext/mods/commons/logging/CLogger;
   #35 = NameAndType        #36:#37       // LOGGER:Lext/mods/commons/logging/CLogger;
   #36 = Utf8               LOGGER
   #37 = Utf8               Lext/mods/commons/logging/CLogger;
   #38 = Methodref          #2.#39        // java/lang/Object.getClass:()Ljava/lang/Class;
   #39 = NameAndType        #40:#41       // getClass:()Ljava/lang/Class;
   #40 = Utf8               getClass
   #41 = Utf8               ()Ljava/lang/Class;
   #42 = Methodref          #43.#44       // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #43 = Class              #45           // java/lang/Class
   #44 = NameAndType        #46:#47       // getSimpleName:()Ljava/lang/String;
   #45 = Utf8               java/lang/Class
   #46 = Utf8               getSimpleName
   #47 = Utf8               ()Ljava/lang/String;
   #48 = InterfaceMethodref #24.#49       // java/util/Map.size:()I
   #49 = NameAndType        #50:#51       // size:()I
   #50 = Utf8               size
   #51 = Utf8               ()I
   #52 = InvokeDynamic      #0:#53        // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #53 = NameAndType        #54:#55       // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #54 = Utf8               makeConcatWithConstants
   #55 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #56 = Methodref          #57.#58       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #57 = Class              #59           // ext/mods/commons/logging/CLogger
   #58 = NameAndType        #60:#61       // info:(Ljava/lang/Object;)V
   #59 = Utf8               ext/mods/commons/logging/CLogger
   #60 = Utf8               info
   #61 = Utf8               (Ljava/lang/Object;)V
   #62 = String             #18           // restrictions
   #63 = InvokeDynamic      #1:#64        // #1:accept:(Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;Ljava/nio/file/Path;)Ljava/util/function/Consumer;
   #64 = NameAndType        #65:#66       // accept:(Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;Ljava/nio/file/Path;)Ljava/util/function/Consumer;
   #65 = Utf8               accept
   #66 = Utf8               (Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;Ljava/nio/file/Path;)Ljava/util/function/Consumer;
   #67 = Methodref          #15.#68       // ext/mods/gameserver/custom/data/EquipGradeRestrictionData.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #68 = NameAndType        #69:#70       // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #69 = Utf8               forEach
   #70 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
   #71 = InterfaceMethodref #24.#72       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #72 = NameAndType        #73:#74       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #73 = Utf8               get
   #74 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #75 = Class              #76           // ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo
   #76 = Utf8               ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo
   #77 = Fieldref           #75.#78       // ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.enabled:Z
   #78 = NameAndType        #79:#80       // enabled:Z
   #79 = Utf8               enabled
   #80 = Utf8               Z
   #81 = Fieldref           #75.#82       // ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.availableFrom:Ljava/time/LocalDateTime;
   #82 = NameAndType        #83:#84       // availableFrom:Ljava/time/LocalDateTime;
   #83 = Utf8               availableFrom
   #84 = Utf8               Ljava/time/LocalDateTime;
   #85 = Methodref          #86.#87       // java/time/LocalDateTime.now:()Ljava/time/LocalDateTime;
   #86 = Class              #88           // java/time/LocalDateTime
   #87 = NameAndType        #89:#90       // now:()Ljava/time/LocalDateTime;
   #88 = Utf8               java/time/LocalDateTime
   #89 = Utf8               now
   #90 = Utf8               ()Ljava/time/LocalDateTime;
   #91 = Methodref          #86.#92       // java/time/LocalDateTime.isAfter:(Ljava/time/chrono/ChronoLocalDateTime;)Z
   #92 = NameAndType        #93:#94       // isAfter:(Ljava/time/chrono/ChronoLocalDateTime;)Z
   #93 = Utf8               isAfter
   #94 = Utf8               (Ljava/time/chrono/ChronoLocalDateTime;)Z
   #95 = String             #96           //
   #96 = Utf8
   #97 = Fieldref           #75.#98       // ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.message:Ljava/lang/String;
   #98 = NameAndType        #99:#100      // message:Ljava/lang/String;
   #99 = Utf8               message
  #100 = Utf8               Ljava/lang/String;
  #101 = Methodref          #102.#103     // java/lang/String.isEmpty:()Z
  #102 = Class              #104          // java/lang/String
  #103 = NameAndType        #105:#106     // isEmpty:()Z
  #104 = Utf8               java/lang/String
  #105 = Utf8               isEmpty
  #106 = Utf8               ()Z
  #107 = String             #108          // You cannot yet equip items of the grade {grade}. Available at {date}.
  #108 = Utf8               You cannot yet equip items of the grade {grade}. Available at {date}.
  #109 = String             #110          // {grade}
  #110 = Utf8               {grade}
  #111 = Methodref          #9.#112       // ext/mods/gameserver/enums/items/CrystalType.name:()Ljava/lang/String;
  #112 = NameAndType        #113:#47      // name:()Ljava/lang/String;
  #113 = Utf8               name
  #114 = Methodref          #102.#115     // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #115 = NameAndType        #116:#117     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #116 = Utf8               replace
  #117 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #118 = String             #119          // {date}
  #119 = Utf8               {date}
  #120 = String             #121          // dd/MM/yyyy HH:mm
  #121 = Utf8               dd/MM/yyyy HH:mm
  #122 = Methodref          #123.#124     // java/time/format/DateTimeFormatter.ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
  #123 = Class              #125          // java/time/format/DateTimeFormatter
  #124 = NameAndType        #126:#127     // ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
  #125 = Utf8               java/time/format/DateTimeFormatter
  #126 = Utf8               ofPattern
  #127 = Utf8               (Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
  #128 = Methodref          #86.#129      // java/time/LocalDateTime.format:(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
  #129 = NameAndType        #130:#131     // format:(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
  #130 = Utf8               format
  #131 = Utf8               (Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
  #132 = Fieldref           #133.#134     // ext/mods/gameserver/custom/data/EquipGradeRestrictionData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
  #133 = Class              #135          // ext/mods/gameserver/custom/data/EquipGradeRestrictionData$SingletonHolder
  #134 = NameAndType        #136:#137     // INSTANCE:Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
  #135 = Utf8               ext/mods/gameserver/custom/data/EquipGradeRestrictionData$SingletonHolder
  #136 = Utf8               INSTANCE
  #137 = Utf8               Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
  #138 = String             #139          // grade
  #139 = Utf8               grade
  #140 = InvokeDynamic      #2:#64        // #2:accept:(Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;Ljava/nio/file/Path;)Ljava/util/function/Consumer;
  #141 = Class              #142          // ext/mods/commons/data/StatSet
  #142 = Utf8               ext/mods/commons/data/StatSet
  #143 = Methodref          #15.#144      // ext/mods/gameserver/custom/data/EquipGradeRestrictionData.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #144 = NameAndType        #145:#146     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #145 = Utf8               parseAttributes
  #146 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #147 = Methodref          #141.#148     // ext/mods/commons/data/StatSet."<init>":(Lext/mods/commons/data/StatSet;)V
  #148 = NameAndType        #5:#149       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #149 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #150 = String             #113          // name
  #151 = Methodref          #141.#152     // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #152 = NameAndType        #153:#154     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #153 = Utf8               getString
  #154 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #155 = Methodref          #9.#156       // ext/mods/gameserver/enums/items/CrystalType.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/items/CrystalType;
  #156 = NameAndType        #157:#158     // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/items/CrystalType;
  #157 = Utf8               valueOf
  #158 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/items/CrystalType;
  #159 = String             #79           // enabled
  #160 = Methodref          #141.#161     // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
  #161 = NameAndType        #162:#163     // getBool:(Ljava/lang/String;Z)Z
  #162 = Utf8               getBool
  #163 = Utf8               (Ljava/lang/String;Z)Z
  #164 = String             #83           // availableFrom
  #165 = Methodref          #141.#166     // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #166 = NameAndType        #153:#167     // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #167 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #168 = Fieldref           #15.#169      // ext/mods/gameserver/custom/data/EquipGradeRestrictionData.FORMATTER:Ljava/time/format/DateTimeFormatter;
  #169 = NameAndType        #170:#171     // FORMATTER:Ljava/time/format/DateTimeFormatter;
  #170 = Utf8               FORMATTER
  #171 = Utf8               Ljava/time/format/DateTimeFormatter;
  #172 = Methodref          #86.#173      // java/time/LocalDateTime.parse:(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;
  #173 = NameAndType        #174:#175     // parse:(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;
  #174 = Utf8               parse
  #175 = Utf8               (Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;
  #176 = String             #99           // message
  #177 = Methodref          #75.#178      // ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo."<init>":(ZLjava/time/LocalDateTime;Ljava/lang/String;)V
  #178 = NameAndType        #5:#179       // "<init>":(ZLjava/time/LocalDateTime;Ljava/lang/String;)V
  #179 = Utf8               (ZLjava/time/LocalDateTime;Ljava/lang/String;)V
  #180 = InterfaceMethodref #24.#181      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #181 = NameAndType        #182:#183     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #182 = Utf8               put
  #183 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #184 = Class              #185          // java/lang/IllegalArgumentException
  #185 = Utf8               java/lang/IllegalArgumentException
  #186 = InterfaceMethodref #187.#188     // java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
  #187 = Class              #189          // java/nio/file/Path
  #188 = NameAndType        #190:#191     // getFileName:()Ljava/nio/file/Path;
  #189 = Utf8               java/nio/file/Path
  #190 = Utf8               getFileName
  #191 = Utf8               ()Ljava/nio/file/Path;
  #192 = Methodref          #102.#193     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #193 = NameAndType        #157:#194     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #194 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #195 = InvokeDynamic      #3:#196       // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #196 = NameAndType        #54:#197      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #197 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #198 = Methodref          #57.#199      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #199 = NameAndType        #200:#61      // warn:(Ljava/lang/Object;)V
  #200 = Utf8               warn
  #201 = String             #202          // yyyy-MM-dd HH:mm:ss
  #202 = Utf8               yyyy-MM-dd HH:mm:ss
  #203 = Class              #204          // ext/mods/commons/data/xml/IXmlReader
  #204 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #205 = Utf8               Signature
  #206 = Utf8               Ljava/util/Map<Lext/mods/gameserver/enums/items/CrystalType;Lext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo;>;
  #207 = Utf8               Code
  #208 = Utf8               LineNumberTable
  #209 = Utf8               LocalVariableTable
  #210 = Utf8               this
  #211 = Utf8               parseDocument
  #212 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #213 = Utf8               doc
  #214 = Utf8               Lorg/w3c/dom/Document;
  #215 = Utf8               path
  #216 = Utf8               Ljava/nio/file/Path;
  #217 = Utf8               isEquipAllowed
  #218 = Utf8               (Lext/mods/gameserver/enums/items/CrystalType;)Z
  #219 = Utf8               Lext/mods/gameserver/enums/items/CrystalType;
  #220 = Utf8               Lext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo;
  #221 = Utf8               StackMapTable
  #222 = Utf8               getBlockMessage
  #223 = Utf8               (Lext/mods/gameserver/enums/items/CrystalType;)Ljava/lang/String;
  #224 = Utf8               raw
  #225 = Utf8               getInstance
  #226 = Utf8               ()Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
  #227 = Utf8               lambda$parseDocument$0
  #228 = Utf8               (Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #229 = Utf8               listNode
  #230 = Utf8               Lorg/w3c/dom/Node;
  #231 = Utf8               lambda$parseDocument$1
  #232 = Utf8               dateStr
  #233 = Utf8               date
  #234 = Utf8               e
  #235 = Utf8               Ljava/lang/IllegalArgumentException;
  #236 = Utf8               node
  #237 = Utf8               set
  #238 = Utf8               Lext/mods/commons/data/StatSet;
  #239 = Class              #240          // org/w3c/dom/Node
  #240 = Utf8               org/w3c/dom/Node
  #241 = Utf8               <clinit>
  #242 = Utf8               SourceFile
  #243 = Utf8               EquipGradeRestrictionData.java
  #244 = Utf8               NestMembers
  #245 = Utf8               BootstrapMethods
  #246 = String             #247          // \u0001: Loaded \u0001 grade restrictions.
  #247 = Utf8               \u0001: Loaded \u0001 grade restrictions.
  #248 = MethodType         #61           //  (Ljava/lang/Object;)V
  #249 = MethodHandle       5:#250        // REF_invokeVirtual ext/mods/gameserver/custom/data/EquipGradeRestrictionData.lambda$parseDocument$0:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #250 = Methodref          #15.#251      // ext/mods/gameserver/custom/data/EquipGradeRestrictionData.lambda$parseDocument$0:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #251 = NameAndType        #227:#228     // lambda$parseDocument$0:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #252 = MethodType         #253          //  (Lorg/w3c/dom/Node;)V
  #253 = Utf8               (Lorg/w3c/dom/Node;)V
  #254 = MethodHandle       5:#255        // REF_invokeVirtual ext/mods/gameserver/custom/data/EquipGradeRestrictionData.lambda$parseDocument$1:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #255 = Methodref          #15.#256      // ext/mods/gameserver/custom/data/EquipGradeRestrictionData.lambda$parseDocument$1:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #256 = NameAndType        #231:#228     // lambda$parseDocument$1:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
  #257 = String             #258          // \u0001: Invalid crystal grade \'\u0001\' in \u0001
  #258 = Utf8               \u0001: Invalid crystal grade \'\u0001\' in \u0001
  #259 = MethodHandle       6:#260        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #260 = Methodref          #261.#262     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #261 = Class              #263          // java/lang/invoke/StringConcatFactory
  #262 = NameAndType        #54:#264      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #263 = Utf8               java/lang/invoke/StringConcatFactory
  #264 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #265 = MethodHandle       6:#266        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #266 = Methodref          #267.#268     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #267 = Class              #269          // java/lang/invoke/LambdaMetafactory
  #268 = NameAndType        #270:#271     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #269 = Utf8               java/lang/invoke/LambdaMetafactory
  #270 = Utf8               metafactory
  #271 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #272 = Utf8               InnerClasses
  #273 = Utf8               RestrictionInfo
  #274 = Utf8               SingletonHolder
  #275 = Class              #276          // java/lang/invoke/MethodHandles$Lookup
  #276 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #277 = Class              #278          // java/lang/invoke/MethodHandles
  #278 = Utf8               java/lang/invoke/MethodHandles
  #279 = Utf8               Lookup
{
  protected ext.mods.gameserver.custom.data.EquipGradeRestrictionData();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/EnumMap
         8: dup
         9: ldc           #9                  // class ext/mods/gameserver/enums/items/CrystalType
        11: invokespecial #11                 // Method java/util/EnumMap."<init>":(Ljava/lang/Class;)V
        14: putfield      #14                 // Field restrictions:Ljava/util/Map;
        17: aload_0
        18: invokevirtual #20                 // Method load:()V
        21: return
      LineNumberTable:
        line 40: 0
        line 37: 4
        line 41: 17
        line 42: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field restrictions:Ljava/util/Map;
         4: invokeinterface #23,  1           // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: ldc           #28                 // String custom/mods/equip_grade_restrictions.xml
        12: invokevirtual #30                 // Method parseDataFile:(Ljava/lang/String;)V
        15: getstatic     #34                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        18: aload_0
        19: invokevirtual #38                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        22: invokevirtual #42                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
        25: aload_0
        26: getfield      #14                 // Field restrictions:Ljava/util/Map;
        29: invokeinterface #48,  1           // InterfaceMethod java/util/Map.size:()I
        34: invokedynamic #52,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        39: invokevirtual #56                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        42: return
      LineNumberTable:
        line 47: 0
        line 48: 9
        line 49: 15
        line 50: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #62                 // String restrictions
         4: aload_0
         5: aload_2
         6: invokedynamic #63,  0             // InvokeDynamic #1:accept:(Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;Ljava/nio/file/Path;)Ljava/util/function/Consumer;
        11: invokevirtual #67                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        14: return
      LineNumberTable:
        line 55: 0
        line 78: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
            0      15     1   doc   Lorg/w3c/dom/Document;
            0      15     2  path   Ljava/nio/file/Path;

  public boolean isEquipAllowed(ext.mods.gameserver.enums.items.CrystalType);
    descriptor: (Lext/mods/gameserver/enums/items/CrystalType;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #14                 // Field restrictions:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #71,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #75                 // class ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo
        13: astore_2
        14: aload_2
        15: ifnull        25
        18: aload_2
        19: getfield      #77                 // Field ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.enabled:Z
        22: ifne          27
        25: iconst_1
        26: ireturn
        27: aload_2
        28: getfield      #81                 // Field ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.availableFrom:Ljava/time/LocalDateTime;
        31: ifnull        47
        34: invokestatic  #85                 // Method java/time/LocalDateTime.now:()Ljava/time/LocalDateTime;
        37: aload_2
        38: getfield      #81                 // Field ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.availableFrom:Ljava/time/LocalDateTime;
        41: invokevirtual #91                 // Method java/time/LocalDateTime.isAfter:(Ljava/time/chrono/ChronoLocalDateTime;)Z
        44: ifeq          51
        47: iconst_1
        48: goto          52
        51: iconst_0
        52: ireturn
      LineNumberTable:
        line 82: 0
        line 83: 14
        line 84: 25
        line 86: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
            0      53     1 grade   Lext/mods/gameserver/enums/items/CrystalType;
           14      39     2  info   Lext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo ]
        frame_type = 1 /* same */
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.lang.String getBlockMessage(ext.mods.gameserver.enums.items.CrystalType);
    descriptor: (Lext/mods/gameserver/enums/items/CrystalType;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: getfield      #14                 // Field restrictions:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #71,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #75                 // class ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo
        13: astore_2
        14: aload_2
        15: ifnull        32
        18: aload_2
        19: getfield      #77                 // Field ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.enabled:Z
        22: ifeq          32
        25: aload_2
        26: getfield      #81                 // Field ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.availableFrom:Ljava/time/LocalDateTime;
        29: ifnonnull     35
        32: ldc           #95                 // String
        34: areturn
        35: aload_2
        36: getfield      #97                 // Field ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.message:Ljava/lang/String;
        39: ifnull        52
        42: aload_2
        43: getfield      #97                 // Field ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.message:Ljava/lang/String;
        46: invokevirtual #101                // Method java/lang/String.isEmpty:()Z
        49: ifeq          57
        52: ldc           #107                // String You cannot yet equip items of the grade {grade}. Available at {date}.
        54: goto          61
        57: aload_2
        58: getfield      #97                 // Field ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.message:Ljava/lang/String;
        61: astore_3
        62: aload_3
        63: ldc           #109                // String {grade}
        65: aload_1
        66: invokevirtual #111                // Method ext/mods/gameserver/enums/items/CrystalType.name:()Ljava/lang/String;
        69: invokevirtual #114                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        72: ldc           #118                // String {date}
        74: aload_2
        75: getfield      #81                 // Field ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo.availableFrom:Ljava/time/LocalDateTime;
        78: ldc           #120                // String dd/MM/yyyy HH:mm
        80: invokestatic  #122                // Method java/time/format/DateTimeFormatter.ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
        83: invokevirtual #128                // Method java/time/LocalDateTime.format:(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
        86: invokevirtual #114                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        89: areturn
      LineNumberTable:
        line 91: 0
        line 92: 14
        line 93: 32
        line 95: 35
        line 97: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      90     0  this   Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
            0      90     1 grade   Lext/mods/gameserver/enums/items/CrystalType;
           14      76     2  info   Lext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo;
           62      28     3   raw   Ljava/lang/String;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo ]
        frame_type = 2 /* same */
        frame_type = 16 /* same */
        frame_type = 4 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public static ext.mods.gameserver.custom.data.EquipGradeRestrictionData getInstance();
    descriptor: ()Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #132                // Field ext/mods/gameserver/custom/data/EquipGradeRestrictionData$SingletonHolder.INSTANCE:Lext/mods/gameserver/custom/data/EquipGradeRestrictionData;
         3: areturn
      LineNumberTable:
        line 102: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #201                // String yyyy-MM-dd HH:mm:ss
         2: invokestatic  #122                // Method java/time/format/DateTimeFormatter.ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
         5: putstatic     #168                // Field FORMATTER:Ljava/time/format/DateTimeFormatter;
         8: return
      LineNumberTable:
        line 35: 0
}
SourceFile: "EquipGradeRestrictionData.java"
NestMembers:
  ext/mods/gameserver/custom/data/EquipGradeRestrictionData$RestrictionInfo
  ext/mods/gameserver/custom/data/EquipGradeRestrictionData$SingletonHolder
BootstrapMethods:
  0: #259 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #246 \u0001: Loaded \u0001 grade restrictions.
  1: #265 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #248 (Ljava/lang/Object;)V
      #249 REF_invokeVirtual ext/mods/gameserver/custom/data/EquipGradeRestrictionData.lambda$parseDocument$0:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
      #252 (Lorg/w3c/dom/Node;)V
  2: #265 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #248 (Ljava/lang/Object;)V
      #254 REF_invokeVirtual ext/mods/gameserver/custom/data/EquipGradeRestrictionData.lambda$parseDocument$1:(Ljava/nio/file/Path;Lorg/w3c/dom/Node;)V
      #252 (Lorg/w3c/dom/Node;)V
  3: #259 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #257 \u0001: Invalid crystal grade \'\u0001\' in \u0001
InnerClasses:
  public static final #279= #275 of #277; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
