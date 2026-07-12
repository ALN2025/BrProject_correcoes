// Bytecode for: ext.mods.Crypta.DeeplTranslator
// File: ext\mods\Crypta\DeeplTranslator.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/Crypta/DeeplTranslator.class
  Last modified 9 de jul de 2026; size 24291 bytes
  MD5 checksum f4175cadb071e0bf6e6eaa7a1ff53fba
  Compiled from "DeeplTranslator.java"
public class ext.mods.Crypta.DeeplTranslator
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/Crypta/DeeplTranslator
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 10, methods: 32, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/Crypta/DeeplTranslator._playerReplaces:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/Crypta/DeeplTranslator
   #12 = NameAndType        #14:#15       // _playerReplaces:Ljava/util/Map;
   #13 = Utf8               ext/mods/Crypta/DeeplTranslator
   #14 = Utf8               _playerReplaces
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/Crypta/DeeplTranslator._playerPreferences:Ljava/util/Map;
   #17 = NameAndType        #18:#15       // _playerPreferences:Ljava/util/Map;
   #18 = Utf8               _playerPreferences
   #19 = Fieldref           #11.#20       // ext/mods/Crypta/DeeplTranslator._placeholderMappings:Ljava/util/Map;
   #20 = NameAndType        #21:#15       // _placeholderMappings:Ljava/util/Map;
   #21 = Utf8               _placeholderMappings
   #22 = Fieldref           #11.#23       // ext/mods/Crypta/DeeplTranslator._accountLimitReached:Z
   #23 = NameAndType        #24:#25       // _accountLimitReached:Z
   #24 = Utf8               _accountLimitReached
   #25 = Utf8               Z
   #26 = Methodref          #11.#27       // ext/mods/Crypta/DeeplTranslator.asyncReload:()V
   #27 = NameAndType        #28:#6        // asyncReload:()V
   #28 = Utf8               asyncReload
   #29 = InvokeDynamic      #0:#30        // #0:run:(Lext/mods/Crypta/DeeplTranslator;)Ljava/lang/Runnable;
   #30 = NameAndType        #31:#32       // run:(Lext/mods/Crypta/DeeplTranslator;)Ljava/lang/Runnable;
   #31 = Utf8               run
   #32 = Utf8               (Lext/mods/Crypta/DeeplTranslator;)Ljava/lang/Runnable;
   #33 = Methodref          #34.#35       // ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
   #34 = Class              #36           // ext/mods/commons/pool/ThreadPool
   #35 = NameAndType        #37:#38       // execute:(Ljava/lang/Runnable;)V
   #36 = Utf8               ext/mods/commons/pool/ThreadPool
   #37 = Utf8               execute
   #38 = Utf8               (Ljava/lang/Runnable;)V
   #39 = Fieldref           #11.#40       // ext/mods/Crypta/DeeplTranslator._translator:Lcom/deepl/api/Translator;
   #40 = NameAndType        #41:#42       // _translator:Lcom/deepl/api/Translator;
   #41 = Utf8               _translator
   #42 = Utf8               Lcom/deepl/api/Translator;
   #43 = Fieldref           #44.#45       // ext/mods/Config.DEEPL_AUTH_KEY:Ljava/lang/String;
   #44 = Class              #46           // ext/mods/Config
   #45 = NameAndType        #47:#48       // DEEPL_AUTH_KEY:Ljava/lang/String;
   #46 = Utf8               ext/mods/Config
   #47 = Utf8               DEEPL_AUTH_KEY
   #48 = Utf8               Ljava/lang/String;
   #49 = Methodref          #50.#51       // java/lang/String.trim:()Ljava/lang/String;
   #50 = Class              #52           // java/lang/String
   #51 = NameAndType        #53:#54       // trim:()Ljava/lang/String;
   #52 = Utf8               java/lang/String
   #53 = Utf8               trim
   #54 = Utf8               ()Ljava/lang/String;
   #55 = Methodref          #50.#56       // java/lang/String.isEmpty:()Z
   #56 = NameAndType        #57:#58       // isEmpty:()Z
   #57 = Utf8               isEmpty
   #58 = Utf8               ()Z
   #59 = Class              #60           // com/deepl/api/DeepLClient
   #60 = Utf8               com/deepl/api/DeepLClient
   #61 = Methodref          #59.#62       // com/deepl/api/DeepLClient."<init>":(Ljava/lang/String;)V
   #62 = NameAndType        #5:#63        // "<init>":(Ljava/lang/String;)V
   #63 = Utf8               (Ljava/lang/String;)V
   #64 = Class              #65           // com/deepl/api/TextTranslationOptions
   #65 = Utf8               com/deepl/api/TextTranslationOptions
   #66 = Methodref          #64.#3        // com/deepl/api/TextTranslationOptions."<init>":()V
   #67 = Methodref          #64.#68       // com/deepl/api/TextTranslationOptions.setPreserveFormatting:(Z)Lcom/deepl/api/TextTranslationOptions;
   #68 = NameAndType        #69:#70       // setPreserveFormatting:(Z)Lcom/deepl/api/TextTranslationOptions;
   #69 = Utf8               setPreserveFormatting
   #70 = Utf8               (Z)Lcom/deepl/api/TextTranslationOptions;
   #71 = String             #72           // html
   #72 = Utf8               html
   #73 = Methodref          #64.#74       // com/deepl/api/TextTranslationOptions.setTagHandling:(Ljava/lang/String;)Lcom/deepl/api/TextTranslationOptions;
   #74 = NameAndType        #75:#76       // setTagHandling:(Ljava/lang/String;)Lcom/deepl/api/TextTranslationOptions;
   #75 = Utf8               setTagHandling
   #76 = Utf8               (Ljava/lang/String;)Lcom/deepl/api/TextTranslationOptions;
   #77 = Fieldref           #44.#78       // ext/mods/Config.DEEP_CONTEXT_STRING:Ljava/lang/String;
   #78 = NameAndType        #79:#48       // DEEP_CONTEXT_STRING:Ljava/lang/String;
   #79 = Utf8               DEEP_CONTEXT_STRING
   #80 = Methodref          #64.#81       // com/deepl/api/TextTranslationOptions.setContext:(Ljava/lang/String;)Lcom/deepl/api/TextTranslationOptions;
   #81 = NameAndType        #82:#76       // setContext:(Ljava/lang/String;)Lcom/deepl/api/TextTranslationOptions;
   #82 = Utf8               setContext
   #83 = Fieldref           #11.#84       // ext/mods/Crypta/DeeplTranslator._translatorOptions:Lcom/deepl/api/TextTranslationOptions;
   #84 = NameAndType        #85:#86       // _translatorOptions:Lcom/deepl/api/TextTranslationOptions;
   #85 = Utf8               _translatorOptions
   #86 = Utf8               Lcom/deepl/api/TextTranslationOptions;
   #87 = Methodref          #88.#89       // com/deepl/api/Translator.getUsage:()Lcom/deepl/api/Usage;
   #88 = Class              #90           // com/deepl/api/Translator
   #89 = NameAndType        #91:#92       // getUsage:()Lcom/deepl/api/Usage;
   #90 = Utf8               com/deepl/api/Translator
   #91 = Utf8               getUsage
   #92 = Utf8               ()Lcom/deepl/api/Usage;
   #93 = Methodref          #94.#95       // com/deepl/api/Usage.anyLimitReached:()Z
   #94 = Class              #96           // com/deepl/api/Usage
   #95 = NameAndType        #97:#58       // anyLimitReached:()Z
   #96 = Utf8               com/deepl/api/Usage
   #97 = Utf8               anyLimitReached
   #98 = Fieldref           #11.#99       // ext/mods/Crypta/DeeplTranslator.LOGGER:Lext/mods/commons/logging/CLogger;
   #99 = NameAndType        #100:#101     // LOGGER:Lext/mods/commons/logging/CLogger;
  #100 = Utf8               LOGGER
  #101 = Utf8               Lext/mods/commons/logging/CLogger;
  #102 = String             #103          // DeeplTranslator has been initialized. Account limit reached: {}
  #103 = Utf8               DeeplTranslator has been initialized. Account limit reached: {}
  #104 = Methodref          #105.#106     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #105 = Class              #107          // java/lang/Boolean
  #106 = NameAndType        #108:#109     // valueOf:(Z)Ljava/lang/Boolean;
  #107 = Utf8               java/lang/Boolean
  #108 = Utf8               valueOf
  #109 = Utf8               (Z)Ljava/lang/Boolean;
  #110 = Methodref          #111.#112     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #111 = Class              #113          // ext/mods/commons/logging/CLogger
  #112 = NameAndType        #114:#115     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #113 = Utf8               ext/mods/commons/logging/CLogger
  #114 = Utf8               info
  #115 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #116 = Class              #117          // java/lang/Exception
  #117 = Utf8               java/lang/Exception
  #118 = String             #119          // Failed to initialize DeeplTranslator.
  #119 = Utf8               Failed to initialize DeeplTranslator.
  #120 = Methodref          #111.#121     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #121 = NameAndType        #122:#123     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #122 = Utf8               error
  #123 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #124 = Methodref          #125.#126     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.getFileName:()Ljava/lang/String;
  #125 = Class              #127          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #126 = NameAndType        #128:#54      // getFileName:()Ljava/lang/String;
  #127 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #128 = Utf8               getFileName
  #129 = Methodref          #125.#130     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.isFromTranslator:()Z
  #130 = NameAndType        #131:#58      // isFromTranslator:()Z
  #131 = Utf8               isFromTranslator
  #132 = Methodref          #11.#133      // ext/mods/Crypta/DeeplTranslator.normalizeFilePath:(Ljava/lang/String;)Ljava/lang/String;
  #133 = NameAndType        #134:#135     // normalizeFilePath:(Ljava/lang/String;)Ljava/lang/String;
  #134 = Utf8               normalizeFilePath
  #135 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #136 = Methodref          #11.#137      // ext/mods/Crypta/DeeplTranslator.isTranslatable:(Ljava/lang/String;)Z
  #137 = NameAndType        #138:#139     // isTranslatable:(Ljava/lang/String;)Z
  #138 = Utf8               isTranslatable
  #139 = Utf8               (Ljava/lang/String;)Z
  #140 = Methodref          #125.#141     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.getReplaces:()Ljava/util/Map;
  #141 = NameAndType        #142:#143     // getReplaces:()Ljava/util/Map;
  #142 = Utf8               getReplaces
  #143 = Utf8               ()Ljava/util/Map;
  #144 = Methodref          #145.#146     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #145 = Class              #147          // ext/mods/gameserver/model/actor/Player
  #146 = NameAndType        #148:#149     // getObjectId:()I
  #147 = Utf8               ext/mods/gameserver/model/actor/Player
  #148 = Utf8               getObjectId
  #149 = Utf8               ()I
  #150 = Methodref          #151.#152     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #151 = Class              #153          // java/lang/Integer
  #152 = NameAndType        #108:#154     // valueOf:(I)Ljava/lang/Integer;
  #153 = Utf8               java/lang/Integer
  #154 = Utf8               (I)Ljava/lang/Integer;
  #155 = InterfaceMethodref #156.#157     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #156 = Class              #158          // java/util/Map
  #157 = NameAndType        #159:#160     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #158 = Utf8               java/util/Map
  #159 = Utf8               put
  #160 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #161 = Methodref          #11.#162      // ext/mods/Crypta/DeeplTranslator.getPlayerLanguage:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/Crypta/DeeplTranslator$Language;
  #162 = NameAndType        #163:#164     // getPlayerLanguage:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/Crypta/DeeplTranslator$Language;
  #163 = Utf8               getPlayerLanguage
  #164 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/Crypta/DeeplTranslator$Language;
  #165 = Methodref          #166.#167     // ext/mods/Crypta/DeeplTranslator$Language.isOriginal:()Z
  #166 = Class              #168          // ext/mods/Crypta/DeeplTranslator$Language
  #167 = NameAndType        #169:#58      // isOriginal:()Z
  #168 = Utf8               ext/mods/Crypta/DeeplTranslator$Language
  #169 = Utf8               isOriginal
  #170 = Methodref          #125.#171     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFileName:(Ljava/lang/String;)V
  #171 = NameAndType        #172:#63      // setFileName:(Ljava/lang/String;)V
  #172 = Utf8               setFileName
  #173 = String             #174          // </body>
  #174 = Utf8               </body>
  #175 = Methodref          #125.#176     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #176 = NameAndType        #177:#178     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #177 = Utf8               replace
  #178 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #179 = Methodref          #11.#180      // ext/mods/Crypta/DeeplTranslator.getTranslatedPath:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/lang/String;
  #180 = NameAndType        #181:#182     // getTranslatedPath:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/lang/String;
  #181 = Utf8               getTranslatedPath
  #182 = Utf8               (Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/lang/String;
  #183 = InterfaceMethodref #184.#185     // java/nio/file/Path.of:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
  #184 = Class              #186          // java/nio/file/Path
  #185 = NameAndType        #187:#188     // of:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
  #186 = Utf8               java/nio/file/Path
  #187 = Utf8               of
  #188 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
  #189 = Class              #190          // java/nio/file/LinkOption
  #190 = Utf8               java/nio/file/LinkOption
  #191 = Methodref          #192.#193     // java/nio/file/Files.exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
  #192 = Class              #194          // java/nio/file/Files
  #193 = NameAndType        #195:#196     // exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
  #194 = Utf8               java/nio/file/Files
  #195 = Utf8               exists
  #196 = Utf8               (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
  #197 = Fieldref           #198.#199     // java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
  #198 = Class              #200          // java/nio/charset/StandardCharsets
  #199 = NameAndType        #201:#202     // UTF_8:Ljava/nio/charset/Charset;
  #200 = Utf8               java/nio/charset/StandardCharsets
  #201 = Utf8               UTF_8
  #202 = Utf8               Ljava/nio/charset/Charset;
  #203 = Methodref          #192.#204     // java/nio/file/Files.readString:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
  #204 = NameAndType        #205:#206     // readString:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
  #205 = Utf8               readString
  #206 = Utf8               (Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
  #207 = Methodref          #125.#208     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #208 = NameAndType        #209:#63      // setHtml:(Ljava/lang/String;)V
  #209 = Utf8               setHtml
  #210 = Methodref          #125.#211     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.applyReplaces:(Ljava/util/Map;)V
  #211 = NameAndType        #212:#213     // applyReplaces:(Ljava/util/Map;)V
  #212 = Utf8               applyReplaces
  #213 = Utf8               (Ljava/util/Map;)V
  #214 = Class              #215          // java/io/IOException
  #215 = Utf8               java/io/IOException
  #216 = String             #217          // Failed to read translated file \'{}\'.
  #217 = Utf8               Failed to read translated file \'{}\'.
  #218 = Methodref          #111.#219     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #219 = NameAndType        #122:#220     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #220 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #221 = Methodref          #11.#222      // ext/mods/Crypta/DeeplTranslator.accountLimitReached:()Z
  #222 = NameAndType        #223:#58      // accountLimitReached:()Z
  #223 = Utf8               accountLimitReached
  #224 = Methodref          #11.#225      // ext/mods/Crypta/DeeplTranslator.asyncTranslate:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)V
  #225 = NameAndType        #226:#227     // asyncTranslate:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)V
  #226 = Utf8               asyncTranslate
  #227 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)V
  #228 = Methodref          #125.#229     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #229 = NameAndType        #5:#230       // "<init>":(I)V
  #230 = Utf8               (I)V
  #231 = Class              #232          // java/lang/StringBuilder
  #232 = Utf8               java/lang/StringBuilder
  #233 = String             #234          // <html><title>Seletor de Idioma</title><body><center>
  #234 = Utf8               <html><title>Seletor de Idioma</title><body><center>
  #235 = Methodref          #231.#62      // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
  #236 = String             #237          // <img src=\"L2UI.SquareGray\" width=280 height=1>
  #237 = Utf8               <img src=\"L2UI.SquareGray\" width=280 height=1>
  #238 = Methodref          #231.#239     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #239 = NameAndType        #240:#241     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #240 = Utf8               append
  #241 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #242 = String             #243          // <table width=280 height=40 bgcolor=000000>
  #243 = Utf8               <table width=280 height=40 bgcolor=000000>
  #244 = String             #245          // <tr><td align=center><font color=LEVEL>Selecione seu Idioma</font></td></tr>
  #245 = Utf8               <tr><td align=center><font color=LEVEL>Selecione seu Idioma</font></td></tr>
  #246 = String             #247          // <tr><td align=center><font color=B09878>Clique na bandeira para escolher o idioma.</font></td></tr>
  #247 = Utf8               <tr><td align=center><font color=B09878>Clique na bandeira para escolher o idioma.</font></td></tr>
  #248 = String             #249          // </table>
  #249 = Utf8               </table>
  #250 = String             #251          // <img src=\"L2UI.SquareGray\" width=280 height=1><br>
  #251 = Utf8               <img src=\"L2UI.SquareGray\" width=280 height=1><br>
  #252 = String             #253          // <table width=280>
  #253 = Utf8               <table width=280>
  #254 = Methodref          #166.#255     // ext/mods/Crypta/DeeplTranslator$Language.values:()[Lext/mods/Crypta/DeeplTranslator$Language;
  #255 = NameAndType        #256:#257     // values:()[Lext/mods/Crypta/DeeplTranslator$Language;
  #256 = Utf8               values
  #257 = Utf8               ()[Lext/mods/Crypta/DeeplTranslator$Language;
  #258 = String             #259          // <tr>
  #259 = Utf8               <tr>
  #260 = String             #261          // <td width=40 align=center><button title=\"
  #261 = Utf8               <td width=40 align=center><button title=\"
  #262 = Methodref          #166.#263     // ext/mods/Crypta/DeeplTranslator$Language.getDisplayName:()Ljava/lang/String;
  #263 = NameAndType        #264:#54      // getDisplayName:()Ljava/lang/String;
  #264 = Utf8               getDisplayName
  #265 = String             #266          // \" action=\"bypass -h _trans set
  #266 = Utf8               \" action=\"bypass -h _trans set
  #267 = Methodref          #166.#268     // ext/mods/Crypta/DeeplTranslator$Language.getCode:()Ljava/lang/String;
  #268 = NameAndType        #269:#54      // getCode:()Ljava/lang/String;
  #269 = Utf8               getCode
  #270 = String             #271          // \" width=25 height=25 back=\"L2butom.
  #271 = Utf8               \" width=25 height=25 back=\"L2butom.
  #272 = String             #273          // \" fore=\"L2butom.
  #273 = Utf8               \" fore=\"L2butom.
  #274 = String             #275          // \"></td>
  #275 = Utf8               \"></td>
  #276 = String             #277          // </tr>
  #277 = Utf8               </tr>
  #278 = String             #279          // <tr><td height=10></td></tr>
  #279 = Utf8               <tr><td height=10></td></tr>
  #280 = String             #281          // </table><br>
  #281 = Utf8               </table><br>
  #282 = String             #283          // </center></body></html>
  #283 = Utf8               </center></body></html>
  #284 = Methodref          #231.#285     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #285 = NameAndType        #286:#54      // toString:()Ljava/lang/String;
  #286 = Utf8               toString
  #287 = String             #288          // language_menu.html
  #288 = Utf8               language_menu.html
  #289 = Methodref          #125.#290     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFromTranslator:(Ljava/lang/Boolean;)V
  #290 = NameAndType        #291:#292     // setFromTranslator:(Ljava/lang/Boolean;)V
  #291 = Utf8               setFromTranslator
  #292 = Utf8               (Ljava/lang/Boolean;)V
  #293 = Methodref          #145.#294     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #294 = NameAndType        #295:#296     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #295 = Utf8               sendPacket
  #296 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #297 = Methodref          #166.#298     // ext/mods/Crypta/DeeplTranslator$Language.fromCode:(Ljava/lang/String;)Ljava/util/Optional;
  #298 = NameAndType        #299:#300     // fromCode:(Ljava/lang/String;)Ljava/util/Optional;
  #299 = Utf8               fromCode
  #300 = Utf8               (Ljava/lang/String;)Ljava/util/Optional;
  #301 = InvokeDynamic      #1:#302       // #1:accept:(Lext/mods/Crypta/DeeplTranslator;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #302 = NameAndType        #303:#304     // accept:(Lext/mods/Crypta/DeeplTranslator;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #303 = Utf8               accept
  #304 = Utf8               (Lext/mods/Crypta/DeeplTranslator;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #305 = Methodref          #306.#307     // java/util/Optional.ifPresent:(Ljava/util/function/Consumer;)V
  #306 = Class              #308          // java/util/Optional
  #307 = NameAndType        #309:#310     // ifPresent:(Ljava/util/function/Consumer;)V
  #308 = Utf8               java/util/Optional
  #309 = Utf8               ifPresent
  #310 = Utf8               (Ljava/util/function/Consumer;)V
  #311 = Methodref          #11.#312      // ext/mods/Crypta/DeeplTranslator.getOriginalRelativeFile:(Ljava/lang/String;)Ljava/lang/String;
  #312 = NameAndType        #313:#135     // getOriginalRelativeFile:(Ljava/lang/String;)Ljava/lang/String;
  #313 = Utf8               getOriginalRelativeFile
  #314 = Methodref          #11.#315      // ext/mods/Crypta/DeeplTranslator.showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)V
  #315 = NameAndType        #316:#317     // showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)V
  #316 = Utf8               showChatWindow
  #317 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)V
  #318 = String             #319          // A tradução não está disponível no momento. Tente novamente mais tarde.
  #319 = Utf8               A tradução não está disponível no momento. Tente novamente mais tarde.
  #320 = Methodref          #145.#321     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #321 = NameAndType        #322:#63      // sendMessage:(Ljava/lang/String;)V
  #322 = Utf8               sendMessage
  #323 = Methodref          #11.#324      // ext/mods/Crypta/DeeplTranslator.showTranslatingWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #324 = NameAndType        #325:#326     // showTranslatingWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #325 = Utf8               showTranslatingWindow
  #326 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #327 = Methodref          #11.#328      // ext/mods/Crypta/DeeplTranslator.translateFile:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/util/concurrent/CompletableFuture;
  #328 = NameAndType        #329:#330     // translateFile:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/util/concurrent/CompletableFuture;
  #329 = Utf8               translateFile
  #330 = Utf8               (Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/util/concurrent/CompletableFuture;
  #331 = InvokeDynamic      #2:#332       // #2:accept:(Lext/mods/Crypta/DeeplTranslator;Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #332 = NameAndType        #303:#333     // accept:(Lext/mods/Crypta/DeeplTranslator;Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #333 = Utf8               (Lext/mods/Crypta/DeeplTranslator;Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #334 = Methodref          #335.#336     // java/util/concurrent/CompletableFuture.thenAccept:(Ljava/util/function/Consumer;)Ljava/util/concurrent/CompletableFuture;
  #335 = Class              #337          // java/util/concurrent/CompletableFuture
  #336 = NameAndType        #338:#339     // thenAccept:(Ljava/util/function/Consumer;)Ljava/util/concurrent/CompletableFuture;
  #337 = Utf8               java/util/concurrent/CompletableFuture
  #338 = Utf8               thenAccept
  #339 = Utf8               (Ljava/util/function/Consumer;)Ljava/util/concurrent/CompletableFuture;
  #340 = Class              #341          // java/util/ArrayList
  #341 = Utf8               java/util/ArrayList
  #342 = Methodref          #340.#3       // java/util/ArrayList."<init>":()V
  #343 = Methodref          #344.#345     // org/jsoup/nodes/Document.body:()Lorg/jsoup/nodes/Element;
  #344 = Class              #346          // org/jsoup/nodes/Document
  #345 = NameAndType        #347:#348     // body:()Lorg/jsoup/nodes/Element;
  #346 = Utf8               org/jsoup/nodes/Document
  #347 = Utf8               body
  #348 = Utf8               ()Lorg/jsoup/nodes/Element;
  #349 = Class              #350          // ext/mods/Crypta/DeeplTranslator$1
  #350 = Utf8               ext/mods/Crypta/DeeplTranslator$1
  #351 = Methodref          #349.#352     // ext/mods/Crypta/DeeplTranslator$1."<init>":(Lext/mods/Crypta/DeeplTranslator;Lext/mods/Crypta/DeeplTranslator;Ljava/util/List;)V
  #352 = NameAndType        #5:#353       // "<init>":(Lext/mods/Crypta/DeeplTranslator;Lext/mods/Crypta/DeeplTranslator;Ljava/util/List;)V
  #353 = Utf8               (Lext/mods/Crypta/DeeplTranslator;Lext/mods/Crypta/DeeplTranslator;Ljava/util/List;)V
  #354 = Methodref          #355.#356     // org/jsoup/nodes/Element.traverse:(Lorg/jsoup/select/NodeVisitor;)Lorg/jsoup/nodes/Element;
  #355 = Class              #357          // org/jsoup/nodes/Element
  #356 = NameAndType        #358:#359     // traverse:(Lorg/jsoup/select/NodeVisitor;)Lorg/jsoup/nodes/Element;
  #357 = Utf8               org/jsoup/nodes/Element
  #358 = Utf8               traverse
  #359 = Utf8               (Lorg/jsoup/select/NodeVisitor;)Lorg/jsoup/nodes/Element;
  #360 = String             #361          // html/
  #361 = Utf8               html/
  #362 = Methodref          #50.#363      // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #363 = NameAndType        #364:#365     // contains:(Ljava/lang/CharSequence;)Z
  #364 = Utf8               contains
  #365 = Utf8               (Ljava/lang/CharSequence;)Z
  #366 = Methodref          #50.#367      // java/lang/String.indexOf:(Ljava/lang/String;)I
  #367 = NameAndType        #368:#369     // indexOf:(Ljava/lang/String;)I
  #368 = Utf8               indexOf
  #369 = Utf8               (Ljava/lang/String;)I
  #370 = Methodref          #50.#371      // java/lang/String.substring:(I)Ljava/lang/String;
  #371 = NameAndType        #372:#373     // substring:(I)Ljava/lang/String;
  #372 = Utf8               substring
  #373 = Utf8               (I)Ljava/lang/String;
  #374 = String             #375          // en-US
  #375 = Utf8               en-US
  #376 = Methodref          #377.#378     // java/util/Locale.forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
  #377 = Class              #379          // java/util/Locale
  #378 = NameAndType        #380:#381     // forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
  #379 = Utf8               java/util/Locale
  #380 = Utf8               forLanguageTag
  #381 = Utf8               (Ljava/lang/String;)Ljava/util/Locale;
  #382 = Methodref          #125.#383     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #383 = NameAndType        #384:#385     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #384 = Utf8               setFile
  #385 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #386 = String             #387          // Failed to read content from file \'{}\', falling back to HtmCache.
  #387 = Utf8               Failed to read content from file \'{}\', falling back to HtmCache.
  #388 = String             #389          // /locale/
  #389 = Utf8               /locale/
  #390 = Methodref          #377.#391     // java/util/Locale.getDefault:()Ljava/util/Locale;
  #391 = NameAndType        #392:#393     // getDefault:()Ljava/util/Locale;
  #392 = Utf8               getDefault
  #393 = Utf8               ()Ljava/util/Locale;
  #394 = InterfaceMethodref #156.#395     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #395 = NameAndType        #396:#397     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #396 = Utf8               get
  #397 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #398 = Methodref          #306.#399     // java/util/Optional.ofNullable:(Ljava/lang/Object;)Ljava/util/Optional;
  #399 = NameAndType        #400:#401     // ofNullable:(Ljava/lang/Object;)Ljava/util/Optional;
  #400 = Utf8               ofNullable
  #401 = Utf8               (Ljava/lang/Object;)Ljava/util/Optional;
  #402 = Methodref          #403.#404     // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #403 = Class              #405          // java/util/Objects
  #404 = NameAndType        #406:#397     // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #405 = Utf8               java/util/Objects
  #406 = Utf8               requireNonNull
  #407 = InvokeDynamic      #3:#408       // #3:accept:(Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)Ljava/util/function/Consumer;
  #408 = NameAndType        #303:#409     // accept:(Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)Ljava/util/function/Consumer;
  #409 = Utf8               (Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)Ljava/util/function/Consumer;
  #410 = String             #411          // <html><head><title>Idiomas</title></head><body>Por favor, aguarde...<br>Traduzindo o texto...</body></html>
  #411 = Utf8               <html><head><title>Idiomas</title></head><body>Por favor, aguarde...<br>Traduzindo o texto...</body></html>
  #412 = String             #413          // translating.html
  #413 = Utf8               translating.html
  #414 = String             #415          // </button>
  #415 = Utf8               </button>
  #416 = String             #417          // </multiedit>
  #417 = Utf8               </multiedit>
  #418 = String             #419          // </combobox>
  #419 = Utf8               </combobox>
  #420 = String             #421          // </edit>
  #421 = Utf8               </edit>
  #422 = Methodref          #50.#423      // java/lang/String.toLowerCase:()Ljava/lang/String;
  #423 = NameAndType        #424:#54      // toLowerCase:()Ljava/lang/String;
  #424 = Utf8               toLowerCase
  #425 = Methodref          #50.#426      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #426 = NameAndType        #427:#428     // equals:(Ljava/lang/Object;)Z
  #427 = Utf8               equals
  #428 = Utf8               (Ljava/lang/Object;)Z
  #429 = Methodref          #50.#430      // java/lang/String.length:()I
  #430 = NameAndType        #431:#149     // length:()I
  #431 = Utf8               length
  #432 = String             #433          // ^%\\w+%$
  #433 = Utf8               ^%\\w+%$
  #434 = Methodref          #50.#435      // java/lang/String.matches:(Ljava/lang/String;)Z
  #435 = NameAndType        #436:#139     // matches:(Ljava/lang/String;)Z
  #436 = Utf8               matches
  #437 = String             #438          // ^<\\w+>%\\w+%</\\w+>$
  #438 = Utf8               ^<\\w+>%\\w+%</\\w+>$
  #439 = Class              #440          // java/util/HashMap
  #440 = Utf8               java/util/HashMap
  #441 = Methodref          #439.#3       // java/util/HashMap."<init>":()V
  #442 = String             #443          // %\\w+%
  #443 = Utf8               %\\w+%
  #444 = Methodref          #445.#446     // java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
  #445 = Class              #447          // java/util/regex/Pattern
  #446 = NameAndType        #448:#449     // compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
  #447 = Utf8               java/util/regex/Pattern
  #448 = Utf8               compile
  #449 = Utf8               (Ljava/lang/String;)Ljava/util/regex/Pattern;
  #450 = Methodref          #445.#451     // java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #451 = NameAndType        #452:#453     // matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #452 = Utf8               matcher
  #453 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #454 = Methodref          #455.#456     // java/util/regex/Matcher.find:()Z
  #455 = Class              #457          // java/util/regex/Matcher
  #456 = NameAndType        #458:#58      // find:()Z
  #457 = Utf8               java/util/regex/Matcher
  #458 = Utf8               find
  #459 = Methodref          #455.#460     // java/util/regex/Matcher.group:()Ljava/lang/String;
  #460 = NameAndType        #461:#54      // group:()Ljava/lang/String;
  #461 = Utf8               group
  #462 = InvokeDynamic      #4:#463       // #4:makeConcatWithConstants:(I)Ljava/lang/String;
  #463 = NameAndType        #464:#373     // makeConcatWithConstants:(I)Ljava/lang/String;
  #464 = Utf8               makeConcatWithConstants
  #465 = Methodref          #50.#466      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #466 = NameAndType        #177:#467     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #467 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #468 = InterfaceMethodref #156.#56      // java/util/Map.isEmpty:()Z
  #469 = InterfaceMethodref #156.#470     // java/util/Map.entrySet:()Ljava/util/Set;
  #470 = NameAndType        #471:#472     // entrySet:()Ljava/util/Set;
  #471 = Utf8               entrySet
  #472 = Utf8               ()Ljava/util/Set;
  #473 = InterfaceMethodref #474.#475     // java/util/Set.iterator:()Ljava/util/Iterator;
  #474 = Class              #476          // java/util/Set
  #475 = NameAndType        #477:#478     // iterator:()Ljava/util/Iterator;
  #476 = Utf8               java/util/Set
  #477 = Utf8               iterator
  #478 = Utf8               ()Ljava/util/Iterator;
  #479 = InterfaceMethodref #480.#481     // java/util/Iterator.hasNext:()Z
  #480 = Class              #482          // java/util/Iterator
  #481 = NameAndType        #483:#58      // hasNext:()Z
  #482 = Utf8               java/util/Iterator
  #483 = Utf8               hasNext
  #484 = InterfaceMethodref #480.#485     // java/util/Iterator.next:()Ljava/lang/Object;
  #485 = NameAndType        #486:#487     // next:()Ljava/lang/Object;
  #486 = Utf8               next
  #487 = Utf8               ()Ljava/lang/Object;
  #488 = Class              #489          // java/util/Map$Entry
  #489 = Utf8               java/util/Map$Entry
  #490 = InterfaceMethodref #488.#491     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #491 = NameAndType        #492:#487     // getKey:()Ljava/lang/Object;
  #492 = Utf8               getKey
  #493 = Class              #494          // java/lang/CharSequence
  #494 = Utf8               java/lang/CharSequence
  #495 = InterfaceMethodref #488.#496     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #496 = NameAndType        #497:#487     // getValue:()Ljava/lang/Object;
  #497 = Utf8               getValue
  #498 = InterfaceMethodref #156.#499     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #499 = NameAndType        #500:#397     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #500 = Utf8               remove
  #501 = String             #502          //
  #502 = Utf8
  #503 = Methodref          #50.#504      // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #504 = NameAndType        #505:#139     // startsWith:(Ljava/lang/String;)Z
  #505 = Utf8               startsWith
  #506 = InvokeDynamic      #5:#507       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #507 = NameAndType        #464:#135     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #508 = String             #509          // data/locale/en_US/html/
  #509 = Utf8               data/locale/en_US/html/
  #510 = InvokeDynamic      #6:#507       // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #511 = String             #512          // data/html/
  #512 = Utf8               data/html/
  #513 = String             #514          // /locale/[^/]+/
  #514 = Utf8               /locale/[^/]+/
  #515 = InvokeDynamic      #7:#507       // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #516 = Methodref          #50.#517      // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #517 = NameAndType        #518:#519     // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #518 = Utf8               replaceAll
  #519 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #520 = InvokeDynamic      #8:#521       // #8:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #521 = NameAndType        #464:#519     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #522 = Methodref          #50.#523      // java/lang/String.hashCode:()I
  #523 = NameAndType        #524:#149     // hashCode:()I
  #524 = Utf8               hashCode
  #525 = String             #526          // en_US
  #526 = Utf8               en_US
  #527 = String             #528          // pt-BR
  #528 = Utf8               pt-BR
  #529 = String             #530          // ru_RU
  #530 = Utf8               ru_RU
  #531 = String             #532          // en
  #532 = Utf8               en
  #533 = String             #534          // ru
  #534 = Utf8               ru
  #535 = Fieldref           #44.#536      // ext/mods/Config.DO_NOT_TRANSLATE:Ljava/util/List;
  #536 = NameAndType        #537:#538     // DO_NOT_TRANSLATE:Ljava/util/List;
  #537 = Utf8               DO_NOT_TRANSLATE
  #538 = Utf8               Ljava/util/List;
  #539 = InterfaceMethodref #540.#56      // java/util/List.isEmpty:()Z
  #540 = Class              #541          // java/util/List
  #541 = Utf8               java/util/List
  #542 = InterfaceMethodref #540.#543     // java/util/List.stream:()Ljava/util/stream/Stream;
  #543 = NameAndType        #544:#545     // stream:()Ljava/util/stream/Stream;
  #544 = Utf8               stream
  #545 = Utf8               ()Ljava/util/stream/Stream;
  #546 = InvokeDynamic      #9:#547       // #9:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #547 = NameAndType        #548:#549     // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #548 = Utf8               test
  #549 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #550 = InterfaceMethodref #551.#552     // java/util/stream/Stream.noneMatch:(Ljava/util/function/Predicate;)Z
  #551 = Class              #553          // java/util/stream/Stream
  #552 = NameAndType        #554:#555     // noneMatch:(Ljava/util/function/Predicate;)Z
  #553 = Utf8               java/util/stream/Stream
  #554 = Utf8               noneMatch
  #555 = Utf8               (Ljava/util/function/Predicate;)Z
  #556 = Fieldref           #166.#557     // ext/mods/Crypta/DeeplTranslator$Language.ENGLISH:Lext/mods/Crypta/DeeplTranslator$Language;
  #557 = NameAndType        #558:#559     // ENGLISH:Lext/mods/Crypta/DeeplTranslator$Language;
  #558 = Utf8               ENGLISH
  #559 = Utf8               Lext/mods/Crypta/DeeplTranslator$Language;
  #560 = InterfaceMethodref #156.#561     // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #561 = NameAndType        #562:#160     // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #562 = Utf8               getOrDefault
  #563 = Fieldref           #564.#565     // ext/mods/Crypta/DeeplTranslator$SingletonHolder.INSTANCE:Lext/mods/Crypta/DeeplTranslator;
  #564 = Class              #566          // ext/mods/Crypta/DeeplTranslator$SingletonHolder
  #565 = NameAndType        #567:#568     // INSTANCE:Lext/mods/Crypta/DeeplTranslator;
  #566 = Utf8               ext/mods/Crypta/DeeplTranslator$SingletonHolder
  #567 = Utf8               INSTANCE
  #568 = Utf8               Lext/mods/Crypta/DeeplTranslator;
  #569 = InvokeDynamic      #10:#570      // #10:get:(Lext/mods/Crypta/DeeplTranslator;Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/util/function/Supplier;
  #570 = NameAndType        #396:#571     // get:(Lext/mods/Crypta/DeeplTranslator;Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/util/function/Supplier;
  #571 = Utf8               (Lext/mods/Crypta/DeeplTranslator;Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/util/function/Supplier;
  #572 = Methodref          #335.#573     // java/util/concurrent/CompletableFuture.supplyAsync:(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;
  #573 = NameAndType        #574:#575     // supplyAsync:(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;
  #574 = Utf8               supplyAsync
  #575 = Utf8               (Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;
  #576 = InvokeDynamic      #11:#570      // #11:get:(Lext/mods/Crypta/DeeplTranslator;Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/util/function/Supplier;
  #577 = Methodref          #11.#578      // ext/mods/Crypta/DeeplTranslator.reload:()V
  #578 = NameAndType        #579:#6       // reload:()V
  #579 = Utf8               reload
  #580 = Methodref          #11.#581      // ext/mods/Crypta/DeeplTranslator.mapLanguageCodeForDeepL:(Ljava/lang/String;)Ljava/lang/String;
  #581 = NameAndType        #582:#135     // mapLanguageCodeForDeepL:(Ljava/lang/String;)Ljava/lang/String;
  #582 = Utf8               mapLanguageCodeForDeepL
  #583 = InterfaceMethodref #540.#584     // java/util/List.of:(Ljava/lang/Object;)Ljava/util/List;
  #584 = NameAndType        #187:#585     // of:(Ljava/lang/Object;)Ljava/util/List;
  #585 = Utf8               (Ljava/lang/Object;)Ljava/util/List;
  #586 = Methodref          #88.#587      // com/deepl/api/Translator.translateText:(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/deepl/api/TextTranslationOptions;)Ljava/util/List;
  #587 = NameAndType        #588:#589     // translateText:(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/deepl/api/TextTranslationOptions;)Ljava/util/List;
  #588 = Utf8               translateText
  #589 = Utf8               (Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/deepl/api/TextTranslationOptions;)Ljava/util/List;
  #590 = InterfaceMethodref #540.#591     // java/util/List.get:(I)Ljava/lang/Object;
  #591 = NameAndType        #396:#592     // get:(I)Ljava/lang/Object;
  #592 = Utf8               (I)Ljava/lang/Object;
  #593 = Class              #594          // com/deepl/api/TextResult
  #594 = Utf8               com/deepl/api/TextResult
  #595 = Methodref          #593.#596     // com/deepl/api/TextResult.getText:()Ljava/lang/String;
  #596 = NameAndType        #597:#54      // getText:()Ljava/lang/String;
  #597 = Utf8               getText
  #598 = Class              #599          // com/deepl/api/QuotaExceededException
  #599 = Utf8               com/deepl/api/QuotaExceededException
  #600 = String             #601          // DeepL usage limit has been reached.
  #601 = Utf8               DeepL usage limit has been reached.
  #602 = Methodref          #111.#603     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #603 = NameAndType        #604:#123     // warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #604 = Utf8               warn
  #605 = Class              #606          // com/deepl/api/DeepLException
  #606 = Utf8               com/deepl/api/DeepLException
  #607 = String             #608          // Failed to translate text to {}.
  #608 = Utf8               Failed to translate text to {}.
  #609 = String             #610          // Unexpected error translating text.
  #610 = Utf8               Unexpected error translating text.
  #611 = String             #612          // Translation requested but translator is not available - API key not configured.
  #612 = Utf8               Translation requested but translator is not available - API key not configured.
  #613 = Methodref          #111.#614     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #614 = NameAndType        #604:#615     // warn:(Ljava/lang/Object;)V
  #615 = Utf8               (Ljava/lang/Object;)V
  #616 = Methodref          #617.#618     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #617 = Class              #619          // ext/mods/gameserver/data/HTMLData
  #618 = NameAndType        #620:#621     // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #619 = Utf8               ext/mods/gameserver/data/HTMLData
  #620 = Utf8               getInstance
  #621 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #622 = Methodref          #617.#623     // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #623 = NameAndType        #624:#625     // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #624 = Utf8               getHtm
  #625 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #626 = String             #627          // Could not read HTML content for file: {}
  #627 = Utf8               Could not read HTML content for file: {}
  #628 = Methodref          #111.#629     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #629 = NameAndType        #604:#115     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #630 = String             #631          // <br1>
  #631 = Utf8               <br1>
  #632 = String             #633          // <br>
  #633 = Utf8               <br>
  #634 = Methodref          #635.#636     // org/jsoup/Jsoup.parse:(Ljava/lang/String;)Lorg/jsoup/nodes/Document;
  #635 = Class              #637          // org/jsoup/Jsoup
  #636 = NameAndType        #638:#639     // parse:(Ljava/lang/String;)Lorg/jsoup/nodes/Document;
  #637 = Utf8               org/jsoup/Jsoup
  #638 = Utf8               parse
  #639 = Utf8               (Ljava/lang/String;)Lorg/jsoup/nodes/Document;
  #640 = Methodref          #344.#641     // org/jsoup/nodes/Document.head:()Lorg/jsoup/nodes/Element;
  #641 = NameAndType        #642:#348     // head:()Lorg/jsoup/nodes/Element;
  #642 = Utf8               head
  #643 = String             #644          // <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">
  #644 = Utf8               <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">
  #645 = Methodref          #355.#646     // org/jsoup/nodes/Element.append:(Ljava/lang/String;)Lorg/jsoup/nodes/Element;
  #646 = NameAndType        #240:#647     // append:(Ljava/lang/String;)Lorg/jsoup/nodes/Element;
  #647 = Utf8               (Ljava/lang/String;)Lorg/jsoup/nodes/Element;
  #648 = Methodref          #11.#649      // ext/mods/Crypta/DeeplTranslator.extractTextNodesForTranslation:(Lorg/jsoup/nodes/Document;)Ljava/util/List;
  #649 = NameAndType        #650:#651     // extractTextNodesForTranslation:(Lorg/jsoup/nodes/Document;)Ljava/util/List;
  #650 = Utf8               extractTextNodesForTranslation
  #651 = Utf8               (Lorg/jsoup/nodes/Document;)Ljava/util/List;
  #652 = InterfaceMethodref #184.#653     // java/nio/file/Path.getParent:()Ljava/nio/file/Path;
  #653 = NameAndType        #654:#655     // getParent:()Ljava/nio/file/Path;
  #654 = Utf8               getParent
  #655 = Utf8               ()Ljava/nio/file/Path;
  #656 = Class              #657          // java/nio/file/attribute/FileAttribute
  #657 = Utf8               java/nio/file/attribute/FileAttribute
  #658 = Methodref          #192.#659     // java/nio/file/Files.createDirectories:(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
  #659 = NameAndType        #660:#661     // createDirectories:(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
  #660 = Utf8               createDirectories
  #661 = Utf8               (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
  #662 = Methodref          #344.#663     // org/jsoup/nodes/Document.outerHtml:()Ljava/lang/String;
  #663 = NameAndType        #664:#54      // outerHtml:()Ljava/lang/String;
  #664 = Utf8               outerHtml
  #665 = Class              #666          // java/nio/file/OpenOption
  #666 = Utf8               java/nio/file/OpenOption
  #667 = Methodref          #192.#668     // java/nio/file/Files.writeString:(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
  #668 = NameAndType        #669:#670     // writeString:(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
  #669 = Utf8               writeString
  #670 = Utf8               (Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
  #671 = InterfaceMethodref #540.#475     // java/util/List.iterator:()Ljava/util/Iterator;
  #672 = Class              #673          // org/jsoup/nodes/TextNode
  #673 = Utf8               org/jsoup/nodes/TextNode
  #674 = Methodref          #672.#675     // org/jsoup/nodes/TextNode.text:()Ljava/lang/String;
  #675 = NameAndType        #676:#54      // text:()Ljava/lang/String;
  #676 = Utf8               text
  #677 = InterfaceMethodref #540.#678     // java/util/List.add:(Ljava/lang/Object;)Z
  #678 = NameAndType        #679:#428     // add:(Ljava/lang/Object;)Z
  #679 = Utf8               add
  #680 = Methodref          #11.#681      // ext/mods/Crypta/DeeplTranslator.removePlaceholdersForTranslation:(Ljava/lang/String;)Ljava/lang/String;
  #681 = NameAndType        #682:#135     // removePlaceholdersForTranslation:(Ljava/lang/String;)Ljava/lang/String;
  #682 = Utf8               removePlaceholdersForTranslation
  #683 = InterfaceMethodref #540.#684     // java/util/List.size:()I
  #684 = NameAndType        #685:#149     // size:()I
  #685 = Utf8               size
  #686 = String             #687          // Mismatch between original text count ({}) and translated text count ({}) for file \'{}\'.
  #687 = Utf8               Mismatch between original text count ({}) and translated text count ({}) for file \'{}\'.
  #688 = Methodref          #111.#689     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #689 = NameAndType        #122:#115     // error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #690 = Methodref          #11.#691      // ext/mods/Crypta/DeeplTranslator.restorePlaceholdersAfterTranslation:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #691 = NameAndType        #692:#519     // restorePlaceholdersAfterTranslation:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #692 = Utf8               restorePlaceholdersAfterTranslation
  #693 = Methodref          #672.#694     // org/jsoup/nodes/TextNode.text:(Ljava/lang/String;)Lorg/jsoup/nodes/TextNode;
  #694 = NameAndType        #676:#695     // text:(Ljava/lang/String;)Lorg/jsoup/nodes/TextNode;
  #695 = Utf8               (Ljava/lang/String;)Lorg/jsoup/nodes/TextNode;
  #696 = Methodref          #11.#697      // ext/mods/Crypta/DeeplTranslator.removeClosingTags:(Ljava/lang/String;)Ljava/lang/String;
  #697 = NameAndType        #698:#135     // removeClosingTags:(Ljava/lang/String;)Ljava/lang/String;
  #698 = Utf8               removeClosingTags
  #699 = String             #700          // Failed to translate file \'{}\' to {}.
  #700 = Utf8               Failed to translate file \'{}\' to {}.
  #701 = String             #702          // Failed to write translated file for \'{}\'.
  #702 = Utf8               Failed to write translated file for \'{}\'.
  #703 = Methodref          #116.#704     // java/lang/Exception.printStackTrace:()V
  #704 = NameAndType        #705:#6       // printStackTrace:()V
  #705 = Utf8               printStackTrace
  #706 = String             #707          // An unexpected error occurred during translation of \'{}\'.
  #707 = Utf8               An unexpected error occurred during translation of \'{}\'.
  #708 = Methodref          #105.#709     // java/lang/Boolean.booleanValue:()Z
  #709 = NameAndType        #710:#58      // booleanValue:()Z
  #710 = Utf8               booleanValue
  #711 = String             #712          // Ocorreu um erro ao traduzir. Por favor, tente novamente.
  #712 = Utf8               Ocorreu um erro ao traduzir. Por favor, tente novamente.
  #713 = InvokeDynamic      #12:#507      // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #714 = String             #715          // AVISO: Chave da API DeepL não configurada. Configure em game/config/translator.properties
  #715 = Utf8               AVISO: Chave da API DeepL não configurada. Configure em game/config/translator.properties
  #716 = Methodref          #11.#717      // ext/mods/Crypta/DeeplTranslator.showLanguageMenu:(Lext/mods/gameserver/model/actor/Player;)V
  #717 = NameAndType        #718:#326     // showLanguageMenu:(Lext/mods/gameserver/model/actor/Player;)V
  #718 = Utf8               showLanguageMenu
  #719 = Methodref          #720.#721     // java/lang/Class.getName:()Ljava/lang/String;
  #720 = Class              #722          // java/lang/Class
  #721 = NameAndType        #723:#54      // getName:()Ljava/lang/String;
  #722 = Utf8               java/lang/Class
  #723 = Utf8               getName
  #724 = Methodref          #111.#62      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #725 = Utf8               HTML_ROOT_PATH
  #726 = Utf8               ConstantValue
  #727 = Utf8               LOCALE_BASE_PATH
  #728 = String             #729          // data/locale/
  #729 = Utf8               data/locale/
  #730 = Utf8               MENU_BYPASS
  #731 = Utf8               Signature
  #732 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;>;
  #733 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/Crypta/DeeplTranslator$Language;>;
  #734 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;>;
  #735 = Utf8               Code
  #736 = Utf8               LineNumberTable
  #737 = Utf8               LocalVariableTable
  #738 = Utf8               this
  #739 = Utf8               isTranslatorAvailable
  #740 = Utf8               StackMapTable
  #741 = Utf8               e
  #742 = Utf8               Ljava/lang/Exception;
  #743 = Utf8               handlePacket
  #744 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)Z
  #745 = Utf8               content
  #746 = Utf8               Ljava/io/IOException;
  #747 = Utf8               translatedPath
  #748 = Utf8               Ljava/nio/file/Path;
  #749 = Utf8               player
  #750 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #751 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #752 = Utf8               originalFile
  #753 = Utf8               normalizedFile
  #754 = Utf8               playerLang
  #755 = Utf8               lang
  #756 = Utf8               maxCols
  #757 = Utf8               I
  #758 = Utf8               sb
  #759 = Utf8               Ljava/lang/StringBuilder;
  #760 = Utf8               currentCol
  #761 = Class              #762          // "[Lext/mods/Crypta/DeeplTranslator$Language;"
  #762 = Utf8               [Lext/mods/Crypta/DeeplTranslator$Language;
  #763 = Utf8               setPlayerLanguage
  #764 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #765 = Utf8               langCode
  #766 = Utf8               file
  #767 = Utf8               targetLang
  #768 = Utf8               doc
  #769 = Utf8               Lorg/jsoup/nodes/Document;
  #770 = Utf8               textNodes
  #771 = Utf8               self
  #772 = Utf8               LocalVariableTypeTable
  #773 = Utf8               Ljava/util/List<Lorg/jsoup/nodes/TextNode;>;
  #774 = Utf8               (Lorg/jsoup/nodes/Document;)Ljava/util/List<Lorg/jsoup/nodes/TextNode;>;
  #775 = Utf8               htmlIndex
  #776 = Utf8               defaultLocale
  #777 = Utf8               Ljava/util/Locale;
  #778 = Utf8               relativeFile
  #779 = Utf8               containsClosingTags
  #780 = Utf8               tag
  #781 = Utf8               forbiddenClosingTags
  #782 = Utf8               [Ljava/lang/String;
  #783 = Utf8               trimmedText
  #784 = Utf8               lowerText
  #785 = Class              #782          // "[Ljava/lang/String;"
  #786 = Utf8               isOnlyPlaceholder
  #787 = Utf8               placeholder
  #788 = Utf8               tempMarker
  #789 = Utf8               placeholderMap
  #790 = Utf8               result
  #791 = Utf8               counter
  #792 = Utf8               pattern
  #793 = Utf8               Ljava/util/regex/Pattern;
  #794 = Utf8               Ljava/util/regex/Matcher;
  #795 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #796 = Utf8               entry
  #797 = Utf8               Ljava/util/Map$Entry;
  #798 = Utf8               translatedText
  #799 = Utf8               originalText
  #800 = Utf8               Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;
  #801 = Utf8               count
  #802 = Utf8               closingTagsToRemove
  #803 = Utf8               totalRemoved
  #804 = Utf8               fileName
  #805 = Utf8               fullPath
  #806 = Utf8               currentFile
  #807 = Utf8               relativePath
  #808 = Utf8               languageCode
  #809 = Utf8               notInExclusionList
  #810 = Utf8               originalExists
  #811 = Utf8               ()Lext/mods/Crypta/DeeplTranslator;
  #812 = Utf8               htmlFile
  #813 = Utf8               (Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/util/concurrent/CompletableFuture<Ljava/lang/Boolean;>;
  #814 = Utf8               (Lext/mods/Crypta/DeeplTranslator$Language;Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;
  #815 = Utf8               (Lext/mods/Crypta/DeeplTranslator$Language;Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture<Ljava/lang/String;>;
  #816 = Utf8               lambda$translateText$0
  #817 = Utf8               sourceLang
  #818 = Utf8               targetLangCode
  #819 = Utf8               translationResults
  #820 = Utf8               Lcom/deepl/api/QuotaExceededException;
  #821 = Utf8               Lcom/deepl/api/DeepLException;
  #822 = Utf8               Ljava/util/List<Lcom/deepl/api/TextResult;>;
  #823 = Utf8               lambda$translateFile$0
  #824 = Utf8               (Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/lang/Boolean;
  #825 = Utf8               fallbackHtmlData
  #826 = Utf8               Lext/mods/gameserver/data/HTMLData;
  #827 = Utf8               textForTranslation
  #828 = Utf8               textNode
  #829 = Utf8               Lorg/jsoup/nodes/TextNode;
  #830 = Utf8               i$
  #831 = Utf8               Ljava/util/Iterator;
  #832 = Utf8               node
  #833 = Utf8               finalTranslatedText
  #834 = Utf8               i
  #835 = Utf8               outputPath
  #836 = Utf8               htmlData
  #837 = Utf8               htmContent
  #838 = Utf8               nodesToTranslate
  #839 = Utf8               originalTexts
  #840 = Utf8               textsForTranslation
  #841 = Utf8               translatedHtml
  #842 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #843 = Utf8               lambda$isTranslatable$0
  #844 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Z
  #845 = Utf8               exclusionPath
  #846 = Utf8               lambda$asyncTranslate$0
  #847 = Utf8               (Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;)V
  #848 = Utf8               success
  #849 = Utf8               Ljava/lang/Boolean;
  #850 = Utf8               lambda$setPlayerLanguage$0
  #851 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/Crypta/DeeplTranslator$Language;)V
  #852 = Utf8               <clinit>
  #853 = Utf8               SourceFile
  #854 = Utf8               DeeplTranslator.java
  #855 = Utf8               NestMembers
  #856 = Utf8               BootstrapMethods
  #857 = MethodType         #6            //  ()V
  #858 = MethodHandle       5:#577        // REF_invokeVirtual ext/mods/Crypta/DeeplTranslator.reload:()V
  #859 = MethodType         #615          //  (Ljava/lang/Object;)V
  #860 = MethodHandle       5:#861        // REF_invokeVirtual ext/mods/Crypta/DeeplTranslator.lambda$setPlayerLanguage$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/Crypta/DeeplTranslator$Language;)V
  #861 = Methodref          #11.#862      // ext/mods/Crypta/DeeplTranslator.lambda$setPlayerLanguage$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/Crypta/DeeplTranslator$Language;)V
  #862 = NameAndType        #850:#851     // lambda$setPlayerLanguage$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/Crypta/DeeplTranslator$Language;)V
  #863 = MethodType         #864          //  (Lext/mods/Crypta/DeeplTranslator$Language;)V
  #864 = Utf8               (Lext/mods/Crypta/DeeplTranslator$Language;)V
  #865 = MethodHandle       5:#866        // REF_invokeVirtual ext/mods/Crypta/DeeplTranslator.lambda$asyncTranslate$0:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;)V
  #866 = Methodref          #11.#867      // ext/mods/Crypta/DeeplTranslator.lambda$asyncTranslate$0:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;)V
  #867 = NameAndType        #846:#847     // lambda$asyncTranslate$0:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;)V
  #868 = MethodType         #292          //  (Ljava/lang/Boolean;)V
  #869 = MethodHandle       5:#210        // REF_invokeVirtual ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.applyReplaces:(Ljava/util/Map;)V
  #870 = MethodType         #213          //  (Ljava/util/Map;)V
  #871 = String             #872          // PLACEHOLDER_\u0001_MARKER
  #872 = Utf8               PLACEHOLDER_\u0001_MARKER
  #873 = String             #874          // data/locale/en_US/html/\u0001
  #874 = Utf8               data/locale/en_US/html/\u0001
  #875 = String             #876          // html/\u0001
  #876 = Utf8               html/\u0001
  #877 = String             #878          // /locale/\u0001/
  #878 = Utf8               /locale/\u0001/
  #879 = String             #880          // data/locale/\u0001/html/\u0001
  #880 = Utf8               data/locale/\u0001/html/\u0001
  #881 = MethodType         #428          //  (Ljava/lang/Object;)Z
  #882 = MethodHandle       6:#883        // REF_invokeStatic ext/mods/Crypta/DeeplTranslator.lambda$isTranslatable$0:(Ljava/lang/String;Ljava/lang/String;)Z
  #883 = Methodref          #11.#884      // ext/mods/Crypta/DeeplTranslator.lambda$isTranslatable$0:(Ljava/lang/String;Ljava/lang/String;)Z
  #884 = NameAndType        #843:#844     // lambda$isTranslatable$0:(Ljava/lang/String;Ljava/lang/String;)Z
  #885 = MethodType         #139          //  (Ljava/lang/String;)Z
  #886 = MethodType         #487          //  ()Ljava/lang/Object;
  #887 = MethodHandle       5:#888        // REF_invokeVirtual ext/mods/Crypta/DeeplTranslator.lambda$translateFile$0:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/lang/Boolean;
  #888 = Methodref          #11.#889      // ext/mods/Crypta/DeeplTranslator.lambda$translateFile$0:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/lang/Boolean;
  #889 = NameAndType        #823:#824     // lambda$translateFile$0:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/lang/Boolean;
  #890 = MethodType         #891          //  ()Ljava/lang/Boolean;
  #891 = Utf8               ()Ljava/lang/Boolean;
  #892 = MethodHandle       5:#893        // REF_invokeVirtual ext/mods/Crypta/DeeplTranslator.lambda$translateText$0:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/lang/String;
  #893 = Methodref          #11.#894      // ext/mods/Crypta/DeeplTranslator.lambda$translateText$0:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/lang/String;
  #894 = NameAndType        #816:#182     // lambda$translateText$0:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/lang/String;
  #895 = MethodType         #54           //  ()Ljava/lang/String;
  #896 = String             #897          // Idioma alterado para \u0001.
  #897 = Utf8               Idioma alterado para \u0001.
  #898 = MethodHandle       6:#899        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #899 = Methodref          #900.#901     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #900 = Class              #902          // java/lang/invoke/LambdaMetafactory
  #901 = NameAndType        #903:#904     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #902 = Utf8               java/lang/invoke/LambdaMetafactory
  #903 = Utf8               metafactory
  #904 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #905 = MethodHandle       6:#906        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #906 = Methodref          #907.#908     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #907 = Class              #909          // java/lang/invoke/StringConcatFactory
  #908 = NameAndType        #464:#910     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #909 = Utf8               java/lang/invoke/StringConcatFactory
  #910 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #911 = Utf8               InnerClasses
  #912 = Utf8               Language
  #913 = Utf8               Entry
  #914 = Utf8               SingletonHolder
  #915 = Class              #916          // java/lang/invoke/MethodHandles$Lookup
  #916 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #917 = Class              #918          // java/lang/invoke/MethodHandles
  #918 = Utf8               java/lang/invoke/MethodHandles
  #919 = Utf8               Lookup
{
  public void asyncReload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #29,  0             // InvokeDynamic #0:run:(Lext/mods/Crypta/DeeplTranslator;)Ljava/lang/Runnable;
         6: invokestatic  #33                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
         9: return
      LineNumberTable:
        line 119: 0
        line 120: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/Crypta/DeeplTranslator;

  public boolean isTranslatorAvailable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _translator:Lcom/deepl/api/Translator;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 127: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/Crypta/DeeplTranslator;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean handlePacket(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.network.serverpackets.NpcHtmlMessage);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=9, args_size=3
         0: aload_2
         1: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.getFileName:()Ljava/lang/String;
         4: astore_3
         5: aload_3
         6: ifnull        26
         9: aload_3
        10: invokevirtual #49                 // Method java/lang/String.trim:()Ljava/lang/String;
        13: invokevirtual #55                 // Method java/lang/String.isEmpty:()Z
        16: ifne          26
        19: aload_2
        20: invokevirtual #129                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.isFromTranslator:()Z
        23: ifeq          28
        26: iconst_1
        27: ireturn
        28: aload_0
        29: aload_3
        30: invokevirtual #132                // Method normalizeFilePath:(Ljava/lang/String;)Ljava/lang/String;
        33: astore        4
        35: aload         4
        37: ifnonnull     42
        40: iconst_1
        41: ireturn
        42: aload         4
        44: invokestatic  #136                // Method isTranslatable:(Ljava/lang/String;)Z
        47: istore        5
        49: iload         5
        51: ifeq          82
        54: aload_2
        55: invokevirtual #140                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.getReplaces:()Ljava/util/Map;
        58: ifnull        82
        61: aload_0
        62: getfield      #10                 // Field _playerReplaces:Ljava/util/Map;
        65: aload_1
        66: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        69: invokestatic  #150                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        72: aload_2
        73: invokevirtual #140                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.getReplaces:()Ljava/util/Map;
        76: invokeinterface #155,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        81: pop
        82: aload_0
        83: aload_1
        84: invokevirtual #161                // Method getPlayerLanguage:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/Crypta/DeeplTranslator$Language;
        87: astore        6
        89: aload         6
        91: invokevirtual #165                // Method ext/mods/Crypta/DeeplTranslator$Language.isOriginal:()Z
        94: ifeq          117
        97: aload_2
        98: aload_3
        99: invokevirtual #170                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFileName:(Ljava/lang/String;)V
       102: iload         5
       104: ifeq          115
       107: aload_2
       108: ldc           #173                // String </body>
       110: ldc           #173                // String </body>
       112: invokevirtual #175                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       115: iconst_1
       116: ireturn
       117: iload         5
       119: ifeq          246
       122: aload         4
       124: aload         6
       126: invokestatic  #179                // Method getTranslatedPath:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/lang/String;
       129: iconst_0
       130: anewarray     #50                 // class java/lang/String
       133: invokestatic  #183                // InterfaceMethod java/nio/file/Path.of:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
       136: astore        7
       138: aload         7
       140: iconst_0
       141: anewarray     #189                // class java/nio/file/LinkOption
       144: invokestatic  #191                // Method java/nio/file/Files.exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
       147: ifeq          208
       150: aload         7
       152: getstatic     #197                // Field java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
       155: invokestatic  #203                // Method java/nio/file/Files.readString:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
       158: astore        8
       160: aload_2
       161: aload         8
       163: invokevirtual #207                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       166: aload_2
       167: aload_2
       168: invokevirtual #140                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.getReplaces:()Ljava/util/Map;
       171: invokevirtual #210                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.applyReplaces:(Ljava/util/Map;)V
       174: goto          243
       177: astore        8
       179: getstatic     #98                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       182: ldc           #216                // String Failed to read translated file \'{}\'.
       184: aload         8
       186: iconst_1
       187: anewarray     #2                  // class java/lang/Object
       190: dup
       191: iconst_0
       192: aload         7
       194: aastore
       195: invokevirtual #218                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       198: aload_2
       199: ldc           #173                // String </body>
       201: ldc           #173                // String </body>
       203: invokevirtual #175                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       206: iconst_1
       207: ireturn
       208: aload_0
       209: invokevirtual #221                // Method accountLimitReached:()Z
       212: ifne          233
       215: aload_0
       216: getfield      #39                 // Field _translator:Lcom/deepl/api/Translator;
       219: ifnull        233
       222: aload_0
       223: aload_1
       224: aload         4
       226: aload         6
       228: invokevirtual #224                // Method asyncTranslate:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)V
       231: iconst_0
       232: ireturn
       233: aload_2
       234: ldc           #173                // String </body>
       236: ldc           #173                // String </body>
       238: invokevirtual #175                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       241: iconst_1
       242: ireturn
       243: goto          254
       246: aload_2
       247: ldc           #173                // String </body>
       249: ldc           #173                // String </body>
       251: invokevirtual #175                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       254: aload_2
       255: ldc           #173                // String </body>
       257: ldc           #173                // String </body>
       259: invokevirtual #175                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       262: iconst_1
       263: ireturn
      Exception table:
         from    to  target type
           150   174   177   Class java/io/IOException
      LineNumberTable:
        line 154: 0
        line 156: 5
        line 157: 26
        line 160: 28
        line 162: 35
        line 163: 40
        line 166: 42
        line 168: 49
        line 169: 61
        line 172: 82
        line 174: 89
        line 175: 97
        line 176: 102
        line 177: 107
        line 179: 115
        line 182: 117
        line 183: 122
        line 185: 138
        line 187: 150
        line 188: 160
        line 189: 166
        line 194: 174
        line 190: 177
        line 191: 179
        line 192: 198
        line 193: 206
        line 197: 208
        line 198: 222
        line 199: 231
        line 201: 233
        line 202: 241
        line 205: 243
        line 206: 246
        line 209: 254
        line 210: 262
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          160      14     8 content   Ljava/lang/String;
          179      29     8     e   Ljava/io/IOException;
          138     105     7 translatedPath   Ljava/nio/file/Path;
            0     264     0  this   Lext/mods/Crypta/DeeplTranslator;
            0     264     1 player   Lext/mods/gameserver/model/actor/Player;
            0     264     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            5     259     3 originalFile   Ljava/lang/String;
           35     229     4 normalizedFile   Ljava/lang/String;
           49     215     5 isTranslatable   Z
           89     175     6 playerLang   Lext/mods/Crypta/DeeplTranslator$Language;
      StackMapTable: number_of_entries = 12
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class java/lang/String ]
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/Crypta/DeeplTranslator$Language ]
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 59
          locals = [ class ext/mods/Crypta/DeeplTranslator, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String, int, class ext/mods/Crypta/DeeplTranslator$Language, class java/nio/file/Path ]
          stack = [ class java/io/IOException ]
        frame_type = 30 /* same */
        frame_type = 24 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 2 /* same */
        frame_type = 7 /* same */

  public void showLanguageMenu(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=10, args_size=2
         0: new           #125                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: iconst_0
         5: invokespecial #228                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
         8: astore_2
         9: bipush        6
        11: istore_3
        12: new           #231                // class java/lang/StringBuilder
        15: dup
        16: ldc           #233                // String <html><title>Seletor de Idioma</title><body><center>
        18: invokespecial #235                // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
        21: astore        4
        23: aload         4
        25: ldc           #236                // String <img src=\"L2UI.SquareGray\" width=280 height=1>
        27: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        30: pop
        31: aload         4
        33: ldc           #242                // String <table width=280 height=40 bgcolor=000000>
        35: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        38: pop
        39: aload         4
        41: ldc           #244                // String <tr><td align=center><font color=LEVEL>Selecione seu Idioma</font></td></tr>
        43: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        46: pop
        47: aload         4
        49: ldc           #246                // String <tr><td align=center><font color=B09878>Clique na bandeira para escolher o idioma.</font></td></tr>
        51: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        54: pop
        55: aload         4
        57: ldc           #248                // String </table>
        59: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        62: pop
        63: aload         4
        65: ldc           #250                // String <img src=\"L2UI.SquareGray\" width=280 height=1><br>
        67: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        70: pop
        71: aload         4
        73: ldc           #252                // String <table width=280>
        75: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        78: pop
        79: iconst_0
        80: istore        5
        82: invokestatic  #254                // Method ext/mods/Crypta/DeeplTranslator$Language.values:()[Lext/mods/Crypta/DeeplTranslator$Language;
        85: astore        6
        87: aload         6
        89: arraylength
        90: istore        7
        92: iconst_0
        93: istore        8
        95: iload         8
        97: iload         7
        99: if_icmpge     225
       102: aload         6
       104: iload         8
       106: aaload
       107: astore        9
       109: iload         5
       111: ifne          123
       114: aload         4
       116: ldc_w         #258                // String <tr>
       119: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       122: pop
       123: aload         4
       125: ldc_w         #260                // String <td width=40 align=center><button title=\"
       128: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       131: aload         9
       133: invokevirtual #262                // Method ext/mods/Crypta/DeeplTranslator$Language.getDisplayName:()Ljava/lang/String;
       136: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       139: ldc_w         #265                // String \" action=\"bypass -h _trans set
       142: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       145: aload         9
       147: invokevirtual #267                // Method ext/mods/Crypta/DeeplTranslator$Language.getCode:()Ljava/lang/String;
       150: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       153: ldc_w         #270                // String \" width=25 height=25 back=\"L2butom.
       156: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       159: aload         9
       161: invokevirtual #262                // Method ext/mods/Crypta/DeeplTranslator$Language.getDisplayName:()Ljava/lang/String;
       164: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       167: ldc_w         #272                // String \" fore=\"L2butom.
       170: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       173: aload         9
       175: invokevirtual #262                // Method ext/mods/Crypta/DeeplTranslator$Language.getDisplayName:()Ljava/lang/String;
       178: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       181: ldc_w         #274                // String \"></td>
       184: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       187: pop
       188: iinc          5, 1
       191: iload         5
       193: bipush        6
       195: if_icmplt     219
       198: aload         4
       200: ldc_w         #276                // String </tr>
       203: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       206: pop
       207: aload         4
       209: ldc_w         #278                // String <tr><td height=10></td></tr>
       212: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       215: pop
       216: iconst_0
       217: istore        5
       219: iinc          8, 1
       222: goto          95
       225: iload         5
       227: ifeq          239
       230: aload         4
       232: ldc_w         #276                // String </tr>
       235: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       238: pop
       239: aload         4
       241: ldc_w         #280                // String </table><br>
       244: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       247: pop
       248: aload         4
       250: ldc           #236                // String <img src=\"L2UI.SquareGray\" width=280 height=1>
       252: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       255: pop
       256: aload         4
       258: ldc_w         #282                // String </center></body></html>
       261: invokevirtual #238                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       264: pop
       265: aload_2
       266: aload         4
       268: invokevirtual #284                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       271: invokevirtual #207                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       274: aload_2
       275: ldc_w         #287                // String language_menu.html
       278: invokevirtual #170                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFileName:(Ljava/lang/String;)V
       281: aload_2
       282: iconst_1
       283: invokestatic  #104                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       286: invokevirtual #289                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFromTranslator:(Ljava/lang/Boolean;)V
       289: aload_1
       290: aload_2
       291: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       294: return
      LineNumberTable:
        line 216: 0
        line 217: 9
        line 219: 12
        line 220: 23
        line 221: 31
        line 222: 39
        line 223: 47
        line 224: 55
        line 225: 63
        line 226: 71
        line 228: 79
        line 229: 82
        line 230: 109
        line 231: 114
        line 234: 123
        line 236: 188
        line 238: 191
        line 239: 198
        line 240: 207
        line 241: 216
        line 229: 219
        line 245: 225
        line 246: 230
        line 249: 239
        line 250: 248
        line 251: 256
        line 253: 265
        line 254: 274
        line 255: 281
        line 256: 289
        line 257: 294
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          109     110     9  lang   Lext/mods/Crypta/DeeplTranslator$Language;
            0     295     0  this   Lext/mods/Crypta/DeeplTranslator;
            0     295     1 player   Lext/mods/gameserver/model/actor/Player;
            9     286     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           12     283     3 maxCols   I
           23     272     4    sb   Ljava/lang/StringBuilder;
           82     213     5 currentCol   I
      StackMapTable: number_of_entries = 5
        frame_type = 255 /* full_frame */
          offset_delta = 95
          locals = [ class ext/mods/Crypta/DeeplTranslator, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, class java/lang/StringBuilder, int, class "[Lext/mods/Crypta/DeeplTranslator$Language;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/Crypta/DeeplTranslator$Language ]
        frame_type = 250 /* chop */
          offset_delta = 95
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 13 /* same */

  public void setPlayerLanguage(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_2
         1: invokestatic  #297                // Method ext/mods/Crypta/DeeplTranslator$Language.fromCode:(Ljava/lang/String;)Ljava/util/Optional;
         4: aload_0
         5: aload_1
         6: invokedynamic #301,  0            // InvokeDynamic #1:accept:(Lext/mods/Crypta/DeeplTranslator;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
        11: invokevirtual #305                // Method java/util/Optional.ifPresent:(Ljava/util/function/Consumer;)V
        14: return
      LineNumberTable:
        line 260: 0
        line 271: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/Crypta/DeeplTranslator;
            0      15     1 player   Lext/mods/gameserver/model/actor/Player;
            0      15     2 langCode   Ljava/lang/String;

  public ext.mods.Crypta.DeeplTranslator$Language getPlayerLanguage(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/Crypta/DeeplTranslator$Language;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _playerPreferences:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         8: invokestatic  #150                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: getstatic     #556                // Field ext/mods/Crypta/DeeplTranslator$Language.ENGLISH:Lext/mods/Crypta/DeeplTranslator$Language;
        14: invokeinterface #560,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        19: checkcast     #166                // class ext/mods/Crypta/DeeplTranslator$Language
        22: astore_2
        23: aload_2
        24: areturn
      LineNumberTable:
        line 631: 0
        line 632: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/Crypta/DeeplTranslator;
            0      25     1 player   Lext/mods/gameserver/model/actor/Player;
           23       2     2  lang   Lext/mods/Crypta/DeeplTranslator$Language;

  public boolean accountLimitReached();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _accountLimitReached:Z
         4: ireturn
      LineNumberTable:
        line 636: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/Crypta/DeeplTranslator;

  public static ext.mods.Crypta.DeeplTranslator getInstance();
    descriptor: ()Lext/mods/Crypta/DeeplTranslator;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #563                // Field ext/mods/Crypta/DeeplTranslator$SingletonHolder.INSTANCE:Lext/mods/Crypta/DeeplTranslator;
         3: areturn
      LineNumberTable:
        line 640: 0

  public java.util.concurrent.CompletableFuture<java.lang.Boolean> translateFile(java.lang.String, ext.mods.Crypta.DeeplTranslator$Language);
    descriptor: (Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/util/concurrent/CompletableFuture;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokedynamic #569,  0            // InvokeDynamic #10:get:(Lext/mods/Crypta/DeeplTranslator;Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/util/function/Supplier;
         8: invokestatic  #572                // Method java/util/concurrent/CompletableFuture.supplyAsync:(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;
        11: areturn
      LineNumberTable:
        line 657: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/Crypta/DeeplTranslator;
            0      12     1 htmlFile   Ljava/lang/String;
            0      12     2 targetLang   Lext/mods/Crypta/DeeplTranslator$Language;
    Signature: #813                         // (Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/util/concurrent/CompletableFuture<Ljava/lang/Boolean;>;

  public java.util.concurrent.CompletableFuture<java.lang.String> translateText(ext.mods.Crypta.DeeplTranslator$Language, java.lang.String);
    descriptor: (Lext/mods/Crypta/DeeplTranslator$Language;Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_2
         2: aload_1
         3: invokedynamic #576,  0            // InvokeDynamic #11:get:(Lext/mods/Crypta/DeeplTranslator;Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/util/function/Supplier;
         8: invokestatic  #572                // Method java/util/concurrent/CompletableFuture.supplyAsync:(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;
        11: areturn
      LineNumberTable:
        line 784: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/Crypta/DeeplTranslator;
            0      12     1 targetLang   Lext/mods/Crypta/DeeplTranslator$Language;
            0      12     2  text   Ljava/lang/String;
    Signature: #815                         // (Lext/mods/Crypta/DeeplTranslator$Language;Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture<Ljava/lang/String;>;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #111                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/Crypta/DeeplTranslator
         6: invokevirtual #719                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #724                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #98                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 57: 0
}
SourceFile: "DeeplTranslator.java"
NestMembers:
  ext/mods/Crypta/DeeplTranslator$SingletonHolder
  ext/mods/Crypta/DeeplTranslator$Language
  ext/mods/Crypta/DeeplTranslator$1
BootstrapMethods:
  0: #898 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #857 ()V
      #858 REF_invokeVirtual ext/mods/Crypta/DeeplTranslator.reload:()V
      #857 ()V
  1: #898 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #859 (Ljava/lang/Object;)V
      #860 REF_invokeVirtual ext/mods/Crypta/DeeplTranslator.lambda$setPlayerLanguage$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/Crypta/DeeplTranslator$Language;)V
      #863 (Lext/mods/Crypta/DeeplTranslator$Language;)V
  2: #898 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #859 (Ljava/lang/Object;)V
      #865 REF_invokeVirtual ext/mods/Crypta/DeeplTranslator.lambda$asyncTranslate$0:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;Lext/mods/gameserver/model/actor/Player;Ljava/lang/Boolean;)V
      #868 (Ljava/lang/Boolean;)V
  3: #898 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #859 (Ljava/lang/Object;)V
      #869 REF_invokeVirtual ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.applyReplaces:(Ljava/util/Map;)V
      #870 (Ljava/util/Map;)V
  4: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #871 PLACEHOLDER_\u0001_MARKER
  5: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #873 data/locale/en_US/html/\u0001
  6: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #875 html/\u0001
  7: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #877 /locale/\u0001/
  8: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #879 data/locale/\u0001/html/\u0001
  9: #898 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #881 (Ljava/lang/Object;)Z
      #882 REF_invokeStatic ext/mods/Crypta/DeeplTranslator.lambda$isTranslatable$0:(Ljava/lang/String;Ljava/lang/String;)Z
      #885 (Ljava/lang/String;)Z
  10: #898 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #886 ()Ljava/lang/Object;
      #887 REF_invokeVirtual ext/mods/Crypta/DeeplTranslator.lambda$translateFile$0:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/lang/Boolean;
      #890 ()Ljava/lang/Boolean;
  11: #898 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #886 ()Ljava/lang/Object;
      #892 REF_invokeVirtual ext/mods/Crypta/DeeplTranslator.lambda$translateText$0:(Ljava/lang/String;Lext/mods/Crypta/DeeplTranslator$Language;)Ljava/lang/String;
      #895 ()Ljava/lang/String;
  12: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #896 Idioma alterado para \u0001.
InnerClasses:
  public static final #912= #166 of #11;  // Language=class ext/mods/Crypta/DeeplTranslator$Language of class ext/mods/Crypta/DeeplTranslator
  #349;                                   // class ext/mods/Crypta/DeeplTranslator$1
  public static #913= #488 of #156;       // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #919= #915 of #917; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
