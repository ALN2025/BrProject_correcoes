// Bytecode for: ext.mods.gameserver.model.item.DropCategory
// File: ext\mods\gameserver\model\item\DropCategory.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/item/DropCategory.class
  Last modified 9 de jul de 2026; size 9731 bytes
  MD5 checksum c8bffb945548c745924e3bb7f9d812ad
  Compiled from "DropCategory.java"
public class ext.mods.gameserver.model.item.DropCategory
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/item/DropCategory
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 15, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/item/DropCategory._dropType:Lext/mods/gameserver/enums/DropType;
    #8 = Class              #10           // ext/mods/gameserver/model/item/DropCategory
    #9 = NameAndType        #11:#12       // _dropType:Lext/mods/gameserver/enums/DropType;
   #10 = Utf8               ext/mods/gameserver/model/item/DropCategory
   #11 = Utf8               _dropType
   #12 = Utf8               Lext/mods/gameserver/enums/DropType;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/item/DropCategory._chance:D
   #14 = NameAndType        #15:#16       // _chance:D
   #15 = Utf8               _chance
   #16 = Utf8               D
   #17 = Class              #18           // java/util/ArrayList
   #18 = Utf8               java/util/ArrayList
   #19 = Methodref          #17.#20       // java/util/ArrayList."<init>":(I)V
   #20 = NameAndType        #5:#21        // "<init>":(I)V
   #21 = Utf8               (I)V
   #22 = Fieldref           #8.#23        // ext/mods/gameserver/model/item/DropCategory._drops:Ljava/util/List;
   #23 = NameAndType        #24:#25       // _drops:Ljava/util/List;
   #24 = Utf8               _drops
   #25 = Utf8               Ljava/util/List;
   #26 = Fieldref           #8.#27        // ext/mods/gameserver/model/item/DropCategory._cumulativeChance:D
   #27 = NameAndType        #28:#16       // _cumulativeChance:D
   #28 = Utf8               _cumulativeChance
   #29 = InterfaceMethodref #30.#31       // java/util/List.add:(Ljava/lang/Object;)Z
   #30 = Class              #32           // java/util/List
   #31 = NameAndType        #33:#34       // add:(Ljava/lang/Object;)Z
   #32 = Utf8               java/util/List
   #33 = Utf8               add
   #34 = Utf8               (Ljava/lang/Object;)Z
   #35 = Methodref          #36.#37       // ext/mods/gameserver/model/item/DropData.getChance:()D
   #36 = Class              #38           // ext/mods/gameserver/model/item/DropData
   #37 = NameAndType        #39:#40       // getChance:()D
   #38 = Utf8               ext/mods/gameserver/model/item/DropData
   #39 = Utf8               getChance
   #40 = Utf8               ()D
   #41 = Fieldref           #42.#43       // ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
   #42 = Class              #44           // ext/mods/gameserver/enums/DropType
   #43 = NameAndType        #45:#12       // SPOIL:Lext/mods/gameserver/enums/DropType;
   #44 = Utf8               ext/mods/gameserver/enums/DropType
   #45 = Utf8               SPOIL
   #46 = Double             100.0d
   #48 = Fieldref           #8.#49        // ext/mods/gameserver/model/item/DropCategory.threadLocalDropArray:Ljava/lang/ThreadLocal;
   #49 = NameAndType        #50:#51       // threadLocalDropArray:Ljava/lang/ThreadLocal;
   #50 = Utf8               threadLocalDropArray
   #51 = Utf8               Ljava/lang/ThreadLocal;
   #52 = Methodref          #53.#54       // java/lang/ThreadLocal.get:()Ljava/lang/Object;
   #53 = Class              #55           // java/lang/ThreadLocal
   #54 = NameAndType        #56:#57       // get:()Ljava/lang/Object;
   #55 = Utf8               java/lang/ThreadLocal
   #56 = Utf8               get
   #57 = Utf8               ()Ljava/lang/Object;
   #58 = Class              #59           // "[Lext/mods/gameserver/model/item/DropData;"
   #59 = Utf8               [Lext/mods/gameserver/model/item/DropData;
   #60 = Methodref          #61.#62       // java/util/Arrays.fill:([Ljava/lang/Object;Ljava/lang/Object;)V
   #61 = Class              #63           // java/util/Arrays
   #62 = NameAndType        #64:#65       // fill:([Ljava/lang/Object;Ljava/lang/Object;)V
   #63 = Utf8               java/util/Arrays
   #64 = Utf8               fill
   #65 = Utf8               ([Ljava/lang/Object;Ljava/lang/Object;)V
   #66 = InterfaceMethodref #30.#67       // java/util/List.size:()I
   #67 = NameAndType        #68:#69       // size:()I
   #68 = Utf8               size
   #69 = Utf8               ()I
   #70 = InterfaceMethodref #30.#71       // java/util/List.get:(I)Ljava/lang/Object;
   #71 = NameAndType        #56:#72       // get:(I)Ljava/lang/Object;
   #72 = Utf8               (I)Ljava/lang/Object;
   #73 = Methodref          #61.#74       // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
   #74 = NameAndType        #75:#76       // asList:([Ljava/lang/Object;)Ljava/util/List;
   #75 = Utf8               asList
   #76 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
   #77 = Methodref          #78.#79       // java/util/Collections.shuffle:(Ljava/util/List;)V
   #78 = Class              #80           // java/util/Collections
   #79 = NameAndType        #81:#82       // shuffle:(Ljava/util/List;)V
   #80 = Utf8               java/util/Collections
   #81 = Utf8               shuffle
   #82 = Utf8               (Ljava/util/List;)V
   #83 = Methodref          #8.#84        // ext/mods/gameserver/model/item/DropCategory.trim:([Ljava/lang/Object;)V
   #84 = NameAndType        #85:#86       // trim:([Ljava/lang/Object;)V
   #85 = Utf8               trim
   #86 = Utf8               ([Ljava/lang/Object;)V
   #87 = Methodref          #8.#88        // ext/mods/gameserver/model/item/DropCategory.shuffleDropList:()[Lext/mods/gameserver/model/item/DropData;
   #88 = NameAndType        #89:#90       // shuffleDropList:()[Lext/mods/gameserver/model/item/DropData;
   #89 = Utf8               shuffleDropList
   #90 = Utf8               ()[Lext/mods/gameserver/model/item/DropData;
   #91 = Methodref          #92.#93       // ext/mods/gameserver/data/DropCalc.getInstance:()Lext/mods/gameserver/data/DropCalc;
   #92 = Class              #94           // ext/mods/gameserver/data/DropCalc
   #93 = NameAndType        #95:#96       // getInstance:()Lext/mods/gameserver/data/DropCalc;
   #94 = Utf8               ext/mods/gameserver/data/DropCalc
   #95 = Utf8               getInstance
   #96 = Utf8               ()Lext/mods/gameserver/data/DropCalc;
   #97 = Methodref          #8.#98        // ext/mods/gameserver/model/item/DropCategory.getDropType:()Lext/mods/gameserver/enums/DropType;
   #98 = NameAndType        #99:#100      // getDropType:()Lext/mods/gameserver/enums/DropType;
   #99 = Utf8               getDropType
  #100 = Utf8               ()Lext/mods/gameserver/enums/DropType;
  #101 = Class              #102          // ext/mods/gameserver/model/actor/instance/GrandBoss
  #102 = Utf8               ext/mods/gameserver/model/actor/instance/GrandBoss
  #103 = Methodref          #92.#104      // ext/mods/gameserver/data/DropCalc.calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropCategory;Lext/mods/gameserver/enums/DropType;ZZ)D
  #104 = NameAndType        #105:#106     // calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropCategory;Lext/mods/gameserver/enums/DropType;ZZ)D
  #105 = Utf8               calcDropChance
  #106 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropCategory;Lext/mods/gameserver/enums/DropType;ZZ)D
  #107 = Methodref          #92.#108      // ext/mods/gameserver/data/DropCalc.dice:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)Z
  #108 = NameAndType        #109:#110     // dice:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)Z
  #109 = Utf8               dice
  #110 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)Z
  #111 = Fieldref           #112.#113     // ext/mods/Config.ALTERNATE_DROP_LIST:Z
  #112 = Class              #114          // ext/mods/Config
  #113 = NameAndType        #115:#116     // ALTERNATE_DROP_LIST:Z
  #114 = Utf8               ext/mods/Config
  #115 = Utf8               ALTERNATE_DROP_LIST
  #116 = Utf8               Z
  #117 = Methodref          #8.#118       // ext/mods/gameserver/model/item/DropCategory.calcDropItem:(Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;Z)Z
  #118 = NameAndType        #119:#120     // calcDropItem:(Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;Z)Z
  #119 = Utf8               calcDropItem
  #120 = Utf8               (Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;Z)Z
  #121 = InterfaceMethodref #30.#122      // java/util/List.iterator:()Ljava/util/Iterator;
  #122 = NameAndType        #123:#124     // iterator:()Ljava/util/Iterator;
  #123 = Utf8               iterator
  #124 = Utf8               ()Ljava/util/Iterator;
  #125 = InterfaceMethodref #126.#127     // java/util/Iterator.hasNext:()Z
  #126 = Class              #128          // java/util/Iterator
  #127 = NameAndType        #129:#130     // hasNext:()Z
  #128 = Utf8               java/util/Iterator
  #129 = Utf8               hasNext
  #130 = Utf8               ()Z
  #131 = InterfaceMethodref #126.#132     // java/util/Iterator.next:()Ljava/lang/Object;
  #132 = NameAndType        #133:#57      // next:()Ljava/lang/Object;
  #133 = Utf8               next
  #134 = Methodref          #92.#135      // ext/mods/gameserver/data/DropCalc.calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
  #135 = NameAndType        #105:#136     // calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
  #136 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
  #137 = Methodref          #92.#138      // ext/mods/gameserver/data/DropCalc.dice:(D)Z
  #138 = NameAndType        #109:#139     // dice:(D)Z
  #139 = Utf8               (D)Z
  #140 = Methodref          #8.#37        // ext/mods/gameserver/model/item/DropCategory.getChance:()D
  #141 = Methodref          #92.#142      // ext/mods/gameserver/data/DropCalc.calcItemDropCount:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)I
  #142 = NameAndType        #143:#144     // calcItemDropCount:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)I
  #143 = Utf8               calcItemDropCount
  #144 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)I
  #145 = InterfaceMethodref #30.#146      // java/util/List.stream:()Ljava/util/stream/Stream;
  #146 = NameAndType        #147:#148     // stream:()Ljava/util/stream/Stream;
  #147 = Utf8               stream
  #148 = Utf8               ()Ljava/util/stream/Stream;
  #149 = InvokeDynamic      #0:#150       // #0:test:(Lext/mods/gameserver/model/item/DropData;)Ljava/util/function/Predicate;
  #150 = NameAndType        #151:#152     // test:(Lext/mods/gameserver/model/item/DropData;)Ljava/util/function/Predicate;
  #151 = Utf8               test
  #152 = Utf8               (Lext/mods/gameserver/model/item/DropData;)Ljava/util/function/Predicate;
  #153 = InterfaceMethodref #154.#155     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #154 = Class              #156          // java/util/stream/Stream
  #155 = NameAndType        #157:#158     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #156 = Utf8               java/util/stream/Stream
  #157 = Utf8               filter
  #158 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #159 = InterfaceMethodref #154.#160     // java/util/stream/Stream.findAny:()Ljava/util/Optional;
  #160 = NameAndType        #161:#162     // findAny:()Ljava/util/Optional;
  #161 = Utf8               findAny
  #162 = Utf8               ()Ljava/util/Optional;
  #163 = Methodref          #164.#165     // java/util/Optional.isEmpty:()Z
  #164 = Class              #166          // java/util/Optional
  #165 = NameAndType        #167:#130     // isEmpty:()Z
  #166 = Utf8               java/util/Optional
  #167 = Utf8               isEmpty
  #168 = Class              #169          // ext/mods/gameserver/model/holder/IntIntHolder
  #169 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #170 = Methodref          #36.#171      // ext/mods/gameserver/model/item/DropData.getItemId:()I
  #171 = NameAndType        #172:#69      // getItemId:()I
  #172 = Utf8               getItemId
  #173 = Methodref          #168.#174     // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
  #174 = NameAndType        #5:#175       // "<init>":(II)V
  #175 = Utf8               (II)V
  #176 = InvokeDynamic      #1:#177       // #1:accept:([I)Ljava/util/function/Consumer;
  #177 = NameAndType        #178:#179     // accept:([I)Ljava/util/function/Consumer;
  #178 = Utf8               accept
  #179 = Utf8               ([I)Ljava/util/function/Consumer;
  #180 = Methodref          #164.#181     // java/util/Optional.ifPresent:(Ljava/util/function/Consumer;)V
  #181 = NameAndType        #182:#183     // ifPresent:(Ljava/util/function/Consumer;)V
  #182 = Utf8               ifPresent
  #183 = Utf8               (Ljava/util/function/Consumer;)V
  #184 = Methodref          #42.#185      // ext/mods/gameserver/enums/DropType.getDropRate:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
  #185 = NameAndType        #186:#187     // getDropRate:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
  #186 = Utf8               getDropRate
  #187 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
  #188 = Double             1000000.0d
  #190 = Methodref          #191.#192     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #191 = Class              #193          // ext/mods/gameserver/model/actor/Player
  #192 = NameAndType        #194:#195     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #193 = Utf8               ext/mods/gameserver/model/actor/Player
  #194 = Utf8               getStatus
  #195 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #196 = Fieldref           #197.#198     // ext/mods/gameserver/enums/skills/Stats.SPOIL_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #197 = Class              #199          // ext/mods/gameserver/enums/skills/Stats
  #198 = NameAndType        #200:#201     // SPOIL_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #199 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #200 = Utf8               SPOIL_RATE
  #201 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #202 = Methodref          #203.#204     // ext/mods/gameserver/model/actor/status/PlayerStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #203 = Class              #205          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #204 = NameAndType        #206:#207     // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #205 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #206 = Utf8               calcStat
  #207 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #208 = Fieldref           #42.#209      // ext/mods/gameserver/enums/DropType.DROP:Lext/mods/gameserver/enums/DropType;
  #209 = NameAndType        #210:#12      // DROP:Lext/mods/gameserver/enums/DropType;
  #210 = Utf8               DROP
  #211 = Fieldref           #197.#212     // ext/mods/gameserver/enums/skills/Stats.DROP_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #212 = NameAndType        #213:#201     // DROP_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #213 = Utf8               DROP_RATE
  #214 = Fieldref           #42.#215      // ext/mods/gameserver/enums/DropType.CURRENCY:Lext/mods/gameserver/enums/DropType;
  #215 = NameAndType        #216:#12      // CURRENCY:Lext/mods/gameserver/enums/DropType;
  #216 = Utf8               CURRENCY
  #217 = Fieldref           #197.#218     // ext/mods/gameserver/enums/skills/Stats.CURRENCY_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #218 = NameAndType        #219:#201     // CURRENCY_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #219 = Utf8               CURRENCY_RATE
  #220 = Integer            1000000
  #221 = Methodref          #222.#223     // ext/mods/commons/random/Rnd.get:(I)I
  #222 = Class              #224          // ext/mods/commons/random/Rnd
  #223 = NameAndType        #56:#225      // get:(I)I
  #224 = Utf8               ext/mods/commons/random/Rnd
  #225 = Utf8               (I)I
  #226 = Methodref          #78.#227      // java/util/Collections.emptyList:()Ljava/util/List;
  #227 = NameAndType        #228:#229     // emptyList:()Ljava/util/List;
  #228 = Utf8               emptyList
  #229 = Utf8               ()Ljava/util/List;
  #230 = Methodref          #8.#231       // ext/mods/gameserver/model/item/DropCategory.getAllDrops:()Ljava/util/List;
  #231 = NameAndType        #232:#229     // getAllDrops:()Ljava/util/List;
  #232 = Utf8               getAllDrops
  #233 = Methodref          #36.#234      // ext/mods/gameserver/model/item/DropData.calculateDrop:(D)Lext/mods/gameserver/model/holder/IntIntHolder;
  #234 = NameAndType        #235:#236     // calculateDrop:(D)Lext/mods/gameserver/model/holder/IntIntHolder;
  #235 = Utf8               calculateDrop
  #236 = Utf8               (D)Lext/mods/gameserver/model/holder/IntIntHolder;
  #237 = Methodref          #8.#238       // ext/mods/gameserver/model/item/DropCategory.getCategoryCumulativeChance:()D
  #238 = NameAndType        #239:#40      // getCategoryCumulativeChance:()D
  #239 = Utf8               getCategoryCumulativeChance
  #240 = Methodref          #168.#241     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #241 = NameAndType        #242:#69      // getValue:()I
  #242 = Utf8               getValue
  #243 = Methodref          #168.#244     // ext/mods/gameserver/model/holder/IntIntHolder.setValue:(I)V
  #244 = NameAndType        #245:#21      // setValue:(I)V
  #245 = Utf8               setValue
  #246 = Methodref          #168.#247     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #247 = NameAndType        #248:#69      // getId:()I
  #248 = Utf8               getId
  #249 = InvokeDynamic      #2:#250       // #2:get:()Ljava/util/function/Supplier;
  #250 = NameAndType        #56:#251      // get:()Ljava/util/function/Supplier;
  #251 = Utf8               ()Ljava/util/function/Supplier;
  #252 = Methodref          #53.#253      // java/lang/ThreadLocal.withInitial:(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;
  #253 = NameAndType        #254:#255     // withInitial:(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;
  #254 = Utf8               withInitial
  #255 = Utf8               (Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;
  #256 = Utf8               Signature
  #257 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/DropData;>;
  #258 = Utf8               Ljava/lang/ThreadLocal<[Lext/mods/gameserver/model/item/DropData;>;
  #259 = Utf8               (Lext/mods/gameserver/enums/DropType;D)V
  #260 = Utf8               Code
  #261 = Utf8               LineNumberTable
  #262 = Utf8               LocalVariableTable
  #263 = Utf8               this
  #264 = Utf8               Lext/mods/gameserver/model/item/DropCategory;
  #265 = Utf8               dropType
  #266 = Utf8               chance
  #267 = Utf8               addDropData
  #268 = Utf8               (Lext/mods/gameserver/model/item/DropData;)V
  #269 = Utf8               drop
  #270 = Utf8               Lext/mods/gameserver/model/item/DropData;
  #271 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/item/DropData;>;
  #272 = Utf8               StackMapTable
  #273 = Utf8               i
  #274 = Utf8               I
  #275 = Utf8               arr
  #276 = Utf8               n
  #277 = Utf8               [Ljava/lang/Object;
  #278 = Utf8               calcDropList
  #279 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;Z)Ljava/util/List;
  #280 = Utf8               item
  #281 = Utf8               player
  #282 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #283 = Utf8               monster
  #284 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #285 = Utf8               out
  #286 = Utf8               raid
  #287 = Utf8               list
  #288 = Utf8               LocalVariableTypeTable
  #289 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #290 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;Z)Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #291 = Utf8               holder
  #292 = Utf8               Ljava/util/Optional;
  #293 = Utf8               itemChance
  #294 = Utf8               itemCount
  #295 = Utf8               [I
  #296 = Utf8               Ljava/util/Optional<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #297 = Class              #295          // "[I"
  #298 = Utf8               (Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;Z)Z
  #299 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DZ)Ljava/util/List;
  #300 = Utf8               multiplier
  #301 = Utf8               dd
  #302 = Utf8               amount
  #303 = Utf8               levelMultiplier
  #304 = Utf8               result
  #305 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DZ)Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #306 = Utf8               lambda$calcDropItem$1
  #307 = Utf8               ([ILext/mods/gameserver/model/holder/IntIntHolder;)V
  #308 = Utf8               h
  #309 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #310 = Utf8               lambda$calcDropItem$0
  #311 = Utf8               (Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/holder/IntIntHolder;)Z
  #312 = Utf8               lambda$static$0
  #313 = Utf8               <clinit>
  #314 = Utf8               SourceFile
  #315 = Utf8               DropCategory.java
  #316 = Utf8               BootstrapMethods
  #317 = MethodType         #34           //  (Ljava/lang/Object;)Z
  #318 = MethodHandle       6:#319        // REF_invokeStatic ext/mods/gameserver/model/item/DropCategory.lambda$calcDropItem$0:(Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/holder/IntIntHolder;)Z
  #319 = Methodref          #8.#320       // ext/mods/gameserver/model/item/DropCategory.lambda$calcDropItem$0:(Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/holder/IntIntHolder;)Z
  #320 = NameAndType        #310:#311     // lambda$calcDropItem$0:(Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/holder/IntIntHolder;)Z
  #321 = MethodType         #322          //  (Lext/mods/gameserver/model/holder/IntIntHolder;)Z
  #322 = Utf8               (Lext/mods/gameserver/model/holder/IntIntHolder;)Z
  #323 = MethodType         #324          //  (Ljava/lang/Object;)V
  #324 = Utf8               (Ljava/lang/Object;)V
  #325 = MethodHandle       6:#326        // REF_invokeStatic ext/mods/gameserver/model/item/DropCategory.lambda$calcDropItem$1:([ILext/mods/gameserver/model/holder/IntIntHolder;)V
  #326 = Methodref          #8.#327       // ext/mods/gameserver/model/item/DropCategory.lambda$calcDropItem$1:([ILext/mods/gameserver/model/holder/IntIntHolder;)V
  #327 = NameAndType        #306:#307     // lambda$calcDropItem$1:([ILext/mods/gameserver/model/holder/IntIntHolder;)V
  #328 = MethodType         #329          //  (Lext/mods/gameserver/model/holder/IntIntHolder;)V
  #329 = Utf8               (Lext/mods/gameserver/model/holder/IntIntHolder;)V
  #330 = MethodType         #57           //  ()Ljava/lang/Object;
  #331 = MethodHandle       6:#332        // REF_invokeStatic ext/mods/gameserver/model/item/DropCategory.lambda$static$0:()[Lext/mods/gameserver/model/item/DropData;
  #332 = Methodref          #8.#333       // ext/mods/gameserver/model/item/DropCategory.lambda$static$0:()[Lext/mods/gameserver/model/item/DropData;
  #333 = NameAndType        #312:#90      // lambda$static$0:()[Lext/mods/gameserver/model/item/DropData;
  #334 = MethodType         #90           //  ()[Lext/mods/gameserver/model/item/DropData;
  #335 = MethodHandle       6:#336        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #336 = Methodref          #337.#338     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #337 = Class              #339          // java/lang/invoke/LambdaMetafactory
  #338 = NameAndType        #340:#341     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #339 = Utf8               java/lang/invoke/LambdaMetafactory
  #340 = Utf8               metafactory
  #341 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #342 = Utf8               InnerClasses
  #343 = Class              #344          // java/lang/invoke/MethodHandles$Lookup
  #344 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #345 = Class              #346          // java/lang/invoke/MethodHandles
  #346 = Utf8               java/lang/invoke/MethodHandles
  #347 = Utf8               Lookup
{
  static final java.lang.ThreadLocal<ext.mods.gameserver.model.item.DropData[]> threadLocalDropArray;
    descriptor: Ljava/lang/ThreadLocal;
    flags: (0x0018) ACC_STATIC, ACC_FINAL
    Signature: #258                         // Ljava/lang/ThreadLocal<[Lext/mods/gameserver/model/item/DropData;>;

  public ext.mods.gameserver.model.item.DropCategory(ext.mods.gameserver.enums.DropType, double);
    descriptor: (Lext/mods/gameserver/enums/DropType;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _dropType:Lext/mods/gameserver/enums/DropType;
         9: aload_0
        10: dload_2
        11: putfield      #13                 // Field _chance:D
        14: aload_0
        15: new           #17                 // class java/util/ArrayList
        18: dup
        19: iconst_0
        20: invokespecial #19                 // Method java/util/ArrayList."<init>":(I)V
        23: putfield      #22                 // Field _drops:Ljava/util/List;
        26: aload_0
        27: dconst_0
        28: putfield      #26                 // Field _cumulativeChance:D
        31: return
      LineNumberTable:
        line 46: 0
        line 47: 4
        line 48: 9
        line 49: 14
        line 51: 26
        line 52: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/item/DropCategory;
            0      32     1 dropType   Lext/mods/gameserver/enums/DropType;
            0      32     2 chance   D

  public void addDropData(ext.mods.gameserver.model.item.DropData);
    descriptor: (Lext/mods/gameserver/model/item/DropData;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: getfield      #22                 // Field _drops:Ljava/util/List;
         4: aload_1
         5: invokeinterface #29,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: aload_0
        12: dup
        13: getfield      #26                 // Field _cumulativeChance:D
        16: aload_1
        17: invokevirtual #35                 // Method ext/mods/gameserver/model/item/DropData.getChance:()D
        20: dadd
        21: putfield      #26                 // Field _cumulativeChance:D
        24: return
      LineNumberTable:
        line 60: 0
        line 62: 11
        line 63: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/item/DropCategory;
            0      25     1  drop   Lext/mods/gameserver/model/item/DropData;

  public ext.mods.gameserver.enums.DropType getDropType();
    descriptor: ()Lext/mods/gameserver/enums/DropType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _dropType:Lext/mods/gameserver/enums/DropType;
         4: areturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/DropCategory;

  public double getChance();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _chance:D
         4: dreturn
      LineNumberTable:
        line 78: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/DropCategory;

  public java.util.List<ext.mods.gameserver.model.item.DropData> getAllDrops();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _drops:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 86: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/DropCategory;
    Signature: #271                         // ()Ljava/util/List<Lext/mods/gameserver/model/item/DropData;>;

  public double getCategoryCumulativeChance();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _dropType:Lext/mods/gameserver/enums/DropType;
         4: getstatic     #41                 // Field ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
         7: if_acmpne     16
        10: ldc2_w        #46                 // double 100.0d
        13: goto          20
        16: aload_0
        17: getfield      #26                 // Field _cumulativeChance:D
        20: dreturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/item/DropCategory;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ double ]

  public ext.mods.gameserver.model.item.DropData[] shuffleDropList();
    descriptor: ()[Lext/mods/gameserver/model/item/DropData;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: getstatic     #48                 // Field threadLocalDropArray:Ljava/lang/ThreadLocal;
         3: invokevirtual #52                 // Method java/lang/ThreadLocal.get:()Ljava/lang/Object;
         6: checkcast     #58                 // class "[Lext/mods/gameserver/model/item/DropData;"
         9: astore_1
        10: aload_1
        11: aconst_null
        12: invokestatic  #60                 // Method java/util/Arrays.fill:([Ljava/lang/Object;Ljava/lang/Object;)V
        15: iconst_0
        16: istore_2
        17: iload_2
        18: aload_0
        19: getfield      #22                 // Field _drops:Ljava/util/List;
        22: invokeinterface #66,  1           // InterfaceMethod java/util/List.size:()I
        27: if_icmpge     52
        30: aload_1
        31: iload_2
        32: aload_0
        33: getfield      #22                 // Field _drops:Ljava/util/List;
        36: iload_2
        37: invokeinterface #70,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        42: checkcast     #36                 // class ext/mods/gameserver/model/item/DropData
        45: aastore
        46: iinc          2, 1
        49: goto          17
        52: aload_1
        53: invokestatic  #73                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        56: invokestatic  #77                 // Method java/util/Collections.shuffle:(Ljava/util/List;)V
        59: aload_1
        60: invokestatic  #83                 // Method trim:([Ljava/lang/Object;)V
        63: aload_1
        64: areturn
      LineNumberTable:
        line 98: 0
        line 99: 10
        line 100: 15
        line 101: 30
        line 100: 46
        line 103: 52
        line 104: 59
        line 105: 63
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17      35     2     i   I
            0      65     0  this   Lext/mods/gameserver/model/item/DropCategory;
           10      55     1   arr   [Lext/mods/gameserver/model/item/DropData;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ class "[Lext/mods/gameserver/model/item/DropData;", int ]
        frame_type = 250 /* chop */
          offset_delta = 34

  public static void trim(java.lang.Object[]);
    descriptor: ([Ljava/lang/Object;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=3, args_size=1
         0: iconst_0
         1: istore_1
         2: iload_1
         3: aload_0
         4: arraylength
         5: if_icmpge     55
         8: aload_0
         9: iload_1
        10: aaload
        11: ifnonnull     49
        14: iload_1
        15: iconst_1
        16: iadd
        17: istore_2
        18: iload_2
        19: aload_0
        20: arraylength
        21: if_icmpge     49
        24: aload_0
        25: iload_2
        26: aaload
        27: ifnull        43
        30: aload_0
        31: iload_1
        32: aload_0
        33: iload_2
        34: aaload
        35: aastore
        36: aload_0
        37: iload_2
        38: aconst_null
        39: aastore
        40: goto          49
        43: iinc          2, 1
        46: goto          18
        49: iinc          1, 1
        52: goto          2
        55: return
      LineNumberTable:
        line 110: 0
        line 112: 8
        line 114: 14
        line 116: 24
        line 118: 30
        line 119: 36
        line 120: 40
        line 114: 43
        line 110: 49
        line 125: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18      31     2     n   I
            2      53     1     i   I
            0      56     0   arr   [Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ int ]
        frame_type = 24 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 5

  public java.util.List<ext.mods.gameserver.model.holder.IntIntHolder> calcDropList(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.instance.Monster, java.util.List<ext.mods.gameserver.model.holder.IntIntHolder>, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;Z)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=8, args_size=5
         0: aload_0
         1: invokevirtual #87                 // Method shuffleDropList:()[Lext/mods/gameserver/model/item/DropData;
         4: astore        5
         6: invokestatic  #91                 // Method ext/mods/gameserver/data/DropCalc.getInstance:()Lext/mods/gameserver/data/DropCalc;
         9: aload_1
        10: aload_2
        11: invokestatic  #91                 // Method ext/mods/gameserver/data/DropCalc.getInstance:()Lext/mods/gameserver/data/DropCalc;
        14: aload_1
        15: aload_2
        16: aload_0
        17: aload_0
        18: invokevirtual #97                 // Method getDropType:()Lext/mods/gameserver/enums/DropType;
        21: iload         4
        23: aload_2
        24: instanceof    #101                // class ext/mods/gameserver/model/actor/instance/GrandBoss
        27: invokevirtual #103                // Method ext/mods/gameserver/data/DropCalc.calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropCategory;Lext/mods/gameserver/enums/DropType;ZZ)D
        30: invokevirtual #107                // Method ext/mods/gameserver/data/DropCalc.dice:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)Z
        33: ifeq          150
        36: getstatic     #111                // Field ext/mods/Config.ALTERNATE_DROP_LIST:Z
        39: ifeq          97
        42: iconst_0
        43: istore        6
        45: iload         6
        47: aload_0
        48: getfield      #22                 // Field _drops:Ljava/util/List;
        51: invokeinterface #66,  1           // InterfaceMethod java/util/List.size:()I
        56: if_icmpge     94
        59: aload         5
        61: iload         6
        63: aaload
        64: astore        7
        66: aload         7
        68: ifnull        88
        71: aload_0
        72: aload         7
        74: aload_1
        75: aload_2
        76: aload_3
        77: iload         4
        79: invokevirtual #117                // Method calcDropItem:(Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;Z)Z
        82: ifeq          88
        85: goto          88
        88: iinc          6, 1
        91: goto          45
        94: goto          150
        97: aload_0
        98: getfield      #22                 // Field _drops:Ljava/util/List;
       101: invokeinterface #121,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       106: astore        6
       108: aload         6
       110: invokeinterface #125,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       115: ifeq          150
       118: aload         6
       120: invokeinterface #131,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       125: checkcast     #36                 // class ext/mods/gameserver/model/item/DropData
       128: astore        7
       130: aload_0
       131: aload         7
       133: aload_1
       134: aload_2
       135: aload_3
       136: iload         4
       138: invokevirtual #117                // Method calcDropItem:(Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;Z)Z
       141: ifeq          147
       144: goto          150
       147: goto          108
       150: aload_3
       151: areturn
      LineNumberTable:
        line 129: 0
        line 130: 6
        line 132: 36
        line 134: 42
        line 136: 59
        line 137: 66
        line 139: 71
        line 140: 85
        line 134: 88
        line 146: 97
        line 148: 130
        line 149: 144
        line 150: 147
        line 154: 150
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           66      22     7  item   Lext/mods/gameserver/model/item/DropData;
           45      49     6     i   I
          130      17     7  item   Lext/mods/gameserver/model/item/DropData;
            0     152     0  this   Lext/mods/gameserver/model/item/DropCategory;
            0     152     1 player   Lext/mods/gameserver/model/actor/Player;
            0     152     2 monster   Lext/mods/gameserver/model/actor/instance/Monster;
            0     152     3   out   Ljava/util/List;
            0     152     4  raid   Z
            6     146     5  list   [Lext/mods/gameserver/model/item/DropData;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     152     3   out   Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
      StackMapTable: number_of_entries = 7
        frame_type = 253 /* append */
          offset_delta = 45
          locals = [ class "[Lext/mods/gameserver/model/item/DropData;", int ]
        frame_type = 42 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 38 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #290                         // (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;Z)Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;

  public boolean calcDropItem(ext.mods.gameserver.model.item.DropData, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.instance.Monster, java.util.List<ext.mods.gameserver.model.holder.IntIntHolder>, boolean);
    descriptor: (Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=11, locals=10, args_size=6
         0: invokestatic  #91                 // Method ext/mods/gameserver/data/DropCalc.getInstance:()Lext/mods/gameserver/data/DropCalc;
         3: aload_2
         4: aload_3
         5: aload_1
         6: aload_0
         7: invokevirtual #97                 // Method getDropType:()Lext/mods/gameserver/enums/DropType;
        10: iload         5
        12: aload_3
        13: instanceof    #101                // class ext/mods/gameserver/model/actor/instance/GrandBoss
        16: invokevirtual #134                // Method ext/mods/gameserver/data/DropCalc.calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
        19: dstore        6
        21: iconst_1
        22: newarray       int
        24: dup
        25: iconst_0
        26: iconst_0
        27: iastore
        28: astore        8
        30: invokestatic  #91                 // Method ext/mods/gameserver/data/DropCalc.getInstance:()Lext/mods/gameserver/data/DropCalc;
        33: dload         6
        35: invokevirtual #137                // Method ext/mods/gameserver/data/DropCalc.dice:(D)Z
        38: ifeq          68
        41: aload         8
        43: iconst_0
        44: invokestatic  #91                 // Method ext/mods/gameserver/data/DropCalc.getInstance:()Lext/mods/gameserver/data/DropCalc;
        47: aload_2
        48: aload_3
        49: aload_0
        50: invokevirtual #140                // Method getChance:()D
        53: aload_1
        54: aload_0
        55: invokevirtual #97                 // Method getDropType:()Lext/mods/gameserver/enums/DropType;
        58: iload         5
        60: aload_3
        61: instanceof    #101                // class ext/mods/gameserver/model/actor/instance/GrandBoss
        64: invokevirtual #141                // Method ext/mods/gameserver/data/DropCalc.calcItemDropCount:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)I
        67: iastore
        68: aload         8
        70: iconst_0
        71: iaload
        72: ifle          148
        75: aload         4
        77: invokeinterface #145,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        82: aload_1
        83: invokedynamic #149,  0            // InvokeDynamic #0:test:(Lext/mods/gameserver/model/item/DropData;)Ljava/util/function/Predicate;
        88: invokeinterface #153,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        93: invokeinterface #159,  1          // InterfaceMethod java/util/stream/Stream.findAny:()Ljava/util/Optional;
        98: astore        9
       100: aload         9
       102: invokevirtual #163                // Method java/util/Optional.isEmpty:()Z
       105: ifeq          134
       108: aload         4
       110: new           #168                // class ext/mods/gameserver/model/holder/IntIntHolder
       113: dup
       114: aload_1
       115: invokevirtual #170                // Method ext/mods/gameserver/model/item/DropData.getItemId:()I
       118: aload         8
       120: iconst_0
       121: iaload
       122: invokespecial #173                // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
       125: invokeinterface #29,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       130: pop
       131: goto          146
       134: aload         9
       136: aload         8
       138: invokedynamic #176,  0            // InvokeDynamic #1:accept:([I)Ljava/util/function/Consumer;
       143: invokevirtual #180                // Method java/util/Optional.ifPresent:(Ljava/util/function/Consumer;)V
       146: iconst_1
       147: ireturn
       148: iconst_0
       149: ireturn
      LineNumberTable:
        line 159: 0
        line 160: 21
        line 165: 30
        line 166: 41
        line 168: 68
        line 170: 75
        line 171: 100
        line 172: 108
        line 174: 134
        line 175: 146
        line 178: 148
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          100      48     9 holder   Ljava/util/Optional;
            0     150     0  this   Lext/mods/gameserver/model/item/DropCategory;
            0     150     1  item   Lext/mods/gameserver/model/item/DropData;
            0     150     2 player   Lext/mods/gameserver/model/actor/Player;
            0     150     3 monster   Lext/mods/gameserver/model/actor/instance/Monster;
            0     150     4   out   Ljava/util/List;
            0     150     5  raid   Z
           21     129     6 itemChance   D
           30     120     8 itemCount   [I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          100      48     9 holder   Ljava/util/Optional<Lext/mods/gameserver/model/holder/IntIntHolder;>;
            0     150     4   out   Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 68
          locals = [ double, class "[I" ]
        frame_type = 252 /* append */
          offset_delta = 65
          locals = [ class java/util/Optional ]
        frame_type = 11 /* same */
        frame_type = 250 /* chop */
          offset_delta = 1
    Signature: #298                         // (Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;Z)Z

  public java.util.List<ext.mods.gameserver.model.holder.IntIntHolder> calculateDrop(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.instance.Monster, double, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DZ)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=15, args_size=5
         0: aload_0
         1: invokevirtual #140                // Method getChance:()D
         4: dload_3
         5: dmul
         6: aload_0
         7: invokevirtual #97                 // Method getDropType:()Lext/mods/gameserver/enums/DropType;
        10: aload_1
        11: aload_2
        12: iload         5
        14: aload_2
        15: instanceof    #101                // class ext/mods/gameserver/model/actor/instance/GrandBoss
        18: invokevirtual #184                // Method ext/mods/gameserver/enums/DropType.getDropRate:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
        21: dmul
        22: ldc2_w        #188                // double 1000000.0d
        25: dmul
        26: ldc2_w        #46                 // double 100.0d
        29: ddiv
        30: dstore        6
        32: aload_0
        33: getfield      #7                  // Field _dropType:Lext/mods/gameserver/enums/DropType;
        36: getstatic     #41                 // Field ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
        39: if_acmpne     68
        42: dload         6
        44: aload_1
        45: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        48: getstatic     #196                // Field ext/mods/gameserver/enums/skills/Stats.SPOIL_RATE:Lext/mods/gameserver/enums/skills/Stats;
        51: ldc2_w        #46                 // double 100.0d
        54: aconst_null
        55: aconst_null
        56: invokevirtual #202                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        59: dmul
        60: ldc2_w        #46                 // double 100.0d
        63: ddiv
        64: d2i
        65: i2d
        66: dstore        6
        68: aload_0
        69: getfield      #7                  // Field _dropType:Lext/mods/gameserver/enums/DropType;
        72: getstatic     #208                // Field ext/mods/gameserver/enums/DropType.DROP:Lext/mods/gameserver/enums/DropType;
        75: if_acmpne     104
        78: dload         6
        80: aload_1
        81: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        84: getstatic     #211                // Field ext/mods/gameserver/enums/skills/Stats.DROP_RATE:Lext/mods/gameserver/enums/skills/Stats;
        87: ldc2_w        #46                 // double 100.0d
        90: aconst_null
        91: aconst_null
        92: invokevirtual #202                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        95: dmul
        96: ldc2_w        #46                 // double 100.0d
        99: ddiv
       100: d2i
       101: i2d
       102: dstore        6
       104: aload_0
       105: getfield      #7                  // Field _dropType:Lext/mods/gameserver/enums/DropType;
       108: getstatic     #214                // Field ext/mods/gameserver/enums/DropType.CURRENCY:Lext/mods/gameserver/enums/DropType;
       111: if_acmpne     140
       114: dload         6
       116: aload_1
       117: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       120: getstatic     #217                // Field ext/mods/gameserver/enums/skills/Stats.CURRENCY_RATE:Lext/mods/gameserver/enums/skills/Stats;
       123: ldc2_w        #46                 // double 100.0d
       126: aconst_null
       127: aconst_null
       128: invokevirtual #202                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       131: dmul
       132: ldc2_w        #46                 // double 100.0d
       135: ddiv
       136: d2i
       137: i2d
       138: dstore        6
       140: dload         6
       142: ldc2_w        #188                // double 1000000.0d
       145: dcmpg
       146: ifgt          171
       149: ldc           #220                // int 1000000
       151: invokestatic  #221                // Method ext/mods/commons/random/Rnd.get:(I)I
       154: i2d
       155: dload         6
       157: dcmpg
       158: ifge          167
       161: dconst_1
       162: dstore        8
       164: goto          179
       167: invokestatic  #226                // Method java/util/Collections.emptyList:()Ljava/util/List;
       170: areturn
       171: dload         6
       173: ldc2_w        #188                // double 1000000.0d
       176: ddiv
       177: dstore        8
       179: new           #17                 // class java/util/ArrayList
       182: dup
       183: iconst_1
       184: invokespecial #19                 // Method java/util/ArrayList."<init>":(I)V
       187: astore        10
       189: aload_0
       190: getfield      #7                  // Field _dropType:Lext/mods/gameserver/enums/DropType;
       193: getstatic     #41                 // Field ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
       196: if_acmpne     339
       199: aload_0
       200: invokevirtual #230                // Method getAllDrops:()Ljava/util/List;
       203: invokeinterface #121,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       208: astore        11
       210: aload         11
       212: invokeinterface #125,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       217: ifeq          336
       220: aload         11
       222: invokeinterface #131,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       227: checkcast     #36                 // class ext/mods/gameserver/model/item/DropData
       230: astore        12
       232: aload         12
       234: invokevirtual #35                 // Method ext/mods/gameserver/model/item/DropData.getChance:()D
       237: dload         8
       239: dmul
       240: ldc2_w        #188                // double 1000000.0d
       243: dmul
       244: ldc2_w        #46                 // double 100.0d
       247: ddiv
       248: dstore        6
       250: dload         6
       252: aload_1
       253: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       256: getstatic     #196                // Field ext/mods/gameserver/enums/skills/Stats.SPOIL_RATE:Lext/mods/gameserver/enums/skills/Stats;
       259: ldc2_w        #46                 // double 100.0d
       262: aconst_null
       263: aconst_null
       264: invokevirtual #202                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       267: dmul
       268: ldc2_w        #46                 // double 100.0d
       271: ddiv
       272: d2i
       273: i2d
       274: dstore        6
       276: dload         6
       278: ldc2_w        #188                // double 1000000.0d
       281: dcmpg
       282: ifgt          314
       285: ldc           #220                // int 1000000
       287: invokestatic  #221                // Method ext/mods/commons/random/Rnd.get:(I)I
       290: i2d
       291: dload         6
       293: dcmpg
       294: ifge          333
       297: aload         10
       299: aload         12
       301: dconst_1
       302: invokevirtual #233                // Method ext/mods/gameserver/model/item/DropData.calculateDrop:(D)Lext/mods/gameserver/model/holder/IntIntHolder;
       305: invokeinterface #29,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       310: pop
       311: goto          333
       314: aload         10
       316: aload         12
       318: dload         6
       320: ldc2_w        #188                // double 1000000.0d
       323: ddiv
       324: invokevirtual #233                // Method ext/mods/gameserver/model/item/DropData.calculateDrop:(D)Lext/mods/gameserver/model/holder/IntIntHolder;
       327: invokeinterface #29,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       332: pop
       333: goto          210
       336: goto          568
       339: aload_0
       340: invokevirtual #237                // Method getCategoryCumulativeChance:()D
       343: dload         8
       345: dmul
       346: ldc2_w        #188                // double 1000000.0d
       349: dmul
       350: ldc2_w        #46                 // double 100.0d
       353: ddiv
       354: dstore        6
       356: dload         6
       358: ldc2_w        #188                // double 1000000.0d
       361: dcmpg
       362: ifgt          457
       365: ldc           #220                // int 1000000
       367: invokestatic  #221                // Method ext/mods/commons/random/Rnd.get:(I)I
       370: i2d
       371: dstore        6
       373: aload_0
       374: invokevirtual #230                // Method getAllDrops:()Ljava/util/List;
       377: invokeinterface #121,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       382: astore        11
       384: aload         11
       386: invokeinterface #125,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       391: ifeq          454
       394: aload         11
       396: invokeinterface #131,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       401: checkcast     #36                 // class ext/mods/gameserver/model/item/DropData
       404: astore        12
       406: dload         6
       408: aload         12
       410: invokevirtual #35                 // Method ext/mods/gameserver/model/item/DropData.getChance:()D
       413: dload         8
       415: dmul
       416: ldc2_w        #188                // double 1000000.0d
       419: dmul
       420: ldc2_w        #46                 // double 100.0d
       423: ddiv
       424: dsub
       425: dstore        6
       427: dload         6
       429: dconst_0
       430: dcmpg
       431: ifge          451
       434: aload         10
       436: aload         12
       438: dconst_1
       439: invokevirtual #233                // Method ext/mods/gameserver/model/item/DropData.calculateDrop:(D)Lext/mods/gameserver/model/holder/IntIntHolder;
       442: invokeinterface #29,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       447: pop
       448: goto          454
       451: goto          384
       454: goto          568
       457: dload         8
       459: dstore        11
       461: ldc2_w        #46                 // double 100.0d
       464: aload_0
       465: invokevirtual #237                // Method getCategoryCumulativeChance:()D
       468: ddiv
       469: dstore        8
       471: dload         11
       473: dload         8
       475: ddiv
       476: dstore        11
       478: ldc           #220                // int 1000000
       480: invokestatic  #221                // Method ext/mods/commons/random/Rnd.get:(I)I
       483: i2d
       484: dstore        6
       486: aload_0
       487: invokevirtual #230                // Method getAllDrops:()Ljava/util/List;
       490: invokeinterface #121,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       495: astore        13
       497: aload         13
       499: invokeinterface #125,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       504: ifeq          568
       507: aload         13
       509: invokeinterface #131,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       514: checkcast     #36                 // class ext/mods/gameserver/model/item/DropData
       517: astore        14
       519: dload         6
       521: aload         14
       523: invokevirtual #35                 // Method ext/mods/gameserver/model/item/DropData.getChance:()D
       526: dload         8
       528: dmul
       529: ldc2_w        #188                // double 1000000.0d
       532: dmul
       533: ldc2_w        #46                 // double 100.0d
       536: ddiv
       537: dsub
       538: dstore        6
       540: dload         6
       542: dconst_0
       543: dcmpg
       544: ifge          565
       547: aload         10
       549: aload         14
       551: dload         11
       553: invokevirtual #233                // Method ext/mods/gameserver/model/item/DropData.calculateDrop:(D)Lext/mods/gameserver/model/holder/IntIntHolder;
       556: invokeinterface #29,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       561: pop
       562: goto          568
       565: goto          497
       568: aload         10
       570: areturn
      LineNumberTable:
        line 191: 0
        line 193: 32
        line 194: 42
        line 196: 68
        line 197: 78
        line 199: 104
        line 200: 114
        line 204: 140
        line 206: 149
        line 207: 161
        line 209: 167
        line 212: 171
        line 214: 179
        line 216: 189
        line 218: 199
        line 220: 232
        line 221: 250
        line 223: 276
        line 225: 285
        line 226: 297
        line 229: 314
        line 230: 333
        line 234: 339
        line 236: 356
        line 238: 365
        line 239: 373
        line 241: 406
        line 243: 427
        line 245: 434
        line 246: 448
        line 248: 451
        line 252: 457
        line 253: 461
        line 254: 471
        line 256: 478
        line 258: 486
        line 260: 519
        line 261: 540
        line 263: 547
        line 264: 562
        line 266: 565
        line 270: 568
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          164       3     8 multiplier   D
          232     101    12    dd   Lext/mods/gameserver/model/item/DropData;
          406      45    12    dd   Lext/mods/gameserver/model/item/DropData;
          519      46    14    dd   Lext/mods/gameserver/model/item/DropData;
          461     107    11 amount   D
            0     571     0  this   Lext/mods/gameserver/model/item/DropCategory;
            0     571     1 player   Lext/mods/gameserver/model/actor/Player;
            0     571     2 monster   Lext/mods/gameserver/model/actor/instance/Monster;
            0     571     3 levelMultiplier   D
            0     571     5  raid   Z
           32     539     6 chance   D
          179     392     8 multiplier   D
          189     382    10 result   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          189     382    10 result   Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
      StackMapTable: number_of_entries = 18
        frame_type = 252 /* append */
          offset_delta = 68
          locals = [ double ]
        frame_type = 35 /* same */
        frame_type = 35 /* same */
        frame_type = 26 /* same */
        frame_type = 3 /* same */
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ double ]
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 103
          locals = [ class ext/mods/gameserver/model/item/DropData ]
        frame_type = 250 /* chop */
          offset_delta = 18
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ double, class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67
        frame_type = 249 /* chop */
          offset_delta = 2
    Signature: #305                         // (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DZ)Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: invokedynamic #249,  0            // InvokeDynamic #2:get:()Ljava/util/function/Supplier;
         5: invokestatic  #252                // Method java/lang/ThreadLocal.withInitial:(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;
         8: putstatic     #48                 // Field threadLocalDropArray:Ljava/lang/ThreadLocal;
        11: return
      LineNumberTable:
        line 94: 0
}
SourceFile: "DropCategory.java"
BootstrapMethods:
  0: #335 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #317 (Ljava/lang/Object;)Z
      #318 REF_invokeStatic ext/mods/gameserver/model/item/DropCategory.lambda$calcDropItem$0:(Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/model/holder/IntIntHolder;)Z
      #321 (Lext/mods/gameserver/model/holder/IntIntHolder;)Z
  1: #335 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #323 (Ljava/lang/Object;)V
      #325 REF_invokeStatic ext/mods/gameserver/model/item/DropCategory.lambda$calcDropItem$1:([ILext/mods/gameserver/model/holder/IntIntHolder;)V
      #328 (Lext/mods/gameserver/model/holder/IntIntHolder;)V
  2: #335 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #330 ()Ljava/lang/Object;
      #331 REF_invokeStatic ext/mods/gameserver/model/item/DropCategory.lambda$static$0:()[Lext/mods/gameserver/model/item/DropData;
      #334 ()[Lext/mods/gameserver/model/item/DropData;
InnerClasses:
  public static final #347= #343 of #345; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
