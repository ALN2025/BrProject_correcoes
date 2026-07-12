// Bytecode for: ext.mods.battlerboss.register.BattleBossOpenRegister
// File: ext\mods\battlerboss\register\BattleBossOpenRegister.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/register/BattleBossOpenRegister.class
  Last modified 9 de jul de 2026; size 11970 bytes
  MD5 checksum 4fa113a995aa7297fd22cbddb6bd96fc
  Compiled from "BattleBossOpenRegister.java"
public class ext.mods.battlerboss.register.BattleBossOpenRegister
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/battlerboss/register/BattleBossOpenRegister
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 21, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/battlerboss/register/BattleBossOpenRegister.eventRegistrations:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/battlerboss/register/BattleBossOpenRegister
   #12 = NameAndType        #14:#15       // eventRegistrations:Ljava/util/Map;
   #13 = Utf8               ext/mods/battlerboss/register/BattleBossOpenRegister
   #14 = Utf8               eventRegistrations
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/battlerboss/register/BattleBossOpenRegister._activeRumbles:Ljava/util/Map;
   #17 = NameAndType        #18:#15       // _activeRumbles:Ljava/util/Map;
   #18 = Utf8               _activeRumbles
   #19 = InterfaceMethodref #20.#21       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #20 = Class              #22           // java/util/Map
   #21 = NameAndType        #23:#24       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #22 = Utf8               java/util/Map
   #23 = Utf8               get
   #24 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #25 = Class              #26           // ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration
   #26 = Utf8               ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration
   #27 = Fieldref           #25.#28       // ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registrationOpen:Z
   #28 = NameAndType        #29:#30       // registrationOpen:Z
   #29 = Utf8               registrationOpen
   #30 = Utf8               Z
   #31 = InterfaceMethodref #20.#32       // java/util/Map.values:()Ljava/util/Collection;
   #32 = NameAndType        #33:#34       // values:()Ljava/util/Collection;
   #33 = Utf8               values
   #34 = Utf8               ()Ljava/util/Collection;
   #35 = InterfaceMethodref #36.#37       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #36 = Class              #38           // java/util/Collection
   #37 = NameAndType        #39:#40       // iterator:()Ljava/util/Iterator;
   #38 = Utf8               java/util/Collection
   #39 = Utf8               iterator
   #40 = Utf8               ()Ljava/util/Iterator;
   #41 = InterfaceMethodref #42.#43       // java/util/Iterator.hasNext:()Z
   #42 = Class              #44           // java/util/Iterator
   #43 = NameAndType        #45:#46       // hasNext:()Z
   #44 = Utf8               java/util/Iterator
   #45 = Utf8               hasNext
   #46 = Utf8               ()Z
   #47 = InterfaceMethodref #42.#48       // java/util/Iterator.next:()Ljava/lang/Object;
   #48 = NameAndType        #49:#50       // next:()Ljava/lang/Object;
   #49 = Utf8               next
   #50 = Utf8               ()Ljava/lang/Object;
   #51 = Methodref          #25.#3        // ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration."<init>":()V
   #52 = InterfaceMethodref #20.#53       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #53 = NameAndType        #54:#55       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #54 = Utf8               put
   #55 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #56 = InvokeDynamic      #0:#57        // #0:run:(Lext/mods/battlerboss/register/BattleBossOpenRegister;Lext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
   #57 = NameAndType        #58:#59       // run:(Lext/mods/battlerboss/register/BattleBossOpenRegister;Lext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
   #58 = Utf8               run
   #59 = Utf8               (Lext/mods/battlerboss/register/BattleBossOpenRegister;Lext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
   #60 = Long               1000l
   #62 = Methodref          #63.#64       // ext/mods/battlerboss/holder/EventHolder.getRegistration:()Lext/mods/battlerboss/holder/RegistrationHolder;
   #63 = Class              #65           // ext/mods/battlerboss/holder/EventHolder
   #64 = NameAndType        #66:#67       // getRegistration:()Lext/mods/battlerboss/holder/RegistrationHolder;
   #65 = Utf8               ext/mods/battlerboss/holder/EventHolder
   #66 = Utf8               getRegistration
   #67 = Utf8               ()Lext/mods/battlerboss/holder/RegistrationHolder;
   #68 = Methodref          #69.#70       // ext/mods/battlerboss/holder/RegistrationHolder.getWaitingTimeMatches:()I
   #69 = Class              #71           // ext/mods/battlerboss/holder/RegistrationHolder
   #70 = NameAndType        #72:#73       // getWaitingTimeMatches:()I
   #71 = Utf8               ext/mods/battlerboss/holder/RegistrationHolder
   #72 = Utf8               getWaitingTimeMatches
   #73 = Utf8               ()I
   #74 = Methodref          #75.#76       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #75 = Class              #77           // ext/mods/commons/pool/ThreadPool
   #76 = NameAndType        #78:#79       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #77 = Utf8               ext/mods/commons/pool/ThreadPool
   #78 = Utf8               scheduleAtFixedRate
   #79 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #80 = Fieldref           #25.#81       // ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.matchChecker:Ljava/util/concurrent/ScheduledFuture;
   #81 = NameAndType        #82:#83       // matchChecker:Ljava/util/concurrent/ScheduledFuture;
   #82 = Utf8               matchChecker
   #83 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #84 = Methodref          #63.#85       // ext/mods/battlerboss/holder/EventHolder.getInfo:()Lext/mods/battlerboss/holder/InfoHolder;
   #85 = NameAndType        #86:#87       // getInfo:()Lext/mods/battlerboss/holder/InfoHolder;
   #86 = Utf8               getInfo
   #87 = Utf8               ()Lext/mods/battlerboss/holder/InfoHolder;
   #88 = Methodref          #89.#90       // ext/mods/battlerboss/holder/InfoHolder.getName:()Ljava/lang/String;
   #89 = Class              #91           // ext/mods/battlerboss/holder/InfoHolder
   #90 = NameAndType        #92:#93       // getName:()Ljava/lang/String;
   #91 = Utf8               ext/mods/battlerboss/holder/InfoHolder
   #92 = Utf8               getName
   #93 = Utf8               ()Ljava/lang/String;
   #94 = InvokeDynamic      #1:#95        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #95 = NameAndType        #96:#97       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #96 = Utf8               makeConcatWithConstants
   #97 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #98 = Methodref          #99.#100      // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
   #99 = Class              #101          // ext/mods/gameserver/model/World
  #100 = NameAndType        #102:#103     // announceToOnlinePlayers:(Ljava/lang/String;Z)V
  #101 = Utf8               ext/mods/gameserver/model/World
  #102 = Utf8               announceToOnlinePlayers
  #103 = Utf8               (Ljava/lang/String;Z)V
  #104 = Methodref          #11.#105      // ext/mods/battlerboss/register/BattleBossOpenRegister.sendQuestionMarkToAllOnline:()V
  #105 = NameAndType        #106:#6       // sendQuestionMarkToAllOnline:()V
  #106 = Utf8               sendQuestionMarkToAllOnline
  #107 = Fieldref           #11.#108      // ext/mods/battlerboss/register/BattleBossOpenRegister.questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
  #108 = NameAndType        #109:#83      // questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
  #109 = Utf8               questionMarkRefresher
  #110 = InterfaceMethodref #111.#112     // java/util/concurrent/ScheduledFuture.isCancelled:()Z
  #111 = Class              #113          // java/util/concurrent/ScheduledFuture
  #112 = NameAndType        #114:#46      // isCancelled:()Z
  #113 = Utf8               java/util/concurrent/ScheduledFuture
  #114 = Utf8               isCancelled
  #115 = InvokeDynamic      #2:#116       // #2:run:()Ljava/lang/Runnable;
  #116 = NameAndType        #58:#117      // run:()Ljava/lang/Runnable;
  #117 = Utf8               ()Ljava/lang/Runnable;
  #118 = Long               60000l
  #120 = Methodref          #89.#121      // ext/mods/battlerboss/holder/InfoHolder.getAnnounce:()Ljava/util/List;
  #121 = NameAndType        #122:#123     // getAnnounce:()Ljava/util/List;
  #122 = Utf8               getAnnounce
  #123 = Utf8               ()Ljava/util/List;
  #124 = InterfaceMethodref #125.#37      // java/util/List.iterator:()Ljava/util/Iterator;
  #125 = Class              #126          // java/util/List
  #126 = Utf8               java/util/List
  #127 = Class              #128          // java/lang/String
  #128 = Utf8               java/lang/String
  #129 = Methodref          #127.#130     // java/lang/String.trim:()Ljava/lang/String;
  #130 = NameAndType        #131:#93      // trim:()Ljava/lang/String;
  #131 = Utf8               trim
  #132 = Methodref          #127.#133     // java/lang/String.isEmpty:()Z
  #133 = NameAndType        #134:#46      // isEmpty:()Z
  #134 = Utf8               isEmpty
  #135 = Methodref          #63.#136      // ext/mods/battlerboss/holder/EventHolder.getConfig:()Lext/mods/battlerboss/holder/BattleBossConfigHolder;
  #136 = NameAndType        #137:#138     // getConfig:()Lext/mods/battlerboss/holder/BattleBossConfigHolder;
  #137 = Utf8               getConfig
  #138 = Utf8               ()Lext/mods/battlerboss/holder/BattleBossConfigHolder;
  #139 = Methodref          #140.#141     // ext/mods/battlerboss/holder/BattleBossConfigHolder.getDuration:()I
  #140 = Class              #142          // ext/mods/battlerboss/holder/BattleBossConfigHolder
  #141 = NameAndType        #143:#73      // getDuration:()I
  #142 = Utf8               ext/mods/battlerboss/holder/BattleBossConfigHolder
  #143 = Utf8               getDuration
  #144 = InvokeDynamic      #3:#57        // #3:run:(Lext/mods/battlerboss/register/BattleBossOpenRegister;Lext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
  #145 = Methodref          #75.#146      // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #146 = NameAndType        #147:#148     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #147 = Utf8               schedule
  #148 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #149 = Methodref          #11.#150      // ext/mods/battlerboss/register/BattleBossOpenRegister.scheduleReminders:(Lext/mods/battlerboss/holder/EventHolder;J)V
  #150 = NameAndType        #151:#152     // scheduleReminders:(Lext/mods/battlerboss/holder/EventHolder;J)V
  #151 = Utf8               scheduleReminders
  #152 = Utf8               (Lext/mods/battlerboss/holder/EventHolder;J)V
  #153 = InterfaceMethodref #111.#154     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #154 = NameAndType        #155:#156     // cancel:(Z)Z
  #155 = Utf8               cancel
  #156 = Utf8               (Z)Z
  #157 = Methodref          #11.#158      // ext/mods/battlerboss/register/BattleBossOpenRegister.hasOpenRegistration:()Z
  #158 = NameAndType        #159:#46      // hasOpenRegistration:()Z
  #159 = Utf8               hasOpenRegistration
  #160 = Methodref          #11.#161      // ext/mods/battlerboss/register/BattleBossOpenRegister.getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #161 = NameAndType        #162:#163     // getInstance:()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #162 = Utf8               getInstance
  #163 = Utf8               ()Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #164 = Methodref          #99.#165      // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #165 = NameAndType        #162:#166     // getInstance:()Lext/mods/gameserver/model/World;
  #166 = Utf8               ()Lext/mods/gameserver/model/World;
  #167 = Methodref          #99.#168      // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #168 = NameAndType        #169:#34      // getPlayers:()Ljava/util/Collection;
  #169 = Utf8               getPlayers
  #170 = Class              #171          // ext/mods/gameserver/model/actor/Player
  #171 = Utf8               ext/mods/gameserver/model/actor/Player
  #172 = Methodref          #170.#173     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #173 = NameAndType        #174:#46      // isOnline:()Z
  #174 = Utf8               isOnline
  #175 = Class              #176          // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #176 = Utf8               ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #177 = Methodref          #175.#178     // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
  #178 = NameAndType        #5:#179       // "<init>":(I)V
  #179 = Utf8               (I)V
  #180 = Methodref          #170.#181     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #181 = NameAndType        #182:#183     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #182 = Utf8               sendPacket
  #183 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #184 = Methodref          #63.#90       // ext/mods/battlerboss/holder/EventHolder.getName:()Ljava/lang/String;
  #185 = InvokeDynamic      #4:#95        // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #186 = Methodref          #170.#187     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #187 = NameAndType        #188:#189     // sendMessage:(Ljava/lang/String;)V
  #188 = Utf8               sendMessage
  #189 = Utf8               (Ljava/lang/String;)V
  #190 = Methodref          #170.#191     // ext/mods/gameserver/model/actor/Player.isInBattleBossRumble:()Z
  #191 = NameAndType        #192:#46      // isInBattleBossRumble:()Z
  #192 = Utf8               isInBattleBossRumble
  #193 = String             #194          // Você já está em um match deste ou de outro evento.
  #194 = Utf8               Você já está em um match deste ou de outro evento.
  #195 = Methodref          #170.#196     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #196 = NameAndType        #197:#198     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #197 = Utf8               getClassId
  #198 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #199 = Methodref          #200.#201     // ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
  #200 = Class              #202          // ext/mods/gameserver/enums/actors/ClassId
  #201 = NameAndType        #203:#73      // getLevel:()I
  #202 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #203 = Utf8               getLevel
  #204 = String             #205          // Somente personagens com terceira profissão podem se registrar neste evento.
  #205 = Utf8               Somente personagens com terceira profissão podem se registrar neste evento.
  #206 = Methodref          #207.#208     // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #207 = Class              #209          // ext/mods/gameserver/model/olympiad/OlympiadManager
  #208 = NameAndType        #162:#210     // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #209 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
  #210 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #211 = Methodref          #207.#212     // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #212 = NameAndType        #213:#214     // isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #213 = Utf8               isRegistered
  #214 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #215 = String             #216          // Você não pode se registrar enquanto estiver na Olympiad.
  #216 = Utf8               Você não pode se registrar enquanto estiver na Olympiad.
  #217 = Methodref          #170.#218     // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #218 = NameAndType        #219:#46      // isCursedWeaponEquipped:()Z
  #219 = Utf8               isCursedWeaponEquipped
  #220 = String             #221          // Você não pode se registrar com uma Cursed Weapon equipada.
  #221 = Utf8               Você não pode se registrar com uma Cursed Weapon equipada.
  #222 = Methodref          #170.#223     // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #223 = NameAndType        #224:#73      // getKarma:()I
  #224 = Utf8               getKarma
  #225 = String             #226          // Jogadores com Karma positivo não podem se registrar em eventos.
  #226 = Utf8               Jogadores com Karma positivo não podem se registrar em eventos.
  #227 = Fieldref           #25.#228      // ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registeredPlayers:Ljava/util/List;
  #228 = NameAndType        #229:#230     // registeredPlayers:Ljava/util/List;
  #229 = Utf8               registeredPlayers
  #230 = Utf8               Ljava/util/List;
  #231 = InterfaceMethodref #125.#232     // java/util/List.size:()I
  #232 = NameAndType        #233:#73      // size:()I
  #233 = Utf8               size
  #234 = Methodref          #69.#235      // ext/mods/battlerboss/holder/RegistrationHolder.getMaxPlayers:()I
  #235 = NameAndType        #236:#73      // getMaxPlayers:()I
  #236 = Utf8               getMaxPlayers
  #237 = String             #238          // Registro cheio. Você não pode se registrar.
  #238 = Utf8               Registro cheio. Você não pode se registrar.
  #239 = InterfaceMethodref #125.#240     // java/util/List.contains:(Ljava/lang/Object;)Z
  #240 = NameAndType        #241:#242     // contains:(Ljava/lang/Object;)Z
  #241 = Utf8               contains
  #242 = Utf8               (Ljava/lang/Object;)Z
  #243 = InterfaceMethodref #125.#244     // java/util/List.add:(Ljava/lang/Object;)Z
  #244 = NameAndType        #245:#242     // add:(Ljava/lang/Object;)Z
  #245 = Utf8               add
  #246 = InvokeDynamic      #5:#95        // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #247 = String             #248          // Você já está registrado neste evento.
  #248 = Utf8               Você já está registrado neste evento.
  #249 = InterfaceMethodref #125.#250     // java/util/List.remove:(Ljava/lang/Object;)Z
  #250 = NameAndType        #251:#242     // remove:(Ljava/lang/Object;)Z
  #251 = Utf8               remove
  #252 = InvokeDynamic      #6:#95        // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #253 = Methodref          #254.#255     // java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
  #254 = Class              #256          // java/util/Collections
  #255 = NameAndType        #257:#258     // unmodifiableList:(Ljava/util/List;)Ljava/util/List;
  #256 = Utf8               java/util/Collections
  #257 = Utf8               unmodifiableList
  #258 = Utf8               (Ljava/util/List;)Ljava/util/List;
  #259 = Methodref          #254.#260     // java/util/Collections.emptyList:()Ljava/util/List;
  #260 = NameAndType        #261:#123     // emptyList:()Ljava/util/List;
  #261 = Utf8               emptyList
  #262 = Methodref          #69.#263      // ext/mods/battlerboss/holder/RegistrationHolder.getGroupSize:()I
  #263 = NameAndType        #264:#73      // getGroupSize:()I
  #264 = Utf8               getGroupSize
  #265 = Methodref          #266.#267     // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #266 = Class              #268          // ext/mods/gameserver/idfactory/IdFactory
  #267 = NameAndType        #162:#269     // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #268 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #269 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #270 = Methodref          #266.#271     // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
  #271 = NameAndType        #272:#73      // getNextId:()I
  #272 = Utf8               getNextId
  #273 = Class              #274          // java/util/ArrayList
  #274 = Utf8               java/util/ArrayList
  #275 = Methodref          #273.#3       // java/util/ArrayList."<init>":()V
  #276 = InterfaceMethodref #125.#277     // java/util/List.remove:(I)Ljava/lang/Object;
  #277 = NameAndType        #251:#278     // remove:(I)Ljava/lang/Object;
  #278 = Utf8               (I)Ljava/lang/Object;
  #279 = Methodref          #170.#280     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #280 = NameAndType        #281:#73      // getObjectId:()I
  #281 = Utf8               getObjectId
  #282 = Methodref          #99.#283      // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #283 = NameAndType        #284:#285     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #284 = Utf8               getPlayer
  #285 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #286 = Class              #287          // ext/mods/battlerboss/matches/BattleBossRumble
  #287 = Utf8               ext/mods/battlerboss/matches/BattleBossRumble
  #288 = Methodref          #286.#289     // ext/mods/battlerboss/matches/BattleBossRumble."<init>":(ILext/mods/battlerboss/holder/EventHolder;Ljava/util/List;)V
  #289 = NameAndType        #5:#290       // "<init>":(ILext/mods/battlerboss/holder/EventHolder;Ljava/util/List;)V
  #290 = Utf8               (ILext/mods/battlerboss/holder/EventHolder;Ljava/util/List;)V
  #291 = Methodref          #292.#293     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #292 = Class              #294          // java/lang/Integer
  #293 = NameAndType        #295:#296     // valueOf:(I)Ljava/lang/Integer;
  #294 = Utf8               java/lang/Integer
  #295 = Utf8               valueOf
  #296 = Utf8               (I)Ljava/lang/Integer;
  #297 = Methodref          #75.#298      // ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
  #298 = NameAndType        #299:#300     // execute:(Ljava/lang/Runnable;)V
  #299 = Utf8               execute
  #300 = Utf8               (Ljava/lang/Runnable;)V
  #301 = InterfaceMethodref #125.#302     // java/util/List.addAll:(Ljava/util/Collection;)Z
  #302 = NameAndType        #303:#304     // addAll:(Ljava/util/Collection;)Z
  #303 = Utf8               addAll
  #304 = Utf8               (Ljava/util/Collection;)Z
  #305 = Methodref          #11.#306      // ext/mods/battlerboss/register/BattleBossOpenRegister.getRumbleForPlayer:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/battlerboss/matches/BattleBossRumble;
  #306 = NameAndType        #307:#308     // getRumbleForPlayer:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/battlerboss/matches/BattleBossRumble;
  #307 = Utf8               getRumbleForPlayer
  #308 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/battlerboss/matches/BattleBossRumble;
  #309 = Methodref          #286.#310     // ext/mods/battlerboss/matches/BattleBossRumble.onPlayerDeath:(Lext/mods/gameserver/model/actor/Player;)V
  #310 = NameAndType        #311:#312     // onPlayerDeath:(Lext/mods/gameserver/model/actor/Player;)V
  #311 = Utf8               onPlayerDeath
  #312 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #313 = Methodref          #286.#314     // ext/mods/battlerboss/matches/BattleBossRumble.onPlayerDeathMonster:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
  #314 = NameAndType        #315:#316     // onPlayerDeathMonster:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
  #315 = Utf8               onPlayerDeathMonster
  #316 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
  #317 = Methodref          #170.#318     // ext/mods/gameserver/model/actor/Player.getBattleBossRumbleId:()I
  #318 = NameAndType        #319:#73      // getBattleBossRumbleId:()I
  #319 = Utf8               getBattleBossRumbleId
  #320 = InterfaceMethodref #20.#321      // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #321 = NameAndType        #251:#24      // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #322 = Methodref          #323.#324     // java/lang/System.currentTimeMillis:()J
  #323 = Class              #325          // java/lang/System
  #324 = NameAndType        #326:#327     // currentTimeMillis:()J
  #325 = Utf8               java/lang/System
  #326 = Utf8               currentTimeMillis
  #327 = Utf8               ()J
  #328 = Long               300000l
  #330 = InvokeDynamic      #7:#331       // #7:run:(JLext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
  #331 = NameAndType        #58:#332      // run:(JLext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
  #332 = Utf8               (JLext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
  #333 = Long               30000l
  #335 = InvokeDynamic      #8:#336       // #8:run:(Lext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
  #336 = NameAndType        #58:#337      // run:(Lext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
  #337 = Utf8               (Lext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
  #338 = InvokeDynamic      #9:#336       // #9:run:(Lext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
  #339 = Fieldref           #340.#341     // ext/mods/battlerboss/register/BattleBossOpenRegister$SingletonHolder.INSTANCE:Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #340 = Class              #342          // ext/mods/battlerboss/register/BattleBossOpenRegister$SingletonHolder
  #341 = NameAndType        #343:#344     // INSTANCE:Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #342 = Utf8               ext/mods/battlerboss/register/BattleBossOpenRegister$SingletonHolder
  #343 = Utf8               INSTANCE
  #344 = Utf8               Lext/mods/battlerboss/register/BattleBossOpenRegister;
  #345 = InvokeDynamic      #10:#95       // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #346 = InvokeDynamic      #11:#95       // #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #347 = Long               60l
  #349 = InvokeDynamic      #12:#350      // #12:makeConcatWithConstants:(Ljava/lang/String;J)Ljava/lang/String;
  #350 = NameAndType        #96:#351      // makeConcatWithConstants:(Ljava/lang/String;J)Ljava/lang/String;
  #351 = Utf8               (Ljava/lang/String;J)Ljava/lang/String;
  #352 = Methodref          #11.#353      // ext/mods/battlerboss/register/BattleBossOpenRegister.close:(Lext/mods/battlerboss/holder/EventHolder;)V
  #353 = NameAndType        #354:#355     // close:(Lext/mods/battlerboss/holder/EventHolder;)V
  #354 = Utf8               close
  #355 = Utf8               (Lext/mods/battlerboss/holder/EventHolder;)V
  #356 = Methodref          #11.#357      // ext/mods/battlerboss/register/BattleBossOpenRegister.checkMatches:(Lext/mods/battlerboss/holder/EventHolder;)V
  #357 = NameAndType        #358:#355     // checkMatches:(Lext/mods/battlerboss/holder/EventHolder;)V
  #358 = Utf8               checkMatches
  #359 = Utf8               TUTORIAL_QUESTION_MARK_ID
  #360 = Utf8               I
  #361 = Utf8               ConstantValue
  #362 = Integer            2006
  #363 = Utf8               Signature
  #364 = Utf8               Ljava/util/Map<Lext/mods/battlerboss/holder/EventHolder;Lext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration;>;
  #365 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/battlerboss/matches/BattleBossRumble;>;
  #366 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #367 = Utf8               Code
  #368 = Utf8               LineNumberTable
  #369 = Utf8               LocalVariableTable
  #370 = Utf8               this
  #371 = Utf8               isRegistrationOpen
  #372 = Utf8               (Lext/mods/battlerboss/holder/EventHolder;)Z
  #373 = Utf8               event
  #374 = Utf8               Lext/mods/battlerboss/holder/EventHolder;
  #375 = Utf8               reg
  #376 = Utf8               Lext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration;
  #377 = Utf8               StackMapTable
  #378 = Utf8               open
  #379 = Utf8               line
  #380 = Utf8               Ljava/lang/String;
  #381 = Utf8               durationMs
  #382 = Utf8               J
  #383 = Utf8               online
  #384 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #385 = Utf8               register
  #386 = Utf8               (Lext/mods/battlerboss/holder/EventHolder;Lext/mods/gameserver/model/actor/Player;)Z
  #387 = Utf8               player
  #388 = Utf8               unregister
  #389 = Utf8               (Lext/mods/battlerboss/holder/EventHolder;Lext/mods/gameserver/model/actor/Player;)V
  #390 = Utf8               getRegisteredPlayers
  #391 = Utf8               (Lext/mods/battlerboss/holder/EventHolder;)Ljava/util/List;
  #392 = Utf8               (Lext/mods/battlerboss/holder/EventHolder;)Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #393 = Utf8               p
  #394 = Utf8               i
  #395 = Utf8               match
  #396 = Utf8               Lext/mods/battlerboss/matches/BattleBossRumble;
  #397 = Utf8               rumbleId
  #398 = Utf8               playersInMatch
  #399 = Utf8               groupSize
  #400 = Utf8               requiredForMatch
  #401 = Utf8               LocalVariableTypeTable
  #402 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #403 = Utf8               rumble
  #404 = Utf8               monster
  #405 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #406 = Utf8               removeRumble
  #407 = Utf8               delay
  #408 = Utf8               t
  #409 = Utf8               now
  #410 = Utf8               endTime
  #411 = Utf8               lambda$scheduleReminders$2
  #412 = Utf8               lambda$scheduleReminders$1
  #413 = Utf8               lambda$scheduleReminders$0
  #414 = Utf8               (JLext/mods/battlerboss/holder/EventHolder;)V
  #415 = Utf8               remaining
  #416 = Utf8               minutes
  #417 = Utf8               lambda$open$1
  #418 = Utf8               lambda$open$0
  #419 = Utf8               SourceFile
  #420 = Utf8               BattleBossOpenRegister.java
  #421 = Utf8               NestMembers
  #422 = Utf8               BootstrapMethods
  #423 = MethodType         #6            //  ()V
  #424 = MethodHandle       5:#425        // REF_invokeVirtual ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$open$0:(Lext/mods/battlerboss/holder/EventHolder;)V
  #425 = Methodref          #11.#426      // ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$open$0:(Lext/mods/battlerboss/holder/EventHolder;)V
  #426 = NameAndType        #418:#355     // lambda$open$0:(Lext/mods/battlerboss/holder/EventHolder;)V
  #427 = String             #428          // [BattleBoss] Evento Aberto: \u0001 - use .battleboss para participar!
  #428 = Utf8               [BattleBoss] Evento Aberto: \u0001 - use .battleboss para participar!
  #429 = MethodHandle       6:#104        // REF_invokeStatic ext/mods/battlerboss/register/BattleBossOpenRegister.sendQuestionMarkToAllOnline:()V
  #430 = MethodHandle       5:#431        // REF_invokeVirtual ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$open$1:(Lext/mods/battlerboss/holder/EventHolder;)V
  #431 = Methodref          #11.#432      // ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$open$1:(Lext/mods/battlerboss/holder/EventHolder;)V
  #432 = NameAndType        #417:#355     // lambda$open$1:(Lext/mods/battlerboss/holder/EventHolder;)V
  #433 = String             #434          // Registro fechado para o evento \u0001
  #434 = Utf8               Registro fechado para o evento \u0001
  #435 = String             #436          // Você foi registrado no evento \u0001. Aguarde a formação das equipes.
  #436 = Utf8               Você foi registrado no evento \u0001. Aguarde a formação das equipes.
  #437 = String             #438          // Você foi removido do registro do evento \u0001
  #438 = Utf8               Você foi removido do registro do evento \u0001
  #439 = MethodHandle       6:#440        // REF_invokeStatic ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$scheduleReminders$0:(JLext/mods/battlerboss/holder/EventHolder;)V
  #440 = Methodref          #11.#441      // ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$scheduleReminders$0:(JLext/mods/battlerboss/holder/EventHolder;)V
  #441 = NameAndType        #413:#414     // lambda$scheduleReminders$0:(JLext/mods/battlerboss/holder/EventHolder;)V
  #442 = MethodHandle       6:#443        // REF_invokeStatic ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$scheduleReminders$1:(Lext/mods/battlerboss/holder/EventHolder;)V
  #443 = Methodref          #11.#444      // ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$scheduleReminders$1:(Lext/mods/battlerboss/holder/EventHolder;)V
  #444 = NameAndType        #412:#355     // lambda$scheduleReminders$1:(Lext/mods/battlerboss/holder/EventHolder;)V
  #445 = MethodHandle       6:#446        // REF_invokeStatic ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$scheduleReminders$2:(Lext/mods/battlerboss/holder/EventHolder;)V
  #446 = Methodref          #11.#447      // ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$scheduleReminders$2:(Lext/mods/battlerboss/holder/EventHolder;)V
  #447 = NameAndType        #411:#355     // lambda$scheduleReminders$2:(Lext/mods/battlerboss/holder/EventHolder;)V
  #448 = String             #449          // [BattleBoss] O evento \u0001 foi encerrado!
  #449 = Utf8               [BattleBoss] O evento \u0001 foi encerrado!
  #450 = String             #451          // [BattleBoss] O evento \u0001 fechará em 30 segundos!
  #451 = Utf8               [BattleBoss] O evento \u0001 fechará em 30 segundos!
  #452 = String             #453          // [BattleBoss] O evento \u0001 fecha em \u0001 minutos. Registre-se!
  #453 = Utf8               [BattleBoss] O evento \u0001 fecha em \u0001 minutos. Registre-se!
  #454 = MethodHandle       6:#455        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #455 = Methodref          #456.#457     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #456 = Class              #458          // java/lang/invoke/LambdaMetafactory
  #457 = NameAndType        #459:#460     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #458 = Utf8               java/lang/invoke/LambdaMetafactory
  #459 = Utf8               metafactory
  #460 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #461 = MethodHandle       6:#462        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #462 = Methodref          #463.#464     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #463 = Class              #465          // java/lang/invoke/StringConcatFactory
  #464 = NameAndType        #96:#466      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #465 = Utf8               java/lang/invoke/StringConcatFactory
  #466 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #467 = Utf8               InnerClasses
  #468 = Utf8               EventRegistration
  #469 = Utf8               SingletonHolder
  #470 = Class              #471          // java/lang/invoke/MethodHandles$Lookup
  #471 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #472 = Class              #473          // java/lang/invoke/MethodHandles
  #473 = Utf8               java/lang/invoke/MethodHandles
  #474 = Utf8               Lookup
{
  public ext.mods.battlerboss.register.BattleBossOpenRegister();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field eventRegistrations:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        19: dup
        20: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        23: putfield      #16                 // Field _activeRumbles:Ljava/util/Map;
        26: return
      LineNumberTable:
        line 38: 0
        line 42: 4
        line 43: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/battlerboss/register/BattleBossOpenRegister;

  public boolean isRegistrationOpen(ext.mods.battlerboss.holder.EventHolder);
    descriptor: (Lext/mods/battlerboss/holder/EventHolder;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field eventRegistrations:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #19,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #25                 // class ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration
        13: astore_2
        14: aload_2
        15: ifnull        29
        18: aload_2
        19: getfield      #27                 // Field ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registrationOpen:Z
        22: ifeq          29
        25: iconst_1
        26: goto          30
        29: iconst_0
        30: ireturn
      LineNumberTable:
        line 55: 0
        line 56: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/battlerboss/register/BattleBossOpenRegister;
            0      31     1 event   Lext/mods/battlerboss/holder/EventHolder;
           14      17     2   reg   Lext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean hasOpenRegistration();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #10                 // Field eventRegistrations:Ljava/util/Map;
         4: invokeinterface #31,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #35,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        14: astore_1
        15: aload_1
        16: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          50
        24: aload_1
        25: invokeinterface #47,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        30: checkcast     #25                 // class ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration
        33: astore_2
        34: aload_2
        35: ifnull        47
        38: aload_2
        39: getfield      #27                 // Field ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registrationOpen:Z
        42: ifeq          47
        45: iconst_1
        46: ireturn
        47: goto          15
        50: iconst_0
        51: ireturn
      LineNumberTable:
        line 61: 0
        line 63: 34
        line 64: 45
        line 65: 47
        line 66: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34      13     2   reg   Lext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration;
            0      52     0  this   Lext/mods/battlerboss/register/BattleBossOpenRegister;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 31 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void open(ext.mods.battlerboss.holder.EventHolder);
    descriptor: (Lext/mods/battlerboss/holder/EventHolder;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=5, args_size=2
         0: new           #25                 // class ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration
         3: dup
         4: invokespecial #51                 // Method ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration."<init>":()V
         7: astore_2
         8: aload_2
         9: iconst_1
        10: putfield      #27                 // Field ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registrationOpen:Z
        13: aload_0
        14: getfield      #10                 // Field eventRegistrations:Ljava/util/Map;
        17: aload_1
        18: aload_2
        19: invokeinterface #52,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        24: pop
        25: aload_2
        26: aload_0
        27: aload_1
        28: invokedynamic #56,  0             // InvokeDynamic #0:run:(Lext/mods/battlerboss/register/BattleBossOpenRegister;Lext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
        33: ldc2_w        #60                 // long 1000l
        36: aload_1
        37: invokevirtual #62                 // Method ext/mods/battlerboss/holder/EventHolder.getRegistration:()Lext/mods/battlerboss/holder/RegistrationHolder;
        40: invokevirtual #68                 // Method ext/mods/battlerboss/holder/RegistrationHolder.getWaitingTimeMatches:()I
        43: i2l
        44: lmul
        45: ldc2_w        #60                 // long 1000l
        48: aload_1
        49: invokevirtual #62                 // Method ext/mods/battlerboss/holder/EventHolder.getRegistration:()Lext/mods/battlerboss/holder/RegistrationHolder;
        52: invokevirtual #68                 // Method ext/mods/battlerboss/holder/RegistrationHolder.getWaitingTimeMatches:()I
        55: i2l
        56: lmul
        57: invokestatic  #74                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        60: putfield      #80                 // Field ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.matchChecker:Ljava/util/concurrent/ScheduledFuture;
        63: aload_1
        64: invokevirtual #84                 // Method ext/mods/battlerboss/holder/EventHolder.getInfo:()Lext/mods/battlerboss/holder/InfoHolder;
        67: invokevirtual #88                 // Method ext/mods/battlerboss/holder/InfoHolder.getName:()Ljava/lang/String;
        70: invokedynamic #94,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        75: iconst_1
        76: invokestatic  #98                 // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
        79: invokestatic  #104                // Method sendQuestionMarkToAllOnline:()V
        82: getstatic     #107                // Field questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
        85: ifnull        99
        88: getstatic     #107                // Field questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
        91: invokeinterface #110,  1          // InterfaceMethod java/util/concurrent/ScheduledFuture.isCancelled:()Z
        96: ifeq          116
        99: invokedynamic #115,  0            // InvokeDynamic #2:run:()Ljava/lang/Runnable;
       104: ldc2_w        #118                // long 60000l
       107: ldc2_w        #118                // long 60000l
       110: invokestatic  #74                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       113: putstatic     #107                // Field questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
       116: aload_1
       117: invokevirtual #84                 // Method ext/mods/battlerboss/holder/EventHolder.getInfo:()Lext/mods/battlerboss/holder/InfoHolder;
       120: invokevirtual #120                // Method ext/mods/battlerboss/holder/InfoHolder.getAnnounce:()Ljava/util/List;
       123: invokeinterface #124,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       128: astore_3
       129: aload_3
       130: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       135: ifeq          174
       138: aload_3
       139: invokeinterface #47,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       144: checkcast     #127                // class java/lang/String
       147: astore        4
       149: aload         4
       151: ifnull        171
       154: aload         4
       156: invokevirtual #129                // Method java/lang/String.trim:()Ljava/lang/String;
       159: invokevirtual #132                // Method java/lang/String.isEmpty:()Z
       162: ifne          171
       165: aload         4
       167: iconst_1
       168: invokestatic  #98                 // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
       171: goto          129
       174: aload_1
       175: invokevirtual #135                // Method ext/mods/battlerboss/holder/EventHolder.getConfig:()Lext/mods/battlerboss/holder/BattleBossConfigHolder;
       178: invokevirtual #139                // Method ext/mods/battlerboss/holder/BattleBossConfigHolder.getDuration:()I
       181: ifeq          217
       184: ldc2_w        #118                // long 60000l
       187: aload_1
       188: invokevirtual #135                // Method ext/mods/battlerboss/holder/EventHolder.getConfig:()Lext/mods/battlerboss/holder/BattleBossConfigHolder;
       191: invokevirtual #139                // Method ext/mods/battlerboss/holder/BattleBossConfigHolder.getDuration:()I
       194: i2l
       195: lmul
       196: lconst_1
       197: ladd
       198: lstore_3
       199: aload_0
       200: aload_1
       201: invokedynamic #144,  0            // InvokeDynamic #3:run:(Lext/mods/battlerboss/register/BattleBossOpenRegister;Lext/mods/battlerboss/holder/EventHolder;)Ljava/lang/Runnable;
       206: lload_3
       207: invokestatic  #145                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       210: pop
       211: aload_0
       212: aload_1
       213: lload_3
       214: invokevirtual #149                // Method scheduleReminders:(Lext/mods/battlerboss/holder/EventHolder;J)V
       217: return
      LineNumberTable:
        line 71: 0
        line 72: 8
        line 73: 13
        line 75: 25
        line 77: 63
        line 78: 79
        line 79: 82
        line 80: 99
        line 81: 116
        line 83: 149
        line 84: 165
        line 85: 171
        line 86: 174
        line 88: 184
        line 89: 199
        line 91: 211
        line 93: 217
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          149      22     4  line   Ljava/lang/String;
          199      18     3 durationMs   J
            0     218     0  this   Lext/mods/battlerboss/register/BattleBossOpenRegister;
            0     218     1 event   Lext/mods/battlerboss/holder/EventHolder;
            8     210     2   reg   Lext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 99
          locals = [ class ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration ]
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 41 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 42 /* same */

  public void close(ext.mods.battlerboss.holder.EventHolder);
    descriptor: (Lext/mods/battlerboss/holder/EventHolder;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field eventRegistrations:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #19,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #25                 // class ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration
        13: astore_2
        14: aload_2
        15: ifnull        41
        18: aload_2
        19: iconst_0
        20: putfield      #27                 // Field ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registrationOpen:Z
        23: aload_2
        24: getfield      #80                 // Field ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.matchChecker:Ljava/util/concurrent/ScheduledFuture;
        27: ifnull        41
        30: aload_2
        31: getfield      #80                 // Field ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.matchChecker:Ljava/util/concurrent/ScheduledFuture;
        34: iconst_0
        35: invokeinterface #153,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        40: pop
        41: aload_0
        42: invokevirtual #157                // Method hasOpenRegistration:()Z
        45: ifne          68
        48: getstatic     #107                // Field questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
        51: ifnull        68
        54: getstatic     #107                // Field questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
        57: iconst_0
        58: invokeinterface #153,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        63: pop
        64: aconst_null
        65: putstatic     #107                // Field questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
        68: return
      LineNumberTable:
        line 97: 0
        line 98: 14
        line 100: 18
        line 101: 23
        line 103: 30
        line 106: 41
        line 108: 54
        line 109: 64
        line 111: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      69     0  this   Lext/mods/battlerboss/register/BattleBossOpenRegister;
            0      69     1 event   Lext/mods/battlerboss/holder/EventHolder;
           14      55     2   reg   Lext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration ]
        frame_type = 26 /* same */

  public boolean register(ext.mods.battlerboss.holder.EventHolder, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/battlerboss/holder/EventHolder;Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: getfield      #10                 // Field eventRegistrations:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #19,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #25                 // class ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration
        13: astore_3
        14: aload_3
        15: ifnull        25
        18: aload_3
        19: getfield      #27                 // Field ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registrationOpen:Z
        22: ifne          40
        25: aload_2
        26: aload_1
        27: invokevirtual #184                // Method ext/mods/battlerboss/holder/EventHolder.getName:()Ljava/lang/String;
        30: invokedynamic #185,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        35: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        38: iconst_0
        39: ireturn
        40: aload_2
        41: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Player.isInBattleBossRumble:()Z
        44: ifeq          55
        47: aload_2
        48: ldc           #193                // String Você já está em um match deste ou de outro evento.
        50: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        53: iconst_0
        54: ireturn
        55: aload_2
        56: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
        59: invokevirtual #199                // Method ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
        62: iconst_3
        63: if_icmpeq     74
        66: aload_2
        67: ldc           #204                // String Somente personagens com terceira profissão podem se registrar neste evento.
        69: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        72: iconst_0
        73: ireturn
        74: invokestatic  #206                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
        77: aload_2
        78: invokevirtual #211                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
        81: ifeq          92
        84: aload_2
        85: ldc           #215                // String Você não pode se registrar enquanto estiver na Olympiad.
        87: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        90: iconst_0
        91: ireturn
        92: aload_2
        93: invokevirtual #217                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
        96: ifeq          107
        99: aload_2
       100: ldc           #220                // String Você não pode se registrar com uma Cursed Weapon equipada.
       102: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       105: iconst_0
       106: ireturn
       107: aload_2
       108: invokevirtual #222                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       111: ifle          122
       114: aload_2
       115: ldc           #225                // String Jogadores com Karma positivo não podem se registrar em eventos.
       117: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       120: iconst_0
       121: ireturn
       122: aload_3
       123: getfield      #227                // Field ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registeredPlayers:Ljava/util/List;
       126: invokeinterface #231,  1          // InterfaceMethod java/util/List.size:()I
       131: aload_1
       132: invokevirtual #62                 // Method ext/mods/battlerboss/holder/EventHolder.getRegistration:()Lext/mods/battlerboss/holder/RegistrationHolder;
       135: invokevirtual #234                // Method ext/mods/battlerboss/holder/RegistrationHolder.getMaxPlayers:()I
       138: if_icmplt     149
       141: aload_2
       142: ldc           #237                // String Registro cheio. Você não pode se registrar.
       144: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       147: iconst_0
       148: ireturn
       149: aload_3
       150: getfield      #227                // Field ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registeredPlayers:Ljava/util/List;
       153: aload_2
       154: invokeinterface #239,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       159: ifne          188
       162: aload_3
       163: getfield      #227                // Field ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registeredPlayers:Ljava/util/List;
       166: aload_2
       167: invokeinterface #243,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       172: pop
       173: aload_2
       174: aload_1
       175: invokevirtual #184                // Method ext/mods/battlerboss/holder/EventHolder.getName:()Ljava/lang/String;
       178: invokedynamic #246,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       183: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       186: iconst_1
       187: ireturn
       188: aload_2
       189: ldc           #247                // String Você já está registrado neste evento.
       191: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       194: iconst_0
       195: ireturn
      LineNumberTable:
        line 126: 0
        line 127: 14
        line 129: 25
        line 130: 38
        line 133: 40
        line 135: 47
        line 136: 53
        line 139: 55
        line 141: 66
        line 142: 72
        line 145: 74
        line 147: 84
        line 148: 90
        line 151: 92
        line 153: 99
        line 154: 105
        line 157: 107
        line 159: 114
        line 160: 120
        line 163: 122
        line 165: 141
        line 166: 147
        line 169: 149
        line 171: 162
        line 172: 173
        line 173: 186
        line 177: 188
        line 178: 194
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     196     0  this   Lext/mods/battlerboss/register/BattleBossOpenRegister;
            0     196     1 event   Lext/mods/battlerboss/holder/EventHolder;
            0     196     2 player   Lext/mods/gameserver/model/actor/Player;
           14     182     3   reg   Lext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration;
      StackMapTable: number_of_entries = 9
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration ]
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 18 /* same */
        frame_type = 17 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 26 /* same */
        frame_type = 38 /* same */

  public void unregister(ext.mods.battlerboss.holder.EventHolder, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/battlerboss/holder/EventHolder;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: getfield      #10                 // Field eventRegistrations:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #19,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #25                 // class ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration
        13: astore_3
        14: aload_3
        15: ifnull        42
        18: aload_3
        19: getfield      #227                // Field ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registeredPlayers:Ljava/util/List;
        22: aload_2
        23: invokeinterface #249,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        28: pop
        29: aload_2
        30: aload_1
        31: invokevirtual #184                // Method ext/mods/battlerboss/holder/EventHolder.getName:()Ljava/lang/String;
        34: invokedynamic #252,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        39: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        42: return
      LineNumberTable:
        line 184: 0
        line 185: 14
        line 187: 18
        line 188: 29
        line 190: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/battlerboss/register/BattleBossOpenRegister;
            0      43     1 event   Lext/mods/battlerboss/holder/EventHolder;
            0      43     2 player   Lext/mods/gameserver/model/actor/Player;
           14      29     3   reg   Lext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ class ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration ]

  public java.util.List<ext.mods.gameserver.model.actor.Player> getRegisteredPlayers(ext.mods.battlerboss.holder.EventHolder);
    descriptor: (Lext/mods/battlerboss/holder/EventHolder;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field eventRegistrations:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #19,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #25                 // class ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration
        13: astore_2
        14: aload_2
        15: ifnull        26
        18: aload_2
        19: getfield      #227                // Field ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registeredPlayers:Ljava/util/List;
        22: invokestatic  #253                // Method java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        25: areturn
        26: invokestatic  #259                // Method java/util/Collections.emptyList:()Ljava/util/List;
        29: areturn
      LineNumberTable:
        line 194: 0
        line 195: 14
        line 196: 18
        line 197: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/battlerboss/register/BattleBossOpenRegister;
            0      30     1 event   Lext/mods/battlerboss/holder/EventHolder;
           14      16     2   reg   Lext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration ]
    Signature: #392                         // (Lext/mods/battlerboss/holder/EventHolder;)Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;

  public void onPlayerDeath(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #305                // Method getRumbleForPlayer:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/battlerboss/matches/BattleBossRumble;
         5: astore_2
         6: aload_2
         7: ifnull        15
        10: aload_2
        11: aload_1
        12: invokevirtual #309                // Method ext/mods/battlerboss/matches/BattleBossRumble.onPlayerDeath:(Lext/mods/gameserver/model/actor/Player;)V
        15: return
      LineNumberTable:
        line 241: 0
        line 242: 6
        line 244: 10
        line 246: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/battlerboss/register/BattleBossOpenRegister;
            0      16     1 player   Lext/mods/gameserver/model/actor/Player;
            6      10     2 rumble   Lext/mods/battlerboss/matches/BattleBossRumble;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/battlerboss/matches/BattleBossRumble ]

  public void onPlayerDeathMonster(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #305                // Method getRumbleForPlayer:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/battlerboss/matches/BattleBossRumble;
         5: astore_3
         6: aload_3
         7: ifnull        16
        10: aload_3
        11: aload_1
        12: aload_2
        13: invokevirtual #313                // Method ext/mods/battlerboss/matches/BattleBossRumble.onPlayerDeathMonster:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
        16: return
      LineNumberTable:
        line 250: 0
        line 251: 6
        line 253: 10
        line 255: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/battlerboss/register/BattleBossOpenRegister;
            0      17     1 player   Lext/mods/gameserver/model/actor/Player;
            0      17     2 monster   Lext/mods/gameserver/model/actor/Creature;
            6      11     3 rumble   Lext/mods/battlerboss/matches/BattleBossRumble;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/battlerboss/matches/BattleBossRumble ]

  public ext.mods.battlerboss.matches.BattleBossRumble getRumbleForPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/battlerboss/matches/BattleBossRumble;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #317                // Method ext/mods/gameserver/model/actor/Player.getBattleBossRumbleId:()I
         8: ifgt          13
        11: aconst_null
        12: areturn
        13: aload_0
        14: getfield      #16                 // Field _activeRumbles:Ljava/util/Map;
        17: aload_1
        18: invokevirtual #317                // Method ext/mods/gameserver/model/actor/Player.getBattleBossRumbleId:()I
        21: invokestatic  #291                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        24: invokeinterface #19,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #286                // class ext/mods/battlerboss/matches/BattleBossRumble
        32: areturn
      LineNumberTable:
        line 259: 0
        line 260: 11
        line 262: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/battlerboss/register/BattleBossOpenRegister;
            0      33     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 1 /* same */

  public void removeRumble(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _activeRumbles:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #291                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #320,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        13: pop
        14: return
      LineNumberTable:
        line 267: 0
        line 268: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/battlerboss/register/BattleBossOpenRegister;
            0      15     1 rumbleId   I

  public static ext.mods.battlerboss.register.BattleBossOpenRegister getInstance();
    descriptor: ()Lext/mods/battlerboss/register/BattleBossOpenRegister;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #339                // Field ext/mods/battlerboss/register/BattleBossOpenRegister$SingletonHolder.INSTANCE:Lext/mods/battlerboss/register/BattleBossOpenRegister;
         3: areturn
      LineNumberTable:
        line 302: 0
}
SourceFile: "BattleBossOpenRegister.java"
NestMembers:
  ext/mods/battlerboss/register/BattleBossOpenRegister$SingletonHolder
  ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration
BootstrapMethods:
  0: #454 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #423 ()V
      #424 REF_invokeVirtual ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$open$0:(Lext/mods/battlerboss/holder/EventHolder;)V
      #423 ()V
  1: #461 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #427 [BattleBoss] Evento Aberto: \u0001 - use .battleboss para participar!
  2: #454 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #423 ()V
      #429 REF_invokeStatic ext/mods/battlerboss/register/BattleBossOpenRegister.sendQuestionMarkToAllOnline:()V
      #423 ()V
  3: #454 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #423 ()V
      #430 REF_invokeVirtual ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$open$1:(Lext/mods/battlerboss/holder/EventHolder;)V
      #423 ()V
  4: #461 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #433 Registro fechado para o evento \u0001
  5: #461 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #435 Você foi registrado no evento \u0001. Aguarde a formação das equipes.
  6: #461 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #437 Você foi removido do registro do evento \u0001
  7: #454 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #423 ()V
      #439 REF_invokeStatic ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$scheduleReminders$0:(JLext/mods/battlerboss/holder/EventHolder;)V
      #423 ()V
  8: #454 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #423 ()V
      #442 REF_invokeStatic ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$scheduleReminders$1:(Lext/mods/battlerboss/holder/EventHolder;)V
      #423 ()V
  9: #454 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #423 ()V
      #445 REF_invokeStatic ext/mods/battlerboss/register/BattleBossOpenRegister.lambda$scheduleReminders$2:(Lext/mods/battlerboss/holder/EventHolder;)V
      #423 ()V
  10: #461 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #448 [BattleBoss] O evento \u0001 foi encerrado!
  11: #461 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #450 [BattleBoss] O evento \u0001 fechará em 30 segundos!
  12: #461 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #452 [BattleBoss] O evento \u0001 fecha em \u0001 minutos. Registre-se!
InnerClasses:
  public static final #474= #470 of #472; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
