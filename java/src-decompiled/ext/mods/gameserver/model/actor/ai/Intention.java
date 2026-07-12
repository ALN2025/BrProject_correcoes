// Bytecode for: ext.mods.gameserver.model.actor.ai.Intention
// File: ext\mods\gameserver\model\actor\ai\Intention.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/Intention.class
  Last modified 9 de jul de 2026; size 8865 bytes
  MD5 checksum f2e353c99d46ffb39dae3df9baa20a1a
  Compiled from "Intention.java"
public class ext.mods.gameserver.model.actor.ai.Intention extends java.lang.Object implements java.lang.Comparable<ext.mods.gameserver.model.actor.ai.Intention>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/ai/Intention
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 12, methods: 37, attributes: 5
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
    #8 = Class              #10           // ext/mods/gameserver/enums/IntentionType
    #9 = NameAndType        #11:#12       // IDLE:Lext/mods/gameserver/enums/IntentionType;
   #10 = Utf8               ext/mods/gameserver/enums/IntentionType
   #11 = Utf8               IDLE
   #12 = Utf8               Lext/mods/gameserver/enums/IntentionType;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/actor/ai/Intention._type:Lext/mods/gameserver/enums/IntentionType;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/ai/Intention
   #15 = NameAndType        #17:#12       // _type:Lext/mods/gameserver/enums/IntentionType;
   #16 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
   #17 = Utf8               _type
   #18 = Fieldref           #19.#20       // ext/mods/gameserver/model/actor/ai/Intention$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #19 = Class              #21           // ext/mods/gameserver/model/actor/ai/Intention$1
   #20 = NameAndType        #22:#23       // $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #21 = Utf8               ext/mods/gameserver/model/actor/ai/Intention$1
   #22 = Utf8               $SwitchMap$ext$mods$gameserver$enums$IntentionType
   #23 = Utf8               [I
   #24 = Methodref          #8.#25        // ext/mods/gameserver/enums/IntentionType.ordinal:()I
   #25 = NameAndType        #26:#27       // ordinal:()I
   #26 = Utf8               ordinal
   #27 = Utf8               ()I
   #28 = Fieldref           #14.#29       // ext/mods/gameserver/model/actor/ai/Intention._finalTarget:Lext/mods/gameserver/model/actor/Creature;
   #29 = NameAndType        #30:#31       // _finalTarget:Lext/mods/gameserver/model/actor/Creature;
   #30 = Utf8               _finalTarget
   #31 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #32 = Methodref          #33.#34       // java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #33 = Class              #35           // java/util/Objects
   #34 = NameAndType        #36:#37       // equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #35 = Utf8               java/util/Objects
   #36 = Utf8               equals
   #37 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
   #38 = Fieldref           #14.#39       // ext/mods/gameserver/model/actor/ai/Intention._itemObjectId:I
   #39 = NameAndType        #40:#41       // _itemObjectId:I
   #40 = Utf8               _itemObjectId
   #41 = Utf8               I
   #42 = Fieldref           #14.#43       // ext/mods/gameserver/model/actor/ai/Intention._routeName:Ljava/lang/String;
   #43 = NameAndType        #44:#45       // _routeName:Ljava/lang/String;
   #44 = Utf8               _routeName
   #45 = Utf8               Ljava/lang/String;
   #46 = Methodref          #47.#48       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #47 = Class              #49           // java/lang/String
   #48 = NameAndType        #36:#50       // equals:(Ljava/lang/Object;)Z
   #49 = Utf8               java/lang/String
   #50 = Utf8               (Ljava/lang/Object;)Z
   #51 = Fieldref           #14.#52       // ext/mods/gameserver/model/actor/ai/Intention._skill:Lext/mods/gameserver/skills/L2Skill;
   #52 = NameAndType        #53:#54       // _skill:Lext/mods/gameserver/skills/L2Skill;
   #53 = Utf8               _skill
   #54 = Utf8               Lext/mods/gameserver/skills/L2Skill;
   #55 = Methodref          #56.#48       // ext/mods/gameserver/skills/L2Skill.equals:(Ljava/lang/Object;)Z
   #56 = Class              #57           // ext/mods/gameserver/skills/L2Skill
   #57 = Utf8               ext/mods/gameserver/skills/L2Skill
   #58 = Fieldref           #14.#59       // ext/mods/gameserver/model/actor/ai/Intention._loc:Lext/mods/gameserver/model/location/Location;
   #59 = NameAndType        #60:#61       // _loc:Lext/mods/gameserver/model/location/Location;
   #60 = Utf8               _loc
   #61 = Utf8               Lext/mods/gameserver/model/location/Location;
   #62 = Methodref          #63.#64       // ext/mods/gameserver/model/location/Location.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
   #63 = Class              #65           // ext/mods/gameserver/model/location/Location
   #64 = NameAndType        #66:#67       // distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
   #65 = Utf8               ext/mods/gameserver/model/location/Location
   #66 = Utf8               distance2D
   #67 = Utf8               (Lext/mods/gameserver/model/location/Point2D;)D
   #68 = Double             20.0d
   #70 = Methodref          #63.#71       // ext/mods/gameserver/model/location/Location.getZ:()I
   #71 = NameAndType        #72:#27       // getZ:()I
   #72 = Utf8               getZ
   #73 = Methodref          #74.#75       // java/lang/Math.abs:(I)I
   #74 = Class              #76           // java/lang/Math
   #75 = NameAndType        #77:#78       // abs:(I)I
   #76 = Utf8               java/lang/Math
   #77 = Utf8               abs
   #78 = Utf8               (I)I
   #79 = Methodref          #14.#48       // ext/mods/gameserver/model/actor/ai/Intention.equals:(Ljava/lang/Object;)Z
   #80 = Fieldref           #14.#81       // ext/mods/gameserver/model/actor/ai/Intention._boat:Lext/mods/gameserver/model/actor/Boat;
   #81 = NameAndType        #82:#83       // _boat:Lext/mods/gameserver/model/actor/Boat;
   #82 = Utf8               _boat
   #83 = Utf8               Lext/mods/gameserver/model/actor/Boat;
   #84 = Fieldref           #14.#85       // ext/mods/gameserver/model/actor/ai/Intention._isCtrlPressed:Z
   #85 = NameAndType        #86:#87       // _isCtrlPressed:Z
   #86 = Utf8               _isCtrlPressed
   #87 = Utf8               Z
   #88 = Methodref          #89.#90       // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #89 = Class              #91           // java/lang/Boolean
   #90 = NameAndType        #92:#93       // valueOf:(Z)Ljava/lang/Boolean;
   #91 = Utf8               java/lang/Boolean
   #92 = Utf8               valueOf
   #93 = Utf8               (Z)Ljava/lang/Boolean;
   #94 = Fieldref           #14.#95       // ext/mods/gameserver/model/actor/ai/Intention._isShiftPressed:Z
   #95 = NameAndType        #96:#87       // _isShiftPressed:Z
   #96 = Utf8               _isShiftPressed
   #97 = Methodref          #98.#99       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #98 = Class              #100          // java/lang/Integer
   #99 = NameAndType        #92:#101      // valueOf:(I)Ljava/lang/Integer;
  #100 = Utf8               java/lang/Integer
  #101 = Utf8               (I)Ljava/lang/Integer;
  #102 = Fieldref           #14.#103      // ext/mods/gameserver/model/actor/ai/Intention._canMoveToTarget:Z
  #103 = NameAndType        #104:#87      // _canMoveToTarget:Z
  #104 = Utf8               _canMoveToTarget
  #105 = Fieldref           #14.#106      // ext/mods/gameserver/model/actor/ai/Intention._target:Lext/mods/gameserver/model/WorldObject;
  #106 = NameAndType        #107:#108     // _target:Lext/mods/gameserver/model/WorldObject;
  #107 = Utf8               _target
  #108 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #109 = Fieldref           #14.#110      // ext/mods/gameserver/model/actor/ai/Intention._timer:I
  #110 = NameAndType        #111:#41      // _timer:I
  #111 = Utf8               _timer
  #112 = Methodref          #33.#113      // java/util/Objects.hash:([Ljava/lang/Object;)I
  #113 = NameAndType        #114:#115     // hash:([Ljava/lang/Object;)I
  #114 = Utf8               hash
  #115 = Utf8               ([Ljava/lang/Object;)I
  #116 = Methodref          #8.#117       // ext/mods/gameserver/enums/IntentionType.toString:()Ljava/lang/String;
  #117 = NameAndType        #118:#119     // toString:()Ljava/lang/String;
  #118 = Utf8               toString
  #119 = Utf8               ()Ljava/lang/String;
  #120 = InvokeDynamic      #0:#121       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #121 = NameAndType        #122:#123     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #122 = Utf8               makeConcatWithConstants
  #123 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #124 = Methodref          #63.#125      // ext/mods/gameserver/model/location/Location.clone:()Lext/mods/gameserver/model/location/Location;
  #125 = NameAndType        #126:#127     // clone:()Lext/mods/gameserver/model/location/Location;
  #126 = Utf8               clone
  #127 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #128 = Fieldref           #8.#129       // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
  #129 = NameAndType        #130:#12      // ATTACK:Lext/mods/gameserver/enums/IntentionType;
  #130 = Utf8               ATTACK
  #131 = Methodref          #14.#132      // ext/mods/gameserver/model/actor/ai/Intention.set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
  #132 = NameAndType        #133:#134     // set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
  #133 = Utf8               set
  #134 = Utf8               (Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
  #135 = Fieldref           #8.#136       // ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
  #136 = NameAndType        #137:#12      // CAST:Lext/mods/gameserver/enums/IntentionType;
  #137 = Utf8               CAST
  #138 = Methodref          #56.#139      // ext/mods/gameserver/skills/L2Skill.getFinalTarget:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Creature;
  #139 = NameAndType        #140:#141     // getFinalTarget:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Creature;
  #140 = Utf8               getFinalTarget
  #141 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Creature;
  #142 = Fieldref           #8.#143       // ext/mods/gameserver/enums/IntentionType.FAKE_DEATH:Lext/mods/gameserver/enums/IntentionType;
  #143 = NameAndType        #144:#12      // FAKE_DEATH:Lext/mods/gameserver/enums/IntentionType;
  #144 = Utf8               FAKE_DEATH
  #145 = Fieldref           #8.#146       // ext/mods/gameserver/enums/IntentionType.FLEE:Lext/mods/gameserver/enums/IntentionType;
  #146 = NameAndType        #147:#12      // FLEE:Lext/mods/gameserver/enums/IntentionType;
  #147 = Utf8               FLEE
  #148 = Fieldref           #8.#149       // ext/mods/gameserver/enums/IntentionType.FOLLOW:Lext/mods/gameserver/enums/IntentionType;
  #149 = NameAndType        #150:#12      // FOLLOW:Lext/mods/gameserver/enums/IntentionType;
  #150 = Utf8               FOLLOW
  #151 = Fieldref           #8.#152       // ext/mods/gameserver/enums/IntentionType.INTERACT:Lext/mods/gameserver/enums/IntentionType;
  #152 = NameAndType        #153:#12      // INTERACT:Lext/mods/gameserver/enums/IntentionType;
  #153 = Utf8               INTERACT
  #154 = Fieldref           #8.#155       // ext/mods/gameserver/enums/IntentionType.MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
  #155 = NameAndType        #156:#12      // MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
  #156 = Utf8               MOVE_ROUTE
  #157 = Fieldref           #8.#158       // ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #158 = NameAndType        #159:#12      // MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #159 = Utf8               MOVE_TO
  #160 = Fieldref           #8.#161       // ext/mods/gameserver/enums/IntentionType.NOTHING:Lext/mods/gameserver/enums/IntentionType;
  #161 = NameAndType        #162:#12      // NOTHING:Lext/mods/gameserver/enums/IntentionType;
  #162 = Utf8               NOTHING
  #163 = Fieldref           #8.#164       // ext/mods/gameserver/enums/IntentionType.PICK_UP:Lext/mods/gameserver/enums/IntentionType;
  #164 = NameAndType        #165:#12      // PICK_UP:Lext/mods/gameserver/enums/IntentionType;
  #165 = Utf8               PICK_UP
  #166 = Fieldref           #8.#167       // ext/mods/gameserver/enums/IntentionType.SIT:Lext/mods/gameserver/enums/IntentionType;
  #167 = NameAndType        #168:#12      // SIT:Lext/mods/gameserver/enums/IntentionType;
  #168 = Utf8               SIT
  #169 = Fieldref           #8.#170       // ext/mods/gameserver/enums/IntentionType.SOCIAL:Lext/mods/gameserver/enums/IntentionType;
  #170 = NameAndType        #171:#12      // SOCIAL:Lext/mods/gameserver/enums/IntentionType;
  #171 = Utf8               SOCIAL
  #172 = Fieldref           #8.#173       // ext/mods/gameserver/enums/IntentionType.STAND:Lext/mods/gameserver/enums/IntentionType;
  #173 = NameAndType        #174:#12      // STAND:Lext/mods/gameserver/enums/IntentionType;
  #174 = Utf8               STAND
  #175 = Fieldref           #8.#176       // ext/mods/gameserver/enums/IntentionType.USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
  #176 = NameAndType        #177:#12      // USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
  #177 = Utf8               USE_ITEM
  #178 = Fieldref           #8.#179       // ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
  #179 = NameAndType        #180:#12      // WANDER:Lext/mods/gameserver/enums/IntentionType;
  #180 = Utf8               WANDER
  #181 = Methodref          #14.#182      // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
  #182 = NameAndType        #183:#184     // getType:()Lext/mods/gameserver/enums/IntentionType;
  #183 = Utf8               getType
  #184 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
  #185 = Methodref          #14.#186      // ext/mods/gameserver/model/actor/ai/Intention.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #186 = NameAndType        #187:#188     // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #187 = Utf8               getTarget
  #188 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #189 = Methodref          #14.#190      // ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
  #190 = NameAndType        #140:#191     // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
  #191 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
  #192 = Methodref          #14.#193      // ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #193 = NameAndType        #194:#195     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #194 = Utf8               getSkill
  #195 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #196 = Methodref          #14.#197      // ext/mods/gameserver/model/actor/ai/Intention.getLoc:()Lext/mods/gameserver/model/location/Location;
  #197 = NameAndType        #198:#127     // getLoc:()Lext/mods/gameserver/model/location/Location;
  #198 = Utf8               getLoc
  #199 = Methodref          #14.#200      // ext/mods/gameserver/model/actor/ai/Intention.getBoat:()Lext/mods/gameserver/model/actor/Boat;
  #200 = NameAndType        #201:#202     // getBoat:()Lext/mods/gameserver/model/actor/Boat;
  #201 = Utf8               getBoat
  #202 = Utf8               ()Lext/mods/gameserver/model/actor/Boat;
  #203 = Methodref          #14.#204      // ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
  #204 = NameAndType        #205:#206     // isCtrlPressed:()Z
  #205 = Utf8               isCtrlPressed
  #206 = Utf8               ()Z
  #207 = Methodref          #14.#208      // ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
  #208 = NameAndType        #209:#206     // isShiftPressed:()Z
  #209 = Utf8               isShiftPressed
  #210 = Methodref          #14.#211      // ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
  #211 = NameAndType        #212:#27      // getItemObjectId:()I
  #212 = Utf8               getItemObjectId
  #213 = Methodref          #14.#214      // ext/mods/gameserver/model/actor/ai/Intention.getTimer:()I
  #214 = NameAndType        #215:#27      // getTimer:()I
  #215 = Utf8               getTimer
  #216 = Methodref          #14.#217      // ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
  #217 = NameAndType        #218:#206     // canMoveToTarget:()Z
  #218 = Utf8               canMoveToTarget
  #219 = Methodref          #14.#220      // ext/mods/gameserver/model/actor/ai/Intention.getRouteName:()Ljava/lang/String;
  #220 = NameAndType        #221:#119     // getRouteName:()Ljava/lang/String;
  #221 = Utf8               getRouteName
  #222 = Methodref          #14.#223      // ext/mods/gameserver/model/actor/ai/Intention.compareTo:(Lext/mods/gameserver/model/actor/ai/Intention;)I
  #223 = NameAndType        #224:#225     // compareTo:(Lext/mods/gameserver/model/actor/ai/Intention;)I
  #224 = Utf8               compareTo
  #225 = Utf8               (Lext/mods/gameserver/model/actor/ai/Intention;)I
  #226 = Class              #227          // java/lang/Comparable
  #227 = Utf8               java/lang/Comparable
  #228 = Utf8               Code
  #229 = Utf8               LineNumberTable
  #230 = Utf8               LocalVariableTable
  #231 = Utf8               this
  #232 = Utf8               Lext/mods/gameserver/model/actor/ai/Intention;
  #233 = Utf8               other
  #234 = Utf8               obj
  #235 = Utf8               Ljava/lang/Object;
  #236 = Utf8               StackMapTable
  #237 = Utf8               hashCode
  #238 = Utf8               type
  #239 = Utf8               target
  #240 = Utf8               finalTarget
  #241 = Utf8               skill
  #242 = Utf8               loc
  #243 = Utf8               boat
  #244 = Utf8               itemObjectId
  #245 = Utf8               timer
  #246 = Utf8               routeName
  #247 = Class              #248          // ext/mods/gameserver/model/WorldObject
  #248 = Utf8               ext/mods/gameserver/model/WorldObject
  #249 = Class              #250          // ext/mods/gameserver/model/actor/Creature
  #250 = Utf8               ext/mods/gameserver/model/actor/Creature
  #251 = Class              #252          // ext/mods/gameserver/model/actor/Boat
  #252 = Utf8               ext/mods/gameserver/model/actor/Boat
  #253 = Utf8               updateAsAttack
  #254 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ZZZ)V
  #255 = Utf8               updateAsCast
  #256 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
  #257 = Utf8               caster
  #258 = Utf8               updateAsFakeDeath
  #259 = Utf8               (Z)V
  #260 = Utf8               startFakeDeath
  #261 = Utf8               updateAsFlee
  #262 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
  #263 = Utf8               startLoc
  #264 = Utf8               distance
  #265 = Utf8               updateAsFollow
  #266 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Z)V
  #267 = Utf8               updateAsIdle
  #268 = Utf8               updateAsInteract
  #269 = Utf8               (Lext/mods/gameserver/model/WorldObject;ZZ)V
  #270 = Utf8               updateAsMoveRoute
  #271 = Utf8               (Ljava/lang/String;)V
  #272 = Utf8               updateAsMoveTo
  #273 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #274 = Utf8               updateAsNothing
  #275 = Utf8               (I)V
  #276 = Utf8               updateAsPickUp
  #277 = Utf8               (IZ)V
  #278 = Utf8               updateAsSit
  #279 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #280 = Utf8               updateAsSocial
  #281 = Utf8               (II)V
  #282 = Utf8               id
  #283 = Utf8               updateAsStand
  #284 = Utf8               updateAsUseItem
  #285 = Utf8               updateAsWander
  #286 = Utf8               updateUsing
  #287 = Utf8               (Lext/mods/gameserver/model/actor/ai/Intention;)V
  #288 = Utf8               intention
  #289 = Utf8               isBlank
  #290 = Utf8               (Ljava/lang/Object;)I
  #291 = Utf8               MethodParameters
  #292 = Utf8               Signature
  #293 = Utf8               Ljava/lang/Object;Ljava/lang/Comparable<Lext/mods/gameserver/model/actor/ai/Intention;>;
  #294 = Utf8               SourceFile
  #295 = Utf8               Intention.java
  #296 = Utf8               NestMembers
  #297 = Utf8               BootstrapMethods
  #298 = String             #299          // Intention [type=\u0001]
  #299 = Utf8               Intention [type=\u0001]
  #300 = MethodHandle       6:#301        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #301 = Methodref          #302.#303     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #302 = Class              #304          // java/lang/invoke/StringConcatFactory
  #303 = NameAndType        #122:#305     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #304 = Utf8               java/lang/invoke/StringConcatFactory
  #305 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #306 = Utf8               InnerClasses
  #307 = Class              #308          // java/lang/invoke/MethodHandles$Lookup
  #308 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #309 = Class              #310          // java/lang/invoke/MethodHandles
  #310 = Utf8               java/lang/invoke/MethodHandles
  #311 = Utf8               Lookup
{
  protected ext.mods.gameserver.enums.IntentionType _type;
    descriptor: Lext/mods/gameserver/enums/IntentionType;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.WorldObject _target;
    descriptor: Lext/mods/gameserver/model/WorldObject;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.actor.Creature _finalTarget;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.skills.L2Skill _skill;
    descriptor: Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.location.Location _loc;
    descriptor: Lext/mods/gameserver/model/location/Location;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.actor.Boat _boat;
    descriptor: Lext/mods/gameserver/model/actor/Boat;
    flags: (0x0004) ACC_PROTECTED

  protected boolean _isCtrlPressed;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected boolean _isShiftPressed;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  protected int _itemObjectId;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected java.lang.String _routeName;
    descriptor: Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED

  protected int _timer;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected boolean _canMoveToTarget;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.actor.ai.Intention();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: getstatic     #7                  // Field ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
         8: putfield      #13                 // Field _type:Lext/mods/gameserver/enums/IntentionType;
        11: return
      LineNumberTable:
        line 53: 0
        line 54: 4
        line 55: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #14                 // class ext/mods/gameserver/model/actor/ai/Intention
        11: ifeq          22
        14: aload_1
        15: checkcast     #14                 // class ext/mods/gameserver/model/actor/ai/Intention
        18: astore_2
        19: goto          24
        22: iconst_0
        23: ireturn
        24: aload_0
        25: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/IntentionType;
        28: aload_2
        29: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/IntentionType;
        32: if_acmpeq     37
        35: iconst_0
        36: ireturn
        37: getstatic     #18                 // Field ext/mods/gameserver/model/actor/ai/Intention$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
        40: aload_0
        41: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/IntentionType;
        44: invokevirtual #24                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        47: iaload
        48: tableswitch   { // 1 to 11

                       1: 108

                       2: 108

                       3: 108

                       4: 110

                       5: 110

                       6: 110

                       7: 122

                       8: 139

                       9: 151

                      10: 185

                      11: 232
                 default: 249
            }
       108: iconst_1
       109: ireturn
       110: aload_0
       111: getfield      #28                 // Field _finalTarget:Lext/mods/gameserver/model/actor/Creature;
       114: aload_2
       115: getfield      #28                 // Field _finalTarget:Lext/mods/gameserver/model/actor/Creature;
       118: invokestatic  #32                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
       121: ireturn
       122: aload_0
       123: getfield      #38                 // Field _itemObjectId:I
       126: aload_2
       127: getfield      #38                 // Field _itemObjectId:I
       130: if_icmpne     137
       133: iconst_1
       134: goto          138
       137: iconst_0
       138: ireturn
       139: aload_0
       140: getfield      #42                 // Field _routeName:Ljava/lang/String;
       143: aload_2
       144: getfield      #42                 // Field _routeName:Ljava/lang/String;
       147: invokevirtual #46                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       150: ireturn
       151: aload_0
       152: getfield      #28                 // Field _finalTarget:Lext/mods/gameserver/model/actor/Creature;
       155: aload_2
       156: getfield      #28                 // Field _finalTarget:Lext/mods/gameserver/model/actor/Creature;
       159: invokestatic  #32                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
       162: ifeq          183
       165: aload_0
       166: getfield      #51                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
       169: aload_2
       170: getfield      #51                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
       173: invokevirtual #55                 // Method ext/mods/gameserver/skills/L2Skill.equals:(Ljava/lang/Object;)Z
       176: ifeq          183
       179: iconst_1
       180: goto          184
       183: iconst_0
       184: ireturn
       185: aload_0
       186: getfield      #58                 // Field _loc:Lext/mods/gameserver/model/location/Location;
       189: aload_2
       190: getfield      #58                 // Field _loc:Lext/mods/gameserver/model/location/Location;
       193: invokevirtual #62                 // Method ext/mods/gameserver/model/location/Location.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
       196: ldc2_w        #68                 // double 20.0d
       199: dcmpg
       200: ifgt          230
       203: aload_0
       204: getfield      #58                 // Field _loc:Lext/mods/gameserver/model/location/Location;
       207: invokevirtual #70                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
       210: aload_2
       211: getfield      #58                 // Field _loc:Lext/mods/gameserver/model/location/Location;
       214: invokevirtual #70                 // Method ext/mods/gameserver/model/location/Location.getZ:()I
       217: isub
       218: invokestatic  #73                 // Method java/lang/Math.abs:(I)I
       221: bipush        30
       223: if_icmpgt     230
       226: iconst_1
       227: goto          231
       230: iconst_0
       231: ireturn
       232: aload_0
       233: getfield      #38                 // Field _itemObjectId:I
       236: aload_2
       237: getfield      #38                 // Field _itemObjectId:I
       240: if_icmpne     247
       243: iconst_1
       244: goto          248
       247: iconst_0
       248: ireturn
       249: iconst_0
       250: ireturn
      LineNumberTable:
        line 60: 0
        line 61: 5
        line 63: 7
        line 64: 22
        line 66: 24
        line 67: 35
        line 69: 37
        line 72: 108
        line 75: 110
        line 78: 122
        line 81: 139
        line 84: 151
        line 87: 185
        line 90: 232
        line 93: 249
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19       3     2 other   Lext/mods/gameserver/model/actor/ai/Intention;
            0     251     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0     251     1   obj   Ljava/lang/Object;
           24     227     2 other   Lext/mods/gameserver/model/actor/ai/Intention;
      StackMapTable: number_of_entries = 20
        frame_type = 7 /* same */
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/ai/Intention ]
        frame_type = 12 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 70
        frame_type = 1 /* same */
        frame_type = 11 /* same */
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 11 /* same */
        frame_type = 31 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 44 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */

  public int compareTo(ext.mods.gameserver.model.actor.ai.Intention);
    descriptor: (Lext/mods/gameserver/model/actor/ai/Intention;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #79                 // Method equals:(Ljava/lang/Object;)Z
         5: ifne          10
         8: iconst_m1
         9: ireturn
        10: iconst_0
        11: ireturn
      LineNumberTable:
        line 100: 0
        line 101: 8
        line 103: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      12     1 other   Lext/mods/gameserver/model/actor/ai/Intention;
      StackMapTable: number_of_entries = 1
        frame_type = 10 /* same */

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: bipush        12
         2: anewarray     #2                  // class java/lang/Object
         5: dup
         6: iconst_0
         7: aload_0
         8: getfield      #80                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
        11: aastore
        12: dup
        13: iconst_1
        14: aload_0
        15: getfield      #28                 // Field _finalTarget:Lext/mods/gameserver/model/actor/Creature;
        18: aastore
        19: dup
        20: iconst_2
        21: aload_0
        22: getfield      #84                 // Field _isCtrlPressed:Z
        25: invokestatic  #88                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        28: aastore
        29: dup
        30: iconst_3
        31: aload_0
        32: getfield      #94                 // Field _isShiftPressed:Z
        35: invokestatic  #88                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        38: aastore
        39: dup
        40: iconst_4
        41: aload_0
        42: getfield      #38                 // Field _itemObjectId:I
        45: invokestatic  #97                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        48: aastore
        49: dup
        50: iconst_5
        51: aload_0
        52: getfield      #58                 // Field _loc:Lext/mods/gameserver/model/location/Location;
        55: aastore
        56: dup
        57: bipush        6
        59: aload_0
        60: getfield      #102                // Field _canMoveToTarget:Z
        63: invokestatic  #88                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        66: aastore
        67: dup
        68: bipush        7
        70: aload_0
        71: getfield      #42                 // Field _routeName:Ljava/lang/String;
        74: aastore
        75: dup
        76: bipush        8
        78: aload_0
        79: getfield      #51                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        82: aastore
        83: dup
        84: bipush        9
        86: aload_0
        87: getfield      #105                // Field _target:Lext/mods/gameserver/model/WorldObject;
        90: aastore
        91: dup
        92: bipush        10
        94: aload_0
        95: getfield      #109                // Field _timer:I
        98: invokestatic  #97                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       101: aastore
       102: dup
       103: bipush        11
       105: aload_0
       106: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/IntentionType;
       109: aastore
       110: invokestatic  #112                // Method java/util/Objects.hash:([Ljava/lang/Object;)I
       113: ireturn
      LineNumberTable:
        line 109: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     114     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/IntentionType;
         4: invokevirtual #116                // Method ext/mods/gameserver/enums/IntentionType.toString:()Ljava/lang/String;
         7: invokedynamic #120,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        12: areturn
      LineNumberTable:
        line 115: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public ext.mods.gameserver.enums.IntentionType getType();
    descriptor: ()Lext/mods/gameserver/enums/IntentionType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/IntentionType;
         4: areturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public ext.mods.gameserver.model.WorldObject getTarget();
    descriptor: ()Lext/mods/gameserver/model/WorldObject;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #105                // Field _target:Lext/mods/gameserver/model/WorldObject;
         4: areturn
      LineNumberTable:
        line 125: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public ext.mods.gameserver.model.actor.Creature getFinalTarget();
    descriptor: ()Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _finalTarget:Lext/mods/gameserver/model/actor/Creature;
         4: areturn
      LineNumberTable:
        line 130: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public ext.mods.gameserver.skills.L2Skill getSkill();
    descriptor: ()Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #51                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
         4: areturn
      LineNumberTable:
        line 135: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public ext.mods.gameserver.model.location.Location getLoc();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #58                 // Field _loc:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 140: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public ext.mods.gameserver.model.actor.Boat getBoat();
    descriptor: ()Lext/mods/gameserver/model/actor/Boat;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #80                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
         4: areturn
      LineNumberTable:
        line 145: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public boolean isCtrlPressed();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #84                 // Field _isCtrlPressed:Z
         4: ireturn
      LineNumberTable:
        line 150: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public boolean isShiftPressed();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #94                 // Field _isShiftPressed:Z
         4: ireturn
      LineNumberTable:
        line 155: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public int getItemObjectId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _itemObjectId:I
         4: ireturn
      LineNumberTable:
        line 160: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public java.lang.String getRouteName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _routeName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 165: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public int getTimer();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #109                // Field _timer:I
         4: ireturn
      LineNumberTable:
        line 170: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public boolean canMoveToTarget();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #102                // Field _canMoveToTarget:Z
         4: ireturn
      LineNumberTable:
        line 175: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public synchronized void updateAsAttack(ext.mods.gameserver.model.actor.Creature, boolean, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;ZZZ)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=5, args_size=5
         0: aload_0
         1: getstatic     #128                // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aload_1
         6: aconst_null
         7: aconst_null
         8: aconst_null
         9: iload_2
        10: iload_3
        11: iconst_0
        12: iconst_0
        13: iload         4
        15: aconst_null
        16: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        19: return
      LineNumberTable:
        line 216: 0
        line 217: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      20     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      20     2 isCtrlPressed   Z
            0      20     3 isShiftPressed   Z
            0      20     4 canMoveToTarget   Z

  public synchronized void updateAsCast(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean, boolean, int, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=8, args_size=8
         0: aload_0
         1: getstatic     #135                // Field ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aload_3
         6: aload_1
         7: aload_2
         8: invokevirtual #138                // Method ext/mods/gameserver/skills/L2Skill.getFinalTarget:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Creature;
        11: aload_3
        12: aconst_null
        13: aconst_null
        14: iload         4
        16: iload         5
        18: iload         6
        20: iconst_0
        21: iload         7
        23: aconst_null
        24: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        27: return
      LineNumberTable:
        line 221: 0
        line 222: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      28     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0      28     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      28     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0      28     4 isCtrlPressed   Z
            0      28     5 isShiftPressed   Z
            0      28     6 itemObjectId   I
            0      28     7 canMoveToTarget   Z

  public synchronized void updateAsFakeDeath(boolean);
    descriptor: (Z)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=2, args_size=2
         0: aload_0
         1: getstatic     #142                // Field ext/mods/gameserver/enums/IntentionType.FAKE_DEATH:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aconst_null
         6: aconst_null
         7: aconst_null
         8: aconst_null
         9: iload_1
        10: iconst_0
        11: iconst_0
        12: iconst_0
        13: iconst_0
        14: aconst_null
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 226: 0
        line 227: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      19     1 startFakeDeath   Z

  public synchronized void updateAsFlee(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.location.Location, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=4, args_size=4
         0: aload_0
         1: getstatic     #145                // Field ext/mods/gameserver/enums/IntentionType.FLEE:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aload_1
         6: aconst_null
         7: aload_2
         8: aconst_null
         9: iconst_0
        10: iconst_0
        11: iload_3
        12: iconst_0
        13: iconst_0
        14: aconst_null
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 231: 0
        line 232: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      19     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      19     2 startLoc   Lext/mods/gameserver/model/location/Location;
            0      19     3 distance   I

  public synchronized void updateAsFollow(ext.mods.gameserver.model.actor.Creature, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Z)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=3, args_size=3
         0: aload_0
         1: getstatic     #148                // Field ext/mods/gameserver/enums/IntentionType.FOLLOW:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aload_1
         6: aconst_null
         7: aconst_null
         8: aconst_null
         9: iconst_0
        10: iload_2
        11: iconst_0
        12: iconst_0
        13: iconst_0
        14: aconst_null
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 236: 0
        line 237: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      19     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      19     2 isShiftPressed   Z

  public synchronized void updateAsIdle();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=1, args_size=1
         0: aload_0
         1: getstatic     #7                  // Field ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aconst_null
         6: aconst_null
         7: aconst_null
         8: aconst_null
         9: iconst_0
        10: iconst_0
        11: iconst_0
        12: iconst_0
        13: iconst_0
        14: aconst_null
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 241: 0
        line 242: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public synchronized void updateAsInteract(ext.mods.gameserver.model.WorldObject, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/WorldObject;ZZ)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=4, args_size=4
         0: aload_0
         1: getstatic     #151                // Field ext/mods/gameserver/enums/IntentionType.INTERACT:Lext/mods/gameserver/enums/IntentionType;
         4: aload_1
         5: aconst_null
         6: aconst_null
         7: aconst_null
         8: aconst_null
         9: iload_2
        10: iload_3
        11: iconst_0
        12: iconst_0
        13: iconst_0
        14: aconst_null
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 246: 0
        line 247: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      19     1 target   Lext/mods/gameserver/model/WorldObject;
            0      19     2 isCtrlPressed   Z
            0      19     3 isShiftPressed   Z

  public synchronized void updateAsMoveRoute(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=2, args_size=2
         0: aload_0
         1: getstatic     #154                // Field ext/mods/gameserver/enums/IntentionType.MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aconst_null
         6: aconst_null
         7: aconst_null
         8: aconst_null
         9: iconst_0
        10: iconst_0
        11: iconst_0
        12: iconst_0
        13: iconst_0
        14: aload_1
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 251: 0
        line 252: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      19     1 routeName   Ljava/lang/String;

  public synchronized void updateAsMoveTo(ext.mods.gameserver.model.location.Location, ext.mods.gameserver.model.actor.Boat);
    descriptor: (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=3, args_size=3
         0: aload_0
         1: getstatic     #157                // Field ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aconst_null
         6: aconst_null
         7: aload_1
         8: aload_2
         9: iconst_0
        10: iconst_0
        11: iconst_0
        12: iconst_0
        13: iconst_0
        14: aconst_null
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 256: 0
        line 257: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      19     1   loc   Lext/mods/gameserver/model/location/Location;
            0      19     2  boat   Lext/mods/gameserver/model/actor/Boat;

  public synchronized void updateAsNothing(int);
    descriptor: (I)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=2, args_size=2
         0: aload_0
         1: getstatic     #160                // Field ext/mods/gameserver/enums/IntentionType.NOTHING:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aconst_null
         6: aconst_null
         7: aconst_null
         8: aconst_null
         9: iconst_0
        10: iconst_0
        11: iconst_0
        12: iload_1
        13: iconst_0
        14: aconst_null
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 261: 0
        line 262: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      19     1 timer   I

  public synchronized void updateAsPickUp(int, boolean);
    descriptor: (IZ)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=3, args_size=3
         0: aload_0
         1: getstatic     #163                // Field ext/mods/gameserver/enums/IntentionType.PICK_UP:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aconst_null
         6: aconst_null
         7: aconst_null
         8: aconst_null
         9: iconst_0
        10: iload_2
        11: iload_1
        12: iconst_0
        13: iconst_0
        14: aconst_null
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 266: 0
        line 267: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      19     1 itemObjectId   I
            0      19     2 isShiftPressed   Z

  public synchronized void updateAsSit(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=2, args_size=2
         0: aload_0
         1: getstatic     #166                // Field ext/mods/gameserver/enums/IntentionType.SIT:Lext/mods/gameserver/enums/IntentionType;
         4: aload_1
         5: aconst_null
         6: aconst_null
         7: aconst_null
         8: aconst_null
         9: iconst_0
        10: iconst_0
        11: iconst_0
        12: iconst_0
        13: iconst_0
        14: aconst_null
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 271: 0
        line 272: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      19     1 target   Lext/mods/gameserver/model/WorldObject;

  public synchronized void updateAsSocial(int, int);
    descriptor: (II)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=3, args_size=3
         0: aload_0
         1: getstatic     #169                // Field ext/mods/gameserver/enums/IntentionType.SOCIAL:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aconst_null
         6: aconst_null
         7: aconst_null
         8: aconst_null
         9: iconst_0
        10: iconst_0
        11: iload_1
        12: iload_2
        13: iconst_0
        14: aconst_null
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 276: 0
        line 277: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      19     1    id   I
            0      19     2 timer   I

  public synchronized void updateAsStand();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=1, args_size=1
         0: aload_0
         1: getstatic     #172                // Field ext/mods/gameserver/enums/IntentionType.STAND:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aconst_null
         6: aconst_null
         7: aconst_null
         8: aconst_null
         9: iconst_0
        10: iconst_0
        11: iconst_0
        12: iconst_0
        13: iconst_0
        14: aconst_null
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 281: 0
        line 282: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;

  public synchronized void updateAsUseItem(int);
    descriptor: (I)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=2, args_size=2
         0: aload_0
         1: getstatic     #175                // Field ext/mods/gameserver/enums/IntentionType.USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aconst_null
         6: aconst_null
         7: aconst_null
         8: aconst_null
         9: iconst_0
        10: iconst_0
        11: iload_1
        12: iconst_0
        13: iconst_0
        14: aconst_null
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 286: 0
        line 287: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      19     1 itemObjectId   I

  public synchronized void updateAsWander(int);
    descriptor: (I)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=2, args_size=2
         0: aload_0
         1: getstatic     #178                // Field ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
         4: aconst_null
         5: aconst_null
         6: aconst_null
         7: aconst_null
         8: aconst_null
         9: iconst_0
        10: iconst_0
        11: iconst_0
        12: iload_1
        13: iconst_0
        14: aconst_null
        15: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        18: return
      LineNumberTable:
        line 291: 0
        line 292: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      19     1 timer   I

  public synchronized void updateUsing(ext.mods.gameserver.model.actor.ai.Intention);
    descriptor: (Lext/mods/gameserver/model/actor/ai/Intention;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=13, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #181                // Method getType:()Lext/mods/gameserver/enums/IntentionType;
         5: aload_1
         6: invokevirtual #185                // Method getTarget:()Lext/mods/gameserver/model/WorldObject;
         9: aload_1
        10: invokevirtual #189                // Method getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        13: aload_1
        14: invokevirtual #192                // Method getSkill:()Lext/mods/gameserver/skills/L2Skill;
        17: aload_1
        18: invokevirtual #196                // Method getLoc:()Lext/mods/gameserver/model/location/Location;
        21: aload_1
        22: invokevirtual #199                // Method getBoat:()Lext/mods/gameserver/model/actor/Boat;
        25: aload_1
        26: invokevirtual #203                // Method isCtrlPressed:()Z
        29: aload_1
        30: invokevirtual #207                // Method isShiftPressed:()Z
        33: aload_1
        34: invokevirtual #210                // Method getItemObjectId:()I
        37: aload_1
        38: invokevirtual #213                // Method getTimer:()I
        41: aload_1
        42: invokevirtual #216                // Method canMoveToTarget:()Z
        45: aload_1
        46: invokevirtual #219                // Method getRouteName:()Ljava/lang/String;
        49: invokevirtual #131                // Method set:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;ZZIIZLjava/lang/String;)V
        52: return
      LineNumberTable:
        line 300: 0
        line 301: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
            0      53     1 intention   Lext/mods/gameserver/model/actor/ai/Intention;

  public synchronized boolean isBlank();
    descriptor: ()Z
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/IntentionType;
         4: getstatic     #7                  // Field ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
         7: if_acmpne     63
        10: aload_0
        11: getfield      #105                // Field _target:Lext/mods/gameserver/model/WorldObject;
        14: ifnonnull     63
        17: aload_0
        18: getfield      #28                 // Field _finalTarget:Lext/mods/gameserver/model/actor/Creature;
        21: ifnonnull     63
        24: aload_0
        25: getfield      #51                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        28: ifnonnull     63
        31: aload_0
        32: getfield      #58                 // Field _loc:Lext/mods/gameserver/model/location/Location;
        35: ifnonnull     63
        38: aload_0
        39: getfield      #80                 // Field _boat:Lext/mods/gameserver/model/actor/Boat;
        42: ifnonnull     63
        45: aload_0
        46: getfield      #38                 // Field _itemObjectId:I
        49: ifne          63
        52: aload_0
        53: getfield      #109                // Field _timer:I
        56: ifne          63
        59: iconst_1
        60: goto          64
        63: iconst_0
        64: ireturn
      LineNumberTable:
        line 308: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
      StackMapTable: number_of_entries = 2
        frame_type = 63 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int compareTo(java.lang.Object);
    descriptor: (Ljava/lang/Object;)I
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #14                 // class ext/mods/gameserver/model/actor/ai/Intention
         5: invokevirtual #222                // Method compareTo:(Lext/mods/gameserver/model/actor/ai/Intention;)I
         8: ireturn
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/ai/Intention;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
}
Signature: #293                         // Ljava/lang/Object;Ljava/lang/Comparable<Lext/mods/gameserver/model/actor/ai/Intention;>;
SourceFile: "Intention.java"
NestMembers:
  ext/mods/gameserver/model/actor/ai/Intention$1
BootstrapMethods:
  0: #300 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #298 Intention [type=\u0001]
InnerClasses:
  static #19;                             // class ext/mods/gameserver/model/actor/ai/Intention$1
  public static final #311= #307 of #309; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
