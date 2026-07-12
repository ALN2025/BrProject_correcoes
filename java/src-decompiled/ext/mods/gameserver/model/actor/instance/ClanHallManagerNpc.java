// Bytecode for: ext.mods.gameserver.model.actor.instance.ClanHallManagerNpc
// File: ext\mods\gameserver\model\actor\instance\ClanHallManagerNpc.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.class
  Last modified 9 de jul de 2026; size 37465 bytes
  MD5 checksum 38271e32821d5a70e9d06930bf446239
  Compiled from "ClanHallManagerNpc.java"
public class ext.mods.gameserver.model.actor.instance.ClanHallManagerNpc extends ext.mods.gameserver.model.actor.instance.Merchant
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Merchant
  interfaces: 0, fields: 26, methods: 12, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Merchant."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Merchant
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Merchant
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc._ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
    #9 = NameAndType        #11:#12       // _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
   #11 = Utf8               _ai
   #12 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI
   #14 = Utf8               ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI
   #15 = Methodref          #13.#16       // ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI."<init>":(Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;)V
   #16 = NameAndType        #5:#17        // "<init>":(Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;)V
   #17 = Utf8               (Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;)V
   #18 = Methodref          #8.#19        // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #19 = NameAndType        #20:#21       // getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #20 = Utf8               getNpcTalkCond
   #21 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #22 = Fieldref           #23.#24       // ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #23 = Class              #25           // ext/mods/gameserver/enums/actors/NpcTalkCond
   #24 = NameAndType        #26:#27       // OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #25 = Utf8               ext/mods/gameserver/enums/actors/NpcTalkCond
   #26 = Utf8               OWNER
   #27 = Utf8               Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #28 = Class              #29           // java/util/StringTokenizer
   #29 = Utf8               java/util/StringTokenizer
   #30 = String             #31           //
   #31 = Utf8
   #32 = Methodref          #28.#33       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #33 = NameAndType        #5:#34        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #34 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #35 = Methodref          #28.#36       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #36 = NameAndType        #37:#38       // nextToken:()Ljava/lang/String;
   #37 = Utf8               nextToken
   #38 = Utf8               ()Ljava/lang/String;
   #39 = Methodref          #28.#40       // java/util/StringTokenizer.hasMoreTokens:()Z
   #40 = NameAndType        #41:#42       // hasMoreTokens:()Z
   #41 = Utf8               hasMoreTokens
   #42 = Utf8               ()Z
   #43 = String             #44           //
   #44 = Utf8
   #45 = String             #46           // banish_foreigner
   #46 = Utf8               banish_foreigner
   #47 = Methodref          #48.#49       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #48 = Class              #50           // java/lang/String
   #49 = NameAndType        #51:#52       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #50 = Utf8               java/lang/String
   #51 = Utf8               equalsIgnoreCase
   #52 = Utf8               (Ljava/lang/String;)Z
   #53 = Fieldref           #54.#55       // ext/mods/gameserver/enums/PrivilegeType.CHP_RIGHT_TO_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
   #54 = Class              #56           // ext/mods/gameserver/enums/PrivilegeType
   #55 = NameAndType        #57:#58       // CHP_RIGHT_TO_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
   #56 = Utf8               ext/mods/gameserver/enums/PrivilegeType
   #57 = Utf8               CHP_RIGHT_TO_DISMISS
   #58 = Utf8               Lext/mods/gameserver/enums/PrivilegeType;
   #59 = Methodref          #8.#60        // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
   #60 = NameAndType        #61:#62       // validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
   #61 = Utf8               validatePrivileges
   #62 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
   #63 = Class              #64           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #64 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #65 = Methodref          #8.#66        // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getObjectId:()I
   #66 = NameAndType        #67:#68       // getObjectId:()I
   #67 = Utf8               getObjectId
   #68 = Utf8               ()I
   #69 = Methodref          #63.#70       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #70 = NameAndType        #5:#71        // "<init>":(I)V
   #71 = Utf8               (I)V
   #72 = String             #73           // list
   #73 = Utf8               list
   #74 = Methodref          #75.#76       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #75 = Class              #77           // ext/mods/gameserver/model/actor/Player
   #76 = NameAndType        #78:#79       // getLocale:()Ljava/util/Locale;
   #77 = Utf8               ext/mods/gameserver/model/actor/Player
   #78 = Utf8               getLocale
   #79 = Utf8               ()Ljava/util/Locale;
   #80 = String             #81           // html/clanHallManager/banish-list.htm
   #81 = Utf8               html/clanHallManager/banish-list.htm
   #82 = Methodref          #63.#83       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #83 = NameAndType        #84:#85       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #84 = Utf8               setFile
   #85 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #86 = String             #87           // banish
   #87 = Utf8               banish
   #88 = Methodref          #8.#89        // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #89 = NameAndType        #90:#91       // getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #90 = Utf8               getClanHall
   #91 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #92 = Methodref          #93.#94       // ext/mods/gameserver/model/residence/clanhall/ClanHall.banishForeigners:()V
   #93 = Class              #95           // ext/mods/gameserver/model/residence/clanhall/ClanHall
   #94 = NameAndType        #96:#97       // banishForeigners:()V
   #95 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
   #96 = Utf8               banishForeigners
   #97 = Utf8               ()V
   #98 = String             #99           // html/clanHallManager/banish.htm
   #99 = Utf8               html/clanHallManager/banish.htm
  #100 = String             #101          // %objectId%
  #101 = Utf8               %objectId%
  #102 = Methodref          #63.#103      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #103 = NameAndType        #104:#105     // replace:(Ljava/lang/String;I)V
  #104 = Utf8               replace
  #105 = Utf8               (Ljava/lang/String;I)V
  #106 = Methodref          #75.#107      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #107 = NameAndType        #108:#109     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #108 = Utf8               sendPacket
  #109 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #110 = String             #111          // manage_vault
  #111 = Utf8               manage_vault
  #112 = Fieldref           #54.#113      // ext/mods/gameserver/enums/PrivilegeType.SP_WAREHOUSE_SEARCH:Lext/mods/gameserver/enums/PrivilegeType;
  #113 = NameAndType        #114:#58      // SP_WAREHOUSE_SEARCH:Lext/mods/gameserver/enums/PrivilegeType;
  #114 = Utf8               SP_WAREHOUSE_SEARCH
  #115 = Class              #116          // ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #116 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #117 = String             #118          // _sch
  #118 = Utf8               _sch
  #119 = InvokeDynamic      #0:#120       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #120 = NameAndType        #121:#122     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #121 = Utf8               makeConcatWithConstants
  #122 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #123 = String             #124          // %rent%
  #124 = Utf8               %rent%
  #125 = Methodref          #93.#126      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getLease:()I
  #126 = NameAndType        #127:#68      // getLease:()I
  #127 = Utf8               getLease
  #128 = String             #129          // %date%
  #129 = Utf8               %date%
  #130 = Class              #131          // java/text/SimpleDateFormat
  #131 = Utf8               java/text/SimpleDateFormat
  #132 = String             #133          // dd-MM-yyyy HH:mm
  #133 = Utf8               dd-MM-yyyy HH:mm
  #134 = Methodref          #130.#135     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #135 = NameAndType        #5:#136       // "<init>":(Ljava/lang/String;)V
  #136 = Utf8               (Ljava/lang/String;)V
  #137 = Methodref          #93.#138      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getPaidUntil:()J
  #138 = NameAndType        #139:#140     // getPaidUntil:()J
  #139 = Utf8               getPaidUntil
  #140 = Utf8               ()J
  #141 = Methodref          #142.#143     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #142 = Class              #144          // java/lang/Long
  #143 = NameAndType        #145:#146     // valueOf:(J)Ljava/lang/Long;
  #144 = Utf8               java/lang/Long
  #145 = Utf8               valueOf
  #146 = Utf8               (J)Ljava/lang/Long;
  #147 = Methodref          #130.#148     // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #148 = NameAndType        #149:#150     // format:(Ljava/lang/Object;)Ljava/lang/String;
  #149 = Utf8               format
  #150 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #151 = Methodref          #63.#152      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #152 = NameAndType        #104:#34      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #153 = String             #154          // door
  #154 = Utf8               door
  #155 = Fieldref           #54.#156      // ext/mods/gameserver/enums/PrivilegeType.CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
  #156 = NameAndType        #157:#58      // CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
  #157 = Utf8               CHP_ENTRY_EXIT_RIGHTS
  #158 = String             #159          // open
  #159 = Utf8               open
  #160 = Methodref          #93.#161      // ext/mods/gameserver/model/residence/clanhall/ClanHall.openDoors:()V
  #161 = NameAndType        #162:#97      // openDoors:()V
  #162 = Utf8               openDoors
  #163 = String             #164          // html/clanHallManager/door-open.htm
  #164 = Utf8               html/clanHallManager/door-open.htm
  #165 = String             #166          // close
  #166 = Utf8               close
  #167 = Methodref          #93.#168      // ext/mods/gameserver/model/residence/clanhall/ClanHall.closeDoors:()V
  #168 = NameAndType        #169:#97      // closeDoors:()V
  #169 = Utf8               closeDoors
  #170 = String             #171          // html/clanHallManager/door-close.htm
  #171 = Utf8               html/clanHallManager/door-close.htm
  #172 = String             #173          // html/clanHallManager/door.htm
  #173 = Utf8               html/clanHallManager/door.htm
  #174 = String             #175          // functions
  #175 = Utf8               functions
  #176 = Fieldref           #54.#177      // ext/mods/gameserver/enums/PrivilegeType.CHP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
  #177 = NameAndType        #178:#58      // CHP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
  #178 = Utf8               CHP_USE_FUNCTIONS
  #179 = String             #180          // tele
  #180 = Utf8               tele
  #181 = Methodref          #93.#182      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
  #182 = NameAndType        #183:#184     // getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
  #183 = Utf8               getFunction
  #184 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
  #185 = String             #186          // html/clanHallManager/chamberlain-nac.htm
  #186 = Utf8               html/clanHallManager/chamberlain-nac.htm
  #187 = Methodref          #188.#189     // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
  #188 = Class              #190          // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction
  #189 = NameAndType        #191:#68      // getLvl:()I
  #190 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHallFunction
  #191 = Utf8               getLvl
  #192 = Fieldref           #193.#194     // ext/mods/gameserver/enums/TeleportType.CHF_LEVEL_2:Lext/mods/gameserver/enums/TeleportType;
  #193 = Class              #195          // ext/mods/gameserver/enums/TeleportType
  #194 = NameAndType        #196:#197     // CHF_LEVEL_2:Lext/mods/gameserver/enums/TeleportType;
  #195 = Utf8               ext/mods/gameserver/enums/TeleportType
  #196 = Utf8               CHF_LEVEL_2
  #197 = Utf8               Lext/mods/gameserver/enums/TeleportType;
  #198 = Fieldref           #193.#199     // ext/mods/gameserver/enums/TeleportType.CHF_LEVEL_1:Lext/mods/gameserver/enums/TeleportType;
  #199 = NameAndType        #200:#197     // CHF_LEVEL_1:Lext/mods/gameserver/enums/TeleportType;
  #200 = Utf8               CHF_LEVEL_1
  #201 = Methodref          #8.#202       // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.showTeleportWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
  #202 = NameAndType        #203:#204     // showTeleportWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
  #203 = Utf8               showTeleportWindow
  #204 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
  #205 = String             #206          // item_creation
  #206 = Utf8               item_creation
  #207 = Methodref          #208.#209     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #208 = Class              #210          // java/lang/Integer
  #209 = NameAndType        #211:#212     // parseInt:(Ljava/lang/String;)I
  #210 = Utf8               java/lang/Integer
  #211 = Utf8               parseInt
  #212 = Utf8               (Ljava/lang/String;)I
  #213 = Integer            100000
  #214 = Methodref          #8.#215       // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.showBuyWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #215 = NameAndType        #216:#217     // showBuyWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #216 = Utf8               showBuyWindow
  #217 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #218 = String             #219          // support
  #219 = Utf8               support
  #220 = Class              #221          // java/lang/StringBuilder
  #221 = Utf8               java/lang/StringBuilder
  #222 = Methodref          #220.#223     // java/lang/StringBuilder."<init>":()V
  #223 = NameAndType        #5:#97        // "<init>":()V
  #224 = Methodref          #93.#225      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getBuffs:()Ljava/util/List;
  #225 = NameAndType        #226:#227     // getBuffs:()Ljava/util/List;
  #226 = Utf8               getBuffs
  #227 = Utf8               ()Ljava/util/List;
  #228 = InterfaceMethodref #229.#230     // java/util/List.iterator:()Ljava/util/Iterator;
  #229 = Class              #231          // java/util/List
  #230 = NameAndType        #232:#233     // iterator:()Ljava/util/Iterator;
  #231 = Utf8               java/util/List
  #232 = Utf8               iterator
  #233 = Utf8               ()Ljava/util/Iterator;
  #234 = InterfaceMethodref #235.#236     // java/util/Iterator.hasNext:()Z
  #235 = Class              #237          // java/util/Iterator
  #236 = NameAndType        #238:#42      // hasNext:()Z
  #237 = Utf8               java/util/Iterator
  #238 = Utf8               hasNext
  #239 = InterfaceMethodref #235.#240     // java/util/Iterator.next:()Ljava/lang/Object;
  #240 = NameAndType        #241:#242     // next:()Ljava/lang/Object;
  #241 = Utf8               next
  #242 = Utf8               ()Ljava/lang/Object;
  #243 = Class              #244          // ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff
  #244 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff
  #245 = Methodref          #243.#246     // ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.id:()I
  #246 = NameAndType        #247:#68      // id:()I
  #247 = Utf8               id
  #248 = Methodref          #243.#249     // ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.lvl:()I
  #249 = NameAndType        #250:#68      // lvl:()I
  #250 = Utf8               lvl
  #251 = Methodref          #243.#252     // ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.desc:()Ljava/lang/String;
  #252 = NameAndType        #253:#38      // desc:()Ljava/lang/String;
  #253 = Utf8               desc
  #254 = InvokeDynamic      #1:#255       // #1:makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
  #255 = NameAndType        #121:#256     // makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
  #256 = Utf8               (IILjava/lang/String;)Ljava/lang/String;
  #257 = Methodref          #220.#258     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #258 = NameAndType        #259:#260     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #259 = Utf8               append
  #260 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #261 = InvokeDynamic      #2:#262       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #262 = NameAndType        #121:#263     // makeConcatWithConstants:(I)Ljava/lang/String;
  #263 = Utf8               (I)Ljava/lang/String;
  #264 = String             #265          // %mp%
  #265 = Utf8               %mp%
  #266 = Methodref          #8.#267       // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #267 = NameAndType        #268:#269     // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #268 = Utf8               getStatus
  #269 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #270 = Methodref          #271.#272     // ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
  #271 = Class              #273          // ext/mods/gameserver/model/actor/status/NpcStatus
  #272 = NameAndType        #274:#275     // getMp:()D
  #273 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
  #274 = Utf8               getMp
  #275 = Utf8               ()D
  #276 = String             #277          // %buffs%
  #277 = Utf8               %buffs%
  #278 = Methodref          #220.#279     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #279 = NameAndType        #280:#38      // toString:()Ljava/lang/String;
  #280 = Utf8               toString
  #281 = String             #282          // back
  #282 = Utf8               back
  #283 = Methodref          #8.#284       // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #284 = NameAndType        #285:#286     // showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
  #285 = Utf8               showChatWindow
  #286 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #287 = String             #288          // html/clanHallManager/functions.htm
  #288 = Utf8               html/clanHallManager/functions.htm
  #289 = String             #290          // %xp_regen%
  #290 = Utf8               %xp_regen%
  #291 = String             #292          // 0
  #292 = Utf8               0
  #293 = String             #294          // %hp_regen%
  #294 = Utf8               %hp_regen%
  #295 = String             #296          // %mp_regen%
  #296 = Utf8               %mp_regen%
  #297 = String             #298          // %npcId%
  #298 = Utf8               %npcId%
  #299 = Methodref          #8.#300       // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getNpcId:()I
  #300 = NameAndType        #301:#68      // getNpcId:()I
  #301 = Utf8               getNpcId
  #302 = String             #303          // manage
  #303 = Utf8               manage
  #304 = Fieldref           #54.#305      // ext/mods/gameserver/enums/PrivilegeType.CHP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
  #305 = NameAndType        #306:#58      // CHP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
  #306 = Utf8               CHP_SET_FUNCTIONS
  #307 = String             #308          // recovery
  #308 = Utf8               recovery
  #309 = Methodref          #93.#310      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
  #310 = NameAndType        #311:#68      // getOwnerId:()I
  #311 = Utf8               getOwnerId
  #312 = String             #313          // hp_cancel
  #313 = Utf8               hp_cancel
  #314 = String             #315          // html/clanHallManager/functions-cancel.htm
  #315 = Utf8               html/clanHallManager/functions-cancel.htm
  #316 = String             #317          // %apply%
  #317 = Utf8               %apply%
  #318 = String             #319          // recovery hp 0
  #319 = Utf8               recovery hp 0
  #320 = String             #321          // mp_cancel
  #321 = Utf8               mp_cancel
  #322 = String             #323          // recovery mp 0
  #323 = Utf8               recovery mp 0
  #324 = String             #325          // exp_cancel
  #325 = Utf8               exp_cancel
  #326 = String             #327          // recovery exp 0
  #327 = Utf8               recovery exp 0
  #328 = String             #329          // edit_hp
  #329 = Utf8               edit_hp
  #330 = String             #331          // html/clanHallManager/functions-apply.htm
  #331 = Utf8               html/clanHallManager/functions-apply.htm
  #332 = String             #333          // %name%
  #333 = Utf8               %name%
  #334 = String             #335          // Fireplace (HP Recovery Device)
  #335 = Utf8               Fireplace (HP Recovery Device)
  #336 = Methodref          #337.#338     // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #337 = Class              #339          // ext/mods/gameserver/data/manager/ClanHallManager
  #338 = NameAndType        #340:#341     // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #339 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
  #340 = Utf8               getInstance
  #341 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
  #342 = Methodref          #337.#343     // ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
  #343 = NameAndType        #344:#345     // getDecoDays:(II)I
  #344 = Utf8               getDecoDays
  #345 = Utf8               (II)I
  #346 = Methodref          #337.#347     // ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
  #347 = NameAndType        #348:#345     // getDecoFee:(II)I
  #348 = Utf8               getDecoFee
  #349 = String             #350          // %cost%
  #350 = Utf8               %cost%
  #351 = InvokeDynamic      #3:#352       // #3:makeConcatWithConstants:(II)Ljava/lang/String;
  #352 = NameAndType        #121:#353     // makeConcatWithConstants:(II)Ljava/lang/String;
  #353 = Utf8               (II)Ljava/lang/String;
  #354 = String             #355          // %use%
  #355 = Utf8               %use%
  #356 = InvokeDynamic      #4:#262       // #4:makeConcatWithConstants:(I)Ljava/lang/String;
  #357 = InvokeDynamic      #5:#262       // #5:makeConcatWithConstants:(I)Ljava/lang/String;
  #358 = String             #359          // edit_mp
  #359 = Utf8               edit_mp
  #360 = String             #361          // Carpet (MP Recovery)
  #361 = Utf8               Carpet (MP Recovery)
  #362 = InvokeDynamic      #6:#262       // #6:makeConcatWithConstants:(I)Ljava/lang/String;
  #363 = InvokeDynamic      #7:#262       // #7:makeConcatWithConstants:(I)Ljava/lang/String;
  #364 = String             #365          // edit_exp
  #365 = Utf8               edit_exp
  #366 = String             #367          // Chandelier (EXP Recovery Device)
  #367 = Utf8               Chandelier (EXP Recovery Device)
  #368 = InvokeDynamic      #8:#262       // #8:makeConcatWithConstants:(I)Ljava/lang/String;
  #369 = InvokeDynamic      #9:#262       // #9:makeConcatWithConstants:(I)Ljava/lang/String;
  #370 = String             #371          // hp
  #371 = Utf8               hp
  #372 = String             #373          // html/clanHallManager/functions-used.htm
  #373 = Utf8               html/clanHallManager/functions-used.htm
  #374 = String             #375          // %val%
  #375 = Utf8               %val%
  #376 = InvokeDynamic      #10:#262      // #10:makeConcatWithConstants:(I)Ljava/lang/String;
  #377 = String             #378          // html/clanHallManager/functions-apply_confirmed.htm
  #378 = Utf8               html/clanHallManager/functions-apply_confirmed.htm
  #379 = String             #380          // html/clanHallManager/functions-cancel_confirmed.htm
  #380 = Utf8               html/clanHallManager/functions-cancel_confirmed.htm
  #381 = Fieldref           #382.#383     // java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
  #382 = Class              #384          // java/util/concurrent/TimeUnit
  #383 = NameAndType        #385:#386     // DAYS:Ljava/util/concurrent/TimeUnit;
  #384 = Utf8               java/util/concurrent/TimeUnit
  #385 = Utf8               DAYS
  #386 = Utf8               Ljava/util/concurrent/TimeUnit;
  #387 = Methodref          #382.#388     // java/util/concurrent/TimeUnit.toMillis:(J)J
  #388 = NameAndType        #389:#390     // toMillis:(J)J
  #389 = Utf8               toMillis
  #390 = Utf8               (J)J
  #391 = Methodref          #93.#392      // ext/mods/gameserver/model/residence/clanhall/ClanHall.updateFunction:(Lext/mods/gameserver/model/actor/Player;IIIJ)Z
  #392 = NameAndType        #393:#394     // updateFunction:(Lext/mods/gameserver/model/actor/Player;IIIJ)Z
  #393 = Utf8               updateFunction
  #394 = Utf8               (Lext/mods/gameserver/model/actor/Player;IIIJ)Z
  #395 = String             #396          // html/clanHallManager/low_adena.htm
  #396 = Utf8               html/clanHallManager/low_adena.htm
  #397 = Methodref          #8.#398       // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.revalidateDeco:(Lext/mods/gameserver/model/actor/Player;)V
  #398 = NameAndType        #399:#286     // revalidateDeco:(Lext/mods/gameserver/model/actor/Player;)V
  #399 = Utf8               revalidateDeco
  #400 = String             #401          // mp
  #401 = Utf8               mp
  #402 = String             #403          // exp
  #403 = Utf8               exp
  #404 = String             #405          // html/clanHallManager/edit_recovery.htm
  #405 = Utf8               html/clanHallManager/edit_recovery.htm
  #406 = Methodref          #93.#407      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getGrade:()I
  #407 = NameAndType        #408:#68      // getGrade:()I
  #408 = Utf8               getGrade
  #409 = Methodref          #188.#410     // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getFuncLvl:()I
  #410 = NameAndType        #411:#68      // getFuncLvl:()I
  #411 = Utf8               getFuncLvl
  #412 = String             #413          // %hp_recovery%
  #413 = Utf8               %hp_recovery%
  #414 = Methodref          #188.#126     // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLease:()I
  #415 = InvokeDynamic      #11:#416      // #11:makeConcatWithConstants:(III)Ljava/lang/String;
  #416 = NameAndType        #121:#417     // makeConcatWithConstants:(III)Ljava/lang/String;
  #417 = Utf8               (III)Ljava/lang/String;
  #418 = String             #419          // %hp_period%
  #419 = Utf8               %hp_period%
  #420 = Methodref          #188.#421     // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getEndTime:()J
  #421 = NameAndType        #422:#140     // getEndTime:()J
  #422 = Utf8               getEndTime
  #423 = InvokeDynamic      #12:#120      // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #424 = String             #425          // %change_hp%
  #425 = Utf8               %change_hp%
  #426 = String             #427          // [<a action=\"bypass -h npc_%objectId%_manage recovery hp_cancel\">Stops using</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 2\">40%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 5\">100%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 8\">160%</a>]
  #427 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery hp_cancel\">Stops using</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 2\">40%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 5\">100%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 8\">160%</a>]
  #428 = String             #429          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 25\">300%</a>]
  #429 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 25\">300%</a>]
  #430 = String             #431          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 4\">80%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 7\">140%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 10\">200%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 260\">260%</a>]
  #431 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 4\">80%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 7\">140%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 10\">200%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 260\">260%</a>]
  #432 = InvokeDynamic      #13:#120      // #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #433 = String             #434          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 25\">300%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 30\">400%</a>]
  #434 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 25\">300%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 30\">400%</a>]
  #435 = String             #436          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 4\">80%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 6\">120%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 9\">180%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 12\">240%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 15\">300%</a>]
  #436 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 4\">80%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 6\">120%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 9\">180%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 12\">240%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 15\">300%</a>]
  #437 = String             #438          // Suspended
  #438 = Utf8               Suspended
  #439 = String             #440          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 2\">40%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 5\">100%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 8\">160%</a>]
  #440 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 2\">40%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 5\">100%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 8\">160%</a>]
  #441 = String             #442          // %exp_recovery%
  #442 = Utf8               %exp_recovery%
  #443 = String             #444          // %exp_period%
  #444 = Utf8               %exp_period%
  #445 = String             #446          // %change_exp%
  #446 = Utf8               %change_exp%
  #447 = String             #448          // [<a action=\"bypass -h npc_%objectId%_manage recovery exp_cancel\">Stops using</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 6\">30%</a>]
  #448 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery exp_cancel\">Stops using</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 6\">30%</a>]
  #449 = String             #450          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 19\">45%</a>]
  #450 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 19\">45%</a>]
  #451 = String             #452          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 5\">25%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 8\">40%</a>]
  #452 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 5\">25%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 8\">40%</a>]
  #453 = InvokeDynamic      #14:#120      // #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #454 = String             #455          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 19\">45%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 20\">50%</a>]
  #455 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 19\">45%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 20\">50%</a>]
  #456 = String             #457          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 5\">25%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 7\">35%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 10\">50%</a>]
  #457 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 5\">25%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 7\">35%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 10\">50%</a>]
  #458 = String             #459          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 6\">30%</a>]
  #459 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 6\">30%</a>]
  #460 = String             #461          // %mp_recovery%
  #461 = Utf8               %mp_recovery%
  #462 = String             #463          // %mp_period%
  #463 = Utf8               %mp_period%
  #464 = String             #465          // %change_mp%
  #465 = Utf8               %change_mp%
  #466 = String             #467          // [<a action=\"bypass -h npc_%objectId%_manage recovery mp_cancel\">Stops using</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 5\">25%</a>]
  #467 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery mp_cancel\">Stops using</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 5\">25%</a>]
  #468 = String             #469          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 18\">40%</a>]
  #469 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 18\">40%</a>]
  #470 = String             #471          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 6\">30%</a>]
  #471 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 6\">30%</a>]
  #472 = InvokeDynamic      #15:#120      // #15:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #473 = String             #474          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 18\">40%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 20\">50%</a>]
  #474 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 18\">40%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 20\">50%</a>]
  #475 = String             #476          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 6\">30%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 8\">40%</a>]
  #476 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 6\">30%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 8\">40%</a>]
  #477 = String             #478          // [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 5\">25%</a>]
  #478 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 5\">25%</a>]
  #479 = String             #480          // other
  #480 = Utf8               other
  #481 = String             #482          // item_cancel
  #482 = Utf8               item_cancel
  #483 = String             #484          // other item 0
  #484 = Utf8               other item 0
  #485 = String             #486          // tele_cancel
  #486 = Utf8               tele_cancel
  #487 = String             #488          // other tele 0
  #488 = Utf8               other tele 0
  #489 = String             #490          // support_cancel
  #490 = Utf8               support_cancel
  #491 = String             #492          // other support 0
  #492 = Utf8               other support 0
  #493 = String             #494          // edit_item
  #494 = Utf8               edit_item
  #495 = String             #496          // Magic Equipment (Item Production Facilities)
  #496 = Utf8               Magic Equipment (Item Production Facilities)
  #497 = String             #498          // Allow the purchase of special items at fixed intervals.
  #498 = Utf8               Allow the purchase of special items at fixed intervals.
  #499 = InvokeDynamic      #16:#262      // #16:makeConcatWithConstants:(I)Ljava/lang/String;
  #500 = String             #501          // edit_support
  #501 = Utf8               edit_support
  #502 = String             #503          // Insignia (Supplementary Magic)
  #503 = Utf8               Insignia (Supplementary Magic)
  #504 = String             #505          // Enables the use of supplementary magic.
  #505 = Utf8               Enables the use of supplementary magic.
  #506 = InvokeDynamic      #17:#262      // #17:makeConcatWithConstants:(I)Ljava/lang/String;
  #507 = String             #508          // edit_tele
  #508 = Utf8               edit_tele
  #509 = String             #510          // Mirror (Teleportation Device)
  #510 = Utf8               Mirror (Teleportation Device)
  #511 = InvokeDynamic      #18:#262      // #18:makeConcatWithConstants:(I)Ljava/lang/String;
  #512 = InvokeDynamic      #19:#262      // #19:makeConcatWithConstants:(I)Ljava/lang/String;
  #513 = String             #514          // item
  #514 = Utf8               item
  #515 = InvokeDynamic      #20:#120      // #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #516 = InvokeDynamic      #20:#262      // #20:makeConcatWithConstants:(I)Ljava/lang/String;
  #517 = Methodref          #8.#518       // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getAI:()Lext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI;
  #518 = NameAndType        #519:#520     // getAI:()Lext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI;
  #519 = Utf8               getAI
  #520 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI;
  #521 = Methodref          #13.#522      // ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI.resetBuffCheckTime:()V
  #522 = NameAndType        #523:#97      // resetBuffCheckTime:()V
  #523 = Utf8               resetBuffCheckTime
  #524 = String             #525          // html/clanHallManager/edit_other.htm
  #525 = Utf8               html/clanHallManager/edit_other.htm
  #526 = String             #527          // %tele%
  #527 = Utf8               %tele%
  #528 = InvokeDynamic      #21:#416      // #21:makeConcatWithConstants:(III)Ljava/lang/String;
  #529 = String             #530          // %tele_period%
  #530 = Utf8               %tele_period%
  #531 = String             #532          // %change_tele%
  #532 = Utf8               %change_tele%
  #533 = String             #534          // [<a action=\"bypass -h npc_%objectId%_manage other edit_tele 1\">Level 11</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_tele 12\">Level 2</a>]
  #534 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other edit_tele 1\">Level 11</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_tele 12\">Level 2</a>]
  #535 = String             #536          // [<a action=\"bypass -h npc_%objectId%_manage other edit_tele 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_tele 2\">2nd Stage</a>]
  #536 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other edit_tele 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_tele 2\">2nd Stage</a>]
  #537 = InvokeDynamic      #22:#120      // #22:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #538 = String             #539          // %support%
  #539 = Utf8               %support%
  #540 = String             #541          // %support_period%
  #541 = Utf8               %support_period%
  #542 = String             #543          // %change_support%
  #543 = Utf8               %change_support%
  #544 = String             #545          // [<a action=\"bypass -h npc_%objectId%_manage other support_cancel\">Stops using</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 2\">2nd Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 4\">4th Level</a>]
  #545 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other support_cancel\">Stops using</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 2\">2nd Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 4\">4th Level</a>]
  #546 = String             #547          // [<a action=\"bypass -h npc_%objectId%_manage other edit_support 15\">Level 5</a>]
  #547 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other edit_support 15\">Level 5</a>]
  #548 = String             #549          // [<a action=\"bypass -h npc_%objectId%_manage other edit_support 3\">3st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 4\">4th Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 5\">5th Level</a>]
  #549 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other edit_support 3\">3st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 4\">4th Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 5\">5th Level</a>]
  #550 = InvokeDynamic      #23:#120      // #23:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #551 = String             #552          // [<a action=\"bypass -h npc_%objectId%_manage other edit_support 15\">Level 5</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 18\">Level 8</a>]
  #552 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other edit_support 15\">Level 5</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 18\">Level 8</a>]
  #553 = String             #554          // [<a action=\"bypass -h npc_%objectId%_manage other edit_support 3\">3st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 5\">5th Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 7\">7th Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 8\">8th Level</a>]
  #554 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other edit_support 3\">3st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 5\">5th Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 7\">7th Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 8\">8th Level</a>]
  #555 = String             #556          // [<a action=\"bypass -h npc_%objectId%_manage other edit_support 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 2\">2nd Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 4\">4th Level</a>]
  #556 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other edit_support 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 2\">2nd Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 4\">4th Level</a>]
  #557 = String             #558          // %item%
  #558 = Utf8               %item%
  #559 = String             #560          // %item_period%
  #560 = Utf8               %item_period%
  #561 = String             #562          // %change_item%
  #562 = Utf8               %change_item%
  #563 = String             #564          // [<a action=\"bypass -h npc_%objectId%_manage other edit_item 11\">Level 1</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 12\">Level 2</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 13\">Level 3</a>]
  #564 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other edit_item 11\">Level 1</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 12\">Level 2</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 13\">Level 3</a>]
  #565 = String             #566          // [<a action=\"bypass -h npc_%objectId%_manage other edit_item 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 2\">2nd Stage</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 3\">3st Stage</a>]
  #566 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other edit_item 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 2\">2nd Stage</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 3\">3st Stage</a>]
  #567 = InvokeDynamic      #24:#120      // #24:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #568 = String             #569          // deco
  #569 = Utf8               deco
  #570 = String             #571          // curtains_cancel
  #571 = Utf8               curtains_cancel
  #572 = String             #573          // deco curtains 0
  #573 = Utf8               deco curtains 0
  #574 = String             #575          // fixtures_cancel
  #575 = Utf8               fixtures_cancel
  #576 = String             #577          // deco fixtures 0
  #577 = Utf8               deco fixtures 0
  #578 = String             #579          // edit_curtains
  #579 = Utf8               edit_curtains
  #580 = String             #581          // Curtains (Decoration)
  #581 = Utf8               Curtains (Decoration)
  #582 = String             #583          // These curtains can be used to decorate the clan hall.
  #583 = Utf8               These curtains can be used to decorate the clan hall.
  #584 = InvokeDynamic      #25:#262      // #25:makeConcatWithConstants:(I)Ljava/lang/String;
  #585 = String             #586          // edit_fixtures
  #586 = Utf8               edit_fixtures
  #587 = String             #588          // Front Platform (Decoration)
  #588 = Utf8               Front Platform (Decoration)
  #589 = String             #590          // Used to decorate the clan hall.
  #590 = Utf8               Used to decorate the clan hall.
  #591 = InvokeDynamic      #26:#262      // #26:makeConcatWithConstants:(I)Ljava/lang/String;
  #592 = String             #593          // curtains
  #593 = Utf8               curtains
  #594 = String             #595          // fixtures
  #595 = Utf8               fixtures
  #596 = String             #597          // html/clanHallManager/deco.htm
  #597 = Utf8               html/clanHallManager/deco.htm
  #598 = String             #599          // %curtain%
  #599 = Utf8               %curtain%
  #600 = String             #601          // %curtain_period%
  #601 = Utf8               %curtain_period%
  #602 = String             #603          // %change_curtain%
  #603 = Utf8               %change_curtain%
  #604 = String             #605          // [<a action=\"bypass -h npc_%objectId%_manage deco curtains_cancel\">Remove</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_curtains 1\">1st Stage</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_curtains 2\">2nd Stage</a>]
  #605 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage deco curtains_cancel\">Remove</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_curtains 1\">1st Stage</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_curtains 2\">2nd Stage</a>]
  #606 = String             #607          // [<a action=\"bypass -h npc_%objectId%_manage deco edit_curtains 1\">1st Stage</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_curtains 2\">2nd Stage</a>]
  #607 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage deco edit_curtains 1\">1st Stage</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_curtains 2\">2nd Stage</a>]
  #608 = String             #609          // %fixture%
  #609 = Utf8               %fixture%
  #610 = String             #611          // %fixture_period%
  #611 = Utf8               %fixture_period%
  #612 = String             #613          // %change_fixture%
  #613 = Utf8               %change_fixture%
  #614 = String             #615          // [<a action=\"bypass -h npc_%objectId%_manage deco fixtures_cancel\">Remove</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_fixtures 1\">1st Stage</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_fixtures 2\">2nd Stage</a>]
  #615 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage deco fixtures_cancel\">Remove</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_fixtures 1\">1st Stage</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_fixtures 2\">2nd Stage</a>]
  #616 = String             #617          // [<a action=\"bypass -h npc_%objectId%_manage deco edit_fixtures 1\">1st Stage</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_fixtures 2\">2nd Stage</a>]
  #617 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage deco edit_fixtures 1\">1st Stage</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_fixtures 2\">2nd Stage</a>]
  #618 = String             #619          // html/clanHallManager/manage_sch.htm
  #619 = Utf8               html/clanHallManager/manage_sch.htm
  #620 = String             #621          // html/clanHallManager/manage.htm
  #621 = Utf8               html/clanHallManager/manage.htm
  #622 = Methodref          #75.#623      // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #623 = NameAndType        #624:#42      // isCursedWeaponEquipped:()Z
  #624 = Utf8               isCursedWeaponEquipped
  #625 = String             #626          // The wielder of a cursed weapon cannot receive outside heals or buffs
  #626 = Utf8               The wielder of a cursed weapon cannot receive outside heals or buffs
  #627 = Methodref          #75.#628      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #628 = NameAndType        #629:#136     // sendMessage:(Ljava/lang/String;)V
  #629 = Utf8               sendMessage
  #630 = Methodref          #8.#631       // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #631 = NameAndType        #632:#633     // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #632 = Utf8               setTarget
  #633 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #634 = Fieldref           #635.#636     // ext/mods/Config.CUSTOM_BUFFER_MANAGER_NPC:Z
  #635 = Class              #637          // ext/mods/Config
  #636 = NameAndType        #638:#639     // CUSTOM_BUFFER_MANAGER_NPC:Z
  #637 = Utf8               ext/mods/Config
  #638 = Utf8               CUSTOM_BUFFER_MANAGER_NPC
  #639 = Utf8               Z
  #640 = Methodref          #641.#642     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #641 = Class              #643          // ext/mods/gameserver/data/SkillTable
  #642 = NameAndType        #340:#644     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #643 = Utf8               ext/mods/gameserver/data/SkillTable
  #644 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #645 = Methodref          #641.#646     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #646 = NameAndType        #647:#648     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #647 = Utf8               getInfo
  #648 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #649 = Methodref          #650.#651     // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #650 = Class              #652          // ext/mods/gameserver/skills/L2Skill
  #651 = NameAndType        #653:#654     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #652 = Utf8               ext/mods/gameserver/skills/L2Skill
  #653 = Utf8               getEffects
  #654 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #655 = Methodref          #243.#656     // ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.price:()I
  #656 = NameAndType        #657:#68      // price:()I
  #657 = Utf8               price
  #658 = Methodref          #75.#659      // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #659 = NameAndType        #660:#661     // destroyItemByItemId:(IIZ)Z
  #660 = Utf8               destroyItemByItemId
  #661 = Utf8               (IIZ)Z
  #662 = Methodref          #271.#663     // ext/mods/gameserver/model/actor/status/NpcStatus.getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
  #663 = NameAndType        #664:#665     // getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
  #664 = Utf8               getMpConsume
  #665 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)I
  #666 = Double             1000000.0d
  #668 = Methodref          #13.#669      // ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI.addCastDesireHold:(Lext/mods/gameserver/model/actor/Creature;IID)V
  #669 = NameAndType        #670:#671     // addCastDesireHold:(Lext/mods/gameserver/model/actor/Creature;IID)V
  #670 = Utf8               addCastDesireHold
  #671 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IID)V
  #672 = Class              #673          // java/lang/Exception
  #673 = Utf8               java/lang/Exception
  #674 = String             #675          // Invalid skill, contact your server support.
  #675 = Utf8               Invalid skill, contact your server support.
  #676 = String             #677          // list_back
  #677 = Utf8               list_back
  #678 = String             #679          // html/clanHallManager/chamberlain.htm
  #679 = Utf8               html/clanHallManager/chamberlain.htm
  #680 = String             #681          // %npcname%
  #681 = Utf8               %npcname%
  #682 = Methodref          #8.#683       // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc.getName:()Ljava/lang/String;
  #683 = NameAndType        #684:#38      // getName:()Ljava/lang/String;
  #684 = Utf8               getName
  #685 = String             #686          // support_back
  #686 = Utf8               support_back
  #687 = String             #688          // WithdrawC
  #688 = Utf8               WithdrawC
  #689 = Fieldref           #690.#691     // ext/mods/gameserver/network/SystemMessageId.YOU_DO_NOT_HAVE_THE_RIGHT_TO_USE_CLAN_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
  #690 = Class              #692          // ext/mods/gameserver/network/SystemMessageId
  #691 = NameAndType        #693:#694     // YOU_DO_NOT_HAVE_THE_RIGHT_TO_USE_CLAN_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
  #692 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #693 = Utf8               YOU_DO_NOT_HAVE_THE_RIGHT_TO_USE_CLAN_WAREHOUSE
  #694 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #695 = Methodref          #75.#696      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #696 = NameAndType        #108:#697     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #697 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #698 = Methodref          #75.#699      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #699 = NameAndType        #700:#701     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #700 = Utf8               getClan
  #701 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #702 = Methodref          #703.#704     // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
  #703 = Class              #705          // ext/mods/gameserver/model/pledge/Clan
  #704 = NameAndType        #706:#68      // getLevel:()I
  #705 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #706 = Utf8               getLevel
  #707 = Fieldref           #690.#708     // ext/mods/gameserver/network/SystemMessageId.ONLY_LEVEL_1_CLAN_OR_HIGHER_CAN_USE_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
  #708 = NameAndType        #709:#694     // ONLY_LEVEL_1_CLAN_OR_HIGHER_CAN_USE_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
  #709 = Utf8               ONLY_LEVEL_1_CLAN_OR_HIGHER_CAN_USE_WAREHOUSE
  #710 = Methodref          #703.#711     // ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #711 = NameAndType        #712:#713     // getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #712 = Utf8               getWarehouse
  #713 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #714 = Methodref          #75.#715      // ext/mods/gameserver/model/actor/Player.setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
  #715 = NameAndType        #716:#717     // setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
  #716 = Utf8               setActiveWarehouse
  #717 = Utf8               (Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
  #718 = Class              #719          // ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList
  #719 = Utf8               ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList
  #720 = Methodref          #718.#721     // ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
  #721 = NameAndType        #5:#217       // "<init>":(Lext/mods/gameserver/model/actor/Player;I)V
  #722 = Fieldref           #723.#724     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #723 = Class              #725          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #724 = NameAndType        #726:#727     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #725 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #726 = Utf8               STATIC_PACKET
  #727 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #728 = String             #729          // DepositC
  #729 = Utf8               DepositC
  #730 = Methodref          #75.#731      // ext/mods/gameserver/model/actor/Player.tempInventoryDisable:()V
  #731 = NameAndType        #732:#97      // tempInventoryDisable:()V
  #732 = Utf8               tempInventoryDisable
  #733 = Class              #734          // ext/mods/gameserver/network/serverpackets/WarehouseDepositList
  #734 = Utf8               ext/mods/gameserver/network/serverpackets/WarehouseDepositList
  #735 = Methodref          #733.#721     // ext/mods/gameserver/network/serverpackets/WarehouseDepositList."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
  #736 = Methodref          #2.#737       // ext/mods/gameserver/model/actor/instance/Merchant.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #737 = NameAndType        #738:#739     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #738 = Utf8               onBypassFeedback
  #739 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #740 = String             #741          // .htm
  #741 = Utf8               .htm
  #742 = String             #743          // -no.htm
  #743 = Utf8               -no.htm
  #744 = InvokeDynamic      #27:#120      // #27:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #745 = Methodref          #75.#746      // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #746 = NameAndType        #747:#68      // getClanId:()I
  #747 = Utf8               getClanId
  #748 = Fieldref           #23.#749      // ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #749 = NameAndType        #750:#27      // NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #750 = Utf8               NONE
  #751 = Methodref          #93.#752      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getZone:()Lext/mods/gameserver/model/zone/type/ClanHallZone;
  #752 = NameAndType        #753:#754     // getZone:()Lext/mods/gameserver/model/zone/type/ClanHallZone;
  #753 = Utf8               getZone
  #754 = Utf8               ()Lext/mods/gameserver/model/zone/type/ClanHallZone;
  #755 = Class              #756          // ext/mods/gameserver/network/serverpackets/ClanHallDecoration
  #756 = Utf8               ext/mods/gameserver/network/serverpackets/ClanHallDecoration
  #757 = Methodref          #755.#758     // ext/mods/gameserver/network/serverpackets/ClanHallDecoration."<init>":(Lext/mods/gameserver/model/residence/clanhall/ClanHall;)V
  #758 = NameAndType        #5:#759       // "<init>":(Lext/mods/gameserver/model/residence/clanhall/ClanHall;)V
  #759 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHall;)V
  #760 = Methodref          #761.#762     // ext/mods/gameserver/model/zone/type/ClanHallZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #761 = Class              #763          // ext/mods/gameserver/model/zone/type/ClanHallZone
  #762 = NameAndType        #764:#109     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #763 = Utf8               ext/mods/gameserver/model/zone/type/ClanHallZone
  #764 = Utf8               broadcastPacket
  #765 = Methodref          #75.#766      // ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #766 = NameAndType        #767:#768     // hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
  #767 = Utf8               hasClanPrivileges
  #768 = Utf8               (Lext/mods/gameserver/enums/PrivilegeType;)Z
  #769 = String             #770          // html/clanHallManager/not_authorized.htm
  #770 = Utf8               html/clanHallManager/not_authorized.htm
  #771 = Utf8               HP_GRADE_1
  #772 = Utf8               Ljava/lang/String;
  #773 = Utf8               ConstantValue
  #774 = Utf8               HP_GRADE_2
  #775 = Utf8               HP_GRADE_3
  #776 = Utf8               HP_GRADE_2_SCH
  #777 = Utf8               HP_GRADE_3_SCH
  #778 = Utf8               EXP_GRADE_1
  #779 = Utf8               EXP_GRADE_2
  #780 = Utf8               EXP_GRADE_3
  #781 = Utf8               EXP_GRADE_2_SCH
  #782 = Utf8               EXP_GRADE_3_SCH
  #783 = Utf8               MP_GRADE_1
  #784 = Utf8               MP_GRADE_2
  #785 = Utf8               MP_GRADE_3
  #786 = Utf8               MP_GRADE_2_SCH
  #787 = Utf8               MP_GRADE_3_SCH
  #788 = Utf8               SUPPORT_GRADE_1
  #789 = Utf8               SUPPORT_GRADE_2
  #790 = Utf8               SUPPORT_GRADE_3
  #791 = Utf8               SUPPORT_GRADE_2_SCH
  #792 = Utf8               SUPPORT_GRADE_3_SCH
  #793 = Utf8               ITEM
  #794 = Utf8               ITEM_SCH
  #795 = Utf8               TELE
  #796 = Utf8               TELE_SCH
  #797 = Utf8               CURTAINS
  #798 = Utf8               FIXTURES
  #799 = Utf8               Code
  #800 = Utf8               LineNumberTable
  #801 = Utf8               LocalVariableTable
  #802 = Utf8               this
  #803 = Utf8               Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;
  #804 = Utf8               objectId
  #805 = Utf8               I
  #806 = Utf8               template
  #807 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #808 = Utf8               setAI
  #809 = Utf8               isWarehouse
  #810 = Utf8               html
  #811 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #812 = Utf8               isSCH
  #813 = Utf8               chf
  #814 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
  #815 = Utf8               buff
  #816 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;
  #817 = Utf8               buffsHtml
  #818 = Utf8               Ljava/lang/StringBuilder;
  #819 = Utf8               chfExp
  #820 = Utf8               chfHp
  #821 = Utf8               chfMp
  #822 = Utf8               level
  #823 = Utf8               funcLvl
  #824 = Utf8               days
  #825 = Utf8               cost
  #826 = Utf8               percent
  #827 = Utf8               fee
  #828 = Utf8               grade
  #829 = Utf8               chfTel
  #830 = Utf8               chfSup
  #831 = Utf8               chfCreate
  #832 = Utf8               chfCurtains
  #833 = Utf8               chfPlateform
  #834 = Utf8               skill
  #835 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #836 = Utf8               mpConsume
  #837 = Utf8               D
  #838 = Utf8               e
  #839 = Utf8               Ljava/lang/Exception;
  #840 = Utf8               player
  #841 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #842 = Utf8               command
  #843 = Utf8               condition
  #844 = Utf8               st
  #845 = Utf8               Ljava/util/StringTokenizer;
  #846 = Utf8               actualCommand
  #847 = Utf8               val
  #848 = Utf8               StackMapTable
  #849 = Class              #850          // java/util/Locale
  #850 = Utf8               java/util/Locale
  #851 = Utf8               isTeleportAllowed
  #852 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #853 = Utf8               privilege
  #854 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #855 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #856 = Utf8               SourceFile
  #857 = Utf8               ClanHallManagerNpc.java
  #858 = Utf8               BootstrapMethods
  #859 = String             #860          // html/clanHallManager/vault\u0001.htm
  #860 = Utf8               html/clanHallManager/vault\u0001.htm
  #861 = String             #862          // <a action=\"bypass -h npc_%objectId%_support \u0001 \u0001\">\u0001</a><br1>
  #862 = Utf8               <a action=\"bypass -h npc_%objectId%_support \u0001 \u0001\">\u0001</a><br1>
  #863 = String             #864          // html/clanHallManager/support\u0001.htm
  #864 = Utf8               html/clanHallManager/support\u0001.htm
  #865 = String             #866          // \u0001</font> adenas / \u0001 day</font>)
  #866 = Utf8               \u0001</font> adenas / \u0001 day</font>)
  #867 = String             #868          // Provides additional HP recovery for clan members in the clan hall.<font color=\"00FFFF\">\u0001%</font>
  #868 = Utf8               Provides additional HP recovery for clan members in the clan hall.<font color=\"00FFFF\">\u0001%</font>
  #869 = String             #870          // recovery hp \u0001
  #870 = Utf8               recovery hp \u0001
  #871 = String             #872          // Provides additional MP recovery for clan members in the clan hall.<font color=\"00FFFF\">\u0001%</font>
  #872 = Utf8               Provides additional MP recovery for clan members in the clan hall.<font color=\"00FFFF\">\u0001%</font>
  #873 = String             #874          // recovery mp \u0001
  #874 = Utf8               recovery mp \u0001
  #875 = String             #876          // Restores the Exp of any clan member who is resurrected in the clan hall.<font color=\"00FFFF\">\u0001%</font>
  #876 = Utf8               Restores the Exp of any clan member who is resurrected in the clan hall.<font color=\"00FFFF\">\u0001%</font>
  #877 = String             #878          // recovery exp \u0001
  #878 = Utf8               recovery exp \u0001
  #879 = String             #880          // \u0001%
  #880 = Utf8               \u0001%
  #881 = String             #882          // \u0001%</font> (<font color=\"FFAABB\">\u0001</font> adenas / \u0001 day)
  #882 = Utf8               \u0001%</font> (<font color=\"FFAABB\">\u0001</font> adenas / \u0001 day)
  #883 = String             #884          // Next fee at \u0001
  #884 = Utf8               Next fee at \u0001
  #885 = String             #886          // [<a action=\"bypass -h npc_%objectId%_manage recovery hp_cancel\">Remove</a>]\u0001
  #886 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery hp_cancel\">Remove</a>]\u0001
  #887 = String             #888          // [<a action=\"bypass -h npc_%objectId%_manage recovery exp_cancel\">Remove</a>]\u0001
  #888 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery exp_cancel\">Remove</a>]\u0001
  #889 = String             #890          // [<a action=\"bypass -h npc_%objectId%_manage recovery mp_cancel\">Remove</a>]\u0001
  #890 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage recovery mp_cancel\">Remove</a>]\u0001
  #891 = String             #892          // other item \u0001
  #892 = Utf8               other item \u0001
  #893 = String             #894          // other support \u0001
  #894 = Utf8               other support \u0001
  #895 = String             #896          // Teleports clan members in a clan hall to the target <font color=\"00FFFF\">Stage \u0001</font> staging area
  #896 = Utf8               Teleports clan members in a clan hall to the target <font color=\"00FFFF\">Stage \u0001</font> staging area
  #897 = String             #898          // other tele \u0001
  #898 = Utf8               other tele \u0001
  #899 = String             #900          // Stage \u0001
  #900 = Utf8               Stage \u0001
  #901 = String             #902          // - Stage \u0001</font> (<font color=\"FFAABB\">\u0001</font> adenas / \u0001 day)
  #902 = Utf8               - Stage \u0001</font> (<font color=\"FFAABB\">\u0001</font> adenas / \u0001 day)
  #903 = String             #904          // [<a action=\"bypass -h npc_%objectId%_manage other tele_cancel\">Remove</a>]\u0001
  #904 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other tele_cancel\">Remove</a>]\u0001
  #905 = String             #906          // [<a action=\"bypass -h npc_%objectId%_manage other support_cancel\">Remove</a>]\u0001
  #906 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other support_cancel\">Remove</a>]\u0001
  #907 = String             #908          // [<a action=\"bypass -h npc_%objectId%_manage other item_cancel\">Remove</a>]\u0001
  #908 = Utf8               [<a action=\"bypass -h npc_%objectId%_manage other item_cancel\">Remove</a>]\u0001
  #909 = String             #910          // deco curtains \u0001
  #910 = Utf8               deco curtains \u0001
  #911 = String             #912          // deco fixtures \u0001
  #912 = Utf8               deco fixtures \u0001
  #913 = String             #914          // html/clanHallManager/chamberlain\u0001
  #914 = Utf8               html/clanHallManager/chamberlain\u0001
  #915 = MethodHandle       6:#916        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #916 = Methodref          #917.#918     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #917 = Class              #919          // java/lang/invoke/StringConcatFactory
  #918 = NameAndType        #121:#920     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #919 = Utf8               java/lang/invoke/StringConcatFactory
  #920 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #921 = Utf8               InnerClasses
  #922 = Utf8               Buff
  #923 = Class              #924          // java/lang/invoke/MethodHandles$Lookup
  #924 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #925 = Class              #926          // java/lang/invoke/MethodHandles
  #926 = Utf8               java/lang/invoke/MethodHandles
  #927 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.ClanHallManagerNpc(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Merchant."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 82: 0
        line 83: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public ext.mods.gameserver.model.actor.ai.type.ClanHallManagerNpcAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
         4: checkcast     #13                 // class ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI
         7: areturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;

  public void setAI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #13                 // class ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI
         4: dup
         5: aload_0
         6: invokespecial #15                 // Method ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI."<init>":(Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;)V
         9: putfield      #7                  // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        12: return
      LineNumberTable:
        line 94: 0
        line 95: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;

  public boolean isWarehouse();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=15, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #18                 // Method getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
         5: astore_3
         6: aload_3
         7: getstatic     #22                 // Field ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        10: if_acmpeq     14
        13: return
        14: new           #28                 // class java/util/StringTokenizer
        17: dup
        18: aload_2
        19: ldc           #30                 // String
        21: invokespecial #32                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        24: astore        4
        26: aload         4
        28: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        31: astore        5
        33: aload         4
        35: invokevirtual #39                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        38: ifeq          49
        41: aload         4
        43: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        46: goto          51
        49: ldc           #43                 // String
        51: astore        6
        53: aload         5
        55: ldc           #45                 // String banish_foreigner
        57: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        60: ifeq          160
        63: aload_0
        64: aload_1
        65: getstatic     #53                 // Field ext/mods/gameserver/enums/PrivilegeType.CHP_RIGHT_TO_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
        68: invokevirtual #59                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
        71: ifne          75
        74: return
        75: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        78: dup
        79: aload_0
        80: invokevirtual #65                 // Method getObjectId:()I
        83: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        86: astore        7
        88: aload         6
        90: ldc           #72                 // String list
        92: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        95: ifeq          112
        98: aload         7
       100: aload_1
       101: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       104: ldc           #80                 // String html/clanHallManager/banish-list.htm
       106: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       109: goto          140
       112: aload         6
       114: ldc           #86                 // String banish
       116: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       119: ifeq          140
       122: aload_0
       123: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       126: invokevirtual #92                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.banishForeigners:()V
       129: aload         7
       131: aload_1
       132: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       135: ldc           #98                 // String html/clanHallManager/banish.htm
       137: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       140: aload         7
       142: ldc           #100                // String %objectId%
       144: aload_0
       145: invokevirtual #65                 // Method getObjectId:()I
       148: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       151: aload_1
       152: aload         7
       154: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       157: goto          7739
       160: aload         5
       162: ldc           #110                // String manage_vault
       164: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       167: ifeq          293
       170: aload_0
       171: aload_1
       172: getstatic     #112                // Field ext/mods/gameserver/enums/PrivilegeType.SP_WAREHOUSE_SEARCH:Lext/mods/gameserver/enums/PrivilegeType;
       175: invokevirtual #59                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
       178: ifne          182
       181: return
       182: aload_0
       183: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       186: instanceof    #115                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
       189: istore        7
       191: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       194: dup
       195: aload_0
       196: invokevirtual #65                 // Method getObjectId:()I
       199: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       202: astore        8
       204: aload         8
       206: aload_1
       207: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       210: iload         7
       212: ifeq          220
       215: ldc           #117                // String _sch
       217: goto          222
       220: ldc           #43                 // String
       222: invokedynamic #119,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       227: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       230: aload         8
       232: ldc           #123                // String %rent%
       234: aload_0
       235: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       238: invokevirtual #125                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getLease:()I
       241: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       244: aload         8
       246: ldc           #128                // String %date%
       248: new           #130                // class java/text/SimpleDateFormat
       251: dup
       252: ldc           #132                // String dd-MM-yyyy HH:mm
       254: invokespecial #134                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       257: aload_0
       258: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       261: invokevirtual #137                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getPaidUntil:()J
       264: invokestatic  #141                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       267: invokevirtual #147                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       270: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       273: aload         8
       275: ldc           #100                // String %objectId%
       277: aload_0
       278: invokevirtual #65                 // Method getObjectId:()I
       281: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       284: aload_1
       285: aload         8
       287: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       290: goto          7739
       293: aload         5
       295: ldc           #153                // String door
       297: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       300: ifeq          421
       303: aload_0
       304: aload_1
       305: getstatic     #155                // Field ext/mods/gameserver/enums/PrivilegeType.CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
       308: invokevirtual #59                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
       311: ifne          315
       314: return
       315: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       318: dup
       319: aload_0
       320: invokevirtual #65                 // Method getObjectId:()I
       323: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       326: astore        7
       328: aload         6
       330: ldc           #158                // String open
       332: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       335: ifeq          359
       338: aload_0
       339: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       342: invokevirtual #160                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.openDoors:()V
       345: aload         7
       347: aload_1
       348: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       351: ldc           #163                // String html/clanHallManager/door-open.htm
       353: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       356: goto          401
       359: aload         6
       361: ldc           #165                // String close
       363: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       366: ifeq          390
       369: aload_0
       370: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       373: invokevirtual #167                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.closeDoors:()V
       376: aload         7
       378: aload_1
       379: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       382: ldc           #170                // String html/clanHallManager/door-close.htm
       384: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       387: goto          401
       390: aload         7
       392: aload_1
       393: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       396: ldc           #172                // String html/clanHallManager/door.htm
       398: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       401: aload         7
       403: ldc           #100                // String %objectId%
       405: aload_0
       406: invokevirtual #65                 // Method getObjectId:()I
       409: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       412: aload_1
       413: aload         7
       415: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       418: goto          7739
       421: aload         5
       423: ldc           #174                // String functions
       425: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       428: ifeq          1035
       431: aload_0
       432: aload_1
       433: getstatic     #176                // Field ext/mods/gameserver/enums/PrivilegeType.CHP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
       436: invokevirtual #59                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
       439: ifne          443
       442: return
       443: aload         6
       445: ldc           #179                // String tele
       447: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       450: ifeq          536
       453: aload_0
       454: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       457: iconst_5
       458: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
       461: astore        7
       463: aload         7
       465: ifnonnull     510
       468: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       471: dup
       472: aload_0
       473: invokevirtual #65                 // Method getObjectId:()I
       476: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       479: astore        8
       481: aload         8
       483: aload_1
       484: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       487: ldc           #185                // String html/clanHallManager/chamberlain-nac.htm
       489: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       492: aload         8
       494: ldc           #100                // String %objectId%
       496: aload_0
       497: invokevirtual #65                 // Method getObjectId:()I
       500: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       503: aload_1
       504: aload         8
       506: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       509: return
       510: aload_0
       511: aload_1
       512: aload         7
       514: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
       517: iconst_2
       518: if_icmpne     527
       521: getstatic     #192                // Field ext/mods/gameserver/enums/TeleportType.CHF_LEVEL_2:Lext/mods/gameserver/enums/TeleportType;
       524: goto          530
       527: getstatic     #198                // Field ext/mods/gameserver/enums/TeleportType.CHF_LEVEL_1:Lext/mods/gameserver/enums/TeleportType;
       530: invokevirtual #201                // Method showTeleportWindow:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
       533: goto          7739
       536: aload         6
       538: ldc           #205                // String item_creation
       540: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       543: ifeq          638
       546: aload         4
       548: invokevirtual #39                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       551: ifne          555
       554: return
       555: aload_0
       556: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       559: bipush        12
       561: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
       564: astore        7
       566: aload         7
       568: ifnonnull     613
       571: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       574: dup
       575: aload_0
       576: invokevirtual #65                 // Method getObjectId:()I
       579: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       582: astore        8
       584: aload         8
       586: aload_1
       587: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       590: ldc           #185                // String html/clanHallManager/chamberlain-nac.htm
       592: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       595: aload         8
       597: ldc           #100                // String %objectId%
       599: aload_0
       600: invokevirtual #65                 // Method getObjectId:()I
       603: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       606: aload_1
       607: aload         8
       609: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       612: return
       613: aload_0
       614: aload_1
       615: aload         4
       617: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       620: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       623: aload         7
       625: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
       628: ldc           #213                // int 100000
       630: imul
       631: iadd
       632: invokevirtual #214                // Method showBuyWindow:(Lext/mods/gameserver/model/actor/Player;I)V
       635: goto          7739
       638: aload         6
       640: ldc           #218                // String support
       642: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       645: ifeq          833
       648: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       651: dup
       652: aload_0
       653: invokevirtual #65                 // Method getObjectId:()I
       656: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       659: astore        7
       661: new           #220                // class java/lang/StringBuilder
       664: dup
       665: invokespecial #222                // Method java/lang/StringBuilder."<init>":()V
       668: astore        8
       670: aload_0
       671: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       674: invokevirtual #224                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getBuffs:()Ljava/util/List;
       677: invokeinterface #228,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       682: astore        9
       684: aload         9
       686: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       691: ifeq          735
       694: aload         9
       696: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       701: checkcast     #243                // class ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff
       704: astore        10
       706: aload         8
       708: aload         10
       710: invokevirtual #245                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.id:()I
       713: aload         10
       715: invokevirtual #248                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.lvl:()I
       718: aload         10
       720: invokevirtual #251                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.desc:()Ljava/lang/String;
       723: invokedynamic #254,  0            // InvokeDynamic #1:makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
       728: invokevirtual #257                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       731: pop
       732: goto          684
       735: aload_0
       736: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       739: bipush        9
       741: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
       744: astore        9
       746: aload         9
       748: ifnonnull     765
       751: aload         7
       753: aload_1
       754: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       757: ldc           #185                // String html/clanHallManager/chamberlain-nac.htm
       759: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       762: goto          813
       765: aload         7
       767: aload_1
       768: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       771: aload         9
       773: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
       776: invokedynamic #261,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
       781: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       784: aload         7
       786: ldc_w         #264                // String %mp%
       789: aload_0
       790: invokevirtual #266                // Method getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       793: invokevirtual #270                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
       796: d2i
       797: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       800: aload         7
       802: ldc_w         #276                // String %buffs%
       805: aload         8
       807: invokevirtual #278                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       810: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       813: aload         7
       815: ldc           #100                // String %objectId%
       817: aload_0
       818: invokevirtual #65                 // Method getObjectId:()I
       821: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       824: aload_1
       825: aload         7
       827: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       830: goto          7739
       833: aload         6
       835: ldc_w         #281                // String back
       838: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       841: ifeq          852
       844: aload_0
       845: aload_1
       846: invokevirtual #283                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
       849: goto          7739
       852: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       855: dup
       856: aload_0
       857: invokevirtual #65                 // Method getObjectId:()I
       860: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       863: astore        7
       865: aload         7
       867: aload_1
       868: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       871: ldc_w         #287                // String html/clanHallManager/functions.htm
       874: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       877: aload_0
       878: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       881: iconst_4
       882: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
       885: astore        8
       887: aload         8
       889: ifnull        908
       892: aload         7
       894: ldc_w         #289                // String %xp_regen%
       897: aload         8
       899: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
       902: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       905: goto          919
       908: aload         7
       910: ldc_w         #289                // String %xp_regen%
       913: ldc_w         #291                // String 0
       916: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       919: aload_0
       920: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       923: iconst_1
       924: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
       927: astore        9
       929: aload         9
       931: ifnull        950
       934: aload         7
       936: ldc_w         #293                // String %hp_regen%
       939: aload         9
       941: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
       944: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       947: goto          961
       950: aload         7
       952: ldc_w         #293                // String %hp_regen%
       955: ldc_w         #291                // String 0
       958: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       961: aload_0
       962: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       965: iconst_2
       966: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
       969: astore        10
       971: aload         10
       973: ifnull        992
       976: aload         7
       978: ldc_w         #295                // String %mp_regen%
       981: aload         10
       983: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
       986: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       989: goto          1003
       992: aload         7
       994: ldc_w         #295                // String %mp_regen%
       997: ldc_w         #291                // String 0
      1000: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1003: aload         7
      1005: ldc_w         #297                // String %npcId%
      1008: aload_0
      1009: invokevirtual #299                // Method getNpcId:()I
      1012: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1015: aload         7
      1017: ldc           #100                // String %objectId%
      1019: aload_0
      1020: invokevirtual #65                 // Method getObjectId:()I
      1023: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1026: aload_1
      1027: aload         7
      1029: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1032: goto          7739
      1035: aload         5
      1037: ldc_w         #302                // String manage
      1040: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1043: ifeq          6994
      1046: aload_0
      1047: aload_1
      1048: getstatic     #304                // Field ext/mods/gameserver/enums/PrivilegeType.CHP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      1051: invokevirtual #59                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      1054: ifne          1058
      1057: return
      1058: aload         6
      1060: ldc_w         #307                // String recovery
      1063: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1066: ifeq          3489
      1069: aload         4
      1071: invokevirtual #39                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1074: ifeq          2525
      1077: aload_0
      1078: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      1081: invokevirtual #309                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
      1084: ifne          1088
      1087: return
      1088: aload         4
      1090: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1093: astore        6
      1095: aload         6
      1097: ldc_w         #312                // String hp_cancel
      1100: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1103: ifeq          1162
      1106: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1109: dup
      1110: aload_0
      1111: invokevirtual #65                 // Method getObjectId:()I
      1114: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1117: astore        7
      1119: aload         7
      1121: aload_1
      1122: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1125: ldc_w         #314                // String html/clanHallManager/functions-cancel.htm
      1128: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1131: aload         7
      1133: ldc_w         #316                // String %apply%
      1136: ldc_w         #318                // String recovery hp 0
      1139: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1142: aload         7
      1144: ldc           #100                // String %objectId%
      1146: aload_0
      1147: invokevirtual #65                 // Method getObjectId:()I
      1150: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1153: aload_1
      1154: aload         7
      1156: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1159: goto          7739
      1162: aload         6
      1164: ldc_w         #320                // String mp_cancel
      1167: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1170: ifeq          1229
      1173: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1176: dup
      1177: aload_0
      1178: invokevirtual #65                 // Method getObjectId:()I
      1181: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1184: astore        7
      1186: aload         7
      1188: aload_1
      1189: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1192: ldc_w         #314                // String html/clanHallManager/functions-cancel.htm
      1195: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1198: aload         7
      1200: ldc_w         #316                // String %apply%
      1203: ldc_w         #322                // String recovery mp 0
      1206: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1209: aload         7
      1211: ldc           #100                // String %objectId%
      1213: aload_0
      1214: invokevirtual #65                 // Method getObjectId:()I
      1217: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1220: aload_1
      1221: aload         7
      1223: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1226: goto          7739
      1229: aload         6
      1231: ldc_w         #324                // String exp_cancel
      1234: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1237: ifeq          1296
      1240: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1243: dup
      1244: aload_0
      1245: invokevirtual #65                 // Method getObjectId:()I
      1248: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1251: astore        7
      1253: aload         7
      1255: aload_1
      1256: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1259: ldc_w         #314                // String html/clanHallManager/functions-cancel.htm
      1262: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1265: aload         7
      1267: ldc_w         #316                // String %apply%
      1270: ldc_w         #326                // String recovery exp 0
      1273: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1276: aload         7
      1278: ldc           #100                // String %objectId%
      1280: aload_0
      1281: invokevirtual #65                 // Method getObjectId:()I
      1284: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1287: aload_1
      1288: aload         7
      1290: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1293: goto          7739
      1296: aload         6
      1298: ldc_w         #328                // String edit_hp
      1301: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1304: ifeq          1463
      1307: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1310: dup
      1311: aload_0
      1312: invokevirtual #65                 // Method getObjectId:()I
      1315: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1318: astore        7
      1320: aload         7
      1322: aload_1
      1323: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1326: ldc_w         #330                // String html/clanHallManager/functions-apply.htm
      1329: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1332: aload         7
      1334: ldc_w         #332                // String %name%
      1337: ldc_w         #334                // String Fireplace (HP Recovery Device)
      1340: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1343: aload         4
      1345: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1348: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1351: istore        8
      1353: iload         8
      1355: istore        9
      1357: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1360: iconst_1
      1361: iload         8
      1363: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      1366: istore        10
      1368: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1371: iconst_1
      1372: iload         8
      1374: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      1377: istore        11
      1379: iload         8
      1381: bipush        20
      1383: if_icmple     1389
      1386: iinc          8, -10
      1389: iload         8
      1391: bipush        20
      1393: imul
      1394: istore        12
      1396: aload         7
      1398: ldc_w         #349                // String %cost%
      1401: iload         11
      1403: iload         10
      1405: invokedynamic #351,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
      1410: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1413: aload         7
      1415: ldc_w         #354                // String %use%
      1418: iload         12
      1420: invokedynamic #356,  0            // InvokeDynamic #4:makeConcatWithConstants:(I)Ljava/lang/String;
      1425: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1428: aload         7
      1430: ldc_w         #316                // String %apply%
      1433: iload         9
      1435: invokedynamic #357,  0            // InvokeDynamic #5:makeConcatWithConstants:(I)Ljava/lang/String;
      1440: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1443: aload         7
      1445: ldc           #100                // String %objectId%
      1447: aload_0
      1448: invokevirtual #65                 // Method getObjectId:()I
      1451: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1454: aload_1
      1455: aload         7
      1457: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1460: goto          7739
      1463: aload         6
      1465: ldc_w         #358                // String edit_mp
      1468: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1471: ifeq          1629
      1474: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1477: dup
      1478: aload_0
      1479: invokevirtual #65                 // Method getObjectId:()I
      1482: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1485: astore        7
      1487: aload         7
      1489: aload_1
      1490: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1493: ldc_w         #330                // String html/clanHallManager/functions-apply.htm
      1496: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1499: aload         7
      1501: ldc_w         #332                // String %name%
      1504: ldc_w         #360                // String Carpet (MP Recovery)
      1507: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1510: aload         4
      1512: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1515: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1518: istore        8
      1520: iload         8
      1522: istore        9
      1524: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1527: iconst_2
      1528: iload         8
      1530: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      1533: istore        10
      1535: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1538: iconst_2
      1539: iload         8
      1541: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      1544: istore        11
      1546: iload         8
      1548: bipush        10
      1550: if_icmple     1556
      1553: iinc          8, -10
      1556: iload         8
      1558: iconst_5
      1559: imul
      1560: istore        12
      1562: aload         7
      1564: ldc_w         #349                // String %cost%
      1567: iload         11
      1569: iload         10
      1571: invokedynamic #351,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
      1576: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1579: aload         7
      1581: ldc_w         #354                // String %use%
      1584: iload         12
      1586: invokedynamic #362,  0            // InvokeDynamic #6:makeConcatWithConstants:(I)Ljava/lang/String;
      1591: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1594: aload         7
      1596: ldc_w         #316                // String %apply%
      1599: iload         9
      1601: invokedynamic #363,  0            // InvokeDynamic #7:makeConcatWithConstants:(I)Ljava/lang/String;
      1606: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1609: aload         7
      1611: ldc           #100                // String %objectId%
      1613: aload_0
      1614: invokevirtual #65                 // Method getObjectId:()I
      1617: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1620: aload_1
      1621: aload         7
      1623: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1626: goto          7739
      1629: aload         6
      1631: ldc_w         #364                // String edit_exp
      1634: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1637: ifeq          1795
      1640: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1643: dup
      1644: aload_0
      1645: invokevirtual #65                 // Method getObjectId:()I
      1648: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1651: astore        7
      1653: aload         7
      1655: aload_1
      1656: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1659: ldc_w         #330                // String html/clanHallManager/functions-apply.htm
      1662: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1665: aload         7
      1667: ldc_w         #332                // String %name%
      1670: ldc_w         #366                // String Chandelier (EXP Recovery Device)
      1673: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1676: aload         4
      1678: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1681: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1684: istore        8
      1686: iload         8
      1688: istore        9
      1690: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1693: iconst_4
      1694: iload         8
      1696: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      1699: istore        10
      1701: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1704: iconst_4
      1705: iload         8
      1707: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      1710: istore        11
      1712: iload         8
      1714: bipush        10
      1716: if_icmple     1722
      1719: iinc          8, -10
      1722: iload         8
      1724: iconst_5
      1725: imul
      1726: istore        12
      1728: aload         7
      1730: ldc_w         #349                // String %cost%
      1733: iload         11
      1735: iload         10
      1737: invokedynamic #351,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
      1742: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1745: aload         7
      1747: ldc_w         #354                // String %use%
      1750: iload         12
      1752: invokedynamic #368,  0            // InvokeDynamic #8:makeConcatWithConstants:(I)Ljava/lang/String;
      1757: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1760: aload         7
      1762: ldc_w         #316                // String %apply%
      1765: iload         9
      1767: invokedynamic #369,  0            // InvokeDynamic #9:makeConcatWithConstants:(I)Ljava/lang/String;
      1772: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1775: aload         7
      1777: ldc           #100                // String %objectId%
      1779: aload_0
      1780: invokevirtual #65                 // Method getObjectId:()I
      1783: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1786: aload_1
      1787: aload         7
      1789: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1792: goto          7739
      1795: aload         6
      1797: ldc_w         #370                // String hp
      1800: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      1803: ifeq          2039
      1806: aload         4
      1808: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1811: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1814: istore        7
      1816: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1819: iconst_1
      1820: iload         7
      1822: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      1825: istore        8
      1827: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      1830: iconst_1
      1831: iload         7
      1833: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      1836: istore        9
      1838: iload         7
      1840: bipush        20
      1842: if_icmple     1848
      1845: iinc          7, -10
      1848: iload         7
      1850: bipush        20
      1852: imul
      1853: istore        10
      1855: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1858: dup
      1859: aload_0
      1860: invokevirtual #65                 // Method getObjectId:()I
      1863: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1866: astore        11
      1868: aload_0
      1869: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      1872: iconst_1
      1873: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      1876: astore        12
      1878: aload         12
      1880: ifnull        1938
      1883: aload         12
      1885: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      1888: iload         10
      1890: if_icmpne     1938
      1893: aload         11
      1895: aload_1
      1896: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1899: ldc_w         #372                // String html/clanHallManager/functions-used.htm
      1902: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1905: aload         11
      1907: ldc_w         #374                // String %val%
      1910: iload         7
      1912: invokedynamic #376,  0            // InvokeDynamic #10:makeConcatWithConstants:(I)Ljava/lang/String;
      1917: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1920: aload         11
      1922: ldc           #100                // String %objectId%
      1924: aload_0
      1925: invokevirtual #65                 // Method getObjectId:()I
      1928: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1931: aload_1
      1932: aload         11
      1934: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1937: return
      1938: aload         11
      1940: aload_1
      1941: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1944: ldc_w         #377                // String html/clanHallManager/functions-apply_confirmed.htm
      1947: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1950: iload         9
      1952: istore        13
      1954: iload         10
      1956: ifne          1974
      1959: iconst_0
      1960: istore        13
      1962: aload         11
      1964: aload_1
      1965: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1968: ldc_w         #379                // String html/clanHallManager/functions-cancel_confirmed.htm
      1971: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1974: aload_0
      1975: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      1978: aload_1
      1979: iconst_1
      1980: iload         10
      1982: iload         13
      1984: getstatic     #381                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
      1987: iload         8
      1989: i2l
      1990: invokevirtual #387                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
      1993: invokevirtual #391                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.updateFunction:(Lext/mods/gameserver/model/actor/Player;IIIJ)Z
      1996: ifne          2014
      1999: aload         11
      2001: aload_1
      2002: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2005: ldc_w         #395                // String html/clanHallManager/low_adena.htm
      2008: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2011: goto          2019
      2014: aload_0
      2015: aload_1
      2016: invokevirtual #397                // Method revalidateDeco:(Lext/mods/gameserver/model/actor/Player;)V
      2019: aload         11
      2021: ldc           #100                // String %objectId%
      2023: aload_0
      2024: invokevirtual #65                 // Method getObjectId:()I
      2027: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2030: aload_1
      2031: aload         11
      2033: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2036: goto          7739
      2039: aload         6
      2041: ldc_w         #400                // String mp
      2044: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      2047: ifeq          2282
      2050: aload         4
      2052: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      2055: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      2058: istore        7
      2060: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      2063: iconst_2
      2064: iload         7
      2066: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      2069: istore        8
      2071: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      2074: iconst_2
      2075: iload         7
      2077: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      2080: istore        9
      2082: iload         7
      2084: bipush        10
      2086: if_icmple     2092
      2089: iinc          7, -10
      2092: iload         7
      2094: iconst_5
      2095: imul
      2096: istore        10
      2098: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      2101: dup
      2102: aload_0
      2103: invokevirtual #65                 // Method getObjectId:()I
      2106: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      2109: astore        11
      2111: aload_0
      2112: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      2115: iconst_2
      2116: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      2119: astore        12
      2121: aload         12
      2123: ifnull        2181
      2126: aload         12
      2128: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      2131: iload         10
      2133: if_icmpne     2181
      2136: aload         11
      2138: aload_1
      2139: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2142: ldc_w         #372                // String html/clanHallManager/functions-used.htm
      2145: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2148: aload         11
      2150: ldc_w         #374                // String %val%
      2153: iload         7
      2155: invokedynamic #376,  0            // InvokeDynamic #10:makeConcatWithConstants:(I)Ljava/lang/String;
      2160: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2163: aload         11
      2165: ldc           #100                // String %objectId%
      2167: aload_0
      2168: invokevirtual #65                 // Method getObjectId:()I
      2171: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2174: aload_1
      2175: aload         11
      2177: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2180: return
      2181: aload         11
      2183: aload_1
      2184: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2187: ldc_w         #377                // String html/clanHallManager/functions-apply_confirmed.htm
      2190: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2193: iload         9
      2195: istore        13
      2197: iload         10
      2199: ifne          2217
      2202: iconst_0
      2203: istore        13
      2205: aload         11
      2207: aload_1
      2208: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2211: ldc_w         #379                // String html/clanHallManager/functions-cancel_confirmed.htm
      2214: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2217: aload_0
      2218: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      2221: aload_1
      2222: iconst_2
      2223: iload         10
      2225: iload         13
      2227: getstatic     #381                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
      2230: iload         8
      2232: i2l
      2233: invokevirtual #387                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
      2236: invokevirtual #391                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.updateFunction:(Lext/mods/gameserver/model/actor/Player;IIIJ)Z
      2239: ifne          2257
      2242: aload         11
      2244: aload_1
      2245: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2248: ldc_w         #395                // String html/clanHallManager/low_adena.htm
      2251: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2254: goto          2262
      2257: aload_0
      2258: aload_1
      2259: invokevirtual #397                // Method revalidateDeco:(Lext/mods/gameserver/model/actor/Player;)V
      2262: aload         11
      2264: ldc           #100                // String %objectId%
      2266: aload_0
      2267: invokevirtual #65                 // Method getObjectId:()I
      2270: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2273: aload_1
      2274: aload         11
      2276: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2279: goto          7739
      2282: aload         6
      2284: ldc_w         #402                // String exp
      2287: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      2290: ifeq          7739
      2293: aload         4
      2295: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      2298: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      2301: istore        7
      2303: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      2306: iconst_4
      2307: iload         7
      2309: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      2312: istore        8
      2314: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      2317: iconst_4
      2318: iload         7
      2320: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      2323: istore        9
      2325: iload         7
      2327: bipush        20
      2329: if_icmple     2335
      2332: iinc          7, -10
      2335: iload         7
      2337: iconst_5
      2338: imul
      2339: istore        10
      2341: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      2344: dup
      2345: aload_0
      2346: invokevirtual #65                 // Method getObjectId:()I
      2349: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      2352: astore        11
      2354: aload_0
      2355: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      2358: iconst_4
      2359: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      2362: astore        12
      2364: aload         12
      2366: ifnull        2424
      2369: aload         12
      2371: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      2374: iload         10
      2376: if_icmpne     2424
      2379: aload         11
      2381: aload_1
      2382: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2385: ldc_w         #372                // String html/clanHallManager/functions-used.htm
      2388: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2391: aload         11
      2393: ldc_w         #374                // String %val%
      2396: iload         7
      2398: invokedynamic #376,  0            // InvokeDynamic #10:makeConcatWithConstants:(I)Ljava/lang/String;
      2403: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2406: aload         11
      2408: ldc           #100                // String %objectId%
      2410: aload_0
      2411: invokevirtual #65                 // Method getObjectId:()I
      2414: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2417: aload_1
      2418: aload         11
      2420: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2423: return
      2424: aload         11
      2426: aload_1
      2427: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2430: ldc_w         #377                // String html/clanHallManager/functions-apply_confirmed.htm
      2433: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2436: iload         9
      2438: istore        13
      2440: iload         10
      2442: ifne          2460
      2445: iconst_0
      2446: istore        13
      2448: aload         11
      2450: aload_1
      2451: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2454: ldc_w         #379                // String html/clanHallManager/functions-cancel_confirmed.htm
      2457: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2460: aload_0
      2461: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      2464: aload_1
      2465: iconst_4
      2466: iload         10
      2468: iload         13
      2470: getstatic     #381                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
      2473: iload         8
      2475: i2l
      2476: invokevirtual #387                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
      2479: invokevirtual #391                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.updateFunction:(Lext/mods/gameserver/model/actor/Player;IIIJ)Z
      2482: ifne          2500
      2485: aload         11
      2487: aload_1
      2488: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2491: ldc_w         #395                // String html/clanHallManager/low_adena.htm
      2494: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2497: goto          2505
      2500: aload_0
      2501: aload_1
      2502: invokevirtual #397                // Method revalidateDeco:(Lext/mods/gameserver/model/actor/Player;)V
      2505: aload         11
      2507: ldc           #100                // String %objectId%
      2509: aload_0
      2510: invokevirtual #65                 // Method getObjectId:()I
      2513: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      2516: aload_1
      2517: aload         11
      2519: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2522: goto          7739
      2525: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      2528: dup
      2529: aload_0
      2530: invokevirtual #65                 // Method getObjectId:()I
      2533: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      2536: astore        7
      2538: aload         7
      2540: aload_1
      2541: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      2544: ldc_w         #404                // String html/clanHallManager/edit_recovery.htm
      2547: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      2550: aload_0
      2551: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      2554: invokevirtual #406                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getGrade:()I
      2557: istore        8
      2559: aload_0
      2560: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      2563: instanceof    #115                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
      2566: istore        9
      2568: aload_0
      2569: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      2572: iconst_1
      2573: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      2576: astore        10
      2578: aload         10
      2580: ifnull        2758
      2583: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      2586: iconst_1
      2587: aload         10
      2589: invokevirtual #409                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getFuncLvl:()I
      2592: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      2595: istore        11
      2597: aload         7
      2599: ldc_w         #412                // String %hp_recovery%
      2602: aload         10
      2604: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      2607: aload         10
      2609: invokevirtual #414                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLease:()I
      2612: iload         11
      2614: invokedynamic #415,  0            // InvokeDynamic #11:makeConcatWithConstants:(III)Ljava/lang/String;
      2619: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2622: aload         7
      2624: ldc_w         #418                // String %hp_period%
      2627: new           #130                // class java/text/SimpleDateFormat
      2630: dup
      2631: ldc           #132                // String dd-MM-yyyy HH:mm
      2633: invokespecial #134                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      2636: aload         10
      2638: invokevirtual #420                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getEndTime:()J
      2641: invokestatic  #141                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      2644: invokevirtual #147                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      2647: invokedynamic #423,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2652: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2655: iload         8
      2657: tableswitch   { // 1 to 3

                       1: 2684

                       2: 2698

                       3: 2728
                 default: 2755
            }
      2684: aload         7
      2686: ldc_w         #424                // String %change_hp%
      2689: ldc_w         #426                // String [<a action=\"bypass -h npc_%objectId%_manage recovery hp_cancel\">Stops using</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 2\">40%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 5\">100%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 8\">160%</a>]
      2692: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2695: goto          2755
      2698: aload         7
      2700: ldc_w         #424                // String %change_hp%
      2703: iload         9
      2705: ifeq          2714
      2708: ldc_w         #428                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 25\">300%</a>]
      2711: goto          2717
      2714: ldc_w         #430                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 4\">80%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 7\">140%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 10\">200%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 260\">260%</a>]
      2717: invokedynamic #432,  0            // InvokeDynamic #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2722: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2725: goto          2755
      2728: aload         7
      2730: ldc_w         #424                // String %change_hp%
      2733: iload         9
      2735: ifeq          2744
      2738: ldc_w         #433                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 25\">300%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 30\">400%</a>]
      2741: goto          2747
      2744: ldc_w         #435                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 4\">80%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 6\">120%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 9\">180%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 12\">240%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 15\">300%</a>]
      2747: invokedynamic #432,  0            // InvokeDynamic #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2752: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2755: goto          2869
      2758: aload         7
      2760: ldc_w         #412                // String %hp_recovery%
      2763: ldc_w         #437                // String Suspended
      2766: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2769: aload         7
      2771: ldc_w         #418                // String %hp_period%
      2774: ldc_w         #437                // String Suspended
      2777: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2780: iload         8
      2782: tableswitch   { // 1 to 3

                       1: 2808

                       2: 2822

                       3: 2847
                 default: 2869
            }
      2808: aload         7
      2810: ldc_w         #424                // String %change_hp%
      2813: ldc_w         #439                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 2\">40%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 5\">100%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 8\">160%</a>]
      2816: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2819: goto          2869
      2822: aload         7
      2824: ldc_w         #424                // String %change_hp%
      2827: iload         9
      2829: ifeq          2838
      2832: ldc_w         #428                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 25\">300%</a>]
      2835: goto          2841
      2838: ldc_w         #430                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 4\">80%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 7\">140%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 10\">200%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 260\">260%</a>]
      2841: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2844: goto          2869
      2847: aload         7
      2849: ldc_w         #424                // String %change_hp%
      2852: iload         9
      2854: ifeq          2863
      2857: ldc_w         #433                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 25\">300%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 30\">400%</a>]
      2860: goto          2866
      2863: ldc_w         #435                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 4\">80%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 6\">120%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 9\">180%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 12\">240%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_hp 15\">300%</a>]
      2866: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2869: aload_0
      2870: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      2873: iconst_4
      2874: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      2877: astore        11
      2879: aload         11
      2881: ifnull        3058
      2884: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      2887: iconst_4
      2888: aload         11
      2890: invokevirtual #409                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getFuncLvl:()I
      2893: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      2896: istore        12
      2898: aload         7
      2900: ldc_w         #441                // String %exp_recovery%
      2903: aload         11
      2905: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      2908: aload         11
      2910: invokevirtual #414                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLease:()I
      2913: iload         12
      2915: invokedynamic #415,  0            // InvokeDynamic #11:makeConcatWithConstants:(III)Ljava/lang/String;
      2920: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2923: aload         7
      2925: ldc_w         #443                // String %exp_period%
      2928: new           #130                // class java/text/SimpleDateFormat
      2931: dup
      2932: ldc           #132                // String dd-MM-yyyy HH:mm
      2934: invokespecial #134                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      2937: aload         11
      2939: invokevirtual #420                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getEndTime:()J
      2942: invokestatic  #141                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      2945: invokevirtual #147                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      2948: invokedynamic #423,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2953: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2956: iload         8
      2958: tableswitch   { // 1 to 3

                       1: 2984

                       2: 2998

                       3: 3028
                 default: 3055
            }
      2984: aload         7
      2986: ldc_w         #445                // String %change_exp%
      2989: ldc_w         #447                // String [<a action=\"bypass -h npc_%objectId%_manage recovery exp_cancel\">Stops using</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 6\">30%</a>]
      2992: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      2995: goto          3055
      2998: aload         7
      3000: ldc_w         #445                // String %change_exp%
      3003: iload         9
      3005: ifeq          3014
      3008: ldc_w         #449                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 19\">45%</a>]
      3011: goto          3017
      3014: ldc_w         #451                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 5\">25%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 8\">40%</a>]
      3017: invokedynamic #453,  0            // InvokeDynamic #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      3022: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3025: goto          3055
      3028: aload         7
      3030: ldc_w         #445                // String %change_exp%
      3033: iload         9
      3035: ifeq          3044
      3038: ldc_w         #454                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 19\">45%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 20\">50%</a>]
      3041: goto          3047
      3044: ldc_w         #456                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 5\">25%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 7\">35%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 10\">50%</a>]
      3047: invokedynamic #453,  0            // InvokeDynamic #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      3052: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3055: goto          3169
      3058: aload         7
      3060: ldc_w         #441                // String %exp_recovery%
      3063: ldc_w         #437                // String Suspended
      3066: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3069: aload         7
      3071: ldc_w         #443                // String %exp_period%
      3074: ldc_w         #437                // String Suspended
      3077: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3080: iload         8
      3082: tableswitch   { // 1 to 3

                       1: 3108

                       2: 3122

                       3: 3147
                 default: 3169
            }
      3108: aload         7
      3110: ldc_w         #445                // String %change_exp%
      3113: ldc_w         #458                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 6\">30%</a>]
      3116: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3119: goto          3169
      3122: aload         7
      3124: ldc_w         #445                // String %change_exp%
      3127: iload         9
      3129: ifeq          3138
      3132: ldc_w         #449                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 19\">45%</a>]
      3135: goto          3141
      3138: ldc_w         #451                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 5\">25%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 8\">40%</a>]
      3141: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3144: goto          3169
      3147: aload         7
      3149: ldc_w         #445                // String %change_exp%
      3152: iload         9
      3154: ifeq          3163
      3157: ldc_w         #454                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 19\">45%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 20\">50%</a>]
      3160: goto          3166
      3163: ldc_w         #456                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 5\">25%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 7\">35%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_exp 10\">50%</a>]
      3166: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3169: aload_0
      3170: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      3173: iconst_2
      3174: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      3177: astore        12
      3179: aload         12
      3181: ifnull        3358
      3184: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      3187: iconst_2
      3188: aload         12
      3190: invokevirtual #409                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getFuncLvl:()I
      3193: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      3196: istore        13
      3198: aload         7
      3200: ldc_w         #460                // String %mp_recovery%
      3203: aload         12
      3205: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      3208: aload         12
      3210: invokevirtual #414                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLease:()I
      3213: iload         13
      3215: invokedynamic #415,  0            // InvokeDynamic #11:makeConcatWithConstants:(III)Ljava/lang/String;
      3220: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3223: aload         7
      3225: ldc_w         #462                // String %mp_period%
      3228: new           #130                // class java/text/SimpleDateFormat
      3231: dup
      3232: ldc           #132                // String dd-MM-yyyy HH:mm
      3234: invokespecial #134                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      3237: aload         12
      3239: invokevirtual #420                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getEndTime:()J
      3242: invokestatic  #141                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      3245: invokevirtual #147                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      3248: invokedynamic #423,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      3253: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3256: iload         8
      3258: tableswitch   { // 1 to 3

                       1: 3284

                       2: 3298

                       3: 3328
                 default: 3355
            }
      3284: aload         7
      3286: ldc_w         #464                // String %change_mp%
      3289: ldc_w         #466                // String [<a action=\"bypass -h npc_%objectId%_manage recovery mp_cancel\">Stops using</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 5\">25%</a>]
      3292: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3295: goto          3355
      3298: aload         7
      3300: ldc_w         #464                // String %change_mp%
      3303: iload         9
      3305: ifeq          3314
      3308: ldc_w         #468                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 18\">40%</a>]
      3311: goto          3317
      3314: ldc_w         #470                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 6\">30%</a>]
      3317: invokedynamic #472,  0            // InvokeDynamic #15:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      3322: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3325: goto          3355
      3328: aload         7
      3330: ldc_w         #464                // String %change_mp%
      3333: iload         9
      3335: ifeq          3344
      3338: ldc_w         #473                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 18\">40%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 20\">50%</a>]
      3341: goto          3347
      3344: ldc_w         #475                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 6\">30%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 8\">40%</a>]
      3347: invokedynamic #472,  0            // InvokeDynamic #15:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      3352: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3355: goto          3469
      3358: aload         7
      3360: ldc_w         #460                // String %mp_recovery%
      3363: ldc_w         #437                // String Suspended
      3366: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3369: aload         7
      3371: ldc_w         #462                // String %mp_period%
      3374: ldc_w         #437                // String Suspended
      3377: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3380: iload         8
      3382: tableswitch   { // 1 to 3

                       1: 3408

                       2: 3422

                       3: 3447
                 default: 3469
            }
      3408: aload         7
      3410: ldc_w         #464                // String %change_mp%
      3413: ldc_w         #477                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 5\">25%</a>]
      3416: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3419: goto          3469
      3422: aload         7
      3424: ldc_w         #464                // String %change_mp%
      3427: iload         9
      3429: ifeq          3438
      3432: ldc_w         #468                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 18\">40%</a>]
      3435: goto          3441
      3438: ldc_w         #470                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 6\">30%</a>]
      3441: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3444: goto          3469
      3447: aload         7
      3449: ldc_w         #464                // String %change_mp%
      3452: iload         9
      3454: ifeq          3463
      3457: ldc_w         #473                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 18\">40%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 20\">50%</a>]
      3460: goto          3466
      3463: ldc_w         #475                // String [<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 1\">5%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 3\">15%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 6\">30%</a>][<a action=\"bypass -h npc_%objectId%_manage recovery edit_mp 8\">40%</a>]
      3466: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3469: aload         7
      3471: ldc           #100                // String %objectId%
      3473: aload_0
      3474: invokevirtual #65                 // Method getObjectId:()I
      3477: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      3480: aload_1
      3481: aload         7
      3483: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      3486: goto          7739
      3489: aload         6
      3491: ldc_w         #479                // String other
      3494: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      3497: ifeq          5628
      3500: aload         4
      3502: invokevirtual #39                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      3505: ifeq          4938
      3508: aload_0
      3509: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      3512: invokevirtual #309                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
      3515: ifne          3519
      3518: return
      3519: aload         4
      3521: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      3524: astore        6
      3526: aload         6
      3528: ldc_w         #481                // String item_cancel
      3531: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      3534: ifeq          3593
      3537: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      3540: dup
      3541: aload_0
      3542: invokevirtual #65                 // Method getObjectId:()I
      3545: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      3548: astore        7
      3550: aload         7
      3552: aload_1
      3553: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3556: ldc_w         #314                // String html/clanHallManager/functions-cancel.htm
      3559: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3562: aload         7
      3564: ldc_w         #316                // String %apply%
      3567: ldc_w         #483                // String other item 0
      3570: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3573: aload         7
      3575: ldc           #100                // String %objectId%
      3577: aload_0
      3578: invokevirtual #65                 // Method getObjectId:()I
      3581: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      3584: aload_1
      3585: aload         7
      3587: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      3590: goto          7739
      3593: aload         6
      3595: ldc_w         #485                // String tele_cancel
      3598: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      3601: ifeq          3660
      3604: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      3607: dup
      3608: aload_0
      3609: invokevirtual #65                 // Method getObjectId:()I
      3612: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      3615: astore        7
      3617: aload         7
      3619: aload_1
      3620: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3623: ldc_w         #314                // String html/clanHallManager/functions-cancel.htm
      3626: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3629: aload         7
      3631: ldc_w         #316                // String %apply%
      3634: ldc_w         #487                // String other tele 0
      3637: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3640: aload         7
      3642: ldc           #100                // String %objectId%
      3644: aload_0
      3645: invokevirtual #65                 // Method getObjectId:()I
      3648: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      3651: aload_1
      3652: aload         7
      3654: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      3657: goto          7739
      3660: aload         6
      3662: ldc_w         #489                // String support_cancel
      3665: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      3668: ifeq          3727
      3671: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      3674: dup
      3675: aload_0
      3676: invokevirtual #65                 // Method getObjectId:()I
      3679: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      3682: astore        7
      3684: aload         7
      3686: aload_1
      3687: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3690: ldc_w         #314                // String html/clanHallManager/functions-cancel.htm
      3693: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3696: aload         7
      3698: ldc_w         #316                // String %apply%
      3701: ldc_w         #491                // String other support 0
      3704: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3707: aload         7
      3709: ldc           #100                // String %objectId%
      3711: aload_0
      3712: invokevirtual #65                 // Method getObjectId:()I
      3715: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      3718: aload_1
      3719: aload         7
      3721: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      3724: goto          7739
      3727: aload         6
      3729: ldc_w         #493                // String edit_item
      3732: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      3735: ifeq          3885
      3738: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      3741: dup
      3742: aload_0
      3743: invokevirtual #65                 // Method getObjectId:()I
      3746: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      3749: astore        7
      3751: aload         7
      3753: aload_1
      3754: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3757: ldc_w         #330                // String html/clanHallManager/functions-apply.htm
      3760: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3763: aload         7
      3765: ldc_w         #332                // String %name%
      3768: ldc_w         #495                // String Magic Equipment (Item Production Facilities)
      3771: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3774: aload         4
      3776: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      3779: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      3782: istore        8
      3784: iload         8
      3786: istore        9
      3788: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      3791: bipush        12
      3793: iload         8
      3795: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      3798: istore        10
      3800: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      3803: bipush        12
      3805: iload         8
      3807: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      3810: istore        11
      3812: iload         8
      3814: bipush        10
      3816: if_icmple     3822
      3819: iinc          8, -10
      3822: aload         7
      3824: ldc_w         #349                // String %cost%
      3827: iload         11
      3829: iload         10
      3831: invokedynamic #351,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
      3836: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3839: aload         7
      3841: ldc_w         #354                // String %use%
      3844: ldc_w         #497                // String Allow the purchase of special items at fixed intervals.
      3847: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3850: aload         7
      3852: ldc_w         #316                // String %apply%
      3855: iload         9
      3857: invokedynamic #499,  0            // InvokeDynamic #16:makeConcatWithConstants:(I)Ljava/lang/String;
      3862: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3865: aload         7
      3867: ldc           #100                // String %objectId%
      3869: aload_0
      3870: invokevirtual #65                 // Method getObjectId:()I
      3873: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      3876: aload_1
      3877: aload         7
      3879: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      3882: goto          7739
      3885: aload         6
      3887: ldc_w         #500                // String edit_support
      3890: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      3893: ifeq          4043
      3896: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      3899: dup
      3900: aload_0
      3901: invokevirtual #65                 // Method getObjectId:()I
      3904: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      3907: astore        7
      3909: aload         7
      3911: aload_1
      3912: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      3915: ldc_w         #330                // String html/clanHallManager/functions-apply.htm
      3918: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      3921: aload         7
      3923: ldc_w         #332                // String %name%
      3926: ldc_w         #502                // String Insignia (Supplementary Magic)
      3929: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3932: aload         4
      3934: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      3937: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      3940: istore        8
      3942: iload         8
      3944: istore        9
      3946: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      3949: bipush        9
      3951: iload         8
      3953: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      3956: istore        10
      3958: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      3961: bipush        9
      3963: iload         8
      3965: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      3968: istore        11
      3970: iload         8
      3972: bipush        10
      3974: if_icmple     3980
      3977: iinc          8, -10
      3980: aload         7
      3982: ldc_w         #349                // String %cost%
      3985: iload         11
      3987: iload         10
      3989: invokedynamic #351,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
      3994: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      3997: aload         7
      3999: ldc_w         #354                // String %use%
      4002: ldc_w         #504                // String Enables the use of supplementary magic.
      4005: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4008: aload         7
      4010: ldc_w         #316                // String %apply%
      4013: iload         9
      4015: invokedynamic #506,  0            // InvokeDynamic #17:makeConcatWithConstants:(I)Ljava/lang/String;
      4020: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4023: aload         7
      4025: ldc           #100                // String %objectId%
      4027: aload_0
      4028: invokevirtual #65                 // Method getObjectId:()I
      4031: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4034: aload_1
      4035: aload         7
      4037: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4040: goto          7739
      4043: aload         6
      4045: ldc_w         #507                // String edit_tele
      4048: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      4051: ifeq          4203
      4054: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      4057: dup
      4058: aload_0
      4059: invokevirtual #65                 // Method getObjectId:()I
      4062: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      4065: astore        7
      4067: aload         7
      4069: aload_1
      4070: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4073: ldc_w         #330                // String html/clanHallManager/functions-apply.htm
      4076: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4079: aload         7
      4081: ldc_w         #332                // String %name%
      4084: ldc_w         #509                // String Mirror (Teleportation Device)
      4087: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4090: aload         4
      4092: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      4095: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      4098: istore        8
      4100: iload         8
      4102: istore        9
      4104: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      4107: iconst_5
      4108: iload         8
      4110: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      4113: istore        10
      4115: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      4118: iconst_5
      4119: iload         8
      4121: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      4124: istore        11
      4126: iload         8
      4128: bipush        10
      4130: if_icmple     4136
      4133: iinc          8, -10
      4136: aload         7
      4138: ldc_w         #349                // String %cost%
      4141: iload         11
      4143: iload         10
      4145: invokedynamic #351,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
      4150: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4153: aload         7
      4155: ldc_w         #354                // String %use%
      4158: iload         8
      4160: invokedynamic #511,  0            // InvokeDynamic #18:makeConcatWithConstants:(I)Ljava/lang/String;
      4165: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4168: aload         7
      4170: ldc_w         #316                // String %apply%
      4173: iload         9
      4175: invokedynamic #512,  0            // InvokeDynamic #19:makeConcatWithConstants:(I)Ljava/lang/String;
      4180: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4183: aload         7
      4185: ldc           #100                // String %objectId%
      4187: aload_0
      4188: invokevirtual #65                 // Method getObjectId:()I
      4191: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4194: aload_1
      4195: aload         7
      4197: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4200: goto          7739
      4203: aload         6
      4205: ldc_w         #513                // String item
      4208: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      4211: ifeq          4455
      4214: aload_0
      4215: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      4218: invokevirtual #309                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
      4221: ifne          4225
      4224: return
      4225: aload         4
      4227: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      4230: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      4233: istore        7
      4235: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      4238: bipush        12
      4240: iload         7
      4242: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      4245: istore        8
      4247: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      4250: bipush        12
      4252: iload         7
      4254: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      4257: istore        9
      4259: iload         7
      4261: bipush        10
      4263: if_icmple     4269
      4266: iinc          7, -10
      4269: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      4272: dup
      4273: aload_0
      4274: invokevirtual #65                 // Method getObjectId:()I
      4277: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      4280: astore        10
      4282: aload_0
      4283: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      4286: bipush        12
      4288: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      4291: astore        11
      4293: aload         11
      4295: ifnull        4353
      4298: aload         11
      4300: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      4303: iload         7
      4305: if_icmpne     4353
      4308: aload         10
      4310: aload_1
      4311: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4314: ldc_w         #372                // String html/clanHallManager/functions-used.htm
      4317: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4320: aload         10
      4322: ldc_w         #374                // String %val%
      4325: aload         6
      4327: invokedynamic #515,  0            // InvokeDynamic #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      4332: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4335: aload         10
      4337: ldc           #100                // String %objectId%
      4339: aload_0
      4340: invokevirtual #65                 // Method getObjectId:()I
      4343: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4346: aload_1
      4347: aload         10
      4349: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4352: return
      4353: aload         10
      4355: aload_1
      4356: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4359: ldc_w         #377                // String html/clanHallManager/functions-apply_confirmed.htm
      4362: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4365: iload         9
      4367: istore        12
      4369: iload         7
      4371: ifne          4389
      4374: iconst_0
      4375: istore        12
      4377: aload         10
      4379: aload_1
      4380: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4383: ldc_w         #379                // String html/clanHallManager/functions-cancel_confirmed.htm
      4386: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4389: aload_0
      4390: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      4393: aload_1
      4394: bipush        12
      4396: iload         7
      4398: iload         12
      4400: getstatic     #381                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
      4403: iload         8
      4405: i2l
      4406: invokevirtual #387                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
      4409: invokevirtual #391                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.updateFunction:(Lext/mods/gameserver/model/actor/Player;IIIJ)Z
      4412: ifne          4430
      4415: aload         10
      4417: aload_1
      4418: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4421: ldc_w         #395                // String html/clanHallManager/low_adena.htm
      4424: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4427: goto          4435
      4430: aload_0
      4431: aload_1
      4432: invokevirtual #397                // Method revalidateDeco:(Lext/mods/gameserver/model/actor/Player;)V
      4435: aload         10
      4437: ldc           #100                // String %objectId%
      4439: aload_0
      4440: invokevirtual #65                 // Method getObjectId:()I
      4443: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4446: aload_1
      4447: aload         10
      4449: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4452: goto          7739
      4455: aload         6
      4457: ldc           #179                // String tele
      4459: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      4462: ifeq          4691
      4465: aload         4
      4467: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      4470: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      4473: istore        7
      4475: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      4478: iconst_5
      4479: iload         7
      4481: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      4484: istore        8
      4486: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      4489: iconst_5
      4490: iload         7
      4492: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      4495: istore        9
      4497: iload         7
      4499: bipush        10
      4501: if_icmple     4507
      4504: iinc          7, -10
      4507: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      4510: dup
      4511: aload_0
      4512: invokevirtual #65                 // Method getObjectId:()I
      4515: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      4518: astore        10
      4520: aload_0
      4521: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      4524: iconst_5
      4525: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      4528: astore        11
      4530: aload         11
      4532: ifnull        4590
      4535: aload         11
      4537: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      4540: iload         7
      4542: if_icmpne     4590
      4545: aload         10
      4547: aload_1
      4548: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4551: ldc_w         #372                // String html/clanHallManager/functions-used.htm
      4554: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4557: aload         10
      4559: ldc_w         #374                // String %val%
      4562: iload         7
      4564: invokedynamic #516,  0            // InvokeDynamic #20:makeConcatWithConstants:(I)Ljava/lang/String;
      4569: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4572: aload         10
      4574: ldc           #100                // String %objectId%
      4576: aload_0
      4577: invokevirtual #65                 // Method getObjectId:()I
      4580: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4583: aload_1
      4584: aload         10
      4586: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4589: return
      4590: aload         10
      4592: aload_1
      4593: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4596: ldc_w         #377                // String html/clanHallManager/functions-apply_confirmed.htm
      4599: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4602: iload         9
      4604: istore        12
      4606: iload         7
      4608: ifne          4626
      4611: iconst_0
      4612: istore        12
      4614: aload         10
      4616: aload_1
      4617: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4620: ldc_w         #379                // String html/clanHallManager/functions-cancel_confirmed.htm
      4623: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4626: aload_0
      4627: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      4630: aload_1
      4631: iconst_5
      4632: iload         7
      4634: iload         12
      4636: getstatic     #381                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
      4639: iload         8
      4641: i2l
      4642: invokevirtual #387                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
      4645: invokevirtual #391                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.updateFunction:(Lext/mods/gameserver/model/actor/Player;IIIJ)Z
      4648: ifne          4666
      4651: aload         10
      4653: aload_1
      4654: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4657: ldc_w         #395                // String html/clanHallManager/low_adena.htm
      4660: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4663: goto          4671
      4666: aload_0
      4667: aload_1
      4668: invokevirtual #397                // Method revalidateDeco:(Lext/mods/gameserver/model/actor/Player;)V
      4671: aload         10
      4673: ldc           #100                // String %objectId%
      4675: aload_0
      4676: invokevirtual #65                 // Method getObjectId:()I
      4679: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4682: aload_1
      4683: aload         10
      4685: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4688: goto          7739
      4691: aload         6
      4693: ldc           #218                // String support
      4695: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      4698: ifeq          7739
      4701: aload         4
      4703: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      4706: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      4709: istore        7
      4711: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      4714: bipush        9
      4716: iload         7
      4718: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      4721: istore        8
      4723: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      4726: bipush        9
      4728: iload         7
      4730: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      4733: istore        9
      4735: iload         7
      4737: bipush        10
      4739: if_icmple     4745
      4742: iinc          7, -10
      4745: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      4748: dup
      4749: aload_0
      4750: invokevirtual #65                 // Method getObjectId:()I
      4753: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      4756: astore        10
      4758: aload_0
      4759: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      4762: bipush        9
      4764: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      4767: astore        11
      4769: aload         11
      4771: ifnull        4829
      4774: aload         11
      4776: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      4779: iload         7
      4781: if_icmpne     4829
      4784: aload         10
      4786: aload_1
      4787: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4790: ldc_w         #372                // String html/clanHallManager/functions-used.htm
      4793: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4796: aload         10
      4798: ldc_w         #374                // String %val%
      4801: aload         6
      4803: invokedynamic #515,  0            // InvokeDynamic #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      4808: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      4811: aload         10
      4813: ldc           #100                // String %objectId%
      4815: aload_0
      4816: invokevirtual #65                 // Method getObjectId:()I
      4819: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4822: aload_1
      4823: aload         10
      4825: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4828: return
      4829: aload         10
      4831: aload_1
      4832: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4835: ldc_w         #377                // String html/clanHallManager/functions-apply_confirmed.htm
      4838: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4841: iload         9
      4843: istore        12
      4845: iload         7
      4847: ifne          4865
      4850: iconst_0
      4851: istore        12
      4853: aload         10
      4855: aload_1
      4856: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4859: ldc_w         #379                // String html/clanHallManager/functions-cancel_confirmed.htm
      4862: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4865: aload_0
      4866: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      4869: aload_1
      4870: bipush        9
      4872: iload         7
      4874: iload         12
      4876: getstatic     #381                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
      4879: iload         8
      4881: i2l
      4882: invokevirtual #387                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
      4885: invokevirtual #391                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.updateFunction:(Lext/mods/gameserver/model/actor/Player;IIIJ)Z
      4888: ifne          4906
      4891: aload         10
      4893: aload_1
      4894: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4897: ldc_w         #395                // String html/clanHallManager/low_adena.htm
      4900: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4903: goto          4918
      4906: aload_0
      4907: invokevirtual #517                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI;
      4910: invokevirtual #521                // Method ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI.resetBuffCheckTime:()V
      4913: aload_0
      4914: aload_1
      4915: invokevirtual #397                // Method revalidateDeco:(Lext/mods/gameserver/model/actor/Player;)V
      4918: aload         10
      4920: ldc           #100                // String %objectId%
      4922: aload_0
      4923: invokevirtual #65                 // Method getObjectId:()I
      4926: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      4929: aload_1
      4930: aload         10
      4932: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      4935: goto          7739
      4938: aload_0
      4939: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      4942: instanceof    #115                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
      4945: istore        7
      4947: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      4950: dup
      4951: aload_0
      4952: invokevirtual #65                 // Method getObjectId:()I
      4955: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      4958: astore        8
      4960: aload         8
      4962: aload_1
      4963: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      4966: ldc_w         #524                // String html/clanHallManager/edit_other.htm
      4969: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      4972: aload_0
      4973: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      4976: iconst_5
      4977: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      4980: astore        9
      4982: aload         9
      4984: ifnull        5089
      4987: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      4990: iconst_5
      4991: aload         9
      4993: invokevirtual #409                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getFuncLvl:()I
      4996: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      4999: istore        10
      5001: aload         8
      5003: ldc_w         #526                // String %tele%
      5006: aload         9
      5008: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      5011: aload         9
      5013: invokevirtual #414                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLease:()I
      5016: iload         10
      5018: invokedynamic #528,  0            // InvokeDynamic #21:makeConcatWithConstants:(III)Ljava/lang/String;
      5023: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5026: aload         8
      5028: ldc_w         #529                // String %tele_period%
      5031: new           #130                // class java/text/SimpleDateFormat
      5034: dup
      5035: ldc           #132                // String dd-MM-yyyy HH:mm
      5037: invokespecial #134                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      5040: aload         9
      5042: invokevirtual #420                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getEndTime:()J
      5045: invokestatic  #141                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      5048: invokevirtual #147                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      5051: invokedynamic #423,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      5056: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5059: aload         8
      5061: ldc_w         #531                // String %change_tele%
      5064: iload         7
      5066: ifeq          5075
      5069: ldc_w         #533                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_tele 1\">Level 11</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_tele 12\">Level 2</a>]
      5072: goto          5078
      5075: ldc_w         #535                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_tele 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_tele 2\">2nd Stage</a>]
      5078: invokedynamic #537,  0            // InvokeDynamic #22:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      5083: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5086: goto          5133
      5089: aload         8
      5091: ldc_w         #526                // String %tele%
      5094: ldc_w         #437                // String Suspended
      5097: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5100: aload         8
      5102: ldc_w         #529                // String %tele_period%
      5105: ldc_w         #437                // String Suspended
      5108: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5111: aload         8
      5113: ldc_w         #531                // String %change_tele%
      5116: iload         7
      5118: ifeq          5127
      5121: ldc_w         #533                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_tele 1\">Level 11</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_tele 12\">Level 2</a>]
      5124: goto          5130
      5127: ldc_w         #535                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_tele 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_tele 2\">2nd Stage</a>]
      5130: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5133: aload_0
      5134: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      5137: invokevirtual #406                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getGrade:()I
      5140: istore        10
      5142: aload_0
      5143: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      5146: bipush        9
      5148: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      5151: astore        11
      5153: aload         11
      5155: ifnull        5334
      5158: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      5161: bipush        9
      5163: aload         11
      5165: invokevirtual #409                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getFuncLvl:()I
      5168: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      5171: istore        12
      5173: aload         8
      5175: ldc_w         #538                // String %support%
      5178: aload         11
      5180: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      5183: aload         11
      5185: invokevirtual #414                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLease:()I
      5188: iload         12
      5190: invokedynamic #528,  0            // InvokeDynamic #21:makeConcatWithConstants:(III)Ljava/lang/String;
      5195: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5198: aload         8
      5200: ldc_w         #540                // String %support_period%
      5203: new           #130                // class java/text/SimpleDateFormat
      5206: dup
      5207: ldc           #132                // String dd-MM-yyyy HH:mm
      5209: invokespecial #134                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      5212: aload         11
      5214: invokevirtual #420                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getEndTime:()J
      5217: invokestatic  #141                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      5220: invokevirtual #147                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      5223: invokedynamic #423,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      5228: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5231: iload         10
      5233: tableswitch   { // 1 to 3

                       1: 5260

                       2: 5274

                       3: 5304
                 default: 5331
            }
      5260: aload         8
      5262: ldc_w         #542                // String %change_support%
      5265: ldc_w         #544                // String [<a action=\"bypass -h npc_%objectId%_manage other support_cancel\">Stops using</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 2\">2nd Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 4\">4th Level</a>]
      5268: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5271: goto          5331
      5274: aload         8
      5276: ldc_w         #542                // String %change_support%
      5279: iload         7
      5281: ifeq          5290
      5284: ldc_w         #546                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_support 15\">Level 5</a>]
      5287: goto          5293
      5290: ldc_w         #548                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_support 3\">3st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 4\">4th Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 5\">5th Level</a>]
      5293: invokedynamic #550,  0            // InvokeDynamic #23:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      5298: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5301: goto          5331
      5304: aload         8
      5306: ldc_w         #542                // String %change_support%
      5309: iload         7
      5311: ifeq          5320
      5314: ldc_w         #551                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_support 15\">Level 5</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 18\">Level 8</a>]
      5317: goto          5323
      5320: ldc_w         #553                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_support 3\">3st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 5\">5th Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 7\">7th Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 8\">8th Level</a>]
      5323: invokedynamic #550,  0            // InvokeDynamic #23:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      5328: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5331: goto          5445
      5334: aload         8
      5336: ldc_w         #538                // String %support%
      5339: ldc_w         #437                // String Suspended
      5342: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5345: aload         8
      5347: ldc_w         #540                // String %support_period%
      5350: ldc_w         #437                // String Suspended
      5353: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5356: iload         10
      5358: tableswitch   { // 1 to 3

                       1: 5384

                       2: 5398

                       3: 5423
                 default: 5445
            }
      5384: aload         8
      5386: ldc_w         #542                // String %change_support%
      5389: ldc_w         #555                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_support 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 2\">2nd Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 4\">4th Level</a>]
      5392: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5395: goto          5445
      5398: aload         8
      5400: ldc_w         #542                // String %change_support%
      5403: iload         7
      5405: ifeq          5414
      5408: ldc_w         #546                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_support 15\">Level 5</a>]
      5411: goto          5417
      5414: ldc_w         #548                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_support 3\">3st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 4\">4th Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 5\">5th Level</a>]
      5417: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5420: goto          5445
      5423: aload         8
      5425: ldc_w         #542                // String %change_support%
      5428: iload         7
      5430: ifeq          5439
      5433: ldc_w         #551                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_support 15\">Level 5</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 18\">Level 8</a>]
      5436: goto          5442
      5439: ldc_w         #553                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_support 3\">3st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 5\">5th Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 7\">7th Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_support 8\">8th Level</a>]
      5442: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5445: aload_0
      5446: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      5449: bipush        12
      5451: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      5454: astore        12
      5456: aload         12
      5458: ifnull        5564
      5461: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      5464: bipush        12
      5466: aload         12
      5468: invokevirtual #409                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getFuncLvl:()I
      5471: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      5474: istore        13
      5476: aload         8
      5478: ldc_w         #557                // String %item%
      5481: aload         12
      5483: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      5486: aload         12
      5488: invokevirtual #414                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLease:()I
      5491: iload         13
      5493: invokedynamic #528,  0            // InvokeDynamic #21:makeConcatWithConstants:(III)Ljava/lang/String;
      5498: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5501: aload         8
      5503: ldc_w         #559                // String %item_period%
      5506: new           #130                // class java/text/SimpleDateFormat
      5509: dup
      5510: ldc           #132                // String dd-MM-yyyy HH:mm
      5512: invokespecial #134                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      5515: aload         12
      5517: invokevirtual #420                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getEndTime:()J
      5520: invokestatic  #141                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      5523: invokevirtual #147                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      5526: invokedynamic #423,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      5531: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5534: aload         8
      5536: ldc_w         #561                // String %change_item%
      5539: iload         7
      5541: ifeq          5550
      5544: ldc_w         #563                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_item 11\">Level 1</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 12\">Level 2</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 13\">Level 3</a>]
      5547: goto          5553
      5550: ldc_w         #565                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_item 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 2\">2nd Stage</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 3\">3st Stage</a>]
      5553: invokedynamic #567,  0            // InvokeDynamic #24:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      5558: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5561: goto          5608
      5564: aload         8
      5566: ldc_w         #557                // String %item%
      5569: ldc_w         #437                // String Suspended
      5572: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5575: aload         8
      5577: ldc_w         #559                // String %item_period%
      5580: ldc_w         #437                // String Suspended
      5583: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5586: aload         8
      5588: ldc_w         #561                // String %change_item%
      5591: iload         7
      5593: ifeq          5602
      5596: ldc_w         #563                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_item 11\">Level 1</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 12\">Level 2</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 13\">Level 3</a>]
      5599: goto          5605
      5602: ldc_w         #565                // String [<a action=\"bypass -h npc_%objectId%_manage other edit_item 1\">1st Level</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 2\">2nd Stage</a>][<a action=\"bypass -h npc_%objectId%_manage other edit_item 3\">3st Stage</a>]
      5605: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5608: aload         8
      5610: ldc           #100                // String %objectId%
      5612: aload_0
      5613: invokevirtual #65                 // Method getObjectId:()I
      5616: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5619: aload_1
      5620: aload         8
      5622: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      5625: goto          7739
      5628: aload         6
      5630: ldc_w         #568                // String deco
      5633: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      5636: ifeq          6914
      5639: aload         4
      5641: invokevirtual #39                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      5644: ifeq          6597
      5647: aload_0
      5648: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      5651: invokevirtual #309                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
      5654: ifne          5658
      5657: return
      5658: aload         4
      5660: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      5663: astore        6
      5665: aload         6
      5667: ldc_w         #570                // String curtains_cancel
      5670: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      5673: ifeq          5732
      5676: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      5679: dup
      5680: aload_0
      5681: invokevirtual #65                 // Method getObjectId:()I
      5684: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      5687: astore        7
      5689: aload         7
      5691: aload_1
      5692: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      5695: ldc_w         #314                // String html/clanHallManager/functions-cancel.htm
      5698: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      5701: aload         7
      5703: ldc_w         #316                // String %apply%
      5706: ldc_w         #572                // String deco curtains 0
      5709: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5712: aload         7
      5714: ldc           #100                // String %objectId%
      5716: aload_0
      5717: invokevirtual #65                 // Method getObjectId:()I
      5720: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5723: aload_1
      5724: aload         7
      5726: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      5729: goto          7739
      5732: aload         6
      5734: ldc_w         #574                // String fixtures_cancel
      5737: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      5740: ifeq          5799
      5743: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      5746: dup
      5747: aload_0
      5748: invokevirtual #65                 // Method getObjectId:()I
      5751: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      5754: astore        7
      5756: aload         7
      5758: aload_1
      5759: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      5762: ldc_w         #314                // String html/clanHallManager/functions-cancel.htm
      5765: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      5768: aload         7
      5770: ldc_w         #316                // String %apply%
      5773: ldc_w         #576                // String deco fixtures 0
      5776: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5779: aload         7
      5781: ldc           #100                // String %objectId%
      5783: aload_0
      5784: invokevirtual #65                 // Method getObjectId:()I
      5787: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5790: aload_1
      5791: aload         7
      5793: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      5796: goto          7739
      5799: aload         6
      5801: ldc_w         #578                // String edit_curtains
      5804: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      5807: ifeq          5957
      5810: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      5813: dup
      5814: aload_0
      5815: invokevirtual #65                 // Method getObjectId:()I
      5818: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      5821: astore        7
      5823: aload         7
      5825: aload_1
      5826: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      5829: ldc_w         #330                // String html/clanHallManager/functions-apply.htm
      5832: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      5835: aload         7
      5837: ldc_w         #332                // String %name%
      5840: ldc_w         #580                // String Curtains (Decoration)
      5843: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5846: aload         4
      5848: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      5851: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      5854: istore        8
      5856: iload         8
      5858: istore        9
      5860: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      5863: bipush        7
      5865: iload         8
      5867: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      5870: istore        10
      5872: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      5875: bipush        7
      5877: iload         8
      5879: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      5882: istore        11
      5884: iload         8
      5886: bipush        10
      5888: if_icmple     5894
      5891: iinc          8, -10
      5894: aload         7
      5896: ldc_w         #349                // String %cost%
      5899: iload         11
      5901: iload         10
      5903: invokedynamic #351,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
      5908: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5911: aload         7
      5913: ldc_w         #354                // String %use%
      5916: ldc_w         #582                // String These curtains can be used to decorate the clan hall.
      5919: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5922: aload         7
      5924: ldc_w         #316                // String %apply%
      5927: iload         9
      5929: invokedynamic #584,  0            // InvokeDynamic #25:makeConcatWithConstants:(I)Ljava/lang/String;
      5934: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      5937: aload         7
      5939: ldc           #100                // String %objectId%
      5941: aload_0
      5942: invokevirtual #65                 // Method getObjectId:()I
      5945: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      5948: aload_1
      5949: aload         7
      5951: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      5954: goto          7739
      5957: aload         6
      5959: ldc_w         #585                // String edit_fixtures
      5962: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      5965: ifeq          6115
      5968: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      5971: dup
      5972: aload_0
      5973: invokevirtual #65                 // Method getObjectId:()I
      5976: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      5979: astore        7
      5981: aload         7
      5983: aload_1
      5984: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      5987: ldc_w         #330                // String html/clanHallManager/functions-apply.htm
      5990: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      5993: aload         7
      5995: ldc_w         #332                // String %name%
      5998: ldc_w         #587                // String Front Platform (Decoration)
      6001: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6004: aload         4
      6006: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      6009: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      6012: istore        8
      6014: iload         8
      6016: istore        9
      6018: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      6021: bipush        11
      6023: iload         8
      6025: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      6028: istore        10
      6030: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      6033: bipush        11
      6035: iload         8
      6037: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      6040: istore        11
      6042: iload         8
      6044: bipush        10
      6046: if_icmple     6052
      6049: iinc          8, -10
      6052: aload         7
      6054: ldc_w         #349                // String %cost%
      6057: iload         11
      6059: iload         10
      6061: invokedynamic #351,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
      6066: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6069: aload         7
      6071: ldc_w         #354                // String %use%
      6074: ldc_w         #589                // String Used to decorate the clan hall.
      6077: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6080: aload         7
      6082: ldc_w         #316                // String %apply%
      6085: iload         9
      6087: invokedynamic #591,  0            // InvokeDynamic #26:makeConcatWithConstants:(I)Ljava/lang/String;
      6092: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6095: aload         7
      6097: ldc           #100                // String %objectId%
      6099: aload_0
      6100: invokevirtual #65                 // Method getObjectId:()I
      6103: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      6106: aload_1
      6107: aload         7
      6109: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6112: goto          7739
      6115: aload         6
      6117: ldc_w         #592                // String curtains
      6120: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      6123: ifeq          6356
      6126: aload         4
      6128: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      6131: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      6134: istore        7
      6136: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      6139: bipush        7
      6141: iload         7
      6143: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      6146: istore        8
      6148: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      6151: bipush        7
      6153: iload         7
      6155: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      6158: istore        9
      6160: iload         7
      6162: bipush        10
      6164: if_icmple     6170
      6167: iinc          7, -10
      6170: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      6173: dup
      6174: aload_0
      6175: invokevirtual #65                 // Method getObjectId:()I
      6178: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      6181: astore        10
      6183: aload_0
      6184: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      6187: bipush        7
      6189: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      6192: astore        11
      6194: aload         11
      6196: ifnull        6254
      6199: aload         11
      6201: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      6204: iload         7
      6206: if_icmpne     6254
      6209: aload         10
      6211: aload_1
      6212: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6215: ldc_w         #372                // String html/clanHallManager/functions-used.htm
      6218: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6221: aload         10
      6223: ldc_w         #374                // String %val%
      6226: aload         6
      6228: invokedynamic #515,  0            // InvokeDynamic #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      6233: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6236: aload         10
      6238: ldc           #100                // String %objectId%
      6240: aload_0
      6241: invokevirtual #65                 // Method getObjectId:()I
      6244: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      6247: aload_1
      6248: aload         10
      6250: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6253: return
      6254: aload         10
      6256: aload_1
      6257: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6260: ldc_w         #377                // String html/clanHallManager/functions-apply_confirmed.htm
      6263: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6266: iload         9
      6268: istore        12
      6270: iload         7
      6272: ifne          6290
      6275: iconst_0
      6276: istore        12
      6278: aload         10
      6280: aload_1
      6281: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6284: ldc_w         #379                // String html/clanHallManager/functions-cancel_confirmed.htm
      6287: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6290: aload_0
      6291: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      6294: aload_1
      6295: bipush        7
      6297: iload         7
      6299: iload         12
      6301: getstatic     #381                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
      6304: iload         8
      6306: i2l
      6307: invokevirtual #387                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
      6310: invokevirtual #391                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.updateFunction:(Lext/mods/gameserver/model/actor/Player;IIIJ)Z
      6313: ifne          6331
      6316: aload         10
      6318: aload_1
      6319: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6322: ldc_w         #395                // String html/clanHallManager/low_adena.htm
      6325: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6328: goto          6336
      6331: aload_0
      6332: aload_1
      6333: invokevirtual #397                // Method revalidateDeco:(Lext/mods/gameserver/model/actor/Player;)V
      6336: aload         10
      6338: ldc           #100                // String %objectId%
      6340: aload_0
      6341: invokevirtual #65                 // Method getObjectId:()I
      6344: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      6347: aload_1
      6348: aload         10
      6350: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6353: goto          7739
      6356: aload         6
      6358: ldc_w         #594                // String fixtures
      6361: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      6364: ifeq          7739
      6367: aload         4
      6369: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      6372: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      6375: istore        7
      6377: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      6380: bipush        11
      6382: iload         7
      6384: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      6387: istore        8
      6389: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      6392: bipush        11
      6394: iload         7
      6396: invokevirtual #346                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoFee:(II)I
      6399: istore        9
      6401: iload         7
      6403: bipush        10
      6405: if_icmple     6411
      6408: iinc          7, -10
      6411: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      6414: dup
      6415: aload_0
      6416: invokevirtual #65                 // Method getObjectId:()I
      6419: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      6422: astore        10
      6424: aload_0
      6425: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      6428: bipush        11
      6430: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      6433: astore        11
      6435: aload         11
      6437: ifnull        6495
      6440: aload         11
      6442: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      6445: iload         7
      6447: if_icmpne     6495
      6450: aload         10
      6452: aload_1
      6453: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6456: ldc_w         #372                // String html/clanHallManager/functions-used.htm
      6459: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6462: aload         10
      6464: ldc_w         #374                // String %val%
      6467: aload         6
      6469: invokedynamic #515,  0            // InvokeDynamic #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      6474: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6477: aload         10
      6479: ldc           #100                // String %objectId%
      6481: aload_0
      6482: invokevirtual #65                 // Method getObjectId:()I
      6485: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      6488: aload_1
      6489: aload         10
      6491: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6494: return
      6495: aload         10
      6497: aload_1
      6498: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6501: ldc_w         #377                // String html/clanHallManager/functions-apply_confirmed.htm
      6504: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6507: iload         9
      6509: istore        12
      6511: iload         7
      6513: ifne          6531
      6516: iconst_0
      6517: istore        12
      6519: aload         10
      6521: aload_1
      6522: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6525: ldc_w         #379                // String html/clanHallManager/functions-cancel_confirmed.htm
      6528: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6531: aload_0
      6532: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      6535: aload_1
      6536: bipush        11
      6538: iload         7
      6540: iload         12
      6542: getstatic     #381                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
      6545: iload         8
      6547: i2l
      6548: invokevirtual #387                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
      6551: invokevirtual #391                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.updateFunction:(Lext/mods/gameserver/model/actor/Player;IIIJ)Z
      6554: ifne          6572
      6557: aload         10
      6559: aload_1
      6560: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6563: ldc_w         #395                // String html/clanHallManager/low_adena.htm
      6566: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6569: goto          6577
      6572: aload_0
      6573: aload_1
      6574: invokevirtual #397                // Method revalidateDeco:(Lext/mods/gameserver/model/actor/Player;)V
      6577: aload         10
      6579: ldc           #100                // String %objectId%
      6581: aload_0
      6582: invokevirtual #65                 // Method getObjectId:()I
      6585: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      6588: aload_1
      6589: aload         10
      6591: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6594: goto          7739
      6597: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      6600: dup
      6601: aload_0
      6602: invokevirtual #65                 // Method getObjectId:()I
      6605: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      6608: astore        7
      6610: aload         7
      6612: aload_1
      6613: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6616: ldc_w         #596                // String html/clanHallManager/deco.htm
      6619: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6622: aload_0
      6623: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      6626: bipush        7
      6628: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      6631: astore        8
      6633: aload         8
      6635: ifnull        6725
      6638: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      6641: bipush        7
      6643: aload         8
      6645: invokevirtual #409                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getFuncLvl:()I
      6648: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      6651: istore        9
      6653: aload         7
      6655: ldc_w         #598                // String %curtain%
      6658: aload         8
      6660: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      6663: aload         8
      6665: invokevirtual #414                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLease:()I
      6668: iload         9
      6670: invokedynamic #528,  0            // InvokeDynamic #21:makeConcatWithConstants:(III)Ljava/lang/String;
      6675: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6678: aload         7
      6680: ldc_w         #600                // String %curtain_period%
      6683: new           #130                // class java/text/SimpleDateFormat
      6686: dup
      6687: ldc           #132                // String dd-MM-yyyy HH:mm
      6689: invokespecial #134                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      6692: aload         8
      6694: invokevirtual #420                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getEndTime:()J
      6697: invokestatic  #141                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      6700: invokevirtual #147                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      6703: invokedynamic #423,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      6708: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6711: aload         7
      6713: ldc_w         #602                // String %change_curtain%
      6716: ldc_w         #604                // String [<a action=\"bypass -h npc_%objectId%_manage deco curtains_cancel\">Remove</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_curtains 1\">1st Stage</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_curtains 2\">2nd Stage</a>]
      6719: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6722: goto          6758
      6725: aload         7
      6727: ldc_w         #598                // String %curtain%
      6730: ldc_w         #437                // String Suspended
      6733: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6736: aload         7
      6738: ldc_w         #600                // String %curtain_period%
      6741: ldc_w         #437                // String Suspended
      6744: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6747: aload         7
      6749: ldc_w         #602                // String %change_curtain%
      6752: ldc_w         #606                // String [<a action=\"bypass -h npc_%objectId%_manage deco edit_curtains 1\">1st Stage</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_curtains 2\">2nd Stage</a>]
      6755: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6758: aload_0
      6759: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      6762: bipush        11
      6764: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      6767: astore        9
      6769: aload         9
      6771: ifnull        6861
      6774: invokestatic  #336                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
      6777: bipush        11
      6779: aload         9
      6781: invokevirtual #409                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getFuncLvl:()I
      6784: invokevirtual #342                // Method ext/mods/gameserver/data/manager/ClanHallManager.getDecoDays:(II)I
      6787: istore        10
      6789: aload         7
      6791: ldc_w         #608                // String %fixture%
      6794: aload         9
      6796: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      6799: aload         9
      6801: invokevirtual #414                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLease:()I
      6804: iload         10
      6806: invokedynamic #528,  0            // InvokeDynamic #21:makeConcatWithConstants:(III)Ljava/lang/String;
      6811: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6814: aload         7
      6816: ldc_w         #610                // String %fixture_period%
      6819: new           #130                // class java/text/SimpleDateFormat
      6822: dup
      6823: ldc           #132                // String dd-MM-yyyy HH:mm
      6825: invokespecial #134                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
      6828: aload         9
      6830: invokevirtual #420                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getEndTime:()J
      6833: invokestatic  #141                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      6836: invokevirtual #147                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      6839: invokedynamic #423,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      6844: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6847: aload         7
      6849: ldc_w         #612                // String %change_fixture%
      6852: ldc_w         #614                // String [<a action=\"bypass -h npc_%objectId%_manage deco fixtures_cancel\">Remove</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_fixtures 1\">1st Stage</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_fixtures 2\">2nd Stage</a>]
      6855: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6858: goto          6894
      6861: aload         7
      6863: ldc_w         #608                // String %fixture%
      6866: ldc_w         #437                // String Suspended
      6869: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6872: aload         7
      6874: ldc_w         #610                // String %fixture_period%
      6877: ldc_w         #437                // String Suspended
      6880: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6883: aload         7
      6885: ldc_w         #612                // String %change_fixture%
      6888: ldc_w         #616                // String [<a action=\"bypass -h npc_%objectId%_manage deco edit_fixtures 1\">1st Stage</a>][<a action=\"bypass -h npc_%objectId%_manage deco edit_fixtures 2\">2nd Stage</a>]
      6891: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      6894: aload         7
      6896: ldc           #100                // String %objectId%
      6898: aload_0
      6899: invokevirtual #65                 // Method getObjectId:()I
      6902: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      6905: aload_1
      6906: aload         7
      6908: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6911: goto          7739
      6914: aload         6
      6916: ldc_w         #281                // String back
      6919: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      6922: ifeq          6933
      6925: aload_0
      6926: aload_1
      6927: invokevirtual #283                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
      6930: goto          7739
      6933: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      6936: dup
      6937: aload_0
      6938: invokevirtual #65                 // Method getObjectId:()I
      6941: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      6944: astore        7
      6946: aload         7
      6948: aload_1
      6949: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      6952: aload_0
      6953: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      6956: instanceof    #115                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
      6959: ifeq          6968
      6962: ldc_w         #618                // String html/clanHallManager/manage_sch.htm
      6965: goto          6971
      6968: ldc_w         #620                // String html/clanHallManager/manage.htm
      6971: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      6974: aload         7
      6976: ldc           #100                // String %objectId%
      6978: aload_0
      6979: invokevirtual #65                 // Method getObjectId:()I
      6982: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      6985: aload_1
      6986: aload         7
      6988: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      6991: goto          7739
      6994: aload         5
      6996: ldc           #218                // String support
      6998: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      7001: ifeq          7362
      7004: aload_0
      7005: aload_1
      7006: getstatic     #176                // Field ext/mods/gameserver/enums/PrivilegeType.CHP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      7009: invokevirtual #59                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      7012: ifne          7016
      7015: return
      7016: aload_0
      7017: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      7020: bipush        9
      7022: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      7025: astore        7
      7027: aload         7
      7029: ifnull        7040
      7032: aload         7
      7034: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      7037: ifne          7041
      7040: return
      7041: aload_1
      7042: invokevirtual #622                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
      7045: ifeq          7056
      7048: aload_1
      7049: ldc_w         #625                // String The wielder of a cursed weapon cannot receive outside heals or buffs
      7052: invokevirtual #627                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      7055: return
      7056: aload_0
      7057: aload_1
      7058: invokevirtual #630                // Method setTarget:(Lext/mods/gameserver/model/WorldObject;)V
      7061: aload         6
      7063: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      7066: istore        8
      7068: aload         4
      7070: invokevirtual #39                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      7073: ifeq          7087
      7076: aload         4
      7078: invokevirtual #35                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      7081: invokestatic  #207                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      7084: goto          7088
      7087: iconst_0
      7088: istore        9
      7090: getstatic     #634                // Field ext/mods/Config.CUSTOM_BUFFER_MANAGER_NPC:Z
      7093: ifeq          7332
      7096: invokestatic  #640                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
      7099: iload         8
      7101: iload         9
      7103: invokevirtual #645                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
      7106: astore        10
      7108: aload         10
      7110: ifnull        7121
      7113: aload         10
      7115: aload_0
      7116: aload_1
      7117: invokevirtual #649                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
      7120: pop
      7121: new           #220                // class java/lang/StringBuilder
      7124: dup
      7125: invokespecial #222                // Method java/lang/StringBuilder."<init>":()V
      7128: astore        11
      7130: aload_0
      7131: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      7134: invokevirtual #224                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getBuffs:()Ljava/util/List;
      7137: invokeinterface #228,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      7142: astore        12
      7144: aload         12
      7146: invokeinterface #234,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      7151: ifeq          7218
      7154: aload         12
      7156: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      7161: checkcast     #243                // class ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff
      7164: astore        13
      7166: aload         13
      7168: invokevirtual #245                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.id:()I
      7171: iload         8
      7173: if_icmpne     7189
      7176: aload_1
      7177: bipush        57
      7179: aload         13
      7181: invokevirtual #655                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.price:()I
      7184: iconst_1
      7185: invokevirtual #658                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
      7188: pop
      7189: aload         11
      7191: aload         13
      7193: invokevirtual #245                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.id:()I
      7196: aload         13
      7198: invokevirtual #248                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.lvl:()I
      7201: aload         13
      7203: invokevirtual #251                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff.desc:()Ljava/lang/String;
      7206: invokedynamic #254,  0            // InvokeDynamic #1:makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
      7211: invokevirtual #257                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      7214: pop
      7215: goto          7144
      7218: aload_0
      7219: invokevirtual #266                // Method getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
      7222: aload         10
      7224: invokevirtual #662                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
      7227: i2d
      7228: dstore        12
      7230: dload         12
      7232: dconst_0
      7233: dcmpl
      7234: ifle          7251
      7237: dload         12
      7239: aload_0
      7240: invokevirtual #266                // Method getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
      7243: invokevirtual #270                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
      7246: dcmpl
      7247: ifle          7251
      7250: return
      7251: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      7254: dup
      7255: aload_0
      7256: invokevirtual #65                 // Method getObjectId:()I
      7259: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      7262: astore        14
      7264: aload         14
      7266: aload_1
      7267: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7270: aload         7
      7272: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      7275: invokedynamic #261,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
      7280: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7283: aload         14
      7285: ldc_w         #264                // String %mp%
      7288: aload_0
      7289: invokevirtual #266                // Method getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
      7292: invokevirtual #270                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
      7295: d2i
      7296: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7299: aload         14
      7301: ldc_w         #276                // String %buffs%
      7304: aload         11
      7306: invokevirtual #278                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      7309: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      7312: aload         14
      7314: ldc           #100                // String %objectId%
      7316: aload_0
      7317: invokevirtual #65                 // Method getObjectId:()I
      7320: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7323: aload_1
      7324: aload         14
      7326: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7329: goto          7347
      7332: aload_0
      7333: invokevirtual #517                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI;
      7336: aload_1
      7337: iload         8
      7339: iload         9
      7341: ldc2_w        #666                // double 1000000.0d
      7344: invokevirtual #668                // Method ext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI.addCastDesireHold:(Lext/mods/gameserver/model/actor/Creature;IID)V
      7347: goto          7359
      7350: astore        8
      7352: aload_1
      7353: ldc_w         #674                // String Invalid skill, contact your server support.
      7356: invokevirtual #627                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      7359: goto          7739
      7362: aload         5
      7364: ldc_w         #676                // String list_back
      7367: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      7370: ifeq          7430
      7373: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      7376: dup
      7377: aload_0
      7378: invokevirtual #65                 // Method getObjectId:()I
      7381: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      7384: astore        7
      7386: aload         7
      7388: aload_1
      7389: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7392: ldc_w         #678                // String html/clanHallManager/chamberlain.htm
      7395: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7398: aload         7
      7400: ldc_w         #680                // String %npcname%
      7403: aload_0
      7404: invokevirtual #682                // Method getName:()Ljava/lang/String;
      7407: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      7410: aload         7
      7412: ldc           #100                // String %objectId%
      7414: aload_0
      7415: invokevirtual #65                 // Method getObjectId:()I
      7418: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7421: aload_1
      7422: aload         7
      7424: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7427: goto          7739
      7430: aload         5
      7432: ldc_w         #685                // String support_back
      7435: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      7438: ifeq          7575
      7441: aload_0
      7442: aload_1
      7443: getstatic     #176                // Field ext/mods/gameserver/enums/PrivilegeType.CHP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
      7446: invokevirtual #59                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      7449: ifne          7453
      7452: return
      7453: aload_0
      7454: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      7457: bipush        9
      7459: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      7462: astore        7
      7464: aload         7
      7466: ifnull        7477
      7469: aload         7
      7471: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      7474: ifne          7478
      7477: return
      7478: new           #220                // class java/lang/StringBuilder
      7481: dup
      7482: invokespecial #222                // Method java/lang/StringBuilder."<init>":()V
      7485: astore        8
      7487: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      7490: dup
      7491: aload_0
      7492: invokevirtual #65                 // Method getObjectId:()I
      7495: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      7498: astore        9
      7500: aload         9
      7502: aload_1
      7503: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      7506: aload_0
      7507: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      7510: bipush        9
      7512: invokevirtual #181                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
      7515: invokevirtual #187                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
      7518: invokedynamic #261,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
      7523: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      7526: aload         9
      7528: ldc_w         #264                // String %mp%
      7531: aload_0
      7532: invokevirtual #266                // Method getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
      7535: invokevirtual #270                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
      7538: d2i
      7539: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7542: aload         9
      7544: ldc           #100                // String %objectId%
      7546: aload_0
      7547: invokevirtual #65                 // Method getObjectId:()I
      7550: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      7553: aload         9
      7555: ldc_w         #276                // String %buffs%
      7558: aload         8
      7560: invokevirtual #278                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      7563: invokevirtual #151                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      7566: aload_1
      7567: aload         9
      7569: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7572: goto          7739
      7575: aload         5
      7577: ldc_w         #687                // String WithdrawC
      7580: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      7583: ifeq          7657
      7586: aload_0
      7587: aload_1
      7588: getstatic     #112                // Field ext/mods/gameserver/enums/PrivilegeType.SP_WAREHOUSE_SEARCH:Lext/mods/gameserver/enums/PrivilegeType;
      7591: invokevirtual #59                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
      7594: ifne          7605
      7597: aload_1
      7598: getstatic     #689                // Field ext/mods/gameserver/network/SystemMessageId.YOU_DO_NOT_HAVE_THE_RIGHT_TO_USE_CLAN_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
      7601: invokevirtual #695                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      7604: return
      7605: aload_1
      7606: invokevirtual #698                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
      7609: invokevirtual #702                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
      7612: ifne          7623
      7615: aload_1
      7616: getstatic     #707                // Field ext/mods/gameserver/network/SystemMessageId.ONLY_LEVEL_1_CLAN_OR_HIGHER_CAN_USE_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
      7619: invokevirtual #695                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      7622: return
      7623: aload_1
      7624: aload_1
      7625: invokevirtual #698                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
      7628: invokevirtual #710                // Method ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
      7631: invokevirtual #714                // Method ext/mods/gameserver/model/actor/Player.setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
      7634: aload_1
      7635: new           #718                // class ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList
      7638: dup
      7639: aload_1
      7640: iconst_2
      7641: invokespecial #720                // Method ext/mods/gameserver/network/serverpackets/WarehouseWithdrawList."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
      7644: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7647: aload_1
      7648: getstatic     #722                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      7651: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7654: goto          7739
      7657: aload         5
      7659: ldc_w         #728                // String DepositC
      7662: invokevirtual #47                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      7665: ifeq          7733
      7668: aload_1
      7669: invokevirtual #698                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
      7672: ifnull        7723
      7675: aload_1
      7676: invokevirtual #698                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
      7679: invokevirtual #702                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
      7682: ifne          7695
      7685: aload_1
      7686: getstatic     #707                // Field ext/mods/gameserver/network/SystemMessageId.ONLY_LEVEL_1_CLAN_OR_HIGHER_CAN_USE_WAREHOUSE:Lext/mods/gameserver/network/SystemMessageId;
      7689: invokevirtual #695                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      7692: goto          7723
      7695: aload_1
      7696: aload_1
      7697: invokevirtual #698                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
      7700: invokevirtual #710                // Method ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
      7703: invokevirtual #714                // Method ext/mods/gameserver/model/actor/Player.setActiveWarehouse:(Lext/mods/gameserver/model/itemcontainer/ItemContainer;)V
      7706: aload_1
      7707: invokevirtual #730                // Method ext/mods/gameserver/model/actor/Player.tempInventoryDisable:()V
      7710: aload_1
      7711: new           #733                // class ext/mods/gameserver/network/serverpackets/WarehouseDepositList
      7714: dup
      7715: aload_1
      7716: iconst_2
      7717: invokespecial #735                // Method ext/mods/gameserver/network/serverpackets/WarehouseDepositList."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
      7720: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7723: aload_1
      7724: getstatic     #722                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      7727: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      7730: goto          7739
      7733: aload_0
      7734: aload_1
      7735: aload_2
      7736: invokespecial #736                // Method ext/mods/gameserver/model/actor/instance/Merchant.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      7739: return
      Exception table:
         from    to  target type
          7061  7250  7350   Class java/lang/Exception
          7251  7347  7350   Class java/lang/Exception
      LineNumberTable:
        line 106: 0
        line 107: 6
        line 108: 13
        line 110: 14
        line 111: 26
        line 113: 33
        line 115: 53
        line 117: 63
        line 118: 74
        line 120: 75
        line 121: 88
        line 122: 98
        line 123: 112
        line 125: 122
        line 126: 129
        line 128: 140
        line 129: 151
        line 130: 157
        line 131: 160
        line 133: 170
        line 134: 181
        line 136: 182
        line 137: 191
        line 138: 204
        line 139: 230
        line 140: 244
        line 141: 273
        line 142: 284
        line 143: 290
        line 144: 293
        line 146: 303
        line 147: 314
        line 149: 315
        line 150: 328
        line 152: 338
        line 153: 345
        line 155: 359
        line 157: 369
        line 158: 376
        line 161: 390
        line 163: 401
        line 164: 412
        line 165: 418
        line 166: 421
        line 168: 431
        line 169: 442
        line 171: 443
        line 173: 453
        line 174: 463
        line 176: 468
        line 177: 481
        line 178: 492
        line 179: 503
        line 180: 509
        line 183: 510
        line 184: 533
        line 185: 536
        line 187: 546
        line 188: 554
        line 190: 555
        line 191: 566
        line 193: 571
        line 194: 584
        line 195: 595
        line 196: 606
        line 197: 612
        line 200: 613
        line 201: 635
        line 202: 638
        line 204: 648
        line 206: 661
        line 207: 670
        line 208: 706
        line 210: 735
        line 211: 746
        line 212: 751
        line 215: 765
        line 216: 784
        line 217: 800
        line 219: 813
        line 220: 824
        line 221: 830
        line 222: 833
        line 223: 844
        line 226: 852
        line 227: 865
        line 229: 877
        line 230: 887
        line 231: 892
        line 233: 908
        line 235: 919
        line 236: 929
        line 237: 934
        line 239: 950
        line 241: 961
        line 242: 971
        line 243: 976
        line 245: 992
        line 247: 1003
        line 248: 1015
        line 249: 1026
        line 250: 1032
        line 252: 1035
        line 254: 1046
        line 255: 1057
        line 257: 1058
        line 259: 1069
        line 261: 1077
        line 262: 1087
        line 264: 1088
        line 266: 1095
        line 268: 1106
        line 269: 1119
        line 270: 1131
        line 271: 1142
        line 272: 1153
        line 273: 1159
        line 274: 1162
        line 276: 1173
        line 277: 1186
        line 278: 1198
        line 279: 1209
        line 280: 1220
        line 281: 1226
        line 282: 1229
        line 284: 1240
        line 285: 1253
        line 286: 1265
        line 287: 1276
        line 288: 1287
        line 289: 1293
        line 290: 1296
        line 292: 1307
        line 293: 1320
        line 294: 1332
        line 296: 1343
        line 297: 1353
        line 298: 1357
        line 299: 1368
        line 300: 1379
        line 301: 1386
        line 302: 1389
        line 304: 1396
        line 305: 1413
        line 306: 1428
        line 307: 1443
        line 308: 1454
        line 309: 1460
        line 310: 1463
        line 312: 1474
        line 313: 1487
        line 314: 1499
        line 316: 1510
        line 317: 1520
        line 318: 1524
        line 319: 1535
        line 321: 1546
        line 322: 1553
        line 324: 1556
        line 326: 1562
        line 327: 1579
        line 328: 1594
        line 329: 1609
        line 330: 1620
        line 331: 1626
        line 332: 1629
        line 334: 1640
        line 335: 1653
        line 336: 1665
        line 338: 1676
        line 339: 1686
        line 340: 1690
        line 341: 1701
        line 343: 1712
        line 344: 1719
        line 346: 1722
        line 348: 1728
        line 349: 1745
        line 350: 1760
        line 351: 1775
        line 352: 1786
        line 353: 1792
        line 354: 1795
        line 356: 1806
        line 357: 1816
        line 358: 1827
        line 360: 1838
        line 361: 1845
        line 363: 1848
        line 365: 1855
        line 367: 1868
        line 368: 1878
        line 370: 1893
        line 371: 1905
        line 372: 1920
        line 373: 1931
        line 374: 1937
        line 377: 1938
        line 379: 1950
        line 380: 1954
        line 382: 1959
        line 383: 1962
        line 386: 1974
        line 387: 1999
        line 389: 2014
        line 391: 2019
        line 392: 2030
        line 393: 2036
        line 394: 2039
        line 396: 2050
        line 397: 2060
        line 398: 2071
        line 400: 2082
        line 401: 2089
        line 403: 2092
        line 405: 2098
        line 407: 2111
        line 408: 2121
        line 410: 2136
        line 411: 2148
        line 412: 2163
        line 413: 2174
        line 414: 2180
        line 417: 2181
        line 419: 2193
        line 420: 2197
        line 422: 2202
        line 423: 2205
        line 426: 2217
        line 427: 2242
        line 429: 2257
        line 431: 2262
        line 432: 2273
        line 433: 2279
        line 434: 2282
        line 436: 2293
        line 437: 2303
        line 438: 2314
        line 440: 2325
        line 441: 2332
        line 443: 2335
        line 445: 2341
        line 447: 2354
        line 448: 2364
        line 450: 2379
        line 451: 2391
        line 452: 2406
        line 453: 2417
        line 454: 2423
        line 457: 2424
        line 459: 2436
        line 460: 2440
        line 462: 2445
        line 463: 2448
        line 466: 2460
        line 467: 2485
        line 469: 2500
        line 471: 2505
        line 472: 2516
        line 473: 2522
        line 477: 2525
        line 478: 2538
        line 480: 2550
        line 481: 2559
        line 483: 2568
        line 484: 2578
        line 486: 2583
        line 487: 2597
        line 488: 2622
        line 490: 2655
        line 493: 2684
        line 494: 2695
        line 497: 2698
        line 498: 2725
        line 501: 2728
        line 504: 2755
        line 507: 2758
        line 508: 2769
        line 510: 2780
        line 513: 2808
        line 514: 2819
        line 517: 2822
        line 518: 2844
        line 521: 2847
        line 526: 2869
        line 527: 2879
        line 529: 2884
        line 530: 2898
        line 531: 2923
        line 533: 2956
        line 536: 2984
        line 537: 2995
        line 540: 2998
        line 541: 3025
        line 544: 3028
        line 547: 3055
        line 550: 3058
        line 551: 3069
        line 553: 3080
        line 556: 3108
        line 557: 3119
        line 560: 3122
        line 561: 3144
        line 564: 3147
        line 569: 3169
        line 570: 3179
        line 572: 3184
        line 573: 3198
        line 574: 3223
        line 576: 3256
        line 579: 3284
        line 580: 3295
        line 583: 3298
        line 584: 3325
        line 587: 3328
        line 590: 3355
        line 593: 3358
        line 594: 3369
        line 596: 3380
        line 599: 3408
        line 600: 3419
        line 603: 3422
        line 604: 3444
        line 607: 3447
        line 611: 3469
        line 612: 3480
        line 613: 3486
        line 615: 3489
        line 617: 3500
        line 619: 3508
        line 620: 3518
        line 622: 3519
        line 624: 3526
        line 626: 3537
        line 627: 3550
        line 628: 3562
        line 629: 3573
        line 630: 3584
        line 631: 3590
        line 632: 3593
        line 634: 3604
        line 635: 3617
        line 636: 3629
        line 637: 3640
        line 638: 3651
        line 639: 3657
        line 640: 3660
        line 642: 3671
        line 643: 3684
        line 644: 3696
        line 645: 3707
        line 646: 3718
        line 647: 3724
        line 648: 3727
        line 650: 3738
        line 651: 3751
        line 652: 3763
        line 654: 3774
        line 655: 3784
        line 656: 3788
        line 657: 3800
        line 659: 3812
        line 660: 3819
        line 662: 3822
        line 663: 3839
        line 664: 3850
        line 665: 3865
        line 666: 3876
        line 667: 3882
        line 668: 3885
        line 670: 3896
        line 671: 3909
        line 672: 3921
        line 674: 3932
        line 675: 3942
        line 676: 3946
        line 677: 3958
        line 679: 3970
        line 680: 3977
        line 682: 3980
        line 683: 3997
        line 684: 4008
        line 685: 4023
        line 686: 4034
        line 687: 4040
        line 688: 4043
        line 690: 4054
        line 691: 4067
        line 692: 4079
        line 694: 4090
        line 695: 4100
        line 696: 4104
        line 697: 4115
        line 698: 4126
        line 699: 4133
        line 701: 4136
        line 702: 4153
        line 703: 4168
        line 704: 4183
        line 705: 4194
        line 706: 4200
        line 707: 4203
        line 709: 4214
        line 710: 4224
        line 712: 4225
        line 713: 4235
        line 714: 4247
        line 715: 4259
        line 716: 4266
        line 718: 4269
        line 720: 4282
        line 721: 4293
        line 723: 4308
        line 724: 4320
        line 725: 4335
        line 726: 4346
        line 727: 4352
        line 730: 4353
        line 732: 4365
        line 733: 4369
        line 735: 4374
        line 736: 4377
        line 739: 4389
        line 740: 4415
        line 742: 4430
        line 744: 4435
        line 745: 4446
        line 746: 4452
        line 747: 4455
        line 749: 4465
        line 750: 4475
        line 751: 4486
        line 753: 4497
        line 754: 4504
        line 756: 4507
        line 758: 4520
        line 759: 4530
        line 761: 4545
        line 762: 4557
        line 763: 4572
        line 764: 4583
        line 765: 4589
        line 768: 4590
        line 770: 4602
        line 771: 4606
        line 773: 4611
        line 774: 4614
        line 777: 4626
        line 778: 4651
        line 780: 4666
        line 782: 4671
        line 783: 4682
        line 784: 4688
        line 785: 4691
        line 787: 4701
        line 788: 4711
        line 789: 4723
        line 791: 4735
        line 792: 4742
        line 794: 4745
        line 796: 4758
        line 797: 4769
        line 799: 4784
        line 800: 4796
        line 801: 4811
        line 802: 4822
        line 803: 4828
        line 806: 4829
        line 808: 4841
        line 809: 4845
        line 811: 4850
        line 812: 4853
        line 815: 4865
        line 816: 4891
        line 819: 4906
        line 820: 4913
        line 823: 4918
        line 824: 4929
        line 825: 4935
        line 829: 4938
        line 830: 4947
        line 831: 4960
        line 833: 4972
        line 834: 4982
        line 836: 4987
        line 837: 5001
        line 838: 5026
        line 839: 5059
        line 840: 5086
        line 843: 5089
        line 844: 5100
        line 845: 5111
        line 848: 5133
        line 849: 5142
        line 850: 5153
        line 852: 5158
        line 853: 5173
        line 854: 5198
        line 856: 5231
        line 859: 5260
        line 860: 5271
        line 863: 5274
        line 864: 5301
        line 867: 5304
        line 870: 5331
        line 873: 5334
        line 874: 5345
        line 876: 5356
        line 879: 5384
        line 880: 5395
        line 883: 5398
        line 884: 5420
        line 887: 5423
        line 892: 5445
        line 893: 5456
        line 895: 5461
        line 896: 5476
        line 897: 5501
        line 898: 5534
        line 899: 5561
        line 902: 5564
        line 903: 5575
        line 904: 5586
        line 906: 5608
        line 907: 5619
        line 908: 5625
        line 910: 5628
        line 912: 5639
        line 914: 5647
        line 915: 5657
        line 917: 5658
        line 918: 5665
        line 920: 5676
        line 921: 5689
        line 922: 5701
        line 923: 5712
        line 924: 5723
        line 925: 5729
        line 926: 5732
        line 928: 5743
        line 929: 5756
        line 930: 5768
        line 931: 5779
        line 932: 5790
        line 933: 5796
        line 934: 5799
        line 936: 5810
        line 937: 5823
        line 938: 5835
        line 940: 5846
        line 941: 5856
        line 942: 5860
        line 943: 5872
        line 945: 5884
        line 946: 5891
        line 948: 5894
        line 949: 5911
        line 950: 5922
        line 951: 5937
        line 952: 5948
        line 953: 5954
        line 954: 5957
        line 956: 5968
        line 957: 5981
        line 958: 5993
        line 960: 6004
        line 961: 6014
        line 962: 6018
        line 963: 6030
        line 965: 6042
        line 966: 6049
        line 968: 6052
        line 969: 6069
        line 970: 6080
        line 971: 6095
        line 972: 6106
        line 973: 6112
        line 974: 6115
        line 976: 6126
        line 977: 6136
        line 978: 6148
        line 980: 6160
        line 981: 6167
        line 983: 6170
        line 985: 6183
        line 986: 6194
        line 988: 6209
        line 989: 6221
        line 990: 6236
        line 991: 6247
        line 992: 6253
        line 995: 6254
        line 997: 6266
        line 998: 6270
        line 1000: 6275
        line 1001: 6278
        line 1004: 6290
        line 1005: 6316
        line 1007: 6331
        line 1009: 6336
        line 1010: 6347
        line 1011: 6353
        line 1012: 6356
        line 1014: 6367
        line 1015: 6377
        line 1016: 6389
        line 1018: 6401
        line 1019: 6408
        line 1021: 6411
        line 1023: 6424
        line 1024: 6435
        line 1026: 6450
        line 1027: 6462
        line 1028: 6477
        line 1029: 6488
        line 1030: 6494
        line 1033: 6495
        line 1035: 6507
        line 1036: 6511
        line 1038: 6516
        line 1039: 6519
        line 1042: 6531
        line 1043: 6557
        line 1045: 6572
        line 1047: 6577
        line 1048: 6588
        line 1049: 6594
        line 1053: 6597
        line 1054: 6610
        line 1056: 6622
        line 1057: 6633
        line 1059: 6638
        line 1060: 6653
        line 1061: 6678
        line 1062: 6711
        line 1063: 6722
        line 1066: 6725
        line 1067: 6736
        line 1068: 6747
        line 1071: 6758
        line 1072: 6769
        line 1074: 6774
        line 1075: 6789
        line 1076: 6814
        line 1077: 6847
        line 1078: 6858
        line 1081: 6861
        line 1082: 6872
        line 1083: 6883
        line 1085: 6894
        line 1086: 6905
        line 1087: 6911
        line 1089: 6914
        line 1090: 6925
        line 1093: 6933
        line 1094: 6946
        line 1095: 6974
        line 1096: 6985
        line 1097: 6991
        line 1099: 6994
        line 1101: 7004
        line 1102: 7015
        line 1104: 7016
        line 1105: 7027
        line 1106: 7040
        line 1108: 7041
        line 1110: 7048
        line 1111: 7055
        line 1114: 7056
        line 1118: 7061
        line 1119: 7068
        line 1120: 7090
        line 1122: 7096
        line 1123: 7108
        line 1124: 7113
        line 1126: 7121
        line 1127: 7130
        line 1129: 7166
        line 1130: 7176
        line 1132: 7189
        line 1133: 7215
        line 1135: 7218
        line 1136: 7230
        line 1137: 7250
        line 1139: 7251
        line 1140: 7264
        line 1141: 7283
        line 1142: 7299
        line 1143: 7312
        line 1144: 7323
        line 1145: 7329
        line 1147: 7332
        line 1152: 7347
        line 1149: 7350
        line 1151: 7352
        line 1153: 7359
        line 1154: 7362
        line 1156: 7373
        line 1157: 7386
        line 1158: 7398
        line 1159: 7410
        line 1160: 7421
        line 1161: 7427
        line 1162: 7430
        line 1164: 7441
        line 1165: 7452
        line 1167: 7453
        line 1168: 7464
        line 1169: 7477
        line 1171: 7478
        line 1172: 7487
        line 1173: 7500
        line 1174: 7526
        line 1175: 7542
        line 1176: 7553
        line 1177: 7566
        line 1178: 7572
        line 1179: 7575
        line 1181: 7586
        line 1183: 7597
        line 1184: 7604
        line 1187: 7605
        line 1189: 7615
        line 1190: 7622
        line 1193: 7623
        line 1194: 7634
        line 1195: 7647
        line 1197: 7657
        line 1199: 7668
        line 1201: 7675
        line 1202: 7685
        line 1205: 7695
        line 1206: 7706
        line 1207: 7710
        line 1210: 7723
        line 1213: 7733
        line 1214: 7739
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           88      69     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          191      99     7 isSCH   Z
          204      86     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          328      90     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          481      29     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          463      70     7   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
          584      29     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          566      69     7   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
          706      26    10  buff   Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;
          661     169     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          670     160     8 buffsHtml   Ljava/lang/StringBuilder;
          746      84     9   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
          865     167     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          887     145     8 chfExp   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
          929     103     9 chfHp   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
          971      61    10 chfMp   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         1119      40     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1186      40     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1253      40     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1320     140     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1353     107     8 level   I
         1357     103     9 funcLvl   I
         1368      92    10  days   I
         1379      81    11  cost   I
         1396      64    12 percent   I
         1487     139     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1520     106     8 level   I
         1524     102     9 funcLvl   I
         1535      91    10  days   I
         1546      80    11  cost   I
         1562      64    12 percent   I
         1653     139     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1686     106     8 level   I
         1690     102     9 funcLvl   I
         1701      91    10  days   I
         1712      80    11  cost   I
         1728      64    12 percent   I
         1816     220     7 level   I
         1827     209     8  days   I
         1838     198     9  cost   I
         1855     181    10 percent   I
         1868     168    11  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1878     158    12   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         1954      82    13   fee   I
         2060     219     7 level   I
         2071     208     8  days   I
         2082     197     9  cost   I
         2098     181    10 percent   I
         2111     168    11  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         2121     158    12   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         2197      82    13   fee   I
         2303     219     7 level   I
         2314     208     8  days   I
         2325     197     9  cost   I
         2341     181    10 percent   I
         2354     168    11  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         2364     158    12   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         2440      82    13   fee   I
         2597     158    11  days   I
         2898     157    12  days   I
         3198     157    13  days   I
         2538     948     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         2559     927     8 grade   I
         2568     918     9 isSCH   Z
         2578     908    10 chfHp   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         2879     607    11 chfExp   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         3179     307    12 chfMp   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         3550      40     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         3617      40     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         3684      40     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         3751     131     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         3784      98     8 level   I
         3788      94     9 funcLvl   I
         3800      82    10  days   I
         3812      70    11  cost   I
         3909     131     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         3942      98     8 level   I
         3946      94     9 funcLvl   I
         3958      82    10  days   I
         3970      70    11  cost   I
         4067     133     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         4100     100     8 level   I
         4104      96     9 funcLvl   I
         4115      85    10  days   I
         4126      74    11  cost   I
         4235     217     7 level   I
         4247     205     8  days   I
         4259     193     9  cost   I
         4282     170    10  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         4293     159    11   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         4369      83    12   fee   I
         4475     213     7 level   I
         4486     202     8  days   I
         4497     191     9  cost   I
         4520     168    10  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         4530     158    11   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         4606      82    12   fee   I
         4711     224     7 level   I
         4723     212     8  days   I
         4735     200     9  cost   I
         4758     177    10  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         4769     166    11   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         4845      90    12   fee   I
         5001      85    10  days   I
         5173     158    12  days   I
         5476      85    13  days   I
         4947     678     7 isSCH   Z
         4960     665     8  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         4982     643     9 chfTel   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         5142     483    10 grade   I
         5153     472    11 chfSup   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         5456     169    12 chfCreate   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         5689      40     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         5756      40     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         5823     131     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         5856      98     8 level   I
         5860      94     9 funcLvl   I
         5872      82    10  days   I
         5884      70    11  cost   I
         5981     131     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         6014      98     8 level   I
         6018      94     9 funcLvl   I
         6030      82    10  days   I
         6042      70    11  cost   I
         6136     217     7 level   I
         6148     205     8  days   I
         6160     193     9  cost   I
         6183     170    10  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         6194     159    11   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         6270      83    12   fee   I
         6377     217     7 level   I
         6389     205     8  days   I
         6401     193     9  cost   I
         6424     170    10  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         6435     159    11   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         6511      83    12   fee   I
         6653      69     9  days   I
         6789      69    10  days   I
         6610     301     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         6633     278     8 chfCurtains   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         6769     142     9 chfPlateform   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         6946      45     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         7166      49    13  buff   Lext/mods/gameserver/model/residence/clanhall/ClanHall$Buff;
         7108     221    10 skill   Lext/mods/gameserver/skills/L2Skill;
         7130     199    11 buffsHtml   Ljava/lang/StringBuilder;
         7230      99    12 mpConsume   D
         7264      65    14  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         7068     279     8    id   I
         7090     257     9   lvl   I
         7352       7     8     e   Ljava/lang/Exception;
         7027     332     7   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         7386      41     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         7464     108     7   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
         7487      85     8 buffsHtml   Ljava/lang/StringBuilder;
         7500      72     9  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0    7740     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;
            0    7740     1 player   Lext/mods/gameserver/model/actor/Player;
            0    7740     2 command   Ljava/lang/String;
            6    7734     3 condition   Lext/mods/gameserver/enums/actors/NpcTalkCond;
           26    7714     4    st   Ljava/util/StringTokenizer;
           33    7707     5 actualCommand   Ljava/lang/String;
           53    7687     6   val   Ljava/lang/String;
      StackMapTable: number_of_entries = 233
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/enums/actors/NpcTalkCond ]
        frame_type = 253 /* append */
          offset_delta = 34
          locals = [ class java/util/StringTokenizer, class java/lang/String ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 27 /* same */
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 21 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale, class java/lang/String ]
        frame_type = 249 /* chop */
          offset_delta = 70
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 30 /* same */
        frame_type = 10 /* same */
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 66
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/TeleportType ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 250 /* chop */
          offset_delta = 24
        frame_type = 254 /* append */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 50
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 47 /* same */
        frame_type = 248 /* chop */
          offset_delta = 19
        frame_type = 18 /* same */
        frame_type = 253 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 22 /* same */
        frame_type = 29 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 73
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
        frame_type = 255 /* full_frame */
          offset_delta = 92
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 73
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 92
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 72
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 92
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 72
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 52
          locals = [ int, int, int ]
        frame_type = 254 /* append */
          offset_delta = 89
          locals = [ int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ int ]
        frame_type = 39 /* same */
        frame_type = 4 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 52
          locals = [ int, int, int ]
        frame_type = 254 /* append */
          offset_delta = 88
          locals = [ int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ int ]
        frame_type = 39 /* same */
        frame_type = 4 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 52
          locals = [ int, int, int ]
        frame_type = 254 /* append */
          offset_delta = 88
          locals = [ int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ int ]
        frame_type = 39 /* same */
        frame_type = 4 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 158
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = []
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 2 /* same */
        frame_type = 49 /* same */
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 2 /* same */
        frame_type = 253 /* append */
          offset_delta = 114
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 2 /* same */
        frame_type = 49 /* same */
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 2 /* same */
        frame_type = 253 /* append */
          offset_delta = 114
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 2 /* same */
        frame_type = 49 /* same */
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 29 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 73
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
        frame_type = 255 /* full_frame */
          offset_delta = 94
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 62
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 94
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 62
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 92
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 66
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 21 /* same */
        frame_type = 254 /* append */
          offset_delta = 43
          locals = [ int, int, int ]
        frame_type = 253 /* append */
          offset_delta = 83
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ int ]
        frame_type = 40 /* same */
        frame_type = 4 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 51
          locals = [ int, int, int ]
        frame_type = 253 /* append */
          offset_delta = 82
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ int ]
        frame_type = 39 /* same */
        frame_type = 4 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 53
          locals = [ int, int, int ]
        frame_type = 253 /* append */
          offset_delta = 83
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ int ]
        frame_type = 40 /* same */
        frame_type = 11 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 136
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 10
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 2 /* same */
        frame_type = 254 /* append */
          offset_delta = 126
          locals = [ int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 2 /* same */
        frame_type = 49 /* same */
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 104
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 10
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, int, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 29 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 73
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
        frame_type = 255 /* full_frame */
          offset_delta = 94
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 62
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 94
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 62
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 54
          locals = [ int, int, int ]
        frame_type = 253 /* append */
          offset_delta = 83
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ int ]
        frame_type = 40 /* same */
        frame_type = 4 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 54
          locals = [ int, int, int ]
        frame_type = 253 /* append */
          offset_delta = 83
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ int ]
        frame_type = 40 /* same */
        frame_type = 4 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 127
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 32 /* same */
        frame_type = 252 /* append */
          offset_delta = 102
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 32 /* same */
        frame_type = 248 /* chop */
          offset_delta = 19
        frame_type = 18 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/gameserver/enums/actors/NpcTalkCond, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
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
        frame_type = 253 /* append */
          offset_delta = 22
          locals = [ class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff ]
        frame_type = 249 /* chop */
          offset_delta = 28
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ double ]
        frame_type = 248 /* chop */
          offset_delta = 80
        frame_type = 249 /* chop */
          offset_delta = 14
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67
        frame_type = 22 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction ]
        frame_type = 0 /* same */
        frame_type = 250 /* chop */
          offset_delta = 96
        frame_type = 29 /* same */
        frame_type = 17 /* same */
        frame_type = 33 /* same */
        frame_type = 37 /* same */
        frame_type = 27 /* same */
        frame_type = 9 /* same */
        frame_type = 5 /* same */

  public void showChatWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_1
         1: getstatic     #722                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
         4: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
         7: new           #63                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        10: dup
        11: aload_0
        12: invokevirtual #65                 // Method getObjectId:()I
        15: invokespecial #69                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        18: astore_2
        19: aload_2
        20: aload_1
        21: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        24: aload_0
        25: aload_1
        26: invokevirtual #18                 // Method getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
        29: getstatic     #22                 // Field ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        32: if_acmpne     41
        35: ldc_w         #740                // String .htm
        38: goto          44
        41: ldc_w         #742                // String -no.htm
        44: invokedynamic #744,  0            // InvokeDynamic #27:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        49: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        52: aload_2
        53: ldc           #100                // String %objectId%
        55: aload_0
        56: invokevirtual #65                 // Method getObjectId:()I
        59: invokevirtual #102                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        62: aload_1
        63: aload_2
        64: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        67: return
      LineNumberTable:
        line 1219: 0
        line 1221: 7
        line 1222: 19
        line 1223: 52
        line 1224: 62
        line 1225: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      68     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;
            0      68     1 player   Lext/mods/gameserver/model/actor/Player;
           19      49     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/util/Locale, class java/lang/String ]

  public boolean isTeleportAllowed(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: getstatic     #176                // Field ext/mods/gameserver/enums/PrivilegeType.CHP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
         5: invokevirtual #59                 // Method validatePrivileges:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/PrivilegeType;)Z
         8: ireturn
      LineNumberTable:
        line 1230: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;
            0       9     1 player   Lext/mods/gameserver/model/actor/Player;

  protected ext.mods.gameserver.enums.actors.NpcTalkCond getNpcTalkCond(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
         4: ifnull        32
         7: aload_1
         8: invokevirtual #698                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        11: ifnull        32
        14: aload_0
        15: invokevirtual #88                 // Method getClanHall:()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        18: invokevirtual #309                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
        21: aload_1
        22: invokevirtual #745                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        25: if_icmpne     32
        28: getstatic     #22                 // Field ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        31: areturn
        32: getstatic     #748                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        35: areturn
      LineNumberTable:
        line 1236: 0
        line 1237: 28
        line 1239: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;
            0      36     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 32 /* same */

  public ext.mods.gameserver.model.actor.ai.type.NpcAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #517                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI;
         4: areturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;

  public ext.mods.gameserver.model.actor.ai.type.CreatureAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #517                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/ClanHallManagerNpcAI;
         4: areturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/ClanHallManagerNpc;
}
SourceFile: "ClanHallManagerNpc.java"
BootstrapMethods:
  0: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #859 html/clanHallManager/vault\u0001.htm
  1: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #861 <a action=\"bypass -h npc_%objectId%_support \u0001 \u0001\">\u0001</a><br1>
  2: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #863 html/clanHallManager/support\u0001.htm
  3: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #865 \u0001</font> adenas / \u0001 day</font>)
  4: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #867 Provides additional HP recovery for clan members in the clan hall.<font color=\"00FFFF\">\u0001%</font>
  5: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #869 recovery hp \u0001
  6: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #871 Provides additional MP recovery for clan members in the clan hall.<font color=\"00FFFF\">\u0001%</font>
  7: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #873 recovery mp \u0001
  8: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #875 Restores the Exp of any clan member who is resurrected in the clan hall.<font color=\"00FFFF\">\u0001%</font>
  9: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #877 recovery exp \u0001
  10: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #879 \u0001%
  11: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #881 \u0001%</font> (<font color=\"FFAABB\">\u0001</font> adenas / \u0001 day)
  12: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #883 Next fee at \u0001
  13: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #885 [<a action=\"bypass -h npc_%objectId%_manage recovery hp_cancel\">Remove</a>]\u0001
  14: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #887 [<a action=\"bypass -h npc_%objectId%_manage recovery exp_cancel\">Remove</a>]\u0001
  15: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #889 [<a action=\"bypass -h npc_%objectId%_manage recovery mp_cancel\">Remove</a>]\u0001
  16: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #891 other item \u0001
  17: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #893 other support \u0001
  18: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #895 Teleports clan members in a clan hall to the target <font color=\"00FFFF\">Stage \u0001</font> staging area
  19: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #897 other tele \u0001
  20: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #899 Stage \u0001
  21: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #901 - Stage \u0001</font> (<font color=\"FFAABB\">\u0001</font> adenas / \u0001 day)
  22: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #903 [<a action=\"bypass -h npc_%objectId%_manage other tele_cancel\">Remove</a>]\u0001
  23: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #905 [<a action=\"bypass -h npc_%objectId%_manage other support_cancel\">Remove</a>]\u0001
  24: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #907 [<a action=\"bypass -h npc_%objectId%_manage other item_cancel\">Remove</a>]\u0001
  25: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #909 deco curtains \u0001
  26: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #911 deco fixtures \u0001
  27: #915 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #913 html/clanHallManager/chamberlain\u0001
InnerClasses:
  public static final #922= #243 of #93;  // Buff=class ext/mods/gameserver/model/residence/clanhall/ClanHall$Buff of class ext/mods/gameserver/model/residence/clanhall/ClanHall
  public static final #927= #923 of #925; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
