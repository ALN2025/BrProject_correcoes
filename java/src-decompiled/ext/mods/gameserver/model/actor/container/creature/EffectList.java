// Bytecode for: ext.mods.gameserver.model.actor.container.creature.EffectList
// File: ext\mods\gameserver\model\actor\container\creature\EffectList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/creature/EffectList.class
  Last modified 9 de jul de 2026; size 18206 bytes
  MD5 checksum f363cac0d851afe803f0b9a2aedf8b46
  Compiled from "EffectList.java"
public class ext.mods.gameserver.model.actor.container.creature.EffectList
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/creature/EffectList
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 14, methods: 28, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/container/creature/EffectList._queuesInitialized:Z
    #8 = Class              #10           // ext/mods/gameserver/model/actor/container/creature/EffectList
    #9 = NameAndType        #11:#12       // _queuesInitialized:Z
   #10 = Utf8               ext/mods/gameserver/model/actor/container/creature/EffectList
   #11 = Utf8               _queuesInitialized
   #12 = Utf8               Z
   #13 = Class              #14           // java/util/concurrent/atomic/AtomicBoolean
   #14 = Utf8               java/util/concurrent/atomic/AtomicBoolean
   #15 = Methodref          #13.#3        // java/util/concurrent/atomic/AtomicBoolean."<init>":()V
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/model/actor/container/creature/EffectList.queueLock:Ljava/util/concurrent/atomic/AtomicBoolean;
   #17 = NameAndType        #18:#19       // queueLock:Ljava/util/concurrent/atomic/AtomicBoolean;
   #18 = Utf8               queueLock
   #19 = Utf8               Ljava/util/concurrent/atomic/AtomicBoolean;
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/model/actor/container/creature/EffectList._partyOnly:Z
   #21 = NameAndType        #22:#12       // _partyOnly:Z
   #22 = Utf8               _partyOnly
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/model/actor/container/creature/EffectList._rebuildCache:Z
   #24 = NameAndType        #25:#12       // _rebuildCache:Z
   #25 = Utf8               _rebuildCache
   #26 = Fieldref           #8.#27        // ext/mods/gameserver/model/actor/container/creature/EffectList._buildEffectLock:Ljava/lang/Object;
   #27 = NameAndType        #28:#29       // _buildEffectLock:Ljava/lang/Object;
   #28 = Utf8               _buildEffectLock
   #29 = Utf8               Ljava/lang/Object;
   #30 = Fieldref           #8.#31        // ext/mods/gameserver/model/actor/container/creature/EffectList._owner:Lext/mods/gameserver/model/actor/Creature;
   #31 = NameAndType        #32:#33       // _owner:Lext/mods/gameserver/model/actor/Creature;
   #32 = Utf8               _owner
   #33 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #34 = Fieldref           #8.#35        // ext/mods/gameserver/model/actor/container/creature/EffectList._buffs:Ljava/util/List;
   #35 = NameAndType        #36:#37       // _buffs:Ljava/util/List;
   #36 = Utf8               _buffs
   #37 = Utf8               Ljava/util/List;
   #38 = InterfaceMethodref #39.#40       // java/util/List.isEmpty:()Z
   #39 = Class              #41           // java/util/List
   #40 = NameAndType        #42:#43       // isEmpty:()Z
   #41 = Utf8               java/util/List
   #42 = Utf8               isEmpty
   #43 = Utf8               ()Z
   #44 = Fieldref           #8.#45        // ext/mods/gameserver/model/actor/container/creature/EffectList._debuffs:Ljava/util/List;
   #45 = NameAndType        #46:#37       // _debuffs:Ljava/util/List;
   #46 = Utf8               _debuffs
   #47 = Fieldref           #8.#48        // ext/mods/gameserver/model/actor/container/creature/EffectList.EMPTY_EFFECTS:[Lext/mods/gameserver/skills/AbstractEffect;
   #48 = NameAndType        #49:#50       // EMPTY_EFFECTS:[Lext/mods/gameserver/skills/AbstractEffect;
   #49 = Utf8               EMPTY_EFFECTS
   #50 = Utf8               [Lext/mods/gameserver/skills/AbstractEffect;
   #51 = Fieldref           #8.#52        // ext/mods/gameserver/model/actor/container/creature/EffectList._effectCache:[Lext/mods/gameserver/skills/AbstractEffect;
   #52 = NameAndType        #53:#50       // _effectCache:[Lext/mods/gameserver/skills/AbstractEffect;
   #53 = Utf8               _effectCache
   #54 = Class              #55           // java/util/ArrayList
   #55 = Utf8               java/util/ArrayList
   #56 = Methodref          #54.#3        // java/util/ArrayList."<init>":()V
   #57 = InterfaceMethodref #39.#58       // java/util/List.addAll:(Ljava/util/Collection;)Z
   #58 = NameAndType        #59:#60       // addAll:(Ljava/util/Collection;)Z
   #59 = Utf8               addAll
   #60 = Utf8               (Ljava/util/Collection;)Z
   #61 = InterfaceMethodref #39.#62       // java/util/List.size:()I
   #62 = NameAndType        #63:#64       // size:()I
   #63 = Utf8               size
   #64 = Utf8               ()I
   #65 = Class              #66           // ext/mods/gameserver/skills/AbstractEffect
   #66 = Utf8               ext/mods/gameserver/skills/AbstractEffect
   #67 = InterfaceMethodref #39.#68       // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #68 = NameAndType        #69:#70       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #69 = Utf8               toArray
   #70 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #71 = InterfaceMethodref #39.#72       // java/util/List.iterator:()Ljava/util/Iterator;
   #72 = NameAndType        #73:#74       // iterator:()Ljava/util/Iterator;
   #73 = Utf8               iterator
   #74 = Utf8               ()Ljava/util/Iterator;
   #75 = InterfaceMethodref #76.#77       // java/util/Iterator.hasNext:()Z
   #76 = Class              #78           // java/util/Iterator
   #77 = NameAndType        #79:#43       // hasNext:()Z
   #78 = Utf8               java/util/Iterator
   #79 = Utf8               hasNext
   #80 = InterfaceMethodref #76.#81       // java/util/Iterator.next:()Ljava/lang/Object;
   #81 = NameAndType        #82:#83       // next:()Ljava/lang/Object;
   #82 = Utf8               next
   #83 = Utf8               ()Ljava/lang/Object;
   #84 = Methodref          #65.#85       // ext/mods/gameserver/skills/AbstractEffect.getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
   #85 = NameAndType        #86:#87       // getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
   #86 = Utf8               getEffectType
   #87 = Utf8               ()Lext/mods/gameserver/enums/skills/EffectType;
   #88 = Methodref          #65.#89       // ext/mods/gameserver/skills/AbstractEffect.getInUse:()Z
   #89 = NameAndType        #90:#43       // getInUse:()Z
   #90 = Utf8               getInUse
   #91 = Methodref          #92.#93       // ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
   #92 = Class              #94           // ext/mods/gameserver/skills/L2Skill
   #93 = NameAndType        #95:#43       // isDebuff:()Z
   #94 = Utf8               ext/mods/gameserver/skills/L2Skill
   #95 = Utf8               isDebuff
   #96 = Methodref          #65.#97       // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #97 = NameAndType        #98:#99       // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #98 = Utf8               getSkill
   #99 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #100 = Methodref          #92.#101      // ext/mods/gameserver/skills/L2Skill.getId:()I
  #101 = NameAndType        #102:#64      // getId:()I
  #102 = Utf8               getId
  #103 = Methodref          #92.#104      // ext/mods/gameserver/skills/L2Skill.getEffectTemplates:()Ljava/util/List;
  #104 = NameAndType        #105:#106     // getEffectTemplates:()Ljava/util/List;
  #105 = Utf8               getEffectTemplates
  #106 = Utf8               ()Ljava/util/List;
  #107 = InterfaceMethodref #39.#108      // java/util/List.get:(I)Ljava/lang/Object;
  #108 = NameAndType        #109:#110     // get:(I)Ljava/lang/Object;
  #109 = Utf8               get
  #110 = Utf8               (I)Ljava/lang/Object;
  #111 = Class              #112          // ext/mods/gameserver/skills/effects/EffectTemplate
  #112 = Utf8               ext/mods/gameserver/skills/effects/EffectTemplate
  #113 = Methodref          #111.#114     // ext/mods/gameserver/skills/effects/EffectTemplate.getStackType:()Ljava/lang/String;
  #114 = NameAndType        #115:#116     // getStackType:()Ljava/lang/String;
  #115 = Utf8               getStackType
  #116 = Utf8               ()Ljava/lang/String;
  #117 = String             #118          // none
  #118 = Utf8               none
  #119 = Methodref          #120.#121     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #120 = Class              #122          // java/lang/String
  #121 = NameAndType        #123:#124     // equals:(Ljava/lang/Object;)Z
  #122 = Utf8               java/lang/String
  #123 = Utf8               equals
  #124 = Utf8               (Ljava/lang/Object;)Z
  #125 = Methodref          #65.#126      // ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #126 = NameAndType        #127:#128     // getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #127 = Utf8               getTemplate
  #128 = Utf8               ()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #129 = Methodref          #111.#130     // ext/mods/gameserver/skills/effects/EffectTemplate.showIcon:()Z
  #130 = NameAndType        #131:#43      // showIcon:()Z
  #131 = Utf8               showIcon
  #132 = Methodref          #92.#133      // ext/mods/gameserver/skills/L2Skill.is7Signs:()Z
  #133 = NameAndType        #134:#43      // is7Signs:()Z
  #134 = Utf8               is7Signs
  #135 = Fieldref           #136.#137     // ext/mods/gameserver/model/actor/container/creature/EffectList$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #136 = Class              #138          // ext/mods/gameserver/model/actor/container/creature/EffectList$1
  #137 = NameAndType        #139:#140     // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #138 = Utf8               ext/mods/gameserver/model/actor/container/creature/EffectList$1
  #139 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
  #140 = Utf8               [I
  #141 = Methodref          #92.#142      // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #142 = NameAndType        #143:#144     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #143 = Utf8               getSkillType
  #144 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #145 = Methodref          #146.#147     // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
  #146 = Class              #148          // ext/mods/gameserver/enums/skills/SkillType
  #147 = NameAndType        #149:#64      // ordinal:()I
  #148 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #149 = Utf8               ordinal
  #150 = Methodref          #92.#151      // ext/mods/gameserver/skills/L2Skill.isDance:()Z
  #151 = NameAndType        #152:#43      // isDance:()Z
  #152 = Utf8               isDance
  #153 = Methodref          #8.#154       // ext/mods/gameserver/model/actor/container/creature/EffectList.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #154 = NameAndType        #155:#156     // getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #155 = Utf8               getAllEffects
  #156 = Utf8               ()[Lext/mods/gameserver/skills/AbstractEffect;
  #157 = Methodref          #65.#158      // ext/mods/gameserver/skills/AbstractEffect.exit:(Z)V
  #158 = NameAndType        #159:#160     // exit:(Z)V
  #159 = Utf8               exit
  #160 = Utf8               (Z)V
  #161 = Methodref          #92.#162      // ext/mods/gameserver/skills/L2Skill.isStayAfterDeath:()Z
  #162 = NameAndType        #163:#43      // isStayAfterDeath:()Z
  #163 = Utf8               isStayAfterDeath
  #164 = Methodref          #92.#165      // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
  #165 = NameAndType        #166:#43      // isToggle:()Z
  #166 = Utf8               isToggle
  #167 = Methodref          #92.#168      // ext/mods/gameserver/skills/L2Skill.isSuperHaste:()Z
  #168 = NameAndType        #169:#43      // isSuperHaste:()Z
  #169 = Utf8               isSuperHaste
  #170 = Methodref          #65.#171      // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #171 = NameAndType        #159:#6       // exit:()V
  #172 = Methodref          #92.#173      // ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
  #173 = NameAndType        #86:#144      // getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
  #174 = Methodref          #92.#175      // ext/mods/gameserver/skills/L2Skill.getEffectAbnormalLvl:()I
  #175 = NameAndType        #176:#64      // getEffectAbnormalLvl:()I
  #176 = Utf8               getEffectAbnormalLvl
  #177 = Methodref          #92.#178      // ext/mods/gameserver/skills/L2Skill.getAbnormalLvl:()I
  #178 = NameAndType        #179:#64      // getAbnormalLvl:()I
  #179 = Utf8               getAbnormalLvl
  #180 = Methodref          #8.#181       // ext/mods/gameserver/model/actor/container/creature/EffectList.queueRunner:()V
  #181 = NameAndType        #182:#6       // queueRunner:()V
  #182 = Utf8               queueRunner
  #183 = Methodref          #8.#184       // ext/mods/gameserver/model/actor/container/creature/EffectList.init:()V
  #184 = NameAndType        #185:#6       // init:()V
  #185 = Utf8               init
  #186 = Fieldref           #8.#187       // ext/mods/gameserver/model/actor/container/creature/EffectList._removeQueue:Ljava/util/concurrent/LinkedBlockingQueue;
  #187 = NameAndType        #188:#189     // _removeQueue:Ljava/util/concurrent/LinkedBlockingQueue;
  #188 = Utf8               _removeQueue
  #189 = Utf8               Ljava/util/concurrent/LinkedBlockingQueue;
  #190 = Methodref          #191.#192     // java/util/concurrent/LinkedBlockingQueue.offer:(Ljava/lang/Object;)Z
  #191 = Class              #193          // java/util/concurrent/LinkedBlockingQueue
  #192 = NameAndType        #194:#124     // offer:(Ljava/lang/Object;)Z
  #193 = Utf8               java/util/concurrent/LinkedBlockingQueue
  #194 = Utf8               offer
  #195 = Fieldref           #8.#196       // ext/mods/gameserver/model/actor/container/creature/EffectList._addQueue:Ljava/util/concurrent/LinkedBlockingQueue;
  #196 = NameAndType        #197:#189     // _addQueue:Ljava/util/concurrent/LinkedBlockingQueue;
  #197 = Utf8               _addQueue
  #198 = Methodref          #191.#3       // java/util/concurrent/LinkedBlockingQueue."<init>":()V
  #199 = Methodref          #13.#200      // java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
  #200 = NameAndType        #201:#202     // compareAndSet:(ZZ)Z
  #201 = Utf8               compareAndSet
  #202 = Utf8               (ZZ)Z
  #203 = Methodref          #191.#204     // java/util/concurrent/LinkedBlockingQueue.poll:()Ljava/lang/Object;
  #204 = NameAndType        #205:#83      // poll:()Ljava/lang/Object;
  #205 = Utf8               poll
  #206 = Methodref          #8.#207       // ext/mods/gameserver/model/actor/container/creature/EffectList.removeEffectFromQueue:(Lext/mods/gameserver/skills/AbstractEffect;)V
  #207 = NameAndType        #208:#209     // removeEffectFromQueue:(Lext/mods/gameserver/skills/AbstractEffect;)V
  #208 = Utf8               removeEffectFromQueue
  #209 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)V
  #210 = Methodref          #8.#211       // ext/mods/gameserver/model/actor/container/creature/EffectList.addEffectFromQueue:(Lext/mods/gameserver/skills/AbstractEffect;)V
  #211 = NameAndType        #212:#209     // addEffectFromQueue:(Lext/mods/gameserver/skills/AbstractEffect;)V
  #212 = Utf8               addEffectFromQueue
  #213 = Methodref          #191.#40      // java/util/concurrent/LinkedBlockingQueue.isEmpty:()Z
  #214 = Methodref          #8.#215       // ext/mods/gameserver/model/actor/container/creature/EffectList.computeEffectFlags:()V
  #215 = NameAndType        #216:#6       // computeEffectFlags:()V
  #216 = Utf8               computeEffectFlags
  #217 = Methodref          #8.#218       // ext/mods/gameserver/model/actor/container/creature/EffectList.updateEffectIcons:()V
  #218 = NameAndType        #219:#6       // updateEffectIcons:()V
  #219 = Utf8               updateEffectIcons
  #220 = Methodref          #13.#221      // java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
  #221 = NameAndType        #222:#160     // set:(Z)V
  #222 = Utf8               set
  #223 = Methodref          #224.#225     // ext/mods/gameserver/model/actor/Creature.removeStatsByOwner:(Ljava/lang/Object;)V
  #224 = Class              #226          // ext/mods/gameserver/model/actor/Creature
  #225 = NameAndType        #227:#228     // removeStatsByOwner:(Ljava/lang/Object;)V
  #226 = Utf8               ext/mods/gameserver/model/actor/Creature
  #227 = Utf8               removeStatsByOwner
  #228 = Utf8               (Ljava/lang/Object;)V
  #229 = Fieldref           #8.#230       // ext/mods/gameserver/model/actor/container/creature/EffectList._stackedEffects:Ljava/util/Map;
  #230 = NameAndType        #231:#232     // _stackedEffects:Ljava/util/Map;
  #231 = Utf8               _stackedEffects
  #232 = Utf8               Ljava/util/Map;
  #233 = InterfaceMethodref #234.#235     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #234 = Class              #236          // java/util/Map
  #235 = NameAndType        #109:#237     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #236 = Utf8               java/util/Map
  #237 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #238 = InterfaceMethodref #39.#239      // java/util/List.indexOf:(Ljava/lang/Object;)I
  #239 = NameAndType        #240:#241     // indexOf:(Ljava/lang/Object;)I
  #240 = Utf8               indexOf
  #241 = Utf8               (Ljava/lang/Object;)I
  #242 = InterfaceMethodref #39.#243      // java/util/List.remove:(Ljava/lang/Object;)Z
  #243 = NameAndType        #244:#124     // remove:(Ljava/lang/Object;)Z
  #244 = Utf8               remove
  #245 = Methodref          #8.#246       // ext/mods/gameserver/model/actor/container/creature/EffectList.listsContains:(Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/skills/AbstractEffect;
  #246 = NameAndType        #247:#248     // listsContains:(Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/skills/AbstractEffect;
  #247 = Utf8               listsContains
  #248 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/skills/AbstractEffect;
  #249 = Methodref          #65.#250      // ext/mods/gameserver/skills/AbstractEffect.setInUse:(Z)Z
  #250 = NameAndType        #251:#252     // setInUse:(Z)Z
  #251 = Utf8               setInUse
  #252 = Utf8               (Z)Z
  #253 = Methodref          #65.#254      // ext/mods/gameserver/skills/AbstractEffect.getStatFuncs:()Ljava/util/List;
  #254 = NameAndType        #255:#106     // getStatFuncs:()Ljava/util/List;
  #255 = Utf8               getStatFuncs
  #256 = Methodref          #224.#257     // ext/mods/gameserver/model/actor/Creature.addStatFuncs:(Ljava/util/List;)V
  #257 = NameAndType        #258:#259     // addStatFuncs:(Ljava/util/List;)V
  #258 = Utf8               addStatFuncs
  #259 = Utf8               (Ljava/util/List;)V
  #260 = InterfaceMethodref #234.#261     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #261 = NameAndType        #244:#237     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #262 = InterfaceMethodref #234.#263     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #263 = NameAndType        #264:#265     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #264 = Utf8               put
  #265 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #266 = Class              #267          // ext/mods/gameserver/model/actor/Player
  #267 = Utf8               ext/mods/gameserver/model/actor/Player
  #268 = Fieldref           #269.#270     // ext/mods/gameserver/network/SystemMessageId.S1_HAS_BEEN_ABORTED:Lext/mods/gameserver/network/SystemMessageId;
  #269 = Class              #271          // ext/mods/gameserver/network/SystemMessageId
  #270 = NameAndType        #272:#273     // S1_HAS_BEEN_ABORTED:Lext/mods/gameserver/network/SystemMessageId;
  #271 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #272 = Utf8               S1_HAS_BEEN_ABORTED
  #273 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #274 = Methodref          #275.#276     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #275 = Class              #277          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #276 = NameAndType        #278:#279     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #277 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #278 = Utf8               getSystemMessage
  #279 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #280 = Methodref          #65.#281      // ext/mods/gameserver/skills/AbstractEffect.getCount:()I
  #281 = NameAndType        #282:#64      // getCount:()I
  #282 = Utf8               getCount
  #283 = Fieldref           #269.#284     // ext/mods/gameserver/network/SystemMessageId.S1_HAS_WORN_OFF:Lext/mods/gameserver/network/SystemMessageId;
  #284 = NameAndType        #285:#273     // S1_HAS_WORN_OFF:Lext/mods/gameserver/network/SystemMessageId;
  #285 = Utf8               S1_HAS_WORN_OFF
  #286 = Fieldref           #269.#287     // ext/mods/gameserver/network/SystemMessageId.EFFECT_S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
  #287 = NameAndType        #288:#273     // EFFECT_S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
  #288 = Utf8               EFFECT_S1_DISAPPEARED
  #289 = Methodref          #275.#290     // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #290 = NameAndType        #291:#292     // addSkillName:(Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #291 = Utf8               addSkillName
  #292 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #293 = Methodref          #224.#294     // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #294 = NameAndType        #295:#296     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #295 = Utf8               sendPacket
  #296 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #297 = Methodref          #65.#298      // ext/mods/gameserver/skills/AbstractEffect.getEffectFlags:()I
  #298 = NameAndType        #299:#64      // getEffectFlags:()I
  #299 = Utf8               getEffectFlags
  #300 = Methodref          #8.#301       // ext/mods/gameserver/model/actor/container/creature/EffectList.isAffected:(I)Z
  #301 = NameAndType        #302:#303     // isAffected:(I)Z
  #302 = Utf8               isAffected
  #303 = Utf8               (I)Z
  #304 = Methodref          #65.#305      // ext/mods/gameserver/skills/AbstractEffect.onSameEffect:(Lext/mods/gameserver/skills/AbstractEffect;)Z
  #305 = NameAndType        #306:#307     // onSameEffect:(Lext/mods/gameserver/skills/AbstractEffect;)Z
  #306 = Utf8               onSameEffect
  #307 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)Z
  #308 = Methodref          #65.#309      // ext/mods/gameserver/skills/AbstractEffect.stopEffectTask:()V
  #309 = NameAndType        #310:#6       // stopEffectTask:()V
  #310 = Utf8               stopEffectTask
  #311 = Class              #312          // java/util/concurrent/CopyOnWriteArrayList
  #312 = Utf8               java/util/concurrent/CopyOnWriteArrayList
  #313 = Methodref          #311.#3       // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
  #314 = Methodref          #65.#315      // ext/mods/gameserver/skills/AbstractEffect.isIdentical:(Lext/mods/gameserver/skills/AbstractEffect;)Z
  #315 = NameAndType        #316:#307     // isIdentical:(Lext/mods/gameserver/skills/AbstractEffect;)Z
  #316 = Utf8               isIdentical
  #317 = InterfaceMethodref #39.#318      // java/util/List.add:(Ljava/lang/Object;)Z
  #318 = NameAndType        #319:#124     // add:(Ljava/lang/Object;)Z
  #319 = Utf8               add
  #320 = Methodref          #65.#321      // ext/mods/gameserver/skills/AbstractEffect.isHerbEffect:()Z
  #321 = NameAndType        #322:#43      // isHerbEffect:()Z
  #322 = Utf8               isHerbEffect
  #323 = Methodref          #8.#324       // ext/mods/gameserver/model/actor/container/creature/EffectList.getBuffCount:()I
  #324 = NameAndType        #325:#64      // getBuffCount:()I
  #325 = Utf8               getBuffCount
  #326 = Methodref          #224.#327     // ext/mods/gameserver/model/actor/Creature.getMaxBuffCount:()I
  #327 = NameAndType        #328:#64      // getMaxBuffCount:()I
  #328 = Utf8               getMaxBuffCount
  #329 = Methodref          #8.#330       // ext/mods/gameserver/model/actor/container/creature/EffectList.doesStack:(Lext/mods/gameserver/skills/L2Skill;)Z
  #330 = NameAndType        #331:#332     // doesStack:(Lext/mods/gameserver/skills/L2Skill;)Z
  #331 = Utf8               doesStack
  #332 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #333 = InterfaceMethodref #39.#334      // java/util/List.add:(ILjava/lang/Object;)V
  #334 = NameAndType        #319:#335     // add:(ILjava/lang/Object;)V
  #335 = Utf8               (ILjava/lang/Object;)V
  #336 = Class              #337          // java/util/HashMap
  #337 = Utf8               java/util/HashMap
  #338 = Methodref          #336.#3       // java/util/HashMap."<init>":()V
  #339 = Methodref          #111.#340     // ext/mods/gameserver/skills/effects/EffectTemplate.getStackOrder:()F
  #340 = NameAndType        #341:#342     // getStackOrder:()F
  #341 = Utf8               getStackOrder
  #342 = Utf8               ()F
  #343 = Fieldref           #344.#345     // ext/mods/Config.EFFECT_CANCELING:Z
  #344 = Class              #346          // ext/mods/Config
  #345 = NameAndType        #347:#12      // EFFECT_CANCELING:Z
  #346 = Utf8               ext/mods/Config
  #347 = Utf8               EFFECT_CANCELING
  #348 = InterfaceMethodref #39.#349      // java/util/List.remove:(I)Ljava/lang/Object;
  #349 = NameAndType        #244:#110     // remove:(I)Ljava/lang/Object;
  #350 = Methodref          #275.#351     // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #351 = NameAndType        #291:#352     // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #352 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #353 = Fieldref           #269.#354     // ext/mods/gameserver/network/SystemMessageId.YOU_FEEL_S1_EFFECT:Lext/mods/gameserver/network/SystemMessageId;
  #354 = NameAndType        #355:#273     // YOU_FEEL_S1_EFFECT:Lext/mods/gameserver/network/SystemMessageId;
  #355 = Utf8               YOU_FEEL_S1_EFFECT
  #356 = Class              #357          // ext/mods/gameserver/model/actor/Playable
  #357 = Utf8               ext/mods/gameserver/model/actor/Playable
  #358 = Class              #359          // ext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate
  #359 = Utf8               ext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate
  #360 = Methodref          #358.#3       // ext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate."<init>":()V
  #361 = Methodref          #266.#362     // ext/mods/gameserver/model/actor/Player.isInParty:()Z
  #362 = NameAndType        #363:#43      // isInParty:()Z
  #363 = Utf8               isInParty
  #364 = Class              #365          // ext/mods/gameserver/network/serverpackets/PartySpelled
  #365 = Utf8               ext/mods/gameserver/network/serverpackets/PartySpelled
  #366 = Methodref          #364.#367     // ext/mods/gameserver/network/serverpackets/PartySpelled."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
  #367 = NameAndType        #5:#368       // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
  #368 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #369 = Methodref          #266.#370     // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #370 = NameAndType        #371:#43      // isInOlympiadMode:()Z
  #371 = Utf8               isInOlympiadMode
  #372 = Methodref          #266.#373     // ext/mods/gameserver/model/actor/Player.isOlympiadStart:()Z
  #373 = NameAndType        #374:#43      // isOlympiadStart:()Z
  #374 = Utf8               isOlympiadStart
  #375 = Class              #376          // ext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo
  #376 = Utf8               ext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo
  #377 = Methodref          #375.#378     // ext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #378 = NameAndType        #5:#379       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #379 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #380 = Class              #381          // ext/mods/gameserver/model/actor/Summon
  #381 = Utf8               ext/mods/gameserver/model/actor/Summon
  #382 = Fieldref           #383.#384     // ext/mods/gameserver/enums/skills/EffectType.SIGNET_GROUND:Lext/mods/gameserver/enums/skills/EffectType;
  #383 = Class              #385          // ext/mods/gameserver/enums/skills/EffectType
  #384 = NameAndType        #386:#387     // SIGNET_GROUND:Lext/mods/gameserver/enums/skills/EffectType;
  #385 = Utf8               ext/mods/gameserver/enums/skills/EffectType
  #386 = Utf8               SIGNET_GROUND
  #387 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
  #388 = Methodref          #65.#389      // ext/mods/gameserver/skills/AbstractEffect.addIcon:(Lext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate;)V
  #389 = NameAndType        #390:#391     // addIcon:(Lext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate;)V
  #390 = Utf8               addIcon
  #391 = Utf8               (Lext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate;)V
  #392 = Methodref          #65.#393      // ext/mods/gameserver/skills/AbstractEffect.addPartySpelledIcon:(Lext/mods/gameserver/network/serverpackets/PartySpelled;)V
  #393 = NameAndType        #394:#395     // addPartySpelledIcon:(Lext/mods/gameserver/network/serverpackets/PartySpelled;)V
  #394 = Utf8               addPartySpelledIcon
  #395 = Utf8               (Lext/mods/gameserver/network/serverpackets/PartySpelled;)V
  #396 = Methodref          #65.#397      // ext/mods/gameserver/skills/AbstractEffect.addOlympiadSpelledIcon:(Lext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo;)V
  #397 = NameAndType        #398:#399     // addOlympiadSpelledIcon:(Lext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo;)V
  #398 = Utf8               addOlympiadSpelledIcon
  #399 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo;)V
  #400 = Methodref          #380.#401     // ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #401 = NameAndType        #402:#403     // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #402 = Utf8               getOwner
  #403 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #404 = Methodref          #266.#405     // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #405 = NameAndType        #406:#407     // getParty:()Lext/mods/gameserver/model/group/Party;
  #406 = Utf8               getParty
  #407 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #408 = Methodref          #409.#410     // ext/mods/gameserver/model/group/Party.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #409 = Class              #411          // ext/mods/gameserver/model/group/Party
  #410 = NameAndType        #412:#296     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #411 = Utf8               ext/mods/gameserver/model/group/Party
  #412 = Utf8               broadcastPacket
  #413 = Methodref          #266.#294     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #414 = Methodref          #415.#416     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #415 = Class              #417          // ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #416 = NameAndType        #418:#419     // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #417 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #418 = Utf8               getInstance
  #419 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #420 = Methodref          #266.#421     // ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
  #421 = NameAndType        #422:#64      // getOlympiadGameId:()I
  #422 = Utf8               getOlympiadGameId
  #423 = Methodref          #415.#424     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getOlympiadTask:(I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #424 = NameAndType        #425:#426     // getOlympiadTask:(I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #425 = Utf8               getOlympiadTask
  #426 = Utf8               (I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #427 = Methodref          #428.#429     // ext/mods/gameserver/model/olympiad/OlympiadGameTask.isBattleStarted:()Z
  #428 = Class              #430          // ext/mods/gameserver/model/olympiad/OlympiadGameTask
  #429 = NameAndType        #431:#43      // isBattleStarted:()Z
  #430 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameTask
  #431 = Utf8               isBattleStarted
  #432 = Methodref          #428.#433     // ext/mods/gameserver/model/olympiad/OlympiadGameTask.getZone:()Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
  #433 = NameAndType        #434:#435     // getZone:()Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
  #434 = Utf8               getZone
  #435 = Utf8               ()Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
  #436 = Methodref          #437.#438     // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacketToObservers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #437 = Class              #439          // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
  #438 = NameAndType        #440:#296     // broadcastPacketToObservers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #439 = Utf8               ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
  #440 = Utf8               broadcastPacketToObservers
  #441 = InterfaceMethodref #39.#442      // java/util/List.contains:(Ljava/lang/Object;)Z
  #442 = NameAndType        #443:#124     // contains:(Ljava/lang/Object;)Z
  #443 = Utf8               contains
  #444 = Fieldref           #8.#445       // ext/mods/gameserver/model/actor/container/creature/EffectList._effectFlags:I
  #445 = NameAndType        #446:#447     // _effectFlags:I
  #446 = Utf8               _effectFlags
  #447 = Utf8               I
  #448 = Methodref          #449.#450     // ext/mods/gameserver/enums/skills/EffectFlag.getMask:()I
  #449 = Class              #451          // ext/mods/gameserver/enums/skills/EffectFlag
  #450 = NameAndType        #452:#64      // getMask:()I
  #451 = Utf8               ext/mods/gameserver/enums/skills/EffectFlag
  #452 = Utf8               getMask
  #453 = Utf8               Signature
  #454 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
  #455 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;>;
  #456 = Utf8               Ljava/util/concurrent/LinkedBlockingQueue<Lext/mods/gameserver/skills/AbstractEffect;>;
  #457 = Utf8               Code
  #458 = Utf8               LineNumberTable
  #459 = Utf8               LocalVariableTable
  #460 = Utf8               this
  #461 = Utf8               Lext/mods/gameserver/model/actor/container/creature/EffectList;
  #462 = Utf8               owner
  #463 = Utf8               temp
  #464 = Utf8               tempArray
  #465 = Utf8               LocalVariableTypeTable
  #466 = Utf8               StackMapTable
  #467 = Class              #468          // java/lang/Throwable
  #468 = Utf8               java/lang/Throwable
  #469 = Utf8               getFirstEffect
  #470 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #471 = Utf8               e
  #472 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #473 = Utf8               tp
  #474 = Utf8               effectNotInUse
  #475 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #476 = Utf8               skill
  #477 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #478 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #479 = Utf8               skillId
  #480 = Utf8               checkSkill
  #481 = Utf8               templates
  #482 = Utf8               stackType
  #483 = Utf8               Ljava/lang/String;
  #484 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/effects/EffectTemplate;>;
  #485 = Utf8               buffCount
  #486 = Utf8               getDanceCount
  #487 = Utf8               danceCount
  #488 = Utf8               stopAllEffects
  #489 = Utf8               effects
  #490 = Class              #50           // "[Lext/mods/gameserver/skills/AbstractEffect;"
  #491 = Utf8               stopAllEffectDebuff
  #492 = Utf8               stopAllEffectsExceptThoseThatLastThroughDeath
  #493 = Utf8               stopAllToggles
  #494 = Utf8               stopEffects
  #495 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)V
  #496 = Utf8               type
  #497 = Utf8               stopSkillEffects
  #498 = Utf8               (I)V
  #499 = Utf8               (Lext/mods/gameserver/enums/skills/SkillType;I)V
  #500 = Utf8               skillType
  #501 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #502 = Utf8               negateLvl
  #503 = Utf8               partyOnly
  #504 = Utf8               queueEffect
  #505 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;Z)V
  #506 = Utf8               effect
  #507 = Utf8               effectList
  #508 = Utf8               newStackedEffect
  #509 = Utf8               stackQueue
  #510 = Utf8               index
  #511 = Utf8               sm
  #512 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #513 = Utf8               effectsToRemove
  #514 = Utf8               pos
  #515 = Utf8               queueIterator
  #516 = Utf8               Ljava/util/Iterator;
  #517 = Utf8               newEffect
  #518 = Utf8               newSkill
  #519 = Utf8               effectToAdd
  #520 = Utf8               effectToRemove
  #521 = Utf8               Ljava/util/Iterator<Lext/mods/gameserver/skills/AbstractEffect;>;
  #522 = Utf8               player
  #523 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #524 = Utf8               summon
  #525 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #526 = Utf8               party
  #527 = Utf8               Lext/mods/gameserver/model/group/Party;
  #528 = Utf8               summonOwner
  #529 = Utf8               game
  #530 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #531 = Utf8               mi
  #532 = Utf8               Lext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate;
  #533 = Utf8               ps
  #534 = Utf8               Lext/mods/gameserver/network/serverpackets/PartySpelled;
  #535 = Utf8               os
  #536 = Utf8               Lext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo;
  #537 = Utf8               flags
  #538 = Utf8               (Lext/mods/gameserver/enums/skills/EffectFlag;)Z
  #539 = Utf8               flag
  #540 = Utf8               Lext/mods/gameserver/enums/skills/EffectFlag;
  #541 = Utf8               mask
  #542 = Utf8               clear
  #543 = Utf8               <clinit>
  #544 = Utf8               SourceFile
  #545 = Utf8               EffectList.java
  #546 = Utf8               NestMembers
  #547 = Utf8               InnerClasses
{
  public ext.mods.gameserver.model.actor.container.creature.EffectList(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field _queuesInitialized:Z
         9: aload_0
        10: new           #13                 // class java/util/concurrent/atomic/AtomicBoolean
        13: dup
        14: invokespecial #15                 // Method java/util/concurrent/atomic/AtomicBoolean."<init>":()V
        17: putfield      #16                 // Field queueLock:Ljava/util/concurrent/atomic/AtomicBoolean;
        20: aload_0
        21: iconst_0
        22: putfield      #20                 // Field _partyOnly:Z
        25: aload_0
        26: iconst_1
        27: putfield      #23                 // Field _rebuildCache:Z
        30: aload_0
        31: new           #2                  // class java/lang/Object
        34: dup
        35: invokespecial #1                  // Method java/lang/Object."<init>":()V
        38: putfield      #26                 // Field _buildEffectLock:Ljava/lang/Object;
        41: aload_0
        42: aload_1
        43: putfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
        46: return
      LineNumberTable:
        line 73: 0
        line 58: 4
        line 61: 9
        line 64: 20
        line 69: 25
        line 70: 30
        line 74: 41
        line 75: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            0      47     1 owner   Lext/mods/gameserver/model/actor/Creature;

  public final ext.mods.gameserver.skills.AbstractEffect[] getAllEffects();
    descriptor: ()[Lext/mods/gameserver/skills/AbstractEffect;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: getfield      #34                 // Field _buffs:Ljava/util/List;
         4: ifnull        19
         7: aload_0
         8: getfield      #34                 // Field _buffs:Ljava/util/List;
        11: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifeq          42
        19: aload_0
        20: getfield      #44                 // Field _debuffs:Ljava/util/List;
        23: ifnull        38
        26: aload_0
        27: getfield      #44                 // Field _debuffs:Ljava/util/List;
        30: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        35: ifeq          42
        38: getstatic     #47                 // Field EMPTY_EFFECTS:[Lext/mods/gameserver/skills/AbstractEffect;
        41: areturn
        42: aload_0
        43: getfield      #26                 // Field _buildEffectLock:Ljava/lang/Object;
        46: dup
        47: astore_1
        48: monitorenter
        49: aload_0
        50: getfield      #23                 // Field _rebuildCache:Z
        53: ifne          63
        56: aload_0
        57: getfield      #51                 // Field _effectCache:[Lext/mods/gameserver/skills/AbstractEffect;
        60: aload_1
        61: monitorexit
        62: areturn
        63: aload_0
        64: iconst_0
        65: putfield      #23                 // Field _rebuildCache:Z
        68: new           #54                 // class java/util/ArrayList
        71: dup
        72: invokespecial #56                 // Method java/util/ArrayList."<init>":()V
        75: astore_2
        76: aload_0
        77: getfield      #34                 // Field _buffs:Ljava/util/List;
        80: ifnull        106
        83: aload_0
        84: getfield      #34                 // Field _buffs:Ljava/util/List;
        87: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        92: ifne          106
        95: aload_2
        96: aload_0
        97: getfield      #34                 // Field _buffs:Ljava/util/List;
       100: invokeinterface #57,  2           // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
       105: pop
       106: aload_0
       107: getfield      #44                 // Field _debuffs:Ljava/util/List;
       110: ifnull        136
       113: aload_0
       114: getfield      #44                 // Field _debuffs:Ljava/util/List;
       117: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       122: ifne          136
       125: aload_2
       126: aload_0
       127: getfield      #44                 // Field _debuffs:Ljava/util/List;
       130: invokeinterface #57,  2           // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
       135: pop
       136: aload_2
       137: invokeinterface #61,  1           // InterfaceMethod java/util/List.size:()I
       142: anewarray     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       145: astore_3
       146: aload_2
       147: aload_3
       148: invokeinterface #67,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       153: pop
       154: aload_0
       155: aload_3
       156: dup_x1
       157: putfield      #51                 // Field _effectCache:[Lext/mods/gameserver/skills/AbstractEffect;
       160: aload_1
       161: monitorexit
       162: areturn
       163: astore        4
       165: aload_1
       166: monitorexit
       167: aload         4
       169: athrow
      Exception table:
         from    to  target type
            49    62   163   any
            63   162   163   any
           163   167   163   any
      LineNumberTable:
        line 83: 0
        line 84: 38
        line 86: 42
        line 88: 49
        line 89: 56
        line 91: 63
        line 93: 68
        line 95: 76
        line 96: 95
        line 97: 106
        line 98: 125
        line 100: 136
        line 101: 146
        line 102: 154
        line 103: 163
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           76      87     2  temp   Ljava/util/List;
          146      17     3 tempArray   [Lext/mods/gameserver/skills/AbstractEffect;
            0     170     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           76      87     2  temp   Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
      StackMapTable: number_of_entries = 7
        frame_type = 19 /* same */
        frame_type = 18 /* same */
        frame_type = 3 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/Object ]
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ class java/util/List ]
        frame_type = 29 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/actor/container/creature/EffectList, class java/lang/Object ]
          stack = [ class java/lang/Throwable ]

  public final ext.mods.gameserver.skills.AbstractEffect getFirstEffect(ext.mods.gameserver.enums.skills.EffectType);
    descriptor: (Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=5, args_size=2
         0: aconst_null
         1: astore_2
         2: aload_0
         3: getfield      #34                 // Field _buffs:Ljava/util/List;
         6: ifnull        85
         9: aload_0
        10: getfield      #34                 // Field _buffs:Ljava/util/List;
        13: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        18: ifne          85
        21: aload_0
        22: getfield      #34                 // Field _buffs:Ljava/util/List;
        25: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        30: astore_3
        31: aload_3
        32: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        37: ifeq          85
        40: aload_3
        41: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        46: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
        49: astore        4
        51: aload         4
        53: ifnonnull     59
        56: goto          31
        59: aload         4
        61: invokevirtual #84                 // Method ext/mods/gameserver/skills/AbstractEffect.getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
        64: aload_1
        65: if_acmpne     82
        68: aload         4
        70: invokevirtual #88                 // Method ext/mods/gameserver/skills/AbstractEffect.getInUse:()Z
        73: ifeq          79
        76: aload         4
        78: areturn
        79: aload         4
        81: astore_2
        82: goto          31
        85: aload_2
        86: ifnonnull     172
        89: aload_0
        90: getfield      #44                 // Field _debuffs:Ljava/util/List;
        93: ifnull        172
        96: aload_0
        97: getfield      #44                 // Field _debuffs:Ljava/util/List;
       100: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       105: ifne          172
       108: aload_0
       109: getfield      #44                 // Field _debuffs:Ljava/util/List;
       112: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       117: astore_3
       118: aload_3
       119: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       124: ifeq          172
       127: aload_3
       128: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       133: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       136: astore        4
       138: aload         4
       140: ifnonnull     146
       143: goto          118
       146: aload         4
       148: invokevirtual #84                 // Method ext/mods/gameserver/skills/AbstractEffect.getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
       151: aload_1
       152: if_acmpne     169
       155: aload         4
       157: invokevirtual #88                 // Method ext/mods/gameserver/skills/AbstractEffect.getInUse:()Z
       160: ifeq          166
       163: aload         4
       165: areturn
       166: aload         4
       168: astore_2
       169: goto          118
       172: aload_2
       173: areturn
      LineNumberTable:
        line 113: 0
        line 115: 2
        line 117: 21
        line 119: 51
        line 120: 56
        line 122: 59
        line 124: 68
        line 125: 76
        line 127: 79
        line 129: 82
        line 132: 85
        line 134: 108
        line 136: 138
        line 137: 143
        line 139: 146
        line 141: 155
        line 142: 163
        line 144: 166
        line 146: 169
        line 148: 172
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      31     4     e   Lext/mods/gameserver/skills/AbstractEffect;
          138      31     4     e   Lext/mods/gameserver/skills/AbstractEffect;
            0     174     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            0     174     1    tp   Lext/mods/gameserver/enums/skills/EffectType;
            2     172     2 effectNotInUse   Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 10
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/skills/AbstractEffect, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 19 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 19 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2

  public final ext.mods.gameserver.skills.AbstractEffect getFirstEffect(ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=5, args_size=2
         0: aconst_null
         1: astore_2
         2: aload_1
         3: invokevirtual #91                 // Method ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
         6: ifeq          95
         9: aload_0
        10: getfield      #44                 // Field _debuffs:Ljava/util/List;
        13: ifnull        178
        16: aload_0
        17: getfield      #44                 // Field _debuffs:Ljava/util/List;
        20: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        25: ifne          178
        28: aload_0
        29: getfield      #44                 // Field _debuffs:Ljava/util/List;
        32: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        37: astore_3
        38: aload_3
        39: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        44: ifeq          92
        47: aload_3
        48: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        53: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
        56: astore        4
        58: aload         4
        60: ifnonnull     66
        63: goto          38
        66: aload         4
        68: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        71: aload_1
        72: if_acmpne     89
        75: aload         4
        77: invokevirtual #88                 // Method ext/mods/gameserver/skills/AbstractEffect.getInUse:()Z
        80: ifeq          86
        83: aload         4
        85: areturn
        86: aload         4
        88: astore_2
        89: goto          38
        92: goto          178
        95: aload_0
        96: getfield      #34                 // Field _buffs:Ljava/util/List;
        99: ifnull        178
       102: aload_0
       103: getfield      #34                 // Field _buffs:Ljava/util/List;
       106: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       111: ifne          178
       114: aload_0
       115: getfield      #34                 // Field _buffs:Ljava/util/List;
       118: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       123: astore_3
       124: aload_3
       125: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       130: ifeq          178
       133: aload_3
       134: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       139: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       142: astore        4
       144: aload         4
       146: ifnonnull     152
       149: goto          124
       152: aload         4
       154: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       157: aload_1
       158: if_acmpne     175
       161: aload         4
       163: invokevirtual #88                 // Method ext/mods/gameserver/skills/AbstractEffect.getInUse:()Z
       166: ifeq          172
       169: aload         4
       171: areturn
       172: aload         4
       174: astore_2
       175: goto          124
       178: aload_2
       179: areturn
      LineNumberTable:
        line 158: 0
        line 160: 2
        line 162: 9
        line 164: 28
        line 166: 58
        line 167: 63
        line 169: 66
        line 171: 75
        line 172: 83
        line 174: 86
        line 176: 89
        line 181: 95
        line 183: 114
        line 185: 144
        line 186: 149
        line 188: 152
        line 190: 161
        line 191: 169
        line 193: 172
        line 195: 175
        line 198: 178
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           58      31     4     e   Lext/mods/gameserver/skills/AbstractEffect;
          144      31     4     e   Lext/mods/gameserver/skills/AbstractEffect;
            0     180     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            0     180     1 skill   Lext/mods/gameserver/skills/L2Skill;
            2     178     2 effectNotInUse   Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 11
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/skills/AbstractEffect, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 19 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 19 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2

  public final ext.mods.gameserver.skills.AbstractEffect getFirstEffect(int);
    descriptor: (I)Lext/mods/gameserver/skills/AbstractEffect;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=5, args_size=2
         0: aconst_null
         1: astore_2
         2: aload_0
         3: getfield      #34                 // Field _buffs:Ljava/util/List;
         6: ifnull        88
         9: aload_0
        10: getfield      #34                 // Field _buffs:Ljava/util/List;
        13: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        18: ifne          88
        21: aload_0
        22: getfield      #34                 // Field _buffs:Ljava/util/List;
        25: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        30: astore_3
        31: aload_3
        32: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        37: ifeq          88
        40: aload_3
        41: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        46: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
        49: astore        4
        51: aload         4
        53: ifnonnull     59
        56: goto          31
        59: aload         4
        61: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        64: invokevirtual #100                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        67: iload_1
        68: if_icmpne     85
        71: aload         4
        73: invokevirtual #88                 // Method ext/mods/gameserver/skills/AbstractEffect.getInUse:()Z
        76: ifeq          82
        79: aload         4
        81: areturn
        82: aload         4
        84: astore_2
        85: goto          31
        88: aload_2
        89: ifnonnull     178
        92: aload_0
        93: getfield      #44                 // Field _debuffs:Ljava/util/List;
        96: ifnull        178
        99: aload_0
       100: getfield      #44                 // Field _debuffs:Ljava/util/List;
       103: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       108: ifne          178
       111: aload_0
       112: getfield      #44                 // Field _debuffs:Ljava/util/List;
       115: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       120: astore_3
       121: aload_3
       122: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       127: ifeq          178
       130: aload_3
       131: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       136: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       139: astore        4
       141: aload         4
       143: ifnonnull     149
       146: goto          121
       149: aload         4
       151: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       154: invokevirtual #100                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       157: iload_1
       158: if_icmpne     175
       161: aload         4
       163: invokevirtual #88                 // Method ext/mods/gameserver/skills/AbstractEffect.getInUse:()Z
       166: ifeq          172
       169: aload         4
       171: areturn
       172: aload         4
       174: astore_2
       175: goto          121
       178: aload_2
       179: areturn
      LineNumberTable:
        line 207: 0
        line 209: 2
        line 211: 21
        line 213: 51
        line 214: 56
        line 216: 59
        line 218: 71
        line 219: 79
        line 221: 82
        line 223: 85
        line 226: 88
        line 228: 111
        line 230: 141
        line 231: 146
        line 232: 149
        line 234: 161
        line 235: 169
        line 237: 172
        line 239: 175
        line 241: 178
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      34     4     e   Lext/mods/gameserver/skills/AbstractEffect;
          141      34     4     e   Lext/mods/gameserver/skills/AbstractEffect;
            0     180     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            0     180     1 skillId   I
            2     178     2 effectNotInUse   Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 10
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/skills/AbstractEffect, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 22 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 22 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2

  public int getBuffCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: aload_0
         1: getfield      #34                 // Field _buffs:Ljava/util/List;
         4: ifnull        19
         7: aload_0
         8: getfield      #34                 // Field _buffs:Ljava/util/List;
        11: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifeq          21
        19: iconst_0
        20: ireturn
        21: iconst_0
        22: istore_1
        23: aload_0
        24: getfield      #34                 // Field _buffs:Ljava/util/List;
        27: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        32: astore_2
        33: aload_2
        34: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        39: ifeq          134
        42: aload_2
        43: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        48: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
        51: astore_3
        52: aload_3
        53: ifnull        131
        56: aload_3
        57: invokevirtual #125                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
        60: invokevirtual #129                // Method ext/mods/gameserver/skills/effects/EffectTemplate.showIcon:()Z
        63: ifeq          131
        66: aload_3
        67: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        70: invokevirtual #132                // Method ext/mods/gameserver/skills/L2Skill.is7Signs:()Z
        73: ifne          131
        76: getstatic     #135                // Field ext/mods/gameserver/model/actor/container/creature/EffectList$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        79: aload_3
        80: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        83: invokevirtual #141                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        86: invokevirtual #145                // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        89: iaload
        90: tableswitch   { // 1 to 6

                       1: 128

                       2: 128

                       3: 128

                       4: 128

                       5: 128

                       6: 128
                 default: 131
            }
       128: iinc          1, 1
       131: goto          33
       134: iload_1
       135: ireturn
      LineNumberTable:
        line 276: 0
        line 277: 19
        line 279: 21
        line 280: 23
        line 282: 52
        line 284: 76
        line 287: 128
        line 290: 131
        line 291: 134
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           52      79     3     e   Lext/mods/gameserver/skills/AbstractEffect;
            0     136     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
           23     113     1 buffCount   I
      StackMapTable: number_of_entries = 6
        frame_type = 19 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 11
          locals = [ int, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 94
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2

  public int getDanceCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=1
         0: aload_0
         1: getfield      #34                 // Field _buffs:Ljava/util/List;
         4: ifnull        19
         7: aload_0
         8: getfield      #34                 // Field _buffs:Ljava/util/List;
        11: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifeq          21
        19: iconst_0
        20: ireturn
        21: iconst_0
        22: istore_1
        23: aload_0
        24: getfield      #34                 // Field _buffs:Ljava/util/List;
        27: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        32: astore_2
        33: aload_2
        34: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        39: ifeq          79
        42: aload_2
        43: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        48: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
        51: astore_3
        52: aload_3
        53: ifnull        76
        56: aload_3
        57: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        60: invokevirtual #150                // Method ext/mods/gameserver/skills/L2Skill.isDance:()Z
        63: ifeq          76
        66: aload_3
        67: invokevirtual #88                 // Method ext/mods/gameserver/skills/AbstractEffect.getInUse:()Z
        70: ifeq          76
        73: iinc          1, 1
        76: goto          33
        79: iload_1
        80: ireturn
      LineNumberTable:
        line 300: 0
        line 301: 19
        line 303: 21
        line 304: 23
        line 306: 52
        line 307: 73
        line 308: 76
        line 309: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           52      24     3     e   Lext/mods/gameserver/skills/AbstractEffect;
            0      81     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
           23      58     1 danceCount   I
      StackMapTable: number_of_entries = 5
        frame_type = 19 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 11
          locals = [ int, class java/util/Iterator ]
        frame_type = 42 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public final void stopAllEffects();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=6, args_size=1
         0: aload_0
         1: invokevirtual #153                // Method getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
         4: astore_1
         5: aload_1
         6: astore_2
         7: aload_2
         8: arraylength
         9: istore_3
        10: iconst_0
        11: istore        4
        13: iload         4
        15: iload_3
        16: if_icmpge     42
        19: aload_2
        20: iload         4
        22: aaload
        23: astore        5
        25: aload         5
        27: ifnull        36
        30: aload         5
        32: iconst_1
        33: invokevirtual #157                // Method ext/mods/gameserver/skills/AbstractEffect.exit:(Z)V
        36: iinc          4, 1
        39: goto          13
        42: return
      LineNumberTable:
        line 317: 0
        line 319: 5
        line 321: 25
        line 322: 30
        line 319: 36
        line 324: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      11     5     e   Lext/mods/gameserver/skills/AbstractEffect;
            0      43     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            5      38     1 effects   [Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/creature/EffectList, class "[Lext/mods/gameserver/skills/AbstractEffect;", class "[Lext/mods/gameserver/skills/AbstractEffect;", int, int ]
          stack = []
        frame_type = 22 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public final void stopAllEffectDebuff();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=6, args_size=1
         0: aload_0
         1: invokevirtual #153                // Method getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
         4: astore_1
         5: aload_1
         6: astore_2
         7: aload_2
         8: arraylength
         9: istore_3
        10: iconst_0
        11: istore        4
        13: iload         4
        15: iload_3
        16: if_icmpge     53
        19: aload_2
        20: iload         4
        22: aaload
        23: astore        5
        25: aload         5
        27: ifnull        47
        30: aload         5
        32: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        35: invokevirtual #91                 // Method ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
        38: ifeq          47
        41: aload         5
        43: iconst_1
        44: invokevirtual #157                // Method ext/mods/gameserver/skills/AbstractEffect.exit:(Z)V
        47: iinc          4, 1
        50: goto          13
        53: return
      LineNumberTable:
        line 328: 0
        line 330: 5
        line 332: 25
        line 333: 41
        line 330: 47
        line 335: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      22     5     e   Lext/mods/gameserver/skills/AbstractEffect;
            0      54     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            5      49     1 effects   [Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/creature/EffectList, class "[Lext/mods/gameserver/skills/AbstractEffect;", class "[Lext/mods/gameserver/skills/AbstractEffect;", int, int ]
          stack = []
        frame_type = 33 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public final void stopAllEffectsExceptThoseThatLastThroughDeath();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=6, args_size=1
         0: aload_0
         1: invokevirtual #153                // Method getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
         4: astore_1
         5: aload_1
         6: astore_2
         7: aload_2
         8: arraylength
         9: istore_3
        10: iconst_0
        11: istore        4
        13: iload         4
        15: iload_3
        16: if_icmpge     53
        19: aload_2
        20: iload         4
        22: aaload
        23: astore        5
        25: aload         5
        27: ifnull        47
        30: aload         5
        32: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        35: invokevirtual #161                // Method ext/mods/gameserver/skills/L2Skill.isStayAfterDeath:()Z
        38: ifne          47
        41: aload         5
        43: iconst_1
        44: invokevirtual #157                // Method ext/mods/gameserver/skills/AbstractEffect.exit:(Z)V
        47: iinc          4, 1
        50: goto          13
        53: return
      LineNumberTable:
        line 342: 0
        line 344: 5
        line 346: 25
        line 347: 41
        line 344: 47
        line 349: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      22     5     e   Lext/mods/gameserver/skills/AbstractEffect;
            0      54     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            5      49     1 effects   [Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/container/creature/EffectList, class "[Lext/mods/gameserver/skills/AbstractEffect;", class "[Lext/mods/gameserver/skills/AbstractEffect;", int, int ]
          stack = []
        frame_type = 33 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public void stopAllToggles();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #34                 // Field _buffs:Ljava/util/List;
         4: ifnull        79
         7: aload_0
         8: getfield      #34                 // Field _buffs:Ljava/util/List;
        11: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifne          79
        19: aload_0
        20: getfield      #34                 // Field _buffs:Ljava/util/List;
        23: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        28: astore_1
        29: aload_1
        30: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        35: ifeq          79
        38: aload_1
        39: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        44: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
        47: astore_2
        48: aload_2
        49: ifnull        76
        52: aload_2
        53: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        56: invokevirtual #164                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
        59: ifeq          76
        62: aload_2
        63: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        66: invokevirtual #167                // Method ext/mods/gameserver/skills/L2Skill.isSuperHaste:()Z
        69: ifne          76
        72: aload_2
        73: invokevirtual #170                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
        76: goto          29
        79: return
      LineNumberTable:
        line 356: 0
        line 358: 19
        line 360: 48
        line 361: 72
        line 362: 76
        line 364: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           48      28     2     e   Lext/mods/gameserver/skills/AbstractEffect;
            0      80     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/util/Iterator ]
        frame_type = 46 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public final void stopEffects(ext.mods.gameserver.enums.skills.EffectType);
    descriptor: (Lext/mods/gameserver/enums/skills/EffectType;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #34                 // Field _buffs:Ljava/util/List;
         4: ifnull        67
         7: aload_0
         8: getfield      #34                 // Field _buffs:Ljava/util/List;
        11: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifne          67
        19: aload_0
        20: getfield      #34                 // Field _buffs:Ljava/util/List;
        23: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        28: astore_2
        29: aload_2
        30: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        35: ifeq          67
        38: aload_2
        39: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        44: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
        47: astore_3
        48: aload_3
        49: ifnull        64
        52: aload_3
        53: invokevirtual #84                 // Method ext/mods/gameserver/skills/AbstractEffect.getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
        56: aload_1
        57: if_acmpne     64
        60: aload_3
        61: invokevirtual #170                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
        64: goto          29
        67: aload_0
        68: getfield      #44                 // Field _debuffs:Ljava/util/List;
        71: ifnull        134
        74: aload_0
        75: getfield      #44                 // Field _debuffs:Ljava/util/List;
        78: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        83: ifne          134
        86: aload_0
        87: getfield      #44                 // Field _debuffs:Ljava/util/List;
        90: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        95: astore_2
        96: aload_2
        97: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       102: ifeq          134
       105: aload_2
       106: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       111: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       114: astore_3
       115: aload_3
       116: ifnull        131
       119: aload_3
       120: invokevirtual #84                 // Method ext/mods/gameserver/skills/AbstractEffect.getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
       123: aload_1
       124: if_acmpne     131
       127: aload_3
       128: invokevirtual #170                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       131: goto          96
       134: return
      LineNumberTable:
        line 372: 0
        line 374: 19
        line 376: 48
        line 377: 60
        line 378: 64
        line 381: 67
        line 383: 86
        line 385: 115
        line 386: 127
        line 387: 131
        line 389: 134
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           48      16     3     e   Lext/mods/gameserver/skills/AbstractEffect;
          115      16     3     e   Lext/mods/gameserver/skills/AbstractEffect;
            0     135     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            0     135     1  type   Lext/mods/gameserver/enums/skills/EffectType;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/util/Iterator ]
        frame_type = 34 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/util/Iterator ]
        frame_type = 34 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public final void stopSkillEffects(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #34                 // Field _buffs:Ljava/util/List;
         4: ifnull        70
         7: aload_0
         8: getfield      #34                 // Field _buffs:Ljava/util/List;
        11: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifne          70
        19: aload_0
        20: getfield      #34                 // Field _buffs:Ljava/util/List;
        23: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        28: astore_2
        29: aload_2
        30: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        35: ifeq          70
        38: aload_2
        39: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        44: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
        47: astore_3
        48: aload_3
        49: ifnull        67
        52: aload_3
        53: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        56: invokevirtual #100                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        59: iload_1
        60: if_icmpne     67
        63: aload_3
        64: invokevirtual #170                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
        67: goto          29
        70: aload_0
        71: getfield      #44                 // Field _debuffs:Ljava/util/List;
        74: ifnull        140
        77: aload_0
        78: getfield      #44                 // Field _debuffs:Ljava/util/List;
        81: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        86: ifne          140
        89: aload_0
        90: getfield      #44                 // Field _debuffs:Ljava/util/List;
        93: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        98: astore_2
        99: aload_2
       100: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       105: ifeq          140
       108: aload_2
       109: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       114: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       117: astore_3
       118: aload_3
       119: ifnull        137
       122: aload_3
       123: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       126: invokevirtual #100                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       129: iload_1
       130: if_icmpne     137
       133: aload_3
       134: invokevirtual #170                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       137: goto          99
       140: return
      LineNumberTable:
        line 397: 0
        line 399: 19
        line 401: 48
        line 402: 63
        line 403: 67
        line 406: 70
        line 408: 89
        line 410: 118
        line 411: 133
        line 412: 137
        line 414: 140
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           48      19     3     e   Lext/mods/gameserver/skills/AbstractEffect;
          118      19     3     e   Lext/mods/gameserver/skills/AbstractEffect;
            0     141     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            0     141     1 skillId   I
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/util/Iterator ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/util/Iterator ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public final void stopSkillEffects(ext.mods.gameserver.enums.skills.SkillType, int);
    descriptor: (Lext/mods/gameserver/enums/skills/SkillType;I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=5, args_size=3
         0: aload_0
         1: getfield      #34                 // Field _buffs:Ljava/util/List;
         4: ifnull        159
         7: aload_0
         8: getfield      #34                 // Field _buffs:Ljava/util/List;
        11: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifne          159
        19: aload_0
        20: getfield      #34                 // Field _buffs:Ljava/util/List;
        23: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        28: astore_3
        29: aload_3
        30: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        35: ifeq          159
        38: aload_3
        39: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        44: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
        47: astore        4
        49: aload         4
        51: ifnull        156
        54: aload         4
        56: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        59: invokevirtual #141                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        62: aload_1
        63: if_acmpeq     89
        66: aload         4
        68: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        71: invokevirtual #172                // Method ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
        74: ifnull        156
        77: aload         4
        79: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        82: invokevirtual #172                // Method ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
        85: aload_1
        86: if_acmpne     156
        89: iload_2
        90: iconst_m1
        91: if_icmpeq     151
        94: aload         4
        96: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        99: invokevirtual #172                // Method ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
       102: ifnull        128
       105: aload         4
       107: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       110: invokevirtual #174                // Method ext/mods/gameserver/skills/L2Skill.getEffectAbnormalLvl:()I
       113: iflt          128
       116: aload         4
       118: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       121: invokevirtual #174                // Method ext/mods/gameserver/skills/L2Skill.getEffectAbnormalLvl:()I
       124: iload_2
       125: if_icmple     151
       128: aload         4
       130: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       133: invokevirtual #177                // Method ext/mods/gameserver/skills/L2Skill.getAbnormalLvl:()I
       136: iflt          156
       139: aload         4
       141: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       144: invokevirtual #177                // Method ext/mods/gameserver/skills/L2Skill.getAbnormalLvl:()I
       147: iload_2
       148: if_icmpgt     156
       151: aload         4
       153: invokevirtual #170                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       156: goto          29
       159: aload_0
       160: getfield      #44                 // Field _debuffs:Ljava/util/List;
       163: ifnull        318
       166: aload_0
       167: getfield      #44                 // Field _debuffs:Ljava/util/List;
       170: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       175: ifne          318
       178: aload_0
       179: getfield      #44                 // Field _debuffs:Ljava/util/List;
       182: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       187: astore_3
       188: aload_3
       189: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       194: ifeq          318
       197: aload_3
       198: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       203: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       206: astore        4
       208: aload         4
       210: ifnull        315
       213: aload         4
       215: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       218: invokevirtual #141                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       221: aload_1
       222: if_acmpeq     248
       225: aload         4
       227: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       230: invokevirtual #172                // Method ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
       233: ifnull        315
       236: aload         4
       238: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       241: invokevirtual #172                // Method ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
       244: aload_1
       245: if_acmpne     315
       248: iload_2
       249: iconst_m1
       250: if_icmpeq     310
       253: aload         4
       255: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       258: invokevirtual #172                // Method ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
       261: ifnull        287
       264: aload         4
       266: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       269: invokevirtual #174                // Method ext/mods/gameserver/skills/L2Skill.getEffectAbnormalLvl:()I
       272: iflt          287
       275: aload         4
       277: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       280: invokevirtual #174                // Method ext/mods/gameserver/skills/L2Skill.getEffectAbnormalLvl:()I
       283: iload_2
       284: if_icmple     310
       287: aload         4
       289: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       292: invokevirtual #177                // Method ext/mods/gameserver/skills/L2Skill.getAbnormalLvl:()I
       295: iflt          315
       298: aload         4
       300: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       303: invokevirtual #177                // Method ext/mods/gameserver/skills/L2Skill.getAbnormalLvl:()I
       306: iload_2
       307: if_icmpgt     315
       310: aload         4
       312: invokevirtual #170                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       315: goto          188
       318: return
      LineNumberTable:
        line 423: 0
        line 425: 19
        line 427: 49
        line 428: 151
        line 429: 156
        line 432: 159
        line 434: 178
        line 436: 208
        line 437: 310
        line 438: 315
        line 440: 318
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49     107     4     e   Lext/mods/gameserver/skills/AbstractEffect;
          208     107     4     e   Lext/mods/gameserver/skills/AbstractEffect;
            0     319     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            0     319     1 skillType   Lext/mods/gameserver/enums/skills/SkillType;
            0     319     2 negateLvl   I
      StackMapTable: number_of_entries = 12
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 38 /* same */
        frame_type = 22 /* same */
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 38 /* same */
        frame_type = 22 /* same */
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 250 /* chop */
          offset_delta = 2

  public void updateEffectIcons(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #34                 // Field _buffs:Ljava/util/List;
         4: ifnonnull     15
         7: aload_0
         8: getfield      #44                 // Field _debuffs:Ljava/util/List;
        11: ifnonnull     15
        14: return
        15: iload_1
        16: ifeq          24
        19: aload_0
        20: iconst_1
        21: putfield      #20                 // Field _partyOnly:Z
        24: aload_0
        25: invokevirtual #180                // Method queueRunner:()V
        28: return
      LineNumberTable:
        line 444: 0
        line 445: 14
        line 447: 15
        line 448: 19
        line 450: 24
        line 451: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            0      29     1 partyOnly   Z
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 8 /* same */

  public void queueEffect(ext.mods.gameserver.skills.AbstractEffect, boolean);
    descriptor: (Lext/mods/gameserver/skills/AbstractEffect;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #7                  // Field _queuesInitialized:Z
         9: ifne          16
        12: aload_0
        13: invokevirtual #183                // Method init:()V
        16: iload_2
        17: ifeq          32
        20: aload_0
        21: getfield      #186                // Field _removeQueue:Ljava/util/concurrent/LinkedBlockingQueue;
        24: aload_1
        25: invokevirtual #190                // Method java/util/concurrent/LinkedBlockingQueue.offer:(Ljava/lang/Object;)Z
        28: pop
        29: goto          41
        32: aload_0
        33: getfield      #195                // Field _addQueue:Ljava/util/concurrent/LinkedBlockingQueue;
        36: aload_1
        37: invokevirtual #190                // Method java/util/concurrent/LinkedBlockingQueue.offer:(Ljava/lang/Object;)Z
        40: pop
        41: aload_0
        42: invokevirtual #180                // Method queueRunner:()V
        45: return
      LineNumberTable:
        line 455: 0
        line 456: 4
        line 458: 5
        line 459: 12
        line 461: 16
        line 462: 20
        line 464: 32
        line 466: 41
        line 467: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            0      46     1 effect   Lext/mods/gameserver/skills/AbstractEffect;
            0      46     2 remove   Z
      StackMapTable: number_of_entries = 4
        frame_type = 5 /* same */
        frame_type = 10 /* same */
        frame_type = 15 /* same */
        frame_type = 8 /* same */

  protected void removeEffectFromQueue(ext.mods.gameserver.skills.AbstractEffect);
    descriptor: (Lext/mods/gameserver/skills/AbstractEffect;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=7, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: iconst_1
         7: putfield      #23                 // Field _rebuildCache:Z
        10: aload_1
        11: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        14: invokevirtual #91                 // Method ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
        17: ifeq          36
        20: aload_0
        21: getfield      #44                 // Field _debuffs:Ljava/util/List;
        24: ifnonnull     28
        27: return
        28: aload_0
        29: getfield      #44                 // Field _debuffs:Ljava/util/List;
        32: astore_2
        33: goto          49
        36: aload_0
        37: getfield      #34                 // Field _buffs:Ljava/util/List;
        40: ifnonnull     44
        43: return
        44: aload_0
        45: getfield      #34                 // Field _buffs:Ljava/util/List;
        48: astore_2
        49: aload_1
        50: invokevirtual #125                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
        53: invokevirtual #113                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getStackType:()Ljava/lang/String;
        56: astore_3
        57: ldc           #117                // String none
        59: aload_3
        60: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        63: ifeq          77
        66: aload_0
        67: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
        70: aload_1
        71: invokevirtual #223                // Method ext/mods/gameserver/model/actor/Creature.removeStatsByOwner:(Ljava/lang/Object;)V
        74: goto          243
        77: aload_0
        78: getfield      #229                // Field _stackedEffects:Ljava/util/Map;
        81: ifnonnull     85
        84: return
        85: aload_0
        86: getfield      #229                // Field _stackedEffects:Ljava/util/Map;
        89: aload_3
        90: invokeinterface #233,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        95: checkcast     #39                 // class java/util/List
        98: astore        4
       100: aload         4
       102: ifnull        115
       105: aload         4
       107: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       112: ifeq          116
       115: return
       116: aload         4
       118: aload_1
       119: invokeinterface #238,  2          // InterfaceMethod java/util/List.indexOf:(Ljava/lang/Object;)I
       124: istore        5
       126: iload         5
       128: iflt          243
       131: aload         4
       133: aload_1
       134: invokeinterface #242,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
       139: pop
       140: iload         5
       142: ifne          206
       145: aload_0
       146: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       149: aload_1
       150: invokevirtual #223                // Method ext/mods/gameserver/model/actor/Creature.removeStatsByOwner:(Ljava/lang/Object;)V
       153: aload         4
       155: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       160: ifne          206
       163: aload_0
       164: aload         4
       166: iconst_0
       167: invokeinterface #107,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       172: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       175: invokevirtual #245                // Method listsContains:(Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/skills/AbstractEffect;
       178: astore        6
       180: aload         6
       182: ifnull        206
       185: aload         6
       187: iconst_1
       188: invokevirtual #249                // Method ext/mods/gameserver/skills/AbstractEffect.setInUse:(Z)Z
       191: ifeq          206
       194: aload_0
       195: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       198: aload         6
       200: invokevirtual #253                // Method ext/mods/gameserver/skills/AbstractEffect.getStatFuncs:()Ljava/util/List;
       203: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Creature.addStatFuncs:(Ljava/util/List;)V
       206: aload         4
       208: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       213: ifeq          230
       216: aload_0
       217: getfield      #229                // Field _stackedEffects:Ljava/util/Map;
       220: aload_3
       221: invokeinterface #260,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
       226: pop
       227: goto          243
       230: aload_0
       231: getfield      #229                // Field _stackedEffects:Ljava/util/Map;
       234: aload_3
       235: aload         4
       237: invokeinterface #262,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       242: pop
       243: aload_2
       244: aload_1
       245: invokeinterface #242,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
       250: ifeq          336
       253: aload_0
       254: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       257: instanceof    #266                // class ext/mods/gameserver/model/actor/Player
       260: ifeq          336
       263: aload_1
       264: invokevirtual #125                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       267: invokevirtual #129                // Method ext/mods/gameserver/skills/effects/EffectTemplate.showIcon:()Z
       270: ifeq          336
       273: aload_1
       274: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       277: invokevirtual #164                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
       280: ifeq          294
       283: getstatic     #268                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_BEEN_ABORTED:Lext/mods/gameserver/network/SystemMessageId;
       286: invokestatic  #274                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       289: astore        4
       291: goto          320
       294: aload_1
       295: invokevirtual #280                // Method ext/mods/gameserver/skills/AbstractEffect.getCount:()I
       298: ifne          312
       301: getstatic     #283                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_WORN_OFF:Lext/mods/gameserver/network/SystemMessageId;
       304: invokestatic  #274                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       307: astore        4
       309: goto          320
       312: getstatic     #286                // Field ext/mods/gameserver/network/SystemMessageId.EFFECT_S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
       315: invokestatic  #274                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       318: astore        4
       320: aload         4
       322: aload_1
       323: invokevirtual #289                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       326: pop
       327: aload_0
       328: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       331: aload         4
       333: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       336: return
      LineNumberTable:
        line 514: 0
        line 515: 4
        line 519: 5
        line 521: 10
        line 523: 20
        line 524: 27
        line 526: 28
        line 530: 36
        line 531: 43
        line 533: 44
        line 536: 49
        line 538: 57
        line 540: 66
        line 544: 77
        line 545: 84
        line 547: 85
        line 548: 100
        line 549: 115
        line 551: 116
        line 552: 126
        line 554: 131
        line 556: 140
        line 558: 145
        line 560: 153
        line 562: 163
        line 563: 180
        line 564: 194
        line 568: 206
        line 569: 216
        line 571: 230
        line 575: 243
        line 578: 273
        line 579: 283
        line 580: 294
        line 581: 301
        line 583: 312
        line 585: 320
        line 586: 327
        line 588: 336
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33       3     2 effectList   Ljava/util/List;
          180      26     6 newStackedEffect   Lext/mods/gameserver/skills/AbstractEffect;
          100     143     4 stackQueue   Ljava/util/List;
          126     117     5 index   I
          291       3     4    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          309       3     4    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          320      16     4    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
            0     337     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            0     337     1 effect   Lext/mods/gameserver/skills/AbstractEffect;
           49     288     2 effectList   Ljava/util/List;
           57     280     3 stackType   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           33       3     2 effectList   Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
          100     143     4 stackQueue   Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
           49     288     2 effectList   Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
      StackMapTable: number_of_entries = 16
        frame_type = 5 /* same */
        frame_type = 22 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 4
          locals = [ class java/util/List ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/lang/String ]
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/util/List ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 89
          locals = [ int ]
        frame_type = 23 /* same */
        frame_type = 249 /* chop */
          offset_delta = 12
        frame_type = 50 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/network/serverpackets/SystemMessage ]
        frame_type = 250 /* chop */
          offset_delta = 15

  protected void addEffectFromQueue(ext.mods.gameserver.skills.AbstractEffect);
    descriptor: (Lext/mods/gameserver/skills/AbstractEffect;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=9, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_1
         6: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
         9: astore_2
        10: aload_0
        11: iconst_1
        12: putfield      #23                 // Field _rebuildCache:Z
        15: aload_0
        16: aload_1
        17: invokevirtual #297                // Method ext/mods/gameserver/skills/AbstractEffect.getEffectFlags:()I
        20: invokevirtual #300                // Method isAffected:(I)Z
        23: ifeq          39
        26: aload_1
        27: aconst_null
        28: invokevirtual #304                // Method ext/mods/gameserver/skills/AbstractEffect.onSameEffect:(Lext/mods/gameserver/skills/AbstractEffect;)Z
        31: ifne          39
        34: aload_1
        35: invokevirtual #308                // Method ext/mods/gameserver/skills/AbstractEffect.stopEffectTask:()V
        38: return
        39: aload_2
        40: invokevirtual #91                 // Method ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
        43: ifeq          125
        46: aload_0
        47: getfield      #44                 // Field _debuffs:Ljava/util/List;
        50: ifnonnull     64
        53: aload_0
        54: new           #311                // class java/util/concurrent/CopyOnWriteArrayList
        57: dup
        58: invokespecial #313                // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
        61: putfield      #44                 // Field _debuffs:Ljava/util/List;
        64: aload_0
        65: getfield      #44                 // Field _debuffs:Ljava/util/List;
        68: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        73: astore_3
        74: aload_3
        75: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        80: ifeq          111
        83: aload_3
        84: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        89: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
        92: astore        4
        94: aload         4
        96: aload_1
        97: invokevirtual #314                // Method ext/mods/gameserver/skills/AbstractEffect.isIdentical:(Lext/mods/gameserver/skills/AbstractEffect;)Z
       100: ifeq          108
       103: aload_1
       104: invokevirtual #308                // Method ext/mods/gameserver/skills/AbstractEffect.stopEffectTask:()V
       107: return
       108: goto          74
       111: aload_0
       112: getfield      #44                 // Field _debuffs:Ljava/util/List;
       115: aload_1
       116: invokeinterface #317,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       121: pop
       122: goto          531
       125: aload_0
       126: getfield      #34                 // Field _buffs:Ljava/util/List;
       129: ifnonnull     143
       132: aload_0
       133: new           #311                // class java/util/concurrent/CopyOnWriteArrayList
       136: dup
       137: invokespecial #313                // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
       140: putfield      #34                 // Field _buffs:Ljava/util/List;
       143: aload_0
       144: getfield      #34                 // Field _buffs:Ljava/util/List;
       147: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       152: astore_3
       153: aload_3
       154: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       159: ifeq          190
       162: aload_3
       163: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       168: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       171: astore        4
       173: aload         4
       175: aload_1
       176: invokevirtual #314                // Method ext/mods/gameserver/skills/AbstractEffect.isIdentical:(Lext/mods/gameserver/skills/AbstractEffect;)Z
       179: ifeq          187
       182: aload         4
       184: invokevirtual #170                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       187: goto          153
       190: aload_1
       191: invokevirtual #320                // Method ext/mods/gameserver/skills/AbstractEffect.isHerbEffect:()Z
       194: ifeq          216
       197: aload_0
       198: invokevirtual #323                // Method getBuffCount:()I
       201: aload_0
       202: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       205: invokevirtual #326                // Method ext/mods/gameserver/model/actor/Creature.getMaxBuffCount:()I
       208: if_icmplt     216
       211: aload_1
       212: invokevirtual #308                // Method ext/mods/gameserver/skills/AbstractEffect.stopEffectTask:()V
       215: return
       216: aload_0
       217: aload_2
       218: invokevirtual #329                // Method doesStack:(Lext/mods/gameserver/skills/L2Skill;)Z
       221: ifne          428
       224: aload_2
       225: invokevirtual #132                // Method ext/mods/gameserver/skills/L2Skill.is7Signs:()Z
       228: ifne          428
       231: aload_2
       232: invokevirtual #100                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       235: sipush        2286
       238: if_icmpeq     428
       241: aload_0
       242: invokevirtual #323                // Method getBuffCount:()I
       245: aload_0
       246: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       249: invokevirtual #326                // Method ext/mods/gameserver/model/actor/Creature.getMaxBuffCount:()I
       252: isub
       253: istore_3
       254: iload_3
       255: iflt          428
       258: getstatic     #135                // Field ext/mods/gameserver/model/actor/container/creature/EffectList$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       261: aload_2
       262: invokevirtual #141                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       265: invokevirtual #145                // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       268: iaload
       269: tableswitch   { // 1 to 6

                       1: 308

                       2: 308

                       3: 308

                       4: 308

                       5: 308

                       6: 308
                 default: 428
            }
       308: aload_0
       309: getfield      #34                 // Field _buffs:Ljava/util/List;
       312: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       317: astore        4
       319: aload         4
       321: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       326: ifeq          428
       329: aload         4
       331: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       336: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       339: astore        5
       341: aload         5
       343: ifnonnull     349
       346: goto          319
       349: getstatic     #135                // Field ext/mods/gameserver/model/actor/container/creature/EffectList$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       352: aload         5
       354: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       357: invokevirtual #141                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       360: invokevirtual #145                // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       363: iaload
       364: tableswitch   { // 1 to 6

                       1: 404

                       2: 404

                       3: 404

                       4: 404

                       5: 404

                       6: 404
                 default: 415
            }
       404: aload         5
       406: invokevirtual #170                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       409: iinc          3, -1
       412: goto          418
       415: goto          319
       418: iload_3
       419: ifge          425
       422: goto          428
       425: goto          319
       428: aload_2
       429: invokevirtual #164                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
       432: ifeq          449
       435: aload_0
       436: getfield      #34                 // Field _buffs:Ljava/util/List;
       439: aload_1
       440: invokeinterface #317,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       445: pop
       446: goto          531
       449: iconst_0
       450: istore_3
       451: aload_0
       452: getfield      #34                 // Field _buffs:Ljava/util/List;
       455: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       460: astore        4
       462: aload         4
       464: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       469: ifeq          520
       472: aload         4
       474: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       479: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       482: astore        5
       484: aload         5
       486: ifnull        462
       489: aload         5
       491: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       494: invokevirtual #164                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
       497: ifne          462
       500: aload         5
       502: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       505: invokevirtual #132                // Method ext/mods/gameserver/skills/L2Skill.is7Signs:()Z
       508: ifeq          514
       511: goto          462
       514: iinc          3, 1
       517: goto          462
       520: aload_0
       521: getfield      #34                 // Field _buffs:Ljava/util/List;
       524: iload_3
       525: aload_1
       526: invokeinterface #333,  3          // InterfaceMethod java/util/List.add:(ILjava/lang/Object;)V
       531: aload_1
       532: invokevirtual #125                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       535: invokevirtual #113                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getStackType:()Ljava/lang/String;
       538: astore_3
       539: ldc           #117                // String none
       541: aload_3
       542: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       545: ifeq          568
       548: aload_1
       549: iconst_1
       550: invokevirtual #249                // Method ext/mods/gameserver/skills/AbstractEffect.setInUse:(Z)Z
       553: ifeq          567
       556: aload_0
       557: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       560: aload_1
       561: invokevirtual #253                // Method ext/mods/gameserver/skills/AbstractEffect.getStatFuncs:()Ljava/util/List;
       564: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Creature.addStatFuncs:(Ljava/util/List;)V
       567: return
       568: aconst_null
       569: astore        4
       571: aconst_null
       572: astore        5
       574: aload_0
       575: getfield      #229                // Field _stackedEffects:Ljava/util/Map;
       578: ifnonnull     592
       581: aload_0
       582: new           #336                // class java/util/HashMap
       585: dup
       586: invokespecial #338                // Method java/util/HashMap."<init>":()V
       589: putfield      #229                // Field _stackedEffects:Ljava/util/Map;
       592: aload_0
       593: getfield      #229                // Field _stackedEffects:Ljava/util/Map;
       596: aload_3
       597: invokeinterface #233,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       602: checkcast     #39                 // class java/util/List
       605: astore        6
       607: aload         6
       609: ifnull        789
       612: iconst_0
       613: istore        7
       615: aload         6
       617: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       622: ifne          777
       625: aload_0
       626: aload         6
       628: iconst_0
       629: invokeinterface #107,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       634: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       637: invokevirtual #245                // Method listsContains:(Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/skills/AbstractEffect;
       640: astore        5
       642: aload         6
       644: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       649: astore        8
       651: aload         8
       653: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       658: ifeq          694
       661: aload_1
       662: invokevirtual #125                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       665: invokevirtual #339                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getStackOrder:()F
       668: aload         8
       670: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       675: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       678: invokevirtual #125                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       681: invokevirtual #339                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getStackOrder:()F
       684: fcmpg
       685: ifge          694
       688: iinc          7, 1
       691: goto          651
       694: aload         6
       696: iload         7
       698: aload_1
       699: invokeinterface #333,  3          // InterfaceMethod java/util/List.add:(ILjava/lang/Object;)V
       704: getstatic     #343                // Field ext/mods/Config.EFFECT_CANCELING:Z
       707: ifeq          774
       710: aload_1
       711: invokevirtual #320                // Method ext/mods/gameserver/skills/AbstractEffect.isHerbEffect:()Z
       714: ifne          774
       717: aload         6
       719: invokeinterface #61,  1           // InterfaceMethod java/util/List.size:()I
       724: iconst_1
       725: if_icmple     774
       728: aload_2
       729: invokevirtual #91                 // Method ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
       732: ifeq          756
       735: aload_0
       736: getfield      #44                 // Field _debuffs:Ljava/util/List;
       739: aload         6
       741: iconst_1
       742: invokeinterface #348,  2          // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
       747: invokeinterface #242,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
       752: pop
       753: goto          774
       756: aload_0
       757: getfield      #34                 // Field _buffs:Ljava/util/List;
       760: aload         6
       762: iconst_1
       763: invokeinterface #348,  2          // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
       768: invokeinterface #242,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
       773: pop
       774: goto          786
       777: aload         6
       779: iconst_0
       780: aload_1
       781: invokeinterface #333,  3          // InterfaceMethod java/util/List.add:(ILjava/lang/Object;)V
       786: goto          807
       789: new           #54                 // class java/util/ArrayList
       792: dup
       793: invokespecial #56                 // Method java/util/ArrayList."<init>":()V
       796: astore        6
       798: aload         6
       800: iconst_0
       801: aload_1
       802: invokeinterface #333,  3          // InterfaceMethod java/util/List.add:(ILjava/lang/Object;)V
       807: aload_0
       808: getfield      #229                // Field _stackedEffects:Ljava/util/Map;
       811: aload_3
       812: aload         6
       814: invokeinterface #262,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       819: pop
       820: aload         6
       822: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       827: ifne          847
       830: aload_0
       831: aload         6
       833: iconst_0
       834: invokeinterface #107,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       839: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       842: invokevirtual #245                // Method listsContains:(Lext/mods/gameserver/skills/AbstractEffect;)Lext/mods/gameserver/skills/AbstractEffect;
       845: astore        4
       847: aload         5
       849: aload         4
       851: if_acmpeq     985
       854: aload         5
       856: ifnull        917
       859: aload_0
       860: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       863: aload         5
       865: invokevirtual #223                // Method ext/mods/gameserver/model/actor/Creature.removeStatsByOwner:(Ljava/lang/Object;)V
       868: aload         5
       870: iconst_0
       871: invokevirtual #249                // Method ext/mods/gameserver/skills/AbstractEffect.setInUse:(Z)Z
       874: pop
       875: aload_0
       876: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       879: instanceof    #266                // class ext/mods/gameserver/model/actor/Player
       882: ifeq          917
       885: aload         5
       887: invokevirtual #125                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       890: invokevirtual #129                // Method ext/mods/gameserver/skills/effects/EffectTemplate.showIcon:()Z
       893: ifeq          917
       896: aload_0
       897: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       900: getstatic     #286                // Field ext/mods/gameserver/network/SystemMessageId.EFFECT_S1_DISAPPEARED:Lext/mods/gameserver/network/SystemMessageId;
       903: invokestatic  #274                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       906: aload         5
       908: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       911: invokevirtual #350                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       914: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       917: aload         4
       919: ifnull        985
       922: aload         4
       924: iconst_1
       925: invokevirtual #249                // Method ext/mods/gameserver/skills/AbstractEffect.setInUse:(Z)Z
       928: ifeq          985
       931: aload_0
       932: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       935: aload         4
       937: invokevirtual #253                // Method ext/mods/gameserver/skills/AbstractEffect.getStatFuncs:()Ljava/util/List;
       940: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Creature.addStatFuncs:(Ljava/util/List;)V
       943: aload_0
       944: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       947: instanceof    #266                // class ext/mods/gameserver/model/actor/Player
       950: ifeq          985
       953: aload         4
       955: invokevirtual #125                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       958: invokevirtual #129                // Method ext/mods/gameserver/skills/effects/EffectTemplate.showIcon:()Z
       961: ifeq          985
       964: aload_0
       965: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       968: getstatic     #353                // Field ext/mods/gameserver/network/SystemMessageId.YOU_FEEL_S1_EFFECT:Lext/mods/gameserver/network/SystemMessageId;
       971: invokestatic  #274                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       974: aload         4
       976: invokevirtual #96                 // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       979: invokevirtual #350                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       982: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       985: return
      LineNumberTable:
        line 592: 0
        line 593: 4
        line 595: 5
        line 597: 10
        line 599: 15
        line 601: 34
        line 602: 38
        line 605: 39
        line 607: 46
        line 608: 53
        line 610: 64
        line 612: 94
        line 614: 103
        line 615: 107
        line 617: 108
        line 618: 111
        line 622: 125
        line 623: 132
        line 625: 143
        line 627: 173
        line 628: 182
        line 629: 187
        line 631: 190
        line 633: 211
        line 634: 215
        line 637: 216
        line 639: 241
        line 640: 254
        line 642: 258
        line 645: 308
        line 647: 341
        line 648: 346
        line 650: 349
        line 653: 404
        line 654: 409
        line 655: 412
        line 658: 415
        line 661: 418
        line 662: 422
        line 663: 425
        line 669: 428
        line 670: 435
        line 673: 449
        line 674: 451
        line 676: 484
        line 677: 511
        line 679: 514
        line 680: 517
        line 681: 520
        line 685: 531
        line 687: 539
        line 689: 548
        line 690: 556
        line 692: 567
        line 695: 568
        line 696: 571
        line 698: 574
        line 699: 581
        line 701: 592
        line 702: 607
        line 704: 612
        line 705: 615
        line 707: 625
        line 709: 642
        line 711: 651
        line 713: 661
        line 714: 688
        line 718: 694
        line 720: 704
        line 722: 728
        line 723: 735
        line 725: 756
        line 727: 774
        line 729: 777
        line 730: 786
        line 733: 789
        line 734: 798
        line 737: 807
        line 739: 820
        line 740: 830
        line 742: 847
        line 744: 854
        line 746: 859
        line 748: 868
        line 750: 875
        line 751: 896
        line 754: 917
        line 756: 931
        line 758: 943
        line 759: 964
        line 762: 985
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           94      14     4     e   Lext/mods/gameserver/skills/AbstractEffect;
          173      14     4     e   Lext/mods/gameserver/skills/AbstractEffect;
          341      84     5     e   Lext/mods/gameserver/skills/AbstractEffect;
          254     174     3 effectsToRemove   I
          484      33     5     e   Lext/mods/gameserver/skills/AbstractEffect;
          451      80     3   pos   I
          651     123     8 queueIterator   Ljava/util/Iterator;
          615     171     7   pos   I
            0     986     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            0     986     1 newEffect   Lext/mods/gameserver/skills/AbstractEffect;
           10     976     2 newSkill   Lext/mods/gameserver/skills/L2Skill;
          539     447     3 stackType   Ljava/lang/String;
          571     415     4 effectToAdd   Lext/mods/gameserver/skills/AbstractEffect;
          574     412     5 effectToRemove   Lext/mods/gameserver/skills/AbstractEffect;
          607     379     6 stackQueue   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          651     123     8 queueIterator   Ljava/util/Iterator<Lext/mods/gameserver/skills/AbstractEffect;>;
          607     379     6 stackQueue   Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
      StackMapTable: number_of_entries = 39
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 24 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 33 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 13 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 33 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 91
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 54 /* same */
        frame_type = 10 /* same */
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 20 /* same */
        frame_type = 253 /* append */
          offset_delta = 12
          locals = [ int, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 10
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ class java/lang/String ]
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/skills/AbstractEffect, class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 254 /* append */
          offset_delta = 58
          locals = [ class java/util/List, int, class java/util/Iterator ]
        frame_type = 42 /* same */
        frame_type = 61 /* same */
        frame_type = 250 /* chop */
          offset_delta = 17
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 17 /* same */
        frame_type = 39 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 69
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67

  protected void updateEffectIcons();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=8, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
         4: instanceof    #356                // class ext/mods/gameserver/model/actor/Playable
         7: ifne          11
        10: return
        11: aconst_null
        12: astore_1
        13: aconst_null
        14: astore_2
        15: aconst_null
        16: astore_3
        17: aload_0
        18: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
        21: astore        6
        23: aload         6
        25: instanceof    #266                // class ext/mods/gameserver/model/actor/Player
        28: ifeq          108
        31: aload         6
        33: checkcast     #266                // class ext/mods/gameserver/model/actor/Player
        36: astore        4
        38: aload_0
        39: getfield      #20                 // Field _partyOnly:Z
        42: ifeq          53
        45: aload_0
        46: iconst_0
        47: putfield      #20                 // Field _partyOnly:Z
        50: goto          61
        53: new           #358                // class ext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate
        56: dup
        57: invokespecial #360                // Method ext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate."<init>":()V
        60: astore_1
        61: aload         4
        63: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
        66: ifeq          79
        69: new           #364                // class ext/mods/gameserver/network/serverpackets/PartySpelled
        72: dup
        73: aload         4
        75: invokespecial #366                // Method ext/mods/gameserver/network/serverpackets/PartySpelled."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
        78: astore_2
        79: aload         4
        81: invokevirtual #369                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        84: ifeq          139
        87: aload         4
        89: invokevirtual #372                // Method ext/mods/gameserver/model/actor/Player.isOlympiadStart:()Z
        92: ifeq          139
        95: new           #375                // class ext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo
        98: dup
        99: aload         4
       101: invokespecial #377                // Method ext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       104: astore_3
       105: goto          139
       108: aload_0
       109: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       112: astore        6
       114: aload         6
       116: instanceof    #380                // class ext/mods/gameserver/model/actor/Summon
       119: ifeq          139
       122: aload         6
       124: checkcast     #380                // class ext/mods/gameserver/model/actor/Summon
       127: astore        5
       129: new           #364                // class ext/mods/gameserver/network/serverpackets/PartySpelled
       132: dup
       133: aload         5
       135: invokespecial #366                // Method ext/mods/gameserver/network/serverpackets/PartySpelled."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
       138: astore_2
       139: aload_0
       140: getfield      #34                 // Field _buffs:Ljava/util/List;
       143: ifnull        262
       146: aload_0
       147: getfield      #34                 // Field _buffs:Ljava/util/List;
       150: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       155: ifne          262
       158: aload_0
       159: getfield      #34                 // Field _buffs:Ljava/util/List;
       162: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       167: astore        4
       169: aload         4
       171: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       176: ifeq          262
       179: aload         4
       181: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       186: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       189: astore        5
       191: aload         5
       193: ifnull        169
       196: aload         5
       198: invokevirtual #125                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       201: invokevirtual #129                // Method ext/mods/gameserver/skills/effects/EffectTemplate.showIcon:()Z
       204: ifeq          169
       207: aload         5
       209: invokevirtual #84                 // Method ext/mods/gameserver/skills/AbstractEffect.getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
       212: getstatic     #382                // Field ext/mods/gameserver/enums/skills/EffectType.SIGNET_GROUND:Lext/mods/gameserver/enums/skills/EffectType;
       215: if_acmpne     221
       218: goto          169
       221: aload         5
       223: invokevirtual #88                 // Method ext/mods/gameserver/skills/AbstractEffect.getInUse:()Z
       226: ifeq          259
       229: aload_1
       230: ifnull        239
       233: aload         5
       235: aload_1
       236: invokevirtual #388                // Method ext/mods/gameserver/skills/AbstractEffect.addIcon:(Lext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate;)V
       239: aload_2
       240: ifnull        249
       243: aload         5
       245: aload_2
       246: invokevirtual #392                // Method ext/mods/gameserver/skills/AbstractEffect.addPartySpelledIcon:(Lext/mods/gameserver/network/serverpackets/PartySpelled;)V
       249: aload_3
       250: ifnull        259
       253: aload         5
       255: aload_3
       256: invokevirtual #396                // Method ext/mods/gameserver/skills/AbstractEffect.addOlympiadSpelledIcon:(Lext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo;)V
       259: goto          169
       262: aload_0
       263: getfield      #44                 // Field _debuffs:Ljava/util/List;
       266: ifnull        385
       269: aload_0
       270: getfield      #44                 // Field _debuffs:Ljava/util/List;
       273: invokeinterface #38,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       278: ifne          385
       281: aload_0
       282: getfield      #44                 // Field _debuffs:Ljava/util/List;
       285: invokeinterface #71,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       290: astore        4
       292: aload         4
       294: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       299: ifeq          385
       302: aload         4
       304: invokeinterface #80,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       309: checkcast     #65                 // class ext/mods/gameserver/skills/AbstractEffect
       312: astore        5
       314: aload         5
       316: ifnull        292
       319: aload         5
       321: invokevirtual #125                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       324: invokevirtual #129                // Method ext/mods/gameserver/skills/effects/EffectTemplate.showIcon:()Z
       327: ifeq          292
       330: aload         5
       332: invokevirtual #84                 // Method ext/mods/gameserver/skills/AbstractEffect.getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
       335: getstatic     #382                // Field ext/mods/gameserver/enums/skills/EffectType.SIGNET_GROUND:Lext/mods/gameserver/enums/skills/EffectType;
       338: if_acmpne     344
       341: goto          292
       344: aload         5
       346: invokevirtual #88                 // Method ext/mods/gameserver/skills/AbstractEffect.getInUse:()Z
       349: ifeq          382
       352: aload_1
       353: ifnull        362
       356: aload         5
       358: aload_1
       359: invokevirtual #388                // Method ext/mods/gameserver/skills/AbstractEffect.addIcon:(Lext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate;)V
       362: aload_2
       363: ifnull        372
       366: aload         5
       368: aload_2
       369: invokevirtual #392                // Method ext/mods/gameserver/skills/AbstractEffect.addPartySpelledIcon:(Lext/mods/gameserver/network/serverpackets/PartySpelled;)V
       372: aload_3
       373: ifnull        382
       376: aload         5
       378: aload_3
       379: invokevirtual #396                // Method ext/mods/gameserver/skills/AbstractEffect.addOlympiadSpelledIcon:(Lext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo;)V
       382: goto          292
       385: aload_1
       386: ifnull        397
       389: aload_0
       390: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       393: aload_1
       394: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       397: aload_2
       398: ifnull        502
       401: aload_0
       402: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       405: astore        6
       407: aload         6
       409: instanceof    #380                // class ext/mods/gameserver/model/actor/Summon
       412: ifeq          464
       415: aload         6
       417: checkcast     #380                // class ext/mods/gameserver/model/actor/Summon
       420: astore        4
       422: aload         4
       424: invokevirtual #400                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       427: astore        6
       429: aload         6
       431: ifnull        461
       434: aload         6
       436: invokevirtual #404                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       439: astore        7
       441: aload         7
       443: ifnull        455
       446: aload         7
       448: aload_2
       449: invokevirtual #408                // Method ext/mods/gameserver/model/group/Party.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       452: goto          461
       455: aload         6
       457: aload_2
       458: invokevirtual #413                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       461: goto          502
       464: aload_0
       465: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       468: astore        6
       470: aload         6
       472: instanceof    #266                // class ext/mods/gameserver/model/actor/Player
       475: ifeq          502
       478: aload         6
       480: checkcast     #266                // class ext/mods/gameserver/model/actor/Player
       483: astore        5
       485: aload         5
       487: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
       490: ifeq          502
       493: aload         5
       495: invokevirtual #404                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       498: aload_2
       499: invokevirtual #408                // Method ext/mods/gameserver/model/group/Party.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       502: aload_3
       503: ifnull        546
       506: invokestatic  #414                // Method ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
       509: aload_0
       510: getfield      #30                 // Field _owner:Lext/mods/gameserver/model/actor/Creature;
       513: checkcast     #266                // class ext/mods/gameserver/model/actor/Player
       516: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
       519: invokevirtual #423                // Method ext/mods/gameserver/model/olympiad/OlympiadGameManager.getOlympiadTask:(I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
       522: astore        4
       524: aload         4
       526: ifnull        546
       529: aload         4
       531: invokevirtual #427                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.isBattleStarted:()Z
       534: ifeq          546
       537: aload         4
       539: invokevirtual #432                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.getZone:()Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
       542: aload_3
       543: invokevirtual #436                // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacketToObservers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       546: return
      LineNumberTable:
        line 766: 0
        line 767: 10
        line 769: 11
        line 770: 13
        line 771: 15
        line 773: 17
        line 775: 38
        line 776: 45
        line 778: 53
        line 780: 61
        line 781: 69
        line 783: 79
        line 784: 95
        line 786: 108
        line 787: 129
        line 789: 139
        line 791: 158
        line 793: 191
        line 794: 218
        line 796: 221
        line 798: 229
        line 799: 233
        line 801: 239
        line 802: 243
        line 804: 249
        line 805: 253
        line 807: 259
        line 810: 262
        line 812: 281
        line 814: 314
        line 815: 341
        line 817: 344
        line 819: 352
        line 820: 356
        line 822: 362
        line 823: 366
        line 825: 372
        line 826: 376
        line 828: 382
        line 831: 385
        line 832: 389
        line 834: 397
        line 836: 401
        line 838: 422
        line 839: 429
        line 841: 434
        line 842: 441
        line 843: 446
        line 845: 455
        line 847: 461
        line 848: 464
        line 849: 493
        line 852: 502
        line 854: 506
        line 855: 524
        line 856: 537
        line 858: 546
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38      70     4 player   Lext/mods/gameserver/model/actor/Player;
          129      10     5 summon   Lext/mods/gameserver/model/actor/Summon;
          191      68     5     e   Lext/mods/gameserver/skills/AbstractEffect;
          314      68     5     e   Lext/mods/gameserver/skills/AbstractEffect;
          441      20     7 party   Lext/mods/gameserver/model/group/Party;
          429      32     6 summonOwner   Lext/mods/gameserver/model/actor/Player;
          422      42     4 summon   Lext/mods/gameserver/model/actor/Summon;
          485      17     5 player   Lext/mods/gameserver/model/actor/Player;
          524      22     4  game   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
            0     547     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
           13     534     1    mi   Lext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate;
           15     532     2    ps   Lext/mods/gameserver/network/serverpackets/PartySpelled;
           17     530     3    os   Lext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo;
      StackMapTable: number_of_entries = 24
        frame_type = 11 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/actor/container/creature/EffectList, class ext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate, class ext/mods/gameserver/network/serverpackets/PartySpelled, class ext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo, class ext/mods/gameserver/model/actor/Player ]
          stack = []
        frame_type = 7 /* same */
        frame_type = 17 /* same */
        frame_type = 250 /* chop */
          offset_delta = 28
        frame_type = 30 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 17 /* same */
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 17 /* same */
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 11 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/model/actor/container/creature/EffectList, class ext/mods/gameserver/network/serverpackets/AbnormalStatusUpdate, class ext/mods/gameserver/network/serverpackets/PartySpelled, class ext/mods/gameserver/network/serverpackets/ExOlympiadSpelledInfo, class ext/mods/gameserver/model/actor/Summon, top, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/group/Party ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 37 /* same */
        frame_type = 43 /* same */

  public boolean isAffected(ext.mods.gameserver.enums.skills.EffectFlag);
    descriptor: (Lext/mods/gameserver/enums/skills/EffectFlag;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #448                // Method ext/mods/gameserver/enums/skills/EffectFlag.getMask:()I
         5: invokevirtual #300                // Method isAffected:(I)Z
         8: ireturn
      LineNumberTable:
        line 916: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            0       9     1  flag   Lext/mods/gameserver/enums/skills/EffectFlag;

  public boolean isAffected(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #444                // Field _effectFlags:I
         4: iload_1
         5: iand
         6: ifeq          13
         9: iconst_1
        10: goto          14
        13: iconst_0
        14: ireturn
      LineNumberTable:
        line 921: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;
            0      15     1  mask   I
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void clear();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aconst_null
         2: putfield      #195                // Field _addQueue:Ljava/util/concurrent/LinkedBlockingQueue;
         5: aload_0
         6: aconst_null
         7: putfield      #186                // Field _removeQueue:Ljava/util/concurrent/LinkedBlockingQueue;
        10: aload_0
        11: aconst_null
        12: putfield      #34                 // Field _buffs:Ljava/util/List;
        15: aload_0
        16: aconst_null
        17: putfield      #44                 // Field _debuffs:Ljava/util/List;
        20: aload_0
        21: aconst_null
        22: putfield      #229                // Field _stackedEffects:Ljava/util/Map;
        25: aload_0
        26: iconst_0
        27: putfield      #7                  // Field _queuesInitialized:Z
        30: return
      LineNumberTable:
        line 929: 0
        line 930: 5
        line 931: 10
        line 932: 15
        line 933: 20
        line 934: 25
        line 935: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/container/creature/EffectList;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: iconst_0
         1: anewarray     #65                 // class ext/mods/gameserver/skills/AbstractEffect
         4: putstatic     #47                 // Field EMPTY_EFFECTS:[Lext/mods/gameserver/skills/AbstractEffect;
         7: return
      LineNumberTable:
        line 51: 0
}
SourceFile: "EffectList.java"
NestMembers:
  ext/mods/gameserver/model/actor/container/creature/EffectList$1
InnerClasses:
  static #136;                            // class ext/mods/gameserver/model/actor/container/creature/EffectList$1
