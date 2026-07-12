// Bytecode for: ext.mods.gameserver.data.manager.EventsDropManager
// File: ext\mods\gameserver\data\manager\EventsDropManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/EventsDropManager.class
  Last modified 9 de jul de 2026; size 9498 bytes
  MD5 checksum 3ae7b30597d1f0ffbfd69204b7007b53
  Compiled from "EventsDropManager.java"
public class ext.mods.gameserver.data.manager.EventsDropManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/data/manager/EventsDropManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 23, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/data/manager/EventsDropManager._haveActiveChristmasEvent:Z
    #8 = Class              #10           // ext/mods/gameserver/data/manager/EventsDropManager
    #9 = NameAndType        #11:#12       // _haveActiveChristmasEvent:Z
   #10 = Utf8               ext/mods/gameserver/data/manager/EventsDropManager
   #11 = Utf8               _haveActiveChristmasEvent
   #12 = Utf8               Z
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/data/manager/EventsDropManager._haveActiveMedalsEvent:Z
   #14 = NameAndType        #15:#12       // _haveActiveMedalsEvent:Z
   #15 = Utf8               _haveActiveMedalsEvent
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/data/manager/EventsDropManager._haveActiveL2DayEvent:Z
   #17 = NameAndType        #18:#12       // _haveActiveL2DayEvent:Z
   #18 = Utf8               _haveActiveL2DayEvent
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/data/manager/EventsDropManager._haveActiveSquashEvent:Z
   #20 = NameAndType        #21:#12       // _haveActiveSquashEvent:Z
   #21 = Utf8               _haveActiveSquashEvent
   #22 = Class              #23           // java/util/HashMap
   #23 = Utf8               java/util/HashMap
   #24 = Methodref          #22.#3        // java/util/HashMap."<init>":()V
   #25 = Fieldref           #8.#26        // ext/mods/gameserver/data/manager/EventsDropManager._rewardChristmasRules:Ljava/util/Map;
   #26 = NameAndType        #27:#28       // _rewardChristmasRules:Ljava/util/Map;
   #27 = Utf8               _rewardChristmasRules
   #28 = Utf8               Ljava/util/Map;
   #29 = Fieldref           #8.#30        // ext/mods/gameserver/data/manager/EventsDropManager._rewardMedalsRules:Ljava/util/Map;
   #30 = NameAndType        #31:#28       // _rewardMedalsRules:Ljava/util/Map;
   #31 = Utf8               _rewardMedalsRules
   #32 = Fieldref           #8.#33        // ext/mods/gameserver/data/manager/EventsDropManager._rewardL2DayRules:Ljava/util/Map;
   #33 = NameAndType        #34:#28       // _rewardL2DayRules:Ljava/util/Map;
   #34 = Utf8               _rewardL2DayRules
   #35 = Fieldref           #8.#36        // ext/mods/gameserver/data/manager/EventsDropManager._rewardSquashRules:Ljava/util/Map;
   #36 = NameAndType        #37:#28       // _rewardSquashRules:Ljava/util/Map;
   #37 = Utf8               _rewardSquashRules
   #38 = Methodref          #8.#39        // ext/mods/gameserver/data/manager/EventsDropManager.addRule:(Ljava/util/Map;Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;Z)V
   #39 = NameAndType        #40:#41       // addRule:(Ljava/util/Map;Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;Z)V
   #40 = Utf8               addRule
   #41 = Utf8               (Ljava/util/Map;Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;Z)V
   #42 = Class              #43           // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule
   #43 = Utf8               ext/mods/gameserver/data/manager/EventsDropManager$RewardRule
   #44 = Methodref          #42.#45       // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule."<init>":(Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;Z)V
   #45 = NameAndType        #5:#46        // "<init>":(Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;Z)V
   #46 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;Z)V
   #47 = InterfaceMethodref #48.#49       // java/util/Map.size:()I
   #48 = Class              #50           // java/util/Map
   #49 = NameAndType        #51:#52       // size:()I
   #50 = Utf8               java/util/Map
   #51 = Utf8               size
   #52 = Utf8               ()I
   #53 = Methodref          #54.#55       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #54 = Class              #56           // java/lang/Integer
   #55 = NameAndType        #57:#58       // valueOf:(I)Ljava/lang/Integer;
   #56 = Utf8               java/lang/Integer
   #57 = Utf8               valueOf
   #58 = Utf8               (I)Ljava/lang/Integer;
   #59 = InterfaceMethodref #48.#60       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #60 = NameAndType        #61:#62       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #61 = Utf8               put
   #62 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #63 = Methodref          #8.#64        // ext/mods/gameserver/data/manager/EventsDropManager.removeRules:(Ljava/util/Map;Ljava/lang/String;)V
   #64 = NameAndType        #65:#66       // removeRules:(Ljava/util/Map;Ljava/lang/String;)V
   #65 = Utf8               removeRules
   #66 = Utf8               (Ljava/util/Map;Ljava/lang/String;)V
   #67 = InterfaceMethodref #48.#68       // java/util/Map.isEmpty:()Z
   #68 = NameAndType        #69:#70       // isEmpty:()Z
   #69 = Utf8               isEmpty
   #70 = Utf8               ()Z
   #71 = InterfaceMethodref #48.#72       // java/util/Map.values:()Ljava/util/Collection;
   #72 = NameAndType        #73:#74       // values:()Ljava/util/Collection;
   #73 = Utf8               values
   #74 = Utf8               ()Ljava/util/Collection;
   #75 = InvokeDynamic      #0:#76        // #0:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #76 = NameAndType        #77:#78       // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #77 = Utf8               test
   #78 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
   #79 = InterfaceMethodref #80.#81       // java/util/Collection.removeIf:(Ljava/util/function/Predicate;)Z
   #80 = Class              #82           // java/util/Collection
   #81 = NameAndType        #83:#84       // removeIf:(Ljava/util/function/Predicate;)Z
   #82 = Utf8               java/util/Collection
   #83 = Utf8               removeIf
   #84 = Utf8               (Ljava/util/function/Predicate;)Z
   #85 = Class              #86           // java/util/ArrayList
   #86 = Utf8               java/util/ArrayList
   #87 = InterfaceMethodref #88.#89       // java/util/List.of:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #88 = Class              #90           // java/util/List
   #89 = NameAndType        #91:#92       // of:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #90 = Utf8               java/util/List
   #91 = Utf8               of
   #92 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #93 = Methodref          #85.#94       // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
   #94 = NameAndType        #5:#95        // "<init>":(Ljava/util/Collection;)V
   #95 = Utf8               (Ljava/util/Collection;)V
   #96 = Methodref          #97.#98       // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #97 = Class              #99           // ext/mods/gameserver/model/actor/Creature
   #98 = NameAndType        #100:#101     // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #99 = Utf8               ext/mods/gameserver/model/actor/Creature
  #100 = Utf8               getStatus
  #101 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #102 = Methodref          #103.#104     // ext/mods/gameserver/model/actor/status/CreatureStatus.getLevel:()I
  #103 = Class              #105          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #104 = NameAndType        #106:#52      // getLevel:()I
  #105 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #106 = Utf8               getLevel
  #107 = Methodref          #108.#109     // ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
  #108 = Class              #110          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #109 = NameAndType        #106:#111     // getLevel:()B
  #110 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #111 = Utf8               ()B
  #112 = Methodref          #85.#3        // java/util/ArrayList."<init>":()V
  #113 = InterfaceMethodref #80.#114      // java/util/Collection.iterator:()Ljava/util/Iterator;
  #114 = NameAndType        #115:#116     // iterator:()Ljava/util/Iterator;
  #115 = Utf8               iterator
  #116 = Utf8               ()Ljava/util/Iterator;
  #117 = InterfaceMethodref #118.#119     // java/util/Iterator.hasNext:()Z
  #118 = Class              #120          // java/util/Iterator
  #119 = NameAndType        #121:#70      // hasNext:()Z
  #120 = Utf8               java/util/Iterator
  #121 = Utf8               hasNext
  #122 = InterfaceMethodref #118.#123     // java/util/Iterator.next:()Ljava/lang/Object;
  #123 = NameAndType        #124:#125     // next:()Ljava/lang/Object;
  #124 = Utf8               next
  #125 = Utf8               ()Ljava/lang/Object;
  #126 = Methodref          #42.#127      // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.levDifferenceControl:()Z
  #127 = NameAndType        #128:#70      // levDifferenceControl:()Z
  #128 = Utf8               levDifferenceControl
  #129 = Methodref          #8.#130       // ext/mods/gameserver/data/manager/EventsDropManager.calculateRewards:(Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;Ljava/util/List;)V
  #130 = NameAndType        #131:#132     // calculateRewards:(Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;Ljava/util/List;)V
  #131 = Utf8               calculateRewards
  #132 = Utf8               (Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;Ljava/util/List;)V
  #133 = InterfaceMethodref #88.#68       // java/util/List.isEmpty:()Z
  #134 = InterfaceMethodref #88.#49       // java/util/List.size:()I
  #135 = Methodref          #136.#137     // ext/mods/commons/random/Rnd.get:(I)I
  #136 = Class              #138          // ext/mods/commons/random/Rnd
  #137 = NameAndType        #139:#140     // get:(I)I
  #138 = Utf8               ext/mods/commons/random/Rnd
  #139 = Utf8               get
  #140 = Utf8               (I)I
  #141 = InterfaceMethodref #88.#142      // java/util/List.get:(I)Ljava/lang/Object;
  #142 = NameAndType        #139:#143     // get:(I)Ljava/lang/Object;
  #143 = Utf8               (I)Ljava/lang/Object;
  #144 = Class              #145          // ext/mods/gameserver/data/manager/EventsDropManager$Rewards
  #145 = Utf8               ext/mods/gameserver/data/manager/EventsDropManager$Rewards
  #146 = Methodref          #144.#147     // ext/mods/gameserver/data/manager/EventsDropManager$Rewards.rewardId:()I
  #147 = NameAndType        #148:#52      // rewardId:()I
  #148 = Utf8               rewardId
  #149 = InterfaceMethodref #88.#150      // java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
  #150 = NameAndType        #151:#152     // set:(ILjava/lang/Object;)Ljava/lang/Object;
  #151 = Utf8               set
  #152 = Utf8               (ILjava/lang/Object;)Ljava/lang/Object;
  #153 = Methodref          #144.#154     // ext/mods/gameserver/data/manager/EventsDropManager$Rewards.rewardCnt:()I
  #154 = NameAndType        #155:#52      // rewardCnt:()I
  #155 = Utf8               rewardCnt
  #156 = Methodref          #42.#157      // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.ruleType:()Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
  #157 = NameAndType        #158:#159     // ruleType:()Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
  #158 = Utf8               ruleType
  #159 = Utf8               ()Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
  #160 = Fieldref           #161.#162     // ext/mods/gameserver/data/manager/EventsDropManager$RuleType.ALL_NPC:Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
  #161 = Class              #163          // ext/mods/gameserver/data/manager/EventsDropManager$RuleType
  #162 = NameAndType        #164:#165     // ALL_NPC:Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
  #163 = Utf8               ext/mods/gameserver/data/manager/EventsDropManager$RuleType
  #164 = Utf8               ALL_NPC
  #165 = Utf8               Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
  #166 = Methodref          #42.#167      // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.items:()Ljava/util/List;
  #167 = NameAndType        #168:#169     // items:()Ljava/util/List;
  #168 = Utf8               items
  #169 = Utf8               ()Ljava/util/List;
  #170 = InterfaceMethodref #88.#114      // java/util/List.iterator:()Ljava/util/Iterator;
  #171 = Class              #172          // ext/mods/gameserver/model/records/custom/EventItem
  #172 = Utf8               ext/mods/gameserver/model/records/custom/EventItem
  #173 = Methodref          #171.#174     // ext/mods/gameserver/model/records/custom/EventItem.chance:()I
  #174 = NameAndType        #175:#52      // chance:()I
  #175 = Utf8               chance
  #176 = Methodref          #136.#177     // ext/mods/commons/random/Rnd.get:(II)I
  #177 = NameAndType        #139:#178     // get:(II)I
  #178 = Utf8               (II)I
  #179 = Methodref          #171.#180     // ext/mods/gameserver/model/records/custom/EventItem.id:()I
  #180 = NameAndType        #181:#52      // id:()I
  #181 = Utf8               id
  #182 = Methodref          #171.#183     // ext/mods/gameserver/model/records/custom/EventItem.count:()I
  #183 = NameAndType        #184:#52      // count:()I
  #184 = Utf8               count
  #185 = Methodref          #144.#186     // ext/mods/gameserver/data/manager/EventsDropManager$Rewards."<init>":(II)V
  #186 = NameAndType        #5:#187       // "<init>":(II)V
  #187 = Utf8               (II)V
  #188 = InterfaceMethodref #88.#189      // java/util/List.add:(Ljava/lang/Object;)Z
  #189 = NameAndType        #190:#191     // add:(Ljava/lang/Object;)Z
  #190 = Utf8               add
  #191 = Utf8               (Ljava/lang/Object;)Z
  #192 = Methodref          #8.#193       // ext/mods/gameserver/data/manager/EventsDropManager.calculateRewardItem:(Ljava/util/Map;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #193 = NameAndType        #194:#195     // calculateRewardItem:(Ljava/util/Map;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #194 = Utf8               calculateRewardItem
  #195 = Utf8               (Ljava/util/Map;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #196 = Fieldref           #197.#198     // ext/mods/gameserver/data/manager/EventsDropManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/EventsDropManager;
  #197 = Class              #199          // ext/mods/gameserver/data/manager/EventsDropManager$SingletonHolder
  #198 = NameAndType        #200:#201     // INSTANCE:Lext/mods/gameserver/data/manager/EventsDropManager;
  #199 = Utf8               ext/mods/gameserver/data/manager/EventsDropManager$SingletonHolder
  #200 = Utf8               INSTANCE
  #201 = Utf8               Lext/mods/gameserver/data/manager/EventsDropManager;
  #202 = Methodref          #42.#203      // ext/mods/gameserver/data/manager/EventsDropManager$RewardRule.eventName:()Ljava/lang/String;
  #203 = NameAndType        #204:#205     // eventName:()Ljava/lang/String;
  #204 = Utf8               eventName
  #205 = Utf8               ()Ljava/lang/String;
  #206 = Methodref          #207.#208     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #207 = Class              #209          // java/lang/String
  #208 = NameAndType        #210:#191     // equals:(Ljava/lang/Object;)Z
  #209 = Utf8               java/lang/String
  #210 = Utf8               equals
  #211 = Utf8               Signature
  #212 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;>;
  #213 = Utf8               Code
  #214 = Utf8               LineNumberTable
  #215 = Utf8               LocalVariableTable
  #216 = Utf8               this
  #217 = Utf8               haveActiveChristmasEvent
  #218 = Utf8               haveActiveMedalsEvent
  #219 = Utf8               haveActiveL2DayEvent
  #220 = Utf8               haveActiveSquashEvent
  #221 = Utf8               addChristmasRule
  #222 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;)V
  #223 = Utf8               event
  #224 = Utf8               Ljava/lang/String;
  #225 = Utf8               type
  #226 = Utf8               Ljava/util/List;
  #227 = Utf8               LocalVariableTypeTable
  #228 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
  #229 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;)V
  #230 = Utf8               addMedalsRule
  #231 = Utf8               addL2DayRule
  #232 = Utf8               addSquashRule
  #233 = Utf8               rules
  #234 = Utf8               lvlControl
  #235 = Utf8               rule
  #236 = Utf8               Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;
  #237 = Utf8               (Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;>;Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;Z)V
  #238 = Utf8               removeChristmasRules
  #239 = Utf8               (Ljava/lang/String;)V
  #240 = Utf8               StackMapTable
  #241 = Utf8               removeMedalsRules
  #242 = Utf8               removeL2DayRules
  #243 = Utf8               removeSquashRules
  #244 = Utf8               (Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;>;Ljava/lang/String;)V
  #245 = Utf8               rndRew
  #246 = Utf8               I
  #247 = Utf8               npcTemplate
  #248 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #249 = Utf8               lastAttacker
  #250 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #251 = Utf8               res
  #252 = Utf8               lvlDif
  #253 = Utf8               rewardsList
  #254 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #255 = Utf8               Ljava/util/List<Lext/mods/gameserver/data/manager/EventsDropManager$Rewards;>;
  #256 = Utf8               (Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;>;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List<Ljava/lang/Integer;>;
  #257 = Utf8               item
  #258 = Utf8               Lext/mods/gameserver/model/records/custom/EventItem;
  #259 = Utf8               (Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;Ljava/util/List<Lext/mods/gameserver/data/manager/EventsDropManager$Rewards;>;)V
  #260 = Utf8               calculateChristmasRewardItem
  #261 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #262 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List<Ljava/lang/Integer;>;
  #263 = Utf8               calculateMedalsRewardItem
  #264 = Utf8               calculateL2DayRewardItem
  #265 = Utf8               calculateSquashRewardItem
  #266 = Utf8               getInstance
  #267 = Utf8               ()Lext/mods/gameserver/data/manager/EventsDropManager;
  #268 = Utf8               lambda$removeRules$0
  #269 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)Z
  #270 = Utf8               tmp
  #271 = Utf8               SourceFile
  #272 = Utf8               EventsDropManager.java
  #273 = Utf8               NestMembers
  #274 = Utf8               BootstrapMethods
  #275 = MethodType         #191          //  (Ljava/lang/Object;)Z
  #276 = MethodHandle       6:#277        // REF_invokeStatic ext/mods/gameserver/data/manager/EventsDropManager.lambda$removeRules$0:(Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)Z
  #277 = Methodref          #8.#278       // ext/mods/gameserver/data/manager/EventsDropManager.lambda$removeRules$0:(Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)Z
  #278 = NameAndType        #268:#269     // lambda$removeRules$0:(Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)Z
  #279 = MethodType         #280          //  (Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)Z
  #280 = Utf8               (Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)Z
  #281 = MethodHandle       6:#282        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #282 = Methodref          #283.#284     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #283 = Class              #285          // java/lang/invoke/LambdaMetafactory
  #284 = NameAndType        #286:#287     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #285 = Utf8               java/lang/invoke/LambdaMetafactory
  #286 = Utf8               metafactory
  #287 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #288 = Utf8               InnerClasses
  #289 = Utf8               RuleType
  #290 = Utf8               RewardRule
  #291 = Utf8               Rewards
  #292 = Utf8               SingletonHolder
  #293 = Class              #294          // java/lang/invoke/MethodHandles$Lookup
  #294 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #295 = Class              #296          // java/lang/invoke/MethodHandles
  #296 = Utf8               java/lang/invoke/MethodHandles
  #297 = Utf8               Lookup
{
  public ext.mods.gameserver.data.manager.EventsDropManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field _haveActiveChristmasEvent:Z
         9: aload_0
        10: iconst_0
        11: putfield      #13                 // Field _haveActiveMedalsEvent:Z
        14: aload_0
        15: iconst_0
        16: putfield      #16                 // Field _haveActiveL2DayEvent:Z
        19: aload_0
        20: iconst_0
        21: putfield      #19                 // Field _haveActiveSquashEvent:Z
        24: aload_0
        25: new           #22                 // class java/util/HashMap
        28: dup
        29: invokespecial #24                 // Method java/util/HashMap."<init>":()V
        32: putfield      #25                 // Field _rewardChristmasRules:Ljava/util/Map;
        35: aload_0
        36: new           #22                 // class java/util/HashMap
        39: dup
        40: invokespecial #24                 // Method java/util/HashMap."<init>":()V
        43: putfield      #29                 // Field _rewardMedalsRules:Ljava/util/Map;
        46: aload_0
        47: new           #22                 // class java/util/HashMap
        50: dup
        51: invokespecial #24                 // Method java/util/HashMap."<init>":()V
        54: putfield      #32                 // Field _rewardL2DayRules:Ljava/util/Map;
        57: aload_0
        58: new           #22                 // class java/util/HashMap
        61: dup
        62: invokespecial #24                 // Method java/util/HashMap."<init>":()V
        65: putfield      #35                 // Field _rewardSquashRules:Ljava/util/Map;
        68: return
      LineNumberTable:
        line 31: 0
        line 33: 4
        line 34: 9
        line 35: 14
        line 36: 19
        line 38: 24
        line 39: 35
        line 40: 46
        line 41: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      69     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;

  public boolean haveActiveChristmasEvent();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _haveActiveChristmasEvent:Z
         4: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;

  public boolean haveActiveMedalsEvent();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _haveActiveMedalsEvent:Z
         4: ireturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;

  public boolean haveActiveL2DayEvent();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _haveActiveL2DayEvent:Z
         4: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;

  public boolean haveActiveSquashEvent();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _haveActiveSquashEvent:Z
         4: ireturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;

  public void addChristmasRule(java.lang.String, ext.mods.gameserver.data.manager.EventsDropManager$RuleType, java.util.List<ext.mods.gameserver.model.records.custom.EventItem>);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: aload_0
         2: getfield      #25                 // Field _rewardChristmasRules:Ljava/util/Map;
         5: aload_1
         6: aload_2
         7: aload_3
         8: iconst_1
         9: invokevirtual #38                 // Method addRule:(Ljava/util/Map;Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;Z)V
        12: aload_0
        13: iconst_1
        14: putfield      #7                  // Field _haveActiveChristmasEvent:Z
        17: return
      LineNumberTable:
        line 72: 0
        line 73: 12
        line 74: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;
            0      18     1 event   Ljava/lang/String;
            0      18     2  type   Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
            0      18     3 items   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      18     3 items   Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
    Signature: #229                         // (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;)V

  public void addMedalsRule(java.lang.String, ext.mods.gameserver.data.manager.EventsDropManager$RuleType, java.util.List<ext.mods.gameserver.model.records.custom.EventItem>);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: aload_0
         2: getfield      #29                 // Field _rewardMedalsRules:Ljava/util/Map;
         5: aload_1
         6: aload_2
         7: aload_3
         8: iconst_1
         9: invokevirtual #38                 // Method addRule:(Ljava/util/Map;Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;Z)V
        12: aload_0
        13: iconst_1
        14: putfield      #13                 // Field _haveActiveMedalsEvent:Z
        17: return
      LineNumberTable:
        line 78: 0
        line 79: 12
        line 80: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;
            0      18     1 event   Ljava/lang/String;
            0      18     2  type   Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
            0      18     3 items   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      18     3 items   Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
    Signature: #229                         // (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;)V

  public void addL2DayRule(java.lang.String, ext.mods.gameserver.data.manager.EventsDropManager$RuleType, java.util.List<ext.mods.gameserver.model.records.custom.EventItem>);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: aload_0
         2: getfield      #32                 // Field _rewardL2DayRules:Ljava/util/Map;
         5: aload_1
         6: aload_2
         7: aload_3
         8: iconst_1
         9: invokevirtual #38                 // Method addRule:(Ljava/util/Map;Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;Z)V
        12: aload_0
        13: iconst_1
        14: putfield      #16                 // Field _haveActiveL2DayEvent:Z
        17: return
      LineNumberTable:
        line 84: 0
        line 85: 12
        line 86: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;
            0      18     1 event   Ljava/lang/String;
            0      18     2  type   Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
            0      18     3 items   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      18     3 items   Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
    Signature: #229                         // (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;)V

  public void addSquashRule(java.lang.String, ext.mods.gameserver.data.manager.EventsDropManager$RuleType, java.util.List<ext.mods.gameserver.model.records.custom.EventItem>);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: aload_0
         2: getfield      #35                 // Field _rewardSquashRules:Ljava/util/Map;
         5: aload_1
         6: aload_2
         7: aload_3
         8: iconst_1
         9: invokevirtual #38                 // Method addRule:(Ljava/util/Map;Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List;Z)V
        12: aload_0
        13: iconst_1
        14: putfield      #19                 // Field _haveActiveSquashEvent:Z
        17: return
      LineNumberTable:
        line 90: 0
        line 91: 12
        line 92: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;
            0      18     1 event   Ljava/lang/String;
            0      18     2  type   Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;
            0      18     3 items   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      18     3 items   Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;
    Signature: #229                         // (Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RuleType;Ljava/util/List<Lext/mods/gameserver/model/records/custom/EventItem;>;)V

  public void removeChristmasRules(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #25                 // Field _rewardChristmasRules:Ljava/util/Map;
         5: aload_1
         6: invokevirtual #63                 // Method removeRules:(Ljava/util/Map;Ljava/lang/String;)V
         9: aload_0
        10: aload_0
        11: getfield      #25                 // Field _rewardChristmasRules:Ljava/util/Map;
        14: invokeinterface #67,  1           // InterfaceMethod java/util/Map.isEmpty:()Z
        19: ifne          26
        22: iconst_1
        23: goto          27
        26: iconst_0
        27: putfield      #7                  // Field _haveActiveChristmasEvent:Z
        30: return
      LineNumberTable:
        line 102: 0
        line 103: 9
        line 104: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;
            0      31     1 event   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 90 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/data/manager/EventsDropManager ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/data/manager/EventsDropManager, class java/lang/String ]
          stack = [ class ext/mods/gameserver/data/manager/EventsDropManager, int ]

  public void removeMedalsRules(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #29                 // Field _rewardMedalsRules:Ljava/util/Map;
         5: aload_1
         6: invokevirtual #63                 // Method removeRules:(Ljava/util/Map;Ljava/lang/String;)V
         9: aload_0
        10: aload_0
        11: getfield      #29                 // Field _rewardMedalsRules:Ljava/util/Map;
        14: invokeinterface #67,  1           // InterfaceMethod java/util/Map.isEmpty:()Z
        19: ifne          26
        22: iconst_1
        23: goto          27
        26: iconst_0
        27: putfield      #13                 // Field _haveActiveMedalsEvent:Z
        30: return
      LineNumberTable:
        line 108: 0
        line 109: 9
        line 110: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;
            0      31     1 event   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 90 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/data/manager/EventsDropManager ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/data/manager/EventsDropManager, class java/lang/String ]
          stack = [ class ext/mods/gameserver/data/manager/EventsDropManager, int ]

  public void removeL2DayRules(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #32                 // Field _rewardL2DayRules:Ljava/util/Map;
         5: aload_1
         6: invokevirtual #63                 // Method removeRules:(Ljava/util/Map;Ljava/lang/String;)V
         9: aload_0
        10: aload_0
        11: getfield      #32                 // Field _rewardL2DayRules:Ljava/util/Map;
        14: invokeinterface #67,  1           // InterfaceMethod java/util/Map.isEmpty:()Z
        19: ifne          26
        22: iconst_1
        23: goto          27
        26: iconst_0
        27: putfield      #16                 // Field _haveActiveL2DayEvent:Z
        30: return
      LineNumberTable:
        line 114: 0
        line 115: 9
        line 116: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;
            0      31     1 event   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 90 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/data/manager/EventsDropManager ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/data/manager/EventsDropManager, class java/lang/String ]
          stack = [ class ext/mods/gameserver/data/manager/EventsDropManager, int ]

  public void removeSquashRules(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #35                 // Field _rewardSquashRules:Ljava/util/Map;
         5: aload_1
         6: invokevirtual #63                 // Method removeRules:(Ljava/util/Map;Ljava/lang/String;)V
         9: aload_0
        10: aload_0
        11: getfield      #35                 // Field _rewardSquashRules:Ljava/util/Map;
        14: invokeinterface #67,  1           // InterfaceMethod java/util/Map.isEmpty:()Z
        19: ifne          26
        22: iconst_1
        23: goto          27
        26: iconst_0
        27: putfield      #19                 // Field _haveActiveSquashEvent:Z
        30: return
      LineNumberTable:
        line 120: 0
        line 121: 9
        line 122: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;
            0      31     1 event   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 90 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/data/manager/EventsDropManager ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/data/manager/EventsDropManager, class java/lang/String ]
          stack = [ class ext/mods/gameserver/data/manager/EventsDropManager, int ]

  public java.util.List<java.lang.Integer> calculateChristmasRewardItem(ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_0
         2: getfield      #25                 // Field _rewardChristmasRules:Ljava/util/Map;
         5: aload_1
         6: aload_2
         7: invokevirtual #192                // Method calculateRewardItem:(Ljava/util/Map;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
        10: areturn
      LineNumberTable:
        line 180: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;
            0      11     1 npcTemplate   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      11     2 lastAttacker   Lext/mods/gameserver/model/actor/Creature;
    Signature: #262                         // (Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List<Ljava/lang/Integer;>;

  public java.util.List<java.lang.Integer> calculateMedalsRewardItem(ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_0
         2: getfield      #29                 // Field _rewardMedalsRules:Ljava/util/Map;
         5: aload_1
         6: aload_2
         7: invokevirtual #192                // Method calculateRewardItem:(Ljava/util/Map;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
        10: areturn
      LineNumberTable:
        line 185: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;
            0      11     1 npcTemplate   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      11     2 lastAttacker   Lext/mods/gameserver/model/actor/Creature;
    Signature: #262                         // (Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List<Ljava/lang/Integer;>;

  public java.util.List<java.lang.Integer> calculateL2DayRewardItem(ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_0
         2: getfield      #32                 // Field _rewardL2DayRules:Ljava/util/Map;
         5: aload_1
         6: aload_2
         7: invokevirtual #192                // Method calculateRewardItem:(Ljava/util/Map;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
        10: areturn
      LineNumberTable:
        line 190: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;
            0      11     1 npcTemplate   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      11     2 lastAttacker   Lext/mods/gameserver/model/actor/Creature;
    Signature: #262                         // (Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List<Ljava/lang/Integer;>;

  public java.util.List<java.lang.Integer> calculateSquashRewardItem(ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_0
         2: getfield      #35                 // Field _rewardSquashRules:Ljava/util/Map;
         5: aload_1
         6: aload_2
         7: invokevirtual #192                // Method calculateRewardItem:(Ljava/util/Map;Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
        10: areturn
      LineNumberTable:
        line 195: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/data/manager/EventsDropManager;
            0      11     1 npcTemplate   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      11     2 lastAttacker   Lext/mods/gameserver/model/actor/Creature;
    Signature: #262                         // (Lext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List<Ljava/lang/Integer;>;

  public static final ext.mods.gameserver.data.manager.EventsDropManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/EventsDropManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #196                // Field ext/mods/gameserver/data/manager/EventsDropManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/EventsDropManager;
         3: areturn
      LineNumberTable:
        line 200: 0
}
SourceFile: "EventsDropManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/EventsDropManager$SingletonHolder
  ext/mods/gameserver/data/manager/EventsDropManager$Rewards
  ext/mods/gameserver/data/manager/EventsDropManager$RewardRule
  ext/mods/gameserver/data/manager/EventsDropManager$RuleType
BootstrapMethods:
  0: #281 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #275 (Ljava/lang/Object;)Z
      #276 REF_invokeStatic ext/mods/gameserver/data/manager/EventsDropManager.lambda$removeRules$0:(Ljava/lang/String;Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)Z
      #279 (Lext/mods/gameserver/data/manager/EventsDropManager$RewardRule;)Z
InnerClasses:
  public static final #289= #161 of #8;   // RuleType=class ext/mods/gameserver/data/manager/EventsDropManager$RuleType of class ext/mods/gameserver/data/manager/EventsDropManager
  public static final #290= #42 of #8;    // RewardRule=class ext/mods/gameserver/data/manager/EventsDropManager$RewardRule of class ext/mods/gameserver/data/manager/EventsDropManager
  public static final #291= #144 of #8;   // Rewards=class ext/mods/gameserver/data/manager/EventsDropManager$Rewards of class ext/mods/gameserver/data/manager/EventsDropManager
  public static final #297= #293 of #295; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
