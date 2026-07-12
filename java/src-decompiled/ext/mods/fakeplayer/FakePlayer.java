// Bytecode for: ext.mods.fakeplayer.FakePlayer
// File: ext\mods\fakeplayer\FakePlayer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/FakePlayer.class
  Last modified 9 de jul de 2026; size 18669 bytes
  MD5 checksum bce5dafea170fcc1f691e1f2c119defa
  Compiled from "FakePlayer.java"
public class ext.mods.fakeplayer.FakePlayer extends ext.mods.gameserver.model.actor.Player
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/FakePlayer
  super_class: #2                         // ext/mods/gameserver/model/actor/Player
  interfaces: 0, fields: 2, methods: 18, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Player."<init>":(ILext/mods/gameserver/model/actor/template/PlayerTemplate;Ljava/lang/String;Lext/mods/gameserver/model/actor/container/player/Appearance;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Player
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/PlayerTemplate;Ljava/lang/String;Lext/mods/gameserver/model/actor/container/player/Appearance;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Player
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/PlayerTemplate;Ljava/lang/String;Lext/mods/gameserver/model/actor/container/player/Appearance;)V
    #7 = Fieldref           #8.#9         // ext/mods/fakeplayer/FakePlayer._saveLoc:Lext/mods/gameserver/model/location/Location;
    #8 = Class              #10           // ext/mods/fakeplayer/FakePlayer
    #9 = NameAndType        #11:#12       // _saveLoc:Lext/mods/gameserver/model/location/Location;
   #10 = Utf8               ext/mods/fakeplayer/FakePlayer
   #11 = Utf8               _saveLoc
   #12 = Utf8               Lext/mods/gameserver/model/location/Location;
   #13 = Methodref          #14.#15       // ext/mods/commons/random/Rnd.get:(II)I
   #14 = Class              #16           // ext/mods/commons/random/Rnd
   #15 = NameAndType        #17:#18       // get:(II)I
   #16 = Utf8               ext/mods/commons/random/Rnd
   #17 = Utf8               get
   #18 = Utf8               (II)I
   #19 = Class              #20           // ext/mods/gameserver/model/location/Location
   #20 = Utf8               ext/mods/gameserver/model/location/Location
   #21 = Methodref          #8.#22        // ext/mods/fakeplayer/FakePlayer.getX:()I
   #22 = NameAndType        #23:#24       // getX:()I
   #23 = Utf8               getX
   #24 = Utf8               ()I
   #25 = Methodref          #8.#26        // ext/mods/fakeplayer/FakePlayer.getY:()I
   #26 = NameAndType        #27:#24       // getY:()I
   #27 = Utf8               getY
   #28 = Methodref          #8.#29        // ext/mods/fakeplayer/FakePlayer.getZ:()I
   #29 = NameAndType        #30:#24       // getZ:()I
   #30 = Utf8               getZ
   #31 = Methodref          #19.#32       // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #32 = NameAndType        #5:#33        // "<init>":(III)V
   #33 = Utf8               (III)V
   #34 = Methodref          #8.#35        // ext/mods/fakeplayer/FakePlayer.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
   #35 = NameAndType        #36:#37       // getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
   #36 = Utf8               getMove
   #37 = Utf8               ()Lext/mods/gameserver/model/actor/move/PlayerMove;
   #38 = Methodref          #39.#40       // ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
   #39 = Class              #41           // ext/mods/gameserver/model/actor/move/PlayerMove
   #40 = NameAndType        #42:#43       // stop:()V
   #41 = Utf8               ext/mods/gameserver/model/actor/move/PlayerMove
   #42 = Utf8               stop
   #43 = Utf8               ()V
   #44 = Methodref          #8.#45        // ext/mods/fakeplayer/FakePlayer.abortAll:(Z)V
   #45 = NameAndType        #46:#47       // abortAll:(Z)V
   #46 = Utf8               abortAll
   #47 = Utf8               (Z)V
   #48 = Methodref          #8.#49        // ext/mods/fakeplayer/FakePlayer.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #49 = NameAndType        #50:#51       // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #50 = Utf8               getAI
   #51 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #52 = Methodref          #53.#54       // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
   #53 = Class              #55           // ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #54 = NameAndType        #56:#43       // tryToIdle:()V
   #55 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #56 = Utf8               tryToIdle
   #57 = Class              #58           // ext/mods/gameserver/network/serverpackets/TeleportToLocation
   #58 = Utf8               ext/mods/gameserver/network/serverpackets/TeleportToLocation
   #59 = Methodref          #57.#60       // ext/mods/gameserver/network/serverpackets/TeleportToLocation."<init>":(Lext/mods/gameserver/model/WorldObject;IIIZ)V
   #60 = NameAndType        #5:#61        // "<init>":(Lext/mods/gameserver/model/WorldObject;IIIZ)V
   #61 = Utf8               (Lext/mods/gameserver/model/WorldObject;IIIZ)V
   #62 = Methodref          #8.#63        // ext/mods/fakeplayer/FakePlayer.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #63 = NameAndType        #64:#65       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #64 = Utf8               broadcastPacket
   #65 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #66 = Methodref          #8.#67        // ext/mods/fakeplayer/FakePlayer.decayMe:()V
   #67 = NameAndType        #68:#43       // decayMe:()V
   #68 = Utf8               decayMe
   #69 = Methodref          #8.#70        // ext/mods/fakeplayer/FakePlayer.setXYZ:(III)V
   #70 = NameAndType        #71:#33       // setXYZ:(III)V
   #71 = Utf8               setXYZ
   #72 = Methodref          #8.#73        // ext/mods/fakeplayer/FakePlayer.onTeleported:()V
   #73 = NameAndType        #74:#43       // onTeleported:()V
   #74 = Utf8               onTeleported
   #75 = Methodref          #8.#76        // ext/mods/fakeplayer/FakePlayer.spawnMe:()V
   #76 = NameAndType        #77:#43       // spawnMe:()V
   #77 = Utf8               spawnMe
   #78 = Methodref          #8.#79        // ext/mods/fakeplayer/FakePlayer.revalidateZone:(Z)V
   #79 = NameAndType        #80:#47       // revalidateZone:(Z)V
   #80 = Utf8               revalidateZone
   #81 = Methodref          #8.#82        // ext/mods/fakeplayer/FakePlayer.isDead:()Z
   #82 = NameAndType        #83:#84       // isDead:()Z
   #83 = Utf8               isDead
   #84 = Utf8               ()Z
   #85 = Methodref          #8.#86        // ext/mods/fakeplayer/FakePlayer.isOutOfControl:()Z
   #86 = NameAndType        #87:#84       // isOutOfControl:()Z
   #87 = Utf8               isOutOfControl
   #88 = Fieldref           #89.#90       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #89 = Class              #91           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #90 = NameAndType        #92:#93       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #91 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #92 = Utf8               STATIC_PACKET
   #93 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #94 = Methodref          #8.#95        // ext/mods/fakeplayer/FakePlayer.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #95 = NameAndType        #96:#65       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #96 = Utf8               sendPacket
   #97 = Methodref          #8.#98        // ext/mods/fakeplayer/FakePlayer.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
   #98 = NameAndType        #99:#100      // isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
   #99 = Utf8               isSkillDisabled
  #100 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #101 = Methodref          #102.#103     // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #102 = Class              #104          // ext/mods/gameserver/skills/L2Skill
  #103 = NameAndType        #105:#106     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #104 = Utf8               ext/mods/gameserver/skills/L2Skill
  #105 = Utf8               getSkillType
  #106 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #107 = Methodref          #8.#108       // ext/mods/fakeplayer/FakePlayer.isFishing:()Z
  #108 = NameAndType        #109:#84      // isFishing:()Z
  #109 = Utf8               isFishing
  #110 = Fieldref           #111.#112     // ext/mods/gameserver/enums/skills/SkillType.PUMPING:Lext/mods/gameserver/enums/skills/SkillType;
  #111 = Class              #113          // ext/mods/gameserver/enums/skills/SkillType
  #112 = NameAndType        #114:#115     // PUMPING:Lext/mods/gameserver/enums/skills/SkillType;
  #113 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #114 = Utf8               PUMPING
  #115 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #116 = Fieldref           #111.#117     // ext/mods/gameserver/enums/skills/SkillType.REELING:Lext/mods/gameserver/enums/skills/SkillType;
  #117 = NameAndType        #118:#115     // REELING:Lext/mods/gameserver/enums/skills/SkillType;
  #118 = Utf8               REELING
  #119 = Fieldref           #111.#120     // ext/mods/gameserver/enums/skills/SkillType.FISHING:Lext/mods/gameserver/enums/skills/SkillType;
  #120 = NameAndType        #121:#115     // FISHING:Lext/mods/gameserver/enums/skills/SkillType;
  #121 = Utf8               FISHING
  #122 = Methodref          #8.#123       // ext/mods/fakeplayer/FakePlayer.isInObserverMode:()Z
  #123 = NameAndType        #124:#84      // isInObserverMode:()Z
  #124 = Utf8               isInObserverMode
  #125 = Methodref          #8.#126       // ext/mods/fakeplayer/FakePlayer.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #126 = NameAndType        #127:#128     // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #127 = Utf8               getCast
  #128 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #129 = Methodref          #130.#131     // ext/mods/gameserver/model/actor/cast/PlayerCast.canAbortCast:()Z
  #130 = Class              #132          // ext/mods/gameserver/model/actor/cast/PlayerCast
  #131 = NameAndType        #133:#84      // canAbortCast:()Z
  #132 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #133 = Utf8               canAbortCast
  #134 = Methodref          #8.#135       // ext/mods/fakeplayer/FakePlayer.isSitting:()Z
  #135 = NameAndType        #136:#84      // isSitting:()Z
  #136 = Utf8               isSitting
  #137 = Methodref          #102.#138     // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
  #138 = NameAndType        #139:#84      // isToggle:()Z
  #139 = Utf8               isToggle
  #140 = Methodref          #102.#141     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #141 = NameAndType        #142:#24      // getId:()I
  #142 = Utf8               getId
  #143 = Methodref          #8.#144       // ext/mods/fakeplayer/FakePlayer.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #144 = NameAndType        #145:#146     // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #145 = Utf8               getFirstEffect
  #146 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #147 = Methodref          #148.#149     // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #148 = Class              #150          // ext/mods/gameserver/skills/AbstractEffect
  #149 = NameAndType        #151:#43      // exit:()V
  #150 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #151 = Utf8               exit
  #152 = Methodref          #8.#153       // ext/mods/fakeplayer/FakePlayer.isFakeDeath:()Z
  #153 = NameAndType        #154:#84      // isFakeDeath:()Z
  #154 = Utf8               isFakeDeath
  #155 = Methodref          #102.#156     // ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #156 = NameAndType        #157:#158     // getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #157 = Utf8               getTargetType
  #158 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #159 = Fieldref           #160.#161     // ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #160 = Class              #162          // ext/mods/gameserver/enums/skills/SkillTargetType
  #161 = NameAndType        #163:#164     // GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #162 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #163 = Utf8               GROUND
  #164 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #165 = Fieldref           #8.#166       // ext/mods/fakeplayer/FakePlayer.LOGGER:Lext/mods/commons/logging/CLogger;
  #166 = NameAndType        #167:#168     // LOGGER:Lext/mods/commons/logging/CLogger;
  #167 = Utf8               LOGGER
  #168 = Utf8               Lext/mods/commons/logging/CLogger;
  #169 = Methodref          #102.#170     // ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
  #170 = NameAndType        #171:#172     // getName:()Ljava/lang/String;
  #171 = Utf8               getName
  #172 = Utf8               ()Ljava/lang/String;
  #173 = Methodref          #8.#170       // ext/mods/fakeplayer/FakePlayer.getName:()Ljava/lang/String;
  #174 = InvokeDynamic      #0:#175       // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #175 = NameAndType        #176:#177     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #176 = Utf8               makeConcatWithConstants
  #177 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #178 = Methodref          #179.#180     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #179 = Class              #181          // ext/mods/commons/logging/CLogger
  #180 = NameAndType        #182:#183     // info:(Ljava/lang/Object;)V
  #181 = Utf8               ext/mods/commons/logging/CLogger
  #182 = Utf8               info
  #183 = Utf8               (Ljava/lang/Object;)V
  #184 = Fieldref           #185.#186     // ext/mods/fakeplayer/FakePlayer$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
  #185 = Class              #187          // ext/mods/fakeplayer/FakePlayer$1
  #186 = NameAndType        #188:#189     // $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
  #187 = Utf8               ext/mods/fakeplayer/FakePlayer$1
  #188 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType
  #189 = Utf8               [I
  #190 = Methodref          #160.#191     // ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
  #191 = NameAndType        #192:#24      // ordinal:()I
  #192 = Utf8               ordinal
  #193 = Methodref          #8.#194       // ext/mods/fakeplayer/FakePlayer.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #194 = NameAndType        #195:#196     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #195 = Utf8               getSummon
  #196 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #197 = Methodref          #8.#198       // ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #198 = NameAndType        #199:#200     // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #199 = Utf8               getTarget
  #200 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #201 = Class              #202          // ext/mods/gameserver/model/actor/instance/Door
  #202 = Utf8               ext/mods/gameserver/model/actor/instance/Door
  #203 = Methodref          #201.#204     // ext/mods/gameserver/model/actor/instance/Door.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #204 = NameAndType        #205:#206     // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #205 = Utf8               isAttackableBy
  #206 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #207 = Methodref          #201.#208     // ext/mods/gameserver/model/actor/instance/Door.isUnlockable:()Z
  #208 = NameAndType        #209:#84      // isUnlockable:()Z
  #209 = Utf8               isUnlockable
  #210 = Fieldref           #111.#211     // ext/mods/gameserver/enums/skills/SkillType.UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
  #211 = NameAndType        #212:#115     // UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
  #212 = Utf8               UNLOCK
  #213 = Methodref          #8.#214       // ext/mods/fakeplayer/FakePlayer.isInDuel:()Z
  #214 = NameAndType        #215:#84      // isInDuel:()Z
  #215 = Utf8               isInDuel
  #216 = Class              #217          // ext/mods/gameserver/model/actor/Playable
  #217 = Utf8               ext/mods/gameserver/model/actor/Playable
  #218 = Methodref          #219.#220     // ext/mods/gameserver/model/WorldObject.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #219 = Class              #221          // ext/mods/gameserver/model/WorldObject
  #220 = NameAndType        #222:#223     // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #221 = Utf8               ext/mods/gameserver/model/WorldObject
  #222 = Utf8               getActingPlayer
  #223 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #224 = Methodref          #2.#225       // ext/mods/gameserver/model/actor/Player.getDuelId:()I
  #225 = NameAndType        #226:#24      // getDuelId:()I
  #226 = Utf8               getDuelId
  #227 = Methodref          #8.#225       // ext/mods/fakeplayer/FakePlayer.getDuelId:()I
  #228 = Methodref          #102.#229     // ext/mods/gameserver/skills/L2Skill.isSiegeSummonSkill:()Z
  #229 = NameAndType        #230:#84      // isSiegeSummonSkill:()Z
  #230 = Utf8               isSiegeSummonSkill
  #231 = Methodref          #232.#233     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #232 = Class              #234          // ext/mods/gameserver/data/manager/CastleManager
  #233 = NameAndType        #235:#236     // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #234 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #235 = Utf8               getInstance
  #236 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #237 = Methodref          #232.#238     // ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #238 = NameAndType        #239:#240     // getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #239 = Utf8               getActiveSiege
  #240 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #241 = Methodref          #8.#242       // ext/mods/fakeplayer/FakePlayer.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #242 = NameAndType        #243:#244     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #243 = Utf8               getClan
  #244 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #245 = Fieldref           #246.#247     // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #246 = Class              #248          // ext/mods/gameserver/enums/SiegeSide
  #247 = NameAndType        #249:#250     // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #248 = Utf8               ext/mods/gameserver/enums/SiegeSide
  #249 = Utf8               ATTACKER
  #250 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
  #251 = Methodref          #252.#253     // ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #252 = Class              #254          // ext/mods/gameserver/model/residence/castle/Siege
  #253 = NameAndType        #255:#256     // checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #254 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #255 = Utf8               checkSide
  #256 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #257 = Fieldref           #258.#259     // ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
  #258 = Class              #260          // ext/mods/gameserver/enums/ZoneId
  #259 = NameAndType        #261:#262     // CASTLE:Lext/mods/gameserver/enums/ZoneId;
  #260 = Utf8               ext/mods/gameserver/enums/ZoneId
  #261 = Utf8               CASTLE
  #262 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #263 = Methodref          #8.#264       // ext/mods/fakeplayer/FakePlayer.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #264 = NameAndType        #265:#266     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #265 = Utf8               isInsideZone
  #266 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #267 = Fieldref           #268.#269     // ext/mods/gameserver/network/SystemMessageId.NOT_CALL_PET_FROM_THIS_LOCATION:Lext/mods/gameserver/network/SystemMessageId;
  #268 = Class              #270          // ext/mods/gameserver/network/SystemMessageId
  #269 = NameAndType        #271:#272     // NOT_CALL_PET_FROM_THIS_LOCATION:Lext/mods/gameserver/network/SystemMessageId;
  #270 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #271 = Utf8               NOT_CALL_PET_FROM_THIS_LOCATION
  #272 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #273 = Methodref          #274.#275     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #274 = Class              #276          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #275 = NameAndType        #277:#278     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #276 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #277 = Utf8               getSystemMessage
  #278 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #279 = Methodref          #280.#281     // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #280 = Class              #282          // ext/mods/gameserver/data/manager/SevenSignsManager
  #281 = NameAndType        #235:#283     // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #282 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
  #283 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #284 = Methodref          #280.#285     // ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
  #285 = NameAndType        #286:#84      // isSealValidationPeriod:()Z
  #286 = Utf8               isSealValidationPeriod
  #287 = Fieldref           #288.#289     // ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
  #288 = Class              #290          // ext/mods/gameserver/enums/SealType
  #289 = NameAndType        #291:#292     // STRIFE:Lext/mods/gameserver/enums/SealType;
  #290 = Utf8               ext/mods/gameserver/enums/SealType
  #291 = Utf8               STRIFE
  #292 = Utf8               Lext/mods/gameserver/enums/SealType;
  #293 = Methodref          #280.#294     // ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #294 = NameAndType        #295:#296     // getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #295 = Utf8               getSealOwner
  #296 = Utf8               (Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #297 = Fieldref           #298.#299     // ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
  #298 = Class              #300          // ext/mods/gameserver/enums/CabalType
  #299 = NameAndType        #301:#302     // DAWN:Lext/mods/gameserver/enums/CabalType;
  #300 = Utf8               ext/mods/gameserver/enums/CabalType
  #301 = Utf8               DAWN
  #302 = Utf8               Lext/mods/gameserver/enums/CabalType;
  #303 = Methodref          #8.#304       // ext/mods/fakeplayer/FakePlayer.getObjectId:()I
  #304 = NameAndType        #305:#24      // getObjectId:()I
  #305 = Utf8               getObjectId
  #306 = Methodref          #280.#307     // ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
  #307 = NameAndType        #308:#309     // getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
  #308 = Utf8               getPlayerCabal
  #309 = Utf8               (I)Lext/mods/gameserver/enums/CabalType;
  #310 = Fieldref           #298.#311     // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
  #311 = NameAndType        #312:#302     // DUSK:Lext/mods/gameserver/enums/CabalType;
  #312 = Utf8               DUSK
  #313 = Fieldref           #268.#314     // ext/mods/gameserver/network/SystemMessageId.SEAL_OF_STRIFE_FORBIDS_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
  #314 = NameAndType        #315:#272     // SEAL_OF_STRIFE_FORBIDS_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
  #315 = Utf8               SEAL_OF_STRIFE_FORBIDS_SUMMONING
  #316 = Methodref          #8.#317       // ext/mods/fakeplayer/FakePlayer.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #317 = NameAndType        #96:#318      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #318 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #319 = Class              #320          // ext/mods/gameserver/model/actor/Creature
  #320 = Utf8               ext/mods/gameserver/model/actor/Creature
  #321 = Methodref          #102.#322     // ext/mods/gameserver/skills/L2Skill.checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #322 = NameAndType        #323:#324     // checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #323 = Utf8               checkCondition
  #324 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #325 = Methodref          #102.#326     // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
  #326 = NameAndType        #327:#84      // isOffensive:()Z
  #327 = Utf8               isOffensive
  #328 = Fieldref           #258.#329     // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
  #329 = NameAndType        #330:#262     // PEACE:Lext/mods/gameserver/enums/ZoneId;
  #330 = Utf8               PEACE
  #331 = Fieldref           #268.#332     // ext/mods/gameserver/network/SystemMessageId.TARGET_IN_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #332 = NameAndType        #333:#272     // TARGET_IN_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #333 = Utf8               TARGET_IN_PEACEZONE
  #334 = Methodref          #8.#335       // ext/mods/fakeplayer/FakePlayer.isInOlympiadMode:()Z
  #335 = NameAndType        #336:#84      // isInOlympiadMode:()Z
  #336 = Utf8               isInOlympiadMode
  #337 = Methodref          #8.#338       // ext/mods/fakeplayer/FakePlayer.isOlympiadStart:()Z
  #338 = NameAndType        #339:#84      // isOlympiadStart:()Z
  #339 = Utf8               isOlympiadStart
  #340 = Methodref          #219.#204     // ext/mods/gameserver/model/WorldObject.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #341 = Methodref          #8.#342       // ext/mods/fakeplayer/FakePlayer.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
  #342 = NameAndType        #343:#344     // getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
  #343 = Utf8               getAccessLevel
  #344 = Utf8               ()Lext/mods/gameserver/model/AccessLevel;
  #345 = Methodref          #346.#347     // ext/mods/gameserver/model/AccessLevel.canGiveDamage:()Z
  #346 = Class              #348          // ext/mods/gameserver/model/AccessLevel
  #347 = NameAndType        #349:#84      // canGiveDamage:()Z
  #348 = Utf8               ext/mods/gameserver/model/AccessLevel
  #349 = Utf8               canGiveDamage
  #350 = Methodref          #102.#351     // ext/mods/gameserver/skills/L2Skill.getCastRange:()I
  #351 = NameAndType        #352:#24      // getCastRange:()I
  #352 = Utf8               getCastRange
  #353 = Methodref          #8.#354       // ext/mods/fakeplayer/FakePlayer.getCollisionRadius:()D
  #354 = NameAndType        #355:#356     // getCollisionRadius:()D
  #355 = Utf8               getCollisionRadius
  #356 = Utf8               ()D
  #357 = Methodref          #8.#358       // ext/mods/fakeplayer/FakePlayer.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #358 = NameAndType        #359:#360     // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #359 = Utf8               isIn3DRadius
  #360 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #361 = Fieldref           #268.#362     // ext/mods/gameserver/network/SystemMessageId.TARGET_TOO_FAR:Lext/mods/gameserver/network/SystemMessageId;
  #362 = NameAndType        #363:#272     // TARGET_TOO_FAR:Lext/mods/gameserver/network/SystemMessageId;
  #363 = Utf8               TARGET_TOO_FAR
  #364 = Class              #365          // ext/mods/gameserver/model/actor/instance/Monster
  #365 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #366 = Fieldref           #185.#367     // ext/mods/fakeplayer/FakePlayer$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #367 = NameAndType        #368:#189     // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #368 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
  #369 = Methodref          #111.#191     // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
  #370 = Fieldref           #111.#371     // ext/mods/gameserver/enums/skills/SkillType.SPOIL:Lext/mods/gameserver/enums/skills/SkillType;
  #371 = NameAndType        #372:#115     // SPOIL:Lext/mods/gameserver/enums/skills/SkillType;
  #372 = Utf8               SPOIL
  #373 = Fieldref           #111.#374     // ext/mods/gameserver/enums/skills/SkillType.SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #374 = NameAndType        #375:#115     // SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #375 = Utf8               SWEEP
  #376 = Class              #377          // ext/mods/gameserver/model/actor/Attackable
  #377 = Utf8               ext/mods/gameserver/model/actor/Attackable
  #378 = Methodref          #376.#82      // ext/mods/gameserver/model/actor/Attackable.isDead:()Z
  #379 = Fieldref           #111.#380     // ext/mods/gameserver/enums/skills/SkillType.DRAIN_SOUL:Lext/mods/gameserver/enums/skills/SkillType;
  #380 = NameAndType        #381:#115     // DRAIN_SOUL:Lext/mods/gameserver/enums/skills/SkillType;
  #381 = Utf8               DRAIN_SOUL
  #382 = Fieldref           #268.#383     // ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
  #383 = NameAndType        #384:#272     // TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
  #384 = Utf8               TARGET_IS_INCORRECT
  #385 = Fieldref           #160.#386     // ext/mods/gameserver/enums/skills/SkillTargetType.HOLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #386 = NameAndType        #387:#164     // HOLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #387 = Utf8               HOLY
  #388 = Fieldref           #8.#389       // ext/mods/fakeplayer/FakePlayer._ai:Lext/mods/fakeplayer/ai/FakePlayerAI;
  #389 = NameAndType        #390:#391     // _ai:Lext/mods/fakeplayer/ai/FakePlayerAI;
  #390 = Utf8               _ai
  #391 = Utf8               Lext/mods/fakeplayer/ai/FakePlayerAI;
  #392 = Methodref          #2.#393       // ext/mods/gameserver/model/actor/Player.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #393 = NameAndType        #394:#206     // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #394 = Utf8               doDie
  #395 = Methodref          #8.#396       // ext/mods/fakeplayer/FakePlayer.isMounted:()Z
  #396 = NameAndType        #397:#84      // isMounted:()Z
  #397 = Utf8               isMounted
  #398 = Methodref          #8.#399       // ext/mods/fakeplayer/FakePlayer.stopFeed:()V
  #399 = NameAndType        #400:#43      // stopFeed:()V
  #400 = Utf8               stopFeed
  #401 = Methodref          #8.#402       // ext/mods/fakeplayer/FakePlayer.clearCharges:()V
  #402 = NameAndType        #403:#43      // clearCharges:()V
  #403 = Utf8               clearCharges
  #404 = Methodref          #8.#405       // ext/mods/fakeplayer/FakePlayer.stopFakeDeath:(Z)V
  #405 = NameAndType        #406:#47      // stopFakeDeath:(Z)V
  #406 = Utf8               stopFakeDeath
  #407 = Methodref          #319.#220     // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #408 = Methodref          #409.#410     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #409 = Class              #411          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #410 = NameAndType        #235:#412     // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #411 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #412 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #413 = Methodref          #409.#414     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onKill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #414 = NameAndType        #415:#416     // onKill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #415 = Utf8               onKill
  #416 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #417 = Methodref          #418.#419     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #418 = Class              #420          // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #419 = NameAndType        #235:#421     // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #420 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #421 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #422 = Methodref          #418.#414     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onKill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #423 = Methodref          #424.#425     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #424 = Class              #426          // ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #425 = NameAndType        #235:#427     // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #426 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #427 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #428 = Methodref          #424.#414     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onKill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #429 = Methodref          #430.#431     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #430 = Class              #432          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #431 = NameAndType        #235:#433     // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #432 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #433 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #434 = Methodref          #430.#414     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onKill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #435 = Methodref          #436.#437     // ext/mods/playergod/PlayerGodManager.getInstance:()Lext/mods/playergod/PlayerGodManager;
  #436 = Class              #438          // ext/mods/playergod/PlayerGodManager
  #437 = NameAndType        #235:#439     // getInstance:()Lext/mods/playergod/PlayerGodManager;
  #438 = Utf8               ext/mods/playergod/PlayerGodManager
  #439 = Utf8               ()Lext/mods/playergod/PlayerGodManager;
  #440 = Methodref          #436.#441     // ext/mods/playergod/PlayerGodManager.onKill:(Lext/mods/gameserver/model/actor/Player;)V
  #441 = NameAndType        #415:#442     // onKill:(Lext/mods/gameserver/model/actor/Player;)V
  #442 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #443 = Methodref          #8.#444       // ext/mods/fakeplayer/FakePlayer.setExpBeforeDeath:(J)V
  #444 = NameAndType        #445:#446     // setExpBeforeDeath:(J)V
  #445 = Utf8               setExpBeforeDeath
  #446 = Utf8               (J)V
  #447 = InvokeDynamic      #1:#448       // #1:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
  #448 = NameAndType        #449:#450     // test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
  #449 = Utf8               test
  #450 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
  #451 = InvokeDynamic      #2:#452       // #2:accept:()Ljava/util/function/Consumer;
  #452 = NameAndType        #453:#454     // accept:()Ljava/util/function/Consumer;
  #453 = Utf8               accept
  #454 = Utf8               ()Ljava/util/function/Consumer;
  #455 = Methodref          #8.#456       // ext/mods/fakeplayer/FakePlayer.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #456 = NameAndType        #457:#458     // forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #457 = Utf8               forEachKnownType
  #458 = Utf8               (Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #459 = Methodref          #8.#460       // ext/mods/fakeplayer/FakePlayer.getFusionSkill:()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
  #460 = NameAndType        #461:#462     // getFusionSkill:()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
  #461 = Utf8               getFusionSkill
  #462 = Utf8               ()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
  #463 = Methodref          #130.#40      // ext/mods/gameserver/model/actor/cast/PlayerCast.stop:()V
  #464 = Methodref          #8.#465       // ext/mods/fakeplayer/FakePlayer.calculateDeathPenaltyBuffLevel:(Lext/mods/gameserver/model/actor/Creature;)V
  #465 = NameAndType        #466:#467     // calculateDeathPenaltyBuffLevel:(Lext/mods/gameserver/model/actor/Creature;)V
  #466 = Utf8               calculateDeathPenaltyBuffLevel
  #467 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #468 = Methodref          #8.#469       // ext/mods/fakeplayer/FakePlayer.isPhoenixBlessed:()Z
  #469 = NameAndType        #470:#84      // isPhoenixBlessed:()Z
  #470 = Utf8               isPhoenixBlessed
  #471 = Methodref          #8.#472       // ext/mods/fakeplayer/FakePlayer.reviveRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Z)V
  #472 = NameAndType        #473:#474     // reviveRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Z)V
  #473 = Utf8               reviveRequest
  #474 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Z)V
  #475 = Methodref          #476.#477     // ext/mods/gameserver/taskmanager/WaterTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/WaterTaskManager;
  #476 = Class              #478          // ext/mods/gameserver/taskmanager/WaterTaskManager
  #477 = NameAndType        #235:#479     // getInstance:()Lext/mods/gameserver/taskmanager/WaterTaskManager;
  #478 = Utf8               ext/mods/gameserver/taskmanager/WaterTaskManager
  #479 = Utf8               ()Lext/mods/gameserver/taskmanager/WaterTaskManager;
  #480 = Methodref          #476.#481     // ext/mods/gameserver/taskmanager/WaterTaskManager.remove:(Lext/mods/gameserver/model/actor/Player;)V
  #481 = NameAndType        #482:#442     // remove:(Lext/mods/gameserver/model/actor/Player;)V
  #482 = Utf8               remove
  #483 = Methodref          #8.#484       // ext/mods/fakeplayer/FakePlayer.disableBeastShots:()V
  #484 = NameAndType        #485:#43      // disableBeastShots:()V
  #485 = Utf8               disableBeastShots
  #486 = Methodref          #487.#488     // ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #487 = Class              #489          // ext/mods/gameserver/data/manager/AntiFeedManager
  #488 = NameAndType        #235:#490     // getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #489 = Utf8               ext/mods/gameserver/data/manager/AntiFeedManager
  #490 = Utf8               ()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #491 = Methodref          #487.#492     // ext/mods/gameserver/data/manager/AntiFeedManager.setLastDeathTime:(I)V
  #492 = NameAndType        #493:#494     // setLastDeathTime:(I)V
  #493 = Utf8               setLastDeathTime
  #494 = Utf8               (I)V
  #495 = Methodref          #8.#496       // ext/mods/fakeplayer/FakePlayer.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #496 = NameAndType        #497:#498     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #497 = Utf8               getClassId
  #498 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #499 = Methodref          #500.#501     // ext/mods/fakeplayer/helper/FakePlayerHelpers.getAIbyClassId:(Lext/mods/gameserver/enums/actors/ClassId;)Ljava/lang/Class;
  #500 = Class              #502          // ext/mods/fakeplayer/helper/FakePlayerHelpers
  #501 = NameAndType        #503:#504     // getAIbyClassId:(Lext/mods/gameserver/enums/actors/ClassId;)Ljava/lang/Class;
  #502 = Utf8               ext/mods/fakeplayer/helper/FakePlayerHelpers
  #503 = Utf8               getAIbyClassId
  #504 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Ljava/lang/Class;
  #505 = Class              #506          // java/lang/Class
  #506 = Utf8               java/lang/Class
  #507 = Methodref          #505.#508     // java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #508 = NameAndType        #509:#510     // getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #509 = Utf8               getConstructor
  #510 = Utf8               ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #511 = Class              #512          // java/lang/Object
  #512 = Utf8               java/lang/Object
  #513 = Methodref          #514.#515     // java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #514 = Class              #516          // java/lang/reflect/Constructor
  #515 = NameAndType        #517:#518     // newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #516 = Utf8               java/lang/reflect/Constructor
  #517 = Utf8               newInstance
  #518 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
  #519 = Class              #520          // ext/mods/fakeplayer/ai/FakePlayerAI
  #520 = Utf8               ext/mods/fakeplayer/ai/FakePlayerAI
  #521 = Methodref          #8.#522       // ext/mods/fakeplayer/FakePlayer.setAi:(Lext/mods/fakeplayer/ai/FakePlayerAI;)V
  #522 = NameAndType        #523:#524     // setAi:(Lext/mods/fakeplayer/ai/FakePlayerAI;)V
  #523 = Utf8               setAi
  #524 = Utf8               (Lext/mods/fakeplayer/ai/FakePlayerAI;)V
  #525 = Class              #526          // java/lang/Exception
  #526 = Utf8               java/lang/Exception
  #527 = Methodref          #525.#528     // java/lang/Exception.printStackTrace:()V
  #528 = NameAndType        #529:#43      // printStackTrace:()V
  #529 = Utf8               printStackTrace
  #530 = Methodref          #8.#531       // ext/mods/fakeplayer/FakePlayer.isConfused:()Z
  #531 = NameAndType        #532:#84      // isConfused:()Z
  #532 = Utf8               isConfused
  #533 = Methodref          #2.#335       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #534 = Methodref          #8.#535       // ext/mods/fakeplayer/FakePlayer.getOlympiadGameId:()I
  #535 = NameAndType        #536:#24      // getOlympiadGameId:()I
  #536 = Utf8               getOlympiadGameId
  #537 = Methodref          #2.#535       // ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
  #538 = Methodref          #319.#204     // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #539 = Methodref          #540.#541     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #540 = Class              #542          // ext/mods/gameserver/geoengine/GeoEngine
  #541 = NameAndType        #235:#543     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #542 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #543 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #544 = Methodref          #540.#545     // ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #545 = NameAndType        #546:#547     // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #546 = Utf8               canSeeTarget
  #547 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #548 = Methodref          #319.#22      // ext/mods/gameserver/model/actor/Creature.getX:()I
  #549 = Methodref          #319.#26      // ext/mods/gameserver/model/actor/Creature.getY:()I
  #550 = Methodref          #319.#29      // ext/mods/gameserver/model/actor/Creature.getZ:()I
  #551 = Methodref          #540.#552     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
  #552 = NameAndType        #553:#554     // canMoveToTarget:(IIIIII)Z
  #553 = Utf8               canMoveToTarget
  #554 = Utf8               (IIIIII)Z
  #555 = Methodref          #8.#556       // ext/mods/fakeplayer/FakePlayer.isArcher:()Z
  #556 = NameAndType        #557:#84      // isArcher:()Z
  #557 = Utf8               isArcher
  #558 = Methodref          #559.#560     // ext/mods/commons/math/MathUtil.calculateDistance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)D
  #559 = Class              #561          // ext/mods/commons/math/MathUtil
  #560 = NameAndType        #562:#563     // calculateDistance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)D
  #561 = Utf8               ext/mods/commons/math/MathUtil
  #562 = Utf8               calculateDistance
  #563 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)D
  #564 = Methodref          #8.#565       // ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #565 = NameAndType        #566:#567     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #566 = Utf8               getStatus
  #567 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #568 = Methodref          #569.#570     // ext/mods/gameserver/model/actor/status/PlayerStatus.getPhysicalAttackRange:()I
  #569 = Class              #571          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #570 = NameAndType        #572:#24      // getPhysicalAttackRange:()I
  #571 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #572 = Utf8               getPhysicalAttackRange
  #573 = Double             0.5d
  #575 = Methodref          #576.#577     // java/lang/Math.sqrt:(D)D
  #576 = Class              #578          // java/lang/Math
  #577 = NameAndType        #579:#580     // sqrt:(D)D
  #578 = Utf8               java/lang/Math
  #579 = Utf8               sqrt
  #580 = Utf8               (D)D
  #581 = Double             300.0d
  #583 = Methodref          #540.#584     // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
  #584 = NameAndType        #585:#586     // getHeight:(III)S
  #585 = Utf8               getHeight
  #586 = Utf8               (III)S
  #587 = Methodref          #53.#588      // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #588 = NameAndType        #589:#590     // tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #589 = Utf8               tryToMoveTo
  #590 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #591 = Methodref          #8.#592       // ext/mods/fakeplayer/FakePlayer.isDagger:()Z
  #592 = NameAndType        #593:#84      // isDagger:()Z
  #593 = Utf8               isDagger
  #594 = Methodref          #14.#595      // ext/mods/commons/random/Rnd.get:(I)I
  #595 = NameAndType        #17:#596      // get:(I)I
  #596 = Utf8               (I)I
  #597 = Methodref          #576.#598     // java/lang/Math.toRadians:(D)D
  #598 = NameAndType        #599:#580     // toRadians:(D)D
  #599 = Utf8               toRadians
  #600 = Methodref          #576.#601     // java/lang/Math.cos:(D)D
  #601 = NameAndType        #602:#580     // cos:(D)D
  #602 = Utf8               cos
  #603 = Methodref          #576.#604     // java/lang/Math.sin:(D)D
  #604 = NameAndType        #605:#580     // sin:(D)D
  #605 = Utf8               sin
  #606 = Methodref          #53.#607      // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #607 = NameAndType        #608:#467     // tryToAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #608 = Utf8               tryToAttack
  #609 = Methodref          #8.#610       // ext/mods/fakeplayer/FakePlayer.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #610 = NameAndType        #611:#612     // getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #611 = Utf8               getActiveWeaponItem
  #612 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
  #613 = Methodref          #8.#614       // ext/mods/fakeplayer/FakePlayer.getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
  #614 = NameAndType        #615:#616     // getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
  #615 = Utf8               getAttackType
  #616 = Utf8               ()Lext/mods/gameserver/enums/items/WeaponType;
  #617 = Fieldref           #618.#619     // ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
  #618 = Class              #620          // ext/mods/gameserver/enums/items/WeaponType
  #619 = NameAndType        #621:#622     // BOW:Lext/mods/gameserver/enums/items/WeaponType;
  #620 = Utf8               ext/mods/gameserver/enums/items/WeaponType
  #621 = Utf8               BOW
  #622 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
  #623 = Fieldref           #618.#624     // ext/mods/gameserver/enums/items/WeaponType.DAGGER:Lext/mods/gameserver/enums/items/WeaponType;
  #624 = NameAndType        #625:#622     // DAGGER:Lext/mods/gameserver/enums/items/WeaponType;
  #625 = Utf8               DAGGER
  #626 = Methodref          #8.#627       // ext/mods/fakeplayer/FakePlayer.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #627 = NameAndType        #628:#629     // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #628 = Utf8               getAppearance
  #629 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #630 = Methodref          #631.#632     // ext/mods/gameserver/model/actor/container/player/Appearance.getSex:()Lext/mods/gameserver/enums/actors/Sex;
  #631 = Class              #633          // ext/mods/gameserver/model/actor/container/player/Appearance
  #632 = NameAndType        #634:#635     // getSex:()Lext/mods/gameserver/enums/actors/Sex;
  #633 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
  #634 = Utf8               getSex
  #635 = Utf8               ()Lext/mods/gameserver/enums/actors/Sex;
  #636 = Methodref          #637.#638     // ext/mods/fakeplayer/FakePlayerNames.releaseName:(Ljava/lang/String;Lext/mods/gameserver/enums/actors/Sex;)V
  #637 = Class              #639          // ext/mods/fakeplayer/FakePlayerNames
  #638 = NameAndType        #640:#641     // releaseName:(Ljava/lang/String;Lext/mods/gameserver/enums/actors/Sex;)V
  #639 = Utf8               ext/mods/fakeplayer/FakePlayerNames
  #640 = Utf8               releaseName
  #641 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/enums/actors/Sex;)V
  #642 = Methodref          #8.#643       // ext/mods/fakeplayer/FakePlayer.setOnlineStatus:(ZZ)V
  #643 = NameAndType        #644:#645     // setOnlineStatus:(ZZ)V
  #644 = Utf8               setOnlineStatus
  #645 = Utf8               (ZZ)V
  #646 = Methodref          #8.#647       // ext/mods/fakeplayer/FakePlayer.stopAllToggles:()V
  #647 = NameAndType        #648:#43      // stopAllToggles:()V
  #648 = Utf8               stopAllToggles
  #649 = Methodref          #8.#650       // ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #650 = NameAndType        #651:#652     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #651 = Utf8               getInventory
  #652 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #653 = Methodref          #654.#655     // ext/mods/gameserver/model/itemcontainer/PcInventory.destroyAllItems:()V
  #654 = Class              #656          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #655 = NameAndType        #657:#43      // destroyAllItems:()V
  #656 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #657 = Utf8               destroyAllItems
  #658 = Methodref          #8.#659       // ext/mods/fakeplayer/FakePlayer.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #659 = NameAndType        #660:#661     // getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #660 = Utf8               getAllEffects
  #661 = Utf8               ()[Lext/mods/gameserver/skills/AbstractEffect;
  #662 = Methodref          #148.#663     // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #663 = NameAndType        #664:#665     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #664 = Utf8               getSkill
  #665 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #666 = Fieldref           #185.#667     // ext/mods/fakeplayer/FakePlayer$1.$SwitchMap$ext$mods$gameserver$enums$skills$EffectType:[I
  #667 = NameAndType        #668:#189     // $SwitchMap$ext$mods$gameserver$enums$skills$EffectType:[I
  #668 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$EffectType
  #669 = Methodref          #148.#670     // ext/mods/gameserver/skills/AbstractEffect.getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
  #670 = NameAndType        #671:#672     // getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
  #671 = Utf8               getEffectType
  #672 = Utf8               ()Lext/mods/gameserver/enums/skills/EffectType;
  #673 = Methodref          #674.#191     // ext/mods/gameserver/enums/skills/EffectType.ordinal:()I
  #674 = Class              #675          // ext/mods/gameserver/enums/skills/EffectType
  #675 = Utf8               ext/mods/gameserver/enums/skills/EffectType
  #676 = Methodref          #677.#678     // ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #677 = Class              #679          // ext/mods/gameserver/model/actor/Summon
  #678 = NameAndType        #680:#442     // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #679 = Utf8               ext/mods/gameserver/model/actor/Summon
  #680 = Utf8               unSummon
  #681 = Methodref          #8.#682       // ext/mods/fakeplayer/FakePlayer.getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
  #682 = NameAndType        #683:#223     // getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
  #683 = Utf8               getActiveRequester
  #684 = Methodref          #8.#685       // ext/mods/fakeplayer/FakePlayer.setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
  #685 = NameAndType        #686:#442     // setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
  #686 = Utf8               setActiveRequester
  #687 = Methodref          #8.#688       // ext/mods/fakeplayer/FakePlayer.cancelActiveTrade:()V
  #688 = NameAndType        #689:#43      // cancelActiveTrade:()V
  #689 = Utf8               cancelActiveTrade
  #690 = Methodref          #691.#692     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #691 = Class              #693          // ext/mods/gameserver/model/World
  #692 = NameAndType        #235:#694     // getInstance:()Lext/mods/gameserver/model/World;
  #693 = Utf8               ext/mods/gameserver/model/World
  #694 = Utf8               ()Lext/mods/gameserver/model/World;
  #695 = Methodref          #691.#696     // ext/mods/gameserver/model/World.removePlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #696 = NameAndType        #697:#442     // removePlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #697 = Utf8               removePlayer
  #698 = Fieldref           #699.#700     // java/lang/System.out:Ljava/io/PrintStream;
  #699 = Class              #701          // java/lang/System
  #700 = NameAndType        #702:#703     // out:Ljava/io/PrintStream;
  #701 = Utf8               java/lang/System
  #702 = Utf8               out
  #703 = Utf8               Ljava/io/PrintStream;
  #704 = Methodref          #525.#705     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #705 = NameAndType        #706:#172     // getMessage:()Ljava/lang/String;
  #706 = Utf8               getMessage
  #707 = Methodref          #708.#709     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #708 = Class              #710          // java/lang/String
  #709 = NameAndType        #711:#712     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #710 = Utf8               java/lang/String
  #711 = Utf8               valueOf
  #712 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #713 = InvokeDynamic      #3:#175       // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #714 = Methodref          #715.#716     // java/io/PrintStream.println:(Ljava/lang/String;)V
  #715 = Class              #717          // java/io/PrintStream
  #716 = NameAndType        #718:#719     // println:(Ljava/lang/String;)V
  #717 = Utf8               java/io/PrintStream
  #718 = Utf8               println
  #719 = Utf8               (Ljava/lang/String;)V
  #720 = Methodref          #569.#721     // ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
  #721 = NameAndType        #722:#43      // setMaxCpHpMp:()V
  #722 = Utf8               setMaxCpHpMp
  #723 = Methodref          #319.#724     // ext/mods/gameserver/model/actor/Creature.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #724 = NameAndType        #127:#725     // getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #725 = Utf8               ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #726 = Methodref          #727.#40      // ext/mods/gameserver/model/actor/cast/CreatureCast.stop:()V
  #727 = Class              #728          // ext/mods/gameserver/model/actor/cast/CreatureCast
  #728 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
  #729 = Methodref          #319.#460     // ext/mods/gameserver/model/actor/Creature.getFusionSkill:()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
  #730 = Methodref          #731.#732     // ext/mods/gameserver/model/actor/container/creature/FusionSkill.getTarget:()Lext/mods/gameserver/model/actor/Creature;
  #731 = Class              #733          // ext/mods/gameserver/model/actor/container/creature/FusionSkill
  #732 = NameAndType        #199:#734     // getTarget:()Lext/mods/gameserver/model/actor/Creature;
  #733 = Utf8               ext/mods/gameserver/model/actor/container/creature/FusionSkill
  #734 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
  #735 = Utf8               Code
  #736 = Utf8               LineNumberTable
  #737 = Utf8               LocalVariableTable
  #738 = Utf8               this
  #739 = Utf8               Lext/mods/fakeplayer/FakePlayer;
  #740 = Utf8               objectId
  #741 = Utf8               I
  #742 = Utf8               template
  #743 = Utf8               Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #744 = Utf8               accountName
  #745 = Utf8               Ljava/lang/String;
  #746 = Utf8               app
  #747 = Utf8               Lext/mods/gameserver/model/actor/container/player/Appearance;
  #748 = Utf8               getFakeSaveLocation
  #749 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #750 = Utf8               setFakeSaveLocation
  #751 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #752 = Utf8               loc
  #753 = Utf8               isFakeLocationRandom
  #754 = Utf8               dx
  #755 = Utf8               dy
  #756 = Utf8               isFakePostion
  #757 = Utf8               teleportToLocation
  #758 = Utf8               (IIII)V
  #759 = Utf8               x
  #760 = Utf8               y
  #761 = Utf8               z
  #762 = Utf8               randomOffset
  #763 = Utf8               StackMapTable
  #764 = Utf8               checkUseMagicConditions
  #765 = Utf8               (Lext/mods/gameserver/skills/L2Skill;ZZ)Z
  #766 = Utf8               effect
  #767 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #768 = Utf8               cha
  #769 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #770 = Utf8               siege
  #771 = Utf8               Lext/mods/gameserver/model/residence/castle/Siege;
  #772 = Utf8               skill
  #773 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #774 = Utf8               forceUse
  #775 = Utf8               Z
  #776 = Utf8               dontMove
  #777 = Utf8               sklType
  #778 = Utf8               target
  #779 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #780 = Utf8               sklTargetType
  #781 = Utf8               getAi
  #782 = Utf8               ()Lext/mods/fakeplayer/ai/FakePlayerAI;
  #783 = Utf8               _fakeAi
  #784 = Utf8               pk
  #785 = Utf8               killer
  #786 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #787 = Class              #788          // java/lang/Throwable
  #788 = Utf8               java/lang/Throwable
  #789 = Utf8               assignDefaultAI
  #790 = Utf8               e
  #791 = Utf8               Ljava/lang/Exception;
  #792 = Utf8               forceAutoAttack
  #793 = Utf8               playerTarget
  #794 = Utf8               kiteX
  #795 = Utf8               kiteY
  #796 = Utf8               kiteZ
  #797 = Utf8               length
  #798 = Utf8               D
  #799 = Utf8               angle
  #800 = Utf8               radians
  #801 = Utf8               distance
  #802 = Utf8               moveX
  #803 = Utf8               moveY
  #804 = Utf8               moveZ
  #805 = Utf8               creature
  #806 = Utf8               despawnPlayer
  #807 = Class              #808          // "[Lext/mods/gameserver/skills/AbstractEffect;"
  #808 = Utf8               [Lext/mods/gameserver/skills/AbstractEffect;
  #809 = Utf8               heal
  #810 = Utf8               lambda$doDie$1
  #811 = Utf8               lambda$doDie$0
  #812 = Utf8               SourceFile
  #813 = Utf8               FakePlayer.java
  #814 = Utf8               NestMembers
  #815 = Utf8               BootstrapMethods
  #816 = String             #817          // WorldPosition is null for skill: \u0001, player: \u0001.
  #817 = Utf8               WorldPosition is null for skill: \u0001, player: \u0001.
  #818 = MethodType         #819          //  (Ljava/lang/Object;)Z
  #819 = Utf8               (Ljava/lang/Object;)Z
  #820 = MethodHandle       5:#821        // REF_invokeVirtual ext/mods/fakeplayer/FakePlayer.lambda$doDie$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #821 = Methodref          #8.#822       // ext/mods/fakeplayer/FakePlayer.lambda$doDie$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #822 = NameAndType        #811:#206     // lambda$doDie$0:(Lext/mods/gameserver/model/actor/Creature;)Z
  #823 = MethodType         #206          //  (Lext/mods/gameserver/model/actor/Creature;)Z
  #824 = MethodType         #183          //  (Ljava/lang/Object;)V
  #825 = MethodHandle       6:#826        // REF_invokeStatic ext/mods/fakeplayer/FakePlayer.lambda$doDie$1:(Lext/mods/gameserver/model/actor/Creature;)V
  #826 = Methodref          #8.#827       // ext/mods/fakeplayer/FakePlayer.lambda$doDie$1:(Lext/mods/gameserver/model/actor/Creature;)V
  #827 = NameAndType        #810:#467     // lambda$doDie$1:(Lext/mods/gameserver/model/actor/Creature;)V
  #828 = MethodType         #467          //  (Lext/mods/gameserver/model/actor/Creature;)V
  #829 = String             #830          // Exception on deleteMe()\u0001\u0001
  #830 = Utf8               Exception on deleteMe()\u0001\u0001
  #831 = MethodHandle       6:#832        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #832 = Methodref          #833.#834     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #833 = Class              #835          // java/lang/invoke/StringConcatFactory
  #834 = NameAndType        #176:#836     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #835 = Utf8               java/lang/invoke/StringConcatFactory
  #836 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #837 = MethodHandle       6:#838        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #838 = Methodref          #839.#840     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #839 = Class              #841          // java/lang/invoke/LambdaMetafactory
  #840 = NameAndType        #842:#843     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #841 = Utf8               java/lang/invoke/LambdaMetafactory
  #842 = Utf8               metafactory
  #843 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #844 = Utf8               InnerClasses
  #845 = Class              #846          // java/lang/invoke/MethodHandles$Lookup
  #846 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #847 = Class              #848          // java/lang/invoke/MethodHandles
  #848 = Utf8               java/lang/invoke/MethodHandles
  #849 = Utf8               Lookup
{
  public ext.mods.fakeplayer.FakePlayer(int, ext.mods.gameserver.model.actor.template.PlayerTemplate, java.lang.String, ext.mods.gameserver.model.actor.container.player.Appearance);
    descriptor: (ILext/mods/gameserver/model/actor/template/PlayerTemplate;Ljava/lang/String;Lext/mods/gameserver/model/actor/container/player/Appearance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: aload_2
         3: aload_3
         4: aload         4
         6: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Player."<init>":(ILext/mods/gameserver/model/actor/template/PlayerTemplate;Ljava/lang/String;Lext/mods/gameserver/model/actor/container/player/Appearance;)V
         9: return
      LineNumberTable:
        line 69: 0
        line 70: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/fakeplayer/FakePlayer;
            0      10     1 objectId   I
            0      10     2 template   Lext/mods/gameserver/model/actor/template/PlayerTemplate;
            0      10     3 accountName   Ljava/lang/String;
            0      10     4   app   Lext/mods/gameserver/model/actor/container/player/Appearance;

  public ext.mods.gameserver.model.location.Location getFakeSaveLocation();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _saveLoc:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/FakePlayer;

  public void setFakeSaveLocation(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #7                  // Field _saveLoc:Lext/mods/gameserver/model/location/Location;
         5: return
      LineNumberTable:
        line 79: 0
        line 80: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/fakeplayer/FakePlayer;
            0       6     1   loc   Lext/mods/gameserver/model/location/Location;

  public ext.mods.gameserver.model.location.Location isFakeLocationRandom();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=1
         0: sipush        -200
         3: sipush        200
         6: invokestatic  #13                 // Method ext/mods/commons/random/Rnd.get:(II)I
         9: istore_1
        10: sipush        -200
        13: sipush        200
        16: invokestatic  #13                 // Method ext/mods/commons/random/Rnd.get:(II)I
        19: istore_2
        20: new           #19                 // class ext/mods/gameserver/model/location/Location
        23: dup
        24: aload_0
        25: invokevirtual #21                 // Method getX:()I
        28: iload_1
        29: iadd
        30: aload_0
        31: invokevirtual #25                 // Method getY:()I
        34: iload_2
        35: iadd
        36: aload_0
        37: invokevirtual #28                 // Method getZ:()I
        40: invokespecial #31                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        43: areturn
      LineNumberTable:
        line 85: 0
        line 86: 10
        line 88: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/fakeplayer/FakePlayer;
           10      34     1    dx   I
           20      24     2    dy   I

  public ext.mods.gameserver.model.location.Location isFakePostion();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: new           #19                 // class ext/mods/gameserver/model/location/Location
         3: dup
         4: aload_0
         5: invokevirtual #21                 // Method getX:()I
         8: aload_0
         9: invokevirtual #25                 // Method getY:()I
        12: aload_0
        13: invokevirtual #28                 // Method getZ:()I
        16: invokespecial #31                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        19: areturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/fakeplayer/FakePlayer;

  public void teleportToLocation(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=5, args_size=5
         0: aload_0
         1: invokevirtual #34                 // Method getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
         4: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
         7: aload_0
         8: iconst_1
         9: invokevirtual #44                 // Method abortAll:(Z)V
        12: aload_0
        13: invokevirtual #48                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        16: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
        19: iload         4
        21: ifle          46
        24: iload_1
        25: iload         4
        27: ineg
        28: iload         4
        30: invokestatic  #13                 // Method ext/mods/commons/random/Rnd.get:(II)I
        33: iadd
        34: istore_1
        35: iload_2
        36: iload         4
        38: ineg
        39: iload         4
        41: invokestatic  #13                 // Method ext/mods/commons/random/Rnd.get:(II)I
        44: iadd
        45: istore_2
        46: iinc          3, 5
        49: aload_0
        50: new           #57                 // class ext/mods/gameserver/network/serverpackets/TeleportToLocation
        53: dup
        54: aload_0
        55: iload_1
        56: iload_2
        57: iload_3
        58: iconst_1
        59: invokespecial #59                 // Method ext/mods/gameserver/network/serverpackets/TeleportToLocation."<init>":(Lext/mods/gameserver/model/WorldObject;IIIZ)V
        62: invokevirtual #62                 // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        65: aload_0
        66: invokevirtual #66                 // Method decayMe:()V
        69: aload_0
        70: iload_1
        71: iload_2
        72: iload_3
        73: invokevirtual #69                 // Method setXYZ:(III)V
        76: aload_0
        77: invokevirtual #72                 // Method onTeleported:()V
        80: aload_0
        81: invokevirtual #75                 // Method spawnMe:()V
        84: aload_0
        85: iconst_1
        86: invokevirtual #78                 // Method revalidateZone:(Z)V
        89: return
      LineNumberTable:
        line 98: 0
        line 99: 7
        line 101: 12
        line 102: 19
        line 104: 24
        line 105: 35
        line 107: 46
        line 108: 49
        line 109: 65
        line 110: 69
        line 111: 76
        line 112: 80
        line 113: 84
        line 114: 89
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      90     0  this   Lext/mods/fakeplayer/FakePlayer;
            0      90     1     x   I
            0      90     2     y   I
            0      90     3     z   I
            0      90     4 randomOffset   I
      StackMapTable: number_of_entries = 1
        frame_type = 46 /* same */

  public boolean checkUseMagicConditions(ext.mods.gameserver.skills.L2Skill, boolean, boolean);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;ZZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=4
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: invokevirtual #81                 // Method isDead:()Z
        10: ifne          20
        13: aload_0
        14: invokevirtual #85                 // Method isOutOfControl:()Z
        17: ifeq          29
        20: aload_0
        21: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        24: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        27: iconst_0
        28: ireturn
        29: aload_0
        30: aload_1
        31: invokevirtual #97                 // Method isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
        34: ifeq          39
        37: iconst_0
        38: ireturn
        39: aload_1
        40: invokevirtual #101                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        43: astore        4
        45: aload_0
        46: invokevirtual #107                // Method isFishing:()Z
        49: ifeq          78
        52: aload         4
        54: getstatic     #110                // Field ext/mods/gameserver/enums/skills/SkillType.PUMPING:Lext/mods/gameserver/enums/skills/SkillType;
        57: if_acmpeq     78
        60: aload         4
        62: getstatic     #116                // Field ext/mods/gameserver/enums/skills/SkillType.REELING:Lext/mods/gameserver/enums/skills/SkillType;
        65: if_acmpeq     78
        68: aload         4
        70: getstatic     #119                // Field ext/mods/gameserver/enums/skills/SkillType.FISHING:Lext/mods/gameserver/enums/skills/SkillType;
        73: if_acmpeq     78
        76: iconst_0
        77: ireturn
        78: aload_0
        79: invokevirtual #122                // Method isInObserverMode:()Z
        82: ifeq          95
        85: aload_0
        86: invokevirtual #125                // Method getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
        89: invokevirtual #129                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.canAbortCast:()Z
        92: pop
        93: iconst_0
        94: ireturn
        95: aload_0
        96: invokevirtual #134                // Method isSitting:()Z
        99: ifeq          133
       102: aload_1
       103: invokevirtual #137                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
       106: ifeq          131
       109: aload_0
       110: aload_1
       111: invokevirtual #140                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       114: invokevirtual #143                // Method getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
       117: astore        5
       119: aload         5
       121: ifnull        131
       124: aload         5
       126: invokevirtual #147                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       129: iconst_0
       130: ireturn
       131: iconst_0
       132: ireturn
       133: aload_1
       134: invokevirtual #137                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
       137: ifeq          178
       140: aload_0
       141: aload_1
       142: invokevirtual #140                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       145: invokevirtual #143                // Method getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
       148: astore        5
       150: aload         5
       152: ifnull        178
       155: aload_1
       156: invokevirtual #140                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       159: bipush        60
       161: if_icmpeq     169
       164: aload         5
       166: invokevirtual #147                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       169: aload_0
       170: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       173: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       176: iconst_0
       177: ireturn
       178: aload_0
       179: invokevirtual #152                // Method isFakeDeath:()Z
       182: ifeq          194
       185: aload_0
       186: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       189: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       192: iconst_0
       193: ireturn
       194: aconst_null
       195: astore        5
       197: aload_1
       198: invokevirtual #155                // Method ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
       201: astore        6
       203: aload         6
       205: getstatic     #159                // Field ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
       208: if_acmpne     239
       211: getstatic     #165                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       214: aload_1
       215: invokevirtual #169                // Method ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
       218: aload_0
       219: invokevirtual #173                // Method getName:()Ljava/lang/String;
       222: invokedynamic #174,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       227: invokevirtual #178                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       230: aload_0
       231: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       234: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       237: iconst_0
       238: ireturn
       239: getstatic     #184                // Field ext/mods/fakeplayer/FakePlayer$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       242: aload         6
       244: invokevirtual #190                // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       247: iaload
       248: tableswitch   { // 1 to 13

                       1: 316

                       2: 316

                       3: 316

                       4: 316

                       5: 316

                       6: 316

                       7: 316

                       8: 316

                       9: 316

                      10: 316

                      11: 316

                      12: 322

                      13: 322
                 default: 331
            }
       316: aload_0
       317: astore        5
       319: goto          337
       322: aload_0
       323: invokevirtual #193                // Method getSummon:()Lext/mods/gameserver/model/actor/Summon;
       326: astore        5
       328: goto          337
       331: aload_0
       332: invokevirtual #197                // Method getTarget:()Lext/mods/gameserver/model/WorldObject;
       335: astore        5
       337: aload         5
       339: ifnonnull     351
       342: aload_0
       343: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       346: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       349: iconst_0
       350: ireturn
       351: aload         5
       353: instanceof    #201                // class ext/mods/gameserver/model/actor/instance/Door
       356: ifeq          401
       359: aload         5
       361: checkcast     #201                // class ext/mods/gameserver/model/actor/instance/Door
       364: aload_0
       365: invokevirtual #203                // Method ext/mods/gameserver/model/actor/instance/Door.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
       368: ifeq          392
       371: aload         5
       373: checkcast     #201                // class ext/mods/gameserver/model/actor/instance/Door
       376: invokevirtual #207                // Method ext/mods/gameserver/model/actor/instance/Door.isUnlockable:()Z
       379: ifeq          401
       382: aload_1
       383: invokevirtual #101                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       386: getstatic     #210                // Field ext/mods/gameserver/enums/skills/SkillType.UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
       389: if_acmpeq     401
       392: aload_0
       393: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       396: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       399: iconst_0
       400: ireturn
       401: aload_0
       402: invokevirtual #213                // Method isInDuel:()Z
       405: ifeq          444
       408: aload         5
       410: instanceof    #216                // class ext/mods/gameserver/model/actor/Playable
       413: ifeq          444
       416: aload         5
       418: invokevirtual #218                // Method ext/mods/gameserver/model/WorldObject.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       421: astore        7
       423: aload         7
       425: invokevirtual #224                // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
       428: aload_0
       429: invokevirtual #227                // Method getDuelId:()I
       432: if_icmpeq     444
       435: aload_0
       436: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       439: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       442: iconst_0
       443: ireturn
       444: aload_1
       445: invokevirtual #228                // Method ext/mods/gameserver/skills/L2Skill.isSiegeSummonSkill:()Z
       448: ifeq          551
       451: invokestatic  #231                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       454: aload_0
       455: invokevirtual #237                // Method ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
       458: astore        7
       460: aload         7
       462: ifnull        490
       465: aload         7
       467: aload_0
       468: invokevirtual #241                // Method getClan:()Lext/mods/gameserver/model/pledge/Clan;
       471: getstatic     #245                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
       474: invokevirtual #251                // Method ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
       477: ifeq          490
       480: aload_0
       481: getstatic     #257                // Field ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
       484: invokevirtual #263                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       487: ifeq          502
       490: aload_0
       491: getstatic     #267                // Field ext/mods/gameserver/network/SystemMessageId.NOT_CALL_PET_FROM_THIS_LOCATION:Lext/mods/gameserver/network/SystemMessageId;
       494: invokestatic  #273                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       497: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       500: iconst_0
       501: ireturn
       502: invokestatic  #279                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       505: invokevirtual #284                // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
       508: ifeq          551
       511: invokestatic  #279                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       514: getstatic     #287                // Field ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
       517: invokevirtual #293                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
       520: getstatic     #297                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       523: if_acmpne     551
       526: invokestatic  #279                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       529: aload_0
       530: invokevirtual #303                // Method getObjectId:()I
       533: invokevirtual #306                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
       536: getstatic     #310                // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       539: if_acmpne     551
       542: aload_0
       543: getstatic     #313                // Field ext/mods/gameserver/network/SystemMessageId.SEAL_OF_STRIFE_FORBIDS_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
       546: invokevirtual #316                // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       549: iconst_0
       550: ireturn
       551: aload_1
       552: aload_0
       553: aload         5
       555: checkcast     #319                // class ext/mods/gameserver/model/actor/Creature
       558: iconst_0
       559: invokevirtual #321                // Method ext/mods/gameserver/skills/L2Skill.checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
       562: ifne          574
       565: aload_0
       566: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       569: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       572: iconst_0
       573: ireturn
       574: aload_1
       575: invokevirtual #325                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
       578: ifeq          799
       581: aload_0
       582: getstatic     #328                // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
       585: invokevirtual #263                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       588: ifeq          607
       591: aload_0
       592: getstatic     #331                // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IN_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
       595: invokevirtual #316                // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       598: aload_0
       599: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       602: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       605: iconst_0
       606: ireturn
       607: aload_0
       608: invokevirtual #334                // Method isInOlympiadMode:()Z
       611: ifeq          630
       614: aload_0
       615: invokevirtual #337                // Method isOlympiadStart:()Z
       618: ifne          630
       621: aload_0
       622: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       625: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       628: iconst_0
       629: ireturn
       630: aload         5
       632: aload_0
       633: invokevirtual #340                // Method ext/mods/gameserver/model/WorldObject.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
       636: ifne          658
       639: aload_0
       640: invokevirtual #341                // Method getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
       643: invokevirtual #345                // Method ext/mods/gameserver/model/AccessLevel.canGiveDamage:()Z
       646: ifne          658
       649: aload_0
       650: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       653: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       656: iconst_0
       657: ireturn
       658: aload         5
       660: aload_0
       661: invokevirtual #340                // Method ext/mods/gameserver/model/WorldObject.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
       664: ifne          752
       667: iload_2
       668: ifne          752
       671: getstatic     #184                // Field ext/mods/fakeplayer/FakePlayer$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       674: aload         6
       676: invokevirtual #190                // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       679: iaload
       680: tableswitch   { // 1 to 11

                       1: 740

                       2: 740

                       3: 740

                       4: 740

                       5: 740

                       6: 740

                       7: 740

                       8: 740

                       9: 740

                      10: 740

                      11: 740
                 default: 743
            }
       740: goto          752
       743: aload_0
       744: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       747: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       750: iconst_0
       751: ireturn
       752: iload_3
       753: ifeq          799
       756: aload_1
       757: invokevirtual #350                // Method ext/mods/gameserver/skills/L2Skill.getCastRange:()I
       760: ifle          799
       763: aload_0
       764: aload         5
       766: aload_1
       767: invokevirtual #350                // Method ext/mods/gameserver/skills/L2Skill.getCastRange:()I
       770: i2d
       771: aload_0
       772: invokevirtual #353                // Method getCollisionRadius:()D
       775: dadd
       776: d2i
       777: invokevirtual #357                // Method isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       780: ifne          799
       783: aload_0
       784: getstatic     #361                // Field ext/mods/gameserver/network/SystemMessageId.TARGET_TOO_FAR:Lext/mods/gameserver/network/SystemMessageId;
       787: invokevirtual #316                // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       790: aload_0
       791: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       794: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       797: iconst_0
       798: ireturn
       799: aload_1
       800: invokevirtual #325                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
       803: ifne          952
       806: aload         5
       808: instanceof    #364                // class ext/mods/gameserver/model/actor/instance/Monster
       811: ifeq          952
       814: iload_2
       815: ifne          952
       818: getstatic     #184                // Field ext/mods/fakeplayer/FakePlayer$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       821: aload         6
       823: invokevirtual #190                // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       826: iaload
       827: tableswitch   { // 1 to 15

                       1: 900

                       2: 900

                       3: 900

                       4: 900

                       5: 900

                       6: 900

                       7: 900

                       8: 900

                       9: 900

                      10: 900

                      11: 903

                      12: 900

                      13: 900

                      14: 900

                      15: 900
                 default: 903
            }
       900: goto          952
       903: getstatic     #366                // Field ext/mods/fakeplayer/FakePlayer$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       906: aload         4
       908: invokevirtual #369                // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       911: iaload
       912: tableswitch   { // 1 to 3

                       1: 940

                       2: 940

                       3: 940
                 default: 943
            }
       940: goto          952
       943: aload_0
       944: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       947: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       950: iconst_0
       951: ireturn
       952: aload         4
       954: getstatic     #370                // Field ext/mods/gameserver/enums/skills/SkillType.SPOIL:Lext/mods/gameserver/enums/skills/SkillType;
       957: if_acmpne     977
       960: aload         5
       962: instanceof    #364                // class ext/mods/gameserver/model/actor/instance/Monster
       965: ifne          977
       968: aload_0
       969: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       972: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       975: iconst_0
       976: ireturn
       977: aload         4
       979: getstatic     #373                // Field ext/mods/gameserver/enums/skills/SkillType.SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
       982: if_acmpne     1006
       985: aload         5
       987: instanceof    #376                // class ext/mods/gameserver/model/actor/Attackable
       990: ifeq          1006
       993: aload         5
       995: checkcast     #376                // class ext/mods/gameserver/model/actor/Attackable
       998: invokevirtual #378                // Method ext/mods/gameserver/model/actor/Attackable.isDead:()Z
      1001: ifeq          1006
      1004: iconst_0
      1005: ireturn
      1006: aload         4
      1008: getstatic     #379                // Field ext/mods/gameserver/enums/skills/SkillType.DRAIN_SOUL:Lext/mods/gameserver/enums/skills/SkillType;
      1011: if_acmpne     1031
      1014: aload         5
      1016: instanceof    #364                // class ext/mods/gameserver/model/actor/instance/Monster
      1019: ifne          1031
      1022: aload_0
      1023: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      1026: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1029: iconst_0
      1030: ireturn
      1031: getstatic     #184                // Field ext/mods/fakeplayer/FakePlayer$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
      1034: aload         6
      1036: invokevirtual #190                // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
      1039: iaload
      1040: tableswitch   { // 1 to 11

                       1: 1100

                       2: 1100

                       3: 1100

                       4: 1100

                       5: 1100

                       6: 1100

                       7: 1100

                       8: 1100

                       9: 1100

                      10: 1100

                      11: 1100
                 default: 1103
            }
      1100: goto          1129
      1103: aload_0
      1104: invokevirtual #341                // Method getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
      1107: invokevirtual #345                // Method ext/mods/gameserver/model/AccessLevel.canGiveDamage:()Z
      1110: ifne          1129
      1113: aload_0
      1114: getstatic     #382                // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
      1117: invokevirtual #316                // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1120: aload_0
      1121: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      1124: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1127: iconst_0
      1128: ireturn
      1129: aload         6
      1131: getstatic     #385                // Field ext/mods/gameserver/enums/skills/SkillTargetType.HOLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
      1134: if_acmpne     1146
      1137: aload_0
      1138: getstatic     #88                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      1141: invokevirtual #94                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1144: iconst_0
      1145: ireturn
      1146: iconst_1
      1147: ireturn
      LineNumberTable:
        line 118: 0
        line 119: 4
        line 121: 6
        line 123: 20
        line 124: 27
        line 127: 29
        line 128: 37
        line 130: 39
        line 132: 45
        line 134: 76
        line 137: 78
        line 139: 85
        line 140: 93
        line 143: 95
        line 145: 102
        line 147: 109
        line 148: 119
        line 150: 124
        line 151: 129
        line 154: 131
        line 157: 133
        line 159: 140
        line 161: 150
        line 163: 155
        line 164: 164
        line 166: 169
        line 167: 176
        line 171: 178
        line 173: 185
        line 174: 192
        line 177: 194
        line 178: 197
        line 180: 203
        line 182: 211
        line 183: 230
        line 184: 237
        line 187: 239
        line 200: 316
        line 201: 319
        line 204: 322
        line 205: 328
        line 207: 331
        line 211: 337
        line 213: 342
        line 214: 349
        line 217: 351
        line 219: 359
        line 221: 392
        line 222: 399
        line 226: 401
        line 228: 408
        line 230: 416
        line 231: 423
        line 233: 435
        line 234: 442
        line 239: 444
        line 241: 451
        line 242: 460
        line 244: 490
        line 245: 500
        line 248: 502
        line 250: 542
        line 251: 549
        line 255: 551
        line 257: 565
        line 258: 572
        line 261: 574
        line 263: 581
        line 265: 591
        line 266: 598
        line 267: 605
        line 270: 607
        line 272: 621
        line 273: 628
        line 275: 630
        line 277: 649
        line 278: 656
        line 281: 658
        line 283: 671
        line 296: 740
        line 298: 743
        line 299: 750
        line 303: 752
        line 306: 756
        line 308: 783
        line 310: 790
        line 311: 797
        line 317: 799
        line 319: 818
        line 335: 900
        line 338: 903
        line 343: 940
        line 345: 943
        line 346: 950
        line 353: 952
        line 355: 960
        line 357: 968
        line 358: 975
        line 362: 977
        line 364: 993
        line 366: 1004
        line 370: 1006
        line 372: 1014
        line 374: 1022
        line 375: 1029
        line 379: 1031
        line 392: 1100
        line 394: 1103
        line 396: 1113
        line 398: 1120
        line 399: 1127
        line 403: 1129
        line 405: 1137
        line 406: 1144
        line 409: 1146
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          119      12     5 effect   Lext/mods/gameserver/skills/AbstractEffect;
          150      28     5 effect   Lext/mods/gameserver/skills/AbstractEffect;
          423      21     7   cha   Lext/mods/gameserver/model/actor/Player;
          460      91     7 siege   Lext/mods/gameserver/model/residence/castle/Siege;
            0    1148     0  this   Lext/mods/fakeplayer/FakePlayer;
            0    1148     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0    1148     2 forceUse   Z
            0    1148     3 dontMove   Z
           45    1103     4 sklType   Lext/mods/gameserver/enums/skills/SkillType;
          197     951     5 target   Lext/mods/gameserver/model/WorldObject;
          203     945     6 sklTargetType   Lext/mods/gameserver/enums/skills/SkillTargetType;
      StackMapTable: number_of_entries = 43
        frame_type = 6 /* same */
        frame_type = 13 /* same */
        frame_type = 8 /* same */
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/enums/skills/SkillType ]
        frame_type = 16 /* same */
        frame_type = 35 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 15 /* same */
        frame_type = 253 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/enums/skills/SkillTargetType ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 76
        frame_type = 5 /* same */
        frame_type = 8 /* same */
        frame_type = 5 /* same */
        frame_type = 13 /* same */
        frame_type = 40 /* same */
        frame_type = 8 /* same */
        frame_type = 42 /* same */
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege ]
        frame_type = 11 /* same */
        frame_type = 250 /* chop */
          offset_delta = 48
        frame_type = 22 /* same */
        frame_type = 32 /* same */
        frame_type = 22 /* same */
        frame_type = 27 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 81
        frame_type = 2 /* same */
        frame_type = 8 /* same */
        frame_type = 46 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 100
        frame_type = 2 /* same */
        frame_type = 36 /* same */
        frame_type = 2 /* same */
        frame_type = 8 /* same */
        frame_type = 24 /* same */
        frame_type = 28 /* same */
        frame_type = 24 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 68
        frame_type = 2 /* same */
        frame_type = 25 /* same */
        frame_type = 16 /* same */

  public ext.mods.fakeplayer.ai.FakePlayerAI getAi();
    descriptor: ()Lext/mods/fakeplayer/ai/FakePlayerAI;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #388                // Field _ai:Lext/mods/fakeplayer/ai/FakePlayerAI;
         4: areturn
      LineNumberTable:
        line 414: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/FakePlayer;

  public void setAi(ext.mods.fakeplayer.ai.FakePlayerAI);
    descriptor: (Lext/mods/fakeplayer/ai/FakePlayerAI;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #388                // Field _ai:Lext/mods/fakeplayer/ai/FakePlayerAI;
         5: return
      LineNumberTable:
        line 419: 0
        line 420: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/fakeplayer/FakePlayer;
            0       6     1 _fakeAi   Lext/mods/fakeplayer/ai/FakePlayerAI;

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #392                // Method ext/mods/gameserver/model/actor/Player.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: invokevirtual #395                // Method isMounted:()Z
        14: ifeq          21
        17: aload_0
        18: invokevirtual #398                // Method stopFeed:()V
        21: aload_0
        22: invokevirtual #401                // Method clearCharges:()V
        25: aload_0
        26: dup
        27: astore_2
        28: monitorenter
        29: aload_0
        30: invokevirtual #152                // Method isFakeDeath:()Z
        33: ifeq          41
        36: aload_0
        37: iconst_1
        38: invokevirtual #404                // Method stopFakeDeath:(Z)V
        41: aload_2
        42: monitorexit
        43: goto          51
        46: astore_3
        47: aload_2
        48: monitorexit
        49: aload_3
        50: athrow
        51: aload_1
        52: ifnull        108
        55: aload_1
        56: invokevirtual #407                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        59: astore_2
        60: aload_2
        61: ifnull        103
        64: invokestatic  #408                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        67: aload_1
        68: aload_0
        69: invokevirtual #413                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onKill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
        72: invokestatic  #417                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        75: aload_1
        76: aload_0
        77: invokevirtual #422                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onKill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
        80: invokestatic  #423                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        83: aload_1
        84: aload_0
        85: invokevirtual #428                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onKill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
        88: invokestatic  #429                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        91: aload_1
        92: aload_0
        93: invokevirtual #434                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onKill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
        96: invokestatic  #435                // Method ext/mods/playergod/PlayerGodManager.getInstance:()Lext/mods/playergod/PlayerGodManager;
        99: aload_2
       100: invokevirtual #440                // Method ext/mods/playergod/PlayerGodManager.onKill:(Lext/mods/gameserver/model/actor/Player;)V
       103: aload_0
       104: lconst_0
       105: invokevirtual #443                // Method setExpBeforeDeath:(J)V
       108: aload_0
       109: ldc_w         #319                // class ext/mods/gameserver/model/actor/Creature
       112: aload_0
       113: invokedynamic #447,  0            // InvokeDynamic #1:test:(Lext/mods/fakeplayer/FakePlayer;)Ljava/util/function/Predicate;
       118: invokedynamic #451,  0            // InvokeDynamic #2:accept:()Ljava/util/function/Consumer;
       123: invokevirtual #455                // Method forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
       126: aload_0
       127: invokevirtual #459                // Method getFusionSkill:()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
       130: ifnull        140
       133: aload_0
       134: invokevirtual #125                // Method getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
       137: invokevirtual #463                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.stop:()V
       140: aload_0
       141: aload_1
       142: invokevirtual #464                // Method calculateDeathPenaltyBuffLevel:(Lext/mods/gameserver/model/actor/Creature;)V
       145: aload_0
       146: invokevirtual #468                // Method isPhoenixBlessed:()Z
       149: ifeq          159
       152: aload_0
       153: aload_0
       154: aconst_null
       155: iconst_0
       156: invokevirtual #471                // Method reviveRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Z)V
       159: invokestatic  #475                // Method ext/mods/gameserver/taskmanager/WaterTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/WaterTaskManager;
       162: aload_0
       163: invokevirtual #480                // Method ext/mods/gameserver/taskmanager/WaterTaskManager.remove:(Lext/mods/gameserver/model/actor/Player;)V
       166: aload_0
       167: invokevirtual #483                // Method disableBeastShots:()V
       170: invokestatic  #486                // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       173: aload_0
       174: invokevirtual #303                // Method getObjectId:()I
       177: invokevirtual #491                // Method ext/mods/gameserver/data/manager/AntiFeedManager.setLastDeathTime:(I)V
       180: iconst_1
       181: ireturn
      Exception table:
         from    to  target type
            29    43    46   any
            46    49    46   any
      LineNumberTable:
        line 425: 0
        line 426: 8
        line 428: 10
        line 429: 17
        line 431: 21
        line 433: 25
        line 435: 29
        line 436: 36
        line 437: 41
        line 439: 51
        line 441: 55
        line 443: 60
        line 445: 64
        line 446: 72
        line 447: 80
        line 448: 88
        line 450: 96
        line 453: 103
        line 456: 108
        line 458: 126
        line 459: 133
        line 461: 140
        line 463: 145
        line 464: 152
        line 466: 159
        line 468: 166
        line 470: 170
        line 472: 180
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           60      48     2    pk   Lext/mods/gameserver/model/actor/Player;
            0     182     0  this   Lext/mods/fakeplayer/FakePlayer;
            0     182     1 killer   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 9
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/lang/Object ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 31 /* same */
        frame_type = 18 /* same */

  public void assignDefaultAI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #495                // Method getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
         5: invokestatic  #499                // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getAIbyClassId:(Lext/mods/gameserver/enums/actors/ClassId;)Ljava/lang/Class;
         8: iconst_1
         9: anewarray     #505                // class java/lang/Class
        12: dup
        13: iconst_0
        14: ldc           #8                  // class ext/mods/fakeplayer/FakePlayer
        16: aastore
        17: invokevirtual #507                // Method java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        20: iconst_1
        21: anewarray     #511                // class java/lang/Object
        24: dup
        25: iconst_0
        26: aload_0
        27: aastore
        28: invokevirtual #513                // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        31: checkcast     #519                // class ext/mods/fakeplayer/ai/FakePlayerAI
        34: invokevirtual #521                // Method setAi:(Lext/mods/fakeplayer/ai/FakePlayerAI;)V
        37: goto          45
        40: astore_1
        41: aload_1
        42: invokevirtual #527                // Method java/lang/Exception.printStackTrace:()V
        45: return
      Exception table:
         from    to  target type
             0    37    40   Class java/lang/Exception
      LineNumberTable:
        line 479: 0
        line 484: 37
        line 481: 40
        line 483: 41
        line 485: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41       4     1     e   Ljava/lang/Exception;
            0      46     0  this   Lext/mods/fakeplayer/FakePlayer;
      StackMapTable: number_of_entries = 2
        frame_type = 104 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 4 /* same */

  public void forceAutoAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=11, args_size=2
         0: aload_0
         1: invokevirtual #197                // Method getTarget:()Lext/mods/gameserver/model/WorldObject;
         4: ifnull        24
         7: aload_0
         8: getstatic     #328                // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        11: invokevirtual #263                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        14: ifne          24
        17: aload_0
        18: invokevirtual #530                // Method isConfused:()Z
        21: ifeq          25
        24: return
        25: aload_0
        26: invokevirtual #197                // Method getTarget:()Lext/mods/gameserver/model/WorldObject;
        29: checkcast     #319                // class ext/mods/gameserver/model/actor/Creature
        32: astore_2
        33: aload_0
        34: invokevirtual #334                // Method isInOlympiadMode:()Z
        37: ifeq          82
        40: aload_2
        41: instanceof    #216                // class ext/mods/gameserver/model/actor/Playable
        44: ifeq          82
        47: aload_2
        48: invokevirtual #407                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        51: astore_3
        52: aload_3
        53: ifnull        81
        56: aload_3
        57: invokevirtual #533                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        60: ifeq          82
        63: aload_0
        64: invokevirtual #337                // Method isOlympiadStart:()Z
        67: ifeq          81
        70: aload_0
        71: invokevirtual #534                // Method getOlympiadGameId:()I
        74: aload_3
        75: invokevirtual #537                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
        78: if_icmpeq     82
        81: return
        82: aload_2
        83: aload_1
        84: invokevirtual #538                // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
        87: ifne          101
        90: aload_0
        91: invokevirtual #341                // Method getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
        94: invokevirtual #345                // Method ext/mods/gameserver/model/AccessLevel.canGiveDamage:()Z
        97: ifne          101
       100: return
       101: invokestatic  #539                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       104: aload_0
       105: aload_2
       106: invokevirtual #544                // Method ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       109: ifne          113
       112: return
       113: invokestatic  #539                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       116: aload_0
       117: invokevirtual #21                 // Method getX:()I
       120: aload_0
       121: invokevirtual #25                 // Method getY:()I
       124: aload_0
       125: invokevirtual #28                 // Method getZ:()I
       128: aload_2
       129: invokevirtual #548                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
       132: aload_2
       133: invokevirtual #549                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
       136: aload_2
       137: invokevirtual #550                // Method ext/mods/gameserver/model/actor/Creature.getZ:()I
       140: invokevirtual #551                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
       143: ifne          147
       146: return
       147: aload_0
       148: invokevirtual #555                // Method isArcher:()Z
       151: ifeq          319
       154: aload_0
       155: aload_2
       156: iconst_0
       157: invokestatic  #558                // Method ext/mods/commons/math/MathUtil.calculateDistance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)D
       160: aload_0
       161: invokevirtual #564                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       164: invokevirtual #568                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getPhysicalAttackRange:()I
       167: i2d
       168: ldc2_w        #573                // double 0.5d
       171: dmul
       172: dcmpg
       173: ifge          319
       176: aload_0
       177: invokevirtual #21                 // Method getX:()I
       180: aload_2
       181: invokevirtual #548                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
       184: isub
       185: istore_3
       186: aload_0
       187: invokevirtual #25                 // Method getY:()I
       190: aload_2
       191: invokevirtual #549                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
       194: isub
       195: istore        4
       197: iload_3
       198: iload_3
       199: imul
       200: iload         4
       202: iload         4
       204: imul
       205: iadd
       206: i2d
       207: invokestatic  #575                // Method java/lang/Math.sqrt:(D)D
       210: dstore        5
       212: dload         5
       214: dconst_0
       215: dcmpl
       216: ifle          319
       219: aload_0
       220: invokevirtual #21                 // Method getX:()I
       223: iload_3
       224: i2d
       225: dload         5
       227: ddiv
       228: ldc2_w        #581                // double 300.0d
       231: dmul
       232: d2i
       233: iadd
       234: istore        7
       236: aload_0
       237: invokevirtual #25                 // Method getY:()I
       240: iload         4
       242: i2d
       243: dload         5
       245: ddiv
       246: ldc2_w        #581                // double 300.0d
       249: dmul
       250: d2i
       251: iadd
       252: istore        8
       254: invokestatic  #539                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       257: iload         7
       259: iload         8
       261: aload_0
       262: invokevirtual #28                 // Method getZ:()I
       265: invokevirtual #583                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       268: istore        9
       270: invokestatic  #539                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       273: aload_0
       274: invokevirtual #21                 // Method getX:()I
       277: aload_0
       278: invokevirtual #25                 // Method getY:()I
       281: aload_0
       282: invokevirtual #28                 // Method getZ:()I
       285: iload         7
       287: iload         8
       289: iload         9
       291: invokevirtual #551                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
       294: ifeq          319
       297: aload_0
       298: invokevirtual #48                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       301: new           #19                 // class ext/mods/gameserver/model/location/Location
       304: dup
       305: iload         7
       307: iload         8
       309: iload         9
       311: invokespecial #31                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       314: aconst_null
       315: invokevirtual #587                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
       318: return
       319: aload_0
       320: invokevirtual #591                // Method isDagger:()Z
       323: ifeq          474
       326: aload_0
       327: aload_2
       328: iconst_0
       329: invokestatic  #558                // Method ext/mods/commons/math/MathUtil.calculateDistance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)D
       332: aload_0
       333: invokevirtual #564                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       336: invokevirtual #568                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getPhysicalAttackRange:()I
       339: bipush        50
       341: iadd
       342: i2d
       343: dcmpg
       344: ifge          474
       347: bipush        100
       349: invokestatic  #594                // Method ext/mods/commons/random/Rnd.get:(I)I
       352: bipush        40
       354: if_icmpge     474
       357: iconst_0
       358: sipush        360
       361: invokestatic  #13                 // Method ext/mods/commons/random/Rnd.get:(II)I
       364: i2d
       365: dstore_3
       366: dload_3
       367: invokestatic  #597                // Method java/lang/Math.toRadians:(D)D
       370: dstore        5
       372: bipush        100
       374: istore        7
       376: aload_2
       377: invokevirtual #548                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
       380: dload         5
       382: invokestatic  #600                // Method java/lang/Math.cos:(D)D
       385: iload         7
       387: i2d
       388: dmul
       389: d2i
       390: iadd
       391: istore        8
       393: aload_2
       394: invokevirtual #549                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
       397: dload         5
       399: invokestatic  #603                // Method java/lang/Math.sin:(D)D
       402: iload         7
       404: i2d
       405: dmul
       406: d2i
       407: iadd
       408: istore        9
       410: invokestatic  #539                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       413: iload         8
       415: iload         9
       417: aload_2
       418: invokevirtual #550                // Method ext/mods/gameserver/model/actor/Creature.getZ:()I
       421: invokevirtual #583                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       424: istore        10
       426: invokestatic  #539                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       429: aload_0
       430: invokevirtual #21                 // Method getX:()I
       433: aload_0
       434: invokevirtual #25                 // Method getY:()I
       437: aload_0
       438: invokevirtual #28                 // Method getZ:()I
       441: iload         8
       443: iload         9
       445: iload         10
       447: invokevirtual #551                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
       450: ifeq          474
       453: aload_0
       454: invokevirtual #48                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       457: new           #19                 // class ext/mods/gameserver/model/location/Location
       460: dup
       461: iload         8
       463: iload         9
       465: iload         10
       467: invokespecial #31                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       470: aconst_null
       471: invokevirtual #587                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
       474: aload_0
       475: invokevirtual #48                 // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       478: aload_2
       479: invokevirtual #606                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;)V
       482: return
      LineNumberTable:
        line 489: 0
        line 490: 24
        line 492: 25
        line 494: 33
        line 496: 47
        line 497: 52
        line 498: 81
        line 501: 82
        line 502: 100
        line 504: 101
        line 506: 112
        line 509: 113
        line 511: 146
        line 514: 147
        line 516: 176
        line 517: 186
        line 518: 197
        line 520: 212
        line 522: 219
        line 523: 236
        line 524: 254
        line 526: 270
        line 528: 297
        line 529: 318
        line 534: 319
        line 536: 357
        line 537: 366
        line 538: 372
        line 540: 376
        line 541: 393
        line 542: 410
        line 544: 426
        line 546: 453
        line 551: 474
        line 552: 482
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           52      30     3 playerTarget   Lext/mods/gameserver/model/actor/Player;
          236      83     7 kiteX   I
          254      65     8 kiteY   I
          270      49     9 kiteZ   I
          186     133     3    dx   I
          197     122     4    dy   I
          212     107     5 length   D
          366     108     3 angle   D
          372     102     5 radians   D
          376      98     7 distance   I
          393      81     8 moveX   I
          410      64     9 moveY   I
          426      48    10 moveZ   I
            0     483     0  this   Lext/mods/fakeplayer/FakePlayer;
            0     483     1 creature   Lext/mods/gameserver/model/actor/Creature;
           33     450     2 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 9
        frame_type = 24 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 18 /* same */
        frame_type = 11 /* same */
        frame_type = 33 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 171
        frame_type = 251 /* same_frame_extended */
          offset_delta = 154

  public boolean isArcher();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #609                // Method getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
         4: ifnull        21
         7: aload_0
         8: invokevirtual #613                // Method getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
        11: getstatic     #617                // Field ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
        14: if_acmpne     21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 556: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/fakeplayer/FakePlayer;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isDagger();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #609                // Method getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
         4: ifnull        21
         7: aload_0
         8: invokevirtual #613                // Method getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
        11: getstatic     #623                // Field ext/mods/gameserver/enums/items/WeaponType.DAGGER:Lext/mods/gameserver/enums/items/WeaponType;
        14: if_acmpne     21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 561: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/fakeplayer/FakePlayer;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public synchronized void despawnPlayer();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #173                // Method getName:()Ljava/lang/String;
         4: aload_0
         5: invokevirtual #626                // Method getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
         8: invokevirtual #630                // Method ext/mods/gameserver/model/actor/container/player/Appearance.getSex:()Lext/mods/gameserver/enums/actors/Sex;
        11: invokestatic  #636                // Method ext/mods/fakeplayer/FakePlayerNames.releaseName:(Ljava/lang/String;Lext/mods/gameserver/enums/actors/Sex;)V
        14: aload_0
        15: iconst_0
        16: iconst_1
        17: invokevirtual #642                // Method setOnlineStatus:(ZZ)V
        20: aload_0
        21: iconst_1
        22: invokevirtual #44                 // Method abortAll:(Z)V
        25: aload_0
        26: invokevirtual #646                // Method stopAllToggles:()V
        29: aload_0
        30: invokevirtual #649                // Method getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        33: invokevirtual #653                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.destroyAllItems:()V
        36: aload_0
        37: invokevirtual #658                // Method getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
        40: astore_1
        41: aload_1
        42: arraylength
        43: istore_2
        44: iconst_0
        45: istore_3
        46: iload_3
        47: iload_2
        48: if_icmpge     126
        51: aload_1
        52: iload_3
        53: aaload
        54: astore        4
        56: aload         4
        58: invokevirtual #662                // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        61: invokevirtual #137                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
        64: ifeq          75
        67: aload         4
        69: invokevirtual #147                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
        72: goto          120
        75: getstatic     #666                // Field ext/mods/fakeplayer/FakePlayer$1.$SwitchMap$ext$mods$gameserver$enums$skills$EffectType:[I
        78: aload         4
        80: invokevirtual #669                // Method ext/mods/gameserver/skills/AbstractEffect.getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
        83: invokevirtual #673                // Method ext/mods/gameserver/enums/skills/EffectType.ordinal:()I
        86: iaload
        87: lookupswitch  { // 2

                       1: 112

                       2: 112
                 default: 120
            }
       112: aload         4
       114: invokevirtual #147                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       117: goto          120
       120: iinc          3, 1
       123: goto          46
       126: aload_0
       127: invokevirtual #66                 // Method decayMe:()V
       130: aload_0
       131: invokevirtual #193                // Method getSummon:()Lext/mods/gameserver/model/actor/Summon;
       134: ifnull        145
       137: aload_0
       138: invokevirtual #193                // Method getSummon:()Lext/mods/gameserver/model/actor/Summon;
       141: aload_0
       142: invokevirtual #676                // Method ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
       145: aload_0
       146: invokevirtual #681                // Method getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
       149: ifnull        161
       152: aload_0
       153: aconst_null
       154: invokevirtual #684                // Method setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
       157: aload_0
       158: invokevirtual #687                // Method cancelActiveTrade:()V
       161: invokestatic  #690                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       164: aload_0
       165: invokevirtual #695                // Method ext/mods/gameserver/model/World.removePlayer:(Lext/mods/gameserver/model/actor/Player;)V
       168: goto          191
       171: astore_1
       172: getstatic     #698                // Field java/lang/System.out:Ljava/io/PrintStream;
       175: aload_1
       176: invokevirtual #704                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       179: aload_1
       180: invokestatic  #707                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       183: invokedynamic #713,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       188: invokevirtual #714                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       191: return
      Exception table:
         from    to  target type
             0   168   171   Class java/lang/Exception
      LineNumberTable:
        line 568: 0
        line 569: 14
        line 570: 20
        line 571: 25
        line 572: 29
        line 574: 36
        line 576: 56
        line 578: 67
        line 579: 72
        line 582: 75
        line 586: 112
        line 587: 117
        line 574: 120
        line 593: 126
        line 595: 130
        line 596: 137
        line 598: 145
        line 600: 152
        line 601: 157
        line 604: 161
        line 610: 168
        line 607: 171
        line 609: 172
        line 611: 191
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           56      64     4 effect   Lext/mods/gameserver/skills/AbstractEffect;
          172      19     1     e   Ljava/lang/Exception;
            0     192     0  this   Lext/mods/fakeplayer/FakePlayer;
      StackMapTable: number_of_entries = 9
        frame_type = 254 /* append */
          offset_delta = 46
          locals = [ class "[Lext/mods/gameserver/skills/AbstractEffect;", int, int ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 36 /* same */
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 18 /* same */
        frame_type = 15 /* same */
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 19 /* same */

  public void heal();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #564                // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
         4: invokevirtual #720                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
         7: return
      LineNumberTable:
        line 615: 0
        line 616: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/fakeplayer/FakePlayer;
}
SourceFile: "FakePlayer.java"
NestMembers:
  ext/mods/fakeplayer/FakePlayer$1
BootstrapMethods:
  0: #831 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #816 WorldPosition is null for skill: \u0001, player: \u0001.
  1: #837 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #818 (Ljava/lang/Object;)Z
      #820 REF_invokeVirtual ext/mods/fakeplayer/FakePlayer.lambda$doDie$0:(Lext/mods/gameserver/model/actor/Creature;)Z
      #823 (Lext/mods/gameserver/model/actor/Creature;)Z
  2: #837 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #824 (Ljava/lang/Object;)V
      #825 REF_invokeStatic ext/mods/fakeplayer/FakePlayer.lambda$doDie$1:(Lext/mods/gameserver/model/actor/Creature;)V
      #828 (Lext/mods/gameserver/model/actor/Creature;)V
  3: #831 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #829 Exception on deleteMe()\u0001\u0001
InnerClasses:
  static #185;                            // class ext/mods/fakeplayer/FakePlayer$1
  public static final #849= #845 of #847; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
