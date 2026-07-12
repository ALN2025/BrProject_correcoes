// Bytecode for: ext.mods.gameserver.model.actor.instance.MissionNpc
// File: ext\mods\gameserver\model\actor\instance\MissionNpc.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/MissionNpc.class
  Last modified 9 de jul de 2026; size 7349 bytes
  MD5 checksum 0c18c31f46b87a5dee5f31368548a920
  Compiled from "MissionNpc.java"
public class ext.mods.gameserver.model.actor.instance.MissionNpc extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #59                         // ext/mods/gameserver/model/actor/instance/MissionNpc
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = String             #8            //
    #8 = Utf8
    #9 = InvokeDynamic      #0:#10        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #10 = NameAndType        #11:#12       // makeConcatWithConstants:(I)Ljava/lang/String;
   #11 = Utf8               makeConcatWithConstants
   #12 = Utf8               (I)Ljava/lang/String;
   #13 = InvokeDynamic      #1:#14        // #1:makeConcatWithConstants:(II)Ljava/lang/String;
   #14 = NameAndType        #11:#15       // makeConcatWithConstants:(II)Ljava/lang/String;
   #15 = Utf8               (II)Ljava/lang/String;
   #16 = InvokeDynamic      #2:#17        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #17 = NameAndType        #11:#18       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #18 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #19 = String             #20           // mission
   #20 = Utf8               mission
   #21 = Methodref          #22.#23       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #22 = Class              #24           // java/lang/String
   #23 = NameAndType        #25:#26       // startsWith:(Ljava/lang/String;)Z
   #24 = Utf8               java/lang/String
   #25 = Utf8               startsWith
   #26 = Utf8               (Ljava/lang/String;)Z
   #27 = Fieldref           #28.#29       // ext/mods/Config.ENABLE_MISSION:Z
   #28 = Class              #30           // ext/mods/Config
   #29 = NameAndType        #31:#32       // ENABLE_MISSION:Z
   #30 = Utf8               ext/mods/Config
   #31 = Utf8               ENABLE_MISSION
   #32 = Utf8               Z
   #33 = Class              #34           // java/util/StringTokenizer
   #34 = Utf8               java/util/StringTokenizer
   #35 = String             #36           //
   #36 = Utf8
   #37 = Methodref          #33.#38       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #38 = NameAndType        #5:#39        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #39 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #40 = Methodref          #33.#41       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #41 = NameAndType        #42:#43       // nextToken:()Ljava/lang/String;
   #42 = Utf8               nextToken
   #43 = Utf8               ()Ljava/lang/String;
   #44 = Methodref          #33.#45       // java/util/StringTokenizer.hasMoreTokens:()Z
   #45 = NameAndType        #46:#47       // hasMoreTokens:()Z
   #46 = Utf8               hasMoreTokens
   #47 = Utf8               ()Z
   #48 = Methodref          #49.#50       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #49 = Class              #51           // java/lang/Integer
   #50 = NameAndType        #52:#53       // parseInt:(Ljava/lang/String;)I
   #51 = Utf8               java/lang/Integer
   #52 = Utf8               parseInt
   #53 = Utf8               (Ljava/lang/String;)I
   #54 = Class              #55           // java/lang/NumberFormatException
   #55 = Utf8               java/lang/NumberFormatException
   #56 = Class              #57           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #57 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #58 = Methodref          #59.#60       // ext/mods/gameserver/model/actor/instance/MissionNpc.getObjectId:()I
   #59 = Class              #61           // ext/mods/gameserver/model/actor/instance/MissionNpc
   #60 = NameAndType        #62:#63       // getObjectId:()I
   #61 = Utf8               ext/mods/gameserver/model/actor/instance/MissionNpc
   #62 = Utf8               getObjectId
   #63 = Utf8               ()I
   #64 = Methodref          #56.#65       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #65 = NameAndType        #5:#66        // "<init>":(I)V
   #66 = Utf8               (I)V
   #67 = Methodref          #68.#69       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #68 = Class              #70           // ext/mods/gameserver/model/actor/Player
   #69 = NameAndType        #71:#72       // getLocale:()Ljava/util/Locale;
   #70 = Utf8               ext/mods/gameserver/model/actor/Player
   #71 = Utf8               getLocale
   #72 = Utf8               ()Ljava/util/Locale;
   #73 = Methodref          #59.#74       // ext/mods/gameserver/model/actor/instance/MissionNpc.getNpcId:()I
   #74 = NameAndType        #75:#63       // getNpcId:()I
   #75 = Utf8               getNpcId
   #76 = Methodref          #59.#77       // ext/mods/gameserver/model/actor/instance/MissionNpc.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #77 = NameAndType        #78:#79       // getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #78 = Utf8               getHtmlPath
   #79 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
   #80 = Methodref          #56.#81       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #81 = NameAndType        #82:#83       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #82 = Utf8               setFile
   #83 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #84 = String             #85           // %list%
   #85 = Utf8               %list%
   #86 = Methodref          #59.#87       // ext/mods/gameserver/model/actor/instance/MissionNpc.getList:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
   #87 = NameAndType        #88:#89       // getList:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
   #88 = Utf8               getList
   #89 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
   #90 = Methodref          #22.#91       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #91 = NameAndType        #92:#93       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #92 = Utf8               valueOf
   #93 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #94 = Methodref          #56.#95       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #95 = NameAndType        #96:#39       // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #96 = Utf8               replace
   #97 = Methodref          #68.#98       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #98 = NameAndType        #99:#100      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #99 = Utf8               sendPacket
  #100 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #101 = Fieldref           #102.#103     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #102 = Class              #104          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #103 = NameAndType        #105:#106     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #104 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #105 = Utf8               STATIC_PACKET
  #106 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #107 = Methodref          #108.#109     // java/lang/Math.max:(II)I
  #108 = Class              #110          // java/lang/Math
  #109 = NameAndType        #111:#112     // max:(II)I
  #110 = Utf8               java/lang/Math
  #111 = Utf8               max
  #112 = Utf8               (II)I
  #113 = Class              #114          // java/lang/StringBuilder
  #114 = Utf8               java/lang/StringBuilder
  #115 = Methodref          #113.#116     // java/lang/StringBuilder."<init>":()V
  #116 = NameAndType        #5:#117       // "<init>":()V
  #117 = Utf8               ()V
  #118 = Class              #119          // ext/mods/commons/data/Pagination
  #119 = Utf8               ext/mods/commons/data/Pagination
  #120 = Methodref          #68.#121      // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #121 = NameAndType        #122:#123     // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #122 = Utf8               getMissions
  #123 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #124 = Methodref          #125.#126     // ext/mods/gameserver/model/actor/container/player/MissionList.getAvailableTypes:()Ljava/util/List;
  #125 = Class              #127          // ext/mods/gameserver/model/actor/container/player/MissionList
  #126 = NameAndType        #128:#129     // getAvailableTypes:()Ljava/util/List;
  #127 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
  #128 = Utf8               getAvailableTypes
  #129 = Utf8               ()Ljava/util/List;
  #130 = InterfaceMethodref #131.#132     // java/util/List.stream:()Ljava/util/stream/Stream;
  #131 = Class              #133          // java/util/List
  #132 = NameAndType        #134:#135     // stream:()Ljava/util/stream/Stream;
  #133 = Utf8               java/util/List
  #134 = Utf8               stream
  #135 = Utf8               ()Ljava/util/stream/Stream;
  #136 = Methodref          #118.#137     // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
  #137 = NameAndType        #5:#138       // "<init>":(Ljava/util/stream/Stream;II)V
  #138 = Utf8               (Ljava/util/stream/Stream;II)V
  #139 = Methodref          #118.#140     // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
  #140 = NameAndType        #141:#142     // iterator:()Ljava/util/Iterator;
  #141 = Utf8               iterator
  #142 = Utf8               ()Ljava/util/Iterator;
  #143 = InterfaceMethodref #144.#145     // java/util/Iterator.hasNext:()Z
  #144 = Class              #146          // java/util/Iterator
  #145 = NameAndType        #147:#47      // hasNext:()Z
  #146 = Utf8               java/util/Iterator
  #147 = Utf8               hasNext
  #148 = InterfaceMethodref #144.#149     // java/util/Iterator.next:()Ljava/lang/Object;
  #149 = NameAndType        #150:#151     // next:()Ljava/lang/Object;
  #150 = Utf8               next
  #151 = Utf8               ()Ljava/lang/Object;
  #152 = Class              #153          // ext/mods/gameserver/enums/actors/MissionType
  #153 = Utf8               ext/mods/gameserver/enums/actors/MissionType
  #154 = Methodref          #125.#155     // ext/mods/gameserver/model/actor/container/player/MissionList.getMission:(Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #155 = NameAndType        #156:#157     // getMission:(Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #156 = Utf8               getMission
  #157 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #158 = Methodref          #159.#160     // ext/mods/gameserver/custom/data/MissionData.getInstance:()Lext/mods/gameserver/custom/data/MissionData;
  #159 = Class              #161          // ext/mods/gameserver/custom/data/MissionData
  #160 = NameAndType        #162:#163     // getInstance:()Lext/mods/gameserver/custom/data/MissionData;
  #161 = Utf8               ext/mods/gameserver/custom/data/MissionData
  #162 = Utf8               getInstance
  #163 = Utf8               ()Lext/mods/gameserver/custom/data/MissionData;
  #164 = Methodref          #165.#166     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #165 = Class              #167          // ext/mods/gameserver/model/holder/IntIntHolder
  #166 = NameAndType        #168:#63      // getId:()I
  #167 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #168 = Utf8               getId
  #169 = Methodref          #159.#170     // ext/mods/gameserver/custom/data/MissionData.getMissionByLevel:(Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
  #170 = NameAndType        #171:#172     // getMissionByLevel:(Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
  #171 = Utf8               getMissionByLevel
  #172 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
  #173 = Methodref          #174.#175     // ext/mods/gameserver/model/Mission.getLevel:()I
  #174 = Class              #176          // ext/mods/gameserver/model/Mission
  #175 = NameAndType        #177:#63      // getLevel:()I
  #176 = Utf8               ext/mods/gameserver/model/Mission
  #177 = Utf8               getLevel
  #178 = Methodref          #174.#179     // ext/mods/gameserver/model/Mission.getRequired:()I
  #179 = NameAndType        #180:#63      // getRequired:()I
  #180 = Utf8               getRequired
  #181 = Methodref          #165.#182     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #182 = NameAndType        #183:#63      // getValue:()I
  #183 = Utf8               getValue
  #184 = Methodref          #59.#185      // ext/mods/gameserver/model/actor/instance/MissionNpc.generateBar:(IIII)Ljava/lang/String;
  #185 = NameAndType        #186:#187     // generateBar:(IIII)Ljava/lang/String;
  #186 = Utf8               generateBar
  #187 = Utf8               (IIII)Ljava/lang/String;
  #188 = InvokeDynamic      #3:#17        // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #189 = Methodref          #113.#190     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #190 = NameAndType        #191:#192     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #191 = Utf8               append
  #192 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #193 = Methodref          #174.#194     // ext/mods/gameserver/model/Mission.getIcon:()Ljava/lang/String;
  #194 = NameAndType        #195:#43      // getIcon:()Ljava/lang/String;
  #195 = Utf8               getIcon
  #196 = InvokeDynamic      #4:#197       // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #197 = NameAndType        #11:#198      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #198 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #199 = Methodref          #174.#200     // ext/mods/gameserver/model/Mission.getName:()Ljava/lang/String;
  #200 = NameAndType        #201:#43      // getName:()Ljava/lang/String;
  #201 = Utf8               getName
  #202 = String             #203          // <font color=00FF00>Done</font>
  #203 = Utf8               <font color=00FF00>Done</font>
  #204 = InvokeDynamic      #5:#205       // #5:makeConcatWithConstants:(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #205 = NameAndType        #11:#206      // makeConcatWithConstants:(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #206 = Utf8               (ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #207 = InvokeDynamic      #6:#17        // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #208 = Methodref          #174.#209     // ext/mods/gameserver/model/Mission.getDescription:()Ljava/lang/String;
  #209 = NameAndType        #210:#43      // getDescription:()Ljava/lang/String;
  #210 = Utf8               getDescription
  #211 = String             #212          // %remain%
  #212 = Utf8               %remain%
  #213 = Methodref          #214.#215     // ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
  #214 = Class              #216          // ext/mods/commons/lang/StringUtil
  #215 = NameAndType        #217:#218     // formatNumber:(J)Ljava/lang/String;
  #216 = Utf8               ext/mods/commons/lang/StringUtil
  #217 = Utf8               formatNumber
  #218 = Utf8               (J)Ljava/lang/String;
  #219 = Methodref          #22.#220      // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #220 = NameAndType        #221:#198     // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #221 = Utf8               replaceAll
  #222 = String             #223          // %remaindefault%
  #223 = Utf8               %remaindefault%
  #224 = InvokeDynamic      #7:#17        // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #225 = Methodref          #118.#226     // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #226 = NameAndType        #227:#66      // generateSpace:(I)V
  #227 = Utf8               generateSpace
  #228 = InvokeDynamic      #8:#10        // #8:makeConcatWithConstants:(I)Ljava/lang/String;
  #229 = Methodref          #118.#230     // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #230 = NameAndType        #231:#232     // generatePages:(Ljava/lang/String;)V
  #231 = Utf8               generatePages
  #232 = Utf8               (Ljava/lang/String;)V
  #233 = Methodref          #118.#234     // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #234 = NameAndType        #235:#43      // getContent:()Ljava/lang/String;
  #235 = Utf8               getContent
  #236 = Methodref          #113.#237     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #237 = NameAndType        #238:#43      // toString:()Ljava/lang/String;
  #238 = Utf8               toString
  #239 = InvokeDynamic      #9:#240       // #9:makeConcatWithConstants:(IIII)Ljava/lang/String;
  #240 = NameAndType        #11:#187      // makeConcatWithConstants:(IIII)Ljava/lang/String;
  #241 = InvokeDynamic      #10:#242      // #10:makeConcatWithConstants:(III)Ljava/lang/String;
  #242 = NameAndType        #11:#243      // makeConcatWithConstants:(III)Ljava/lang/String;
  #243 = Utf8               (III)Ljava/lang/String;
  #244 = Utf8               Code
  #245 = Utf8               LineNumberTable
  #246 = Utf8               LocalVariableTable
  #247 = Utf8               this
  #248 = Utf8               Lext/mods/gameserver/model/actor/instance/MissionNpc;
  #249 = Utf8               objectId
  #250 = Utf8               I
  #251 = Utf8               template
  #252 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #253 = Utf8               player
  #254 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #255 = Utf8               npcId
  #256 = Utf8               val
  #257 = Utf8               filename
  #258 = Utf8               Ljava/lang/String;
  #259 = Utf8               StackMapTable
  #260 = Utf8               onBypassFeedback
  #261 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #262 = Utf8               e
  #263 = Utf8               Ljava/lang/NumberFormatException;
  #264 = Utf8               st
  #265 = Utf8               Ljava/util/StringTokenizer;
  #266 = Utf8               page
  #267 = Utf8               html
  #268 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #269 = Utf8               command
  #270 = Utf8               showChatWindow
  #271 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #272 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #273 = Utf8               data
  #274 = Utf8               Lext/mods/gameserver/model/Mission;
  #275 = Utf8               completed
  #276 = Utf8               type
  #277 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
  #278 = Utf8               sb
  #279 = Utf8               Ljava/lang/StringBuilder;
  #280 = Utf8               list
  #281 = Utf8               Lext/mods/commons/data/Pagination;
  #282 = Utf8               LocalVariableTypeTable
  #283 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/enums/actors/MissionType;>;
  #284 = Utf8               width
  #285 = Utf8               height
  #286 = Utf8               current
  #287 = Utf8               bar
  #288 = Utf8               SourceFile
  #289 = Utf8               MissionNpc.java
  #290 = Utf8               BootstrapMethods
  #291 = String             #292          // \u0001
  #292 = Utf8               \u0001
  #293 = String             #294          // \u0001-\u0001
  #294 = Utf8               \u0001-\u0001
  #295 = String             #296          // html/mods/mission/\u0001.htm
  #296 = Utf8               html/mods/mission/\u0001.htm
  #297 = String             #298          // <table width=278 bgcolor=000000><tr><td width=278 align=center>\u0001</td></tr></table><table width=278 bgcolor=000000><tr>
  #298 = Utf8               <table width=278 bgcolor=000000><tr><td width=278 align=center>\u0001</td></tr></table><table width=278 bgcolor=000000><tr>
  #299 = String             #300          // <td width=40 height=40 align=right><button width=32 height=32 back=\u0001 fore=\u0001></td>
  #300 = Utf8               <td width=40 height=40 align=right><button width=32 height=32 back=\u0001 fore=\u0001></td>
  #301 = String             #302          // <td width=278><font color=LEVEL>Lv \u0001</font> \u0001 \u0001<br1>
  #302 = Utf8               <td width=278><font color=LEVEL>Lv \u0001</font> \u0001 \u0001<br1>
  #303 = String             #304          // [\u0001 achievement complete]
  #304 = Utf8               [\u0001 achievement complete]
  #305 = String             #306          // <font color=B09878>\u0001</font></td></tr></table><img src=L2UI.SquareGray width=278 height=1>
  #306 = Utf8               <font color=B09878>\u0001</font></td></tr></table><img src=L2UI.SquareGray width=278 height=1>
  #307 = String             #308          // bypass npc_\u0001_mission %page%
  #308 = Utf8               bypass npc_\u0001_mission %page%
  #309 = String             #310          // <table width=\u0001 cellspacing=0 cellpadding=0><tr><td width=\u0001 align=center><img src=L2UI_CH3.BR_BAR1_CP width=\u0001 height=\u0001/></td>
  #310 = Utf8               <table width=\u0001 cellspacing=0 cellpadding=0><tr><td width=\u0001 align=center><img src=L2UI_CH3.BR_BAR1_CP width=\u0001 height=\u0001/></td>
  #311 = String             #312          // <td width=\u0001 align=center><img src=L2UI_CH3.BR_BAR1_HP1 width=\u0001 height=\u0001/></td></tr></table>
  #312 = Utf8               <td width=\u0001 align=center><img src=L2UI_CH3.BR_BAR1_HP1 width=\u0001 height=\u0001/></td></tr></table>
  #313 = MethodHandle       6:#314        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #314 = Methodref          #315.#316     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #315 = Class              #317          // java/lang/invoke/StringConcatFactory
  #316 = NameAndType        #11:#318      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #317 = Utf8               java/lang/invoke/StringConcatFactory
  #318 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #319 = Utf8               InnerClasses
  #320 = Class              #321          // java/lang/invoke/MethodHandles$Lookup
  #321 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #322 = Class              #323          // java/lang/invoke/MethodHandles
  #323 = Utf8               java/lang/invoke/MethodHandles
  #324 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.MissionNpc(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 39: 0
        line 40: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/MissionNpc;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: ldc           #7                  // String
         2: astore        4
         4: iload_3
         5: ifne          19
         8: iload_2
         9: invokedynamic #9,  0              // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        14: astore        4
        16: goto          28
        19: iload_2
        20: iload_3
        21: invokedynamic #13,  0             // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
        26: astore        4
        28: aload         4
        30: invokedynamic #16,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        35: areturn
      LineNumberTable:
        line 45: 0
        line 46: 4
        line 47: 8
        line 49: 19
        line 51: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/instance/MissionNpc;
            0      36     1 player   Lext/mods/gameserver/model/actor/Player;
            0      36     2 npcId   I
            0      36     3   val   I
            4      32     4 filename   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/lang/String ]
        frame_type = 8 /* same */

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=3
         0: aload_2
         1: ldc           #19                 // String mission
         3: invokevirtual #21                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          113
         9: getstatic     #27                 // Field ext/mods/Config.ENABLE_MISSION:Z
        12: ifeq          113
        15: new           #33                 // class java/util/StringTokenizer
        18: dup
        19: aload_2
        20: ldc           #35                 // String
        22: invokespecial #37                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        25: astore_3
        26: aload_3
        27: invokevirtual #40                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        30: pop
        31: iconst_1
        32: istore        4
        34: aload_3
        35: invokevirtual #44                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        38: ifeq          58
        41: aload_3
        42: invokevirtual #40                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        45: invokestatic  #48                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        48: istore        4
        50: goto          58
        53: astore        5
        55: iconst_1
        56: istore        4
        58: new           #56                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        61: dup
        62: aload_0
        63: invokevirtual #58                 // Method getObjectId:()I
        66: invokespecial #64                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        69: astore        5
        71: aload         5
        73: aload_1
        74: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        77: aload_0
        78: aload_1
        79: aload_0
        80: invokevirtual #73                 // Method getNpcId:()I
        83: iconst_0
        84: invokevirtual #76                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
        87: invokevirtual #80                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        90: aload         5
        92: ldc           #84                 // String %list%
        94: aload_0
        95: aload_1
        96: iload         4
        98: invokevirtual #86                 // Method getList:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
       101: invokestatic  #90                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       104: invokevirtual #94                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       107: aload_1
       108: aload         5
       110: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       113: return
      Exception table:
         from    to  target type
            41    50    53   Class java/lang/NumberFormatException
      LineNumberTable:
        line 57: 0
        line 59: 9
        line 61: 15
        line 62: 26
        line 64: 31
        line 65: 34
        line 69: 41
        line 74: 50
        line 71: 53
        line 73: 55
        line 77: 58
        line 78: 71
        line 79: 90
        line 80: 107
        line 83: 113
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           55       3     5     e   Ljava/lang/NumberFormatException;
           26      87     3    st   Ljava/util/StringTokenizer;
           34      79     4  page   I
           71      42     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     114     0  this   Lext/mods/gameserver/model/actor/instance/MissionNpc;
            0     114     1 player   Lext/mods/gameserver/model/actor/Player;
            0     114     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/model/actor/instance/MissionNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, int ]
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 4 /* same */
        frame_type = 249 /* chop */
          offset_delta = 54

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=3
         0: new           #56                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: aload_0
         5: invokevirtual #58                 // Method getObjectId:()I
         8: invokespecial #64                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        11: astore_3
        12: aload_3
        13: aload_1
        14: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        17: aload_0
        18: aload_1
        19: aload_0
        20: invokevirtual #73                 // Method getNpcId:()I
        23: iload_2
        24: invokevirtual #76                 // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
        27: invokevirtual #80                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        30: aload_3
        31: ldc           #84                 // String %list%
        33: aload_0
        34: aload_1
        35: iload_2
        36: invokevirtual #86                 // Method getList:(Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
        39: invokestatic  #90                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        42: invokevirtual #94                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        45: aload_1
        46: aload_3
        47: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        50: aload_1
        51: getstatic     #101                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        54: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        57: return
      LineNumberTable:
        line 88: 0
        line 89: 12
        line 90: 30
        line 91: 45
        line 92: 50
        line 93: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/actor/instance/MissionNpc;
            0      58     1 player   Lext/mods/gameserver/model/actor/Player;
            0      58     2   val   I
           12      46     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;

  protected java.lang.String getList(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=10, args_size=3
         0: iconst_1
         1: iload_2
         2: invokestatic  #107                // Method java/lang/Math.max:(II)I
         5: istore_2
         6: new           #113                // class java/lang/StringBuilder
         9: dup
        10: invokespecial #115                // Method java/lang/StringBuilder."<init>":()V
        13: astore_3
        14: new           #118                // class ext/mods/commons/data/Pagination
        17: dup
        18: aload_1
        19: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
        22: invokevirtual #124                // Method ext/mods/gameserver/model/actor/container/player/MissionList.getAvailableTypes:()Ljava/util/List;
        25: invokeinterface #130,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        30: iload_2
        31: bipush        6
        33: invokespecial #136                // Method ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
        36: astore        4
        38: aload         4
        40: invokevirtual #139                // Method ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
        43: astore        5
        45: aload         5
        47: invokeinterface #143,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        52: ifeq          286
        55: aload         5
        57: invokeinterface #148,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        62: checkcast     #152                // class ext/mods/gameserver/enums/actors/MissionType
        65: astore        6
        67: aload_1
        68: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
        71: aload         6
        73: invokevirtual #154                // Method ext/mods/gameserver/model/actor/container/player/MissionList.getMission:(Lext/mods/gameserver/enums/actors/MissionType;)Lext/mods/gameserver/model/holder/IntIntHolder;
        76: astore        7
        78: invokestatic  #158                // Method ext/mods/gameserver/custom/data/MissionData.getInstance:()Lext/mods/gameserver/custom/data/MissionData;
        81: aload         6
        83: aload         7
        85: invokevirtual #164                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        88: iconst_1
        89: iadd
        90: invokevirtual #169                // Method ext/mods/gameserver/custom/data/MissionData.getMissionByLevel:(Lext/mods/gameserver/enums/actors/MissionType;I)Lext/mods/gameserver/model/Mission;
        93: astore        8
        95: aload         8
        97: ifnonnull     103
       100: goto          45
       103: aload         8
       105: invokevirtual #173                // Method ext/mods/gameserver/model/Mission.getLevel:()I
       108: aload         7
       110: invokevirtual #164                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       113: if_icmpne     120
       116: iconst_1
       117: goto          121
       120: iconst_0
       121: istore        9
       123: aload_3
       124: aload_0
       125: sipush        273
       128: iconst_4
       129: iload         9
       131: ifeq          142
       134: aload         8
       136: invokevirtual #178                // Method ext/mods/gameserver/model/Mission.getRequired:()I
       139: goto          147
       142: aload         7
       144: invokevirtual #181                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       147: aload         8
       149: invokevirtual #178                // Method ext/mods/gameserver/model/Mission.getRequired:()I
       152: invokevirtual #184                // Method generateBar:(IIII)Ljava/lang/String;
       155: invokedynamic #188,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       160: invokevirtual #189                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       163: pop
       164: aload_3
       165: aload         8
       167: invokevirtual #193                // Method ext/mods/gameserver/model/Mission.getIcon:()Ljava/lang/String;
       170: aload         8
       172: invokevirtual #193                // Method ext/mods/gameserver/model/Mission.getIcon:()Ljava/lang/String;
       175: invokedynamic #196,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       180: invokevirtual #189                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       183: pop
       184: aload_3
       185: aload         8
       187: invokevirtual #173                // Method ext/mods/gameserver/model/Mission.getLevel:()I
       190: aload         8
       192: invokevirtual #199                // Method ext/mods/gameserver/model/Mission.getName:()Ljava/lang/String;
       195: iload         9
       197: ifeq          205
       200: ldc           #202                // String <font color=00FF00>Done</font>
       202: goto          207
       205: ldc           #7                  // String
       207: invokedynamic #204,  0            // InvokeDynamic #5:makeConcatWithConstants:(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       212: invokevirtual #189                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       215: pop
       216: aload_3
       217: iload         9
       219: ifeq          235
       222: aload         8
       224: invokevirtual #199                // Method ext/mods/gameserver/model/Mission.getName:()Ljava/lang/String;
       227: invokedynamic #207,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       232: goto          274
       235: aload         8
       237: invokevirtual #208                // Method ext/mods/gameserver/model/Mission.getDescription:()Ljava/lang/String;
       240: ldc           #211                // String %remain%
       242: aload         8
       244: invokevirtual #178                // Method ext/mods/gameserver/model/Mission.getRequired:()I
       247: aload         7
       249: invokevirtual #181                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       252: isub
       253: i2l
       254: invokestatic  #213                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       257: invokevirtual #219                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       260: ldc           #222                // String %remaindefault%
       262: aload         8
       264: invokevirtual #178                // Method ext/mods/gameserver/model/Mission.getRequired:()I
       267: i2l
       268: invokestatic  #213                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       271: invokevirtual #219                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       274: invokedynamic #224,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       279: invokevirtual #189                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       282: pop
       283: goto          45
       286: aload         4
       288: bipush        22
       290: invokevirtual #225                // Method ext/mods/commons/data/Pagination.generateSpace:(I)V
       293: aload         4
       295: aload_0
       296: invokevirtual #58                 // Method getObjectId:()I
       299: invokedynamic #228,  0            // InvokeDynamic #8:makeConcatWithConstants:(I)Ljava/lang/String;
       304: invokevirtual #229                // Method ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
       307: aload_3
       308: aload         4
       310: invokevirtual #233                // Method ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
       313: invokevirtual #189                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       316: pop
       317: aload_3
       318: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       321: areturn
      LineNumberTable:
        line 97: 0
        line 99: 6
        line 100: 14
        line 101: 38
        line 103: 67
        line 104: 78
        line 105: 95
        line 106: 100
        line 108: 103
        line 109: 123
        line 110: 164
        line 111: 184
        line 112: 216
        line 114: 283
        line 116: 286
        line 117: 293
        line 118: 307
        line 119: 317
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           78     205     7 mission   Lext/mods/gameserver/model/holder/IntIntHolder;
           95     188     8  data   Lext/mods/gameserver/model/Mission;
          123     160     9 completed   Z
           67     216     6  type   Lext/mods/gameserver/enums/actors/MissionType;
            0     322     0  this   Lext/mods/gameserver/model/actor/instance/MissionNpc;
            0     322     1 player   Lext/mods/gameserver/model/actor/Player;
            0     322     2  page   I
           14     308     3    sb   Ljava/lang/StringBuilder;
           38     284     4  list   Lext/mods/commons/data/Pagination;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           38     284     4  list   Lext/mods/commons/data/Pagination<Lext/mods/gameserver/enums/actors/MissionType;>;
      StackMapTable: number_of_entries = 11
        frame_type = 254 /* append */
          offset_delta = 45
          locals = [ class java/lang/StringBuilder, class ext/mods/commons/data/Pagination, class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/enums/actors/MissionType, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission ]
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/instance/MissionNpc, class ext/mods/gameserver/model/actor/Player, int, class java/lang/StringBuilder, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/enums/actors/MissionType, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission, int ]
          stack = [ class java/lang/StringBuilder, class ext/mods/gameserver/model/actor/instance/MissionNpc, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/model/actor/instance/MissionNpc, class ext/mods/gameserver/model/actor/Player, int, class java/lang/StringBuilder, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/enums/actors/MissionType, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission, int ]
          stack = [ class java/lang/StringBuilder, class ext/mods/gameserver/model/actor/instance/MissionNpc, int, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/model/actor/instance/MissionNpc, class ext/mods/gameserver/model/actor/Player, int, class java/lang/StringBuilder, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/enums/actors/MissionType, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission, int ]
          stack = [ class java/lang/StringBuilder, int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/instance/MissionNpc, class ext/mods/gameserver/model/actor/Player, int, class java/lang/StringBuilder, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/enums/actors/MissionType, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission, int ]
          stack = [ class java/lang/StringBuilder, int, class java/lang/String, class java/lang/String ]
        frame_type = 91 /* same_locals_1_stack_item */
          stack = [ class java/lang/StringBuilder ]
        frame_type = 255 /* full_frame */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/actor/instance/MissionNpc, class ext/mods/gameserver/model/actor/Player, int, class java/lang/StringBuilder, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/enums/actors/MissionType, class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/Mission, int ]
          stack = [ class java/lang/StringBuilder, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/model/actor/instance/MissionNpc, class ext/mods/gameserver/model/actor/Player, int, class java/lang/StringBuilder, class ext/mods/commons/data/Pagination ]
          stack = []

  public java.lang.String generateBar(int, int, int, int);
    descriptor: (IIII)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=5
         0: new           #113                // class java/lang/StringBuilder
         3: dup
         4: invokespecial #115                // Method java/lang/StringBuilder."<init>":()V
         7: astore        5
         9: iload_3
        10: iload         4
        12: if_icmple     20
        15: iload         4
        17: goto          21
        20: iload_3
        21: istore_3
        22: iload_1
        23: iload_3
        24: bipush        100
        26: imul
        27: iload         4
        29: idiv
        30: imul
        31: bipush        100
        33: idiv
        34: iconst_0
        35: invokestatic  #107                // Method java/lang/Math.max:(II)I
        38: istore        6
        40: aload         5
        42: iload_1
        43: iload         6
        45: iload         6
        47: iload_2
        48: invokedynamic #239,  0            // InvokeDynamic #9:makeConcatWithConstants:(IIII)Ljava/lang/String;
        53: invokevirtual #189                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        56: pop
        57: aload         5
        59: iload_1
        60: iload         6
        62: isub
        63: iload_1
        64: iload         6
        66: isub
        67: iload_2
        68: invokedynamic #241,  0            // InvokeDynamic #10:makeConcatWithConstants:(III)Ljava/lang/String;
        73: invokevirtual #189                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        76: pop
        77: aload         5
        79: invokevirtual #236                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        82: areturn
      LineNumberTable:
        line 124: 0
        line 125: 9
        line 126: 22
        line 127: 40
        line 128: 57
        line 129: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      83     0  this   Lext/mods/gameserver/model/actor/instance/MissionNpc;
            0      83     1 width   I
            0      83     2 height   I
            0      83     3 current   I
            0      83     4   max   I
            9      74     5    sb   Ljava/lang/StringBuilder;
           40      43     6   bar   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/StringBuilder ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "MissionNpc.java"
BootstrapMethods:
  0: #313 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #291 \u0001
  1: #313 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #293 \u0001-\u0001
  2: #313 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #295 html/mods/mission/\u0001.htm
  3: #313 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #297 <table width=278 bgcolor=000000><tr><td width=278 align=center>\u0001</td></tr></table><table width=278 bgcolor=000000><tr>
  4: #313 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #299 <td width=40 height=40 align=right><button width=32 height=32 back=\u0001 fore=\u0001></td>
  5: #313 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #301 <td width=278><font color=LEVEL>Lv \u0001</font> \u0001 \u0001<br1>
  6: #313 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #303 [\u0001 achievement complete]
  7: #313 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #305 <font color=B09878>\u0001</font></td></tr></table><img src=L2UI.SquareGray width=278 height=1>
  8: #313 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #307 bypass npc_\u0001_mission %page%
  9: #313 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #309 <table width=\u0001 cellspacing=0 cellpadding=0><tr><td width=\u0001 align=center><img src=L2UI_CH3.BR_BAR1_CP width=\u0001 height=\u0001/></td>
  10: #313 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #311 <td width=\u0001 align=center><img src=L2UI_CH3.BR_BAR1_HP1 width=\u0001 height=\u0001/></td></tr></table>
InnerClasses:
  public static final #324= #320 of #322; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
