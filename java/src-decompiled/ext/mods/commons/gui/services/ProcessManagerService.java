// Bytecode for: ext.mods.commons.gui.services.ProcessManagerService
// File: ext\mods\commons\gui\services\ProcessManagerService.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/services/ProcessManagerService.class
  Last modified 9 de jul de 2026; size 13220 bytes
  MD5 checksum 4f322082f08c43359799360c71f29166
  Compiled from "ProcessManagerService.java"
public class ext.mods.commons.gui.services.ProcessManagerService
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/services/ProcessManagerService
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 13, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/commons/gui/services/ProcessManagerService.WINDOWS:Z
    #8 = Class              #10           // ext/mods/commons/gui/services/ProcessManagerService
    #9 = NameAndType        #11:#12       // WINDOWS:Z
   #10 = Utf8               ext/mods/commons/gui/services/ProcessManagerService
   #11 = Utf8               WINDOWS
   #12 = Utf8               Z
   #13 = String             #14           // .exe
   #14 = Utf8               .exe
   #15 = String             #16           //
   #16 = Utf8
   #17 = String             #18           // javaw
   #18 = Utf8               javaw
   #19 = String             #20           // java
   #20 = Utf8               java
   #21 = String             #22           // JAVA_HOME
   #22 = Utf8               JAVA_HOME
   #23 = Methodref          #24.#25       // java/lang/System.getenv:(Ljava/lang/String;)Ljava/lang/String;
   #24 = Class              #26           // java/lang/System
   #25 = NameAndType        #27:#28       // getenv:(Ljava/lang/String;)Ljava/lang/String;
   #26 = Utf8               java/lang/System
   #27 = Utf8               getenv
   #28 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #29 = Methodref          #30.#31       // java/lang/String.trim:()Ljava/lang/String;
   #30 = Class              #32           // java/lang/String
   #31 = NameAndType        #33:#34       // trim:()Ljava/lang/String;
   #32 = Utf8               java/lang/String
   #33 = Utf8               trim
   #34 = Utf8               ()Ljava/lang/String;
   #35 = Methodref          #30.#36       // java/lang/String.isEmpty:()Z
   #36 = NameAndType        #37:#38       // isEmpty:()Z
   #37 = Utf8               isEmpty
   #38 = Utf8               ()Z
   #39 = Class              #40           // java/io/File
   #40 = Utf8               java/io/File
   #41 = Fieldref           #39.#42       // java/io/File.separator:Ljava/lang/String;
   #42 = NameAndType        #43:#44       // separator:Ljava/lang/String;
   #43 = Utf8               separator
   #44 = Utf8               Ljava/lang/String;
   #45 = InvokeDynamic      #0:#46        // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #46 = NameAndType        #47:#48       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #47 = Utf8               makeConcatWithConstants
   #48 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #49 = Methodref          #39.#50       // java/io/File."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #50 = NameAndType        #5:#51        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #51 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #52 = Methodref          #39.#53       // java/io/File.isFile:()Z
   #53 = NameAndType        #54:#38       // isFile:()Z
   #54 = Utf8               isFile
   #55 = Methodref          #39.#56       // java/io/File.getAbsolutePath:()Ljava/lang/String;
   #56 = NameAndType        #57:#34       // getAbsolutePath:()Ljava/lang/String;
   #57 = Utf8               getAbsolutePath
   #58 = String             #59           // java.home
   #59 = Utf8               java.home
   #60 = Methodref          #24.#61       // java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
   #61 = NameAndType        #62:#28       // getProperty:(Ljava/lang/String;)Ljava/lang/String;
   #62 = Utf8               getProperty
   #63 = InvokeDynamic      #1:#64        // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #64 = NameAndType        #47:#65       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #65 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #66 = Class              #67           // java/net/ServerSocket
   #67 = Utf8               java/net/ServerSocket
   #68 = Methodref          #66.#3        // java/net/ServerSocket."<init>":()V
   #69 = Methodref          #66.#70       // java/net/ServerSocket.setReuseAddress:(Z)V
   #70 = NameAndType        #71:#72       // setReuseAddress:(Z)V
   #71 = Utf8               setReuseAddress
   #72 = Utf8               (Z)V
   #73 = Class              #74           // java/net/InetSocketAddress
   #74 = Utf8               java/net/InetSocketAddress
   #75 = String             #76           // 127.0.0.1
   #76 = Utf8               127.0.0.1
   #77 = Methodref          #73.#78       // java/net/InetSocketAddress."<init>":(Ljava/lang/String;I)V
   #78 = NameAndType        #5:#79        // "<init>":(Ljava/lang/String;I)V
   #79 = Utf8               (Ljava/lang/String;I)V
   #80 = Methodref          #66.#81       // java/net/ServerSocket.bind:(Ljava/net/SocketAddress;)V
   #81 = NameAndType        #82:#83       // bind:(Ljava/net/SocketAddress;)V
   #82 = Utf8               bind
   #83 = Utf8               (Ljava/net/SocketAddress;)V
   #84 = Methodref          #66.#85       // java/net/ServerSocket.close:()V
   #85 = NameAndType        #86:#6        // close:()V
   #86 = Utf8               close
   #87 = Class              #88           // java/lang/Throwable
   #88 = Utf8               java/lang/Throwable
   #89 = Methodref          #87.#90       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #90 = NameAndType        #91:#92       // addSuppressed:(Ljava/lang/Throwable;)V
   #91 = Utf8               addSuppressed
   #92 = Utf8               (Ljava/lang/Throwable;)V
   #93 = Class              #94           // java/lang/Exception
   #94 = Utf8               java/lang/Exception
   #95 = Methodref          #39.#96       // java/io/File.toPath:()Ljava/nio/file/Path;
   #96 = NameAndType        #97:#98       // toPath:()Ljava/nio/file/Path;
   #97 = Utf8               toPath
   #98 = Utf8               ()Ljava/nio/file/Path;
   #99 = Fieldref           #100.#101     // java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
  #100 = Class              #102          // java/nio/charset/StandardCharsets
  #101 = NameAndType        #103:#104     // UTF_8:Ljava/nio/charset/Charset;
  #102 = Utf8               java/nio/charset/StandardCharsets
  #103 = Utf8               UTF_8
  #104 = Utf8               Ljava/nio/charset/Charset;
  #105 = Methodref          #106.#107     // java/nio/file/Files.readAllLines:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/util/List;
  #106 = Class              #108          // java/nio/file/Files
  #107 = NameAndType        #109:#110     // readAllLines:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/util/List;
  #108 = Utf8               java/nio/file/Files
  #109 = Utf8               readAllLines
  #110 = Utf8               (Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/util/List;
  #111 = InterfaceMethodref #112.#113     // java/util/List.size:()I
  #112 = Class              #114          // java/util/List
  #113 = NameAndType        #115:#116     // size:()I
  #114 = Utf8               java/util/List
  #115 = Utf8               size
  #116 = Utf8               ()I
  #117 = Methodref          #118.#119     // java/lang/Math.max:(II)I
  #118 = Class              #120          // java/lang/Math
  #119 = NameAndType        #121:#122     // max:(II)I
  #120 = Utf8               java/lang/Math
  #121 = Utf8               max
  #122 = Utf8               (II)I
  #123 = String             #124          // \n
  #124 = Utf8               \n
  #125 = InterfaceMethodref #112.#126     // java/util/List.subList:(II)Ljava/util/List;
  #126 = NameAndType        #127:#128     // subList:(II)Ljava/util/List;
  #127 = Utf8               subList
  #128 = Utf8               (II)Ljava/util/List;
  #129 = Methodref          #30.#130      // java/lang/String.join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #130 = NameAndType        #131:#132     // join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #131 = Utf8               join
  #132 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #133 = Class              #134          // java/io/BufferedReader
  #134 = Utf8               java/io/BufferedReader
  #135 = Class              #136          // java/io/FileReader
  #136 = Utf8               java/io/FileReader
  #137 = Methodref          #135.#138     // java/io/FileReader."<init>":(Ljava/io/File;Ljava/nio/charset/Charset;)V
  #138 = NameAndType        #5:#139       // "<init>":(Ljava/io/File;Ljava/nio/charset/Charset;)V
  #139 = Utf8               (Ljava/io/File;Ljava/nio/charset/Charset;)V
  #140 = Methodref          #133.#141     // java/io/BufferedReader."<init>":(Ljava/io/Reader;)V
  #141 = NameAndType        #5:#142       // "<init>":(Ljava/io/Reader;)V
  #142 = Utf8               (Ljava/io/Reader;)V
  #143 = Class              #144          // java/lang/StringBuilder
  #144 = Utf8               java/lang/StringBuilder
  #145 = Methodref          #143.#3       // java/lang/StringBuilder."<init>":()V
  #146 = Methodref          #133.#147     // java/io/BufferedReader.readLine:()Ljava/lang/String;
  #147 = NameAndType        #148:#34      // readLine:()Ljava/lang/String;
  #148 = Utf8               readLine
  #149 = Methodref          #143.#150     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #150 = NameAndType        #151:#152     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #151 = Utf8               append
  #152 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #153 = Methodref          #143.#154     // java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
  #154 = NameAndType        #151:#155     // append:(C)Ljava/lang/StringBuilder;
  #155 = Utf8               (C)Ljava/lang/StringBuilder;
  #156 = Methodref          #143.#157     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #157 = NameAndType        #158:#34      // toString:()Ljava/lang/String;
  #158 = Utf8               toString
  #159 = Methodref          #133.#85      // java/io/BufferedReader.close:()V
  #160 = Methodref          #8.#161       // ext/mods/commons/gui/services/ProcessManagerService.readLogTail:(Ljava/io/File;I)Ljava/lang/String;
  #161 = NameAndType        #162:#163     // readLogTail:(Ljava/io/File;I)Ljava/lang/String;
  #162 = Utf8               readLogTail
  #163 = Utf8               (Ljava/io/File;I)Ljava/lang/String;
  #164 = String             #165          // Failed to start the gameserver listener
  #165 = Utf8               Failed to start the gameserver listener
  #166 = Methodref          #30.#167      // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #167 = NameAndType        #168:#169     // contains:(Ljava/lang/CharSequence;)Z
  #168 = Utf8               contains
  #169 = Utf8               (Ljava/lang/CharSequence;)Z
  #170 = String             #171          // Failed to open server socket
  #171 = Utf8               Failed to open server socket
  #172 = String             #173          // Login ja esta rodando ou a porta 9014/2106 esta em uso.\nFeche o Login antigo (janela L2j roxa) e tente de novo.
  #173 = Utf8               Login ja esta rodando ou a porta 9014/2106 esta em uso.\nFeche o Login antigo (janela L2j roxa) e tente de novo.
  #174 = String             #175          // Address already in use
  #175 = Utf8               Address already in use
  #176 = String             #177          // BindException
  #177 = Utf8               BindException
  #178 = InvokeDynamic      #2:#179       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #179 = NameAndType        #47:#28       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #180 = InvokeDynamic      #3:#181       // #3:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #181 = NameAndType        #47:#182      // makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #182 = Utf8               (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #183 = String             #184          // gameserver
  #184 = Utf8               gameserver
  #185 = Methodref          #30.#186      // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #186 = NameAndType        #187:#188     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #187 = Utf8               equalsIgnoreCase
  #188 = Utf8               (Ljava/lang/String;)Z
  #189 = String             #190          // loginserver
  #190 = Utf8               loginserver
  #191 = Fieldref           #8.#192       // ext/mods/commons/gui/services/ProcessManagerService.RUNNING:Ljava/util/Map;
  #192 = NameAndType        #193:#194     // RUNNING:Ljava/util/Map;
  #193 = Utf8               RUNNING
  #194 = Utf8               Ljava/util/Map;
  #195 = InterfaceMethodref #196.#197     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #196 = Class              #198          // java/util/Map
  #197 = NameAndType        #199:#200     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #198 = Utf8               java/util/Map
  #199 = Utf8               get
  #200 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #201 = Class              #202          // java/lang/Process
  #202 = Utf8               java/lang/Process
  #203 = Methodref          #201.#204     // java/lang/Process.isAlive:()Z
  #204 = NameAndType        #205:#38      // isAlive:()Z
  #205 = Utf8               isAlive
  #206 = String             #207          // Game
  #207 = Utf8               Game
  #208 = String             #209          // Login
  #209 = Utf8               Login
  #210 = InvokeDynamic      #4:#179       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #211 = String             #212          // Brproject
  #212 = Utf8               Brproject
  #213 = Class              #214          // javax/swing/JOptionPane
  #214 = Utf8               javax/swing/JOptionPane
  #215 = Methodref          #213.#216     // javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
  #216 = NameAndType        #217:#218     // showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
  #217 = Utf8               showMessageDialog
  #218 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
  #219 = Methodref          #8.#220       // ext/mods/commons/gui/services/ProcessManagerService.isPortOpen:(I)Z
  #220 = NameAndType        #221:#222     // isPortOpen:(I)Z
  #221 = Utf8               isPortOpen
  #222 = Utf8               (I)Z
  #223 = String             #224          // A porta do Login (9014 ou 2106) ja esta em uso.\nProvavelmente o Login ja esta rodando.\n\nDeseja tentar iniciar mesmo assim?
  #224 = Utf8               A porta do Login (9014 ou 2106) ja esta em uso.\nProvavelmente o Login ja esta rodando.\n\nDeseja tentar iniciar mesmo assim?
  #225 = String             #226          // Login Server
  #226 = Utf8               Login Server
  #227 = Methodref          #213.#228     // javax/swing/JOptionPane.showConfirmDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;II)I
  #228 = NameAndType        #229:#230     // showConfirmDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;II)I
  #229 = Utf8               showConfirmDialog
  #230 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;II)I
  #231 = Fieldref           #8.#232       // ext/mods/commons/gui/services/ProcessManagerService.prefs:Ljava/util/prefs/Preferences;
  #232 = NameAndType        #233:#234     // prefs:Ljava/util/prefs/Preferences;
  #233 = Utf8               prefs
  #234 = Utf8               Ljava/util/prefs/Preferences;
  #235 = String             #236          // gsMemoryMB
  #236 = Utf8               gsMemoryMB
  #237 = Methodref          #238.#239     // java/util/prefs/Preferences.getInt:(Ljava/lang/String;I)I
  #238 = Class              #240          // java/util/prefs/Preferences
  #239 = NameAndType        #241:#242     // getInt:(Ljava/lang/String;I)I
  #240 = Utf8               java/util/prefs/Preferences
  #241 = Utf8               getInt
  #242 = Utf8               (Ljava/lang/String;I)I
  #243 = String             #244          // lsMemoryMB
  #244 = Utf8               lsMemoryMB
  #245 = Methodref          #8.#246       // ext/mods/commons/gui/services/ProcessManagerService.getJavaExecutable:()Ljava/lang/String;
  #246 = NameAndType        #247:#34      // getJavaExecutable:()Ljava/lang/String;
  #247 = Utf8               getJavaExecutable
  #248 = String             #249          // game
  #249 = Utf8               game
  #250 = Methodref          #39.#251      // java/io/File."<init>":(Ljava/lang/String;)V
  #251 = NameAndType        #5:#252       // "<init>":(Ljava/lang/String;)V
  #252 = Utf8               (Ljava/lang/String;)V
  #253 = String             #254          // login
  #254 = Utf8               login
  #255 = Methodref          #39.#256      // java/io/File.exists:()Z
  #256 = NameAndType        #257:#38      // exists:()Z
  #257 = Utf8               exists
  #258 = InvokeDynamic      #5:#179       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #259 = String             #260          // Erro Crítico
  #260 = Utf8               Erro Crítico
  #261 = String             #262          // ../libs
  #262 = Utf8               ../libs
  #263 = Methodref          #39.#264      // java/io/File."<init>":(Ljava/io/File;Ljava/lang/String;)V
  #264 = NameAndType        #5:#265       // "<init>":(Ljava/io/File;Ljava/lang/String;)V
  #265 = Utf8               (Ljava/io/File;Ljava/lang/String;)V
  #266 = Methodref          #39.#267      // java/io/File.getCanonicalFile:()Ljava/io/File;
  #267 = NameAndType        #268:#269     // getCanonicalFile:()Ljava/io/File;
  #268 = Utf8               getCanonicalFile
  #269 = Utf8               ()Ljava/io/File;
  #270 = Methodref          #271.#272     // ext/mods/commons/util/JvmOptimizer.buildRuntimeClasspath:(Ljava/io/File;)Ljava/lang/String;
  #271 = Class              #273          // ext/mods/commons/util/JvmOptimizer
  #272 = NameAndType        #274:#275     // buildRuntimeClasspath:(Ljava/io/File;)Ljava/lang/String;
  #273 = Utf8               ext/mods/commons/util/JvmOptimizer
  #274 = Utf8               buildRuntimeClasspath
  #275 = Utf8               (Ljava/io/File;)Ljava/lang/String;
  #276 = InvokeDynamic      #6:#64        // #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #277 = String             #278          // ext.mods.gameserver.GameServer
  #278 = Utf8               ext.mods.gameserver.GameServer
  #279 = String             #280          // ext.mods.loginserver.LoginServer
  #280 = Utf8               ext.mods.loginserver.LoginServer
  #281 = Class              #282          // java/util/ArrayList
  #282 = Utf8               java/util/ArrayList
  #283 = Methodref          #281.#3       // java/util/ArrayList."<init>":()V
  #284 = InterfaceMethodref #112.#285     // java/util/List.add:(Ljava/lang/Object;)Z
  #285 = NameAndType        #286:#287     // add:(Ljava/lang/Object;)Z
  #286 = Utf8               add
  #287 = Utf8               (Ljava/lang/Object;)Z
  #288 = InvokeDynamic      #7:#289       // #7:makeConcatWithConstants:(I)Ljava/lang/String;
  #289 = NameAndType        #47:#290      // makeConcatWithConstants:(I)Ljava/lang/String;
  #290 = Utf8               (I)Ljava/lang/String;
  #291 = InvokeDynamic      #8:#289       // #8:makeConcatWithConstants:(I)Ljava/lang/String;
  #292 = String             #293          // -Dbrproject.launcher.spawned=true
  #293 = Utf8               -Dbrproject.launcher.spawned=true
  #294 = Methodref          #295.#296     // ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
  #295 = Class              #297          // ext/mods/commons/gui/ThemeManager
  #296 = NameAndType        #298:#38      // isSafeGraphics:()Z
  #297 = Utf8               ext/mods/commons/gui/ThemeManager
  #298 = Utf8               isSafeGraphics
  #299 = String             #300          // -Dsun.java2d.opengl=false
  #300 = Utf8               -Dsun.java2d.opengl=false
  #301 = String             #302          // -Dsun.java2d.d3d=false
  #302 = Utf8               -Dsun.java2d.d3d=false
  #303 = String             #304          // -Dsun.java2d.pmoffscreen=false
  #304 = Utf8               -Dsun.java2d.pmoffscreen=false
  #305 = String             #306          // -Dbrproject.safe.graphics=true
  #306 = Utf8               -Dbrproject.safe.graphics=true
  #307 = String             #308          // -XX:+UseG1GC
  #308 = Utf8               -XX:+UseG1GC
  #309 = String             #310          // -XX:MaxGCPauseMillis=200
  #310 = Utf8               -XX:MaxGCPauseMillis=200
  #311 = String             #312          // -XX:G1HeapRegionSize=16m
  #312 = Utf8               -XX:G1HeapRegionSize=16m
  #313 = String             #314          // -XX:+UseStringDeduplication
  #314 = Utf8               -XX:+UseStringDeduplication
  #315 = String             #316          // -XX:+UseCompressedOops
  #316 = Utf8               -XX:+UseCompressedOops
  #317 = String             #318          // -XX:+UseCompactObjectHeaders
  #318 = Utf8               -XX:+UseCompactObjectHeaders
  #319 = String             #320          // -XX:+TieredCompilation
  #320 = Utf8               -XX:+TieredCompilation
  #321 = String             #322          // -XX:TieredStopAtLevel=4
  #322 = Utf8               -XX:TieredStopAtLevel=4
  #323 = String             #324          // -XX:+AutoCreateSharedArchive
  #324 = Utf8               -XX:+AutoCreateSharedArchive
  #325 = String             #326          // -XX:SharedArchiveFile=cache/brproject_cds.jsa
  #326 = Utf8               -XX:SharedArchiveFile=cache/brproject_cds.jsa
  #327 = String             #328          // -cp
  #328 = Utf8               -cp
  #329 = String             #330          // log/console
  #330 = Utf8               log/console
  #331 = Methodref          #39.#332      // java/io/File.mkdirs:()Z
  #332 = NameAndType        #333:#38      // mkdirs:()Z
  #333 = Utf8               mkdirs
  #334 = String             #335          // launcher-spawn.log
  #335 = Utf8               launcher-spawn.log
  #336 = Class              #337          // java/lang/Thread
  #337 = Utf8               java/lang/Thread
  #338 = InvokeDynamic      #9:#339       // #9:run:(Lext/mods/commons/gui/services/ProcessManagerService;Ljava/util/List;Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjavax/swing/JFrame;)Ljava/lang/Runnable;
  #339 = NameAndType        #340:#341     // run:(Lext/mods/commons/gui/services/ProcessManagerService;Ljava/util/List;Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjavax/swing/JFrame;)Ljava/lang/Runnable;
  #340 = Utf8               run
  #341 = Utf8               (Lext/mods/commons/gui/services/ProcessManagerService;Ljava/util/List;Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjavax/swing/JFrame;)Ljava/lang/Runnable;
  #342 = InvokeDynamic      #10:#179      // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #343 = Methodref          #336.#344     // java/lang/Thread."<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
  #344 = NameAndType        #5:#345       // "<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
  #345 = Utf8               (Ljava/lang/Runnable;Ljava/lang/String;)V
  #346 = Methodref          #336.#347     // java/lang/Thread.start:()V
  #347 = NameAndType        #348:#6       // start:()V
  #348 = Utf8               start
  #349 = Methodref          #8.#350       // ext/mods/commons/gui/services/ProcessManagerService.destroyTracked:(Ljava/lang/String;)V
  #350 = NameAndType        #351:#252     // destroyTracked:(Ljava/lang/String;)V
  #351 = Utf8               destroyTracked
  #352 = InterfaceMethodref #196.#353     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #353 = NameAndType        #354:#200     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #354 = Utf8               remove
  #355 = Methodref          #8.#356       // ext/mods/commons/gui/services/ProcessManagerService.forceDestroy:(Ljava/lang/Process;)V
  #356 = NameAndType        #357:#358     // forceDestroy:(Ljava/lang/Process;)V
  #357 = Utf8               forceDestroy
  #358 = Utf8               (Ljava/lang/Process;)V
  #359 = Methodref          #201.#360     // java/lang/Process.pid:()J
  #360 = NameAndType        #361:#362     // pid:()J
  #361 = Utf8               pid
  #362 = Utf8               ()J
  #363 = Class              #364          // java/lang/ProcessBuilder
  #364 = Utf8               java/lang/ProcessBuilder
  #365 = String             #366          // taskkill
  #366 = Utf8               taskkill
  #367 = String             #368          // /PID
  #368 = Utf8               /PID
  #369 = Methodref          #370.#371     // java/lang/Long.toString:(J)Ljava/lang/String;
  #370 = Class              #372          // java/lang/Long
  #371 = NameAndType        #158:#373     // toString:(J)Ljava/lang/String;
  #372 = Utf8               java/lang/Long
  #373 = Utf8               (J)Ljava/lang/String;
  #374 = String             #375          // /T
  #375 = Utf8               /T
  #376 = String             #377          // /F
  #377 = Utf8               /F
  #378 = Methodref          #363.#379     // java/lang/ProcessBuilder."<init>":([Ljava/lang/String;)V
  #379 = NameAndType        #5:#380       // "<init>":([Ljava/lang/String;)V
  #380 = Utf8               ([Ljava/lang/String;)V
  #381 = Methodref          #363.#382     // java/lang/ProcessBuilder.redirectErrorStream:(Z)Ljava/lang/ProcessBuilder;
  #382 = NameAndType        #383:#384     // redirectErrorStream:(Z)Ljava/lang/ProcessBuilder;
  #383 = Utf8               redirectErrorStream
  #384 = Utf8               (Z)Ljava/lang/ProcessBuilder;
  #385 = Methodref          #363.#386     // java/lang/ProcessBuilder.start:()Ljava/lang/Process;
  #386 = NameAndType        #348:#387     // start:()Ljava/lang/Process;
  #387 = Utf8               ()Ljava/lang/Process;
  #388 = Long               8l
  #390 = Fieldref           #391.#392     // java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
  #391 = Class              #393          // java/util/concurrent/TimeUnit
  #392 = NameAndType        #394:#395     // SECONDS:Ljava/util/concurrent/TimeUnit;
  #393 = Utf8               java/util/concurrent/TimeUnit
  #394 = Utf8               SECONDS
  #395 = Utf8               Ljava/util/concurrent/TimeUnit;
  #396 = Methodref          #201.#397     // java/lang/Process.waitFor:(JLjava/util/concurrent/TimeUnit;)Z
  #397 = NameAndType        #398:#399     // waitFor:(JLjava/util/concurrent/TimeUnit;)Z
  #398 = Utf8               waitFor
  #399 = Utf8               (JLjava/util/concurrent/TimeUnit;)Z
  #400 = Methodref          #201.#401     // java/lang/Process.destroyForcibly:()Ljava/lang/Process;
  #401 = NameAndType        #402:#387     // destroyForcibly:()Ljava/lang/Process;
  #402 = Utf8               destroyForcibly
  #403 = Long               5l
  #405 = Class              #406          // java/lang/InterruptedException
  #406 = Utf8               java/lang/InterruptedException
  #407 = Methodref          #336.#408     // java/lang/Thread.currentThread:()Ljava/lang/Thread;
  #408 = NameAndType        #409:#410     // currentThread:()Ljava/lang/Thread;
  #409 = Utf8               currentThread
  #410 = Utf8               ()Ljava/lang/Thread;
  #411 = Methodref          #336.#412     // java/lang/Thread.interrupt:()V
  #412 = NameAndType        #413:#6       // interrupt:()V
  #413 = Utf8               interrupt
  #414 = Methodref          #363.#415     // java/lang/ProcessBuilder."<init>":(Ljava/util/List;)V
  #415 = NameAndType        #5:#416       // "<init>":(Ljava/util/List;)V
  #416 = Utf8               (Ljava/util/List;)V
  #417 = Methodref          #363.#418     // java/lang/ProcessBuilder.directory:(Ljava/io/File;)Ljava/lang/ProcessBuilder;
  #418 = NameAndType        #419:#420     // directory:(Ljava/io/File;)Ljava/lang/ProcessBuilder;
  #419 = Utf8               directory
  #420 = Utf8               (Ljava/io/File;)Ljava/lang/ProcessBuilder;
  #421 = Methodref          #422.#423     // java/lang/ProcessBuilder$Redirect.appendTo:(Ljava/io/File;)Ljava/lang/ProcessBuilder$Redirect;
  #422 = Class              #424          // java/lang/ProcessBuilder$Redirect
  #423 = NameAndType        #425:#426     // appendTo:(Ljava/io/File;)Ljava/lang/ProcessBuilder$Redirect;
  #424 = Utf8               java/lang/ProcessBuilder$Redirect
  #425 = Utf8               appendTo
  #426 = Utf8               (Ljava/io/File;)Ljava/lang/ProcessBuilder$Redirect;
  #427 = Methodref          #363.#428     // java/lang/ProcessBuilder.redirectOutput:(Ljava/lang/ProcessBuilder$Redirect;)Ljava/lang/ProcessBuilder;
  #428 = NameAndType        #429:#430     // redirectOutput:(Ljava/lang/ProcessBuilder$Redirect;)Ljava/lang/ProcessBuilder;
  #429 = Utf8               redirectOutput
  #430 = Utf8               (Ljava/lang/ProcessBuilder$Redirect;)Ljava/lang/ProcessBuilder;
  #431 = Methodref          #363.#432     // java/lang/ProcessBuilder.redirectError:(Ljava/lang/ProcessBuilder$Redirect;)Ljava/lang/ProcessBuilder;
  #432 = NameAndType        #433:#430     // redirectError:(Ljava/lang/ProcessBuilder$Redirect;)Ljava/lang/ProcessBuilder;
  #433 = Utf8               redirectError
  #434 = InterfaceMethodref #196.#435     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #435 = NameAndType        #436:#437     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #436 = Utf8               put
  #437 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #438 = InterfaceMethodref #196.#439     // java/util/Map.remove:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #439 = NameAndType        #354:#440     // remove:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #440 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
  #441 = Methodref          #201.#442     // java/lang/Process.exitValue:()I
  #442 = NameAndType        #443:#116     // exitValue:()I
  #443 = Utf8               exitValue
  #444 = Long               1000l
  #446 = Methodref          #336.#447     // java/lang/Thread.sleep:(J)V
  #447 = NameAndType        #448:#449     // sleep:(J)V
  #448 = Utf8               sleep
  #449 = Utf8               (J)V
  #450 = Methodref          #8.#451       // ext/mods/commons/gui/services/ProcessManagerService.iniciarProcesso:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjavax/swing/JFrame;)V
  #451 = NameAndType        #452:#453     // iniciarProcesso:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjavax/swing/JFrame;)V
  #452 = Utf8               iniciarProcesso
  #453 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjavax/swing/JFrame;)V
  #454 = Methodref          #8.#455       // ext/mods/commons/gui/services/ProcessManagerService.buildStartupErrorMessage:(Ljava/lang/String;ILjava/io/File;)Ljava/lang/String;
  #455 = NameAndType        #456:#457     // buildStartupErrorMessage:(Ljava/lang/String;ILjava/io/File;)Ljava/lang/String;
  #456 = Utf8               buildStartupErrorMessage
  #457 = Utf8               (Ljava/lang/String;ILjava/io/File;)Ljava/lang/String;
  #458 = InvokeDynamic      #11:#459      // #11:run:(Ljavax/swing/JFrame;Ljava/lang/String;)Ljava/lang/Runnable;
  #459 = NameAndType        #340:#460     // run:(Ljavax/swing/JFrame;Ljava/lang/String;)Ljava/lang/Runnable;
  #460 = Utf8               (Ljavax/swing/JFrame;Ljava/lang/String;)Ljava/lang/Runnable;
  #461 = Methodref          #462.#463     // javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
  #462 = Class              #464          // javax/swing/SwingUtilities
  #463 = NameAndType        #465:#466     // invokeLater:(Ljava/lang/Runnable;)V
  #464 = Utf8               javax/swing/SwingUtilities
  #465 = Utf8               invokeLater
  #466 = Utf8               (Ljava/lang/Runnable;)V
  #467 = InvokeDynamic      #12:#468      // #12:run:(Ljavax/swing/JFrame;Ljava/lang/Exception;)Ljava/lang/Runnable;
  #468 = NameAndType        #340:#469     // run:(Ljavax/swing/JFrame;Ljava/lang/Exception;)Ljava/lang/Runnable;
  #469 = Utf8               (Ljavax/swing/JFrame;Ljava/lang/Exception;)Ljava/lang/Runnable;
  #470 = Methodref          #93.#471      // java/lang/Exception.getMessage:()Ljava/lang/String;
  #471 = NameAndType        #472:#34      // getMessage:()Ljava/lang/String;
  #472 = Utf8               getMessage
  #473 = String             #474          // Erro ao iniciar
  #474 = Utf8               Erro ao iniciar
  #475 = String             #476          // Erro
  #476 = Utf8               Erro
  #477 = Methodref          #238.#478     // java/util/prefs/Preferences.userRoot:()Ljava/util/prefs/Preferences;
  #478 = NameAndType        #479:#480     // userRoot:()Ljava/util/prefs/Preferences;
  #479 = Utf8               userRoot
  #480 = Utf8               ()Ljava/util/prefs/Preferences;
  #481 = String             #482          // ram_allocation_settings
  #482 = Utf8               ram_allocation_settings
  #483 = Methodref          #238.#484     // java/util/prefs/Preferences.node:(Ljava/lang/String;)Ljava/util/prefs/Preferences;
  #484 = NameAndType        #485:#486     // node:(Ljava/lang/String;)Ljava/util/prefs/Preferences;
  #485 = Utf8               node
  #486 = Utf8               (Ljava/lang/String;)Ljava/util/prefs/Preferences;
  #487 = String             #488          // os.name
  #488 = Utf8               os.name
  #489 = Methodref          #24.#490      // java/lang/System.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #490 = NameAndType        #62:#65       // getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #491 = Methodref          #30.#492      // java/lang/String.toLowerCase:()Ljava/lang/String;
  #492 = NameAndType        #493:#34      // toLowerCase:()Ljava/lang/String;
  #493 = Utf8               toLowerCase
  #494 = String             #495          // win
  #495 = Utf8               win
  #496 = Class              #497          // java/util/concurrent/ConcurrentHashMap
  #497 = Utf8               java/util/concurrent/ConcurrentHashMap
  #498 = Methodref          #496.#3       // java/util/concurrent/ConcurrentHashMap."<init>":()V
  #499 = Utf8               Signature
  #500 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/Process;>;
  #501 = Utf8               LOGIN_GS_PORT
  #502 = Utf8               I
  #503 = Utf8               ConstantValue
  #504 = Integer            9014
  #505 = Utf8               LOGIN_CLIENT_PORT
  #506 = Integer            2106
  #507 = Utf8               STARTUP_CHECK_LOGIN_SEC
  #508 = Integer            12
  #509 = Utf8               STARTUP_CHECK_GAME_SEC
  #510 = Integer            45
  #511 = Utf8               Code
  #512 = Utf8               LineNumberTable
  #513 = Utf8               LocalVariableTable
  #514 = Utf8               this
  #515 = Utf8               Lext/mods/commons/gui/services/ProcessManagerService;
  #516 = Utf8               candidate
  #517 = Utf8               Ljava/io/File;
  #518 = Utf8               ext
  #519 = Utf8               binary
  #520 = Utf8               javaHome
  #521 = Utf8               embedded
  #522 = Utf8               StackMapTable
  #523 = Utf8               socket
  #524 = Utf8               Ljava/net/ServerSocket;
  #525 = Utf8               e
  #526 = Utf8               Ljava/lang/Exception;
  #527 = Utf8               port
  #528 = Utf8               lines
  #529 = Utf8               Ljava/util/List;
  #530 = Utf8               from
  #531 = Utf8               sb
  #532 = Utf8               Ljava/lang/StringBuilder;
  #533 = Utf8               line
  #534 = Utf8               br
  #535 = Utf8               Ljava/io/BufferedReader;
  #536 = Utf8               ignored
  #537 = Utf8               logFile
  #538 = Utf8               maxLines
  #539 = Utf8               LocalVariableTypeTable
  #540 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #541 = Utf8               tipo
  #542 = Utf8               exitCode
  #543 = Utf8               tail
  #544 = Utf8               choice
  #545 = Utf8               libsDir
  #546 = Utf8               cpString
  #547 = Utf8               licenseKey
  #548 = Utf8               userEmail
  #549 = Utf8               isLightModeEnabled
  #550 = Utf8               frame
  #551 = Utf8               Ljavax/swing/JFrame;
  #552 = Utf8               isGame
  #553 = Utf8               key
  #554 = Utf8               existing
  #555 = Utf8               Ljava/lang/Process;
  #556 = Utf8               memoryMB
  #557 = Utf8               caminhoJava
  #558 = Utf8               diretorioExecucao
  #559 = Utf8               mainClass
  #560 = Utf8               command
  #561 = Utf8               logDir
  #562 = Utf8               startupSec
  #563 = Class              #564          // javax/swing/JFrame
  #564 = Utf8               javax/swing/JFrame
  #565 = Utf8               shutdownAllServers
  #566 = Class              #567          // "[Ljava/lang/String;"
  #567 = Utf8               [Ljava/lang/String;
  #568 = Utf8               p
  #569 = Utf8               J
  #570 = Utf8               Ljava/lang/InterruptedException;
  #571 = Utf8               process
  #572 = Utf8               lambda$iniciarProcesso$0
  #573 = Utf8               (Ljava/util/List;Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjavax/swing/JFrame;)V
  #574 = Utf8               msg
  #575 = Utf8               pb
  #576 = Utf8               Ljava/lang/ProcessBuilder;
  #577 = Utf8               processo
  #578 = Utf8               exitedEarly
  #579 = Utf8               lambda$iniciarProcesso$2
  #580 = Utf8               (Ljavax/swing/JFrame;Ljava/lang/Exception;)V
  #581 = Utf8               lambda$iniciarProcesso$1
  #582 = Utf8               (Ljavax/swing/JFrame;Ljava/lang/String;)V
  #583 = Utf8               <clinit>
  #584 = Utf8               SourceFile
  #585 = Utf8               ProcessManagerService.java
  #586 = Utf8               BootstrapMethods
  #587 = String             #588          // bin\u0001\u0001\u0001
  #588 = Utf8               bin\u0001\u0001\u0001
  #589 = String             #590          // \u0001\u0001
  #590 = Utf8               \u0001\u0001
  #591 = String             #592          // Porta em uso. Feche o servidor \u0001 que ja esta aberto e inicie novamente.
  #592 = Utf8               Porta em uso. Feche o servidor \u0001 que ja esta aberto e inicie novamente.
  #593 = String             #594          // Erro ao iniciar \u0001 (codigo \u0001).\nVeja:\n\u0001
  #594 = Utf8               Erro ao iniciar \u0001 (codigo \u0001).\nVeja:\n\u0001
  #595 = String             #596          // \u0001 ja esta em execucao (janela L2j roxa aberta).
  #596 = Utf8               \u0001 ja esta em execucao (janela L2j roxa aberta).
  #597 = String             #598          // A pasta \'\u0001\' não existe!
  #598 = Utf8               A pasta \'\u0001\' não existe!
  #599 = String             #600          // ..\u0001libs\u0001*
  #600 = Utf8               ..\u0001libs\u0001*
  #601 = String             #602          // -Xms\u0001m
  #602 = Utf8               -Xms\u0001m
  #603 = String             #604          // -Xmx\u0001m
  #604 = Utf8               -Xmx\u0001m
  #605 = MethodType         #6            //  ()V
  #606 = MethodHandle       5:#607        // REF_invokeVirtual ext/mods/commons/gui/services/ProcessManagerService.lambda$iniciarProcesso$0:(Ljava/util/List;Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjavax/swing/JFrame;)V
  #607 = Methodref          #8.#608       // ext/mods/commons/gui/services/ProcessManagerService.lambda$iniciarProcesso$0:(Ljava/util/List;Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjavax/swing/JFrame;)V
  #608 = NameAndType        #572:#573     // lambda$iniciarProcesso$0:(Ljava/util/List;Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjavax/swing/JFrame;)V
  #609 = String             #610          // Brproject-Spawn-\u0001
  #610 = Utf8               Brproject-Spawn-\u0001
  #611 = MethodHandle       6:#612        // REF_invokeStatic ext/mods/commons/gui/services/ProcessManagerService.lambda$iniciarProcesso$1:(Ljavax/swing/JFrame;Ljava/lang/String;)V
  #612 = Methodref          #8.#613       // ext/mods/commons/gui/services/ProcessManagerService.lambda$iniciarProcesso$1:(Ljavax/swing/JFrame;Ljava/lang/String;)V
  #613 = NameAndType        #581:#582     // lambda$iniciarProcesso$1:(Ljavax/swing/JFrame;Ljava/lang/String;)V
  #614 = MethodHandle       6:#615        // REF_invokeStatic ext/mods/commons/gui/services/ProcessManagerService.lambda$iniciarProcesso$2:(Ljavax/swing/JFrame;Ljava/lang/Exception;)V
  #615 = Methodref          #8.#616       // ext/mods/commons/gui/services/ProcessManagerService.lambda$iniciarProcesso$2:(Ljavax/swing/JFrame;Ljava/lang/Exception;)V
  #616 = NameAndType        #579:#580     // lambda$iniciarProcesso$2:(Ljavax/swing/JFrame;Ljava/lang/Exception;)V
  #617 = MethodHandle       6:#618        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #618 = Methodref          #619.#620     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #619 = Class              #621          // java/lang/invoke/StringConcatFactory
  #620 = NameAndType        #47:#622      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #621 = Utf8               java/lang/invoke/StringConcatFactory
  #622 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #623 = MethodHandle       6:#624        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #624 = Methodref          #625.#626     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #625 = Class              #627          // java/lang/invoke/LambdaMetafactory
  #626 = NameAndType        #628:#629     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #627 = Utf8               java/lang/invoke/LambdaMetafactory
  #628 = Utf8               metafactory
  #629 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #630 = Utf8               InnerClasses
  #631 = Utf8               Redirect
  #632 = Class              #633          // java/lang/invoke/MethodHandles$Lookup
  #633 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #634 = Class              #635          // java/lang/invoke/MethodHandles
  #635 = Utf8               java/lang/invoke/MethodHandles
  #636 = Utf8               Lookup
{
  public ext.mods.commons.gui.services.ProcessManagerService();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 52: 0
        line 53: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/services/ProcessManagerService;

  public void iniciarProcesso(java.lang.String, java.lang.String, java.lang.String, boolean, javax.swing.JFrame);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjavax/swing/JFrame;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=13, locals=18, args_size=6
         0: aload_1
         1: ldc           #183                // String gameserver
         3: invokevirtual #185                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
         6: istore        6
         8: iload         6
        10: ifeq          18
        13: ldc           #183                // String gameserver
        15: goto          20
        18: ldc           #189                // String loginserver
        20: astore        7
        22: getstatic     #191                // Field RUNNING:Ljava/util/Map;
        25: aload         7
        27: invokeinterface #195,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        32: checkcast     #201                // class java/lang/Process
        35: astore        8
        37: aload         8
        39: ifnull        76
        42: aload         8
        44: invokevirtual #203                // Method java/lang/Process.isAlive:()Z
        47: ifeq          76
        50: aload         5
        52: iload         6
        54: ifeq          62
        57: ldc           #206                // String Game
        59: goto          64
        62: ldc           #208                // String Login
        64: invokedynamic #210,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        69: ldc           #211                // String Brproject
        71: iconst_1
        72: invokestatic  #215                // Method javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
        75: return
        76: iload         6
        78: ifne          118
        81: sipush        9014
        84: invokestatic  #219                // Method isPortOpen:(I)Z
        87: ifne          99
        90: sipush        2106
        93: invokestatic  #219                // Method isPortOpen:(I)Z
        96: ifeq          118
        99: aload         5
       101: ldc           #223                // String A porta do Login (9014 ou 2106) ja esta em uso.\nProvavelmente o Login ja esta rodando.\n\nDeseja tentar iniciar mesmo assim?
       103: ldc           #225                // String Login Server
       105: iconst_0
       106: iconst_2
       107: invokestatic  #227                // Method javax/swing/JOptionPane.showConfirmDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;II)I
       110: istore        9
       112: iload         9
       114: ifeq          118
       117: return
       118: iload         6
       120: ifeq          137
       123: getstatic     #231                // Field prefs:Ljava/util/prefs/Preferences;
       126: ldc           #235                // String gsMemoryMB
       128: sipush        2048
       131: invokevirtual #237                // Method java/util/prefs/Preferences.getInt:(Ljava/lang/String;I)I
       134: goto          148
       137: getstatic     #231                // Field prefs:Ljava/util/prefs/Preferences;
       140: ldc           #243                // String lsMemoryMB
       142: sipush        512
       145: invokevirtual #237                // Method java/util/prefs/Preferences.getInt:(Ljava/lang/String;I)I
       148: istore        9
       150: iload         6
       152: ifne          168
       155: iload         9
       157: sipush        256
       160: if_icmpge     168
       163: sipush        256
       166: istore        9
       168: aload_0
       169: invokevirtual #245                // Method getJavaExecutable:()Ljava/lang/String;
       172: astore        10
       174: iload         6
       176: ifeq          191
       179: new           #39                 // class java/io/File
       182: dup
       183: ldc           #248                // String game
       185: invokespecial #250                // Method java/io/File."<init>":(Ljava/lang/String;)V
       188: goto          200
       191: new           #39                 // class java/io/File
       194: dup
       195: ldc           #253                // String login
       197: invokespecial #250                // Method java/io/File."<init>":(Ljava/lang/String;)V
       200: astore        11
       202: aload         11
       204: invokevirtual #255                // Method java/io/File.exists:()Z
       207: ifne          230
       210: aload         5
       212: aload         11
       214: invokevirtual #55                 // Method java/io/File.getAbsolutePath:()Ljava/lang/String;
       217: invokedynamic #258,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       222: ldc_w         #259                // String Erro Crítico
       225: iconst_0
       226: invokestatic  #215                // Method javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
       229: return
       230: new           #39                 // class java/io/File
       233: dup
       234: aload         11
       236: ldc_w         #261                // String ../libs
       239: invokespecial #263                // Method java/io/File."<init>":(Ljava/io/File;Ljava/lang/String;)V
       242: invokevirtual #266                // Method java/io/File.getCanonicalFile:()Ljava/io/File;
       245: astore        13
       247: aload         13
       249: invokestatic  #270                // Method ext/mods/commons/util/JvmOptimizer.buildRuntimeClasspath:(Ljava/io/File;)Ljava/lang/String;
       252: astore        12
       254: goto          272
       257: astore        13
       259: getstatic     #41                 // Field java/io/File.separator:Ljava/lang/String;
       262: getstatic     #41                 // Field java/io/File.separator:Ljava/lang/String;
       265: invokedynamic #276,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       270: astore        12
       272: iload         6
       274: ifeq          283
       277: ldc_w         #277                // String ext.mods.gameserver.GameServer
       280: goto          286
       283: ldc_w         #279                // String ext.mods.loginserver.LoginServer
       286: astore        13
       288: new           #281                // class java/util/ArrayList
       291: dup
       292: invokespecial #283                // Method java/util/ArrayList."<init>":()V
       295: astore        14
       297: aload         14
       299: aload         10
       301: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       306: pop
       307: aload         14
       309: iload         9
       311: invokedynamic #288,  0            // InvokeDynamic #7:makeConcatWithConstants:(I)Ljava/lang/String;
       316: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       321: pop
       322: aload         14
       324: iload         9
       326: invokedynamic #291,  0            // InvokeDynamic #8:makeConcatWithConstants:(I)Ljava/lang/String;
       331: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       336: pop
       337: aload         14
       339: ldc_w         #292                // String -Dbrproject.launcher.spawned=true
       342: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       347: pop
       348: invokestatic  #294                // Method ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
       351: ifeq          398
       354: aload         14
       356: ldc_w         #299                // String -Dsun.java2d.opengl=false
       359: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       364: pop
       365: aload         14
       367: ldc_w         #301                // String -Dsun.java2d.d3d=false
       370: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       375: pop
       376: aload         14
       378: ldc_w         #303                // String -Dsun.java2d.pmoffscreen=false
       381: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       386: pop
       387: aload         14
       389: ldc_w         #305                // String -Dbrproject.safe.graphics=true
       392: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       397: pop
       398: aload         14
       400: ldc_w         #307                // String -XX:+UseG1GC
       403: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       408: pop
       409: aload         14
       411: ldc_w         #309                // String -XX:MaxGCPauseMillis=200
       414: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       419: pop
       420: aload         14
       422: ldc_w         #311                // String -XX:G1HeapRegionSize=16m
       425: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       430: pop
       431: aload         14
       433: ldc_w         #313                // String -XX:+UseStringDeduplication
       436: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       441: pop
       442: aload         14
       444: ldc_w         #315                // String -XX:+UseCompressedOops
       447: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       452: pop
       453: aload         14
       455: ldc_w         #317                // String -XX:+UseCompactObjectHeaders
       458: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       463: pop
       464: aload         14
       466: ldc_w         #319                // String -XX:+TieredCompilation
       469: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       474: pop
       475: aload         14
       477: ldc_w         #321                // String -XX:TieredStopAtLevel=4
       480: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       485: pop
       486: iload         6
       488: ifeq          513
       491: aload         14
       493: ldc_w         #323                // String -XX:+AutoCreateSharedArchive
       496: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       501: pop
       502: aload         14
       504: ldc_w         #325                // String -XX:SharedArchiveFile=cache/brproject_cds.jsa
       507: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       512: pop
       513: aload         14
       515: ldc_w         #327                // String -cp
       518: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       523: pop
       524: aload         14
       526: aload         12
       528: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       533: pop
       534: aload         14
       536: aload         13
       538: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       543: pop
       544: iload         6
       546: ifeq          567
       549: aload         14
       551: aload_2
       552: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       557: pop
       558: aload         14
       560: aload_3
       561: invokeinterface #284,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       566: pop
       567: new           #39                 // class java/io/File
       570: dup
       571: aload         11
       573: ldc_w         #329                // String log/console
       576: invokespecial #263                // Method java/io/File."<init>":(Ljava/io/File;Ljava/lang/String;)V
       579: astore        15
       581: aload         15
       583: invokevirtual #331                // Method java/io/File.mkdirs:()Z
       586: pop
       587: new           #39                 // class java/io/File
       590: dup
       591: aload         15
       593: ldc_w         #334                // String launcher-spawn.log
       596: invokespecial #263                // Method java/io/File."<init>":(Ljava/io/File;Ljava/lang/String;)V
       599: astore        16
       601: iload         6
       603: ifeq          611
       606: bipush        45
       608: goto          613
       611: bipush        12
       613: istore        17
       615: new           #336                // class java/lang/Thread
       618: dup
       619: aload_0
       620: aload         14
       622: aload         11
       624: aload         16
       626: aload         7
       628: iload         17
       630: aload_1
       631: aload_2
       632: aload_3
       633: iload         4
       635: aload         5
       637: invokedynamic #338,  0            // InvokeDynamic #9:run:(Lext/mods/commons/gui/services/ProcessManagerService;Ljava/util/List;Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjavax/swing/JFrame;)Ljava/lang/Runnable;
       642: aload         7
       644: invokedynamic #342,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       649: invokespecial #343                // Method java/lang/Thread."<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
       652: invokevirtual #346                // Method java/lang/Thread.start:()V
       655: return
      Exception table:
         from    to  target type
           230   254   257   Class java/lang/Exception
      LineNumberTable:
        line 127: 0
        line 128: 8
        line 130: 22
        line 131: 37
        line 133: 50
        line 134: 52
        line 133: 72
        line 136: 75
        line 139: 76
        line 141: 99
        line 146: 112
        line 147: 117
        line 150: 118
        line 151: 150
        line 152: 163
        line 154: 168
        line 155: 174
        line 157: 202
        line 158: 210
        line 159: 229
        line 164: 230
        line 165: 247
        line 168: 254
        line 166: 257
        line 167: 259
        line 170: 272
        line 172: 288
        line 173: 297
        line 174: 307
        line 175: 322
        line 176: 337
        line 178: 348
        line 179: 354
        line 180: 365
        line 181: 376
        line 182: 387
        line 185: 398
        line 186: 409
        line 187: 420
        line 188: 431
        line 189: 442
        line 190: 453
        line 191: 464
        line 192: 475
        line 194: 486
        line 196: 491
        line 197: 502
        line 200: 513
        line 201: 524
        line 202: 534
        line 204: 544
        line 205: 549
        line 206: 558
        line 209: 567
        line 210: 581
        line 211: 587
        line 212: 601
        line 214: 615
        line 248: 652
        line 249: 655
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          112       6     9 choice   I
          247       7    13 libsDir   Ljava/io/File;
          254       3    12 cpString   Ljava/lang/String;
          259      13    13     e   Ljava/lang/Exception;
            0     656     0  this   Lext/mods/commons/gui/services/ProcessManagerService;
            0     656     1  tipo   Ljava/lang/String;
            0     656     2 licenseKey   Ljava/lang/String;
            0     656     3 userEmail   Ljava/lang/String;
            0     656     4 isLightModeEnabled   Z
            0     656     5 frame   Ljavax/swing/JFrame;
            8     648     6 isGame   Z
           22     634     7   key   Ljava/lang/String;
           37     619     8 existing   Ljava/lang/Process;
          150     506     9 memoryMB   I
          174     482    10 caminhoJava   Ljava/lang/String;
          202     454    11 diretorioExecucao   Ljava/io/File;
          272     384    12 cpString   Ljava/lang/String;
          288     368    13 mainClass   Ljava/lang/String;
          297     359    14 command   Ljava/util/List;
          581      75    15 logDir   Ljava/io/File;
          601      55    16 logFile   Ljava/io/File;
          615      41    17 startupSec   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          297     359    14 command   Ljava/util/List<Ljava/lang/String;>;
      StackMapTable: number_of_entries = 22
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ class ext/mods/commons/gui/services/ProcessManagerService, class java/lang/String, class java/lang/String, class java/lang/String, int, class javax/swing/JFrame, int, class java/lang/String, class java/lang/Process ]
          stack = [ class javax/swing/JFrame ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/commons/gui/services/ProcessManagerService, class java/lang/String, class java/lang/String, class java/lang/String, int, class javax/swing/JFrame, int, class java/lang/String, class java/lang/Process ]
          stack = [ class javax/swing/JFrame, class java/lang/String ]
        frame_type = 11 /* same */
        frame_type = 22 /* same */
        frame_type = 18 /* same */
        frame_type = 18 /* same */
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/lang/String ]
        frame_type = 72 /* same_locals_1_stack_item */
          stack = [ class java/io/File ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/io/File ]
        frame_type = 90 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/lang/String ]
        frame_type = 10 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 111
          locals = [ class java/lang/String, class java/util/List ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 114
        frame_type = 53 /* same */
        frame_type = 253 /* append */
          offset_delta = 43
          locals = [ class java/io/File, class java/io/File ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]

  public void shutdownAllServers();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=1
         0: iconst_2
         1: anewarray     #30                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #189                // String loginserver
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #183                // String gameserver
        13: aastore
        14: astore_1
        15: aload_1
        16: arraylength
        17: istore_2
        18: iconst_0
        19: istore_3
        20: iload_3
        21: iload_2
        22: if_icmpge     41
        25: aload_1
        26: iload_3
        27: aaload
        28: astore        4
        30: aload         4
        32: invokestatic  #349                // Method destroyTracked:(Ljava/lang/String;)V
        35: iinc          3, 1
        38: goto          20
        41: return
      LineNumberTable:
        line 254: 0
        line 255: 30
        line 254: 35
        line 256: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30       5     4   key   Ljava/lang/String;
            0      42     0  this   Lext/mods/commons/gui/services/ProcessManagerService;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 20
          locals = [ class "[Ljava/lang/String;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 20

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: invokestatic  #477                // Method java/util/prefs/Preferences.userRoot:()Ljava/util/prefs/Preferences;
         3: ldc_w         #481                // String ram_allocation_settings
         6: invokevirtual #483                // Method java/util/prefs/Preferences.node:(Ljava/lang/String;)Ljava/util/prefs/Preferences;
         9: putstatic     #231                // Field prefs:Ljava/util/prefs/Preferences;
        12: ldc_w         #487                // String os.name
        15: ldc           #15                 // String
        17: invokestatic  #489                // Method java/lang/System.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        20: invokevirtual #491                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        23: ldc_w         #494                // String win
        26: invokevirtual #166                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        29: putstatic     #7                  // Field WINDOWS:Z
        32: new           #496                // class java/util/concurrent/ConcurrentHashMap
        35: dup
        36: invokespecial #498                // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        39: putstatic     #191                // Field RUNNING:Ljava/util/Map;
        42: return
      LineNumberTable:
        line 43: 0
        line 44: 12
        line 45: 32
}
SourceFile: "ProcessManagerService.java"
BootstrapMethods:
  0: #617 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #587 bin\u0001\u0001\u0001
  1: #617 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #589 \u0001\u0001
  2: #617 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #591 Porta em uso. Feche o servidor \u0001 que ja esta aberto e inicie novamente.
  3: #617 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #593 Erro ao iniciar \u0001 (codigo \u0001).\nVeja:\n\u0001
  4: #617 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #595 \u0001 ja esta em execucao (janela L2j roxa aberta).
  5: #617 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #597 A pasta \'\u0001\' não existe!
  6: #617 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #599 ..\u0001libs\u0001*
  7: #617 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #601 -Xms\u0001m
  8: #617 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #603 -Xmx\u0001m
  9: #623 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #605 ()V
      #606 REF_invokeVirtual ext/mods/commons/gui/services/ProcessManagerService.lambda$iniciarProcesso$0:(Ljava/util/List;Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjavax/swing/JFrame;)V
      #605 ()V
  10: #617 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #609 Brproject-Spawn-\u0001
  11: #623 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #605 ()V
      #611 REF_invokeStatic ext/mods/commons/gui/services/ProcessManagerService.lambda$iniciarProcesso$1:(Ljavax/swing/JFrame;Ljava/lang/String;)V
      #605 ()V
  12: #623 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #605 ()V
      #614 REF_invokeStatic ext/mods/commons/gui/services/ProcessManagerService.lambda$iniciarProcesso$2:(Ljavax/swing/JFrame;Ljava/lang/Exception;)V
      #605 ()V
InnerClasses:
  public static abstract #631= #422 of #363; // Redirect=class java/lang/ProcessBuilder$Redirect of class java/lang/ProcessBuilder
  public static final #636= #632 of #634; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
