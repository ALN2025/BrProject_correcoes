// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.VoicedBossBattle
// File: ext\mods\gameserver\handler\voicedcommandhandlers\VoicedBossBattle.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle.class
  Last modified 9 de jul de 2026; size 11456 bytes
  MD5 checksum 2ed1e6f9407b69055446eaddbf7d7696
  Compiled from "VoicedBossBattle.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.VoicedBossBattle implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 10, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // battleboss
    #8 = Utf8               battleboss
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle.showEventList:(Lext/mods/gameserver/model/actor/Player;I)V
   #16 = Class              #18           // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle
   #17 = NameAndType        #19:#20       // showEventList:(Lext/mods/gameserver/model/actor/Player;I)V
   #18 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle
   #19 = Utf8               showEventList
   #20 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #21 = String             #22           // battleboss
   #22 = Utf8               battleboss
   #23 = String             #24           //
   #24 = Utf8
   #25 = Methodref          #10.#26       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #26 = NameAndType        #27:#28       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #27 = Utf8               split
   #28 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #29 = Methodref          #30.#31       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #30 = Class              #32           // java/lang/Integer
   #31 = NameAndType        #33:#34       // parseInt:(Ljava/lang/String;)I
   #32 = Utf8               java/lang/Integer
   #33 = Utf8               parseInt
   #34 = Utf8               (Ljava/lang/String;)I
   #35 = Class              #36           // java/lang/NumberFormatException
   #36 = Utf8               java/lang/NumberFormatException
   #37 = String             #38           // battlebossinfo
   #38 = Utf8               battlebossinfo
   #39 = Methodref          #16.#40       // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle.showEventInfo:(Lext/mods/gameserver/model/actor/Player;II)V
   #40 = NameAndType        #41:#42       // showEventInfo:(Lext/mods/gameserver/model/actor/Player;II)V
   #41 = Utf8               showEventInfo
   #42 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
   #43 = String             #44           // battlebossregister
   #44 = Utf8               battlebossregister
   #45 = Methodref          #16.#46       // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle.register:(Lext/mods/gameserver/model/actor/Player;I)V
   #46 = NameAndType        #47:#20       // register:(Lext/mods/gameserver/model/actor/Player;I)V
   #47 = Utf8               register
   #48 = String             #49           // Invalid event ID.
   #49 = Utf8               Invalid event ID.
   #50 = Methodref          #51.#52       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #51 = Class              #53           // ext/mods/gameserver/model/actor/Player
   #52 = NameAndType        #54:#55       // sendMessage:(Ljava/lang/String;)V
   #53 = Utf8               ext/mods/gameserver/model/actor/Player
   #54 = Utf8               sendMessage
   #55 = Utf8               (Ljava/lang/String;)V
   #56 = String             #57           // Usage: .battlebossregister <eventId>
   #57 = Utf8               Usage: .battlebossregister <eventId>
   #58 = String             #59           // battlebossunregister
   #59 = Utf8               battlebossunregister
   #60 = Methodref          #16.#61       // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle.unregister:(Lext/mods/gameserver/model/actor/Player;I)V
   #61 = NameAndType        #62:#20       // unregister:(Lext/mods/gameserver/model/actor/Player;I)V
   #62 = Utf8               unregister
   #63 = Methodref          #64.#65       // ext/mods/Crypta/BattleBossData.getInstance:()Lext/mods/Crypta/BattleBossData;
   #64 = Class              #66           // ext/mods/Crypta/BattleBossData
   #65 = NameAndType        #67:#68       // getInstance:()Lext/mods/Crypta/BattleBossData;
   #66 = Utf8               ext/mods/Crypta/BattleBossData
   #67 = Utf8               getInstance
   #68 = Utf8               ()Lext/mods/Crypta/BattleBossData;
   #69 = String             #70           // BattleBossData não está disponível.
   #70 = Utf8               BattleBossData não está disponível.
   #71 = Methodref          #64.#72       // ext/mods/Crypta/BattleBossData.getEvents:()Ljava/util/Collection;
   #72 = NameAndType        #73:#74       // getEvents:()Ljava/util/Collection;
   #73 = Utf8               getEvents
   #74 = Utf8               ()Ljava/util/Collection;
   #75 = Class              #76           // java/util/List
   #76 = Utf8               java/util/List
   #77 = Class              #78           // java/lang/Exception
   #78 = Utf8               java/lang/Exception
   #79 = String             #80           // Erro ao acessar dados do BattleBoss.
   #80 = Utf8               Erro ao acessar dados do BattleBoss.
   #81 = Methodref          #77.#82       // java/lang/Exception.printStackTrace:()V
   #82 = NameAndType        #83:#6        // printStackTrace:()V
   #83 = Utf8               printStackTrace
   #84 = String             #85           // Nenhum evento encontrado.
   #85 = Utf8               Nenhum evento encontrado.
   #86 = InterfaceMethodref #75.#87       // java/util/List.stream:()Ljava/util/stream/Stream;
   #87 = NameAndType        #88:#89       // stream:()Ljava/util/stream/Stream;
   #88 = Utf8               stream
   #89 = Utf8               ()Ljava/util/stream/Stream;
   #90 = InvokeDynamic      #0:#91        // #0:test:()Ljava/util/function/Predicate;
   #91 = NameAndType        #92:#93       // test:()Ljava/util/function/Predicate;
   #92 = Utf8               test
   #93 = Utf8               ()Ljava/util/function/Predicate;
   #94 = InterfaceMethodref #95.#96       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #95 = Class              #97           // java/util/stream/Stream
   #96 = NameAndType        #98:#99       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #97 = Utf8               java/util/stream/Stream
   #98 = Utf8               filter
   #99 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #100 = Methodref          #101.#102     // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
  #101 = Class              #103          // java/util/stream/Collectors
  #102 = NameAndType        #104:#105     // toList:()Ljava/util/stream/Collector;
  #103 = Utf8               java/util/stream/Collectors
  #104 = Utf8               toList
  #105 = Utf8               ()Ljava/util/stream/Collector;
  #106 = InterfaceMethodref #95.#107      // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #107 = NameAndType        #108:#109     // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #108 = Utf8               collect
  #109 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
  #110 = InterfaceMethodref #75.#111      // java/util/List.size:()I
  #111 = NameAndType        #112:#113     // size:()I
  #112 = Utf8               size
  #113 = Utf8               ()I
  #114 = Double             3.0d
  #116 = Methodref          #117.#118     // java/lang/Math.ceil:(D)D
  #117 = Class              #119          // java/lang/Math
  #118 = NameAndType        #120:#121     // ceil:(D)D
  #119 = Utf8               java/lang/Math
  #120 = Utf8               ceil
  #121 = Utf8               (D)D
  #122 = Methodref          #117.#123     // java/lang/Math.max:(II)I
  #123 = NameAndType        #124:#125     // max:(II)I
  #124 = Utf8               max
  #125 = Utf8               (II)I
  #126 = Methodref          #117.#127     // java/lang/Math.min:(II)I
  #127 = NameAndType        #128:#125     // min:(II)I
  #128 = Utf8               min
  #129 = Class              #130          // java/lang/StringBuilder
  #130 = Utf8               java/lang/StringBuilder
  #131 = Methodref          #129.#3       // java/lang/StringBuilder."<init>":()V
  #132 = String             #133          // <html><title>Battle Boss - Eventos</title><body><center>
  #133 = Utf8               <html><title>Battle Boss - Eventos</title><body><center>
  #134 = Methodref          #129.#135     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #135 = NameAndType        #136:#137     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #136 = Utf8               append
  #137 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #138 = InterfaceMethodref #75.#139      // java/util/List.get:(I)Ljava/lang/Object;
  #139 = NameAndType        #140:#141     // get:(I)Ljava/lang/Object;
  #140 = Utf8               get
  #141 = Utf8               (I)Ljava/lang/Object;
  #142 = Class              #143          // ext/mods/battlerboss/holder/EventHolder
  #143 = Utf8               ext/mods/battlerboss/holder/EventHolder
  #144 = String             #145          //
  #145 = Utf8
  #146 = Methodref          #142.#147     // ext/mods/battlerboss/holder/EventHolder.getInfo:()Lext/mods/battlerboss/holder/InfoHolder;
  #147 = NameAndType        #148:#149     // getInfo:()Lext/mods/battlerboss/holder/InfoHolder;
  #148 = Utf8               getInfo
  #149 = Utf8               ()Lext/mods/battlerboss/holder/InfoHolder;
  #150 = Methodref          #151.#152     // ext/mods/battlerboss/holder/InfoHolder.getDesc:()Ljava/util/List;
  #151 = Class              #153          // ext/mods/battlerboss/holder/InfoHolder
  #152 = NameAndType        #154:#155     // getDesc:()Ljava/util/List;
  #153 = Utf8               ext/mods/battlerboss/holder/InfoHolder
  #154 = Utf8               getDesc
  #155 = Utf8               ()Ljava/util/List;
  #156 = InterfaceMethodref #75.#157      // java/util/List.isEmpty:()Z
  #157 = NameAndType        #158:#159     // isEmpty:()Z
  #158 = Utf8               isEmpty
  #159 = Utf8               ()Z
  #160 = String             #161          // <table width=300 bgcolor=000000 border=0 cellspacing=2 cellpadding=4>
  #161 = Utf8               <table width=300 bgcolor=000000 border=0 cellspacing=2 cellpadding=4>
  #162 = String             #163          // <tr>
  #163 = Utf8               <tr>
  #164 = String             #165          // <td valign=top>
  #165 = Utf8               <td valign=top>
  #166 = Methodref          #167.#168     // ext/mods/battlerboss/register/BattleBossOpenRegister.getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #167 = Class              #169          // ext/mods/battlerboss/register/BattleBossOpenRegister
  #168 = NameAndType        #67:#170      // getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #169 = Utf8               ext/mods/battlerboss/register/BattleBossOpenRegister
  #170 = Utf8               ()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #171 = Methodref          #167.#172     // ext/mods/battlerboss/register/BattleBossOpenRegister.isRegistrationOpen:(Lext/mods/battlerboss/holder/EventHolder;)Z
  #172 = NameAndType        #173:#174     // isRegistrationOpen:(Lext/mods/battlerboss/holder/EventHolder;)Z
  #173 = Utf8               isRegistrationOpen
  #174 = Utf8               (Lext/mods/battlerboss/holder/EventHolder;)Z
  #175 = String             #176          //  <font color=\"00FF00\">(Ativo)</font>
  #176 = Utf8                <font color=\"00FF00\">(Ativo)</font>
  #177 = Methodref          #151.#178     // ext/mods/battlerboss/holder/InfoHolder.getName:()Ljava/lang/String;
  #178 = NameAndType        #179:#180     // getName:()Ljava/lang/String;
  #179 = Utf8               getName
  #180 = Utf8               ()Ljava/lang/String;
  #181 = InvokeDynamic      #1:#182       // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #182 = NameAndType        #183:#184     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #183 = Utf8               makeConcatWithConstants
  #184 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #185 = InvokeDynamic      #2:#186       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #186 = NameAndType        #183:#187     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #187 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #188 = String             #189          // <table border=0 cellspacing=2 cellpadding=0><tr>
  #189 = Utf8               <table border=0 cellspacing=2 cellpadding=0><tr>
  #190 = Methodref          #142.#191     // ext/mods/battlerboss/holder/EventHolder.getId:()I
  #191 = NameAndType        #192:#113     // getId:()I
  #192 = Utf8               getId
  #193 = InvokeDynamic      #3:#194       // #3:makeConcatWithConstants:(II)Ljava/lang/String;
  #194 = NameAndType        #183:#195     // makeConcatWithConstants:(II)Ljava/lang/String;
  #195 = Utf8               (II)Ljava/lang/String;
  #196 = InvokeDynamic      #4:#197       // #4:makeConcatWithConstants:(I)Ljava/lang/String;
  #197 = NameAndType        #183:#198     // makeConcatWithConstants:(I)Ljava/lang/String;
  #198 = Utf8               (I)Ljava/lang/String;
  #199 = InvokeDynamic      #5:#197       // #5:makeConcatWithConstants:(I)Ljava/lang/String;
  #200 = String             #201          // </tr></table>
  #201 = Utf8               </tr></table>
  #202 = String             #203          // </td>
  #203 = Utf8               </td>
  #204 = Methodref          #151.#205     // ext/mods/battlerboss/holder/InfoHolder.getIcon:()Ljava/lang/String;
  #205 = NameAndType        #206:#180     // getIcon:()Ljava/lang/String;
  #206 = Utf8               getIcon
  #207 = InvokeDynamic      #6:#186       // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #208 = String             #209          // </tr>
  #209 = Utf8               </tr>
  #210 = String             #211          // </table><br>
  #211 = Utf8               </table><br>
  #212 = String             #213          // <br>
  #213 = Utf8               <br>
  #214 = InvokeDynamic      #7:#197       // #7:makeConcatWithConstants:(I)Ljava/lang/String;
  #215 = InvokeDynamic      #8:#194       // #8:makeConcatWithConstants:(II)Ljava/lang/String;
  #216 = String             #217          // </center></body></html>
  #217 = Utf8               </center></body></html>
  #218 = Class              #219          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #219 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #220 = Methodref          #218.#221     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #221 = NameAndType        #5:#222       // "<init>":(I)V
  #222 = Utf8               (I)V
  #223 = Methodref          #129.#224     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #224 = NameAndType        #225:#180     // toString:()Ljava/lang/String;
  #225 = Utf8               toString
  #226 = Methodref          #218.#227     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #227 = NameAndType        #228:#55      // setHtml:(Ljava/lang/String;)V
  #228 = Utf8               setHtml
  #229 = Methodref          #51.#230      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #230 = NameAndType        #231:#232     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #231 = Utf8               sendPacket
  #232 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #233 = Methodref          #64.#234      // ext/mods/Crypta/BattleBossData.getEvent:(I)Lext/mods/battlerboss/holder/EventHolder;
  #234 = NameAndType        #235:#236     // getEvent:(I)Lext/mods/battlerboss/holder/EventHolder;
  #235 = Utf8               getEvent
  #236 = Utf8               (I)Lext/mods/battlerboss/holder/EventHolder;
  #237 = String             #238          // Erro ao acessar dados do evento.
  #238 = Utf8               Erro ao acessar dados do evento.
  #239 = String             #240          // Evento não encontrado.
  #240 = Utf8               Evento não encontrado.
  #241 = String             #242          // <html><title>Battle Boss - Info</title><body><center>
  #242 = Utf8               <html><title>Battle Boss - Info</title><body><center>
  #243 = String             #244          // <table width=300 bgcolor=000000>
  #244 = Utf8               <table width=300 bgcolor=000000>
  #245 = InvokeDynamic      #9:#186       // #9:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #246 = InvokeDynamic      #10:#182      // #10:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #247 = String             #248          // <font color=LEVEL>Descrição:</font><br>
  #248 = Utf8               <font color=LEVEL>Descrição:</font><br>
  #249 = InterfaceMethodref #75.#250      // java/util/List.iterator:()Ljava/util/Iterator;
  #250 = NameAndType        #251:#252     // iterator:()Ljava/util/Iterator;
  #251 = Utf8               iterator
  #252 = Utf8               ()Ljava/util/Iterator;
  #253 = InterfaceMethodref #254.#255     // java/util/Iterator.hasNext:()Z
  #254 = Class              #256          // java/util/Iterator
  #255 = NameAndType        #257:#159     // hasNext:()Z
  #256 = Utf8               java/util/Iterator
  #257 = Utf8               hasNext
  #258 = InterfaceMethodref #254.#259     // java/util/Iterator.next:()Ljava/lang/Object;
  #259 = NameAndType        #260:#261     // next:()Ljava/lang/Object;
  #260 = Utf8               next
  #261 = Utf8               ()Ljava/lang/Object;
  #262 = InvokeDynamic      #11:#186      // #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #263 = Methodref          #142.#264     // ext/mods/battlerboss/holder/EventHolder.getConfig:()Lext/mods/battlerboss/holder/BattleBossConfigHolder;
  #264 = NameAndType        #265:#266     // getConfig:()Lext/mods/battlerboss/holder/BattleBossConfigHolder;
  #265 = Utf8               getConfig
  #266 = Utf8               ()Lext/mods/battlerboss/holder/BattleBossConfigHolder;
  #267 = Methodref          #268.#269     // ext/mods/battlerboss/holder/BattleBossConfigHolder.getDays:()Ljava/util/List;
  #268 = Class              #270          // ext/mods/battlerboss/holder/BattleBossConfigHolder
  #269 = NameAndType        #271:#155     // getDays:()Ljava/util/List;
  #270 = Utf8               ext/mods/battlerboss/holder/BattleBossConfigHolder
  #271 = Utf8               getDays
  #272 = InvokeDynamic      #12:#273      // #12:apply:()Ljava/util/function/Function;
  #273 = NameAndType        #274:#275     // apply:()Ljava/util/function/Function;
  #274 = Utf8               apply
  #275 = Utf8               ()Ljava/util/function/Function;
  #276 = InterfaceMethodref #95.#277      // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #277 = NameAndType        #278:#279     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #278 = Utf8               map
  #279 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #280 = String             #281          // ,
  #281 = Utf8               ,
  #282 = Methodref          #101.#283     // java/util/stream/Collectors.joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
  #283 = NameAndType        #284:#285     // joining:(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
  #284 = Utf8               joining
  #285 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
  #286 = InvokeDynamic      #13:#186      // #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #287 = Methodref          #268.#288     // ext/mods/battlerboss/holder/BattleBossConfigHolder.getTimes:()Ljava/util/List;
  #288 = NameAndType        #289:#155     // getTimes:()Ljava/util/List;
  #289 = Utf8               getTimes
  #290 = Methodref          #10.#291      // java/lang/String.join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #291 = NameAndType        #292:#293     // join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #292 = Utf8               join
  #293 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #294 = InvokeDynamic      #14:#186      // #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #295 = InvokeDynamic      #15:#197      // #15:makeConcatWithConstants:(I)Ljava/lang/String;
  #296 = String             #297          // Evento inválido.
  #297 = Utf8               Evento inválido.
  #298 = Methodref          #167.#299     // ext/mods/battlerboss/register/BattleBossOpenRegister.register:(Lext/mods/battlerboss/holder/EventHolder;Lext/mods/gameserver/model/actor/Player;)Z
  #299 = NameAndType        #47:#300      // register:(Lext/mods/battlerboss/holder/EventHolder;Lext/mods/gameserver/model/actor/Player;)Z
  #300 = Utf8               (Lext/mods/battlerboss/holder/EventHolder;Lext/mods/gameserver/model/actor/Player;)Z
  #301 = InvokeDynamic      #16:#302      // #16:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #302 = NameAndType        #183:#303     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #303 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #304 = Methodref          #167.#305     // ext/mods/battlerboss/register/BattleBossOpenRegister.unregister:(Lext/mods/battlerboss/holder/EventHolder;Lext/mods/gameserver/model/actor/Player;)V
  #305 = NameAndType        #62:#306      // unregister:(Lext/mods/battlerboss/holder/EventHolder;Lext/mods/gameserver/model/actor/Player;)V
  #306 = Utf8               (Lext/mods/battlerboss/holder/EventHolder;Lext/mods/gameserver/model/actor/Player;)V
  #307 = String             #308          // Sunday
  #308 = Utf8               Sunday
  #309 = String             #310          // Monday
  #310 = Utf8               Monday
  #311 = String             #312          // Tuesday
  #312 = Utf8               Tuesday
  #313 = String             #314          // Wednesday
  #314 = Utf8               Wednesday
  #315 = String             #316          // Thursday
  #316 = Utf8               Thursday
  #317 = String             #318          // Friday
  #318 = Utf8               Friday
  #319 = String             #320          // Saturday
  #320 = Utf8               Saturday
  #321 = InvokeDynamic      #17:#197      // #17:makeConcatWithConstants:(I)Ljava/lang/String;
  #322 = Fieldref           #16.#323      // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle.VOICED_COMMANDS:[Ljava/lang/String;
  #323 = NameAndType        #324:#325     // VOICED_COMMANDS:[Ljava/lang/String;
  #324 = Utf8               VOICED_COMMANDS
  #325 = Utf8               [Ljava/lang/String;
  #326 = Methodref          #268.#327     // ext/mods/battlerboss/holder/BattleBossConfigHolder.isEnabled:()Z
  #327 = NameAndType        #328:#159     // isEnabled:()Z
  #328 = Utf8               isEnabled
  #329 = Class              #330          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #330 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #331 = Utf8               EVENTS_PER_PAGE
  #332 = Utf8               I
  #333 = Utf8               ConstantValue
  #334 = Integer            3
  #335 = Utf8               Code
  #336 = Utf8               LineNumberTable
  #337 = Utf8               LocalVariableTable
  #338 = Utf8               this
  #339 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle;
  #340 = Utf8               useVoicedCommand
  #341 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #342 = Utf8               page
  #343 = Utf8               args
  #344 = Utf8               eventId
  #345 = Utf8               e
  #346 = Utf8               Ljava/lang/NumberFormatException;
  #347 = Utf8               command
  #348 = Utf8               Ljava/lang/String;
  #349 = Utf8               player
  #350 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #351 = Utf8               target
  #352 = Utf8               StackMapTable
  #353 = Class              #325          // "[Ljava/lang/String;"
  #354 = Utf8               tempList
  #355 = Utf8               Ljava/util/List;
  #356 = Utf8               result
  #357 = Utf8               Ljava/lang/Object;
  #358 = Utf8               Ljava/lang/Exception;
  #359 = Utf8               event
  #360 = Utf8               Lext/mods/battlerboss/holder/EventHolder;
  #361 = Utf8               firstDescLine
  #362 = Utf8               status
  #363 = Utf8               i
  #364 = Utf8               battleBossDataInstance
  #365 = Utf8               events
  #366 = Utf8               totalPages
  #367 = Utf8               startIndex
  #368 = Utf8               endIndex
  #369 = Utf8               sb
  #370 = Utf8               Ljava/lang/StringBuilder;
  #371 = Utf8               html
  #372 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #373 = Utf8               LocalVariableTypeTable
  #374 = Utf8               Ljava/util/List<Lext/mods/battlerboss/holder/EventHolder;>;
  #375 = Utf8               line
  #376 = Utf8               returnPage
  #377 = Utf8               daysString
  #378 = Utf8               timesString
  #379 = Utf8               dayOfWeekToString
  #380 = Utf8               day
  #381 = Utf8               days
  #382 = Utf8               getVoicedCommandList
  #383 = Utf8               ()[Ljava/lang/String;
  #384 = Utf8               lambda$showEventList$0
  #385 = Utf8               <clinit>
  #386 = Utf8               SourceFile
  #387 = Utf8               VoicedBossBattle.java
  #388 = Utf8               BootstrapMethods
  #389 = MethodType         #390          //  (Ljava/lang/Object;)Z
  #390 = Utf8               (Ljava/lang/Object;)Z
  #391 = MethodHandle       6:#392        // REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle.lambda$showEventList$0:(Lext/mods/battlerboss/holder/EventHolder;)Z
  #392 = Methodref          #16.#393      // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle.lambda$showEventList$0:(Lext/mods/battlerboss/holder/EventHolder;)Z
  #393 = NameAndType        #384:#174     // lambda$showEventList$0:(Lext/mods/battlerboss/holder/EventHolder;)Z
  #394 = MethodType         #174          //  (Lext/mods/battlerboss/holder/EventHolder;)Z
  #395 = String             #396          // <font color=\"LEVEL\"><b>\u0001\u0001</b></font><br>
  #396 = Utf8               <font color=\"LEVEL\"><b>\u0001\u0001</b></font><br>
  #397 = String             #398          // <font color=\"AAAAAA\">\u0001</font><br>
  #398 = Utf8               <font color=\"AAAAAA\">\u0001</font><br>
  #399 = String             #400          // <td><button value=\"Info\" action=\"bypass -h voiced_battlebossinfo \u0001 \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #400 = Utf8               <td><button value=\"Info\" action=\"bypass -h voiced_battlebossinfo \u0001 \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #401 = String             #402          // <td><button value=\"Registrar\" action=\"bypass -h voiced_battlebossregister \u0001\" width=80 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #402 = Utf8               <td><button value=\"Registrar\" action=\"bypass -h voiced_battlebossregister \u0001\" width=80 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #403 = String             #404          // <td><button value=\"unRegistrar\" action=\"bypass -h voiced_battlebossunregister \u0001\" width=80 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #404 = Utf8               <td><button value=\"unRegistrar\" action=\"bypass -h voiced_battlebossunregister \u0001\" width=80 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #405 = String             #406          // <td width=32 valign=top><img src=\"\u0001\" width=32 height=32></td>
  #406 = Utf8               <td width=32 valign=top><img src=\"\u0001\" width=32 height=32></td>
  #407 = String             #408          // <font color=LEVEL>[\u0001]</font>
  #408 = Utf8               <font color=LEVEL>[\u0001]</font>
  #409 = String             #410          // <a action=\"bypass -h voiced_battleboss \u0001\">\u0001</a>
  #410 = Utf8               <a action=\"bypass -h voiced_battleboss \u0001\">\u0001</a>
  #411 = String             #412          // <tr><td width=32><img src=\"\u0001\" width=32 height=32></td>
  #412 = Utf8               <tr><td width=32><img src=\"\u0001\" width=32 height=32></td>
  #413 = String             #414          // <td><font color=\"LEVEL\">\u0001\u0001</font></td></tr>
  #414 = Utf8               <td><font color=\"LEVEL\">\u0001\u0001</font></td></tr>
  #415 = String             #416          // \u0001<br>
  #416 = Utf8               \u0001<br>
  #417 = MethodType         #418          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #418 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #419 = MethodHandle       6:#420        // REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle.dayOfWeekToString:(I)Ljava/lang/String;
  #420 = Methodref          #16.#421      // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle.dayOfWeekToString:(I)Ljava/lang/String;
  #421 = NameAndType        #379:#198     // dayOfWeekToString:(I)Ljava/lang/String;
  #422 = MethodType         #423          //  (Ljava/lang/Integer;)Ljava/lang/String;
  #423 = Utf8               (Ljava/lang/Integer;)Ljava/lang/String;
  #424 = String             #425          // <br><font color=LEVEL>Dias:</font> \u0001<br>
  #425 = Utf8               <br><font color=LEVEL>Dias:</font> \u0001<br>
  #426 = String             #427          // <font color=LEVEL>Horários:</font> \u0001<br><br>
  #427 = Utf8               <font color=LEVEL>Horários:</font> \u0001<br><br>
  #428 = String             #429          // <td><button value=\"Back\" action=\"bypass -h voiced_battleboss \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #429 = Utf8               <td><button value=\"Back\" action=\"bypass -h voiced_battleboss \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  #430 = String             #431          // O evento \u0001 não está ativo no momento. Dias: \u0001 às \u0001.
  #431 = Utf8               O evento \u0001 não está ativo no momento. Dias: \u0001 às \u0001.
  #432 = String             #433          // Unknown(\u0001)
  #433 = Utf8               Unknown(\u0001)
  #434 = MethodHandle       6:#435        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #435 = Methodref          #436.#437     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #436 = Class              #438          // java/lang/invoke/LambdaMetafactory
  #437 = NameAndType        #439:#440     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #438 = Utf8               java/lang/invoke/LambdaMetafactory
  #439 = Utf8               metafactory
  #440 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #441 = MethodHandle       6:#442        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #442 = Methodref          #443.#444     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #443 = Class              #445          // java/lang/invoke/StringConcatFactory
  #444 = NameAndType        #183:#446     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #445 = Utf8               java/lang/invoke/StringConcatFactory
  #446 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #447 = Utf8               InnerClasses
  #448 = Class              #449          // java/lang/invoke/MethodHandles$Lookup
  #449 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #450 = Class              #451          // java/lang/invoke/MethodHandles
  #451 = Utf8               java/lang/invoke/MethodHandles
  #452 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.VoicedBossBattle();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=4
         0: aload_1
         1: ldc           #7                  // String battleboss
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          15
         9: aload_0
        10: aload_2
        11: iconst_1
        12: invokevirtual #15                 // Method showEventList:(Lext/mods/gameserver/model/actor/Player;I)V
        15: aload_1
        16: ldc           #21                 // String battleboss
        18: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        21: ifeq          66
        24: iconst_1
        25: istore        4
        27: aload_1
        28: ldc           #23                 // String
        30: invokevirtual #25                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        33: astore        5
        35: aload         5
        37: arraylength
        38: iconst_1
        39: if_icmple     56
        42: aload         5
        44: iconst_1
        45: aaload
        46: invokestatic  #29                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        49: istore        4
        51: goto          56
        54: astore        6
        56: aload_0
        57: aload_2
        58: iload         4
        60: invokevirtual #15                 // Method showEventList:(Lext/mods/gameserver/model/actor/Player;I)V
        63: goto          254
        66: aload_1
        67: ldc           #37                 // String battlebossinfo
        69: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        72: ifeq          131
        75: aload_1
        76: ldc           #23                 // String
        78: invokevirtual #25                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        81: astore        4
        83: aload         4
        85: arraylength
        86: iconst_2
        87: if_icmplt     128
        90: aload         4
        92: iconst_1
        93: aaload
        94: invokestatic  #29                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        97: istore        5
        99: aload         4
       101: arraylength
       102: iconst_2
       103: if_icmple     116
       106: aload         4
       108: iconst_2
       109: aaload
       110: invokestatic  #29                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       113: goto          117
       116: iconst_1
       117: istore        6
       119: aload_0
       120: aload_2
       121: iload         5
       123: iload         6
       125: invokevirtual #39                 // Method showEventInfo:(Lext/mods/gameserver/model/actor/Player;II)V
       128: goto          254
       131: aload_1
       132: ldc           #43                 // String battlebossregister
       134: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       137: ifeq          194
       140: aload_1
       141: ldc           #23                 // String
       143: invokevirtual #25                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       146: astore        4
       148: aload         4
       150: arraylength
       151: iconst_2
       152: if_icmplt     185
       155: aload         4
       157: iconst_1
       158: aaload
       159: invokestatic  #29                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       162: istore        5
       164: aload_0
       165: aload_2
       166: iload         5
       168: invokevirtual #45                 // Method register:(Lext/mods/gameserver/model/actor/Player;I)V
       171: goto          191
       174: astore        5
       176: aload_2
       177: ldc           #48                 // String Invalid event ID.
       179: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       182: goto          191
       185: aload_2
       186: ldc           #56                 // String Usage: .battlebossregister <eventId>
       188: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       191: goto          254
       194: aload_1
       195: ldc           #58                 // String battlebossunregister
       197: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       200: ifeq          254
       203: aload_1
       204: ldc           #23                 // String
       206: invokevirtual #25                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       209: astore        4
       211: aload         4
       213: arraylength
       214: iconst_2
       215: if_icmplt     248
       218: aload         4
       220: iconst_1
       221: aaload
       222: invokestatic  #29                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       225: istore        5
       227: aload_0
       228: aload_2
       229: iload         5
       231: invokevirtual #60                 // Method unregister:(Lext/mods/gameserver/model/actor/Player;I)V
       234: goto          254
       237: astore        5
       239: aload_2
       240: ldc           #48                 // String Invalid event ID.
       242: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       245: goto          254
       248: aload_2
       249: ldc           #56                 // String Usage: .battlebossregister <eventId>
       251: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       254: iconst_1
       255: ireturn
      Exception table:
         from    to  target type
            42    51    54   Class java/lang/NumberFormatException
           155   171   174   Class java/lang/NumberFormatException
           218   234   237   Class java/lang/NumberFormatException
      LineNumberTable:
        line 45: 0
        line 47: 9
        line 49: 15
        line 51: 24
        line 52: 27
        line 53: 35
        line 57: 42
        line 61: 51
        line 59: 54
        line 63: 56
        line 64: 63
        line 65: 66
        line 67: 75
        line 68: 83
        line 70: 90
        line 71: 99
        line 72: 119
        line 74: 128
        line 75: 131
        line 77: 140
        line 78: 148
        line 82: 155
        line 83: 164
        line 88: 171
        line 85: 174
        line 87: 176
        line 88: 182
        line 92: 185
        line 94: 191
        line 95: 194
        line 97: 203
        line 98: 211
        line 102: 218
        line 103: 227
        line 108: 234
        line 105: 237
        line 107: 239
        line 108: 245
        line 112: 248
        line 115: 254
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27      36     4  page   I
           35      28     5  args   [Ljava/lang/String;
           99      29     5 eventId   I
          119       9     6  page   I
           83      45     4  args   [Ljava/lang/String;
          164       7     5 eventId   I
          176       6     5     e   Ljava/lang/NumberFormatException;
          148      43     4  args   [Ljava/lang/String;
          227       7     5 eventId   I
          239       6     5     e   Ljava/lang/NumberFormatException;
          211      43     4  args   [Ljava/lang/String;
            0     256     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle;
            0     256     1 command   Ljava/lang/String;
            0     256     2 player   Lext/mods/gameserver/model/actor/Player;
            0     256     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 15
        frame_type = 15 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int, class "[Ljava/lang/String;" ]
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 1 /* same */
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 253 /* append */
          offset_delta = 49
          locals = [ class "[Ljava/lang/String;", int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 10
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class "[Ljava/lang/String;" ]
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 10 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class "[Ljava/lang/String;" ]
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 10 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #322                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 368: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_4
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String battleboss
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #37                 // String battlebossinfo
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #43                 // String battlebossregister
        18: aastore
        19: dup
        20: iconst_3
        21: ldc           #58                 // String battlebossunregister
        23: aastore
        24: putstatic     #322                // Field VOICED_COMMANDS:[Ljava/lang/String;
        27: return
      LineNumberTable:
        line 32: 0
}
SourceFile: "VoicedBossBattle.java"
BootstrapMethods:
  0: #434 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #389 (Ljava/lang/Object;)Z
      #391 REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle.lambda$showEventList$0:(Lext/mods/battlerboss/holder/EventHolder;)Z
      #394 (Lext/mods/battlerboss/holder/EventHolder;)Z
  1: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #395 <font color=\"LEVEL\"><b>\u0001\u0001</b></font><br>
  2: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #397 <font color=\"AAAAAA\">\u0001</font><br>
  3: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #399 <td><button value=\"Info\" action=\"bypass -h voiced_battlebossinfo \u0001 \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  4: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #401 <td><button value=\"Registrar\" action=\"bypass -h voiced_battlebossregister \u0001\" width=80 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  5: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #403 <td><button value=\"unRegistrar\" action=\"bypass -h voiced_battlebossunregister \u0001\" width=80 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  6: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #405 <td width=32 valign=top><img src=\"\u0001\" width=32 height=32></td>
  7: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #407 <font color=LEVEL>[\u0001]</font>
  8: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #409 <a action=\"bypass -h voiced_battleboss \u0001\">\u0001</a>
  9: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #411 <tr><td width=32><img src=\"\u0001\" width=32 height=32></td>
  10: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #413 <td><font color=\"LEVEL\">\u0001\u0001</font></td></tr>
  11: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #415 \u0001<br>
  12: #434 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #417 (Ljava/lang/Object;)Ljava/lang/Object;
      #419 REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/VoicedBossBattle.dayOfWeekToString:(I)Ljava/lang/String;
      #422 (Ljava/lang/Integer;)Ljava/lang/String;
  13: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #424 <br><font color=LEVEL>Dias:</font> \u0001<br>
  14: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #426 <font color=LEVEL>Horários:</font> \u0001<br><br>
  15: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #428 <td><button value=\"Back\" action=\"bypass -h voiced_battleboss \u0001\" width=60 height=20 back=\"sek.cbui94\" fore=\"sek.cbui92\"></td>
  16: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #430 O evento \u0001 não está ativo no momento. Dias: \u0001 às \u0001.
  17: #441 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #432 Unknown(\u0001)
InnerClasses:
  public static final #452= #448 of #450; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
