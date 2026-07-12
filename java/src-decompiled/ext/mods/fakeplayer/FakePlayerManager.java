// Bytecode for: ext.mods.fakeplayer.FakePlayerManager
// File: ext\mods\fakeplayer\FakePlayerManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/FakePlayerManager.class
  Last modified 9 de jul de 2026; size 5277 bytes
  MD5 checksum f6cffcbb9a89a32f87ce615835d54637
  Compiled from "FakePlayerManager.java"
public class ext.mods.fakeplayer.FakePlayerManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #121                        // ext/mods/fakeplayer/FakePlayerManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 10, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/fakeplayer/FakePlayerTaskManager.getInstance:()Lext/mods/fakeplayer/FakePlayerTaskManager;
    #8 = Class              #10           // ext/mods/fakeplayer/FakePlayerTaskManager
    #9 = NameAndType        #11:#12       // getInstance:()Lext/mods/fakeplayer/FakePlayerTaskManager;
   #10 = Utf8               ext/mods/fakeplayer/FakePlayerTaskManager
   #11 = Utf8               getInstance
   #12 = Utf8               ()Lext/mods/fakeplayer/FakePlayerTaskManager;
   #13 = Methodref          #8.#14        // ext/mods/fakeplayer/FakePlayerTaskManager.initialise:()V
   #14 = NameAndType        #15:#6        // initialise:()V
   #15 = Utf8               initialise
   #16 = Methodref          #17.#18       // ext/mods/fakeplayer/data/EquipesData.getInstance:()Lext/mods/fakeplayer/data/EquipesData;
   #17 = Class              #19           // ext/mods/fakeplayer/data/EquipesData
   #18 = NameAndType        #11:#20       // getInstance:()Lext/mods/fakeplayer/data/EquipesData;
   #19 = Utf8               ext/mods/fakeplayer/data/EquipesData
   #20 = Utf8               ()Lext/mods/fakeplayer/data/EquipesData;
   #21 = Methodref          #22.#23       // ext/mods/fakeplayer/move/GiranMove.getInstance:()Lext/mods/fakeplayer/move/GiranMove;
   #22 = Class              #24           // ext/mods/fakeplayer/move/GiranMove
   #23 = NameAndType        #11:#25       // getInstance:()Lext/mods/fakeplayer/move/GiranMove;
   #24 = Utf8               ext/mods/fakeplayer/move/GiranMove
   #25 = Utf8               ()Lext/mods/fakeplayer/move/GiranMove;
   #26 = Methodref          #27.#28       // ext/mods/fakeplayer/helper/FakePlayerHelpers.createRandomFakePlayer:()Lext/mods/fakeplayer/FakePlayer;
   #27 = Class              #29           // ext/mods/fakeplayer/helper/FakePlayerHelpers
   #28 = NameAndType        #30:#31       // createRandomFakePlayer:()Lext/mods/fakeplayer/FakePlayer;
   #29 = Utf8               ext/mods/fakeplayer/helper/FakePlayerHelpers
   #30 = Utf8               createRandomFakePlayer
   #31 = Utf8               ()Lext/mods/fakeplayer/FakePlayer;
   #32 = Fieldref           #33.#34       // java/lang/System.out:Ljava/io/PrintStream;
   #33 = Class              #35           // java/lang/System
   #34 = NameAndType        #36:#37       // out:Ljava/io/PrintStream;
   #35 = Utf8               java/lang/System
   #36 = Utf8               out
   #37 = Utf8               Ljava/io/PrintStream;
   #38 = String             #39           // FakePlayerManager: Todos os nomes foram usados. Não é possível criar mais fake players.
   #39 = Utf8               FakePlayerManager: Todos os nomes foram usados. Não é possível criar mais fake players.
   #40 = Methodref          #41.#42       // java/io/PrintStream.println:(Ljava/lang/String;)V
   #41 = Class              #43           // java/io/PrintStream
   #42 = NameAndType        #44:#45       // println:(Ljava/lang/String;)V
   #43 = Utf8               java/io/PrintStream
   #44 = Utf8               println
   #45 = Utf8               (Ljava/lang/String;)V
   #46 = Methodref          #47.#48       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #47 = Class              #49           // ext/mods/gameserver/model/World
   #48 = NameAndType        #11:#50       // getInstance:()Lext/mods/gameserver/model/World;
   #49 = Utf8               ext/mods/gameserver/model/World
   #50 = Utf8               ()Lext/mods/gameserver/model/World;
   #51 = Methodref          #47.#52       // ext/mods/gameserver/model/World.addPlayer:(Lext/mods/gameserver/model/actor/Player;)V
   #52 = NameAndType        #53:#54       // addPlayer:(Lext/mods/gameserver/model/actor/Player;)V
   #53 = Utf8               addPlayer
   #54 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #55 = Fieldref           #56.#57       // ext/mods/Config.PLAYER_SPAWN_PROTECTION:I
   #56 = Class              #58           // ext/mods/Config
   #57 = NameAndType        #59:#60       // PLAYER_SPAWN_PROTECTION:I
   #58 = Utf8               ext/mods/Config
   #59 = Utf8               PLAYER_SPAWN_PROTECTION
   #60 = Utf8               I
   #61 = Methodref          #62.#63       // ext/mods/fakeplayer/FakePlayer.setSpawnProtection:(Z)V
   #62 = Class              #64           // ext/mods/fakeplayer/FakePlayer
   #63 = NameAndType        #65:#66       // setSpawnProtection:(Z)V
   #64 = Utf8               ext/mods/fakeplayer/FakePlayer
   #65 = Utf8               setSpawnProtection
   #66 = Utf8               (Z)V
   #67 = Methodref          #62.#68       // ext/mods/fakeplayer/FakePlayer.spawnMe:(III)V
   #68 = NameAndType        #69:#70       // spawnMe:(III)V
   #69 = Utf8               spawnMe
   #70 = Utf8               (III)V
   #71 = Methodref          #62.#72       // ext/mods/fakeplayer/FakePlayer.onPlayerEnter:()V
   #72 = NameAndType        #73:#6        // onPlayerEnter:()V
   #73 = Utf8               onPlayerEnter
   #74 = Methodref          #62.#75       // ext/mods/fakeplayer/FakePlayer.isGM:()Z
   #75 = NameAndType        #76:#77       // isGM:()Z
   #76 = Utf8               isGM
   #77 = Utf8               ()Z
   #78 = Methodref          #62.#79       // ext/mods/fakeplayer/FakePlayer.getSiegeState:()I
   #79 = NameAndType        #80:#81       // getSiegeState:()I
   #80 = Utf8               getSiegeState
   #81 = Utf8               ()I
   #82 = Fieldref           #83.#84       // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #83 = Class              #85           // ext/mods/gameserver/enums/ZoneId
   #84 = NameAndType        #86:#87       // SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #85 = Utf8               ext/mods/gameserver/enums/ZoneId
   #86 = Utf8               SIEGE
   #87 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #88 = Methodref          #62.#89       // ext/mods/fakeplayer/FakePlayer.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #89 = NameAndType        #90:#91       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #90 = Utf8               isInsideZone
   #91 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #92 = Fieldref           #93.#94       // ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
   #93 = Class              #95           // ext/mods/gameserver/enums/RestartType
   #94 = NameAndType        #96:#97       // TOWN:Lext/mods/gameserver/enums/RestartType;
   #95 = Utf8               ext/mods/gameserver/enums/RestartType
   #96 = Utf8               TOWN
   #97 = Utf8               Lext/mods/gameserver/enums/RestartType;
   #98 = Methodref          #62.#99       // ext/mods/fakeplayer/FakePlayer.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
   #99 = NameAndType        #100:#101     // teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
  #100 = Utf8               teleportTo
  #101 = Utf8               (Lext/mods/gameserver/enums/RestartType;)V
  #102 = Methodref          #62.#103      // ext/mods/fakeplayer/FakePlayer.getAi:()Lext/mods/fakeplayer/ai/FakePlayerAI;
  #103 = NameAndType        #104:#105     // getAi:()Lext/mods/fakeplayer/ai/FakePlayerAI;
  #104 = Utf8               getAi
  #105 = Utf8               ()Lext/mods/fakeplayer/ai/FakePlayerAI;
  #106 = Methodref          #62.#107      // ext/mods/fakeplayer/FakePlayer.assignDefaultAI:()V
  #107 = NameAndType        #108:#6       // assignDefaultAI:()V
  #108 = Utf8               assignDefaultAI
  #109 = Methodref          #62.#110      // ext/mods/fakeplayer/FakePlayer.setRunning:(Z)V
  #110 = NameAndType        #111:#66      // setRunning:(Z)V
  #111 = Utf8               setRunning
  #112 = Class              #113          // java/util/ArrayList
  #113 = Utf8               java/util/ArrayList
  #114 = Methodref          #112.#3       // java/util/ArrayList."<init>":()V
  #115 = InterfaceMethodref #116.#117     // java/util/List.size:()I
  #116 = Class              #118          // java/util/List
  #117 = NameAndType        #119:#81      // size:()I
  #118 = Utf8               java/util/List
  #119 = Utf8               size
  #120 = Methodref          #121.#122     // ext/mods/fakeplayer/FakePlayerManager.spawnPlayer:(III)Lext/mods/fakeplayer/FakePlayer;
  #121 = Class              #123          // ext/mods/fakeplayer/FakePlayerManager
  #122 = NameAndType        #124:#125     // spawnPlayer:(III)Lext/mods/fakeplayer/FakePlayer;
  #123 = Utf8               ext/mods/fakeplayer/FakePlayerManager
  #124 = Utf8               spawnPlayer
  #125 = Utf8               (III)Lext/mods/fakeplayer/FakePlayer;
  #126 = InterfaceMethodref #116.#127     // java/util/List.add:(Ljava/lang/Object;)Z
  #127 = NameAndType        #128:#129     // add:(Ljava/lang/Object;)Z
  #128 = Utf8               add
  #129 = Utf8               (Ljava/lang/Object;)Z
  #130 = Methodref          #47.#131      // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #131 = NameAndType        #132:#133     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #132 = Utf8               getPlayer
  #133 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #134 = Methodref          #62.#135      // ext/mods/fakeplayer/FakePlayer.despawnPlayer:()V
  #135 = NameAndType        #136:#6       // despawnPlayer:()V
  #136 = Utf8               despawnPlayer
  #137 = Methodref          #121.#138     // ext/mods/fakeplayer/FakePlayerManager.getFakePlayers:()Ljava/util/List;
  #138 = NameAndType        #139:#140     // getFakePlayers:()Ljava/util/List;
  #139 = Utf8               getFakePlayers
  #140 = Utf8               ()Ljava/util/List;
  #141 = Methodref          #47.#142      // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #142 = NameAndType        #143:#144     // getPlayers:()Ljava/util/Collection;
  #143 = Utf8               getPlayers
  #144 = Utf8               ()Ljava/util/Collection;
  #145 = InterfaceMethodref #146.#147     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #146 = Class              #148          // java/util/Collection
  #147 = NameAndType        #149:#150     // stream:()Ljava/util/stream/Stream;
  #148 = Utf8               java/util/Collection
  #149 = Utf8               stream
  #150 = Utf8               ()Ljava/util/stream/Stream;
  #151 = InvokeDynamic      #0:#152       // #0:test:()Ljava/util/function/Predicate;
  #152 = NameAndType        #153:#154     // test:()Ljava/util/function/Predicate;
  #153 = Utf8               test
  #154 = Utf8               ()Ljava/util/function/Predicate;
  #155 = InterfaceMethodref #156.#157     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #156 = Class              #158          // java/util/stream/Stream
  #157 = NameAndType        #159:#160     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #158 = Utf8               java/util/stream/Stream
  #159 = Utf8               filter
  #160 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #161 = InvokeDynamic      #1:#162       // #1:apply:()Ljava/util/function/Function;
  #162 = NameAndType        #163:#164     // apply:()Ljava/util/function/Function;
  #163 = Utf8               apply
  #164 = Utf8               ()Ljava/util/function/Function;
  #165 = InterfaceMethodref #156.#166     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #166 = NameAndType        #167:#168     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #167 = Utf8               map
  #168 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #169 = Methodref          #170.#171     // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
  #170 = Class              #172          // java/util/stream/Collectors
  #171 = NameAndType        #173:#174     // toList:()Ljava/util/stream/Collector;
  #172 = Utf8               java/util/stream/Collectors
  #173 = Utf8               toList
  #174 = Utf8               ()Ljava/util/stream/Collector;
  #175 = InterfaceMethodref #156.#176     // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #176 = NameAndType        #177:#178     // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #177 = Utf8               collect
  #178 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
  #179 = Fieldref           #180.#181     // ext/mods/fakeplayer/FakePlayerManager$SingletonHolder._instance:Lext/mods/fakeplayer/FakePlayerManager;
  #180 = Class              #182          // ext/mods/fakeplayer/FakePlayerManager$SingletonHolder
  #181 = NameAndType        #183:#184     // _instance:Lext/mods/fakeplayer/FakePlayerManager;
  #182 = Utf8               ext/mods/fakeplayer/FakePlayerManager$SingletonHolder
  #183 = Utf8               _instance
  #184 = Utf8               Lext/mods/fakeplayer/FakePlayerManager;
  #185 = Utf8               Code
  #186 = Utf8               LineNumberTable
  #187 = Utf8               LocalVariableTable
  #188 = Utf8               this
  #189 = Utf8               x
  #190 = Utf8               y
  #191 = Utf8               z
  #192 = Utf8               activeChar
  #193 = Utf8               Lext/mods/fakeplayer/FakePlayer;
  #194 = Utf8               StackMapTable
  #195 = Utf8               spawnPlayerGroup
  #196 = Utf8               (IIII)Ljava/util/List;
  #197 = Utf8               bot
  #198 = Utf8               count
  #199 = Utf8               group
  #200 = Utf8               Ljava/util/List;
  #201 = Utf8               attempts
  #202 = Utf8               i
  #203 = Utf8               LocalVariableTypeTable
  #204 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/FakePlayer;>;
  #205 = Utf8               Signature
  #206 = Utf8               (IIII)Ljava/util/List<Lext/mods/fakeplayer/FakePlayer;>;
  #207 = Utf8               despawnFakePlayer
  #208 = Utf8               (I)V
  #209 = Utf8               fakePlayer
  #210 = Utf8               objectId
  #211 = Utf8               player
  #212 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #213 = Class              #214          // ext/mods/gameserver/model/actor/Player
  #214 = Utf8               ext/mods/gameserver/model/actor/Player
  #215 = Utf8               getFakePlayersCount
  #216 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/FakePlayer;>;
  #217 = Utf8               ()Lext/mods/fakeplayer/FakePlayerManager;
  #218 = Utf8               lambda$getFakePlayers$1
  #219 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
  #220 = Utf8               lambda$getFakePlayers$0
  #221 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #222 = Utf8               SourceFile
  #223 = Utf8               FakePlayerManager.java
  #224 = Utf8               NestMembers
  #225 = Utf8               BootstrapMethods
  #226 = MethodType         #129          //  (Ljava/lang/Object;)Z
  #227 = MethodHandle       6:#228        // REF_invokeStatic ext/mods/fakeplayer/FakePlayerManager.lambda$getFakePlayers$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #228 = Methodref          #121.#229     // ext/mods/fakeplayer/FakePlayerManager.lambda$getFakePlayers$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #229 = NameAndType        #220:#221     // lambda$getFakePlayers$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #230 = MethodType         #221          //  (Lext/mods/gameserver/model/actor/Player;)Z
  #231 = MethodType         #232          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #232 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #233 = MethodHandle       6:#234        // REF_invokeStatic ext/mods/fakeplayer/FakePlayerManager.lambda$getFakePlayers$1:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
  #234 = Methodref          #121.#235     // ext/mods/fakeplayer/FakePlayerManager.lambda$getFakePlayers$1:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
  #235 = NameAndType        #218:#219     // lambda$getFakePlayers$1:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
  #236 = MethodType         #219          //  (Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
  #237 = MethodHandle       6:#238        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #238 = Methodref          #239.#240     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #239 = Class              #241          // java/lang/invoke/LambdaMetafactory
  #240 = NameAndType        #242:#243     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #241 = Utf8               java/lang/invoke/LambdaMetafactory
  #242 = Utf8               metafactory
  #243 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #244 = Utf8               InnerClasses
  #245 = Utf8               SingletonHolder
  #246 = Class              #247          // java/lang/invoke/MethodHandles$Lookup
  #247 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #248 = Class              #249          // java/lang/invoke/MethodHandles
  #249 = Utf8               java/lang/invoke/MethodHandles
  #250 = Utf8               Lookup
{
  public ext.mods.fakeplayer.FakePlayerManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/FakePlayerManager;

  public void initialise();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #7                  // Method ext/mods/fakeplayer/FakePlayerTaskManager.getInstance:()Lext/mods/fakeplayer/FakePlayerTaskManager;
         3: invokevirtual #13                 // Method ext/mods/fakeplayer/FakePlayerTaskManager.initialise:()V
         6: invokestatic  #16                 // Method ext/mods/fakeplayer/data/EquipesData.getInstance:()Lext/mods/fakeplayer/data/EquipesData;
         9: pop
        10: invokestatic  #21                 // Method ext/mods/fakeplayer/move/GiranMove.getInstance:()Lext/mods/fakeplayer/move/GiranMove;
        13: pop
        14: return
      LineNumberTable:
        line 38: 0
        line 39: 6
        line 40: 10
        line 41: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/fakeplayer/FakePlayerManager;

  public ext.mods.fakeplayer.FakePlayer spawnPlayer(int, int, int);
    descriptor: (III)Lext/mods/fakeplayer/FakePlayer;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=4
         0: invokestatic  #26                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.createRandomFakePlayer:()Lext/mods/fakeplayer/FakePlayer;
         3: astore        4
         5: aload         4
         7: ifnonnull     20
        10: getstatic     #32                 // Field java/lang/System.out:Ljava/io/PrintStream;
        13: ldc           #38                 // String FakePlayerManager: Todos os nomes foram usados. Não é possível criar mais fake players.
        15: invokevirtual #40                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        18: aconst_null
        19: areturn
        20: invokestatic  #46                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        23: aload         4
        25: invokevirtual #51                 // Method ext/mods/gameserver/model/World.addPlayer:(Lext/mods/gameserver/model/actor/Player;)V
        28: getstatic     #55                 // Field ext/mods/Config.PLAYER_SPAWN_PROTECTION:I
        31: ifle          40
        34: aload         4
        36: iconst_1
        37: invokevirtual #61                 // Method ext/mods/fakeplayer/FakePlayer.setSpawnProtection:(Z)V
        40: aload         4
        42: iload_1
        43: iload_2
        44: iload_3
        45: invokevirtual #67                 // Method ext/mods/fakeplayer/FakePlayer.spawnMe:(III)V
        48: aload         4
        50: invokevirtual #71                 // Method ext/mods/fakeplayer/FakePlayer.onPlayerEnter:()V
        53: aload         4
        55: invokevirtual #74                 // Method ext/mods/fakeplayer/FakePlayer.isGM:()Z
        58: ifne          89
        61: aload         4
        63: invokevirtual #78                 // Method ext/mods/fakeplayer/FakePlayer.getSiegeState:()I
        66: iconst_2
        67: if_icmpge     89
        70: aload         4
        72: getstatic     #82                 // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
        75: invokevirtual #88                 // Method ext/mods/fakeplayer/FakePlayer.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        78: ifeq          89
        81: aload         4
        83: getstatic     #92                 // Field ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
        86: invokevirtual #98                 // Method ext/mods/fakeplayer/FakePlayer.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
        89: aload         4
        91: invokevirtual #102                // Method ext/mods/fakeplayer/FakePlayer.getAi:()Lext/mods/fakeplayer/ai/FakePlayerAI;
        94: ifnonnull     102
        97: aload         4
        99: invokevirtual #106                // Method ext/mods/fakeplayer/FakePlayer.assignDefaultAI:()V
       102: aload         4
       104: iconst_1
       105: invokevirtual #109                // Method ext/mods/fakeplayer/FakePlayer.setRunning:(Z)V
       108: aload         4
       110: areturn
      LineNumberTable:
        line 45: 0
        line 47: 5
        line 49: 10
        line 50: 18
        line 53: 20
        line 55: 28
        line 56: 34
        line 58: 40
        line 59: 48
        line 61: 53
        line 62: 81
        line 64: 89
        line 66: 97
        line 68: 102
        line 69: 108
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     111     0  this   Lext/mods/fakeplayer/FakePlayerManager;
            0     111     1     x   I
            0     111     2     y   I
            0     111     3     z   I
            5     106     4 activeChar   Lext/mods/fakeplayer/FakePlayer;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/fakeplayer/FakePlayer ]
        frame_type = 19 /* same */
        frame_type = 48 /* same */
        frame_type = 12 /* same */

  public java.util.List<ext.mods.fakeplayer.FakePlayer> spawnPlayerGroup(int, int, int, int);
    descriptor: (IIII)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=5
         0: new           #112                // class java/util/ArrayList
         3: dup
         4: invokespecial #114                // Method java/util/ArrayList."<init>":()V
         7: astore        5
         9: iconst_0
        10: istore        6
        12: iconst_0
        13: istore        7
        15: aload         5
        17: invokeinterface #115,  1          // InterfaceMethod java/util/List.size:()I
        22: iload         4
        24: if_icmpge     81
        27: iload         6
        29: iload         4
        31: iconst_2
        32: imul
        33: if_icmpge     81
        36: aload_0
        37: iload_1
        38: iload         7
        40: bipush        45
        42: imul
        43: iadd
        44: iload_2
        45: iload         7
        47: bipush        45
        49: imul
        50: iadd
        51: iload_3
        52: invokevirtual #120                // Method spawnPlayer:(III)Lext/mods/fakeplayer/FakePlayer;
        55: astore        8
        57: iinc          6, 1
        60: iinc          7, 1
        63: aload         8
        65: ifnull        78
        68: aload         5
        70: aload         8
        72: invokeinterface #126,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        77: pop
        78: goto          15
        81: aload         5
        83: areturn
      LineNumberTable:
        line 74: 0
        line 75: 9
        line 76: 12
        line 78: 15
        line 80: 36
        line 81: 57
        line 82: 60
        line 83: 63
        line 85: 68
        line 87: 78
        line 89: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           57      21     8   bot   Lext/mods/fakeplayer/FakePlayer;
            0      84     0  this   Lext/mods/fakeplayer/FakePlayerManager;
            0      84     1     x   I
            0      84     2     y   I
            0      84     3     z   I
            0      84     4 count   I
            9      75     5 group   Ljava/util/List;
           12      72     6 attempts   I
           15      69     7     i   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9      75     5 group   Ljava/util/List<Lext/mods/fakeplayer/FakePlayer;>;
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 15
          locals = [ class java/util/List, int, int ]
        frame_type = 62 /* same */
        frame_type = 2 /* same */
    Signature: #206                         // (IIII)Ljava/util/List<Lext/mods/fakeplayer/FakePlayer;>;

  public void despawnFakePlayer(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: invokestatic  #46                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: iload_1
         4: invokevirtual #130                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
         7: astore_2
         8: aload_2
         9: instanceof    #62                 // class ext/mods/fakeplayer/FakePlayer
        12: ifeq          24
        15: aload_2
        16: checkcast     #62                 // class ext/mods/fakeplayer/FakePlayer
        19: astore_3
        20: aload_3
        21: invokevirtual #134                // Method ext/mods/fakeplayer/FakePlayer.despawnPlayer:()V
        24: return
      LineNumberTable:
        line 94: 0
        line 95: 8
        line 97: 15
        line 98: 20
        line 100: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20       4     3 fakePlayer   Lext/mods/fakeplayer/FakePlayer;
            0      25     0  this   Lext/mods/fakeplayer/FakePlayerManager;
            0      25     1 objectId   I
            8      17     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/actor/Player ]

  public int getFakePlayersCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #137                // Method getFakePlayers:()Ljava/util/List;
         4: invokeinterface #115,  1          // InterfaceMethod java/util/List.size:()I
         9: ireturn
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/fakeplayer/FakePlayerManager;

  public java.util.List<ext.mods.fakeplayer.FakePlayer> getFakePlayers();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #46                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: invokevirtual #141                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
         6: invokeinterface #145,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        11: invokedynamic #151,  0            // InvokeDynamic #0:test:()Ljava/util/function/Predicate;
        16: invokeinterface #155,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        21: invokedynamic #161,  0            // InvokeDynamic #1:apply:()Ljava/util/function/Function;
        26: invokeinterface #165,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        31: invokestatic  #169                // Method java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
        34: invokeinterface #175,  2          // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
        39: checkcast     #116                // class java/util/List
        42: areturn
      LineNumberTable:
        line 109: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/fakeplayer/FakePlayerManager;
    Signature: #216                         // ()Ljava/util/List<Lext/mods/fakeplayer/FakePlayer;>;

  public static ext.mods.fakeplayer.FakePlayerManager getInstance();
    descriptor: ()Lext/mods/fakeplayer/FakePlayerManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #179                // Field ext/mods/fakeplayer/FakePlayerManager$SingletonHolder._instance:Lext/mods/fakeplayer/FakePlayerManager;
         3: areturn
      LineNumberTable:
        line 114: 0
}
SourceFile: "FakePlayerManager.java"
NestMembers:
  ext/mods/fakeplayer/FakePlayerManager$SingletonHolder
BootstrapMethods:
  0: #237 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #226 (Ljava/lang/Object;)Z
      #227 REF_invokeStatic ext/mods/fakeplayer/FakePlayerManager.lambda$getFakePlayers$0:(Lext/mods/gameserver/model/actor/Player;)Z
      #230 (Lext/mods/gameserver/model/actor/Player;)Z
  1: #237 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #231 (Ljava/lang/Object;)Ljava/lang/Object;
      #233 REF_invokeStatic ext/mods/fakeplayer/FakePlayerManager.lambda$getFakePlayers$1:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
      #236 (Lext/mods/gameserver/model/actor/Player;)Lext/mods/fakeplayer/FakePlayer;
InnerClasses:
  public static final #250= #246 of #248; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
