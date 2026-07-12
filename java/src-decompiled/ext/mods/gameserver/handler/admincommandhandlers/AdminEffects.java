// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminEffects
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminEffects.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminEffects.class
  Last modified 9 de jul de 2026; size 13593 bytes
  MD5 checksum 9fbbcf5f77139f097d5f4ee58e6e1ed3
  Compiled from "AdminEffects.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminEffects implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #78                         // ext/mods/gameserver/handler/admincommandhandlers/AdminEffects
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_hide
    #8 = Utf8               admin_hide
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #16 = Class              #18           // ext/mods/gameserver/model/actor/Player
   #17 = NameAndType        #19:#20       // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #18 = Utf8               ext/mods/gameserver/model/actor/Player
   #19 = Utf8               getAppearance
   #20 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #21 = Methodref          #22.#23       // ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
   #22 = Class              #24           // ext/mods/gameserver/model/actor/container/player/Appearance
   #23 = NameAndType        #25:#26       // isVisible:()Z
   #24 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
   #25 = Utf8               isVisible
   #26 = Utf8               ()Z
   #27 = Methodref          #22.#28       // ext/mods/gameserver/model/actor/container/player/Appearance.setVisible:(Z)V
   #28 = NameAndType        #29:#30       // setVisible:(Z)V
   #29 = Utf8               setVisible
   #30 = Utf8               (Z)V
   #31 = Methodref          #16.#32       // ext/mods/gameserver/model/actor/Player.decayMe:()V
   #32 = NameAndType        #33:#6        // decayMe:()V
   #33 = Utf8               decayMe
   #34 = Methodref          #16.#35       // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
   #35 = NameAndType        #36:#6        // broadcastUserInfo:()V
   #36 = Utf8               broadcastUserInfo
   #37 = Methodref          #16.#38       // ext/mods/gameserver/model/actor/Player.spawnMe:()V
   #38 = NameAndType        #39:#6        // spawnMe:()V
   #39 = Utf8               spawnMe
   #40 = Methodref          #16.#41       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #41 = NameAndType        #42:#43       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #42 = Utf8               getSummon
   #43 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #44 = Methodref          #45.#32       // ext/mods/gameserver/model/actor/Summon.decayMe:()V
   #45 = Class              #46           // ext/mods/gameserver/model/actor/Summon
   #46 = Utf8               ext/mods/gameserver/model/actor/Summon
   #47 = Methodref          #45.#48       // ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #48 = NameAndType        #49:#50       // getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #49 = Utf8               getStatus
   #50 = Utf8               ()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #51 = Methodref          #52.#53       // ext/mods/gameserver/model/actor/status/SummonStatus.broadcastStatusUpdate:()V
   #52 = Class              #54           // ext/mods/gameserver/model/actor/status/SummonStatus
   #53 = NameAndType        #55:#6        // broadcastStatusUpdate:()V
   #54 = Utf8               ext/mods/gameserver/model/actor/status/SummonStatus
   #55 = Utf8               broadcastStatusUpdate
   #56 = Methodref          #45.#38       // ext/mods/gameserver/model/actor/Summon.spawnMe:()V
   #57 = String             #58           // admin_invul
   #58 = Utf8               admin_invul
   #59 = Methodref          #16.#60       // ext/mods/gameserver/model/actor/Player.isInvul:()Z
   #60 = NameAndType        #61:#26       // isInvul:()Z
   #61 = Utf8               isInvul
   #62 = Methodref          #16.#63       // ext/mods/gameserver/model/actor/Player.setInvul:(Z)V
   #63 = NameAndType        #64:#30       // setInvul:(Z)V
   #64 = Utf8               setInvul
   #65 = String             #66           // You are now invulnerable.
   #66 = Utf8               You are now invulnerable.
   #67 = String             #68           // You are now vulnerable.
   #68 = Utf8               You are now vulnerable.
   #69 = Methodref          #16.#70       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #70 = NameAndType        #71:#72       // sendMessage:(Ljava/lang/String;)V
   #71 = Utf8               sendMessage
   #72 = Utf8               (Ljava/lang/String;)V
   #73 = String             #74           // admin_jukebox
   #74 = Utf8               admin_jukebox
   #75 = String             #76           // songs/songs.htm
   #76 = Utf8               songs/songs.htm
   #77 = Methodref          #78.#79       // ext/mods/gameserver/handler/admincommandhandlers/AdminEffects.sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #78 = Class              #80           // ext/mods/gameserver/handler/admincommandhandlers/AdminEffects
   #79 = NameAndType        #81:#82       // sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #80 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminEffects
   #81 = Utf8               sendFile
   #82 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #83 = String             #84           // admin_undying
   #84 = Utf8               admin_undying
   #85 = Methodref          #16.#86       // ext/mods/gameserver/model/actor/Player.isMortal:()Z
   #86 = NameAndType        #87:#26       // isMortal:()Z
   #87 = Utf8               isMortal
   #88 = Methodref          #16.#89       // ext/mods/gameserver/model/actor/Player.setMortal:(Z)V
   #89 = NameAndType        #90:#30       // setMortal:(Z)V
   #90 = Utf8               setMortal
   #91 = String             #92           // You are now mortal.
   #92 = Utf8               You are now mortal.
   #93 = String             #94           // You are now immortal.
   #94 = Utf8               You are now immortal.
   #95 = Class              #96           // java/util/StringTokenizer
   #96 = Utf8               java/util/StringTokenizer
   #97 = Methodref          #95.#98       // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #98 = NameAndType        #5:#72        // "<init>":(Ljava/lang/String;)V
   #99 = Methodref          #95.#100      // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
  #100 = NameAndType        #101:#102     // nextToken:()Ljava/lang/String;
  #101 = Utf8               nextToken
  #102 = Utf8               ()Ljava/lang/String;
  #103 = String             #104          // admin_abnormal
  #104 = Utf8               admin_abnormal
  #105 = Methodref          #78.#106      // ext/mods/gameserver/handler/admincommandhandlers/AdminEffects.getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
  #106 = NameAndType        #107:#108     // getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
  #107 = Utf8               getTargetCreature
  #108 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
  #109 = InvokeDynamic      #0:#110       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #110 = NameAndType        #111:#112     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #111 = Utf8               makeConcatWithConstants
  #112 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #113 = Methodref          #114.#115     // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #114 = Class              #116          // java/lang/Integer
  #115 = NameAndType        #117:#118     // decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #116 = Utf8               java/lang/Integer
  #117 = Utf8               decode
  #118 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #119 = Methodref          #114.#120     // java/lang/Integer.intValue:()I
  #120 = NameAndType        #121:#122     // intValue:()I
  #121 = Utf8               intValue
  #122 = Utf8               ()I
  #123 = Methodref          #124.#125     // ext/mods/gameserver/model/actor/Creature.getAbnormalEffect:()I
  #124 = Class              #126          // ext/mods/gameserver/model/actor/Creature
  #125 = NameAndType        #127:#122     // getAbnormalEffect:()I
  #126 = Utf8               ext/mods/gameserver/model/actor/Creature
  #127 = Utf8               getAbnormalEffect
  #128 = Methodref          #124.#129     // ext/mods/gameserver/model/actor/Creature.stopAbnormalEffect:(I)V
  #129 = NameAndType        #130:#131     // stopAbnormalEffect:(I)V
  #130 = Utf8               stopAbnormalEffect
  #131 = Utf8               (I)V
  #132 = Methodref          #124.#133     // ext/mods/gameserver/model/actor/Creature.startAbnormalEffect:(I)V
  #133 = NameAndType        #134:#131     // startAbnormalEffect:(I)V
  #134 = Utf8               startAbnormalEffect
  #135 = Class              #136          // java/lang/Exception
  #136 = Utf8               java/lang/Exception
  #137 = String             #138          // Usage: //abnormal mask
  #138 = Utf8               Usage: //abnormal mask
  #139 = String             #140          // admin_atmosphere
  #140 = Utf8               admin_atmosphere
  #141 = String             #142          // ssqinfo
  #142 = Utf8               ssqinfo
  #143 = Methodref          #10.#144      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #144 = NameAndType        #145:#146     // equals:(Ljava/lang/Object;)Z
  #145 = Utf8               equals
  #146 = Utf8               (Ljava/lang/Object;)Z
  #147 = String             #148          // dawn
  #148 = Utf8               dawn
  #149 = Fieldref           #150.#151     // ext/mods/gameserver/network/serverpackets/SSQInfo.DAWN_SKY_PACKET:Lext/mods/gameserver/network/serverpackets/SSQInfo;
  #150 = Class              #152          // ext/mods/gameserver/network/serverpackets/SSQInfo
  #151 = NameAndType        #153:#154     // DAWN_SKY_PACKET:Lext/mods/gameserver/network/serverpackets/SSQInfo;
  #152 = Utf8               ext/mods/gameserver/network/serverpackets/SSQInfo
  #153 = Utf8               DAWN_SKY_PACKET
  #154 = Utf8               Lext/mods/gameserver/network/serverpackets/SSQInfo;
  #155 = String             #156          // dusk
  #156 = Utf8               dusk
  #157 = Fieldref           #150.#158     // ext/mods/gameserver/network/serverpackets/SSQInfo.DUSK_SKY_PACKET:Lext/mods/gameserver/network/serverpackets/SSQInfo;
  #158 = NameAndType        #159:#154     // DUSK_SKY_PACKET:Lext/mods/gameserver/network/serverpackets/SSQInfo;
  #159 = Utf8               DUSK_SKY_PACKET
  #160 = String             #161          // red
  #161 = Utf8               red
  #162 = Fieldref           #150.#163     // ext/mods/gameserver/network/serverpackets/SSQInfo.RED_SKY_PACKET:Lext/mods/gameserver/network/serverpackets/SSQInfo;
  #163 = NameAndType        #164:#154     // RED_SKY_PACKET:Lext/mods/gameserver/network/serverpackets/SSQInfo;
  #164 = Utf8               RED_SKY_PACKET
  #165 = String             #166          // regular
  #166 = Utf8               regular
  #167 = Fieldref           #150.#168     // ext/mods/gameserver/network/serverpackets/SSQInfo.REGULAR_SKY_PACKET:Lext/mods/gameserver/network/serverpackets/SSQInfo;
  #168 = NameAndType        #169:#154     // REGULAR_SKY_PACKET:Lext/mods/gameserver/network/serverpackets/SSQInfo;
  #169 = Utf8               REGULAR_SKY_PACKET
  #170 = String             #171          // sky
  #171 = Utf8               sky
  #172 = String             #173          // night
  #173 = Utf8               night
  #174 = Fieldref           #175.#176     // ext/mods/gameserver/network/serverpackets/SunSet.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/SunSet;
  #175 = Class              #177          // ext/mods/gameserver/network/serverpackets/SunSet
  #176 = NameAndType        #178:#179     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/SunSet;
  #177 = Utf8               ext/mods/gameserver/network/serverpackets/SunSet
  #178 = Utf8               STATIC_PACKET
  #179 = Utf8               Lext/mods/gameserver/network/serverpackets/SunSet;
  #180 = String             #181          // day
  #181 = Utf8               day
  #182 = Fieldref           #183.#184     // ext/mods/gameserver/network/serverpackets/SunRise.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/SunRise;
  #183 = Class              #185          // ext/mods/gameserver/network/serverpackets/SunRise
  #184 = NameAndType        #178:#186     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/SunRise;
  #185 = Utf8               ext/mods/gameserver/network/serverpackets/SunRise
  #186 = Utf8               Lext/mods/gameserver/network/serverpackets/SunRise;
  #187 = Class              #188          // ext/mods/gameserver/network/serverpackets/ExRedSky
  #188 = Utf8               ext/mods/gameserver/network/serverpackets/ExRedSky
  #189 = Methodref          #187.#190     // ext/mods/gameserver/network/serverpackets/ExRedSky."<init>":(I)V
  #190 = NameAndType        #5:#131       // "<init>":(I)V
  #191 = String             #192          // Usage: //atmosphere <ssqinfo dawn|dusk|red|regular>
  #192 = Utf8               Usage: //atmosphere <ssqinfo dawn|dusk|red|regular>
  #193 = String             #194          // Usage: //atmosphere <sky day|night|red>
  #194 = Utf8               Usage: //atmosphere <sky day|night|red>
  #195 = Methodref          #196.#197     // ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #196 = Class              #198          // ext/mods/gameserver/model/World
  #197 = NameAndType        #199:#200     // toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #198 = Utf8               ext/mods/gameserver/model/World
  #199 = Utf8               toAllOnlinePlayers
  #200 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #201 = String             #202          // admin_earthquake
  #202 = Utf8               admin_earthquake
  #203 = Class              #204          // ext/mods/gameserver/network/serverpackets/Earthquake
  #204 = Utf8               ext/mods/gameserver/network/serverpackets/Earthquake
  #205 = Methodref          #114.#206     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #206 = NameAndType        #207:#208     // parseInt:(Ljava/lang/String;)I
  #207 = Utf8               parseInt
  #208 = Utf8               (Ljava/lang/String;)I
  #209 = Methodref          #203.#210     // ext/mods/gameserver/network/serverpackets/Earthquake."<init>":(Lext/mods/gameserver/model/WorldObject;II)V
  #210 = NameAndType        #5:#211       // "<init>":(Lext/mods/gameserver/model/WorldObject;II)V
  #211 = Utf8               (Lext/mods/gameserver/model/WorldObject;II)V
  #212 = String             #213          // Use: //earthquake <intensity> <duration>
  #213 = Utf8               Use: //earthquake <intensity> <duration>
  #214 = String             #215          // admin_effect
  #215 = Utf8               admin_effect
  #216 = Methodref          #95.#217      // java/util/StringTokenizer.hasMoreTokens:()Z
  #217 = NameAndType        #218:#26      // hasMoreTokens:()Z
  #218 = Utf8               hasMoreTokens
  #219 = Methodref          #78.#220      // ext/mods/gameserver/handler/admincommandhandlers/AdminEffects.showMainPage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)V
  #220 = NameAndType        #221:#222     // showMainPage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)V
  #221 = Utf8               showMainPage
  #222 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)V
  #223 = Methodref          #224.#225     // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
  #224 = Class              #226          // ext/mods/commons/lang/StringUtil
  #225 = NameAndType        #227:#14      // isDigit:(Ljava/lang/String;)Z
  #226 = Utf8               ext/mods/commons/lang/StringUtil
  #227 = Utf8               isDigit
  #228 = Methodref          #10.#229      // java/lang/String.hashCode:()I
  #229 = NameAndType        #230:#122     // hashCode:()I
  #230 = Utf8               hashCode
  #231 = String             #232          // set
  #232 = Utf8               set
  #233 = String             #234          // remove
  #234 = Utf8               remove
  #235 = String             #236          // visual
  #236 = Utf8               visual
  #237 = Methodref          #238.#239     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #238 = Class              #240          // ext/mods/gameserver/data/SkillTable
  #239 = NameAndType        #241:#242     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #240 = Utf8               ext/mods/gameserver/data/SkillTable
  #241 = Utf8               getInstance
  #242 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #243 = Methodref          #238.#244     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #244 = NameAndType        #245:#246     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #245 = Utf8               getInfo
  #246 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #247 = String             #248          // Usage: //effect set id level [page]
  #248 = Utf8               Usage: //effect set id level [page]
  #249 = Methodref          #250.#251     // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #250 = Class              #252          // ext/mods/gameserver/skills/L2Skill
  #251 = NameAndType        #253:#254     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #252 = Utf8               ext/mods/gameserver/skills/L2Skill
  #253 = Utf8               getEffects
  #254 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #255 = String             #256          // all
  #256 = Utf8               all
  #257 = Methodref          #124.#258     // ext/mods/gameserver/model/actor/Creature.stopAllEffects:()V
  #258 = NameAndType        #259:#6       // stopAllEffects:()V
  #259 = Utf8               stopAllEffects
  #260 = Methodref          #124.#261     // ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
  #261 = NameAndType        #262:#102     // getName:()Ljava/lang/String;
  #262 = Utf8               getName
  #263 = InvokeDynamic      #1:#110       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #264 = Methodref          #124.#265     // ext/mods/gameserver/model/actor/Creature.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #265 = NameAndType        #266:#267     // getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #266 = Utf8               getAllEffects
  #267 = Utf8               ()[Lext/mods/gameserver/skills/AbstractEffect;
  #268 = Methodref          #269.#270     // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #269 = Class              #271          // java/util/Arrays
  #270 = NameAndType        #272:#273     // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #271 = Utf8               java/util/Arrays
  #272 = Utf8               stream
  #273 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #274 = InvokeDynamic      #2:#275       // #2:test:(I)Ljava/util/function/Predicate;
  #275 = NameAndType        #276:#277     // test:(I)Ljava/util/function/Predicate;
  #276 = Utf8               test
  #277 = Utf8               (I)Ljava/util/function/Predicate;
  #278 = InterfaceMethodref #279.#280     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #279 = Class              #281          // java/util/stream/Stream
  #280 = NameAndType        #282:#283     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #281 = Utf8               java/util/stream/Stream
  #282 = Utf8               filter
  #283 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #284 = InvokeDynamic      #3:#285       // #3:accept:()Ljava/util/function/Consumer;
  #285 = NameAndType        #286:#287     // accept:()Ljava/util/function/Consumer;
  #286 = Utf8               accept
  #287 = Utf8               ()Ljava/util/function/Consumer;
  #288 = InterfaceMethodref #279.#289     // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
  #289 = NameAndType        #290:#291     // forEach:(Ljava/util/function/Consumer;)V
  #290 = Utf8               forEach
  #291 = Utf8               (Ljava/util/function/Consumer;)V
  #292 = InvokeDynamic      #4:#293       // #4:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #293 = NameAndType        #111:#294     // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #294 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #295 = String             #296          // Usage: //effect remove id [page]
  #296 = Utf8               Usage: //effect remove id [page]
  #297 = Class              #298          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #298 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #299 = Methodref          #297.#300     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #300 = NameAndType        #5:#301       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #301 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #302 = Methodref          #124.#303     // ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #303 = NameAndType        #304:#200     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #304 = Utf8               broadcastPacket
  #305 = String             #306          // Usage: //effect visual id
  #306 = Utf8               Usage: //effect visual id
  #307 = String             #308          // admin_gmspeed
  #308 = Utf8               admin_gmspeed
  #309 = Methodref          #16.#310      // ext/mods/gameserver/model/actor/Player.stopSkillEffects:(I)V
  #310 = NameAndType        #311:#131     // stopSkillEffects:(I)V
  #311 = Utf8               stopSkillEffects
  #312 = Methodref          #16.#313      // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #313 = NameAndType        #314:#315     // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #314 = Utf8               getCast
  #315 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #316 = Methodref          #317.#318     // ext/mods/gameserver/model/actor/cast/PlayerCast.callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #317 = Class              #319          // ext/mods/gameserver/model/actor/cast/PlayerCast
  #318 = NameAndType        #320:#321     // callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #319 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #320 = Utf8               callSkill
  #321 = Utf8               (Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #322 = Methodref          #16.#323      // ext/mods/gameserver/model/actor/Player.updateEffectIcons:()V
  #323 = NameAndType        #324:#6       // updateEffectIcons:()V
  #324 = Utf8               updateEffectIcons
  #325 = String             #326          // Use: //gmspeed value (0-4).
  #326 = Utf8               Use: //gmspeed value (0-4).
  #327 = String             #328          // admin_para
  #328 = Utf8               admin_para
  #329 = Fieldref           #330.#331     // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #330 = Class              #332          // ext/mods/gameserver/network/SystemMessageId
  #331 = NameAndType        #333:#334     // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #332 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #333 = Utf8               INVALID_TARGET
  #334 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #335 = Methodref          #16.#336      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #336 = NameAndType        #337:#338     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #337 = Utf8               sendPacket
  #338 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #339 = Methodref          #124.#340     // ext/mods/gameserver/model/actor/Creature.isParalyzed:()Z
  #340 = NameAndType        #341:#26      // isParalyzed:()Z
  #341 = Utf8               isParalyzed
  #342 = Fieldref           #343.#344     // ext/mods/gameserver/enums/skills/AbnormalEffect.HOLD_2:Lext/mods/gameserver/enums/skills/AbnormalEffect;
  #343 = Class              #345          // ext/mods/gameserver/enums/skills/AbnormalEffect
  #344 = NameAndType        #346:#347     // HOLD_2:Lext/mods/gameserver/enums/skills/AbnormalEffect;
  #345 = Utf8               ext/mods/gameserver/enums/skills/AbnormalEffect
  #346 = Utf8               HOLD_2
  #347 = Utf8               Lext/mods/gameserver/enums/skills/AbnormalEffect;
  #348 = Methodref          #124.#349     // ext/mods/gameserver/model/actor/Creature.startAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
  #349 = NameAndType        #134:#350     // startAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
  #350 = Utf8               (Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
  #351 = Methodref          #124.#352     // ext/mods/gameserver/model/actor/Creature.setIsParalyzed:(Z)V
  #352 = NameAndType        #353:#30      // setIsParalyzed:(Z)V
  #353 = Utf8               setIsParalyzed
  #354 = Methodref          #124.#355     // ext/mods/gameserver/model/actor/Creature.abortAll:(Z)V
  #355 = NameAndType        #356:#30      // abortAll:(Z)V
  #356 = Utf8               abortAll
  #357 = Methodref          #124.#358     // ext/mods/gameserver/model/actor/Creature.stopAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
  #358 = NameAndType        #130:#350     // stopAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
  #359 = Methodref          #124.#360     // ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #360 = NameAndType        #361:#362     // getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #361 = Utf8               getAI
  #362 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #363 = Fieldref           #364.#365     // ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
  #364 = Class              #366          // ext/mods/gameserver/enums/AiEventType
  #365 = NameAndType        #367:#368     // THINK:Lext/mods/gameserver/enums/AiEventType;
  #366 = Utf8               ext/mods/gameserver/enums/AiEventType
  #367 = Utf8               THINK
  #368 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #369 = Methodref          #370.#371     // ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #370 = Class              #372          // ext/mods/gameserver/model/actor/ai/type/CreatureAI
  #371 = NameAndType        #373:#374     // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #372 = Utf8               ext/mods/gameserver/model/actor/ai/type/CreatureAI
  #373 = Utf8               notifyEvent
  #374 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #375 = String             #376          // admin_play_sound
  #376 = Utf8               admin_play_sound
  #377 = String             #378          // .
  #378 = Utf8               .
  #379 = Methodref          #10.#380      // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #380 = NameAndType        #381:#382     // contains:(Ljava/lang/CharSequence;)Z
  #381 = Utf8               contains
  #382 = Utf8               (Ljava/lang/CharSequence;)Z
  #383 = Class              #384          // ext/mods/gameserver/network/serverpackets/PlaySound
  #384 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
  #385 = Methodref          #383.#98      // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
  #386 = Methodref          #383.#387     // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(ILjava/lang/String;)V
  #387 = NameAndType        #5:#388       // "<init>":(ILjava/lang/String;)V
  #388 = Utf8               (ILjava/lang/String;)V
  #389 = Methodref          #16.#303      // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #390 = String             #391          // Usage: //play_sound soundFile
  #391 = Utf8               Usage: //play_sound soundFile
  #392 = String             #393          // admin_social
  #393 = Utf8               admin_social
  #394 = Class              #395          // ext/mods/gameserver/model/actor/instance/Chest
  #395 = Utf8               ext/mods/gameserver/model/actor/instance/Chest
  #396 = Class              #397          // ext/mods/gameserver/model/actor/Npc
  #397 = Utf8               ext/mods/gameserver/model/actor/Npc
  #398 = Class              #399          // ext/mods/gameserver/network/serverpackets/SocialAction
  #399 = Utf8               ext/mods/gameserver/network/serverpackets/SocialAction
  #400 = Methodref          #398.#401     // ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
  #401 = NameAndType        #5:#402       // "<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
  #402 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
  #403 = String             #404          // Usage: //social actionId
  #404 = Utf8               Usage: //social actionId
  #405 = Fieldref           #78.#406      // ext/mods/gameserver/handler/admincommandhandlers/AdminEffects.ADMIN_COMMANDS:[Ljava/lang/String;
  #406 = NameAndType        #407:#408     // ADMIN_COMMANDS:[Ljava/lang/String;
  #407 = Utf8               ADMIN_COMMANDS
  #408 = Utf8               [Ljava/lang/String;
  #409 = Class              #410          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #410 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #411 = Methodref          #409.#190     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #412 = Methodref          #16.#413      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #413 = NameAndType        #414:#415     // getLocale:()Ljava/util/Locale;
  #414 = Utf8               getLocale
  #415 = Utf8               ()Ljava/util/Locale;
  #416 = String             #417          // html/admin/char_effects.htm
  #417 = Utf8               html/admin/char_effects.htm
  #418 = Methodref          #409.#419     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #419 = NameAndType        #420:#421     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #420 = Utf8               setFile
  #421 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #422 = String             #423          // %name%
  #423 = Utf8               %name%
  #424 = Methodref          #409.#425     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #425 = NameAndType        #426:#427     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #426 = Utf8               replace
  #427 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #428 = Class              #429          // ext/mods/commons/data/Pagination
  #429 = Utf8               ext/mods/commons/data/Pagination
  #430 = Class              #431          // ext/mods/gameserver/handler/IAdminCommandHandler
  #431 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #432 = Methodref          #428.#433     // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
  #433 = NameAndType        #5:#434       // "<init>":(Ljava/util/stream/Stream;II)V
  #434 = Utf8               (Ljava/util/stream/Stream;II)V
  #435 = Methodref          #428.#436     // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
  #436 = NameAndType        #437:#438     // iterator:()Ljava/util/Iterator;
  #437 = Utf8               iterator
  #438 = Utf8               ()Ljava/util/Iterator;
  #439 = InterfaceMethodref #440.#441     // java/util/Iterator.hasNext:()Z
  #440 = Class              #442          // java/util/Iterator
  #441 = NameAndType        #443:#26      // hasNext:()Z
  #442 = Utf8               java/util/Iterator
  #443 = Utf8               hasNext
  #444 = InterfaceMethodref #440.#445     // java/util/Iterator.next:()Ljava/lang/Object;
  #445 = NameAndType        #446:#447     // next:()Ljava/lang/Object;
  #446 = Utf8               next
  #447 = Utf8               ()Ljava/lang/Object;
  #448 = Class              #449          // ext/mods/gameserver/skills/AbstractEffect
  #449 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #450 = String             #451          // <table width=280 bgcolor=000000><tr>
  #451 = Utf8               <table width=280 bgcolor=000000><tr>
  #452 = String             #453          // <table width=280><tr>
  #453 = Utf8               <table width=280><tr>
  #454 = Methodref          #428.#455     // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
  #455 = NameAndType        #456:#457     // append:([Ljava/lang/Object;)V
  #456 = Utf8               append
  #457 = Utf8               ([Ljava/lang/Object;)V
  #458 = String             #459          // <td width=220><a action=\"bypass -h admin_effect remove
  #459 = Utf8               <td width=220><a action=\"bypass -h admin_effect remove
  #460 = Methodref          #448.#461     // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #461 = NameAndType        #462:#463     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #462 = Utf8               getSkill
  #463 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #464 = Methodref          #250.#465     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #465 = NameAndType        #466:#122     // getId:()I
  #466 = Utf8               getId
  #467 = Methodref          #114.#468     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #468 = NameAndType        #469:#470     // valueOf:(I)Ljava/lang/Integer;
  #469 = Utf8               valueOf
  #470 = Utf8               (I)Ljava/lang/Integer;
  #471 = String             #472          // \">
  #472 = Utf8               \">
  #473 = Methodref          #250.#261     // ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
  #474 = String             #475          // </a></td><td width=60>
  #475 = Utf8               </a></td><td width=60>
  #476 = Methodref          #250.#477     // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
  #477 = NameAndType        #478:#26      // isToggle:()Z
  #478 = Utf8               isToggle
  #479 = String             #480          // toggle
  #480 = Utf8               toggle
  #481 = Methodref          #448.#482     // ext/mods/gameserver/skills/AbstractEffect.getPeriod:()I
  #482 = NameAndType        #483:#122     // getPeriod:()I
  #483 = Utf8               getPeriod
  #484 = Methodref          #448.#485     // ext/mods/gameserver/skills/AbstractEffect.getTime:()I
  #485 = NameAndType        #486:#122     // getTime:()I
  #486 = Utf8               getTime
  #487 = InvokeDynamic      #5:#488       // #5:makeConcatWithConstants:(I)Ljava/lang/String;
  #488 = NameAndType        #111:#489     // makeConcatWithConstants:(I)Ljava/lang/String;
  #489 = Utf8               (I)Ljava/lang/String;
  #490 = String             #491          // </td>
  #491 = Utf8               </td>
  #492 = String             #493          // </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #493 = Utf8               </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #494 = Methodref          #428.#495     // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #495 = NameAndType        #496:#131     // generateSpace:(I)V
  #496 = Utf8               generateSpace
  #497 = String             #498          // bypass admin_effect %page%
  #498 = Utf8               bypass admin_effect %page%
  #499 = Methodref          #428.#500     // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #500 = NameAndType        #501:#72      // generatePages:(Ljava/lang/String;)V
  #501 = Utf8               generatePages
  #502 = String             #503          // %content%
  #503 = Utf8               %content%
  #504 = Methodref          #428.#505     // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #505 = NameAndType        #506:#102     // getContent:()Ljava/lang/String;
  #506 = Utf8               getContent
  #507 = Methodref          #16.#508      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #508 = NameAndType        #337:#200     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #509 = Utf8               Code
  #510 = Utf8               LineNumberTable
  #511 = Utf8               LocalVariableTable
  #512 = Utf8               this
  #513 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminEffects;
  #514 = Utf8               useAdminCommand
  #515 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #516 = Utf8               summon
  #517 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #518 = Utf8               abnormal
  #519 = Utf8               I
  #520 = Utf8               e
  #521 = Utf8               Ljava/lang/Exception;
  #522 = Utf8               targetCreature
  #523 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #524 = Utf8               type
  #525 = Utf8               Ljava/lang/String;
  #526 = Utf8               state
  #527 = Utf8               packet
  #528 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #529 = Utf8               skill
  #530 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #531 = Utf8               skillId
  #532 = Utf8               param2
  #533 = Utf8               param3
  #534 = Utf8               page
  #535 = Utf8               param
  #536 = Utf8               skillLevel
  #537 = Utf8               soundFile
  #538 = Utf8               actionId
  #539 = Utf8               st
  #540 = Utf8               Ljava/util/StringTokenizer;
  #541 = Utf8               command
  #542 = Utf8               player
  #543 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #544 = Utf8               StackMapTable
  #545 = Class              #546          // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #546 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #547 = Class              #548          // java/lang/Throwable
  #548 = Utf8               java/lang/Throwable
  #549 = Utf8               getAdminCommandList
  #550 = Utf8               ()[Ljava/lang/String;
  #551 = Utf8               effect
  #552 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #553 = Utf8               creature
  #554 = Utf8               html
  #555 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #556 = Utf8               row
  #557 = Utf8               list
  #558 = Utf8               Lext/mods/commons/data/Pagination;
  #559 = Utf8               LocalVariableTypeTable
  #560 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/skills/AbstractEffect;>;
  #561 = Class              #562          // "[Ljava/lang/Object;"
  #562 = Utf8               [Ljava/lang/Object;
  #563 = Utf8               lambda$useAdminCommand$0
  #564 = Utf8               (ILext/mods/gameserver/skills/AbstractEffect;)Z
  #565 = Utf8               <clinit>
  #566 = Utf8               SourceFile
  #567 = Utf8               AdminEffects.java
  #568 = Utf8               BootstrapMethods
  #569 = String             #570          // 0x\u0001
  #570 = Utf8               0x\u0001
  #571 = String             #572          // You removed all effects from \u0001.
  #572 = Utf8               You removed all effects from \u0001.
  #573 = MethodType         #146          //  (Ljava/lang/Object;)Z
  #574 = MethodHandle       6:#575        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminEffects.lambda$useAdminCommand$0:(ILext/mods/gameserver/skills/AbstractEffect;)Z
  #575 = Methodref          #78.#576      // ext/mods/gameserver/handler/admincommandhandlers/AdminEffects.lambda$useAdminCommand$0:(ILext/mods/gameserver/skills/AbstractEffect;)Z
  #576 = NameAndType        #563:#564     // lambda$useAdminCommand$0:(ILext/mods/gameserver/skills/AbstractEffect;)Z
  #577 = MethodType         #578          //  (Lext/mods/gameserver/skills/AbstractEffect;)Z
  #578 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)Z
  #579 = MethodType         #580          //  (Ljava/lang/Object;)V
  #580 = Utf8               (Ljava/lang/Object;)V
  #581 = MethodHandle       5:#582        // REF_invokeVirtual ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #582 = Methodref          #448.#583     // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #583 = NameAndType        #584:#6       // exit:()V
  #584 = Utf8               exit
  #585 = MethodType         #586          //  (Lext/mods/gameserver/skills/AbstractEffect;)V
  #586 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)V
  #587 = String             #588          // You removed \u0001 skillId effect from \u0001.
  #588 = Utf8               You removed \u0001 skillId effect from \u0001.
  #589 = String             #590          // \u0001s
  #590 = Utf8               \u0001s
  #591 = MethodHandle       6:#592        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #592 = Methodref          #593.#594     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #593 = Class              #595          // java/lang/invoke/StringConcatFactory
  #594 = NameAndType        #111:#596     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #595 = Utf8               java/lang/invoke/StringConcatFactory
  #596 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #597 = MethodHandle       6:#598        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #598 = Methodref          #599.#600     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #599 = Class              #601          // java/lang/invoke/LambdaMetafactory
  #600 = NameAndType        #602:#603     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #601 = Utf8               java/lang/invoke/LambdaMetafactory
  #602 = Utf8               metafactory
  #603 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #604 = Utf8               InnerClasses
  #605 = Class              #606          // java/lang/invoke/MethodHandles$Lookup
  #606 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #607 = Class              #608          // java/lang/invoke/MethodHandles
  #608 = Utf8               java/lang/invoke/MethodHandles
  #609 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminEffects();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminEffects;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=12, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_hide
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          81
         9: aload_2
        10: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        13: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
        16: ifeq          42
        19: aload_2
        20: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        23: iconst_0
        24: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/container/player/Appearance.setVisible:(Z)V
        27: aload_2
        28: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.decayMe:()V
        31: aload_2
        32: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        35: aload_2
        36: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.spawnMe:()V
        39: goto          54
        42: aload_2
        43: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        46: iconst_1
        47: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/container/player/Appearance.setVisible:(Z)V
        50: aload_2
        51: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        54: aload_2
        55: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        58: astore_3
        59: aload_3
        60: ifnull        78
        63: aload_3
        64: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Summon.decayMe:()V
        67: aload_3
        68: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
        71: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/status/SummonStatus.broadcastStatusUpdate:()V
        74: aload_3
        75: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Summon.spawnMe:()V
        78: goto          1373
        81: aload_1
        82: ldc           #57                 // String admin_invul
        84: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        87: ifeq          127
        90: aload_2
        91: aload_2
        92: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.isInvul:()Z
        95: ifne          102
        98: iconst_1
        99: goto          103
       102: iconst_0
       103: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.setInvul:(Z)V
       106: aload_2
       107: aload_2
       108: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.isInvul:()Z
       111: ifeq          119
       114: ldc           #65                 // String You are now invulnerable.
       116: goto          121
       119: ldc           #67                 // String You are now vulnerable.
       121: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       124: goto          1373
       127: aload_1
       128: ldc           #73                 // String admin_jukebox
       130: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       133: ifeq          146
       136: aload_0
       137: aload_2
       138: ldc           #75                 // String songs/songs.htm
       140: invokevirtual #77                 // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       143: goto          1373
       146: aload_1
       147: ldc           #83                 // String admin_undying
       149: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       152: ifeq          192
       155: aload_2
       156: aload_2
       157: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.isMortal:()Z
       160: ifne          167
       163: iconst_1
       164: goto          168
       167: iconst_0
       168: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.setMortal:(Z)V
       171: aload_2
       172: aload_2
       173: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.isMortal:()Z
       176: ifeq          184
       179: ldc           #91                 // String You are now mortal.
       181: goto          186
       184: ldc           #93                 // String You are now immortal.
       186: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       189: goto          1373
       192: new           #95                 // class java/util/StringTokenizer
       195: dup
       196: aload_1
       197: invokespecial #97                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
       200: astore_3
       201: aload_3
       202: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       205: pop
       206: aload_1
       207: ldc           #103                // String admin_abnormal
       209: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       212: ifeq          284
       215: aload_0
       216: aload_2
       217: iconst_1
       218: invokevirtual #105                // Method getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
       221: astore        4
       223: aload_3
       224: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       227: invokedynamic #109,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       232: invokestatic  #113                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
       235: invokevirtual #119                // Method java/lang/Integer.intValue:()I
       238: istore        5
       240: aload         4
       242: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Creature.getAbnormalEffect:()I
       245: iload         5
       247: iand
       248: iload         5
       250: if_icmpne     263
       253: aload         4
       255: iload         5
       257: invokevirtual #128                // Method ext/mods/gameserver/model/actor/Creature.stopAbnormalEffect:(I)V
       260: goto          270
       263: aload         4
       265: iload         5
       267: invokevirtual #132                // Method ext/mods/gameserver/model/actor/Creature.startAbnormalEffect:(I)V
       270: goto          281
       273: astore        5
       275: aload_2
       276: ldc           #137                // String Usage: //abnormal mask
       278: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       281: goto          1373
       284: aload_1
       285: ldc           #139                // String admin_atmosphere
       287: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       290: ifeq          500
       293: aload_3
       294: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       297: astore        4
       299: aload_3
       300: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       303: astore        5
       305: aconst_null
       306: astore        6
       308: aload         4
       310: ldc           #141                // String ssqinfo
       312: invokevirtual #143                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       315: ifeq          390
       318: aload         5
       320: ldc           #147                // String dawn
       322: invokevirtual #143                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       325: ifeq          336
       328: getstatic     #149                // Field ext/mods/gameserver/network/serverpackets/SSQInfo.DAWN_SKY_PACKET:Lext/mods/gameserver/network/serverpackets/SSQInfo;
       331: astore        6
       333: goto          457
       336: aload         5
       338: ldc           #155                // String dusk
       340: invokevirtual #143                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       343: ifeq          354
       346: getstatic     #157                // Field ext/mods/gameserver/network/serverpackets/SSQInfo.DUSK_SKY_PACKET:Lext/mods/gameserver/network/serverpackets/SSQInfo;
       349: astore        6
       351: goto          457
       354: aload         5
       356: ldc           #160                // String red
       358: invokevirtual #143                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       361: ifeq          372
       364: getstatic     #162                // Field ext/mods/gameserver/network/serverpackets/SSQInfo.RED_SKY_PACKET:Lext/mods/gameserver/network/serverpackets/SSQInfo;
       367: astore        6
       369: goto          457
       372: aload         5
       374: ldc           #165                // String regular
       376: invokevirtual #143                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       379: ifeq          457
       382: getstatic     #167                // Field ext/mods/gameserver/network/serverpackets/SSQInfo.REGULAR_SKY_PACKET:Lext/mods/gameserver/network/serverpackets/SSQInfo;
       385: astore        6
       387: goto          457
       390: aload         4
       392: ldc           #170                // String sky
       394: invokevirtual #143                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       397: ifeq          457
       400: aload         5
       402: ldc           #172                // String night
       404: invokevirtual #143                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       407: ifeq          418
       410: getstatic     #174                // Field ext/mods/gameserver/network/serverpackets/SunSet.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/SunSet;
       413: astore        6
       415: goto          457
       418: aload         5
       420: ldc           #180                // String day
       422: invokevirtual #143                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       425: ifeq          436
       428: getstatic     #182                // Field ext/mods/gameserver/network/serverpackets/SunRise.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/SunRise;
       431: astore        6
       433: goto          457
       436: aload         5
       438: ldc           #160                // String red
       440: invokevirtual #143                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       443: ifeq          457
       446: new           #187                // class ext/mods/gameserver/network/serverpackets/ExRedSky
       449: dup
       450: bipush        10
       452: invokespecial #189                // Method ext/mods/gameserver/network/serverpackets/ExRedSky."<init>":(I)V
       455: astore        6
       457: aload         6
       459: ifnonnull     475
       462: aload_2
       463: ldc           #191                // String Usage: //atmosphere <ssqinfo dawn|dusk|red|regular>
       465: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       468: aload_2
       469: ldc           #193                // String Usage: //atmosphere <sky day|night|red>
       471: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       474: return
       475: aload         6
       477: invokestatic  #195                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       480: goto          1373
       483: astore        4
       485: aload_2
       486: ldc           #191                // String Usage: //atmosphere <ssqinfo dawn|dusk|red|regular>
       488: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       491: aload_2
       492: ldc           #193                // String Usage: //atmosphere <sky day|night|red>
       494: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       497: goto          1373
       500: aload_1
       501: ldc           #201                // String admin_earthquake
       503: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       506: ifeq          548
       509: new           #203                // class ext/mods/gameserver/network/serverpackets/Earthquake
       512: dup
       513: aload_2
       514: aload_3
       515: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       518: invokestatic  #205                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       521: aload_3
       522: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       525: invokestatic  #205                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       528: invokespecial #209                // Method ext/mods/gameserver/network/serverpackets/Earthquake."<init>":(Lext/mods/gameserver/model/WorldObject;II)V
       531: invokestatic  #195                // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       534: goto          1373
       537: astore        4
       539: aload_2
       540: ldc           #212                // String Use: //earthquake <intensity> <duration>
       542: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       545: goto          1373
       548: aload_1
       549: ldc           #214                // String admin_effect
       551: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       554: ifeq          986
       557: aload_0
       558: aload_2
       559: iconst_1
       560: invokevirtual #105                // Method getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
       563: astore        4
       565: iconst_1
       566: istore        5
       568: aload_3
       569: invokevirtual #216                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       572: ifne          584
       575: aload_2
       576: aload         4
       578: iload         5
       580: invokestatic  #219                // Method showMainPage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)V
       583: return
       584: aload_3
       585: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       588: astore        6
       590: aload         6
       592: invokestatic  #223                // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
       595: ifeq          608
       598: aload         6
       600: invokestatic  #205                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       603: istore        5
       605: goto          975
       608: aload         6
       610: astore        7
       612: iconst_m1
       613: istore        8
       615: aload         7
       617: invokevirtual #228                // Method java/lang/String.hashCode:()I
       620: lookupswitch  { // 3

              -934610812: 672

              -816216256: 688

                  113762: 656
                 default: 701
            }
       656: aload         7
       658: ldc           #231                // String set
       660: invokevirtual #143                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       663: ifeq          701
       666: iconst_0
       667: istore        8
       669: goto          701
       672: aload         7
       674: ldc           #233                // String remove
       676: invokevirtual #143                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       679: ifeq          701
       682: iconst_1
       683: istore        8
       685: goto          701
       688: aload         7
       690: ldc           #235                // String visual
       692: invokevirtual #143                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       695: ifeq          701
       698: iconst_2
       699: istore        8
       701: iload         8
       703: tableswitch   { // 0 to 2

                       0: 728

                       1: 785

                       2: 910
                 default: 947
            }
       728: invokestatic  #237                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       731: aload_3
       732: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       735: invokestatic  #205                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       738: aload_3
       739: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       742: invokestatic  #205                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       745: invokevirtual #243                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       748: astore        9
       750: aload         9
       752: ifnonnull     762
       755: aload_2
       756: ldc           #247                // String Usage: //effect set id level [page]
       758: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       761: return
       762: aload         9
       764: aload_2
       765: aload         4
       767: invokevirtual #249                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       770: pop
       771: goto          947
       774: astore        9
       776: aload_2
       777: ldc           #247                // String Usage: //effect set id level [page]
       779: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       782: goto          947
       785: aload_3
       786: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       789: astore        9
       791: aload         9
       793: ldc           #255                // String all
       795: invokevirtual #143                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       798: ifeq          829
       801: aload         4
       803: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Creature.stopAllEffects:()V
       806: aload_2
       807: aload         4
       809: if_acmpeq     895
       812: aload_2
       813: aload         4
       815: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
       818: invokedynamic #263,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       823: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       826: goto          895
       829: aload         9
       831: invokestatic  #205                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       834: istore        10
       836: iload         10
       838: iconst_1
       839: if_icmpge     843
       842: return
       843: aload         4
       845: invokevirtual #264                // Method ext/mods/gameserver/model/actor/Creature.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
       848: invokestatic  #268                // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
       851: iload         10
       853: invokedynamic #274,  0            // InvokeDynamic #2:test:(I)Ljava/util/function/Predicate;
       858: invokeinterface #278,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       863: invokedynamic #284,  0            // InvokeDynamic #3:accept:()Ljava/util/function/Consumer;
       868: invokeinterface #288,  2          // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
       873: aload_2
       874: aload         4
       876: if_acmpeq     895
       879: aload_2
       880: iload         10
       882: aload         4
       884: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
       887: invokedynamic #292,  0            // InvokeDynamic #4:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
       892: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       895: goto          947
       898: astore        9
       900: aload_2
       901: ldc_w         #295                // String Usage: //effect remove id [page]
       904: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       907: goto          947
       910: aload         4
       912: new           #297                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       915: dup
       916: aload         4
       918: aload_2
       919: aload_3
       920: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       923: invokestatic  #205                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       926: iconst_1
       927: iconst_1
       928: iconst_0
       929: invokespecial #299                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       932: invokevirtual #302                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       935: goto          947
       938: astore        9
       940: aload_2
       941: ldc_w         #305                // String Usage: //effect visual id
       944: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       947: aload_3
       948: invokevirtual #216                // Method java/util/StringTokenizer.hasMoreTokens:()Z
       951: ifeq          975
       954: aload_3
       955: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       958: astore        7
       960: aload         7
       962: invokestatic  #223                // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
       965: ifeq          975
       968: aload         7
       970: invokestatic  #205                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       973: istore        5
       975: aload_2
       976: aload         4
       978: iload         5
       980: invokestatic  #219                // Method showMainPage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)V
       983: goto          1373
       986: aload_1
       987: ldc_w         #307                // String admin_gmspeed
       990: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       993: ifeq          1085
       996: aload_2
       997: sipush        7029
      1000: invokevirtual #309                // Method ext/mods/gameserver/model/actor/Player.stopSkillEffects:(I)V
      1003: aload_3
      1004: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1007: invokestatic  #205                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1010: istore        4
      1012: iload         4
      1014: ifle          1050
      1017: iload         4
      1019: iconst_5
      1020: if_icmpge     1050
      1023: aload_2
      1024: invokevirtual #312                // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
      1027: invokestatic  #237                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
      1030: sipush        7029
      1033: iload         4
      1035: invokevirtual #243                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
      1038: iconst_1
      1039: anewarray     #124                // class ext/mods/gameserver/model/actor/Creature
      1042: dup
      1043: iconst_0
      1044: aload_2
      1045: aastore
      1046: aconst_null
      1047: invokevirtual #316                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
      1050: aload_2
      1051: invokevirtual #322                // Method ext/mods/gameserver/model/actor/Player.updateEffectIcons:()V
      1054: goto          1082
      1057: astore        4
      1059: aload_2
      1060: ldc_w         #325                // String Use: //gmspeed value (0-4).
      1063: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1066: aload_2
      1067: invokevirtual #322                // Method ext/mods/gameserver/model/actor/Player.updateEffectIcons:()V
      1070: goto          1082
      1073: astore        11
      1075: aload_2
      1076: invokevirtual #322                // Method ext/mods/gameserver/model/actor/Player.updateEffectIcons:()V
      1079: aload         11
      1081: athrow
      1082: goto          1373
      1085: aload_1
      1086: ldc_w         #327                // String admin_para
      1089: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1092: ifeq          1185
      1095: aload_0
      1096: aload_2
      1097: iconst_0
      1098: invokevirtual #105                // Method getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
      1101: astore        4
      1103: aload         4
      1105: ifnonnull     1116
      1108: aload_2
      1109: getstatic     #329                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      1112: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1115: return
      1116: aload         4
      1118: invokevirtual #339                // Method ext/mods/gameserver/model/actor/Creature.isParalyzed:()Z
      1121: ifne          1147
      1124: aload         4
      1126: getstatic     #342                // Field ext/mods/gameserver/enums/skills/AbnormalEffect.HOLD_2:Lext/mods/gameserver/enums/skills/AbnormalEffect;
      1129: invokevirtual #348                // Method ext/mods/gameserver/model/actor/Creature.startAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
      1132: aload         4
      1134: iconst_1
      1135: invokevirtual #351                // Method ext/mods/gameserver/model/actor/Creature.setIsParalyzed:(Z)V
      1138: aload         4
      1140: iconst_0
      1141: invokevirtual #354                // Method ext/mods/gameserver/model/actor/Creature.abortAll:(Z)V
      1144: goto          1182
      1147: aload         4
      1149: getstatic     #342                // Field ext/mods/gameserver/enums/skills/AbnormalEffect.HOLD_2:Lext/mods/gameserver/enums/skills/AbnormalEffect;
      1152: invokevirtual #357                // Method ext/mods/gameserver/model/actor/Creature.stopAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
      1155: aload         4
      1157: iconst_0
      1158: invokevirtual #351                // Method ext/mods/gameserver/model/actor/Creature.setIsParalyzed:(Z)V
      1161: aload         4
      1163: instanceof    #16                 // class ext/mods/gameserver/model/actor/Player
      1166: ifne          1182
      1169: aload         4
      1171: invokevirtual #359                // Method ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      1174: getstatic     #363                // Field ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
      1177: aconst_null
      1178: aconst_null
      1179: invokevirtual #369                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
      1182: goto          1373
      1185: aload_1
      1186: ldc_w         #375                // String admin_play_sound
      1189: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1192: ifeq          1253
      1195: aload_3
      1196: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1199: astore        4
      1201: aload_2
      1202: aload         4
      1204: ldc_w         #377                // String .
      1207: invokevirtual #379                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
      1210: ifeq          1225
      1213: new           #383                // class ext/mods/gameserver/network/serverpackets/PlaySound
      1216: dup
      1217: aload         4
      1219: invokespecial #385                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
      1222: goto          1235
      1225: new           #383                // class ext/mods/gameserver/network/serverpackets/PlaySound
      1228: dup
      1229: iconst_1
      1230: aload         4
      1232: invokespecial #386                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(ILjava/lang/String;)V
      1235: invokevirtual #389                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1238: goto          1373
      1241: astore        4
      1243: aload_2
      1244: ldc_w         #390                // String Usage: //play_sound soundFile
      1247: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1250: goto          1373
      1253: aload_1
      1254: ldc_w         #392                // String admin_social
      1257: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
      1260: ifeq          1373
      1263: aload_0
      1264: aload_2
      1265: iconst_1
      1266: invokevirtual #105                // Method getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
      1269: astore        4
      1271: aload_3
      1272: invokevirtual #99                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1275: invokestatic  #205                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1278: istore        5
      1280: aload         4
      1282: instanceof    #45                 // class ext/mods/gameserver/model/actor/Summon
      1285: ifne          1337
      1288: aload         4
      1290: instanceof    #394                // class ext/mods/gameserver/model/actor/instance/Chest
      1293: ifne          1337
      1296: aload         4
      1298: instanceof    #396                // class ext/mods/gameserver/model/actor/Npc
      1301: ifeq          1316
      1304: iload         5
      1306: iconst_1
      1307: if_icmplt     1337
      1310: iload         5
      1312: iconst_3
      1313: if_icmpgt     1337
      1316: aload         4
      1318: instanceof    #16                 // class ext/mods/gameserver/model/actor/Player
      1321: ifeq          1345
      1324: iload         5
      1326: iconst_2
      1327: if_icmplt     1337
      1330: iload         5
      1332: bipush        16
      1334: if_icmple     1345
      1337: aload_2
      1338: getstatic     #329                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      1341: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1344: return
      1345: aload         4
      1347: new           #398                // class ext/mods/gameserver/network/serverpackets/SocialAction
      1350: dup
      1351: aload         4
      1353: iload         5
      1355: invokespecial #400                // Method ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
      1358: invokevirtual #302                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1361: goto          1373
      1364: astore        5
      1366: aload_2
      1367: ldc_w         #403                // String Usage: //social actionId
      1370: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1373: return
      Exception table:
         from    to  target type
           223   270   273   Class java/lang/Exception
           293   474   483   Class java/lang/Exception
           475   480   483   Class java/lang/Exception
           509   534   537   Class java/lang/Exception
           728   761   774   Class java/lang/Exception
           762   771   774   Class java/lang/Exception
           785   842   898   Class java/lang/Exception
           843   895   898   Class java/lang/Exception
           910   935   938   Class java/lang/Exception
           996  1050  1057   Class java/lang/Exception
           996  1050  1073   any
          1057  1066  1073   any
          1073  1075  1073   any
          1195  1238  1241   Class java/lang/Exception
          1271  1344  1364   Class java/lang/Exception
          1345  1361  1364   Class java/lang/Exception
      LineNumberTable:
        line 71: 0
        line 73: 9
        line 75: 19
        line 76: 27
        line 77: 31
        line 78: 35
        line 82: 42
        line 83: 50
        line 86: 54
        line 87: 59
        line 89: 63
        line 90: 67
        line 91: 74
        line 93: 78
        line 94: 81
        line 96: 90
        line 97: 106
        line 99: 127
        line 101: 136
        line 103: 146
        line 105: 155
        line 106: 171
        line 110: 192
        line 111: 201
        line 113: 206
        line 115: 215
        line 119: 223
        line 121: 240
        line 122: 253
        line 124: 263
        line 129: 270
        line 126: 273
        line 128: 275
        line 130: 281
        line 131: 284
        line 135: 293
        line 136: 299
        line 138: 305
        line 140: 308
        line 142: 318
        line 143: 328
        line 144: 336
        line 145: 346
        line 146: 354
        line 147: 364
        line 148: 372
        line 149: 382
        line 151: 390
        line 153: 400
        line 154: 410
        line 155: 418
        line 156: 428
        line 157: 436
        line 158: 446
        line 161: 457
        line 163: 462
        line 164: 468
        line 165: 474
        line 168: 475
        line 174: 480
        line 170: 483
        line 172: 485
        line 173: 491
        line 174: 497
        line 176: 500
        line 180: 509
        line 185: 534
        line 182: 537
        line 184: 539
        line 185: 545
        line 187: 548
        line 189: 557
        line 191: 565
        line 193: 568
        line 195: 575
        line 196: 583
        line 199: 584
        line 200: 590
        line 201: 598
        line 204: 608
        line 209: 728
        line 210: 750
        line 212: 755
        line 213: 761
        line 216: 762
        line 221: 771
        line 218: 774
        line 220: 776
        line 222: 782
        line 227: 785
        line 228: 791
        line 230: 801
        line 232: 806
        line 233: 812
        line 237: 829
        line 238: 836
        line 239: 842
        line 241: 843
        line 243: 873
        line 244: 879
        line 250: 895
        line 247: 898
        line 249: 900
        line 251: 907
        line 256: 910
        line 261: 935
        line 258: 938
        line 260: 940
        line 265: 947
        line 267: 954
        line 268: 960
        line 269: 968
        line 273: 975
        line 274: 983
        line 275: 986
        line 279: 996
        line 281: 1003
        line 282: 1012
        line 283: 1023
        line 294: 1050
        line 295: 1054
        line 288: 1057
        line 290: 1059
        line 294: 1066
        line 295: 1070
        line 294: 1073
        line 295: 1079
        line 297: 1085
        line 299: 1095
        line 300: 1103
        line 302: 1108
        line 303: 1115
        line 306: 1116
        line 308: 1124
        line 309: 1132
        line 310: 1138
        line 314: 1147
        line 315: 1155
        line 317: 1161
        line 318: 1169
        line 320: 1182
        line 321: 1185
        line 325: 1195
        line 327: 1201
        line 332: 1238
        line 329: 1241
        line 331: 1243
        line 332: 1250
        line 334: 1253
        line 336: 1263
        line 340: 1271
        line 342: 1280
        line 344: 1337
        line 345: 1344
        line 348: 1345
        line 353: 1361
        line 350: 1364
        line 352: 1366
        line 356: 1373
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59      19     3 summon   Lext/mods/gameserver/model/actor/Summon;
          240      30     5 abnormal   I
          275       6     5     e   Ljava/lang/Exception;
          223      58     4 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          299     181     4  type   Ljava/lang/String;
          305     175     5 state   Ljava/lang/String;
          308     172     6 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
          485      12     4     e   Ljava/lang/Exception;
          539       6     4     e   Ljava/lang/Exception;
          750      21     9 skill   Lext/mods/gameserver/skills/L2Skill;
          776       6     9     e   Ljava/lang/Exception;
          836      59    10 skillId   I
          791     104     9 param2   Ljava/lang/String;
          900       7     9     e   Ljava/lang/Exception;
          940       7     9     e   Ljava/lang/Exception;
          960      15     7 param3   Ljava/lang/String;
          565     418     4 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          568     415     5  page   I
          590     393     6 param   Ljava/lang/String;
         1012      38     4 skillLevel   I
         1059       7     4     e   Ljava/lang/Exception;
         1103      79     4 targetCreature   Lext/mods/gameserver/model/actor/Creature;
         1201      37     4 soundFile   Ljava/lang/String;
         1243       7     4     e   Ljava/lang/Exception;
         1280      81     5 actionId   I
         1366       7     5     e   Ljava/lang/Exception;
         1271     102     4 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          201    1172     3    st   Ljava/util/StringTokenizer;
            0    1374     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminEffects;
            0    1374     1 command   Ljava/lang/String;
            0    1374     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 69
        frame_type = 42 /* same */
        frame_type = 11 /* same */
        frame_type = 23 /* same */
        frame_type = 2 /* same */
        frame_type = 84 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEffects, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEffects, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 18 /* same */
        frame_type = 84 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEffects, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEffects, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 254 /* append */
          offset_delta = 70
          locals = [ class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, int ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 2 /* same */
        frame_type = 254 /* append */
          offset_delta = 51
          locals = [ class java/lang/String, class java/lang/String, class ext/mods/gameserver/network/serverpackets/L2GameServerPacket ]
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 27 /* same */
        frame_type = 17 /* same */
        frame_type = 20 /* same */
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEffects, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = [ class java/lang/Exception ]
        frame_type = 16 /* same */
        frame_type = 100 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/actor/Creature, int ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 47
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEffects, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature, int, class java/lang/String, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 51
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 91 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 249 /* chop */
          offset_delta = 8
        frame_type = 27 /* same */
        frame_type = 248 /* chop */
          offset_delta = 10
        frame_type = 63 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 30 /* same */
        frame_type = 250 /* chop */
          offset_delta = 34
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEffects, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEffects, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/PlaySound ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEffects, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 253 /* append */
          offset_delta = 62
          locals = [ class ext/mods/gameserver/model/actor/Creature, int ]
        frame_type = 20 /* same */
        frame_type = 7 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEffects, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Creature ]
          stack = [ class java/lang/Exception ]
        frame_type = 249 /* chop */
          offset_delta = 8

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #405                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 361: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminEffects;

  public static void showMainPage(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=8, args_size=3
         0: new           #409                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: iconst_0
         5: invokespecial #411                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
         8: astore_3
         9: aload_3
        10: aload_0
        11: invokevirtual #412                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        14: ldc_w         #416                // String html/admin/char_effects.htm
        17: invokevirtual #418                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        20: aload_3
        21: ldc_w         #422                // String %name%
        24: aload_1
        25: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
        28: invokevirtual #424                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        31: iconst_0
        32: istore        4
        34: new           #428                // class ext/mods/commons/data/Pagination
        37: dup
        38: aload_1
        39: invokevirtual #264                // Method ext/mods/gameserver/model/actor/Creature.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
        42: invokestatic  #268                // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
        45: iload_2
        46: bipush        14
        48: invokespecial #432                // Method ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
        51: astore        5
        53: aload         5
        55: invokevirtual #435                // Method ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
        58: astore        6
        60: aload         6
        62: invokeinterface #439,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        67: ifeq          227
        70: aload         6
        72: invokeinterface #444,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        77: checkcast     #448                // class ext/mods/gameserver/skills/AbstractEffect
        80: astore        7
        82: aload         5
        84: iconst_1
        85: anewarray     #2                  // class java/lang/Object
        88: dup
        89: iconst_0
        90: iload         4
        92: iconst_2
        93: irem
        94: ifne          103
        97: ldc_w         #450                // String <table width=280 bgcolor=000000><tr>
       100: goto          106
       103: ldc_w         #452                // String <table width=280><tr>
       106: aastore
       107: invokevirtual #454                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       110: aload         5
       112: bipush        7
       114: anewarray     #2                  // class java/lang/Object
       117: dup
       118: iconst_0
       119: ldc_w         #458                // String <td width=220><a action=\"bypass -h admin_effect remove
       122: aastore
       123: dup
       124: iconst_1
       125: aload         7
       127: invokevirtual #460                // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       130: invokevirtual #464                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       133: invokestatic  #467                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       136: aastore
       137: dup
       138: iconst_2
       139: ldc_w         #471                // String \">
       142: aastore
       143: dup
       144: iconst_3
       145: aload         7
       147: invokevirtual #460                // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       150: invokevirtual #473                // Method ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
       153: aastore
       154: dup
       155: iconst_4
       156: ldc_w         #474                // String </a></td><td width=60>
       159: aastore
       160: dup
       161: iconst_5
       162: aload         7
       164: invokevirtual #460                // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       167: invokevirtual #476                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
       170: ifeq          179
       173: ldc_w         #479                // String toggle
       176: goto          195
       179: aload         7
       181: invokevirtual #481                // Method ext/mods/gameserver/skills/AbstractEffect.getPeriod:()I
       184: aload         7
       186: invokevirtual #484                // Method ext/mods/gameserver/skills/AbstractEffect.getTime:()I
       189: isub
       190: invokedynamic #487,  0            // InvokeDynamic #5:makeConcatWithConstants:(I)Ljava/lang/String;
       195: aastore
       196: dup
       197: bipush        6
       199: ldc_w         #490                // String </td>
       202: aastore
       203: invokevirtual #454                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       206: aload         5
       208: iconst_1
       209: anewarray     #2                  // class java/lang/Object
       212: dup
       213: iconst_0
       214: ldc_w         #492                // String </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
       217: aastore
       218: invokevirtual #454                // Method ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
       221: iinc          4, 1
       224: goto          60
       227: aload         5
       229: bipush        20
       231: invokevirtual #494                // Method ext/mods/commons/data/Pagination.generateSpace:(I)V
       234: aload         5
       236: ldc_w         #497                // String bypass admin_effect %page%
       239: invokevirtual #499                // Method ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
       242: aload_3
       243: ldc_w         #502                // String %content%
       246: aload         5
       248: invokevirtual #504                // Method ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
       251: invokevirtual #424                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       254: aload_0
       255: aload_3
       256: invokevirtual #507                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       259: return
      LineNumberTable:
        line 366: 0
        line 367: 9
        line 368: 20
        line 370: 31
        line 372: 34
        line 373: 53
        line 375: 82
        line 376: 110
        line 377: 206
        line 379: 221
        line 380: 224
        line 382: 227
        line 383: 234
        line 385: 242
        line 386: 254
        line 387: 259
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           82     142     7 effect   Lext/mods/gameserver/skills/AbstractEffect;
            0     260     0 player   Lext/mods/gameserver/model/actor/Player;
            0     260     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     260     2  page   I
            9     251     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           34     226     4   row   I
           53     207     5  list   Lext/mods/commons/data/Pagination;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           53     207     5  list   Lext/mods/commons/data/Pagination<Lext/mods/gameserver/skills/AbstractEffect;>;
      StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, class ext/mods/commons/data/Pagination, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/skills/AbstractEffect ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/skills/AbstractEffect ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 72
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/skills/AbstractEffect ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int, class ext/mods/commons/data/Pagination, class java/util/Iterator, class ext/mods/gameserver/skills/AbstractEffect ]
          stack = [ class ext/mods/commons/data/Pagination, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 249 /* chop */
          offset_delta = 31

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        12
         2: anewarray     #10                 // class java/lang/String
         5: dup
         6: iconst_0
         7: ldc           #103                // String admin_abnormal
         9: aastore
        10: dup
        11: iconst_1
        12: ldc           #139                // String admin_atmosphere
        14: aastore
        15: dup
        16: iconst_2
        17: ldc           #201                // String admin_earthquake
        19: aastore
        20: dup
        21: iconst_3
        22: ldc           #214                // String admin_effect
        24: aastore
        25: dup
        26: iconst_4
        27: ldc_w         #307                // String admin_gmspeed
        30: aastore
        31: dup
        32: iconst_5
        33: ldc           #7                  // String admin_hide
        35: aastore
        36: dup
        37: bipush        6
        39: ldc           #57                 // String admin_invul
        41: aastore
        42: dup
        43: bipush        7
        45: ldc           #73                 // String admin_jukebox
        47: aastore
        48: dup
        49: bipush        8
        51: ldc_w         #327                // String admin_para
        54: aastore
        55: dup
        56: bipush        9
        58: ldc_w         #375                // String admin_play_sound
        61: aastore
        62: dup
        63: bipush        10
        65: ldc_w         #392                // String admin_social
        68: aastore
        69: dup
        70: bipush        11
        72: ldc           #83                 // String admin_undying
        74: aastore
        75: putstatic     #405                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        78: return
      LineNumberTable:
        line 52: 0
}
SourceFile: "AdminEffects.java"
BootstrapMethods:
  0: #591 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #569 0x\u0001
  1: #591 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #571 You removed all effects from \u0001.
  2: #597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #573 (Ljava/lang/Object;)Z
      #574 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminEffects.lambda$useAdminCommand$0:(ILext/mods/gameserver/skills/AbstractEffect;)Z
      #577 (Lext/mods/gameserver/skills/AbstractEffect;)Z
  3: #597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #579 (Ljava/lang/Object;)V
      #581 REF_invokeVirtual ext/mods/gameserver/skills/AbstractEffect.exit:()V
      #585 (Lext/mods/gameserver/skills/AbstractEffect;)V
  4: #591 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #587 You removed \u0001 skillId effect from \u0001.
  5: #591 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #589 \u0001s
InnerClasses:
  public static final #609= #605 of #607; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
