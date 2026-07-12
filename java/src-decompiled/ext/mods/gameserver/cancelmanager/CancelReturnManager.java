// Bytecode for: ext.mods.gameserver.cancelmanager.CancelReturnManager
// File: ext\mods\gameserver\cancelmanager\CancelReturnManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/cancelmanager/CancelReturnManager.class
  Last modified 9 de jul de 2026; size 11242 bytes
  MD5 checksum 08f358ede4b0f9dc79d1df2d94c721cb
  Compiled from "CancelReturnManager.java"
public final class ext.mods.gameserver.cancelmanager.CancelReturnManager
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #15                         // ext/mods/gameserver/cancelmanager/CancelReturnManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 16, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/lang/UnsupportedOperationException
    #8 = Utf8               java/lang/UnsupportedOperationException
    #9 = String             #10           // Classe utilitária não pode ser instanciada
   #10 = Utf8               Classe utilitária não pode ser instanciada
   #11 = Methodref          #7.#12        // java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;)V
   #14 = Methodref          #15.#16       // ext/mods/gameserver/cancelmanager/CancelReturnManager.isValidForProcessing:(Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;)Z
   #15 = Class              #17           // ext/mods/gameserver/cancelmanager/CancelReturnManager
   #16 = NameAndType        #18:#19       // isValidForProcessing:(Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;)Z
   #17 = Utf8               ext/mods/gameserver/cancelmanager/CancelReturnManager
   #18 = Utf8               isValidForProcessing
   #19 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;)Z
   #20 = Methodref          #15.#21       // ext/mods/gameserver/cancelmanager/CancelReturnManager.shouldProcessForMode:(Z)Z
   #21 = NameAndType        #22:#23       // shouldProcessForMode:(Z)Z
   #22 = Utf8               shouldProcessForMode
   #23 = Utf8               (Z)Z
   #24 = Methodref          #15.#25       // ext/mods/gameserver/cancelmanager/CancelReturnManager.saveAndSchedule:(Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;)V
   #25 = NameAndType        #26:#27       // saveAndSchedule:(Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;)V
   #26 = Utf8               saveAndSchedule
   #27 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;)V
   #28 = Fieldref           #29.#30       // ext/mods/Config.CANCEL_RETURN_ENABLED:Z
   #29 = Class              #31           // ext/mods/Config
   #30 = NameAndType        #32:#33       // CANCEL_RETURN_ENABLED:Z
   #31 = Utf8               ext/mods/Config
   #32 = Utf8               CANCEL_RETURN_ENABLED
   #33 = Utf8               Z
   #34 = InterfaceMethodref #35.#36       // java/util/List.isEmpty:()Z
   #35 = Class              #37           // java/util/List
   #36 = NameAndType        #38:#39       // isEmpty:()Z
   #37 = Utf8               java/util/List
   #38 = Utf8               isEmpty
   #39 = Utf8               ()Z
   #40 = Fieldref           #29.#41       // ext/mods/Config.CANCEL_RETURN_MASS_ONLY:Z
   #41 = NameAndType        #42:#33       // CANCEL_RETURN_MASS_ONLY:Z
   #42 = Utf8               CANCEL_RETURN_MASS_ONLY
   #43 = Fieldref           #29.#44       // ext/mods/Config.CANCEL_RETURN_MASS_MIN_COUNT:I
   #44 = NameAndType        #45:#46       // CANCEL_RETURN_MASS_MIN_COUNT:I
   #45 = Utf8               CANCEL_RETURN_MASS_MIN_COUNT
   #46 = Utf8               I
   #47 = Methodref          #48.#49       // java/lang/Math.max:(II)I
   #48 = Class              #50           // java/lang/Math
   #49 = NameAndType        #51:#52       // max:(II)I
   #50 = Utf8               java/lang/Math
   #51 = Utf8               max
   #52 = Utf8               (II)I
   #53 = InterfaceMethodref #35.#54       // java/util/List.size:()I
   #54 = NameAndType        #55:#56       // size:()I
   #55 = Utf8               size
   #56 = Utf8               ()I
   #57 = Fieldref           #29.#58       // ext/mods/Config.CANCEL_RETURN_SKIP_OLYMPIAD:Z
   #58 = NameAndType        #59:#33       // CANCEL_RETURN_SKIP_OLYMPIAD:Z
   #59 = Utf8               CANCEL_RETURN_SKIP_OLYMPIAD
   #60 = Class              #61           // ext/mods/gameserver/model/actor/Player
   #61 = Utf8               ext/mods/gameserver/model/actor/Player
   #62 = Methodref          #60.#63       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #63 = NameAndType        #64:#39       // isInOlympiadMode:()Z
   #64 = Utf8               isInOlympiadMode
   #65 = Fieldref           #29.#66       // ext/mods/Config.CANCEL_RETURN_MODE:Ljava/lang/String;
   #66 = NameAndType        #67:#68       // CANCEL_RETURN_MODE:Ljava/lang/String;
   #67 = Utf8               CANCEL_RETURN_MODE
   #68 = Utf8               Ljava/lang/String;
   #69 = Methodref          #70.#71       // ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode.fromString:(Ljava/lang/String;)Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
   #70 = Class              #72           // ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode
   #71 = NameAndType        #73:#74       // fromString:(Ljava/lang/String;)Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
   #72 = Utf8               ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode
   #73 = Utf8               fromString
   #74 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
   #75 = Methodref          #70.#76       // ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode.ordinal:()I
   #76 = NameAndType        #77:#56       // ordinal:()I
   #77 = Utf8               ordinal
   #78 = Class              #79           // java/lang/MatchException
   #79 = Utf8               java/lang/MatchException
   #80 = Methodref          #78.#81       // java/lang/MatchException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
   #81 = NameAndType        #5:#82        // "<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
   #82 = Utf8               (Ljava/lang/String;Ljava/lang/Throwable;)V
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
   #84 = Class              #86           // ext/mods/gameserver/model/actor/Creature
   #85 = NameAndType        #87:#56       // getObjectId:()I
   #86 = Utf8               ext/mods/gameserver/model/actor/Creature
   #87 = Utf8               getObjectId
   #88 = Methodref          #15.#89       // ext/mods/gameserver/cancelmanager/CancelReturnManager.cancelPreviousTask:(I)V
   #89 = NameAndType        #90:#91       // cancelPreviousTask:(I)V
   #90 = Utf8               cancelPreviousTask
   #91 = Utf8               (I)V
   #92 = Fieldref           #15.#93       // ext/mods/gameserver/cancelmanager/CancelReturnManager.PENDING_BUFFS:Ljava/util/Map;
   #93 = NameAndType        #94:#95       // PENDING_BUFFS:Ljava/util/Map;
   #94 = Utf8               PENDING_BUFFS
   #95 = Utf8               Ljava/util/Map;
   #96 = Methodref          #97.#98       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #97 = Class              #99           // java/lang/Integer
   #98 = NameAndType        #100:#101     // valueOf:(I)Ljava/lang/Integer;
   #99 = Utf8               java/lang/Integer
  #100 = Utf8               valueOf
  #101 = Utf8               (I)Ljava/lang/Integer;
  #102 = InvokeDynamic      #0:#103       // #0:apply:()Ljava/util/function/Function;
  #103 = NameAndType        #104:#105     // apply:()Ljava/util/function/Function;
  #104 = Utf8               apply
  #105 = Utf8               ()Ljava/util/function/Function;
  #106 = InterfaceMethodref #107.#108     // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #107 = Class              #109          // java/util/Map
  #108 = NameAndType        #110:#111     // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #109 = Utf8               java/util/Map
  #110 = Utf8               computeIfAbsent
  #111 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #112 = InterfaceMethodref #35.#113      // java/util/List.iterator:()Ljava/util/Iterator;
  #113 = NameAndType        #114:#115     // iterator:()Ljava/util/Iterator;
  #114 = Utf8               iterator
  #115 = Utf8               ()Ljava/util/Iterator;
  #116 = InterfaceMethodref #117.#118     // java/util/Iterator.hasNext:()Z
  #117 = Class              #119          // java/util/Iterator
  #118 = NameAndType        #120:#39      // hasNext:()Z
  #119 = Utf8               java/util/Iterator
  #120 = Utf8               hasNext
  #121 = InterfaceMethodref #117.#122     // java/util/Iterator.next:()Ljava/lang/Object;
  #122 = NameAndType        #123:#124     // next:()Ljava/lang/Object;
  #123 = Utf8               next
  #124 = Utf8               ()Ljava/lang/Object;
  #125 = Class              #126          // ext/mods/gameserver/skills/AbstractEffect
  #126 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #127 = Methodref          #125.#128     // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #128 = NameAndType        #129:#130     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #129 = Utf8               getSkill
  #130 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #131 = Methodref          #132.#133     // ext/mods/gameserver/skills/L2Skill.canBeDispeled:()Z
  #132 = Class              #134          // ext/mods/gameserver/skills/L2Skill
  #133 = NameAndType        #135:#39      // canBeDispeled:()Z
  #134 = Utf8               ext/mods/gameserver/skills/L2Skill
  #135 = Utf8               canBeDispeled
  #136 = Methodref          #125.#137     // ext/mods/gameserver/skills/AbstractEffect.getPeriod:()I
  #137 = NameAndType        #138:#56      // getPeriod:()I
  #138 = Utf8               getPeriod
  #139 = Methodref          #125.#140     // ext/mods/gameserver/skills/AbstractEffect.getTime:()I
  #140 = NameAndType        #141:#56      // getTime:()I
  #141 = Utf8               getTime
  #142 = Methodref          #132.#143     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #143 = NameAndType        #144:#56      // getId:()I
  #144 = Utf8               getId
  #145 = Class              #146          // ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff
  #146 = Utf8               ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff
  #147 = Methodref          #132.#148     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #148 = NameAndType        #149:#56      // getLevel:()I
  #149 = Utf8               getLevel
  #150 = Methodref          #145.#151     // ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff."<init>":(III)V
  #151 = NameAndType        #5:#152       // "<init>":(III)V
  #152 = Utf8               (III)V
  #153 = InterfaceMethodref #107.#154     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #154 = NameAndType        #155:#156     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #155 = Utf8               put
  #156 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #157 = InterfaceMethodref #107.#36      // java/util/Map.isEmpty:()Z
  #158 = InterfaceMethodref #107.#159     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #159 = NameAndType        #160:#161     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #160 = Utf8               remove
  #161 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #162 = Fieldref           #29.#163      // ext/mods/Config.CANCEL_RETURN_TIME_MS:I
  #163 = NameAndType        #164:#46      // CANCEL_RETURN_TIME_MS:I
  #164 = Utf8               CANCEL_RETURN_TIME_MS
  #165 = InvokeDynamic      #1:#166       // #1:run:(JLext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #166 = NameAndType        #167:#168     // run:(JLext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #167 = Utf8               run
  #168 = Utf8               (JLext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #169 = Methodref          #170.#171     // java/util/concurrent/CompletableFuture.runAsync:(Ljava/lang/Runnable;)Ljava/util/concurrent/CompletableFuture;
  #170 = Class              #172          // java/util/concurrent/CompletableFuture
  #171 = NameAndType        #173:#174     // runAsync:(Ljava/lang/Runnable;)Ljava/util/concurrent/CompletableFuture;
  #172 = Utf8               java/util/concurrent/CompletableFuture
  #173 = Utf8               runAsync
  #174 = Utf8               (Ljava/lang/Runnable;)Ljava/util/concurrent/CompletableFuture;
  #175 = InvokeDynamic      #2:#176       // #2:accept:(I)Ljava/util/function/BiConsumer;
  #176 = NameAndType        #177:#178     // accept:(I)Ljava/util/function/BiConsumer;
  #177 = Utf8               accept
  #178 = Utf8               (I)Ljava/util/function/BiConsumer;
  #179 = Methodref          #170.#180     // java/util/concurrent/CompletableFuture.whenComplete:(Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
  #180 = NameAndType        #181:#182     // whenComplete:(Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
  #181 = Utf8               whenComplete
  #182 = Utf8               (Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
  #183 = Fieldref           #15.#184      // ext/mods/gameserver/cancelmanager/CancelReturnManager.PENDING_TASKS:Ljava/util/Map;
  #184 = NameAndType        #185:#95      // PENDING_TASKS:Ljava/util/Map;
  #185 = Utf8               PENDING_TASKS
  #186 = Fieldref           #29.#187      // ext/mods/Config.DEVELOPER:Z
  #187 = NameAndType        #188:#33      // DEVELOPER:Z
  #188 = Utf8               DEVELOPER
  #189 = Fieldref           #15.#190      // ext/mods/gameserver/cancelmanager/CancelReturnManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #190 = NameAndType        #191:#192     // LOGGER:Lext/mods/commons/logging/CLogger;
  #191 = Utf8               LOGGER
  #192 = Utf8               Lext/mods/commons/logging/CLogger;
  #193 = String             #194          // CancelReturn: Salvou {} buffs para {} (restauração em {}ms)
  #194 = Utf8               CancelReturn: Salvou {} buffs para {} (restauração em {}ms)
  #195 = InterfaceMethodref #107.#54      // java/util/Map.size:()I
  #196 = Methodref          #84.#197      // ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
  #197 = NameAndType        #198:#199     // getName:()Ljava/lang/String;
  #198 = Utf8               getName
  #199 = Utf8               ()Ljava/lang/String;
  #200 = Methodref          #201.#202     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #201 = Class              #203          // java/lang/Long
  #202 = NameAndType        #100:#204     // valueOf:(J)Ljava/lang/Long;
  #203 = Utf8               java/lang/Long
  #204 = Utf8               (J)Ljava/lang/Long;
  #205 = Methodref          #206.#207     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #206 = Class              #208          // ext/mods/commons/logging/CLogger
  #207 = NameAndType        #209:#210     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #208 = Utf8               ext/mods/commons/logging/CLogger
  #209 = Utf8               info
  #210 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #211 = Methodref          #170.#212     // java/util/concurrent/CompletableFuture.isDone:()Z
  #212 = NameAndType        #213:#39      // isDone:()Z
  #213 = Utf8               isDone
  #214 = Methodref          #170.#215     // java/util/concurrent/CompletableFuture.cancel:(Z)Z
  #215 = NameAndType        #216:#23      // cancel:(Z)Z
  #216 = Utf8               cancel
  #217 = Methodref          #84.#218      // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #218 = NameAndType        #219:#39      // isDead:()Z
  #219 = Utf8               isDead
  #220 = Methodref          #15.#221      // ext/mods/gameserver/cancelmanager/CancelReturnManager.cleanup:(Lext/mods/gameserver/model/actor/Creature;)V
  #221 = NameAndType        #222:#223     // cleanup:(Lext/mods/gameserver/model/actor/Creature;)V
  #222 = Utf8               cleanup
  #223 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #224 = Class              #225          // java/util/ArrayList
  #225 = Utf8               java/util/ArrayList
  #226 = InterfaceMethodref #107.#227     // java/util/Map.values:()Ljava/util/Collection;
  #227 = NameAndType        #228:#229     // values:()Ljava/util/Collection;
  #228 = Utf8               values
  #229 = Utf8               ()Ljava/util/Collection;
  #230 = Methodref          #224.#231     // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
  #231 = NameAndType        #5:#232       // "<init>":(Ljava/util/Collection;)V
  #232 = Utf8               (Ljava/util/Collection;)V
  #233 = Methodref          #145.#234     // ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff.skillId:()I
  #234 = NameAndType        #235:#56      // skillId:()I
  #235 = Utf8               skillId
  #236 = Methodref          #84.#237      // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #237 = NameAndType        #238:#239     // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #238 = Utf8               getFirstEffect
  #239 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #240 = Methodref          #241.#242     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #241 = Class              #243          // ext/mods/gameserver/data/SkillTable
  #242 = NameAndType        #244:#245     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #243 = Utf8               ext/mods/gameserver/data/SkillTable
  #244 = Utf8               getInstance
  #245 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #246 = Methodref          #145.#247     // ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff.level:()I
  #247 = NameAndType        #248:#56      // level:()I
  #248 = Utf8               level
  #249 = Methodref          #241.#250     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #250 = NameAndType        #251:#252     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #251 = Utf8               getInfo
  #252 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #253 = Methodref          #132.#254     // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #254 = NameAndType        #255:#256     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #255 = Utf8               getEffects
  #256 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #257 = Methodref          #145.#258     // ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff.remainingSec:()I
  #258 = NameAndType        #259:#56      // remainingSec:()I
  #259 = Utf8               remainingSec
  #260 = Methodref          #125.#261     // ext/mods/gameserver/skills/AbstractEffect.setPeriod:(I)V
  #261 = NameAndType        #262:#91      // setPeriod:(I)V
  #262 = Utf8               setPeriod
  #263 = Methodref          #125.#264     // ext/mods/gameserver/skills/AbstractEffect.setTime:(I)V
  #264 = NameAndType        #265:#91      // setTime:(I)V
  #265 = Utf8               setTime
  #266 = Methodref          #125.#267     // ext/mods/gameserver/skills/AbstractEffect.rescheduleEffect:()V
  #267 = NameAndType        #268:#6       // rescheduleEffect:()V
  #268 = Utf8               rescheduleEffect
  #269 = Methodref          #84.#270      // ext/mods/gameserver/model/actor/Creature.updateAbnormalEffect:()V
  #270 = NameAndType        #271:#6       // updateAbnormalEffect:()V
  #271 = Utf8               updateAbnormalEffect
  #272 = Class              #273          // java/lang/Exception
  #273 = Utf8               java/lang/Exception
  #274 = String             #275          // Erro ao restaurar buff {} para {}
  #275 = Utf8               Erro ao restaurar buff {} para {}
  #276 = Methodref          #206.#277     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #277 = NameAndType        #278:#210     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #278 = Utf8               warn
  #279 = Fieldref           #29.#280      // ext/mods/Config.CANCEL_RETURN_NOTIFY:Z
  #280 = NameAndType        #281:#33      // CANCEL_RETURN_NOTIFY:Z
  #281 = Utf8               CANCEL_RETURN_NOTIFY
  #282 = Fieldref           #29.#283      // ext/mods/Config.CANCEL_RETURN_MESSAGE:Ljava/lang/String;
  #283 = NameAndType        #284:#68      // CANCEL_RETURN_MESSAGE:Ljava/lang/String;
  #284 = Utf8               CANCEL_RETURN_MESSAGE
  #285 = Methodref          #60.#286      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #286 = NameAndType        #287:#13      // sendMessage:(Ljava/lang/String;)V
  #287 = Utf8               sendMessage
  #288 = String             #289          // CancelReturn: Restaurou {} buffs para {}
  #289 = Utf8               CancelReturn: Restaurou {} buffs para {}
  #290 = InvokeDynamic      #3:#291       // #3:accept:()Ljava/util/function/Consumer;
  #291 = NameAndType        #177:#292     // accept:()Ljava/util/function/Consumer;
  #292 = Utf8               ()Ljava/util/function/Consumer;
  #293 = InterfaceMethodref #294.#295     // java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
  #294 = Class              #296          // java/util/Collection
  #295 = NameAndType        #297:#298     // forEach:(Ljava/util/function/Consumer;)V
  #296 = Utf8               java/util/Collection
  #297 = Utf8               forEach
  #298 = Utf8               (Ljava/util/function/Consumer;)V
  #299 = InterfaceMethodref #107.#300     // java/util/Map.clear:()V
  #300 = NameAndType        #301:#6       // clear:()V
  #301 = Utf8               clear
  #302 = String             #303          // CancelReturn: Limpeza completa realizada
  #303 = Utf8               CancelReturn: Limpeza completa realizada
  #304 = Methodref          #206.#305     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #305 = NameAndType        #209:#306     // info:(Ljava/lang/Object;)V
  #306 = Utf8               (Ljava/lang/Object;)V
  #307 = InterfaceMethodref #294.#308     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #308 = NameAndType        #309:#310     // stream:()Ljava/util/stream/Stream;
  #309 = Utf8               stream
  #310 = Utf8               ()Ljava/util/stream/Stream;
  #311 = InvokeDynamic      #4:#312       // #4:applyAsInt:()Ljava/util/function/ToIntFunction;
  #312 = NameAndType        #313:#314     // applyAsInt:()Ljava/util/function/ToIntFunction;
  #313 = Utf8               applyAsInt
  #314 = Utf8               ()Ljava/util/function/ToIntFunction;
  #315 = InterfaceMethodref #316.#317     // java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #316 = Class              #318          // java/util/stream/Stream
  #317 = NameAndType        #319:#320     // mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #318 = Utf8               java/util/stream/Stream
  #319 = Utf8               mapToInt
  #320 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #321 = InterfaceMethodref #322.#323     // java/util/stream/IntStream.sum:()I
  #322 = Class              #324          // java/util/stream/IntStream
  #323 = NameAndType        #325:#56      // sum:()I
  #324 = Utf8               java/util/stream/IntStream
  #325 = Utf8               sum
  #326 = String             #327          // CancelReturn Stats: %d targets, %d buffs pendentes, %d tarefas ativas
  #327 = Utf8               CancelReturn Stats: %d targets, %d buffs pendentes, %d tarefas ativas
  #328 = Methodref          #329.#330     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #329 = Class              #331          // java/lang/String
  #330 = NameAndType        #332:#333     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #331 = Utf8               java/lang/String
  #332 = Utf8               format
  #333 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #334 = Methodref          #335.#336     // java/lang/Thread.sleep:(J)V
  #335 = Class              #337          // java/lang/Thread
  #336 = NameAndType        #338:#339     // sleep:(J)V
  #337 = Utf8               java/lang/Thread
  #338 = Utf8               sleep
  #339 = Utf8               (J)V
  #340 = Methodref          #15.#341      // ext/mods/gameserver/cancelmanager/CancelReturnManager.restoreNow:(Lext/mods/gameserver/model/actor/Creature;)V
  #341 = NameAndType        #342:#223     // restoreNow:(Lext/mods/gameserver/model/actor/Creature;)V
  #342 = Utf8               restoreNow
  #343 = Class              #344          // java/lang/InterruptedException
  #344 = Utf8               java/lang/InterruptedException
  #345 = Methodref          #335.#346     // java/lang/Thread.currentThread:()Ljava/lang/Thread;
  #346 = NameAndType        #347:#348     // currentThread:()Ljava/lang/Thread;
  #347 = Utf8               currentThread
  #348 = Utf8               ()Ljava/lang/Thread;
  #349 = Methodref          #335.#350     // java/lang/Thread.interrupt:()V
  #350 = NameAndType        #351:#6       // interrupt:()V
  #351 = Utf8               interrupt
  #352 = Class              #353          // java/util/concurrent/ConcurrentHashMap
  #353 = Utf8               java/util/concurrent/ConcurrentHashMap
  #354 = Methodref          #352.#3       // java/util/concurrent/ConcurrentHashMap."<init>":()V
  #355 = Methodref          #356.#197     // java/lang/Class.getName:()Ljava/lang/String;
  #356 = Class              #357          // java/lang/Class
  #357 = Utf8               java/lang/Class
  #358 = Methodref          #206.#12      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #359 = Utf8               Signature
  #360 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff;>;>;
  #361 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/concurrent/CompletableFuture<Ljava/lang/Void;>;>;
  #362 = Utf8               Code
  #363 = Utf8               LineNumberTable
  #364 = Utf8               LocalVariableTable
  #365 = Utf8               this
  #366 = Utf8               Lext/mods/gameserver/cancelmanager/CancelReturnManager;
  #367 = Utf8               onCancel
  #368 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
  #369 = Utf8               target
  #370 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #371 = Utf8               cancelSkill
  #372 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #373 = Utf8               cancelled
  #374 = Utf8               Ljava/util/List;
  #375 = Utf8               LocalVariableTypeTable
  #376 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
  #377 = Utf8               StackMapTable
  #378 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;)V
  #379 = Utf8               onNegate
  #380 = Utf8               negateSkill
  #381 = Utf8               minCount
  #382 = Utf8               player
  #383 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #384 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;)Z
  #385 = Utf8               isCancel
  #386 = Utf8               mode
  #387 = Utf8               Lext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode;
  #388 = Utf8               skill
  #389 = Utf8               period
  #390 = Utf8               remaining
  #391 = Utf8               effect
  #392 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #393 = Utf8               objectId
  #394 = Utf8               buffsMap
  #395 = Utf8               delayMs
  #396 = Utf8               J
  #397 = Utf8               task
  #398 = Utf8               Ljava/util/concurrent/CompletableFuture;
  #399 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff;>;
  #400 = Utf8               Ljava/util/concurrent/CompletableFuture<Ljava/lang/Void;>;
  #401 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;)V
  #402 = Utf8               existingTask
  #403 = Utf8               newEffect
  #404 = Utf8               newEffects
  #405 = Utf8               e
  #406 = Utf8               Ljava/lang/Exception;
  #407 = Utf8               savedBuff
  #408 = Utf8               Lext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff;
  #409 = Utf8               buffsToRestore
  #410 = Utf8               anyRestored
  #411 = Utf8               Ljava/util/List<Lext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff;>;
  #412 = Utf8               getStats
  #413 = Utf8               totalPendingBuffs
  #414 = Utf8               lambda$cleanup$0
  #415 = Utf8               (Ljava/util/concurrent/CompletableFuture;)V
  #416 = Utf8               lambda$saveAndSchedule$2
  #417 = Utf8               (ILjava/lang/Void;Ljava/lang/Throwable;)V
  #418 = Utf8               result
  #419 = Utf8               Ljava/lang/Void;
  #420 = Utf8               throwable
  #421 = Utf8               Ljava/lang/Throwable;
  #422 = Utf8               lambda$saveAndSchedule$1
  #423 = Utf8               (JLext/mods/gameserver/model/actor/Creature;)V
  #424 = Utf8               Ljava/lang/InterruptedException;
  #425 = Utf8               lambda$saveAndSchedule$0
  #426 = Utf8               (Ljava/lang/Integer;)Ljava/util/Map;
  #427 = Utf8               k
  #428 = Utf8               Ljava/lang/Integer;
  #429 = Utf8               <clinit>
  #430 = Utf8               SourceFile
  #431 = Utf8               CancelReturnManager.java
  #432 = Utf8               NestMembers
  #433 = Utf8               BootstrapMethods
  #434 = MethodType         #161          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #435 = MethodHandle       6:#436        // REF_invokeStatic ext/mods/gameserver/cancelmanager/CancelReturnManager.lambda$saveAndSchedule$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #436 = Methodref          #15.#437      // ext/mods/gameserver/cancelmanager/CancelReturnManager.lambda$saveAndSchedule$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #437 = NameAndType        #425:#426     // lambda$saveAndSchedule$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #438 = MethodType         #426          //  (Ljava/lang/Integer;)Ljava/util/Map;
  #439 = MethodType         #6            //  ()V
  #440 = MethodHandle       6:#441        // REF_invokeStatic ext/mods/gameserver/cancelmanager/CancelReturnManager.lambda$saveAndSchedule$1:(JLext/mods/gameserver/model/actor/Creature;)V
  #441 = Methodref          #15.#442      // ext/mods/gameserver/cancelmanager/CancelReturnManager.lambda$saveAndSchedule$1:(JLext/mods/gameserver/model/actor/Creature;)V
  #442 = NameAndType        #422:#423     // lambda$saveAndSchedule$1:(JLext/mods/gameserver/model/actor/Creature;)V
  #443 = MethodType         #444          //  (Ljava/lang/Object;Ljava/lang/Object;)V
  #444 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #445 = MethodHandle       6:#446        // REF_invokeStatic ext/mods/gameserver/cancelmanager/CancelReturnManager.lambda$saveAndSchedule$2:(ILjava/lang/Void;Ljava/lang/Throwable;)V
  #446 = Methodref          #15.#447      // ext/mods/gameserver/cancelmanager/CancelReturnManager.lambda$saveAndSchedule$2:(ILjava/lang/Void;Ljava/lang/Throwable;)V
  #447 = NameAndType        #416:#417     // lambda$saveAndSchedule$2:(ILjava/lang/Void;Ljava/lang/Throwable;)V
  #448 = MethodType         #449          //  (Ljava/lang/Void;Ljava/lang/Throwable;)V
  #449 = Utf8               (Ljava/lang/Void;Ljava/lang/Throwable;)V
  #450 = MethodType         #306          //  (Ljava/lang/Object;)V
  #451 = MethodHandle       6:#452        // REF_invokeStatic ext/mods/gameserver/cancelmanager/CancelReturnManager.lambda$cleanup$0:(Ljava/util/concurrent/CompletableFuture;)V
  #452 = Methodref          #15.#453      // ext/mods/gameserver/cancelmanager/CancelReturnManager.lambda$cleanup$0:(Ljava/util/concurrent/CompletableFuture;)V
  #453 = NameAndType        #414:#415     // lambda$cleanup$0:(Ljava/util/concurrent/CompletableFuture;)V
  #454 = MethodType         #415          //  (Ljava/util/concurrent/CompletableFuture;)V
  #455 = MethodType         #456          //  (Ljava/lang/Object;)I
  #456 = Utf8               (Ljava/lang/Object;)I
  #457 = MethodHandle       9:#195        // REF_invokeInterface java/util/Map.size:()I
  #458 = MethodType         #459          //  (Ljava/util/Map;)I
  #459 = Utf8               (Ljava/util/Map;)I
  #460 = MethodHandle       6:#461        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #461 = Methodref          #462.#463     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #462 = Class              #464          // java/lang/invoke/LambdaMetafactory
  #463 = NameAndType        #465:#466     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #464 = Utf8               java/lang/invoke/LambdaMetafactory
  #465 = Utf8               metafactory
  #466 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #467 = Utf8               InnerClasses
  #468 = Utf8               CancelMode
  #469 = Utf8               SavedBuff
  #470 = Class              #471          // java/lang/invoke/MethodHandles$Lookup
  #471 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #472 = Class              #473          // java/lang/invoke/MethodHandles
  #473 = Utf8               java/lang/invoke/MethodHandles
  #474 = Utf8               Lookup
{
  public static void onCancel(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, java.util.List<ext.mods.gameserver.skills.AbstractEffect>);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: aload_2
         2: invokestatic  #14                 // Method isValidForProcessing:(Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;)Z
         5: ifne          9
         8: return
         9: iconst_1
        10: invokestatic  #20                 // Method shouldProcessForMode:(Z)Z
        13: ifne          17
        16: return
        17: aload_0
        18: aload_2
        19: invokestatic  #24                 // Method saveAndSchedule:(Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;)V
        22: return
      LineNumberTable:
        line 120: 0
        line 121: 8
        line 123: 9
        line 124: 16
        line 126: 17
        line 127: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0 target   Lext/mods/gameserver/model/actor/Creature;
            0      23     1 cancelSkill   Lext/mods/gameserver/skills/L2Skill;
            0      23     2 cancelled   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      23     2 cancelled   Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 7 /* same */
    Signature: #378                         // (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;)V

  public static void onNegate(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, java.util.List<ext.mods.gameserver.skills.AbstractEffect>);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: aload_2
         2: invokestatic  #14                 // Method isValidForProcessing:(Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;)Z
         5: ifne          9
         8: return
         9: iconst_0
        10: invokestatic  #20                 // Method shouldProcessForMode:(Z)Z
        13: ifne          17
        16: return
        17: aload_0
        18: aload_2
        19: invokestatic  #24                 // Method saveAndSchedule:(Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;)V
        22: return
      LineNumberTable:
        line 137: 0
        line 138: 8
        line 140: 9
        line 141: 16
        line 143: 17
        line 144: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0 target   Lext/mods/gameserver/model/actor/Creature;
            0      23     1 negateSkill   Lext/mods/gameserver/skills/L2Skill;
            0      23     2 cancelled   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      23     2 cancelled   Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 7 /* same */
    Signature: #378                         // (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;)V

  public static void cleanup(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: ifnonnull     5
         4: return
         5: aload_0
         6: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
         9: istore_1
        10: iload_1
        11: invokestatic  #88                 // Method cancelPreviousTask:(I)V
        14: getstatic     #92                 // Field PENDING_BUFFS:Ljava/util/Map;
        17: iload_1
        18: invokestatic  #96                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        21: invokeinterface #158,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        26: pop
        27: return
      LineNumberTable:
        line 337: 0
        line 338: 4
        line 340: 5
        line 342: 10
        line 344: 14
        line 345: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0 target   Lext/mods/gameserver/model/actor/Creature;
           10      18     1 objectId   I
      StackMapTable: number_of_entries = 1
        frame_type = 5 /* same */

  public static void cleanup();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #183                // Field PENDING_TASKS:Ljava/util/Map;
         3: invokeinterface #226,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         8: invokedynamic #290,  0            // InvokeDynamic #3:accept:()Ljava/util/function/Consumer;
        13: invokeinterface #293,  2          // InterfaceMethod java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
        18: getstatic     #183                // Field PENDING_TASKS:Ljava/util/Map;
        21: invokeinterface #299,  1          // InterfaceMethod java/util/Map.clear:()V
        26: getstatic     #92                 // Field PENDING_BUFFS:Ljava/util/Map;
        29: invokeinterface #299,  1          // InterfaceMethod java/util/Map.clear:()V
        34: getstatic     #189                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        37: ldc_w         #302                // String CancelReturn: Limpeza completa realizada
        40: invokevirtual #304                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        43: return
      LineNumberTable:
        line 352: 0
        line 357: 18
        line 358: 26
        line 360: 34
        line 361: 43

  public static java.lang.String getStats();
    descriptor: ()Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=1, args_size=0
         0: getstatic     #92                 // Field PENDING_BUFFS:Ljava/util/Map;
         3: invokeinterface #226,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         8: invokeinterface #307,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        13: invokedynamic #311,  0            // InvokeDynamic #4:applyAsInt:()Ljava/util/function/ToIntFunction;
        18: invokeinterface #315,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        23: invokeinterface #321,  1          // InterfaceMethod java/util/stream/IntStream.sum:()I
        28: istore_0
        29: ldc_w         #326                // String CancelReturn Stats: %d targets, %d buffs pendentes, %d tarefas ativas
        32: iconst_3
        33: anewarray     #2                  // class java/lang/Object
        36: dup
        37: iconst_0
        38: getstatic     #92                 // Field PENDING_BUFFS:Ljava/util/Map;
        41: invokeinterface #195,  1          // InterfaceMethod java/util/Map.size:()I
        46: invokestatic  #96                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        49: aastore
        50: dup
        51: iconst_1
        52: iload_0
        53: invokestatic  #96                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        56: aastore
        57: dup
        58: iconst_2
        59: getstatic     #183                // Field PENDING_TASKS:Ljava/util/Map;
        62: invokeinterface #195,  1          // InterfaceMethod java/util/Map.size:()I
        67: invokestatic  #96                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        70: aastore
        71: invokestatic  #328                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        74: areturn
      LineNumberTable:
        line 369: 0
        line 370: 18
        line 371: 23
        line 373: 29
        line 374: 41
        line 373: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      46     0 totalPendingBuffs   I

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #206                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #15                 // class ext/mods/gameserver/cancelmanager/CancelReturnManager
         6: invokevirtual #355                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #358                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #189                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: new           #352                // class java/util/concurrent/ConcurrentHashMap
        18: dup
        19: invokespecial #354                // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        22: putstatic     #92                 // Field PENDING_BUFFS:Ljava/util/Map;
        25: new           #352                // class java/util/concurrent/ConcurrentHashMap
        28: dup
        29: invokespecial #354                // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        32: putstatic     #183                // Field PENDING_TASKS:Ljava/util/Map;
        35: return
      LineNumberTable:
        line 42: 0
        line 102: 15
        line 104: 25
}
SourceFile: "CancelReturnManager.java"
NestMembers:
  ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode
  ext/mods/gameserver/cancelmanager/CancelReturnManager$SavedBuff
BootstrapMethods:
  0: #460 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #434 (Ljava/lang/Object;)Ljava/lang/Object;
      #435 REF_invokeStatic ext/mods/gameserver/cancelmanager/CancelReturnManager.lambda$saveAndSchedule$0:(Ljava/lang/Integer;)Ljava/util/Map;
      #438 (Ljava/lang/Integer;)Ljava/util/Map;
  1: #460 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #439 ()V
      #440 REF_invokeStatic ext/mods/gameserver/cancelmanager/CancelReturnManager.lambda$saveAndSchedule$1:(JLext/mods/gameserver/model/actor/Creature;)V
      #439 ()V
  2: #460 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #443 (Ljava/lang/Object;Ljava/lang/Object;)V
      #445 REF_invokeStatic ext/mods/gameserver/cancelmanager/CancelReturnManager.lambda$saveAndSchedule$2:(ILjava/lang/Void;Ljava/lang/Throwable;)V
      #448 (Ljava/lang/Void;Ljava/lang/Throwable;)V
  3: #460 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #450 (Ljava/lang/Object;)V
      #451 REF_invokeStatic ext/mods/gameserver/cancelmanager/CancelReturnManager.lambda$cleanup$0:(Ljava/util/concurrent/CompletableFuture;)V
      #454 (Ljava/util/concurrent/CompletableFuture;)V
  4: #460 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #455 (Ljava/lang/Object;)I
      #457 REF_invokeInterface java/util/Map.size:()I
      #458 (Ljava/util/Map;)I
InnerClasses:
  public static final #468= #70 of #15;   // CancelMode=class ext/mods/gameserver/cancelmanager/CancelReturnManager$CancelMode of class ext/mods/gameserver/cancelmanager/CancelReturnManager
  public static final #474= #470 of #472; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
