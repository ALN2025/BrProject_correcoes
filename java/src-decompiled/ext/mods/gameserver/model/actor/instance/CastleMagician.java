// Bytecode for: ext.mods.gameserver.model.actor.instance.CastleMagician
// File: ext\mods\gameserver\model\actor\instance\CastleMagician.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/CastleMagician.class
  Last modified 9 de jul de 2026; size 5989 bytes
  MD5 checksum b6029fbdd4176438dec2c2ba06d3b213
  Compiled from "CastleMagician.java"
public class ext.mods.gameserver.model.actor.instance.CastleMagician extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #22                         // ext/mods/gameserver/model/actor/instance/CastleMagician
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 5, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
    #8 = Class              #10           // ext/mods/gameserver/network/serverpackets/ActionFailed
    #9 = NameAndType        #11:#12       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #10 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #11 = Utf8               STATIC_PACKET
   #12 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Player
   #15 = NameAndType        #17:#18       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #16 = Utf8               ext/mods/gameserver/model/actor/Player
   #17 = Utf8               sendPacket
   #18 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #19 = Class              #20           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #20 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #21 = Methodref          #22.#23       // ext/mods/gameserver/model/actor/instance/CastleMagician.getObjectId:()I
   #22 = Class              #24           // ext/mods/gameserver/model/actor/instance/CastleMagician
   #23 = NameAndType        #25:#26       // getObjectId:()I
   #24 = Utf8               ext/mods/gameserver/model/actor/instance/CastleMagician
   #25 = Utf8               getObjectId
   #26 = Utf8               ()I
   #27 = Methodref          #19.#28       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #28 = NameAndType        #5:#29        // "<init>":(I)V
   #29 = Utf8               (I)V
   #30 = Fieldref           #31.#32       // ext/mods/gameserver/model/actor/instance/CastleMagician$1.$SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
   #31 = Class              #33           // ext/mods/gameserver/model/actor/instance/CastleMagician$1
   #32 = NameAndType        #34:#35       // $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
   #33 = Utf8               ext/mods/gameserver/model/actor/instance/CastleMagician$1
   #34 = Utf8               $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond
   #35 = Utf8               [I
   #36 = Methodref          #22.#37       // ext/mods/gameserver/model/actor/instance/CastleMagician.getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #37 = NameAndType        #38:#39       // getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #38 = Utf8               getNpcTalkCond
   #39 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #40 = Methodref          #41.#42       // ext/mods/gameserver/enums/actors/NpcTalkCond.ordinal:()I
   #41 = Class              #43           // ext/mods/gameserver/enums/actors/NpcTalkCond
   #42 = NameAndType        #44:#26       // ordinal:()I
   #43 = Utf8               ext/mods/gameserver/enums/actors/NpcTalkCond
   #44 = Utf8               ordinal
   #45 = Methodref          #14.#46       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #46 = NameAndType        #47:#48       // getLocale:()Ljava/util/Locale;
   #47 = Utf8               getLocale
   #48 = Utf8               ()Ljava/util/Locale;
   #49 = String             #50           // html/castlemagician/magician-no.htm
   #50 = Utf8               html/castlemagician/magician-no.htm
   #51 = Methodref          #19.#52       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #52 = NameAndType        #53:#54       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #53 = Utf8               setFile
   #54 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #55 = String             #56           // html/castlemagician/magician-busy.htm
   #56 = Utf8               html/castlemagician/magician-busy.htm
   #57 = String             #58           // html/castlemagician/magician.htm
   #58 = Utf8               html/castlemagician/magician.htm
   #59 = InvokeDynamic      #0:#60        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #60 = NameAndType        #61:#62       // makeConcatWithConstants:(I)Ljava/lang/String;
   #61 = Utf8               makeConcatWithConstants
   #62 = Utf8               (I)Ljava/lang/String;
   #63 = String             #64           // %objectId%
   #64 = Utf8               %objectId%
   #65 = Methodref          #19.#66       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
   #66 = NameAndType        #67:#68       // replace:(Ljava/lang/String;I)V
   #67 = Utf8               replace
   #68 = Utf8               (Ljava/lang/String;I)V
   #69 = String             #70           // Chat
   #70 = Utf8               Chat
   #71 = Methodref          #72.#73       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #72 = Class              #74           // java/lang/String
   #73 = NameAndType        #75:#76       // startsWith:(Ljava/lang/String;)Z
   #74 = Utf8               java/lang/String
   #75 = Utf8               startsWith
   #76 = Utf8               (Ljava/lang/String;)Z
   #77 = Methodref          #72.#78       // java/lang/String.substring:(I)Ljava/lang/String;
   #78 = NameAndType        #79:#62       // substring:(I)Ljava/lang/String;
   #79 = Utf8               substring
   #80 = Methodref          #81.#82       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #81 = Class              #83           // java/lang/Integer
   #82 = NameAndType        #84:#85       // parseInt:(Ljava/lang/String;)I
   #83 = Utf8               java/lang/Integer
   #84 = Utf8               parseInt
   #85 = Utf8               (Ljava/lang/String;)I
   #86 = Class              #87           // java/lang/IndexOutOfBoundsException
   #87 = Utf8               java/lang/IndexOutOfBoundsException
   #88 = Class              #89           // java/lang/NumberFormatException
   #89 = Utf8               java/lang/NumberFormatException
   #90 = Methodref          #22.#91       // ext/mods/gameserver/model/actor/instance/CastleMagician.showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
   #91 = NameAndType        #92:#93       // showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
   #92 = Utf8               showChatWindow
   #93 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #94 = String             #95           // gotoleader
   #95 = Utf8               gotoleader
   #96 = Methodref          #72.#97       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #97 = NameAndType        #98:#99       // equals:(Ljava/lang/Object;)Z
   #98 = Utf8               equals
   #99 = Utf8               (Ljava/lang/Object;)Z
  #100 = Methodref          #14.#101      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #101 = NameAndType        #102:#103     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #102 = Utf8               getClan
  #103 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #104 = Methodref          #105.#106     // ext/mods/gameserver/model/pledge/Clan.getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
  #105 = Class              #107          // ext/mods/gameserver/model/pledge/Clan
  #106 = NameAndType        #108:#109     // getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
  #107 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #108 = Utf8               getLeader
  #109 = Utf8               ()Lext/mods/gameserver/model/pledge/ClanMember;
  #110 = Methodref          #111.#112     // ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
  #111 = Class              #113          // ext/mods/gameserver/model/pledge/ClanMember
  #112 = NameAndType        #114:#115     // getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
  #113 = Utf8               ext/mods/gameserver/model/pledge/ClanMember
  #114 = Utf8               getPlayerInstance
  #115 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #116 = Fieldref           #117.#118     // ext/mods/gameserver/enums/skills/EffectType.CLAN_GATE:Lext/mods/gameserver/enums/skills/EffectType;
  #117 = Class              #119          // ext/mods/gameserver/enums/skills/EffectType
  #118 = NameAndType        #120:#121     // CLAN_GATE:Lext/mods/gameserver/enums/skills/EffectType;
  #119 = Utf8               ext/mods/gameserver/enums/skills/EffectType
  #120 = Utf8               CLAN_GATE
  #121 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
  #122 = Methodref          #14.#123      // ext/mods/gameserver/model/actor/Player.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #123 = NameAndType        #124:#125     // getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #124 = Utf8               getFirstEffect
  #125 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #126 = Methodref          #22.#127      // ext/mods/gameserver/model/actor/instance/CastleMagician.validateGateCondition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #127 = NameAndType        #128:#129     // validateGateCondition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #128 = Utf8               validateGateCondition
  #129 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #130 = Methodref          #14.#131      // ext/mods/gameserver/model/actor/Player.getX:()I
  #131 = NameAndType        #132:#26      // getX:()I
  #132 = Utf8               getX
  #133 = Methodref          #14.#134      // ext/mods/gameserver/model/actor/Player.getY:()I
  #134 = NameAndType        #135:#26      // getY:()I
  #135 = Utf8               getY
  #136 = Methodref          #14.#137      // ext/mods/gameserver/model/actor/Player.getZ:()I
  #137 = NameAndType        #138:#26      // getZ:()I
  #138 = Utf8               getZ
  #139 = Methodref          #14.#140      // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #140 = NameAndType        #141:#142     // teleportTo:(IIII)Z
  #141 = Utf8               teleportTo
  #142 = Utf8               (IIII)Z
  #143 = String             #144          // html/castlemagician/magician-nogate.htm
  #144 = Utf8               html/castlemagician/magician-nogate.htm
  #145 = Methodref          #22.#146      // ext/mods/gameserver/model/actor/instance/CastleMagician.showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #146 = NameAndType        #92:#147      // showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #147 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #148 = Methodref          #2.#149       // ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #149 = NameAndType        #150:#147     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #150 = Utf8               onBypassFeedback
  #151 = Methodref          #22.#152      // ext/mods/gameserver/model/actor/instance/CastleMagician.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #152 = NameAndType        #153:#154     // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #153 = Utf8               getCastle
  #154 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
  #155 = Methodref          #156.#157     // ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #156 = Class              #158          // ext/mods/gameserver/model/residence/castle/Castle
  #157 = NameAndType        #159:#160     // getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #158 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #159 = Utf8               getSiegeZone
  #160 = Utf8               ()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #161 = Methodref          #162.#163     // ext/mods/gameserver/model/zone/type/SiegeZone.isActive:()Z
  #162 = Class              #164          // ext/mods/gameserver/model/zone/type/SiegeZone
  #163 = NameAndType        #165:#166     // isActive:()Z
  #164 = Utf8               ext/mods/gameserver/model/zone/type/SiegeZone
  #165 = Utf8               isActive
  #166 = Utf8               ()Z
  #167 = Fieldref           #41.#168      // ext/mods/gameserver/enums/actors/NpcTalkCond.UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #168 = NameAndType        #169:#170     // UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #169 = Utf8               UNDER_SIEGE
  #170 = Utf8               Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #171 = Methodref          #156.#172     // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
  #172 = NameAndType        #173:#26      // getOwnerId:()I
  #173 = Utf8               getOwnerId
  #174 = Methodref          #14.#175      // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #175 = NameAndType        #176:#26      // getClanId:()I
  #176 = Utf8               getClanId
  #177 = Fieldref           #41.#178      // ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #178 = NameAndType        #179:#170     // OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #179 = Utf8               OWNER
  #180 = Fieldref           #41.#181      // ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #181 = NameAndType        #182:#170     // NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #182 = Utf8               NONE
  #183 = Methodref          #14.#184      // ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
  #184 = NameAndType        #185:#166     // isAlikeDead:()Z
  #185 = Utf8               isAlikeDead
  #186 = Methodref          #14.#187      // ext/mods/gameserver/model/actor/Player.isOperating:()Z
  #187 = NameAndType        #188:#166     // isOperating:()Z
  #188 = Utf8               isOperating
  #189 = Methodref          #14.#190      // ext/mods/gameserver/model/actor/Player.isRooted:()Z
  #190 = NameAndType        #191:#166     // isRooted:()Z
  #191 = Utf8               isRooted
  #192 = Methodref          #14.#193      // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
  #193 = NameAndType        #194:#166     // isInCombat:()Z
  #194 = Utf8               isInCombat
  #195 = Methodref          #14.#196      // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #196 = NameAndType        #197:#166     // isInOlympiadMode:()Z
  #197 = Utf8               isInOlympiadMode
  #198 = Methodref          #14.#199      // ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
  #199 = NameAndType        #200:#166     // isFestivalParticipant:()Z
  #200 = Utf8               isFestivalParticipant
  #201 = Methodref          #14.#202      // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
  #202 = NameAndType        #203:#166     // isInObserverMode:()Z
  #203 = Utf8               isInObserverMode
  #204 = Fieldref           #205.#206     // ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #205 = Class              #207          // ext/mods/gameserver/enums/ZoneId
  #206 = NameAndType        #208:#209     // NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #207 = Utf8               ext/mods/gameserver/enums/ZoneId
  #208 = Utf8               NO_SUMMON_FRIEND
  #209 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #210 = Methodref          #14.#211      // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #211 = NameAndType        #212:#213     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #212 = Utf8               isInsideZone
  #213 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #214 = String             #215          // Couldn\'t teleport to clan leader. The requirements was not meet.
  #215 = Utf8               Couldn\'t teleport to clan leader. The requirements was not meet.
  #216 = Methodref          #14.#217      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #217 = NameAndType        #218:#219     // sendMessage:(Ljava/lang/String;)V
  #218 = Utf8               sendMessage
  #219 = Utf8               (Ljava/lang/String;)V
  #220 = Methodref          #14.#221      // ext/mods/gameserver/model/actor/Player.isIn7sDungeon:()Z
  #221 = NameAndType        #222:#166     // isIn7sDungeon:()Z
  #222 = Utf8               isIn7sDungeon
  #223 = Methodref          #224.#225     // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #224 = Class              #226          // ext/mods/gameserver/data/manager/SevenSignsManager
  #225 = NameAndType        #227:#228     // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #226 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
  #227 = Utf8               getInstance
  #228 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #229 = Methodref          #14.#23       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #230 = Methodref          #224.#231     // ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
  #231 = NameAndType        #232:#233     // getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
  #232 = Utf8               getPlayerCabal
  #233 = Utf8               (I)Lext/mods/gameserver/enums/CabalType;
  #234 = Methodref          #224.#235     // ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
  #235 = NameAndType        #236:#166     // isSealValidationPeriod:()Z
  #236 = Utf8               isSealValidationPeriod
  #237 = Methodref          #224.#238     // ext/mods/gameserver/data/manager/SevenSignsManager.getWinningCabal:()Lext/mods/gameserver/enums/CabalType;
  #238 = NameAndType        #239:#240     // getWinningCabal:()Lext/mods/gameserver/enums/CabalType;
  #239 = Utf8               getWinningCabal
  #240 = Utf8               ()Lext/mods/gameserver/enums/CabalType;
  #241 = Fieldref           #242.#243     // ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
  #242 = Class              #244          // ext/mods/gameserver/enums/CabalType
  #243 = NameAndType        #245:#246     // NORMAL:Lext/mods/gameserver/enums/CabalType;
  #244 = Utf8               ext/mods/gameserver/enums/CabalType
  #245 = Utf8               NORMAL
  #246 = Utf8               Lext/mods/gameserver/enums/CabalType;
  #247 = Utf8               Code
  #248 = Utf8               LineNumberTable
  #249 = Utf8               LocalVariableTable
  #250 = Utf8               this
  #251 = Utf8               Lext/mods/gameserver/model/actor/instance/CastleMagician;
  #252 = Utf8               objectId
  #253 = Utf8               I
  #254 = Utf8               template
  #255 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #256 = Utf8               player
  #257 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #258 = Utf8               val
  #259 = Utf8               html
  #260 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #261 = Utf8               StackMapTable
  #262 = Utf8               clanLeader
  #263 = Utf8               filename
  #264 = Utf8               Ljava/lang/String;
  #265 = Utf8               command
  #266 = Class              #267          // java/lang/RuntimeException
  #267 = Utf8               java/lang/RuntimeException
  #268 = Utf8               targetCabal
  #269 = Utf8               SourceFile
  #270 = Utf8               CastleMagician.java
  #271 = Utf8               NestMembers
  #272 = Utf8               BootstrapMethods
  #273 = String             #274          // html/castlemagician/magician-\u0001.htm
  #274 = Utf8               html/castlemagician/magician-\u0001.htm
  #275 = MethodHandle       6:#276        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #276 = Methodref          #277.#278     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #277 = Class              #279          // java/lang/invoke/StringConcatFactory
  #278 = NameAndType        #61:#280      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #279 = Utf8               java/lang/invoke/StringConcatFactory
  #280 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #281 = Utf8               InnerClasses
  #282 = Class              #283          // java/lang/invoke/MethodHandles$Lookup
  #283 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #284 = Class              #285          // java/lang/invoke/MethodHandles
  #285 = Utf8               java/lang/invoke/MethodHandles
  #286 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.CastleMagician(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
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
        line 34: 0
        line 35: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/CastleMagician;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_1
         1: getstatic     #7                  // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
         4: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
         7: new           #19                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        10: dup
        11: aload_0
        12: invokevirtual #21                 // Method getObjectId:()I
        15: invokespecial #27                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        18: astore_3
        19: getstatic     #30                 // Field ext/mods/gameserver/model/actor/instance/CastleMagician$1.$SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
        22: aload_0
        23: aload_1
        24: invokevirtual #36                 // Method getNpcTalkCond:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
        27: invokevirtual #40                 // Method ext/mods/gameserver/enums/actors/NpcTalkCond.ordinal:()I
        30: iaload
        31: lookupswitch  { // 2

                       1: 56

                       2: 69
                 default: 82
            }
        56: aload_3
        57: aload_1
        58: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        61: ldc           #49                 // String html/castlemagician/magician-no.htm
        63: invokevirtual #51                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        66: goto          113
        69: aload_3
        70: aload_1
        71: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        74: ldc           #55                 // String html/castlemagician/magician-busy.htm
        76: invokevirtual #51                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        79: goto          113
        82: iload_2
        83: ifne          99
        86: aload_3
        87: aload_1
        88: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        91: ldc           #57                 // String html/castlemagician/magician.htm
        93: invokevirtual #51                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        96: goto          113
        99: aload_3
       100: aload_1
       101: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       104: iload_2
       105: invokedynamic #59,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       110: invokevirtual #51                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       113: aload_3
       114: ldc           #63                 // String %objectId%
       116: aload_0
       117: invokevirtual #21                 // Method getObjectId:()I
       120: invokevirtual #65                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       123: aload_1
       124: aload_3
       125: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       128: return
      LineNumberTable:
        line 40: 0
        line 42: 7
        line 44: 19
        line 47: 56
        line 48: 66
        line 51: 69
        line 52: 79
        line 55: 82
        line 56: 86
        line 58: 99
        line 63: 113
        line 64: 123
        line 65: 128
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     129     0  this   Lext/mods/gameserver/model/actor/instance/CastleMagician;
            0     129     1 player   Lext/mods/gameserver/model/actor/Player;
            0     129     2   val   I
           19     110     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 16 /* same */
        frame_type = 13 /* same */

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=3
         0: aload_2
         1: ldc           #69                 // String Chat
         3: invokevirtual #71                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          34
         9: iconst_0
        10: istore_3
        11: aload_2
        12: iconst_5
        13: invokevirtual #77                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        16: invokestatic  #80                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        19: istore_3
        20: goto          25
        23: astore        4
        25: aload_0
        26: aload_1
        27: iload_3
        28: invokevirtual #90                 // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
        31: goto          124
        34: aload_2
        35: ldc           #94                 // String gotoleader
        37: invokevirtual #96                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        40: ifeq          118
        43: aload_1
        44: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        47: ifnull        124
        50: aload_1
        51: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        54: invokevirtual #104                // Method ext/mods/gameserver/model/pledge/Clan.getLeader:()Lext/mods/gameserver/model/pledge/ClanMember;
        57: invokevirtual #110                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
        60: astore_3
        61: aload_3
        62: ifnonnull     66
        65: return
        66: aload_3
        67: getstatic     #116                // Field ext/mods/gameserver/enums/skills/EffectType.CLAN_GATE:Lext/mods/gameserver/enums/skills/EffectType;
        70: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
        73: ifnull        104
        76: aload_3
        77: aload_1
        78: invokestatic  #126                // Method validateGateCondition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
        81: ifne          85
        84: return
        85: aload_1
        86: aload_3
        87: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.getX:()I
        90: aload_3
        91: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getY:()I
        94: aload_3
        95: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
        98: iconst_0
        99: invokevirtual #139                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       102: pop
       103: return
       104: ldc           #143                // String html/castlemagician/magician-nogate.htm
       106: astore        4
       108: aload_0
       109: aload_1
       110: aload         4
       112: invokevirtual #145                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       115: goto          124
       118: aload_0
       119: aload_1
       120: aload_2
       121: invokespecial #148                // Method ext/mods/gameserver/model/actor/instance/Folk.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       124: return
      Exception table:
         from    to  target type
            11    20    23   Class java/lang/IndexOutOfBoundsException
            11    20    23   Class java/lang/NumberFormatException
      LineNumberTable:
        line 70: 0
        line 72: 9
        line 75: 11
        line 79: 20
        line 77: 23
        line 80: 25
        line 81: 31
        line 82: 34
        line 84: 43
        line 86: 50
        line 87: 61
        line 88: 65
        line 90: 66
        line 92: 76
        line 93: 84
        line 95: 85
        line 96: 103
        line 98: 104
        line 99: 108
        line 100: 115
        line 103: 118
        line 104: 124
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           11      20     3   val   I
           61      54     3 clanLeader   Lext/mods/gameserver/model/actor/Player;
          108       7     4 filename   Ljava/lang/String;
            0     125     0  this   Lext/mods/gameserver/model/actor/instance/CastleMagician;
            0     125     1 player   Lext/mods/gameserver/model/actor/Player;
            0     125     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/actor/instance/CastleMagician, class ext/mods/gameserver/model/actor/Player, class java/lang/String, int ]
          stack = [ class java/lang/RuntimeException ]
        frame_type = 1 /* same */
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 18 /* same */
        frame_type = 18 /* same */
        frame_type = 250 /* chop */
          offset_delta = 13
        frame_type = 5 /* same */

  protected ext.mods.gameserver.enums.actors.NpcTalkCond getNpcTalkCond(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #151                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
         4: ifnull        49
         7: aload_1
         8: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        11: ifnull        49
        14: aload_0
        15: invokevirtual #151                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        18: invokevirtual #155                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
        21: invokevirtual #161                // Method ext/mods/gameserver/model/zone/type/SiegeZone.isActive:()Z
        24: ifeq          31
        27: getstatic     #167                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        30: areturn
        31: aload_0
        32: invokevirtual #151                // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        35: invokevirtual #171                // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        38: aload_1
        39: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        42: if_icmpne     49
        45: getstatic     #177                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        48: areturn
        49: getstatic     #180                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        52: areturn
      LineNumberTable:
        line 109: 0
        line 111: 14
        line 112: 27
        line 114: 31
        line 115: 45
        line 117: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/model/actor/instance/CastleMagician;
            0      53     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 31 /* same */
        frame_type = 17 /* same */
}
SourceFile: "CastleMagician.java"
NestMembers:
  ext/mods/gameserver/model/actor/instance/CastleMagician$1
BootstrapMethods:
  0: #275 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #273 html/castlemagician/magician-\u0001.htm
InnerClasses:
  static #31;                             // class ext/mods/gameserver/model/actor/instance/CastleMagician$1
  public static final #286= #282 of #284; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
