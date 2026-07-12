// Bytecode for: ext.mods.gameserver.model.item.kind.Weapon
// File: ext\mods\gameserver\model\item\kind\Weapon.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/item/kind/Weapon.class
  Last modified 9 de jul de 2026; size 10939 bytes
  MD5 checksum a52de3199ee0454445c95a24595b1a75
  Compiled from "Weapon.java"
public final class ext.mods.gameserver.model.item.kind.Weapon extends ext.mods.gameserver.model.item.kind.Item
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #22                         // ext/mods/gameserver/model/item/kind/Weapon
  super_class: #2                         // ext/mods/gameserver/model/item/kind/Item
  interfaces: 0, fields: 16, methods: 18, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/item/kind/Item."<init>":(Lext/mods/commons/data/StatSet;)V
    #2 = Class              #4            // ext/mods/gameserver/model/item/kind/Item
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/commons/data/StatSet;)V
    #4 = Utf8               ext/mods/gameserver/model/item/kind/Item
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
    #7 = String             #8            // weapon_type
    #8 = Utf8               weapon_type
    #9 = Class              #10           // ext/mods/gameserver/enums/items/WeaponType
   #10 = Utf8               ext/mods/gameserver/enums/items/WeaponType
   #11 = Fieldref           #9.#12        // ext/mods/gameserver/enums/items/WeaponType.NONE:Lext/mods/gameserver/enums/items/WeaponType;
   #12 = NameAndType        #13:#14       // NONE:Lext/mods/gameserver/enums/items/WeaponType;
   #13 = Utf8               NONE
   #14 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
   #15 = Methodref          #16.#17       // ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #16 = Class              #18           // ext/mods/commons/data/StatSet
   #17 = NameAndType        #19:#20       // getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #18 = Utf8               ext/mods/commons/data/StatSet
   #19 = Utf8               getEnum
   #20 = Utf8               (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #21 = Fieldref           #22.#23       // ext/mods/gameserver/model/item/kind/Weapon._type:Lext/mods/gameserver/enums/items/WeaponType;
   #22 = Class              #24           // ext/mods/gameserver/model/item/kind/Weapon
   #23 = NameAndType        #25:#14       // _type:Lext/mods/gameserver/enums/items/WeaponType;
   #24 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
   #25 = Utf8               _type
   #26 = Fieldref           #22.#27       // ext/mods/gameserver/model/item/kind/Weapon._type1:I
   #27 = NameAndType        #28:#29       // _type1:I
   #28 = Utf8               _type1
   #29 = Utf8               I
   #30 = Fieldref           #22.#31       // ext/mods/gameserver/model/item/kind/Weapon._type2:I
   #31 = NameAndType        #32:#29       // _type2:I
   #32 = Utf8               _type2
   #33 = String             #34           // soulshots
   #34 = Utf8               soulshots
   #35 = Methodref          #16.#36       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #36 = NameAndType        #37:#38       // getInteger:(Ljava/lang/String;I)I
   #37 = Utf8               getInteger
   #38 = Utf8               (Ljava/lang/String;I)I
   #39 = Fieldref           #22.#40       // ext/mods/gameserver/model/item/kind/Weapon._soulShotCount:I
   #40 = NameAndType        #41:#29       // _soulShotCount:I
   #41 = Utf8               _soulShotCount
   #42 = String             #43           // spiritshots
   #43 = Utf8               spiritshots
   #44 = Fieldref           #22.#45       // ext/mods/gameserver/model/item/kind/Weapon._spiritShotCount:I
   #45 = NameAndType        #46:#29       // _spiritShotCount:I
   #46 = Utf8               _spiritShotCount
   #47 = String             #48           // random_damage
   #48 = Utf8               random_damage
   #49 = Fieldref           #22.#50       // ext/mods/gameserver/model/item/kind/Weapon._rndDam:I
   #50 = NameAndType        #51:#29       // _rndDam:I
   #51 = Utf8               _rndDam
   #52 = String             #53           // mp_consume
   #53 = Utf8               mp_consume
   #54 = Fieldref           #22.#55       // ext/mods/gameserver/model/item/kind/Weapon._mpConsume:I
   #55 = NameAndType        #56:#29       // _mpConsume:I
   #56 = Utf8               _mpConsume
   #57 = String             #58           // mp_consume_reduce
   #58 = Utf8               mp_consume_reduce
   #59 = String             #60           // 0,0
   #60 = Utf8               0,0
   #61 = Methodref          #16.#62       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #62 = NameAndType        #63:#64       // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #63 = Utf8               getString
   #64 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #65 = String             #66           // ,
   #66 = Utf8               ,
   #67 = Methodref          #68.#69       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #68 = Class              #70           // java/lang/String
   #69 = NameAndType        #71:#72       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #70 = Utf8               java/lang/String
   #71 = Utf8               split
   #72 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #73 = Methodref          #74.#75       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #74 = Class              #76           // java/lang/Integer
   #75 = NameAndType        #77:#78       // parseInt:(Ljava/lang/String;)I
   #76 = Utf8               java/lang/Integer
   #77 = Utf8               parseInt
   #78 = Utf8               (Ljava/lang/String;)I
   #79 = Fieldref           #22.#80       // ext/mods/gameserver/model/item/kind/Weapon._mpConsumeReduceRate:I
   #80 = NameAndType        #81:#29       // _mpConsumeReduceRate:I
   #81 = Utf8               _mpConsumeReduceRate
   #82 = Fieldref           #22.#83       // ext/mods/gameserver/model/item/kind/Weapon._mpConsumeReduceValue:I
   #83 = NameAndType        #84:#29       // _mpConsumeReduceValue:I
   #84 = Utf8               _mpConsumeReduceValue
   #85 = String             #86           // reuse_delay
   #86 = Utf8               reuse_delay
   #87 = Fieldref           #22.#88       // ext/mods/gameserver/model/item/kind/Weapon._reuseDelay:I
   #88 = NameAndType        #89:#29       // _reuseDelay:I
   #89 = Utf8               _reuseDelay
   #90 = String             #91           // is_magical
   #91 = Utf8               is_magical
   #92 = Methodref          #16.#93       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
   #93 = NameAndType        #94:#95       // getBool:(Ljava/lang/String;Z)Z
   #94 = Utf8               getBool
   #95 = Utf8               (Ljava/lang/String;Z)Z
   #96 = Fieldref           #22.#97       // ext/mods/gameserver/model/item/kind/Weapon._isMagical:Z
   #97 = NameAndType        #98:#99       // _isMagical:Z
   #98 = Utf8               _isMagical
   #99 = Utf8               Z
  #100 = String             #101          // reduced_soulshot
  #101 = Utf8               reduced_soulshot
  #102 = String             #103          //
  #103 = Utf8
  #104 = Fieldref           #22.#105      // ext/mods/gameserver/model/item/kind/Weapon._reducedSoulshotChance:I
  #105 = NameAndType        #106:#29      // _reducedSoulshotChance:I
  #106 = Utf8               _reducedSoulshotChance
  #107 = Fieldref           #22.#108      // ext/mods/gameserver/model/item/kind/Weapon._reducedSoulshot:I
  #108 = NameAndType        #109:#29      // _reducedSoulshot:I
  #109 = Utf8               _reducedSoulshot
  #110 = String             #111          // enchant4_skill
  #111 = Utf8               enchant4_skill
  #112 = Methodref          #16.#113      // ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
  #113 = NameAndType        #114:#115     // containsKey:(Ljava/lang/Object;)Z
  #114 = Utf8               containsKey
  #115 = Utf8               (Ljava/lang/Object;)Z
  #116 = Methodref          #16.#117      // ext/mods/commons/data/StatSet.getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #117 = NameAndType        #118:#119     // getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #118 = Utf8               getIntIntHolder
  #119 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
  #120 = Fieldref           #22.#121      // ext/mods/gameserver/model/item/kind/Weapon._enchant4Skill:Lext/mods/gameserver/model/holder/IntIntHolder;
  #121 = NameAndType        #122:#123     // _enchant4Skill:Lext/mods/gameserver/model/holder/IntIntHolder;
  #122 = Utf8               _enchant4Skill
  #123 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #124 = String             #125          // oncast_skill
  #125 = Utf8               oncast_skill
  #126 = Fieldref           #22.#127      // ext/mods/gameserver/model/item/kind/Weapon._skillOnMagic:Lext/mods/gameserver/model/holder/IntIntHolder;
  #127 = NameAndType        #128:#123     // _skillOnMagic:Lext/mods/gameserver/model/holder/IntIntHolder;
  #128 = Utf8               _skillOnMagic
  #129 = String             #130          // oncast_chance
  #130 = Utf8               oncast_chance
  #131 = Class              #132          // ext/mods/gameserver/skills/conditions/ConditionGameChance
  #132 = Utf8               ext/mods/gameserver/skills/conditions/ConditionGameChance
  #133 = Methodref          #16.#134      // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #134 = NameAndType        #37:#78       // getInteger:(Ljava/lang/String;)I
  #135 = Methodref          #131.#136     // ext/mods/gameserver/skills/conditions/ConditionGameChance."<init>":(I)V
  #136 = NameAndType        #5:#137       // "<init>":(I)V
  #137 = Utf8               (I)V
  #138 = Fieldref           #22.#139      // ext/mods/gameserver/model/item/kind/Weapon._skillOnMagicCondition:Lext/mods/gameserver/skills/conditions/Condition;
  #139 = NameAndType        #140:#141     // _skillOnMagicCondition:Lext/mods/gameserver/skills/conditions/Condition;
  #140 = Utf8               _skillOnMagicCondition
  #141 = Utf8               Lext/mods/gameserver/skills/conditions/Condition;
  #142 = String             #143          // oncrit_skill
  #143 = Utf8               oncrit_skill
  #144 = Fieldref           #22.#145      // ext/mods/gameserver/model/item/kind/Weapon._skillOnCrit:Lext/mods/gameserver/model/holder/IntIntHolder;
  #145 = NameAndType        #146:#123     // _skillOnCrit:Lext/mods/gameserver/model/holder/IntIntHolder;
  #146 = Utf8               _skillOnCrit
  #147 = String             #148          // oncrit_chance
  #148 = Utf8               oncrit_chance
  #149 = Fieldref           #22.#150      // ext/mods/gameserver/model/item/kind/Weapon._skillOnCritCondition:Lext/mods/gameserver/skills/conditions/Condition;
  #150 = NameAndType        #151:#141     // _skillOnCritCondition:Lext/mods/gameserver/skills/conditions/Condition;
  #151 = Utf8               _skillOnCritCondition
  #152 = Methodref          #22.#153      // ext/mods/gameserver/model/item/kind/Weapon.getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
  #153 = NameAndType        #154:#155     // getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
  #154 = Utf8               getItemType
  #155 = Utf8               ()Lext/mods/gameserver/enums/items/WeaponType;
  #156 = Methodref          #9.#157       // ext/mods/gameserver/enums/items/WeaponType.mask:()I
  #157 = NameAndType        #158:#159     // mask:()I
  #158 = Utf8               mask
  #159 = Utf8               ()I
  #160 = Methodref          #22.#161      // ext/mods/gameserver/model/item/kind/Weapon.getItemId:()I
  #161 = NameAndType        #162:#159     // getItemId:()I
  #162 = Utf8               getItemId
  #163 = Methodref          #164.#165     // ext/mods/commons/random/Rnd.get:(I)I
  #164 = Class              #166          // ext/mods/commons/random/Rnd
  #165 = NameAndType        #167:#168     // get:(I)I
  #166 = Utf8               ext/mods/commons/random/Rnd
  #167 = Utf8               get
  #168 = Utf8               (I)I
  #169 = Methodref          #170.#171     // ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #170 = Class              #172          // ext/mods/gameserver/model/holder/IntIntHolder
  #171 = NameAndType        #173:#174     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #172 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #173 = Utf8               getSkill
  #174 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #175 = Methodref          #176.#177     // ext/mods/gameserver/skills/conditions/Condition.test:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #176 = Class              #178          // ext/mods/gameserver/skills/conditions/Condition
  #177 = NameAndType        #179:#180     // test:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #178 = Utf8               ext/mods/gameserver/skills/conditions/Condition
  #179 = Utf8               test
  #180 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #181 = Methodref          #182.#183     // ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #182 = Class              #184          // ext/mods/gameserver/skills/Formulas
  #183 = NameAndType        #185:#186     // calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #184 = Utf8               ext/mods/gameserver/skills/Formulas
  #185 = Utf8               calcShldUse
  #186 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #187 = Methodref          #182.#188     // ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
  #188 = NameAndType        #189:#190     // calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
  #189 = Utf8               calcSkillSuccess
  #190 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
  #191 = Methodref          #192.#193     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #192 = Class              #194          // ext/mods/gameserver/skills/L2Skill
  #193 = NameAndType        #195:#159     // getId:()I
  #194 = Utf8               ext/mods/gameserver/skills/L2Skill
  #195 = Utf8               getId
  #196 = Methodref          #197.#198     // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #197 = Class              #199          // ext/mods/gameserver/model/actor/Creature
  #198 = NameAndType        #200:#201     // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #199 = Utf8               ext/mods/gameserver/model/actor/Creature
  #200 = Utf8               getFirstEffect
  #201 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #202 = Methodref          #203.#204     // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #203 = Class              #205          // ext/mods/gameserver/skills/AbstractEffect
  #204 = NameAndType        #206:#207     // exit:()V
  #205 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #206 = Utf8               exit
  #207 = Utf8               ()V
  #208 = Methodref          #192.#209     // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #209 = NameAndType        #210:#211     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #210 = Utf8               getEffects
  #211 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #212 = Methodref          #22.#213      // ext/mods/gameserver/model/item/kind/Weapon.isHeroItem:()Z
  #213 = NameAndType        #214:#215     // isHeroItem:()Z
  #214 = Utf8               isHeroItem
  #215 = Utf8               ()Z
  #216 = Methodref          #192.#217     // ext/mods/gameserver/skills/L2Skill.isHealSkill:()Z
  #217 = NameAndType        #218:#215     // isHealSkill:()Z
  #218 = Utf8               isHealSkill
  #219 = Methodref          #192.#220     // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
  #220 = NameAndType        #221:#215     // isOffensive:()Z
  #221 = Utf8               isOffensive
  #222 = Methodref          #192.#223     // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
  #223 = NameAndType        #224:#215     // isToggle:()Z
  #224 = Utf8               isToggle
  #225 = Methodref          #192.#226     // ext/mods/gameserver/skills/L2Skill.isPotion:()Z
  #226 = NameAndType        #227:#215     // isPotion:()Z
  #227 = Utf8               isPotion
  #228 = Class              #229          // ext/mods/gameserver/model/actor/Player
  #229 = Utf8               ext/mods/gameserver/model/actor/Player
  #230 = Fieldref           #231.#232     // ext/mods/gameserver/network/SystemMessageId.S1_HAS_BEEN_ACTIVATED:Lext/mods/gameserver/network/SystemMessageId;
  #231 = Class              #233          // ext/mods/gameserver/network/SystemMessageId
  #232 = NameAndType        #234:#235     // S1_HAS_BEEN_ACTIVATED:Lext/mods/gameserver/network/SystemMessageId;
  #233 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #234 = Utf8               S1_HAS_BEEN_ACTIVATED
  #235 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #236 = Methodref          #237.#238     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #237 = Class              #239          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #238 = NameAndType        #240:#241     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #239 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #240 = Utf8               getSystemMessage
  #241 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #242 = Methodref          #237.#243     // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #243 = NameAndType        #244:#245     // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #244 = Utf8               addSkillName
  #245 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #246 = Methodref          #228.#247     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #247 = NameAndType        #248:#249     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #248 = Utf8               sendPacket
  #249 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #250 = Methodref          #251.#252     // ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
  #251 = Class              #253          // ext/mods/gameserver/handler/SkillHandler
  #252 = NameAndType        #254:#255     // getInstance:()Lext/mods/gameserver/handler/SkillHandler;
  #253 = Utf8               ext/mods/gameserver/handler/SkillHandler
  #254 = Utf8               getInstance
  #255 = Utf8               ()Lext/mods/gameserver/handler/SkillHandler;
  #256 = Methodref          #192.#257     // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #257 = NameAndType        #258:#259     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #258 = Utf8               getSkillType
  #259 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #260 = Methodref          #251.#261     // ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #261 = NameAndType        #262:#263     // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #262 = Utf8               getHandler
  #263 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #264 = InterfaceMethodref #265.#266     // ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #265 = Class              #267          // ext/mods/gameserver/handler/ISkillHandler
  #266 = NameAndType        #268:#269     // useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #267 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #268 = Utf8               useSkill
  #269 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #270 = Methodref          #192.#271     // ext/mods/gameserver/skills/L2Skill.useSkill:(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
  #271 = NameAndType        #268:#272     // useSkill:(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
  #272 = Utf8               (Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
  #273 = Class              #274          // ext/mods/gameserver/model/actor/Npc
  #274 = Utf8               ext/mods/gameserver/model/actor/Npc
  #275 = InvokeDynamic      #0:#276       // #0:accept:([Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #276 = NameAndType        #277:#278     // accept:([Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #277 = Utf8               accept
  #278 = Utf8               ([Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
  #279 = Methodref          #197.#280     // ext/mods/gameserver/model/actor/Creature.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
  #280 = NameAndType        #281:#282     // forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
  #281 = Utf8               forEachKnownTypeInRadius
  #282 = Utf8               (Ljava/lang/Class;ILjava/util/function/Consumer;)V
  #283 = Methodref          #273.#284     // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #284 = NameAndType        #285:#286     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #285 = Utf8               getTemplate
  #286 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #287 = Fieldref           #288.#289     // ext/mods/gameserver/enums/EventHandler.SPELLED:Lext/mods/gameserver/enums/EventHandler;
  #288 = Class              #290          // ext/mods/gameserver/enums/EventHandler
  #289 = NameAndType        #291:#292     // SPELLED:Lext/mods/gameserver/enums/EventHandler;
  #290 = Utf8               ext/mods/gameserver/enums/EventHandler
  #291 = Utf8               SPELLED
  #292 = Utf8               Lext/mods/gameserver/enums/EventHandler;
  #293 = Methodref          #294.#295     // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #294 = Class              #296          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #295 = NameAndType        #297:#298     // getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #296 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #297 = Utf8               getEventQuests
  #298 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #299 = InterfaceMethodref #300.#301     // java/util/List.iterator:()Ljava/util/Iterator;
  #300 = Class              #302          // java/util/List
  #301 = NameAndType        #303:#304     // iterator:()Ljava/util/Iterator;
  #302 = Utf8               java/util/List
  #303 = Utf8               iterator
  #304 = Utf8               ()Ljava/util/Iterator;
  #305 = InterfaceMethodref #306.#307     // java/util/Iterator.hasNext:()Z
  #306 = Class              #308          // java/util/Iterator
  #307 = NameAndType        #309:#215     // hasNext:()Z
  #308 = Utf8               java/util/Iterator
  #309 = Utf8               hasNext
  #310 = InterfaceMethodref #306.#311     // java/util/Iterator.next:()Ljava/lang/Object;
  #311 = NameAndType        #312:#313     // next:()Ljava/lang/Object;
  #312 = Utf8               next
  #313 = Utf8               ()Ljava/lang/Object;
  #314 = Class              #315          // ext/mods/gameserver/scripting/Quest
  #315 = Utf8               ext/mods/gameserver/scripting/Quest
  #316 = Methodref          #314.#317     // ext/mods/gameserver/scripting/Quest.onSpelled:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #317 = NameAndType        #318:#319     // onSpelled:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #318 = Utf8               onSpelled
  #319 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #320 = Methodref          #228.#321     // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #321 = NameAndType        #322:#323     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #322 = Utf8               getSummon
  #323 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #324 = Methodref          #325.#326     // ext/mods/commons/util/ArraysUtil.contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
  #325 = Class              #327          // ext/mods/commons/util/ArraysUtil
  #326 = NameAndType        #328:#329     // contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
  #327 = Utf8               ext/mods/commons/util/ArraysUtil
  #328 = Utf8               contains
  #329 = Utf8               ([Ljava/lang/Object;Ljava/lang/Object;)Z
  #330 = Methodref          #192.#331     // ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
  #331 = NameAndType        #332:#215     // isDebuff:()Z
  #332 = Utf8               isDebuff
  #333 = Fieldref           #288.#334     // ext/mods/gameserver/enums/EventHandler.SEE_SPELL:Lext/mods/gameserver/enums/EventHandler;
  #334 = NameAndType        #335:#292     // SEE_SPELL:Lext/mods/gameserver/enums/EventHandler;
  #335 = Utf8               SEE_SPELL
  #336 = Methodref          #314.#337     // ext/mods/gameserver/scripting/Quest.onSeeSpell:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Z)V
  #337 = NameAndType        #338:#339     // onSeeSpell:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Z)V
  #338 = Utf8               onSeeSpell
  #339 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Z)V
  #340 = Utf8               Code
  #341 = Utf8               LineNumberTable
  #342 = Utf8               LocalVariableTable
  #343 = Utf8               this
  #344 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #345 = Utf8               set
  #346 = Utf8               Lext/mods/commons/data/StatSet;
  #347 = Utf8               reduce
  #348 = Utf8               [Ljava/lang/String;
  #349 = Utf8               reducedSoulshot
  #350 = Utf8               StackMapTable
  #351 = Class              #348          // "[Ljava/lang/String;"
  #352 = Utf8               getItemMask
  #353 = Utf8               getSoulShotCount
  #354 = Utf8               getSpiritShotCount
  #355 = Utf8               getReducedSoulShot
  #356 = Utf8               getReducedSoulShotChance
  #357 = Utf8               getRandomDamage
  #358 = Utf8               getReuseDelay
  #359 = Utf8               isMagical
  #360 = Utf8               isApprenticeWeapon
  #361 = Utf8               isTravelerWeapon
  #362 = Utf8               getMpConsume
  #363 = Utf8               getEnchant4Skill
  #364 = Utf8               castSkillOnCrit
  #365 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #366 = Utf8               caster
  #367 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #368 = Utf8               target
  #369 = Utf8               skillOnCrit
  #370 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #371 = Utf8               sDef
  #372 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #373 = Utf8               effect
  #374 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #375 = Class              #376          // ext/mods/gameserver/enums/skills/ShieldDefense
  #376 = Utf8               ext/mods/gameserver/enums/skills/ShieldDefense
  #377 = Utf8               castSkillOnMagic
  #378 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #379 = Utf8               player
  #380 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #381 = Utf8               quest
  #382 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #383 = Utf8               targetNpc
  #384 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #385 = Utf8               trigger
  #386 = Utf8               skillOnMagic
  #387 = Utf8               targets
  #388 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
  #389 = Utf8               handler
  #390 = Utf8               Lext/mods/gameserver/handler/ISkillHandler;
  #391 = Class              #388          // "[Lext/mods/gameserver/model/actor/Creature;"
  #392 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
  #393 = Utf8               lambda$castSkillOnMagic$0
  #394 = Utf8               ([Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;)V
  #395 = Utf8               i$
  #396 = Utf8               Ljava/util/Iterator;
  #397 = Utf8               npc
  #398 = Utf8               SourceFile
  #399 = Utf8               Weapon.java
  #400 = Utf8               BootstrapMethods
  #401 = MethodType         #402          //  (Ljava/lang/Object;)V
  #402 = Utf8               (Ljava/lang/Object;)V
  #403 = MethodHandle       6:#404        // REF_invokeStatic ext/mods/gameserver/model/item/kind/Weapon.lambda$castSkillOnMagic$0:([Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;)V
  #404 = Methodref          #22.#405      // ext/mods/gameserver/model/item/kind/Weapon.lambda$castSkillOnMagic$0:([Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;)V
  #405 = NameAndType        #393:#394     // lambda$castSkillOnMagic$0:([Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;)V
  #406 = MethodType         #407          //  (Lext/mods/gameserver/model/actor/Npc;)V
  #407 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #408 = MethodHandle       6:#409        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #409 = Methodref          #410.#411     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #410 = Class              #412          // java/lang/invoke/LambdaMetafactory
  #411 = NameAndType        #413:#414     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #412 = Utf8               java/lang/invoke/LambdaMetafactory
  #413 = Utf8               metafactory
  #414 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #415 = Utf8               InnerClasses
  #416 = Class              #417          // java/lang/invoke/MethodHandles$Lookup
  #417 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #418 = Class              #419          // java/lang/invoke/MethodHandles
  #419 = Utf8               java/lang/invoke/MethodHandles
  #420 = Utf8               Lookup
{
  public ext.mods.gameserver.model.item.kind.Weapon(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/item/kind/Item."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: aload_1
         7: ldc           #7                  // String weapon_type
         9: ldc           #9                  // class ext/mods/gameserver/enums/items/WeaponType
        11: getstatic     #11                 // Field ext/mods/gameserver/enums/items/WeaponType.NONE:Lext/mods/gameserver/enums/items/WeaponType;
        14: invokevirtual #15                 // Method ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
        17: checkcast     #9                  // class ext/mods/gameserver/enums/items/WeaponType
        20: putfield      #21                 // Field _type:Lext/mods/gameserver/enums/items/WeaponType;
        23: aload_0
        24: iconst_0
        25: putfield      #26                 // Field _type1:I
        28: aload_0
        29: iconst_0
        30: putfield      #30                 // Field _type2:I
        33: aload_0
        34: aload_1
        35: ldc           #33                 // String soulshots
        37: iconst_0
        38: invokevirtual #35                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        41: putfield      #39                 // Field _soulShotCount:I
        44: aload_0
        45: aload_1
        46: ldc           #42                 // String spiritshots
        48: iconst_0
        49: invokevirtual #35                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        52: putfield      #44                 // Field _spiritShotCount:I
        55: aload_0
        56: aload_1
        57: ldc           #47                 // String random_damage
        59: iconst_0
        60: invokevirtual #35                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        63: putfield      #49                 // Field _rndDam:I
        66: aload_0
        67: aload_1
        68: ldc           #52                 // String mp_consume
        70: iconst_0
        71: invokevirtual #35                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        74: putfield      #54                 // Field _mpConsume:I
        77: aload_1
        78: ldc           #57                 // String mp_consume_reduce
        80: ldc           #59                 // String 0,0
        82: invokevirtual #61                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        85: ldc           #65                 // String ,
        87: invokevirtual #67                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        90: astore_2
        91: aload_0
        92: aload_2
        93: iconst_0
        94: aaload
        95: invokestatic  #73                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        98: putfield      #79                 // Field _mpConsumeReduceRate:I
       101: aload_0
       102: aload_2
       103: iconst_1
       104: aaload
       105: invokestatic  #73                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       108: putfield      #82                 // Field _mpConsumeReduceValue:I
       111: aload_0
       112: aload_1
       113: ldc           #85                 // String reuse_delay
       115: iconst_0
       116: invokevirtual #35                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       119: putfield      #87                 // Field _reuseDelay:I
       122: aload_0
       123: aload_1
       124: ldc           #90                 // String is_magical
       126: iconst_0
       127: invokevirtual #92                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       130: putfield      #96                 // Field _isMagical:Z
       133: aload_1
       134: ldc           #100                // String reduced_soulshot
       136: ldc           #102                // String
       138: invokevirtual #61                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       141: ldc           #65                 // String ,
       143: invokevirtual #67                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       146: astore_3
       147: aload_0
       148: aload_3
       149: arraylength
       150: iconst_2
       151: if_icmpne     163
       154: aload_3
       155: iconst_0
       156: aaload
       157: invokestatic  #73                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       160: goto          164
       163: iconst_0
       164: putfield      #104                // Field _reducedSoulshotChance:I
       167: aload_0
       168: aload_3
       169: arraylength
       170: iconst_2
       171: if_icmpne     183
       174: aload_3
       175: iconst_1
       176: aaload
       177: invokestatic  #73                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       180: goto          184
       183: iconst_0
       184: putfield      #107                // Field _reducedSoulshot:I
       187: aload_1
       188: ldc           #110                // String enchant4_skill
       190: invokevirtual #112                // Method ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
       193: ifeq          206
       196: aload_0
       197: aload_1
       198: ldc           #110                // String enchant4_skill
       200: invokevirtual #116                // Method ext/mods/commons/data/StatSet.getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
       203: putfield      #120                // Field _enchant4Skill:Lext/mods/gameserver/model/holder/IntIntHolder;
       206: aload_1
       207: ldc           #124                // String oncast_skill
       209: invokevirtual #112                // Method ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
       212: ifeq          251
       215: aload_0
       216: aload_1
       217: ldc           #124                // String oncast_skill
       219: invokevirtual #116                // Method ext/mods/commons/data/StatSet.getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
       222: putfield      #126                // Field _skillOnMagic:Lext/mods/gameserver/model/holder/IntIntHolder;
       225: aload_1
       226: ldc           #129                // String oncast_chance
       228: invokevirtual #112                // Method ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
       231: ifeq          251
       234: aload_0
       235: new           #131                // class ext/mods/gameserver/skills/conditions/ConditionGameChance
       238: dup
       239: aload_1
       240: ldc           #129                // String oncast_chance
       242: invokevirtual #133                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       245: invokespecial #135                // Method ext/mods/gameserver/skills/conditions/ConditionGameChance."<init>":(I)V
       248: putfield      #138                // Field _skillOnMagicCondition:Lext/mods/gameserver/skills/conditions/Condition;
       251: aload_1
       252: ldc           #142                // String oncrit_skill
       254: invokevirtual #112                // Method ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
       257: ifeq          296
       260: aload_0
       261: aload_1
       262: ldc           #142                // String oncrit_skill
       264: invokevirtual #116                // Method ext/mods/commons/data/StatSet.getIntIntHolder:(Ljava/lang/String;)Lext/mods/gameserver/model/holder/IntIntHolder;
       267: putfield      #144                // Field _skillOnCrit:Lext/mods/gameserver/model/holder/IntIntHolder;
       270: aload_1
       271: ldc           #147                // String oncrit_chance
       273: invokevirtual #112                // Method ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
       276: ifeq          296
       279: aload_0
       280: new           #131                // class ext/mods/gameserver/skills/conditions/ConditionGameChance
       283: dup
       284: aload_1
       285: ldc           #147                // String oncrit_chance
       287: invokevirtual #133                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       290: invokespecial #135                // Method ext/mods/gameserver/skills/conditions/ConditionGameChance."<init>":(I)V
       293: putfield      #149                // Field _skillOnCritCondition:Lext/mods/gameserver/skills/conditions/Condition;
       296: return
      LineNumberTable:
        line 71: 0
        line 73: 5
        line 74: 23
        line 75: 28
        line 77: 33
        line 78: 44
        line 79: 55
        line 80: 66
        line 82: 77
        line 83: 91
        line 84: 101
        line 86: 111
        line 87: 122
        line 89: 133
        line 90: 147
        line 91: 167
        line 93: 187
        line 94: 196
        line 96: 206
        line 98: 215
        line 100: 225
        line 101: 234
        line 104: 251
        line 106: 260
        line 108: 270
        line 109: 279
        line 111: 296
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     297     0  this   Lext/mods/gameserver/model/item/kind/Weapon;
            0     297     1   set   Lext/mods/commons/data/StatSet;
           91     206     2 reduce   [Ljava/lang/String;
          147     150     3 reducedSoulshot   [Ljava/lang/String;
      StackMapTable: number_of_entries = 7
        frame_type = 255 /* full_frame */
          offset_delta = 163
          locals = [ class ext/mods/gameserver/model/item/kind/Weapon, class ext/mods/commons/data/StatSet, class "[Ljava/lang/String;", class "[Ljava/lang/String;" ]
          stack = [ class ext/mods/gameserver/model/item/kind/Weapon ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/item/kind/Weapon, class ext/mods/commons/data/StatSet, class "[Ljava/lang/String;", class "[Ljava/lang/String;" ]
          stack = [ class ext/mods/gameserver/model/item/kind/Weapon, int ]
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/kind/Weapon ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/item/kind/Weapon, class ext/mods/commons/data/StatSet, class "[Ljava/lang/String;", class "[Ljava/lang/String;" ]
          stack = [ class ext/mods/gameserver/model/item/kind/Weapon, int ]
        frame_type = 21 /* same */
        frame_type = 44 /* same */
        frame_type = 44 /* same */

  public ext.mods.gameserver.enums.items.WeaponType getItemType();
    descriptor: ()Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _type:Lext/mods/gameserver/enums/items/WeaponType;
         4: areturn
      LineNumberTable:
        line 116: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Weapon;

  public int getItemMask();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #152                // Method getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
         4: invokevirtual #156                // Method ext/mods/gameserver/enums/items/WeaponType.mask:()I
         7: ireturn
      LineNumberTable:
        line 122: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/kind/Weapon;

  public int getSoulShotCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _soulShotCount:I
         4: ireturn
      LineNumberTable:
        line 130: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Weapon;

  public int getSpiritShotCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _spiritShotCount:I
         4: ireturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Weapon;

  public int getReducedSoulShot();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #107                // Field _reducedSoulshot:I
         4: ireturn
      LineNumberTable:
        line 146: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Weapon;

  public int getReducedSoulShotChance();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #104                // Field _reducedSoulshotChance:I
         4: ireturn
      LineNumberTable:
        line 154: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Weapon;

  public int getRandomDamage();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #49                 // Field _rndDam:I
         4: ireturn
      LineNumberTable:
        line 162: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Weapon;

  public int getReuseDelay();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #87                 // Field _reuseDelay:I
         4: ireturn
      LineNumberTable:
        line 170: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Weapon;

  public final boolean isMagical();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #96                 // Field _isMagical:Z
         4: ireturn
      LineNumberTable:
        line 178: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Weapon;

  public final boolean isApprenticeWeapon();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #160                // Method getItemId:()I
         4: sipush        7816
         7: if_icmplt     24
        10: aload_0
        11: invokevirtual #160                // Method getItemId:()I
        14: sipush        7821
        17: if_icmpgt     24
        20: iconst_1
        21: goto          25
        24: iconst_0
        25: ireturn
      LineNumberTable:
        line 186: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/item/kind/Weapon;
      StackMapTable: number_of_entries = 2
        frame_type = 24 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isTravelerWeapon();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #160                // Method getItemId:()I
         4: sipush        7822
         7: if_icmplt     24
        10: aload_0
        11: invokevirtual #160                // Method getItemId:()I
        14: sipush        7831
        17: if_icmpgt     24
        20: iconst_1
        21: goto          25
        24: iconst_0
        25: ireturn
      LineNumberTable:
        line 194: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/item/kind/Weapon;
      StackMapTable: number_of_entries = 2
        frame_type = 24 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getMpConsume();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #79                 // Field _mpConsumeReduceRate:I
         4: ifle          24
         7: bipush        100
         9: invokestatic  #163                // Method ext/mods/commons/random/Rnd.get:(I)I
        12: aload_0
        13: getfield      #79                 // Field _mpConsumeReduceRate:I
        16: if_icmpge     24
        19: aload_0
        20: getfield      #82                 // Field _mpConsumeReduceValue:I
        23: ireturn
        24: aload_0
        25: getfield      #54                 // Field _mpConsume:I
        28: ireturn
      LineNumberTable:
        line 202: 0
        line 203: 19
        line 205: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/item/kind/Weapon;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public ext.mods.gameserver.skills.L2Skill getEnchant4Skill();
    descriptor: ()Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #120                // Field _enchant4Skill:Lext/mods/gameserver/model/holder/IntIntHolder;
         4: ifnonnull     11
         7: aconst_null
         8: goto          18
        11: aload_0
        12: getfield      #120                // Field _enchant4Skill:Lext/mods/gameserver/model/holder/IntIntHolder;
        15: invokevirtual #169                // Method ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        18: areturn
      LineNumberTable:
        line 213: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/item/kind/Weapon;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/skills/L2Skill ]

  public void castSkillOnCrit(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=3
         0: aload_0
         1: getfield      #144                // Field _skillOnCrit:Lext/mods/gameserver/model/holder/IntIntHolder;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #144                // Field _skillOnCrit:Lext/mods/gameserver/model/holder/IntIntHolder;
        12: invokevirtual #169                // Method ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        15: astore_3
        16: aload_3
        17: ifnonnull     21
        20: return
        21: aload_0
        22: getfield      #149                // Field _skillOnCritCondition:Lext/mods/gameserver/skills/conditions/Condition;
        25: ifnull        42
        28: aload_0
        29: getfield      #149                // Field _skillOnCritCondition:Lext/mods/gameserver/skills/conditions/Condition;
        32: aload_1
        33: aload_2
        34: aload_3
        35: invokevirtual #175                // Method ext/mods/gameserver/skills/conditions/Condition.test:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
        38: ifne          42
        41: return
        42: aload_1
        43: aload_2
        44: aload_3
        45: iconst_0
        46: invokestatic  #181                // Method ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
        49: astore        4
        51: aload_1
        52: aload_2
        53: aload_3
        54: aload         4
        56: iconst_0
        57: invokestatic  #187                // Method ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
        60: ifne          64
        63: return
        64: aload_2
        65: aload_3
        66: invokevirtual #191                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        69: invokevirtual #196                // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
        72: astore        5
        74: aload         5
        76: ifnull        84
        79: aload         5
        81: invokevirtual #202                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
        84: aload_3
        85: aload_1
        86: aload_2
        87: aload         4
        89: iconst_0
        90: invokevirtual #208                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
        93: pop
        94: return
      LineNumberTable:
        line 223: 0
        line 224: 7
        line 226: 8
        line 227: 16
        line 228: 20
        line 230: 21
        line 231: 41
        line 233: 42
        line 234: 51
        line 235: 63
        line 237: 64
        line 238: 74
        line 239: 79
        line 241: 84
        line 242: 94
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      95     0  this   Lext/mods/gameserver/model/item/kind/Weapon;
            0      95     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0      95     2 target   Lext/mods/gameserver/model/actor/Creature;
           16      79     3 skillOnCrit   Lext/mods/gameserver/skills/L2Skill;
           51      44     4  sDef   Lext/mods/gameserver/enums/skills/ShieldDefense;
           74      21     5 effect   Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 5
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/enums/skills/ShieldDefense ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]

  public void castSkillOnMagic(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=12, args_size=4
         0: aload_0
         1: getfield      #126                // Field _skillOnMagic:Lext/mods/gameserver/model/holder/IntIntHolder;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #126                // Field _skillOnMagic:Lext/mods/gameserver/model/holder/IntIntHolder;
        12: invokevirtual #169                // Method ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        15: astore        4
        17: aload         4
        19: ifnonnull     23
        22: return
        23: aload_0
        24: invokevirtual #212                // Method isHeroItem:()Z
        27: ifeq          49
        30: aload_3
        31: invokevirtual #191                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        34: sipush        2165
        37: if_icmpne     49
        40: aload         4
        42: invokevirtual #216                // Method ext/mods/gameserver/skills/L2Skill.isHealSkill:()Z
        45: ifeq          49
        48: return
        49: aload_3
        50: invokevirtual #219                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
        53: aload         4
        55: invokevirtual #219                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
        58: if_icmpeq     62
        61: return
        62: aload_3
        63: invokevirtual #222                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
        66: ifne          76
        69: aload_3
        70: invokevirtual #225                // Method ext/mods/gameserver/skills/L2Skill.isPotion:()Z
        73: ifeq          77
        76: return
        77: aload_0
        78: getfield      #138                // Field _skillOnMagicCondition:Lext/mods/gameserver/skills/conditions/Condition;
        81: ifnull        99
        84: aload_0
        85: getfield      #138                // Field _skillOnMagicCondition:Lext/mods/gameserver/skills/conditions/Condition;
        88: aload_1
        89: aload_2
        90: aload         4
        92: invokevirtual #175                // Method ext/mods/gameserver/skills/conditions/Condition.test:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
        95: ifne          99
        98: return
        99: aload_1
       100: aload_2
       101: aload         4
       103: iconst_0
       104: invokestatic  #181                // Method ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
       107: astore        5
       109: aload         4
       111: invokevirtual #219                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
       114: ifeq          131
       117: aload_1
       118: aload_2
       119: aload         4
       121: aload         5
       123: iconst_0
       124: invokestatic  #187                // Method ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
       127: ifne          131
       130: return
       131: aload_1
       132: instanceof    #228                // class ext/mods/gameserver/model/actor/Player
       135: ifeq          160
       138: aload_1
       139: checkcast     #228                // class ext/mods/gameserver/model/actor/Player
       142: astore        6
       144: aload         6
       146: getstatic     #230                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_BEEN_ACTIVATED:Lext/mods/gameserver/network/SystemMessageId;
       149: invokestatic  #236                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       152: aload         4
       154: invokevirtual #242                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       157: invokevirtual #246                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       160: iconst_1
       161: anewarray     #197                // class ext/mods/gameserver/model/actor/Creature
       164: dup
       165: iconst_0
       166: aload_2
       167: aastore
       168: astore        6
       170: invokestatic  #250                // Method ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
       173: aload         4
       175: invokevirtual #256                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       178: invokevirtual #260                // Method ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
       181: astore        7
       183: aload         7
       185: ifnull        204
       188: aload         7
       190: aload_1
       191: aload         4
       193: aload         6
       195: aconst_null
       196: invokeinterface #264,  5          // InterfaceMethod ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       201: goto          212
       204: aload         4
       206: aload_1
       207: aload         6
       209: invokevirtual #270                // Method ext/mods/gameserver/skills/L2Skill.useSkill:(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
       212: aload_1
       213: instanceof    #228                // class ext/mods/gameserver/model/actor/Player
       216: ifeq          322
       219: aload_1
       220: checkcast     #228                // class ext/mods/gameserver/model/actor/Player
       223: astore        8
       225: aload_1
       226: ldc_w         #273                // class ext/mods/gameserver/model/actor/Npc
       229: sipush        1000
       232: aload         6
       234: aload         8
       236: aload         4
       238: aload_1
       239: invokedynamic #275,  0            // InvokeDynamic #0:accept:([Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
       244: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
       247: aload         4
       249: invokevirtual #219                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
       252: ifne          322
       255: aload_2
       256: instanceof    #273                // class ext/mods/gameserver/model/actor/Npc
       259: ifeq          322
       262: aload_2
       263: checkcast     #273                // class ext/mods/gameserver/model/actor/Npc
       266: astore        9
       268: aload         9
       270: invokevirtual #283                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       273: getstatic     #287                // Field ext/mods/gameserver/enums/EventHandler.SPELLED:Lext/mods/gameserver/enums/EventHandler;
       276: invokevirtual #293                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       279: invokeinterface #299,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       284: astore        10
       286: aload         10
       288: invokeinterface #305,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       293: ifeq          322
       296: aload         10
       298: invokeinterface #310,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       303: checkcast     #314                // class ext/mods/gameserver/scripting/Quest
       306: astore        11
       308: aload         11
       310: aload         9
       312: aload         8
       314: aload         4
       316: invokevirtual #316                // Method ext/mods/gameserver/scripting/Quest.onSpelled:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
       319: goto          286
       322: return
      LineNumberTable:
        line 252: 0
        line 253: 7
        line 255: 8
        line 256: 17
        line 257: 22
        line 259: 23
        line 260: 48
        line 262: 49
        line 263: 61
        line 265: 62
        line 266: 76
        line 268: 77
        line 269: 98
        line 271: 99
        line 272: 109
        line 273: 130
        line 275: 131
        line 276: 144
        line 278: 160
        line 283: 170
        line 284: 183
        line 285: 188
        line 287: 204
        line 289: 212
        line 291: 225
        line 300: 247
        line 302: 268
        line 303: 308
        line 306: 322
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          144      16     6 player   Lext/mods/gameserver/model/actor/Player;
          308      11    11 quest   Lext/mods/gameserver/scripting/Quest;
          268      54     9 targetNpc   Lext/mods/gameserver/model/actor/Npc;
          225      97     8 player   Lext/mods/gameserver/model/actor/Player;
            0     323     0  this   Lext/mods/gameserver/model/item/kind/Weapon;
            0     323     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     323     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     323     3 trigger   Lext/mods/gameserver/skills/L2Skill;
           17     306     4 skillOnMagic   Lext/mods/gameserver/skills/L2Skill;
          109     214     5  sDef   Lext/mods/gameserver/enums/skills/ShieldDefense;
          170     153     6 targets   [Lext/mods/gameserver/model/actor/Creature;
          183     140     7 handler   Lext/mods/gameserver/handler/ISkillHandler;
      StackMapTable: number_of_entries = 13
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 25 /* same */
        frame_type = 12 /* same */
        frame_type = 13 /* same */
        frame_type = 0 /* same */
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/enums/skills/ShieldDefense ]
        frame_type = 28 /* same */
        frame_type = 253 /* append */
          offset_delta = 43
          locals = [ class "[Lext/mods/gameserver/model/actor/Creature;", class ext/mods/gameserver/handler/ISkillHandler ]
        frame_type = 7 /* same */
        frame_type = 254 /* append */
          offset_delta = 73
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class java/util/Iterator ]
        frame_type = 248 /* chop */
          offset_delta = 35

  public ext.mods.gameserver.enums.items.ItemType getItemType();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemType;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #152                // Method getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
         4: areturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Weapon;
}
SourceFile: "Weapon.java"
BootstrapMethods:
  0: #408 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #401 (Ljava/lang/Object;)V
      #403 REF_invokeStatic ext/mods/gameserver/model/item/kind/Weapon.lambda$castSkillOnMagic$0:([Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;)V
      #406 (Lext/mods/gameserver/model/actor/Npc;)V
InnerClasses:
  public static final #420= #416 of #418; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
