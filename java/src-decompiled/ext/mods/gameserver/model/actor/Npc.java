// Bytecode for: ext.mods.gameserver.model.actor.Npc
// File: ext\mods\gameserver\model\actor\Npc.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/Npc.class
  Last modified 9 de jul de 2026; size 49596 bytes
  MD5 checksum 1a1ea07aea7602fc79f64303e5720281
  Compiled from "Npc.java"
public class ext.mods.gameserver.model.actor.Npc extends ext.mods.gameserver.model.actor.Creature
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/actor/Npc
  super_class: #2                         // ext/mods/gameserver/model/actor/Creature
  interfaces: 0, fields: 56, methods: 147, attributes: 3
Constant pool:
     #1 = Methodref          #2.#3        // ext/mods/gameserver/model/actor/Creature."<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
     #2 = Class              #4           // ext/mods/gameserver/model/actor/Creature
     #3 = NameAndType        #5:#6        // "<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
     #4 = Utf8               ext/mods/gameserver/model/actor/Creature
     #5 = Utf8               <init>
     #6 = Utf8               (ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
     #7 = Class              #8           // java/util/concurrent/atomic/AtomicBoolean
     #8 = Utf8               java/util/concurrent/atomic/AtomicBoolean
     #9 = Methodref          #7.#10       // java/util/concurrent/atomic/AtomicBoolean."<init>":()V
    #10 = NameAndType        #5:#11       // "<init>":()V
    #11 = Utf8               ()V
    #12 = Fieldref           #13.#14      // ext/mods/gameserver/model/actor/Npc._isDecayed:Ljava/util/concurrent/atomic/AtomicBoolean;
    #13 = Class              #15          // ext/mods/gameserver/model/actor/Npc
    #14 = NameAndType        #16:#17      // _isDecayed:Ljava/util/concurrent/atomic/AtomicBoolean;
    #15 = Utf8               ext/mods/gameserver/model/actor/Npc
    #16 = Utf8               _isDecayed
    #17 = Utf8               Ljava/util/concurrent/atomic/AtomicBoolean;
    #18 = Fieldref           #13.#19      // ext/mods/gameserver/model/actor/Npc._currentSsCount:I
    #19 = NameAndType        #20:#21      // _currentSsCount:I
    #20 = Utf8               _currentSsCount
    #21 = Utf8               I
    #22 = Fieldref           #13.#23      // ext/mods/gameserver/model/actor/Npc._currentSpsCount:I
    #23 = NameAndType        #24:#21      // _currentSpsCount:I
    #24 = Utf8               _currentSpsCount
    #25 = Fieldref           #13.#26      // ext/mods/gameserver/model/actor/Npc._shotsMask:I
    #26 = NameAndType        #27:#21      // _shotsMask:I
    #27 = Utf8               _shotsMask
    #28 = Fieldref           #13.#29      // ext/mods/gameserver/model/actor/Npc._scriptValue:I
    #29 = NameAndType        #30:#21      // _scriptValue:I
    #30 = Utf8               _scriptValue
    #31 = Fieldref           #13.#32      // ext/mods/gameserver/model/actor/Npc._lookNeighborTimeStamp:J
    #32 = NameAndType        #33:#34      // _lookNeighborTimeStamp:J
    #33 = Utf8               _lookNeighborTimeStamp
    #34 = Utf8               J
    #35 = Class              #36          // java/lang/Integer
    #36 = Utf8               java/lang/Integer
    #37 = Methodref          #38.#39      // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
    #38 = Class              #40          // java/util/Arrays
    #39 = NameAndType        #41:#42      // asList:([Ljava/lang/Object;)Ljava/util/List;
    #40 = Utf8               java/util/Arrays
    #41 = Utf8               asList
    #42 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
    #43 = Fieldref           #13.#44      // ext/mods/gameserver/model/actor/Npc._followSlots:Ljava/util/List;
    #44 = NameAndType        #45:#46      // _followSlots:Ljava/util/List;
    #45 = Utf8               _followSlots
    #46 = Utf8               Ljava/util/List;
    #47 = Fieldref           #13.#48      // ext/mods/gameserver/model/actor/Npc._lastFollowingLoc:Lext/mods/gameserver/model/location/Location;
    #48 = NameAndType        #49:#50      // _lastFollowingLoc:Lext/mods/gameserver/model/location/Location;
    #49 = Utf8               _lastFollowingLoc
    #50 = Utf8               Lext/mods/gameserver/model/location/Location;
    #51 = Fieldref           #13.#52      // ext/mods/gameserver/model/actor/Npc._isAISleeping:Z
    #52 = NameAndType        #53:#54      // _isAISleeping:Z
    #53 = Utf8               _isAISleeping
    #54 = Utf8               Z
    #55 = Fieldref           #13.#56      // ext/mods/gameserver/model/actor/Npc._weightPoint:I
    #56 = NameAndType        #57:#21      // _weightPoint:I
    #57 = Utf8               _weightPoint
    #58 = Class              #59          // java/util/concurrent/atomic/AtomicInteger
    #59 = Utf8               java/util/concurrent/atomic/AtomicInteger
    #60 = Methodref          #58.#10      // java/util/concurrent/atomic/AtomicInteger."<init>":()V
    #61 = Fieldref           #13.#62      // ext/mods/gameserver/model/actor/Npc._av_quest0:Ljava/util/concurrent/atomic/AtomicInteger;
    #62 = NameAndType        #63:#64      // _av_quest0:Ljava/util/concurrent/atomic/AtomicInteger;
    #63 = Utf8               _av_quest0
    #64 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
    #65 = Fieldref           #13.#66      // ext/mods/gameserver/model/actor/Npc._av_quest1:Ljava/util/concurrent/atomic/AtomicInteger;
    #66 = NameAndType        #67:#64      // _av_quest1:Ljava/util/concurrent/atomic/AtomicInteger;
    #67 = Utf8               _av_quest1
    #68 = Class              #69          // ext/mods/gameserver/model/actor/move/NpcMove
    #69 = Utf8               ext/mods/gameserver/model/actor/move/NpcMove
    #70 = Methodref          #68.#71      // ext/mods/gameserver/model/actor/move/NpcMove."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
    #71 = NameAndType        #5:#72       // "<init>":(Lext/mods/gameserver/model/actor/Npc;)V
    #72 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
    #73 = Fieldref           #13.#74      // ext/mods/gameserver/model/actor/Npc._move:Lext/mods/gameserver/model/actor/move/CreatureMove;
    #74 = NameAndType        #75:#76      // _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
    #75 = Utf8               _move
    #76 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove;
    #77 = Methodref          #78.#79      // ext/mods/gameserver/model/actor/template/NpcTemplate.getPassives:()Ljava/util/List;
    #78 = Class              #80          // ext/mods/gameserver/model/actor/template/NpcTemplate
    #79 = NameAndType        #81:#82      // getPassives:()Ljava/util/List;
    #80 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
    #81 = Utf8               getPassives
    #82 = Utf8               ()Ljava/util/List;
    #83 = InterfaceMethodref #84.#85      // java/util/List.iterator:()Ljava/util/Iterator;
    #84 = Class              #86          // java/util/List
    #85 = NameAndType        #87:#88      // iterator:()Ljava/util/Iterator;
    #86 = Utf8               java/util/List
    #87 = Utf8               iterator
    #88 = Utf8               ()Ljava/util/Iterator;
    #89 = InterfaceMethodref #90.#91      // java/util/Iterator.hasNext:()Z
    #90 = Class              #92          // java/util/Iterator
    #91 = NameAndType        #93:#94      // hasNext:()Z
    #92 = Utf8               java/util/Iterator
    #93 = Utf8               hasNext
    #94 = Utf8               ()Z
    #95 = InterfaceMethodref #90.#96      // java/util/Iterator.next:()Ljava/lang/Object;
    #96 = NameAndType        #97:#98      // next:()Ljava/lang/Object;
    #97 = Utf8               next
    #98 = Utf8               ()Ljava/lang/Object;
    #99 = Class              #100         // ext/mods/gameserver/skills/L2Skill
   #100 = Utf8               ext/mods/gameserver/skills/L2Skill
   #101 = Methodref          #99.#102     // ext/mods/gameserver/skills/L2Skill.getStatFuncs:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #102 = NameAndType        #103:#104    // getStatFuncs:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #103 = Utf8               getStatFuncs
   #104 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #105 = Methodref          #13.#106     // ext/mods/gameserver/model/actor/Npc.addStatFuncs:(Ljava/util/List;)V
   #106 = NameAndType        #107:#108    // addStatFuncs:(Ljava/util/List;)V
   #107 = Utf8               addStatFuncs
   #108 = Utf8               (Ljava/util/List;)V
   #109 = Methodref          #13.#110     // ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #110 = NameAndType        #111:#112    // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #111 = Utf8               getStatus
   #112 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #113 = Methodref          #114.#115    // ext/mods/gameserver/model/actor/status/NpcStatus.initializeValues:()V
   #114 = Class              #116         // ext/mods/gameserver/model/actor/status/NpcStatus
   #115 = NameAndType        #117:#11     // initializeValues:()V
   #116 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
   #117 = Utf8               initializeValues
   #118 = Methodref          #78.#119     // ext/mods/gameserver/model/actor/template/NpcTemplate.getLeftHand:()I
   #119 = NameAndType        #120:#121    // getLeftHand:()I
   #120 = Utf8               getLeftHand
   #121 = Utf8               ()I
   #122 = Fieldref           #13.#123     // ext/mods/gameserver/model/actor/Npc._leftHandItemId:I
   #123 = NameAndType        #124:#21     // _leftHandItemId:I
   #124 = Utf8               _leftHandItemId
   #125 = Methodref          #78.#126     // ext/mods/gameserver/model/actor/template/NpcTemplate.getRightHand:()I
   #126 = NameAndType        #127:#121    // getRightHand:()I
   #127 = Utf8               getRightHand
   #128 = Fieldref           #13.#129     // ext/mods/gameserver/model/actor/Npc._rightHandItemId:I
   #129 = NameAndType        #130:#21     // _rightHandItemId:I
   #130 = Utf8               _rightHandItemId
   #131 = Methodref          #78.#132     // ext/mods/gameserver/model/actor/template/NpcTemplate.getCollisionHeight:()D
   #132 = NameAndType        #133:#134    // getCollisionHeight:()D
   #133 = Utf8               getCollisionHeight
   #134 = Utf8               ()D
   #135 = Fieldref           #13.#136     // ext/mods/gameserver/model/actor/Npc._currentCollisionHeight:D
   #136 = NameAndType        #137:#138    // _currentCollisionHeight:D
   #137 = Utf8               _currentCollisionHeight
   #138 = Utf8               D
   #139 = Methodref          #78.#140     // ext/mods/gameserver/model/actor/template/NpcTemplate.getCollisionRadius:()D
   #140 = NameAndType        #141:#134    // getCollisionRadius:()D
   #141 = Utf8               getCollisionRadius
   #142 = Fieldref           #13.#143     // ext/mods/gameserver/model/actor/Npc._currentCollisionRadius:D
   #143 = NameAndType        #144:#138    // _currentCollisionRadius:D
   #144 = Utf8               _currentCollisionRadius
   #145 = Methodref          #146.#147    // ext/mods/gameserver/custom/data/PolymorphData.getInstance:()Lext/mods/gameserver/custom/data/PolymorphData;
   #146 = Class              #148         // ext/mods/gameserver/custom/data/PolymorphData
   #147 = NameAndType        #149:#150    // getInstance:()Lext/mods/gameserver/custom/data/PolymorphData;
   #148 = Utf8               ext/mods/gameserver/custom/data/PolymorphData
   #149 = Utf8               getInstance
   #150 = Utf8               ()Lext/mods/gameserver/custom/data/PolymorphData;
   #151 = Methodref          #78.#152     // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
   #152 = NameAndType        #153:#121    // getNpcId:()I
   #153 = Utf8               getNpcId
   #154 = Methodref          #146.#155    // ext/mods/gameserver/custom/data/PolymorphData.getFakePc:(I)Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
   #155 = NameAndType        #156:#157    // getFakePc:(I)Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
   #156 = Utf8               getFakePc
   #157 = Utf8               (I)Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
   #158 = Fieldref           #13.#159     // ext/mods/gameserver/model/actor/Npc._fakePc:Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
   #159 = NameAndType        #160:#161    // _fakePc:Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
   #160 = Utf8               _fakePc
   #161 = Utf8               Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
   #162 = Methodref          #78.#163     // ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
   #163 = NameAndType        #164:#165    // getName:()Ljava/lang/String;
   #164 = Utf8               getName
   #165 = Utf8               ()Ljava/lang/String;
   #166 = Methodref          #13.#167     // ext/mods/gameserver/model/actor/Npc.setName:(Ljava/lang/String;)V
   #167 = NameAndType        #168:#169    // setName:(Ljava/lang/String;)V
   #168 = Utf8               setName
   #169 = Utf8               (Ljava/lang/String;)V
   #170 = Methodref          #78.#171     // ext/mods/gameserver/model/actor/template/NpcTemplate.getTitle:()Ljava/lang/String;
   #171 = NameAndType        #172:#165    // getTitle:()Ljava/lang/String;
   #172 = Utf8               getTitle
   #173 = Methodref          #13.#174     // ext/mods/gameserver/model/actor/Npc.setTitle:(Ljava/lang/String;)V
   #174 = NameAndType        #175:#169    // setTitle:(Ljava/lang/String;)V
   #175 = Utf8               setTitle
   #176 = Methodref          #78.#177     // ext/mods/gameserver/model/actor/template/NpcTemplate.isUndying:()Z
   #177 = NameAndType        #178:#94     // isUndying:()Z
   #178 = Utf8               isUndying
   #179 = Methodref          #13.#180     // ext/mods/gameserver/model/actor/Npc.setMortal:(Z)V
   #180 = NameAndType        #181:#182    // setMortal:(Z)V
   #181 = Utf8               setMortal
   #182 = Utf8               (Z)V
   #183 = Methodref          #78.#184     // ext/mods/gameserver/model/actor/template/NpcTemplate.getResidence:()Lext/mods/gameserver/model/residence/Residence;
   #184 = NameAndType        #185:#186    // getResidence:()Lext/mods/gameserver/model/residence/Residence;
   #185 = Utf8               getResidence
   #186 = Utf8               ()Lext/mods/gameserver/model/residence/Residence;
   #187 = Fieldref           #13.#188     // ext/mods/gameserver/model/actor/Npc._residence:Lext/mods/gameserver/model/residence/Residence;
   #188 = NameAndType        #189:#190    // _residence:Lext/mods/gameserver/model/residence/Residence;
   #189 = Utf8               _residence
   #190 = Utf8               Lext/mods/gameserver/model/residence/Residence;
   #191 = Methodref          #13.#163     // ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
   #192 = Methodref          #193.#194    // ext/mods/commons/lang/StringUtil.trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
   #193 = Class              #195         // ext/mods/commons/lang/StringUtil
   #194 = NameAndType        #196:#197    // trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
   #195 = Utf8               ext/mods/commons/lang/StringUtil
   #196 = Utf8               trimAndDress
   #197 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #198 = Methodref          #13.#199     // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
   #199 = NameAndType        #200:#121    // getObjectId:()I
   #200 = Utf8               getObjectId
   #201 = InvokeDynamic      #0:#202      // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #202 = NameAndType        #203:#197    // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #203 = Utf8               makeConcatWithConstants
   #204 = Fieldref           #13.#205     // ext/mods/gameserver/model/actor/Npc._ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #205 = NameAndType        #206:#207    // _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #206 = Utf8               _ai
   #207 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #208 = Class              #209         // ext/mods/gameserver/model/actor/ai/type/NpcAI
   #209 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
   #210 = Methodref          #208.#71     // ext/mods/gameserver/model/actor/ai/type/NpcAI."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
   #211 = Fieldref           #13.#212     // ext/mods/gameserver/model/actor/Npc._cast:Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #212 = NameAndType        #213:#214    // _cast:Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #213 = Utf8               _cast
   #214 = Utf8               Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #215 = Class              #216         // ext/mods/gameserver/model/actor/cast/NpcCast
   #216 = Utf8               ext/mods/gameserver/model/actor/cast/NpcCast
   #217 = Methodref          #215.#71     // ext/mods/gameserver/model/actor/cast/NpcCast."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
   #218 = Fieldref           #13.#219     // ext/mods/gameserver/model/actor/Npc._status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #219 = NameAndType        #220:#221    // _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #220 = Utf8               _status
   #221 = Utf8               Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #222 = Methodref          #114.#71     // ext/mods/gameserver/model/actor/status/NpcStatus."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
   #223 = Fieldref           #13.#224     // ext/mods/gameserver/model/actor/Npc._attack:Lext/mods/gameserver/model/actor/attack/CreatureAttack;
   #224 = NameAndType        #225:#226    // _attack:Lext/mods/gameserver/model/actor/attack/CreatureAttack;
   #225 = Utf8               _attack
   #226 = Utf8               Lext/mods/gameserver/model/actor/attack/CreatureAttack;
   #227 = Class              #228         // ext/mods/gameserver/model/actor/attack/NpcAttack
   #228 = Utf8               ext/mods/gameserver/model/actor/attack/NpcAttack
   #229 = Methodref          #227.#71     // ext/mods/gameserver/model/actor/attack/NpcAttack."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
   #230 = Methodref          #2.#231      // ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #231 = NameAndType        #232:#233    // getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #232 = Utf8               getTemplate
   #233 = Utf8               ()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #234 = Methodref          #13.#235     // ext/mods/gameserver/model/actor/Npc.isRunning:()Z
   #235 = NameAndType        #236:#94     // isRunning:()Z
   #236 = Utf8               isRunning
   #237 = Methodref          #2.#238      // ext/mods/gameserver/model/actor/Creature.setWalkOrRun:(Z)V
   #238 = NameAndType        #239:#182    // setWalkOrRun:(Z)V
   #239 = Utf8               setWalkOrRun
   #240 = Class              #241         // ext/mods/gameserver/model/actor/Player
   #241 = Utf8               ext/mods/gameserver/model/actor/Player
   #242 = InvokeDynamic      #1:#243      // #1:accept:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
   #243 = NameAndType        #244:#245    // accept:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
   #244 = Utf8               accept
   #245 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
   #246 = Methodref          #13.#247     // ext/mods/gameserver/model/actor/Npc.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
   #247 = NameAndType        #248:#249    // forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
   #248 = Utf8               forEachKnownType
   #249 = Utf8               (Ljava/lang/Class;Ljava/util/function/Consumer;)V
   #250 = Methodref          #13.#251     // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #251 = NameAndType        #232:#252    // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #252 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #253 = Methodref          #78.#254     // ext/mods/gameserver/model/actor/template/NpcTemplate.getRace:()Lext/mods/gameserver/enums/actors/NpcRace;
   #254 = NameAndType        #255:#256    // getRace:()Lext/mods/gameserver/enums/actors/NpcRace;
   #255 = Utf8               getRace
   #256 = Utf8               ()Lext/mods/gameserver/enums/actors/NpcRace;
   #257 = Fieldref           #258.#259    // ext/mods/gameserver/enums/actors/NpcRace.UNDEAD:Lext/mods/gameserver/enums/actors/NpcRace;
   #258 = Class              #260         // ext/mods/gameserver/enums/actors/NpcRace
   #259 = NameAndType        #261:#262    // UNDEAD:Lext/mods/gameserver/enums/actors/NpcRace;
   #260 = Utf8               ext/mods/gameserver/enums/actors/NpcRace
   #261 = Utf8               UNDEAD
   #262 = Utf8               Lext/mods/gameserver/enums/actors/NpcRace;
   #263 = String             #264         //
   #264 = Utf8
   #265 = Fieldref           #13.#266     // ext/mods/gameserver/model/actor/Npc._title:Ljava/lang/String;
   #266 = NameAndType        #267:#268    // _title:Ljava/lang/String;
   #267 = Utf8               _title
   #268 = Utf8               Ljava/lang/String;
   #269 = Methodref          #240.#270    // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
   #270 = NameAndType        #271:#272    // getClient:()Lext/mods/gameserver/network/GameClient;
   #271 = Utf8               getClient
   #272 = Utf8               ()Lext/mods/gameserver/network/GameClient;
   #273 = Fieldref           #274.#275    // ext/mods/gameserver/enums/FloodProtector.ACTION:Lext/mods/gameserver/enums/FloodProtector;
   #274 = Class              #276         // ext/mods/gameserver/enums/FloodProtector
   #275 = NameAndType        #277:#278    // ACTION:Lext/mods/gameserver/enums/FloodProtector;
   #276 = Utf8               ext/mods/gameserver/enums/FloodProtector
   #277 = Utf8               ACTION
   #278 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
   #279 = Methodref          #280.#281    // ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
   #280 = Class              #282         // ext/mods/gameserver/network/GameClient
   #281 = NameAndType        #283:#284    // performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
   #282 = Utf8               ext/mods/gameserver/network/GameClient
   #283 = Utf8               performAction
   #284 = Utf8               (Lext/mods/gameserver/enums/FloodProtector;)Z
   #285 = Methodref          #13.#286     // ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #286 = NameAndType        #287:#288    // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #287 = Utf8               getAI
   #288 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #289 = Methodref          #290.#291    // ext/mods/commons/random/Rnd.get:(I)I
   #290 = Class              #292         // ext/mods/commons/random/Rnd
   #291 = NameAndType        #293:#294    // get:(I)I
   #292 = Utf8               ext/mods/commons/random/Rnd
   #293 = Utf8               get
   #294 = Utf8               (I)I
   #295 = Methodref          #208.#296    // ext/mods/gameserver/model/actor/ai/type/NpcAI.onRandomAnimation:(I)V
   #296 = NameAndType        #297:#298    // onRandomAnimation:(I)V
   #297 = Utf8               onRandomAnimation
   #298 = Utf8               (I)V
   #299 = Methodref          #300.#301    // ext/mods/extensions/listener/manager/NpcListenerManager.getInstance:()Lext/mods/extensions/listener/manager/NpcListenerManager;
   #300 = Class              #302         // ext/mods/extensions/listener/manager/NpcListenerManager
   #301 = NameAndType        #149:#303    // getInstance:()Lext/mods/extensions/listener/manager/NpcListenerManager;
   #302 = Utf8               ext/mods/extensions/listener/manager/NpcListenerManager
   #303 = Utf8               ()Lext/mods/extensions/listener/manager/NpcListenerManager;
   #304 = Methodref          #300.#305    // ext/mods/extensions/listener/manager/NpcListenerManager.notifyNpcInteract:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
   #305 = NameAndType        #306:#307    // notifyNpcInteract:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
   #306 = Utf8               notifyNpcInteract
   #307 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
   #308 = Methodref          #240.#309    // ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #309 = NameAndType        #310:#311    // getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #310 = Utf8               getQuestList
   #311 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #312 = Methodref          #313.#314    // ext/mods/gameserver/model/actor/container/player/QuestList.setLastQuestNpcObjectId:(I)V
   #313 = Class              #315         // ext/mods/gameserver/model/actor/container/player/QuestList
   #314 = NameAndType        #316:#298    // setLastQuestNpcObjectId:(I)V
   #315 = Utf8               ext/mods/gameserver/model/actor/container/player/QuestList
   #316 = Utf8               setLastQuestNpcObjectId
   #317 = Fieldref           #318.#319    // ext/mods/gameserver/enums/EventHandler.AI_TALKED:Lext/mods/gameserver/enums/EventHandler;
   #318 = Class              #320         // ext/mods/gameserver/enums/EventHandler
   #319 = NameAndType        #321:#322    // AI_TALKED:Lext/mods/gameserver/enums/EventHandler;
   #320 = Utf8               ext/mods/gameserver/enums/EventHandler
   #321 = Utf8               AI_TALKED
   #322 = Utf8               Lext/mods/gameserver/enums/EventHandler;
   #323 = Methodref          #78.#324     // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #324 = NameAndType        #325:#326    // getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #325 = Utf8               getEventQuests
   #326 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #327 = Class              #328         // ext/mods/gameserver/scripting/Quest
   #328 = Utf8               ext/mods/gameserver/scripting/Quest
   #329 = Methodref          #327.#330    // ext/mods/gameserver/scripting/Quest.notifyTALKED:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #330 = NameAndType        #331:#332    // notifyTALKED:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #331 = Utf8               notifyTALKED
   #332 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #333 = Fieldref           #318.#334    // ext/mods/gameserver/enums/EventHandler.FIRST_TALK:Lext/mods/gameserver/enums/EventHandler;
   #334 = NameAndType        #335:#322    // FIRST_TALK:Lext/mods/gameserver/enums/EventHandler;
   #335 = Utf8               FIRST_TALK
   #336 = InterfaceMethodref #84.#337     // java/util/List.size:()I
   #337 = NameAndType        #338:#121    // size:()I
   #338 = Utf8               size
   #339 = InterfaceMethodref #84.#340     // java/util/List.get:(I)Ljava/lang/Object;
   #340 = NameAndType        #293:#341    // get:(I)Ljava/lang/Object;
   #341 = Utf8               (I)Ljava/lang/Object;
   #342 = Methodref          #327.#343    // ext/mods/gameserver/scripting/Quest.notifyFirstTalk:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #343 = NameAndType        #344:#332    // notifyFirstTalk:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #344 = Utf8               notifyFirstTalk
   #345 = Fieldref           #13.#346     // ext/mods/gameserver/model/actor/Npc._observerGroups:Ljava/util/List;
   #346 = NameAndType        #347:#46     // _observerGroups:Ljava/util/List;
   #347 = Utf8               _observerGroups
   #348 = Methodref          #13.#349     // ext/mods/gameserver/model/actor/Npc.showObserverWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #349 = NameAndType        #350:#351    // showObserverWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #350 = Utf8               showObserverWindow
   #351 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #352 = Methodref          #13.#353     // ext/mods/gameserver/model/actor/Npc.showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #353 = NameAndType        #354:#351    // showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
   #354 = Utf8               showChatWindow
   #355 = Methodref          #2.#356      // ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
   #356 = NameAndType        #357:#94     // isMovementDisabled:()Z
   #357 = Utf8               isMovementDisabled
   #358 = Methodref          #78.#359     // ext/mods/gameserver/model/actor/template/NpcTemplate.canMove:()Z
   #359 = NameAndType        #360:#94     // canMove:()Z
   #360 = Utf8               canMove
   #361 = Class              #362         // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
   #362 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
   #363 = Methodref          #361.#364    // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #364 = NameAndType        #5:#332      // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #365 = Methodref          #240.#366    // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #366 = NameAndType        #367:#368    // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #367 = Utf8               sendPacket
   #368 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #369 = Methodref          #370.#371    // ext/mods/gameserver/enums/items/ShotType.getMask:()I
   #370 = Class              #372         // ext/mods/gameserver/enums/items/ShotType
   #371 = NameAndType        #373:#121    // getMask:()I
   #372 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #373 = Utf8               getMask
   #374 = Fieldref           #370.#375    // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #375 = NameAndType        #376:#377    // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #376 = Utf8               SOULSHOT
   #377 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #378 = Methodref          #13.#379     // ext/mods/gameserver/model/actor/Npc.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #379 = NameAndType        #380:#381    // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #380 = Utf8               isChargedShot
   #381 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #382 = Class              #383         // ext/mods/gameserver/network/serverpackets/MagicSkillUse
   #383 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
   #384 = Methodref          #382.#385    // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
   #385 = NameAndType        #5:#386      // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
   #386 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
   #387 = Methodref          #13.#388     // ext/mods/gameserver/model/actor/Npc.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
   #388 = NameAndType        #389:#390    // broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
   #389 = Utf8               broadcastPacketInRadius
   #390 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
   #391 = Methodref          #13.#392     // ext/mods/gameserver/model/actor/Npc.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
   #392 = NameAndType        #393:#394    // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
   #393 = Utf8               setChargedShot
   #394 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
   #395 = Fieldref           #370.#396    // ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #396 = NameAndType        #397:#377    // SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #397 = Utf8               SPIRITSHOT
   #398 = Methodref          #13.#399     // ext/mods/gameserver/model/actor/Npc.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
   #399 = NameAndType        #400:#401    // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
   #400 = Utf8               getSkill
   #401 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
   #402 = Methodref          #99.#403     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
   #403 = NameAndType        #404:#121    // getLevel:()I
   #404 = Utf8               getLevel
   #405 = Methodref          #78.#406     // ext/mods/gameserver/model/actor/template/NpcTemplate.getSkills:()Ljava/util/Map;
   #406 = NameAndType        #407:#408    // getSkills:()Ljava/util/Map;
   #407 = Utf8               getSkills
   #408 = Utf8               ()Ljava/util/Map;
   #409 = InterfaceMethodref #410.#411    // java/util/Map.values:()Ljava/util/Collection;
   #410 = Class              #412         // java/util/Map
   #411 = NameAndType        #413:#414    // values:()Ljava/util/Collection;
   #412 = Utf8               java/util/Map
   #413 = Utf8               values
   #414 = Utf8               ()Ljava/util/Collection;
   #415 = InterfaceMethodref #416.#417    // java/util/Collection.stream:()Ljava/util/stream/Stream;
   #416 = Class              #418         // java/util/Collection
   #417 = NameAndType        #419:#420    // stream:()Ljava/util/stream/Stream;
   #418 = Utf8               java/util/Collection
   #419 = Utf8               stream
   #420 = Utf8               ()Ljava/util/stream/Stream;
   #421 = InvokeDynamic      #2:#422      // #2:test:(I)Ljava/util/function/Predicate;
   #422 = NameAndType        #423:#424    // test:(I)Ljava/util/function/Predicate;
   #423 = Utf8               test
   #424 = Utf8               (I)Ljava/util/function/Predicate;
   #425 = InterfaceMethodref #426.#427    // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #426 = Class              #428         // java/util/stream/Stream
   #427 = NameAndType        #429:#430    // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #428 = Utf8               java/util/stream/Stream
   #429 = Utf8               filter
   #430 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #431 = InterfaceMethodref #426.#432    // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #432 = NameAndType        #433:#434    // findFirst:()Ljava/util/Optional;
   #433 = Utf8               findFirst
   #434 = Utf8               ()Ljava/util/Optional;
   #435 = Methodref          #436.#437    // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #436 = Class              #438         // java/util/Optional
   #437 = NameAndType        #439:#440    // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #438 = Utf8               java/util/Optional
   #439 = Utf8               orElse
   #440 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #441 = Methodref          #442.#443    // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #442 = Class              #444         // ext/mods/gameserver/data/xml/ItemData
   #443 = NameAndType        #149:#445    // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #444 = Utf8               ext/mods/gameserver/data/xml/ItemData
   #445 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
   #446 = Methodref          #442.#447    // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #447 = NameAndType        #232:#448    // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #448 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
   #449 = Class              #450         // ext/mods/gameserver/model/item/kind/Weapon
   #450 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
   #451 = Methodref          #13.#452     // ext/mods/gameserver/model/actor/Npc.isDead:()Z
   #452 = NameAndType        #453:#94     // isDead:()Z
   #453 = Utf8               isDead
   #454 = Methodref          #2.#455      // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #455 = NameAndType        #456:#457    // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #456 = Utf8               getActingPlayer
   #457 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #458 = Methodref          #240.#459    // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #459 = NameAndType        #460:#94     // isGM:()Z
   #460 = Utf8               isGM
   #461 = Methodref          #240.#462    // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #462 = NameAndType        #463:#464    // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #463 = Utf8               getAppearance
   #464 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #465 = Methodref          #466.#467    // ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
   #466 = Class              #468         // ext/mods/gameserver/model/actor/container/player/Appearance
   #467 = NameAndType        #469:#94     // isVisible:()Z
   #468 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
   #469 = Utf8               isVisible
   #470 = Methodref          #240.#471    // ext/mods/gameserver/model/actor/Player.setTemporarilyVisible:(I)V
   #471 = NameAndType        #472:#298    // setTemporarilyVisible:(I)V
   #472 = Utf8               setTemporarilyVisible
   #473 = Methodref          #208.#474    // ext/mods/gameserver/model/actor/ai/type/NpcAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #474 = NameAndType        #475:#476    // getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #475 = Utf8               getAggroList
   #476 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #477 = Methodref          #478.#479    // ext/mods/gameserver/model/actor/container/attackable/AggroList.addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
   #478 = Class              #480         // ext/mods/gameserver/model/actor/container/attackable/AggroList
   #479 = NameAndType        #481:#482    // addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
   #480 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
   #481 = Utf8               addDamageHate
   #482 = Utf8               (Lext/mods/gameserver/model/actor/Creature;DD)V
   #483 = Fieldref           #13.#484     // ext/mods/gameserver/model/actor/Npc._lastAttacker:Lext/mods/gameserver/model/actor/Creature;
   #484 = NameAndType        #485:#486    // _lastAttacker:Lext/mods/gameserver/model/actor/Creature;
   #485 = Utf8               _lastAttacker
   #486 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #487 = Fieldref           #318.#488    // ext/mods/gameserver/enums/EventHandler.ATTACKED:Lext/mods/gameserver/enums/EventHandler;
   #488 = NameAndType        #489:#322    // ATTACKED:Lext/mods/gameserver/enums/EventHandler;
   #489 = Utf8               ATTACKED
   #490 = Methodref          #327.#491    // ext/mods/gameserver/scripting/Quest.onAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
   #491 = NameAndType        #492:#493    // onAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
   #492 = Utf8               onAttacked
   #493 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
   #494 = Methodref          #13.#495     // ext/mods/gameserver/model/actor/Npc.isMaster:()Z
   #495 = NameAndType        #496:#94     // isMaster:()Z
   #496 = Utf8               isMaster
   #497 = Methodref          #13.#498     // ext/mods/gameserver/model/actor/Npc.hasMaster:()Z
   #498 = NameAndType        #499:#94     // hasMaster:()Z
   #499 = Utf8               hasMaster
   #500 = Fieldref           #318.#501    // ext/mods/gameserver/enums/EventHandler.PARTY_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
   #501 = NameAndType        #502:#322    // PARTY_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
   #502 = Utf8               PARTY_ATTACKED
   #503 = Methodref          #327.#504    // ext/mods/gameserver/scripting/Quest.onPartyAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;I)V
   #504 = NameAndType        #505:#506    // onPartyAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;I)V
   #505 = Utf8               onPartyAttacked
   #506 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;I)V
   #507 = Methodref          #13.#508     // ext/mods/gameserver/model/actor/Npc.getMaster:()Lext/mods/gameserver/model/actor/Npc;
   #508 = NameAndType        #509:#510    // getMaster:()Lext/mods/gameserver/model/actor/Npc;
   #509 = Utf8               getMaster
   #510 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
   #511 = Methodref          #13.#512     // ext/mods/gameserver/model/actor/Npc.getMinions:()Ljava/util/Set;
   #512 = NameAndType        #513:#514    // getMinions:()Ljava/util/Set;
   #513 = Utf8               getMinions
   #514 = Utf8               ()Ljava/util/Set;
   #515 = InterfaceMethodref #516.#85     // java/util/Set.iterator:()Ljava/util/Iterator;
   #516 = Class              #517         // java/util/Set
   #517 = Utf8               java/util/Set
   #518 = Methodref          #78.#519     // ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
   #519 = NameAndType        #520:#521    // getClans:()[Ljava/lang/String;
   #520 = Utf8               getClans
   #521 = Utf8               ()[Ljava/lang/String;
   #522 = Methodref          #78.#523     // ext/mods/gameserver/model/actor/template/NpcTemplate.getClanRange:()I
   #523 = NameAndType        #524:#121    // getClanRange:()I
   #524 = Utf8               getClanRange
   #525 = Fieldref           #318.#526    // ext/mods/gameserver/enums/EventHandler.CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
   #526 = NameAndType        #527:#322    // CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
   #527 = Utf8               CLAN_ATTACKED
   #528 = Methodref          #327.#529    // ext/mods/gameserver/scripting/Quest.onClanAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
   #529 = NameAndType        #530:#531    // onClanAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
   #530 = Utf8               onClanAttacked
   #531 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
   #532 = InvokeDynamic      #3:#533      // #3:accept:(Lext/mods/gameserver/model/actor/Npc;[Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Consumer;
   #533 = NameAndType        #244:#534    // accept:(Lext/mods/gameserver/model/actor/Npc;[Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Consumer;
   #534 = Utf8               (Lext/mods/gameserver/model/actor/Npc;[Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Consumer;
   #535 = Methodref          #13.#536     // ext/mods/gameserver/model/actor/Npc.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #536 = NameAndType        #537:#538    // forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #537 = Utf8               forEachKnownTypeInRadius
   #538 = Utf8               (Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #539 = Methodref          #2.#540      // ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #540 = NameAndType        #541:#542    // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #541 = Utf8               reduceCurrentHp
   #542 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
   #543 = Methodref          #2.#544      // ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #544 = NameAndType        #545:#546    // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #545 = Utf8               doDie
   #546 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #547 = Fieldref           #13.#548     // ext/mods/gameserver/model/actor/Npc._enchantEffect:I
   #548 = NameAndType        #549:#21     // _enchantEffect:I
   #549 = Utf8               _enchantEffect
   #550 = Methodref          #13.#551     // ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #551 = NameAndType        #552:#553    // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #552 = Utf8               getMove
   #553 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #554 = Methodref          #555.#556    // ext/mods/gameserver/model/actor/move/CreatureMove.resetGeoPathFailCount:()V
   #555 = Class              #557         // ext/mods/gameserver/model/actor/move/CreatureMove
   #556 = NameAndType        #558:#11     // resetGeoPathFailCount:()V
   #557 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
   #558 = Utf8               resetGeoPathFailCount
   #559 = Methodref          #208.#560    // ext/mods/gameserver/model/actor/ai/type/NpcAI.resetLifeTime:()V
   #560 = NameAndType        #561:#11     // resetLifeTime:()V
   #561 = Utf8               resetLifeTime
   #562 = Methodref          #563.#564    // ext/mods/gameserver/taskmanager/AiTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AiTaskManager;
   #563 = Class              #565         // ext/mods/gameserver/taskmanager/AiTaskManager
   #564 = NameAndType        #149:#566    // getInstance:()Lext/mods/gameserver/taskmanager/AiTaskManager;
   #565 = Utf8               ext/mods/gameserver/taskmanager/AiTaskManager
   #566 = Utf8               ()Lext/mods/gameserver/taskmanager/AiTaskManager;
   #567 = Methodref          #563.#568    // ext/mods/gameserver/taskmanager/AiTaskManager.remove:(Lext/mods/gameserver/model/actor/Npc;)V
   #568 = NameAndType        #569:#72     // remove:(Lext/mods/gameserver/model/actor/Npc;)V
   #569 = Utf8               remove
   #570 = Methodref          #571.#572    // ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #571 = Class              #573         // ext/mods/gameserver/taskmanager/DecayTaskManager
   #572 = NameAndType        #149:#574    // getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #573 = Utf8               ext/mods/gameserver/taskmanager/DecayTaskManager
   #574 = Utf8               ()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #575 = Methodref          #78.#576     // ext/mods/gameserver/model/actor/template/NpcTemplate.getCorpseTime:()I
   #576 = NameAndType        #577:#121    // getCorpseTime:()I
   #577 = Utf8               getCorpseTime
   #578 = Methodref          #571.#579    // ext/mods/gameserver/taskmanager/DecayTaskManager.add:(Lext/mods/gameserver/model/actor/Creature;I)V
   #579 = NameAndType        #580:#581    // add:(Lext/mods/gameserver/model/actor/Creature;I)V
   #580 = Utf8               add
   #581 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
   #582 = Fieldref           #318.#583    // ext/mods/gameserver/enums/EventHandler.MY_DYING:Lext/mods/gameserver/enums/EventHandler;
   #583 = NameAndType        #584:#322    // MY_DYING:Lext/mods/gameserver/enums/EventHandler;
   #584 = Utf8               MY_DYING
   #585 = InvokeDynamic      #4:#586      // #4:run:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
   #586 = NameAndType        #587:#588    // run:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
   #587 = Utf8               run
   #588 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
   #589 = Long               3000l
   #591 = Methodref          #592.#593    // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #592 = Class              #594         // ext/mods/commons/pool/ThreadPool
   #593 = NameAndType        #595:#596    // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #594 = Utf8               ext/mods/commons/pool/ThreadPool
   #595 = Utf8               schedule
   #596 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #597 = Fieldref           #318.#598    // ext/mods/gameserver/enums/EventHandler.PARTY_DIED:Lext/mods/gameserver/enums/EventHandler;
   #598 = NameAndType        #599:#322    // PARTY_DIED:Lext/mods/gameserver/enums/EventHandler;
   #599 = Utf8               PARTY_DIED
   #600 = Methodref          #327.#601    // ext/mods/gameserver/scripting/Quest.onPartyDied:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;)V
   #601 = NameAndType        #602:#603    // onPartyDied:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;)V
   #602 = Utf8               onPartyDied
   #603 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;)V
   #604 = InvokeDynamic      #5:#605      // #5:accept:()Ljava/util/function/Consumer;
   #605 = NameAndType        #244:#606    // accept:()Ljava/util/function/Consumer;
   #606 = Utf8               ()Ljava/util/function/Consumer;
   #607 = InterfaceMethodref #516.#608    // java/util/Set.forEach:(Ljava/util/function/Consumer;)V
   #608 = NameAndType        #609:#610    // forEach:(Ljava/util/function/Consumer;)V
   #609 = Utf8               forEach
   #610 = Utf8               (Ljava/util/function/Consumer;)V
   #611 = InvokeDynamic      #6:#612      // #6:accept:(Lext/mods/gameserver/model/actor/Npc;[Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
   #612 = NameAndType        #244:#613    // accept:(Lext/mods/gameserver/model/actor/Npc;[Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
   #613 = Utf8               (Lext/mods/gameserver/model/actor/Npc;[Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
   #614 = Fieldref           #13.#615     // ext/mods/gameserver/model/actor/Npc._spawn:Lext/mods/gameserver/model/spawn/ASpawn;
   #615 = NameAndType        #616:#617    // _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
   #616 = Utf8               _spawn
   #617 = Utf8               Lext/mods/gameserver/model/spawn/ASpawn;
   #618 = Methodref          #619.#620    // ext/mods/gameserver/model/spawn/ASpawn.onDie:(Lext/mods/gameserver/model/actor/Npc;)V
   #619 = Class              #621         // ext/mods/gameserver/model/spawn/ASpawn
   #620 = NameAndType        #622:#72     // onDie:(Lext/mods/gameserver/model/actor/Npc;)V
   #621 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
   #622 = Utf8               onDie
   #623 = Methodref          #2.#624      // ext/mods/gameserver/model/actor/Creature.onSpawn:()V
   #624 = NameAndType        #625:#11     // onSpawn:()V
   #625 = Utf8               onSpawn
   #626 = Methodref          #208.#627    // ext/mods/gameserver/model/actor/ai/type/NpcAI.cleanupForNextSpawn:()V
   #627 = NameAndType        #628:#11     // cleanupForNextSpawn:()V
   #628 = Utf8               cleanupForNextSpawn
   #629 = Fieldref           #630.#631    // ext/mods/Config.NPC_SOULSHOT:Z
   #630 = Class              #632         // ext/mods/Config
   #631 = NameAndType        #633:#54     // NPC_SOULSHOT:Z
   #632 = Utf8               ext/mods/Config
   #633 = Utf8               NPC_SOULSHOT
   #634 = Methodref          #78.#635     // ext/mods/gameserver/model/actor/template/NpcTemplate.getAiParams:()Lext/mods/gameserver/model/memo/NpcMemo;
   #635 = NameAndType        #636:#637    // getAiParams:()Lext/mods/gameserver/model/memo/NpcMemo;
   #636 = Utf8               getAiParams
   #637 = Utf8               ()Lext/mods/gameserver/model/memo/NpcMemo;
   #638 = String             #639         // SoulShot
   #639 = Utf8               SoulShot
   #640 = Methodref          #641.#642    // ext/mods/gameserver/model/memo/NpcMemo.getInteger:(Ljava/lang/String;I)I
   #641 = Class              #643         // ext/mods/gameserver/model/memo/NpcMemo
   #642 = NameAndType        #644:#645    // getInteger:(Ljava/lang/String;I)I
   #643 = Utf8               ext/mods/gameserver/model/memo/NpcMemo
   #644 = Utf8               getInteger
   #645 = Utf8               (Ljava/lang/String;I)I
   #646 = Fieldref           #630.#647    // ext/mods/Config.NPC_SPIRITSHOT:Z
   #647 = NameAndType        #648:#54     // NPC_SPIRITSHOT:Z
   #648 = Utf8               NPC_SPIRITSHOT
   #649 = String             #650         // SpiritShot
   #650 = Utf8               SpiritShot
   #651 = Methodref          #13.#238     // ext/mods/gameserver/model/actor/Npc.setWalkOrRun:(Z)V
   #652 = Methodref          #13.#653     // ext/mods/gameserver/model/actor/Npc.getRegion:()Lext/mods/gameserver/model/WorldRegion;
   #653 = NameAndType        #654:#655    // getRegion:()Lext/mods/gameserver/model/WorldRegion;
   #654 = Utf8               getRegion
   #655 = Utf8               ()Lext/mods/gameserver/model/WorldRegion;
   #656 = Methodref          #657.#658    // ext/mods/gameserver/model/WorldRegion.isActive:()Z
   #657 = Class              #659         // ext/mods/gameserver/model/WorldRegion
   #658 = NameAndType        #660:#94     // isActive:()Z
   #659 = Utf8               ext/mods/gameserver/model/WorldRegion
   #660 = Utf8               isActive
   #661 = Methodref          #78.#662     // ext/mods/gameserver/model/actor/template/NpcTemplate.isNoSleepMode:()Z
   #662 = NameAndType        #663:#94     // isNoSleepMode:()Z
   #663 = Utf8               isNoSleepMode
   #664 = Methodref          #13.#665     // ext/mods/gameserver/model/actor/Npc.isInMyTerritory:()Z
   #665 = NameAndType        #666:#94     // isInMyTerritory:()Z
   #666 = Utf8               isInMyTerritory
   #667 = Methodref          #563.#668    // ext/mods/gameserver/taskmanager/AiTaskManager.add:(Lext/mods/gameserver/model/actor/Npc;)V
   #668 = NameAndType        #580:#72     // add:(Lext/mods/gameserver/model/actor/Npc;)V
   #669 = Fieldref           #318.#670    // ext/mods/gameserver/enums/EventHandler.CREATED:Lext/mods/gameserver/enums/EventHandler;
   #670 = NameAndType        #671:#322    // CREATED:Lext/mods/gameserver/enums/EventHandler;
   #671 = Utf8               CREATED
   #672 = Methodref          #327.#673    // ext/mods/gameserver/scripting/Quest.onCreated:(Lext/mods/gameserver/model/actor/Npc;)V
   #673 = NameAndType        #674:#72     // onCreated:(Lext/mods/gameserver/model/actor/Npc;)V
   #674 = Utf8               onCreated
   #675 = Methodref          #619.#676    // ext/mods/gameserver/model/spawn/ASpawn.onSpawn:(Lext/mods/gameserver/model/actor/Npc;)V
   #676 = NameAndType        #625:#72     // onSpawn:(Lext/mods/gameserver/model/actor/Npc;)V
   #677 = Methodref          #300.#678    // ext/mods/extensions/listener/manager/NpcListenerManager.notifyNpcSpawn:(Lext/mods/gameserver/model/actor/Npc;)V
   #678 = NameAndType        #679:#72     // notifyNpcSpawn:(Lext/mods/gameserver/model/actor/Npc;)V
   #679 = Utf8               notifyNpcSpawn
   #680 = Methodref          #13.#681     // ext/mods/gameserver/model/actor/Npc.isDecayed:()Z
   #681 = NameAndType        #682:#94     // isDecayed:()Z
   #682 = Utf8               isDecayed
   #683 = Methodref          #13.#684     // ext/mods/gameserver/model/actor/Npc.setIsDead:(Z)V
   #684 = NameAndType        #685:#182    // setIsDead:(Z)V
   #685 = Utf8               setIsDead
   #686 = Methodref          #13.#687     // ext/mods/gameserver/model/actor/Npc.setDecayed:(Z)V
   #687 = NameAndType        #688:#182    // setDecayed:(Z)V
   #688 = Utf8               setDecayed
   #689 = Fieldref           #318.#690    // ext/mods/gameserver/enums/EventHandler.DECAYED:Lext/mods/gameserver/enums/EventHandler;
   #690 = NameAndType        #691:#322    // DECAYED:Lext/mods/gameserver/enums/EventHandler;
   #691 = Utf8               DECAYED
   #692 = Methodref          #327.#693    // ext/mods/gameserver/scripting/Quest.onDecayed:(Lext/mods/gameserver/model/actor/Npc;)V
   #693 = NameAndType        #694:#72     // onDecayed:(Lext/mods/gameserver/model/actor/Npc;)V
   #694 = Utf8               onDecayed
   #695 = Methodref          #78.#696     // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:()Ljava/util/Map;
   #696 = NameAndType        #325:#408    // getEventQuests:()Ljava/util/Map;
   #697 = InterfaceMethodref #416.#85     // java/util/Collection.iterator:()Ljava/util/Iterator;
   #698 = Class              #699         // ext/mods/gameserver/scripting/script/ai/individual/DefaultNpc
   #699 = Utf8               ext/mods/gameserver/scripting/script/ai/individual/DefaultNpc
   #700 = Methodref          #327.#701    // ext/mods/gameserver/scripting/Quest.cancelQuestTimers:(Lext/mods/gameserver/model/actor/Npc;)V
   #701 = NameAndType        #702:#72     // cancelQuestTimers:(Lext/mods/gameserver/model/actor/Npc;)V
   #702 = Utf8               cancelQuestTimers
   #703 = Methodref          #2.#704      // ext/mods/gameserver/model/actor/Creature.onDecay:()V
   #704 = NameAndType        #705:#11     // onDecay:()V
   #705 = Utf8               onDecay
   #706 = Methodref          #619.#707    // ext/mods/gameserver/model/spawn/ASpawn.onDecay:(Lext/mods/gameserver/model/actor/Npc;)V
   #707 = NameAndType        #705:#72     // onDecay:(Lext/mods/gameserver/model/actor/Npc;)V
   #708 = Methodref          #300.#709    // ext/mods/extensions/listener/manager/NpcListenerManager.notifyNpcDecay:(Lext/mods/gameserver/model/actor/Npc;)V
   #709 = NameAndType        #710:#72     // notifyNpcDecay:(Lext/mods/gameserver/model/actor/Npc;)V
   #710 = Utf8               notifyNpcDecay
   #711 = Methodref          #13.#704     // ext/mods/gameserver/model/actor/Npc.onDecay:()V
   #712 = Methodref          #571.#713    // ext/mods/gameserver/taskmanager/DecayTaskManager.cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
   #713 = NameAndType        #714:#546    // cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
   #714 = Utf8               cancel
   #715 = Methodref          #13.#716     // ext/mods/gameserver/model/actor/Npc.stopAllEffects:()V
   #716 = NameAndType        #717:#11     // stopAllEffects:()V
   #717 = Utf8               stopAllEffects
   #718 = Methodref          #2.#719      // ext/mods/gameserver/model/actor/Creature.deleteMe:()V
   #719 = NameAndType        #720:#11     // deleteMe:()V
   #720 = Utf8               deleteMe
   #721 = Methodref          #2.#722      // ext/mods/gameserver/model/actor/Creature.isAttackingDisabled:()Z
   #722 = NameAndType        #723:#94     // isAttackingDisabled:()Z
   #723 = Utf8               isAttackingDisabled
   #724 = Methodref          #13.#725     // ext/mods/gameserver/model/actor/Npc.isCoreAiDisabled:()Z
   #725 = NameAndType        #726:#94     // isCoreAiDisabled:()Z
   #726 = Utf8               isCoreAiDisabled
   #727 = Methodref          #2.#728      // ext/mods/gameserver/model/actor/Creature.forceDecay:()V
   #728 = NameAndType        #729:#11     // forceDecay:()V
   #729 = Utf8               forceDecay
   #730 = Methodref          #208.#731    // ext/mods/gameserver/model/actor/ai/type/NpcAI.setBackToPeace:()V
   #731 = NameAndType        #732:#11     // setBackToPeace:()V
   #732 = Utf8               setBackToPeace
   #733 = Methodref          #208.#734    // ext/mods/gameserver/model/actor/ai/type/NpcAI.stopRoute:()V
   #734 = NameAndType        #735:#11     // stopRoute:()V
   #735 = Utf8               stopRoute
   #736 = Methodref          #13.#737     // ext/mods/gameserver/model/actor/Npc.abortAll:(Z)V
   #737 = NameAndType        #738:#182    // abortAll:(Z)V
   #738 = Utf8               abortAll
   #739 = Methodref          #2.#740      // ext/mods/gameserver/model/actor/Creature.instantTeleportTo:(IIII)V
   #740 = NameAndType        #741:#742    // instantTeleportTo:(IIII)V
   #741 = Utf8               instantTeleportTo
   #742 = Utf8               (IIII)V
   #743 = Methodref          #2.#744      // ext/mods/gameserver/model/actor/Creature.teleportTo:(IIII)Z
   #744 = NameAndType        #745:#746    // teleportTo:(IIII)Z
   #745 = Utf8               teleportTo
   #746 = Utf8               (IIII)Z
   #747 = Methodref          #13.#748     // ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #748 = NameAndType        #749:#368    // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #749 = Utf8               broadcastPacket
   #750 = Fieldref           #13.#751     // ext/mods/gameserver/model/actor/Npc._spawnLoc:Lext/mods/gameserver/model/location/SpawnLocation;
   #751 = NameAndType        #752:#753    // _spawnLoc:Lext/mods/gameserver/model/location/SpawnLocation;
   #752 = Utf8               _spawnLoc
   #753 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
   #754 = Fieldref           #13.#755     // ext/mods/gameserver/model/actor/Npc._master:Lext/mods/gameserver/model/actor/Npc;
   #755 = NameAndType        #756:#757    // _master:Lext/mods/gameserver/model/actor/Npc;
   #756 = Utf8               _master
   #757 = Utf8               Lext/mods/gameserver/model/actor/Npc;
   #758 = Fieldref           #13.#759     // ext/mods/gameserver/model/actor/Npc._minions:Ljava/util/Set;
   #759 = NameAndType        #760:#761    // _minions:Ljava/util/Set;
   #760 = Utf8               _minions
   #761 = Utf8               Ljava/util/Set;
   #762 = Methodref          #763.#764    // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #763 = Class              #765         // java/util/concurrent/ConcurrentHashMap
   #764 = NameAndType        #766:#767    // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #765 = Utf8               java/util/concurrent/ConcurrentHashMap
   #766 = Utf8               newKeySet
   #767 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #768 = Methodref          #13.#769     // ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
   #769 = NameAndType        #770:#771    // getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
   #770 = Utf8               getSpawn
   #771 = Utf8               ()Lext/mods/gameserver/model/spawn/ASpawn;
   #772 = Methodref          #619.#773    // ext/mods/gameserver/model/spawn/ASpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #773 = NameAndType        #774:#775    // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #774 = Utf8               getSpawnLocation
   #775 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #776 = Methodref          #13.#777     // ext/mods/gameserver/model/actor/Npc.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
   #777 = NameAndType        #745:#778    // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
   #778 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
   #779 = Methodref          #619.#780    // ext/mods/gameserver/model/spawn/ASpawn.isInMyTerritory:(Lext/mods/gameserver/model/WorldObject;)Z
   #780 = NameAndType        #666:#781    // isInMyTerritory:(Lext/mods/gameserver/model/WorldObject;)Z
   #781 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #782 = Methodref          #78.#783     // ext/mods/gameserver/model/actor/template/NpcTemplate.isNoRespawn:()Z
   #783 = NameAndType        #784:#94     // isNoRespawn:()Z
   #784 = Utf8               isNoRespawn
   #785 = Fieldref           #13.#786     // ext/mods/gameserver/model/actor/Npc.LOGGER:Lext/mods/commons/logging/CLogger;
   #786 = NameAndType        #787:#788    // LOGGER:Lext/mods/commons/logging/CLogger;
   #787 = Utf8               LOGGER
   #788 = Utf8               Lext/mods/commons/logging/CLogger;
   #789 = Methodref          #13.#152     // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
   #790 = InvokeDynamic      #7:#202      // #7:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #791 = Methodref          #792.#793    // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #792 = Class              #794         // ext/mods/commons/logging/CLogger
   #793 = NameAndType        #795:#796    // info:(Ljava/lang/Object;)V
   #794 = Utf8               ext/mods/commons/logging/CLogger
   #795 = Utf8               info
   #796 = Utf8               (Ljava/lang/Object;)V
   #797 = InvokeDynamic      #8:#798      // #8:makeConcatWithConstants:(Ljava/lang/String;IJ)Ljava/lang/String;
   #798 = NameAndType        #203:#799    // makeConcatWithConstants:(Ljava/lang/String;IJ)Ljava/lang/String;
   #799 = Utf8               (Ljava/lang/String;IJ)Ljava/lang/String;
   #800 = Fieldref           #13.#801     // ext/mods/gameserver/model/actor/Npc._respawnTask:Ljava/util/concurrent/ScheduledFuture;
   #801 = NameAndType        #802:#803    // _respawnTask:Ljava/util/concurrent/ScheduledFuture;
   #802 = Utf8               _respawnTask
   #803 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #804 = InvokeDynamic      #9:#202      // #9:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #805 = InvokeDynamic      #10:#806     // #10:run:(Lext/mods/gameserver/model/actor/Npc;)Ljava/lang/Runnable;
   #806 = NameAndType        #587:#807    // run:(Lext/mods/gameserver/model/actor/Npc;)Ljava/lang/Runnable;
   #807 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)Ljava/lang/Runnable;
   #808 = InvokeDynamic      #11:#202     // #11:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #809 = Class              #810         // ext/mods/gameserver/model/actor/instance/Monster
   #810 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #811 = Methodref          #809.#812    // ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #812 = NameAndType        #813:#814    // getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #813 = Utf8               getSpoilState
   #814 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #815 = Methodref          #816.#817    // ext/mods/gameserver/model/actor/container/monster/SpoilState.isSpoiled:()Z
   #816 = Class              #818         // ext/mods/gameserver/model/actor/container/monster/SpoilState
   #817 = NameAndType        #819:#94     // isSpoiled:()Z
   #818 = Utf8               ext/mods/gameserver/model/actor/container/monster/SpoilState
   #819 = Utf8               isSpoiled
   #820 = Methodref          #809.#821    // ext/mods/gameserver/model/actor/instance/Monster.getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
   #821 = NameAndType        #822:#823    // getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
   #822 = Utf8               getSeedState
   #823 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/SeedState;
   #824 = Methodref          #825.#826    // ext/mods/gameserver/model/actor/container/monster/SeedState.isSeeded:()Z
   #825 = Class              #827         // ext/mods/gameserver/model/actor/container/monster/SeedState
   #826 = NameAndType        #828:#94     // isSeeded:()Z
   #827 = Utf8               ext/mods/gameserver/model/actor/container/monster/SeedState
   #828 = Utf8               isSeeded
   #829 = InvokeDynamic      #12:#806     // #12:run:(Lext/mods/gameserver/model/actor/Npc;)Ljava/lang/Runnable;
   #830 = InterfaceMethodref #831.#832    // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
   #831 = Class              #833         // java/util/concurrent/ScheduledFuture
   #832 = NameAndType        #714:#834    // cancel:(Z)Z
   #833 = Utf8               java/util/concurrent/ScheduledFuture
   #834 = Utf8               (Z)Z
   #835 = InvokeDynamic      #13:#806     // #13:run:(Lext/mods/gameserver/model/actor/Npc;)Ljava/lang/Runnable;
   #836 = Methodref          #7.#837      // java/util/concurrent/atomic/AtomicBoolean.get:()Z
   #837 = NameAndType        #293:#94     // get:()Z
   #838 = Methodref          #7.#839      // java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
   #839 = NameAndType        #840:#182    // set:(Z)V
   #840 = Utf8               set
   #841 = Fieldref           #13.#842     // ext/mods/gameserver/model/actor/Npc._readyForRespawn:Z
   #842 = NameAndType        #843:#54     // _readyForRespawn:Z
   #843 = Utf8               _readyForRespawn
   #844 = Methodref          #13.#845     // ext/mods/gameserver/model/actor/Npc.updateAbnormalEffect:()V
   #845 = NameAndType        #846:#11     // updateAbnormalEffect:()V
   #846 = Utf8               updateAbnormalEffect
   #847 = Methodref          #193.#848    // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
   #848 = NameAndType        #849:#850    // isDigit:(Ljava/lang/String;)Z
   #849 = Utf8               isDigit
   #850 = Utf8               (Ljava/lang/String;)Z
   #851 = Methodref          #35.#852     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #852 = NameAndType        #853:#854    // parseInt:(Ljava/lang/String;)I
   #853 = Utf8               parseInt
   #854 = Utf8               (Ljava/lang/String;)I
   #855 = Methodref          #856.#857    // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #856 = Class              #858         // ext/mods/gameserver/data/manager/CastleManager
   #857 = NameAndType        #149:#859    // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #858 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #859 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #860 = Methodref          #856.#861    // ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #861 = NameAndType        #862:#863    // getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #862 = Utf8               getCastleById
   #863 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle;
   #864 = Methodref          #13.#865     // ext/mods/gameserver/model/actor/Npc.setResidence:(Lext/mods/gameserver/model/residence/Residence;)V
   #865 = NameAndType        #866:#867    // setResidence:(Lext/mods/gameserver/model/residence/Residence;)V
   #866 = Utf8               setResidence
   #867 = Utf8               (Lext/mods/gameserver/model/residence/Residence;)V
   #868 = Methodref          #869.#870    // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #869 = Class              #871         // ext/mods/gameserver/data/manager/ClanHallManager
   #870 = NameAndType        #149:#872    // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #871 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
   #872 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
   #873 = Methodref          #869.#874    // ext/mods/gameserver/data/manager/ClanHallManager.getSiegableHall:(I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #874 = NameAndType        #875:#876    // getSiegableHall:(I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #875 = Utf8               getSiegableHall
   #876 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #877 = Class              #878         // ext/mods/gameserver/model/residence/castle/Castle
   #878 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #879 = Class              #880         // ext/mods/gameserver/model/residence/clanhall/ClanHall
   #880 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
   #881 = Class              #882         // ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #882 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #883 = Methodref          #240.#884    // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
   #884 = NameAndType        #885:#94     // isClanLeader:()Z
   #885 = Utf8               isClanLeader
   #886 = Methodref          #887.#888    // ext/mods/gameserver/model/residence/Residence.getOwnerId:()I
   #887 = Class              #889         // ext/mods/gameserver/model/residence/Residence
   #888 = NameAndType        #890:#121    // getOwnerId:()I
   #889 = Utf8               ext/mods/gameserver/model/residence/Residence
   #890 = Utf8               getOwnerId
   #891 = Methodref          #240.#892    // ext/mods/gameserver/model/actor/Player.getClanId:()I
   #892 = NameAndType        #893:#121    // getClanId:()I
   #893 = Utf8               getClanId
   #894 = Fieldref           #13.#895     // ext/mods/gameserver/model/actor/Npc._clanId:I
   #895 = NameAndType        #896:#21     // _clanId:I
   #896 = Utf8               _clanId
   #897 = Fieldref           #13.#898     // ext/mods/gameserver/model/actor/Npc._isCoreAiDisabled:Z
   #898 = NameAndType        #899:#54     // _isCoreAiDisabled:Z
   #899 = Utf8               _isCoreAiDisabled
   #900 = Methodref          #901.#902    // ext/mods/gameserver/handler/BypassHandler.getInstance:()Lext/mods/gameserver/handler/BypassHandler;
   #901 = Class              #903         // ext/mods/gameserver/handler/BypassHandler
   #902 = NameAndType        #149:#904    // getInstance:()Lext/mods/gameserver/handler/BypassHandler;
   #903 = Utf8               ext/mods/gameserver/handler/BypassHandler
   #904 = Utf8               ()Lext/mods/gameserver/handler/BypassHandler;
   #905 = Methodref          #901.#906    // ext/mods/gameserver/handler/BypassHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IBypassHandler;
   #906 = NameAndType        #907:#908    // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IBypassHandler;
   #907 = Utf8               getHandler
   #908 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/IBypassHandler;
   #909 = InterfaceMethodref #910.#911    // ext/mods/gameserver/handler/IBypassHandler.useBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
   #910 = Class              #912         // ext/mods/gameserver/handler/IBypassHandler
   #911 = NameAndType        #913:#914    // useBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
   #912 = Utf8               ext/mods/gameserver/handler/IBypassHandler
   #913 = Utf8               useBypass
   #914 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
   #915 = Fieldref           #916.#917    // ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #916 = Class              #918         // ext/mods/gameserver/enums/actors/NpcTalkCond
   #917 = NameAndType        #919:#920    // OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #918 = Utf8               ext/mods/gameserver/enums/actors/NpcTalkCond
   #919 = Utf8               OWNER
   #920 = Utf8               Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #921 = InvokeDynamic      #14:#922     // #14:makeConcatWithConstants:(I)Ljava/lang/String;
   #922 = NameAndType        #203:#923    // makeConcatWithConstants:(I)Ljava/lang/String;
   #923 = Utf8               (I)Ljava/lang/String;
   #924 = InvokeDynamic      #15:#925     // #15:makeConcatWithConstants:(II)Ljava/lang/String;
   #925 = NameAndType        #203:#926    // makeConcatWithConstants:(II)Ljava/lang/String;
   #926 = Utf8               (II)Ljava/lang/String;
   #927 = Methodref          #928.#929    // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #928 = Class              #930         // ext/mods/gameserver/data/HTMLData
   #929 = NameAndType        #149:#931    // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #930 = Utf8               ext/mods/gameserver/data/HTMLData
   #931 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #932 = Methodref          #240.#933    // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #933 = NameAndType        #934:#935    // getLocale:()Ljava/util/Locale;
   #934 = Utf8               getLocale
   #935 = Utf8               ()Ljava/util/Locale;
   #936 = Methodref          #928.#937    // ext/mods/gameserver/data/HTMLData.exists:(Ljava/util/Locale;Ljava/lang/String;)Z
   #937 = NameAndType        #938:#939    // exists:(Ljava/util/Locale;Ljava/lang/String;)Z
   #938 = Utf8               exists
   #939 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Z
   #940 = String             #941         // html/npcdefault.htm
   #941 = Utf8               html/npcdefault.htm
   #942 = Class              #943         // ext/mods/gameserver/network/serverpackets/NpcSay
   #943 = Utf8               ext/mods/gameserver/network/serverpackets/NpcSay
   #944 = Fieldref           #945.#946    // ext/mods/gameserver/enums/SayType.ALL:Lext/mods/gameserver/enums/SayType;
   #945 = Class              #947         // ext/mods/gameserver/enums/SayType
   #946 = NameAndType        #948:#949    // ALL:Lext/mods/gameserver/enums/SayType;
   #947 = Utf8               ext/mods/gameserver/enums/SayType
   #948 = Utf8               ALL
   #949 = Utf8               Lext/mods/gameserver/enums/SayType;
   #950 = Methodref          #942.#951    // ext/mods/gameserver/network/serverpackets/NpcSay."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #951 = NameAndType        #5:#952      // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #952 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #953 = Methodref          #954.#955    // ext/mods/gameserver/network/NpcStringId.getMessage:()Ljava/lang/String;
   #954 = Class              #956         // ext/mods/gameserver/network/NpcStringId
   #955 = NameAndType        #957:#165    // getMessage:()Ljava/lang/String;
   #956 = Utf8               ext/mods/gameserver/network/NpcStringId
   #957 = Utf8               getMessage
   #958 = Methodref          #13.#959     // ext/mods/gameserver/model/actor/Npc.broadcastNpcSay:(Ljava/lang/String;)V
   #959 = NameAndType        #960:#169    // broadcastNpcSay:(Ljava/lang/String;)V
   #960 = Utf8               broadcastNpcSay
   #961 = Methodref          #954.#962    // ext/mods/gameserver/network/NpcStringId.getMessage:([Ljava/lang/Object;)Ljava/lang/String;
   #962 = NameAndType        #957:#963    // getMessage:([Ljava/lang/Object;)Ljava/lang/String;
   #963 = Utf8               ([Ljava/lang/Object;)Ljava/lang/String;
   #964 = Fieldref           #945.#965    // ext/mods/gameserver/enums/SayType.SHOUT:Lext/mods/gameserver/enums/SayType;
   #965 = NameAndType        #966:#949    // SHOUT:Lext/mods/gameserver/enums/SayType;
   #966 = Utf8               SHOUT
   #967 = Methodref          #13.#968     // ext/mods/gameserver/model/actor/Npc.broadcastNpcShout:(Ljava/lang/String;)V
   #968 = NameAndType        #969:#169    // broadcastNpcShout:(Ljava/lang/String;)V
   #969 = Utf8               broadcastNpcShout
   #970 = Class              #971         // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
   #971 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
   #972 = Methodref          #970.#973    // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
   #973 = NameAndType        #5:#974      // "<init>":(Ljava/lang/String;I)V
   #974 = Utf8               (Ljava/lang/String;I)V
   #975 = Methodref          #13.#976     // ext/mods/gameserver/model/actor/Npc.broadcastOnScreen:(ILjava/lang/String;)V
   #976 = NameAndType        #977:#978    // broadcastOnScreen:(ILjava/lang/String;)V
   #977 = Utf8               broadcastOnScreen
   #978 = Utf8               (ILjava/lang/String;)V
   #979 = InvokeDynamic      #16:#202     // #16:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #980 = Methodref          #928.#981    // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #981 = NameAndType        #982:#983    // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #982 = Utf8               getHtm
   #983 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #984 = Class              #985         // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #985 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #986 = Methodref          #984.#987    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #987 = NameAndType        #5:#298      // "<init>":(I)V
   #988 = Methodref          #984.#989    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
   #989 = NameAndType        #990:#169    // setHtml:(Ljava/lang/String;)V
   #990 = Utf8               setHtml
   #991 = Fieldref           #992.#993    // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #992 = Class              #994         // ext/mods/gameserver/network/serverpackets/ActionFailed
   #993 = NameAndType        #995:#996    // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #994 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #995 = Utf8               STATIC_PACKET
   #996 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #997 = Class              #998         // java/lang/StringBuilder
   #998 = Utf8               java/lang/StringBuilder
   #999 = Methodref          #997.#10     // java/lang/StringBuilder."<init>":()V
  #1000 = String             #1001        // <html><body>&$650;<br><br>
  #1001 = Utf8               <html><body>&$650;<br><br>
  #1002 = Methodref          #997.#1003   // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #1003 = NameAndType        #1004:#1005  // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #1004 = Utf8               append
  #1005 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #1006 = Methodref          #35.#1007    // java/lang/Integer.intValue:()I
  #1007 = NameAndType        #1008:#121   // intValue:()I
  #1008 = Utf8               intValue
  #1009 = Class              #1010        // java/lang/Object
  #1010 = Utf8               java/lang/Object
  #1011 = String             #1012        // <a action=\"bypass -h npc_
  #1012 = Utf8               <a action=\"bypass -h npc_
  #1013 = Methodref          #35.#1014    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #1014 = NameAndType        #1015:#1016  // valueOf:(I)Ljava/lang/Integer;
  #1015 = Utf8               valueOf
  #1016 = Utf8               (I)Ljava/lang/Integer;
  #1017 = String             #1018        // _observe_group
  #1018 = Utf8               _observe_group
  #1019 = String             #1020        // \">&$
  #1020 = Utf8               \">&$
  #1021 = String             #1022        // ;</a><br1>
  #1022 = Utf8               ;</a><br1>
  #1023 = Methodref          #193.#1024   // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #1024 = NameAndType        #1004:#1025  // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #1025 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #1026 = String             #1027        // </body></html>
  #1027 = Utf8               </body></html>
  #1028 = Methodref          #997.#1029   // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #1029 = NameAndType        #1030:#165   // toString:()Ljava/lang/String;
  #1030 = Utf8               toString
  #1031 = Methodref          #1032.#1033  // ext/mods/gameserver/data/xml/TeleportData.getInstance:()Lext/mods/gameserver/data/xml/TeleportData;
  #1032 = Class              #1034        // ext/mods/gameserver/data/xml/TeleportData
  #1033 = NameAndType        #149:#1035   // getInstance:()Lext/mods/gameserver/data/xml/TeleportData;
  #1034 = Utf8               ext/mods/gameserver/data/xml/TeleportData
  #1035 = Utf8               ()Lext/mods/gameserver/data/xml/TeleportData;
  #1036 = Methodref          #1032.#1037  // ext/mods/gameserver/data/xml/TeleportData.getTeleports:(I)Ljava/util/List;
  #1037 = NameAndType        #1038:#1039  // getTeleports:(I)Ljava/util/List;
  #1038 = Utf8               getTeleports
  #1039 = Utf8               (I)Ljava/util/List;
  #1040 = String             #1041        // <html><body>&$556;<br><br>
  #1041 = Utf8               <html><body>&$556;<br><br>
  #1042 = Class              #1043        // ext/mods/gameserver/model/location/TeleportLocation
  #1043 = Utf8               ext/mods/gameserver/model/location/TeleportLocation
  #1044 = Methodref          #1042.#1045  // ext/mods/gameserver/model/location/TeleportLocation.getType:()Lext/mods/gameserver/enums/TeleportType;
  #1045 = NameAndType        #1046:#1047  // getType:()Lext/mods/gameserver/enums/TeleportType;
  #1046 = Utf8               getType
  #1047 = Utf8               ()Lext/mods/gameserver/enums/TeleportType;
  #1048 = String             #1049        // _teleport
  #1049 = Utf8               _teleport
  #1050 = String             #1051        // \" msg=\"811;
  #1051 = Utf8               \" msg=\"811;
  #1052 = Methodref          #1053.#1054  // java/util/Locale.getLanguage:()Ljava/lang/String;
  #1053 = Class              #1055        // java/util/Locale
  #1054 = NameAndType        #1056:#165   // getLanguage:()Ljava/lang/String;
  #1055 = Utf8               java/util/Locale
  #1056 = Utf8               getLanguage
  #1057 = String             #1058        // en
  #1058 = Utf8               en
  #1059 = Methodref          #1042.#1060  // ext/mods/gameserver/model/location/TeleportLocation.getDescEn:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #1060 = NameAndType        #1061:#1062  // getDescEn:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #1061 = Utf8               getDescEn
  #1062 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #1063 = Methodref          #1042.#1064  // ext/mods/gameserver/model/location/TeleportLocation.getDescRu:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #1064 = NameAndType        #1065:#1062  // getDescRu:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #1065 = Utf8               getDescRu
  #1066 = String             #1067        // \">
  #1067 = Utf8               \">
  #1068 = Fieldref           #630.#1069   // ext/mods/Config.FREE_TELEPORT:Z
  #1069 = NameAndType        #1070:#54    // FREE_TELEPORT:Z
  #1070 = Utf8               FREE_TELEPORT
  #1071 = Methodref          #240.#1072   // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #1072 = NameAndType        #111:#1073   // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #1073 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #1074 = Methodref          #1075.#403   // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #1075 = Class              #1076        // ext/mods/gameserver/model/actor/status/PlayerStatus
  #1076 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #1077 = Fieldref           #630.#1078   // ext/mods/Config.LVL_FREE_TELEPORT:I
  #1078 = NameAndType        #1079:#21    // LVL_FREE_TELEPORT:I
  #1079 = Utf8               LVL_FREE_TELEPORT
  #1080 = Methodref          #1042.#1081  // ext/mods/gameserver/model/location/TeleportLocation.getCalculatedPriceCount:(Lext/mods/gameserver/model/actor/Player;)I
  #1081 = NameAndType        #1082:#1083  // getCalculatedPriceCount:(Lext/mods/gameserver/model/actor/Player;)I
  #1082 = Utf8               getCalculatedPriceCount
  #1083 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #1084 = String             #1085        //  -
  #1085 = Utf8                -
  #1086 = String             #1087        //  &#
  #1087 = Utf8                &#
  #1088 = Methodref          #1042.#1089  // ext/mods/gameserver/model/location/TeleportLocation.getPriceId:()I
  #1089 = NameAndType        #1090:#121   // getPriceId:()I
  #1090 = Utf8               getPriceId
  #1091 = String             #1092        // ;
  #1092 = Utf8               ;
  #1093 = String             #1094        // </a><br1>
  #1094 = Utf8               </a><br1>
  #1095 = Methodref          #13.#1096    // ext/mods/gameserver/model/actor/Npc.showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #1096 = NameAndType        #354:#1097   // showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
  #1097 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #1098 = Methodref          #13.#1099    // ext/mods/gameserver/model/actor/Npc.getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #1099 = NameAndType        #1100:#1101  // getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #1100 = Utf8               getHtmlPath
  #1101 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #1102 = Methodref          #13.#1103    // ext/mods/gameserver/model/actor/Npc.showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #1103 = NameAndType        #354:#1104   // showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #1104 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #1105 = Methodref          #984.#1106   // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #1106 = NameAndType        #1107:#1108  // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #1107 = Utf8               setFile
  #1108 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #1109 = String             #1110        // %objectId%
  #1110 = Utf8               %objectId%
  #1111 = Methodref          #984.#1112   // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #1112 = NameAndType        #1113:#974   // replace:(Ljava/lang/String;I)V
  #1113 = Utf8               replace
  #1114 = Methodref          #619.#1115   // ext/mods/gameserver/model/spawn/ASpawn.getRandomWalkLocation:(Lext/mods/gameserver/model/actor/Npc;I)Lext/mods/gameserver/model/location/Location;
  #1115 = NameAndType        #1116:#1117  // getRandomWalkLocation:(Lext/mods/gameserver/model/actor/Npc;I)Lext/mods/gameserver/model/location/Location;
  #1116 = Utf8               getRandomWalkLocation
  #1117 = Utf8               (Lext/mods/gameserver/model/actor/Npc;I)Lext/mods/gameserver/model/location/Location;
  #1118 = Methodref          #555.#1119   // ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #1119 = NameAndType        #1120:#1121  // maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #1120 = Utf8               maybeMoveToLocation
  #1121 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
  #1122 = Methodref          #78.#1123    // ext/mods/gameserver/model/actor/template/NpcTemplate.getRewardExp:()D
  #1123 = NameAndType        #1124:#134   // getRewardExp:()D
  #1124 = Utf8               getRewardExp
  #1125 = Fieldref           #630.#1126   // ext/mods/Config.PREMIUM_RATE_XP:D
  #1126 = NameAndType        #1127:#138   // PREMIUM_RATE_XP:D
  #1127 = Utf8               PREMIUM_RATE_XP
  #1128 = Fieldref           #630.#1129   // ext/mods/Config.RATE_XP:D
  #1129 = NameAndType        #1130:#138   // RATE_XP:D
  #1130 = Utf8               RATE_XP
  #1131 = Methodref          #78.#1132    // ext/mods/gameserver/model/actor/template/NpcTemplate.getRewardSp:()D
  #1132 = NameAndType        #1133:#134   // getRewardSp:()D
  #1133 = Utf8               getRewardSp
  #1134 = Fieldref           #630.#1135   // ext/mods/Config.PREMIUM_RATE_SP:D
  #1135 = NameAndType        #1136:#138   // PREMIUM_RATE_SP:D
  #1136 = Utf8               PREMIUM_RATE_SP
  #1137 = Fieldref           #630.#1138   // ext/mods/Config.RATE_SP:D
  #1138 = NameAndType        #1139:#138   // RATE_SP:D
  #1139 = Utf8               RATE_SP
  #1140 = Methodref          #208.#1141   // ext/mods/gameserver/model/actor/ai/type/NpcAI.addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;D)V
  #1141 = NameAndType        #1142:#1143  // addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;D)V
  #1142 = Utf8               addAttackDesire
  #1143 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
  #1144 = Class              #1145        // ext/mods/gameserver/model/item/instance/ItemInstance
  #1145 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #1146 = InvokeDynamic      #17:#1147    // #17:test:([I)Ljava/util/function/Predicate;
  #1147 = NameAndType        #423:#1148   // test:([I)Ljava/util/function/Predicate;
  #1148 = Utf8               ([I)Ljava/util/function/Predicate;
  #1149 = Methodref          #13.#1150    // ext/mods/gameserver/model/actor/Npc.getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
  #1150 = NameAndType        #1151:#1152  // getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
  #1151 = Utf8               getKnownTypeInRadius
  #1152 = Utf8               (Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
  #1153 = InterfaceMethodref #84.#1154    // java/util/List.isEmpty:()Z
  #1154 = NameAndType        #1155:#94    // isEmpty:()Z
  #1155 = Utf8               isEmpty
  #1156 = Fieldref           #318.#1157   // ext/mods/gameserver/enums/EventHandler.SEE_ITEM:Lext/mods/gameserver/enums/EventHandler;
  #1157 = NameAndType        #1158:#322   // SEE_ITEM:Lext/mods/gameserver/enums/EventHandler;
  #1158 = Utf8               SEE_ITEM
  #1159 = Methodref          #327.#1160   // ext/mods/gameserver/scripting/Quest.onSeeItem:(Lext/mods/gameserver/model/actor/Npc;ILjava/util/List;)V
  #1160 = NameAndType        #1161:#1162  // onSeeItem:(Lext/mods/gameserver/model/actor/Npc;ILjava/util/List;)V
  #1161 = Utf8               onSeeItem
  #1162 = Utf8               (Lext/mods/gameserver/model/actor/Npc;ILjava/util/List;)V
  #1163 = Methodref          #1164.#1165  // java/lang/System.currentTimeMillis:()J
  #1164 = Class              #1166        // java/lang/System
  #1165 = NameAndType        #1167:#1168  // currentTimeMillis:()J
  #1166 = Utf8               java/lang/System
  #1167 = Utf8               currentTimeMillis
  #1168 = Utf8               ()J
  #1169 = Long               30000l
  #1171 = Fieldref           #318.#1172   // ext/mods/gameserver/enums/EventHandler.SEE_CREATURE:Lext/mods/gameserver/enums/EventHandler;
  #1172 = NameAndType        #1173:#322   // SEE_CREATURE:Lext/mods/gameserver/enums/EventHandler;
  #1173 = Utf8               SEE_CREATURE
  #1174 = InvokeDynamic      #18:#1175    // #18:accept:(Lext/mods/gameserver/model/actor/Npc;Ljava/util/List;)Ljava/util/function/Consumer;
  #1175 = NameAndType        #244:#1176   // accept:(Lext/mods/gameserver/model/actor/Npc;Ljava/util/List;)Ljava/util/function/Consumer;
  #1176 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Ljava/util/List;)Ljava/util/function/Consumer;
  #1177 = Methodref          #78.#1178    // ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
  #1178 = NameAndType        #1179:#121   // getAggroRange:()I
  #1179 = Utf8               getAggroRange
  #1180 = Methodref          #13.#1181    // ext/mods/gameserver/model/actor/Npc.canAutoAttack:(Lext/mods/gameserver/model/actor/Creature;IZ)Z
  #1181 = NameAndType        #1182:#1183  // canAutoAttack:(Lext/mods/gameserver/model/actor/Creature;IZ)Z
  #1182 = Utf8               canAutoAttack
  #1183 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZ)Z
  #1184 = Class              #1185        // ext/mods/gameserver/model/actor/instance/Door
  #1185 = Utf8               ext/mods/gameserver/model/actor/instance/Door
  #1186 = Methodref          #2.#1187     // ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
  #1187 = NameAndType        #1188:#94    // isAlikeDead:()Z
  #1188 = Utf8               isAlikeDead
  #1189 = Methodref          #208.#1190   // ext/mods/gameserver/model/actor/ai/type/NpcAI.getDesires:()Ljava/util/Set;
  #1190 = NameAndType        #1191:#514   // getDesires:()Ljava/util/Set;
  #1191 = Utf8               getDesires
  #1192 = InterfaceMethodref #516.#417    // java/util/Set.stream:()Ljava/util/stream/Stream;
  #1193 = InvokeDynamic      #19:#1194    // #19:test:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Predicate;
  #1194 = NameAndType        #423:#1195   // test:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Predicate;
  #1195 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Predicate;
  #1196 = Class              #1197        // ext/mods/gameserver/model/actor/ai/Desire
  #1197 = Utf8               ext/mods/gameserver/model/actor/ai/Desire
  #1198 = Methodref          #1196.#1199  // ext/mods/gameserver/model/actor/ai/Desire.canMoveToTarget:()Z
  #1199 = NameAndType        #1200:#94    // canMoveToTarget:()Z
  #1200 = Utf8               canMoveToTarget
  #1201 = Methodref          #114.#1202   // ext/mods/gameserver/model/actor/status/NpcStatus.getPhysicalAttackRange:()I
  #1202 = NameAndType        #1203:#121   // getPhysicalAttackRange:()I
  #1203 = Utf8               getPhysicalAttackRange
  #1204 = Methodref          #555.#1205   // ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #1205 = NameAndType        #1206:#1207  // maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #1206 = Utf8               maybeStartOffensiveFollow
  #1207 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Z
  #1208 = Class              #1209        // ext/mods/gameserver/model/actor/Playable
  #1209 = Utf8               ext/mods/gameserver/model/actor/Playable
  #1210 = Methodref          #13.#1211    // ext/mods/gameserver/model/actor/Npc.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #1211 = NameAndType        #1212:#1213  // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #1212 = Utf8               isIn3DRadius
  #1213 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #1214 = Methodref          #13.#1215    // ext/mods/gameserver/model/actor/Npc.isRaidRelated:()Z
  #1215 = NameAndType        #1216:#94    // isRaidRelated:()Z
  #1216 = Utf8               isRaidRelated
  #1217 = Methodref          #78.#1218    // ext/mods/gameserver/model/actor/template/NpcTemplate.canSeeThrough:()Z
  #1218 = NameAndType        #1219:#94    // canSeeThrough:()Z
  #1219 = Utf8               canSeeThrough
  #1220 = Methodref          #2.#1221     // ext/mods/gameserver/model/actor/Creature.isSilentMoving:()Z
  #1221 = NameAndType        #1222:#94    // isSilentMoving:()Z
  #1222 = Utf8               isSilentMoving
  #1223 = String             #1224        // varka_silenos_clan
  #1224 = Utf8               varka_silenos_clan
  #1225 = Methodref          #1226.#1227  // ext/mods/commons/util/ArraysUtil.contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
  #1226 = Class              #1228        // ext/mods/commons/util/ArraysUtil
  #1227 = NameAndType        #1229:#1230  // contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
  #1228 = Utf8               ext/mods/commons/util/ArraysUtil
  #1229 = Utf8               contains
  #1230 = Utf8               ([Ljava/lang/Object;Ljava/lang/Object;)Z
  #1231 = Methodref          #240.#1232   // ext/mods/gameserver/model/actor/Player.isAlliedWithVarka:()Z
  #1232 = NameAndType        #1233:#94    // isAlliedWithVarka:()Z
  #1233 = Utf8               isAlliedWithVarka
  #1234 = String             #1235        // ketra_orc_clan
  #1235 = Utf8               ketra_orc_clan
  #1236 = Methodref          #240.#1237   // ext/mods/gameserver/model/actor/Player.isAlliedWithKetra:()Z
  #1237 = NameAndType        #1238:#94    // isAlliedWithKetra:()Z
  #1238 = Utf8               isAlliedWithKetra
  #1239 = Methodref          #619.#1240   // ext/mods/gameserver/model/spawn/ASpawn.getMemo:()Lext/mods/gameserver/model/memo/SpawnMemo;
  #1240 = NameAndType        #1241:#1242  // getMemo:()Lext/mods/gameserver/model/memo/SpawnMemo;
  #1241 = Utf8               getMemo
  #1242 = Utf8               ()Lext/mods/gameserver/model/memo/SpawnMemo;
  #1243 = String             #1244        // CreviceOfDiminsion
  #1244 = Utf8               CreviceOfDiminsion
  #1245 = Methodref          #1246.#642   // ext/mods/gameserver/model/memo/SpawnMemo.getInteger:(Ljava/lang/String;I)I
  #1246 = Class              #1247        // ext/mods/gameserver/model/memo/SpawnMemo
  #1247 = Utf8               ext/mods/gameserver/model/memo/SpawnMemo
  #1248 = Methodref          #240.#1249   // ext/mods/gameserver/model/actor/Player.isRecentFakeDeath:()Z
  #1249 = NameAndType        #1250:#94    // isRecentFakeDeath:()Z
  #1250 = Utf8               isRecentFakeDeath
  #1251 = Class              #1252        // ext/mods/gameserver/model/actor/instance/Guard
  #1252 = Utf8               ext/mods/gameserver/model/actor/instance/Guard
  #1253 = Methodref          #1208.#1254  // ext/mods/gameserver/model/actor/Playable.getKarma:()I
  #1254 = NameAndType        #1255:#121   // getKarma:()I
  #1255 = Utf8               getKarma
  #1256 = Methodref          #1257.#1258  // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #1257 = Class              #1259        // ext/mods/gameserver/model/actor/move/MovementIntegration
  #1258 = NameAndType        #1260:#1261  // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #1259 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
  #1260 = Utf8               canSeeTarget
  #1261 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #1262 = Fieldref           #630.#1263   // ext/mods/Config.GUARD_ATTACK_AGGRO_MOB:Z
  #1263 = NameAndType        #1264:#54    // GUARD_ATTACK_AGGRO_MOB:Z
  #1264 = Utf8               GUARD_ATTACK_AGGRO_MOB
  #1265 = Methodref          #809.#251    // ext/mods/gameserver/model/actor/instance/Monster.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #1266 = Methodref          #78.#1267    // ext/mods/gameserver/model/actor/template/NpcTemplate.getAggro:()Z
  #1267 = NameAndType        #1268:#94    // getAggro:()Z
  #1268 = Utf8               getAggro
  #1269 = Class              #1270        // ext/mods/gameserver/model/actor/instance/FriendlyMonster
  #1270 = Utf8               ext/mods/gameserver/model/actor/instance/FriendlyMonster
  #1271 = Class              #1272        // ext/mods/gameserver/model/actor/Attackable
  #1272 = Utf8               ext/mods/gameserver/model/actor/Attackable
  #1273 = Methodref          #13.#1274    // ext/mods/gameserver/model/actor/Npc.isConfused:()Z
  #1274 = NameAndType        #1275:#94    // isConfused:()Z
  #1275 = Utf8               isConfused
  #1276 = Fieldref           #630.#1277   // ext/mods/Config.MOB_AGGRO_IN_PEACEZONE:Z
  #1277 = NameAndType        #1278:#54    // MOB_AGGRO_IN_PEACEZONE:Z
  #1278 = Utf8               MOB_AGGRO_IN_PEACEZONE
  #1279 = Fieldref           #1280.#1281  // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
  #1280 = Class              #1282        // ext/mods/gameserver/enums/ZoneId
  #1281 = NameAndType        #1283:#1284  // PEACE:Lext/mods/gameserver/enums/ZoneId;
  #1282 = Utf8               ext/mods/gameserver/enums/ZoneId
  #1283 = Utf8               PEACE
  #1284 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #1285 = Methodref          #2.#1286     // ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #1286 = NameAndType        #1287:#1288  // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #1287 = Utf8               isInsideZone
  #1288 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #1289 = Methodref          #619.#1290   // ext/mods/gameserver/model/spawn/ASpawn.getPrivateData:()Ljava/util/List;
  #1290 = NameAndType        #1291:#82    // getPrivateData:()Ljava/util/List;
  #1291 = Utf8               getPrivateData
  #1292 = Methodref          #78.#1290    // ext/mods/gameserver/model/actor/template/NpcTemplate.getPrivateData:()Ljava/util/List;
  #1293 = Methodref          #478.#1294   // ext/mods/gameserver/model/actor/container/attackable/AggroList.stopHate:(Lext/mods/gameserver/model/actor/Creature;)V
  #1294 = NameAndType        #1295:#1296  // stopHate:(Lext/mods/gameserver/model/actor/Creature;)V
  #1295 = Utf8               stopHate
  #1296 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #1297 = Methodref          #555.#1298   // ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
  #1298 = NameAndType        #1299:#11    // stop:()V
  #1299 = Utf8               stop
  #1300 = InterfaceMethodref #516.#1301   // java/util/Set.clear:()V
  #1301 = NameAndType        #1302:#11    // clear:()V
  #1302 = Utf8               clear
  #1303 = Methodref          #478.#1304   // ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
  #1304 = NameAndType        #1305:#11    // cleanAllHate:()V
  #1305 = Utf8               cleanAllHate
  #1306 = Methodref          #208.#1307   // ext/mods/gameserver/model/actor/ai/type/NpcAI.getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #1307 = NameAndType        #1308:#1309  // getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #1308 = Utf8               getHateList
  #1309 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #1310 = Methodref          #1311.#1304  // ext/mods/gameserver/model/actor/container/attackable/HateList.cleanAllHate:()V
  #1311 = Class              #1312        // ext/mods/gameserver/model/actor/container/attackable/HateList
  #1312 = Utf8               ext/mods/gameserver/model/actor/container/attackable/HateList
  #1313 = Fieldref           #318.#1314   // ext/mods/gameserver/enums/EventHandler.SCRIPT_EVENT:Lext/mods/gameserver/enums/EventHandler;
  #1314 = NameAndType        #1315:#322   // SCRIPT_EVENT:Lext/mods/gameserver/enums/EventHandler;
  #1315 = Utf8               SCRIPT_EVENT
  #1316 = Methodref          #327.#1317   // ext/mods/gameserver/scripting/Quest.onScriptEvent:(Lext/mods/gameserver/model/actor/Npc;III)V
  #1317 = NameAndType        #1318:#1319  // onScriptEvent:(Lext/mods/gameserver/model/actor/Npc;III)V
  #1318 = Utf8               onScriptEvent
  #1319 = Utf8               (Lext/mods/gameserver/model/actor/Npc;III)V
  #1320 = Methodref          #1144.#1321  // ext/mods/gameserver/model/item/instance/ItemInstance.create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1321 = NameAndType        #1322:#1323  // create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1322 = Utf8               create
  #1323 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1324 = Methodref          #2.#199      // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
  #1325 = Methodref          #13.#1326    // ext/mods/gameserver/model/actor/Npc.isRaidBoss:()Z
  #1326 = NameAndType        #1327:#94    // isRaidBoss:()Z
  #1327 = Utf8               isRaidBoss
  #1328 = Methodref          #1144.#1329  // ext/mods/gameserver/model/item/instance/ItemInstance.setDropProtection:(IZ)V
  #1329 = NameAndType        #1330:#1331  // setDropProtection:(IZ)V
  #1330 = Utf8               setDropProtection
  #1331 = Utf8               (IZ)V
  #1332 = Methodref          #1144.#1333  // ext/mods/gameserver/model/item/instance/ItemInstance.dropMe:(Lext/mods/gameserver/model/actor/Creature;)V
  #1333 = NameAndType        #1334:#1296  // dropMe:(Lext/mods/gameserver/model/actor/Creature;)V
  #1334 = Utf8               dropMe
  #1335 = Methodref          #1144.#1336  // ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
  #1336 = NameAndType        #1337:#94    // isStackable:()Z
  #1337 = Utf8               isStackable
  #1338 = Fieldref           #630.#1339   // ext/mods/Config.MULTIPLE_ITEM_DROP:Z
  #1339 = NameAndType        #1340:#54    // MULTIPLE_ITEM_DROP:Z
  #1340 = Utf8               MULTIPLE_ITEM_DROP
  #1341 = InvokeDynamic      #20:#1342    // #20:test:()Ljava/util/function/Predicate;
  #1342 = NameAndType        #423:#1343   // test:()Ljava/util/function/Predicate;
  #1343 = Utf8               ()Ljava/util/function/Predicate;
  #1344 = Methodref          #290.#1345   // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
  #1345 = NameAndType        #293:#1346   // get:(Ljava/util/List;)Ljava/lang/Object;
  #1346 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #1347 = Fieldref           #630.#1348   // ext/mods/Config.DEFAULT_SEE_RANGE:I
  #1348 = NameAndType        #1349:#21    // DEFAULT_SEE_RANGE:I
  #1349 = Utf8               DEFAULT_SEE_RANGE
  #1350 = Methodref          #13.#1351    // ext/mods/gameserver/model/actor/Npc.getCast:()Lext/mods/gameserver/model/actor/cast/NpcCast;
  #1351 = NameAndType        #1352:#1353  // getCast:()Lext/mods/gameserver/model/actor/cast/NpcCast;
  #1352 = Utf8               getCast
  #1353 = Utf8               ()Lext/mods/gameserver/model/actor/cast/NpcCast;
  #1354 = Methodref          #13.#1355    // ext/mods/gameserver/model/actor/Npc.getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
  #1355 = NameAndType        #1356:#1357  // getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
  #1356 = Utf8               getAttack
  #1357 = Utf8               ()Lext/mods/gameserver/model/actor/attack/NpcAttack;
  #1358 = Methodref          #1196.#1359  // ext/mods/gameserver/model/actor/ai/Desire.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
  #1359 = NameAndType        #1360:#1361  // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
  #1360 = Utf8               getFinalTarget
  #1361 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
  #1362 = Methodref          #1196.#1363  // ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
  #1363 = NameAndType        #1046:#1364  // getType:()Lext/mods/gameserver/enums/IntentionType;
  #1364 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
  #1365 = Fieldref           #1366.#1367  // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
  #1366 = Class              #1368        // ext/mods/gameserver/enums/IntentionType
  #1367 = NameAndType        #1369:#1370  // ATTACK:Lext/mods/gameserver/enums/IntentionType;
  #1368 = Utf8               ext/mods/gameserver/enums/IntentionType
  #1369 = Utf8               ATTACK
  #1370 = Utf8               Lext/mods/gameserver/enums/IntentionType;
  #1371 = Methodref          #240.#1372   // ext/mods/gameserver/model/actor/Player.isSpawnProtected:()Z
  #1372 = NameAndType        #1373:#94    // isSpawnProtected:()Z
  #1373 = Utf8               isSpawnProtected
  #1374 = Methodref          #240.#1375   // ext/mods/gameserver/model/actor/Player.isFlying:()Z
  #1375 = NameAndType        #1376:#94    // isFlying:()Z
  #1376 = Utf8               isFlying
  #1377 = Methodref          #2.#1378     // ext/mods/gameserver/model/actor/Creature.getZ:()I
  #1378 = NameAndType        #1379:#121   // getZ:()I
  #1379 = Utf8               getZ
  #1380 = Methodref          #13.#1378    // ext/mods/gameserver/model/actor/Npc.getZ:()I
  #1381 = Methodref          #1382.#1383  // java/lang/Math.abs:(I)I
  #1382 = Class              #1384        // java/lang/Math
  #1383 = NameAndType        #1385:#294   // abs:(I)I
  #1384 = Utf8               java/lang/Math
  #1385 = Utf8               abs
  #1386 = Methodref          #327.#1387   // ext/mods/gameserver/scripting/Quest.onSeeCreature:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1387 = NameAndType        #1388:#1389  // onSeeCreature:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1388 = Utf8               onSeeCreature
  #1389 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1390 = Methodref          #1144.#1391  // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #1391 = NameAndType        #1392:#1393  // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #1392 = Utf8               getItem
  #1393 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #1394 = Methodref          #1395.#1396  // ext/mods/gameserver/model/item/kind/Item.getItemId:()I
  #1395 = Class              #1397        // ext/mods/gameserver/model/item/kind/Item
  #1396 = NameAndType        #1398:#121   // getItemId:()I
  #1397 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #1398 = Utf8               getItemId
  #1399 = Methodref          #1226.#1400  // ext/mods/commons/util/ArraysUtil.contains:([II)Z
  #1400 = NameAndType        #1229:#1401  // contains:([II)Z
  #1401 = Utf8               ([II)Z
  #1402 = Methodref          #13.#719     // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #1403 = Methodref          #619.#1404   // ext/mods/gameserver/model/spawn/ASpawn.doRespawn:(Lext/mods/gameserver/model/actor/Npc;)V
  #1404 = NameAndType        #1405:#72    // doRespawn:(Lext/mods/gameserver/model/actor/Npc;)V
  #1405 = Utf8               doRespawn
  #1406 = Methodref          #1226.#1407  // ext/mods/commons/util/ArraysUtil.contains:([Ljava/lang/Object;[Ljava/lang/Object;)Z
  #1407 = NameAndType        #1229:#1408  // contains:([Ljava/lang/Object;[Ljava/lang/Object;)Z
  #1408 = Utf8               ([Ljava/lang/Object;[Ljava/lang/Object;)Z
  #1409 = Methodref          #78.#1410    // ext/mods/gameserver/model/actor/template/NpcTemplate.getIgnoredIds:()[I
  #1410 = NameAndType        #1411:#1412  // getIgnoredIds:()[I
  #1411 = Utf8               getIgnoredIds
  #1412 = Utf8               ()[I
  #1413 = Methodref          #1414.#1415  // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #1414 = Class              #1416        // ext/mods/gameserver/geoengine/GeoEngine
  #1415 = NameAndType        #149:#1417   // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #1416 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #1417 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #1418 = Methodref          #1414.#1258  // ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #1419 = Fieldref           #318.#1420   // ext/mods/gameserver/enums/EventHandler.CLAN_DIED:Lext/mods/gameserver/enums/EventHandler;
  #1420 = NameAndType        #1421:#322   // CLAN_DIED:Lext/mods/gameserver/enums/EventHandler;
  #1421 = Utf8               CLAN_DIED
  #1422 = Methodref          #327.#1423   // ext/mods/gameserver/scripting/Quest.onClanDied:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1423 = NameAndType        #1424:#1425  // onClanDied:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1424 = Utf8               onClanDied
  #1425 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1426 = Methodref          #13.#1427    // ext/mods/gameserver/model/actor/Npc.setMaster:(Lext/mods/gameserver/model/actor/Npc;)V
  #1427 = NameAndType        #1428:#72    // setMaster:(Lext/mods/gameserver/model/actor/Npc;)V
  #1428 = Utf8               setMaster
  #1429 = Methodref          #327.#1430   // ext/mods/gameserver/scripting/Quest.onMyDying:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1430 = NameAndType        #1431:#1389  // onMyDying:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1431 = Utf8               onMyDying
  #1432 = Methodref          #99.#1433    // ext/mods/gameserver/skills/L2Skill.getId:()I
  #1433 = NameAndType        #1434:#121   // getId:()I
  #1434 = Utf8               getId
  #1435 = Utf8               INTERACTION_DISTANCE
  #1436 = Utf8               ConstantValue
  #1437 = Integer            150
  #1438 = Utf8               Signature
  #1439 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #1440 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;
  #1441 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #1442 = Utf8               _i_ai0
  #1443 = Utf8               _i_ai1
  #1444 = Utf8               _i_ai2
  #1445 = Utf8               _i_ai3
  #1446 = Utf8               _i_ai4
  #1447 = Utf8               _c_ai0
  #1448 = Utf8               _c_ai1
  #1449 = Utf8               _c_ai2
  #1450 = Utf8               _c_ai3
  #1451 = Utf8               _c_ai4
  #1452 = Utf8               _i_quest0
  #1453 = Utf8               _i_quest1
  #1454 = Utf8               _i_quest2
  #1455 = Utf8               _i_quest3
  #1456 = Utf8               _i_quest4
  #1457 = Utf8               _c_quest0
  #1458 = Utf8               _c_quest1
  #1459 = Utf8               _c_quest2
  #1460 = Utf8               _c_quest3
  #1461 = Utf8               _c_quest4
  #1462 = Utf8               _param1
  #1463 = Utf8               _param2
  #1464 = Utf8               _param3
  #1465 = Utf8               _flag
  #1466 = Utf8               _respawnTime
  #1467 = Utf8               _summoner
  #1468 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
  #1469 = Utf8               Code
  #1470 = Utf8               LineNumberTable
  #1471 = Utf8               LocalVariableTable
  #1472 = Utf8               skill
  #1473 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #1474 = Utf8               this
  #1475 = Utf8               objectId
  #1476 = Utf8               template
  #1477 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #1478 = Utf8               StackMapTable
  #1479 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI<+Lext/mods/gameserver/model/actor/Npc;>;
  #1480 = Utf8               setAI
  #1481 = Utf8               setCast
  #1482 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus<+Lext/mods/gameserver/model/actor/Npc;>;
  #1483 = Utf8               setStatus
  #1484 = Utf8               setAttack
  #1485 = Utf8               value
  #1486 = Utf8               isUndead
  #1487 = Class              #1488        // java/lang/String
  #1488 = Utf8               java/lang/String
  #1489 = Utf8               onInteract
  #1490 = Utf8               script
  #1491 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #1492 = Utf8               player
  #1493 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #1494 = Utf8               scripts
  #1495 = Utf8               LocalVariableTypeTable
  #1496 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #1497 = Utf8               sendInfo
  #1498 = Utf8               type
  #1499 = Utf8               charged
  #1500 = Utf8               rechargeShots
  #1501 = Utf8               (ZZ)V
  #1502 = Utf8               physical
  #1503 = Utf8               magic
  #1504 = Utf8               getSkillLevel
  #1505 = Utf8               skillId
  #1506 = Utf8               getActiveWeaponInstance
  #1507 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1508 = Utf8               getActiveWeaponItem
  #1509 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
  #1510 = Utf8               weapon
  #1511 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #1512 = Utf8               item
  #1513 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #1514 = Utf8               getSecondaryWeaponInstance
  #1515 = Utf8               getSecondaryWeaponItem
  #1516 = Utf8               quest
  #1517 = Utf8               minion
  #1518 = Utf8               master
  #1519 = Utf8               attackingPlayer
  #1520 = Utf8               actorClans
  #1521 = Utf8               [Ljava/lang/String;
  #1522 = Utf8               damage
  #1523 = Utf8               attacker
  #1524 = Utf8               awake
  #1525 = Utf8               isDOT
  #1526 = Class              #1521        // "[Ljava/lang/String;"
  #1527 = Utf8               killer
  #1528 = Utf8               onActiveRegion
  #1529 = Utf8               onInactiveRegion
  #1530 = Utf8               x
  #1531 = Utf8               y
  #1532 = Utf8               z
  #1533 = Utf8               randomOffset
  #1534 = Utf8               equipItem
  #1535 = Utf8               (II)V
  #1536 = Utf8               rightHandItemId
  #1537 = Utf8               leftHandItemId
  #1538 = Utf8               getCurrentSsCount
  #1539 = Utf8               getCurrentSpsCount
  #1540 = Utf8               setSpawn
  #1541 = Utf8               (Lext/mods/gameserver/model/spawn/ASpawn;)V
  #1542 = Utf8               spawn
  #1543 = Utf8               setSpawnLocation
  #1544 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
  #1545 = Utf8               loc
  #1546 = Utf8               npc
  #1547 = Utf8               ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;
  #1548 = Utf8               teleportToMaster
  #1549 = Utf8               scheduleDBRespawn
  #1550 = Utf8               (J)V
  #1551 = Utf8               delay
  #1552 = Utf8               scheduleRespawn
  #1553 = Utf8               monster
  #1554 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #1555 = Utf8               coprseTime
  #1556 = Utf8               cancelRespawn
  #1557 = Utf8               scheduleDespawn
  #1558 = Utf8               decayed
  #1559 = Utf8               isReadyForRespawn
  #1560 = Utf8               setReadyForRespawn
  #1561 = Utf8               ready
  #1562 = Utf8               isAggressive
  #1563 = Utf8               getLeftHandItemId
  #1564 = Utf8               setLeftHandItemId
  #1565 = Utf8               itemId
  #1566 = Utf8               getRightHandItemId
  #1567 = Utf8               setRightHandItemId
  #1568 = Utf8               getEnchantEffect
  #1569 = Utf8               setEnchantEffect
  #1570 = Utf8               enchant
  #1571 = Utf8               setCollisionHeight
  #1572 = Utf8               (D)V
  #1573 = Utf8               height
  #1574 = Utf8               setCollisionRadius
  #1575 = Utf8               radius
  #1576 = Utf8               getScriptValue
  #1577 = Utf8               setScriptValue
  #1578 = Utf8               val
  #1579 = Utf8               isScriptValue
  #1580 = Utf8               (I)Z
  #1581 = Utf8               isWarehouse
  #1582 = Utf8               residence
  #1583 = Utf8               sh
  #1584 = Utf8               Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #1585 = Utf8               param
  #1586 = Utf8               residenceId
  #1587 = Utf8               castle
  #1588 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #1589 = Utf8               getCastle
  #1590 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
  #1591 = Utf8               getClanHall
  #1592 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #1593 = Utf8               ch
  #1594 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #1595 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #1596 = Utf8               getLastAttacker
  #1597 = Utf8               isLordOwner
  #1598 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #1599 = Utf8               setClanId
  #1600 = Utf8               clanId
  #1601 = Utf8               disableCoreAi
  #1602 = Utf8               getObserverGroups
  #1603 = Utf8               ()Ljava/util/List<Ljava/lang/Integer;>;
  #1604 = Utf8               setObserverGroups
  #1605 = Utf8               groups
  #1606 = Utf8               (Ljava/util/List<Ljava/lang/Integer;>;)V
  #1607 = Utf8               getFollowSlots
  #1608 = Utf8               getLastFollowingLoc
  #1609 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #1610 = Utf8               setLastFollowingLoc
  #1611 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #1612 = Utf8               isAISleeping
  #1613 = Utf8               setAISleeping
  #1614 = Utf8               onBypassFeedback
  #1615 = Utf8               command
  #1616 = Utf8               handler
  #1617 = Utf8               Lext/mods/gameserver/handler/IBypassHandler;
  #1618 = Utf8               isTeleportAllowed
  #1619 = Utf8               getNpcTalkCond
  #1620 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #1621 = Utf8               filename
  #1622 = Utf8               npcId
  #1623 = Utf8               message
  #1624 = Utf8               (Lext/mods/gameserver/network/NpcStringId;)V
  #1625 = Utf8               npcStringId
  #1626 = Utf8               Lext/mods/gameserver/network/NpcStringId;
  #1627 = Utf8               (Lext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
  #1628 = Utf8               params
  #1629 = Utf8               [Ljava/lang/Object;
  #1630 = Utf8               time
  #1631 = Utf8               (ILext/mods/gameserver/network/NpcStringId;)V
  #1632 = Utf8               (ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
  #1633 = Utf8               showPkDenyChatWindow
  #1634 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #1635 = Utf8               html
  #1636 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #1637 = Utf8               content
  #1638 = Utf8               groupId
  #1639 = Utf8               sb
  #1640 = Utf8               Ljava/lang/StringBuilder;
  #1641 = Utf8               showTeleportWindow
  #1642 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
  #1643 = Utf8               priceCount
  #1644 = Utf8               teleport
  #1645 = Utf8               Lext/mods/gameserver/model/location/TeleportLocation;
  #1646 = Utf8               index
  #1647 = Utf8               Lext/mods/gameserver/enums/TeleportType;
  #1648 = Utf8               teleports
  #1649 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;
  #1650 = Class              #1651        // ext/mods/gameserver/enums/TeleportType
  #1651 = Utf8               ext/mods/gameserver/enums/TeleportType
  #1652 = Class              #1629        // "[Ljava/lang/Object;"
  #1653 = Utf8               moveFromSpawnPointUsingRandomOffset
  #1654 = Utf8               offset
  #1655 = Class              #1656        // ext/mods/gameserver/model/location/Location
  #1656 = Utf8               ext/mods/gameserver/model/location/Location
  #1657 = Utf8               getExpReward
  #1658 = Utf8               isPremium
  #1659 = Utf8               getSpReward
  #1660 = Utf8               forceAttack
  #1661 = Utf8               creature
  #1662 = Utf8               hate
  #1663 = Utf8               lookItem
  #1664 = Utf8               (II[I)V
  #1665 = Utf8               quantity
  #1666 = Utf8               ids
  #1667 = Utf8               [I
  #1668 = Utf8               items
  #1669 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #1670 = Utf8               lookNeighbor
  #1671 = Utf8               target
  #1672 = Utf8               targetPlayer
  #1673 = Utf8               targetPlayable
  #1674 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #1675 = Utf8               targetMonster
  #1676 = Utf8               targetAttackable
  #1677 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #1678 = Utf8               range
  #1679 = Utf8               allowPeaceful
  #1680 = Utf8               desire
  #1681 = Utf8               Lext/mods/gameserver/model/actor/ai/Desire;
  #1682 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;
  #1683 = Utf8               removeAttackDesire
  #1684 = Utf8               removeAllAttackDesire
  #1685 = Utf8               removeAllDesire
  #1686 = Utf8               sendScriptEvent
  #1687 = Utf8               (III)V
  #1688 = Utf8               eventId
  #1689 = Utf8               arg1
  #1690 = Utf8               arg2
  #1691 = Utf8               dropItem
  #1692 = Utf8               (Lext/mods/gameserver/model/actor/Creature;II)V
  #1693 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1694 = Utf8               i
  #1695 = Utf8               amount
  #1696 = Utf8               getNeighborHero
  #1697 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #1698 = Utf8               getSeeRange
  #1699 = Utf8               ()Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
  #1700 = Utf8               ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #1701 = Utf8               ()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #1702 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #1703 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #1704 = Utf8               lambda$canAutoAttack$0
  #1705 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1706 = Utf8               d
  #1707 = Utf8               lambda$lookNeighbor$0
  #1708 = Utf8               (Ljava/util/List;Lext/mods/gameserver/model/actor/Creature;)V
  #1709 = Utf8               i$
  #1710 = Utf8               Ljava/util/Iterator;
  #1711 = Utf8               lambda$lookItem$0
  #1712 = Utf8               ([ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1713 = Utf8               lambda$scheduleDespawn$0
  #1714 = Utf8               lambda$scheduleRespawn$0
  #1715 = Utf8               lambda$scheduleDBRespawn$0
  #1716 = Utf8               lambda$doDie$2
  #1717 = Utf8               ([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;)V
  #1718 = Utf8               called
  #1719 = Utf8               lambda$doDie$1
  #1720 = Utf8               n
  #1721 = Utf8               lambda$doDie$0
  #1722 = Utf8               (Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/actor/Creature;)V
  #1723 = Utf8               lambda$reduceCurrentHp$0
  #1724 = Utf8               ([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Npc;)V
  #1725 = Utf8               lambda$getSkill$0
  #1726 = Utf8               (ILext/mods/gameserver/skills/L2Skill;)Z
  #1727 = Utf8               s
  #1728 = Utf8               SourceFile
  #1729 = Utf8               Npc.java
  #1730 = Utf8               BootstrapMethods
  #1731 = String             #1732        // \u0001 [objId=\u0001]
  #1732 = Utf8               \u0001 [objId=\u0001]
  #1733 = MethodType         #796         //  (Ljava/lang/Object;)V
  #1734 = MethodHandle       5:#1735      // REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.sendInfo:(Lext/mods/gameserver/model/actor/Player;)V
  #1735 = Methodref          #13.#1736    // ext/mods/gameserver/model/actor/Npc.sendInfo:(Lext/mods/gameserver/model/actor/Player;)V
  #1736 = NameAndType        #1497:#351   // sendInfo:(Lext/mods/gameserver/model/actor/Player;)V
  #1737 = MethodType         #351         //  (Lext/mods/gameserver/model/actor/Player;)V
  #1738 = MethodType         #1739        //  (Ljava/lang/Object;)Z
  #1739 = Utf8               (Ljava/lang/Object;)Z
  #1740 = MethodHandle       6:#1741      // REF_invokeStatic ext/mods/gameserver/model/actor/Npc.lambda$getSkill$0:(ILext/mods/gameserver/skills/L2Skill;)Z
  #1741 = Methodref          #13.#1742    // ext/mods/gameserver/model/actor/Npc.lambda$getSkill$0:(ILext/mods/gameserver/skills/L2Skill;)Z
  #1742 = NameAndType        #1725:#1726  // lambda$getSkill$0:(ILext/mods/gameserver/skills/L2Skill;)Z
  #1743 = MethodType         #1744        //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #1744 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #1745 = MethodHandle       5:#1746      // REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$reduceCurrentHp$0:([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Npc;)V
  #1746 = Methodref          #13.#1747    // ext/mods/gameserver/model/actor/Npc.lambda$reduceCurrentHp$0:([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Npc;)V
  #1747 = NameAndType        #1723:#1724  // lambda$reduceCurrentHp$0:([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Npc;)V
  #1748 = MethodType         #72          //  (Lext/mods/gameserver/model/actor/Npc;)V
  #1749 = MethodType         #11          //  ()V
  #1750 = MethodHandle       5:#1751      // REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$doDie$0:(Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/actor/Creature;)V
  #1751 = Methodref          #13.#1752    // ext/mods/gameserver/model/actor/Npc.lambda$doDie$0:(Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/actor/Creature;)V
  #1752 = NameAndType        #1721:#1722  // lambda$doDie$0:(Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/actor/Creature;)V
  #1753 = MethodHandle       6:#1754      // REF_invokeStatic ext/mods/gameserver/model/actor/Npc.lambda$doDie$1:(Lext/mods/gameserver/model/actor/Npc;)V
  #1754 = Methodref          #13.#1755    // ext/mods/gameserver/model/actor/Npc.lambda$doDie$1:(Lext/mods/gameserver/model/actor/Npc;)V
  #1755 = NameAndType        #1719:#72    // lambda$doDie$1:(Lext/mods/gameserver/model/actor/Npc;)V
  #1756 = MethodHandle       5:#1757      // REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$doDie$2:([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;)V
  #1757 = Methodref          #13.#1758    // ext/mods/gameserver/model/actor/Npc.lambda$doDie$2:([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;)V
  #1758 = NameAndType        #1716:#1717  // lambda$doDie$2:([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;)V
  #1759 = String             #1760        // NPC \u0001 [\u0001] tem NoRespawn=true, não será respawnado.
  #1760 = Utf8               NPC \u0001 [\u0001] tem NoRespawn=true, não será respawnado.
  #1761 = String             #1762        // DB Delay <= 0 while scheduling normal respawn of \u0001 [\u0001] (\u0001)
  #1762 = Utf8               DB Delay <= 0 while scheduling normal respawn of \u0001 [\u0001] (\u0001)
  #1763 = String             #1764        // DB Respawn task already exists for \u0001 [\u0001]!
  #1764 = Utf8               DB Respawn task already exists for \u0001 [\u0001]!
  #1765 = MethodHandle       5:#1766      // REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$scheduleDBRespawn$0:()V
  #1766 = Methodref          #13.#1767    // ext/mods/gameserver/model/actor/Npc.lambda$scheduleDBRespawn$0:()V
  #1767 = NameAndType        #1715:#11    // lambda$scheduleDBRespawn$0:()V
  #1768 = String             #1769        // Respawn task already exists for \u0001 [\u0001]!
  #1769 = Utf8               Respawn task already exists for \u0001 [\u0001]!
  #1770 = MethodHandle       5:#1771      // REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$scheduleRespawn$0:()V
  #1771 = Methodref          #13.#1772    // ext/mods/gameserver/model/actor/Npc.lambda$scheduleRespawn$0:()V
  #1772 = NameAndType        #1714:#11    // lambda$scheduleRespawn$0:()V
  #1773 = MethodHandle       5:#1774      // REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$scheduleDespawn$0:()V
  #1774 = Methodref          #13.#1775    // ext/mods/gameserver/model/actor/Npc.lambda$scheduleDespawn$0:()V
  #1775 = NameAndType        #1713:#11    // lambda$scheduleDespawn$0:()V
  #1776 = String             #1777        // html/default/\u0001.htm
  #1777 = Utf8               html/default/\u0001.htm
  #1778 = String             #1779        // html/default/\u0001-\u0001.htm
  #1779 = Utf8               html/default/\u0001-\u0001.htm
  #1780 = String             #1781        // html/\u0001/\u0001-pk.htm
  #1781 = Utf8               html/\u0001/\u0001-pk.htm
  #1782 = MethodHandle       6:#1783      // REF_invokeStatic ext/mods/gameserver/model/actor/Npc.lambda$lookItem$0:([ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1783 = Methodref          #13.#1784    // ext/mods/gameserver/model/actor/Npc.lambda$lookItem$0:([ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1784 = NameAndType        #1711:#1712  // lambda$lookItem$0:([ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1785 = MethodType         #1786        //  (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1786 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1787 = MethodHandle       5:#1788      // REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$lookNeighbor$0:(Ljava/util/List;Lext/mods/gameserver/model/actor/Creature;)V
  #1788 = Methodref          #13.#1789    // ext/mods/gameserver/model/actor/Npc.lambda$lookNeighbor$0:(Ljava/util/List;Lext/mods/gameserver/model/actor/Creature;)V
  #1789 = NameAndType        #1707:#1708  // lambda$lookNeighbor$0:(Ljava/util/List;Lext/mods/gameserver/model/actor/Creature;)V
  #1790 = MethodType         #1296        //  (Lext/mods/gameserver/model/actor/Creature;)V
  #1791 = MethodHandle       6:#1792      // REF_invokeStatic ext/mods/gameserver/model/actor/Npc.lambda$canAutoAttack$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1792 = Methodref          #13.#1793    // ext/mods/gameserver/model/actor/Npc.lambda$canAutoAttack$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1793 = NameAndType        #1704:#1705  // lambda$canAutoAttack$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1794 = MethodType         #1795        //  (Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1795 = Utf8               (Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1796 = MethodHandle       5:#1797      // REF_invokeVirtual ext/mods/gameserver/model/actor/Player.isHero:()Z
  #1797 = Methodref          #240.#1798   // ext/mods/gameserver/model/actor/Player.isHero:()Z
  #1798 = NameAndType        #1799:#94    // isHero:()Z
  #1799 = Utf8               isHero
  #1800 = MethodType         #1598        //  (Lext/mods/gameserver/model/actor/Player;)Z
  #1801 = MethodHandle       6:#1802      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1802 = Methodref          #1803.#1804  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1803 = Class              #1805        // java/lang/invoke/StringConcatFactory
  #1804 = NameAndType        #203:#1806   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1805 = Utf8               java/lang/invoke/StringConcatFactory
  #1806 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1807 = MethodHandle       6:#1808      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1808 = Methodref          #1809.#1810  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1809 = Class              #1811        // java/lang/invoke/LambdaMetafactory
  #1810 = NameAndType        #1812:#1813  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1811 = Utf8               java/lang/invoke/LambdaMetafactory
  #1812 = Utf8               metafactory
  #1813 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1814 = Utf8               InnerClasses
  #1815 = Class              #1816        // ext/mods/gameserver/custom/data/PolymorphData$Polymorph
  #1816 = Utf8               ext/mods/gameserver/custom/data/PolymorphData$Polymorph
  #1817 = Utf8               Polymorph
  #1818 = Class              #1819        // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #1819 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #1820 = Utf8               NpcInfo
  #1821 = Class              #1822        // java/util/concurrent/ConcurrentHashMap$KeySetView
  #1822 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #1823 = Utf8               KeySetView
  #1824 = Class              #1825        // java/lang/invoke/MethodHandles$Lookup
  #1825 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1826 = Class              #1827        // java/lang/invoke/MethodHandles
  #1827 = Utf8               java/lang/invoke/MethodHandles
  #1828 = Utf8               Lookup
{
  public static final int INTERACTION_DISTANCE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 150

  public int _i_ai0;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _i_ai1;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _i_ai2;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _i_ai3;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _i_ai4;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.actor.Creature _c_ai0;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.actor.Creature _c_ai1;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.actor.Creature _c_ai2;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.actor.Creature _c_ai3;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.actor.Creature _c_ai4;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC

  public int _i_quest0;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _i_quest1;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _i_quest2;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _i_quest3;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _i_quest4;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.actor.Creature _c_quest0;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.actor.Creature _c_quest1;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.actor.Creature _c_quest2;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.actor.Creature _c_quest3;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.actor.Creature _c_quest4;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC

  public int _param1;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _param2;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _param3;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _flag;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _respawnTime;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int _weightPoint;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public java.util.concurrent.atomic.AtomicInteger _av_quest0;
    descriptor: Ljava/util/concurrent/atomic/AtomicInteger;
    flags: (0x0001) ACC_PUBLIC

  public java.util.concurrent.atomic.AtomicInteger _av_quest1;
    descriptor: Ljava/util/concurrent/atomic/AtomicInteger;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.actor.Creature _summoner;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.model.actor.Npc(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Creature."<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
         6: aload_0
         7: new           #7                  // class java/util/concurrent/atomic/AtomicBoolean
        10: dup
        11: invokespecial #9                  // Method java/util/concurrent/atomic/AtomicBoolean."<init>":()V
        14: putfield      #12                 // Field _isDecayed:Ljava/util/concurrent/atomic/AtomicBoolean;
        17: aload_0
        18: iconst_0
        19: putfield      #18                 // Field _currentSsCount:I
        22: aload_0
        23: iconst_0
        24: putfield      #22                 // Field _currentSpsCount:I
        27: aload_0
        28: iconst_0
        29: putfield      #25                 // Field _shotsMask:I
        32: aload_0
        33: iconst_0
        34: putfield      #28                 // Field _scriptValue:I
        37: aload_0
        38: lconst_0
        39: putfield      #31                 // Field _lookNeighborTimeStamp:J
        42: aload_0
        43: bipush        8
        45: anewarray     #35                 // class java/lang/Integer
        48: dup
        49: iconst_0
        50: aconst_null
        51: aastore
        52: dup
        53: iconst_1
        54: aconst_null
        55: aastore
        56: dup
        57: iconst_2
        58: aconst_null
        59: aastore
        60: dup
        61: iconst_3
        62: aconst_null
        63: aastore
        64: dup
        65: iconst_4
        66: aconst_null
        67: aastore
        68: dup
        69: iconst_5
        70: aconst_null
        71: aastore
        72: dup
        73: bipush        6
        75: aconst_null
        76: aastore
        77: dup
        78: bipush        7
        80: aconst_null
        81: aastore
        82: invokestatic  #37                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        85: putfield      #43                 // Field _followSlots:Ljava/util/List;
        88: aload_0
        89: aconst_null
        90: putfield      #47                 // Field _lastFollowingLoc:Lext/mods/gameserver/model/location/Location;
        93: aload_0
        94: iconst_1
        95: putfield      #51                 // Field _isAISleeping:Z
        98: aload_0
        99: iconst_1
       100: putfield      #55                 // Field _weightPoint:I
       103: aload_0
       104: new           #58                 // class java/util/concurrent/atomic/AtomicInteger
       107: dup
       108: invokespecial #60                 // Method java/util/concurrent/atomic/AtomicInteger."<init>":()V
       111: putfield      #61                 // Field _av_quest0:Ljava/util/concurrent/atomic/AtomicInteger;
       114: aload_0
       115: new           #58                 // class java/util/concurrent/atomic/AtomicInteger
       118: dup
       119: invokespecial #60                 // Method java/util/concurrent/atomic/AtomicInteger."<init>":()V
       122: putfield      #65                 // Field _av_quest1:Ljava/util/concurrent/atomic/AtomicInteger;
       125: aload_0
       126: new           #68                 // class ext/mods/gameserver/model/actor/move/NpcMove
       129: dup
       130: aload_0
       131: invokespecial #70                 // Method ext/mods/gameserver/model/actor/move/NpcMove."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
       134: putfield      #73                 // Field _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
       137: aload_2
       138: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getPassives:()Ljava/util/List;
       141: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       146: astore_3
       147: aload_3
       148: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       153: ifeq          180
       156: aload_3
       157: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       162: checkcast     #99                 // class ext/mods/gameserver/skills/L2Skill
       165: astore        4
       167: aload_0
       168: aload         4
       170: aload_0
       171: invokevirtual #101                // Method ext/mods/gameserver/skills/L2Skill.getStatFuncs:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       174: invokevirtual #105                // Method addStatFuncs:(Ljava/util/List;)V
       177: goto          147
       180: aload_0
       181: invokevirtual #109                // Method getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       184: invokevirtual #113                // Method ext/mods/gameserver/model/actor/status/NpcStatus.initializeValues:()V
       187: aload_0
       188: aload_2
       189: invokevirtual #118                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getLeftHand:()I
       192: putfield      #122                // Field _leftHandItemId:I
       195: aload_0
       196: aload_2
       197: invokevirtual #125                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getRightHand:()I
       200: putfield      #128                // Field _rightHandItemId:I
       203: aload_0
       204: aload_2
       205: invokevirtual #131                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getCollisionHeight:()D
       208: putfield      #135                // Field _currentCollisionHeight:D
       211: aload_0
       212: aload_2
       213: invokevirtual #139                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getCollisionRadius:()D
       216: putfield      #142                // Field _currentCollisionRadius:D
       219: aload_0
       220: invokestatic  #145                // Method ext/mods/gameserver/custom/data/PolymorphData.getInstance:()Lext/mods/gameserver/custom/data/PolymorphData;
       223: aload_2
       224: invokevirtual #151                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
       227: invokevirtual #154                // Method ext/mods/gameserver/custom/data/PolymorphData.getFakePc:(I)Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
       230: putfield      #158                // Field _fakePc:Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
       233: aload_0
       234: aload_2
       235: invokevirtual #162                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
       238: invokevirtual #166                // Method setName:(Ljava/lang/String;)V
       241: aload_0
       242: aload_2
       243: invokevirtual #170                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getTitle:()Ljava/lang/String;
       246: invokevirtual #173                // Method setTitle:(Ljava/lang/String;)V
       249: aload_0
       250: aload_2
       251: invokevirtual #176                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isUndying:()Z
       254: ifne          261
       257: iconst_1
       258: goto          262
       261: iconst_0
       262: invokevirtual #179                // Method setMortal:(Z)V
       265: aload_0
       266: aload_2
       267: invokevirtual #183                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getResidence:()Lext/mods/gameserver/model/residence/Residence;
       270: putfield      #187                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
       273: return
      LineNumberTable:
        line 180: 0
        line 105: 6
        line 114: 17
        line 115: 22
        line 116: 27
        line 118: 32
        line 128: 37
        line 130: 42
        line 131: 88
        line 133: 93
        line 169: 98
        line 171: 103
        line 172: 114
        line 182: 125
        line 184: 137
        line 185: 167
        line 187: 180
        line 189: 187
        line 190: 195
        line 192: 203
        line 193: 211
        line 195: 219
        line 197: 233
        line 198: 241
        line 200: 249
        line 202: 265
        line 203: 273
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          167      10     4 skill   Lext/mods/gameserver/skills/L2Skill;
            0     274     0  this   Lext/mods/gameserver/model/actor/Npc;
            0     274     1 objectId   I
            0     274     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 147
          locals = [ class ext/mods/gameserver/model/actor/Npc, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 32
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 80
          stack = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Npc, int, class ext/mods/gameserver/model/actor/template/NpcTemplate ]
          stack = [ class ext/mods/gameserver/model/actor/Npc, int ]

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #191                // Method getName:()Ljava/lang/String;
         4: bipush        20
         6: invokestatic  #192                // Method ext/mods/commons/lang/StringUtil.trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
         9: aload_0
        10: invokevirtual #198                // Method getObjectId:()I
        13: invokedynamic #201,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        18: areturn
      LineNumberTable:
        line 208: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.model.actor.ai.type.NpcAI<? extends ext.mods.gameserver.model.actor.Npc> getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #204                // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
         4: checkcast     #208                // class ext/mods/gameserver/model/actor/ai/type/NpcAI
         7: areturn
      LineNumberTable:
        line 214: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Npc;
    Signature: #1479                        // ()Lext/mods/gameserver/model/actor/ai/type/NpcAI<+Lext/mods/gameserver/model/actor/Npc;>;

  public void setAI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #208                // class ext/mods/gameserver/model/actor/ai/type/NpcAI
         4: dup
         5: aload_0
         6: invokespecial #210                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
         9: putfield      #204                // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        12: return
      LineNumberTable:
        line 220: 0
        line 221: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.model.actor.cast.NpcCast getCast();
    descriptor: ()Lext/mods/gameserver/model/actor/cast/NpcCast;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #211                // Field _cast:Lext/mods/gameserver/model/actor/cast/CreatureCast;
         4: checkcast     #215                // class ext/mods/gameserver/model/actor/cast/NpcCast
         7: areturn
      LineNumberTable:
        line 226: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void setCast();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #215                // class ext/mods/gameserver/model/actor/cast/NpcCast
         4: dup
         5: aload_0
         6: invokespecial #217                // Method ext/mods/gameserver/model/actor/cast/NpcCast."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
         9: putfield      #211                // Field _cast:Lext/mods/gameserver/model/actor/cast/CreatureCast;
        12: return
      LineNumberTable:
        line 232: 0
        line 233: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.model.actor.status.NpcStatus<? extends ext.mods.gameserver.model.actor.Npc> getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/NpcStatus;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #218                // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
         4: checkcast     #114                // class ext/mods/gameserver/model/actor/status/NpcStatus
         7: areturn
      LineNumberTable:
        line 238: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Npc;
    Signature: #1482                        // ()Lext/mods/gameserver/model/actor/status/NpcStatus<+Lext/mods/gameserver/model/actor/Npc;>;

  public void setStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #114                // class ext/mods/gameserver/model/actor/status/NpcStatus
         4: dup
         5: aload_0
         6: invokespecial #222                // Method ext/mods/gameserver/model/actor/status/NpcStatus."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
         9: putfield      #218                // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
        12: return
      LineNumberTable:
        line 244: 0
        line 245: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.model.actor.attack.NpcAttack getAttack();
    descriptor: ()Lext/mods/gameserver/model/actor/attack/NpcAttack;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #223                // Field _attack:Lext/mods/gameserver/model/actor/attack/CreatureAttack;
         4: checkcast     #227                // class ext/mods/gameserver/model/actor/attack/NpcAttack
         7: areturn
      LineNumberTable:
        line 250: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void setAttack();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #227                // class ext/mods/gameserver/model/actor/attack/NpcAttack
         4: dup
         5: aload_0
         6: invokespecial #229                // Method ext/mods/gameserver/model/actor/attack/NpcAttack."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
         9: putfield      #223                // Field _attack:Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        12: return
      LineNumberTable:
        line 256: 0
        line 257: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Npc;

  public final ext.mods.gameserver.model.actor.template.NpcTemplate getTemplate();
    descriptor: ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #230                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         4: checkcast     #78                 // class ext/mods/gameserver/model/actor/template/NpcTemplate
         7: areturn
      LineNumberTable:
        line 262: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void setWalkOrRun(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: iload_1
         1: aload_0
         2: invokevirtual #234                // Method isRunning:()Z
         5: if_icmpne     9
         8: return
         9: aload_0
        10: iload_1
        11: invokespecial #237                // Method ext/mods/gameserver/model/actor/Creature.setWalkOrRun:(Z)V
        14: aload_0
        15: ldc           #240                // class ext/mods/gameserver/model/actor/Player
        17: aload_0
        18: invokedynamic #242,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
        23: invokevirtual #246                // Method forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
        26: return
      LineNumberTable:
        line 268: 0
        line 269: 8
        line 271: 9
        line 273: 14
        line 274: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      27     1 value   Z
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public boolean isUndead();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #253                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getRace:()Lext/mods/gameserver/enums/actors/NpcRace;
         7: getstatic     #257                // Field ext/mods/gameserver/enums/actors/NpcRace.UNDEAD:Lext/mods/gameserver/enums/actors/NpcRace;
        10: if_acmpne     17
        13: iconst_1
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 279: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void updateAbnormalEffect();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #240                // class ext/mods/gameserver/model/actor/Player
         3: aload_0
         4: invokedynamic #242,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/Consumer;
         9: invokevirtual #246                // Method forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
        12: return
      LineNumberTable:
        line 285: 0
        line 286: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Npc;

  public final void setTitle(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ifnonnull     11
         5: ldc_w         #263                // String
         8: goto          12
        11: aload_1
        12: putfield      #265                // Field _title:Ljava/lang/String;
        15: return
      LineNumberTable:
        line 291: 0
        line 292: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      16     1 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 75 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Npc, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Npc, class java/lang/String ]

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: invokevirtual #269                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
         4: getstatic     #273                // Field ext/mods/gameserver/enums/FloodProtector.ACTION:Lext/mods/gameserver/enums/FloodProtector;
         7: invokevirtual #279                // Method ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
        10: ifne          14
        13: return
        14: aload_0
        15: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        18: bipush        8
        20: invokestatic  #289                // Method ext/mods/commons/random/Rnd.get:(I)I
        23: invokevirtual #295                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.onRandomAnimation:(I)V
        26: invokestatic  #299                // Method ext/mods/extensions/listener/manager/NpcListenerManager.getInstance:()Lext/mods/extensions/listener/manager/NpcListenerManager;
        29: aload_0
        30: aload_1
        31: invokevirtual #304                // Method ext/mods/extensions/listener/manager/NpcListenerManager.notifyNpcInteract:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
        34: ifeq          38
        37: return
        38: aload_1
        39: invokevirtual #308                // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
        42: aload_0
        43: invokevirtual #198                // Method getObjectId:()I
        46: invokevirtual #312                // Method ext/mods/gameserver/model/actor/container/player/QuestList.setLastQuestNpcObjectId:(I)V
        49: aload_0
        50: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        53: getstatic     #317                // Field ext/mods/gameserver/enums/EventHandler.AI_TALKED:Lext/mods/gameserver/enums/EventHandler;
        56: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        59: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        64: astore_2
        65: aload_2
        66: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        71: ifeq          91
        74: aload_2
        75: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        80: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
        83: astore_3
        84: aload_3
        85: aload_0
        86: aload_1
        87: invokevirtual #329                // Method ext/mods/gameserver/scripting/Quest.notifyTALKED:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
        90: return
        91: aload_0
        92: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        95: getstatic     #333                // Field ext/mods/gameserver/enums/EventHandler.FIRST_TALK:Lext/mods/gameserver/enums/EventHandler;
        98: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       101: astore_2
       102: aload_2
       103: invokeinterface #336,  1          // InterfaceMethod java/util/List.size:()I
       108: iconst_1
       109: if_icmpne     130
       112: aload_2
       113: iconst_0
       114: invokeinterface #339,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       119: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
       122: aload_0
       123: aload_1
       124: invokevirtual #342                // Method ext/mods/gameserver/scripting/Quest.notifyFirstTalk:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
       127: goto          150
       130: aload_0
       131: getfield      #345                // Field _observerGroups:Ljava/util/List;
       134: ifnull        145
       137: aload_0
       138: aload_1
       139: invokevirtual #348                // Method showObserverWindow:(Lext/mods/gameserver/model/actor/Player;)V
       142: goto          150
       145: aload_0
       146: aload_1
       147: invokevirtual #352                // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;)V
       150: return
      LineNumberTable:
        line 297: 0
        line 298: 13
        line 300: 14
        line 302: 26
        line 303: 37
        line 305: 38
        line 307: 49
        line 309: 84
        line 310: 90
        line 313: 91
        line 314: 102
        line 315: 112
        line 316: 130
        line 317: 137
        line 319: 145
        line 321: 150
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           84       7     3 script   Lext/mods/gameserver/scripting/Quest;
            0     151     0  this   Lext/mods/gameserver/model/actor/Npc;
            0     151     1 player   Lext/mods/gameserver/model/actor/Player;
          102      49     2 scripts   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          102      49     2 scripts   Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
      StackMapTable: number_of_entries = 7
        frame_type = 14 /* same */
        frame_type = 23 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 25
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class java/util/List ]
        frame_type = 14 /* same */
        frame_type = 4 /* same */

  public boolean isMovementDisabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #355                // Method ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
         4: ifne          17
         7: aload_0
         8: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        11: invokevirtual #358                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.canMove:()Z
        14: ifne          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 326: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void sendInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: new           #361                // class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
         4: dup
         5: aload_0
         6: aload_1
         7: invokespecial #363                // Method ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
        10: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        13: return
      LineNumberTable:
        line 332: 0
        line 333: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      14     1 player   Lext/mods/gameserver/model/actor/Player;

  public boolean isChargedShot(ext.mods.gameserver.enums.items.ShotType);
    descriptor: (Lext/mods/gameserver/enums/items/ShotType;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #25                 // Field _shotsMask:I
         4: aload_1
         5: invokevirtual #369                // Method ext/mods/gameserver/enums/items/ShotType.getMask:()I
         8: iand
         9: aload_1
        10: invokevirtual #369                // Method ext/mods/gameserver/enums/items/ShotType.getMask:()I
        13: if_icmpne     20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 338: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      22     1  type   Lext/mods/gameserver/enums/items/ShotType;
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setChargedShot(ext.mods.gameserver.enums.items.ShotType, boolean);
    descriptor: (Lext/mods/gameserver/enums/items/ShotType;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: iload_2
         1: ifeq          20
         4: aload_0
         5: dup
         6: getfield      #25                 // Field _shotsMask:I
         9: aload_1
        10: invokevirtual #369                // Method ext/mods/gameserver/enums/items/ShotType.getMask:()I
        13: ior
        14: putfield      #25                 // Field _shotsMask:I
        17: goto          35
        20: aload_0
        21: dup
        22: getfield      #25                 // Field _shotsMask:I
        25: aload_1
        26: invokevirtual #369                // Method ext/mods/gameserver/enums/items/ShotType.getMask:()I
        29: iconst_m1
        30: ixor
        31: iand
        32: putfield      #25                 // Field _shotsMask:I
        35: return
      LineNumberTable:
        line 344: 0
        line 345: 4
        line 347: 20
        line 348: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      36     1  type   Lext/mods/gameserver/enums/items/ShotType;
            0      36     2 charged   Z
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 14 /* same */

  public void rechargeShots(boolean, boolean);
    descriptor: (ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=3, args_size=3
         0: iload_1
         1: ifeq          62
         4: aload_0
         5: getfield      #18                 // Field _currentSsCount:I
         8: ifle          21
        11: aload_0
        12: getstatic     #374                // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
        15: invokevirtual #378                // Method isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        18: ifeq          22
        21: return
        22: aload_0
        23: dup
        24: getfield      #18                 // Field _currentSsCount:I
        27: iconst_1
        28: isub
        29: putfield      #18                 // Field _currentSsCount:I
        32: aload_0
        33: new           #382                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
        36: dup
        37: aload_0
        38: aload_0
        39: sipush        2154
        42: iconst_1
        43: iconst_0
        44: iconst_0
        45: invokespecial #384                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
        48: sipush        600
        51: invokevirtual #387                // Method broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
        54: aload_0
        55: getstatic     #374                // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
        58: iconst_1
        59: invokevirtual #391                // Method setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
        62: iload_2
        63: ifeq          124
        66: aload_0
        67: getfield      #22                 // Field _currentSpsCount:I
        70: ifle          83
        73: aload_0
        74: getstatic     #395                // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
        77: invokevirtual #378                // Method isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        80: ifeq          84
        83: return
        84: aload_0
        85: dup
        86: getfield      #22                 // Field _currentSpsCount:I
        89: iconst_1
        90: isub
        91: putfield      #22                 // Field _currentSpsCount:I
        94: aload_0
        95: new           #382                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
        98: dup
        99: aload_0
       100: aload_0
       101: sipush        2061
       104: iconst_1
       105: iconst_0
       106: iconst_0
       107: invokespecial #384                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       110: sipush        600
       113: invokevirtual #387                // Method broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
       116: aload_0
       117: getstatic     #395                // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       120: iconst_1
       121: invokevirtual #391                // Method setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       124: return
      LineNumberTable:
        line 353: 0
        line 355: 4
        line 356: 21
        line 358: 22
        line 360: 32
        line 361: 54
        line 364: 62
        line 366: 66
        line 367: 83
        line 369: 84
        line 371: 94
        line 372: 116
        line 374: 124
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     125     0  this   Lext/mods/gameserver/model/actor/Npc;
            0     125     1 physical   Z
            0     125     2 magic   Z
      StackMapTable: number_of_entries = 6
        frame_type = 21 /* same */
        frame_type = 0 /* same */
        frame_type = 39 /* same */
        frame_type = 20 /* same */
        frame_type = 0 /* same */
        frame_type = 39 /* same */

  public int getSkillLevel(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: iload_1
         2: invokevirtual #398                // Method getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
         5: astore_2
         6: aload_2
         7: ifnonnull     14
        10: iconst_0
        11: goto          18
        14: aload_2
        15: invokevirtual #402                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
        18: ireturn
      LineNumberTable:
        line 379: 0
        line 380: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      19     1 skillId   I
            6      13     2 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.skills.L2Skill getSkill(int);
    descriptor: (I)Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #405                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getSkills:()Ljava/util/Map;
         7: invokeinterface #409,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        12: invokeinterface #415,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        17: iload_1
        18: invokedynamic #421,  0            // InvokeDynamic #2:test:(I)Ljava/util/function/Predicate;
        23: invokeinterface #425,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        28: invokeinterface #431,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        33: aconst_null
        34: invokevirtual #435                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        37: checkcast     #99                 // class ext/mods/gameserver/skills/L2Skill
        40: areturn
      LineNumberTable:
        line 386: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      41     1 skillId   I

  public ext.mods.gameserver.model.item.instance.ItemInstance getActiveWeaponInstance();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 392: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.model.item.kind.Weapon getActiveWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Weapon;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: invokestatic  #441                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
         3: aload_0
         4: getfield      #128                // Field _rightHandItemId:I
         7: invokevirtual #446                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        10: astore_1
        11: aload_1
        12: instanceof    #449                // class ext/mods/gameserver/model/item/kind/Weapon
        15: ifeq          27
        18: aload_1
        19: checkcast     #449                // class ext/mods/gameserver/model/item/kind/Weapon
        22: astore_2
        23: aload_2
        24: goto          28
        27: aconst_null
        28: areturn
      LineNumberTable:
        line 398: 0
        line 399: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       4     2 weapon   Lext/mods/gameserver/model/item/kind/Weapon;
            0      29     0  this   Lext/mods/gameserver/model/actor/Npc;
           11      18     1  item   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/kind/Weapon ]

  public ext.mods.gameserver.model.item.instance.ItemInstance getSecondaryWeaponInstance();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 405: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.model.item.kind.Item getSecondaryWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Item;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #441                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
         3: aload_0
         4: getfield      #122                // Field _leftHandItemId:I
         7: invokevirtual #446                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        10: areturn
      LineNumberTable:
        line 411: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void reduceCurrentHp(double, ext.mods.gameserver.model.actor.Creature, boolean, boolean, ext.mods.gameserver.skills.L2Skill);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=13, args_size=6
         0: aload_3
         1: ifnull        474
         4: aload_0
         5: invokevirtual #451                // Method isDead:()Z
         8: ifne          474
        11: aload_3
        12: invokevirtual #454                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        15: astore        7
        17: aload         7
        19: ifnull        48
        22: aload         7
        24: invokevirtual #458                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        27: ifeq          48
        30: aload         7
        32: invokevirtual #461                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
        35: invokevirtual #465                // Method ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
        38: ifne          48
        41: aload         7
        43: bipush        10
        45: invokevirtual #470                // Method ext/mods/gameserver/model/actor/Player.setTemporarilyVisible:(I)V
        48: aload_0
        49: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        52: invokevirtual #473                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
        55: aload_3
        56: dload_1
        57: dconst_0
        58: invokevirtual #477                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
        61: aload_0
        62: aload_3
        63: putfield      #483                // Field _lastAttacker:Lext/mods/gameserver/model/actor/Creature;
        66: aload_0
        67: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        70: getstatic     #487                // Field ext/mods/gameserver/enums/EventHandler.ATTACKED:Lext/mods/gameserver/enums/EventHandler;
        73: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        76: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        81: astore        8
        83: aload         8
        85: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        90: ifeq          119
        93: aload         8
        95: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       100: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
       103: astore        9
       105: aload         9
       107: aload_0
       108: aload_3
       109: dload_1
       110: d2i
       111: aload         6
       113: invokevirtual #490                // Method ext/mods/gameserver/scripting/Quest.onAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
       116: goto          83
       119: aload_0
       120: invokevirtual #494                // Method isMaster:()Z
       123: ifne          133
       126: aload_0
       127: invokevirtual #497                // Method hasMaster:()Z
       130: ifeq          371
       133: aload_0
       134: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       137: getstatic     #500                // Field ext/mods/gameserver/enums/EventHandler.PARTY_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
       140: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       143: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       148: astore        8
       150: aload         8
       152: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       157: ifeq          185
       160: aload         8
       162: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       167: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
       170: astore        9
       172: aload         9
       174: aload_0
       175: aload_0
       176: aload_3
       177: dload_1
       178: d2i
       179: invokevirtual #503                // Method ext/mods/gameserver/scripting/Quest.onPartyAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;I)V
       182: goto          150
       185: aload_0
       186: invokevirtual #507                // Method getMaster:()Lext/mods/gameserver/model/actor/Npc;
       189: astore        8
       191: aload         8
       193: ifnull        264
       196: aload         8
       198: invokevirtual #451                // Method isDead:()Z
       201: ifne          264
       204: aload_0
       205: aload         8
       207: if_acmpeq     264
       210: aload         8
       212: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       215: getstatic     #500                // Field ext/mods/gameserver/enums/EventHandler.PARTY_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
       218: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       221: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       226: astore        9
       228: aload         9
       230: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       235: ifeq          264
       238: aload         9
       240: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       245: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
       248: astore        10
       250: aload         10
       252: aload_0
       253: aload         8
       255: aload_3
       256: dload_1
       257: d2i
       258: invokevirtual #503                // Method ext/mods/gameserver/scripting/Quest.onPartyAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;I)V
       261: goto          228
       264: aload_0
       265: invokevirtual #511                // Method getMinions:()Ljava/util/Set;
       268: invokeinterface #515,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       273: astore        9
       275: aload         9
       277: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       282: ifeq          371
       285: aload         9
       287: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       292: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
       295: astore        10
       297: aload         10
       299: aload_0
       300: if_acmpeq     275
       303: aload         10
       305: invokevirtual #451                // Method isDead:()Z
       308: ifeq          314
       311: goto          275
       314: aload         10
       316: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       319: getstatic     #500                // Field ext/mods/gameserver/enums/EventHandler.PARTY_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
       322: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       325: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       330: astore        11
       332: aload         11
       334: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       339: ifeq          368
       342: aload         11
       344: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       349: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
       352: astore        12
       354: aload         12
       356: aload_0
       357: aload         10
       359: aload_3
       360: dload_1
       361: d2i
       362: invokevirtual #503                // Method ext/mods/gameserver/scripting/Quest.onPartyAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;I)V
       365: goto          332
       368: goto          275
       371: aload_0
       372: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       375: invokevirtual #518                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
       378: astore        8
       380: aload         8
       382: ifnull        474
       385: aload_0
       386: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       389: invokevirtual #522                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClanRange:()I
       392: ifle          474
       395: aload_0
       396: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       399: getstatic     #525                // Field ext/mods/gameserver/enums/EventHandler.CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
       402: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       405: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       410: astore        9
       412: aload         9
       414: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       419: ifeq          449
       422: aload         9
       424: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       429: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
       432: astore        10
       434: aload         10
       436: aload_0
       437: aload_0
       438: aload_3
       439: dload_1
       440: d2i
       441: aload         6
       443: invokevirtual #528                // Method ext/mods/gameserver/scripting/Quest.onClanAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
       446: goto          412
       449: aload_0
       450: ldc           #13                 // class ext/mods/gameserver/model/actor/Npc
       452: aload_0
       453: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       456: invokevirtual #522                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClanRange:()I
       459: aload_0
       460: aload         8
       462: aload_3
       463: dload_1
       464: aload         6
       466: invokedynamic #532,  0            // InvokeDynamic #3:accept:(Lext/mods/gameserver/model/actor/Npc;[Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Consumer;
       471: invokevirtual #535                // Method forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
       474: aload_0
       475: dload_1
       476: aload_3
       477: iload         4
       479: iload         5
       481: aload         6
       483: invokespecial #539                // Method ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
       486: return
      LineNumberTable:
        line 417: 0
        line 419: 11
        line 420: 17
        line 421: 41
        line 422: 48
        line 424: 61
        line 427: 66
        line 428: 105
        line 430: 119
        line 432: 133
        line 433: 172
        line 435: 185
        line 437: 191
        line 439: 210
        line 440: 250
        line 443: 264
        line 445: 297
        line 446: 311
        line 448: 314
        line 449: 354
        line 450: 368
        line 453: 371
        line 454: 380
        line 456: 395
        line 457: 434
        line 459: 449
        line 479: 474
        line 480: 486
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          105      11     9 quest   Lext/mods/gameserver/scripting/Quest;
          172      10     9 quest   Lext/mods/gameserver/scripting/Quest;
          250      11    10 quest   Lext/mods/gameserver/scripting/Quest;
          354      11    12 quest   Lext/mods/gameserver/scripting/Quest;
          297      71    10 minion   Lext/mods/gameserver/model/actor/Npc;
          191     180     8 master   Lext/mods/gameserver/model/actor/Npc;
          434      12    10 quest   Lext/mods/gameserver/scripting/Quest;
           17     457     7 attackingPlayer   Lext/mods/gameserver/model/actor/Player;
          380      94     8 actorClans   [Ljava/lang/String;
            0     487     0  this   Lext/mods/gameserver/model/actor/Npc;
            0     487     1 damage   D
            0     487     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0     487     4 awake   Z
            0     487     5 isDOT   Z
            0     487     6 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 16
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 35
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 34
        frame_type = 253 /* append */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/actor/Npc, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 35
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 35
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 40
          locals = [ class "[Ljava/lang/String;", class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 249 /* chop */
          offset_delta = 24

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #543                // Method ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: aload_0
        12: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        15: invokevirtual #118                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getLeftHand:()I
        18: putfield      #122                // Field _leftHandItemId:I
        21: aload_0
        22: aload_0
        23: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        26: invokevirtual #125                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getRightHand:()I
        29: putfield      #128                // Field _rightHandItemId:I
        32: aload_0
        33: iconst_0
        34: putfield      #547                // Field _enchantEffect:I
        37: aload_0
        38: aload_0
        39: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        42: invokevirtual #131                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getCollisionHeight:()D
        45: putfield      #135                // Field _currentCollisionHeight:D
        48: aload_0
        49: aload_0
        50: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        53: invokevirtual #139                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getCollisionRadius:()D
        56: putfield      #142                // Field _currentCollisionRadius:D
        59: aload_0
        60: invokevirtual #550                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        63: invokevirtual #554                // Method ext/mods/gameserver/model/actor/move/CreatureMove.resetGeoPathFailCount:()V
        66: aload_0
        67: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        70: invokevirtual #559                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.resetLifeTime:()V
        73: invokestatic  #562                // Method ext/mods/gameserver/taskmanager/AiTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AiTaskManager;
        76: aload_0
        77: invokevirtual #567                // Method ext/mods/gameserver/taskmanager/AiTaskManager.remove:(Lext/mods/gameserver/model/actor/Npc;)V
        80: invokestatic  #570                // Method ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
        83: aload_0
        84: aload_0
        85: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        88: invokevirtual #575                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getCorpseTime:()I
        91: invokevirtual #578                // Method ext/mods/gameserver/taskmanager/DecayTaskManager.add:(Lext/mods/gameserver/model/actor/Creature;I)V
        94: aload_0
        95: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        98: getstatic     #582                // Field ext/mods/gameserver/enums/EventHandler.MY_DYING:Lext/mods/gameserver/enums/EventHandler;
       101: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       104: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       109: astore_2
       110: aload_2
       111: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       116: ifeq          147
       119: aload_2
       120: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       125: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
       128: astore_3
       129: aload_0
       130: aload_3
       131: aload_1
       132: invokedynamic #585,  0            // InvokeDynamic #4:run:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
       137: ldc2_w        #589                // long 3000l
       140: invokestatic  #591                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       143: pop
       144: goto          110
       147: aload_0
       148: invokevirtual #494                // Method isMaster:()Z
       151: ifne          161
       154: aload_0
       155: invokevirtual #497                // Method hasMaster:()Z
       158: ifeq          379
       161: aload_0
       162: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       165: getstatic     #597                // Field ext/mods/gameserver/enums/EventHandler.PARTY_DIED:Lext/mods/gameserver/enums/EventHandler;
       168: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       171: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       176: astore_2
       177: aload_2
       178: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       183: ifeq          205
       186: aload_2
       187: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       192: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
       195: astore_3
       196: aload_3
       197: aload_0
       198: aload_0
       199: invokevirtual #600                // Method ext/mods/gameserver/scripting/Quest.onPartyDied:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;)V
       202: goto          177
       205: aload_0
       206: invokevirtual #507                // Method getMaster:()Lext/mods/gameserver/model/actor/Npc;
       209: astore_2
       210: aload_2
       211: ifnull        265
       214: aload_0
       215: aload_2
       216: if_acmpeq     265
       219: aload_2
       220: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       223: getstatic     #597                // Field ext/mods/gameserver/enums/EventHandler.PARTY_DIED:Lext/mods/gameserver/enums/EventHandler;
       226: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       229: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       234: astore_3
       235: aload_3
       236: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       241: ifeq          265
       244: aload_3
       245: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       250: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
       253: astore        4
       255: aload         4
       257: aload_0
       258: aload_2
       259: invokevirtual #600                // Method ext/mods/gameserver/scripting/Quest.onPartyDied:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;)V
       262: goto          235
       265: aload_0
       266: invokevirtual #511                // Method getMinions:()Ljava/util/Set;
       269: invokeinterface #515,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       274: astore_3
       275: aload_3
       276: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       281: ifeq          358
       284: aload_3
       285: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       290: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
       293: astore        4
       295: aload         4
       297: aload_0
       298: if_acmpne     304
       301: goto          275
       304: aload         4
       306: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       309: getstatic     #597                // Field ext/mods/gameserver/enums/EventHandler.PARTY_DIED:Lext/mods/gameserver/enums/EventHandler;
       312: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       315: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       320: astore        5
       322: aload         5
       324: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       329: ifeq          355
       332: aload         5
       334: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       339: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
       342: astore        6
       344: aload         6
       346: aload_0
       347: aload         4
       349: invokevirtual #600                // Method ext/mods/gameserver/scripting/Quest.onPartyDied:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;)V
       352: goto          322
       355: goto          275
       358: aload_0
       359: invokevirtual #494                // Method isMaster:()Z
       362: ifeq          379
       365: aload_0
       366: invokevirtual #511                // Method getMinions:()Ljava/util/Set;
       369: invokedynamic #604,  0            // InvokeDynamic #5:accept:()Ljava/util/function/Consumer;
       374: invokeinterface #607,  2          // InterfaceMethod java/util/Set.forEach:(Ljava/util/function/Consumer;)V
       379: aload_0
       380: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       383: invokevirtual #518                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
       386: astore_2
       387: aload_2
       388: ifnull        422
       391: aload_0
       392: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       395: invokevirtual #522                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClanRange:()I
       398: ifle          422
       401: aload_0
       402: ldc           #13                 // class ext/mods/gameserver/model/actor/Npc
       404: aload_0
       405: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       408: invokevirtual #522                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClanRange:()I
       411: aload_0
       412: aload_2
       413: aload_1
       414: invokedynamic #611,  0            // InvokeDynamic #6:accept:(Lext/mods/gameserver/model/actor/Npc;[Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Consumer;
       419: invokevirtual #535                // Method forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
       422: aload_0
       423: getfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
       426: ifnull        437
       429: aload_0
       430: getfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
       433: aload_0
       434: invokevirtual #618                // Method ext/mods/gameserver/model/spawn/ASpawn.onDie:(Lext/mods/gameserver/model/actor/Npc;)V
       437: iconst_1
       438: ireturn
      LineNumberTable:
        line 485: 0
        line 486: 8
        line 488: 10
        line 489: 21
        line 491: 32
        line 493: 37
        line 494: 48
        line 496: 59
        line 497: 66
        line 499: 73
        line 501: 80
        line 503: 94
        line 504: 129
        line 506: 147
        line 508: 161
        line 509: 196
        line 511: 205
        line 513: 210
        line 515: 219
        line 516: 255
        line 519: 265
        line 521: 295
        line 522: 301
        line 524: 304
        line 525: 344
        line 526: 355
        line 528: 358
        line 529: 365
        line 532: 379
        line 533: 387
        line 535: 401
        line 554: 422
        line 555: 429
        line 557: 437
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          129      15     3 quest   Lext/mods/gameserver/scripting/Quest;
          196       6     3 quest   Lext/mods/gameserver/scripting/Quest;
          255       7     4 quest   Lext/mods/gameserver/scripting/Quest;
          344       8     6 quest   Lext/mods/gameserver/scripting/Quest;
          295      60     4 minion   Lext/mods/gameserver/model/actor/Npc;
          210     169     2 master   Lext/mods/gameserver/model/actor/Npc;
            0     439     0  this   Lext/mods/gameserver/model/actor/Npc;
            0     439     1 killer   Lext/mods/gameserver/model/actor/Creature;
          387      52     2 actorClans   [Ljava/lang/String;
      StackMapTable: number_of_entries = 16
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 99
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 27
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Npc, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 29
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 32
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 20
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ class "[Ljava/lang/String;" ]
        frame_type = 14 /* same */

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: invokespecial #623                // Method ext/mods/gameserver/model/actor/Creature.onSpawn:()V
         4: aload_0
         5: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
         8: invokevirtual #626                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.cleanupForNextSpawn:()V
        11: aload_0
        12: bipush        8
        14: anewarray     #35                 // class java/lang/Integer
        17: dup
        18: iconst_0
        19: aconst_null
        20: aastore
        21: dup
        22: iconst_1
        23: aconst_null
        24: aastore
        25: dup
        26: iconst_2
        27: aconst_null
        28: aastore
        29: dup
        30: iconst_3
        31: aconst_null
        32: aastore
        33: dup
        34: iconst_4
        35: aconst_null
        36: aastore
        37: dup
        38: iconst_5
        39: aconst_null
        40: aastore
        41: dup
        42: bipush        6
        44: aconst_null
        45: aastore
        46: dup
        47: bipush        7
        49: aconst_null
        50: aastore
        51: invokestatic  #37                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        54: putfield      #43                 // Field _followSlots:Ljava/util/List;
        57: aload_0
        58: aconst_null
        59: putfield      #47                 // Field _lastFollowingLoc:Lext/mods/gameserver/model/location/Location;
        62: aload_0
        63: getstatic     #629                // Field ext/mods/Config.NPC_SOULSHOT:Z
        66: ifeq          86
        69: aload_0
        70: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        73: invokevirtual #634                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAiParams:()Lext/mods/gameserver/model/memo/NpcMemo;
        76: ldc_w         #638                // String SoulShot
        79: iconst_0
        80: invokevirtual #640                // Method ext/mods/gameserver/model/memo/NpcMemo.getInteger:(Ljava/lang/String;I)I
        83: goto          87
        86: iconst_0
        87: putfield      #18                 // Field _currentSsCount:I
        90: aload_0
        91: getstatic     #646                // Field ext/mods/Config.NPC_SPIRITSHOT:Z
        94: ifeq          114
        97: aload_0
        98: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       101: invokevirtual #634                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAiParams:()Lext/mods/gameserver/model/memo/NpcMemo;
       104: ldc_w         #649                // String SpiritShot
       107: iconst_0
       108: invokevirtual #640                // Method ext/mods/gameserver/model/memo/NpcMemo.getInteger:(Ljava/lang/String;I)I
       111: goto          115
       114: iconst_0
       115: putfield      #22                 // Field _currentSpsCount:I
       118: aload_0
       119: iconst_1
       120: invokevirtual #651                // Method setWalkOrRun:(Z)V
       123: aload_0
       124: invokevirtual #652                // Method getRegion:()Lext/mods/gameserver/model/WorldRegion;
       127: ifnull        140
       130: aload_0
       131: invokevirtual #652                // Method getRegion:()Lext/mods/gameserver/model/WorldRegion;
       134: invokevirtual #656                // Method ext/mods/gameserver/model/WorldRegion.isActive:()Z
       137: ifne          157
       140: aload_0
       141: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       144: invokevirtual #661                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isNoSleepMode:()Z
       147: ifne          157
       150: aload_0
       151: invokevirtual #664                // Method isInMyTerritory:()Z
       154: ifne          164
       157: invokestatic  #562                // Method ext/mods/gameserver/taskmanager/AiTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AiTaskManager;
       160: aload_0
       161: invokevirtual #667                // Method ext/mods/gameserver/taskmanager/AiTaskManager.add:(Lext/mods/gameserver/model/actor/Npc;)V
       164: aload_0
       165: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       168: getstatic     #669                // Field ext/mods/gameserver/enums/EventHandler.CREATED:Lext/mods/gameserver/enums/EventHandler;
       171: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       174: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       179: astore_1
       180: aload_1
       181: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       186: ifeq          207
       189: aload_1
       190: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       195: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
       198: astore_2
       199: aload_2
       200: aload_0
       201: invokevirtual #672                // Method ext/mods/gameserver/scripting/Quest.onCreated:(Lext/mods/gameserver/model/actor/Npc;)V
       204: goto          180
       207: aload_0
       208: getfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
       211: ifnull        222
       214: aload_0
       215: getfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
       218: aload_0
       219: invokevirtual #675                // Method ext/mods/gameserver/model/spawn/ASpawn.onSpawn:(Lext/mods/gameserver/model/actor/Npc;)V
       222: invokestatic  #299                // Method ext/mods/extensions/listener/manager/NpcListenerManager.getInstance:()Lext/mods/extensions/listener/manager/NpcListenerManager;
       225: aload_0
       226: invokevirtual #677                // Method ext/mods/extensions/listener/manager/NpcListenerManager.notifyNpcSpawn:(Lext/mods/gameserver/model/actor/Npc;)V
       229: return
      LineNumberTable:
        line 563: 0
        line 565: 4
        line 566: 11
        line 567: 57
        line 569: 62
        line 570: 90
        line 572: 118
        line 574: 123
        line 575: 157
        line 577: 164
        line 578: 199
        line 580: 207
        line 581: 214
        line 583: 222
        line 584: 229
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          199       5     2 quest   Lext/mods/gameserver/scripting/Quest;
            0     230     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 10
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 86
          stack = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
          stack = [ class ext/mods/gameserver/model/actor/Npc, int ]
        frame_type = 90 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
          stack = [ class ext/mods/gameserver/model/actor/Npc, int ]
        frame_type = 24 /* same */
        frame_type = 16 /* same */
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 26
        frame_type = 14 /* same */

  public void onDecay();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #680                // Method isDecayed:()Z
         4: ifeq          8
         7: return
         8: aload_0
         9: iconst_1
        10: invokevirtual #683                // Method setIsDead:(Z)V
        13: aload_0
        14: iconst_1
        15: invokevirtual #686                // Method setDecayed:(Z)V
        18: aload_0
        19: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        22: getstatic     #689                // Field ext/mods/gameserver/enums/EventHandler.DECAYED:Lext/mods/gameserver/enums/EventHandler;
        25: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        28: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        33: astore_1
        34: aload_1
        35: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        40: ifeq          61
        43: aload_1
        44: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        49: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
        52: astore_2
        53: aload_2
        54: aload_0
        55: invokevirtual #692                // Method ext/mods/gameserver/scripting/Quest.onDecayed:(Lext/mods/gameserver/model/actor/Npc;)V
        58: goto          34
        61: aload_0
        62: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        65: invokevirtual #695                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:()Ljava/util/Map;
        68: invokeinterface #409,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        73: invokeinterface #697,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        78: astore_1
        79: aload_1
        80: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        85: ifeq          145
        88: aload_1
        89: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        94: checkcast     #84                 // class java/util/List
        97: astore_2
        98: aload_2
        99: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       104: astore_3
       105: aload_3
       106: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       111: ifeq          142
       114: aload_3
       115: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       120: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
       123: astore        4
       125: aload         4
       127: instanceof    #698                // class ext/mods/gameserver/scripting/script/ai/individual/DefaultNpc
       130: ifeq          139
       133: aload         4
       135: aload_0
       136: invokevirtual #700                // Method ext/mods/gameserver/scripting/Quest.cancelQuestTimers:(Lext/mods/gameserver/model/actor/Npc;)V
       139: goto          105
       142: goto          79
       145: aload_0
       146: invokespecial #703                // Method ext/mods/gameserver/model/actor/Creature.onDecay:()V
       149: aload_0
       150: getfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
       153: ifnull        164
       156: aload_0
       157: getfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
       160: aload_0
       161: invokevirtual #706                // Method ext/mods/gameserver/model/spawn/ASpawn.onDecay:(Lext/mods/gameserver/model/actor/Npc;)V
       164: aload_0
       165: bipush        8
       167: anewarray     #35                 // class java/lang/Integer
       170: dup
       171: iconst_0
       172: aconst_null
       173: aastore
       174: dup
       175: iconst_1
       176: aconst_null
       177: aastore
       178: dup
       179: iconst_2
       180: aconst_null
       181: aastore
       182: dup
       183: iconst_3
       184: aconst_null
       185: aastore
       186: dup
       187: iconst_4
       188: aconst_null
       189: aastore
       190: dup
       191: iconst_5
       192: aconst_null
       193: aastore
       194: dup
       195: bipush        6
       197: aconst_null
       198: aastore
       199: dup
       200: bipush        7
       202: aconst_null
       203: aastore
       204: invokestatic  #37                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
       207: putfield      #43                 // Field _followSlots:Ljava/util/List;
       210: aload_0
       211: aconst_null
       212: putfield      #47                 // Field _lastFollowingLoc:Lext/mods/gameserver/model/location/Location;
       215: invokestatic  #299                // Method ext/mods/extensions/listener/manager/NpcListenerManager.getInstance:()Lext/mods/extensions/listener/manager/NpcListenerManager;
       218: aload_0
       219: invokevirtual #708                // Method ext/mods/extensions/listener/manager/NpcListenerManager.notifyNpcDecay:(Lext/mods/gameserver/model/actor/Npc;)V
       222: return
      LineNumberTable:
        line 589: 0
        line 590: 7
        line 592: 8
        line 594: 13
        line 596: 18
        line 597: 53
        line 599: 61
        line 601: 98
        line 603: 125
        line 604: 133
        line 605: 139
        line 606: 142
        line 608: 145
        line 610: 149
        line 611: 156
        line 613: 164
        line 614: 210
        line 615: 215
        line 616: 222
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53       5     2 quest   Lext/mods/gameserver/scripting/Quest;
          125      14     4 script   Lext/mods/gameserver/scripting/Quest;
           98      44     2 scripts   Ljava/util/List;
            0     223     0  this   Lext/mods/gameserver/model/actor/Npc;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           98      44     2 scripts   Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
      StackMapTable: number_of_entries = 9
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 26
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 33 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 18 /* same */

  public void deleteMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #711                // Method onDecay:()V
         4: invokestatic  #562                // Method ext/mods/gameserver/taskmanager/AiTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AiTaskManager;
         7: aload_0
         8: invokevirtual #567                // Method ext/mods/gameserver/taskmanager/AiTaskManager.remove:(Lext/mods/gameserver/model/actor/Npc;)V
        11: invokestatic  #570                // Method ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
        14: aload_0
        15: invokevirtual #712                // Method ext/mods/gameserver/taskmanager/DecayTaskManager.cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
        18: pop
        19: aload_0
        20: invokevirtual #715                // Method stopAllEffects:()V
        23: aload_0
        24: invokespecial #718                // Method ext/mods/gameserver/model/actor/Creature.deleteMe:()V
        27: return
      LineNumberTable:
        line 621: 0
        line 623: 4
        line 625: 11
        line 627: 19
        line 629: 23
        line 630: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/Npc;

  public double getCollisionHeight();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #135                // Field _currentCollisionHeight:D
         4: dreturn
      LineNumberTable:
        line 635: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public double getCollisionRadius();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #142                // Field _currentCollisionRadius:D
         4: dreturn
      LineNumberTable:
        line 641: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public boolean isAttackingDisabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #721                // Method ext/mods/gameserver/model/actor/Creature.isAttackingDisabled:()Z
         4: ifne          14
         7: aload_0
         8: invokevirtual #724                // Method isCoreAiDisabled:()Z
        11: ifeq          18
        14: iconst_1
        15: goto          19
        18: iconst_0
        19: ireturn
      LineNumberTable:
        line 647: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 3
        frame_type = 14 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void forceDecay();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #680                // Method isDecayed:()Z
         4: ifeq          8
         7: return
         8: aload_0
         9: invokespecial #727                // Method ext/mods/gameserver/model/actor/Creature.forceDecay:()V
        12: return
      LineNumberTable:
        line 653: 0
        line 654: 7
        line 656: 8
        line 657: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void onActiveRegion();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #562                // Method ext/mods/gameserver/taskmanager/AiTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AiTaskManager;
         3: aload_0
         4: invokevirtual #667                // Method ext/mods/gameserver/taskmanager/AiTaskManager.add:(Lext/mods/gameserver/model/actor/Npc;)V
         7: return
      LineNumberTable:
        line 662: 0
        line 663: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void onInactiveRegion();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #661                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isNoSleepMode:()Z
         7: ifne          47
        10: aload_0
        11: invokevirtual #664                // Method isInMyTerritory:()Z
        14: ifeq          47
        17: aload_0
        18: invokevirtual #715                // Method stopAllEffects:()V
        21: aload_0
        22: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        25: invokevirtual #730                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.setBackToPeace:()V
        28: aload_0
        29: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        32: invokevirtual #733                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.stopRoute:()V
        35: aload_0
        36: iconst_1
        37: invokevirtual #736                // Method abortAll:(Z)V
        40: invokestatic  #562                // Method ext/mods/gameserver/taskmanager/AiTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AiTaskManager;
        43: aload_0
        44: invokevirtual #567                // Method ext/mods/gameserver/taskmanager/AiTaskManager.remove:(Lext/mods/gameserver/model/actor/Npc;)V
        47: return
      LineNumberTable:
        line 668: 0
        line 670: 17
        line 672: 21
        line 674: 28
        line 676: 35
        line 678: 40
        line 680: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 1
        frame_type = 47 /* same */

  public void instantTeleportTo(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: iload         4
         6: invokespecial #739                // Method ext/mods/gameserver/model/actor/Creature.instantTeleportTo:(IIII)V
         9: aload_0
        10: invokevirtual #664                // Method isInMyTerritory:()Z
        13: ifne          23
        16: invokestatic  #562                // Method ext/mods/gameserver/taskmanager/AiTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AiTaskManager;
        19: aload_0
        20: invokevirtual #667                // Method ext/mods/gameserver/taskmanager/AiTaskManager.add:(Lext/mods/gameserver/model/actor/Npc;)V
        23: return
      LineNumberTable:
        line 685: 0
        line 687: 9
        line 688: 16
        line 689: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      24     1     x   I
            0      24     2     y   I
            0      24     3     z   I
            0      24     4 randomOffset   I
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public boolean teleportTo(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: iload         4
         6: invokespecial #743                // Method ext/mods/gameserver/model/actor/Creature.teleportTo:(IIII)Z
         9: ifne          14
        12: iconst_0
        13: ireturn
        14: aload_0
        15: invokevirtual #664                // Method isInMyTerritory:()Z
        18: ifne          28
        21: invokestatic  #562                // Method ext/mods/gameserver/taskmanager/AiTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AiTaskManager;
        24: aload_0
        25: invokevirtual #667                // Method ext/mods/gameserver/taskmanager/AiTaskManager.add:(Lext/mods/gameserver/model/actor/Npc;)V
        28: iconst_1
        29: ireturn
      LineNumberTable:
        line 694: 0
        line 695: 12
        line 697: 14
        line 698: 21
        line 700: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      30     1     x   I
            0      30     2     y   I
            0      30     3     z   I
            0      30     4 randomOffset   I
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 13 /* same */

  public void equipItem(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: iload_2
         2: putfield      #122                // Field _leftHandItemId:I
         5: aload_0
         6: iload_1
         7: putfield      #128                // Field _rightHandItemId:I
        10: aload_0
        11: new           #361                // class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
        14: dup
        15: aload_0
        16: aconst_null
        17: invokespecial #363                // Method ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
        20: invokevirtual #747                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        23: return
      LineNumberTable:
        line 710: 0
        line 711: 5
        line 713: 10
        line 714: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      24     1 rightHandItemId   I
            0      24     2 leftHandItemId   I

  public int getCurrentSsCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _currentSsCount:I
         4: ireturn
      LineNumberTable:
        line 718: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public int getCurrentSpsCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _currentSpsCount:I
         4: ireturn
      LineNumberTable:
        line 723: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.model.spawn.ASpawn getSpawn();
    descriptor: ()Lext/mods/gameserver/model/spawn/ASpawn;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
         4: areturn
      LineNumberTable:
        line 731: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void setSpawn(ext.mods.gameserver.model.spawn.ASpawn);
    descriptor: (Lext/mods/gameserver/model/spawn/ASpawn;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
         5: return
      LineNumberTable:
        line 740: 0
        line 741: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1 spawn   Lext/mods/gameserver/model/spawn/ASpawn;

  public final void setSpawnLocation(ext.mods.gameserver.model.location.SpawnLocation);
    descriptor: (Lext/mods/gameserver/model/location/SpawnLocation;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #750                // Field _spawnLoc:Lext/mods/gameserver/model/location/SpawnLocation;
         5: return
      LineNumberTable:
        line 749: 0
        line 750: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1   loc   Lext/mods/gameserver/model/location/SpawnLocation;

  public final ext.mods.gameserver.model.location.SpawnLocation getSpawnLocation();
    descriptor: ()Lext/mods/gameserver/model/location/SpawnLocation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #750                // Field _spawnLoc:Lext/mods/gameserver/model/location/SpawnLocation;
         4: areturn
      LineNumberTable:
        line 757: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.model.actor.Npc getMaster();
    descriptor: ()Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #754                // Field _master:Lext/mods/gameserver/model/actor/Npc;
         4: areturn
      LineNumberTable:
        line 762: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void setMaster(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #754                // Field _master:Lext/mods/gameserver/model/actor/Npc;
         5: return
      LineNumberTable:
        line 767: 0
        line 768: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1   npc   Lext/mods/gameserver/model/actor/Npc;

  public boolean isMaster();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #758                // Field _minions:Ljava/util/Set;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 772: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean hasMaster();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #754                // Field _master:Lext/mods/gameserver/model/actor/Npc;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 777: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.util.Set<ext.mods.gameserver.model.actor.Npc> getMinions();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #754                // Field _master:Lext/mods/gameserver/model/actor/Npc;
         4: ifnonnull     26
         7: aload_0
         8: getfield      #758                // Field _minions:Ljava/util/Set;
        11: ifnonnull     21
        14: aload_0
        15: invokestatic  #762                // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        18: putfield      #758                // Field _minions:Ljava/util/Set;
        21: aload_0
        22: getfield      #758                // Field _minions:Ljava/util/Set;
        25: areturn
        26: aload_0
        27: getfield      #754                // Field _master:Lext/mods/gameserver/model/actor/Npc;
        30: invokevirtual #511                // Method getMinions:()Ljava/util/Set;
        33: areturn
      LineNumberTable:
        line 782: 0
        line 784: 7
        line 785: 14
        line 787: 21
        line 789: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 4 /* same */
    Signature: #1547                        // ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Npc;>;

  public void teleportToMaster();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #507                // Method getMaster:()Lext/mods/gameserver/model/actor/Npc;
         4: astore_1
         5: aload_1
         6: ifnonnull     10
         9: return
        10: aload_0
        11: aload_0
        12: invokevirtual #768                // Method getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
        15: invokevirtual #772                // Method ext/mods/gameserver/model/spawn/ASpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        18: iconst_0
        19: invokevirtual #776                // Method teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
        22: return
      LineNumberTable:
        line 797: 0
        line 798: 5
        line 799: 9
        line 801: 10
        line 802: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/Npc;
            5      18     1 master   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/actor/Npc ]

  public boolean isInMyTerritory();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #507                // Method getMaster:()Lext/mods/gameserver/model/actor/Npc;
         4: astore_1
         5: aload_1
         6: ifnull        14
         9: aload_1
        10: invokevirtual #664                // Method isInMyTerritory:()Z
        13: ireturn
        14: aload_0
        15: getfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
        18: aload_0
        19: invokevirtual #779                // Method ext/mods/gameserver/model/spawn/ASpawn.isInMyTerritory:(Lext/mods/gameserver/model/WorldObject;)Z
        22: ireturn
      LineNumberTable:
        line 809: 0
        line 810: 5
        line 811: 9
        line 813: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/Npc;
            5      18     1 master   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/Npc ]

  public void scheduleDBRespawn(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #782                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isNoRespawn:()Z
         7: ifeq          30
        10: getstatic     #785                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        13: aload_0
        14: invokevirtual #191                // Method getName:()Ljava/lang/String;
        17: aload_0
        18: invokevirtual #789                // Method getNpcId:()I
        21: invokedynamic #790,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        26: invokevirtual #791                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        29: return
        30: lload_1
        31: lconst_0
        32: lcmp
        33: ifgt          57
        36: getstatic     #785                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        39: aload_0
        40: invokevirtual #191                // Method getName:()Ljava/lang/String;
        43: aload_0
        44: invokevirtual #789                // Method getNpcId:()I
        47: lload_1
        48: invokedynamic #797,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;IJ)Ljava/lang/String;
        53: invokevirtual #791                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        56: return
        57: aload_0
        58: getfield      #800                // Field _respawnTask:Ljava/util/concurrent/ScheduledFuture;
        61: ifnull        83
        64: getstatic     #785                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        67: aload_0
        68: invokevirtual #191                // Method getName:()Ljava/lang/String;
        71: aload_0
        72: invokevirtual #789                // Method getNpcId:()I
        75: invokedynamic #804,  0            // InvokeDynamic #9:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        80: invokevirtual #791                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        83: aload_0
        84: aload_0
        85: invokedynamic #805,  0            // InvokeDynamic #10:run:(Lext/mods/gameserver/model/actor/Npc;)Ljava/lang/Runnable;
        90: lload_1
        91: invokestatic  #591                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        94: putfield      #800                // Field _respawnTask:Ljava/util/concurrent/ScheduledFuture;
        97: return
      LineNumberTable:
        line 818: 0
        line 820: 10
        line 821: 29
        line 824: 30
        line 826: 36
        line 827: 56
        line 830: 57
        line 831: 64
        line 833: 83
        line 838: 97
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      98     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      98     1 delay   J
      StackMapTable: number_of_entries = 3
        frame_type = 30 /* same */
        frame_type = 26 /* same */
        frame_type = 25 /* same */

  public void scheduleRespawn(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=2
         0: aload_0
         1: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #782                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isNoRespawn:()Z
         7: ifeq          30
        10: getstatic     #785                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        13: aload_0
        14: invokevirtual #191                // Method getName:()Ljava/lang/String;
        17: aload_0
        18: invokevirtual #789                // Method getNpcId:()I
        21: invokedynamic #790,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        26: invokevirtual #791                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        29: return
        30: lload_1
        31: lconst_0
        32: lcmp
        33: ifgt          37
        36: return
        37: aload_0
        38: getfield      #800                // Field _respawnTask:Ljava/util/concurrent/ScheduledFuture;
        41: ifnull        63
        44: getstatic     #785                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        47: aload_0
        48: invokevirtual #191                // Method getName:()Ljava/lang/String;
        51: aload_0
        52: invokevirtual #789                // Method getNpcId:()I
        55: invokedynamic #808,  0            // InvokeDynamic #11:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        60: invokevirtual #791                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        63: aload_0
        64: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        67: invokevirtual #575                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getCorpseTime:()I
        70: sipush        1000
        73: imul
        74: istore_3
        75: aload_0
        76: astore        5
        78: aload         5
        80: instanceof    #809                // class ext/mods/gameserver/model/actor/instance/Monster
        83: ifeq          119
        86: aload         5
        88: checkcast     #809                // class ext/mods/gameserver/model/actor/instance/Monster
        91: astore        4
        93: aload         4
        95: invokevirtual #811                // Method ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
        98: invokevirtual #815                // Method ext/mods/gameserver/model/actor/container/monster/SpoilState.isSpoiled:()Z
       101: ifne          115
       104: aload         4
       106: invokevirtual #820                // Method ext/mods/gameserver/model/actor/instance/Monster.getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
       109: invokevirtual #824                // Method ext/mods/gameserver/model/actor/container/monster/SeedState.isSeeded:()Z
       112: ifeq          119
       115: iload_3
       116: iconst_2
       117: imul
       118: istore_3
       119: aload_0
       120: aload_0
       121: invokedynamic #829,  0            // InvokeDynamic #12:run:(Lext/mods/gameserver/model/actor/Npc;)Ljava/lang/Runnable;
       126: lload_1
       127: iload_3
       128: i2l
       129: ladd
       130: invokestatic  #591                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       133: putfield      #800                // Field _respawnTask:Ljava/util/concurrent/ScheduledFuture;
       136: return
      LineNumberTable:
        line 842: 0
        line 844: 10
        line 845: 29
        line 848: 30
        line 849: 36
        line 851: 37
        line 852: 44
        line 854: 63
        line 855: 75
        line 856: 115
        line 858: 119
        line 863: 136
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           93      26     4 monster   Lext/mods/gameserver/model/actor/instance/Monster;
            0     137     0  this   Lext/mods/gameserver/model/actor/Npc;
            0     137     1 delay   J
           75      62     3 coprseTime   I
      StackMapTable: number_of_entries = 5
        frame_type = 30 /* same */
        frame_type = 6 /* same */
        frame_type = 25 /* same */
        frame_type = 253 /* append */
          offset_delta = 51
          locals = [ int, class ext/mods/gameserver/model/actor/instance/Monster ]
        frame_type = 250 /* chop */
          offset_delta = 3

  public void cancelRespawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #800                // Field _respawnTask:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        23
         7: aload_0
         8: getfield      #800                // Field _respawnTask:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_0
        12: invokeinterface #830,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #800                // Field _respawnTask:Ljava/util/concurrent/ScheduledFuture;
        23: return
      LineNumberTable:
        line 867: 0
        line 869: 7
        line 870: 18
        line 872: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void scheduleDespawn(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: invokedynamic #835,  0            // InvokeDynamic #13:run:(Lext/mods/gameserver/model/actor/Npc;)Ljava/lang/Runnable;
         6: lload_1
         7: invokestatic  #591                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        10: pop
        11: return
      LineNumberTable:
        line 876: 0
        line 881: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      12     1 delay   J

  public boolean isDecayed();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _isDecayed:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: invokevirtual #836                // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
         7: ireturn
      LineNumberTable:
        line 885: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void setDecayed(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _isDecayed:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: iload_1
         5: invokevirtual #838                // Method java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
         8: return
      LineNumberTable:
        line 890: 0
        line 891: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       9     1 decayed   Z

  public boolean isReadyForRespawn();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #841                // Field _readyForRespawn:Z
         4: ireturn
      LineNumberTable:
        line 895: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void setReadyForRespawn(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #841                // Field _readyForRespawn:Z
         5: return
      LineNumberTable:
        line 900: 0
        line 901: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1 ready   Z

  public int getNpcId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #151                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
         7: ireturn
      LineNumberTable:
        line 908: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Npc;

  public boolean isAggressive();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 916: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Npc;

  public int getLeftHandItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #122                // Field _leftHandItemId:I
         4: ireturn
      LineNumberTable:
        line 924: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void setLeftHandItemId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #122                // Field _leftHandItemId:I
         5: return
      LineNumberTable:
        line 933: 0
        line 934: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1 itemId   I

  public int getRightHandItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #128                // Field _rightHandItemId:I
         4: ireturn
      LineNumberTable:
        line 941: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void setRightHandItemId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #128                // Field _rightHandItemId:I
         5: return
      LineNumberTable:
        line 950: 0
        line 951: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1 itemId   I

  public int getEnchantEffect();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #547                // Field _enchantEffect:I
         4: ireturn
      LineNumberTable:
        line 955: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void setEnchantEffect(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #547                // Field _enchantEffect:I
         5: aload_0
         6: invokevirtual #844                // Method updateAbnormalEffect:()V
         9: return
      LineNumberTable:
        line 960: 0
        line 961: 5
        line 962: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      10     1 enchant   I

  public void setCollisionHeight(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: dload_1
         2: putfield      #135                // Field _currentCollisionHeight:D
         5: return
      LineNumberTable:
        line 966: 0
        line 967: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1 height   D

  public void setCollisionRadius(double);
    descriptor: (D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: dload_1
         2: putfield      #142                // Field _currentCollisionRadius:D
         5: return
      LineNumberTable:
        line 971: 0
        line 972: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1 radius   D

  public int getScriptValue();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _scriptValue:I
         4: ireturn
      LineNumberTable:
        line 976: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void setScriptValue(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #28                 // Field _scriptValue:I
         5: return
      LineNumberTable:
        line 981: 0
        line 982: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1   val   I

  public boolean isScriptValue(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #28                 // Field _scriptValue:I
         4: iload_1
         5: if_icmpne     12
         8: iconst_1
         9: goto          13
        12: iconst_0
        13: ireturn
      LineNumberTable:
        line 986: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      14     1   val   I
      StackMapTable: number_of_entries = 2
        frame_type = 12 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isWarehouse();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 994: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Npc;

  public final ext.mods.gameserver.model.residence.Residence getResidence();
    descriptor: ()Lext/mods/gameserver/model/residence/Residence;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #187                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
         4: areturn
      LineNumberTable:
        line 1002: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public final void setResidence(ext.mods.gameserver.model.residence.Residence);
    descriptor: (Lext/mods/gameserver/model/residence/Residence;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #187                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
         5: return
      LineNumberTable:
        line 1007: 0
        line 1008: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1 residence   Lext/mods/gameserver/model/residence/Residence;

  public final void setResidence(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=5, args_size=2
         0: aload_1
         1: invokestatic  #847                // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
         4: ifne          8
         7: return
         8: aload_1
         9: invokestatic  #851                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        12: istore_2
        13: invokestatic  #855                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        16: iload_2
        17: invokevirtual #860                // Method ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
        20: astore_3
        21: aload_3
        22: ifnull        33
        25: aload_0
        26: aload_3
        27: invokevirtual #864                // Method setResidence:(Lext/mods/gameserver/model/residence/Residence;)V
        30: goto          53
        33: invokestatic  #868                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
        36: iload_2
        37: invokevirtual #873                // Method ext/mods/gameserver/data/manager/ClanHallManager.getSiegableHall:(I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        40: astore        4
        42: aload         4
        44: ifnull        53
        47: aload_0
        48: aload         4
        50: invokevirtual #864                // Method setResidence:(Lext/mods/gameserver/model/residence/Residence;)V
        53: return
      LineNumberTable:
        line 1012: 0
        line 1013: 7
        line 1015: 8
        line 1017: 13
        line 1018: 21
        line 1019: 25
        line 1022: 33
        line 1023: 42
        line 1024: 47
        line 1026: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42      11     4    sh   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0      54     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      54     1 param   Ljava/lang/String;
           13      41     2 residenceId   I
           21      33     3 castle   Lext/mods/gameserver/model/residence/castle/Castle;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ int, class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 19 /* same */

  public final ext.mods.gameserver.model.residence.castle.Castle getCastle();
    descriptor: ()Lext/mods/gameserver/model/residence/castle/Castle;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #187                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
         4: astore_2
         5: aload_2
         6: instanceof    #877                // class ext/mods/gameserver/model/residence/castle/Castle
         9: ifeq          21
        12: aload_2
        13: checkcast     #877                // class ext/mods/gameserver/model/residence/castle/Castle
        16: astore_1
        17: aload_1
        18: goto          22
        21: aconst_null
        22: areturn
      LineNumberTable:
        line 1033: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17       4     1 castle   Lext/mods/gameserver/model/residence/castle/Castle;
            0      23     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/residence/castle/Castle ]

  public final ext.mods.gameserver.model.residence.clanhall.ClanHall getClanHall();
    descriptor: ()Lext/mods/gameserver/model/residence/clanhall/ClanHall;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #187                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
         4: astore_2
         5: aload_2
         6: instanceof    #879                // class ext/mods/gameserver/model/residence/clanhall/ClanHall
         9: ifeq          21
        12: aload_2
        13: checkcast     #879                // class ext/mods/gameserver/model/residence/clanhall/ClanHall
        16: astore_1
        17: aload_1
        18: goto          22
        21: aconst_null
        22: areturn
      LineNumberTable:
        line 1041: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17       4     1    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
            0      23     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/residence/clanhall/ClanHall ]

  public final ext.mods.gameserver.model.residence.clanhall.SiegableHall getSiegableHall();
    descriptor: ()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #187                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
         4: astore_2
         5: aload_2
         6: instanceof    #881                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
         9: ifeq          21
        12: aload_2
        13: checkcast     #881                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
        16: astore_1
        17: aload_1
        18: goto          22
        21: aconst_null
        22: areturn
      LineNumberTable:
        line 1049: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17       4     1    sh   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0      23     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/residence/clanhall/SiegableHall ]

  public final ext.mods.gameserver.model.actor.Creature getLastAttacker();
    descriptor: ()Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #483                // Field _lastAttacker:Lext/mods/gameserver/model/actor/Creature;
         4: areturn
      LineNumberTable:
        line 1057: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public boolean isLordOwner(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #883                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
         4: ifne          9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: getfield      #187                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
        13: ifnull        32
        16: aload_0
        17: getfield      #187                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
        20: invokevirtual #886                // Method ext/mods/gameserver/model/residence/Residence.getOwnerId:()I
        23: aload_1
        24: invokevirtual #891                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        27: if_icmpne     32
        30: iconst_1
        31: ireturn
        32: iconst_0
        33: ireturn
      LineNumberTable:
        line 1066: 0
        line 1067: 7
        line 1069: 9
        line 1070: 30
        line 1072: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      34     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 22 /* same */

  public int getClanId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #894                // Field _clanId:I
         4: ifeq          12
         7: aload_0
         8: getfield      #894                // Field _clanId:I
        11: ireturn
        12: aload_0
        13: getfield      #187                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
        16: ifnull        27
        19: aload_0
        20: getfield      #187                // Field _residence:Lext/mods/gameserver/model/residence/Residence;
        23: invokevirtual #886                // Method ext/mods/gameserver/model/residence/Residence.getOwnerId:()I
        26: ireturn
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 1077: 0
        line 1078: 7
        line 1080: 12
        line 1081: 19
        line 1083: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 2
        frame_type = 12 /* same */
        frame_type = 14 /* same */

  public void setClanId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #894                // Field _clanId:I
         5: return
      LineNumberTable:
        line 1088: 0
        line 1089: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1 clanId   I

  public boolean isCoreAiDisabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #897                // Field _isCoreAiDisabled:Z
         4: ireturn
      LineNumberTable:
        line 1096: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void disableCoreAi(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #897                // Field _isCoreAiDisabled:Z
         5: return
      LineNumberTable:
        line 1105: 0
        line 1106: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1 value   Z

  public java.util.List<java.lang.Integer> getObserverGroups();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #345                // Field _observerGroups:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 1110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;
    Signature: #1603                        // ()Ljava/util/List<Ljava/lang/Integer;>;

  public void setObserverGroups(java.util.List<java.lang.Integer>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #345                // Field _observerGroups:Ljava/util/List;
         5: return
      LineNumberTable:
        line 1115: 0
        line 1116: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1 groups   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     1 groups   Ljava/util/List<Ljava/lang/Integer;>;
    Signature: #1606                        // (Ljava/util/List<Ljava/lang/Integer;>;)V

  public java.util.List<java.lang.Integer> getFollowSlots();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field _followSlots:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 1120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;
    Signature: #1603                        // ()Ljava/util/List<Ljava/lang/Integer;>;

  public ext.mods.gameserver.model.location.Location getLastFollowingLoc();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field _lastFollowingLoc:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 1125: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void setLastFollowingLoc(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #47                 // Field _lastFollowingLoc:Lext/mods/gameserver/model/location/Location;
         5: return
      LineNumberTable:
        line 1130: 0
        line 1131: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1 value   Lext/mods/gameserver/model/location/Location;

  public boolean isAISleeping();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #51                 // Field _isAISleeping:Z
         4: ireturn
      LineNumberTable:
        line 1135: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public void setAISleeping(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #51                 // Field _isAISleeping:Z
         5: return
      LineNumberTable:
        line 1140: 0
        line 1141: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       6     1 value   Z

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: invokestatic  #900                // Method ext/mods/gameserver/handler/BypassHandler.getInstance:()Lext/mods/gameserver/handler/BypassHandler;
         3: aload_2
         4: invokevirtual #905                // Method ext/mods/gameserver/handler/BypassHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IBypassHandler;
         7: astore_3
         8: aload_3
         9: ifnull        22
        12: aload_3
        13: aload_2
        14: aload_1
        15: aload_0
        16: invokeinterface #909,  4          // InterfaceMethod ext/mods/gameserver/handler/IBypassHandler.useBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
        21: pop
        22: return
      LineNumberTable:
        line 1150: 0
        line 1151: 8
        line 1152: 12
        line 1153: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      23     1 player   Lext/mods/gameserver/model/actor/Player;
            0      23     2 command   Ljava/lang/String;
            8      15     3 handler   Lext/mods/gameserver/handler/IBypassHandler;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/handler/IBypassHandler ]

  public boolean isTeleportAllowed(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 1161: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       2     1 player   Lext/mods/gameserver/model/actor/Player;

  protected ext.mods.gameserver.enums.actors.NpcTalkCond getNpcTalkCond(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/enums/actors/NpcTalkCond;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=2, args_size=2
         0: getstatic     #915                // Field ext/mods/gameserver/enums/actors/NpcTalkCond.OWNER:Lext/mods/gameserver/enums/actors/NpcTalkCond;
         3: areturn
      LineNumberTable:
        line 1166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       4     1 player   Lext/mods/gameserver/model/actor/Player;

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: iload_3
         1: ifne          15
         4: iload_2
         5: invokedynamic #921,  0            // InvokeDynamic #14:makeConcatWithConstants:(I)Ljava/lang/String;
        10: astore        4
        12: goto          24
        15: iload_2
        16: iload_3
        17: invokedynamic #924,  0            // InvokeDynamic #15:makeConcatWithConstants:(II)Ljava/lang/String;
        22: astore        4
        24: invokestatic  #927                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        27: aload_1
        28: invokevirtual #932                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        31: aload         4
        33: invokevirtual #936                // Method ext/mods/gameserver/data/HTMLData.exists:(Ljava/util/Locale;Ljava/lang/String;)Z
        36: ifeq          42
        39: aload         4
        41: areturn
        42: ldc_w         #940                // String html/npcdefault.htm
        45: areturn
      LineNumberTable:
        line 1184: 0
        line 1185: 4
        line 1187: 15
        line 1189: 24
        line 1190: 39
        line 1192: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12       3     4 filename   Ljava/lang/String;
            0      46     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      46     1 player   Lext/mods/gameserver/model/actor/Player;
            0      46     2 npcId   I
            0      46     3   val   I
           24      22     4 filename   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/lang/String ]
        frame_type = 17 /* same */

  public void broadcastNpcSay(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: new           #942                // class ext/mods/gameserver/network/serverpackets/NpcSay
         4: dup
         5: aload_0
         6: getstatic     #944                // Field ext/mods/gameserver/enums/SayType.ALL:Lext/mods/gameserver/enums/SayType;
         9: aload_1
        10: invokespecial #950                // Method ext/mods/gameserver/network/serverpackets/NpcSay."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
        13: invokevirtual #747                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        16: return
      LineNumberTable:
        line 1201: 0
        line 1202: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      17     1 message   Ljava/lang/String;

  public void broadcastNpcSay(ext.mods.gameserver.network.NpcStringId);
    descriptor: (Lext/mods/gameserver/network/NpcStringId;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #953                // Method ext/mods/gameserver/network/NpcStringId.getMessage:()Ljava/lang/String;
         5: invokevirtual #958                // Method broadcastNpcSay:(Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 1210: 0
        line 1211: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       9     1 npcStringId   Lext/mods/gameserver/network/NpcStringId;

  public void broadcastNpcSay(ext.mods.gameserver.network.NpcStringId, java.lang.Object...);
    descriptor: (Lext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #961                // Method ext/mods/gameserver/network/NpcStringId.getMessage:([Ljava/lang/Object;)Ljava/lang/String;
         6: invokevirtual #958                // Method broadcastNpcSay:(Ljava/lang/String;)V
         9: return
      LineNumberTable:
        line 1220: 0
        line 1221: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      10     1 npcStringId   Lext/mods/gameserver/network/NpcStringId;
            0      10     2 params   [Ljava/lang/Object;

  public void broadcastNpcShout(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: new           #942                // class ext/mods/gameserver/network/serverpackets/NpcSay
         4: dup
         5: aload_0
         6: getstatic     #964                // Field ext/mods/gameserver/enums/SayType.SHOUT:Lext/mods/gameserver/enums/SayType;
         9: aload_1
        10: invokespecial #950                // Method ext/mods/gameserver/network/serverpackets/NpcSay."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
        13: invokevirtual #747                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        16: return
      LineNumberTable:
        line 1229: 0
        line 1230: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      17     1 message   Ljava/lang/String;

  public void broadcastNpcShout(ext.mods.gameserver.network.NpcStringId);
    descriptor: (Lext/mods/gameserver/network/NpcStringId;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #953                // Method ext/mods/gameserver/network/NpcStringId.getMessage:()Ljava/lang/String;
         5: invokevirtual #967                // Method broadcastNpcShout:(Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 1238: 0
        line 1239: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       9     1 npcStringId   Lext/mods/gameserver/network/NpcStringId;

  public void broadcastNpcShout(ext.mods.gameserver.network.NpcStringId, java.lang.Object...);
    descriptor: (Lext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #961                // Method ext/mods/gameserver/network/NpcStringId.getMessage:([Ljava/lang/Object;)Ljava/lang/String;
         6: invokevirtual #967                // Method broadcastNpcShout:(Ljava/lang/String;)V
         9: return
      LineNumberTable:
        line 1248: 0
        line 1249: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      10     1 npcStringId   Lext/mods/gameserver/network/NpcStringId;
            0      10     2 params   [Ljava/lang/Object;

  public void broadcastOnScreen(int, java.lang.String);
    descriptor: (ILjava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: new           #970                // class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
         4: dup
         5: aload_2
         6: iload_1
         7: invokespecial #972                // Method ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
        10: invokevirtual #747                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        13: return
      LineNumberTable:
        line 1258: 0
        line 1259: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      14     1  time   I
            0      14     2 message   Ljava/lang/String;

  public void broadcastOnScreen(int, ext.mods.gameserver.network.NpcStringId);
    descriptor: (ILext/mods/gameserver/network/NpcStringId;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokevirtual #953                // Method ext/mods/gameserver/network/NpcStringId.getMessage:()Ljava/lang/String;
         6: invokevirtual #975                // Method broadcastOnScreen:(ILjava/lang/String;)V
         9: return
      LineNumberTable:
        line 1268: 0
        line 1269: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      10     1  time   I
            0      10     2 npcStringId   Lext/mods/gameserver/network/NpcStringId;

  public void broadcastOnScreen(int, ext.mods.gameserver.network.NpcStringId, java.lang.Object...);
    descriptor: (ILext/mods/gameserver/network/NpcStringId;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: aload_2
         3: aload_3
         4: invokevirtual #961                // Method ext/mods/gameserver/network/NpcStringId.getMessage:([Ljava/lang/Object;)Ljava/lang/String;
         7: invokevirtual #975                // Method broadcastOnScreen:(ILjava/lang/String;)V
        10: return
      LineNumberTable:
        line 1279: 0
        line 1280: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      11     1  time   I
            0      11     2 npcStringId   Lext/mods/gameserver/network/NpcStringId;
            0      11     3 params   [Ljava/lang/Object;

  protected boolean showPkDenyChatWindow(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=5, args_size=3
         0: invokestatic  #927                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
         3: aload_1
         4: aload_2
         5: aload_0
         6: invokevirtual #789                // Method getNpcId:()I
         9: invokedynamic #979,  0            // InvokeDynamic #16:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        14: invokevirtual #980                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        17: astore_3
        18: aload_3
        19: ifnull        56
        22: new           #984                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        25: dup
        26: aload_0
        27: invokevirtual #198                // Method getObjectId:()I
        30: invokespecial #986                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        33: astore        4
        35: aload         4
        37: aload_3
        38: invokevirtual #988                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
        41: aload_1
        42: aload         4
        44: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        47: aload_1
        48: getstatic     #991                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        51: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        54: iconst_1
        55: ireturn
        56: iconst_0
        57: ireturn
      LineNumberTable:
        line 1291: 0
        line 1292: 18
        line 1294: 22
        line 1295: 35
        line 1297: 41
        line 1298: 47
        line 1299: 54
        line 1301: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      21     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0      58     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      58     1 player   Lext/mods/gameserver/model/actor/Player;
            0      58     2  type   Ljava/lang/String;
           18      40     3 content   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ class java/lang/String ]

  public void showObserverWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=2
         0: aload_0
         1: getfield      #345                // Field _observerGroups:Ljava/util/List;
         4: ifnonnull     8
         7: return
         8: new           #997                // class java/lang/StringBuilder
        11: dup
        12: invokespecial #999                // Method java/lang/StringBuilder."<init>":()V
        15: astore_2
        16: aload_2
        17: ldc_w         #1000               // String <html><body>&$650;<br><br>
        20: invokevirtual #1002               // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        23: pop
        24: aload_0
        25: getfield      #345                // Field _observerGroups:Ljava/util/List;
        28: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        33: astore_3
        34: aload_3
        35: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        40: ifeq          120
        43: aload_3
        44: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        49: checkcast     #35                 // class java/lang/Integer
        52: invokevirtual #1006               // Method java/lang/Integer.intValue:()I
        55: istore        4
        57: aload_2
        58: bipush        7
        60: anewarray     #1009               // class java/lang/Object
        63: dup
        64: iconst_0
        65: ldc_w         #1011               // String <a action=\"bypass -h npc_
        68: aastore
        69: dup
        70: iconst_1
        71: aload_0
        72: invokevirtual #198                // Method getObjectId:()I
        75: invokestatic  #1013               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        78: aastore
        79: dup
        80: iconst_2
        81: ldc_w         #1017               // String _observe_group
        84: aastore
        85: dup
        86: iconst_3
        87: iload         4
        89: invokestatic  #1013               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        92: aastore
        93: dup
        94: iconst_4
        95: ldc_w         #1019               // String \">&$
        98: aastore
        99: dup
       100: iconst_5
       101: iload         4
       103: invokestatic  #1013               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       106: aastore
       107: dup
       108: bipush        6
       110: ldc_w         #1021               // String ;</a><br1>
       113: aastore
       114: invokestatic  #1023               // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       117: goto          34
       120: aload_2
       121: ldc_w         #1026               // String </body></html>
       124: invokevirtual #1002               // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       127: pop
       128: new           #984                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       131: dup
       132: aload_0
       133: invokevirtual #198                // Method getObjectId:()I
       136: invokespecial #986                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       139: astore_3
       140: aload_3
       141: aload_2
       142: invokevirtual #1028               // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       145: invokevirtual #988                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       148: aload_1
       149: aload_3
       150: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       153: return
      LineNumberTable:
        line 1310: 0
        line 1311: 7
        line 1313: 8
        line 1314: 16
        line 1316: 24
        line 1317: 57
        line 1319: 120
        line 1321: 128
        line 1322: 140
        line 1324: 148
        line 1325: 153
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           57      60     4 groupId   I
            0     154     0  this   Lext/mods/gameserver/model/actor/Npc;
            0     154     1 player   Lext/mods/gameserver/model/actor/Player;
           16     138     2    sb   Ljava/lang/StringBuilder;
          140      14     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 85

  public void showTeleportWindow(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.enums.TeleportType);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/TeleportType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=3
         0: invokestatic  #1031               // Method ext/mods/gameserver/data/xml/TeleportData.getInstance:()Lext/mods/gameserver/data/xml/TeleportData;
         3: aload_0
         4: invokevirtual #789                // Method getNpcId:()I
         7: invokevirtual #1036               // Method ext/mods/gameserver/data/xml/TeleportData.getTeleports:(I)Ljava/util/List;
        10: astore_3
        11: aload_3
        12: ifnonnull     16
        15: return
        16: new           #997                // class java/lang/StringBuilder
        19: dup
        20: invokespecial #999                // Method java/lang/StringBuilder."<init>":()V
        23: astore        4
        25: aload         4
        27: ldc_w         #1040               // String <html><body>&$556;<br><br>
        30: invokevirtual #1002               // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        33: pop
        34: iconst_0
        35: istore        5
        37: iload         5
        39: aload_3
        40: invokeinterface #336,  1          // InterfaceMethod java/util/List.size:()I
        45: if_icmpge     287
        48: aload_3
        49: iload         5
        51: invokeinterface #339,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        56: checkcast     #1042               // class ext/mods/gameserver/model/location/TeleportLocation
        59: astore        6
        61: aload         6
        63: ifnull        281
        66: aload_2
        67: aload         6
        69: invokevirtual #1044               // Method ext/mods/gameserver/model/location/TeleportLocation.getType:()Lext/mods/gameserver/enums/TeleportType;
        72: if_acmpeq     78
        75: goto          281
        78: aload         4
        80: bipush        8
        82: anewarray     #1009               // class java/lang/Object
        85: dup
        86: iconst_0
        87: ldc_w         #1011               // String <a action=\"bypass -h npc_
        90: aastore
        91: dup
        92: iconst_1
        93: aload_0
        94: invokevirtual #198                // Method getObjectId:()I
        97: invokestatic  #1013               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       100: aastore
       101: dup
       102: iconst_2
       103: ldc_w         #1048               // String _teleport
       106: aastore
       107: dup
       108: iconst_3
       109: iload         5
       111: invokestatic  #1013               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       114: aastore
       115: dup
       116: iconst_4
       117: ldc_w         #1050               // String \" msg=\"811;
       120: aastore
       121: dup
       122: iconst_5
       123: aload_1
       124: invokevirtual #932                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       127: invokevirtual #1052               // Method java/util/Locale.getLanguage:()Ljava/lang/String;
       130: ldc_w         #1057               // String en
       133: if_acmpne     145
       136: aload         6
       138: aload_1
       139: invokevirtual #1059               // Method ext/mods/gameserver/model/location/TeleportLocation.getDescEn:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
       142: goto          151
       145: aload         6
       147: aload_1
       148: invokevirtual #1063               // Method ext/mods/gameserver/model/location/TeleportLocation.getDescRu:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
       151: aastore
       152: dup
       153: bipush        6
       155: ldc_w         #1066               // String \">
       158: aastore
       159: dup
       160: bipush        7
       162: aload_1
       163: invokevirtual #932                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       166: invokevirtual #1052               // Method java/util/Locale.getLanguage:()Ljava/lang/String;
       169: ldc_w         #1057               // String en
       172: if_acmpne     184
       175: aload         6
       177: aload_1
       178: invokevirtual #1059               // Method ext/mods/gameserver/model/location/TeleportLocation.getDescEn:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
       181: goto          190
       184: aload         6
       186: aload_1
       187: invokevirtual #1063               // Method ext/mods/gameserver/model/location/TeleportLocation.getDescRu:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
       190: aastore
       191: invokestatic  #1023               // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       194: getstatic     #1068               // Field ext/mods/Config.FREE_TELEPORT:Z
       197: ifeq          213
       200: aload_1
       201: invokevirtual #1071               // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       204: invokevirtual #1074               // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       207: getstatic     #1077               // Field ext/mods/Config.LVL_FREE_TELEPORT:I
       210: if_icmple     272
       213: aload         6
       215: aload_1
       216: invokevirtual #1080               // Method ext/mods/gameserver/model/location/TeleportLocation.getCalculatedPriceCount:(Lext/mods/gameserver/model/actor/Player;)I
       219: istore        7
       221: iload         7
       223: ifle          272
       226: aload         4
       228: iconst_5
       229: anewarray     #1009               // class java/lang/Object
       232: dup
       233: iconst_0
       234: ldc_w         #1084               // String  -
       237: aastore
       238: dup
       239: iconst_1
       240: iload         7
       242: invokestatic  #1013               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       245: aastore
       246: dup
       247: iconst_2
       248: ldc_w         #1086               // String  &#
       251: aastore
       252: dup
       253: iconst_3
       254: aload         6
       256: invokevirtual #1088               // Method ext/mods/gameserver/model/location/TeleportLocation.getPriceId:()I
       259: invokestatic  #1013               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       262: aastore
       263: dup
       264: iconst_4
       265: ldc_w         #1091               // String ;
       268: aastore
       269: invokestatic  #1023               // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       272: aload         4
       274: ldc_w         #1093               // String </a><br1>
       277: invokevirtual #1002               // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       280: pop
       281: iinc          5, 1
       284: goto          37
       287: aload         4
       289: ldc_w         #1026               // String </body></html>
       292: invokevirtual #1002               // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       295: pop
       296: new           #984                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       299: dup
       300: aload_0
       301: invokevirtual #198                // Method getObjectId:()I
       304: invokespecial #986                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       307: astore        5
       309: aload         5
       311: aload         4
       313: invokevirtual #1028               // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       316: invokevirtual #988                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       319: aload_1
       320: aload         5
       322: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       325: return
      LineNumberTable:
        line 1334: 0
        line 1335: 11
        line 1336: 15
        line 1338: 16
        line 1339: 25
        line 1341: 34
        line 1343: 48
        line 1344: 61
        line 1345: 75
        line 1347: 78
        line 1349: 194
        line 1351: 213
        line 1352: 221
        line 1353: 226
        line 1356: 272
        line 1341: 281
        line 1358: 287
        line 1360: 296
        line 1361: 309
        line 1363: 319
        line 1364: 325
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          221      51     7 priceCount   I
           61     220     6 teleport   Lext/mods/gameserver/model/location/TeleportLocation;
           37     250     5 index   I
            0     326     0  this   Lext/mods/gameserver/model/actor/Npc;
            0     326     1 player   Lext/mods/gameserver/model/actor/Player;
            0     326     2  type   Lext/mods/gameserver/enums/TeleportType;
           11     315     3 teleports   Ljava/util/List;
           25     301     4    sb   Ljava/lang/StringBuilder;
          309      17     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           11     315     3 teleports   Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;
      StackMapTable: number_of_entries = 11
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class java/util/List ]
        frame_type = 253 /* append */
          offset_delta = 20
          locals = [ class java/lang/StringBuilder, int ]
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/model/location/TeleportLocation ]
        frame_type = 255 /* full_frame */
          offset_delta = 66
          locals = [ class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/TeleportType, class java/util/List, class java/lang/StringBuilder, int, class ext/mods/gameserver/model/location/TeleportLocation ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/TeleportType, class java/util/List, class java/lang/StringBuilder, int, class ext/mods/gameserver/model/location/TeleportLocation ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/TeleportType, class java/util/List, class java/lang/StringBuilder, int, class ext/mods/gameserver/model/location/TeleportLocation ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/enums/TeleportType, class java/util/List, class java/lang/StringBuilder, int, class ext/mods/gameserver/model/location/TeleportLocation ]
          stack = [ class java/lang/StringBuilder, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 22 /* same */
        frame_type = 58 /* same */
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 250 /* chop */
          offset_delta = 5

  public void showChatWindow(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: invokevirtual #1095               // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;I)V
         6: return
      LineNumberTable:
        line 1373: 0
        line 1374: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/Npc;
            0       7     1 player   Lext/mods/gameserver/model/actor/Player;

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_0
         3: aload_1
         4: aload_0
         5: invokevirtual #789                // Method getNpcId:()I
         8: iload_2
         9: invokevirtual #1098               // Method getHtmlPath:(Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
        12: invokevirtual #1102               // Method showChatWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        15: return
      LineNumberTable:
        line 1384: 0
        line 1385: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      16     1 player   Lext/mods/gameserver/model/actor/Player;
            0      16     2   val   I

  public final void showChatWindow(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=3
         0: new           #984                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
         3: dup
         4: aload_0
         5: invokevirtual #198                // Method getObjectId:()I
         8: invokespecial #986                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        11: astore_3
        12: aload_3
        13: aload_1
        14: invokevirtual #932                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        17: aload_2
        18: invokevirtual #1105               // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        21: aload_3
        22: ldc_w         #1109               // String %objectId%
        25: aload_0
        26: invokevirtual #198                // Method getObjectId:()I
        29: invokevirtual #1111               // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        32: aload_1
        33: aload_3
        34: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        37: aload_1
        38: getstatic     #991                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        41: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        44: return
      LineNumberTable:
        line 1395: 0
        line 1396: 12
        line 1397: 21
        line 1399: 32
        line 1400: 37
        line 1401: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      45     1 player   Lext/mods/gameserver/model/actor/Player;
            0      45     2 filename   Ljava/lang/String;
           12      33     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;

  public void moveFromSpawnPointUsingRandomOffset(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: getfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
         4: ifnull        13
         7: iload_1
         8: bipush        10
        10: if_icmpge     14
        13: return
        14: aload_0
        15: getfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
        18: aload_0
        19: iload_1
        20: invokevirtual #1114               // Method ext/mods/gameserver/model/spawn/ASpawn.getRandomWalkLocation:(Lext/mods/gameserver/model/actor/Npc;I)Lext/mods/gameserver/model/location/Location;
        23: astore_2
        24: aload_2
        25: ifnull        40
        28: aload_0
        29: invokevirtual #550                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        32: aload_2
        33: iconst_0
        34: iconst_1
        35: iconst_0
        36: invokevirtual #1118               // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
        39: pop
        40: return
      LineNumberTable:
        line 1409: 0
        line 1410: 13
        line 1412: 14
        line 1413: 24
        line 1415: 28
        line 1417: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      41     1 offset   I
           24      17     2   loc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 3
        frame_type = 13 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/location/Location ]

  public int getExpReward(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: iload_1
         1: iconst_1
         2: if_icmpne     18
         5: aload_0
         6: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         9: invokevirtual #1122               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getRewardExp:()D
        12: getstatic     #1125               // Field ext/mods/Config.PREMIUM_RATE_XP:D
        15: dmul
        16: d2i
        17: ireturn
        18: aload_0
        19: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        22: invokevirtual #1122               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getRewardExp:()D
        25: getstatic     #1128               // Field ext/mods/Config.RATE_XP:D
        28: dmul
        29: d2i
        30: ireturn
      LineNumberTable:
        line 1425: 0
        line 1426: 5
        line 1428: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      31     1 isPremium   I
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */

  public int getSpReward(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: iload_1
         1: iconst_1
         2: if_icmpne     18
         5: aload_0
         6: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         9: invokevirtual #1131               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getRewardSp:()D
        12: getstatic     #1134               // Field ext/mods/Config.PREMIUM_RATE_SP:D
        15: dmul
        16: d2i
        17: ireturn
        18: aload_0
        19: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        22: invokevirtual #1131               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getRewardSp:()D
        25: getstatic     #1137               // Field ext/mods/Config.RATE_SP:D
        28: dmul
        29: d2i
        30: ireturn
      LineNumberTable:
        line 1437: 0
        line 1438: 5
        line 1440: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      31     1 isPremium   I
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */

  public void forceAttack(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
         4: aload_1
         5: iload_2
         6: i2d
         7: invokevirtual #1140               // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;D)V
        10: return
      LineNumberTable:
        line 1450: 0
        line 1451: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      11     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0      11     2  hate   I

  public void lookItem(int, int, int...);
    descriptor: (II[I)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=4, locals=7, args_size=4
         0: aload_0
         1: ldc_w         #1144               // class ext/mods/gameserver/model/item/instance/ItemInstance
         4: iload_1
         5: aload_3
         6: invokedynamic #1146,  0           // InvokeDynamic #17:test:([I)Ljava/util/function/Predicate;
        11: invokevirtual #1149               // Method getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
        14: astore        4
        16: aload         4
        18: invokeinterface #1153,  1         // InterfaceMethod java/util/List.isEmpty:()Z
        23: ifne          77
        26: aload_0
        27: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        30: getstatic     #1156               // Field ext/mods/gameserver/enums/EventHandler.SEE_ITEM:Lext/mods/gameserver/enums/EventHandler;
        33: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        36: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        41: astore        5
        43: aload         5
        45: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        50: ifeq          77
        53: aload         5
        55: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        60: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
        63: astore        6
        65: aload         6
        67: aload_0
        68: iload_2
        69: aload         4
        71: invokevirtual #1159               // Method ext/mods/gameserver/scripting/Quest.onSeeItem:(Lext/mods/gameserver/model/actor/Npc;ILjava/util/List;)V
        74: goto          43
        77: return
      LineNumberTable:
        line 1461: 0
        line 1462: 16
        line 1464: 26
        line 1465: 65
        line 1467: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           65       9     6 quest   Lext/mods/gameserver/scripting/Quest;
            0      78     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      78     1 radius   I
            0      78     2 quantity   I
            0      78     3   ids   [I
           16      62     4 items   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           16      62     4 items   Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 43
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 33

  public void lookNeighbor(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: invokestatic  #1163               // Method java/lang/System.currentTimeMillis:()J
         3: aload_0
         4: getfield      #31                 // Field _lookNeighborTimeStamp:J
         7: lsub
         8: ldc2_w        #1169               // long 30000l
        11: lcmp
        12: ifge          16
        15: return
        16: aload_0
        17: invokestatic  #1163               // Method java/lang/System.currentTimeMillis:()J
        20: putfield      #31                 // Field _lookNeighborTimeStamp:J
        23: aload_0
        24: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        27: getstatic     #1171               // Field ext/mods/gameserver/enums/EventHandler.SEE_CREATURE:Lext/mods/gameserver/enums/EventHandler;
        30: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        33: astore_2
        34: aload_2
        35: invokeinterface #1153,  1         // InterfaceMethod java/util/List.isEmpty:()Z
        40: ifne          57
        43: aload_0
        44: ldc           #2                  // class ext/mods/gameserver/model/actor/Creature
        46: iload_1
        47: aload_0
        48: aload_2
        49: invokedynamic #1174,  0           // InvokeDynamic #18:accept:(Lext/mods/gameserver/model/actor/Npc;Ljava/util/List;)Ljava/util/function/Consumer;
        54: invokevirtual #535                // Method forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
        57: return
      LineNumberTable:
        line 1475: 0
        line 1476: 15
        line 1478: 16
        line 1480: 23
        line 1481: 34
        line 1483: 43
        line 1499: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      58     1 radius   I
           34      24     2 scripts   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           34      24     2 scripts   Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class java/util/List ]

  public boolean canAutoAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aload_0
         3: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         6: invokevirtual #1177               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
         9: iconst_0
        10: invokevirtual #1180               // Method canAutoAttack:(Lext/mods/gameserver/model/actor/Creature;IZ)Z
        13: ireturn
      LineNumberTable:
        line 1509: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      14     1 target   Lext/mods/gameserver/model/actor/Creature;

  public boolean canAutoAttack(ext.mods.gameserver.model.actor.Creature, int, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;IZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=4
         0: aload_1
         1: ifnull        18
         4: aload_1
         5: instanceof    #1184               // class ext/mods/gameserver/model/actor/instance/Door
         8: ifne          18
        11: aload_1
        12: invokevirtual #1186               // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
        15: ifeq          20
        18: iconst_0
        19: ireturn
        20: aload_0
        21: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        24: invokevirtual #1189               // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getDesires:()Ljava/util/Set;
        27: invokeinterface #1192,  1         // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        32: aload_1
        33: invokedynamic #1193,  0           // InvokeDynamic #19:test:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/function/Predicate;
        38: invokeinterface #425,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        43: invokeinterface #431,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        48: aconst_null
        49: invokevirtual #435                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        52: checkcast     #1196               // class ext/mods/gameserver/model/actor/ai/Desire
        55: astore        4
        57: aload         4
        59: ifnull        90
        62: aload         4
        64: invokevirtual #1198               // Method ext/mods/gameserver/model/actor/ai/Desire.canMoveToTarget:()Z
        67: ifne          90
        70: aload_0
        71: invokevirtual #550                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        74: aload_1
        75: aload_0
        76: invokevirtual #109                // Method getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        79: invokevirtual #1201               // Method ext/mods/gameserver/model/actor/status/NpcStatus.getPhysicalAttackRange:()I
        82: invokevirtual #1204               // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
        85: ifeq          90
        88: iconst_0
        89: ireturn
        90: aload_1
        91: instanceof    #1208               // class ext/mods/gameserver/model/actor/Playable
        94: ifeq          251
        97: aload_0
        98: aload_1
        99: iload_2
       100: invokevirtual #1210               // Method isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       103: ifne          108
       106: iconst_0
       107: ireturn
       108: aload_0
       109: invokevirtual #1214               // Method isRaidRelated:()Z
       112: ifne          134
       115: aload_0
       116: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       119: invokevirtual #1217               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.canSeeThrough:()Z
       122: ifne          134
       125: aload_1
       126: invokevirtual #1220               // Method ext/mods/gameserver/model/actor/Creature.isSilentMoving:()Z
       129: ifeq          134
       132: iconst_0
       133: ireturn
       134: aload_1
       135: invokevirtual #454                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       138: astore        5
       140: aload         5
       142: ifnull        251
       145: aload         5
       147: invokevirtual #461                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
       150: invokevirtual #465                // Method ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
       153: ifne          158
       156: iconst_0
       157: ireturn
       158: aload_0
       159: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       162: invokevirtual #518                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
       165: ldc_w         #1223               // String varka_silenos_clan
       168: invokestatic  #1225               // Method ext/mods/commons/util/ArraysUtil.contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
       171: ifeq          184
       174: aload         5
       176: invokevirtual #1231               // Method ext/mods/gameserver/model/actor/Player.isAlliedWithVarka:()Z
       179: ifeq          184
       182: iconst_0
       183: ireturn
       184: aload_0
       185: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       188: invokevirtual #518                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
       191: ldc_w         #1234               // String ketra_orc_clan
       194: invokestatic  #1225               // Method ext/mods/commons/util/ArraysUtil.contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
       197: ifeq          210
       200: aload         5
       202: invokevirtual #1236               // Method ext/mods/gameserver/model/actor/Player.isAlliedWithKetra:()Z
       205: ifeq          210
       208: iconst_0
       209: ireturn
       210: aload_0
       211: invokevirtual #768                // Method getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
       214: invokevirtual #1239               // Method ext/mods/gameserver/model/spawn/ASpawn.getMemo:()Lext/mods/gameserver/model/memo/SpawnMemo;
       217: ldc_w         #1243               // String CreviceOfDiminsion
       220: iconst_0
       221: invokevirtual #1245               // Method ext/mods/gameserver/model/memo/SpawnMemo.getInteger:(Ljava/lang/String;I)I
       224: ifle          241
       227: aload_0
       228: invokevirtual #768                // Method getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
       231: aload         5
       233: invokevirtual #779                // Method ext/mods/gameserver/model/spawn/ASpawn.isInMyTerritory:(Lext/mods/gameserver/model/WorldObject;)Z
       236: ifne          241
       239: iconst_0
       240: ireturn
       241: aload         5
       243: invokevirtual #1248               // Method ext/mods/gameserver/model/actor/Player.isRecentFakeDeath:()Z
       246: ifeq          251
       249: iconst_0
       250: ireturn
       251: aload_0
       252: instanceof    #1251               // class ext/mods/gameserver/model/actor/instance/Guard
       255: ifeq          333
       258: aload_1
       259: instanceof    #1208               // class ext/mods/gameserver/model/actor/Playable
       262: ifeq          286
       265: aload_1
       266: checkcast     #1208               // class ext/mods/gameserver/model/actor/Playable
       269: astore        5
       271: aload         5
       273: invokevirtual #1253               // Method ext/mods/gameserver/model/actor/Playable.getKarma:()I
       276: ifle          286
       279: aload_0
       280: aload         5
       282: invokestatic  #1256               // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       285: ireturn
       286: aload_1
       287: instanceof    #809                // class ext/mods/gameserver/model/actor/instance/Monster
       290: ifeq          331
       293: aload_1
       294: checkcast     #809                // class ext/mods/gameserver/model/actor/instance/Monster
       297: astore        5
       299: getstatic     #1262               // Field ext/mods/Config.GUARD_ATTACK_AGGRO_MOB:Z
       302: ifeq          331
       305: aload         5
       307: invokevirtual #1265               // Method ext/mods/gameserver/model/actor/instance/Monster.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       310: invokevirtual #1266               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggro:()Z
       313: ifeq          329
       316: aload_0
       317: aload         5
       319: invokestatic  #1256               // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       322: ifeq          329
       325: iconst_1
       326: goto          330
       329: iconst_0
       330: ireturn
       331: iconst_0
       332: ireturn
       333: aload_0
       334: instanceof    #1269               // class ext/mods/gameserver/model/actor/instance/FriendlyMonster
       337: ifeq          370
       340: aload_1
       341: instanceof    #1208               // class ext/mods/gameserver/model/actor/Playable
       344: ifeq          368
       347: aload_1
       348: checkcast     #1208               // class ext/mods/gameserver/model/actor/Playable
       351: astore        5
       353: aload         5
       355: invokevirtual #1253               // Method ext/mods/gameserver/model/actor/Playable.getKarma:()I
       358: ifle          368
       361: aload_0
       362: aload         5
       364: invokestatic  #1256               // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       367: ireturn
       368: iconst_0
       369: ireturn
       370: aload_1
       371: instanceof    #1271               // class ext/mods/gameserver/model/actor/Attackable
       374: ifeq          397
       377: aload_1
       378: checkcast     #1271               // class ext/mods/gameserver/model/actor/Attackable
       381: astore        5
       383: aload_0
       384: invokevirtual #1273               // Method isConfused:()Z
       387: ifeq          397
       390: aload_0
       391: aload         5
       393: invokestatic  #1256               // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       396: ireturn
       397: aload_1
       398: instanceof    #13                 // class ext/mods/gameserver/model/actor/Npc
       401: ifeq          406
       404: iconst_0
       405: ireturn
       406: getstatic     #1276               // Field ext/mods/Config.MOB_AGGRO_IN_PEACEZONE:Z
       409: ifne          424
       412: aload_1
       413: getstatic     #1279               // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
       416: invokevirtual #1285               // Method ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       419: ifeq          424
       422: iconst_0
       423: ireturn
       424: iload_3
       425: ifne          438
       428: aload_0
       429: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       432: invokevirtual #1266               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggro:()Z
       435: ifeq          450
       438: aload_0
       439: aload_1
       440: invokestatic  #1256               // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       443: ifeq          450
       446: iconst_1
       447: goto          451
       450: iconst_0
       451: ireturn
      LineNumberTable:
        line 1520: 0
        line 1521: 18
        line 1523: 20
        line 1524: 57
        line 1525: 88
        line 1527: 90
        line 1529: 97
        line 1530: 106
        line 1532: 108
        line 1533: 132
        line 1535: 134
        line 1536: 140
        line 1538: 145
        line 1539: 156
        line 1541: 158
        line 1542: 182
        line 1544: 184
        line 1545: 208
        line 1547: 210
        line 1548: 239
        line 1550: 241
        line 1551: 249
        line 1555: 251
        line 1557: 258
        line 1558: 279
        line 1560: 286
        line 1561: 305
        line 1563: 331
        line 1565: 333
        line 1567: 340
        line 1568: 361
        line 1570: 368
        line 1574: 370
        line 1575: 390
        line 1577: 397
        line 1578: 404
        line 1580: 406
        line 1581: 422
        line 1583: 424
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          140     111     5 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          271      15     5 targetPlayable   Lext/mods/gameserver/model/actor/Playable;
          299      32     5 targetMonster   Lext/mods/gameserver/model/actor/instance/Monster;
          353      15     5 targetPlayable   Lext/mods/gameserver/model/actor/Playable;
          383      14     5 targetAttackable   Lext/mods/gameserver/model/actor/Attackable;
            0     452     0  this   Lext/mods/gameserver/model/actor/Npc;
            0     452     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     452     2 range   I
            0     452     3 allowPeaceful   Z
           57     395     4 desire   Lext/mods/gameserver/model/actor/ai/Desire;
      StackMapTable: number_of_entries = 23
        frame_type = 18 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/model/actor/ai/Desire ]
        frame_type = 17 /* same */
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 30 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 34 /* same */
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 1 /* same */
        frame_type = 34 /* same */
        frame_type = 1 /* same */
        frame_type = 26 /* same */
        frame_type = 8 /* same */
        frame_type = 17 /* same */
        frame_type = 13 /* same */
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.util.List<ext.mods.gameserver.model.records.PrivateData> getPrivateData();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
         4: invokevirtual #1289               // Method ext/mods/gameserver/model/spawn/ASpawn.getPrivateData:()Ljava/util/List;
         7: ifnull        35
        10: aload_0
        11: getfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
        14: invokevirtual #1289               // Method ext/mods/gameserver/model/spawn/ASpawn.getPrivateData:()Ljava/util/List;
        17: invokeinterface #1153,  1         // InterfaceMethod java/util/List.isEmpty:()Z
        22: ifne          35
        25: aload_0
        26: getfield      #614                // Field _spawn:Lext/mods/gameserver/model/spawn/ASpawn;
        29: invokevirtual #1289               // Method ext/mods/gameserver/model/spawn/ASpawn.getPrivateData:()Ljava/util/List;
        32: goto          42
        35: aload_0
        36: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        39: invokevirtual #1292               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getPrivateData:()Ljava/util/List;
        42: areturn
      LineNumberTable:
        line 1589: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 2
        frame_type = 35 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/util/List ]
    Signature: #1682                        // ()Ljava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;

  public final void removeAttackDesire(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
         4: invokevirtual #473                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
         7: aload_1
         8: invokevirtual #1293               // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.stopHate:(Lext/mods/gameserver/model/actor/Creature;)V
        11: aload_0
        12: invokevirtual #550                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        15: invokevirtual #1297               // Method ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
        18: return
      LineNumberTable:
        line 1600: 0
        line 1602: 11
        line 1603: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      19     1 target   Lext/mods/gameserver/model/actor/Creature;

  public final void removeAllAttackDesire();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
         4: invokevirtual #1189               // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getDesires:()Ljava/util/Set;
         7: invokeinterface #1300,  1         // InterfaceMethod java/util/Set.clear:()V
        12: aload_0
        13: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        16: invokevirtual #473                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
        19: invokevirtual #1303               // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
        22: aload_0
        23: invokevirtual #550                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        26: invokevirtual #1297               // Method ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
        29: return
      LineNumberTable:
        line 1612: 0
        line 1613: 12
        line 1615: 22
        line 1616: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/actor/Npc;

  public final void removeAllDesire();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
         4: invokevirtual #1189               // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getDesires:()Ljava/util/Set;
         7: invokeinterface #1300,  1         // InterfaceMethod java/util/Set.clear:()V
        12: aload_0
        13: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        16: invokevirtual #473                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
        19: invokevirtual #1303               // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
        22: aload_0
        23: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        26: invokevirtual #1306               // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
        29: invokevirtual #1310               // Method ext/mods/gameserver/model/actor/container/attackable/HateList.cleanAllHate:()V
        32: aload_0
        33: invokevirtual #550                // Method getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        36: invokevirtual #1297               // Method ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
        39: return
      LineNumberTable:
        line 1625: 0
        line 1626: 12
        line 1627: 22
        line 1629: 32
        line 1630: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/actor/Npc;

  public final void sendScriptEvent(int, int, int);
    descriptor: (III)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=6, args_size=4
         0: aload_0
         1: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: getstatic     #1313               // Field ext/mods/gameserver/enums/EventHandler.SCRIPT_EVENT:Lext/mods/gameserver/enums/EventHandler;
         7: invokevirtual #323                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        10: invokeinterface #83,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        15: astore        4
        17: aload         4
        19: invokeinterface #89,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        24: ifeq          51
        27: aload         4
        29: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        34: checkcast     #327                // class ext/mods/gameserver/scripting/Quest
        37: astore        5
        39: aload         5
        41: aload_0
        42: iload_1
        43: iload_2
        44: iload_3
        45: invokevirtual #1316               // Method ext/mods/gameserver/scripting/Quest.onScriptEvent:(Lext/mods/gameserver/model/actor/Npc;III)V
        48: goto          17
        51: return
      LineNumberTable:
        line 1640: 0
        line 1641: 39
        line 1642: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39       9     5 quest   Lext/mods/gameserver/scripting/Quest;
            0      52     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      52     1 eventId   I
            0      52     2  arg1   I
            0      52     3  arg2   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 33

  public void dropItem(ext.mods.gameserver.model.actor.Creature, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=4
         0: iconst_0
         1: istore        4
         3: iload         4
         5: iload_3
         6: if_icmpge     65
         9: iload_2
        10: iload_3
        11: invokestatic  #1320               // Method ext/mods/gameserver/model/item/instance/ItemInstance.create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        14: astore        5
        16: aload_1
        17: invokevirtual #454                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        20: ifnull        36
        23: aload         5
        25: aload_1
        26: invokevirtual #1324               // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        29: aload_0
        30: invokevirtual #1325               // Method isRaidBoss:()Z
        33: invokevirtual #1328               // Method ext/mods/gameserver/model/item/instance/ItemInstance.setDropProtection:(IZ)V
        36: aload         5
        38: aload_0
        39: invokevirtual #1332               // Method ext/mods/gameserver/model/item/instance/ItemInstance.dropMe:(Lext/mods/gameserver/model/actor/Creature;)V
        42: aload         5
        44: invokevirtual #1335               // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        47: ifne          65
        50: getstatic     #1338               // Field ext/mods/Config.MULTIPLE_ITEM_DROP:Z
        53: ifne          59
        56: goto          65
        59: iinc          4, 1
        62: goto          3
        65: return
      LineNumberTable:
        line 1652: 0
        line 1654: 9
        line 1656: 16
        line 1657: 23
        line 1659: 36
        line 1661: 42
        line 1662: 56
        line 1652: 59
        line 1664: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           16      43     5  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            3      62     4     i   I
            0      66     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      66     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0      66     2 itemId   I
            0      66     3 amount   I
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 3
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 250 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.model.actor.Player getNeighborHero(int);
    descriptor: (I)Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: ldc           #240                // class ext/mods/gameserver/model/actor/Player
         3: iload_1
         4: invokedynamic #1341,  0           // InvokeDynamic #20:test:()Ljava/util/function/Predicate;
         9: invokevirtual #1149               // Method getKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Predicate;)Ljava/util/List;
        12: invokestatic  #1344               // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
        15: checkcast     #240                // class ext/mods/gameserver/model/actor/Player
        18: areturn
      LineNumberTable:
        line 1673: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Npc;
            0      19     1 radius   I

  public int getSeeRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #1347               // Field ext/mods/Config.DEFAULT_SEE_RANGE:I
         3: ireturn
      LineNumberTable:
        line 1681: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.custom.data.PolymorphData$Polymorph getFakePc();
    descriptor: ()Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #158                // Field _fakePc:Lext/mods/gameserver/custom/data/PolymorphData$Polymorph;
         4: areturn
      LineNumberTable:
        line 1686: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.model.actor.template.CreatureTemplate getTemplate();
    descriptor: ()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #250                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: areturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.model.actor.cast.CreatureCast getCast();
    descriptor: ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #1350               // Method getCast:()Lext/mods/gameserver/model/actor/cast/NpcCast;
         4: areturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.model.actor.attack.CreatureAttack getAttack();
    descriptor: ()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #1354               // Method getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
         4: areturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.model.actor.status.CreatureStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #109                // Method getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
         4: areturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;

  public ext.mods.gameserver.model.actor.ai.type.CreatureAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #285                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
         4: areturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Npc;
}
SourceFile: "Npc.java"
BootstrapMethods:
  0: #1801 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1731 \u0001 [objId=\u0001]
  1: #1807 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1733 (Ljava/lang/Object;)V
      #1734 REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.sendInfo:(Lext/mods/gameserver/model/actor/Player;)V
      #1737 (Lext/mods/gameserver/model/actor/Player;)V
  2: #1807 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1738 (Ljava/lang/Object;)Z
      #1740 REF_invokeStatic ext/mods/gameserver/model/actor/Npc.lambda$getSkill$0:(ILext/mods/gameserver/skills/L2Skill;)Z
      #1743 (Lext/mods/gameserver/skills/L2Skill;)Z
  3: #1807 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1733 (Ljava/lang/Object;)V
      #1745 REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$reduceCurrentHp$0:([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Npc;)V
      #1748 (Lext/mods/gameserver/model/actor/Npc;)V
  4: #1807 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1749 ()V
      #1750 REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$doDie$0:(Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/actor/Creature;)V
      #1749 ()V
  5: #1807 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1733 (Ljava/lang/Object;)V
      #1753 REF_invokeStatic ext/mods/gameserver/model/actor/Npc.lambda$doDie$1:(Lext/mods/gameserver/model/actor/Npc;)V
      #1748 (Lext/mods/gameserver/model/actor/Npc;)V
  6: #1807 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1733 (Ljava/lang/Object;)V
      #1756 REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$doDie$2:([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;)V
      #1748 (Lext/mods/gameserver/model/actor/Npc;)V
  7: #1801 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1759 NPC \u0001 [\u0001] tem NoRespawn=true, não será respawnado.
  8: #1801 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1761 DB Delay <= 0 while scheduling normal respawn of \u0001 [\u0001] (\u0001)
  9: #1801 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1763 DB Respawn task already exists for \u0001 [\u0001]!
  10: #1807 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1749 ()V
      #1765 REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$scheduleDBRespawn$0:()V
      #1749 ()V
  11: #1801 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1768 Respawn task already exists for \u0001 [\u0001]!
  12: #1807 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1749 ()V
      #1770 REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$scheduleRespawn$0:()V
      #1749 ()V
  13: #1807 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1749 ()V
      #1773 REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$scheduleDespawn$0:()V
      #1749 ()V
  14: #1801 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1776 html/default/\u0001.htm
  15: #1801 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1778 html/default/\u0001-\u0001.htm
  16: #1801 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1780 html/\u0001/\u0001-pk.htm
  17: #1807 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1738 (Ljava/lang/Object;)Z
      #1782 REF_invokeStatic ext/mods/gameserver/model/actor/Npc.lambda$lookItem$0:([ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
      #1785 (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  18: #1807 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1733 (Ljava/lang/Object;)V
      #1787 REF_invokeVirtual ext/mods/gameserver/model/actor/Npc.lambda$lookNeighbor$0:(Ljava/util/List;Lext/mods/gameserver/model/actor/Creature;)V
      #1790 (Lext/mods/gameserver/model/actor/Creature;)V
  19: #1807 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1738 (Ljava/lang/Object;)Z
      #1791 REF_invokeStatic ext/mods/gameserver/model/actor/Npc.lambda$canAutoAttack$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/ai/Desire;)Z
      #1794 (Lext/mods/gameserver/model/actor/ai/Desire;)Z
  20: #1807 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1738 (Ljava/lang/Object;)Z
      #1796 REF_invokeVirtual ext/mods/gameserver/model/actor/Player.isHero:()Z
      #1800 (Lext/mods/gameserver/model/actor/Player;)Z
InnerClasses:
  public static final #1817= #1815 of #146; // Polymorph=class ext/mods/gameserver/custom/data/PolymorphData$Polymorph of class ext/mods/gameserver/custom/data/PolymorphData
  public static #1820= #361 of #1818;     // NpcInfo=class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo of class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  public static final #1823= #1821 of #763; // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static final #1828= #1824 of #1826; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
