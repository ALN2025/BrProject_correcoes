// Bytecode for: ext.mods.gameserver.model.actor.ai.type.AbstractAI
// File: ext\mods\gameserver\model\actor\ai\type\AbstractAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/AbstractAI.class
  Last modified 9 de jul de 2026; size 12925 bytes
  MD5 checksum a47e1f9621471b00b3a36722fefbaa15
  Compiled from "AbstractAI.java"
public abstract class ext.mods.gameserver.model.actor.ai.type.AbstractAI<T extends ext.mods.gameserver.model.actor.Creature> extends java.lang.Object
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #11                         // ext/mods/gameserver/model/actor/ai/type/AbstractAI
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 64, attributes: 5
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/ai/Intention
    #8 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
    #9 = Methodref          #7.#3         // ext/mods/gameserver/model/actor/ai/Intention."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/actor/ai/type/AbstractAI._currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #11 = Class              #13           // ext/mods/gameserver/model/actor/ai/type/AbstractAI
   #12 = NameAndType        #14:#15       // _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #13 = Utf8               ext/mods/gameserver/model/actor/ai/type/AbstractAI
   #14 = Utf8               _currentIntention
   #15 = Utf8               Lext/mods/gameserver/model/actor/ai/Intention;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/model/actor/ai/type/AbstractAI._nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #17 = NameAndType        #18:#15       // _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #18 = Utf8               _nextIntention
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/model/actor/ai/type/AbstractAI._actor:Lext/mods/gameserver/model/actor/Creature;
   #20 = NameAndType        #21:#22       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #21 = Utf8               _actor
   #22 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #23 = Methodref          #24.#25       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #24 = Class              #26           // java/lang/String
   #25 = NameAndType        #27:#28       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #26 = Utf8               java/lang/String
   #27 = Utf8               valueOf
   #28 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #29 = InvokeDynamic      #0:#30        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #30 = NameAndType        #31:#32       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #31 = Utf8               makeConcatWithConstants
   #32 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #33 = Methodref          #7.#34        // ext/mods/gameserver/model/actor/ai/Intention.updateUsing:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #34 = NameAndType        #35:#36       // updateUsing:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #35 = Utf8               updateUsing
   #36 = Utf8               (Lext/mods/gameserver/model/actor/ai/Intention;)V
   #37 = Methodref          #38.#39       // ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #38 = Class              #40           // ext/mods/gameserver/model/actor/Creature
   #39 = NameAndType        #41:#42       // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #40 = Utf8               ext/mods/gameserver/model/actor/Creature
   #41 = Utf8               getMove
   #42 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/move/CreatureMove.cancelFollowTask:()V
   #44 = Class              #46           // ext/mods/gameserver/model/actor/move/CreatureMove
   #45 = NameAndType        #47:#6        // cancelFollowTask:()V
   #46 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
   #47 = Utf8               cancelFollowTask
   #48 = Methodref          #7.#49        // ext/mods/gameserver/model/actor/ai/Intention.updateAsIdle:()V
   #49 = NameAndType        #50:#6        // updateAsIdle:()V
   #50 = Utf8               updateAsIdle
   #51 = Methodref          #11.#52       // ext/mods/gameserver/model/actor/ai/type/AbstractAI.prepareIntention:()V
   #52 = NameAndType        #53:#6        // prepareIntention:()V
   #53 = Utf8               prepareIntention
   #54 = Methodref          #7.#55        // ext/mods/gameserver/model/actor/ai/Intention.updateAsAttack:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
   #55 = NameAndType        #56:#57       // updateAsAttack:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
   #56 = Utf8               updateAsAttack
   #57 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ZZZ)V
   #58 = Methodref          #11.#59       // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkAttack:()V
   #59 = NameAndType        #60:#6        // thinkAttack:()V
   #60 = Utf8               thinkAttack
   #61 = Methodref          #7.#62        // ext/mods/gameserver/model/actor/ai/Intention.updateAsCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
   #62 = NameAndType        #63:#64       // updateAsCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
   #63 = Utf8               updateAsCast
   #64 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
   #65 = Methodref          #11.#66       // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkCast:()V
   #66 = NameAndType        #67:#6        // thinkCast:()V
   #67 = Utf8               thinkCast
   #68 = Methodref          #7.#69        // ext/mods/gameserver/model/actor/ai/Intention.updateAsFakeDeath:(Z)V
   #69 = NameAndType        #70:#71       // updateAsFakeDeath:(Z)V
   #70 = Utf8               updateAsFakeDeath
   #71 = Utf8               (Z)V
   #72 = Methodref          #11.#73       // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkFakeDeath:()V
   #73 = NameAndType        #74:#6        // thinkFakeDeath:()V
   #74 = Utf8               thinkFakeDeath
   #75 = Methodref          #7.#76        // ext/mods/gameserver/model/actor/ai/Intention.updateAsFlee:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
   #76 = NameAndType        #77:#78       // updateAsFlee:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
   #77 = Utf8               updateAsFlee
   #78 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
   #79 = Methodref          #11.#80       // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkFlee:()V
   #80 = NameAndType        #81:#6        // thinkFlee:()V
   #81 = Utf8               thinkFlee
   #82 = Methodref          #7.#83        // ext/mods/gameserver/model/actor/ai/Intention.updateAsFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
   #83 = NameAndType        #84:#85       // updateAsFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
   #84 = Utf8               updateAsFollow
   #85 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Z)V
   #86 = Methodref          #11.#87       // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkFollow:()V
   #87 = NameAndType        #88:#6        // thinkFollow:()V
   #88 = Utf8               thinkFollow
   #89 = Methodref          #11.#90       // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkIdle:()V
   #90 = NameAndType        #91:#6        // thinkIdle:()V
   #91 = Utf8               thinkIdle
   #92 = Methodref          #7.#93        // ext/mods/gameserver/model/actor/ai/Intention.updateAsInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
   #93 = NameAndType        #94:#95       // updateAsInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
   #94 = Utf8               updateAsInteract
   #95 = Utf8               (Lext/mods/gameserver/model/WorldObject;ZZ)V
   #96 = Methodref          #11.#97       // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkInteract:()V
   #97 = NameAndType        #98:#6        // thinkInteract:()V
   #98 = Utf8               thinkInteract
   #99 = Methodref          #7.#100       // ext/mods/gameserver/model/actor/ai/Intention.updateAsMoveRoute:(Ljava/lang/String;)V
  #100 = NameAndType        #101:#102     // updateAsMoveRoute:(Ljava/lang/String;)V
  #101 = Utf8               updateAsMoveRoute
  #102 = Utf8               (Ljava/lang/String;)V
  #103 = Methodref          #11.#104      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkMoveRoute:()V
  #104 = NameAndType        #105:#6       // thinkMoveRoute:()V
  #105 = Utf8               thinkMoveRoute
  #106 = Methodref          #7.#107       // ext/mods/gameserver/model/actor/ai/Intention.updateAsMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #107 = NameAndType        #108:#109     // updateAsMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #108 = Utf8               updateAsMoveTo
  #109 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #110 = Methodref          #11.#111      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkMoveTo:()V
  #111 = NameAndType        #112:#6       // thinkMoveTo:()V
  #112 = Utf8               thinkMoveTo
  #113 = Methodref          #7.#114       // ext/mods/gameserver/model/actor/ai/Intention.updateAsNothing:(I)V
  #114 = NameAndType        #115:#116     // updateAsNothing:(I)V
  #115 = Utf8               updateAsNothing
  #116 = Utf8               (I)V
  #117 = Methodref          #11.#118      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkNothing:()V
  #118 = NameAndType        #119:#6       // thinkNothing:()V
  #119 = Utf8               thinkNothing
  #120 = Methodref          #7.#121       // ext/mods/gameserver/model/actor/ai/Intention.updateAsPickUp:(IZ)V
  #121 = NameAndType        #122:#123     // updateAsPickUp:(IZ)V
  #122 = Utf8               updateAsPickUp
  #123 = Utf8               (IZ)V
  #124 = Methodref          #11.#125      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkPickUp:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #125 = NameAndType        #126:#127     // thinkPickUp:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #126 = Utf8               thinkPickUp
  #127 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #128 = Methodref          #7.#129       // ext/mods/gameserver/model/actor/ai/Intention.updateAsSit:(Lext/mods/gameserver/model/WorldObject;)V
  #129 = NameAndType        #130:#131     // updateAsSit:(Lext/mods/gameserver/model/WorldObject;)V
  #130 = Utf8               updateAsSit
  #131 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #132 = Methodref          #11.#133      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkSit:()V
  #133 = NameAndType        #134:#6       // thinkSit:()V
  #134 = Utf8               thinkSit
  #135 = Methodref          #7.#136       // ext/mods/gameserver/model/actor/ai/Intention.updateAsSocial:(II)V
  #136 = NameAndType        #137:#138     // updateAsSocial:(II)V
  #137 = Utf8               updateAsSocial
  #138 = Utf8               (II)V
  #139 = Methodref          #11.#140      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkSocial:()V
  #140 = NameAndType        #141:#6       // thinkSocial:()V
  #141 = Utf8               thinkSocial
  #142 = Methodref          #7.#143       // ext/mods/gameserver/model/actor/ai/Intention.updateAsStand:()V
  #143 = NameAndType        #144:#6       // updateAsStand:()V
  #144 = Utf8               updateAsStand
  #145 = Methodref          #11.#146      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkStand:()V
  #146 = NameAndType        #147:#6       // thinkStand:()V
  #147 = Utf8               thinkStand
  #148 = Methodref          #7.#149       // ext/mods/gameserver/model/actor/ai/Intention.updateAsUseItem:(I)V
  #149 = NameAndType        #150:#116     // updateAsUseItem:(I)V
  #150 = Utf8               updateAsUseItem
  #151 = Methodref          #11.#152      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkUseItem:()V
  #152 = NameAndType        #153:#6       // thinkUseItem:()V
  #153 = Utf8               thinkUseItem
  #154 = Methodref          #7.#155       // ext/mods/gameserver/model/actor/ai/Intention.updateAsWander:(I)V
  #155 = NameAndType        #156:#116     // updateAsWander:(I)V
  #156 = Utf8               updateAsWander
  #157 = Methodref          #11.#158      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.thinkWander:()V
  #158 = NameAndType        #159:#6       // thinkWander:()V
  #159 = Utf8               thinkWander
  #160 = Fieldref           #161.#162     // ext/mods/gameserver/model/actor/ai/type/AbstractAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
  #161 = Class              #163          // ext/mods/gameserver/model/actor/ai/type/AbstractAI$1
  #162 = NameAndType        #164:#165     // $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
  #163 = Utf8               ext/mods/gameserver/model/actor/ai/type/AbstractAI$1
  #164 = Utf8               $SwitchMap$ext$mods$gameserver$enums$IntentionType
  #165 = Utf8               [I
  #166 = Methodref          #7.#167       // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
  #167 = NameAndType        #168:#169     // getType:()Lext/mods/gameserver/enums/IntentionType;
  #168 = Utf8               getType
  #169 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
  #170 = Methodref          #171.#172     // ext/mods/gameserver/enums/IntentionType.ordinal:()I
  #171 = Class              #173          // ext/mods/gameserver/enums/IntentionType
  #172 = NameAndType        #174:#175     // ordinal:()I
  #173 = Utf8               ext/mods/gameserver/enums/IntentionType
  #174 = Utf8               ordinal
  #175 = Utf8               ()I
  #176 = Methodref          #7.#177       // ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
  #177 = NameAndType        #178:#179     // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
  #178 = Utf8               getFinalTarget
  #179 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
  #180 = Methodref          #7.#181       // ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
  #181 = NameAndType        #182:#183     // isCtrlPressed:()Z
  #182 = Utf8               isCtrlPressed
  #183 = Utf8               ()Z
  #184 = Methodref          #7.#185       // ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
  #185 = NameAndType        #186:#183     // isShiftPressed:()Z
  #186 = Utf8               isShiftPressed
  #187 = Methodref          #7.#188       // ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
  #188 = NameAndType        #189:#183     // canMoveToTarget:()Z
  #189 = Utf8               canMoveToTarget
  #190 = Methodref          #11.#191      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doAttackIntention:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
  #191 = NameAndType        #192:#57      // doAttackIntention:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
  #192 = Utf8               doAttackIntention
  #193 = Methodref          #7.#194       // ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #194 = NameAndType        #195:#196     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #195 = Utf8               getSkill
  #196 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #197 = Methodref          #7.#198       // ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
  #198 = NameAndType        #199:#175     // getItemObjectId:()I
  #199 = Utf8               getItemObjectId
  #200 = Methodref          #11.#201      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doCastIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
  #201 = NameAndType        #202:#203     // doCastIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
  #202 = Utf8               doCastIntention
  #203 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
  #204 = Methodref          #11.#205      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doFakeDeathIntention:(Z)V
  #205 = NameAndType        #206:#71      // doFakeDeathIntention:(Z)V
  #206 = Utf8               doFakeDeathIntention
  #207 = Methodref          #7.#208       // ext/mods/gameserver/model/actor/ai/Intention.getLoc:()Lext/mods/gameserver/model/location/Location;
  #208 = NameAndType        #209:#210     // getLoc:()Lext/mods/gameserver/model/location/Location;
  #209 = Utf8               getLoc
  #210 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #211 = Methodref          #11.#212      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doFleeIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
  #212 = NameAndType        #213:#78      // doFleeIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
  #213 = Utf8               doFleeIntention
  #214 = Methodref          #11.#215      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doFollowIntention:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #215 = NameAndType        #216:#85      // doFollowIntention:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #216 = Utf8               doFollowIntention
  #217 = Methodref          #11.#218      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doIdleIntention:()V
  #218 = NameAndType        #219:#6       // doIdleIntention:()V
  #219 = Utf8               doIdleIntention
  #220 = Methodref          #7.#221       // ext/mods/gameserver/model/actor/ai/Intention.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #221 = NameAndType        #222:#223     // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #222 = Utf8               getTarget
  #223 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #224 = Methodref          #11.#225      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doInteractIntention:(Lext/mods/gameserver/model/WorldObject;ZZ)V
  #225 = NameAndType        #226:#95      // doInteractIntention:(Lext/mods/gameserver/model/WorldObject;ZZ)V
  #226 = Utf8               doInteractIntention
  #227 = Methodref          #7.#228       // ext/mods/gameserver/model/actor/ai/Intention.getRouteName:()Ljava/lang/String;
  #228 = NameAndType        #229:#230     // getRouteName:()Ljava/lang/String;
  #229 = Utf8               getRouteName
  #230 = Utf8               ()Ljava/lang/String;
  #231 = Methodref          #11.#232      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doMoveRouteIntention:(Ljava/lang/String;)V
  #232 = NameAndType        #233:#102     // doMoveRouteIntention:(Ljava/lang/String;)V
  #233 = Utf8               doMoveRouteIntention
  #234 = Methodref          #7.#235       // ext/mods/gameserver/model/actor/ai/Intention.getBoat:()Lext/mods/gameserver/model/actor/Boat;
  #235 = NameAndType        #236:#237     // getBoat:()Lext/mods/gameserver/model/actor/Boat;
  #236 = Utf8               getBoat
  #237 = Utf8               ()Lext/mods/gameserver/model/actor/Boat;
  #238 = Methodref          #11.#239      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doMoveToIntention:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #239 = NameAndType        #240:#109     // doMoveToIntention:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #240 = Utf8               doMoveToIntention
  #241 = Methodref          #7.#242       // ext/mods/gameserver/model/actor/ai/Intention.getTimer:()I
  #242 = NameAndType        #243:#175     // getTimer:()I
  #243 = Utf8               getTimer
  #244 = Methodref          #11.#245      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doNothingIntention:(I)V
  #245 = NameAndType        #246:#116     // doNothingIntention:(I)V
  #246 = Utf8               doNothingIntention
  #247 = Methodref          #11.#248      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doPickUpIntention:(IZ)V
  #248 = NameAndType        #249:#123     // doPickUpIntention:(IZ)V
  #249 = Utf8               doPickUpIntention
  #250 = Methodref          #11.#251      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doSitIntention:(Lext/mods/gameserver/model/WorldObject;)V
  #251 = NameAndType        #252:#131     // doSitIntention:(Lext/mods/gameserver/model/WorldObject;)V
  #252 = Utf8               doSitIntention
  #253 = Methodref          #11.#254      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doSocialIntention:(II)V
  #254 = NameAndType        #255:#138     // doSocialIntention:(II)V
  #255 = Utf8               doSocialIntention
  #256 = Methodref          #11.#257      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doStandIntention:()V
  #257 = NameAndType        #258:#6       // doStandIntention:()V
  #258 = Utf8               doStandIntention
  #259 = Methodref          #11.#260      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doUseItemIntention:(I)V
  #260 = NameAndType        #261:#116     // doUseItemIntention:(I)V
  #261 = Utf8               doUseItemIntention
  #262 = Methodref          #11.#263      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.doWanderIntention:(I)V
  #263 = NameAndType        #264:#116     // doWanderIntention:(I)V
  #264 = Utf8               doWanderIntention
  #265 = Methodref          #38.#266      // ext/mods/gameserver/model/actor/Creature.isVisible:()Z
  #266 = NameAndType        #267:#183     // isVisible:()Z
  #267 = Utf8               isVisible
  #268 = Methodref          #38.#269      // ext/mods/gameserver/model/actor/Creature.isTeleporting:()Z
  #269 = NameAndType        #270:#183     // isTeleporting:()Z
  #270 = Utf8               isTeleporting
  #271 = Fieldref           #161.#272     // ext/mods/gameserver/model/actor/ai/type/AbstractAI$1.$SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
  #272 = NameAndType        #273:#165     // $SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
  #273 = Utf8               $SwitchMap$ext$mods$gameserver$enums$AiEventType
  #274 = Methodref          #275.#172     // ext/mods/gameserver/enums/AiEventType.ordinal:()I
  #275 = Class              #276          // ext/mods/gameserver/enums/AiEventType
  #276 = Utf8               ext/mods/gameserver/enums/AiEventType
  #277 = Methodref          #11.#278      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtThink:()V
  #278 = NameAndType        #279:#6       // onEvtThink:()V
  #279 = Utf8               onEvtThink
  #280 = Methodref          #11.#281      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
  #281 = NameAndType        #282:#283     // onEvtAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
  #282 = Utf8               onEvtAttacked
  #283 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #284 = Class              #285          // java/lang/Number
  #285 = Utf8               java/lang/Number
  #286 = Methodref          #284.#287     // java/lang/Number.intValue:()I
  #287 = NameAndType        #288:#175     // intValue:()I
  #288 = Utf8               intValue
  #289 = Methodref          #11.#290      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtAggression:(Lext/mods/gameserver/model/actor/Creature;I)V
  #290 = NameAndType        #291:#292     // onEvtAggression:(Lext/mods/gameserver/model/actor/Creature;I)V
  #291 = Utf8               onEvtAggression
  #292 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
  #293 = Methodref          #11.#294      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtEvaded:(Lext/mods/gameserver/model/actor/Creature;)V
  #294 = NameAndType        #295:#283     // onEvtEvaded:(Lext/mods/gameserver/model/actor/Creature;)V
  #295 = Utf8               onEvtEvaded
  #296 = Methodref          #11.#297      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtFinishedAttack:()V
  #297 = NameAndType        #298:#6       // onEvtFinishedAttack:()V
  #298 = Utf8               onEvtFinishedAttack
  #299 = Methodref          #11.#300      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtFinishedAttackBow:()V
  #300 = NameAndType        #301:#6       // onEvtFinishedAttackBow:()V
  #301 = Utf8               onEvtFinishedAttackBow
  #302 = Methodref          #11.#303      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtBowAttackReuse:()V
  #303 = NameAndType        #304:#6       // onEvtBowAttackReuse:()V
  #304 = Utf8               onEvtBowAttackReuse
  #305 = Methodref          #11.#306      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtArrived:()V
  #306 = NameAndType        #307:#6       // onEvtArrived:()V
  #307 = Utf8               onEvtArrived
  #308 = Methodref          #11.#309      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtArrivedBlocked:()V
  #309 = NameAndType        #310:#6       // onEvtArrivedBlocked:()V
  #310 = Utf8               onEvtArrivedBlocked
  #311 = Methodref          #11.#312      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtCancel:()V
  #312 = NameAndType        #313:#6       // onEvtCancel:()V
  #313 = Utf8               onEvtCancel
  #314 = Methodref          #11.#315      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtDead:()V
  #315 = NameAndType        #316:#6       // onEvtDead:()V
  #316 = Utf8               onEvtDead
  #317 = Methodref          #11.#318      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtFinishedCasting:()V
  #318 = NameAndType        #319:#6       // onEvtFinishedCasting:()V
  #319 = Utf8               onEvtFinishedCasting
  #320 = Class              #321          // ext/mods/gameserver/model/WorldObject
  #321 = Utf8               ext/mods/gameserver/model/WorldObject
  #322 = Methodref          #11.#323      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtSatDown:(Lext/mods/gameserver/model/WorldObject;)V
  #323 = NameAndType        #324:#131     // onEvtSatDown:(Lext/mods/gameserver/model/WorldObject;)V
  #324 = Utf8               onEvtSatDown
  #325 = Methodref          #11.#326      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtStoodUp:()V
  #326 = NameAndType        #327:#6       // onEvtStoodUp:()V
  #327 = Utf8               onEvtStoodUp
  #328 = Methodref          #11.#329      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtOwnerAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
  #329 = NameAndType        #330:#283     // onEvtOwnerAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
  #330 = Utf8               onEvtOwnerAttacked
  #331 = Methodref          #11.#332      // ext/mods/gameserver/model/actor/ai/type/AbstractAI.onEvtTeleported:()V
  #332 = NameAndType        #333:#6       // onEvtTeleported:()V
  #333 = Utf8               onEvtTeleported
  #334 = Fieldref           #171.#335     // ext/mods/gameserver/enums/IntentionType.STAND:Lext/mods/gameserver/enums/IntentionType;
  #335 = NameAndType        #336:#337     // STAND:Lext/mods/gameserver/enums/IntentionType;
  #336 = Utf8               STAND
  #337 = Utf8               Lext/mods/gameserver/enums/IntentionType;
  #338 = Fieldref           #171.#339     // ext/mods/gameserver/enums/IntentionType.SIT:Lext/mods/gameserver/enums/IntentionType;
  #339 = NameAndType        #340:#337     // SIT:Lext/mods/gameserver/enums/IntentionType;
  #340 = Utf8               SIT
  #341 = Methodref          #342.#343     // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
  #342 = Class              #344          // ext/mods/gameserver/taskmanager/AttackStanceTaskManager
  #343 = NameAndType        #345:#346     // getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
  #344 = Utf8               ext/mods/gameserver/taskmanager/AttackStanceTaskManager
  #345 = Utf8               getInstance
  #346 = Utf8               ()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
  #347 = Methodref          #342.#348     // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
  #348 = NameAndType        #349:#350     // isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
  #349 = Utf8               isInAttackStance
  #350 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #351 = Class              #352          // ext/mods/gameserver/network/serverpackets/AutoAttackStart
  #352 = Utf8               ext/mods/gameserver/network/serverpackets/AutoAttackStart
  #353 = Methodref          #38.#354      // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
  #354 = NameAndType        #355:#175     // getObjectId:()I
  #355 = Utf8               getObjectId
  #356 = Methodref          #351.#357     // ext/mods/gameserver/network/serverpackets/AutoAttackStart."<init>":(I)V
  #357 = NameAndType        #5:#116       // "<init>":(I)V
  #358 = Methodref          #38.#359      // ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #359 = NameAndType        #360:#361     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #360 = Utf8               broadcastPacket
  #361 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #362 = Methodref          #342.#363     // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.add:(Lext/mods/gameserver/model/actor/Creature;)V
  #363 = NameAndType        #364:#283     // add:(Lext/mods/gameserver/model/actor/Creature;)V
  #364 = Utf8               add
  #365 = Methodref          #342.#366     // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.remove:(Lext/mods/gameserver/model/actor/Creature;)Z
  #366 = NameAndType        #367:#350     // remove:(Lext/mods/gameserver/model/actor/Creature;)Z
  #367 = Utf8               remove
  #368 = Class              #369          // ext/mods/gameserver/network/serverpackets/AutoAttackStop
  #369 = Utf8               ext/mods/gameserver/network/serverpackets/AutoAttackStop
  #370 = Methodref          #368.#357     // ext/mods/gameserver/network/serverpackets/AutoAttackStop."<init>":(I)V
  #371 = Methodref          #38.#372      // ext/mods/gameserver/model/actor/Creature.isMoving:()Z
  #372 = NameAndType        #373:#183     // isMoving:()Z
  #373 = Utf8               isMoving
  #374 = Methodref          #44.#375      // ext/mods/gameserver/model/actor/move/CreatureMove.describeMovementTo:(Lext/mods/gameserver/model/actor/Player;)V
  #375 = NameAndType        #376:#377     // describeMovementTo:(Lext/mods/gameserver/model/actor/Player;)V
  #376 = Utf8               describeMovementTo
  #377 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #378 = Methodref          #38.#379      // ext/mods/gameserver/model/actor/Creature.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #379 = NameAndType        #380:#381     // getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #380 = Utf8               getCast
  #381 = Utf8               ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #382 = Methodref          #383.#384     // ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
  #383 = Class              #385          // ext/mods/gameserver/model/actor/cast/CreatureCast
  #384 = NameAndType        #386:#183     // isCastingNow:()Z
  #385 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
  #386 = Utf8               isCastingNow
  #387 = Methodref          #383.#388     // ext/mods/gameserver/model/actor/cast/CreatureCast.describeCastTo:(Lext/mods/gameserver/model/actor/Player;)V
  #388 = NameAndType        #389:#377     // describeCastTo:(Lext/mods/gameserver/model/actor/Player;)V
  #389 = Utf8               describeCastTo
  #390 = Methodref          #391.#392     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #391 = Class              #393          // ext/mods/gameserver/model/World
  #392 = NameAndType        #345:#394     // getInstance:()Lext/mods/gameserver/model/World;
  #393 = Utf8               ext/mods/gameserver/model/World
  #394 = Utf8               ()Lext/mods/gameserver/model/World;
  #395 = Methodref          #320.#354     // ext/mods/gameserver/model/WorldObject.getObjectId:()I
  #396 = Methodref          #391.#397     // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #397 = NameAndType        #398:#399     // getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #398 = Utf8               getObject
  #399 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
  #400 = Methodref          #38.#401      // ext/mods/gameserver/model/actor/Creature.knows:(Lext/mods/gameserver/model/WorldObject;)Z
  #401 = NameAndType        #402:#403     // knows:(Lext/mods/gameserver/model/WorldObject;)Z
  #402 = Utf8               knows
  #403 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #404 = Methodref          #405.#406     // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #405 = Class              #407          // ext/mods/gameserver/skills/L2Skill
  #406 = NameAndType        #408:#409     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #407 = Utf8               ext/mods/gameserver/skills/L2Skill
  #408 = Utf8               getSkillType
  #409 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #410 = Fieldref           #411.#412     // ext/mods/gameserver/enums/skills/SkillType.SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
  #411 = Class              #413          // ext/mods/gameserver/enums/skills/SkillType
  #412 = NameAndType        #414:#415     // SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
  #413 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #414 = Utf8               SUMMON_FRIEND
  #415 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #416 = Utf8               Signature
  #417 = Utf8               TT;
  #418 = Utf8               Code
  #419 = Utf8               LineNumberTable
  #420 = Utf8               LocalVariableTable
  #421 = Utf8               this
  #422 = Utf8               Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
  #423 = Utf8               actor
  #424 = Utf8               LocalVariableTypeTable
  #425 = Utf8               Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;
  #426 = Utf8               (TT;)V
  #427 = Utf8               toString
  #428 = Utf8               getCurrentIntention
  #429 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
  #430 = Utf8               getNextIntention
  #431 = Utf8               setNextIntention
  #432 = Utf8               intention
  #433 = Utf8               target
  #434 = Utf8               Z
  #435 = Utf8               skill
  #436 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #437 = Utf8               itemObjectId
  #438 = Utf8               I
  #439 = Utf8               startFakeDeath
  #440 = Utf8               startLoc
  #441 = Utf8               Lext/mods/gameserver/model/location/Location;
  #442 = Utf8               distance
  #443 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #444 = Utf8               routeName
  #445 = Utf8               Ljava/lang/String;
  #446 = Utf8               loc
  #447 = Utf8               boat
  #448 = Utf8               Lext/mods/gameserver/model/actor/Boat;
  #449 = Utf8               timer
  #450 = Utf8               id
  #451 = Utf8               doIntention
  #452 = Utf8               StackMapTable
  #453 = Utf8               notifyEvent
  #454 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #455 = Utf8               evt
  #456 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #457 = Utf8               firstParameter
  #458 = Utf8               Ljava/lang/Object;
  #459 = Utf8               secondParameter
  #460 = Utf8               canScheduleAfter
  #461 = Utf8               (Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
  #462 = Utf8               oldIntention
  #463 = Utf8               newIntention
  #464 = Utf8               clientActionFailed
  #465 = Utf8               startAttackStance
  #466 = Utf8               stopAttackStance
  #467 = Utf8               describeStateToPlayer
  #468 = Utf8               player
  #469 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #470 = Utf8               stopAITask
  #471 = Utf8               isTargetLost
  #472 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
  #473 = Utf8               <T:Lext/mods/gameserver/model/actor/Creature;>Ljava/lang/Object;
  #474 = Utf8               SourceFile
  #475 = Utf8               AbstractAI.java
  #476 = Utf8               NestMembers
  #477 = Utf8               BootstrapMethods
  #478 = String             #479          // Actor: \u0001
  #479 = Utf8               Actor: \u0001
  #480 = MethodHandle       6:#481        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #481 = Methodref          #482.#483     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #482 = Class              #484          // java/lang/invoke/StringConcatFactory
  #483 = NameAndType        #31:#485      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #484 = Utf8               java/lang/invoke/StringConcatFactory
  #485 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #486 = Utf8               InnerClasses
  #487 = Class              #488          // java/lang/invoke/MethodHandles$Lookup
  #488 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #489 = Class              #490          // java/lang/invoke/MethodHandles
  #490 = Utf8               java/lang/invoke/MethodHandles
  #491 = Utf8               Lookup
{
  protected final T _actor;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #417                         // TT;

  protected ext.mods.gameserver.model.actor.ai.Intention _currentIntention;
    descriptor: Lext/mods/gameserver/model/actor/ai/Intention;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.actor.ai.Intention _nextIntention;
    descriptor: Lext/mods/gameserver/model/actor/ai/Intention;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.actor.ai.type.AbstractAI(T);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class ext/mods/gameserver/model/actor/ai/Intention
         8: dup
         9: invokespecial #9                  // Method ext/mods/gameserver/model/actor/ai/Intention."<init>":()V
        12: putfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        15: aload_0
        16: new           #7                  // class ext/mods/gameserver/model/actor/ai/Intention
        19: dup
        20: invokespecial #9                  // Method ext/mods/gameserver/model/actor/ai/Intention."<init>":()V
        23: putfield      #16                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        26: aload_0
        27: aload_1
        28: putfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        31: return
      LineNumberTable:
        line 52: 0
        line 48: 4
        line 49: 15
        line 53: 26
        line 54: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      32     1 actor   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;
            0      32     1 actor   TT;
    Signature: #426                         // (TT;)V

  protected abstract void onEvtAggression(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtArrived();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtArrivedBlocked();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtAttacked(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtBowAttackReuse();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtCancel();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtDead();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtEvaded(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtFinishedAttack();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtFinishedAttackBow();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtFinishedCasting();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtOwnerAttacked(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtSatDown(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtStoodUp();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onEvtTeleported();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkAttack();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkCast();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkFakeDeath();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkFlee();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkFollow();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkIdle();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkInteract();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkMoveRoute();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkMoveTo();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkNothing();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract ext.mods.gameserver.model.item.instance.ItemInstance thinkPickUp();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkSit();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkSocial();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkStand();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkUseItem();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void thinkWander();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokestatic  #23                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
         7: invokedynamic #29,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        12: areturn
      LineNumberTable:
        line 121: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  public final synchronized ext.mods.gameserver.model.actor.ai.Intention getCurrentIntention();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/Intention;
    flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SYNCHRONIZED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: areturn
      LineNumberTable:
        line 126: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  public final synchronized ext.mods.gameserver.model.actor.ai.Intention getNextIntention();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/Intention;
    flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SYNCHRONIZED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: areturn
      LineNumberTable:
        line 131: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected final synchronized void setNextIntention(ext.mods.gameserver.model.actor.ai.Intention);
    descriptor: (Lext/mods/gameserver/model/actor/ai/Intention;)V
    flags: (0x0034) ACC_PROTECTED, ACC_FINAL, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: aload_1
         5: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/ai/Intention.updateUsing:(Lext/mods/gameserver/model/actor/ai/Intention;)V
         8: return
      LineNumberTable:
        line 136: 0
        line 137: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0       9     1 intention   Lext/mods/gameserver/model/actor/ai/Intention;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void prepareIntention();
    descriptor: ()V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
         7: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/move/CreatureMove.cancelFollowTask:()V
        10: aload_0
        11: getfield      #16                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        14: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsIdle:()V
        17: return
      LineNumberTable:
        line 149: 0
        line 151: 10
        line 152: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doAttackIntention(ext.mods.gameserver.model.actor.Creature, boolean, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;ZZZ)V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=5, locals=5, args_size=5
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: aload_1
         9: iload_2
        10: iload_3
        11: iload         4
        13: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsAttack:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
        16: aload_0
        17: invokevirtual #58                 // Method thinkAttack:()V
        20: return
      LineNumberTable:
        line 156: 0
        line 158: 4
        line 160: 16
        line 161: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      21     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      21     2 isCtrlPressed   Z
            0      21     3 isShiftPressed   Z
            0      21     4 canMoveToTarget   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doCastIntention(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean, boolean, int, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=8, locals=7, args_size=7
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: aload_0
         9: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        12: aload_1
        13: aload_2
        14: iload_3
        15: iload         4
        17: iload         5
        19: iload         6
        21: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
        24: aload_0
        25: invokevirtual #65                 // Method thinkCast:()V
        28: return
      LineNumberTable:
        line 165: 0
        line 167: 4
        line 169: 24
        line 170: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      29     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      29     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0      29     3 isCtrlPressed   Z
            0      29     4 isShiftPressed   Z
            0      29     5 itemObjectId   I
            0      29     6 canMoveToTarget   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doFakeDeathIntention(boolean);
    descriptor: (Z)V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: iload_1
         9: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsFakeDeath:(Z)V
        12: aload_0
        13: invokevirtual #72                 // Method thinkFakeDeath:()V
        16: return
      LineNumberTable:
        line 174: 0
        line 176: 4
        line 178: 12
        line 179: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      17     1 startFakeDeath   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doFleeIntention(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.location.Location, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: aload_1
         9: aload_2
        10: iload_3
        11: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsFlee:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
        14: aload_0
        15: invokevirtual #79                 // Method thinkFlee:()V
        18: return
      LineNumberTable:
        line 183: 0
        line 185: 4
        line 187: 14
        line 188: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      19     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      19     2 startLoc   Lext/mods/gameserver/model/location/Location;
            0      19     3 distance   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doFollowIntention(ext.mods.gameserver.model.actor.Creature, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Z)V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: aload_1
         9: iload_2
        10: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
        13: aload_0
        14: invokevirtual #86                 // Method thinkFollow:()V
        17: return
      LineNumberTable:
        line 192: 0
        line 194: 4
        line 196: 13
        line 197: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      18     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      18     2 isShiftPressed   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doIdleIntention();
    descriptor: ()V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsIdle:()V
        11: aload_0
        12: invokevirtual #89                 // Method thinkIdle:()V
        15: return
      LineNumberTable:
        line 201: 0
        line 203: 4
        line 205: 11
        line 206: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doInteractIntention(ext.mods.gameserver.model.WorldObject, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/WorldObject;ZZ)V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: aload_1
         9: iload_2
        10: iload_3
        11: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
        14: aload_0
        15: invokevirtual #96                 // Method thinkInteract:()V
        18: return
      LineNumberTable:
        line 210: 0
        line 212: 4
        line 214: 14
        line 215: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      19     1 target   Lext/mods/gameserver/model/WorldObject;
            0      19     2 isCtrlPressed   Z
            0      19     3 isShiftPressed   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doMoveRouteIntention(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: aload_1
         9: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsMoveRoute:(Ljava/lang/String;)V
        12: aload_0
        13: invokevirtual #103                // Method thinkMoveRoute:()V
        16: return
      LineNumberTable:
        line 219: 0
        line 221: 4
        line 223: 12
        line 224: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      17     1 routeName   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  public synchronized void doMoveToIntention(ext.mods.gameserver.model.location.Location, ext.mods.gameserver.model.actor.Boat);
    descriptor: (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: aload_1
         9: aload_2
        10: invokevirtual #106                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
        13: aload_0
        14: invokevirtual #110                // Method thinkMoveTo:()V
        17: return
      LineNumberTable:
        line 228: 0
        line 230: 4
        line 232: 13
        line 233: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      18     1   loc   Lext/mods/gameserver/model/location/Location;
            0      18     2  boat   Lext/mods/gameserver/model/actor/Boat;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doNothingIntention(int);
    descriptor: (I)V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: iload_1
         9: invokevirtual #113                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsNothing:(I)V
        12: aload_0
        13: invokevirtual #117                // Method thinkNothing:()V
        16: return
      LineNumberTable:
        line 237: 0
        line 239: 4
        line 241: 12
        line 242: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      17     1 timer   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doPickUpIntention(int, boolean);
    descriptor: (IZ)V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: iload_1
         9: iload_2
        10: invokevirtual #120                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsPickUp:(IZ)V
        13: aload_0
        14: invokevirtual #124                // Method thinkPickUp:()Lext/mods/gameserver/model/item/instance/ItemInstance;
        17: pop
        18: return
      LineNumberTable:
        line 246: 0
        line 248: 4
        line 250: 13
        line 251: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      19     1 itemObjectId   I
            0      19     2 isShiftPressed   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doSitIntention(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: aload_1
         9: invokevirtual #128                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsSit:(Lext/mods/gameserver/model/WorldObject;)V
        12: aload_0
        13: invokevirtual #132                // Method thinkSit:()V
        16: return
      LineNumberTable:
        line 255: 0
        line 257: 4
        line 259: 12
        line 260: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      17     1 target   Lext/mods/gameserver/model/WorldObject;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doSocialIntention(int, int);
    descriptor: (II)V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: iload_1
         9: iload_2
        10: invokevirtual #135                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsSocial:(II)V
        13: aload_0
        14: invokevirtual #139                // Method thinkSocial:()V
        17: return
      LineNumberTable:
        line 264: 0
        line 266: 4
        line 268: 13
        line 269: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      18     1    id   I
            0      18     2 timer   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doStandIntention();
    descriptor: ()V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: invokevirtual #142                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsStand:()V
        11: aload_0
        12: invokevirtual #145                // Method thinkStand:()V
        15: return
      LineNumberTable:
        line 273: 0
        line 275: 4
        line 277: 11
        line 278: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doUseItemIntention(int);
    descriptor: (I)V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: iload_1
         9: invokevirtual #148                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsUseItem:(I)V
        12: aload_0
        13: invokevirtual #151                // Method thinkUseItem:()V
        16: return
      LineNumberTable:
        line 282: 0
        line 284: 4
        line 286: 12
        line 287: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      17     1 itemObjectId   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected synchronized void doWanderIntention(int);
    descriptor: (I)V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #51                 // Method prepareIntention:()V
         4: aload_0
         5: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: iload_1
         9: invokevirtual #154                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsWander:(I)V
        12: aload_0
        13: invokevirtual #157                // Method thinkWander:()V
        16: return
      LineNumberTable:
        line 291: 0
        line 293: 4
        line 295: 12
        line 296: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      17     1 timer   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  protected final synchronized void doIntention(ext.mods.gameserver.model.actor.ai.Intention);
    descriptor: (Lext/mods/gameserver/model/actor/ai/Intention;)V
    flags: (0x0034) ACC_PROTECTED, ACC_FINAL, ACC_SYNCHRONIZED
    Code:
      stack=7, locals=2, args_size=2
         0: getstatic     #160                // Field ext/mods/gameserver/model/actor/ai/type/AbstractAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
         3: aload_1
         4: invokevirtual #166                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
         7: invokevirtual #170                // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        10: iaload
        11: tableswitch   { // 1 to 16

                       1: 88

                       2: 111

                       3: 142

                       4: 153

                       5: 172

                       6: 187

                       7: 194

                       8: 213

                       9: 224

                      10: 239

                      11: 250

                      12: 265

                      13: 276

                      14: 291

                      15: 298

                      16: 309
                 default: 317
            }
        88: aload_0
        89: aload_1
        90: invokevirtual #176                // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        93: aload_1
        94: invokevirtual #180                // Method ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
        97: aload_1
        98: invokevirtual #184                // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
       101: aload_1
       102: invokevirtual #187                // Method ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
       105: invokevirtual #190                // Method doAttackIntention:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
       108: goto          317
       111: aload_0
       112: aload_1
       113: invokevirtual #176                // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
       116: aload_1
       117: invokevirtual #193                // Method ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       120: aload_1
       121: invokevirtual #180                // Method ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
       124: aload_1
       125: invokevirtual #184                // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
       128: aload_1
       129: invokevirtual #197                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
       132: aload_1
       133: invokevirtual #187                // Method ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
       136: invokevirtual #200                // Method doCastIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
       139: goto          317
       142: aload_0
       143: aload_1
       144: invokevirtual #180                // Method ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
       147: invokevirtual #204                // Method doFakeDeathIntention:(Z)V
       150: goto          317
       153: aload_0
       154: aload_1
       155: invokevirtual #176                // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
       158: aload_1
       159: invokevirtual #207                // Method ext/mods/gameserver/model/actor/ai/Intention.getLoc:()Lext/mods/gameserver/model/location/Location;
       162: aload_1
       163: invokevirtual #197                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
       166: invokevirtual #211                // Method doFleeIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
       169: goto          317
       172: aload_0
       173: aload_1
       174: invokevirtual #176                // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
       177: aload_1
       178: invokevirtual #184                // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
       181: invokevirtual #214                // Method doFollowIntention:(Lext/mods/gameserver/model/actor/Creature;Z)V
       184: goto          317
       187: aload_0
       188: invokevirtual #217                // Method doIdleIntention:()V
       191: goto          317
       194: aload_0
       195: aload_1
       196: invokevirtual #220                // Method ext/mods/gameserver/model/actor/ai/Intention.getTarget:()Lext/mods/gameserver/model/WorldObject;
       199: aload_1
       200: invokevirtual #180                // Method ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
       203: aload_1
       204: invokevirtual #184                // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
       207: invokevirtual #224                // Method doInteractIntention:(Lext/mods/gameserver/model/WorldObject;ZZ)V
       210: goto          317
       213: aload_0
       214: aload_1
       215: invokevirtual #227                // Method ext/mods/gameserver/model/actor/ai/Intention.getRouteName:()Ljava/lang/String;
       218: invokevirtual #231                // Method doMoveRouteIntention:(Ljava/lang/String;)V
       221: goto          317
       224: aload_0
       225: aload_1
       226: invokevirtual #207                // Method ext/mods/gameserver/model/actor/ai/Intention.getLoc:()Lext/mods/gameserver/model/location/Location;
       229: aload_1
       230: invokevirtual #234                // Method ext/mods/gameserver/model/actor/ai/Intention.getBoat:()Lext/mods/gameserver/model/actor/Boat;
       233: invokevirtual #238                // Method doMoveToIntention:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
       236: goto          317
       239: aload_0
       240: aload_1
       241: invokevirtual #241                // Method ext/mods/gameserver/model/actor/ai/Intention.getTimer:()I
       244: invokevirtual #244                // Method doNothingIntention:(I)V
       247: goto          317
       250: aload_0
       251: aload_1
       252: invokevirtual #197                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
       255: aload_1
       256: invokevirtual #184                // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
       259: invokevirtual #247                // Method doPickUpIntention:(IZ)V
       262: goto          317
       265: aload_0
       266: aload_1
       267: invokevirtual #220                // Method ext/mods/gameserver/model/actor/ai/Intention.getTarget:()Lext/mods/gameserver/model/WorldObject;
       270: invokevirtual #250                // Method doSitIntention:(Lext/mods/gameserver/model/WorldObject;)V
       273: goto          317
       276: aload_0
       277: aload_1
       278: invokevirtual #197                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
       281: aload_1
       282: invokevirtual #241                // Method ext/mods/gameserver/model/actor/ai/Intention.getTimer:()I
       285: invokevirtual #253                // Method doSocialIntention:(II)V
       288: goto          317
       291: aload_0
       292: invokevirtual #256                // Method doStandIntention:()V
       295: goto          317
       298: aload_0
       299: aload_1
       300: invokevirtual #197                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
       303: invokevirtual #259                // Method doUseItemIntention:(I)V
       306: goto          317
       309: aload_0
       310: aload_1
       311: invokevirtual #241                // Method ext/mods/gameserver/model/actor/ai/Intention.getTimer:()I
       314: invokevirtual #262                // Method doWanderIntention:(I)V
       317: return
      LineNumberTable:
        line 304: 0
        line 307: 88
        line 308: 108
        line 311: 111
        line 312: 139
        line 315: 142
        line 316: 150
        line 319: 153
        line 320: 169
        line 323: 172
        line 324: 184
        line 327: 187
        line 328: 191
        line 331: 194
        line 332: 210
        line 335: 213
        line 336: 221
        line 339: 224
        line 340: 236
        line 343: 239
        line 344: 247
        line 347: 250
        line 348: 262
        line 351: 265
        line 352: 273
        line 355: 276
        line 356: 288
        line 359: 291
        line 360: 295
        line 363: 298
        line 364: 306
        line 367: 309
        line 370: 317
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     318     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0     318     1 intention   Lext/mods/gameserver/model/actor/ai/Intention;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     318     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;
      StackMapTable: number_of_entries = 17
        frame_type = 251 /* same_frame_extended */
          offset_delta = 88
        frame_type = 22 /* same */
        frame_type = 30 /* same */
        frame_type = 10 /* same */
        frame_type = 18 /* same */
        frame_type = 14 /* same */
        frame_type = 6 /* same */
        frame_type = 18 /* same */
        frame_type = 10 /* same */
        frame_type = 14 /* same */
        frame_type = 10 /* same */
        frame_type = 14 /* same */
        frame_type = 10 /* same */
        frame_type = 14 /* same */
        frame_type = 6 /* same */
        frame_type = 10 /* same */
        frame_type = 7 /* same */

  public final void notifyEvent(ext.mods.gameserver.enums.AiEventType, java.lang.Object, java.lang.Object);
    descriptor: (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #265                // Method ext/mods/gameserver/model/actor/Creature.isVisible:()Z
         7: ifne          21
        10: aload_0
        11: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        14: invokevirtual #268                // Method ext/mods/gameserver/model/actor/Creature.isTeleporting:()Z
        17: ifne          21
        20: return
        21: getstatic     #271                // Field ext/mods/gameserver/model/actor/ai/type/AbstractAI$1.$SwitchMap$ext$mods$gameserver$enums$AiEventType:[I
        24: aload_1
        25: invokevirtual #274                // Method ext/mods/gameserver/enums/AiEventType.ordinal:()I
        28: iaload
        29: tableswitch   { // 1 to 16

                       1: 108

                       2: 115

                       3: 126

                       4: 144

                       5: 155

                       6: 162

                       7: 169

                       8: 176

                       9: 183

                      10: 190

                      11: 197

                      12: 204

                      13: 211

                      14: 222

                      15: 229

                      16: 240
                 default: 244
            }
       108: aload_0
       109: invokevirtual #277                // Method onEvtThink:()V
       112: goto          244
       115: aload_0
       116: aload_2
       117: checkcast     #38                 // class ext/mods/gameserver/model/actor/Creature
       120: invokevirtual #280                // Method onEvtAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
       123: goto          244
       126: aload_0
       127: aload_2
       128: checkcast     #38                 // class ext/mods/gameserver/model/actor/Creature
       131: aload_3
       132: checkcast     #284                // class java/lang/Number
       135: invokevirtual #286                // Method java/lang/Number.intValue:()I
       138: invokevirtual #289                // Method onEvtAggression:(Lext/mods/gameserver/model/actor/Creature;I)V
       141: goto          244
       144: aload_0
       145: aload_2
       146: checkcast     #38                 // class ext/mods/gameserver/model/actor/Creature
       149: invokevirtual #293                // Method onEvtEvaded:(Lext/mods/gameserver/model/actor/Creature;)V
       152: goto          244
       155: aload_0
       156: invokevirtual #296                // Method onEvtFinishedAttack:()V
       159: goto          244
       162: aload_0
       163: invokevirtual #299                // Method onEvtFinishedAttackBow:()V
       166: goto          244
       169: aload_0
       170: invokevirtual #302                // Method onEvtBowAttackReuse:()V
       173: goto          244
       176: aload_0
       177: invokevirtual #305                // Method onEvtArrived:()V
       180: goto          244
       183: aload_0
       184: invokevirtual #308                // Method onEvtArrivedBlocked:()V
       187: goto          244
       190: aload_0
       191: invokevirtual #311                // Method onEvtCancel:()V
       194: goto          244
       197: aload_0
       198: invokevirtual #314                // Method onEvtDead:()V
       201: goto          244
       204: aload_0
       205: invokevirtual #317                // Method onEvtFinishedCasting:()V
       208: goto          244
       211: aload_0
       212: aload_2
       213: checkcast     #320                // class ext/mods/gameserver/model/WorldObject
       216: invokevirtual #322                // Method onEvtSatDown:(Lext/mods/gameserver/model/WorldObject;)V
       219: goto          244
       222: aload_0
       223: invokevirtual #325                // Method onEvtStoodUp:()V
       226: goto          244
       229: aload_0
       230: aload_2
       231: checkcast     #38                 // class ext/mods/gameserver/model/actor/Creature
       234: invokevirtual #328                // Method onEvtOwnerAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
       237: goto          244
       240: aload_0
       241: invokevirtual #331                // Method onEvtTeleported:()V
       244: return
      LineNumberTable:
        line 382: 0
        line 383: 20
        line 385: 21
        line 388: 108
        line 389: 112
        line 392: 115
        line 393: 123
        line 396: 126
        line 397: 141
        line 400: 144
        line 401: 152
        line 404: 155
        line 405: 159
        line 408: 162
        line 409: 166
        line 412: 169
        line 413: 173
        line 416: 176
        line 417: 180
        line 420: 183
        line 421: 187
        line 424: 190
        line 425: 194
        line 428: 197
        line 429: 201
        line 432: 204
        line 433: 208
        line 436: 211
        line 437: 219
        line 440: 222
        line 441: 226
        line 444: 229
        line 445: 237
        line 448: 240
        line 451: 244
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     245     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0     245     1   evt   Lext/mods/gameserver/enums/AiEventType;
            0     245     2 firstParameter   Ljava/lang/Object;
            0     245     3 secondParameter   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     245     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;
      StackMapTable: number_of_entries = 18
        frame_type = 21 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 86
        frame_type = 6 /* same */
        frame_type = 10 /* same */
        frame_type = 17 /* same */
        frame_type = 10 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 10 /* same */
        frame_type = 6 /* same */
        frame_type = 10 /* same */
        frame_type = 3 /* same */

  protected synchronized void onEvtThink();
    descriptor: ()V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #160                // Field ext/mods/gameserver/model/actor/ai/type/AbstractAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
         3: aload_0
         4: getfield      #10                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         7: invokevirtual #166                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        10: invokevirtual #170                // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        13: iaload
        14: tableswitch   { // 1 to 15

                       1: 88

                       2: 95

                       3: 102

                       4: 163

                       5: 109

                       6: 116

                       7: 123

                       8: 163

                       9: 130

                      10: 163

                      11: 137

                      12: 145

                      13: 163

                      14: 152

                      15: 159
                 default: 163
            }
        88: aload_0
        89: invokevirtual #58                 // Method thinkAttack:()V
        92: goto          163
        95: aload_0
        96: invokevirtual #65                 // Method thinkCast:()V
        99: goto          163
       102: aload_0
       103: invokevirtual #72                 // Method thinkFakeDeath:()V
       106: goto          163
       109: aload_0
       110: invokevirtual #86                 // Method thinkFollow:()V
       113: goto          163
       116: aload_0
       117: invokevirtual #89                 // Method thinkIdle:()V
       120: goto          163
       123: aload_0
       124: invokevirtual #96                 // Method thinkInteract:()V
       127: goto          163
       130: aload_0
       131: invokevirtual #110                // Method thinkMoveTo:()V
       134: goto          163
       137: aload_0
       138: invokevirtual #124                // Method thinkPickUp:()Lext/mods/gameserver/model/item/instance/ItemInstance;
       141: pop
       142: goto          163
       145: aload_0
       146: invokevirtual #132                // Method thinkSit:()V
       149: goto          163
       152: aload_0
       153: invokevirtual #145                // Method thinkStand:()V
       156: goto          163
       159: aload_0
       160: invokevirtual #151                // Method thinkUseItem:()V
       163: return
      LineNumberTable:
        line 455: 0
        line 458: 88
        line 459: 92
        line 462: 95
        line 463: 99
        line 466: 102
        line 467: 106
        line 470: 109
        line 471: 113
        line 474: 116
        line 475: 120
        line 478: 123
        line 479: 127
        line 482: 130
        line 483: 134
        line 486: 137
        line 487: 142
        line 490: 145
        line 491: 149
        line 494: 152
        line 495: 156
        line 498: 159
        line 501: 163
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     164     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     164     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;
      StackMapTable: number_of_entries = 12
        frame_type = 251 /* same_frame_extended */
          offset_delta = 88
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 7 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 3 /* same */

  public boolean canScheduleAfter(ext.mods.gameserver.enums.IntentionType, ext.mods.gameserver.enums.IntentionType);
    descriptor: (Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: getstatic     #160                // Field ext/mods/gameserver/model/actor/ai/type/AbstractAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
         3: aload_1
         4: invokevirtual #170                // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
         7: iaload
         8: lookupswitch  { // 4

                       3: 52

                       9: 67

                      12: 52

                      14: 65
                 default: 80
            }
        52: aload_2
        53: getstatic     #334                // Field ext/mods/gameserver/enums/IntentionType.STAND:Lext/mods/gameserver/enums/IntentionType;
        56: if_acmpne     63
        59: iconst_1
        60: goto          64
        63: iconst_0
        64: ireturn
        65: iconst_1
        66: ireturn
        67: aload_2
        68: getstatic     #338                // Field ext/mods/gameserver/enums/IntentionType.SIT:Lext/mods/gameserver/enums/IntentionType;
        71: if_acmpne     78
        74: iconst_1
        75: goto          79
        78: iconst_0
        79: ireturn
        80: iconst_0
        81: ireturn
      LineNumberTable:
        line 518: 0
        line 521: 52
        line 524: 65
        line 527: 67
        line 529: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      82     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      82     1 oldIntention   Lext/mods/gameserver/enums/IntentionType;
            0      82     2 newIntention   Lext/mods/gameserver/enums/IntentionType;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      82     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;
      StackMapTable: number_of_entries = 8
        frame_type = 52 /* same */
        frame_type = 10 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 1 /* same */
        frame_type = 10 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */

  public void clientActionFailed();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 537: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  public void startAttackStance();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: invokestatic  #341                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
         3: aload_0
         4: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         7: invokevirtual #347                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
        10: ifne          34
        13: aload_0
        14: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: new           #351                // class ext/mods/gameserver/network/serverpackets/AutoAttackStart
        20: dup
        21: aload_0
        22: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        25: invokevirtual #353                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        28: invokespecial #356                // Method ext/mods/gameserver/network/serverpackets/AutoAttackStart."<init>":(I)V
        31: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        34: invokestatic  #341                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
        37: aload_0
        38: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        41: invokevirtual #362                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.add:(Lext/mods/gameserver/model/actor/Creature;)V
        44: return
      LineNumberTable:
        line 544: 0
        line 545: 13
        line 547: 34
        line 548: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 34 /* same */

  public void stopAttackStance();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: invokestatic  #341                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
         3: aload_0
         4: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         7: invokevirtual #365                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.remove:(Lext/mods/gameserver/model/actor/Creature;)Z
        10: ifeq          34
        13: aload_0
        14: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: new           #368                // class ext/mods/gameserver/network/serverpackets/AutoAttackStop
        20: dup
        21: aload_0
        22: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        25: invokevirtual #353                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        28: invokespecial #370                // Method ext/mods/gameserver/network/serverpackets/AutoAttackStop."<init>":(I)V
        31: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        34: return
      LineNumberTable:
        line 555: 0
        line 556: 13
        line 557: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 34 /* same */

  public void describeStateToPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #371                // Method ext/mods/gameserver/model/actor/Creature.isMoving:()Z
         7: ifeq          24
        10: aload_0
        11: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        14: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        17: aload_1
        18: invokevirtual #374                // Method ext/mods/gameserver/model/actor/move/CreatureMove.describeMovementTo:(Lext/mods/gameserver/model/actor/Player;)V
        21: goto          48
        24: aload_0
        25: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        28: invokevirtual #378                // Method ext/mods/gameserver/model/actor/Creature.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        31: invokevirtual #382                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
        34: ifeq          48
        37: aload_0
        38: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        41: invokevirtual #378                // Method ext/mods/gameserver/model/actor/Creature.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        44: aload_1
        45: invokevirtual #387                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.describeCastTo:(Lext/mods/gameserver/model/actor/Player;)V
        48: return
      LineNumberTable:
        line 565: 0
        line 566: 10
        line 567: 24
        line 568: 37
        line 569: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      49     1 player   Lext/mods/gameserver/model/actor/Player;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 24 /* same */
        frame_type = 23 /* same */

  public void stopAITask();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
         7: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/move/CreatureMove.cancelFollowTask:()V
        10: return
      LineNumberTable:
        line 576: 0
        line 577: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;

  public boolean isTargetLost(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_1
         5: ireturn
         6: invokestatic  #390                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         9: aload_1
        10: invokevirtual #395                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
        13: invokevirtual #396                // Method ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
        16: ifnonnull     21
        19: iconst_1
        20: ireturn
        21: aload_0
        22: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        25: aload_1
        26: invokevirtual #400                // Method ext/mods/gameserver/model/actor/Creature.knows:(Lext/mods/gameserver/model/WorldObject;)Z
        29: ifne          36
        32: iconst_1
        33: goto          37
        36: iconst_0
        37: ireturn
      LineNumberTable:
        line 585: 0
        line 586: 4
        line 588: 6
        line 589: 19
        line 591: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      38     1 target   Lext/mods/gameserver/model/WorldObject;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 6 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isTargetLost(ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: ifnonnull     6
         4: iconst_1
         5: ireturn
         6: invokestatic  #390                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         9: aload_1
        10: invokevirtual #395                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
        13: invokevirtual #396                // Method ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
        16: ifnonnull     21
        19: iconst_1
        20: ireturn
        21: aload_2
        22: ifnull        37
        25: aload_2
        26: invokevirtual #404                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        29: getstatic     #410                // Field ext/mods/gameserver/enums/skills/SkillType.SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
        32: if_acmpne     37
        35: iconst_0
        36: ireturn
        37: aload_0
        38: getfield      #19                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        41: aload_1
        42: invokevirtual #400                // Method ext/mods/gameserver/model/actor/Creature.knows:(Lext/mods/gameserver/model/WorldObject;)Z
        45: ifne          52
        48: iconst_1
        49: goto          53
        52: iconst_0
        53: ireturn
      LineNumberTable:
        line 601: 0
        line 602: 4
        line 604: 6
        line 605: 19
        line 607: 21
        line 608: 35
        line 610: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      54     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI;
            0      54     1 target   Lext/mods/gameserver/model/WorldObject;
            0      54     2 skill   Lext/mods/gameserver/skills/L2Skill;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      54     0  this   Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;
      StackMapTable: number_of_entries = 5
        frame_type = 6 /* same */
        frame_type = 14 /* same */
        frame_type = 15 /* same */
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
Signature: #473                         // <T:Lext/mods/gameserver/model/actor/Creature;>Ljava/lang/Object;
SourceFile: "AbstractAI.java"
NestMembers:
  ext/mods/gameserver/model/actor/ai/type/AbstractAI$1
BootstrapMethods:
  0: #480 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #478 Actor: \u0001
InnerClasses:
  static #161;                            // class ext/mods/gameserver/model/actor/ai/type/AbstractAI$1
  public static final #491= #487 of #489; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
