// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.SellBuff
// File: ext\mods\gameserver\handler\bypasshandlers\SellBuff.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/SellBuff.class
  Last modified 9 de jul de 2026; size 13588 bytes
  MD5 checksum 462bd240845902fb566f27f1001df2f2
  Compiled from "SellBuff.java"
public class ext.mods.gameserver.handler.bypasshandlers.SellBuff implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #43                         // ext/mods/gameserver/handler/bypasshandlers/SellBuff
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 7, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            //
    #8 = Utf8
    #9 = Class              #10           // java/lang/StringBuilder
   #10 = Utf8               java/lang/StringBuilder
   #11 = Methodref          #9.#3         // java/lang/StringBuilder."<init>":()V
   #12 = Class              #13           // java/util/StringTokenizer
   #13 = Utf8               java/util/StringTokenizer
   #14 = String             #15           //
   #15 = Utf8
   #16 = Methodref          #12.#17       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #17 = NameAndType        #5:#18        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #18 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #19 = Methodref          #12.#20       // java/util/StringTokenizer.hasMoreTokens:()Z
   #20 = NameAndType        #21:#22       // hasMoreTokens:()Z
   #21 = Utf8               hasMoreTokens
   #22 = Utf8               ()Z
   #23 = Methodref          #12.#24       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #24 = NameAndType        #25:#26       // nextToken:()Ljava/lang/String;
   #25 = Utf8               nextToken
   #26 = Utf8               ()Ljava/lang/String;
   #27 = Methodref          #9.#28        // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #28 = NameAndType        #29:#30       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #29 = Utf8               append
   #30 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #31 = Methodref          #32.#33       // java/lang/String.isEmpty:()Z
   #32 = Class              #34           // java/lang/String
   #33 = NameAndType        #35:#22       // isEmpty:()Z
   #34 = Utf8               java/lang/String
   #35 = Utf8               isEmpty
   #36 = Methodref          #9.#37        // java/lang/StringBuilder.toString:()Ljava/lang/String;
   #37 = NameAndType        #38:#26       // toString:()Ljava/lang/String;
   #38 = Utf8               toString
   #39 = Methodref          #32.#40       // java/lang/String.trim:()Ljava/lang/String;
   #40 = NameAndType        #41:#26       // trim:()Ljava/lang/String;
   #41 = Utf8               trim
   #42 = Methodref          #43.#44       // ext/mods/gameserver/handler/bypasshandlers/SellBuff.useBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #43 = Class              #45           // ext/mods/gameserver/handler/bypasshandlers/SellBuff
   #44 = NameAndType        #46:#47       // useBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #45 = Utf8               ext/mods/gameserver/handler/bypasshandlers/SellBuff
   #46 = Utf8               useBypass
   #47 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #48 = Fieldref           #49.#50       // ext/mods/Config.SELLBUFF_ENABLED:Z
   #49 = Class              #51           // ext/mods/Config
   #50 = NameAndType        #52:#53       // SELLBUFF_ENABLED:Z
   #51 = Utf8               ext/mods/Config
   #52 = Utf8               SELLBUFF_ENABLED
   #53 = Utf8               Z
   #54 = Methodref          #32.#55       // java/lang/String.hashCode:()I
   #55 = NameAndType        #56:#57       // hashCode:()I
   #56 = Utf8               hashCode
   #57 = Utf8               ()I
   #58 = String             #59           // sellbuffstart
   #59 = Utf8               sellbuffstart
   #60 = Methodref          #32.#61       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #61 = NameAndType        #62:#63       // equals:(Ljava/lang/Object;)Z
   #62 = Utf8               equals
   #63 = Utf8               (Ljava/lang/Object;)Z
   #64 = String             #65           // sellbuffstop
   #65 = Utf8               sellbuffstop
   #66 = String             #67           // sellbuffadd
   #67 = Utf8               sellbuffadd
   #68 = String             #69           // sellbuffedit
   #69 = Utf8               sellbuffedit
   #70 = String             #71           // sellbuffchangeprice
   #71 = Utf8               sellbuffchangeprice
   #72 = String             #73           // sellbuffremove
   #73 = Utf8               sellbuffremove
   #74 = String             #75           // sellbuffaddskill
   #75 = Utf8               sellbuffaddskill
   #76 = String             #77           // sellbuffbuymenu
   #77 = Utf8               sellbuffbuymenu
   #78 = String             #79           // sellbuffbuyskill
   #79 = Utf8               sellbuffbuyskill
   #80 = Methodref          #81.#82       // ext/mods/gameserver/model/actor/Player.isSellingBuffs:()Z
   #81 = Class              #83           // ext/mods/gameserver/model/actor/Player
   #82 = NameAndType        #84:#22       // isSellingBuffs:()Z
   #83 = Utf8               ext/mods/gameserver/model/actor/Player
   #84 = Utf8               isSellingBuffs
   #85 = Methodref          #86.#87       // ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
   #86 = Class              #88           // ext/mods/gameserver/data/manager/SellBuffsManager
   #87 = NameAndType        #89:#90       // getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
   #88 = Utf8               ext/mods/gameserver/data/manager/SellBuffsManager
   #89 = Utf8               getInstance
   #90 = Utf8               ()Lext/mods/gameserver/data/manager/SellBuffsManager;
   #91 = Methodref          #86.#92       // ext/mods/gameserver/data/manager/SellBuffsManager.canStartSellBuffs:(Lext/mods/gameserver/model/actor/Player;)Z
   #92 = NameAndType        #93:#94       // canStartSellBuffs:(Lext/mods/gameserver/model/actor/Player;)Z
   #93 = Utf8               canStartSellBuffs
   #94 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #95 = Methodref          #81.#96       // ext/mods/gameserver/model/actor/Player.getSellingBuffs:()Ljava/util/List;
   #96 = NameAndType        #97:#98       // getSellingBuffs:()Ljava/util/List;
   #97 = Utf8               getSellingBuffs
   #98 = Utf8               ()Ljava/util/List;
   #99 = InterfaceMethodref #100.#33      // java/util/List.isEmpty:()Z
  #100 = Class              #101          // java/util/List
  #101 = Utf8               java/util/List
  #102 = String             #103          // Your list of buffs is empty, please add some buffs first!
  #103 = Utf8               Your list of buffs is empty, please add some buffs first!
  #104 = Methodref          #81.#105      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #105 = NameAndType        #106:#107     // sendMessage:(Ljava/lang/String;)V
  #106 = Utf8               sendMessage
  #107 = Utf8               (Ljava/lang/String;)V
  #108 = String             #109          // BUFF SELL:
  #109 = Utf8               BUFF SELL:
  #110 = InvokeDynamic      #0:#111       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #111 = NameAndType        #112:#113     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #112 = Utf8               makeConcatWithConstants
  #113 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #114 = Methodref          #9.#115       // java/lang/StringBuilder.length:()I
  #115 = NameAndType        #116:#57      // length:()I
  #116 = Utf8               length
  #117 = String             #118          // Your title cannot exceed 29 characters in length. Please try again.
  #118 = Utf8               Your title cannot exceed 29 characters in length. Please try again.
  #119 = Methodref          #86.#120      // ext/mods/gameserver/data/manager/SellBuffsManager.startSellBuffs:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #120 = NameAndType        #121:#122     // startSellBuffs:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #121 = Utf8               startSellBuffs
  #122 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #123 = Methodref          #86.#124      // ext/mods/gameserver/data/manager/SellBuffsManager.stopSellBuffs:(Lext/mods/gameserver/model/actor/Player;)V
  #124 = NameAndType        #125:#126     // stopSellBuffs:(Lext/mods/gameserver/model/actor/Player;)V
  #125 = Utf8               stopSellBuffs
  #126 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #127 = Methodref          #128.#129     // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
  #128 = Class              #130          // ext/mods/commons/lang/StringUtil
  #129 = NameAndType        #131:#132     // isDigit:(Ljava/lang/String;)Z
  #130 = Utf8               ext/mods/commons/lang/StringUtil
  #131 = Utf8               isDigit
  #132 = Utf8               (Ljava/lang/String;)Z
  #133 = Methodref          #134.#135     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #134 = Class              #136          // java/lang/Integer
  #135 = NameAndType        #137:#138     // parseInt:(Ljava/lang/String;)I
  #136 = Utf8               java/lang/Integer
  #137 = Utf8               parseInt
  #138 = Utf8               (Ljava/lang/String;)I
  #139 = Methodref          #86.#140      // ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffChoiceMenu:(Lext/mods/gameserver/model/actor/Player;I)V
  #140 = NameAndType        #141:#142     // sendBuffChoiceMenu:(Lext/mods/gameserver/model/actor/Player;I)V
  #141 = Utf8               sendBuffChoiceMenu
  #142 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #143 = Methodref          #86.#144      // ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffEditMenu:(Lext/mods/gameserver/model/actor/Player;I)V
  #144 = NameAndType        #145:#142     // sendBuffEditMenu:(Lext/mods/gameserver/model/actor/Player;I)V
  #145 = Utf8               sendBuffEditMenu
  #146 = Class              #147          // java/lang/NumberFormatException
  #147 = Utf8               java/lang/NumberFormatException
  #148 = Fieldref           #49.#149      // ext/mods/Config.SELLBUFF_MAX_PRICE:J
  #149 = NameAndType        #150:#151     // SELLBUFF_MAX_PRICE:J
  #150 = Utf8               SELLBUFF_MAX_PRICE
  #151 = Utf8               J
  #152 = InvokeDynamic      #1:#153       // #1:makeConcatWithConstants:(J)Ljava/lang/String;
  #153 = NameAndType        #112:#154     // makeConcatWithConstants:(J)Ljava/lang/String;
  #154 = Utf8               (J)Ljava/lang/String;
  #155 = Fieldref           #156.#157     // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #156 = Class              #158          // ext/mods/gameserver/enums/actors/NpcSkillType
  #157 = NameAndType        #159:#160     // BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #158 = Utf8               ext/mods/gameserver/enums/actors/NpcSkillType
  #159 = Utf8               BUFF1
  #160 = Utf8               Lext/mods/gameserver/enums/actors/NpcSkillType;
  #161 = Methodref          #86.#162      // ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #162 = NameAndType        #163:#164     // getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #163 = Utf8               getBuffSkill
  #164 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #165 = Fieldref           #156.#166     // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #166 = NameAndType        #167:#160     // BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #167 = Utf8               BUFF2
  #168 = Methodref          #81.#169      // ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #169 = NameAndType        #170:#171     // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #170 = Utf8               getSkill
  #171 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #172 = InterfaceMethodref #100.#173     // java/util/List.stream:()Ljava/util/stream/Stream;
  #173 = NameAndType        #174:#175     // stream:()Ljava/util/stream/Stream;
  #174 = Utf8               stream
  #175 = Utf8               ()Ljava/util/stream/Stream;
  #176 = InvokeDynamic      #2:#177       // #2:test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
  #177 = NameAndType        #178:#179     // test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
  #178 = Utf8               test
  #179 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
  #180 = InterfaceMethodref #181.#182     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #181 = Class              #183          // java/util/stream/Stream
  #182 = NameAndType        #184:#185     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #183 = Utf8               java/util/stream/Stream
  #184 = Utf8               filter
  #185 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #186 = InterfaceMethodref #181.#187     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #187 = NameAndType        #188:#189     // findFirst:()Ljava/util/Optional;
  #188 = Utf8               findFirst
  #189 = Utf8               ()Ljava/util/Optional;
  #190 = Methodref          #191.#192     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #191 = Class              #193          // java/util/Optional
  #192 = NameAndType        #194:#195     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #193 = Utf8               java/util/Optional
  #194 = Utf8               orElse
  #195 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #196 = Class              #197          // ext/mods/gameserver/model/SellBuffHolder
  #197 = Utf8               ext/mods/gameserver/model/SellBuffHolder
  #198 = Methodref          #199.#200     // ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
  #199 = Class              #201          // ext/mods/gameserver/skills/L2Skill
  #200 = NameAndType        #202:#26      // getName:()Ljava/lang/String;
  #201 = Utf8               ext/mods/gameserver/skills/L2Skill
  #202 = Utf8               getName
  #203 = InvokeDynamic      #3:#204       // #3:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #204 = NameAndType        #112:#205     // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #205 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #206 = Methodref          #196.#207     // ext/mods/gameserver/model/SellBuffHolder.setPrice:(I)V
  #207 = NameAndType        #208:#209     // setPrice:(I)V
  #208 = Utf8               setPrice
  #209 = Utf8               (I)V
  #210 = Methodref          #81.#211      // ext/mods/gameserver/model/actor/Player.saveSellingBuffs:()V
  #211 = NameAndType        #212:#6       // saveSellingBuffs:()V
  #212 = Utf8               saveSellingBuffs
  #213 = InvokeDynamic      #4:#177       // #4:test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
  #214 = InterfaceMethodref #100.#215     // java/util/List.remove:(Ljava/lang/Object;)Z
  #215 = NameAndType        #216:#63      // remove:(Ljava/lang/Object;)Z
  #216 = Utf8               remove
  #217 = InvokeDynamic      #5:#111       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #218 = String             #219          // \\s+
  #219 = Utf8               \\s+
  #220 = Methodref          #32.#221      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #221 = NameAndType        #222:#223     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #222 = Utf8               split
  #223 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #224 = Fieldref           #43.#225      // ext/mods/gameserver/handler/bypasshandlers/SellBuff.LOGGER:Lext/mods/commons/logging/CLogger;
  #225 = NameAndType        #226:#227     // LOGGER:Lext/mods/commons/logging/CLogger;
  #226 = Utf8               LOGGER
  #227 = Utf8               Lext/mods/commons/logging/CLogger;
  #228 = String             #229          // illegal bypass
  #229 = Utf8               illegal bypass
  #230 = Methodref          #231.#232     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #231 = Class              #233          // ext/mods/commons/logging/CLogger
  #232 = NameAndType        #234:#235     // warn:(Ljava/lang/Object;)V
  #233 = Utf8               ext/mods/commons/logging/CLogger
  #234 = Utf8               warn
  #235 = Utf8               (Ljava/lang/Object;)V
  #236 = String             #237          // illegal bypass input
  #237 = Utf8               illegal bypass input
  #238 = Fieldref           #49.#239      // ext/mods/Config.SELLBUFF_MIN_PRICE:J
  #239 = NameAndType        #240:#151     // SELLBUFF_MIN_PRICE:J
  #240 = Utf8               SELLBUFF_MIN_PRICE
  #241 = InvokeDynamic      #6:#153       // #6:makeConcatWithConstants:(J)Ljava/lang/String;
  #242 = InterfaceMethodref #100.#243     // java/util/List.size:()I
  #243 = NameAndType        #244:#57      // size:()I
  #244 = Utf8               size
  #245 = Fieldref           #49.#246      // ext/mods/Config.SELLBUFF_MAX_BUFFS:I
  #246 = NameAndType        #247:#248     // SELLBUFF_MAX_BUFFS:I
  #247 = Utf8               SELLBUFF_MAX_BUFFS
  #248 = Utf8               I
  #249 = InvokeDynamic      #7:#250       // #7:makeConcatWithConstants:(I)Ljava/lang/String;
  #250 = NameAndType        #112:#251     // makeConcatWithConstants:(I)Ljava/lang/String;
  #251 = Utf8               (I)Ljava/lang/String;
  #252 = String             #253          // illegal state bypass
  #253 = Utf8               illegal state bypass
  #254 = Methodref          #199.#255     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #255 = NameAndType        #256:#57      // getLevel:()I
  #256 = Utf8               getLevel
  #257 = Methodref          #196.#258     // ext/mods/gameserver/model/SellBuffHolder."<init>":(III)V
  #258 = NameAndType        #5:#259       // "<init>":(III)V
  #259 = Utf8               (III)V
  #260 = Methodref          #86.#261      // ext/mods/gameserver/data/manager/SellBuffsManager.isInSellList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #261 = NameAndType        #262:#263     // isInSellList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #262 = Utf8               isInSellList
  #263 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #264 = InterfaceMethodref #100.#265     // java/util/List.add:(Ljava/lang/Object;)Z
  #265 = NameAndType        #266:#63      // add:(Ljava/lang/Object;)Z
  #266 = Utf8               add
  #267 = InvokeDynamic      #8:#111       // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #268 = String             #269          // Attempt to add a skill that is already on sale.
  #269 = Utf8               Attempt to add a skill that is already on sale.
  #270 = String             #271          // This skill is already on sale.
  #271 = Utf8               This skill is already on sale.
  #272 = Methodref          #273.#274     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #273 = Class              #275          // ext/mods/gameserver/model/World
  #274 = NameAndType        #89:#276      // getInstance:()Lext/mods/gameserver/model/World;
  #275 = Utf8               ext/mods/gameserver/model/World
  #276 = Utf8               ()Lext/mods/gameserver/model/World;
  #277 = Methodref          #273.#278     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #278 = NameAndType        #279:#280     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #279 = Utf8               getPlayer
  #280 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #281 = Class              #282          // ext/mods/gameserver/model/actor/Npc
  #282 = Utf8               ext/mods/gameserver/model/actor/Npc
  #283 = Methodref          #81.#284      // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #284 = NameAndType        #285:#286     // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #285 = Utf8               isIn3DRadius
  #286 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #287 = Methodref          #86.#288      // ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffMenu:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)V
  #288 = NameAndType        #289:#290     // sendBuffMenu:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)V
  #289 = Utf8               sendBuffMenu
  #290 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)V
  #291 = Methodref          #196.#292     // ext/mods/gameserver/model/SellBuffHolder.getSkillFrom:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/skills/L2Skill;
  #292 = NameAndType        #293:#294     // getSkillFrom:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/skills/L2Skill;
  #293 = Utf8               getSkillFrom
  #294 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/skills/L2Skill;
  #295 = String             #296          // Seller[{}] try to sell missing skill[{}]
  #296 = Utf8               Seller[{}] try to sell missing skill[{}]
  #297 = Methodref          #81.#200      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #298 = Methodref          #196.#299     // ext/mods/gameserver/model/SellBuffHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #299 = NameAndType        #170:#300     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #300 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #301 = Methodref          #231.#302     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #302 = NameAndType        #234:#303     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #303 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #304 = Methodref          #81.#305      // ext/mods/gameserver/model/actor/Player.isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #305 = NameAndType        #306:#286     // isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #306 = Utf8               isInStrictRadius
  #307 = Methodref          #81.#308      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #308 = NameAndType        #309:#310     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #309 = Utf8               getStatus
  #310 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #311 = Methodref          #312.#313     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
  #312 = Class              #314          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #313 = NameAndType        #315:#316     // getMp:()D
  #314 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #315 = Utf8               getMp
  #316 = Utf8               ()D
  #317 = Methodref          #199.#318     // ext/mods/gameserver/skills/L2Skill.getMpConsume:()I
  #318 = NameAndType        #319:#57      // getMpConsume:()I
  #319 = Utf8               getMpConsume
  #320 = Methodref          #321.#322     // java/lang/Math.max:(II)I
  #321 = Class              #323          // java/lang/Math
  #322 = NameAndType        #324:#325     // max:(II)I
  #323 = Utf8               java/lang/Math
  #324 = Utf8               max
  #325 = Utf8               (II)I
  #326 = Fieldref           #49.#327      // ext/mods/Config.SELLBUFF_MP_MULTIPLER:I
  #327 = NameAndType        #328:#248     // SELLBUFF_MP_MULTIPLER:I
  #328 = Utf8               SELLBUFF_MP_MULTIPLER
  #329 = InvokeDynamic      #9:#330       // #9:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #330 = NameAndType        #112:#331     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #331 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #332 = Methodref          #81.#333      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #333 = NameAndType        #334:#335     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #334 = Utf8               getInventory
  #335 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #336 = Fieldref           #49.#337      // ext/mods/Config.SELLBUFF_PAYMENT_ID:I
  #337 = NameAndType        #338:#248     // SELLBUFF_PAYMENT_ID:I
  #338 = Utf8               SELLBUFF_PAYMENT_ID
  #339 = Methodref          #340.#341     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(I)I
  #340 = Class              #342          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #341 = NameAndType        #343:#344     // getItemCount:(I)I
  #342 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #343 = Utf8               getItemCount
  #344 = Utf8               (I)I
  #345 = Methodref          #196.#346     // ext/mods/gameserver/model/SellBuffHolder.getPrice:()I
  #346 = NameAndType        #347:#57      // getPrice:()I
  #347 = Utf8               getPrice
  #348 = Integer            2147483647
  #349 = Methodref          #340.#350     // ext/mods/gameserver/model/itemcontainer/PcInventory.getAdena:()I
  #350 = NameAndType        #351:#57      // getAdena:()I
  #351 = Utf8               getAdena
  #352 = String             #353          // Seller have limit adena.
  #353 = Utf8               Seller have limit adena.
  #354 = Methodref          #81.#355      // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #355 = NameAndType        #356:#357     // destroyItemByItemId:(IIZ)Z
  #356 = Utf8               destroyItemByItemId
  #357 = Utf8               (IIZ)Z
  #358 = Methodref          #81.#359      // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #359 = NameAndType        #360:#361     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #360 = Utf8               addItem
  #361 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #362 = Methodref          #312.#363     // ext/mods/gameserver/model/actor/status/PlayerStatus.reduceMp:(D)D
  #363 = NameAndType        #364:#365     // reduceMp:(D)D
  #364 = Utf8               reduceMp
  #365 = Utf8               (D)D
  #366 = Class              #367          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #367 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #368 = Methodref          #196.#369     // ext/mods/gameserver/model/SellBuffHolder.getSkillUse:()I
  #369 = NameAndType        #370:#57      // getSkillUse:()I
  #370 = Utf8               getSkillUse
  #371 = Methodref          #366.#372     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #372 = NameAndType        #5:#373       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #373 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #374 = Methodref          #81.#375      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #375 = NameAndType        #376:#377     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #376 = Utf8               sendPacket
  #377 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #378 = Methodref          #86.#379      // ext/mods/gameserver/data/manager/SellBuffsManager.getBuff:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/SellBuffData;
  #379 = NameAndType        #380:#381     // getBuff:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/SellBuffData;
  #380 = Utf8               getBuff
  #381 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/SellBuffData;
  #382 = Fieldref           #49.#383      // ext/mods/Config.CUSTOM_TIME_BUFF:Z
  #383 = NameAndType        #384:#53      // CUSTOM_TIME_BUFF:Z
  #384 = Utf8               CUSTOM_TIME_BUFF
  #385 = Methodref          #81.#386      // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #386 = NameAndType        #387:#388     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #387 = Utf8               getSummon
  #388 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #389 = Methodref          #390.#391     // ext/mods/gameserver/model/records/SellBuffData.applyOnPets:()Z
  #390 = Class              #392          // ext/mods/gameserver/model/records/SellBuffData
  #391 = NameAndType        #393:#22      // applyOnPets:()Z
  #392 = Utf8               ext/mods/gameserver/model/records/SellBuffData
  #393 = Utf8               applyOnPets
  #394 = Methodref          #199.#395     // ext/mods/gameserver/skills/L2Skill.getEffectsSellBuff:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #395 = NameAndType        #396:#397     // getEffectsSellBuff:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #396 = Utf8               getEffectsSellBuff
  #397 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #398 = Methodref          #199.#399     // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #399 = NameAndType        #400:#397     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #400 = Utf8               getEffects
  #401 = Methodref          #402.#403     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #402 = Class              #404          // ext/mods/gameserver/data/xml/ItemData
  #403 = NameAndType        #89:#405      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #404 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #405 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #406 = Methodref          #402.#407     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #407 = NameAndType        #408:#409     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #408 = Utf8               getTemplate
  #409 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #410 = Methodref          #411.#200     // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #411 = Class              #412          // ext/mods/gameserver/model/item/kind/Item
  #412 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #413 = InvokeDynamic      #10:#111      // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #414 = String             #415          // Not enough items!
  #415 = Utf8               Not enough items!
  #416 = Fieldref           #43.#417      // ext/mods/gameserver/handler/bypasshandlers/SellBuff.COMMANDS:[Ljava/lang/String;
  #417 = NameAndType        #418:#419     // COMMANDS:[Ljava/lang/String;
  #418 = Utf8               COMMANDS
  #419 = Utf8               [Ljava/lang/String;
  #420 = Methodref          #196.#421     // ext/mods/gameserver/model/SellBuffHolder.getSkillId:()I
  #421 = NameAndType        #422:#57      // getSkillId:()I
  #422 = Utf8               getSkillId
  #423 = Methodref          #199.#424     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #424 = NameAndType        #425:#57      // getId:()I
  #425 = Utf8               getId
  #426 = Class              #427          // ext/mods/gameserver/handler/IBypassHandler
  #427 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #428 = Utf8               Code
  #429 = Utf8               LineNumberTable
  #430 = Utf8               LocalVariableTable
  #431 = Utf8               this
  #432 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/SellBuff;
  #433 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #434 = Utf8               command
  #435 = Utf8               Ljava/lang/String;
  #436 = Utf8               player
  #437 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #438 = Utf8               target
  #439 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #440 = Utf8               cmd
  #441 = Utf8               params
  #442 = Utf8               Ljava/lang/StringBuilder;
  #443 = Utf8               st
  #444 = Utf8               Ljava/util/StringTokenizer;
  #445 = Utf8               StackMapTable
  #446 = Utf8               title
  #447 = Utf8               index
  #448 = Utf8               e
  #449 = Utf8               Ljava/lang/NumberFormatException;
  #450 = Utf8               skillId
  #451 = Utf8               price
  #452 = Utf8               skillToChange
  #453 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #454 = Utf8               holder
  #455 = Utf8               Lext/mods/gameserver/model/SellBuffHolder;
  #456 = Utf8               skillToRemove
  #457 = Utf8               index2
  #458 = Utf8               e1
  #459 = Utf8               parts
  #460 = Utf8               skillToAdd
  #461 = Utf8               skillHolder
  #462 = Utf8               objId
  #463 = Utf8               seller
  #464 = Utf8               skillLvl
  #465 = Utf8               skillPrice
  #466 = Utf8               buffSkill
  #467 = Utf8               Lext/mods/gameserver/model/records/SellBuffData;
  #468 = Utf8               item
  #469 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #470 = Utf8               skillToBuy
  #471 = Class              #419          // "[Ljava/lang/String;"
  #472 = Utf8               getBypassList
  #473 = Utf8               ()[Ljava/lang/String;
  #474 = Utf8               lambda$useBypass$1
  #475 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/SellBuffHolder;)Z
  #476 = Utf8               h
  #477 = Utf8               lambda$useBypass$0
  #478 = Utf8               <clinit>
  #479 = Utf8               SourceFile
  #480 = Utf8               SellBuff.java
  #481 = Utf8               BootstrapMethods
  #482 = String             #483          // \u0001
  #483 = Utf8               \u0001
  #484 = String             #485          // Too big price! Maximum price is \u0001
  #485 = Utf8               Too big price! Maximum price is \u0001
  #486 = MethodType         #63           //  (Ljava/lang/Object;)Z
  #487 = MethodHandle       6:#488        // REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/SellBuff.lambda$useBypass$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/SellBuffHolder;)Z
  #488 = Methodref          #43.#489      // ext/mods/gameserver/handler/bypasshandlers/SellBuff.lambda$useBypass$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/SellBuffHolder;)Z
  #489 = NameAndType        #477:#475     // lambda$useBypass$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/SellBuffHolder;)Z
  #490 = MethodType         #491          //  (Lext/mods/gameserver/model/SellBuffHolder;)Z
  #491 = Utf8               (Lext/mods/gameserver/model/SellBuffHolder;)Z
  #492 = String             #493          // Price of \u0001 has been changed to \u0001!
  #493 = Utf8               Price of \u0001 has been changed to \u0001!
  #494 = MethodHandle       6:#495        // REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/SellBuff.lambda$useBypass$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/SellBuffHolder;)Z
  #495 = Methodref          #43.#496      // ext/mods/gameserver/handler/bypasshandlers/SellBuff.lambda$useBypass$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/SellBuffHolder;)Z
  #496 = NameAndType        #474:#475     // lambda$useBypass$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/SellBuffHolder;)Z
  #497 = String             #498          // Skill \u0001 has been removed!
  #498 = Utf8               Skill \u0001 has been removed!
  #499 = String             #500          // Too small price! Minimum price is \u0001
  #500 = Utf8               Too small price! Minimum price is \u0001
  #501 = String             #502          // You already reached max count of buffs! Max buffs is: \u0001
  #502 = Utf8               You already reached max count of buffs! Max buffs is: \u0001
  #503 = String             #504          // \u0001 has been added!
  #504 = Utf8               \u0001 has been added!
  #505 = String             #506          // \u0001 has no enough mana for \u0001!
  #506 = Utf8               \u0001 has no enough mana for \u0001!
  #507 = String             #508          // Not enough \u0001!
  #508 = Utf8               Not enough \u0001!
  #509 = MethodHandle       6:#510        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #510 = Methodref          #511.#512     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #511 = Class              #513          // java/lang/invoke/StringConcatFactory
  #512 = NameAndType        #112:#514     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #513 = Utf8               java/lang/invoke/StringConcatFactory
  #514 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #515 = MethodHandle       6:#516        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #516 = Methodref          #517.#518     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #517 = Class              #519          // java/lang/invoke/LambdaMetafactory
  #518 = NameAndType        #520:#521     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #519 = Utf8               java/lang/invoke/LambdaMetafactory
  #520 = Utf8               metafactory
  #521 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #522 = Utf8               InnerClasses
  #523 = Class              #524          // java/lang/invoke/MethodHandles$Lookup
  #524 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #525 = Class              #526          // java/lang/invoke/MethodHandles
  #526 = Utf8               java/lang/invoke/MethodHandles
  #527 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.bypasshandlers.SellBuff();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/SellBuff;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=4
         0: ldc           #7                  // String
         2: astore        4
         4: new           #9                  // class java/lang/StringBuilder
         7: dup
         8: invokespecial #11                 // Method java/lang/StringBuilder."<init>":()V
        11: astore        5
        13: new           #12                 // class java/util/StringTokenizer
        16: dup
        17: aload_1
        18: ldc           #14                 // String
        20: invokespecial #16                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        23: astore        6
        25: aload         6
        27: invokevirtual #19                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        30: ifeq          40
        33: aload         6
        35: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        38: astore        4
        40: aload         6
        42: invokevirtual #19                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        45: ifeq          78
        48: aload         5
        50: aload         6
        52: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        55: invokevirtual #27                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        58: pop
        59: aload         6
        61: invokevirtual #19                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        64: ifeq          40
        67: aload         5
        69: ldc           #14                 // String
        71: invokevirtual #27                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        74: pop
        75: goto          40
        78: aload         4
        80: invokevirtual #31                 // Method java/lang/String.isEmpty:()Z
        83: ifeq          88
        86: iconst_0
        87: ireturn
        88: aload_0
        89: aload         4
        91: aload_2
        92: aload         5
        94: invokevirtual #36                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        97: invokevirtual #39                 // Method java/lang/String.trim:()Ljava/lang/String;
       100: invokevirtual #42                 // Method useBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       103: ireturn
      LineNumberTable:
        line 56: 0
        line 57: 4
        line 58: 13
        line 60: 25
        line 61: 33
        line 63: 40
        line 65: 48
        line 66: 59
        line 67: 67
        line 70: 78
        line 71: 86
        line 73: 88
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     104     0  this   Lext/mods/gameserver/handler/bypasshandlers/SellBuff;
            0     104     1 command   Ljava/lang/String;
            0     104     2 player   Lext/mods/gameserver/model/actor/Player;
            0     104     3 target   Lext/mods/gameserver/model/actor/Creature;
            4     100     4   cmd   Ljava/lang/String;
           13      91     5 params   Ljava/lang/StringBuilder;
           25      79     6    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 40
          locals = [ class java/lang/String, class java/lang/StringBuilder, class java/util/StringTokenizer ]
        frame_type = 37 /* same */
        frame_type = 9 /* same */

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=16, args_size=4
         0: getstatic     #48                 // Field ext/mods/Config.SELLBUFF_ENABLED:Z
         3: ifne          8
         6: iconst_0
         7: ireturn
         8: aload_1
         9: astore        4
        11: iconst_m1
        12: istore        5
        14: aload         4
        16: invokevirtual #54                 // Method java/lang/String.hashCode:()I
        19: lookupswitch  { // 9

             -2096568672: 213

             -1322609700: 132

              -815120395: 196

              -563404496: 230

               299498717: 100

               652398441: 180

              1948891695: 148

              1949324327: 116

              2046106580: 164
                 default: 244
            }
       100: aload         4
       102: ldc           #58                 // String sellbuffstart
       104: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       107: ifeq          244
       110: iconst_0
       111: istore        5
       113: goto          244
       116: aload         4
       118: ldc           #64                 // String sellbuffstop
       120: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       123: ifeq          244
       126: iconst_1
       127: istore        5
       129: goto          244
       132: aload         4
       134: ldc           #66                 // String sellbuffadd
       136: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       139: ifeq          244
       142: iconst_2
       143: istore        5
       145: goto          244
       148: aload         4
       150: ldc           #68                 // String sellbuffedit
       152: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       155: ifeq          244
       158: iconst_3
       159: istore        5
       161: goto          244
       164: aload         4
       166: ldc           #70                 // String sellbuffchangeprice
       168: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       171: ifeq          244
       174: iconst_4
       175: istore        5
       177: goto          244
       180: aload         4
       182: ldc           #72                 // String sellbuffremove
       184: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       187: ifeq          244
       190: iconst_5
       191: istore        5
       193: goto          244
       196: aload         4
       198: ldc           #74                 // String sellbuffaddskill
       200: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       203: ifeq          244
       206: bipush        6
       208: istore        5
       210: goto          244
       213: aload         4
       215: ldc           #76                 // String sellbuffbuymenu
       217: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       220: ifeq          244
       223: bipush        7
       225: istore        5
       227: goto          244
       230: aload         4
       232: ldc           #78                 // String sellbuffbuyskill
       234: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       237: ifeq          244
       240: bipush        8
       242: istore        5
       244: iload         5
       246: tableswitch   { // 0 to 8

                       0: 296

                       1: 437

                       2: 454

                       3: 500

                       4: 546

                       5: 849

                       6: 1106

                       7: 1612

                       8: 1728
                 default: 2332
            }
       296: aload_2
       297: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.isSellingBuffs:()Z
       300: ifne          314
       303: aload_3
       304: ifnull        314
       307: aload_3
       308: invokevirtual #31                 // Method java/lang/String.isEmpty:()Z
       311: ifeq          316
       314: iconst_0
       315: ireturn
       316: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       319: aload_2
       320: invokevirtual #91                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.canStartSellBuffs:(Lext/mods/gameserver/model/actor/Player;)Z
       323: ifne          328
       326: iconst_0
       327: ireturn
       328: aload_2
       329: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.getSellingBuffs:()Ljava/util/List;
       332: invokeinterface #99,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       337: ifeq          348
       340: aload_2
       341: ldc           #102                // String Your list of buffs is empty, please add some buffs first!
       343: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       346: iconst_0
       347: ireturn
       348: new           #9                  // class java/lang/StringBuilder
       351: dup
       352: invokespecial #11                 // Method java/lang/StringBuilder."<init>":()V
       355: astore        6
       357: aload         6
       359: ldc           #108                // String BUFF SELL:
       361: invokevirtual #27                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       364: pop
       365: new           #12                 // class java/util/StringTokenizer
       368: dup
       369: aload_3
       370: ldc           #14                 // String
       372: invokespecial #16                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       375: astore        7
       377: aload         7
       379: invokevirtual #19                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       382: ifeq          404
       385: aload         6
       387: aload         7
       389: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       392: invokedynamic #110,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       397: invokevirtual #27                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       400: pop
       401: goto          377
       404: aload         6
       406: invokevirtual #114                // Method java/lang/StringBuilder.length:()I
       409: bipush        40
       411: if_icmple     422
       414: aload_2
       415: ldc           #117                // String Your title cannot exceed 29 characters in length. Please try again.
       417: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       420: iconst_0
       421: ireturn
       422: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       425: aload_2
       426: aload         6
       428: invokevirtual #36                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       431: invokevirtual #119                // Method ext/mods/gameserver/data/manager/SellBuffsManager.startSellBuffs:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       434: goto          2332
       437: aload_2
       438: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.isSellingBuffs:()Z
       441: ifeq          2332
       444: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       447: aload_2
       448: invokevirtual #123                // Method ext/mods/gameserver/data/manager/SellBuffsManager.stopSellBuffs:(Lext/mods/gameserver/model/actor/Player;)V
       451: goto          2332
       454: aload_2
       455: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.isSellingBuffs:()Z
       458: ifne          2332
       461: iconst_1
       462: istore        6
       464: aload_3
       465: ifnull        488
       468: aload_3
       469: invokevirtual #31                 // Method java/lang/String.isEmpty:()Z
       472: ifne          488
       475: aload_3
       476: invokestatic  #127                // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
       479: ifeq          488
       482: aload_3
       483: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       486: istore        6
       488: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       491: aload_2
       492: iload         6
       494: invokevirtual #139                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffChoiceMenu:(Lext/mods/gameserver/model/actor/Player;I)V
       497: goto          2332
       500: aload_2
       501: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.isSellingBuffs:()Z
       504: ifne          2332
       507: iconst_1
       508: istore        6
       510: aload_3
       511: ifnull        534
       514: aload_3
       515: invokevirtual #31                 // Method java/lang/String.isEmpty:()Z
       518: ifne          534
       521: aload_3
       522: invokestatic  #127                // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
       525: ifeq          534
       528: aload_3
       529: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       532: istore        6
       534: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       537: aload_2
       538: iload         6
       540: invokevirtual #143                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffEditMenu:(Lext/mods/gameserver/model/actor/Player;I)V
       543: goto          2332
       546: aload_2
       547: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.isSellingBuffs:()Z
       550: ifne          2332
       553: aload_3
       554: ifnull        2332
       557: aload_3
       558: invokevirtual #31                 // Method java/lang/String.isEmpty:()Z
       561: ifne          2332
       564: new           #12                 // class java/util/StringTokenizer
       567: dup
       568: aload_3
       569: ldc           #14                 // String
       571: invokespecial #16                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       574: astore        6
       576: iconst_m1
       577: istore        7
       579: iconst_m1
       580: istore        8
       582: aload         6
       584: invokevirtual #19                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       587: ifeq          600
       590: aload         6
       592: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       595: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       598: istore        7
       600: aload         6
       602: invokevirtual #19                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       605: ifeq          643
       608: aload         6
       610: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       613: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       616: istore        8
       618: goto          643
       621: astore        9
       623: aload_2
       624: getstatic     #148                // Field ext/mods/Config.SELLBUFF_MAX_PRICE:J
       627: invokedynamic #152,  0            // InvokeDynamic #1:makeConcatWithConstants:(J)Ljava/lang/String;
       632: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       635: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       638: aload_2
       639: iconst_1
       640: invokevirtual #143                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffEditMenu:(Lext/mods/gameserver/model/actor/Player;I)V
       643: iload         7
       645: iconst_m1
       646: if_icmpeq     655
       649: iload         8
       651: iconst_m1
       652: if_icmpne     657
       655: iconst_0
       656: ireturn
       657: iload         7
       659: tableswitch   { // 4699 to 4703

                    4699: 692

                    4700: 708

                    4701: 756

                    4702: 724

                    4703: 740
                 default: 756
            }
       692: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       695: aload_2
       696: sipush        1331
       699: getstatic     #155                // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       702: invokevirtual #161                // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
       705: goto          762
       708: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       711: aload_2
       712: sipush        1331
       715: getstatic     #165                // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
       718: invokevirtual #161                // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
       721: goto          762
       724: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       727: aload_2
       728: sipush        1332
       731: getstatic     #155                // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       734: invokevirtual #161                // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
       737: goto          762
       740: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       743: aload_2
       744: sipush        1332
       747: getstatic     #165                // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
       750: invokevirtual #161                // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
       753: goto          762
       756: aload_2
       757: iload         7
       759: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
       762: astore        9
       764: aload         9
       766: ifnonnull     771
       769: iconst_0
       770: ireturn
       771: aload_2
       772: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.getSellingBuffs:()Ljava/util/List;
       775: invokeinterface #172,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
       780: aload         9
       782: invokedynamic #176,  0            // InvokeDynamic #2:test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
       787: invokeinterface #180,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       792: invokeinterface #186,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
       797: aconst_null
       798: invokevirtual #190                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       801: checkcast     #196                // class ext/mods/gameserver/model/SellBuffHolder
       804: astore        10
       806: aload         10
       808: ifnull        846
       811: aload_2
       812: aload         9
       814: invokevirtual #198                // Method ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
       817: iload         8
       819: invokedynamic #203,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       824: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       827: aload         10
       829: iload         8
       831: invokevirtual #206                // Method ext/mods/gameserver/model/SellBuffHolder.setPrice:(I)V
       834: aload_2
       835: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Player.saveSellingBuffs:()V
       838: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       841: aload_2
       842: iconst_1
       843: invokevirtual #143                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffEditMenu:(Lext/mods/gameserver/model/actor/Player;I)V
       846: goto          2332
       849: aload_2
       850: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.isSellingBuffs:()Z
       853: ifne          2332
       856: aload_3
       857: ifnull        2332
       860: aload_3
       861: invokevirtual #31                 // Method java/lang/String.isEmpty:()Z
       864: ifne          2332
       867: new           #12                 // class java/util/StringTokenizer
       870: dup
       871: aload_3
       872: ldc           #14                 // String
       874: invokespecial #16                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       877: astore        6
       879: iconst_m1
       880: istore        7
       882: aload         6
       884: invokevirtual #19                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       887: ifeq          900
       890: aload         6
       892: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       895: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       898: istore        7
       900: iload         7
       902: iconst_m1
       903: if_icmpne     908
       906: iconst_0
       907: ireturn
       908: iload         7
       910: tableswitch   { // 4699 to 4703

                    4699: 944

                    4700: 960

                    4701: 1008

                    4702: 976

                    4703: 992
                 default: 1008
            }
       944: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       947: aload_2
       948: sipush        1331
       951: getstatic     #155                // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       954: invokevirtual #161                // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
       957: goto          1014
       960: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       963: aload_2
       964: sipush        1331
       967: getstatic     #165                // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
       970: invokevirtual #161                // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
       973: goto          1014
       976: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       979: aload_2
       980: sipush        1332
       983: getstatic     #155                // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       986: invokevirtual #161                // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
       989: goto          1014
       992: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       995: aload_2
       996: sipush        1332
       999: getstatic     #165                // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1002: invokevirtual #161                // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
      1005: goto          1014
      1008: aload_2
      1009: iload         7
      1011: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
      1014: astore        8
      1016: aload         8
      1018: ifnonnull     1023
      1021: iconst_0
      1022: ireturn
      1023: aload_2
      1024: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.getSellingBuffs:()Ljava/util/List;
      1027: invokeinterface #172,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
      1032: aload         8
      1034: invokedynamic #213,  0            // InvokeDynamic #4:test:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Predicate;
      1039: invokeinterface #180,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
      1044: invokeinterface #186,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
      1049: aconst_null
      1050: invokevirtual #190                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
      1053: checkcast     #196                // class ext/mods/gameserver/model/SellBuffHolder
      1056: astore        9
      1058: aload         9
      1060: ifnull        1103
      1063: aload_2
      1064: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.getSellingBuffs:()Ljava/util/List;
      1067: aload         9
      1069: invokeinterface #214,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
      1074: ifeq          1103
      1077: aload_2
      1078: aload         8
      1080: invokevirtual #198                // Method ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
      1083: invokedynamic #217,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1088: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1091: aload_2
      1092: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Player.saveSellingBuffs:()V
      1095: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1098: aload_2
      1099: iconst_1
      1100: invokevirtual #143                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffEditMenu:(Lext/mods/gameserver/model/actor/Player;I)V
      1103: goto          2332
      1106: aload_2
      1107: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.isSellingBuffs:()Z
      1110: ifne          2332
      1113: aload_3
      1114: ifnull        2332
      1117: aload_3
      1118: invokevirtual #31                 // Method java/lang/String.isEmpty:()Z
      1121: ifne          2332
      1124: aload_3
      1125: ldc           #218                // String \\s+
      1127: invokevirtual #220                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      1130: astore        6
      1132: aload         6
      1134: arraylength
      1135: iconst_3
      1136: if_icmpeq     1157
      1139: getstatic     #224                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1142: ldc           #228                // String illegal bypass
      1144: invokevirtual #230                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
      1147: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1150: aload_2
      1151: iconst_1
      1152: invokevirtual #139                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffChoiceMenu:(Lext/mods/gameserver/model/actor/Player;I)V
      1155: iconst_0
      1156: ireturn
      1157: aload         6
      1159: iconst_0
      1160: aaload
      1161: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1164: istore        7
      1166: aload         6
      1168: iconst_1
      1169: aaload
      1170: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1173: istore        8
      1175: aload         6
      1177: iconst_2
      1178: aaload
      1179: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1182: istore        9
      1184: goto          1239
      1187: astore        10
      1189: getstatic     #224                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1192: ldc           #236                // String illegal bypass input
      1194: invokevirtual #230                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
      1197: aload         6
      1199: iconst_3
      1200: aaload
      1201: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1204: istore        11
      1206: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1209: aload_2
      1210: iload         11
      1212: ifgt          1219
      1215: iconst_1
      1216: goto          1221
      1219: iload         11
      1221: invokevirtual #139                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffChoiceMenu:(Lext/mods/gameserver/model/actor/Player;I)V
      1224: goto          1237
      1227: astore        11
      1229: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1232: aload_2
      1233: iconst_1
      1234: invokevirtual #139                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffChoiceMenu:(Lext/mods/gameserver/model/actor/Player;I)V
      1237: iconst_0
      1238: ireturn
      1239: iload         7
      1241: ifle          1249
      1244: iload         9
      1246: ifgt          1277
      1249: getstatic     #224                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1252: ldc           #236                // String illegal bypass input
      1254: invokevirtual #230                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
      1257: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1260: aload_2
      1261: iload         9
      1263: ifgt          1270
      1266: iconst_1
      1267: goto          1272
      1270: iload         9
      1272: invokevirtual #139                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffChoiceMenu:(Lext/mods/gameserver/model/actor/Player;I)V
      1275: iconst_0
      1276: ireturn
      1277: iload         8
      1279: i2l
      1280: getstatic     #148                // Field ext/mods/Config.SELLBUFF_MAX_PRICE:J
      1283: lcmp
      1284: ifle          1310
      1287: aload_2
      1288: getstatic     #148                // Field ext/mods/Config.SELLBUFF_MAX_PRICE:J
      1291: invokedynamic #152,  0            // InvokeDynamic #1:makeConcatWithConstants:(J)Ljava/lang/String;
      1296: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1299: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1302: aload_2
      1303: iload         9
      1305: invokevirtual #139                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffChoiceMenu:(Lext/mods/gameserver/model/actor/Player;I)V
      1308: iconst_0
      1309: ireturn
      1310: iload         8
      1312: i2l
      1313: getstatic     #238                // Field ext/mods/Config.SELLBUFF_MIN_PRICE:J
      1316: lcmp
      1317: ifge          1343
      1320: aload_2
      1321: getstatic     #238                // Field ext/mods/Config.SELLBUFF_MIN_PRICE:J
      1324: invokedynamic #241,  0            // InvokeDynamic #6:makeConcatWithConstants:(J)Ljava/lang/String;
      1329: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1332: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1335: aload_2
      1336: iload         9
      1338: invokevirtual #139                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffChoiceMenu:(Lext/mods/gameserver/model/actor/Player;I)V
      1341: iconst_0
      1342: ireturn
      1343: aload_2
      1344: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.getSellingBuffs:()Ljava/util/List;
      1347: invokeinterface #242,  1          // InterfaceMethod java/util/List.size:()I
      1352: getstatic     #245                // Field ext/mods/Config.SELLBUFF_MAX_BUFFS:I
      1355: if_icmplt     1381
      1358: aload_2
      1359: getstatic     #245                // Field ext/mods/Config.SELLBUFF_MAX_BUFFS:I
      1362: invokedynamic #249,  0            // InvokeDynamic #7:makeConcatWithConstants:(I)Ljava/lang/String;
      1367: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1370: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1373: aload_2
      1374: iload         9
      1376: invokevirtual #139                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffChoiceMenu:(Lext/mods/gameserver/model/actor/Player;I)V
      1379: iconst_0
      1380: ireturn
      1381: iload         7
      1383: tableswitch   { // 4699 to 4703

                    4699: 1416

                    4700: 1432

                    4701: 1480

                    4702: 1448

                    4703: 1464
                 default: 1480
            }
      1416: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1419: aload_2
      1420: sipush        1331
      1423: getstatic     #155                // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1426: invokevirtual #161                // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
      1429: goto          1486
      1432: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1435: aload_2
      1436: sipush        1331
      1439: getstatic     #165                // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1442: invokevirtual #161                // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
      1445: goto          1486
      1448: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1451: aload_2
      1452: sipush        1332
      1455: getstatic     #155                // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1458: invokevirtual #161                // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
      1461: goto          1486
      1464: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1467: aload_2
      1468: sipush        1332
      1471: getstatic     #165                // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1474: invokevirtual #161                // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
      1477: goto          1486
      1480: aload_2
      1481: iload         7
      1483: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
      1486: astore        10
      1488: aload         10
      1490: ifnonnull     1512
      1493: getstatic     #224                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1496: ldc           #252                // String illegal state bypass
      1498: invokevirtual #230                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
      1501: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1504: aload_2
      1505: iload         9
      1507: invokevirtual #139                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffChoiceMenu:(Lext/mods/gameserver/model/actor/Player;I)V
      1510: iconst_0
      1511: ireturn
      1512: new           #196                // class ext/mods/gameserver/model/SellBuffHolder
      1515: dup
      1516: iload         7
      1518: aload         10
      1520: invokevirtual #254                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
      1523: iload         8
      1525: invokespecial #257                // Method ext/mods/gameserver/model/SellBuffHolder."<init>":(III)V
      1528: astore        11
      1530: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1533: aload_2
      1534: aload         10
      1536: invokevirtual #260                // Method ext/mods/gameserver/data/manager/SellBuffsManager.isInSellList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
      1539: ifne          1584
      1542: aload_2
      1543: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.getSellingBuffs:()Ljava/util/List;
      1546: aload         11
      1548: invokeinterface #264,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      1553: pop
      1554: aload_2
      1555: aload         10
      1557: invokevirtual #198                // Method ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
      1560: invokedynamic #267,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1565: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1568: aload_2
      1569: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Player.saveSellingBuffs:()V
      1572: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1575: aload_2
      1576: iload         9
      1578: invokevirtual #139                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffChoiceMenu:(Lext/mods/gameserver/model/actor/Player;I)V
      1581: goto          1609
      1584: getstatic     #224                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1587: ldc_w         #268                // String Attempt to add a skill that is already on sale.
      1590: invokevirtual #230                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
      1593: aload_2
      1594: ldc_w         #270                // String This skill is already on sale.
      1597: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1600: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1603: aload_2
      1604: iload         9
      1606: invokevirtual #139                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffChoiceMenu:(Lext/mods/gameserver/model/actor/Player;I)V
      1609: goto          2332
      1612: aload_3
      1613: ifnull        2332
      1616: aload_3
      1617: invokevirtual #31                 // Method java/lang/String.isEmpty:()Z
      1620: ifne          2332
      1623: new           #12                 // class java/util/StringTokenizer
      1626: dup
      1627: aload_3
      1628: ldc           #14                 // String
      1630: invokespecial #16                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
      1633: astore        6
      1635: iconst_m1
      1636: istore        7
      1638: iconst_0
      1639: istore        8
      1641: aload         6
      1643: invokevirtual #19                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1646: ifeq          1659
      1649: aload         6
      1651: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1654: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1657: istore        7
      1659: aload         6
      1661: invokevirtual #19                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      1664: ifeq          1677
      1667: aload         6
      1669: invokevirtual #23                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1672: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1675: istore        8
      1677: invokestatic  #272                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
      1680: iload         7
      1682: invokevirtual #277                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
      1685: astore        9
      1687: aload         9
      1689: ifnull        1725
      1692: aload         9
      1694: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.isSellingBuffs:()Z
      1697: ifeq          1712
      1700: aload_2
      1701: aload         9
      1703: sipush        150
      1706: invokevirtual #283                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
      1709: ifne          1714
      1712: iconst_0
      1713: ireturn
      1714: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1717: aload_2
      1718: aload         9
      1720: iload         8
      1722: invokevirtual #287                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffMenu:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)V
      1725: goto          2332
      1728: aload_3
      1729: ifnull        2332
      1732: aload_3
      1733: invokevirtual #31                 // Method java/lang/String.isEmpty:()Z
      1736: ifne          2332
      1739: aload_3
      1740: ldc           #218                // String \\s+
      1742: invokevirtual #220                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      1745: astore        6
      1747: aload         6
      1749: arraylength
      1750: iconst_5
      1751: if_icmpeq     1773
      1754: getstatic     #224                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1757: ldc           #228                // String illegal bypass
      1759: invokevirtual #230                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
      1762: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1765: aload_2
      1766: aload_2
      1767: iconst_1
      1768: invokevirtual #287                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffMenu:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)V
      1771: iconst_0
      1772: ireturn
      1773: aload         6
      1775: iconst_0
      1776: aaload
      1777: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1780: istore        7
      1782: aload         6
      1784: iconst_1
      1785: aaload
      1786: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1789: istore        8
      1791: aload         6
      1793: iconst_2
      1794: aaload
      1795: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1798: istore        9
      1800: aload         6
      1802: iconst_3
      1803: aaload
      1804: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1807: istore        10
      1809: aload         6
      1811: iconst_4
      1812: aaload
      1813: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1816: istore        11
      1818: goto          1875
      1821: astore        12
      1823: getstatic     #224                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1826: ldc           #236                // String illegal bypass input
      1828: invokevirtual #230                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
      1831: aload         6
      1833: iconst_3
      1834: aaload
      1835: invokestatic  #133                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1838: istore        13
      1840: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1843: aload_2
      1844: aload_2
      1845: iload         13
      1847: ifgt          1854
      1850: iconst_1
      1851: goto          1856
      1854: iload         13
      1856: invokevirtual #287                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffMenu:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)V
      1859: goto          1873
      1862: astore        13
      1864: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      1867: aload_2
      1868: aload_2
      1869: iconst_1
      1870: invokevirtual #287                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffMenu:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)V
      1873: iconst_0
      1874: ireturn
      1875: iload         8
      1877: iconst_m1
      1878: if_icmpeq     1892
      1881: iload         9
      1883: ifle          1892
      1886: iload         7
      1888: iconst_m1
      1889: if_icmpne     1894
      1892: iconst_0
      1893: ireturn
      1894: invokestatic  #272                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
      1897: iload         7
      1899: invokevirtual #277                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
      1902: astore        12
      1904: aload         12
      1906: ifnonnull     1911
      1909: iconst_0
      1910: ireturn
      1911: new           #196                // class ext/mods/gameserver/model/SellBuffHolder
      1914: dup
      1915: iload         8
      1917: iload         9
      1919: iload         10
      1921: invokespecial #257                // Method ext/mods/gameserver/model/SellBuffHolder."<init>":(III)V
      1924: astore        13
      1926: aload         13
      1928: aload         12
      1930: invokevirtual #291                // Method ext/mods/gameserver/model/SellBuffHolder.getSkillFrom:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/skills/L2Skill;
      1933: astore        14
      1935: aload         14
      1937: ifnonnull     1971
      1940: getstatic     #224                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1943: ldc_w         #295                // String Seller[{}] try to sell missing skill[{}]
      1946: iconst_2
      1947: anewarray     #2                  // class java/lang/Object
      1950: dup
      1951: iconst_0
      1952: aload         12
      1954: invokevirtual #297                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1957: aastore
      1958: dup
      1959: iconst_1
      1960: aload         13
      1962: invokevirtual #298                // Method ext/mods/gameserver/model/SellBuffHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
      1965: aastore
      1966: invokevirtual #301                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
      1969: iconst_0
      1970: ireturn
      1971: aload         12
      1973: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.isSellingBuffs:()Z
      1976: ifeq          1990
      1979: aload_2
      1980: aload_2
      1981: sipush        150
      1984: invokevirtual #304                // Method ext/mods/gameserver/model/actor/Player.isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
      1987: ifne          1992
      1990: iconst_0
      1991: ireturn
      1992: aload         12
      1994: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1997: invokevirtual #311                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
      2000: aload         14
      2002: invokevirtual #317                // Method ext/mods/gameserver/skills/L2Skill.getMpConsume:()I
      2005: bipush        50
      2007: invokestatic  #320                // Method java/lang/Math.max:(II)I
      2010: getstatic     #326                // Field ext/mods/Config.SELLBUFF_MP_MULTIPLER:I
      2013: imul
      2014: i2d
      2015: dcmpg
      2016: ifge          2051
      2019: aload_2
      2020: aload         12
      2022: invokevirtual #297                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      2025: aload         14
      2027: invokevirtual #198                // Method ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
      2030: invokedynamic #329,  0            // InvokeDynamic #9:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      2035: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2038: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      2041: aload_2
      2042: aload         12
      2044: iload         11
      2046: invokevirtual #287                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffMenu:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)V
      2049: iconst_0
      2050: ireturn
      2051: aload_2
      2052: invokevirtual #332                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
      2055: getstatic     #336                // Field ext/mods/Config.SELLBUFF_PAYMENT_ID:I
      2058: invokevirtual #339                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(I)I
      2061: aload         13
      2063: invokevirtual #345                // Method ext/mods/gameserver/model/SellBuffHolder.getPrice:()I
      2066: if_icmplt     2281
      2069: ldc_w         #348                // int 2147483647
      2072: aload         12
      2074: invokevirtual #332                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
      2077: invokevirtual #349                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getAdena:()I
      2080: isub
      2081: aload         13
      2083: invokevirtual #345                // Method ext/mods/gameserver/model/SellBuffHolder.getPrice:()I
      2086: isub
      2087: ifge          2110
      2090: aload_2
      2091: ldc_w         #352                // String Seller have limit adena.
      2094: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2097: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      2100: aload_2
      2101: aload         12
      2103: iload         11
      2105: invokevirtual #287                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffMenu:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)V
      2108: iconst_0
      2109: ireturn
      2110: aload_2
      2111: getstatic     #336                // Field ext/mods/Config.SELLBUFF_PAYMENT_ID:I
      2114: aload         13
      2116: invokevirtual #345                // Method ext/mods/gameserver/model/SellBuffHolder.getPrice:()I
      2119: iconst_1
      2120: invokevirtual #354                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
      2123: pop
      2124: aload         12
      2126: getstatic     #336                // Field ext/mods/Config.SELLBUFF_PAYMENT_ID:I
      2129: aload         13
      2131: invokevirtual #345                // Method ext/mods/gameserver/model/SellBuffHolder.getPrice:()I
      2134: iconst_1
      2135: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
      2138: pop
      2139: aload         12
      2141: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2144: aload         14
      2146: invokevirtual #317                // Method ext/mods/gameserver/skills/L2Skill.getMpConsume:()I
      2149: bipush        50
      2151: invokestatic  #320                // Method java/lang/Math.max:(II)I
      2154: getstatic     #326                // Field ext/mods/Config.SELLBUFF_MP_MULTIPLER:I
      2157: imul
      2158: i2d
      2159: invokevirtual #362                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.reduceMp:(D)D
      2162: pop2
      2163: aload_2
      2164: new           #366                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
      2167: dup
      2168: aload         12
      2170: aload_2
      2171: aload         13
      2173: invokevirtual #368                // Method ext/mods/gameserver/model/SellBuffHolder.getSkillUse:()I
      2176: iconst_1
      2177: sipush        900
      2180: iconst_0
      2181: invokespecial #371                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
      2184: invokevirtual #374                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2187: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      2190: aload         14
      2192: invokevirtual #378                // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuff:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/records/SellBuffData;
      2195: astore        15
      2197: getstatic     #382                // Field ext/mods/Config.CUSTOM_TIME_BUFF:Z
      2200: ifeq          2242
      2203: aload_2
      2204: invokevirtual #385                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
      2207: ifnull        2230
      2210: aload         15
      2212: invokevirtual #389                // Method ext/mods/gameserver/model/records/SellBuffData.applyOnPets:()Z
      2215: ifeq          2230
      2218: aload         14
      2220: aload         12
      2222: aload_2
      2223: invokevirtual #385                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
      2226: invokevirtual #394                // Method ext/mods/gameserver/skills/L2Skill.getEffectsSellBuff:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
      2229: pop
      2230: aload         14
      2232: aload         12
      2234: aload_2
      2235: invokevirtual #394                // Method ext/mods/gameserver/skills/L2Skill.getEffectsSellBuff:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
      2238: pop
      2239: goto          2278
      2242: aload_2
      2243: invokevirtual #385                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
      2246: ifnull        2269
      2249: aload         15
      2251: invokevirtual #389                // Method ext/mods/gameserver/model/records/SellBuffData.applyOnPets:()Z
      2254: ifeq          2269
      2257: aload         14
      2259: aload         12
      2261: aload_2
      2262: invokevirtual #385                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
      2265: invokevirtual #398                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
      2268: pop
      2269: aload         14
      2271: aload         12
      2273: aload_2
      2274: invokevirtual #398                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
      2277: pop
      2278: goto          2321
      2281: invokestatic  #401                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
      2284: getstatic     #336                // Field ext/mods/Config.SELLBUFF_PAYMENT_ID:I
      2287: invokevirtual #406                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
      2290: astore        15
      2292: aload         15
      2294: ifnull        2314
      2297: aload_2
      2298: aload         15
      2300: invokevirtual #410                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
      2303: invokedynamic #413,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2308: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2311: goto          2321
      2314: aload_2
      2315: ldc_w         #414                // String Not enough items!
      2318: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2321: invokestatic  #85                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
      2324: aload_2
      2325: aload         12
      2327: iload         11
      2329: invokevirtual #287                // Method ext/mods/gameserver/data/manager/SellBuffsManager.sendBuffMenu:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;I)V
      2332: iconst_1
      2333: ireturn
      Exception table:
         from    to  target type
           608   618   621   Class java/lang/NumberFormatException
          1157  1184  1187   Class java/lang/NumberFormatException
          1197  1224  1227   Class java/lang/NumberFormatException
          1773  1818  1821   Class java/lang/NumberFormatException
          1831  1859  1862   Class java/lang/NumberFormatException
      LineNumberTable:
        line 78: 0
        line 79: 6
        line 81: 8
        line 84: 296
        line 85: 314
        line 87: 316
        line 88: 326
        line 90: 328
        line 92: 340
        line 93: 346
        line 97: 348
        line 98: 357
        line 99: 365
        line 100: 377
        line 102: 385
        line 105: 404
        line 107: 414
        line 108: 420
        line 111: 422
        line 113: 434
        line 116: 437
        line 117: 444
        line 122: 454
        line 124: 461
        line 125: 464
        line 126: 482
        line 128: 488
        line 129: 497
        line 133: 500
        line 135: 507
        line 136: 510
        line 137: 528
        line 139: 534
        line 140: 543
        line 144: 546
        line 146: 564
        line 148: 576
        line 149: 579
        line 151: 582
        line 152: 590
        line 154: 600
        line 158: 608
        line 164: 618
        line 160: 621
        line 162: 623
        line 163: 635
        line 167: 643
        line 168: 655
        line 170: 657
        line 172: 692
        line 173: 708
        line 174: 724
        line 175: 740
        line 176: 756
        line 177: 762
        line 179: 764
        line 180: 769
        line 182: 771
        line 183: 806
        line 185: 811
        line 186: 827
        line 187: 834
        line 188: 838
        line 190: 846
        line 194: 849
        line 196: 867
        line 198: 879
        line 200: 882
        line 201: 890
        line 203: 900
        line 204: 906
        line 206: 908
        line 208: 944
        line 209: 960
        line 210: 976
        line 211: 992
        line 212: 1008
        line 213: 1014
        line 215: 1016
        line 216: 1021
        line 218: 1023
        line 219: 1058
        line 221: 1077
        line 222: 1091
        line 223: 1095
        line 225: 1103
        line 229: 1106
        line 231: 1124
        line 232: 1132
        line 234: 1139
        line 235: 1147
        line 236: 1155
        line 244: 1157
        line 245: 1166
        line 246: 1175
        line 261: 1184
        line 248: 1187
        line 250: 1189
        line 253: 1197
        line 254: 1206
        line 259: 1224
        line 256: 1227
        line 258: 1229
        line 260: 1237
        line 263: 1239
        line 265: 1249
        line 266: 1257
        line 267: 1275
        line 270: 1277
        line 272: 1287
        line 273: 1299
        line 274: 1308
        line 277: 1310
        line 279: 1320
        line 280: 1332
        line 281: 1341
        line 284: 1343
        line 286: 1358
        line 287: 1370
        line 288: 1379
        line 291: 1381
        line 293: 1416
        line 294: 1432
        line 295: 1448
        line 296: 1464
        line 297: 1480
        line 298: 1486
        line 300: 1488
        line 302: 1493
        line 303: 1501
        line 304: 1510
        line 307: 1512
        line 309: 1530
        line 311: 1542
        line 312: 1554
        line 313: 1568
        line 314: 1572
        line 318: 1584
        line 319: 1593
        line 320: 1600
        line 322: 1609
        line 326: 1612
        line 328: 1623
        line 330: 1635
        line 331: 1638
        line 332: 1641
        line 333: 1649
        line 335: 1659
        line 336: 1667
        line 338: 1677
        line 339: 1687
        line 341: 1692
        line 342: 1712
        line 344: 1714
        line 346: 1725
        line 350: 1728
        line 352: 1739
        line 354: 1747
        line 356: 1754
        line 357: 1762
        line 358: 1771
        line 368: 1773
        line 369: 1782
        line 370: 1791
        line 371: 1800
        line 372: 1809
        line 387: 1818
        line 374: 1821
        line 376: 1823
        line 379: 1831
        line 380: 1840
        line 385: 1859
        line 382: 1862
        line 384: 1864
        line 386: 1873
        line 389: 1875
        line 390: 1892
        line 392: 1894
        line 393: 1904
        line 394: 1909
        line 396: 1911
        line 398: 1926
        line 400: 1935
        line 402: 1940
        line 403: 1969
        line 406: 1971
        line 407: 1990
        line 409: 1992
        line 411: 2019
        line 412: 2038
        line 413: 2049
        line 416: 2051
        line 418: 2069
        line 420: 2090
        line 421: 2097
        line 422: 2108
        line 425: 2110
        line 426: 2124
        line 428: 2139
        line 429: 2163
        line 431: 2187
        line 432: 2197
        line 434: 2203
        line 435: 2218
        line 437: 2230
        line 441: 2242
        line 442: 2257
        line 444: 2269
        line 446: 2278
        line 449: 2281
        line 450: 2292
        line 451: 2297
        line 453: 2314
        line 456: 2321
        line 461: 2332
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          357      77     6 title   Ljava/lang/StringBuilder;
          377      57     7    st   Ljava/util/StringTokenizer;
          464      33     6 index   I
          510      33     6 index   I
          623      20     9     e   Ljava/lang/NumberFormatException;
          576     270     6    st   Ljava/util/StringTokenizer;
          579     267     7 skillId   I
          582     264     8 price   I
          764      82     9 skillToChange   Lext/mods/gameserver/skills/L2Skill;
          806      40    10 holder   Lext/mods/gameserver/model/SellBuffHolder;
          879     224     6    st   Ljava/util/StringTokenizer;
          882     221     7 skillId   I
         1016      87     8 skillToRemove   Lext/mods/gameserver/skills/L2Skill;
         1058      45     9 holder   Lext/mods/gameserver/model/SellBuffHolder;
         1166      21     7 skillId   I
         1175      12     8 price   I
         1184       3     9 index   I
         1206      18    11 index2   I
         1229       8    11    e1   Ljava/lang/NumberFormatException;
         1189      50    10     e   Ljava/lang/NumberFormatException;
         1132     477     6 parts   [Ljava/lang/String;
         1239     370     7 skillId   I
         1239     370     8 price   I
         1239     370     9 index   I
         1488     121    10 skillToAdd   Lext/mods/gameserver/skills/L2Skill;
         1530      79    11 skillHolder   Lext/mods/gameserver/model/SellBuffHolder;
         1635      90     6    st   Ljava/util/StringTokenizer;
         1638      87     7 objId   I
         1641      84     8 index   I
         1687      38     9 seller   Lext/mods/gameserver/model/actor/Player;
         1782      39     7 objId   I
         1791      30     8 skillId   I
         1800      21     9 skillLvl   I
         1809      12    10 skillPrice   I
         1818       3    11 index   I
         1840      19    13 index2   I
         1864       9    13    e1   Ljava/lang/NumberFormatException;
         1823      52    12     e   Ljava/lang/NumberFormatException;
         2197      81    15 buffSkill   Lext/mods/gameserver/model/records/SellBuffData;
         2292      29    15  item   Lext/mods/gameserver/model/item/kind/Item;
         1747     585     6 parts   [Ljava/lang/String;
         1875     457     7 objId   I
         1875     457     8 skillId   I
         1875     457     9 skillLvl   I
         1875     457    10 skillPrice   I
         1875     457    11 index   I
         1904     428    12 seller   Lext/mods/gameserver/model/actor/Player;
         1926     406    13 holder   Lext/mods/gameserver/model/SellBuffHolder;
         1935     397    14 skillToBuy   Lext/mods/gameserver/skills/L2Skill;
            0    2334     0  this   Lext/mods/gameserver/handler/bypasshandlers/SellBuff;
            0    2334     1 command   Ljava/lang/String;
            0    2334     2 player   Lext/mods/gameserver/model/actor/Player;
            0    2334     3 params   Ljava/lang/String;
      StackMapTable: number_of_entries = 103
        frame_type = 8 /* same */
        frame_type = 253 /* append */
          offset_delta = 91
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 13 /* same */
        frame_type = 51 /* same */
        frame_type = 17 /* same */
        frame_type = 1 /* same */
        frame_type = 11 /* same */
        frame_type = 19 /* same */
        frame_type = 253 /* append */
          offset_delta = 28
          locals = [ class java/lang/StringBuilder, class java/util/StringTokenizer ]
        frame_type = 26 /* same */
        frame_type = 17 /* same */
        frame_type = 249 /* chop */
          offset_delta = 14
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 11
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 11
        frame_type = 254 /* append */
          offset_delta = 53
          locals = [ class java/util/StringTokenizer, int, int ]
        frame_type = 84 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 21 /* same */
        frame_type = 11 /* same */
        frame_type = 1 /* same */
        frame_type = 34 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 255 /* full_frame */
          offset_delta = 74
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 253 /* append */
          offset_delta = 50
          locals = [ class java/util/StringTokenizer, int ]
        frame_type = 7 /* same */
        frame_type = 35 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 248 /* chop */
          offset_delta = 79
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 50
          locals = [ class "[Ljava/lang/String;" ]
        frame_type = 93 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int, class "[Ljava/lang/String;", top, top, top, class java/lang/NumberFormatException, int ]
          stack = [ class ext/mods/gameserver/data/manager/SellBuffsManager, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int, class "[Ljava/lang/String;", top, top, top, class java/lang/NumberFormatException, int ]
          stack = [ class ext/mods/gameserver/data/manager/SellBuffsManager, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int, class "[Ljava/lang/String;", top, top, top, class java/lang/NumberFormatException ]
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int, class "[Ljava/lang/String;", int, int, int ]
          stack = []
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int, class "[Ljava/lang/String;", int, int, int ]
          stack = [ class ext/mods/gameserver/data/manager/SellBuffsManager, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int, class "[Ljava/lang/String;", int, int, int ]
          stack = [ class ext/mods/gameserver/data/manager/SellBuffsManager, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 4 /* same */
        frame_type = 32 /* same */
        frame_type = 32 /* same */
        frame_type = 37 /* same */
        frame_type = 34 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 252 /* append */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/model/SellBuffHolder ]
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 254 /* append */
          offset_delta = 46
          locals = [ class java/util/StringTokenizer, int, int ]
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class "[Ljava/lang/String;" ]
        frame_type = 111 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int, class "[Ljava/lang/String;", top, top, top, top, top, class java/lang/NumberFormatException, int ]
          stack = [ class ext/mods/gameserver/data/manager/SellBuffsManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int, class "[Ljava/lang/String;", top, top, top, top, top, class java/lang/NumberFormatException, int ]
          stack = [ class ext/mods/gameserver/data/manager/SellBuffsManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int, class "[Ljava/lang/String;", top, top, top, top, top, class java/lang/NumberFormatException ]
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int, class "[Ljava/lang/String;", int, int, int, int, int ]
          stack = []
        frame_type = 16 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 253 /* append */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/model/SellBuffHolder, class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 18 /* same */
        frame_type = 1 /* same */
        frame_type = 58 /* same */
        frame_type = 58 /* same */
        frame_type = 252 /* append */
          offset_delta = 119
          locals = [ class ext/mods/gameserver/model/records/SellBuffData ]
        frame_type = 11 /* same */
        frame_type = 26 /* same */
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/SellBuff, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = []

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #416                // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 467: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/SellBuff;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        9
         2: anewarray     #32                 // class java/lang/String
         5: dup
         6: iconst_0
         7: ldc           #66                 // String sellbuffadd
         9: aastore
        10: dup
        11: iconst_1
        12: ldc           #74                 // String sellbuffaddskill
        14: aastore
        15: dup
        16: iconst_2
        17: ldc           #68                 // String sellbuffedit
        19: aastore
        20: dup
        21: iconst_3
        22: ldc           #70                 // String sellbuffchangeprice
        24: aastore
        25: dup
        26: iconst_4
        27: ldc           #72                 // String sellbuffremove
        29: aastore
        30: dup
        31: iconst_5
        32: ldc           #76                 // String sellbuffbuymenu
        34: aastore
        35: dup
        36: bipush        6
        38: ldc           #78                 // String sellbuffbuyskill
        40: aastore
        41: dup
        42: bipush        7
        44: ldc           #58                 // String sellbuffstart
        46: aastore
        47: dup
        48: bipush        8
        50: ldc           #64                 // String sellbuffstop
        52: aastore
        53: putstatic     #416                // Field COMMANDS:[Ljava/lang/String;
        56: return
      LineNumberTable:
        line 40: 0
}
SourceFile: "SellBuff.java"
BootstrapMethods:
  0: #509 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #482 \u0001
  1: #509 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #484 Too big price! Maximum price is \u0001
  2: #515 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #486 (Ljava/lang/Object;)Z
      #487 REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/SellBuff.lambda$useBypass$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/SellBuffHolder;)Z
      #490 (Lext/mods/gameserver/model/SellBuffHolder;)Z
  3: #509 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #492 Price of \u0001 has been changed to \u0001!
  4: #515 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #486 (Ljava/lang/Object;)Z
      #494 REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/SellBuff.lambda$useBypass$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/SellBuffHolder;)Z
      #490 (Lext/mods/gameserver/model/SellBuffHolder;)Z
  5: #509 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #497 Skill \u0001 has been removed!
  6: #509 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #499 Too small price! Minimum price is \u0001
  7: #509 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #501 You already reached max count of buffs! Max buffs is: \u0001
  8: #509 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #503 \u0001 has been added!
  9: #509 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #505 \u0001 has no enough mana for \u0001!
  10: #509 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #507 Not enough \u0001!
InnerClasses:
  public static final #527= #523 of #525; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
