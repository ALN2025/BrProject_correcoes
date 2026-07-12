// Bytecode for: ext.mods.gameserver.handler.AbstractHandler
// File: ext\mods\gameserver\handler\AbstractHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/AbstractHandler.class
  Last modified 9 de jul de 2026; size 5455 bytes
  MD5 checksum 1b7ee458b9d22ff9631ecff5c1fa84ea
  Compiled from "AbstractHandler.java"
public abstract class ext.mods.gameserver.handler.AbstractHandler<K extends java.lang.Object, H extends java.lang.Object> extends java.lang.Object
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #11                         // ext/mods/gameserver/handler/AbstractHandler
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 5, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/handler/AbstractHandler._entries:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/handler/AbstractHandler
   #12 = NameAndType        #14:#15       // _entries:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/handler/AbstractHandler
   #14 = Utf8               _entries
   #15 = Utf8               Ljava/util/Map;
   #16 = InvokeDynamic      #0:#17        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #17 = NameAndType        #18:#19       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #18 = Utf8               makeConcatWithConstants
   #19 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #20 = Methodref          #21.#22       // java/lang/Thread.currentThread:()Ljava/lang/Thread;
   #21 = Class              #23           // java/lang/Thread
   #22 = NameAndType        #24:#25       // currentThread:()Ljava/lang/Thread;
   #23 = Utf8               java/lang/Thread
   #24 = Utf8               currentThread
   #25 = Utf8               ()Ljava/lang/Thread;
   #26 = Methodref          #21.#27       // java/lang/Thread.getContextClassLoader:()Ljava/lang/ClassLoader;
   #27 = NameAndType        #28:#29       // getContextClassLoader:()Ljava/lang/ClassLoader;
   #28 = Utf8               getContextClassLoader
   #29 = Utf8               ()Ljava/lang/ClassLoader;
   #30 = Methodref          #31.#32       // java/lang/ClassLoader.getResources:(Ljava/lang/String;)Ljava/util/Enumeration;
   #31 = Class              #33           // java/lang/ClassLoader
   #32 = NameAndType        #34:#35       // getResources:(Ljava/lang/String;)Ljava/util/Enumeration;
   #33 = Utf8               java/lang/ClassLoader
   #34 = Utf8               getResources
   #35 = Utf8               (Ljava/lang/String;)Ljava/util/Enumeration;
   #36 = InterfaceMethodref #37.#38       // java/util/Enumeration.hasMoreElements:()Z
   #37 = Class              #39           // java/util/Enumeration
   #38 = NameAndType        #40:#41       // hasMoreElements:()Z
   #39 = Utf8               java/util/Enumeration
   #40 = Utf8               hasMoreElements
   #41 = Utf8               ()Z
   #42 = InterfaceMethodref #37.#43       // java/util/Enumeration.nextElement:()Ljava/lang/Object;
   #43 = NameAndType        #44:#45       // nextElement:()Ljava/lang/Object;
   #44 = Utf8               nextElement
   #45 = Utf8               ()Ljava/lang/Object;
   #46 = Class              #47           // java/net/URL
   #47 = Utf8               java/net/URL
   #48 = Methodref          #46.#49       // java/net/URL.getProtocol:()Ljava/lang/String;
   #49 = NameAndType        #50:#51       // getProtocol:()Ljava/lang/String;
   #50 = Utf8               getProtocol
   #51 = Utf8               ()Ljava/lang/String;
   #52 = String             #53           // file
   #53 = Utf8               file
   #54 = Methodref          #55.#56       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #55 = Class              #57           // java/lang/String
   #56 = NameAndType        #58:#59       // equals:(Ljava/lang/Object;)Z
   #57 = Utf8               java/lang/String
   #58 = Utf8               equals
   #59 = Utf8               (Ljava/lang/Object;)Z
   #60 = Class              #61           // java/io/File
   #61 = Utf8               java/io/File
   #62 = Methodref          #46.#63       // java/net/URL.getFile:()Ljava/lang/String;
   #63 = NameAndType        #64:#51       // getFile:()Ljava/lang/String;
   #64 = Utf8               getFile
   #65 = Methodref          #60.#66       // java/io/File."<init>":(Ljava/lang/String;)V
   #66 = NameAndType        #5:#67        // "<init>":(Ljava/lang/String;)V
   #67 = Utf8               (Ljava/lang/String;)V
   #68 = Methodref          #60.#69       // java/io/File.exists:()Z
   #69 = NameAndType        #70:#41       // exists:()Z
   #70 = Utf8               exists
   #71 = String             #72           // /
   #72 = Utf8               /
   #73 = String             #74           // .
   #74 = Utf8               .
   #75 = Methodref          #55.#76       // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #76 = NameAndType        #77:#78       // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #77 = Utf8               replace
   #78 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #79 = Methodref          #60.#80       // java/io/File.list:()[Ljava/lang/String;
   #80 = NameAndType        #81:#82       // list:()[Ljava/lang/String;
   #81 = Utf8               list
   #82 = Utf8               ()[Ljava/lang/String;
   #83 = String             #84           // .class
   #84 = Utf8               .class
   #85 = Methodref          #55.#86       // java/lang/String.endsWith:(Ljava/lang/String;)Z
   #86 = NameAndType        #87:#88       // endsWith:(Ljava/lang/String;)Z
   #87 = Utf8               endsWith
   #88 = Utf8               (Ljava/lang/String;)Z
   #89 = Methodref          #55.#90       // java/lang/String.length:()I
   #90 = NameAndType        #91:#92       // length:()I
   #91 = Utf8               length
   #92 = Utf8               ()I
   #93 = Methodref          #55.#94       // java/lang/String.substring:(II)Ljava/lang/String;
   #94 = NameAndType        #95:#96       // substring:(II)Ljava/lang/String;
   #95 = Utf8               substring
   #96 = Utf8               (II)Ljava/lang/String;
   #97 = InvokeDynamic      #1:#98        // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #98 = NameAndType        #18:#99       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #99 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #100 = Methodref          #101.#102     // java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
  #101 = Class              #103          // java/lang/Class
  #102 = NameAndType        #104:#105     // forName:(Ljava/lang/String;)Ljava/lang/Class;
  #103 = Utf8               java/lang/Class
  #104 = Utf8               forName
  #105 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;
  #106 = Methodref          #101.#107     // java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
  #107 = NameAndType        #108:#109     // isAssignableFrom:(Ljava/lang/Class;)Z
  #108 = Utf8               isAssignableFrom
  #109 = Utf8               (Ljava/lang/Class;)Z
  #110 = Methodref          #101.#111     // java/lang/Class.isInterface:()Z
  #111 = NameAndType        #112:#41      // isInterface:()Z
  #112 = Utf8               isInterface
  #113 = Methodref          #101.#114     // java/lang/Class.getModifiers:()I
  #114 = NameAndType        #115:#92      // getModifiers:()I
  #115 = Utf8               getModifiers
  #116 = Methodref          #117.#118     // java/lang/reflect/Modifier.isAbstract:(I)Z
  #117 = Class              #119          // java/lang/reflect/Modifier
  #118 = NameAndType        #120:#121     // isAbstract:(I)Z
  #119 = Utf8               java/lang/reflect/Modifier
  #120 = Utf8               isAbstract
  #121 = Utf8               (I)Z
  #122 = Methodref          #101.#123     // java/lang/Class.getDeclaredConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #123 = NameAndType        #124:#125     // getDeclaredConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #124 = Utf8               getDeclaredConstructor
  #125 = Utf8               ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #126 = Methodref          #127.#128     // java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #127 = Class              #129          // java/lang/reflect/Constructor
  #128 = NameAndType        #130:#131     // newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #129 = Utf8               java/lang/reflect/Constructor
  #130 = Utf8               newInstance
  #131 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
  #132 = Methodref          #101.#133     // java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
  #133 = NameAndType        #134:#135     // cast:(Ljava/lang/Object;)Ljava/lang/Object;
  #134 = Utf8               cast
  #135 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #136 = Methodref          #11.#137      // ext/mods/gameserver/handler/AbstractHandler.registerHandler:(Ljava/lang/Object;)V
  #137 = NameAndType        #138:#139     // registerHandler:(Ljava/lang/Object;)V
  #138 = Utf8               registerHandler
  #139 = Utf8               (Ljava/lang/Object;)V
  #140 = String             #141          // jar
  #141 = Utf8               jar
  #142 = Methodref          #46.#143      // java/net/URL.openConnection:()Ljava/net/URLConnection;
  #143 = NameAndType        #144:#145     // openConnection:()Ljava/net/URLConnection;
  #144 = Utf8               openConnection
  #145 = Utf8               ()Ljava/net/URLConnection;
  #146 = Class              #147          // java/net/JarURLConnection
  #147 = Utf8               java/net/JarURLConnection
  #148 = Methodref          #146.#149     // java/net/JarURLConnection.getJarFile:()Ljava/util/jar/JarFile;
  #149 = NameAndType        #150:#151     // getJarFile:()Ljava/util/jar/JarFile;
  #150 = Utf8               getJarFile
  #151 = Utf8               ()Ljava/util/jar/JarFile;
  #152 = Methodref          #153.#154     // java/util/jar/JarFile.entries:()Ljava/util/Enumeration;
  #153 = Class              #155          // java/util/jar/JarFile
  #154 = NameAndType        #156:#157     // entries:()Ljava/util/Enumeration;
  #155 = Utf8               java/util/jar/JarFile
  #156 = Utf8               entries
  #157 = Utf8               ()Ljava/util/Enumeration;
  #158 = Class              #159          // java/util/jar/JarEntry
  #159 = Utf8               java/util/jar/JarEntry
  #160 = Methodref          #158.#161     // java/util/jar/JarEntry.getName:()Ljava/lang/String;
  #161 = NameAndType        #162:#51      // getName:()Ljava/lang/String;
  #162 = Utf8               getName
  #163 = Methodref          #55.#164      // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #164 = NameAndType        #165:#88      // startsWith:(Ljava/lang/String;)Z
  #165 = Utf8               startsWith
  #166 = Methodref          #55.#167      // java/lang/String.replace:(CC)Ljava/lang/String;
  #167 = NameAndType        #77:#168      // replace:(CC)Ljava/lang/String;
  #168 = Utf8               (CC)Ljava/lang/String;
  #169 = String             #170          //
  #170 = Utf8
  #171 = Methodref          #153.#172     // java/util/jar/JarFile.close:()V
  #172 = NameAndType        #173:#6       // close:()V
  #173 = Utf8               close
  #174 = Class              #175          // java/lang/Throwable
  #175 = Utf8               java/lang/Throwable
  #176 = Methodref          #174.#177     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #177 = NameAndType        #178:#179     // addSuppressed:(Ljava/lang/Throwable;)V
  #178 = Utf8               addSuppressed
  #179 = Utf8               (Ljava/lang/Throwable;)V
  #180 = Class              #181          // java/lang/Exception
  #181 = Utf8               java/lang/Exception
  #182 = Fieldref           #11.#183      // ext/mods/gameserver/handler/AbstractHandler.LOGGER:Lext/mods/commons/logging/CLogger;
  #183 = NameAndType        #184:#185     // LOGGER:Lext/mods/commons/logging/CLogger;
  #184 = Utf8               LOGGER
  #185 = Utf8               Lext/mods/commons/logging/CLogger;
  #186 = String             #187          // Failed to load classes from package {}
  #187 = Utf8               Failed to load classes from package {}
  #188 = Methodref          #189.#190     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #189 = Class              #191          // ext/mods/commons/logging/CLogger
  #190 = NameAndType        #192:#193     // warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #191 = Utf8               ext/mods/commons/logging/CLogger
  #192 = Utf8               warn
  #193 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #194 = InterfaceMethodref #195.#196     // java/util/Map.size:()I
  #195 = Class              #197          // java/util/Map
  #196 = NameAndType        #198:#92      // size:()I
  #197 = Utf8               java/util/Map
  #198 = Utf8               size
  #199 = InterfaceMethodref #195.#200     // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #200 = NameAndType        #201:#202     // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #201 = Utf8               getOrDefault
  #202 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #203 = Methodref          #101.#161     // java/lang/Class.getName:()Ljava/lang/String;
  #204 = Methodref          #189.#66      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #205 = Utf8               Signature
  #206 = Utf8               Ljava/util/Map<TK;TH;>;
  #207 = Utf8               (TH;)V
  #208 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)V
  #209 = Utf8               Code
  #210 = Utf8               LineNumberTable
  #211 = Utf8               LocalVariableTable
  #212 = Utf8               clazz
  #213 = Utf8               Ljava/lang/Class;
  #214 = Utf8               Ljava/lang/String;
  #215 = Utf8               directory
  #216 = Utf8               Ljava/io/File;
  #217 = Utf8               packageName
  #218 = Utf8               entry
  #219 = Utf8               Ljava/util/jar/JarEntry;
  #220 = Utf8               entryName
  #221 = Utf8               Ljava/util/Enumeration;
  #222 = Utf8               jarFile
  #223 = Utf8               Ljava/util/jar/JarFile;
  #224 = Utf8               conn
  #225 = Utf8               Ljava/net/JarURLConnection;
  #226 = Utf8               resource
  #227 = Utf8               Ljava/net/URL;
  #228 = Utf8               resources
  #229 = Utf8               e
  #230 = Utf8               Ljava/lang/Exception;
  #231 = Utf8               this
  #232 = Utf8               Lext/mods/gameserver/handler/AbstractHandler;
  #233 = Utf8               handlerInterface
  #234 = Utf8               className
  #235 = Utf8               packagePath
  #236 = Utf8               LocalVariableTypeTable
  #237 = Utf8               Ljava/lang/Class<*>;
  #238 = Utf8               Ljava/util/Enumeration<Ljava/util/jar/JarEntry;>;
  #239 = Utf8               Ljava/util/Enumeration<Ljava/net/URL;>;
  #240 = Utf8               Lext/mods/gameserver/handler/AbstractHandler<TK;TH;>;
  #241 = Utf8               Ljava/lang/Class<TH;>;
  #242 = Utf8               StackMapTable
  #243 = Class              #244          // "[Ljava/lang/String;"
  #244 = Utf8               [Ljava/lang/String;
  #245 = Utf8               (Ljava/lang/Class<TH;>;Ljava/lang/String;)V
  #246 = Utf8               getHandler
  #247 = Utf8               key
  #248 = Utf8               Ljava/lang/Object;
  #249 = Utf8               (Ljava/lang/Object;)TH;
  #250 = Utf8               <clinit>
  #251 = Utf8               <K:Ljava/lang/Object;H:Ljava/lang/Object;>Ljava/lang/Object;
  #252 = Utf8               SourceFile
  #253 = Utf8               AbstractHandler.java
  #254 = Utf8               BootstrapMethods
  #255 = String             #256          // ext/mods/gameserver/handler/\u0001
  #256 = Utf8               ext/mods/gameserver/handler/\u0001
  #257 = String             #258          // \u0001.\u0001
  #258 = Utf8               \u0001.\u0001
  #259 = MethodHandle       6:#260        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #260 = Methodref          #261.#262     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #261 = Class              #263          // java/lang/invoke/StringConcatFactory
  #262 = NameAndType        #18:#264      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #263 = Utf8               java/lang/invoke/StringConcatFactory
  #264 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #265 = Utf8               InnerClasses
  #266 = Class              #267          // java/lang/invoke/MethodHandles$Lookup
  #267 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #268 = Class              #269          // java/lang/invoke/MethodHandles
  #269 = Utf8               java/lang/invoke/MethodHandles
  #270 = Utf8               Lookup
{
  protected final java.util.Map<K, H> _entries;
    descriptor: Ljava/util/Map;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #206                         // Ljava/util/Map<TK;TH;>;

  protected abstract void registerHandler(H);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT
    Signature: #207                         // (TH;)V

  protected ext.mods.gameserver.handler.AbstractHandler(java.lang.Class<H>, java.lang.String);
    descriptor: (Ljava/lang/Class;Ljava/lang/String;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=13, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _entries:Ljava/util/Map;
        15: aload_2
        16: invokedynamic #16,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        21: astore_3
        22: invokestatic  #20                 // Method java/lang/Thread.currentThread:()Ljava/lang/Thread;
        25: invokevirtual #26                 // Method java/lang/Thread.getContextClassLoader:()Ljava/lang/ClassLoader;
        28: aload_3
        29: invokevirtual #30                 // Method java/lang/ClassLoader.getResources:(Ljava/lang/String;)Ljava/util/Enumeration;
        32: astore        4
        34: aload         4
        36: invokeinterface #36,  1           // InterfaceMethod java/util/Enumeration.hasMoreElements:()Z
        41: ifeq          446
        44: aload         4
        46: invokeinterface #42,  1           // InterfaceMethod java/util/Enumeration.nextElement:()Ljava/lang/Object;
        51: checkcast     #46                 // class java/net/URL
        54: astore        5
        56: aload         5
        58: invokevirtual #48                 // Method java/net/URL.getProtocol:()Ljava/lang/String;
        61: ldc           #52                 // String file
        63: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        66: ifeq          236
        69: new           #60                 // class java/io/File
        72: dup
        73: aload         5
        75: invokevirtual #62                 // Method java/net/URL.getFile:()Ljava/lang/String;
        78: invokespecial #65                 // Method java/io/File."<init>":(Ljava/lang/String;)V
        81: astore        6
        83: aload         6
        85: invokevirtual #68                 // Method java/io/File.exists:()Z
        88: ifne          94
        91: goto          34
        94: aload_3
        95: ldc           #71                 // String /
        97: ldc           #73                 // String .
        99: invokevirtual #75                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       102: astore        7
       104: aload         6
       106: invokevirtual #79                 // Method java/io/File.list:()[Ljava/lang/String;
       109: astore        8
       111: aload         8
       113: arraylength
       114: istore        9
       116: iconst_0
       117: istore        10
       119: iload         10
       121: iload         9
       123: if_icmpge     233
       126: aload         8
       128: iload         10
       130: aaload
       131: astore        11
       133: aload         11
       135: ldc           #83                 // String .class
       137: invokevirtual #85                 // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
       140: ifne          146
       143: goto          227
       146: aload         7
       148: aload         11
       150: iconst_0
       151: aload         11
       153: invokevirtual #89                 // Method java/lang/String.length:()I
       156: bipush        6
       158: isub
       159: invokevirtual #93                 // Method java/lang/String.substring:(II)Ljava/lang/String;
       162: invokedynamic #97,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       167: invokestatic  #100                // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
       170: astore        12
       172: aload_1
       173: aload         12
       175: invokevirtual #106                // Method java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
       178: ifeq          227
       181: aload         12
       183: invokevirtual #110                // Method java/lang/Class.isInterface:()Z
       186: ifne          227
       189: aload         12
       191: invokevirtual #113                // Method java/lang/Class.getModifiers:()I
       194: invokestatic  #116                // Method java/lang/reflect/Modifier.isAbstract:(I)Z
       197: ifeq          203
       200: goto          227
       203: aload_0
       204: aload_1
       205: aload         12
       207: iconst_0
       208: anewarray     #101                // class java/lang/Class
       211: invokevirtual #122                // Method java/lang/Class.getDeclaredConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
       214: iconst_0
       215: anewarray     #2                  // class java/lang/Object
       218: invokevirtual #126                // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
       221: invokevirtual #132                // Method java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
       224: invokevirtual #136                // Method registerHandler:(Ljava/lang/Object;)V
       227: iinc          10, 1
       230: goto          119
       233: goto          443
       236: aload         5
       238: invokevirtual #48                 // Method java/net/URL.getProtocol:()Ljava/lang/String;
       241: ldc           #140                // String jar
       243: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       246: ifeq          443
       249: aload         5
       251: invokevirtual #142                // Method java/net/URL.openConnection:()Ljava/net/URLConnection;
       254: checkcast     #146                // class java/net/JarURLConnection
       257: astore        6
       259: aload         6
       261: invokevirtual #148                // Method java/net/JarURLConnection.getJarFile:()Ljava/util/jar/JarFile;
       264: astore        7
       266: aload         7
       268: invokevirtual #152                // Method java/util/jar/JarFile.entries:()Ljava/util/Enumeration;
       271: astore        8
       273: aload         8
       275: invokeinterface #36,  1           // InterfaceMethod java/util/Enumeration.hasMoreElements:()Z
       280: ifeq          403
       283: aload         8
       285: invokeinterface #42,  1           // InterfaceMethod java/util/Enumeration.nextElement:()Ljava/lang/Object;
       290: checkcast     #158                // class java/util/jar/JarEntry
       293: astore        9
       295: aload         9
       297: invokevirtual #160                // Method java/util/jar/JarEntry.getName:()Ljava/lang/String;
       300: astore        10
       302: aload         10
       304: aload_3
       305: invokevirtual #163                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       308: ifeq          273
       311: aload         10
       313: ldc           #83                 // String .class
       315: invokevirtual #85                 // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
       318: ifne          324
       321: goto          273
       324: aload         10
       326: bipush        47
       328: bipush        46
       330: invokevirtual #166                // Method java/lang/String.replace:(CC)Ljava/lang/String;
       333: ldc           #83                 // String .class
       335: ldc           #169                // String
       337: invokevirtual #75                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       340: invokestatic  #100                // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
       343: astore        11
       345: aload_1
       346: aload         11
       348: invokevirtual #106                // Method java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
       351: ifeq          273
       354: aload         11
       356: invokevirtual #110                // Method java/lang/Class.isInterface:()Z
       359: ifne          273
       362: aload         11
       364: invokevirtual #113                // Method java/lang/Class.getModifiers:()I
       367: invokestatic  #116                // Method java/lang/reflect/Modifier.isAbstract:(I)Z
       370: ifeq          376
       373: goto          273
       376: aload_0
       377: aload_1
       378: aload         11
       380: iconst_0
       381: anewarray     #101                // class java/lang/Class
       384: invokevirtual #122                // Method java/lang/Class.getDeclaredConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
       387: iconst_0
       388: anewarray     #2                  // class java/lang/Object
       391: invokevirtual #126                // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
       394: invokevirtual #132                // Method java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
       397: invokevirtual #136                // Method registerHandler:(Ljava/lang/Object;)V
       400: goto          273
       403: aload         7
       405: ifnull        443
       408: aload         7
       410: invokevirtual #171                // Method java/util/jar/JarFile.close:()V
       413: goto          443
       416: astore        8
       418: aload         7
       420: ifnull        440
       423: aload         7
       425: invokevirtual #171                // Method java/util/jar/JarFile.close:()V
       428: goto          440
       431: astore        9
       433: aload         8
       435: aload         9
       437: invokevirtual #176                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       440: aload         8
       442: athrow
       443: goto          34
       446: goto          469
       449: astore        4
       451: getstatic     #182                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       454: ldc           #186                // String Failed to load classes from package {}
       456: aload         4
       458: iconst_1
       459: anewarray     #2                  // class java/lang/Object
       462: dup
       463: iconst_0
       464: aload_3
       465: aastore
       466: invokevirtual #188                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       469: return
      Exception table:
         from    to  target type
           266   403   416   Class java/lang/Throwable
           423   428   431   Class java/lang/Throwable
            22   446   449   Class java/lang/Exception
      LineNumberTable:
        line 41: 0
        line 36: 4
        line 42: 15
        line 46: 22
        line 47: 34
        line 49: 44
        line 51: 56
        line 53: 69
        line 54: 83
        line 55: 91
        line 57: 94
        line 59: 104
        line 61: 133
        line 62: 143
        line 64: 146
        line 65: 172
        line 66: 200
        line 68: 203
        line 59: 227
        line 70: 233
        line 71: 236
        line 73: 249
        line 74: 259
        line 76: 266
        line 77: 273
        line 79: 283
        line 80: 295
        line 82: 302
        line 83: 321
        line 85: 324
        line 86: 345
        line 87: 373
        line 89: 376
        line 90: 400
        line 91: 403
        line 74: 416
        line 93: 443
        line 98: 446
        line 95: 449
        line 97: 451
        line 99: 469
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          172      55    12 clazz   Ljava/lang/Class;
          133      94    11  file   Ljava/lang/String;
           83     150     6 directory   Ljava/io/File;
          104     129     7 packageName   Ljava/lang/String;
          295     105     9 entry   Ljava/util/jar/JarEntry;
          302      98    10 entryName   Ljava/lang/String;
          345      55    11 clazz   Ljava/lang/Class;
          273     130     8 entries   Ljava/util/Enumeration;
          266     177     7 jarFile   Ljava/util/jar/JarFile;
          259     184     6  conn   Ljava/net/JarURLConnection;
           56     387     5 resource   Ljava/net/URL;
           34     412     4 resources   Ljava/util/Enumeration;
          451      18     4     e   Ljava/lang/Exception;
            0     470     0  this   Lext/mods/gameserver/handler/AbstractHandler;
            0     470     1 handlerInterface   Ljava/lang/Class;
            0     470     2 className   Ljava/lang/String;
           22     448     3 packagePath   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          172      55    12 clazz   Ljava/lang/Class<*>;
          345      55    11 clazz   Ljava/lang/Class<*>;
          273     130     8 entries   Ljava/util/Enumeration<Ljava/util/jar/JarEntry;>;
           34     412     4 resources   Ljava/util/Enumeration<Ljava/net/URL;>;
            0     470     0  this   Lext/mods/gameserver/handler/AbstractHandler<TK;TH;>;
            0     470     1 handlerInterface   Ljava/lang/Class<TH;>;
      StackMapTable: number_of_entries = 19
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/handler/AbstractHandler, class java/lang/Class, class java/lang/String, class java/lang/String, class java/util/Enumeration ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 59
          locals = [ class java/net/URL, class java/io/File ]
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/handler/AbstractHandler, class java/lang/Class, class java/lang/String, class java/lang/String, class java/util/Enumeration, class java/net/URL, class java/io/File, class java/lang/String, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ class java/lang/Class ]
        frame_type = 249 /* chop */
          offset_delta = 23
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/AbstractHandler, class java/lang/Class, class java/lang/String, class java/lang/String, class java/util/Enumeration, class java/net/URL ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 254 /* append */
          offset_delta = 36
          locals = [ class java/net/JarURLConnection, class java/util/jar/JarFile, class java/util/Enumeration ]
        frame_type = 253 /* append */
          offset_delta = 50
          locals = [ class java/util/jar/JarEntry, class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ class java/lang/Class ]
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/handler/AbstractHandler, class java/lang/Class, class java/lang/String, class java/lang/String, class java/util/Enumeration, class java/net/URL, class java/net/JarURLConnection, class java/util/jar/JarFile ]
          stack = []
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/handler/AbstractHandler, class java/lang/Class, class java/lang/String, class java/lang/String, class java/util/Enumeration, class java/net/URL, class java/net/JarURLConnection, class java/util/jar/JarFile, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/AbstractHandler, class java/lang/Class, class java/lang/String, class java/lang/String, class java/util/Enumeration ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 19 /* same */
    Signature: #245                         // (Ljava/lang/Class<TH;>;Ljava/lang/String;)V

  public int size();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/Map;
         4: invokeinterface #194,  1          // InterfaceMethod java/util/Map.size:()I
         9: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/handler/AbstractHandler;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/handler/AbstractHandler<TK;TH;>;

  public H getHandler(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/Map;
         4: aload_1
         5: aconst_null
         6: invokeinterface #199,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        11: areturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/handler/AbstractHandler;
            0      12     1   key   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/handler/AbstractHandler<TK;TH;>;
    Signature: #249                         // (Ljava/lang/Object;)TH;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #189                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/handler/AbstractHandler
         6: invokevirtual #203                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #204                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #182                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 34: 0
}
Signature: #251                         // <K:Ljava/lang/Object;H:Ljava/lang/Object;>Ljava/lang/Object;
SourceFile: "AbstractHandler.java"
BootstrapMethods:
  0: #259 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #255 ext/mods/gameserver/handler/\u0001
  1: #259 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #257 \u0001.\u0001
InnerClasses:
  public static final #270= #266 of #268; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
