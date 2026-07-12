// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminFarmEvent
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminFarmEvent.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.class
  Last modified 9 de jul de 2026; size 26111 bytes
  MD5 checksum b75147f2e8ea27bb0922ca11e72218ea
  Compiled from "AdminFarmEvent.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminFarmEvent implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #63                         // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 6, methods: 19, attributes: 3
Constant pool:
     #1 = Methodref          #2.#3        // java/lang/Object."<init>":()V
     #2 = Class              #4           // java/lang/Object
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               java/lang/Object
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Methodref          #8.#9        // ext/mods/gameserver/model/actor/Player.isGM:()Z
     #8 = Class              #10          // ext/mods/gameserver/model/actor/Player
     #9 = NameAndType        #11:#12      // isGM:()Z
    #10 = Utf8               ext/mods/gameserver/model/actor/Player
    #11 = Utf8               isGM
    #12 = Utf8               ()Z
    #13 = Class              #14          // java/util/StringTokenizer
    #14 = Utf8               java/util/StringTokenizer
    #15 = Methodref          #13.#16      // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
    #16 = NameAndType        #5:#17       // "<init>":(Ljava/lang/String;)V
    #17 = Utf8               (Ljava/lang/String;)V
    #18 = Methodref          #13.#19      // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
    #19 = NameAndType        #20:#21      // nextToken:()Ljava/lang/String;
    #20 = Utf8               nextToken
    #21 = Utf8               ()Ljava/lang/String;
    #22 = Methodref          #13.#23      // java/util/StringTokenizer.hasMoreTokens:()Z
    #23 = NameAndType        #24:#12      // hasMoreTokens:()Z
    #24 = Utf8               hasMoreTokens
    #25 = String             #26          // main
    #26 = Utf8               main
    #27 = String             #28          //
    #28 = Utf8
    #29 = Methodref          #13.#30      // java/util/StringTokenizer.nextToken:(Ljava/lang/String;)Ljava/lang/String;
    #30 = NameAndType        #20:#31      // nextToken:(Ljava/lang/String;)Ljava/lang/String;
    #31 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
    #32 = Methodref          #33.#34      // java/lang/String.trim:()Ljava/lang/String;
    #33 = Class              #35          // java/lang/String
    #34 = NameAndType        #36:#21      // trim:()Ljava/lang/String;
    #35 = Utf8               java/lang/String
    #36 = Utf8               trim
    #37 = Methodref          #33.#38      // java/lang/String.hashCode:()I
    #38 = NameAndType        #39:#40      // hashCode:()I
    #39 = Utf8               hashCode
    #40 = Utf8               ()I
    #41 = Methodref          #33.#42      // java/lang/String.equals:(Ljava/lang/Object;)Z
    #42 = NameAndType        #43:#44      // equals:(Ljava/lang/Object;)Z
    #43 = Utf8               equals
    #44 = Utf8               (Ljava/lang/Object;)Z
    #45 = String             #46          // toggle_global
    #46 = Utf8               toggle_global
    #47 = String             #48          // update_time
    #48 = Utf8               update_time
    #49 = String             #50          // toggle_active
    #50 = Utf8               toggle_active
    #51 = Methodref          #33.#52      // java/lang/String.isEmpty:()Z
    #52 = NameAndType        #53:#12      // isEmpty:()Z
    #53 = Utf8               isEmpty
    #54 = Methodref          #55.#56      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
    #55 = Class              #57          // java/lang/Integer
    #56 = NameAndType        #58:#59      // parseInt:(Ljava/lang/String;)I
    #57 = Utf8               java/lang/Integer
    #58 = Utf8               parseInt
    #59 = Utf8               (Ljava/lang/String;)I
    #60 = Class              #61          // java/lang/NumberFormatException
    #61 = Utf8               java/lang/NumberFormatException
    #62 = Methodref          #63.#64      // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.showMainMenu:(Lext/mods/gameserver/model/actor/Player;I)V
    #63 = Class              #65          // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent
    #64 = NameAndType        #66:#67      // showMainMenu:(Lext/mods/gameserver/model/actor/Player;I)V
    #65 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent
    #66 = Utf8               showMainMenu
    #67 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
    #68 = Methodref          #63.#69      // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.handleToggleGlobal:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    #69 = NameAndType        #70:#71      // handleToggleGlobal:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    #70 = Utf8               handleToggleGlobal
    #71 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    #72 = Methodref          #63.#73      // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.handleUpdateTime:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    #73 = NameAndType        #74:#71      // handleUpdateTime:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    #74 = Utf8               handleUpdateTime
    #75 = String             #76          // activate
    #76 = Utf8               activate
    #77 = Methodref          #63.#78      // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.handleToggleActive:(Lext/mods/gameserver/model/actor/Player;IZ)Z
    #78 = NameAndType        #79:#80      // handleToggleActive:(Lext/mods/gameserver/model/actor/Player;IZ)Z
    #79 = Utf8               handleToggleActive
    #80 = Utf8               (Lext/mods/gameserver/model/actor/Player;IZ)Z
    #81 = InvokeDynamic      #0:#82       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
    #82 = NameAndType        #83:#31      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
    #83 = Utf8               makeConcatWithConstants
    #84 = Methodref          #8.#85       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
    #85 = NameAndType        #86:#17      // sendMessage:(Ljava/lang/String;)V
    #86 = Utf8               sendMessage
    #87 = Class              #88          // java/lang/Exception
    #88 = Utf8               java/lang/Exception
    #89 = Methodref          #87.#90      // java/lang/Exception.getMessage:()Ljava/lang/String;
    #90 = NameAndType        #91:#21      // getMessage:()Ljava/lang/String;
    #91 = Utf8               getMessage
    #92 = InvokeDynamic      #1:#82       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
    #93 = Fieldref           #63.#94      // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.LOGGER:Lext/mods/commons/logging/CLogger;
    #94 = NameAndType        #95:#96      // LOGGER:Lext/mods/commons/logging/CLogger;
    #95 = Utf8               LOGGER
    #96 = Utf8               Lext/mods/commons/logging/CLogger;
    #97 = InvokeDynamic      #2:#82       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
    #98 = Methodref          #99.#100     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
    #99 = Class              #101         // ext/mods/commons/logging/CLogger
   #100 = NameAndType        #102:#103    // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #101 = Utf8               ext/mods/commons/logging/CLogger
   #102 = Utf8               error
   #103 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
   #104 = Methodref          #105.#106    // ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
   #105 = Class              #107         // ext/mods/FarmEventRandom/RandomData
   #106 = NameAndType        #108:#109    // getInstance:()Lext/mods/FarmEventRandom/RandomData;
   #107 = Utf8               ext/mods/FarmEventRandom/RandomData
   #108 = Utf8               getInstance
   #109 = Utf8               ()Lext/mods/FarmEventRandom/RandomData;
   #110 = Methodref          #105.#111    // ext/mods/FarmEventRandom/RandomData.reload:()V
   #111 = NameAndType        #112:#6      // reload:()V
   #112 = Utf8               reload
   #113 = Methodref          #63.#114     // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.loadZoneNamesCache:(Lext/mods/gameserver/model/actor/Player;)V
   #114 = NameAndType        #115:#116    // loadZoneNamesCache:(Lext/mods/gameserver/model/actor/Player;)V
   #115 = Utf8               loadZoneNamesCache
   #116 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #117 = Methodref          #105.#118    // ext/mods/FarmEventRandom/RandomData.getFirstConfig:()Lext/mods/FarmEventRandom/holder/RamdomConfig;
   #118 = NameAndType        #119:#120    // getFirstConfig:()Lext/mods/FarmEventRandom/holder/RamdomConfig;
   #119 = Utf8               getFirstConfig
   #120 = Utf8               ()Lext/mods/FarmEventRandom/holder/RamdomConfig;
   #121 = Class              #122         // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #122 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #123 = Methodref          #121.#124    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #124 = NameAndType        #5:#125      // "<init>":(I)V
   #125 = Utf8               (I)V
   #126 = Class              #127         // java/lang/StringBuilder
   #127 = Utf8               java/lang/StringBuilder
   #128 = Methodref          #126.#3      // java/lang/StringBuilder."<init>":()V
   #129 = String             #130         // <html><title>Farm Event Dashboard</title><body><center>
   #130 = Utf8               <html><title>Farm Event Dashboard</title><body><center>
   #131 = Methodref          #126.#132    // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #132 = NameAndType        #133:#134    // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #133 = Utf8               append
   #134 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #135 = String             #136         // <table width=270><tr>
   #136 = Utf8               <table width=270><tr>
   #137 = String             #138         // <td width=45><button value=\"Main\" action=\"bypass -h admin_admin\" width=40 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
   #138 = Utf8               <td width=45><button value=\"Main\" action=\"bypass -h admin_admin\" width=40 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
   #139 = String             #140         // <td width=180 align=center>Farm Event Manager</td>
   #140 = Utf8               <td width=180 align=center>Farm Event Manager</td>
   #141 = String             #142         // <td width=45><button value=\"Back\" action=\"bypass -h admin_admin 2\" width=40 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
   #142 = Utf8               <td width=45><button value=\"Back\" action=\"bypass -h admin_admin 2\" width=40 height=21 back=\"L2UI_ch3.Btn1_normalOn\" fore=\"L2UI_ch3.Btn1_normal\"></td>
   #143 = String             #144         // </tr></table>
   #144 = Utf8               </tr></table>
   #145 = String             #146         // <font color=FF0000>Erro: random_event.xml não foi carregado ou está vazio.</font>
   #146 = Utf8               <font color=FF0000>Erro: random_event.xml não foi carregado ou está vazio.</font>
   #147 = String             #148         // <br><font color=FFFF00>O arquivo pode estar corrompido. Conserte-o manualmente e use //reload farm_event</font>
   #148 = Utf8               <br><font color=FFFF00>O arquivo pode estar corrompido. Conserte-o manualmente e use //reload farm_event</font>
   #149 = String             #150         // </center></body></html>
   #150 = Utf8               </center></body></html>
   #151 = Methodref          #126.#152    // java/lang/StringBuilder.toString:()Ljava/lang/String;
   #152 = NameAndType        #153:#21     // toString:()Ljava/lang/String;
   #153 = Utf8               toString
   #154 = Methodref          #121.#155    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
   #155 = NameAndType        #156:#17     // setHtml:(Ljava/lang/String;)V
   #156 = Utf8               setHtml
   #157 = Methodref          #8.#158      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #158 = NameAndType        #159:#160    // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #159 = Utf8               sendPacket
   #160 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #161 = String             #162         // <table width=280 bgcolor=333333><tr>
   #162 = Utf8               <table width=280 bgcolor=333333><tr>
   #163 = String             #164         // <td width=280 align=center>Configuracoes Globais</td>
   #164 = Utf8               <td width=280 align=center>Configuracoes Globais</td>
   #165 = String             #166         // <table width=280>
   #166 = Utf8               <table width=280>
   #167 = Methodref          #168.#169    // ext/mods/FarmEventRandom/holder/RamdomConfig.isEnabled:()Z
   #168 = Class              #170         // ext/mods/FarmEventRandom/holder/RamdomConfig
   #169 = NameAndType        #171:#12     // isEnabled:()Z
   #170 = Utf8               ext/mods/FarmEventRandom/holder/RamdomConfig
   #171 = Utf8               isEnabled
   #172 = String             #173         // <font color=00FF00>Habilitado</font>
   #173 = Utf8               <font color=00FF00>Habilitado</font>
   #174 = String             #175         // <font color=FF0000>Desabilitado</font>
   #175 = Utf8               <font color=FF0000>Desabilitado</font>
   #176 = String             #177         // OFF
   #177 = Utf8               OFF
   #178 = String             #179         // ON
   #179 = Utf8               ON
   #180 = String             #181         // disable
   #181 = Utf8               disable
   #182 = String             #183         // enable
   #183 = Utf8               enable
   #184 = String             #185         // <tr><td width=100>Evento:</td>
   #185 = Utf8               <tr><td width=100>Evento:</td>
   #186 = InvokeDynamic      #3:#82       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #187 = InvokeDynamic      #4:#188      // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #188 = NameAndType        #83:#189     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #189 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #190 = String             #191         // </tr>
   #191 = Utf8               </tr>
   #192 = Methodref          #168.#193    // ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
   #193 = NameAndType        #194:#21     // getName:()Ljava/lang/String;
   #194 = Utf8               getName
   #195 = InvokeDynamic      #5:#82       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #196 = Methodref          #168.#197    // ext/mods/FarmEventRandom/holder/RamdomConfig.getZoneValue:()I
   #197 = NameAndType        #198:#40     // getZoneValue:()I
   #198 = Utf8               getZoneValue
   #199 = InvokeDynamic      #6:#200      // #6:makeConcatWithConstants:(I)Ljava/lang/String;
   #200 = NameAndType        #83:#201     // makeConcatWithConstants:(I)Ljava/lang/String;
   #201 = Utf8               (I)Ljava/lang/String;
   #202 = Methodref          #168.#203    // ext/mods/FarmEventRandom/holder/RamdomConfig.getActiveTimes:()Ljava/util/List;
   #203 = NameAndType        #204:#205    // getActiveTimes:()Ljava/util/List;
   #204 = Utf8               getActiveTimes
   #205 = Utf8               ()Ljava/util/List;
   #206 = InterfaceMethodref #207.#52     // java/util/List.isEmpty:()Z
   #207 = Class              #208         // java/util/List
   #208 = Utf8               java/util/List
   #209 = InterfaceMethodref #207.#210    // java/util/List.stream:()Ljava/util/stream/Stream;
   #210 = NameAndType        #211:#212    // stream:()Ljava/util/stream/Stream;
   #211 = Utf8               stream
   #212 = Utf8               ()Ljava/util/stream/Stream;
   #213 = InvokeDynamic      #7:#214      // #7:apply:()Ljava/util/function/Function;
   #214 = NameAndType        #215:#216    // apply:()Ljava/util/function/Function;
   #215 = Utf8               apply
   #216 = Utf8               ()Ljava/util/function/Function;
   #217 = InterfaceMethodref #218.#219    // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #218 = Class              #220         // java/util/stream/Stream
   #219 = NameAndType        #221:#222    // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #220 = Utf8               java/util/stream/Stream
   #221 = Utf8               map
   #222 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #223 = String             #224         // ;
   #224 = Utf8               ;
   #225 = Methodref          #226.#227    // java/util/stream/Collectors.joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
   #226 = Class              #228         // java/util/stream/Collectors
   #227 = NameAndType        #229:#230    // joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
   #228 = Utf8               java/util/stream/Collectors
   #229 = Utf8               joining
   #230 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
   #231 = InterfaceMethodref #218.#232    // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #232 = NameAndType        #233:#234    // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #233 = Utf8               collect
   #234 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
   #235 = String             #236         // <tr>
   #236 = Utf8               <tr>
   #237 = String             #238         // Nenhum
   #238 = Utf8               Nenhum
   #239 = InvokeDynamic      #8:#82       // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #240 = String             #241         // <td width=80><edit var=\"times\" width=70 length=50></td>
   #241 = Utf8               <td width=80><edit var=\"times\" width=70 length=50></td>
   #242 = String             #243         // <td width=70 align=right><button value=\"Salvar\" action=\"bypass -h admin_farm_event update_time $times\" width=60 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
   #243 = Utf8               <td width=70 align=right><button value=\"Salvar\" action=\"bypass -h admin_farm_event update_time $times\" width=60 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
   #244 = Methodref          #168.#245    // ext/mods/FarmEventRandom/holder/RamdomConfig.getPrepareMinutes:()I
   #245 = NameAndType        #246:#40     // getPrepareMinutes:()I
   #246 = Utf8               getPrepareMinutes
   #247 = InvokeDynamic      #9:#200      // #9:makeConcatWithConstants:(I)Ljava/lang/String;
   #248 = Methodref          #168.#249    // ext/mods/FarmEventRandom/holder/RamdomConfig.getInterval:()I
   #249 = NameAndType        #250:#40     // getInterval:()I
   #250 = Utf8               getInterval
   #251 = InvokeDynamic      #10:#200     // #10:makeConcatWithConstants:(I)Ljava/lang/String;
   #252 = Methodref          #168.#253    // ext/mods/FarmEventRandom/holder/RamdomConfig.getAnnounceEndMinutes:()I
   #253 = NameAndType        #254:#40     // getAnnounceEndMinutes:()I
   #254 = Utf8               getAnnounceEndMinutes
   #255 = InvokeDynamic      #11:#200     // #11:makeConcatWithConstants:(I)Ljava/lang/String;
   #256 = String             #257         // </table>
   #257 = Utf8               </table>
   #258 = String             #259         // <font color=AAAAAA>Para editar (Nome, Rates, Drops, etc), edite o XML manualmente.</font>
   #259 = Utf8               <font color=AAAAAA>Para editar (Nome, Rates, Drops, etc), edite o XML manualmente.</font>
   #260 = Methodref          #105.#261    // ext/mods/FarmEventRandom/RandomData.getAllZoneData:(Ljava/lang/String;)Ljava/util/Collection;
   #261 = NameAndType        #262:#263    // getAllZoneData:(Ljava/lang/String;)Ljava/util/Collection;
   #262 = Utf8               getAllZoneData
   #263 = Utf8               (Ljava/lang/String;)Ljava/util/Collection;
   #264 = Class              #265         // java/util/ArrayList
   #265 = Utf8               java/util/ArrayList
   #266 = Methodref          #264.#267    // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
   #267 = NameAndType        #5:#268      // "<init>":(Ljava/util/Collection;)V
   #268 = Utf8               (Ljava/util/Collection;)V
   #269 = InterfaceMethodref #207.#270    // java/util/List.size:()I
   #270 = NameAndType        #271:#40     // size:()I
   #271 = Utf8               size
   #272 = Double             5.0d
   #274 = Methodref          #275.#276    // java/lang/Math.ceil:(D)D
   #275 = Class              #277         // java/lang/Math
   #276 = NameAndType        #278:#279    // ceil:(D)D
   #277 = Utf8               java/lang/Math
   #278 = Utf8               ceil
   #279 = Utf8               (D)D
   #280 = Methodref          #275.#281    // java/lang/Math.min:(II)I
   #281 = NameAndType        #282:#283    // min:(II)I
   #282 = Utf8               min
   #283 = Utf8               (II)I
   #284 = Methodref          #275.#285    // java/lang/Math.max:(II)I
   #285 = NameAndType        #286:#283    // max:(II)I
   #286 = Utf8               max
   #287 = String             #288         // <br>Nenhuma zona (<spawns>) configurada em random_event.xml.
   #288 = Utf8               <br>Nenhuma zona (<spawns>) configurada em random_event.xml.
   #289 = InvokeDynamic      #12:#290     // #12:makeConcatWithConstants:(II)Ljava/lang/String;
   #290 = NameAndType        #83:#291     // makeConcatWithConstants:(II)Ljava/lang/String;
   #291 = Utf8               (II)Ljava/lang/String;
   #292 = InterfaceMethodref #207.#293    // java/util/List.get:(I)Ljava/lang/Object;
   #293 = NameAndType        #294:#295    // get:(I)Ljava/lang/Object;
   #294 = Utf8               get
   #295 = Utf8               (I)Ljava/lang/Object;
   #296 = Class              #297         // ext/mods/FarmEventRandom/holder/RandomZoneData
   #297 = Utf8               ext/mods/FarmEventRandom/holder/RandomZoneData
   #298 = Methodref          #296.#299    // ext/mods/FarmEventRandom/holder/RandomZoneData.getZoneId:()I
   #299 = NameAndType        #300:#40     // getZoneId:()I
   #300 = Utf8               getZoneId
   #301 = Methodref          #63.#302     // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.getZoneName:(I)Ljava/lang/String;
   #302 = NameAndType        #303:#201    // getZoneName:(I)Ljava/lang/String;
   #303 = Utf8               getZoneName
   #304 = Methodref          #296.#305    // ext/mods/FarmEventRandom/holder/RandomZoneData.isActive:()Z
   #305 = NameAndType        #306:#12     // isActive:()Z
   #306 = Utf8               isActive
   #307 = String             #308         // 00FF00
   #308 = Utf8               00FF00
   #309 = String             #310         // AAAAAA
   #310 = Utf8               AAAAAA
   #311 = String             #312         // <table width=280 border=0 bgcolor=333333><tr>
   #312 = Utf8               <table width=280 border=0 bgcolor=333333><tr>
   #313 = InvokeDynamic      #13:#314     // #13:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #314 = NameAndType        #83:#315     // makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #315 = Utf8               (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #316 = String             #317         // Desativar
   #317 = Utf8               Desativar
   #318 = String             #319         // Ativar
   #319 = Utf8               Ativar
   #320 = String             #321         // deactivate
   #321 = Utf8               deactivate
   #322 = InvokeDynamic      #14:#323     // #14:makeConcatWithConstants:(ILjava/lang/String;I)Ljava/lang/String;
   #323 = NameAndType        #83:#324     // makeConcatWithConstants:(ILjava/lang/String;I)Ljava/lang/String;
   #324 = Utf8               (ILjava/lang/String;I)Ljava/lang/String;
   #325 = InvokeDynamic      #15:#188     // #15:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #326 = String             #327         // <table width=280 border=0 bgcolor=222222>
   #327 = Utf8               <table width=280 border=0 bgcolor=222222>
   #328 = Methodref          #296.#329    // ext/mods/FarmEventRandom/holder/RandomZoneData.getDefaultTitle:()Ljava/lang/String;
   #329 = NameAndType        #330:#21     // getDefaultTitle:()Ljava/lang/String;
   #330 = Utf8               getDefaultTitle
   #331 = InvokeDynamic      #16:#82      // #16:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #332 = Methodref          #296.#333    // ext/mods/FarmEventRandom/holder/RandomZoneData.useOriginals:()Z
   #333 = NameAndType        #334:#12     // useOriginals:()Z
   #334 = Utf8               useOriginals
   #335 = Methodref          #296.#336    // ext/mods/FarmEventRandom/holder/RandomZoneData.getCustomSpawns:()Ljava/util/List;
   #336 = NameAndType        #337:#205    // getCustomSpawns:()Ljava/util/List;
   #337 = Utf8               getCustomSpawns
   #338 = String             #339         // Originais (Modo 1)
   #339 = Utf8               Originais (Modo 1)
   #340 = String             #341         // Hibrido (Modo 3)
   #341 = Utf8               Hibrido (Modo 3)
   #342 = String             #343         // Custom (Modo 2)
   #343 = Utf8               Custom (Modo 2)
   #344 = InvokeDynamic      #17:#82      // #17:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #345 = Methodref          #296.#346    // ext/mods/FarmEventRandom/holder/RandomZoneData.dropsOriginals:()Z
   #346 = NameAndType        #347:#12     // dropsOriginals:()Z
   #347 = Utf8               dropsOriginals
   #348 = String             #349         // <font color=00FF00>Adicionar</font>
   #349 = Utf8               <font color=00FF00>Adicionar</font>
   #350 = String             #351         // <font color=FFFF00>Substituir</font>
   #351 = Utf8               <font color=FFFF00>Substituir</font>
   #352 = String             #353         // N/A
   #353 = Utf8               N/A
   #354 = InvokeDynamic      #18:#82      // #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #355 = Methodref          #296.#356    // ext/mods/FarmEventRandom/holder/RandomZoneData.getRateXp:()D
   #356 = NameAndType        #357:#358    // getRateXp:()D
   #357 = Utf8               getRateXp
   #358 = Utf8               ()D
   #359 = Methodref          #296.#360    // ext/mods/FarmEventRandom/holder/RandomZoneData.getRateSp:()D
   #360 = NameAndType        #361:#358    // getRateSp:()D
   #361 = Utf8               getRateSp
   #362 = Methodref          #296.#363    // ext/mods/FarmEventRandom/holder/RandomZoneData.getRateAdena:()D
   #363 = NameAndType        #364:#358    // getRateAdena:()D
   #364 = Utf8               getRateAdena
   #365 = InvokeDynamic      #19:#366     // #19:makeConcatWithConstants:(DDD)Ljava/lang/String;
   #366 = NameAndType        #83:#367     // makeConcatWithConstants:(DDD)Ljava/lang/String;
   #367 = Utf8               (DDD)Ljava/lang/String;
   #368 = Methodref          #296.#369    // ext/mods/FarmEventRandom/holder/RandomZoneData.getDefaultRespawnDelay:()I
   #369 = NameAndType        #370:#40     // getDefaultRespawnDelay:()I
   #370 = Utf8               getDefaultRespawnDelay
   #371 = String             #372         // Padrao
   #372 = Utf8               Padrao
   #373 = InvokeDynamic      #20:#200     // #20:makeConcatWithConstants:(I)Ljava/lang/String;
   #374 = InvokeDynamic      #21:#82      // #21:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #375 = Methodref          #296.#376    // ext/mods/FarmEventRandom/holder/RandomZoneData.getDefaultDrops:()Ljava/util/List;
   #376 = NameAndType        #377:#205    // getDefaultDrops:()Ljava/util/List;
   #377 = Utf8               getDefaultDrops
   #378 = Methodref          #63.#379     // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.formatDrops:(Ljava/util/List;)Ljava/lang/String;
   #379 = NameAndType        #380:#381    // formatDrops:(Ljava/util/List;)Ljava/lang/String;
   #380 = Utf8               formatDrops
   #381 = Utf8               (Ljava/util/List;)Ljava/lang/String;
   #382 = InvokeDynamic      #22:#82      // #22:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #383 = InvokeDynamic      #23:#200     // #23:makeConcatWithConstants:(I)Ljava/lang/String;
   #384 = Methodref          #296.#385    // ext/mods/FarmEventRandom/holder/RandomZoneData.isVip:()Z
   #385 = NameAndType        #386:#12     // isVip:()Z
   #386 = Utf8               isVip
   #387 = String             #388         // <font color=00FF00>Sim</font>
   #388 = Utf8               <font color=00FF00>Sim</font>
   #389 = String             #390         // <font color=AAAAAA>Não</font>
   #390 = Utf8               <font color=AAAAAA>Não</font>
   #391 = InvokeDynamic      #24:#82      // #24:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #392 = Methodref          #296.#393    // ext/mods/FarmEventRandom/holder/RandomZoneData.isPartyZone:()Z
   #393 = NameAndType        #394:#12     // isPartyZone:()Z
   #394 = Utf8               isPartyZone
   #395 = InvokeDynamic      #25:#82      // #25:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #396 = Methodref          #296.#397    // ext/mods/FarmEventRandom/holder/RandomZoneData.getMinPartySize:()I
   #397 = NameAndType        #398:#40     // getMinPartySize:()I
   #398 = Utf8               getMinPartySize
   #399 = Methodref          #33.#400     // java/lang/String.valueOf:(I)Ljava/lang/String;
   #400 = NameAndType        #401:#201    // valueOf:(I)Ljava/lang/String;
   #401 = Utf8               valueOf
   #402 = InvokeDynamic      #26:#82      // #26:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #403 = String             #404         // <br>
   #404 = Utf8               <br>
   #405 = String             #406         // <br><table width=280><tr>
   #406 = Utf8               <br><table width=280><tr>
   #407 = InvokeDynamic      #27:#200     // #27:makeConcatWithConstants:(I)Ljava/lang/String;
   #408 = String             #409         // <td width=100></td>
   #409 = Utf8               <td width=100></td>
   #410 = InvokeDynamic      #28:#290     // #28:makeConcatWithConstants:(II)Ljava/lang/String;
   #411 = InvokeDynamic      #29:#200     // #29:makeConcatWithConstants:(I)Ljava/lang/String;
   #412 = String             #413         // \n
   #413 = Utf8               \n
   #414 = Methodref          #33.#415     // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #415 = NameAndType        #416:#417    // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #416 = Utf8               replace
   #417 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #418 = String             #419         // \r
   #419 = Utf8               \r
   #420 = String             #421         // Campo de horário estava vazio. Nenhum dado alterado.
   #421 = Utf8               Campo de horário estava vazio. Nenhum dado alterado.
   #422 = Methodref          #63.#423     // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.updateGlobalConfig:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
   #423 = NameAndType        #424:#425    // updateGlobalConfig:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
   #424 = Utf8               updateGlobalConfig
   #425 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
   #426 = Methodref          #427.#428    // ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
   #427 = Class              #429         // ext/mods/Crypta/RandomManager
   #428 = NameAndType        #108:#430    // getInstance:()Lext/mods/Crypta/RandomManager;
   #429 = Utf8               ext/mods/Crypta/RandomManager
   #430 = Utf8               ()Lext/mods/Crypta/RandomManager;
   #431 = Methodref          #427.#111    // ext/mods/Crypta/RandomManager.reload:()V
   #432 = InvokeDynamic      #30:#82      // #30:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #433 = Methodref          #33.#434     // java/lang/String.valueOf:(Z)Ljava/lang/String;
   #434 = NameAndType        #401:#435    // valueOf:(Z)Ljava/lang/String;
   #435 = Utf8               (Z)Ljava/lang/String;
   #436 = String             #437         // HABILITADO
   #437 = Utf8               HABILITADO
   #438 = String             #439         // DESABILITADO
   #439 = Utf8               DESABILITADO
   #440 = InvokeDynamic      #31:#82      // #31:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #441 = Class              #442         // java/io/File
   #442 = Utf8               java/io/File
   #443 = String             #444         // data/custom/mods/random_event.xml
   #444 = Utf8               data/custom/mods/random_event.xml
   #445 = Methodref          #441.#16     // java/io/File."<init>":(Ljava/lang/String;)V
   #446 = Methodref          #63.#447     // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.makeBackup:(Ljava/io/File;Lext/mods/gameserver/model/actor/Player;)Z
   #447 = NameAndType        #448:#449    // makeBackup:(Ljava/io/File;Lext/mods/gameserver/model/actor/Player;)Z
   #448 = Utf8               makeBackup
   #449 = Utf8               (Ljava/io/File;Lext/mods/gameserver/model/actor/Player;)Z
   #450 = Methodref          #63.#451     // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.loadXML:(Ljava/io/File;)Lorg/w3c/dom/Document;
   #451 = NameAndType        #452:#453    // loadXML:(Ljava/io/File;)Lorg/w3c/dom/Document;
   #452 = Utf8               loadXML
   #453 = Utf8               (Ljava/io/File;)Lorg/w3c/dom/Document;
   #454 = String             #455         // config
   #455 = Utf8               config
   #456 = InterfaceMethodref #457.#458    // org/w3c/dom/Document.getElementsByTagName:(Ljava/lang/String;)Lorg/w3c/dom/NodeList;
   #457 = Class              #459         // org/w3c/dom/Document
   #458 = NameAndType        #460:#461    // getElementsByTagName:(Ljava/lang/String;)Lorg/w3c/dom/NodeList;
   #459 = Utf8               org/w3c/dom/Document
   #460 = Utf8               getElementsByTagName
   #461 = Utf8               (Ljava/lang/String;)Lorg/w3c/dom/NodeList;
   #462 = InterfaceMethodref #463.#464    // org/w3c/dom/NodeList.getLength:()I
   #463 = Class              #465         // org/w3c/dom/NodeList
   #464 = NameAndType        #466:#40     // getLength:()I
   #465 = Utf8               org/w3c/dom/NodeList
   #466 = Utf8               getLength
   #467 = String             #468         // ERRO: Nenhuma tag <config> encontrada no data/custom/mods/random_event.xml
   #468 = Utf8               ERRO: Nenhuma tag <config> encontrada no data/custom/mods/random_event.xml
   #469 = Methodref          #63.#470     // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.restoreBackup:(Ljava/io/File;Lext/mods/gameserver/model/actor/Player;)V
   #470 = NameAndType        #471:#472    // restoreBackup:(Ljava/io/File;Lext/mods/gameserver/model/actor/Player;)V
   #471 = Utf8               restoreBackup
   #472 = Utf8               (Ljava/io/File;Lext/mods/gameserver/model/actor/Player;)V
   #473 = InterfaceMethodref #463.#474    // org/w3c/dom/NodeList.item:(I)Lorg/w3c/dom/Node;
   #474 = NameAndType        #475:#476    // item:(I)Lorg/w3c/dom/Node;
   #475 = Utf8               item
   #476 = Utf8               (I)Lorg/w3c/dom/Node;
   #477 = Class              #478         // org/w3c/dom/Element
   #478 = Utf8               org/w3c/dom/Element
   #479 = InterfaceMethodref #477.#480    // org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
   #480 = NameAndType        #481:#482    // setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
   #481 = Utf8               setAttribute
   #482 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #483 = String             #484         // name
   #484 = Utf8               name
   #485 = String             #486         // prepareMinutes
   #486 = Utf8               prepareMinutes
   #487 = String             #488         // intervalHours
   #488 = Utf8               intervalHours
   #489 = String             #490         // select
   #490 = Utf8               select
   #491 = String             #492         // announceEnd
   #492 = Utf8               announceEnd
   #493 = String             #494         // days
   #494 = Utf8               days
   #495 = String             #496         // times
   #496 = Utf8               times
   #497 = Methodref          #63.#498     // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.saveXML:(Ljava/io/File;Lorg/w3c/dom/Document;Z)Z
   #498 = NameAndType        #499:#500    // saveXML:(Ljava/io/File;Lorg/w3c/dom/Document;Z)Z
   #499 = Utf8               saveXML
   #500 = Utf8               (Ljava/io/File;Lorg/w3c/dom/Document;Z)Z
   #501 = String             #502         // ERRO CRÍTICO ao salvar o XML. Restaurando backup. Verifique o console.
   #502 = Utf8               ERRO CRÍTICO ao salvar o XML. Restaurando backup. Verifique o console.
   #503 = String             #504         // [AdminFarmEvent] Falha ao parsear ou salvar o data/custom/mods/random_event.xml
   #504 = Utf8               [AdminFarmEvent] Falha ao parsear ou salvar o data/custom/mods/random_event.xml
   #505 = String             #506         // spawns
   #506 = Utf8               spawns
   #507 = String             #508         // zoneId
   #508 = Utf8               zoneId
   #509 = Methodref          #63.#510     // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.findNode:(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;
   #510 = NameAndType        #511:#512    // findNode:(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;
   #511 = Utf8               findNode
   #512 = Utf8               (Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;
   #513 = InvokeDynamic      #32:#200     // #32:makeConcatWithConstants:(I)Ljava/lang/String;
   #514 = String             #515         // active
   #515 = Utf8               active
   #516 = String             #517         // ERRO CRÍTICO ao salvar o XML. Restaurando backup.
   #517 = Utf8               ERRO CRÍTICO ao salvar o XML. Restaurando backup.
   #518 = Fieldref           #63.#519     // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent._zoneNamesCache:Ljava/util/Map;
   #519 = NameAndType        #520:#521    // _zoneNamesCache:Ljava/util/Map;
   #520 = Utf8               _zoneNamesCache
   #521 = Utf8               Ljava/util/Map;
   #522 = InterfaceMethodref #523.#52     // java/util/Map.isEmpty:()Z
   #523 = Class              #524         // java/util/Map
   #524 = Utf8               java/util/Map
   #525 = String             #526         // data/xml/zones/RandomZone.xml
   #526 = Utf8               data/xml/zones/RandomZone.xml
   #527 = Methodref          #441.#528    // java/io/File.exists:()Z
   #528 = NameAndType        #529:#12     // exists:()Z
   #529 = Utf8               exists
   #530 = String             #531         // Aviso: data/xml/zones/RandomZone.xml nao encontrado. Nomes das zonas nao serao exibidos.
   #531 = Utf8               Aviso: data/xml/zones/RandomZone.xml nao encontrado. Nomes das zonas nao serao exibidos.
   #532 = String             #533         // [AdminFarmEvent] data/xml/zones/RandomZone.xml nao encontrado. Cache de nomes vazio.
   #533 = Utf8               [AdminFarmEvent] data/xml/zones/RandomZone.xml nao encontrado. Cache de nomes vazio.
   #534 = Methodref          #99.#535     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #535 = NameAndType        #536:#537    // warn:(Ljava/lang/Object;)V
   #536 = Utf8               warn
   #537 = Utf8               (Ljava/lang/Object;)V
   #538 = String             #539         // zone
   #539 = Utf8               zone
   #540 = InterfaceMethodref #541.#542    // org/w3c/dom/Node.getNodeType:()S
   #541 = Class              #543         // org/w3c/dom/Node
   #542 = NameAndType        #544:#545    // getNodeType:()S
   #543 = Utf8               org/w3c/dom/Node
   #544 = Utf8               getNodeType
   #545 = Utf8               ()S
   #546 = InterfaceMethodref #541.#547    // org/w3c/dom/Node.getChildNodes:()Lorg/w3c/dom/NodeList;
   #547 = NameAndType        #548:#549    // getChildNodes:()Lorg/w3c/dom/NodeList;
   #548 = Utf8               getChildNodes
   #549 = Utf8               ()Lorg/w3c/dom/NodeList;
   #550 = InterfaceMethodref #541.#551    // org/w3c/dom/Node.getNodeName:()Ljava/lang/String;
   #551 = NameAndType        #552:#21     // getNodeName:()Ljava/lang/String;
   #552 = Utf8               getNodeName
   #553 = String             #554         // stat
   #554 = Utf8               stat
   #555 = InterfaceMethodref #477.#556    // org/w3c/dom/Element.getAttribute:(Ljava/lang/String;)Ljava/lang/String;
   #556 = NameAndType        #557:#31     // getAttribute:(Ljava/lang/String;)Ljava/lang/String;
   #557 = Utf8               getAttribute
   #558 = String             #559         // id
   #559 = Utf8               id
   #560 = String             #561         // val
   #561 = Utf8               val
   #562 = Methodref          #55.#563     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #563 = NameAndType        #401:#564    // valueOf:(I)Ljava/lang/Integer;
   #564 = Utf8               (I)Ljava/lang/Integer;
   #565 = InterfaceMethodref #523.#566    // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #566 = NameAndType        #567:#568    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #567 = Utf8               put
   #568 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #569 = InterfaceMethodref #523.#270    // java/util/Map.size:()I
   #570 = InvokeDynamic      #33:#200     // #33:makeConcatWithConstants:(I)Ljava/lang/String;
   #571 = Methodref          #99.#572     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #572 = NameAndType        #573:#537    // info:(Ljava/lang/Object;)V
   #573 = Utf8               info
   #574 = String             #575         // Erro ao carregar data/xml/zones/RandomZone.xml. Nomes podem nao aparecer.
   #575 = Utf8               Erro ao carregar data/xml/zones/RandomZone.xml. Nomes podem nao aparecer.
   #576 = String             #577         // [AdminFarmEvent] Falha ao carregar data/xml/zones/RandomZone.xml
   #577 = Utf8               [AdminFarmEvent] Falha ao carregar data/xml/zones/RandomZone.xml
   #578 = String             #579         // Zona Invalida
   #579 = Utf8               Zona Invalida
   #580 = InterfaceMethodref #523.#581    // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #581 = NameAndType        #582:#568    // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #582 = Utf8               getOrDefault
   #583 = Methodref          #441.#193    // java/io/File.getName:()Ljava/lang/String;
   #584 = InvokeDynamic      #34:#82      // #34:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #585 = Methodref          #441.#586    // java/io/File.getAbsolutePath:()Ljava/lang/String;
   #586 = NameAndType        #587:#21     // getAbsolutePath:()Ljava/lang/String;
   #587 = Utf8               getAbsolutePath
   #588 = String             #589         // .xml
   #589 = Utf8               .xml
   #590 = String             #591         // .xml.bak
   #591 = Utf8               .xml.bak
   #592 = Methodref          #441.#593    // java/io/File.toPath:()Ljava/nio/file/Path;
   #593 = NameAndType        #594:#595    // toPath:()Ljava/nio/file/Path;
   #594 = Utf8               toPath
   #595 = Utf8               ()Ljava/nio/file/Path;
   #596 = Class              #597         // java/nio/file/CopyOption
   #597 = Utf8               java/nio/file/CopyOption
   #598 = Fieldref           #599.#600    // java/nio/file/StandardCopyOption.REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;
   #599 = Class              #601         // java/nio/file/StandardCopyOption
   #600 = NameAndType        #602:#603    // REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;
   #601 = Utf8               java/nio/file/StandardCopyOption
   #602 = Utf8               REPLACE_EXISTING
   #603 = Utf8               Ljava/nio/file/StandardCopyOption;
   #604 = Methodref          #605.#606    // java/nio/file/Files.copy:(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
   #605 = Class              #607         // java/nio/file/Files
   #606 = NameAndType        #608:#609    // copy:(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
   #607 = Utf8               java/nio/file/Files
   #608 = Utf8               copy
   #609 = Utf8               (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
   #610 = Class              #611         // java/io/IOException
   #611 = Utf8               java/io/IOException
   #612 = InvokeDynamic      #35:#82      // #35:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #613 = InvokeDynamic      #36:#82      // #36:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #614 = InvokeDynamic      #37:#82      // #37:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #615 = Methodref          #99.#616     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
   #616 = NameAndType        #102:#537    // error:(Ljava/lang/Object;)V
   #617 = InvokeDynamic      #38:#82      // #38:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #618 = InvokeDynamic      #39:#82      // #39:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #619 = InvokeDynamic      #40:#82      // #40:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #620 = InvokeDynamic      #41:#82      // #41:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #621 = String             #622         // ERRO CRÍTICO: Falha ao restaurar backup. Verifique o console!
   #622 = Utf8               ERRO CRÍTICO: Falha ao restaurar backup. Verifique o console!
   #623 = Methodref          #624.#625    // javax/xml/parsers/DocumentBuilderFactory.newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
   #624 = Class              #626         // javax/xml/parsers/DocumentBuilderFactory
   #625 = NameAndType        #627:#628    // newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
   #626 = Utf8               javax/xml/parsers/DocumentBuilderFactory
   #627 = Utf8               newInstance
   #628 = Utf8               ()Ljavax/xml/parsers/DocumentBuilderFactory;
   #629 = String             #630         // http://apache.org/xml/features/disallow-doctype-decl
   #630 = Utf8               http://apache.org/xml/features/disallow-doctype-decl
   #631 = Methodref          #624.#632    // javax/xml/parsers/DocumentBuilderFactory.setFeature:(Ljava/lang/String;Z)V
   #632 = NameAndType        #633:#634    // setFeature:(Ljava/lang/String;Z)V
   #633 = Utf8               setFeature
   #634 = Utf8               (Ljava/lang/String;Z)V
   #635 = String             #636         // http://xml.org/sax/features/external-general-entities
   #636 = Utf8               http://xml.org/sax/features/external-general-entities
   #637 = String             #638         // http://xml.org/sax/features/external-parameter-entities
   #638 = Utf8               http://xml.org/sax/features/external-parameter-entities
   #639 = Methodref          #624.#640    // javax/xml/parsers/DocumentBuilderFactory.setExpandEntityReferences:(Z)V
   #640 = NameAndType        #641:#642    // setExpandEntityReferences:(Z)V
   #641 = Utf8               setExpandEntityReferences
   #642 = Utf8               (Z)V
   #643 = Methodref          #624.#644    // javax/xml/parsers/DocumentBuilderFactory.setIgnoringComments:(Z)V
   #644 = NameAndType        #645:#642    // setIgnoringComments:(Z)V
   #645 = Utf8               setIgnoringComments
   #646 = Methodref          #624.#647    // javax/xml/parsers/DocumentBuilderFactory.setCoalescing:(Z)V
   #647 = NameAndType        #648:#642    // setCoalescing:(Z)V
   #648 = Utf8               setCoalescing
   #649 = Methodref          #624.#650    // javax/xml/parsers/DocumentBuilderFactory.setIgnoringElementContentWhitespace:(Z)V
   #650 = NameAndType        #651:#642    // setIgnoringElementContentWhitespace:(Z)V
   #651 = Utf8               setIgnoringElementContentWhitespace
   #652 = Methodref          #605.#653    // java/nio/file/Files.readAllBytes:(Ljava/nio/file/Path;)[B
   #653 = NameAndType        #654:#655    // readAllBytes:(Ljava/nio/file/Path;)[B
   #654 = Utf8               readAllBytes
   #655 = Utf8               (Ljava/nio/file/Path;)[B
   #656 = Fieldref           #657.#658    // java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
   #657 = Class              #659         // java/nio/charset/StandardCharsets
   #658 = NameAndType        #660:#661    // UTF_8:Ljava/nio/charset/Charset;
   #659 = Utf8               java/nio/charset/StandardCharsets
   #660 = Utf8               UTF_8
   #661 = Utf8               Ljava/nio/charset/Charset;
   #662 = Methodref          #33.#663     // java/lang/String."<init>":([BLjava/nio/charset/Charset;)V
   #663 = NameAndType        #5:#664      // "<init>":([BLjava/nio/charset/Charset;)V
   #664 = Utf8               ([BLjava/nio/charset/Charset;)V
   #665 = String             #666         //  
   #666 = Utf8                
   #667 = String             #668         //
   #668 = Utf8
   #669 = Methodref          #33.#670     // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #670 = NameAndType        #671:#189    // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #671 = Utf8               replaceAll
   #672 = String             #673         // ?
   #673 = Utf8               ?
   #674 = Methodref          #33.#675     // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #675 = NameAndType        #676:#677    // startsWith:(Ljava/lang/String;)Z
   #676 = Utf8               startsWith
   #677 = Utf8               (Ljava/lang/String;)Z
   #678 = Methodref          #33.#679     // java/lang/String.substring:(I)Ljava/lang/String;
   #679 = NameAndType        #680:#201    // substring:(I)Ljava/lang/String;
   #680 = Utf8               substring
   #681 = Methodref          #624.#682    // javax/xml/parsers/DocumentBuilderFactory.newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
   #682 = NameAndType        #683:#684    // newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
   #683 = Utf8               newDocumentBuilder
   #684 = Utf8               ()Ljavax/xml/parsers/DocumentBuilder;
   #685 = Class              #686         // org/xml/sax/InputSource
   #686 = Utf8               org/xml/sax/InputSource
   #687 = Class              #688         // java/io/StringReader
   #688 = Utf8               java/io/StringReader
   #689 = Methodref          #687.#16     // java/io/StringReader."<init>":(Ljava/lang/String;)V
   #690 = Methodref          #685.#691    // org/xml/sax/InputSource."<init>":(Ljava/io/Reader;)V
   #691 = NameAndType        #5:#692      // "<init>":(Ljava/io/Reader;)V
   #692 = Utf8               (Ljava/io/Reader;)V
   #693 = Methodref          #694.#695    // javax/xml/parsers/DocumentBuilder.parse:(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
   #694 = Class              #696         // javax/xml/parsers/DocumentBuilder
   #695 = NameAndType        #697:#698    // parse:(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
   #696 = Utf8               javax/xml/parsers/DocumentBuilder
   #697 = Utf8               parse
   #698 = Utf8               (Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
   #699 = InterfaceMethodref #457.#700    // org/w3c/dom/Document.getDocumentElement:()Lorg/w3c/dom/Element;
   #700 = NameAndType        #701:#702    // getDocumentElement:()Lorg/w3c/dom/Element;
   #701 = Utf8               getDocumentElement
   #702 = Utf8               ()Lorg/w3c/dom/Element;
   #703 = InterfaceMethodref #477.#704    // org/w3c/dom/Element.normalize:()V
   #704 = NameAndType        #705:#6      // normalize:()V
   #705 = Utf8               normalize
   #706 = Methodref          #707.#708    // javax/xml/transform/TransformerFactory.newInstance:()Ljavax/xml/transform/TransformerFactory;
   #707 = Class              #709         // javax/xml/transform/TransformerFactory
   #708 = NameAndType        #627:#710    // newInstance:()Ljavax/xml/transform/TransformerFactory;
   #709 = Utf8               javax/xml/transform/TransformerFactory
   #710 = Utf8               ()Ljavax/xml/transform/TransformerFactory;
   #711 = Methodref          #707.#712    // javax/xml/transform/TransformerFactory.newTransformer:()Ljavax/xml/transform/Transformer;
   #712 = NameAndType        #713:#714    // newTransformer:()Ljavax/xml/transform/Transformer;
   #713 = Utf8               newTransformer
   #714 = Utf8               ()Ljavax/xml/transform/Transformer;
   #715 = Class              #716         // javax/xml/transform/OutputKeys
   #716 = Utf8               javax/xml/transform/OutputKeys
   #717 = String             #718         // omit-xml-declaration
   #718 = Utf8               omit-xml-declaration
   #719 = String             #720         // yes
   #720 = Utf8               yes
   #721 = Methodref          #722.#723    // javax/xml/transform/Transformer.setOutputProperty:(Ljava/lang/String;Ljava/lang/String;)V
   #722 = Class              #724         // javax/xml/transform/Transformer
   #723 = NameAndType        #725:#482    // setOutputProperty:(Ljava/lang/String;Ljava/lang/String;)V
   #724 = Utf8               javax/xml/transform/Transformer
   #725 = Utf8               setOutputProperty
   #726 = String             #727         // encoding
   #727 = Utf8               encoding
   #728 = String             #729         // UTF-8
   #729 = Utf8               UTF-8
   #730 = Class              #731         // java/io/StringWriter
   #731 = Utf8               java/io/StringWriter
   #732 = Methodref          #730.#3      // java/io/StringWriter."<init>":()V
   #733 = Class              #734         // javax/xml/transform/dom/DOMSource
   #734 = Utf8               javax/xml/transform/dom/DOMSource
   #735 = Methodref          #733.#736    // javax/xml/transform/dom/DOMSource."<init>":(Lorg/w3c/dom/Node;)V
   #736 = NameAndType        #5:#737      // "<init>":(Lorg/w3c/dom/Node;)V
   #737 = Utf8               (Lorg/w3c/dom/Node;)V
   #738 = Class              #739         // javax/xml/transform/stream/StreamResult
   #739 = Utf8               javax/xml/transform/stream/StreamResult
   #740 = Methodref          #738.#741    // javax/xml/transform/stream/StreamResult."<init>":(Ljava/io/Writer;)V
   #741 = NameAndType        #5:#742      // "<init>":(Ljava/io/Writer;)V
   #742 = Utf8               (Ljava/io/Writer;)V
   #743 = Methodref          #722.#744    // javax/xml/transform/Transformer.transform:(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
   #744 = NameAndType        #745:#746    // transform:(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
   #745 = Utf8               transform
   #746 = Utf8               (Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
   #747 = Methodref          #730.#152    // java/io/StringWriter.toString:()Ljava/lang/String;
   #748 = InvokeDynamic      #42:#82      // #42:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #749 = Class              #750         // java/nio/file/OpenOption
   #750 = Utf8               java/nio/file/OpenOption
   #751 = Methodref          #605.#752    // java/nio/file/Files.newBufferedWriter:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;
   #752 = NameAndType        #753:#754    // newBufferedWriter:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;
   #753 = Utf8               newBufferedWriter
   #754 = Utf8               (Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;
   #755 = Methodref          #756.#757    // java/io/Writer.write:(Ljava/lang/String;)V
   #756 = Class              #758         // java/io/Writer
   #757 = NameAndType        #759:#17     // write:(Ljava/lang/String;)V
   #758 = Utf8               java/io/Writer
   #759 = Utf8               write
   #760 = Methodref          #756.#761    // java/io/Writer.close:()V
   #761 = NameAndType        #762:#6      // close:()V
   #762 = Utf8               close
   #763 = Class              #764         // java/lang/Throwable
   #764 = Utf8               java/lang/Throwable
   #765 = Methodref          #763.#766    // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #766 = NameAndType        #767:#768    // addSuppressed:(Ljava/lang/Throwable;)V
   #767 = Utf8               addSuppressed
   #768 = Utf8               (Ljava/lang/Throwable;)V
   #769 = String             #770         // no
   #770 = Utf8               no
   #771 = Methodref          #738.#772    // javax/xml/transform/stream/StreamResult."<init>":(Ljava/io/File;)V
   #772 = NameAndType        #5:#773      // "<init>":(Ljava/io/File;)V
   #773 = Utf8               (Ljava/io/File;)V
   #774 = Methodref          #775.#776    // javax/xml/xpath/XPathFactory.newInstance:()Ljavax/xml/xpath/XPathFactory;
   #775 = Class              #777         // javax/xml/xpath/XPathFactory
   #776 = NameAndType        #627:#778    // newInstance:()Ljavax/xml/xpath/XPathFactory;
   #777 = Utf8               javax/xml/xpath/XPathFactory
   #778 = Utf8               ()Ljavax/xml/xpath/XPathFactory;
   #779 = Methodref          #775.#780    // javax/xml/xpath/XPathFactory.newXPath:()Ljavax/xml/xpath/XPath;
   #780 = NameAndType        #781:#782    // newXPath:()Ljavax/xml/xpath/XPath;
   #781 = Utf8               newXPath
   #782 = Utf8               ()Ljavax/xml/xpath/XPath;
   #783 = InvokeDynamic      #43:#784     // #43:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #784 = NameAndType        #83:#785     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #785 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #786 = InterfaceMethodref #787.#788    // javax/xml/xpath/XPath.compile:(Ljava/lang/String;)Ljavax/xml/xpath/XPathExpression;
   #787 = Class              #789         // javax/xml/xpath/XPath
   #788 = NameAndType        #790:#791    // compile:(Ljava/lang/String;)Ljavax/xml/xpath/XPathExpression;
   #789 = Utf8               javax/xml/xpath/XPath
   #790 = Utf8               compile
   #791 = Utf8               (Ljava/lang/String;)Ljavax/xml/xpath/XPathExpression;
   #792 = Fieldref           #793.#794    // javax/xml/xpath/XPathConstants.NODE:Ljavax/xml/namespace/QName;
   #793 = Class              #795         // javax/xml/xpath/XPathConstants
   #794 = NameAndType        #796:#797    // NODE:Ljavax/xml/namespace/QName;
   #795 = Utf8               javax/xml/xpath/XPathConstants
   #796 = Utf8               NODE
   #797 = Utf8               Ljavax/xml/namespace/QName;
   #798 = InterfaceMethodref #799.#800    // javax/xml/xpath/XPathExpression.evaluate:(Ljava/lang/Object;Ljavax/xml/namespace/QName;)Ljava/lang/Object;
   #799 = Class              #801         // javax/xml/xpath/XPathExpression
   #800 = NameAndType        #802:#803    // evaluate:(Ljava/lang/Object;Ljavax/xml/namespace/QName;)Ljava/lang/Object;
   #801 = Utf8               javax/xml/xpath/XPathExpression
   #802 = Utf8               evaluate
   #803 = Utf8               (Ljava/lang/Object;Ljavax/xml/namespace/QName;)Ljava/lang/Object;
   #804 = Long               2l
   #806 = InterfaceMethodref #218.#807    // java/util/stream/Stream.limit:(J)Ljava/util/stream/Stream;
   #807 = NameAndType        #808:#809    // limit:(J)Ljava/util/stream/Stream;
   #808 = Utf8               limit
   #809 = Utf8               (J)Ljava/util/stream/Stream;
   #810 = InvokeDynamic      #44:#214     // #44:apply:()Ljava/util/function/Function;
   #811 = String             #812         // ,
   #812 = Utf8               ,
   #813 = InvokeDynamic      #45:#82      // #45:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #814 = Fieldref           #63.#815     // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.ADMIN_COMMANDS:[Ljava/lang/String;
   #815 = NameAndType        #816:#817    // ADMIN_COMMANDS:[Ljava/lang/String;
   #816 = Utf8               ADMIN_COMMANDS
   #817 = Utf8               [Ljava/lang/String;
   #818 = Methodref          #819.#820    // ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
   #819 = Class              #821         // ext/mods/FarmEventRandom/holder/DropHolder
   #820 = NameAndType        #822:#40     // getItemId:()I
   #821 = Utf8               ext/mods/FarmEventRandom/holder/DropHolder
   #822 = Utf8               getItemId
   #823 = Methodref          #819.#824    // ext/mods/FarmEventRandom/holder/DropHolder.getChance:()I
   #824 = NameAndType        #825:#40     // getChance:()I
   #825 = Utf8               getChance
   #826 = InvokeDynamic      #46:#290     // #46:makeConcatWithConstants:(II)Ljava/lang/String;
   #827 = String             #828         // HH:mm
   #828 = Utf8               HH:mm
   #829 = Methodref          #830.#831    // java/time/format/DateTimeFormatter.ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
   #830 = Class              #832         // java/time/format/DateTimeFormatter
   #831 = NameAndType        #833:#834    // ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
   #832 = Utf8               java/time/format/DateTimeFormatter
   #833 = Utf8               ofPattern
   #834 = Utf8               (Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
   #835 = Methodref          #836.#837    // java/time/LocalTime.format:(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
   #836 = Class              #838         // java/time/LocalTime
   #837 = NameAndType        #839:#840    // format:(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
   #838 = Utf8               java/time/LocalTime
   #839 = Utf8               format
   #840 = Utf8               (Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
   #841 = Methodref          #842.#193    // java/lang/Class.getName:()Ljava/lang/String;
   #842 = Class              #843         // java/lang/Class
   #843 = Utf8               java/lang/Class
   #844 = Methodref          #99.#16      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
   #845 = String             #846         // admin_farm_event
   #846 = Utf8               admin_farm_event
   #847 = Class              #848         // java/util/HashMap
   #848 = Utf8               java/util/HashMap
   #849 = Methodref          #847.#3      // java/util/HashMap."<init>":()V
   #850 = Class              #851         // ext/mods/gameserver/handler/IAdminCommandHandler
   #851 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
   #852 = Utf8               EVENT_XML_FILE
   #853 = Utf8               Ljava/lang/String;
   #854 = Utf8               ConstantValue
   #855 = Utf8               ZONE_XML_FILE
   #856 = Utf8               Signature
   #857 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;
   #858 = Utf8               ZONES_PER_PAGE
   #859 = Utf8               I
   #860 = Integer            5
   #861 = Utf8               Code
   #862 = Utf8               LineNumberTable
   #863 = Utf8               LocalVariableTable
   #864 = Utf8               this
   #865 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent;
   #866 = Utf8               useAdminCommand
   #867 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #868 = Utf8               status
   #869 = Utf8               currentPage
   #870 = Utf8               e
   #871 = Utf8               Ljava/lang/Exception;
   #872 = Utf8               command
   #873 = Utf8               player
   #874 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #875 = Utf8               st
   #876 = Utf8               Ljava/util/StringTokenizer;
   #877 = Utf8               action
   #878 = Utf8               bypassParams
   #879 = Utf8               StackMapTable
   #880 = Utf8               zData
   #881 = Utf8               Lext/mods/FarmEventRandom/holder/RandomZoneData;
   #882 = Utf8               zoneName
   #883 = Utf8               zoneStatusColor
   #884 = Utf8               actionLabelZone
   #885 = Utf8               actionBypassZone
   #886 = Utf8               toggleBypass
   #887 = Utf8               modo
   #888 = Utf8               dropsOrig
   #889 = Utf8               vipStatus
   #890 = Utf8               partyStatus
   #891 = Utf8               minParty
   #892 = Utf8               i
   #893 = Utf8               page
   #894 = Utf8               Lext/mods/FarmEventRandom/holder/RamdomConfig;
   #895 = Utf8               html
   #896 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
   #897 = Utf8               sb
   #898 = Utf8               Ljava/lang/StringBuilder;
   #899 = Utf8               actionLabel
   #900 = Utf8               actionBypass
   #901 = Utf8               timesList
   #902 = Utf8               allZoneDataCollection
   #903 = Utf8               Ljava/util/Collection;
   #904 = Utf8               allZoneDataList
   #905 = Utf8               Ljava/util/List;
   #906 = Utf8               totalZones
   #907 = Utf8               totalPages
   #908 = Utf8               startIndex
   #909 = Utf8               endIndex
   #910 = Utf8               LocalVariableTypeTable
   #911 = Utf8               Ljava/util/Collection<Lext/mods/FarmEventRandom/holder/RandomZoneData;>;
   #912 = Utf8               Ljava/util/List<Lext/mods/FarmEventRandom/holder/RandomZoneData;>;
   #913 = Class              #914         // java/util/Collection
   #914 = Utf8               java/util/Collection
   #915 = Utf8               RandomManagerIntance
   #916 = Utf8               Ljava/lang/Object;
   #917 = Utf8               cleanedTimes
   #918 = Utf8               newStatus
   #919 = Utf8               Z
   #920 = Utf8               doc
   #921 = Utf8               Lorg/w3c/dom/Document;
   #922 = Utf8               configNodes
   #923 = Utf8               Lorg/w3c/dom/NodeList;
   #924 = Utf8               configNode
   #925 = Utf8               Lorg/w3c/dom/Element;
   #926 = Utf8               prepare
   #927 = Utf8               interval
   #928 = Utf8               announce
   #929 = Utf8               xmlFile
   #930 = Utf8               Ljava/io/File;
   #931 = Utf8               spawnNode
   #932 = Utf8               statElement
   #933 = Utf8               nameAttr
   #934 = Utf8               statNode
   #935 = Utf8               Lorg/w3c/dom/Node;
   #936 = Utf8               j
   #937 = Utf8               statNodes
   #938 = Utf8               zoneNode
   #939 = Utf8               zoneNodes
   #940 = Utf8               zoneFile
   #941 = Utf8               Ljava/io/IOException;
   #942 = Utf8               backupPath
   #943 = Utf8               backupFile
   #944 = Utf8               file
   #945 = Utf8               dbFactory
   #946 = Utf8               Ljavax/xml/parsers/DocumentBuilderFactory;
   #947 = Utf8               content
   #948 = Utf8               dBuilder
   #949 = Utf8               Ljavax/xml/parsers/DocumentBuilder;
   #950 = Utf8               Exceptions
   #951 = Utf8               fileWriter
   #952 = Utf8               Ljava/io/Writer;
   #953 = Utf8               writer
   #954 = Utf8               Ljava/io/StringWriter;
   #955 = Utf8               xmlContent
   #956 = Utf8               finalXml
   #957 = Utf8               source
   #958 = Utf8               Ljavax/xml/transform/dom/DOMSource;
   #959 = Utf8               result
   #960 = Utf8               Ljavax/xml/transform/stream/StreamResult;
   #961 = Utf8               isFragileParser
   #962 = Utf8               transformerFactory
   #963 = Utf8               Ljavax/xml/transform/TransformerFactory;
   #964 = Utf8               transformer
   #965 = Utf8               Ljavax/xml/transform/Transformer;
   #966 = Utf8               tagName
   #967 = Utf8               attributeName
   #968 = Utf8               attributeValue
   #969 = Utf8               xPath
   #970 = Utf8               Ljavax/xml/xpath/XPath;
   #971 = Utf8               expr
   #972 = Utf8               Ljavax/xml/xpath/XPathExpression;
   #973 = Utf8               node
   #974 = Utf8               drops
   #975 = Utf8               dropList
   #976 = Utf8               Ljava/util/List<Lext/mods/FarmEventRandom/holder/DropHolder;>;
   #977 = Utf8               (Ljava/util/List<Lext/mods/FarmEventRandom/holder/DropHolder;>;)Ljava/lang/String;
   #978 = Utf8               getAdminCommandList
   #979 = Utf8               ()[Ljava/lang/String;
   #980 = Utf8               lambda$formatDrops$0
   #981 = Utf8               (Lext/mods/FarmEventRandom/holder/DropHolder;)Ljava/lang/String;
   #982 = Utf8               d
   #983 = Utf8               Lext/mods/FarmEventRandom/holder/DropHolder;
   #984 = Utf8               lambda$showMainMenu$0
   #985 = Utf8               (Ljava/time/LocalTime;)Ljava/lang/String;
   #986 = Utf8               t
   #987 = Utf8               Ljava/time/LocalTime;
   #988 = Utf8               <clinit>
   #989 = Utf8               SourceFile
   #990 = Utf8               AdminFarmEvent.java
   #991 = Utf8               BootstrapMethods
   #992 = String             #993         // Função \'\u0001\' desconhecida ou desabilitada.
   #993 = Utf8               Função \'\u0001\' desconhecida ou desabilitada.
   #994 = String             #995         // Erro ao processar comando: \u0001
   #995 = Utf8               Erro ao processar comando: \u0001
   #996 = String             #997         // [AdminFarmEvent] Erro no useAdminCommand (Action: \u0001):
   #997 = Utf8               [AdminFarmEvent] Erro no useAdminCommand (Action: \u0001):
   #998 = String             #999         // <td width=110>\u0001</td>
   #999 = Utf8               <td width=110>\u0001</td>
  #1000 = String             #1001        // <td width=70 align=right><button value=\"\u0001\" action=\"bypass -h admin_farm_event toggle_global \u0001\" width=60 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
  #1001 = Utf8               <td width=70 align=right><button value=\"\u0001\" action=\"bypass -h admin_farm_event toggle_global \u0001\" width=60 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
  #1002 = String             #1003        // <tr><td>Nome:</td><td colspan=2 width=180>\u0001</td></tr>
  #1003 = Utf8               <tr><td>Nome:</td><td colspan=2 width=180>\u0001</td></tr>
  #1004 = String             #1005        // <tr><td>Sorteio:</td><td colspan=2>Selecionando <font color=LEVEL>\u0001</font> zona(s).</td></tr>
  #1005 = Utf8               <tr><td>Sorteio:</td><td colspan=2>Selecionando <font color=LEVEL>\u0001</font> zona(s).</td></tr>
  #1006 = MethodType         #1007        //  (Ljava/lang/Object;)Ljava/lang/Object;
  #1007 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #1008 = MethodHandle       6:#1009      // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.lambda$showMainMenu$0:(Ljava/time/LocalTime;)Ljava/lang/String;
  #1009 = Methodref          #63.#1010    // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.lambda$showMainMenu$0:(Ljava/time/LocalTime;)Ljava/lang/String;
  #1010 = NameAndType        #984:#985    // lambda$showMainMenu$0:(Ljava/time/LocalTime;)Ljava/lang/String;
  #1011 = MethodType         #985         //  (Ljava/time/LocalTime;)Ljava/lang/String;
  #1012 = String             #1013        // <td width=130>Horario(s): \u0001</td>
  #1013 = Utf8               <td width=130>Horario(s): \u0001</td>
  #1014 = String             #1015        // <tr><td>Aviso Prévio:</td><td colspan=2>\u0001 min(s)</td></tr>
  #1015 = Utf8               <tr><td>Aviso Prévio:</td><td colspan=2>\u0001 min(s)</td></tr>
  #1016 = String             #1017        // <tr><td>Duracao:</td><td colspan=2>\u0001 hora(s)</td></tr>
  #1017 = Utf8               <tr><td>Duracao:</td><td colspan=2>\u0001 hora(s)</td></tr>
  #1018 = String             #1019        // <tr><td>Anuncio Auto:</td><td colspan=2>A cada \u0001 min(s)</td></tr>
  #1019 = Utf8               <tr><td>Anuncio Auto:</td><td colspan=2>A cada \u0001 min(s)</td></tr>
  #1020 = String             #1021        // <br><table width=280><tr><td align=center>Zonas Configuradas (Pagina \u0001 de \u0001)</td></tr></table>
  #1021 = Utf8               <br><table width=280><tr><td align=center>Zonas Configuradas (Pagina \u0001 de \u0001)</td></tr></table>
  #1022 = String             #1023        // <td width=200><font color=\u0001>ID \u0001 (\u0001)</font></td>
  #1023 = Utf8               <td width=200><font color=\u0001>ID \u0001 (\u0001)</font></td>
  #1024 = String             #1025        // bypass -h admin_farm_event toggle_active \u0001 \u0001 \u0001
  #1025 = Utf8               bypass -h admin_farm_event toggle_active \u0001 \u0001 \u0001
  #1026 = String             #1027        // <td width=80 align=right><button value=\"\u0001\" action=\"\u0001\" width=70 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
  #1027 = Utf8               <td width=80 align=right><button value=\"\u0001\" action=\"\u0001\" width=70 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
  #1028 = String             #1029        // <tr><td width=100>Titulo:</td><td width=180>\u0001</td></tr>
  #1029 = Utf8               <tr><td width=100>Titulo:</td><td width=180>\u0001</td></tr>
  #1030 = String             #1031        // <tr><td>Modo:</td><td>\u0001</td></tr>
  #1031 = Utf8               <tr><td>Modo:</td><td>\u0001</td></tr>
  #1032 = String             #1033        // <tr><td>Drops Originais:</td><td>\u0001</td></tr>
  #1033 = Utf8               <tr><td>Drops Originais:</td><td>\u0001</td></tr>
  #1034 = String             #1035        // <tr><td>Rates (X/S/A):</td><td>\u0001x / \u0001x / \u0001x</td></tr>
  #1035 = Utf8               <tr><td>Rates (X/S/A):</td><td>\u0001x / \u0001x / \u0001x</td></tr>
  #1036 = String             #1037        // \u0001s
  #1037 = Utf8               \u0001s
  #1038 = String             #1039        // <tr><td>Respawn (Orig.):</td><td>\u0001</td></tr>
  #1039 = Utf8               <tr><td>Respawn (Orig.):</td><td>\u0001</td></tr>
  #1040 = String             #1041        // <tr><td valign=top>Drops (Evento):</td><td>\u0001</td></tr>
  #1041 = Utf8               <tr><td valign=top>Drops (Evento):</td><td>\u0001</td></tr>
  #1042 = String             #1043        // <tr><td>Spawns Custom:</td><td>\u0001 definidos</td></tr>
  #1043 = Utf8               <tr><td>Spawns Custom:</td><td>\u0001 definidos</td></tr>
  #1044 = String             #1045        // <tr><td>Requer VIP:</td><td>\u0001</td></tr>
  #1045 = Utf8               <tr><td>Requer VIP:</td><td>\u0001</td></tr>
  #1046 = String             #1047        // <tr><td>Requer Party:</td><td>\u0001</td></tr>
  #1047 = Utf8               <tr><td>Requer Party:</td><td>\u0001</td></tr>
  #1048 = String             #1049        // <tr><td>Min. Party:</td><td>\u0001</td></tr>
  #1049 = Utf8               <tr><td>Min. Party:</td><td>\u0001</td></tr>
  #1050 = String             #1051        // <td width=100 align=left><button value=\"<< Anterior\" action=\"bypass -h admin_farm_event main \u0001\" width=80 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
  #1051 = Utf8               <td width=100 align=left><button value=\"<< Anterior\" action=\"bypass -h admin_farm_event main \u0001\" width=80 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
  #1052 = String             #1053        // <td width=80 align=center>Pag. \u0001/\u0001</td>
  #1053 = Utf8               <td width=80 align=center>Pag. \u0001/\u0001</td>
  #1054 = String             #1055        // <td width=100 align=right><button value=\"Próxima >>\" action=\"bypass -h admin_farm_event main \u0001\" width=80 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
  #1055 = Utf8               <td width=100 align=right><button value=\"Próxima >>\" action=\"bypass -h admin_farm_event main \u0001\" width=80 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
  #1056 = String             #1057        // Horários do evento atualizados para \'\u0001\' e mod recarregado.
  #1057 = Utf8               Horários do evento atualizados para \'\u0001\' e mod recarregado.
  #1058 = String             #1059        // Evento \u0001. Mod recarregado.
  #1059 = Utf8               Evento \u0001. Mod recarregado.
  #1060 = String             #1061        // ERRO: Não foi possível encontrar <spawns zoneId=\"\u0001\"> no XML.
  #1061 = Utf8               ERRO: Não foi possível encontrar <spawns zoneId=\"\u0001\"> no XML.
  #1062 = String             #1063        // [AdminFarmEvent] Carregado \u0001 nomes de zonas para o cache.
  #1063 = Utf8               [AdminFarmEvent] Carregado \u0001 nomes de zonas para o cache.
  #1064 = String             #1065        // ERRO: Arquivo \u0001 não encontrado para backup.
  #1065 = Utf8               ERRO: Arquivo \u0001 não encontrado para backup.
  #1066 = String             #1067        // [AdminFarmEvent] Falha ao criar backup: \u0001
  #1067 = Utf8               [AdminFarmEvent] Falha ao criar backup: \u0001
  #1068 = String             #1069        // ERRO: Falha ao criar backup de \u0001. Abortando.
  #1069 = Utf8               ERRO: Falha ao criar backup de \u0001. Abortando.
  #1070 = String             #1071        // [AdminFarmEvent] Backup não encontrado, não foi possível restaurar: \u0001
  #1071 = Utf8               [AdminFarmEvent] Backup não encontrado, não foi possível restaurar: \u0001
  #1072 = String             #1073        // ERRO CRÍTICO: Backup \u0001 não foi encontrado!
  #1073 = Utf8               ERRO CRÍTICO: Backup \u0001 não foi encontrado!
  #1074 = String             #1075        // [AdminFarmEvent] Backup restaurado: \u0001
  #1075 = Utf8               [AdminFarmEvent] Backup restaurado: \u0001
  #1076 = String             #1077        // Um backup do \u0001 foi restaurado.
  #1077 = Utf8               Um backup do \u0001 foi restaurado.
  #1078 = String             #1079        // [AdminFarmEvent] FALHA CRÍTICA ao restaurar backup: \u0001
  #1079 = Utf8               [AdminFarmEvent] FALHA CRÍTICA ao restaurar backup: \u0001
  #1080 = String             #1081        // <?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\u0001
  #1081 = Utf8               <?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\u0001
  #1082 = String             #1083        // //\u0001[@\u0001=\'\u0001\']
  #1083 = Utf8               //\u0001[@\u0001=\'\u0001\']
  #1084 = MethodHandle       6:#1085      // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.lambda$formatDrops$0:(Lext/mods/FarmEventRandom/holder/DropHolder;)Ljava/lang/String;
  #1085 = Methodref          #63.#1086    // ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.lambda$formatDrops$0:(Lext/mods/FarmEventRandom/holder/DropHolder;)Ljava/lang/String;
  #1086 = NameAndType        #980:#981    // lambda$formatDrops$0:(Lext/mods/FarmEventRandom/holder/DropHolder;)Ljava/lang/String;
  #1087 = MethodType         #981         //  (Lext/mods/FarmEventRandom/holder/DropHolder;)Ljava/lang/String;
  #1088 = String             #1089        // \u0001, ...
  #1089 = Utf8               \u0001, ...
  #1090 = String             #1091        // \u0001(\u0001%)
  #1091 = Utf8               \u0001(\u0001%)
  #1092 = MethodHandle       6:#1093      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1093 = Methodref          #1094.#1095  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1094 = Class              #1096        // java/lang/invoke/StringConcatFactory
  #1095 = NameAndType        #83:#1097    // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1096 = Utf8               java/lang/invoke/StringConcatFactory
  #1097 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1098 = MethodHandle       6:#1099      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1099 = Methodref          #1100.#1101  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1100 = Class              #1102        // java/lang/invoke/LambdaMetafactory
  #1101 = NameAndType        #1103:#1104  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1102 = Utf8               java/lang/invoke/LambdaMetafactory
  #1103 = Utf8               metafactory
  #1104 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1105 = Utf8               InnerClasses
  #1106 = Class              #1107        // java/lang/invoke/MethodHandles$Lookup
  #1107 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1108 = Class              #1109        // java/lang/invoke/MethodHandles
  #1109 = Utf8               java/lang/invoke/MethodHandles
  #1110 = Utf8               Lookup
{
  public static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public ext.mods.gameserver.handler.admincommandhandlers.AdminFarmEvent();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=12, args_size=3
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
         4: ifne          8
         7: return
         8: new           #13                 // class java/util/StringTokenizer
        11: dup
        12: aload_1
        13: invokespecial #15                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
        16: astore_3
        17: aload_3
        18: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        21: pop
        22: aload_3
        23: invokevirtual #22                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        26: ifeq          36
        29: aload_3
        30: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        33: goto          38
        36: ldc           #25                 // String main
        38: astore        4
        40: ldc           #27                 // String
        42: astore        5
        44: aload_3
        45: invokevirtual #22                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        48: ifeq          62
        51: aload_3
        52: ldc           #27                 // String
        54: invokevirtual #29                 // Method java/util/StringTokenizer.nextToken:(Ljava/lang/String;)Ljava/lang/String;
        57: invokevirtual #32                 // Method java/lang/String.trim:()Ljava/lang/String;
        60: astore        5
        62: iconst_1
        63: istore        6
        65: aload         4
        67: astore        7
        69: iconst_m1
        70: istore        8
        72: aload         7
        74: invokevirtual #37                 // Method java/lang/String.hashCode:()I
        77: lookupswitch  { // 4

              -573446013: 152

                 3343801: 120

              1883970129: 168

              2063900398: 136
                 default: 181
            }
       120: aload         7
       122: ldc           #25                 // String main
       124: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       127: ifeq          181
       130: iconst_0
       131: istore        8
       133: goto          181
       136: aload         7
       138: ldc           #45                 // String toggle_global
       140: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       143: ifeq          181
       146: iconst_1
       147: istore        8
       149: goto          181
       152: aload         7
       154: ldc           #47                 // String update_time
       156: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       159: ifeq          181
       162: iconst_2
       163: istore        8
       165: goto          181
       168: aload         7
       170: ldc           #49                 // String toggle_active
       172: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       175: ifeq          181
       178: iconst_3
       179: istore        8
       181: iload         8
       183: tableswitch   { // 0 to 3

                       0: 212

                       1: 242

                       2: 258

                       3: 274
                 default: 345
            }
       212: aload         5
       214: invokevirtual #51                 // Method java/lang/String.isEmpty:()Z
       217: ifne          232
       220: aload         5
       222: invokestatic  #54                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       225: istore        6
       227: goto          232
       230: astore        9
       232: aload_0
       233: aload_2
       234: iload         6
       236: invokevirtual #62                 // Method showMainMenu:(Lext/mods/gameserver/model/actor/Player;I)V
       239: goto          362
       242: aload_0
       243: aload_2
       244: aload         5
       246: invokevirtual #68                 // Method handleToggleGlobal:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       249: aload_0
       250: aload_2
       251: iconst_1
       252: invokevirtual #62                 // Method showMainMenu:(Lext/mods/gameserver/model/actor/Player;I)V
       255: goto          362
       258: aload_0
       259: aload_2
       260: aload         5
       262: invokevirtual #72                 // Method handleUpdateTime:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       265: aload_0
       266: aload_2
       267: iconst_1
       268: invokevirtual #62                 // Method showMainMenu:(Lext/mods/gameserver/model/actor/Player;I)V
       271: goto          362
       274: new           #13                 // class java/util/StringTokenizer
       277: dup
       278: aload         5
       280: invokespecial #15                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
       283: astore_3
       284: aload_3
       285: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       288: invokestatic  #54                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       291: istore        9
       293: aload_3
       294: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       297: astore        10
       299: aload_3
       300: invokevirtual #22                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       303: ifeq          320
       306: aload_3
       307: invokevirtual #18                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       310: invokestatic  #54                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       313: istore        6
       315: goto          320
       318: astore        11
       320: aload_0
       321: aload_2
       322: iload         9
       324: aload         10
       326: ldc           #75                 // String activate
       328: invokevirtual #41                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       331: invokevirtual #77                 // Method handleToggleActive:(Lext/mods/gameserver/model/actor/Player;IZ)Z
       334: pop
       335: aload_0
       336: aload_2
       337: iload         6
       339: invokevirtual #62                 // Method showMainMenu:(Lext/mods/gameserver/model/actor/Player;I)V
       342: goto          362
       345: aload_2
       346: aload         4
       348: invokedynamic #81,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       353: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       356: aload_0
       357: aload_2
       358: iconst_1
       359: invokevirtual #62                 // Method showMainMenu:(Lext/mods/gameserver/model/actor/Player;I)V
       362: goto          402
       365: astore        6
       367: aload_2
       368: aload         6
       370: invokevirtual #89                 // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       373: invokedynamic #92,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       378: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       381: getstatic     #93                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       384: aload         4
       386: invokedynamic #97,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       391: aload         6
       393: invokevirtual #98                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       396: aload_0
       397: aload_2
       398: iconst_1
       399: invokevirtual #62                 // Method showMainMenu:(Lext/mods/gameserver/model/actor/Player;I)V
       402: return
      Exception table:
         from    to  target type
           220   227   230   Class java/lang/NumberFormatException
           306   315   318   Class java/lang/NumberFormatException
            62   362   365   Class java/lang/Exception
      LineNumberTable:
        line 88: 0
        line 89: 7
        line 91: 8
        line 92: 17
        line 93: 22
        line 94: 40
        line 95: 44
        line 97: 51
        line 103: 62
        line 105: 65
        line 109: 212
        line 111: 220
        line 112: 227
        line 114: 232
        line 115: 239
        line 119: 242
        line 120: 249
        line 121: 255
        line 125: 258
        line 126: 265
        line 127: 271
        line 131: 274
        line 132: 284
        line 133: 293
        line 135: 299
        line 137: 306
        line 138: 315
        line 140: 320
        line 141: 335
        line 142: 342
        line 145: 345
        line 146: 356
        line 155: 362
        line 150: 365
        line 152: 367
        line 153: 381
        line 154: 396
        line 156: 402
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          293      52     9 zoneId   I
          299      46    10 status   Ljava/lang/String;
           65     297     6 currentPage   I
          367      35     6     e   Ljava/lang/Exception;
            0     403     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent;
            0     403     1 command   Ljava/lang/String;
            0     403     2 player   Lext/mods/gameserver/model/actor/Player;
           17     386     3    st   Ljava/util/StringTokenizer;
           40     363     4 action   Ljava/lang/String;
           44     359     5 bypassParams   Ljava/lang/String;
      StackMapTable: number_of_entries = 21
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/util/StringTokenizer ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/lang/String, class java/lang/String ]
        frame_type = 254 /* append */
          offset_delta = 57
          locals = [ int, class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 30 /* same */
        frame_type = 81 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 1 /* same */
        frame_type = 9 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class java/lang/String, int, int, class java/lang/String ]
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 1 /* same */
        frame_type = 249 /* chop */
          offset_delta = 24
        frame_type = 248 /* chop */
          offset_delta = 16
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 36 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #814                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 338: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #99                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #63                 // class ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent
         6: invokevirtual #841                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #844                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #93                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: iconst_1
        16: anewarray     #33                 // class java/lang/String
        19: dup
        20: iconst_0
        21: ldc_w         #845                // String admin_farm_event
        24: aastore
        25: putstatic     #814                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        28: new           #847                // class java/util/HashMap
        31: dup
        32: invokespecial #849                // Method java/util/HashMap."<init>":()V
        35: putstatic     #518                // Field _zoneNamesCache:Ljava/util/Map;
        38: return
      LineNumberTable:
        line 70: 0
        line 71: 15
        line 80: 28
}
SourceFile: "AdminFarmEvent.java"
BootstrapMethods:
  0: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #992 Função \'\u0001\' desconhecida ou desabilitada.
  1: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #994 Erro ao processar comando: \u0001
  2: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #996 [AdminFarmEvent] Erro no useAdminCommand (Action: \u0001):
  3: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #998 <td width=110>\u0001</td>
  4: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1000 <td width=70 align=right><button value=\"\u0001\" action=\"bypass -h admin_farm_event toggle_global \u0001\" width=60 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
  5: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1002 <tr><td>Nome:</td><td colspan=2 width=180>\u0001</td></tr>
  6: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1004 <tr><td>Sorteio:</td><td colspan=2>Selecionando <font color=LEVEL>\u0001</font> zona(s).</td></tr>
  7: #1098 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1006 (Ljava/lang/Object;)Ljava/lang/Object;
      #1008 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.lambda$showMainMenu$0:(Ljava/time/LocalTime;)Ljava/lang/String;
      #1011 (Ljava/time/LocalTime;)Ljava/lang/String;
  8: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1012 <td width=130>Horario(s): \u0001</td>
  9: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1014 <tr><td>Aviso Prévio:</td><td colspan=2>\u0001 min(s)</td></tr>
  10: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1016 <tr><td>Duracao:</td><td colspan=2>\u0001 hora(s)</td></tr>
  11: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1018 <tr><td>Anuncio Auto:</td><td colspan=2>A cada \u0001 min(s)</td></tr>
  12: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1020 <br><table width=280><tr><td align=center>Zonas Configuradas (Pagina \u0001 de \u0001)</td></tr></table>
  13: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1022 <td width=200><font color=\u0001>ID \u0001 (\u0001)</font></td>
  14: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1024 bypass -h admin_farm_event toggle_active \u0001 \u0001 \u0001
  15: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1026 <td width=80 align=right><button value=\"\u0001\" action=\"\u0001\" width=70 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
  16: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1028 <tr><td width=100>Titulo:</td><td width=180>\u0001</td></tr>
  17: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1030 <tr><td>Modo:</td><td>\u0001</td></tr>
  18: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1032 <tr><td>Drops Originais:</td><td>\u0001</td></tr>
  19: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1034 <tr><td>Rates (X/S/A):</td><td>\u0001x / \u0001x / \u0001x</td></tr>
  20: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1036 \u0001s
  21: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1038 <tr><td>Respawn (Orig.):</td><td>\u0001</td></tr>
  22: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1040 <tr><td valign=top>Drops (Evento):</td><td>\u0001</td></tr>
  23: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1042 <tr><td>Spawns Custom:</td><td>\u0001 definidos</td></tr>
  24: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1044 <tr><td>Requer VIP:</td><td>\u0001</td></tr>
  25: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1046 <tr><td>Requer Party:</td><td>\u0001</td></tr>
  26: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1048 <tr><td>Min. Party:</td><td>\u0001</td></tr>
  27: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1050 <td width=100 align=left><button value=\"<< Anterior\" action=\"bypass -h admin_farm_event main \u0001\" width=80 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
  28: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1052 <td width=80 align=center>Pag. \u0001/\u0001</td>
  29: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1054 <td width=100 align=right><button value=\"Próxima >>\" action=\"bypass -h admin_farm_event main \u0001\" width=80 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>
  30: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1056 Horários do evento atualizados para \'\u0001\' e mod recarregado.
  31: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1058 Evento \u0001. Mod recarregado.
  32: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1060 ERRO: Não foi possível encontrar <spawns zoneId=\"\u0001\"> no XML.
  33: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1062 [AdminFarmEvent] Carregado \u0001 nomes de zonas para o cache.
  34: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1064 ERRO: Arquivo \u0001 não encontrado para backup.
  35: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1066 [AdminFarmEvent] Falha ao criar backup: \u0001
  36: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1068 ERRO: Falha ao criar backup de \u0001. Abortando.
  37: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1070 [AdminFarmEvent] Backup não encontrado, não foi possível restaurar: \u0001
  38: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1072 ERRO CRÍTICO: Backup \u0001 não foi encontrado!
  39: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1074 [AdminFarmEvent] Backup restaurado: \u0001
  40: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1076 Um backup do \u0001 foi restaurado.
  41: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1078 [AdminFarmEvent] FALHA CRÍTICA ao restaurar backup: \u0001
  42: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1080 <?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\u0001
  43: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1082 //\u0001[@\u0001=\'\u0001\']
  44: #1098 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1006 (Ljava/lang/Object;)Ljava/lang/Object;
      #1084 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFarmEvent.lambda$formatDrops$0:(Lext/mods/FarmEventRandom/holder/DropHolder;)Ljava/lang/String;
      #1087 (Lext/mods/FarmEventRandom/holder/DropHolder;)Ljava/lang/String;
  45: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1088 \u0001, ...
  46: #1092 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1090 \u0001(\u0001%)
InnerClasses:
  public static final #1110= #1106 of #1108; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
