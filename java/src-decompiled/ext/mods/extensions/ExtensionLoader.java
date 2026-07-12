// Bytecode for: ext.mods.extensions.ExtensionLoader
// File: ext\mods\extensions\ExtensionLoader.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/ExtensionLoader.class
  Last modified 9 de jul de 2026; size 5576 bytes
  MD5 checksum f5b7e47d6c2cdf1feaef6dbeff81218b
  Compiled from "ExtensionLoader.java"
public class ext.mods.extensions.ExtensionLoader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #9                          // ext/mods/extensions/ExtensionLoader
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 7, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/io/File
    #8 = Utf8               java/io/File
    #9 = Class              #10           // ext/mods/extensions/ExtensionLoader
   #10 = Utf8               ext/mods/extensions/ExtensionLoader
   #11 = String             #12           // ../libs/
   #12 = Utf8               ../libs/
   #13 = Methodref          #7.#14        // java/io/File."<init>":(Ljava/lang/String;)V
   #14 = NameAndType        #5:#15        // "<init>":(Ljava/lang/String;)V
   #15 = Utf8               (Ljava/lang/String;)V
   #16 = Methodref          #7.#17        // java/io/File.exists:()Z
   #17 = NameAndType        #18:#19       // exists:()Z
   #18 = Utf8               exists
   #19 = Utf8               ()Z
   #20 = Methodref          #7.#21        // java/io/File.isDirectory:()Z
   #21 = NameAndType        #22:#19       // isDirectory:()Z
   #22 = Utf8               isDirectory
   #23 = Fieldref           #24.#25       // java/lang/System.out:Ljava/io/PrintStream;
   #24 = Class              #26           // java/lang/System
   #25 = NameAndType        #27:#28       // out:Ljava/io/PrintStream;
   #26 = Utf8               java/lang/System
   #27 = Utf8               out
   #28 = Utf8               Ljava/io/PrintStream;
   #29 = String             #30           // [ExtensionLoader] Pasta libs não encontrada.
   #30 = Utf8               [ExtensionLoader] Pasta libs não encontrada.
   #31 = Methodref          #32.#33       // java/io/PrintStream.println:(Ljava/lang/String;)V
   #32 = Class              #34           // java/io/PrintStream
   #33 = NameAndType        #35:#15       // println:(Ljava/lang/String;)V
   #34 = Utf8               java/io/PrintStream
   #35 = Utf8               println
   #36 = InvokeDynamic      #0:#37        // #0:accept:()Ljava/io/FilenameFilter;
   #37 = NameAndType        #38:#39       // accept:()Ljava/io/FilenameFilter;
   #38 = Utf8               accept
   #39 = Utf8               ()Ljava/io/FilenameFilter;
   #40 = Methodref          #7.#41        // java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
   #41 = NameAndType        #42:#43       // listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
   #42 = Utf8               listFiles
   #43 = Utf8               (Ljava/io/FilenameFilter;)[Ljava/io/File;
   #44 = Methodref          #9.#45        // ext/mods/extensions/ExtensionLoader.loadJar:(Ljava/io/File;)V
   #45 = NameAndType        #46:#47       // loadJar:(Ljava/io/File;)V
   #46 = Utf8               loadJar
   #47 = Utf8               (Ljava/io/File;)V
   #48 = Class              #49           // java/util/jar/JarFile
   #49 = Utf8               java/util/jar/JarFile
   #50 = Methodref          #48.#51       // java/util/jar/JarFile."<init>":(Ljava/io/File;)V
   #51 = NameAndType        #5:#47        // "<init>":(Ljava/io/File;)V
   #52 = Class              #53           // java/net/URLClassLoader
   #53 = Utf8               java/net/URLClassLoader
   #54 = Class              #55           // java/net/URL
   #55 = Utf8               java/net/URL
   #56 = Methodref          #7.#57        // java/io/File.toURI:()Ljava/net/URI;
   #57 = NameAndType        #58:#59       // toURI:()Ljava/net/URI;
   #58 = Utf8               toURI
   #59 = Utf8               ()Ljava/net/URI;
   #60 = Methodref          #61.#62       // java/net/URI.toURL:()Ljava/net/URL;
   #61 = Class              #63           // java/net/URI
   #62 = NameAndType        #64:#65       // toURL:()Ljava/net/URL;
   #63 = Utf8               java/net/URI
   #64 = Utf8               toURL
   #65 = Utf8               ()Ljava/net/URL;
   #66 = Methodref          #67.#68       // java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
   #67 = Class              #69           // java/lang/Class
   #68 = NameAndType        #70:#71       // getClassLoader:()Ljava/lang/ClassLoader;
   #69 = Utf8               java/lang/Class
   #70 = Utf8               getClassLoader
   #71 = Utf8               ()Ljava/lang/ClassLoader;
   #72 = Methodref          #52.#73       // java/net/URLClassLoader."<init>":([Ljava/net/URL;Ljava/lang/ClassLoader;)V
   #73 = NameAndType        #5:#74        // "<init>":([Ljava/net/URL;Ljava/lang/ClassLoader;)V
   #74 = Utf8               ([Ljava/net/URL;Ljava/lang/ClassLoader;)V
   #75 = Methodref          #48.#76       // java/util/jar/JarFile.entries:()Ljava/util/Enumeration;
   #76 = NameAndType        #77:#78       // entries:()Ljava/util/Enumeration;
   #77 = Utf8               entries
   #78 = Utf8               ()Ljava/util/Enumeration;
   #79 = InterfaceMethodref #80.#81       // java/util/Enumeration.hasMoreElements:()Z
   #80 = Class              #82           // java/util/Enumeration
   #81 = NameAndType        #83:#19       // hasMoreElements:()Z
   #82 = Utf8               java/util/Enumeration
   #83 = Utf8               hasMoreElements
   #84 = InterfaceMethodref #80.#85       // java/util/Enumeration.nextElement:()Ljava/lang/Object;
   #85 = NameAndType        #86:#87       // nextElement:()Ljava/lang/Object;
   #86 = Utf8               nextElement
   #87 = Utf8               ()Ljava/lang/Object;
   #88 = Class              #89           // java/util/jar/JarEntry
   #89 = Utf8               java/util/jar/JarEntry
   #90 = Methodref          #88.#21       // java/util/jar/JarEntry.isDirectory:()Z
   #91 = Methodref          #88.#92       // java/util/jar/JarEntry.getName:()Ljava/lang/String;
   #92 = NameAndType        #93:#94       // getName:()Ljava/lang/String;
   #93 = Utf8               getName
   #94 = Utf8               ()Ljava/lang/String;
   #95 = String             #96           // .class
   #96 = Utf8               .class
   #97 = Methodref          #98.#99       // java/lang/String.endsWith:(Ljava/lang/String;)Z
   #98 = Class              #100          // java/lang/String
   #99 = NameAndType        #101:#102     // endsWith:(Ljava/lang/String;)Z
  #100 = Utf8               java/lang/String
  #101 = Utf8               endsWith
  #102 = Utf8               (Ljava/lang/String;)Z
  #103 = String             #104          // /
  #104 = Utf8               /
  #105 = String             #106          // .
  #106 = Utf8               .
  #107 = Methodref          #98.#108      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #108 = NameAndType        #109:#110     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #109 = Utf8               replace
  #110 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #111 = String             #112          //
  #112 = Utf8
  #113 = Methodref          #67.#114      // java/lang/Class.forName:(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
  #114 = NameAndType        #115:#116     // forName:(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
  #115 = Utf8               forName
  #116 = Utf8               (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
  #117 = Class              #118          // ext/mods/extensions/interfaces/L2JExtension
  #118 = Utf8               ext/mods/extensions/interfaces/L2JExtension
  #119 = Methodref          #67.#120      // java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
  #120 = NameAndType        #121:#122     // isAssignableFrom:(Ljava/lang/Class;)Z
  #121 = Utf8               isAssignableFrom
  #122 = Utf8               (Ljava/lang/Class;)Z
  #123 = Methodref          #67.#124      // java/lang/Class.getDeclaredConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #124 = NameAndType        #125:#126     // getDeclaredConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #125 = Utf8               getDeclaredConstructor
  #126 = Utf8               ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #127 = Methodref          #128.#129     // java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #128 = Class              #130          // java/lang/reflect/Constructor
  #129 = NameAndType        #131:#132     // newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #130 = Utf8               java/lang/reflect/Constructor
  #131 = Utf8               newInstance
  #132 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
  #133 = Fieldref           #9.#134       // ext/mods/extensions/ExtensionLoader.loadedExtensions:Ljava/util/Map;
  #134 = NameAndType        #135:#136     // loadedExtensions:Ljava/util/Map;
  #135 = Utf8               loadedExtensions
  #136 = Utf8               Ljava/util/Map;
  #137 = InterfaceMethodref #117.#92      // ext/mods/extensions/interfaces/L2JExtension.getName:()Ljava/lang/String;
  #138 = InterfaceMethodref #139.#140     // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #139 = Class              #141          // java/util/Map
  #140 = NameAndType        #142:#143     // containsKey:(Ljava/lang/Object;)Z
  #141 = Utf8               java/util/Map
  #142 = Utf8               containsKey
  #143 = Utf8               (Ljava/lang/Object;)Z
  #144 = InterfaceMethodref #117.#145     // ext/mods/extensions/interfaces/L2JExtension.onLoad:()V
  #145 = NameAndType        #146:#6       // onLoad:()V
  #146 = Utf8               onLoad
  #147 = InterfaceMethodref #139.#148     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #148 = NameAndType        #149:#150     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #149 = Utf8               put
  #150 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #151 = Class              #152          // java/lang/ClassNotFoundException
  #152 = Utf8               java/lang/ClassNotFoundException
  #153 = InvokeDynamic      #1:#154       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #154 = NameAndType        #155:#156     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #155 = Utf8               makeConcatWithConstants
  #156 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #157 = Class              #158          // java/lang/Throwable
  #158 = Utf8               java/lang/Throwable
  #159 = InvokeDynamic      #2:#154       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #160 = Methodref          #157.#161     // java/lang/Throwable.printStackTrace:()V
  #161 = NameAndType        #162:#6       // printStackTrace:()V
  #162 = Utf8               printStackTrace
  #163 = Methodref          #52.#164      // java/net/URLClassLoader.close:()V
  #164 = NameAndType        #165:#6       // close:()V
  #165 = Utf8               close
  #166 = Methodref          #157.#167     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #167 = NameAndType        #168:#169     // addSuppressed:(Ljava/lang/Throwable;)V
  #168 = Utf8               addSuppressed
  #169 = Utf8               (Ljava/lang/Throwable;)V
  #170 = Methodref          #48.#164      // java/util/jar/JarFile.close:()V
  #171 = Class              #172          // java/io/IOException
  #172 = Utf8               java/io/IOException
  #173 = Methodref          #7.#92        // java/io/File.getName:()Ljava/lang/String;
  #174 = InvokeDynamic      #3:#154       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #175 = Methodref          #171.#161     // java/io/IOException.printStackTrace:()V
  #176 = InterfaceMethodref #139.#177     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #177 = NameAndType        #178:#179     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #178 = Utf8               get
  #179 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #180 = InterfaceMethodref #117.#181     // ext/mods/extensions/interfaces/L2JExtension.onDisable:()V
  #181 = NameAndType        #182:#6       // onDisable:()V
  #182 = Utf8               onDisable
  #183 = InterfaceMethodref #139.#184     // java/util/Map.keySet:()Ljava/util/Set;
  #184 = NameAndType        #185:#186     // keySet:()Ljava/util/Set;
  #185 = Utf8               keySet
  #186 = Utf8               ()Ljava/util/Set;
  #187 = String             #188          // .ext.jar
  #188 = Utf8               .ext.jar
  #189 = Class              #190          // java/util/HashMap
  #190 = Utf8               java/util/HashMap
  #191 = Methodref          #189.#3       // java/util/HashMap."<init>":()V
  #192 = Utf8               LIBS_PATH
  #193 = Utf8               Ljava/lang/String;
  #194 = Utf8               ConstantValue
  #195 = Utf8               Signature
  #196 = Utf8               Ljava/util/Map<Ljava/lang/String;Lext/mods/extensions/interfaces/L2JExtension;>;
  #197 = Utf8               Code
  #198 = Utf8               LineNumberTable
  #199 = Utf8               LocalVariableTable
  #200 = Utf8               this
  #201 = Utf8               Lext/mods/extensions/ExtensionLoader;
  #202 = Utf8               loadExtensions
  #203 = Utf8               jar
  #204 = Utf8               Ljava/io/File;
  #205 = Utf8               folder
  #206 = Utf8               jars
  #207 = Utf8               [Ljava/io/File;
  #208 = Utf8               StackMapTable
  #209 = Class              #207          // "[Ljava/io/File;"
  #210 = Utf8               clazz
  #211 = Utf8               Ljava/lang/Class;
  #212 = Utf8               extension
  #213 = Utf8               Lext/mods/extensions/interfaces/L2JExtension;
  #214 = Utf8               e
  #215 = Utf8               Ljava/lang/ClassNotFoundException;
  #216 = Utf8               t
  #217 = Utf8               Ljava/lang/Throwable;
  #218 = Utf8               entry
  #219 = Utf8               Ljava/util/jar/JarEntry;
  #220 = Utf8               className
  #221 = Utf8               Ljava/util/Enumeration;
  #222 = Utf8               childLoader
  #223 = Utf8               Ljava/net/URLClassLoader;
  #224 = Utf8               jarFile
  #225 = Utf8               Ljava/util/jar/JarFile;
  #226 = Utf8               Ljava/io/IOException;
  #227 = Utf8               LocalVariableTypeTable
  #228 = Utf8               Ljava/lang/Class<*>;
  #229 = Utf8               Ljava/util/Enumeration<Ljava/util/jar/JarEntry;>;
  #230 = Utf8               disableExtension
  #231 = Utf8               name
  #232 = Utf8               ext
  #233 = Utf8               listExtensions
  #234 = Utf8               ()Ljava/util/Set<Ljava/lang/String;>;
  #235 = Utf8               lambda$loadExtensions$0
  #236 = Utf8               (Ljava/io/File;Ljava/lang/String;)Z
  #237 = Utf8               dir
  #238 = Utf8               <clinit>
  #239 = Utf8               SourceFile
  #240 = Utf8               ExtensionLoader.java
  #241 = Utf8               BootstrapMethods
  #242 = MethodType         #236          //  (Ljava/io/File;Ljava/lang/String;)Z
  #243 = MethodHandle       6:#244        // REF_invokeStatic ext/mods/extensions/ExtensionLoader.lambda$loadExtensions$0:(Ljava/io/File;Ljava/lang/String;)Z
  #244 = Methodref          #9.#245       // ext/mods/extensions/ExtensionLoader.lambda$loadExtensions$0:(Ljava/io/File;Ljava/lang/String;)Z
  #245 = NameAndType        #235:#236     // lambda$loadExtensions$0:(Ljava/io/File;Ljava/lang/String;)Z
  #246 = String             #247          // [ExtensionLoader] Classe não encontrada: \u0001
  #247 = Utf8               [ExtensionLoader] Classe não encontrada: \u0001
  #248 = String             #249          // [ExtensionLoader] Erro ao carregar classe: \u0001
  #249 = Utf8               [ExtensionLoader] Erro ao carregar classe: \u0001
  #250 = String             #251          // [ExtensionLoader] Erro ao abrir o JAR: \u0001
  #251 = Utf8               [ExtensionLoader] Erro ao abrir o JAR: \u0001
  #252 = MethodHandle       6:#253        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #253 = Methodref          #254.#255     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #254 = Class              #256          // java/lang/invoke/LambdaMetafactory
  #255 = NameAndType        #257:#258     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #256 = Utf8               java/lang/invoke/LambdaMetafactory
  #257 = Utf8               metafactory
  #258 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #259 = MethodHandle       6:#260        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #260 = Methodref          #261.#262     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #261 = Class              #263          // java/lang/invoke/StringConcatFactory
  #262 = NameAndType        #155:#264     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #263 = Utf8               java/lang/invoke/StringConcatFactory
  #264 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #265 = Utf8               InnerClasses
  #266 = Class              #267          // java/lang/invoke/MethodHandles$Lookup
  #267 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #268 = Class              #269          // java/lang/invoke/MethodHandles
  #269 = Utf8               java/lang/invoke/MethodHandles
  #270 = Utf8               Lookup
{
  public ext.mods.extensions.ExtensionLoader();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/extensions/ExtensionLoader;

  public static void loadExtensions();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=6, args_size=0
         0: new           #7                  // class java/io/File
         3: dup
         4: ldc           #11                 // String ../libs/
         6: invokespecial #13                 // Method java/io/File."<init>":(Ljava/lang/String;)V
         9: astore_0
        10: aload_0
        11: invokevirtual #16                 // Method java/io/File.exists:()Z
        14: ifeq          24
        17: aload_0
        18: invokevirtual #20                 // Method java/io/File.isDirectory:()Z
        21: ifne          33
        24: getstatic     #23                 // Field java/lang/System.out:Ljava/io/PrintStream;
        27: ldc           #29                 // String [ExtensionLoader] Pasta libs não encontrada.
        29: invokevirtual #31                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        32: return
        33: aload_0
        34: invokedynamic #36,  0             // InvokeDynamic #0:accept:()Ljava/io/FilenameFilter;
        39: invokevirtual #40                 // Method java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        42: astore_1
        43: aload_1
        44: ifnull        52
        47: aload_1
        48: arraylength
        49: ifne          53
        52: return
        53: aload_1
        54: astore_2
        55: aload_2
        56: arraylength
        57: istore_3
        58: iconst_0
        59: istore        4
        61: iload         4
        63: iload_3
        64: if_icmpge     84
        67: aload_2
        68: iload         4
        70: aaload
        71: astore        5
        73: aload         5
        75: invokestatic  #44                 // Method loadJar:(Ljava/io/File;)V
        78: iinc          4, 1
        81: goto          61
        84: return
      LineNumberTable:
        line 40: 0
        line 41: 10
        line 43: 24
        line 44: 32
        line 47: 33
        line 48: 43
        line 50: 52
        line 53: 53
        line 55: 73
        line 53: 78
        line 57: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           73       5     5   jar   Ljava/io/File;
           10      75     0 folder   Ljava/io/File;
           43      42     1  jars   [Ljava/io/File;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/io/File ]
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class "[Ljava/io/File;" ]
        frame_type = 0 /* same */
        frame_type = 254 /* append */
          offset_delta = 7
          locals = [ class "[Ljava/io/File;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 22

  public static void disableExtension(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: getstatic     #133                // Field loadedExtensions:Ljava/util/Map;
         3: aload_0
         4: invokeinterface #176,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         9: checkcast     #117                // class ext/mods/extensions/interfaces/L2JExtension
        12: astore_1
        13: aload_1
        14: ifnull        23
        17: aload_1
        18: invokeinterface #180,  1          // InterfaceMethod ext/mods/extensions/interfaces/L2JExtension.onDisable:()V
        23: return
      LineNumberTable:
        line 119: 0
        line 120: 13
        line 122: 17
        line 124: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  name   Ljava/lang/String;
           13      11     1   ext   Lext/mods/extensions/interfaces/L2JExtension;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/extensions/interfaces/L2JExtension ]

  public static java.util.Set<java.lang.String> listExtensions();
    descriptor: ()Ljava/util/Set;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #133                // Field loadedExtensions:Ljava/util/Map;
         3: invokeinterface #183,  1          // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
         8: areturn
      LineNumberTable:
        line 128: 0
    Signature: #234                         // ()Ljava/util/Set<Ljava/lang/String;>;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #189                // class java/util/HashMap
         3: dup
         4: invokespecial #191                // Method java/util/HashMap."<init>":()V
         7: putstatic     #133                // Field loadedExtensions:Ljava/util/Map;
        10: return
      LineNumberTable:
        line 36: 0
}
SourceFile: "ExtensionLoader.java"
BootstrapMethods:
  0: #252 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #242 (Ljava/io/File;Ljava/lang/String;)Z
      #243 REF_invokeStatic ext/mods/extensions/ExtensionLoader.lambda$loadExtensions$0:(Ljava/io/File;Ljava/lang/String;)Z
      #242 (Ljava/io/File;Ljava/lang/String;)Z
  1: #259 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #246 [ExtensionLoader] Classe não encontrada: \u0001
  2: #259 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #248 [ExtensionLoader] Erro ao carregar classe: \u0001
  3: #259 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #250 [ExtensionLoader] Erro ao abrir o JAR: \u0001
InnerClasses:
  public static final #270= #266 of #268; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
