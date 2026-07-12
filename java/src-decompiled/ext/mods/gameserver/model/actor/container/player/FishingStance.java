// Bytecode for: ext.mods.gameserver.model.actor.container.player.FishingStance
// File: ext\mods\gameserver\model\actor\container\player\FishingStance.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/FishingStance.class
  Last modified 9 de jul de 2026; size 12922 bytes
  MD5 checksum 47b1d173977bfa442ac0fa405218009e
  Compiled from "FishingStance.java"
public class ext.mods.gameserver.model.actor.container.player.FishingStance
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/actor/container/player/FishingStance
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 17, methods: 14, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/location/Location
    #8 = Utf8               ext/mods/gameserver/model/location/Location
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #10 = NameAndType        #5:#11        // "<init>":(III)V
   #11 = Utf8               (III)V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/actor/container/player/FishingStance._loc:Lext/mods/gameserver/model/location/Location;
   #13 = Class              #15           // ext/mods/gameserver/model/actor/container/player/FishingStance
   #14 = NameAndType        #16:#17       // _loc:Lext/mods/gameserver/model/location/Location;
   #15 = Utf8               ext/mods/gameserver/model/actor/container/player/FishingStance
   #16 = Utf8               _loc
   #17 = Utf8               Lext/mods/gameserver/model/location/Location;
   #18 = Fieldref           #13.#19       // ext/mods/gameserver/model/actor/container/player/FishingStance._fisher:Lext/mods/gameserver/model/actor/Player;
   #19 = NameAndType        #20:#21       // _fisher:Lext/mods/gameserver/model/actor/Player;
   #20 = Utf8               _fisher
   #21 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #22 = Methodref          #23.#24       // ext/mods/commons/random/Rnd.get:(I)I
   #23 = Class              #25           // ext/mods/commons/random/Rnd
   #24 = NameAndType        #26:#27       // get:(I)I
   #25 = Utf8               ext/mods/commons/random/Rnd
   #26 = Utf8               get
   #27 = Utf8               (I)I
   #28 = Fieldref           #13.#29       // ext/mods/gameserver/model/actor/container/player/FishingStance._lureId:I
   #29 = NameAndType        #30:#31       // _lureId:I
   #30 = Utf8               _lureId
   #31 = Utf8               I
   #32 = Methodref          #33.#34       // ext/mods/gameserver/model/actor/Player.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
   #33 = Class              #35           // ext/mods/gameserver/model/actor/Player
   #34 = NameAndType        #36:#37       // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
   #35 = Utf8               ext/mods/gameserver/model/actor/Player
   #36 = Utf8               getFirstEffect
   #37 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
   #38 = Methodref          #39.#40       // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #39 = Class              #41           // ext/mods/gameserver/skills/AbstractEffect
   #40 = NameAndType        #42:#43       // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #41 = Utf8               ext/mods/gameserver/skills/AbstractEffect
   #42 = Utf8               getSkill
   #43 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #44 = Methodref          #45.#46       // ext/mods/gameserver/skills/L2Skill.getPower:()D
   #45 = Class              #47           // ext/mods/gameserver/skills/L2Skill
   #46 = NameAndType        #48:#49       // getPower:()D
   #47 = Utf8               ext/mods/gameserver/skills/L2Skill
   #48 = Utf8               getPower
   #49 = Utf8               ()D
   #50 = Methodref          #33.#51       // ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
   #51 = NameAndType        #52:#27       // getSkillLevel:(I)I
   #52 = Utf8               getSkillLevel
   #53 = Methodref          #54.#55       // java/lang/Math.clamp:(JII)I
   #54 = Class              #56           // java/lang/Math
   #55 = NameAndType        #57:#58       // clamp:(JII)I
   #56 = Utf8               java/lang/Math
   #57 = Utf8               clamp
   #58 = Utf8               (JII)I
   #59 = Fieldref           #13.#60       // ext/mods/gameserver/model/actor/container/player/FishingStance._lookingForFish:Ljava/util/concurrent/Future;
   #60 = NameAndType        #61:#62       // _lookingForFish:Ljava/util/concurrent/Future;
   #61 = Utf8               _lookingForFish
   #62 = Utf8               Ljava/util/concurrent/Future;
   #63 = Fieldref           #13.#64       // ext/mods/gameserver/model/actor/container/player/FishingStance._fishCombat:Ljava/util/concurrent/Future;
   #64 = NameAndType        #65:#62       // _fishCombat:Ljava/util/concurrent/Future;
   #65 = Utf8               _fishCombat
   #66 = Fieldref           #13.#67       // ext/mods/gameserver/model/actor/container/player/FishingStance._fishCurHp:I
   #67 = NameAndType        #68:#31       // _fishCurHp:I
   #68 = Utf8               _fishCurHp
   #69 = Class              #70           // ext/mods/gameserver/network/serverpackets/ExFishingHpRegen
   #70 = Utf8               ext/mods/gameserver/network/serverpackets/ExFishingHpRegen
   #71 = Fieldref           #13.#72       // ext/mods/gameserver/model/actor/container/player/FishingStance._time:I
   #72 = NameAndType        #73:#31       // _time:I
   #73 = Utf8               _time
   #74 = Fieldref           #13.#75       // ext/mods/gameserver/model/actor/container/player/FishingStance._mode:I
   #75 = NameAndType        #76:#31       // _mode:I
   #76 = Utf8               _mode
   #77 = Fieldref           #13.#78       // ext/mods/gameserver/model/actor/container/player/FishingStance._goodUse:I
   #78 = NameAndType        #79:#31       // _goodUse:I
   #79 = Utf8               _goodUse
   #80 = Fieldref           #13.#81       // ext/mods/gameserver/model/actor/container/player/FishingStance._anim:I
   #81 = NameAndType        #82:#31       // _anim:I
   #82 = Utf8               _anim
   #83 = Fieldref           #13.#84       // ext/mods/gameserver/model/actor/container/player/FishingStance._deceptiveMode:I
   #84 = NameAndType        #85:#31       // _deceptiveMode:I
   #85 = Utf8               _deceptiveMode
   #86 = Methodref          #69.#87       // ext/mods/gameserver/network/serverpackets/ExFishingHpRegen."<init>":(Lext/mods/gameserver/model/actor/Creature;IIIIIII)V
   #87 = NameAndType        #5:#88        // "<init>":(Lext/mods/gameserver/model/actor/Creature;IIIIIII)V
   #88 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIIIIII)V
   #89 = Methodref          #33.#90       // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #90 = NameAndType        #91:#92       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #91 = Utf8               broadcastPacket
   #92 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #93 = Fieldref           #13.#94       // ext/mods/gameserver/model/actor/container/player/FishingStance._fish:Lext/mods/gameserver/model/records/Fish;
   #94 = NameAndType        #95:#96       // _fish:Lext/mods/gameserver/model/records/Fish;
   #95 = Utf8               _fish
   #96 = Utf8               Lext/mods/gameserver/model/records/Fish;
   #97 = Methodref          #98.#99       // ext/mods/gameserver/model/records/Fish.hp:()I
   #98 = Class              #100          // ext/mods/gameserver/model/records/Fish
   #99 = NameAndType        #101:#102     // hp:()I
  #100 = Utf8               ext/mods/gameserver/model/records/Fish
  #101 = Utf8               hp
  #102 = Utf8               ()I
  #103 = Methodref          #13.#104      // ext/mods/gameserver/model/actor/container/player/FishingStance.end:(Z)V
  #104 = NameAndType        #105:#106     // end:(Z)V
  #105 = Utf8               end
  #106 = Utf8               (Z)V
  #107 = Fieldref           #13.#108      // ext/mods/gameserver/model/actor/container/player/FishingStance._thinking:Z
  #108 = NameAndType        #109:#110     // _thinking:Z
  #109 = Utf8               _thinking
  #110 = Utf8               Z
  #111 = Methodref          #98.#112      // ext/mods/gameserver/model/records/Fish.hpRegen:()I
  #112 = NameAndType        #113:#102     // hpRegen:()I
  #113 = Utf8               hpRegen
  #114 = Fieldref           #13.#115      // ext/mods/gameserver/model/actor/container/player/FishingStance._stop:I
  #115 = NameAndType        #116:#31      // _stop:I
  #116 = Utf8               _stop
  #117 = Fieldref           #13.#118      // ext/mods/gameserver/model/actor/container/player/FishingStance._isUpperGrade:Z
  #118 = NameAndType        #119:#110     // _isUpperGrade:Z
  #119 = Utf8               _isUpperGrade
  #120 = Methodref          #33.#121      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #121 = NameAndType        #122:#92      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #122 = Utf8               sendPacket
  #123 = Fieldref           #124.#125     // ext/mods/gameserver/network/SystemMessageId.FISH_RESISTED_ATTEMPT_TO_BRING_IT_IN:Lext/mods/gameserver/network/SystemMessageId;
  #124 = Class              #126          // ext/mods/gameserver/network/SystemMessageId
  #125 = NameAndType        #127:#128     // FISH_RESISTED_ATTEMPT_TO_BRING_IT_IN:Lext/mods/gameserver/network/SystemMessageId;
  #126 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #127 = Utf8               FISH_RESISTED_ATTEMPT_TO_BRING_IT_IN
  #128 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #129 = Methodref          #33.#130      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #130 = NameAndType        #122:#131     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #131 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #132 = Methodref          #13.#133      // ext/mods/gameserver/model/actor/container/player/FishingStance.changeHp:(II)V
  #133 = NameAndType        #134:#135     // changeHp:(II)V
  #134 = Utf8               changeHp
  #135 = Utf8               (II)V
  #136 = Fieldref           #124.#137     // ext/mods/gameserver/network/SystemMessageId.REELING_SUCCESFUL_S1_DAMAGE:Lext/mods/gameserver/network/SystemMessageId;
  #137 = NameAndType        #138:#128     // REELING_SUCCESFUL_S1_DAMAGE:Lext/mods/gameserver/network/SystemMessageId;
  #138 = Utf8               REELING_SUCCESFUL_S1_DAMAGE
  #139 = Methodref          #140.#141     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #140 = Class              #142          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #141 = NameAndType        #143:#144     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #142 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #143 = Utf8               getSystemMessage
  #144 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #145 = Methodref          #140.#146     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #146 = NameAndType        #147:#148     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #147 = Utf8               addNumber
  #148 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #149 = Fieldref           #124.#150     // ext/mods/gameserver/network/SystemMessageId.REELING_SUCCESSFUL_PENALTY_S1:Lext/mods/gameserver/network/SystemMessageId;
  #150 = NameAndType        #151:#128     // REELING_SUCCESSFUL_PENALTY_S1:Lext/mods/gameserver/network/SystemMessageId;
  #151 = Utf8               REELING_SUCCESSFUL_PENALTY_S1
  #152 = Fieldref           #124.#153     // ext/mods/gameserver/network/SystemMessageId.FISH_RESISTED_REELING_S1_HP_REGAINED:Lext/mods/gameserver/network/SystemMessageId;
  #153 = NameAndType        #154:#128     // FISH_RESISTED_REELING_S1_HP_REGAINED:Lext/mods/gameserver/network/SystemMessageId;
  #154 = Utf8               FISH_RESISTED_REELING_S1_HP_REGAINED
  #155 = Fieldref           #124.#156     // ext/mods/gameserver/network/SystemMessageId.PUMPING_SUCCESFUL_S1_DAMAGE:Lext/mods/gameserver/network/SystemMessageId;
  #156 = NameAndType        #157:#128     // PUMPING_SUCCESFUL_S1_DAMAGE:Lext/mods/gameserver/network/SystemMessageId;
  #157 = Utf8               PUMPING_SUCCESFUL_S1_DAMAGE
  #158 = Fieldref           #124.#159     // ext/mods/gameserver/network/SystemMessageId.PUMPING_SUCCESSFUL_PENALTY_S1:Lext/mods/gameserver/network/SystemMessageId;
  #159 = NameAndType        #160:#128     // PUMPING_SUCCESSFUL_PENALTY_S1:Lext/mods/gameserver/network/SystemMessageId;
  #160 = Utf8               PUMPING_SUCCESSFUL_PENALTY_S1
  #161 = Fieldref           #124.#162     // ext/mods/gameserver/network/SystemMessageId.FISH_RESISTED_PUMPING_S1_HP_REGAINED:Lext/mods/gameserver/network/SystemMessageId;
  #162 = NameAndType        #163:#128     // FISH_RESISTED_PUMPING_S1_HP_REGAINED:Lext/mods/gameserver/network/SystemMessageId;
  #163 = Utf8               FISH_RESISTED_PUMPING_S1_HP_REGAINED
  #164 = Methodref          #33.#165      // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #165 = NameAndType        #166:#167     // isDead:()Z
  #166 = Utf8               isDead
  #167 = Utf8               ()Z
  #168 = Methodref          #33.#169      // ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #169 = NameAndType        #170:#171     // getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #170 = Utf8               getMove
  #171 = Utf8               ()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #172 = Methodref          #173.#174     // ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
  #173 = Class              #175          // ext/mods/gameserver/model/actor/move/PlayerMove
  #174 = NameAndType        #176:#6       // stop:()V
  #175 = Utf8               ext/mods/gameserver/model/actor/move/PlayerMove
  #176 = Utf8               stop
  #177 = Methodref          #33.#178      // ext/mods/gameserver/model/actor/Player.setIsImmobilized:(Z)V
  #178 = NameAndType        #179:#106     // setIsImmobilized:(Z)V
  #179 = Utf8               setIsImmobilized
  #180 = Methodref          #7.#181       // ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
  #181 = NameAndType        #182:#183     // set:(Lext/mods/gameserver/model/location/Location;)V
  #182 = Utf8               set
  #183 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #184 = Methodref          #185.#186     // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #185 = Class              #187          // ext/mods/gameserver/model/item/instance/ItemInstance
  #186 = NameAndType        #188:#102     // getItemId:()I
  #187 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #188 = Utf8               getItemId
  #189 = Methodref          #185.#190     // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #190 = NameAndType        #191:#192     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #191 = Utf8               getItem
  #192 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #193 = Methodref          #194.#195     // ext/mods/gameserver/model/item/kind/Item.isNightLure:()Z
  #194 = Class              #196          // ext/mods/gameserver/model/item/kind/Item
  #195 = NameAndType        #197:#167     // isNightLure:()Z
  #196 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #197 = Utf8               isNightLure
  #198 = Fieldref           #13.#199      // ext/mods/gameserver/model/actor/container/player/FishingStance._isNightLure:Z
  #199 = NameAndType        #200:#110     // _isNightLure:Z
  #200 = Utf8               _isNightLure
  #201 = Methodref          #202.#203     // ext/mods/gameserver/data/xml/FishData.getInstance:()Lext/mods/gameserver/data/xml/FishData;
  #202 = Class              #204          // ext/mods/gameserver/data/xml/FishData
  #203 = NameAndType        #205:#206     // getInstance:()Lext/mods/gameserver/data/xml/FishData;
  #204 = Utf8               ext/mods/gameserver/data/xml/FishData
  #205 = Utf8               getInstance
  #206 = Utf8               ()Lext/mods/gameserver/data/xml/FishData;
  #207 = Methodref          #13.#208      // ext/mods/gameserver/model/actor/container/player/FishingStance.getRandomFishLvl:()I
  #208 = NameAndType        #209:#102     // getRandomFishLvl:()I
  #209 = Utf8               getRandomFishLvl
  #210 = Methodref          #13.#211      // ext/mods/gameserver/model/actor/container/player/FishingStance.getRandomFishType:(I)I
  #211 = NameAndType        #212:#27      // getRandomFishType:(I)I
  #212 = Utf8               getRandomFishType
  #213 = Methodref          #202.#214     // ext/mods/gameserver/data/xml/FishData.getFish:(III)Lext/mods/gameserver/model/records/Fish;
  #214 = NameAndType        #215:#216     // getFish:(III)Lext/mods/gameserver/model/records/Fish;
  #215 = Utf8               getFish
  #216 = Utf8               (III)Lext/mods/gameserver/model/records/Fish;
  #217 = Fieldref           #124.#218     // ext/mods/gameserver/network/SystemMessageId.CAST_LINE_AND_START_FISHING:Lext/mods/gameserver/network/SystemMessageId;
  #218 = NameAndType        #219:#128     // CAST_LINE_AND_START_FISHING:Lext/mods/gameserver/network/SystemMessageId;
  #219 = Utf8               CAST_LINE_AND_START_FISHING
  #220 = Class              #221          // ext/mods/gameserver/network/serverpackets/ExFishingStart
  #221 = Utf8               ext/mods/gameserver/network/serverpackets/ExFishingStart
  #222 = Methodref          #98.#223      // ext/mods/gameserver/model/records/Fish.getType:(Z)I
  #223 = NameAndType        #224:#225     // getType:(Z)I
  #224 = Utf8               getType
  #225 = Utf8               (Z)I
  #226 = Methodref          #220.#227     // ext/mods/gameserver/network/serverpackets/ExFishingStart."<init>":(Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/model/location/Location;Z)V
  #227 = NameAndType        #5:#228       // "<init>":(Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/model/location/Location;Z)V
  #228 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/model/location/Location;Z)V
  #229 = Class              #230          // ext/mods/gameserver/network/serverpackets/PlaySound
  #230 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
  #231 = String             #232          // SF_P_01
  #232 = Utf8               SF_P_01
  #233 = Methodref          #229.#234     // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(ILjava/lang/String;)V
  #234 = NameAndType        #5:#235       // "<init>":(ILjava/lang/String;)V
  #235 = Utf8               (ILjava/lang/String;)V
  #236 = Methodref          #98.#237      // ext/mods/gameserver/model/records/Fish.group:()I
  #237 = NameAndType        #238:#102     // group:()I
  #238 = Utf8               group
  #239 = Methodref          #98.#240      // ext/mods/gameserver/model/records/Fish.gutsCheckTime:()I
  #240 = NameAndType        #241:#102     // gutsCheckTime:()I
  #241 = Utf8               gutsCheckTime
  #242 = Double             1.33d
  #244 = Methodref          #54.#245      // java/lang/Math.round:(F)I
  #245 = NameAndType        #246:#247     // round:(F)I
  #246 = Utf8               round
  #247 = Utf8               (F)I
  #248 = Double             0.66d
  #250 = Methodref          #251.#252     // java/lang/System.currentTimeMillis:()J
  #251 = Class              #253          // java/lang/System
  #252 = NameAndType        #254:#255     // currentTimeMillis:()J
  #253 = Utf8               java/lang/System
  #254 = Utf8               currentTimeMillis
  #255 = Utf8               ()J
  #256 = Methodref          #98.#257      // ext/mods/gameserver/model/records/Fish.waitTime:()I
  #257 = NameAndType        #258:#102     // waitTime:()I
  #258 = Utf8               waitTime
  #259 = Long               10000l
  #261 = InvokeDynamic      #0:#262       // #0:run:(Lext/mods/gameserver/model/actor/container/player/FishingStance;JZZ)Ljava/lang/Runnable;
  #262 = NameAndType        #263:#264     // run:(Lext/mods/gameserver/model/actor/container/player/FishingStance;JZZ)Ljava/lang/Runnable;
  #263 = Utf8               run
  #264 = Utf8               (Lext/mods/gameserver/model/actor/container/player/FishingStance;JZZ)Ljava/lang/Runnable;
  #265 = Methodref          #266.#267     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #266 = Class              #268          // ext/mods/commons/pool/ThreadPool
  #267 = NameAndType        #269:#270     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #268 = Utf8               ext/mods/commons/pool/ThreadPool
  #269 = Utf8               scheduleAtFixedRate
  #270 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #271 = Class              #272          // ext/mods/gameserver/model/spawn/Spawn
  #272 = Utf8               ext/mods/gameserver/model/spawn/Spawn
  #273 = Methodref          #33.#274      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #274 = NameAndType        #275:#276     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #275 = Utf8               getStatus
  #276 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #277 = Methodref          #278.#279     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #278 = Class              #280          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #279 = NameAndType        #281:#102     // getLevel:()I
  #280 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #281 = Utf8               getLevel
  #282 = Methodref          #54.#283      // java/lang/Math.min:(II)I
  #283 = NameAndType        #284:#285     // min:(II)I
  #284 = Utf8               min
  #285 = Utf8               (II)I
  #286 = Methodref          #271.#287     // ext/mods/gameserver/model/spawn/Spawn."<init>":(I)V
  #287 = NameAndType        #5:#288       // "<init>":(I)V
  #288 = Utf8               (I)V
  #289 = Methodref          #33.#290      // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #290 = NameAndType        #291:#292     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #291 = Utf8               getPosition
  #292 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #293 = Methodref          #271.#294     // ext/mods/gameserver/model/spawn/Spawn.setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #294 = NameAndType        #295:#296     // setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #295 = Utf8               setLoc
  #296 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
  #297 = Methodref          #271.#298     // ext/mods/gameserver/model/spawn/Spawn.doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
  #298 = NameAndType        #299:#300     // doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
  #299 = Utf8               doSpawn
  #300 = Utf8               (ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
  #301 = Fieldref           #124.#302     // ext/mods/gameserver/network/SystemMessageId.YOU_CAUGHT_SOMETHING_SMELLY_THROW_IT_BACK:Lext/mods/gameserver/network/SystemMessageId;
  #302 = NameAndType        #303:#128     // YOU_CAUGHT_SOMETHING_SMELLY_THROW_IT_BACK:Lext/mods/gameserver/network/SystemMessageId;
  #303 = Utf8               YOU_CAUGHT_SOMETHING_SMELLY_THROW_IT_BACK
  #304 = Class              #305          // java/lang/Exception
  #305 = Utf8               java/lang/Exception
  #306 = Fieldref           #124.#307     // ext/mods/gameserver/network/SystemMessageId.YOU_CAUGHT_SOMETHING:Lext/mods/gameserver/network/SystemMessageId;
  #307 = NameAndType        #308:#128     // YOU_CAUGHT_SOMETHING:Lext/mods/gameserver/network/SystemMessageId;
  #308 = Utf8               YOU_CAUGHT_SOMETHING
  #309 = Methodref          #98.#310      // ext/mods/gameserver/model/records/Fish.id:()I
  #310 = NameAndType        #311:#102     // id:()I
  #311 = Utf8               id
  #312 = Methodref          #33.#313      // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #313 = NameAndType        #314:#315     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #314 = Utf8               addItem
  #315 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #316 = Methodref          #317.#318     // ext/mods/gameserver/data/manager/FishingChampionshipManager.getInstance:()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
  #317 = Class              #319          // ext/mods/gameserver/data/manager/FishingChampionshipManager
  #318 = NameAndType        #205:#320     // getInstance:()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
  #319 = Utf8               ext/mods/gameserver/data/manager/FishingChampionshipManager
  #320 = Utf8               ()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
  #321 = Methodref          #317.#322     // ext/mods/gameserver/data/manager/FishingChampionshipManager.newFish:(Lext/mods/gameserver/model/actor/Player;I)V
  #322 = NameAndType        #323:#324     // newFish:(Lext/mods/gameserver/model/actor/Player;I)V
  #323 = Utf8               newFish
  #324 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #325 = Methodref          #33.#326      // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #326 = NameAndType        #327:#328     // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #327 = Utf8               getMissions
  #328 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #329 = Fieldref           #330.#331     // ext/mods/gameserver/enums/actors/MissionType.FISHING:Lext/mods/gameserver/enums/actors/MissionType;
  #330 = Class              #332          // ext/mods/gameserver/enums/actors/MissionType
  #331 = NameAndType        #333:#334     // FISHING:Lext/mods/gameserver/enums/actors/MissionType;
  #332 = Utf8               ext/mods/gameserver/enums/actors/MissionType
  #333 = Utf8               FISHING
  #334 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
  #335 = Methodref          #336.#337     // ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #336 = Class              #338          // ext/mods/gameserver/model/actor/container/player/MissionList
  #337 = NameAndType        #339:#340     // update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #338 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
  #339 = Utf8               update
  #340 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)V
  #341 = Fieldref           #124.#342     // ext/mods/gameserver/network/SystemMessageId.BAIT_LOST_FISH_GOT_AWAY:Lext/mods/gameserver/network/SystemMessageId;
  #342 = NameAndType        #343:#128     // BAIT_LOST_FISH_GOT_AWAY:Lext/mods/gameserver/network/SystemMessageId;
  #343 = Utf8               BAIT_LOST_FISH_GOT_AWAY
  #344 = Fieldref           #13.#345      // ext/mods/gameserver/model/actor/container/player/FishingStance._lureType:I
  #345 = NameAndType        #346:#31      // _lureType:I
  #346 = Utf8               _lureType
  #347 = Methodref          #7.#348       // ext/mods/gameserver/model/location/Location.clean:()V
  #348 = NameAndType        #349:#6       // clean:()V
  #349 = Utf8               clean
  #350 = Class              #351          // ext/mods/gameserver/network/serverpackets/ExFishingEnd
  #351 = Utf8               ext/mods/gameserver/network/serverpackets/ExFishingEnd
  #352 = Methodref          #33.#353      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #353 = NameAndType        #354:#102     // getObjectId:()I
  #354 = Utf8               getObjectId
  #355 = Methodref          #350.#356     // ext/mods/gameserver/network/serverpackets/ExFishingEnd."<init>":(ZI)V
  #356 = NameAndType        #5:#357       // "<init>":(ZI)V
  #357 = Utf8               (ZI)V
  #358 = Fieldref           #124.#359     // ext/mods/gameserver/network/SystemMessageId.REEL_LINE_AND_STOP_FISHING:Lext/mods/gameserver/network/SystemMessageId;
  #359 = NameAndType        #360:#128     // REEL_LINE_AND_STOP_FISHING:Lext/mods/gameserver/network/SystemMessageId;
  #360 = Utf8               REEL_LINE_AND_STOP_FISHING
  #361 = InterfaceMethodref #362.#363     // java/util/concurrent/Future.cancel:(Z)Z
  #362 = Class              #364          // java/util/concurrent/Future
  #363 = NameAndType        #365:#366     // cancel:(Z)Z
  #364 = Utf8               java/util/concurrent/Future
  #365 = Utf8               cancel
  #366 = Utf8               (Z)Z
  #367 = Methodref          #98.#368      // ext/mods/gameserver/model/records/Fish.guts:()I
  #368 = NameAndType        #369:#102     // guts:()I
  #369 = Utf8               guts
  #370 = Methodref          #98.#371      // ext/mods/gameserver/model/records/Fish.combatTime:()I
  #371 = NameAndType        #372:#102     // combatTime:()I
  #372 = Utf8               combatTime
  #373 = Class              #374          // ext/mods/gameserver/network/serverpackets/ExFishingStartCombat
  #374 = Utf8               ext/mods/gameserver/network/serverpackets/ExFishingStartCombat
  #375 = Methodref          #373.#376     // ext/mods/gameserver/network/serverpackets/ExFishingStartCombat."<init>":(Lext/mods/gameserver/model/actor/Creature;IIIII)V
  #376 = NameAndType        #5:#377       // "<init>":(Lext/mods/gameserver/model/actor/Creature;IIIII)V
  #377 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIIII)V
  #378 = String             #379          // SF_S_01
  #379 = Utf8               SF_S_01
  #380 = Fieldref           #124.#381     // ext/mods/gameserver/network/SystemMessageId.GOT_A_BITE:Lext/mods/gameserver/network/SystemMessageId;
  #381 = NameAndType        #382:#128     // GOT_A_BITE:Lext/mods/gameserver/network/SystemMessageId;
  #382 = Utf8               GOT_A_BITE
  #383 = InvokeDynamic      #1:#384       // #1:run:(Lext/mods/gameserver/model/actor/container/player/FishingStance;)Ljava/lang/Runnable;
  #384 = NameAndType        #263:#385     // run:(Lext/mods/gameserver/model/actor/container/player/FishingStance;)Ljava/lang/Runnable;
  #385 = Utf8               (Lext/mods/gameserver/model/actor/container/player/FishingStance;)Ljava/lang/Runnable;
  #386 = Long               1000l
  #388 = Fieldref           #124.#389     // ext/mods/gameserver/network/SystemMessageId.BAIT_STOLEN_BY_FISH:Lext/mods/gameserver/network/SystemMessageId;
  #389 = NameAndType        #390:#128     // BAIT_STOLEN_BY_FISH:Lext/mods/gameserver/network/SystemMessageId;
  #390 = Utf8               BAIT_STOLEN_BY_FISH
  #391 = Fieldref           #124.#392     // ext/mods/gameserver/network/SystemMessageId.FISH_SPIT_THE_HOOK:Lext/mods/gameserver/network/SystemMessageId;
  #392 = NameAndType        #393:#128     // FISH_SPIT_THE_HOOK:Lext/mods/gameserver/network/SystemMessageId;
  #393 = Utf8               FISH_SPIT_THE_HOOK
  #394 = Methodref          #13.#395      // ext/mods/gameserver/model/actor/container/player/FishingStance.aiTask:()V
  #395 = NameAndType        #396:#6       // aiTask:()V
  #396 = Utf8               aiTask
  #397 = Utf8               Signature
  #398 = Utf8               Ljava/util/concurrent/Future<*>;
  #399 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #400 = Utf8               Code
  #401 = Utf8               LineNumberTable
  #402 = Utf8               LocalVariableTable
  #403 = Utf8               this
  #404 = Utf8               Lext/mods/gameserver/model/actor/container/player/FishingStance;
  #405 = Utf8               fisher
  #406 = Utf8               check
  #407 = Utf8               type
  #408 = Utf8               StackMapTable
  #409 = Utf8               effect
  #410 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #411 = Utf8               level
  #412 = Utf8               getLoc
  #413 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #414 = Utf8               isLookingForFish
  #415 = Utf8               isUnderFishCombat
  #416 = Utf8               penalty
  #417 = Class              #418          // java/lang/Throwable
  #418 = Utf8               java/lang/Throwable
  #419 = Utf8               useRealing
  #420 = Utf8               dmg
  #421 = Utf8               usePomping
  #422 = Utf8               start
  #423 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #424 = Utf8               isNoob
  #425 = Utf8               isUpperGrade
  #426 = Utf8               checkDelay
  #427 = Utf8               timer
  #428 = Utf8               J
  #429 = Utf8               baitLoc
  #430 = Utf8               lure
  #431 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #432 = Utf8               spawn
  #433 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #434 = Utf8               win
  #435 = Utf8               lambda$start$0
  #436 = Utf8               (JZZ)V
  #437 = Utf8               lambda$start$1
  #438 = Utf8               SourceFile
  #439 = Utf8               FishingStance.java
  #440 = Utf8               BootstrapMethods
  #441 = MethodType         #6            //  ()V
  #442 = MethodHandle       5:#443        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/FishingStance.lambda$start$0:(JZZ)V
  #443 = Methodref          #13.#444      // ext/mods/gameserver/model/actor/container/player/FishingStance.lambda$start$0:(JZZ)V
  #444 = NameAndType        #435:#436     // lambda$start$0:(JZZ)V
  #445 = MethodHandle       5:#446        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/FishingStance.lambda$start$1:()V
  #446 = Methodref          #13.#447      // ext/mods/gameserver/model/actor/container/player/FishingStance.lambda$start$1:()V
  #447 = NameAndType        #437:#6       // lambda$start$1:()V
  #448 = MethodHandle       6:#449        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #449 = Methodref          #450.#451     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #450 = Class              #452          // java/lang/invoke/LambdaMetafactory
  #451 = NameAndType        #453:#454     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #452 = Utf8               java/lang/invoke/LambdaMetafactory
  #453 = Utf8               metafactory
  #454 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #455 = Utf8               InnerClasses
  #456 = Class              #457          // java/lang/invoke/MethodHandles$Lookup
  #457 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #458 = Class              #459          // java/lang/invoke/MethodHandles
  #459 = Utf8               java/lang/invoke/MethodHandles
  #460 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.container.player.FishingStance(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class ext/mods/gameserver/model/location/Location
         8: dup
         9: iconst_0
        10: iconst_0
        11: iconst_0
        12: invokespecial #9                  // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        15: putfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/Location;
        18: aload_0
        19: aload_1
        20: putfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        23: return
      LineNumberTable:
        line 78: 0
        line 54: 4
        line 79: 18
        line 80: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/container/player/FishingStance;
            0      24     1 fisher   Lext/mods/gameserver/model/actor/Player;

  public ext.mods.gameserver.model.location.Location getLoc();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 260: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/FishingStance;

  public boolean isLookingForFish();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #59                 // Field _lookingForFish:Ljava/util/concurrent/Future;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 268: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/container/player/FishingStance;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isUnderFishCombat();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #63                 // Field _fishCombat:Ljava/util/concurrent/Future;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 276: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/container/player/FishingStance;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void changeHp(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=11, locals=3, args_size=3
         0: aload_0
         1: dup
         2: getfield      #66                 // Field _fishCurHp:I
         5: iload_1
         6: isub
         7: putfield      #66                 // Field _fishCurHp:I
        10: aload_0
        11: getfield      #66                 // Field _fishCurHp:I
        14: ifge          22
        17: aload_0
        18: iconst_0
        19: putfield      #66                 // Field _fishCurHp:I
        22: aload_0
        23: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        26: new           #69                 // class ext/mods/gameserver/network/serverpackets/ExFishingHpRegen
        29: dup
        30: aload_0
        31: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        34: aload_0
        35: getfield      #71                 // Field _time:I
        38: aload_0
        39: getfield      #66                 // Field _fishCurHp:I
        42: aload_0
        43: getfield      #74                 // Field _mode:I
        46: aload_0
        47: getfield      #77                 // Field _goodUse:I
        50: aload_0
        51: getfield      #80                 // Field _anim:I
        54: iload_2
        55: aload_0
        56: getfield      #83                 // Field _deceptiveMode:I
        59: invokespecial #86                 // Method ext/mods/gameserver/network/serverpackets/ExFishingHpRegen."<init>":(Lext/mods/gameserver/model/actor/Creature;IIIIIII)V
        62: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        65: aload_0
        66: iconst_0
        67: putfield      #80                 // Field _anim:I
        70: aload_0
        71: getfield      #66                 // Field _fishCurHp:I
        74: aload_0
        75: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
        78: invokevirtual #97                 // Method ext/mods/gameserver/model/records/Fish.hp:()I
        81: iconst_2
        82: imul
        83: if_icmple     107
        86: aload_0
        87: aload_0
        88: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
        91: invokevirtual #97                 // Method ext/mods/gameserver/model/records/Fish.hp:()I
        94: iconst_2
        95: imul
        96: putfield      #66                 // Field _fishCurHp:I
        99: aload_0
       100: iconst_0
       101: invokevirtual #103                // Method end:(Z)V
       104: goto          119
       107: aload_0
       108: getfield      #66                 // Field _fishCurHp:I
       111: ifne          119
       114: aload_0
       115: iconst_1
       116: invokevirtual #103                // Method end:(Z)V
       119: return
      LineNumberTable:
        line 286: 0
        line 287: 10
        line 288: 17
        line 290: 22
        line 291: 65
        line 293: 70
        line 295: 86
        line 296: 99
        line 298: 107
        line 299: 114
        line 300: 119
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     120     0  this   Lext/mods/gameserver/model/actor/container/player/FishingStance;
            0     120     1    hp   I
            0     120     2 penalty   I
      StackMapTable: number_of_entries = 3
        frame_type = 22 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 84
        frame_type = 11 /* same */

  protected void aiTask();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=11, locals=3, args_size=1
         0: aload_0
         1: getfield      #107                // Field _thinking:Z
         4: ifeq          8
         7: return
         8: aload_0
         9: iconst_1
        10: putfield      #107                // Field _thinking:Z
        13: aload_0
        14: dup
        15: getfield      #71                 // Field _time:I
        18: iconst_1
        19: isub
        20: putfield      #71                 // Field _time:I
        23: aload_0
        24: getfield      #74                 // Field _mode:I
        27: iconst_1
        28: if_icmpne     57
        31: aload_0
        32: getfield      #83                 // Field _deceptiveMode:I
        35: ifne          81
        38: aload_0
        39: dup
        40: getfield      #66                 // Field _fishCurHp:I
        43: aload_0
        44: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
        47: invokevirtual #111                // Method ext/mods/gameserver/model/records/Fish.hpRegen:()I
        50: iadd
        51: putfield      #66                 // Field _fishCurHp:I
        54: goto          81
        57: aload_0
        58: getfield      #83                 // Field _deceptiveMode:I
        61: iconst_1
        62: if_icmpne     81
        65: aload_0
        66: dup
        67: getfield      #66                 // Field _fishCurHp:I
        70: aload_0
        71: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
        74: invokevirtual #111                // Method ext/mods/gameserver/model/records/Fish.hpRegen:()I
        77: iadd
        78: putfield      #66                 // Field _fishCurHp:I
        81: aload_0
        82: getfield      #114                // Field _stop:I
        85: ifne          159
        88: aload_0
        89: iconst_1
        90: putfield      #114                // Field _stop:I
        93: bipush        100
        95: invokestatic  #22                 // Method ext/mods/commons/random/Rnd.get:(I)I
        98: istore_1
        99: iload_1
       100: bipush        70
       102: if_icmplt     121
       105: aload_0
       106: aload_0
       107: getfield      #74                 // Field _mode:I
       110: ifne          117
       113: iconst_1
       114: goto          118
       117: iconst_0
       118: putfield      #74                 // Field _mode:I
       121: aload_0
       122: getfield      #117                // Field _isUpperGrade:Z
       125: ifeq          156
       128: bipush        100
       130: invokestatic  #22                 // Method ext/mods/commons/random/Rnd.get:(I)I
       133: istore_1
       134: iload_1
       135: bipush        90
       137: if_icmplt     156
       140: aload_0
       141: aload_0
       142: getfield      #83                 // Field _deceptiveMode:I
       145: ifne          152
       148: iconst_1
       149: goto          153
       152: iconst_0
       153: putfield      #83                 // Field _deceptiveMode:I
       156: goto          169
       159: aload_0
       160: dup
       161: getfield      #114                // Field _stop:I
       164: iconst_1
       165: isub
       166: putfield      #114                // Field _stop:I
       169: aload_0
       170: iconst_0
       171: putfield      #107                // Field _thinking:Z
       174: aload_0
       175: getfield      #80                 // Field _anim:I
       178: ifeq          224
       181: aload_0
       182: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       185: new           #69                 // class ext/mods/gameserver/network/serverpackets/ExFishingHpRegen
       188: dup
       189: aload_0
       190: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       193: aload_0
       194: getfield      #71                 // Field _time:I
       197: aload_0
       198: getfield      #66                 // Field _fishCurHp:I
       201: aload_0
       202: getfield      #74                 // Field _mode:I
       205: iconst_0
       206: aload_0
       207: getfield      #80                 // Field _anim:I
       210: iconst_0
       211: aload_0
       212: getfield      #83                 // Field _deceptiveMode:I
       215: invokespecial #86                 // Method ext/mods/gameserver/network/serverpackets/ExFishingHpRegen."<init>":(Lext/mods/gameserver/model/actor/Creature;IIIIIII)V
       218: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       221: goto          365
       224: aload_0
       225: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       228: new           #69                 // class ext/mods/gameserver/network/serverpackets/ExFishingHpRegen
       231: dup
       232: aload_0
       233: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       236: aload_0
       237: getfield      #71                 // Field _time:I
       240: aload_0
       241: getfield      #66                 // Field _fishCurHp:I
       244: aload_0
       245: getfield      #74                 // Field _mode:I
       248: iconst_0
       249: aload_0
       250: getfield      #80                 // Field _anim:I
       253: iconst_0
       254: aload_0
       255: getfield      #83                 // Field _deceptiveMode:I
       258: invokespecial #86                 // Method ext/mods/gameserver/network/serverpackets/ExFishingHpRegen."<init>":(Lext/mods/gameserver/model/actor/Creature;IIIIIII)V
       261: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       264: goto          365
       267: astore_2
       268: aload_0
       269: iconst_0
       270: putfield      #107                // Field _thinking:Z
       273: aload_0
       274: getfield      #80                 // Field _anim:I
       277: ifeq          323
       280: aload_0
       281: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       284: new           #69                 // class ext/mods/gameserver/network/serverpackets/ExFishingHpRegen
       287: dup
       288: aload_0
       289: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       292: aload_0
       293: getfield      #71                 // Field _time:I
       296: aload_0
       297: getfield      #66                 // Field _fishCurHp:I
       300: aload_0
       301: getfield      #74                 // Field _mode:I
       304: iconst_0
       305: aload_0
       306: getfield      #80                 // Field _anim:I
       309: iconst_0
       310: aload_0
       311: getfield      #83                 // Field _deceptiveMode:I
       314: invokespecial #86                 // Method ext/mods/gameserver/network/serverpackets/ExFishingHpRegen."<init>":(Lext/mods/gameserver/model/actor/Creature;IIIIIII)V
       317: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       320: goto          363
       323: aload_0
       324: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       327: new           #69                 // class ext/mods/gameserver/network/serverpackets/ExFishingHpRegen
       330: dup
       331: aload_0
       332: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       335: aload_0
       336: getfield      #71                 // Field _time:I
       339: aload_0
       340: getfield      #66                 // Field _fishCurHp:I
       343: aload_0
       344: getfield      #74                 // Field _mode:I
       347: iconst_0
       348: aload_0
       349: getfield      #80                 // Field _anim:I
       352: iconst_0
       353: aload_0
       354: getfield      #83                 // Field _deceptiveMode:I
       357: invokespecial #86                 // Method ext/mods/gameserver/network/serverpackets/ExFishingHpRegen."<init>":(Lext/mods/gameserver/model/actor/Creature;IIIIIII)V
       360: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       363: aload_2
       364: athrow
       365: return
      Exception table:
         from    to  target type
            23   169   267   any
      LineNumberTable:
        line 304: 0
        line 305: 7
        line 307: 8
        line 308: 13
        line 312: 23
        line 314: 31
        line 315: 38
        line 319: 57
        line 320: 65
        line 323: 81
        line 325: 88
        line 326: 93
        line 327: 99
        line 328: 105
        line 330: 121
        line 332: 128
        line 333: 134
        line 334: 140
        line 336: 156
        line 338: 159
        line 342: 169
        line 343: 174
        line 344: 181
        line 346: 224
        line 347: 264
        line 342: 267
        line 343: 273
        line 344: 280
        line 346: 323
        line 347: 363
        line 348: 365
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           99      57     1 check   I
            0     366     0  this   Lext/mods/gameserver/model/actor/container/player/FishingStance;
      StackMapTable: number_of_entries = 16
        frame_type = 8 /* same */
        frame_type = 48 /* same */
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/actor/container/player/FishingStance, int ]
          stack = [ class ext/mods/gameserver/model/actor/container/player/FishingStance ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/container/player/FishingStance, int ]
          stack = [ class ext/mods/gameserver/model/actor/container/player/FishingStance, int ]
        frame_type = 2 /* same */
        frame_type = 94 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/container/player/FishingStance ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/container/player/FishingStance, int ]
          stack = [ class ext/mods/gameserver/model/actor/container/player/FishingStance, int ]
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 9 /* same */
        frame_type = 54 /* same */
        frame_type = 106 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 253 /* append */
          offset_delta = 55
          locals = [ top, class java/lang/Throwable ]
        frame_type = 39 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1

  public void useRealing(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iconst_2
         2: putfield      #80                 // Field _anim:I
         5: bipush        100
         7: invokestatic  #22                 // Method ext/mods/commons/random/Rnd.get:(I)I
        10: bipush        90
        12: if_icmple     37
        15: aload_0
        16: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        19: getstatic     #123                // Field ext/mods/gameserver/network/SystemMessageId.FISH_RESISTED_ATTEMPT_TO_BRING_IT_IN:Lext/mods/gameserver/network/SystemMessageId;
        22: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        25: aload_0
        26: iconst_0
        27: putfield      #77                 // Field _goodUse:I
        30: aload_0
        31: iconst_0
        32: iload_2
        33: invokevirtual #132                // Method changeHp:(II)V
        36: return
        37: aload_0
        38: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        41: ifnonnull     45
        44: return
        45: aload_0
        46: getfield      #74                 // Field _mode:I
        49: iconst_1
        50: if_icmpne     146
        53: aload_0
        54: getfield      #83                 // Field _deceptiveMode:I
        57: ifne          114
        60: aload_0
        61: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        64: getstatic     #136                // Field ext/mods/gameserver/network/SystemMessageId.REELING_SUCCESFUL_S1_DAMAGE:Lext/mods/gameserver/network/SystemMessageId;
        67: invokestatic  #139                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        70: iload_1
        71: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        74: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        77: iload_2
        78: bipush        50
        80: if_icmpne     100
        83: aload_0
        84: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        87: getstatic     #149                // Field ext/mods/gameserver/network/SystemMessageId.REELING_SUCCESSFUL_PENALTY_S1:Lext/mods/gameserver/network/SystemMessageId;
        90: invokestatic  #139                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        93: iload_2
        94: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        97: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       100: aload_0
       101: iconst_1
       102: putfield      #77                 // Field _goodUse:I
       105: aload_0
       106: iload_1
       107: iload_2
       108: invokevirtual #132                // Method changeHp:(II)V
       111: goto          236
       114: aload_0
       115: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       118: getstatic     #152                // Field ext/mods/gameserver/network/SystemMessageId.FISH_RESISTED_REELING_S1_HP_REGAINED:Lext/mods/gameserver/network/SystemMessageId;
       121: invokestatic  #139                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       124: iload_1
       125: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       128: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       131: aload_0
       132: iconst_2
       133: putfield      #77                 // Field _goodUse:I
       136: aload_0
       137: iload_1
       138: ineg
       139: iload_2
       140: invokevirtual #132                // Method changeHp:(II)V
       143: goto          236
       146: aload_0
       147: getfield      #83                 // Field _deceptiveMode:I
       150: ifne          185
       153: aload_0
       154: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       157: getstatic     #152                // Field ext/mods/gameserver/network/SystemMessageId.FISH_RESISTED_REELING_S1_HP_REGAINED:Lext/mods/gameserver/network/SystemMessageId;
       160: invokestatic  #139                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       163: iload_1
       164: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       167: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       170: aload_0
       171: iconst_2
       172: putfield      #77                 // Field _goodUse:I
       175: aload_0
       176: iload_1
       177: ineg
       178: iload_2
       179: invokevirtual #132                // Method changeHp:(II)V
       182: goto          236
       185: aload_0
       186: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       189: getstatic     #136                // Field ext/mods/gameserver/network/SystemMessageId.REELING_SUCCESFUL_S1_DAMAGE:Lext/mods/gameserver/network/SystemMessageId;
       192: invokestatic  #139                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       195: iload_1
       196: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       199: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       202: iload_2
       203: bipush        50
       205: if_icmpne     225
       208: aload_0
       209: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       212: getstatic     #149                // Field ext/mods/gameserver/network/SystemMessageId.REELING_SUCCESSFUL_PENALTY_S1:Lext/mods/gameserver/network/SystemMessageId;
       215: invokestatic  #139                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       218: iload_2
       219: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       222: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       225: aload_0
       226: iconst_1
       227: putfield      #77                 // Field _goodUse:I
       230: aload_0
       231: iload_1
       232: iload_2
       233: invokevirtual #132                // Method changeHp:(II)V
       236: return
      LineNumberTable:
        line 352: 0
        line 353: 5
        line 355: 15
        line 356: 25
        line 357: 30
        line 358: 36
        line 361: 37
        line 362: 44
        line 364: 45
        line 366: 53
        line 368: 60
        line 369: 77
        line 370: 83
        line 372: 100
        line 373: 105
        line 377: 114
        line 378: 131
        line 379: 136
        line 384: 146
        line 386: 153
        line 387: 170
        line 388: 175
        line 392: 185
        line 393: 202
        line 394: 208
        line 396: 225
        line 397: 230
        line 400: 236
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     237     0  this   Lext/mods/gameserver/model/actor/container/player/FishingStance;
            0     237     1   dmg   I
            0     237     2 penalty   I
      StackMapTable: number_of_entries = 8
        frame_type = 37 /* same */
        frame_type = 7 /* same */
        frame_type = 54 /* same */
        frame_type = 13 /* same */
        frame_type = 31 /* same */
        frame_type = 38 /* same */
        frame_type = 39 /* same */
        frame_type = 10 /* same */

  public void usePomping(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iconst_1
         2: putfield      #80                 // Field _anim:I
         5: bipush        100
         7: invokestatic  #22                 // Method ext/mods/commons/random/Rnd.get:(I)I
        10: bipush        90
        12: if_icmple     37
        15: aload_0
        16: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        19: getstatic     #123                // Field ext/mods/gameserver/network/SystemMessageId.FISH_RESISTED_ATTEMPT_TO_BRING_IT_IN:Lext/mods/gameserver/network/SystemMessageId;
        22: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        25: aload_0
        26: iconst_0
        27: putfield      #77                 // Field _goodUse:I
        30: aload_0
        31: iconst_0
        32: iload_2
        33: invokevirtual #132                // Method changeHp:(II)V
        36: return
        37: aload_0
        38: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        41: ifnonnull     45
        44: return
        45: aload_0
        46: getfield      #74                 // Field _mode:I
        49: ifne          145
        52: aload_0
        53: getfield      #83                 // Field _deceptiveMode:I
        56: ifne          113
        59: aload_0
        60: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        63: getstatic     #155                // Field ext/mods/gameserver/network/SystemMessageId.PUMPING_SUCCESFUL_S1_DAMAGE:Lext/mods/gameserver/network/SystemMessageId;
        66: invokestatic  #139                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        69: iload_1
        70: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        73: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        76: iload_2
        77: bipush        50
        79: if_icmpne     99
        82: aload_0
        83: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        86: getstatic     #158                // Field ext/mods/gameserver/network/SystemMessageId.PUMPING_SUCCESSFUL_PENALTY_S1:Lext/mods/gameserver/network/SystemMessageId;
        89: invokestatic  #139                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        92: iload_2
        93: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        96: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        99: aload_0
       100: iconst_1
       101: putfield      #77                 // Field _goodUse:I
       104: aload_0
       105: iload_1
       106: iload_2
       107: invokevirtual #132                // Method changeHp:(II)V
       110: goto          235
       113: aload_0
       114: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       117: getstatic     #161                // Field ext/mods/gameserver/network/SystemMessageId.FISH_RESISTED_PUMPING_S1_HP_REGAINED:Lext/mods/gameserver/network/SystemMessageId;
       120: invokestatic  #139                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       123: iload_1
       124: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       127: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       130: aload_0
       131: iconst_2
       132: putfield      #77                 // Field _goodUse:I
       135: aload_0
       136: iload_1
       137: ineg
       138: iload_2
       139: invokevirtual #132                // Method changeHp:(II)V
       142: goto          235
       145: aload_0
       146: getfield      #83                 // Field _deceptiveMode:I
       149: ifne          184
       152: aload_0
       153: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       156: getstatic     #161                // Field ext/mods/gameserver/network/SystemMessageId.FISH_RESISTED_PUMPING_S1_HP_REGAINED:Lext/mods/gameserver/network/SystemMessageId;
       159: invokestatic  #139                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       162: iload_1
       163: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       166: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       169: aload_0
       170: iconst_2
       171: putfield      #77                 // Field _goodUse:I
       174: aload_0
       175: iload_1
       176: ineg
       177: iload_2
       178: invokevirtual #132                // Method changeHp:(II)V
       181: goto          235
       184: aload_0
       185: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       188: getstatic     #155                // Field ext/mods/gameserver/network/SystemMessageId.PUMPING_SUCCESFUL_S1_DAMAGE:Lext/mods/gameserver/network/SystemMessageId;
       191: invokestatic  #139                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       194: iload_1
       195: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       198: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       201: iload_2
       202: bipush        50
       204: if_icmpne     224
       207: aload_0
       208: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       211: getstatic     #158                // Field ext/mods/gameserver/network/SystemMessageId.PUMPING_SUCCESSFUL_PENALTY_S1:Lext/mods/gameserver/network/SystemMessageId;
       214: invokestatic  #139                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       217: iload_2
       218: invokevirtual #145                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       221: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       224: aload_0
       225: iconst_1
       226: putfield      #77                 // Field _goodUse:I
       229: aload_0
       230: iload_1
       231: iload_2
       232: invokevirtual #132                // Method changeHp:(II)V
       235: return
      LineNumberTable:
        line 404: 0
        line 405: 5
        line 407: 15
        line 408: 25
        line 409: 30
        line 410: 36
        line 413: 37
        line 414: 44
        line 416: 45
        line 418: 52
        line 420: 59
        line 421: 76
        line 422: 82
        line 424: 99
        line 425: 104
        line 429: 113
        line 430: 130
        line 431: 135
        line 436: 145
        line 438: 152
        line 439: 169
        line 440: 174
        line 444: 184
        line 445: 201
        line 446: 207
        line 448: 224
        line 449: 229
        line 452: 235
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     236     0  this   Lext/mods/gameserver/model/actor/container/player/FishingStance;
            0     236     1   dmg   I
            0     236     2 penalty   I
      StackMapTable: number_of_entries = 8
        frame_type = 37 /* same */
        frame_type = 7 /* same */
        frame_type = 53 /* same */
        frame_type = 13 /* same */
        frame_type = 31 /* same */
        frame_type = 38 /* same */
        frame_type = 39 /* same */
        frame_type = 10 /* same */

  public void start(ext.mods.gameserver.model.location.Location, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=9, args_size=3
         0: aload_0
         1: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
         7: ifeq          11
        10: return
        11: aload_0
        12: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        15: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
        18: invokevirtual #172                // Method ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
        21: aload_0
        22: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        25: iconst_1
        26: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.setIsImmobilized:(Z)V
        29: aload_0
        30: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/Location;
        33: aload_1
        34: invokevirtual #180                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
        37: aload_0
        38: aload_2
        39: invokevirtual #184                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        42: putfield      #28                 // Field _lureId:I
        45: aload_0
        46: aload_2
        47: invokevirtual #189                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        50: invokevirtual #193                // Method ext/mods/gameserver/model/item/kind/Item.isNightLure:()Z
        53: putfield      #198                // Field _isNightLure:Z
        56: iconst_1
        57: istore_3
        58: aload_0
        59: getfield      #28                 // Field _lureId:I
        62: lookupswitch  { // 8

                    7807: 136

                    7808: 136

                    7809: 136

                    8485: 141

                    8486: 136

                    8506: 141

                    8509: 141

                    8512: 141
                 default: 143
            }
       136: iconst_0
       137: istore_3
       138: goto          143
       141: iconst_2
       142: istore_3
       143: aload_0
       144: invokestatic  #201                // Method ext/mods/gameserver/data/xml/FishData.getInstance:()Lext/mods/gameserver/data/xml/FishData;
       147: aload_0
       148: invokevirtual #207                // Method getRandomFishLvl:()I
       151: aload_0
       152: iload_3
       153: invokevirtual #210                // Method getRandomFishType:(I)I
       156: iload_3
       157: invokevirtual #213                // Method ext/mods/gameserver/data/xml/FishData.getFish:(III)Lext/mods/gameserver/model/records/Fish;
       160: putfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
       163: aload_0
       164: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
       167: ifnonnull     176
       170: aload_0
       171: iconst_0
       172: invokevirtual #103                // Method end:(Z)V
       175: return
       176: aload_0
       177: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       180: getstatic     #217                // Field ext/mods/gameserver/network/SystemMessageId.CAST_LINE_AND_START_FISHING:Lext/mods/gameserver/network/SystemMessageId;
       183: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       186: aload_0
       187: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       190: new           #220                // class ext/mods/gameserver/network/serverpackets/ExFishingStart
       193: dup
       194: aload_0
       195: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       198: aload_0
       199: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
       202: aload_0
       203: getfield      #198                // Field _isNightLure:Z
       206: invokevirtual #222                // Method ext/mods/gameserver/model/records/Fish.getType:(Z)I
       209: aload_0
       210: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/Location;
       213: aload_0
       214: getfield      #198                // Field _isNightLure:Z
       217: invokespecial #226                // Method ext/mods/gameserver/network/serverpackets/ExFishingStart."<init>":(Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/model/location/Location;Z)V
       220: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       223: aload_0
       224: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       227: new           #229                // class ext/mods/gameserver/network/serverpackets/PlaySound
       230: dup
       231: iconst_1
       232: ldc           #231                // String SF_P_01
       234: invokespecial #233                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(ILjava/lang/String;)V
       237: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       240: aload_0
       241: getfield      #59                 // Field _lookingForFish:Ljava/util/concurrent/Future;
       244: ifnonnull     626
       247: aload_0
       248: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
       251: invokevirtual #236                // Method ext/mods/gameserver/model/records/Fish.group:()I
       254: ifne          261
       257: iconst_1
       258: goto          262
       261: iconst_0
       262: istore        4
       264: aload_0
       265: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
       268: invokevirtual #236                // Method ext/mods/gameserver/model/records/Fish.group:()I
       271: iconst_2
       272: if_icmpne     279
       275: iconst_1
       276: goto          280
       279: iconst_0
       280: istore        5
       282: iconst_0
       283: istore        6
       285: aload_0
       286: getfield      #28                 // Field _lureId:I
       289: sipush        6519
       292: if_icmpeq     345
       295: aload_0
       296: getfield      #28                 // Field _lureId:I
       299: sipush        6522
       302: if_icmpeq     345
       305: aload_0
       306: getfield      #28                 // Field _lureId:I
       309: sipush        6525
       312: if_icmpeq     345
       315: aload_0
       316: getfield      #28                 // Field _lureId:I
       319: sipush        8505
       322: if_icmpeq     345
       325: aload_0
       326: getfield      #28                 // Field _lureId:I
       329: sipush        8508
       332: if_icmpeq     345
       335: aload_0
       336: getfield      #28                 // Field _lureId:I
       339: sipush        8511
       342: if_icmpne     366
       345: aload_0
       346: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
       349: invokevirtual #239                // Method ext/mods/gameserver/model/records/Fish.gutsCheckTime:()I
       352: i2d
       353: ldc2_w        #242                // double 1.33d
       356: dmul
       357: d2f
       358: invokestatic  #244                // Method java/lang/Math.round:(F)I
       361: istore        6
       363: goto          583
       366: aload_0
       367: getfield      #28                 // Field _lureId:I
       370: sipush        6520
       373: if_icmpeq     486
       376: aload_0
       377: getfield      #28                 // Field _lureId:I
       380: sipush        6523
       383: if_icmpeq     486
       386: aload_0
       387: getfield      #28                 // Field _lureId:I
       390: sipush        6526
       393: if_icmpeq     486
       396: aload_0
       397: getfield      #28                 // Field _lureId:I
       400: sipush        8505
       403: if_icmplt     416
       406: aload_0
       407: getfield      #28                 // Field _lureId:I
       410: sipush        8513
       413: if_icmple     486
       416: aload_0
       417: getfield      #28                 // Field _lureId:I
       420: sipush        7610
       423: if_icmplt     436
       426: aload_0
       427: getfield      #28                 // Field _lureId:I
       430: sipush        7613
       433: if_icmple     486
       436: aload_0
       437: getfield      #28                 // Field _lureId:I
       440: sipush        7807
       443: if_icmplt     456
       446: aload_0
       447: getfield      #28                 // Field _lureId:I
       450: sipush        7809
       453: if_icmple     486
       456: aload_0
       457: getfield      #28                 // Field _lureId:I
       460: sipush        8484
       463: if_icmplt     476
       466: aload_0
       467: getfield      #28                 // Field _lureId:I
       470: sipush        8486
       473: if_icmple     486
       476: aload_0
       477: getfield      #28                 // Field _lureId:I
       480: sipush        8548
       483: if_icmpne     505
       486: aload_0
       487: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
       490: invokevirtual #239                // Method ext/mods/gameserver/model/records/Fish.gutsCheckTime:()I
       493: i2d
       494: dconst_1
       495: dmul
       496: d2f
       497: invokestatic  #244                // Method java/lang/Math.round:(F)I
       500: istore        6
       502: goto          583
       505: aload_0
       506: getfield      #28                 // Field _lureId:I
       509: sipush        6521
       512: if_icmpeq     565
       515: aload_0
       516: getfield      #28                 // Field _lureId:I
       519: sipush        6524
       522: if_icmpeq     565
       525: aload_0
       526: getfield      #28                 // Field _lureId:I
       529: sipush        6527
       532: if_icmpeq     565
       535: aload_0
       536: getfield      #28                 // Field _lureId:I
       539: sipush        8507
       542: if_icmpeq     565
       545: aload_0
       546: getfield      #28                 // Field _lureId:I
       549: sipush        8510
       552: if_icmpeq     565
       555: aload_0
       556: getfield      #28                 // Field _lureId:I
       559: sipush        8513
       562: if_icmpne     583
       565: aload_0
       566: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
       569: invokevirtual #239                // Method ext/mods/gameserver/model/records/Fish.gutsCheckTime:()I
       572: i2d
       573: ldc2_w        #248                // double 0.66d
       576: dmul
       577: d2f
       578: invokestatic  #244                // Method java/lang/Math.round:(F)I
       581: istore        6
       583: invokestatic  #250                // Method java/lang/System.currentTimeMillis:()J
       586: aload_0
       587: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
       590: invokevirtual #256                // Method ext/mods/gameserver/model/records/Fish.waitTime:()I
       593: i2l
       594: ladd
       595: ldc2_w        #259                // long 10000l
       598: ladd
       599: lstore        7
       601: aload_0
       602: aload_0
       603: lload         7
       605: iload         5
       607: iload         4
       609: invokedynamic #261,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/container/player/FishingStance;JZZ)Ljava/lang/Runnable;
       614: ldc2_w        #259                // long 10000l
       617: iload         6
       619: i2l
       620: invokestatic  #265                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       623: putfield      #59                 // Field _lookingForFish:Ljava/util/concurrent/Future;
       626: return
      LineNumberTable:
        line 467: 0
        line 468: 10
        line 470: 11
        line 471: 21
        line 473: 29
        line 474: 37
        line 475: 45
        line 477: 56
        line 479: 58
        line 482: 136
        line 483: 138
        line 486: 141
        line 490: 143
        line 491: 163
        line 493: 170
        line 494: 175
        line 497: 176
        line 499: 186
        line 500: 223
        line 502: 240
        line 504: 247
        line 505: 264
        line 507: 282
        line 508: 285
        line 509: 345
        line 510: 366
        line 511: 486
        line 512: 505
        line 513: 565
        line 515: 583
        line 517: 601
        line 579: 626
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          264     362     4 isNoob   Z
          282     344     5 isUpperGrade   Z
          285     341     6 checkDelay   I
          601      25     7 timer   J
            0     627     0  this   Lext/mods/gameserver/model/actor/container/player/FishingStance;
            0     627     1 baitLoc   Lext/mods/gameserver/model/location/Location;
            0     627     2  lure   Lext/mods/gameserver/model/item/instance/ItemInstance;
           58     569     3 group   I
      StackMapTable: number_of_entries = 20
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 124
          locals = [ int ]
        frame_type = 4 /* same */
        frame_type = 1 /* same */
        frame_type = 32 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 84
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 64
          locals = [ int, int ]
        frame_type = 20 /* same */
        frame_type = 49 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 9 /* same */
        frame_type = 18 /* same */
        frame_type = 59 /* same */
        frame_type = 17 /* same */
        frame_type = 248 /* chop */
          offset_delta = 42

  public void end(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: iload_1
         1: ifeq          135
         4: bipush        100
         6: invokestatic  #22                 // Method ext/mods/commons/random/Rnd.get:(I)I
         9: iconst_5
        10: if_icmpge     81
        13: new           #271                // class ext/mods/gameserver/model/spawn/Spawn
        16: dup
        17: sipush        18319
        20: aload_0
        21: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        24: invokevirtual #273                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        27: invokevirtual #277                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        30: bipush        11
        32: idiv
        33: bipush        7
        35: invokestatic  #282                // Method java/lang/Math.min:(II)I
        38: iadd
        39: invokespecial #286                // Method ext/mods/gameserver/model/spawn/Spawn."<init>":(I)V
        42: astore_2
        43: aload_2
        44: aload_0
        45: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        48: invokevirtual #289                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        51: invokevirtual #293                // Method ext/mods/gameserver/model/spawn/Spawn.setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
        54: aload_2
        55: iconst_0
        56: aload_0
        57: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        60: invokevirtual #297                // Method ext/mods/gameserver/model/spawn/Spawn.doSpawn:(ZLext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Npc;
        63: pop
        64: aload_0
        65: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        68: getstatic     #301                // Field ext/mods/gameserver/network/SystemMessageId.YOU_CAUGHT_SOMETHING_SMELLY_THROW_IT_BACK:Lext/mods/gameserver/network/SystemMessageId;
        71: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        74: goto          122
        77: astore_2
        78: goto          122
        81: aload_0
        82: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        85: getstatic     #306                // Field ext/mods/gameserver/network/SystemMessageId.YOU_CAUGHT_SOMETHING:Lext/mods/gameserver/network/SystemMessageId;
        88: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        91: aload_0
        92: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
        95: aload_0
        96: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
        99: invokevirtual #309                // Method ext/mods/gameserver/model/records/Fish.id:()I
       102: iconst_1
       103: iconst_1
       104: invokevirtual #312                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       107: pop
       108: invokestatic  #316                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager.getInstance:()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
       111: aload_0
       112: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       115: aload_0
       116: getfield      #28                 // Field _lureId:I
       119: invokevirtual #321                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager.newFish:(Lext/mods/gameserver/model/actor/Player;I)V
       122: aload_0
       123: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       126: invokevirtual #325                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
       129: getstatic     #329                // Field ext/mods/gameserver/enums/actors/MissionType.FISHING:Lext/mods/gameserver/enums/actors/MissionType;
       132: invokevirtual #335                // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       135: aload_0
       136: getfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
       139: ifnonnull     152
       142: aload_0
       143: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       146: getstatic     #341                // Field ext/mods/gameserver/network/SystemMessageId.BAIT_LOST_FISH_GOT_AWAY:Lext/mods/gameserver/network/SystemMessageId;
       149: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       152: aload_0
       153: iconst_0
       154: putfield      #71                 // Field _time:I
       157: aload_0
       158: iconst_0
       159: putfield      #114                // Field _stop:I
       162: aload_0
       163: iconst_0
       164: putfield      #77                 // Field _goodUse:I
       167: aload_0
       168: iconst_0
       169: putfield      #80                 // Field _anim:I
       172: aload_0
       173: iconst_0
       174: putfield      #74                 // Field _mode:I
       177: aload_0
       178: iconst_0
       179: putfield      #83                 // Field _deceptiveMode:I
       182: aload_0
       183: iconst_0
       184: putfield      #107                // Field _thinking:Z
       187: aload_0
       188: aconst_null
       189: putfield      #93                 // Field _fish:Lext/mods/gameserver/model/records/Fish;
       192: aload_0
       193: iconst_0
       194: putfield      #66                 // Field _fishCurHp:I
       197: aload_0
       198: iconst_0
       199: putfield      #117                // Field _isUpperGrade:Z
       202: aload_0
       203: iconst_0
       204: putfield      #28                 // Field _lureId:I
       207: aload_0
       208: iconst_0
       209: putfield      #344                // Field _lureType:I
       212: aload_0
       213: iconst_0
       214: putfield      #198                // Field _isNightLure:Z
       217: aload_0
       218: getfield      #12                 // Field _loc:Lext/mods/gameserver/model/location/Location;
       221: invokevirtual #347                // Method ext/mods/gameserver/model/location/Location.clean:()V
       224: aload_0
       225: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       228: new           #350                // class ext/mods/gameserver/network/serverpackets/ExFishingEnd
       231: dup
       232: iload_1
       233: aload_0
       234: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       237: invokevirtual #352                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       240: invokespecial #355                // Method ext/mods/gameserver/network/serverpackets/ExFishingEnd."<init>":(ZI)V
       243: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       246: aload_0
       247: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       250: getstatic     #358                // Field ext/mods/gameserver/network/SystemMessageId.REEL_LINE_AND_STOP_FISHING:Lext/mods/gameserver/network/SystemMessageId;
       253: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       256: aload_0
       257: getfield      #18                 // Field _fisher:Lext/mods/gameserver/model/actor/Player;
       260: iconst_0
       261: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.setIsImmobilized:(Z)V
       264: aload_0
       265: getfield      #59                 // Field _lookingForFish:Ljava/util/concurrent/Future;
       268: ifnull        287
       271: aload_0
       272: getfield      #59                 // Field _lookingForFish:Ljava/util/concurrent/Future;
       275: iconst_0
       276: invokeinterface #361,  2          // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
       281: pop
       282: aload_0
       283: aconst_null
       284: putfield      #59                 // Field _lookingForFish:Ljava/util/concurrent/Future;
       287: aload_0
       288: getfield      #63                 // Field _fishCombat:Ljava/util/concurrent/Future;
       291: ifnull        310
       294: aload_0
       295: getfield      #63                 // Field _fishCombat:Ljava/util/concurrent/Future;
       298: iconst_0
       299: invokeinterface #361,  2          // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
       304: pop
       305: aload_0
       306: aconst_null
       307: putfield      #63                 // Field _fishCombat:Ljava/util/concurrent/Future;
       310: return
      Exception table:
         from    to  target type
            13    74    77   Class java/lang/Exception
      LineNumberTable:
        line 593: 0
        line 595: 4
        line 599: 13
        line 600: 43
        line 601: 54
        line 603: 64
        line 607: 74
        line 605: 77
        line 607: 78
        line 611: 81
        line 612: 91
        line 614: 108
        line 616: 122
        line 619: 135
        line 620: 142
        line 622: 152
        line 623: 157
        line 624: 162
        line 625: 167
        line 626: 172
        line 627: 177
        line 629: 182
        line 631: 187
        line 632: 192
        line 634: 197
        line 636: 202
        line 637: 207
        line 638: 212
        line 640: 217
        line 642: 224
        line 643: 246
        line 644: 256
        line 646: 264
        line 648: 271
        line 649: 282
        line 652: 287
        line 654: 294
        line 655: 305
        line 657: 310
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      31     2 spawn   Lext/mods/gameserver/model/spawn/Spawn;
            0     311     0  this   Lext/mods/gameserver/model/actor/container/player/FishingStance;
            0     311     1   win   Z
      StackMapTable: number_of_entries = 7
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 77
          stack = [ class java/lang/Exception ]
        frame_type = 3 /* same */
        frame_type = 40 /* same */
        frame_type = 12 /* same */
        frame_type = 16 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 134
        frame_type = 22 /* same */
}
SourceFile: "FishingStance.java"
BootstrapMethods:
  0: #448 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #441 ()V
      #442 REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/FishingStance.lambda$start$0:(JZZ)V
      #441 ()V
  1: #448 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #441 ()V
      #445 REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/FishingStance.lambda$start$1:()V
      #441 ()V
InnerClasses:
  public static final #460= #456 of #458; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
