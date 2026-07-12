// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Cancel
// File: ext\mods\gameserver\handler\skillhandlers\Cancel.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Cancel.class
  Last modified 9 de jul de 2026; size 6384 bytes
  MD5 checksum 69f0622ef2f18351cf5de152f1549b6b
  Compiled from "Cancel.java"
public class ext.mods.gameserver.handler.skillhandlers.Cancel implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #144                        // ext/mods/gameserver/handler/skillhandlers/Cancel
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
    #8 = Class              #10           // ext/mods/gameserver/skills/L2Skill
    #9 = NameAndType        #11:#12       // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #10 = Utf8               ext/mods/gameserver/skills/L2Skill
   #11 = Utf8               getSkillType
   #12 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/enums/skills/SkillType.CANCEL:Lext/mods/gameserver/enums/skills/SkillType;
   #14 = Class              #16           // ext/mods/gameserver/enums/skills/SkillType
   #15 = NameAndType        #17:#18       // CANCEL:Lext/mods/gameserver/enums/skills/SkillType;
   #16 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #17 = Utf8               CANCEL
   #18 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #19 = Methodref          #8.#20        // ext/mods/gameserver/skills/L2Skill.getPower:()D
   #20 = NameAndType        #21:#22       // getPower:()D
   #21 = Utf8               getPower
   #22 = Utf8               ()D
   #23 = Class              #24           // ext/mods/gameserver/model/actor/Creature
   #24 = Utf8               ext/mods/gameserver/model/actor/Creature
   #25 = Methodref          #23.#26       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #26 = NameAndType        #27:#28       // isDead:()Z
   #27 = Utf8               isDead
   #28 = Utf8               ()Z
   #29 = Methodref          #8.#30        // ext/mods/gameserver/skills/L2Skill.getMaxNegatedEffects:()I
   #30 = NameAndType        #31:#32       // getMaxNegatedEffects:()I
   #31 = Utf8               getMaxNegatedEffects
   #32 = Utf8               ()I
   #33 = Class              #34           // java/util/ArrayList
   #34 = Utf8               java/util/ArrayList
   #35 = Methodref          #33.#3        // java/util/ArrayList."<init>":()V
   #36 = Methodref          #8.#37        // ext/mods/gameserver/skills/L2Skill.getMagicLevel:()I
   #37 = NameAndType        #38:#32       // getMagicLevel:()I
   #38 = Utf8               getMagicLevel
   #39 = Methodref          #23.#40       // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #40 = NameAndType        #41:#42       // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #41 = Utf8               getStatus
   #42 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/status/CreatureStatus.getLevel:()I
   #44 = Class              #46           // ext/mods/gameserver/model/actor/status/CreatureStatus
   #45 = NameAndType        #47:#32       // getLevel:()I
   #46 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
   #47 = Utf8               getLevel
   #48 = Methodref          #49.#50       // ext/mods/gameserver/skills/Formulas.calcSkillVulnerability:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/SkillType;)D
   #49 = Class              #51           // ext/mods/gameserver/skills/Formulas
   #50 = NameAndType        #52:#53       // calcSkillVulnerability:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/SkillType;)D
   #51 = Utf8               ext/mods/gameserver/skills/Formulas
   #52 = Utf8               calcSkillVulnerability
   #53 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/SkillType;)D
   #54 = Methodref          #23.#55       // ext/mods/gameserver/model/actor/Creature.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
   #55 = NameAndType        #56:#57       // getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
   #56 = Utf8               getAllEffects
   #57 = Utf8               ()[Lext/mods/gameserver/skills/AbstractEffect;
   #58 = Methodref          #59.#60       // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
   #59 = Class              #61           // java/util/Arrays
   #60 = NameAndType        #62:#63       // asList:([Ljava/lang/Object;)Ljava/util/List;
   #61 = Utf8               java/util/Arrays
   #62 = Utf8               asList
   #63 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
   #64 = Methodref          #65.#66       // java/util/Collections.shuffle:(Ljava/util/List;)V
   #65 = Class              #67           // java/util/Collections
   #66 = NameAndType        #68:#69       // shuffle:(Ljava/util/List;)V
   #67 = Utf8               java/util/Collections
   #68 = Utf8               shuffle
   #69 = Utf8               (Ljava/util/List;)V
   #70 = InterfaceMethodref #71.#72       // java/util/List.iterator:()Ljava/util/Iterator;
   #71 = Class              #73           // java/util/List
   #72 = NameAndType        #74:#75       // iterator:()Ljava/util/Iterator;
   #73 = Utf8               java/util/List
   #74 = Utf8               iterator
   #75 = Utf8               ()Ljava/util/Iterator;
   #76 = InterfaceMethodref #77.#78       // java/util/Iterator.hasNext:()Z
   #77 = Class              #79           // java/util/Iterator
   #78 = NameAndType        #80:#28       // hasNext:()Z
   #79 = Utf8               java/util/Iterator
   #80 = Utf8               hasNext
   #81 = InterfaceMethodref #77.#82       // java/util/Iterator.next:()Ljava/lang/Object;
   #82 = NameAndType        #83:#84       // next:()Ljava/lang/Object;
   #83 = Utf8               next
   #84 = Utf8               ()Ljava/lang/Object;
   #85 = Class              #86           // ext/mods/gameserver/skills/AbstractEffect
   #86 = Utf8               ext/mods/gameserver/skills/AbstractEffect
   #87 = Methodref          #85.#88       // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #88 = NameAndType        #89:#90       // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #89 = Utf8               getSkill
   #90 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #91 = Methodref          #8.#92        // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
   #92 = NameAndType        #93:#28       // isToggle:()Z
   #93 = Utf8               isToggle
   #94 = Methodref          #8.#95        // ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
   #95 = NameAndType        #96:#28       // isDebuff:()Z
   #96 = Utf8               isDebuff
   #97 = Methodref          #85.#98       // ext/mods/gameserver/skills/AbstractEffect.getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
   #98 = NameAndType        #99:#100      // getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
   #99 = Utf8               getEffectType
  #100 = Utf8               ()Lext/mods/gameserver/enums/skills/EffectType;
  #101 = Methodref          #102.#103     // ext/mods/gameserver/enums/skills/EffectType.isntCancellable:(Lext/mods/gameserver/enums/skills/EffectType;)Z
  #102 = Class              #104          // ext/mods/gameserver/enums/skills/EffectType
  #103 = NameAndType        #105:#106     // isntCancellable:(Lext/mods/gameserver/enums/skills/EffectType;)Z
  #104 = Utf8               ext/mods/gameserver/enums/skills/EffectType
  #105 = Utf8               isntCancellable
  #106 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)Z
  #107 = Fieldref           #108.#109     // ext/mods/gameserver/handler/skillhandlers/Cancel$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #108 = Class              #110          // ext/mods/gameserver/handler/skillhandlers/Cancel$1
  #109 = NameAndType        #111:#112     // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #110 = Utf8               ext/mods/gameserver/handler/skillhandlers/Cancel$1
  #111 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
  #112 = Utf8               [I
  #113 = Methodref          #14.#114      // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
  #114 = NameAndType        #115:#32      // ordinal:()I
  #115 = Utf8               ordinal
  #116 = String             #117          // casting_time_down
  #117 = Utf8               casting_time_down
  #118 = Methodref          #85.#119      // ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #119 = NameAndType        #120:#121     // getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #120 = Utf8               getTemplate
  #121 = Utf8               ()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #122 = Methodref          #123.#124     // ext/mods/gameserver/skills/effects/EffectTemplate.getStackType:()Ljava/lang/String;
  #123 = Class              #125          // ext/mods/gameserver/skills/effects/EffectTemplate
  #124 = NameAndType        #126:#127     // getStackType:()Ljava/lang/String;
  #125 = Utf8               ext/mods/gameserver/skills/effects/EffectTemplate
  #126 = Utf8               getStackType
  #127 = Utf8               ()Ljava/lang/String;
  #128 = Methodref          #129.#130     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #129 = Class              #131          // java/lang/String
  #130 = NameAndType        #132:#133     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #131 = Utf8               java/lang/String
  #132 = Utf8               equalsIgnoreCase
  #133 = Utf8               (Ljava/lang/String;)Z
  #134 = String             #135          // ma_up
  #135 = Utf8               ma_up
  #136 = String             #137          // attack_time_down
  #137 = Utf8               attack_time_down
  #138 = String             #139          // speed_up
  #139 = Utf8               speed_up
  #140 = Methodref          #85.#141      // ext/mods/gameserver/skills/AbstractEffect.getPeriod:()I
  #141 = NameAndType        #142:#32      // getPeriod:()I
  #142 = Utf8               getPeriod
  #143 = Methodref          #144.#145     // ext/mods/gameserver/handler/skillhandlers/Cancel.calcCancelSuccess:(IIDDII)Z
  #144 = Class              #146          // ext/mods/gameserver/handler/skillhandlers/Cancel
  #145 = NameAndType        #147:#148     // calcCancelSuccess:(IIDDII)Z
  #146 = Utf8               ext/mods/gameserver/handler/skillhandlers/Cancel
  #147 = Utf8               calcCancelSuccess
  #148 = Utf8               (IIDDII)Z
  #149 = InterfaceMethodref #71.#150      // java/util/List.add:(Ljava/lang/Object;)Z
  #150 = NameAndType        #151:#152     // add:(Ljava/lang/Object;)Z
  #151 = Utf8               add
  #152 = Utf8               (Ljava/lang/Object;)Z
  #153 = Methodref          #85.#154      // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #154 = NameAndType        #155:#6       // exit:()V
  #155 = Utf8               exit
  #156 = InterfaceMethodref #71.#157      // java/util/List.isEmpty:()Z
  #157 = NameAndType        #158:#28      // isEmpty:()Z
  #158 = Utf8               isEmpty
  #159 = Methodref          #160.#161     // ext/mods/gameserver/cancelmanager/CancelReturnManager.onCancel:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
  #160 = Class              #162          // ext/mods/gameserver/cancelmanager/CancelReturnManager
  #161 = NameAndType        #163:#164     // onCancel:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
  #162 = Utf8               ext/mods/gameserver/cancelmanager/CancelReturnManager
  #163 = Utf8               onCancel
  #164 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
  #165 = Methodref          #8.#166       // ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
  #166 = NameAndType        #167:#28      // hasSelfEffects:()Z
  #167 = Utf8               hasSelfEffects
  #168 = Methodref          #8.#169       // ext/mods/gameserver/skills/L2Skill.getId:()I
  #169 = NameAndType        #170:#32      // getId:()I
  #170 = Utf8               getId
  #171 = Methodref          #23.#172      // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #172 = NameAndType        #173:#174     // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #173 = Utf8               getFirstEffect
  #174 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #175 = Methodref          #85.#176      // ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
  #176 = NameAndType        #177:#28      // isSelfEffect:()Z
  #177 = Utf8               isSelfEffect
  #178 = Methodref          #8.#179       // ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #179 = NameAndType        #180:#181     // getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #180 = Utf8               getEffectsSelf
  #181 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #182 = Fieldref           #183.#184     // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #183 = Class              #185          // ext/mods/gameserver/enums/items/ShotType
  #184 = NameAndType        #186:#187     // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #185 = Utf8               ext/mods/gameserver/enums/items/ShotType
  #186 = Utf8               BLESSED_SPIRITSHOT
  #187 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
  #188 = Methodref          #23.#189      // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
  #189 = NameAndType        #190:#191     // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
  #190 = Utf8               isChargedShot
  #191 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
  #192 = Fieldref           #183.#193     // ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #193 = NameAndType        #194:#187     // SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #194 = Utf8               SPIRITSHOT
  #195 = Methodref          #8.#196       // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
  #196 = NameAndType        #197:#28      // isStaticReuse:()Z
  #197 = Utf8               isStaticReuse
  #198 = Methodref          #23.#199      // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #199 = NameAndType        #200:#201     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #200 = Utf8               setChargedShot
  #201 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #202 = Fieldref           #203.#204     // ext/mods/Config.DEVELOPER:Z
  #203 = Class              #205          // ext/mods/Config
  #204 = NameAndType        #206:#207     // DEVELOPER:Z
  #205 = Utf8               ext/mods/Config
  #206 = Utf8               DEVELOPER
  #207 = Utf8               Z
  #208 = Fieldref           #144.#209     // ext/mods/gameserver/handler/skillhandlers/Cancel.LOGGER:Lext/mods/commons/logging/CLogger;
  #209 = NameAndType        #210:#211     // LOGGER:Lext/mods/commons/logging/CLogger;
  #210 = Utf8               LOGGER
  #211 = Utf8               Lext/mods/commons/logging/CLogger;
  #212 = String             #213          // calcCancelSuccess(): diffLevel:{}, baseRate:{}, vuln:{}, total:{}.
  #213 = Utf8               calcCancelSuccess(): diffLevel:{}, baseRate:{}, vuln:{}, total:{}.
  #214 = Methodref          #215.#216     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #215 = Class              #217          // java/lang/Integer
  #216 = NameAndType        #218:#219     // valueOf:(I)Ljava/lang/Integer;
  #217 = Utf8               java/lang/Integer
  #218 = Utf8               valueOf
  #219 = Utf8               (I)Ljava/lang/Integer;
  #220 = Methodref          #221.#222     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #221 = Class              #223          // java/lang/Double
  #222 = NameAndType        #218:#224     // valueOf:(D)Ljava/lang/Double;
  #223 = Utf8               java/lang/Double
  #224 = Utf8               (D)Ljava/lang/Double;
  #225 = Methodref          #226.#227     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #226 = Class              #228          // ext/mods/commons/logging/CLogger
  #227 = NameAndType        #229:#230     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #228 = Utf8               ext/mods/commons/logging/CLogger
  #229 = Utf8               info
  #230 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #231 = Methodref          #232.#233     // ext/mods/commons/random/Rnd.get:(I)I
  #232 = Class              #234          // ext/mods/commons/random/Rnd
  #233 = NameAndType        #235:#236     // get:(I)I
  #234 = Utf8               ext/mods/commons/random/Rnd
  #235 = Utf8               get
  #236 = Utf8               (I)I
  #237 = Methodref          #238.#239     // java/lang/Math.clamp:(DDD)D
  #238 = Class              #240          // java/lang/Math
  #239 = NameAndType        #241:#242     // clamp:(DDD)D
  #240 = Utf8               java/lang/Math
  #241 = Utf8               clamp
  #242 = Utf8               (DDD)D
  #243 = Fieldref           #144.#244     // ext/mods/gameserver/handler/skillhandlers/Cancel.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #244 = NameAndType        #245:#246     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #245 = Utf8               SKILL_IDS
  #246 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #247 = Fieldref           #14.#248      // ext/mods/gameserver/enums/skills/SkillType.MAGE_BANE:Lext/mods/gameserver/enums/skills/SkillType;
  #248 = NameAndType        #249:#18      // MAGE_BANE:Lext/mods/gameserver/enums/skills/SkillType;
  #249 = Utf8               MAGE_BANE
  #250 = Fieldref           #14.#251      // ext/mods/gameserver/enums/skills/SkillType.WARRIOR_BANE:Lext/mods/gameserver/enums/skills/SkillType;
  #251 = NameAndType        #252:#18      // WARRIOR_BANE:Lext/mods/gameserver/enums/skills/SkillType;
  #252 = Utf8               WARRIOR_BANE
  #253 = Class              #254          // ext/mods/gameserver/handler/ISkillHandler
  #254 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #255 = Utf8               Code
  #256 = Utf8               LineNumberTable
  #257 = Utf8               LocalVariableTable
  #258 = Utf8               this
  #259 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Cancel;
  #260 = Utf8               useSkill
  #261 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #262 = Utf8               effect
  #263 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #264 = Utf8               targetCreature
  #265 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #266 = Utf8               count
  #267 = Utf8               I
  #268 = Utf8               removedEffects
  #269 = Utf8               Ljava/util/List;
  #270 = Utf8               diffLevel
  #271 = Utf8               skillVuln
  #272 = Utf8               D
  #273 = Utf8               list
  #274 = Utf8               obj
  #275 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #276 = Utf8               creature
  #277 = Utf8               skill
  #278 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #279 = Utf8               targets
  #280 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #281 = Utf8               item
  #282 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #283 = Utf8               minRate
  #284 = Utf8               maxRate
  #285 = Utf8               skillPower
  #286 = Utf8               LocalVariableTypeTable
  #287 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
  #288 = Utf8               StackMapTable
  #289 = Class              #280          // "[Lext/mods/gameserver/model/WorldObject;"
  #290 = Class              #291          // ext/mods/gameserver/model/item/instance/ItemInstance
  #291 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #292 = Class              #293          // ext/mods/gameserver/model/WorldObject
  #293 = Utf8               ext/mods/gameserver/model/WorldObject
  #294 = Utf8               effectPeriod
  #295 = Utf8               baseRate
  #296 = Utf8               vuln
  #297 = Utf8               rate
  #298 = Utf8               getSkillIds
  #299 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #300 = Utf8               <clinit>
  #301 = Utf8               SourceFile
  #302 = Utf8               Cancel.java
  #303 = Utf8               NestMembers
  #304 = Utf8               InnerClasses
{
  public ext.mods.gameserver.handler.skillhandlers.Cancel();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Cancel;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=22, args_size=5
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
         4: getstatic     #13                 // Field ext/mods/gameserver/enums/skills/SkillType.CANCEL:Lext/mods/gameserver/enums/skills/SkillType;
         7: if_acmpne     15
        10: bipush        25
        12: goto          17
        15: bipush        40
        17: istore        5
        19: aload_2
        20: invokevirtual #7                  // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        23: getstatic     #13                 // Field ext/mods/gameserver/enums/skills/SkillType.CANCEL:Lext/mods/gameserver/enums/skills/SkillType;
        26: if_acmpne     34
        29: bipush        75
        31: goto          36
        34: bipush        95
        36: istore        6
        38: aload_2
        39: invokevirtual #19                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
        42: dstore        7
        44: aload_3
        45: astore        9
        47: aload         9
        49: arraylength
        50: istore        10
        52: iconst_0
        53: istore        11
        55: iload         11
        57: iload         10
        59: if_icmpge     407
        62: aload         9
        64: iload         11
        66: aaload
        67: astore        12
        69: aload         12
        71: instanceof    #23                 // class ext/mods/gameserver/model/actor/Creature
        74: ifeq          401
        77: aload         12
        79: checkcast     #23                 // class ext/mods/gameserver/model/actor/Creature
        82: astore        13
        84: aload         13
        86: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        89: ifeq          95
        92: goto          401
        95: aload_2
        96: invokevirtual #29                 // Method ext/mods/gameserver/skills/L2Skill.getMaxNegatedEffects:()I
        99: istore        14
       101: new           #33                 // class java/util/ArrayList
       104: dup
       105: invokespecial #35                 // Method java/util/ArrayList."<init>":()V
       108: astore        15
       110: aload_2
       111: invokevirtual #36                 // Method ext/mods/gameserver/skills/L2Skill.getMagicLevel:()I
       114: aload         13
       116: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       119: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getLevel:()I
       122: isub
       123: istore        16
       125: aload_1
       126: aload         13
       128: aload_2
       129: aload_2
       130: invokevirtual #7                  // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       133: invokestatic  #48                 // Method ext/mods/gameserver/skills/Formulas.calcSkillVulnerability:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/SkillType;)D
       136: dstore        17
       138: aload         13
       140: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Creature.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
       143: invokestatic  #58                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
       146: astore        19
       148: aload         19
       150: invokestatic  #64                 // Method java/util/Collections.shuffle:(Ljava/util/List;)V
       153: aload         19
       155: invokeinterface #70,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       160: astore        20
       162: aload         20
       164: invokeinterface #76,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       169: ifeq          383
       172: aload         20
       174: invokeinterface #81,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       179: checkcast     #85                 // class ext/mods/gameserver/skills/AbstractEffect
       182: astore        21
       184: aload         21
       186: invokevirtual #87                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       189: invokevirtual #91                 // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
       192: ifne          162
       195: aload         21
       197: invokevirtual #87                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       200: invokevirtual #94                 // Method ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
       203: ifeq          209
       206: goto          162
       209: aload         21
       211: invokevirtual #97                 // Method ext/mods/gameserver/skills/AbstractEffect.getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
       214: invokestatic  #101                // Method ext/mods/gameserver/enums/skills/EffectType.isntCancellable:(Lext/mods/gameserver/enums/skills/EffectType;)Z
       217: ifeq          223
       220: goto          162
       223: getstatic     #107                // Field ext/mods/gameserver/handler/skillhandlers/Cancel$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       226: aload_2
       227: invokevirtual #7                  // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       230: invokevirtual #113                // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       233: iaload
       234: lookupswitch  { // 2

                       1: 260

                       2: 298
                 default: 333
            }
       260: ldc           #116                // String casting_time_down
       262: aload         21
       264: invokevirtual #118                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       267: invokevirtual #122                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getStackType:()Ljava/lang/String;
       270: invokevirtual #128                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       273: ifeq          279
       276: goto          333
       279: ldc           #134                // String ma_up
       281: aload         21
       283: invokevirtual #118                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       286: invokevirtual #122                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getStackType:()Ljava/lang/String;
       289: invokevirtual #128                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       292: ifeq          162
       295: goto          333
       298: ldc           #136                // String attack_time_down
       300: aload         21
       302: invokevirtual #118                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       305: invokevirtual #122                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getStackType:()Ljava/lang/String;
       308: invokevirtual #128                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       311: ifeq          317
       314: goto          333
       317: ldc           #138                // String speed_up
       319: aload         21
       321: invokevirtual #118                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       324: invokevirtual #122                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getStackType:()Ljava/lang/String;
       327: invokevirtual #128                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       330: ifeq          162
       333: aload         21
       335: invokevirtual #140                // Method ext/mods/gameserver/skills/AbstractEffect.getPeriod:()I
       338: iload         16
       340: dload         7
       342: dload         17
       344: iload         5
       346: iload         6
       348: invokestatic  #143                // Method calcCancelSuccess:(IIDDII)Z
       351: ifeq          369
       354: aload         15
       356: aload         21
       358: invokeinterface #149,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       363: pop
       364: aload         21
       366: invokevirtual #153                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       369: iinc          14, -1
       372: iload         14
       374: ifne          380
       377: goto          383
       380: goto          162
       383: aload         15
       385: invokeinterface #156,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       390: ifne          401
       393: aload         13
       395: aload_2
       396: aload         15
       398: invokestatic  #159                // Method ext/mods/gameserver/cancelmanager/CancelReturnManager.onCancel:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
       401: iinc          11, 1
       404: goto          55
       407: aload_2
       408: invokevirtual #165                // Method ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
       411: ifeq          448
       414: aload_1
       415: aload_2
       416: invokevirtual #168                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       419: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
       422: astore        9
       424: aload         9
       426: ifnull        442
       429: aload         9
       431: invokevirtual #175                // Method ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
       434: ifeq          442
       437: aload         9
       439: invokevirtual #153                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       442: aload_2
       443: aload_1
       444: invokevirtual #178                // Method ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       447: pop
       448: aload_1
       449: aload_1
       450: getstatic     #182                // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       453: invokevirtual #188                // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
       456: ifeq          465
       459: getstatic     #182                // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       462: goto          468
       465: getstatic     #192                // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       468: aload_2
       469: invokevirtual #195                // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       472: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       475: return
      LineNumberTable:
        line 52: 0
        line 53: 19
        line 55: 38
        line 57: 44
        line 59: 69
        line 62: 84
        line 63: 92
        line 65: 95
        line 66: 101
        line 68: 110
        line 69: 125
        line 71: 138
        line 72: 148
        line 74: 153
        line 76: 184
        line 77: 206
        line 79: 209
        line 80: 220
        line 82: 223
        line 85: 260
        line 86: 276
        line 88: 279
        line 89: 295
        line 94: 298
        line 95: 314
        line 97: 317
        line 103: 333
        line 105: 354
        line 106: 364
        line 109: 369
        line 111: 372
        line 112: 377
        line 113: 380
        line 115: 383
        line 117: 393
        line 57: 401
        line 121: 407
        line 123: 414
        line 124: 424
        line 125: 437
        line 127: 442
        line 129: 448
        line 130: 475
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          184     196    21 effect   Lext/mods/gameserver/skills/AbstractEffect;
           84     317    13 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          101     300    14 count   I
          110     291    15 removedEffects   Ljava/util/List;
          125     276    16 diffLevel   I
          138     263    17 skillVuln   D
          148     253    19  list   Ljava/util/List;
           69     332    12   obj   Lext/mods/gameserver/model/WorldObject;
          424      24     9 effect   Lext/mods/gameserver/skills/AbstractEffect;
            0     476     0  this   Lext/mods/gameserver/handler/skillhandlers/Cancel;
            0     476     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     476     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     476     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     476     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           19     457     5 minRate   I
           38     438     6 maxRate   I
           44     432     7 skillPower   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          110     291    15 removedEffects   Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
          148     253    19  list   Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
      StackMapTable: number_of_entries = 23
        frame_type = 15 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ int ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Cancel, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, double, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 255 /* full_frame */
          offset_delta = 66
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Cancel, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, double, class "[Lext/mods/gameserver/model/WorldObject;", int, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature, int, class java/util/List, int, double, class java/util/List, class java/util/Iterator ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 13 /* same */
        frame_type = 36 /* same */
        frame_type = 18 /* same */
        frame_type = 18 /* same */
        frame_type = 18 /* same */
        frame_type = 15 /* same */
        frame_type = 35 /* same */
        frame_type = 250 /* chop */
          offset_delta = 10
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Cancel, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, double, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Cancel, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, double ]
          stack = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/items/ShotType ]

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #243                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 145: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Cancel;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_3
         1: anewarray     #14                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #13                 // Field ext/mods/gameserver/enums/skills/SkillType.CANCEL:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #247                // Field ext/mods/gameserver/enums/skills/SkillType.MAGE_BANE:Lext/mods/gameserver/enums/skills/SkillType;
        15: aastore
        16: dup
        17: iconst_2
        18: getstatic     #250                // Field ext/mods/gameserver/enums/skills/SkillType.WARRIOR_BANE:Lext/mods/gameserver/enums/skills/SkillType;
        21: aastore
        22: putstatic     #243                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        25: return
      LineNumberTable:
        line 42: 0
}
SourceFile: "Cancel.java"
NestMembers:
  ext/mods/gameserver/handler/skillhandlers/Cancel$1
InnerClasses:
  static #108;                            // class ext/mods/gameserver/handler/skillhandlers/Cancel$1
