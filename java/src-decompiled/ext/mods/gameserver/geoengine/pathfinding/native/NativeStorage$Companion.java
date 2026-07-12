// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$Companion
// File: ext\mods\gameserver\geoengine\pathfinding\native\NativeStorage$Companion.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion.class
  Last modified 9 de jul de 2026; size 9689 bytes
  MD5 checksum 0460b7cba3e108b2683c3eae1a135f31
  Compiled from "NativeStorage.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$Companion
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 8, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = NameAndType        #5:#6         // "<init>":()V
    #8 = Methodref          #4.#7         // java/lang/Object."<init>":()V
    #9 = Utf8               this
   #10 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
   #11 = Utf8               open
   #12 = Utf8               (Ljava/nio/file/Path;Z)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #13 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #14 = Utf8               java/lang/Exception
   #15 = Class              #14           // java/lang/Exception
   #16 = Utf8               java/lang/foreign/Arena
   #17 = Class              #16           // java/lang/foreign/Arena
   #18 = Utf8               ofShared
   #19 = Utf8               ()Ljava/lang/foreign/Arena;
   #20 = NameAndType        #18:#19       // ofShared:()Ljava/lang/foreign/Arena;
   #21 = InterfaceMethodref #17.#20       // java/lang/foreign/Arena.ofShared:()Ljava/lang/foreign/Arena;
   #22 = Utf8               ofConfined
   #23 = NameAndType        #22:#19       // ofConfined:()Ljava/lang/foreign/Arena;
   #24 = InterfaceMethodref #17.#23       // java/lang/foreign/Arena.ofConfined:()Ljava/lang/foreign/Arena;
   #25 = Utf8               java/nio/file/Path
   #26 = Class              #25           // java/nio/file/Path
   #27 = Utf8               toFile
   #28 = Utf8               ()Ljava/io/File;
   #29 = NameAndType        #27:#28       // toFile:()Ljava/io/File;
   #30 = InterfaceMethodref #26.#29       // java/nio/file/Path.toFile:()Ljava/io/File;
   #31 = Utf8               java/io/File
   #32 = Class              #31           // java/io/File
   #33 = Utf8               exists
   #34 = Utf8               ()Z
   #35 = NameAndType        #33:#34       // exists:()Z
   #36 = Methodref          #32.#35       // java/io/File.exists:()Z
   #37 = Utf8               java/io/FileNotFoundException
   #38 = Class              #37           // java/io/FileNotFoundException
   #39 = Utf8               Arquivo não encontrado: \u0001
   #40 = String             #39           // Arquivo não encontrado: \u0001
   #41 = Utf8               java/lang/invoke/StringConcatFactory
   #42 = Class              #41           // java/lang/invoke/StringConcatFactory
   #43 = Utf8               makeConcatWithConstants
   #44 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #45 = NameAndType        #43:#44       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #46 = Methodref          #42.#45       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #47 = MethodHandle       6:#46         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #48 = Utf8               (Ljava/nio/file/Path;)Ljava/lang/String;
   #49 = NameAndType        #43:#48       // makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
   #50 = InvokeDynamic      #0:#49        // #0:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
   #51 = Utf8               (Ljava/lang/String;)V
   #52 = NameAndType        #5:#51        // "<init>":(Ljava/lang/String;)V
   #53 = Methodref          #38.#52       // java/io/FileNotFoundException."<init>":(Ljava/lang/String;)V
   #54 = Utf8               canRead
   #55 = NameAndType        #54:#34       // canRead:()Z
   #56 = Methodref          #32.#55       // java/io/File.canRead:()Z
   #57 = Utf8               java/io/IOException
   #58 = Class              #57           // java/io/IOException
   #59 = Utf8               Sem permissão de leitura: \u0001
   #60 = String             #59           // Sem permissão de leitura: \u0001
   #61 = InvokeDynamic      #1:#49        // #1:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
   #62 = Methodref          #58.#52       // java/io/IOException."<init>":(Ljava/lang/String;)V
   #63 = Utf8               java/nio/file/OpenOption
   #64 = Class              #63           // java/nio/file/OpenOption
   #65 = Utf8               java/nio/file/StandardOpenOption
   #66 = Class              #65           // java/nio/file/StandardOpenOption
   #67 = Utf8               READ
   #68 = Utf8               Ljava/nio/file/StandardOpenOption;
   #69 = NameAndType        #67:#68       // READ:Ljava/nio/file/StandardOpenOption;
   #70 = Fieldref           #66.#69       // java/nio/file/StandardOpenOption.READ:Ljava/nio/file/StandardOpenOption;
   #71 = Utf8               java/nio/channels/FileChannel
   #72 = Class              #71           // java/nio/channels/FileChannel
   #73 = Utf8               (Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/nio/channels/FileChannel;
   #74 = NameAndType        #11:#73       // open:(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/nio/channels/FileChannel;
   #75 = Methodref          #72.#74       // java/nio/channels/FileChannel.open:(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/nio/channels/FileChannel;
   #76 = Utf8               size
   #77 = Utf8               ()J
   #78 = NameAndType        #76:#77       // size:()J
   #79 = Methodref          #72.#78       // java/nio/channels/FileChannel.size:()J
   #80 = Long               64l
   #82 = Utf8               Arquivo muito pequeno para ter header válido: \u0001 bytes (min: 64)
   #83 = String             #82           // Arquivo muito pequeno para ter header válido: \u0001 bytes (min: 64)
   #84 = Utf8               (J)Ljava/lang/String;
   #85 = NameAndType        #43:#84       // makeConcatWithConstants:(J)Ljava/lang/String;
   #86 = InvokeDynamic      #2:#85        // #2:makeConcatWithConstants:(J)Ljava/lang/String;
   #87 = Utf8               java/lang/IllegalArgumentException
   #88 = Class              #87           // java/lang/IllegalArgumentException
   #89 = Utf8               toString
   #90 = Utf8               ()Ljava/lang/String;
   #91 = NameAndType        #89:#90       // toString:()Ljava/lang/String;
   #92 = Methodref          #4.#91        // java/lang/Object.toString:()Ljava/lang/String;
   #93 = Methodref          #88.#52       // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
   #94 = Utf8               java/nio/channels/FileChannel$MapMode
   #95 = Class              #94           // java/nio/channels/FileChannel$MapMode
   #96 = Utf8               READ_ONLY
   #97 = Utf8               Ljava/nio/channels/FileChannel$MapMode;
   #98 = NameAndType        #96:#97       // READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
   #99 = Fieldref           #95.#98       // java/nio/channels/FileChannel$MapMode.READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
  #100 = Utf8               map
  #101 = Utf8               (Ljava/nio/channels/FileChannel$MapMode;JJLjava/lang/foreign/Arena;)Ljava/lang/foreign/MemorySegment;
  #102 = NameAndType        #100:#101     // map:(Ljava/nio/channels/FileChannel$MapMode;JJLjava/lang/foreign/Arena;)Ljava/lang/foreign/MemorySegment;
  #103 = Methodref          #72.#102      // java/nio/channels/FileChannel.map:(Ljava/nio/channels/FileChannel$MapMode;JJLjava/lang/foreign/Arena;)Ljava/lang/foreign/MemorySegment;
  #104 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
  #105 = Class              #104          // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
  #106 = Utf8               Companion
  #107 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
  #108 = NameAndType        #106:#107     // Companion:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
  #109 = Fieldref           #105.#108     // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.Companion:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
  #110 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion
  #111 = Class              #110          // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion
  #112 = Utf8               readFrom
  #113 = Utf8               (Ljava/lang/foreign/MemorySegment;)Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
  #114 = NameAndType        #112:#113     // readFrom:(Ljava/lang/foreign/MemorySegment;)Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
  #115 = Methodref          #111.#114     // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion.readFrom:(Ljava/lang/foreign/MemorySegment;)Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
  #116 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
  #117 = Class              #116          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
  #118 = Utf8               access$getLogger$cp
  #119 = Utf8               ()Ljava/util/logging/Logger;
  #120 = NameAndType        #118:#119     // access$getLogger$cp:()Ljava/util/logging/Logger;
  #121 = Methodref          #117.#120     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.access$getLogger$cp:()Ljava/util/logging/Logger;
  #122 = Utf8               getClass
  #123 = Utf8               ()Ljava/lang/Class;
  #124 = NameAndType        #122:#123     // getClass:()Ljava/lang/Class;
  #125 = Methodref          #4.#124       // java/lang/Object.getClass:()Ljava/lang/Class;
  #126 = Utf8               java/lang/Class
  #127 = Class              #126          // java/lang/Class
  #128 = Utf8               getSimpleName
  #129 = NameAndType        #128:#90      // getSimpleName:()Ljava/lang/String;
  #130 = Methodref          #127.#129     // java/lang/Class.getSimpleName:()Ljava/lang/String;
  #131 = Utf8               getMessage
  #132 = NameAndType        #131:#90      // getMessage:()Ljava/lang/String;
  #133 = Methodref          #15.#132      // java/lang/Exception.getMessage:()Ljava/lang/String;
  #134 = Utf8               [NativeStorage] Erro ao ler header: \u0001: \u0001
  #135 = String             #134          // [NativeStorage] Erro ao ler header: \u0001: \u0001
  #136 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #137 = NameAndType        #43:#136      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #138 = InvokeDynamic      #3:#137       // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #139 = Utf8               java/util/logging/Logger
  #140 = Class              #139          // java/util/logging/Logger
  #141 = Utf8               severe
  #142 = NameAndType        #141:#51      // severe:(Ljava/lang/String;)V
  #143 = Methodref          #140.#142     // java/util/logging/Logger.severe:(Ljava/lang/String;)V
  #144 = Utf8               validateHeader
  #145 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;JLjava/lang/foreign/MemorySegment;)V
  #146 = NameAndType        #144:#145     // validateHeader:(Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;JLjava/lang/foreign/MemorySegment;)V
  #147 = Methodref          #2.#146       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion.validateHeader:(Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;JLjava/lang/foreign/MemorySegment;)V
  #148 = Utf8               [NativeStorage] Validação falhou: \u0001
  #149 = String             #148          // [NativeStorage] Validação falhou: \u0001
  #150 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #151 = NameAndType        #43:#150      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #152 = InvokeDynamic      #4:#151       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #153 = Utf8               prefetchMemory
  #154 = Utf8               (Ljava/lang/foreign/MemorySegment;J)V
  #155 = NameAndType        #153:#154     // prefetchMemory:(Ljava/lang/foreign/MemorySegment;J)V
  #156 = Methodref          #2.#155       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion.prefetchMemory:(Ljava/lang/foreign/MemorySegment;J)V
  #157 = Utf8               (Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #158 = NameAndType        #5:#157       // "<init>":(Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #159 = Methodref          #117.#158     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage."<init>":(Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #160 = Utf8               [NativeStorage] Falha ao abrir: \u0001: \u0001
  #161 = String             #160          // [NativeStorage] Falha ao abrir: \u0001: \u0001
  #162 = InvokeDynamic      #5:#137       // #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #163 = Utf8               printStackTrace
  #164 = NameAndType        #163:#6       // printStackTrace:()V
  #165 = Methodref          #15.#164      // java/lang/Exception.printStackTrace:()V
  #166 = Utf8               close
  #167 = NameAndType        #166:#6       // close:()V
  #168 = InterfaceMethodref #17.#167      // java/lang/foreign/Arena.close:()V
  #169 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException
  #170 = Class              #169          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException
  #171 = Utf8               Falha ao abrir storage: \u0001: \u0001
  #172 = String             #171          // Falha ao abrir storage: \u0001: \u0001
  #173 = InvokeDynamic      #6:#137       // #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #174 = Utf8               java/lang/Throwable
  #175 = Class              #174          // java/lang/Throwable
  #176 = Utf8               (Ljava/lang/String;Ljava/lang/Throwable;)V
  #177 = NameAndType        #5:#176       // "<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
  #178 = Methodref          #170.#177     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
  #179 = Utf8               $i$a$-require-NativeStorage$Companion$open$1
  #180 = Utf8               I
  #181 = Utf8               e
  #182 = Utf8               Ljava/lang/Exception;
  #183 = Utf8               file
  #184 = Utf8               Ljava/io/File;
  #185 = Utf8               channel
  #186 = Utf8               Ljava/nio/channels/FileChannel;
  #187 = Utf8               fileSize
  #188 = Utf8               J
  #189 = Utf8               mapMode
  #190 = Utf8               segment
  #191 = Utf8               Ljava/lang/foreign/MemorySegment;
  #192 = Utf8               header
  #193 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
  #194 = Utf8               arena
  #195 = Utf8               Ljava/lang/foreign/Arena;
  #196 = Utf8               path
  #197 = Utf8               Ljava/nio/file/Path;
  #198 = Utf8               shared
  #199 = Utf8               Z
  #200 = Utf8               java/lang/foreign/MemorySegment
  #201 = Class              #200          // java/lang/foreign/MemorySegment
  #202 = Utf8               open$default
  #203 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;Ljava/nio/file/Path;ZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #204 = NameAndType        #11:#12       // open:(Ljava/nio/file/Path;Z)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #205 = Methodref          #2.#204       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion.open:(Ljava/nio/file/Path;Z)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #206 = Utf8               create
  #207 = Utf8               (Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #208 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #209 = Utf8               java/lang/Long
  #210 = Class              #209          // java/lang/Long
  #211 = Utf8               longValue
  #212 = NameAndType        #211:#77      // longValue:()J
  #213 = Methodref          #210.#212     // java/lang/Long.longValue:()J
  #214 = Utf8               getDataOffset
  #215 = NameAndType        #214:#77      // getDataOffset:()J
  #216 = Methodref          #105.#215     // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getDataOffset:()J
  #217 = Utf8               getParent
  #218 = Utf8               ()Ljava/nio/file/Path;
  #219 = NameAndType        #217:#218     // getParent:()Ljava/nio/file/Path;
  #220 = InterfaceMethodref #26.#219      // java/nio/file/Path.getParent:()Ljava/nio/file/Path;
  #221 = Utf8               mkdirs
  #222 = NameAndType        #221:#34      // mkdirs:()Z
  #223 = Methodref          #32.#222      // java/io/File.mkdirs:()Z
  #224 = Utf8               java/io/RandomAccessFile
  #225 = Class              #224          // java/io/RandomAccessFile
  #226 = Utf8               rw
  #227 = String             #226          // rw
  #228 = Utf8               (Ljava/io/File;Ljava/lang/String;)V
  #229 = NameAndType        #5:#228       // "<init>":(Ljava/io/File;Ljava/lang/String;)V
  #230 = Methodref          #225.#229     // java/io/RandomAccessFile."<init>":(Ljava/io/File;Ljava/lang/String;)V
  #231 = Utf8               java/io/Closeable
  #232 = Class              #231          // java/io/Closeable
  #233 = Utf8               setLength
  #234 = Utf8               (J)V
  #235 = NameAndType        #233:#234     // setLength:(J)V
  #236 = Methodref          #225.#235     // java/io/RandomAccessFile.setLength:(J)V
  #237 = Utf8               kotlin/Unit
  #238 = Class              #237          // kotlin/Unit
  #239 = Utf8               INSTANCE
  #240 = Utf8               Lkotlin/Unit;
  #241 = NameAndType        #239:#240     // INSTANCE:Lkotlin/Unit;
  #242 = Fieldref           #238.#241     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #243 = Utf8               kotlin/io/CloseableKt
  #244 = Class              #243          // kotlin/io/CloseableKt
  #245 = Utf8               closeFinally
  #246 = Utf8               (Ljava/io/Closeable;Ljava/lang/Throwable;)V
  #247 = NameAndType        #245:#246     // closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
  #248 = Methodref          #244.#247     // kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
  #249 = Utf8               WRITE
  #250 = NameAndType        #249:#68      // WRITE:Ljava/nio/file/StandardOpenOption;
  #251 = Fieldref           #66.#250      // java/nio/file/StandardOpenOption.WRITE:Ljava/nio/file/StandardOpenOption;
  #252 = Utf8               READ_WRITE
  #253 = NameAndType        #252:#97      // READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;
  #254 = Fieldref           #95.#253      // java/nio/channels/FileChannel$MapMode.READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;
  #255 = Utf8               writeTo
  #256 = Utf8               (Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;)V
  #257 = NameAndType        #255:#256     // writeTo:(Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;)V
  #258 = Methodref          #111.#257     // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion.writeTo:(Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;)V
  #259 = Utf8               Falha ao criar storage: \u0001
  #260 = String             #259          // Falha ao criar storage: \u0001
  #261 = InvokeDynamic      #7:#151       // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #262 = Utf8               $i$a$-use-NativeStorage$Companion$create$1
  #263 = Utf8               raf
  #264 = Utf8               Ljava/io/RandomAccessFile;
  #265 = Utf8               minSize
  #266 = Utf8               initialSize
  #267 = Utf8               Ljava/lang/Long;
  #268 = Utf8               create$default
  #269 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #270 = NameAndType        #206:#207     // create:(Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #271 = Methodref          #2.#270       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion.create:(Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #272 = Utf8               isValid
  #273 = NameAndType        #272:#34      // isValid:()Z
  #274 = Methodref          #105.#273     // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.isValid:()Z
  #275 = Utf8               getMagic
  #276 = NameAndType        #275:#77      // getMagic:()J
  #277 = Methodref          #105.#276     // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getMagic:()J
  #278 = Utf8               getVersion
  #279 = Utf8               ()S
  #280 = NameAndType        #278:#279     // getVersion:()S
  #281 = Methodref          #105.#280     // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getVersion:()S
  #282 = Utf8               Magic ou versão inválida. Esperado: 5490523817655992320/5, Obtido: \u0001/\u0001
  #283 = String             #282          // Magic ou versão inválida. Esperado: 5490523817655992320/5, Obtido: \u0001/\u0001
  #284 = Utf8               (JS)Ljava/lang/String;
  #285 = NameAndType        #43:#284      // makeConcatWithConstants:(JS)Ljava/lang/String;
  #286 = InvokeDynamic      #8:#285       // #8:makeConcatWithConstants:(JS)Ljava/lang/String;
  #287 = Utf8               getNodeCount
  #288 = Utf8               ()I
  #289 = NameAndType        #287:#288     // getNodeCount:()I
  #290 = Methodref          #105.#289     // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
  #291 = Utf8               Node count inválido: \u0001
  #292 = String             #291          // Node count inválido: \u0001
  #293 = Utf8               (I)Ljava/lang/String;
  #294 = NameAndType        #43:#293      // makeConcatWithConstants:(I)Ljava/lang/String;
  #295 = InvokeDynamic      #9:#294       // #9:makeConcatWithConstants:(I)Ljava/lang/String;
  #296 = Utf8               getIndexOffset
  #297 = NameAndType        #296:#77      // getIndexOffset:()J
  #298 = Methodref          #105.#297     // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getIndexOffset:()J
  #299 = Utf8               IndexOffset deve ser 64, obtido: \u0001
  #300 = String             #299          // IndexOffset deve ser 64, obtido: \u0001
  #301 = InvokeDynamic      #10:#85       // #10:makeConcatWithConstants:(J)Ljava/lang/String;
  #302 = Long               32l
  #304 = Utf8               Índice excede tamanho do arquivo. IndexEnd: \u0001, FileSize: \u0001, NodeCount: \u0001, EntrySize: 32
  #305 = String             #304          // Índice excede tamanho do arquivo. IndexEnd: \u0001, FileSize: \u0001, NodeCount: \u0001, EntrySize: 32
  #306 = Utf8               (JJI)Ljava/lang/String;
  #307 = NameAndType        #43:#306      // makeConcatWithConstants:(JJI)Ljava/lang/String;
  #308 = InvokeDynamic      #11:#307      // #11:makeConcatWithConstants:(JJI)Ljava/lang/String;
  #309 = Utf8               DataOffset (\u0001) deve ser >= IndexEnd (\u0001)
  #310 = String             #309          // DataOffset (\u0001) deve ser >= IndexEnd (\u0001)
  #311 = Utf8               (JJ)Ljava/lang/String;
  #312 = NameAndType        #43:#311      // makeConcatWithConstants:(JJ)Ljava/lang/String;
  #313 = InvokeDynamic      #12:#312      // #12:makeConcatWithConstants:(JJ)Ljava/lang/String;
  #314 = Utf8               indexEnd
  #315 = Utf8               java/lang/foreign/ValueLayout
  #316 = Class              #315          // java/lang/foreign/ValueLayout
  #317 = Utf8               JAVA_BYTE
  #318 = Utf8               Ljava/lang/foreign/ValueLayout$OfByte;
  #319 = NameAndType        #317:#318     // JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
  #320 = Fieldref           #316.#319     // java/lang/foreign/ValueLayout.JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
  #321 = Utf8               get
  #322 = Utf8               (Ljava/lang/foreign/ValueLayout$OfByte;J)B
  #323 = NameAndType        #321:#322     // get:(Ljava/lang/foreign/ValueLayout$OfByte;J)B
  #324 = InterfaceMethodref #201.#323     // java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfByte;J)B
  #325 = Utf8               offset
  #326 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #327 = Methodref          #2.#7         // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion."<init>":()V
  #328 = Utf8               $constructor_marker
  #329 = Utf8               Lkotlin/jvm/internal/DefaultConstructorMarker;
  #330 = Utf8               Lkotlin/Metadata;
  #331 = Utf8               mv
  #332 = Integer            2
  #333 = Integer            3
  #334 = Integer            0
  #335 = Utf8               k
  #336 = Integer            1
  #337 = Utf8               xi
  #338 = Integer            48
  #339 = Utf8               d1
  #340 = Utf8               \u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\'\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0016J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e
  #341 = Utf8               d2
  #342 = Utf8
  #343 = Utf8               INDEX_ENTRY_SIZE
  #344 = Utf8               PREFETCH_PAGES
  #345 = Utf8               PAGE_SIZE
  #346 = Utf8               logger
  #347 = Utf8               Ljava/util/logging/Logger;
  #348 = Utf8               kotlin.jvm.PlatformType
  #349 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #350 = Utf8               Brproject
  #351 = Utf8               java/lang/foreign/ValueLayout$OfByte
  #352 = Class              #351          // java/lang/foreign/ValueLayout$OfByte
  #353 = Utf8               OfByte
  #354 = Utf8               MapMode
  #355 = Utf8               NativeStorage.kt
  #356 = Utf8               Code
  #357 = Utf8               LineNumberTable
  #358 = Utf8               LocalVariableTable
  #359 = Utf8               StackMapTable
  #360 = Utf8               RuntimeInvisibleAnnotations
  #361 = Utf8               RuntimeInvisibleParameterAnnotations
  #362 = Utf8               InnerClasses
  #363 = Utf8               SourceFile
  #364 = Utf8               RuntimeVisibleAnnotations
  #365 = Utf8               BootstrapMethods
{
  public final ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage open(java.nio.file.Path, boolean);
    descriptor: (Ljava/nio/file/Path;Z)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=13, args_size=3
         0: iload_2
         1: ifeq          10
         4: invokestatic  #21                 // InterfaceMethod java/lang/foreign/Arena.ofShared:()Ljava/lang/foreign/Arena;
         7: goto          13
        10: invokestatic  #24                 // InterfaceMethod java/lang/foreign/Arena.ofConfined:()Ljava/lang/foreign/Arena;
        13: astore_3
        14: nop
        15: aload_1
        16: invokeinterface #30,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
        21: astore        4
        23: aload         4
        25: invokevirtual #36                 // Method java/io/File.exists:()Z
        28: ifne          45
        31: new           #38                 // class java/io/FileNotFoundException
        34: dup
        35: aload_1
        36: invokedynamic #50,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
        41: invokespecial #53                 // Method java/io/FileNotFoundException."<init>":(Ljava/lang/String;)V
        44: athrow
        45: aload         4
        47: invokevirtual #56                 // Method java/io/File.canRead:()Z
        50: ifne          67
        53: new           #58                 // class java/io/IOException
        56: dup
        57: aload_1
        58: invokedynamic #61,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
        63: invokespecial #62                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
        66: athrow
        67: aload_1
        68: iconst_1
        69: anewarray     #64                 // class java/nio/file/OpenOption
        72: astore        6
        74: aload         6
        76: iconst_0
        77: getstatic     #70                 // Field java/nio/file/StandardOpenOption.READ:Ljava/nio/file/StandardOpenOption;
        80: aastore
        81: aload         6
        83: invokestatic  #75                 // Method java/nio/channels/FileChannel.open:(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/nio/channels/FileChannel;
        86: astore        5
        88: aload         5
        90: invokevirtual #79                 // Method java/nio/channels/FileChannel.size:()J
        93: lstore        6
        95: lload         6
        97: ldc2_w        #80                 // long 64l
       100: lcmp
       101: iflt          108
       104: iconst_1
       105: goto          109
       108: iconst_0
       109: ifne          137
       112: iconst_0
       113: istore        9
       115: lload         6
       117: invokedynamic #86,  0             // InvokeDynamic #2:makeConcatWithConstants:(J)Ljava/lang/String;
       122: astore        9
       124: new           #88                 // class java/lang/IllegalArgumentException
       127: dup
       128: aload         9
       130: invokevirtual #92                 // Method java/lang/Object.toString:()Ljava/lang/String;
       133: invokespecial #93                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
       136: athrow
       137: getstatic     #99                 // Field java/nio/channels/FileChannel$MapMode.READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
       140: astore        8
       142: aload         5
       144: getstatic     #99                 // Field java/nio/channels/FileChannel$MapMode.READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
       147: lconst_0
       148: lload         6
       150: aload_3
       151: invokevirtual #103                // Method java/nio/channels/FileChannel.map:(Ljava/nio/channels/FileChannel$MapMode;JJLjava/lang/foreign/Arena;)Ljava/lang/foreign/MemorySegment;
       154: astore        9
       156: nop
       157: getstatic     #109                // Field ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.Companion:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
       160: aload         9
       162: invokevirtual #115                // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion.readFrom:(Ljava/lang/foreign/MemorySegment;)Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
       165: astore        11
       167: goto          199
       170: astore        12
       172: invokestatic  #121                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.access$getLogger$cp:()Ljava/util/logging/Logger;
       175: aload         12
       177: invokevirtual #125                // Method java/lang/Object.getClass:()Ljava/lang/Class;
       180: invokevirtual #130                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
       183: aload         12
       185: invokevirtual #133                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       188: invokedynamic #138,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       193: invokevirtual #143                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
       196: aload         12
       198: athrow
       199: aload         11
       201: astore        10
       203: nop
       204: aload_0
       205: aload         10
       207: lload         6
       209: aload         9
       211: invokespecial #147                // Method validateHeader:(Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;JLjava/lang/foreign/MemorySegment;)V
       214: goto          238
       217: astore        11
       219: invokestatic  #121                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.access$getLogger$cp:()Ljava/util/logging/Logger;
       222: aload         11
       224: invokevirtual #133                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       227: invokedynamic #152,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       232: invokevirtual #143                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
       235: aload         11
       237: athrow
       238: iload_2
       239: ifne          250
       242: aload_0
       243: aload         9
       245: lload         6
       247: invokespecial #156                // Method prefetchMemory:(Ljava/lang/foreign/MemorySegment;J)V
       250: new           #117                // class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
       253: dup
       254: aload_3
       255: aload         9
       257: aload         10
       259: iload_2
       260: ifeq          268
       263: aload         5
       265: goto          269
       268: aconst_null
       269: aconst_null
       270: invokespecial #159                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage."<init>":(Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
       273: astore        4
       275: goto          346
       278: astore        5
       280: invokestatic  #121                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.access$getLogger$cp:()Ljava/util/logging/Logger;
       283: aload         5
       285: invokevirtual #125                // Method java/lang/Object.getClass:()Ljava/lang/Class;
       288: invokevirtual #130                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
       291: aload         5
       293: invokevirtual #133                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       296: invokedynamic #162,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       301: invokevirtual #143                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
       304: aload         5
       306: invokevirtual #165                // Method java/lang/Exception.printStackTrace:()V
       309: aload_3
       310: invokeinterface #168,  1          // InterfaceMethod java/lang/foreign/Arena.close:()V
       315: new           #170                // class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException
       318: dup
       319: aload         5
       321: invokevirtual #125                // Method java/lang/Object.getClass:()Ljava/lang/Class;
       324: invokevirtual #130                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
       327: aload         5
       329: invokevirtual #133                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       332: invokedynamic #173,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       337: aload         5
       339: checkcast     #175                // class java/lang/Throwable
       342: invokespecial #178                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
       345: athrow
       346: aload         4
       348: areturn
      Exception table:
         from    to  target type
           156   167   170   Class java/lang/Exception
           203   214   217   Class java/lang/Exception
            14   275   278   Class java/lang/Exception
      StackMapTable: number_of_entries = 16
        frame_type = 10 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/foreign/Arena ]
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ class java/lang/foreign/Arena, class java/io/File ]
        frame_type = 21 /* same */
        frame_type = 253 /* append */
          offset_delta = 40
          locals = [ class java/nio/channels/FileChannel, long ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 27 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion, class java/nio/file/Path, int, class java/lang/foreign/Arena, class java/io/File, class java/nio/channels/FileChannel, long, class java/nio/channels/FileChannel$MapMode, class java/lang/foreign/MemorySegment ]
          stack = [ class java/lang/Exception ]
        frame_type = 253 /* append */
          offset_delta = 28
          locals = [ top, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion, class java/nio/file/Path, int, class java/lang/foreign/Arena, class java/io/File, class java/nio/channels/FileChannel, long, class java/nio/channels/FileChannel$MapMode, class java/lang/foreign/MemorySegment, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader ]
          stack = [ class java/lang/Exception ]
        frame_type = 20 /* same */
        frame_type = 11 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion, class java/nio/file/Path, int, class java/lang/foreign/Arena, class java/io/File, class java/nio/channels/FileChannel, long, class java/nio/channels/FileChannel$MapMode, class java/lang/foreign/MemorySegment, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader ]
          stack = [ uninitialized 250, uninitialized 250, class java/lang/foreign/Arena, class java/lang/foreign/MemorySegment, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion, class java/nio/file/Path, int, class java/lang/foreign/Arena, class java/io/File, class java/nio/channels/FileChannel, long, class java/nio/channels/FileChannel$MapMode, class java/lang/foreign/MemorySegment, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader ]
          stack = [ uninitialized 250, uninitialized 250, class java/lang/foreign/Arena, class java/lang/foreign/MemorySegment, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader, class java/nio/channels/FileChannel ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion, class java/nio/file/Path, int, class java/lang/foreign/Arena ]
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion, class java/nio/file/Path, int, class java/lang/foreign/Arena, class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage, class java/nio/channels/FileChannel, long, class java/nio/channels/FileChannel$MapMode, class java/lang/foreign/MemorySegment, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader ]
          stack = []
      LineNumberTable:
        line 48: 0
        line 49: 14
        line 50: 15
        line 51: 23
        line 52: 31
        line 55: 45
        line 56: 53
        line 58: 67
        line 59: 88
        line 61: 95
        line 62: 115
        line 61: 122
        line 64: 137
        line 65: 142
        line 67: 156
        line 68: 157
        line 69: 170
        line 70: 172
        line 71: 196
        line 67: 199
        line 74: 203
        line 75: 204
        line 76: 217
        line 77: 219
        line 78: 235
        line 80: 238
        line 81: 242
        line 83: 250
        line 85: 278
        line 86: 280
        line 87: 304
        line 88: 309
        line 89: 315
        line 49: 348
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          115       7     9 $i$a$-require-NativeStorage$Companion$open$1   I
          172      27    12     e   Ljava/lang/Exception;
          219      19    11     e   Ljava/lang/Exception;
           23     250     4  file   Ljava/io/File;
           88     185     5 channel   Ljava/nio/channels/FileChannel;
           95     178     6 fileSize   J
          142     131     8 mapMode   Ljava/nio/channels/FileChannel$MapMode;
          156     117     9 segment   Ljava/lang/foreign/MemorySegment;
          203      70    10 header   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
          280      66     5     e   Ljava/lang/Exception;
           14     335     3 arena   Ljava/lang/foreign/Arena;
            0     349     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
            0     349     1  path   Ljava/nio/file/Path;
            0     349     2 shared   Z
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public static ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage open$default(ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$Companion, java.nio.file.Path, boolean, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;Ljava/nio/file/Path;ZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=5, args_size=5
         0: iload_3
         1: iconst_2
         2: iand
         3: ifeq          8
         6: iconst_0
         7: istore_2
         8: aload_0
         9: aload_1
        10: iload_2
        11: invokevirtual #205                // Method open:(Ljava/nio/file/Path;Z)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        14: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */
      LineNumberTable:
        line 46: 0

  public final ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage create(java.nio.file.Path, ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader, java.lang.Long);
    descriptor: (Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=11, args_size=4
         0: invokestatic  #24                 // InterfaceMethod java/lang/foreign/Arena.ofConfined:()Ljava/lang/foreign/Arena;
         3: astore        4
         5: nop
         6: aload_3
         7: dup
         8: ifnull        17
        11: invokevirtual #213                // Method java/lang/Long.longValue:()J
        14: goto          27
        17: pop
        18: aload_2
        19: invokevirtual #216                // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getDataOffset:()J
        22: sipush        1024
        25: i2l
        26: ladd
        27: lstore        5
        29: aload_1
        30: invokeinterface #220,  1          // InterfaceMethod java/nio/file/Path.getParent:()Ljava/nio/file/Path;
        35: dup
        36: ifnull        55
        39: invokeinterface #30,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
        44: dup
        45: ifnull        55
        48: invokevirtual #223                // Method java/io/File.mkdirs:()Z
        51: pop
        52: goto          56
        55: pop
        56: new           #225                // class java/io/RandomAccessFile
        59: dup
        60: aload_1
        61: invokeinterface #30,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
        66: ldc           #227                // String rw
        68: invokespecial #230                // Method java/io/RandomAccessFile."<init>":(Ljava/io/File;Ljava/lang/String;)V
        71: checkcast     #232                // class java/io/Closeable
        74: astore        7
        76: aconst_null
        77: astore        8
        79: nop
        80: aload         7
        82: checkcast     #225                // class java/io/RandomAccessFile
        85: astore        9
        87: iconst_0
        88: istore        10
        90: aload         9
        92: lload         5
        94: invokevirtual #236                // Method java/io/RandomAccessFile.setLength:(J)V
        97: nop
        98: getstatic     #242                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       101: astore        9
       103: aload         7
       105: aload         8
       107: invokestatic  #248                // Method kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
       110: goto          134
       113: astore        10
       115: aload         10
       117: astore        8
       119: aload         10
       121: athrow
       122: astore        10
       124: aload         7
       126: aload         8
       128: invokestatic  #248                // Method kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
       131: aload         10
       133: athrow
       134: aload_1
       135: iconst_2
       136: anewarray     #64                 // class java/nio/file/OpenOption
       139: astore        8
       141: aload         8
       143: iconst_0
       144: getstatic     #70                 // Field java/nio/file/StandardOpenOption.READ:Ljava/nio/file/StandardOpenOption;
       147: aastore
       148: aload         8
       150: iconst_1
       151: getstatic     #251                // Field java/nio/file/StandardOpenOption.WRITE:Ljava/nio/file/StandardOpenOption;
       154: aastore
       155: aload         8
       157: invokestatic  #75                 // Method java/nio/channels/FileChannel.open:(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/nio/channels/FileChannel;
       160: astore        7
       162: aload         7
       164: getstatic     #254                // Field java/nio/channels/FileChannel$MapMode.READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;
       167: lconst_0
       168: lload         5
       170: aload         4
       172: invokevirtual #103                // Method java/nio/channels/FileChannel.map:(Ljava/nio/channels/FileChannel$MapMode;JJLjava/lang/foreign/Arena;)Ljava/lang/foreign/MemorySegment;
       175: astore        8
       177: getstatic     #109                // Field ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.Companion:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
       180: aload         8
       182: aload_2
       183: invokevirtual #258                // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion.writeTo:(Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;)V
       186: new           #117                // class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
       189: dup
       190: aload         4
       192: aload         8
       194: aload_2
       195: aload         7
       197: aconst_null
       198: invokespecial #159                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage."<init>":(Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
       201: astore        5
       203: goto          238
       206: astore        6
       208: aload         4
       210: invokeinterface #168,  1          // InterfaceMethod java/lang/foreign/Arena.close:()V
       215: new           #170                // class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException
       218: dup
       219: aload         6
       221: invokevirtual #133                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       224: invokedynamic #261,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       229: aload         6
       231: checkcast     #175                // class java/lang/Throwable
       234: invokespecial #178                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
       237: athrow
       238: aload         5
       240: areturn
      Exception table:
         from    to  target type
            79   103   113   Class java/lang/Throwable
            79   103   122   any
           113   122   122   any
           122   124   122   any
             5   203   206   Class java/lang/Exception
      StackMapTable: number_of_entries = 9
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion, class java/nio/file/Path, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader, class java/lang/Long, class java/lang/foreign/Arena ]
          stack = [ class java/lang/Long ]
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ long ]
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion, class java/nio/file/Path, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader, class java/lang/Long, class java/lang/foreign/Arena, long ]
          stack = [ class java/lang/Object ]
        frame_type = 0 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion, class java/nio/file/Path, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader, class java/lang/Long, class java/lang/foreign/Arena, long, class java/io/Closeable, null ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion, class java/nio/file/Path, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader, class java/lang/Long, class java/lang/foreign/Arena, long, class java/io/Closeable, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion, class java/nio/file/Path, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader, class java/lang/Long, class java/lang/foreign/Arena, long, class java/io/Closeable, null, class kotlin/Unit, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion, class java/nio/file/Path, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader, class java/lang/Long, class java/lang/foreign/Arena ]
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion, class java/nio/file/Path, class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader, class java/lang/Long, class java/lang/foreign/Arena, class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage, top, class java/nio/channels/FileChannel, class java/lang/foreign/MemorySegment, class kotlin/Unit, int ]
          stack = []
      LineNumberTable:
        line 93: 0
        line 95: 5
        line 96: 6
        line 98: 29
        line 100: 56
        line 101: 90
        line 102: 97
        line 100: 101
        line 103: 134
        line 104: 162
        line 105: 177
        line 106: 186
        line 107: 206
        line 108: 208
        line 109: 215
        line 95: 240
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           90       8    10 $i$a$-use-NativeStorage$Companion$create$1   I
           87      11     9   raf   Ljava/io/RandomAccessFile;
           29     172     5 minSize   J
          162      39     7 channel   Ljava/nio/channels/FileChannel;
          177      24     8 segment   Ljava/lang/foreign/MemorySegment;
          208      30     6     e   Ljava/lang/Exception;
            5     236     4 arena   Ljava/lang/foreign/Arena;
            0     241     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
            0     241     1  path   Ljava/nio/file/Path;
            0     241     2 header   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
            0     241     3 initialSize   Ljava/lang/Long;
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #13()
          org.jetbrains.annotations.NotNull
      parameter 2:
        0: #208()
          org.jetbrains.annotations.Nullable

  public static ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage create$default(ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$Companion, java.nio.file.Path, ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader, java.lang.Long, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=6, args_size=6
         0: iload         4
         2: iconst_4
         3: iand
         4: ifeq          9
         7: aconst_null
         8: astore_3
         9: aload_0
        10: aload_1
        11: aload_2
        12: aload_3
        13: invokevirtual #271                // Method create:(Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        16: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */
      LineNumberTable:
        line 92: 0

  public ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$Companion(kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokespecial #327                // Method "<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
            0       5     1 $constructor_marker   Lkotlin/jvm/internal/DefaultConstructorMarker;
}
InnerClasses:
  public static final #106= #111 of #105; // Companion=class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion of class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
  public static final #106= #2 of #117;   // Companion=class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion of class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
  public static #353= #352 of #316;       // OfByte=class java/lang/foreign/ValueLayout$OfByte of class java/lang/foreign/ValueLayout
  public static #354= #95 of #72;         // MapMode=class java/nio/channels/FileChannel$MapMode of class java/nio/channels/FileChannel
SourceFile: "NativeStorage.kt"
RuntimeVisibleAnnotations:
  0: #330(#331=[I#332,I#333,I#334],#335=I#336,#337=I#338,#339=[s#340],#341=[s#10,s#342,s#5,s#6,s#343,s#342,s#344,s#342,s#345,s#346,s#347,s#348,s#11,s#349,s#196,s#197,s#198,s#342,s#206,s#192,s#193,s#266,s#207,s#144,s#342,s#187,s#190,s#191,s#153,s#76,s#350])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\'\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0016J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;","","<init>","()V","INDEX_ENTRY_SIZE","","PREFETCH_PAGES","","PAGE_SIZE","logger","Ljava/util/logging/Logger;","kotlin.jvm.PlatformType","open","Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;","path","Ljava/nio/file/Path;","shared","","create","header","Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;","initialSize","(Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;","validateHeader","","fileSize","segment","Ljava/lang/foreign/MemorySegment;","prefetchMemory","size","Brproject"]
    )
BootstrapMethods:
  0: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #40 Arquivo não encontrado: \u0001
  1: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #60 Sem permissão de leitura: \u0001
  2: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #83 Arquivo muito pequeno para ter header válido: \u0001 bytes (min: 64)
  3: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #135 [NativeStorage] Erro ao ler header: \u0001: \u0001
  4: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #149 [NativeStorage] Validação falhou: \u0001
  5: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #161 [NativeStorage] Falha ao abrir: \u0001: \u0001
  6: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #172 Falha ao abrir storage: \u0001: \u0001
  7: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #260 Falha ao criar storage: \u0001
  8: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #283 Magic ou versão inválida. Esperado: 5490523817655992320/5, Obtido: \u0001/\u0001
  9: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #292 Node count inválido: \u0001
  10: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #300 IndexOffset deve ser 64, obtido: \u0001
  11: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #305 Índice excede tamanho do arquivo. IndexEnd: \u0001, FileSize: \u0001, NodeCount: \u0001, EntrySize: 32
  12: #47 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #310 DataOffset (\u0001) deve ser >= IndexEnd (\u0001)
