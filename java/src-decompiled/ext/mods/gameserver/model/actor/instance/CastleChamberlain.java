// Bytecode for: ext.mods.gameserver.model.actor.instance.CastleChamberlain
// File: ext\mods\gameserver\model\actor\instance\CastleChamberlain.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/CastleChamberlain.class
  Last modified 9 de jul de 2026; size 34895 bytes
  MD5 checksum 48e15ece3073eb30616ea0293a9fe6a6
  Compiled from "CastleChamberlain.java"
public class ext.mods.gameserver.model.actor.instance.CastleChamberlain extends ext.mods.gameserver.model.actor.instance.Merchant
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/CastleChamberlain
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Merchant
  interfaces: 0, fields: 3, methods: 13, attributes: 4
Constant pool:
     #1 = Methodref          #2.#3        // ext/mods/gameserver/model/actor/instance/Merchant."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
     #2 = Class              #4           // ext/mods/gameserver/model/actor/instance/Merchant
     #3 = NameAndType        #5:#6        // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
     #4 = Utf8               ext/mods/gameserver/model/actor/instance/Merchant
     #5 = Utf8               <init>
     #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
     #7 = Fieldref           #8.#9        // ext/mods/gameserver/model/actor/instance/CastleChamberlain._preHour:I
     #8 = Class              #10          // ext/mods/gameserver/model/actor/instance/CastleChamberlain
     #9 = NameAndType        #11:#12      // _preHour:I
    #10 = Utf8               ext/mods/gameserver/model/actor/instance/CastleChamberlain
    #11 = Utf8               _preHour
    #12 = Utf8               I
    #13 = Fieldref           #8.#14       // ext/mods/gameserver/model/actor/instance/CastleChamberlain._ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    #14 = NameAndType        #15:#16      // _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    #15 = Utf8               _ai
    #16 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    #17 = Class              #18          // ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI
    #18 = Utf8               ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI
    #19 = Methodref          #17.#20      // ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI."<init>":(Lext/mods/gameserver/model/actor/instance/CastleChamberlain;)V
    #20 = NameAndType        #5:#21       // "<init>":(Lext/mods/gameserver/model/actor/instance/CastleChamberlain;)V
    #21 = Utf8               (Lext/mods/gameserver/model/actor/instance/CastleChamberlain;)V
    #22 = Methodref          #8.#23       // ext/mods/gameserver/model/actor/instance/CastleChamberlain.getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
    #23 = NameAndType        #24:#25      // getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
    #24 = Utf8               getNpcTalkCond
    #25 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
    #26 = Fieldref           #27.#28      // ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
    #27 = Class              #29          // ext/mods/gameserver/enums/actors/NpcTalkCond
    #28 = NameAndType        #30:#31      // NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
    #29 = Utf8               ext/mods/gameserver/enums/actors/NpcTalkCond
    #30 = Utf8               NONE
    #31 = Utf8               Lext/mods/gameserver/enums/actors/NpcTalkCond;
    #32 = Class              #33          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
    #33 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
    #34 = Methodref          #8.#35       // ext/mods/gameserver/model/actor/instance/CastleChamberlain.getObjectId:()I
    #35 = NameAndType        #36:#37      // getObjectId:()I
    #36 = Utf8               getObjectId
    #37 = Utf8               ()I
    #38 = Methodref          #32.#39      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
    #39 = NameAndType        #5:#40       // "<init>":(I)V
    #40 = Utf8               (I)V
    #41 = Methodref          #42.#43      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
    #42 = Class              #44          // ext/mods/gameserver/model/actor/Player
    #43 = NameAndType        #45:#46      // getLocale:()Ljava/util/Locale;
    #44 = Utf8               ext/mods/gameserver/model/actor/Player
    #45 = Utf8               getLocale
    #46 = Utf8               ()Ljava/util/Locale;
    #47 = String             #48          // html/chamberlain/noprivs.htm
    #48 = Utf8               html/chamberlain/noprivs.htm
    #49 = Methodref          #32.#50      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
    #50 = NameAndType        #51:#52      // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
    #51 = Utf8               setFile
    #52 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
    #53 = Methodref          #42.#54      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    #54 = NameAndType        #55:#56      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    #55 = Utf8               sendPacket
    #56 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    #57 = Fieldref           #27.#58      // ext/mods/gameserver/enums/actors/NpcTalkCond.UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
    #58 = NameAndType        #59:#31      // UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
    #59 = Utf8               UNDER_SIEGE
    #60 = String             #61          // html/chamberlain/busy.htm
    #61 = Utf8               html/chamberlain/busy.htm
    #62 = Class              #63          // java/util/StringTokenizer
    #63 = Utf8               java/util/StringTokenizer
    #64 = String             #65          //
    #65 = Utf8
    #66 = Methodref          #62.#67      // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
    #67 = NameAndType        #5:#68       // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
    #68 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
    #69 = Methodref          #62.#70      // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
    #70 = NameAndType        #71:#72      // nextToken:()Ljava/lang/String;
    #71 = Utf8               nextToken
    #72 = Utf8               ()Ljava/lang/String;
    #73 = Methodref          #62.#74      // java/util/StringTokenizer.hasMoreTokens:()Z
    #74 = NameAndType        #75:#76      // hasMoreTokens:()Z
    #75 = Utf8               hasMoreTokens
    #76 = Utf8               ()Z
    #77 = String             #78          //
    #78 = Utf8
    #79 = String             #80          // banish_foreigner
    #80 = Utf8               banish_foreigner
    #81 = Methodref          #82.#83      // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
    #82 = Class              #84          // java/lang/String
    #83 = NameAndType        #85:#86      // equalsIgnoreCase:(Ljava/lang/String;)Z
    #84 = Utf8               java/lang/String
    #85 = Utf8               equalsIgnoreCase
    #86 = Utf8               (Ljava/lang/String;)Z
    #87 = Fieldref           #88.#89      // ext/mods/gameserver/enums/PrivilegeType.CP_RIGHT_TO_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
    #88 = Class              #90          // ext/mods/gameserver/enums/PrivilegeType
    #89 = NameAndType        #91:#92      // CP_RIGHT_TO_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
    #90 = Utf8               ext/mods/gameserver/enums/PrivilegeType
    #91 = Utf8               CP_RIGHT_TO_DISMISS
    #92 = Utf8               Lext/mods/gameserver/enums/PrivilegeType;
    #93 = Methodref          #8.#94       // ext/mods/gameserver/model/actor/instance/CastleChamberlain.validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
    #94 = NameAndType        #95:#96      // validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
    #95 = Utf8               validatePrivileges
    #96 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
    #97 = Methodref          #8.#98       // ext/mods/gameserver/model/actor/instance/CastleChamberlain.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
    #98 = NameAndType        #99:#100     // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
    #99 = Utf8               getCastle
   #100 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
   #101 = Methodref          #102.#103    // ext/mods/gameserver/model/residence/castle/Castle.banishForeigners:()V
   #102 = Class              #104         // ext/mods/gameserver/model/residence/castle/Castle
   #103 = NameAndType        #105:#106    // banishForeigners:()V
   #104 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #105 = Utf8               banishForeigners
   #106 = Utf8               ()V
   #107 = String             #108         // html/chamberlain/banishafter.htm
   #108 = Utf8               html/chamberlain/banishafter.htm
   #109 = Methodref          #8.#110      // ext/mods/gameserver/model/actor/instance/CastleChamberlain.sendFileMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #110 = NameAndType        #111:#112    // sendFileMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #111 = Utf8               sendFileMessage
   #112 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #113 = String             #114         // banish_foreigner_show
   #114 = Utf8               banish_foreigner_show
   #115 = String             #116         // html/chamberlain/banishfore.htm
   #116 = Utf8               html/chamberlain/banishfore.htm
   #117 = String             #118         // manage_functions
   #118 = Utf8               manage_functions
   #119 = Fieldref           #88.#120     // ext/mods/gameserver/enums/PrivilegeType.CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #120 = NameAndType        #121:#92     // CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #121 = Utf8               CP_SET_FUNCTIONS
   #122 = String             #123         // html/chamberlain/chamberlain-manage.htm
   #123 = Utf8               html/chamberlain/chamberlain-manage.htm
   #124 = String             #125         // functions
   #125 = Utf8               functions
   #126 = Fieldref           #88.#127     // ext/mods/gameserver/enums/PrivilegeType.CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #127 = NameAndType        #128:#92     // CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #128 = Utf8               CP_USE_FUNCTIONS
   #129 = String             #130         // tele
   #130 = Utf8               tele
   #131 = Methodref          #102.#132    // ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
   #132 = NameAndType        #133:#134    // getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
   #133 = Utf8               getFunction
   #134 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
   #135 = String             #136         // html/chamberlain/chamberlain-nac.htm
   #136 = Utf8               html/chamberlain/chamberlain-nac.htm
   #137 = String             #138         // %objectId%
   #138 = Utf8               %objectId%
   #139 = Methodref          #32.#140     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
   #140 = NameAndType        #141:#142    // replace:(Ljava/lang/String;I)V
   #141 = Utf8               replace
   #142 = Utf8               (Ljava/lang/String;I)V
   #143 = Methodref          #144.#145    // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
   #144 = Class              #146         // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
   #145 = NameAndType        #147:#37     // getLvl:()I
   #146 = Utf8               ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
   #147 = Utf8               getLvl
   #148 = Fieldref           #149.#150    // ext/mods/gameserver/enums/TeleportType.CHF_LEVEL_2:Lext/mods/gameserver/enums/TeleportType;
   #149 = Class              #151         // ext/mods/gameserver/enums/TeleportType
   #150 = NameAndType        #152:#153    // CHF_LEVEL_2:Lext/mods/gameserver/enums/TeleportType;
   #151 = Utf8               ext/mods/gameserver/enums/TeleportType
   #152 = Utf8               CHF_LEVEL_2
   #153 = Utf8               Lext/mods/gameserver/enums/TeleportType;
   #154 = Fieldref           #149.#155    // ext/mods/gameserver/enums/TeleportType.CHF_LEVEL_1:Lext/mods/gameserver/enums/TeleportType;
   #155 = NameAndType        #156:#153    // CHF_LEVEL_1:Lext/mods/gameserver/enums/TeleportType;
   #156 = Utf8               CHF_LEVEL_1
   #157 = Methodref          #8.#158      // ext/mods/gameserver/model/actor/instance/CastleChamberlain.showTeleportWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
   #158 = NameAndType        #159:#160    // showTeleportWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
   #159 = Utf8               showTeleportWindow
   #160 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
   #161 = String             #162         // support
   #162 = Utf8               support
   #163 = InvokeDynamic      #0:#164      // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #164 = NameAndType        #165:#166    // makeConcatWithConstants:(I)Ljava/lang/String;
   #165 = Utf8               makeConcatWithConstants
   #166 = Utf8               (I)Ljava/lang/String;
   #167 = String             #168         // %mp%
   #168 = Utf8               %mp%
   #169 = Methodref          #8.#170      // ext/mods/gameserver/model/actor/instance/CastleChamberlain.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #170 = NameAndType        #171:#172    // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #171 = Utf8               getStatus
   #172 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #173 = Methodref          #174.#175    // ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
   #174 = Class              #176         // ext/mods/gameserver/model/actor/status/NpcStatus
   #175 = NameAndType        #177:#178    // getMp:()D
   #176 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
   #177 = Utf8               getMp
   #178 = Utf8               ()D
   #179 = String             #180         // back
   #180 = Utf8               back
   #181 = Methodref          #8.#182      // ext/mods/gameserver/model/actor/instance/CastleChamberlain.showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #182 = NameAndType        #183:#184    // showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #183 = Utf8               showChatWindow
   #184 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #185 = String             #186         // html/chamberlain/chamberlain-functions.htm
   #186 = Utf8               html/chamberlain/chamberlain-functions.htm
   #187 = String             #188         // %xp_regen%
   #188 = Utf8               %xp_regen%
   #189 = String             #190         // 0
   #190 = Utf8               0
   #191 = Methodref          #32.#192     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #192 = NameAndType        #141:#68     // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #193 = String             #194         // %hp_regen%
   #194 = Utf8               %hp_regen%
   #195 = String             #196         // %mp_regen%
   #196 = Utf8               %mp_regen%
   #197 = String             #198         // %npcId%
   #198 = Utf8               %npcId%
   #199 = Methodref          #8.#200      // ext/mods/gameserver/model/actor/instance/CastleChamberlain.getNpcId:()I
   #200 = NameAndType        #201:#37     // getNpcId:()I
   #201 = Utf8               getNpcId
   #202 = String             #203         // manage
   #203 = Utf8               manage
   #204 = String             #205         // recovery
   #205 = Utf8               recovery
   #206 = Methodref          #102.#207    // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
   #207 = NameAndType        #208:#37     // getOwnerId:()I
   #208 = Utf8               getOwnerId
   #209 = String             #210         // hp_cancel
   #210 = Utf8               hp_cancel
   #211 = String             #212         // html/chamberlain/functions-cancel.htm
   #212 = Utf8               html/chamberlain/functions-cancel.htm
   #213 = String             #214         // %apply%
   #214 = Utf8               %apply%
   #215 = String             #216         // recovery hp 0
   #216 = Utf8               recovery hp 0
   #217 = String             #218         // mp_cancel
   #218 = Utf8               mp_cancel
   #219 = String             #220         // recovery mp 0
   #220 = Utf8               recovery mp 0
   #221 = String             #222         // exp_cancel
   #222 = Utf8               exp_cancel
   #223 = String             #224         // recovery exp 0
   #224 = Utf8               recovery exp 0
   #225 = String             #226         // edit_hp
   #226 = Utf8               edit_hp
   #227 = String             #228         // html/chamberlain/functions-apply.htm
   #228 = Utf8               html/chamberlain/functions-apply.htm
   #229 = String             #230         // %name%
   #230 = Utf8               %name%
   #231 = String             #232         // Fireplace (HP Recovery Device)
   #232 = Utf8               Fireplace (HP Recovery Device)
   #233 = Methodref          #234.#235    // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #234 = Class              #236         // java/lang/Integer
   #235 = NameAndType        #237:#238    // parseInt:(Ljava/lang/String;)I
   #236 = Utf8               java/lang/Integer
   #237 = Utf8               parseInt
   #238 = Utf8               (Ljava/lang/String;)I
   #239 = Fieldref           #240.#241    // ext/mods/Config.CS_HPREG1_FEE:I
   #240 = Class              #242         // ext/mods/Config
   #241 = NameAndType        #243:#12     // CS_HPREG1_FEE:I
   #242 = Utf8               ext/mods/Config
   #243 = Utf8               CS_HPREG1_FEE
   #244 = Fieldref           #240.#245    // ext/mods/Config.CS_HPREG2_FEE:I
   #245 = NameAndType        #246:#12     // CS_HPREG2_FEE:I
   #246 = Utf8               CS_HPREG2_FEE
   #247 = Fieldref           #240.#248    // ext/mods/Config.CS_HPREG3_FEE:I
   #248 = NameAndType        #249:#12     // CS_HPREG3_FEE:I
   #249 = Utf8               CS_HPREG3_FEE
   #250 = Fieldref           #240.#251    // ext/mods/Config.CS_HPREG4_FEE:I
   #251 = NameAndType        #252:#12     // CS_HPREG4_FEE:I
   #252 = Utf8               CS_HPREG4_FEE
   #253 = Fieldref           #240.#254    // ext/mods/Config.CS_HPREG5_FEE:I
   #254 = NameAndType        #255:#12     // CS_HPREG5_FEE:I
   #255 = Utf8               CS_HPREG5_FEE
   #256 = String             #257         // %cost%
   #257 = Utf8               %cost%
   #258 = Fieldref           #240.#259    // ext/mods/Config.CS_HPREG_FEE_RATIO:J
   #259 = NameAndType        #260:#261    // CS_HPREG_FEE_RATIO:J
   #260 = Utf8               CS_HPREG_FEE_RATIO
   #261 = Utf8               J
   #262 = Long               86400000l
   #264 = InvokeDynamic      #1:#265      // #1:makeConcatWithConstants:(IJ)Ljava/lang/String;
   #265 = NameAndType        #165:#266    // makeConcatWithConstants:(IJ)Ljava/lang/String;
   #266 = Utf8               (IJ)Ljava/lang/String;
   #267 = String             #268         // %use%
   #268 = Utf8               %use%
   #269 = InvokeDynamic      #2:#164      // #2:makeConcatWithConstants:(I)Ljava/lang/String;
   #270 = InvokeDynamic      #3:#164      // #3:makeConcatWithConstants:(I)Ljava/lang/String;
   #271 = String             #272         // edit_mp
   #272 = Utf8               edit_mp
   #273 = String             #274         // Carpet (MP Recovery)
   #274 = Utf8               Carpet (MP Recovery)
   #275 = Fieldref           #240.#276    // ext/mods/Config.CS_MPREG1_FEE:I
   #276 = NameAndType        #277:#12     // CS_MPREG1_FEE:I
   #277 = Utf8               CS_MPREG1_FEE
   #278 = Fieldref           #240.#279    // ext/mods/Config.CS_MPREG2_FEE:I
   #279 = NameAndType        #280:#12     // CS_MPREG2_FEE:I
   #280 = Utf8               CS_MPREG2_FEE
   #281 = Fieldref           #240.#282    // ext/mods/Config.CS_MPREG3_FEE:I
   #282 = NameAndType        #283:#12     // CS_MPREG3_FEE:I
   #283 = Utf8               CS_MPREG3_FEE
   #284 = Fieldref           #240.#285    // ext/mods/Config.CS_MPREG4_FEE:I
   #285 = NameAndType        #286:#12     // CS_MPREG4_FEE:I
   #286 = Utf8               CS_MPREG4_FEE
   #287 = Fieldref           #240.#288    // ext/mods/Config.CS_MPREG_FEE_RATIO:J
   #288 = NameAndType        #289:#261    // CS_MPREG_FEE_RATIO:J
   #289 = Utf8               CS_MPREG_FEE_RATIO
   #290 = InvokeDynamic      #4:#164      // #4:makeConcatWithConstants:(I)Ljava/lang/String;
   #291 = InvokeDynamic      #5:#164      // #5:makeConcatWithConstants:(I)Ljava/lang/String;
   #292 = String             #293         // edit_exp
   #293 = Utf8               edit_exp
   #294 = String             #295         // Chandelier (EXP Recovery Device)
   #295 = Utf8               Chandelier (EXP Recovery Device)
   #296 = Fieldref           #240.#297    // ext/mods/Config.CS_EXPREG1_FEE:I
   #297 = NameAndType        #298:#12     // CS_EXPREG1_FEE:I
   #298 = Utf8               CS_EXPREG1_FEE
   #299 = Fieldref           #240.#300    // ext/mods/Config.CS_EXPREG2_FEE:I
   #300 = NameAndType        #301:#12     // CS_EXPREG2_FEE:I
   #301 = Utf8               CS_EXPREG2_FEE
   #302 = Fieldref           #240.#303    // ext/mods/Config.CS_EXPREG3_FEE:I
   #303 = NameAndType        #304:#12     // CS_EXPREG3_FEE:I
   #304 = Utf8               CS_EXPREG3_FEE
   #305 = Fieldref           #240.#306    // ext/mods/Config.CS_EXPREG4_FEE:I
   #306 = NameAndType        #307:#12     // CS_EXPREG4_FEE:I
   #307 = Utf8               CS_EXPREG4_FEE
   #308 = Fieldref           #240.#309    // ext/mods/Config.CS_EXPREG_FEE_RATIO:J
   #309 = NameAndType        #310:#261    // CS_EXPREG_FEE_RATIO:J
   #310 = Utf8               CS_EXPREG_FEE_RATIO
   #311 = InvokeDynamic      #6:#164      // #6:makeConcatWithConstants:(I)Ljava/lang/String;
   #312 = InvokeDynamic      #7:#164      // #7:makeConcatWithConstants:(I)Ljava/lang/String;
   #313 = String             #314         // hp
   #314 = Utf8               hp
   #315 = String             #316         // html/chamberlain/functions-used.htm
   #316 = Utf8               html/chamberlain/functions-used.htm
   #317 = String             #318         // %val%
   #318 = Utf8               %val%
   #319 = InvokeDynamic      #8:#320      // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #320 = NameAndType        #165:#321    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #321 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #322 = String             #323         // html/chamberlain/functions-apply_confirmed.htm
   #323 = Utf8               html/chamberlain/functions-apply_confirmed.htm
   #324 = String             #325         // html/chamberlain/functions-cancel_confirmed.htm
   #325 = Utf8               html/chamberlain/functions-cancel_confirmed.htm
   #326 = Methodref          #102.#327    // ext/mods/gameserver/model/residence/castle/Castle.updateFunctions:(Lext/mods/gameserver/model/actor/Player;IIIJZ)Z
   #327 = NameAndType        #328:#329    // updateFunctions:(Lext/mods/gameserver/model/actor/Player;IIIJZ)Z
   #328 = Utf8               updateFunctions
   #329 = Utf8               (Lext/mods/gameserver/model/actor/Player;IIIJZ)Z
   #330 = String             #331         // html/chamberlain/low_adena.htm
   #331 = Utf8               html/chamberlain/low_adena.htm
   #332 = String             #333         // mp
   #333 = Utf8               mp
   #334 = String             #335         // exp
   #335 = Utf8               exp
   #336 = String             #337         // html/chamberlain/edit_recovery.htm
   #337 = Utf8               html/chamberlain/edit_recovery.htm
   #338 = String             #339         // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 80\">80%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 120\">120%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 180\">180%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 240\">240%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 300\">300%</a>]
   #339 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 80\">80%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 120\">120%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 180\">180%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 240\">240%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 300\">300%</a>]
   #340 = String             #341         // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 15\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 25\">25%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 35\">35%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 50\">50%</a>]
   #341 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 15\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 25\">25%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 35\">35%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 50\">50%</a>]
   #342 = String             #343         // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 5\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 15\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 30\">30%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 40\">40%</a>]
   #343 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 5\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 15\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 30\">30%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 40\">40%</a>]
   #344 = String             #345         // %hp_recovery%
   #345 = Utf8               %hp_recovery%
   #346 = Methodref          #144.#347    // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLease:()I
   #347 = NameAndType        #348:#37     // getLease:()I
   #348 = Utf8               getLease
   #349 = InvokeDynamic      #9:#350      // #9:makeConcatWithConstants:(IIJ)Ljava/lang/String;
   #350 = NameAndType        #165:#351    // makeConcatWithConstants:(IIJ)Ljava/lang/String;
   #351 = Utf8               (IIJ)Ljava/lang/String;
   #352 = String             #353         // %hp_period%
   #353 = Utf8               %hp_period%
   #354 = Class              #355         // java/text/SimpleDateFormat
   #355 = Utf8               java/text/SimpleDateFormat
   #356 = String             #357         // dd-MM-yyyy HH:mm
   #357 = Utf8               dd-MM-yyyy HH:mm
   #358 = Methodref          #354.#359    // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
   #359 = NameAndType        #5:#360      // "<init>":(Ljava/lang/String;)V
   #360 = Utf8               (Ljava/lang/String;)V
   #361 = Methodref          #144.#362    // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getEndTime:()J
   #362 = NameAndType        #363:#364    // getEndTime:()J
   #363 = Utf8               getEndTime
   #364 = Utf8               ()J
   #365 = Methodref          #366.#367    // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #366 = Class              #368         // java/lang/Long
   #367 = NameAndType        #369:#370    // valueOf:(J)Ljava/lang/Long;
   #368 = Utf8               java/lang/Long
   #369 = Utf8               valueOf
   #370 = Utf8               (J)Ljava/lang/Long;
   #371 = Methodref          #354.#372    // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
   #372 = NameAndType        #373:#374    // format:(Ljava/lang/Object;)Ljava/lang/String;
   #373 = Utf8               format
   #374 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #375 = InvokeDynamic      #10:#320     // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #376 = String             #377         // %change_hp%
   #377 = Utf8               %change_hp%
   #378 = InvokeDynamic      #11:#320     // #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #379 = String             #380         // none
   #380 = Utf8               none
   #381 = String             #382         // %exp_recovery%
   #382 = Utf8               %exp_recovery%
   #383 = InvokeDynamic      #12:#350     // #12:makeConcatWithConstants:(IIJ)Ljava/lang/String;
   #384 = String             #385         // %exp_period%
   #385 = Utf8               %exp_period%
   #386 = String             #387         // %change_exp%
   #387 = Utf8               %change_exp%
   #388 = InvokeDynamic      #13:#320     // #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #389 = String             #390         // %mp_recovery%
   #390 = Utf8               %mp_recovery%
   #391 = String             #392         // %mp_period%
   #392 = Utf8               %mp_period%
   #393 = String             #394         // %change_mp%
   #394 = Utf8               %change_mp%
   #395 = InvokeDynamic      #14:#320     // #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #396 = String             #397         // other
   #397 = Utf8               other
   #398 = String             #399         // tele_cancel
   #399 = Utf8               tele_cancel
   #400 = String             #401         // other tele 0
   #401 = Utf8               other tele 0
   #402 = String             #403         // support_cancel
   #403 = Utf8               support_cancel
   #404 = String             #405         // other support 0
   #405 = Utf8               other support 0
   #406 = String             #407         // edit_support
   #407 = Utf8               edit_support
   #408 = String             #409         // Insignia (Supplementary Magic)
   #409 = Utf8               Insignia (Supplementary Magic)
   #410 = Fieldref           #240.#411    // ext/mods/Config.CS_SUPPORT1_FEE:I
   #411 = NameAndType        #412:#12     // CS_SUPPORT1_FEE:I
   #412 = Utf8               CS_SUPPORT1_FEE
   #413 = Fieldref           #240.#414    // ext/mods/Config.CS_SUPPORT2_FEE:I
   #414 = NameAndType        #415:#12     // CS_SUPPORT2_FEE:I
   #415 = Utf8               CS_SUPPORT2_FEE
   #416 = Fieldref           #240.#417    // ext/mods/Config.CS_SUPPORT3_FEE:I
   #417 = NameAndType        #418:#12     // CS_SUPPORT3_FEE:I
   #418 = Utf8               CS_SUPPORT3_FEE
   #419 = Fieldref           #240.#420    // ext/mods/Config.CS_SUPPORT4_FEE:I
   #420 = NameAndType        #421:#12     // CS_SUPPORT4_FEE:I
   #421 = Utf8               CS_SUPPORT4_FEE
   #422 = Fieldref           #240.#423    // ext/mods/Config.CS_SUPPORT_FEE_RATIO:J
   #423 = NameAndType        #424:#261    // CS_SUPPORT_FEE_RATIO:J
   #424 = Utf8               CS_SUPPORT_FEE_RATIO
   #425 = String             #426         // Enables the use of supplementary magic.
   #426 = Utf8               Enables the use of supplementary magic.
   #427 = InvokeDynamic      #15:#164     // #15:makeConcatWithConstants:(I)Ljava/lang/String;
   #428 = String             #429         // edit_tele
   #429 = Utf8               edit_tele
   #430 = String             #431         // Mirror (Teleportation Device)
   #431 = Utf8               Mirror (Teleportation Device)
   #432 = Fieldref           #240.#433    // ext/mods/Config.CS_TELE1_FEE:I
   #433 = NameAndType        #434:#12     // CS_TELE1_FEE:I
   #434 = Utf8               CS_TELE1_FEE
   #435 = Fieldref           #240.#436    // ext/mods/Config.CS_TELE2_FEE:I
   #436 = NameAndType        #437:#12     // CS_TELE2_FEE:I
   #437 = Utf8               CS_TELE2_FEE
   #438 = Fieldref           #240.#439    // ext/mods/Config.CS_TELE_FEE_RATIO:J
   #439 = NameAndType        #440:#261    // CS_TELE_FEE_RATIO:J
   #440 = Utf8               CS_TELE_FEE_RATIO
   #441 = InvokeDynamic      #16:#164     // #16:makeConcatWithConstants:(I)Ljava/lang/String;
   #442 = InvokeDynamic      #17:#164     // #17:makeConcatWithConstants:(I)Ljava/lang/String;
   #443 = InvokeDynamic      #18:#320     // #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #444 = String             #445         // html/chamberlain/edit_other.htm
   #445 = Utf8               html/chamberlain/edit_other.htm
   #446 = String             #447         // [<a action=\"bypass -h npc_%objectId%_manage other edit_tele 1\">Level 1</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_tele 2\">Level 2</a>]
   #447 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other edit_tele 1\">Level 1</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_tele 2\">Level 2</a>]
   #448 = String             #449         // [<a action=\"bypass -h npc_%objectId%_manage other edit_support 1\">Level 1</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 2\">Level 2</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 3\">Level 3</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 4\">Level 4</a>]
   #449 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other edit_support 1\">Level 1</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 2\">Level 2</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 3\">Level 3</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 4\">Level 4</a>]
   #450 = String             #451         // %tele%
   #451 = Utf8               %tele%
   #452 = InvokeDynamic      #19:#350     // #19:makeConcatWithConstants:(IIJ)Ljava/lang/String;
   #453 = String             #454         // %tele_period%
   #454 = Utf8               %tele_period%
   #455 = String             #456         // %change_tele%
   #456 = Utf8               %change_tele%
   #457 = InvokeDynamic      #20:#320     // #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #458 = String             #459         // %support%
   #459 = Utf8               %support%
   #460 = InvokeDynamic      #21:#350     // #21:makeConcatWithConstants:(IIJ)Ljava/lang/String;
   #461 = String             #462         // %support_period%
   #462 = Utf8               %support_period%
   #463 = String             #464         // %change_support%
   #464 = Utf8               %change_support%
   #465 = InvokeDynamic      #22:#320     // #22:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #466 = String             #467         // html/chamberlain/manage.htm
   #467 = Utf8               html/chamberlain/manage.htm
   #468 = Methodref          #42.#469     // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
   #469 = NameAndType        #470:#76     // isCursedWeaponEquipped:()Z
   #470 = Utf8               isCursedWeaponEquipped
   #471 = String             #472         // The wielder of a cursed weapon cannot receive outside heals or buffs
   #472 = Utf8               The wielder of a cursed weapon cannot receive outside heals or buffs
   #473 = Methodref          #42.#474     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #474 = NameAndType        #475:#360    // sendMessage:(Ljava/lang/String;)V
   #475 = Utf8               sendMessage
   #476 = Methodref          #8.#477      // ext/mods/gameserver/model/actor/instance/CastleChamberlain.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
   #477 = NameAndType        #478:#479    // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
   #478 = Utf8               setTarget
   #479 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
   #480 = Fieldref           #240.#481    // ext/mods/Config.CUSTOM_BUFFER_MANAGER_NPC:Z
   #481 = NameAndType        #482:#483    // CUSTOM_BUFFER_MANAGER_NPC:Z
   #482 = Utf8               CUSTOM_BUFFER_MANAGER_NPC
   #483 = Utf8               Z
   #484 = Methodref          #485.#486    // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #485 = Class              #487         // ext/mods/gameserver/data/SkillTable
   #486 = NameAndType        #488:#489    // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #487 = Utf8               ext/mods/gameserver/data/SkillTable
   #488 = Utf8               getInstance
   #489 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #490 = Methodref          #485.#491    // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #491 = NameAndType        #492:#493    // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #492 = Utf8               getInfo
   #493 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #494 = Methodref          #495.#496    // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #495 = Class              #497         // ext/mods/gameserver/skills/L2Skill
   #496 = NameAndType        #498:#499    // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #497 = Utf8               ext/mods/gameserver/skills/L2Skill
   #498 = Utf8               getEffects
   #499 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #500 = Methodref          #8.#501      // ext/mods/gameserver/model/actor/instance/CastleChamberlain.getAI:()Lext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI;
   #501 = NameAndType        #502:#503    // getAI:()Lext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI;
   #502 = Utf8               getAI
   #503 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI;
   #504 = Double             1000000.0d
   #506 = Methodref          #17.#507     // ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI.addCastDesire:(Lext/mods/gameserver/model/actor/Creature;IID)V
   #507 = NameAndType        #508:#509    // addCastDesire:(Lext/mods/gameserver/model/actor/Creature;IID)V
   #508 = Utf8               addCastDesire
   #509 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IID)V
   #510 = Class              #511         // java/lang/Exception
   #511 = Utf8               java/lang/Exception
   #512 = String             #513         // Invalid skill, contact your server support.
   #513 = Utf8               Invalid skill, contact your server support.
   #514 = String             #515         // support_back
   #515 = Utf8               support_back
   #516 = String             #517         // products
   #517 = Utf8               products
   #518 = String             #519         // html/chamberlain/products.htm
   #519 = Utf8               html/chamberlain/products.htm
   #520 = String             #521         // list_siege_clans
   #521 = Utf8               list_siege_clans
   #522 = Fieldref           #88.#523     // ext/mods/gameserver/enums/PrivilegeType.CP_MANAGE_SIEGE_WAR:Lext/mods/gameserver/enums/PrivilegeType;
   #523 = NameAndType        #524:#92     // CP_MANAGE_SIEGE_WAR:Lext/mods/gameserver/enums/PrivilegeType;
   #524 = Utf8               CP_MANAGE_SIEGE_WAR
   #525 = Class              #526         // ext/mods/gameserver/network/serverpackets/SiegeInfo
   #526 = Utf8               ext/mods/gameserver/network/serverpackets/SiegeInfo
   #527 = Methodref          #525.#528    // ext/mods/gameserver/network/serverpackets/SiegeInfo."<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
   #528 = NameAndType        #5:#529      // "<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
   #529 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;)V
   #530 = String             #531         // receive_report
   #531 = Utf8               receive_report
   #532 = Fieldref           #27.#533     // ext/mods/gameserver/enums/actors/NpcTalkCond.CLAN_MEMBER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #533 = NameAndType        #534:#31     // CLAN_MEMBER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #534 = Utf8               CLAN_MEMBER
   #535 = Methodref          #536.#537    // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #536 = Class              #538         // ext/mods/gameserver/data/sql/ClanTable
   #537 = NameAndType        #488:#539    // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #538 = Utf8               ext/mods/gameserver/data/sql/ClanTable
   #539 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
   #540 = Methodref          #536.#541    // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
   #541 = NameAndType        #542:#543    // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
   #542 = Utf8               getClan
   #543 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
   #544 = String             #545         // html/chamberlain/report.htm
   #545 = Utf8               html/chamberlain/report.htm
   #546 = String             #547         // %clanname%
   #547 = Utf8               %clanname%
   #548 = Methodref          #549.#550    // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
   #549 = Class              #551         // ext/mods/gameserver/model/pledge/Clan
   #550 = NameAndType        #552:#72     // getName:()Ljava/lang/String;
   #551 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #552 = Utf8               getName
   #553 = String             #554         // %clanleadername%
   #554 = Utf8               %clanleadername%
   #555 = Methodref          #549.#556    // ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
   #556 = NameAndType        #557:#72     // getLeaderName:()Ljava/lang/String;
   #557 = Utf8               getLeaderName
   #558 = String             #559         // %castlename%
   #559 = Utf8               %castlename%
   #560 = Methodref          #102.#550    // ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
   #561 = String             #562         // %ss_event%
   #562 = Utf8               %ss_event%
   #563 = Methodref          #564.#565    // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #564 = Class              #566         // ext/mods/gameserver/data/manager/SevenSignsManager
   #565 = NameAndType        #488:#567    // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #566 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
   #567 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #568 = Methodref          #564.#569    // ext/mods/gameserver/data/manager/SevenSignsManager.getCurrentPeriod:()Lext/mods/gameserver/enums/PeriodType;
   #569 = NameAndType        #570:#571    // getCurrentPeriod:()Lext/mods/gameserver/enums/PeriodType;
   #570 = Utf8               getCurrentPeriod
   #571 = Utf8               ()Lext/mods/gameserver/enums/PeriodType;
   #572 = Methodref          #573.#550    // ext/mods/gameserver/enums/PeriodType.getName:()Ljava/lang/String;
   #573 = Class              #574         // ext/mods/gameserver/enums/PeriodType
   #574 = Utf8               ext/mods/gameserver/enums/PeriodType
   #575 = Fieldref           #576.#577    // ext/mods/gameserver/model/actor/instance/CastleChamberlain$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
   #576 = Class              #578         // ext/mods/gameserver/model/actor/instance/CastleChamberlain$1
   #577 = NameAndType        #579:#580    // $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
   #578 = Utf8               ext/mods/gameserver/model/actor/instance/CastleChamberlain$1
   #579 = Utf8               $SwitchMap$ext$mods$gameserver$enums$CabalType
   #580 = Utf8               [I
   #581 = Fieldref           #582.#583    // ext/mods/gameserver/enums/SealType.AVARICE:Lext/mods/gameserver/enums/SealType;
   #582 = Class              #584         // ext/mods/gameserver/enums/SealType
   #583 = NameAndType        #585:#586    // AVARICE:Lext/mods/gameserver/enums/SealType;
   #584 = Utf8               ext/mods/gameserver/enums/SealType
   #585 = Utf8               AVARICE
   #586 = Utf8               Lext/mods/gameserver/enums/SealType;
   #587 = Methodref          #564.#588    // ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #588 = NameAndType        #589:#590    // getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #589 = Utf8               getSealOwner
   #590 = Utf8               (Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #591 = Methodref          #592.#593    // ext/mods/gameserver/enums/CabalType.ordinal:()I
   #592 = Class              #594         // ext/mods/gameserver/enums/CabalType
   #593 = NameAndType        #595:#37     // ordinal:()I
   #594 = Utf8               ext/mods/gameserver/enums/CabalType
   #595 = Utf8               ordinal
   #596 = String             #597         // %ss_avarice%
   #597 = Utf8               %ss_avarice%
   #598 = String             #599         // Not in Possession
   #599 = Utf8               Not in Possession
   #600 = String             #601         // Lords of Dawn
   #601 = Utf8               Lords of Dawn
   #602 = String             #603         // Revolutionaries of Dusk
   #603 = Utf8               Revolutionaries of Dusk
   #604 = Fieldref           #582.#605    // ext/mods/gameserver/enums/SealType.GNOSIS:Lext/mods/gameserver/enums/SealType;
   #605 = NameAndType        #606:#586    // GNOSIS:Lext/mods/gameserver/enums/SealType;
   #606 = Utf8               GNOSIS
   #607 = String             #608         // %ss_gnosis%
   #608 = Utf8               %ss_gnosis%
   #609 = Fieldref           #582.#610    // ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
   #610 = NameAndType        #611:#586    // STRIFE:Lext/mods/gameserver/enums/SealType;
   #611 = Utf8               STRIFE
   #612 = String             #613         // %ss_strife%
   #613 = Utf8               %ss_strife%
   #614 = String             #615         // items
   #615 = Utf8               items
   #616 = Methodref          #82.#617     // java/lang/String.isEmpty:()Z
   #617 = NameAndType        #618:#76     // isEmpty:()Z
   #618 = Utf8               isEmpty
   #619 = InvokeDynamic      #23:#320     // #23:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #620 = Methodref          #8.#621      // ext/mods/gameserver/model/actor/instance/CastleChamberlain.showBuyWindow:(Lext/mods/gameserver/model/actor/Player;I)V
   #621 = NameAndType        #622:#623    // showBuyWindow:(Lext/mods/gameserver/model/actor/Player;I)V
   #622 = Utf8               showBuyWindow
   #623 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #624 = String             #625         // manage_vault
   #625 = Utf8               manage_vault
   #626 = Fieldref           #88.#627     // ext/mods/gameserver/enums/PrivilegeType.CP_MANAGE_TAXES:Lext/mods/gameserver/enums/PrivilegeType;
   #627 = NameAndType        #628:#92     // CP_MANAGE_TAXES:Lext/mods/gameserver/enums/PrivilegeType;
   #628 = Utf8               CP_MANAGE_TAXES
   #629 = String             #630         // html/chamberlain/vault.htm
   #630 = Utf8               html/chamberlain/vault.htm
   #631 = String             #632         // deposit
   #632 = Utf8               deposit
   #633 = Methodref          #102.#634    // ext/mods/gameserver/model/residence/castle/Castle.getTreasury:()J
   #634 = NameAndType        #635:#364    // getTreasury:()J
   #635 = Utf8               getTreasury
   #636 = Long               2147483647l
   #638 = Methodref          #42.#639     // ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
   #639 = NameAndType        #640:#641    // reduceAdena:(IZ)Z
   #640 = Utf8               reduceAdena
   #641 = Utf8               (IZ)Z
   #642 = Methodref          #102.#643    // ext/mods/gameserver/model/residence/castle/Castle.editTreasury:(JZ)Z
   #643 = NameAndType        #644:#645    // editTreasury:(JZ)Z
   #644 = Utf8               editTreasury
   #645 = Utf8               (JZ)Z
   #646 = String             #647         // withdraw
   #647 = Utf8               withdraw
   #648 = String             #649         // html/chamberlain/vault-no.htm
   #649 = Utf8               html/chamberlain/vault-no.htm
   #650 = Methodref          #42.#651     // ext/mods/gameserver/model/actor/Player.addAdena:(IZ)V
   #651 = NameAndType        #652:#653    // addAdena:(IZ)V
   #652 = Utf8               addAdena
   #653 = Utf8               (IZ)V
   #654 = String             #655         // %tax_income%
   #655 = Utf8               %tax_income%
   #656 = Methodref          #657.#658    // ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
   #657 = Class              #659         // ext/mods/commons/lang/StringUtil
   #658 = NameAndType        #660:#661    // formatNumber:(J)Ljava/lang/String;
   #659 = Utf8               ext/mods/commons/lang/StringUtil
   #660 = Utf8               formatNumber
   #661 = Utf8               (J)Ljava/lang/String;
   #662 = String             #663         // %tax_income_reserved%
   #663 = Utf8               %tax_income_reserved%
   #664 = Methodref          #102.#665    // ext/mods/gameserver/model/residence/castle/Castle.getTaxRevenue:()J
   #665 = NameAndType        #666:#364    // getTaxRevenue:()J
   #666 = Utf8               getTaxRevenue
   #667 = String             #668         // %seed_income%
   #668 = Utf8               %seed_income%
   #669 = Methodref          #102.#670    // ext/mods/gameserver/model/residence/castle/Castle.getSeedIncome:()J
   #670 = NameAndType        #671:#364    // getSeedIncome:()J
   #671 = Utf8               getSeedIncome
   #672 = String             #673         // %withdraw_amount%
   #673 = Utf8               %withdraw_amount%
   #674 = String             #675         // operate_door
   #675 = Utf8               operate_door
   #676 = Fieldref           #88.#677     // ext/mods/gameserver/enums/PrivilegeType.CP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #677 = NameAndType        #678:#92     // CP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #678 = Utf8               CP_ENTRY_EXIT_RIGHTS
   #679 = InvokeDynamic      #24:#164     // #24:makeConcatWithConstants:(I)Ljava/lang/String;
   #680 = Methodref          #102.#681    // ext/mods/gameserver/model/residence/castle/Castle.openDoor:(Lext/mods/gameserver/model/actor/Player;I)V
   #681 = NameAndType        #682:#623    // openDoor:(Lext/mods/gameserver/model/actor/Player;I)V
   #682 = Utf8               openDoor
   #683 = Methodref          #102.#684    // ext/mods/gameserver/model/residence/castle/Castle.closeDoor:(Lext/mods/gameserver/model/actor/Player;I)V
   #684 = NameAndType        #685:#623    // closeDoor:(Lext/mods/gameserver/model/actor/Player;I)V
   #685 = Utf8               closeDoor
   #686 = String             #687         // html/chamberlain/doors-open.htm
   #687 = Utf8               html/chamberlain/doors-open.htm
   #688 = String             #689         // chamberlain/doors-close.htm
   #689 = Utf8               chamberlain/doors-close.htm
   #690 = String             #691         // tax_set
   #691 = Utf8               tax_set
   #692 = String             #693         // html/chamberlain/tax-member.htm
   #693 = Utf8               html/chamberlain/tax-member.htm
   #694 = String             #695         // %currentTaxRate%
   #695 = Utf8               %currentTaxRate%
   #696 = Methodref          #102.#697    // ext/mods/gameserver/model/residence/castle/Castle.getCurrentTaxPercent:()I
   #697 = NameAndType        #698:#37     // getCurrentTaxPercent:()I
   #698 = Utf8               getCurrentTaxPercent
   #699 = String             #700         // %nextTaxRate%
   #700 = Utf8               %nextTaxRate%
   #701 = Methodref          #102.#702    // ext/mods/gameserver/model/residence/castle/Castle.getNextTaxPercent:()I
   #702 = NameAndType        #703:#37     // getNextTaxPercent:()I
   #703 = Utf8               getNextTaxPercent
   #704 = String             #705         // html/chamberlain/tax-leader.htm
   #705 = Utf8               html/chamberlain/tax-leader.htm
   #706 = String             #707         // %taxLimit%
   #707 = Utf8               %taxLimit%
   #708 = Methodref          #8.#709      // ext/mods/gameserver/model/actor/instance/CastleChamberlain.getTaxLimit:()I
   #709 = NameAndType        #710:#37     // getTaxLimit:()I
   #710 = Utf8               getTaxLimit
   #711 = String             #712         // tax_adjust
   #712 = Utf8               tax_adjust
   #713 = String             #714         // html/chamberlain/tax-toohigh.htm
   #714 = Utf8               html/chamberlain/tax-toohigh.htm
   #715 = Methodref          #102.#716    // ext/mods/gameserver/model/residence/castle/Castle.setNextTaxPercent:(IZ)V
   #716 = NameAndType        #717:#653    // setNextTaxPercent:(IZ)V
   #717 = Utf8               setNextTaxPercent
   #718 = String             #719         // html/chamberlain/tax-after.htm
   #719 = Utf8               html/chamberlain/tax-after.htm
   #720 = String             #721         // manor
   #721 = Utf8               manor
   #722 = Fieldref           #88.#723     // ext/mods/gameserver/enums/PrivilegeType.CP_MANOR_ADMINISTRATION:Lext/mods/gameserver/enums/PrivilegeType;
   #723 = NameAndType        #724:#92     // CP_MANOR_ADMINISTRATION:Lext/mods/gameserver/enums/PrivilegeType;
   #724 = Utf8               CP_MANOR_ADMINISTRATION
   #725 = Fieldref           #240.#726    // ext/mods/Config.ALLOW_MANOR:Z
   #726 = NameAndType        #727:#483    // ALLOW_MANOR:Z
   #727 = Utf8               ALLOW_MANOR
   #728 = String             #729         // html/npcdefault.htm
   #729 = Utf8               html/npcdefault.htm
   #730 = String             #731         // html/chamberlain/manor/manor.htm
   #731 = Utf8               html/chamberlain/manor/manor.htm
   #732 = InvokeDynamic      #25:#320     // #25:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #733 = String             #734         // html/chamberlain/no.htm
   #734 = Utf8               html/chamberlain/no.htm
   #735 = Methodref          #82.#736     // java/lang/String.length:()I
   #736 = NameAndType        #737:#37     // length:()I
   #737 = Utf8               length
   #738 = String             #739         // manor_menu_select
   #739 = Utf8               manor_menu_select
   #740 = Methodref          #82.#741     // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #741 = NameAndType        #742:#86     // startsWith:(Ljava/lang/String;)Z
   #742 = Utf8               startsWith
   #743 = Methodref          #744.#745    // ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
   #744 = Class              #746         // ext/mods/gameserver/data/manager/CastleManorManager
   #745 = NameAndType        #488:#747    // getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
   #746 = Utf8               ext/mods/gameserver/data/manager/CastleManorManager
   #747 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManorManager;
   #748 = Methodref          #744.#749    // ext/mods/gameserver/data/manager/CastleManorManager.isUnderMaintenance:()Z
   #749 = NameAndType        #750:#76     // isUnderMaintenance:()Z
   #750 = Utf8               isUnderMaintenance
   #751 = Fieldref           #752.#753    // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #752 = Class              #754         // ext/mods/gameserver/network/serverpackets/ActionFailed
   #753 = NameAndType        #755:#756    // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #754 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #755 = Utf8               STATIC_PACKET
   #756 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #757 = Fieldref           #758.#759    // ext/mods/gameserver/network/SystemMessageId.THE_MANOR_SYSTEM_IS_CURRENTLY_UNDER_MAINTENANCE:Lext/mods/gameserver/network/SystemMessageId;
   #758 = Class              #760         // ext/mods/gameserver/network/SystemMessageId
   #759 = NameAndType        #761:#762    // THE_MANOR_SYSTEM_IS_CURRENTLY_UNDER_MAINTENANCE:Lext/mods/gameserver/network/SystemMessageId;
   #760 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #761 = Utf8               THE_MANOR_SYSTEM_IS_CURRENTLY_UNDER_MAINTENANCE
   #762 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #763 = Methodref          #42.#764     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #764 = NameAndType        #55:#765     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #765 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #766 = String             #767         // ?
   #767 = Utf8               ?
   #768 = Methodref          #82.#769     // java/lang/String.indexOf:(Ljava/lang/String;)I
   #769 = NameAndType        #770:#238    // indexOf:(Ljava/lang/String;)I
   #770 = Utf8               indexOf
   #771 = Methodref          #82.#772     // java/lang/String.substring:(I)Ljava/lang/String;
   #772 = NameAndType        #773:#166    // substring:(I)Ljava/lang/String;
   #773 = Utf8               substring
   #774 = String             #775         // &
   #775 = Utf8               &
   #776 = String             #777         // =
   #777 = Utf8               =
   #778 = Methodref          #82.#779     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #779 = NameAndType        #780:#781    // split:(Ljava/lang/String;)[Ljava/lang/String;
   #780 = Utf8               split
   #781 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #782 = String             #783         // 1
   #783 = Utf8               1
   #784 = Methodref          #82.#785     // java/lang/String.equals:(Ljava/lang/Object;)Z
   #785 = NameAndType        #786:#787    // equals:(Ljava/lang/Object;)Z
   #786 = Utf8               equals
   #787 = Utf8               (Ljava/lang/Object;)Z
   #788 = Methodref          #102.#789    // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
   #789 = NameAndType        #790:#37     // getId:()I
   #790 = Utf8               getId
   #791 = Class              #792         // ext/mods/gameserver/network/serverpackets/ExShowSeedInfo
   #792 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowSeedInfo
   #793 = Methodref          #791.#794    // ext/mods/gameserver/network/serverpackets/ExShowSeedInfo."<init>":(IZZ)V
   #794 = NameAndType        #5:#795      // "<init>":(IZZ)V
   #795 = Utf8               (IZZ)V
   #796 = Class              #797         // ext/mods/gameserver/network/serverpackets/ExShowCropInfo
   #797 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowCropInfo
   #798 = Methodref          #796.#794    // ext/mods/gameserver/network/serverpackets/ExShowCropInfo."<init>":(IZZ)V
   #799 = Class              #800         // ext/mods/gameserver/network/serverpackets/ExShowManorDefaultInfo
   #800 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowManorDefaultInfo
   #801 = Methodref          #799.#802    // ext/mods/gameserver/network/serverpackets/ExShowManorDefaultInfo."<init>":(Z)V
   #802 = NameAndType        #5:#803      // "<init>":(Z)V
   #803 = Utf8               (Z)V
   #804 = Methodref          #744.#805    // ext/mods/gameserver/data/manager/CastleManorManager.isManorApproved:()Z
   #805 = NameAndType        #806:#76     // isManorApproved:()Z
   #806 = Utf8               isManorApproved
   #807 = Fieldref           #758.#808    // ext/mods/gameserver/network/SystemMessageId.A_MANOR_CANNOT_BE_SET_UP_BETWEEN_6_AM_AND_8_PM:Lext/mods/gameserver/network/SystemMessageId;
   #808 = NameAndType        #809:#762    // A_MANOR_CANNOT_BE_SET_UP_BETWEEN_6_AM_AND_8_PM:Lext/mods/gameserver/network/SystemMessageId;
   #809 = Utf8               A_MANOR_CANNOT_BE_SET_UP_BETWEEN_6_AM_AND_8_PM
   #810 = Class              #811         // ext/mods/gameserver/network/serverpackets/ExShowSeedSetting
   #811 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowSeedSetting
   #812 = Methodref          #810.#39     // ext/mods/gameserver/network/serverpackets/ExShowSeedSetting."<init>":(I)V
   #813 = Class              #814         // ext/mods/gameserver/network/serverpackets/ExShowCropSetting
   #814 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowCropSetting
   #815 = Methodref          #813.#39     // ext/mods/gameserver/network/serverpackets/ExShowCropSetting."<init>":(I)V
   #816 = String             #817         // siege_change
   #817 = Utf8               siege_change
   #818 = Methodref          #102.#819    // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #819 = NameAndType        #820:#821    // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #820 = Utf8               getSiege
   #821 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #822 = Methodref          #823.#824    // ext/mods/gameserver/model/residence/castle/Siege.getSiegeRegistrationEndDate:()J
   #823 = Class              #825         // ext/mods/gameserver/model/residence/castle/Siege
   #824 = NameAndType        #826:#364    // getSiegeRegistrationEndDate:()J
   #825 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #826 = Utf8               getSiegeRegistrationEndDate
   #827 = Methodref          #828.#829    // java/util/Calendar.getInstance:()Ljava/util/Calendar;
   #828 = Class              #830         // java/util/Calendar
   #829 = NameAndType        #488:#831    // getInstance:()Ljava/util/Calendar;
   #830 = Utf8               java/util/Calendar
   #831 = Utf8               ()Ljava/util/Calendar;
   #832 = Methodref          #828.#833    // java/util/Calendar.getTimeInMillis:()J
   #833 = NameAndType        #834:#364    // getTimeInMillis:()J
   #834 = Utf8               getTimeInMillis
   #835 = String             #836         // html/chamberlain/siegetime1.htm
   #836 = Utf8               html/chamberlain/siegetime1.htm
   #837 = Methodref          #823.#838    // ext/mods/gameserver/model/residence/castle/Siege.isTimeRegistrationOver:()Z
   #838 = NameAndType        #839:#76     // isTimeRegistrationOver:()Z
   #839 = Utf8               isTimeRegistrationOver
   #840 = String             #841         // html/chamberlain/siegetime2.htm
   #841 = Utf8               html/chamberlain/siegetime2.htm
   #842 = String             #843         // html/chamberlain/siegetime3.htm
   #843 = Utf8               html/chamberlain/siegetime3.htm
   #844 = String             #845         // siege_time_set
   #845 = Utf8               siege_time_set
   #846 = Methodref          #102.#847    // ext/mods/gameserver/model/residence/castle/Castle.getSiegeDate:()Ljava/util/Calendar;
   #847 = NameAndType        #848:#831    // getSiegeDate:()Ljava/util/Calendar;
   #848 = Utf8               getSiegeDate
   #849 = Methodref          #828.#850    // java/util/Calendar.set:(II)V
   #850 = NameAndType        #851:#852    // set:(II)V
   #851 = Utf8               set
   #852 = Utf8               (II)V
   #853 = Methodref          #823.#854    // ext/mods/gameserver/model/residence/castle/Siege.endTimeRegistration:(Z)V
   #854 = NameAndType        #855:#803    // endTimeRegistration:(Z)V
   #855 = Utf8               endTimeRegistration
   #856 = String             #857         // html/chamberlain/siegetime8.htm
   #857 = Utf8               html/chamberlain/siegetime8.htm
   #858 = String             #859         // html/chamberlain/siegetime6.htm
   #859 = Utf8               html/chamberlain/siegetime6.htm
   #860 = String             #861         // give_crown
   #861 = Utf8               give_crown
   #862 = Fieldref           #27.#863     // ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #863 = NameAndType        #864:#31     // OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #864 = Utf8               OWNER
   #865 = Methodref          #42.#866     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #866 = NameAndType        #867:#868    // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #867 = Utf8               getInventory
   #868 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #869 = Methodref          #870.#871    // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #870 = Class              #872         // ext/mods/gameserver/model/itemcontainer/PcInventory
   #871 = NameAndType        #873:#874    // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #872 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #873 = Utf8               getItemByItemId
   #874 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #875 = Methodref          #42.#876     // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #876 = NameAndType        #877:#878    // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #877 = Utf8               addItem
   #878 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #879 = String             #880         // html/chamberlain/gavecrown.htm
   #880 = Utf8               html/chamberlain/gavecrown.htm
   #881 = String             #882         // %CharName%
   #882 = Utf8               %CharName%
   #883 = Methodref          #42.#550     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #884 = String             #885         // %FeudName%
   #885 = Utf8               %FeudName%
   #886 = String             #887         // html/chamberlain/hascrown.htm
   #887 = Utf8               html/chamberlain/hascrown.htm
   #888 = String             #889         // manor_certificate
   #889 = Utf8               manor_certificate
   #890 = Methodref          #564.#891    // ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
   #891 = NameAndType        #892:#76     // isSealValidationPeriod:()Z
   #892 = Utf8               isSealValidationPeriod
   #893 = Methodref          #42.#35      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #894 = Methodref          #564.#895    // ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
   #895 = NameAndType        #896:#897    // getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
   #896 = Utf8               getPlayerCabal
   #897 = Utf8               (I)Lext/mods/gameserver/enums/CabalType;
   #898 = Fieldref           #592.#899    // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
   #899 = NameAndType        #900:#901    // DUSK:Lext/mods/gameserver/enums/CabalType;
   #900 = Utf8               DUSK
   #901 = Utf8               Lext/mods/gameserver/enums/CabalType;
   #902 = String             #903         // html/chamberlain/not-dawn-or-event.htm
   #903 = Utf8               html/chamberlain/not-dawn-or-event.htm
   #904 = Methodref          #102.#905    // ext/mods/gameserver/model/residence/castle/Castle.getLeftCertificates:()I
   #905 = NameAndType        #906:#37     // getLeftCertificates:()I
   #906 = Utf8               getLeftCertificates
   #907 = String             #908         // html/chamberlain/not-enough-ticket.htm
   #908 = Utf8               html/chamberlain/not-enough-ticket.htm
   #909 = String             #910         // html/chamberlain/sell-dawn-ticket.htm
   #910 = Utf8               html/chamberlain/sell-dawn-ticket.htm
   #911 = String             #912         // %left%
   #912 = Utf8               %left%
   #913 = String             #914         // %bundle%
   #914 = Utf8               %bundle%
   #915 = String             #916         // %price%
   #916 = Utf8               %price%
   #917 = String             #918         // validate_certificate
   #918 = Utf8               validate_certificate
   #919 = Methodref          #102.#920    // ext/mods/gameserver/model/residence/castle/Castle.setLeftCertificates:(IZ)V
   #920 = NameAndType        #921:#653    // setLeftCertificates:(IZ)V
   #921 = Utf8               setLeftCertificates
   #922 = String             #923         // html/chamberlain/not-enough-adena.htm
   #923 = Utf8               html/chamberlain/not-enough-adena.htm
   #924 = String             #925         // castle_devices
   #925 = Utf8               castle_devices
   #926 = String             #927         // html/chamberlain/devices.htm
   #927 = Utf8               html/chamberlain/devices.htm
   #928 = String             #929         // doors_update
   #929 = Utf8               doors_update
   #930 = InvokeDynamic      #26:#164     // #26:makeConcatWithConstants:(I)Ljava/lang/String;
   #931 = String             #932         // html/chamberlain/doors-update.htm
   #932 = Utf8               html/chamberlain/doors-update.htm
   #933 = String             #934         // %id%
   #934 = Utf8               %id%
   #935 = String             #936         // %type%
   #936 = Utf8               %type%
   #937 = String             #938         // doors_choose_upgrade
   #938 = Utf8               doors_choose_upgrade
   #939 = String             #940         // html/chamberlain/doors-confirm.htm
   #940 = Utf8               html/chamberlain/doors-confirm.htm
   #941 = String             #942         // %level%
   #942 = Utf8               %level%
   #943 = Methodref          #8.#944      // ext/mods/gameserver/model/actor/instance/CastleChamberlain.getDoorCost:(II)I
   #944 = NameAndType        #945:#946    // getDoorCost:(II)I
   #945 = Utf8               getDoorCost
   #946 = Utf8               (II)I
   #947 = String             #948         // doors_confirm_upgrade
   #948 = Utf8               doors_confirm_upgrade
   #949 = Methodref          #102.#950    // ext/mods/gameserver/model/residence/castle/Castle.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
   #950 = NameAndType        #951:#952    // getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
   #951 = Utf8               getDoor
   #952 = Utf8               (I)Lext/mods/gameserver/model/actor/instance/Door;
   #953 = Methodref          #954.#955    // ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
   #954 = Class              #956         // ext/mods/gameserver/model/actor/instance/Door
   #955 = NameAndType        #171:#957    // getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
   #956 = Utf8               ext/mods/gameserver/model/actor/instance/Door
   #957 = Utf8               ()Lext/mods/gameserver/model/actor/status/DoorStatus;
   #958 = Methodref          #959.#960    // ext/mods/gameserver/model/actor/status/DoorStatus.getUpgradeHpRatio:()I
   #959 = Class              #961         // ext/mods/gameserver/model/actor/status/DoorStatus
   #960 = NameAndType        #962:#37     // getUpgradeHpRatio:()I
   #961 = Utf8               ext/mods/gameserver/model/actor/status/DoorStatus
   #962 = Utf8               getUpgradeHpRatio
   #963 = String             #964         // html/chamberlain/doors-already-updated.htm
   #964 = Utf8               html/chamberlain/doors-already-updated.htm
   #965 = Methodref          #102.#966    // ext/mods/gameserver/model/residence/castle/Castle.upgradeDoor:(IIZ)V
   #966 = NameAndType        #967:#968    // upgradeDoor:(IIZ)V
   #967 = Utf8               upgradeDoor
   #968 = Utf8               (IIZ)V
   #969 = String             #970         // html/chamberlain/doors-success.htm
   #970 = Utf8               html/chamberlain/doors-success.htm
   #971 = String             #972         // traps_update
   #972 = Utf8               traps_update
   #973 = InvokeDynamic      #27:#164     // #27:makeConcatWithConstants:(I)Ljava/lang/String;
   #974 = String             #975         // aden
   #975 = Utf8               aden
   #976 = InvokeDynamic      #28:#320     // #28:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #977 = String             #978         // %trapIndex%
   #978 = Utf8               %trapIndex%
   #979 = String             #980         // traps_choose_upgrade
   #980 = Utf8               traps_choose_upgrade
   #981 = String             #982         // html/chamberlain/traps-confirm.htm
   #982 = Utf8               html/chamberlain/traps-confirm.htm
   #983 = Methodref          #8.#984      // ext/mods/gameserver/model/actor/instance/CastleChamberlain.getTrapCost:(I)I
   #984 = NameAndType        #985:#986    // getTrapCost:(I)I
   #985 = Utf8               getTrapCost
   #986 = Utf8               (I)I
   #987 = String             #988         // traps_confirm_upgrade
   #988 = Utf8               traps_confirm_upgrade
   #989 = Methodref          #102.#990    // ext/mods/gameserver/model/residence/castle/Castle.getTrapUpgradeLevel:(I)I
   #990 = NameAndType        #991:#986    // getTrapUpgradeLevel:(I)I
   #991 = Utf8               getTrapUpgradeLevel
   #992 = String             #993         // html/chamberlain/traps-already-updated.htm
   #993 = Utf8               html/chamberlain/traps-already-updated.htm
   #994 = Methodref          #102.#995    // ext/mods/gameserver/model/residence/castle/Castle.setTrapUpgrade:(IIZ)V
   #995 = NameAndType        #996:#968    // setTrapUpgrade:(IIZ)V
   #996 = Utf8               setTrapUpgrade
   #997 = String             #998         // html/chamberlain/traps-success.htm
   #998 = Utf8               html/chamberlain/traps-success.htm
   #999 = Methodref          #2.#1000     // ext/mods/gameserver/model/actor/instance/Merchant.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #1000 = NameAndType        #1001:#112   // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #1001 = Utf8               onBypassFeedback
  #1002 = Fieldref           #576.#1003   // ext/mods/gameserver/model/actor/instance/CastleChamberlain$1.$SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
  #1003 = NameAndType        #1004:#580   // $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
  #1004 = Utf8               $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond
  #1005 = Methodref          #27.#593     // ext/mods/gameserver/enums/actors/NpcTalkCond.ordinal:()I
  #1006 = String             #1007        // html/chamberlain/chamberlain.htm
  #1007 = Utf8               html/chamberlain/chamberlain.htm
  #1008 = Methodref          #42.#1009    // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #1009 = NameAndType        #542:#1010   // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #1010 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #1011 = Methodref          #823.#1012   // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
  #1012 = NameAndType        #1013:#76    // isInProgress:()Z
  #1013 = Utf8               isInProgress
  #1014 = Methodref          #42.#1015    // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #1015 = NameAndType        #1016:#37    // getClanId:()I
  #1016 = Utf8               getClanId
  #1017 = Methodref          #42.#1018    // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #1018 = NameAndType        #1019:#76    // isClanLeader:()Z
  #1019 = Utf8               isClanLeader
  #1020 = Methodref          #42.#1021    // ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #1021 = NameAndType        #1022:#1023  // hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #1022 = Utf8               hasClanPrivileges
  #1023 = Utf8               (Lext/mods/gameserver/enums/PrivilegeType;)Z
  #1024 = String             #1025        // %time%
  #1025 = Utf8               %time%
  #1026 = Methodref          #828.#1027   // java/util/Calendar.getTime:()Ljava/util/Date;
  #1027 = NameAndType        #1028:#1029  // getTime:()Ljava/util/Date;
  #1028 = Utf8               getTime
  #1029 = Utf8               ()Ljava/util/Date;
  #1030 = Methodref          #1031.#1032  // java/util/Date.toString:()Ljava/lang/String;
  #1031 = Class              #1033        // java/util/Date
  #1032 = NameAndType        #1034:#72    // toString:()Ljava/lang/String;
  #1033 = Utf8               java/util/Date
  #1034 = Utf8               toString
  #1035 = Integer            300000
  #1036 = Integer            400000
  #1037 = Integer            500000
  #1038 = Integer            750000
  #1039 = Integer            900000
  #1040 = Integer            1000000
  #1041 = Integer            1600000
  #1042 = Integer            1800000
  #1043 = Integer            2000000
  #1044 = Double             0.8d
  #1046 = Integer            3000000
  #1047 = Integer            4000000
  #1048 = Integer            5000000
  #1049 = Integer            6000000
  #1050 = Utf8               CERTIFICATES_BUNDLE
  #1051 = Utf8               ConstantValue
  #1052 = Integer            10
  #1053 = Utf8               CERTIFICATES_PRICE
  #1054 = Integer            1000
  #1055 = Utf8               Code
  #1056 = Utf8               LineNumberTable
  #1057 = Utf8               LocalVariableTable
  #1058 = Utf8               this
  #1059 = Utf8               Lext/mods/gameserver/model/actor/instance/CastleChamberlain;
  #1060 = Utf8               objectId
  #1061 = Utf8               template
  #1062 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #1063 = Utf8               setAI
  #1064 = Utf8               html
  #1065 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #1066 = Utf8               chf
  #1067 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
  #1068 = Utf8               chfExp
  #1069 = Utf8               chfHp
  #1070 = Utf8               chfMp
  #1071 = Utf8               cost
  #1072 = Utf8               percent
  #1073 = Utf8               fee
  #1074 = Utf8               Ljava/lang/String;
  #1075 = Utf8               stage
  #1076 = Utf8               lvl
  #1077 = Utf8               chfTel
  #1078 = Utf8               chfSup
  #1079 = Utf8               skill
  #1080 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #1081 = Utf8               id
  #1082 = Utf8               e
  #1083 = Utf8               Ljava/lang/Exception;
  #1084 = Utf8               clan
  #1085 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #1086 = Utf8               filename
  #1087 = Utf8               amount
  #1088 = Utf8               open
  #1089 = Utf8               taxLimit
  #1090 = Utf8               taxRate
  #1091 = Utf8               cmd
  #1092 = Utf8               Lext/mods/gameserver/data/manager/CastleManorManager;
  #1093 = Utf8               params
  #1094 = Utf8               str
  #1095 = Utf8               Ljava/util/StringTokenizer;
  #1096 = Utf8               ask
  #1097 = Utf8               state
  #1098 = Utf8               time
  #1099 = Utf8               castleId
  #1100 = Utf8               type
  #1101 = Utf8               level
  #1102 = Utf8               price
  #1103 = Utf8               door
  #1104 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #1105 = Utf8               currentHpRatio
  #1106 = Utf8               trapIndex
  #1107 = Utf8               currentLevel
  #1108 = Utf8               player
  #1109 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #1110 = Utf8               command
  #1111 = Utf8               condition
  #1112 = Utf8               st
  #1113 = Utf8               actualCommand
  #1114 = Utf8               val
  #1115 = Utf8               StackMapTable
  #1116 = Class              #1117        // java/util/Locale
  #1117 = Utf8               java/util/Locale
  #1118 = Utf8               privilege
  #1119 = Utf8               htmlMessage
  #1120 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #1121 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #1122 = Utf8               SourceFile
  #1123 = Utf8               CastleChamberlain.java
  #1124 = Utf8               NestMembers
  #1125 = Utf8               BootstrapMethods
  #1126 = String             #1127        // html/chamberlain/support\u0001.htm
  #1127 = Utf8               html/chamberlain/support\u0001.htm
  #1128 = String             #1129        // \u0001</font> adenas / \u0001 day</font>)
  #1129 = Utf8               \u0001</font> adenas / \u0001 day</font>)
  #1130 = String             #1131        // Provides additional HP recovery for clan members in the castle.<font color=\"00FFFF\">\u0001%</font>
  #1131 = Utf8               Provides additional HP recovery for clan members in the castle.<font color=\"00FFFF\">\u0001%</font>
  #1132 = String             #1133        // recovery hp \u0001
  #1133 = Utf8               recovery hp \u0001
  #1134 = String             #1135        // Provides additional MP recovery for clan members in the castle.<font color=\"00FFFF\">\u0001%</font>
  #1135 = Utf8               Provides additional MP recovery for clan members in the castle.<font color=\"00FFFF\">\u0001%</font>
  #1136 = String             #1137        // recovery mp \u0001
  #1137 = Utf8               recovery mp \u0001
  #1138 = String             #1139        // Restores the Exp of any clan member who is resurrected in the castle.<font color=\"00FFFF\">\u0001%</font>
  #1139 = Utf8               Restores the Exp of any clan member who is resurrected in the castle.<font color=\"00FFFF\">\u0001%</font>
  #1140 = String             #1141        // recovery exp \u0001
  #1141 = Utf8               recovery exp \u0001
  #1142 = String             #1143        // \u0001%
  #1143 = Utf8               \u0001%
  #1144 = String             #1145        // \u0001%</font> (<font color=\"FFAABB\">\u0001</font> adenas /\u0001 day
  #1145 = Utf8               \u0001%</font> (<font color=\"FFAABB\">\u0001</font> adenas /\u0001 day
  #1146 = String             #1147        // Withdraw the fee for the next time at \u0001
  #1147 = Utf8               Withdraw the fee for the next time at \u0001
  #1148 = String             #1149        // [<a action=\"bypass -h npc_%objectId%_manage recovery hp_cancel\">Deactivate</a>]\u0001
  #1149 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery hp_cancel\">Deactivate</a>]\u0001
  #1150 = String             #1151        // \u0001%</font> (<font color=\"FFAABB\">\u0001</font> adenas /\u0001 day)
  #1151 = Utf8               \u0001%</font> (<font color=\"FFAABB\">\u0001</font> adenas /\u0001 day)
  #1152 = String             #1153        // [<a action=\"bypass -h npc_%objectId%_manage recovery exp_cancel\">Deactivate</a>]\u0001
  #1153 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery exp_cancel\">Deactivate</a>]\u0001
  #1154 = String             #1155        // [<a action=\"bypass -h npc_%objectId%_manage recovery mp_cancel\">Deactivate</a>]\u0001
  #1155 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery mp_cancel\">Deactivate</a>]\u0001
  #1156 = String             #1157        // other support \u0001
  #1157 = Utf8               other support \u0001
  #1158 = String             #1159        // Teleports clan members in a castle to the target <font color=\"00FFFF\">Stage \u0001</font> staging area
  #1159 = Utf8               Teleports clan members in a castle to the target <font color=\"00FFFF\">Stage \u0001</font> staging area
  #1160 = String             #1161        // other tele \u0001
  #1161 = Utf8               other tele \u0001
  #1162 = String             #1163        // Stage \u0001
  #1163 = Utf8               Stage \u0001
  #1164 = String             #1165        // Stage \u0001</font> (<font color=\"FFAABB\">\u0001</font> adenas /\u0001 day)
  #1165 = Utf8               Stage \u0001</font> (<font color=\"FFAABB\">\u0001</font> adenas /\u0001 day)
  #1166 = String             #1167        // [<a action=\"bypass -h npc_%objectId%_manage other tele_cancel\">Deactivate</a>]\u0001
  #1167 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other tele_cancel\">Deactivate</a>]\u0001
  #1168 = String             #1169        // Stage \u0001</font> (<font color=\"FFAABB\">\u0001</font> adenas /\u0001 Day)
  #1169 = Utf8               Stage \u0001</font> (<font color=\"FFAABB\">\u0001</font> adenas /\u0001 Day)
  #1170 = String             #1171        // [<a action=\"bypass -h npc_%objectId%_manage other support_cancel\">Deactivate</a>]\u0001
  #1171 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other support_cancel\">Deactivate</a>]\u0001
  #1172 = String             #1173        // \u00011
  #1173 = Utf8               \u00011
  #1174 = String             #1175        // html/chamberlain/\u0001-d.htm
  #1175 = Utf8               html/chamberlain/\u0001-d.htm
  #1176 = String             #1177        // html/chamberlain/manor/manor_help00\u0001.htm
  #1177 = Utf8               html/chamberlain/manor/manor_help00\u0001.htm
  #1178 = String             #1179        // html/chamberlain/\u0001-gu.htm
  #1179 = Utf8               html/chamberlain/\u0001-gu.htm
  #1180 = String             #1181        // html/chamberlain/\u0001-tu.htm
  #1181 = Utf8               html/chamberlain/\u0001-tu.htm
  #1182 = String             #1183        // html/chamberlain/traps-update\u0001.htm
  #1183 = Utf8               html/chamberlain/traps-update\u0001.htm
  #1184 = MethodHandle       6:#1185      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1185 = Methodref          #1186.#1187  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1186 = Class              #1188        // java/lang/invoke/StringConcatFactory
  #1187 = NameAndType        #165:#1189   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1188 = Utf8               java/lang/invoke/StringConcatFactory
  #1189 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1190 = Utf8               InnerClasses
  #1191 = Utf8               CastleFunction
  #1192 = Class              #1193        // java/lang/invoke/MethodHandles$Lookup
  #1193 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1194 = Class              #1195        // java/lang/invoke/MethodHandles
  #1195 = Utf8               java/lang/invoke/MethodHandles
  #1196 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.CastleChamberlain(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Merchant."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: aload_0
         7: bipush        6
         9: putfield      #7                  // Field _preHour:I
        12: return
      LineNumberTable:
        line 76: 0
        line 72: 6
        line 77: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/instance/CastleChamberlain;
            0      13     1 objectId   I
            0      13     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public ext.mods.gameserver.model.actor.ai.type.CastleManagerNpcAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI
         7: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/CastleChamberlain;

  public void setAI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #17                 // class ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI
         4: dup
         5: aload_0
         6: invokespecial #19                 // Method ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI."<init>":(Lext/mods/gameserver/model/actor/instance/CastleChamberlain;)V
         9: putfield      #13                 // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        12: return
      LineNumberTable:
        line 88: 0
        line 89: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/instance/CastleChamberlain;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=14, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #22                 // Method getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
         5: astore_3
         6: aload_3
         7: getstatic     #26                 // Field ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        10: if_acmpne     44
        13: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        16: dup
        17: aload_0
        18: invokevirtual #34                 // Method getObjectId:()I
        21: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        24: astore        4
        26: aload         4
        28: aload_1
        29: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        32: ldc           #47                 // String html/chamberlain/noprivs.htm
        34: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        37: aload_1
        38: aload         4
        40: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        43: return
        44: aload_3
        45: getstatic     #57                 // Field ext/mods/gameserver/enums/actors/NpcTalkCond.UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        48: if_acmpne     82
        51: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        54: dup
        55: aload_0
        56: invokevirtual #34                 // Method getObjectId:()I
        59: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        62: astore        4
        64: aload         4
        66: aload_1
        67: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        70: ldc           #60                 // String html/chamberlain/busy.htm
        72: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        75: aload_1
        76: aload         4
        78: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        81: return
        82: new           #62                 // class java/util/StringTokenizer
        85: dup
        86: aload_2
        87: ldc           #64                 // String
        89: invokespecial #66                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        92: astore        4
        94: aload         4
        96: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        99: astore        5
       101: aload         4
       103: invokevirtual #73                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       106: ifeq          117
       109: aload         4
       111: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       114: goto          119
       117: ldc           #77                 // String
       119: astore        6
       121: aload         5
       123: ldc           #79                 // String banish_foreigner
       125: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       128: ifeq          160
       131: aload_0
       132: aload_1
       133: getstatic     #87                 // Field ext/mods/gameserver/enums/PrivilegeType.CP_RIGHT_TO_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
       136: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
       139: ifne          143
       142: return
       143: aload_0
       144: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       147: invokevirtual #101                // Method ext/mods/gameserver/model/residence/castle/Castle.banishForeigners:()V
       150: aload_0
       151: aload_1
       152: ldc           #107                // String html/chamberlain/banishafter.htm
       154: invokevirtual #109                // Method sendFileMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       157: goto          7996
       160: aload         5
       162: ldc           #113                // String banish_foreigner_show
       164: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       167: ifeq          192
       170: aload_0
       171: aload_1
       172: getstatic     #87                 // Field ext/mods/gameserver/enums/PrivilegeType.CP_RIGHT_TO_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
       175: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
       178: ifne          182
       181: return
       182: aload_0
       183: aload_1
       184: ldc           #115                // String html/chamberlain/banishfore.htm
       186: invokevirtual #109                // Method sendFileMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       189: goto          7996
       192: aload         5
       194: ldc           #117                // String manage_functions
       196: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       199: ifeq          224
       202: aload_0
       203: aload_1
       204: getstatic     #119                // Field ext/mods/gameserver/enums/PrivilegeType.CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
       207: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
       210: ifne          214
       213: return
       214: aload_0
       215: aload_1
       216: ldc           #122                // String html/chamberlain/chamberlain-manage.htm
       218: invokevirtual #109                // Method sendFileMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       221: goto          7996
       224: aload         5
       226: ldc           #124                // String functions
       228: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       231: ifeq          635
       234: aload_0
       235: aload_1
       236: getstatic     #126                // Field ext/mods/gameserver/enums/PrivilegeType.CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
       239: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
       242: ifne          246
       245: return
       246: aload         6
       248: ldc           #129                // String tele
       250: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       253: ifeq          339
       256: aload_0
       257: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       260: iconst_1
       261: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       264: astore        7
       266: aload         7
       268: ifnonnull     313
       271: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       274: dup
       275: aload_0
       276: invokevirtual #34                 // Method getObjectId:()I
       279: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       282: astore        8
       284: aload         8
       286: aload_1
       287: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       290: ldc           #135                // String html/chamberlain/chamberlain-nac.htm
       292: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       295: aload         8
       297: ldc           #137                // String %objectId%
       299: aload_0
       300: invokevirtual #34                 // Method getObjectId:()I
       303: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       306: aload_1
       307: aload         8
       309: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       312: return
       313: aload_0
       314: aload_1
       315: aload         7
       317: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
       320: iconst_2
       321: if_icmpne     330
       324: getstatic     #148                // Field ext/mods/gameserver/enums/TeleportType.CHF_LEVEL_2:Lext/mods/gameserver/enums/TeleportType;
       327: goto          333
       330: getstatic     #154                // Field ext/mods/gameserver/enums/TeleportType.CHF_LEVEL_1:Lext/mods/gameserver/enums/TeleportType;
       333: invokevirtual #157                // Method showTeleportWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
       336: goto          7996
       339: aload         6
       341: ldc           #161                // String support
       343: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       346: ifeq          445
       349: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       352: dup
       353: aload_0
       354: invokevirtual #34                 // Method getObjectId:()I
       357: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       360: astore        7
       362: aload_0
       363: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       366: iconst_5
       367: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       370: astore        8
       372: aload         8
       374: ifnonnull     391
       377: aload         7
       379: aload_1
       380: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       383: ldc           #135                // String html/chamberlain/chamberlain-nac.htm
       385: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       388: goto          425
       391: aload         7
       393: aload_1
       394: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       397: aload         8
       399: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
       402: invokedynamic #163,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       407: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       410: aload         7
       412: ldc           #167                // String %mp%
       414: aload_0
       415: invokevirtual #169                // Method getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       418: invokevirtual #173                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
       421: d2i
       422: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       425: aload         7
       427: ldc           #137                // String %objectId%
       429: aload_0
       430: invokevirtual #34                 // Method getObjectId:()I
       433: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       436: aload_1
       437: aload         7
       439: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       442: goto          7996
       445: aload         6
       447: ldc           #179                // String back
       449: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       452: ifeq          463
       455: aload_0
       456: aload_1
       457: invokevirtual #181                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
       460: goto          7996
       463: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       466: dup
       467: aload_0
       468: invokevirtual #34                 // Method getObjectId:()I
       471: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       474: astore        7
       476: aload         7
       478: aload_1
       479: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       482: ldc           #185                // String html/chamberlain/chamberlain-functions.htm
       484: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       487: aload_0
       488: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       491: iconst_4
       492: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       495: astore        8
       497: aload         8
       499: ifnull        517
       502: aload         7
       504: ldc           #187                // String %xp_regen%
       506: aload         8
       508: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
       511: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       514: goto          526
       517: aload         7
       519: ldc           #187                // String %xp_regen%
       521: ldc           #189                // String 0
       523: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       526: aload_0
       527: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       530: iconst_2
       531: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       534: astore        9
       536: aload         9
       538: ifnull        556
       541: aload         7
       543: ldc           #193                // String %hp_regen%
       545: aload         9
       547: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
       550: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       553: goto          565
       556: aload         7
       558: ldc           #193                // String %hp_regen%
       560: ldc           #189                // String 0
       562: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       565: aload_0
       566: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       569: iconst_3
       570: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       573: astore        10
       575: aload         10
       577: ifnull        595
       580: aload         7
       582: ldc           #195                // String %mp_regen%
       584: aload         10
       586: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
       589: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       592: goto          604
       595: aload         7
       597: ldc           #195                // String %mp_regen%
       599: ldc           #189                // String 0
       601: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       604: aload         7
       606: ldc           #197                // String %npcId%
       608: aload_0
       609: invokevirtual #199                // Method getNpcId:()I
       612: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       615: aload         7
       617: ldc           #137                // String %objectId%
       619: aload_0
       620: invokevirtual #34                 // Method getObjectId:()I
       623: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       626: aload_1
       627: aload         7
       629: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       632: goto          7996
       635: aload         5
       637: ldc           #202                // String manage
       639: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       642: ifeq          4176
       645: aload_0
       646: aload_1
       647: getstatic     #119                // Field ext/mods/gameserver/enums/PrivilegeType.CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
       650: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
       653: ifne          657
       656: return
       657: aload         6
       659: ldc           #204                // String recovery
       661: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       664: ifeq          2779
       667: aload         4
       669: invokevirtual #73                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       672: ifeq          2326
       675: aload_0
       676: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       679: invokevirtual #206                // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
       682: ifne          686
       685: return
       686: aload         4
       688: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       691: astore        6
       693: aload         6
       695: ldc           #209                // String hp_cancel
       697: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       700: ifeq          756
       703: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       706: dup
       707: aload_0
       708: invokevirtual #34                 // Method getObjectId:()I
       711: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       714: astore        7
       716: aload         7
       718: aload_1
       719: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       722: ldc           #211                // String html/chamberlain/functions-cancel.htm
       724: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       727: aload         7
       729: ldc           #213                // String %apply%
       731: ldc           #215                // String recovery hp 0
       733: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       736: aload         7
       738: ldc           #137                // String %objectId%
       740: aload_0
       741: invokevirtual #34                 // Method getObjectId:()I
       744: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       747: aload_1
       748: aload         7
       750: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       753: goto          7996
       756: aload         6
       758: ldc           #217                // String mp_cancel
       760: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       763: ifeq          819
       766: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       769: dup
       770: aload_0
       771: invokevirtual #34                 // Method getObjectId:()I
       774: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       777: astore        7
       779: aload         7
       781: aload_1
       782: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       785: ldc           #211                // String html/chamberlain/functions-cancel.htm
       787: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       790: aload         7
       792: ldc           #213                // String %apply%
       794: ldc           #219                // String recovery mp 0
       796: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       799: aload         7
       801: ldc           #137                // String %objectId%
       803: aload_0
       804: invokevirtual #34                 // Method getObjectId:()I
       807: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       810: aload_1
       811: aload         7
       813: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       816: goto          7996
       819: aload         6
       821: ldc           #221                // String exp_cancel
       823: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       826: ifeq          882
       829: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       832: dup
       833: aload_0
       834: invokevirtual #34                 // Method getObjectId:()I
       837: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       840: astore        7
       842: aload         7
       844: aload_1
       845: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       848: ldc           #211                // String html/chamberlain/functions-cancel.htm
       850: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       853: aload         7
       855: ldc           #213                // String %apply%
       857: ldc           #223                // String recovery exp 0
       859: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       862: aload         7
       864: ldc           #137                // String %objectId%
       866: aload_0
       867: invokevirtual #34                 // Method getObjectId:()I
       870: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       873: aload_1
       874: aload         7
       876: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       879: goto          7996
       882: aload         6
       884: ldc           #225                // String edit_hp
       886: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       889: ifeq          1088
       892: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       895: dup
       896: aload_0
       897: invokevirtual #34                 // Method getObjectId:()I
       900: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       903: astore        7
       905: aload         7
       907: aload_1
       908: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       911: ldc           #227                // String html/chamberlain/functions-apply.htm
       913: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       916: aload         7
       918: ldc           #229                // String %name%
       920: ldc           #231                // String Fireplace (HP Recovery Device)
       922: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       925: aload         4
       927: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       930: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       933: istore        8
       935: iload         8
       937: lookupswitch  { // 4

                      80: 980

                     120: 988

                     180: 996

                     240: 1004
                 default: 1012
            }
       980: getstatic     #239                // Field ext/mods/Config.CS_HPREG1_FEE:I
       983: istore        9
       985: goto          1017
       988: getstatic     #244                // Field ext/mods/Config.CS_HPREG2_FEE:I
       991: istore        9
       993: goto          1017
       996: getstatic     #247                // Field ext/mods/Config.CS_HPREG3_FEE:I
       999: istore        9
      1001: goto          1017
      1004: getstatic     #250                // Field ext/mods/Config.CS_HPREG4_FEE:I
      1007: istore        9
      1009: goto          1017
      1012: getstatic     #253                // Field ext/mods/Config.CS_HPREG5_FEE:I
      1015: istore        9
      1017: aload         7
      1019: ldc_w         #256                // String %cost%
      1022: iload         9
      1024: getstatic     #258                // Field ext/mods/Config.CS_HPREG_FEE_RATIO:J
      1027: ldc2_w        #262                // long 86400000l
      1030: ldiv
      1031: invokedynamic #264,  0            // InvokeDynamic #1:makeConcatWithConstants:(IJ)Ljava/lang/String;
      1036: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1039: aload         7
      1041: ldc_w         #267                // String %use%
      1044: iload         8
      1046: invokedynamic #269,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
      1051: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1054: aload         7
      1056: ldc           #213                // String %apply%
      1058: iload         8
      1060: invokedynamic #270,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
      1065: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1068: aload         7
      1070: ldc           #137                // String %objectId%
      1072: aload_0
      1073: invokevirtual #34                 // Method getObjectId:()I
      1076: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1079: aload_1
      1080: aload         7
      1082: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1085: goto          7996
      1088: aload         6
      1090: ldc_w         #271                // String edit_mp
      1093: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1096: ifeq          1280
      1099: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1102: dup
      1103: aload_0
      1104: invokevirtual #34                 // Method getObjectId:()I
      1107: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1110: astore        7
      1112: aload         7
      1114: aload_1
      1115: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1118: ldc           #227                // String html/chamberlain/functions-apply.htm
      1120: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1123: aload         7
      1125: ldc           #229                // String %name%
      1127: ldc_w         #273                // String Carpet (MP Recovery)
      1130: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1133: aload         4
      1135: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1138: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1141: istore        8
      1143: iload         8
      1145: lookupswitch  { // 3

                       5: 1180

                      15: 1188

                      30: 1196
                 default: 1204
            }
      1180: getstatic     #275                // Field ext/mods/Config.CS_MPREG1_FEE:I
      1183: istore        9
      1185: goto          1209
      1188: getstatic     #278                // Field ext/mods/Config.CS_MPREG2_FEE:I
      1191: istore        9
      1193: goto          1209
      1196: getstatic     #281                // Field ext/mods/Config.CS_MPREG3_FEE:I
      1199: istore        9
      1201: goto          1209
      1204: getstatic     #284                // Field ext/mods/Config.CS_MPREG4_FEE:I
      1207: istore        9
      1209: aload         7
      1211: ldc_w         #256                // String %cost%
      1214: iload         9
      1216: getstatic     #287                // Field ext/mods/Config.CS_MPREG_FEE_RATIO:J
      1219: ldc2_w        #262                // long 86400000l
      1222: ldiv
      1223: invokedynamic #264,  0            // InvokeDynamic #1:makeConcatWithConstants:(IJ)Ljava/lang/String;
      1228: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1231: aload         7
      1233: ldc_w         #267                // String %use%
      1236: iload         8
      1238: invokedynamic #290,  0            // InvokeDynamic #4:makeConcatWithConstants:(I)Ljava/lang/String;
      1243: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1246: aload         7
      1248: ldc           #213                // String %apply%
      1250: iload         8
      1252: invokedynamic #291,  0            // InvokeDynamic #5:makeConcatWithConstants:(I)Ljava/lang/String;
      1257: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1260: aload         7
      1262: ldc           #137                // String %objectId%
      1264: aload_0
      1265: invokevirtual #34                 // Method getObjectId:()I
      1268: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1271: aload_1
      1272: aload         7
      1274: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1277: goto          7996
      1280: aload         6
      1282: ldc_w         #292                // String edit_exp
      1285: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1288: ifeq          1472
      1291: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1294: dup
      1295: aload_0
      1296: invokevirtual #34                 // Method getObjectId:()I
      1299: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1302: astore        7
      1304: aload         7
      1306: aload_1
      1307: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1310: ldc           #227                // String html/chamberlain/functions-apply.htm
      1312: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1315: aload         7
      1317: ldc           #229                // String %name%
      1319: ldc_w         #294                // String Chandelier (EXP Recovery Device)
      1322: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1325: aload         4
      1327: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1330: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1333: istore        8
      1335: iload         8
      1337: lookupswitch  { // 3

                      15: 1372

                      25: 1380

                      35: 1388
                 default: 1396
            }
      1372: getstatic     #296                // Field ext/mods/Config.CS_EXPREG1_FEE:I
      1375: istore        9
      1377: goto          1401
      1380: getstatic     #299                // Field ext/mods/Config.CS_EXPREG2_FEE:I
      1383: istore        9
      1385: goto          1401
      1388: getstatic     #302                // Field ext/mods/Config.CS_EXPREG3_FEE:I
      1391: istore        9
      1393: goto          1401
      1396: getstatic     #305                // Field ext/mods/Config.CS_EXPREG4_FEE:I
      1399: istore        9
      1401: aload         7
      1403: ldc_w         #256                // String %cost%
      1406: iload         9
      1408: getstatic     #308                // Field ext/mods/Config.CS_EXPREG_FEE_RATIO:J
      1411: ldc2_w        #262                // long 86400000l
      1414: ldiv
      1415: invokedynamic #264,  0            // InvokeDynamic #1:makeConcatWithConstants:(IJ)Ljava/lang/String;
      1420: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1423: aload         7
      1425: ldc_w         #267                // String %use%
      1428: iload         8
      1430: invokedynamic #311,  0            // InvokeDynamic #6:makeConcatWithConstants:(I)Ljava/lang/String;
      1435: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1438: aload         7
      1440: ldc           #213                // String %apply%
      1442: iload         8
      1444: invokedynamic #312,  0            // InvokeDynamic #7:makeConcatWithConstants:(I)Ljava/lang/String;
      1449: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1452: aload         7
      1454: ldc           #137                // String %objectId%
      1456: aload_0
      1457: invokevirtual #34                 // Method getObjectId:()I
      1460: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1463: aload_1
      1464: aload         7
      1466: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1469: goto          7996
      1472: aload         6
      1474: ldc_w         #313                // String hp
      1477: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1480: ifeq          1766
      1483: aload         4
      1485: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1488: astore        6
      1490: aload         6
      1492: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1495: istore        7
      1497: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1500: dup
      1501: aload_0
      1502: invokevirtual #34                 // Method getObjectId:()I
      1505: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1508: astore        8
      1510: aload_0
      1511: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      1514: iconst_2
      1515: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      1518: astore        9
      1520: aload         9
      1522: ifnull        1580
      1525: aload         9
      1527: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      1530: iload         7
      1532: if_icmpne     1580
      1535: aload         8
      1537: aload_1
      1538: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1541: ldc_w         #315                // String html/chamberlain/functions-used.htm
      1544: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1547: aload         8
      1549: ldc_w         #317                // String %val%
      1552: aload         6
      1554: invokedynamic #319,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1559: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1562: aload         8
      1564: ldc           #137                // String %objectId%
      1566: aload_0
      1567: invokevirtual #34                 // Method getObjectId:()I
      1570: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1573: aload_1
      1574: aload         8
      1576: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1579: return
      1580: aload         8
      1582: aload_1
      1583: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1586: ldc_w         #322                // String html/chamberlain/functions-apply_confirmed.htm
      1589: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1592: iload         7
      1594: lookupswitch  { // 5

                       0: 1644

                      80: 1662

                     120: 1670

                     180: 1678

                     240: 1686
                 default: 1694
            }
      1644: iconst_0
      1645: istore        10
      1647: aload         8
      1649: aload_1
      1650: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1653: ldc_w         #324                // String html/chamberlain/functions-cancel_confirmed.htm
      1656: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1659: goto          1699
      1662: getstatic     #239                // Field ext/mods/Config.CS_HPREG1_FEE:I
      1665: istore        10
      1667: goto          1699
      1670: getstatic     #244                // Field ext/mods/Config.CS_HPREG2_FEE:I
      1673: istore        10
      1675: goto          1699
      1678: getstatic     #247                // Field ext/mods/Config.CS_HPREG3_FEE:I
      1681: istore        10
      1683: goto          1699
      1686: getstatic     #250                // Field ext/mods/Config.CS_HPREG4_FEE:I
      1689: istore        10
      1691: goto          1699
      1694: getstatic     #253                // Field ext/mods/Config.CS_HPREG5_FEE:I
      1697: istore        10
      1699: aload_0
      1700: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      1703: aload_1
      1704: iconst_2
      1705: iload         7
      1707: iload         10
      1709: getstatic     #258                // Field ext/mods/Config.CS_HPREG_FEE_RATIO:J
      1712: aload_0
      1713: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      1716: iconst_2
      1717: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      1720: ifnonnull     1727
      1723: iconst_1
      1724: goto          1728
      1727: iconst_0
      1728: invokevirtual #326                // Method ext/mods/gameserver/model/residence/castle/Castle.updateFunctions:(Lext/mods/gameserver/model/actor/Player;IIIJZ)Z
      1731: ifne          1746
      1734: aload         8
      1736: aload_1
      1737: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1740: ldc_w         #330                // String html/chamberlain/low_adena.htm
      1743: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1746: aload         8
      1748: ldc           #137                // String %objectId%
      1750: aload_0
      1751: invokevirtual #34                 // Method getObjectId:()I
      1754: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1757: aload_1
      1758: aload         8
      1760: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1763: goto          7996
      1766: aload         6
      1768: ldc_w         #332                // String mp
      1771: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1774: ifeq          2046
      1777: aload         4
      1779: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1782: astore        6
      1784: aload         6
      1786: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1789: istore        7
      1791: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1794: dup
      1795: aload_0
      1796: invokevirtual #34                 // Method getObjectId:()I
      1799: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1802: astore        8
      1804: aload_0
      1805: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      1808: iconst_3
      1809: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      1812: astore        9
      1814: aload         9
      1816: ifnull        1874
      1819: aload         9
      1821: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      1824: iload         7
      1826: if_icmpne     1874
      1829: aload         8
      1831: aload_1
      1832: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1835: ldc_w         #315                // String html/chamberlain/functions-used.htm
      1838: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1841: aload         8
      1843: ldc_w         #317                // String %val%
      1846: aload         6
      1848: invokedynamic #319,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1853: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1856: aload         8
      1858: ldc           #137                // String %objectId%
      1860: aload_0
      1861: invokevirtual #34                 // Method getObjectId:()I
      1864: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1867: aload_1
      1868: aload         8
      1870: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1873: return
      1874: aload         8
      1876: aload_1
      1877: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1880: ldc_w         #322                // String html/chamberlain/functions-apply_confirmed.htm
      1883: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1886: iload         7
      1888: lookupswitch  { // 4

                       0: 1932

                       5: 1950

                      15: 1958

                      30: 1966
                 default: 1974
            }
      1932: iconst_0
      1933: istore        10
      1935: aload         8
      1937: aload_1
      1938: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1941: ldc_w         #324                // String html/chamberlain/functions-cancel_confirmed.htm
      1944: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1947: goto          1979
      1950: getstatic     #275                // Field ext/mods/Config.CS_MPREG1_FEE:I
      1953: istore        10
      1955: goto          1979
      1958: getstatic     #278                // Field ext/mods/Config.CS_MPREG2_FEE:I
      1961: istore        10
      1963: goto          1979
      1966: getstatic     #281                // Field ext/mods/Config.CS_MPREG3_FEE:I
      1969: istore        10
      1971: goto          1979
      1974: getstatic     #284                // Field ext/mods/Config.CS_MPREG4_FEE:I
      1977: istore        10
      1979: aload_0
      1980: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      1983: aload_1
      1984: iconst_3
      1985: iload         7
      1987: iload         10
      1989: getstatic     #287                // Field ext/mods/Config.CS_MPREG_FEE_RATIO:J
      1992: aload_0
      1993: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      1996: iconst_3
      1997: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      2000: ifnonnull     2007
      2003: iconst_1
      2004: goto          2008
      2007: iconst_0
      2008: invokevirtual #326                // Method ext/mods/gameserver/model/residence/castle/Castle.updateFunctions:(Lext/mods/gameserver/model/actor/Player;IIIJZ)Z
      2011: ifne          2026
      2014: aload         8
      2016: aload_1
      2017: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2020: ldc_w         #330                // String html/chamberlain/low_adena.htm
      2023: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2026: aload         8
      2028: ldc           #137                // String %objectId%
      2030: aload_0
      2031: invokevirtual #34                 // Method getObjectId:()I
      2034: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2037: aload_1
      2038: aload         8
      2040: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2043: goto          7996
      2046: aload         6
      2048: ldc_w         #334                // String exp
      2051: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      2054: ifeq          7996
      2057: aload         4
      2059: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      2062: astore        6
      2064: aload         6
      2066: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      2069: istore        7
      2071: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      2074: dup
      2075: aload_0
      2076: invokevirtual #34                 // Method getObjectId:()I
      2079: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      2082: astore        8
      2084: aload_0
      2085: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      2088: iconst_4
      2089: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      2092: astore        9
      2094: aload         9
      2096: ifnull        2154
      2099: aload         9
      2101: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      2104: iload         7
      2106: if_icmpne     2154
      2109: aload         8
      2111: aload_1
      2112: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2115: ldc_w         #315                // String html/chamberlain/functions-used.htm
      2118: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2121: aload         8
      2123: ldc_w         #317                // String %val%
      2126: aload         6
      2128: invokedynamic #319,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2133: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2136: aload         8
      2138: ldc           #137                // String %objectId%
      2140: aload_0
      2141: invokevirtual #34                 // Method getObjectId:()I
      2144: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2147: aload_1
      2148: aload         8
      2150: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2153: return
      2154: aload         8
      2156: aload_1
      2157: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2160: ldc_w         #322                // String html/chamberlain/functions-apply_confirmed.htm
      2163: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2166: iload         7
      2168: lookupswitch  { // 4

                       0: 2212

                      15: 2230

                      25: 2238

                      35: 2246
                 default: 2254
            }
      2212: iconst_0
      2213: istore        10
      2215: aload         8
      2217: aload_1
      2218: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2221: ldc_w         #324                // String html/chamberlain/functions-cancel_confirmed.htm
      2224: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2227: goto          2259
      2230: getstatic     #296                // Field ext/mods/Config.CS_EXPREG1_FEE:I
      2233: istore        10
      2235: goto          2259
      2238: getstatic     #299                // Field ext/mods/Config.CS_EXPREG2_FEE:I
      2241: istore        10
      2243: goto          2259
      2246: getstatic     #302                // Field ext/mods/Config.CS_EXPREG3_FEE:I
      2249: istore        10
      2251: goto          2259
      2254: getstatic     #305                // Field ext/mods/Config.CS_EXPREG4_FEE:I
      2257: istore        10
      2259: aload_0
      2260: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      2263: aload_1
      2264: iconst_4
      2265: iload         7
      2267: iload         10
      2269: getstatic     #308                // Field ext/mods/Config.CS_EXPREG_FEE_RATIO:J
      2272: aload_0
      2273: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      2276: iconst_4
      2277: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      2280: ifnonnull     2287
      2283: iconst_1
      2284: goto          2288
      2287: iconst_0
      2288: invokevirtual #326                // Method ext/mods/gameserver/model/residence/castle/Castle.updateFunctions:(Lext/mods/gameserver/model/actor/Player;IIIJZ)Z
      2291: ifne          2306
      2294: aload         8
      2296: aload_1
      2297: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2300: ldc_w         #330                // String html/chamberlain/low_adena.htm
      2303: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2306: aload         8
      2308: ldc           #137                // String %objectId%
      2310: aload_0
      2311: invokevirtual #34                 // Method getObjectId:()I
      2314: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2317: aload_1
      2318: aload         8
      2320: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2323: goto          7996
      2326: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      2329: dup
      2330: aload_0
      2331: invokevirtual #34                 // Method getObjectId:()I
      2334: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      2337: astore        7
      2339: aload         7
      2341: aload_1
      2342: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2345: ldc_w         #336                // String html/chamberlain/edit_recovery.htm
      2348: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2351: ldc_w         #338                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 80\">80%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 120\">120%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 180\">180%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 240\">240%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 300\">300%</a>]
      2354: astore        8
      2356: ldc_w         #340                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 15\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 25\">25%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 35\">35%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 50\">50%</a>]
      2359: astore        9
      2361: ldc_w         #342                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 5\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 15\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 30\">30%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 40\">40%</a>]
      2364: astore        10
      2366: aload_0
      2367: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      2370: iconst_2
      2371: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      2374: astore        11
      2376: aload         11
      2378: ifnull        2463
      2381: aload         7
      2383: ldc_w         #344                // String %hp_recovery%
      2386: aload         11
      2388: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      2391: aload         11
      2393: invokevirtual #346                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLease:()I
      2396: getstatic     #258                // Field ext/mods/Config.CS_HPREG_FEE_RATIO:J
      2399: ldc2_w        #262                // long 86400000l
      2402: ldiv
      2403: invokedynamic #349,  0            // InvokeDynamic #9:makeConcatWithConstants:(IIJ)Ljava/lang/String;
      2408: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2411: aload         7
      2413: ldc_w         #352                // String %hp_period%
      2416: new           #354                // class java/text/SimpleDateFormat
      2419: dup
      2420: ldc_w         #356                // String dd-MM-yyyy HH:mm
      2423: invokespecial #358                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      2426: aload         11
      2428: invokevirtual #361                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getEndTime:()J
      2431: invokestatic  #365                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      2434: invokevirtual #371                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      2437: invokedynamic #375,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2442: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2445: aload         7
      2447: ldc_w         #376                // String %change_hp%
      2450: aload         8
      2452: invokedynamic #378,  0            // InvokeDynamic #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2457: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2460: goto          2495
      2463: aload         7
      2465: ldc_w         #344                // String %hp_recovery%
      2468: ldc_w         #379                // String none
      2471: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2474: aload         7
      2476: ldc_w         #352                // String %hp_period%
      2479: ldc_w         #379                // String none
      2482: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2485: aload         7
      2487: ldc_w         #376                // String %change_hp%
      2490: aload         8
      2492: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2495: aload_0
      2496: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      2499: iconst_4
      2500: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      2503: astore        12
      2505: aload         12
      2507: ifnull        2592
      2510: aload         7
      2512: ldc_w         #381                // String %exp_recovery%
      2515: aload         12
      2517: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      2520: aload         12
      2522: invokevirtual #346                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLease:()I
      2525: getstatic     #308                // Field ext/mods/Config.CS_EXPREG_FEE_RATIO:J
      2528: ldc2_w        #262                // long 86400000l
      2531: ldiv
      2532: invokedynamic #383,  0            // InvokeDynamic #12:makeConcatWithConstants:(IIJ)Ljava/lang/String;
      2537: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2540: aload         7
      2542: ldc_w         #384                // String %exp_period%
      2545: new           #354                // class java/text/SimpleDateFormat
      2548: dup
      2549: ldc_w         #356                // String dd-MM-yyyy HH:mm
      2552: invokespecial #358                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      2555: aload         12
      2557: invokevirtual #361                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getEndTime:()J
      2560: invokestatic  #365                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      2563: invokevirtual #371                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      2566: invokedynamic #375,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2571: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2574: aload         7
      2576: ldc_w         #386                // String %change_exp%
      2579: aload         9
      2581: invokedynamic #388,  0            // InvokeDynamic #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2586: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2589: goto          2624
      2592: aload         7
      2594: ldc_w         #381                // String %exp_recovery%
      2597: ldc_w         #379                // String none
      2600: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2603: aload         7
      2605: ldc_w         #384                // String %exp_period%
      2608: ldc_w         #379                // String none
      2611: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2614: aload         7
      2616: ldc_w         #386                // String %change_exp%
      2619: aload         9
      2621: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2624: aload_0
      2625: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      2628: iconst_3
      2629: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      2632: astore        13
      2634: aload         13
      2636: ifnull        2727
      2639: aload         7
      2641: ldc_w         #389                // String %mp_recovery%
      2644: aload         13
      2646: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      2649: aload         13
      2651: invokevirtual #346                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLease:()I
      2654: getstatic     #287                // Field ext/mods/Config.CS_MPREG_FEE_RATIO:J
      2657: ldc2_w        #262                // long 86400000l
      2660: ldiv
      2661: invokedynamic #383,  0            // InvokeDynamic #12:makeConcatWithConstants:(IIJ)Ljava/lang/String;
      2666: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2669: aload         7
      2671: ldc_w         #391                // String %mp_period%
      2674: new           #354                // class java/text/SimpleDateFormat
      2677: dup
      2678: ldc_w         #356                // String dd-MM-yyyy HH:mm
      2681: invokespecial #358                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      2684: aload_0
      2685: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      2688: iconst_3
      2689: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      2692: invokevirtual #361                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getEndTime:()J
      2695: invokestatic  #365                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      2698: invokevirtual #371                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      2701: invokedynamic #375,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2706: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2709: aload         7
      2711: ldc_w         #393                // String %change_mp%
      2714: aload         10
      2716: invokedynamic #395,  0            // InvokeDynamic #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2721: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2724: goto          2759
      2727: aload         7
      2729: ldc_w         #389                // String %mp_recovery%
      2732: ldc_w         #379                // String none
      2735: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2738: aload         7
      2740: ldc_w         #391                // String %mp_period%
      2743: ldc_w         #379                // String none
      2746: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2749: aload         7
      2751: ldc_w         #393                // String %change_mp%
      2754: aload         10
      2756: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2759: aload         7
      2761: ldc           #137                // String %objectId%
      2763: aload_0
      2764: invokevirtual #34                 // Method getObjectId:()I
      2767: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2770: aload_1
      2771: aload         7
      2773: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2776: goto          7996
      2779: aload         6
      2781: ldc_w         #396                // String other
      2784: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      2787: ifeq          4113
      2790: aload         4
      2792: invokevirtual #73                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      2795: ifeq          3800
      2798: aload_0
      2799: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      2802: invokevirtual #206                // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
      2805: ifne          2809
      2808: return
      2809: aload         4
      2811: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      2814: astore        6
      2816: aload         6
      2818: ldc_w         #398                // String tele_cancel
      2821: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      2824: ifeq          2881
      2827: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      2830: dup
      2831: aload_0
      2832: invokevirtual #34                 // Method getObjectId:()I
      2835: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      2838: astore        7
      2840: aload         7
      2842: aload_1
      2843: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2846: ldc           #211                // String html/chamberlain/functions-cancel.htm
      2848: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2851: aload         7
      2853: ldc           #213                // String %apply%
      2855: ldc_w         #400                // String other tele 0
      2858: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2861: aload         7
      2863: ldc           #137                // String %objectId%
      2865: aload_0
      2866: invokevirtual #34                 // Method getObjectId:()I
      2869: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2872: aload_1
      2873: aload         7
      2875: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2878: goto          7996
      2881: aload         6
      2883: ldc_w         #402                // String support_cancel
      2886: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      2889: ifeq          2956
      2892: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      2895: dup
      2896: aload_0
      2897: invokevirtual #34                 // Method getObjectId:()I
      2900: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      2903: astore        7
      2905: aload         7
      2907: aload_1
      2908: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2911: ldc           #211                // String html/chamberlain/functions-cancel.htm
      2913: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2916: aload         7
      2918: ldc           #213                // String %apply%
      2920: ldc_w         #404                // String other support 0
      2923: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2926: aload         7
      2928: ldc           #213                // String %apply%
      2930: ldc_w         #400                // String other tele 0
      2933: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2936: aload         7
      2938: ldc           #137                // String %objectId%
      2940: aload_0
      2941: invokevirtual #34                 // Method getObjectId:()I
      2944: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2947: aload_1
      2948: aload         7
      2950: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2953: goto          7996
      2956: aload         6
      2958: ldc_w         #406                // String edit_support
      2961: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      2964: ifeq          3136
      2967: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      2970: dup
      2971: aload_0
      2972: invokevirtual #34                 // Method getObjectId:()I
      2975: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      2978: astore        7
      2980: aload         7
      2982: aload_1
      2983: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2986: ldc           #227                // String html/chamberlain/functions-apply.htm
      2988: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2991: aload         7
      2993: ldc           #229                // String %name%
      2995: ldc_w         #408                // String Insignia (Supplementary Magic)
      2998: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3001: aload         4
      3003: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      3006: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      3009: istore        8
      3011: iload         8
      3013: tableswitch   { // 1 to 3

                       1: 3040

                       2: 3048

                       3: 3056
                 default: 3064
            }
      3040: getstatic     #410                // Field ext/mods/Config.CS_SUPPORT1_FEE:I
      3043: istore        9
      3045: goto          3069
      3048: getstatic     #413                // Field ext/mods/Config.CS_SUPPORT2_FEE:I
      3051: istore        9
      3053: goto          3069
      3056: getstatic     #416                // Field ext/mods/Config.CS_SUPPORT3_FEE:I
      3059: istore        9
      3061: goto          3069
      3064: getstatic     #419                // Field ext/mods/Config.CS_SUPPORT4_FEE:I
      3067: istore        9
      3069: aload         7
      3071: ldc_w         #256                // String %cost%
      3074: iload         9
      3076: getstatic     #422                // Field ext/mods/Config.CS_SUPPORT_FEE_RATIO:J
      3079: ldc2_w        #262                // long 86400000l
      3082: ldiv
      3083: invokedynamic #264,  0            // InvokeDynamic #1:makeConcatWithConstants:(IJ)Ljava/lang/String;
      3088: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3091: aload         7
      3093: ldc_w         #267                // String %use%
      3096: ldc_w         #425                // String Enables the use of supplementary magic.
      3099: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3102: aload         7
      3104: ldc           #213                // String %apply%
      3106: iload         8
      3108: invokedynamic #427,  0            // InvokeDynamic #15:makeConcatWithConstants:(I)Ljava/lang/String;
      3113: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3116: aload         7
      3118: ldc           #137                // String %objectId%
      3120: aload_0
      3121: invokevirtual #34                 // Method getObjectId:()I
      3124: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      3127: aload_1
      3128: aload         7
      3130: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      3133: goto          7996
      3136: aload         6
      3138: ldc_w         #428                // String edit_tele
      3141: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      3144: ifeq          3296
      3147: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      3150: dup
      3151: aload_0
      3152: invokevirtual #34                 // Method getObjectId:()I
      3155: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      3158: astore        7
      3160: aload         7
      3162: aload_1
      3163: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3166: ldc           #227                // String html/chamberlain/functions-apply.htm
      3168: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3171: aload         7
      3173: ldc           #229                // String %name%
      3175: ldc_w         #430                // String Mirror (Teleportation Device)
      3178: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3181: aload         4
      3183: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      3186: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      3189: istore        8
      3191: iload         8
      3193: lookupswitch  { // 1

                       1: 3212
                 default: 3220
            }
      3212: getstatic     #432                // Field ext/mods/Config.CS_TELE1_FEE:I
      3215: istore        9
      3217: goto          3225
      3220: getstatic     #435                // Field ext/mods/Config.CS_TELE2_FEE:I
      3223: istore        9
      3225: aload         7
      3227: ldc_w         #256                // String %cost%
      3230: iload         9
      3232: getstatic     #438                // Field ext/mods/Config.CS_TELE_FEE_RATIO:J
      3235: ldc2_w        #262                // long 86400000l
      3238: ldiv
      3239: invokedynamic #264,  0            // InvokeDynamic #1:makeConcatWithConstants:(IJ)Ljava/lang/String;
      3244: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3247: aload         7
      3249: ldc_w         #267                // String %use%
      3252: iload         8
      3254: invokedynamic #441,  0            // InvokeDynamic #16:makeConcatWithConstants:(I)Ljava/lang/String;
      3259: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3262: aload         7
      3264: ldc           #213                // String %apply%
      3266: iload         8
      3268: invokedynamic #442,  0            // InvokeDynamic #17:makeConcatWithConstants:(I)Ljava/lang/String;
      3273: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3276: aload         7
      3278: ldc           #137                // String %objectId%
      3280: aload_0
      3281: invokevirtual #34                 // Method getObjectId:()I
      3284: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      3287: aload_1
      3288: aload         7
      3290: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      3293: goto          7996
      3296: aload         6
      3298: ldc           #129                // String tele
      3300: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      3303: ifeq          3542
      3306: aload         4
      3308: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      3311: astore        6
      3313: aload         6
      3315: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      3318: istore        7
      3320: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      3323: dup
      3324: aload_0
      3325: invokevirtual #34                 // Method getObjectId:()I
      3328: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      3331: astore        8
      3333: aload_0
      3334: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      3337: iconst_1
      3338: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      3341: astore        9
      3343: aload         9
      3345: ifnull        3403
      3348: aload         9
      3350: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      3353: iload         7
      3355: if_icmpne     3403
      3358: aload         8
      3360: aload_1
      3361: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3364: ldc_w         #315                // String html/chamberlain/functions-used.htm
      3367: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3370: aload         8
      3372: ldc_w         #317                // String %val%
      3375: aload         6
      3377: invokedynamic #443,  0            // InvokeDynamic #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      3382: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3385: aload         8
      3387: ldc           #137                // String %objectId%
      3389: aload_0
      3390: invokevirtual #34                 // Method getObjectId:()I
      3393: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      3396: aload_1
      3397: aload         8
      3399: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      3402: return
      3403: aload         8
      3405: aload_1
      3406: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3409: ldc_w         #322                // String html/chamberlain/functions-apply_confirmed.htm
      3412: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3415: iload         7
      3417: lookupswitch  { // 2

                       0: 3444

                       1: 3462
                 default: 3470
            }
      3444: iconst_0
      3445: istore        10
      3447: aload         8
      3449: aload_1
      3450: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3453: ldc_w         #324                // String html/chamberlain/functions-cancel_confirmed.htm
      3456: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3459: goto          3475
      3462: getstatic     #432                // Field ext/mods/Config.CS_TELE1_FEE:I
      3465: istore        10
      3467: goto          3475
      3470: getstatic     #435                // Field ext/mods/Config.CS_TELE2_FEE:I
      3473: istore        10
      3475: aload_0
      3476: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      3479: aload_1
      3480: iconst_1
      3481: iload         7
      3483: iload         10
      3485: getstatic     #438                // Field ext/mods/Config.CS_TELE_FEE_RATIO:J
      3488: aload_0
      3489: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      3492: iconst_1
      3493: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      3496: ifnonnull     3503
      3499: iconst_1
      3500: goto          3504
      3503: iconst_0
      3504: invokevirtual #326                // Method ext/mods/gameserver/model/residence/castle/Castle.updateFunctions:(Lext/mods/gameserver/model/actor/Player;IIIJZ)Z
      3507: ifne          3522
      3510: aload         8
      3512: aload_1
      3513: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3516: ldc_w         #330                // String html/chamberlain/low_adena.htm
      3519: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3522: aload         8
      3524: ldc           #137                // String %objectId%
      3526: aload_0
      3527: invokevirtual #34                 // Method getObjectId:()I
      3530: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      3533: aload_1
      3534: aload         8
      3536: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      3539: goto          7996
      3542: aload         6
      3544: ldc           #161                // String support
      3546: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      3549: ifeq          7996
      3552: aload         4
      3554: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      3557: astore        6
      3559: aload         6
      3561: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      3564: istore        7
      3566: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      3569: dup
      3570: aload_0
      3571: invokevirtual #34                 // Method getObjectId:()I
      3574: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      3577: astore        8
      3579: aload_0
      3580: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      3583: iconst_5
      3584: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      3587: astore        9
      3589: aload         9
      3591: ifnull        3649
      3594: aload         9
      3596: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      3599: iload         7
      3601: if_icmpne     3649
      3604: aload         8
      3606: aload_1
      3607: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3610: ldc_w         #315                // String html/chamberlain/functions-used.htm
      3613: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3616: aload         8
      3618: ldc_w         #317                // String %val%
      3621: aload         6
      3623: invokedynamic #443,  0            // InvokeDynamic #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      3628: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3631: aload         8
      3633: ldc           #137                // String %objectId%
      3635: aload_0
      3636: invokevirtual #34                 // Method getObjectId:()I
      3639: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      3642: aload_1
      3643: aload         8
      3645: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      3648: return
      3649: aload         8
      3651: aload_1
      3652: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3655: ldc_w         #322                // String html/chamberlain/functions-apply_confirmed.htm
      3658: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3661: iload         7
      3663: tableswitch   { // 0 to 3

                       0: 3692

                       1: 3710

                       2: 3718

                       3: 3726
                 default: 3734
            }
      3692: iconst_0
      3693: istore        10
      3695: aload         8
      3697: aload_1
      3698: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3701: ldc_w         #324                // String html/chamberlain/functions-cancel_confirmed.htm
      3704: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3707: goto          3739
      3710: getstatic     #410                // Field ext/mods/Config.CS_SUPPORT1_FEE:I
      3713: istore        10
      3715: goto          3739
      3718: getstatic     #413                // Field ext/mods/Config.CS_SUPPORT2_FEE:I
      3721: istore        10
      3723: goto          3739
      3726: getstatic     #416                // Field ext/mods/Config.CS_SUPPORT3_FEE:I
      3729: istore        10
      3731: goto          3739
      3734: getstatic     #419                // Field ext/mods/Config.CS_SUPPORT4_FEE:I
      3737: istore        10
      3739: aload_0
      3740: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      3743: aload_1
      3744: iconst_5
      3745: iload         7
      3747: iload         10
      3749: getstatic     #422                // Field ext/mods/Config.CS_SUPPORT_FEE_RATIO:J
      3752: aload         9
      3754: ifnonnull     3761
      3757: iconst_1
      3758: goto          3762
      3761: iconst_0
      3762: invokevirtual #326                // Method ext/mods/gameserver/model/residence/castle/Castle.updateFunctions:(Lext/mods/gameserver/model/actor/Player;IIIJZ)Z
      3765: ifne          3780
      3768: aload         8
      3770: aload_1
      3771: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3774: ldc_w         #330                // String html/chamberlain/low_adena.htm
      3777: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3780: aload         8
      3782: ldc           #137                // String %objectId%
      3784: aload_0
      3785: invokevirtual #34                 // Method getObjectId:()I
      3788: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      3791: aload_1
      3792: aload         8
      3794: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      3797: goto          7996
      3800: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      3803: dup
      3804: aload_0
      3805: invokevirtual #34                 // Method getObjectId:()I
      3808: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      3811: astore        7
      3813: aload         7
      3815: aload_1
      3816: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3819: ldc_w         #444                // String html/chamberlain/edit_other.htm
      3822: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3825: ldc_w         #446                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_tele 1\">Level 1</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_tele 2\">Level 2</a>]
      3828: astore        8
      3830: ldc_w         #448                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_support 1\">Level 1</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 2\">Level 2</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 3\">Level 3</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 4\">Level 4</a>]
      3833: astore        9
      3835: aload_0
      3836: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      3839: iconst_1
      3840: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      3843: astore        10
      3845: aload         10
      3847: ifnull        3932
      3850: aload         7
      3852: ldc_w         #450                // String %tele%
      3855: aload         10
      3857: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      3860: aload         10
      3862: invokevirtual #346                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLease:()I
      3865: getstatic     #438                // Field ext/mods/Config.CS_TELE_FEE_RATIO:J
      3868: ldc2_w        #262                // long 86400000l
      3871: ldiv
      3872: invokedynamic #452,  0            // InvokeDynamic #19:makeConcatWithConstants:(IIJ)Ljava/lang/String;
      3877: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3880: aload         7
      3882: ldc_w         #453                // String %tele_period%
      3885: new           #354                // class java/text/SimpleDateFormat
      3888: dup
      3889: ldc_w         #356                // String dd-MM-yyyy HH:mm
      3892: invokespecial #358                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      3895: aload         10
      3897: invokevirtual #361                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getEndTime:()J
      3900: invokestatic  #365                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      3903: invokevirtual #371                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      3906: invokedynamic #375,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      3911: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3914: aload         7
      3916: ldc_w         #455                // String %change_tele%
      3919: aload         8
      3921: invokedynamic #457,  0            // InvokeDynamic #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      3926: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3929: goto          3964
      3932: aload         7
      3934: ldc_w         #450                // String %tele%
      3937: ldc_w         #379                // String none
      3940: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3943: aload         7
      3945: ldc_w         #453                // String %tele_period%
      3948: ldc_w         #379                // String none
      3951: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3954: aload         7
      3956: ldc_w         #455                // String %change_tele%
      3959: aload         8
      3961: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3964: aload_0
      3965: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      3968: iconst_5
      3969: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      3972: astore        11
      3974: aload         11
      3976: ifnull        4061
      3979: aload         7
      3981: ldc_w         #458                // String %support%
      3984: aload         11
      3986: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      3989: aload         11
      3991: invokevirtual #346                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLease:()I
      3994: getstatic     #422                // Field ext/mods/Config.CS_SUPPORT_FEE_RATIO:J
      3997: ldc2_w        #262                // long 86400000l
      4000: ldiv
      4001: invokedynamic #460,  0            // InvokeDynamic #21:makeConcatWithConstants:(IIJ)Ljava/lang/String;
      4006: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4009: aload         7
      4011: ldc_w         #461                // String %support_period%
      4014: new           #354                // class java/text/SimpleDateFormat
      4017: dup
      4018: ldc_w         #356                // String dd-MM-yyyy HH:mm
      4021: invokespecial #358                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      4024: aload         11
      4026: invokevirtual #361                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getEndTime:()J
      4029: invokestatic  #365                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      4032: invokevirtual #371                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      4035: invokedynamic #375,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      4040: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4043: aload         7
      4045: ldc_w         #463                // String %change_support%
      4048: aload         9
      4050: invokedynamic #465,  0            // InvokeDynamic #22:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      4055: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4058: goto          4093
      4061: aload         7
      4063: ldc_w         #458                // String %support%
      4066: ldc_w         #379                // String none
      4069: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4072: aload         7
      4074: ldc_w         #461                // String %support_period%
      4077: ldc_w         #379                // String none
      4080: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4083: aload         7
      4085: ldc_w         #463                // String %change_support%
      4088: aload         9
      4090: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4093: aload         7
      4095: ldc           #137                // String %objectId%
      4097: aload_0
      4098: invokevirtual #34                 // Method getObjectId:()I
      4101: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4104: aload_1
      4105: aload         7
      4107: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4110: goto          7996
      4113: aload         6
      4115: ldc           #179                // String back
      4117: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      4120: ifeq          4131
      4123: aload_0
      4124: aload_1
      4125: invokevirtual #181                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
      4128: goto          7996
      4131: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      4134: dup
      4135: aload_0
      4136: invokevirtual #34                 // Method getObjectId:()I
      4139: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      4142: astore        7
      4144: aload         7
      4146: aload_1
      4147: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4150: ldc_w         #466                // String html/chamberlain/manage.htm
      4153: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4156: aload         7
      4158: ldc           #137                // String %objectId%
      4160: aload_0
      4161: invokevirtual #34                 // Method getObjectId:()I
      4164: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4167: aload_1
      4168: aload         7
      4170: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4173: goto          7996
      4176: aload         5
      4178: ldc           #161                // String support
      4180: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      4183: ifeq          4399
      4186: aload_0
      4187: aload_1
      4188: getstatic     #126                // Field ext/mods/gameserver/enums/PrivilegeType.CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      4191: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      4194: ifne          4198
      4197: return
      4198: aload_0
      4199: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      4202: iconst_5
      4203: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      4206: astore        7
      4208: aload         7
      4210: ifnull        4221
      4213: aload         7
      4215: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      4218: ifne          4222
      4221: return
      4222: aload_1
      4223: invokevirtual #468                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
      4226: ifeq          4237
      4229: aload_1
      4230: ldc_w         #471                // String The wielder of a cursed weapon cannot receive outside heals or buffs
      4233: invokevirtual #473                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      4236: return
      4237: aload_0
      4238: aload_1
      4239: invokevirtual #476                // Method setTarget:(Lext/mods/gameserver/model/WorldObject;)V
      4242: aload         6
      4244: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      4247: istore        8
      4249: aload         4
      4251: invokevirtual #73                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      4254: ifeq          4268
      4257: aload         4
      4259: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      4262: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      4265: goto          4269
      4268: iconst_0
      4269: istore        9
      4271: getstatic     #480                // Field ext/mods/Config.CUSTOM_BUFFER_MANAGER_NPC:Z
      4274: ifeq          4369
      4277: invokestatic  #484                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
      4280: iload         8
      4282: iload         9
      4284: invokevirtual #490                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
      4287: astore        10
      4289: aload         10
      4291: ifnull        4302
      4294: aload         10
      4296: aload_0
      4297: aload_1
      4298: invokevirtual #494                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
      4301: pop
      4302: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      4305: dup
      4306: aload_0
      4307: invokevirtual #34                 // Method getObjectId:()I
      4310: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      4313: astore        11
      4315: aload         11
      4317: aload_1
      4318: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4321: aload         7
      4323: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      4326: invokedynamic #163,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
      4331: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4334: aload         11
      4336: ldc           #167                // String %mp%
      4338: aload_0
      4339: invokevirtual #169                // Method getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
      4342: invokevirtual #173                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
      4345: d2i
      4346: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4349: aload         11
      4351: ldc           #137                // String %objectId%
      4353: aload_0
      4354: invokevirtual #34                 // Method getObjectId:()I
      4357: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4360: aload_1
      4361: aload         11
      4363: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4366: goto          4384
      4369: aload_0
      4370: invokevirtual #500                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI;
      4373: aload_1
      4374: iload         8
      4376: iload         9
      4378: ldc2_w        #504                // double 1000000.0d
      4381: invokevirtual #506                // Method ext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI.addCastDesire:(Lext/mods/gameserver/model/actor/Creature;IID)V
      4384: goto          4396
      4387: astore        8
      4389: aload_1
      4390: ldc_w         #512                // String Invalid skill, contact your server support.
      4393: invokevirtual #473                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      4396: goto          7996
      4399: aload         5
      4401: ldc_w         #514                // String support_back
      4404: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      4407: ifeq          4513
      4410: aload_0
      4411: aload_1
      4412: getstatic     #126                // Field ext/mods/gameserver/enums/PrivilegeType.CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      4415: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      4418: ifne          4422
      4421: return
      4422: aload_0
      4423: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      4426: iconst_5
      4427: invokevirtual #131                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
      4430: astore        7
      4432: aload         7
      4434: ifnull        4445
      4437: aload         7
      4439: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      4442: ifne          4446
      4445: return
      4446: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      4449: dup
      4450: aload_0
      4451: invokevirtual #34                 // Method getObjectId:()I
      4454: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      4457: astore        8
      4459: aload         8
      4461: aload_1
      4462: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4465: aload         7
      4467: invokevirtual #143                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
      4470: invokedynamic #163,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
      4475: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4478: aload         8
      4480: ldc           #167                // String %mp%
      4482: aload_0
      4483: invokevirtual #169                // Method getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
      4486: invokevirtual #173                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
      4489: d2i
      4490: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4493: aload         8
      4495: ldc           #137                // String %objectId%
      4497: aload_0
      4498: invokevirtual #34                 // Method getObjectId:()I
      4501: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4504: aload_1
      4505: aload         8
      4507: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4510: goto          7996
      4513: aload         5
      4515: ldc_w         #516                // String products
      4518: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      4521: ifeq          4547
      4524: aload_0
      4525: aload_1
      4526: getstatic     #126                // Field ext/mods/gameserver/enums/PrivilegeType.CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      4529: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      4532: ifne          4536
      4535: return
      4536: aload_0
      4537: aload_1
      4538: ldc_w         #518                // String html/chamberlain/products.htm
      4541: invokevirtual #109                // Method sendFileMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      4544: goto          7996
      4547: aload         5
      4549: ldc_w         #520                // String list_siege_clans
      4552: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      4555: ifeq          4588
      4558: aload_0
      4559: aload_1
      4560: getstatic     #522                // Field ext/mods/gameserver/enums/PrivilegeType.CP_MANAGE_SIEGE_WAR:Lext/mods/gameserver/enums/PrivilegeType;
      4563: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      4566: ifne          4570
      4569: return
      4570: aload_1
      4571: new           #525                // class ext/mods/gameserver/network/serverpackets/SiegeInfo
      4574: dup
      4575: aload_0
      4576: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      4579: invokespecial #527                // Method ext/mods/gameserver/network/serverpackets/SiegeInfo."<init>":(Lext/mods/gameserver/model/residence/castle/Castle;)V
      4582: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4585: goto          7996
      4588: aload         5
      4590: ldc_w         #530                // String receive_report
      4593: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      4596: ifeq          4976
      4599: aload_3
      4600: getstatic     #532                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.CLAN_MEMBER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
      4603: if_acmpne     4616
      4606: aload_0
      4607: aload_1
      4608: ldc           #47                 // String html/chamberlain/noprivs.htm
      4610: invokevirtual #109                // Method sendFileMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      4613: goto          7996
      4616: invokestatic  #535                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
      4619: aload_0
      4620: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      4623: invokevirtual #206                // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
      4626: invokevirtual #540                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
      4629: astore        7
      4631: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      4634: dup
      4635: aload_0
      4636: invokevirtual #34                 // Method getObjectId:()I
      4639: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      4642: astore        8
      4644: aload         8
      4646: aload_1
      4647: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4650: ldc_w         #544                // String html/chamberlain/report.htm
      4653: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4656: aload         8
      4658: ldc           #137                // String %objectId%
      4660: aload_0
      4661: invokevirtual #34                 // Method getObjectId:()I
      4664: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4667: aload         8
      4669: ldc_w         #546                // String %clanname%
      4672: aload         7
      4674: invokevirtual #548                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
      4677: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4680: aload         8
      4682: ldc_w         #553                // String %clanleadername%
      4685: aload         7
      4687: invokevirtual #555                // Method ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
      4690: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4693: aload         8
      4695: ldc_w         #558                // String %castlename%
      4698: aload_0
      4699: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      4702: invokevirtual #560                // Method ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
      4705: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4708: aload         8
      4710: ldc_w         #561                // String %ss_event%
      4713: invokestatic  #563                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
      4716: invokevirtual #568                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getCurrentPeriod:()Lext/mods/gameserver/enums/PeriodType;
      4719: invokevirtual #572                // Method ext/mods/gameserver/enums/PeriodType.getName:()Ljava/lang/String;
      4722: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4725: getstatic     #575                // Field ext/mods/gameserver/model/actor/instance/CastleChamberlain$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
      4728: invokestatic  #563                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
      4731: getstatic     #581                // Field ext/mods/gameserver/enums/SealType.AVARICE:Lext/mods/gameserver/enums/SealType;
      4734: invokevirtual #587                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
      4737: invokevirtual #591                // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
      4740: iaload
      4741: tableswitch   { // 1 to 3

                       1: 4768

                       2: 4782

                       3: 4796
                 default: 4807
            }
      4768: aload         8
      4770: ldc_w         #596                // String %ss_avarice%
      4773: ldc_w         #598                // String Not in Possession
      4776: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4779: goto          4807
      4782: aload         8
      4784: ldc_w         #596                // String %ss_avarice%
      4787: ldc_w         #600                // String Lords of Dawn
      4790: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4793: goto          4807
      4796: aload         8
      4798: ldc_w         #596                // String %ss_avarice%
      4801: ldc_w         #602                // String Revolutionaries of Dusk
      4804: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4807: getstatic     #575                // Field ext/mods/gameserver/model/actor/instance/CastleChamberlain$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
      4810: invokestatic  #563                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
      4813: getstatic     #604                // Field ext/mods/gameserver/enums/SealType.GNOSIS:Lext/mods/gameserver/enums/SealType;
      4816: invokevirtual #587                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
      4819: invokevirtual #591                // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
      4822: iaload
      4823: tableswitch   { // 1 to 3

                       1: 4848

                       2: 4862

                       3: 4876
                 default: 4887
            }
      4848: aload         8
      4850: ldc_w         #607                // String %ss_gnosis%
      4853: ldc_w         #598                // String Not in Possession
      4856: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4859: goto          4887
      4862: aload         8
      4864: ldc_w         #607                // String %ss_gnosis%
      4867: ldc_w         #600                // String Lords of Dawn
      4870: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4873: goto          4887
      4876: aload         8
      4878: ldc_w         #607                // String %ss_gnosis%
      4881: ldc_w         #602                // String Revolutionaries of Dusk
      4884: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4887: getstatic     #575                // Field ext/mods/gameserver/model/actor/instance/CastleChamberlain$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
      4890: invokestatic  #563                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
      4893: getstatic     #609                // Field ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
      4896: invokevirtual #587                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
      4899: invokevirtual #591                // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
      4902: iaload
      4903: tableswitch   { // 1 to 3

                       1: 4928

                       2: 4942

                       3: 4956
                 default: 4967
            }
      4928: aload         8
      4930: ldc_w         #612                // String %ss_strife%
      4933: ldc_w         #598                // String Not in Possession
      4936: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4939: goto          4967
      4942: aload         8
      4944: ldc_w         #612                // String %ss_strife%
      4947: ldc_w         #600                // String Lords of Dawn
      4950: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4953: goto          4967
      4956: aload         8
      4958: ldc_w         #612                // String %ss_strife%
      4961: ldc_w         #602                // String Revolutionaries of Dusk
      4964: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4967: aload_1
      4968: aload         8
      4970: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4973: goto          7996
      4976: aload         5
      4978: ldc_w         #614                // String items
      4981: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      4984: ifeq          5026
      4987: aload_0
      4988: aload_1
      4989: getstatic     #126                // Field ext/mods/gameserver/enums/PrivilegeType.CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      4992: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      4995: ifne          4999
      4998: return
      4999: aload         6
      5001: invokevirtual #616                // Method java/lang/String.isEmpty:()Z
      5004: ifeq          5008
      5007: return
      5008: aload_0
      5009: aload_1
      5010: aload         6
      5012: invokedynamic #619,  0            // InvokeDynamic #23:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      5017: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      5020: invokevirtual #620                // Method showBuyWindow:(Lext/mods/gameserver/model/actor/Player;I)V
      5023: goto          7996
      5026: aload         5
      5028: ldc_w         #624                // String manage_vault
      5031: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      5034: ifeq          5301
      5037: aload_0
      5038: aload_1
      5039: getstatic     #626                // Field ext/mods/gameserver/enums/PrivilegeType.CP_MANAGE_TAXES:Lext/mods/gameserver/enums/PrivilegeType;
      5042: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      5045: ifne          5049
      5048: return
      5049: ldc_w         #629                // String html/chamberlain/vault.htm
      5052: astore        7
      5054: iconst_0
      5055: istore        8
      5057: aload         4
      5059: invokevirtual #73                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      5062: ifeq          5075
      5065: aload         4
      5067: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      5070: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      5073: istore        8
      5075: iload         8
      5077: ifle          5189
      5080: aload         6
      5082: ldc_w         #631                // String deposit
      5085: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      5088: ifeq          5134
      5091: aload_0
      5092: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5095: invokevirtual #633                // Method ext/mods/gameserver/model/residence/castle/Castle.getTreasury:()J
      5098: iload         8
      5100: i2l
      5101: ladd
      5102: ldc2_w        #636                // long 2147483647l
      5105: lcmp
      5106: ifge          5189
      5109: aload_1
      5110: iload         8
      5112: iconst_1
      5113: invokevirtual #638                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
      5116: ifeq          5189
      5119: aload_0
      5120: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5123: iload         8
      5125: i2l
      5126: iconst_1
      5127: invokevirtual #642                // Method ext/mods/gameserver/model/residence/castle/Castle.editTreasury:(JZ)Z
      5130: pop
      5131: goto          5189
      5134: aload         6
      5136: ldc_w         #646                // String withdraw
      5139: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      5142: ifeq          5189
      5145: aload_0
      5146: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5149: invokevirtual #633                // Method ext/mods/gameserver/model/residence/castle/Castle.getTreasury:()J
      5152: iload         8
      5154: i2l
      5155: lcmp
      5156: ifge          5167
      5159: ldc_w         #648                // String html/chamberlain/vault-no.htm
      5162: astore        7
      5164: goto          5189
      5167: aload_0
      5168: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5171: iload         8
      5173: ineg
      5174: i2l
      5175: iconst_1
      5176: invokevirtual #642                // Method ext/mods/gameserver/model/residence/castle/Castle.editTreasury:(JZ)Z
      5179: ifeq          5189
      5182: aload_1
      5183: iload         8
      5185: iconst_1
      5186: invokevirtual #650                // Method ext/mods/gameserver/model/actor/Player.addAdena:(IZ)V
      5189: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      5192: dup
      5193: aload_0
      5194: invokevirtual #34                 // Method getObjectId:()I
      5197: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      5200: astore        9
      5202: aload         9
      5204: aload_1
      5205: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      5208: aload         7
      5210: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      5213: aload         9
      5215: ldc           #137                // String %objectId%
      5217: aload_0
      5218: invokevirtual #34                 // Method getObjectId:()I
      5221: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5224: aload         9
      5226: ldc_w         #654                // String %tax_income%
      5229: aload_0
      5230: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5233: invokevirtual #633                // Method ext/mods/gameserver/model/residence/castle/Castle.getTreasury:()J
      5236: invokestatic  #656                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
      5239: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5242: aload         9
      5244: ldc_w         #662                // String %tax_income_reserved%
      5247: aload_0
      5248: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5251: invokevirtual #664                // Method ext/mods/gameserver/model/residence/castle/Castle.getTaxRevenue:()J
      5254: invokestatic  #656                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
      5257: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5260: aload         9
      5262: ldc_w         #667                // String %seed_income%
      5265: aload_0
      5266: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5269: invokevirtual #669                // Method ext/mods/gameserver/model/residence/castle/Castle.getSeedIncome:()J
      5272: invokestatic  #656                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
      5275: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5278: aload         9
      5280: ldc_w         #672                // String %withdraw_amount%
      5283: iload         8
      5285: i2l
      5286: invokestatic  #656                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
      5289: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5292: aload_1
      5293: aload         9
      5295: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      5298: goto          7996
      5301: aload         5
      5303: ldc_w         #674                // String operate_door
      5306: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      5309: ifeq          5504
      5312: aload_0
      5313: aload_1
      5314: getstatic     #676                // Field ext/mods/gameserver/enums/PrivilegeType.CP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
      5317: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      5320: ifne          5324
      5323: return
      5324: aload         6
      5326: invokevirtual #616                // Method java/lang/String.isEmpty:()Z
      5329: ifeq          5381
      5332: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      5335: dup
      5336: aload_0
      5337: invokevirtual #34                 // Method getObjectId:()I
      5340: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      5343: astore        7
      5345: aload         7
      5347: aload_1
      5348: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      5351: aload_0
      5352: invokevirtual #199                // Method getNpcId:()I
      5355: invokedynamic #679,  0            // InvokeDynamic #24:makeConcatWithConstants:(I)Ljava/lang/String;
      5360: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      5363: aload         7
      5365: ldc           #137                // String %objectId%
      5367: aload_0
      5368: invokevirtual #34                 // Method getObjectId:()I
      5371: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5374: aload_1
      5375: aload         7
      5377: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      5380: return
      5381: aload         6
      5383: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      5386: iconst_1
      5387: if_icmpne     5394
      5390: iconst_1
      5391: goto          5395
      5394: iconst_0
      5395: istore        7
      5397: aload         4
      5399: invokevirtual #73                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      5402: ifeq          5448
      5405: iload         7
      5407: ifeq          5429
      5410: aload_0
      5411: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5414: aload_1
      5415: aload         4
      5417: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      5420: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      5423: invokevirtual #680                // Method ext/mods/gameserver/model/residence/castle/Castle.openDoor:(Lext/mods/gameserver/model/actor/Player;I)V
      5426: goto          5397
      5429: aload_0
      5430: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5433: aload_1
      5434: aload         4
      5436: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      5439: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      5442: invokevirtual #683                // Method ext/mods/gameserver/model/residence/castle/Castle.closeDoor:(Lext/mods/gameserver/model/actor/Player;I)V
      5445: goto          5397
      5448: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      5451: dup
      5452: aload_0
      5453: invokevirtual #34                 // Method getObjectId:()I
      5456: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      5459: astore        8
      5461: aload         8
      5463: aload_1
      5464: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      5467: iload         7
      5469: ifeq          5478
      5472: ldc_w         #686                // String html/chamberlain/doors-open.htm
      5475: goto          5481
      5478: ldc_w         #688                // String chamberlain/doors-close.htm
      5481: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      5484: aload         8
      5486: ldc           #137                // String %objectId%
      5488: aload_0
      5489: invokevirtual #34                 // Method getObjectId:()I
      5492: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5495: aload_1
      5496: aload         8
      5498: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      5501: goto          7996
      5504: aload         5
      5506: ldc_w         #690                // String tax_set
      5509: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      5512: ifeq          5672
      5515: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      5518: dup
      5519: aload_0
      5520: invokevirtual #34                 // Method getObjectId:()I
      5523: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      5526: astore        7
      5528: aload_0
      5529: aload_1
      5530: getstatic     #626                // Field ext/mods/gameserver/enums/PrivilegeType.CP_MANAGE_TAXES:Lext/mods/gameserver/enums/PrivilegeType;
      5533: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      5536: ifne          5599
      5539: aload         7
      5541: aload_1
      5542: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      5545: ldc_w         #692                // String html/chamberlain/tax-member.htm
      5548: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      5551: aload         7
      5553: ldc_w         #694                // String %currentTaxRate%
      5556: aload_0
      5557: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5560: invokevirtual #696                // Method ext/mods/gameserver/model/residence/castle/Castle.getCurrentTaxPercent:()I
      5563: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5566: aload         7
      5568: ldc_w         #699                // String %nextTaxRate%
      5571: aload_0
      5572: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5575: invokevirtual #701                // Method ext/mods/gameserver/model/residence/castle/Castle.getNextTaxPercent:()I
      5578: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5581: aload         7
      5583: ldc           #137                // String %objectId%
      5585: aload_0
      5586: invokevirtual #34                 // Method getObjectId:()I
      5589: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5592: aload_1
      5593: aload         7
      5595: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      5598: return
      5599: aload         7
      5601: aload_1
      5602: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      5605: ldc_w         #704                // String html/chamberlain/tax-leader.htm
      5608: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      5611: aload         7
      5613: ldc_w         #694                // String %currentTaxRate%
      5616: aload_0
      5617: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5620: invokevirtual #696                // Method ext/mods/gameserver/model/residence/castle/Castle.getCurrentTaxPercent:()I
      5623: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5626: aload         7
      5628: ldc_w         #699                // String %nextTaxRate%
      5631: aload_0
      5632: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5635: invokevirtual #701                // Method ext/mods/gameserver/model/residence/castle/Castle.getNextTaxPercent:()I
      5638: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5641: aload         7
      5643: ldc           #137                // String %objectId%
      5645: aload_0
      5646: invokevirtual #34                 // Method getObjectId:()I
      5649: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5652: aload         7
      5654: ldc_w         #706                // String %taxLimit%
      5657: invokestatic  #708                // Method getTaxLimit:()I
      5660: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5663: aload_1
      5664: aload         7
      5666: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      5669: goto          7996
      5672: aload         5
      5674: ldc_w         #711                // String tax_adjust
      5677: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      5680: ifeq          5829
      5683: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      5686: dup
      5687: aload_0
      5688: invokevirtual #34                 // Method getObjectId:()I
      5691: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      5694: astore        7
      5696: invokestatic  #708                // Method getTaxLimit:()I
      5699: istore        8
      5701: aload         6
      5703: invokevirtual #616                // Method java/lang/String.isEmpty:()Z
      5706: ifeq          5713
      5709: iconst_0
      5710: goto          5718
      5713: aload         6
      5715: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      5718: istore        9
      5720: iload         9
      5722: iflt          5732
      5725: iload         9
      5727: iload         8
      5729: if_icmple     5772
      5732: aload         7
      5734: aload_1
      5735: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      5738: ldc_w         #713                // String html/chamberlain/tax-toohigh.htm
      5741: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      5744: aload         7
      5746: ldc           #137                // String %objectId%
      5748: aload_0
      5749: invokevirtual #34                 // Method getObjectId:()I
      5752: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5755: aload         7
      5757: ldc_w         #706                // String %taxLimit%
      5760: iload         8
      5762: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5765: aload_1
      5766: aload         7
      5768: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      5771: return
      5772: aload_0
      5773: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5776: iload         9
      5778: iconst_1
      5779: invokevirtual #715                // Method ext/mods/gameserver/model/residence/castle/Castle.setNextTaxPercent:(IZ)V
      5782: aload         7
      5784: aload_1
      5785: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      5788: ldc_w         #718                // String html/chamberlain/tax-after.htm
      5791: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      5794: aload         7
      5796: ldc_w         #699                // String %nextTaxRate%
      5799: aload_0
      5800: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      5803: invokevirtual #701                // Method ext/mods/gameserver/model/residence/castle/Castle.getNextTaxPercent:()I
      5806: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5809: aload         7
      5811: ldc           #137                // String %objectId%
      5813: aload_0
      5814: invokevirtual #34                 // Method getObjectId:()I
      5817: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5820: aload_1
      5821: aload         7
      5823: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      5826: goto          7996
      5829: aload         5
      5831: ldc_w         #720                // String manor
      5834: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      5837: ifeq          5984
      5840: aload_0
      5841: aload_1
      5842: getstatic     #722                // Field ext/mods/gameserver/enums/PrivilegeType.CP_MANOR_ADMINISTRATION:Lext/mods/gameserver/enums/PrivilegeType;
      5845: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      5848: ifne          5852
      5851: return
      5852: ldc           #77                 // String
      5854: astore        7
      5856: getstatic     #725                // Field ext/mods/Config.ALLOW_MANOR:Z
      5859: ifne          5870
      5862: ldc_w         #728                // String html/npcdefault.htm
      5865: astore        7
      5867: goto          5932
      5870: aload         6
      5872: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      5875: istore        8
      5877: iload         8
      5879: lookupswitch  { // 2

                       0: 5904

                       4: 5912
                 default: 5927
            }
      5904: ldc_w         #730                // String html/chamberlain/manor/manor.htm
      5907: astore        7
      5909: goto          5932
      5912: aload         4
      5914: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      5917: invokedynamic #732,  0            // InvokeDynamic #25:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      5922: astore        7
      5924: goto          5932
      5927: ldc_w         #733                // String html/chamberlain/no.htm
      5930: astore        7
      5932: aload         7
      5934: invokevirtual #735                // Method java/lang/String.length:()I
      5937: ifeq          5981
      5940: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      5943: dup
      5944: aload_0
      5945: invokevirtual #34                 // Method getObjectId:()I
      5948: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      5951: astore        8
      5953: aload         8
      5955: aload_1
      5956: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      5959: aload         7
      5961: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      5964: aload         8
      5966: ldc           #137                // String %objectId%
      5968: aload_0
      5969: invokevirtual #34                 // Method getObjectId:()I
      5972: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5975: aload_1
      5976: aload         8
      5978: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      5981: goto          7996
      5984: aload_2
      5985: ldc_w         #738                // String manor_menu_select
      5988: invokevirtual #740                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      5991: ifeq          6301
      5994: aload_0
      5995: aload_1
      5996: getstatic     #722                // Field ext/mods/gameserver/enums/PrivilegeType.CP_MANOR_ADMINISTRATION:Lext/mods/gameserver/enums/PrivilegeType;
      5999: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      6002: ifne          6006
      6005: return
      6006: invokestatic  #743                // Method ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
      6009: astore        7
      6011: aload         7
      6013: invokevirtual #748                // Method ext/mods/gameserver/data/manager/CastleManorManager.isUnderMaintenance:()Z
      6016: ifeq          6034
      6019: aload_1
      6020: getstatic     #751                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      6023: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6026: aload_1
      6027: getstatic     #757                // Field ext/mods/gameserver/network/SystemMessageId.THE_MANOR_SYSTEM_IS_CURRENTLY_UNDER_MAINTENANCE:Lext/mods/gameserver/network/SystemMessageId;
      6030: invokevirtual #763                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      6033: return
      6034: aload_2
      6035: aload_2
      6036: ldc_w         #766                // String ?
      6039: invokevirtual #768                // Method java/lang/String.indexOf:(Ljava/lang/String;)I
      6042: iconst_1
      6043: iadd
      6044: invokevirtual #771                // Method java/lang/String.substring:(I)Ljava/lang/String;
      6047: astore        8
      6049: new           #62                 // class java/util/StringTokenizer
      6052: dup
      6053: aload         8
      6055: ldc_w         #774                // String &
      6058: invokespecial #66                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
      6061: astore        9
      6063: aload         9
      6065: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      6068: ldc_w         #776                // String =
      6071: invokevirtual #778                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      6074: iconst_1
      6075: aaload
      6076: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      6079: istore        10
      6081: aload         9
      6083: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      6086: ldc_w         #776                // String =
      6089: invokevirtual #778                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      6092: iconst_1
      6093: aaload
      6094: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      6097: istore        11
      6099: aload         9
      6101: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      6104: ldc_w         #776                // String =
      6107: invokevirtual #778                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      6110: iconst_1
      6111: aaload
      6112: ldc_w         #782                // String 1
      6115: invokevirtual #784                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      6118: istore        12
      6120: iload         11
      6122: iconst_m1
      6123: if_icmpne     6136
      6126: aload_0
      6127: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      6130: invokevirtual #788                // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
      6133: goto          6138
      6136: iload         11
      6138: istore        13
      6140: iload         10
      6142: tableswitch   { // 3 to 8

                       3: 6180

                       4: 6199

                       5: 6218

                       6: 6298

                       7: 6233

                       8: 6267
                 default: 6298
            }
      6180: aload_1
      6181: new           #791                // class ext/mods/gameserver/network/serverpackets/ExShowSeedInfo
      6184: dup
      6185: iload         13
      6187: iload         12
      6189: iconst_1
      6190: invokespecial #793                // Method ext/mods/gameserver/network/serverpackets/ExShowSeedInfo."<init>":(IZZ)V
      6193: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6196: goto          6298
      6199: aload_1
      6200: new           #796                // class ext/mods/gameserver/network/serverpackets/ExShowCropInfo
      6203: dup
      6204: iload         13
      6206: iload         12
      6208: iconst_1
      6209: invokespecial #798                // Method ext/mods/gameserver/network/serverpackets/ExShowCropInfo."<init>":(IZZ)V
      6212: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6215: goto          6298
      6218: aload_1
      6219: new           #799                // class ext/mods/gameserver/network/serverpackets/ExShowManorDefaultInfo
      6222: dup
      6223: iconst_1
      6224: invokespecial #801                // Method ext/mods/gameserver/network/serverpackets/ExShowManorDefaultInfo."<init>":(Z)V
      6227: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6230: goto          6298
      6233: aload         7
      6235: invokevirtual #804                // Method ext/mods/gameserver/data/manager/CastleManorManager.isManorApproved:()Z
      6238: ifeq          6251
      6241: aload_1
      6242: getstatic     #807                // Field ext/mods/gameserver/network/SystemMessageId.A_MANOR_CANNOT_BE_SET_UP_BETWEEN_6_AM_AND_8_PM:Lext/mods/gameserver/network/SystemMessageId;
      6245: invokevirtual #763                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      6248: goto          6298
      6251: aload_1
      6252: new           #810                // class ext/mods/gameserver/network/serverpackets/ExShowSeedSetting
      6255: dup
      6256: iload         13
      6258: invokespecial #812                // Method ext/mods/gameserver/network/serverpackets/ExShowSeedSetting."<init>":(I)V
      6261: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6264: goto          6298
      6267: aload         7
      6269: invokevirtual #804                // Method ext/mods/gameserver/data/manager/CastleManorManager.isManorApproved:()Z
      6272: ifeq          6285
      6275: aload_1
      6276: getstatic     #807                // Field ext/mods/gameserver/network/SystemMessageId.A_MANOR_CANNOT_BE_SET_UP_BETWEEN_6_AM_AND_8_PM:Lext/mods/gameserver/network/SystemMessageId;
      6279: invokevirtual #763                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      6282: goto          6298
      6285: aload_1
      6286: new           #813                // class ext/mods/gameserver/network/serverpackets/ExShowCropSetting
      6289: dup
      6290: iload         13
      6292: invokespecial #815                // Method ext/mods/gameserver/network/serverpackets/ExShowCropSetting."<init>":(I)V
      6295: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6298: goto          7996
      6301: aload         5
      6303: ldc_w         #816                // String siege_change
      6306: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      6309: ifeq          6390
      6312: aload_0
      6313: aload_1
      6314: getstatic     #522                // Field ext/mods/gameserver/enums/PrivilegeType.CP_MANAGE_SIEGE_WAR:Lext/mods/gameserver/enums/PrivilegeType;
      6317: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      6320: ifne          6324
      6323: return
      6324: aload_0
      6325: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      6328: invokevirtual #818                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
      6331: invokevirtual #822                // Method ext/mods/gameserver/model/residence/castle/Siege.getSiegeRegistrationEndDate:()J
      6334: invokestatic  #827                // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
      6337: invokevirtual #832                // Method java/util/Calendar.getTimeInMillis:()J
      6340: lcmp
      6341: ifge          6355
      6344: aload_0
      6345: aload_1
      6346: ldc_w         #835                // String html/chamberlain/siegetime1.htm
      6349: invokevirtual #109                // Method sendFileMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      6352: goto          7996
      6355: aload_0
      6356: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      6359: invokevirtual #818                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
      6362: invokevirtual #837                // Method ext/mods/gameserver/model/residence/castle/Siege.isTimeRegistrationOver:()Z
      6365: ifeq          6379
      6368: aload_0
      6369: aload_1
      6370: ldc_w         #840                // String html/chamberlain/siegetime2.htm
      6373: invokevirtual #109                // Method sendFileMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      6376: goto          7996
      6379: aload_0
      6380: aload_1
      6381: ldc_w         #842                // String html/chamberlain/siegetime3.htm
      6384: invokevirtual #109                // Method sendFileMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      6387: goto          7996
      6390: aload         5
      6392: ldc_w         #844                // String siege_time_set
      6395: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      6398: ifeq          6510
      6401: aload_0
      6402: aload_1
      6403: getstatic     #522                // Field ext/mods/gameserver/enums/PrivilegeType.CP_MANAGE_SIEGE_WAR:Lext/mods/gameserver/enums/PrivilegeType;
      6406: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      6409: ifne          6413
      6412: return
      6413: aload         6
      6415: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      6418: lookupswitch  { // 1

                       1: 6436
                 default: 6451
            }
      6436: aload_0
      6437: aload         4
      6439: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      6442: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      6445: putfield      #7                  // Field _preHour:I
      6448: goto          6451
      6451: aload_0
      6452: getfield      #7                  // Field _preHour:I
      6455: bipush        6
      6457: if_icmpeq     6499
      6460: aload_0
      6461: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      6464: invokevirtual #846                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiegeDate:()Ljava/util/Calendar;
      6467: bipush        11
      6469: aload_0
      6470: getfield      #7                  // Field _preHour:I
      6473: bipush        12
      6475: iadd
      6476: invokevirtual #849                // Method java/util/Calendar.set:(II)V
      6479: aload_0
      6480: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      6483: invokevirtual #818                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
      6486: iconst_0
      6487: invokevirtual #853                // Method ext/mods/gameserver/model/residence/castle/Siege.endTimeRegistration:(Z)V
      6490: aload_0
      6491: aload_1
      6492: ldc_w         #856                // String html/chamberlain/siegetime8.htm
      6495: invokevirtual #109                // Method sendFileMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      6498: return
      6499: aload_0
      6500: aload_1
      6501: ldc_w         #858                // String html/chamberlain/siegetime6.htm
      6504: invokevirtual #109                // Method sendFileMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      6507: goto          7996
      6510: aload         5
      6512: ldc_w         #860                // String give_crown
      6515: invokevirtual #784                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      6518: ifeq          6641
      6521: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      6524: dup
      6525: aload_0
      6526: invokevirtual #34                 // Method getObjectId:()I
      6529: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      6532: astore        7
      6534: aload_3
      6535: getstatic     #862                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
      6538: if_acmpne     6621
      6541: aload_1
      6542: invokevirtual #865                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
      6545: sipush        6841
      6548: invokevirtual #869                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
      6551: ifnonnull     6606
      6554: aload_1
      6555: sipush        6841
      6558: iconst_1
      6559: iconst_1
      6560: invokevirtual #875                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
      6563: pop
      6564: aload         7
      6566: aload_1
      6567: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6570: ldc_w         #879                // String html/chamberlain/gavecrown.htm
      6573: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6576: aload         7
      6578: ldc_w         #881                // String %CharName%
      6581: aload_1
      6582: invokevirtual #883                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      6585: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6588: aload         7
      6590: ldc_w         #884                // String %FeudName%
      6593: aload_0
      6594: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      6597: invokevirtual #560                // Method ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
      6600: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6603: goto          6632
      6606: aload         7
      6608: aload_1
      6609: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6612: ldc_w         #886                // String html/chamberlain/hascrown.htm
      6615: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6618: goto          6632
      6621: aload         7
      6623: aload_1
      6624: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6627: ldc           #47                 // String html/chamberlain/noprivs.htm
      6629: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6632: aload_1
      6633: aload         7
      6635: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6638: goto          7996
      6641: aload         5
      6643: ldc_w         #888                // String manor_certificate
      6646: invokevirtual #784                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      6649: ifeq          6825
      6652: aload_0
      6653: aload_1
      6654: getstatic     #126                // Field ext/mods/gameserver/enums/PrivilegeType.CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      6657: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      6660: ifne          6664
      6663: return
      6664: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      6667: dup
      6668: aload_0
      6669: invokevirtual #34                 // Method getObjectId:()I
      6672: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      6675: astore        7
      6677: invokestatic  #563                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
      6680: invokevirtual #890                // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
      6683: ifeq          6793
      6686: invokestatic  #563                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
      6689: aload_1
      6690: invokevirtual #893                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      6693: invokevirtual #894                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
      6696: getstatic     #898                // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
      6699: if_acmpne     6717
      6702: aload         7
      6704: aload_1
      6705: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6708: ldc_w         #902                // String html/chamberlain/not-dawn-or-event.htm
      6711: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6714: goto          6805
      6717: aload_0
      6718: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      6721: invokevirtual #904                // Method ext/mods/gameserver/model/residence/castle/Castle.getLeftCertificates:()I
      6724: ifne          6742
      6727: aload         7
      6729: aload_1
      6730: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6733: ldc_w         #907                // String html/chamberlain/not-enough-ticket.htm
      6736: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6739: goto          6805
      6742: aload         7
      6744: aload_1
      6745: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6748: ldc_w         #909                // String html/chamberlain/sell-dawn-ticket.htm
      6751: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6754: aload         7
      6756: ldc_w         #911                // String %left%
      6759: aload_0
      6760: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      6763: invokevirtual #904                // Method ext/mods/gameserver/model/residence/castle/Castle.getLeftCertificates:()I
      6766: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      6769: aload         7
      6771: ldc_w         #913                // String %bundle%
      6774: bipush        10
      6776: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      6779: aload         7
      6781: ldc_w         #915                // String %price%
      6784: sipush        1000
      6787: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      6790: goto          6805
      6793: aload         7
      6795: aload_1
      6796: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6799: ldc_w         #902                // String html/chamberlain/not-dawn-or-event.htm
      6802: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6805: aload         7
      6807: ldc           #137                // String %objectId%
      6809: aload_0
      6810: invokevirtual #34                 // Method getObjectId:()I
      6813: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      6816: aload_1
      6817: aload         7
      6819: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6822: goto          7996
      6825: aload         5
      6827: ldc_w         #917                // String validate_certificate
      6830: invokevirtual #784                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      6833: ifeq          7064
      6836: aload_0
      6837: aload_1
      6838: getstatic     #126                // Field ext/mods/gameserver/enums/PrivilegeType.CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      6841: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      6844: ifne          6848
      6847: return
      6848: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      6851: dup
      6852: aload_0
      6853: invokevirtual #34                 // Method getObjectId:()I
      6856: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      6859: astore        7
      6861: invokestatic  #563                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
      6864: invokevirtual #890                // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
      6867: ifeq          7032
      6870: invokestatic  #563                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
      6873: aload_1
      6874: invokevirtual #893                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      6877: invokevirtual #894                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
      6880: getstatic     #898                // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
      6883: if_acmpne     6901
      6886: aload         7
      6888: aload_1
      6889: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6892: ldc_w         #902                // String html/chamberlain/not-dawn-or-event.htm
      6895: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6898: goto          7044
      6901: aload_0
      6902: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      6905: invokevirtual #904                // Method ext/mods/gameserver/model/residence/castle/Castle.getLeftCertificates:()I
      6908: ifne          6926
      6911: aload         7
      6913: aload_1
      6914: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6917: ldc_w         #907                // String html/chamberlain/not-enough-ticket.htm
      6920: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6923: goto          7044
      6926: aload_1
      6927: sipush        10000
      6930: iconst_1
      6931: invokevirtual #638                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
      6934: ifeq          7017
      6937: aload_1
      6938: sipush        6388
      6941: bipush        10
      6943: iconst_1
      6944: invokevirtual #875                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
      6947: pop
      6948: aload_0
      6949: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      6952: aload_0
      6953: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      6956: invokevirtual #904                // Method ext/mods/gameserver/model/residence/castle/Castle.getLeftCertificates:()I
      6959: bipush        10
      6961: isub
      6962: iconst_1
      6963: invokevirtual #919                // Method ext/mods/gameserver/model/residence/castle/Castle.setLeftCertificates:(IZ)V
      6966: aload         7
      6968: aload_1
      6969: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6972: ldc_w         #909                // String html/chamberlain/sell-dawn-ticket.htm
      6975: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6978: aload         7
      6980: ldc_w         #911                // String %left%
      6983: aload_0
      6984: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      6987: invokevirtual #904                // Method ext/mods/gameserver/model/residence/castle/Castle.getLeftCertificates:()I
      6990: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      6993: aload         7
      6995: ldc_w         #913                // String %bundle%
      6998: bipush        10
      7000: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7003: aload         7
      7005: ldc_w         #915                // String %price%
      7008: sipush        1000
      7011: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7014: goto          7044
      7017: aload         7
      7019: aload_1
      7020: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7023: ldc_w         #922                // String html/chamberlain/not-enough-adena.htm
      7026: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7029: goto          7044
      7032: aload         7
      7034: aload_1
      7035: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7038: ldc_w         #902                // String html/chamberlain/not-dawn-or-event.htm
      7041: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7044: aload         7
      7046: ldc           #137                // String %objectId%
      7048: aload_0
      7049: invokevirtual #34                 // Method getObjectId:()I
      7052: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7055: aload_1
      7056: aload         7
      7058: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7061: goto          7996
      7064: aload         5
      7066: ldc_w         #924                // String castle_devices
      7069: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      7072: ifeq          7098
      7075: aload_0
      7076: aload_1
      7077: getstatic     #119                // Field ext/mods/gameserver/enums/PrivilegeType.CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      7080: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      7083: ifne          7087
      7086: return
      7087: aload_0
      7088: aload_1
      7089: ldc_w         #926                // String html/chamberlain/devices.htm
      7092: invokevirtual #109                // Method sendFileMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      7095: goto          7996
      7098: aload         5
      7100: ldc_w         #928                // String doors_update
      7103: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      7106: ifeq          7218
      7109: aload_0
      7110: aload_1
      7111: getstatic     #119                // Field ext/mods/gameserver/enums/PrivilegeType.CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      7114: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      7117: ifne          7121
      7120: return
      7121: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      7124: dup
      7125: aload_0
      7126: invokevirtual #34                 // Method getObjectId:()I
      7129: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      7132: astore        7
      7134: aload         6
      7136: invokevirtual #616                // Method java/lang/String.isEmpty:()Z
      7139: ifeq          7163
      7142: aload         7
      7144: aload_1
      7145: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7148: aload_0
      7149: invokevirtual #199                // Method getNpcId:()I
      7152: invokedynamic #930,  0            // InvokeDynamic #26:makeConcatWithConstants:(I)Ljava/lang/String;
      7157: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7160: goto          7198
      7163: aload         7
      7165: aload_1
      7166: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7169: ldc_w         #931                // String html/chamberlain/doors-update.htm
      7172: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7175: aload         7
      7177: ldc_w         #933                // String %id%
      7180: aload         6
      7182: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      7185: aload         7
      7187: ldc_w         #935                // String %type%
      7190: aload         4
      7192: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      7195: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      7198: aload         7
      7200: ldc           #137                // String %objectId%
      7202: aload_0
      7203: invokevirtual #34                 // Method getObjectId:()I
      7206: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7209: aload_1
      7210: aload         7
      7212: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7215: goto          7996
      7218: aload         5
      7220: ldc_w         #937                // String doors_choose_upgrade
      7223: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      7226: ifeq          7355
      7229: aload_0
      7230: aload_1
      7231: getstatic     #119                // Field ext/mods/gameserver/enums/PrivilegeType.CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      7234: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      7237: ifne          7241
      7240: return
      7241: aload         6
      7243: astore        7
      7245: aload         4
      7247: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      7250: astore        8
      7252: aload         4
      7254: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      7257: astore        9
      7259: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      7262: dup
      7263: aload_0
      7264: invokevirtual #34                 // Method getObjectId:()I
      7267: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      7270: astore        10
      7272: aload         10
      7274: aload_1
      7275: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7278: ldc_w         #939                // String html/chamberlain/doors-confirm.htm
      7281: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7284: aload         10
      7286: ldc           #137                // String %objectId%
      7288: aload_0
      7289: invokevirtual #34                 // Method getObjectId:()I
      7292: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7295: aload         10
      7297: ldc_w         #933                // String %id%
      7300: aload         7
      7302: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      7305: aload         10
      7307: ldc_w         #941                // String %level%
      7310: aload         9
      7312: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      7315: aload         10
      7317: ldc_w         #935                // String %type%
      7320: aload         8
      7322: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      7325: aload         10
      7327: ldc_w         #915                // String %price%
      7330: aload         8
      7332: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      7335: aload         9
      7337: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      7340: invokestatic  #943                // Method getDoorCost:(II)I
      7343: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7346: aload_1
      7347: aload         10
      7349: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7352: goto          7996
      7355: aload         5
      7357: ldc_w         #947                // String doors_confirm_upgrade
      7360: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      7363: ifeq          7564
      7366: aload_0
      7367: aload_1
      7368: getstatic     #119                // Field ext/mods/gameserver/enums/PrivilegeType.CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      7371: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      7374: ifne          7378
      7377: return
      7378: aload         4
      7380: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      7383: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      7386: istore        7
      7388: aload         4
      7390: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      7393: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      7396: istore        8
      7398: iload         7
      7400: iload         8
      7402: invokestatic  #943                // Method getDoorCost:(II)I
      7405: istore        9
      7407: iload         9
      7409: ifne          7413
      7412: return
      7413: aload         6
      7415: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      7418: istore        10
      7420: aload_0
      7421: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      7424: iload         10
      7426: invokevirtual #949                // Method ext/mods/gameserver/model/residence/castle/Castle.getDoor:(I)Lext/mods/gameserver/model/actor/instance/Door;
      7429: astore        11
      7431: aload         11
      7433: ifnonnull     7437
      7436: return
      7437: aload         11
      7439: invokevirtual #953                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
      7442: invokevirtual #958                // Method ext/mods/gameserver/model/actor/status/DoorStatus.getUpgradeHpRatio:()I
      7445: istore        12
      7447: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      7450: dup
      7451: aload_0
      7452: invokevirtual #34                 // Method getObjectId:()I
      7455: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      7458: astore        13
      7460: iload         12
      7462: iload         8
      7464: if_icmplt     7495
      7467: aload         13
      7469: aload_1
      7470: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7473: ldc_w         #963                // String html/chamberlain/doors-already-updated.htm
      7476: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7479: aload         13
      7481: ldc_w         #941                // String %level%
      7484: iload         12
      7486: bipush        100
      7488: imul
      7489: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7492: goto          7544
      7495: aload_1
      7496: iload         9
      7498: iconst_1
      7499: invokevirtual #638                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
      7502: ifne          7520
      7505: aload         13
      7507: aload_1
      7508: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7511: ldc_w         #922                // String html/chamberlain/not-enough-adena.htm
      7514: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7517: goto          7544
      7520: aload_0
      7521: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      7524: iload         10
      7526: iload         8
      7528: iconst_1
      7529: invokevirtual #965                // Method ext/mods/gameserver/model/residence/castle/Castle.upgradeDoor:(IIZ)V
      7532: aload         13
      7534: aload_1
      7535: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7538: ldc_w         #969                // String html/chamberlain/doors-success.htm
      7541: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7544: aload         13
      7546: ldc           #137                // String %objectId%
      7548: aload_0
      7549: invokevirtual #34                 // Method getObjectId:()I
      7552: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7555: aload_1
      7556: aload         13
      7558: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7561: goto          7996
      7564: aload         5
      7566: ldc_w         #971                // String traps_update
      7569: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      7572: ifeq          7697
      7575: aload_0
      7576: aload_1
      7577: getstatic     #119                // Field ext/mods/gameserver/enums/PrivilegeType.CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      7580: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      7583: ifne          7587
      7586: return
      7587: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      7590: dup
      7591: aload_0
      7592: invokevirtual #34                 // Method getObjectId:()I
      7595: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      7598: astore        7
      7600: aload         6
      7602: invokevirtual #616                // Method java/lang/String.isEmpty:()Z
      7605: ifeq          7629
      7608: aload         7
      7610: aload_1
      7611: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7614: aload_0
      7615: invokevirtual #199                // Method getNpcId:()I
      7618: invokedynamic #973,  0            // InvokeDynamic #27:makeConcatWithConstants:(I)Ljava/lang/String;
      7623: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7626: goto          7677
      7629: aload         7
      7631: aload_1
      7632: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7635: aload_0
      7636: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      7639: invokevirtual #560                // Method ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
      7642: ldc_w         #974                // String aden
      7645: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      7648: ifeq          7657
      7651: ldc_w         #782                // String 1
      7654: goto          7659
      7657: ldc           #77                 // String
      7659: invokedynamic #976,  0            // InvokeDynamic #28:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      7664: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7667: aload         7
      7669: ldc_w         #977                // String %trapIndex%
      7672: aload         6
      7674: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      7677: aload         7
      7679: ldc           #137                // String %objectId%
      7681: aload_0
      7682: invokevirtual #34                 // Method getObjectId:()I
      7685: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7688: aload_1
      7689: aload         7
      7691: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7694: goto          7996
      7697: aload         5
      7699: ldc_w         #979                // String traps_choose_upgrade
      7702: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      7705: ifeq          7812
      7708: aload_0
      7709: aload_1
      7710: getstatic     #119                // Field ext/mods/gameserver/enums/PrivilegeType.CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      7713: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      7716: ifne          7720
      7719: return
      7720: aload         6
      7722: astore        7
      7724: aload         4
      7726: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      7729: astore        8
      7731: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      7734: dup
      7735: aload_0
      7736: invokevirtual #34                 // Method getObjectId:()I
      7739: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      7742: astore        9
      7744: aload         9
      7746: aload_1
      7747: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7750: ldc_w         #981                // String html/chamberlain/traps-confirm.htm
      7753: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7756: aload         9
      7758: ldc           #137                // String %objectId%
      7760: aload_0
      7761: invokevirtual #34                 // Method getObjectId:()I
      7764: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7767: aload         9
      7769: ldc_w         #977                // String %trapIndex%
      7772: aload         7
      7774: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      7777: aload         9
      7779: ldc_w         #941                // String %level%
      7782: aload         8
      7784: invokevirtual #191                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      7787: aload         9
      7789: ldc_w         #915                // String %price%
      7792: aload         8
      7794: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      7797: invokestatic  #983                // Method getTrapCost:(I)I
      7800: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7803: aload_1
      7804: aload         9
      7806: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7809: goto          7996
      7812: aload         5
      7814: ldc_w         #987                // String traps_confirm_upgrade
      7817: invokevirtual #81                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      7820: ifeq          7990
      7823: aload_0
      7824: aload_1
      7825: getstatic     #119                // Field ext/mods/gameserver/enums/PrivilegeType.CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      7828: invokevirtual #93                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      7831: ifne          7835
      7834: return
      7835: aload         4
      7837: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      7840: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      7843: istore        7
      7845: iload         7
      7847: invokestatic  #983                // Method getTrapCost:(I)I
      7850: istore        8
      7852: iload         8
      7854: ifne          7858
      7857: return
      7858: aload         6
      7860: invokestatic  #233                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      7863: istore        9
      7865: aload_0
      7866: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      7869: iload         9
      7871: invokevirtual #989                // Method ext/mods/gameserver/model/residence/castle/Castle.getTrapUpgradeLevel:(I)I
      7874: istore        10
      7876: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      7879: dup
      7880: aload_0
      7881: invokevirtual #34                 // Method getObjectId:()I
      7884: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      7887: astore        11
      7889: iload         10
      7891: iload         7
      7893: if_icmplt     7921
      7896: aload         11
      7898: aload_1
      7899: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7902: ldc_w         #992                // String html/chamberlain/traps-already-updated.htm
      7905: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7908: aload         11
      7910: ldc_w         #941                // String %level%
      7913: iload         10
      7915: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7918: goto          7970
      7921: aload_1
      7922: iload         8
      7924: iconst_1
      7925: invokevirtual #638                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
      7928: ifne          7946
      7931: aload         11
      7933: aload_1
      7934: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7937: ldc_w         #922                // String html/chamberlain/not-enough-adena.htm
      7940: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7943: goto          7970
      7946: aload_0
      7947: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
      7950: iload         9
      7952: iload         7
      7954: iconst_1
      7955: invokevirtual #994                // Method ext/mods/gameserver/model/residence/castle/Castle.setTrapUpgrade:(IIZ)V
      7958: aload         11
      7960: aload_1
      7961: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7964: ldc_w         #997                // String html/chamberlain/traps-success.htm
      7967: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7970: aload         11
      7972: ldc           #137                // String %objectId%
      7974: aload_0
      7975: invokevirtual #34                 // Method getObjectId:()I
      7978: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7981: aload_1
      7982: aload         11
      7984: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7987: goto          7996
      7990: aload_0
      7991: aload_1
      7992: aload_2
      7993: invokespecial #999                // Method ext/mods/gameserver/model/actor/instance/Merchant.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      7996: return
      Exception table:
         from    to  target type
          4242  4384  4387   Class java/lang/Exception
      LineNumberTable:
        line 94: 0
        line 95: 6
        line 97: 13
        line 98: 26
        line 99: 37
        line 100: 43
        line 103: 44
        line 105: 51
        line 106: 64
        line 107: 75
        line 108: 81
        line 111: 82
        line 112: 94
        line 114: 101
        line 115: 121
        line 117: 131
        line 118: 142
        line 120: 143
        line 121: 150
        line 123: 160
        line 125: 170
        line 126: 181
        line 128: 182
        line 130: 192
        line 132: 202
        line 133: 213
        line 135: 214
        line 137: 224
        line 139: 234
        line 140: 245
        line 142: 246
        line 144: 256
        line 145: 266
        line 147: 271
        line 148: 284
        line 149: 295
        line 150: 306
        line 151: 312
        line 154: 313
        line 155: 336
        line 156: 339
        line 158: 349
        line 160: 362
        line 161: 372
        line 162: 377
        line 165: 391
        line 166: 410
        line 168: 425
        line 169: 436
        line 170: 442
        line 171: 445
        line 172: 455
        line 175: 463
        line 176: 476
        line 178: 487
        line 179: 497
        line 180: 502
        line 182: 517
        line 184: 526
        line 185: 536
        line 186: 541
        line 188: 556
        line 190: 565
        line 191: 575
        line 192: 580
        line 194: 595
        line 196: 604
        line 197: 615
        line 198: 626
        line 199: 632
        line 201: 635
        line 203: 645
        line 204: 656
        line 206: 657
        line 208: 667
        line 210: 675
        line 211: 685
        line 213: 686
        line 215: 693
        line 217: 703
        line 218: 716
        line 219: 727
        line 220: 736
        line 221: 747
        line 222: 753
        line 223: 756
        line 225: 766
        line 226: 779
        line 227: 790
        line 228: 799
        line 229: 810
        line 230: 816
        line 231: 819
        line 233: 829
        line 234: 842
        line 235: 853
        line 236: 862
        line 237: 873
        line 238: 879
        line 239: 882
        line 241: 892
        line 242: 905
        line 243: 916
        line 245: 925
        line 248: 935
        line 251: 980
        line 252: 985
        line 254: 988
        line 255: 993
        line 257: 996
        line 258: 1001
        line 260: 1004
        line 261: 1009
        line 263: 1012
        line 267: 1017
        line 268: 1039
        line 269: 1054
        line 270: 1068
        line 271: 1079
        line 272: 1085
        line 273: 1088
        line 275: 1099
        line 276: 1112
        line 277: 1123
        line 279: 1133
        line 282: 1143
        line 285: 1180
        line 286: 1185
        line 288: 1188
        line 289: 1193
        line 291: 1196
        line 292: 1201
        line 294: 1204
        line 297: 1209
        line 298: 1231
        line 299: 1246
        line 300: 1260
        line 301: 1271
        line 302: 1277
        line 303: 1280
        line 305: 1291
        line 306: 1304
        line 307: 1315
        line 309: 1325
        line 312: 1335
        line 315: 1372
        line 316: 1377
        line 318: 1380
        line 319: 1385
        line 321: 1388
        line 322: 1393
        line 324: 1396
        line 327: 1401
        line 328: 1423
        line 329: 1438
        line 330: 1452
        line 331: 1463
        line 332: 1469
        line 333: 1472
        line 335: 1483
        line 336: 1490
        line 338: 1497
        line 340: 1510
        line 341: 1520
        line 343: 1535
        line 344: 1547
        line 345: 1562
        line 346: 1573
        line 347: 1579
        line 350: 1580
        line 353: 1592
        line 356: 1644
        line 357: 1647
        line 358: 1659
        line 360: 1662
        line 361: 1667
        line 363: 1670
        line 364: 1675
        line 366: 1678
        line 367: 1683
        line 369: 1686
        line 370: 1691
        line 372: 1694
        line 376: 1699
        line 377: 1734
        line 379: 1746
        line 380: 1757
        line 381: 1763
        line 382: 1766
        line 384: 1777
        line 385: 1784
        line 387: 1791
        line 389: 1804
        line 390: 1814
        line 392: 1829
        line 393: 1841
        line 394: 1856
        line 395: 1867
        line 396: 1873
        line 399: 1874
        line 402: 1886
        line 405: 1932
        line 406: 1935
        line 407: 1947
        line 409: 1950
        line 410: 1955
        line 412: 1958
        line 413: 1963
        line 415: 1966
        line 416: 1971
        line 418: 1974
        line 421: 1979
        line 422: 2014
        line 424: 2026
        line 425: 2037
        line 426: 2043
        line 427: 2046
        line 429: 2057
        line 430: 2064
        line 432: 2071
        line 434: 2084
        line 435: 2094
        line 437: 2109
        line 438: 2121
        line 439: 2136
        line 440: 2147
        line 441: 2153
        line 444: 2154
        line 447: 2166
        line 450: 2212
        line 451: 2215
        line 452: 2227
        line 454: 2230
        line 455: 2235
        line 457: 2238
        line 458: 2243
        line 460: 2246
        line 461: 2251
        line 463: 2254
        line 466: 2259
        line 467: 2294
        line 469: 2306
        line 470: 2317
        line 471: 2323
        line 475: 2326
        line 476: 2339
        line 477: 2351
        line 478: 2356
        line 479: 2361
        line 481: 2366
        line 482: 2376
        line 484: 2381
        line 485: 2411
        line 486: 2445
        line 490: 2463
        line 491: 2474
        line 492: 2485
        line 495: 2495
        line 496: 2505
        line 498: 2510
        line 499: 2540
        line 500: 2574
        line 504: 2592
        line 505: 2603
        line 506: 2614
        line 509: 2624
        line 510: 2634
        line 512: 2639
        line 513: 2669
        line 514: 2709
        line 518: 2727
        line 519: 2738
        line 520: 2749
        line 523: 2759
        line 524: 2770
        line 525: 2776
        line 527: 2779
        line 529: 2790
        line 531: 2798
        line 532: 2808
        line 534: 2809
        line 536: 2816
        line 538: 2827
        line 539: 2840
        line 540: 2851
        line 541: 2861
        line 542: 2872
        line 543: 2878
        line 544: 2881
        line 546: 2892
        line 547: 2905
        line 548: 2916
        line 549: 2926
        line 550: 2936
        line 551: 2947
        line 552: 2953
        line 553: 2956
        line 555: 2967
        line 556: 2980
        line 557: 2991
        line 559: 3001
        line 562: 3011
        line 565: 3040
        line 566: 3045
        line 568: 3048
        line 569: 3053
        line 571: 3056
        line 572: 3061
        line 574: 3064
        line 577: 3069
        line 578: 3091
        line 579: 3102
        line 580: 3116
        line 581: 3127
        line 582: 3133
        line 583: 3136
        line 585: 3147
        line 586: 3160
        line 587: 3171
        line 589: 3181
        line 592: 3191
        line 595: 3212
        line 596: 3217
        line 598: 3220
        line 602: 3225
        line 603: 3247
        line 604: 3262
        line 605: 3276
        line 606: 3287
        line 607: 3293
        line 608: 3296
        line 610: 3306
        line 611: 3313
        line 613: 3320
        line 615: 3333
        line 616: 3343
        line 618: 3358
        line 619: 3370
        line 620: 3385
        line 621: 3396
        line 622: 3402
        line 625: 3403
        line 628: 3415
        line 631: 3444
        line 632: 3447
        line 633: 3459
        line 635: 3462
        line 636: 3467
        line 638: 3470
        line 641: 3475
        line 642: 3510
        line 644: 3522
        line 645: 3533
        line 646: 3539
        line 647: 3542
        line 649: 3552
        line 650: 3559
        line 652: 3566
        line 654: 3579
        line 655: 3589
        line 657: 3604
        line 658: 3616
        line 659: 3631
        line 660: 3642
        line 661: 3648
        line 664: 3649
        line 667: 3661
        line 670: 3692
        line 671: 3695
        line 672: 3707
        line 674: 3710
        line 675: 3715
        line 677: 3718
        line 678: 3723
        line 680: 3726
        line 681: 3731
        line 683: 3734
        line 686: 3739
        line 687: 3768
        line 689: 3780
        line 690: 3791
        line 691: 3797
        line 695: 3800
        line 696: 3813
        line 698: 3825
        line 699: 3830
        line 701: 3835
        line 702: 3845
        line 704: 3850
        line 705: 3880
        line 706: 3914
        line 710: 3932
        line 711: 3943
        line 712: 3954
        line 715: 3964
        line 716: 3974
        line 718: 3979
        line 719: 4009
        line 720: 4043
        line 724: 4061
        line 725: 4072
        line 726: 4083
        line 729: 4093
        line 730: 4104
        line 731: 4110
        line 733: 4113
        line 734: 4123
        line 737: 4131
        line 738: 4144
        line 739: 4156
        line 740: 4167
        line 741: 4173
        line 743: 4176
        line 745: 4186
        line 746: 4197
        line 748: 4198
        line 749: 4208
        line 750: 4221
        line 752: 4222
        line 754: 4229
        line 755: 4236
        line 758: 4237
        line 762: 4242
        line 763: 4249
        line 765: 4271
        line 767: 4277
        line 768: 4289
        line 769: 4294
        line 771: 4302
        line 772: 4315
        line 773: 4334
        line 774: 4349
        line 775: 4360
        line 776: 4366
        line 778: 4369
        line 783: 4384
        line 780: 4387
        line 782: 4389
        line 784: 4396
        line 785: 4399
        line 787: 4410
        line 788: 4421
        line 790: 4422
        line 791: 4432
        line 792: 4445
        line 794: 4446
        line 795: 4459
        line 796: 4478
        line 797: 4493
        line 798: 4504
        line 799: 4510
        line 800: 4513
        line 802: 4524
        line 803: 4535
        line 805: 4536
        line 807: 4547
        line 809: 4558
        line 810: 4569
        line 812: 4570
        line 814: 4588
        line 816: 4599
        line 817: 4606
        line 820: 4616
        line 822: 4631
        line 823: 4644
        line 824: 4656
        line 825: 4667
        line 826: 4680
        line 827: 4693
        line 828: 4708
        line 830: 4725
        line 833: 4768
        line 834: 4779
        line 837: 4782
        line 838: 4793
        line 841: 4796
        line 845: 4807
        line 848: 4848
        line 849: 4859
        line 852: 4862
        line 853: 4873
        line 856: 4876
        line 860: 4887
        line 863: 4928
        line 864: 4939
        line 867: 4942
        line 868: 4953
        line 871: 4956
        line 874: 4967
        line 875: 4973
        line 877: 4976
        line 879: 4987
        line 880: 4998
        line 882: 4999
        line 883: 5007
        line 885: 5008
        line 887: 5026
        line 889: 5037
        line 890: 5048
        line 892: 5049
        line 893: 5054
        line 895: 5057
        line 896: 5065
        line 898: 5075
        line 900: 5080
        line 902: 5091
        line 903: 5119
        line 905: 5134
        line 907: 5145
        line 908: 5159
        line 909: 5167
        line 910: 5182
        line 913: 5189
        line 914: 5202
        line 915: 5213
        line 916: 5224
        line 917: 5242
        line 918: 5260
        line 919: 5278
        line 920: 5292
        line 921: 5298
        line 922: 5301
        line 924: 5312
        line 925: 5323
        line 927: 5324
        line 929: 5332
        line 930: 5345
        line 931: 5363
        line 932: 5374
        line 933: 5380
        line 936: 5381
        line 937: 5397
        line 939: 5405
        line 940: 5410
        line 942: 5429
        line 945: 5448
        line 946: 5461
        line 947: 5484
        line 948: 5495
        line 950: 5501
        line 951: 5504
        line 953: 5515
        line 955: 5528
        line 957: 5539
        line 958: 5551
        line 959: 5566
        line 960: 5581
        line 961: 5592
        line 962: 5598
        line 965: 5599
        line 966: 5611
        line 967: 5626
        line 968: 5641
        line 969: 5652
        line 970: 5663
        line 971: 5669
        line 972: 5672
        line 974: 5683
        line 976: 5696
        line 977: 5701
        line 979: 5720
        line 981: 5732
        line 982: 5744
        line 983: 5755
        line 984: 5765
        line 985: 5771
        line 988: 5772
        line 990: 5782
        line 991: 5794
        line 992: 5809
        line 993: 5820
        line 994: 5826
        line 995: 5829
        line 997: 5840
        line 998: 5851
        line 1000: 5852
        line 1001: 5856
        line 1002: 5862
        line 1005: 5870
        line 1006: 5877
        line 1009: 5904
        line 1010: 5909
        line 1013: 5912
        line 1014: 5924
        line 1017: 5927
        line 1022: 5932
        line 1024: 5940
        line 1025: 5953
        line 1026: 5964
        line 1027: 5975
        line 1029: 5981
        line 1030: 5984
        line 1032: 5994
        line 1033: 6005
        line 1035: 6006
        line 1036: 6011
        line 1038: 6019
        line 1039: 6026
        line 1040: 6033
        line 1043: 6034
        line 1044: 6049
        line 1046: 6063
        line 1047: 6081
        line 1048: 6099
        line 1050: 6120
        line 1052: 6140
        line 1055: 6180
        line 1056: 6196
        line 1059: 6199
        line 1060: 6215
        line 1063: 6218
        line 1064: 6230
        line 1067: 6233
        line 1068: 6241
        line 1070: 6251
        line 1071: 6264
        line 1074: 6267
        line 1075: 6275
        line 1077: 6285
        line 1080: 6298
        line 1081: 6301
        line 1083: 6312
        line 1084: 6323
        line 1086: 6324
        line 1087: 6344
        line 1088: 6355
        line 1089: 6368
        line 1091: 6379
        line 1093: 6390
        line 1095: 6401
        line 1096: 6412
        line 1098: 6413
        line 1101: 6436
        line 1102: 6448
        line 1108: 6451
        line 1110: 6460
        line 1112: 6479
        line 1113: 6490
        line 1114: 6498
        line 1117: 6499
        line 1119: 6510
        line 1121: 6521
        line 1123: 6534
        line 1125: 6541
        line 1127: 6554
        line 1129: 6564
        line 1130: 6576
        line 1131: 6588
        line 1134: 6606
        line 1137: 6621
        line 1139: 6632
        line 1140: 6638
        line 1141: 6641
        line 1143: 6652
        line 1144: 6663
        line 1146: 6664
        line 1148: 6677
        line 1150: 6686
        line 1151: 6702
        line 1152: 6717
        line 1153: 6727
        line 1156: 6742
        line 1157: 6754
        line 1158: 6769
        line 1159: 6779
        line 1163: 6793
        line 1165: 6805
        line 1166: 6816
        line 1167: 6822
        line 1168: 6825
        line 1170: 6836
        line 1171: 6847
        line 1173: 6848
        line 1175: 6861
        line 1177: 6870
        line 1178: 6886
        line 1179: 6901
        line 1180: 6911
        line 1181: 6926
        line 1183: 6937
        line 1185: 6948
        line 1187: 6966
        line 1188: 6978
        line 1189: 6993
        line 1190: 7003
        line 1193: 7017
        line 1196: 7032
        line 1198: 7044
        line 1199: 7055
        line 1200: 7061
        line 1201: 7064
        line 1203: 7075
        line 1204: 7086
        line 1206: 7087
        line 1208: 7098
        line 1210: 7109
        line 1211: 7120
        line 1213: 7121
        line 1214: 7134
        line 1215: 7142
        line 1218: 7163
        line 1219: 7175
        line 1220: 7185
        line 1222: 7198
        line 1223: 7209
        line 1224: 7215
        line 1225: 7218
        line 1227: 7229
        line 1228: 7240
        line 1230: 7241
        line 1231: 7245
        line 1232: 7252
        line 1234: 7259
        line 1235: 7272
        line 1236: 7284
        line 1237: 7295
        line 1238: 7305
        line 1239: 7315
        line 1240: 7325
        line 1241: 7346
        line 1242: 7352
        line 1243: 7355
        line 1245: 7366
        line 1246: 7377
        line 1248: 7378
        line 1249: 7388
        line 1250: 7398
        line 1252: 7407
        line 1253: 7412
        line 1255: 7413
        line 1256: 7420
        line 1257: 7431
        line 1258: 7436
        line 1260: 7437
        line 1262: 7447
        line 1264: 7460
        line 1266: 7467
        line 1267: 7479
        line 1269: 7495
        line 1270: 7505
        line 1273: 7520
        line 1275: 7532
        line 1277: 7544
        line 1278: 7555
        line 1279: 7561
        line 1280: 7564
        line 1282: 7575
        line 1283: 7586
        line 1285: 7587
        line 1286: 7600
        line 1287: 7608
        line 1290: 7629
        line 1291: 7667
        line 1293: 7677
        line 1294: 7688
        line 1295: 7694
        line 1296: 7697
        line 1298: 7708
        line 1299: 7719
        line 1301: 7720
        line 1302: 7724
        line 1304: 7731
        line 1305: 7744
        line 1306: 7756
        line 1307: 7767
        line 1308: 7777
        line 1309: 7787
        line 1310: 7803
        line 1311: 7809
        line 1312: 7812
        line 1314: 7823
        line 1315: 7834
        line 1317: 7835
        line 1318: 7845
        line 1320: 7852
        line 1321: 7857
        line 1323: 7858
        line 1324: 7865
        line 1326: 7876
        line 1328: 7889
        line 1330: 7896
        line 1331: 7908
        line 1333: 7921
        line 1334: 7931
        line 1337: 7946
        line 1339: 7958
        line 1341: 7970
        line 1342: 7981
        line 1343: 7987
        line 1345: 7990
        line 1346: 7996
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26      18     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           64      18     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          284      29     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          266      70     7   chf   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
          362      80     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          372      70     8   chf   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
          476     156     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          497     135     8 chfExp   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
          536      96     9 chfHp   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
          575      57    10 chfMp   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
          716      37     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          779      37     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          842      37     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          985       3     9  cost   I
          993       3     9  cost   I
         1001       3     9  cost   I
         1009       3     9  cost   I
          905     180     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          935     150     8 percent   I
         1017      68     9  cost   I
         1185       3     9  cost   I
         1193       3     9  cost   I
         1201       3     9  cost   I
         1112     165     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1143     134     8 percent   I
         1209      68     9  cost   I
         1377       3     9  cost   I
         1385       3     9  cost   I
         1393       3     9  cost   I
         1304     165     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1335     134     8 percent   I
         1401      68     9  cost   I
         1647      15    10   fee   I
         1667       3    10   fee   I
         1675       3    10   fee   I
         1683       3    10   fee   I
         1691       3    10   fee   I
         1497     266     7 percent   I
         1510     253     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1520     243     9   chf   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
         1699      64    10   fee   I
         1935      15    10   fee   I
         1955       3    10   fee   I
         1963       3    10   fee   I
         1971       3    10   fee   I
         1791     252     7 percent   I
         1804     239     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1814     229     9   chf   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
         1979      64    10   fee   I
         2215      15    10   fee   I
         2235       3    10   fee   I
         2243       3    10   fee   I
         2251       3    10   fee   I
         2071     252     7 percent   I
         2084     239     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         2094     229     9   chf   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
         2259      64    10   fee   I
         2339     437     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         2356     420     8    hp   Ljava/lang/String;
         2361     415     9   exp   Ljava/lang/String;
         2366     410    10    mp   Ljava/lang/String;
         2376     400    11 chfHp   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
         2505     271    12 chfExp   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
         2634     142    13 chfMp   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
         2840      38     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         2905      48     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         3045       3     9  cost   I
         3053       3     9  cost   I
         3061       3     9  cost   I
         2980     153     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         3011     122     8 stage   I
         3069      64     9  cost   I
         3217       3     9  cost   I
         3160     133     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         3191     102     8 stage   I
         3225      68     9  cost   I
         3447      15    10   fee   I
         3467       3    10   fee   I
         3320     219     7   lvl   I
         3333     206     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         3343     196     9   chf   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
         3475      64    10   fee   I
         3695      15    10   fee   I
         3715       3    10   fee   I
         3723       3    10   fee   I
         3731       3    10   fee   I
         3566     231     7   lvl   I
         3579     218     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         3589     208     9   chf   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
         3739      58    10   fee   I
         3813     297     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         3830     280     8  tele   Ljava/lang/String;
         3835     275     9 support   Ljava/lang/String;
         3845     265    10 chfTel   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
         3974     136    11 chfSup   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
         4144      29     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         4289      77    10 skill   Lext/mods/gameserver/skills/L2Skill;
         4315      51    11  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         4249     135     8    id   I
         4271     113     9   lvl   I
         4389       7     8     e   Ljava/lang/Exception;
         4208     188     7   chf   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
         4432      78     7   chf   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
         4459      51     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         4631     342     7  clan   Lext/mods/gameserver/model/pledge/Clan;
         4644     329     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         5054     244     7 filename   Ljava/lang/String;
         5057     241     8 amount   I
         5202      96     9  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         5345      36     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         5397     104     7  open   Z
         5461      40     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         5528     141     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         5696     130     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         5701     125     8 taxLimit   I
         5720     106     9 taxRate   I
         5877      55     8   cmd   I
         5953      28     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         5856     125     7 filename   Ljava/lang/String;
         6011     287     7 manor   Lext/mods/gameserver/data/manager/CastleManorManager;
         6049     249     8 params   Ljava/lang/String;
         6063     235     9   str   Ljava/util/StringTokenizer;
         6081     217    10   ask   I
         6099     199    11 state   I
         6120     178    12  time   Z
         6140     158    13 castleId   I
         6534     104     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         6677     145     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         6861     200     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         7134      81     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         7245     107     7    id   Ljava/lang/String;
         7252     100     8  type   Ljava/lang/String;
         7259      93     9 level   Ljava/lang/String;
         7272      80    10  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         7388     173     7  type   I
         7398     163     8 level   I
         7407     154     9 price   I
         7420     141    10    id   I
         7431     130    11  door   Lext/mods/gameserver/model/actor/instance/Door;
         7447     114    12 currentHpRatio   I
         7460     101    13  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         7600      94     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         7724      85     7 trapIndex   Ljava/lang/String;
         7731      78     8 level   Ljava/lang/String;
         7744      65     9  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         7845     142     7 level   I
         7852     135     8 price   I
         7865     122     9 trapIndex   I
         7876     111    10 currentLevel   I
         7889      98    11  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0    7997     0  this   Lext/mods/gameserver/model/actor/instance/CastleChamberlain;
            0    7997     1 player   Lext/mods/gameserver/model/actor/Player;
            0    7997     2 command   Ljava/lang/String;
            6    7991     3 condition   Lext/mods/gameserver/enums/actors/NpcTalkCond;
           94    7903     4    st   Ljava/util/StringTokenizer;
          101    7896     5 actualCommand   Ljava/lang/String;
          121    7876     6   val   Ljava/lang/String;
      StackMapTable: number_of_entries = 268
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/enums/actors/NpcTalkCond ]
        frame_type = 37 /* same */
        frame_type = 253 /* append */
          offset_delta = 34
          locals = [ class java/util/StringTokenizer, class java/lang/String ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/String ]
        frame_type = 16 /* same */
        frame_type = 21 /* same */
        frame_type = 9 /* same */
        frame_type = 21 /* same */
        frame_type = 9 /* same */
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 66
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
          stack = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
          stack = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/TeleportType ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 253 /* append */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 33 /* same */
        frame_type = 249 /* chop */
          offset_delta = 19
        frame_type = 17 /* same */
        frame_type = 253 /* append */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 21 /* same */
        frame_type = 28 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 69
        frame_type = 62 /* same */
        frame_type = 62 /* same */
        frame_type = 253 /* append */
          offset_delta = 97
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 70
        frame_type = 253 /* append */
          offset_delta = 91
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 70
        frame_type = 253 /* append */
          offset_delta = 91
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 70
        frame_type = 254 /* append */
          offset_delta = 107
          locals = [ int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 63 /* same */
        frame_type = 17 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction, int ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/actor/Player, int, int, int, long ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction, int ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/actor/Player, int, int, int, long, int ]
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 107
          locals = [ int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 57 /* same */
        frame_type = 17 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction, int ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/actor/Player, int, int, int, long ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction, int ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/actor/Player, int, int, int, long, int ]
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 107
          locals = [ int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 57 /* same */
        frame_type = 17 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction, int ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/actor/Player, int, int, int, long ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction, int ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/actor/Player, int, int, int, long, int ]
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 136
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
          stack = []
        frame_type = 31 /* same */
        frame_type = 252 /* append */
          offset_delta = 96
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 31 /* same */
        frame_type = 252 /* append */
          offset_delta = 102
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 31 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 29 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 71
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 253 /* append */
          offset_delta = 83
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 66
        frame_type = 253 /* append */
          offset_delta = 75
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 70
        frame_type = 254 /* append */
          offset_delta = 106
          locals = [ int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 40 /* same */
        frame_type = 17 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction, int ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/actor/Player, int, int, int, long ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction, int ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/actor/Player, int, int, int, long, int ]
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 106
          locals = [ int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 42 /* same */
        frame_type = 17 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction, int ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/actor/Player, int, int, int, long ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction, int ]
          stack = [ class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/model/actor/Player, int, int, int, long, int ]
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 131
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
          stack = []
        frame_type = 31 /* same */
        frame_type = 252 /* append */
          offset_delta = 96
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 31 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 17 /* same */
        frame_type = 44 /* same */
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 0 /* same */
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 32
          locals = [ int, class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 250 /* chop */
          offset_delta = 66
        frame_type = 249 /* chop */
          offset_delta = 14
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 22 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction ]
        frame_type = 0 /* same */
        frame_type = 250 /* chop */
          offset_delta = 66
        frame_type = 22 /* same */
        frame_type = 10 /* same */
        frame_type = 22 /* same */
        frame_type = 17 /* same */
        frame_type = 27 /* same */
        frame_type = 253 /* append */
          offset_delta = 151
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 10 /* same */
        frame_type = 40 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 10 /* same */
        frame_type = 40 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 10 /* same */
        frame_type = 249 /* chop */
          offset_delta = 8
        frame_type = 22 /* same */
        frame_type = 8 /* same */
        frame_type = 17 /* same */
        frame_type = 22 /* same */
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ class java/lang/String, int ]
        frame_type = 58 /* same */
        frame_type = 32 /* same */
        frame_type = 21 /* same */
        frame_type = 249 /* chop */
          offset_delta = 111
        frame_type = 22 /* same */
        frame_type = 56 /* same */
        frame_type = 12 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ int ]
        frame_type = 31 /* same */
        frame_type = 18 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale, class java/lang/String ]
        frame_type = 249 /* chop */
          offset_delta = 22
        frame_type = 252 /* append */
          offset_delta = 94
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 250 /* chop */
          offset_delta = 72
        frame_type = 253 /* append */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ int ]
        frame_type = 39 /* same */
        frame_type = 248 /* chop */
          offset_delta = 56
        frame_type = 22 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ int ]
        frame_type = 7 /* same */
        frame_type = 14 /* same */
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 250 /* chop */
          offset_delta = 48
        frame_type = 2 /* same */
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/data/manager/CastleManorManager ]
        frame_type = 255 /* full_frame */
          offset_delta = 101
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/data/manager/CastleManorManager, class java/lang/String, class java/util/StringTokenizer, int, int, int ]
          stack = []
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ int ]
        frame_type = 18 /* same */
        frame_type = 18 /* same */
        frame_type = 14 /* same */
        frame_type = 17 /* same */
        frame_type = 15 /* same */
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 22 /* same */
        frame_type = 30 /* same */
        frame_type = 23 /* same */
        frame_type = 10 /* same */
        frame_type = 22 /* same */
        frame_type = 22 /* same */
        frame_type = 14 /* same */
        frame_type = 47 /* same */
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 95
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 14 /* same */
        frame_type = 10 /* same */
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 22 /* same */
        frame_type = 252 /* append */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 24 /* same */
        frame_type = 50 /* same */
        frame_type = 11 /* same */
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 22 /* same */
        frame_type = 252 /* append */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 24 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 90
        frame_type = 14 /* same */
        frame_type = 11 /* same */
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 22 /* same */
        frame_type = 10 /* same */
        frame_type = 22 /* same */
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 34 /* same */
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 22 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 113
        frame_type = 22 /* same */
        frame_type = 254 /* append */
          offset_delta = 34
          locals = [ int, int, int ]
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ int, class ext/mods/gameserver/model/actor/instance/Door ]
        frame_type = 253 /* append */
          offset_delta = 57
          locals = [ int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 24 /* same */
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 22 /* same */
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale, class java/lang/String ]
        frame_type = 17 /* same */
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 22 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 91
        frame_type = 22 /* same */
        frame_type = 253 /* append */
          offset_delta = 22
          locals = [ int, int ]
        frame_type = 254 /* append */
          offset_delta = 62
          locals = [ int, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 24 /* same */
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleChamberlain, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 5 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: getstatic     #751                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
         4: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
         7: new           #32                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        10: dup
        11: aload_0
        12: invokevirtual #34                 // Method getObjectId:()I
        15: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        18: astore_2
        19: getstatic     #1002               // Field ext/mods/gameserver/model/actor/instance/CastleChamberlain$1.$SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
        22: aload_0
        23: aload_1
        24: invokevirtual #22                 // Method getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
        27: invokevirtual #1005               // Method ext/mods/gameserver/enums/actors/NpcTalkCond.ordinal:()I
        30: iaload
        31: lookupswitch  { // 2

                       1: 56

                       2: 70
                 default: 83
            }
        56: aload_2
        57: aload_1
        58: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        61: ldc_w         #733                // String html/chamberlain/no.htm
        64: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        67: goto          94
        70: aload_2
        71: aload_1
        72: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        75: ldc           #60                 // String html/chamberlain/busy.htm
        77: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        80: goto          94
        83: aload_2
        84: aload_1
        85: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        88: ldc_w         #1006               // String html/chamberlain/chamberlain.htm
        91: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        94: aload_2
        95: ldc           #137                // String %objectId%
        97: aload_0
        98: invokevirtual #34                 // Method getObjectId:()I
       101: invokevirtual #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       104: aload_1
       105: aload_2
       106: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       109: return
      LineNumberTable:
        line 1351: 0
        line 1353: 7
        line 1355: 19
        line 1358: 56
        line 1359: 67
        line 1362: 70
        line 1363: 80
        line 1366: 83
        line 1370: 94
        line 1371: 104
        line 1372: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     110     0  this   Lext/mods/gameserver/model/actor/instance/CastleChamberlain;
            0     110     1 player   Lext/mods/gameserver/model/actor/Player;
           19      91     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 13 /* same */
        frame_type = 12 /* same */
        frame_type = 10 /* same */

  protected ext.mods.gameserver.enums.actors.NpcTalkCond getNpcTalkCond(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
         4: ifnull        60
         7: aload_1
         8: invokevirtual #1008               // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        11: ifnull        60
        14: aload_0
        15: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        18: invokevirtual #818                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        21: invokevirtual #1011               // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        24: ifeq          31
        27: getstatic     #57                 // Field ext/mods/gameserver/enums/actors/NpcTalkCond.UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        30: areturn
        31: aload_0
        32: invokevirtual #97                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        35: invokevirtual #206                // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        38: aload_1
        39: invokevirtual #1014               // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        42: if_icmpne     60
        45: aload_1
        46: invokevirtual #1017               // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        49: ifeq          56
        52: getstatic     #862                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        55: areturn
        56: getstatic     #532                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.CLAN_MEMBER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        59: areturn
        60: getstatic     #26                 // Field ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        63: areturn
      LineNumberTable:
        line 1377: 0
        line 1379: 14
        line 1380: 27
        line 1382: 31
        line 1384: 45
        line 1385: 52
        line 1387: 56
        line 1390: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      64     0  this   Lext/mods/gameserver/model/actor/instance/CastleChamberlain;
            0      64     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 31 /* same */
        frame_type = 24 /* same */
        frame_type = 3 /* same */

  public ext.mods.gameserver.model.actor.ai.type.NpcAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #500                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI;
         4: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/CastleChamberlain;

  public ext.mods.gameserver.model.actor.ai.type.CreatureAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #500                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/CastleManagerNpcAI;
         4: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/CastleChamberlain;
}
SourceFile: "CastleChamberlain.java"
NestMembers:
  ext/mods/gameserver/model/actor/instance/CastleChamberlain$1
BootstrapMethods:
  0: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1126 html/chamberlain/support\u0001.htm
  1: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1128 \u0001</font> adenas / \u0001 day</font>)
  2: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1130 Provides additional HP recovery for clan members in the castle.<font color=\"00FFFF\">\u0001%</font>
  3: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1132 recovery hp \u0001
  4: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1134 Provides additional MP recovery for clan members in the castle.<font color=\"00FFFF\">\u0001%</font>
  5: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1136 recovery mp \u0001
  6: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1138 Restores the Exp of any clan member who is resurrected in the castle.<font color=\"00FFFF\">\u0001%</font>
  7: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1140 recovery exp \u0001
  8: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1142 \u0001%
  9: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1144 \u0001%</font> (<font color=\"FFAABB\">\u0001</font> adenas /\u0001 day
  10: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1146 Withdraw the fee for the next time at \u0001
  11: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1148 [<a action=\"bypass -h npc_%objectId%_manage recovery hp_cancel\">Deactivate</a>]\u0001
  12: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1150 \u0001%</font> (<font color=\"FFAABB\">\u0001</font> adenas /\u0001 day)
  13: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1152 [<a action=\"bypass -h npc_%objectId%_manage recovery exp_cancel\">Deactivate</a>]\u0001
  14: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1154 [<a action=\"bypass -h npc_%objectId%_manage recovery mp_cancel\">Deactivate</a>]\u0001
  15: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1156 other support \u0001
  16: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1158 Teleports clan members in a castle to the target <font color=\"00FFFF\">Stage \u0001</font> staging area
  17: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1160 other tele \u0001
  18: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1162 Stage \u0001
  19: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1164 Stage \u0001</font> (<font color=\"FFAABB\">\u0001</font> adenas /\u0001 day)
  20: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1166 [<a action=\"bypass -h npc_%objectId%_manage other tele_cancel\">Deactivate</a>]\u0001
  21: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1168 Stage \u0001</font> (<font color=\"FFAABB\">\u0001</font> adenas /\u0001 Day)
  22: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1170 [<a action=\"bypass -h npc_%objectId%_manage other support_cancel\">Deactivate</a>]\u0001
  23: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1172 \u00011
  24: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1174 html/chamberlain/\u0001-d.htm
  25: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1176 html/chamberlain/manor/manor_help00\u0001.htm
  26: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1178 html/chamberlain/\u0001-gu.htm
  27: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1180 html/chamberlain/\u0001-tu.htm
  28: #1184 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1182 html/chamberlain/traps-update\u0001.htm
InnerClasses:
  public #1191= #144 of #102;             // CastleFunction=class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction of class ext/mods/gameserver/model/residence/castle/Castle
  static #576;                            // class ext/mods/gameserver/model/actor/instance/CastleChamberlain$1
  public static final #1196= #1192 of #1194; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
