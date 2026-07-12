// Bytecode for: ext.mods.Crypta.GlobalDropManager
// File: ext\mods\Crypta\GlobalDropManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/Crypta/GlobalDropManager.class
  Last modified 9 de jul de 2026; size 6333 bytes
  MD5 checksum c6e7344259f983b59a2a90726937eb16
  Compiled from "GlobalDropManager.java"
public class ext.mods.Crypta.GlobalDropManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/Crypta/GlobalDropManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 12, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/global/GlobalDropData.getInstance:()Lext/mods/global/GlobalDropData;
    #8 = Class              #10           // ext/mods/global/GlobalDropData
    #9 = NameAndType        #11:#12       // getInstance:()Lext/mods/global/GlobalDropData;
   #10 = Utf8               ext/mods/global/GlobalDropData
   #11 = Utf8               getInstance
   #12 = Utf8               ()Lext/mods/global/GlobalDropData;
   #13 = Fieldref           #14.#15       // ext/mods/Crypta/GlobalDropManager._data:Lext/mods/global/GlobalDropData;
   #14 = Class              #16           // ext/mods/Crypta/GlobalDropManager
   #15 = NameAndType        #17:#18       // _data:Lext/mods/global/GlobalDropData;
   #16 = Utf8               ext/mods/Crypta/GlobalDropManager
   #17 = Utf8               _data
   #18 = Utf8               Lext/mods/global/GlobalDropData;
   #19 = Methodref          #8.#20        // ext/mods/global/GlobalDropData.reload:()V
   #20 = NameAndType        #21:#6        // reload:()V
   #21 = Utf8               reload
   #22 = Methodref          #8.#23        // ext/mods/global/GlobalDropData.isEnabled:()Z
   #23 = NameAndType        #24:#25       // isEnabled:()Z
   #24 = Utf8               isEnabled
   #25 = Utf8               ()Z
   #26 = Methodref          #27.#28       // ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
   #27 = Class              #29           // ext/mods/gameserver/model/actor/Attackable
   #28 = NameAndType        #30:#31       // getNpcId:()I
   #29 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #30 = Utf8               getNpcId
   #31 = Utf8               ()I
   #32 = Methodref          #8.#33        // ext/mods/global/GlobalDropData.isIgnored:(I)Z
   #33 = NameAndType        #34:#35       // isIgnored:(I)Z
   #34 = Utf8               isIgnored
   #35 = Utf8               (I)Z
   #36 = Methodref          #8.#37        // ext/mods/global/GlobalDropData.isDropsOriginals:()Z
   #37 = NameAndType        #38:#25       // isDropsOriginals:()Z
   #38 = Utf8               isDropsOriginals
   #39 = Methodref          #40.#41       // ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
   #40 = Class              #42           // ext/mods/Crypta/RandomManager
   #41 = NameAndType        #11:#43       // getInstance:()Lext/mods/Crypta/RandomManager;
   #42 = Utf8               ext/mods/Crypta/RandomManager
   #43 = Utf8               ()Lext/mods/Crypta/RandomManager;
   #44 = Methodref          #40.#45       // ext/mods/Crypta/RandomManager.isEventMonster:(Lext/mods/gameserver/model/actor/Attackable;)Z
   #45 = NameAndType        #46:#47       // isEventMonster:(Lext/mods/gameserver/model/actor/Attackable;)Z
   #46 = Utf8               isEventMonster
   #47 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;)Z
   #48 = Methodref          #49.#50       // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #49 = Class              #51           // java/lang/Boolean
   #50 = NameAndType        #52:#53       // valueOf:(Z)Ljava/lang/Boolean;
   #51 = Utf8               java/lang/Boolean
   #52 = Utf8               valueOf
   #53 = Utf8               (Z)Ljava/lang/Boolean;
   #54 = Methodref          #49.#55       // java/lang/Boolean.booleanValue:()Z
   #55 = NameAndType        #56:#25       // booleanValue:()Z
   #56 = Utf8               booleanValue
   #57 = Methodref          #14.#23       // ext/mods/Crypta/GlobalDropManager.isEnabled:()Z
   #58 = Methodref          #14.#59       // ext/mods/Crypta/GlobalDropManager.isIgnored:(Lext/mods/gameserver/model/actor/Attackable;)Z
   #59 = NameAndType        #34:#47       // isIgnored:(Lext/mods/gameserver/model/actor/Attackable;)Z
   #60 = Methodref          #14.#37       // ext/mods/Crypta/GlobalDropManager.isDropsOriginals:()Z
   #61 = Methodref          #8.#62        // ext/mods/global/GlobalDropData.getMinLevel:()I
   #62 = NameAndType        #63:#31       // getMinLevel:()I
   #63 = Utf8               getMinLevel
   #64 = Methodref          #8.#65        // ext/mods/global/GlobalDropData.getMaxLevel:()I
   #65 = NameAndType        #66:#31       // getMaxLevel:()I
   #66 = Utf8               getMaxLevel
   #67 = Methodref          #27.#68       // ext/mods/gameserver/model/actor/Attackable.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #68 = NameAndType        #69:#70       // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #69 = Utf8               getStatus
   #70 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #71 = Methodref          #72.#73       // ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
   #72 = Class              #74           // ext/mods/gameserver/model/actor/status/AttackableStatus
   #73 = NameAndType        #75:#31       // getLevel:()I
   #74 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
   #75 = Utf8               getLevel
   #76 = Methodref          #8.#77        // ext/mods/global/GlobalDropData.getDrops:()Ljava/util/List;
   #77 = NameAndType        #78:#79       // getDrops:()Ljava/util/List;
   #78 = Utf8               getDrops
   #79 = Utf8               ()Ljava/util/List;
   #80 = InterfaceMethodref #81.#82       // java/util/List.isEmpty:()Z
   #81 = Class              #83           // java/util/List
   #82 = NameAndType        #84:#25       // isEmpty:()Z
   #83 = Utf8               java/util/List
   #84 = Utf8               isEmpty
   #85 = Methodref          #8.#86        // ext/mods/global/GlobalDropData.getChanceMultiplier:()D
   #86 = NameAndType        #87:#88       // getChanceMultiplier:()D
   #87 = Utf8               getChanceMultiplier
   #88 = Utf8               ()D
   #89 = Methodref          #90.#91       // java/lang/Math.max:(DD)D
   #90 = Class              #92           // java/lang/Math
   #91 = NameAndType        #93:#94       // max:(DD)D
   #92 = Utf8               java/lang/Math
   #93 = Utf8               max
   #94 = Utf8               (DD)D
   #95 = Methodref          #8.#96        // ext/mods/global/GlobalDropData.isUseServerRates:()Z
   #96 = NameAndType        #97:#25       // isUseServerRates:()Z
   #97 = Utf8               isUseServerRates
   #98 = Methodref          #99.#100      // ext/mods/gameserver/custom/data/RatesData.getInstance:()Lext/mods/gameserver/custom/data/RatesData;
   #99 = Class              #101          // ext/mods/gameserver/custom/data/RatesData
  #100 = NameAndType        #11:#102      // getInstance:()Lext/mods/gameserver/custom/data/RatesData;
  #101 = Utf8               ext/mods/gameserver/custom/data/RatesData
  #102 = Utf8               ()Lext/mods/gameserver/custom/data/RatesData;
  #103 = Methodref          #104.#105     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #104 = Class              #106          // ext/mods/gameserver/model/actor/Player
  #105 = NameAndType        #69:#107      // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #106 = Utf8               ext/mods/gameserver/model/actor/Player
  #107 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #108 = Methodref          #109.#73      // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #109 = Class              #110          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #110 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #111 = Methodref          #99.#112      // ext/mods/gameserver/custom/data/RatesData.getRates:(I)Lext/mods/gameserver/model/records/custom/RatesHolder;
  #112 = NameAndType        #113:#114     // getRates:(I)Lext/mods/gameserver/model/records/custom/RatesHolder;
  #113 = Utf8               getRates
  #114 = Utf8               (I)Lext/mods/gameserver/model/records/custom/RatesHolder;
  #115 = Methodref          #116.#117     // ext/mods/gameserver/model/records/custom/RatesHolder.getDropRate:()F
  #116 = Class              #118          // ext/mods/gameserver/model/records/custom/RatesHolder
  #117 = NameAndType        #119:#120     // getDropRate:()F
  #118 = Utf8               ext/mods/gameserver/model/records/custom/RatesHolder
  #119 = Utf8               getDropRate
  #120 = Utf8               ()F
  #121 = InterfaceMethodref #81.#122      // java/util/List.iterator:()Ljava/util/Iterator;
  #122 = NameAndType        #123:#124     // iterator:()Ljava/util/Iterator;
  #123 = Utf8               iterator
  #124 = Utf8               ()Ljava/util/Iterator;
  #125 = InterfaceMethodref #126.#127     // java/util/Iterator.hasNext:()Z
  #126 = Class              #128          // java/util/Iterator
  #127 = NameAndType        #129:#25      // hasNext:()Z
  #128 = Utf8               java/util/Iterator
  #129 = Utf8               hasNext
  #130 = InterfaceMethodref #126.#131     // java/util/Iterator.next:()Ljava/lang/Object;
  #131 = NameAndType        #132:#133     // next:()Ljava/lang/Object;
  #132 = Utf8               next
  #133 = Utf8               ()Ljava/lang/Object;
  #134 = Class              #135          // ext/mods/FarmEventRandom/holder/DropHolder
  #135 = Utf8               ext/mods/FarmEventRandom/holder/DropHolder
  #136 = Methodref          #134.#137     // ext/mods/FarmEventRandom/holder/DropHolder.getChance:()I
  #137 = NameAndType        #138:#31      // getChance:()I
  #138 = Utf8               getChance
  #139 = Methodref          #90.#140      // java/lang/Math.max:(II)I
  #140 = NameAndType        #93:#141      // max:(II)I
  #141 = Utf8               (II)I
  #142 = Double             100.0d
  #144 = Methodref          #90.#145      // java/lang/Math.round:(D)J
  #145 = NameAndType        #146:#147     // round:(D)J
  #146 = Utf8               round
  #147 = Utf8               (D)J
  #148 = Methodref          #90.#149      // java/lang/Math.min:(DD)D
  #149 = NameAndType        #150:#94      // min:(DD)D
  #150 = Utf8               min
  #151 = Methodref          #152.#153     // ext/mods/commons/random/Rnd.get:(I)I
  #152 = Class              #154          // ext/mods/commons/random/Rnd
  #153 = NameAndType        #155:#156     // get:(I)I
  #154 = Utf8               ext/mods/commons/random/Rnd
  #155 = Utf8               get
  #156 = Utf8               (I)I
  #157 = Fieldref           #158.#159     // ext/mods/Config.DEVELOPER:Z
  #158 = Class              #160          // ext/mods/Config
  #159 = NameAndType        #161:#162     // DEVELOPER:Z
  #160 = Utf8               ext/mods/Config
  #161 = Utf8               DEVELOPER
  #162 = Utf8               Z
  #163 = Fieldref           #14.#164      // ext/mods/Crypta/GlobalDropManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #164 = NameAndType        #165:#166     // LOGGER:Lext/mods/commons/logging/CLogger;
  #165 = Utf8               LOGGER
  #166 = Utf8               Lext/mods/commons/logging/CLogger;
  #167 = Methodref          #134.#168     // ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
  #168 = NameAndType        #169:#31      // getItemId:()I
  #169 = Utf8               getItemId
  #170 = InvokeDynamic      #0:#171       // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #171 = NameAndType        #172:#173     // makeConcatWithConstants:(II)Ljava/lang/String;
  #172 = Utf8               makeConcatWithConstants
  #173 = Utf8               (II)Ljava/lang/String;
  #174 = Methodref          #175.#176     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #175 = Class              #177          // ext/mods/commons/logging/CLogger
  #176 = NameAndType        #178:#179     // info:(Ljava/lang/Object;)V
  #177 = Utf8               ext/mods/commons/logging/CLogger
  #178 = Utf8               info
  #179 = Utf8               (Ljava/lang/Object;)V
  #180 = Methodref          #134.#181     // ext/mods/FarmEventRandom/holder/DropHolder.getCount:()I
  #181 = NameAndType        #182:#31      // getCount:()I
  #182 = Utf8               getCount
  #183 = Methodref          #104.#184     // ext/mods/gameserver/model/actor/Player.isInParty:()Z
  #184 = NameAndType        #185:#25      // isInParty:()Z
  #185 = Utf8               isInParty
  #186 = Methodref          #104.#187     // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #187 = NameAndType        #188:#189     // getParty:()Lext/mods/gameserver/model/group/Party;
  #188 = Utf8               getParty
  #189 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #190 = Methodref          #191.#192     // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
  #191 = Class              #193          // ext/mods/gameserver/model/group/Party
  #192 = NameAndType        #194:#79      // getMembers:()Ljava/util/List;
  #193 = Utf8               ext/mods/gameserver/model/group/Party
  #194 = Utf8               getMembers
  #195 = InterfaceMethodref #81.#196      // java/util/List.size:()I
  #196 = NameAndType        #197:#31      // size:()I
  #197 = Utf8               size
  #198 = Methodref          #104.#199     // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #199 = NameAndType        #200:#201     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #200 = Utf8               addItem
  #201 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #202 = Methodref          #104.#203     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #203 = NameAndType        #204:#25      // isOnline:()Z
  #204 = Utf8               isOnline
  #205 = Fieldref           #158.#206     // ext/mods/Config.PARTY_RANGE:I
  #206 = NameAndType        #207:#208     // PARTY_RANGE:I
  #207 = Utf8               PARTY_RANGE
  #208 = Utf8               I
  #209 = Methodref          #104.#210     // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #210 = NameAndType        #211:#212     // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #211 = Utf8               isIn3DRadius
  #212 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #213 = InvokeDynamic      #1:#171       // #1:makeConcatWithConstants:(II)Ljava/lang/String;
  #214 = Fieldref           #215.#216     // ext/mods/Crypta/GlobalDropManager$SingletonHolder._instance:Lext/mods/Crypta/GlobalDropManager;
  #215 = Class              #217          // ext/mods/Crypta/GlobalDropManager$SingletonHolder
  #216 = NameAndType        #218:#219     // _instance:Lext/mods/Crypta/GlobalDropManager;
  #217 = Utf8               ext/mods/Crypta/GlobalDropManager$SingletonHolder
  #218 = Utf8               _instance
  #219 = Utf8               Lext/mods/Crypta/GlobalDropManager;
  #220 = Methodref          #221.#222     // java/lang/Class.getName:()Ljava/lang/String;
  #221 = Class              #223          // java/lang/Class
  #222 = NameAndType        #224:#225     // getName:()Ljava/lang/String;
  #223 = Utf8               java/lang/Class
  #224 = Utf8               getName
  #225 = Utf8               ()Ljava/lang/String;
  #226 = Methodref          #175.#227     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #227 = NameAndType        #5:#228       // "<init>":(Ljava/lang/String;)V
  #228 = Utf8               (Ljava/lang/String;)V
  #229 = Utf8               Code
  #230 = Utf8               LineNumberTable
  #231 = Utf8               LocalVariableTable
  #232 = Utf8               this
  #233 = Utf8               monster
  #234 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #235 = Utf8               StackMapTable
  #236 = Utf8               shouldCancelOriginalDrop
  #237 = Utf8               result
  #238 = Utf8               Ljava/lang/Object;
  #239 = Utf8               randomManagerInstance
  #240 = Utf8               onKill
  #241 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Attackable;)V
  #242 = Utf8               rates
  #243 = Utf8               Lext/mods/gameserver/model/records/custom/RatesHolder;
  #244 = Utf8               amount
  #245 = Utf8               member
  #246 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #247 = Utf8               members
  #248 = Utf8               Ljava/util/List;
  #249 = Utf8               baseAmount
  #250 = Utf8               remainder
  #251 = Utf8               totalAmount
  #252 = Utf8               baseChance
  #253 = Utf8               effectiveChance
  #254 = Utf8               drop
  #255 = Utf8               Lext/mods/FarmEventRandom/holder/DropHolder;
  #256 = Utf8               player
  #257 = Utf8               minLevel
  #258 = Utf8               maxLevel
  #259 = Utf8               monsterLevel
  #260 = Utf8               drops
  #261 = Utf8               chanceMultiplier
  #262 = Utf8               D
  #263 = Utf8               LocalVariableTypeTable
  #264 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #265 = Utf8               Ljava/util/List<Lext/mods/FarmEventRandom/holder/DropHolder;>;
  #266 = Utf8               getActiveRateXp
  #267 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;)D
  #268 = Utf8               getActiveRateSp
  #269 = Utf8               getActiveRateAdena
  #270 = Utf8               ()Lext/mods/Crypta/GlobalDropManager;
  #271 = Utf8               <clinit>
  #272 = Utf8               SourceFile
  #273 = Utf8               GlobalDropManager.java
  #274 = Utf8               NestMembers
  #275 = Utf8               BootstrapMethods
  #276 = String             #277          // [Debug GlobalDrop] SUCCESS! Dropping item \u0001 (Chance: \u0001)
  #277 = Utf8               [Debug GlobalDrop] SUCCESS! Dropping item \u0001 (Chance: \u0001)
  #278 = String             #279          // [Debug GlobalDrop] FAILED drop for item \u0001 (Chance: \u0001)
  #279 = Utf8               [Debug GlobalDrop] FAILED drop for item \u0001 (Chance: \u0001)
  #280 = MethodHandle       6:#281        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #281 = Methodref          #282.#283     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #282 = Class              #284          // java/lang/invoke/StringConcatFactory
  #283 = NameAndType        #172:#285     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #284 = Utf8               java/lang/invoke/StringConcatFactory
  #285 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #286 = Utf8               InnerClasses
  #287 = Utf8               SingletonHolder
  #288 = Class              #289          // java/lang/invoke/MethodHandles$Lookup
  #289 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #290 = Class              #291          // java/lang/invoke/MethodHandles
  #291 = Utf8               java/lang/invoke/MethodHandles
  #292 = Utf8               Lookup
{
  public static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public ext.mods.Crypta.GlobalDropManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokestatic  #7                  // Method ext/mods/global/GlobalDropData.getInstance:()Lext/mods/global/GlobalDropData;
         8: putfield      #13                 // Field _data:Lext/mods/global/GlobalDropData;
        11: return
      LineNumberTable:
        line 33: 0
        line 36: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/Crypta/GlobalDropManager;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _data:Lext/mods/global/GlobalDropData;
         4: invokevirtual #19                 // Method ext/mods/global/GlobalDropData.reload:()V
         7: return
      LineNumberTable:
        line 40: 0
        line 41: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/Crypta/GlobalDropManager;

  public boolean isEnabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _data:Lext/mods/global/GlobalDropData;
         4: invokevirtual #22                 // Method ext/mods/global/GlobalDropData.isEnabled:()Z
         7: ireturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/Crypta/GlobalDropManager;

  public boolean isIgnored(ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_1
         5: ireturn
         6: aload_0
         7: getfield      #13                 // Field _data:Lext/mods/global/GlobalDropData;
        10: aload_1
        11: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
        14: invokevirtual #32                 // Method ext/mods/global/GlobalDropData.isIgnored:(I)Z
        17: ireturn
      LineNumberTable:
        line 50: 0
        line 51: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/Crypta/GlobalDropManager;
            0      18     1 monster   Lext/mods/gameserver/model/actor/Attackable;
      StackMapTable: number_of_entries = 1
        frame_type = 6 /* same */

  public boolean isDropsOriginals();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _data:Lext/mods/global/GlobalDropData;
         4: invokevirtual #36                 // Method ext/mods/global/GlobalDropData.isDropsOriginals:()Z
         7: ireturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/Crypta/GlobalDropManager;

  public boolean shouldCancelOriginalDrop(ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: invokestatic  #39                 // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
         3: astore_2
         4: aload_2
         5: ifnull        38
         8: invokestatic  #39                 // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
        11: aload_1
        12: invokevirtual #44                 // Method ext/mods/Crypta/RandomManager.isEventMonster:(Lext/mods/gameserver/model/actor/Attackable;)Z
        15: invokestatic  #48                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        18: astore_3
        19: aload_3
        20: instanceof    #49                 // class java/lang/Boolean
        23: ifeq          38
        26: aload_3
        27: checkcast     #49                 // class java/lang/Boolean
        30: invokevirtual #54                 // Method java/lang/Boolean.booleanValue:()Z
        33: ifeq          38
        36: iconst_0
        37: ireturn
        38: aload_0
        39: invokevirtual #57                 // Method isEnabled:()Z
        42: ifeq          53
        45: aload_0
        46: aload_1
        47: invokevirtual #58                 // Method isIgnored:(Lext/mods/gameserver/model/actor/Attackable;)Z
        50: ifeq          55
        53: iconst_0
        54: ireturn
        55: aload_0
        56: invokevirtual #60                 // Method isDropsOriginals:()Z
        59: ifne          66
        62: iconst_1
        63: goto          67
        66: iconst_0
        67: ireturn
      LineNumberTable:
        line 64: 0
        line 65: 4
        line 66: 8
        line 67: 19
        line 68: 36
        line 72: 38
        line 74: 53
        line 77: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19      19     3 result   Ljava/lang/Object;
            0      68     0  this   Lext/mods/Crypta/GlobalDropManager;
            0      68     1 monster   Lext/mods/gameserver/model/actor/Attackable;
            4      64     2 randomManagerInstance   Ljava/lang/Object;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class java/lang/Object ]
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 10 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void onKill(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Attackable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=22, args_size=3
         0: invokestatic  #39                 // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
         3: astore_3
         4: aload_3
         5: ifnull        40
         8: invokestatic  #39                 // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
        11: aload_2
        12: invokevirtual #44                 // Method ext/mods/Crypta/RandomManager.isEventMonster:(Lext/mods/gameserver/model/actor/Attackable;)Z
        15: invokestatic  #48                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        18: astore        4
        20: aload         4
        22: instanceof    #49                 // class java/lang/Boolean
        25: ifeq          40
        28: aload         4
        30: checkcast     #49                 // class java/lang/Boolean
        33: invokevirtual #54                 // Method java/lang/Boolean.booleanValue:()Z
        36: ifeq          40
        39: return
        40: aload_1
        41: ifnull        59
        44: aload_0
        45: invokevirtual #57                 // Method isEnabled:()Z
        48: ifeq          59
        51: aload_0
        52: aload_2
        53: invokevirtual #58                 // Method isIgnored:(Lext/mods/gameserver/model/actor/Attackable;)Z
        56: ifeq          60
        59: return
        60: aload_0
        61: getfield      #13                 // Field _data:Lext/mods/global/GlobalDropData;
        64: invokevirtual #61                 // Method ext/mods/global/GlobalDropData.getMinLevel:()I
        67: istore        4
        69: aload_0
        70: getfield      #13                 // Field _data:Lext/mods/global/GlobalDropData;
        73: invokevirtual #64                 // Method ext/mods/global/GlobalDropData.getMaxLevel:()I
        76: istore        5
        78: aload_2
        79: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Attackable.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        82: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
        85: istore        6
        87: iload         6
        89: iload         4
        91: if_icmpge     95
        94: return
        95: iload         5
        97: ifle          108
       100: iload         6
       102: iload         5
       104: if_icmple     108
       107: return
       108: aload_0
       109: getfield      #13                 // Field _data:Lext/mods/global/GlobalDropData;
       112: invokevirtual #76                 // Method ext/mods/global/GlobalDropData.getDrops:()Ljava/util/List;
       115: astore        7
       117: aload         7
       119: ifnull        132
       122: aload         7
       124: invokeinterface #80,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       129: ifeq          133
       132: return
       133: dconst_0
       134: aload_0
       135: getfield      #13                 // Field _data:Lext/mods/global/GlobalDropData;
       138: invokevirtual #85                 // Method ext/mods/global/GlobalDropData.getChanceMultiplier:()D
       141: invokestatic  #89                 // Method java/lang/Math.max:(DD)D
       144: dstore        8
       146: aload_0
       147: getfield      #13                 // Field _data:Lext/mods/global/GlobalDropData;
       150: invokevirtual #95                 // Method ext/mods/global/GlobalDropData.isUseServerRates:()Z
       153: ifeq          191
       156: invokestatic  #98                 // Method ext/mods/gameserver/custom/data/RatesData.getInstance:()Lext/mods/gameserver/custom/data/RatesData;
       159: aload_1
       160: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       163: invokevirtual #108                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       166: invokevirtual #111                // Method ext/mods/gameserver/custom/data/RatesData.getRates:(I)Lext/mods/gameserver/model/records/custom/RatesHolder;
       169: astore        10
       171: aload         10
       173: ifnull        191
       176: dload         8
       178: dconst_0
       179: aload         10
       181: invokevirtual #115                // Method ext/mods/gameserver/model/records/custom/RatesHolder.getDropRate:()F
       184: f2d
       185: invokestatic  #89                 // Method java/lang/Math.max:(DD)D
       188: dmul
       189: dstore        8
       191: aload         7
       193: invokeinterface #121,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       198: astore        10
       200: aload         10
       202: invokeinterface #125,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       207: ifeq          521
       210: aload         10
       212: invokeinterface #130,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       217: checkcast     #134                // class ext/mods/FarmEventRandom/holder/DropHolder
       220: astore        11
       222: iconst_0
       223: aload         11
       225: invokevirtual #136                // Method ext/mods/FarmEventRandom/holder/DropHolder.getChance:()I
       228: invokestatic  #139                // Method java/lang/Math.max:(II)I
       231: istore        12
       233: ldc2_w        #142                // double 100.0d
       236: iload         12
       238: i2d
       239: dload         8
       241: dmul
       242: invokestatic  #144                // Method java/lang/Math.round:(D)J
       245: l2d
       246: invokestatic  #148                // Method java/lang/Math.min:(DD)D
       249: d2i
       250: istore        13
       252: bipush        100
       254: invokestatic  #151                // Method ext/mods/commons/random/Rnd.get:(I)I
       257: iload         13
       259: if_icmpge     494
       262: getstatic     #157                // Field ext/mods/Config.DEVELOPER:Z
       265: ifeq          286
       268: getstatic     #163                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       271: aload         11
       273: invokevirtual #167                // Method ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
       276: iload         13
       278: invokedynamic #170,  0            // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
       283: invokevirtual #174                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       286: aload         11
       288: invokevirtual #180                // Method ext/mods/FarmEventRandom/holder/DropHolder.getCount:()I
       291: istore        14
       293: aload_1
       294: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
       297: ifeq          478
       300: aload_1
       301: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       304: invokevirtual #190                // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       307: astore        15
       309: aload         15
       311: invokeinterface #195,  1          // InterfaceMethod java/util/List.size:()I
       316: istore        16
       318: iload         16
       320: ifne          339
       323: aload_1
       324: aload         11
       326: invokevirtual #167                // Method ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
       329: iload         14
       331: iconst_1
       332: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       335: pop
       336: goto          200
       339: iload         14
       341: iload         16
       343: idiv
       344: istore        17
       346: iload         14
       348: iload         16
       350: irem
       351: istore        18
       353: aload         15
       355: invokeinterface #121,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       360: astore        19
       362: aload         19
       364: invokeinterface #125,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       369: ifeq          457
       372: aload         19
       374: invokeinterface #130,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       379: checkcast     #104                // class ext/mods/gameserver/model/actor/Player
       382: astore        20
       384: aload         20
       386: ifnull        446
       389: aload         20
       391: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       394: ifeq          446
       397: aload_1
       398: aload         20
       400: getstatic     #205                // Field ext/mods/Config.PARTY_RANGE:I
       403: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       406: ifeq          446
       409: iload         17
       411: istore        21
       413: iload         18
       415: ifle          424
       418: iinc          21, 1
       421: iinc          18, -1
       424: iload         21
       426: ifle          443
       429: aload         20
       431: aload         11
       433: invokevirtual #167                // Method ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
       436: iload         21
       438: iconst_1
       439: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       442: pop
       443: goto          454
       446: iload         18
       448: ifle          454
       451: iinc          18, -1
       454: goto          362
       457: iload         18
       459: ifle          475
       462: aload_1
       463: aload         11
       465: invokevirtual #167                // Method ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
       468: iload         18
       470: iconst_1
       471: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       474: pop
       475: goto          491
       478: aload_1
       479: aload         11
       481: invokevirtual #167                // Method ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
       484: iload         14
       486: iconst_1
       487: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       490: pop
       491: goto          518
       494: getstatic     #157                // Field ext/mods/Config.DEVELOPER:Z
       497: ifeq          518
       500: getstatic     #163                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       503: aload         11
       505: invokevirtual #167                // Method ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
       508: iload         13
       510: invokedynamic #213,  0            // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
       515: invokevirtual #174                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       518: goto          200
       521: return
      LineNumberTable:
        line 85: 0
        line 86: 4
        line 87: 8
        line 88: 20
        line 89: 39
        line 93: 40
        line 95: 59
        line 98: 60
        line 99: 69
        line 100: 78
        line 101: 87
        line 102: 94
        line 104: 95
        line 105: 107
        line 107: 108
        line 108: 117
        line 110: 132
        line 113: 133
        line 114: 146
        line 116: 156
        line 117: 171
        line 118: 176
        line 121: 191
        line 123: 222
        line 124: 233
        line 125: 252
        line 127: 262
        line 129: 286
        line 130: 293
        line 132: 300
        line 133: 309
        line 134: 318
        line 136: 339
        line 137: 346
        line 139: 353
        line 141: 384
        line 143: 409
        line 144: 413
        line 145: 424
        line 146: 443
        line 147: 451
        line 149: 454
        line 150: 457
        line 151: 475
        line 154: 478
        line 156: 491
        line 157: 494
        line 159: 500
        line 161: 518
        line 162: 521
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20      20     4 result   Ljava/lang/Object;
          171      20    10 rates   Lext/mods/gameserver/model/records/custom/RatesHolder;
          413      30    21 amount   I
          384      70    20 member   Lext/mods/gameserver/model/actor/Player;
          309     166    15 members   Ljava/util/List;
          318     157    16  size   I
          346     129    17 baseAmount   I
          353     122    18 remainder   I
          293     198    14 totalAmount   I
          233     285    12 baseChance   I
          252     266    13 effectiveChance   I
          222     296    11  drop   Lext/mods/FarmEventRandom/holder/DropHolder;
            0     522     0  this   Lext/mods/Crypta/GlobalDropManager;
            0     522     1 player   Lext/mods/gameserver/model/actor/Player;
            0     522     2 monster   Lext/mods/gameserver/model/actor/Attackable;
            4     518     3 randomManagerInstance   Ljava/lang/Object;
           69     453     4 minLevel   I
           78     444     5 maxLevel   I
           87     435     6 monsterLevel   I
          117     405     7 drops   Ljava/util/List;
          146     376     8 chanceMultiplier   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          309     166    15 members   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
          117     405     7 drops   Ljava/util/List<Lext/mods/FarmEventRandom/holder/DropHolder;>;
      StackMapTable: number_of_entries = 23
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class java/lang/Object ]
        frame_type = 18 /* same */
        frame_type = 0 /* same */
        frame_type = 254 /* append */
          offset_delta = 34
          locals = [ int, int, int ]
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/util/List ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 57
          locals = [ double ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 85
          locals = [ class ext/mods/FarmEventRandom/holder/DropHolder, int, int ]
        frame_type = 254 /* append */
          offset_delta = 52
          locals = [ int, class java/util/List, int ]
        frame_type = 254 /* append */
          offset_delta = 22
          locals = [ int, int, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 250 /* chop */
          offset_delta = 18
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/Crypta/GlobalDropManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Attackable, class java/lang/Object, int, int, int, class java/util/List, double, class java/util/Iterator, class ext/mods/FarmEventRandom/holder/DropHolder, int, int, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 2 /* same */
        frame_type = 248 /* chop */
          offset_delta = 23
        frame_type = 250 /* chop */
          offset_delta = 2

  public double getActiveRateXp(ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: dconst_1
         1: dreturn
      LineNumberTable:
        line 165: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/Crypta/GlobalDropManager;
            0       2     1 monster   Lext/mods/gameserver/model/actor/Attackable;

  public double getActiveRateSp(ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: dconst_1
         1: dreturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/Crypta/GlobalDropManager;
            0       2     1 monster   Lext/mods/gameserver/model/actor/Attackable;

  public double getActiveRateAdena(ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: dconst_1
         1: dreturn
      LineNumberTable:
        line 167: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/Crypta/GlobalDropManager;
            0       2     1 monster   Lext/mods/gameserver/model/actor/Attackable;

  public static ext.mods.Crypta.GlobalDropManager getInstance();
    descriptor: ()Lext/mods/Crypta/GlobalDropManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #214                // Field ext/mods/Crypta/GlobalDropManager$SingletonHolder._instance:Lext/mods/Crypta/GlobalDropManager;
         3: areturn
      LineNumberTable:
        line 172: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #175                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #14                 // class ext/mods/Crypta/GlobalDropManager
         6: invokevirtual #220                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #226                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #163                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 35: 0
}
SourceFile: "GlobalDropManager.java"
NestMembers:
  ext/mods/Crypta/GlobalDropManager$SingletonHolder
BootstrapMethods:
  0: #280 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #276 [Debug GlobalDrop] SUCCESS! Dropping item \u0001 (Chance: \u0001)
  1: #280 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #278 [Debug GlobalDrop] FAILED drop for item \u0001 (Chance: \u0001)
InnerClasses:
  public static final #292= #288 of #290; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
