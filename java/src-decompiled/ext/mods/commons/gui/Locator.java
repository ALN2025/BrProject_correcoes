// Bytecode for: ext.mods.commons.gui.Locator
// File: ext\mods\commons\gui\Locator.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/Locator.class
  Last modified 9 de jul de 2026; size 6778 bytes
  MD5 checksum 3640dbfa78f32eddabaadaa35f422967
  Compiled from "Locator.java"
public class ext.mods.commons.gui.Locator
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #28                         // ext/mods/commons/gui/Locator
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 9, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // java/lang/Class.getName:()Ljava/lang/String;
    #8 = Class              #10           // java/lang/Class
    #9 = NameAndType        #11:#12       // getName:()Ljava/lang/String;
   #10 = Utf8               java/lang/Class
   #11 = Utf8               getName
   #12 = Utf8               ()Ljava/lang/String;
   #13 = Methodref          #14.#15       // java/lang/String.replace:(CC)Ljava/lang/String;
   #14 = Class              #16           // java/lang/String
   #15 = NameAndType        #17:#18       // replace:(CC)Ljava/lang/String;
   #16 = Utf8               java/lang/String
   #17 = Utf8               replace
   #18 = Utf8               (CC)Ljava/lang/String;
   #19 = InvokeDynamic      #0:#20        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #20 = NameAndType        #21:#22       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #21 = Utf8               makeConcatWithConstants
   #22 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #23 = Methodref          #8.#24        // java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
   #24 = NameAndType        #25:#26       // getClassLoader:()Ljava/lang/ClassLoader;
   #25 = Utf8               getClassLoader
   #26 = Utf8               ()Ljava/lang/ClassLoader;
   #27 = Methodref          #28.#29       // ext/mods/commons/gui/Locator.getResourceSource:(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/io/File;
   #28 = Class              #30           // ext/mods/commons/gui/Locator
   #29 = NameAndType        #31:#32       // getResourceSource:(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/io/File;
   #30 = Utf8               ext/mods/commons/gui/Locator
   #31 = Utf8               getResourceSource
   #32 = Utf8               (Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/io/File;
   #33 = Methodref          #34.#35       // java/lang/ClassLoader.getSystemResource:(Ljava/lang/String;)Ljava/net/URL;
   #34 = Class              #36           // java/lang/ClassLoader
   #35 = NameAndType        #37:#38       // getSystemResource:(Ljava/lang/String;)Ljava/net/URL;
   #36 = Utf8               java/lang/ClassLoader
   #37 = Utf8               getSystemResource
   #38 = Utf8               (Ljava/lang/String;)Ljava/net/URL;
   #39 = Methodref          #34.#40       // java/lang/ClassLoader.getResource:(Ljava/lang/String;)Ljava/net/URL;
   #40 = NameAndType        #41:#38       // getResource:(Ljava/lang/String;)Ljava/net/URL;
   #41 = Utf8               getResource
   #42 = Methodref          #43.#44       // java/net/URL.toString:()Ljava/lang/String;
   #43 = Class              #45           // java/net/URL
   #44 = NameAndType        #46:#12       // toString:()Ljava/lang/String;
   #45 = Utf8               java/net/URL
   #46 = Utf8               toString
   #47 = String             #48           // jar:file:
   #48 = Utf8               jar:file:
   #49 = Methodref          #14.#50       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #50 = NameAndType        #51:#52       // startsWith:(Ljava/lang/String;)Z
   #51 = Utf8               startsWith
   #52 = Utf8               (Ljava/lang/String;)Z
   #53 = Methodref          #14.#54       // java/lang/String.indexOf:(I)I
   #54 = NameAndType        #55:#56       // indexOf:(I)I
   #55 = Utf8               indexOf
   #56 = Utf8               (I)I
   #57 = Methodref          #14.#58       // java/lang/String.substring:(II)Ljava/lang/String;
   #58 = NameAndType        #59:#60       // substring:(II)Ljava/lang/String;
   #59 = Utf8               substring
   #60 = Utf8               (II)Ljava/lang/String;
   #61 = Class              #62           // java/io/File
   #62 = Utf8               java/io/File
   #63 = Methodref          #28.#64       // ext/mods/commons/gui/Locator.fromURI:(Ljava/lang/String;)Ljava/lang/String;
   #64 = NameAndType        #65:#22       // fromURI:(Ljava/lang/String;)Ljava/lang/String;
   #65 = Utf8               fromURI
   #66 = Methodref          #61.#67       // java/io/File."<init>":(Ljava/lang/String;)V
   #67 = NameAndType        #5:#68        // "<init>":(Ljava/lang/String;)V
   #68 = Utf8               (Ljava/lang/String;)V
   #69 = String             #70           // file:
   #70 = Utf8               file:
   #71 = Methodref          #14.#72       // java/lang/String.indexOf:(Ljava/lang/String;)I
   #72 = NameAndType        #55:#73       // indexOf:(Ljava/lang/String;)I
   #73 = Utf8               (Ljava/lang/String;)I
   #74 = Methodref          #75.#76       // java/net/URI.create:(Ljava/lang/String;)Ljava/net/URI;
   #75 = Class              #77           // java/net/URI
   #76 = NameAndType        #78:#79       // create:(Ljava/lang/String;)Ljava/net/URI;
   #77 = Utf8               java/net/URI
   #78 = Utf8               create
   #79 = Utf8               (Ljava/lang/String;)Ljava/net/URI;
   #80 = Methodref          #75.#81       // java/net/URI.toURL:()Ljava/net/URL;
   #81 = NameAndType        #82:#83       // toURL:()Ljava/net/URL;
   #82 = Utf8               toURL
   #83 = Utf8               ()Ljava/net/URL;
   #84 = Class              #85           // java/net/MalformedURLException
   #85 = Utf8               java/net/MalformedURLException
   #86 = String             #87           // file
   #87 = Utf8               file
   #88 = Methodref          #43.#89       // java/net/URL.getProtocol:()Ljava/lang/String;
   #89 = NameAndType        #90:#12       // getProtocol:()Ljava/lang/String;
   #90 = Utf8               getProtocol
   #91 = Methodref          #14.#92       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #92 = NameAndType        #93:#94       // equals:(Ljava/lang/Object;)Z
   #93 = Utf8               equals
   #94 = Utf8               (Ljava/lang/Object;)Z
   #95 = Class              #96           // java/lang/IllegalArgumentException
   #96 = Utf8               java/lang/IllegalArgumentException
   #97 = String             #98           // Can only handle valid file: URIs
   #98 = Utf8               Can only handle valid file: URIs
   #99 = Methodref          #95.#67       // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
  #100 = Class              #101          // java/lang/StringBuilder
  #101 = Utf8               java/lang/StringBuilder
  #102 = Methodref          #43.#103      // java/net/URL.getHost:()Ljava/lang/String;
  #103 = NameAndType        #104:#12      // getHost:()Ljava/lang/String;
  #104 = Utf8               getHost
  #105 = Methodref          #100.#67      // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
  #106 = Methodref          #100.#107     // java/lang/StringBuilder.length:()I
  #107 = NameAndType        #108:#109     // length:()I
  #108 = Utf8               length
  #109 = Utf8               ()I
  #110 = Fieldref           #61.#111      // java/io/File.separatorChar:C
  #111 = NameAndType        #112:#113     // separatorChar:C
  #112 = Utf8               separatorChar
  #113 = Utf8               C
  #114 = Methodref          #100.#115     // java/lang/StringBuilder.insert:(IC)Ljava/lang/StringBuilder;
  #115 = NameAndType        #116:#117     // insert:(IC)Ljava/lang/StringBuilder;
  #116 = Utf8               insert
  #117 = Utf8               (IC)Ljava/lang/StringBuilder;
  #118 = Methodref          #43.#119      // java/net/URL.getFile:()Ljava/lang/String;
  #119 = NameAndType        #120:#12      // getFile:()Ljava/lang/String;
  #120 = Utf8               getFile
  #121 = Methodref          #100.#122     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #122 = NameAndType        #123:#124     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #123 = Utf8               append
  #124 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #125 = Methodref          #100.#44      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #126 = Fieldref           #61.#127      // java/io/File.pathSeparatorChar:C
  #127 = NameAndType        #128:#113     // pathSeparatorChar:C
  #128 = Utf8               pathSeparatorChar
  #129 = String             #130          // \\
  #130 = Utf8               \\
  #131 = Methodref          #14.#107      // java/lang/String.length:()I
  #132 = Methodref          #14.#133      // java/lang/String.charAt:(I)C
  #133 = NameAndType        #134:#135     // charAt:(I)C
  #134 = Utf8               charAt
  #135 = Utf8               (I)C
  #136 = Methodref          #137.#138     // java/lang/Character.isLetter:(C)Z
  #137 = Class              #139          // java/lang/Character
  #138 = NameAndType        #140:#141     // isLetter:(C)Z
  #139 = Utf8               java/lang/Character
  #140 = Utf8               isLetter
  #141 = Utf8               (C)Z
  #142 = Methodref          #14.#143      // java/lang/String.lastIndexOf:(I)I
  #143 = NameAndType        #144:#56      // lastIndexOf:(I)I
  #144 = Utf8               lastIndexOf
  #145 = Methodref          #14.#146      // java/lang/String.substring:(I)Ljava/lang/String;
  #146 = NameAndType        #59:#147      // substring:(I)Ljava/lang/String;
  #147 = Utf8               (I)Ljava/lang/String;
  #148 = Methodref          #28.#149      // ext/mods/commons/gui/Locator.decodeUri:(Ljava/lang/String;)Ljava/lang/String;
  #149 = NameAndType        #150:#22      // decodeUri:(Ljava/lang/String;)Ljava/lang/String;
  #150 = Utf8               decodeUri
  #151 = Methodref          #100.#3       // java/lang/StringBuilder."<init>":()V
  #152 = Class              #153          // java/text/StringCharacterIterator
  #153 = Utf8               java/text/StringCharacterIterator
  #154 = Methodref          #152.#67      // java/text/StringCharacterIterator."<init>":(Ljava/lang/String;)V
  #155 = InterfaceMethodref #156.#157     // java/text/CharacterIterator.first:()C
  #156 = Class              #158          // java/text/CharacterIterator
  #157 = NameAndType        #159:#160     // first:()C
  #158 = Utf8               java/text/CharacterIterator
  #159 = Utf8               first
  #160 = Utf8               ()C
  #161 = Integer            65535
  #162 = InterfaceMethodref #156.#163     // java/text/CharacterIterator.next:()C
  #163 = NameAndType        #164:#160     // next:()C
  #164 = Utf8               next
  #165 = Methodref          #137.#166     // java/lang/Character.digit:(CI)I
  #166 = NameAndType        #167:#168     // digit:(CI)I
  #167 = Utf8               digit
  #168 = Utf8               (CI)I
  #169 = Methodref          #100.#170     // java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
  #170 = NameAndType        #123:#171     // append:(C)Ljava/lang/StringBuilder;
  #171 = Utf8               (C)Ljava/lang/StringBuilder;
  #172 = String             #173          // com.sun.tools.javac.Main
  #173 = Utf8               com.sun.tools.javac.Main
  #174 = Methodref          #8.#175       // java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
  #175 = NameAndType        #176:#177     // forName:(Ljava/lang/String;)Ljava/lang/Class;
  #176 = Utf8               forName
  #177 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;
  #178 = Class              #179          // java/lang/Exception
  #179 = Utf8               java/lang/Exception
  #180 = String             #181          // sun.tools.javac.Main
  #181 = Utf8               sun.tools.javac.Main
  #182 = String             #183          // java.home
  #183 = Utf8               java.home
  #184 = Methodref          #185.#186     // java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
  #185 = Class              #187          // java/lang/System
  #186 = NameAndType        #188:#22      // getProperty:(Ljava/lang/String;)Ljava/lang/String;
  #187 = Utf8               java/lang/System
  #188 = Utf8               getProperty
  #189 = Fieldref           #190.#191     // java/util/Locale.US:Ljava/util/Locale;
  #190 = Class              #192          // java/util/Locale
  #191 = NameAndType        #193:#194     // US:Ljava/util/Locale;
  #192 = Utf8               java/util/Locale
  #193 = Utf8               US
  #194 = Utf8               Ljava/util/Locale;
  #195 = Methodref          #14.#196      // java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
  #196 = NameAndType        #197:#198     // toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
  #197 = Utf8               toLowerCase
  #198 = Utf8               (Ljava/util/Locale;)Ljava/lang/String;
  #199 = String             #200          // jre
  #200 = Utf8               jre
  #201 = Methodref          #14.#202      // java/lang/String.endsWith:(Ljava/lang/String;)Z
  #202 = NameAndType        #203:#52      // endsWith:(Ljava/lang/String;)Z
  #203 = Utf8               endsWith
  #204 = InvokeDynamic      #1:#20        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #205 = Methodref          #61.#206      // java/io/File.exists:()Z
  #206 = NameAndType        #207:#208     // exists:()Z
  #207 = Utf8               exists
  #208 = Utf8               ()Z
  #209 = Fieldref           #185.#210     // java/lang/System.out:Ljava/io/PrintStream;
  #210 = NameAndType        #211:#212     // out:Ljava/io/PrintStream;
  #211 = Utf8               out
  #212 = Utf8               Ljava/io/PrintStream;
  #213 = Methodref          #61.#214      // java/io/File.getPath:()Ljava/lang/String;
  #214 = NameAndType        #215:#12      // getPath:()Ljava/lang/String;
  #215 = Utf8               getPath
  #216 = InvokeDynamic      #2:#20        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #217 = Methodref          #218.#219     // java/io/PrintStream.println:(Ljava/lang/String;)V
  #218 = Class              #220          // java/io/PrintStream
  #219 = NameAndType        #221:#68      // println:(Ljava/lang/String;)V
  #220 = Utf8               java/io/PrintStream
  #221 = Utf8               println
  #222 = String             #223          // .jar
  #223 = Utf8               .jar
  #224 = Methodref          #28.#225      // ext/mods/commons/gui/Locator.getLocationURLs:(Ljava/io/File;[Ljava/lang/String;)[Ljava/net/URL;
  #225 = NameAndType        #226:#227     // getLocationURLs:(Ljava/io/File;[Ljava/lang/String;)[Ljava/net/URL;
  #226 = Utf8               getLocationURLs
  #227 = Utf8               (Ljava/io/File;[Ljava/lang/String;)[Ljava/net/URL;
  #228 = Methodref          #61.#229      // java/io/File.isDirectory:()Z
  #229 = NameAndType        #230:#208     // isDirectory:()Z
  #230 = Utf8               isDirectory
  #231 = Methodref          #14.#232      // java/lang/String.toLowerCase:()Ljava/lang/String;
  #232 = NameAndType        #197:#12      // toLowerCase:()Ljava/lang/String;
  #233 = Methodref          #61.#234      // java/io/File.toURI:()Ljava/net/URI;
  #234 = NameAndType        #235:#236     // toURI:()Ljava/net/URI;
  #235 = Utf8               toURI
  #236 = Utf8               ()Ljava/net/URI;
  #237 = InvokeDynamic      #3:#238       // #3:accept:([Ljava/lang/String;)Ljava/io/FilenameFilter;
  #238 = NameAndType        #239:#240     // accept:([Ljava/lang/String;)Ljava/io/FilenameFilter;
  #239 = Utf8               accept
  #240 = Utf8               ([Ljava/lang/String;)Ljava/io/FilenameFilter;
  #241 = Methodref          #61.#242      // java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
  #242 = NameAndType        #243:#244     // listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
  #243 = Utf8               listFiles
  #244 = Utf8               (Ljava/io/FilenameFilter;)[Ljava/io/File;
  #245 = Utf8               Code
  #246 = Utf8               LineNumberTable
  #247 = Utf8               LocalVariableTable
  #248 = Utf8               this
  #249 = Utf8               Lext/mods/commons/gui/Locator;
  #250 = Utf8               getClassSource
  #251 = Utf8               (Ljava/lang/Class;)Ljava/io/File;
  #252 = Utf8               c
  #253 = Utf8               Ljava/lang/Class;
  #254 = Utf8               classResource
  #255 = Utf8               Ljava/lang/String;
  #256 = Utf8               LocalVariableTypeTable
  #257 = Utf8               Ljava/lang/Class<*>;
  #258 = Utf8               Signature
  #259 = Utf8               (Ljava/lang/Class<*>;)Ljava/io/File;
  #260 = Utf8               pling
  #261 = Utf8               I
  #262 = Utf8               jarName
  #263 = Utf8               tail
  #264 = Utf8               dirName
  #265 = Utf8               u
  #266 = Utf8               classLoader
  #267 = Utf8               Ljava/lang/ClassLoader;
  #268 = Utf8               resource
  #269 = Utf8               url
  #270 = Utf8               Ljava/net/URL;
  #271 = Utf8               StackMapTable
  #272 = Utf8               uriValue
  #273 = Utf8               uri
  #274 = Utf8               buf
  #275 = Utf8               Ljava/lang/StringBuilder;
  #276 = Utf8               queryPos
  #277 = Utf8               i2
  #278 = Utf8               i1
  #279 = Utf8               c2
  #280 = Utf8               c1
  #281 = Utf8               sb
  #282 = Utf8               iter
  #283 = Utf8               Ljava/text/CharacterIterator;
  #284 = Utf8               getToolsJar
  #285 = Utf8               ()Ljava/io/File;
  #286 = Utf8               e
  #287 = Utf8               Ljava/lang/Exception;
  #288 = Utf8               toolsJarAvailable
  #289 = Utf8               Z
  #290 = Utf8               javaHome
  #291 = Utf8               toolsJar
  #292 = Utf8               Ljava/io/File;
  #293 = Utf8               (Ljava/io/File;)[Ljava/net/URL;
  #294 = Utf8               location
  #295 = Utf8               Exceptions
  #296 = Utf8               extension
  #297 = Utf8               path
  #298 = Utf8               i
  #299 = Utf8               extensions
  #300 = Utf8               [Ljava/lang/String;
  #301 = Utf8               urls
  #302 = Utf8               [Ljava/net/URL;
  #303 = Utf8               matches
  #304 = Utf8               [Ljava/io/File;
  #305 = Class              #302          // "[Ljava/net/URL;"
  #306 = Class              #300          // "[Ljava/lang/String;"
  #307 = Class              #304          // "[Ljava/io/File;"
  #308 = Utf8               lambda$getLocationURLs$0
  #309 = Utf8               ([Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z
  #310 = Utf8               arr$
  #311 = Utf8               len$
  #312 = Utf8               i$
  #313 = Utf8               dir
  #314 = Utf8               name
  #315 = Utf8               SourceFile
  #316 = Utf8               Locator.java
  #317 = Utf8               BootstrapMethods
  #318 = String             #319          // \u0001.class
  #319 = Utf8               \u0001.class
  #320 = String             #321          // \u0001/lib/tools.jar
  #321 = Utf8               \u0001/lib/tools.jar
  #322 = String             #323          // Unable to locate tools.jar. Expected to find it in \u0001
  #323 = Utf8               Unable to locate tools.jar. Expected to find it in \u0001
  #324 = MethodType         #325          //  (Ljava/io/File;Ljava/lang/String;)Z
  #325 = Utf8               (Ljava/io/File;Ljava/lang/String;)Z
  #326 = MethodHandle       6:#327        // REF_invokeStatic ext/mods/commons/gui/Locator.lambda$getLocationURLs$0:([Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z
  #327 = Methodref          #28.#328      // ext/mods/commons/gui/Locator.lambda$getLocationURLs$0:([Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z
  #328 = NameAndType        #308:#309     // lambda$getLocationURLs$0:([Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z
  #329 = MethodHandle       6:#330        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #330 = Methodref          #331.#332     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #331 = Class              #333          // java/lang/invoke/StringConcatFactory
  #332 = NameAndType        #21:#334      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #333 = Utf8               java/lang/invoke/StringConcatFactory
  #334 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #335 = MethodHandle       6:#336        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #336 = Methodref          #337.#338     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #337 = Class              #339          // java/lang/invoke/LambdaMetafactory
  #338 = NameAndType        #340:#341     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #339 = Utf8               java/lang/invoke/LambdaMetafactory
  #340 = Utf8               metafactory
  #341 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #342 = Utf8               InnerClasses
  #343 = Class              #344          // java/lang/invoke/MethodHandles$Lookup
  #344 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #345 = Class              #346          // java/lang/invoke/MethodHandles
  #346 = Utf8               java/lang/invoke/MethodHandles
  #347 = Utf8               Lookup
{
  public static java.io.File getClassSource(java.lang.Class<?>);
    descriptor: (Ljava/lang/Class;)Ljava/io/File;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method java/lang/Class.getName:()Ljava/lang/String;
         4: bipush        46
         6: bipush        47
         8: invokevirtual #13                 // Method java/lang/String.replace:(CC)Ljava/lang/String;
        11: invokedynamic #19,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        16: astore_1
        17: aload_0
        18: invokevirtual #23                 // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        21: aload_1
        22: invokestatic  #27                 // Method getResourceSource:(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/io/File;
        25: areturn
      LineNumberTable:
        line 39: 0
        line 40: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0     c   Ljava/lang/Class;
           17       9     1 classResource   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     0     c   Ljava/lang/Class<*>;
    Signature: #259                         // (Ljava/lang/Class<*>;)Ljava/io/File;

  public static java.io.File getResourceSource(java.lang.ClassLoader, java.lang.String);
    descriptor: (Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/io/File;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=7, args_size=2
         0: aload_0
         1: astore_2
         2: aload_2
         3: ifnonnull     12
         6: ldc           #28                 // class ext/mods/commons/gui/Locator
         8: invokevirtual #23                 // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        11: astore_2
        12: aconst_null
        13: astore_3
        14: aload_2
        15: ifnonnull     26
        18: aload_1
        19: invokestatic  #33                 // Method java/lang/ClassLoader.getSystemResource:(Ljava/lang/String;)Ljava/net/URL;
        22: astore_3
        23: goto          32
        26: aload_2
        27: aload_1
        28: invokevirtual #39                 // Method java/lang/ClassLoader.getResource:(Ljava/lang/String;)Ljava/net/URL;
        31: astore_3
        32: aload_3
        33: ifnull        125
        36: aload_3
        37: invokevirtual #42                 // Method java/net/URL.toString:()Ljava/lang/String;
        40: astore        4
        42: aload         4
        44: ldc           #47                 // String jar:file:
        46: invokevirtual #49                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        49: ifeq          84
        52: aload         4
        54: bipush        33
        56: invokevirtual #53                 // Method java/lang/String.indexOf:(I)I
        59: istore        5
        61: aload         4
        63: iconst_4
        64: iload         5
        66: invokevirtual #57                 // Method java/lang/String.substring:(II)Ljava/lang/String;
        69: astore        6
        71: new           #61                 // class java/io/File
        74: dup
        75: aload         6
        77: invokestatic  #63                 // Method fromURI:(Ljava/lang/String;)Ljava/lang/String;
        80: invokespecial #66                 // Method java/io/File."<init>":(Ljava/lang/String;)V
        83: areturn
        84: aload         4
        86: ldc           #69                 // String file:
        88: invokevirtual #49                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        91: ifeq          125
        94: aload         4
        96: aload_1
        97: invokevirtual #71                 // Method java/lang/String.indexOf:(Ljava/lang/String;)I
       100: istore        5
       102: aload         4
       104: iconst_0
       105: iload         5
       107: invokevirtual #57                 // Method java/lang/String.substring:(II)Ljava/lang/String;
       110: astore        6
       112: new           #61                 // class java/io/File
       115: dup
       116: aload         6
       118: invokestatic  #63                 // Method fromURI:(Ljava/lang/String;)Ljava/lang/String;
       121: invokespecial #66                 // Method java/io/File."<init>":(Ljava/lang/String;)V
       124: areturn
       125: aconst_null
       126: areturn
      LineNumberTable:
        line 46: 0
        line 47: 2
        line 49: 6
        line 51: 12
        line 52: 14
        line 54: 18
        line 58: 26
        line 60: 32
        line 62: 36
        line 63: 42
        line 65: 52
        line 66: 61
        line 67: 71
        line 69: 84
        line 71: 94
        line 72: 102
        line 73: 112
        line 76: 125
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           61      23     5 pling   I
           71      13     6 jarName   Ljava/lang/String;
          102      23     5  tail   I
          112      13     6 dirName   Ljava/lang/String;
           42      83     4     u   Ljava/lang/String;
            0     127     0 classLoader   Ljava/lang/ClassLoader;
            0     127     1 resource   Ljava/lang/String;
            2     125     2     c   Ljava/lang/ClassLoader;
           14     113     3   url   Ljava/net/URL;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/lang/ClassLoader ]
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class java/net/URL ]
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 40

  public static java.lang.String fromURI(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=6, args_size=1
         0: aload_0
         1: astore_1
         2: aconst_null
         3: astore_2
         4: aload_1
         5: invokestatic  #74                 // Method java/net/URI.create:(Ljava/lang/String;)Ljava/net/URI;
         8: invokevirtual #80                 // Method java/net/URI.toURL:()Ljava/net/URL;
        11: astore_2
        12: goto          16
        15: astore_3
        16: aload_2
        17: ifnull        32
        20: ldc           #86                 // String file
        22: aload_2
        23: invokevirtual #88                 // Method java/net/URL.getProtocol:()Ljava/lang/String;
        26: invokevirtual #91                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        29: ifne          42
        32: new           #95                 // class java/lang/IllegalArgumentException
        35: dup
        36: ldc           #97                 // String Can only handle valid file: URIs
        38: invokespecial #99                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        41: athrow
        42: new           #100                // class java/lang/StringBuilder
        45: dup
        46: aload_2
        47: invokevirtual #102                // Method java/net/URL.getHost:()Ljava/lang/String;
        50: invokespecial #105                // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
        53: astore_3
        54: aload_3
        55: invokevirtual #106                // Method java/lang/StringBuilder.length:()I
        58: ifle          77
        61: aload_3
        62: iconst_0
        63: getstatic     #110                // Field java/io/File.separatorChar:C
        66: invokevirtual #114                // Method java/lang/StringBuilder.insert:(IC)Ljava/lang/StringBuilder;
        69: iconst_0
        70: getstatic     #110                // Field java/io/File.separatorChar:C
        73: invokevirtual #114                // Method java/lang/StringBuilder.insert:(IC)Ljava/lang/StringBuilder;
        76: pop
        77: aload_2
        78: invokevirtual #118                // Method java/net/URL.getFile:()Ljava/lang/String;
        81: astore        4
        83: aload         4
        85: bipush        63
        87: invokevirtual #53                 // Method java/lang/String.indexOf:(I)I
        90: istore        5
        92: aload_3
        93: iload         5
        95: ifge          103
        98: aload         4
       100: goto          111
       103: aload         4
       105: iconst_0
       106: iload         5
       108: invokevirtual #57                 // Method java/lang/String.substring:(II)Ljava/lang/String;
       111: invokevirtual #121                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       114: pop
       115: aload_3
       116: invokevirtual #125                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       119: bipush        47
       121: getstatic     #110                // Field java/io/File.separatorChar:C
       124: invokevirtual #13                 // Method java/lang/String.replace:(CC)Ljava/lang/String;
       127: astore_1
       128: getstatic     #126                // Field java/io/File.pathSeparatorChar:C
       131: bipush        59
       133: if_icmpne     180
       136: aload_1
       137: ldc           #129                // String \\
       139: invokevirtual #49                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       142: ifeq          180
       145: aload_1
       146: invokevirtual #131                // Method java/lang/String.length:()I
       149: iconst_2
       150: if_icmple     180
       153: aload_1
       154: iconst_1
       155: invokevirtual #132                // Method java/lang/String.charAt:(I)C
       158: invokestatic  #136                // Method java/lang/Character.isLetter:(C)Z
       161: ifeq          180
       164: aload_1
       165: bipush        58
       167: invokevirtual #142                // Method java/lang/String.lastIndexOf:(I)I
       170: iconst_m1
       171: if_icmple     180
       174: aload_1
       175: iconst_1
       176: invokevirtual #145                // Method java/lang/String.substring:(I)Ljava/lang/String;
       179: astore_1
       180: aload_1
       181: invokestatic  #148                // Method decodeUri:(Ljava/lang/String;)Ljava/lang/String;
       184: areturn
      Exception table:
         from    to  target type
             4    12    15   Class java/net/MalformedURLException
      LineNumberTable:
        line 82: 0
        line 83: 2
        line 87: 4
        line 92: 12
        line 89: 15
        line 94: 16
        line 96: 32
        line 99: 42
        line 100: 54
        line 102: 61
        line 104: 77
        line 105: 83
        line 106: 92
        line 107: 115
        line 108: 128
        line 110: 174
        line 113: 180
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     185     0 uriValue   Ljava/lang/String;
            2     183     1   uri   Ljava/lang/String;
            4     181     2   url   Ljava/net/URL;
           54     131     3   buf   Ljava/lang/StringBuilder;
           83     102     4  file   Ljava/lang/String;
           92      93     5 queryPos   I
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class java/lang/String, class java/lang/String, class java/net/URL ]
          stack = [ class java/net/MalformedURLException ]
        frame_type = 0 /* same */
        frame_type = 15 /* same */
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class java/lang/StringBuilder ]
        frame_type = 255 /* full_frame */
          offset_delta = 25
          locals = [ class java/lang/String, class java/lang/String, class java/net/URL, class java/lang/StringBuilder, class java/lang/String, int ]
          stack = [ class java/lang/StringBuilder ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class java/lang/String, class java/lang/String, class java/net/URL, class java/lang/StringBuilder, class java/lang/String, int ]
          stack = [ class java/lang/StringBuilder, class java/lang/String ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 68

  public static java.io.File getToolsJar();
    descriptor: ()Ljava/io/File;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=3, args_size=0
         0: iconst_0
         1: istore_0
         2: ldc           #172                // String com.sun.tools.javac.Main
         4: invokestatic  #174                // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
         7: pop
         8: iconst_1
         9: istore_0
        10: goto          26
        13: astore_1
        14: ldc           #180                // String sun.tools.javac.Main
        16: invokestatic  #174                // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        19: pop
        20: iconst_1
        21: istore_0
        22: goto          26
        25: astore_2
        26: iload_0
        27: ifeq          32
        30: aconst_null
        31: areturn
        32: ldc           #182                // String java.home
        34: invokestatic  #184                // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        37: astore_1
        38: aload_1
        39: getstatic     #189                // Field java/util/Locale.US:Ljava/util/Locale;
        42: invokevirtual #195                // Method java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        45: ldc           #199                // String jre
        47: invokevirtual #201                // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
        50: ifeq          65
        53: aload_1
        54: iconst_0
        55: aload_1
        56: invokevirtual #131                // Method java/lang/String.length:()I
        59: iconst_4
        60: isub
        61: invokevirtual #57                 // Method java/lang/String.substring:(II)Ljava/lang/String;
        64: astore_1
        65: new           #61                 // class java/io/File
        68: dup
        69: aload_1
        70: invokedynamic #204,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        75: invokespecial #66                 // Method java/io/File."<init>":(Ljava/lang/String;)V
        78: astore_2
        79: aload_2
        80: invokevirtual #205                // Method java/io/File.exists:()Z
        83: ifne          103
        86: getstatic     #209                // Field java/lang/System.out:Ljava/io/PrintStream;
        89: aload_2
        90: invokevirtual #213                // Method java/io/File.getPath:()Ljava/lang/String;
        93: invokedynamic #216,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        98: invokevirtual #217                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       101: aconst_null
       102: areturn
       103: aload_2
       104: areturn
      Exception table:
         from    to  target type
             2    10    13   Class java/lang/Exception
            14    22    25   Class java/lang/Exception
      LineNumberTable:
        line 153: 0
        line 156: 2
        line 157: 8
        line 169: 10
        line 159: 13
        line 163: 14
        line 164: 20
        line 168: 22
        line 166: 25
        line 170: 26
        line 172: 30
        line 174: 32
        line 175: 38
        line 177: 53
        line 179: 65
        line 180: 79
        line 182: 86
        line 183: 101
        line 185: 103
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      12     1     e   Ljava/lang/Exception;
            2     103     0 toolsJarAvailable   Z
           38      67     1 javaHome   Ljava/lang/String;
           79      26     2 toolsJar   Ljava/io/File;
      StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int ]
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ int, class java/lang/Exception ]
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class java/io/File ]

  public static java.net.URL[] getLocationURLs(java.io.File) throws java.net.MalformedURLException;
    descriptor: (Ljava/io/File;)[Ljava/net/URL;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: anewarray     #14                 // class java/lang/String
         5: dup
         6: iconst_0
         7: ldc           #222                // String .jar
         9: aastore
        10: invokestatic  #224                // Method getLocationURLs:(Ljava/io/File;[Ljava/lang/String;)[Ljava/net/URL;
        13: areturn
      LineNumberTable:
        line 196: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0 location   Ljava/io/File;
    Exceptions:
      throws java.net.MalformedURLException

  public static java.net.URL[] getLocationURLs(java.io.File, java.lang.String[]) throws java.net.MalformedURLException;
    descriptor: (Ljava/io/File;[Ljava/lang/String;)[Ljava/net/URL;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=8, args_size=2
         0: iconst_0
         1: anewarray     #43                 // class java/net/URL
         4: astore_2
         5: aload_0
         6: invokevirtual #205                // Method java/io/File.exists:()Z
         9: ifne          14
        12: aload_2
        13: areturn
        14: aload_0
        15: invokevirtual #228                // Method java/io/File.isDirectory:()Z
        18: ifne          89
        21: iconst_1
        22: anewarray     #43                 // class java/net/URL
        25: astore_2
        26: aload_0
        27: invokevirtual #213                // Method java/io/File.getPath:()Ljava/lang/String;
        30: astore_3
        31: aload_1
        32: astore        4
        34: aload         4
        36: arraylength
        37: istore        5
        39: iconst_0
        40: istore        6
        42: iload         6
        44: iload         5
        46: if_icmpge     87
        49: aload         4
        51: iload         6
        53: aaload
        54: astore        7
        56: aload_3
        57: invokevirtual #231                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        60: aload         7
        62: invokevirtual #201                // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
        65: ifeq          81
        68: aload_2
        69: iconst_0
        70: aload_0
        71: invokevirtual #233                // Method java/io/File.toURI:()Ljava/net/URI;
        74: invokevirtual #80                 // Method java/net/URI.toURL:()Ljava/net/URL;
        77: aastore
        78: goto          87
        81: iinc          6, 1
        84: goto          42
        87: aload_2
        88: areturn
        89: aload_0
        90: aload_1
        91: invokedynamic #237,  0            // InvokeDynamic #3:accept:([Ljava/lang/String;)Ljava/io/FilenameFilter;
        96: invokevirtual #241                // Method java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        99: astore_3
       100: aload_3
       101: arraylength
       102: anewarray     #43                 // class java/net/URL
       105: astore_2
       106: iconst_0
       107: istore        4
       109: iload         4
       111: aload_3
       112: arraylength
       113: if_icmpge     136
       116: aload_2
       117: iload         4
       119: aload_3
       120: iload         4
       122: aaload
       123: invokevirtual #233                // Method java/io/File.toURI:()Ljava/net/URI;
       126: invokevirtual #80                 // Method java/net/URI.toURL:()Ljava/net/URL;
       129: aastore
       130: iinc          4, 1
       133: goto          109
       136: aload_2
       137: areturn
      LineNumberTable:
        line 211: 0
        line 213: 5
        line 215: 12
        line 217: 14
        line 219: 21
        line 220: 26
        line 221: 31
        line 223: 56
        line 225: 68
        line 226: 78
        line 221: 81
        line 229: 87
        line 231: 89
        line 242: 100
        line 243: 106
        line 245: 116
        line 243: 130
        line 247: 136
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           56      25     7 extension   Ljava/lang/String;
           31      58     3  path   Ljava/lang/String;
          109      27     4     i   I
            0     138     0 location   Ljava/io/File;
            0     138     1 extensions   [Ljava/lang/String;
            5     133     2  urls   [Ljava/net/URL;
          100      38     3 matches   [Ljava/io/File;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class "[Ljava/net/URL;" ]
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class java/io/File, class "[Ljava/lang/String;", class "[Ljava/net/URL;", class java/lang/String, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 38 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ class "[Ljava/io/File;", int ]
        frame_type = 250 /* chop */
          offset_delta = 26
    Exceptions:
      throws java.net.MalformedURLException
}
SourceFile: "Locator.java"
BootstrapMethods:
  0: #329 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #318 \u0001.class
  1: #329 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #320 \u0001/lib/tools.jar
  2: #329 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #322 Unable to locate tools.jar. Expected to find it in \u0001
  3: #335 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #324 (Ljava/io/File;Ljava/lang/String;)Z
      #326 REF_invokeStatic ext/mods/commons/gui/Locator.lambda$getLocationURLs$0:([Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z
      #324 (Ljava/io/File;Ljava/lang/String;)Z
InnerClasses:
  public static final #347= #343 of #345; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
