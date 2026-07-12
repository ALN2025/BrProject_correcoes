// Bytecode for: ext.mods.gameserver.data.manager.BotsPreventionManager
// File: ext\mods\gameserver\data\manager\BotsPreventionManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/BotsPreventionManager.class
  Last modified 9 de jul de 2026; size 14462 bytes
  MD5 checksum 59c5d62c9b385d34a025c4c523ea5921
  Compiled from "BotsPreventionManager.java"
public class ext.mods.gameserver.data.manager.BotsPreventionManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/manager/BotsPreventionManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 9, methods: 17, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/data/manager/BotsPreventionManager.WINDOW_DELAY:I
    #8 = Class              #10           // ext/mods/gameserver/data/manager/BotsPreventionManager
    #9 = NameAndType        #11:#12       // WINDOW_DELAY:I
   #10 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager
   #11 = Utf8               WINDOW_DELAY
   #12 = Utf8               I
   #13 = Fieldref           #14.#15       // ext/mods/Config.VALIDATION_TIME:I
   #14 = Class              #16           // ext/mods/Config
   #15 = NameAndType        #17:#12       // VALIDATION_TIME:I
   #16 = Utf8               ext/mods/Config
   #17 = Utf8               VALIDATION_TIME
   #18 = Fieldref           #8.#15        // ext/mods/gameserver/data/manager/BotsPreventionManager.VALIDATION_TIME:I
   #19 = Methodref          #8.#20        // ext/mods/gameserver/data/manager/BotsPreventionManager.getImages:()V
   #20 = NameAndType        #21:#6        // getImages:()V
   #21 = Utf8               getImages
   #22 = Class              #23           // ext/mods/gameserver/model/actor/Player
   #23 = Utf8               ext/mods/gameserver/model/actor/Player
   #24 = Class              #25           // ext/mods/gameserver/model/actor/instance/Monster
   #25 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #26 = Fieldref           #8.#27        // ext/mods/gameserver/data/manager/BotsPreventionManager._validation:Ljava/util/Map;
   #27 = NameAndType        #28:#29       // _validation:Ljava/util/Map;
   #28 = Utf8               _validation
   #29 = Utf8               Ljava/util/Map;
   #30 = Methodref          #22.#31       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #31 = NameAndType        #32:#33       // getObjectId:()I
   #32 = Utf8               getObjectId
   #33 = Utf8               ()I
   #34 = Methodref          #35.#36       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #35 = Class              #37           // java/lang/Integer
   #36 = NameAndType        #38:#39       // valueOf:(I)Ljava/lang/Integer;
   #37 = Utf8               java/lang/Integer
   #38 = Utf8               valueOf
   #39 = Utf8               (I)Ljava/lang/Integer;
   #40 = InterfaceMethodref #41.#42       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #41 = Class              #43           // java/util/Map
   #42 = NameAndType        #44:#45       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #43 = Utf8               java/util/Map
   #44 = Utf8               get
   #45 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #46 = Fieldref           #8.#47        // ext/mods/gameserver/data/manager/BotsPreventionManager._monstersCounter:Ljava/util/Map;
   #47 = NameAndType        #48:#29       // _monstersCounter:Ljava/util/Map;
   #48 = Utf8               _monstersCounter
   #49 = Methodref          #35.#50       // java/lang/Integer.intValue:()I
   #50 = NameAndType        #51:#33       // intValue:()I
   #51 = Utf8               intValue
   #52 = Fieldref           #14.#53       // ext/mods/Config.KILLS_COUNTER_RANDOMIZATION:I
   #53 = NameAndType        #54:#12       // KILLS_COUNTER_RANDOMIZATION:I
   #54 = Utf8               KILLS_COUNTER_RANDOMIZATION
   #55 = Methodref          #56.#57       // ext/mods/commons/random/Rnd.nextInt:(I)I
   #56 = Class              #58           // ext/mods/commons/random/Rnd
   #57 = NameAndType        #59:#60       // nextInt:(I)I
   #58 = Utf8               ext/mods/commons/random/Rnd
   #59 = Utf8               nextInt
   #60 = Utf8               (I)I
   #61 = Fieldref           #14.#62       // ext/mods/Config.KILLS_COUNTER:I
   #62 = NameAndType        #63:#12       // KILLS_COUNTER:I
   #63 = Utf8               KILLS_COUNTER
   #64 = Methodref          #8.#65        // ext/mods/gameserver/data/manager/BotsPreventionManager.validationTasks:(Lext/mods/gameserver/model/actor/Player;)V
   #65 = NameAndType        #66:#67       // validationTasks:(Lext/mods/gameserver/model/actor/Player;)V
   #66 = Utf8               validationTasks
   #67 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #68 = InterfaceMethodref #41.#69       // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #69 = NameAndType        #70:#45       // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #70 = Utf8               remove
   #71 = InterfaceMethodref #41.#72       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #72 = NameAndType        #73:#74       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #73 = Utf8               put
   #74 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #75 = Class              #76           // java/io/File
   #76 = Utf8               java/io/File
   #77 = Fieldref           #14.#78       // ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
   #78 = NameAndType        #79:#80       // DATA_PATH:Ljava/nio/file/Path;
   #79 = Utf8               DATA_PATH
   #80 = Utf8               Ljava/nio/file/Path;
   #81 = String             #82           // ./prevention
   #82 = Utf8               ./prevention
   #83 = InterfaceMethodref #84.#85       // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
   #84 = Class              #86           // java/nio/file/Path
   #85 = NameAndType        #87:#88       // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
   #86 = Utf8               java/nio/file/Path
   #87 = Utf8               resolve
   #88 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
   #89 = InterfaceMethodref #84.#90       // java/nio/file/Path.toString:()Ljava/lang/String;
   #90 = NameAndType        #91:#92       // toString:()Ljava/lang/String;
   #91 = Utf8               toString
   #92 = Utf8               ()Ljava/lang/String;
   #93 = Methodref          #75.#94       // java/io/File."<init>":(Ljava/lang/String;)V
   #94 = NameAndType        #5:#95        // "<init>":(Ljava/lang/String;)V
   #95 = Utf8               (Ljava/lang/String;)V
   #96 = Methodref          #75.#97       // java/io/File.mkdirs:()Z
   #97 = NameAndType        #98:#99       // mkdirs:()Z
   #98 = Utf8               mkdirs
   #99 = Utf8               ()Z
  #100 = Methodref          #75.#101      // java/io/File.listFiles:()[Ljava/io/File;
  #101 = NameAndType        #102:#103     // listFiles:()[Ljava/io/File;
  #102 = Utf8               listFiles
  #103 = Utf8               ()[Ljava/io/File;
  #104 = Methodref          #75.#105      // java/io/File.getName:()Ljava/lang/String;
  #105 = NameAndType        #106:#92      // getName:()Ljava/lang/String;
  #106 = Utf8               getName
  #107 = String             #108          // .dds
  #108 = Utf8               .dds
  #109 = Methodref          #110.#111     // java/lang/String.endsWith:(Ljava/lang/String;)Z
  #110 = Class              #112          // java/lang/String
  #111 = NameAndType        #113:#114     // endsWith:(Ljava/lang/String;)Z
  #112 = Utf8               java/lang/String
  #113 = Utf8               endsWith
  #114 = Utf8               (Ljava/lang/String;)Z
  #115 = Class              #116          // java/io/RandomAccessFile
  #116 = Utf8               java/io/RandomAccessFile
  #117 = String             #118          // r
  #118 = Utf8               r
  #119 = Methodref          #115.#120     // java/io/RandomAccessFile."<init>":(Ljava/io/File;Ljava/lang/String;)V
  #120 = NameAndType        #5:#121       // "<init>":(Ljava/io/File;Ljava/lang/String;)V
  #121 = Utf8               (Ljava/io/File;Ljava/lang/String;)V
  #122 = Methodref          #115.#123     // java/io/RandomAccessFile.length:()J
  #123 = NameAndType        #124:#125     // length:()J
  #124 = Utf8               length
  #125 = Utf8               ()J
  #126 = Methodref          #115.#127     // java/io/RandomAccessFile.readFully:([B)V
  #127 = NameAndType        #128:#129     // readFully:([B)V
  #128 = Utf8               readFully
  #129 = Utf8               ([B)V
  #130 = Methodref          #115.#131     // java/io/RandomAccessFile.close:()V
  #131 = NameAndType        #132:#6       // close:()V
  #132 = Utf8               close
  #133 = Class              #134          // java/lang/Throwable
  #134 = Utf8               java/lang/Throwable
  #135 = Methodref          #133.#136     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #136 = NameAndType        #137:#138     // addSuppressed:(Ljava/lang/Throwable;)V
  #137 = Utf8               addSuppressed
  #138 = Utf8               (Ljava/lang/Throwable;)V
  #139 = Class              #140          // java/lang/Exception
  #140 = Utf8               java/lang/Exception
  #141 = Fieldref           #8.#142       // ext/mods/gameserver/data/manager/BotsPreventionManager._images:Ljava/util/Map;
  #142 = NameAndType        #143:#29      // _images:Ljava/util/Map;
  #143 = Utf8               _images
  #144 = Class              #145          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #145 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #146 = Methodref          #144.#147     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #147 = NameAndType        #5:#148       // "<init>":(I)V
  #148 = Utf8               (I)V
  #149 = Class              #150          // java/lang/StringBuilder
  #150 = Utf8               java/lang/StringBuilder
  #151 = Methodref          #149.#3       // java/lang/StringBuilder."<init>":()V
  #152 = String             #153          // <html>
  #153 = Utf8               <html>
  #154 = Methodref          #155.#156     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #155 = Class              #157          // ext/mods/commons/lang/StringUtil
  #156 = NameAndType        #158:#159     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #157 = Utf8               ext/mods/commons/lang/StringUtil
  #158 = Utf8               append
  #159 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #160 = String             #161          // <title>Bots prevention</title>
  #161 = Utf8               <title>Bots prevention</title>
  #162 = String             #163          // <body><center><br><br><img src=\"L2UI_CH3.herotower_deco\" width=\"256\" height=\"32\">
  #163 = Utf8               <body><center><br><br><img src=\"L2UI_CH3.herotower_deco\" width=\"256\" height=\"32\">
  #164 = String             #165          // <br><br><font color=\"a2a0a2\">if such window appears it means server suspect,<br1>that you may using cheating software.</font>
  #165 = Utf8               <br><br><font color=\"a2a0a2\">if such window appears it means server suspect,<br1>that you may using cheating software.</font>
  #166 = String             #167          // <br><br><font color=\"b09979\">if given answer results are incorrect or no action is made<br1>server is going to punish character instantly.</font>
  #167 = Utf8               <br><br><font color=\"b09979\">if given answer results are incorrect or no action is made<br1>server is going to punish character instantly.</font>
  #168 = String             #169          // <br><br><button value=\"CONTINUE\" action=\"bypass report_continue\" width=\"75\" height=\"21\" back=\"L2UI_CH3.Btn1_normal\" fore=\"L2UI_CH3.Btn1_normal\">
  #169 = Utf8               <br><br><button value=\"CONTINUE\" action=\"bypass report_continue\" width=\"75\" height=\"21\" back=\"L2UI_CH3.Btn1_normal\" fore=\"L2UI_CH3.Btn1_normal\">
  #170 = String             #171          // </center></body>
  #171 = Utf8               </center></body>
  #172 = String             #173          // </html>
  #173 = Utf8               </html>
  #174 = Methodref          #149.#90      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #175 = Methodref          #144.#176     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #176 = NameAndType        #177:#95      // setHtml:(Ljava/lang/String;)V
  #177 = Utf8               setHtml
  #178 = Methodref          #22.#179      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #179 = NameAndType        #180:#181     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #180 = Utf8               sendPacket
  #181 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #182 = Class              #183          // ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData
  #183 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData
  #184 = String             #185          // <br><br><font color=\"a2a0a2\">in order to prove you are a human being<br1>you\'ve to</font> <font color=\"b09979\">match colours within generated pattern:</font>
  #185 = Utf8               <br><br><font color=\"a2a0a2\">in order to prove you are a human being<br1>you\'ve to</font> <font color=\"b09979\">match colours within generated pattern:</font>
  #186 = Fieldref           #14.#187      // ext/mods/Config.SERVER_ID:I
  #187 = NameAndType        #188:#12      // SERVER_ID:I
  #188 = Utf8               SERVER_ID
  #189 = Fieldref           #182.#190     // ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.patternId:I
  #190 = NameAndType        #191:#12      // patternId:I
  #191 = Utf8               patternId
  #192 = InvokeDynamic      #0:#193       // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #193 = NameAndType        #194:#195     // makeConcatWithConstants:(II)Ljava/lang/String;
  #194 = Utf8               makeConcatWithConstants
  #195 = Utf8               (II)Ljava/lang/String;
  #196 = String             #197          // <br><br><font color=b09979>click-on pattern of your choice beneath:</font>
  #197 = Utf8               <br><br><font color=b09979>click-on pattern of your choice beneath:</font>
  #198 = String             #199          // <table><tr>
  #199 = Utf8               <table><tr>
  #200 = Fieldref           #182.#201     // ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.options:Ljava/util/List;
  #201 = NameAndType        #202:#203     // options:Ljava/util/List;
  #202 = Utf8               options
  #203 = Utf8               Ljava/util/List;
  #204 = InterfaceMethodref #205.#206     // java/util/List.size:()I
  #205 = Class              #207          // java/util/List
  #206 = NameAndType        #208:#33      // size:()I
  #207 = Utf8               java/util/List
  #208 = Utf8               size
  #209 = InterfaceMethodref #205.#210     // java/util/List.get:(I)Ljava/lang/Object;
  #210 = NameAndType        #44:#211      // get:(I)Ljava/lang/Object;
  #211 = Utf8               (I)Ljava/lang/Object;
  #212 = InvokeDynamic      #1:#213       // #1:makeConcatWithConstants:(IIIII)Ljava/lang/String;
  #213 = NameAndType        #194:#214     // makeConcatWithConstants:(IIIII)Ljava/lang/String;
  #214 = Utf8               (IIIII)Ljava/lang/String;
  #215 = String             #216          // </tr></table>
  #216 = Utf8               </tr></table>
  #217 = String             #218          // <br><br><font color=\"a2a0a2\">if such window appears, it means character haven\'t<br1>passed through prevention system.
  #218 = Utf8               <br><br><font color=\"a2a0a2\">if such window appears, it means character haven\'t<br1>passed through prevention system.
  #219 = String             #220          // <br><br><font color=\"b09979\">in such case character get moved to nearest town.</font>
  #220 = Utf8               <br><br><font color=\"b09979\">in such case character get moved to nearest town.</font>
  #221 = Methodref          #182.#222     // ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData."<init>":(Lext/mods/gameserver/data/manager/BotsPreventionManager;)V
  #222 = NameAndType        #5:#223       // "<init>":(Lext/mods/gameserver/data/manager/BotsPreventionManager;)V
  #223 = Utf8               (Lext/mods/gameserver/data/manager/BotsPreventionManager;)V
  #224 = Methodref          #8.#225       // ext/mods/gameserver/data/manager/BotsPreventionManager.randomizeImages:(Lext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData;Lext/mods/gameserver/model/actor/Player;)V
  #225 = NameAndType        #226:#227     // randomizeImages:(Lext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData;Lext/mods/gameserver/model/actor/Player;)V
  #226 = Utf8               randomizeImages
  #227 = Utf8               (Lext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData;Lext/mods/gameserver/model/actor/Player;)V
  #228 = Class              #229          // ext/mods/gameserver/network/serverpackets/PledgeCrest
  #229 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeCrest
  #230 = Class              #231          // "[B"
  #231 = Utf8               [B
  #232 = Methodref          #228.#233     // ext/mods/gameserver/network/serverpackets/PledgeCrest."<init>":(I[B)V
  #233 = NameAndType        #5:#234       // "<init>":(I[B)V
  #234 = Utf8               (I[B)V
  #235 = Fieldref           #182.#236     // ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.mainPattern:I
  #236 = NameAndType        #237:#12      // mainPattern:I
  #237 = Utf8               mainPattern
  #238 = Class              #239          // ext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask
  #239 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask
  #240 = Methodref          #238.#241     // ext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask."<init>":(Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;)V
  #241 = NameAndType        #5:#242       // "<init>":(Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;)V
  #242 = Utf8               (Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;)V
  #243 = Methodref          #244.#245     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #244 = Class              #246          // ext/mods/commons/pool/ThreadPool
  #245 = NameAndType        #247:#248     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #246 = Utf8               ext/mods/commons/pool/ThreadPool
  #247 = Utf8               schedule
  #248 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #249 = Class              #250          // ext/mods/gameserver/data/manager/BotsPreventionManager$countdown
  #250 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager$countdown
  #251 = Methodref          #249.#252     // ext/mods/gameserver/data/manager/BotsPreventionManager$countdown."<init>":(Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;I)V
  #252 = NameAndType        #5:#253       // "<init>":(Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;I)V
  #253 = Utf8               (Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;I)V
  #254 = Fieldref           #8.#255       // ext/mods/gameserver/data/manager/BotsPreventionManager._beginValidation:Ljava/util/Map;
  #255 = NameAndType        #256:#29      // _beginValidation:Ljava/util/Map;
  #256 = Utf8               _beginValidation
  #257 = InterfaceMethodref #41.#206      // java/util/Map.size:()I
  #258 = InterfaceMethodref #205.#259     // java/util/List.indexOf:(Ljava/lang/Object;)I
  #259 = NameAndType        #260:#261     // indexOf:(Ljava/lang/Object;)I
  #260 = Utf8               indexOf
  #261 = Utf8               (Ljava/lang/Object;)I
  #262 = InterfaceMethodref #205.#263     // java/util/List.add:(Ljava/lang/Object;)Z
  #263 = NameAndType        #264:#265     // add:(Ljava/lang/Object;)Z
  #264 = Utf8               add
  #265 = Utf8               (Ljava/lang/Object;)Z
  #266 = Methodref          #267.#268     // java/util/Calendar.getInstance:()Ljava/util/Calendar;
  #267 = Class              #269          // java/util/Calendar
  #268 = NameAndType        #270:#271     // getInstance:()Ljava/util/Calendar;
  #269 = Utf8               java/util/Calendar
  #270 = Utf8               getInstance
  #271 = Utf8               ()Ljava/util/Calendar;
  #272 = Methodref          #267.#273     // java/util/Calendar.get:(I)I
  #273 = NameAndType        #44:#60       // get:(I)I
  #274 = Methodref          #35.#275      // java/lang/Integer.toString:(I)Ljava/lang/String;
  #275 = NameAndType        #91:#276      // toString:(I)Ljava/lang/String;
  #276 = Utf8               (I)Ljava/lang/String;
  #277 = InvokeDynamic      #2:#278       // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #278 = NameAndType        #194:#279     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #279 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #280 = Methodref          #35.#281      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #281 = NameAndType        #282:#283     // parseInt:(Ljava/lang/String;)I
  #282 = Utf8               parseInt
  #283 = Utf8               (Ljava/lang/String;)I
  #284 = Class              #285          // java/util/concurrent/Future
  #285 = Utf8               java/util/concurrent/Future
  #286 = InterfaceMethodref #284.#287     // java/util/concurrent/Future.cancel:(Z)Z
  #287 = NameAndType        #288:#289     // cancel:(Z)Z
  #288 = Utf8               cancel
  #289 = Utf8               (Z)Z
  #290 = Fieldref           #14.#291      // ext/mods/Config.PUNISHMENT:I
  #291 = NameAndType        #292:#12      // PUNISHMENT:I
  #292 = Utf8               PUNISHMENT
  #293 = Methodref          #22.#294      // ext/mods/gameserver/model/actor/Player.abortAll:(Z)V
  #294 = NameAndType        #295:#296     // abortAll:(Z)V
  #295 = Utf8               abortAll
  #296 = Utf8               (Z)V
  #297 = Fieldref           #298.#299     // ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
  #298 = Class              #300          // ext/mods/gameserver/enums/RestartType
  #299 = NameAndType        #301:#302     // TOWN:Lext/mods/gameserver/enums/RestartType;
  #300 = Utf8               ext/mods/gameserver/enums/RestartType
  #301 = Utf8               TOWN
  #302 = Utf8               Lext/mods/gameserver/enums/RestartType;
  #303 = Methodref          #22.#304      // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
  #304 = NameAndType        #305:#306     // teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
  #305 = Utf8               teleportTo
  #306 = Utf8               (Lext/mods/gameserver/enums/RestartType;)V
  #307 = Methodref          #8.#308       // ext/mods/gameserver/data/manager/BotsPreventionManager.punishmentnWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #308 = NameAndType        #309:#67      // punishmentnWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #309 = Utf8               punishmentnWindow
  #310 = Methodref          #22.#311      // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #311 = NameAndType        #312:#99      // isOnline:()Z
  #312 = Utf8               isOnline
  #313 = Methodref          #22.#314      // ext/mods/gameserver/model/actor/Player.logout:(Z)V
  #314 = NameAndType        #315:#296     // logout:(Z)V
  #315 = Utf8               logout
  #316 = Fieldref           #14.#317      // ext/mods/Config.PUNISHMENT_TIME:I
  #317 = NameAndType        #318:#12      // PUNISHMENT_TIME:I
  #318 = Utf8               PUNISHMENT_TIME
  #319 = Methodref          #8.#320       // ext/mods/gameserver/data/manager/BotsPreventionManager.jailPunishment:(Lext/mods/gameserver/model/actor/Player;I)V
  #320 = NameAndType        #321:#322     // jailPunishment:(Lext/mods/gameserver/model/actor/Player;I)V
  #321 = Utf8               jailPunishment
  #322 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #323 = Methodref          #8.#324       // ext/mods/gameserver/data/manager/BotsPreventionManager.changeAccessLevel:(Lext/mods/gameserver/model/actor/Player;I)V
  #324 = NameAndType        #325:#322     // changeAccessLevel:(Lext/mods/gameserver/model/actor/Player;I)V
  #325 = Utf8               changeAccessLevel
  #326 = String             #327          // Unfortunately, colours doesn\'t match.
  #327 = Utf8               Unfortunately, colours doesn\'t match.
  #328 = Methodref          #22.#329      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #329 = NameAndType        #330:#95      // sendMessage:(Ljava/lang/String;)V
  #330 = Utf8               sendMessage
  #331 = Methodref          #22.#332      // ext/mods/gameserver/model/actor/Player.getPunishment:()Lext/mods/gameserver/model/actor/container/player/Punishment;
  #332 = NameAndType        #333:#334     // getPunishment:()Lext/mods/gameserver/model/actor/container/player/Punishment;
  #333 = Utf8               getPunishment
  #334 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Punishment;
  #335 = Fieldref           #336.#337     // ext/mods/gameserver/enums/PunishmentType.JAIL:Lext/mods/gameserver/enums/PunishmentType;
  #336 = Class              #338          // ext/mods/gameserver/enums/PunishmentType
  #337 = NameAndType        #339:#340     // JAIL:Lext/mods/gameserver/enums/PunishmentType;
  #338 = Utf8               ext/mods/gameserver/enums/PunishmentType
  #339 = Utf8               JAIL
  #340 = Utf8               Lext/mods/gameserver/enums/PunishmentType;
  #341 = Methodref          #342.#343     // ext/mods/gameserver/model/actor/container/player/Punishment.setType:(Lext/mods/gameserver/enums/PunishmentType;I)V
  #342 = Class              #344          // ext/mods/gameserver/model/actor/container/player/Punishment
  #343 = NameAndType        #345:#346     // setType:(Lext/mods/gameserver/enums/PunishmentType;I)V
  #344 = Utf8               ext/mods/gameserver/model/actor/container/player/Punishment
  #345 = Utf8               setType
  #346 = Utf8               (Lext/mods/gameserver/enums/PunishmentType;I)V
  #347 = Methodref          #348.#349     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #348 = Class              #350          // ext/mods/commons/pool/ConnectionPool
  #349 = NameAndType        #351:#352     // getConnection:()Ljava/sql/Connection;
  #350 = Utf8               ext/mods/commons/pool/ConnectionPool
  #351 = Utf8               getConnection
  #352 = Utf8               ()Ljava/sql/Connection;
  #353 = String             #354          // UPDATE characters SET x=-114356, y=-249645, z=-2984, punish_level=?, punish_timer=? WHERE obj_id=?
  #354 = Utf8               UPDATE characters SET x=-114356, y=-249645, z=-2984, punish_level=?, punish_timer=? WHERE obj_id=?
  #355 = InterfaceMethodref #356.#357     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #356 = Class              #358          // java/sql/Connection
  #357 = NameAndType        #359:#360     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #358 = Utf8               java/sql/Connection
  #359 = Utf8               prepareStatement
  #360 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #361 = Methodref          #336.#362     // ext/mods/gameserver/enums/PunishmentType.ordinal:()I
  #362 = NameAndType        #363:#33      // ordinal:()I
  #363 = Utf8               ordinal
  #364 = InterfaceMethodref #365.#366     // java/sql/PreparedStatement.setInt:(II)V
  #365 = Class              #367          // java/sql/PreparedStatement
  #366 = NameAndType        #368:#369     // setInt:(II)V
  #367 = Utf8               java/sql/PreparedStatement
  #368 = Utf8               setInt
  #369 = Utf8               (II)V
  #370 = InterfaceMethodref #365.#371     // java/sql/PreparedStatement.setLong:(IJ)V
  #371 = NameAndType        #372:#373     // setLong:(IJ)V
  #372 = Utf8               setLong
  #373 = Utf8               (IJ)V
  #374 = InterfaceMethodref #365.#375     // java/sql/PreparedStatement.execute:()Z
  #375 = NameAndType        #376:#99      // execute:()Z
  #376 = Utf8               execute
  #377 = InterfaceMethodref #365.#131     // java/sql/PreparedStatement.close:()V
  #378 = InterfaceMethodref #356.#131     // java/sql/Connection.close:()V
  #379 = Class              #380          // java/sql/SQLException
  #380 = Utf8               java/sql/SQLException
  #381 = String             #382          // SQLException while jailing player
  #382 = Utf8               SQLException while jailing player
  #383 = Methodref          #22.#384      // ext/mods/gameserver/model/actor/Player.setAccessLevel:(I)V
  #384 = NameAndType        #385:#148     // setAccessLevel:(I)V
  #385 = Utf8               setAccessLevel
  #386 = String             #387          // UPDATE characters SET accesslevel=? WHERE obj_id=?
  #387 = Utf8               UPDATE characters SET accesslevel=? WHERE obj_id=?
  #388 = Methodref          #379.#389     // java/sql/SQLException.printStackTrace:()V
  #389 = NameAndType        #390:#6       // printStackTrace:()V
  #390 = Utf8               printStackTrace
  #391 = InterfaceMethodref #41.#392      // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #392 = NameAndType        #393:#265     // containsKey:(Ljava/lang/Object;)Z
  #393 = Utf8               containsKey
  #394 = String             #395          // _
  #395 = Utf8               _
  #396 = Methodref          #110.#397     // java/lang/String.indexOf:(Ljava/lang/String;)I
  #397 = NameAndType        #260:#283     // indexOf:(Ljava/lang/String;)I
  #398 = Methodref          #110.#399     // java/lang/String.substring:(I)Ljava/lang/String;
  #399 = NameAndType        #400:#276     // substring:(I)Ljava/lang/String;
  #400 = Utf8               substring
  #401 = String             #402          // continue
  #402 = Utf8               continue
  #403 = Methodref          #110.#404     // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #404 = NameAndType        #405:#114     // startsWith:(Ljava/lang/String;)Z
  #405 = Utf8               startsWith
  #406 = Methodref          #8.#407       // ext/mods/gameserver/data/manager/BotsPreventionManager.validationWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #407 = NameAndType        #408:#67      // validationWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #408 = Utf8               validationWindow
  #409 = Fieldref           #182.#410     // ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.firstWindow:Z
  #410 = NameAndType        #411:#412     // firstWindow:Z
  #411 = Utf8               firstWindow
  #412 = Utf8               Z
  #413 = Methodref          #8.#414       // ext/mods/gameserver/data/manager/BotsPreventionManager.tryParseInt:(Ljava/lang/String;)Z
  #414 = NameAndType        #415:#114     // tryParseInt:(Ljava/lang/String;)Z
  #415 = Utf8               tryParseInt
  #416 = Methodref          #8.#417       // ext/mods/gameserver/data/manager/BotsPreventionManager.banPunishment:(Lext/mods/gameserver/model/actor/Player;)V
  #417 = NameAndType        #418:#67      // banPunishment:(Lext/mods/gameserver/model/actor/Player;)V
  #418 = Utf8               banPunishment
  #419 = Fieldref           #14.#420      // ext/mods/Config.BOTS_LOGS:Z
  #420 = NameAndType        #421:#412     // BOTS_LOGS:Z
  #421 = Utf8               BOTS_LOGS
  #422 = Fieldref           #8.#423       // ext/mods/gameserver/data/manager/BotsPreventionManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #423 = NameAndType        #424:#425     // LOGGER:Lext/mods/commons/logging/CLogger;
  #424 = Utf8               LOGGER
  #425 = Utf8               Lext/mods/commons/logging/CLogger;
  #426 = Methodref          #110.#427     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #427 = NameAndType        #38:#428      // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #428 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #429 = InvokeDynamic      #3:#430       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #430 = NameAndType        #194:#431     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #431 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #432 = Methodref          #433.#434     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #433 = Class              #435          // ext/mods/commons/logging/CLogger
  #434 = NameAndType        #436:#437     // info:(Ljava/lang/Object;)V
  #435 = Utf8               ext/mods/commons/logging/CLogger
  #436 = Utf8               info
  #437 = Utf8               (Ljava/lang/Object;)V
  #438 = Methodref          #22.#439      // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #439 = NameAndType        #440:#441     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #440 = Utf8               getSysString
  #441 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #442 = Class              #443          // java/lang/NumberFormatException
  #443 = Utf8               java/lang/NumberFormatException
  #444 = Methodref          #445.#446     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #445 = Class              #447          // java/lang/Boolean
  #446 = NameAndType        #38:#448      // valueOf:(Z)Ljava/lang/Boolean;
  #447 = Utf8               java/lang/Boolean
  #448 = Utf8               (Z)Ljava/lang/Boolean;
  #449 = Fieldref           #450.#451     // ext/mods/gameserver/data/manager/BotsPreventionManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/BotsPreventionManager;
  #450 = Class              #452          // ext/mods/gameserver/data/manager/BotsPreventionManager$SingletonHolder
  #451 = NameAndType        #453:#454     // INSTANCE:Lext/mods/gameserver/data/manager/BotsPreventionManager;
  #452 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager$SingletonHolder
  #453 = Utf8               INSTANCE
  #454 = Utf8               Lext/mods/gameserver/data/manager/BotsPreventionManager;
  #455 = Methodref          #456.#105     // java/lang/Class.getName:()Ljava/lang/String;
  #456 = Class              #457          // java/lang/Class
  #457 = Utf8               java/lang/Class
  #458 = Methodref          #433.#94      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #459 = Class              #460          // java/util/HashMap
  #460 = Utf8               java/util/HashMap
  #461 = Methodref          #459.#3       // java/util/HashMap."<init>":()V
  #462 = Utf8               ACCESS_LEVEL
  #463 = Utf8               Ljava/lang/String;
  #464 = Utf8               ConstantValue
  #465 = Utf8               UPDATE_JAIL
  #466 = Utf8               Signature
  #467 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #468 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/concurrent/Future<*>;>;
  #469 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData;>;
  #470 = Utf8               Ljava/util/Map<Ljava/lang/Integer;[B>;
  #471 = Utf8               Code
  #472 = Utf8               LineNumberTable
  #473 = Utf8               LocalVariableTable
  #474 = Utf8               this
  #475 = Utf8               updateCounter
  #476 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #477 = Utf8               count
  #478 = Utf8               next
  #479 = Utf8               killer
  #480 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #481 = Utf8               player
  #482 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #483 = Utf8               creature
  #484 = Utf8               StackMapTable
  #485 = Utf8               data
  #486 = Utf8               f
  #487 = Utf8               Ljava/io/RandomAccessFile;
  #488 = Utf8               e
  #489 = Utf8               Ljava/lang/Exception;
  #490 = Utf8               file
  #491 = Utf8               Ljava/io/File;
  #492 = Utf8               directory
  #493 = Utf8               i
  #494 = Class              #495          // "[Ljava/io/File;"
  #495 = Utf8               [Ljava/io/File;
  #496 = Utf8               preValidationWindow
  #497 = Utf8               html
  #498 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #499 = Utf8               tb
  #500 = Utf8               Ljava/lang/StringBuilder;
  #501 = Utf8               container
  #502 = Utf8               Lext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData;
  #503 = Utf8               packet
  #504 = Utf8               Lext/mods/gameserver/network/serverpackets/PledgeCrest;
  #505 = Utf8               newTask
  #506 = Utf8               Ljava/util/concurrent/Future;
  #507 = Utf8               LocalVariableTypeTable
  #508 = Utf8               Ljava/util/concurrent/Future<*>;
  #509 = Utf8               buttonscount
  #510 = Utf8               imagescount
  #511 = Utf8               mainIndex
  #512 = Utf8               token
  #513 = Utf8               Ljava/util/Calendar;
  #514 = Utf8               uniquetoken
  #515 = Utf8               ps
  #516 = Utf8               Ljava/sql/PreparedStatement;
  #517 = Utf8               con
  #518 = Utf8               Ljava/sql/Connection;
  #519 = Utf8               se
  #520 = Utf8               Ljava/sql/SQLException;
  #521 = Utf8               delay
  #522 = Utf8               statement
  #523 = Utf8               targetPlayer
  #524 = Utf8               lvl
  #525 = Utf8               analyseBypass
  #526 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #527 = Utf8               playerData
  #528 = Utf8               command
  #529 = Utf8               params
  #530 = Utf8               choosenOption
  #531 = Utf8               Ljava/lang/NumberFormatException;
  #532 = Utf8               value
  #533 = Utf8               captchaSuccessfull
  #534 = Utf8               isAlredyInReportMode
  #535 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Boolean;
  #536 = Utf8               ()Lext/mods/gameserver/data/manager/BotsPreventionManager;
  #537 = Utf8               <clinit>
  #538 = Utf8               SourceFile
  #539 = Utf8               BotsPreventionManager.java
  #540 = Utf8               NestMembers
  #541 = Utf8               BootstrapMethods
  #542 = String             #543          // <br><br><img src=\"Crest.crest_\u0001_\u0001\" width=\"32\" height=\"32\"></td></tr>
  #543 = Utf8               <br><br><img src=\"Crest.crest_\u0001_\u0001\" width=\"32\" height=\"32\"></td></tr>
  #544 = String             #545          // <td><button action=\"bypass -h report_\u0001\" width=32 height=32 back=\"Crest.crest_\u0001_\u0001\" fore=\"Crest.crest_\u0001_\u0001\"></td>
  #545 = Utf8               <td><button action=\"bypass -h report_\u0001\" width=32 height=32 back=\"Crest.crest_\u0001_\u0001\" fore=\"Crest.crest_\u0001_\u0001\"></td>
  #546 = String             #547          // \u0001\u0001\u0001\u0001\u0001
  #547 = Utf8               \u0001\u0001\u0001\u0001\u0001
  #548 = String             #549          // Detected possible bot \u0001
  #549 = Utf8               Detected possible bot \u0001
  #550 = MethodHandle       6:#551        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #551 = Methodref          #552.#553     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #552 = Class              #554          // java/lang/invoke/StringConcatFactory
  #553 = NameAndType        #194:#555     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #554 = Utf8               java/lang/invoke/StringConcatFactory
  #555 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #556 = Utf8               InnerClasses
  #557 = Utf8               PlayerData
  #558 = Utf8               reportCheckTask
  #559 = Utf8               countdown
  #560 = Utf8               SingletonHolder
  #561 = Class              #562          // java/lang/invoke/MethodHandles$Lookup
  #562 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #563 = Class              #564          // java/lang/invoke/MethodHandles
  #564 = Utf8               java/lang/invoke/MethodHandles
  #565 = Utf8               Lookup
{
  protected static java.util.Map<java.lang.Integer, java.lang.Integer> _monstersCounter;
    descriptor: Ljava/util/Map;
    flags: (0x000c) ACC_PROTECTED, ACC_STATIC
    Signature: #467                         // Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  protected static java.util.Map<java.lang.Integer, java.util.concurrent.Future<?>> _beginValidation;
    descriptor: Ljava/util/Map;
    flags: (0x000c) ACC_PROTECTED, ACC_STATIC
    Signature: #468                         // Ljava/util/Map<Ljava/lang/Integer;Ljava/util/concurrent/Future<*>;>;

  protected static java.util.Map<java.lang.Integer, ext.mods.gameserver.data.manager.BotsPreventionManager$PlayerData> _validation;
    descriptor: Ljava/util/Map;
    flags: (0x000c) ACC_PROTECTED, ACC_STATIC
    Signature: #469                         // Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData;>;

  protected static java.util.Map<java.lang.Integer, byte[]> _images;
    descriptor: Ljava/util/Map;
    flags: (0x000c) ACC_PROTECTED, ACC_STATIC
    Signature: #470                         // Ljava/util/Map<Ljava/lang/Integer;[B>;

  protected int WINDOW_DELAY;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int VALIDATION_TIME;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  ext.mods.gameserver.data.manager.BotsPreventionManager();
    descriptor: ()V
    flags: (0x0000)
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_3
         6: putfield      #7                  // Field WINDOW_DELAY:I
         9: aload_0
        10: getstatic     #13                 // Field ext/mods/Config.VALIDATION_TIME:I
        13: sipush        1000
        16: imul
        17: putfield      #18                 // Field VALIDATION_TIME:I
        20: invokestatic  #19                 // Method getImages:()V
        23: return
      LineNumberTable:
        line 61: 0
        line 57: 4
        line 58: 9
        line 62: 20
        line 63: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager;

  public void updateCounter(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=3
         0: aload_1
         1: instanceof    #22                 // class ext/mods/gameserver/model/actor/Player
         4: ifeq          148
         7: aload_1
         8: checkcast     #22                 // class ext/mods/gameserver/model/actor/Player
        11: astore_3
        12: aload_2
        13: instanceof    #24                 // class ext/mods/gameserver/model/actor/instance/Monster
        16: ifeq          148
        19: getstatic     #26                 // Field _validation:Ljava/util/Map;
        22: aload_3
        23: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        26: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: invokeinterface #40,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        34: ifnull        38
        37: return
        38: iconst_1
        39: istore        4
        41: getstatic     #46                 // Field _monstersCounter:Ljava/util/Map;
        44: aload_3
        45: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        48: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        51: invokeinterface #40,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        56: ifnull        84
        59: getstatic     #46                 // Field _monstersCounter:Ljava/util/Map;
        62: aload_3
        63: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        66: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        69: invokeinterface #40,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        74: checkcast     #35                 // class java/lang/Integer
        77: invokevirtual #49                 // Method java/lang/Integer.intValue:()I
        80: iconst_1
        81: iadd
        82: istore        4
        84: getstatic     #52                 // Field ext/mods/Config.KILLS_COUNTER_RANDOMIZATION:I
        87: invokestatic  #55                 // Method ext/mods/commons/random/Rnd.nextInt:(I)I
        90: istore        5
        92: getstatic     #61                 // Field ext/mods/Config.KILLS_COUNTER:I
        95: iload         5
        97: iadd
        98: iload         4
       100: if_icmpge     127
       103: aload_0
       104: aload_3
       105: invokevirtual #64                 // Method validationTasks:(Lext/mods/gameserver/model/actor/Player;)V
       108: getstatic     #46                 // Field _monstersCounter:Ljava/util/Map;
       111: aload_3
       112: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       115: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       118: invokeinterface #68,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
       123: pop
       124: goto          148
       127: getstatic     #46                 // Field _monstersCounter:Ljava/util/Map;
       130: aload_3
       131: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       134: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       137: iload         4
       139: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       142: invokeinterface #71,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       147: pop
       148: return
      LineNumberTable:
        line 67: 0
        line 69: 19
        line 70: 37
        line 72: 38
        line 73: 41
        line 74: 59
        line 76: 84
        line 77: 92
        line 79: 103
        line 80: 108
        line 83: 127
        line 85: 148
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41     107     4 count   I
           92      56     5  next   I
           12     136     3 killer   Lext/mods/gameserver/model/actor/Player;
            0     149     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager;
            0     149     1 player   Lext/mods/gameserver/model/actor/Creature;
            0     149     2 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 20

  public void preValidationWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: new           #144                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: iconst_1
         5: invokespecial #146                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
         8: astore_2
         9: new           #149                // class java/lang/StringBuilder
        12: dup
        13: invokespecial #151                // Method java/lang/StringBuilder."<init>":()V
        16: astore_3
        17: aload_3
        18: iconst_1
        19: anewarray     #2                  // class java/lang/Object
        22: dup
        23: iconst_0
        24: ldc           #152                // String <html>
        26: aastore
        27: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        30: aload_3
        31: iconst_1
        32: anewarray     #2                  // class java/lang/Object
        35: dup
        36: iconst_0
        37: ldc           #160                // String <title>Bots prevention</title>
        39: aastore
        40: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        43: aload_3
        44: iconst_1
        45: anewarray     #2                  // class java/lang/Object
        48: dup
        49: iconst_0
        50: ldc           #162                // String <body><center><br><br><img src=\"L2UI_CH3.herotower_deco\" width=\"256\" height=\"32\">
        52: aastore
        53: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        56: aload_3
        57: iconst_1
        58: anewarray     #2                  // class java/lang/Object
        61: dup
        62: iconst_0
        63: ldc           #164                // String <br><br><font color=\"a2a0a2\">if such window appears it means server suspect,<br1>that you may using cheating software.</font>
        65: aastore
        66: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        69: aload_3
        70: iconst_1
        71: anewarray     #2                  // class java/lang/Object
        74: dup
        75: iconst_0
        76: ldc           #166                // String <br><br><font color=\"b09979\">if given answer results are incorrect or no action is made<br1>server is going to punish character instantly.</font>
        78: aastore
        79: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        82: aload_3
        83: iconst_1
        84: anewarray     #2                  // class java/lang/Object
        87: dup
        88: iconst_0
        89: ldc           #168                // String <br><br><button value=\"CONTINUE\" action=\"bypass report_continue\" width=\"75\" height=\"21\" back=\"L2UI_CH3.Btn1_normal\" fore=\"L2UI_CH3.Btn1_normal\">
        91: aastore
        92: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        95: aload_3
        96: iconst_1
        97: anewarray     #2                  // class java/lang/Object
       100: dup
       101: iconst_0
       102: ldc           #170                // String </center></body>
       104: aastore
       105: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       108: aload_3
       109: iconst_1
       110: anewarray     #2                  // class java/lang/Object
       113: dup
       114: iconst_0
       115: ldc           #172                // String </html>
       117: aastore
       118: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       121: aload_2
       122: aload_3
       123: invokevirtual #174                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       126: invokevirtual #175                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       129: aload_1
       130: aload_2
       131: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       134: return
      LineNumberTable:
        line 117: 0
        line 118: 9
        line 119: 17
        line 120: 30
        line 121: 43
        line 122: 56
        line 123: 69
        line 124: 82
        line 125: 95
        line 126: 108
        line 127: 121
        line 128: 129
        line 129: 134
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     135     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager;
            0     135     1 player   Lext/mods/gameserver/model/actor/Player;
            9     126     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           17     118     3    tb   Ljava/lang/StringBuilder;

  public void punishmentnWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: new           #144                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: iconst_1
         5: invokespecial #146                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
         8: astore_2
         9: new           #149                // class java/lang/StringBuilder
        12: dup
        13: invokespecial #151                // Method java/lang/StringBuilder."<init>":()V
        16: astore_3
        17: aload_3
        18: iconst_1
        19: anewarray     #2                  // class java/lang/Object
        22: dup
        23: iconst_0
        24: ldc           #152                // String <html>
        26: aastore
        27: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        30: aload_3
        31: iconst_1
        32: anewarray     #2                  // class java/lang/Object
        35: dup
        36: iconst_0
        37: ldc           #160                // String <title>Bots prevention</title>
        39: aastore
        40: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        43: aload_3
        44: iconst_1
        45: anewarray     #2                  // class java/lang/Object
        48: dup
        49: iconst_0
        50: ldc           #162                // String <body><center><br><br><img src=\"L2UI_CH3.herotower_deco\" width=\"256\" height=\"32\">
        52: aastore
        53: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        56: aload_3
        57: iconst_1
        58: anewarray     #2                  // class java/lang/Object
        61: dup
        62: iconst_0
        63: ldc           #217                // String <br><br><font color=\"a2a0a2\">if such window appears, it means character haven\'t<br1>passed through prevention system.
        65: aastore
        66: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        69: aload_3
        70: iconst_1
        71: anewarray     #2                  // class java/lang/Object
        74: dup
        75: iconst_0
        76: ldc           #219                // String <br><br><font color=\"b09979\">in such case character get moved to nearest town.</font>
        78: aastore
        79: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        82: aload_3
        83: iconst_1
        84: anewarray     #2                  // class java/lang/Object
        87: dup
        88: iconst_0
        89: ldc           #170                // String </center></body>
        91: aastore
        92: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        95: aload_3
        96: iconst_1
        97: anewarray     #2                  // class java/lang/Object
       100: dup
       101: iconst_0
       102: ldc           #172                // String </html>
       104: aastore
       105: invokestatic  #154                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       108: aload_2
       109: aload_3
       110: invokevirtual #174                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       113: invokevirtual #175                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       116: aload_1
       117: aload_2
       118: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       121: return
      LineNumberTable:
        line 159: 0
        line 160: 9
        line 161: 17
        line 162: 30
        line 163: 43
        line 164: 56
        line 165: 69
        line 166: 82
        line 167: 95
        line 168: 108
        line 169: 116
        line 170: 121
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     122     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager;
            0     122     1 player   Lext/mods/gameserver/model/actor/Player;
            9     113     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           17     105     3    tb   Ljava/lang/StringBuilder;

  public void validationTasks(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=2
         0: new           #182                // class ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData
         3: dup
         4: aload_0
         5: invokespecial #221                // Method ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData."<init>":(Lext/mods/gameserver/data/manager/BotsPreventionManager;)V
         8: astore_2
         9: aload_0
        10: aload_2
        11: aload_1
        12: invokevirtual #224                // Method randomizeImages:(Lext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData;Lext/mods/gameserver/model/actor/Player;)V
        15: iconst_0
        16: istore_3
        17: iload_3
        18: aload_2
        19: getfield      #200                // Field ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.options:Ljava/util/List;
        22: invokeinterface #204,  1          // InterfaceMethod java/util/List.size:()I
        27: if_icmpge     92
        30: new           #228                // class ext/mods/gameserver/network/serverpackets/PledgeCrest
        33: dup
        34: aload_2
        35: getfield      #200                // Field ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.options:Ljava/util/List;
        38: iload_3
        39: invokeinterface #209,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        44: checkcast     #35                 // class java/lang/Integer
        47: invokevirtual #49                 // Method java/lang/Integer.intValue:()I
        50: sipush        1500
        53: iadd
        54: getstatic     #141                // Field _images:Ljava/util/Map;
        57: aload_2
        58: getfield      #200                // Field ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.options:Ljava/util/List;
        61: iload_3
        62: invokeinterface #209,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        67: invokeinterface #40,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        72: checkcast     #230                // class "[B"
        75: invokespecial #232                // Method ext/mods/gameserver/network/serverpackets/PledgeCrest."<init>":(I[B)V
        78: astore        4
        80: aload_1
        81: aload         4
        83: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        86: iinc          3, 1
        89: goto          17
        92: new           #228                // class ext/mods/gameserver/network/serverpackets/PledgeCrest
        95: dup
        96: aload_2
        97: getfield      #189                // Field ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.patternId:I
       100: getstatic     #141                // Field _images:Ljava/util/Map;
       103: aload_2
       104: getfield      #200                // Field ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.options:Ljava/util/List;
       107: aload_2
       108: getfield      #235                // Field ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.mainPattern:I
       111: invokeinterface #209,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       116: invokeinterface #40,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       121: checkcast     #230                // class "[B"
       124: invokespecial #232                // Method ext/mods/gameserver/network/serverpackets/PledgeCrest."<init>":(I[B)V
       127: astore_3
       128: aload_1
       129: aload_3
       130: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       133: getstatic     #26                 // Field _validation:Ljava/util/Map;
       136: aload_1
       137: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       140: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       143: aload_2
       144: invokeinterface #71,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       149: pop
       150: new           #238                // class ext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask
       153: dup
       154: aload_0
       155: aload_1
       156: invokespecial #240                // Method ext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask."<init>":(Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;)V
       159: aload_0
       160: getfield      #18                 // Field VALIDATION_TIME:I
       163: i2l
       164: invokestatic  #243                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       167: astore        4
       169: new           #249                // class ext/mods/gameserver/data/manager/BotsPreventionManager$countdown
       172: dup
       173: aload_0
       174: aload_1
       175: aload_0
       176: getfield      #18                 // Field VALIDATION_TIME:I
       179: sipush        1000
       182: idiv
       183: invokespecial #251                // Method ext/mods/gameserver/data/manager/BotsPreventionManager$countdown."<init>":(Lext/mods/gameserver/data/manager/BotsPreventionManager;Lext/mods/gameserver/model/actor/Player;I)V
       186: lconst_0
       187: invokestatic  #243                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       190: pop
       191: getstatic     #254                // Field _beginValidation:Ljava/util/Map;
       194: aload_1
       195: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       198: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       201: aload         4
       203: invokeinterface #71,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       208: pop
       209: return
      LineNumberTable:
        line 174: 0
        line 175: 9
        line 177: 15
        line 179: 30
        line 180: 80
        line 177: 86
        line 183: 92
        line 184: 128
        line 186: 133
        line 188: 150
        line 189: 169
        line 190: 191
        line 191: 209
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           80       6     4 packet   Lext/mods/gameserver/network/serverpackets/PledgeCrest;
           17      75     3     i   I
            0     210     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager;
            0     210     1 player   Lext/mods/gameserver/model/actor/Player;
            9     201     2 container   Lext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData;
          128      82     3 packet   Lext/mods/gameserver/network/serverpackets/PledgeCrest;
          169      41     4 newTask   Ljava/util/concurrent/Future;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          169      41     4 newTask   Ljava/util/concurrent/Future<*>;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData, int ]
        frame_type = 250 /* chop */
          offset_delta = 74

  protected void randomizeImages(ext.mods.gameserver.data.manager.BotsPreventionManager$PlayerData, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=8, args_size=3
         0: iconst_4
         1: istore_3
         2: getstatic     #141                // Field _images:Ljava/util/Map;
         5: invokeinterface #257,  1          // InterfaceMethod java/util/Map.size:()I
        10: istore        4
        12: iconst_0
        13: istore        5
        15: iload         5
        17: iload_3
        18: if_icmpge     77
        21: iload         4
        23: invokestatic  #55                 // Method ext/mods/commons/random/Rnd.nextInt:(I)I
        26: istore        6
        28: aload_1
        29: getfield      #200                // Field ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.options:Ljava/util/List;
        32: iload         6
        34: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        37: invokeinterface #258,  2          // InterfaceMethod java/util/List.indexOf:(Ljava/lang/Object;)I
        42: iconst_m1
        43: if_icmple     56
        46: iload         4
        48: invokestatic  #55                 // Method ext/mods/commons/random/Rnd.nextInt:(I)I
        51: istore        6
        53: goto          28
        56: aload_1
        57: getfield      #200                // Field ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.options:Ljava/util/List;
        60: iload         6
        62: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        65: invokeinterface #262,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        70: pop
        71: iinc          5, 1
        74: goto          15
        77: iload_3
        78: invokestatic  #55                 // Method ext/mods/commons/random/Rnd.nextInt:(I)I
        81: istore        5
        83: aload_1
        84: iload         5
        86: putfield      #235                // Field ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.mainPattern:I
        89: invokestatic  #266                // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
        92: astore        6
        94: aload         6
        96: iconst_5
        97: invokevirtual #272                // Method java/util/Calendar.get:(I)I
       100: invokestatic  #274                // Method java/lang/Integer.toString:(I)Ljava/lang/String;
       103: aload         6
       105: bipush        11
       107: invokevirtual #272                // Method java/util/Calendar.get:(I)I
       110: invokestatic  #274                // Method java/lang/Integer.toString:(I)Ljava/lang/String;
       113: aload         6
       115: bipush        12
       117: invokevirtual #272                // Method java/util/Calendar.get:(I)I
       120: invokestatic  #274                // Method java/lang/Integer.toString:(I)Ljava/lang/String;
       123: aload         6
       125: bipush        13
       127: invokevirtual #272                // Method java/util/Calendar.get:(I)I
       130: invokestatic  #274                // Method java/lang/Integer.toString:(I)Ljava/lang/String;
       133: aload         6
       135: bipush        14
       137: invokevirtual #272                // Method java/util/Calendar.get:(I)I
       140: bipush        100
       142: idiv
       143: invokestatic  #274                // Method java/lang/Integer.toString:(I)Ljava/lang/String;
       146: invokedynamic #277,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       151: astore        7
       153: aload_1
       154: aload         7
       156: invokestatic  #280                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       159: putfield      #189                // Field ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.patternId:I
       162: return
      LineNumberTable:
        line 195: 0
        line 196: 2
        line 198: 12
        line 200: 21
        line 201: 28
        line 203: 46
        line 205: 56
        line 198: 71
        line 208: 77
        line 209: 83
        line 211: 89
        line 212: 94
        line 213: 153
        line 214: 162
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           28      43     6  next   I
           15      62     5     i   I
            0     163     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager;
            0     163     1 container   Lext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData;
            0     163     2 player   Lext/mods/gameserver/model/actor/Player;
            2     161     3 buttonscount   I
           12     151     4 imagescount   I
           83      80     5 mainIndex   I
           94      69     6 token   Ljava/util/Calendar;
          153      10     7 uniquetoken   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 15
          locals = [ int, int, int ]
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ int ]
        frame_type = 27 /* same */
        frame_type = 249 /* chop */
          offset_delta = 20

  protected void banPunishment(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: getstatic     #26                 // Field _validation:Ljava/util/Map;
         3: aload_1
         4: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         7: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        10: invokeinterface #68,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        15: pop
        16: getstatic     #254                // Field _beginValidation:Ljava/util/Map;
        19: aload_1
        20: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        23: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        26: invokeinterface #40,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        31: checkcast     #284                // class java/util/concurrent/Future
        34: iconst_1
        35: invokeinterface #286,  2          // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
        40: pop
        41: getstatic     #254                // Field _beginValidation:Ljava/util/Map;
        44: aload_1
        45: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        48: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        51: invokeinterface #68,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        56: pop
        57: getstatic     #290                // Field ext/mods/Config.PUNISHMENT:I
        60: tableswitch   { // 0 to 3

                       0: 92

                       1: 112

                       2: 127

                       3: 140
                 default: 146
            }
        92: aload_1
        93: iconst_1
        94: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.abortAll:(Z)V
        97: aload_1
        98: getstatic     #297                // Field ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
       101: invokevirtual #303                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
       104: aload_0
       105: aload_1
       106: invokevirtual #307                // Method punishmentnWindow:(Lext/mods/gameserver/model/actor/Player;)V
       109: goto          146
       112: aload_1
       113: invokevirtual #310                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       116: ifeq          146
       119: aload_1
       120: iconst_1
       121: invokevirtual #313                // Method ext/mods/gameserver/model/actor/Player.logout:(Z)V
       124: goto          146
       127: aload_1
       128: getstatic     #316                // Field ext/mods/Config.PUNISHMENT_TIME:I
       131: bipush        60
       133: imul
       134: invokestatic  #319                // Method jailPunishment:(Lext/mods/gameserver/model/actor/Player;I)V
       137: goto          146
       140: aload_1
       141: bipush        -100
       143: invokestatic  #323                // Method changeAccessLevel:(Lext/mods/gameserver/model/actor/Player;I)V
       146: aload_1
       147: ldc_w         #326                // String Unfortunately, colours doesn\'t match.
       150: invokevirtual #328                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       153: return
      LineNumberTable:
        line 218: 0
        line 219: 16
        line 220: 41
        line 222: 57
        line 225: 92
        line 226: 97
        line 227: 104
        line 228: 109
        line 230: 112
        line 231: 119
        line 234: 127
        line 235: 137
        line 237: 140
        line 241: 146
        line 242: 153
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     154     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager;
            0     154     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 5
        frame_type = 251 /* same_frame_extended */
          offset_delta = 92
        frame_type = 19 /* same */
        frame_type = 14 /* same */
        frame_type = 12 /* same */
        frame_type = 5 /* same */

  public void analyseBypass(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=3
         0: getstatic     #26                 // Field _validation:Ljava/util/Map;
         3: aload_2
         4: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         7: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        10: invokeinterface #391,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        15: ifne          19
        18: return
        19: aload_1
        20: aload_1
        21: ldc_w         #394                // String _
        24: invokevirtual #396                // Method java/lang/String.indexOf:(Ljava/lang/String;)I
        27: iconst_1
        28: iadd
        29: invokevirtual #398                // Method java/lang/String.substring:(I)Ljava/lang/String;
        32: astore_3
        33: aload_3
        34: ldc_w         #401                // String continue
        37: invokevirtual #403                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        40: ifeq          70
        43: aload_2
        44: invokestatic  #406                // Method validationWindow:(Lext/mods/gameserver/model/actor/Player;)V
        47: getstatic     #26                 // Field _validation:Ljava/util/Map;
        50: aload_2
        51: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        54: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        57: invokeinterface #40,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        62: checkcast     #182                // class ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData
        65: iconst_0
        66: putfield      #409                // Field ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.firstWindow:Z
        69: return
        70: iconst_m1
        71: istore        4
        73: aload_0
        74: aload_3
        75: invokevirtual #413                // Method tryParseInt:(Ljava/lang/String;)Z
        78: ifeq          87
        81: aload_3
        82: invokestatic  #280                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        85: istore        4
        87: iload         4
        89: iconst_m1
        90: if_icmple     224
        93: getstatic     #26                 // Field _validation:Ljava/util/Map;
        96: aload_2
        97: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       100: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       103: invokeinterface #40,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       108: checkcast     #182                // class ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData
       111: astore        5
       113: iload         4
       115: aload         5
       117: getfield      #235                // Field ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData.mainPattern:I
       120: if_icmpeq     152
       123: aload_0
       124: aload_2
       125: invokevirtual #416                // Method banPunishment:(Lext/mods/gameserver/model/actor/Player;)V
       128: getstatic     #419                // Field ext/mods/Config.BOTS_LOGS:Z
       131: ifeq          224
       134: getstatic     #422                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       137: aload_2
       138: invokestatic  #426                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       141: invokedynamic #429,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       146: invokevirtual #432                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       149: goto          224
       152: aload_2
       153: aload_2
       154: sipush        10010
       157: iconst_0
       158: anewarray     #2                  // class java/lang/Object
       161: invokevirtual #438                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       164: invokevirtual #328                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       167: getstatic     #26                 // Field _validation:Ljava/util/Map;
       170: aload_2
       171: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       174: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       177: invokeinterface #68,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
       182: pop
       183: getstatic     #254                // Field _beginValidation:Ljava/util/Map;
       186: aload_2
       187: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       190: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       193: invokeinterface #40,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       198: checkcast     #284                // class java/util/concurrent/Future
       201: iconst_1
       202: invokeinterface #286,  2          // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
       207: pop
       208: getstatic     #254                // Field _beginValidation:Ljava/util/Map;
       211: aload_2
       212: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       215: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       218: invokeinterface #68,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
       223: pop
       224: return
      LineNumberTable:
        line 291: 0
        line 292: 18
        line 294: 19
        line 296: 33
        line 298: 43
        line 299: 47
        line 300: 69
        line 303: 70
        line 304: 73
        line 305: 81
        line 307: 87
        line 309: 93
        line 310: 113
        line 312: 123
        line 313: 128
        line 314: 134
        line 318: 152
        line 319: 167
        line 320: 183
        line 321: 208
        line 324: 224
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          113     111     5 playerData   Lext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData;
            0     225     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager;
            0     225     1 command   Ljava/lang/String;
            0     225     2 player   Lext/mods/gameserver/model/actor/Player;
           33     192     3 params   Ljava/lang/String;
           73     152     4 choosenOption   I
      StackMapTable: number_of_entries = 5
        frame_type = 19 /* same */
        frame_type = 252 /* append */
          offset_delta = 50
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 64
          locals = [ class ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData ]
        frame_type = 250 /* chop */
          offset_delta = 71

  protected boolean tryParseInt(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=3, args_size=2
         0: aload_1
         1: invokestatic  #280                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
         4: pop
         5: iconst_1
         6: ireturn
         7: astore_2
         8: iconst_0
         9: ireturn
      Exception table:
         from    to  target type
             0     6     7   Class java/lang/NumberFormatException
      LineNumberTable:
        line 378: 0
        line 379: 5
        line 382: 7
        line 384: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8       2     2     e   Ljava/lang/NumberFormatException;
            0      10     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager;
            0      10     1 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]

  public void captchaSuccessfull(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #26                 // Field _validation:Ljava/util/Map;
         3: aload_1
         4: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         7: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        10: invokeinterface #40,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        15: ifnull        34
        18: getstatic     #26                 // Field _validation:Ljava/util/Map;
        21: aload_1
        22: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        25: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        28: invokeinterface #68,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        33: pop
        34: return
      LineNumberTable:
        line 390: 0
        line 391: 18
        line 392: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager;
            0      35     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 34 /* same */

  public java.lang.Boolean isAlredyInReportMode(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Boolean;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #26                 // Field _validation:Ljava/util/Map;
         3: aload_1
         4: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         7: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        10: invokeinterface #40,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        15: ifnull        23
        18: iconst_1
        19: invokestatic  #444                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        22: areturn
        23: iconst_0
        24: invokestatic  #444                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        27: areturn
      LineNumberTable:
        line 396: 0
        line 397: 18
        line 399: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/data/manager/BotsPreventionManager;
            0      28     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public static final ext.mods.gameserver.data.manager.BotsPreventionManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/BotsPreventionManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #449                // Field ext/mods/gameserver/data/manager/BotsPreventionManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/BotsPreventionManager;
         3: areturn
      LineNumberTable:
        line 434: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #433                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/data/manager/BotsPreventionManager
         6: invokevirtual #455                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #458                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #422                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: new           #459                // class java/util/HashMap
        18: dup
        19: invokespecial #461                // Method java/util/HashMap."<init>":()V
        22: putstatic     #46                 // Field _monstersCounter:Ljava/util/Map;
        25: new           #459                // class java/util/HashMap
        28: dup
        29: invokespecial #461                // Method java/util/HashMap."<init>":()V
        32: putstatic     #254                // Field _beginValidation:Ljava/util/Map;
        35: new           #459                // class java/util/HashMap
        38: dup
        39: invokespecial #461                // Method java/util/HashMap."<init>":()V
        42: putstatic     #26                 // Field _validation:Ljava/util/Map;
        45: new           #459                // class java/util/HashMap
        48: dup
        49: invokespecial #461                // Method java/util/HashMap."<init>":()V
        52: putstatic     #141                // Field _images:Ljava/util/Map;
        55: return
      LineNumberTable:
        line 48: 0
        line 52: 15
        line 53: 25
        line 54: 35
        line 55: 45
}
SourceFile: "BotsPreventionManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/BotsPreventionManager$SingletonHolder
  ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData
  ext/mods/gameserver/data/manager/BotsPreventionManager$reportCheckTask
  ext/mods/gameserver/data/manager/BotsPreventionManager$countdown
BootstrapMethods:
  0: #550 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #542 <br><br><img src=\"Crest.crest_\u0001_\u0001\" width=\"32\" height=\"32\"></td></tr>
  1: #550 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #544 <td><button action=\"bypass -h report_\u0001\" width=32 height=32 back=\"Crest.crest_\u0001_\u0001\" fore=\"Crest.crest_\u0001_\u0001\"></td>
  2: #550 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #546 \u0001\u0001\u0001\u0001\u0001
  3: #550 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #548 Detected possible bot \u0001
InnerClasses:
  public #557= #182 of #8;                // PlayerData=class ext/mods/gameserver/data/manager/BotsPreventionManager$PlayerData of class ext/mods/gameserver/data/manager/BotsPreventionManager
  protected #559= #249 of #8;             // countdown=class ext/mods/gameserver/data/manager/BotsPreventionManager$countdown of class ext/mods/gameserver/data/manager/BotsPreventionManager
  public static final #565= #561 of #563; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
