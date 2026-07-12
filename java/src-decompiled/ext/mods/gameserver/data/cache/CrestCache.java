// Bytecode for: ext.mods.gameserver.data.cache.CrestCache
// File: ext\mods\gameserver\data\cache\CrestCache.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/cache/CrestCache.class
  Last modified 9 de jul de 2026; size 5665 bytes
  MD5 checksum 1d2b83276c3a3f9d6e1fc45e0878d360
  Compiled from "CrestCache.java"
public class ext.mods.gameserver.data.cache.CrestCache
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/cache/CrestCache
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 8, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/cache/CrestCache._crests:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/cache/CrestCache
   #12 = NameAndType        #14:#15       // _crests:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/cache/CrestCache
   #14 = Utf8               _crests
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/cache/CrestCache.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/data/cache/CrestCache.CRESTS_DIR:Ljava/lang/String;
   #20 = NameAndType        #21:#22       // CRESTS_DIR:Ljava/lang/String;
   #21 = Utf8               CRESTS_DIR
   #22 = Utf8               Ljava/lang/String;
   #23 = Class              #24           // java/lang/String
   #24 = Utf8               java/lang/String
   #25 = Methodref          #26.#27       // java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #26 = Class              #28           // java/nio/file/Paths
   #27 = NameAndType        #29:#30       // get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #28 = Utf8               java/nio/file/Paths
   #29 = Utf8               get
   #30 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #31 = Class              #32           // ext/mods/gameserver/data/cache/CrestCache$DdsFilter
   #32 = Utf8               ext/mods/gameserver/data/cache/CrestCache$DdsFilter
   #33 = Methodref          #31.#3        // ext/mods/gameserver/data/cache/CrestCache$DdsFilter."<init>":()V
   #34 = Methodref          #35.#36       // java/nio/file/Files.newDirectoryStream:(Ljava/nio/file/Path;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;
   #35 = Class              #37           // java/nio/file/Files
   #36 = NameAndType        #38:#39       // newDirectoryStream:(Ljava/nio/file/Path;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;
   #37 = Utf8               java/nio/file/Files
   #38 = Utf8               newDirectoryStream
   #39 = Utf8               (Ljava/nio/file/Path;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;
   #40 = InterfaceMethodref #41.#42       // java/nio/file/DirectoryStream.iterator:()Ljava/util/Iterator;
   #41 = Class              #43           // java/nio/file/DirectoryStream
   #42 = NameAndType        #44:#45       // iterator:()Ljava/util/Iterator;
   #43 = Utf8               java/nio/file/DirectoryStream
   #44 = Utf8               iterator
   #45 = Utf8               ()Ljava/util/Iterator;
   #46 = InterfaceMethodref #47.#48       // java/util/Iterator.hasNext:()Z
   #47 = Class              #49           // java/util/Iterator
   #48 = NameAndType        #50:#51       // hasNext:()Z
   #49 = Utf8               java/util/Iterator
   #50 = Utf8               hasNext
   #51 = Utf8               ()Z
   #52 = InterfaceMethodref #47.#53       // java/util/Iterator.next:()Ljava/lang/Object;
   #53 = NameAndType        #54:#55       // next:()Ljava/lang/Object;
   #54 = Utf8               next
   #55 = Utf8               ()Ljava/lang/Object;
   #56 = Class              #57           // java/nio/file/Path
   #57 = Utf8               java/nio/file/Path
   #58 = InterfaceMethodref #56.#59       // java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
   #59 = NameAndType        #60:#61       // getFileName:()Ljava/nio/file/Path;
   #60 = Utf8               getFileName
   #61 = Utf8               ()Ljava/nio/file/Path;
   #62 = InterfaceMethodref #56.#63       // java/nio/file/Path.toString:()Ljava/lang/String;
   #63 = NameAndType        #64:#65       // toString:()Ljava/lang/String;
   #64 = Utf8               toString
   #65 = Utf8               ()Ljava/lang/String;
   #66 = Methodref          #35.#67       // java/nio/file/Files.readAllBytes:(Ljava/nio/file/Path;)[B
   #67 = NameAndType        #68:#69       // readAllBytes:(Ljava/nio/file/Path;)[B
   #68 = Utf8               readAllBytes
   #69 = Utf8               (Ljava/nio/file/Path;)[B
   #70 = Methodref          #71.#72       // ext/mods/gameserver/enums/CrestType.values:()[Lext/mods/gameserver/enums/CrestType;
   #71 = Class              #73           // ext/mods/gameserver/enums/CrestType
   #72 = NameAndType        #74:#75       // values:()[Lext/mods/gameserver/enums/CrestType;
   #73 = Utf8               ext/mods/gameserver/enums/CrestType
   #74 = Utf8               values
   #75 = Utf8               ()[Lext/mods/gameserver/enums/CrestType;
   #76 = Methodref          #71.#77       // ext/mods/gameserver/enums/CrestType.getPrefix:()Ljava/lang/String;
   #77 = NameAndType        #78:#65       // getPrefix:()Ljava/lang/String;
   #78 = Utf8               getPrefix
   #79 = Methodref          #23.#80       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #80 = NameAndType        #81:#82       // startsWith:(Ljava/lang/String;)Z
   #81 = Utf8               startsWith
   #82 = Utf8               (Ljava/lang/String;)Z
   #83 = Methodref          #71.#84       // ext/mods/gameserver/enums/CrestType.getSize:()I
   #84 = NameAndType        #85:#86       // getSize:()I
   #85 = Utf8               getSize
   #86 = Utf8               ()I
   #87 = Methodref          #35.#88       // java/nio/file/Files.deleteIfExists:(Ljava/nio/file/Path;)Z
   #88 = NameAndType        #89:#90       // deleteIfExists:(Ljava/nio/file/Path;)Z
   #89 = Utf8               deleteIfExists
   #90 = Utf8               (Ljava/nio/file/Path;)Z
   #91 = Fieldref           #11.#92       // ext/mods/gameserver/data/cache/CrestCache.LOGGER:Lext/mods/commons/logging/CLogger;
   #92 = NameAndType        #93:#94       // LOGGER:Lext/mods/commons/logging/CLogger;
   #93 = Utf8               LOGGER
   #94 = Utf8               Lext/mods/commons/logging/CLogger;
   #95 = String             #96           // The data for crest {} is invalid. The crest has been deleted.
   #96 = Utf8               The data for crest {} is invalid. The crest has been deleted.
   #97 = Methodref          #98.#99       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #98 = Class              #100          // ext/mods/commons/logging/CLogger
   #99 = NameAndType        #101:#102     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #100 = Utf8               ext/mods/commons/logging/CLogger
  #101 = Utf8               warn
  #102 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #103 = Methodref          #23.#104      // java/lang/String.length:()I
  #104 = NameAndType        #105:#86      // length:()I
  #105 = Utf8               length
  #106 = Methodref          #23.#107      // java/lang/String.substring:(II)Ljava/lang/String;
  #107 = NameAndType        #108:#109     // substring:(II)Ljava/lang/String;
  #108 = Utf8               substring
  #109 = Utf8               (II)Ljava/lang/String;
  #110 = Methodref          #111.#112     // java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
  #111 = Class              #113          // java/lang/Integer
  #112 = NameAndType        #114:#115     // valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
  #113 = Utf8               java/lang/Integer
  #114 = Utf8               valueOf
  #115 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #116 = InterfaceMethodref #117.#118     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #117 = Class              #119          // java/util/Map
  #118 = NameAndType        #120:#121     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #119 = Utf8               java/util/Map
  #120 = Utf8               put
  #121 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #122 = InterfaceMethodref #41.#123      // java/nio/file/DirectoryStream.close:()V
  #123 = NameAndType        #124:#6       // close:()V
  #124 = Utf8               close
  #125 = Class              #126          // java/lang/Throwable
  #126 = Utf8               java/lang/Throwable
  #127 = Methodref          #125.#128     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #128 = NameAndType        #129:#130     // addSuppressed:(Ljava/lang/Throwable;)V
  #129 = Utf8               addSuppressed
  #130 = Utf8               (Ljava/lang/Throwable;)V
  #131 = Class              #132          // java/lang/Exception
  #132 = Utf8               java/lang/Exception
  #133 = String             #134          // Error loading crest files.
  #134 = Utf8               Error loading crest files.
  #135 = Methodref          #98.#136      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #136 = NameAndType        #137:#138     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #137 = Utf8               error
  #138 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #139 = String             #140          // Loaded {} crests.
  #140 = Utf8               Loaded {} crests.
  #141 = InterfaceMethodref #117.#142     // java/util/Map.size:()I
  #142 = NameAndType        #143:#86      // size:()I
  #143 = Utf8               size
  #144 = Methodref          #111.#145     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #145 = NameAndType        #114:#146     // valueOf:(I)Ljava/lang/Integer;
  #146 = Utf8               (I)Ljava/lang/Integer;
  #147 = Methodref          #98.#148      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #148 = NameAndType        #149:#102     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #149 = Utf8               info
  #150 = InterfaceMethodref #117.#151     // java/util/Map.clear:()V
  #151 = NameAndType        #152:#6       // clear:()V
  #152 = Utf8               clear
  #153 = InterfaceMethodref #117.#154     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #154 = NameAndType        #29:#155      // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #155 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #156 = Class              #157          // "[B"
  #157 = Utf8               [B
  #158 = InterfaceMethodref #117.#159     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #159 = NameAndType        #160:#155     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #160 = Utf8               remove
  #161 = InvokeDynamic      #0:#162       // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #162 = NameAndType        #163:#164     // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #163 = Utf8               makeConcatWithConstants
  #164 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #165 = String             #166          // Error deleting crest file: {}.
  #166 = Utf8               Error deleting crest file: {}.
  #167 = Methodref          #98.#168      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #168 = NameAndType        #137:#169     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #169 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #170 = String             #171          // The data for crest {} is invalid. Saving process is aborted.
  #171 = Utf8               The data for crest {} is invalid. Saving process is aborted.
  #172 = Class              #173          // java/nio/file/OpenOption
  #173 = Utf8               java/nio/file/OpenOption
  #174 = Methodref          #35.#175      // java/nio/file/Files.write:(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
  #175 = NameAndType        #176:#177     // write:(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
  #176 = Utf8               write
  #177 = Utf8               (Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
  #178 = String             #179          // Error saving crest file: {}.
  #179 = Utf8               Error saving crest file: {}.
  #180 = Fieldref           #181.#182     // ext/mods/gameserver/data/cache/CrestCache$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/cache/CrestCache;
  #181 = Class              #183          // ext/mods/gameserver/data/cache/CrestCache$SingletonHolder
  #182 = NameAndType        #184:#185     // INSTANCE:Lext/mods/gameserver/data/cache/CrestCache;
  #183 = Utf8               ext/mods/gameserver/data/cache/CrestCache$SingletonHolder
  #184 = Utf8               INSTANCE
  #185 = Utf8               Lext/mods/gameserver/data/cache/CrestCache;
  #186 = Methodref          #187.#188     // java/lang/Class.getName:()Ljava/lang/String;
  #187 = Class              #189          // java/lang/Class
  #188 = NameAndType        #190:#65      // getName:()Ljava/lang/String;
  #189 = Utf8               java/lang/Class
  #190 = Utf8               getName
  #191 = Methodref          #98.#192      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #192 = NameAndType        #5:#193       // "<init>":(Ljava/lang/String;)V
  #193 = Utf8               (Ljava/lang/String;)V
  #194 = Fieldref           #195.#196     // ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
  #195 = Class              #197          // ext/mods/Config
  #196 = NameAndType        #198:#199     // DATA_PATH:Ljava/nio/file/Path;
  #197 = Utf8               ext/mods/Config
  #198 = Utf8               DATA_PATH
  #199 = Utf8               Ljava/nio/file/Path;
  #200 = String             #201          // crests
  #201 = Utf8               crests
  #202 = InterfaceMethodref #56.#203      // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #203 = NameAndType        #204:#205     // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #204 = Utf8               resolve
  #205 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #206 = Utf8               Signature
  #207 = Utf8               Ljava/util/Map<Ljava/lang/Integer;[B>;
  #208 = Utf8               Code
  #209 = Utf8               LineNumberTable
  #210 = Utf8               LocalVariableTable
  #211 = Utf8               this
  #212 = Utf8               type
  #213 = Utf8               Lext/mods/gameserver/enums/CrestType;
  #214 = Utf8               fileName
  #215 = Utf8               data
  #216 = Utf8               filePath
  #217 = Utf8               stream
  #218 = Utf8               Ljava/nio/file/DirectoryStream;
  #219 = Utf8               e
  #220 = Utf8               Ljava/lang/Exception;
  #221 = Utf8               LocalVariableTypeTable
  #222 = Utf8               Ljava/nio/file/DirectoryStream<Ljava/nio/file/Path;>;
  #223 = Utf8               StackMapTable
  #224 = Class              #225          // "[Lext/mods/gameserver/enums/CrestType;"
  #225 = Utf8               [Lext/mods/gameserver/enums/CrestType;
  #226 = Utf8               reload
  #227 = Utf8               getCrest
  #228 = Utf8               (Lext/mods/gameserver/enums/CrestType;I)[B
  #229 = Utf8               id
  #230 = Utf8               I
  #231 = Utf8               removeCrest
  #232 = Utf8               (Lext/mods/gameserver/enums/CrestType;I)V
  #233 = Utf8               saveCrest
  #234 = Utf8               (Lext/mods/gameserver/enums/CrestType;I[B)Z
  #235 = Utf8               getInstance
  #236 = Utf8               ()Lext/mods/gameserver/data/cache/CrestCache;
  #237 = Utf8               <clinit>
  #238 = Utf8               SourceFile
  #239 = Utf8               CrestCache.java
  #240 = Utf8               NestMembers
  #241 = Utf8               BootstrapMethods
  #242 = String             #243          // \u0001\u0001.dds
  #243 = Utf8               \u0001\u0001.dds
  #244 = MethodHandle       6:#245        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #245 = Methodref          #246.#247     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #246 = Class              #248          // java/lang/invoke/StringConcatFactory
  #247 = NameAndType        #163:#249     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #248 = Utf8               java/lang/invoke/StringConcatFactory
  #249 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #250 = Utf8               InnerClasses
  #251 = Utf8               DdsFilter
  #252 = Class              #253          // java/nio/file/DirectoryStream$Filter
  #253 = Utf8               java/nio/file/DirectoryStream$Filter
  #254 = Utf8               Filter
  #255 = Utf8               SingletonHolder
  #256 = Class              #257          // java/lang/invoke/MethodHandles$Lookup
  #257 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #258 = Class              #259          // java/lang/invoke/MethodHandles
  #259 = Utf8               java/lang/invoke/MethodHandles
  #260 = Utf8               Lookup
{
  public ext.mods.gameserver.data.cache.CrestCache();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _crests:Ljava/util/Map;
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
            0      20     0  this   Lext/mods/gameserver/data/cache/CrestCache;

  public final void reload();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _crests:Ljava/util/Map;
         4: invokeinterface #150,  1          // InterfaceMethod java/util/Map.clear:()V
         9: aload_0
        10: invokevirtual #16                 // Method load:()V
        13: return
      LineNumberTable:
        line 95: 0
        line 97: 9
        line 98: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/cache/CrestCache;

  public final byte[] getCrest(ext.mods.gameserver.enums.CrestType, int);
    descriptor: (Lext/mods/gameserver/enums/CrestType;I)[B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _crests:Ljava/util/Map;
         4: iload_2
         5: invokestatic  #144                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #153,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #156                // class "[B"
        16: astore_3
        17: aload_3
        18: ifnull        30
        21: aload_3
        22: arraylength
        23: aload_1
        24: invokevirtual #83                 // Method ext/mods/gameserver/enums/CrestType.getSize:()I
        27: if_icmpeq     32
        30: aconst_null
        31: areturn
        32: aload_3
        33: areturn
      LineNumberTable:
        line 107: 0
        line 109: 17
        line 110: 30
        line 112: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/cache/CrestCache;
            0      34     1  type   Lext/mods/gameserver/enums/CrestType;
            0      34     2    id   I
           17      17     3  data   [B
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class "[B" ]
        frame_type = 1 /* same */

  public final void removeCrest(ext.mods.gameserver.enums.CrestType, int);
    descriptor: (Lext/mods/gameserver/enums/CrestType;I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=6, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _crests:Ljava/util/Map;
         4: iload_2
         5: invokestatic  #144                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #153,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #156                // class "[B"
        16: astore_3
        17: aload_3
        18: ifnull        30
        21: aload_3
        22: arraylength
        23: aload_1
        24: invokevirtual #83                 // Method ext/mods/gameserver/enums/CrestType.getSize:()I
        27: if_icmpeq     31
        30: return
        31: aload_0
        32: getfield      #10                 // Field _crests:Ljava/util/Map;
        35: iload_2
        36: invokestatic  #144                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        39: invokeinterface #158,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        44: pop
        45: getstatic     #19                 // Field CRESTS_DIR:Ljava/lang/String;
        48: iconst_1
        49: anewarray     #23                 // class java/lang/String
        52: dup
        53: iconst_0
        54: aload_1
        55: invokevirtual #76                 // Method ext/mods/gameserver/enums/CrestType.getPrefix:()Ljava/lang/String;
        58: iload_2
        59: invokedynamic #161,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        64: aastore
        65: invokestatic  #25                 // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        68: astore        4
        70: aload         4
        72: invokestatic  #87                 // Method java/nio/file/Files.deleteIfExists:(Ljava/nio/file/Path;)Z
        75: pop
        76: goto          105
        79: astore        5
        81: getstatic     #91                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        84: ldc           #165                // String Error deleting crest file: {}.
        86: aload         5
        88: iconst_1
        89: anewarray     #2                  // class java/lang/Object
        92: dup
        93: iconst_0
        94: aload         4
        96: invokeinterface #58,  1           // InterfaceMethod java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
       101: aastore
       102: invokevirtual #167                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       105: return
      Exception table:
         from    to  target type
            70    76    79   Class java/lang/Exception
      LineNumberTable:
        line 122: 0
        line 123: 17
        line 124: 30
        line 126: 31
        line 128: 45
        line 131: 70
        line 136: 76
        line 133: 79
        line 135: 81
        line 137: 105
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           81      24     5     e   Ljava/lang/Exception;
            0     106     0  this   Lext/mods/gameserver/data/cache/CrestCache;
            0     106     1  type   Lext/mods/gameserver/enums/CrestType;
            0     106     2    id   I
           17      89     3  data   [B
           70      36     4 filePath   Ljava/nio/file/Path;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class "[B" ]
        frame_type = 0 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/data/cache/CrestCache, class ext/mods/gameserver/enums/CrestType, int, class "[B", class java/nio/file/Path ]
          stack = [ class java/lang/Exception ]
        frame_type = 25 /* same */

  public final boolean saveCrest(ext.mods.gameserver.enums.CrestType, int, byte[]);
    descriptor: (Lext/mods/gameserver/enums/CrestType;I[B)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=6, args_size=4
         0: getstatic     #19                 // Field CRESTS_DIR:Ljava/lang/String;
         3: iconst_1
         4: anewarray     #23                 // class java/lang/String
         7: dup
         8: iconst_0
         9: aload_1
        10: invokevirtual #76                 // Method ext/mods/gameserver/enums/CrestType.getPrefix:()Ljava/lang/String;
        13: iload_2
        14: invokedynamic #161,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        19: aastore
        20: invokestatic  #25                 // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        23: astore        4
        25: aload_3
        26: arraylength
        27: aload_1
        28: invokevirtual #83                 // Method ext/mods/gameserver/enums/CrestType.getSize:()I
        31: if_icmpeq     58
        34: getstatic     #91                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        37: ldc           #170                // String The data for crest {} is invalid. Saving process is aborted.
        39: iconst_1
        40: anewarray     #2                  // class java/lang/Object
        43: dup
        44: iconst_0
        45: aload         4
        47: invokeinterface #58,  1           // InterfaceMethod java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
        52: aastore
        53: invokevirtual #97                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        56: iconst_0
        57: ireturn
        58: aload         4
        60: aload_3
        61: iconst_0
        62: anewarray     #172                // class java/nio/file/OpenOption
        65: invokestatic  #174                // Method java/nio/file/Files.write:(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
        68: pop
        69: goto          100
        72: astore        5
        74: getstatic     #91                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        77: ldc           #178                // String Error saving crest file: {}.
        79: aload         5
        81: iconst_1
        82: anewarray     #2                  // class java/lang/Object
        85: dup
        86: iconst_0
        87: aload         4
        89: invokeinterface #58,  1           // InterfaceMethod java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
        94: aastore
        95: invokevirtual #167                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        98: iconst_0
        99: ireturn
       100: aload_0
       101: getfield      #10                 // Field _crests:Ljava/util/Map;
       104: iload_2
       105: invokestatic  #144                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       108: aload_3
       109: invokeinterface #116,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       114: pop
       115: iconst_1
       116: ireturn
      Exception table:
         from    to  target type
            58    69    72   Class java/lang/Exception
      LineNumberTable:
        line 148: 0
        line 150: 25
        line 152: 34
        line 153: 56
        line 158: 58
        line 164: 69
        line 160: 72
        line 162: 74
        line 163: 98
        line 166: 100
        line 168: 115
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           74      26     5     e   Ljava/lang/Exception;
            0     117     0  this   Lext/mods/gameserver/data/cache/CrestCache;
            0     117     1  type   Lext/mods/gameserver/enums/CrestType;
            0     117     2    id   I
            0     117     3  data   [B
           25      92     4 filePath   Ljava/nio/file/Path;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 58
          locals = [ class java/nio/file/Path ]
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 27 /* same */

  public static ext.mods.gameserver.data.cache.CrestCache getInstance();
    descriptor: ()Lext/mods/gameserver/data/cache/CrestCache;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #180                // Field ext/mods/gameserver/data/cache/CrestCache$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/cache/CrestCache;
         3: areturn
      LineNumberTable:
        line 184: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #98                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/cache/CrestCache
         6: invokevirtual #186                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #191                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #91                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: getstatic     #194                // Field ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
        18: ldc           #200                // String crests
        20: invokeinterface #202,  2          // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        25: invokeinterface #62,  1           // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
        30: putstatic     #19                 // Field CRESTS_DIR:Ljava/lang/String;
        33: return
      LineNumberTable:
        line 39: 0
        line 41: 15
}
SourceFile: "CrestCache.java"
NestMembers:
  ext/mods/gameserver/data/cache/CrestCache$SingletonHolder
  ext/mods/gameserver/data/cache/CrestCache$DdsFilter
BootstrapMethods:
  0: #244 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #242 \u0001\u0001.dds
InnerClasses:
  public static #254= #252 of #41;        // Filter=class java/nio/file/DirectoryStream$Filter of class java/nio/file/DirectoryStream
  public static final #260= #256 of #258; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
