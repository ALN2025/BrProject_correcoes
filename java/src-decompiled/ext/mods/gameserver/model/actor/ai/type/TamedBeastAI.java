// Bytecode for: ext.mods.gameserver.model.actor.ai.type.TamedBeastAI
// File: ext\mods\gameserver\model\actor\ai\type\TamedBeastAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/TamedBeastAI.class
  Last modified 9 de jul de 2026; size 6197 bytes
  MD5 checksum 940020624ecf30094e0cb0b01132976f
  Compiled from "TamedBeastAI.java"
public class ext.mods.gameserver.model.actor.ai.type.TamedBeastAI extends ext.mods.gameserver.model.actor.ai.type.AttackableAI<ext.mods.gameserver.model.actor.instance.TamedBeast>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI
  super_class: #2                         // ext/mods/gameserver/model/actor/ai/type/AttackableAI
  interfaces: 0, fields: 3, methods: 7, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/ai/type/AttackableAI."<init>":(Lext/mods/gameserver/model/actor/Attackable;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/ai/type/AttackableAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Attackable;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI._step:I
    #8 = Class              #10           // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI
    #9 = NameAndType        #11:#12       // _step:I
   #10 = Utf8               ext/mods/gameserver/model/actor/ai/type/TamedBeastAI
   #11 = Utf8               _step
   #12 = Utf8               I
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #14 = NameAndType        #15:#16       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #15 = Utf8               getOwner
   #16 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #18 = Class              #20           // ext/mods/gameserver/model/actor/Player
   #19 = NameAndType        #21:#22       // isOnline:()Z
   #20 = Utf8               ext/mods/gameserver/model/actor/Player
   #21 = Utf8               isOnline
   #22 = Utf8               ()Z
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI._actor:Lext/mods/gameserver/model/actor/Creature;
   #24 = NameAndType        #25:#26       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #25 = Utf8               _actor
   #26 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #27 = Class              #28           // ext/mods/gameserver/model/actor/instance/TamedBeast
   #28 = Utf8               ext/mods/gameserver/model/actor/instance/TamedBeast
   #29 = Methodref          #27.#30       // ext/mods/gameserver/model/actor/instance/TamedBeast.deleteMe:()V
   #30 = NameAndType        #31:#32       // deleteMe:()V
   #31 = Utf8               deleteMe
   #32 = Utf8               ()V
   #33 = Integer            52335
   #34 = Integer            -83086
   #35 = Methodref          #27.#36       // ext/mods/gameserver/model/actor/instance/TamedBeast.isIn2DRadius:(III)Z
   #36 = NameAndType        #37:#38       // isIn2DRadius:(III)Z
   #37 = Utf8               isIn2DRadius
   #38 = Utf8               (III)Z
   #39 = Methodref          #27.#40       // ext/mods/gameserver/model/actor/instance/TamedBeast.getFoodId:()I
   #40 = NameAndType        #41:#42       // getFoodId:()I
   #41 = Utf8               getFoodId
   #42 = Utf8               ()I
   #43 = Methodref          #18.#44       // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
   #44 = NameAndType        #45:#46       // destroyItemByItemId:(IIZ)Z
   #45 = Utf8               destroyItemByItemId
   #46 = Utf8               (IIZ)Z
   #47 = Class              #48           // ext/mods/gameserver/network/serverpackets/SocialAction
   #48 = Utf8               ext/mods/gameserver/network/serverpackets/SocialAction
   #49 = Methodref          #47.#50       // ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
   #50 = NameAndType        #5:#51        // "<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
   #51 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
   #52 = Methodref          #27.#53       // ext/mods/gameserver/model/actor/instance/TamedBeast.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #53 = NameAndType        #54:#55       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #54 = Utf8               broadcastPacket
   #55 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #56 = Fieldref           #8.#57        // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI.FOOD_CHAT:[Ljava/lang/String;
   #57 = NameAndType        #58:#59       // FOOD_CHAT:[Ljava/lang/String;
   #58 = Utf8               FOOD_CHAT
   #59 = Utf8               [Ljava/lang/String;
   #60 = Methodref          #61.#62       // ext/mods/commons/random/Rnd.get:([Ljava/lang/Object;)Ljava/lang/Object;
   #61 = Class              #63           // ext/mods/commons/random/Rnd
   #62 = NameAndType        #64:#65       // get:([Ljava/lang/Object;)Ljava/lang/Object;
   #63 = Utf8               ext/mods/commons/random/Rnd
   #64 = Utf8               get
   #65 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
   #66 = Class              #67           // java/lang/String
   #67 = Utf8               java/lang/String
   #68 = Methodref          #27.#69       // ext/mods/gameserver/model/actor/instance/TamedBeast.broadcastNpcSay:(Ljava/lang/String;)V
   #69 = NameAndType        #70:#71       // broadcastNpcSay:(Ljava/lang/String;)V
   #70 = Utf8               broadcastNpcSay
   #71 = Utf8               (Ljava/lang/String;)V
   #72 = Methodref          #18.#73       // ext/mods/gameserver/model/actor/Player.isDead:()Z
   #73 = NameAndType        #74:#22       // isDead:()Z
   #74 = Utf8               isDead
   #75 = Methodref          #27.#76       // ext/mods/gameserver/model/actor/instance/TamedBeast.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #76 = NameAndType        #77:#78       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #77 = Utf8               getTemplate
   #78 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #79 = Class              #80           // ext/mods/gameserver/enums/actors/NpcSkillType
   #80 = Utf8               ext/mods/gameserver/enums/actors/NpcSkillType
   #81 = Fieldref           #79.#82       // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #82 = NameAndType        #83:#84       // BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #83 = Utf8               BUFF1
   #84 = Utf8               Lext/mods/gameserver/enums/actors/NpcSkillType;
   #85 = Fieldref           #79.#86       // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #86 = NameAndType        #87:#84       // BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #87 = Utf8               BUFF2
   #88 = Fieldref           #79.#89       // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #89 = NameAndType        #90:#84       // BUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #90 = Utf8               BUFF3
   #91 = Fieldref           #79.#92       // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #92 = NameAndType        #93:#84       // BUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #93 = Utf8               BUFF4
   #94 = Fieldref           #79.#95       // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF5:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #95 = NameAndType        #96:#84       // BUFF5:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #96 = Utf8               BUFF5
   #97 = Methodref          #98.#99       // ext/mods/gameserver/model/actor/template/NpcTemplate.getSkills:([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List;
   #98 = Class              #100          // ext/mods/gameserver/model/actor/template/NpcTemplate
   #99 = NameAndType        #101:#102     // getSkills:([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List;
  #100 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #101 = Utf8               getSkills
  #102 = Utf8               ([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List;
  #103 = InvokeDynamic      #0:#104       // #0:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #104 = NameAndType        #105:#106     // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #105 = Utf8               test
  #106 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #107 = InterfaceMethodref #108.#109     // java/util/List.removeIf:(Ljava/util/function/Predicate;)Z
  #108 = Class              #110          // java/util/List
  #109 = NameAndType        #111:#112     // removeIf:(Ljava/util/function/Predicate;)Z
  #110 = Utf8               java/util/List
  #111 = Utf8               removeIf
  #112 = Utf8               (Ljava/util/function/Predicate;)Z
  #113 = InterfaceMethodref #108.#114     // java/util/List.size:()I
  #114 = NameAndType        #115:#42      // size:()I
  #115 = Utf8               size
  #116 = Methodref          #61.#117      // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
  #117 = NameAndType        #64:#118      // get:(Ljava/util/List;)Ljava/lang/Object;
  #118 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #119 = Class              #120          // ext/mods/gameserver/skills/L2Skill
  #120 = Utf8               ext/mods/gameserver/skills/L2Skill
  #121 = Double             1000000.0d
  #123 = Methodref          #8.#124       // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI.addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
  #124 = NameAndType        #125:#126     // addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
  #125 = Utf8               addCastDesire
  #126 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
  #127 = Methodref          #8.#128       // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI.addFollowDesire:(Lext/mods/gameserver/model/actor/Creature;D)V
  #128 = NameAndType        #129:#130     // addFollowDesire:(Lext/mods/gameserver/model/actor/Creature;D)V
  #129 = Utf8               addFollowDesire
  #130 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
  #131 = Methodref          #61.#132      // ext/mods/commons/random/Rnd.nextBoolean:()Z
  #132 = NameAndType        #133:#22      // nextBoolean:()Z
  #133 = Utf8               nextBoolean
  #134 = Fieldref           #79.#135      // ext/mods/gameserver/enums/actors/NpcSkillType.HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #135 = NameAndType        #136:#84      // HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #136 = Utf8               HEAL
  #137 = Methodref          #98.#138      // ext/mods/gameserver/model/actor/template/NpcTemplate.getSkill:(Lext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #138 = NameAndType        #139:#140     // getSkill:(Lext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #139 = Utf8               getSkill
  #140 = Utf8               (Lext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #141 = Methodref          #119.#142     // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #142 = NameAndType        #143:#144     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #143 = Utf8               getSkillType
  #144 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #145 = Fieldref           #146.#147     // ext/mods/gameserver/enums/skills/SkillType.MANARECHARGE:Lext/mods/gameserver/enums/skills/SkillType;
  #146 = Class              #148          // ext/mods/gameserver/enums/skills/SkillType
  #147 = NameAndType        #149:#150     // MANARECHARGE:Lext/mods/gameserver/enums/skills/SkillType;
  #148 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #149 = Utf8               MANARECHARGE
  #150 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #151 = Fieldref           #146.#152     // ext/mods/gameserver/enums/skills/SkillType.MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #152 = NameAndType        #153:#150     // MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #153 = Utf8               MANAHEAL_PERCENT
  #154 = Methodref          #18.#155      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #155 = NameAndType        #156:#157     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #156 = Utf8               getStatus
  #157 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #158 = Methodref          #159.#160     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMpRatio:()D
  #159 = Class              #161          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #160 = NameAndType        #162:#163     // getMpRatio:()D
  #161 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #162 = Utf8               getMpRatio
  #163 = Utf8               ()D
  #164 = Double             0.5d
  #166 = Methodref          #159.#167     // ext/mods/gameserver/model/actor/status/PlayerStatus.getHpRatio:()D
  #167 = NameAndType        #168:#163     // getHpRatio:()D
  #168 = Utf8               getHpRatio
  #169 = Fieldref           #79.#170      // ext/mods/gameserver/enums/actors/NpcSkillType.DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #170 = NameAndType        #171:#84      // DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #171 = Utf8               DEBUFF
  #172 = Methodref          #173.#174     // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #173 = Class              #175          // ext/mods/gameserver/model/actor/Creature
  #174 = NameAndType        #176:#177     // getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #175 = Utf8               ext/mods/gameserver/model/actor/Creature
  #176 = Utf8               getFirstEffect
  #177 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #178 = Fieldref           #8.#179       // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI._nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
  #179 = NameAndType        #180:#181     // _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
  #180 = Utf8               _nextIntention
  #181 = Utf8               Lext/mods/gameserver/model/actor/ai/Intention;
  #182 = Methodref          #183.#184     // ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
  #183 = Class              #185          // ext/mods/gameserver/model/actor/ai/Intention
  #184 = NameAndType        #186:#22      // isBlank:()Z
  #185 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
  #186 = Utf8               isBlank
  #187 = Methodref          #8.#188       // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI.doFollowIntention:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #188 = NameAndType        #189:#190     // doFollowIntention:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #189 = Utf8               doFollowIntention
  #190 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Z)V
  #191 = Methodref          #8.#192       // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI.doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
  #192 = NameAndType        #193:#194     // doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
  #193 = Utf8               doIntention
  #194 = Utf8               (Lext/mods/gameserver/model/actor/ai/Intention;)V
  #195 = Methodref          #27.#14       // ext/mods/gameserver/model/actor/instance/TamedBeast.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #196 = Methodref          #18.#174      // ext/mods/gameserver/model/actor/Player.getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #197 = String             #198          // Refills! Yeah!
  #198 = Utf8               Refills! Yeah!
  #199 = String             #200          // I am such a gluttonous beast, it is embarrassing! Ha ha.
  #200 = Utf8               I am such a gluttonous beast, it is embarrassing! Ha ha.
  #201 = String             #202          // Your cooperative feeling has been getting better and better.
  #202 = Utf8               Your cooperative feeling has been getting better and better.
  #203 = String             #204          // I will help you!
  #204 = Utf8               I will help you!
  #205 = String             #206          // The weather is really good. Wanna go for a picnic?
  #206 = Utf8               The weather is really good. Wanna go for a picnic?
  #207 = String             #208          // I really like you! This is tasty...
  #208 = Utf8               I really like you! This is tasty...
  #209 = String             #210          // If you do not have to leave this place, then I can help you.
  #210 = Utf8               If you do not have to leave this place, then I can help you.
  #211 = String             #212          // What can I help you with?
  #212 = Utf8               What can I help you with?
  #213 = String             #214          // I am not here only for food!
  #214 = Utf8               I am not here only for food!
  #215 = String             #216          // Yam, yam, yam, yam, yam!
  #216 = Utf8               Yam, yam, yam, yam, yam!
  #217 = Utf8               MAX_DISTANCE_FROM_HOME
  #218 = Utf8               ConstantValue
  #219 = Integer            13000
  #220 = Utf8               (Lext/mods/gameserver/model/actor/instance/TamedBeast;)V
  #221 = Utf8               Code
  #222 = Utf8               LineNumberTable
  #223 = Utf8               LocalVariableTable
  #224 = Utf8               this
  #225 = Utf8               Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
  #226 = Utf8               tamedBeast
  #227 = Utf8               Lext/mods/gameserver/model/actor/instance/TamedBeast;
  #228 = Utf8               runAI
  #229 = Utf8               owner
  #230 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #231 = Utf8               skills
  #232 = Utf8               Ljava/util/List;
  #233 = Utf8               LocalVariableTypeTable
  #234 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #235 = Utf8               StackMapTable
  #236 = Utf8               onEvtOwnerAttacked
  #237 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #238 = Utf8               skill
  #239 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #240 = Utf8               attacker
  #241 = Utf8               onEvtFinishedCasting
  #242 = Utf8               lambda$runAI$0
  #243 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #244 = Utf8               s
  #245 = Utf8               <clinit>
  #246 = Utf8               Signature
  #247 = Utf8               Lext/mods/gameserver/model/actor/ai/type/AttackableAI<Lext/mods/gameserver/model/actor/instance/TamedBeast;>;
  #248 = Utf8               SourceFile
  #249 = Utf8               TamedBeastAI.java
  #250 = Utf8               BootstrapMethods
  #251 = MethodType         #252          //  (Ljava/lang/Object;)Z
  #252 = Utf8               (Ljava/lang/Object;)Z
  #253 = MethodHandle       6:#254        // REF_invokeStatic ext/mods/gameserver/model/actor/ai/type/TamedBeastAI.lambda$runAI$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #254 = Methodref          #8.#255       // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI.lambda$runAI$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #255 = NameAndType        #242:#243     // lambda$runAI$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #256 = MethodType         #257          //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #257 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #258 = MethodHandle       6:#259        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #259 = Methodref          #260.#261     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #260 = Class              #262          // java/lang/invoke/LambdaMetafactory
  #261 = NameAndType        #263:#264     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #262 = Utf8               java/lang/invoke/LambdaMetafactory
  #263 = Utf8               metafactory
  #264 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #265 = Utf8               InnerClasses
  #266 = Class              #267          // java/lang/invoke/MethodHandles$Lookup
  #267 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #268 = Class              #269          // java/lang/invoke/MethodHandles
  #269 = Utf8               java/lang/invoke/MethodHandles
  #270 = Utf8               Lookup
{
  protected static final java.lang.String[] FOOD_CHAT;
    descriptor: [Ljava/lang/String;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  public ext.mods.gameserver.model.actor.ai.type.TamedBeastAI(ext.mods.gameserver.model.actor.instance.TamedBeast);
    descriptor: (Lext/mods/gameserver/model/actor/instance/TamedBeast;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI."<init>":(Lext/mods/gameserver/model/actor/Attackable;)V
         5: return
      LineNumberTable:
        line 54: 0
        line 55: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
            0       6     1 tamedBeast   Lext/mods/gameserver/model/actor/instance/TamedBeast;

  public void runAI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: dup
         2: getfield      #7                  // Field _step:I
         5: iconst_1
         6: iadd
         7: dup_x1
         8: putfield      #7                  // Field _step:I
        11: iconst_5
        12: irem
        13: ifeq          17
        16: return
        17: aload_0
        18: invokevirtual #13                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        21: astore_1
        22: aload_1
        23: ifnull        33
        26: aload_1
        27: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        30: ifne          44
        33: aload_0
        34: getfield      #23                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        37: checkcast     #27                 // class ext/mods/gameserver/model/actor/instance/TamedBeast
        40: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/instance/TamedBeast.deleteMe:()V
        43: return
        44: aload_0
        45: getfield      #7                  // Field _step:I
        48: bipush        60
        50: if_icmple     160
        53: aload_0
        54: getfield      #23                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        57: checkcast     #27                 // class ext/mods/gameserver/model/actor/instance/TamedBeast
        60: ldc           #33                 // int 52335
        62: ldc           #34                 // int -83086
        64: sipush        13000
        67: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/instance/TamedBeast.isIn2DRadius:(III)Z
        70: ifne          84
        73: aload_0
        74: getfield      #23                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        77: checkcast     #27                 // class ext/mods/gameserver/model/actor/instance/TamedBeast
        80: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/instance/TamedBeast.deleteMe:()V
        83: return
        84: aload_1
        85: aload_0
        86: getfield      #23                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        89: checkcast     #27                 // class ext/mods/gameserver/model/actor/instance/TamedBeast
        92: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/instance/TamedBeast.getFoodId:()I
        95: iconst_1
        96: iconst_1
        97: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       100: ifne          114
       103: aload_0
       104: getfield      #23                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       107: checkcast     #27                 // class ext/mods/gameserver/model/actor/instance/TamedBeast
       110: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/instance/TamedBeast.deleteMe:()V
       113: return
       114: aload_0
       115: getfield      #23                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       118: checkcast     #27                 // class ext/mods/gameserver/model/actor/instance/TamedBeast
       121: new           #47                 // class ext/mods/gameserver/network/serverpackets/SocialAction
       124: dup
       125: aload_0
       126: getfield      #23                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       129: iconst_2
       130: invokespecial #49                 // Method ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
       133: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/instance/TamedBeast.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       136: aload_0
       137: getfield      #23                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       140: checkcast     #27                 // class ext/mods/gameserver/model/actor/instance/TamedBeast
       143: getstatic     #56                 // Field FOOD_CHAT:[Ljava/lang/String;
       146: invokestatic  #60                 // Method ext/mods/commons/random/Rnd.get:([Ljava/lang/Object;)Ljava/lang/Object;
       149: checkcast     #66                 // class java/lang/String
       152: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/instance/TamedBeast.broadcastNpcSay:(Ljava/lang/String;)V
       155: aload_0
       156: iconst_0
       157: putfield      #7                  // Field _step:I
       160: aload_1
       161: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
       164: ifeq          168
       167: return
       168: aload_0
       169: getfield      #23                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       172: checkcast     #27                 // class ext/mods/gameserver/model/actor/instance/TamedBeast
       175: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/instance/TamedBeast.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       178: iconst_5
       179: anewarray     #79                 // class ext/mods/gameserver/enums/actors/NpcSkillType
       182: dup
       183: iconst_0
       184: getstatic     #81                 // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       187: aastore
       188: dup
       189: iconst_1
       190: getstatic     #85                 // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
       193: aastore
       194: dup
       195: iconst_2
       196: getstatic     #88                 // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
       199: aastore
       200: dup
       201: iconst_3
       202: getstatic     #91                 // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
       205: aastore
       206: dup
       207: iconst_4
       208: getstatic     #94                 // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF5:Lext/mods/gameserver/enums/actors/NpcSkillType;
       211: aastore
       212: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getSkills:([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List;
       215: astore_2
       216: aload_2
       217: aload_1
       218: invokedynamic #103,  0            // InvokeDynamic #0:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
       223: invokeinterface #107,  2          // InterfaceMethod java/util/List.removeIf:(Ljava/util/function/Predicate;)Z
       228: pop
       229: aload_2
       230: invokeinterface #113,  1          // InterfaceMethod java/util/List.size:()I
       235: iconst_2
       236: if_icmple     257
       239: aload_0
       240: aload_1
       241: aload_2
       242: invokestatic  #116                // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
       245: checkcast     #119                // class ext/mods/gameserver/skills/L2Skill
       248: ldc2_w        #121                // double 1000000.0d
       251: invokevirtual #123                // Method addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
       254: goto          265
       257: aload_0
       258: aload_1
       259: ldc2_w        #121                // double 1000000.0d
       262: invokevirtual #127                // Method addFollowDesire:(Lext/mods/gameserver/model/actor/Creature;D)V
       265: return
      LineNumberTable:
        line 60: 0
        line 61: 16
        line 63: 17
        line 64: 22
        line 66: 33
        line 67: 43
        line 70: 44
        line 72: 53
        line 74: 73
        line 75: 83
        line 78: 84
        line 80: 103
        line 81: 113
        line 84: 114
        line 85: 136
        line 87: 155
        line 90: 160
        line 91: 167
        line 93: 168
        line 94: 216
        line 96: 229
        line 97: 239
        line 99: 257
        line 100: 265
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     266     0  this   Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
           22     244     1 owner   Lext/mods/gameserver/model/actor/Player;
          216      50     2 skills   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          216      50     2 skills   Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
      StackMapTable: number_of_entries = 9
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 10 /* same */
        frame_type = 39 /* same */
        frame_type = 29 /* same */
        frame_type = 45 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 88
          locals = [ class java/util/List ]
        frame_type = 7 /* same */

  protected void onEvtOwnerAttacked(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: invokevirtual #13                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: invokevirtual #13                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        14: ifne          28
        17: aload_0
        18: getfield      #23                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        21: checkcast     #27                 // class ext/mods/gameserver/model/actor/instance/TamedBeast
        24: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/instance/TamedBeast.deleteMe:()V
        27: return
        28: aload_0
        29: invokevirtual #13                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        32: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        35: ifeq          39
        38: return
        39: invokestatic  #131                // Method ext/mods/commons/random/Rnd.nextBoolean:()Z
        42: ifeq          150
        45: aload_0
        46: getfield      #23                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        49: checkcast     #27                 // class ext/mods/gameserver/model/actor/instance/TamedBeast
        52: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/instance/TamedBeast.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        55: getstatic     #134                // Field ext/mods/gameserver/enums/actors/NpcSkillType.HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
        58: invokevirtual #137                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getSkill:(Lext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
        61: astore_2
        62: aload_2
        63: ifnull        147
        66: aload_2
        67: invokevirtual #141                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        70: getstatic     #145                // Field ext/mods/gameserver/enums/skills/SkillType.MANARECHARGE:Lext/mods/gameserver/enums/skills/SkillType;
        73: if_acmpeq     86
        76: aload_2
        77: invokevirtual #141                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        80: getstatic     #151                // Field ext/mods/gameserver/enums/skills/SkillType.MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
        83: if_acmpne     118
        86: aload_0
        87: invokevirtual #13                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        90: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        93: invokevirtual #158                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMpRatio:()D
        96: ldc2_w        #164                // double 0.5d
        99: dcmpg
       100: ifge          147
       103: aload_0
       104: aload_0
       105: invokevirtual #13                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
       108: aload_2
       109: ldc2_w        #121                // double 1000000.0d
       112: invokevirtual #123                // Method addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
       115: goto          147
       118: aload_0
       119: invokevirtual #13                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
       122: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       125: invokevirtual #166                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getHpRatio:()D
       128: ldc2_w        #164                // double 0.5d
       131: dcmpg
       132: ifge          147
       135: aload_0
       136: aload_0
       137: invokevirtual #13                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
       140: aload_2
       141: ldc2_w        #121                // double 1000000.0d
       144: invokevirtual #123                // Method addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
       147: goto          188
       150: aload_0
       151: getfield      #23                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       154: checkcast     #27                 // class ext/mods/gameserver/model/actor/instance/TamedBeast
       157: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/instance/TamedBeast.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       160: getstatic     #169                // Field ext/mods/gameserver/enums/actors/NpcSkillType.DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
       163: invokevirtual #137                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getSkill:(Lext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
       166: astore_2
       167: aload_2
       168: ifnull        188
       171: aload_1
       172: aload_2
       173: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
       176: ifnonnull     188
       179: aload_0
       180: aload_1
       181: aload_2
       182: ldc2_w        #121                // double 1000000.0d
       185: invokevirtual #123                // Method addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
       188: return
      LineNumberTable:
        line 105: 0
        line 107: 17
        line 108: 27
        line 111: 28
        line 112: 38
        line 114: 39
        line 116: 45
        line 117: 62
        line 119: 66
        line 121: 86
        line 122: 103
        line 124: 118
        line 125: 135
        line 127: 147
        line 130: 150
        line 131: 167
        line 132: 179
        line 134: 188
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           62      85     2 skill   Lext/mods/gameserver/skills/L2Skill;
          167      21     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     189     0  this   Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
            0     189     1 attacker   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 8
        frame_type = 17 /* same */
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 31 /* same */
        frame_type = 250 /* chop */
          offset_delta = 28
        frame_type = 2 /* same */
        frame_type = 37 /* same */

  protected void onEvtFinishedCasting();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #178                // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #182                // Method ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
         7: ifeq          22
        10: aload_0
        11: aload_0
        12: invokevirtual #13                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        15: iconst_0
        16: invokevirtual #187                // Method doFollowIntention:(Lext/mods/gameserver/model/actor/Creature;Z)V
        19: goto          30
        22: aload_0
        23: aload_0
        24: getfield      #178                // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        27: invokevirtual #191                // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
        30: return
      LineNumberTable:
        line 139: 0
        line 140: 10
        line 142: 22
        line 143: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 7 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        10
         2: anewarray     #66                 // class java/lang/String
         5: dup
         6: iconst_0
         7: ldc           #197                // String Refills! Yeah!
         9: aastore
        10: dup
        11: iconst_1
        12: ldc           #199                // String I am such a gluttonous beast, it is embarrassing! Ha ha.
        14: aastore
        15: dup
        16: iconst_2
        17: ldc           #201                // String Your cooperative feeling has been getting better and better.
        19: aastore
        20: dup
        21: iconst_3
        22: ldc           #203                // String I will help you!
        24: aastore
        25: dup
        26: iconst_4
        27: ldc           #205                // String The weather is really good. Wanna go for a picnic?
        29: aastore
        30: dup
        31: iconst_5
        32: ldc           #207                // String I really like you! This is tasty...
        34: aastore
        35: dup
        36: bipush        6
        38: ldc           #209                // String If you do not have to leave this place, then I can help you.
        40: aastore
        41: dup
        42: bipush        7
        44: ldc           #211                // String What can I help you with?
        46: aastore
        47: dup
        48: bipush        8
        50: ldc           #213                // String I am not here only for food!
        52: aastore
        53: dup
        54: bipush        9
        56: ldc           #215                // String Yam, yam, yam, yam, yam!
        58: aastore
        59: putstatic     #56                 // Field FOOD_CHAT:[Ljava/lang/String;
        62: return
      LineNumberTable:
        line 36: 0
}
Signature: #247                         // Lext/mods/gameserver/model/actor/ai/type/AttackableAI<Lext/mods/gameserver/model/actor/instance/TamedBeast;>;
SourceFile: "TamedBeastAI.java"
BootstrapMethods:
  0: #258 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #251 (Ljava/lang/Object;)Z
      #253 REF_invokeStatic ext/mods/gameserver/model/actor/ai/type/TamedBeastAI.lambda$runAI$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
      #256 (Lext/mods/gameserver/skills/L2Skill;)Z
InnerClasses:
  public static final #270= #266 of #268; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
