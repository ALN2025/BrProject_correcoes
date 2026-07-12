// Bytecode for: ext.mods.gameserver.model.zone.type.EffectZone
// File: ext\mods\gameserver\model\zone\type\EffectZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/EffectZone.class
  Last modified 9 de jul de 2026; size 6695 bytes
  MD5 checksum de89d8ad8ad1dae833635ef516d24b6c
  Compiled from "EffectZone.java"
public class ext.mods.gameserver.model.zone.type.EffectZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/zone/type/EffectZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 7, methods: 8, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Class              #8            // it/unimi/dsi/fastutil/objects/ObjectArrayList
    #8 = Utf8               it/unimi/dsi/fastutil/objects/ObjectArrayList
    #9 = Methodref          #7.#3         // it/unimi/dsi/fastutil/objects/ObjectArrayList."<init>":(I)V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/zone/type/EffectZone._skills:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/model/zone/type/EffectZone
   #12 = NameAndType        #14:#15       // _skills:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/model/zone/type/EffectZone
   #14 = Utf8               _skills
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/model/zone/type/EffectZone._chance:I
   #17 = NameAndType        #18:#19       // _chance:I
   #18 = Utf8               _chance
   #19 = Utf8               I
   #20 = Fieldref           #11.#21       // ext/mods/gameserver/model/zone/type/EffectZone._initialDelay:I
   #21 = NameAndType        #22:#19       // _initialDelay:I
   #22 = Utf8               _initialDelay
   #23 = Fieldref           #11.#24       // ext/mods/gameserver/model/zone/type/EffectZone._reuseDelay:I
   #24 = NameAndType        #25:#19       // _reuseDelay:I
   #25 = Utf8               _reuseDelay
   #26 = Class              #27           // ext/mods/gameserver/model/actor/Player
   #27 = Utf8               ext/mods/gameserver/model/actor/Player
   #28 = Fieldref           #11.#29       // ext/mods/gameserver/model/zone/type/EffectZone._target:Ljava/lang/Class;
   #29 = NameAndType        #30:#31       // _target:Ljava/lang/Class;
   #30 = Utf8               _target
   #31 = Utf8               Ljava/lang/Class;
   #32 = Fieldref           #11.#33       // ext/mods/gameserver/model/zone/type/EffectZone._isEnabled:Z
   #33 = NameAndType        #34:#35       // _isEnabled:Z
   #34 = Utf8               _isEnabled
   #35 = Utf8               Z
   #36 = String             #37           // chance
   #37 = Utf8               chance
   #38 = Methodref          #39.#40       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #39 = Class              #41           // java/lang/String
   #40 = NameAndType        #42:#43       // equals:(Ljava/lang/Object;)Z
   #41 = Utf8               java/lang/String
   #42 = Utf8               equals
   #43 = Utf8               (Ljava/lang/Object;)Z
   #44 = Methodref          #45.#46       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #45 = Class              #47           // java/lang/Integer
   #46 = NameAndType        #48:#49       // parseInt:(Ljava/lang/String;)I
   #47 = Utf8               java/lang/Integer
   #48 = Utf8               parseInt
   #49 = Utf8               (Ljava/lang/String;)I
   #50 = String             #51           // initialDelay
   #51 = Utf8               initialDelay
   #52 = String             #53           // reuseDelay
   #53 = Utf8               reuseDelay
   #54 = String             #55           // defaultStatus
   #55 = Utf8               defaultStatus
   #56 = Methodref          #57.#58       // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
   #57 = Class              #59           // java/lang/Boolean
   #58 = NameAndType        #60:#61       // parseBoolean:(Ljava/lang/String;)Z
   #59 = Utf8               java/lang/Boolean
   #60 = Utf8               parseBoolean
   #61 = Utf8               (Ljava/lang/String;)Z
   #62 = String             #63           // skill
   #63 = Utf8               skill
   #64 = String             #65           // ;
   #65 = Utf8               ;
   #66 = Methodref          #39.#67       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #67 = NameAndType        #68:#69       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #68 = Utf8               split
   #69 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #70 = String             #71           // -
   #71 = Utf8               -
   #72 = Fieldref           #11.#73       // ext/mods/gameserver/model/zone/type/EffectZone.LOGGER:Lext/mods/commons/logging/CLogger;
   #73 = NameAndType        #74:#75       // LOGGER:Lext/mods/commons/logging/CLogger;
   #74 = Utf8               LOGGER
   #75 = Utf8               Lext/mods/commons/logging/CLogger;
   #76 = String             #77           // Invalid skill format {} for {}.
   #77 = Utf8               Invalid skill format {} for {}.
   #78 = Class              #79           // java/lang/Object
   #79 = Utf8               java/lang/Object
   #80 = Methodref          #11.#81       // ext/mods/gameserver/model/zone/type/EffectZone.toString:()Ljava/lang/String;
   #81 = NameAndType        #82:#83       // toString:()Ljava/lang/String;
   #82 = Utf8               toString
   #83 = Utf8               ()Ljava/lang/String;
   #84 = Methodref          #85.#86       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #85 = Class              #87           // ext/mods/commons/logging/CLogger
   #86 = NameAndType        #88:#89       // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #87 = Utf8               ext/mods/commons/logging/CLogger
   #88 = Utf8               warn
   #89 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #90 = Class              #91           // ext/mods/gameserver/model/holder/IntIntHolder
   #91 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #92 = Methodref          #90.#93       // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
   #93 = NameAndType        #5:#94        // "<init>":(II)V
   #94 = Utf8               (II)V
   #95 = InterfaceMethodref #96.#97       // java/util/List.add:(Ljava/lang/Object;)Z
   #96 = Class              #98           // java/util/List
   #97 = NameAndType        #99:#43       // add:(Ljava/lang/Object;)Z
   #98 = Utf8               java/util/List
   #99 = Utf8               add
  #100 = Class              #101          // java/lang/NumberFormatException
  #101 = Utf8               java/lang/NumberFormatException
  #102 = String             #103          // targetType
  #103 = Utf8               targetType
  #104 = InvokeDynamic      #0:#105       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #105 = NameAndType        #106:#107     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #106 = Utf8               makeConcatWithConstants
  #107 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #108 = Methodref          #109.#110     // java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
  #109 = Class              #111          // java/lang/Class
  #110 = NameAndType        #112:#113     // forName:(Ljava/lang/String;)Ljava/lang/Class;
  #111 = Utf8               java/lang/Class
  #112 = Utf8               forName
  #113 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;
  #114 = Class              #115          // java/lang/ClassNotFoundException
  #115 = Utf8               java/lang/ClassNotFoundException
  #116 = String             #117          // Invalid target type {} for {}.
  #117 = Utf8               Invalid target type {} for {}.
  #118 = Methodref          #85.#119      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #119 = NameAndType        #120:#89      // error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #120 = Utf8               error
  #121 = Methodref          #2.#122       // ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
  #122 = NameAndType        #123:#124     // setParameter:(Ljava/lang/String;Ljava/lang/String;)V
  #123 = Utf8               setParameter
  #124 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #125 = Methodref          #109.#126     // java/lang/Class.isInstance:(Ljava/lang/Object;)Z
  #126 = NameAndType        #127:#43      // isInstance:(Ljava/lang/Object;)Z
  #127 = Utf8               isInstance
  #128 = Fieldref           #11.#129      // ext/mods/gameserver/model/zone/type/EffectZone._task:Ljava/util/concurrent/Future;
  #129 = NameAndType        #130:#131     // _task:Ljava/util/concurrent/Future;
  #130 = Utf8               _task
  #131 = Utf8               Ljava/util/concurrent/Future;
  #132 = InvokeDynamic      #1:#133       // #1:run:(Lext/mods/gameserver/model/zone/type/EffectZone;)Ljava/lang/Runnable;
  #133 = NameAndType        #134:#135     // run:(Lext/mods/gameserver/model/zone/type/EffectZone;)Ljava/lang/Runnable;
  #134 = Utf8               run
  #135 = Utf8               (Lext/mods/gameserver/model/zone/type/EffectZone;)Ljava/lang/Runnable;
  #136 = Methodref          #137.#138     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #137 = Class              #139          // ext/mods/commons/pool/ThreadPool
  #138 = NameAndType        #140:#141     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #139 = Utf8               ext/mods/commons/pool/ThreadPool
  #140 = Utf8               scheduleAtFixedRate
  #141 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #142 = Fieldref           #143.#144     // ext/mods/gameserver/enums/ZoneId.DANGER_AREA:Lext/mods/gameserver/enums/ZoneId;
  #143 = Class              #145          // ext/mods/gameserver/enums/ZoneId
  #144 = NameAndType        #146:#147     // DANGER_AREA:Lext/mods/gameserver/enums/ZoneId;
  #145 = Utf8               ext/mods/gameserver/enums/ZoneId
  #146 = Utf8               DANGER_AREA
  #147 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #148 = Methodref          #26.#149      // ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #149 = NameAndType        #150:#151     // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #150 = Utf8               setInsideZone
  #151 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #152 = Class              #153          // ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
  #153 = Utf8               ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
  #154 = Methodref          #152.#155     // ext/mods/gameserver/network/serverpackets/EtcStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #155 = NameAndType        #5:#156       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #156 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #157 = Methodref          #26.#158      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #158 = NameAndType        #159:#160     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #159 = Utf8               sendPacket
  #160 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #161 = Methodref          #26.#162      // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #162 = NameAndType        #163:#164     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #163 = Utf8               isInsideZone
  #164 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #165 = Fieldref           #11.#166      // ext/mods/gameserver/model/zone/type/EffectZone._creatures:Ljava/util/Set;
  #166 = NameAndType        #167:#168     // _creatures:Ljava/util/Set;
  #167 = Utf8               _creatures
  #168 = Utf8               Ljava/util/Set;
  #169 = InterfaceMethodref #170.#171     // java/util/Set.isEmpty:()Z
  #170 = Class              #172          // java/util/Set
  #171 = NameAndType        #173:#174     // isEmpty:()Z
  #172 = Utf8               java/util/Set
  #173 = Utf8               isEmpty
  #174 = Utf8               ()Z
  #175 = InterfaceMethodref #176.#177     // java/util/concurrent/Future.cancel:(Z)Z
  #176 = Class              #178          // java/util/concurrent/Future
  #177 = NameAndType        #179:#180     // cancel:(Z)Z
  #178 = Utf8               java/util/concurrent/Future
  #179 = Utf8               cancel
  #180 = Utf8               (Z)Z
  #181 = InterfaceMethodref #170.#182     // java/util/Set.iterator:()Ljava/util/Iterator;
  #182 = NameAndType        #183:#184     // iterator:()Ljava/util/Iterator;
  #183 = Utf8               iterator
  #184 = Utf8               ()Ljava/util/Iterator;
  #185 = InterfaceMethodref #186.#187     // java/util/Iterator.hasNext:()Z
  #186 = Class              #188          // java/util/Iterator
  #187 = NameAndType        #189:#174     // hasNext:()Z
  #188 = Utf8               java/util/Iterator
  #189 = Utf8               hasNext
  #190 = InterfaceMethodref #186.#191     // java/util/Iterator.next:()Ljava/lang/Object;
  #191 = NameAndType        #192:#193     // next:()Ljava/lang/Object;
  #192 = Utf8               next
  #193 = Utf8               ()Ljava/lang/Object;
  #194 = Class              #195          // ext/mods/gameserver/model/actor/Creature
  #195 = Utf8               ext/mods/gameserver/model/actor/Creature
  #196 = Methodref          #194.#197     // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #197 = NameAndType        #198:#174     // isDead:()Z
  #198 = Utf8               isDead
  #199 = Methodref          #200.#201     // ext/mods/commons/random/Rnd.get:(I)I
  #200 = Class              #202          // ext/mods/commons/random/Rnd
  #201 = NameAndType        #203:#204     // get:(I)I
  #202 = Utf8               ext/mods/commons/random/Rnd
  #203 = Utf8               get
  #204 = Utf8               (I)I
  #205 = InterfaceMethodref #96.#182      // java/util/List.iterator:()Ljava/util/Iterator;
  #206 = Methodref          #90.#207      // ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #207 = NameAndType        #208:#209     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #208 = Utf8               getSkill
  #209 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #210 = Methodref          #211.#212     // ext/mods/gameserver/skills/L2Skill.checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #211 = Class              #213          // ext/mods/gameserver/skills/L2Skill
  #212 = NameAndType        #214:#215     // checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #213 = Utf8               ext/mods/gameserver/skills/L2Skill
  #214 = Utf8               checkCondition
  #215 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #216 = Methodref          #90.#217      // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #217 = NameAndType        #218:#219     // getId:()I
  #218 = Utf8               getId
  #219 = Utf8               ()I
  #220 = Methodref          #194.#221     // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #221 = NameAndType        #222:#223     // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #222 = Utf8               getFirstEffect
  #223 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #224 = Methodref          #211.#217     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #225 = Methodref          #211.#226     // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #226 = NameAndType        #227:#228     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #227 = Utf8               getEffects
  #228 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #229 = InvokeDynamic      #2:#133       // #2:run:(Lext/mods/gameserver/model/zone/type/EffectZone;)Ljava/lang/Runnable;
  #230 = Methodref          #137.#231     // ext/mods/commons/pool/ThreadPool.executeIO:(Ljava/lang/Runnable;)V
  #231 = NameAndType        #232:#233     // executeIO:(Ljava/lang/Runnable;)V
  #232 = Utf8               executeIO
  #233 = Utf8               (Ljava/lang/Runnable;)V
  #234 = Utf8               Signature
  #235 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #236 = Utf8               Ljava/lang/Class<*>;
  #237 = Utf8               Ljava/util/concurrent/Future<*>;
  #238 = Utf8               Code
  #239 = Utf8               LineNumberTable
  #240 = Utf8               LocalVariableTable
  #241 = Utf8               this
  #242 = Utf8               Lext/mods/gameserver/model/zone/type/EffectZone;
  #243 = Utf8               id
  #244 = Utf8               nfe
  #245 = Utf8               Ljava/lang/NumberFormatException;
  #246 = Utf8               skillSplit
  #247 = Utf8               [Ljava/lang/String;
  #248 = Utf8               Ljava/lang/String;
  #249 = Utf8               skills
  #250 = Utf8               e
  #251 = Utf8               Ljava/lang/ClassNotFoundException;
  #252 = Utf8               name
  #253 = Utf8               value
  #254 = Utf8               StackMapTable
  #255 = Class              #247          // "[Ljava/lang/String;"
  #256 = Utf8               isAffected
  #257 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #258 = Utf8               creature
  #259 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #260 = Utf8               onEnter
  #261 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #262 = Utf8               player
  #263 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #264 = Utf8               task
  #265 = Utf8               LocalVariableTypeTable
  #266 = Class              #267          // java/lang/Throwable
  #267 = Utf8               java/lang/Throwable
  #268 = Utf8               onExit
  #269 = Utf8               editStatus
  #270 = Utf8               (Z)V
  #271 = Utf8               state
  #272 = Utf8               applyEffect
  #273 = Utf8               ()V
  #274 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #275 = Utf8               entry
  #276 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #277 = Utf8               temp
  #278 = Utf8               lambda$onEnter$0
  #279 = Utf8               SourceFile
  #280 = Utf8               EffectZone.java
  #281 = Utf8               BootstrapMethods
  #282 = String             #283          // ext.mods.gameserver.model.actor.\u0001
  #283 = Utf8               ext.mods.gameserver.model.actor.\u0001
  #284 = MethodType         #273          //  ()V
  #285 = MethodHandle       5:#286        // REF_invokeVirtual ext/mods/gameserver/model/zone/type/EffectZone.lambda$onEnter$0:()V
  #286 = Methodref          #11.#287      // ext/mods/gameserver/model/zone/type/EffectZone.lambda$onEnter$0:()V
  #287 = NameAndType        #278:#273     // lambda$onEnter$0:()V
  #288 = MethodHandle       5:#289        // REF_invokeVirtual ext/mods/gameserver/model/zone/type/EffectZone.applyEffect:()V
  #289 = Methodref          #11.#290      // ext/mods/gameserver/model/zone/type/EffectZone.applyEffect:()V
  #290 = NameAndType        #272:#273     // applyEffect:()V
  #291 = MethodHandle       6:#292        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #292 = Methodref          #293.#294     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #293 = Class              #295          // java/lang/invoke/StringConcatFactory
  #294 = NameAndType        #106:#296     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #295 = Utf8               java/lang/invoke/StringConcatFactory
  #296 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #297 = MethodHandle       6:#298        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #298 = Methodref          #299.#300     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #299 = Class              #301          // java/lang/invoke/LambdaMetafactory
  #300 = NameAndType        #302:#303     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #301 = Utf8               java/lang/invoke/LambdaMetafactory
  #302 = Utf8               metafactory
  #303 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #304 = Utf8               InnerClasses
  #305 = Class              #306          // java/lang/invoke/MethodHandles$Lookup
  #306 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #307 = Class              #308          // java/lang/invoke/MethodHandles
  #308 = Utf8               java/lang/invoke/MethodHandles
  #309 = Utf8               Lookup
{
  public ext.mods.gameserver.model.zone.type.EffectZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: aload_0
         6: new           #7                  // class it/unimi/dsi/fastutil/objects/ObjectArrayList
         9: dup
        10: iconst_5
        11: invokespecial #9                  // Method it/unimi/dsi/fastutil/objects/ObjectArrayList."<init>":(I)V
        14: putfield      #10                 // Field _skills:Ljava/util/List;
        17: aload_0
        18: bipush        100
        20: putfield      #16                 // Field _chance:I
        23: aload_0
        24: iconst_0
        25: putfield      #20                 // Field _initialDelay:I
        28: aload_0
        29: sipush        30000
        32: putfield      #23                 // Field _reuseDelay:I
        35: aload_0
        36: ldc           #26                 // class ext/mods/gameserver/model/actor/Player
        38: putfield      #28                 // Field _target:Ljava/lang/Class;
        41: aload_0
        42: iconst_1
        43: putfield      #32                 // Field _isEnabled:Z
        46: return
      LineNumberTable:
        line 56: 0
        line 43: 5
        line 45: 17
        line 46: 23
        line 47: 28
        line 48: 35
        line 50: 41
        line 57: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/zone/type/EffectZone;
            0      47     1    id   I

  public void setParameter(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=10, args_size=3
         0: aload_1
         1: ldc           #36                 // String chance
         3: invokevirtual #38                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          20
         9: aload_0
        10: aload_2
        11: invokestatic  #44                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        14: putfield      #16                 // Field _chance:I
        17: goto          291
        20: aload_1
        21: ldc           #50                 // String initialDelay
        23: invokevirtual #38                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        26: ifeq          40
        29: aload_0
        30: aload_2
        31: invokestatic  #44                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        34: putfield      #20                 // Field _initialDelay:I
        37: goto          291
        40: aload_1
        41: ldc           #52                 // String reuseDelay
        43: invokevirtual #38                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        46: ifeq          60
        49: aload_0
        50: aload_2
        51: invokestatic  #44                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        54: putfield      #23                 // Field _reuseDelay:I
        57: goto          291
        60: aload_1
        61: ldc           #54                 // String defaultStatus
        63: invokevirtual #38                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        66: ifeq          80
        69: aload_0
        70: aload_2
        71: invokestatic  #56                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        74: putfield      #32                 // Field _isEnabled:Z
        77: goto          291
        80: aload_1
        81: ldc           #62                 // String skill
        83: invokevirtual #38                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        86: ifeq          233
        89: aload_2
        90: ldc           #64                 // String ;
        92: invokevirtual #66                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        95: astore_3
        96: aload_3
        97: astore        4
        99: aload         4
       101: arraylength
       102: istore        5
       104: iconst_0
       105: istore        6
       107: iload         6
       109: iload         5
       111: if_icmpge     230
       114: aload         4
       116: iload         6
       118: aaload
       119: astore        7
       121: aload         7
       123: ldc           #70                 // String -
       125: invokevirtual #66                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       128: astore        8
       130: aload         8
       132: arraylength
       133: iconst_2
       134: if_icmpeq     164
       137: getstatic     #72                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       140: ldc           #76                 // String Invalid skill format {} for {}.
       142: iconst_2
       143: anewarray     #78                 // class java/lang/Object
       146: dup
       147: iconst_0
       148: aload         7
       150: aastore
       151: dup
       152: iconst_1
       153: aload_0
       154: invokevirtual #80                 // Method toString:()Ljava/lang/String;
       157: aastore
       158: invokevirtual #84                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       161: goto          224
       164: aload_0
       165: getfield      #10                 // Field _skills:Ljava/util/List;
       168: new           #90                 // class ext/mods/gameserver/model/holder/IntIntHolder
       171: dup
       172: aload         8
       174: iconst_0
       175: aaload
       176: invokestatic  #44                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       179: aload         8
       181: iconst_1
       182: aaload
       183: invokestatic  #44                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       186: invokespecial #92                 // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
       189: invokeinterface #95,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       194: pop
       195: goto          224
       198: astore        9
       200: getstatic     #72                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       203: ldc           #76                 // String Invalid skill format {} for {}.
       205: iconst_2
       206: anewarray     #78                 // class java/lang/Object
       209: dup
       210: iconst_0
       211: aload         7
       213: aastore
       214: dup
       215: iconst_1
       216: aload_0
       217: invokevirtual #80                 // Method toString:()Ljava/lang/String;
       220: aastore
       221: invokevirtual #84                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       224: iinc          6, 1
       227: goto          107
       230: goto          291
       233: aload_1
       234: ldc           #102                // String targetType
       236: invokevirtual #38                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       239: ifeq          285
       242: aload_0
       243: aload_2
       244: invokedynamic #104,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       249: invokestatic  #108                // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
       252: putfield      #28                 // Field _target:Ljava/lang/Class;
       255: goto          291
       258: astore_3
       259: getstatic     #72                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       262: ldc           #116                // String Invalid target type {} for {}.
       264: iconst_2
       265: anewarray     #78                 // class java/lang/Object
       268: dup
       269: iconst_0
       270: aload_2
       271: aastore
       272: dup
       273: iconst_1
       274: aload_0
       275: invokevirtual #80                 // Method toString:()Ljava/lang/String;
       278: aastore
       279: invokevirtual #118                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
       282: goto          291
       285: aload_0
       286: aload_1
       287: aload_2
       288: invokespecial #121                // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
       291: return
      Exception table:
         from    to  target type
           164   195   198   Class java/lang/NumberFormatException
           242   255   258   Class java/lang/ClassNotFoundException
      LineNumberTable:
        line 62: 0
        line 63: 9
        line 64: 20
        line 65: 29
        line 66: 40
        line 67: 49
        line 68: 60
        line 69: 69
        line 70: 80
        line 72: 89
        line 73: 96
        line 75: 121
        line 76: 130
        line 77: 137
        line 82: 164
        line 87: 195
        line 84: 198
        line 86: 200
        line 73: 224
        line 90: 230
        line 91: 233
        line 95: 242
        line 100: 255
        line 97: 258
        line 99: 259
        line 100: 282
        line 103: 285
        line 104: 291
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          200      24     9   nfe   Ljava/lang/NumberFormatException;
          130      94     8 skillSplit   [Ljava/lang/String;
          121     103     7 skill   Ljava/lang/String;
           96     134     3 skills   [Ljava/lang/String;
          259      23     3     e   Ljava/lang/ClassNotFoundException;
            0     292     0  this   Lext/mods/gameserver/model/zone/type/EffectZone;
            0     292     1  name   Ljava/lang/String;
            0     292     2 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 13
        frame_type = 20 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/zone/type/EffectZone, class java/lang/String, class java/lang/String, class "[Ljava/lang/String;", class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 56
          locals = [ class java/lang/String, class "[Ljava/lang/String;" ]
        frame_type = 97 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 249 /* chop */
          offset_delta = 25
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/zone/type/EffectZone, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 88 /* same_locals_1_stack_item */
          stack = [ class java/lang/ClassNotFoundException ]
        frame_type = 26 /* same */
        frame_type = 5 /* same */

  protected boolean isAffected(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #28                 // Field _target:Ljava/lang/Class;
         4: aload_1
         5: invokevirtual #125                // Method java/lang/Class.isInstance:(Ljava/lang/Object;)Z
         8: ireturn
      LineNumberTable:
        line 109: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/zone/type/EffectZone;
            0       9     1 creature   Lext/mods/gameserver/model/actor/Creature;

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=5, args_size=2
         0: aload_0
         1: getfield      #128                // Field _task:Ljava/util/concurrent/Future;
         4: astore_2
         5: aload_2
         6: ifnonnull     57
         9: aload_0
        10: dup
        11: astore_3
        12: monitorenter
        13: aload_0
        14: getfield      #128                // Field _task:Ljava/util/concurrent/Future;
        17: astore_2
        18: aload_2
        19: ifnonnull     45
        22: aload_0
        23: aload_0
        24: invokedynamic #132,  0            // InvokeDynamic #1:run:(Lext/mods/gameserver/model/zone/type/EffectZone;)Ljava/lang/Runnable;
        29: aload_0
        30: getfield      #20                 // Field _initialDelay:I
        33: i2l
        34: aload_0
        35: getfield      #23                 // Field _reuseDelay:I
        38: i2l
        39: invokestatic  #136                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        42: putfield      #128                // Field _task:Ljava/util/concurrent/Future;
        45: aload_3
        46: monitorexit
        47: goto          57
        50: astore        4
        52: aload_3
        53: monitorexit
        54: aload         4
        56: athrow
        57: aload_1
        58: instanceof    #26                 // class ext/mods/gameserver/model/actor/Player
        61: ifeq          89
        64: aload_1
        65: checkcast     #26                 // class ext/mods/gameserver/model/actor/Player
        68: astore_3
        69: aload_3
        70: getstatic     #142                // Field ext/mods/gameserver/enums/ZoneId.DANGER_AREA:Lext/mods/gameserver/enums/ZoneId;
        73: iconst_1
        74: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        77: aload_3
        78: new           #152                // class ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
        81: dup
        82: aload_3
        83: invokespecial #154                // Method ext/mods/gameserver/network/serverpackets/EtcStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        86: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        89: return
      Exception table:
         from    to  target type
            13    47    50   any
            50    54    50   any
      LineNumberTable:
        line 115: 0
        line 116: 5
        line 118: 9
        line 120: 13
        line 121: 18
        line 123: 22
        line 125: 45
        line 128: 57
        line 130: 69
        line 131: 77
        line 133: 89
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           69      20     3 player   Lext/mods/gameserver/model/actor/Player;
            0      90     0  this   Lext/mods/gameserver/model/zone/type/EffectZone;
            0      90     1 creature   Lext/mods/gameserver/model/actor/Creature;
            5      85     2  task   Ljava/util/concurrent/Future;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            5      85     2  task   Ljava/util/concurrent/Future<*>;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 45
          locals = [ class java/util/concurrent/Future, class java/lang/Object ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 31 /* same */

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=3, args_size=2
         0: aload_1
         1: instanceof    #26                 // class ext/mods/gameserver/model/actor/Player
         4: ifeq          42
         7: aload_1
         8: checkcast     #26                 // class ext/mods/gameserver/model/actor/Player
        11: astore_2
        12: aload_2
        13: getstatic     #142                // Field ext/mods/gameserver/enums/ZoneId.DANGER_AREA:Lext/mods/gameserver/enums/ZoneId;
        16: iconst_0
        17: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        20: aload_2
        21: getstatic     #142                // Field ext/mods/gameserver/enums/ZoneId.DANGER_AREA:Lext/mods/gameserver/enums/ZoneId;
        24: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        27: ifne          42
        30: aload_2
        31: new           #152                // class ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
        34: dup
        35: aload_2
        36: invokespecial #154                // Method ext/mods/gameserver/network/serverpackets/EtcStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        39: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        42: return
      LineNumberTable:
        line 138: 0
        line 140: 12
        line 142: 20
        line 143: 30
        line 145: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      30     2 player   Lext/mods/gameserver/model/actor/Player;
            0      43     0  this   Lext/mods/gameserver/model/zone/type/EffectZone;
            0      43     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 42 /* same */

  public void editStatus(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #32                 // Field _isEnabled:Z
         5: return
      LineNumberTable:
        line 153: 0
        line 154: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/zone/type/EffectZone;
            0       6     1 state   Z
}
SourceFile: "EffectZone.java"
BootstrapMethods:
  0: #291 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #282 ext.mods.gameserver.model.actor.\u0001
  1: #297 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #284 ()V
      #285 REF_invokeVirtual ext/mods/gameserver/model/zone/type/EffectZone.lambda$onEnter$0:()V
      #284 ()V
  2: #297 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #284 ()V
      #288 REF_invokeVirtual ext/mods/gameserver/model/zone/type/EffectZone.applyEffect:()V
      #284 ()V
InnerClasses:
  public static final #309= #305 of #307; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
