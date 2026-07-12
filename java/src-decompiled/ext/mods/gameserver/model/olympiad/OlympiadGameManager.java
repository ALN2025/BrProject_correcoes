// Bytecode for: ext.mods.gameserver.model.olympiad.OlympiadGameManager
// File: ext\mods\gameserver\model\olympiad\OlympiadGameManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/olympiad/OlympiadGameManager.class
  Last modified 9 de jul de 2026; size 6327 bytes
  MD5 checksum a7b2cacb6a0a8022e959fb989d00d522
  Compiled from "OlympiadGameManager.java"
public class ext.mods.gameserver.model.olympiad.OlympiadGameManager implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/olympiad/OlympiadGameManager
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 11, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/olympiad/OlympiadGameManager._battleStarted:Z
    #8 = Class              #10           // ext/mods/gameserver/model/olympiad/OlympiadGameManager
    #9 = NameAndType        #11:#12       // _battleStarted:Z
   #10 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameManager
   #11 = Utf8               _battleStarted
   #12 = Utf8               Z
   #13 = Methodref          #14.#15       // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #14 = Class              #16           // ext/mods/gameserver/data/manager/ZoneManager
   #15 = NameAndType        #17:#18       // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #16 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
   #17 = Utf8               getInstance
   #18 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
   #19 = Class              #20           // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
   #20 = Utf8               ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
   #21 = Methodref          #14.#22       // ext/mods/gameserver/data/manager/ZoneManager.getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
   #22 = NameAndType        #23:#24       // getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
   #23 = Utf8               getAllZones
   #24 = Utf8               (Ljava/lang/Class;)Ljava/util/Collection;
   #25 = InterfaceMethodref #26.#27       // java/util/Collection.isEmpty:()Z
   #26 = Class              #28           // java/util/Collection
   #27 = NameAndType        #29:#30       // isEmpty:()Z
   #28 = Utf8               java/util/Collection
   #29 = Utf8               isEmpty
   #30 = Utf8               ()Z
   #31 = Class              #32           // java/lang/Error
   #32 = Utf8               java/lang/Error
   #33 = String             #34           // No olympiad stadium zones defined !
   #34 = Utf8               No olympiad stadium zones defined !
   #35 = Methodref          #31.#36       // java/lang/Error."<init>":(Ljava/lang/String;)V
   #36 = NameAndType        #5:#37        // "<init>":(Ljava/lang/String;)V
   #37 = Utf8               (Ljava/lang/String;)V
   #38 = InterfaceMethodref #26.#39       // java/util/Collection.size:()I
   #39 = NameAndType        #40:#41       // size:()I
   #40 = Utf8               size
   #41 = Utf8               ()I
   #42 = Class              #43           // ext/mods/gameserver/model/olympiad/OlympiadGameTask
   #43 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameTask
   #44 = Fieldref           #8.#45        // ext/mods/gameserver/model/olympiad/OlympiadGameManager._tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
   #45 = NameAndType        #46:#47       // _tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
   #46 = Utf8               _tasks
   #47 = Utf8               [Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
   #48 = InterfaceMethodref #26.#49       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #49 = NameAndType        #50:#51       // iterator:()Ljava/util/Iterator;
   #50 = Utf8               iterator
   #51 = Utf8               ()Ljava/util/Iterator;
   #52 = InterfaceMethodref #53.#54       // java/util/Iterator.hasNext:()Z
   #53 = Class              #55           // java/util/Iterator
   #54 = NameAndType        #56:#30       // hasNext:()Z
   #55 = Utf8               java/util/Iterator
   #56 = Utf8               hasNext
   #57 = InterfaceMethodref #53.#58       // java/util/Iterator.next:()Ljava/lang/Object;
   #58 = NameAndType        #59:#60       // next:()Ljava/lang/Object;
   #59 = Utf8               next
   #60 = Utf8               ()Ljava/lang/Object;
   #61 = Methodref          #42.#62       // ext/mods/gameserver/model/olympiad/OlympiadGameTask."<init>":(Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
   #62 = NameAndType        #5:#63        // "<init>":(Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
   #63 = Utf8               (Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
   #64 = Fieldref           #8.#65        // ext/mods/gameserver/model/olympiad/OlympiadGameManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #65 = NameAndType        #66:#67       // LOGGER:Lext/mods/commons/logging/CLogger;
   #66 = Utf8               LOGGER
   #67 = Utf8               Lext/mods/commons/logging/CLogger;
   #68 = String             #69           // Loaded {} stadiums.
   #69 = Utf8               Loaded {} stadiums.
   #70 = Methodref          #71.#72       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #71 = Class              #73           // java/lang/Integer
   #72 = NameAndType        #74:#75       // valueOf:(I)Ljava/lang/Integer;
   #73 = Utf8               java/lang/Integer
   #74 = Utf8               valueOf
   #75 = Utf8               (I)Ljava/lang/Integer;
   #76 = Methodref          #77.#78       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #77 = Class              #79           // ext/mods/commons/logging/CLogger
   #78 = NameAndType        #80:#81       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #79 = Utf8               ext/mods/commons/logging/CLogger
   #80 = Utf8               info
   #81 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #82 = Methodref          #83.#84       // ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
   #83 = Class              #85           // ext/mods/gameserver/model/olympiad/Olympiad
   #84 = NameAndType        #17:#86       // getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
   #85 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad
   #86 = Utf8               ()Lext/mods/gameserver/model/olympiad/Olympiad;
   #87 = Methodref          #83.#88       // ext/mods/gameserver/model/olympiad/Olympiad.isOlympiadEnd:()Z
   #88 = NameAndType        #89:#30       // isOlympiadEnd:()Z
   #89 = Utf8               isOlympiadEnd
   #90 = Methodref          #83.#91       // ext/mods/gameserver/model/olympiad/Olympiad.isInCompPeriod:()Z
   #91 = NameAndType        #92:#30       // isInCompPeriod:()Z
   #92 = Utf8               isInCompPeriod
   #93 = Methodref          #94.#95       // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #94 = Class              #96           // ext/mods/gameserver/model/olympiad/OlympiadManager
   #95 = NameAndType        #17:#97       // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #96 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
   #97 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #98 = Methodref          #94.#99       // ext/mods/gameserver/model/olympiad/OlympiadManager.hasEnoughClassBasedParticipants:()Ljava/util/List;
   #99 = NameAndType        #100:#101     // hasEnoughClassBasedParticipants:()Ljava/util/List;
  #100 = Utf8               hasEnoughClassBasedParticipants
  #101 = Utf8               ()Ljava/util/List;
  #102 = Methodref          #94.#103      // ext/mods/gameserver/model/olympiad/OlympiadManager.hasEnoughNonClassBasedParticipants:()Z
  #103 = NameAndType        #104:#30      // hasEnoughNonClassBasedParticipants:()Z
  #104 = Utf8               hasEnoughNonClassBasedParticipants
  #105 = Methodref          #94.#106      // ext/mods/gameserver/model/olympiad/OlympiadManager.getClassBasedParticipants:()Ljava/util/Map;
  #106 = NameAndType        #107:#108     // getClassBasedParticipants:()Ljava/util/Map;
  #107 = Utf8               getClassBasedParticipants
  #108 = Utf8               ()Ljava/util/Map;
  #109 = InterfaceMethodref #110.#111     // java/util/Map.values:()Ljava/util/Collection;
  #110 = Class              #112          // java/util/Map
  #111 = NameAndType        #113:#114     // values:()Ljava/util/Collection;
  #112 = Utf8               java/util/Map
  #113 = Utf8               values
  #114 = Utf8               ()Ljava/util/Collection;
  #115 = Class              #116          // java/util/List
  #116 = Utf8               java/util/List
  #117 = InterfaceMethodref #115.#49      // java/util/List.iterator:()Ljava/util/Iterator;
  #118 = Methodref          #71.#119      // java/lang/Integer.intValue:()I
  #119 = NameAndType        #120:#41      // intValue:()I
  #120 = Utf8               intValue
  #121 = Methodref          #122.#123     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #122 = Class              #124          // ext/mods/gameserver/model/World
  #123 = NameAndType        #17:#125      // getInstance:()Lext/mods/gameserver/model/World;
  #124 = Utf8               ext/mods/gameserver/model/World
  #125 = Utf8               ()Lext/mods/gameserver/model/World;
  #126 = Methodref          #122.#127     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #127 = NameAndType        #128:#129     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #128 = Utf8               getPlayer
  #129 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #130 = Fieldref           #131.#132     // ext/mods/gameserver/network/SystemMessageId.GAMES_DELAYED:Lext/mods/gameserver/network/SystemMessageId;
  #131 = Class              #133          // ext/mods/gameserver/network/SystemMessageId
  #132 = NameAndType        #134:#135     // GAMES_DELAYED:Lext/mods/gameserver/network/SystemMessageId;
  #133 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #134 = Utf8               GAMES_DELAYED
  #135 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #136 = Methodref          #137.#138     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #137 = Class              #139          // ext/mods/gameserver/model/actor/Player
  #138 = NameAndType        #140:#141     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #139 = Utf8               ext/mods/gameserver/model/actor/Player
  #140 = Utf8               sendPacket
  #141 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #142 = Methodref          #94.#143      // ext/mods/gameserver/model/olympiad/OlympiadManager.getNonClassBasedParticipants:()Ljava/util/List;
  #143 = NameAndType        #144:#101     // getNonClassBasedParticipants:()Ljava/util/List;
  #144 = Utf8               getNonClassBasedParticipants
  #145 = Methodref          #42.#146      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.isRunning:()Z
  #146 = NameAndType        #147:#30      // isRunning:()Z
  #147 = Utf8               isRunning
  #148 = Methodref          #149.#150     // ext/mods/gameserver/model/olympiad/OlympiadGameClassed.createGame:(ILjava/util/List;)Lext/mods/gameserver/model/olympiad/OlympiadGameClassed;
  #149 = Class              #151          // ext/mods/gameserver/model/olympiad/OlympiadGameClassed
  #150 = NameAndType        #152:#153     // createGame:(ILjava/util/List;)Lext/mods/gameserver/model/olympiad/OlympiadGameClassed;
  #151 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameClassed
  #152 = Utf8               createGame
  #153 = Utf8               (ILjava/util/List;)Lext/mods/gameserver/model/olympiad/OlympiadGameClassed;
  #154 = Methodref          #42.#155      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.attachGame:(Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;)V
  #155 = NameAndType        #156:#157     // attachGame:(Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;)V
  #156 = Utf8               attachGame
  #157 = Utf8               (Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;)V
  #158 = Methodref          #159.#160     // ext/mods/gameserver/model/olympiad/OlympiadGameNonClassed.createGame:(ILjava/util/List;)Lext/mods/gameserver/model/olympiad/OlympiadGameNonClassed;
  #159 = Class              #161          // ext/mods/gameserver/model/olympiad/OlympiadGameNonClassed
  #160 = NameAndType        #152:#162     // createGame:(ILjava/util/List;)Lext/mods/gameserver/model/olympiad/OlympiadGameNonClassed;
  #161 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameNonClassed
  #162 = Utf8               (ILjava/util/List;)Lext/mods/gameserver/model/olympiad/OlympiadGameNonClassed;
  #163 = Methodref          #8.#164       // ext/mods/gameserver/model/olympiad/OlympiadGameManager.isAllTasksFinished:()Z
  #164 = NameAndType        #165:#30      // isAllTasksFinished:()Z
  #165 = Utf8               isAllTasksFinished
  #166 = Methodref          #94.#167      // ext/mods/gameserver/model/olympiad/OlympiadManager.clearParticipants:()V
  #167 = NameAndType        #168:#6       // clearParticipants:()V
  #168 = Utf8               clearParticipants
  #169 = String             #170          // All current Olympiad games finished.
  #170 = Utf8               All current Olympiad games finished.
  #171 = Methodref          #77.#172      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #172 = NameAndType        #80:#173      // info:(Ljava/lang/Object;)V
  #173 = Utf8               (Ljava/lang/Object;)V
  #174 = Methodref          #137.#175     // ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
  #175 = NameAndType        #176:#41      // getOlympiadGameId:()I
  #176 = Utf8               getOlympiadGameId
  #177 = Methodref          #42.#178      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #178 = NameAndType        #179:#180     // getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #179 = Utf8               getGame
  #180 = Utf8               ()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #181 = Methodref          #182.#183     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.addDamage:(Lext/mods/gameserver/model/actor/Player;I)V
  #182 = Class              #184          // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
  #183 = NameAndType        #185:#186     // addDamage:(Lext/mods/gameserver/model/actor/Player;I)V
  #184 = Utf8               ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
  #185 = Utf8               addDamage
  #186 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #187 = Fieldref           #188.#189     // ext/mods/gameserver/model/olympiad/OlympiadGameManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #188 = Class              #190          // ext/mods/gameserver/model/olympiad/OlympiadGameManager$SingletonHolder
  #189 = NameAndType        #191:#192     // INSTANCE:Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #190 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameManager$SingletonHolder
  #191 = Utf8               INSTANCE
  #192 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #193 = Methodref          #194.#195     // java/lang/Class.getName:()Ljava/lang/String;
  #194 = Class              #196          // java/lang/Class
  #195 = NameAndType        #197:#198     // getName:()Ljava/lang/String;
  #196 = Utf8               java/lang/Class
  #197 = Utf8               getName
  #198 = Utf8               ()Ljava/lang/String;
  #199 = Methodref          #77.#36       // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #200 = Class              #201          // java/lang/Runnable
  #201 = Utf8               java/lang/Runnable
  #202 = Utf8               Code
  #203 = Utf8               LineNumberTable
  #204 = Utf8               LocalVariableTable
  #205 = Utf8               zone
  #206 = Utf8               Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
  #207 = Utf8               this
  #208 = Utf8               zones
  #209 = Utf8               Ljava/util/Collection;
  #210 = Utf8               i
  #211 = Utf8               I
  #212 = Utf8               LocalVariableTypeTable
  #213 = Utf8               Ljava/util/Collection<Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;>;
  #214 = Utf8               StackMapTable
  #215 = Utf8               run
  #216 = Utf8               player
  #217 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #218 = Utf8               objectId
  #219 = Utf8               classList
  #220 = Utf8               Ljava/util/List;
  #221 = Utf8               newGame
  #222 = Utf8               Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #223 = Utf8               task
  #224 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #225 = Utf8               readyClassed
  #226 = Utf8               readyNonClassed
  #227 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #228 = Utf8               Ljava/util/List<Ljava/util/List<Ljava/lang/Integer;>;>;
  #229 = Class              #230          // java/lang/Throwable
  #230 = Utf8               java/lang/Throwable
  #231 = Utf8               isBattleStarted
  #232 = Utf8               startBattle
  #233 = Class              #47           // "[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;"
  #234 = Utf8               getOlympiadTask
  #235 = Utf8               (I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #236 = Utf8               id
  #237 = Utf8               getOlympiadTasks
  #238 = Utf8               ()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #239 = Utf8               getNumberOfStadiums
  #240 = Utf8               notifyCompetitorDamage
  #241 = Utf8               damage
  #242 = Utf8               game
  #243 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #244 = Utf8               <clinit>
  #245 = Utf8               SourceFile
  #246 = Utf8               OlympiadGameManager.java
  #247 = Utf8               NestMembers
  #248 = Utf8               InnerClasses
  #249 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.model.olympiad.OlympiadGameManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=5, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field _battleStarted:Z
         9: invokestatic  #13                 // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
        12: ldc           #19                 // class ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
        14: invokevirtual #21                 // Method ext/mods/gameserver/data/manager/ZoneManager.getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
        17: astore_1
        18: aload_1
        19: ifnull        31
        22: aload_1
        23: invokeinterface #25,  1           // InterfaceMethod java/util/Collection.isEmpty:()Z
        28: ifeq          41
        31: new           #31                 // class java/lang/Error
        34: dup
        35: ldc           #33                 // String No olympiad stadium zones defined !
        37: invokespecial #35                 // Method java/lang/Error."<init>":(Ljava/lang/String;)V
        40: athrow
        41: aload_0
        42: aload_1
        43: invokeinterface #38,  1           // InterfaceMethod java/util/Collection.size:()I
        48: anewarray     #42                 // class ext/mods/gameserver/model/olympiad/OlympiadGameTask
        51: putfield      #44                 // Field _tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
        54: iconst_0
        55: istore_2
        56: aload_1
        57: invokeinterface #48,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        62: astore_3
        63: aload_3
        64: invokeinterface #52,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        69: ifeq          104
        72: aload_3
        73: invokeinterface #57,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        78: checkcast     #19                 // class ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
        81: astore        4
        83: aload_0
        84: getfield      #44                 // Field _tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
        87: iload_2
        88: iinc          2, 1
        91: new           #42                 // class ext/mods/gameserver/model/olympiad/OlympiadGameTask
        94: dup
        95: aload         4
        97: invokespecial #61                 // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask."<init>":(Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
       100: aastore
       101: goto          63
       104: getstatic     #64                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       107: ldc           #68                 // String Loaded {} stadiums.
       109: iconst_1
       110: anewarray     #2                  // class java/lang/Object
       113: dup
       114: iconst_0
       115: aload_0
       116: getfield      #44                 // Field _tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
       119: arraylength
       120: invokestatic  #70                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       123: aastore
       124: invokevirtual #76                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       127: return
      LineNumberTable:
        line 39: 0
        line 35: 4
        line 40: 9
        line 41: 18
        line 42: 31
        line 44: 41
        line 45: 54
        line 46: 56
        line 47: 83
        line 49: 104
        line 50: 127
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           83      18     4  zone   Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
            0     128     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
           18     110     1 zones   Ljava/util/Collection;
           56      72     2     i   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           18     110     1 zones   Ljava/util/Collection<Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;>;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/olympiad/OlympiadGameManager, class java/util/Collection ]
          stack = []
        frame_type = 9 /* same */
        frame_type = 253 /* append */
          offset_delta = 21
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 40

  public final void run();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=9, args_size=1
         0: invokestatic  #82                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
         3: invokevirtual #87                 // Method ext/mods/gameserver/model/olympiad/Olympiad.isOlympiadEnd:()Z
         6: ifeq          10
         9: return
        10: invokestatic  #82                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
        13: invokevirtual #90                 // Method ext/mods/gameserver/model/olympiad/Olympiad.isInCompPeriod:()Z
        16: ifeq          343
        19: invokestatic  #93                 // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
        22: invokevirtual #98                 // Method ext/mods/gameserver/model/olympiad/OlympiadManager.hasEnoughClassBasedParticipants:()Ljava/util/List;
        25: astore_1
        26: invokestatic  #93                 // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
        29: invokevirtual #102                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.hasEnoughNonClassBasedParticipants:()Z
        32: istore_2
        33: aload_1
        34: ifnonnull     203
        37: iload_2
        38: ifne          203
        41: invokestatic  #93                 // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
        44: invokevirtual #105                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getClassBasedParticipants:()Ljava/util/Map;
        47: invokeinterface #109,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        52: invokeinterface #48,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        57: astore_3
        58: aload_3
        59: invokeinterface #52,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        64: ifeq          141
        67: aload_3
        68: invokeinterface #57,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        73: checkcast     #115                // class java/util/List
        76: astore        4
        78: aload         4
        80: invokeinterface #117,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        85: astore        5
        87: aload         5
        89: invokeinterface #52,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        94: ifeq          138
        97: aload         5
        99: invokeinterface #57,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       104: checkcast     #71                 // class java/lang/Integer
       107: invokevirtual #118                // Method java/lang/Integer.intValue:()I
       110: istore        6
       112: invokestatic  #121                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       115: iload         6
       117: invokevirtual #126                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
       120: astore        7
       122: aload         7
       124: ifnull        135
       127: aload         7
       129: getstatic     #130                // Field ext/mods/gameserver/network/SystemMessageId.GAMES_DELAYED:Lext/mods/gameserver/network/SystemMessageId;
       132: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       135: goto          87
       138: goto          58
       141: invokestatic  #93                 // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
       144: invokevirtual #142                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getNonClassBasedParticipants:()Ljava/util/List;
       147: invokeinterface #117,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       152: astore_3
       153: aload_3
       154: invokeinterface #52,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       159: ifeq          202
       162: aload_3
       163: invokeinterface #57,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       168: checkcast     #71                 // class java/lang/Integer
       171: invokevirtual #118                // Method java/lang/Integer.intValue:()I
       174: istore        4
       176: invokestatic  #121                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       179: iload         4
       181: invokevirtual #126                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
       184: astore        5
       186: aload         5
       188: ifnull        199
       191: aload         5
       193: getstatic     #130                // Field ext/mods/gameserver/network/SystemMessageId.GAMES_DELAYED:Lext/mods/gameserver/network/SystemMessageId;
       196: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       199: goto          153
       202: return
       203: iconst_0
       204: istore_3
       205: iload_3
       206: aload_0
       207: getfield      #44                 // Field _tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
       210: arraylength
       211: if_icmpge     340
       214: aload_0
       215: getfield      #44                 // Field _tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
       218: iload_3
       219: aaload
       220: astore        4
       222: aload         4
       224: dup
       225: astore        5
       227: monitorenter
       228: aload         4
       230: invokevirtual #145                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.isRunning:()Z
       233: ifne          309
       236: aload_1
       237: ifnull        273
       240: iload_3
       241: iconst_2
       242: irem
       243: ifne          273
       246: iload_3
       247: aload_1
       248: invokestatic  #148                // Method ext/mods/gameserver/model/olympiad/OlympiadGameClassed.createGame:(ILjava/util/List;)Lext/mods/gameserver/model/olympiad/OlympiadGameClassed;
       251: astore        6
       253: aload         6
       255: ifnull        271
       258: aload         4
       260: aload         6
       262: invokevirtual #154                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.attachGame:(Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;)V
       265: aload         5
       267: monitorexit
       268: goto          334
       271: aconst_null
       272: astore_1
       273: iload_2
       274: ifeq          309
       277: iload_3
       278: invokestatic  #93                 // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
       281: invokevirtual #142                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getNonClassBasedParticipants:()Ljava/util/List;
       284: invokestatic  #158                // Method ext/mods/gameserver/model/olympiad/OlympiadGameNonClassed.createGame:(ILjava/util/List;)Lext/mods/gameserver/model/olympiad/OlympiadGameNonClassed;
       287: astore        6
       289: aload         6
       291: ifnull        307
       294: aload         4
       296: aload         6
       298: invokevirtual #154                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.attachGame:(Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;)V
       301: aload         5
       303: monitorexit
       304: goto          334
       307: iconst_0
       308: istore_2
       309: aload         5
       311: monitorexit
       312: goto          323
       315: astore        8
       317: aload         5
       319: monitorexit
       320: aload         8
       322: athrow
       323: aload_1
       324: ifnonnull     334
       327: iload_2
       328: ifne          334
       331: goto          340
       334: iinc          3, 1
       337: goto          205
       340: goto          369
       343: aload_0
       344: invokevirtual #163                // Method isAllTasksFinished:()Z
       347: ifeq          369
       350: invokestatic  #93                 // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
       353: invokevirtual #166                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.clearParticipants:()V
       356: aload_0
       357: iconst_0
       358: putfield      #7                  // Field _battleStarted:Z
       361: getstatic     #64                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       364: ldc           #169                // String All current Olympiad games finished.
       366: invokevirtual #171                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       369: return
      Exception table:
         from    to  target type
           228   268   315   any
           271   304   315   any
           307   312   315   any
           315   320   315   any
      LineNumberTable:
        line 55: 0
        line 56: 9
        line 58: 10
        line 60: 19
        line 61: 26
        line 63: 33
        line 65: 41
        line 67: 78
        line 69: 112
        line 70: 122
        line 71: 127
        line 72: 135
        line 73: 138
        line 75: 141
        line 77: 176
        line 78: 186
        line 79: 191
        line 80: 199
        line 82: 202
        line 85: 203
        line 87: 214
        line 88: 222
        line 90: 228
        line 92: 236
        line 94: 246
        line 95: 253
        line 97: 258
        line 98: 265
        line 101: 271
        line 104: 273
        line 106: 277
        line 107: 289
        line 109: 294
        line 110: 301
        line 113: 307
        line 116: 309
        line 118: 323
        line 119: 331
        line 85: 334
        line 121: 340
        line 124: 343
        line 126: 350
        line 128: 356
        line 130: 361
        line 133: 369
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          122      13     7 player   Lext/mods/gameserver/model/actor/Player;
          112      23     6 objectId   I
           78      60     4 classList   Ljava/util/List;
          186      13     5 player   Lext/mods/gameserver/model/actor/Player;
          176      23     4 objectId   I
          253      20     6 newGame   Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
          289      20     6 newGame   Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
          222     112     4  task   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
          205     135     3     i   I
           26     314     1 readyClassed   Ljava/util/List;
           33     307     2 readyNonClassed   Z
            0     370     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           78      60     4 classList   Ljava/util/List<Ljava/lang/Integer;>;
           26     314     1 readyClassed   Ljava/util/List<Ljava/util/List<Ljava/lang/Integer;>;>;
      StackMapTable: number_of_entries = 21
        frame_type = 10 /* same */
        frame_type = 254 /* append */
          offset_delta = 47
          locals = [ class java/util/List, int, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 28
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 47 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 45 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ int ]
        frame_type = 254 /* append */
          offset_delta = 65
          locals = [ class ext/mods/gameserver/model/olympiad/OlympiadGameTask, class java/lang/Object, class ext/mods/gameserver/model/olympiad/AbstractOlympiadGame ]
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/olympiad/AbstractOlympiadGame ]
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 250 /* chop */
          offset_delta = 10
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 25 /* same */

  protected final boolean isBattleStarted();
    descriptor: ()Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _battleStarted:Z
         4: ireturn
      LineNumberTable:
        line 137: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameManager;

  protected final void startBattle();
    descriptor: ()V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: putfield      #7                  // Field _battleStarted:Z
         5: return
      LineNumberTable:
        line 142: 0
        line 143: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameManager;

  public final boolean isAllTasksFinished();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=5, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
         4: astore_1
         5: aload_1
         6: arraylength
         7: istore_2
         8: iconst_0
         9: istore_3
        10: iload_3
        11: iload_2
        12: if_icmpge     36
        15: aload_1
        16: iload_3
        17: aaload
        18: astore        4
        20: aload         4
        22: invokevirtual #145                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.isRunning:()Z
        25: ifeq          30
        28: iconst_0
        29: ireturn
        30: iinc          3, 1
        33: goto          10
        36: iconst_1
        37: ireturn
      LineNumberTable:
        line 147: 0
        line 149: 20
        line 150: 28
        line 147: 30
        line 152: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20      10     4  task   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
            0      38     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;", int, int ]
        frame_type = 19 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public final ext.mods.gameserver.model.olympiad.OlympiadGameTask getOlympiadTask(int);
    descriptor: (I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: iflt          13
         4: iload_1
         5: aload_0
         6: getfield      #44                 // Field _tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
         9: arraylength
        10: if_icmplt     15
        13: aconst_null
        14: areturn
        15: aload_0
        16: getfield      #44                 // Field _tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
        19: iload_1
        20: aaload
        21: areturn
      LineNumberTable:
        line 157: 0
        line 158: 13
        line 160: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
            0      22     1    id   I
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 1 /* same */

  public ext.mods.gameserver.model.olympiad.OlympiadGameTask[] getOlympiadTasks();
    descriptor: ()[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
         4: areturn
      LineNumberTable:
        line 165: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameManager;

  public final int getNumberOfStadiums();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
         4: arraylength
         5: ireturn
      LineNumberTable:
        line 170: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameManager;

  public final void notifyCompetitorDamage(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=5, args_size=3
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_1
         6: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
         9: istore_3
        10: iload_3
        11: iflt          23
        14: iload_3
        15: aload_0
        16: getfield      #44                 // Field _tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
        19: arraylength
        20: if_icmplt     24
        23: return
        24: aload_0
        25: getfield      #44                 // Field _tasks:[Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
        28: iload_3
        29: aaload
        30: invokevirtual #177                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.getGame:()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
        33: astore        4
        35: aload         4
        37: ifnull        47
        40: aload         4
        42: aload_1
        43: iload_2
        44: invokevirtual #181                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.addDamage:(Lext/mods/gameserver/model/actor/Player;I)V
        47: return
      LineNumberTable:
        line 175: 0
        line 176: 4
        line 178: 5
        line 179: 10
        line 180: 23
        line 182: 24
        line 183: 35
        line 184: 40
        line 185: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
            0      48     1 player   Lext/mods/gameserver/model/actor/Player;
            0      48     2 damage   I
           10      38     3    id   I
           35      13     4  game   Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
      StackMapTable: number_of_entries = 4
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ int ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/olympiad/AbstractOlympiadGame ]

  public static final ext.mods.gameserver.model.olympiad.OlympiadGameManager getInstance();
    descriptor: ()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #187                // Field ext/mods/gameserver/model/olympiad/OlympiadGameManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
         3: areturn
      LineNumberTable:
        line 189: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #77                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/model/olympiad/OlympiadGameManager
         6: invokevirtual #193                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #199                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #64                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 33: 0
}
SourceFile: "OlympiadGameManager.java"
NestMembers:
  ext/mods/gameserver/model/olympiad/OlympiadGameManager$SingletonHolder
